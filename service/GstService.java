package com.example.gst.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gst.dao.GstDao;
import com.example.gst.entity.Gst;

@Service
public class GstService {
	@Autowired
	GstDao gstDao;
	public String adddetail (Gst g) {
		return gstDao.adddetail(g);
	}
	public String multidetail (List<Gst> g) {
		return gstDao.multidetail(g);
	
	
	
}
	/*public int getByhsncode(int h) {
		// TODO Auto-generated method stub
		return gstDao.getByhsncode(h);
	}*/
	public int getBypercentage(int h) {
		
		return gstDao.getBypercentage(h);
	}
	
	}

