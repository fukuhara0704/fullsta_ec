package com.example.ec.model.entity;

import java.time.LocalDate;
import lombok.Data;
/**
 * 利用者テーブル用のエンティティクラス
 */
@Data
public class UserEntity {
    /** 利用者Id */
    private Integer userId;
    /** 姓 */
    private String familyName;
    /** 名 */
    private String firstName;
    /** 姓（カナ） */
    private String familyNameKana;
    /** 名（カナ） */
    private String firstNameKana;
    /** 生年月日 */
    private LocalDate birthDate;
    /** 都道府県*/
    private String prefectures;
    /** 市町村*/
    private String cities;
    /** 番地*/
    private String address;
    /** マンション名*/
    private String buildingName;
    /** マンション名*/
    private String buildingNumber;
    /** メールアドレス */
    private String mailAddress;
}
