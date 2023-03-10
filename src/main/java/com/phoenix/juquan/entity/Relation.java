package com.phoenix.juquan.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Id;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel("relation 店铺中剧本")
public class Relation {
    @Id
    @ApiModelProperty("id")
    private long id;

    @ApiModelProperty("店铺id")
    private long storeId;

    @ApiModelProperty("剧本id")
    private long scriptId;

}
