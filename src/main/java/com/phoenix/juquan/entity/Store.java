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
@ApiModel("store 店铺")
public class Store {
    @Id
    @ApiModelProperty("id")
    private long id;

    @ApiModelProperty("店铺名称")
    private String name;

    @ApiModelProperty("位置")
    private String location;

    @ApiModelProperty("电话")
    private String telephone;

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
