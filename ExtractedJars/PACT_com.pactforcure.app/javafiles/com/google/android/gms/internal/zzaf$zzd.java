// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//			zzbun, zzaf, zzbus, zzbut, 
//			zzbum, zzbul

public static final class zzaf$zzd extends zzbun
{

	public static zzaf$zzd zze(byte abyte0[])
		throws zzbus
	{
		return (zzaf$zzd)zzbut.zza(((zzbut) (new zzaf$zzd())), abyte0);
	//    0    0:new             #2   <Class zzaf$zzd>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void zzaf$zzd()>
	//    3    7:aload_0         
	//    4    8:invokestatic    #41  <Method zzbut zzbut.zza(zzbut, byte[])>
	//    5   11:checkcast       #2   <Class zzaf$zzd>
	//    6   14:areturn         
	}

	public void zza(zzbum zzbum1)
		throws IOException
	{
		if(data != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field byte[] data>
	//*   2    4:ifnull          16
			zzbum1.zzb(1, data);
	//    3    7:aload_1         
	//    4    8:iconst_1        
	//    5    9:aload_0         
	//    6   10:getfield        #19  <Field byte[] data>
	//    7   13:invokevirtual   #51  <Method void zzbum.zzb(int, byte[])>
		if(zzcu != null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #21  <Field byte[] zzcu>
	//*  10   20:ifnull          32
			zzbum1.zzb(2, zzcu);
	//   11   23:aload_1         
	//   12   24:iconst_2        
	//   13   25:aload_0         
	//   14   26:getfield        #21  <Field byte[] zzcu>
	//   15   29:invokevirtual   #51  <Method void zzbum.zzb(int, byte[])>
		if(zzcv != null)
	//*  16   32:aload_0         
	//*  17   33:getfield        #23  <Field byte[] zzcv>
	//*  18   36:ifnull          48
			zzbum1.zzb(3, zzcv);
	//   19   39:aload_1         
	//   20   40:iconst_3        
	//   21   41:aload_0         
	//   22   42:getfield        #23  <Field byte[] zzcv>
	//   23   45:invokevirtual   #51  <Method void zzbum.zzb(int, byte[])>
		if(zzcw != null)
	//*  24   48:aload_0         
	//*  25   49:getfield        #25  <Field byte[] zzcw>
	//*  26   52:ifnull          64
			zzbum1.zzb(4, zzcw);
	//   27   55:aload_1         
	//   28   56:iconst_4        
	//   29   57:aload_0         
	//   30   58:getfield        #25  <Field byte[] zzcw>
	//   31   61:invokevirtual   #51  <Method void zzbum.zzb(int, byte[])>
		super.zza(zzbum1);
	//   32   64:aload_0         
	//   33   65:aload_1         
	//   34   66:invokespecial   #53  <Method void zzbun.zza(zzbum)>
	//   35   69:return          
	}

	public zzbut zzb(zzbul zzbul1)
		throws IOException
	{
		return ((zzbut) (zzk(zzbul1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #58  <Method zzaf$zzd zzk(zzbul)>
	//    3    5:areturn         
	}

	public zzaf$zzd zzk(zzbul zzbul1)
		throws IOException
	{
		do
		{
			int i = zzbul1.zzacu();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #64  <Method int zzbul.zzacu()>
	//    2    4:istore_2        
			switch(i)
	//*   3    5:iload_2         
			{
	//*   4    6:lookupswitch    5: default 56
	//	               0: 65
	//	               10: 67
	//	               18: 78
	//	               26: 89
	//	               34: 100
			default:
				if(super.zza(zzbul1, i))
					continue;
	//    5   56:aload_0         
	//    6   57:aload_1         
	//    7   58:iload_2         
	//    8   59:invokespecial   #67  <Method boolean zzbun.zza(zzbul, int)>
	//    9   62:ifne            0
				// fall through

			case 0: // '\0'
				return this;
	//   10   65:aload_0         
	//   11   66:areturn         

			case 10: // '\n'
				data = zzbul1.readBytes();
	//   12   67:aload_0         
	//   13   68:aload_1         
	//   14   69:invokevirtual   #71  <Method byte[] zzbul.readBytes()>
	//   15   72:putfield        #19  <Field byte[] data>
				break;

	//*  16   75:goto            0
			case 18: // '\022'
				zzcu = zzbul1.readBytes();
	//   17   78:aload_0         
	//   18   79:aload_1         
	//   19   80:invokevirtual   #71  <Method byte[] zzbul.readBytes()>
	//   20   83:putfield        #21  <Field byte[] zzcu>
				break;

	//*  21   86:goto            0
			case 26: // '\032'
				zzcv = zzbul1.readBytes();
	//   22   89:aload_0         
	//   23   90:aload_1         
	//   24   91:invokevirtual   #71  <Method byte[] zzbul.readBytes()>
	//   25   94:putfield        #23  <Field byte[] zzcv>
				break;

	//*  26   97:goto            0
			case 34: // '"'
				zzcw = zzbul1.readBytes();
	//   27  100:aload_0         
	//   28  101:aload_1         
	//   29  102:invokevirtual   #71  <Method byte[] zzbul.readBytes()>
	//   30  105:putfield        #25  <Field byte[] zzcw>
				break;
			}
		} while(true);
	//   31  108:goto            0
	}

	protected int zzv()
	{
		int j = super.zzv();
	//    0    0:aload_0         
	//    1    1:invokespecial   #74  <Method int zzbun.zzv()>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(data != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #19  <Field byte[] data>
	//*   7   11:ifnull          25
			i = j + zzbum.zzc(1, data);
	//    8   14:iload_2         
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #19  <Field byte[] data>
	//   12   20:invokestatic    #78  <Method int zzbum.zzc(int, byte[])>
	//   13   23:iadd            
	//   14   24:istore_1        
		j = i;
	//   15   25:iload_1         
	//   16   26:istore_2        
		if(zzcu != null)
	//*  17   27:aload_0         
	//*  18   28:getfield        #21  <Field byte[] zzcu>
	//*  19   31:ifnull          45
			j = i + zzbum.zzc(2, zzcu);
	//   20   34:iload_1         
	//   21   35:iconst_2        
	//   22   36:aload_0         
	//   23   37:getfield        #21  <Field byte[] zzcu>
	//   24   40:invokestatic    #78  <Method int zzbum.zzc(int, byte[])>
	//   25   43:iadd            
	//   26   44:istore_2        
		i = j;
	//   27   45:iload_2         
	//   28   46:istore_1        
		if(zzcv != null)
	//*  29   47:aload_0         
	//*  30   48:getfield        #23  <Field byte[] zzcv>
	//*  31   51:ifnull          65
			i = j + zzbum.zzc(3, zzcv);
	//   32   54:iload_2         
	//   33   55:iconst_3        
	//   34   56:aload_0         
	//   35   57:getfield        #23  <Field byte[] zzcv>
	//   36   60:invokestatic    #78  <Method int zzbum.zzc(int, byte[])>
	//   37   63:iadd            
	//   38   64:istore_1        
		j = i;
	//   39   65:iload_1         
	//   40   66:istore_2        
		if(zzcw != null)
	//*  41   67:aload_0         
	//*  42   68:getfield        #25  <Field byte[] zzcw>
	//*  43   71:ifnull          85
			j = i + zzbum.zzc(4, zzcw);
	//   44   74:iload_1         
	//   45   75:iconst_4        
	//   46   76:aload_0         
	//   47   77:getfield        #25  <Field byte[] zzcw>
	//   48   80:invokestatic    #78  <Method int zzbum.zzc(int, byte[])>
	//   49   83:iadd            
	//   50   84:istore_2        
		return j;
	//   51   85:iload_2         
	//   52   86:ireturn         
	}

	public byte data[];
	public byte zzcu[];
	public byte zzcv[];
	public byte zzcw[];

	public zzaf$zzd()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void zzbun()>
		data = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #19  <Field byte[] data>
		zzcu = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #21  <Field byte[] zzcu>
		zzcv = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #23  <Field byte[] zzcv>
		zzcw = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #25  <Field byte[] zzcw>
		zzcsg = -1;
	//   14   24:aload_0         
	//   15   25:iconst_m1       
	//   16   26:putfield        #29  <Field int zzcsg>
	//   17   29:return          
	}
}
