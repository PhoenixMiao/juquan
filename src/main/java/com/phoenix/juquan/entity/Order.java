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
@ApiModel("order 订单")
public class Order {
    @Id
    @ApiModelProperty("用户id")
    private long id;

    @ApiModelProperty("发车人剧圈号")
    private String driveNum;

    @ApiModelProperty("状态")
    private String status;

    @ApiModelProperty("整车人数")
    private int finalPeople;

    @ApiModelProperty("人数")
    private long people;

    @ApiModelProperty("订单发出时间")
    private Timestamp publishTime;

    @ApiModelProperty("发车时间")
    private Timestamp driverTime;

    @ApiModelProperty("剧本id")
    private String scriptId;

    @ApiModelProperty("店铺id")
    private String storeId;
}
