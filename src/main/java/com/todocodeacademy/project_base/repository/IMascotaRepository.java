package com.todocodeacademy.project_base.repository;

import com.todocodeacademy.project_base.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMascotaRepository extends JpaRepository<Mascota, Long>{
    
}
