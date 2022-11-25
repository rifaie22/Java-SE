/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BO;

import DAO.CustDAO;
import VO.CustVO;
import java.util.InputMismatchException;

/**
 *
 * @author rifaie
 */
public class CustBO {

    public static void dayValidation(CustVO userVO1) throws Exception{
        if (userVO1.getBirthDay() < 1 || userVO1.getBirthDay() > 31) {
            throw new Exception("Invalid day, Please re-enter");
        }
    }
    
     public static void monthValidation(CustVO userVO1) throws Exception{
        if (userVO1.getBirthMonth() < 1 || userVO1.getBirthMonth() > 12) {
            throw new Exception("Invalid month. Please re-enter");
        }
    }
     
     public static void yearValidation(CustVO userVO1) throws Exception{
         if (userVO1.getBirthYear() < 1) {
            throw new Exception("Invalid Year. Please re-enter");
        }
     }
    
    public void saveUserInputs(CustVO userVO, CustVO userVO1){
        CustDAO.saveToFile(userVO, userVO1);
    }

}
