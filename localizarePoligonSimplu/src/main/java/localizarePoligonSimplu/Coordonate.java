/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package localizarePoligonSimplu;
import java.util.Scanner;

public class Coordonate {
    
    
     int x;
     int y;
    Scanner scan=new Scanner(System.in);
    
    public Coordonate (int x,int y){
        
        this.x=x;
        this.y=y;
        
    }
    
    public int getX(){
        
        return x;
        
    }
    
    public int getY(){
        
        return y;
        
    }
    
    public void newX(int x){
        
        this.x=x;
        
    };
    public void newY(int y){
        
        this.y=y;
        
    }
    
    public void getCoord(){
    
     x=scan.nextInt();
     y=scan.nextInt();
     scan.close();
    
    
    }
    
}
