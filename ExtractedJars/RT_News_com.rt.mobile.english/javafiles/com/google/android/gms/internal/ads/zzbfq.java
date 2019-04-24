// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbfc, zzbez, zzbfa, zzbfi

public final class zzbfq extends zzbfc
{

	public zzbfq()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void zzbfc()>
		zzede = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #15  <Field byte[] zzede>
		zzedf = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #17  <Field byte[] zzedf>
		zzedg = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #19  <Field byte[] zzedg>
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
	//    4    6:ifeq            71
			if(i != 10)
	//*   5    9:iload_2         
	//*   6   10:bipush          10
	//*   7   12:icmpeq          60
			{
				if(i != 18)
	//*   8   15:iload_2         
	//*   9   16:bipush          18
	//*  10   18:icmpeq          49
				{
					if(i != 26)
	//*  11   21:iload_2         
	//*  12   22:bipush          26
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
						zzedg = zzbez1.readBytes();
	//   21   38:aload_0         
	//   22   39:aload_1         
	//   23   40:invokevirtual   #45  <Method byte[] zzbez.readBytes()>
	//   24   43:putfield        #19  <Field byte[] zzedg>
					}
				} else
	//*  25   46:goto            0
				{
					zzedf = zzbez1.readBytes();
	//   26   49:aload_0         
	//   27   50:aload_1         
	//   28   51:invokevirtual   #45  <Method byte[] zzbez.readBytes()>
	//   29   54:putfield        #17  <Field byte[] zzedf>
				}
			} else
	//*  30   57:goto            0
			{
				zzede = zzbez1.readBytes();
	//   31   60:aload_0         
	//   32   61:aload_1         
	//   33   62:invokevirtual   #45  <Method byte[] zzbez.readBytes()>
	//   34   65:putfield        #15  <Field byte[] zzede>
			}
		} while(true);
	//   35   68:goto            0
		return ((zzbfi) (this));
	//   36   71:aload_0         
	//   37   72:areturn         
	}

	public final void zza(zzbfa zzbfa1)
		throws IOException
	{
		if(zzede != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field byte[] zzede>
	//*   2    4:ifnull          16
			zzbfa1.zza(1, zzede);
	//    3    7:aload_1         
	//    4    8:iconst_1        
	//    5    9:aload_0         
	//    6   10:getfield        #15  <Field byte[] zzede>
	//    7   13:invokevirtual   #52  <Method void zzbfa.zza(int, byte[])>
		if(zzedf != null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #17  <Field byte[] zzedf>
	//*  10   20:ifnull          32
			zzbfa1.zza(2, zzedf);
	//   11   23:aload_1         
	//   12   24:iconst_2        
	//   13   25:aload_0         
	//   14   26:getfield        #17  <Field byte[] zzedf>
	//   15   29:invokevirtual   #52  <Method void zzbfa.zza(int, byte[])>
		if(zzedg != null)
	//*  16   32:aload_0         
	//*  17   33:getfield        #19  <Field byte[] zzedg>
	//*  18   36:ifnull          48
			zzbfa1.zza(3, zzedg);
	//   19   39:aload_1         
	//   20   40:iconst_3        
	//   21   41:aload_0         
	//   22   42:getfield        #19  <Field byte[] zzedg>
	//   23   45:invokevirtual   #52  <Method void zzbfa.zza(int, byte[])>
		super.zza(zzbfa1);
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:invokespecial   #54  <Method void zzbfc.zza(zzbfa)>
	//   27   53:return          
	}

	protected final int zzr()
	{
		int j = super.zzr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method int zzbfc.zzr()>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(zzede != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #15  <Field byte[] zzede>
	//*   7   11:ifnull          25
			i = j + zzbfa.zzb(1, zzede);
	//    8   14:iload_2         
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #15  <Field byte[] zzede>
	//   12   20:invokestatic    #61  <Method int zzbfa.zzb(int, byte[])>
	//   13   23:iadd            
	//   14   24:istore_1        
		j = i;
	//   15   25:iload_1         
	//   16   26:istore_2        
		if(zzedf != null)
	//*  17   27:aload_0         
	//*  18   28:getfield        #17  <Field byte[] zzedf>
	//*  19   31:ifnull          45
			j = i + zzbfa.zzb(2, zzedf);
	//   20   34:iload_1         
	//   21   35:iconst_2        
	//   22   36:aload_0         
	//   23   37:getfield        #17  <Field byte[] zzedf>
	//   24   40:invokestatic    #61  <Method int zzbfa.zzb(int, byte[])>
	//   25   43:iadd            
	//   26   44:istore_2        
		i = j;
	//   27   45:iload_2         
	//   28   46:istore_1        
		if(zzedg != null)
	//*  29   47:aload_0         
	//*  30   48:getfield        #19  <Field byte[] zzedg>
	//*  31   51:ifnull          65
			i = j + zzbfa.zzb(3, zzedg);
	//   32   54:iload_2         
	//   33   55:iconst_3        
	//   34   56:aload_0         
	//   35   57:getfield        #19  <Field byte[] zzedg>
	//   36   60:invokestatic    #61  <Method int zzbfa.zzb(int, byte[])>
	//   37   63:iadd            
	//   38   64:istore_1        
		return i;
	//   39   65:iload_1         
	//   40   66:ireturn         
	}

	private byte zzede[];
	private byte zzedf[];
	private byte zzedg[];
}
