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
@ApiModel("script 剧本")
public class Script {
    @Id
    @ApiModelProperty("id")
    private long id;

    @ApiModelProperty("剧本名")
    private String name;

    @ApiModelProperty("类型")
    private String types;

    @ApiModelProperty("特征")
    private String traits;

    @ApiModelProperty("想玩人数")
    private int playNum;

    @ApiModelProperty("大V推荐度")
    private int recommended;

    @ApiModelProperty("评分")
    private double score;

    @ApiModelProperty("评分人数 百分数形式")
    private int commentNum;

    @ApiModelProperty("详情")
    private String content;

    @ApiModelProperty("点赞数")
    private int likes;

    @ApiModelProperty("收藏数")
    private int collections;

    @ApiModelProperty("浏览次数")
    private int browse;

    @ApiModelProperty("图片 地址或是序号")
    private String picture;
}
