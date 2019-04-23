// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.common.api.CommonStatusCodes;

public final class AccountTransferStatusCodes extends CommonStatusCodes
{

	private AccountTransferStatusCodes()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void CommonStatusCodes()>
	//    2    4:return          
	}

	public static String getStatusCodeString(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     20500 20504: default 36
	//	               20500 53
	//	               20501 50
	//	               20502 47
	//	               20503 44
	//	               20504 41
		default:
			return CommonStatusCodes.getStatusCodeString(i);
	//    2   36:iload_0         
	//    3   37:invokestatic    #24  <Method String CommonStatusCodes.getStatusCodeString(int)>
	//    4   40:areturn         

		case 20504: 
			return "SESSION_INACTIVE";
	//    5   41:ldc1            #25  <String "SESSION_INACTIVE">
	//    6   43:areturn         

		case 20503: 
			return "CHALLENGE_NOT_ALLOWED";
	//    7   44:ldc1            #26  <String "CHALLENGE_NOT_ALLOWED">
	//    8   46:areturn         

		case 20502: 
			return "INVALID_REQUEST";
	//    9   47:ldc1            #27  <String "INVALID_REQUEST">
	//   10   49:areturn         

		case 20501: 
			return "NO_DATA_AVAILABLE";
	//   11   50:ldc1            #28  <String "NO_DATA_AVAILABLE">
	//   12   52:areturn         

		case 20500: 
			return "NOT_ALLOWED_SECURITY";
	//   13   53:ldc1            #29  <String "NOT_ALLOWED_SECURITY">
	//   14   55:areturn         
		}
	}

	public static final int CHALLENGE_NOT_ALLOWED = 20503;
	public static final int INVALID_REQUEST = 20502;
	public static final int NOT_ALLOWED_SECURITY = 20500;
	public static final int NO_DATA_AVAILABLE = 20501;
	public static final int SESSION_INACTIVE = 20504;
}
