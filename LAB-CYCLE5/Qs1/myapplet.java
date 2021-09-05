import java.applet.*;
import java.awt.*;
public class myapplet extends Applet
{
    public void paint(Graphics g)
    {
        g.drawLine(20,20,200,20);
        g.setColor(Color.RED);
        g.drawRect(20,80,150,150);
        g.fillRect(20,80,150,150);
        g.setColor(Color.GREEN);
        g.drawOval(20,300,200,150);
        g.fillOval(20,300,200,150);
        
    }
}
/*
<applet code="myapplet.class" width="500" height="700" border="2">
</applet>
*/