package global.citytech;

import global.citytech.solidprincipleusercase.CalculateEmployeeSalaryUseCase;
import global.citytech.solidprincipleusercase.CalculateEmployeeSalaryUseCaseImpl;
import global.citytech.solidprincipleusercase.Employee;
import global.citytech.solidprincipleusercase.EmployeeAttendanceUseCase;
import io.micronaut.runtime.Micronaut;
import jakarta.inject.Inject;

public class Application {

    public static void main(String[] args) {

        Micronaut.run(Application.class, args);

    }
}