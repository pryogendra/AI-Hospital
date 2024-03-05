import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Solution extends JFrame{
    JLabel lb=new JLabel("Solutions :");
    JFrame fr=new JFrame("Solution");
    Container c3 = getContentPane();
    JTextArea jt=new JTextArea(7,20);
    JButton jb=new JButton("OK");
    Solution(String s)
    {
        c3.setLayout(null);
        lb.setBounds(100,50,350,30);
        lb.setFont(new Font("Serif", Font.ITALIC, 30));
        jt.setBounds(100,100,400,200);
        jb.setBounds(240,350,100,30);
        //jb.addActionListener(this);


        c3.add(lb);
        c3.add(jt);
        //c3.add(jb);
        fr.add(c3);
        fr.setVisible(true);
        fr.setSize(600,500);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        if (s.equalsIgnoreCase("Fever"))
        {
            jt.append("1.ASOZEN FORTE - " +
                    "\n    Aceclofenac + paracetamol + Chlorzoxazone\n " +
                    "2.Amoxible     - \n    Amoxycillin 250 mg\n " +
                    "3.MEF Plus     - \n    Mefenamic Acid 500 mg. + Paracetamol 325 mg. Tablets\n " +
                    "4.NIMSE 100    - \n    Nimesulide 100 mg.\n " +
                    "5.Parazex 500  -\n    Paracetamol 500 mg. Tablets \n");
        }
        else if (s.equalsIgnoreCase("Allergie"))
        {
            jt.append("1.Cetirizine (Zyrtec, Zyrtec Allergy)\n" +
                    "2.Desloratadine (Clarinex)\n" +
                    "3.Fexofenadine (Allegra, Allegra Allergy)\n" +
                    "4.Levocetirizine (Xyzal, Xyzal Allergy)\n" +
                    "5.Loratadine (Alavert, Claritin)  \n");
        }
        else if (s.equalsIgnoreCase("COLD AND FLU"))
        {
            jt.append("1. Codral®\n"+
            "2. Coldrex®\n"+
                    "3. Lemsip®\n"+
                    "4. Dimetapp®\n"+
                    "5. Robitussin® \n"+
                    "6. Benadryl®\n"+
                    "7. Duro-Tuss®\n"+
                    "8. Maxiclear®\n"+
                    "9. Sudafed PE®\n");
        }
        else if (s.equalsIgnoreCase("Diarrhea"))
        {
            jt.append("1. LoperamideTrusted\n"+
            "2. Bismuth subsalicylateTrusted\n"+
                    "3. Alosetron\n"+
                    "4. Rifaximin\n"+
                    "5. Eluxadoline\n");
        }
        else if (s.equalsIgnoreCase("conjunctivitis(sore/pink eye)"))
        {
            jt.append("1. Besifloxacin ophthalmic (Besivance)\n" +
                    "2. Gatifloxacin ophthalmic solution 0.3% (Zymaxid)\n" +
                    "3. Moxifloxacin ophthalmic (Moxeza, Vigamox)\n" +
                    "4. Levofloxacin ophthalmic.\n" +
                    "5. Ciprofloxacin ophthalmic (Ciloxan)\n" +
                    "6. Ofloxacin ophthalmic (Ocuflox)\n");
        }
    }
//    public void actionPerformed(ActionEvent ae)
//    {
//        EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                try {
//                    JOptionPane.showMessageDialog(fr,"THANK YOU !!");
//                    fr.dispose();
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//    }
//    public static void main(String[] args) {
//        new Solution("conjunctivitis(sore/pink eye)");
//    }
}
