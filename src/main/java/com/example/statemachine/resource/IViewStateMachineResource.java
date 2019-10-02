package com.example.statemachine.resource;

import com.example.statemachine.config.Events;
import com.example.statemachine.config.States;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.statemachine.StateMachine;


public class IViewStateMachineResource {
    @Autowired
    private static StateMachine<States, Events> stateMachine;

    public static void main(String[] args) {


    }
}
