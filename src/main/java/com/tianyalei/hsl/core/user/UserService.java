package com.tianyalei.hsl.core.user;

import com.tianyalei.hsl.global.UserKit;
import com.tianyalei.hsl.global.bean.BaseData;
import com.tianyalei.hsl.global.bean.ResultGenerator;
import com.tianyalei.hsl.global.bean.request.UserAddRequestModel;
import com.xiaoleilu.hutool.util.BeanUtil;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author wuweifeng wrote on 2018/11/23.
 */
@Component
public class UserService {
    @Resource
    private PtUserManager ptUserManager;
    @Resource
    private UserKit userKit;
    @Resource
    private ApplicationEventPublisher eventPublisher;

    public BaseData updatePassword(String oldPass, String pass) {
        Long userId = userKit.getCurrentUserId();
        PtUser ptUser = ptUserManager.find(userId);
        if (!ptUser.getPassword().equals(oldPass)) {
            return ResultGenerator.genFailResult("旧密码不正确");
        }

        ptUser.setPassword(pass);
        ptUserManager.update(ptUser);
        return ResultGenerator.genSuccessResult("修改成功");
    }

    //public List<UserListVO> findAll() {
    //    List<PtUser> list = ptUserManager.findAll();
    //    return list.stream().map(this::parse).collect(Collectors.toList());
    //}

    public PtUser find(Long id) {
        return ptUserManager.find(id);
    }


    public PtUser add(UserAddRequestModel userAddRequestModel) {
        PtUser ptUser = new PtUser();
        BeanUtil.copyProperties(userAddRequestModel, ptUser);
        ptUser = ptUserManager.add(ptUser);

        return ptUser;
    }

    public PtUser update(UserAddRequestModel userAddRequestModel) {
        PtUser ptUser = ptUserManager.find(userAddRequestModel.getId());
        BeanUtil.copyProperties(userAddRequestModel, ptUser, BeanUtil.CopyOptions.create().setIgnoreNullValue(true));

        return ptUserManager.update(ptUser);
    }

    public void delete(Long id) {
        ptUserManager.delete(ptUserManager.find(id));
    }
}
