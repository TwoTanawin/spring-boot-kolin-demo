package com.example.springdemo.controllers

import com.example.springdemo.models.DemoData
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1")
class DemoController {

    @GetMapping("/hello")
    fun hello() : String {
        return "Hello Spring Boot"
    }

    @GetMapping("about")
    fun about(): String {
       return "About, Spring Boot"
    }

    //GetAll
    @GetMapping("/demodata")
    fun getDemoData(): List<DemoData> {
        return listOf(
            DemoData(1,
                "John",
                "john@email.com",
                "0000000",
                "A75 Bangkok Thailand"),
            DemoData(2,
                "Jane",
                "Jane@email.com",
                "1111111",
                "A75 Bangkok Thailand")
        )
    }

    //GetById
    @GetMapping("/demodata/{id}")
    fun getDemoDataById(@PathVariable id: Int): DemoData{
        return DemoData(
                id,
                "John",
                "john@email.com",
                "0000000",
                "A75 Bangkok Thailand"
            )
    }

    @PostMapping("/demodata")
    fun createDemoData(@RequestBody demoData: DemoData): DemoData{
        return demoData
    }

    @PutMapping("/demodata/{id}")
    fun updateDemoData(@PathVariable id: Int, @RequestBody demoData: DemoData): DemoData{
        return demoData.copy(id = id)
    }

    @DeleteMapping("/demodata/{id}")
    fun deleteDemoData(@PathVariable id: Int) : String{
        return "Delete DemoData Id: $id"
    }
}