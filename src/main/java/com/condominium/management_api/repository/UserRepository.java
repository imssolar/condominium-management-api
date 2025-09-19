package com.condominium.management_api.repository;

import com.condominium.management_api.entity.User;
import com.condominium.management_api.enums.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
    List<User> findByUserRole(UserRole userRole);
    long countByUserRole(UserRole userRole);
    boolean existsByEmail(String email);
}
