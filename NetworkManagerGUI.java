import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;

public class NetworkManagerGUI {
    private JFrame frame;
    private JTable table;
    private DefaultTableModel model;

    public void createAndShowGUI() {
        frame = new JFrame("LTE Network Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        model = new DefaultTableModel(new Object[]{"Cell ID", "Location", "Frequency", "Bandwidth"}, 0);
        table = new JTable(model);

        JTextField idField = new JTextField(5);
        JTextField locationField = new JTextField(10);
        JTextField freqField = new JTextField(5);
        JTextField bwField = new JTextField(5);

        JButton addButton = new JButton("Add Cell");
        addButton.addActionListener((ActionEvent e) -> {
            String id = idField.getText();
            String location = locationField.getText();
            String freq = freqField.getText();
            String bw = bwField.getText();
            model.addRow(new Object[]{id, location, freq, bw});
            idField.setText(""); locationField.setText(""); freqField.setText(""); bwField.setText("");
        });

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Cell ID:")); inputPanel.add(idField);
        inputPanel.add(new JLabel("Location:")); inputPanel.add(locationField);
        inputPanel.add(new JLabel("Freq (MHz):")); inputPanel.add(freqField);
        inputPanel.add(new JLabel("BW (MHz):")); inputPanel.add(bwField);
        inputPanel.add(addButton);

        frame.add(new JScrollPane(table), BorderLayout.CENTER);
        frame.add(inputPanel, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}