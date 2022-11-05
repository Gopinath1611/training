package com.example.gst.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.gst.entity.Gst;
import com.example.gst.service.GstService;

@RestController
public class GstController {
	@Autowired
	GstService gstser;
	@PostMapping (value="/addgst")
	public String adddetail (@RequestBody Gst g) {
		return gstser.adddetail(g);
		
	}
	
@PostMapping(value="/multi")
	
	public String multiDetail(@RequestBody List<Gst> g) {
		return gstser.multidetail(g);
}

@GetMapping(value="Percen/{h}")

public int getByHsncode(@PathVariable int h) {
	return gstser.getByhsncode(h);
}
}




