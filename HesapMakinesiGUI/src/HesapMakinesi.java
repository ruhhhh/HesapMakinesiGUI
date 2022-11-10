import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HesapMakinesi {
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button1;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button1;
    private JButton a9Button;
    private JButton a0Button;
    private JButton a4Button;
    private JButton a8Button;
    private JButton button13;
    private JButton button14;
    private JButton enterButton;
    private JButton button1;
    private JTextField textField1;
    private JButton button2;
    private JButton cButton;
    private JRadioButton kapalıRadioButton;
    private JRadioButton açıkRadioButton;
    private JPanel calculator;

    double total1;
    double total2;
    double result;
    String operator;
    String charAt;

    public HesapMakinesi() {
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn1 = textField1.getText() + a1Button.getText();
                textField1.setText(btn1);
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn2 = textField1.getText() + a2Button.getText();
                textField1.setText(btn2);
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn3 = textField1.getText() + a3Button.getText();
                textField1.setText(btn3);
            }
        });
        a4Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn4 = textField1.getText() + a4Button1.getText();
                textField1.setText(btn4);
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn5 = textField1.getText() + a5Button.getText();
                textField1.setText(btn5);
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn6 = textField1.getText() + a6Button.getText();
                textField1.setText(btn6);
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn7 = textField1.getText() + a7Button.getText();
                textField1.setText(btn7);
            }
        });
        a8Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn8 = textField1.getText() + a8Button1.getText();
                textField1.setText(btn8);
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn9 = textField1.getText() + a9Button.getText();
                textField1.setText(btn9);
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn0 = textField1.getText() + a0Button.getText();
                textField1.setText(btn0);
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total1 = Double.parseDouble(textField1.getText());
                textField1.setText(" ");
                operator = "+";
            }
        });
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = Double.parseDouble(textField1.getText());
                if(operator.equalsIgnoreCase("+"))
                {
                    result = total1+total2;
                    textField1.setText(String.valueOf(result));
                }
                else if(operator.equalsIgnoreCase("-"))
                {
                    result = total1-total2;
                    textField1.setText(String.valueOf(result));
                }
                else if(operator.equalsIgnoreCase("*"))
                {
                    result = total1*total2;
                    textField1.setText(String.valueOf(result));
                }
                else if(operator.equalsIgnoreCase("/"))
                {
                    result = total1/total2;
                    textField1.setText(String.valueOf(result));
                }
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total1 = Double.parseDouble(textField1.getText());
                textField1.setText(" ");
                operator = "-";
            }
        });
        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total1 = Double.parseDouble(textField1.getText());
                textField1.setText(" ");
                operator = "*";
            }
        });
        button14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total1 = Double.parseDouble(textField1.getText());
                textField1.setText(" ");
                operator = "/";
            }
        });
        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator = null;
                total1 = 0.0;
                total2 = 0.0;
                textField1.setText(" ");
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnPoint = textField1.getText() + button1.getText();
                textField1.setText(btnPoint);

            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total1 = 0;
                textField1.setText(" ");
            }
        });
        kapalıRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a1Button.setVisible(false);
                a2Button.setVisible(false);
                a3Button.setVisible(false);
                a4Button1.setVisible(false);
                a5Button.setVisible(false);
                a6Button.setVisible(false);
                a7Button.setVisible(false);
                a8Button1.setVisible(false);
                a9Button.setVisible(false);
                a0Button.setVisible(false);
                a4Button.setVisible(false);
                a8Button.setVisible(false);
                button13.setVisible(false);
                button14.setVisible(false);
                enterButton.setVisible(false);
                button1.setVisible(false);
                button2.setVisible(false);
                cButton.setVisible(false);
                textField1.setText("Hesap makinesi kapalıdır.");
            }
        });
        açıkRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a1Button.setVisible(true);
                a2Button.setVisible(true);
                a3Button.setVisible(true);
                a4Button1.setVisible(true);
                a5Button.setVisible(true);
                a6Button.setVisible(true);
                a7Button.setVisible(true);
                a8Button1.setVisible(true);
                a9Button.setVisible(true);
                a0Button.setVisible(true);
                a4Button.setVisible(true);
                a8Button.setVisible(true);
                button13.setVisible(true);
                button14.setVisible(true);
                enterButton.setVisible(true);
                button1.setVisible(true);
                button2.setVisible(true);
                cButton.setVisible(true);

            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("HesapMakinesi");
        frame.setContentPane(new HesapMakinesi().calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
