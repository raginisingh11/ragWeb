package com.example.rag.ragWeb.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Cacheable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rag.ragWeb.domain.Skill;
import com.example.rag.ragWeb.domain.User;
import com.example.rag.ragWeb.repository.SkillRepository;
import com.example.rag.ragWeb.repository.UserRepository;

@Service
public class SkillService {
	
	
	
    @Autowired
	SkillRepository skillRepositoryObj;

	public List<Skill> getAllSkill() {
				
		List<Skill> skillObj = new ArrayList();
		
		for(Skill skill : skillRepositoryObj.findAll()) {
			
			skillObj.add(skill);
			
		}
						 		
		
		return skillObj;
		
	}
	public Skill getSkillById(Long skillId) {
	
		return skillRepositoryObj.findById(skillId).get();
		
	}

}
