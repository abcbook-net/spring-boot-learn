package net.abcbook.learn.exception.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import net.abcbook.learn.exception.enums.ResultEnum;

/**
 * @author summer
 * @date 2018/6/22 下午5:09
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class MyException extends RuntimeException {

    private Integer code;

    public MyException() {
        super("自定义异常");
    }

    private MyException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public MyException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
