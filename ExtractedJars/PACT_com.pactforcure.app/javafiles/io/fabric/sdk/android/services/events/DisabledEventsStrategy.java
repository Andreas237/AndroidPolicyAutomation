// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.events;


// Referenced classes of package io.fabric.sdk.android.services.events:
//			EventsStrategy, FilesSender

public class DisabledEventsStrategy
	implements EventsStrategy
{

	public DisabledEventsStrategy()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
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

	public FilesSender getFilesSender()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void recordEvent(Object obj)
	{
	//    0    0:return          
	}

	public boolean rollFileOver()
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
}
