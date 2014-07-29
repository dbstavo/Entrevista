/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Clase principal para el almacenamiento de registros
 * @author Dokie
 */
public class Empleado implements Serializable{

   private String nombre;
   private String apellido;
   private String sexo;
   private String tipoTrabajador;
   private float salario; //Salario por hora.
   private Fecha fecha;
   private List<Fecha> fechas = new ArrayList<Fecha>();

 

   public Empleado(String nombre, String apellido, String sexo, String tipoTrabajador, float salario) {
      this.nombre = nombre;
      this.apellido = apellido;
      this.sexo = sexo;
      this.tipoTrabajador = tipoTrabajador;
      this.salario = salario;
   }
   
   public Empleado(){
      
   }
   

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public String getApellido() {
      return apellido;
   }

   public void setApellido(String apellido) {
      this.apellido = apellido;
   }

   public String getSexo() {
      return sexo;
   }

   public void setSexo(String sexo) {
      this.sexo = sexo;
   }

   public String getTipoTrabajador() {
      return tipoTrabajador;
   }

   public void setTipoTrabajador(String tipoTrabajador) {
      this.tipoTrabajador = tipoTrabajador;
   }

   public float getSalario() {
      return salario;
   }

   public void setSalario(float salario) {
      this.salario = salario;
   }

   public Fecha getFecha() {
      return fecha;
   }

   public void setFecha(Date date, int time) {
      this.fecha.setDate(date);
      this.fecha.setTiempo(time);
   }

   public List<Fecha> getFechas() {
      return fechas;
   }

   public void setFechas(List<Fecha> fechas) {
      this.fechas = fechas;
   }
   
   
}
  