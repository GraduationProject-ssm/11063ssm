package com.dao;

import com.entity.ShebeijieyongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShebeijieyongVO;
import com.entity.view.ShebeijieyongView;


/**
 * 设备借用
 * 
 * @author 
 * @email 
 * @date 2021-03-09 10:45:47
 */
public interface ShebeijieyongDao extends BaseMapper<ShebeijieyongEntity> {
	
	List<ShebeijieyongVO> selectListVO(@Param("ew") Wrapper<ShebeijieyongEntity> wrapper);
	
	ShebeijieyongVO selectVO(@Param("ew") Wrapper<ShebeijieyongEntity> wrapper);
	
	List<ShebeijieyongView> selectListView(@Param("ew") Wrapper<ShebeijieyongEntity> wrapper);

	List<ShebeijieyongView> selectListView(Pagination page,@Param("ew") Wrapper<ShebeijieyongEntity> wrapper);
	
	ShebeijieyongView selectView(@Param("ew") Wrapper<ShebeijieyongEntity> wrapper);
	
}
