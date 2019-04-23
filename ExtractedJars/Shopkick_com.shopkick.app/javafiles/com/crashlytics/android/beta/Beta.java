// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.beta;

import io.fabric.sdk.android.*;
import io.fabric.sdk.android.services.common.DeviceIdentifierProvider;
import java.util.Collections;
import java.util.Map;

public class Beta extends Kit
	implements DeviceIdentifierProvider
{

	public Beta()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Kit()>
	//    2    4:return          
	}

	public static Beta getInstance()
	{
		return (Beta)Fabric.getKit(com/crashlytics/android/beta/Beta);
	//    0    0:ldc1            #2   <Class Beta>
	//    1    2:invokestatic    #24  <Method Kit Fabric.getKit(Class)>
	//    2    5:checkcast       #2   <Class Beta>
	//    3    8:areturn         
	}

	protected Boolean doInBackground()
	{
		Fabric.getLogger().d("Beta", "Beta kit initializing...");
	//    0    0:invokestatic    #30  <Method Logger Fabric.getLogger()>
	//    1    3:ldc1            #11  <String "Beta">
	//    2    5:ldc1            #32  <String "Beta kit initializing...">
	//    3    7:invokeinterface #38  <Method void Logger.d(String, String)>
		return Boolean.valueOf(true);
	//    4   12:iconst_1        
	//    5   13:invokestatic    #44  <Method Boolean Boolean.valueOf(boolean)>
	//    6   16:areturn         
	}

	protected volatile Object doInBackground()
	{
		return ((Object) (doInBackground()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method Boolean doInBackground()>
	//    2    4:areturn         
	}

	public Map getDeviceIdentifiers()
	{
		return Collections.emptyMap();
	//    0    0:invokestatic    #54  <Method Map Collections.emptyMap()>
	//    1    3:areturn         
	}

	public String getIdentifier()
	{
		return "com.crashlytics.sdk.android:beta";
	//    0    0:ldc1            #60  <String "com.crashlytics.sdk.android:beta">
	//    1    2:areturn         
	}

	public String getVersion()
	{
		return "1.2.10.27";
	//    0    0:ldc1            #63  <String "1.2.10.27">
	//    1    2:areturn         
	}

	public static final String TAG = "Beta";
}
