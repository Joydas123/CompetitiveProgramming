/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evenNo;

import java.util.Scanner;
/**
 *
 * @author Sourav
 */
public class EvenNoListing {
  public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a;
         System.out.println("Enter the size of array ");
          a = sc.nextInt();
        int b[] = new int[a];
         System.out.println("Enter the numbers");
          for(int i=0;i<a;i++){
              b[i] = sc.nextInt();
          }
          
          for(int i=0;i<a;i++){
              if(b[i]%2==0){
                  System.out.println(b[i]);
              }
          }
    }  
}
