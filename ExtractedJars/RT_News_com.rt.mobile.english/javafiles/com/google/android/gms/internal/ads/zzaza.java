// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.Cipher;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzayz

public final class zzaza
	implements zzayz
{

	public zzaza()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public final Object zzb(String s, Provider provider)
		throws GeneralSecurityException
	{
		if(provider == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       9
			return ((Object) (Cipher.getInstance(s)));
	//    2    4:aload_1         
	//    3    5:invokestatic    #22  <Method Cipher Cipher.getInstance(String)>
	//    4    8:areturn         
		else
			return ((Object) (Cipher.getInstance(s, provider)));
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokestatic    #25  <Method Cipher Cipher.getInstance(String, Provider)>
	//    8   14:areturn         
	}
}
