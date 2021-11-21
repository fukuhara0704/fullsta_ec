package com.example.ec.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * パスワード変更画面用のコントローラークラス
 */
@Controller
public class ChangePasswordController {
    
    @RequestMapping("/admin/change/password")
    public String html(){
        // resouces/templates/配下のhtmlに返す
        return "/admin/change-password";
    }
}
