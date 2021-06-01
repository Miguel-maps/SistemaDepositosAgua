/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadepositosagua;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

/**
 *
 * @author Miguel
 */
public class ListCellRender extends DefaultListCellRenderer {

    public Component getListCellRendererComponent(
            JList list,
            Object value,
            int index,
            boolean isSelected,
            boolean cellHasFocus) {
        if (value instanceof Deposito) {
            value = ((Deposito) value).getNombre();
        }
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        return this;
    }

}
