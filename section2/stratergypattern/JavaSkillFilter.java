package lambdas_streams_ajayIyengar.section2.stratergypattern;

public class JavaSkillFilter implements  EmployeeFilter{
    @Override
    public boolean filterEmployee(Employee employee) {
        return employee.getSkills().contains(Skill.JAVA);
    }
}
