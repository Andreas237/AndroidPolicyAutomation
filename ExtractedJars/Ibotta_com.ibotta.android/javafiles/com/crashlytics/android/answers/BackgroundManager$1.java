// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.crashlytics.android.answers:
//			BackgroundManager

class BackgroundManager$1
	implements Runnable
{

	public void run()
	{
		backgroundFutureRef.set(((Object) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field BackgroundManager this$0>
	//    2    4:getfield        #25  <Field AtomicReference BackgroundManager.backgroundFutureRef>
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #31  <Method void AtomicReference.set(Object)>
		BackgroundManager.access$000(BackgroundManager.this);
	//    5   11:aload_0         
	//    6   12:getfield        #17  <Field BackgroundManager this$0>
	//    7   15:invokestatic    #34  <Method void BackgroundManager.access$000(BackgroundManager)>
	//    8   18:return          
	}

	final BackgroundManager this$0;

	BackgroundManager$1()
	{
		this$0 = BackgroundManager.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field BackgroundManager this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
