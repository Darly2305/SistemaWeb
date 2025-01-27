/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.SistemaWeb.Repositorio;

import com.example.SistemaWeb.Entidades.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jose_
 */
@Repository
public interface RepositorioAlumno extends JpaRepository<Alumno,String>{
    
}
