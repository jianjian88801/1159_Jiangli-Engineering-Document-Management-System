package com.entity.model;

import com.entity.WendangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 资料信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class WendangModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 资料标题
     */
    private String wendangName;


    /**
     * 资料类型
     */
    private Integer wendangTypes;


    /**
     * 二级分类
     */
    private Integer wendangErjiTypes;


    /**
     * 资料封面
     */
    private String wendangPhoto;


    /**
     * 文件
     */
    private String wendangFile;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 审核结果
     */
    private Integer wendangYesnoTypes;


    /**
     * 资料详情
     */
    private String wendangContent;


    /**
     * 假删
     */
    private Integer wendangDelete;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：资料标题
	 */
    public String getWendangName() {
        return wendangName;
    }


    /**
	 * 设置：资料标题
	 */
    public void setWendangName(String wendangName) {
        this.wendangName = wendangName;
    }
    /**
	 * 获取：资料类型
	 */
    public Integer getWendangTypes() {
        return wendangTypes;
    }


    /**
	 * 设置：资料类型
	 */
    public void setWendangTypes(Integer wendangTypes) {
        this.wendangTypes = wendangTypes;
    }
    /**
	 * 获取：二级分类
	 */
    public Integer getWendangErjiTypes() {
        return wendangErjiTypes;
    }


    /**
	 * 设置：二级分类
	 */
    public void setWendangErjiTypes(Integer wendangErjiTypes) {
        this.wendangErjiTypes = wendangErjiTypes;
    }
    /**
	 * 获取：资料封面
	 */
    public String getWendangPhoto() {
        return wendangPhoto;
    }


    /**
	 * 设置：资料封面
	 */
    public void setWendangPhoto(String wendangPhoto) {
        this.wendangPhoto = wendangPhoto;
    }
    /**
	 * 获取：文件
	 */
    public String getWendangFile() {
        return wendangFile;
    }


    /**
	 * 设置：文件
	 */
    public void setWendangFile(String wendangFile) {
        this.wendangFile = wendangFile;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：审核结果
	 */
    public Integer getWendangYesnoTypes() {
        return wendangYesnoTypes;
    }


    /**
	 * 设置：审核结果
	 */
    public void setWendangYesnoTypes(Integer wendangYesnoTypes) {
        this.wendangYesnoTypes = wendangYesnoTypes;
    }
    /**
	 * 获取：资料详情
	 */
    public String getWendangContent() {
        return wendangContent;
    }


    /**
	 * 设置：资料详情
	 */
    public void setWendangContent(String wendangContent) {
        this.wendangContent = wendangContent;
    }
    /**
	 * 获取：假删
	 */
    public Integer getWendangDelete() {
        return wendangDelete;
    }


    /**
	 * 设置：假删
	 */
    public void setWendangDelete(Integer wendangDelete) {
        this.wendangDelete = wendangDelete;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
