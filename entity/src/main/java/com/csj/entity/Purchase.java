package com.csj.entity;

import com.baomidou.mybatisplus.annotation.TableLogic;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
* <p>
    * 
    * </p>
*
* @author Jims
* @since 2019-04-26
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @ApiModel(value="Purchase对象", description="")
    public class Purchase implements Serializable {

    private static final long serialVersionUID = 1L;

    private String ticketNo;

            @ApiModelProperty(value = "客户id")
    private String customer;

            @ApiModelProperty(value = "数量")
    private Double quantity;

            @ApiModelProperty(value = "金额")
    private Double amount;

            @ApiModelProperty(value = "单价")
    private Double unitPrice;
//
//            private Intege
//    status` tinyint(2) NOT NULL DEFAULT '0' COMMENT '单据状态 -1 草稿 0 待审核 1审核通过  -2 审核驳回 ',
//            `checkUser` varchar(32) DEFAULT NULL COMMENT '审核人',
//            `checkAdvice` varchar(256) DEFAULT NULL COMMENT '审核意见',
//            `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
//            `checkTime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '审核时间',

    @TableLogic
    @ApiModelProperty(value = "删除标识 0 未删除 1 已删除")
    private Integer idDelete;


}
