// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzei, zzba, zzcz

public final class zzdp extends zzei
{

	public zzdp(zzcz zzcz1, String s, String s1, zzba zzba1, int i, int j)
	{
		super(zzcz1, s, s1, zzba1, i, 5);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:iload           5
	//    6    8:iconst_5        
	//    7    9:invokespecial   #8   <Method void zzei(zzcz, String, String, zzba, int, int)>
	//    8   12:return          
	}

	protected final void zzar()
		throws IllegalAccessException, InvocationTargetException
	{
		int ai[];
		zztq.zzdf = Long.valueOf(-1L);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zzba zztq>
	//    2    4:ldc2w           #20  <Long -1L>
	//    3    7:invokestatic    #27  <Method Long Long.valueOf(long)>
	//    4   10:putfield        #33  <Field Long zzba.zzdf>
		zztq.zzdg = Long.valueOf(-1L);
	//    5   13:aload_0         
	//    6   14:getfield        #19  <Field zzba zztq>
	//    7   17:ldc2w           #20  <Long -1L>
	//    8   20:invokestatic    #27  <Method Long Long.valueOf(long)>
	//    9   23:putfield        #36  <Field Long zzba.zzdg>
		ai = (int[])zztz.invoke(((Object) (null)), new Object[] {
			zzps.getContext()
		});
	//   10   26:aload_0         
	//   11   27:getfield        #40  <Field Method zztz>
	//   12   30:aconst_null     
	//   13   31:iconst_1        
	//   14   32:anewarray       Object[]
	//   15   35:dup             
	//   16   36:iconst_0        
	//   17   37:aload_0         
	//   18   38:getfield        #46  <Field zzcz zzps>
	//   19   41:invokevirtual   #52  <Method android.content.Context zzcz.getContext()>
	//   20   44:aastore         
	//   21   45:invokevirtual   #58  <Method Object Method.invoke(Object, Object[])>
	//   22   48:checkcast       #60  <Class int[]>
	//   23   51:astore_2        
		zzba zzba1 = zztq;
	//   24   52:aload_0         
	//   25   53:getfield        #19  <Field zzba zztq>
	//   26   56:astore_1        
		zzba1;
	//   27   57:aload_1         
		JVM INSTR monitorenter ;
	//   28   58:monitorenter    
		zztq.zzdf = Long.valueOf(ai[0]);
	//   29   59:aload_0         
	//   30   60:getfield        #19  <Field zzba zztq>
	//   31   63:aload_2         
	//   32   64:iconst_0        
	//   33   65:iaload          
	//   34   66:i2l             
	//   35   67:invokestatic    #27  <Method Long Long.valueOf(long)>
	//   36   70:putfield        #33  <Field Long zzba.zzdf>
		zztq.zzdg = Long.valueOf(ai[1]);
	//   37   73:aload_0         
	//   38   74:getfield        #19  <Field zzba zztq>
	//   39   77:aload_2         
	//   40   78:iconst_1        
	//   41   79:iaload          
	//   42   80:i2l             
	//   43   81:invokestatic    #27  <Method Long Long.valueOf(long)>
	//   44   84:putfield        #36  <Field Long zzba.zzdg>
		if(ai[2] == 0x80000000)
			break MISSING_BLOCK_LABEL_109;
	//   45   87:aload_2         
	//   46   88:iconst_2        
	//   47   89:iaload          
	//   48   90:ldc1            #61  <Int 0x80000000>
	//   49   92:icmpeq          109
		zztq.zzex = Long.valueOf(ai[2]);
	//   50   95:aload_0         
	//   51   96:getfield        #19  <Field zzba zztq>
	//   52   99:aload_2         
	//   53  100:iconst_2        
	//   54  101:iaload          
	//   55  102:i2l             
	//   56  103:invokestatic    #27  <Method Long Long.valueOf(long)>
	//   57  106:putfield        #64  <Field Long zzba.zzex>
		zzba1;
	//   58  109:aload_1         
		JVM INSTR monitorexit ;
	//   59  110:monitorexit     
		return;
	//   60  111:return          
		Exception exception;
		exception;
	//   61  112:astore_2        
		zzba1;
	//   62  113:aload_1         
		JVM INSTR monitorexit ;
	//   63  114:monitorexit     
		throw exception;
	//   64  115:aload_2         
	//   65  116:athrow          
	}
}
