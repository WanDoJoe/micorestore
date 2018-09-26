package com.wdq.micorestore.mybaits.inteface;

import com.wdq.micorestore.bean.GoodsBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface IGoodsMapperInterface {
    List<GoodsBean> findAll();
    void add(GoodsBean goodsBean);
    void update(GoodsBean goodsBean);

}
