// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;

// Referenced classes of package com.amap.api.mapcore.util:
//			jt, js, hm

static final class jt$1
	implements Runnable
{

	public void run()
	{
		com/amap/api/mapcore/util/jt;
	//    0    0:ldc1            #8   <Class jt>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		jt.a(a, b.a());
	//    2    3:aload_0         
	//    3    4:getfield        #18  <Field Context a>
	//    4    7:aload_0         
	//    5    8:getfield        #20  <Field js b>
	//    6   11:invokevirtual   #32  <Method byte[] js.a()>
	//    7   14:invokestatic    #35  <Method void jt.a(Context, byte[])>
		com/amap/api/mapcore/util/jt;
	//    8   17:ldc1            #8   <Class jt>
		JVM INSTR monitorexit ;
	//    9   19:monitorexit     
		  goto _L1
	//*  10   20:goto            29
		Object obj;
		obj;
	//   11   23:astore_1        
	//*  12   24:ldc1            #8   <Class jt>
		throw obj;
	//   13   26:monitorexit     
	//   14   27:aload_1         
	//   15   28:athrow          
_L1:
		return;
	//   16   29:return          
		obj;
	//   17   30:astore_1        
		hm.c(((Throwable) (obj)), "stm", "as");
	//   18   31:aload_1         
	//   19   32:ldc1            #37  <String "stm">
	//   20   34:ldc1            #39  <String "as">
	//   21   36:invokestatic    #45  <Method void hm.c(Throwable, String, String)>
		return;
	//   22   39:return          
	}

	final Context a;
	final js b;

	jt$1(Context context, js js1)
	{
		a = context;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field Context a>
		b = js1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field js b>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
