import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import static javax.swing.UIManager.get;

public class Field extends JPanel {

    ArrayList<Vehicle> Vehicle = new ArrayList<Vehicle>();

    public Field(){
        super();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(Color.green);
        g.fillRect(0 ,0,this.getWidth(),this.getHeight());//map



//        g.setColor(Color.BLACK);
//        for(int a=80;a<800 ;a = a+80){//lane
//            g.setColor(Color.WHITE);
//            for(int b=0; b<getWidth();b =b+35){//line
//                g.fillRect(b,a,50,15);// i3 tebel i2 pjg
//            }
//            g.setColor(Color.gray);
//            g.fillRect(0,90,getWidth(),150);
//        }
//        for(int a = 0; a< Vehicle.size(); a++){
//            Vehicle.get(a).paintMe(g);
//        }
    }

    public void addVehicle(Vehicle v){
        Vehicle.add(v);
    }

}