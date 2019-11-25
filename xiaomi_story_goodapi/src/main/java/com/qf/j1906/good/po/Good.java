package com.qf.j1906.good.po;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

/**
 * Created by Lmy on 2019/11/20.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "GOODS")
public class Good {
    @Id
    @Column(name = "goodId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //主键策略
    private Integer goodId;
    @Column(name = "goodName")
    private String goodName;
    @Column(name = "goodPrice")
    private Double goodPrice;
    @Column(name = "goodCharac")
    private String goodCharac;
    @Column(name = "goodImg")
    private String goodImg;
    @Column(name = "goodType")
    private String goodType;

}
