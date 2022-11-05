package com.example.gst.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.gst.entity.Gst;

public interface GstRepository extends JpaRepository <Gst,Integer>{
	
/*@Query(value="SELECT percentage FROM product.gst where hsn_Code=:h",nativeQuery=true )
	
	public int getPercentageByHsncode(@Param("h")int h);
	}*/





}
