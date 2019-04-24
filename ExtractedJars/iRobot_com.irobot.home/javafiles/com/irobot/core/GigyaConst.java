// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.irobot.core:
//			AccountFlagType, FeatureType, LegalTermType

public abstract class GigyaConst
{
	private static final class CppProxy extends GigyaConst
	{

		private native void nativeDestroy(long l);

		public void destroy()
		{
			if(!destroyed.getAndSet(true))
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field AtomicBoolean destroyed>
		//*   2    4:iconst_1        
		//*   3    5:invokevirtual   #37  <Method boolean AtomicBoolean.getAndSet(boolean)>
		//*   4    8:ifne            19
				nativeDestroy(nativeRef);
		//    5   11:aload_0         
		//    6   12:aload_0         
		//    7   13:getfield        #30  <Field long nativeRef>
		//    8   16:invokespecial   #39  <Method void nativeDestroy(long)>
		//    9   19:return          
		}

		protected void finalize()
		{
			destroy();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #42  <Method void destroy()>
			((Object)this).finalize();
		//    2    4:aload_0         
		//    3    5:invokespecial   #46  <Method void Object.finalize()>
		//    4    8:return          
		}

		private final AtomicBoolean destroyed = new AtomicBoolean(false);
		private final long nativeRef;

		private CppProxy(long l)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void GigyaConst()>
		//    2    4:aload_0         
		//    3    5:new             #16  <Class AtomicBoolean>
		//    4    8:dup             
		//    5    9:iconst_0        
		//    6   10:invokespecial   #19  <Method void AtomicBoolean(boolean)>
		//    7   13:putfield        #21  <Field AtomicBoolean destroyed>
			if(l == 0L)
		//*   8   16:lload_1         
		//*   9   17:lconst_0        
		//*  10   18:lcmp            
		//*  11   19:ifne            32
			{
				throw new RuntimeException("nativeRef is zero");
		//   12   22:new             #23  <Class RuntimeException>
		//   13   25:dup             
		//   14   26:ldc1            #25  <String "nativeRef is zero">
		//   15   28:invokespecial   #28  <Method void RuntimeException(String)>
		//   16   31:athrow          
			} else
			{
				nativeRef = l;
		//   17   32:aload_0         
		//   18   33:lload_1         
		//   19   34:putfield        #30  <Field long nativeRef>
				return;
		//   20   37:return          
			}
		}
	}


	public GigyaConst()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #126 <Method void Object()>
	//    2    4:return          
	}

	public static native String getKeyForAccountFlagType(AccountFlagType accountflagtype);

	public static native String getKeyForFeatureType(FeatureType featuretype);

	public static native String getKeyForLegalTermType(LegalTermType legaltermtype);

	public static final String ACCOUNT_CONSENT_DATE_KEY = "lastConsentModified";
	public static final String ACCOUNT_CONSENT_DOC_VERSION_KEY = "docVersion";
	public static final String ACCOUNT_CONSENT_GRANTED_KEY = "isConsentGranted";
	public static final String ACCOUNT_COUNTRY_KEY = "country";
	public static final String ACCOUNT_DATA_FIELDS_KEY = "fields";
	public static final String ACCOUNT_DATA_SCHEMA_KEY = "dataSchema";
	public static final String ACCOUNT_EMAIL_KEY = "email";
	public static final String ACCOUNT_EXTRA_PROFILE_FIELDS_KEY = "extraProfileFields";
	public static final String ACCOUNT_E_U_L_A_KEY = "endUserLicenseAgreement";
	public static final String ACCOUNT_FIRST_NAME_KEY = "firstName";
	public static final String ACCOUNT_GET_SCHEMA_KEY = "accounts.getSchema";
	public static final String ACCOUNT_INCLUDE_KEY = "include";
	public static final String ACCOUNT_LAST_NAME_KEY = "lastName";
	public static final String ACCOUNT_LOCALE_KEY = "locale";
	public static final String ACCOUNT_PREFERENCES_KEY = "preferences";
	public static final String ACCOUNT_PRIVACY_POLICY_KEY = "privacyPolicy";
	public static final String ACCOUNT_PROFILE_KEY = "profile";
	public static final String ACCOUNT_REQUEST_KEY = "accounts.getAccountInfo";
	public static final String ACCOUNT_SIGNATURE_KEY = "UIDSignature";
	public static final String ACCOUNT_TERMS_AND_CONDITIONS_KEY = "termsConditions";
	public static final String ACCOUNT_TIMESTAMP_KEY = "signatureTimestamp";
	public static final String ACCOUNT_UID_KEY = "UID";
	public static final String ACCOUNT_UPDATE_KEY = "accounts.setAccountInfo";
	public static final String BETA_OPTIN_TIME_KEY = "BETA_OPTIN";
	public static final String BETA_TIP_DISMISSED_FLAG_KEY = "BETATIPDISMISSED_FLAG";
	public static final String BETA_VIEWED_FLAG_KEY = "BETAVIEWED_FLAG";
	public static final String CHINA_API_DOMAIN = "cn1.gigya-api.cn";
	public static final String CUSTOM_DATA_KEY = "data";
	public static final String DEMO_ROBOT_FEATURE_SWITCH_TIME_KEY = "DEMO_ROBOT_FSW";
	public static final String FEEDBACK_REPORT_FEATURE_SWITCH_TIME_KEY = "APPFEEDBACK_FSW";
	public static final String LOCAL_OTA_FEATURE_SWITCH_TIME_KEY = "LOCAL_OTA_FSW";
	public static final String LOGIN_PLUGIN_KEY = "accounts.ScreenSet";
	public static final String PROMO_OPT_IN_KEY = "oracleOptIn";
	public static final String RESPONSE_OBJECT_KEY = "response";
	public static final String RUSSIA_API_DOMAIN = "ru1.gigya.com";
	public static final String USER_OPT_IN_P_MAPS_LEARNING_FEATURE_SWITCH_KEY = "USER_OPTIN_PMAPS_LEARNING_FSW";
	public static final String USER_REQUEST_KEY = "socialize.getUserInfo";
	public static final String WIFI_MAPS_OPTIN_TIME_KEY = "WIFIMAPS_OPTIN";
}
