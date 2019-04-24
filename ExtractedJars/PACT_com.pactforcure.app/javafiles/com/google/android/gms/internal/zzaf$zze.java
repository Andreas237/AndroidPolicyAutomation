// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//			zzbun, zzaf, zzbum, zzbul, 
//			zzbut

public static final class zzaf$zze extends zzbun
{

	public void zza(zzbum zzbum1)
		throws IOException
	{
		if(zzcn != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field Long zzcn>
	//*   2    4:ifnull          19
			zzbum1.zzb(1, zzcn.longValue());
	//    3    7:aload_1         
	//    4    8:iconst_1        
	//    5    9:aload_0         
	//    6   10:getfield        #20  <Field Long zzcn>
	//    7   13:invokevirtual   #39  <Method long Long.longValue()>
	//    8   16:invokevirtual   #45  <Method void zzbum.zzb(int, long)>
		if(zzcx != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #22  <Field String zzcx>
	//*  11   23:ifnull          35
			zzbum1.zzq(3, zzcx);
	//   12   26:aload_1         
	//   13   27:iconst_3        
	//   14   28:aload_0         
	//   15   29:getfield        #22  <Field String zzcx>
	//   16   32:invokevirtual   #49  <Method void zzbum.zzq(int, String)>
		if(zzcy != null)
	//*  17   35:aload_0         
	//*  18   36:getfield        #24  <Field byte[] zzcy>
	//*  19   39:ifnull          51
			zzbum1.zzb(4, zzcy);
	//   20   42:aload_1         
	//   21   43:iconst_4        
	//   22   44:aload_0         
	//   23   45:getfield        #24  <Field byte[] zzcy>
	//   24   48:invokevirtual   #52  <Method void zzbum.zzb(int, byte[])>
		super.zza(zzbum1);
	//   25   51:aload_0         
	//   26   52:aload_1         
	//   27   53:invokespecial   #54  <Method void zzbun.zza(zzbum)>
	//   28   56:return          
	}

	public zzbut zzb(zzbul zzbul1)
		throws IOException
	{
		return ((zzbut) (zzl(zzbul1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #60  <Method zzaf$zze zzl(zzbul)>
	//    3    5:areturn         
	}

	public zzaf$zze zzl(zzbul zzbul1)
		throws IOException
	{
		do
		{
			int i = zzbul1.zzacu();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #66  <Method int zzbul.zzacu()>
	//    2    4:istore_2        
			switch(i)
	//*   3    5:iload_2         
			{
	//*   4    6:lookupswitch    4: default 48
	//	               0: 57
	//	               8: 59
	//	               26: 73
	//	               34: 84
			default:
				if(super.zza(zzbul1, i))
					continue;
	//    5   48:aload_0         
	//    6   49:aload_1         
	//    7   50:iload_2         
	//    8   51:invokespecial   #69  <Method boolean zzbun.zza(zzbul, int)>
	//    9   54:ifne            0
				// fall through

			case 0: // '\0'
				return this;
	//   10   57:aload_0         
	//   11   58:areturn         

			case 8: // '\b'
				zzcn = Long.valueOf(zzbul1.zzacx());
	//   12   59:aload_0         
	//   13   60:aload_1         
	//   14   61:invokevirtual   #72  <Method long zzbul.zzacx()>
	//   15   64:invokestatic    #76  <Method Long Long.valueOf(long)>
	//   16   67:putfield        #20  <Field Long zzcn>
				break;

	//*  17   70:goto            0
			case 26: // '\032'
				zzcx = zzbul1.readString();
	//   18   73:aload_0         
	//   19   74:aload_1         
	//   20   75:invokevirtual   #80  <Method String zzbul.readString()>
	//   21   78:putfield        #22  <Field String zzcx>
				break;

	//*  22   81:goto            0
			case 34: // '"'
				zzcy = zzbul1.readBytes();
	//   23   84:aload_0         
	//   24   85:aload_1         
	//   25   86:invokevirtual   #84  <Method byte[] zzbul.readBytes()>
	//   26   89:putfield        #24  <Field byte[] zzcy>
				break;
			}
		} while(true);
	//   27   92:goto            0
	}

	protected int zzv()
	{
		int j = super.zzv();
	//    0    0:aload_0         
	//    1    1:invokespecial   #87  <Method int zzbun.zzv()>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(zzcn != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #20  <Field Long zzcn>
	//*   7   11:ifnull          28
			i = j + zzbum.zzf(1, zzcn.longValue());
	//    8   14:iload_2         
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #20  <Field Long zzcn>
	//   12   20:invokevirtual   #39  <Method long Long.longValue()>
	//   13   23:invokestatic    #91  <Method int zzbum.zzf(int, long)>
	//   14   26:iadd            
	//   15   27:istore_1        
		j = i;
	//   16   28:iload_1         
	//   17   29:istore_2        
		if(zzcx != null)
	//*  18   30:aload_0         
	//*  19   31:getfield        #22  <Field String zzcx>
	//*  20   34:ifnull          48
			j = i + zzbum.zzr(3, zzcx);
	//   21   37:iload_1         
	//   22   38:iconst_3        
	//   23   39:aload_0         
	//   24   40:getfield        #22  <Field String zzcx>
	//   25   43:invokestatic    #95  <Method int zzbum.zzr(int, String)>
	//   26   46:iadd            
	//   27   47:istore_2        
		i = j;
	//   28   48:iload_2         
	//   29   49:istore_1        
		if(zzcy != null)
	//*  30   50:aload_0         
	//*  31   51:getfield        #24  <Field byte[] zzcy>
	//*  32   54:ifnull          68
			i = j + zzbum.zzc(4, zzcy);
	//   33   57:iload_2         
	//   34   58:iconst_4        
	//   35   59:aload_0         
	//   36   60:getfield        #24  <Field byte[] zzcy>
	//   37   63:invokestatic    #99  <Method int zzbum.zzc(int, byte[])>
	//   38   66:iadd            
	//   39   67:istore_1        
		return i;
	//   40   68:iload_1         
	//   41   69:ireturn         
	}

	public Long zzcn;
	public String zzcx;
	public byte zzcy[];

	public zzaf$zze()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void zzbun()>
		zzcn = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #20  <Field Long zzcn>
		zzcx = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #22  <Field String zzcx>
		zzcy = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #24  <Field byte[] zzcy>
		zzcsg = -1;
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #28  <Field int zzcsg>
	//   14   24:return          
	}
}
