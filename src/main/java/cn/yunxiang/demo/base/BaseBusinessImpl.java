package cn.yunxiang.demo.base;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author wangqx
 * @description TODO
 * @date 2022/6/16
 */
@RequiredArgsConstructor
public class BaseBusinessImpl <S extends IService,C extends BaseConverter,D,T,V> implements  BaseBusiness<D,T,V>{
    private final S service;

    private final C converter;

    @Override
    public boolean save(D dto) {

//        T t= converter.transformToEntity(dto);
//        return service.save(t);
        return true;
    }

    @Override
    public V get(Serializable id) {
        return null;
    }

    @Override
    public List<V> list(D d) {
        return null;
    }

    @Override
    public Page<V> page(D d) {
        return null;
    }

    @Override
    public boolean delete(Serializable id) {
        return false;
    }


}
