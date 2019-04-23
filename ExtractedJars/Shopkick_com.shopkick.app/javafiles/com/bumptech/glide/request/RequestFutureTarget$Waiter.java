// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request;


// Referenced classes of package com.bumptech.glide.request:
//			RequestFutureTarget

static class RequestFutureTarget$Waiter
{

	void notifyAll(Object obj)
	{
		obj.notifyAll();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #17  <Method void Object.notifyAll()>
	//    2    4:return          
	}

	void waitForTimeout(Object obj, long l)
		throws InterruptedException
	{
		obj.wait(l);
	//    0    0:aload_1         
	//    1    1:lload_2         
	//    2    2:invokevirtual   #25  <Method void Object.wait(long)>
	//    3    5:return          
	}

	RequestFutureTarget$Waiter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
