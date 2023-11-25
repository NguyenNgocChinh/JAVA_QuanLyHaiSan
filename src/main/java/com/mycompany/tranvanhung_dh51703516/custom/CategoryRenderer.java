/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tranvanhung_dh51703516.custom;

import com.mycompany.tranvanhung_dh51703516.dto.LoaiHaiSan;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

public class CategoryRenderer extends DefaultListCellRenderer {

    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        // Assuming that the CategoryItem has a meaningful toString method
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        if (value instanceof LoaiHaiSan categoryItem) {
            setText(categoryItem.toString());
        }
        return this;
    }
}
