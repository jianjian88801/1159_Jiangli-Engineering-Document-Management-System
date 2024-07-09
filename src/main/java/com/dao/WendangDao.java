package com.dao;

import com.entity.WendangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.WendangView;

/**
 * 资料信息 Dao 接口
 *
 * @author 
 */
public interface WendangDao extends BaseMapper<WendangEntity> {

   List<WendangView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
