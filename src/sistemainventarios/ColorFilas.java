/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemainventarios;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.Color;

public class ColorFilas extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected,
            boolean hasFocus,
            int row,
            int column) {
String valor =  table.getValueAt(row, 8).toString();
 
        if (valor.equals("Activado")) {
            setBackground(Color.GREEN);
            setForeground(Color.BLACK);
        } else {
            setBackground(Color.RED);
            setForeground(Color.BLACK);
        }
 
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }
}
