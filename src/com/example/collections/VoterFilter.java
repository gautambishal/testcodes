package com.example.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Voter {
    private String name;
    private String state;

    public Voter(String name, String state) {
        this.name = name;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    @Override
    public String toString() {
        return "Voter{name='" + name + "', state='" + state + "'}";
    }
}

public class VoterFilter {
    public static void main(String[] args) {
        // Sample voter list
        List<Voter> voters = getAll();

        // Filter voters from Texas
        List<Voter> texasVoters = voters.stream()
                .filter(voter -> "Texas".equals(voter.getState()))
                .collect(Collectors.toList());

        // Print the filtered list
        texasVoters.forEach(System.out::println);
    }

    private static List<Voter> getAll() {
        List<Voter> voters = new ArrayList<>();
        voters.add(new Voter("Alice", "Texas"));
        voters.add(new Voter("Bob", "California"));
        voters.add(new Voter("Charlie", "Texas"));
        voters.add(new Voter("Diana", "New York"));
        return voters;
    }
}

