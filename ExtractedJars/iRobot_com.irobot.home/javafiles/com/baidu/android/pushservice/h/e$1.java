// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice.h;

import com.baidu.android.pushservice.e.a;
import com.baidu.android.pushservice.g.c;

// Referenced classes of package com.baidu.android.pushservice.h:
//			e

class e$1 extends c
{

	public void a()
	{
		Thread.sleep(e.d());
	//    0    0:invokestatic    #26  <Method int e.d()>
	//    1    3:i2l             
	//    2    4:invokestatic    #32  <Method void Thread.sleep(long)>
		synchronized(e.e())
	//*   3    7:invokestatic    #36  <Method Object e.e()>
	//*   4   10:astore_1        
	//*   5   11:aload_1         
	//*   6   12:monitorenter    
		{
			e.e().notifyAll();
	//    7   13:invokestatic    #36  <Method Object e.e()>
	//    8   16:invokevirtual   #41  <Method void Object.notifyAll()>
		}
	//    9   19:aload_1         
	//   10   20:monitorexit     
		return;
	//   11   21:return          
		exception;
	//   12   22:astore_2        
		obj;
	//   13   23:aload_1         
		JVM INSTR monitorexit ;
	//   14   24:monitorexit     
		InterruptedException interruptedexception;
		try
		{
			throw exception;
	//   15   25:aload_2         
	//   16   26:athrow          
		}
	//*  17   27:ldc1            #43  <String "CrossAppRequest">
	//*  18   29:ldc1            #45  <String "result return, interrupted by callback">
	//*  19   31:invokestatic    #50  <Method void a.a(String, String)>
	//*  20   34:return          
		// Misplaced declaration of an exception variable
		catch(InterruptedException interruptedexception)
		{
			com.baidu.android.pushservice.e.a.a("CrossAppRequest", "result return, interrupted by callback");
		}
		return;
	//*  21   35:astore_1        
	//*  22   36:goto            27
	}

	final e a;

	e$1(e e1, String s, short word0)
	{
		a = e1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field e a>
		super(s, word0);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:iload_3         
	//    6    8:invokespecial   #18  <Method void c(String, short)>
	//    7   11:return          
	}
}
