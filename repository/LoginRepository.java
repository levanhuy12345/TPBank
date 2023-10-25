/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import dataAccess.LoginBankDao;
import java.util.Locale;

/**
 *
 * @author PC
 */
public class LoginRepository implements ILoginRepository {

    @Override
    public void login(Locale language) {
        LoginBankDao.Instance().login(language);
    }  
}