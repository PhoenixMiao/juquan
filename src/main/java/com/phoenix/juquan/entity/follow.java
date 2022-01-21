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
@ApiModel("follow 关注")
public class follow {
    @Id
    @ApiModelProperty("id")
    private long id;

    @ApiModelProperty("关注者")
    private String followerNum;

    @ApiModelProperty("被关注者")
    private String followedNum;

    @ApiModelProperty("关注时间")
    private Timestamp followTime;
}
