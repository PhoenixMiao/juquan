package com.phoenix.juquan.service;

import com.phoenix.juquan.dto.SessionData;

public interface UserService {

    /**
     * 登录
     * @param code
     * @return
     */
    SessionData login(String code);
}
