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
@ApiModel("collection 收藏")
public class Likes {
    @Id
    @ApiModelProperty("id")
    private long id;

    @ApiModelProperty("对象类型")
    private String type;

    @ApiModelProperty("对象id")
    private long objectId;

    @ApiModelProperty("用户剧圈号")
    private String juQuanNum;

    @ApiModelProperty("点赞时间")
    private Timestamp likeTime;
}
