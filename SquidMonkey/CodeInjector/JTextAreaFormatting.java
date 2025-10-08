import javax.swing.*;
import java.awt.*;

public class JTextAreaFormatting {
    public static void main(String[] args) {
        int i =1;
        double squareRoot,cubeRoot;

        JTextArea textArea = new JTextArea(14,30);
        Font font = new Font("monospaced",Font.PLAIN,12);
        textArea.setFont(font);

        textArea.setText(String.format("%-10s%-10s%-10s\n","Number","SquareRoot","Cuberoot"));

        while(i<=100){
            squareRoot = Math.sqrt(i);
            cubeRoot = Math.cbrt(i);

            textArea.append(String.format("%-10d%-10.3f%-10.3f\n",i,squareRoot,cubeRoot));

            if(i%10==0) {
                textArea.setLineWrap(true);
                if (i < 100)
                    textArea.append("\nPlease hit return to continue");
                else
                    textArea.append("\nfinished...hit return to exit");

                JOptionPane.showMessageDialog(null, textArea, "JTextAreaDemo", JOptionPane.INFORMATION_MESSAGE);

                textArea.setText(String.format("%-10s%-10s%-10s\n", "Number", "SquareRoot", "Cuberoot"));
            }
            i++;

        }
        System.exit(0);
        }
    }


