// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbfc, zzbez, zzbfa, zzbfi

public final class zzit extends zzbfc
{

	public zzit()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void zzbfc()>
		zzaot = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #15  <Field Integer zzaot>
		zzaou = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #17  <Field Integer zzaou>
		zzaov = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #19  <Field Integer zzaov>
		zzebk = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #23  <Field zzbfe zzebk>
		zzebt = -1;
	//   14   24:aload_0         
	//   15   25:iconst_m1       
	//   16   26:putfield        #27  <Field int zzebt>
	//   17   29:return          
	}

	public final zzbfi zza(zzbez zzbez1)
		throws IOException
	{
		do
		{
			int i = zzbez1.zzabk();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #38  <Method int zzbez.zzabk()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            80
			if(i != 8)
	//*   5    9:iload_2         
	//*   6   10:bipush          8
	//*   7   12:icmpeq          66
			{
				if(i != 16)
	//*   8   15:iload_2         
	//*   9   16:bipush          16
	//*  10   18:icmpeq          52
				{
					if(i != 24)
	//*  11   21:iload_2         
	//*  12   22:bipush          24
	//*  13   24:icmpeq          38
					{
						if(!super.zza(zzbez1, i))
	//*  14   27:aload_0         
	//*  15   28:aload_1         
	//*  16   29:iload_2         
	//*  17   30:invokespecial   #41  <Method boolean zzbfc.zza(zzbez, int)>
	//*  18   33:ifne            0
							return ((zzbfi) (this));
	//   19   36:aload_0         
	//   20   37:areturn         
					} else
					{
						zzaov = Integer.valueOf(zzbez1.zzacc());
	//   21   38:aload_0         
	//   22   39:aload_1         
	//   23   40:invokevirtual   #44  <Method int zzbez.zzacc()>
	//   24   43:invokestatic    #50  <Method Integer Integer.valueOf(int)>
	//   25   46:putfield        #19  <Field Integer zzaov>
					}
				} else
	//*  26   49:goto            0
				{
					zzaou = Integer.valueOf(zzbez1.zzacc());
	//   27   52:aload_0         
	//   28   53:aload_1         
	//   29   54:invokevirtual   #44  <Method int zzbez.zzacc()>
	//   30   57:invokestatic    #50  <Method Integer Integer.valueOf(int)>
	//   31   60:putfield        #17  <Field Integer zzaou>
				}
			} else
	//*  32   63:goto            0
			{
				zzaot = Integer.valueOf(zzbez1.zzacc());
	//   33   66:aload_0         
	//   34   67:aload_1         
	//   35   68:invokevirtual   #44  <Method int zzbez.zzacc()>
	//   36   71:invokestatic    #50  <Method Integer Integer.valueOf(int)>
	//   37   74:putfield        #15  <Field Integer zzaot>
			}
		} while(true);
	//   38   77:goto            0
		return ((zzbfi) (this));
	//   39   80:aload_0         
	//   40   81:areturn         
	}

	public final void zza(zzbfa zzbfa1)
		throws IOException
	{
		if(zzaot != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field Integer zzaot>
	//*   2    4:ifnull          19
			zzbfa1.zzm(1, zzaot.intValue());
	//    3    7:aload_1         
	//    4    8:iconst_1        
	//    5    9:aload_0         
	//    6   10:getfield        #15  <Field Integer zzaot>
	//    7   13:invokevirtual   #55  <Method int Integer.intValue()>
	//    8   16:invokevirtual   #61  <Method void zzbfa.zzm(int, int)>
		if(zzaou != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #17  <Field Integer zzaou>
	//*  11   23:ifnull          38
			zzbfa1.zzm(2, zzaou.intValue());
	//   12   26:aload_1         
	//   13   27:iconst_2        
	//   14   28:aload_0         
	//   15   29:getfield        #17  <Field Integer zzaou>
	//   16   32:invokevirtual   #55  <Method int Integer.intValue()>
	//   17   35:invokevirtual   #61  <Method void zzbfa.zzm(int, int)>
		if(zzaov != null)
	//*  18   38:aload_0         
	//*  19   39:getfield        #19  <Field Integer zzaov>
	//*  20   42:ifnull          57
			zzbfa1.zzm(3, zzaov.intValue());
	//   21   45:aload_1         
	//   22   46:iconst_3        
	//   23   47:aload_0         
	//   24   48:getfield        #19  <Field Integer zzaov>
	//   25   51:invokevirtual   #55  <Method int Integer.intValue()>
	//   26   54:invokevirtual   #61  <Method void zzbfa.zzm(int, int)>
		super.zza(zzbfa1);
	//   27   57:aload_0         
	//   28   58:aload_1         
	//   29   59:invokespecial   #63  <Method void zzbfc.zza(zzbfa)>
	//   30   62:return          
	}

	protected final int zzr()
	{
		int j = super.zzr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #66  <Method int zzbfc.zzr()>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(zzaot != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #15  <Field Integer zzaot>
	//*   7   11:ifnull          28
			i = j + zzbfa.zzq(1, zzaot.intValue());
	//    8   14:iload_2         
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #15  <Field Integer zzaot>
	//   12   20:invokevirtual   #55  <Method int Integer.intValue()>
	//   13   23:invokestatic    #70  <Method int zzbfa.zzq(int, int)>
	//   14   26:iadd            
	//   15   27:istore_1        
		j = i;
	//   16   28:iload_1         
	//   17   29:istore_2        
		if(zzaou != null)
	//*  18   30:aload_0         
	//*  19   31:getfield        #17  <Field Integer zzaou>
	//*  20   34:ifnull          51
			j = i + zzbfa.zzq(2, zzaou.intValue());
	//   21   37:iload_1         
	//   22   38:iconst_2        
	//   23   39:aload_0         
	//   24   40:getfield        #17  <Field Integer zzaou>
	//   25   43:invokevirtual   #55  <Method int Integer.intValue()>
	//   26   46:invokestatic    #70  <Method int zzbfa.zzq(int, int)>
	//   27   49:iadd            
	//   28   50:istore_2        
		i = j;
	//   29   51:iload_2         
	//   30   52:istore_1        
		if(zzaov != null)
	//*  31   53:aload_0         
	//*  32   54:getfield        #19  <Field Integer zzaov>
	//*  33   57:ifnull          74
			i = j + zzbfa.zzq(3, zzaov.intValue());
	//   34   60:iload_2         
	//   35   61:iconst_3        
	//   36   62:aload_0         
	//   37   63:getfield        #19  <Field Integer zzaov>
	//   38   66:invokevirtual   #55  <Method int Integer.intValue()>
	//   39   69:invokestatic    #70  <Method int zzbfa.zzq(int, int)>
	//   40   72:iadd            
	//   41   73:istore_1        
		return i;
	//   42   74:iload_1         
	//   43   75:ireturn         
	}

	public Integer zzaot;
	public Integer zzaou;
	public Integer zzaov;
}
