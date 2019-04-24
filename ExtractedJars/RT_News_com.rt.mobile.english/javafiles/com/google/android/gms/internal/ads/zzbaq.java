// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbbu, zzbas, zzbat, zzbar, 
//			zzbah

public abstract class zzbaq
{

	private zzbaq()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		zzdpy = 100;
	//    2    4:aload_0         
	//    3    5:bipush          100
	//    4    7:putfield        #22  <Field int zzdpy>
		zzdpz = 0x7fffffff;
	//    5   10:aload_0         
	//    6   11:ldc1            #23  <Int 0x7fffffff>
	//    7   13:putfield        #25  <Field int zzdpz>
		zzdqb = false;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #27  <Field boolean zzdqb>
	//   11   21:return          
	}

	zzbaq(zzbar zzbar)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void zzbaq()>
	//    2    4:return          
	}

	static zzbaq zza(byte abyte0[], int i, int j, boolean flag)
	{
		abyte0 = ((byte []) (new zzbas(abyte0, i, j, flag, ((zzbar) (null)))));
	//    0    0:new             #35  <Class zzbas>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:iload_3         
	//    6    8:aconst_null     
	//    7    9:invokespecial   #38  <Method void zzbas(byte[], int, int, boolean, zzbar)>
	//    8   12:astore_0        
		try
		{
			((zzbaq) (abyte0)).zzbr(j);
	//    9   13:aload_0         
	//   10   14:iload_2         
	//   11   15:invokevirtual   #42  <Method int zzbr(int)>
	//   12   18:pop             
		}
	//*  13   19:aload_0         
	//*  14   20:areturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  15   21:astore_0        
		{
			throw new IllegalArgumentException(((Throwable) (abyte0)));
	//   16   22:new             #44  <Class IllegalArgumentException>
	//   17   25:dup             
	//   18   26:aload_0         
	//   19   27:invokespecial   #47  <Method void IllegalArgumentException(Throwable)>
	//   20   30:athrow          
		}
		return ((zzbaq) (abyte0));
	}

	public static int zzbu(int i)
	{
		return -(i & 1) ^ i >>> 1;
	//    0    0:iload_0         
	//    1    1:iconst_1        
	//    2    2:iand            
	//    3    3:ineg            
	//    4    4:iload_0         
	//    5    5:iconst_1        
	//    6    6:iushr           
	//    7    7:ixor            
	//    8    8:ireturn         
	}

	public static long zzl(long l)
	{
		return l >>> 1 ^ -(l & 1L);
	//    0    0:lload_0         
	//    1    1:iconst_1        
	//    2    2:lushr           
	//    3    3:lload_0         
	//    4    4:lconst_1        
	//    5    5:land            
	//    6    6:lneg            
	//    7    7:lxor            
	//    8    8:lreturn         
	}

	public abstract double readDouble()
		throws IOException;

	public abstract float readFloat()
		throws IOException;

	public abstract String readString()
		throws IOException;

	public abstract int zzabk()
		throws IOException;

	public abstract long zzabl()
		throws IOException;

	public abstract long zzabm()
		throws IOException;

	public abstract int zzabn()
		throws IOException;

	public abstract long zzabo()
		throws IOException;

	public abstract int zzabp()
		throws IOException;

	public abstract boolean zzabq()
		throws IOException;

	public abstract String zzabr()
		throws IOException;

	public abstract zzbah zzabs()
		throws IOException;

	public abstract int zzabt()
		throws IOException;

	public abstract int zzabu()
		throws IOException;

	public abstract int zzabv()
		throws IOException;

	public abstract long zzabw()
		throws IOException;

	public abstract int zzabx()
		throws IOException;

	public abstract long zzaby()
		throws IOException;

	abstract long zzabz()
		throws IOException;

	public abstract boolean zzaca()
		throws IOException;

	public abstract int zzacb();

	public abstract void zzbp(int i)
		throws zzbbu;

	public abstract boolean zzbq(int i)
		throws IOException;

	public abstract int zzbr(int i)
		throws zzbbu;

	public abstract void zzbs(int i);

	public abstract void zzbt(int i)
		throws IOException;

	private static volatile boolean zzdqc = true;
	int zzdpx;
	int zzdpy;
	private int zzdpz;
	zzbat zzdqa;
	private boolean zzdqb;

	static 
	{
	//    0    0:return          
	}
}
