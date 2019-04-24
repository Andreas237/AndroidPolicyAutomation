// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.utils;

import android.content.Context;
import android.content.SharedPreferences;
import javax.crypto.SecretKey;

// Referenced classes of package com.gigya.socialize.android.utils:
//			SessionEncryptLPMR2Impl, SessionEncryptionImpl

public abstract class SessionEncryption
{
	public static class SessionEncryptionException extends RuntimeException
	{

		SessionEncryptionException(String s, Throwable throwable)
		{
			super(s, throwable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #11  <Method void RuntimeException(String, Throwable)>
		//    4    6:return          
		}
	}


	public SessionEncryption()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public static SessionEncryption getInstance()
	{
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   0    0:getstatic       #24  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmplt          16
			return ((SessionEncryption) (new SessionEncryptLPMR2Impl()));
	//    3    8:new             #26  <Class SessionEncryptLPMR2Impl>
	//    4   11:dup             
	//    5   12:invokespecial   #27  <Method void SessionEncryptLPMR2Impl()>
	//    6   15:areturn         
		else
			return ((SessionEncryption) (new SessionEncryptionImpl()));
	//    7   16:new             #29  <Class SessionEncryptionImpl>
	//    8   19:dup             
	//    9   20:invokespecial   #30  <Method void SessionEncryptionImpl()>
	//   10   23:areturn         
	}

	protected abstract SecretKey init(Context context, SharedPreferences sharedpreferences);

	protected abstract SecretKey loadSecret(SharedPreferences sharedpreferences);

	static final String GS_PREFA_ALIAS = "GS_PREFA";
}
