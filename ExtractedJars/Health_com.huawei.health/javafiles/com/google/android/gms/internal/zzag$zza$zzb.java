// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//			zzbxn, zzag, zzbxm, zzbxl, 
//			zzbxt

public static final class zzag$zza$zzb extends zzbxn
{

	public void zza(zzbxm zzbxm1)
		throws IOException
	{
		if(zzbP != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field Long zzbP>
	//*   2    4:ifnull          19
			zzbxm1.zzb(1, zzbP.longValue());
	//    3    7:aload_1         
	//    4    8:iconst_1        
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field Long zzbP>
	//    7   13:invokevirtual   #39  <Method long Long.longValue()>
	//    8   16:invokevirtual   #44  <Method void zzbxm.zzb(int, long)>
		if(zzbQ != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #23  <Field Long zzbQ>
	//*  11   23:ifnull          38
			zzbxm1.zzb(2, zzbQ.longValue());
	//   12   26:aload_1         
	//   13   27:iconst_2        
	//   14   28:aload_0         
	//   15   29:getfield        #23  <Field Long zzbQ>
	//   16   32:invokevirtual   #39  <Method long Long.longValue()>
	//   17   35:invokevirtual   #44  <Method void zzbxm.zzb(int, long)>
		if(zzcn != null)
	//*  18   38:aload_0         
	//*  19   39:getfield        #25  <Field Long zzcn>
	//*  20   42:ifnull          57
			zzbxm1.zzb(3, zzcn.longValue());
	//   21   45:aload_1         
	//   22   46:iconst_3        
	//   23   47:aload_0         
	//   24   48:getfield        #25  <Field Long zzcn>
	//   25   51:invokevirtual   #39  <Method long Long.longValue()>
	//   26   54:invokevirtual   #44  <Method void zzbxm.zzb(int, long)>
		super.zza(zzbxm1);
	//   27   57:aload_0         
	//   28   58:aload_1         
	//   29   59:invokespecial   #46  <Method void zzbxn.zza(zzbxm)>
	//   30   62:return          
	}

	public zzbxt zzb(zzbxl zzbxl1)
		throws IOException
	{
		return ((zzbxt) (zzh(zzbxl1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #52  <Method zzag$zza$zzb zzh(zzbxl)>
	//    3    5:areturn         
	}

	public zzag$zza$zzb zzh(zzbxl zzbxl1)
		throws IOException
	{
		do
		{
			int i = zzbxl1.zzaeo();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #58  <Method int zzbxl.zzaeo()>
	//    2    4:istore_2        
			switch(i)
	//*   3    5:iload_2         
			{
	//*   4    6:lookupswitch    4: default 48
	//	               0: 51
	//	               8: 64
	//	               16: 78
	//	               24: 92
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
	//*  11   56:invokespecial   #61  <Method boolean zzbxn.zza(zzbxl, int)>
	//*  12   59:ifne            103
					return this;
	//   13   62:aload_0         
	//   14   63:areturn         
				break;

			case 8: // '\b'
				zzbP = Long.valueOf(zzbxl1.zzaer());
	//   15   64:aload_0         
	//   16   65:aload_1         
	//   17   66:invokevirtual   #64  <Method long zzbxl.zzaer()>
	//   18   69:invokestatic    #68  <Method Long Long.valueOf(long)>
	//   19   72:putfield        #21  <Field Long zzbP>
				break;

	//*  20   75:goto            103
			case 16: // '\020'
				zzbQ = Long.valueOf(zzbxl1.zzaer());
	//   21   78:aload_0         
	//   22   79:aload_1         
	//   23   80:invokevirtual   #64  <Method long zzbxl.zzaer()>
	//   24   83:invokestatic    #68  <Method Long Long.valueOf(long)>
	//   25   86:putfield        #23  <Field Long zzbQ>
				break;

	//*  26   89:goto            103
			case 24: // '\030'
				zzcn = Long.valueOf(zzbxl1.zzaer());
	//   27   92:aload_0         
	//   28   93:aload_1         
	//   29   94:invokevirtual   #64  <Method long zzbxl.zzaer()>
	//   30   97:invokestatic    #68  <Method Long Long.valueOf(long)>
	//   31  100:putfield        #25  <Field Long zzcn>
				break;
			}
		} while(true);
	//   32  103:goto            0
	}

	protected int zzu()
	{
		int j = super.zzu();
	//    0    0:aload_0         
	//    1    1:invokespecial   #71  <Method int zzbxn.zzu()>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(zzbP != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #21  <Field Long zzbP>
	//*   7   11:ifnull          28
			i = j + zzbxm.zzf(1, zzbP.longValue());
	//    8   14:iload_2         
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #21  <Field Long zzbP>
	//   12   20:invokevirtual   #39  <Method long Long.longValue()>
	//   13   23:invokestatic    #75  <Method int zzbxm.zzf(int, long)>
	//   14   26:iadd            
	//   15   27:istore_1        
		j = i;
	//   16   28:iload_1         
	//   17   29:istore_2        
		if(zzbQ != null)
	//*  18   30:aload_0         
	//*  19   31:getfield        #23  <Field Long zzbQ>
	//*  20   34:ifnull          51
			j = i + zzbxm.zzf(2, zzbQ.longValue());
	//   21   37:iload_1         
	//   22   38:iconst_2        
	//   23   39:aload_0         
	//   24   40:getfield        #23  <Field Long zzbQ>
	//   25   43:invokevirtual   #39  <Method long Long.longValue()>
	//   26   46:invokestatic    #75  <Method int zzbxm.zzf(int, long)>
	//   27   49:iadd            
	//   28   50:istore_2        
		i = j;
	//   29   51:iload_2         
	//   30   52:istore_1        
		if(zzcn != null)
	//*  31   53:aload_0         
	//*  32   54:getfield        #25  <Field Long zzcn>
	//*  33   57:ifnull          74
			i = j + zzbxm.zzf(3, zzcn.longValue());
	//   34   60:iload_2         
	//   35   61:iconst_3        
	//   36   62:aload_0         
	//   37   63:getfield        #25  <Field Long zzcn>
	//   38   66:invokevirtual   #39  <Method long Long.longValue()>
	//   39   69:invokestatic    #75  <Method int zzbxm.zzf(int, long)>
	//   40   72:iadd            
	//   41   73:istore_1        
		return i;
	//   42   74:iload_1         
	//   43   75:ireturn         
	}

	public Long zzbP;
	public Long zzbQ;
	public Long zzcn;

	public zzag$zza$zzb()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void zzbxn()>
		zzbP = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #21  <Field Long zzbP>
		zzbQ = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #23  <Field Long zzbQ>
		zzcn = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #25  <Field Long zzcn>
		zzcuR = -1;
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #29  <Field int zzcuR>
	//   14   24:return          
	}
}
