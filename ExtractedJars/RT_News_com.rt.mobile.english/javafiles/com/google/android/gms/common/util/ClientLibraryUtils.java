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
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static int getClientVersion(Context context, String s)
	{
		return getClientVersion(getPackageInfo(context, s));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #18  <Method PackageInfo getPackageInfo(Context, String)>
	//    3    5:invokestatic    #21  <Method int getClientVersion(PackageInfo)>
	//    4    8:ireturn         
	}

	public static int getClientVersion(PackageInfo packageinfo)
	{
		if(packageinfo != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          35
		{
			if(packageinfo.applicationInfo == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #27  <Field ApplicationInfo PackageInfo.applicationInfo>
	//*   4    8:ifnonnull       13
				return -1;
	//    5   11:iconst_m1       
	//    6   12:ireturn         
			packageinfo = ((PackageInfo) (packageinfo.applicationInfo.metaData));
	//    7   13:aload_0         
	//    8   14:getfield        #27  <Field ApplicationInfo PackageInfo.applicationInfo>
	//    9   17:getfield        #33  <Field Bundle ApplicationInfo.metaData>
	//   10   20:astore_0        
			if(packageinfo == null)
	//*  11   21:aload_0         
	//*  12   22:ifnonnull       27
				return -1;
	//   13   25:iconst_m1       
	//   14   26:ireturn         
			else
				return ((Bundle) (packageinfo)).getInt("com.google.android.gms.version", -1);
	//   15   27:aload_0         
	//   16   28:ldc1            #35  <String "com.google.android.gms.version">
	//   17   30:iconst_m1       
	//   18   31:invokevirtual   #41  <Method int Bundle.getInt(String, int)>
	//   19   34:ireturn         
		} else
		{
			return -1;
	//   20   35:iconst_m1       
	//   21   36:ireturn         
		}
	}

	public static PackageInfo getPackageInfo(Context context, String s)
	{
		try
		{
			context = ((Context) (Wrappers.packageManager(context).getPackageInfo(s, 128)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #50  <Method PackageManagerWrapper Wrappers.packageManager(Context)>
	//    2    4:aload_1         
	//    3    5:sipush          128
	//    4    8:invokevirtual   #55  <Method PackageInfo PackageManagerWrapper.getPackageInfo(String, int)>
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

	public static boolean isPackageSide()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public static boolean isPackageStopped(Context context, String s)
	{
		"com.google.android.gms".equals(((Object) (s)));
	//    0    0:ldc1            #62  <String "com.google.android.gms">
	//    1    2:aload_1         
	//    2    3:invokevirtual   #68  <Method boolean String.equals(Object)>
	//    3    6:pop             
		int i;
		try
		{
			i = Wrappers.packageManager(context).getApplicationInfo(s, 0).flags;
	//    4    7:aload_0         
	//    5    8:invokestatic    #50  <Method PackageManagerWrapper Wrappers.packageManager(Context)>
	//    6   11:aload_1         
	//    7   12:iconst_0        
	//    8   13:invokevirtual   #72  <Method ApplicationInfo PackageManagerWrapper.getApplicationInfo(String, int)>
	//    9   16:getfield        #75  <Field int ApplicationInfo.flags>
	//   10   19:istore_2        
		}
	//*  11   20:iload_2         
	//*  12   21:ldc1            #76  <Int 0x200000>
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

	public static final int GMS_CLIENT_VERSION_UNKNOWN = -1;
}
