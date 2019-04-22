// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.android;

import android.util.Log;

// Referenced classes of package com.firebase.client.android:
//			AndroidPlatform

class AndroidPlatform$2 extends Thread
{

	public void run()
	{
		try
		{
			val$r.run();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Runnable val$r>
	//    2    4:invokeinterface #32  <Method void Runnable.run()>
			return;
	//    3    9:return          
		}
	//*   4   10:astore_1        
	//*   5   11:ldc1            #34  <String "Firebase">
	//*   6   13:ldc1            #36  <String "An unexpected error occurred. Please contact support@firebase.com. Details: ">
	//*   7   15:aload_1         
	//*   8   16:invokestatic    #42  <Method int Log.e(String, String, Throwable)>
	//*   9   19:pop             
	//*  10   20:new             #44  <Class RuntimeException>
	//*  11   23:dup             
	//*  12   24:aload_1         
	//*  13   25:invokespecial   #47  <Method void RuntimeException(Throwable)>
	//*  14   28:athrow          
		catch(OutOfMemoryError outofmemoryerror)
	//*  15   29:astore_1        
		{
			throw outofmemoryerror;
	//   16   30:aload_1         
	//   17   31:athrow          
		}
		catch(Throwable throwable)
		{
			Log.e("Firebase", "An unexpected error occurred. Please contact support@firebase.com. Details: ", throwable);
			throw new RuntimeException(throwable);
		}
	}

	final AndroidPlatform this$0;
	final Runnable val$r;

	AndroidPlatform$2()
	{
		this$0 = final_androidplatform;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field AndroidPlatform this$0>
		val$r = Runnable.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field Runnable val$r>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #22  <Method void Thread()>
	//    8   14:return          
	}
}
