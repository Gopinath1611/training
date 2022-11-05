package com.example.gst.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.gst.entity.Gst;
import com.example.gst.repository.GstRepository;

@Repository
public class GstDao {
	@Autowired
	GstRepository gstrepo;
	public String adddetail (Gst g) {
		gstrepo.save(g);
		return "Successfully GST Added";
	}
	public String multidetail (List <Gst> g) {
		gstrepo.saveAll(g);
		return "Successfully GST Added";

}
	public int getByhsncode(int h) {
		
		return gstrepo.getPercentageByHsncode(h);
	}
}
