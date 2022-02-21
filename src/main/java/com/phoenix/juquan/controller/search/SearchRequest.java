package com.phoenix.juquan.controller.search;

import com.phoenix.juquan.common.PageParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel("SearchRequest 搜索请求")
public class SearchRequest {
    @ApiModelProperty("搜索内容")
    private String content;

    /*@Min(value = 1,message = "type字段必须为1或2或3或4" )
    @Max(value = 4,message = "type字段必须为1或2或3或4" )
    @ApiModelProperty("搜索类型（1为笔记，2为剧本，3为店铺，4为用户）")
    Integer type;*/

    @NotNull
    @ApiModelProperty("分页参数")
    private PageParam pageParam;
}
