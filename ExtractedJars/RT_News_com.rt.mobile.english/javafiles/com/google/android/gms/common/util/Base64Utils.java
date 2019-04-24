// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;

import android.util.Base64;

public final class Base64Utils
{

	public Base64Utils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static byte[] decode(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return Base64.decode(s, 0);
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:invokestatic    #16  <Method byte[] Base64.decode(String, int)>
	//    7   11:areturn         
	}

	public static byte[] decodeUrlSafe(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return Base64.decode(s, 10);
	//    4    6:aload_0         
	//    5    7:bipush          10
	//    6    9:invokestatic    #16  <Method byte[] Base64.decode(String, int)>
	//    7   12:areturn         
	}

	public static byte[] decodeUrlSafeNoPadding(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return Base64.decode(s, 11);
	//    4    6:aload_0         
	//    5    7:bipush          11
	//    6    9:invokestatic    #16  <Method byte[] Base64.decode(String, int)>
	//    7   12:areturn         
	}

	public static byte[] decodeUrlSafeNoPadding(byte abyte0[])
	{
		if(abyte0 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return Base64.decode(abyte0, 11);
	//    4    6:aload_0         
	//    5    7:bipush          11
	//    6    9:invokestatic    #22  <Method byte[] Base64.decode(byte[], int)>
	//    7   12:areturn         
	}

	public static String encode(byte abyte0[])
	{
		if(abyte0 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return Base64.encodeToString(abyte0, 0);
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:invokestatic    #28  <Method String Base64.encodeToString(byte[], int)>
	//    7   11:areturn         
	}

	public static String encodeUrlSafe(byte abyte0[])
	{
		if(abyte0 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return Base64.encodeToString(abyte0, 10);
	//    4    6:aload_0         
	//    5    7:bipush          10
	//    6    9:invokestatic    #28  <Method String Base64.encodeToString(byte[], int)>
	//    7   12:areturn         
	}

	public static String encodeUrlSafeNoPadding(byte abyte0[])
	{
		if(abyte0 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return Base64.encodeToString(abyte0, 11);
	//    4    6:aload_0         
	//    5    7:bipush          11
	//    6    9:invokestatic    #28  <Method String Base64.encodeToString(byte[], int)>
	//    7   12:areturn         
	}
}
