package com;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class DBDAO {
    private static void removeAll() {
        Connection connection = ConnectionDB.getInstace();
        try {
            PreparedStatement ss = connection.prepareStatement("delete from hinhanh");
            ss.executeUpdate();
            System.out.println("Vừa xóa sạch");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public static List<HinhAnh> getAllName(String path) {
        List<HinhAnh> ds = new LinkedList<>();

        File file = new File(path);
        File[] files = file.listFiles();
        for (int i = 0; i < Objects.requireNonNull(files).length; i++) {
            File img = files[i];
            if (img.getName().contains("jpg") || img.getName().contains("png")) {
                ds.add(new HinhAnh(i + "", "https://vljzxlcvlzxvjzkxvnzxzvzx.github.io/" + img.getName()));
            }
        }
        return ds;
    }

    public static void add(HinhAnh hinhAnh) {
        Connection connection = ConnectionDB.getInstace();
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT into hinhanh values (?,?)");
            statement.setString(1, hinhAnh.stt);
            statement.setString(2, hinhAnh.picture);
            statement.executeUpdate();
            System.out.println("Đã thêm: " + hinhAnh.stt);
        } catch (SQLException e) {
            System.out.println("Có lỗi xảy ra ở 1 hình. Nhưng quá trình vấn tiếp tục");
        }
    }

    private static void addAll(String path) {
        removeAll();
        List<HinhAnh> allName = getAllName(path);
        allName.forEach(DBDAO::add);
        System.out.println("Đã thêm tất cả rồi !");
    }

    public static void rename(File file) {
        file.renameTo(new File(file.getParent() + "/" + file.getName().toLowerCase()));
    }

    private static void renameAll(String path) {
        File file = new File(path);
        File[] files = file.listFiles();
        for (int i = 0; i < Objects.requireNonNull(files).length; i++) {
            File img = files[i];
            rename(img);
        }
    }

    public static void main(String[] args) {
        String path = "G:\\Picture\\mpt\\Vung Tau 432018";
        renameAll(path);
        addAll(path);
    }
}
