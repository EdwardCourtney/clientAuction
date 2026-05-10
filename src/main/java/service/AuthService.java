package service;

import api.UserApi;
import dto.request.*;
import dto.response.*;
import retrofit2.Callback;

public class AuthService {

    private UserApi api;

    public AuthService(UserApi api) {
        this.api = api;
    }

    public void login(String username, String password) {

        SignInRequest request =
                new SignInRequest(username, password);

        api.signIn(request)
                .enqueue(new Callback<AuthResponse>() {

                    @Override
                    public void onResponse(Call<AuthResponse> call, Response<AuthResponse> response) {
                        // xử lý token ở đây
                    }

                    @Override
                    public void onFailure(Call<AuthResponse> call, Throwable t) {}
                });
    }
}
