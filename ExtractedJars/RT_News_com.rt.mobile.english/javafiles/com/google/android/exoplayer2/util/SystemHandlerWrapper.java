// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.util;

import android.os.*;

// Referenced classes of package com.google.android.exoplayer2.util:
//			HandlerWrapper

final class SystemHandlerWrapper
	implements HandlerWrapper
{

	public SystemHandlerWrapper(Handler handler1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		handler = handler1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field Handler handler>
	//    5    9:return          
	}

	public Looper getLooper()
	{
		return handler.getLooper();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Handler handler>
	//    2    4:invokevirtual   #22  <Method Looper Handler.getLooper()>
	//    3    7:areturn         
	}

	public Message obtainMessage(int i)
	{
		return handler.obtainMessage(i);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Handler handler>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #26  <Method Message Handler.obtainMessage(int)>
	//    4    8:areturn         
	}

	public Message obtainMessage(int i, int j, int k)
	{
		return handler.obtainMessage(i, j, k);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Handler handler>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #29  <Method Message Handler.obtainMessage(int, int, int)>
	//    6   10:areturn         
	}

	public Message obtainMessage(int i, int j, int k, Object obj)
	{
		return handler.obtainMessage(i, j, k, obj);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Handler handler>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #32  <Method Message Handler.obtainMessage(int, int, int, Object)>
	//    7   12:areturn         
	}

	public Message obtainMessage(int i, Object obj)
	{
		return handler.obtainMessage(i, obj);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Handler handler>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #35  <Method Message Handler.obtainMessage(int, Object)>
	//    5    9:areturn         
	}

	public boolean post(Runnable runnable)
	{
		return handler.post(runnable);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Handler handler>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #39  <Method boolean Handler.post(Runnable)>
	//    4    8:ireturn         
	}

	public boolean postDelayed(Runnable runnable, long l)
	{
		return handler.postDelayed(runnable, l);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Handler handler>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:invokevirtual   #43  <Method boolean Handler.postDelayed(Runnable, long)>
	//    5    9:ireturn         
	}

	public void removeCallbacksAndMessages(Object obj)
	{
		handler.removeCallbacksAndMessages(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Handler handler>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #47  <Method void Handler.removeCallbacksAndMessages(Object)>
	//    4    8:return          
	}

	public void removeMessages(int i)
	{
		handler.removeMessages(i);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Handler handler>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #51  <Method void Handler.removeMessages(int)>
	//    4    8:return          
	}

	public boolean sendEmptyMessage(int i)
	{
		return handler.sendEmptyMessage(i);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Handler handler>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #55  <Method boolean Handler.sendEmptyMessage(int)>
	//    4    8:ireturn         
	}

	public boolean sendEmptyMessageAtTime(int i, long l)
	{
		return handler.sendEmptyMessageAtTime(i, l);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Handler handler>
	//    2    4:iload_1         
	//    3    5:lload_2         
	//    4    6:invokevirtual   #59  <Method boolean Handler.sendEmptyMessageAtTime(int, long)>
	//    5    9:ireturn         
	}

	private final Handler handler;
}
