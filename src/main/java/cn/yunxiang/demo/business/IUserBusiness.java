package cn.yunxiang.demo.business;

import cn.yunxiang.demo.domain.vo.UserVO;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.io.Serializable;
import java.util.List;

/**
 * @author wangqx
 * @description TODO
 * @date 2022/6/16
 */
public interface IUserBusiness  {
    /**
     * 保存
     * @param t
     * @return
     */
    boolean save(UserVO t);

    UserVO get(Serializable id);

    List<UserVO>  list(UserVO d);

    Page<UserVO> page(UserVO d);

    boolean delete(Serializable id);
}
