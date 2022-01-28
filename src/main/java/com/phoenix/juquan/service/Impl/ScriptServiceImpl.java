package com.phoenix.juquan.service.Impl;

import com.github.pagehelper.PageHelper;


import com.github.pagehelper.PageInfo;
import com.phoenix.juquan.annotation.Auth;
import com.phoenix.juquan.common.Page;
import com.phoenix.juquan.common.PageParam;
import com.phoenix.juquan.dto.AddToScriptRequest;
import com.phoenix.juquan.dto.BriefNote;
import com.phoenix.juquan.dto.BriefScript;
import com.phoenix.juquan.mapper.NoteMapper;
import com.phoenix.juquan.mapper.ScriptMapper;
import com.phoenix.juquan.service.NoteService;
import com.phoenix.juquan.service.ScriptService;
import com.phoenix.juquan.util.SessionUtils;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Service
public class ScriptServiceImpl implements ScriptService {
    @Autowired
    private ScriptMapper scriptMapper;

    @Autowired
    SessionUtils sessionUtils;

    @Override
    public Page<BriefScript> getBriefScriptPage(PageParam pageParam){
        int pageNum = pageParam.getPageNum();
        int pageSize = pageParam.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<BriefScript> briefScriptList = scriptMapper.getBriefScriptList();
        return new Page<>(new PageInfo<>(briefScriptList));
    }

    @Override
    public  BriefScript getBriefScriptInfo(Long id){
        BriefScript briefScript = scriptMapper.getScriptById(id);
        return briefScript;
    }

    @Override
    public void AddToScript(String name, String type, String traits, String content, String picture){
        scriptMapper.addToScript(name , type, traits, content, picture);
    }

    @Override
    public void deleteScriptById(Long id){
        scriptMapper.deleteScriptById(id);
    }

}
