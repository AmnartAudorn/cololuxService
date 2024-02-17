package com.cololux.service.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDto implements Serializable {
    private String userId;
    private String username;
    private String password;

    public UserDto(String userId, String username, String password) {
        super();
        this.userId = userId;
        this.username = username;
        this.password = password;
    }
}
