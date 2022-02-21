package com.phoenix.juquan.dto;


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
@ApiModel("BriefRelation 返回店铺中的剧本")
public class BriefRelation {
    /**
     * {@link com.phoenix.juquan.entity.Relation}
     */
    @Id
    @ApiModelProperty("id")
    private long id;

    @ApiModelProperty("店铺id")
    private long storeId;

    @ApiModelProperty("剧本id")
    private long scriptId;
}
