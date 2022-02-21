package com.phoenix.juquan.controller.search;



import com.phoenix.juquan.entity.Note;
import com.phoenix.juquan.service.SearchService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Api("搜索相关操作")
@RestController
@RequestMapping("/search")
@Validated
public class SearchController {
    @Autowired
    SearchService searchService;

    @GetMapping("/note_search")
    @ApiOperation(value = "搜索笔记",response = Note.class)
    public Object search(@NotNull @Valid @RequestBody SearchRequest searchRequest){
        return searchService.searchNote(searchRequest);
    }

}
