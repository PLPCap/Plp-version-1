package com.cg.plp.dao;

import com.cg.plp.bean.UserLoginBean;

public class QuoteDAOImpl implements IQuoteDAO {

	
	
	@Override
	public boolean checkValidLogin(UserLoginBean userLoginBean) {
		
		System.out.println("  "+userLoginBean.getLoginId()+" "+userLoginBean.getPassword());	
		return false;
	}

}
