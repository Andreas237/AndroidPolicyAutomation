// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.CommonStatusCodes;

public final class GoogleSignInStatusCodes extends CommonStatusCodes
{

	private GoogleSignInStatusCodes()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void CommonStatusCodes()>
	//    2    4:return          
	}

	public static String getStatusCodeString(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     12500 12502: default 28
	//	               12500 39
	//	               12501 36
	//	               12502 33
		default:
			return CommonStatusCodes.getStatusCodeString(i);
	//    2   28:iload_0         
	//    3   29:invokestatic    #20  <Method String CommonStatusCodes.getStatusCodeString(int)>
	//    4   32:areturn         

		case 12502: 
			return "Sign-in in progress";
	//    5   33:ldc1            #22  <String "Sign-in in progress">
	//    6   35:areturn         

		case 12501: 
			return "Sign in action cancelled";
	//    7   36:ldc1            #24  <String "Sign in action cancelled">
	//    8   38:areturn         

		case 12500: 
			return "A non-recoverable sign in failure occurred";
	//    9   39:ldc1            #26  <String "A non-recoverable sign in failure occurred">
	//   10   41:areturn         
		}
	}

	public static final int SIGN_IN_CANCELLED = 12501;
	public static final int SIGN_IN_CURRENTLY_IN_PROGRESS = 12502;
	public static final int SIGN_IN_FAILED = 12500;
}
