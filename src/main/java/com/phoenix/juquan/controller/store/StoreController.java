package com.phoenix.juquan.controller.store;

import com.phoenix.juquan.common.Page;
import com.phoenix.juquan.common.PageParam;
import com.phoenix.juquan.dto.BriefNote;
import com.phoenix.juquan.service.NoteService;
import com.phoenix.juquan.service.StoreService;
import com.phoenix.juquan.util.SessionUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

@RestController
@Api("笔记相关接口")
@RequestMapping("/store")
@Validated
public class StoreController {
    @Autowired
    private StoreService storeService;

    @Autowired
    private SessionUtils sessionUtils;

    @GetMapping("/list")
    @ApiOperation("返回店铺列表")
    public Object getBriefStoreList(@NotNull @Validated PageParam pageParam){
        return storeService.getBriefStorePage(pageParam);
    };

    @GetMapping("/info")
    @ApiOperation("返回店铺详情")
    @ApiImplicitParam(name = "id",value = "所要查找的id",paramType = "query",dataType = "Long")
    public Object getBriefStoreInfo(@NotNull @Validated @RequestParam(value = "id") Long id){
        return storeService.getBriefStoreInfo(id);
    };



}
