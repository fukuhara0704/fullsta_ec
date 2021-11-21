package com.example.ec.controller.admin.ec001;

import java.time.LocalDate;

import lombok.Data;

@Data
public class UserInfoDisplay {
    /** 利用者Id */
    private String userId;
    /** 利用者名 */
    private String userName;
    /** 生年月日 */
    private LocalDate birthDate;
    /** 住所 */
    private String address;
    /** メールアドレス */
    private String mailAddress;
}
