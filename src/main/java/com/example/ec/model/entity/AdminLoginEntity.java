package com.example.ec.model.entity;

import lombok.Data;
import javax.validation.constraints.NotNull;

@Data
public class AdminLoginEntity {
    @NotNull
    /** ユーザーID */
    private String userId;
    @NotNull
    /** パスワード */
    private String password;
}
