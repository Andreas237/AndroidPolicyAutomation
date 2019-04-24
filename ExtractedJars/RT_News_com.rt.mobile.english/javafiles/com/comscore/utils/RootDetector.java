// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.utils;

import android.os.Build;
import java.io.File;

public class RootDetector
{

	public RootDetector()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	private static boolean a()
	{
		String s = Build.TAGS;
	//    0    0:getstatic       #17  <Field String Build.TAGS>
	//    1    3:astore_0        
		return s != null && s.contains("test-keys");
	//    2    4:aload_0         
	//    3    5:ifnull          19
	//    4    8:aload_0         
	//    5    9:ldc1            #19  <String "test-keys">
	//    6   11:invokevirtual   #25  <Method boolean String.contains(CharSequence)>
	//    7   14:ifeq            19
	//    8   17:iconst_1        
	//    9   18:ireturn         
	//   10   19:iconst_0        
	//   11   20:ireturn         
	}

	private static boolean b()
	{
		boolean flag = (new File("/system/app/Superuser.apk")).exists();
	//    0    0:new             #30  <Class File>
	//    1    3:dup             
	//    2    4:ldc1            #32  <String "/system/app/Superuser.apk">
	//    3    6:invokespecial   #35  <Method void File(String)>
	//    4    9:invokevirtual   #38  <Method boolean File.exists()>
	//    5   12:istore_0        
		if(flag)
	//*   6   13:iload_0         
	//*   7   14:ifeq            19
			return true;
	//    8   17:iconst_1        
	//    9   18:ireturn         
_L2:
		return false;
	//   10   19:iconst_0        
	//   11   20:ireturn         
		Exception exception;
		exception;
	//   12   21:astore_1        
		if(true) goto _L2; else goto _L1
_L1:
	//*  13   22:goto            19
	}

	public static boolean isDeviceRooted()
	{
		if(a())
	//*   0    0:invokestatic    #41  <Method boolean a()>
	//*   1    3:ifeq            8
			return true;
	//    2    6:iconst_1        
	//    3    7:ireturn         
		return b();
	//    4    8:invokestatic    #43  <Method boolean b()>
	//    5   11:ifeq            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}
}
