// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.util.concurrent.Callable;

// Referenced classes of package o:
//			jw

class jw$a
	implements Callable
{

	public Void b()
		throws Exception
	{
		jw jw1 = e;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field jw e>
	//    2    4:astore_1        
		jw1;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		java.io.Writer writer = jw.a(e);
	//    5    7:aload_0         
	//    6    8:getfield        #15  <Field jw e>
	//    7   11:invokestatic    #27  <Method java.io.Writer jw.a(jw)>
	//    8   14:astore_2        
		if(writer != null)
			break MISSING_BLOCK_LABEL_23;
	//    9   15:aload_2         
	//   10   16:ifnonnull       23
		jw1;
	//   11   19:aload_1         
		JVM INSTR monitorexit ;
	//   12   20:monitorexit     
		return null;
	//   13   21:aconst_null     
	//   14   22:areturn         
		jw.c(e);
	//   15   23:aload_0         
	//   16   24:getfield        #15  <Field jw e>
	//   17   27:invokestatic    #30  <Method void jw.c(jw)>
		if(jw.b(e))
	//*  18   30:aload_0         
	//*  19   31:getfield        #15  <Field jw e>
	//*  20   34:invokestatic    #33  <Method boolean jw.b(jw)>
	//*  21   37:ifeq            56
		{
			jw.e(e);
	//   22   40:aload_0         
	//   23   41:getfield        #15  <Field jw e>
	//   24   44:invokestatic    #35  <Method void jw.e(jw)>
			jw.e(e, 0);
	//   25   47:aload_0         
	//   26   48:getfield        #15  <Field jw e>
	//   27   51:iconst_0        
	//   28   52:invokestatic    #38  <Method int jw.e(jw, int)>
	//   29   55:pop             
		}
		jw1;
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
		return ((Object) (b()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #43  <Method Void b()>
	//    2    4:areturn         
	}

	final jw e;

	jw$a(jw jw1)
	{
		e = jw1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field jw e>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
