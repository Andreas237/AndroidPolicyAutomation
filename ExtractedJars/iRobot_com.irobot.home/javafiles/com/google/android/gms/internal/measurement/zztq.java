// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;


// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzuv, zzts, zztt, zztr, 
//			zzwf, zzub, zzvv, zzte

public abstract class zztq
{

	private zztq()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		zzbub = 100;
	//    2    4:aload_0         
	//    3    5:bipush          100
	//    4    7:putfield        #18  <Field int zzbub>
		zzbuc = 0x7fffffff;
	//    5   10:aload_0         
	//    6   11:ldc1            #19  <Int 0x7fffffff>
	//    7   13:putfield        #21  <Field int zzbuc>
		zzbue = false;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #23  <Field boolean zzbue>
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

	public abstract double readDouble();

	public abstract float readFloat();

	public abstract String readString();

	public abstract zzvv zza(zzwf zzwf, zzub zzub);

	public abstract void zzap(int i);

	public abstract boolean zzaq(int i);

	public final int zzar(int i)
	{
		if(i < 0)
	//*   0    0:iload_1         
	//*   1    1:ifge            39
		{
			StringBuilder stringbuilder = new StringBuilder(47);
	//    2    4:new             #62  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:bipush          47
	//    5   10:invokespecial   #64  <Method void StringBuilder(int)>
	//    6   13:astore_3        
			stringbuilder.append("Recursion limit cannot be negative: ");
	//    7   14:aload_3         
	//    8   15:ldc1            #66  <String "Recursion limit cannot be negative: ">
	//    9   17:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   10   20:pop             
			stringbuilder.append(i);
	//   11   21:aload_3         
	//   12   22:iload_1         
	//   13   23:invokevirtual   #73  <Method StringBuilder StringBuilder.append(int)>
	//   14   26:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   15   27:new             #41  <Class IllegalArgumentException>
	//   16   30:dup             
	//   17   31:aload_3         
	//   18   32:invokevirtual   #76  <Method String StringBuilder.toString()>
	//   19   35:invokespecial   #79  <Method void IllegalArgumentException(String)>
	//   20   38:athrow          
		} else
		{
			int j = zzbub;
	//   21   39:aload_0         
	//   22   40:getfield        #18  <Field int zzbub>
	//   23   43:istore_2        
			zzbub = i;
	//   24   44:aload_0         
	//   25   45:iload_1         
	//   26   46:putfield        #18  <Field int zzbub>
			return j;
	//   27   49:iload_2         
	//   28   50:ireturn         
		}
	}

	public abstract int zzas(int i);

	public abstract void zzat(int i);

	public abstract void zzau(int i);

	public abstract int zzuj();

	public abstract long zzuk();

	public abstract long zzul();

	public abstract int zzum();

	public abstract long zzun();

	public abstract int zzuo();

	public abstract boolean zzup();

	public abstract String zzuq();

	public abstract zzte zzur();

	public abstract int zzus();

	public abstract int zzut();

	public abstract int zzuu();

	public abstract long zzuv();

	public abstract int zzuw();

	public abstract long zzux();

	abstract long zzuy();

	public abstract boolean zzuz();

	public abstract int zzva();

	int zzbua;
	int zzbub;
	private int zzbuc;
	zztt zzbud;
	private boolean zzbue;
}
