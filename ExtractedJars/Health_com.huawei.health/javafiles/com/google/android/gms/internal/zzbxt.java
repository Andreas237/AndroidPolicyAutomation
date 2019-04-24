// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//			zzbxs, zzbxm, zzbxl, zzbxu

public abstract class zzbxt
{

	public zzbxt()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
		zzcuR = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #12  <Field int zzcuR>
	//    5    9:return          
	}

	public static final zzbxt zza(zzbxt zzbxt1, byte abyte0[])
		throws zzbxs
	{
		return zzb(zzbxt1, abyte0, 0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_1         
	//    4    4:arraylength     
	//    5    5:invokestatic    #21  <Method zzbxt zzb(zzbxt, byte[], int, int)>
	//    6    8:areturn         
	}

	public static final void zza(zzbxt zzbxt1, byte abyte0[], int i, int j)
	{
		try
		{
			abyte0 = ((byte []) (zzbxm.zzc(abyte0, i, j)));
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:invokestatic    #33  <Method zzbxm zzbxm.zzc(byte[], int, int)>
	//    4    6:astore_1        
			zzbxt1.zza(((zzbxm) (abyte0)));
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:invokevirtual   #36  <Method void zza(zzbxm)>
			((zzbxm) (abyte0)).zzaeG();
	//    8   12:aload_1         
	//    9   13:invokevirtual   #39  <Method void zzbxm.zzaeG()>
			return;
	//   10   16:return          
		}
		// Misplaced declaration of an exception variable
		catch(zzbxt zzbxt1)
	//*  11   17:astore_0        
		{
			throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", ((Throwable) (zzbxt1)));
	//   12   18:new             #41  <Class RuntimeException>
	//   13   21:dup             
	//   14   22:ldc1            #43  <String "Serializing to a byte array threw an IOException (should never happen).">
	//   15   24:aload_0         
	//   16   25:invokespecial   #46  <Method void RuntimeException(String, Throwable)>
	//   17   28:athrow          
		}
	}

	public static final zzbxt zzb(zzbxt zzbxt1, byte abyte0[], int i, int j)
		throws zzbxs
	{
		try
		{
			abyte0 = ((byte []) (zzbxl.zzb(abyte0, i, j)));
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:invokestatic    #51  <Method zzbxl zzbxl.zzb(byte[], int, int)>
	//    4    6:astore_1        
			zzbxt1.zzb(((zzbxl) (abyte0)));
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:invokevirtual   #54  <Method zzbxt zzb(zzbxl)>
	//    8   12:pop             
			((zzbxl) (abyte0)).zzqX(0);
	//    9   13:aload_1         
	//   10   14:iconst_0        
	//   11   15:invokevirtual   #58  <Method void zzbxl.zzqX(int)>
		}
	//*  12   18:aload_0         
	//*  13   19:areturn         
		// Misplaced declaration of an exception variable
		catch(zzbxt zzbxt1)
	//*  14   20:astore_0        
		{
			throw zzbxt1;
	//   15   21:aload_0         
	//   16   22:athrow          
		}
	//*  17   23:new             #41  <Class RuntimeException>
	//*  18   26:dup             
	//*  19   27:ldc1            #60  <String "Reading from a byte array threw an IOException (should never happen).">
	//*  20   29:invokespecial   #63  <Method void RuntimeException(String)>
	//*  21   32:athrow          
		// Misplaced declaration of an exception variable
		catch(zzbxt zzbxt1)
		{
			throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
		}
		return zzbxt1;
	//*  22   33:astore_0        
	//*  23   34:goto            23
	}

	public static final byte[] zzf(zzbxt zzbxt1)
	{
		byte abyte0[] = new byte[zzbxt1.zzaeT()];
	//    0    0:aload_0         
	//    1    1:invokevirtual   #70  <Method int zzaeT()>
	//    2    4:newarray        byte[]
	//    3    6:astore_1        
		zza(zzbxt1, abyte0, 0, abyte0.length);
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:iconst_0        
	//    7   10:aload_1         
	//    8   11:arraylength     
	//    9   12:invokestatic    #72  <Method void zza(zzbxt, byte[], int, int)>
		return abyte0;
	//   10   15:aload_1         
	//   11   16:areturn         
	}

	public Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (zzaeI()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #80  <Method zzbxt zzaeI()>
	//    2    4:areturn         
	}

	public String toString()
	{
		return zzbxu.zzg(this);
	//    0    0:aload_0         
	//    1    1:invokestatic    #88  <Method String zzbxu.zzg(zzbxt)>
	//    2    4:areturn         
	}

	public void zza(zzbxm zzbxm1)
		throws IOException
	{
	//    0    0:return          
	}

	public zzbxt zzaeI()
		throws CloneNotSupportedException
	{
		return (zzbxt)super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #90  <Method Object Object.clone()>
	//    2    4:checkcast       #2   <Class zzbxt>
	//    3    7:areturn         
	}

	public int zzaeS()
	{
		if(zzcuR < 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field int zzcuR>
	//*   2    4:ifge            12
			zzaeT();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #70  <Method int zzaeT()>
	//    5   11:pop             
		return zzcuR;
	//    6   12:aload_0         
	//    7   13:getfield        #12  <Field int zzcuR>
	//    8   16:ireturn         
	}

	public int zzaeT()
	{
		int i = zzu();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #94  <Method int zzu()>
	//    2    4:istore_1        
		zzcuR = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #12  <Field int zzcuR>
		return i;
	//    6   10:iload_1         
	//    7   11:ireturn         
	}

	public abstract zzbxt zzb(zzbxl zzbxl1)
		throws IOException;

	protected int zzu()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	protected volatile int zzcuR;
}
