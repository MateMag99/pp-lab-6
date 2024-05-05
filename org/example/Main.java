package org.example;

import org.example.company.abstracts.Employee;
import org.example.company.models.Manager;
import org.example.company.models.Worker;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Jan", 12550.00, 1, "2020-12-23", "Programista");
        Worker worker2 = new Worker("Anna", 15000.00, 2,"2022-01-17", "Tester");
        Worker worker3 = new Worker("Kamil", 10000.00, 3,"2021-02-01", "Grafik");
        Worker worker4 = new Worker("Olek", 7500.00, 4,"2023-02-26", "Programista");

        Manager manager = new Manager("Oskar", 20000.00, 1,"2019-01-01", "Manager");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);

        for (Employee employee : employees) {
            employee.work();
            System.out.println(employee);
        }
    }
}