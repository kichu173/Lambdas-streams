package lambdas_streams_ajayIyengar.section2.stratergypattern;

public class SeniorProfessionalsFilter implements EmployeeFilter{
    @Override
    public boolean filterEmployee(Employee employee) {
        return employee.getExperience() > 10;
    }
}
