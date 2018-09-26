package com.wdq.micorestore.services.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.wdq.micorestore.bean.UserBean;
import com.wdq.micorestore.mybaits.inteface.IUserMapperInterface;
import com.wdq.micorestore.services.BaseServices;
import com.wdq.micorestore.services.IUserServices;
import com.wdq.micorestore.utils.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices extends BaseServices implements IUserServices {

    @Autowired
    IUserMapperInterface iUserMapper;

    @Override
    public String login(String username,String password){
        try {
            UserBean bean= iUserMapper.login(username, password);
            if (bean != null) {
                Log.e("UserService","success");
//                String jsonstr=JSON.toJSONString(bean);
                return returnJSONSuccess(bean,"登录成功");
            } else {
                Log.e("UserService","Error01");
                return returnJSONError("用户名密码错误");
            }
        }catch (Exception e){
            Log.e("UserService----",e.getMessage());
            return returnJSONError(e.getMessage());
        }
    }




}
