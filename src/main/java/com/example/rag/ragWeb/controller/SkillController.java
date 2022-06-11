package com.example.rag.ragWeb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.rag.ragWeb.domain.Skill;
import com.example.rag.ragWeb.service.SkillService;


@Controller
public class SkillController {
	
	@Autowired
	SkillService skillSrv ;
	
	@GetMapping("/skill")
	public List<Skill> getAllSkills() {
		
		//service		
		return skillSrv.getAllSkill();
		
	}
	@GetMapping("/skill/{skillId}")
	public Skill getSkillById(@PathVariable Long skillId) {
		
		//service		
		return skillSrv.getSkillById(skillId);
		
		
	}

}
