package cn.yunxiang.demo.base;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * @author wangqx
 * @description TODO
 * @date 2022/6/16
 */
@EqualsAndHashCode
@Data
public class BaseVO implements Serializable {
    /**
     * 搜索值
     */
    @ApiModelProperty(value = "搜索值")
    @TableField(exist = false)
    private String searchValue;

    /**
     * 创建者
     */
    @ApiModelProperty(value = "创建者")
    private String createBy;


    /**
     * 创建者
     */
    @ApiModelProperty(value = "创建者名称")
    private String createByName;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    /**
     * 更新者
     */
    @ApiModelProperty(value = "更新者")
    private String updateBy;

    /**
     * 更新者
     */
    @ApiModelProperty(value = "更新者名称")
    private String updateByName;

    /**
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

}
