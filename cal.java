import java.applet.*;
import java.awt.event.*;
import java.awt.*;

public class cal extends Applet implements ActionListener
{
TextField t1,t2,t3;
Button b1,b2,b3,b4;
Label l1,l2,l3;
public void init()
{
t1=new TextField(5);
t2=new TextField(5);
t3=new TextField(5);
l1=new Label("First number");
l2=new Label("Second number");
l3=new Label();
b1=new Button("Addition");
b2=new Button("Substraction");
b3=new Button("Multiplication");
b4=new Button("Division");
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
GridLayout g=new GridLayout(5,2);
setLayout(g);
add(l1);  add(t1);  add(l2);  add(t2);  add(l3);  add(t3);  add(b1);  add(b2);  add(b3);  add(b4);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
int n1 = Integer.parseInt(t1.getText());
int n2 = Integer.parseInt(t2.getText());
int n3 = n1+n2;
l3.setText("Addition is");
t3.setText(Integer.toString(n3));
}

if(e.getSource()==b2)
{
int n1 = Integer.parseInt(t1.getText());
int n2 = Integer.parseInt(t2.getText());
int n4 = n1-n2;
l3.setText("Subtraction is");
t3.setText(Integer.toString(n4));
}

if(e.getSource()==b3)
{
int n1 = Integer.parseInt(t1.getText());
int n2 = Integer.parseInt(t2.getText());
int n5 = n1*n2;
l3.setText("Multiplication is");
t3.setText(Integer.toString(n5));
}
if(e.getSource()==b4)
{
int n1 = Integer.parseInt(t1.getText());
int n2 = Integer.parseInt(t2.getText());
int n6 = n1/n2;
l3.setText("Division is");
t3.setText(Integer.toString(n6));
}
}
}

