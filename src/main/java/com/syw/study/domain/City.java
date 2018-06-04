package com.syw.study.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * @author shiyanwu
 * 城市实体
 */
@Data
public class City {

    /**
     * 城市编号
     */
    @Id
    private Long id;

    /**
     * 省份编号
     */
    private Long provinceId;

    /**
     * 城市名称
     */
    private String cityName;

    /**
     * 描述
     */
    private String description;
}
