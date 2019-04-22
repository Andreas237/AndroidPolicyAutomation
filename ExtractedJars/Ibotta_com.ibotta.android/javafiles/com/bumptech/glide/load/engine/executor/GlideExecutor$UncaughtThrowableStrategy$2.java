// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.executor;

import android.util.Log;

// Referenced classes of package com.bumptech.glide.load.engine.executor:
//			GlideExecutor

class GlideExecutor$UncaughtThrowableStrategy$2
	implements GlideExecutor.UncaughtThrowableStrategy
{

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

	GlideExecutor$UncaughtThrowableStrategy$2()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
