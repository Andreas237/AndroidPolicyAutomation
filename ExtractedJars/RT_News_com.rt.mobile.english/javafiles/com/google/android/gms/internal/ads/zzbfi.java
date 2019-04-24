// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbfh, zzbez, zzbfa, zzbfj

public abstract class zzbfi
{

	public zzbfi()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
		zzebt = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #12  <Field int zzebt>
	//    5    9:return          
	}

	public static final zzbfi zza(zzbfi zzbfi1, byte abyte0[])
		throws zzbfh
	{
		return zza(zzbfi1, abyte0, 0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_1         
	//    4    4:arraylength     
	//    5    5:invokestatic    #20  <Method zzbfi zza(zzbfi, byte[], int, int)>
	//    6    8:areturn         
	}

	private static final zzbfi zza(zzbfi zzbfi1, byte abyte0[], int i, int j)
		throws zzbfh
	{
		try
		{
			abyte0 = ((byte []) (zzbez.zzi(abyte0, 0, j)));
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:iload_3         
	//    3    3:invokestatic    #31  <Method zzbez zzbez.zzi(byte[], int, int)>
	//    4    6:astore_1        
			zzbfi1.zza(((zzbez) (abyte0)));
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:invokevirtual   #34  <Method zzbfi zza(zzbez)>
	//    8   12:pop             
			((zzbez) (abyte0)).zzbp(0);
	//    9   13:aload_1         
	//   10   14:iconst_0        
	//   11   15:invokevirtual   #38  <Method void zzbez.zzbp(int)>
		}
	//*  12   18:aload_0         
	//*  13   19:areturn         
	//*  14   20:astore_0        
	//*  15   21:new             #40  <Class RuntimeException>
	//*  16   24:dup             
	//*  17   25:ldc1            #42  <String "Reading from a byte array threw an IOException (should never happen).">
	//*  18   27:aload_0         
	//*  19   28:invokespecial   #45  <Method void RuntimeException(String, Throwable)>
	//*  20   31:athrow          
		// Misplaced declaration of an exception variable
		catch(zzbfi zzbfi1)
	//*  21   32:astore_0        
		{
			throw zzbfi1;
	//   22   33:aload_0         
	//   23   34:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(zzbfi zzbfi1)
		{
			throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", ((Throwable) (zzbfi1)));
		}
		return zzbfi1;
	}

	public static final byte[] zzb(zzbfi zzbfi1)
	{
		byte abyte0[] = new byte[zzbfi1.zzacw()];
	//    0    0:aload_0         
	//    1    1:invokevirtual   #52  <Method int zzacw()>
	//    2    4:newarray        byte[]
	//    3    6:astore_2        
		int i = abyte0.length;
	//    4    7:aload_2         
	//    5    8:arraylength     
	//    6    9:istore_1        
		try
		{
			zzbfa zzbfa1 = zzbfa.zzj(abyte0, 0, i);
	//    7   10:aload_2         
	//    8   11:iconst_0        
	//    9   12:iload_1         
	//   10   13:invokestatic    #58  <Method zzbfa zzbfa.zzj(byte[], int, int)>
	//   11   16:astore_3        
			zzbfi1.zza(zzbfa1);
	//   12   17:aload_0         
	//   13   18:aload_3         
	//   14   19:invokevirtual   #61  <Method void zza(zzbfa)>
			zzbfa1.zzacl();
	//   15   22:aload_3         
	//   16   23:invokevirtual   #64  <Method void zzbfa.zzacl()>
		}
	//*  17   26:aload_2         
	//*  18   27:areturn         
		// Misplaced declaration of an exception variable
		catch(zzbfi zzbfi1)
	//*  19   28:astore_0        
		{
			throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", ((Throwable) (zzbfi1)));
	//   20   29:new             #40  <Class RuntimeException>
	//   21   32:dup             
	//   22   33:ldc1            #66  <String "Serializing to a byte array threw an IOException (should never happen).">
	//   23   35:aload_0         
	//   24   36:invokespecial   #45  <Method void RuntimeException(String, Throwable)>
	//   25   39:athrow          
		}
		return abyte0;
	}

	public Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (zzago()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #74  <Method zzbfi zzago()>
	//    2    4:areturn         
	}

	public String toString()
	{
		return zzbfj.zzc(this);
	//    0    0:aload_0         
	//    1    1:invokestatic    #82  <Method String zzbfj.zzc(zzbfi)>
	//    2    4:areturn         
	}

	public abstract zzbfi zza(zzbez zzbez1)
		throws IOException;

	public void zza(zzbfa zzbfa1)
		throws IOException
	{
	//    0    0:return          
	}

	public final int zzacw()
	{
		int i = zzr();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #85  <Method int zzr()>
	//    2    4:istore_1        
		zzebt = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #12  <Field int zzebt>
		return i;
	//    6   10:iload_1         
	//    7   11:ireturn         
	}

	public zzbfi zzago()
		throws CloneNotSupportedException
	{
		return (zzbfi)super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #87  <Method Object Object.clone()>
	//    2    4:checkcast       #2   <Class zzbfi>
	//    3    7:areturn         
	}

	protected int zzr()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	protected volatile int zzebt;
}
