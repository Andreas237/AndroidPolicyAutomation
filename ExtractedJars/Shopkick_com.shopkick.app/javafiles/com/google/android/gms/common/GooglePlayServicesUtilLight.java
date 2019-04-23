// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.*;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzp;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.common.util.zzb;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.gms.common:
//			GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException, GoogleApiAvailabilityLight, ConnectionResult, 
//			GoogleSignatureVerifier

public class GooglePlayServicesUtilLight
{

	GooglePlayServicesUtilLight()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void Object()>
	//    2    4:return          
	}

	public static void cancelAvailabilityErrorNotifications(Context context)
	{
		if(sCanceledAvailabilityNotification.getAndSet(true))
	//*   0    0:getstatic       #43  <Field AtomicBoolean sCanceledAvailabilityNotification>
	//*   1    3:iconst_1        
	//*   2    4:invokevirtual   #56  <Method boolean AtomicBoolean.getAndSet(boolean)>
	//*   3    7:ifeq            11
			return;
	//    4   10:return          
		try
		{
			context = ((Context) ((NotificationManager)context.getSystemService("notification")));
	//    5   11:aload_0         
	//    6   12:ldc1            #58  <String "notification">
	//    7   14:invokevirtual   #64  <Method Object Context.getSystemService(String)>
	//    8   17:checkcast       #66  <Class NotificationManager>
	//    9   20:astore_0        
		}
	//*  10   21:aload_0         
	//*  11   22:ifnull          32
	//*  12   25:aload_0         
	//*  13   26:sipush          10436
	//*  14   29:invokevirtual   #70  <Method void NotificationManager.cancel(int)>
	//*  15   32:return          
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  16   33:astore_0        
		{
			return;
	//   17   34:return          
		}
		if(context == null)
			break MISSING_BLOCK_LABEL_32;
		((NotificationManager) (context)).cancel(10436);
	}

	public static void enableUsingApkIndependentContext()
	{
		zzal.set(true);
	//    0    0:getstatic       #45  <Field AtomicBoolean zzal>
	//    1    3:iconst_1        
	//    2    4:invokevirtual   #76  <Method void AtomicBoolean.set(boolean)>
	//    3    7:return          
	}

	public static void ensurePlayServicesAvailable(Context context, int i)
		throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException
	{
		i = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, i);
	//    0    0:invokestatic    #88  <Method GoogleApiAvailabilityLight GoogleApiAvailabilityLight.getInstance()>
	//    1    3:aload_0         
	//    2    4:iload_1         
	//    3    5:invokevirtual   #92  <Method int GoogleApiAvailabilityLight.isGooglePlayServicesAvailable(Context, int)>
	//    4    8:istore_1        
		if(i != 0)
	//*   5    9:iload_1         
	//*   6   10:ifeq            82
		{
			context = ((Context) (GoogleApiAvailabilityLight.getInstance().getErrorResolutionIntent(context, i, "e")));
	//    7   13:invokestatic    #88  <Method GoogleApiAvailabilityLight GoogleApiAvailabilityLight.getInstance()>
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:ldc1            #94  <String "e">
	//   11   20:invokevirtual   #98  <Method Intent GoogleApiAvailabilityLight.getErrorResolutionIntent(Context, int, String)>
	//   12   23:astore_0        
			StringBuilder stringbuilder = new StringBuilder(57);
	//   13   24:new             #100 <Class StringBuilder>
	//   14   27:dup             
	//   15   28:bipush          57
	//   16   30:invokespecial   #102 <Method void StringBuilder(int)>
	//   17   33:astore_2        
			stringbuilder.append("GooglePlayServices not available due to error ");
	//   18   34:aload_2         
	//   19   35:ldc1            #104 <String "GooglePlayServices not available due to error ">
	//   20   37:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   21   40:pop             
			stringbuilder.append(i);
	//   22   41:aload_2         
	//   23   42:iload_1         
	//   24   43:invokevirtual   #111 <Method StringBuilder StringBuilder.append(int)>
	//   25   46:pop             
			Log.e("GooglePlayServicesUtil", stringbuilder.toString());
	//   26   47:ldc1            #113 <String "GooglePlayServicesUtil">
	//   27   49:aload_2         
	//   28   50:invokevirtual   #117 <Method String StringBuilder.toString()>
	//   29   53:invokestatic    #122 <Method int Log.e(String, String)>
	//   30   56:pop             
			if(context == null)
	//*  31   57:aload_0         
	//*  32   58:ifnonnull       70
				throw new GooglePlayServicesNotAvailableException(i);
	//   33   61:new             #82  <Class GooglePlayServicesNotAvailableException>
	//   34   64:dup             
	//   35   65:iload_1         
	//   36   66:invokespecial   #123 <Method void GooglePlayServicesNotAvailableException(int)>
	//   37   69:athrow          
			else
				throw new GooglePlayServicesRepairableException(i, "Google Play Services not available", ((Intent) (context)));
	//   38   70:new             #80  <Class GooglePlayServicesRepairableException>
	//   39   73:dup             
	//   40   74:iload_1         
	//   41   75:ldc1            #125 <String "Google Play Services not available">
	//   42   77:aload_0         
	//   43   78:invokespecial   #128 <Method void GooglePlayServicesRepairableException(int, String, Intent)>
	//   44   81:athrow          
		} else
		{
			return;
	//   45   82:return          
		}
	}

	public static int getApkVersion(Context context)
	{
		try
		{
			context = ((Context) (context.getPackageManager().getPackageInfo("com.google.android.gms", 0)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #137 <Method PackageManager Context.getPackageManager()>
	//    2    4:ldc1            #18  <String "com.google.android.gms">
	//    3    6:iconst_0        
	//    4    7:invokevirtual   #143 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//    5   10:astore_0        
		}
	//*   6   11:aload_0         
	//*   7   12:getfield        #148 <Field int PackageInfo.versionCode>
	//*   8   15:ireturn         
	//*   9   16:ldc1            #113 <String "GooglePlayServicesUtil">
	//*  10   18:ldc1            #150 <String "Google Play services is missing.">
	//*  11   20:invokestatic    #153 <Method int Log.w(String, String)>
	//*  12   23:pop             
	//*  13   24:iconst_0        
	//*  14   25:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
			return 0;
		}
		return ((PackageInfo) (context)).versionCode;
	//*  15   26:astore_0        
	//*  16   27:goto            16
	}

	public static int getClientVersion(Context context)
	{
		Preconditions.checkState(true);
	//    0    0:iconst_1        
	//    1    1:invokestatic    #159 <Method void Preconditions.checkState(boolean)>
		return ClientLibraryUtils.getClientVersion(context, context.getPackageName());
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #162 <Method String Context.getPackageName()>
	//    5    9:invokestatic    #167 <Method int ClientLibraryUtils.getClientVersion(Context, String)>
	//    6   12:ireturn         
	}

	public static PendingIntent getErrorPendingIntent(int i, Context context, int j)
	{
		return GoogleApiAvailabilityLight.getInstance().getErrorResolutionPendingIntent(context, i, j);
	//    0    0:invokestatic    #88  <Method GoogleApiAvailabilityLight GoogleApiAvailabilityLight.getInstance()>
	//    1    3:aload_1         
	//    2    4:iload_0         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #173 <Method PendingIntent GoogleApiAvailabilityLight.getErrorResolutionPendingIntent(Context, int, int)>
	//    5    9:areturn         
	}

	public static String getErrorString(int i)
	{
		return ConnectionResult.zza(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #180 <Method String ConnectionResult.zza(int)>
	//    2    4:areturn         
	}

	public static Intent getGooglePlayServicesAvailabilityRecoveryIntent(int i)
	{
		return GoogleApiAvailabilityLight.getInstance().getErrorResolutionIntent(((Context) (null)), i, ((String) (null)));
	//    0    0:invokestatic    #88  <Method GoogleApiAvailabilityLight GoogleApiAvailabilityLight.getInstance()>
	//    1    3:aconst_null     
	//    2    4:iload_0         
	//    3    5:aconst_null     
	//    4    6:invokevirtual   #98  <Method Intent GoogleApiAvailabilityLight.getErrorResolutionIntent(Context, int, String)>
	//    5    9:areturn         
	}

	public static Context getRemoteContext(Context context)
	{
		try
		{
			context = context.createPackageContext("com.google.android.gms", 3);
	//    0    0:aload_0         
	//    1    1:ldc1            #18  <String "com.google.android.gms">
	//    2    3:iconst_3        
	//    3    4:invokevirtual   #188 <Method Context Context.createPackageContext(String, int)>
	//    4    7:astore_0        
		}
	//*   5    8:aload_0         
	//*   6    9:areturn         
	//*   7   10:aconst_null     
	//*   8   11:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			return null;
		}
		return context;
	//*   9   12:astore_0        
	//*  10   13:goto            10
	}

	public static Resources getRemoteResource(Context context)
	{
		try
		{
			context = ((Context) (context.getPackageManager().getResourcesForApplication("com.google.android.gms")));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #137 <Method PackageManager Context.getPackageManager()>
	//    2    4:ldc1            #18  <String "com.google.android.gms">
	//    3    6:invokevirtual   #194 <Method Resources PackageManager.getResourcesForApplication(String)>
	//    4    9:astore_0        
		}
	//*   5   10:aload_0         
	//*   6   11:areturn         
	//*   7   12:aconst_null     
	//*   8   13:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			return null;
		}
		return ((Resources) (context));
	//*   9   14:astore_0        
	//*  10   15:goto            12
	}

	public static boolean honorsDebugCertificates(Context context)
	{
		if(zzak)
			break MISSING_BLOCK_LABEL_88;
	//    0    0:getstatic       #198 <Field boolean zzak>
	//    1    3:ifne            88
		PackageInfo packageinfo;
		packageinfo = Wrappers.packageManager(context).getPackageInfo("com.google.android.gms", 64);
	//    2    6:aload_0         
	//    3    7:invokestatic    #204 <Method PackageManagerWrapper Wrappers.packageManager(Context)>
	//    4   10:ldc1            #18  <String "com.google.android.gms">
	//    5   12:bipush          64
	//    6   14:invokevirtual   #207 <Method PackageInfo PackageManagerWrapper.getPackageInfo(String, int)>
	//    7   17:astore_1        
		GoogleSignatureVerifier.getInstance(context);
	//    8   18:aload_0         
	//    9   19:invokestatic    #212 <Method GoogleSignatureVerifier GoogleSignatureVerifier.getInstance(Context)>
	//   10   22:pop             
		if(packageinfo == null)
			break MISSING_BLOCK_LABEL_50;
	//   11   23:aload_1         
	//   12   24:ifnull          50
		if(!GoogleSignatureVerifier.zza(packageinfo, false) && GoogleSignatureVerifier.zza(packageinfo, true))
	//*  13   27:aload_1         
	//*  14   28:iconst_0        
	//*  15   29:invokestatic    #215 <Method boolean GoogleSignatureVerifier.zza(PackageInfo, boolean)>
	//*  16   32:ifne            50
	//*  17   35:aload_1         
	//*  18   36:iconst_1        
	//*  19   37:invokestatic    #215 <Method boolean GoogleSignatureVerifier.zza(PackageInfo, boolean)>
	//*  20   40:ifeq            50
		{
			zzaj = true;
	//   21   43:iconst_1        
	//   22   44:putstatic       #217 <Field boolean zzaj>
			break MISSING_BLOCK_LABEL_54;
	//   23   47:goto            54
		}
		zzaj = false;
	//   24   50:iconst_0        
	//   25   51:putstatic       #217 <Field boolean zzaj>
		zzak = true;
	//   26   54:iconst_1        
	//   27   55:putstatic       #198 <Field boolean zzak>
		break MISSING_BLOCK_LABEL_88;
	//   28   58:goto            88
		context;
	//   29   61:astore_0        
		break MISSING_BLOCK_LABEL_82;
	//   30   62:goto            82
		context;
	//   31   65:astore_0        
		Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", ((Throwable) (context)));
	//   32   66:ldc1            #113 <String "GooglePlayServicesUtil">
	//   33   68:ldc1            #219 <String "Cannot find Google Play services package name.">
	//   34   70:aload_0         
	//   35   71:invokestatic    #222 <Method int Log.w(String, String, Throwable)>
	//   36   74:pop             
		zzak = true;
	//   37   75:iconst_1        
	//   38   76:putstatic       #198 <Field boolean zzak>
		break MISSING_BLOCK_LABEL_88;
	//   39   79:goto            88
		zzak = true;
	//   40   82:iconst_1        
	//   41   83:putstatic       #198 <Field boolean zzak>
		throw context;
	//   42   86:aload_0         
	//   43   87:athrow          
		if(!zzaj)
	//*  44   88:getstatic       #217 <Field boolean zzaj>
	//*  45   91:ifne            104
			return !DeviceProperties.isUserBuild();
	//   46   94:invokestatic    #228 <Method boolean DeviceProperties.isUserBuild()>
	//   47   97:ifne            102
	//   48  100:iconst_1        
	//   49  101:ireturn         
	//   50  102:iconst_0        
	//   51  103:ireturn         
		else
			return true;
	//   52  104:iconst_1        
	//   53  105:ireturn         
	}

	public static int isGooglePlayServicesAvailable(Context context)
	{
		return isGooglePlayServicesAvailable(context, GOOGLE_PLAY_SERVICES_VERSION_CODE);
	//    0    0:aload_0         
	//    1    1:getstatic       #231 <Field int GOOGLE_PLAY_SERVICES_VERSION_CODE>
	//    2    4:invokestatic    #232 <Method int isGooglePlayServicesAvailable(Context, int)>
	//    3    7:ireturn         
	}

	public static int isGooglePlayServicesAvailable(Context context, int i)
	{
		Throwable throwable;
		try
		{
			context.getResources().getString(R.string.common_google_play_services_unknown_issue);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #238 <Method Resources Context.getResources()>
	//    2    4:getstatic       #243 <Field int R$string.common_google_play_services_unknown_issue>
	//    3    7:invokevirtual   #248 <Method String Resources.getString(int)>
	//    4   10:pop             
		}
	//*   5   11:goto            22
	//*   6   14:ldc1            #113 <String "GooglePlayServicesUtil">
	//*   7   16:ldc1            #250 <String "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.">
	//*   8   18:invokestatic    #122 <Method int Log.e(String, String)>
	//*   9   21:pop             
	//*  10   22:ldc1            #18  <String "com.google.android.gms">
	//*  11   24:aload_0         
	//*  12   25:invokevirtual   #162 <Method String Context.getPackageName()>
	//*  13   28:invokevirtual   #256 <Method boolean String.equals(Object)>
	//*  14   31:ifne            134
	//*  15   34:getstatic       #45  <Field AtomicBoolean zzal>
	//*  16   37:invokevirtual   #259 <Method boolean AtomicBoolean.get()>
	//*  17   40:ifne            134
	//*  18   43:aload_0         
	//*  19   44:invokestatic    #264 <Method int zzp.zzd(Context)>
	//*  20   47:istore_2        
	//*  21   48:iload_2         
	//*  22   49:ifeq            123
	//*  23   52:getstatic       #231 <Field int GOOGLE_PLAY_SERVICES_VERSION_CODE>
	//*  24   55:istore_3        
	//*  25   56:iload_2         
	//*  26   57:iload_3         
	//*  27   58:icmpne          64
	//*  28   61:goto            134
	//*  29   64:new             #100 <Class StringBuilder>
	//*  30   67:dup             
	//*  31   68:sipush          320
	//*  32   71:invokespecial   #102 <Method void StringBuilder(int)>
	//*  33   74:astore_0        
	//*  34   75:aload_0         
	//*  35   76:ldc2            #266 <String "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ">
	//*  36   79:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//*  37   82:pop             
	//*  38   83:aload_0         
	//*  39   84:iload_3         
	//*  40   85:invokevirtual   #111 <Method StringBuilder StringBuilder.append(int)>
	//*  41   88:pop             
	//*  42   89:aload_0         
	//*  43   90:ldc2            #268 <String " but found ">
	//*  44   93:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//*  45   96:pop             
	//*  46   97:aload_0         
	//*  47   98:iload_2         
	//*  48   99:invokevirtual   #111 <Method StringBuilder StringBuilder.append(int)>
	//*  49  102:pop             
	//*  50  103:aload_0         
	//*  51  104:ldc2            #270 <String ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />">
	//*  52  107:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//*  53  110:pop             
	//*  54  111:new             #272 <Class IllegalStateException>
	//*  55  114:dup             
	//*  56  115:aload_0         
	//*  57  116:invokevirtual   #117 <Method String StringBuilder.toString()>
	//*  58  119:invokespecial   #275 <Method void IllegalStateException(String)>
	//*  59  122:athrow          
	//*  60  123:new             #272 <Class IllegalStateException>
	//*  61  126:dup             
	//*  62  127:ldc2            #277 <String "A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />">
	//*  63  130:invokespecial   #275 <Method void IllegalStateException(String)>
	//*  64  133:athrow          
	//*  65  134:aload_0         
	//*  66  135:invokestatic    #280 <Method boolean DeviceProperties.isWearableWithoutPlayStore(Context)>
	//*  67  138:ifne            154
	//*  68  141:aload_0         
	//*  69  142:invokestatic    #283 <Method boolean DeviceProperties.zzf(Context)>
	//*  70  145:ifne            154
	//*  71  148:iconst_1        
	//*  72  149:istore          4
	//*  73  151:goto            157
	//*  74  154:iconst_0        
	//*  75  155:istore          4
	//*  76  157:aload_0         
	//*  77  158:iload           4
	//*  78  160:iload_1         
	//*  79  161:invokestatic    #286 <Method int zza(Context, boolean, int)>
	//*  80  164:ireturn         
		// Misplaced declaration of an exception variable
		catch(Throwable throwable)
		{
			Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
		}
		if(!"com.google.android.gms".equals(((Object) (context.getPackageName()))) && !zzal.get())
		{
			int j = zzp.zzd(context);
			if(j != 0)
			{
				int k = GOOGLE_PLAY_SERVICES_VERSION_CODE;
				if(j != k)
				{
					context = ((Context) (new StringBuilder(320)));
					((StringBuilder) (context)).append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
					((StringBuilder) (context)).append(k);
					((StringBuilder) (context)).append(" but found ");
					((StringBuilder) (context)).append(j);
					((StringBuilder) (context)).append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
					throw new IllegalStateException(((StringBuilder) (context)).toString());
				}
			} else
			{
				throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
			}
		}
		boolean flag;
		if(!DeviceProperties.isWearableWithoutPlayStore(context) && !DeviceProperties.zzf(context))
			flag = true;
		else
			flag = false;
		return zza(context, flag, i);
	//*  81  165:astore          5
	//*  82  167:goto            14
	}

	public static boolean isGooglePlayServicesUid(Context context, int i)
	{
		return UidVerifier.isGooglePlayServicesUid(context, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #292 <Method boolean UidVerifier.isGooglePlayServicesUid(Context, int)>
	//    3    5:ireturn         
	}

	public static boolean isPlayServicesPossiblyUpdating(Context context, int i)
	{
		if(i == 18)
	//*   0    0:iload_1         
	//*   1    1:bipush          18
	//*   2    3:icmpne          8
			return true;
	//    3    6:iconst_1        
	//    4    7:ireturn         
		if(i == 1)
	//*   5    8:iload_1         
	//*   6    9:iconst_1        
	//*   7   10:icmpne          20
			return isUninstalledAppPossiblyUpdating(context, "com.google.android.gms");
	//    8   13:aload_0         
	//    9   14:ldc1            #18  <String "com.google.android.gms">
	//   10   16:invokestatic    #297 <Method boolean isUninstalledAppPossiblyUpdating(Context, String)>
	//   11   19:ireturn         
		else
			return false;
	//   12   20:iconst_0        
	//   13   21:ireturn         
	}

	public static boolean isPlayStorePossiblyUpdating(Context context, int i)
	{
		if(i == 9)
	//*   0    0:iload_1         
	//*   1    1:bipush          9
	//*   2    3:icmpne          13
			return isUninstalledAppPossiblyUpdating(context, "com.android.vending");
	//    3    6:aload_0         
	//    4    7:ldc1            #24  <String "com.android.vending">
	//    5    9:invokestatic    #297 <Method boolean isUninstalledAppPossiblyUpdating(Context, String)>
	//    6   12:ireturn         
		else
			return false;
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public static boolean isRestrictedUserProfile(Context context)
	{
		if(PlatformVersion.isAtLeastJellyBeanMR2())
	//*   0    0:invokestatic    #307 <Method boolean PlatformVersion.isAtLeastJellyBeanMR2()>
	//*   1    3:ifeq            46
		{
			context = ((Context) (((UserManager)context.getSystemService("user")).getApplicationRestrictions(context.getPackageName())));
	//    2    6:aload_0         
	//    3    7:ldc2            #309 <String "user">
	//    4   10:invokevirtual   #64  <Method Object Context.getSystemService(String)>
	//    5   13:checkcast       #311 <Class UserManager>
	//    6   16:aload_0         
	//    7   17:invokevirtual   #162 <Method String Context.getPackageName()>
	//    8   20:invokevirtual   #315 <Method Bundle UserManager.getApplicationRestrictions(String)>
	//    9   23:astore_0        
			if(context != null && "true".equals(((Object) (((Bundle) (context)).getString("restricted_profile")))))
	//*  10   24:aload_0         
	//*  11   25:ifnull          46
	//*  12   28:ldc2            #317 <String "true">
	//*  13   31:aload_0         
	//*  14   32:ldc2            #319 <String "restricted_profile">
	//*  15   35:invokevirtual   #324 <Method String Bundle.getString(String)>
	//*  16   38:invokevirtual   #256 <Method boolean String.equals(Object)>
	//*  17   41:ifeq            46
				return true;
	//   18   44:iconst_1        
	//   19   45:ireturn         
		}
		return false;
	//   20   46:iconst_0        
	//   21   47:ireturn         
	}

	public static boolean isSidewinderDevice(Context context)
	{
		return DeviceProperties.isSidewinder(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #328 <Method boolean DeviceProperties.isSidewinder(Context)>
	//    2    4:ireturn         
	}

	static boolean isUninstalledAppPossiblyUpdating(Context context, String s)
	{
label0:
		{
			boolean flag = s.equals("com.google.android.gms");
	//    0    0:aload_1         
	//    1    1:ldc1            #18  <String "com.google.android.gms">
	//    2    3:invokevirtual   #256 <Method boolean String.equals(Object)>
	//    3    6:istore_2        
			if(!PlatformVersion.isAtLeastLollipop())
				break label0;
	//    4    7:invokestatic    #334 <Method boolean PlatformVersion.isAtLeastLollipop()>
	//    5   10:ifeq            61
			Object obj;
			try
			{
				obj = ((Object) (context.getPackageManager().getPackageInstaller().getAllSessions()));
	//    6   13:aload_0         
	//    7   14:invokevirtual   #137 <Method PackageManager Context.getPackageManager()>
	//    8   17:invokevirtual   #338 <Method PackageInstaller PackageManager.getPackageInstaller()>
	//    9   20:invokevirtual   #344 <Method List PackageInstaller.getAllSessions()>
	//   10   23:astore_3        
			}
	//*  11   24:aload_3         
	//*  12   25:invokeinterface #350 <Method Iterator List.iterator()>
	//*  13   30:astore_3        
	//*  14   31:aload_3         
	//*  15   32:invokeinterface #355 <Method boolean Iterator.hasNext()>
	//*  16   37:ifeq            61
	//*  17   40:aload_1         
	//*  18   41:aload_3         
	//*  19   42:invokeinterface #359 <Method Object Iterator.next()>
	//*  20   47:checkcast       #361 <Class android.content.pm.PackageInstaller$SessionInfo>
	//*  21   50:invokevirtual   #364 <Method String android.content.pm.PackageInstaller$SessionInfo.getAppPackageName()>
	//*  22   53:invokevirtual   #256 <Method boolean String.equals(Object)>
	//*  23   56:ifeq            31
	//*  24   59:iconst_1        
	//*  25   60:ireturn         
	//*  26   61:aload_0         
	//*  27   62:invokevirtual   #137 <Method PackageManager Context.getPackageManager()>
	//*  28   65:astore_3        
	//*  29   66:aload_3         
	//*  30   67:aload_1         
	//*  31   68:sipush          8192
	//*  32   71:invokevirtual   #368 <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//*  33   74:astore_1        
	//*  34   75:iload_2         
	//*  35   76:ifeq            84
	//*  36   79:aload_1         
	//*  37   80:getfield        #373 <Field boolean ApplicationInfo.enabled>
	//*  38   83:ireturn         
	//*  39   84:aload_1         
	//*  40   85:getfield        #373 <Field boolean ApplicationInfo.enabled>
	//*  41   88:ifeq            102
	//*  42   91:aload_0         
	//*  43   92:invokestatic    #375 <Method boolean isRestrictedUserProfile(Context)>
	//*  44   95:istore_2        
	//*  45   96:iload_2         
	//*  46   97:ifne            102
	//*  47  100:iconst_1        
	//*  48  101:ireturn         
	//*  49  102:iconst_0        
	//*  50  103:ireturn         
			// Misplaced declaration of an exception variable
			catch(Context context)
	//*  51  104:astore_0        
			{
				return false;
	//   52  105:iconst_0        
	//   53  106:ireturn         
			}
			obj = ((Object) (((List) (obj)).iterator()));
			do
				if(!((Iterator) (obj)).hasNext())
					break label0;
			while(!s.equals(((Object) (((android.content.pm.PackageInstaller.SessionInfo)((Iterator) (obj)).next()).getAppPackageName()))));
			return true;
		}
		obj = ((Object) (context.getPackageManager()));
		try
		{
			s = ((String) (((PackageManager) (obj)).getApplicationInfo(s, 8192)));
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  54  107:astore_0        
		{
			return false;
	//   55  108:iconst_0        
	//   56  109:ireturn         
		}
		if(!flag)
			break MISSING_BLOCK_LABEL_84;
		return ((ApplicationInfo) (s)).enabled;
		if(!((ApplicationInfo) (s)).enabled)
			break MISSING_BLOCK_LABEL_102;
		flag = isRestrictedUserProfile(context);
		if(!flag)
			return true;
		return false;
	}

	public static boolean isUserRecoverableError(int i)
	{
		if(i != 9)
	//*   0    0:iload_0         
	//*   1    1:bipush          9
	//*   2    3:icmpeq          34
			switch(i)
	//*   3    6:iload_0         
			{
	//*   4    7:tableswitch     1 3: default 32
	//	               1 34
	//	               2 34
	//	               3 34
			default:
				return false;
	//    5   32:iconst_0        
	//    6   33:ireturn         

			case 1: // '\001'
			case 2: // '\002'
			case 3: // '\003'
				break;
			}
		return true;
	//    7   34:iconst_1        
	//    8   35:ireturn         
	}

	public static boolean uidHasPackageName(Context context, int i, String s)
	{
		return UidVerifier.uidHasPackageName(context, i, s);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #382 <Method boolean UidVerifier.uidHasPackageName(Context, int, String)>
	//    4    6:ireturn         
	}

	private static int zza(Context context, boolean flag, int i)
	{
		boolean flag1;
		if(i >= 0)
	//*   0    0:iload_2         
	//*   1    1:iflt            10
			flag1 = true;
	//    2    4:iconst_1        
	//    3    5:istore          4
		else
	//*   4    7:goto            13
			flag1 = false;
	//    5   10:iconst_0        
	//    6   11:istore          4
		Preconditions.checkArgument(flag1);
	//    7   13:iload           4
	//    8   15:invokestatic    #385 <Method void Preconditions.checkArgument(boolean)>
		PackageManager packagemanager = context.getPackageManager();
	//    9   18:aload_0         
	//   10   19:invokevirtual   #137 <Method PackageManager Context.getPackageManager()>
	//   11   22:astore          6
		Object obj = null;
	//   12   24:aconst_null     
	//   13   25:astore          5
		if(flag)
	//*  14   27:iload_1         
	//*  15   28:ifeq            58
			try
			{
				obj = ((Object) (packagemanager.getPackageInfo("com.android.vending", 8256)));
	//   16   31:aload           6
	//   17   33:ldc1            #24  <String "com.android.vending">
	//   18   35:sipush          8256
	//   19   38:invokevirtual   #143 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   20   41:astore          5
			}
	//*  21   43:goto            58
	//*  22   46:ldc1            #113 <String "GooglePlayServicesUtil">
	//*  23   48:ldc2            #387 <String "Google Play Store is missing.">
	//*  24   51:invokestatic    #153 <Method int Log.w(String, String)>
	//*  25   54:pop             
	//*  26   55:bipush          9
	//*  27   57:ireturn         
	//*  28   58:aload           6
	//*  29   60:ldc1            #18  <String "com.google.android.gms">
	//*  30   62:bipush          64
	//*  31   64:invokevirtual   #143 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//*  32   67:astore          7
	//*  33   69:aload_0         
	//*  34   70:invokestatic    #212 <Method GoogleSignatureVerifier GoogleSignatureVerifier.getInstance(Context)>
	//*  35   73:pop             
	//*  36   74:aload           7
	//*  37   76:iconst_1        
	//*  38   77:invokestatic    #215 <Method boolean GoogleSignatureVerifier.zza(PackageInfo, boolean)>
	//*  39   80:ifne            95
	//*  40   83:ldc1            #113 <String "GooglePlayServicesUtil">
	//*  41   85:ldc2            #389 <String "Google Play services signature invalid.">
	//*  42   88:invokestatic    #153 <Method int Log.w(String, String)>
	//*  43   91:pop             
	//*  44   92:bipush          9
	//*  45   94:ireturn         
	//*  46   95:iload_1         
	//*  47   96:ifeq            140
	//*  48   99:aload           5
	//*  49  101:iconst_1        
	//*  50  102:invokestatic    #215 <Method boolean GoogleSignatureVerifier.zza(PackageInfo, boolean)>
	//*  51  105:ifeq            128
	//*  52  108:aload           5
	//*  53  110:getfield        #393 <Field Signature[] PackageInfo.signatures>
	//*  54  113:iconst_0        
	//*  55  114:aaload          
	//*  56  115:aload           7
	//*  57  117:getfield        #393 <Field Signature[] PackageInfo.signatures>
	//*  58  120:iconst_0        
	//*  59  121:aaload          
	//*  60  122:invokevirtual   #396 <Method boolean Signature.equals(Object)>
	//*  61  125:ifne            140
	//*  62  128:ldc1            #113 <String "GooglePlayServicesUtil">
	//*  63  130:ldc2            #398 <String "Google Play Store signature invalid.">
	//*  64  133:invokestatic    #153 <Method int Log.w(String, String)>
	//*  65  136:pop             
	//*  66  137:bipush          9
	//*  67  139:ireturn         
	//*  68  140:aload           7
	//*  69  142:getfield        #148 <Field int PackageInfo.versionCode>
	//*  70  145:invokestatic    #404 <Method int zzb.zzc(int)>
	//*  71  148:iload_2         
	//*  72  149:invokestatic    #404 <Method int zzb.zzc(int)>
	//*  73  152:icmpge          211
	//*  74  155:aload           7
	//*  75  157:getfield        #148 <Field int PackageInfo.versionCode>
	//*  76  160:istore_3        
	//*  77  161:new             #100 <Class StringBuilder>
	//*  78  164:dup             
	//*  79  165:bipush          77
	//*  80  167:invokespecial   #102 <Method void StringBuilder(int)>
	//*  81  170:astore_0        
	//*  82  171:aload_0         
	//*  83  172:ldc2            #406 <String "Google Play services out of date.  Requires ">
	//*  84  175:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//*  85  178:pop             
	//*  86  179:aload_0         
	//*  87  180:iload_2         
	//*  88  181:invokevirtual   #111 <Method StringBuilder StringBuilder.append(int)>
	//*  89  184:pop             
	//*  90  185:aload_0         
	//*  91  186:ldc2            #268 <String " but found ">
	//*  92  189:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//*  93  192:pop             
	//*  94  193:aload_0         
	//*  95  194:iload_3         
	//*  96  195:invokevirtual   #111 <Method StringBuilder StringBuilder.append(int)>
	//*  97  198:pop             
	//*  98  199:ldc1            #113 <String "GooglePlayServicesUtil">
	//*  99  201:aload_0         
	//* 100  202:invokevirtual   #117 <Method String StringBuilder.toString()>
	//* 101  205:invokestatic    #153 <Method int Log.w(String, String)>
	//* 102  208:pop             
	//* 103  209:iconst_2        
	//* 104  210:ireturn         
	//* 105  211:aload           7
	//* 106  213:getfield        #410 <Field ApplicationInfo PackageInfo.applicationInfo>
	//* 107  216:astore          5
	//* 108  218:aload           5
	//* 109  220:astore_0        
	//* 110  221:aload           5
	//* 111  223:ifnonnull       251
	//* 112  226:aload           6
	//* 113  228:ldc1            #18  <String "com.google.android.gms">
	//* 114  230:iconst_0        
	//* 115  231:invokevirtual   #368 <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//* 116  234:astore_0        
	//* 117  235:goto            251
	//* 118  238:astore_0        
	//* 119  239:ldc1            #113 <String "GooglePlayServicesUtil">
	//* 120  241:ldc2            #412 <String "Google Play services missing when getting application info.">
	//* 121  244:aload_0         
	//* 122  245:invokestatic    #415 <Method int Log.wtf(String, String, Throwable)>
	//* 123  248:pop             
	//* 124  249:iconst_1        
	//* 125  250:ireturn         
	//* 126  251:aload_0         
	//* 127  252:getfield        #373 <Field boolean ApplicationInfo.enabled>
	//* 128  255:ifne            260
	//* 129  258:iconst_3        
	//* 130  259:ireturn         
	//* 131  260:iconst_0        
	//* 132  261:ireturn         
	//* 133  262:ldc1            #113 <String "GooglePlayServicesUtil">
	//* 134  264:ldc1            #150 <String "Google Play services is missing.">
	//* 135  266:invokestatic    #153 <Method int Log.w(String, String)>
	//* 136  269:pop             
	//* 137  270:iconst_1        
	//* 138  271:ireturn         
			// Misplaced declaration of an exception variable
			catch(Context context)
			{
				Log.w("GooglePlayServicesUtil", "Google Play Store is missing.");
				return 9;
			}
		PackageInfo packageinfo;
		try
		{
			packageinfo = packagemanager.getPackageInfo("com.google.android.gms", 64);
		}
	//* 139  272:astore_0        
	//* 140  273:goto            46
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
			return 1;
		}
		GoogleSignatureVerifier.getInstance(context);
		if(!GoogleSignatureVerifier.zza(packageinfo, true))
		{
			Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
			return 9;
		}
		if(flag && (!GoogleSignatureVerifier.zza(((PackageInfo) (obj)), true) || !((PackageInfo) (obj)).signatures[0].equals(((Object) (packageinfo.signatures[0])))))
		{
			Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
			return 9;
		}
		if(zzb.zzc(packageinfo.versionCode) < zzb.zzc(i))
		{
			int j = packageinfo.versionCode;
			context = ((Context) (new StringBuilder(77)));
			((StringBuilder) (context)).append("Google Play services out of date.  Requires ");
			((StringBuilder) (context)).append(i);
			((StringBuilder) (context)).append(" but found ");
			((StringBuilder) (context)).append(j);
			Log.w("GooglePlayServicesUtil", ((StringBuilder) (context)).toString());
			return 2;
		}
		obj = ((Object) (packageinfo.applicationInfo));
		context = ((Context) (obj));
		if(obj == null)
			try
			{
				context = ((Context) (packagemanager.getApplicationInfo("com.google.android.gms", 0)));
			}
			// Misplaced declaration of an exception variable
			catch(Context context)
			{
				Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.", ((Throwable) (context)));
				return 1;
			}
		return ((ApplicationInfo) (context)).enabled ? 0 : 3;
	//* 141  276:astore_0        
	//* 142  277:goto            262
	}

	static final int GMS_AVAILABILITY_NOTIFICATION_ID = 10436;
	static final int GMS_GENERAL_ERROR_NOTIFICATION_ID = 39789;
	public static final String GOOGLE_PLAY_GAMES_PACKAGE = "com.google.android.play.games";
	public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
	public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 0xbdfcb8;
	public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
	static final AtomicBoolean sCanceledAvailabilityNotification = new AtomicBoolean();
	private static boolean zzah = false;
	private static boolean zzai = false;
	private static boolean zzaj = false;
	private static boolean zzak = false;
	private static final AtomicBoolean zzal = new AtomicBoolean();

	static 
	{
	//    0    0:new             #38  <Class AtomicBoolean>
	//    1    3:dup             
	//    2    4:invokespecial   #41  <Method void AtomicBoolean()>
	//    3    7:putstatic       #43  <Field AtomicBoolean sCanceledAvailabilityNotification>
	//    4   10:new             #38  <Class AtomicBoolean>
	//    5   13:dup             
	//    6   14:invokespecial   #41  <Method void AtomicBoolean()>
	//    7   17:putstatic       #45  <Field AtomicBoolean zzal>
	//*   8   20:return          
	}
}
