CREATE TABLE `purchase` (
  `ticket_no` varchar(32) NOT NULL,
  `customer` varchar(32) NOT NULL COMMENT '客户id',
  `quantity` double(24,6) DEFAULT NULL COMMENT '数量',
  `amount` double(24,2) DEFAULT NULL COMMENT '金额',
  `unit_price` double(24,3) DEFAULT NULL COMMENT '单价',
  PRIMARY KEY (`ticket_no`)
) ENGINE=InnoDB COMMENT '采购主表'  DEFAULT CHARSET=utf8;

CREATE TABLE `purchase_item` (
  `id` varchar(32) NOT NULL DEFAULT 'replace(uuid(), ''-'', '''')' COMMENT '主键id',
  `ticket_no` varchar(32) NOT NULL,
  `product_id` varchar(32) NOT NULL COMMENT '商品id',
  `product_name` varchar(32) DEFAULT NULL COMMENT '商品名称',
  `product_rule` varchar(125) DEFAULT NULL COMMENT '商品规格',
  `product_size` varchar(125) DEFAULT NULL COMMENT '商品尺寸',
  `product_brand_name` varchar(32) DEFAULT NULL COMMENT '品牌名称',
  `product_unit_name` varchar(4) DEFAULT NULL COMMENT '单位名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB COMMENT '采购子表' DEFAULT CHARSET=utf8;

