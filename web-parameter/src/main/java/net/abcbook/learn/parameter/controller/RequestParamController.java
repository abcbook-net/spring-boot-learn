package net.abcbook.learn.parameter.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author summer
 * @date 2017/12/2 下午6:31
 */
@RestController
@RequestMapping("/param")
public class RequestParamController {

    /**
     * @author summer
     * @date 2018/6/20 下午1:55
     * @param userId 前端传入的用户 id 信息
     * @return java.lang.String
     * @description 只接收地址中的值
     */
    @GetMapping
    public String getUser(@RequestParam("userId") String userId){
        return userId;
    }

    /**
     * @author summer
     * @date 2018/6/20 下午1:55
     * @param userId 前端传入的用户 id 信息
     * @return java.lang.String
     * @description 既接收地址中的值, 也接收 from-data 中的值
     * 注: 若两个地方均传值, 获取到的值是拼接后的结果
     */
    @PostMapping
    public String postUser(@RequestParam("userId") String userId){
        return userId;
    }

    /**
     * @author summer
     * @date 2018/6/20 下午1:55
     * @param userId 前端传入的用户 id 信息
     * @return java.lang.String
     * @description 只接收地址中的值
     */
    @PutMapping
    public String putUser(@RequestParam("userId") String userId){
        return userId;
    }

    /**
     * @author summer
     * @date 2018/6/20 下午1:55
     * @param userId 前端传入的用户 id 信息
     * @return java.lang.String
     * @description 只接收地址中的值
     */
    @DeleteMapping
    public String deleteUser(@RequestParam("userId") String userId){
        return userId;
    }
}
