package com.pingan.cpip.entity.vip;

import java.io.Serializable;
import java.util.Date;

/**
 * ad_banner
 * @author 
 */
public class AdBanner implements Serializable {
    private Integer id;

    /**
     * 轮播图地址
     */
    private String imgUrl;

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String title;

    /**
     * 1=启用 2=不启用
     */
    private Byte state;

    /**
     * 展现的顺序数值越小越靠前展示
     */
    private Byte sort;

    /**
     * 图片类型：type = 1 小程序  type =2  客服消息link type =3  小程序内嵌h5
     */
    private Byte type;

    /**
     * 兑换码
     */
    private String exchangeCode;

    private Date deadline;

    /**
     * 图片对应礼品对象的描述(存放礼物的JSON对象)
     */
    private String info;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Byte getSort() {
        return sort;
    }

    public void setSort(Byte sort) {
        this.sort = sort;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getExchangeCode() {
        return exchangeCode;
    }

    public void setExchangeCode(String exchangeCode) {
        this.exchangeCode = exchangeCode;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}