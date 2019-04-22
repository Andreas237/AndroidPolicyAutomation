// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

// Referenced classes of package androidx.work:
//			WorkerFactory

public final class Configuration
{
	public static final class Builder
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

		public Builder()
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


	Configuration(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		if(builder.mExecutor == null)
	//*   2    4:aload_1         
	//*   3    5:getfield        #24  <Field Executor Configuration$Builder.mExecutor>
	//*   4    8:ifnonnull       22
			mExecutor = createDefaultExecutor();
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:invokespecial   #28  <Method Executor createDefaultExecutor()>
	//    8   16:putfield        #29  <Field Executor mExecutor>
		else
	//*   9   19:goto            30
			mExecutor = builder.mExecutor;
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:getfield        #24  <Field Executor Configuration$Builder.mExecutor>
	//   13   27:putfield        #29  <Field Executor mExecutor>
		if(builder.mWorkerFactory == null)
	//*  14   30:aload_1         
	//*  15   31:getfield        #31  <Field WorkerFactory Configuration$Builder.mWorkerFactory>
	//*  16   34:ifnonnull       47
			mWorkerFactory = WorkerFactory.getDefaultWorkerFactory();
	//   17   37:aload_0         
	//   18   38:invokestatic    #37  <Method WorkerFactory WorkerFactory.getDefaultWorkerFactory()>
	//   19   41:putfield        #38  <Field WorkerFactory mWorkerFactory>
		else
	//*  20   44:goto            55
			mWorkerFactory = builder.mWorkerFactory;
	//   21   47:aload_0         
	//   22   48:aload_1         
	//   23   49:getfield        #31  <Field WorkerFactory Configuration$Builder.mWorkerFactory>
	//   24   52:putfield        #38  <Field WorkerFactory mWorkerFactory>
		mLoggingLevel = builder.mLoggingLevel;
	//   25   55:aload_0         
	//   26   56:aload_1         
	//   27   57:getfield        #40  <Field int Configuration$Builder.mLoggingLevel>
	//   28   60:putfield        #41  <Field int mLoggingLevel>
		mMinJobSchedulerId = builder.mMinJobSchedulerId;
	//   29   63:aload_0         
	//   30   64:aload_1         
	//   31   65:getfield        #43  <Field int Configuration$Builder.mMinJobSchedulerId>
	//   32   68:putfield        #44  <Field int mMinJobSchedulerId>
		mMaxJobSchedulerId = builder.mMaxJobSchedulerId;
	//   33   71:aload_0         
	//   34   72:aload_1         
	//   35   73:getfield        #46  <Field int Configuration$Builder.mMaxJobSchedulerId>
	//   36   76:putfield        #47  <Field int mMaxJobSchedulerId>
		mMaxSchedulerLimit = builder.mMaxSchedulerLimit;
	//   37   79:aload_0         
	//   38   80:aload_1         
	//   39   81:getfield        #49  <Field int Configuration$Builder.mMaxSchedulerLimit>
	//   40   84:putfield        #50  <Field int mMaxSchedulerLimit>
	//   41   87:return          
	}

	private Executor createDefaultExecutor()
	{
		return ((Executor) (Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)))));
	//    0    0:iconst_2        
	//    1    1:invokestatic    #58  <Method Runtime Runtime.getRuntime()>
	//    2    4:invokevirtual   #62  <Method int Runtime.availableProcessors()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:iconst_4        
	//    6   10:invokestatic    #68  <Method int Math.min(int, int)>
	//    7   13:invokestatic    #71  <Method int Math.max(int, int)>
	//    8   16:invokestatic    #77  <Method java.util.concurrent.ExecutorService Executors.newFixedThreadPool(int)>
	//    9   19:areturn         
	}

	public Executor getExecutor()
	{
		return mExecutor;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Executor mExecutor>
	//    2    4:areturn         
	}

	public int getMaxJobSchedulerID()
	{
		return mMaxJobSchedulerId;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int mMaxJobSchedulerId>
	//    2    4:ireturn         
	}

	public int getMaxSchedulerLimit()
	{
		if(android.os.Build.VERSION.SDK_INT == 23)
	//*   0    0:getstatic       #90  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmpne          15
			return mMaxSchedulerLimit / 2;
	//    3    8:aload_0         
	//    4    9:getfield        #50  <Field int mMaxSchedulerLimit>
	//    5   12:iconst_2        
	//    6   13:idiv            
	//    7   14:ireturn         
		else
			return mMaxSchedulerLimit;
	//    8   15:aload_0         
	//    9   16:getfield        #50  <Field int mMaxSchedulerLimit>
	//   10   19:ireturn         
	}

	public int getMinJobSchedulerID()
	{
		return mMinJobSchedulerId;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field int mMinJobSchedulerId>
	//    2    4:ireturn         
	}

	public int getMinimumLoggingLevel()
	{
		return mLoggingLevel;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int mLoggingLevel>
	//    2    4:ireturn         
	}

	public WorkerFactory getWorkerFactory()
	{
		return mWorkerFactory;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field WorkerFactory mWorkerFactory>
	//    2    4:areturn         
	}

	private final Executor mExecutor;
	private final int mLoggingLevel;
	private final int mMaxJobSchedulerId;
	private final int mMaxSchedulerLimit;
	private final int mMinJobSchedulerId;
	private final WorkerFactory mWorkerFactory;
}
