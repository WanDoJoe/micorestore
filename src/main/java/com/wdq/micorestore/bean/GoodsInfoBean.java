package com.wdq.micorestore.bean;


//`id` int(255) NOT NULL,
//        `goods_id` int(255) NOT NULL,
//        `size` varchar(255) NOT NULL,
//        `color` varchar(255) NOT NULL,
//        `stock` int(255) NOT NULL DEFAULT '0',
//        PRIMARY KEY (`id`)
public class GoodsInfoBean {

    private int id;
    private int goods_id;
    private int size;
    private int color;
    private int stock;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(int goods_id) {
        this.goods_id = goods_id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
