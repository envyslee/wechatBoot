package com.vcredit.wxapi.third;

import net.sf.json.JSONObject;
import com.vcredit.wxapi.core.common.WxstoreUtils;
import com.vcredit.wxapi.core.exception.WexinReqException;
import com.vcredit.wxapi.third.model.*;
import com.vcredit.wxapi.wxstore.order.model.OrderInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * ??--token??
 * 
 * @author lizr
 * 
 */
public class JwThirdAPI {
	private static Logger logger = LoggerFactory.getLogger(JwThirdAPI.class);
	//??????
	private static String api_create_preauthcode_url = "https://wxapi.weixin.qq.com/cgi-bin/component/api_create_preauthcode?component_access_token=COMPONENT_ACCESS_TOKEN";
	private static String api_component_token_url = "https://wxapi.weixin.qq.com/cgi-bin/component/api_component_token";
	private static String get_access_token_bycode_url = "https://wxapi.weixin.qq.com/sns/oauth2/component/access_token?appid=APPID&code=CODE&grant_type=authorization_code&component_appid=COMPONENT_APPID&component_access_token=COMPONENT_ACCESS_TOKEN";
	private static String api_query_auth_url = "https://wxapi.weixin.qq.com/cgi-bin/component/api_query_auth?component_access_token=xxxx";
	//??????
    public static String send_message_url = "https://wxapi.weixin.qq.com/cgi-bin/message/custom/send?access_token=ACCESS_TOKEN";
    //4???????????????
    private static String api_authorizer_token_url = "https:// wxapi.weixin.qq.com /cgi-bin/component/api_authorizer_token?component_access_token=COMPONENT_ACCESS_TOKEN";
    //5???????????
    private static String api_get_authorizer_info_url = "https://wxapi.weixin.qq.com/cgi-bin/component/api_get_authorizer_info?component_access_token=COMPONENT_ACCESS_TOKEN";
    //6?????????????
    private static String api_get_authorizer_option_url = "https://wxapi.weixin.qq.com/cgi-bin/component/api_get_authorizer_option?component_access_token=COMPONENT_ACCESS_TOKEN";
    //7???????????
    private static String api_set_authorizer_option_url = "https://wxapi.weixin.qq.com/cgi-bin/component/api_set_authorizer_option?component_access_token=COMPONENT_ACCESS_TOKEN";
    /**
	 * 1????????access_token
	 * @param apiComponentToken
	 * @return kY9Y9rfdcr8AEtYZ9gPaRUjIAuJBvXO5ZOnbv2PYFxox__uSUQcqOnaGYN1xc4N1rI7NDCaPm_0ysFYjRVnPwCJHE7v7uF_l1hI6qi6QBsA
	 * @throws WexinReqException
	 */
	public static String getAccessToken(ApiComponentToken apiComponentToken) throws WexinReqException{
		String component_access_token = "";
		String requestUrl = api_component_token_url;
		JSONObject obj = JSONObject.fromObject(apiComponentToken);
		JSONObject result = WxstoreUtils.httpRequest(requestUrl, "POST", obj.toString());
		if (result.has("errcode")) {
			logger.error("???????access_token?errcode=" + result.getString("errcode") + ",errmsg = " + result.getString("errmsg"));
			throw new WexinReqException("???????access_token?errcode=" + result.getString("errcode") + ",errmsg = " + result.getString("errmsg"));
		} else {
			component_access_token = result.getString("component_access_token");
		}
		return component_access_token;
	}
	
