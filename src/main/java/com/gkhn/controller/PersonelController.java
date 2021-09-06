package com.gkhn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonelController {

	@GetMapping("/")
	public String MerhabaPersonel() {
		return "Merhaba Personel";
	}
	@GetMapping("/kullanici")
	public String MerhabaKullanici() {
		return "Merhaba Kullanici";
	}
	@GetMapping("/admin")
	public String MerhabaAdmin() {
		return "Merhaba Admin" ;
	}
}
