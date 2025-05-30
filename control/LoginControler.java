package control;

public class LoginControler {
    
    String[][] usuariosYContraseñas = {
        {"anderson", "hola123"},       // Dato original (sin cambios)
        {"skyline", "clave123"},       
        {"nico_dev", "pass456"},
        {"valen_star", "sistemaAna"},
        {"rootMaster", "secure2024"},
        {"techie101", "funWithCode"},
        {"phoenix7", "flameKey"},
        {"solaris", "nightBeam"},
        {"backpacker", "trip2023"},
        {"bookLover", "readMore12"},
        {"gamerX", "playStation5"}
    };

    public boolean validacionDatos(String EntradaUsuario, String EntradaContraseña) {

        for (int i = 0; i < usuariosYContraseñas.length; i++) {
            String usuarioCorrecto = usuariosYContraseñas[i][0];
            String contraseñaCorrecta = usuariosYContraseñas[i][1];
            
         
            if (usuarioCorrecto.equals(EntradaUsuario) && 
                contraseñaCorrecta.equals(EntradaContraseña)) {
                return true; 
            }
        }
        return false;
    }
}