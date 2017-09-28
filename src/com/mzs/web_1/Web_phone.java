/**
 * All rights Reserved, Designed By mengzs
 * @Author mengzs
 * @Date 2017年9月26日 下午9:10:53
 */
package com.mzs.web_1;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.MobileCodeWS;
import cn.com.webxml.MobileCodeWSSoap;

/**
 * 归属地查询
 * @Author mengzs 
 * @Date 2017年9月26日
 */
public class Web_phone {
	
	public static void main(String[] args) {
		MobileCodeWS mobileCodeWS = new MobileCodeWS();
		MobileCodeWSSoap codeWSSoap = mobileCodeWS.getMobileCodeWSSoap();
		String reString = codeWSSoap.getMobileCodeInfo("13211786302", "");
		ArrayOfString a = codeWSSoap.getDatabaseInfo();
		System.out.println(a.toString());
		System.out.println(reString);
	}
}
