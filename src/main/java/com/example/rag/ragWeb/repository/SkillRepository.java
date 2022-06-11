package com.example.rag.ragWeb.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.rag.ragWeb.domain.Skill;

@Repository
public interface SkillRepository extends CrudRepository<Skill, Long>  {

}
