package com.codding.Practical.serviceImpl;

import com.codding.Practical.domain.Employee;
import com.codding.Practical.dto.EmployeeDTO;
import com.codding.Practical.repository.EmployeeRepository;
import com.codding.Practical.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    public void createOrUpdateEmployee(EmployeeDTO empDto) {
        Employee emp = convertDtoToModel(empDto);
        employeeRepository.save(emp);
    }

    public List<EmployeeDTO> getAllEmployee() {
        List<Employee> list = employeeRepository.findAll();
        List<EmployeeDTO> employeeList = list.stream()
                .map(EmployeeDTO::new)
                .collect(Collectors.toCollection(ArrayList::new));
        return employeeList;
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

    public EmployeeDTO editEmployee(Long id) {
        Employee emp = employeeRepository.getOne(id);
        return convertModelToDTO(emp);
    }

    private Employee convertDtoToModel(EmployeeDTO empDto) {
        Employee emp = new Employee();
        if (empDto.getId() != null) {
            emp.setId(empDto.getId());
        }

        emp.setEmailId(empDto.getEmailId());

        emp.setFirstName(empDto.getFirstName());
        emp.setLastName(empDto.getLastName());
        emp.setMobileNo(empDto.getMobileNo());

        emp.setSurName(empDto.getSurName());
        emp.setFavouriteName(empDto.getFavouriteName());
        emp.setMobileNo2(empDto.getMobileNo2());
        emp.setBusinessAddress(empDto.getBusinessAddress());
        emp.setResidenceAddress(empDto.getResidenceAddress());
        emp.setWebsiteAddress(empDto.getWebsiteAddress());
        return emp;
    }

    private EmployeeDTO convertModelToDTO(Employee emp) {
        EmployeeDTO empDTO = new EmployeeDTO();
        empDTO.setId(emp.getId());

        empDTO.setEmailId(emp.getEmailId());

        empDTO.setFirstName(emp.getFirstName());
        empDTO.setLastName(emp.getLastName());
        empDTO.setMobileNo(emp.getMobileNo());

        empDTO.setSurName(emp.getSurName());
        empDTO.setFavouriteName(emp.getFavouriteName());
        empDTO.setMobileNo2(emp.getMobileNo2());
        empDTO.setBusinessAddress(emp.getBusinessAddress());
        empDTO.setResidenceAddress(emp.getResidenceAddress());
        empDTO.setWebsiteAddress(emp.getWebsiteAddress());

        return empDTO;
    }
}
