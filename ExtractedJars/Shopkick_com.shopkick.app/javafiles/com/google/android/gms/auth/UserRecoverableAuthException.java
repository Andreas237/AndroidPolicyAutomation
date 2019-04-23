// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth;

import android.content.Intent;

// Referenced classes of package com.google.android.gms.auth:
//			GoogleAuthException

public class UserRecoverableAuthException extends GoogleAuthException
{

	public UserRecoverableAuthException(String s, Intent intent)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void GoogleAuthException(String)>
		mIntent = intent;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #13  <Field Intent mIntent>
	//    6   10:return          
	}

	public Intent getIntent()
	{
		Intent intent = mIntent;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Intent mIntent>
	//    2    4:astore_1        
		if(intent == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return new Intent(intent);
	//    7   11:new             #18  <Class Intent>
	//    8   14:dup             
	//    9   15:aload_1         
	//   10   16:invokespecial   #21  <Method void Intent(Intent)>
	//   11   19:areturn         
	}

	private final Intent mIntent;
}
