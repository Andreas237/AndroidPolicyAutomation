// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zzjn, zzjr, zzjk, zzjl, 
//			zzjt

public final class zzds extends zzjn
{

	public zzds()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void zzjn()>
		zzpv = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #16  <Field Integer zzpv>
		zzpw = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #18  <Field Integer zzpw>
		zzadp = -1;
	//    8   14:aload_0         
	//    9   15:iconst_m1       
	//   10   16:putfield        #22  <Field int zzadp>
	//   11   19:return          
	}

	public static zzds[] zzcc()
	{
		if(zzpu == null)
	//*   0    0:getstatic       #27  <Field zzds[] zzpu>
	//*   1    3:ifnonnull       35
			synchronized(zzjr.zzado)
	//*   2    6:getstatic       #33  <Field Object zzjr.zzado>
	//*   3    9:astore_0        
	//*   4   10:aload_0         
	//*   5   11:monitorenter    
			{
				if(zzpu == null)
	//*   6   12:getstatic       #27  <Field zzds[] zzpu>
	//*   7   15:ifnonnull       25
					zzpu = new zzds[0];
	//    8   18:iconst_0        
	//    9   19:anewarray       zzds[]
	//   10   22:putstatic       #27  <Field zzds[] zzpu>
			}
	//   11   25:aload_0         
	//   12   26:monitorexit     
		break MISSING_BLOCK_LABEL_35;
	//   13   27:goto            35
		exception;
	//   14   30:astore_1        
		obj;
	//   15   31:aload_0         
		JVM INSTR monitorexit ;
	//   16   32:monitorexit     
		throw exception;
	//   17   33:aload_1         
	//   18   34:athrow          
		return zzpu;
	//   19   35:getstatic       #27  <Field zzds[] zzpu>
	//   20   38:areturn         
	}

	public final zzjt zza(zzjk zzjk1)
		throws IOException
	{
		do
		{
			int i = zzjk1.zzdq();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #43  <Method int zzjk.zzdq()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            60
			if(i != 8)
	//*   5    9:iload_2         
	//*   6   10:bipush          8
	//*   7   12:icmpeq          46
			{
				if(i != 16)
	//*   8   15:iload_2         
	//*   9   16:bipush          16
	//*  10   18:icmpeq          32
				{
					if(!super.zza(zzjk1, i))
	//*  11   21:aload_0         
	//*  12   22:aload_1         
	//*  13   23:iload_2         
	//*  14   24:invokespecial   #46  <Method boolean zzjn.zza(zzjk, int)>
	//*  15   27:ifne            0
						return ((zzjt) (this));
	//   16   30:aload_0         
	//   17   31:areturn         
				} else
				{
					zzpw = Integer.valueOf(zzjk1.zzdt());
	//   18   32:aload_0         
	//   19   33:aload_1         
	//   20   34:invokevirtual   #49  <Method int zzjk.zzdt()>
	//   21   37:invokestatic    #55  <Method Integer Integer.valueOf(int)>
	//   22   40:putfield        #18  <Field Integer zzpw>
				}
			} else
	//*  23   43:goto            0
			{
				zzpv = Integer.valueOf(zzjk1.zzdt());
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:invokevirtual   #49  <Method int zzjk.zzdt()>
	//   27   51:invokestatic    #55  <Method Integer Integer.valueOf(int)>
	//   28   54:putfield        #16  <Field Integer zzpv>
			}
		} while(true);
	//   29   57:goto            0
		return ((zzjt) (this));
	//   30   60:aload_0         
	//   31   61:areturn         
	}

	public final void zza(zzjl zzjl1)
		throws IOException
	{
		Integer integer = zzpv;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Integer zzpv>
	//    2    4:astore_2        
		if(integer != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          18
			zzjl1.zze(1, integer.intValue());
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:aload_2         
	//    8   12:invokevirtual   #60  <Method int Integer.intValue()>
	//    9   15:invokevirtual   #66  <Method void zzjl.zze(int, int)>
		integer = zzpw;
	//   10   18:aload_0         
	//   11   19:getfield        #18  <Field Integer zzpw>
	//   12   22:astore_2        
		if(integer != null)
	//*  13   23:aload_2         
	//*  14   24:ifnull          36
			zzjl1.zze(2, integer.intValue());
	//   15   27:aload_1         
	//   16   28:iconst_2        
	//   17   29:aload_2         
	//   18   30:invokevirtual   #60  <Method int Integer.intValue()>
	//   19   33:invokevirtual   #66  <Method void zzjl.zze(int, int)>
		super.zza(zzjl1);
	//   20   36:aload_0         
	//   21   37:aload_1         
	//   22   38:invokespecial   #68  <Method void zzjn.zza(zzjl)>
	//   23   41:return          
	}

	protected final int zzt()
	{
		int j = super.zzt();
	//    0    0:aload_0         
	//    1    1:invokespecial   #71  <Method int zzjn.zzt()>
	//    2    4:istore_2        
		Integer integer = zzpv;
	//    3    5:aload_0         
	//    4    6:getfield        #16  <Field Integer zzpv>
	//    5    9:astore_3        
		int i = j;
	//    6   10:iload_2         
	//    7   11:istore_1        
		if(integer != null)
	//*   8   12:aload_3         
	//*   9   13:ifnull          27
			i = j + zzjl.zzi(1, integer.intValue());
	//   10   16:iload_2         
	//   11   17:iconst_1        
	//   12   18:aload_3         
	//   13   19:invokevirtual   #60  <Method int Integer.intValue()>
	//   14   22:invokestatic    #75  <Method int zzjl.zzi(int, int)>
	//   15   25:iadd            
	//   16   26:istore_1        
		integer = zzpw;
	//   17   27:aload_0         
	//   18   28:getfield        #18  <Field Integer zzpw>
	//   19   31:astore_3        
		j = i;
	//   20   32:iload_1         
	//   21   33:istore_2        
		if(integer != null)
	//*  22   34:aload_3         
	//*  23   35:ifnull          49
			j = i + zzjl.zzi(2, integer.intValue());
	//   24   38:iload_1         
	//   25   39:iconst_2        
	//   26   40:aload_3         
	//   27   41:invokevirtual   #60  <Method int Integer.intValue()>
	//   28   44:invokestatic    #75  <Method int zzjl.zzi(int, int)>
	//   29   47:iadd            
	//   30   48:istore_2        
		return j;
	//   31   49:iload_2         
	//   32   50:ireturn         
	}

	private static volatile zzds zzpu[];
	public Integer zzpv;
	public Integer zzpw;
}
