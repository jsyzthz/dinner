/**
 * 
 */
package me.jtx.openapi.dinner.service;

import java.util.ArrayList;
import java.util.Map;

/**
 * @author huazhong
 *
 */
public interface ISMSService {

    static final String COUNTRY_CHINA_ID = "86";

    boolean sentSingleMessage(String countryId, String phoneNumber, String message);

    boolean sentSingleMessageByTemplate(String countryId, String phoneNumber, int templateId, Map<String,String> params,
        String smsSign);

    boolean sentMulitMessage(String countryId, ArrayList<String> phoneNumbers, String message);

    boolean sentMulitMessageByTemplate(String countryId, ArrayList<String> phoneNumbers, int templateId,
        ArrayList<String> params, String smsSign);

    boolean sentVoiceCode(String countryId, String phoneNumber, String code);
}
