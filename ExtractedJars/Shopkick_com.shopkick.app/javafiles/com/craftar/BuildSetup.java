// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			Build, CLog, CraftARItemFactory

class BuildSetup
{

	BuildSetup()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
	//    2    4:return          
	}

	public static void setup()
	{
		CraftARItemFactory.setFactory(new CraftARItemFactory());
	//    0    0:new             #41  <Class CraftARItemFactory>
	//    1    3:dup             
	//    2    4:invokespecial   #42  <Method void CraftARItemFactory()>
	//    3    7:invokestatic    #46  <Method void CraftARItemFactory.setFactory(CraftARItemFactory)>
	//    4   10:return          
	}

	static 
	{
		Build.SDK_CODENAME = "ODIR";
	//    0    0:ldc1            #8   <String "ODIR">
	//    1    2:putstatic       #14  <Field String Build.SDK_CODENAME>
		Build.VERSION_MAJOR_CODE = 1;
	//    2    5:iconst_1        
	//    3    6:putstatic       #18  <Field int Build.VERSION_MAJOR_CODE>
		Build.SDK_VERSION = "ODIR-1";
	//    4    9:ldc1            #20  <String "ODIR-1">
	//    5   11:putstatic       #23  <Field String Build.SDK_VERSION>
		CLog.TAG = "CraftAR On-Device Image Recognition SDK 1.4.2";
	//    6   14:ldc1            #25  <String "CraftAR On-Device Image Recognition SDK 1.4.2">
	//    7   16:putstatic       #30  <Field String CLog.TAG>
		Build.autoReleaseCameraBuffer = true;
	//    8   19:iconst_1        
	//    9   20:putstatic       #34  <Field boolean Build.autoReleaseCameraBuffer>
	//*  10   23:return          
	}
}
