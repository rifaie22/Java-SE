/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import VO.CustVO;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 *
 * @author rifaie
 */
public class CustDAO {
    
    public static void saveToFile(CustVO userVO, CustVO userVO1){
        System.out.println("Conneted to UserDAO");
        String destinationPath = userVO.getPath();
        String textFile = "\\userData.txt";
        String finalPath = destinationPath+textFile;
        
        
        try{
            FileOutputStream output = new FileOutputStream(finalPath);
            PrintWriter pw = new PrintWriter(output);
            pw.println("Customer Data \n");
            pw.println("Name          : "+userVO.getName());
            pw.println("Birthday:     : "+userVO1.getBirthDay()+"/"+userVO1.getBirthMonth()+"/"+userVO1.getBirthYear());
            pw.println("Time Register : "+userVO.getCurrentTime());
            pw.close();
            
        }catch(Exception ex){
            ex.printStackTrace();
        }

}
    
}
