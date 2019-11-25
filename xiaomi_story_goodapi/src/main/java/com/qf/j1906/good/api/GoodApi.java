package com.qf.j1906.good.api;

import com.qf.j1906.good.po.Good;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by Lmy on 2019/11/20.
 */
@FeignClient(value = "xiaomi-good")
public interface GoodApi {
    /*
      查询所有商品
     */
    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public List<Good> findAll();

    /*
    根据ID查询商品
     */

    @RequestMapping(value = "findById",method = RequestMethod.GET)
    public Good findById(@RequestParam("goodId")int goodId);
    /*
    根据Id删除商品
     */
    @RequestMapping(value = "deleteById",method = RequestMethod.DELETE)
    public Boolean deleteById(@RequestParam("goodId") int goodId);

    /*
    修改商品信息
     */
   @RequestMapping(value = "update",method = RequestMethod.PUT)
    public Boolean updateGood(Good good);

   /*
   模糊查询
    */
   @RequestMapping(value = "selectLike",method = RequestMethod.GET)
    public List<Good> selectLike(@RequestParam("ss") String ss);




}
