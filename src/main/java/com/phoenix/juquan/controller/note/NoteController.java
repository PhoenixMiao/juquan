package com.phoenix.juquan.controller.note;

import com.phoenix.juquan.common.Page;
import com.phoenix.juquan.common.PageParam;
import com.phoenix.juquan.dto.BriefNote;
import com.phoenix.juquan.service.NoteService;
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
@RequestMapping("/note")
@Validated
public class NoteController {
    @Autowired
    private NoteService noteService;

    @Autowired
    private SessionUtils sessionUtils;

    @GetMapping("/list")
    @ApiOperation("返回笔记列表")
    public Object getBriefNoteList(@NotNull @Validated PageParam pageParam){
        return noteService.getBriefNotePage(pageParam);
    };

    @GetMapping("/info")
    @ApiOperation("返回笔记详情")
    @ApiImplicitParam(name = "id",value = "所要查找的id",paramType = "query",dataType = "Long")
    public Object getBriefNoteInfo(@NotNull @Validated @RequestParam(value = "id") Long id){
        return noteService.getBriefNoteInfo(id);
    };

    @PostMapping("/delete")
    @ApiOperation("删除笔记")
    @ApiImplicitParam(name = "id", value = "所要删除笔记的id", paramType = "query", dataType = "Long")
    public void deleteNote(@NotNull @Validated @RequestParam(value = "id") Long id) {
        noteService.deleteNoteById(id);
    }

}
