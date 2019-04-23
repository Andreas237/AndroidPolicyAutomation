// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zzjs, zzjl, zzjk, zzju

public abstract class zzjt
{

	public zzjt()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
		zzadp = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #12  <Field int zzadp>
	//    5    9:return          
	}

	public static final zzjt zza(zzjt zzjt1, byte abyte0[])
		throws zzjs
	{
		return zzb(zzjt1, abyte0, 0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_1         
	//    4    4:arraylength     
	//    5    5:invokestatic    #21  <Method zzjt zzb(zzjt, byte[], int, int)>
	//    6    8:areturn         
	}

	public static final void zza(zzjt zzjt1, byte abyte0[], int i, int j)
	{
		try
		{
			abyte0 = ((byte []) (zzjl.zzl(abyte0, 0, j)));
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:iload_3         
	//    3    3:invokestatic    #33  <Method zzjl zzjl.zzl(byte[], int, int)>
	//    4    6:astore_1        
			zzjt1.zza(((zzjl) (abyte0)));
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:invokevirtual   #36  <Method void zza(zzjl)>
			((zzjl) (abyte0)).zzea();
	//    8   12:aload_1         
	//    9   13:invokevirtual   #39  <Method void zzjl.zzea()>
			return;
	//   10   16:return          
		}
		// Misplaced declaration of an exception variable
		catch(zzjt zzjt1)
	//*  11   17:astore_0        
		{
			throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", ((Throwable) (zzjt1)));
	//   12   18:new             #41  <Class RuntimeException>
	//   13   21:dup             
	//   14   22:ldc1            #43  <String "Serializing to a byte array threw an IOException (should never happen).">
	//   15   24:aload_0         
	//   16   25:invokespecial   #46  <Method void RuntimeException(String, Throwable)>
	//   17   28:athrow          
		}
	}

	private static final zzjt zzb(zzjt zzjt1, byte abyte0[], int i, int j)
		throws zzjs
	{
		try
		{
			abyte0 = ((byte []) (zzjk.zzk(abyte0, 0, j)));
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:iload_3         
	//    3    3:invokestatic    #52  <Method zzjk zzjk.zzk(byte[], int, int)>
	//    4    6:astore_1        
			zzjt1.zza(((zzjk) (abyte0)));
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:invokevirtual   #55  <Method zzjt zza(zzjk)>
	//    8   12:pop             
			((zzjk) (abyte0)).zzak(0);
	//    9   13:aload_1         
	//   10   14:iconst_0        
	//   11   15:invokevirtual   #59  <Method void zzjk.zzak(int)>
		}
	//*  12   18:aload_0         
	//*  13   19:areturn         
	//*  14   20:astore_0        
	//*  15   21:new             #41  <Class RuntimeException>
	//*  16   24:dup             
	//*  17   25:ldc1            #61  <String "Reading from a byte array threw an IOException (should never happen).">
	//*  18   27:aload_0         
	//*  19   28:invokespecial   #46  <Method void RuntimeException(String, Throwable)>
	//*  20   31:athrow          
		// Misplaced declaration of an exception variable
		catch(zzjt zzjt1)
	//*  21   32:astore_0        
		{
			throw zzjt1;
	//   22   33:aload_0         
	//   23   34:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(zzjt zzjt1)
		{
			throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", ((Throwable) (zzjt1)));
		}
		return zzjt1;
	}

	public Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (zzhr()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #70  <Method zzjt zzhr()>
	//    2    4:areturn         
	}

	public String toString()
	{
		return zzju.zzb(this);
	//    0    0:aload_0         
	//    1    1:invokestatic    #77  <Method String zzju.zzb(zzjt)>
	//    2    4:areturn         
	}

	public abstract zzjt zza(zzjk zzjk1)
		throws IOException;

	public void zza(zzjl zzjl1)
		throws IOException
	{
	//    0    0:return          
	}

	public final int zzeq()
	{
		int i = zzt();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #82  <Method int zzt()>
	//    2    4:istore_1        
		zzadp = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #12  <Field int zzadp>
		return i;
	//    6   10:iload_1         
	//    7   11:ireturn         
	}

	public zzjt zzhr()
		throws CloneNotSupportedException
	{
		return (zzjt)super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #84  <Method Object Object.clone()>
	//    2    4:checkcast       #2   <Class zzjt>
	//    3    7:areturn         
	}

	protected int zzt()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	protected volatile int zzadp;
}
