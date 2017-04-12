package com.proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerArticle {
	@RequestMapping("/article")
	@ResponseBody
	public String index(){
		return 	"		{\"article\": [{"+
				"			\"nombre\":\"Nombre\",\"titulo\":\"Titulo\",\"descripcion\":\"Descripcion\""+
				"		}, {"+
				"			\"nombre\":\"Sistema Kanban\",\"titulo\":\"FrontEnd\",\"descripcion\":\"Construir un sistema Kanbad de forma dinamica con json, javascript y jquery\""+
				"		}]}";
	}
}
