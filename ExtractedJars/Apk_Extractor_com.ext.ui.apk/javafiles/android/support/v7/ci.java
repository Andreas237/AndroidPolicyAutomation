// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7;

import android.util.Log;

public class ci
{

	public static void a(String s, String s1)
	{
		Log.i(s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #25  <Method int Log.i(String, String)>
	//    3    5:pop             
	//    4    6:return          
	}

	private static String a = "::::";
	private static String b = ":";

	static 
	{
	//    0    0:ldc1            #11  <String "::::">
	//    1    2:putstatic       #13  <Field String a>
	//    2    5:ldc1            #15  <String ":">
	//    3    7:putstatic       #17  <Field String b>
	//*   4   10:return          
	}
}
