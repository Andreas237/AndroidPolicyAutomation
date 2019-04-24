// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import android.os.Handler;
import android.os.Looper;

// Referenced classes of package com.google.android.exoplayer2.source:
//			ConcatenatingMediaSource

private static final class ConcatenatingMediaSource$EventDispatcher
{

	public void dispatchEvent()
	{
		eventHandler.post(runnable);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Handler eventHandler>
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field Runnable runnable>
	//    4    8:invokevirtual   #40  <Method boolean Handler.post(Runnable)>
	//    5   11:pop             
	//    6   12:return          
	}

	public final Handler eventHandler;
	public final Runnable runnable;

	public ConcatenatingMediaSource$EventDispatcher(Runnable runnable1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		runnable = runnable1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field Runnable runnable>
		if(Looper.myLooper() != null)
	//*   5    9:invokestatic    #24  <Method Looper Looper.myLooper()>
	//*   6   12:ifnull          22
			runnable1 = ((Runnable) (Looper.myLooper()));
	//    7   15:invokestatic    #24  <Method Looper Looper.myLooper()>
	//    8   18:astore_1        
		else
	//*   9   19:goto            26
			runnable1 = ((Runnable) (Looper.getMainLooper()));
	//   10   22:invokestatic    #27  <Method Looper Looper.getMainLooper()>
	//   11   25:astore_1        
		eventHandler = new Handler(((Looper) (runnable1)));
	//   12   26:aload_0         
	//   13   27:new             #29  <Class Handler>
	//   14   30:dup             
	//   15   31:aload_1         
	//   16   32:invokespecial   #32  <Method void Handler(Looper)>
	//   17   35:putfield        #34  <Field Handler eventHandler>
	//   18   38:return          
	}
}
