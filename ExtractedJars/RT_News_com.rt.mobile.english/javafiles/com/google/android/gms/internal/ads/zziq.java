// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbfc, zzbez, zzbfa, zzbfi

public final class zziq extends zzbfc
{

	public zziq()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void zzbfc()>
		zzaon = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #14  <Field Integer zzaon>
		zzaoo = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #16  <Field Integer zzaoo>
		zzebk = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #20  <Field zzbfe zzebk>
		zzebt = -1;
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #24  <Field int zzebt>
	//   14   24:return          
	}

	public final zzbfi zza(zzbez zzbez1)
		throws IOException
	{
		do
		{
			int i = zzbez1.zzabk();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #35  <Method int zzbez.zzabk()>
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
					if(!super.zza(zzbez1, i))
	//*  11   21:aload_0         
	//*  12   22:aload_1         
	//*  13   23:iload_2         
	//*  14   24:invokespecial   #38  <Method boolean zzbfc.zza(zzbez, int)>
	//*  15   27:ifne            0
						return ((zzbfi) (this));
	//   16   30:aload_0         
	//   17   31:areturn         
				} else
				{
					zzaoo = Integer.valueOf(zzbez1.zzacc());
	//   18   32:aload_0         
	//   19   33:aload_1         
	//   20   34:invokevirtual   #41  <Method int zzbez.zzacc()>
	//   21   37:invokestatic    #47  <Method Integer Integer.valueOf(int)>
	//   22   40:putfield        #16  <Field Integer zzaoo>
				}
			} else
	//*  23   43:goto            0
			{
				zzaon = Integer.valueOf(zzbez1.zzacc());
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:invokevirtual   #41  <Method int zzbez.zzacc()>
	//   27   51:invokestatic    #47  <Method Integer Integer.valueOf(int)>
	//   28   54:putfield        #14  <Field Integer zzaon>
			}
		} while(true);
	//   29   57:goto            0
		return ((zzbfi) (this));
	//   30   60:aload_0         
	//   31   61:areturn         
	}

	public final void zza(zzbfa zzbfa1)
		throws IOException
	{
		if(zzaon != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field Integer zzaon>
	//*   2    4:ifnull          19
			zzbfa1.zzm(1, zzaon.intValue());
	//    3    7:aload_1         
	//    4    8:iconst_1        
	//    5    9:aload_0         
	//    6   10:getfield        #14  <Field Integer zzaon>
	//    7   13:invokevirtual   #52  <Method int Integer.intValue()>
	//    8   16:invokevirtual   #58  <Method void zzbfa.zzm(int, int)>
		if(zzaoo != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #16  <Field Integer zzaoo>
	//*  11   23:ifnull          38
			zzbfa1.zzm(2, zzaoo.intValue());
	//   12   26:aload_1         
	//   13   27:iconst_2        
	//   14   28:aload_0         
	//   15   29:getfield        #16  <Field Integer zzaoo>
	//   16   32:invokevirtual   #52  <Method int Integer.intValue()>
	//   17   35:invokevirtual   #58  <Method void zzbfa.zzm(int, int)>
		super.zza(zzbfa1);
	//   18   38:aload_0         
	//   19   39:aload_1         
	//   20   40:invokespecial   #60  <Method void zzbfc.zza(zzbfa)>
	//   21   43:return          
	}

	protected final int zzr()
	{
		int j = super.zzr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #63  <Method int zzbfc.zzr()>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(zzaon != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #14  <Field Integer zzaon>
	//*   7   11:ifnull          28
			i = j + zzbfa.zzq(1, zzaon.intValue());
	//    8   14:iload_2         
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #14  <Field Integer zzaon>
	//   12   20:invokevirtual   #52  <Method int Integer.intValue()>
	//   13   23:invokestatic    #67  <Method int zzbfa.zzq(int, int)>
	//   14   26:iadd            
	//   15   27:istore_1        
		j = i;
	//   16   28:iload_1         
	//   17   29:istore_2        
		if(zzaoo != null)
	//*  18   30:aload_0         
	//*  19   31:getfield        #16  <Field Integer zzaoo>
	//*  20   34:ifnull          51
			j = i + zzbfa.zzq(2, zzaoo.intValue());
	//   21   37:iload_1         
	//   22   38:iconst_2        
	//   23   39:aload_0         
	//   24   40:getfield        #16  <Field Integer zzaoo>
	//   25   43:invokevirtual   #52  <Method int Integer.intValue()>
	//   26   46:invokestatic    #67  <Method int zzbfa.zzq(int, int)>
	//   27   49:iadd            
	//   28   50:istore_2        
		return j;
	//   29   51:iload_2         
	//   30   52:ireturn         
	}

	private Integer zzaon;
	private Integer zzaoo;
}
