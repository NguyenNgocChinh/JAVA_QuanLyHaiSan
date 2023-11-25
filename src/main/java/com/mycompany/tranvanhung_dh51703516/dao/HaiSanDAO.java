package com.mycompany.tranvanhung_dh51703516.dao;

import com.mycompany.tranvanhung_dh51703516.DBConnectionFactory;
import com.mycompany.tranvanhung_dh51703516.dto.HaiSan;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HaiSanDAO {

    public ArrayList<HaiSan> getListHaiSan() {
        try {
            String sql = "SELECT * FROM haisan";
            Connection connection = DBConnectionFactory.getConnection();
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            ArrayList<HaiSan> dshs = new ArrayList<>();
            while (rs.next()) {
                HaiSan hs = new HaiSan();

                hs.setMa(rs.getInt(1));
                hs.setTen(rs.getString(2));
                hs.setXuatxu(rs.getString(3));
                hs.setDonvitinh(rs.getString(4));
                hs.setTuoisong(rs.getInt(5));
                hs.setMaloai(rs.getInt(6));

                dshs.add(hs);
            }
            return dshs;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public HaiSan getHaiSan(int ma) {
        try {
            String sql = "SELECT * FROM haisan WHERE ma=?";
            Connection connection = DBConnectionFactory.getConnection();
            PreparedStatement pre = connection.prepareStatement(sql);
            pre.setInt(1, ma);
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                HaiSan hs = new HaiSan();

                hs.setMa(rs.getInt(1));
                hs.setTen(rs.getString(2));
                hs.setXuatxu(rs.getString(3));
                hs.setDonvitinh(rs.getString(4));
                hs.setTuoisong(rs.getInt(5));
                hs.setMaloai(rs.getInt(6));

                return hs;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public boolean themHaiSan(HaiSan sp) {
        try {
            String sql = "INSERT INTO haisan(ten, xuatxu, donvitinh, tuoisong, maloai) "
                    + "VALUES (?, ?, ?, ?, ?)";
            Connection connection = DBConnectionFactory.getConnection();
            PreparedStatement pre = connection.prepareStatement(sql);
            pre.setString(1, sp.getTen());
            pre.setString(2, sp.getXuatxu());
            pre.setString(3, sp.getDonvitinh());
            pre.setInt(4, sp.getTuoisong());
            pre.setInt(5, sp.getMaloai());

            pre.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean xoaHaiSan(int ma) {
        try {
            String sql = "DELETE FROM haisan WHERE ma=" + ma;
            Connection connection = DBConnectionFactory.getConnection();
            PreparedStatement st = connection.prepareStatement(sql);
            st.execute(sql);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean suaHaiSan(HaiSan sp) {
        try {
            String sql = "UPDATE haisan SET "
                    + "ten=?, "
                    + "xuatxu=?, donvitinh=?, "
                    + "tuoisong=?, maloai=? "
                    + "WHERE ma=?";
            Connection connection = DBConnectionFactory.getConnection();
            PreparedStatement pre = connection.prepareStatement(sql);
            pre.setString(1, sp.getTen());
            pre.setString(2, sp.getXuatxu());
            pre.setString(3, sp.getDonvitinh());
            pre.setInt(4, sp.getTuoisong());
            pre.setInt(5, sp.getMaloai());
            pre.setInt(6, sp.getMa());

            pre.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
