package net.abcbook.learn.result.controller;

import net.abcbook.learn.result.enums.ResultEnum;
import net.abcbook.learn.result.result.Result;
import net.abcbook.learn.result.utils.ResultUtil;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author summer
 * @date 2018/6/21 下午2:55
 * 使用 ResultUtil 生成返回数据的方法
 */
@RestController
@RequestMapping("/util")
public class UtilResultController {

    /**
     * @author summer
     * @date 2018/6/21 下午3:13
     * @return net.abcbook.learn.result.result.Result
     * @description 返回未知错误信息
     */
    @GetMapping("/error")
    public Result error(){
        return ResultUtil.error();
    }

    /**
     * @author summer
     * @date 2018/6/21 下午3:14
     * @param resultEnum 要返回的错误枚举
     * @return net.abcbook.learn.result.result.Result
     * @description 根据传入的枚举, 生成返回的错误信息对象
     */
    @GetMapping("/error/enum")
    public Result enumError(ResultEnum resultEnum){
        return ResultUtil.error(resultEnum);
    }

    /**
     * @author summer
     * @date 2018/6/21 下午3:15
     * @return net.abcbook.learn.result.result.Result
     * @description 返回没有数据的正确值
     */
    @GetMapping("/success")
    public Result success(){
        return ResultUtil.success();
    }

    /**
     * @author summer
     * @date 2018/6/21 下午3:16
     * @param resultData 传入的数据
     * @return net.abcbook.learn.result.result.Result
     * @description 根据传入的值, 封装成统一的返回值, 并返回
     */
    @PostMapping("/success/data")
    public Result successData(@RequestParam Map<String, Object> resultData){
        return ResultUtil.success(resultData);
    }
}
