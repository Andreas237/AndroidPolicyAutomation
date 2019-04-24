// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//			zzbxn, zzag, zzbxm, zzbxl, 
//			zzbxt

public static final class zzag$zze extends zzbxn
{

	public void zza(zzbxm zzbxm1)
		throws IOException
	{
		if(zzco != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field Long zzco>
	//*   2    4:ifnull          19
			zzbxm1.zzb(1, zzco.longValue());
	//    3    7:aload_1         
	//    4    8:iconst_1        
	//    5    9:aload_0         
	//    6   10:getfield        #20  <Field Long zzco>
	//    7   13:invokevirtual   #39  <Method long Long.longValue()>
	//    8   16:invokevirtual   #45  <Method void zzbxm.zzb(int, long)>
		if(zzcy != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #22  <Field String zzcy>
	//*  11   23:ifnull          35
			zzbxm1.zzq(3, zzcy);
	//   12   26:aload_1         
	//   13   27:iconst_3        
	//   14   28:aload_0         
	//   15   29:getfield        #22  <Field String zzcy>
	//   16   32:invokevirtual   #49  <Method void zzbxm.zzq(int, String)>
		if(zzcz != null)
	//*  17   35:aload_0         
	//*  18   36:getfield        #24  <Field byte[] zzcz>
	//*  19   39:ifnull          51
			zzbxm1.zzb(4, zzcz);
	//   20   42:aload_1         
	//   21   43:iconst_4        
	//   22   44:aload_0         
	//   23   45:getfield        #24  <Field byte[] zzcz>
	//   24   48:invokevirtual   #52  <Method void zzbxm.zzb(int, byte[])>
		super.zza(zzbxm1);
	//   25   51:aload_0         
	//   26   52:aload_1         
	//   27   53:invokespecial   #54  <Method void zzbxn.zza(zzbxm)>
	//   28   56:return          
	}

	public zzbxt zzb(zzbxl zzbxl1)
		throws IOException
	{
		return ((zzbxt) (zzl(zzbxl1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #60  <Method zzag$zze zzl(zzbxl)>
	//    3    5:areturn         
	}

	public zzag$zze zzl(zzbxl zzbxl1)
		throws IOException
	{
		do
		{
			int i = zzbxl1.zzaeo();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #66  <Method int zzbxl.zzaeo()>
	//    2    4:istore_2        
			switch(i)
	//*   3    5:iload_2         
			{
	//*   4    6:lookupswitch    4: default 48
	//	               0: 51
	//	               8: 64
	//	               26: 78
	//	               34: 89
	//*   5   48:goto            53
			case 0: // '\0'
				return this;
	//    6   51:aload_0         
	//    7   52:areturn         

			default:
				if(!super.zza(zzbxl1, i))
	//*   8   53:aload_0         
	//*   9   54:aload_1         
	//*  10   55:iload_2         
	//*  11   56:invokespecial   #69  <Method boolean zzbxn.zza(zzbxl, int)>
	//*  12   59:ifne            97
					return this;
	//   13   62:aload_0         
	//   14   63:areturn         
				break;

			case 8: // '\b'
				zzco = Long.valueOf(zzbxl1.zzaer());
	//   15   64:aload_0         
	//   16   65:aload_1         
	//   17   66:invokevirtual   #72  <Method long zzbxl.zzaer()>
	//   18   69:invokestatic    #76  <Method Long Long.valueOf(long)>
	//   19   72:putfield        #20  <Field Long zzco>
				break;

	//*  20   75:goto            97
			case 26: // '\032'
				zzcy = zzbxl1.readString();
	//   21   78:aload_0         
	//   22   79:aload_1         
	//   23   80:invokevirtual   #80  <Method String zzbxl.readString()>
	//   24   83:putfield        #22  <Field String zzcy>
				break;

	//*  25   86:goto            97
			case 34: // '"'
				zzcz = zzbxl1.readBytes();
	//   26   89:aload_0         
	//   27   90:aload_1         
	//   28   91:invokevirtual   #84  <Method byte[] zzbxl.readBytes()>
	//   29   94:putfield        #24  <Field byte[] zzcz>
				break;
			}
		} while(true);
	//   30   97:goto            0
	}

	protected int zzu()
	{
		int j = super.zzu();
	//    0    0:aload_0         
	//    1    1:invokespecial   #87  <Method int zzbxn.zzu()>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(zzco != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #20  <Field Long zzco>
	//*   7   11:ifnull          28
			i = j + zzbxm.zzf(1, zzco.longValue());
	//    8   14:iload_2         
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #20  <Field Long zzco>
	//   12   20:invokevirtual   #39  <Method long Long.longValue()>
	//   13   23:invokestatic    #91  <Method int zzbxm.zzf(int, long)>
	//   14   26:iadd            
	//   15   27:istore_1        
		j = i;
	//   16   28:iload_1         
	//   17   29:istore_2        
		if(zzcy != null)
	//*  18   30:aload_0         
	//*  19   31:getfield        #22  <Field String zzcy>
	//*  20   34:ifnull          48
			j = i + zzbxm.zzr(3, zzcy);
	//   21   37:iload_1         
	//   22   38:iconst_3        
	//   23   39:aload_0         
	//   24   40:getfield        #22  <Field String zzcy>
	//   25   43:invokestatic    #95  <Method int zzbxm.zzr(int, String)>
	//   26   46:iadd            
	//   27   47:istore_2        
		i = j;
	//   28   48:iload_2         
	//   29   49:istore_1        
		if(zzcz != null)
	//*  30   50:aload_0         
	//*  31   51:getfield        #24  <Field byte[] zzcz>
	//*  32   54:ifnull          68
			i = j + zzbxm.zzc(4, zzcz);
	//   33   57:iload_2         
	//   34   58:iconst_4        
	//   35   59:aload_0         
	//   36   60:getfield        #24  <Field byte[] zzcz>
	//   37   63:invokestatic    #99  <Method int zzbxm.zzc(int, byte[])>
	//   38   66:iadd            
	//   39   67:istore_1        
		return i;
	//   40   68:iload_1         
	//   41   69:ireturn         
	}

	public Long zzco;
	public String zzcy;
	public byte zzcz[];

	public zzag$zze()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void zzbxn()>
		zzco = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #20  <Field Long zzco>
		zzcy = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #22  <Field String zzcy>
		zzcz = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #24  <Field byte[] zzcz>
		zzcuR = -1;
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #28  <Field int zzcuR>
	//   14   24:return          
	}
}
