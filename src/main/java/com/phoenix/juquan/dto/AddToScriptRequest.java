package com.phoenix.juquan.dto;

import com.phoenix.juquan.entity.Note;
import com.phoenix.juquan.entity.Script;
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
public class AddToScriptRequest {
    /**
     * {@link Script}
     */

    @ApiModelProperty("剧本名")
    private String name;

    @ApiModelProperty("类型")
    private String type;

    @ApiModelProperty("特征")
    private String traits;

    @ApiModelProperty("详情")
    private String content;

    @ApiModelProperty("图片 地址或是序号")
    private String picture;
}
