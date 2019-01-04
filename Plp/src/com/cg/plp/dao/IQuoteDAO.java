package com.cg.plp.dao;

import com.cg.plp.bean.UserLoginBean;

public interface IQuoteDAO {

	public boolean checkValidLogin(UserLoginBean userLoginBean);
	
}
