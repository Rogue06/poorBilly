package com.poor.billy.repository;

import com.poor.billy.model.operation.Income;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IncomeRepository extends JpaRepository<Income, Long> {

    List<Income> findAllByUserIdAndDeletedIsFalse(Long userId);
}