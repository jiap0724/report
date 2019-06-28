package com.test.apitestcase;

import org.testng.annotations.Test;

import com.test.api.datadriver.DataExcel;

public class LoginCase {
	@Test
	public void RunCase() {
		String path = "data/Login.xlsx";
		String tester = "贾鹏";
		DataExcel oe = new DataExcel();
		oe.chooseFile(path, tester);

	}
}
