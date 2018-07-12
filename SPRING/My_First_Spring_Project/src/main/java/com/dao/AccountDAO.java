package com.dao;

import com.model.Account;

import java.util.List;

public interface AccountDAO {
    public List<Account> getAll();
    public Account getOne(String ma);
    public boolean addTaikhoan(Account account);
    public boolean delete_Taikhoan(String maTK);
}
