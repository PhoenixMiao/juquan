package com.phoenix.juquan.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel("SearchRecord 搜索记录")
public class SearchRecord implements Serializable {
    @Id
    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("用户剧圈号")
    private Long ju_quan_num;

    @ApiModelProperty("搜索内容")
    private String content;

    @ApiModelProperty("搜索时间")
    private String search_time;
}
