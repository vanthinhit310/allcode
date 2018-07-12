package com.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "sinh_vien", schema = "qlsv", catalog = "")
public class SinhVien {
    private String maSv;
    private String tenSv;
    private String lop;
    private Lop lopByLop;

    @Id
    @Column(name = "MA_SV")
    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    @Basic
    @Column(name = "TEN_SV")
    public String getTenSv() {
        return tenSv;
    }

    public void setTenSv(String tenSv) {
        this.tenSv = tenSv;
    }

    @Basic
    @Column(name = "LOP")
    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SinhVien sinhVien = (SinhVien) o;
        return Objects.equals(maSv, sinhVien.maSv) &&
                Objects.equals(tenSv, sinhVien.tenSv) &&
                Objects.equals(lop, sinhVien.lop);
    }

    @Override
    public int hashCode() {

        return Objects.hash(maSv, tenSv, lop);
    }

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "LOP", referencedColumnName = "MA_LOP", insertable = false, updatable = false), @JoinColumn(name = "LOP", referencedColumnName = "MA_LOP")})
    public Lop getLopByLop() {
        return lopByLop;
    }

    public void setLopByLop(Lop lopByLop) {
        this.lopByLop = lopByLop;
    }
}
