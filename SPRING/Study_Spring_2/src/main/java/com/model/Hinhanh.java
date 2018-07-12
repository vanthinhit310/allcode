package com.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "hinhanh",schema = "public",catalog = "d8ql01thqpd300")
public class Hinhanh {
    private String stt;
    private String picture;

    @Id
    @Column(name = "stt")
    public String getStt() {
        return stt;
    }

    public void setStt(String stt) {
        this.stt = stt;
    }

    @Basic
    @Column(name = "picture")
    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hinhanh hinhanh = (Hinhanh) o;
        return Objects.equals(stt, hinhanh.stt) &&
                Objects.equals(picture, hinhanh.picture);
    }

    @Override
    public int hashCode() {

        return Objects.hash(stt, picture);
    }
}
