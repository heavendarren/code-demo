package cn.yunxiang.demo.base;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.io.Serializable;
import java.util.List;

/**
 * @author wangqx
 * @description TODO
 * @date 2022/6/16
 */
public interface BaseBusiness <D,T,V>{
    /**
     * 保存
     * @param t
     * @return
     */
    boolean save(D t);

    V  get(Serializable id);

    List<V>  list(D d);

    Page<V> page(D d);

    boolean delete(Serializable id);
}
