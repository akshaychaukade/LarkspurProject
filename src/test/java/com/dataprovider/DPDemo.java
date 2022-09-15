package com.dataprovider;

import org.testng.annotations.Test;

public class DPDemo extends StateData {
	@Test(dataProvider = "FirstDp", dataProviderClass = StateData.class)
	public void m1(String statecode, String statename) {
		System.out.println("State code" + statecode + "\t" + statename);
	}
}
