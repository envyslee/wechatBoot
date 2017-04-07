package com.vcredit.wxapi.core.req;

import net.sf.json.JSONObject;
import org.jdom.JDOMException;
import com.vcredit.framework.annotation.ReqType;
import com.vcredit.wxapi.core.exception.WexinReqException;
import com.vcredit.wxapi.core.handler.WeiXinReqHandler;
import com.vcredit.wxapi.core.req.model.DownloadMedia;
import com.vcredit.wxapi.core.req.model.WeixinReqConfig;
import com.vcredit.wxapi.core.req.model.WeixinReqParam;
import com.vcredit.wxapi.core.util.WeiXinConstant;
import com.vcredit.wxapi.core.util.WeiXinReqUtil;

import java.io.IOException;

/**
 * 获取微信接口的信息
 * 
 * @author liguo
 * 
 */
public class WeiXinReqService {

	private static WeiXinReqService weiXinReqUtil = null;


	private WeiXinReqService() {
		//String realPath = WeiXinReqService.class.getClassLoader().getResource("").getFile();
		try {
			WeiXinReqUtil.initReqConfig("/weixin-reqcongfig.xml");
		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	/**
	 * 获取公共的调用处理
	 * @return
	 */
	public static WeiXinReqService getInstance() {
		if (weiXinReqUtil == null) {
			// 同步块，线程安全的创建实例
			synchronized (WeiXinReqService.class) {
				// 再次检查实例是否存在，如果不存在才真正的创建实例
				if (weiXinReqUtil == null) {
					weiXinReqUtil = new WeiXinReqService();
				}
			}
		}
		return weiXinReqUtil;
	}

	/**
	 * 传入请求的参数，获取对应额接口返回信息
	 * @param weixinReqParam
	 * @return
	 * @throws WexinReqException
	 */
	public String doWeinxinReq(WeixinReqParam weixinReqParam)
			throws WexinReqException {
		String strReturnInfo = "";
		if (weixinReqParam.getClass().isAnnotationPresent(ReqType.class)) {
			ReqType reqType = weixinReqParam.getClass().getAnnotation(ReqType.class);
			WeixinReqConfig objConfig = WeiXinReqUtil.getWeixinReqConfig(reqType.value());
			WeiXinReqHandler handler = WeiXinReqUtil.getMappingHander(objConfig.getMappingHandler());
			strReturnInfo = handler.doRequest(weixinReqParam);
		}
		return strReturnInfo;
	}
	
	/**
	 * 返回json对象
	 * @param weixinReqParam
	 * @return
	 * @throws WexinReqException 
	 */
	public JSONObject doWeinxinReqJson(WeixinReqParam weixinReqParam) throws WexinReqException{
		String strResult = this.doWeinxinReq(weixinReqParam);
		JSONObject result = JSONObject.fromObject(strResult);
		Object error = result.get(WeiXinConstant.RETURN_ERROR_INFO_CODE);
		if(error !=null && Integer.parseInt(error.toString())!=0){
			throw new WexinReqException(result.toString());
		}
		return result;
	}

}
