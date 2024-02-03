package com.training.quest3;

public class TouchScreenMobile extends BasicMobile implements ISmartPhone {

	@Override
	public void showApps() {
		System.out.println("Insta,fb,youtube");
	}

	@Override
	public void cameraTypes() {
		System.out.println("Camera Types: selfie, rear camera");
	}

}
