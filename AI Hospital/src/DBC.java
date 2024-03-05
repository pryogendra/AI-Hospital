import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class REGISTER extends JFrame implements ActionListener
{
    JFrame f1=new JFrame("Ragister");
    Container c1 = getContentPane();
    String name,email="",location="";
    int age=0;
    long mobile=0;
    JLabel label=new JLabel("-: REGISTRATION FORM :-");
    JLabel l_name=new JLabel("Name");
    JTextField t_name=new JTextField(50);
    JLabel l_age=new JLabel("Age");
    JTextField t_age=new JTextField(50);
    JLabel l_email=new JLabel("Email");
    JTextField t_email=new JTextField(50);
    JLabel l_location=new JLabel("Location");
    JTextField t_location=new JTextField(50);
    JLabel l_mobile=new JLabel("Mobile No.");
    JTextField t_mobile=new JTextField(50);
    JButton submit=new JButton("SUBMIT");
    JButton reset=new JButton("RESET");

    REGISTER()
    {
        c1.setLayout(null);
        c1.setBackground(Color.lightGray);
        label.setBounds(100,50,350,30);
        label.setFont(new Font("Serif", Font.BOLD, 24));
        l_name.setBounds(150,150,100,30);
        l_age.setBounds(150,200,100,30);
        l_mobile.setBounds(150,250,100,30);
        l_email.setBounds(150,300,100,30);
        l_location.setBounds(150,350,100,30);

        t_name.setBounds(300,150,200,30);
        t_age.setBounds(300,200,200,30);
        t_mobile.setBounds(300,250,200,30);
        t_email.setBounds(300,300,200,30);
        t_location.setBounds(300,350,200,30);
        submit.setBounds(150,450,100,30);
        reset.setBounds(350,450,100,30);

        c1.add(label);
        c1.add(l_name);
        c1.add(l_age);
        c1.add(l_email);
        c1.add(l_mobile);
        c1.add(l_location);
        c1.add(t_name);
        c1.add(t_age);
        c1.add(t_email);
        c1.add(t_mobile);
        c1.add(t_location);
        c1.add(submit);
        c1.add(reset);
        f1.add(c1);
        submit.addActionListener(this);
        submit.setActionCommand("submit");
        reset.addActionListener(this);

        f1.setVisible(true);
        f1.setSize(600,700);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("submit"))
        {
            try
            {
                name=t_name.getText();
                System.out.println(name);
                String s1=t_age.getText();
                age=Integer.parseInt(s1);
                String s2=t_mobile.getText();
                mobile=Long.parseLong(s2);
                email=t_email.getText();
                location=t_location.getText();
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/ai_hospital","root","1234");
                String sql = "insert into register(name,age,email,mobile,location) values(?,?,?,?,?)";
                PreparedStatement ps=con.prepareStatement(sql);
                ps.setString(1,name);
                ps.setInt(2,age);
                ps.setString(3,email);
                ps.setLong(4,mobile);
                ps.setString(5,location);
                ps.executeUpdate();

                JOptionPane.showMessageDialog(this,"Form Submitted");
                f1.dispose();
                EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        try {
                            new DBC();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
            catch(Exception ae)
            {
                JOptionPane.showMessageDialog(this,"Server Error","ERROR ",JOptionPane.WARNING_MESSAGE);
            }
        }
        else {
            t_age.setText("");
            t_name.setText("");
            t_email.setText("");
            t_mobile.setText("");
            t_location.setText("");
        }
    }
}
class Front_Page extends JFrame implements ActionListener {
    boolean chk = true;
    int i;
    JFrame f2 = new JFrame("AI HOSPITAL");

    Front_Page() {
        login_page();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("bn")) {
            f2.dispose();
            chk = false;
        }
    }

    void login_page() {
        JLabel la = new JLabel("", SwingConstants.CENTER);
        JLabel la2 = new JLabel("", SwingConstants.CENTER);
        JLabel n = new JLabel();
        JLabel n0 = new JLabel();
        JLabel n1 = new JLabel();
        JLabel n2 = new JLabel();
        JLabel n3 = new JLabel();
        JLabel n4=new JLabel();
        f2.getContentPane().setBackground(Color.black);
        JButton bn = new JButton("NEXT");
        Container co = getContentPane();
        la.setText(" ARITIFICIAL  INTELLIGENCE ");
        la.setFont(new Font("Cuckoo", Font.ITALIC, 30));
        la2.setText(" HOSPITAL ");
        la2.setFont(new Font("Cuckoo", Font.ITALIC, 30));

        n.setText("Prepared by....");
        n1.setText("4098 - YOGENDRA PRASAD");
        n2.setText("4097 - SUFIYAN KHAN");
        n3.setText("4101 - KUNAL PANDEY");
        n.setFont(new Font("",Font.ITALIC ,18));
        n1.setFont(new Font("",Font.ITALIC, 16));
        n2.setFont(new Font("",Font.ITALIC, 16));
        n3.setFont(new Font("",Font.ITALIC, 16));

        co.setLayout(null);
        while (true) {
            for (i = 0; i < 1450; i++) {
                co.setBackground(Color.CYAN);
                la.setBounds(800 - i, 70, 650, 30);
                la2.setBounds(810 - i, 110, 650, 30);

                n.setBounds(200, 200, 200, 20);
                n1.setBounds(220, 230, 300, 20);
                n2.setBounds(220, 260, 200, 20);
                n3.setBounds(220, 290, 200, 20);
                bn.setBounds(300, 400, 100, 30);
                bn.setActionCommand("bn");
                bn.addActionListener(this);
                co.add(n);co.add(n1);
                co.add(n2);co.add(n3);
                co.add(la);
                co.add(la2);
                co.add(bn);
                f2.add(co);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                }
                f2.setSize(800, 600);
                f2.setVisible(true);
                f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f2.setResizable(false);
                if (!chk) {
                    return;
                }
            }
            if (!chk) {
                return;
            }
        }
    }
}
public class DBC extends JFrame implements ActionListener
{
    Connection con;
    JFrame frame=new JFrame();
    JFrame f2=new JFrame("AI HOSPITAL");
    JLabel label=new JLabel();
    ResultSet resultSet;
    PreparedStatement ps;
    String sql,Disease;
    int no=0;
    JPanel panel=new JPanel();
    Container container = getContentPane();
    JRadioButton box1=new JRadioButton("");
    JRadioButton box2=new JRadioButton("");
    JRadioButton box3=new JRadioButton("");
    JRadioButton box4=new JRadioButton("");
    JRadioButton box5=new JRadioButton("");
    JButton nextButton=new JButton("");

