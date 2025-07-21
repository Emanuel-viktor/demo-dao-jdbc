package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
			
		
		System.out.println("\"=== TEST 1: Department findById =====\"");
		
		Department department =departmentDao.findById(3);
		System.out.println(department);
		
		System.out.println();
		
		System.out.println("\"=== TEST 2: seller findAll =====\"");
		
		List<Department> list= departmentDao.findAll();
		for(Department obj :list) {
			System.out.println(obj);
		}
		
		
		System.out.println("\"=== TEST 3: seller insert =====\"");
		Department newDepartment= new Department(null, "Frigorifico");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted ! new id =	"+  newDepartment.getId());
		
		System.out.println("\"=== TEST 4: Department update =====\"");
		department=departmentDao.findById(1);
		department.setName("Cozinha");
		departmentDao.update(department);
		System.out.println("Update completed");
		
		System.out.println("\"=== TEST 4: Department delete =====\"");
		System.out.println("Enter id for delete test");
		int id =sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");
		
		
		
	}

}
