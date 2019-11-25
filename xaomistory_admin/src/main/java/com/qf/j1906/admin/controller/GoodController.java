package com.qf.j1906.admin.controller;

import com.qf.j1906.good.api.GoodApi;
import com.qf.j1906.good.po.Good;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Lmy on 2019/11/22.
 */
@RestController
public class GoodController {
@Autowired
private GoodApi goodApi;

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)

    public List<Good> findAll(){
       List<Good> all = goodApi.findAll();
       return all;
   }



}
