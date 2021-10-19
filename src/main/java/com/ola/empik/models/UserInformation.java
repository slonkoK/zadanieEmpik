package com.ola.empik.models;

import lombok.Data;

@Data
public class UserInformation {
    private String id;
    private String login;
    private String name;
    private String type;
    private String avatarUrl;
    private String createdAt;
    private String calculations;

}
