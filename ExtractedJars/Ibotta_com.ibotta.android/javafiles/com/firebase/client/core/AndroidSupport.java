// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;


public class AndroidSupport
{

	public AndroidSupport()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}

	private static boolean checkAndroid()
	{
		ClassNotFoundException classnotfoundexception;
		try
		{
			Class.forName("android.app.Activity");
	//    0    0:ldc1            #22  <String "android.app.Activity">
	//    1    2:invokestatic    #28  <Method Class Class.forName(String)>
	//    2    5:pop             
		}
	//*   3    6:iconst_1        
	//*   4    7:ireturn         
	//*   5    8:iconst_0        
	//*   6    9:ireturn         
		// Misplaced declaration of an exception variable
		catch(ClassNotFoundException classnotfoundexception)
		{
			return false;
		}
		return true;
	//*   7   10:astore_0        
	//*   8   11:goto            8
	}

	public static boolean isAndroid()
	{
		return IS_ANDROID;
	//    0    0:getstatic       #14  <Field boolean IS_ANDROID>
	//    1    3:ireturn         
	}

	private static final boolean IS_ANDROID = checkAndroid();

	static 
	{
	//    0    0:invokestatic    #12  <Method boolean checkAndroid()>
	//    1    3:putstatic       #14  <Field boolean IS_ANDROID>
	//*   2    6:return          
	}
}
