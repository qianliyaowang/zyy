package com.lanqiao.zyy.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 数据记录表
 * @TableName tb_culpro_data
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CulproData implements Serializable {
    /**
     * 自增id
     */
    private Integer itemid;

    /**
     * UUID
     */
    private String itemcode;

    /**
     * 新闻轮播、新闻、政策法规、规章制度、领导讲话、办事流程标题；公告名称
     */
    private String dataTitle;

    /**
     * 新闻轮播图位置
     */
    private String dataLocation;

    /**
     * 新闻作者；办事流程作者
     */
    private String dataAuthor;

    /**
     * 新闻、公告、政策法规、规章制度、领导讲话、办事流程来源
     */
    private String dataSource;

    /**
     * 政策法规文件类型
     */
    private String dataFileType;

    /**
     * 浏览次数
     */
    private Integer visitNum;

    /**
     * 正文
     */
    private String dataContent;

    /**
     * 延时发布
     */
    private Date dataDelayedRelease;

    /**
     * 数据状态
     */
    private String dataStatus;

    /**
     * 数据类型(用来区分）
     */
    private String dataType;

    /**
     * 是否发布到河北中医药网
     */
    private String releaseOrNot;

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