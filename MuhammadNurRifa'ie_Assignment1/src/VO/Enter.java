/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VO;

import BO.CustBO;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.InputMismatchException;

/**
 *
 * @author rifaie
 */
public class Enter {

    public static void main(String[] args) {
        int birthDay = 0;
        int birthMonth = 0;
        int birthYear = 0;

        Scanner setInput = new Scanner(System.in);

        System.out.println("Please enter the file path where you want to import the data");
        System.out.println("New text file named \"userData.txt\" will be saved in that path you entered");
        System.out.println("Example: C:\\Users\\Desktop\\document\\");
        System.out.print("---> ");
        String path = setInput.nextLine();

        System.out.println("Please enter your name: ");
        System.out.print("---> ");
        String name = setInput.nextLine();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        String currentTime = formatter.format(date);

        CustVO userVO1 = new CustVO(birthDay, birthMonth, birthYear);

        try {
            System.out.println("Please enter the 'DAY' of your birthday");
            System.out.print("====> ");
            birthDay = setInput.nextInt();
            userVO1.setBirthDay(birthDay);
            CustBO.dayValidation(userVO1);

            System.out.println("Please enter the 'MONTH' of your birthday");
            System.out.print("====> ");
            birthMonth = setInput.nextInt();
            userVO1.setBirthMonth(birthMonth);
            CustBO.monthValidation(userVO1);

            System.out.println("Please enter the 'YEAR' of your birthday");
            System.out.print("====> ");
            birthYear = setInput.nextInt();
            userVO1.setBirthYear(birthYear);
            CustBO.yearValidation(userVO1);

            CustVO userVO = new CustVO(name, currentTime, path);
            CustBO userBO = new CustBO();
            userBO.saveUserInputs(userVO, userVO1);
        } catch (InputMismatchException im) {
            System.out.println("CANNOT ENTER STRING");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
