// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//			zzbut, zzad, zzbus, zzbul, 
//			zzbuw, zzbum

public static final class zzad$zza extends zzbut
{

	public static zzad$zza zzc(byte abyte0[])
		throws zzbus
	{
		return (zzad$zza)zzbut.zza(((zzbut) (new zzad$zza())), abyte0);
	//    0    0:new             #2   <Class zzad$zza>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void zzad$zza()>
	//    3    7:aload_0         
	//    4    8:invokestatic    #28  <Method zzbut zzbut.zza(zzbut, byte[])>
	//    5   11:checkcast       #2   <Class zzad$zza>
	//    6   14:areturn         
	}

	public zzad$zza zza(zzbul zzbul1)
		throws IOException
	{
		do
		{
			int i = zzbul1.zzacu();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #38  <Method int zzbul.zzacu()>
	//    2    4:istore_2        
			switch(i)
	//*   3    5:iload_2         
			{
	//*   4    6:lookupswitch    3: default 40
	//	               0: 48
	//	               10: 50
	//	               18: 79
			default:
				if(zzbuw.zzb(zzbul1, i))
					continue;
	//    5   40:aload_1         
	//    6   41:iload_2         
	//    7   42:invokestatic    #44  <Method boolean zzbuw.zzb(zzbul, int)>
	//    8   45:ifne            0
				// fall through

			case 0: // '\0'
				return this;
	//    9   48:aload_0         
	//   10   49:areturn         

			case 10: // '\n'
				if(zzaJ == null)
	//*  11   50:aload_0         
	//*  12   51:getfield        #46  <Field zzad$zzb zzaJ>
	//*  13   54:ifnonnull       68
					zzaJ = new zzad$zzb();
	//   14   57:aload_0         
	//   15   58:new             #48  <Class zzad$zzb>
	//   16   61:dup             
	//   17   62:invokespecial   #49  <Method void zzad$zzb()>
	//   18   65:putfield        #46  <Field zzad$zzb zzaJ>
				zzbul1.zza(((zzbut) (zzaJ)));
	//   19   68:aload_1         
	//   20   69:aload_0         
	//   21   70:getfield        #46  <Field zzad$zzb zzaJ>
	//   22   73:invokevirtual   #52  <Method void zzbul.zza(zzbut)>
				break;

	//*  23   76:goto            0
			case 18: // '\022'
				if(zzaK == null)
	//*  24   79:aload_0         
	//*  25   80:getfield        #54  <Field zzad$zzc zzaK>
	//*  26   83:ifnonnull       97
					zzaK = new zzad$zzc();
	//   27   86:aload_0         
	//   28   87:new             #56  <Class zzad$zzc>
	//   29   90:dup             
	//   30   91:invokespecial   #57  <Method void zzad$zzc()>
	//   31   94:putfield        #54  <Field zzad$zzc zzaK>
				zzbul1.zza(((zzbut) (zzaK)));
	//   32   97:aload_1         
	//   33   98:aload_0         
	//   34   99:getfield        #54  <Field zzad$zzc zzaK>
	//   35  102:invokevirtual   #52  <Method void zzbul.zza(zzbut)>
				break;
			}
		} while(true);
	//   36  105:goto            0
	}

	public void zza(zzbum zzbum1)
		throws IOException
	{
		if(zzaJ != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field zzad$zzb zzaJ>
	//*   2    4:ifnull          16
			zzbum1.zza(1, ((zzbut) (zzaJ)));
	//    3    7:aload_1         
	//    4    8:iconst_1        
	//    5    9:aload_0         
	//    6   10:getfield        #46  <Field zzad$zzb zzaJ>
	//    7   13:invokevirtual   #63  <Method void zzbum.zza(int, zzbut)>
		if(zzaK != null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #54  <Field zzad$zzc zzaK>
	//*  10   20:ifnull          32
			zzbum1.zza(2, ((zzbut) (zzaK)));
	//   11   23:aload_1         
	//   12   24:iconst_2        
	//   13   25:aload_0         
	//   14   26:getfield        #54  <Field zzad$zzc zzaK>
	//   15   29:invokevirtual   #63  <Method void zzbum.zza(int, zzbut)>
		super.zza(zzbum1);
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:invokespecial   #65  <Method void zzbut.zza(zzbum)>
	//   19   37:return          
	}

	public zzbut zzb(zzbul zzbul1)
		throws IOException
	{
		return ((zzbut) (zza(zzbul1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #68  <Method zzad$zza zza(zzbul)>
	//    3    5:areturn         
	}

	public zzad$zza zzu()
	{
		zzaJ = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #46  <Field zzad$zzb zzaJ>
		zzaK = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #54  <Field zzad$zzc zzaK>
		zzcsg = -1;
	//    6   10:aload_0         
	//    7   11:iconst_m1       
	//    8   12:putfield        #72  <Field int zzcsg>
		return this;
	//    9   15:aload_0         
	//   10   16:areturn         
	}

	protected int zzv()
	{
		int j = super.zzv();
	//    0    0:aload_0         
	//    1    1:invokespecial   #75  <Method int zzbut.zzv()>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(zzaJ != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #46  <Field zzad$zzb zzaJ>
	//*   7   11:ifnull          25
			i = j + zzbum.zzc(1, ((zzbut) (zzaJ)));
	//    8   14:iload_2         
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #46  <Field zzad$zzb zzaJ>
	//   12   20:invokestatic    #78  <Method int zzbum.zzc(int, zzbut)>
	//   13   23:iadd            
	//   14   24:istore_1        
		j = i;
	//   15   25:iload_1         
	//   16   26:istore_2        
		if(zzaK != null)
	//*  17   27:aload_0         
	//*  18   28:getfield        #54  <Field zzad$zzc zzaK>
	//*  19   31:ifnull          45
			j = i + zzbum.zzc(2, ((zzbut) (zzaK)));
	//   20   34:iload_1         
	//   21   35:iconst_2        
	//   22   36:aload_0         
	//   23   37:getfield        #54  <Field zzad$zzc zzaK>
	//   24   40:invokestatic    #78  <Method int zzbum.zzc(int, zzbut)>
	//   25   43:iadd            
	//   26   44:istore_2        
		return j;
	//   27   45:iload_2         
	//   28   46:ireturn         
	}

	public zzad$zzb zzaJ;
	public zzad$zzc zzaK;

	public zzad$zza()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void zzbut()>
		zzu();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #19  <Method zzad$zza zzu()>
	//    4    8:pop             
	//    5    9:return          
	}
}
