// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.Provider;
import javax.crypto.KeyAgreement;

// Referenced classes of package com.google.android.gms.internal.ads:
//			apg

public final class api
	implements apg
{

	public api()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public final Object a(String s, Provider provider)
	{
		if(provider == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       9
			return ((Object) (KeyAgreement.getInstance(s)));
	//    2    4:aload_1         
	//    3    5:invokestatic    #19  <Method KeyAgreement KeyAgreement.getInstance(String)>
	//    4    8:areturn         
		else
			return ((Object) (KeyAgreement.getInstance(s, provider)));
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokestatic    #22  <Method KeyAgreement KeyAgreement.getInstance(String, Provider)>
	//    8   14:areturn         
	}
}