	/**
	 * 2???????
	 * @return kY9Y9rfdcr8AEtYZ9gPaRUjIAuJBvXO5ZOnbv2PYFxox__uSUQcqOnaGYN1xc4N1rI7NDCaPm_0ysFYjRVnPwCJHE7v7uF_l1hI6qi6QBsA
	 * @throws WexinReqException
	 */
	public static String getPreAuthCode(String component_appid, String component_access_token) throws WexinReqException{
		String pre_auth_code = "";
		String requestUrl = api_create_preauthcode_url.replace("COMPONENT_ACCESS_TOKEN", component_access_token);
		GetPreAuthCodeParam getPreAuthCodeParam = new GetPreAuthCodeParam();
		getPreAuthCodeParam.setComponent_appid(component_appid);
		JSONObject obj = JSONObject.fromObject(getPreAuthCodeParam);
		JSONObject result = WxstoreUtils.httpRequest(requestUrl, "POST", obj.toString());
		if (result.has("errcode")) {
			logger.error("?????????errcode=" + result.getString("errcode") + ",errmsg = " + result.getString("errmsg"));
			throw new WexinReqException("?????????errcode=" + result.getString("errcode") + ",errmsg = " + result.getString("errmsg"));
		} else {
			pre_auth_code = result.getString("pre_auth_code");
		}
		return pre_auth_code;
	}
	
	/**
	 * 3????????????????
	 * @return kY9Y9rfdcr8AEtYZ9gPaRUjIAuJBvXO5ZOnbv2PYFxox__uSUQcqOnaGYN1xc4N1rI7NDCaPm_0ysFYjRVnPwCJHE7v7uF_l1hI6qi6QBsA
	 * @throws WexinReqException
	 */
	public static JSONObject getApiQueryAuthInfo(String component_appid, String authorization_code, String component_access_token) throws WexinReqException{
		String requestUrl = api_query_auth_url.replace("xxxx", component_access_token);
		Map<String,String> mp = new HashMap<String,String>();
		mp.put("component_appid", component_appid);
		mp.put("authorization_code", authorization_code);
		JSONObject obj = JSONObject.fromObject(mp);
		System.out.println("-------------------3????????????????---requestUrl------------------------"+requestUrl);
		JSONObject result = WxstoreUtils.httpRequest(requestUrl,"POST", obj.toString());
		if (result.has("errcode")) {
			logger.error("???????access_token?errcode=" + result.getString("errcode") + ",errmsg = " + result.getString("errmsg"));
			throw new WexinReqException("???????access_token?errcode=" + result.getString("errcode") + ",errmsg = " + result.getString("errmsg"));
		}
		return result;
	}
	
	
	/**
	 * 4???????????????
	 * @param apiAuthorizerToken
	 * @param component_access_token
	 */
	public static ApiAuthorizerTokenRet apiAuthorizerToken(ApiAuthorizerToken apiAuthorizerToken,String component_access_token) throws WexinReqException{
		String requestUrl = api_authorizer_token_url.replace("COMPONENT_ACCESS_TOKEN", component_access_token);
		JSONObject param = JSONObject.fromObject(apiAuthorizerToken);
		JSONObject result = WxstoreUtils.httpRequest(requestUrl,"POST", param.toString());
		ApiAuthorizerTokenRet apiAuthorizerTokenRet = (ApiAuthorizerTokenRet) JSONObject.toBean(result, ApiAuthorizerTokenRet.class);
		return apiAuthorizerTokenRet;
	}
	/**
	 * 5???????????
	 */
	public static ApiGetAuthorizerRet apiGetAuthorizerInfo(ApiGetAuthorizer apiGetAuthorizer,String component_access_token) throws WexinReqException{
		String requestUrl = api_get_authorizer_info_url.replace("COMPONENT_ACCESS_TOKEN", component_access_token);
		JSONObject param = JSONObject.fromObject(apiGetAuthorizer);
		JSONObject result = WxstoreUtils.httpRequest(requestUrl,"POST", param.toString());
		ApiGetAuthorizerRet apiGetAuthorizerRet = (ApiGetAuthorizerRet) JSONObject.toBean(result, ApiGetAuthorizerRet.class);
		return apiGetAuthorizerRet;
	}
	
