package opensourceProject.miniproject.dto;

public class NaverUserResponse {

    private String id;

    private String nickname;

    private String email;

    private String name;

    public NaverUserResponse() {
    }

    public NaverUserResponse(String id, String nickname, String email, String name) {
        this.id = id;
        this.nickname = nickname;
        this.email = email;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "NaverUserResponse{" +
                "id='" + id + '\'' +
                ", nickname='" + nickname + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
