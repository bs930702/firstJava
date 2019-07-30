package employee.impl;

import employee.model.EmpService;
import employee.model.Employee;

public class EmpServiceImpl2 implements EmpService {

	@Override
	public void registerEmp(Employee emp, Employee[] ary) {
		for (int i = 0; i < ary.length; i++) {
			if (ary[i] == null) {
				ary[i] = emp;
				break;
			}
		}
	}

	@Override
	public void searchEmp(int empId, Employee[] ary) {
		for (int i = 0; i < ary.length; i++) {
			if (ary[i] != null && ary[i].getEmployeeID() == empId) {
				System.out.println(ary[i]);
			}
		}
	}

	@Override
	public void empList(Employee[] ary) {
		for (int i = 0; i < ary.length; i++) {
			System.out.println(ary[i]);
		}
	}

	@Override
	public void updateEmp(int empId, int salary, Employee[] ary) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEmp(int empId, Employee[] ary) {
		// TODO Auto-generated method stub

	}
}
