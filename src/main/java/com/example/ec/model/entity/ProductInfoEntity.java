package com.example.ec.model.entity;

import java.time.LocalDateTime;

import lombok.Data;
/**
 * 利用者テーブル用のエンティティクラス
 */
@Data
public class ProductInfoEntity {
    /** 商品Id */
    private Integer productId;
    /** 商品名 */
    private String ProductName;
    /** 値段*/
    private Integer price;
    /** 在庫数*/
    private Integer stock;
    /** 更新回数 */
    private Integer updateCount;
    /** 登録時間 */
    private LocalDateTime insertDate;
    /** 更新時間 */
    private LocalDateTime updateDate;
}
