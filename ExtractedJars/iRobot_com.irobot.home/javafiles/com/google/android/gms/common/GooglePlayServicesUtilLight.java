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
//			GoogleApiAvailabilityLight, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException, ConnectionResult, 
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
		zzak.set(true);
	//    0    0:getstatic       #45  <Field AtomicBoolean zzak>
	//    1    3:iconst_1        
	//    2    4:invokevirtual   #76  <Method void AtomicBoolean.set(boolean)>
	//    3    7:return          
	}

	public static void ensurePlayServicesAvailable(Context context, int i)
	{
		i = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, i);
	//    0    0:invokestatic    #84  <Method GoogleApiAvailabilityLight GoogleApiAvailabilityLight.getInstance()>
	//    1    3:aload_0         
	//    2    4:iload_1         
	//    3    5:invokevirtual   #88  <Method int GoogleApiAvailabilityLight.isGooglePlayServicesAvailable(Context, int)>
	//    4    8:istore_1        
		if(i != 0)
	//*   5    9:iload_1         
	//*   6   10:ifeq            82
		{
			context = ((Context) (GoogleApiAvailabilityLight.getInstance().getErrorResolutionIntent(context, i, "e")));
	//    7   13:invokestatic    #84  <Method GoogleApiAvailabilityLight GoogleApiAvailabilityLight.getInstance()>
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:ldc1            #90  <String "e">
	//   11   20:invokevirtual   #94  <Method Intent GoogleApiAvailabilityLight.getErrorResolutionIntent(Context, int, String)>
	//   12   23:astore_0        
			StringBuilder stringbuilder = new StringBuilder(57);
	//   13   24:new             #96  <Class StringBuilder>
	//   14   27:dup             
	//   15   28:bipush          57
	//   16   30:invokespecial   #98  <Method void StringBuilder(int)>
	//   17   33:astore_2        
			stringbuilder.append("GooglePlayServices not available due to error ");
	//   18   34:aload_2         
	//   19   35:ldc1            #100 <String "GooglePlayServices not available due to error ">
	//   20   37:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   21   40:pop             
			stringbuilder.append(i);
	//   22   41:aload_2         
	//   23   42:iload_1         
	//   24   43:invokevirtual   #107 <Method StringBuilder StringBuilder.append(int)>
	//   25   46:pop             
			Log.e("GooglePlayServicesUtil", stringbuilder.toString());
	//   26   47:ldc1            #109 <String "GooglePlayServicesUtil">
	//   27   49:aload_2         
	//   28   50:invokevirtual   #113 <Method String StringBuilder.toString()>
	//   29   53:invokestatic    #118 <Method int Log.e(String, String)>
	//   30   56:pop             
			if(context == null)
	//*  31   57:aload_0         
	//*  32   58:ifnonnull       70
				throw new GooglePlayServicesNotAvailableException(i);
	//   33   61:new             #120 <Class GooglePlayServicesNotAvailableException>
	//   34   64:dup             
	//   35   65:iload_1         
	//   36   66:invokespecial   #121 <Method void GooglePlayServicesNotAvailableException(int)>
	//   37   69:athrow          
			else
				throw new GooglePlayServicesRepairableException(i, "Google Play Services not available", ((Intent) (context)));
	//   38   70:new             #123 <Class GooglePlayServicesRepairableException>
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
	//    1    1:invokevirtual   #136 <Method PackageManager Context.getPackageManager()>
	//    2    4:ldc1            #18  <String "com.google.android.gms">
	//    3    6:iconst_0        
	//    4    7:invokevirtual   #142 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//    5   10:astore_0        
		}
	//*   6   11:aload_0         
	//*   7   12:getfield        #147 <Field int PackageInfo.versionCode>
	//*   8   15:ireturn         
	//*   9   16:ldc1            #109 <String "GooglePlayServicesUtil">
	//*  10   18:ldc1            #149 <String "Google Play services is missing.">
	//*  11   20:invokestatic    #152 <Method int Log.w(String, String)>
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
	//    1    1:invokestatic    #158 <Method void Preconditions.checkState(boolean)>
		return ClientLibraryUtils.getClientVersion(context, context.getPackageName());
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #161 <Method String Context.getPackageName()>
	//    5    9:invokestatic    #166 <Method int ClientLibraryUtils.getClientVersion(Context, String)>
	//    6   12:ireturn         
	}

	public static PendingIntent getErrorPendingIntent(int i, Context context, int j)
	{
		return GoogleApiAvailabilityLight.getInstance().getErrorResolutionPendingIntent(context, i, j);
	//    0    0:invokestatic    #84  <Method GoogleApiAvailabilityLight GoogleApiAvailabilityLight.getInstance()>
	//    1    3:aload_1         
	//    2    4:iload_0         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #172 <Method PendingIntent GoogleApiAvailabilityLight.getErrorResolutionPendingIntent(Context, int, int)>
	//    5    9:areturn         
	}

	public static String getErrorString(int i)
	{
		return ConnectionResult.zza(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #179 <Method String ConnectionResult.zza(int)>
	//    2    4:areturn         
	}

	public static Intent getGooglePlayServicesAvailabilityRecoveryIntent(int i)
	{
		return GoogleApiAvailabilityLight.getInstance().getErrorResolutionIntent(((Context) (null)), i, ((String) (null)));
	//    0    0:invokestatic    #84  <Method GoogleApiAvailabilityLight GoogleApiAvailabilityLight.getInstance()>
	//    1    3:aconst_null     
	//    2    4:iload_0         
	//    3    5:aconst_null     
	//    4    6:invokevirtual   #94  <Method Intent GoogleApiAvailabilityLight.getErrorResolutionIntent(Context, int, String)>
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
	//    3    4:invokevirtual   #187 <Method Context Context.createPackageContext(String, int)>
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
	//    1    1:invokevirtual   #136 <Method PackageManager Context.getPackageManager()>
	//    2    4:ldc1            #18  <String "com.google.android.gms">
	//    3    6:invokevirtual   #193 <Method Resources PackageManager.getResourcesForApplication(String)>
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
		if(zzaj)
			break MISSING_BLOCK_LABEL_84;
	//    0    0:getstatic       #197 <Field boolean zzaj>
	//    1    3:ifne            84
		PackageInfo packageinfo;
		packageinfo = Wrappers.packageManager(context).getPackageInfo("com.google.android.gms", 64);
	//    2    6:aload_0         
	//    3    7:invokestatic    #203 <Method PackageManagerWrapper Wrappers.packageManager(Context)>
	//    4   10:ldc1            #18  <String "com.google.android.gms">
	//    5   12:bipush          64
	//    6   14:invokevirtual   #206 <Method PackageInfo PackageManagerWrapper.getPackageInfo(String, int)>
	//    7   17:astore_1        
		GoogleSignatureVerifier.getInstance(context);
	//    8   18:aload_0         
	//    9   19:invokestatic    #211 <Method GoogleSignatureVerifier GoogleSignatureVerifier.getInstance(Context)>
	//   10   22:pop             
		if(packageinfo == null)
			break MISSING_BLOCK_LABEL_50;
	//   11   23:aload_1         
	//   12   24:ifnull          50
		if(!GoogleSignatureVerifier.zza(packageinfo, false) && GoogleSignatureVerifier.zza(packageinfo, true))
	//*  13   27:aload_1         
	//*  14   28:iconst_0        
	//*  15   29:invokestatic    #214 <Method boolean GoogleSignatureVerifier.zza(PackageInfo, boolean)>
	//*  16   32:ifne            50
	//*  17   35:aload_1         
	//*  18   36:iconst_1        
	//*  19   37:invokestatic    #214 <Method boolean GoogleSignatureVerifier.zza(PackageInfo, boolean)>
	//*  20   40:ifeq            50
		{
			zzai = true;
	//   21   43:iconst_1        
	//   22   44:putstatic       #216 <Field boolean zzai>
			break MISSING_BLOCK_LABEL_71;
	//   23   47:goto            71
		}
		try
		{
			zzai = false;
	//   24   50:iconst_0        
	//   25   51:putstatic       #216 <Field boolean zzai>
			break MISSING_BLOCK_LABEL_71;
	//   26   54:goto            71
		}
	//*  27   57:astore_0        
	//*  28   58:goto            78
		// Misplaced declaration of an exception variable
		catch(Context context) { }
	//   29   61:astore_0        
		break MISSING_BLOCK_LABEL_62;
		context;
		break MISSING_BLOCK_LABEL_78;
		Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", ((Throwable) (context)));
	//   30   62:ldc1            #109 <String "GooglePlayServicesUtil">
	//   31   64:ldc1            #218 <String "Cannot find Google Play services package name.">
	//   32   66:aload_0         
	//   33   67:invokestatic    #221 <Method int Log.w(String, String, Throwable)>
	//   34   70:pop             
		zzaj = true;
	//   35   71:iconst_1        
	//   36   72:putstatic       #197 <Field boolean zzaj>
		break MISSING_BLOCK_LABEL_84;
	//   37   75:goto            84
		zzaj = true;
	//   38   78:iconst_1        
	//   39   79:putstatic       #197 <Field boolean zzaj>
		throw context;
	//   40   82:aload_0         
	//   41   83:athrow          
		if(!zzai)
	//*  42   84:getstatic       #216 <Field boolean zzai>
	//*  43   87:ifne            100
			return !DeviceProperties.isUserBuild();
	//   44   90:invokestatic    #227 <Method boolean DeviceProperties.isUserBuild()>
	//   45   93:ifne            98
	//   46   96:iconst_1        
	//   47   97:ireturn         
	//   48   98:iconst_0        
	//   49   99:ireturn         
		else
			return true;
	//   50  100:iconst_1        
	//   51  101:ireturn         
	}

	public static int isGooglePlayServicesAvailable(Context context)
	{
		return isGooglePlayServicesAvailable(context, GOOGLE_PLAY_SERVICES_VERSION_CODE);
	//    0    0:aload_0         
	//    1    1:getstatic       #230 <Field int GOOGLE_PLAY_SERVICES_VERSION_CODE>
	//    2    4:invokestatic    #231 <Method int isGooglePlayServicesAvailable(Context, int)>
	//    3    7:ireturn         
	}

	public static int isGooglePlayServicesAvailable(Context context, int i)
	{
		Throwable throwable;
		try
		{
			context.getResources().getString(R.string.common_google_play_services_unknown_issue);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #237 <Method Resources Context.getResources()>
	//    2    4:getstatic       #242 <Field int R$string.common_google_play_services_unknown_issue>
	//    3    7:invokevirtual   #247 <Method String Resources.getString(int)>
	//    4   10:pop             
		}
	//*   5   11:goto            22
	//*   6   14:ldc1            #109 <String "GooglePlayServicesUtil">
	//*   7   16:ldc1            #249 <String "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.">
	//*   8   18:invokestatic    #118 <Method int Log.e(String, String)>
	//*   9   21:pop             
	//*  10   22:ldc1            #18  <String "com.google.android.gms">
	//*  11   24:aload_0         
	//*  12   25:invokevirtual   #161 <Method String Context.getPackageName()>
	//*  13   28:invokevirtual   #255 <Method boolean String.equals(Object)>
	//*  14   31:ifne            133
	//*  15   34:getstatic       #45  <Field AtomicBoolean zzak>
	//*  16   37:invokevirtual   #258 <Method boolean AtomicBoolean.get()>
	//*  17   40:ifne            133
	//*  18   43:aload_0         
	//*  19   44:invokestatic    #263 <Method int zzp.zzd(Context)>
	//*  20   47:istore_2        
	//*  21   48:iload_2         
	//*  22   49:ifne            63
	//*  23   52:new             #265 <Class IllegalStateException>
	//*  24   55:dup             
	//*  25   56:ldc2            #267 <String "A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />">
	//*  26   59:invokespecial   #270 <Method void IllegalStateException(String)>
	//*  27   62:athrow          
	//*  28   63:iload_2         
	//*  29   64:getstatic       #230 <Field int GOOGLE_PLAY_SERVICES_VERSION_CODE>
	//*  30   67:icmpeq          133
	//*  31   70:getstatic       #230 <Field int GOOGLE_PLAY_SERVICES_VERSION_CODE>
	//*  32   73:istore_1        
	//*  33   74:new             #96  <Class StringBuilder>
	//*  34   77:dup             
	//*  35   78:sipush          320
	//*  36   81:invokespecial   #98  <Method void StringBuilder(int)>
	//*  37   84:astore_0        
	//*  38   85:aload_0         
	//*  39   86:ldc2            #272 <String "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ">
	//*  40   89:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//*  41   92:pop             
	//*  42   93:aload_0         
	//*  43   94:iload_1         
	//*  44   95:invokevirtual   #107 <Method StringBuilder StringBuilder.append(int)>
	//*  45   98:pop             
	//*  46   99:aload_0         
	//*  47  100:ldc2            #274 <String " but found ">
	//*  48  103:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//*  49  106:pop             
	//*  50  107:aload_0         
	//*  51  108:iload_2         
	//*  52  109:invokevirtual   #107 <Method StringBuilder StringBuilder.append(int)>
	//*  53  112:pop             
	//*  54  113:aload_0         
	//*  55  114:ldc2            #276 <String ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />">
	//*  56  117:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//*  57  120:pop             
	//*  58  121:new             #265 <Class IllegalStateException>
	//*  59  124:dup             
	//*  60  125:aload_0         
	//*  61  126:invokevirtual   #113 <Method String StringBuilder.toString()>
	//*  62  129:invokespecial   #270 <Method void IllegalStateException(String)>
	//*  63  132:athrow          
	//*  64  133:aload_0         
	//*  65  134:invokestatic    #279 <Method boolean DeviceProperties.isWearableWithoutPlayStore(Context)>
	//*  66  137:ifne            152
	//*  67  140:aload_0         
	//*  68  141:invokestatic    #282 <Method boolean DeviceProperties.zzf(Context)>
	//*  69  144:ifne            152
	//*  70  147:iconst_1        
	//*  71  148:istore_3        
	//*  72  149:goto            154
	//*  73  152:iconst_0        
	//*  74  153:istore_3        
	//*  75  154:aload_0         
	//*  76  155:iload_3         
	//*  77  156:iload_1         
	//*  78  157:invokestatic    #285 <Method int zza(Context, boolean, int)>
	//*  79  160:ireturn         
		// Misplaced declaration of an exception variable
		catch(Throwable throwable)
		{
			Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
		}
		if(!"com.google.android.gms".equals(((Object) (context.getPackageName()))) && !zzak.get())
		{
			int j = zzp.zzd(context);
			if(j == 0)
				throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
			if(j != GOOGLE_PLAY_SERVICES_VERSION_CODE)
			{
				i = GOOGLE_PLAY_SERVICES_VERSION_CODE;
				context = ((Context) (new StringBuilder(320)));
				((StringBuilder) (context)).append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
				((StringBuilder) (context)).append(i);
				((StringBuilder) (context)).append(" but found ");
				((StringBuilder) (context)).append(j);
				((StringBuilder) (context)).append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
				throw new IllegalStateException(((StringBuilder) (context)).toString());
			}
		}
		boolean flag;
		if(!DeviceProperties.isWearableWithoutPlayStore(context) && !DeviceProperties.zzf(context))
			flag = true;
		else
			flag = false;
		return zza(context, flag, i);
	//*  80  161:astore          4
	//*  81  163:goto            14
	}

	public static boolean isGooglePlayServicesUid(Context context, int i)
	{
		return UidVerifier.isGooglePlayServicesUid(context, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #291 <Method boolean UidVerifier.isGooglePlayServicesUid(Context, int)>
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
	//   10   16:invokestatic    #296 <Method boolean isUninstalledAppPossiblyUpdating(Context, String)>
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
	//    5    9:invokestatic    #296 <Method boolean isUninstalledAppPossiblyUpdating(Context, String)>
	//    6   12:ireturn         
		else
			return false;
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public static boolean isRestrictedUserProfile(Context context)
	{
		if(PlatformVersion.isAtLeastJellyBeanMR2())
	//*   0    0:invokestatic    #306 <Method boolean PlatformVersion.isAtLeastJellyBeanMR2()>
	//*   1    3:ifeq            46
		{
			context = ((Context) (((UserManager)context.getSystemService("user")).getApplicationRestrictions(context.getPackageName())));
	//    2    6:aload_0         
	//    3    7:ldc2            #308 <String "user">
	//    4   10:invokevirtual   #64  <Method Object Context.getSystemService(String)>
	//    5   13:checkcast       #310 <Class UserManager>
	//    6   16:aload_0         
	//    7   17:invokevirtual   #161 <Method String Context.getPackageName()>
	//    8   20:invokevirtual   #314 <Method Bundle UserManager.getApplicationRestrictions(String)>
	//    9   23:astore_0        
			if(context != null && "true".equals(((Object) (((Bundle) (context)).getString("restricted_profile")))))
	//*  10   24:aload_0         
	//*  11   25:ifnull          46
	//*  12   28:ldc2            #316 <String "true">
	//*  13   31:aload_0         
	//*  14   32:ldc2            #318 <String "restricted_profile">
	//*  15   35:invokevirtual   #323 <Method String Bundle.getString(String)>
	//*  16   38:invokevirtual   #255 <Method boolean String.equals(Object)>
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
	//    1    1:invokestatic    #327 <Method boolean DeviceProperties.isSidewinder(Context)>
	//    2    4:ireturn         
	}

	static boolean isUninstalledAppPossiblyUpdating(Context context, String s)
	{
label0:
		{
			boolean flag = s.equals("com.google.android.gms");
	//    0    0:aload_1         
	//    1    1:ldc1            #18  <String "com.google.android.gms">
	//    2    3:invokevirtual   #255 <Method boolean String.equals(Object)>
	//    3    6:istore_2        
			if(!PlatformVersion.isAtLeastLollipop())
				break label0;
	//    4    7:invokestatic    #333 <Method boolean PlatformVersion.isAtLeastLollipop()>
	//    5   10:ifeq            61
			Object obj;
			try
			{
				obj = ((Object) (context.getPackageManager().getPackageInstaller().getAllSessions()));
	//    6   13:aload_0         
	//    7   14:invokevirtual   #136 <Method PackageManager Context.getPackageManager()>
	//    8   17:invokevirtual   #337 <Method PackageInstaller PackageManager.getPackageInstaller()>
	//    9   20:invokevirtual   #343 <Method List PackageInstaller.getAllSessions()>
	//   10   23:astore_3        
			}
	//*  11   24:aload_3         
	//*  12   25:invokeinterface #349 <Method Iterator List.iterator()>
	//*  13   30:astore_3        
	//*  14   31:aload_3         
	//*  15   32:invokeinterface #354 <Method boolean Iterator.hasNext()>
	//*  16   37:ifeq            61
	//*  17   40:aload_1         
	//*  18   41:aload_3         
	//*  19   42:invokeinterface #358 <Method Object Iterator.next()>
	//*  20   47:checkcast       #360 <Class android.content.pm.PackageInstaller$SessionInfo>
	//*  21   50:invokevirtual   #363 <Method String android.content.pm.PackageInstaller$SessionInfo.getAppPackageName()>
	//*  22   53:invokevirtual   #255 <Method boolean String.equals(Object)>
	//*  23   56:ifeq            31
	//*  24   59:iconst_1        
	//*  25   60:ireturn         
	//*  26   61:aload_0         
	//*  27   62:invokevirtual   #136 <Method PackageManager Context.getPackageManager()>
	//*  28   65:astore_3        
	//*  29   66:aload_3         
	//*  30   67:aload_1         
	//*  31   68:sipush          8192
	//*  32   71:invokevirtual   #367 <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//*  33   74:astore_1        
	//*  34   75:iload_2         
	//*  35   76:ifeq            84
	//*  36   79:aload_1         
	//*  37   80:getfield        #372 <Field boolean ApplicationInfo.enabled>
	//*  38   83:ireturn         
	//*  39   84:aload_1         
	//*  40   85:getfield        #372 <Field boolean ApplicationInfo.enabled>
	//*  41   88:ifeq            102
	//*  42   91:aload_0         
	//*  43   92:invokestatic    #374 <Method boolean isRestrictedUserProfile(Context)>
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
	//    3    3:invokestatic    #381 <Method boolean UidVerifier.uidHasPackageName(Context, int, String)>
	//    4    6:ireturn         
	}

	private static int zza(Context context, boolean flag, int i)
	{
		Object obj;
		PackageManager packagemanager;
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
	//    8   15:invokestatic    #384 <Method void Preconditions.checkArgument(boolean)>
		packagemanager = context.getPackageManager();
	//    9   18:aload_0         
	//   10   19:invokevirtual   #136 <Method PackageManager Context.getPackageManager()>
	//   11   22:astore          6
		obj = null;
	//   12   24:aconst_null     
	//   13   25:astore          5
		if(!flag) goto _L2; else goto _L1
	//   14   27:iload_1         
	//   15   28:ifeq            60
_L1:
		obj = ((Object) (packagemanager.getPackageInfo("com.android.vending", 8256)));
	//   16   31:aload           6
	//   17   33:ldc1            #24  <String "com.android.vending">
	//   18   35:sipush          8256
	//   19   38:invokevirtual   #142 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   20   41:astore          5
		  goto _L2
	//*  21   43:goto            60
_L6:
		context = "Google Play Store is missing.";
	//   22   46:ldc2            #386 <String "Google Play Store is missing.">
	//   23   49:astore_0        
_L4:
		Log.w("GooglePlayServicesUtil", ((String) (context)));
	//   24   50:ldc1            #109 <String "GooglePlayServicesUtil">
	//   25   52:aload_0         
	//   26   53:invokestatic    #152 <Method int Log.w(String, String)>
	//   27   56:pop             
		return 9;
	//   28   57:bipush          9
	//   29   59:ireturn         
_L2:
		int j;
		PackageInfo packageinfo;
		try
		{
			packageinfo = packagemanager.getPackageInfo("com.google.android.gms", 64);
	//   30   60:aload           6
	//   31   62:ldc1            #18  <String "com.google.android.gms">
	//   32   64:bipush          64
	//   33   66:invokevirtual   #142 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   34   69:astore          7
		}
	//*  35   71:aload_0         
	//*  36   72:invokestatic    #211 <Method GoogleSignatureVerifier GoogleSignatureVerifier.getInstance(Context)>
	//*  37   75:pop             
	//*  38   76:aload           7
	//*  39   78:iconst_1        
	//*  40   79:invokestatic    #214 <Method boolean GoogleSignatureVerifier.zza(PackageInfo, boolean)>
	//*  41   82:ifne            92
	//*  42   85:ldc2            #388 <String "Google Play services signature invalid.">
	//*  43   88:astore_0        
	//*  44   89:goto            50
	//*  45   92:iload_1         
	//*  46   93:ifeq            132
	//*  47   96:aload           5
	//*  48   98:iconst_1        
	//*  49   99:invokestatic    #214 <Method boolean GoogleSignatureVerifier.zza(PackageInfo, boolean)>
	//*  50  102:ifeq            125
	//*  51  105:aload           5
	//*  52  107:getfield        #392 <Field Signature[] PackageInfo.signatures>
	//*  53  110:iconst_0        
	//*  54  111:aaload          
	//*  55  112:aload           7
	//*  56  114:getfield        #392 <Field Signature[] PackageInfo.signatures>
	//*  57  117:iconst_0        
	//*  58  118:aaload          
	//*  59  119:invokevirtual   #395 <Method boolean Signature.equals(Object)>
	//*  60  122:ifne            132
	//*  61  125:ldc2            #397 <String "Google Play Store signature invalid.">
	//*  62  128:astore_0        
	//*  63  129:goto            50
	//*  64  132:aload           7
	//*  65  134:getfield        #147 <Field int PackageInfo.versionCode>
	//*  66  137:invokestatic    #403 <Method int zzb.zzc(int)>
	//*  67  140:iload_2         
	//*  68  141:invokestatic    #403 <Method int zzb.zzc(int)>
	//*  69  144:icmpge          203
	//*  70  147:aload           7
	//*  71  149:getfield        #147 <Field int PackageInfo.versionCode>
	//*  72  152:istore_3        
	//*  73  153:new             #96  <Class StringBuilder>
	//*  74  156:dup             
	//*  75  157:bipush          77
	//*  76  159:invokespecial   #98  <Method void StringBuilder(int)>
	//*  77  162:astore_0        
	//*  78  163:aload_0         
	//*  79  164:ldc2            #405 <String "Google Play services out of date.  Requires ">
	//*  80  167:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//*  81  170:pop             
	//*  82  171:aload_0         
	//*  83  172:iload_2         
	//*  84  173:invokevirtual   #107 <Method StringBuilder StringBuilder.append(int)>
	//*  85  176:pop             
	//*  86  177:aload_0         
	//*  87  178:ldc2            #274 <String " but found ">
	//*  88  181:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//*  89  184:pop             
	//*  90  185:aload_0         
	//*  91  186:iload_3         
	//*  92  187:invokevirtual   #107 <Method StringBuilder StringBuilder.append(int)>
	//*  93  190:pop             
	//*  94  191:ldc1            #109 <String "GooglePlayServicesUtil">
	//*  95  193:aload_0         
	//*  96  194:invokevirtual   #113 <Method String StringBuilder.toString()>
	//*  97  197:invokestatic    #152 <Method int Log.w(String, String)>
	//*  98  200:pop             
	//*  99  201:iconst_2        
	//* 100  202:ireturn         
	//* 101  203:aload           7
	//* 102  205:getfield        #409 <Field ApplicationInfo PackageInfo.applicationInfo>
	//* 103  208:astore          5
	//* 104  210:aload           5
	//* 105  212:astore_0        
	//* 106  213:aload           5
	//* 107  215:ifnonnull       243
	//* 108  218:aload           6
	//* 109  220:ldc1            #18  <String "com.google.android.gms">
	//* 110  222:iconst_0        
	//* 111  223:invokevirtual   #367 <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//* 112  226:astore_0        
	//* 113  227:goto            243
	//* 114  230:astore_0        
	//* 115  231:ldc1            #109 <String "GooglePlayServicesUtil">
	//* 116  233:ldc2            #411 <String "Google Play services missing when getting application info.">
	//* 117  236:aload_0         
	//* 118  237:invokestatic    #414 <Method int Log.wtf(String, String, Throwable)>
	//* 119  240:pop             
	//* 120  241:iconst_1        
	//* 121  242:ireturn         
	//* 122  243:aload_0         
	//* 123  244:getfield        #372 <Field boolean ApplicationInfo.enabled>
	//* 124  247:ifne            252
	//* 125  250:iconst_3        
	//* 126  251:ireturn         
	//* 127  252:iconst_0        
	//* 128  253:ireturn         
	//* 129  254:ldc1            #109 <String "GooglePlayServicesUtil">
	//* 130  256:ldc1            #149 <String "Google Play services is missing.">
	//* 131  258:invokestatic    #152 <Method int Log.w(String, String)>
	//* 132  261:pop             
	//* 133  262:iconst_1        
	//* 134  263:ireturn         
	//* 135  264:astore_0        
	//* 136  265:goto            46
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
			return 1;
		}
		GoogleSignatureVerifier.getInstance(context);
		if(!GoogleSignatureVerifier.zza(packageinfo, true))
		{
			context = "Google Play services signature invalid.";
			continue; /* Loop/switch isn't completed */
		}
		if(!flag || GoogleSignatureVerifier.zza(((PackageInfo) (obj)), true) && ((PackageInfo) (obj)).signatures[0].equals(((Object) (packageinfo.signatures[0]))))
			break; /* Loop/switch isn't completed */
		context = "Google Play Store signature invalid.";
		if(true) goto _L4; else goto _L3
_L3:
		if(zzb.zzc(packageinfo.versionCode) < zzb.zzc(i))
		{
			j = packageinfo.versionCode;
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
		context;
		if(true) goto _L6; else goto _L5
_L5:
	//* 137  268:astore_0        
	//* 138  269:goto            254
	}

	static final int GMS_AVAILABILITY_NOTIFICATION_ID = 10436;
	static final int GMS_GENERAL_ERROR_NOTIFICATION_ID = 39789;
	public static final String GOOGLE_PLAY_GAMES_PACKAGE = "com.google.android.play.games";
	public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
	public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 0xbdfcb8;
	public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
	static final AtomicBoolean sCanceledAvailabilityNotification = new AtomicBoolean();
	private static boolean zzag = false;
	private static boolean zzah = false;
	private static boolean zzai = false;
	private static boolean zzaj = false;
	private static final AtomicBoolean zzak = new AtomicBoolean();

	static 
	{
	//    0    0:new             #38  <Class AtomicBoolean>
	//    1    3:dup             
	//    2    4:invokespecial   #41  <Method void AtomicBoolean()>
	//    3    7:putstatic       #43  <Field AtomicBoolean sCanceledAvailabilityNotification>
	//    4   10:new             #38  <Class AtomicBoolean>
	//    5   13:dup             
	//    6   14:invokespecial   #41  <Method void AtomicBoolean()>
	//    7   17:putstatic       #45  <Field AtomicBoolean zzak>
	//*   8   20:return          
	}
}
