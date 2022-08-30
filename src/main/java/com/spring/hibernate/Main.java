package com.spring.hibernate;

import com.spring.hibernate.config.SpringHibernateConfig;
import com.spring.hibernate.dao.EmployeeDao;
import com.spring.hibernate.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringHibernateConfig.class);
        EmployeeDao employeeDao = applicationContext.getBean(EmployeeDao.class);
        Employee employee = new Employee();
//        employee.setName("Ali");
//        employee.setSurname("Babayev");
//        employee.setAge(23);
//        employee.setSalary(1200);
//        employee.setId(2);
//        employeeDao.update(employee);

       employeeDao.getAllEmployees().forEach(System.out::println);

//        System.out.println(employeeDao.getEmployeeById(1));

    }
}