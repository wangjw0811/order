package com.csj.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.csj.service.IPurchaseService;
import com.csj.entity.Purchase;
import com.csj.mapper.PurchaseMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Jims
 * @since 2019-04-26
 */
@Service
public class PurchaseServiceImpl extends ServiceImpl<PurchaseMapper,Purchase> implements IPurchaseService {

}
