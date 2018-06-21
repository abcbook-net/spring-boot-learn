package net.abcbook.learn.result.controller;

import net.abcbook.learn.result.result.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author summer
 * @date 2018/6/20 下午6:35
 * 基础使用 demo
 */
@RestController
@RequestMapping("/hello")
public class HelloResultController {

    /**
     * @author summer
     * @date 2018/6/20 下午6:38
     * @param source 前端传入的值
     * @return net.abcbook.learn.result.result.Result<java.lang.String>
     * @description 最基础的统一返回值使用方式
     */
    @GetMapping
    public Result<String> helloResult(String source){
        // 创建一个新的返回值对象
        Result<String> result = new Result<>();
        // 设置返回码
        result.setCode(200);
        // 设置返回消息
        result.setMessage("success");
        // 设置返回数据
        result.setData(source);

        // 返回统一返回值
        return result;
    }
}
