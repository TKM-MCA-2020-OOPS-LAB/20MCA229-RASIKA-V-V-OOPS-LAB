import java.awt.*;
import java.applet.*;

public class Max_of_three_no extends Applet
{
     TextField T1,T2,T3;

      public void init(){
          T1 = new TextField(10);
          T2 = new TextField(10);
          T3 = new TextField(10);

          add(T1);
          add(T2);
          add(T3);
        }

        public void paint(Graphics g){
             int x,y,z,result;
             String str;

             g.drawString("Enter value to Check the Maximum of three ",20,50);

             str=T1.getText();
             x=Integer.parseInt(str);
             str=T2.getText();
             y=Integer.parseInt(str);
             str=T3.getText();
             z=Integer.parseInt(str);

              g.setColor(Color.blue);
              if (x>y) {
                  if (x>z)
                      result=x;
                  else
                      result=z;
                }
            else{
                  if (y>z) 
                      result=y;
                  else
                      result=z;
              }
              g.drawString("Maximum of Three number is "+result,20,80);
            }

            public boolean action(Event e, Object o){
                  repaint();
                  return true;
            }
}
/* <applet code="Max_of_three_no.class" height=150 width=400>
   </applet> */