    DBC()
    {
        GO(0);
    }
    void GO(int a)
    {
        no=a;
        container.setLayout(null);
        container.setBackground(Color.LIGHT_GRAY);
        label.setBounds(80,50,400,50);
        box1.setBounds(100,100,400,30);
        box2.setBounds(100,150,400,30);
        box3.setBounds(100,200,400,30);
        box4.setBounds(100,250,400,30);
        box5.setBounds(100,300,400,30);

        nextButton.setBounds(50, 400, 100, 30);
        CONNECTION();
        CHECK();

        frame.getContentPane();
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setSize(700,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void CONNECTION()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/ai_hospital","root","1234");
            sql = "SELECT * FROM disease_lists WHERE no = ?";
            ps=con.prepareStatement(sql);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    void CHECK()
    {
        try {
            no++;
            ps.setInt(1, no);
            resultSet = ps.executeQuery();

            if (resultSet.next())
            {
                label.setText("SELECT YOUR SYMPTOMS : ");
                label.setFont(new Font("Serif", Font.BOLD, 24));
                box1.setText(resultSet.getString("symptom1"));
                box2.setText(resultSet.getString("symptom2"));
                box3.setText(resultSet.getString("symptom3"));
                box4.setText(resultSet.getString("symptom4"));
                box5.setText(resultSet.getString("symptom5"));
                Disease=resultSet.getString("disease_name");
                nextButton.setText("NEXT");
                nextButton.setFont(new Font("Serif", Font.BOLD, 18));
                container.add(label);
                container.add(box1);
                container.add(box2);
                container.add(box3);
                container.add(box4);
                container.add(box5);
                container.add(nextButton);
                frame.add(container);
                nextButton.addActionListener(this);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    void ACTION()
    {
        int result = JOptionPane.showConfirmDialog(frame, "Sure? You want to continue?", "???",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            frame.dispose();
            EventQueue.invokeLater(new Runnable() {
                public void run() {
                    try {
                        GO(no);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        else if(result == JOptionPane.NO_OPTION) {
            frame.dispose();
            EventQueue.invokeLater(new Runnable() {
                public void run() {
                    try {
                        GO(no-1);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        else {
            frame.dispose();
            EventQueue.invokeLater(new Runnable() {
                public void run() {
                    try {
                        GO(no-1);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }
    public void actionPerformed(ActionEvent e) {
        if(box1.isSelected() && box2.isSelected() && box3.isSelected() && box4.isSelected() &&
                box5.isSelected())
        {
            frame.dispose();
            EventQueue.invokeLater(new Runnable() {
                public void run() {
                    try {
                        JOptionPane.showMessageDialog(frame,"You are suffering from "+Disease,
                                "!! Disease Name !!",JOptionPane.WARNING_MESSAGE);
                        frame.dispose();
                        new Solution(Disease);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        else
        {
            EventQueue.invokeLater(new Runnable() {
                public void run() {
                    try {
                        ACTION();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }
    public static void main(String[] args) {
        new Front_Page();
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new REGISTER();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        //new DBC();
    }
}