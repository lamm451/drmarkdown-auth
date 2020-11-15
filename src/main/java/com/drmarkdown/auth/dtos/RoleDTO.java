package com.drmarkdown.auth.dtos;

import lombok.Data;

import java.util.Date;

@Data
public class RoleDTO {
    private String role;
    private Date createdAt;
    private Date updatedAt;
}
