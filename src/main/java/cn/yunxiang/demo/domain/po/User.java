package cn.yunxiang.demo.domain.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import cn.yunxiang.demo.base.BaseEntity;
import cn.yunxiang.demo.enums.Sex;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

/**
 * @author wangqx
 * @description 用户表
 * @date 2022/6/16
 */
@TableName("demo_user")
@Builder(toBuilder = true)
@EqualsAndHashCode(callSuper = true)
@Data
public class User extends BaseEntity {
    /**
     * id
     */
    @TableId
    private Long id;
    /**
     * 姓名
     */
    @TableField(value = "name")
    private String name;

    /**
     * 邮件
     */
    @TableField(value = "email")
    private String email;

    /**
     * 编号
     */
    @TableField(value = "code")
    private String code;

    /**
     * 性别
     */
    @TableField(value = "sex")
    private Sex sex;

    /**
     * 电话
     */
    @TableField(value = "phone")
    private String phone;

    /**
     * 生日
     */
    @TableField(value = "birthday")
    private LocalDate birthday;

    /**
     * 年龄
     */
    @TableField(value = "age")
    private Integer age;

    /**
     * 身份证号
     */
    @TableField(value = "id_no")
    private String idNo;

}
