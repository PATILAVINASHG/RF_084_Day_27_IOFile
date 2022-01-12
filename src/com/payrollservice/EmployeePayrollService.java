package com.payrollservice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {

	enum IOStream {
		CONSOLE_IO, FILE_IO,
	}

	List<EmployeePayroll> employeePayrollList;

	public EmployeePayrollService() {
		employeePayrollList = new ArrayList<>();
	}

	public EmployeePayrollService(EmployeePayroll[] empsData) {
		employeePayrollList = Arrays.asList(empsData);
	}

	public static void main(String[] args) {
		EmployeePayrollService service = new EmployeePayrollService();

		service.readEmpPayrollData(IOStream.CONSOLE_IO);
		service.writeEmpPayrollData(IOStream.CONSOLE_IO);
	}

	public void readEmpPayrollData(IOStream iOStream) {
			Scanner consoleScn = new Scanner(System.in);
			System.out.println("Enter the Employee Id : ");
			int id = consoleScn.nextInt();

			System.out.println("Enter the Employee Name : ");
			String name = consoleScn.next();

			System.out.println("Enter the Employee Salary : ");
			double salary = consoleScn.nextDouble();
			consoleScn.close();
			employeePayrollList.add(new EmployeePayroll(id, name, salary));
	}

	public void writeEmpPayrollData(IOStream iOStream) {
			System.out.println("Employee Payroll details : " + employeePayrollList);
	}
}