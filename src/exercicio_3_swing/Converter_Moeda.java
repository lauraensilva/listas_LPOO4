package exercicio_3_swing;

import java.awt.*;
import java.awt.event.*;

public class Converter_Moeda extends Frame {
    private TextField valorReaisField;
    private TextField valorEuroField;
    private Label resultadoLabel;

    public Converter_Moeda() {
        setTitle("Conversor de Moedas");
        setSize(300, 200);
        setLayout(new FlowLayout());

        Label labelReais = new Label("Valor em Reais (R$):");
        valorReaisField = new TextField(10);

        Label labelEuro = new Label("Valor em Euro (€):");
        valorEuroField = new TextField(10);

        Button converterButton = new Button("Converter");
        converterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                converterValores();
            }
        });

        Button limparButton = new Button("Limpar");
        limparButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                valorReaisField.setText("");
                valorEuroField.setText("");
                resultadoLabel.setText("");
            }
        });

        resultadoLabel = new Label("");

        add(labelReais);
        add(valorReaisField);
        add(labelEuro);
        add(valorEuroField);
        add(converterButton);
        add(limparButton);
        add(resultadoLabel);

        setVisible(true);
    }

    private void converterValores() {
        try {
            double valorReais = Double.parseDouble(valorReaisField.getText());
            double cotacaoEuroReal = 6.74; // Cotação fictícia para exemplo
            double valorEuro = valorReais / cotacaoEuroReal;
            valorEuroField.setText(String.format("%.2f", valorEuro));
        } catch (NumberFormatException ex) {
            resultadoLabel.setText("Insira um valor válido em reais.");
        }
    }

    public static void main(String[] args) {
        new Converter_Moeda();
    }
}