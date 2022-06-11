package com.example.rag.ragWeb.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.rag.ragWeb.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	
	List<User> findByName(String testName);
	
	List<User> findByEmail(String emailId);
	
	/*
	 * @Query ("delete from demo_users where id = :userNname") void
	 * deleteByName(@Param("userNname") String name);
	 */

}
