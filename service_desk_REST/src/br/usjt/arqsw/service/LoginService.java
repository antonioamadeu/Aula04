package br.usjt.arqsw.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.arqsw.dao.LoginDAO;

/**
 * 
 * @author Lucas Vinicius de Souza Costa 201516438
 *
 */


@Service
public class LoginService {
	private LoginDAO dao;
	
	@Autowired
	public LoginService(LoginDAO dao){
		this.dao = dao;
	}

}


