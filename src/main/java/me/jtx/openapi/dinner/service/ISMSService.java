/**
 * 
 */
package me.jtx.openapi.dinner.service;

import java.util.ArrayList;

/**
 * @author huazhong
 *
 */
public interface ISMSService {

	boolean sentSingleMessage(String countryId, String phoneNumber, String message);

	boolean sentSingleMessageByTemplate(String countryId, String phoneNumber, int templateId, String[] params,
			String smsSign);

	boolean sentMulitMessage(String countryId, ArrayList<String> phoneNumbers, String message);

	boolean sentMulitMessageByTemplate(String countryId, ArrayList<String> phoneNumbers, int templateId,
			ArrayList<String> params, String smsSign);

	boolean sentVoiceCode(String countryId, String phoneNumber, String code);
}
