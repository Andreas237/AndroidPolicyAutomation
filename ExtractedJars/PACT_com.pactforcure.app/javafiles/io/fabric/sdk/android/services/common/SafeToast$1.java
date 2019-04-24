// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.common;

import io.fabric.sdk.android.services.concurrency.PriorityRunnable;

// Referenced classes of package io.fabric.sdk.android.services.common:
//			SafeToast

class SafeToast$1 extends PriorityRunnable
{

	public void run()
	{
		SafeToast.access$001(SafeToast.this);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field SafeToast this$0>
	//    2    4:invokestatic    #22  <Method void SafeToast.access$001(SafeToast)>
	//    3    7:return          
	}

	final SafeToast this$0;

	SafeToast$1()
	{
		this$0 = SafeToast.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field SafeToast this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void PriorityRunnable()>
	//    5    9:return          
	}
}
