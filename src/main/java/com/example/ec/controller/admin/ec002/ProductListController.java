package com.example.ec.controller.admin.ec002;

import java.util.List;

import com.example.ec.model.entity.ProductInfoEntity;
import com.example.ec.service.ec002.ProductListService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 商品一覧一覧画面用のコントローラークラス
 */
@Controller
public class ProductListController {
     @Autowired
     private ProductListService productListService;
    
    @RequestMapping("/admin/product/list")
    public String html(Model model){
        
        // 商品一覧情報取得
        List<ProductInfoEntity>  producInfotList = productListService.getProductInfo();

        // 画面表示用に加工
        List<ProductListDisplay> productInfoDisplayList = ProductListPresenter.convert(producInfotList);
        
        // htmlに描写
        model.addAttribute("productInfoDisplayList", productInfoDisplayList);
        
        // resouces/templates/配下のhtmlに返す
        return "/admin/product-list";
    }
}
