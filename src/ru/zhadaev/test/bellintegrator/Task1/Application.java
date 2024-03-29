package ru.zhadaev.test.bellintegrator.Task1;

import java.util.List;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        List<Map<String, String>> employees = List.of(
                Map.of(
                        "Имя", "Кирилл",
                        "Возраст", "26",
                        "Должность", "Middle java dev",
                        "Зарплата", "150000 руб"
                ),
                Map.of(
                        "Имя", "Виталий",
                        "Возраст", "28",
                        "Должность", "Senior java automation QA",
                        "Зарплата", "2000$"
                ),
                Map.of(
                        "Имя", "Александр",
                        "Возраст", "31",
                        "Должность", "junior functional tester",
                        "Зарплата", "50000 руб"
                ),
                Map.of(
                        "Имя", "Дементий",
                        "Возраст", "35",
                        "Должность", "dev-ops",
                        "Зарплата", "1500$"
                )
        );

        int maxAge = 30;

        EmployeeService employeeService = new EmployeeService();

        System.out.println("Младше 30 лет:\n" + employeeService.getEmployeeUnderAge(employees, maxAge));
        System.out.println("Зарплата в рублях:\n" + employeeService.getEmployeeSalaryRubles(employees));
        System.out.println("Средний возраст:\n" + employeeService.getAverageAge(employees));
    }
}
