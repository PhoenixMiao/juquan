package com.phoenix.juquan.dto;

import com.phoenix.juquan.entity.Note;
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
@ApiModel("BriefNote 列表返回的笔记")
public class BriefNote {
    /**
     * {@link Note}
     */

    @ApiModelProperty("笔记id")
    private Long id;

    @ApiModelProperty("阅读量")
    private int liang;

    public BriefNote(Long id){
        this.id = id;
    }
}
