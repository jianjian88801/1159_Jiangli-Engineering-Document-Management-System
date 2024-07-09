package com.entity.view;

import com.entity.WendangEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 资料信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("wendang")
public class WendangView extends WendangEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 资料类型的值
		*/
		private String wendangValue;
		/**
		* 二级分类的值
		*/
		private String wendangErjiValue;
		/**
		* 审核结果的值
		*/
		private String wendangYesnoValue;



		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 照片
			*/
			private String yonghuPhoto;
			/**
			* 专业
			*/
			private Integer yonghuTypes;
				/**
				* 专业的值
				*/
				private String yonghuValue;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public WendangView() {

	}

	public WendangView(WendangEntity wendangEntity) {
		try {
			BeanUtils.copyProperties(this, wendangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 资料类型的值
			*/
			public String getWendangValue() {
				return wendangValue;
			}
			/**
			* 设置： 资料类型的值
			*/
			public void setWendangValue(String wendangValue) {
				this.wendangValue = wendangValue;
			}
			/**
			* 获取： 二级分类的值
			*/
			public String getWendangErjiValue() {
				return wendangErjiValue;
			}
			/**
			* 设置： 二级分类的值
			*/
			public void setWendangErjiValue(String wendangErjiValue) {
				this.wendangErjiValue = wendangErjiValue;
			}
			/**
			* 获取： 审核结果的值
			*/
			public String getWendangYesnoValue() {
				return wendangYesnoValue;
			}
			/**
			* 设置： 审核结果的值
			*/
			public void setWendangYesnoValue(String wendangYesnoValue) {
				this.wendangYesnoValue = wendangYesnoValue;
			}












				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 专业
					*/
					public Integer getYonghuTypes() {
						return yonghuTypes;
					}
					/**
					* 设置： 专业
					*/
					public void setYonghuTypes(Integer yonghuTypes) {
						this.yonghuTypes = yonghuTypes;
					}


						/**
						* 获取： 专业的值
						*/
						public String getYonghuValue() {
							return yonghuValue;
						}
						/**
						* 设置： 专业的值
						*/
						public void setYonghuValue(String yonghuValue) {
							this.yonghuValue = yonghuValue;
						}
					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}


}
