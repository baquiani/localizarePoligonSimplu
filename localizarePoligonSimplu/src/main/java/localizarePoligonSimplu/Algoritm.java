/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package localizarePoligonSimplu;

import static localizarePoligonSimplu.Main.rezDeterminant;

/**
 *
 * @author baq
 */
public class Algoritm {
    
    
   public Coordonate[] v;
    int n;
    Coordonate m;
    Coordonate a=new Coordonate(0,0);
    Coordonate b=new Coordonate(0,0);
    int c=0;
    
    public Algoritm(Coordonate[] v,int n,Coordonate m){
    
    this.n=n;
    for(int i=0;i<n;i++){
    
    this.v[i].x=v[i].x;
    this.v[i].y=v[i].y;
    
    
    }
    this.m.x=m.x;
    this.m.y=m.y;
        
    
    
    
    }
    
    public int localizare(Coordonate[] v,int i){
    
    
        
        
        if(v[i+1].y==v[i].y){
            if(v[i+1].y==m.y){
            if ((m.x-v[i].x)*(m.x-v[i+1].x)<=0) {
                System.out.println("Punctul M este pe frontiera");
                return 0;
            }
            
            }
        }
        if(v[i].y>v[i+1].y){
        
           a.x=v[i].getX();
           a.y=v[i].getY();
           b.x=v[i+1].getX();
           b.y=v[i+1].getY();
           
           
        }
        if(v[i].y<v[i+1].y){
        
           a.x=v[i+1].getX();
           a.y=v[i+1].getY();
           b.x=v[i].getX();
           b.y=v[i].getY();
          
          
        }
        
        
        if(v[i].y!=v[i+1].y&&m.y<b.y&&m.y>a.y){
        int determinant=rezDeterminant(a.x,a.y,b.x,b.y,m.x,m.y);
        System.out.println("determinant= "+determinant);
        if(determinant>0)c=c+1;
        if(determinant==0){
            System.out.println("Punctul M este pe frontiera");
            return 0;
        }
        System.out.println("c1=  "+c);
        }
        if(v[i].y!=v[i+1].y&&m.y==a.y){
            if(m.x<a.x)c=c+1;
            if(m.x==a.x){
                
            System.out.println("Punctul M este pe frontiera");
            return 0;
            
            }
            
            System.out.println("c2== "+c);
            
        }
        
       if(v[i]!=v[i+1]&&m.y==b.y&&m.x==b.x){
        
        System.out.println("Punctul M este pe frontiera");
        return 0;
        
        }
        
        
        return c;
        
        
        
        }
    
    
    
    }
    
    
    
    

