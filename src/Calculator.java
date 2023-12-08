import javax.swing.*;
import javax.swing.plaf.BorderUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator implements ActionListener {
    JFrame frame;
    JTextField textField;
    JButton[] numberButtons = new JButton[10];
    JButton[] functions;
    JButton addButton, setButton, mulButton, divbutton;
    JButton decButton, equButton, delButton, clrButton;
    JPanel panel = new JPanel();
    Font myFont = new Font("Arial", Font.BOLD, 30);

    BigDecimal num1 = BigDecimal.valueOf(0), num2 = BigDecimal.valueOf(0), result = BigDecimal.valueOf(0);
    char operator;



    public Calculator() {
        frame = new JFrame("Мій калькулятор!!!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);

        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        textField.setFont(myFont);
        textField.setEditable(false);

        addButton = new JButton("+");
        setButton = new JButton("-");
        mulButton = new JButton("*");
        divbutton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("Вдлт");
        clrButton = new JButton("Очис");
        functions = new JButton[]{addButton, setButton, mulButton, divbutton, decButton, equButton, decButton, clrButton,}

        for (JButton function : functions ){
            function.addActionListener(this);
            function.setFont(myFont);
            function.setFocusable(false);

        }

        for (int i = 0; i<10; i++) {
            numberButtons[i] = new JButton("" + i);
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
        }
        delButton.setBounds(50, 430, 145, 50);
        clrButton.setBounds(205, 430, 145,50);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}