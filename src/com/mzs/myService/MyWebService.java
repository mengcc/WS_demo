/**
 * All rights Reserved, Designed By mengzs
 * @Author mengzs
 * @Date 2017年9月27日 下午8:17:49
 */
package com.mzs.myService;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * @Author mengzs
 * @Date 2017年9月27日
 */
@WebService
public class MyWebService {

	public String sayHello(String username) {
		String result = username + ",Hello WebService";
		System.out.println(result);
		return result;
	}

	public static void main(String[] args) throws InterruptedException {

		String address = "http://127.0.0.1:5200/myWs";
		// 发布端点 ，和端点的实现类
		Endpoint endpoint = Endpoint.publish(address, new MyWebService());
		System.out.println("访问wsdl地址为:"+address+"?WSDL");
		Thread.sleep(1*100*1000);
		//停止服务
		endpoint.stop();
	}
}
