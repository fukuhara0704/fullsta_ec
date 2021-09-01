package com.example.ec.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *  "/" と "/index"のリクエストに対して処理を実行してくれる
 *  コントローラークラス
 */
@Controller("userIndexController")
public class IndexController {
   
    // user/index.htmlに遷移するメソッド
    @RequestMapping({"/", "/index"})
    public String index(){
        // resouces/templates/配下のhtmlに返す
        return "/user/index";
    }
}
