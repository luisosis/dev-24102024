package com.todocodeacademy.project_base.service;

import com.todocodeacademy.project_base.dto.MascoDuenioDTO;
import com.todocodeacademy.project_base.model.Mascota;
import java.util.List;


public interface IMascotaService {
    
     //método para traer a todas las mascota
    //lectura
    public List<Mascota> getMascotas();

    //alta
    public void saveMascota(Mascota masco);

    //baja
    public void deleteMascota(Long id_mascota);

    //lectura de un solo objeto
    public Mascota findMascota(Long id_mascota);

    //edición/modificación
    public void editMascota(Mascota masco);

    public List<Mascota> getCaniches();
    
    public List<MascoDuenioDTO> getMascoDuenios();
    
}
