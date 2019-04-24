// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.alipay.sdk.app;

import o.fm;

// Referenced classes of package com.alipay.sdk.app:
//			H5PayActivity

public class H5AuthActivity extends H5PayActivity
{

	public H5AuthActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void H5PayActivity()>
	//    2    4:return          
	}

	public final void c()
	{
		Object obj = fm.a;
	//    0    0:getstatic       #18  <Field Object fm.a>
	//    1    3:astore_1        
		obj;
	//    2    4:aload_1         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		Exception exception;
		try
		{
			obj.notify();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #23  <Method void Object.notify()>
		}
	//*   6   10:aload_1         
	//*   7   11:monitorexit     
	//*   8   12:return          
	//*   9   13:astore_2        
	//*  10   14:aload_1         
	//*  11   15:monitorexit     
	//*  12   16:aload_2         
	//*  13   17:athrow          
		catch(Exception exception1) { }
	//   14   18:astore_2        
		obj;
		JVM INSTR monitorexit ;
		return;
		exception;
		throw exception;
	//*  15   19:goto            10
	}
}
