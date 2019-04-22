// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;

import java.util.concurrent.Executor;

// Referenced classes of package androidx.work:
//			Configuration, WorkerFactory

public static final class Configuration$Builder
{

	public Configuration build()
	{
		return new Configuration(this);
	//    0    0:new             #6   <Class Configuration>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #36  <Method void Configuration(Configuration$Builder)>
	//    4    8:areturn         
	}

	Executor mExecutor;
	int mLoggingLevel;
	int mMaxJobSchedulerId;
	int mMaxSchedulerLimit;
	int mMinJobSchedulerId;
	WorkerFactory mWorkerFactory;

	public Configuration$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		mLoggingLevel = 4;
	//    2    4:aload_0         
	//    3    5:iconst_4        
	//    4    6:putfield        #22  <Field int mLoggingLevel>
		mMinJobSchedulerId = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #24  <Field int mMinJobSchedulerId>
		mMaxJobSchedulerId = 0x7fffffff;
	//    8   14:aload_0         
	//    9   15:ldc1            #25  <Int 0x7fffffff>
	//   10   17:putfield        #27  <Field int mMaxJobSchedulerId>
		mMaxSchedulerLimit = 20;
	//   11   20:aload_0         
	//   12   21:bipush          20
	//   13   23:putfield        #29  <Field int mMaxSchedulerLimit>
	//   14   26:return          
	}
}
