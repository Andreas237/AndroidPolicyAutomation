// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//			zzbxn, zzag, zzbxm, zzbxl, 
//			zzbxt

public static final class zzag$zzc extends zzbxn
{

	public void zza(zzbxm zzbxm1)
		throws IOException
	{
		if(zzct != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field byte[] zzct>
	//*   2    4:ifnull          16
			zzbxm1.zzb(1, zzct);
	//    3    7:aload_1         
	//    4    8:iconst_1        
	//    5    9:aload_0         
	//    6   10:getfield        #17  <Field byte[] zzct>
	//    7   13:invokevirtual   #34  <Method void zzbxm.zzb(int, byte[])>
		if(zzcu != null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #19  <Field byte[] zzcu>
	//*  10   20:ifnull          32
			zzbxm1.zzb(2, zzcu);
	//   11   23:aload_1         
	//   12   24:iconst_2        
	//   13   25:aload_0         
	//   14   26:getfield        #19  <Field byte[] zzcu>
	//   15   29:invokevirtual   #34  <Method void zzbxm.zzb(int, byte[])>
		super.zza(zzbxm1);
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:invokespecial   #36  <Method void zzbxn.zza(zzbxm)>
	//   19   37:return          
	}

	public zzbxt zzb(zzbxl zzbxl1)
		throws IOException
	{
		return ((zzbxt) (zzj(zzbxl1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #42  <Method zzag$zzc zzj(zzbxl)>
	//    3    5:areturn         
	}

	public zzag$zzc zzj(zzbxl zzbxl1)
		throws IOException
	{
		do
		{
			int i = zzbxl1.zzaeo();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #48  <Method int zzbxl.zzaeo()>
	//    2    4:istore_2        
			switch(i)
	//*   3    5:iload_2         
			{
	//*   4    6:lookupswitch    3: default 40
	//	               0: 43
	//	               10: 56
	//	               18: 67
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
	//*  11   48:invokespecial   #51  <Method boolean zzbxn.zza(zzbxl, int)>
	//*  12   51:ifne            75
					return this;
	//   13   54:aload_0         
	//   14   55:areturn         
				break;

			case 10: // '\n'
				zzct = zzbxl1.readBytes();
	//   15   56:aload_0         
	//   16   57:aload_1         
	//   17   58:invokevirtual   #55  <Method byte[] zzbxl.readBytes()>
	//   18   61:putfield        #17  <Field byte[] zzct>
				break;

	//*  19   64:goto            75
			case 18: // '\022'
				zzcu = zzbxl1.readBytes();
	//   20   67:aload_0         
	//   21   68:aload_1         
	//   22   69:invokevirtual   #55  <Method byte[] zzbxl.readBytes()>
	//   23   72:putfield        #19  <Field byte[] zzcu>
				break;
			}
		} while(true);
	//   24   75:goto            0
	}

	protected int zzu()
	{
		int j = super.zzu();
	//    0    0:aload_0         
	//    1    1:invokespecial   #58  <Method int zzbxn.zzu()>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(zzct != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #17  <Field byte[] zzct>
	//*   7   11:ifnull          25
			i = j + zzbxm.zzc(1, zzct);
	//    8   14:iload_2         
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #17  <Field byte[] zzct>
	//   12   20:invokestatic    #61  <Method int zzbxm.zzc(int, byte[])>
	//   13   23:iadd            
	//   14   24:istore_1        
		j = i;
	//   15   25:iload_1         
	//   16   26:istore_2        
		if(zzcu != null)
	//*  17   27:aload_0         
	//*  18   28:getfield        #19  <Field byte[] zzcu>
	//*  19   31:ifnull          45
			j = i + zzbxm.zzc(2, zzcu);
	//   20   34:iload_1         
	//   21   35:iconst_2        
	//   22   36:aload_0         
	//   23   37:getfield        #19  <Field byte[] zzcu>
	//   24   40:invokestatic    #61  <Method int zzbxm.zzc(int, byte[])>
	//   25   43:iadd            
	//   26   44:istore_2        
		return j;
	//   27   45:iload_2         
	//   28   46:ireturn         
	}

	public byte zzct[];
	public byte zzcu[];

	public zzag$zzc()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void zzbxn()>
		zzct = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #17  <Field byte[] zzct>
		zzcu = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #19  <Field byte[] zzcu>
		zzcuR = -1;
	//    8   14:aload_0         
	//    9   15:iconst_m1       
	//   10   16:putfield        #23  <Field int zzcuR>
	//   11   19:return          
	}
}
