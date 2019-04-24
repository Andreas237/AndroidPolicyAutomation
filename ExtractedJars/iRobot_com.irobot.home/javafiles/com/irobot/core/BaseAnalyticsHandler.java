// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


// Referenced classes of package com.irobot.core:
//			AnalyticsEvent

public abstract class BaseAnalyticsHandler
{

	public BaseAnalyticsHandler()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public abstract void addDeviceTokenData(byte abyte0[]);

	public abstract void appendUserProperties(String s);

	public abstract void beginTiming(AnalyticsEvent analyticsevent);

	public abstract void flushMessages();

	public abstract void increment(String s, int i);

	public abstract void removeUserProperties(String s);

	public abstract void setUserProperties(String s);

	public abstract void setUserPropertiesIfUnset(String s);

	public abstract void track(AnalyticsEvent analyticsevent);

	public abstract void trackWithProperties(AnalyticsEvent analyticsevent, String s);
}
