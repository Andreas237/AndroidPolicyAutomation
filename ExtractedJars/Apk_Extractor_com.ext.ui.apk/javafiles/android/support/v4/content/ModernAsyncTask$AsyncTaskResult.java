// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content;


// Referenced classes of package android.support.v4.content:
//			ModernAsyncTask

private static class ModernAsyncTask$AsyncTaskResult
{

	final Object mData[];
	final ModernAsyncTask mTask;

	transient ModernAsyncTask$AsyncTaskResult(ModernAsyncTask modernasynctask, Object aobj[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		mTask = modernasynctask;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field ModernAsyncTask mTask>
		mData = aobj;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field Object[] mData>
	//    8   14:return          
	}
}
