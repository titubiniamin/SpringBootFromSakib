//Database theke data query korbe
package com.mles.tutorial.repo;

import com.mles.tutorial.model.TestModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestModelRepo extends JpaRepository<TestModel, Long> {
}
