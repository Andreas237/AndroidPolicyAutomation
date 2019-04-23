// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.executor;


// Referenced classes of package com.bumptech.glide.load.engine.executor:
//			GlideExecutor

class GlideExecutor$UncaughtThrowableStrategy$3
	implements GlideExecutor.UncaughtThrowableStrategy
{

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

	GlideExecutor$UncaughtThrowableStrategy$3()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
