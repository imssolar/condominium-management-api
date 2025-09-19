package com.condominium.management_api.repository;

import com.condominium.management_api.entity.Apartment;
import com.condominium.management_api.entity.Building;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ApartmentRepository extends JpaRepository<Apartment, Long> {
    List<Apartment> findByBuilding(Building building);
    List<Apartment> findByFloor(Integer floor);
    Apartment findByNumberAndBuilding(String number, Building building);

}
