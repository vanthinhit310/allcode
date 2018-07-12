package com.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Account {
    private String tenTk;
    private String matKhau;
    private String email;
    private String sdt;

    @Id
    @Column(name = "TEN_TK")
    public String getTenTk() {
        return tenTk;
    }

    public void setTenTk(String tenTk) {
        this.tenTk = tenTk;
    }

    @Basic
    @Column(name = "MAT_KHAU")
    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    @Basic
    @Column(name = "EMAIL")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "SDT")
    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(tenTk, account.tenTk) &&
                Objects.equals(matKhau, account.matKhau) &&
                Objects.equals(email, account.email) &&
                Objects.equals(sdt, account.sdt);
    }

    @Override
    public int hashCode() {

        return Objects.hash(tenTk, matKhau, email, sdt);
    }
}
