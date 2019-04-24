// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.concurrency;


// Referenced classes of package io.fabric.sdk.android.services.concurrency:
//			AsyncTask

private static class AsyncTask$AsyncTaskResult
{

	final Object data[];
	final AsyncTask task;

	transient AsyncTask$AsyncTaskResult(AsyncTask asynctask, Object aobj[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		task = asynctask;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field AsyncTask task>
		data = aobj;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field Object[] data>
	//    8   14:return          
	}
}
