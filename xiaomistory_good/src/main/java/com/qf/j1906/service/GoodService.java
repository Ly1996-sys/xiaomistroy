package com.qf.j1906.service;

import com.qf.j1906.good.po.Good;
import java.util.List;

/**
 * Created by Lmy on 2019/11/20.
 */
public interface GoodService {
    //查询所有商品
    public List<Good> findAll();
    //根据Id查询
    public Good finById(int goodId);
    //根据Id删除单个商品
    public Boolean deleteById(int goodId);
    //修改商品信息
    public Boolean updateGood(Good good);
    //模糊查询
    public List<Good> selectLike(String ss);


}
