package com.example.controller;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
@TestMethodOrder(OrderAnnotation.class)
class EmployeeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @Order(1)
    void getEmployees_shouldReturnList() throws Exception {
        mockMvc.perform(get("/employees"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.employees").isArray());
    }

    @Test
    @Order(2)
    void addEmployee_shouldAddEmployee() throws Exception {
        String newEmployeeJson = """
                    {
                      "employee_id": "99",
                      "first_name": "Test",
                      "last_name": "User",
                      "email": "test.user@email.com",
                      "title": "Tester"
                    }
                """;

        mockMvc.perform(post("/employees")
                .contentType(MediaType.APPLICATION_JSON)
                .content(newEmployeeJson))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.employee_id").value("99"));
    }
}
