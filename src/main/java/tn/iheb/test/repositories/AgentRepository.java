package tn.iheb.test.repositories;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import tn.iheb.test.entities.Agent;

@RepositoryRestResource(path= "v1")
public interface AgentRepository extends JpaRepository<Agent, Long> 
{
	public Optional<Agent> findByname(String name);
	
	
}
