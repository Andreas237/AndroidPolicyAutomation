// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7;

import java.io.Serializable;

// Referenced classes of package android.support.v7:
//			am, ae, bq, v, 
//			ab

final class bo
	implements am, Serializable
{

	public bo(v v1, Object obj)
	{
		ae.b(((Object) (v1)), "initializer");
	//    0    0:aload_1         
	//    1    1:ldc1            #21  <String "initializer">
	//    2    3:invokestatic    #26  <Method void ae.b(Object, String)>
		super();
	//    3    6:aload_0         
	//    4    7:invokespecial   #29  <Method void Object()>
		a = v1;
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:putfield        #31  <Field v a>
		b = ((Object) (bq.a));
	//    8   15:aload_0         
	//    9   16:getstatic       #36  <Field bq bq.a>
	//   10   19:putfield        #38  <Field Object b>
		if(obj == null)
	//*  11   22:aload_2         
	//*  12   23:ifnull          32
	//*  13   26:aload_0         
	//*  14   27:aload_2         
	//*  15   28:putfield        #40  <Field Object c>
	//*  16   31:return          
			obj = ((Object) (this));
	//   17   32:aload_0         
	//   18   33:astore_2        
		c = obj;
	//*  19   34:goto            26
	}

	public bo(v v1, Object obj, int i, ab ab)
	{
		if((i & 2) != 0)
	//*   0    0:iload_3         
	//*   1    1:iconst_2        
	//*   2    2:iand            
	//*   3    3:ifeq            8
			obj = null;
	//    4    6:aconst_null     
	//    5    7:astore_2        
		this(v1, obj);
	//    6    8:aload_0         
	//    7    9:aload_1         
	//    8   10:aload_2         
	//    9   11:invokespecial   #47  <Method void bo(v, Object)>
	//   10   14:return          
	}

	public Object a()
	{
		Object obj = b;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Object b>
	//    2    4:astore_1        
		if(obj != bq.a)
	//*   3    5:aload_1         
	//*   4    6:getstatic       #36  <Field bq bq.a>
	//*   5    9:if_acmpeq       14
			return obj;
	//    6   12:aload_1         
	//    7   13:areturn         
		Object obj2 = c;
	//    8   14:aload_0         
	//    9   15:getfield        #40  <Field Object c>
	//   10   18:astore_2        
		obj2;
	//   11   19:aload_2         
		JVM INSTR monitorenter ;
	//   12   20:monitorenter    
		Object obj1;
		bq bq1;
		obj1 = b;
	//   13   21:aload_0         
	//   14   22:getfield        #38  <Field Object b>
	//   15   25:astore_1        
		bq1 = bq.a;
	//   16   26:getstatic       #36  <Field bq bq.a>
	//   17   29:astore_3        
		if(obj1 == bq1) goto _L2; else goto _L1
	//   18   30:aload_1         
	//   19   31:aload_3         
	//   20   32:if_acmpeq       39
_L1:
		obj2;
	//   21   35:aload_2         
		JVM INSTR monitorexit ;
	//   22   36:monitorexit     
		return obj1;
	//   23   37:aload_1         
	//   24   38:areturn         
_L2:
		obj1 = ((Object) (a));
	//   25   39:aload_0         
	//   26   40:getfield        #31  <Field v a>
	//   27   43:astore_1        
		if(obj1 != null)
			break MISSING_BLOCK_LABEL_51;
	//   28   44:aload_1         
	//   29   45:ifnonnull       51
		ae.a();
	//   30   48:invokestatic    #50  <Method void ae.a()>
		obj1 = ((v) (obj1)).a();
	//   31   51:aload_1         
	//   32   52:invokeinterface #54  <Method Object v.a()>
	//   33   57:astore_1        
		b = obj1;
	//   34   58:aload_0         
	//   35   59:aload_1         
	//   36   60:putfield        #38  <Field Object b>
		a = (v)null;
	//   37   63:aload_0         
	//   38   64:aconst_null     
	//   39   65:checkcast       #52  <Class v>
	//   40   68:putfield        #31  <Field v a>
		if(true) goto _L1; else goto _L3
	//   41   71:goto            35
_L3:
		Exception exception;
		exception;
	//   42   74:astore_1        
	//*  43   75:aload_2         
		throw exception;
	//   44   76:monitorexit     
	//   45   77:aload_1         
	//   46   78:athrow          
	}

	public boolean b()
	{
		return b != bq.a;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Object b>
	//    2    4:getstatic       #36  <Field bq bq.a>
	//    3    7:if_acmpeq       12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public String toString()
	{
		if(b())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #60  <Method boolean b()>
	//*   2    4:ifeq            15
			return String.valueOf(a());
	//    3    7:aload_0         
	//    4    8:invokevirtual   #61  <Method Object a()>
	//    5   11:invokestatic    #67  <Method String String.valueOf(Object)>
	//    6   14:areturn         
		else
			return "Lazy value not initialized yet.";
	//    7   15:ldc1            #69  <String "Lazy value not initialized yet.">
	//    8   17:areturn         
	}

	private v a;
	private volatile Object b;
	private final Object c;
}
