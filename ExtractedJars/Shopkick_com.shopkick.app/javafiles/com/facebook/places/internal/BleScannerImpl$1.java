// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.places.internal;


// Referenced classes of package com.facebook.places.internal:
//			BleScannerImpl

class BleScannerImpl$1
	implements Runnable
{

	public void run()
	{
		synchronized(val$lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field Object val$lock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			val$lock.notify();
	//    5    7:aload_0         
	//    6    8:getfield        #21  <Field Object val$lock>
	//    7   11:invokevirtual   #31  <Method void Object.notify()>
		}
	//    8   14:aload_1         
	//    9   15:monitorexit     
		return;
	//   10   16:return          
		exception1;
	//   11   17:astore_2        
		obj;
	//   12   18:aload_1         
		JVM INSTR monitorexit ;
	//   13   19:monitorexit     
		try
		{
			throw exception1;
	//   14   20:aload_2         
	//   15   21:athrow          
		}
		catch(Exception exception)
	//*  16   22:astore_1        
		{
			BleScannerImpl.access$100("Exception waiting for main looper", exception);
	//   17   23:ldc1            #33  <String "Exception waiting for main looper">
	//   18   25:aload_1         
	//   19   26:invokestatic    #37  <Method void BleScannerImpl.access$100(String, Exception)>
		}
		return;
	//   20   29:return          
	}

	final BleScannerImpl this$0;
	final Object val$lock;

	BleScannerImpl$1()
	{
		this$0 = final_blescannerimpl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field BleScannerImpl this$0>
		val$lock = Object.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Object val$lock>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
