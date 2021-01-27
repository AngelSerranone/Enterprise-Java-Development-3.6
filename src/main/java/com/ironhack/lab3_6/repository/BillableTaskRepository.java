package com.ironhack.lab3_6.repository;
import com.ironhack.lab3_6.model.BillableTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillableTaskRepository extends JpaRepository<BillableTask, Integer> {
}
