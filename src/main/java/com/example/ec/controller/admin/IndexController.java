package com.example.ec.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *  "/" と "/index"のリクエストに対して処理を実行してくれる
 *  コントローラークラス
 */
@Controller("adminIndexController")
public class IndexController {
   
    // admin/index.htmlに遷移するメソッド
    @RequestMapping({"/admin", "admin/index"})
    public String index(){
        // resouces/templates/配下のhtmlに返す
        return "/admin/index";
    }
}
