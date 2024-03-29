package ru.zhadaev.test.bellintegrator.Task1;

import java.util.List;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        List<Map<String, String>> employees = List.of(
                Map.of(
                        "���", "������",
                        "�������", "26",
                        "���������", "Middle java dev",
                        "��������", "150000 ���"
                ),
                Map.of(
                        "���", "�������",
                        "�������", "28",
                        "���������", "Senior java automation QA",
                        "��������", "2000$"
                ),
                Map.of(
                        "���", "���������",
                        "�������", "31",
                        "���������", "junior functional tester",
                        "��������", "50000 ���"
                ),
                Map.of(
                        "���", "��������",
                        "�������", "35",
                        "���������", "dev-ops",
                        "��������", "1500$"
                )
        );

        int maxAge = 30;

        EmployeeService employeeService = new EmployeeService();

        System.out.println("������ 30 ���:\n" + employeeService.getEmployeeUnderAge(employees, maxAge));
        System.out.println("�������� � ������:\n" + employeeService.getEmployeeSalaryRubles(employees));
        System.out.println("������� �������:\n" + employeeService.getAverageAge(employees));
    }
}
