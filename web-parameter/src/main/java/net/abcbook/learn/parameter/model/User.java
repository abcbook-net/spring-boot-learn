package net.abcbook.learn.parameter.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author summer
 * @date 2018/6/19 下午5:20
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    private String username;
    private String password;
    private String firstName;
    private Integer age;
}
