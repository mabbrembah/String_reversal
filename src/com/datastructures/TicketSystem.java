package com.datastructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// simple ticket console app using queues
public class TicketSystem {
    public static void main(String[]args){
        Queue<String> passengers = new LinkedList<>();

        //forming a queue by passenger number
         passengers.add("005, 003, 001, 002, 009");

         //assigning tickets
        System.out.println(passengers.remove());

        //viewing first person in queue
        System.out.println(passengers.peek() +"is the first person in the queue");



    }
}


