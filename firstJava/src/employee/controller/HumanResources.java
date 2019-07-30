package employee.controller;

import java.util.Scanner;

import employee.impl.EmpServiceImpl2;
import employee.model.Department;
import employee.model.EmpService;
import employee.model.Employee;

public class HumanResources {
	Scanner sc = new Scanner(System.in);
	Employee[] employees = new Employee[10];
	EmpService service = new EmpServiceImpl2();
	Department[] departments = { new Department(10, "Administration"), new Department(20, "Marketing"),
			new Department(30, "Purchasing"), new Department(40, "Human Resource") };

	public void execute() {
		int menu = 0;
		while (true) {
			printMenu();
			menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				System.out.println("등록 화면");
				register();
			} else if (menu == 2) {
				System.out.println("조회 화면");
				search();
			} else if (menu == 3) {
				System.out.println("리스트 화면");
				list();
			} else if (menu == 4) {
				System.out.println("급여 변경");
			} else if (menu == 5) {
				System.out.println("사원삭제");
			} else if (menu == 6) {
				System.out.println("부서수정");
			} else {
				System.out.println("종료");
				System.out.println("프로그램 종료합니다.");
				System.exit(0);
			}
		}
	}

	public void printMenu() {
		System.out.println("메뉴를 선택 1)등록 2)조회 3)전체리스트 4)급여변경 5)사원삭제 6)부서수정 7)종료");
	}

	public void register() {
		System.out.println("사번입력>> ");
		int employeeID = sc.nextInt();
		sc.nextLine();
		System.out.println("이름입력>> ");
		String firstName = sc.nextLine();
		System.out.println("성을 입력>> ");
		String lastName = sc.nextLine();
		System.out.println("급여 입력>> ");
		int salary = sc.nextInt();
		sc.nextLine();
		Employee emp = new Employee(employeeID, firstName, lastName, salary);
		service.registerEmp(emp, employees);
	}

	public void search() {
		System.out.println("조회할 사번입력>> ");
		int empId = sc.nextInt();
		sc.nextLine();
		service.searchEmp(empId, employees);
	}

	public void list() {
		System.out.println("전체 사원 리스트.");
		service.empList(employees);
	}
	public void updateEmp() {
		System.out.println("수정할 사번입력>> ");
		int empId = sc.nextInt();
		sc.nextLine();
		System.out.println("급여 입력>> ");
		int salary = sc.nextInt();
		sc.nextLine();
		service.updateEmp(empId, salary, employees);
	}
	public void deleteEmp() {
		System.out.println("삭제");
		
	}
}
