package com.csj;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @description:
 * @author: jims wang
 * @createdate: 2019-04-28 12:37:44
 **/
public interface OrderBaseMapper<T> extends BaseMapper<T> {

    boolean chekOk(T entity);

}
