package com.vcredit.wxapi.core.handler.impl;

import org.apache.log4j.Logger;
import com.vcredit.framework.annotation.ReqType;
import com.vcredit.wxapi.core.exception.WexinReqException;
import com.vcredit.wxapi.core.handler.WeiXinReqHandler;
import com.vcredit.wxapi.core.req.model.UploadMedia;
import com.vcredit.wxapi.core.req.model.WeixinReqConfig;
import com.vcredit.wxapi.core.req.model.WeixinReqParam;
import com.vcredit.wxapi.core.req.model.kfaccount.KfaccountUploadheadimg;
import com.vcredit.wxapi.core.util.HttpRequestProxy;
import com.vcredit.wxapi.core.util.WeiXinReqUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;

public class WeixinReqMediaUploadHandler implements WeiXinReqHandler {

	private static Logger logger = Logger.getLogger(WeixinReqMediaUploadHandler.class);
	
	@SuppressWarnings("rawtypes")
	public String doRequest(WeixinReqParam weixinReqParam) throws WexinReqException {
		// TODO Auto-generated method stub
		String strReturnInfo = "";
		if(weixinReqParam instanceof UploadMedia){
			UploadMedia uploadMedia = (UploadMedia) weixinReqParam;
			ReqType reqType = uploadMedia.getClass().getAnnotation(ReqType.class);
			WeixinReqConfig objConfig = WeiXinReqUtil.getWeixinReqConfig(reqType.value());
			if(objConfig != null){
				String reqUrl = objConfig.getUrl();
				String fileName = uploadMedia.getFilePathName();
				File file = new File(fileName) ;
				InputStream fileIn = null;
				try {
					fileIn = new FileInputStream(file);
					String extName = fileName.substring(fileName.lastIndexOf(".") + 1);//扩展名
					String contentType = WeiXinReqUtil.getFileContentType(extName);
					if(contentType == null){
						logger.error("没有找到对应的文件类型");
					}
					Map parameters = WeiXinReqUtil.getWeixinReqParam(weixinReqParam);
					parameters.remove("filePathName");
					strReturnInfo = HttpRequestProxy.uploadMedia(reqUrl, parameters, "UTF-8", fileIn, file.getName(), contentType);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					throw new WexinReqException(e);
				}
			}
		}else if(weixinReqParam instanceof KfaccountUploadheadimg){
			KfaccountUploadheadimg uploadMedia = (KfaccountUploadheadimg) weixinReqParam;
			ReqType reqType = uploadMedia.getClass().getAnnotation(ReqType.class);
			WeixinReqConfig objConfig = WeiXinReqUtil.getWeixinReqConfig(reqType.value());
			if(objConfig != null){
				String reqUrl = objConfig.getUrl();
				String fileName = uploadMedia.getFilePathName();
				File file = new File(fileName) ;
				InputStream fileIn = null;
				try {
					fileIn = new FileInputStream(file);
					String extName = fileName.substring(fileName.lastIndexOf(".") + 1);//扩展名
					String contentType = WeiXinReqUtil.getFileContentType(extName);
					if(contentType == null || !contentType.equals("image/jpeg")){
						throw new WexinReqException("头像图片文件必须是jpg格式，推荐使用640*640大小的图片以达到最佳效果");
					}
					Map parameters = WeiXinReqUtil.getWeixinReqParam(weixinReqParam);
					parameters.remove("filePathName");
					strReturnInfo = HttpRequestProxy.uploadMedia(reqUrl, parameters, "UTF-8", fileIn, file.getName(), contentType);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					throw new WexinReqException(e);
				}
			}
		}else{
			logger.info("没有找到对应的配置信息");
		}
		return strReturnInfo;
	}

}
