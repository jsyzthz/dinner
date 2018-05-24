package me.jtx.openapi.dinner.service.impl;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.yunpian.sdk.YunpianClient;
import com.yunpian.sdk.model.Result;
import com.yunpian.sdk.model.SmsSingleSend;

import me.jtx.openapi.dinner.config.SmsProperties;
import me.jtx.openapi.dinner.service.ISMSService;

/**
 * @author huazhong
 * @date 2018/05/24
 */
public class YunPianSMSService implements ISMSService {
    @Autowired
    private SmsProperties smsProperties;

    /* (non-Javadoc)
     * @see me.jtx.openapi.dinner.service.ISMSService#sentSingleMessage(java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    public boolean sentSingleMessage(String countryId, String phoneNumber, String message) {
        YunpianClient yunpianClient = new YunpianClient(getAppKey()).init();
        Map<String, String> param = yunpianClient.newParam(2);
        if (!COUNTRY_CHINA_ID.equals(countryId)) {
            phoneNumber = "+" + COUNTRY_CHINA_ID + phoneNumber;
            try {
                param.put(YunpianClient.MOBILE, java.net.URLEncoder.encode(phoneNumber, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        } else {
            param.put(YunpianClient.MOBILE, phoneNumber);
        }
        param.put(YunpianClient.MOBILE, phoneNumber);
        param.put(YunpianClient.TEXT, message);
        Result<SmsSingleSend> result = yunpianClient.sms().single_send(param);
        return result.isSucc();
    }

    /* (non-Javadoc)
     * @see me.jtx.openapi.dinner.service.ISMSService#sentSingleMessageByTemplate(java.lang.String, java.lang.String, int, java.lang.String[], java.lang.String)
     */
    @Override
    public boolean sentSingleMessageByTemplate(String countryId, String phoneNumber, int templateId,
        Map<String, String> params, String smsSign) {
        YunpianClient yunpianClient = new YunpianClient(getAppKey()).init();
        String message = "";
        Set<String> keys = params.keySet();
        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            String key = it.next();
            String value = params.get(key);
            try {
                message = message + java.net.URLEncoder.encode(key, "UTF-8") + "="
                    + java.net.URLEncoder.encode(value, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            if (it.hasNext()) {
                message = message + "&amp;";
            }
        }
        Map<String, String> param = yunpianClient.newParam(2);
        if (!COUNTRY_CHINA_ID.equals(countryId)) {
            phoneNumber = "+" + COUNTRY_CHINA_ID + phoneNumber;
            try {
                param.put(YunpianClient.MOBILE, java.net.URLEncoder.encode(phoneNumber, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        } else {
            param.put(YunpianClient.MOBILE, phoneNumber);
        }
        param.put(YunpianClient.MOBILE, phoneNumber);
        param.put(YunpianClient.TPL_ID, Integer.toString(templateId));
        param.put(YunpianClient.TPL_VALUE, message);
        Result<SmsSingleSend> result = yunpianClient.sms().single_send(param);
        return result.isSucc();
    }

    /* (non-Javadoc)
     * @see me.jtx.openapi.dinner.service.ISMSService#sentMulitMessage(java.lang.String, java.util.ArrayList, java.lang.String)
     */
    @Override
    public boolean sentMulitMessage(String countryId, ArrayList<String> phoneNumbers, String message) {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see me.jtx.openapi.dinner.service.ISMSService#sentMulitMessageByTemplate(java.lang.String, java.util.ArrayList, int, java.util.ArrayList, java.lang.String)
     */
    @Override
    public boolean sentMulitMessageByTemplate(String countryId, ArrayList<String> phoneNumbers, int templateId,
        ArrayList<String> params, String smsSign) {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see me.jtx.openapi.dinner.service.ISMSService#sentVoiceCode(java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    public boolean sentVoiceCode(String countryId, String phoneNumber, String code) {
        // TODO Auto-generated method stub
        return false;
    }

    private String getAppKey() {
        return smsProperties.getYunpian().getAppkey();
    }

}
