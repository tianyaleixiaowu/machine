package com.tianyalei.hsl.core.user;

import com.tianyalei.hsl.global.bean.BaseData;
import com.tianyalei.hsl.global.bean.ResultGenerator;
import com.tianyalei.hsl.global.bean.request.UserAddRequestModel;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @author wuweifeng wrote on 2018/11/23.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    //@GetMapping("")
    //public BaseData find() {
    //    return ResultGenerator.genSuccessResult(userService.findAll());
    //}

    @GetMapping("/{id}")
    public BaseData one(@PathVariable Long id) {
        return ResultGenerator.genSuccessResult(userService.find(id));
    }

    @PutMapping("/password")
    public BaseData password(String oldPassword, String password) {
        return userService.updatePassword(oldPassword, password);
    }

    @PostMapping
    public BaseData add(@Valid UserAddRequestModel userAddRequestModel, BindingResult bindingResult) {
        return ResultGenerator.genSuccessResult(userService.add(userAddRequestModel));
    }

    @PutMapping
    public BaseData update(@Valid UserAddRequestModel userAddRequestModel, BindingResult bindingResult) {
        return ResultGenerator.genSuccessResult(userService.update(userAddRequestModel));
    }

    @DeleteMapping("/{id}")
    public BaseData delete(@PathVariable Long id) {
        userService.delete(id);
        return ResultGenerator.genSuccessResult();
    }
}
