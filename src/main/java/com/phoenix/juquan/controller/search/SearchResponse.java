package com.phoenix.juquan.controller.search;

import io.swagger.annotations.ApiModelProperty;


public class SearchResponse {
    @ApiModelProperty("结果类型（1为笔记，2为剧本，3为店铺，4为用户）")
    private Integer type;

    @ApiModelProperty("对象id")
    private Long id;

    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("用户:剧圈号")
    private String subtype;

    @ApiModelProperty("附加信息一：项目为负责人姓名")
    private String attachment1;

    @ApiModelProperty("附加信息二：通知公告为发布日期，项目为立项院系")
    private String attachment2;

    @ApiModelProperty("附加信息三:用户为点赞数")
    private int num1;

    @ApiModelProperty("附加信息四：用户为笔记数，项目为立项院系")
    private int num2;

    @ApiModelProperty("附加信息五：用户为关注状态（1为关注，0为未关注）")
    private int status;
}
