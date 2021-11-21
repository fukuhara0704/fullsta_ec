package com.example.ec.service.ec001;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.example.ec.model.entity.UserEntity;
import org.springframework.stereotype.Service;

/**
 * 利用者情報一覧画面用のサービスクラス
 */
@Service
public class UserInfoListService {

    /**
     * 利用者一覧情報取得処理
     * 
     * @return
     */
    public List<UserEntity> getUserInfo() {
        List<UserEntity> resultList = new ArrayList<>();
        for(int iIdx = 0; iIdx < 30; iIdx++){
            UserEntity userInfo = new UserEntity();
            userInfo.setUserId(iIdx);
            userInfo.setFamilyName("test姓_" + iIdx);
            userInfo.setFamilyNameKana("テストセイ" + iIdx);
            userInfo.setFirstName("test名" + iIdx);
            userInfo.setFirstNameKana("テストセイ" + iIdx);
            userInfo.setBirthDate(LocalDate.of(2021, 1, 1));
            userInfo.setPrefectures("テスト県" + iIdx);
            userInfo.setCities("cities");
            userInfo.setAddress("address");
            userInfo.setBuildingName("buildingName");
            userInfo.setBuildingNumber("buildingNumber");
            userInfo.setMailAddress("mailAddress");
            resultList.add(userInfo);
        }
        return resultList;
    }
}
