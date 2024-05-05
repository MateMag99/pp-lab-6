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

        Manager manager1 = new Manager("Oskar", 20000.00, 1,"2019-01-01", "Manager");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager1);

        for (Employee employee : employees) {
            employee.work();
            System.out.println(employee);
        }

        Worker worker5 = new Worker("Marek", 11000.00, 5,"2022-01-17", "Tester");
        Worker worker6 = new Worker("Janusz", 17000.00, 6,"2021-02-01", "Grafik");
        Worker worker7 = new Worker("Marta", 17500.00, 5,"2023-02-26", "Programista");

        Manager manager2 = new Manager("Paweł", 21000.00, 2,"2019-01-01", "Manager");

        System.out.println(worker5.getName() + " has code: " + worker5.hashCode());
        System.out.println(worker6.getName() + " has code: " + worker6.hashCode());
        System.out.println(worker7.getName() + " has code: " + worker7.hashCode());
        System.out.println(manager2.getName() + " has code: " + manager2.hashCode());

        System.out.println(worker5.equals(worker6));
        System.out.println(worker5.equals(worker7));
        System.out.println(worker5.equals(manager2));
    }
}

























