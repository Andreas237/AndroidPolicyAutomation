// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzazm

public final class zzazl
{

	private static SecureRandom zzaar()
	{
		SecureRandom securerandom = new SecureRandom();
	//    0    0:new             #21  <Class SecureRandom>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void SecureRandom()>
	//    3    7:astore_0        
		securerandom.nextLong();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #26  <Method long SecureRandom.nextLong()>
	//    6   12:pop2            
		return securerandom;
	//    7   13:aload_0         
	//    8   14:areturn         
	}

	static SecureRandom zzaas()
	{
		return zzaar();
	//    0    0:invokestatic    #29  <Method SecureRandom zzaar()>
	//    1    3:areturn         
	}

	public static byte[] zzbh(int i)
	{
		byte abyte0[] = new byte[i];
	//    0    0:iload_0         
	//    1    1:newarray        byte[]
	//    2    3:astore_1        
		((SecureRandom)zzdon.get()).nextBytes(abyte0);
	//    3    4:getstatic       #16  <Field ThreadLocal zzdon>
	//    4    7:invokevirtual   #37  <Method Object ThreadLocal.get()>
	//    5   10:checkcast       #21  <Class SecureRandom>
	//    6   13:aload_1         
	//    7   14:invokevirtual   #41  <Method void SecureRandom.nextBytes(byte[])>
		return abyte0;
	//    8   17:aload_1         
	//    9   18:areturn         
	}

	private static final ThreadLocal zzdon = new zzazm();

	static 
	{
	//    0    0:new             #11  <Class zzazm>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void zzazm()>
	//    3    7:putstatic       #16  <Field ThreadLocal zzdon>
	//*   4   10:return          
	}
}
