/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package localizarePoligonSimplu;
import java.util.Scanner;
import java.io.*;
import java.io.FileNotFoundException;



public class Main {
    
    static int rezDeterminant(int xa,int ya,int xb,int yb,int xm,int ym){
    
    int det;
    det= (xa*ym*1+1*xm*yb+ya*1*xb)-(1*ym*xb+1*yb*xa+1*xm*ya);
    return det;
    
    
    }
    
    
    
    
    
    
    
public static void main(String args[])throws FileNotFoundException{
    int i=0;
    int c=0;
    int x;
    int y;
    int n=6;
  
    
    Coordonate a;
    Coordonate b;
    Coordonate[] varf={new Coordonate(5,1), new Coordonate(8,3), new Coordonate(6,6), new Coordonate(3,5), new Coordonate(5,4),new Coordonate(3,3),new Coordonate(5,1)};
    Coordonate m=new Coordonate(6,4);
    //Coordonate[] varf={new Coordonate(0,0), new Coordonate(0,0), new Coordonate(0,0), new Coordonate(0,0), new Coordonate(0,0),new Coordonate(0,0),new Coordonate(0,0)};
        
        
        
      /*Scanner scan = new Scanner(System.in);
     n=scan.nextInt();
      varf = new Coordonate[n+1];
       for(int k=0;k<n;k++){
           System.out.println("Introduceti coordonata x pentru varful"+" "+(k+1));
           x=scan.nextInt();
           System.out.println("Introduceti coordonata y pentru varful"+" "+(k+1));
           y=scan.nextInt();
             varf[k]=new Coordonate(x,y);
                
            }   */    
            
            varf[n]=new Coordonate(varf[0].x,varf[0].y);
            
            a = new Coordonate(0,0);
            b = new Coordonate(0,0);
       
    
            
            for(i=0;i<n;i++){
        
        
        if(varf[i+1].y==varf[i].y){
            if(varf[i+1].y==m.y){
            if ((m.x-varf[i].x)*(m.x-varf[i+1].x)<=0) {
                System.out.println("Punctul M este pe frontiera");
                c=-1;
                break;
            }
            
            }
        }
        if(varf[i].y>varf[i+1].y){
        
           a.x=varf[i].getX();
           a.y=varf[i].getY();
           b.x=varf[i+1].getX();
           b.y=varf[i+1].getY();
           
           
        }
        if(varf[i].y<varf[i+1].y){
        
           a.x=varf[i+1].getX();
           a.y=varf[i+1].getY();
           b.x=varf[i].getX();
           b.y=varf[i].getY();
          
          
        }
        
        
        if(varf[i].y!=varf[i+1].y&&m.y>b.y&&m.y<a.y){
        int determinant=rezDeterminant(a.x,a.y,b.x,b.y,m.x,m.y);
        
        if(determinant>0)c=c+1;
        if(determinant==0){
            System.out.println("Punctul M este pe frontiera");
            c=-1;
            break;
        }
        
        }
        if(varf[i].y!=varf[i+1].y&&m.y==a.y){
            if(m.x<a.x)c=c+1;
            if(m.x==a.x){
                
            System.out.println("Punctul M este pe frontiera");
            c=-1;
            break;
            
            }
            
            
            
        }
        
       if(varf[i]!=varf[i+1]&&m.y==b.y&&m.x==b.x){
        
        System.out.println("Punctul M este pe frontiera");
        c=-1;
        break;
        
        }
        
        
        
        
        
        
        }
        
        
        
        
    
    
    if(c>=0){
    if(c%2==0)System.out.println("Punctul M este in exterior");
    else System.out.println("Punctul M este in interior");
    }
    
    
    
    }
    

}