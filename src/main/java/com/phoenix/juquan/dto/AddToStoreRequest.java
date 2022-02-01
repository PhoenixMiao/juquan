package com.phoenix.juquan.dto;

import com.phoenix.juquan.entity.Note;
import com.phoenix.juquan.entity.Store;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel("AddToStoreRequest 添加的店铺")
public class AddToStoreRequest {
    /**
     * {@link Store}
     */

    @ApiModelProperty("店铺名称")
    private String name;

    @ApiModelProperty("位置")
    private String location;

    @ApiModelProperty("电话")
    private String telephone;

    @ApiModelProperty("详情")
    private String content;

    @ApiModelProperty("图片（地址或是序号）")
    private String picture;
}
