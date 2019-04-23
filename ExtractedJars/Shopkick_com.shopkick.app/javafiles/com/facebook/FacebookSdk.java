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
	//    1    1:invokespecial   #149 <Method void Object()>
	//    2    4:return          
	}

	public static void addLoggingBehavior(LoggingBehavior loggingbehavior)
	{
		synchronized(loggingBehaviors)
	//*   0    0:getstatic       #130 <Field HashSet loggingBehaviors>
	//*   1    3:astore_1        
	//*   2    4:aload_1         
	//*   3    5:monitorenter    
		{
			loggingBehaviors.add(((Object) (loggingbehavior)));
	//    4    6:getstatic       #130 <Field HashSet loggingBehaviors>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #190 <Method boolean HashSet.add(Object)>
	//    7   13:pop             
			updateGraphDebugBehavior();
	//    8   14:invokestatic    #193 <Method void updateGraphDebugBehavior()>
		}
	//    9   17:aload_1         
	//   10   18:monitorexit     
		return;
	//   11   19:return          
		loggingbehavior;
	//   12   20:astore_0        
		hashset;
	//   13   21:aload_1         
		JVM INSTR monitorexit ;
	//   14   22:monitorexit     
		throw loggingbehavior;
	//   15   23:aload_0         
	//   16   24:athrow          
	}

	public static void clearLoggingBehaviors()
	{
		synchronized(loggingBehaviors)
	//*   0    0:getstatic       #130 <Field HashSet loggingBehaviors>
	//*   1    3:astore_0        
	//*   2    4:aload_0         
	//*   3    5:monitorenter    
		{
			loggingBehaviors.clear();
	//    4    6:getstatic       #130 <Field HashSet loggingBehaviors>
	//    5    9:invokevirtual   #197 <Method void HashSet.clear()>
		}
	//    6   12:aload_0         
	//    7   13:monitorexit     
		return;
	//    8   14:return          
		exception;
	//    9   15:astore_1        
		hashset;
	//   10   16:aload_0         
		JVM INSTR monitorexit ;
	//   11   17:monitorexit     
		throw exception;
	//   12   18:aload_1         
	//   13   19:athrow          
	}

	public static boolean getAdvertiserIDCollectionEnabled()
	{
		Validate.sdkInitialized();
	//    0    0:invokestatic    #203 <Method void Validate.sdkInitialized()>
		return advertiserIDCollectionEnabled.booleanValue();
	//    1    3:getstatic       #205 <Field Boolean advertiserIDCollectionEnabled>
	//    2    6:invokevirtual   #208 <Method boolean Boolean.booleanValue()>
	//    3    9:ireturn         
	}

	public static Context getApplicationContext()
	{
		Validate.sdkInitialized();
	//    0    0:invokestatic    #203 <Method void Validate.sdkInitialized()>
		return applicationContext;
	//    1    3:getstatic       #181 <Field Context applicationContext>
	//    2    6:areturn         
	}

	public static String getApplicationId()
	{
		Validate.sdkInitialized();
	//    0    0:invokestatic    #203 <Method void Validate.sdkInitialized()>
		return applicationId;
	//    1    3:getstatic       #184 <Field String applicationId>
	//    2    6:areturn         
	}

	public static String getApplicationName()
	{
		Validate.sdkInitialized();
	//    0    0:invokestatic    #203 <Method void Validate.sdkInitialized()>
		return applicationName;
	//    1    3:getstatic       #213 <Field String applicationName>
	//    2    6:areturn         
	}

	public static String getApplicationSignature(Context context)
	{
		Validate.sdkInitialized();
	//    0    0:invokestatic    #203 <Method void Validate.sdkInitialized()>
		if(context == null)
	//*   1    3:aload_0         
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		PackageManager packagemanager = context.getPackageManager();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #225 <Method PackageManager Context.getPackageManager()>
	//    7   13:astore_1        
		if(packagemanager == null)
	//*   8   14:aload_1         
	//*   9   15:ifnonnull       20
			return null;
	//   10   18:aconst_null     
	//   11   19:areturn         
		context = ((Context) (context.getPackageName()));
	//   12   20:aload_0         
	//   13   21:invokevirtual   #228 <Method String Context.getPackageName()>
	//   14   24:astore_0        
		Signature asignature[];
		try
		{
			context = ((Context) (packagemanager.getPackageInfo(((String) (context)), 64)));
	//   15   25:aload_1         
	//   16   26:aload_0         
	//   17   27:bipush          64
	//   18   29:invokevirtual   #234 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   19   32:astore_0        
		}
	//*  20   33:aload_0         
	//*  21   34:getfield        #240 <Field Signature[] PackageInfo.signatures>
	//*  22   37:astore_1        
	//*  23   38:aload_1         
	//*  24   39:ifnull          78
	//*  25   42:aload_1         
	//*  26   43:arraylength     
	//*  27   44:ifne            49
	//*  28   47:aconst_null     
	//*  29   48:areturn         
	//*  30   49:ldc1            #242 <String "SHA-1">
	//*  31   51:invokestatic    #248 <Method MessageDigest MessageDigest.getInstance(String)>
	//*  32   54:astore_1        
	//*  33   55:aload_1         
	//*  34   56:aload_0         
	//*  35   57:getfield        #240 <Field Signature[] PackageInfo.signatures>
	//*  36   60:iconst_0        
	//*  37   61:aaload          
	//*  38   62:invokevirtual   #254 <Method byte[] Signature.toByteArray()>
	//*  39   65:invokevirtual   #258 <Method void MessageDigest.update(byte[])>
	//*  40   68:aload_1         
	//*  41   69:invokevirtual   #261 <Method byte[] MessageDigest.digest()>
	//*  42   72:bipush          9
	//*  43   74:invokestatic    #267 <Method String Base64.encodeToString(byte[], int)>
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
	//    0    0:invokestatic    #203 <Method void Validate.sdkInitialized()>
		return autoLogAppEventsEnabled.booleanValue();
	//    1    3:getstatic       #270 <Field Boolean autoLogAppEventsEnabled>
	//    2    6:invokevirtual   #208 <Method boolean Boolean.booleanValue()>
	//    3    9:ireturn         
	}

	public static File getCacheDir()
	{
		Validate.sdkInitialized();
	//    0    0:invokestatic    #203 <Method void Validate.sdkInitialized()>
		return (File)cacheDir.getValue();
	//    1    3:getstatic       #274 <Field LockOnGetVariable cacheDir>
	//    2    6:invokevirtual   #280 <Method Object LockOnGetVariable.getValue()>
	//    3    9:checkcast       #282 <Class File>
	//    4   12:areturn         
	}

	public static int getCallbackRequestCodeOffset()
	{
		Validate.sdkInitialized();
	//    0    0:invokestatic    #203 <Method void Validate.sdkInitialized()>
		return callbackRequestCodeOffset;
	//    1    3:getstatic       #147 <Field int callbackRequestCodeOffset>
	//    2    6:ireturn         
	}

	public static String getClientToken()
	{
		Validate.sdkInitialized();
	//    0    0:invokestatic    #203 <Method void Validate.sdkInitialized()>
		return appClientToken;
	//    1    3:getstatic       #287 <Field String appClientToken>
	//    2    6:areturn         
	}

	public static boolean getCodelessDebugLogEnabled()
	{
		Validate.sdkInitialized();
	//    0    0:invokestatic    #203 <Method void Validate.sdkInitialized()>
		return codelessDebugLogEnabled.booleanValue();
	//    1    3:getstatic       #290 <Field Boolean codelessDebugLogEnabled>
	//    2    6:invokevirtual   #208 <Method boolean Boolean.booleanValue()>
	//    3    9:ireturn         
	}

	public static Executor getExecutor()
	{
		synchronized(LOCK)
	//*   0    0:getstatic       #151 <Field Object LOCK>
	//*   1    3:astore_0        
	//*   2    4:aload_0         
	//*   3    5:monitorenter    
		{
			if(executor == null)
	//*   4    6:getstatic       #294 <Field Executor executor>
	//*   5    9:ifnonnull       18
				executor = AsyncTask.THREAD_POOL_EXECUTOR;
	//    6   12:getstatic       #299 <Field Executor AsyncTask.THREAD_POOL_EXECUTOR>
	//    7   15:putstatic       #294 <Field Executor executor>
		}
	//    8   18:aload_0         
	//    9   19:monitorexit     
		return executor;
	//   10   20:getstatic       #294 <Field Executor executor>
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
	//    0    0:getstatic       #132 <Field String facebookDomain>
	//    1    3:areturn         
	}

	public static String getGraphApiVersion()
	{
		Utility.logd(TAG, String.format("getGraphApiVersion: %s", new Object[] {
			graphApiVersion
		}));
	//    0    0:getstatic       #110 <Field String TAG>
	//    1    3:ldc2            #303 <String "getGraphApiVersion: %s">
	//    2    6:iconst_1        
	//    3    7:anewarray       Object[]
	//    4   10:dup             
	//    5   11:iconst_0        
	//    6   12:getstatic       #158 <Field String graphApiVersion>
	//    7   15:aastore         
	//    8   16:invokestatic    #309 <Method String String.format(String, Object[])>
	//    9   19:invokestatic    #315 <Method void Utility.logd(String, String)>
		return graphApiVersion;
	//   10   22:getstatic       #158 <Field String graphApiVersion>
	//   11   25:areturn         
	}

	public static boolean getLimitEventAndDataUsage(Context context)
	{
		Validate.sdkInitialized();
	//    0    0:invokestatic    #203 <Method void Validate.sdkInitialized()>
		return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
	//    1    3:aload_0         
	//    2    4:ldc2            #319 <String "com.facebook.sdk.appEventPreferences">
	//    3    7:iconst_0        
	//    4    8:invokevirtual   #323 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    5   11:ldc2            #325 <String "limitEventUsage">
	//    6   14:iconst_0        
	//    7   15:invokeinterface #331 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//    8   20:ireturn         
	}

	public static Set getLoggingBehaviors()
	{
		Set set;
		synchronized(loggingBehaviors)
	//*   0    0:getstatic       #130 <Field HashSet loggingBehaviors>
	//*   1    3:astore_0        
	//*   2    4:aload_0         
	//*   3    5:monitorenter    
		{
			set = Collections.unmodifiableSet(((Set) (new HashSet(((java.util.Collection) (loggingBehaviors))))));
	//    4    6:new             #112 <Class HashSet>
	//    5    9:dup             
	//    6   10:getstatic       #130 <Field HashSet loggingBehaviors>
	//    7   13:invokespecial   #128 <Method void HashSet(java.util.Collection)>
	//    8   16:invokestatic    #339 <Method Set Collections.unmodifiableSet(Set)>
	//    9   19:astore_1        
		}
	//   10   20:aload_0         
	//   11   21:monitorexit     
		return set;
	//   12   22:aload_1         
	//   13   23:areturn         
		exception;
	//   14   24:astore_1        
		hashset;
	//   15   25:aload_0         
		JVM INSTR monitorexit ;
	//   16   26:monitorexit     
		throw exception;
	//   17   27:aload_1         
	//   18   28:athrow          
	}

	public static long getOnProgressThreshold()
	{
		Validate.sdkInitialized();
	//    0    0:invokestatic    #203 <Method void Validate.sdkInitialized()>
		return onProgressThreshold.get();
	//    1    3:getstatic       #141 <Field AtomicLong onProgressThreshold>
	//    2    6:invokevirtual   #346 <Method long AtomicLong.get()>
	//    3    9:lreturn         
	}

	public static String getSdkVersion()
	{
		return "4.39.0";
	//    0    0:ldc2            #349 <String "4.39.0">
	//    1    3:areturn         
	}

	public static boolean isDebugEnabled()
	{
		return isDebugEnabled;
	//    0    0:getstatic       #143 <Field boolean isDebugEnabled>
	//    1    3:ireturn         
	}

	public static boolean isFacebookRequestCode(int i)
	{
		int j = callbackRequestCodeOffset;
	//    0    0:getstatic       #147 <Field int callbackRequestCodeOffset>
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
	//    2    3:getstatic       #176 <Field Boolean sdkInitialized>
	//    3    6:invokevirtual   #208 <Method boolean Boolean.booleanValue()>
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
	//    0    0:getstatic       #145 <Field boolean isLegacyTokenUpgradeSupported>
	//    1    3:ireturn         
	}

	public static boolean isLoggingBehaviorEnabled(LoggingBehavior loggingbehavior)
	{
		HashSet hashset = loggingBehaviors;
	//    0    0:getstatic       #130 <Field HashSet loggingBehaviors>
	//    1    3:astore_2        
		hashset;
	//    2    4:aload_2         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		boolean flag;
		if(isDebugEnabled() && loggingBehaviors.contains(((Object) (loggingbehavior))))
	//*   4    6:invokestatic    #356 <Method boolean isDebugEnabled()>
	//*   5    9:ifeq            36
	//*   6   12:getstatic       #130 <Field HashSet loggingBehaviors>
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #359 <Method boolean HashSet.contains(Object)>
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
	//    4    6:invokevirtual   #225 <Method PackageManager Context.getPackageManager()>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #228 <Method String Context.getPackageName()>
	//    7   13:sipush          128
	//    8   16:invokevirtual   #365 <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//    9   19:astore_0        
		}
	//*  10   20:aload_0         
	//*  11   21:ifnull          240
	//*  12   24:aload_0         
	//*  13   25:getfield        #371 <Field Bundle ApplicationInfo.metaData>
	//*  14   28:ifnonnull       32
	//*  15   31:return          
	//*  16   32:getstatic       #184 <Field String applicationId>
	//*  17   35:ifnonnull       115
	//*  18   38:aload_0         
	//*  19   39:getfield        #371 <Field Bundle ApplicationInfo.metaData>
	//*  20   42:ldc1            #22  <String "com.facebook.sdk.ApplicationId">
	//*  21   44:invokevirtual   #376 <Method Object Bundle.get(String)>
	//*  22   47:astore_1        
	//*  23   48:aload_1         
	//*  24   49:instanceof      #305 <Class String>
	//*  25   52:ifeq            94
	//*  26   55:aload_1         
	//*  27   56:checkcast       #305 <Class String>
	//*  28   59:astore_1        
	//*  29   60:aload_1         
	//*  30   61:getstatic       #382 <Field Locale Locale.ROOT>
	//*  31   64:invokevirtual   #386 <Method String String.toLowerCase(Locale)>
	//*  32   67:ldc2            #388 <String "fb">
	//*  33   70:invokevirtual   #392 <Method boolean String.startsWith(String)>
	//*  34   73:ifeq            87
	//*  35   76:aload_1         
	//*  36   77:iconst_2        
	//*  37   78:invokevirtual   #396 <Method String String.substring(int)>
	//*  38   81:putstatic       #184 <Field String applicationId>
	//*  39   84:goto            115
	//*  40   87:aload_1         
	//*  41   88:putstatic       #184 <Field String applicationId>
	//*  42   91:goto            115
	//*  43   94:aload_1         
	//*  44   95:instanceof      #398 <Class Integer>
	//*  45   98:ifne            104
	//*  46  101:goto            115
	//*  47  104:new             #400 <Class FacebookException>
	//*  48  107:dup             
	//*  49  108:ldc2            #402 <String "App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.">
	//*  50  111:invokespecial   #405 <Method void FacebookException(String)>
	//*  51  114:athrow          
	//*  52  115:getstatic       #213 <Field String applicationName>
	//*  53  118:ifnonnull       133
	//*  54  121:aload_0         
	//*  55  122:getfield        #371 <Field Bundle ApplicationInfo.metaData>
	//*  56  125:ldc1            #25  <String "com.facebook.sdk.ApplicationName">
	//*  57  127:invokevirtual   #409 <Method String Bundle.getString(String)>
	//*  58  130:putstatic       #213 <Field String applicationName>
	//*  59  133:getstatic       #287 <Field String appClientToken>
	//*  60  136:ifnonnull       151
	//*  61  139:aload_0         
	//*  62  140:getfield        #371 <Field Bundle ApplicationInfo.metaData>
	//*  63  143:ldc1            #43  <String "com.facebook.sdk.ClientToken">
	//*  64  145:invokevirtual   #409 <Method String Bundle.getString(String)>
	//*  65  148:putstatic       #287 <Field String appClientToken>
	//*  66  151:getstatic       #147 <Field int callbackRequestCodeOffset>
	//*  67  154:ldc1            #49  <Int 64206>
	//*  68  156:icmpne          173
	//*  69  159:aload_0         
	//*  70  160:getfield        #371 <Field Bundle ApplicationInfo.metaData>
	//*  71  163:ldc1            #40  <String "com.facebook.sdk.CallbackOffset">
	//*  72  165:ldc1            #49  <Int 64206>
	//*  73  167:invokevirtual   #413 <Method int Bundle.getInt(String, int)>
	//*  74  170:putstatic       #147 <Field int callbackRequestCodeOffset>
	//*  75  173:getstatic       #270 <Field Boolean autoLogAppEventsEnabled>
	//*  76  176:ifnonnull       195
	//*  77  179:aload_0         
	//*  78  180:getfield        #371 <Field Bundle ApplicationInfo.metaData>
	//*  79  183:ldc1            #31  <String "com.facebook.sdk.AutoLogAppEventsEnabled">
	//*  80  185:iconst_1        
	//*  81  186:invokevirtual   #414 <Method boolean Bundle.getBoolean(String, boolean)>
	//*  82  189:invokestatic    #174 <Method Boolean Boolean.valueOf(boolean)>
	//*  83  192:putstatic       #270 <Field Boolean autoLogAppEventsEnabled>
	//*  84  195:getstatic       #290 <Field Boolean codelessDebugLogEnabled>
	//*  85  198:ifnonnull       217
	//*  86  201:aload_0         
	//*  87  202:getfield        #371 <Field Bundle ApplicationInfo.metaData>
	//*  88  205:ldc1            #46  <String "com.facebook.sdk.CodelessDebugLogEnabled">
	//*  89  207:iconst_0        
	//*  90  208:invokevirtual   #414 <Method boolean Bundle.getBoolean(String, boolean)>
	//*  91  211:invokestatic    #174 <Method Boolean Boolean.valueOf(boolean)>
	//*  92  214:putstatic       #290 <Field Boolean codelessDebugLogEnabled>
	//*  93  217:getstatic       #205 <Field Boolean advertiserIDCollectionEnabled>
	//*  94  220:ifnonnull       239
	//*  95  223:aload_0         
	//*  96  224:getfield        #371 <Field Bundle ApplicationInfo.metaData>
	//*  97  227:ldc1            #19  <String "com.facebook.sdk.AdvertiserIDCollectionEnabled">
	//*  98  229:iconst_1        
	//*  99  230:invokevirtual   #414 <Method boolean Bundle.getBoolean(String, boolean)>
	//* 100  233:invokestatic    #174 <Method Boolean Boolean.valueOf(boolean)>
	//* 101  236:putstatic       #205 <Field Boolean advertiserIDCollectionEnabled>
	//* 102  239:return          
	//* 103  240:return          
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 104  241:astore_0        
		{
			return;
	//  105  242:return          
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
			if(codelessDebugLogEnabled == null)
				codelessDebugLogEnabled = Boolean.valueOf(((ApplicationInfo) (context)).metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
			if(advertiserIDCollectionEnabled == null)
				advertiserIDCollectionEnabled = Boolean.valueOf(((ApplicationInfo) (context)).metaData.getBoolean("com.facebook.sdk.AdvertiserIDCollectionEnabled", true));
			return;
		} else
		{
			return;
		}
	}

	static void publishInstallAndWaitForResponse(Context context, String s)
	{
		if(context == null || s == null)
			break MISSING_BLOCK_LABEL_155;
	//    0    0:aload_0         
	//    1    1:ifnull          155
	//    2    4:aload_1         
	//    3    5:ifnull          155
		long l;
		SharedPreferences sharedpreferences;
		Object obj;
		AttributionIdentifiers attributionidentifiers;
		attributionidentifiers = AttributionIdentifiers.getAttributionIdentifiers(context);
	//    4    8:aload_0         
	//    5    9:invokestatic    #426 <Method AttributionIdentifiers AttributionIdentifiers.getAttributionIdentifiers(Context)>
	//    6   12:astore          6
		sharedpreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
	//    7   14:aload_0         
	//    8   15:ldc1            #28  <String "com.facebook.sdk.attributionTracking">
	//    9   17:iconst_0        
	//   10   18:invokevirtual   #323 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   11   21:astore          4
		obj = ((Object) (new StringBuilder()));
	//   12   23:new             #428 <Class StringBuilder>
	//   13   26:dup             
	//   14   27:invokespecial   #429 <Method void StringBuilder()>
	//   15   30:astore          5
		((StringBuilder) (obj)).append(s);
	//   16   32:aload           5
	//   17   34:aload_1         
	//   18   35:invokevirtual   #433 <Method StringBuilder StringBuilder.append(String)>
	//   19   38:pop             
		((StringBuilder) (obj)).append("ping");
	//   20   39:aload           5
	//   21   41:ldc2            #435 <String "ping">
	//   22   44:invokevirtual   #433 <Method StringBuilder StringBuilder.append(String)>
	//   23   47:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   24   48:aload           5
	//   25   50:invokevirtual   #438 <Method String StringBuilder.toString()>
	//   26   53:astore          5
		l = sharedpreferences.getLong(((String) (obj)), 0L);
	//   27   55:aload           4
	//   28   57:aload           5
	//   29   59:lconst_0        
	//   30   60:invokeinterface #442 <Method long SharedPreferences.getLong(String, long)>
	//   31   65:lstore_2        
		context = ((Context) (AppEventsLoggerUtility.getJSONObjectForGraphAPICall(com.facebook.appevents.internal.AppEventsLoggerUtility.GraphAPIActivityType.MOBILE_INSTALL_EVENT, attributionidentifiers, AppEventsLogger.getAnonymousAppDeviceGUID(context), getLimitEventAndDataUsage(context), context)));
	//   32   66:getstatic       #448 <Field com.facebook.appevents.internal.AppEventsLoggerUtility$GraphAPIActivityType com.facebook.appevents.internal.AppEventsLoggerUtility$GraphAPIActivityType.MOBILE_INSTALL_EVENT>
	//   33   69:aload           6
	//   34   71:aload_0         
	//   35   72:invokestatic    #453 <Method String AppEventsLogger.getAnonymousAppDeviceGUID(Context)>
	//   36   75:aload_0         
	//   37   76:invokestatic    #455 <Method boolean getLimitEventAndDataUsage(Context)>
	//   38   79:aload_0         
	//   39   80:invokestatic    #461 <Method org.json.JSONObject AppEventsLoggerUtility.getJSONObjectForGraphAPICall(com.facebook.appevents.internal.AppEventsLoggerUtility$GraphAPIActivityType, AttributionIdentifiers, String, boolean, Context)>
	//   40   83:astore_0        
		context = ((Context) (GraphRequest.newPostRequest(((AccessToken) (null)), String.format("%s/activities", new Object[] {
			s
		}), ((org.json.JSONObject) (context)), ((GraphRequest.Callback) (null)))));
	//   41   84:aconst_null     
	//   42   85:ldc1            #70  <String "%s/activities">
	//   43   87:iconst_1        
	//   44   88:anewarray       Object[]
	//   45   91:dup             
	//   46   92:iconst_0        
	//   47   93:aload_1         
	//   48   94:aastore         
	//   49   95:invokestatic    #309 <Method String String.format(String, Object[])>
	//   50   98:aload_0         
	//   51   99:aconst_null     
	//   52  100:invokestatic    #467 <Method GraphRequest GraphRequest.newPostRequest(AccessToken, String, org.json.JSONObject, GraphRequest$Callback)>
	//   53  103:astore_0        
		if(l == 0L)
	//*  54  104:lload_2         
	//*  55  105:lconst_0        
	//*  56  106:lcmp            
	//*  57  107:ifne            174
			try
			{
				((GraphRequest) (context)).executeAndWait();
	//   58  110:aload_0         
	//   59  111:invokevirtual   #471 <Method GraphResponse GraphRequest.executeAndWait()>
	//   60  114:pop             
				context = ((Context) (sharedpreferences.edit()));
	//   61  115:aload           4
	//   62  117:invokeinterface #475 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   63  122:astore_0        
				((android.content.SharedPreferences.Editor) (context)).putLong(((String) (obj)), System.currentTimeMillis());
	//   64  123:aload_0         
	//   65  124:aload           5
	//   66  126:invokestatic    #480 <Method long System.currentTimeMillis()>
	//   67  129:invokeinterface #486 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//   68  134:pop             
				((android.content.SharedPreferences.Editor) (context)).apply();
	//   69  135:aload_0         
	//   70  136:invokeinterface #489 <Method void android.content.SharedPreferences$Editor.apply()>
				return;
	//   71  141:return          
			}
	//*  72  142:astore_0        
	//*  73  143:new             #400 <Class FacebookException>
	//*  74  146:dup             
	//*  75  147:ldc2            #491 <String "An error occurred while publishing install.">
	//*  76  150:aload_0         
	//*  77  151:invokespecial   #494 <Method void FacebookException(String, Throwable)>
	//*  78  154:athrow          
	//*  79  155:new             #496 <Class IllegalArgumentException>
	//*  80  158:dup             
	//*  81  159:ldc2            #498 <String "Both context and applicationId must be non-null">
	//*  82  162:invokespecial   #499 <Method void IllegalArgumentException(String)>
	//*  83  165:athrow          
			// Misplaced declaration of an exception variable
			catch(Context context)
	//*  84  166:astore_0        
			{
				Utility.logd("Facebook-publish", ((Exception) (context)));
	//   85  167:ldc2            #501 <String "Facebook-publish">
	//   86  170:aload_0         
	//   87  171:invokestatic    #504 <Method void Utility.logd(String, Exception)>
			}
		break MISSING_BLOCK_LABEL_174;
		context;
		throw new FacebookException("An error occurred while publishing install.", ((Throwable) (context)));
		throw new IllegalArgumentException("Both context and applicationId must be non-null");
	//   88  174:return          
	}

	public static void publishInstallAsync(Context context, String s)
	{
		context = context.getApplicationContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #507 <Method Context Context.getApplicationContext()>
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
	//    3    5:invokestatic    #509 <Method Executor getExecutor()>
	//    4    8:new             #12  <Class FacebookSdk$4>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokespecial   #511 <Method void FacebookSdk$4(Context, String)>
	//    9   17:invokeinterface #517 <Method void Executor.execute(Runnable)>
	//   10   22:return          
	}

	public static void removeLoggingBehavior(LoggingBehavior loggingbehavior)
	{
		synchronized(loggingBehaviors)
	//*   0    0:getstatic       #130 <Field HashSet loggingBehaviors>
	//*   1    3:astore_1        
	//*   2    4:aload_1         
	//*   3    5:monitorenter    
		{
			loggingBehaviors.remove(((Object) (loggingbehavior)));
	//    4    6:getstatic       #130 <Field HashSet loggingBehaviors>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #521 <Method boolean HashSet.remove(Object)>
	//    7   13:pop             
		}
	//    8   14:aload_1         
	//    9   15:monitorexit     
		return;
	//   10   16:return          
		loggingbehavior;
	//   11   17:astore_0        
		hashset;
	//   12   18:aload_1         
		JVM INSTR monitorexit ;
	//   13   19:monitorexit     
		throw loggingbehavior;
	//   14   20:aload_0         
	//   15   21:athrow          
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
	//    4    5:invokestatic    #526 <Method void sdkInitialize(Context, FacebookSdk$InitializeCallback)>
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

	public static void sdkInitialize(Context context, int i)
	{
		com/facebook/FacebookSdk;
	//    0    0:ldc1            #2   <Class FacebookSdk>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		sdkInitialize(context, i, ((InitializeCallback) (null)));
	//    2    3:aload_0         
	//    3    4:iload_1         
	//    4    5:aconst_null     
	//    5    6:invokestatic    #531 <Method void sdkInitialize(Context, int, FacebookSdk$InitializeCallback)>
		com/facebook/FacebookSdk;
	//    6    9:ldc1            #2   <Class FacebookSdk>
		JVM INSTR monitorexit ;
	//    7   11:monitorexit     
		return;
	//    8   12:return          
		context;
	//    9   13:astore_0        
	//*  10   14:ldc1            #2   <Class FacebookSdk>
		throw context;
	//   11   16:monitorexit     
	//   12   17:aload_0         
	//   13   18:athrow          
	}

	public static void sdkInitialize(Context context, int i, InitializeCallback initializecallback)
	{
		com/facebook/FacebookSdk;
	//    0    0:ldc1            #2   <Class FacebookSdk>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(!sdkInitialized.booleanValue() || i == callbackRequestCodeOffset)
	//*   2    3:getstatic       #176 <Field Boolean sdkInitialized>
	//*   3    6:invokevirtual   #208 <Method boolean Boolean.booleanValue()>
	//*   4    9:ifeq            32
	//*   5   12:iload_1         
	//*   6   13:getstatic       #147 <Field int callbackRequestCodeOffset>
	//*   7   16:icmpne          22
			break MISSING_BLOCK_LABEL_32;
	//    8   19:goto            32
		throw new FacebookException("The callback request code offset can't be updated once the SDK is initialized. Call FacebookSdk.setCallbackRequestCodeOffset inside your Application.onCreate method");
	//    9   22:new             #400 <Class FacebookException>
	//   10   25:dup             
	//   11   26:ldc1            #34  <String "The callback request code offset can't be updated once the SDK is initialized. Call FacebookSdk.setCallbackRequestCodeOffset inside your Application.onCreate method">
	//   12   28:invokespecial   #405 <Method void FacebookException(String)>
	//   13   31:athrow          
		if(i < 0)
			break MISSING_BLOCK_LABEL_49;
	//   14   32:iload_1         
	//   15   33:iflt            49
		callbackRequestCodeOffset = i;
	//   16   36:iload_1         
	//   17   37:putstatic       #147 <Field int callbackRequestCodeOffset>
		sdkInitialize(context, initializecallback);
	//   18   40:aload_0         
	//   19   41:aload_2         
	//   20   42:invokestatic    #526 <Method void sdkInitialize(Context, FacebookSdk$InitializeCallback)>
		com/facebook/FacebookSdk;
	//   21   45:ldc1            #2   <Class FacebookSdk>
		JVM INSTR monitorexit ;
	//   22   47:monitorexit     
		return;
	//   23   48:return          
		throw new FacebookException("The callback request code offset can't be negative.");
	//   24   49:new             #400 <Class FacebookException>
	//   25   52:dup             
	//   26   53:ldc1            #37  <String "The callback request code offset can't be negative.">
	//   27   55:invokespecial   #405 <Method void FacebookException(String)>
	//   28   58:athrow          
		context;
	//   29   59:astore_0        
		com/facebook/FacebookSdk;
	//   30   60:ldc1            #2   <Class FacebookSdk>
		JVM INSTR monitorexit ;
	//   31   62:monitorexit     
		throw context;
	//   32   63:aload_0         
	//   33   64:athrow          
	}

	public static void sdkInitialize(Context context, InitializeCallback initializecallback)
	{
		com/facebook/FacebookSdk;
	//    0    0:ldc1            #2   <Class FacebookSdk>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(!sdkInitialized.booleanValue())
			break MISSING_BLOCK_LABEL_26;
	//    2    3:getstatic       #176 <Field Boolean sdkInitialized>
	//    3    6:invokevirtual   #208 <Method boolean Boolean.booleanValue()>
	//    4    9:ifeq            26
		if(initializecallback == null)
			break MISSING_BLOCK_LABEL_22;
	//    5   12:aload_1         
	//    6   13:ifnull          22
		initializecallback.onInitialized();
	//    7   16:aload_1         
	//    8   17:invokeinterface #534 <Method void FacebookSdk$InitializeCallback.onInitialized()>
		com/facebook/FacebookSdk;
	//    9   22:ldc1            #2   <Class FacebookSdk>
		JVM INSTR monitorexit ;
	//   10   24:monitorexit     
		return;
	//   11   25:return          
		Validate.notNull(((Object) (context)), "applicationContext");
	//   12   26:aload_0         
	//   13   27:ldc2            #535 <String "applicationContext">
	//   14   30:invokestatic    #539 <Method void Validate.notNull(Object, String)>
		Validate.hasFacebookActivity(context, false);
	//   15   33:aload_0         
	//   16   34:iconst_0        
	//   17   35:invokestatic    #543 <Method void Validate.hasFacebookActivity(Context, boolean)>
		Validate.hasInternetPermissions(context, false);
	//   18   38:aload_0         
	//   19   39:iconst_0        
	//   20   40:invokestatic    #546 <Method void Validate.hasInternetPermissions(Context, boolean)>
		applicationContext = context.getApplicationContext();
	//   21   43:aload_0         
	//   22   44:invokevirtual   #507 <Method Context Context.getApplicationContext()>
	//   23   47:putstatic       #181 <Field Context applicationContext>
		loadDefaultsFromMetadata(applicationContext);
	//   24   50:getstatic       #181 <Field Context applicationContext>
	//   25   53:invokestatic    #548 <Method void loadDefaultsFromMetadata(Context)>
		if(Utility.isNullOrEmpty(applicationId))
			break MISSING_BLOCK_LABEL_162;
	//   26   56:getstatic       #184 <Field String applicationId>
	//   27   59:invokestatic    #551 <Method boolean Utility.isNullOrEmpty(String)>
	//   28   62:ifne            162
		if((applicationContext instanceof Application) && autoLogAppEventsEnabled.booleanValue())
	//*  29   65:getstatic       #181 <Field Context applicationContext>
	//*  30   68:instanceof      #553 <Class Application>
	//*  31   71:ifeq            95
	//*  32   74:getstatic       #270 <Field Boolean autoLogAppEventsEnabled>
	//*  33   77:invokevirtual   #208 <Method boolean Boolean.booleanValue()>
	//*  34   80:ifeq            95
			ActivityLifecycleTracker.startTracking((Application)applicationContext, applicationId);
	//   35   83:getstatic       #181 <Field Context applicationContext>
	//   36   86:checkcast       #553 <Class Application>
	//   37   89:getstatic       #184 <Field String applicationId>
	//   38   92:invokestatic    #559 <Method void ActivityLifecycleTracker.startTracking(Application, String)>
		sdkInitialized = Boolean.valueOf(true);
	//   39   95:iconst_1        
	//   40   96:invokestatic    #174 <Method Boolean Boolean.valueOf(boolean)>
	//   41   99:putstatic       #176 <Field Boolean sdkInitialized>
		FetchedAppSettingsManager.loadAppSettingsAsync();
	//   42  102:invokestatic    #564 <Method void FetchedAppSettingsManager.loadAppSettingsAsync()>
		NativeProtocol.updateAllAvailableProtocolVersionsAsync();
	//   43  105:invokestatic    #569 <Method void NativeProtocol.updateAllAvailableProtocolVersionsAsync()>
		BoltsMeasurementEventListener.getInstance(applicationContext);
	//   44  108:getstatic       #181 <Field Context applicationContext>
	//   45  111:invokestatic    #574 <Method BoltsMeasurementEventListener BoltsMeasurementEventListener.getInstance(Context)>
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
	//   47  115:new             #276 <Class LockOnGetVariable>
	//   48  118:dup             
	//   49  119:new             #8   <Class FacebookSdk$2>
	//   50  122:dup             
	//   51  123:invokespecial   #575 <Method void FacebookSdk$2()>
	//   52  126:invokespecial   #578 <Method void LockOnGetVariable(Callable)>
	//   53  129:putstatic       #274 <Field LockOnGetVariable cacheDir>
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
	//   54  132:new             #580 <Class FutureTask>
	//   55  135:dup             
	//   56  136:new             #10  <Class FacebookSdk$3>
	//   57  139:dup             
	//   58  140:aload_1         
	//   59  141:aload_0         
	//   60  142:invokespecial   #583 <Method void FacebookSdk$3(FacebookSdk$InitializeCallback, Context)>
	//   61  145:invokespecial   #584 <Method void FutureTask(Callable)>
	//   62  148:astore_0        
		getExecutor().execute(((Runnable) (context)));
	//   63  149:invokestatic    #509 <Method Executor getExecutor()>
	//   64  152:aload_0         
	//   65  153:invokeinterface #517 <Method void Executor.execute(Runnable)>
		com/facebook/FacebookSdk;
	//   66  158:ldc1            #2   <Class FacebookSdk>
		JVM INSTR monitorexit ;
	//   67  160:monitorexit     
		return;
	//   68  161:return          
		throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
	//   69  162:new             #400 <Class FacebookException>
	//   70  165:dup             
	//   71  166:ldc2            #586 <String "A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.">
	//   72  169:invokespecial   #405 <Method void FacebookException(String)>
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

	public static void setAdvertiserIDCollectionEnabled(boolean flag)
	{
		advertiserIDCollectionEnabled = Boolean.valueOf(flag);
	//    0    0:iload_0         
	//    1    1:invokestatic    #174 <Method Boolean Boolean.valueOf(boolean)>
	//    2    4:putstatic       #205 <Field Boolean advertiserIDCollectionEnabled>
	//    3    7:return          
	}

	public static void setApplicationId(String s)
	{
		applicationId = s;
	//    0    0:aload_0         
	//    1    1:putstatic       #184 <Field String applicationId>
	//    2    4:return          
	}

	public static void setApplicationName(String s)
	{
		applicationName = s;
	//    0    0:aload_0         
	//    1    1:putstatic       #213 <Field String applicationName>
	//    2    4:return          
	}

	public static void setAutoLogAppEventsEnabled(boolean flag)
	{
		autoLogAppEventsEnabled = Boolean.valueOf(flag);
	//    0    0:iload_0         
	//    1    1:invokestatic    #174 <Method Boolean Boolean.valueOf(boolean)>
	//    2    4:putstatic       #270 <Field Boolean autoLogAppEventsEnabled>
	//    3    7:return          
	}

	public static void setCacheDir(File file)
	{
		cacheDir = new LockOnGetVariable(((Object) (file)));
	//    0    0:new             #276 <Class LockOnGetVariable>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #596 <Method void LockOnGetVariable(Object)>
	//    4    8:putstatic       #274 <Field LockOnGetVariable cacheDir>
	//    5   11:return          
	}

	public static void setClientToken(String s)
	{
		appClientToken = s;
	//    0    0:aload_0         
	//    1    1:putstatic       #287 <Field String appClientToken>
	//    2    4:return          
	}

	public static void setCodelessDebugLogEnabled(boolean flag)
	{
		codelessDebugLogEnabled = Boolean.valueOf(flag);
	//    0    0:iload_0         
	//    1    1:invokestatic    #174 <Method Boolean Boolean.valueOf(boolean)>
	//    2    4:putstatic       #290 <Field Boolean codelessDebugLogEnabled>
	//    3    7:return          
	}

	public static void setExecutor(Executor executor1)
	{
		Validate.notNull(((Object) (executor1)), "executor");
	//    0    0:aload_0         
	//    1    1:ldc2            #601 <String "executor">
	//    2    4:invokestatic    #539 <Method void Validate.notNull(Object, String)>
		synchronized(LOCK)
	//*   3    7:getstatic       #151 <Field Object LOCK>
	//*   4   10:astore_1        
	//*   5   11:aload_1         
	//*   6   12:monitorenter    
		{
			executor = executor1;
	//    7   13:aload_0         
	//    8   14:putstatic       #294 <Field Executor executor>
		}
	//    9   17:aload_1         
	//   10   18:monitorexit     
		return;
	//   11   19:return          
		executor1;
	//   12   20:astore_0        
		obj;
	//   13   21:aload_1         
		JVM INSTR monitorexit ;
	//   14   22:monitorexit     
		throw executor1;
	//   15   23:aload_0         
	//   16   24:athrow          
	}

	public static void setFacebookDomain(String s)
	{
		Log.w(TAG, "WARNING: Calling setFacebookDomain from non-DEBUG code.");
	//    0    0:getstatic       #110 <Field String TAG>
	//    1    3:ldc2            #604 <String "WARNING: Calling setFacebookDomain from non-DEBUG code.">
	//    2    6:invokestatic    #610 <Method int Log.w(String, String)>
	//    3    9:pop             
		facebookDomain = s;
	//    4   10:aload_0         
	//    5   11:putstatic       #132 <Field String facebookDomain>
	//    6   14:return          
	}

	public static void setGraphApiVersion(String s)
	{
		Log.w(TAG, "WARNING: Calling setGraphApiVersion from non-DEBUG code.");
	//    0    0:getstatic       #110 <Field String TAG>
	//    1    3:ldc2            #613 <String "WARNING: Calling setGraphApiVersion from non-DEBUG code.">
	//    2    6:invokestatic    #610 <Method int Log.w(String, String)>
	//    3    9:pop             
		if(!Utility.isNullOrEmpty(s) && !graphApiVersion.equals(((Object) (s))))
	//*   4   10:aload_0         
	//*   5   11:invokestatic    #551 <Method boolean Utility.isNullOrEmpty(String)>
	//*   6   14:ifne            31
	//*   7   17:getstatic       #158 <Field String graphApiVersion>
	//*   8   20:aload_0         
	//*   9   21:invokevirtual   #616 <Method boolean String.equals(Object)>
	//*  10   24:ifne            31
			graphApiVersion = s;
	//   11   27:aload_0         
	//   12   28:putstatic       #158 <Field String graphApiVersion>
	//   13   31:return          
	}

	public static void setIsDebugEnabled(boolean flag)
	{
		isDebugEnabled = flag;
	//    0    0:iload_0         
	//    1    1:putstatic       #143 <Field boolean isDebugEnabled>
	//    2    4:return          
	}

	public static void setLegacyTokenUpgradeSupported(boolean flag)
	{
		isLegacyTokenUpgradeSupported = flag;
	//    0    0:iload_0         
	//    1    1:putstatic       #145 <Field boolean isLegacyTokenUpgradeSupported>
	//    2    4:return          
	}

	public static void setLimitEventAndDataUsage(Context context, boolean flag)
	{
		context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("limitEventUsage", flag).apply();
	//    0    0:aload_0         
	//    1    1:ldc2            #319 <String "com.facebook.sdk.appEventPreferences">
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #323 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    4    8:invokeinterface #475 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    5   13:ldc2            #325 <String "limitEventUsage">
	//    6   16:iload_1         
	//    7   17:invokeinterface #623 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//    8   22:invokeinterface #489 <Method void android.content.SharedPreferences$Editor.apply()>
	//    9   27:return          
	}

	public static void setOnProgressThreshold(long l)
	{
		onProgressThreshold.set(l);
	//    0    0:getstatic       #141 <Field AtomicLong onProgressThreshold>
	//    1    3:lload_0         
	//    2    4:invokevirtual   #627 <Method void AtomicLong.set(long)>
	//    3    7:return          
	}

	private static void updateGraphDebugBehavior()
	{
		if(loggingBehaviors.contains(((Object) (LoggingBehavior.GRAPH_API_DEBUG_INFO))) && !loggingBehaviors.contains(((Object) (LoggingBehavior.GRAPH_API_DEBUG_WARNING))))
	//*   0    0:getstatic       #130 <Field HashSet loggingBehaviors>
	//*   1    3:getstatic       #630 <Field LoggingBehavior LoggingBehavior.GRAPH_API_DEBUG_INFO>
	//*   2    6:invokevirtual   #359 <Method boolean HashSet.contains(Object)>
	//*   3    9:ifeq            34
	//*   4   12:getstatic       #130 <Field HashSet loggingBehaviors>
	//*   5   15:getstatic       #633 <Field LoggingBehavior LoggingBehavior.GRAPH_API_DEBUG_WARNING>
	//*   6   18:invokevirtual   #359 <Method boolean HashSet.contains(Object)>
	//*   7   21:ifne            34
			loggingBehaviors.add(((Object) (LoggingBehavior.GRAPH_API_DEBUG_WARNING)));
	//    8   24:getstatic       #130 <Field HashSet loggingBehaviors>
	//    9   27:getstatic       #633 <Field LoggingBehavior LoggingBehavior.GRAPH_API_DEBUG_WARNING>
	//   10   30:invokevirtual   #190 <Method boolean HashSet.add(Object)>
	//   11   33:pop             
	//   12   34:return          
	}

	public static final String ADVERTISER_ID_COLLECTION_ENABLED_PROPERTY = "com.facebook.sdk.AdvertiserIDCollectionEnabled";
	public static final String APPLICATION_ID_PROPERTY = "com.facebook.sdk.ApplicationId";
	public static final String APPLICATION_NAME_PROPERTY = "com.facebook.sdk.ApplicationName";
	private static final String ATTRIBUTION_PREFERENCES = "com.facebook.sdk.attributionTracking";
	public static final String AUTO_LOG_APP_EVENTS_ENABLED_PROPERTY = "com.facebook.sdk.AutoLogAppEventsEnabled";
	static final String CALLBACK_OFFSET_CHANGED_AFTER_INIT = "The callback request code offset can't be updated once the SDK is initialized. Call FacebookSdk.setCallbackRequestCodeOffset inside your Application.onCreate method";
	static final String CALLBACK_OFFSET_NEGATIVE = "The callback request code offset can't be negative.";
	public static final String CALLBACK_OFFSET_PROPERTY = "com.facebook.sdk.CallbackOffset";
	public static final String CLIENT_TOKEN_PROPERTY = "com.facebook.sdk.ClientToken";
	public static final String CODELESS_DEBUG_LOG_ENABLED_PROPERTY = "com.facebook.sdk.CodelessDebugLogEnabled";
	private static final int DEFAULT_CALLBACK_REQUEST_CODE_OFFSET = 64206;
	private static final int DEFAULT_CORE_POOL_SIZE = 5;
	private static final int DEFAULT_KEEP_ALIVE = 1;
	private static final int DEFAULT_MAXIMUM_POOL_SIZE = 128;
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
	private static final String FACEBOOK_COM = "facebook.com";
	private static final Object LOCK = new Object();
	private static final int MAX_REQUEST_CODE_RANGE = 100;
	private static final String PUBLISH_ACTIVITY_PATH = "%s/activities";
	private static final String TAG = ((Class) (com/facebook/FacebookSdk)).getCanonicalName();
	public static final String WEB_DIALOG_THEME = "com.facebook.sdk.WebDialogTheme";
	private static volatile Boolean advertiserIDCollectionEnabled;
	private static volatile String appClientToken;
	private static Context applicationContext;
	private static volatile String applicationId;
	private static volatile String applicationName;
	private static volatile Boolean autoLogAppEventsEnabled;
	private static LockOnGetVariable cacheDir;
	private static int callbackRequestCodeOffset = 64206;
	private static volatile Boolean codelessDebugLogEnabled;
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
	//    1    2:invokevirtual   #108 <Method String Class.getCanonicalName()>
	//    2    5:putstatic       #110 <Field String TAG>
		loggingBehaviors = new HashSet(((java.util.Collection) (Arrays.asList(((Object []) (new LoggingBehavior[] {
			LoggingBehavior.DEVELOPER_ERRORS
		}))))));
	//    3    8:new             #112 <Class HashSet>
	//    4   11:dup             
	//    5   12:iconst_1        
	//    6   13:anewarray       LoggingBehavior[]
	//    7   16:dup             
	//    8   17:iconst_0        
	//    9   18:getstatic       #118 <Field LoggingBehavior LoggingBehavior.DEVELOPER_ERRORS>
	//   10   21:aastore         
	//   11   22:invokestatic    #124 <Method java.util.List Arrays.asList(Object[])>
	//   12   25:invokespecial   #128 <Method void HashSet(java.util.Collection)>
	//   13   28:putstatic       #130 <Field HashSet loggingBehaviors>
	//   14   31:ldc1            #63  <String "facebook.com">
	//   15   33:putstatic       #132 <Field String facebookDomain>
	//   16   36:new             #134 <Class AtomicLong>
	//   17   39:dup             
	//   18   40:ldc2w           #135 <Long 0x10000L>
	//   19   43:invokespecial   #139 <Method void AtomicLong(long)>
	//   20   46:putstatic       #141 <Field AtomicLong onProgressThreshold>
	//   21   49:iconst_0        
	//   22   50:putstatic       #143 <Field boolean isDebugEnabled>
	//   23   53:iconst_0        
	//   24   54:putstatic       #145 <Field boolean isLegacyTokenUpgradeSupported>
	//   25   57:ldc1            #49  <Int 64206>
	//   26   59:putstatic       #147 <Field int callbackRequestCodeOffset>
	//   27   62:new             #4   <Class Object>
	//   28   65:dup             
	//   29   66:invokespecial   #149 <Method void Object()>
	//   30   69:putstatic       #151 <Field Object LOCK>
	//   31   72:invokestatic    #156 <Method String ServerProtocol.getDefaultAPIVersion()>
	//   32   75:putstatic       #158 <Field String graphApiVersion>
	//   33   78:new             #160 <Class LinkedBlockingQueue>
	//   34   81:dup             
	//   35   82:bipush          10
	//   36   84:invokespecial   #163 <Method void LinkedBlockingQueue(int)>
	//   37   87:putstatic       #165 <Field BlockingQueue DEFAULT_WORK_QUEUE>
	//   38   90:new             #6   <Class FacebookSdk$1>
	//   39   93:dup             
	//   40   94:invokespecial   #166 <Method void FacebookSdk$1()>
	//   41   97:putstatic       #168 <Field ThreadFactory DEFAULT_THREAD_FACTORY>
	//   42  100:iconst_0        
	//   43  101:invokestatic    #174 <Method Boolean Boolean.valueOf(boolean)>
	//   44  104:putstatic       #176 <Field Boolean sdkInitialized>
	//*  45  107:return          
	}


/*
	static Context access$000()
	{
		return applicationContext;
	//    0    0:getstatic       #181 <Field Context applicationContext>
	//    1    3:areturn         
	}

*/


/*
	static String access$100()
	{
		return applicationId;
	//    0    0:getstatic       #184 <Field String applicationId>
	//    1    3:areturn         
	}

*/
}
