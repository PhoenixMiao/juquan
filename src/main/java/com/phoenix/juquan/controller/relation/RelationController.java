package com.phoenix.juquan.controller.relation;



import com.phoenix.juquan.service.RelationService;
import com.phoenix.juquan.util.SessionUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@Api("店铺中剧本相关接口")
@RequestMapping("/relation")
@Validated
public class RelationController {
    @Autowired
    private RelationService relationService;

    @Autowired
    private SessionUtils sessionUtils;

    @GetMapping("/store_by_script")
    @ApiOperation(value="根据剧本ID返回店铺")
    @ApiImplicitParam(name = "scriptId", value = "用于查找的剧本ID", paramType = "query", dataType = "Long")
    public Object getStoreIdByScriptId(@NotNull @Valid @RequestParam(value = "scriptId") long scriptId){
        return relationService.getStoreIdByScriptId(scriptId);
    }

    @PostMapping("/add")
    @ApiOperation(value = "添加店铺中的剧本")
    public Object addRelation(@NotNull @Valid long scriptId, @NotNull @Valid long storeId){
        relationService.addRelation(storeId, scriptId);
        return "操作成功";
    }

    @GetMapping("/script_by_store")
    @ApiOperation(value="根据剧本ID返回店铺")
    @ApiImplicitParam(name = "storeId", value = "用于查找的剧本ID", paramType = "query", dataType = "Long")
    public Object getScriptIdByStoreId(@NotNull @Valid @RequestParam(value = "storeId") long storeId){
        return relationService.getScriptIdByStoreId(storeId);
    }
}

