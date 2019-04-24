// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzya, zzyh, zzxz, zzyj

public abstract class zzyi
{

	public zzyi()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
		zzcff = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #12  <Field int zzcff>
	//    5    9:return          
	}

	public static final zzyi zza(zzyi zzyi1, byte abyte0[])
	{
		return zzb(zzyi1, abyte0, 0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_1         
	//    4    4:arraylength     
	//    5    5:invokestatic    #19  <Method zzyi zzb(zzyi, byte[], int, int)>
	//    6    8:areturn         
	}

	public static final void zza(zzyi zzyi1, byte abyte0[], int i, int j)
	{
		try
		{
			abyte0 = ((byte []) (zzya.zzk(abyte0, 0, j)));
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:iload_3         
	//    3    3:invokestatic    #30  <Method zzya zzya.zzk(byte[], int, int)>
	//    4    6:astore_1        
			zzyi1.zza(((zzya) (abyte0)));
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:invokevirtual   #33  <Method void zza(zzya)>
			((zzya) (abyte0)).zzza();
	//    8   12:aload_1         
	//    9   13:invokevirtual   #36  <Method void zzya.zzza()>
			return;
	//   10   16:return          
		}
		// Misplaced declaration of an exception variable
		catch(zzyi zzyi1)
	//*  11   17:astore_0        
		{
			throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", ((Throwable) (zzyi1)));
	//   12   18:new             #38  <Class RuntimeException>
	//   13   21:dup             
	//   14   22:ldc1            #40  <String "Serializing to a byte array threw an IOException (should never happen).">
	//   15   24:aload_0         
	//   16   25:invokespecial   #43  <Method void RuntimeException(String, Throwable)>
	//   17   28:athrow          
		}
	}

	private static final zzyi zzb(zzyi zzyi1, byte abyte0[], int i, int j)
	{
		try
		{
			abyte0 = ((byte []) (zzxz.zzj(abyte0, 0, j)));
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:iload_3         
	//    3    3:invokestatic    #51  <Method zzxz zzxz.zzj(byte[], int, int)>
	//    4    6:astore_1        
			zzyi1.zza(((zzxz) (abyte0)));
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:invokevirtual   #54  <Method zzyi zza(zzxz)>
	//    8   12:pop             
			((zzxz) (abyte0)).zzap(0);
	//    9   13:aload_1         
	//   10   14:iconst_0        
	//   11   15:invokevirtual   #58  <Method void zzxz.zzap(int)>
		}
	//*  12   18:aload_0         
	//*  13   19:areturn         
	//*  14   20:astore_0        
	//*  15   21:new             #38  <Class RuntimeException>
	//*  16   24:dup             
	//*  17   25:ldc1            #60  <String "Reading from a byte array threw an IOException (should never happen).">
	//*  18   27:aload_0         
	//*  19   28:invokespecial   #43  <Method void RuntimeException(String, Throwable)>
	//*  20   31:athrow          
		// Misplaced declaration of an exception variable
		catch(zzyi zzyi1)
	//*  21   32:astore_0        
		{
			throw zzyi1;
	//   22   33:aload_0         
	//   23   34:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(zzyi zzyi1)
		{
			throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", ((Throwable) (zzyi1)));
		}
		return zzyi1;
	}

	public Object clone()
	{
		return ((Object) (zzzb()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #67  <Method zzyi zzzb()>
	//    2    4:areturn         
	}

	public String toString()
	{
		return zzyj.zzc(this);
	//    0    0:aload_0         
	//    1    1:invokestatic    #75  <Method String zzyj.zzc(zzyi)>
	//    2    4:areturn         
	}

	public abstract zzyi zza(zzxz zzxz1);

	public void zza(zzya zzya1)
	{
	//    0    0:return          
	}

	protected int zzf()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final int zzvx()
	{
		int i = zzf();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #80  <Method int zzf()>
	//    2    4:istore_1        
		zzcff = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #12  <Field int zzcff>
		return i;
	//    6   10:iload_1         
	//    7   11:ireturn         
	}

	public zzyi zzzb()
	{
		return (zzyi)super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #82  <Method Object Object.clone()>
	//    2    4:checkcast       #2   <Class zzyi>
	//    3    7:areturn         
	}

	public final int zzzh()
	{
		if(zzcff < 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field int zzcff>
	//*   2    4:ifge            12
			zzvx();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #85  <Method int zzvx()>
	//    5   11:pop             
		return zzcff;
	//    6   12:aload_0         
	//    7   13:getfield        #12  <Field int zzcff>
	//    8   16:ireturn         
	}

	protected volatile int zzcff;
}
