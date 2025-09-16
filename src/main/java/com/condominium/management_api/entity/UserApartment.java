package com.condominium.management_api.entity;

import com.condominium.management_api.enums.ResidencyType;
import jakarta.persistence.*;


import java.time.LocalDate;

@Entity
public class UserApartment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Apartment apartment;

    @Enumerated(EnumType.STRING)
    private ResidencyType residencyType;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name ="end_date")
    private LocalDate endDate;

    @Column(name = "is_active")
    private Boolean isActive;

    public UserApartment(User user, Apartment apartment, ResidencyType residencyType, LocalDate startDate, LocalDate endDate, Boolean isActive){
        this.user = user;
        this.apartment = apartment;
        this.residencyType = residencyType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isActive = isActive;
    }

    public UserApartment(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Apartment getApartment() {
        return apartment;
    }

    public void setApartment(Apartment apartment) {
        this.apartment = apartment;
    }

    public ResidencyType getResidencyType() {
        return residencyType;
    }

    public void setResidencyType(ResidencyType residencyType) {
        this.residencyType = residencyType;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean active) {
        isActive = active;
    }
}
