package com.example.ec.controller.admin;

import com.example.ec.model.entity.AdminLoginEntity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    
    // admin/index.htmlに遷移するメソッド
    @RequestMapping("/admin/login")
    public String login(){
        // resouces/templates/配下のhtmlに返す
        return "/admin/login";
    }
    
    /**
     * サインイン処理
     * 
     * @param userId
     * @param password
     * @return
     */
    @RequestMapping(path="/admin/signIn", method = RequestMethod.POST)
    public String signIn(@RequestParam("userId") String userId,@RequestParam("password")String password){
        // サインイン処理開始
        System.out.println(userId);
        System.out.println(password);
       
        // ユーザIdとパスワードの確認
        if(!check(userId, password)){
            return "/common/error";
        }
        // 一旦トップページへ
        return "/admin/index";
    }

    /**
     * ユーザー情報判定処理
     * 
     * @param userId
     * @param password
     * @return 
     */
    private boolean check(String userId, String password) {
       AdminLoginEntity adminLogin = new AdminLoginEntity();
       adminLogin.setUserId(userId);
       adminLogin.setPassword(password);
       if("testId".equals(userId) && "testpass".equals(password)){
           return true;
       }
       return false;
    }
}
