// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zzjn, zzjk, zzjl, zzjt

public final class zzdh extends zzjn
{

	public zzdh()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void zzjn()>
		zzod = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #14  <Field String zzod>
		version = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #16  <Field String version>
		zzadp = -1;
	//    8   14:aload_0         
	//    9   15:iconst_m1       
	//   10   16:putfield        #20  <Field int zzadp>
	//   11   19:return          
	}

	public final zzjt zza(zzjk zzjk1)
		throws IOException
	{
		do
		{
			int i = zzjk1.zzdq();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #31  <Method int zzjk.zzdq()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            54
			if(i != 10)
	//*   5    9:iload_2         
	//*   6   10:bipush          10
	//*   7   12:icmpeq          43
			{
				if(i != 18)
	//*   8   15:iload_2         
	//*   9   16:bipush          18
	//*  10   18:icmpeq          32
				{
					if(!super.zza(zzjk1, i))
	//*  11   21:aload_0         
	//*  12   22:aload_1         
	//*  13   23:iload_2         
	//*  14   24:invokespecial   #34  <Method boolean zzjn.zza(zzjk, int)>
	//*  15   27:ifne            0
						return ((zzjt) (this));
	//   16   30:aload_0         
	//   17   31:areturn         
				} else
				{
					version = zzjk1.readString();
	//   18   32:aload_0         
	//   19   33:aload_1         
	//   20   34:invokevirtual   #38  <Method String zzjk.readString()>
	//   21   37:putfield        #16  <Field String version>
				}
			} else
	//*  22   40:goto            0
			{
				zzod = zzjk1.readString();
	//   23   43:aload_0         
	//   24   44:aload_1         
	//   25   45:invokevirtual   #38  <Method String zzjk.readString()>
	//   26   48:putfield        #14  <Field String zzod>
			}
		} while(true);
	//   27   51:goto            0
		return ((zzjt) (this));
	//   28   54:aload_0         
	//   29   55:areturn         
	}

	public final void zza(zzjl zzjl1)
		throws IOException
	{
		String s = zzod;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field String zzod>
	//    2    4:astore_2        
		if(s != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
			zzjl1.zza(1, s);
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:aload_2         
	//    8   12:invokevirtual   #45  <Method void zzjl.zza(int, String)>
		s = version;
	//    9   15:aload_0         
	//   10   16:getfield        #16  <Field String version>
	//   11   19:astore_2        
		if(s != null)
	//*  12   20:aload_2         
	//*  13   21:ifnull          30
			zzjl1.zza(2, s);
	//   14   24:aload_1         
	//   15   25:iconst_2        
	//   16   26:aload_2         
	//   17   27:invokevirtual   #45  <Method void zzjl.zza(int, String)>
		super.zza(zzjl1);
	//   18   30:aload_0         
	//   19   31:aload_1         
	//   20   32:invokespecial   #47  <Method void zzjn.zza(zzjl)>
	//   21   35:return          
	}

	protected final int zzt()
	{
		int j = super.zzt();
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method int zzjn.zzt()>
	//    2    4:istore_2        
		String s = zzod;
	//    3    5:aload_0         
	//    4    6:getfield        #14  <Field String zzod>
	//    5    9:astore_3        
		int i = j;
	//    6   10:iload_2         
	//    7   11:istore_1        
		if(s != null)
	//*   8   12:aload_3         
	//*   9   13:ifnull          24
			i = j + zzjl.zzb(1, s);
	//   10   16:iload_2         
	//   11   17:iconst_1        
	//   12   18:aload_3         
	//   13   19:invokestatic    #54  <Method int zzjl.zzb(int, String)>
	//   14   22:iadd            
	//   15   23:istore_1        
		s = version;
	//   16   24:aload_0         
	//   17   25:getfield        #16  <Field String version>
	//   18   28:astore_3        
		j = i;
	//   19   29:iload_1         
	//   20   30:istore_2        
		if(s != null)
	//*  21   31:aload_3         
	//*  22   32:ifnull          43
			j = i + zzjl.zzb(2, s);
	//   23   35:iload_1         
	//   24   36:iconst_2        
	//   25   37:aload_3         
	//   26   38:invokestatic    #54  <Method int zzjl.zzb(int, String)>
	//   27   41:iadd            
	//   28   42:istore_2        
		return j;
	//   29   43:iload_2         
	//   30   44:ireturn         
	}

	public String version;
	public String zzod;
}
