package com.example.ec.controller.admin.ec001;

import java.util.ArrayList;
import java.util.List;

import com.example.ec.model.entity.UserEntity;

/**
 * 利用者情報一覧画面用の画面用に整形するクラス
 */
public class UseInfoPresenter {
    
    // コンストラクタ防止
    private UseInfoPresenter(){ }
    

    /**
     * 画面用に整形
     * 
     * @param userInfoList
     * @return
     */
	public static List<UserInfoDisplay> presenterUserInfoDisplay(List<UserEntity> userInfoList) {
        List<UserInfoDisplay> resultList = new ArrayList<>();

        for(UserEntity userInfo : userInfoList){
            UserInfoDisplay record = new UserInfoDisplay();
            record.setUserId(String.format("%08d", userInfo.getUserId()));
            record.setUserName(userInfo.getFamilyName() + " " + userInfo.getFirstName());
            record.setBirthDate(userInfo.getBirthDate());
            record.setAddress("");
            record.setMailAddress(userInfo.getMailAddress());
            resultList.add(record);
        }
		return resultList;
	}
    
}
