package com.vcredit.wxapi.core.handler;

import com.vcredit.wxapi.core.exception.WexinReqException;
import com.vcredit.wxapi.core.req.model.WeixinReqParam;

/**
 * 获取微信接口的信息
 * @author liguo
 *
 */
public interface WeiXinReqHandler {
	
	public String doRequest(WeixinReqParam weixinReqParam) throws WexinReqException;
	
}
