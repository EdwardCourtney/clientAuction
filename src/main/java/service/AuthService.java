package service;

import api.UserApi;
import dto.request.*;
import dto.response.*;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AuthService {

    private UserApi api;

    public AuthService(UserApi api) {
        this.api = api;
    }

    public void login(String username, String password) {

        SignInRequest request = new SignInRequest(username, password);

        api.signIn(request)
                .enqueue(new Callback<AuthResponse>() {

                    @Override
                    public void onResponse(Call<AuthResponse> call, Response<AuthResponse> response) {
                        if (response.isSuccessful() && response.body() != null) {
                            // ✅ Login thành công
                            String token = response.body().getToken();
                            String message = response.body().getMessage();

                            System.out.println("Token nhận được: " + token);


                        } else {
                            // ❌ Server trả về lỗi (sai password, không tìm thấy user...)
                            System.out.println("Lỗi: " + response.code());
                            // 401 = sai password, 404 = không tìm thấy user...
                        }
                    }

                    @Override
                    public void onFailure(Call<AuthResponse> call, Throwable t) {}
                });
    }
}
