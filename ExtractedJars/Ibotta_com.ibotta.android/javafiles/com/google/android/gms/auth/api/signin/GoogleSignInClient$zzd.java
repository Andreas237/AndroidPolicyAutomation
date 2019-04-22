// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Result;

// Referenced classes of package com.google.android.gms.auth.api.signin:
//			GoogleSignInClient, GoogleSignInResult, zzd

private static final class GoogleSignInClient$zzd
	implements com.google.android.gms.common.internal.tConverter
{

	public final Object convert(Result result)
	{
		return ((Object) (((GoogleSignInResult)result).getSignInAccount()));
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class GoogleSignInResult>
	//    2    4:invokevirtual   #25  <Method GoogleSignInAccount GoogleSignInResult.getSignInAccount()>
	//    3    7:areturn         
	}

	private GoogleSignInClient$zzd()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	GoogleSignInClient$zzd(zzd zzd1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void GoogleSignInClient$zzd()>
	//    2    4:return          
	}
}
