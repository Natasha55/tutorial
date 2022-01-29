package luxoft.tutorial.service;

import luxoft.tutorial.entity.Department;
import luxoft.tutorial.repository.DepartmentRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DepartmentServiceTest {

    @Autowired
    private DepartmentService departmentService;

    @MockBean
    private DepartmentRepository departmentRepository;

    @BeforeEach
    void setUp() {
        Department department =
                Department.builder()
                        .departmentId(1L)
                        .departmentName("e")
                        .departmentAddress("bigger")
                        .departmentCode("hello and bye something")
                        .build();
        Mockito.when(departmentRepository.findByDepartmentNameIgnoreCase("e"))
                .thenReturn(department);
    }



    @DisplayName("Get Data based on Valida department name")
    @Test
    public void whenValidDepartmentNameThenDepartmentShouldFound(){
        String departmentName = "e";

        Department found =
                departmentService.fetchDepartmentByName(departmentName);
        assertEquals(departmentName,found.getDepartmentName());
    }
}