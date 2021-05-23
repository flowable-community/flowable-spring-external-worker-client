package org.flowable.community.external.worker.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.flowable.community.external.worker.AcquiredJob;
import org.flowable.community.external.worker.annotation.FlowableWorker;
import org.flowable.community.external.worker.model.EngineVariable;
import org.springframework.stereotype.Component;

/**
 * Example worker method in a Spring bean.  
 */
@Component
public class ExampleWorker {

	@FlowableWorker(topic = "topicToGetJobFrom")
	public void execute(AcquiredJob job) {

		List<EngineVariable> variables = job.getVariables();
		Optional<EngineVariable> variableA = variables.stream()
				.filter(variable -> variable.getName().equals("variableA")).findFirst();
		Optional<EngineVariable> variableB = variables.stream()
				.filter(variable -> variable.getName().equals("variableB")).findFirst();

		if (variableA.isPresent() && variableB.isPresent()) {
			EngineVariable variableC = new EngineVariable();
			variableC.setName("variableC");
			variableC.setValue(variableA.get().getValue() + ":" + variableB.get().getValue());

			List<EngineVariable> newVariables = new ArrayList<>();
			newVariables.add(variableC);

			job.complete(newVariables);

		} else {
			job.fail("Incorrect variables", "variable not found", 3, "PT5M");
		}
	}
	
	@FlowableWorker(topic = "anotherTopicToGetJobFrom")
	public void executeAnother(AcquiredJob job) {
		// implement this
	}
	

}