package com.qf.j1906.config;


import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 通用基础mapper
 * Created by Lmy on 2019/11/20.
 */
public interface BaseMapper<T> extends Mapper<T>,MySqlMapper<T> {
}
