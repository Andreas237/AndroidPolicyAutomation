// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bcg, akh, bav

public final class bbp extends bcg
{

	public bbp(bav bav, String s, String s1, akh akh1, long l, int i, 
			int j)
	{
		super(bav, s, s1, akh1, i, 25);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:iload           7
	//    6    8:bipush          25
	//    7   10:invokespecial   #11  <Method void bcg(bav, String, String, akh, int, int)>
		d = l;
	//    8   13:aload_0         
	//    9   14:lload           5
	//   10   16:putfield        #13  <Field long d>
	//   11   19:return          
	}

	protected final void a()
	{
		long l = ((Long)c.invoke(((Object) (null)), new Object[0])).longValue();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Method c>
	//    2    4:aconst_null     
	//    3    5:iconst_0        
	//    4    6:anewarray       Object[]
	//    5    9:invokevirtual   #28  <Method Object Method.invoke(Object, Object[])>
	//    6   12:checkcast       #30  <Class Long>
	//    7   15:invokevirtual   #34  <Method long Long.longValue()>
	//    8   18:lstore_1        
		synchronized(b)
	//*   9   19:aload_0         
	//*  10   20:getfield        #38  <Field akh b>
	//*  11   23:astore_3        
	//*  12   24:aload_3         
	//*  13   25:monitorenter    
		{
			b.X = Long.valueOf(l);
	//   14   26:aload_0         
	//   15   27:getfield        #38  <Field akh b>
	//   16   30:lload_1         
	//   17   31:invokestatic    #42  <Method Long Long.valueOf(long)>
	//   18   34:putfield        #48  <Field Long akh.X>
			if(d != 0L)
	//*  19   37:aload_0         
	//*  20   38:getfield        #13  <Field long d>
	//*  21   41:lconst_0        
	//*  22   42:lcmp            
	//*  23   43:ifeq            76
			{
				b.j = Long.valueOf(l - d);
	//   24   46:aload_0         
	//   25   47:getfield        #38  <Field akh b>
	//   26   50:lload_1         
	//   27   51:aload_0         
	//   28   52:getfield        #13  <Field long d>
	//   29   55:lsub            
	//   30   56:invokestatic    #42  <Method Long Long.valueOf(long)>
	//   31   59:putfield        #51  <Field Long akh.j>
				b.m = Long.valueOf(d);
	//   32   62:aload_0         
	//   33   63:getfield        #38  <Field akh b>
	//   34   66:aload_0         
	//   35   67:getfield        #13  <Field long d>
	//   36   70:invokestatic    #42  <Method Long Long.valueOf(long)>
	//   37   73:putfield        #54  <Field Long akh.m>
			}
		}
	//   38   76:aload_3         
	//   39   77:monitorexit     
		return;
	//   40   78:return          
		exception;
	//   41   79:astore          4
		akh1;
	//   42   81:aload_3         
		JVM INSTR monitorexit ;
	//   43   82:monitorexit     
		throw exception;
	//   44   83:aload           4
	//   45   85:athrow          
	}

	private long d;
}
