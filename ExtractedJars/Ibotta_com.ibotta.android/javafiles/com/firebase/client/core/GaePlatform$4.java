// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.utilities.LogWrapper;

// Referenced classes of package com.firebase.client.core:
//			GaePlatform, Context

class GaePlatform$4
	implements Runnable
{

	public void run()
	{
		try
		{
			val$r.run();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Runnable val$r>
	//    2    4:invokeinterface #36  <Method void Runnable.run()>
			return;
	//    3    9:return          
		}
	//*   4   10:astore_1        
	//*   5   11:aload_0         
	//*   6   12:getfield        #25  <Field Context val$ctx>
	//*   7   15:ldc1            #38  <String "BackgroundTask">
	//*   8   17:invokevirtual   #44  <Method LogWrapper Context.getLogger(String)>
	//*   9   20:ldc1            #46  <String "An unexpected error occurred. Please contact support@firebase.com. Details: ">
	//*  10   22:aload_1         
	//*  11   23:invokevirtual   #52  <Method void LogWrapper.error(String, Throwable)>
	//*  12   26:new             #54  <Class RuntimeException>
	//*  13   29:dup             
	//*  14   30:aload_1         
	//*  15   31:invokespecial   #57  <Method void RuntimeException(Throwable)>
	//*  16   34:athrow          
		catch(OutOfMemoryError outofmemoryerror)
	//*  17   35:astore_1        
		{
			throw outofmemoryerror;
	//   18   36:aload_1         
	//   19   37:athrow          
		}
		catch(Throwable throwable)
		{
			val$ctx.getLogger("BackgroundTask").error("An unexpected error occurred. Please contact support@firebase.com. Details: ", throwable);
			throw new RuntimeException(throwable);
		}
	}

	final GaePlatform this$0;
	final Context val$ctx;
	final Runnable val$r;

	GaePlatform$4()
	{
		this$0 = final_gaeplatform;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field GaePlatform this$0>
		val$r = runnable;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field Runnable val$r>
		val$ctx = Context.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field Context val$ctx>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
