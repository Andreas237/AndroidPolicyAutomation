// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//			zzbus, zzbum, zzbul, zzbuu

public abstract class zzbut
{

	public zzbut()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
		zzcsg = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #12  <Field int zzcsg>
	//    5    9:return          
	}

	public static final zzbut zza(zzbut zzbut1, byte abyte0[])
		throws zzbus
	{
		return zzb(zzbut1, abyte0, 0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_1         
	//    4    4:arraylength     
	//    5    5:invokestatic    #21  <Method zzbut zzb(zzbut, byte[], int, int)>
	//    6    8:areturn         
	}

	public static final void zza(zzbut zzbut1, byte abyte0[], int i, int j)
	{
		try
		{
			abyte0 = ((byte []) (zzbum.zzc(abyte0, i, j)));
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:invokestatic    #33  <Method zzbum zzbum.zzc(byte[], int, int)>
	//    4    6:astore_1        
			zzbut1.zza(((zzbum) (abyte0)));
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:invokevirtual   #36  <Method void zza(zzbum)>
			((zzbum) (abyte0)).zzacM();
	//    8   12:aload_1         
	//    9   13:invokevirtual   #39  <Method void zzbum.zzacM()>
			return;
	//   10   16:return          
		}
		// Misplaced declaration of an exception variable
		catch(zzbut zzbut1)
	//*  11   17:astore_0        
		{
			throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", ((Throwable) (zzbut1)));
	//   12   18:new             #41  <Class RuntimeException>
	//   13   21:dup             
	//   14   22:ldc1            #43  <String "Serializing to a byte array threw an IOException (should never happen).">
	//   15   24:aload_0         
	//   16   25:invokespecial   #46  <Method void RuntimeException(String, Throwable)>
	//   17   28:athrow          
		}
	}

	public static final zzbut zzb(zzbut zzbut1, byte abyte0[], int i, int j)
		throws zzbus
	{
		try
		{
			abyte0 = ((byte []) (zzbul.zzb(abyte0, i, j)));
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:invokestatic    #51  <Method zzbul zzbul.zzb(byte[], int, int)>
	//    4    6:astore_1        
			zzbut1.zzb(((zzbul) (abyte0)));
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:invokevirtual   #54  <Method zzbut zzb(zzbul)>
	//    8   12:pop             
			((zzbul) (abyte0)).zzqg(0);
	//    9   13:aload_1         
	//   10   14:iconst_0        
	//   11   15:invokevirtual   #58  <Method void zzbul.zzqg(int)>
		}
	//*  12   18:aload_0         
	//*  13   19:areturn         
		// Misplaced declaration of an exception variable
		catch(zzbut zzbut1)
	//*  14   20:astore_0        
		{
			throw zzbut1;
	//   15   21:aload_0         
	//   16   22:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(zzbut zzbut1)
	//*  17   23:astore_0        
		{
			throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
	//   18   24:new             #41  <Class RuntimeException>
	//   19   27:dup             
	//   20   28:ldc1            #60  <String "Reading from a byte array threw an IOException (should never happen).">
	//   21   30:invokespecial   #63  <Method void RuntimeException(String)>
	//   22   33:athrow          
		}
		return zzbut1;
	}

	public static final byte[] zzf(zzbut zzbut1)
	{
		byte abyte0[] = new byte[zzbut1.zzacZ()];
	//    0    0:aload_0         
	//    1    1:invokevirtual   #70  <Method int zzacZ()>
	//    2    4:newarray        byte[]
	//    3    6:astore_1        
		zza(zzbut1, abyte0, 0, abyte0.length);
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:iconst_0        
	//    7   10:aload_1         
	//    8   11:arraylength     
	//    9   12:invokestatic    #72  <Method void zza(zzbut, byte[], int, int)>
		return abyte0;
	//   10   15:aload_1         
	//   11   16:areturn         
	}

	public Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (zzacO()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #80  <Method zzbut zzacO()>
	//    2    4:areturn         
	}

	public String toString()
	{
		return zzbuu.zzg(this);
	//    0    0:aload_0         
	//    1    1:invokestatic    #88  <Method String zzbuu.zzg(zzbut)>
	//    2    4:areturn         
	}

	public void zza(zzbum zzbum1)
		throws IOException
	{
	//    0    0:return          
	}

	public zzbut zzacO()
		throws CloneNotSupportedException
	{
		return (zzbut)super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #90  <Method Object Object.clone()>
	//    2    4:checkcast       #2   <Class zzbut>
	//    3    7:areturn         
	}

	public int zzacY()
	{
		if(zzcsg < 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field int zzcsg>
	//*   2    4:ifge            12
			zzacZ();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #70  <Method int zzacZ()>
	//    5   11:pop             
		return zzcsg;
	//    6   12:aload_0         
	//    7   13:getfield        #12  <Field int zzcsg>
	//    8   16:ireturn         
	}

	public int zzacZ()
	{
		int i = zzv();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #94  <Method int zzv()>
	//    2    4:istore_1        
		zzcsg = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #12  <Field int zzcsg>
		return i;
	//    6   10:iload_1         
	//    7   11:ireturn         
	}

	public abstract zzbut zzb(zzbul zzbul1)
		throws IOException;

	protected int zzv()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	protected volatile int zzcsg;
}
