package ru.zhadaev.test.bellintegrator.Task1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeService {
    public List<Map<String, String>> getEmployeeUnderAge(List<Map<String, String>> employees, int age) {
        return employees.stream()
                .filter(emp -> Integer.parseInt(emp.get("Возраст")) < age)
                .collect(Collectors.toList());
    }

    public List<Map<String, String>> getEmployeeSalaryRubles(List<Map<String, String>> employees) {
        return employees.stream()
                .filter(emp -> emp.get("Зарплата").contains("руб"))
                .collect(Collectors.toList());
    }

    public Double getAverageAge(List<Map<String, String>> employees) {
        return employees.stream()
                .mapToInt(emp -> Integer.parseInt(emp.get("Возраст")))
                .average()
                .orElse(0.0);
    }
}
