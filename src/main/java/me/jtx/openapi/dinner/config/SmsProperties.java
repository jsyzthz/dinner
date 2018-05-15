package me.jtx.openapi.dinner.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:config/sms.properties")
@ConfigurationProperties(prefix = "sms", ignoreUnknownFields = false)
public class SmsProperties {

	private TencentSMS tencent = new TencentSMS();

	public TencentSMS getTencent() {
		return tencent;
	}

	public void setTencent(TencentSMS tencent) {
		this.tencent = tencent;
	}

	public static class TencentSMS {

		private int appid;

		private String appkey;

		public int getAppid() {
			return appid;
		}

		public void setAppid(int appid) {
			this.appid = appid;
		}

		public String getAppkey() {
			return appkey;
		}

		public void setAppkey(String appkey) {
			this.appkey = appkey;
		}
	}

}
