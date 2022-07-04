package cn.yunxiang.demo.event;

import cn.yunxiang.demo.domain.po.User;
import org.springframework.context.ApplicationEvent;

/**
 * @author wangqx
 * @description 用户注册事件
 * @date 2022/6/27
 */
public class UserRegisterEvent extends ApplicationEvent {


    public UserRegisterEvent(User user) {
        super(user);
    }
}
