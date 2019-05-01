package com.csj.service.impl;

import com.csj.OrderTemplate;
import com.csj.entity.Purchase;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: jims wang
 * @createdate: 2019-04-28 10:38:22
 **/
@Service
public class PurchaseServiceImpl extends OrderTemplate<Purchase> {

    @Override
    protected boolean checkOk(Purchase entity) {
        System.out.println("开始审核");
        return false;
    }

    @Override
    protected String createWorkflow(Purchase entity) {
        System.out.println("开始创建工作流");
        return null;
    }

    @Override
    protected boolean automaticCheck() {
        return false;
    }

    @Override
    protected boolean startWorkflow() {
        return true;
    }
}
