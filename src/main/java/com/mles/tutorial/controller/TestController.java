package com.mles.tutorial.controller;

import com.mles.tutorial.dto.GenericAPIResponse;
import com.mles.tutorial.dto.StoreInfoDTO;
import com.mles.tutorial.dto.StudentDTO;
import com.mles.tutorial.model.StudentModel;
import com.mles.tutorial.service.TestControllerService;
import com.mles.tutorial.utils.APIPojoHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
    private final TestControllerService testControllerService;

    @Autowired
    public TestController(TestControllerService testControllerService) {
        this.testControllerService = testControllerService;
    }

    @GetMapping("/show")
    public String test() {
        String message = testControllerService.show();
        return message;
    }

    @PostMapping("/store")
    public String storeInfo(StoreInfoDTO storeInfoDTO) {
        System.out.println(storeInfoDTO);
        String message = testControllerService.store(storeInfoDTO);
        return message;
    }

    @PutMapping("edit/{id}")
    public String updateTest(@PathVariable Long id, @RequestBody StoreInfoDTO updateStoreInfoDTO) {
        String message = testControllerService.edit(id, updateStoreInfoDTO);
        return message;
    }

    @DeleteMapping("delete/{id}")
    public String delete(@PathVariable Long id) {
        String message = testControllerService.delete(id);
        return message;
    }

    @PostMapping("student/create")
    public String studentCreate(StudentDTO studentDTO) {
        String message = testControllerService.studentCreate(studentDTO);
        return message;
    }


    @PutMapping("student/update")
    public StudentDTO studentUpdate(@RequestBody StudentDTO studentDTO) {
        System.out.println(studentDTO);
        return studentDTO;
//        StudentModel message = testControllerService.studentUpdate(studentDTO);
//        return APIPojoHelper.makeSuccessResponse(message);
    }


}
