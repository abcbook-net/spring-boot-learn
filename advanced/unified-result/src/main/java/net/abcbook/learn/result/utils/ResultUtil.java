package net.abcbook.learn.result.utils;

import net.abcbook.learn.result.enums.ResultEnum;
import net.abcbook.learn.result.result.Result;

/**
 * @author summer
 * @date 2018/6/21 下午2:29
 * 统一返回值的工具类
 */
public class ResultUtil {

    /**
     * @author summer
     * @date 2018/6/21 下午3:05
     * @return net.abcbook.learn.result.result.Result
     * @description 重构成功返回方法, 不需要返回数据
     */
    public static Result success(){
        return success(null);
    }

    /**
     * @author summer
     * @date 2018/6/21 下午3:04
     * @param data 需要返回的数据
     * @return net.abcbook.learn.result.result.Result
     * @description 成功返回对象封装
     */
    public static Result success(Object data){
        return baseResult(ResultEnum.SUCCESS.getCode(), ResultEnum.SUCCESS.getMessage(), data);
    }

    /**
     * @author summer
     * @date 2018/6/21 下午3:03
     * @param resultEnum 用于封装返回值的枚举对象
     * @return net.abcbook.learn.result.result.Result
     * @description 生成通过返回枚举生成的返回对象
     */
    public static Result error(ResultEnum resultEnum){
        return baseResult(resultEnum.getCode(), resultEnum.getMessage());
    }

    /**
     * @author summer
     * @date 2018/6/21 下午3:02
     * @return net.abcbook.learn.result.result.Result
     * @description 没有返回数据的未知错误返回方法
     */
    public static Result error(){
        return error(ResultEnum.ERROR);
    }

    /**
     * @author summer
     * @date 2018/6/21 下午3:01
     * @param code 返回码
     * @param message 返回消息
     * @return net.abcbook.learn.result.result.Result
     * @description 用于封装没有返回数据的基础返回对象
     */
    private static Result baseResult(Integer code, String message){
        return baseResult(code, message, null);
    }

    /**
     * @author summer
     * @date 2018/6/21 下午2:33
     * @param code 返回码
     * @param message 返回的消息
     * @param data 返回的数据
     * @return net.abcbook.learn.result.result.Result
     * @description 用于基础的封装返回对象
     */
    private static Result baseResult(Integer code, String message, Object data){
        return new Result(code, message, data);
    }
}
