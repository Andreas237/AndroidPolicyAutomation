// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbfc, zzbez, zzbfa, zzbfi

public final class zzbfs extends zzbfc
{

	public zzbfs()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void zzbfc()>
		zzedj = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #16  <Field Integer zzedj>
		zzedk = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #18  <Field byte[] zzedk>
		zzedg = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #20  <Field byte[] zzedg>
		zzebk = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #24  <Field zzbfe zzebk>
		zzebt = -1;
	//   14   24:aload_0         
	//   15   25:iconst_m1       
	//   16   26:putfield        #28  <Field int zzebt>
	//   17   29:return          
	}

	public final zzbfi zza(zzbez zzbez1)
		throws IOException
	{
		do
		{
			int i = zzbez1.zzabk();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #39  <Method int zzbez.zzabk()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            74
			if(i != 8)
	//*   5    9:iload_2         
	//*   6   10:bipush          8
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
	//*  17   30:invokespecial   #42  <Method boolean zzbfc.zza(zzbez, int)>
	//*  18   33:ifne            0
							return ((zzbfi) (this));
	//   19   36:aload_0         
	//   20   37:areturn         
					} else
					{
						zzedg = zzbez1.readBytes();
	//   21   38:aload_0         
	//   22   39:aload_1         
	//   23   40:invokevirtual   #46  <Method byte[] zzbez.readBytes()>
	//   24   43:putfield        #20  <Field byte[] zzedg>
					}
				} else
	//*  25   46:goto            0
				{
					zzedk = zzbez1.readBytes();
	//   26   49:aload_0         
	//   27   50:aload_1         
	//   28   51:invokevirtual   #46  <Method byte[] zzbez.readBytes()>
	//   29   54:putfield        #18  <Field byte[] zzedk>
				}
			} else
	//*  30   57:goto            0
			{
				zzedj = Integer.valueOf(zzbez1.zzabn());
	//   31   60:aload_0         
	//   32   61:aload_1         
	//   33   62:invokevirtual   #49  <Method int zzbez.zzabn()>
	//   34   65:invokestatic    #55  <Method Integer Integer.valueOf(int)>
	//   35   68:putfield        #16  <Field Integer zzedj>
			}
		} while(true);
	//   36   71:goto            0
		return ((zzbfi) (this));
	//   37   74:aload_0         
	//   38   75:areturn         
	}

	public final void zza(zzbfa zzbfa1)
		throws IOException
	{
		if(zzedj != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field Integer zzedj>
	//*   2    4:ifnull          19
			zzbfa1.zzm(1, zzedj.intValue());
	//    3    7:aload_1         
	//    4    8:iconst_1        
	//    5    9:aload_0         
	//    6   10:getfield        #16  <Field Integer zzedj>
	//    7   13:invokevirtual   #60  <Method int Integer.intValue()>
	//    8   16:invokevirtual   #66  <Method void zzbfa.zzm(int, int)>
		if(zzedk != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #18  <Field byte[] zzedk>
	//*  11   23:ifnull          35
			zzbfa1.zza(2, zzedk);
	//   12   26:aload_1         
	//   13   27:iconst_2        
	//   14   28:aload_0         
	//   15   29:getfield        #18  <Field byte[] zzedk>
	//   16   32:invokevirtual   #69  <Method void zzbfa.zza(int, byte[])>
		if(zzedg != null)
	//*  17   35:aload_0         
	//*  18   36:getfield        #20  <Field byte[] zzedg>
	//*  19   39:ifnull          51
			zzbfa1.zza(3, zzedg);
	//   20   42:aload_1         
	//   21   43:iconst_3        
	//   22   44:aload_0         
	//   23   45:getfield        #20  <Field byte[] zzedg>
	//   24   48:invokevirtual   #69  <Method void zzbfa.zza(int, byte[])>
		super.zza(zzbfa1);
	//   25   51:aload_0         
	//   26   52:aload_1         
	//   27   53:invokespecial   #71  <Method void zzbfc.zza(zzbfa)>
	//   28   56:return          
	}

	protected final int zzr()
	{
		int j = super.zzr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #74  <Method int zzbfc.zzr()>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(zzedj != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #16  <Field Integer zzedj>
	//*   7   11:ifnull          28
			i = j + zzbfa.zzq(1, zzedj.intValue());
	//    8   14:iload_2         
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #16  <Field Integer zzedj>
	//   12   20:invokevirtual   #60  <Method int Integer.intValue()>
	//   13   23:invokestatic    #78  <Method int zzbfa.zzq(int, int)>
	//   14   26:iadd            
	//   15   27:istore_1        
		j = i;
	//   16   28:iload_1         
	//   17   29:istore_2        
		if(zzedk != null)
	//*  18   30:aload_0         
	//*  19   31:getfield        #18  <Field byte[] zzedk>
	//*  20   34:ifnull          48
			j = i + zzbfa.zzb(2, zzedk);
	//   21   37:iload_1         
	//   22   38:iconst_2        
	//   23   39:aload_0         
	//   24   40:getfield        #18  <Field byte[] zzedk>
	//   25   43:invokestatic    #82  <Method int zzbfa.zzb(int, byte[])>
	//   26   46:iadd            
	//   27   47:istore_2        
		i = j;
	//   28   48:iload_2         
	//   29   49:istore_1        
		if(zzedg != null)
	//*  30   50:aload_0         
	//*  31   51:getfield        #20  <Field byte[] zzedg>
	//*  32   54:ifnull          68
			i = j + zzbfa.zzb(3, zzedg);
	//   33   57:iload_2         
	//   34   58:iconst_3        
	//   35   59:aload_0         
	//   36   60:getfield        #20  <Field byte[] zzedg>
	//   37   63:invokestatic    #82  <Method int zzbfa.zzb(int, byte[])>
	//   38   66:iadd            
	//   39   67:istore_1        
		return i;
	//   40   68:iload_1         
	//   41   69:ireturn         
	}

	private byte zzedg[];
	private Integer zzedj;
	private byte zzedk[];
}
