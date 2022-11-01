package opensourceProject.miniproject.dto;

public class KakaoUserBasicInfo {

    private String id;
    private String nickname;

    public KakaoUserBasicInfo(String id, String nickname) {
        this.id = id;
        this.nickname = nickname;
    }

    public KakaoUserBasicInfo() {
    }

    public String getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }

    @Override
    public String toString() {
        return "KakaoUserBasicInfo{" +
                "id='" + id + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
