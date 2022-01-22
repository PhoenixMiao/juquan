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
@ApiModel("schoolCertification 学校认证")
public class SchoolCertification {
    @Id
    @ApiModelProperty("用户id")
    private long id;

    @ApiModelProperty("用户剧圈号")
    private String juQuanNum;

    @ApiModelProperty("真实姓名")
    private String name;

    @ApiModelProperty("学校")
    private String school;

    @ApiModelProperty("专业")
    private String major;

    @ApiModelProperty("年级")
    private String grade;

    @ApiModelProperty("学号")
    private String studentId;

    @ApiModelProperty("状态")
    private int status;
}
