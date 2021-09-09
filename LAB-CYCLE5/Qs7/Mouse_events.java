import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Mouse_events extends Applet implements MouseListener,MouseMotionListener
{
int x=0;
int y=0;
String msg="";
public void init()
{
addMouseListener(this);
addMouseMotionListener(this);
}
public void mouseClicked(MouseEvent me)
{
x=20;
y=40;
msg="MOUSE CLICKED";
repaint();
}
public void mousePressed(MouseEvent me)
{
x=30;
y=60;
msg="MOUSE PRESSED";

repaint();
}
public void mouseReleased(MouseEvent me)
{
x=30;
y=60;
msg="MOUSE RELEASED";
repaint();
}
public void mouseEntered(MouseEvent me)
{
x=40;
y=80;
msg="MOUSE ENTERED";
repaint();
}
public void mouseExited(MouseEvent me)
{
x=40;
y=80;
msg="MOUSE EXITED";
repaint();
}
public void mouseDragged(MouseEvent me)
{
x=me.getX();
y=me.getY();
showStatus("Currently mouse dragged"+x+" "+y);

repaint(); }
public void mouseMoved(MouseEvent me)
{
x=me.getX();
y=me.getY();
showStatus("Currently mouse is at"+x+" "+y);
repaint();
}
public void paint(Graphics g)
{
g.drawString("Handling Mouse Events",30,20);
g.drawString(msg,60,40);
}
}
/*<applet code="Mouse_events" width=300 height=300>
</applet>*/