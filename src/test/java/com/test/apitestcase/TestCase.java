package com.test.apitestcase;

import org.testng.annotations.Test;

import com.test.api.datadriver.DataExcel;

/**
 * 测试用例 从Excel中获取测试的接口
 * 
 * @author jiapeng
 *
 */
public class TestCase {
  @Test
	public void RunCase() {
		String path = "data/dongmanInterfaceTest.xlsx";
		String tester = "贾鹏";
		DataExcel oe = new DataExcel();
		oe.chooseFile(path, tester);

	}
}
