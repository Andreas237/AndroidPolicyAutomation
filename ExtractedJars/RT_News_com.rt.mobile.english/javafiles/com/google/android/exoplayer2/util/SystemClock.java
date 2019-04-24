// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.util;

import android.os.Handler;
import android.os.Looper;

// Referenced classes of package com.google.android.exoplayer2.util:
//			Clock, SystemHandlerWrapper, HandlerWrapper

final class SystemClock
	implements Clock
{

	SystemClock()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public HandlerWrapper createHandler(Looper looper, android.os.Handler.Callback callback)
	{
		return ((HandlerWrapper) (new SystemHandlerWrapper(new Handler(looper, callback))));
	//    0    0:new             #16  <Class SystemHandlerWrapper>
	//    1    3:dup             
	//    2    4:new             #18  <Class Handler>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #21  <Method void Handler(Looper, android.os.Handler$Callback)>
	//    7   13:invokespecial   #24  <Method void SystemHandlerWrapper(Handler)>
	//    8   16:areturn         
	}

	public long elapsedRealtime()
	{
		return android.os.SystemClock.elapsedRealtime();
	//    0    0:invokestatic    #31  <Method long android.os.SystemClock.elapsedRealtime()>
	//    1    3:lreturn         
	}

	public void sleep(long l)
	{
		android.os.SystemClock.sleep(l);
	//    0    0:lload_1         
	//    1    1:invokestatic    #35  <Method void android.os.SystemClock.sleep(long)>
	//    2    4:return          
	}

	public long uptimeMillis()
	{
		return android.os.SystemClock.uptimeMillis();
	//    0    0:invokestatic    #38  <Method long android.os.SystemClock.uptimeMillis()>
	//    1    3:lreturn         
	}
}
