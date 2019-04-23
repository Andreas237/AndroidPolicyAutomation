// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

// Referenced classes of package com.google.android.gms.internal.ads:
//			apt

public final class aps
{

	static SecureRandom a()
	{
		return b();
	//    0    0:invokestatic    #20  <Method SecureRandom b()>
	//    1    3:areturn         
	}

	public static byte[] a(int i)
	{
		byte abyte0[] = new byte[i];
	//    0    0:iload_0         
	//    1    1:newarray        byte[]
	//    2    3:astore_1        
		((SecureRandom)a.get()).nextBytes(abyte0);
	//    3    4:getstatic       #15  <Field ThreadLocal a>
	//    4    7:invokevirtual   #27  <Method Object ThreadLocal.get()>
	//    5   10:checkcast       #29  <Class SecureRandom>
	//    6   13:aload_1         
	//    7   14:invokevirtual   #33  <Method void SecureRandom.nextBytes(byte[])>
		return abyte0;
	//    8   17:aload_1         
	//    9   18:areturn         
	}

	private static SecureRandom b()
	{
		SecureRandom securerandom = new SecureRandom();
	//    0    0:new             #29  <Class SecureRandom>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void SecureRandom()>
	//    3    7:astore_0        
		securerandom.nextLong();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #38  <Method long SecureRandom.nextLong()>
	//    6   12:pop2            
		return securerandom;
	//    7   13:aload_0         
	//    8   14:areturn         
	}

	private static final ThreadLocal a = new apt();

	static 
	{
	//    0    0:new             #10  <Class apt>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void apt()>
	//    3    7:putstatic       #15  <Field ThreadLocal a>
	//*   4   10:return          
	}
}
