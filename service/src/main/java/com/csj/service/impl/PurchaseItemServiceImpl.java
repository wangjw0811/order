package com.baomidou.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.csj.entity.PurchaseItem;
import com.csj.mapper.PurchaseItemMapper;
import com.csj.service.IPurchaseItemService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 采购子表 服务实现类
 * </p>
 *
 * @author Jims
 * @since 2019-04-27
 */
@Service
public class PurchaseItemServiceImpl extends ServiceImpl<PurchaseItemMapper, PurchaseItem> implements IPurchaseItemService {

}
