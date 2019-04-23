// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents.internal;

import com.facebook.internal.FetchedAppSettings;

// Referenced classes of package com.facebook.appevents.internal:
//			ActivityLifecycleTracker

static final class ActivityLifecycleTracker$4
	implements com.facebook.appevents.codeless.Listener
{

	public void onShake()
	{
		FetchedAppSettings fetchedappsettings = val$appSettings;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field FetchedAppSettings val$appSettings>
	//    2    4:astore_1        
		if(fetchedappsettings != null && fetchedappsettings.getCodelessEventsEnabled())
	//*   3    5:aload_1         
	//*   4    6:ifnull          23
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #32  <Method boolean FetchedAppSettings.getCodelessEventsEnabled()>
	//*   7   13:ifeq            23
			ActivityLifecycleTracker.checkCodelessSession(val$appId);
	//    8   16:aload_0         
	//    9   17:getfield        #21  <Field String val$appId>
	//   10   20:invokestatic    #36  <Method void ActivityLifecycleTracker.checkCodelessSession(String)>
	//   11   23:return          
	}

	final String val$appId;
	final FetchedAppSettings val$appSettings;

	ActivityLifecycleTracker$4(FetchedAppSettings fetchedappsettings, String s)
	{
		val$appSettings = fetchedappsettings;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field FetchedAppSettings val$appSettings>
		val$appId = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field String val$appId>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
