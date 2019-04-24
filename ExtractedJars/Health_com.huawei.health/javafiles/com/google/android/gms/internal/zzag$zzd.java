// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//			zzbxn, zzag, zzbxs, zzbxt, 
//			zzbxm, zzbxl

public static final class zzag$zzd extends zzbxn
{

	public static zzag$zzd zze(byte abyte0[])
		throws zzbxs
	{
		return (zzag$zzd)zzbxt.zza(((zzbxt) (new zzag$zzd())), abyte0);
	//    0    0:new             #2   <Class zzag$zzd>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void zzag$zzd()>
	//    3    7:aload_0         
	//    4    8:invokestatic    #41  <Method zzbxt zzbxt.zza(zzbxt, byte[])>
	//    5   11:checkcast       #2   <Class zzag$zzd>
	//    6   14:areturn         
	}

	public void zza(zzbxm zzbxm1)
		throws IOException
	{
		if(data != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field byte[] data>
	//*   2    4:ifnull          16
			zzbxm1.zzb(1, data);
	//    3    7:aload_1         
	//    4    8:iconst_1        
	//    5    9:aload_0         
	//    6   10:getfield        #19  <Field byte[] data>
	//    7   13:invokevirtual   #51  <Method void zzbxm.zzb(int, byte[])>
		if(zzcv != null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #21  <Field byte[] zzcv>
	//*  10   20:ifnull          32
			zzbxm1.zzb(2, zzcv);
	//   11   23:aload_1         
	//   12   24:iconst_2        
	//   13   25:aload_0         
	//   14   26:getfield        #21  <Field byte[] zzcv>
	//   15   29:invokevirtual   #51  <Method void zzbxm.zzb(int, byte[])>
		if(zzcw != null)
	//*  16   32:aload_0         
	//*  17   33:getfield        #23  <Field byte[] zzcw>
	//*  18   36:ifnull          48
			zzbxm1.zzb(3, zzcw);
	//   19   39:aload_1         
	//   20   40:iconst_3        
	//   21   41:aload_0         
	//   22   42:getfield        #23  <Field byte[] zzcw>
	//   23   45:invokevirtual   #51  <Method void zzbxm.zzb(int, byte[])>
		if(zzcx != null)
	//*  24   48:aload_0         
	//*  25   49:getfield        #25  <Field byte[] zzcx>
	//*  26   52:ifnull          64
			zzbxm1.zzb(4, zzcx);
	//   27   55:aload_1         
	//   28   56:iconst_4        
	//   29   57:aload_0         
	//   30   58:getfield        #25  <Field byte[] zzcx>
	//   31   61:invokevirtual   #51  <Method void zzbxm.zzb(int, byte[])>
		super.zza(zzbxm1);
	//   32   64:aload_0         
	//   33   65:aload_1         
	//   34   66:invokespecial   #53  <Method void zzbxn.zza(zzbxm)>
	//   35   69:return          
	}

	public zzbxt zzb(zzbxl zzbxl1)
		throws IOException
	{
		return ((zzbxt) (zzk(zzbxl1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #58  <Method zzag$zzd zzk(zzbxl)>
	//    3    5:areturn         
	}

	public zzag$zzd zzk(zzbxl zzbxl1)
		throws IOException
	{
		do
		{
			int i = zzbxl1.zzaeo();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #64  <Method int zzbxl.zzaeo()>
	//    2    4:istore_2        
			switch(i)
	//*   3    5:iload_2         
			{
	//*   4    6:lookupswitch    5: default 56
	//	               0: 59
	//	               10: 72
	//	               18: 83
	//	               26: 94
	//	               34: 105
	//*   5   56:goto            61
			case 0: // '\0'
				return this;
	//    6   59:aload_0         
	//    7   60:areturn         

			default:
				if(!super.zza(zzbxl1, i))
	//*   8   61:aload_0         
	//*   9   62:aload_1         
	//*  10   63:iload_2         
	//*  11   64:invokespecial   #67  <Method boolean zzbxn.zza(zzbxl, int)>
	//*  12   67:ifne            113
					return this;
	//   13   70:aload_0         
	//   14   71:areturn         
				break;

			case 10: // '\n'
				data = zzbxl1.readBytes();
	//   15   72:aload_0         
	//   16   73:aload_1         
	//   17   74:invokevirtual   #71  <Method byte[] zzbxl.readBytes()>
	//   18   77:putfield        #19  <Field byte[] data>
				break;

	//*  19   80:goto            113
			case 18: // '\022'
				zzcv = zzbxl1.readBytes();
	//   20   83:aload_0         
	//   21   84:aload_1         
	//   22   85:invokevirtual   #71  <Method byte[] zzbxl.readBytes()>
	//   23   88:putfield        #21  <Field byte[] zzcv>
				break;

	//*  24   91:goto            113
			case 26: // '\032'
				zzcw = zzbxl1.readBytes();
	//   25   94:aload_0         
	//   26   95:aload_1         
	//   27   96:invokevirtual   #71  <Method byte[] zzbxl.readBytes()>
	//   28   99:putfield        #23  <Field byte[] zzcw>
				break;

	//*  29  102:goto            113
			case 34: // '"'
				zzcx = zzbxl1.readBytes();
	//   30  105:aload_0         
	//   31  106:aload_1         
	//   32  107:invokevirtual   #71  <Method byte[] zzbxl.readBytes()>
	//   33  110:putfield        #25  <Field byte[] zzcx>
				break;
			}
		} while(true);
	//   34  113:goto            0
	}

	protected int zzu()
	{
		int j = super.zzu();
	//    0    0:aload_0         
	//    1    1:invokespecial   #74  <Method int zzbxn.zzu()>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(data != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #19  <Field byte[] data>
	//*   7   11:ifnull          25
			i = j + zzbxm.zzc(1, data);
	//    8   14:iload_2         
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #19  <Field byte[] data>
	//   12   20:invokestatic    #78  <Method int zzbxm.zzc(int, byte[])>
	//   13   23:iadd            
	//   14   24:istore_1        
		j = i;
	//   15   25:iload_1         
	//   16   26:istore_2        
		if(zzcv != null)
	//*  17   27:aload_0         
	//*  18   28:getfield        #21  <Field byte[] zzcv>
	//*  19   31:ifnull          45
			j = i + zzbxm.zzc(2, zzcv);
	//   20   34:iload_1         
	//   21   35:iconst_2        
	//   22   36:aload_0         
	//   23   37:getfield        #21  <Field byte[] zzcv>
	//   24   40:invokestatic    #78  <Method int zzbxm.zzc(int, byte[])>
	//   25   43:iadd            
	//   26   44:istore_2        
		i = j;
	//   27   45:iload_2         
	//   28   46:istore_1        
		if(zzcw != null)
	//*  29   47:aload_0         
	//*  30   48:getfield        #23  <Field byte[] zzcw>
	//*  31   51:ifnull          65
			i = j + zzbxm.zzc(3, zzcw);
	//   32   54:iload_2         
	//   33   55:iconst_3        
	//   34   56:aload_0         
	//   35   57:getfield        #23  <Field byte[] zzcw>
	//   36   60:invokestatic    #78  <Method int zzbxm.zzc(int, byte[])>
	//   37   63:iadd            
	//   38   64:istore_1        
		j = i;
	//   39   65:iload_1         
	//   40   66:istore_2        
		if(zzcx != null)
	//*  41   67:aload_0         
	//*  42   68:getfield        #25  <Field byte[] zzcx>
	//*  43   71:ifnull          85
			j = i + zzbxm.zzc(4, zzcx);
	//   44   74:iload_1         
	//   45   75:iconst_4        
	//   46   76:aload_0         
	//   47   77:getfield        #25  <Field byte[] zzcx>
	//   48   80:invokestatic    #78  <Method int zzbxm.zzc(int, byte[])>
	//   49   83:iadd            
	//   50   84:istore_2        
		return j;
	//   51   85:iload_2         
	//   52   86:ireturn         
	}

	public byte data[];
	public byte zzcv[];
	public byte zzcw[];
	public byte zzcx[];

	public zzag$zzd()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void zzbxn()>
		data = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #19  <Field byte[] data>
		zzcv = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #21  <Field byte[] zzcv>
		zzcw = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #23  <Field byte[] zzcw>
		zzcx = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #25  <Field byte[] zzcx>
		zzcuR = -1;
	//   14   24:aload_0         
	//   15   25:iconst_m1       
	//   16   26:putfield        #29  <Field int zzcuR>
	//   17   29:return          
	}
}
