// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.executor;


// Referenced classes of package com.bumptech.glide.load.engine.executor:
//			GlideExecutor

static final class GlideExecutor$UncaughtThrowableStrategy$2 extends GlideExecutor.UncaughtThrowableStrategy
{

	protected void handle(Throwable throwable)
	{
		super.handle(throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #17  <Method void GlideExecutor$UncaughtThrowableStrategy.handle(Throwable)>
		if(throwable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          20
			throw new RuntimeException("Request threw uncaught throwable", throwable);
	//    5    9:new             #19  <Class RuntimeException>
	//    6   12:dup             
	//    7   13:ldc1            #21  <String "Request threw uncaught throwable">
	//    8   15:aload_1         
	//    9   16:invokespecial   #24  <Method void RuntimeException(String, Throwable)>
	//   10   19:athrow          
		else
			return;
	//   11   20:return          
	}

	GlideExecutor$UncaughtThrowableStrategy$2(String s, int i)
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
