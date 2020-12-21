
import javax.swing.*;
import java.awt.*;

public class Viewer extends JFrame {

    private final JTextField textField;

    private final JButton button1;
    private final JButton button2;
    private final JButton button3;
    private final JButton button4;
    private final JButton button5;
    private final JButton button6;
    private final JButton button7;
    private final JButton button8;
    private final JButton button9;
    private final JButton button0;
    private final JButton buttonC;
    private final JButton buttonDivide;
    private final JButton buttonMultiply;
    private final JButton buttonPlus;
    private final JButton buttonMinus;
    private final JButton buttonResult;

    public Viewer() {
        Controller controller = new Controller(this);

        setTitle("Calculator");
        setSize(460, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        setVisible(true);

        textField = new JTextField();
        textField.setBorder(null);
        textField.setEditable(false);
        textField.setFont(new Font("Ink Free", Font.BOLD, 55));


        button1 = new JButton("1");
        button1.addActionListener(controller);
        button2 = new JButton("2");
        button2.addActionListener(controller);
        button3 = new JButton("3");
        button3.addActionListener(controller);
        button4 = new JButton("4");
        button4.addActionListener(controller);
        button5 = new JButton("5");
        button5.addActionListener(controller);
        button6 = new JButton("6");
        button6.addActionListener(controller);
        button7 = new JButton("7");
        button7.addActionListener(controller);
        button8 = new JButton("8");
        button8.addActionListener(controller);
        button9 = new JButton("9");
        button9.addActionListener(controller);
        button0 = new JButton("0");
        button0.addActionListener(controller);
        buttonC = new JButton("C");
        buttonC.addActionListener(controller);
        buttonDivide = new JButton("/");
        buttonDivide.addActionListener(controller);
        buttonMultiply = new JButton("*");
        buttonMultiply.addActionListener(controller);
        buttonPlus = new JButton("+");
        buttonPlus.addActionListener(controller);
        buttonMinus = new JButton("-");
        buttonMinus.addActionListener(controller);
        buttonResult = new JButton("=");
        buttonResult.addActionListener(controller);


        add(textField);
        add(button7);
        add(button8);
        add(button9);
        add(button4);
        add(button5);
        add(button6);
        add(button1);
        add(button2);
        add(button3);
        add(button0);
        add(buttonC);
        add(buttonDivide);
        add(buttonMultiply);
        add(buttonPlus);
        add(buttonMinus);
        add(buttonResult);

        textField.setBounds(0, 0, 460, 100);
        button7.setBounds(0, 100, 115, 155);
        button8.setBounds(115, 100, 115, 155);
        button9.setBounds(230, 100, 115, 155);
        button4.setBounds(0, 255, 115, 155);
        button5.setBounds(115, 255, 115, 155);
        button6.setBounds(230, 255, 115, 155);
        button1.setBounds(0, 410, 115, 155);
        button2.setBounds(115, 410, 115, 155);
        button3.setBounds(230, 410, 115, 155);
        button0.setBounds(115, 565, 115, 155);
        buttonC.setBounds(0, 565, 115, 155);
        buttonDivide.setBounds(345, 100, 115, 155);
        buttonMultiply.setBounds(345, 255, 115, 155);
        buttonPlus.setBounds(345, 410, 115, 155);
        buttonMinus.setBounds(345, 565, 115, 155);
        buttonResult.setBounds(230, 565, 115, 155);

        button9.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        button8.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        button7.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        button6.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        button5.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        button4.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        button3.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        button2.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        button1.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        button0.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        buttonC.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        buttonDivide.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        buttonMultiply.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        buttonPlus.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        buttonMinus.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        buttonResult.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));

        button0.setFocusPainted(false);
        button1.setFocusPainted(false);
        button2.setFocusPainted(false);
        button3.setFocusPainted(false);
        button4.setFocusPainted(false);
        button5.setFocusPainted(false);
        button6.setFocusPainted(false);
        button7.setFocusPainted(false);
        button8.setFocusPainted(false);
        button9.setFocusPainted(false);
        buttonC.setFocusPainted(false);
        buttonDivide.setFocusPainted(false);
        buttonMultiply.setFocusPainted(false);
        buttonPlus.setFocusPainted(false);
        buttonMinus.setFocusPainted(false);
        buttonResult.setFocusPainted(false);

        button9.setFont(new Font("Ink Free", Font.BOLD, 30));
        button8.setFont(new Font("Ink Free", Font.BOLD, 30));
        button7.setFont(new Font("Ink Free", Font.BOLD, 30));
        button6.setFont(new Font("Ink Free", Font.BOLD, 30));
        button5.setFont(new Font("Ink Free", Font.BOLD, 30));
        button4.setFont(new Font("Ink Free", Font.BOLD, 30));
        button3.setFont(new Font("Ink Free", Font.BOLD, 30));
        button2.setFont(new Font("Ink Free", Font.BOLD, 30));
        button1.setFont(new Font("Ink Free", Font.BOLD, 30));
        button0.setFont(new Font("Ink Free", Font.BOLD, 30));
        buttonC.setFont(new Font("Ink Free", Font.BOLD, 30));
        buttonDivide.setFont(new Font("Ink Free", Font.BOLD, 30));
        buttonMultiply.setFont(new Font("Ink Free", Font.BOLD, 30));
        buttonPlus.setFont(new Font("Ink Free", Font.BOLD, 30));
        buttonMinus.setFont(new Font("Ink Free", Font.BOLD, 30));
        buttonResult.setFont(new Font("Ink Free", Font.BOLD, 30));

        button9.setBackground(Color.WHITE);
        button8.setBackground(Color.WHITE);
        button7.setBackground(Color.WHITE);
        button6.setBackground(Color.WHITE);
        button5.setBackground(Color.WHITE);
        button4.setBackground(Color.WHITE);
        button3.setBackground(Color.WHITE);
        button2.setBackground(Color.WHITE);
        button1.setBackground(Color.WHITE);
        button0.setBackground(Color.WHITE);
        buttonC.setBackground(Color.WHITE);
        buttonDivide.setBackground(Color.WHITE);
        buttonMultiply.setBackground(Color.WHITE);
        buttonPlus.setBackground(Color.WHITE);
        buttonMinus.setBackground(Color.WHITE);
        buttonResult.setBackground(new java.awt.Color(222, 120, 11));
        buttonResult.setForeground(Color.WHITE);
        buttonC.setForeground(new java.awt.Color(222, 120, 11));

    }

    public JTextField getTextField() {
        return textField;
    }

    public JButton getButtonResult() {
        return buttonResult;
    }

    public JButton getButton1() {
        return button1;
    }

    public JButton getButton2() {
        return button2;
    }

    public JButton getButton3() {
        return button3;
    }

    public JButton getButton4() {
        return button4;
    }

    public JButton getButton5() {
        return button5;
    }

    public JButton getButton6() {
        return button6;
    }

    public JButton getButton7() {
        return button7;
    }

    public JButton getButton8() {
        return button8;
    }

    public JButton getButton9() {
        return button9;
    }

    public JButton getButton0() {
        return button0;
    }

    public JButton getButtonC() {
        return buttonC;
    }

    public JButton getButtonDivide() {
        return buttonDivide;
    }

    public JButton getButtonMultiply() {
        return buttonMultiply;
    }

    public JButton getButtonPlus() {
        return buttonPlus;
    }

    public JButton getButtonMinus() {
        return buttonMinus;
    }


}
