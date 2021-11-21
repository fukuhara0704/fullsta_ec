package com.example.ec.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 商品登録画面用のコントローラークラス
 */
@Controller
public class ProductEditController {
    
    @RequestMapping("/admin/product/edit")
    public String html(){
        // resouces/templates/配下のhtmlに返す
        return "/admin/product-edit";
    }
}
