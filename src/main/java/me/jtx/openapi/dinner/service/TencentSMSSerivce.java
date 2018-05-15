/**
 * 
 */
package me.jtx.openapi.dinner.service;

import java.io.IOException;
import java.util.ArrayList;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

import com.github.qcloudsms.SmsMultiSender;
import com.github.qcloudsms.SmsMultiSenderResult;
import com.github.qcloudsms.SmsSingleSender;
import com.github.qcloudsms.SmsSingleSenderResult;
import com.github.qcloudsms.SmsVoiceVerifyCodeSender;
import com.github.qcloudsms.SmsVoiceVerifyCodeSenderResult;
import com.github.qcloudsms.httpclient.HTTPException;

import me.jtx.openapi.dinner.config.SmsProperties;

/**
 * @author huazhong
 *
 */
@Service
@EnableConfigurationProperties(SmsProperties.class)
public class TencentSMSSerivce implements ISMSService {

	@Autowired
	SmsProperties smsProperties;

	/*
	 * (non-Javadoc)
	 * 
	 * @see me.jtx.openapi.dinner.service.ISMSService#sentSingleMessage()
	 */
	@Override
	public boolean sentSingleMessage(String countryId, String phoneNumber, String message) {
		try {
			SmsSingleSender ssender = new SmsSingleSender(getAppId(), getAppKey());
			SmsSingleSenderResult result = ssender.send(0, countryId, phoneNumber, message, "", "");
			System.out.print(result);
		} catch (HTTPException e) {
			// HTTP响应码错误
			e.printStackTrace();
		} catch (JSONException e) {
			// json解析错误
			e.printStackTrace();
		} catch (IOException e) {
			// 网络IO错误
			e.printStackTrace();
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * me.jtx.openapi.dinner.service.ISMSService#sentSingleMessageByTemplate()
	 */
	@Override
	public boolean sentSingleMessageByTemplate(String countryId, String phoneNumber, int templateId, String[] params,
			String smsSign) {
		try {
			SmsSingleSender ssender = new SmsSingleSender(getAppId(), getAppKey());
			SmsSingleSenderResult result = ssender.sendWithParam(countryId, phoneNumber, templateId, params, smsSign,
					"", ""); // 签名参数未提供或者为空时，会使用默认签名发送短信
			System.out.print(result);
		} catch (HTTPException e) {
			// HTTP响应码错误
			e.printStackTrace();
		} catch (JSONException e) {
			// json解析错误
			e.printStackTrace();
		} catch (IOException e) {
			// 网络IO错误
			e.printStackTrace();
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see me.jtx.openapi.dinner.service.ISMSService#sentMulitMessage()
	 */
	@Override
	public boolean sentMulitMessage(String countryId, ArrayList<String> phoneNumbers, String message) {
		try {
			SmsMultiSender msender = new SmsMultiSender(getAppId(), getAppKey());
			SmsMultiSenderResult result = msender.send(0, countryId, phoneNumbers, message, "", "");
			System.out.print(result);
		} catch (HTTPException e) {
			// HTTP响应码错误
			e.printStackTrace();
		} catch (JSONException e) {
			// json解析错误
			e.printStackTrace();
		} catch (IOException e) {
			// 网络IO错误
			e.printStackTrace();
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * me.jtx.openapi.dinner.service.ISMSService#sentMulitMessageByTemplate()
	 */
	@Override
	public boolean sentMulitMessageByTemplate(String countryId, ArrayList<String> phoneNumbers, int templateId,
			ArrayList<String> params, String smsSign) {
		try {
			SmsMultiSender msender = new SmsMultiSender(getAppId(), getAppKey());
			SmsMultiSenderResult result = msender.sendWithParam(countryId, phoneNumbers, templateId, params, smsSign,
					"", ""); // 签名参数未提供或者为空时，会使用默认签名发送短信
			System.out.print(result);
		} catch (HTTPException e) {
			// HTTP响应码错误
			e.printStackTrace();
		} catch (JSONException e) {
			// json解析错误
			e.printStackTrace();
		} catch (IOException e) {
			// 网络IO错误
			e.printStackTrace();
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see me.jtx.openapi.dinner.service.ISMSService#sentVoiceCode()
	 */
	@Override
	public boolean sentVoiceCode(String countryId, String phoneNumber, String code) {
		try {
			SmsVoiceVerifyCodeSender vvcsender = new SmsVoiceVerifyCodeSender(getAppId(), getAppKey());
			SmsVoiceVerifyCodeSenderResult result = vvcsender.send(countryId, phoneNumber, code, 2, "");
			System.out.print(result);
		} catch (HTTPException e) {
			// HTTP响应码错误
			e.printStackTrace();
		} catch (JSONException e) {
			// json解析错误
			e.printStackTrace();
		} catch (IOException e) {
			// 网络IO错误
			e.printStackTrace();
		}
		return false;
	}

	private int getAppId() {
		return smsProperties.getTencent().getAppid();
	}

	private String getAppKey() {
		return smsProperties.getTencent().getAppkey();
	}

	class SmsThread extends Thread {

		private final SmsSingleSender sender;
		private final String nationCode;
		private final String phoneNumber;
		private final String msg;

		public SmsThread(SmsSingleSender sender, String nationCode, String phoneNumber, String msg) {
			this.sender = sender;
			this.nationCode = nationCode;
			this.phoneNumber = phoneNumber;
			this.msg = msg;
		}

		@Override
		public void run() {
			try {
				SmsSingleSenderResult result = sender.send(0, nationCode, phoneNumber, msg, "", "");
				System.out.println(result);
			} catch (HTTPException e) {
				// HTTP响应码错误
				e.printStackTrace();
			} catch (JSONException e) {
				// json解析错误
				e.printStackTrace();
			} catch (IOException e) {
				// 网络IO错误
				e.printStackTrace();
			}
		}
	}

}
