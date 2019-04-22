// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.proxy;

import com.google.android.gms.common.api.CommonStatusCodes;

public class AuthApiStatusCodes extends CommonStatusCodes
{

	private AuthApiStatusCodes()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void CommonStatusCodes()>
	//    2    4:return          
	}

	public static String getStatusCodeString(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     3000 3006: default 44
	//	               3000 67
	//	               3001 64
	//	               3002 61
	//	               3003 58
	//	               3004 55
	//	               3005 52
	//	               3006 49
		default:
			return CommonStatusCodes.getStatusCodeString(i);
	//    2   44:iload_0         
	//    3   45:invokestatic    #29  <Method String CommonStatusCodes.getStatusCodeString(int)>
	//    4   48:areturn         

		case 3006: 
			return "AUTH_APP_CERT_ERROR";
	//    5   49:ldc1            #30  <String "AUTH_APP_CERT_ERROR">
	//    6   51:areturn         

		case 3005: 
			return "AUTH_URL_RESOLUTION";
	//    7   52:ldc1            #31  <String "AUTH_URL_RESOLUTION">
	//    8   54:areturn         

		case 3004: 
			return "AUTH_TOKEN_ERROR";
	//    9   55:ldc1            #32  <String "AUTH_TOKEN_ERROR">
	//   10   57:areturn         

		case 3003: 
			return "AUTH_API_SERVER_ERROR";
	//   11   58:ldc1            #33  <String "AUTH_API_SERVER_ERROR">
	//   12   60:areturn         

		case 3002: 
			return "AUTH_API_CLIENT_ERROR";
	//   13   61:ldc1            #34  <String "AUTH_API_CLIENT_ERROR">
	//   14   63:areturn         

		case 3001: 
			return "AUTH_API_ACCESS_FORBIDDEN";
	//   15   64:ldc1            #35  <String "AUTH_API_ACCESS_FORBIDDEN">
	//   16   66:areturn         

		case 3000: 
			return "AUTH_API_INVALID_CREDENTIALS";
	//   17   67:ldc1            #36  <String "AUTH_API_INVALID_CREDENTIALS">
	//   18   69:areturn         
		}
	}

	public static final int AUTH_API_ACCESS_FORBIDDEN = 3001;
	public static final int AUTH_API_CLIENT_ERROR = 3002;
	public static final int AUTH_API_INVALID_CREDENTIALS = 3000;
	public static final int AUTH_API_SERVER_ERROR = 3003;
	public static final int AUTH_APP_CERT_ERROR = 3006;
	public static final int AUTH_TOKEN_ERROR = 3004;
	public static final int AUTH_URL_RESOLUTION = 3005;
}
