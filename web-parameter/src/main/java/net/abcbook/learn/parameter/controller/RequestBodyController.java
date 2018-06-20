package net.abcbook.learn.parameter.controller;

import net.abcbook.learn.parameter.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author summer
 * @date 2017/12/2 下午7:06
 * 使用 RequestBody 的形式获取参数
 */
@RestController
@RequestMapping("/body")
public class RequestBodyController {

    /**
     * @author summer
     * @date 2018/6/19 下午5:58
     * @param user 想要获取的 user 对象
     * @return net.abcbook.learn.parameter.model.User
     * @description 使用 get 请求, 通过 @RequestBody 的形式获取封装后的 user 对象
     * 此形式不能获取到值
     */
    @Deprecated
    @GetMapping
    public User getUser(@RequestBody User user){
        return user;
    }

//    @GetMapping
//    public String getUserId(@RequestBody String userId){
//        return userId;
//    }

    /**
     * @author summer
     * @date 2018/6/20 上午11:59
     * @param userMap 想要获取的数据对象
     * @return java.util.Map<java.lang.String,java.lang.Object>
     * @description 使用 post 请求, 通过 @RequestBody 的形式获取封装后的 map 对象
     * 只能接收 application/json 中的内容
     */
    @PostMapping("/map")
    public Map<String, Object> postUserId(@RequestBody Map<String, Object> userMap){
        return userMap;
    }

    /**
     * @author summer
     * @date 2018/6/20 下午1:47
     * @param user 想要获取的 user 对象
     * @return net.abcbook.learn.parameter.model.User
     * @description 使用 put 请求, 通过 @RequestBody 的形式获取封装后的 user 对象
     * 只能接收 application/json 中的内容
     */
    @PutMapping
    public User putUser(@RequestBody User user){
        return user;
    }

    /**
     * @author summer
     * @date 2018/6/20 下午1:53
     * @param user 想要获取的 user 对象
     * @return net.abcbook.learn.parameter.model.User
     * @description 使用 delete 请求, 通过 @RequestBody 的形式获取封装后的 user 对象
     * 只能接收 application/json 中的内容
     */
    @DeleteMapping
    public User deleteUser(@RequestBody User user){
        return user;
    }
}
