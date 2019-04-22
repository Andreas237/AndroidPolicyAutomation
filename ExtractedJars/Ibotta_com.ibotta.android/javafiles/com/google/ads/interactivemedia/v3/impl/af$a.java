// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.google.ads.interactivemedia.v3.impl:
//			af

protected static class af$a
{

	protected void a(int i)
	{
		a.removeMessages(i);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Handler a>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #22  <Method void Handler.removeMessages(int)>
	//    4    8:return          
	}

	protected boolean a(int i, long l)
	{
		return a.sendEmptyMessageDelayed(i, l);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Handler a>
	//    2    4:iload_1         
	//    3    5:lload_2         
	//    4    6:invokevirtual   #26  <Method boolean Handler.sendEmptyMessageDelayed(int, long)>
	//    5    9:ireturn         
	}

	protected boolean b(int i)
	{
		return a.sendEmptyMessage(i);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Handler a>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #31  <Method boolean Handler.sendEmptyMessage(int)>
	//    4    8:ireturn         
	}

	protected boolean c(int i)
	{
		Handler handler = a;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Handler a>
	//    2    4:astore_2        
		return handler.sendMessageAtFrontOfQueue(Message.obtain(handler, i));
	//    3    5:aload_2         
	//    4    6:aload_2         
	//    5    7:iload_1         
	//    6    8:invokestatic    #38  <Method Message Message.obtain(Handler, int)>
	//    7   11:invokevirtual   #42  <Method boolean Handler.sendMessageAtFrontOfQueue(Message)>
	//    8   14:ireturn         
	}

	private final Handler a;

	public af$a(Handler handler)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		a = handler;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field Handler a>
	//    5    9:return          
	}
}
