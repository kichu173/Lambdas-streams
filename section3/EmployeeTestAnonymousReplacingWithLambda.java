package lambdas_streams_ajayIyengar.section3;

import lambdas_streams_ajayIyengar.section2.stratergypattern.*;

import java.util.ArrayList;
import java.util.List;


//Anonymous.
public class EmployeeTestAnonymousReplacingWithLambda {

	private static final List<Employee> employees = new ArrayList<>();

	public static void main(String args[]) {
		initialize();

		// 1. Get a list of all employees in EDC.

		Unit unit = Unit.EDC;
		//[params -> [body]
		//EmployeeFilter edcFilter = (Employee employee) -> {return employee.getUnit() == unit;};
		List<Employee> edcEmployees = getEmployeesFilteredBy((Employee employee) -> {return employee.getUnit() == unit;});

		System.out.println("--------EDC Employees--------");
		System.out.println(edcEmployees);

		// 2.Get all the java developers.
		// return statement is not needed when one statement is there in body of lambda expression.
		EmployeeFilter javaSkillsFilter = (Employee employee) -> employee.getSkills().contains(Skill.JAVA);
		List<Employee> javaDevelopers = getEmployeesFilteredBy(javaSkillsFilter);

		System.out.println("--------Java Developers--------");
		System.out.println(javaDevelopers);

		// 3. Get employees > 10 years experience
		// we can also remove the type passed in params of lambda, since you are passing ony one parameter you can also get rid of brackets to parmas
		List<Employee> seniorProfessionals = getEmployeesFilteredBy(employee -> {return employee.getExperience() > 10;});

		System.out.println("--------Senior guys--------");
		System.out.println(seniorProfessionals);
		
		//Exercise
		// 4. How will you implement the requirement Java Developers in EDC ? 
		
	}

	public static List<Employee> getEmployeesFilteredBy(EmployeeFilter filter) {

		List<Employee> filteredEmployees = new ArrayList<>();
		for (Employee employee : employees) {
			if (filter.filterEmployee(employee)) {
				filteredEmployees.add(employee);
			}
		}
		return filteredEmployees;
	}

	private static void initialize() {

		List<Skill> dev1Skills = new ArrayList<>();
		dev1Skills.add(Skill.JAVA);
		dev1Skills.add(Skill.JPA);

		// Amit is a developer with Java,Jpa
		employees.add(new Employee("Amit", 8, Designation.DEVELOPER, Unit.EDC, dev1Skills));

		// Rahul with .NET as a programmer
		List<Skill> dev2Skills = new ArrayList<>();
		dev2Skills.add(Skill.MICROSOFT);
		employees.add(new Employee("Rahul", 5, Designation.DEVELOPER, Unit.EDC, dev2Skills));

		// Peter with python as a programmer in FS
		List<Skill> dev3Skills = new ArrayList<>();
		dev3Skills.add(Skill.PYTHON);
		employees.add(new Employee("Peter", 7, Designation.DEVELOPER, Unit.FS, dev3Skills));

		// Stanley with angular/js as a programmer in oil gas
		List<Skill> dev4Skills = new ArrayList<>();
		dev4Skills.add(Skill.ANGULARJS);
		dev4Skills.add(Skill.JAVASCRIPT);
		employees.add(new Employee("Stanley", 3, Designation.DEVELOPER, Unit.OIL_GAS, dev4Skills));

		// Manoj with java and angular as a programmer in FS
		List<Skill> dev5Skills = new ArrayList<>();
		dev5Skills.add(Skill.ANGULARJS);
		dev5Skills.add(Skill.JAVA);
		employees.add(new Employee("Manoj", 3, Designation.DEVELOPER, Unit.FS, dev5Skills));

		// Jose as manager
		List<Skill> managerSkills = new ArrayList<>();
		managerSkills.add(Skill.PMP);
		employees.add(new Employee("Jose", 15, Designation.MANAGER, Unit.EDC, managerSkills));

		// Pirlo as architect in edc.
		List<Skill> architectSkills = new ArrayList<>();
		architectSkills.add(Skill.DESIGN);
		employees.add(new Employee("Pirlo", 13, Designation.ARCHITECT, Unit.EDC, architectSkills));

	}

}