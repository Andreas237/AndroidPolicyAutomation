// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zzjn, zzjr, zzjk, zzdj, 
//			zzdo, zzdk, zzjl, zzjt

public final class zzdt extends zzjn
{

	public zzdt()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void zzjn()>
		zzpy = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #21  <Field zzdk zzpy>
		zzpz = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #23  <Field Integer zzpz>
		zzqa = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #25  <Field zzdo zzqa>
		zzqb = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #27  <Field zzdj zzqb>
		zzadp = -1;
	//   14   24:aload_0         
	//   15   25:iconst_m1       
	//   16   26:putfield        #31  <Field int zzadp>
	//   17   29:return          
	}

	public static zzdt[] zzcd()
	{
		if(zzpx == null)
	//*   0    0:getstatic       #36  <Field zzdt[] zzpx>
	//*   1    3:ifnonnull       35
			synchronized(zzjr.zzado)
	//*   2    6:getstatic       #42  <Field Object zzjr.zzado>
	//*   3    9:astore_0        
	//*   4   10:aload_0         
	//*   5   11:monitorenter    
			{
				if(zzpx == null)
	//*   6   12:getstatic       #36  <Field zzdt[] zzpx>
	//*   7   15:ifnonnull       25
					zzpx = new zzdt[0];
	//    8   18:iconst_0        
	//    9   19:anewarray       zzdt[]
	//   10   22:putstatic       #36  <Field zzdt[] zzpx>
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
		return zzpx;
	//   19   35:getstatic       #36  <Field zzdt[] zzpx>
	//   20   38:areturn         
	}

	public final zzjt zza(zzjk zzjk1)
		throws IOException
	{
		do
		{
			int i = zzjk1.zzdq();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #52  <Method int zzjk.zzdq()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            147
			if(i != 10)
	//*   5    9:iload_2         
	//*   6   10:bipush          10
	//*   7   12:icmpeq          118
			{
				if(i != 16)
	//*   8   15:iload_2         
	//*   9   16:bipush          16
	//*  10   18:icmpeq          104
				{
					if(i != 130)
	//*  11   21:iload_2         
	//*  12   22:sipush          130
	//*  13   25:icmpeq          75
					{
						if(i != 138)
	//*  14   28:iload_2         
	//*  15   29:sipush          138
	//*  16   32:icmpeq          46
						{
							if(!super.zza(zzjk1, i))
	//*  17   35:aload_0         
	//*  18   36:aload_1         
	//*  19   37:iload_2         
	//*  20   38:invokespecial   #55  <Method boolean zzjn.zza(zzjk, int)>
	//*  21   41:ifne            0
								return ((zzjt) (this));
	//   22   44:aload_0         
	//   23   45:areturn         
						} else
						{
							if(zzqb == null)
	//*  24   46:aload_0         
	//*  25   47:getfield        #27  <Field zzdj zzqb>
	//*  26   50:ifnonnull       64
								zzqb = new zzdj();
	//   27   53:aload_0         
	//   28   54:new             #57  <Class zzdj>
	//   29   57:dup             
	//   30   58:invokespecial   #58  <Method void zzdj()>
	//   31   61:putfield        #27  <Field zzdj zzqb>
							zzjk1.zza(((zzjt) (zzqb)));
	//   32   64:aload_1         
	//   33   65:aload_0         
	//   34   66:getfield        #27  <Field zzdj zzqb>
	//   35   69:invokevirtual   #61  <Method void zzjk.zza(zzjt)>
						}
					} else
	//*  36   72:goto            0
					{
						if(zzqa == null)
	//*  37   75:aload_0         
	//*  38   76:getfield        #25  <Field zzdo zzqa>
	//*  39   79:ifnonnull       93
							zzqa = new zzdo();
	//   40   82:aload_0         
	//   41   83:new             #63  <Class zzdo>
	//   42   86:dup             
	//   43   87:invokespecial   #64  <Method void zzdo()>
	//   44   90:putfield        #25  <Field zzdo zzqa>
						zzjk1.zza(((zzjt) (zzqa)));
	//   45   93:aload_1         
	//   46   94:aload_0         
	//   47   95:getfield        #25  <Field zzdo zzqa>
	//   48   98:invokevirtual   #61  <Method void zzjk.zza(zzjt)>
					}
				} else
	//*  49  101:goto            0
				{
					zzpz = Integer.valueOf(zzjk1.zzdt());
	//   50  104:aload_0         
	//   51  105:aload_1         
	//   52  106:invokevirtual   #67  <Method int zzjk.zzdt()>
	//   53  109:invokestatic    #73  <Method Integer Integer.valueOf(int)>
	//   54  112:putfield        #23  <Field Integer zzpz>
				}
			} else
	//*  55  115:goto            0
			{
				if(zzpy == null)
	//*  56  118:aload_0         
	//*  57  119:getfield        #21  <Field zzdk zzpy>
	//*  58  122:ifnonnull       136
					zzpy = new zzdk();
	//   59  125:aload_0         
	//   60  126:new             #75  <Class zzdk>
	//   61  129:dup             
	//   62  130:invokespecial   #76  <Method void zzdk()>
	//   63  133:putfield        #21  <Field zzdk zzpy>
				zzjk1.zza(((zzjt) (zzpy)));
	//   64  136:aload_1         
	//   65  137:aload_0         
	//   66  138:getfield        #21  <Field zzdk zzpy>
	//   67  141:invokevirtual   #61  <Method void zzjk.zza(zzjt)>
			}
		} while(true);
	//   68  144:goto            0
		return ((zzjt) (this));
	//   69  147:aload_0         
	//   70  148:areturn         
	}

	public final void zza(zzjl zzjl1)
		throws IOException
	{
		Object obj = ((Object) (zzpy));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzdk zzpy>
	//    2    4:astore_2        
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
			zzjl1.zza(1, ((zzjt) (obj)));
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:aload_2         
	//    8   12:invokevirtual   #83  <Method void zzjl.zza(int, zzjt)>
		obj = ((Object) (zzpz));
	//    9   15:aload_0         
	//   10   16:getfield        #23  <Field Integer zzpz>
	//   11   19:astore_2        
		if(obj != null)
	//*  12   20:aload_2         
	//*  13   21:ifnull          33
			zzjl1.zze(2, ((Integer) (obj)).intValue());
	//   14   24:aload_1         
	//   15   25:iconst_2        
	//   16   26:aload_2         
	//   17   27:invokevirtual   #86  <Method int Integer.intValue()>
	//   18   30:invokevirtual   #90  <Method void zzjl.zze(int, int)>
		obj = ((Object) (zzqa));
	//   19   33:aload_0         
	//   20   34:getfield        #25  <Field zzdo zzqa>
	//   21   37:astore_2        
		if(obj != null)
	//*  22   38:aload_2         
	//*  23   39:ifnull          49
			zzjl1.zza(16, ((zzjt) (obj)));
	//   24   42:aload_1         
	//   25   43:bipush          16
	//   26   45:aload_2         
	//   27   46:invokevirtual   #83  <Method void zzjl.zza(int, zzjt)>
		obj = ((Object) (zzqb));
	//   28   49:aload_0         
	//   29   50:getfield        #27  <Field zzdj zzqb>
	//   30   53:astore_2        
		if(obj != null)
	//*  31   54:aload_2         
	//*  32   55:ifnull          65
			zzjl1.zza(17, ((zzjt) (obj)));
	//   33   58:aload_1         
	//   34   59:bipush          17
	//   35   61:aload_2         
	//   36   62:invokevirtual   #83  <Method void zzjl.zza(int, zzjt)>
		super.zza(zzjl1);
	//   37   65:aload_0         
	//   38   66:aload_1         
	//   39   67:invokespecial   #92  <Method void zzjn.zza(zzjl)>
	//   40   70:return          
	}

	protected final int zzt()
	{
		int j = super.zzt();
	//    0    0:aload_0         
	//    1    1:invokespecial   #95  <Method int zzjn.zzt()>
	//    2    4:istore_2        
		Object obj = ((Object) (zzpy));
	//    3    5:aload_0         
	//    4    6:getfield        #21  <Field zzdk zzpy>
	//    5    9:astore_3        
		int i = j;
	//    6   10:iload_2         
	//    7   11:istore_1        
		if(obj != null)
	//*   8   12:aload_3         
	//*   9   13:ifnull          24
			i = j + zzjl.zzb(1, ((zzjt) (obj)));
	//   10   16:iload_2         
	//   11   17:iconst_1        
	//   12   18:aload_3         
	//   13   19:invokestatic    #99  <Method int zzjl.zzb(int, zzjt)>
	//   14   22:iadd            
	//   15   23:istore_1        
		obj = ((Object) (zzpz));
	//   16   24:aload_0         
	//   17   25:getfield        #23  <Field Integer zzpz>
	//   18   28:astore_3        
		j = i;
	//   19   29:iload_1         
	//   20   30:istore_2        
		if(obj != null)
	//*  21   31:aload_3         
	//*  22   32:ifnull          46
			j = i + zzjl.zzi(2, ((Integer) (obj)).intValue());
	//   23   35:iload_1         
	//   24   36:iconst_2        
	//   25   37:aload_3         
	//   26   38:invokevirtual   #86  <Method int Integer.intValue()>
	//   27   41:invokestatic    #103 <Method int zzjl.zzi(int, int)>
	//   28   44:iadd            
	//   29   45:istore_2        
		obj = ((Object) (zzqa));
	//   30   46:aload_0         
	//   31   47:getfield        #25  <Field zzdo zzqa>
	//   32   50:astore_3        
		i = j;
	//   33   51:iload_2         
	//   34   52:istore_1        
		if(obj != null)
	//*  35   53:aload_3         
	//*  36   54:ifnull          66
			i = j + zzjl.zzb(16, ((zzjt) (obj)));
	//   37   57:iload_2         
	//   38   58:bipush          16
	//   39   60:aload_3         
	//   40   61:invokestatic    #99  <Method int zzjl.zzb(int, zzjt)>
	//   41   64:iadd            
	//   42   65:istore_1        
		obj = ((Object) (zzqb));
	//   43   66:aload_0         
	//   44   67:getfield        #27  <Field zzdj zzqb>
	//   45   70:astore_3        
		j = i;
	//   46   71:iload_1         
	//   47   72:istore_2        
		if(obj != null)
	//*  48   73:aload_3         
	//*  49   74:ifnull          86
			j = i + zzjl.zzb(17, ((zzjt) (obj)));
	//   50   77:iload_1         
	//   51   78:bipush          17
	//   52   80:aload_3         
	//   53   81:invokestatic    #99  <Method int zzjl.zzb(int, zzjt)>
	//   54   84:iadd            
	//   55   85:istore_2        
		return j;
	//   56   86:iload_2         
	//   57   87:ireturn         
	}

	private static volatile zzdt zzpx[];
	public zzdk zzpy;
	public Integer zzpz;
	public zzdo zzqa;
	private zzdj zzqb;
}
