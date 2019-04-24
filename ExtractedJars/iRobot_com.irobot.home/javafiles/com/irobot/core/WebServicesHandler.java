// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


// Referenced classes of package com.irobot.core:
//			WebServiceDataSecurityCallback, WebServiceLegalTermsCallback, WebServiceFirmwareDataCallback, WebServiceFirmwareUpdatesCallback, 
//			WebServiceAppVersionCallback, WebServiceMappingRobotsInfoCallback

public abstract class WebServicesHandler
{

	public WebServicesHandler()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public abstract void requestDataSecurity(String s, String s1, WebServiceDataSecurityCallback webservicedatasecuritycallback);

	public abstract void requestEULA(String s, String s1, WebServiceLegalTermsCallback webservicelegaltermscallback);

	public abstract void requestFirmwareDataFromUrl(String s, WebServiceFirmwareDataCallback webservicefirmwaredatacallback);

	public abstract void requestFirmwareUpdatesForSku(String s, WebServiceFirmwareUpdatesCallback webservicefirmwareupdatescallback);

	public abstract void requestLatestAppVersion(String s, WebServiceAppVersionCallback webserviceappversioncallback);

	public abstract void requestMappingRobotsInfo(String s, String s1, WebServiceMappingRobotsInfoCallback webservicemappingrobotsinfocallback);

	public abstract void requestPrivacyPolicy(String s, String s1, WebServiceLegalTermsCallback webservicelegaltermscallback);

	public abstract void requestTermsAndConditions(String s, String s1, WebServiceLegalTermsCallback webservicelegaltermscallback);
}
