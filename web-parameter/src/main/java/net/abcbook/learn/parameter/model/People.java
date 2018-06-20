package net.abcbook.learn.parameter.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author summer
 * @date 2018/6/19 下午5:20
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class People implements Serializable {
    private String username;
    private String password;
    private String firstName;
    private Integer age;
}
