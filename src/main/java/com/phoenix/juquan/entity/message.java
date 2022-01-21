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
@ApiModel("message 消息")
public class message {
    @Id
    @ApiModelProperty("id")
    private long id;

    @ApiModelProperty("发出用户")
    private String senderNum;

    @ApiModelProperty("接受用户")
    private String receiverNum;

    @ApiModelProperty("发送时间")
    private Timestamp sendTime;

    @ApiModelProperty("是否已读")
    private boolean isRead;
}
