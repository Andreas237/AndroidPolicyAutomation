// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbfc, zzbez, zzbfa, zzbfi

public final class zzbfv extends zzbfc
{

	public zzbfv()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void zzbfc()>
		zzedv = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #17  <Field String zzedv>
		zzedw = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #19  <Field Long zzedw>
		zzedx = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #21  <Field Boolean zzedx>
		zzebk = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #25  <Field zzbfe zzebk>
		zzebt = -1;
	//   14   24:aload_0         
	//   15   25:iconst_m1       
	//   16   26:putfield        #29  <Field int zzebt>
	//   17   29:return          
	}

	public final zzbfi zza(zzbez zzbez1)
		throws IOException
	{
		do
		{
			int i = zzbez1.zzabk();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #40  <Method int zzbez.zzabk()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            77
			if(i != 10)
	//*   5    9:iload_2         
	//*   6   10:bipush          10
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
	//*  17   30:invokespecial   #43  <Method boolean zzbfc.zza(zzbez, int)>
	//*  18   33:ifne            0
							return ((zzbfi) (this));
	//   19   36:aload_0         
	//   20   37:areturn         
					} else
					{
						zzedx = Boolean.valueOf(zzbez1.zzabq());
	//   21   38:aload_0         
	//   22   39:aload_1         
	//   23   40:invokevirtual   #47  <Method boolean zzbez.zzabq()>
	//   24   43:invokestatic    #53  <Method Boolean Boolean.valueOf(boolean)>
	//   25   46:putfield        #21  <Field Boolean zzedx>
					}
				} else
	//*  26   49:goto            0
				{
					zzedw = Long.valueOf(zzbez1.zzabm());
	//   27   52:aload_0         
	//   28   53:aload_1         
	//   29   54:invokevirtual   #57  <Method long zzbez.zzabm()>
	//   30   57:invokestatic    #62  <Method Long Long.valueOf(long)>
	//   31   60:putfield        #19  <Field Long zzedw>
				}
			} else
	//*  32   63:goto            0
			{
				zzedv = zzbez1.readString();
	//   33   66:aload_0         
	//   34   67:aload_1         
	//   35   68:invokevirtual   #66  <Method String zzbez.readString()>
	//   36   71:putfield        #17  <Field String zzedv>
			}
		} while(true);
	//   37   74:goto            0
		return ((zzbfi) (this));
	//   38   77:aload_0         
	//   39   78:areturn         
	}

	public final void zza(zzbfa zzbfa1)
		throws IOException
	{
		if(zzedv != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field String zzedv>
	//*   2    4:ifnull          16
			zzbfa1.zzf(1, zzedv);
	//    3    7:aload_1         
	//    4    8:iconst_1        
	//    5    9:aload_0         
	//    6   10:getfield        #17  <Field String zzedv>
	//    7   13:invokevirtual   #74  <Method void zzbfa.zzf(int, String)>
		if(zzedw != null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #19  <Field Long zzedw>
	//*  10   20:ifnull          35
			zzbfa1.zzi(2, zzedw.longValue());
	//   11   23:aload_1         
	//   12   24:iconst_2        
	//   13   25:aload_0         
	//   14   26:getfield        #19  <Field Long zzedw>
	//   15   29:invokevirtual   #77  <Method long Long.longValue()>
	//   16   32:invokevirtual   #81  <Method void zzbfa.zzi(int, long)>
		if(zzedx != null)
	//*  17   35:aload_0         
	//*  18   36:getfield        #21  <Field Boolean zzedx>
	//*  19   39:ifnull          54
			zzbfa1.zzf(3, zzedx.booleanValue());
	//   20   42:aload_1         
	//   21   43:iconst_3        
	//   22   44:aload_0         
	//   23   45:getfield        #21  <Field Boolean zzedx>
	//   24   48:invokevirtual   #84  <Method boolean Boolean.booleanValue()>
	//   25   51:invokevirtual   #87  <Method void zzbfa.zzf(int, boolean)>
		super.zza(zzbfa1);
	//   26   54:aload_0         
	//   27   55:aload_1         
	//   28   56:invokespecial   #89  <Method void zzbfc.zza(zzbfa)>
	//   29   59:return          
	}

	protected final int zzr()
	{
		int j = super.zzr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #92  <Method int zzbfc.zzr()>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(zzedv != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #17  <Field String zzedv>
	//*   7   11:ifnull          25
			i = j + zzbfa.zzg(1, zzedv);
	//    8   14:iload_2         
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #17  <Field String zzedv>
	//   12   20:invokestatic    #96  <Method int zzbfa.zzg(int, String)>
	//   13   23:iadd            
	//   14   24:istore_1        
		j = i;
	//   15   25:iload_1         
	//   16   26:istore_2        
		if(zzedw != null)
	//*  17   27:aload_0         
	//*  18   28:getfield        #19  <Field Long zzedw>
	//*  19   31:ifnull          48
			j = i + zzbfa.zzd(2, zzedw.longValue());
	//   20   34:iload_1         
	//   21   35:iconst_2        
	//   22   36:aload_0         
	//   23   37:getfield        #19  <Field Long zzedw>
	//   24   40:invokevirtual   #77  <Method long Long.longValue()>
	//   25   43:invokestatic    #100 <Method int zzbfa.zzd(int, long)>
	//   26   46:iadd            
	//   27   47:istore_2        
		i = j;
	//   28   48:iload_2         
	//   29   49:istore_1        
		if(zzedx != null)
	//*  30   50:aload_0         
	//*  31   51:getfield        #21  <Field Boolean zzedx>
	//*  32   54:ifnull          74
		{
			zzedx.booleanValue();
	//   33   57:aload_0         
	//   34   58:getfield        #21  <Field Boolean zzedx>
	//   35   61:invokevirtual   #84  <Method boolean Boolean.booleanValue()>
	//   36   64:pop             
			i = j + (zzbfa.zzcd(3) + 1);
	//   37   65:iload_2         
	//   38   66:iconst_3        
	//   39   67:invokestatic    #104 <Method int zzbfa.zzcd(int)>
	//   40   70:iconst_1        
	//   41   71:iadd            
	//   42   72:iadd            
	//   43   73:istore_1        
		}
		return i;
	//   44   74:iload_1         
	//   45   75:ireturn         
	}

	public String zzedv;
	public Long zzedw;
	public Boolean zzedx;
}
