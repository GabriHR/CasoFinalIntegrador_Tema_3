package GestionUsuarios;

import Main.Main;

import javax.swing.*;
import java.awt.*;

public class InterfazUsuario extends JFrame {
    private JTextField campoUsuario;
    private JPasswordField campoContrasena;
    private JButton botonEnviar;
    private JLabel mensaje;

    private final String usuarioCorrecto = "usuario";
    private final String contrasenaCorrecta = "contraseña";

    public InterfazUsuario() {
        setLayout(new GridLayout(3, 2));

        add(new JLabel("Usuario:"));
        campoUsuario = new JTextField();
        add(campoUsuario);

        add(new JLabel("Contraseña:"));
        campoContrasena = new JPasswordField();
        add(campoContrasena);

        botonEnviar = new JButton("Enviar");
        botonEnviar.addActionListener(e -> {
            String usuario = campoUsuario.getText();
            String contrasena = new String(campoContrasena.getPassword());

            if (usuario.equals(usuarioCorrecto) && contrasena.equals(contrasenaCorrecta)) {
                mensaje.setText("Inicio de sesión exitoso.");
                Main.setSesionIniciada(true);
                Main.imprimirDatos();
            } else {
                mensaje.setText("Inicio de sesión fallido.");
            }
        });
        add(botonEnviar);

        mensaje = new JLabel("");
        add(mensaje);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new InterfazUsuario();
    }
}