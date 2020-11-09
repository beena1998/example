package main;

import com.Address;
import com.Employee;

public class AddressMain {

	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setEmpNo(10);
		employee.setEmpName("Beena");

		System.out.println("Employee No.:" + employee.getEmpNo());
		System.out.println("Employee Name:" + employee.getEmpName());

		Address address1 = new Address(111, "Delhi", "ND");
		Address address2 = new Address(301, "TN", "Chennai");
		Address[] addresses = new Address[2];
		addresses[0] = address1;
		addresses[1] = address2;

		employee.setAddress(addresses);

		Address[] temp = employee.getAddress();
		for (int i = 0; i < temp.length; i++) {
			System.out.println("Door No:" + temp[i].getDoorNo());
			System.out.println("City:" + temp[i].getCity());
			System.out.println("State:" + temp[i].getState());
			System.out.println("\n");
		}

		Employee employee2 = new Employee();
		employee2.setEmpName("Abhay");
		employee2.setEmpNo(20);

		System.out.println("Employee No.:" + employee2.getEmpNo());
		System.out.println("Employee Name:" + employee2.getEmpName());

		Address address3 = new Address(401, "UP", "GN");
		Address address4 = new Address(301, "AP", "Ban");

//		address = null;
	}

}
