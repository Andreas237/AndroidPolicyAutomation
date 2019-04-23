// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bcg, akh, bav

public final class bbn extends bcg
{

	public bbn(bav bav1, String s, String s1, akh akh1, int i, int j)
	{
		super(bav1, s, s1, akh1, i, 5);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:iload           5
	//    6    8:iconst_5        
	//    7    9:invokespecial   #8   <Method void bcg(bav, String, String, akh, int, int)>
	//    8   12:return          
	}

	protected final void a()
	{
		int ai[];
		b.d = Long.valueOf(-1L);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field akh b>
	//    2    4:ldc2w           #16  <Long -1L>
	//    3    7:invokestatic    #23  <Method Long Long.valueOf(long)>
	//    4   10:putfield        #29  <Field Long akh.d>
		b.e = Long.valueOf(-1L);
	//    5   13:aload_0         
	//    6   14:getfield        #15  <Field akh b>
	//    7   17:ldc2w           #16  <Long -1L>
	//    8   20:invokestatic    #23  <Method Long Long.valueOf(long)>
	//    9   23:putfield        #32  <Field Long akh.e>
		ai = (int[])c.invoke(((Object) (null)), new Object[] {
			a.a()
		});
	//   10   26:aload_0         
	//   11   27:getfield        #36  <Field Method c>
	//   12   30:aconst_null     
	//   13   31:iconst_1        
	//   14   32:anewarray       Object[]
	//   15   35:dup             
	//   16   36:iconst_0        
	//   17   37:aload_0         
	//   18   38:getfield        #41  <Field bav a>
	//   19   41:invokevirtual   #46  <Method android.content.Context bav.a()>
	//   20   44:aastore         
	//   21   45:invokevirtual   #52  <Method Object Method.invoke(Object, Object[])>
	//   22   48:checkcast       #54  <Class int[]>
	//   23   51:astore_2        
		akh akh1 = b;
	//   24   52:aload_0         
	//   25   53:getfield        #15  <Field akh b>
	//   26   56:astore_1        
		akh1;
	//   27   57:aload_1         
		JVM INSTR monitorenter ;
	//   28   58:monitorenter    
		b.d = Long.valueOf(ai[0]);
	//   29   59:aload_0         
	//   30   60:getfield        #15  <Field akh b>
	//   31   63:aload_2         
	//   32   64:iconst_0        
	//   33   65:iaload          
	//   34   66:i2l             
	//   35   67:invokestatic    #23  <Method Long Long.valueOf(long)>
	//   36   70:putfield        #29  <Field Long akh.d>
		b.e = Long.valueOf(ai[1]);
	//   37   73:aload_0         
	//   38   74:getfield        #15  <Field akh b>
	//   39   77:aload_2         
	//   40   78:iconst_1        
	//   41   79:iaload          
	//   42   80:i2l             
	//   43   81:invokestatic    #23  <Method Long Long.valueOf(long)>
	//   44   84:putfield        #32  <Field Long akh.e>
		if(ai[2] == 0x80000000)
			break MISSING_BLOCK_LABEL_109;
	//   45   87:aload_2         
	//   46   88:iconst_2        
	//   47   89:iaload          
	//   48   90:ldc1            #55  <Int 0x80000000>
	//   49   92:icmpeq          109
		b.N = Long.valueOf(ai[2]);
	//   50   95:aload_0         
	//   51   96:getfield        #15  <Field akh b>
	//   52   99:aload_2         
	//   53  100:iconst_2        
	//   54  101:iaload          
	//   55  102:i2l             
	//   56  103:invokestatic    #23  <Method Long Long.valueOf(long)>
	//   57  106:putfield        #58  <Field Long akh.N>
		akh1;
	//   58  109:aload_1         
		JVM INSTR monitorexit ;
	//   59  110:monitorexit     
		return;
	//   60  111:return          
		Exception exception;
		exception;
	//   61  112:astore_2        
		akh1;
	//   62  113:aload_1         
		JVM INSTR monitorexit ;
	//   63  114:monitorexit     
		throw exception;
	//   64  115:aload_2         
	//   65  116:athrow          
	}
}
