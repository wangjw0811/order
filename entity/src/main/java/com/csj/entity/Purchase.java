package com.csj.entity;

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


}
