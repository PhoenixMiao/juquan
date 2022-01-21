package com.phoenix.juquan.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel("note 笔记")
public class note {
    @Id
    @ApiModelProperty("用户id")
    private long id;

    @ApiModelProperty("标题")
    private String title;

    @ApiModelProperty("用户剧圈号")
    private String juQuanNum;

    @ApiModelProperty("剧本id")
    private long scriptId;

    @ApiModelProperty("店铺id")
    private long stored;

    @ApiModelProperty("发布日期")
    private Timestamp publishDate;

    @ApiModelProperty("内容")
    private String content;

    @ApiModelProperty("点赞数")
    private int likes;

    @ApiModelProperty("评论数")
    private int comments;

    @ApiModelProperty("收藏数")
    private int collections;

    @ApiModelProperty("浏览次数")
    private int browse;
}
