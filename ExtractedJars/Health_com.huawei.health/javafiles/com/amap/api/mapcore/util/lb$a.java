// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.os.HandlerThread;
import android.telephony.TelephonyManager;

// Referenced classes of package com.amap.api.mapcore.util:
//			lb

final class lb$a extends HandlerThread
{

	protected final void onLooperPrepared()
	{
		super.onLooperPrepared();
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void HandlerThread.onLooperPrepared()>
		Object obj = lb.a(a);
	//    2    4:aload_0         
	//    3    5:getfield        #12  <Field lb a>
	//    4    8:invokestatic    #25  <Method Object lb.a(lb)>
	//    5   11:astore_1        
		obj;
	//    6   12:aload_1         
		JVM INSTR monitorenter ;
	//    7   13:monitorenter    
		if(!lb.b(a))
	//*   8   14:aload_0         
	//*   9   15:getfield        #12  <Field lb a>
	//*  10   18:invokestatic    #29  <Method boolean lb.b(lb)>
	//*  11   21:ifne            31
			lb.c(a);
	//   12   24:aload_0         
	//   13   25:getfield        #12  <Field lb a>
	//   14   28:invokestatic    #33  <Method void lb.c(lb)>
		obj;
	//   15   31:aload_1         
		JVM INSTR monitorexit ;
	//   16   32:monitorexit     
		return;
	//   17   33:return          
		Exception exception;
		exception;
	//   18   34:astore_2        
	//*  19   35:aload_1         
		try
	//*  20   36:monitorexit     
		{
			throw exception;
	//   21   37:aload_2         
	//   22   38:athrow          
		}
		catch(Throwable throwable)
	//*  23   39:astore_1        
		{
			return;
	//   24   40:return          
		}
	}

	public final void run()
	{
		try
		{
			super.run();
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void HandlerThread.run()>
			return;
	//    2    4:return          
		}
	//*   3    5:aload_0         
	//*   4    6:getfield        #12  <Field lb a>
	//*   5    9:getfield        #39  <Field TelephonyManager lb.c>
	//*   6   12:aload_0         
	//*   7   13:getfield        #12  <Field lb a>
	//*   8   16:getfield        #43  <Field android.telephony.PhoneStateListener lb.g>
	//*   9   19:iconst_0        
	//*  10   20:invokevirtual   #49  <Method void TelephonyManager.listen(android.telephony.PhoneStateListener, int)>
	//*  11   23:aload_0         
	//*  12   24:getfield        #12  <Field lb a>
	//*  13   27:aconst_null     
	//*  14   28:putfield        #43  <Field android.telephony.PhoneStateListener lb.g>
	//*  15   31:aload_0         
	//*  16   32:invokevirtual   #53  <Method boolean quit()>
	//*  17   35:pop             
	//*  18   36:return          
		catch(Throwable throwable) { }
	//   19   37:astore_1        
		try
		{
			a.c.listen(a.g, 0);
			a.g = null;
			quit();
			return;
		}
	//*  20   38:goto            5
		catch(Throwable throwable1)
	//*  21   41:astore_1        
		{
			return;
	//   22   42:return          
		}
	}

	final lb a;

	public lb$a(lb lb1, String s)
	{
		a = lb1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field lb a>
		super(s);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #15  <Method void HandlerThread(String)>
	//    6   10:return          
	}
}
