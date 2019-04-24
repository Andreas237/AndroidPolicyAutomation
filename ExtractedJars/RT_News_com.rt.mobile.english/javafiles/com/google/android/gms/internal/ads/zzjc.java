// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbfc, zzbez, zziw, zzia, 
//			zzbfa, zzbfi

public final class zzjc extends zzbfc
{

	public zzjc()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void zzbfc()>
		zzanu = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #15  <Field Integer zzanu>
		zzapn = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #17  <Field zziw zzapn>
		zzebk = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #21  <Field zzbfe zzebk>
		zzebt = -1;
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #25  <Field int zzebt>
	//   14   24:return          
	}

	private final zzjc zzz(zzbez zzbez1)
		throws IOException
	{
		IllegalArgumentException illegalargumentexception;
		do
		{
			int i = zzbez1.zzabk();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #38  <Method int zzbez.zzabk()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            98
			if(i != 8)
	//*   5    9:iload_2         
	//*   6   10:bipush          8
	//*   7   12:icmpeq          61
			{
				if(i != 18)
	//*   8   15:iload_2         
	//*   9   16:bipush          18
	//*  10   18:icmpeq          32
				{
					if(!super.zza(zzbez1, i))
	//*  11   21:aload_0         
	//*  12   22:aload_1         
	//*  13   23:iload_2         
	//*  14   24:invokespecial   #42  <Method boolean zzbfc.zza(zzbez, int)>
	//*  15   27:ifne            0
						return this;
	//   16   30:aload_0         
	//   17   31:areturn         
				} else
				{
					if(zzapn == null)
	//*  18   32:aload_0         
	//*  19   33:getfield        #17  <Field zziw zzapn>
	//*  20   36:ifnonnull       50
						zzapn = new zziw();
	//   21   39:aload_0         
	//   22   40:new             #44  <Class zziw>
	//   23   43:dup             
	//   24   44:invokespecial   #45  <Method void zziw()>
	//   25   47:putfield        #17  <Field zziw zzapn>
					zzbez1.zza(((zzbfi) (zzapn)));
	//   26   50:aload_1         
	//   27   51:aload_0         
	//   28   52:getfield        #17  <Field zziw zzapn>
	//   29   55:invokevirtual   #48  <Method void zzbez.zza(zzbfi)>
				}
			} else
	//*  30   58:goto            0
			{
				int j = zzbez1.getPosition();
	//   31   61:aload_1         
	//   32   62:invokevirtual   #51  <Method int zzbez.getPosition()>
	//   33   65:istore_3        
				try
				{
					zzanu = Integer.valueOf(zzia.zzd(zzbez1.zzacc()));
	//   34   66:aload_0         
	//   35   67:aload_1         
	//   36   68:invokevirtual   #54  <Method int zzbez.zzacc()>
	//   37   71:invokestatic    #60  <Method int zzia.zzd(int)>
	//   38   74:invokestatic    #66  <Method Integer Integer.valueOf(int)>
	//   39   77:putfield        #15  <Field Integer zzanu>
				}
	//*  40   80:goto            0
	//*  41   83:aload_1         
	//*  42   84:iload_3         
	//*  43   85:invokevirtual   #70  <Method void zzbez.zzdc(int)>
	//*  44   88:aload_0         
	//*  45   89:aload_1         
	//*  46   90:iload_2         
	//*  47   91:invokevirtual   #42  <Method boolean zzbfc.zza(zzbez, int)>
	//*  48   94:pop             
	//*  49   95:goto            0
	//*  50   98:aload_0         
	//*  51   99:areturn         
				// Misplaced declaration of an exception variable
				catch(IllegalArgumentException illegalargumentexception)
				{
					zzbez1.zzdc(j);
					((zzbfc)this).zza(zzbez1, i);
				}
			}
		} while(true);
		return this;
	//*  52  100:astore          4
	//*  53  102:goto            83
	}

	public final zzbfi zza(zzbez zzbez1)
		throws IOException
	{
		return ((zzbfi) (zzz(zzbez1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #74  <Method zzjc zzz(zzbez)>
	//    3    5:areturn         
	}

	public final void zza(zzbfa zzbfa1)
		throws IOException
	{
		if(zzanu != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field Integer zzanu>
	//*   2    4:ifnull          19
			zzbfa1.zzm(1, zzanu.intValue());
	//    3    7:aload_1         
	//    4    8:iconst_1        
	//    5    9:aload_0         
	//    6   10:getfield        #15  <Field Integer zzanu>
	//    7   13:invokevirtual   #78  <Method int Integer.intValue()>
	//    8   16:invokevirtual   #84  <Method void zzbfa.zzm(int, int)>
		if(zzapn != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #17  <Field zziw zzapn>
	//*  11   23:ifnull          35
			zzbfa1.zza(2, ((zzbfi) (zzapn)));
	//   12   26:aload_1         
	//   13   27:iconst_2        
	//   14   28:aload_0         
	//   15   29:getfield        #17  <Field zziw zzapn>
	//   16   32:invokevirtual   #87  <Method void zzbfa.zza(int, zzbfi)>
		super.zza(zzbfa1);
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:invokespecial   #89  <Method void zzbfc.zza(zzbfa)>
	//   20   40:return          
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
		if(zzanu != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #15  <Field Integer zzanu>
	//*   7   11:ifnull          28
			i = j + zzbfa.zzq(1, zzanu.intValue());
	//    8   14:iload_2         
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #15  <Field Integer zzanu>
	//   12   20:invokevirtual   #78  <Method int Integer.intValue()>
	//   13   23:invokestatic    #96  <Method int zzbfa.zzq(int, int)>
	//   14   26:iadd            
	//   15   27:istore_1        
		j = i;
	//   16   28:iload_1         
	//   17   29:istore_2        
		if(zzapn != null)
	//*  18   30:aload_0         
	//*  19   31:getfield        #17  <Field zziw zzapn>
	//*  20   34:ifnull          48
			j = i + zzbfa.zzb(2, ((zzbfi) (zzapn)));
	//   21   37:iload_1         
	//   22   38:iconst_2        
	//   23   39:aload_0         
	//   24   40:getfield        #17  <Field zziw zzapn>
	//   25   43:invokestatic    #100 <Method int zzbfa.zzb(int, zzbfi)>
	//   26   46:iadd            
	//   27   47:istore_2        
		return j;
	//   28   48:iload_2         
	//   29   49:ireturn         
	}

	private Integer zzanu;
	private zziw zzapn;
}
