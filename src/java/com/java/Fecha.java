/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.java;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author Dokie
 */
public class Fecha implements Serializable{
   
   private Date date;
   private int tiempo;
   private SimpleDateFormat format;

  
   public Date getDate() {
      return date;
   }

   public void setDate(Date date) {
      this.date = date;
   }

   public int getTiempo() {
      return tiempo;
   }

   public void setTiempo(int tiempo) {
      this.tiempo = tiempo;
   }

   public SimpleDateFormat getFormat() {
      return format;
   }

   public void setFormat(SimpleDateFormat format) {
      this.format = format;
   }

    
 
}

