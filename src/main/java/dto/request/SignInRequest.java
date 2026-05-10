package dto.request;

public class SignInRequest {

    private String username;
    private String password;

    public SignInRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
