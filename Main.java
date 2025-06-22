import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            NetworkManagerGUI gui = new NetworkManagerGUI();
            gui.createAndShowGUI();
        });
    }
}