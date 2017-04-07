package com.vcredit.wxapi.core.handler.impl;

import com.google.gson.Gson;
import org.apache.log4j.Logger;
import com.vcredit.framework.annotation.ReqType;
import com.vcredit.wxapi.core.exception.WexinReqException;
import com.vcredit.wxapi.core.handler.WeiXinReqHandler;
import com.vcredit.wxapi.core.req.model.WeixinReqConfig;
import com.vcredit.wxapi.core.req.model.WeixinReqParam;
import com.vcredit.wxapi.core.req.model.message.IndustryTemplateMessageSend;
import com.vcredit.wxapi.core.req.model.message.TemplateMessage;
import com.vcredit.wxapi.core.util.HttpRequestProxy;
import com.vcredit.wxapi.core.util.WeiXinReqUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * 模板消息发送
 * @author sfli.sir
 *
 */
public class WeixinReqTemplateMessageHandler implements WeiXinReqHandler {

	private static Logger logger = Logger.getLogger(WeixinReqTemplateMessageHandler.class);
	
	@SuppressWarnings("rawtypes")
	public String doRequest(WeixinReqParam weixinReqParam) throws WexinReqException{
		String strReturnInfo = "";
		if(weixinReqParam.getClass().isAnnotationPresent(ReqType.class)){
			ReqType reqType = weixinReqParam.getClass().getAnnotation(ReqType.class);
			WeixinReqConfig objConfig = WeiXinReqUtil.getWeixinReqConfig(reqType.value());
			if(objConfig != null){
				String reqUrl = objConfig.getUrl();
				IndustryTemplateMessageSend mc = (IndustryTemplateMessageSend) weixinReqParam;
				Map<String, String> parameters = new HashMap<String, String>();
				parameters.put("access_token", mc.getAccess_token());
				String jsonData = getMsgJson(mc) ;
				logger.info("处理模板消息"+jsonData);
				strReturnInfo = HttpRequestProxy.doJsonPost(reqUrl, parameters, jsonData);
			}
		}else{
			logger.info("没有找到对应的配置信息");
		}
		return strReturnInfo;
	}

	/**
	 * 单独处理 json信息
	 * @return
	 */
	private  String getMsgJson(IndustryTemplateMessageSend mc){
		StringBuffer json = new StringBuffer();
		Gson gson = new Gson();
		TemplateMessage tm = mc.getData();
		mc.setData(null);
		String objJson = gson.toJson(mc);
		mc.setData(tm);
		json.append(objJson);
		json.setLength(json.length()-1);
		json.append(",");
		json.append("\"data\":{");
		
		objJson = gson.toJson(tm.getFirst());
		json.append(" \"first\":");
		json.append(objJson);
		json.append(",");
		objJson = gson.toJson(tm.getKeynote1());
		json.append(" \"keynote1\":");
		json.append(objJson);
		json.append(",");
		objJson = gson.toJson(tm.getKeynote2());
		json.append(" \"keynote2\":");
		json.append(objJson);
		json.append(",");
		objJson = gson.toJson(tm.getKeynote3());
		json.append(" \"keynote3\":");
		json.append(objJson);
		json.append(",");
		objJson = gson.toJson(tm.getRemark());
		json.append(" \"remark\":");
		json.append(objJson);
		json.append("}}");
		return json.toString();
	}
	
}
