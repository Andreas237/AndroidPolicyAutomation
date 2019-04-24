// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tasks;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.tasks:
//			Tasks

private static final class Tasks$zza
	implements Tasks$zzb
{

	public void await()
		throws InterruptedException
	{
		zzth.await();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field CountDownLatch zzth>
	//    2    4:invokevirtual   #30  <Method void CountDownLatch.await()>
	//    3    7:return          
	}

	public boolean await(long l, TimeUnit timeunit)
		throws InterruptedException
	{
		return zzth.await(l, timeunit);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field CountDownLatch zzth>
	//    2    4:lload_1         
	//    3    5:aload_3         
	//    4    6:invokevirtual   #34  <Method boolean CountDownLatch.await(long, TimeUnit)>
	//    5    9:ireturn         
	}

	public void onFailure(Exception exception)
	{
		zzth.countDown();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field CountDownLatch zzth>
	//    2    4:invokevirtual   #40  <Method void CountDownLatch.countDown()>
	//    3    7:return          
	}

	public void onSuccess(Object obj)
	{
		zzth.countDown();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field CountDownLatch zzth>
	//    2    4:invokevirtual   #40  <Method void CountDownLatch.countDown()>
	//    3    7:return          
	}

	private final CountDownLatch zzth;

	private Tasks$zza()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		zzth = new CountDownLatch(1);
	//    2    4:aload_0         
	//    3    5:new             #17  <Class CountDownLatch>
	//    4    8:dup             
	//    5    9:iconst_1        
	//    6   10:invokespecial   #20  <Method void CountDownLatch(int)>
	//    7   13:putfield        #22  <Field CountDownLatch zzth>
	//    8   16:return          
	}

	Tasks$zza(Tasks._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Tasks$zza()>
	//    2    4:return          
	}
}
