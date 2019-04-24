// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.utils;

import android.content.Context;
import android.content.pm.PackageManager;

public class API4
{

	public API4()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static boolean isPackageInstalledFromGooglePlayStore(Context context)
	{
		if(android.os.Build.VERSION.SDK_INT > 4)
	//*   0    0:getstatic       #19  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:iconst_4        
	//*   2    4:icmple          44
		{
			try
			{
				context = ((Context) (context.getPackageManager().getInstallerPackageName(context.getPackageName())));
	//    3    7:aload_0         
	//    4    8:invokevirtual   #25  <Method PackageManager Context.getPackageManager()>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #29  <Method String Context.getPackageName()>
	//    7   15:invokevirtual   #35  <Method String PackageManager.getInstallerPackageName(String)>
	//    8   18:astore_0        
			}
	//*   9   19:ldc1            #37  <String "com.android.vending">
	//*  10   21:aload_0         
	//*  11   22:invokevirtual   #43  <Method boolean String.equals(Object)>
	//*  12   25:ifne            42
	//*  13   28:ldc1            #45  <String "com.google.play">
	//*  14   30:aload_0         
	//*  15   31:invokevirtual   #43  <Method boolean String.equals(Object)>
	//*  16   34:ifeq            40
	//*  17   37:goto            42
	//*  18   40:iconst_0        
	//*  19   41:ireturn         
	//*  20   42:iconst_1        
	//*  21   43:ireturn         
	//*  22   44:iconst_0        
	//*  23   45:ireturn         
			// Misplaced declaration of an exception variable
			catch(Context context)
	//*  24   46:astore_0        
			{
				return false;
	//   25   47:iconst_0        
	//   26   48:ireturn         
			}
			return "com.android.vending".equals(((Object) (context))) || "com.google.play".equals(((Object) (context)));
		} else
		{
			return false;
		}
	}
}
