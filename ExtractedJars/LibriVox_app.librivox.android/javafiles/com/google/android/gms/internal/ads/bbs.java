// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bcg, akh, bav

public final class bbs extends bcg
{

	public bbs(bav bav, String s, String s1, akh akh1, int i, int j)
	{
		super(bav, s, s1, akh1, i, 22);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:iload           5
	//    6    8:bipush          22
	//    7   10:invokespecial   #21  <Method void bcg(bav, String, String, akh, int, int)>
	//    8   13:return          
	}

	protected final void a()
	{
		if(d == null)
	//*   0    0:getstatic       #24  <Field Long d>
	//*   1    3:ifnonnull       46
			synchronized(e)
	//*   2    6:getstatic       #17  <Field Object e>
	//*   3    9:astore_1        
	//*   4   10:aload_1         
	//*   5   11:monitorenter    
			{
				if(d == null)
	//*   6   12:getstatic       #24  <Field Long d>
	//*   7   15:ifnonnull       36
					d = (Long)c.invoke(((Object) (null)), new Object[0]);
	//    8   18:aload_0         
	//    9   19:getfield        #28  <Field Method c>
	//   10   22:aconst_null     
	//   11   23:iconst_0        
	//   12   24:anewarray       Object[]
	//   13   27:invokevirtual   #34  <Method Object Method.invoke(Object, Object[])>
	//   14   30:checkcast       #36  <Class Long>
	//   15   33:putstatic       #24  <Field Long d>
			}
	//   16   36:aload_1         
	//   17   37:monitorexit     
		break MISSING_BLOCK_LABEL_46;
	//   18   38:goto            46
		exception;
	//   19   41:astore_2        
		obj;
	//   20   42:aload_1         
		JVM INSTR monitorexit ;
	//   21   43:monitorexit     
		throw exception;
	//   22   44:aload_2         
	//   23   45:athrow          
		synchronized(b)
	//*  24   46:aload_0         
	//*  25   47:getfield        #40  <Field akh b>
	//*  26   50:astore_1        
	//*  27   51:aload_1         
	//*  28   52:monitorenter    
		{
			b.l = d;
	//   29   53:aload_0         
	//   30   54:getfield        #40  <Field akh b>
	//   31   57:getstatic       #24  <Field Long d>
	//   32   60:putfield        #45  <Field Long akh.l>
		}
	//   33   63:aload_1         
	//   34   64:monitorexit     
		return;
	//   35   65:return          
		exception1;
	//   36   66:astore_2        
		akh1;
	//   37   67:aload_1         
		JVM INSTR monitorexit ;
	//   38   68:monitorexit     
		throw exception1;
	//   39   69:aload_2         
	//   40   70:athrow          
	}

	private static volatile Long d;
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
