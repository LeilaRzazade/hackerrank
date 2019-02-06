/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeconversion;

import java.util.Scanner;

/**
 *
 * @author HP p219ur
 */
public class TimeConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    
    char[] arr = s.toCharArray();
    String result="";
    if(arr[8]=='P'){
    char ch = arr[1];
    switch (ch){
        case '1': {
            if(arr[0]=='0') result+="13";
            else result+="23";
             break;}
        case '2': {
            if(arr[0]=='0'){result+="14"; break;}
            else {result+="12"; break;}
        }
        
        case '3': result+="15"; break;
        case '4': result+="16"; break;
        case '5': result+="17"; break;
        case '6': result+="18"; break;
        case '7': result+="19"; break;
        case '8': result+="20"; break;
        case '9': result+="21"; break;
        case '0': result+="22"; break;
    }
    result+=arr[2];
    result+=arr[3];
    result+=arr[4];
    result+=arr[5];
    result+=arr[6];
    result+=arr[7];
    }
    else{
    if(arr[0]=='1') result+="00";
    else{ result+=arr[0];
    result+=arr[1];
    }
   
    result+=arr[2];
    result+=arr[3];
    result+=arr[4];
    result+=arr[5];
    result+=arr[6];
    result+=arr[7];
    }
    
    System.out.println(result);
    }
    
}
