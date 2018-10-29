package com.imooc.order.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Order implements Serializable {

    /** ID. */
    private Long id;

    /** 订单日期. */
    private Date orderdate;

    private Date times;

    /** 送达日期. */
    private Date deliverydate;

    /** 订单状态. */
    private Long orderstatus;

    /** 客户ID. */
    private Long customernumber;

    /** 客户姓名. */
    private String customername;

    /** 收货地址码. */
    private Long deliverydestinationcode;

    /** 供应商名称. */
    private String suppliername;

    /** 。。。. */
    private String dearcustomer;

    /** 。。。. */
    private Long customtower;

    /** 订单号. */
    private Long orderno;

    /** 金额总计. */
    private Double totalfee;

    private static final long serialVersionUID = 1L;

}