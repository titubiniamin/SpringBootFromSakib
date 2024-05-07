//Handle controller login. It will take controller parameter and handle business logic
package com.mles.tutorial.service;

import com.mles.tutorial.dto.StoreInfoDTO;
import com.mles.tutorial.dto.StudentDTO;
import com.mles.tutorial.model.StudentModel;
import com.mles.tutorial.model.TestModel;
import com.mles.tutorial.repo.StudentModelRepo;
import com.mles.tutorial.repo.TestModelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestControllerService {
    private final TestModelRepo testModelRepo;
    private final StudentModelRepo studentModelRepo;

    @Autowired
    public TestControllerService(TestModelRepo testModelRepo, StudentModelRepo studentModelRepo) {
        this.testModelRepo = testModelRepo;
        this.studentModelRepo = studentModelRepo;
    }

    public String store(StoreInfoDTO storeInfoDTO) {
//        System.out.println(storeInfoDTO.getName());
        TestModel testModel = new TestModel();
        testModel.setName(storeInfoDTO.getName());
        testModel.setAddress(storeInfoDTO.getAddress());

        testModel = testModelRepo.saveAndFlush(testModel);

        return "success";
    }

    public String show() {
        List<TestModel> testModels = testModelRepo.findAll();
        StringBuilder stringBuilder = new StringBuilder();
        for (TestModel testModel : testModels) {
            stringBuilder.append("Id: ").append(testModel.getId()).append(", Name: ").append(testModel.getName()).append(", Address: ").append(testModel.getAddress()).append("\n");
        }
        return stringBuilder.toString();
    }

    public String edit(Long id, StoreInfoDTO updateStoreInfoDTO) {
        TestModel testModel = testModelRepo.findById(id).orElse(null);
        if (testModel == null) {
            return "TestModel not found";
        }
        testModel.setName(updateStoreInfoDTO.getName());
        testModel.setAddress(updateStoreInfoDTO.getAddress());
        testModelRepo.save(testModel);
        return "success";
    }

    public String delete(Long id) {
        TestModel testModel = testModelRepo.findById(id).orElse(null);
        if (testModel == null) {
            return "TestModel with ID " + id + " not found";
        }
        testModelRepo.delete(testModel);
        return "success";
    }

    public String studentCreate(StudentDTO studentDTO) {
        StudentModel studentModel = new StudentModel();
        studentModel.setName(studentDTO.getName());
        studentModel.setAddress(studentDTO.getAddress());
        studentModel = studentModelRepo.saveAndFlush(studentModel);
        return "success";
    }

    public StudentModel studentUpdate(StudentDTO studentDTO) {
        StudentModel testModel = studentModelRepo.findById(studentDTO.getId()).orElse(null);

        testModel.setName(studentDTO.getName());
        testModel.setAddress(studentDTO.getAddress());

        testModel = studentModelRepo.saveAndFlush(testModel);
        System.out.println(studentDTO);

        return testModel;
    }
}
