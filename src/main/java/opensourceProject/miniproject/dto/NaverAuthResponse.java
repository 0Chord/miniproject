package opensourceProject.miniproject.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NaverAuthResponse {

    @JsonProperty("access_token")
    private String accessToken;
    @JsonProperty("refresth_token")
    private String refreshToken;

    public NaverAuthResponse(String accessToken, String refreshToken) {
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
    }

    public NaverAuthResponse() {
    }

    public String getAccessToken() {
        return accessToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    @Override
    public String toString() {
        return "NaverAuthResponse{" +
                "accessToken='" + accessToken + '\'' +
                ", refreshToken='" + refreshToken + '\'' +
                '}';
    }
}
