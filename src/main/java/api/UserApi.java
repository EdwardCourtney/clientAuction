package api;

import dto.request.*;
import dto.response.*;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface UserApi {

    @POST("login")
    Call<AuthResponse> signIn(@Body SignInRequest request);
}
