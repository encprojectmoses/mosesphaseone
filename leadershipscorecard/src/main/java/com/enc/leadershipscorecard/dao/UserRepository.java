package com.enc.leadershipscorecard.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.enc.leadershipscorecard.db.Roles;

@Repository
@Qualifier(value="userRepository")
public interface UserRepository extends JpaRepository<Roles, String>
{
	
}
