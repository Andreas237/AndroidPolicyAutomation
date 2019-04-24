// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.irobot.core:
//			AccountUIServiceData, PushNotificationsGetSettingsFailedStatus, FeatureType, PushNotificationType

private static final class AccountUIServiceData$CppProxy extends AccountUIServiceData
{

	private native void nativeDestroy(long l);

	private native ArrayList native_getAvailableBetaFeatures(long l);

	private native boolean native_getCleanMapReportsAvailable(long l);

	private native String native_getDataSecurityUrl(long l);

	private native ArrayList native_getDataStates(long l);

	private native String native_getEULAConsentDate(long l);

	private native String native_getEULAUrl(long l);

	private native PushNotificationsGetSettingsFailedStatus native_getFailedPushNotificationSettingStatus(long l);

	private native String native_getMappingRobotsUrl(long l);

	private native String native_getPrivacyConsentDate(long l);

	private native String native_getPrivacyPolicyUrl(long l);

	private native String native_getTermsAndConditionsUrl(long l);

	private native String native_getTermsConsentDate(long l);

	private native ArrayList native_getUpdatedPushNotificationSetting(long l);

	private native ArrayList native_getViewStates(long l);

	private native void native_setBetaEnrollmentChanged(long l, boolean flag);

	private native void native_setBetaFeatureStatus(long l, boolean flag);

	private native void native_setBetaFeatureType(long l, FeatureType featuretype);

	private native void native_setCleanMapReportsEnabled(long l, boolean flag);

	private native void native_setCountryCode(long l, String s);

	private native void native_setEmailOptIn(long l, boolean flag);

	private native void native_setLanguageCode(long l, String s);

	private native void native_setPushNotificationSetting(long l, boolean flag);

	private native void native_setPushNotificationType(long l, PushNotificationType pushnotificationtype);

	public void destroy()
	{
		if(!destroyed.getAndSet(true))
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field AtomicBoolean destroyed>
	//*   2    4:iconst_1        
	//*   3    5:invokevirtual   #72  <Method boolean AtomicBoolean.getAndSet(boolean)>
	//*   4    8:ifne            19
			nativeDestroy(nativeRef);
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #35  <Field long nativeRef>
	//    8   16:invokespecial   #74  <Method void nativeDestroy(long)>
	//    9   19:return          
	}

	protected void finalize()
	{
		destroy();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #77  <Method void destroy()>
		((Object)this).finalize();
	//    2    4:aload_0         
	//    3    5:invokespecial   #81  <Method void Object.finalize()>
	//    4    8:return          
	}

