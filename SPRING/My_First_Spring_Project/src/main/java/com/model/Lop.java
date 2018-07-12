package com.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Lop {
    private String maLop;
    private String tenLop;
    private Collection<SinhVien> sinhViensByMaLop;

    @Id
    @Column(name = "MA_LOP")
    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    @Basic
    @Column(name = "TEN_LOP")
    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lop lop = (Lop) o;
        return Objects.equals(maLop, lop.maLop) &&
                Objects.equals(tenLop, lop.tenLop);
    }

    @Override
    public int hashCode() {

        return Objects.hash(maLop, tenLop);
    }

    @OneToMany(mappedBy = "lopByLop")
    public Collection<SinhVien> getSinhViensByMaLop() {
        return sinhViensByMaLop;
    }

    public void setSinhViensByMaLop(Collection<SinhVien> sinhViensByMaLop) {
        this.sinhViensByMaLop = sinhViensByMaLop;
    }
}
