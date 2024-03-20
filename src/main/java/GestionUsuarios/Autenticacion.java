package GestionUsuarios;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Autenticacion {
    private Map<String, String> usuarios;
    private Label campoUsuario = new Label();
    String usuario = campoUsuario.getText();
    private JPasswordField campoContrasena = new JPasswordField();
    String contrasena = new String(campoContrasena.getPassword());

    public Autenticacion() {
        usuarios = new HashMap<>();
        // Aquí puedes agregar los usuarios y contraseñas válidos
        usuarios.put("usuario", "contrasena");
        // Agrega más usuarios y contraseñas según sea necesario
    }

    public boolean iniciarSesion(String usuario, String contrasena) {
        String contrasenaValida = usuarios.get(usuario);
        return contrasenaValida != null && contrasenaValida.equals(contrasena);
    }
}