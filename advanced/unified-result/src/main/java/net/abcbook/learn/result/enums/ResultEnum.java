package net.abcbook.learn.result.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author summer
 * @date 2018/6/21 下午2:36
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
public enum ResultEnum {

    /*
     * 200 成功状态
     */
    /**
     * 成功
     */
    SUCCESS(200,"success"),

    /*
     * 3xx 数据校验不合法
     */
    DATA_ERROR(300, "传入数据不合法"),

    /*
     * 4xx 地址/请求错误
     */
    URL_ERROR(400,"请求地址有误"),

    /*
     * 5xx 服务器错误
     */
    /**
     * 未知错误
     */
    ERROR(500, "error"),

    ;

    Integer code;
    String message;

}
