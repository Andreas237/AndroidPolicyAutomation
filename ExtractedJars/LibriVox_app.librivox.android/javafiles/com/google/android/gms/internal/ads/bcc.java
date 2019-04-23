// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bcg, akh, bav

public final class bcc extends bcg
{

	public bcc(bav bav1, String s, String s1, akh akh1, int i, int j)
	{
		super(bav1, s, s1, akh1, i, 48);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:iload           5
	//    6    8:bipush          48
	//    7   10:invokespecial   #8   <Method void bcg(bav, String, String, akh, int, int)>
	//    8   13:return          
	}

	protected final void a()
	{
		boolean flag;
		b.E = Integer.valueOf(2);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field akh b>
	//    2    4:iconst_2        
	//    3    5:invokestatic    #21  <Method Integer Integer.valueOf(int)>
	//    4    8:putfield        #27  <Field Integer akh.E>
		flag = ((Boolean)c.invoke(((Object) (null)), new Object[] {
			a.a()
		})).booleanValue();
	//    5   11:aload_0         
	//    6   12:getfield        #31  <Field Method c>
	//    7   15:aconst_null     
	//    8   16:iconst_1        
	//    9   17:anewarray       Object[]
	//   10   20:dup             
	//   11   21:iconst_0        
	//   12   22:aload_0         
	//   13   23:getfield        #36  <Field bav a>
	//   14   26:invokevirtual   #41  <Method android.content.Context bav.a()>
	//   15   29:aastore         
	//   16   30:invokevirtual   #47  <Method Object Method.invoke(Object, Object[])>
	//   17   33:checkcast       #49  <Class Boolean>
	//   18   36:invokevirtual   #53  <Method boolean Boolean.booleanValue()>
	//   19   39:istore_1        
		akh akh1 = b;
	//   20   40:aload_0         
	//   21   41:getfield        #15  <Field akh b>
	//   22   44:astore_2        
		akh1;
	//   23   45:aload_2         
		JVM INSTR monitorenter ;
	//   24   46:monitorenter    
		if(!flag)
			break MISSING_BLOCK_LABEL_66;
	//   25   47:iload_1         
	//   26   48:iconst_1        
	//   27   49:icmpne          66
		b.E = Integer.valueOf(1);
	//   28   52:aload_0         
	//   29   53:getfield        #15  <Field akh b>
	//   30   56:iconst_1        
	//   31   57:invokestatic    #21  <Method Integer Integer.valueOf(int)>
	//   32   60:putfield        #27  <Field Integer akh.E>
		break MISSING_BLOCK_LABEL_77;
	//   33   63:goto            77
		b.E = Integer.valueOf(0);
	//   34   66:aload_0         
	//   35   67:getfield        #15  <Field akh b>
	//   36   70:iconst_0        
	//   37   71:invokestatic    #21  <Method Integer Integer.valueOf(int)>
	//   38   74:putfield        #27  <Field Integer akh.E>
		akh1;
	//   39   77:aload_2         
		JVM INSTR monitorexit ;
	//   40   78:monitorexit     
		return;
	//   41   79:return          
		Exception exception;
		exception;
	//   42   80:astore_3        
		akh1;
	//   43   81:aload_2         
		JVM INSTR monitorexit ;
	//   44   82:monitorexit     
		throw exception;
	//   45   83:aload_3         
	//   46   84:athrow          
	}
}
