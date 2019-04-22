// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.content.Intent;

// Referenced classes of package android.support.v4.app:
//			JobIntentService

final class JobIntentService$CompatWorkItem
	implements 
{

	public void complete()
	{
		stopSelf(mStartId);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JobIntentService this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #26  <Field int mStartId>
	//    4    8:invokevirtual   #32  <Method void JobIntentService.stopSelf(int)>
	//    5   11:return          
	}

	public Intent getIntent()
	{
		return mIntent;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Intent mIntent>
	//    2    4:areturn         
	}

	final Intent mIntent;
	final int mStartId;
	final JobIntentService this$0;

	JobIntentService$CompatWorkItem(Intent intent, int i)
	{
		this$0 = JobIntentService.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field JobIntentService this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void Object()>
		mIntent = intent;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field Intent mIntent>
		mStartId = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #26  <Field int mStartId>
	//   11   19:return          
	}
}
