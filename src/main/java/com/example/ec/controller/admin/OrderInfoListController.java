package com.example.ec.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 注文情報一覧画面用のコントローラークラス
 */
@Controller
public class OrderInfoListController {
    
    @RequestMapping("/admin/order/info/list")
    public String html(){
        // resouces/templates/配下のhtmlに返す
        return "/admin/order-info-list";
    }
}
