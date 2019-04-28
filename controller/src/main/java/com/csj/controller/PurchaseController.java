package com.csj.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.csj.OrderTemplate;
import com.csj.entity.Purchase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: jims wang
 * @createdate: 2019-04-26 16:56:10
 **/
@RestController
@RequestMapping("/purchase")
public class PurchaseController {
    @Autowired
    private OrderTemplate orderTemplate;

    @PostMapping("/page")
    public String  page(@RequestBody Purchase purchase){
        IPage page = new Page(1,10);
        orderTemplate.page(page);
        return "";
    }

    @PostMapping("/inset")
    public String inset(@RequestBody Purchase purchase){
        return orderTemplate.insert(purchase);
    }


}
