// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;

public class ClientLibraryUtils
{

	private ClientLibraryUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void Object()>
	//    2    4:return          
	}

	public static int getClientVersion(Context context, String s)
	{
		context = ((Context) (zzb(context, s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #16  <Method PackageInfo zzb(Context, String)>
	//    3    5:astore_0        
		if(context != null)
	//*   4    6:aload_0         
	//*   5    7:ifnull          41
		{
			if(((PackageInfo) (context)).applicationInfo == null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #22  <Field ApplicationInfo PackageInfo.applicationInfo>
	//*   8   14:ifnonnull       19
				return -1;
	//    9   17:iconst_m1       
	//   10   18:ireturn         
			context = ((Context) (((PackageInfo) (context)).applicationInfo.metaData));
	//   11   19:aload_0         
	//   12   20:getfield        #22  <Field ApplicationInfo PackageInfo.applicationInfo>
	//   13   23:getfield        #28  <Field Bundle ApplicationInfo.metaData>
	//   14   26:astore_0        
			if(context == null)
	//*  15   27:aload_0         
	//*  16   28:ifnonnull       33
				return -1;
	//   17   31:iconst_m1       
	//   18   32:ireturn         
			else
				return ((Bundle) (context)).getInt("com.google.android.gms.version", -1);
	//   19   33:aload_0         
	//   20   34:ldc1            #30  <String "com.google.android.gms.version">
	//   21   36:iconst_m1       
	//   22   37:invokevirtual   #36  <Method int Bundle.getInt(String, int)>
	//   23   40:ireturn         
		} else
		{
			return -1;
	//   24   41:iconst_m1       
	//   25   42:ireturn         
		}
	}

	public static boolean isPackageSide()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	private static PackageInfo zzb(Context context, String s)
	{
		try
		{
			context = ((Context) (Wrappers.packageManager(context).getPackageInfo(s, 128)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #47  <Method PackageManagerWrapper Wrappers.packageManager(Context)>
	//    2    4:aload_1         
	//    3    5:sipush          128
	//    4    8:invokevirtual   #53  <Method PackageInfo PackageManagerWrapper.getPackageInfo(String, int)>
	//    5   11:astore_0        
		}
	//*   6   12:aload_0         
	//*   7   13:areturn         
	//*   8   14:aconst_null     
	//*   9   15:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			return null;
		}
		return ((PackageInfo) (context));
	//*  10   16:astore_0        
	//*  11   17:goto            14
	}

	public static boolean zzc(Context context, String s)
	{
		"com.google.android.gms".equals(((Object) (s)));
	//    0    0:ldc1            #57  <String "com.google.android.gms">
	//    1    2:aload_1         
	//    2    3:invokevirtual   #63  <Method boolean String.equals(Object)>
	//    3    6:pop             
		int i;
		try
		{
			i = Wrappers.packageManager(context).getApplicationInfo(s, 0).flags;
	//    4    7:aload_0         
	//    5    8:invokestatic    #47  <Method PackageManagerWrapper Wrappers.packageManager(Context)>
	//    6   11:aload_1         
	//    7   12:iconst_0        
	//    8   13:invokevirtual   #67  <Method ApplicationInfo PackageManagerWrapper.getApplicationInfo(String, int)>
	//    9   16:getfield        #71  <Field int ApplicationInfo.flags>
	//   10   19:istore_2        
		}
	//*  11   20:iload_2         
	//*  12   21:ldc1            #72  <Int 0x200000>
	//*  13   23:iand            
	//*  14   24:ifeq            29
	//*  15   27:iconst_1        
	//*  16   28:ireturn         
	//*  17   29:iconst_0        
	//*  18   30:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  19   31:astore_0        
		{
			return false;
	//   20   32:iconst_0        
	//   21   33:ireturn         
		}
		return (i & 0x200000) != 0;
	}
}
