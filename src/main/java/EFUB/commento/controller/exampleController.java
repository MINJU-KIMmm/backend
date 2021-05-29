package EFUB.commento.controller;

import EFUB.commento.domain.Ex;
import EFUB.commento.dto.ExDto;
import EFUB.commento.service.ExampleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class exampleController {

    private final ExampleService exampleService;

    public exampleController(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    @GetMapping("/example/{id}")
    public String example(@PathVariable Long id, @RequestParam String country){
        return "hi";
    }

    @GetMapping("/example2")
    public List<Ex> example2(){
        return exampleService.getAll();
    }

    @GetMapping("/example3/{id}")
    public Ex example3(@PathVariable Long id){
        return exampleService.getOneById(id);
    }

    @GetMapping("/example4")
    public List<Ex> example4(@RequestParam String country) {
        return exampleService.getListByCountry(country);
    }

    @GetMapping("/example5")
    public Ex example5(@RequestBody ExDto exDto){
        return exampleService.getOneByIdAndCountry(exDto.getId(), exDto.getCountry());
    }
}
