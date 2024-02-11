package com.userapp.service;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;

public class ValisationServiceImpl implements IValidationService {

	@Override
	public boolean validatePassword(String password) throws TooLongException, TooShortException {
		int length = password.length();
		if (length < 6) {
			throw new TooShortException("Password should be more then 6 characters");
		} else if (length > 15) {
			throw new TooLongException("Password should be less then 15 characters");
		} else
			return true;
	}

	@Override
	public boolean validateUsername(String username) throws NameExistsException {
		String[] usernames = { "bala", "geetha", "palani" };
		for (String user : usernames) {
			if (user.equals(username)) {
				throw new NameExistsException("Name already exits");
			}
		}
		return true;
	}
}
