// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.api;

import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

// Referenced classes of package io.radar.sdk.api:
//			LocationWorker

static final class LocationWorker$doWork$1 extends Lambda
	implements Function0
{

	public volatile Object invoke()
	{
		invoke();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #40  <Method void invoke()>
		return ((Object) (Unit.INSTANCE));
	//    2    4:getstatic       #46  <Field Unit Unit.INSTANCE>
	//    3    7:areturn         
	}

	public final void invoke()
	{
		$countDownLatch.countDown();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field CountDownLatch $countDownLatch>
	//    2    4:invokevirtual   #51  <Method void CountDownLatch.countDown()>
	//    3    7:return          
	}

	final CountDownLatch $countDownLatch;

	LocationWorker$doWork$1(CountDownLatch countdownlatch)
	{
		$countDownLatch = countdownlatch;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #32  <Field CountDownLatch $countDownLatch>
		super(0);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:invokespecial   #35  <Method void Lambda(int)>
	//    6   10:return          
	}
}
