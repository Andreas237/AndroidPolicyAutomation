// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import com.crashlytics.android.ndk.CrashlyticsNdk;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsCore

public class CrashlyticsKitBinder
{

	public CrashlyticsKitBinder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public void bindCrashEventDataProvider(CrashlyticsCore crashlyticscore, CrashlyticsNdk crashlyticsndk)
	{
		crashlyticscore.setExternalCrashEventDataProvider(((com.crashlytics.android.core.internal.CrashEventDataProvider) (crashlyticsndk)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #17  <Method void CrashlyticsCore.setExternalCrashEventDataProvider(com.crashlytics.android.core.internal.CrashEventDataProvider)>
	//    3    5:return          
	}
}
