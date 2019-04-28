package com.csj;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @description: 订单生成模板
 * @author: jims wang
 * @createdate: 2019-04-25 08:09:47
 **/
public abstract class OrderTemplate<T> extends ServiceImpl<BaseMapper<T>, T> implements IService<T> {
    //自动审核标识
    private static boolean DEFAULT_AUTOMATIC_CHECK = false;
    //发起工作流标识
    private static boolean DEFAULT_START_WORKFLOW = false;

    public String insert(T entity) {
        // 1 创建订单
        save(entity);
        // 2 判断是否需要自动审核，若是则调用审核逻辑
        if (automaticCheck()) {
            checkOk(entity);
        } else {
            // 3 判断是否触发流程审批
            if (startWorkflow()) {
                createWorkflow(entity);
            }
        }
        return "";
    }

    protected boolean automaticCheck() {
        //获取是否自动审核标识，当系统不支持可配置时，可重写该方法
        return DEFAULT_AUTOMATIC_CHECK;
    }

    protected boolean startWorkflow() {
        //获取是否发工作流，当系统不支持可配置时，可重写该方法
        return DEFAULT_START_WORKFLOW;
    }

    protected abstract boolean checkOk(T entity);

    protected abstract String createWorkflow(T entity);


}
