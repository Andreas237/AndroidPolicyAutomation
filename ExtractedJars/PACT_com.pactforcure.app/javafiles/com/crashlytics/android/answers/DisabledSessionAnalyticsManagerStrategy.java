// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import io.fabric.sdk.android.services.settings.AnalyticsSettingsData;
import java.io.IOException;

// Referenced classes of package com.crashlytics.android.answers:
//			SessionAnalyticsManagerStrategy

class DisabledSessionAnalyticsManagerStrategy
	implements SessionAnalyticsManagerStrategy
{

	DisabledSessionAnalyticsManagerStrategy()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public void cancelTimeBasedFileRollOver()
	{
	//    0    0:return          
	}

	public void deleteAllEvents()
	{
	//    0    0:return          
	}

	public void processEvent(SessionEvent.Builder builder)
	{
	//    0    0:return          
	}

	public boolean rollFileOver()
		throws IOException
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void scheduleTimeBasedRollOverIfNeeded()
	{
	//    0    0:return          
	}

	public void sendEvents()
	{
	//    0    0:return          
	}

	public void setAnalyticsSettingsData(AnalyticsSettingsData analyticssettingsdata, String s)
	{
	//    0    0:return          
	}
}
