package com.mycompany.tranvanhung_dh51703516.dao;

import com.mycompany.tranvanhung_dh51703516.DBConnectionFactory;
import com.mycompany.tranvanhung_dh51703516.dto.LoaiHaiSan;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoaiHaiSanDAO {

    public ArrayList<LoaiHaiSan> getListLoaiHaiSan() {
        try {
            String sql = "SELECT * FROM loaihaisan";
            Connection connection = DBConnectionFactory.getConnection();
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            ArrayList<LoaiHaiSan> dslhs = new ArrayList<>();
            while (rs.next()) {
                LoaiHaiSan lhs = new LoaiHaiSan();

                lhs.setMa(rs.getInt(1));
                lhs.setTen(rs.getString(2));

                dslhs.add(lhs);
            }
            return dslhs;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static LoaiHaiSan getLoaiHaiSan(int ma) {
        try {
            String sql = "SELECT * FROM loaihaisan WHERE ma=?";
            Connection connection = DBConnectionFactory.getConnection();
            PreparedStatement pre = connection.prepareStatement(sql);
            pre.setInt(1, ma);
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                LoaiHaiSan item = new LoaiHaiSan();

                item.setMa(rs.getInt(1));
                item.setTen(rs.getString(2));
                return item;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
