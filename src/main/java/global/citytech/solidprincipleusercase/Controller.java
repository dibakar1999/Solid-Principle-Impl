package global.citytech.solidprincipleusercase;

import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;

@io.micronaut.http.annotation.Controller
public class Controller {

    private final CalculateEmployeeSalaryUseCase calculateEmployeeSalaryUseCase;

    @Inject
    public Controller(CalculateEmployeeSalaryUseCase calculateEmployeeSalaryUseCase) {
        this.calculateEmployeeSalaryUseCase = calculateEmployeeSalaryUseCase;
    }

    @Get("/v1")
    public String test(){
        Employee employee = new Employee();
        calculateEmployeeSalaryUseCase.calculate(employee);
        return "Success";
    }
}
