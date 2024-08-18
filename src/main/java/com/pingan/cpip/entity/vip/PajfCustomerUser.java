package com.pingan.cpip.entity.vip;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * pajf_customer_user
 * @author 
 */
@Data
public class PajfCustomerUser implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 会员号
     */
    private String memberNo;

    /**
     * 客户号
     */
    private String userNo;

    /**
     * 身份证
     */
    private String idCard;

    /**
     * 手机(明文)
     */
    private String telNo;

    /**
     * 手机号(渠道上送,密文)
     */
    private String mobiles;

    /**
     * 客户号/会员号是否已注销，0未注销 1已注销
     */
    private String unsubscribe;

    /**
     * 创建人
     */
    private String createdBy;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 更新人
     */
    private String updatedBy;

    /**
     * 更新时间
     */
    private Date updatedTime;

    private static final long serialVersionUID = 1L;
}