package com.condominium.management_api.repository;

import com.condominium.management_api.entity.Building;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BuildingRepository extends JpaRepository<Building,Long> {
    Building findByName(String name);
    List<Building> findByAddress(String address);
}