	public ArrayList getAvailableBetaFeatures()
	{
		return native_getAvailableBetaFeatures(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #85  <Method ArrayList native_getAvailableBetaFeatures(long)>
	//    4    8:areturn         
	}

	public boolean getCleanMapReportsAvailable()
	{
		return native_getCleanMapReportsAvailable(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #91  <Method boolean native_getCleanMapReportsAvailable(long)>
	//    4    8:ireturn         
	}

	public String getDataSecurityUrl()
	{
		return native_getDataSecurityUrl(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #95  <Method String native_getDataSecurityUrl(long)>
	//    4    8:areturn         
	}

	public ArrayList getDataStates()
	{
		return native_getDataStates(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #98  <Method ArrayList native_getDataStates(long)>
	//    4    8:areturn         
	}

	public String getEULAConsentDate()
	{
		return native_getEULAConsentDate(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #102 <Method String native_getEULAConsentDate(long)>
	//    4    8:areturn         
	}

	public String getEULAUrl()
	{
		return native_getEULAUrl(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #105 <Method String native_getEULAUrl(long)>
	//    4    8:areturn         
	}

	public PushNotificationsGetSettingsFailedStatus getFailedPushNotificationSettingStatus()
	{
		return native_getFailedPushNotificationSettingStatus(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #109 <Method PushNotificationsGetSettingsFailedStatus native_getFailedPushNotificationSettingStatus(long)>
	//    4    8:areturn         
	}

	public String getMappingRobotsUrl()
	{
		return native_getMappingRobotsUrl(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #112 <Method String native_getMappingRobotsUrl(long)>
	//    4    8:areturn         
	}

	public String getPrivacyConsentDate()
	{
		return native_getPrivacyConsentDate(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #115 <Method String native_getPrivacyConsentDate(long)>
	//    4    8:areturn         
	}

	public String getPrivacyPolicyUrl()
	{
		return native_getPrivacyPolicyUrl(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #118 <Method String native_getPrivacyPolicyUrl(long)>
	//    4    8:areturn         
	}

	public String getTermsAndConditionsUrl()
	{
		return native_getTermsAndConditionsUrl(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #121 <Method String native_getTermsAndConditionsUrl(long)>
	//    4    8:areturn         
	}

	public String getTermsConsentDate()
	{
		return native_getTermsConsentDate(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #124 <Method String native_getTermsConsentDate(long)>
	//    4    8:areturn         
	}

	public ArrayList getUpdatedPushNotificationSetting()
	{
		return native_getUpdatedPushNotificationSetting(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #127 <Method ArrayList native_getUpdatedPushNotificationSetting(long)>
	//    4    8:areturn         
	}

	public ArrayList getViewStates()
	{
		return native_getViewStates(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #131 <Method ArrayList native_getViewStates(long)>
	//    4    8:areturn         
	}

	public void setBetaEnrollmentChanged(boolean flag)
	{
		native_setBetaEnrollmentChanged(nativeRef, flag);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:iload_1         
	//    4    6:invokespecial   #135 <Method void native_setBetaEnrollmentChanged(long, boolean)>
	//    5    9:return          
	}

	public void setBetaFeatureStatus(boolean flag)
	{
		native_setBetaFeatureStatus(nativeRef, flag);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:iload_1         
	//    4    6:invokespecial   #138 <Method void native_setBetaFeatureStatus(long, boolean)>
	//    5    9:return          
	}

	public void setBetaFeatureType(FeatureType featuretype)
	{
		native_setBetaFeatureType(nativeRef, featuretype);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #142 <Method void native_setBetaFeatureType(long, FeatureType)>
	//    5    9:return          
	}

	public void setCleanMapReportsEnabled(boolean flag)
	{
		native_setCleanMapReportsEnabled(nativeRef, flag);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:iload_1         
	//    4    6:invokespecial   #145 <Method void native_setCleanMapReportsEnabled(long, boolean)>
	//    5    9:return          
	}

	public void setCountryCode(String s)
	{
		native_setCountryCode(nativeRef, s);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #148 <Method void native_setCountryCode(long, String)>
	//    5    9:return          
	}

	public void setEmailOptIn(boolean flag)
	{
		native_setEmailOptIn(nativeRef, flag);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:iload_1         
	//    4    6:invokespecial   #151 <Method void native_setEmailOptIn(long, boolean)>
	//    5    9:return          
	}

	public void setLanguageCode(String s)
	{
		native_setLanguageCode(nativeRef, s);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #154 <Method void native_setLanguageCode(long, String)>
	//    5    9:return          
	}

	public void setPushNotificationSetting(boolean flag)
	{
		native_setPushNotificationSetting(nativeRef, flag);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:iload_1         
	//    4    6:invokespecial   #157 <Method void native_setPushNotificationSetting(long, boolean)>
	//    5    9:return          
	}

	public void setPushNotificationType(PushNotificationType pushnotificationtype)
	{
		native_setPushNotificationType(nativeRef, pushnotificationtype);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #161 <Method void native_setPushNotificationType(long, PushNotificationType)>
	//    5    9:return          
	}

	static final boolean $assertionsDisabled = false;
	private final AtomicBoolean destroyed = new AtomicBoolean(false);
	private final long nativeRef;

	static 
	{
	//    0    0:return          
	}

	private AccountUIServiceData$CppProxy(long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void AccountUIServiceData()>
	//    2    4:aload_0         
	//    3    5:new             #21  <Class AtomicBoolean>
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:invokespecial   #24  <Method void AtomicBoolean(boolean)>
	//    7   13:putfield        #26  <Field AtomicBoolean destroyed>
		if(l == 0L)
	//*   8   16:lload_1         
	//*   9   17:lconst_0        
	//*  10   18:lcmp            
	//*  11   19:ifne            32
		{
			throw new RuntimeException("nativeRef is zero");
	//   12   22:new             #28  <Class RuntimeException>
	//   13   25:dup             
	//   14   26:ldc1            #30  <String "nativeRef is zero">
	//   15   28:invokespecial   #33  <Method void RuntimeException(String)>
	//   16   31:athrow          
		} else
		{
			nativeRef = l;
	//   17   32:aload_0         
	//   18   33:lload_1         
	//   19   34:putfield        #35  <Field long nativeRef>
			return;
	//   20   37:return          
		}
	}
}
