package com.service;

import com.model.Account;

import java.util.List;

public interface AccountService {
    public List<Account> getAll();
    public Account getOne(String ma);
    public boolean addTaikhoan(Account account);
    public boolean delete_Taikhoan(String maTK);
    public boolean checkUP(String username , String pass);
}

