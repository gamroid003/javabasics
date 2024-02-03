package com.training.quest3;

public class BasicMobile implements IFeaturePhone {

	@Override
	public void call() {
		System.out.println("call using buttons");
	}

	@Override
	public void messaging() {
		System.out.println("sms messaging service");
	}

}
