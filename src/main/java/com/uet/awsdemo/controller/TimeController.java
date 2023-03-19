package com.uet.awsdemo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TimeController {
	@GetMapping("/time")
	public ResponseEntity<String> getTime() {
		String str = "";
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				for (int k = 0; k < 100; k++) {
					str += "a";
				}
			}
		}
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		sdf.setTimeZone(TimeZone.getTimeZone("Asia/Saigon"));
		String date = sdf.format(new Date());
		return ResponseEntity.ok(date + "s");
	}
}
