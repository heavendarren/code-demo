package cn.yunxiang.demo.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author wangqx
 * @description TODO
 * @date 2022/6/16
 */
@Getter
@AllArgsConstructor
public enum BizException {
    /**
     * 用户不存在
     */
    NOTEXIST(10001,"用户不存在") ;

    /**
     * 枚举描述
     */
    private String desc;

    /**
     * 枚举编号
     */
    private Integer code;

    BizException(Integer code, String desc){
        this.code=code;
        this.desc=desc;
    }
}
