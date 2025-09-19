package com.condominium.management_api.repository;

import com.condominium.management_api.entity.Apartment;
import com.condominium.management_api.entity.User;
import com.condominium.management_api.entity.UserApartment;
import com.condominium.management_api.enums.ResidencyType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserApartmentRepository extends JpaRepository<UserApartment, Long> {
    List<UserApartment> findByUser(User user);
    List<UserApartment> findByApartment(Apartment apartment);
    List<UserApartment> findByIsActiveTrue();
    List<UserApartment> findByResidencyType(ResidencyType residencyType);
}
