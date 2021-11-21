package com.example.ec.controller.admin.ec002;

import lombok.Data;

/**
 * 商品一覧画面表示用のデータクラス
 */
@Data
public class ProductListDisplay {
    /** 商品ID */
    private String productId;
    /** 商品名 */
    private String productName;
    /** 値段 */
    private Integer productPrice;
    /** 在庫数 */
    private Integer productStockNum;
    /** 更新回数 */
    private Integer updateCount;
}
