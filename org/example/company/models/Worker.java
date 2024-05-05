package org.example.company.models;

import org.example.company.abstracts.Employee;

public final class Worker extends Employee {

    public Worker(String name, double salary, int id, String hireDate, String position) {
        super(name, salary, id, hireDate, position);
    }

    @Override
    public void work() {
        System.out.println("Worker " + this.getName() + " is working...");
    }
}
