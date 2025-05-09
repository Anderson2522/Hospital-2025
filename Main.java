import javax.swing.JFrame; // Para crear ventanas
import javax.swing.JLabel; // Para mostrar texto en la interfaz

public class Main {

public static void main(String[] args) {

JFrame miVentana = new JFrame(); // Crea un objeto JFrame (ventana)
miVentana.setTitle("Hospital SCL"); // Establece el título de la ventana
miVentana.setSize(1000, 800); // Define el tamaño (ancho, alto)

JLabel texto = new JLabel(); // Crea un JLabel (etiqueta de texto)
texto.setText("Hola mundo"); // Asigna texto a la etiqueta
miVentana.add(texto); // Añade la etiqueta a la ventana

miVentana.setVisible(true); // Hace visible la ventana
 }
}