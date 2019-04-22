// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.executor;

import android.util.Log;

// Referenced classes of package com.bumptech.glide.load.engine.executor:
//			GlideExecutor

public static interface GlideExecutor$UncaughtThrowableStrategy
{

	public abstract void handle(Throwable throwable);

	public static final GlideExecutor$UncaughtThrowableStrategy DEFAULT = LOG;
	public static final GlideExecutor$UncaughtThrowableStrategy IGNORE = new GlideExecutor.UncaughtThrowableStrategy() {

		public void handle(Throwable throwable)
		{
		//    0    0:return          
		}

	}
;
	public static final GlideExecutor$UncaughtThrowableStrategy LOG = new GlideExecutor.UncaughtThrowableStrategy() {

		public void handle(Throwable throwable)
		{
			if(throwable != null && Log.isLoggable("GlideExecutor", 6))
		//*   0    0:aload_1         
		//*   1    1:ifnull          23
		//*   2    4:ldc1            #18  <String "GlideExecutor">
		//*   3    6:bipush          6
		//*   4    8:invokestatic    #24  <Method boolean Log.isLoggable(String, int)>
		//*   5   11:ifeq            23
				Log.e("GlideExecutor", "Request threw uncaught throwable", throwable);
		//    6   14:ldc1            #18  <String "GlideExecutor">
		//    7   16:ldc1            #26  <String "Request threw uncaught throwable">
		//    8   18:aload_1         
		//    9   19:invokestatic    #30  <Method int Log.e(String, String, Throwable)>
		//   10   22:pop             
		//   11   23:return          
		}

	}
;
	public static final GlideExecutor$UncaughtThrowableStrategy THROW = new GlideExecutor.UncaughtThrowableStrategy() {

		public void handle(Throwable throwable)
		{
			if(throwable == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       5
				return;
		//    2    4:return          
			else
				throw new RuntimeException("Request threw uncaught throwable", throwable);
		//    3    5:new             #18  <Class RuntimeException>
		//    4    8:dup             
		//    5    9:ldc1            #20  <String "Request threw uncaught throwable">
		//    6   11:aload_1         
		//    7   12:invokespecial   #23  <Method void RuntimeException(String, Throwable)>
		//    8   15:athrow          
		}

	}
;

	/* static  */
	/* { */
	//    0    0:new             #9   <Class GlideExecutor$UncaughtThrowableStrategy$1>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void GlideExecutor$UncaughtThrowableStrategy$1()>
	//    3    7:putstatic       #25  <Field GlideExecutor$UncaughtThrowableStrategy IGNORE>
	//    4   10:new             #11  <Class GlideExecutor$UncaughtThrowableStrategy$2>
	//    5   13:dup             
	//    6   14:invokespecial   #26  <Method void GlideExecutor$UncaughtThrowableStrategy$2()>
	//    7   17:putstatic       #28  <Field GlideExecutor$UncaughtThrowableStrategy LOG>
	//    8   20:new             #13  <Class GlideExecutor$UncaughtThrowableStrategy$3>
	//    9   23:dup             
	//   10   24:invokespecial   #29  <Method void GlideExecutor$UncaughtThrowableStrategy$3()>
	//   11   27:putstatic       #31  <Field GlideExecutor$UncaughtThrowableStrategy THROW>
	//   12   30:getstatic       #28  <Field GlideExecutor$UncaughtThrowableStrategy LOG>
	//   13   33:putstatic       #33  <Field GlideExecutor$UncaughtThrowableStrategy DEFAULT>
	//*  14   36:return          
	/* } */
}
