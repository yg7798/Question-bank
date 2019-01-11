import java.awt.*;
import java.awt.event.*;
public class Calculator extends Frame implements ActionListener{
Frame obj = new Frame("scintific calculator") ;
Panel p,p1;
double a,b,s;
String opr,str;
 TextField t1;
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
Calculator(){
   p=new Panel();
   p1=new Panel();
    p1.setBounds(50,50,350,100);
	p1.setBackground(Color.green);
	p1.setLayout(null);
	p.setBounds(50,200,350,400);
	p.setBackground(Color.blue);
	p.setLayout(new GridLayout(4,4));
t1=new TextField("0");
//t1.setBackground(Color.green);
t1.setBounds(0,280,800,100);
t1.setBackground(Color.blue);
t1.setEnabled(true);
p1.add(t1);
b1=new Button("9");
b2=new Button("8");
b3=new Button("7");
b4=new Button("6");
b5=new Button("5");
b6=new Button("4");
b7=new Button("3");
b8=new Button("2");
b9=new Button("1");
b10=new Button("0");
b11=new Button("+");
b12=new Button("-");
b13=new Button("*");
b14=new Button("/");
b15=new Button("=");
b16=new Button("CE");

addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we)
        {
                System.exit(0);
             }
        });
setSize(800,800);
setLayout(new GridLayout(2,1));
setVisible(true);
p.add(b1);
//b1.setBounds(50,80,50,50);
p.add(b2);
//b2.setBounds(150,80,50,50);
p.add(b3);
//b3.setBounds(250,80,50,50);
p.add(b16);
//b16.setBounds(350,80,50,50);
p.add(b4);
//b4.setBounds(50,180,50,50);
p.add(b5);
//b5.setBounds(150,180,50,50);
p.add(b6);
//b6.setBounds(250,180,50,50);
p.add(b11);
//b11.setBounds(350,180,50,50);
p.add(b7);
//b7.setBounds(50,280,50,50);
p.add(b8);
//b8.setBounds(150,280,50,50);
p.add(b9);
//b9.setBounds(250,280,50,50);
p.add(b12);
//b12.setBounds(350,280,50,50);
p.add(b10);
//b10.setBounds(50,380,50,50);
p.add(b15);
//b15.setBounds(150,380,50,50);
p.add(b14);
//b14.setBounds(250,380,50,50);
p.add(b13);
//b13.setBounds(350,380,50,50);
//b1.setBackground(Color.blue);
add(p1);
add(p);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b10.addActionListener(this);
b11.addActionListener(this);
b12.addActionListener(this);
b13.addActionListener(this);
b14.addActionListener(this);
b15.addActionListener(this);
b16.addActionListener(this);

}
public void actionPerformed(ActionEvent e)
{
	Button B=(Button)e.getSource();
if(B==b1)
{
	//System.out.println("HI");
  str=t1.getText();
  str=str +"9";
	t1.setText(str);
//System.out.println("HI "+str);
}
if(B==b2)
{
 str=t1.getText();
t1.setText(str+"8");
}
if(B==b3)
{
 str=t1.getText();
t1.setText(str+"7");
}
if(e.getSource()==b4)
{
	str=t1.getText();
t1.setText(str+"6");
}
if(e.getSource()==b5)
{
 str=t1.getText();
t1.setText(str+"5");
}
if(e.getSource()==b6)
{
 str=t1.getText();
t1.setText(str+"4");
}
if(e.getSource()==b7)
{
 str=t1.getText();
t1.setText(str+"3");
}
if(e.getSource()==b8)
{
 str=t1.getText();
t1.setText(str+"2");
}
if(e.getSource()==b9)
{
 str=t1.getText();
t1.setText(str+"1");
}
if(e.getSource()==b10)
{
 str=t1.getText();
t1.setText(str+"0");
}
if(e.getSource()==b11)
{
a=Double.parseDouble(t1.getText());
t1.setText(null);
 opr="+";
}
if(e.getSource()==b12)
{
a=Double.parseDouble(t1.getText());
t1.setText(null);
 opr="-";
}
if(e.getSource()==b13)
{
a=Double.parseDouble(t1.getText());
t1.setText(null);
 opr="*";
}

if(e.getSource()==b14)
{
a=Double.parseDouble(t1.getText());
t1.setText(null);
 opr="/";
}

if(e.getSource()==b15)
{
	b=Integer.parseInt(t1.getText());
if("+".equals(opr))
{
s=a+b;
t1.setText(Double.toString(s));
}
if("-".equals(opr))
{
s=a-b;
t1.setText(Double.toString(s));
}
if("*".equals(opr))
{
s=a*b;
t1.setText(Double.toString(s));
}
if("/".equals(opr))
{

s=a/b;
t1.setText(Double.toString(s));
}
}
if(e.getSource()==b16)
{
t1.setText(null);
}
}
public static void main(String args[])
{
Calculator obj=new Calculator();
}
}






