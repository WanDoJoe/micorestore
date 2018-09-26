package com.wdq.micorestore.bean;

import java.util.List;

//`id` int(255) NOT NULL AUTO_INCREMENT,
//        `goods_code` varchar(255) NOT NULL,
//        `goods_name` varchar(255) NOT NULL,
//        `goods_price` float(255,0) DEFAULT NULL,
//        `goods_info_id` int(255) DEFAULT NULL,
//        `goods_classify` varchar(255) DEFAULT NULL,
//        `goods_type` varchar(255) DEFAULT NULL,
//        `storage_date` varchar(255) DEFAULT NULL,
//        `state` varchar(255) DEFAULT '1',
//        `image_url` varchar(1024) DEFAULT NULL,
//        `remark` varchar(255) DEFAULT NULL,
//        `introduction` varchar(1024) DEFAULT NULL,
//        PRIMARY KEY (`id`)
public class GoodsBean {
    private int id;
    private String goods_code;
    private String goods_name;
    private String goods_price;
    private String goods_info_id;
    private String goods_classify;
    private String goods_type;
    private String storage_date;
    private String state;
    private String image_url;
    private String remark;
    private String introduction;

    private List<GoodsInfoBean> goodsInfoBeanList;

    public List<GoodsInfoBean> getGoodsInfoBeanList() {
        return goodsInfoBeanList;
    }

    public void setGoodsInfoBeanList(List<GoodsInfoBean> goodsInfoBeanList) {
        this.goodsInfoBeanList = goodsInfoBeanList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGoods_code() {
        return goods_code;
    }

    public void setGoods_code(String goods_code) {
        this.goods_code = goods_code;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public String getGoods_price() {
        return goods_price;
    }

    public void setGoods_price(String goods_price) {
        this.goods_price = goods_price;
    }

    public String getGoods_info_id() {
        return goods_info_id;
    }

    public void setGoods_info_id(String goods_info_id) {
        this.goods_info_id = goods_info_id;
    }

    public String getGoods_classify() {
        return goods_classify;
    }

    public void setGoods_classify(String goods_classify) {
        this.goods_classify = goods_classify;
    }

    public String getGoods_type() {
        return goods_type;
    }

    public void setGoods_type(String goods_type) {
        this.goods_type = goods_type;
    }

    public String getStorage_date() {
        return storage_date;
    }

    public void setStorage_date(String storage_date) {
        this.storage_date = storage_date;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}
