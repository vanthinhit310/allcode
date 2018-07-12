package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import model.ConnectionDB;
import model.ThongTinDT;

/**
 * @since 4/11 Chá»©a táº¥t cáº£ cÃ¡c phÆ°Æ¡ng thá»©c thao tÃ¡c vá»›i cÆ¡ sá»¡ dá»¯ liá»‡u
 */
public class ProductDAO {
    public static List<ThongTinDT> getAll() {
        List<ThongTinDT> tt = new LinkedList<>();
        // code truy xuất DB
        Connection connection = ConnectionDB.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet re = statement.executeQuery("select * from PRODUCT");
            while (re.next()) {
                tt.add(new ThongTinDT(re.getString(1), re.getString(2), re.getDouble(3), re.getString(4),
                        re.getString(5), re.getString(6), re.getString(7), re.getString(8), re.getString(9),
                        re.getString(10), re.getString(11), re.getString(12), re.getString(13), re.getString(14),
                        re.getDouble(15), re.getDouble(16)));
            }
        } catch (SQLException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
            return null;
        }

        // code truy xuất DB
        return tt;
    }

    public static ThongTinDT getOne(String id) {
        ThongTinDT dt = null;
        // lấy 1 DT
        Connection connection = ConnectionDB.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet re = statement.executeQuery("select * from PRODUCT where MADT='" + id + "'");
            while (re.next()) {
                dt = new ThongTinDT(re.getString(1), re.getString(2), re.getDouble(3), re.getString(4), re.getString(5),
                        re.getString(6), re.getString(7), re.getString(8), re.getString(9), re.getString(10),
                        re.getString(11), re.getString(12), re.getString(13), re.getString(14), re.getDouble(15),
                        re.getDouble(16));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
            // TODO: handle exception
        }
        // láº¥y ra 1 Ä‘iá»‡n thoáº¡i

        return dt;
    }

    public static boolean remove(String maDT) {
        // thực hiện xóa
        Connection connection = ConnectionDB.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement("delete from PRODUCT where MADT =?");
            statement.setString(1, maDT);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
            // TODO: handle exception
        }
        // thực hiện xóa
        return true;
    }

    public static boolean add(ThongTinDT thongTinDT) {
        // update database
        Connection connection = ConnectionDB.getConnection();
        try {
            PreparedStatement statement = connection
                    .prepareStatement("insert into PRODUCT values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            statement.setString(1, thongTinDT.getMaDT());
            statement.setString(2, thongTinDT.getTenDT());
            statement.setDouble(3, thongTinDT.getGiaSP());
            statement.setString(4, thongTinDT.getManHinh());
            statement.setString(5, thongTinDT.getCnManHinh());
            statement.setString(6, thongTinDT.getHeDH());
            statement.setString(7, thongTinDT.getTocdoCPU());
            statement.setString(8, thongTinDT.getCameraTruoc());
            statement.setString(9, thongTinDT.getSelfie());
            statement.setString(10, thongTinDT.getDlPin());
            statement.setString(11, thongTinDT.getSim());
            statement.setString(12, thongTinDT.getBnTrong());
            statement.setString(13, thongTinDT.getRam());
            statement.setString(14, thongTinDT.getHinhAnhSP());
            statement.setDouble(15, thongTinDT.getGiaBanDau());
            statement.setDouble(16, thongTinDT.getGiaDaGiam());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
            // TODO: handle exception
        }

        return true;
    }

    public static boolean update(ThongTinDT thongTinDT) {
        // thao tÃ¡c thÃªm vÃ o database
        Connection connection = ConnectionDB.getConnection();
        try {
            PreparedStatement statement = connection
                    .prepareStatement("update PRODUCT set giaSP, set cameraTruoc , set dlPin where id =?");
            statement.setDouble(1, thongTinDT.getGiaSP());
            statement.setString(2, thongTinDT.getCameraTruoc());
            statement.setString(3, thongTinDT.getDlPin());
            statement.setString(4, thongTinDT.getMaDT());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
            // TODO: handle exception
        }
        return true;
    }

}
