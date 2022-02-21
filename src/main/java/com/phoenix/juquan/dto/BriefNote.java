package com.phoenix.juquan.dto;

import com.phoenix.juquan.entity.Note;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel("BriefNote 列表返回的笔记")
public class BriefNote {
    /**
     * {@link Note}
     */

    @ApiModelProperty("笔记id")
    private Long id;

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
