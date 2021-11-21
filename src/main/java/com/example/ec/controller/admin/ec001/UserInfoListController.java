package com.example.ec.controller.admin.ec001;

import java.util.List;

import com.example.ec.model.entity.UserEntity;
import com.example.ec.service.ec001.UserInfoListService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 利用者情報一覧画面用のコントローラークラス
 */
@Controller
public class UserInfoListController {
    
    @Autowired
    private UserInfoListService userInfoListService;
    
    @RequestMapping("/admin/user/info/list")
    public String html(Model model){

        //　user一覧情報を取得 
        List<UserEntity> userInfoList = userInfoListService.getUserInfo();

        // dbから取得したデータを画面表示用に加工
        List<UserInfoDisplay> userInfoDisplayList =UseInfoPresenter.presenterUserInfoDisplay(userInfoList) ;
        
        // htmlに描写
        model.addAttribute("userInfoDisplayList",  userInfoDisplayList);

        // resouces/templates/配下のhtmlに返す
        return "/admin/user-info-list";
    }
}
