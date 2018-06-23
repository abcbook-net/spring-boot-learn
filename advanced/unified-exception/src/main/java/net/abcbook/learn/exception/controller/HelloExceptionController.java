package net.abcbook.learn.exception.controller;

import net.abcbook.learn.exception.enums.ResultEnum;
import net.abcbook.learn.exception.exception.MyException;
import net.abcbook.learn.exception.result.Result;
import net.abcbook.learn.exception.utils.ResultUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author summer
 * @date 2018/6/22 下午2:06
 */
@Controller
@RequestMapping("/hello")
public class HelloExceptionController {

    @GetMapping("/html")
    public String templateException(Integer code){
        if(code != null && code.equals(500)){
            throw new MyException(ResultEnum.ERROR);
        }

        return "hello";
    }

    @GetMapping
    @ResponseBody
    public Result hello (Integer code){
        if(code != null && code.equals(500)){
            throw new MyException(ResultEnum.ERROR);
        }

        return ResultUtil.success(code);
    }
}
