package com.phoenix.juquan.controller.script;

import com.phoenix.juquan.annotation.Auth;
import com.phoenix.juquan.common.Page;
import com.phoenix.juquan.common.PageParam;
import com.phoenix.juquan.common.Result;
import com.phoenix.juquan.dto.AddToScriptRequest;
import com.phoenix.juquan.dto.BriefNote;
import com.phoenix.juquan.mapper.ScriptMapper;
import com.phoenix.juquan.service.NoteService;
import com.phoenix.juquan.service.ScriptService;
import com.phoenix.juquan.util.SessionUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RestController
@Api("剧本相关接口")
@RequestMapping("/script")
@Validated
public class ScriptController {
    @Autowired
    private ScriptService scriptService;

    @Autowired
    private SessionUtils sessionUtils;

    @GetMapping("/list")
    @ApiOperation("返回剧本列表")
    public Object getBriefScriptList(@NotNull @Validated PageParam pageParam){
        return scriptService.getBriefScriptPage(pageParam);
    };

    @GetMapping("/info")
    @ApiOperation("返回剧本详情")
    @ApiImplicitParam(name = "id",value = "所要查找的id",paramType = "query",dataType = "Long")
    public Object getBriefScriptInfo(@NotNull @Validated @RequestParam(value = "id") Long id){
        return scriptService.getBriefScriptInfo(id);
    };


    @PostMapping("/add")
    @ApiOperation(value = "添加剧本",response = String.class)
    public Object addToScript(@NotNull @Valid @RequestBody AddToScriptRequest addToScriptRequest){
        //Long user_id = sessionUtils.getUserJuQuanNum();
        scriptService.AddToScript(addToScriptRequest.getName(),
                addToScriptRequest.getType(),
                addToScriptRequest.getTraits(),
                addToScriptRequest.getContent(),
                addToScriptRequest.getPicture());
        return "操作成功";
    }


    @PostMapping("/delete")
    @ApiOperation("删除剧本")
    @ApiImplicitParam(name = "id", value = "所要删除笔记的id", paramType = "query", dataType = "Long")
    public Object deleteNote(@NotNull @Validated @RequestParam(value = "id") Long id) {

        scriptService.deleteScriptById(id);
        return "操作成功";
    }
}
