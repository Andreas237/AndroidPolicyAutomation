// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;
import java.util.concurrent.RejectedExecutionException;

// Referenced classes of package com.amap.api.mapcore.util:
//			hk, jp, hn, jt, 
//			jr, hm

static final class hk$1
	implements Runnable
{

	public void run()
	{
		try
		{
			jp.a(a);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Context a>
	//    2    4:invokestatic    #29  <Method void jp.a(Context)>
			hn.b(a);
	//    3    7:aload_0         
	//    4    8:getfield        #16  <Field Context a>
	//    5   11:invokestatic    #32  <Method void hn.b(Context)>
			hn.d(a);
	//    6   14:aload_0         
	//    7   15:getfield        #16  <Field Context a>
	//    8   18:invokestatic    #35  <Method void hn.d(Context)>
			hn.c(a);
	//    9   21:aload_0         
	//   10   22:getfield        #16  <Field Context a>
	//   11   25:invokestatic    #38  <Method void hn.c(Context)>
			jt.a(a);
	//   12   28:aload_0         
	//   13   29:getfield        #16  <Field Context a>
	//   14   32:invokestatic    #41  <Method void jt.a(Context)>
			jr.a(a);
	//   15   35:aload_0         
	//   16   36:getfield        #16  <Field Context a>
	//   17   39:invokestatic    #44  <Method void jr.a(Context)>
			return;
	//   18   42:return          
		}
		catch(RejectedExecutionException rejectedexecutionexception)
	//*  19   43:astore_1        
		{
			return;
	//   20   44:return          
		}
		catch(Throwable throwable)
	//*  21   45:astore_1        
		{
			hm.c(throwable, "Lg", "proL");
	//   22   46:aload_1         
	//   23   47:ldc1            #46  <String "Lg">
	//   24   49:ldc1            #48  <String "proL">
	//   25   51:invokestatic    #53  <Method void hm.c(Throwable, String, String)>
		}
	//   26   54:return          
	}

	final Context a;

	hk$1(Context context)
	{
		a = context;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field Context a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
