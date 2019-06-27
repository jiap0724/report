package com.test.report;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import io.qameta.allure.Feature;
import io.qameta.allure.Stories;
import io.qameta.allure.Story;

/**
 * 这是post接口测试
 * 
 * @author jiapeng
 *
 */
@Feature("接口测试")
@Stories(value = { @Story(value = "post接口") })
public class postApi {
  @Test
	public void demo2() throws ClientProtocolException, IOException {
		// 访问的URL
		String url = "https://apiv2.vcomic.com/wbcomic/account/login_tel?_ver=7.9.0&_type=iphone&_mark=281ED72D-D0C6-477A-9D02-9E2582887F4D&_channel=appstore&_debug_=yes";
		// 创建httpclient
		CloseableHttpClient httpClient = HttpClients.createDefault();
		// 创建表单
		List<NameValuePair> list = new ArrayList<>();
		list.add(new BasicNameValuePair("password", "1bbd886460827015e5d605ed44252251"));
		list.add(new BasicNameValuePair("user_tel", "13330001001"));

		// 创建post请求
		HttpPost post = new HttpPost(url);
		// 添加请求头 cookie
		// post.setHeader("enrandom", "1561623008331");
		// post.setHeader("enresult", "8b845883973a7a6af250019807afbad7");
		// post.addHeader("vreadreferer", "vmh_client");
		// post.addHeader("User-Agent",
		// "WeiboDongman/7.9.0 (com.guoke.weibodongman; build:201906251616; iOS
		// 12.3.1) Alamofire/4.8.2");
		// 发送请求
		CloseableHttpResponse response = httpClient.execute(post);
		// 获取请求
		HttpEntity entity = response.getEntity();
		// 请求转换为字符串
		String result = EntityUtils.toString(entity);
		System.out.println(result);
		// 关闭
		response.close();
		httpClient.close();

	}
}
