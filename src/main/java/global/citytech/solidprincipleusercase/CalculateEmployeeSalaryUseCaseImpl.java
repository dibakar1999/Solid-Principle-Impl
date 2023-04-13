package global.citytech.solidprincipleusercase;

import jakarta.inject.Singleton;

@Singleton
public class CalculateEmployeeSalaryUseCaseImpl implements CalculateEmployeeSalaryUseCase,EmployeeAttendanceUseCase{
    @Override
    public int calculate(Employee employee) {
        employee.setAmount(1);
        employee.setDays(1);
        int salary = (employee.getAmount()* employee.getDays());
        System.out.println(salary);
        return salary;
    }

    @Override
    public boolean doAttendance() {
        return false;
    }
}
