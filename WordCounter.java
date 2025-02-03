import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class WordCounter extends JFrame {
    private JTextArea textArea;
    private JButton countButton;
    private JLabel resultLabel;

    public WordCounter() {
        setTitle("Word Counter");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        textArea = new JTextArea("Enter your text here...");
        countButton = new JButton("Count Words");
        resultLabel = new JLabel("Word Count: 0");

        countButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textArea.getText().trim();
                if (text.isEmpty()) {
                    resultLabel.setText("Word Count: 0");
                } else {
                    String[] words = text.split("\\s+");
                    resultLabel.setText("Word Count: " + words.length);
                }
            }
        });

        add(new JScrollPane(textArea), BorderLayout.CENTER);
        add(countButton, BorderLayout.SOUTH);
        add(resultLabel, BorderLayout.NORTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new WordCounter();
    }
}
