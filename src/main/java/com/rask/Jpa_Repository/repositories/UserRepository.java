package com.rask.Jpa_Repository.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rask.Jpa_Repository.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	///Modelos de filtro de pesquisa feito a mão
    @Query("SELECT obj FROM User obj WHERE obj.salary >= :minSalary AND obj.salary <= :maxSalary")
	Page<User> searchSalary(Double minSalary, Double maxSalary, Pageable pageable);

    
    @Query("SELECT obj FROM User obj WHERE LOWER(obj.name) LIKE LOWER(CONCAT('%',:name,'%'))")
	Page<User> searchName(String name, Pageable pageable);
    
    
    ///Modelo de pesquisa sugeridos pela documentação do Spring
    Page<User> findBySalaryBetween(Double minSalary, Double maxSalary, Pageable pageable);

    
    Page<User> findByNameContainingIgnoreCase(String name, Pageable pageable);
}
