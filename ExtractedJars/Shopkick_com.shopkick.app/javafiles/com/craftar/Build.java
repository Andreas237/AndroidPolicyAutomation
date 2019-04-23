// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import java.lang.reflect.Method;

class Build
{

	Build()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:return          
	}

	static void setup()
	{
		if(setupDone)
	//*   0    0:getstatic       #30  <Field boolean setupDone>
	//*   1    3:ifeq            7
			return;
	//    2    6:return          
		try
		{
			Class.forName("com.craftar.BuildSetup").getMethod("setup", (Class[])null).invoke(((Object) ((Object[])null)), (Object[])null);
	//    3    7:ldc1            #32  <String "com.craftar.BuildSetup">
	//    4    9:invokestatic    #38  <Method Class Class.forName(String)>
	//    5   12:ldc1            #39  <String "setup">
	//    6   14:aconst_null     
	//    7   15:checkcast       #41  <Class Class[]>
	//    8   18:invokevirtual   #45  <Method Method Class.getMethod(String, Class[])>
	//    9   21:aconst_null     
	//   10   22:checkcast       #47  <Class Object[]>
	//   11   25:aconst_null     
	//   12   26:checkcast       #47  <Class Object[]>
	//   13   29:invokevirtual   #53  <Method Object Method.invoke(Object, Object[])>
	//   14   32:pop             
			setupDone = true;
	//   15   33:iconst_1        
	//   16   34:putstatic       #30  <Field boolean setupDone>
			return;
	//   17   37:return          
		}
		catch(Exception exception)
	//*  18   38:astore_0        
		{
			exception.printStackTrace();
	//   19   39:aload_0         
	//   20   40:invokevirtual   #56  <Method void Exception.printStackTrace()>
		}
	//   21   43:return          
	}

	public static final boolean DEBUG = false;
	static String SDK_CODENAME = "";
	static String SDK_VERSION = "";
	static int VERSION_MAJOR_CODE = -1;
	static boolean autoReleaseCameraBuffer = false;
	static boolean isUnity = false;
	static boolean processTrackingFrameImmediately = false;
	private static boolean setupDone = false;

	static 
	{
	//    0    0:return          
	}
}
