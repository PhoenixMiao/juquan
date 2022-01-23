package com.phoenix.juquan.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel("BriefNote 笔记的实体")
public class BriefNote {
    @ApiModelProperty("笔记id")
    private Long id;

    @ApiModelProperty("阅读量")
    private int Liang=0;

    public BriefNote(long id){
        this.id = id;
    }
}
