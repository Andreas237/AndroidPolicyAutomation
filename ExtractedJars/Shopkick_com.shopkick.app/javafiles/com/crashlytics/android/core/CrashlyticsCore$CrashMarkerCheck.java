// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.util.concurrent.Callable;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsCore, CrashlyticsFileMarker

private static final class CrashlyticsCore$CrashMarkerCheck
	implements Callable
{

	public Boolean call()
		throws Exception
	{
		if(!crashMarker.isPresent())
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field CrashlyticsFileMarker crashMarker>
	//*   2    4:invokevirtual   #30  <Method boolean CrashlyticsFileMarker.isPresent()>
	//*   3    7:ifne            14
		{
			return Boolean.FALSE;
	//    4   10:getstatic       #36  <Field Boolean Boolean.FALSE>
	//    5   13:areturn         
		} else
		{
			Fabric.getLogger().d("CrashlyticsCore", "Found previous crash marker.");
	//    6   14:invokestatic    #42  <Method Logger Fabric.getLogger()>
	//    7   17:ldc1            #44  <String "CrashlyticsCore">
	//    8   19:ldc1            #46  <String "Found previous crash marker.">
	//    9   21:invokeinterface #52  <Method void Logger.d(String, String)>
			crashMarker.remove();
	//   10   26:aload_0         
	//   11   27:getfield        #19  <Field CrashlyticsFileMarker crashMarker>
	//   12   30:invokevirtual   #55  <Method boolean CrashlyticsFileMarker.remove()>
	//   13   33:pop             
			return Boolean.TRUE;
	//   14   34:getstatic       #58  <Field Boolean Boolean.TRUE>
	//   15   37:areturn         
		}
	}

	public volatile Object call()
		throws Exception
	{
		return ((Object) (call()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #62  <Method Boolean call()>
	//    2    4:areturn         
	}

	private final CrashlyticsFileMarker crashMarker;

	public CrashlyticsCore$CrashMarkerCheck(CrashlyticsFileMarker crashlyticsfilemarker)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		crashMarker = crashlyticsfilemarker;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field CrashlyticsFileMarker crashMarker>
	//    5    9:return          
	}
}
