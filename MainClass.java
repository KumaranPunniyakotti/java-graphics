package com.company;

import javax.swing.*;
import java.awt.*;

//MainClass.java

class Calculator  {
        JFrame frame;
        JLabel label = new JLabel();
        JTextField textField = new JTextField();
        JRadioButton onRadioButton = new JRadioButton("on");
        JRadioButton offRadioButton = new JRadioButton("off");
        JButton buttonZero = new JButton("0");
        JButton buttonOne = new JButton("1");
        JButton buttonTwo = new JButton("2");
        JButton buttonThree = new JButton("3");
        JButton buttonFour = new JButton("4");
        JButton buttonFive = new JButton("5");
        JButton buttonSix = new JButton("6");
        JButton buttonSeven = new JButton("7");
        JButton buttonEight = new JButton("8");
        JButton buttonNine = new JButton("9");
        JButton buttonDot = new JButton(".");
        JButton buttonClear = new JButton("C");
        JButton buttonDelete = new JButton("DEL");
        JButton buttonEqual = new JButton("=");
        JButton buttonMul = new JButton("x");
        JButton buttonDiv = new JButton("/");
        JButton buttonPlus = new JButton("+");
        JButton buttonMinus = new JButton("-");
        JButton buttonSquare = new JButton("x\u00B2");
        JButton buttonReciprocal = new JButton("1/x");
        JButton buttonSqrt = new JButton("\u221A");
        Calculator() {
            prepareGUI();
            addComponents();
        }
         void prepareGUI() {
            frame = new JFrame();
            frame.setTitle("Calculator");
            frame.setSize(300, 490);
            frame.getContentPane().setLayout(null);
            frame.getContentPane().setBackground(Color.black);
            frame.setResizable(false);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
         void addComponents() {
            //Setting property of Label
            label.setBounds(250, 0, 50, 50);
            label.setForeground(Color.white);
            frame.add(label);
            textField.setBounds(10, 40, 270, 40);
            textField.setFont(new Font("Arial", Font.BOLD, 20));
            textField.setEditable(false);
            textField.setHorizontalAlignment(SwingConstants.RIGHT);
            frame.add(textField);

            onRadioButton.setBounds(10, 95, 60, 40);
            onRadioButton.setSelected(true);
            onRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
            onRadioButton.setBackground(Color.black);
            onRadioButton.setForeground(Color.white);
            frame.add(onRadioButton);

            offRadioButton.setBounds(10, 120, 60, 40);
            offRadioButton.setSelected(false);
            offRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
            offRadioButton.setBackground(Color.black);
            offRadioButton.setForeground(Color.white);
            frame.add(offRadioButton);

            ButtonGroup buttonGroup = new ButtonGroup();
            buttonGroup.add(onRadioButton);
            buttonGroup.add(offRadioButton);
            buttonSeven.setBounds(10, 230, 60, 40);
            buttonSeven.setFont(new Font("Arial", Font.BOLD, 20));
            frame.add(buttonSeven);

            buttonEight.setBounds(80, 230, 60, 40);
            buttonEight.setFont(new Font("Arial", Font.BOLD, 20));
            frame.add(buttonEight);

            buttonNine.setBounds(150, 230, 60, 40);
            buttonNine.setFont(new Font("Arial", Font.BOLD, 20));
            frame.add(buttonNine);

            buttonFour.setBounds(10, 290, 60, 40);
            buttonFour.setFont(new Font("Arial", Font.BOLD, 20));
            frame.add(buttonFour);

            buttonFive.setBounds(80, 290, 60, 40);
            buttonFive.setFont(new Font("Arial", Font.BOLD, 20));
            frame.add(buttonFive);

            buttonSix.setBounds(150, 290, 60, 40);
            buttonSix.setFont(new Font("Arial", Font.BOLD, 20));
            frame.add(buttonSix);

            buttonOne.setBounds(10, 350, 60, 40);
            buttonOne.setFont(new Font("Arial", Font.BOLD, 20));
            frame.add(buttonOne);

            buttonTwo.setBounds(80, 350, 60, 40);
            buttonTwo.setFont(new Font("Arial", Font.BOLD, 20));
            frame.add(buttonTwo);

            buttonThree.setBounds(150, 350, 60, 40);
            buttonThree.setFont(new Font("Arial", Font.BOLD, 20));
            frame.add(buttonThree);

            buttonDot.setBounds(150, 410, 60, 40);
            buttonDot.setFont(new Font("Arial", Font.BOLD, 20));
            frame.add(buttonDot);

            buttonZero.setBounds(10, 410, 130, 40);
            buttonZero.setFont(new Font("Arial", Font.BOLD, 20));
            frame.add(buttonZero);

            buttonEqual.setBounds(220, 350, 60, 100);
            buttonEqual.setFont(new Font("Arial", Font.BOLD, 20));
            buttonEqual.setBackground(new Color(239, 188, 2));
            frame.add(buttonEqual);

            buttonDiv.setBounds(220, 110, 60, 40);
            buttonDiv.setFont(new Font("Arial", Font.BOLD, 20));
            buttonDiv.setBackground(new Color(239, 188, 2));
            frame.add(buttonDiv);

            buttonSqrt.setBounds(10, 170, 60, 40);
            buttonSqrt.setFont(new Font("Arial", Font.BOLD, 18));
            frame.add(buttonSqrt);

            buttonMul.setBounds(220, 230, 60, 40);
            buttonMul.setFont(new Font("Arial", Font.BOLD, 20));
            buttonMul.setBackground(new Color(239, 188, 2));
            frame.add(buttonMul);

            buttonMinus.setBounds(220, 170, 60, 40);
            buttonMinus.setFont(new Font("Arial", Font.BOLD, 20));
            buttonMinus.setBackground(new Color(239, 188, 2));
            frame.add(buttonMinus);

            buttonPlus.setBounds(220, 290, 60, 40);
            buttonPlus.setFont(new Font("Arial", Font.BOLD, 20));
            buttonPlus.setBackground(new Color(239, 188, 2));
            frame.add(buttonPlus);

            buttonSquare.setBounds(80, 170, 60, 40);
            buttonSquare.setFont(new Font("Arial", Font.BOLD, 20));
            frame.add(buttonSquare);

            buttonReciprocal.setBounds(150, 170, 60, 40);
            buttonReciprocal.setFont(new Font("Arial", Font.BOLD, 15));
            frame.add(buttonReciprocal);

            buttonDelete.setBounds(150, 110, 60, 40);
            buttonDelete.setFont(new Font("Arial", Font.BOLD, 12));
            buttonDelete.setBackground(Color.red);
            buttonDelete.setForeground(Color.white);
            frame.add(buttonDelete);

            buttonClear.setBounds(80, 110, 60, 40);
            buttonClear.setFont(new Font("Arial", Font.BOLD, 12));
            buttonClear.setBackground(Color.red);
            buttonClear.setForeground(Color.white);
            frame.add(buttonClear);
        }
    }
    class MainClass
    {
        public static void main(String[] args)
        {
            new Calculator();
        }

    }





