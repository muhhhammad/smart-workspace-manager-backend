package com.fs.swm.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class LoginRequest {

    @NotBlank
    @NotNull
    private String username;

    @NotBlank
    @NotNull
    private String password;

}
