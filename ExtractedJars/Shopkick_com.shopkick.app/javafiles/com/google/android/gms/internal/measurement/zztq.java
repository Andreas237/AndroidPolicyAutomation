// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzuv, zzts, zztt, zztr, 
//			zzwf, zzub, zzvv, zzte

public abstract class zztq
{

	private zztq()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		zzbtz = 100;
	//    2    4:aload_0         
	//    3    5:bipush          100
	//    4    7:putfield        #18  <Field int zzbtz>
		zzbua = 0x7fffffff;
	//    5   10:aload_0         
	//    6   11:ldc1            #19  <Int 0x7fffffff>
	//    7   13:putfield        #21  <Field int zzbua>
		zzbuc = false;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #23  <Field boolean zzbuc>
	//   11   21:return          
	}

	zztq(zztr zztr)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void zztq()>
	//    2    4:return          
	}

	static zztq zza(byte abyte0[], int i, int j, boolean flag)
	{
		abyte0 = ((byte []) (new zzts(abyte0, i, j, false, ((zztr) (null)))));
	//    0    0:new             #32  <Class zzts>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:iconst_0        
	//    6    8:aconst_null     
	//    7    9:invokespecial   #35  <Method void zzts(byte[], int, int, boolean, zztr)>
	//    8   12:astore_0        
		try
		{
			((zztq) (abyte0)).zzas(j);
	//    9   13:aload_0         
	//   10   14:iload_2         
	//   11   15:invokevirtual   #39  <Method int zzas(int)>
	//   12   18:pop             
		}
	//*  13   19:aload_0         
	//*  14   20:areturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  15   21:astore_0        
		{
			throw new IllegalArgumentException(((Throwable) (abyte0)));
	//   16   22:new             #41  <Class IllegalArgumentException>
	//   17   25:dup             
	//   18   26:aload_0         
	//   19   27:invokespecial   #44  <Method void IllegalArgumentException(Throwable)>
	//   20   30:athrow          
		}
		return ((zztq) (abyte0));
	}

	public static zztq zzd(byte abyte0[], int i, int j)
	{
		return zza(abyte0, i, j, false);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iconst_0        
	//    4    4:invokestatic    #48  <Method zztq zza(byte[], int, int, boolean)>
	//    5    7:areturn         
	}

	public abstract double readDouble()
		throws IOException;

	public abstract float readFloat()
		throws IOException;

	public abstract String readString()
		throws IOException;

	public abstract zzvv zza(zzwf zzwf, zzub zzub)
		throws IOException;

	public abstract void zzap(int i)
		throws zzuv;

	public abstract boolean zzaq(int i)
		throws IOException;

	public final int zzar(int i)
	{
		if(i >= 0)
	//*   0    0:iload_1         
	//*   1    1:iflt            16
		{
			int j = zzbtz;
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field int zzbtz>
	//    4    8:istore_2        
			zzbtz = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #18  <Field int zzbtz>
			return j;
	//    8   14:iload_2         
	//    9   15:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder(47);
	//   10   16:new             #64  <Class StringBuilder>
	//   11   19:dup             
	//   12   20:bipush          47
	//   13   22:invokespecial   #66  <Method void StringBuilder(int)>
	//   14   25:astore_3        
			stringbuilder.append("Recursion limit cannot be negative: ");
	//   15   26:aload_3         
	//   16   27:ldc1            #68  <String "Recursion limit cannot be negative: ">
	//   17   29:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   18   32:pop             
			stringbuilder.append(i);
	//   19   33:aload_3         
	//   20   34:iload_1         
	//   21   35:invokevirtual   #75  <Method StringBuilder StringBuilder.append(int)>
	//   22   38:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   23   39:new             #41  <Class IllegalArgumentException>
	//   24   42:dup             
	//   25   43:aload_3         
	//   26   44:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   27   47:invokespecial   #81  <Method void IllegalArgumentException(String)>
	//   28   50:athrow          
		}
	}

	public abstract int zzas(int i)
		throws zzuv;

	public abstract void zzat(int i);

	public abstract void zzau(int i)
		throws IOException;

	public abstract int zzuj()
		throws IOException;

	public abstract long zzuk()
		throws IOException;

	public abstract long zzul()
		throws IOException;

	public abstract int zzum()
		throws IOException;

	public abstract long zzun()
		throws IOException;

	public abstract int zzuo()
		throws IOException;

	public abstract boolean zzup()
		throws IOException;

	public abstract String zzuq()
		throws IOException;

	public abstract zzte zzur()
		throws IOException;

	public abstract int zzus()
		throws IOException;

	public abstract int zzut()
		throws IOException;

	public abstract int zzuu()
		throws IOException;

	public abstract long zzuv()
		throws IOException;

	public abstract int zzuw()
		throws IOException;

	public abstract long zzux()
		throws IOException;

	abstract long zzuy()
		throws IOException;

	public abstract boolean zzuz()
		throws IOException;

	public abstract int zzva();

	int zzbty;
	int zzbtz;
	private int zzbua;
	zztt zzbub;
	private boolean zzbuc;
}
