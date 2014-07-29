/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.bean;

import com.java.Empleado;
import com.java.Fecha;
import java.text.SimpleDateFormat;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;
import org.primefaces.event.SelectEvent;

/**
 * Bean para asignar y recuperar fecha y tiempo de horas laborales por cada 
 * trabajador 
 * @author Dokie
 */
@ManagedBean
public class sethoraBean {

   private Fecha fecha = new Fecha();

   public Fecha getFecha() {
      return fecha;
   }

   public void setFecha(Fecha fecha) {
      this.fecha = fecha;
   }

   /**
    * Creates a new instance of sethoraBean
    */
   public sethoraBean() {
   }

   public void onDateSelect(SelectEvent event) {
      FacesContext facesContext = FacesContext.getCurrentInstance();
      SimpleDateFormat forma = new SimpleDateFormat("dd/MM/yyyy");
      facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Fecha Seleccionada", forma.format(event.getObject())));

   }

   public void click() {
      RequestContext requestContext = RequestContext.getCurrentInstance();

      requestContext.update("form:display");
      requestContext.execute("PF('dlg').show()");
   }

   public void chooseCar() {
      RequestContext.getCurrentInstance().openDialog("selectTrabajador");
      System.out.println("Algo");
   }

   public void onCarChosen(SelectEvent event) {
      Empleado empleado = (Empleado) event.getObject();
      FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Seleccion", "Id:" );

      FacesContext.getCurrentInstance().addMessage(null, message);
   }

}
