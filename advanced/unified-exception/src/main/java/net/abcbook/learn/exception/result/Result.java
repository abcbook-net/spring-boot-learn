package net.abcbook.learn.exception.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author summer
 * @date 2018/6/20 下午6:33
 * 定义的返回值对象
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Result<T> {

    /**
     * 返回编码
     */
    private Integer code;
    /**
     * 返回信息
     */
    private String message;
    /**
     * 返回数据
     */
    private T data;
}
