package cn.yunxiang.demo.domain.vo;

import cn.yunxiang.demo.base.BaseVO;
import cn.yunxiang.demo.enums.Sex;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.ibatis.annotations.Insert;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;

/**
 * @author wangqx
 * @description TODO
 * @date 2022/6/16
 */
@Data
@ApiModel("用户")
@EqualsAndHashCode(callSuper = true)
public class UserVO extends BaseVO {

    @ApiModelProperty(value = "id")
    private  Long  id;

    @ApiModelProperty(value = "姓名")
    @NotBlank(message ="姓名不能为空",groups = {Insert.class})
    @Size(min = 0, max = 30, message = "姓名长度不能超过30个字符")
    private  String name;


    /**
     * 邮箱
     */
    @ApiModelProperty(value = "邮箱")
    @NotBlank(message ="邮箱不能为空",groups = {Insert.class})
    private String email;

    /**
     * 编号
     */

    private String code;

    /**
     * 性别
     */
    @ApiModelProperty(value = "性别")
    @NotBlank(message ="性别不能为空",groups = {Insert.class})
    private Sex sex;

    /**
     * 电话
     */
    @ApiModelProperty(value = "电话")
    @NotBlank(message ="电话不能为空",groups = {Insert.class})
    private String phone;

    /**
     * 生日
     */
    @ApiModelProperty(value = "生日")
    @NotBlank(message ="生日不能为空",groups = {Insert.class})
    private LocalDate birthday;

    /**
     * 年龄
     */
    @ApiModelProperty(value = "年龄")
    @NotBlank(message ="年龄不能为空",groups = {Insert.class})
    private Integer age;

    /**
     * 身份证号
     */
    @ApiModelProperty(value = "身份证号")
    @NotBlank(message ="身份证号不能为空",groups = {Insert.class})
    private String idNo;
}
