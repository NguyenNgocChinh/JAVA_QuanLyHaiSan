/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tranvanhung_dh51703516.custom;

import com.mycompany.tranvanhung_dh51703516.dao.LoaiHaiSanDAO;
import com.mycompany.tranvanhung_dh51703516.dto.LoaiHaiSan;
import javax.swing.table.DefaultTableCellRenderer;

public class CustomRenderer extends DefaultTableCellRenderer {

    private static final long serialVersionUID = 6703872492730589499L;

    @Override
    protected void setValue(Object value) {
        int maLoai = (int) value;
        LoaiHaiSan lhs = LoaiHaiSanDAO.getLoaiHaiSan(maLoai);
        String tenLoai = lhs.getTen();
        setText(tenLoai);
    }
}
