// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//			zzbxn, zzae, zzbxm, zzbxl, 
//			zzbxt

public static final class zzae$zzb extends zzbxn
{

	public void zza(zzbxm zzbxm1)
		throws IOException
	{
		if(zzaM != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field Integer zzaM>
	//*   2    4:ifnull          20
			zzbxm1.zzJ(27, zzaM.intValue());
	//    3    7:aload_1         
	//    4    8:bipush          27
	//    5   10:aload_0         
	//    6   11:getfield        #16  <Field Integer zzaM>
	//    7   14:invokevirtual   #31  <Method int Integer.intValue()>
	//    8   17:invokevirtual   #37  <Method void zzbxm.zzJ(int, int)>
		super.zza(zzbxm1);
	//    9   20:aload_0         
	//   10   21:aload_1         
	//   11   22:invokespecial   #39  <Method void zzbxn.zza(zzbxm)>
	//   12   25:return          
	}

	public zzbxt zzb(zzbxl zzbxl1)
		throws IOException
	{
		return ((zzbxt) (zzc(zzbxl1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #45  <Method zzae$zzb zzc(zzbxl)>
	//    3    5:areturn         
	}

	public zzae$zzb zzc(zzbxl zzbxl1)
		throws IOException
	{
_L5:
		int i = zzbxl1.zzaeo();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #50  <Method int zzbxl.zzaeo()>
	//    2    4:istore_2        
		i;
	//    3    5:iload_2         
		JVM INSTR lookupswitch 2: default 32
	//	               0: 35
	//	               216: 48;
	//    4    6:lookupswitch    2: default 32
	//	               0: 35
	//	               216: 48
		   goto _L1 _L2 _L3
	//*   5   32:goto            37
_L2:
		return this;
	//    6   35:aload_0         
	//    7   36:areturn         
_L1:
		if(super.zza(zzbxl1, i)) goto _L5; else goto _L4
	//    8   37:aload_0         
	//    9   38:aload_1         
	//   10   39:iload_2         
	//   11   40:invokespecial   #53  <Method boolean zzbxn.zza(zzbxl, int)>
	//   12   43:ifne            99
_L4:
		return this;
	//   13   46:aload_0         
	//   14   47:areturn         
_L3:
		int j = zzbxl1.zzaes();
	//   15   48:aload_1         
	//   16   49:invokevirtual   #56  <Method int zzbxl.zzaes()>
	//   17   52:istore_2        
		switch(j)
	//*  18   53:iload_2         
		{
	//*  19   54:tableswitch     0 4: default 88
	//	               0 91
	//	               1 91
	//	               2 91
	//	               3 91
	//	               4 91
	//*  20   88:goto            99
		case 0: // '\0'
		case 1: // '\001'
		case 2: // '\002'
		case 3: // '\003'
		case 4: // '\004'
			zzaM = Integer.valueOf(j);
	//   21   91:aload_0         
	//   22   92:iload_2         
	//   23   93:invokestatic    #60  <Method Integer Integer.valueOf(int)>
	//   24   96:putfield        #16  <Field Integer zzaM>
			break;
		}
		if(true) goto _L5; else goto _L6
_L6:
	//*  25   99:goto            0
	}

	protected int zzu()
	{
		int j = super.zzu();
	//    0    0:aload_0         
	//    1    1:invokespecial   #63  <Method int zzbxn.zzu()>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(zzaM != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #16  <Field Integer zzaM>
	//*   7   11:ifnull          29
			i = j + zzbxm.zzL(27, zzaM.intValue());
	//    8   14:iload_2         
	//    9   15:bipush          27
	//   10   17:aload_0         
	//   11   18:getfield        #16  <Field Integer zzaM>
	//   12   21:invokevirtual   #31  <Method int Integer.intValue()>
	//   13   24:invokestatic    #67  <Method int zzbxm.zzL(int, int)>
	//   14   27:iadd            
	//   15   28:istore_1        
		return i;
	//   16   29:iload_1         
	//   17   30:ireturn         
	}

	public Integer zzaM;

	public zzae$zzb()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void zzbxn()>
		zzaM = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #16  <Field Integer zzaM>
		zzcuR = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #20  <Field int zzcuR>
	//    8   14:return          
	}
}
