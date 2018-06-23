package net.abcbook.learn.exception.handler;

import net.abcbook.learn.exception.enums.ResultEnum;
import net.abcbook.learn.exception.exception.MyException;
import net.abcbook.learn.exception.result.Result;
import net.abcbook.learn.exception.utils.ResultUtil;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author summer
 * @date 2018/6/22 下午2:20
 */
@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(MyException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Result exceptionHandler(MyException myException){

        Result result = ResultUtil.error(ResultEnum.ERROR);
        result.setMessage(myException.getMessage());
        return result;
    }

}
