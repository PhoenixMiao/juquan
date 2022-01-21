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
@ApiModel("Comment 评论")
public class Comment implements Serializable {
    @Id
    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("笔记id")
    private Long objectId;

    @ApiModelProperty("用户剧圈号")
    private String juQuanNum;

    @ApiModelProperty("评论时间")
    private Timestamp commentTime;

    @ApiModelProperty("评论内容")
    private String content;

    @ApiModelProperty("评论点赞数")
    private int likes;

}
