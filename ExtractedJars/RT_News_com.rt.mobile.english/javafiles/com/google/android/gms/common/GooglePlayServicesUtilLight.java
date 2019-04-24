// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.*;
import android.content.pm.*;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.internal.MetadataValueReader;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.GmsVersionParser;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import java.io.InputStream;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.gms.common:
//			GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException, GoogleApiAvailabilityLight, ConnectionResult, 
//			GoogleSignatureVerifier

public class GooglePlayServicesUtilLight
{

	GooglePlayServicesUtilLight()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void Object()>
	//    2    4:return          
	}

	public static void cancelAvailabilityErrorNotifications(Context context)
	{
		if(zzbt.getAndSet(true))
	//*   0    0:getstatic       #52  <Field AtomicBoolean zzbt>
	//*   1    3:iconst_1        
	//*   2    4:invokevirtual   #64  <Method boolean AtomicBoolean.getAndSet(boolean)>
	//*   3    7:ifeq            11
			return;
	//    4   10:return          
		try
		{
			context = ((Context) ((NotificationManager)context.getSystemService("notification")));
	//    5   11:aload_0         
	//    6   12:ldc1            #66  <String "notification">
	//    7   14:invokevirtual   #72  <Method Object Context.getSystemService(String)>
	//    8   17:checkcast       #74  <Class NotificationManager>
	//    9   20:astore_0        
		}
	//*  10   21:aload_0         
	//*  11   22:ifnull          32
	//*  12   25:aload_0         
	//*  13   26:sipush          10436
	//*  14   29:invokevirtual   #78  <Method void NotificationManager.cancel(int)>
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
		zzbu.set(true);
	//    0    0:getstatic       #54  <Field AtomicBoolean zzbu>
	//    1    3:iconst_1        
	//    2    4:invokevirtual   #84  <Method void AtomicBoolean.set(boolean)>
	//    3    7:return          
	}

	public static void ensurePlayServicesAvailable(Context context)
		throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException
	{
		ensurePlayServicesAvailable(context, GOOGLE_PLAY_SERVICES_VERSION_CODE);
	//    0    0:aload_0         
	//    1    1:getstatic       #91  <Field int GOOGLE_PLAY_SERVICES_VERSION_CODE>
	//    2    4:invokestatic    #94  <Method void ensurePlayServicesAvailable(Context, int)>
	//    3    7:return          
	}

	public static void ensurePlayServicesAvailable(Context context, int i)
		throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException
	{
		i = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, i);
	//    0    0:invokestatic    #101 <Method GoogleApiAvailabilityLight GoogleApiAvailabilityLight.getInstance()>
	//    1    3:aload_0         
	//    2    4:iload_1         
	//    3    5:invokevirtual   #105 <Method int GoogleApiAvailabilityLight.isGooglePlayServicesAvailable(Context, int)>
	//    4    8:istore_1        
		if(i != 0)
	//*   5    9:iload_1         
	//*   6   10:ifeq            82
		{
			context = ((Context) (GoogleApiAvailabilityLight.getInstance().getErrorResolutionIntent(context, i, "e")));
	//    7   13:invokestatic    #101 <Method GoogleApiAvailabilityLight GoogleApiAvailabilityLight.getInstance()>
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:ldc1            #107 <String "e">
	//   11   20:invokevirtual   #111 <Method Intent GoogleApiAvailabilityLight.getErrorResolutionIntent(Context, int, String)>
	//   12   23:astore_0        
			StringBuilder stringbuilder = new StringBuilder(57);
	//   13   24:new             #113 <Class StringBuilder>
	//   14   27:dup             
	//   15   28:bipush          57
	//   16   30:invokespecial   #115 <Method void StringBuilder(int)>
	//   17   33:astore_2        
			stringbuilder.append("GooglePlayServices not available due to error ");
	//   18   34:aload_2         
	//   19   35:ldc1            #117 <String "GooglePlayServices not available due to error ">
	//   20   37:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   21   40:pop             
			stringbuilder.append(i);
	//   22   41:aload_2         
	//   23   42:iload_1         
	//   24   43:invokevirtual   #124 <Method StringBuilder StringBuilder.append(int)>
	//   25   46:pop             
			Log.e("GooglePlayServicesUtil", stringbuilder.toString());
	//   26   47:ldc1            #126 <String "GooglePlayServicesUtil">
	//   27   49:aload_2         
	//   28   50:invokevirtual   #130 <Method String StringBuilder.toString()>
	//   29   53:invokestatic    #135 <Method int Log.e(String, String)>
	//   30   56:pop             
			if(context == null)
	//*  31   57:aload_0         
	//*  32   58:ifnonnull       70
				throw new GooglePlayServicesNotAvailableException(i);
	//   33   61:new             #89  <Class GooglePlayServicesNotAvailableException>
	//   34   64:dup             
	//   35   65:iload_1         
	//   36   66:invokespecial   #136 <Method void GooglePlayServicesNotAvailableException(int)>
	//   37   69:athrow          
			else
				throw new GooglePlayServicesRepairableException(i, "Google Play Services not available", ((Intent) (context)));
	//   38   70:new             #87  <Class GooglePlayServicesRepairableException>
	//   39   73:dup             
	//   40   74:iload_1         
	//   41   75:ldc1            #138 <String "Google Play Services not available">
	//   42   77:aload_0         
	//   43   78:invokespecial   #141 <Method void GooglePlayServicesRepairableException(int, String, Intent)>
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
	//    1    1:invokevirtual   #149 <Method PackageManager Context.getPackageManager()>
	//    2    4:ldc1            #14  <String "com.google.android.gms">
	//    3    6:iconst_0        
	//    4    7:invokevirtual   #155 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//    5   10:astore_0        
		}
	//*   6   11:aload_0         
	//*   7   12:getfield        #160 <Field int PackageInfo.versionCode>
	//*   8   15:ireturn         
	//*   9   16:ldc1            #126 <String "GooglePlayServicesUtil">
	//*  10   18:ldc1            #162 <String "Google Play services is missing.">
	//*  11   20:invokestatic    #165 <Method int Log.w(String, String)>
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
	//    1    1:invokestatic    #171 <Method void Preconditions.checkState(boolean)>
		return ClientLibraryUtils.getClientVersion(context, context.getPackageName());
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #174 <Method String Context.getPackageName()>
	//    5    9:invokestatic    #179 <Method int ClientLibraryUtils.getClientVersion(Context, String)>
	//    6   12:ireturn         
	}

	public static PendingIntent getErrorPendingIntent(int i, Context context, int j)
	{
		return GoogleApiAvailabilityLight.getInstance().getErrorResolutionPendingIntent(context, i, j);
	//    0    0:invokestatic    #101 <Method GoogleApiAvailabilityLight GoogleApiAvailabilityLight.getInstance()>
	//    1    3:aload_1         
	//    2    4:iload_0         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #185 <Method PendingIntent GoogleApiAvailabilityLight.getErrorResolutionPendingIntent(Context, int, int)>
	//    5    9:areturn         
	}

	public static String getErrorString(int i)
	{
		return ConnectionResult.zza(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #192 <Method String ConnectionResult.zza(int)>
	//    2    4:areturn         
	}

	public static Intent getGooglePlayServicesAvailabilityRecoveryIntent(int i)
	{
		return GoogleApiAvailabilityLight.getInstance().getErrorResolutionIntent(((Context) (null)), i, ((String) (null)));
	//    0    0:invokestatic    #101 <Method GoogleApiAvailabilityLight GoogleApiAvailabilityLight.getInstance()>
	//    1    3:aconst_null     
	//    2    4:iload_0         
	//    3    5:aconst_null     
	//    4    6:invokevirtual   #111 <Method Intent GoogleApiAvailabilityLight.getErrorResolutionIntent(Context, int, String)>
	//    5    9:areturn         
	}

	public static String getOpenSourceSoftwareLicenseInfo(Context context)
	{
		Object obj;
		obj = ((Object) ((new android.net.Uri.Builder()).scheme("android.resource").authority("com.google.android.gms").appendPath("raw").appendPath("oss_notice").build()));
	//    0    0:new             #203 <Class android.net.Uri$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #204 <Method void android.net.Uri$Builder()>
	//    3    7:ldc1            #206 <String "android.resource">
	//    4    9:invokevirtual   #210 <Method android.net.Uri$Builder android.net.Uri$Builder.scheme(String)>
	//    5   12:ldc1            #14  <String "com.google.android.gms">
	//    6   14:invokevirtual   #213 <Method android.net.Uri$Builder android.net.Uri$Builder.authority(String)>
	//    7   17:ldc1            #215 <String "raw">
	//    8   19:invokevirtual   #218 <Method android.net.Uri$Builder android.net.Uri$Builder.appendPath(String)>
	//    9   22:ldc1            #220 <String "oss_notice">
	//   10   24:invokevirtual   #218 <Method android.net.Uri$Builder android.net.Uri$Builder.appendPath(String)>
	//   11   27:invokevirtual   #224 <Method android.net.Uri android.net.Uri$Builder.build()>
	//   12   30:astore_1        
		try
		{
			context = ((Context) (context.getContentResolver().openInputStream(((android.net.Uri) (obj)))));
	//   13   31:aload_0         
	//   14   32:invokevirtual   #228 <Method ContentResolver Context.getContentResolver()>
	//   15   35:aload_1         
	//   16   36:invokevirtual   #234 <Method InputStream ContentResolver.openInputStream(android.net.Uri)>
	//   17   39:astore_0        
		}
	//*  18   40:new             #236 <Class Scanner>
	//*  19   43:dup             
	//*  20   44:aload_0         
	//*  21   45:invokespecial   #239 <Method void Scanner(InputStream)>
	//*  22   48:ldc1            #241 <String "\\A">
	//*  23   50:invokevirtual   #245 <Method Scanner Scanner.useDelimiter(String)>
	//*  24   53:invokevirtual   #248 <Method String Scanner.next()>
	//*  25   56:astore_1        
	//*  26   57:aload_0         
	//*  27   58:ifnull          95
	//*  28   61:aload_0         
	//*  29   62:invokevirtual   #253 <Method void InputStream.close()>
	//*  30   65:aload_1         
	//*  31   66:areturn         
	//*  32   67:astore_1        
	//*  33   68:aload_0         
	//*  34   69:ifnull          76
	//*  35   72:aload_0         
	//*  36   73:invokevirtual   #253 <Method void InputStream.close()>
	//*  37   76:aload_1         
	//*  38   77:athrow          
	//*  39   78:aload_0         
	//*  40   79:ifnull          86
	//*  41   82:aload_0         
	//*  42   83:invokevirtual   #253 <Method void InputStream.close()>
	//*  43   86:aconst_null     
	//*  44   87:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  45   88:astore_0        
		{
			return null;
	//   46   89:aconst_null     
	//   47   90:areturn         
		}
		obj = ((Object) ((new Scanner(((InputStream) (context)))).useDelimiter("\\A").next()));
		if(context == null)
			break MISSING_BLOCK_LABEL_95;
		((InputStream) (context)).close();
		return ((String) (obj));
		obj;
		if(context == null)
			break MISSING_BLOCK_LABEL_76;
		((InputStream) (context)).close();
		throw obj;
_L2:
		if(context == null)
			break MISSING_BLOCK_LABEL_86;
		((InputStream) (context)).close();
		return null;
		obj;
	//   48   91:astore_1        
		if(true) goto _L2; else goto _L1
	//   49   92:goto            78
_L1:
		return ((String) (obj));
	//   50   95:aload_1         
	//   51   96:areturn         
	}

	public static Context getRemoteContext(Context context)
	{
		try
		{
			context = context.createPackageContext("com.google.android.gms", 3);
	//    0    0:aload_0         
	//    1    1:ldc1            #14  <String "com.google.android.gms">
	//    2    3:iconst_3        
	//    3    4:invokevirtual   #259 <Method Context Context.createPackageContext(String, int)>
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
	//    1    1:invokevirtual   #149 <Method PackageManager Context.getPackageManager()>
	//    2    4:ldc1            #14  <String "com.google.android.gms">
	//    3    6:invokevirtual   #265 <Method Resources PackageManager.getResourcesForApplication(String)>
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
		return isTestKeysBuild(context) || !isUserBuildDevice();
	//    0    0:aload_0         
	//    1    1:invokestatic    #270 <Method boolean isTestKeysBuild(Context)>
	//    2    4:ifne            18
	//    3    7:invokestatic    #274 <Method boolean isUserBuildDevice()>
	//    4   10:ifne            16
	//    5   13:goto            18
	//    6   16:iconst_0        
	//    7   17:ireturn         
	//    8   18:iconst_1        
	//    9   19:ireturn         
	}

	public static int isGooglePlayServicesAvailable(Context context)
	{
		return isGooglePlayServicesAvailable(context, GOOGLE_PLAY_SERVICES_VERSION_CODE);
	//    0    0:aload_0         
	//    1    1:getstatic       #91  <Field int GOOGLE_PLAY_SERVICES_VERSION_CODE>
	//    2    4:invokestatic    #275 <Method int isGooglePlayServicesAvailable(Context, int)>
	//    3    7:ireturn         
	}

	public static int isGooglePlayServicesAvailable(Context context, int i)
	{
		Throwable throwable;
		try
		{
			context.getResources().getString(R.string.common_google_play_services_unknown_issue);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #281 <Method Resources Context.getResources()>
	//    2    4:getstatic       #286 <Field int R$string.common_google_play_services_unknown_issue>
	//    3    7:invokevirtual   #291 <Method String Resources.getString(int)>
	//    4   10:pop             
		}
	//*   5   11:goto            23
	//*   6   14:ldc1            #126 <String "GooglePlayServicesUtil">
	//*   7   16:ldc2            #293 <String "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.">
	//*   8   19:invokestatic    #135 <Method int Log.e(String, String)>
	//*   9   22:pop             
	//*  10   23:ldc1            #14  <String "com.google.android.gms">
	//*  11   25:aload_0         
	//*  12   26:invokevirtual   #174 <Method String Context.getPackageName()>
	//*  13   29:invokevirtual   #299 <Method boolean String.equals(Object)>
	//*  14   32:ifne            134
	//*  15   35:getstatic       #54  <Field AtomicBoolean zzbu>
	//*  16   38:invokevirtual   #302 <Method boolean AtomicBoolean.get()>
	//*  17   41:ifne            134
	//*  18   44:aload_0         
	//*  19   45:invokestatic    #307 <Method int MetadataValueReader.getGooglePlayServicesVersion(Context)>
	//*  20   48:istore_2        
	//*  21   49:iload_2         
	//*  22   50:ifne            64
	//*  23   53:new             #309 <Class IllegalStateException>
	//*  24   56:dup             
	//*  25   57:ldc2            #311 <String "A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />">
	//*  26   60:invokespecial   #314 <Method void IllegalStateException(String)>
	//*  27   63:athrow          
	//*  28   64:iload_2         
	//*  29   65:getstatic       #91  <Field int GOOGLE_PLAY_SERVICES_VERSION_CODE>
	//*  30   68:icmpeq          134
	//*  31   71:getstatic       #91  <Field int GOOGLE_PLAY_SERVICES_VERSION_CODE>
	//*  32   74:istore_1        
	//*  33   75:new             #113 <Class StringBuilder>
	//*  34   78:dup             
	//*  35   79:sipush          320
	//*  36   82:invokespecial   #115 <Method void StringBuilder(int)>
	//*  37   85:astore_0        
	//*  38   86:aload_0         
	//*  39   87:ldc2            #316 <String "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ">
	//*  40   90:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//*  41   93:pop             
	//*  42   94:aload_0         
	//*  43   95:iload_1         
	//*  44   96:invokevirtual   #124 <Method StringBuilder StringBuilder.append(int)>
	//*  45   99:pop             
	//*  46  100:aload_0         
	//*  47  101:ldc2            #318 <String " but found ">
	//*  48  104:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//*  49  107:pop             
	//*  50  108:aload_0         
	//*  51  109:iload_2         
	//*  52  110:invokevirtual   #124 <Method StringBuilder StringBuilder.append(int)>
	//*  53  113:pop             
	//*  54  114:aload_0         
	//*  55  115:ldc2            #320 <String ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />">
	//*  56  118:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//*  57  121:pop             
	//*  58  122:new             #309 <Class IllegalStateException>
	//*  59  125:dup             
	//*  60  126:aload_0         
	//*  61  127:invokevirtual   #130 <Method String StringBuilder.toString()>
	//*  62  130:invokespecial   #314 <Method void IllegalStateException(String)>
	//*  63  133:athrow          
	//*  64  134:aload_0         
	//*  65  135:invokestatic    #325 <Method boolean DeviceProperties.isWearableWithoutPlayStore(Context)>
	//*  66  138:ifne            153
	//*  67  141:aload_0         
	//*  68  142:invokestatic    #328 <Method boolean DeviceProperties.isIoT(Context)>
	//*  69  145:ifne            153
	//*  70  148:iconst_1        
	//*  71  149:istore_3        
	//*  72  150:goto            155
	//*  73  153:iconst_0        
	//*  74  154:istore_3        
	//*  75  155:aload_0         
	//*  76  156:iload_3         
	//*  77  157:iload_1         
	//*  78  158:invokestatic    #331 <Method int zza(Context, boolean, int)>
	//*  79  161:ireturn         
		// Misplaced declaration of an exception variable
		catch(Throwable throwable)
		{
			Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
		}
		if(!"com.google.android.gms".equals(((Object) (context.getPackageName()))) && !zzbu.get())
		{
			int j = MetadataValueReader.getGooglePlayServicesVersion(context);
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
		if(!DeviceProperties.isWearableWithoutPlayStore(context) && !DeviceProperties.isIoT(context))
			flag = true;
		else
			flag = false;
		return zza(context, flag, i);
	//*  80  162:astore          4
	//*  81  164:goto            14
	}

	public static boolean isGooglePlayServicesUid(Context context, int i)
	{
		return UidVerifier.isGooglePlayServicesUid(context, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #337 <Method boolean UidVerifier.isGooglePlayServicesUid(Context, int)>
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
	//    9   14:ldc1            #14  <String "com.google.android.gms">
	//   10   16:invokestatic    #342 <Method boolean isUninstalledAppPossiblyUpdating(Context, String)>
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
	//    5    9:invokestatic    #342 <Method boolean isUninstalledAppPossiblyUpdating(Context, String)>
	//    6   12:ireturn         
		else
			return false;
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public static boolean isRestrictedUserProfile(Context context)
	{
		if(PlatformVersion.isAtLeastJellyBeanMR2())
	//*   0    0:invokestatic    #352 <Method boolean PlatformVersion.isAtLeastJellyBeanMR2()>
	//*   1    3:ifeq            46
		{
			context = ((Context) (((UserManager)context.getSystemService("user")).getApplicationRestrictions(context.getPackageName())));
	//    2    6:aload_0         
	//    3    7:ldc2            #354 <String "user">
	//    4   10:invokevirtual   #72  <Method Object Context.getSystemService(String)>
	//    5   13:checkcast       #356 <Class UserManager>
	//    6   16:aload_0         
	//    7   17:invokevirtual   #174 <Method String Context.getPackageName()>
	//    8   20:invokevirtual   #360 <Method Bundle UserManager.getApplicationRestrictions(String)>
	//    9   23:astore_0        
			if(context != null && "true".equals(((Object) (((Bundle) (context)).getString("restricted_profile")))))
	//*  10   24:aload_0         
	//*  11   25:ifnull          46
	//*  12   28:ldc2            #362 <String "true">
	//*  13   31:aload_0         
	//*  14   32:ldc2            #364 <String "restricted_profile">
	//*  15   35:invokevirtual   #369 <Method String Bundle.getString(String)>
	//*  16   38:invokevirtual   #299 <Method boolean String.equals(Object)>
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
	//    1    1:invokestatic    #373 <Method boolean DeviceProperties.isSidewinder(Context)>
	//    2    4:ireturn         
	}

	public static boolean isTestKeysBuild(Context context)
	{
		if(zzbs)
			break MISSING_BLOCK_LABEL_87;
	//    0    0:getstatic       #375 <Field boolean zzbs>
	//    1    3:ifne            87
		PackageInfo packageinfo;
		packageinfo = Wrappers.packageManager(context).getPackageInfo("com.google.android.gms", 64);
	//    2    6:aload_0         
	//    3    7:invokestatic    #381 <Method PackageManagerWrapper Wrappers.packageManager(Context)>
	//    4   10:ldc1            #14  <String "com.google.android.gms">
	//    5   12:bipush          64
	//    6   14:invokevirtual   #384 <Method PackageInfo PackageManagerWrapper.getPackageInfo(String, int)>
	//    7   17:astore_1        
		context = ((Context) (GoogleSignatureVerifier.getInstance(context)));
	//    8   18:aload_0         
	//    9   19:invokestatic    #389 <Method GoogleSignatureVerifier GoogleSignatureVerifier.getInstance(Context)>
	//   10   22:astore_0        
		if(packageinfo == null)
			break MISSING_BLOCK_LABEL_52;
	//   11   23:aload_1         
	//   12   24:ifnull          52
		if(!((GoogleSignatureVerifier) (context)).isGooglePublicSignedPackage(packageinfo, false) && ((GoogleSignatureVerifier) (context)).isGooglePublicSignedPackage(packageinfo, true))
	//*  13   27:aload_0         
	//*  14   28:aload_1         
	//*  15   29:iconst_0        
	//*  16   30:invokevirtual   #393 <Method boolean GoogleSignatureVerifier.isGooglePublicSignedPackage(PackageInfo, boolean)>
	//*  17   33:ifne            52
	//*  18   36:aload_0         
	//*  19   37:aload_1         
	//*  20   38:iconst_1        
	//*  21   39:invokevirtual   #393 <Method boolean GoogleSignatureVerifier.isGooglePublicSignedPackage(PackageInfo, boolean)>
	//*  22   42:ifeq            52
		{
			zzbr = true;
	//   23   45:iconst_1        
	//   24   46:putstatic       #395 <Field boolean zzbr>
			break MISSING_BLOCK_LABEL_74;
	//   25   49:goto            74
		}
		try
		{
			zzbr = false;
	//   26   52:iconst_0        
	//   27   53:putstatic       #395 <Field boolean zzbr>
			break MISSING_BLOCK_LABEL_74;
	//   28   56:goto            74
		}
	//*  29   59:astore_0        
	//*  30   60:goto            81
		// Misplaced declaration of an exception variable
		catch(Context context) { }
	//   31   63:astore_0        
		break MISSING_BLOCK_LABEL_64;
		context;
		break MISSING_BLOCK_LABEL_81;
		Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", ((Throwable) (context)));
	//   32   64:ldc1            #126 <String "GooglePlayServicesUtil">
	//   33   66:ldc2            #397 <String "Cannot find Google Play services package name.">
	//   34   69:aload_0         
	//   35   70:invokestatic    #400 <Method int Log.w(String, String, Throwable)>
	//   36   73:pop             
		zzbs = true;
	//   37   74:iconst_1        
	//   38   75:putstatic       #375 <Field boolean zzbs>
		break MISSING_BLOCK_LABEL_87;
	//   39   78:goto            87
		zzbs = true;
	//   40   81:iconst_1        
	//   41   82:putstatic       #375 <Field boolean zzbs>
		throw context;
	//   42   85:aload_0         
	//   43   86:athrow          
		return zzbr;
	//   44   87:getstatic       #395 <Field boolean zzbr>
	//   45   90:ireturn         
	}

	static boolean isUninstalledAppPossiblyUpdating(Context context, String s)
	{
label0:
		{
			boolean flag = s.equals("com.google.android.gms");
	//    0    0:aload_1         
	//    1    1:ldc1            #14  <String "com.google.android.gms">
	//    2    3:invokevirtual   #299 <Method boolean String.equals(Object)>
	//    3    6:istore_2        
			if(!PlatformVersion.isAtLeastLollipop())
				break label0;
	//    4    7:invokestatic    #404 <Method boolean PlatformVersion.isAtLeastLollipop()>
	//    5   10:ifeq            61
			Object obj;
			try
			{
				obj = ((Object) (context.getPackageManager().getPackageInstaller().getAllSessions()));
	//    6   13:aload_0         
	//    7   14:invokevirtual   #149 <Method PackageManager Context.getPackageManager()>
	//    8   17:invokevirtual   #408 <Method PackageInstaller PackageManager.getPackageInstaller()>
	//    9   20:invokevirtual   #414 <Method List PackageInstaller.getAllSessions()>
	//   10   23:astore_3        
			}
	//*  11   24:aload_3         
	//*  12   25:invokeinterface #420 <Method Iterator List.iterator()>
	//*  13   30:astore_3        
	//*  14   31:aload_3         
	//*  15   32:invokeinterface #425 <Method boolean Iterator.hasNext()>
	//*  16   37:ifeq            61
	//*  17   40:aload_1         
	//*  18   41:aload_3         
	//*  19   42:invokeinterface #428 <Method Object Iterator.next()>
	//*  20   47:checkcast       #430 <Class android.content.pm.PackageInstaller$SessionInfo>
	//*  21   50:invokevirtual   #433 <Method String android.content.pm.PackageInstaller$SessionInfo.getAppPackageName()>
	//*  22   53:invokevirtual   #299 <Method boolean String.equals(Object)>
	//*  23   56:ifeq            31
	//*  24   59:iconst_1        
	//*  25   60:ireturn         
	//*  26   61:aload_0         
	//*  27   62:invokevirtual   #149 <Method PackageManager Context.getPackageManager()>
	//*  28   65:astore_3        
	//*  29   66:aload_3         
	//*  30   67:aload_1         
	//*  31   68:sipush          8192
	//*  32   71:invokevirtual   #437 <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//*  33   74:astore_1        
	//*  34   75:iload_2         
	//*  35   76:ifeq            84
	//*  36   79:aload_1         
	//*  37   80:getfield        #442 <Field boolean ApplicationInfo.enabled>
	//*  38   83:ireturn         
	//*  39   84:aload_1         
	//*  40   85:getfield        #442 <Field boolean ApplicationInfo.enabled>
	//*  41   88:ifeq            102
	//*  42   91:aload_0         
	//*  43   92:invokestatic    #444 <Method boolean isRestrictedUserProfile(Context)>
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

	public static boolean isUserBuildDevice()
	{
		return DeviceProperties.isUserBuild();
	//    0    0:invokestatic    #447 <Method boolean DeviceProperties.isUserBuild()>
	//    1    3:ireturn         
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
	//    3    3:invokestatic    #454 <Method boolean UidVerifier.uidHasPackageName(Context, int, String)>
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
	//    8   15:invokestatic    #457 <Method void Preconditions.checkArgument(boolean)>
		packagemanager = context.getPackageManager();
	//    9   18:aload_0         
	//   10   19:invokevirtual   #149 <Method PackageManager Context.getPackageManager()>
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
	//   19   38:invokevirtual   #155 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   20   41:astore          5
		  goto _L2
	//*  21   43:goto            60
_L6:
		context = "Google Play Store is missing.";
	//   22   46:ldc2            #459 <String "Google Play Store is missing.">
	//   23   49:astore_0        
_L4:
		Log.w("GooglePlayServicesUtil", ((String) (context)));
	//   24   50:ldc1            #126 <String "GooglePlayServicesUtil">
	//   25   52:aload_0         
	//   26   53:invokestatic    #165 <Method int Log.w(String, String)>
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
	//   31   62:ldc1            #14  <String "com.google.android.gms">
	//   32   64:bipush          64
	//   33   66:invokevirtual   #155 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   34   69:astore          7
		}
	//*  35   71:aload_0         
	//*  36   72:invokestatic    #389 <Method GoogleSignatureVerifier GoogleSignatureVerifier.getInstance(Context)>
	//*  37   75:astore_0        
	//*  38   76:aload_0         
	//*  39   77:aload           7
	//*  40   79:iconst_1        
	//*  41   80:invokevirtual   #393 <Method boolean GoogleSignatureVerifier.isGooglePublicSignedPackage(PackageInfo, boolean)>
	//*  42   83:ifne            93
	//*  43   86:ldc2            #461 <String "Google Play services signature invalid.">
	//*  44   89:astore_0        
	//*  45   90:goto            50
	//*  46   93:iload_1         
	//*  47   94:ifeq            134
	//*  48   97:aload_0         
	//*  49   98:aload           5
	//*  50  100:iconst_1        
	//*  51  101:invokevirtual   #393 <Method boolean GoogleSignatureVerifier.isGooglePublicSignedPackage(PackageInfo, boolean)>
	//*  52  104:ifeq            127
	//*  53  107:aload           5
	//*  54  109:getfield        #465 <Field Signature[] PackageInfo.signatures>
	//*  55  112:iconst_0        
	//*  56  113:aaload          
	//*  57  114:aload           7
	//*  58  116:getfield        #465 <Field Signature[] PackageInfo.signatures>
	//*  59  119:iconst_0        
	//*  60  120:aaload          
	//*  61  121:invokevirtual   #468 <Method boolean Signature.equals(Object)>
	//*  62  124:ifne            134
	//*  63  127:ldc2            #470 <String "Google Play Store signature invalid.">
	//*  64  130:astore_0        
	//*  65  131:goto            50
	//*  66  134:aload           7
	//*  67  136:getfield        #160 <Field int PackageInfo.versionCode>
	//*  68  139:invokestatic    #476 <Method int GmsVersionParser.parseBuildVersion(int)>
	//*  69  142:iload_2         
	//*  70  143:invokestatic    #476 <Method int GmsVersionParser.parseBuildVersion(int)>
	//*  71  146:icmpge          205
	//*  72  149:aload           7
	//*  73  151:getfield        #160 <Field int PackageInfo.versionCode>
	//*  74  154:istore_3        
	//*  75  155:new             #113 <Class StringBuilder>
	//*  76  158:dup             
	//*  77  159:bipush          77
	//*  78  161:invokespecial   #115 <Method void StringBuilder(int)>
	//*  79  164:astore_0        
	//*  80  165:aload_0         
	//*  81  166:ldc2            #478 <String "Google Play services out of date.  Requires ">
	//*  82  169:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//*  83  172:pop             
	//*  84  173:aload_0         
	//*  85  174:iload_2         
	//*  86  175:invokevirtual   #124 <Method StringBuilder StringBuilder.append(int)>
	//*  87  178:pop             
	//*  88  179:aload_0         
	//*  89  180:ldc2            #318 <String " but found ">
	//*  90  183:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//*  91  186:pop             
	//*  92  187:aload_0         
	//*  93  188:iload_3         
	//*  94  189:invokevirtual   #124 <Method StringBuilder StringBuilder.append(int)>
	//*  95  192:pop             
	//*  96  193:ldc1            #126 <String "GooglePlayServicesUtil">
	//*  97  195:aload_0         
	//*  98  196:invokevirtual   #130 <Method String StringBuilder.toString()>
	//*  99  199:invokestatic    #165 <Method int Log.w(String, String)>
	//* 100  202:pop             
	//* 101  203:iconst_2        
	//* 102  204:ireturn         
	//* 103  205:aload           7
	//* 104  207:getfield        #482 <Field ApplicationInfo PackageInfo.applicationInfo>
	//* 105  210:astore          5
	//* 106  212:aload           5
	//* 107  214:astore_0        
	//* 108  215:aload           5
	//* 109  217:ifnonnull       245
	//* 110  220:aload           6
	//* 111  222:ldc1            #14  <String "com.google.android.gms">
	//* 112  224:iconst_0        
	//* 113  225:invokevirtual   #437 <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//* 114  228:astore_0        
	//* 115  229:goto            245
	//* 116  232:astore_0        
	//* 117  233:ldc1            #126 <String "GooglePlayServicesUtil">
	//* 118  235:ldc2            #484 <String "Google Play services missing when getting application info.">
	//* 119  238:aload_0         
	//* 120  239:invokestatic    #487 <Method int Log.wtf(String, String, Throwable)>
	//* 121  242:pop             
	//* 122  243:iconst_1        
	//* 123  244:ireturn         
	//* 124  245:aload_0         
	//* 125  246:getfield        #442 <Field boolean ApplicationInfo.enabled>
	//* 126  249:ifne            254
	//* 127  252:iconst_3        
	//* 128  253:ireturn         
	//* 129  254:iconst_0        
	//* 130  255:ireturn         
	//* 131  256:ldc1            #126 <String "GooglePlayServicesUtil">
	//* 132  258:ldc1            #162 <String "Google Play services is missing.">
	//* 133  260:invokestatic    #165 <Method int Log.w(String, String)>
	//* 134  263:pop             
	//* 135  264:iconst_1        
	//* 136  265:ireturn         
	//* 137  266:astore_0        
	//* 138  267:goto            46
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
			return 1;
		}
		context = ((Context) (GoogleSignatureVerifier.getInstance(context)));
		if(!((GoogleSignatureVerifier) (context)).isGooglePublicSignedPackage(packageinfo, true))
		{
			context = "Google Play services signature invalid.";
			continue; /* Loop/switch isn't completed */
		}
		if(!flag || ((GoogleSignatureVerifier) (context)).isGooglePublicSignedPackage(((PackageInfo) (obj)), true) && ((PackageInfo) (obj)).signatures[0].equals(((Object) (packageinfo.signatures[0]))))
			break; /* Loop/switch isn't completed */
		context = "Google Play Store signature invalid.";
		if(true) goto _L4; else goto _L3
_L3:
		if(GmsVersionParser.parseBuildVersion(packageinfo.versionCode) < GmsVersionParser.parseBuildVersion(i))
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
	//* 139  270:astore_0        
	//* 140  271:goto            256
	}

	public static final String FEATURE_SIDEWINDER = "cn.google";
	public static final String GOOGLE_PLAY_GAMES_PACKAGE = "com.google.android.play.games";
	public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
	public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 0xbdfcb8;
	public static final String GOOGLE_PLAY_STORE_GAMES_URI_STRING = "http://play.google.com/store/apps/category/GAME";
	public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
	public static final String GOOGLE_PLAY_STORE_URI_STRING = "http://play.google.com/store/apps/";
	public static final boolean HONOR_DEBUG_CERTIFICATES = false;
	public static final String KEY_METADATA_GOOGLE_PLAY_SERVICES_VERSION = "com.google.android.gms.version";
	public static final int MAX_ATTEMPTS_NO_SUCH_ALGORITHM = 2;
	public static boolean sIsTestMode = false;
	public static boolean sTestIsUserBuild = false;
	private static boolean zzbr = false;
	private static boolean zzbs = false;
	static final AtomicBoolean zzbt = new AtomicBoolean();
	private static final AtomicBoolean zzbu = new AtomicBoolean();

	static 
	{
	//    0    0:new             #47  <Class AtomicBoolean>
	//    1    3:dup             
	//    2    4:invokespecial   #50  <Method void AtomicBoolean()>
	//    3    7:putstatic       #52  <Field AtomicBoolean zzbt>
	//    4   10:new             #47  <Class AtomicBoolean>
	//    5   13:dup             
	//    6   14:invokespecial   #50  <Method void AtomicBoolean()>
	//    7   17:putstatic       #54  <Field AtomicBoolean zzbu>
	//*   8   20:return          
	}
}
