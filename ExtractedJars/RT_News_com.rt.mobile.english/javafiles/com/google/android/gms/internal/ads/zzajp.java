// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.Clock;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzajq, zznk, zzkb, zzni, 
//			zzajo

final class zzajp
{

	private zzajp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		mLock = new Object();
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #14  <Method void Object()>
	//    6   12:putfield        #16  <Field Object mLock>
		zzcpx = zzajq.zzcpz;
	//    7   15:aload_0         
	//    8   16:getstatic       #21  <Field int zzajq.zzcpz>
	//    9   19:putfield        #23  <Field int zzcpx>
		zzcpy = 0L;
	//   10   22:aload_0         
	//   11   23:lconst_0        
	//   12   24:putfield        #25  <Field long zzcpy>
	//   13   27:return          
	}

	zzajp(zzajo zzajo)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void zzajp()>
	//    2    4:return          
	}

	private final void zzd(int i, int j)
	{
		long l;
label0:
		{
			zzqk();
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void zzqk()>
			l = zzbv.zzer().currentTimeMillis();
	//    2    4:invokestatic    #39  <Method Clock zzbv.zzer()>
	//    3    7:invokeinterface #45  <Method long Clock.currentTimeMillis()>
	//    4   12:lstore_3        
			synchronized(mLock)
	//*   5   13:aload_0         
	//*   6   14:getfield        #16  <Field Object mLock>
	//*   7   17:astore          5
	//*   8   19:aload           5
	//*   9   21:monitorenter    
			{
				if(zzcpx == i)
					break label0;
	//   10   22:aload_0         
	//   11   23:getfield        #23  <Field int zzcpx>
	//   12   26:iload_1         
	//   13   27:icmpeq          34
			}
	//   14   30:aload           5
	//   15   32:monitorexit     
			return;
	//   16   33:return          
		}
		zzcpx = j;
	//   17   34:aload_0         
	//   18   35:iload_2         
	//   19   36:putfield        #23  <Field int zzcpx>
		if(zzcpx == zzajq.zzcqb)
	//*  20   39:aload_0         
	//*  21   40:getfield        #23  <Field int zzcpx>
	//*  22   43:getstatic       #48  <Field int zzajq.zzcqb>
	//*  23   46:icmpne          54
			zzcpy = l;
	//   24   49:aload_0         
	//   25   50:lload_3         
	//   26   51:putfield        #25  <Field long zzcpy>
		obj;
	//   27   54:aload           5
		JVM INSTR monitorexit ;
	//   28   56:monitorexit     
		return;
	//   29   57:return          
		exception;
	//   30   58:astore          6
		obj;
	//   31   60:aload           5
		JVM INSTR monitorexit ;
	//   32   62:monitorexit     
		throw exception;
	//   33   63:aload           6
	//   34   65:athrow          
	}

	private final void zzqk()
	{
		long l = zzbv.zzer().currentTimeMillis();
	//    0    0:invokestatic    #39  <Method Clock zzbv.zzer()>
	//    1    3:invokeinterface #45  <Method long Clock.currentTimeMillis()>
	//    2    8:lstore_1        
		synchronized(mLock)
	//*   3    9:aload_0         
	//*   4   10:getfield        #16  <Field Object mLock>
	//*   5   13:astore          5
	//*   6   15:aload           5
	//*   7   17:monitorenter    
		{
			if(zzcpx == zzajq.zzcqb)
	//*   8   18:aload_0         
	//*   9   19:getfield        #23  <Field int zzcpx>
	//*  10   22:getstatic       #48  <Field int zzajq.zzcqb>
	//*  11   25:icmpne          66
			{
				long l1 = zzcpy;
	//   12   28:aload_0         
	//   13   29:getfield        #25  <Field long zzcpy>
	//   14   32:lstore_3        
				zzna zzna = zznk.zzbfn;
	//   15   33:getstatic       #54  <Field zzna zznk.zzbfn>
	//   16   36:astore          6
				if(l1 + ((Long)zzkb.zzik().zzd(zzna)).longValue() <= l)
	//*  17   38:lload_3         
	//*  18   39:invokestatic    #60  <Method zzni zzkb.zzik()>
	//*  19   42:aload           6
	//*  20   44:invokevirtual   #65  <Method Object zzni.zzd(zzna)>
	//*  21   47:checkcast       #67  <Class Long>
	//*  22   50:invokevirtual   #70  <Method long Long.longValue()>
	//*  23   53:ladd            
	//*  24   54:lload_1         
	//*  25   55:lcmp            
	//*  26   56:ifgt            66
					zzcpx = zzajq.zzcpz;
	//   27   59:aload_0         
	//   28   60:getstatic       #21  <Field int zzajq.zzcpz>
	//   29   63:putfield        #23  <Field int zzcpx>
			}
		}
	//   30   66:aload           5
	//   31   68:monitorexit     
		return;
	//   32   69:return          
		exception;
	//   33   70:astore          6
		obj;
	//   34   72:aload           5
		JVM INSTR monitorexit ;
	//   35   74:monitorexit     
		throw exception;
	//   36   75:aload           6
	//   37   77:athrow          
	}

	public final void zzaa(boolean flag)
	{
		int i;
		int j;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            19
		{
			j = zzajq.zzcpz;
	//    2    4:getstatic       #21  <Field int zzajq.zzcpz>
	//    3    7:istore_3        
			i = zzajq.zzcqa;
	//    4    8:getstatic       #75  <Field int zzajq.zzcqa>
	//    5   11:istore_2        
		} else
	//*   6   12:aload_0         
	//*   7   13:iload_3         
	//*   8   14:iload_2         
	//*   9   15:invokespecial   #77  <Method void zzd(int, int)>
	//*  10   18:return          
		{
			j = zzajq.zzcqa;
	//   11   19:getstatic       #75  <Field int zzajq.zzcqa>
	//   12   22:istore_3        
			i = zzajq.zzcpz;
	//   13   23:getstatic       #21  <Field int zzajq.zzcpz>
	//   14   26:istore_2        
		}
		zzd(j, i);
	//*  15   27:goto            12
	}

	public final boolean zzqa()
	{
		zzqk();
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void zzqk()>
		return zzcpx == zzajq.zzcqa;
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field int zzcpx>
	//    4    8:getstatic       #75  <Field int zzajq.zzcqa>
	//    5   11:icmpne          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public final boolean zzqb()
	{
		zzqk();
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void zzqk()>
		return zzcpx == zzajq.zzcqb;
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field int zzcpx>
	//    4    8:getstatic       #48  <Field int zzajq.zzcqb>
	//    5   11:icmpne          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public final void zzqc()
	{
		zzd(zzajq.zzcqa, zzajq.zzcqb);
	//    0    0:aload_0         
	//    1    1:getstatic       #75  <Field int zzajq.zzcqa>
	//    2    4:getstatic       #48  <Field int zzajq.zzcqb>
	//    3    7:invokespecial   #77  <Method void zzd(int, int)>
	//    4   10:return          
	}

	private final Object mLock;
	private volatile int zzcpx;
	private volatile long zzcpy;
}
