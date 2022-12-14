package tn.iheb.test.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.iheb.test.entities.Agent;
import tn.iheb.test.repositories.AgentRepository;

@Service
public class AgentServiceImpl implements AgentService {
	
	@Autowired
	AgentRepository agentRepository;
	
	public List<Agent> getAllAgents() {
		return agentRepository.findAll();
	}

	@Override
	public Agent saveAgent(Agent a) {
		return agentRepository.save(a);
	}

	@Override
	@Transactional
	public Agent updateAgent(Agent a, String name) {
		Agent agentUpdated =  this.agentRepository.findByname(name).orElseThrow(() -> new IllegalStateException("Agent with "+ name + " name does not exist"));
		return this.agentRepository.save(a);
	}

	@Override
	public void deleteAgent(Agent a) {
		agentRepository.delete(a);
	}

	@Override
	public void deleteAgentById(Long id) {
		agentRepository.deleteById(id);		
	}

	@Override
	public Agent getAgent(Long id) {
		return agentRepository.findById(id).get();
	}


}
