package cn.yunxiang.demo.event.listener;

import cn.yunxiang.demo.event.UserRegisterEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author wangqx
 * @description 用户注册事件监听器
 * @date 2022/6/27
 */
@Component
public class UserRegisterEventListener implements ApplicationListener<UserRegisterEvent> {


    @Override
    public void onApplicationEvent(UserRegisterEvent event) {
        System.out.println("start event handle");
        //todo 发送邮件
    }
}
