package cn.yunxiang.demo.base;

import cn.yunxiang.demo.enums.DeleteFlag;
import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author wangqx
 * @description entity 基类
 * @date 2022/6/16
 */
@Data
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;



    /**
     * 创建者
     */
    @TableField(value = "create_by")
    private String createBy;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 更新者
     */
    @TableField(value = "update_by")
    private String updateBy;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Date updateTime;

    /**
     * 删除标记
     */
    @TableField(value = "delete_flag")
    private DeleteFlag deleteFlag;

}
