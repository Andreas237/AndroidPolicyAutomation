// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.squareup.leakcanary;


// Referenced classes of package com.squareup.leakcanary:
//			Retryable, RefWatcher, KeyedWeakReference

class RefWatcher$1
	implements Retryable
{

	public ult run()
	{
		return ensureGone(val$reference, val$watchStartNanoTime);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field RefWatcher this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field KeyedWeakReference val$reference>
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field long val$watchStartNanoTime>
	//    6   12:invokevirtual   #35  <Method Retryable$Result RefWatcher.ensureGone(KeyedWeakReference, long)>
	//    7   15:areturn         
	}

	final RefWatcher this$0;
	final KeyedWeakReference val$reference;
	final long val$watchStartNanoTime;

	RefWatcher$1()
	{
		this$0 = final_refwatcher;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field RefWatcher this$0>
		val$reference = keyedweakreference;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field KeyedWeakReference val$reference>
		val$watchStartNanoTime = J.this;
	//    6   10:aload_0         
	//    7   11:lload_3         
	//    8   12:putfield        #25  <Field long val$watchStartNanoTime>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
