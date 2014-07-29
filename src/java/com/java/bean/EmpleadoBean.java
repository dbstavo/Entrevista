/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.bean;

import com.java.Empleado;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;
import org.primefaces.event.RowEditEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;

/**
 * Bean que permite la creacion de registros en el sistema 
 * @author Dokie
 */
@ManagedBean(name = "EmpBean")
@SessionScoped
public class EmpleadoBean {

   private Empleado empleado = new Empleado();
   private List<Empleado> Empleados = new ArrayList<Empleado>();
   

   public EmpleadoBean() {
   }

   public Empleado getEmpleado() {
      return empleado;
   }
   /**
    * Metodo para agregar registros a la tabla 
    * @param empleado 
    */

   public void setEmpleado(Empleado empleado) {
      this.Empleados.add(empleado);
      FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, 
              "Successful", "Se agrego correctamente: " + empleado.getNombre()));
     this.empleado = new Empleado();
   }
/**
 *  Getters y setters de la clase 
 * @return 
 */
   public List<Empleado> getEmpleados() {
      return Empleados;
   }

   public void setEmpleados(List<Empleado> Empleados) {
      this.Empleados = Empleados;
   }

   public void deleteAction(Empleado emp) {
      Empleados.remove(emp);
   }

   public String reinc() {
      empleado = new Empleado();
      return null;
   }

  

   public void updateAction(Date date, int time) {
      this.empleado.setFecha(date, time);
   }
   /**
    * Metodos para el manejo de Primefaces y sus componentes 
    * @param event 
    */
   
   public void onRowEdit(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Modificado", ((Empleado) event.getObject()).getNombre());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Cancelado", ((Empleado) event.getObject()).getNombre());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
   
   public void dialogoBorrar(Empleado emp){
      FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, 
              "Successful", "Se elimino correctamente: " + emp.getNombre()));
      deleteAction(emp);
   }
   
   public void onDateSelect(SelectEvent event) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Date Selected", format.format(event.getObject())));
   }
   
   public void selectFromDialog(Empleado emp) {
      RequestContext.getCurrentInstance().closeDialog(emp);
   }
   
   public void onRowSelect(SelectEvent event) {
        FacesMessage msg = new FacesMessage("Seleccionado", ((Empleado) event.getObject()).getNombre());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
 
    public void onRowUnselect(UnselectEvent event) {
        FacesMessage msg = new FacesMessage("Seleccion", ((Empleado) event.getObject()).getNombre());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
           
}
