package com.service.impl;

import com.dao.AccountDAO;
import com.model.Account;
import com.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountDAO accountDAO;
    @Override
    public List<Account> getAll() {
        return accountDAO.getAll();
    }

    @Override
    public Account getOne(String ma) {
        return accountDAO.getOne(ma);
    }

    @Override
    public boolean addTaikhoan(Account account) {
        return accountDAO.addTaikhoan(account);
    }

    @Override
    public boolean delete_Taikhoan(String maTK) {
        return accountDAO.delete_Taikhoan(maTK);
    }

    @Override
    public boolean checkUP(String username, String pass) {

        List<Account> all = getAll();
        for(Account dsac : all){
            if(dsac.getTenTk().equals(username)&& dsac.getMatKhau().equals(pass)){
                return true;
            }
        }
        return false;
    }
}
