package cn.yunxiang.demo.converter;

import cn.hutool.core.bean.BeanUtil;
import cn.yunxiang.demo.domain.po.User;
import cn.yunxiang.demo.base.BaseConverter;
import cn.yunxiang.demo.domain.vo.UserVO;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wangqx
 * @description 转换器
 * @date 2022/6/16
 */
@Component
public class UserConverter  extends BaseConverter<UserVO, User> {

    @Override
    public Page<UserVO> convertToVO(Page<User> userPage) {
        Page<UserVO> userVOPage=new Page<>();
        userVOPage.setRecords(this.convertToVO(userPage.getRecords()));
        return userVOPage;
    }

    @Override
    public UserVO convertToVO(User user) {
        return BeanUtil.copyProperties(user,UserVO.class);
    }

    @Override
    public List<UserVO> convertToVO(List<User> users) {
        return users.stream().map(s->convertToVO(s)).collect(Collectors.toList());
    }

    @Override
    public User transformToEntity(UserVO vo) {
        return BeanUtil.copyProperties(vo,User.class);
    }
}
