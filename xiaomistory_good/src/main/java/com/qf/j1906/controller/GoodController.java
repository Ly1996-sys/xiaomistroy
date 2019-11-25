package com.qf.j1906.controller;

import com.qf.j1906.good.po.Good;
import com.qf.j1906.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Lmy on 2019/11/20.
 */

@RestController
@RequestMapping("/api")
public class GoodController {

    @Autowired
    private GoodService goodService;
    /*
    查询所有商品
     */
    @CrossOrigin
    @RequestMapping(value = "/findAllGoods",method = RequestMethod.GET)
    public List<Good> findAll(){
        List<Good> all = goodService.findAll();
        return all;
    }
    /*
    根据Id查询商品
     */

    @RequestMapping(value = "findById",method = RequestMethod.GET)
    public Good findById(@RequestParam("goodId") int goodId){
        Good good = goodService.finById(goodId);
        return good;
    }
    /*
    根据Id删除商品
     */
    @CrossOrigin
    @RequestMapping(value = "deleteById/",method = RequestMethod.DELETE)
    public Boolean deleteById(@PathVariable("goodId") int goodId){
        if (goodId>0){
            Good goodss = goodService.finById(goodId);
            if (goodss!=null){
                Boolean b1 = goodService.deleteById(goodId);
                return b1;
        }
            return false;
        }
        return false;
    }

    /*
    修改商品
     */
    @CrossOrigin
    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public Boolean updateGood(@RequestBody Good good){

        Boolean aBoolean = goodService.updateGood(good);
        return aBoolean;
    }

    @RequestMapping(value = "selectLike",method = RequestMethod.GET)
    public List<Good> selectLike( @RequestParam("ss") String ss){
        List<Good> selectLike = goodService.selectLike(ss);
        return selectLike;
    }



}
