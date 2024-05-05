package org.example;

import org.example.company.models.Manager;
import org.example.company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Jan", 12550.00, 1);
        Worker worker2 = new Worker("Anna", 15000.00, 2);
        Worker worker3 = new Worker("Kamil", 10000.00, 3);
        Worker worker4 = new Worker("Olek", 7500.00, 4);

        Manager manager = new Manager("Oskar", 20000.00, 1);

        System.out.println(worker1.getSalary());
        worker1.work();
        System.out.println(worker2.getSalary());
        worker2.work();
        System.out.println(worker3.getSalary());
        worker3.work();
        System.out.println(worker4.getSalary());
        worker4.work();

        System.out.println(manager.getSalary());
        manager.work();
    }
}