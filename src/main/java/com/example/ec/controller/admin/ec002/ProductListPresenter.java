package com.example.ec.controller.admin.ec002;

import java.util.ArrayList;
import java.util.List;

import com.example.ec.model.entity.ProductInfoEntity;

public class ProductListPresenter {

    public static List<ProductListDisplay> convert(List<ProductInfoEntity> producInfoList) {
        List<ProductListDisplay> resultList = new ArrayList<>();

        for(ProductInfoEntity productInfo : producInfoList){
            ProductListDisplay record = new ProductListDisplay();
            record.setProductId(String.format("%08d", productInfo.getProductId()));
            record.setProductName(productInfo.getProductName());
            record.setProductPrice(productInfo.getPrice());
            record.setProductStockNum(productInfo.getStock());
            record.setUpdateCount(productInfo.getUpdateCount());
            resultList.add(record);
        }
		return resultList;
    }
    
}
