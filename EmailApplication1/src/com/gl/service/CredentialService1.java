package com.gl.service;

import com.gl.interfaces.Credentials;

import java.util.Random;

import com.gl.entities.Employee;

public class CredentialService1 implements Credentials {

	@Override
	public String generatePassword() {
		String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String small = "abcdefghijklmnopqrstuvwxyz";
		String special = "!@#$%^&*";
		StringBuffer rtnvalue = new StringBuffer();
		Random random = new Random();
		int rand= random.nextInt(caps.length());
		rtnvalue.append(caps.charAt(rand));
		
		rand = random.nextInt(small.length());
		rtnvalue.append(small.charAt(rand));
		
		rand = random.nextInt(special.length());
		rtnvalue.append(special.charAt(rand));
			for(int index=0; index<6; index++ ) {
				rand= random.nextInt(3);
				
				
				switch (rand) {
				case 0:
					random.nextInt(caps.length());
					rtnvalue.append(caps.charAt(rand));
					break;
				case 1:
					random.nextInt(small.length());
					rtnvalue.append(small.charAt(rand));
					break;
				case 2:
					random.nextInt(special.length());
					rtnvalue.append(special.charAt(rand));
				}	
				
				}
			
			return rtnvalue.toString();
		}
		
	
 @Override
	public String generateEmailAddress(String firstName, String LastName, String Department) {
        String rtnvalue = null;
		rtnvalue = firstName + LastName + "@" + Department + ".greatLearning.com";
		return rtnvalue= null;
	}
	@Override
	public void showCredentials(Employee emp) {
		System.out.println(emp);
		
			}

	@Override
	public void showCredentials(com.gl.interfaces.Employee emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showCredentials(com.gl.interfaces.Employee emp) {
		// TODO Auto-generated method stub
		
	}

}
