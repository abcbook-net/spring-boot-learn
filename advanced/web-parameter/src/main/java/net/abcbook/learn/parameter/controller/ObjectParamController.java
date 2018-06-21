package net.abcbook.learn.parameter.controller;

import net.abcbook.learn.parameter.model.User;
import org.springframework.web.bind.annotation.*;

/**
 * @author summer
 * @date 2017/12/2 下午7:41
 * 不使用任何注解, 直接接收参数的情况测试
 */
@RestController
@RequestMapping("/object")
public class ObjectParamController {

    /**
     * @param user 想要获取的用户对象
     * @return net.abcbook.learn.parameter.model.User
     * @author summer
     * @date 2018/6/19 下午5:33
     * @description 测试前台 get 传值的方式
     * 支持: 直接在地址中拼接属性的名称进行传值, 传递后即可直接封装成对象
     */
    @GetMapping
    public User getUser(User user) {
        return user;
    }

    /**
     * @param user 想要获取的用户对象
     * @return net.abcbook.learn.parameter.model.User
     * @author summer
     * @date 2018/6/19 下午5:34
     * @description 测试前台 post 传值的方式
     * 支持形式:(同时传值时会拼接接收, 以逗号隔开)
     * 1. 直接接收在地址中拼接属性,
     * 2. 接收在 body 中以 form-data 的形式进行传值
     * 不支持形式:
     * 1. 无法接收 application/json 形式的传值
     */
    @PostMapping
    public User postUser(User user) {
        return user;
    }

    /**
     * @param user 想要获取的用户对象
     * @return net.abcbook.learn.parameter.model.User
     * @author summer
     * @date 2018/6/19 下午5:37
     * @description 测试前台 put 请求方式传值
     * 只能接收地址中拼接的形式传值
     */
    @PutMapping
    public User putUser(User user) {
        return user;
    }

    /**
     * @param user 想要获取的用户对象
     * @return net.abcbook.learn.parameter.model.User
     * @author summer
     * @date 2018/6/19 下午5:37
     * @description 测试前台 delete 请求方式传值
     * 只能接收地址中拼接的形式传值
     */
    @DeleteMapping
    public User deleteUser(User user) {
        return user;
    }
}
