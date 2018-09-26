package com.wdq.micorestore.services;

import com.wdq.micorestore.bean.UserBean;
import org.json.JSONObject;

public interface IUserServices {

    String login(String username, String password);
}
