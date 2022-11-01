package opensourceProject.miniproject.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public class KakaoUserInfo {

    private Long id;

    @JsonProperty("connected_at")
    private LocalDateTime connectedAt;

    private KakaoUserProperties properties;

    @JsonProperty("kakao_account")
    private KakaoUserAccount kakaoAccount;

    public KakaoUserInfo() {
    }

    public KakaoUserInfo(Long id, LocalDateTime connectedAt, KakaoUserProperties properties, KakaoUserAccount kakaoAccount) {
        this.id = id;
        this.connectedAt = connectedAt;
        this.properties = properties;
        this.kakaoAccount = kakaoAccount;
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getConnectedAt() {
        return connectedAt;
    }

    public KakaoUserProperties getProperties() {
        return properties;
    }

    public KakaoUserAccount getKakaoAccount() {
        return kakaoAccount;
    }

    @Override
    public String toString() {
        return "KakaoUserInfo{" +
                "id=" + id +
                ", connectedAt=" + connectedAt +
                ", properties=" + properties +
                ", kakaoAccount=" + kakaoAccount +
                '}';
    }
}
