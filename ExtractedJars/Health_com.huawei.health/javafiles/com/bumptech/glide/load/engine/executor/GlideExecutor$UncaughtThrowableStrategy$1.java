// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.executor;

import android.util.Log;

// Referenced classes of package com.bumptech.glide.load.engine.executor:
//			GlideExecutor

static final class GlideExecutor$UncaughtThrowableStrategy$1 extends GlideExecutor.UncaughtThrowableStrategy
{

	protected void handle(Throwable throwable)
	{
		if(throwable != null && Log.isLoggable("GlideExecutor", 6))
	//*   0    0:aload_1         
	//*   1    1:ifnull          23
	//*   2    4:ldc1            #17  <String "GlideExecutor">
	//*   3    6:bipush          6
	//*   4    8:invokestatic    #23  <Method boolean Log.isLoggable(String, int)>
	//*   5   11:ifeq            23
			Log.e("GlideExecutor", "Request threw uncaught throwable", throwable);
	//    6   14:ldc1            #17  <String "GlideExecutor">
	//    7   16:ldc1            #25  <String "Request threw uncaught throwable">
	//    8   18:aload_1         
	//    9   19:invokestatic    #29  <Method int Log.e(String, String, Throwable)>
	//   10   22:pop             
	//   11   23:return          
	}

	GlideExecutor$UncaughtThrowableStrategy$1(String s, int i)
	{
		super(s, i, ((GlideExecutor._cls1) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #12  <Method void GlideExecutor$UncaughtThrowableStrategy(String, int, GlideExecutor$1)>
	//    5    7:return          
	}
}
