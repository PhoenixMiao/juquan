package com.phoenix.juquan.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel("companyCertification 公司认证")
public class companyCertification {
    @Id
    @ApiModelProperty("用户id")
    private long id;

    @ApiModelProperty("用户剧圈号")
    private String juQuanNum;

    @ApiModelProperty("真实姓名")
    private String name;

    @ApiModelProperty("公司姓名")
    private String firstName;

    @ApiModelProperty("部门")
    private String department;

    @ApiModelProperty("工号")
    private String staffNum;

    @ApiModelProperty("状态")
    private int status;
}
