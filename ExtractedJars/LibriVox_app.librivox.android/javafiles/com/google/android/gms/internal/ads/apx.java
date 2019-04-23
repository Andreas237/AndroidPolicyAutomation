// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


final class apx
{

	public static boolean a()
	{
		try
		{
			Class.forName("android.app.Application", false, ((ClassLoader) (null)));
	//    0    0:ldc1            #10  <String "android.app.Application">
	//    1    2:iconst_0        
	//    2    3:aconst_null     
	//    3    4:invokestatic    #16  <Method Class Class.forName(String, boolean, ClassLoader)>
	//    4    7:pop             
		}
	//*   5    8:iconst_1        
	//*   6    9:ireturn         
		catch(Exception exception)
	//*   7   10:astore_0        
		{
			return false;
	//    8   11:iconst_0        
	//    9   12:ireturn         
		}
		return true;
	}
}
