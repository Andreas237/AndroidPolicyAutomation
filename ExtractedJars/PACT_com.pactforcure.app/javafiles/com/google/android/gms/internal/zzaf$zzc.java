// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//			zzbun, zzaf, zzbum, zzbul, 
//			zzbut

public static final class zzaf$zzc extends zzbun
{

	public void zza(zzbum zzbum1)
		throws IOException
	{
		if(zzcs != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field byte[] zzcs>
	//*   2    4:ifnull          16
			zzbum1.zzb(1, zzcs);
	//    3    7:aload_1         
	//    4    8:iconst_1        
	//    5    9:aload_0         
	//    6   10:getfield        #17  <Field byte[] zzcs>
	//    7   13:invokevirtual   #34  <Method void zzbum.zzb(int, byte[])>
		if(zzct != null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #19  <Field byte[] zzct>
	//*  10   20:ifnull          32
			zzbum1.zzb(2, zzct);
	//   11   23:aload_1         
	//   12   24:iconst_2        
	//   13   25:aload_0         
	//   14   26:getfield        #19  <Field byte[] zzct>
	//   15   29:invokevirtual   #34  <Method void zzbum.zzb(int, byte[])>
		super.zza(zzbum1);
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:invokespecial   #36  <Method void zzbun.zza(zzbum)>
	//   19   37:return          
	}

	public zzbut zzb(zzbul zzbul1)
		throws IOException
	{
		return ((zzbut) (zzj(zzbul1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #42  <Method zzaf$zzc zzj(zzbul)>
	//    3    5:areturn         
	}

	public zzaf$zzc zzj(zzbul zzbul1)
		throws IOException
	{
		do
		{
			int i = zzbul1.zzacu();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #48  <Method int zzbul.zzacu()>
	//    2    4:istore_2        
			switch(i)
	//*   3    5:iload_2         
			{
	//*   4    6:lookupswitch    3: default 40
	//	               0: 49
	//	               10: 51
	//	               18: 62
			default:
				if(super.zza(zzbul1, i))
					continue;
	//    5   40:aload_0         
	//    6   41:aload_1         
	//    7   42:iload_2         
	//    8   43:invokespecial   #51  <Method boolean zzbun.zza(zzbul, int)>
	//    9   46:ifne            0
				// fall through

			case 0: // '\0'
				return this;
	//   10   49:aload_0         
	//   11   50:areturn         

			case 10: // '\n'
				zzcs = zzbul1.readBytes();
	//   12   51:aload_0         
	//   13   52:aload_1         
	//   14   53:invokevirtual   #55  <Method byte[] zzbul.readBytes()>
	//   15   56:putfield        #17  <Field byte[] zzcs>
				break;

	//*  16   59:goto            0
			case 18: // '\022'
				zzct = zzbul1.readBytes();
	//   17   62:aload_0         
	//   18   63:aload_1         
	//   19   64:invokevirtual   #55  <Method byte[] zzbul.readBytes()>
	//   20   67:putfield        #19  <Field byte[] zzct>
				break;
			}
		} while(true);
	//   21   70:goto            0
	}

	protected int zzv()
	{
		int j = super.zzv();
	//    0    0:aload_0         
	//    1    1:invokespecial   #58  <Method int zzbun.zzv()>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(zzcs != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #17  <Field byte[] zzcs>
	//*   7   11:ifnull          25
			i = j + zzbum.zzc(1, zzcs);
	//    8   14:iload_2         
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #17  <Field byte[] zzcs>
	//   12   20:invokestatic    #61  <Method int zzbum.zzc(int, byte[])>
	//   13   23:iadd            
	//   14   24:istore_1        
		j = i;
	//   15   25:iload_1         
	//   16   26:istore_2        
		if(zzct != null)
	//*  17   27:aload_0         
	//*  18   28:getfield        #19  <Field byte[] zzct>
	//*  19   31:ifnull          45
			j = i + zzbum.zzc(2, zzct);
	//   20   34:iload_1         
	//   21   35:iconst_2        
	//   22   36:aload_0         
	//   23   37:getfield        #19  <Field byte[] zzct>
	//   24   40:invokestatic    #61  <Method int zzbum.zzc(int, byte[])>
	//   25   43:iadd            
	//   26   44:istore_2        
		return j;
	//   27   45:iload_2         
	//   28   46:ireturn         
	}

	public byte zzcs[];
	public byte zzct[];

	public zzaf$zzc()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void zzbun()>
		zzcs = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #17  <Field byte[] zzcs>
		zzct = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #19  <Field byte[] zzct>
		zzcsg = -1;
	//    8   14:aload_0         
	//    9   15:iconst_m1       
	//   10   16:putfield        #23  <Field int zzcsg>
	//   11   19:return          
	}
}
