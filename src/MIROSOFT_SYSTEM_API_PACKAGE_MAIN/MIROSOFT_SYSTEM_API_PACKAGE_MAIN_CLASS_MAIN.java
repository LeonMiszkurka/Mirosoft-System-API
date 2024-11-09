package MIROSOFT_SYSTEM_API_PACKAGE_MAIN;
import javax.swing.JOptionPane;

public class MIROSOFT_SYSTEM_API_PACKAGE_MAIN_CLASS_MAIN {
    public static void main(String[] args) {

        System.out.println("welcome");

        String input = JOptionPane.showInputDialog("MIROSOFT API");
        if (input != null) {

            JOptionPane.showMessageDialog(null, "STOPING System 32");

            System.out.println("loading... SYSTEM");
            System.out.println("ending program");
            System.out.println("stoping...");


        }

        JOptionPane.showMessageDialog(null, "you entered " + input);
    }
}