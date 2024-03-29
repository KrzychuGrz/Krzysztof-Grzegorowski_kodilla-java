//package com.kodilla.hibernate2.manytomany.dao;
//
//import com.kodilla.hibernate2.manytomany.Company;
//import com.kodilla.hibernate2.manytomany.Employee;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertNotEquals;
//
//@SpringBootTest
//public class CompanyDaoTestSuite {
//
//    @Autowired
//    private CompanyDao companyDao;
//
//    @Test
//    void testSaveToMany() {
//        Employee johnSmith = new Employee("John", "Smith");
//        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
//        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
//
//        Company softwareMachine = new Company("Software Machine");
//        Company dataMaesters = new Company("Data Maesters");
//        Company greyMatter = new Company("Grey Matter");
//
//        softwareMachine.getEmployees().add(johnSmith);
//        dataMaesters.getEmployees().add(stephanieClarckson);
//        dataMaesters.getEmployees().add(lindaKovalsky);
//        greyMatter.getEmployees().add(johnSmith);
//        greyMatter.getEmployees().add(lindaKovalsky);
//
//        johnSmith.getCompanies().add(softwareMachine);
//        johnSmith.getCompanies().add(greyMatter);
//        stephanieClarckson.getCompanies().add(dataMaesters);
//        lindaKovalsky.getCompanies().add(dataMaesters);
//        lindaKovalsky.getCompanies().add(greyMatter);
//
//        //When
//        companyDao.save(softwareMachine);
//        int softwareMachineId = softwareMachine.getId();
//        companyDao.save(dataMaesters);
//        int dataMaestersId = dataMaesters.getId();
//        companyDao.save(greyMatter);
//        int greyMatterId = greyMatter.getId();
//
//        //Then
//        assertNotEquals(0, softwareMachineId);
//        assertNotEquals(0, dataMaestersId);
//        assertNotEquals(0, greyMatterId);
//
//        //CleanUp
//        try {
//            companyDao.deleteById(softwareMachineId);
//            companyDao.deleteById(dataMaestersId);
//            companyDao.deleteById(greyMatterId);
//        } catch (Exception e) {
////            do nothing
//        }
//    }
//
//        @Test
//                void testNamedQueries() {
//
//        //given
//            Employee johnSmith = new Employee("John", "Smith");
//            Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
//            Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
//
//            Company softwareMachine = new Company("Software Machine");
//            Company dataMaesters = new Company("Data Maesters");
//            Company greyMatter = new Company("Grey Matter");
//
//            List<Employee> employees = new ArrayList<>();
//            employees.add(johnSmith);
//            employees.add(stephanieClarckson);
//            employees.add(lindaKovalsky);
//
//            List<Company> companies = new ArrayList<>();
//            companies.add(softwareMachine);
//            companies.add(dataMaesters);
//            companies.add(greyMatter);
//
//            employeeDao
//    }
//
//
//}
