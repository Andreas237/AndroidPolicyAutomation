// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bcg, bav, akh

public final class bbx extends bcg
{

	public bbx(bav bav1, String s, String s1, akh akh1, int i, int j)
	{
		super(bav1, s, s1, akh1, i, 61);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:iload           5
	//    6    8:bipush          61
	//    7   10:invokespecial   #10  <Method void bcg(bav, String, String, akh, int, int)>
		d = bav1.j();
	//    8   13:aload_0         
	//    9   14:aload_1         
	//   10   15:invokevirtual   #16  <Method boolean bav.j()>
	//   11   18:putfield        #18  <Field boolean d>
	//   12   21:return          
	}

	protected final void a()
	{
		long l = ((Long)c.invoke(((Object) (null)), new Object[] {
			a.a(), Boolean.valueOf(d)
		})).longValue();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Method c>
	//    2    4:aconst_null     
	//    3    5:iconst_2        
	//    4    6:anewarray       Object[]
	//    5    9:dup             
	//    6   10:iconst_0        
	//    7   11:aload_0         
	//    8   12:getfield        #30  <Field bav a>
	//    9   15:invokevirtual   #33  <Method android.content.Context bav.a()>
	//   10   18:aastore         
	//   11   19:dup             
	//   12   20:iconst_1        
	//   13   21:aload_0         
	//   14   22:getfield        #18  <Field boolean d>
	//   15   25:invokestatic    #39  <Method Boolean Boolean.valueOf(boolean)>
	//   16   28:aastore         
	//   17   29:invokevirtual   #45  <Method Object Method.invoke(Object, Object[])>
	//   18   32:checkcast       #47  <Class Long>
	//   19   35:invokevirtual   #51  <Method long Long.longValue()>
	//   20   38:lstore_1        
		synchronized(b)
	//*  21   39:aload_0         
	//*  22   40:getfield        #55  <Field akh b>
	//*  23   43:astore_3        
	//*  24   44:aload_3         
	//*  25   45:monitorenter    
		{
			b.P = Long.valueOf(l);
	//   26   46:aload_0         
	//   27   47:getfield        #55  <Field akh b>
	//   28   50:lload_1         
	//   29   51:invokestatic    #58  <Method Long Long.valueOf(long)>
	//   30   54:putfield        #64  <Field Long akh.P>
		}
	//   31   57:aload_3         
	//   32   58:monitorexit     
		return;
	//   33   59:return          
		exception;
	//   34   60:astore          4
		akh1;
	//   35   62:aload_3         
		JVM INSTR monitorexit ;
	//   36   63:monitorexit     
		throw exception;
	//   37   64:aload           4
	//   38   66:athrow          
	}

	private final boolean d;
}
