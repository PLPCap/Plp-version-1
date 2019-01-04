package com.cg.plp.service;

import com.cg.plp.bean.UserLoginBean;
import com.cg.plp.dao.IQuoteDAO;
import com.cg.plp.dao.QuoteDAOImpl;

public class QuoteServiceImpl implements IQuoteService{

	IQuoteDAO iQuoteDAO=new QuoteDAOImpl();
	
	@Override
	public boolean checkValidLogin(UserLoginBean userLoginBean) {
		iQuoteDAO.checkValidLogin(userLoginBean);
		
		
		//System.out.println("id"+userLoginBean.getLoginId());
		
		return false;
	}

	
	
}
