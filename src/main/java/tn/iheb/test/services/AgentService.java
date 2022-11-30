package tn.iheb.test.services;

import java.util.List;

import tn.iheb.test.entities.Agent;

public interface AgentService {
	
	Agent saveAgent(Agent a);
	Agent updateAgent(Agent a, String name);
	void deleteAgent(Agent a);
	void deleteAgentById(Long id);
	Agent getAgent(Long id);
	List<Agent> getAllAgents();

}
