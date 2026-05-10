package dto.request;

public class SignInRequest {

    private String username;
    private String displayName;
    private String password;

    public SignInRequest(String username, String displayName, String password) {
        this.username = username;
        this.displayName = displayName;
        this.password = password;
    }
}
