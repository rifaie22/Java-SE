/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VO;

/**
 *
 * @author rifaie
 */
public class CustVO {

    String currentTime;
    String name;
    String path;
    String password;
    int birthDay;
    int birthMonth;
    int birthYear;
    
    public CustVO(){
        System.out.println("Default construstor");
    }
    
    public CustVO(String name, String currentTime, String path){
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("Name and Current Time Constructor is constructed");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        this.setName(name);
        this.setCurrentTime(currentTime);
        this.setPath(path);
    }
    
    public CustVO(int birthDay, int birthMonth, int birthYear){
        System.out.println("------------------------------------");
        System.out.println("Birthday Constructor is constructed");
        System.out.println("------------------------------------");
        this.setBirthDay(birthDay);
        this.setBirthMonth(birthMonth);
        this.setBirthYear(birthYear);
    }
    
     public String getPassword() {                  //this getter will not be used
        return password;
    }

    public void setPassword(String password) {      //this setter will not be used
        this.password = password;
    }
    
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    
    public String getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

}

