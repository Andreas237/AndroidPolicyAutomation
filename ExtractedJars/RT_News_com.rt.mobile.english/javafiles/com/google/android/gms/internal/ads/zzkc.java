// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Random;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzlh

public final class zzkc extends zzlh
{

	public zzkc()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void zzlh()>
		mLock = new Object();
	//    2    4:aload_0         
	//    3    5:new             #17  <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void Object()>
	//    6   12:putfield        #20  <Field Object mLock>
	//    7   15:aload_0         
	//    8   16:new             #22  <Class Random>
	//    9   19:dup             
	//   10   20:invokespecial   #23  <Method void Random()>
	//   11   23:putfield        #25  <Field Random zzasg>
		zzil();
	//   12   26:aload_0         
	//   13   27:invokevirtual   #28  <Method void zzil()>
	//   14   30:return          
	}

	public final long getValue()
	{
		return zzash;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field long zzash>
	//    2    4:lreturn         
	}

	public final void zzil()
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Object mLock>
	//    2    4:astore          4
		obj;
	//    3    6:aload           4
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		int i;
		long l;
		i = 3;
	//    5    9:iconst_3        
	//    6   10:istore_1        
		l = 0L;
	//    7   11:lconst_0        
	//    8   12:lstore_2        
_L2:
		i--;
	//    9   13:iload_1         
	//   10   14:iconst_1        
	//   11   15:isub            
	//   12   16:istore_1        
		if(i <= 0)
			break; /* Loop/switch isn't completed */
	//   13   17:iload_1         
	//   14   18:ifle            52
		l = (long)zzasg.nextInt() + 0x80000000L;
	//   15   21:aload_0         
	//   16   22:getfield        #25  <Field Random zzasg>
	//   17   25:invokevirtual   #37  <Method int Random.nextInt()>
	//   18   28:i2l             
	//   19   29:ldc2w           #38  <Long 0x80000000L>
	//   20   32:ladd            
	//   21   33:lstore_2        
		if(l == zzash || l == 0L) goto _L2; else goto _L1
	//   22   34:lload_2         
	//   23   35:aload_0         
	//   24   36:getfield        #33  <Field long zzash>
	//   25   39:lcmp            
	//   26   40:ifeq            67
	//   27   43:lload_2         
	//   28   44:lconst_0        
	//   29   45:lcmp            
	//   30   46:ifeq            67
	//*  31   49:goto            52
_L1:
		zzash = l;
	//   32   52:aload_0         
	//   33   53:lload_2         
	//   34   54:putfield        #33  <Field long zzash>
		obj;
	//   35   57:aload           4
		JVM INSTR monitorexit ;
	//   36   59:monitorexit     
		return;
	//   37   60:return          
_L4:
		obj;
	//   38   61:aload           4
		JVM INSTR monitorexit ;
	//   39   63:monitorexit     
		Exception exception;
		throw exception;
	//   40   64:aload           5
	//   41   66:athrow          
	//*  42   67:goto            13
		exception;
	//   43   70:astore          5
		if(true) goto _L4; else goto _L3
	//   44   72:goto            61
_L3:
	}

	private Object mLock;
	private final Random zzasg = new Random();
	private long zzash;
}
