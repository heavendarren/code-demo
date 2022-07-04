package cn.yunxiang.demo.base;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.db.Entity;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.util.List;

/**
 * @author wangqx
 * @description TODO
 * @date 2022/6/16
 */
public class BaseConverter<V,T> {

    /**
     * dto转vo
     * @param t
     * @return
     */
    public V convertToVO(T t){
        return null;
    }

    /**
     * dto列表转vo
     * @param tList
     * @return
     */
    public List<V> convertToVO(List<T> tList){
        return null;
    }
    /**
     * dto分页转vo
     * @param tPage
     * @return
     */
    public Page<V> convertToVO(Page<T> tPage){
        return null;
    }




    /**
     * dto转po
     * @param v
     * @return
     */
    public T transformToEntity(V v){
        return null;
    }


}
