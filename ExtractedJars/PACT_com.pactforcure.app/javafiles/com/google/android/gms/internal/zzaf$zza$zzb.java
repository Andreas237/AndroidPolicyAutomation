// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//			zzbun, zzaf, zzbum, zzbul, 
//			zzbut

public static final class zzaf$zza$zzb extends zzbun
{

	public void zza(zzbum zzbum1)
		throws IOException
	{
		if(zzbO != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field Long zzbO>
	//*   2    4:ifnull          19
			zzbum1.zzb(1, zzbO.longValue());
	//    3    7:aload_1         
	//    4    8:iconst_1        
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field Long zzbO>
	//    7   13:invokevirtual   #39  <Method long Long.longValue()>
	//    8   16:invokevirtual   #44  <Method void zzbum.zzb(int, long)>
		if(zzbP != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #23  <Field Long zzbP>
	//*  11   23:ifnull          38
			zzbum1.zzb(2, zzbP.longValue());
	//   12   26:aload_1         
	//   13   27:iconst_2        
	//   14   28:aload_0         
	//   15   29:getfield        #23  <Field Long zzbP>
	//   16   32:invokevirtual   #39  <Method long Long.longValue()>
	//   17   35:invokevirtual   #44  <Method void zzbum.zzb(int, long)>
		if(zzcm != null)
	//*  18   38:aload_0         
	//*  19   39:getfield        #25  <Field Long zzcm>
	//*  20   42:ifnull          57
			zzbum1.zzb(3, zzcm.longValue());
	//   21   45:aload_1         
	//   22   46:iconst_3        
	//   23   47:aload_0         
	//   24   48:getfield        #25  <Field Long zzcm>
	//   25   51:invokevirtual   #39  <Method long Long.longValue()>
	//   26   54:invokevirtual   #44  <Method void zzbum.zzb(int, long)>
		super.zza(zzbum1);
	//   27   57:aload_0         
	//   28   58:aload_1         
	//   29   59:invokespecial   #46  <Method void zzbun.zza(zzbum)>
	//   30   62:return          
	}

	public zzbut zzb(zzbul zzbul1)
		throws IOException
	{
		return ((zzbut) (zzh(zzbul1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #52  <Method zzaf$zza$zzb zzh(zzbul)>
	//    3    5:areturn         
	}

	public zzaf$zza$zzb zzh(zzbul zzbul1)
		throws IOException
	{
		do
		{
			int i = zzbul1.zzacu();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #58  <Method int zzbul.zzacu()>
	//    2    4:istore_2        
			switch(i)
	//*   3    5:iload_2         
			{
	//*   4    6:lookupswitch    4: default 48
	//	               0: 57
	//	               8: 59
	//	               16: 73
	//	               24: 87
			default:
				if(super.zza(zzbul1, i))
					continue;
	//    5   48:aload_0         
	//    6   49:aload_1         
	//    7   50:iload_2         
	//    8   51:invokespecial   #61  <Method boolean zzbun.zza(zzbul, int)>
	//    9   54:ifne            0
				// fall through

			case 0: // '\0'
				return this;
	//   10   57:aload_0         
	//   11   58:areturn         

			case 8: // '\b'
				zzbO = Long.valueOf(zzbul1.zzacx());
	//   12   59:aload_0         
	//   13   60:aload_1         
	//   14   61:invokevirtual   #64  <Method long zzbul.zzacx()>
	//   15   64:invokestatic    #68  <Method Long Long.valueOf(long)>
	//   16   67:putfield        #21  <Field Long zzbO>
				break;

	//*  17   70:goto            0
			case 16: // '\020'
				zzbP = Long.valueOf(zzbul1.zzacx());
	//   18   73:aload_0         
	//   19   74:aload_1         
	//   20   75:invokevirtual   #64  <Method long zzbul.zzacx()>
	//   21   78:invokestatic    #68  <Method Long Long.valueOf(long)>
	//   22   81:putfield        #23  <Field Long zzbP>
				break;

	//*  23   84:goto            0
			case 24: // '\030'
				zzcm = Long.valueOf(zzbul1.zzacx());
	//   24   87:aload_0         
	//   25   88:aload_1         
	//   26   89:invokevirtual   #64  <Method long zzbul.zzacx()>
	//   27   92:invokestatic    #68  <Method Long Long.valueOf(long)>
	//   28   95:putfield        #25  <Field Long zzcm>
				break;
			}
		} while(true);
	//   29   98:goto            0
	}

	protected int zzv()
	{
		int j = super.zzv();
	//    0    0:aload_0         
	//    1    1:invokespecial   #71  <Method int zzbun.zzv()>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(zzbO != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #21  <Field Long zzbO>
	//*   7   11:ifnull          28
			i = j + zzbum.zzf(1, zzbO.longValue());
	//    8   14:iload_2         
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #21  <Field Long zzbO>
	//   12   20:invokevirtual   #39  <Method long Long.longValue()>
	//   13   23:invokestatic    #75  <Method int zzbum.zzf(int, long)>
	//   14   26:iadd            
	//   15   27:istore_1        
		j = i;
	//   16   28:iload_1         
	//   17   29:istore_2        
		if(zzbP != null)
	//*  18   30:aload_0         
	//*  19   31:getfield        #23  <Field Long zzbP>
	//*  20   34:ifnull          51
			j = i + zzbum.zzf(2, zzbP.longValue());
	//   21   37:iload_1         
	//   22   38:iconst_2        
	//   23   39:aload_0         
	//   24   40:getfield        #23  <Field Long zzbP>
	//   25   43:invokevirtual   #39  <Method long Long.longValue()>
	//   26   46:invokestatic    #75  <Method int zzbum.zzf(int, long)>
	//   27   49:iadd            
	//   28   50:istore_2        
		i = j;
	//   29   51:iload_2         
	//   30   52:istore_1        
		if(zzcm != null)
	//*  31   53:aload_0         
	//*  32   54:getfield        #25  <Field Long zzcm>
	//*  33   57:ifnull          74
			i = j + zzbum.zzf(3, zzcm.longValue());
	//   34   60:iload_2         
	//   35   61:iconst_3        
	//   36   62:aload_0         
	//   37   63:getfield        #25  <Field Long zzcm>
	//   38   66:invokevirtual   #39  <Method long Long.longValue()>
	//   39   69:invokestatic    #75  <Method int zzbum.zzf(int, long)>
	//   40   72:iadd            
	//   41   73:istore_1        
		return i;
	//   42   74:iload_1         
	//   43   75:ireturn         
	}

	public Long zzbO;
	public Long zzbP;
	public Long zzcm;

	public zzaf$zza$zzb()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void zzbun()>
		zzbO = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #21  <Field Long zzbO>
		zzbP = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #23  <Field Long zzbP>
		zzcm = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #25  <Field Long zzcm>
		zzcsg = -1;
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #29  <Field int zzcsg>
	//   14   24:return          
	}
}
