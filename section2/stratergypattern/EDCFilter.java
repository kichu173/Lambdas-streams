package lambdas_streams_ajayIyengar.section2.stratergypattern;

public class EDCFilter implements  EmployeeFilter{
    @Override
    public boolean filterEmployee(Employee employee) {
        return employee.getUnit() == Unit.EDC;
    }
}
