package opensourceProject.miniproject.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NaverUserInfo {
    @JsonProperty("resultcode")
    private String resultCode;

    private String message;

    private NaverUserResponse response;

    public NaverUserInfo() {
    }

    public NaverUserInfo(String resultCode, String message, NaverUserResponse response) {
        this.resultCode = resultCode;
        this.message = message;
        this.response = response;
    }

    public String getResultCode() {
        return resultCode;
    }

    public String getMessage() {
        return message;
    }

    public NaverUserResponse getResponse() {
        return response;
    }

    @Override
    public String toString() {
        return "NaverUserInfo{" +
                "resultCode='" + resultCode + '\'' +
                ", message='" + message + '\'' +
                ", response=" + response +
                '}';
    }
}
