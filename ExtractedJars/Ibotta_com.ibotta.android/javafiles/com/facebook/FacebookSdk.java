// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.*;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.internal.ActivityLifecycleTracker;
import com.facebook.appevents.internal.AppEventsLoggerUtility;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.BoltsMeasurementEventListener;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.LockOnGetVariable;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;

// Referenced classes of package com.facebook:
//			LoggingBehavior, FacebookException, GraphRequest, AccessTokenManager, 
//			ProfileManager, AccessToken, Profile

public final class FacebookSdk
{
	public static interface InitializeCallback
	{

		public abstract void onInitialized();
	}


	public FacebookSdk()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #101 <Method void Object()>
	//    2    4:return          
	}

	public static Context getApplicationContext()
	{
		Validate.sdkInitialized();
	//    0    0:invokestatic    #141 <Method void Validate.sdkInitialized()>
		return applicationContext;
	//    1    3:getstatic       #133 <Field Context applicationContext>
	//    2    6:areturn         
	}

	public static String getApplicationId()
	{
		Validate.sdkInitialized();
	//    0    0:invokestatic    #141 <Method void Validate.sdkInitialized()>
		return applicationId;
	//    1    3:getstatic       #136 <Field String applicationId>
	//    2    6:areturn         
	}

	public static String getApplicationName()
	{
		Validate.sdkInitialized();
	//    0    0:invokestatic    #141 <Method void Validate.sdkInitialized()>
		return applicationName;
	//    1    3:getstatic       #145 <Field String applicationName>
	//    2    6:areturn         
	}

	public static String getApplicationSignature(Context context)
	{
		Validate.sdkInitialized();
	//    0    0:invokestatic    #141 <Method void Validate.sdkInitialized()>
		if(context == null)
	//*   1    3:aload_0         
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		PackageManager packagemanager = context.getPackageManager();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #157 <Method PackageManager Context.getPackageManager()>
	//    7   13:astore_1        
		if(packagemanager == null)
	//*   8   14:aload_1         
	//*   9   15:ifnonnull       20
			return null;
	//   10   18:aconst_null     
	//   11   19:areturn         
		context = ((Context) (context.getPackageName()));
	//   12   20:aload_0         
	//   13   21:invokevirtual   #160 <Method String Context.getPackageName()>
	//   14   24:astore_0        
		Signature asignature[];
		try
		{
			context = ((Context) (packagemanager.getPackageInfo(((String) (context)), 64)));
	//   15   25:aload_1         
	//   16   26:aload_0         
	//   17   27:bipush          64
	//   18   29:invokevirtual   #166 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   19   32:astore_0        
		}
	//*  20   33:aload_0         
	//*  21   34:getfield        #172 <Field Signature[] PackageInfo.signatures>
	//*  22   37:astore_1        
	//*  23   38:aload_1         
	//*  24   39:ifnull          78
	//*  25   42:aload_1         
	//*  26   43:arraylength     
	//*  27   44:ifne            49
	//*  28   47:aconst_null     
	//*  29   48:areturn         
	//*  30   49:ldc1            #174 <String "SHA-1">
	//*  31   51:invokestatic    #180 <Method MessageDigest MessageDigest.getInstance(String)>
	//*  32   54:astore_1        
	//*  33   55:aload_1         
	//*  34   56:aload_0         
	//*  35   57:getfield        #172 <Field Signature[] PackageInfo.signatures>
	//*  36   60:iconst_0        
	//*  37   61:aaload          
	//*  38   62:invokevirtual   #186 <Method byte[] Signature.toByteArray()>
	//*  39   65:invokevirtual   #190 <Method void MessageDigest.update(byte[])>
	//*  40   68:aload_1         
	//*  41   69:invokevirtual   #193 <Method byte[] MessageDigest.digest()>
	//*  42   72:bipush          9
	//*  43   74:invokestatic    #199 <Method String Base64.encodeToString(byte[], int)>
	//*  44   77:areturn         
	//*  45   78:aconst_null     
	//*  46   79:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  47   80:astore_0        
		{
			return null;
	//   48   81:aconst_null     
	//   49   82:areturn         
		}
		asignature = ((PackageInfo) (context)).signatures;
		if(asignature != null)
		{
			if(asignature.length == 0)
				return null;
			MessageDigest messagedigest;
			try
			{
				messagedigest = MessageDigest.getInstance("SHA-1");
			}
			// Misplaced declaration of an exception variable
			catch(Context context)
	//*  50   83:astore_0        
			{
				return null;
	//   51   84:aconst_null     
	//   52   85:areturn         
			}
			messagedigest.update(((PackageInfo) (context)).signatures[0].toByteArray());
			return Base64.encodeToString(messagedigest.digest(), 9);
		} else
		{
			return null;
		}
	}

	public static boolean getAutoLogAppEventsEnabled()
	{
		Validate.sdkInitialized();
	//    0    0:invokestatic    #141 <Method void Validate.sdkInitialized()>
		return autoLogAppEventsEnabled.booleanValue();
	//    1    3:getstatic       #203 <Field Boolean autoLogAppEventsEnabled>
	//    2    6:invokevirtual   #206 <Method boolean Boolean.booleanValue()>
	//    3    9:ireturn         
	}

	public static File getCacheDir()
	{
		Validate.sdkInitialized();
	//    0    0:invokestatic    #141 <Method void Validate.sdkInitialized()>
		return (File)cacheDir.getValue();
	//    1    3:getstatic       #210 <Field LockOnGetVariable cacheDir>
	//    2    6:invokevirtual   #216 <Method Object LockOnGetVariable.getValue()>
	//    3    9:checkcast       #218 <Class File>
	//    4   12:areturn         
	}

	public static int getCallbackRequestCodeOffset()
	{
		Validate.sdkInitialized();
	//    0    0:invokestatic    #141 <Method void Validate.sdkInitialized()>
		return callbackRequestCodeOffset;
	//    1    3:getstatic       #99  <Field int callbackRequestCodeOffset>
	//    2    6:ireturn         
	}

	public static String getClientToken()
	{
		Validate.sdkInitialized();
	//    0    0:invokestatic    #141 <Method void Validate.sdkInitialized()>
		return appClientToken;
	//    1    3:getstatic       #223 <Field String appClientToken>
	//    2    6:areturn         
	}

	public static Executor getExecutor()
	{
		synchronized(LOCK)
	//*   0    0:getstatic       #103 <Field Object LOCK>
	//*   1    3:astore_0        
	//*   2    4:aload_0         
	//*   3    5:monitorenter    
		{
			if(executor == null)
	//*   4    6:getstatic       #227 <Field Executor executor>
	//*   5    9:ifnonnull       18
				executor = AsyncTask.THREAD_POOL_EXECUTOR;
	//    6   12:getstatic       #232 <Field Executor AsyncTask.THREAD_POOL_EXECUTOR>
	//    7   15:putstatic       #227 <Field Executor executor>
		}
	//    8   18:aload_0         
	//    9   19:monitorexit     
		return executor;
	//   10   20:getstatic       #227 <Field Executor executor>
	//   11   23:areturn         
		exception;
	//   12   24:astore_1        
		obj;
	//   13   25:aload_0         
		JVM INSTR monitorexit ;
	//   14   26:monitorexit     
		throw exception;
	//   15   27:aload_1         
	//   16   28:athrow          
	}

	public static String getFacebookDomain()
	{
		return facebookDomain;
	//    0    0:getstatic       #83  <Field String facebookDomain>
	//    1    3:areturn         
	}

	public static String getGraphApiVersion()
	{
		Log.d(TAG, String.format("getGraphApiVersion: %s", new Object[] {
			graphApiVersion
		}));
	//    0    0:getstatic       #59  <Field String TAG>
	//    1    3:ldc1            #236 <String "getGraphApiVersion: %s">
	//    2    5:iconst_1        
	//    3    6:anewarray       Object[]
	//    4    9:dup             
	//    5   10:iconst_0        
	//    6   11:getstatic       #110 <Field String graphApiVersion>
	//    7   14:aastore         
	//    8   15:invokestatic    #242 <Method String String.format(String, Object[])>
	//    9   18:invokestatic    #248 <Method int Log.d(String, String)>
	//   10   21:pop             
		return graphApiVersion;
	//   11   22:getstatic       #110 <Field String graphApiVersion>
	//   12   25:areturn         
	}

	public static boolean getLimitEventAndDataUsage(Context context)
	{
		Validate.sdkInitialized();
	//    0    0:invokestatic    #141 <Method void Validate.sdkInitialized()>
		return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
	//    1    3:aload_0         
	//    2    4:ldc1            #252 <String "com.facebook.sdk.appEventPreferences">
	//    3    6:iconst_0        
	//    4    7:invokevirtual   #256 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    5   10:ldc2            #258 <String "limitEventUsage">
	//    6   13:iconst_0        
	//    7   14:invokeinterface #264 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//    8   19:ireturn         
	}

	public static long getOnProgressThreshold()
	{
		Validate.sdkInitialized();
	//    0    0:invokestatic    #141 <Method void Validate.sdkInitialized()>
		return onProgressThreshold.get();
	//    1    3:getstatic       #92  <Field AtomicLong onProgressThreshold>
	//    2    6:invokevirtual   #269 <Method long AtomicLong.get()>
	//    3    9:lreturn         
	}

	public static String getSdkVersion()
	{
		return "4.34.0";
	//    0    0:ldc2            #272 <String "4.34.0">
	//    1    3:areturn         
	}

	public static boolean isDebugEnabled()
	{
		return isDebugEnabled;
	//    0    0:getstatic       #94  <Field boolean isDebugEnabled>
	//    1    3:ireturn         
	}

	public static boolean isFacebookRequestCode(int i)
	{
		int j = callbackRequestCodeOffset;
	//    0    0:getstatic       #99  <Field int callbackRequestCodeOffset>
	//    1    3:istore_1        
		return i >= j && i < j + 100;
	//    2    4:iload_0         
	//    3    5:iload_1         
	//    4    6:icmplt          19
	//    5    9:iload_0         
	//    6   10:iload_1         
	//    7   11:bipush          100
	//    8   13:iadd            
	//    9   14:icmpge          19
	//   10   17:iconst_1        
	//   11   18:ireturn         
	//   12   19:iconst_0        
	//   13   20:ireturn         
	}

	public static boolean isInitialized()
	{
		com/facebook/FacebookSdk;
	//    0    0:ldc1            #2   <Class FacebookSdk>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		boolean flag = sdkInitialized.booleanValue();
	//    2    3:getstatic       #128 <Field Boolean sdkInitialized>
	//    3    6:invokevirtual   #206 <Method boolean Boolean.booleanValue()>
	//    4    9:istore_0        
		com/facebook/FacebookSdk;
	//    5   10:ldc1            #2   <Class FacebookSdk>
		JVM INSTR monitorexit ;
	//    6   12:monitorexit     
		return flag;
	//    7   13:iload_0         
	//    8   14:ireturn         
		Exception exception;
		exception;
	//    9   15:astore_1        
	//*  10   16:ldc1            #2   <Class FacebookSdk>
		throw exception;
	//   11   18:monitorexit     
	//   12   19:aload_1         
	//   13   20:athrow          
	}

	public static boolean isLegacyTokenUpgradeSupported()
	{
		return isLegacyTokenUpgradeSupported;
	//    0    0:getstatic       #96  <Field boolean isLegacyTokenUpgradeSupported>
	//    1    3:ireturn         
	}

	public static boolean isLoggingBehaviorEnabled(LoggingBehavior loggingbehavior)
	{
		HashSet hashset = loggingBehaviors;
	//    0    0:getstatic       #79  <Field HashSet loggingBehaviors>
	//    1    3:astore_2        
		hashset;
	//    2    4:aload_2         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		boolean flag;
		if(isDebugEnabled() && loggingBehaviors.contains(((Object) (loggingbehavior))))
	//*   4    6:invokestatic    #279 <Method boolean isDebugEnabled()>
	//*   5    9:ifeq            36
	//*   6   12:getstatic       #79  <Field HashSet loggingBehaviors>
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #283 <Method boolean HashSet.contains(Object)>
	//*   9   19:ifeq            36
			flag = true;
	//   10   22:iconst_1        
	//   11   23:istore_1        
		else
	//*  12   24:goto            27
	//*  13   27:aload_2         
	//*  14   28:monitorexit     
	//*  15   29:iload_1         
	//*  16   30:ireturn         
	//*  17   31:astore_0        
	//*  18   32:aload_2         
	//*  19   33:monitorexit     
	//*  20   34:aload_0         
	//*  21   35:athrow          
			flag = false;
	//   22   36:iconst_0        
	//   23   37:istore_1        
		hashset;
		JVM INSTR monitorexit ;
		return flag;
		loggingbehavior;
		hashset;
		JVM INSTR monitorexit ;
		throw loggingbehavior;
	//*  24   38:goto            27
	}

	static void loadDefaultsFromMetadata(Context context)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		try
		{
			context = ((Context) (context.getPackageManager().getApplicationInfo(context.getPackageName(), 128)));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #157 <Method PackageManager Context.getPackageManager()>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #160 <Method String Context.getPackageName()>
	//    7   13:sipush          128
	//    8   16:invokevirtual   #289 <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//    9   19:astore_0        
		}
	//*  10   20:aload_0         
	//*  11   21:ifnull          201
	//*  12   24:aload_0         
	//*  13   25:getfield        #295 <Field Bundle ApplicationInfo.metaData>
	//*  14   28:ifnonnull       32
	//*  15   31:return          
	//*  16   32:getstatic       #136 <Field String applicationId>
	//*  17   35:ifnonnull       116
	//*  18   38:aload_0         
	//*  19   39:getfield        #295 <Field Bundle ApplicationInfo.metaData>
	//*  20   42:ldc2            #297 <String "com.facebook.sdk.ApplicationId">
	//*  21   45:invokevirtual   #302 <Method Object Bundle.get(String)>
	//*  22   48:astore_1        
	//*  23   49:aload_1         
	//*  24   50:instanceof      #238 <Class String>
	//*  25   53:ifeq            95
	//*  26   56:aload_1         
	//*  27   57:checkcast       #238 <Class String>
	//*  28   60:astore_1        
	//*  29   61:aload_1         
	//*  30   62:getstatic       #308 <Field Locale Locale.ROOT>
	//*  31   65:invokevirtual   #312 <Method String String.toLowerCase(Locale)>
	//*  32   68:ldc2            #314 <String "fb">
	//*  33   71:invokevirtual   #318 <Method boolean String.startsWith(String)>
	//*  34   74:ifeq            88
	//*  35   77:aload_1         
	//*  36   78:iconst_2        
	//*  37   79:invokevirtual   #322 <Method String String.substring(int)>
	//*  38   82:putstatic       #136 <Field String applicationId>
	//*  39   85:goto            116
	//*  40   88:aload_1         
	//*  41   89:putstatic       #136 <Field String applicationId>
	//*  42   92:goto            116
	//*  43   95:aload_1         
	//*  44   96:instanceof      #324 <Class Integer>
	//*  45   99:ifne            105
	//*  46  102:goto            116
	//*  47  105:new             #326 <Class FacebookException>
	//*  48  108:dup             
	//*  49  109:ldc2            #328 <String "App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.">
	//*  50  112:invokespecial   #331 <Method void FacebookException(String)>
	//*  51  115:athrow          
	//*  52  116:getstatic       #145 <Field String applicationName>
	//*  53  119:ifnonnull       135
	//*  54  122:aload_0         
	//*  55  123:getfield        #295 <Field Bundle ApplicationInfo.metaData>
	//*  56  126:ldc2            #333 <String "com.facebook.sdk.ApplicationName">
	//*  57  129:invokevirtual   #337 <Method String Bundle.getString(String)>
	//*  58  132:putstatic       #145 <Field String applicationName>
	//*  59  135:getstatic       #223 <Field String appClientToken>
	//*  60  138:ifnonnull       154
	//*  61  141:aload_0         
	//*  62  142:getfield        #295 <Field Bundle ApplicationInfo.metaData>
	//*  63  145:ldc2            #339 <String "com.facebook.sdk.ClientToken">
	//*  64  148:invokevirtual   #337 <Method String Bundle.getString(String)>
	//*  65  151:putstatic       #223 <Field String appClientToken>
	//*  66  154:getstatic       #99  <Field int callbackRequestCodeOffset>
	//*  67  157:ldc1            #97  <Int 64206>
	//*  68  159:icmpne          177
	//*  69  162:aload_0         
	//*  70  163:getfield        #295 <Field Bundle ApplicationInfo.metaData>
	//*  71  166:ldc2            #341 <String "com.facebook.sdk.CallbackOffset">
	//*  72  169:ldc1            #97  <Int 64206>
	//*  73  171:invokevirtual   #345 <Method int Bundle.getInt(String, int)>
	//*  74  174:putstatic       #99  <Field int callbackRequestCodeOffset>
	//*  75  177:getstatic       #203 <Field Boolean autoLogAppEventsEnabled>
	//*  76  180:ifnonnull       200
	//*  77  183:aload_0         
	//*  78  184:getfield        #295 <Field Bundle ApplicationInfo.metaData>
	//*  79  187:ldc2            #347 <String "com.facebook.sdk.AutoLogAppEventsEnabled">
	//*  80  190:iconst_1        
	//*  81  191:invokevirtual   #348 <Method boolean Bundle.getBoolean(String, boolean)>
	//*  82  194:invokestatic    #126 <Method Boolean Boolean.valueOf(boolean)>
	//*  83  197:putstatic       #203 <Field Boolean autoLogAppEventsEnabled>
	//*  84  200:return          
	//*  85  201:return          
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  86  202:astore_0        
		{
			return;
	//   87  203:return          
		}
		if(context != null)
		{
			if(((ApplicationInfo) (context)).metaData == null)
				return;
			if(applicationId == null)
			{
				Object obj = ((ApplicationInfo) (context)).metaData.get("com.facebook.sdk.ApplicationId");
				if(obj instanceof String)
				{
					obj = ((Object) ((String)obj));
					if(((String) (obj)).toLowerCase(Locale.ROOT).startsWith("fb"))
						applicationId = ((String) (obj)).substring(2);
					else
						applicationId = ((String) (obj));
				} else
				if(obj instanceof Integer)
					throw new FacebookException("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
			}
			if(applicationName == null)
				applicationName = ((ApplicationInfo) (context)).metaData.getString("com.facebook.sdk.ApplicationName");
			if(appClientToken == null)
				appClientToken = ((ApplicationInfo) (context)).metaData.getString("com.facebook.sdk.ClientToken");
			if(callbackRequestCodeOffset == 64206)
				callbackRequestCodeOffset = ((ApplicationInfo) (context)).metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
			if(autoLogAppEventsEnabled == null)
				autoLogAppEventsEnabled = Boolean.valueOf(((ApplicationInfo) (context)).metaData.getBoolean("com.facebook.sdk.AutoLogAppEventsEnabled", true));
			return;
		} else
		{
			return;
		}
	}

	static void publishInstallAndWaitForResponse(Context context, String s)
	{
		if(context == null || s == null)
			break MISSING_BLOCK_LABEL_157;
	//    0    0:aload_0         
	//    1    1:ifnull          157
	//    2    4:aload_1         
	//    3    5:ifnull          157
		long l;
		SharedPreferences sharedpreferences;
		Object obj;
		AttributionIdentifiers attributionidentifiers;
		attributionidentifiers = AttributionIdentifiers.getAttributionIdentifiers(context);
	//    4    8:aload_0         
	//    5    9:invokestatic    #360 <Method AttributionIdentifiers AttributionIdentifiers.getAttributionIdentifiers(Context)>
	//    6   12:astore          6
		sharedpreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
	//    7   14:aload_0         
	//    8   15:ldc2            #362 <String "com.facebook.sdk.attributionTracking">
	//    9   18:iconst_0        
	//   10   19:invokevirtual   #256 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   11   22:astore          4
		obj = ((Object) (new StringBuilder()));
	//   12   24:new             #364 <Class StringBuilder>
	//   13   27:dup             
	//   14   28:invokespecial   #365 <Method void StringBuilder()>
	//   15   31:astore          5
		((StringBuilder) (obj)).append(s);
	//   16   33:aload           5
	//   17   35:aload_1         
	//   18   36:invokevirtual   #369 <Method StringBuilder StringBuilder.append(String)>
	//   19   39:pop             
		((StringBuilder) (obj)).append("ping");
	//   20   40:aload           5
	//   21   42:ldc2            #371 <String "ping">
	//   22   45:invokevirtual   #369 <Method StringBuilder StringBuilder.append(String)>
	//   23   48:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   24   49:aload           5
	//   25   51:invokevirtual   #374 <Method String StringBuilder.toString()>
	//   26   54:astore          5
		l = sharedpreferences.getLong(((String) (obj)), 0L);
	//   27   56:aload           4
	//   28   58:aload           5
	//   29   60:lconst_0        
	//   30   61:invokeinterface #378 <Method long SharedPreferences.getLong(String, long)>
	//   31   66:lstore_2        
		context = ((Context) (AppEventsLoggerUtility.getJSONObjectForGraphAPICall(com.facebook.appevents.internal.AppEventsLoggerUtility.GraphAPIActivityType.MOBILE_INSTALL_EVENT, attributionidentifiers, AppEventsLogger.getAnonymousAppDeviceGUID(context), getLimitEventAndDataUsage(context), context)));
	//   32   67:getstatic       #384 <Field com.facebook.appevents.internal.AppEventsLoggerUtility$GraphAPIActivityType com.facebook.appevents.internal.AppEventsLoggerUtility$GraphAPIActivityType.MOBILE_INSTALL_EVENT>
	//   33   70:aload           6
	//   34   72:aload_0         
	//   35   73:invokestatic    #389 <Method String AppEventsLogger.getAnonymousAppDeviceGUID(Context)>
	//   36   76:aload_0         
	//   37   77:invokestatic    #391 <Method boolean getLimitEventAndDataUsage(Context)>
	//   38   80:aload_0         
	//   39   81:invokestatic    #397 <Method org.json.JSONObject AppEventsLoggerUtility.getJSONObjectForGraphAPICall(com.facebook.appevents.internal.AppEventsLoggerUtility$GraphAPIActivityType, AttributionIdentifiers, String, boolean, Context)>
	//   40   84:astore_0        
		context = ((Context) (GraphRequest.newPostRequest(((AccessToken) (null)), String.format("%s/activities", new Object[] {
			s
		}), ((org.json.JSONObject) (context)), ((GraphRequest.Callback) (null)))));
	//   41   85:aconst_null     
	//   42   86:ldc2            #399 <String "%s/activities">
	//   43   89:iconst_1        
	//   44   90:anewarray       Object[]
	//   45   93:dup             
	//   46   94:iconst_0        
	//   47   95:aload_1         
	//   48   96:aastore         
	//   49   97:invokestatic    #242 <Method String String.format(String, Object[])>
	//   50  100:aload_0         
	//   51  101:aconst_null     
	//   52  102:invokestatic    #405 <Method GraphRequest GraphRequest.newPostRequest(AccessToken, String, org.json.JSONObject, GraphRequest$Callback)>
	//   53  105:astore_0        
		if(l == 0L)
	//*  54  106:lload_2         
	//*  55  107:lconst_0        
	//*  56  108:lcmp            
	//*  57  109:ifne            176
			try
			{
				((GraphRequest) (context)).executeAndWait();
	//   58  112:aload_0         
	//   59  113:invokevirtual   #409 <Method GraphResponse GraphRequest.executeAndWait()>
	//   60  116:pop             
				context = ((Context) (sharedpreferences.edit()));
	//   61  117:aload           4
	//   62  119:invokeinterface #413 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   63  124:astore_0        
				((android.content.SharedPreferences.Editor) (context)).putLong(((String) (obj)), System.currentTimeMillis());
	//   64  125:aload_0         
	//   65  126:aload           5
	//   66  128:invokestatic    #418 <Method long System.currentTimeMillis()>
	//   67  131:invokeinterface #424 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//   68  136:pop             
				((android.content.SharedPreferences.Editor) (context)).apply();
	//   69  137:aload_0         
	//   70  138:invokeinterface #427 <Method void android.content.SharedPreferences$Editor.apply()>
				return;
	//   71  143:return          
			}
	//*  72  144:astore_0        
	//*  73  145:new             #326 <Class FacebookException>
	//*  74  148:dup             
	//*  75  149:ldc2            #429 <String "An error occurred while publishing install.">
	//*  76  152:aload_0         
	//*  77  153:invokespecial   #432 <Method void FacebookException(String, Throwable)>
	//*  78  156:athrow          
	//*  79  157:new             #434 <Class IllegalArgumentException>
	//*  80  160:dup             
	//*  81  161:ldc2            #436 <String "Both context and applicationId must be non-null">
	//*  82  164:invokespecial   #437 <Method void IllegalArgumentException(String)>
	//*  83  167:athrow          
			// Misplaced declaration of an exception variable
			catch(Context context)
	//*  84  168:astore_0        
			{
				Utility.logd("Facebook-publish", ((Exception) (context)));
	//   85  169:ldc2            #439 <String "Facebook-publish">
	//   86  172:aload_0         
	//   87  173:invokestatic    #445 <Method void Utility.logd(String, Exception)>
			}
		break MISSING_BLOCK_LABEL_176;
		context;
		throw new FacebookException("An error occurred while publishing install.", ((Throwable) (context)));
		throw new IllegalArgumentException("Both context and applicationId must be non-null");
	//   88  176:return          
	}

	public static void publishInstallAsync(Context context, String s)
	{
		context = context.getApplicationContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #448 <Method Context Context.getApplicationContext()>
	//    2    4:astore_0        
		getExecutor().execute(new Runnable(context, s) {

			public void run()
			{
				FacebookSdk.publishInstallAndWaitForResponse(applicationContext, applicationId);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field Context val$applicationContext>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field String val$applicationId>
			//    4    8:invokestatic    #28  <Method void FacebookSdk.publishInstallAndWaitForResponse(Context, String)>
			//    5   11:return          
			}

			final Context val$applicationContext;
			final String val$applicationId;

			
			{
				applicationContext = context;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field Context val$applicationContext>
				applicationId = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field String val$applicationId>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    3    5:invokestatic    #450 <Method Executor getExecutor()>
	//    4    8:new             #12  <Class FacebookSdk$4>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokespecial   #452 <Method void FacebookSdk$4(Context, String)>
	//    9   17:invokeinterface #458 <Method void Executor.execute(Runnable)>
	//   10   22:return          
	}

	public static void sdkInitialize(Context context)
	{
		com/facebook/FacebookSdk;
	//    0    0:ldc1            #2   <Class FacebookSdk>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		sdkInitialize(context, ((InitializeCallback) (null)));
	//    2    3:aload_0         
	//    3    4:aconst_null     
	//    4    5:invokestatic    #463 <Method void sdkInitialize(Context, FacebookSdk$InitializeCallback)>
		com/facebook/FacebookSdk;
	//    5    8:ldc1            #2   <Class FacebookSdk>
		JVM INSTR monitorexit ;
	//    6   10:monitorexit     
		return;
	//    7   11:return          
		context;
	//    8   12:astore_0        
	//*   9   13:ldc1            #2   <Class FacebookSdk>
		throw context;
	//   10   15:monitorexit     
	//   11   16:aload_0         
	//   12   17:athrow          
	}

	public static void sdkInitialize(Context context, InitializeCallback initializecallback)
	{
		com/facebook/FacebookSdk;
	//    0    0:ldc1            #2   <Class FacebookSdk>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(!sdkInitialized.booleanValue())
			break MISSING_BLOCK_LABEL_26;
	//    2    3:getstatic       #128 <Field Boolean sdkInitialized>
	//    3    6:invokevirtual   #206 <Method boolean Boolean.booleanValue()>
	//    4    9:ifeq            26
		if(initializecallback == null)
			break MISSING_BLOCK_LABEL_22;
	//    5   12:aload_1         
	//    6   13:ifnull          22
		initializecallback.onInitialized();
	//    7   16:aload_1         
	//    8   17:invokeinterface #467 <Method void FacebookSdk$InitializeCallback.onInitialized()>
		com/facebook/FacebookSdk;
	//    9   22:ldc1            #2   <Class FacebookSdk>
		JVM INSTR monitorexit ;
	//   10   24:monitorexit     
		return;
	//   11   25:return          
		Validate.notNull(((Object) (context)), "applicationContext");
	//   12   26:aload_0         
	//   13   27:ldc2            #468 <String "applicationContext">
	//   14   30:invokestatic    #472 <Method void Validate.notNull(Object, String)>
		Validate.hasFacebookActivity(context, false);
	//   15   33:aload_0         
	//   16   34:iconst_0        
	//   17   35:invokestatic    #476 <Method void Validate.hasFacebookActivity(Context, boolean)>
		Validate.hasInternetPermissions(context, false);
	//   18   38:aload_0         
	//   19   39:iconst_0        
	//   20   40:invokestatic    #479 <Method void Validate.hasInternetPermissions(Context, boolean)>
		applicationContext = context.getApplicationContext();
	//   21   43:aload_0         
	//   22   44:invokevirtual   #448 <Method Context Context.getApplicationContext()>
	//   23   47:putstatic       #133 <Field Context applicationContext>
		loadDefaultsFromMetadata(applicationContext);
	//   24   50:getstatic       #133 <Field Context applicationContext>
	//   25   53:invokestatic    #481 <Method void loadDefaultsFromMetadata(Context)>
		if(Utility.isNullOrEmpty(applicationId))
			break MISSING_BLOCK_LABEL_162;
	//   26   56:getstatic       #136 <Field String applicationId>
	//   27   59:invokestatic    #484 <Method boolean Utility.isNullOrEmpty(String)>
	//   28   62:ifne            162
		if((applicationContext instanceof Application) && autoLogAppEventsEnabled.booleanValue())
	//*  29   65:getstatic       #133 <Field Context applicationContext>
	//*  30   68:instanceof      #486 <Class Application>
	//*  31   71:ifeq            95
	//*  32   74:getstatic       #203 <Field Boolean autoLogAppEventsEnabled>
	//*  33   77:invokevirtual   #206 <Method boolean Boolean.booleanValue()>
	//*  34   80:ifeq            95
			ActivityLifecycleTracker.startTracking((Application)applicationContext, applicationId);
	//   35   83:getstatic       #133 <Field Context applicationContext>
	//   36   86:checkcast       #486 <Class Application>
	//   37   89:getstatic       #136 <Field String applicationId>
	//   38   92:invokestatic    #492 <Method void ActivityLifecycleTracker.startTracking(Application, String)>
		sdkInitialized = Boolean.valueOf(true);
	//   39   95:iconst_1        
	//   40   96:invokestatic    #126 <Method Boolean Boolean.valueOf(boolean)>
	//   41   99:putstatic       #128 <Field Boolean sdkInitialized>
		FetchedAppSettingsManager.loadAppSettingsAsync();
	//   42  102:invokestatic    #497 <Method void FetchedAppSettingsManager.loadAppSettingsAsync()>
		NativeProtocol.updateAllAvailableProtocolVersionsAsync();
	//   43  105:invokestatic    #502 <Method void NativeProtocol.updateAllAvailableProtocolVersionsAsync()>
		BoltsMeasurementEventListener.getInstance(applicationContext);
	//   44  108:getstatic       #133 <Field Context applicationContext>
	//   45  111:invokestatic    #507 <Method BoltsMeasurementEventListener BoltsMeasurementEventListener.getInstance(Context)>
	//   46  114:pop             
		cacheDir = new LockOnGetVariable(new Callable() {

			public File call()
				throws Exception
			{
				return FacebookSdk.applicationContext.getCacheDir();
			//    0    0:invokestatic    #25  <Method Context FacebookSdk.access$000()>
			//    1    3:invokevirtual   #30  <Method File Context.getCacheDir()>
			//    2    6:areturn         
			}

			public volatile Object call()
				throws Exception
			{
				return ((Object) (call()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #34  <Method File call()>
			//    2    4:areturn         
			}

		}
);
	//   47  115:new             #212 <Class LockOnGetVariable>
	//   48  118:dup             
	//   49  119:new             #8   <Class FacebookSdk$2>
	//   50  122:dup             
	//   51  123:invokespecial   #508 <Method void FacebookSdk$2()>
	//   52  126:invokespecial   #511 <Method void LockOnGetVariable(Callable)>
	//   53  129:putstatic       #210 <Field LockOnGetVariable cacheDir>
		context = ((Context) (new FutureTask(new Callable(initializecallback, context) {

			public volatile Object call()
				throws Exception
			{
				return ((Object) (call()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #33  <Method Void call()>
			//    2    4:areturn         
			}

			public Void call()
				throws Exception
			{
				AccessTokenManager.getInstance().loadCurrentAccessToken();
			//    0    0:invokestatic    #40  <Method AccessTokenManager AccessTokenManager.getInstance()>
			//    1    3:invokevirtual   #44  <Method boolean AccessTokenManager.loadCurrentAccessToken()>
			//    2    6:pop             
				ProfileManager.getInstance().loadCurrentProfile();
			//    3    7:invokestatic    #49  <Method ProfileManager ProfileManager.getInstance()>
			//    4   10:invokevirtual   #52  <Method boolean ProfileManager.loadCurrentProfile()>
			//    5   13:pop             
				if(AccessToken.isCurrentAccessTokenActive() && Profile.getCurrentProfile() == null)
			//*   6   14:invokestatic    #57  <Method boolean AccessToken.isCurrentAccessTokenActive()>
			//*   7   17:ifeq            29
			//*   8   20:invokestatic    #63  <Method Profile Profile.getCurrentProfile()>
			//*   9   23:ifnonnull       29
					Profile.fetchProfileForCurrentAccessToken();
			//   10   26:invokestatic    #66  <Method void Profile.fetchProfileForCurrentAccessToken()>
				InitializeCallback initializecallback1 = callback;
			//   11   29:aload_0         
			//   12   30:getfield        #20  <Field FacebookSdk$InitializeCallback val$callback>
			//   13   33:astore_1        
				if(initializecallback1 != null)
			//*  14   34:aload_1         
			//*  15   35:ifnull          44
					initializecallback1.onInitialized();
			//   16   38:aload_1         
			//   17   39:invokeinterface #71  <Method void FacebookSdk$InitializeCallback.onInitialized()>
				AppEventsLogger.initializeLib(FacebookSdk.applicationContext, FacebookSdk.applicationId);
			//   18   44:invokestatic    #75  <Method Context FacebookSdk.access$000()>
			//   19   47:invokestatic    #79  <Method String FacebookSdk.access$100()>
			//   20   50:invokestatic    #85  <Method void AppEventsLogger.initializeLib(Context, String)>
				AppEventsLogger.newLogger(applicationContext.getApplicationContext()).flush();
			//   21   53:aload_0         
			//   22   54:getfield        #22  <Field Context val$applicationContext>
			//   23   57:invokevirtual   #90  <Method Context Context.getApplicationContext()>
			//   24   60:invokestatic    #94  <Method AppEventsLogger AppEventsLogger.newLogger(Context)>
			//   25   63:invokevirtual   #97  <Method void AppEventsLogger.flush()>
				return null;
			//   26   66:aconst_null     
			//   27   67:areturn         
			}

			final Context val$applicationContext;
			final InitializeCallback val$callback;

			
			{
				callback = initializecallback;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field FacebookSdk$InitializeCallback val$callback>
				applicationContext = context;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field Context val$applicationContext>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
		}
)));
	//   54  132:new             #513 <Class FutureTask>
	//   55  135:dup             
	//   56  136:new             #10  <Class FacebookSdk$3>
	//   57  139:dup             
	//   58  140:aload_1         
	//   59  141:aload_0         
	//   60  142:invokespecial   #516 <Method void FacebookSdk$3(FacebookSdk$InitializeCallback, Context)>
	//   61  145:invokespecial   #517 <Method void FutureTask(Callable)>
	//   62  148:astore_0        
		getExecutor().execute(((Runnable) (context)));
	//   63  149:invokestatic    #450 <Method Executor getExecutor()>
	//   64  152:aload_0         
	//   65  153:invokeinterface #458 <Method void Executor.execute(Runnable)>
		com/facebook/FacebookSdk;
	//   66  158:ldc1            #2   <Class FacebookSdk>
		JVM INSTR monitorexit ;
	//   67  160:monitorexit     
		return;
	//   68  161:return          
		throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
	//   69  162:new             #326 <Class FacebookException>
	//   70  165:dup             
	//   71  166:ldc2            #519 <String "A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.">
	//   72  169:invokespecial   #331 <Method void FacebookException(String)>
	//   73  172:athrow          
		context;
	//   74  173:astore_0        
		com/facebook/FacebookSdk;
	//   75  174:ldc1            #2   <Class FacebookSdk>
		JVM INSTR monitorexit ;
	//   76  176:monitorexit     
		throw context;
	//   77  177:aload_0         
	//   78  178:athrow          
	}

	private static final ThreadFactory DEFAULT_THREAD_FACTORY = new ThreadFactory() {

		public Thread newThread(Runnable runnable)
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #26  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #27  <Method void StringBuilder()>
		//    3    7:astore_2        
			stringbuilder.append("FacebookSdk #");
		//    4    8:aload_2         
		//    5    9:ldc1            #29  <String "FacebookSdk #">
		//    6   11:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(counter.incrementAndGet());
		//    8   15:aload_2         
		//    9   16:aload_0         
		//   10   17:getfield        #21  <Field AtomicInteger counter>
		//   11   20:invokevirtual   #37  <Method int AtomicInteger.incrementAndGet()>
		//   12   23:invokevirtual   #40  <Method StringBuilder StringBuilder.append(int)>
		//   13   26:pop             
			return new Thread(runnable, stringbuilder.toString());
		//   14   27:new             #42  <Class Thread>
		//   15   30:dup             
		//   16   31:aload_1         
		//   17   32:aload_2         
		//   18   33:invokevirtual   #46  <Method String StringBuilder.toString()>
		//   19   36:invokespecial   #49  <Method void Thread(Runnable, String)>
		//   20   39:areturn         
		}

		private final AtomicInteger counter = new AtomicInteger(0);

			
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #14  <Method void Object()>
			//    2    4:aload_0         
			//    3    5:new             #16  <Class AtomicInteger>
			//    4    8:dup             
			//    5    9:iconst_0        
			//    6   10:invokespecial   #19  <Method void AtomicInteger(int)>
			//    7   13:putfield        #21  <Field AtomicInteger counter>
			//    8   16:return          
			}
	}
;
	private static final BlockingQueue DEFAULT_WORK_QUEUE = new LinkedBlockingQueue(10);
	private static final Object LOCK = new Object();
	private static final String TAG = ((Class) (com/facebook/FacebookSdk)).getCanonicalName();
	private static volatile String appClientToken;
	private static Context applicationContext;
	private static volatile String applicationId;
	private static volatile String applicationName;
	private static volatile Boolean autoLogAppEventsEnabled;
	private static LockOnGetVariable cacheDir;
	private static int callbackRequestCodeOffset = 64206;
	private static Executor executor;
	private static volatile String facebookDomain = "facebook.com";
	private static String graphApiVersion = ServerProtocol.getDefaultAPIVersion();
	private static volatile boolean isDebugEnabled = false;
	private static boolean isLegacyTokenUpgradeSupported = false;
	private static final HashSet loggingBehaviors;
	private static AtomicLong onProgressThreshold = new AtomicLong(0x10000L);
	private static Boolean sdkInitialized = Boolean.valueOf(false);

	static 
	{
	//    0    0:ldc1            #2   <Class FacebookSdk>
	//    1    2:invokevirtual   #57  <Method String Class.getCanonicalName()>
	//    2    5:putstatic       #59  <Field String TAG>
		loggingBehaviors = new HashSet(((java.util.Collection) (Arrays.asList(((Object []) (new LoggingBehavior[] {
			LoggingBehavior.DEVELOPER_ERRORS
		}))))));
	//    3    8:new             #61  <Class HashSet>
	//    4   11:dup             
	//    5   12:iconst_1        
	//    6   13:anewarray       LoggingBehavior[]
	//    7   16:dup             
	//    8   17:iconst_0        
	//    9   18:getstatic       #67  <Field LoggingBehavior LoggingBehavior.DEVELOPER_ERRORS>
	//   10   21:aastore         
	//   11   22:invokestatic    #73  <Method java.util.List Arrays.asList(Object[])>
	//   12   25:invokespecial   #77  <Method void HashSet(java.util.Collection)>
	//   13   28:putstatic       #79  <Field HashSet loggingBehaviors>
	//   14   31:ldc1            #81  <String "facebook.com">
	//   15   33:putstatic       #83  <Field String facebookDomain>
	//   16   36:new             #85  <Class AtomicLong>
	//   17   39:dup             
	//   18   40:ldc2w           #86  <Long 0x10000L>
	//   19   43:invokespecial   #90  <Method void AtomicLong(long)>
	//   20   46:putstatic       #92  <Field AtomicLong onProgressThreshold>
	//   21   49:iconst_0        
	//   22   50:putstatic       #94  <Field boolean isDebugEnabled>
	//   23   53:iconst_0        
	//   24   54:putstatic       #96  <Field boolean isLegacyTokenUpgradeSupported>
	//   25   57:ldc1            #97  <Int 64206>
	//   26   59:putstatic       #99  <Field int callbackRequestCodeOffset>
	//   27   62:new             #4   <Class Object>
	//   28   65:dup             
	//   29   66:invokespecial   #101 <Method void Object()>
	//   30   69:putstatic       #103 <Field Object LOCK>
	//   31   72:invokestatic    #108 <Method String ServerProtocol.getDefaultAPIVersion()>
	//   32   75:putstatic       #110 <Field String graphApiVersion>
	//   33   78:new             #112 <Class LinkedBlockingQueue>
	//   34   81:dup             
	//   35   82:bipush          10
	//   36   84:invokespecial   #115 <Method void LinkedBlockingQueue(int)>
	//   37   87:putstatic       #117 <Field BlockingQueue DEFAULT_WORK_QUEUE>
	//   38   90:new             #6   <Class FacebookSdk$1>
	//   39   93:dup             
	//   40   94:invokespecial   #118 <Method void FacebookSdk$1()>
	//   41   97:putstatic       #120 <Field ThreadFactory DEFAULT_THREAD_FACTORY>
	//   42  100:iconst_0        
	//   43  101:invokestatic    #126 <Method Boolean Boolean.valueOf(boolean)>
	//   44  104:putstatic       #128 <Field Boolean sdkInitialized>
	//*  45  107:return          
	}


/*
	static Context access$000()
	{
		return applicationContext;
	//    0    0:getstatic       #133 <Field Context applicationContext>
	//    1    3:areturn         
	}

*/


/*
	static String access$100()
	{
		return applicationId;
	//    0    0:getstatic       #136 <Field String applicationId>
	//    1    3:areturn         
	}

*/
}
