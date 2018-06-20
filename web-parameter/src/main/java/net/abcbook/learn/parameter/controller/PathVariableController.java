package net.abcbook.learn.parameter.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author summer
 * @date 2017/12/2 下午5:45
 * 测试 path 中的参数获取
 */
@RestController
@RequestMapping("/variable")
public class PathVariableController {

    /**
     * @author summer
     * @date 2018/6/19 下午5:53
     * @param userId 前端从 path 中传入的值
     * @return java.lang.String
     * @description get 形式传值;
     * 正常接收
     */
    @GetMapping("/{userId}")
    public String getUser(@PathVariable("userId") String userId){
        return userId;
    }

    /**
     * @author summer
     * @date 2018/6/19 下午5:53
     * @param userId 前端从 path 中传入的值
     * @return java.lang.String
     * @description post 形式传值;
     * 正常接收
     */
    @PostMapping("/{userId}")
    public String postUser(@PathVariable("userId") String userId){
        return userId;
    }

    /**
     * @author summer
     * @date 2018/6/19 下午5:53
     * @param userId 前端从 path 中传入的值
     * @return java.lang.String
     * @description put 形式传值;
     * 正常接收
     */
    @PutMapping("/{userId}")
    public String putUser(@PathVariable("userId") String userId){
        return userId;
    }

    /**
     * @author summer
     * @date 2018/6/19 下午5:53
     * @param userId 前端从 path 中传入的值
     * @return java.lang.String
     * @description DELETE 形式传值;
     * 正常接收
     */
    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable("userId") String userId){
        return userId;
    }

}
