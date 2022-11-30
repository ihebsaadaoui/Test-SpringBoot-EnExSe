package tn.iheb.test.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.iheb.test.entities.Agent;
import tn.iheb.test.repositories.AgentRepository;
import tn.iheb.test.services.AgentService;

@RestController
@RequestMapping("/v1")
@CrossOrigin
public class AgentRestController {
	
	@Autowired
	AgentService agentService;
	
	AgentRepository repo;
	
	@GetMapping("/agents")
	@ResponseBody
	public List<Agent> getAllAgents() {
		return agentService.getAllAgents();
	}
	
	@PostMapping("/agent")
	@ResponseBody
	public Agent createAgent(@RequestBody Agent agent) {
		return agentService.saveAgent(agent);
		 }
	
	@PutMapping("/{name}")
	@ResponseBody
	public Agent updateAgent(@PathVariable("name") String name, @RequestBody Agent agent) throws Exception {

		return agentService.updateAgent(agent,name);
		}
	
	@DeleteMapping("/{id}")
	public void deleteAgent(@PathVariable("id") Long id)
	{
		agentService.deleteAgentById(id);
	}


}
