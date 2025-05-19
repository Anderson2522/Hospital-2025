import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import vistas.panelLogin;

public class Main {
    public static void main(String[] args) {
        JFrame miVentana = new JFrame();
        miVentana.setTitle("Hospital SCL");
        miVentana.setSize(1000, 800);
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setLayout(new BorderLayout());

        JPanel panelBanner = new JPanel();
        panelBanner.setPreferredSize(new Dimension(500,800));
        panelBanner.setSize(500, 800);
        panelBanner.setOpaque(true);
        panelBanner.setBackground(Color.BLACK);
        miVentana.add(panelBanner, BorderLayout.WEST);


        //Panel Login 
        panelLogin panelLogin = new panelLogin();
        miVentana.add(panelLogin.getView(), BorderLayout.CENTER);

        miVentana.setVisible(true);
    }
}