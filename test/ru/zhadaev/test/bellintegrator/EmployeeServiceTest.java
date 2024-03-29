package ru.zhadaev.test.bellintegrator;

import org.junit.jupiter.api.Test;
import ru.zhadaev.test.bellintegrator.Task1.EmployeeService;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeServiceTest {
    @Test
    void getEmployeeUnderAge_returnExpectedData_whenInitDataIsValid() {
        EmployeeService employeeService = new EmployeeService();
        List<Map<String, String>> employeesInit = createEmployeesInit();
        List<Map<String, String>> employeesExpected = createEmployeesExpectedAge();
        List<Map<String, String>> employeesActual = employeeService.getEmployeeUnderAge(employeesInit, 30);
        assertEquals(employeesActual, employeesExpected);
    }

    @Test
    void getEmployeeUnderAge_throwNullPointerException_whenEmployeesIsNull() {
        EmployeeService employeeService = new EmployeeService();
        List<Map<String, String>> employeesInit = null;
        assertThrows(NullPointerException.class, () -> employeeService.getEmployeeUnderAge(employeesInit, 30));
    }

    @Test
    void getEmployeeSalaryRubles_returnExpectedData_whenInitDataIsValid() {
        EmployeeService employeeService = new EmployeeService();
        List<Map<String, String>> employeesInit = createEmployeesInit();
        List<Map<String, String>> employeesExpected = createEmployeesExpectedRub();
        List<Map<String, String>> employeesActual = employeeService.getEmployeeSalaryRubles(employeesInit);
        assertEquals(employeesActual, employeesExpected);
    }

    @Test
    void getEmployeeSalaryRubles_throwNullPointerException_whenEmployeesIsNull() {
        EmployeeService employeeService = new EmployeeService();
        List<Map<String, String>> employeesInit = null;
        assertThrows(NullPointerException.class, () -> employeeService.getEmployeeSalaryRubles(employeesInit));
    }

    @Test
    void getAverageAge_returnExpectedData_whenInitDataIsValid() {
        EmployeeService employeeService = new EmployeeService();
        List<Map<String, String>> employeesInit = createEmployeesInit();
        double expected = 30;
        double actual =  employeeService.getAverageAge(employeesInit);
        assertEquals(expected, actual);
    }

    @Test
    void getAverageAge_throwNullPointerException_whenEmployeesIsNull() {
        EmployeeService employeeService = new EmployeeService();
        List<Map<String, String>> employeesInit = null;
        assertThrows(NullPointerException.class, () -> employeeService.getAverageAge(employeesInit));
    }


    private List<Map<String, String>> createEmployeesInit() {
        return List.of(
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
    }

    private List<Map<String, String>> createEmployeesExpectedAge() {
        return List.of(
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
                )
        );
    }

    private List<Map<String, String>> createEmployeesExpectedRub() {
        return List.of(
                Map.of(
                        "Имя", "Кирилл",
                        "Возраст", "26",
                        "Должность", "Middle java dev",
                        "Зарплата", "150000 руб"
                ),
                Map.of(
                        "Имя", "Александр",
                        "Возраст", "31",
                        "Должность", "junior functional tester",
                        "Зарплата", "50000 руб"
                )
        );
    }
}
