/* 
Productionline project for Oracle Java Programming course.
Developer: Rudy Nails
Date: 3/26/2025

This file hosts the Item Interface and enum
*/

import java.util.Date; 

//Item Interface
public interface Item {
  public final String manufacturer = "OracleProduction";
  public void setProductionNumber(int productionnumber);
  public void setName(String name);
  void setName(String name);
  public String getName(); 
  public Date getManufactureDate();
  public int getSerialNumber();
}//end interface item

/* there are four types of items 
  Audio AU
  Vidual VI
  Audiomobile AM
  VisualMobile VM

WE make an enum ItemType to handle the four types*/

//ItemType enum
public enum ItemType{
  Audio("MM"),  
  Visual("VI"), 
  AudioMobile("AM"),
  VisualMobile("VM");

  private String code;
  
  //constructor 
  private ItemType(String code){
      this.code = code; 
  } 

  public String getCode(){
    return code;
  }
}//End enum ItemType
  




  
  
