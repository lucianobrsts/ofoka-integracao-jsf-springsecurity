package com.myimage.controller.initial;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@RequestScoped
@ManagedBean
public class Index {

	@PostConstruct
	public void init() {
		System.out.println("Beam Executado...");
	}

	public String getMessage() {
		return "Hello world JSF, testando integração com Spring Security";
	}
}
