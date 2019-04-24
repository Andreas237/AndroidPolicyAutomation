// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import java.util.concurrent.Callable;

// Referenced classes of package com.amap.api.mapcore.util:
//			iz

class iz$2
	implements Callable
{

	public Void a()
		throws Exception
	{
		iz iz1 = a;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field iz a>
	//    2    4:astore_1        
		iz1;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		java.io.Writer writer = iz.a(a);
	//    5    7:aload_0         
	//    6    8:getfield        #15  <Field iz a>
	//    7   11:invokestatic    #25  <Method java.io.Writer iz.a(iz)>
	//    8   14:astore_2        
		if(writer != null)
			break MISSING_BLOCK_LABEL_23;
	//    9   15:aload_2         
	//   10   16:ifnonnull       23
		iz1;
	//   11   19:aload_1         
		JVM INSTR monitorexit ;
	//   12   20:monitorexit     
		return null;
	//   13   21:aconst_null     
	//   14   22:areturn         
		iz.b(a);
	//   15   23:aload_0         
	//   16   24:getfield        #15  <Field iz a>
	//   17   27:invokestatic    #28  <Method void iz.b(iz)>
		if(iz.c(a))
	//*  18   30:aload_0         
	//*  19   31:getfield        #15  <Field iz a>
	//*  20   34:invokestatic    #32  <Method boolean iz.c(iz)>
	//*  21   37:ifeq            56
		{
			iz.d(a);
	//   22   40:aload_0         
	//   23   41:getfield        #15  <Field iz a>
	//   24   44:invokestatic    #35  <Method void iz.d(iz)>
			iz.a(a, 0);
	//   25   47:aload_0         
	//   26   48:getfield        #15  <Field iz a>
	//   27   51:iconst_0        
	//   28   52:invokestatic    #38  <Method int iz.a(iz, int)>
	//   29   55:pop             
		}
		iz1;
	//   30   56:aload_1         
		JVM INSTR monitorexit ;
	//   31   57:monitorexit     
		  goto _L1
	//*  32   58:goto            66
		Exception exception;
		exception;
	//   33   61:astore_2        
	//*  34   62:aload_1         
		throw exception;
	//   35   63:monitorexit     
	//   36   64:aload_2         
	//   37   65:athrow          
_L1:
		return null;
	//   38   66:aconst_null     
	//   39   67:areturn         
	}

	public Object call()
		throws Exception
	{
		return ((Object) (a()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #43  <Method Void a()>
	//    2    4:areturn         
	}

	final iz a;

	iz$2(iz iz1)
	{
		a = iz1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field iz a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
