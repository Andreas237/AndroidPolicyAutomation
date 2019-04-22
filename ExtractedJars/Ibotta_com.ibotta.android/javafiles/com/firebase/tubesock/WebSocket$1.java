// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.tubesock;


// Referenced classes of package com.firebase.tubesock:
//			ThreadInitializer, WebSocket

static final class WebSocket$1
	implements ThreadInitializer
{

	public void setName(Thread thread, String s)
	{
		thread.setName(s);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #20  <Method void Thread.setName(String)>
	//    3    5:return          
	}

	WebSocket$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
