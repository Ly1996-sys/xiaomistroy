package com.qf.j1906.service.impl;

import com.qf.j1906.good.po.Good;
import com.qf.j1906.mapper.GoodMapper;
import com.qf.j1906.service.GoodService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;
/**
 * Created by Lmy on 2019/11/20.
 */
@Service
public class GoodServiceImpl implements GoodService {
    @Resource
    private GoodMapper goodMapper;

    @Override
    public List<Good> selectLike(String ss) {
        List<Good> goodList = goodMapper.selectByExample(ss);
        return goodList;
    }

    @Override
    public List<Good> findAll() {
        List<Good> goods = goodMapper.selectAll();
        return goods;
    }

    @Override
    public Boolean updateGood(Good good) {
        System.out.println("good---controller---"+good);

        int j = goodMapper.updateByPrimaryKey(good);
        if (j>0){
            return true;
        }
        return false;
    }

    @Override
    public Boolean deleteById(int goodId) {
        int i = goodMapper.deleteByPrimaryKey(goodId);
        if (i>0){
            return true;
        }
        return false;
    }

    @Override
    public Good finById(int goodId) {
        Good good = goodMapper.selectByPrimaryKey(goodId);
        return good;
    }
}
