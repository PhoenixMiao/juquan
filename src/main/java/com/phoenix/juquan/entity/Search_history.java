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
@ApiModel("Comment 评论")
public class Search_history implements Serializable {
    @Id
    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("用户剧圈号")
    private String juQuanNum;

    @ApiModelProperty("搜索名")
    private String name;

    @ApiModelProperty("搜索时间")
    private String searchTime;

}
