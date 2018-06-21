package net.abcbook.learn.parameter.controller;

import net.abcbook.learn.parameter.model.People;
import net.abcbook.learn.parameter.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author summer
 * @date 2018/6/20 下午2:21
 */
@RestController
@RequestMapping("/other")
public class OtherController {

    /**
     * @param user   想要获取的参数 user
     * @param people 想要获取的参数 people
     * @return java.util.Map<java.lang.String   ,   java.lang.Object>
     * @author summer
     * @date 2018/6/20 下午2:52
     * @description 使用 @RequestBody 的方式一下获取两个值的方法
     * 注: 此方法行不通
     */
    @Deprecated
    @PostMapping("/two")
    public Map<String, Object> postMoreThanOneParameter(@RequestBody User user, @RequestBody People people) {
        Map<String, Object> result = new HashMap<>();
        result.put("user", user);
        result.put("people", people);
        return result;
    }


    /**
     * @param stringList 获取的集合列表
     * @return java.util.List<java.lang.String>
     * @author summer
     * @date 2018/6/20 下午2:58
     * @description 使用 post 请求, 从 RequestBody 中获取封装好的数组
     * 注: 传值时, 直接在 application/json 中填写集合即可
     * 例: ["abc","123"]
     */
    @PostMapping("/list/string")
    public List<String> postStringList(@RequestBody List<String> stringList) {
        return stringList;
    }

    /**
     * @param userList 前端传入的用户集合
     * @return java.util.List<net.abcbook.learn.parameter.model.User>
     * @author summer
     * @date 2018/6/20 下午3:13
     * @description post 请求方式, 通过 @RequestBody 方式获取前端传入的用户集合
     * 注: 传值时, 直接在 application/json 中填写对象的集合即可
     * 例:
     * [
     * {
     * "username": "abc",
     * "password": null,
     * "firstName": null,
     * "age": null
     * },
     * {
     * "username": "123",
     * "password": null,
     * "firstName": null,
     * "age": null
     * }
     * ]
     */
    @PostMapping("/list/user")
    public List<User> postUserList(@RequestBody List<User> userList) {
        return userList;
    }
}
