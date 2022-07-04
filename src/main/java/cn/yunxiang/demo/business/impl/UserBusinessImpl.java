package cn.yunxiang.demo.business.impl;

import cn.yunxiang.demo.business.IUserBusiness;
import cn.yunxiang.demo.converter.UserConverter;
import cn.yunxiang.demo.domain.po.User;
import cn.yunxiang.demo.domain.vo.UserVO;
import cn.yunxiang.demo.event.UserRegisterEvent;
import cn.yunxiang.demo.service.IUserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * @author wangqx
 * @description 用户业务层
 * @date 2022/6/16
 */
@Component
@RequiredArgsConstructor
public class UserBusinessImpl  implements IUserBusiness {

    private final IUserService userService;

    private final UserConverter userConverter;

    private final ApplicationEventPublisher publisher;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean save(UserVO vo) {
        User user=userConverter.transformToEntity( vo);
        userService.save(user);
        UserRegisterEvent event=new UserRegisterEvent(user);
        publisher.publishEvent(event);
        return true;
    }

    @Override
    public List<UserVO> list(UserVO d) {
        List<User> userList=userService.list();
        return userConverter.convertToVO(userList);
    }

    @Override
    public Page<UserVO> page(UserVO d) {
        Page<User> userPage=userService.page(new Page<>(),new QueryWrapper<User>(
        ));
        return userConverter.convertToVO(userPage);
    }

    @Override
    public UserVO get(Serializable id) {
        return null;
    }

    @Override
    public boolean delete(Serializable id) {
        return false;
    }
}
