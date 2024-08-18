package com.pingan.cpip.entity.vip;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 客户授权信息日志流水
 * pajf_permission_log
 */
@Data
public class PajfPermissionLog implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 授权用户信息id(pajf_permission)
     */
    private Long pajfPermissionId;

    /**
     * 客用户id(customer_user)
     */
    private Long customerUserId;

    /**
     * 场景id
     */
    private Long sceneId;

    /**
     * 场景编码A1/A2等场景
     */
    private String sceneCode;

    /**
     * 场景协议id
     */
    private Long scenePolicyId;

    /**
     * 场景协议版本号
     */
    private String scenePolicyVersion;

    /**
     * 接受的关联基础协议id
     */
    private String acceptedBasePolicyIds;

    /**
     * 接受的关联基础协议id
     */
    private String basePolicyPublishedIds;

    /**
     * 授权渠道/授权共享对象
     */
    private String channelCode;

    /**
     * 执行时间(APP渠道送）/授权时间
     */
    private Date actionTime;

    /**
     * 授权时间
     */
    private Date authTime;

    /**
     * 备注
     */
    private String memo;

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