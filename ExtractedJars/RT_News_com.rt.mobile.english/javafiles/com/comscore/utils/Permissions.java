// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

public class Permissions
{

	public Permissions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public static Boolean check(Context context, String s)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(a == null)
	//*   2    2:getstatic       #18  <Field String[] a>
	//*   3    5:ifnonnull       28
			try
			{
				a = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
	//    4    8:aload_0         
	//    5    9:invokevirtual   #24  <Method PackageManager Context.getPackageManager()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #28  <Method String Context.getPackageName()>
	//    8   16:sipush          4096
	//    9   19:invokevirtual   #34  <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   10   22:getfield        #39  <Field String[] PackageInfo.requestedPermissions>
	//   11   25:putstatic       #18  <Field String[] a>
			}
	//*  12   28:getstatic       #18  <Field String[] a>
	//*  13   31:ifnull          66
	//*  14   34:iload_2         
	//*  15   35:getstatic       #18  <Field String[] a>
	//*  16   38:arraylength     
	//*  17   39:icmpge          66
	//*  18   42:getstatic       #18  <Field String[] a>
	//*  19   45:iload_2         
	//*  20   46:aaload          
	//*  21   47:aload_1         
	//*  22   48:invokevirtual   #45  <Method boolean String.equals(Object)>
	//*  23   51:ifeq            59
	//*  24   54:iconst_1        
	//*  25   55:invokestatic    #51  <Method Boolean Boolean.valueOf(boolean)>
	//*  26   58:areturn         
	//*  27   59:iload_2         
	//*  28   60:iconst_1        
	//*  29   61:iadd            
	//*  30   62:istore_2        
	//*  31   63:goto            34
	//*  32   66:iconst_0        
	//*  33   67:invokestatic    #51  <Method Boolean Boolean.valueOf(boolean)>
	//*  34   70:areturn         
			// Misplaced declaration of an exception variable
			catch(Context context) { }
	//   35   71:astore_0        
		if(a != null)
			for(; i < a.length; i++)
				if(a[i].equals(((Object) (s))))
					return Boolean.valueOf(true);

		return Boolean.valueOf(false);
	//*  36   72:goto            28
	}

	private static String a[];

	static 
	{
	//    0    0:return          
	}
}
