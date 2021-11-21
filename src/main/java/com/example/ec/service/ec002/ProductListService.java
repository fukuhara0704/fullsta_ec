package com.example.ec.service.ec002;

import java.util.ArrayList;
import java.util.List;

import com.example.ec.model.entity.ProductInfoEntity;
import org.springframework.stereotype.Service;

/**
 * 利用者情報一覧画面用のサービスクラス
 */
@Service
public class ProductListService {

    /**
     * 商品情報一覧情報取得処理
     * 
     * @return
     */
    public List<ProductInfoEntity> getProductInfo() {
        List<ProductInfoEntity> resultList = new ArrayList<>();
        for(int iIdx = 0; iIdx < 300; iIdx++){
            ProductInfoEntity productInfo = new ProductInfoEntity();
            productInfo.setProductId(iIdx);
            productInfo.setProductName("テスト商品名_" + iIdx);
            productInfo.setPrice(100 * iIdx);
            productInfo.setStock(iIdx);
            productInfo.setUpdateCount(0);
            resultList.add(productInfo);
        }
        return resultList;
    }
}
