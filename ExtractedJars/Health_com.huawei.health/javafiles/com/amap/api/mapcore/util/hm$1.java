// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.Looper;

// Referenced classes of package com.amap.api.mapcore.util:
//			hm, hv, hn, gy

class hm$1
	implements Runnable
{

	public void run()
	{
		Looper looper = Looper.getMainLooper();
	//    0    0:invokestatic    #41  <Method Looper Looper.getMainLooper()>
	//    1    3:astore_1        
		looper;
	//    2    4:aload_1         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		(new hv(a, true)).a(b);
	//    4    6:new             #43  <Class hv>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:getfield        #24  <Field Context a>
	//    8   14:iconst_1        
	//    9   15:invokespecial   #46  <Method void hv(Context, boolean)>
	//   10   18:aload_0         
	//   11   19:getfield        #26  <Field gy b>
	//   12   22:invokevirtual   #49  <Method void hv.a(gy)>
		looper;
	//   13   25:aload_1         
		JVM INSTR monitorexit ;
	//   14   26:monitorexit     
		  goto _L1
	//*  15   27:goto            35
		Exception exception;
		exception;
	//   16   30:astore_2        
	//*  17   31:aload_1         
		throw exception;
	//   18   32:monitorexit     
	//   19   33:aload_2         
	//   20   34:athrow          
_L1:
		if(c)
	//*  21   35:aload_0         
	//*  22   36:getfield        #28  <Field boolean c>
	//*  23   39:ifeq            52
			hn.a(hm.a(d));
	//   24   42:aload_0         
	//   25   43:getfield        #22  <Field hm d>
	//   26   46:invokestatic    #52  <Method Context hm.a(hm)>
	//   27   49:invokestatic    #57  <Method void hn.a(Context)>
		return;
	//   28   52:return          
		Throwable throwable;
		throwable;
	//   29   53:astore_1        
		throwable.printStackTrace();
	//   30   54:aload_1         
	//   31   55:invokevirtual   #60  <Method void Throwable.printStackTrace()>
		return;
	//   32   58:return          
	}

	final Context a;
	final gy b;
	final boolean c;
	final hm d;

	hm$1(hm hm1, Context context, gy gy, boolean flag)
	{
		d = hm1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field hm d>
		a = context;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field Context a>
		b = gy;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #26  <Field gy b>
		c = flag;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #28  <Field boolean c>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #31  <Method void Object()>
	//   14   25:return          
	}
}
