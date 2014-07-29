/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.java;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dokie
 */
public class ListaEmpleado {
   
   private List<Empleado> Lista = new ArrayList<Empleado>();

   public List<Empleado> getLista() {
      return Lista;
   }

   public void setLista(List<Empleado> Lista) {
      this.Lista = Lista;
   }

   public ListaEmpleado() {
   }
   
}
