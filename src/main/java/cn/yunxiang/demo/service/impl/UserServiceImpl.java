package cn.yunxiang.demo.service.impl;

import cn.yunxiang.demo.domain.po.User;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.yunxiang.demo.dao.UserMapper;
import cn.yunxiang.demo.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author wangqx
 * @description 用户的服务层实现
 * @date 2022/6/16
 */
@RequiredArgsConstructor
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
