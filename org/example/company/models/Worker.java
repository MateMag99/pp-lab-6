package org.example.company.models;

import org.example.company.abstracts.Employee;

public final class Worker extends Employee {

    public Worker(String name, double salary, int id) {
        super(name, salary, id);
    }

    @Override
    public void work() {
        System.out.println("Worker " + this.getName() + " is working...");
    }
}