	/**
	 * 6?????????????
	 */
	public static AuthorizerOptionRet apiGetAuthorizerOption(AuthorizerOption authorizerOption,String component_access_token) throws WexinReqException{
		String requestUrl = api_get_authorizer_option_url.replace("COMPONENT_ACCESS_TOKEN", component_access_token);
		JSONObject param = JSONObject.fromObject(authorizerOption);
		JSONObject result = WxstoreUtils.httpRequest(requestUrl,"POST", param.toString());
		AuthorizerOptionRet authorizerOptionRet = (AuthorizerOptionRet) JSONObject.toBean(result, AuthorizerOptionRet.class);
		return authorizerOptionRet;
	}
	/**
	 * 7???????????
	 */
	public static AuthorizerSetOptionRet apiSetAuthorizerOption(AuthorizerSetOption authorizerSetOption,String component_access_token) throws WexinReqException{
		String requestUrl = api_set_authorizer_option_url.replace("COMPONENT_ACCESS_TOKEN", component_access_token);
		JSONObject param = JSONObject.fromObject(authorizerSetOption);
		JSONObject result = WxstoreUtils.httpRequest(requestUrl,"POST", param.toString());
		AuthorizerSetOptionRet authorizerSetOptionRet = (AuthorizerSetOptionRet) JSONObject.toBean(result, AuthorizerSetOptionRet.class);
		return authorizerSetOptionRet;
	}
	/**
	 * ?????????????
	 * 8???component_verify_ticket??
	 * 9?????????
	 */
	
	
	
	/**
	 * ???????access_token
	 * @param appid
	 * @param appscret
	 * @return kY9Y9rfdcr8AEtYZ9gPaRUjIAuJBvXO5ZOnbv2PYFxox__uSUQcqOnaGYN1xc4N1rI7NDCaPm_0ysFYjRVnPwCJHE7v7uF_l1hI6qi6QBsA
	 * @throws WexinReqException
	 */
	public static ReOpenAccessToken getAccessTokenByCode(String appid,String code,String grant_type,String component_appid,String component_access_token) throws WexinReqException{
		String requestUrl = get_access_token_bycode_url.replace("COMPONENT_APPID", component_appid).replace("COMPONENT_ACCESS_TOKEN", component_access_token).replace("authorization_code", grant_type).replace("CODE", code).replace("APPID", appid);
		JSONObject result = WxstoreUtils.httpRequest(requestUrl,"GET", null);
		ReOpenAccessToken reOpenAccessToken = (ReOpenAccessToken) JSONObject.toBean(result, OrderInfo.class);
		if (result.has("errcode")) {
			logger.error("???????access_token?errcode=" + result.getString("errcode") + ",errmsg = " + result.getString("errmsg"));
			throw new WexinReqException("???????access_token?errcode=" + result.getString("errcode") + ",errmsg = " + result.getString("errmsg"));
		}
		return reOpenAccessToken;
	}
	
	
	 /**
     * ??????
     * @param obj
     * @param ACCESS_TOKEN
     * @return
     */
    public static String sendMessage(Map<String,Object> obj,String ACCESS_TOKEN){
    	JSONObject json = JSONObject.fromObject(obj);
    	System.out.println("--------??????---------json-----"+json.toString());
    	// ??????access_token
    	String url = send_message_url.replace("ACCESS_TOKEN",ACCESS_TOKEN);
    	JSONObject jsonObject = WxstoreUtils.httpRequest(url, "POST", json.toString());
    	return jsonObject.toString();
    }
    
	
	public static void main(String[] args){
		 
		try {
			//String s = JwThirdAPI.getPreAuthCode("wx5412820bba6f6bd6","unisk");
			
			ApiComponentToken apiComponentToken = new ApiComponentToken();
			//apiComponentToken.setComponent_appid("wx5412820bba6f6bd6");
			apiComponentToken.setComponent_appid("??");
			apiComponentToken.setComponent_appsecret("???");
			apiComponentToken.setComponent_verify_ticket(null);
			String s = JwThirdAPI.getAccessToken(apiComponentToken);
			System.out.println(s);
		} catch (WexinReqException e) {
			e.printStackTrace();
		}
	}
}
