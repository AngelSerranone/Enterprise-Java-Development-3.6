package com.ironhack.lab3_6.repository;
import com.ironhack.lab3_6.model.InternalTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternalTaskRepository extends JpaRepository<InternalTask, Integer> {
}
