package com.vcredit.wxapi.wxuser;

import com.vcredit.wxapi.core.exception.WexinReqException;
import com.vcredit.wxapi.wxbase.wxtoken.JwTokenAPI;
import com.vcredit.wxapi.wxuser.user.JwUserAPI;

public class Test {

	public static void main(String[] args) {
		try {
			String s = JwTokenAPI.getAccessToken("??","????");
			System.out.println(JwUserAPI.getWxuser(s, "????").getNickname());
		} catch (WexinReqException e) {
			e.printStackTrace();
		}
	}
}
