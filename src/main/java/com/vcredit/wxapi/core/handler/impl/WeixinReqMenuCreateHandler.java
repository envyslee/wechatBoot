package com.vcredit.wxapi.core.handler.impl;

import com.google.gson.Gson;
import org.apache.log4j.Logger;
import com.vcredit.framework.annotation.ReqType;
import com.vcredit.wxapi.core.exception.WexinReqException;
import com.vcredit.wxapi.core.handler.WeiXinReqHandler;
import com.vcredit.wxapi.core.req.model.WeixinReqConfig;
import com.vcredit.wxapi.core.req.model.WeixinReqParam;
import com.vcredit.wxapi.core.req.model.menu.MenuCreate;
import com.vcredit.wxapi.core.req.model.menu.WeixinButton;
import com.vcredit.wxapi.core.util.HttpRequestProxy;
import com.vcredit.wxapi.core.util.WeiXinReqUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 菜单创建的处理
 * @author sfli.sir
 *
 */
public class WeixinReqMenuCreateHandler implements WeiXinReqHandler {

	private static Logger logger = Logger.getLogger(WeixinReqMenuCreateHandler.class);
	
	@SuppressWarnings("rawtypes")
	public String doRequest(WeixinReqParam weixinReqParam) throws WexinReqException{
		// TODO Auto-generated method stub
		String strReturnInfo = "";
		if(weixinReqParam.getClass().isAnnotationPresent(ReqType.class)){
			ReqType reqType = weixinReqParam.getClass().getAnnotation(ReqType.class);
			WeixinReqConfig objConfig = WeiXinReqUtil.getWeixinReqConfig(reqType.value());
			if(objConfig != null){
				String reqUrl = objConfig.getUrl();
				MenuCreate mc = (MenuCreate) weixinReqParam;
				Map<String, String> parameters = new HashMap<String, String>();
				parameters.put("access_token", mc.getAccess_token());
				String jsonData = "{"+getMenuButtonJson("button",mc.getButton())+"}";
				logger.info("处理创建菜单"+jsonData);
				strReturnInfo = HttpRequestProxy.doJsonPost(reqUrl, parameters, jsonData);
			}
		}else{
			logger.info("没有找到对应的配置信息");
		}
		return strReturnInfo;
	}

	/**
	 * 单独处理菜单 json信息
	 * @param name
	 * @param b
	 * @return
	 */
	private  String getMenuButtonJson(String name,List<WeixinButton> b){
		StringBuffer json = new StringBuffer();
		json.append("\""+name+"\":[");
		if(b==null || b.size() == 0){
			return json.append("]").toString();
		}
		List<WeixinButton> sub_button = null;
		Gson gson = new Gson();
		String objJson = "";
		for(WeixinButton m : b){
			sub_button = m.getSub_button();
			m.setSub_button(null);
			objJson = gson.toJson(m);
			json.append(objJson);
			if(sub_button != null && sub_button.size() > 0){
				json.setLength(json.length()-1);
				json.append(",");
				objJson = getMenuButtonJson("sub_button",sub_button);
				json.append(objJson);
				json.append("}");
			}
			m.setSub_button(sub_button);
			json.append(",");
		}
		json.setLength(json.length()-1);
		json.append("]");
		return json.toString();
	}
	
}
