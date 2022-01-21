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
public class Hot_topic implements Serializable {
    @Id
    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("话题类型")
    private String type;

    @ApiModelProperty("话题标题")
    private String title;

    @ApiModelProperty("话题链接id")
    private String objectId;

    @ApiModelProperty("点赞时间")
    private Timestamp likeTime;

}
