/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.estudio.aplicacion.view;

import com.estudio.aplicacion.modelos.Ejemplar;
import com.estudio.aplicacion.utils.Fecha;
import com.estudio.aplicacion.utils.Idioma;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormularioEjemplar extends JFrame {

    private JTextField campoTitulo;
    private JTextField campoAutor;
    private JTextField campoFechaPublicacion;
    private JTextField campoIdioma;
    private JButton botonCrear;
    private JTextArea areaResultado;

    public FormularioEjemplar() {
        // Configuración básica de la ventana
        setTitle("Formulario de Ejemplar");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel superior con etiquetas y campos de texto
        JPanel panelCampos = new JPanel();
        panelCampos.setLayout(new GridLayout(4, 2, 10, 10));

        panelCampos.add(new JLabel("Título:"));
        campoTitulo = new JTextField();
        panelCampos.add(campoTitulo);

        panelCampos.add(new JLabel("Autor:"));
        campoAutor = new JTextField();
        panelCampos.add(campoAutor);

        panelCampos.add(new JLabel("Fecha de Publicación (dd/MM/yyyy):"));
        campoFechaPublicacion = new JTextField();
        panelCampos.add(campoFechaPublicacion);

        panelCampos.add(new JLabel("Idioma (Español, Inglés, Francés):"));
        campoIdioma = new JTextField();
        panelCampos.add(campoIdioma);

        add(panelCampos, BorderLayout.NORTH);

        // Botón para crear ejemplar
        botonCrear = new JButton("Crear Ejemplar");
        add(botonCrear, BorderLayout.CENTER);

        // Área de resultado para mostrar la información del ejemplar
        areaResultado = new JTextArea();
        areaResultado.setEditable(false);
        add(new JScrollPane(areaResultado), BorderLayout.SOUTH);

        // Evento del botón
        botonCrear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener los datos ingresados
                String titulo = campoTitulo.getText();
                String autor = campoAutor.getText();

                Fecha fechaPublicacion;
                try {
                    fechaPublicacion = Fecha.fromString(campoFechaPublicacion.getText());
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                Idioma idioma;
                try {
                    idioma = Idioma.fromString(campoIdioma.getText());
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Crear el objeto Ejemplar
                Ejemplar ejemplar = new Ejemplar(titulo, autor, fechaPublicacion, idioma);

                // Mostrar la información del ejemplar en el área de texto
                areaResultado.setText("Ejemplar creado:\n" +
                                       "Título: " + ejemplar.getTitulo() + "\n" +
                                       "Autor: " + ejemplar.getAutor() + "\n" +
                                       "Fecha de Publicación: " + ejemplar.getFechaPublicacion() + "\n" +
                                       "Idioma: " + ejemplar.getIdioma());
            }
        });
    }

    public static void main(String[] args) {
        // Crear y mostrar la ventana
        SwingUtilities.invokeLater(() -> {
            FormularioEjemplar ventana = new FormularioEjemplar();
            ventana.setVisible(true);
        });
    }
}