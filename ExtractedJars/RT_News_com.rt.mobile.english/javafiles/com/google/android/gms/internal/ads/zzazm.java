// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzazl

final class zzazm extends ThreadLocal
{

	zzazm()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void ThreadLocal()>
	//    2    4:return          
	}

	protected final Object initialValue()
	{
		return ((Object) (zzazl.zzaas()));
	//    0    0:invokestatic    #18  <Method java.security.SecureRandom zzazl.zzaas()>
	//    1    3:areturn         
	}
}
