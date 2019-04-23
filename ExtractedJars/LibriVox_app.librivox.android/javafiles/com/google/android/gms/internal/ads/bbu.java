// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bcg, akh, bav

public final class bbu extends bcg
{

	public bbu(bav bav, String s, String s1, akh akh1, int i, int j)
	{
		super(bav, s, s1, akh1, i, 1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:iload           5
	//    6    8:iconst_1        
	//    7    9:invokespecial   #21  <Method void bcg(bav, String, String, akh, int, int)>
	//    8   12:return          
	}

	protected final void a()
	{
		b.a = "E";
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field akh b>
	//    2    4:ldc1            #28  <String "E">
	//    3    6:putfield        #32  <Field String akh.a>
		if(d == null)
	//*   4    9:getstatic       #34  <Field String d>
	//*   5   12:ifnonnull       55
			synchronized(e)
	//*   6   15:getstatic       #17  <Field Object e>
	//*   7   18:astore_1        
	//*   8   19:aload_1         
	//*   9   20:monitorenter    
			{
				if(d == null)
	//*  10   21:getstatic       #34  <Field String d>
	//*  11   24:ifnonnull       45
					d = (String)c.invoke(((Object) (null)), new Object[0]);
	//   12   27:aload_0         
	//   13   28:getfield        #38  <Field Method c>
	//   14   31:aconst_null     
	//   15   32:iconst_0        
	//   16   33:anewarray       Object[]
	//   17   36:invokevirtual   #44  <Method Object Method.invoke(Object, Object[])>
	//   18   39:checkcast       #46  <Class String>
	//   19   42:putstatic       #34  <Field String d>
			}
	//   20   45:aload_1         
	//   21   46:monitorexit     
		break MISSING_BLOCK_LABEL_55;
	//   22   47:goto            55
		exception;
	//   23   50:astore_2        
		obj;
	//   24   51:aload_1         
		JVM INSTR monitorexit ;
	//   25   52:monitorexit     
		throw exception;
	//   26   53:aload_2         
	//   27   54:athrow          
		synchronized(b)
	//*  28   55:aload_0         
	//*  29   56:getfield        #26  <Field akh b>
	//*  30   59:astore_1        
	//*  31   60:aload_1         
	//*  32   61:monitorenter    
		{
			b.a = d;
	//   33   62:aload_0         
	//   34   63:getfield        #26  <Field akh b>
	//   35   66:getstatic       #34  <Field String d>
	//   36   69:putfield        #32  <Field String akh.a>
		}
	//   37   72:aload_1         
	//   38   73:monitorexit     
		return;
	//   39   74:return          
		exception1;
	//   40   75:astore_2        
		akh1;
	//   41   76:aload_1         
		JVM INSTR monitorexit ;
	//   42   77:monitorexit     
		throw exception1;
	//   43   78:aload_2         
	//   44   79:athrow          
	}

	private static volatile String d;
	private static final Object e = new Object();

	static 
	{
	//    0    0:new             #12  <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void Object()>
	//    3    7:putstatic       #17  <Field Object e>
	//*   4   10:return          
	}
}
