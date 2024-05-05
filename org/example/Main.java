package org.example;

import org.example.company.abstracts.Employee;
import org.example.company.models.Manager;
import org.example.company.models.Worker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Jan", 12550.00, 4, "2020-12-23", "Programista");
        Worker worker2 = new Worker("Anna", 15000.00, 5, "2022-01-17", "Tester");
        Worker worker3 = new Worker("Kamil", 10000.00, 6, "2021-02-01", "Grafik");
        Worker worker4 = new Worker("Olek", 7500.00, 7, "2023-02-26", "Programista");

        Manager manager1 = new Manager("Oskar", 20000.00, 1, "2019-01-01", "Manager");

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

        Worker worker5 = new Worker("Marek", 11000.00, 5, "2022-01-17", "Tester");
        Worker worker6 = new Worker("Janusz", 17000.00, 5, "2021-02-01", "Grafik");
        Worker worker7 = new Worker("Marta", 17500.00, 10, "2023-02-26", "Programista");

        Manager manager2 = new Manager("Paweł", 21000.00, 2, "2019-01-01", "Manager");

        System.out.println(worker5.getName() + " has code: " + worker5.hashCode());
        System.out.println(worker6.getName() + " has code: " + worker6.hashCode());
        System.out.println(worker7.getName() + " has code: " + worker7.hashCode());
        System.out.println(manager2.getName() + " has code: " + manager2.hashCode());

        System.out.println(worker5.equals(worker6));
        System.out.println(worker5.equals(worker7));
        System.out.println(worker5.equals(manager2));

        employees.add(worker5);
        employees.add(worker6);
        employees.add(worker7);
        employees.add(manager2);

        Worker worker8 = new Worker("Aneta", 7500.00, 11, "2021-11-18", "Grafik");
        Manager manager3 = new Manager("Marek", 24000.00, 3, "2020-12-11", "Manager");

        employees.add(worker8);
        employees.add(manager3);

        double sumOfAllEmployeesSalary = 0;
        double sumOfAllManagersSalary = 0;
        double sumOfAllWorkersSalary = 0;
        for (Employee employee : employees) {
            sumOfAllEmployeesSalary += employee.getSalary();
            if (employee instanceof Manager manager) {
                sumOfAllManagersSalary += manager.getSalary();
            }
            if (employee instanceof Worker worker) {
                sumOfAllWorkersSalary += worker.getSalary();
            }
        }

        System.out.println(sumOfAllEmployeesSalary);
        System.out.println(sumOfAllManagersSalary);
        System.out.println(sumOfAllWorkersSalary);

        Map<Integer, List<Employee>> employeeMap = new HashMap<>();

        for (Employee employee : employees) {
            employeeMap.computeIfAbsent(employee.getId(), k -> new ArrayList<>()).add(employee);
        }

        for (Map.Entry<Integer, List<Employee>> entry : employeeMap.entrySet()) {
            if (entry.getValue().size() > 1) {
                System.out.println("Employees with duplicate ID " + entry.getKey() + ":");
                for (Employee emp : entry.getValue()) {
                    System.out.println(emp);
                }
            }
        }
    }
}

























