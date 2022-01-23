package com.phoenix.juquan.controller;

import com.phoenix.juquan.annotation.Auth;
import com.phoenix.juquan.util.SessionUtils;
import com.phoenix.juquan.dto.SessionData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author phoenix
 * @version 2022/1/19 19:21
 */
@RestController
public class MyController {

    @Autowired
    private SessionUtils sessionUtils;

    @Auth
    @GetMapping("/get")
    @Deprecated
    public Object get(){
        Long juquan = sessionUtils.getUserJuQuanNum();
        SessionData sessionData = sessionUtils.getSessionData();
        return null;
    }

}
