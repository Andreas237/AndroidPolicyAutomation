// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//			zzbxn, zzae, zzbxs, zzbxt, 
//			zzbxl, zzbxm

public static final class zzae$zza extends zzbxn
{

	public static zzae$zza zzc(byte abyte0[])
		throws zzbxs
	{
		return (zzae$zza)zzbxt.zza(((zzbxt) (new zzae$zza())), abyte0);
	//    0    0:new             #2   <Class zzae$zza>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void zzae$zza()>
	//    3    7:aload_0         
	//    4    8:invokestatic    #31  <Method zzbxt zzbxt.zza(zzbxt, byte[])>
	//    5   11:checkcast       #2   <Class zzae$zza>
	//    6   14:areturn         
	}

	public zzae$zza zza(zzbxl zzbxl1)
		throws IOException
	{
		do
		{
			int i = zzbxl1.zzaeo();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #41  <Method int zzbxl.zzaeo()>
	//    2    4:istore_2        
			switch(i)
	//*   3    5:iload_2         
			{
	//*   4    6:lookupswitch    3: default 40
	//	               0: 43
	//	               10: 56
	//	               18: 85
	//*   5   40:goto            45
			case 0: // '\0'
				return this;
	//    6   43:aload_0         
	//    7   44:areturn         

			default:
				if(!super.zza(zzbxl1, i))
	//*   8   45:aload_0         
	//*   9   46:aload_1         
	//*  10   47:iload_2         
	//*  11   48:invokespecial   #44  <Method boolean zzbxn.zza(zzbxl, int)>
	//*  12   51:ifne            111
					return this;
	//   13   54:aload_0         
	//   14   55:areturn         
				break;

			case 10: // '\n'
				if(zzaK == null)
	//*  15   56:aload_0         
	//*  16   57:getfield        #46  <Field zzae$zzb zzaK>
	//*  17   60:ifnonnull       74
					zzaK = new zzae$zzb();
	//   18   63:aload_0         
	//   19   64:new             #48  <Class zzae$zzb>
	//   20   67:dup             
	//   21   68:invokespecial   #49  <Method void zzae$zzb()>
	//   22   71:putfield        #46  <Field zzae$zzb zzaK>
				zzbxl1.zza(((zzbxt) (zzaK)));
	//   23   74:aload_1         
	//   24   75:aload_0         
	//   25   76:getfield        #46  <Field zzae$zzb zzaK>
	//   26   79:invokevirtual   #52  <Method void zzbxl.zza(zzbxt)>
				break;

	//*  27   82:goto            111
			case 18: // '\022'
				if(zzaL == null)
	//*  28   85:aload_0         
	//*  29   86:getfield        #54  <Field zzae$zzc zzaL>
	//*  30   89:ifnonnull       103
					zzaL = new zzae$zzc();
	//   31   92:aload_0         
	//   32   93:new             #56  <Class zzae$zzc>
	//   33   96:dup             
	//   34   97:invokespecial   #57  <Method void zzae$zzc()>
	//   35  100:putfield        #54  <Field zzae$zzc zzaL>
				zzbxl1.zza(((zzbxt) (zzaL)));
	//   36  103:aload_1         
	//   37  104:aload_0         
	//   38  105:getfield        #54  <Field zzae$zzc zzaL>
	//   39  108:invokevirtual   #52  <Method void zzbxl.zza(zzbxt)>
				break;
			}
		} while(true);
	//   40  111:goto            0
	}

	public void zza(zzbxm zzbxm1)
		throws IOException
	{
		if(zzaK != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field zzae$zzb zzaK>
	//*   2    4:ifnull          16
			zzbxm1.zza(1, ((zzbxt) (zzaK)));
	//    3    7:aload_1         
	//    4    8:iconst_1        
	//    5    9:aload_0         
	//    6   10:getfield        #46  <Field zzae$zzb zzaK>
	//    7   13:invokevirtual   #63  <Method void zzbxm.zza(int, zzbxt)>
		if(zzaL != null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #54  <Field zzae$zzc zzaL>
	//*  10   20:ifnull          32
			zzbxm1.zza(2, ((zzbxt) (zzaL)));
	//   11   23:aload_1         
	//   12   24:iconst_2        
	//   13   25:aload_0         
	//   14   26:getfield        #54  <Field zzae$zzc zzaL>
	//   15   29:invokevirtual   #63  <Method void zzbxm.zza(int, zzbxt)>
		super.zza(zzbxm1);
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:invokespecial   #65  <Method void zzbxn.zza(zzbxm)>
	//   19   37:return          
	}

	public zzbxt zzb(zzbxl zzbxl1)
		throws IOException
	{
		return ((zzbxt) (zza(zzbxl1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #69  <Method zzae$zza zza(zzbxl)>
	//    3    5:areturn         
	}

	protected int zzu()
	{
		int j = super.zzu();
	//    0    0:aload_0         
	//    1    1:invokespecial   #72  <Method int zzbxn.zzu()>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(zzaK != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #46  <Field zzae$zzb zzaK>
	//*   7   11:ifnull          25
			i = j + zzbxm.zzc(1, ((zzbxt) (zzaK)));
	//    8   14:iload_2         
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #46  <Field zzae$zzb zzaK>
	//   12   20:invokestatic    #75  <Method int zzbxm.zzc(int, zzbxt)>
	//   13   23:iadd            
	//   14   24:istore_1        
		j = i;
	//   15   25:iload_1         
	//   16   26:istore_2        
		if(zzaL != null)
	//*  17   27:aload_0         
	//*  18   28:getfield        #54  <Field zzae$zzc zzaL>
	//*  19   31:ifnull          45
			j = i + zzbxm.zzc(2, ((zzbxt) (zzaL)));
	//   20   34:iload_1         
	//   21   35:iconst_2        
	//   22   36:aload_0         
	//   23   37:getfield        #54  <Field zzae$zzc zzaL>
	//   24   40:invokestatic    #75  <Method int zzbxm.zzc(int, zzbxt)>
	//   25   43:iadd            
	//   26   44:istore_2        
		return j;
	//   27   45:iload_2         
	//   28   46:ireturn         
	}

	public zzae$zzb zzaK;
	public zzae$zzc zzaL;

	public zzae$zza()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void zzbxn()>
		zzcuR = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #20  <Field int zzcuR>
	//    5    9:return          
	}
}
