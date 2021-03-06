package ru.voronasever.voronaStore.payload.response;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class JwtResponse {
    private String token;
    private String type = "Bearer";
    private Integer id;
    private String username;
    private String email;
    private List<String> roles;

    public JwtResponse(String token, Integer id, String username, String email, List<String> roles) {
        this.token = token;
        this.id = id;
        this.email = email;
        this.username = username;
        this.roles = roles;
    }

}
