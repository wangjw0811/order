package com.baomidou.entity;

    import java.io.Serializable;
    import io.swagger.annotations.ApiModel;
    import io.swagger.annotations.ApiModelProperty;
    import lombok.Data;
    import lombok.EqualsAndHashCode;
    import lombok.experimental.Accessors;

/**
* <p>
    * 采购子表
    * </p>
*
* @author Jims
* @since 2019-04-27
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @ApiModel(value="PurchaseItem对象", description="采购子表")
    public class PurchaseItem implements Serializable {

    private static final long serialVersionUID = 1L;

    private String ticketNo;

            @ApiModelProperty(value = "商品id")
    private String productId;

            @ApiModelProperty(value = "商品名称")
    private String productName;

            @ApiModelProperty(value = "商品规格")
    private String productRule;

            @ApiModelProperty(value = "商品尺寸")
    private String productSize;

            @ApiModelProperty(value = "品牌名称")
    private String productBrandName;

            @ApiModelProperty(value = "单位名称")
    private String productUnitName;


}
