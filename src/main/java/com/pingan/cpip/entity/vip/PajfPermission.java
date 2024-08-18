package com.pingan.cpip.entity.vip;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 客户授权信息
 * @TableName pajf_permission
 */
@Data
public class PajfPermission implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 客用户id(customer_user)
     */
    private Long customerUserId;

    /**
     * 场景id
     */
    private Long sceneId;

    /**
     * 
     */
    private String sceneCode;

    /**
     * 场景协议id
     */
    private Long scenePolicyId;

    /**
     * 场景协议版本号（集团所需）
     */
    private String scenePolicyVersion;

    /**
     * 接收的基础协议id，a,b,c...格式列表
     */
    private String acceptedBasePolicyIds;

    /**
     * 授权BU编码
     */
    private String channelCode;

    /**
     * app授权渠道编码(自定义)（集团所需）
     */
    private String appChannelCode;

    /**
     * 执行时间(APP渠道送）/授权时间
     */
    private Date actionTime;

    /**
     * 备注
     */
    private String memo;

    /**
     * 错误码
     */
    private String errCode;

    /**
     * 错误信息
     */
    private String errMsg;

    /**
     * 集团错误码
     */
    private String responseCode;

    /**
     * 集团错误信息
     */
    private String responseMsg;

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
}