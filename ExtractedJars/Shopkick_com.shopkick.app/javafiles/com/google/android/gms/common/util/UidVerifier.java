// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;

public final class UidVerifier
{

	private UidVerifier()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void Object()>
	//    2    4:return          
	}

	public static boolean isGooglePlayServicesUid(Context context, int i)
	{
		if(!uidHasPackageName(context, i, "com.google.android.gms"))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:ldc1            #16  <String "com.google.android.gms">
	//*   3    4:invokestatic    #20  <Method boolean uidHasPackageName(Context, int, String)>
	//*   4    7:ifne            12
			return false;
	//    5   10:iconst_0        
	//    6   11:ireturn         
		Object obj = ((Object) (context.getPackageManager()));
	//    7   12:aload_0         
	//    8   13:invokevirtual   #26  <Method PackageManager Context.getPackageManager()>
	//    9   16:astore_2        
		try
		{
			obj = ((Object) (((PackageManager) (obj)).getPackageInfo("com.google.android.gms", 64)));
	//   10   17:aload_2         
	//   11   18:ldc1            #16  <String "com.google.android.gms">
	//   12   20:bipush          64
	//   13   22:invokevirtual   #32  <Method android.content.pm.PackageInfo PackageManager.getPackageInfo(String, int)>
	//   14   25:astore_2        
		}
	//*  15   26:aload_0         
	//*  16   27:invokestatic    #38  <Method GoogleSignatureVerifier GoogleSignatureVerifier.getInstance(Context)>
	//*  17   30:aload_2         
	//*  18   31:invokevirtual   #42  <Method boolean GoogleSignatureVerifier.isGooglePublicSignedPackage(android.content.pm.PackageInfo)>
	//*  19   34:ireturn         
	//*  20   35:ldc1            #44  <String "UidVerifier">
	//*  21   37:iconst_3        
	//*  22   38:invokestatic    #50  <Method boolean Log.isLoggable(String, int)>
	//*  23   41:ifeq            52
	//*  24   44:ldc1            #44  <String "UidVerifier">
	//*  25   46:ldc1            #52  <String "Package manager can't find google play services package, defaulting to false">
	//*  26   48:invokestatic    #56  <Method int Log.d(String, String)>
	//*  27   51:pop             
	//*  28   52:iconst_0        
	//*  29   53:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			if(Log.isLoggable("UidVerifier", 3))
				Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
			return false;
		}
		return GoogleSignatureVerifier.getInstance(context).isGooglePublicSignedPackage(((android.content.pm.PackageInfo) (obj)));
	//*  30   54:astore_0        
	//*  31   55:goto            35
	}

	public static boolean uidHasPackageName(Context context, int i, String s)
	{
		return Wrappers.packageManager(context).zzb(i, s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #66  <Method PackageManagerWrapper Wrappers.packageManager(Context)>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #72  <Method boolean PackageManagerWrapper.zzb(int, String)>
	//    5    9:ireturn         
	}
}
