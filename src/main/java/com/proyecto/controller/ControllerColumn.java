package com.proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerColumn {
	@RequestMapping("/column")
	@ResponseBody
	public String index(){
		return "{\"columns\":[{\"titulo\":\"Backlog\",\"article\":[{\"nombre\":\"Nombre\",\"titulo\":\"Titulo\",\"descripcion\":\"Descripcion\"},{\"nombre\":\"Sistema Kanban\",\"titulo\":\"FrontEnd\",\"descripcion\":\"Construir un sistema Kanbad de forma dinamica con json, javascript y jquery\"}]},{\"titulo\":\"Proceso\",\"article\":[]},{\"titulo\":\"Terminado\",\"article\":[]}]}";
	}

}
