// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.*;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.AppEventsLoggerUtility;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.BoltsMeasurementEventListener;
import com.facebook.internal.LockOnGetVariable;
import com.facebook.internal.NativeProtocol;
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
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//			LoggingBehavior, FacebookException, GraphRequest, GraphRequestBatch, 
//			GraphResponse, FacebookRequestError, AccessTokenManager, ProfileManager, 
//			AccessToken, Profile

public final class FacebookSdk
{
	public static interface InitializeCallback
	{

		public abstract void onInitialized();
	}


	public FacebookSdk()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #126 <Method void Object()>
	//    2    4:return          
	}

	public static void addLoggingBehavior(LoggingBehavior loggingbehavior)
	{
		synchronized(loggingBehaviors)
	//*   0    0:getstatic       #115 <Field HashSet loggingBehaviors>
	//*   1    3:astore_1        
	//*   2    4:aload_1         
	//*   3    5:monitorenter    
		{
			loggingBehaviors.add(((Object) (loggingbehavior)));
	//    4    6:getstatic       #115 <Field HashSet loggingBehaviors>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #157 <Method boolean HashSet.add(Object)>
	//    7   13:pop             
			updateGraphDebugBehavior();
	//    8   14:invokestatic    #160 <Method void updateGraphDebugBehavior()>
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
	//*   0    0:getstatic       #115 <Field HashSet loggingBehaviors>
	//*   1    3:astore_0        
	//*   2    4:aload_0         
	//*   3    5:monitorenter    
		{
			loggingBehaviors.clear();
	//    4    6:getstatic       #115 <Field HashSet loggingBehaviors>
	//    5    9:invokevirtual   #164 <Method void HashSet.clear()>
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

	public static Context getApplicationContext()
	{
		Validate.sdkInitialized();
	//    0    0:invokestatic    #169 <Method void Validate.sdkInitialized()>
		return applicationContext;
	//    1    3:getstatic       #151 <Field Context applicationContext>
	//    2    6:areturn         
	}

	public static String getApplicationId()
	{
		Validate.sdkInitialized();
	//    0    0:invokestatic    #169 <Method void Validate.sdkInitialized()>
		return applicationId;
	//    1    3:getstatic       #172 <Field String applicationId>
	//    2    6:areturn         
	}

	public static String getApplicationName()
	{
		Validate.sdkInitialized();
	//    0    0:invokestatic    #169 <Method void Validate.sdkInitialized()>
		return applicationName;
	//    1    3:getstatic       #175 <Field String applicationName>
	//    2    6:areturn         
	}

	public static String getApplicationSignature(Context context)
	{
		Validate.sdkInitialized();
	//    0    0:invokestatic    #169 <Method void Validate.sdkInitialized()>
		if(context == null)
	//*   1    3:aload_0         
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		PackageManager packagemanager = context.getPackageManager();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #187 <Method PackageManager Context.getPackageManager()>
	//    7   13:astore_1        
		if(packagemanager == null)
	//*   8   14:aload_1         
	//*   9   15:ifnonnull       20
			return null;
	//   10   18:aconst_null     
	//   11   19:areturn         
		context = ((Context) (context.getPackageName()));
	//   12   20:aload_0         
	//   13   21:invokevirtual   #190 <Method String Context.getPackageName()>
	//   14   24:astore_0        
		Signature asignature[];
		try
		{
			context = ((Context) (packagemanager.getPackageInfo(((String) (context)), 64)));
	//   15   25:aload_1         
	//   16   26:aload_0         
	//   17   27:bipush          64
	//   18   29:invokevirtual   #196 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   19   32:astore_0        
		}
	//*  20   33:aload_0         
	//*  21   34:getfield        #202 <Field Signature[] PackageInfo.signatures>
	//*  22   37:astore_1        
	//*  23   38:aload_1         
	//*  24   39:ifnull          78
	//*  25   42:aload_1         
	//*  26   43:arraylength     
	//*  27   44:ifne            49
	//*  28   47:aconst_null     
	//*  29   48:areturn         
	//*  30   49:ldc1            #204 <String "SHA-1">
	//*  31   51:invokestatic    #210 <Method MessageDigest MessageDigest.getInstance(String)>
	//*  32   54:astore_1        
	//*  33   55:aload_1         
	//*  34   56:aload_0         
	//*  35   57:getfield        #202 <Field Signature[] PackageInfo.signatures>
	//*  36   60:iconst_0        
	//*  37   61:aaload          
	//*  38   62:invokevirtual   #216 <Method byte[] Signature.toByteArray()>
	//*  39   65:invokevirtual   #220 <Method void MessageDigest.update(byte[])>
	//*  40   68:aload_1         
	//*  41   69:invokevirtual   #223 <Method byte[] MessageDigest.digest()>
	//*  42   72:bipush          9
	//*  43   74:invokestatic    #229 <Method String Base64.encodeToString(byte[], int)>
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

	public static File getCacheDir()
	{
		Validate.sdkInitialized();
	//    0    0:invokestatic    #169 <Method void Validate.sdkInitialized()>
		return (File)cacheDir.getValue();
	//    1    3:getstatic       #233 <Field LockOnGetVariable cacheDir>
	//    2    6:invokevirtual   #239 <Method Object LockOnGetVariable.getValue()>
	//    3    9:checkcast       #241 <Class File>
	//    4   12:areturn         
	}

	public static int getCallbackRequestCodeOffset()
	{
		Validate.sdkInitialized();
	//    0    0:invokestatic    #169 <Method void Validate.sdkInitialized()>
		return callbackRequestCodeOffset;
	//    1    3:getstatic       #245 <Field int callbackRequestCodeOffset>
	//    2    6:ireturn         
	}

	public static String getClientToken()
	{
		Validate.sdkInitialized();
	//    0    0:invokestatic    #169 <Method void Validate.sdkInitialized()>
		return appClientToken;
	//    1    3:getstatic       #248 <Field String appClientToken>
	//    2    6:areturn         
	}

	public static Executor getExecutor()
	{
		synchronized(LOCK)
	//*   0    0:getstatic       #128 <Field Object LOCK>
	//*   1    3:astore_0        
	//*   2    4:aload_0         
	//*   3    5:monitorenter    
		{
			if(executor == null)
	//*   4    6:getstatic       #252 <Field Executor executor>
	//*   5    9:ifnonnull       18
				executor = AsyncTask.THREAD_POOL_EXECUTOR;
	//    6   12:getstatic       #257 <Field Executor AsyncTask.THREAD_POOL_EXECUTOR>
	//    7   15:putstatic       #252 <Field Executor executor>
		}
	//    8   18:aload_0         
	//    9   19:monitorexit     
		return executor;
	//   10   20:getstatic       #252 <Field Executor executor>
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
	//    0    0:getstatic       #260 <Field String facebookDomain>
	//    1    3:areturn         
	}

	public static boolean getLimitEventAndDataUsage(Context context)
	{
		Validate.sdkInitialized();
	//    0    0:invokestatic    #169 <Method void Validate.sdkInitialized()>
		return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
	//    1    3:aload_0         
	//    2    4:ldc2            #264 <String "com.facebook.sdk.appEventPreferences">
	//    3    7:iconst_0        
	//    4    8:invokevirtual   #268 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    5   11:ldc2            #270 <String "limitEventUsage">
	//    6   14:iconst_0        
	//    7   15:invokeinterface #276 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//    8   20:ireturn         
	}

	public static Set getLoggingBehaviors()
	{
		Set set;
		synchronized(loggingBehaviors)
	//*   0    0:getstatic       #115 <Field HashSet loggingBehaviors>
	//*   1    3:astore_0        
	//*   2    4:aload_0         
	//*   3    5:monitorenter    
		{
			set = Collections.unmodifiableSet(((Set) (new HashSet(((java.util.Collection) (loggingBehaviors))))));
	//    4    6:new             #97  <Class HashSet>
	//    5    9:dup             
	//    6   10:getstatic       #115 <Field HashSet loggingBehaviors>
	//    7   13:invokespecial   #113 <Method void HashSet(java.util.Collection)>
	//    8   16:invokestatic    #284 <Method Set Collections.unmodifiableSet(Set)>
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
	//    0    0:invokestatic    #169 <Method void Validate.sdkInitialized()>
		return onProgressThreshold.get();
	//    1    3:getstatic       #124 <Field AtomicLong onProgressThreshold>
	//    2    6:invokevirtual   #291 <Method long AtomicLong.get()>
	//    3    9:lreturn         
	}

	public static String getSdkVersion()
	{
		return "4.6.0";
	//    0    0:ldc2            #294 <String "4.6.0">
	//    1    3:areturn         
	}

	public static int getWebDialogTheme()
	{
		Validate.sdkInitialized();
	//    0    0:invokestatic    #169 <Method void Validate.sdkInitialized()>
		return webDialogTheme;
	//    1    3:getstatic       #297 <Field int webDialogTheme>
	//    2    6:ireturn         
	}

	public static boolean isDebugEnabled()
	{
		return isDebugEnabled;
	//    0    0:getstatic       #300 <Field boolean isDebugEnabled>
	//    1    3:ireturn         
	}

	public static boolean isFacebookRequestCode(int i)
	{
		return i >= callbackRequestCodeOffset && i < callbackRequestCodeOffset + 100;
	//    0    0:iload_0         
	//    1    1:getstatic       #245 <Field int callbackRequestCodeOffset>
	//    2    4:icmplt          19
	//    3    7:iload_0         
	//    4    8:getstatic       #245 <Field int callbackRequestCodeOffset>
	//    5   11:bipush          100
	//    6   13:iadd            
	//    7   14:icmpge          19
	//    8   17:iconst_1        
	//    9   18:ireturn         
	//   10   19:iconst_0        
	//   11   20:ireturn         
	}

	public static boolean isInitialized()
	{
		com/facebook/FacebookSdk;
	//    0    0:ldc1            #2   <Class FacebookSdk>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		boolean flag = sdkInitialized.booleanValue();
	//    2    3:getstatic       #146 <Field Boolean sdkInitialized>
	//    3    6:invokevirtual   #306 <Method boolean Boolean.booleanValue()>
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
	//    0    0:getstatic       #308 <Field boolean isLegacyTokenUpgradeSupported>
	//    1    3:ireturn         
	}

	public static boolean isLoggingBehaviorEnabled(LoggingBehavior loggingbehavior)
	{
		HashSet hashset = loggingBehaviors;
	//    0    0:getstatic       #115 <Field HashSet loggingBehaviors>
	//    1    3:astore_2        
		hashset;
	//    2    4:aload_2         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		boolean flag;
		if(isDebugEnabled() && loggingBehaviors.contains(((Object) (loggingbehavior))))
	//*   4    6:invokestatic    #312 <Method boolean isDebugEnabled()>
	//*   5    9:ifeq            36
	//*   6   12:getstatic       #115 <Field HashSet loggingBehaviors>
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #315 <Method boolean HashSet.contains(Object)>
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
	//    4    6:invokevirtual   #187 <Method PackageManager Context.getPackageManager()>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #190 <Method String Context.getPackageName()>
	//    7   13:sipush          128
	//    8   16:invokevirtual   #321 <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//    9   19:astore_0        
		}
	//*  10   20:aload_0         
	//*  11   21:ifnull          167
	//*  12   24:aload_0         
	//*  13   25:getfield        #327 <Field Bundle ApplicationInfo.metaData>
	//*  14   28:ifnonnull       32
	//*  15   31:return          
	//*  16   32:getstatic       #172 <Field String applicationId>
	//*  17   35:ifnonnull       112
	//*  18   38:aload_0         
	//*  19   39:getfield        #327 <Field Bundle ApplicationInfo.metaData>
	//*  20   42:ldc1            #19  <String "com.facebook.sdk.ApplicationId">
	//*  21   44:invokevirtual   #332 <Method Object Bundle.get(String)>
	//*  22   47:astore_1        
	//*  23   48:aload_1         
	//*  24   49:instanceof      #334 <Class String>
	//*  25   52:ifeq            94
	//*  26   55:aload_1         
	//*  27   56:checkcast       #334 <Class String>
	//*  28   59:astore_1        
	//*  29   60:aload_1         
	//*  30   61:getstatic       #340 <Field Locale Locale.ROOT>
	//*  31   64:invokevirtual   #344 <Method String String.toLowerCase(Locale)>
	//*  32   67:ldc2            #346 <String "fb">
	//*  33   70:invokevirtual   #350 <Method boolean String.startsWith(String)>
	//*  34   73:ifeq            87
	//*  35   76:aload_1         
	//*  36   77:iconst_2        
	//*  37   78:invokevirtual   #354 <Method String String.substring(int)>
	//*  38   81:putstatic       #172 <Field String applicationId>
	//*  39   84:goto            112
	//*  40   87:aload_1         
	//*  41   88:putstatic       #172 <Field String applicationId>
	//*  42   91:goto            112
	//*  43   94:aload_1         
	//*  44   95:instanceof      #356 <Class Integer>
	//*  45   98:ifeq            112
	//*  46  101:new             #358 <Class FacebookException>
	//*  47  104:dup             
	//*  48  105:ldc2            #360 <String "App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.">
	//*  49  108:invokespecial   #363 <Method void FacebookException(String)>
	//*  50  111:athrow          
	//*  51  112:getstatic       #175 <Field String applicationName>
	//*  52  115:ifnonnull       130
	//*  53  118:aload_0         
	//*  54  119:getfield        #327 <Field Bundle ApplicationInfo.metaData>
	//*  55  122:ldc1            #22  <String "com.facebook.sdk.ApplicationName">
	//*  56  124:invokevirtual   #367 <Method String Bundle.getString(String)>
	//*  57  127:putstatic       #175 <Field String applicationName>
	//*  58  130:getstatic       #248 <Field String appClientToken>
	//*  59  133:ifnonnull       148
	//*  60  136:aload_0         
	//*  61  137:getfield        #327 <Field Bundle ApplicationInfo.metaData>
	//*  62  140:ldc1            #34  <String "com.facebook.sdk.ClientToken">
	//*  63  142:invokevirtual   #367 <Method String Bundle.getString(String)>
	//*  64  145:putstatic       #248 <Field String appClientToken>
	//*  65  148:getstatic       #297 <Field int webDialogTheme>
	//*  66  151:ifne            166
	//*  67  154:aload_0         
	//*  68  155:getfield        #327 <Field Bundle ApplicationInfo.metaData>
	//*  69  158:ldc1            #60  <String "com.facebook.sdk.WebDialogTheme">
	//*  70  160:invokevirtual   #371 <Method int Bundle.getInt(String)>
	//*  71  163:invokestatic    #374 <Method void setWebDialogTheme(int)>
	//*  72  166:return          
	//*  73  167:return          
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  74  168:astore_0        
		{
			return;
	//   75  169:return          
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
			if(webDialogTheme == 0)
				setWebDialogTheme(((ApplicationInfo) (context)).metaData.getInt("com.facebook.sdk.WebDialogTheme"));
			return;
		} else
		{
			return;
		}
	}

	static GraphResponse publishInstallAndWaitForResponse(Context context, String s)
	{
		if(context != null && s != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:ifnull          294
	//    2    4:aload_1         
	//    3    5:ifnonnull       11
	//*   4    8:goto            294
_L2:
		long l;
		SharedPreferences sharedpreferences;
		Object obj;
		Object obj1;
		AttributionIdentifiers attributionidentifiers;
		String s1;
		attributionidentifiers = AttributionIdentifiers.getAttributionIdentifiers(context);
	//    5   11:aload_0         
	//    6   12:invokestatic    #386 <Method AttributionIdentifiers AttributionIdentifiers.getAttributionIdentifiers(Context)>
	//    7   15:astore          7
		sharedpreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
	//    8   17:aload_0         
	//    9   18:ldc1            #25  <String "com.facebook.sdk.attributionTracking">
	//   10   20:iconst_0        
	//   11   21:invokevirtual   #268 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   12   24:astore          4
		obj = ((Object) (new StringBuilder()));
	//   13   26:new             #388 <Class StringBuilder>
	//   14   29:dup             
	//   15   30:invokespecial   #389 <Method void StringBuilder()>
	//   16   33:astore          5
		((StringBuilder) (obj)).append(s);
	//   17   35:aload           5
	//   18   37:aload_1         
	//   19   38:invokevirtual   #393 <Method StringBuilder StringBuilder.append(String)>
	//   20   41:pop             
		((StringBuilder) (obj)).append("ping");
	//   21   42:aload           5
	//   22   44:ldc2            #395 <String "ping">
	//   23   47:invokevirtual   #393 <Method StringBuilder StringBuilder.append(String)>
	//   24   50:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   25   51:aload           5
	//   26   53:invokevirtual   #398 <Method String StringBuilder.toString()>
	//   27   56:astore          5
		obj1 = ((Object) (new StringBuilder()));
	//   28   58:new             #388 <Class StringBuilder>
	//   29   61:dup             
	//   30   62:invokespecial   #389 <Method void StringBuilder()>
	//   31   65:astore          6
		((StringBuilder) (obj1)).append(s);
	//   32   67:aload           6
	//   33   69:aload_1         
	//   34   70:invokevirtual   #393 <Method StringBuilder StringBuilder.append(String)>
	//   35   73:pop             
		((StringBuilder) (obj1)).append("json");
	//   36   74:aload           6
	//   37   76:ldc2            #400 <String "json">
	//   38   79:invokevirtual   #393 <Method StringBuilder StringBuilder.append(String)>
	//   39   82:pop             
		obj1 = ((Object) (((StringBuilder) (obj1)).toString()));
	//   40   83:aload           6
	//   41   85:invokevirtual   #398 <Method String StringBuilder.toString()>
	//   42   88:astore          6
		l = sharedpreferences.getLong(((String) (obj)), 0L);
	//   43   90:aload           4
	//   44   92:aload           5
	//   45   94:lconst_0        
	//   46   95:invokeinterface #404 <Method long SharedPreferences.getLong(String, long)>
	//   47  100:lstore_2        
		s1 = sharedpreferences.getString(((String) (obj1)), ((String) (null)));
	//   48  101:aload           4
	//   49  103:aload           6
	//   50  105:aconst_null     
	//   51  106:invokeinterface #407 <Method String SharedPreferences.getString(String, String)>
	//   52  111:astore          8
		context = ((Context) (AppEventsLoggerUtility.getJSONObjectForGraphAPICall(com.facebook.internal.AppEventsLoggerUtility.GraphAPIActivityType.MOBILE_INSTALL_EVENT, attributionidentifiers, AppEventsLogger.getAnonymousAppDeviceGUID(context), getLimitEventAndDataUsage(context), context)));
	//   53  113:getstatic       #413 <Field com.facebook.internal.AppEventsLoggerUtility$GraphAPIActivityType com.facebook.internal.AppEventsLoggerUtility$GraphAPIActivityType.MOBILE_INSTALL_EVENT>
	//   54  116:aload           7
	//   55  118:aload_0         
	//   56  119:invokestatic    #418 <Method String AppEventsLogger.getAnonymousAppDeviceGUID(Context)>
	//   57  122:aload_0         
	//   58  123:invokestatic    #420 <Method boolean getLimitEventAndDataUsage(Context)>
	//   59  126:aload_0         
	//   60  127:invokestatic    #426 <Method JSONObject AppEventsLoggerUtility.getJSONObjectForGraphAPICall(com.facebook.internal.AppEventsLoggerUtility$GraphAPIActivityType, AttributionIdentifiers, String, boolean, Context)>
	//   61  130:astore_0        
		s = ((String) (GraphRequest.newPostRequest(((AccessToken) (null)), String.format("%s/activities", new Object[] {
			s
		}), ((JSONObject) (context)), ((GraphRequest.Callback) (null)))));
	//   62  131:aconst_null     
	//   63  132:ldc1            #56  <String "%s/activities">
	//   64  134:iconst_1        
	//   65  135:anewarray       Object[]
	//   66  138:dup             
	//   67  139:iconst_0        
	//   68  140:aload_1         
	//   69  141:aastore         
	//   70  142:invokestatic    #430 <Method String String.format(String, Object[])>
	//   71  145:aload_0         
	//   72  146:aconst_null     
	//   73  147:invokestatic    #436 <Method GraphRequest GraphRequest.newPostRequest(AccessToken, String, JSONObject, GraphRequest$Callback)>
	//   74  150:astore_1        
		if(l == 0L) goto _L4; else goto _L3
	//   75  151:lload_2         
	//   76  152:lconst_0        
	//   77  153:lcmp            
	//   78  154:ifeq            225
_L3:
		if(s1 == null) goto _L6; else goto _L5
	//   79  157:aload           8
	//   80  159:ifnull          175
_L5:
		context = ((Context) (new JSONObject(s1)));
	//   81  162:new             #438 <Class JSONObject>
	//   82  165:dup             
	//   83  166:aload           8
	//   84  168:invokespecial   #439 <Method void JSONObject(String)>
	//   85  171:astore_0        
		  goto _L7
	//*  86  172:goto            177
_L6:
		context = null;
	//   87  175:aconst_null     
	//   88  176:astore_0        
_L7:
		if(context != null)
			break MISSING_BLOCK_LABEL_213;
	//   89  177:aload_0         
	//   90  178:ifnonnull       213
		return (GraphResponse)GraphResponse.createResponsesFromString("true", ((java.net.HttpURLConnection) (null)), new GraphRequestBatch(new GraphRequest[] {
			s
		})).get(0);
	//   91  181:ldc2            #441 <String "true">
	//   92  184:aconst_null     
	//   93  185:new             #443 <Class GraphRequestBatch>
	//   94  188:dup             
	//   95  189:iconst_1        
	//   96  190:anewarray       GraphRequest[]
	//   97  193:dup             
	//   98  194:iconst_0        
	//   99  195:aload_1         
	//  100  196:aastore         
	//  101  197:invokespecial   #446 <Method void GraphRequestBatch(GraphRequest[])>
	//  102  200:invokestatic    #452 <Method List GraphResponse.createResponsesFromString(String, java.net.HttpURLConnection, GraphRequestBatch)>
	//  103  203:iconst_0        
	//  104  204:invokeinterface #457 <Method Object List.get(int)>
	//  105  209:checkcast       #448 <Class GraphResponse>
	//  106  212:areturn         
		return new GraphResponse(((GraphRequest) (null)), ((java.net.HttpURLConnection) (null)), ((String) (null)), ((JSONObject) (context)));
	//  107  213:new             #448 <Class GraphResponse>
	//  108  216:dup             
	//  109  217:aconst_null     
	//  110  218:aconst_null     
	//  111  219:aconst_null     
	//  112  220:aload_0         
	//  113  221:invokespecial   #460 <Method void GraphResponse(GraphRequest, java.net.HttpURLConnection, String, JSONObject)>
	//  114  224:areturn         
_L4:
		context = ((Context) (((GraphRequest) (s)).executeAndWait()));
	//  115  225:aload_1         
	//  116  226:invokevirtual   #464 <Method GraphResponse GraphRequest.executeAndWait()>
	//  117  229:astore_0        
		s = ((String) (sharedpreferences.edit()));
	//  118  230:aload           4
	//  119  232:invokeinterface #468 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//  120  237:astore_1        
		((android.content.SharedPreferences.Editor) (s)).putLong(((String) (obj)), System.currentTimeMillis());
	//  121  238:aload_1         
	//  122  239:aload           5
	//  123  241:invokestatic    #473 <Method long System.currentTimeMillis()>
	//  124  244:invokeinterface #479 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//  125  249:pop             
		if(((GraphResponse) (context)).getJSONObject() != null)
	//* 126  250:aload_0         
	//* 127  251:invokevirtual   #483 <Method JSONObject GraphResponse.getJSONObject()>
	//* 128  254:ifnull          273
			((android.content.SharedPreferences.Editor) (s)).putString(((String) (obj1)), ((GraphResponse) (context)).getJSONObject().toString());
	//  129  257:aload_1         
	//  130  258:aload           6
	//  131  260:aload_0         
	//  132  261:invokevirtual   #483 <Method JSONObject GraphResponse.getJSONObject()>
	//  133  264:invokevirtual   #484 <Method String JSONObject.toString()>
	//  134  267:invokeinterface #488 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//  135  272:pop             
		((android.content.SharedPreferences.Editor) (s)).apply();
	//  136  273:aload_1         
	//  137  274:invokeinterface #491 <Method void android.content.SharedPreferences$Editor.apply()>
		return ((GraphResponse) (context));
	//  138  279:aload_0         
	//  139  280:areturn         
		context;
	//  140  281:astore_0        
		throw new FacebookException("An error occurred while publishing install.", ((Throwable) (context)));
	//  141  282:new             #358 <Class FacebookException>
	//  142  285:dup             
	//  143  286:ldc2            #493 <String "An error occurred while publishing install.">
	//  144  289:aload_0         
	//  145  290:invokespecial   #496 <Method void FacebookException(String, Throwable)>
	//  146  293:athrow          
_L1:
		throw new IllegalArgumentException("Both context and applicationId must be non-null");
	//  147  294:new             #498 <Class IllegalArgumentException>
	//  148  297:dup             
	//  149  298:ldc2            #500 <String "Both context and applicationId must be non-null">
	//  150  301:invokespecial   #501 <Method void IllegalArgumentException(String)>
	//  151  304:athrow          
		context;
	//  152  305:astore_0        
		Utility.logd("Facebook-publish", ((Exception) (context)));
	//  153  306:ldc2            #503 <String "Facebook-publish">
	//  154  309:aload_0         
	//  155  310:invokestatic    #509 <Method void Utility.logd(String, Exception)>
		return new GraphResponse(((GraphRequest) (null)), ((java.net.HttpURLConnection) (null)), new FacebookRequestError(((java.net.HttpURLConnection) (null)), ((Exception) (context))));
	//  156  313:new             #448 <Class GraphResponse>
	//  157  316:dup             
	//  158  317:aconst_null     
	//  159  318:aconst_null     
	//  160  319:new             #511 <Class FacebookRequestError>
	//  161  322:dup             
	//  162  323:aconst_null     
	//  163  324:aload_0         
	//  164  325:invokespecial   #514 <Method void FacebookRequestError(java.net.HttpURLConnection, Exception)>
	//  165  328:invokespecial   #517 <Method void GraphResponse(GraphRequest, java.net.HttpURLConnection, FacebookRequestError)>
	//  166  331:areturn         
		context;
	//  167  332:astore_0        
		if(true) goto _L6; else goto _L8
_L8:
	//* 168  333:goto            175
	}

	public static void publishInstallAsync(Context context, String s)
	{
		context = context.getApplicationContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #521 <Method Context Context.getApplicationContext()>
	//    2    4:astore_0        
		getExecutor().execute(new Runnable(context, s) {

			public void run()
			{
				FacebookSdk.publishInstallAndWaitForResponse(applicationContext, applicationId);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field Context val$applicationContext>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field String val$applicationId>
			//    4    8:invokestatic    #29  <Method GraphResponse FacebookSdk.publishInstallAndWaitForResponse(Context, String)>
			//    5   11:pop             
			//    6   12:return          
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
	//    3    5:invokestatic    #523 <Method Executor getExecutor()>
	//    4    8:new             #12  <Class FacebookSdk$4>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokespecial   #525 <Method void FacebookSdk$4(Context, String)>
	//    9   17:invokeinterface #531 <Method void Executor.execute(Runnable)>
	//   10   22:return          
	}

	public static void removeLoggingBehavior(LoggingBehavior loggingbehavior)
	{
		synchronized(loggingBehaviors)
	//*   0    0:getstatic       #115 <Field HashSet loggingBehaviors>
	//*   1    3:astore_1        
	//*   2    4:aload_1         
	//*   3    5:monitorenter    
		{
			loggingBehaviors.remove(((Object) (loggingbehavior)));
	//    4    6:getstatic       #115 <Field HashSet loggingBehaviors>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #535 <Method boolean HashSet.remove(Object)>
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
	//    4    5:invokestatic    #539 <Method void sdkInitialize(Context, FacebookSdk$InitializeCallback)>
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
	//    5    6:invokestatic    #543 <Method void sdkInitialize(Context, int, FacebookSdk$InitializeCallback)>
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
		if(sdkInitialized.booleanValue() && i != callbackRequestCodeOffset)
	//*   2    3:getstatic       #146 <Field Boolean sdkInitialized>
	//*   3    6:invokevirtual   #306 <Method boolean Boolean.booleanValue()>
	//*   4    9:ifeq            29
	//*   5   12:iload_1         
	//*   6   13:getstatic       #245 <Field int callbackRequestCodeOffset>
	//*   7   16:icmpeq          29
			throw new FacebookException("The callback request code offset can't be updated once the SDK is initialized.");
	//    8   19:new             #358 <Class FacebookException>
	//    9   22:dup             
	//   10   23:ldc1            #28  <String "The callback request code offset can't be updated once the SDK is initialized.">
	//   11   25:invokespecial   #363 <Method void FacebookException(String)>
	//   12   28:athrow          
		if(i >= 0)
			break MISSING_BLOCK_LABEL_43;
	//   13   29:iload_1         
	//   14   30:ifge            43
		throw new FacebookException("The callback request code offset can't be negative.");
	//   15   33:new             #358 <Class FacebookException>
	//   16   36:dup             
	//   17   37:ldc1            #31  <String "The callback request code offset can't be negative.">
	//   18   39:invokespecial   #363 <Method void FacebookException(String)>
	//   19   42:athrow          
		callbackRequestCodeOffset = i;
	//   20   43:iload_1         
	//   21   44:putstatic       #245 <Field int callbackRequestCodeOffset>
		sdkInitialize(context);
	//   22   47:aload_0         
	//   23   48:invokestatic    #545 <Method void sdkInitialize(Context)>
		com/facebook/FacebookSdk;
	//   24   51:ldc1            #2   <Class FacebookSdk>
		JVM INSTR monitorexit ;
	//   25   53:monitorexit     
		return;
	//   26   54:return          
		context;
	//   27   55:astore_0        
	//*  28   56:ldc1            #2   <Class FacebookSdk>
		throw context;
	//   29   58:monitorexit     
	//   30   59:aload_0         
	//   31   60:athrow          
	}

	public static void sdkInitialize(Context context, InitializeCallback initializecallback)
	{
		com/facebook/FacebookSdk;
	//    0    0:ldc1            #2   <Class FacebookSdk>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(!sdkInitialized.booleanValue())
			break MISSING_BLOCK_LABEL_26;
	//    2    3:getstatic       #146 <Field Boolean sdkInitialized>
	//    3    6:invokevirtual   #306 <Method boolean Boolean.booleanValue()>
	//    4    9:ifeq            26
		if(initializecallback == null)
			break MISSING_BLOCK_LABEL_22;
	//    5   12:aload_1         
	//    6   13:ifnull          22
		initializecallback.onInitialized();
	//    7   16:aload_1         
	//    8   17:invokeinterface #548 <Method void FacebookSdk$InitializeCallback.onInitialized()>
		com/facebook/FacebookSdk;
	//    9   22:ldc1            #2   <Class FacebookSdk>
		JVM INSTR monitorexit ;
	//   10   24:monitorexit     
		return;
	//   11   25:return          
		Validate.notNull(((Object) (context)), "applicationContext");
	//   12   26:aload_0         
	//   13   27:ldc2            #549 <String "applicationContext">
	//   14   30:invokestatic    #553 <Method void Validate.notNull(Object, String)>
		Validate.hasFacebookActivity(context, false);
	//   15   33:aload_0         
	//   16   34:iconst_0        
	//   17   35:invokestatic    #557 <Method void Validate.hasFacebookActivity(Context, boolean)>
		Validate.hasInternetPermissions(context, false);
	//   18   38:aload_0         
	//   19   39:iconst_0        
	//   20   40:invokestatic    #560 <Method void Validate.hasInternetPermissions(Context, boolean)>
		applicationContext = context.getApplicationContext();
	//   21   43:aload_0         
	//   22   44:invokevirtual   #521 <Method Context Context.getApplicationContext()>
	//   23   47:putstatic       #151 <Field Context applicationContext>
		loadDefaultsFromMetadata(applicationContext);
	//   24   50:getstatic       #151 <Field Context applicationContext>
	//   25   53:invokestatic    #562 <Method void loadDefaultsFromMetadata(Context)>
		Utility.loadAppSettingsAsync(applicationContext, applicationId);
	//   26   56:getstatic       #151 <Field Context applicationContext>
	//   27   59:getstatic       #172 <Field String applicationId>
	//   28   62:invokestatic    #565 <Method void Utility.loadAppSettingsAsync(Context, String)>
		NativeProtocol.updateAllAvailableProtocolVersionsAsync();
	//   29   65:invokestatic    #570 <Method void NativeProtocol.updateAllAvailableProtocolVersionsAsync()>
		BoltsMeasurementEventListener.getInstance(applicationContext);
	//   30   68:getstatic       #151 <Field Context applicationContext>
	//   31   71:invokestatic    #575 <Method BoltsMeasurementEventListener BoltsMeasurementEventListener.getInstance(Context)>
	//   32   74:pop             
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
	//   33   75:new             #235 <Class LockOnGetVariable>
	//   34   78:dup             
	//   35   79:new             #8   <Class FacebookSdk$2>
	//   36   82:dup             
	//   37   83:invokespecial   #576 <Method void FacebookSdk$2()>
	//   38   86:invokespecial   #579 <Method void LockOnGetVariable(Callable)>
	//   39   89:putstatic       #233 <Field LockOnGetVariable cacheDir>
		context = ((Context) (new FutureTask(new Callable(initializecallback) {

			public volatile Object call()
				throws Exception
			{
				return ((Object) (call()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #29  <Method Void call()>
			//    2    4:areturn         
			}

			public Void call()
				throws Exception
			{
				AccessTokenManager.getInstance().loadCurrentAccessToken();
			//    0    0:invokestatic    #36  <Method AccessTokenManager AccessTokenManager.getInstance()>
			//    1    3:invokevirtual   #40  <Method boolean AccessTokenManager.loadCurrentAccessToken()>
			//    2    6:pop             
				ProfileManager.getInstance().loadCurrentProfile();
			//    3    7:invokestatic    #45  <Method ProfileManager ProfileManager.getInstance()>
			//    4   10:invokevirtual   #48  <Method boolean ProfileManager.loadCurrentProfile()>
			//    5   13:pop             
				if(AccessToken.getCurrentAccessToken() != null && Profile.getCurrentProfile() == null)
			//*   6   14:invokestatic    #54  <Method AccessToken AccessToken.getCurrentAccessToken()>
			//*   7   17:ifnull          29
			//*   8   20:invokestatic    #60  <Method Profile Profile.getCurrentProfile()>
			//*   9   23:ifnonnull       29
					Profile.fetchProfileForCurrentAccessToken();
			//   10   26:invokestatic    #63  <Method void Profile.fetchProfileForCurrentAccessToken()>
				if(callback != null)
			//*  11   29:aload_0         
			//*  12   30:getfield        #18  <Field FacebookSdk$InitializeCallback val$callback>
			//*  13   33:ifnull          45
					callback.onInitialized();
			//   14   36:aload_0         
			//   15   37:getfield        #18  <Field FacebookSdk$InitializeCallback val$callback>
			//   16   40:invokeinterface #68  <Method void FacebookSdk$InitializeCallback.onInitialized()>
				return null;
			//   17   45:aconst_null     
			//   18   46:areturn         
			}

			final InitializeCallback val$callback;

			
			{
				callback = initializecallback;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field FacebookSdk$InitializeCallback val$callback>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
)));
	//   40   92:new             #581 <Class FutureTask>
	//   41   95:dup             
	//   42   96:new             #10  <Class FacebookSdk$3>
	//   43   99:dup             
	//   44  100:aload_1         
	//   45  101:invokespecial   #584 <Method void FacebookSdk$3(FacebookSdk$InitializeCallback)>
	//   46  104:invokespecial   #585 <Method void FutureTask(Callable)>
	//   47  107:astore_0        
		getExecutor().execute(((Runnable) (context)));
	//   48  108:invokestatic    #523 <Method Executor getExecutor()>
	//   49  111:aload_0         
	//   50  112:invokeinterface #531 <Method void Executor.execute(Runnable)>
		sdkInitialized = Boolean.valueOf(true);
	//   51  117:iconst_1        
	//   52  118:invokestatic    #144 <Method Boolean Boolean.valueOf(boolean)>
	//   53  121:putstatic       #146 <Field Boolean sdkInitialized>
		com/facebook/FacebookSdk;
	//   54  124:ldc1            #2   <Class FacebookSdk>
		JVM INSTR monitorexit ;
	//   55  126:monitorexit     
		return;
	//   56  127:return          
		context;
	//   57  128:astore_0        
	//*  58  129:ldc1            #2   <Class FacebookSdk>
		throw context;
	//   59  131:monitorexit     
	//   60  132:aload_0         
	//   61  133:athrow          
	}

	public static void setApplicationId(String s)
	{
		applicationId = s;
	//    0    0:aload_0         
	//    1    1:putstatic       #172 <Field String applicationId>
	//    2    4:return          
	}

	public static void setApplicationName(String s)
	{
		applicationName = s;
	//    0    0:aload_0         
	//    1    1:putstatic       #175 <Field String applicationName>
	//    2    4:return          
	}

	public static void setCacheDir(File file)
	{
		cacheDir = new LockOnGetVariable(((Object) (file)));
	//    0    0:new             #235 <Class LockOnGetVariable>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #592 <Method void LockOnGetVariable(Object)>
	//    4    8:putstatic       #233 <Field LockOnGetVariable cacheDir>
	//    5   11:return          
	}

	public static void setClientToken(String s)
	{
		appClientToken = s;
	//    0    0:aload_0         
	//    1    1:putstatic       #248 <Field String appClientToken>
	//    2    4:return          
	}

	public static void setExecutor(Executor executor1)
	{
		Validate.notNull(((Object) (executor1)), "executor");
	//    0    0:aload_0         
	//    1    1:ldc2            #596 <String "executor">
	//    2    4:invokestatic    #553 <Method void Validate.notNull(Object, String)>
		synchronized(LOCK)
	//*   3    7:getstatic       #128 <Field Object LOCK>
	//*   4   10:astore_1        
	//*   5   11:aload_1         
	//*   6   12:monitorenter    
		{
			executor = executor1;
	//    7   13:aload_0         
	//    8   14:putstatic       #252 <Field Executor executor>
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
	//    0    0:getstatic       #95  <Field String TAG>
	//    1    3:ldc2            #599 <String "WARNING: Calling setFacebookDomain from non-DEBUG code.">
	//    2    6:invokestatic    #605 <Method int Log.w(String, String)>
	//    3    9:pop             
		facebookDomain = s;
	//    4   10:aload_0         
	//    5   11:putstatic       #260 <Field String facebookDomain>
	//    6   14:return          
	}

	public static void setIsDebugEnabled(boolean flag)
	{
		isDebugEnabled = flag;
	//    0    0:iload_0         
	//    1    1:putstatic       #300 <Field boolean isDebugEnabled>
	//    2    4:return          
	}

	public static void setLegacyTokenUpgradeSupported(boolean flag)
	{
		isLegacyTokenUpgradeSupported = flag;
	//    0    0:iload_0         
	//    1    1:putstatic       #308 <Field boolean isLegacyTokenUpgradeSupported>
	//    2    4:return          
	}

	public static void setLimitEventAndDataUsage(Context context, boolean flag)
	{
		context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("limitEventUsage", flag).apply();
	//    0    0:aload_0         
	//    1    1:ldc2            #264 <String "com.facebook.sdk.appEventPreferences">
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #268 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    4    8:invokeinterface #468 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    5   13:ldc2            #270 <String "limitEventUsage">
	//    6   16:iload_1         
	//    7   17:invokeinterface #613 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//    8   22:invokeinterface #491 <Method void android.content.SharedPreferences$Editor.apply()>
	//    9   27:return          
	}

	public static void setOnProgressThreshold(long l)
	{
		onProgressThreshold.set(l);
	//    0    0:getstatic       #124 <Field AtomicLong onProgressThreshold>
	//    1    3:lload_0         
	//    2    4:invokevirtual   #617 <Method void AtomicLong.set(long)>
	//    3    7:return          
	}

	public static void setWebDialogTheme(int i)
	{
		webDialogTheme = i;
	//    0    0:iload_0         
	//    1    1:putstatic       #297 <Field int webDialogTheme>
	//    2    4:return          
	}

	private static void updateGraphDebugBehavior()
	{
		if(loggingBehaviors.contains(((Object) (LoggingBehavior.GRAPH_API_DEBUG_INFO))) && !loggingBehaviors.contains(((Object) (LoggingBehavior.GRAPH_API_DEBUG_WARNING))))
	//*   0    0:getstatic       #115 <Field HashSet loggingBehaviors>
	//*   1    3:getstatic       #620 <Field LoggingBehavior LoggingBehavior.GRAPH_API_DEBUG_INFO>
	//*   2    6:invokevirtual   #315 <Method boolean HashSet.contains(Object)>
	//*   3    9:ifeq            34
	//*   4   12:getstatic       #115 <Field HashSet loggingBehaviors>
	//*   5   15:getstatic       #623 <Field LoggingBehavior LoggingBehavior.GRAPH_API_DEBUG_WARNING>
	//*   6   18:invokevirtual   #315 <Method boolean HashSet.contains(Object)>
	//*   7   21:ifne            34
			loggingBehaviors.add(((Object) (LoggingBehavior.GRAPH_API_DEBUG_WARNING)));
	//    8   24:getstatic       #115 <Field HashSet loggingBehaviors>
	//    9   27:getstatic       #623 <Field LoggingBehavior LoggingBehavior.GRAPH_API_DEBUG_WARNING>
	//   10   30:invokevirtual   #157 <Method boolean HashSet.add(Object)>
	//   11   33:pop             
	//   12   34:return          
	}

	public static final String APPLICATION_ID_PROPERTY = "com.facebook.sdk.ApplicationId";
	public static final String APPLICATION_NAME_PROPERTY = "com.facebook.sdk.ApplicationName";
	private static final String ATTRIBUTION_PREFERENCES = "com.facebook.sdk.attributionTracking";
	static final String CALLBACK_OFFSET_CHANGED_AFTER_INIT = "The callback request code offset can't be updated once the SDK is initialized.";
	static final String CALLBACK_OFFSET_NEGATIVE = "The callback request code offset can't be negative.";
	public static final String CLIENT_TOKEN_PROPERTY = "com.facebook.sdk.ClientToken";
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
	private static volatile String appClientToken;
	private static Context applicationContext;
	private static volatile String applicationId;
	private static volatile String applicationName;
	private static LockOnGetVariable cacheDir;
	private static int callbackRequestCodeOffset = 64206;
	private static volatile Executor executor;
	private static volatile String facebookDomain = "facebook.com";
	private static volatile boolean isDebugEnabled = false;
	private static boolean isLegacyTokenUpgradeSupported = false;
	private static final HashSet loggingBehaviors;
	private static AtomicLong onProgressThreshold = new AtomicLong(0x10000L);
	private static Boolean sdkInitialized = Boolean.valueOf(false);
	private static volatile int webDialogTheme;

	static 
	{
	//    0    0:ldc1            #2   <Class FacebookSdk>
	//    1    2:invokevirtual   #93  <Method String Class.getCanonicalName()>
	//    2    5:putstatic       #95  <Field String TAG>
		loggingBehaviors = new HashSet(((java.util.Collection) (Arrays.asList(((Object []) (new LoggingBehavior[] {
			LoggingBehavior.DEVELOPER_ERRORS
		}))))));
	//    3    8:new             #97  <Class HashSet>
	//    4   11:dup             
	//    5   12:iconst_1        
	//    6   13:anewarray       LoggingBehavior[]
	//    7   16:dup             
	//    8   17:iconst_0        
	//    9   18:getstatic       #103 <Field LoggingBehavior LoggingBehavior.DEVELOPER_ERRORS>
	//   10   21:aastore         
	//   11   22:invokestatic    #109 <Method List Arrays.asList(Object[])>
	//   12   25:invokespecial   #113 <Method void HashSet(java.util.Collection)>
	//   13   28:putstatic       #115 <Field HashSet loggingBehaviors>
	//   14   31:new             #117 <Class AtomicLong>
	//   15   34:dup             
	//   16   35:ldc2w           #118 <Long 0x10000L>
	//   17   38:invokespecial   #122 <Method void AtomicLong(long)>
	//   18   41:putstatic       #124 <Field AtomicLong onProgressThreshold>
	//   19   44:new             #4   <Class Object>
	//   20   47:dup             
	//   21   48:invokespecial   #126 <Method void Object()>
	//   22   51:putstatic       #128 <Field Object LOCK>
	//   23   54:new             #130 <Class LinkedBlockingQueue>
	//   24   57:dup             
	//   25   58:bipush          10
	//   26   60:invokespecial   #133 <Method void LinkedBlockingQueue(int)>
	//   27   63:putstatic       #135 <Field BlockingQueue DEFAULT_WORK_QUEUE>
	//   28   66:new             #6   <Class FacebookSdk$1>
	//   29   69:dup             
	//   30   70:invokespecial   #136 <Method void FacebookSdk$1()>
	//   31   73:putstatic       #138 <Field ThreadFactory DEFAULT_THREAD_FACTORY>
	//   32   76:iconst_0        
	//   33   77:invokestatic    #144 <Method Boolean Boolean.valueOf(boolean)>
	//   34   80:putstatic       #146 <Field Boolean sdkInitialized>
	//*  35   83:return          
	}


/*
	static Context access$000()
	{
		return applicationContext;
	//    0    0:getstatic       #151 <Field Context applicationContext>
	//    1    3:areturn         
	}

*/
}
