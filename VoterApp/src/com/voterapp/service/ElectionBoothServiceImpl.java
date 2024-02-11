package com.voterapp.service;

import com.voterapp.exception.InvalidVoterIDException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NotEligibleException;
import com.voterapp.exception.UnderAgeException;

public class ElectionBoothServiceImpl implements IElectionBoothService {

	@Override
	public boolean checkEligibility(int age, String locality, int vid) throws NotEligibleException {
		
		checkAge(age);
		checkLocality(locality);
		checkVoterId(vid);
		return true;
		
	}
	
	private boolean checkAge(int age)throws UnderAgeException{ 
				 if(age<18) {
					 throw new UnderAgeException("Age shouldn't be less then 18");
				 }else {
					 return true;
				 }
		} 
		private boolean checkLocality(String locality )throws LocalityNotFoundException{ 
		 String[] localities = {"jp nagar", "abc nagar", "whitefield"};
		 for(String locality1: localities) {
			 if(locality.equals(locality1)) 
				 return true;
			 }
		 return false;
		} 
		 
		private boolean checkVoterId(int voterId) throws InvalidVoterIDException { 
				if(voterId<1000 || voterId >9999) {
					throw new InvalidVoterIDException("Voter Id should be greater then 1000 and less then 9999");
				}else
					return true;
		 } 

}
