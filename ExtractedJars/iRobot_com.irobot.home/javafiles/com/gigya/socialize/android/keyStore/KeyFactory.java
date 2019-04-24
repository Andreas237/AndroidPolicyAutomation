// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.keyStore;

import android.text.TextUtils;

// Referenced classes of package com.gigya.socialize.android.keyStore:
//			FingerprintKey, BaseKey

public class KeyFactory
{

	public KeyFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static BaseKey createKey(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #17  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		if(s.equalsIgnoreCase("fingerprint"))
	//*   5    9:aload_0         
	//*   6   10:ldc1            #19  <String "fingerprint">
	//*   7   12:invokevirtual   #25  <Method boolean String.equalsIgnoreCase(String)>
	//*   8   15:ifeq            26
			return ((BaseKey) (new FingerprintKey()));
	//    9   18:new             #27  <Class FingerprintKey>
	//   10   21:dup             
	//   11   22:invokespecial   #28  <Method void FingerprintKey()>
	//   12   25:areturn         
		else
			return null;
	//   13   26:aconst_null     
	//   14   27:areturn         
	}
}
