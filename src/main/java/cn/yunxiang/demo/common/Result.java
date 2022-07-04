package cn.yunxiang.demo.common;

import cn.yunxiang.demo.enums.BizException;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wangqx
 * @description 统一返回对象
 * @date 2022/6/16
 */
@Data
@NoArgsConstructor
@ApiModel("请求响应对象")
public class Result<T> {
    private static final long serialVersionUID = 1L;

    /**
     * 成功
     */
    public static final int SUCCESS = 200;

    /**
     * 失败
     */
    public static final int FAIL = 500;

    @ApiModelProperty("消息状态码")
    private int code;

    @ApiModelProperty("消息内容")
    private String msg;

    @ApiModelProperty("数据对象")
    private T data;

    public static <T> Result<T> ok() {
        return restResult(null, SUCCESS, "操作成功");
    }

    public static <T> Result<T> ok(T data) {
        return restResult(data, SUCCESS, "操作成功");
    }

    public static <T> Result<T> ok(String msg) {
        return restResult(null, SUCCESS, msg);
    }

    public static <T> Result<T> ok(String msg, T data) {
        return restResult(data, SUCCESS, msg);
    }

    public static <T> Result<T> fail() {
        return restResult(null, FAIL, "操作失败");
    }

    public static <T> Result<T> fail(String msg) {
        return restResult(null, FAIL, msg);
    }

    public static <T> Result<T> fail(T data) {
        return restResult(data, FAIL, "操作失败");
    }

    public static <T> Result<T> fail(String msg, T data) {
        return restResult(data, FAIL, msg);
    }

    public static <T> Result<T> fail(int code, String msg) {
        return restResult(null, code, msg);
    }

    public static <T> Result<T> fail(BizException bizException) {
        return restResult(null, bizException.getCode(), bizException.getDesc());
    }

    private static <T> Result<T> restResult(T data, int code, String msg) {
        Result<T> r = new Result<>();
        r.setCode(code);
        r.setData(data);
        r.setMsg(msg);
        return r;
    }

}
