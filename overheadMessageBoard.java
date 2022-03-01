import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.JTextField;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.awt.Font;


public class overheadMessageBoard {
    public static void main(String[] args) throws Exception {

        Font f = Font.createFont(Font.TRUETYPE_FONT, new FileInputStream(new File("@@@@@@@@ PATHNAME to DOTMATRI.TTF @@@@@@@@"))).deriveFont(Font.PLAIN,35);
        DocumentFilter filter = new UppercaseDocumentFilter();

        JTextField[] fields = new JTextField[60];

        for (int i = 0; i < fields.length; i++) {
            fields[i] = new JTextField(1);
            fields[i].setBackground(Color.BLACK);
            fields[i].setForeground(Color.YELLOW);
            fields[i].setFont(f);
            fields[i].setHorizontalAlignment(JTextField.CENTER);
            ((AbstractDocument) fields[i].getDocument()).setDocumentFilter(filter);

        }

        fields[0].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[1].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    fields[20].requestFocusInWindow();
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });
        fields[1].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[2].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[0].requestFocusInWindow();
                    fields[0].setText("");
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    fields[20].requestFocusInWindow();
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });
        fields[2].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[3].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[1].requestFocusInWindow();
                    fields[1].setText("");
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    fields[20].requestFocusInWindow();
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });
        fields[3].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[4].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[2].requestFocusInWindow();
                    fields[2].setText("");
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    fields[20].requestFocusInWindow();
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });
        fields[4].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[5].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[3].requestFocusInWindow();
                    fields[3].setText("");
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    fields[20].requestFocusInWindow();
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });
        fields[5].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[6].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[4].requestFocusInWindow();
                    fields[4].setText("");
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    fields[20].requestFocusInWindow();
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });
        fields[6].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[7].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[5].requestFocusInWindow();
                    fields[5].setText("");
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    fields[20].requestFocusInWindow();
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });
        fields[7].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[8].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[6].requestFocusInWindow();
                    fields[6].setText("");
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    fields[20].requestFocusInWindow();
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });
        fields[8].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[9].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[7].requestFocusInWindow();
                    fields[7].setText("");
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    fields[20].requestFocusInWindow();
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });
        fields[9].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[10].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[8].requestFocusInWindow();
                    fields[8].setText("");
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    fields[20].requestFocusInWindow();
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });
        fields[10].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[11].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[9].requestFocusInWindow();
                    fields[9].setText("");
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    fields[20].requestFocusInWindow();
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });
        fields[11].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[12].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[10].requestFocusInWindow();
                    fields[10].setText("");
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    fields[20].requestFocusInWindow();
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });
        fields[12].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[13].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[11].requestFocusInWindow();
                    fields[11].setText("");
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    fields[20].requestFocusInWindow();
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });
        fields[13].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[14].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[12].requestFocusInWindow();
                    fields[12].setText("");
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    fields[20].requestFocusInWindow();
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });
        fields[14].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[15].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[13].requestFocusInWindow();
                    fields[13].setText("");
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    fields[20].requestFocusInWindow();
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });
        fields[15].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[16].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[14].requestFocusInWindow();
                    fields[14].setText("");
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    fields[20].requestFocusInWindow();
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });
        fields[16].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[17].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[15].requestFocusInWindow();
                    fields[15].setText("");
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    fields[20].requestFocusInWindow();
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });
        fields[17].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[18].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[16].requestFocusInWindow();
                    fields[16].setText("");
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    fields[20].requestFocusInWindow();
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });
        fields[18].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[19].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[17].requestFocusInWindow();
                    fields[17].setText("");
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    fields[20].requestFocusInWindow();
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });
        fields[19].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[20].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[18].requestFocusInWindow();
                    fields[18].setText("");
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    fields[20].requestFocusInWindow();
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });
        fields[20].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[21].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[19].requestFocusInWindow();
                    fields[19].setText("");
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    fields[40].requestFocusInWindow();
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });
        fields[21].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[22].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[20].requestFocusInWindow();
                    fields[20].setText("");
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    fields[40].requestFocusInWindow();
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });
        fields[22].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[23].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[21].requestFocusInWindow();
                    fields[21].setText("");
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    fields[40].requestFocusInWindow();
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });
        fields[23].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[24].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[22].requestFocusInWindow();
                    fields[22].setText("");
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    fields[40].requestFocusInWindow();
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });
        fields[24].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[25].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[23].requestFocusInWindow();
                    fields[23].setText("");
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    fields[40].requestFocusInWindow();
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });
        fields[25].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[26].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[24].requestFocusInWindow();
                    fields[24].setText("");
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    fields[40].requestFocusInWindow();
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });
        fields[26].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[27].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[25].requestFocusInWindow();
                    fields[25].setText("");
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    fields[40].requestFocusInWindow();
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });
        fields[27].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[28].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[26].requestFocusInWindow();
                    fields[26].setText("");
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    fields[40].requestFocusInWindow();
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });
        fields[28].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[29].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[27].requestFocusInWindow();
                    fields[27].setText("");
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    fields[40].requestFocusInWindow();
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });
        fields[29].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[30].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[28].requestFocusInWindow();
                    fields[28].setText("");
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    fields[40].requestFocusInWindow();
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });
        fields[30].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[31].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[29].requestFocusInWindow();
                    fields[29].setText("");
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    fields[40].requestFocusInWindow();
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });
        fields[31].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[32].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[30].requestFocusInWindow();
                    fields[30].setText("");
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    fields[40].requestFocusInWindow();
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });
        fields[32].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[33].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[31].requestFocusInWindow();
                    fields[31].setText("");
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    fields[40].requestFocusInWindow();
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });
        fields[33].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[34].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[32].requestFocusInWindow();
                    fields[32].setText("");
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    fields[40].requestFocusInWindow();
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });
        fields[34].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[35].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[33].requestFocusInWindow();
                    fields[33].setText("");
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    fields[40].requestFocusInWindow();
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });
        fields[35].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[36].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[34].requestFocusInWindow();
                    fields[34].setText("");
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    fields[40].requestFocusInWindow();
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });
        fields[36].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[37].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[35].requestFocusInWindow();
                    fields[35].setText("");
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    fields[40].requestFocusInWindow();
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });

        fields[37].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[38].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[36].requestFocusInWindow();
                    fields[36].setText("");
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    fields[40].requestFocusInWindow();
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });
        fields[38].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[39].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[37].requestFocusInWindow();
                    fields[37].setText("");
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    fields[40].requestFocusInWindow();
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });
        fields[39].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[40].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[38].requestFocusInWindow();
                    fields[38].setText("");
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    fields[40].requestFocusInWindow();
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });
        fields[40].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[41].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[39].requestFocusInWindow();
                    fields[39].setText("");
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });
        fields[41].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[42].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[40].requestFocusInWindow();
                    fields[40].setText("");
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });
        fields[42].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[43].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[41].requestFocusInWindow();
                    fields[41].setText("");
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });
        fields[43].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[44].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[42].requestFocusInWindow();
                    fields[42].setText("");
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });

        fields[44].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[45].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[43].requestFocusInWindow();
                    fields[43].setText("");
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });

        fields[45].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[46].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[44].requestFocusInWindow();
                    fields[44].setText("");
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });

        fields[46].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[47].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[45].requestFocusInWindow();
                    fields[45].setText("");
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });
        fields[47].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[48].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[46].requestFocusInWindow();
                    fields[46].setText("");
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });

        fields[48].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[49].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[47].requestFocusInWindow();
                    fields[47].setText("");
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });

        fields[49].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[50].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[48].requestFocusInWindow();
                    fields[48].setText("");
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });

        fields[50].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[51].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[49].requestFocusInWindow();
                    fields[49].setText("");
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });

        fields[51].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[52].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[50].requestFocusInWindow();
                    fields[50].setText("");
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });
        fields[52].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[53].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[51].requestFocusInWindow();
                    fields[51].setText("");
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });
        fields[53].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[54].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[52].requestFocusInWindow();
                    fields[52].setText("");
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });
        fields[54].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[55].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[53].requestFocusInWindow();
                    fields[53].setText("");
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });
        fields[55].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[56].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[54].requestFocusInWindow();
                    fields[54].setText("");
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });

        fields[56].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[57].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[55].requestFocusInWindow();
                    fields[55].setText("");
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });
        fields[57].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[58].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[56].requestFocusInWindow();
                    fields[56].setText("");
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });
        fields[58].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if(Character.isAlphabetic(ch)|| Character.isDigit(ch) || (e.isShiftDown() && s == KeyEvent.VK_7)
                        || ch == KeyEvent.VK_SLASH || ch == KeyEvent.VK_SPACE
                        || s == KeyEvent.VK_QUOTE || ch == KeyEvent.VK_MINUS){
                    fields[59].requestFocusInWindow();
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[57].requestFocusInWindow();
                    fields[57].setText("");
                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });
        fields[59].addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                int s = e.getKeyCode();
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    fields[58].requestFocusInWindow();
                    fields[59].setText("");

                }
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i].setText("");
                        fields[0].requestFocusInWindow();
                    }
                }
            }
        });

        JFrame frame = new JFrame("Overhead message board");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3,20));
        frame.getContentPane().setBackground(Color.BLACK);

        frame.pack();
        frame.setVisible(true);
        frame.setSize(1250, 175);

        for (int i = 0; i < fields.length; i++) {
            frame.add(fields[i]);
        }
    }
}
class UppercaseDocumentFilter extends DocumentFilter {
    public void insertString(DocumentFilter.FilterBypass fb, int offset, String text, AttributeSet attr) throws BadLocationException {

        //fb.insertString(offset, text.toUpperCase(), attr);
        super.insertString(fb, offset, text.replaceAll("[^0-9A-Z/_ &'-]+", ""), attr);
    }

    public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {

        //fb.replace(offset, length, text.toUpperCase(), attrs);
        super.replace(fb, offset, length, text.replaceAll("[^0-9A-Z/_ &'-]+", ""), attrs);

    }
}
