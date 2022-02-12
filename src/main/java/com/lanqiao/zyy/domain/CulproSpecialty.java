package com.lanqiao.zyy.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 专科信息记录表
 * @TableName tb_culpro_specialty
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CulproSpecialty implements Serializable {
    /**
     * 自增id
     */
    private Integer itemid;

    /**
     * UUID
     */
    private String itemcode;

    /**
     * 专科名称
     */
    private String specialtyName;

    /**
     * 科室级别
     */
    private String specialtyLevel;

    /**
     * 优势病种
     */
    private String specialtyDisease;

    /**
     * 科室简介
     */
    private String specialtyBriefIntroduce;

    /**
     * 科室介绍
     */
    private String specialtyIntroduce;

    /**
     * 科室电话
     */
    private String specialtyPhone;

    /**
     * 地址省份
     */
    private String specialtyAddressPro;

    /**
     * 地址市区
     */
    private String specialtyAddressCity;

    /**
     * 地址县区
     */
    private String specialtyAddressCounty;

    /**
     * 手动输入地址
     */
    private String specialtyAddress;

    /**
     * 链接
     */
    private String specialtyLink;

    /**
     * 数据状态
     */
    private String specialtyStatus;

    /**
     * 创建者
     */
    private String creater;

    /**
     * 创建时间
     */
    private Date itemcreateat;

    /**
     * 修改人
     */
    private String updater;

    /**
     * 修改时间
     */
    private Date itemupdateat;

    private static final long serialVersionUID = 1L;
}