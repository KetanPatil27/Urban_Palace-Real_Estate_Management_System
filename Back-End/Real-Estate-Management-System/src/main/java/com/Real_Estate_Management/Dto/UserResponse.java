package com.Real_Estate_Management.Dto;

import lombok.Data;

@Data
public class UserResponse {

	private Long id;
    private String name;
    private String email;
    private String phone;
    private String role;
}
