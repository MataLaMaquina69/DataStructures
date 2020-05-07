package Search;
import javax.swing.*;
import java.awt.event.*;

public class Boton extends JFrame implements ActionListener{

    JButton boton;
    JLabel texto;

    public Boton() {
    setLayout(null);
    boton=new JButton("SALIR");
    boton.setBounds(100,150,100,30);
    boton.addActionListener(this);
    add(boton);
    texto=new JLabel("Presione el botón para salir.");
    texto.setBounds(50,50,220,40);
    add(texto);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton) {
            setTitle("Saldrá en 3 segundos");
            try{
                Thread.sleep(3000);
                System.exit(0);           
            } catch(Exception excep) { System.exit(0); }
        }
    }
    
}

