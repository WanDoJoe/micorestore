package com.wdq.micorestore.mybaits.inteface;

import com.wdq.micorestore.bean.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
public interface IUserMapperInterface {
    UserBean login(String username,String password);

}
