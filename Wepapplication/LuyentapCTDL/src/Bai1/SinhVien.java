package Bai1;

import java.util.ArrayList;
import java.util.List;

public class SinhVien {
    String name;
    int maSV;
    String lop;
    int age;

    public SinhVien(String name, int maSV, String lop, int age) {
        this.name = name;
        this.maSV = maSV;
        this.lop = lop;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getMaSV() {
        return maSV;
    }

    public String getLop() {
        return lop;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int slSinhVien(List<SinhVien> sinhVien) {
        //size lấy ra số lượng phần tử trong list
        int slSV = sinhVien.size();
        return slSV;
    }

    public static int slSVTren20(List<SinhVien> sinhViens) {
        int sl2 = 0;
        for (SinhVien sv : sinhViens) {
            if (sv.getAge() > 20) {
                sl2 += 1;
            }
        }
        return sl2;
    }

    public static void svNhoHon19(List<SinhVien> sinhViens) {
        for (SinhVien sv : sinhViens) {
            if (sv.getAge() < 19) {
                System.out.println(sv.getName());
            }
        }
    }

    //ds SV co tuoi tren 20
    public static List<SinhVien> dsSVTuoiHon20(List<SinhVien> sinhViens) {
        List<SinhVien> sv20 = new ArrayList<>();
        for (SinhVien sv : sinhViens) {
            if (sv.getAge() > 20) {
                sv20.add(sv);
            }
        }
        return sv20;
    }

    @Override
    public String toString() {
        return getName();
    }

    //gop 2 list thanh mot
    public static List<SinhVien> gopList(List<SinhVien> sinhVien1, List<SinhVien> sinhVien2) {
        sinhVien1.addAll(sinhVien2);
        return sinhVien1;
    }

    // tim phan tu chung giua 2 list
    // ham contains kiem tra xem mot doi tuong co nam trong mot cai list nao do hay khong
    public static List<SinhVien> phanTuChung(List<SinhVien> sinhVien1, List<SinhVien> sinhVien2) {
//        List<SinhVien> rs = new ArrayList<>();
//        for (SinhVien sv1 : sinhVien1) {
//
//            if (sinhVien2.contains(sv1)) {
//                rs.add(sv1);
//            }
//        }
        sinhVien1.retainAll(sinhVien2);
        return sinhVien1;
    }

    // nguoc lai bai tren
    public static List<SinhVien> phanTuKhongChung(List<SinhVien> sinhVien1, List<SinhVien> sinhVien2) {
        List<SinhVien> rs = new ArrayList<>();
        for (SinhVien sv1 : sinhVien1) {
            if (!(sinhVien2.contains(sv1))) {
                rs.add(sv1);
            }
        }
        for (SinhVien sv2 : sinhVien2) {
            if (!(sinhVien1.contains(sv2))) {
                rs.add(sv2);
            }
        }

        return rs;
    }


    //tim sv
    public static SinhVien findSV(List<SinhVien> sinhVien, int maSV) {
        for (SinhVien sv : sinhVien) {
            if (sv.getMaSV() == maSV) {
                return sv;
            }
        }
        return null;
    }

    //xoa SV
    public static List<SinhVien> deleteSV(List<SinhVien> sinhVien, int maSV) {
        for (SinhVien sv : sinhVien) {
            if (sv.getMaSV() == maSV) {
                sinhVien.remove(sv);
            }
        }
        return sinhVien;
    }

    public static void main(String[] args) {
        List<SinhVien> list1 = new ArrayList<>();
        List<SinhVien> list2 = new ArrayList<>();
        List<SinhVien> list3 = new ArrayList<>();
        SinhVien sv1 = new SinhVien("Thinh", 1511, "D151", 20);
        SinhVien sv2 = new SinhVien("Thinh2", 1512, "D152", 18);
        SinhVien sv3 = new SinhVien("Thinh3", 1513, "D153", 19);
        SinhVien sv4 = new SinhVien("Thinh4", 1514, "D154", 21);
        SinhVien sv5 = new SinhVien("Thinh5", 1515, "D155", 22);
        SinhVien sv6 = new SinhVien("Thinh6", 1516, "D156", 23);
        SinhVien sv7 = new SinhVien("Thinh7", 1517, "D157", 21);
        SinhVien sv8 = new SinhVien("Thinh8", 1518, "D158", 20);
        SinhVien sv9 = new SinhVien("Thinh9", 1519, "D159", 18);
        SinhVien sv10 = new SinhVien("Thinh10", 1510, "D150", 22);

        list1.add(sv1);
        list1.add(sv2);
        list1.add(sv3);
        list1.add(sv4);
        list1.add(sv5);

        list2.add(sv6);
        list2.add(sv7);
        list2.add(sv8);
        list2.add(sv9);
        list2.add(sv10);


        list3.add(sv3);
        list3.add(sv4);
        list3.add(sv5);
        list3.add(sv6);
        list3.add(sv7);

        //System.out.println(slSinhVien(list));
        //System.out.println(slSVTren20(list));
        //svNhoHon19(list);
        //System.out.println(dsSVTuoiHon20(list));
        //System.out.println(gopList(list,list2));
        //System.out.println(phanTuChung(list1 , list2));
        System.out.println(phanTuKhongChung(list1,list3));
        //System.out.println(findSV(list2 ,1514));
//        System.out.println(deleteSV(list1 , 1514));

//        List<SinhVien> list4 = (List<SinhVien>) ((ArrayList<SinhVien>) list3).clone();
//        list3.remove(2);
//        System.out.println(list4.size());
//        System.out.println(list3.size());

    }
}
