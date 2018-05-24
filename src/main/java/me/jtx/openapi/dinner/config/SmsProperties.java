package me.jtx.openapi.dinner.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:config/sms.properties")
@ConfigurationProperties(prefix = "sms", ignoreUnknownFields = false)
public class SmsProperties {

	private TencentSMS tencent = new TencentSMS();

	private YunPianSMS yunpian=new YunPianSMS();
	
	public TencentSMS getTencent() {
		return tencent;
	}

	public void setTencent(TencentSMS tencent) {
		this.tencent = tencent;
	}

    public YunPianSMS getYunpian() {
        return yunpian;
    }

    public void setYunpian(YunPianSMS yunpian) {
        this.yunpian = yunpian;
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
	
	public static class YunPianSMS {

        private String appkey;

        public String getAppkey() {
            return appkey;
        }

        public void setAppkey(String appkey) {
            this.appkey = appkey;
        }
    }

}
