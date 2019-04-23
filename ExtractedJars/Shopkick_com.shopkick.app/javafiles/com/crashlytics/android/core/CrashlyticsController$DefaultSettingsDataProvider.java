// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import io.fabric.sdk.android.services.settings.Settings;
import io.fabric.sdk.android.services.settings.SettingsData;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsController

private static final class CrashlyticsController$DefaultSettingsDataProvider
	implements ovider
{

	public SettingsData getSettingsData()
	{
		return Settings.getInstance().awaitSettingsData();
	//    0    0:invokestatic    #24  <Method Settings Settings.getInstance()>
	//    1    3:invokevirtual   #27  <Method SettingsData Settings.awaitSettingsData()>
	//    2    6:areturn         
	}

	private CrashlyticsController$DefaultSettingsDataProvider()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	CrashlyticsController$DefaultSettingsDataProvider(CrashlyticsController._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void CrashlyticsController$DefaultSettingsDataProvider()>
	//    2    4:return          
	}
}
