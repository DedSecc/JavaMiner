import javax.swing.*;

public class JavaMiner  extends JFrame{
    public static void main(String[] args) {
        new JavaMiner().setVisible(true);

    }
    public JavaMiner()
    {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java Miners");
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }
}
