package com.codding.Practical.service;


import com.codding.Practical.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeService {

    public void createOrUpdateEmployee(EmployeeDTO empDTO);

    public List<EmployeeDTO> getAllEmployee();

    public void deleteEmployee(Long id);

    public EmployeeDTO editEmployee(Long id);

}
