// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.common;


// Referenced classes of package io.fabric.sdk.android.services.common:
//			CurrentTimeProvider

public class SystemCurrentTimeProvider
	implements CurrentTimeProvider
{

	public SystemCurrentTimeProvider()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public long getCurrentTimeMillis()
	{
		return System.currentTimeMillis();
	//    0    0:invokestatic    #18  <Method long System.currentTimeMillis()>
	//    1    3:lreturn         
	}
}
