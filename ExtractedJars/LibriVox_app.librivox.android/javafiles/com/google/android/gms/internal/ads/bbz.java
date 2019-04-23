// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bcg, bau, akh, bav

public final class bbz extends bcg
{

	public bbz(bav bav, String s, String s1, akh akh1, int i, int j)
	{
		super(bav, s, s1, akh1, i, 51);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:iload           5
	//    6    8:bipush          51
	//    7   10:invokespecial   #8   <Method void bcg(bav, String, String, akh, int, int)>
	//    8   13:return          
	}

	protected final void a()
	{
		synchronized(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field akh b>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			bau bau1 = new bau((String)c.invoke(((Object) (null)), new Object[0]));
	//    5    7:new             #17  <Class bau>
	//    6   10:dup             
	//    7   11:aload_0         
	//    8   12:getfield        #21  <Field Method c>
	//    9   15:aconst_null     
	//   10   16:iconst_0        
	//   11   17:anewarray       Object[]
	//   12   20:invokevirtual   #29  <Method Object Method.invoke(Object, Object[])>
	//   13   23:checkcast       #31  <Class String>
	//   14   26:invokespecial   #34  <Method void bau(String)>
	//   15   29:astore_2        
			b.G = bau1.a;
	//   16   30:aload_0         
	//   17   31:getfield        #15  <Field akh b>
	//   18   34:aload_2         
	//   19   35:getfield        #37  <Field Long bau.a>
	//   20   38:putfield        #42  <Field Long akh.G>
			b.H = bau1.b;
	//   21   41:aload_0         
	//   22   42:getfield        #15  <Field akh b>
	//   23   45:aload_2         
	//   24   46:getfield        #44  <Field Long bau.b>
	//   25   49:putfield        #47  <Field Long akh.H>
		}
	//   26   52:aload_1         
	//   27   53:monitorexit     
		return;
	//   28   54:return          
		exception;
	//   29   55:astore_2        
		akh1;
	//   30   56:aload_1         
		JVM INSTR monitorexit ;
	//   31   57:monitorexit     
		throw exception;
	//   32   58:aload_2         
	//   33   59:athrow          
	}
}
