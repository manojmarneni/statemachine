package com.example.statemachine;

import com.example.statemachine.config.Events;
import com.example.statemachine.config.States;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.statemachine.StateMachine;

@SpringBootApplication
public class StatemachineApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StatemachineApplication.class, args);
	}

    @Autowired
    private StateMachine<States, Events> stateMachine;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(stateMachine.sendEvent(Events.E1));
    }
}
