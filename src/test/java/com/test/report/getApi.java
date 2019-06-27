package com.test.report;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

/**
 * 一个简单的get请求接口测试
 * 
 * @author jiapeng
 *
 */
public class getApi {
  @Test
	public void demo1() throws ClientProtocolException, IOException {
		CloseableHttpClient httpClient = HttpClients.createDefault();// 创建httpclient对象
		HttpGet get = new HttpGet(
				"http://apiv2.vcomic.com/wbcomic/comic/comic_show?_ver=7.8.6&_type=iphone&_mark=281ED72D-D0C6-477A-9D02-9E2582887F4D&_channel=appstore&comic_id=68491&_debug_=yes");// 创建get请求方式发送请求

		CloseableHttpResponse response = httpClient.execute(get);// 执行请求

		HttpEntity entity = response.getEntity();// 获得响应
		String result = EntityUtils.toString(entity, "utf-8");
		System.out.println(result);
		// 关闭httpclient
		response.close();
		httpClient.close();

  }
}
