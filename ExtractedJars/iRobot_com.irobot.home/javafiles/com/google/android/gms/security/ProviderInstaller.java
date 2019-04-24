// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.security;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;
import com.google.android.gms.common.*;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.reflect.Method;

// Referenced classes of package com.google.android.gms.security:
//			zza

public class ProviderInstaller
{
	public static interface ProviderInstallListener
	{

		public abstract void onProviderInstallFailed(int i, Intent intent);

		public abstract void onProviderInstalled();
	}


	public ProviderInstaller()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
	//    2    4:return          
	}

	public static void installIfNeeded(Context context)
	{
	//*   0    0:aload_0         
	//*   1    1:ldc1            #41  <String "Context must not be null">
	//*   2    3:invokestatic    #47  <Method Object Preconditions.checkNotNull(Object, Object)>
	//*   3    6:pop             
	//*   4    7:getstatic       #27  <Field GoogleApiAvailabilityLight zziu>
	//*   5   10:aload_0         
	//*   6   11:ldc1            #48  <Int 0xb5f608>
	//*   7   13:invokevirtual   #52  <Method void GoogleApiAvailabilityLight.verifyGooglePlayServicesIsAvailable(Context, int)>
	//*   8   16:aload_0         
	//*   9   17:invokestatic    #58  <Method Context GooglePlayServicesUtilLight.getRemoteContext(Context)>
	//*  10   20:astore_0        
	//*  11   21:aload_0         
	//*  12   22:ifnonnull       53
	//*  13   25:ldc1            #60  <String "ProviderInstaller">
	//*  14   27:bipush          6
	//*  15   29:invokestatic    #66  <Method boolean Log.isLoggable(String, int)>
	//*  16   32:ifeq            43
	//*  17   35:ldc1            #60  <String "ProviderInstaller">
	//*  18   37:ldc1            #68  <String "Failed to get remote context">
	//*  19   39:invokestatic    #72  <Method int Log.e(String, String)>
	//*  20   42:pop             
	//*  21   43:new             #74  <Class GooglePlayServicesNotAvailableException>
	//*  22   46:dup             
	//*  23   47:bipush          8
	//*  24   49:invokespecial   #77  <Method void GooglePlayServicesNotAvailableException(int)>
	//*  25   52:athrow          
	//*  26   53:getstatic       #32  <Field Object lock>
	//*  27   56:astore_1        
		obj;
	//   28   57:aload_1         
		JVM INSTR monitorenter ;
	//   29   58:monitorenter    
		Preconditions.checkNotNull(((Object) (context)), "Context must not be null");
		zziu.verifyGooglePlayServicesIsAvailable(context, 0xb5f608);
		Throwable throwable;
		try
		{
			context = GooglePlayServicesUtilLight.getRemoteContext(context);
		}
	//*  30   59:getstatic       #79  <Field Method zziv>
	//*  31   62:ifnonnull       91
	//*  32   65:aload_0         
	//*  33   66:invokevirtual   #85  <Method ClassLoader Context.getClassLoader()>
	//*  34   69:ldc1            #87  <String "com.google.android.gms.common.security.ProviderInstallerImpl">
	//*  35   71:invokevirtual   #93  <Method Class ClassLoader.loadClass(String)>
	//*  36   74:ldc1            #95  <String "insertProvider">
	//*  37   76:iconst_1        
	//*  38   77:anewarray       Class[]
	//*  39   80:dup             
	//*  40   81:iconst_0        
	//*  41   82:ldc1            #81  <Class Context>
	//*  42   84:aastore         
	//*  43   85:invokevirtual   #101 <Method Method Class.getMethod(String, Class[])>
	//*  44   88:putstatic       #79  <Field Method zziv>
	//*  45   91:getstatic       #79  <Field Method zziv>
	//*  46   94:aconst_null     
	//*  47   95:iconst_1        
	//*  48   96:anewarray       Object[]
	//*  49   99:dup             
	//*  50  100:iconst_0        
	//*  51  101:aload_0         
	//*  52  102:aastore         
	//*  53  103:invokevirtual   #107 <Method Object Method.invoke(Object, Object[])>
	//*  54  106:pop             
	//*  55  107:aload_1         
	//*  56  108:monitorexit     
	//*  57  109:return          
	//*  58  110:astore_0        
	//*  59  111:aload_0         
	//*  60  112:invokevirtual   #111 <Method Throwable Exception.getCause()>
	//*  61  115:astore_2        
	//*  62  116:ldc1            #60  <String "ProviderInstaller">
	//*  63  118:bipush          6
	//*  64  120:invokestatic    #66  <Method boolean Log.isLoggable(String, int)>
	//*  65  123:ifeq            182
	//*  66  126:aload_2         
	//*  67  127:ifnonnull       138
	//*  68  130:aload_0         
	//*  69  131:invokevirtual   #115 <Method String Exception.getMessage()>
	//*  70  134:astore_0        
	//*  71  135:goto            143
	//*  72  138:aload_2         
	//*  73  139:invokevirtual   #118 <Method String Throwable.getMessage()>
	//*  74  142:astore_0        
	//*  75  143:aload_0         
	//*  76  144:invokestatic    #124 <Method String String.valueOf(Object)>
	//*  77  147:astore_0        
	//*  78  148:aload_0         
	//*  79  149:invokevirtual   #128 <Method int String.length()>
	//*  80  152:ifeq            165
	//*  81  155:ldc1            #130 <String "Failed to install provider: ">
	//*  82  157:aload_0         
	//*  83  158:invokevirtual   #134 <Method String String.concat(String)>
	//*  84  161:astore_0        
	//*  85  162:goto            175
	//*  86  165:new             #120 <Class String>
	//*  87  168:dup             
	//*  88  169:ldc1            #130 <String "Failed to install provider: ">
	//*  89  171:invokespecial   #137 <Method void String(String)>
	//*  90  174:astore_0        
	//*  91  175:ldc1            #60  <String "ProviderInstaller">
	//*  92  177:aload_0         
	//*  93  178:invokestatic    #72  <Method int Log.e(String, String)>
	//*  94  181:pop             
	//*  95  182:new             #74  <Class GooglePlayServicesNotAvailableException>
	//*  96  185:dup             
	//*  97  186:bipush          8
	//*  98  188:invokespecial   #77  <Method void GooglePlayServicesNotAvailableException(int)>
	//*  99  191:athrow          
	//* 100  192:aload_1         
	//* 101  193:monitorexit     
	//* 102  194:aload_0         
	//* 103  195:athrow          
	//* 104  196:ldc1            #60  <String "ProviderInstaller">
	//* 105  198:bipush          6
	//* 106  200:invokestatic    #66  <Method boolean Log.isLoggable(String, int)>
	//* 107  203:ifeq            214
	//* 108  206:ldc1            #60  <String "ProviderInstaller">
	//* 109  208:ldc1            #139 <String "Failed to get remote context - resource not found">
	//* 110  210:invokestatic    #72  <Method int Log.e(String, String)>
	//* 111  213:pop             
	//* 112  214:new             #74  <Class GooglePlayServicesNotAvailableException>
	//* 113  217:dup             
	//* 114  218:bipush          8
	//* 115  220:invokespecial   #77  <Method void GooglePlayServicesNotAvailableException(int)>
	//* 116  223:athrow          
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			if(Log.isLoggable("ProviderInstaller", 6))
				Log.e("ProviderInstaller", "Failed to get remote context - resource not found");
			throw new GooglePlayServicesNotAvailableException(8);
		}
		if(context == null)
		{
			if(Log.isLoggable("ProviderInstaller", 6))
				Log.e("ProviderInstaller", "Failed to get remote context");
			throw new GooglePlayServicesNotAvailableException(8);
		}
		synchronized(lock)
		{
			if(zziv == null)
				zziv = context.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl").getMethod("insertProvider", new Class[] {
					android/content/Context
				});
			zziv.invoke(((Object) (null)), new Object[] {
				context
			});
		}
		return;
		context;
		throwable = ((Exception) (context)).getCause();
		if(!Log.isLoggable("ProviderInstaller", 6))
			break MISSING_BLOCK_LABEL_182;
		if(throwable != null)
			break MISSING_BLOCK_LABEL_138;
		context = ((Context) (((Exception) (context)).getMessage()));
		break MISSING_BLOCK_LABEL_143;
		context = ((Context) (throwable.getMessage()));
		context = ((Context) (String.valueOf(((Object) (context)))));
		if(((String) (context)).length() != 0)
		{
			context = ((Context) ("Failed to install provider: ".concat(((String) (context)))));
			break MISSING_BLOCK_LABEL_175;
		}
		context = ((Context) (new String("Failed to install provider: ")));
		Log.e("ProviderInstaller", ((String) (context)));
		throw new GooglePlayServicesNotAvailableException(8);
	//* 117  224:astore_0        
	//* 118  225:goto            196
	//* 119  228:astore_0        
	//* 120  229:goto            192
	}

	public static void installIfNeededAsync(Context context, ProviderInstallListener providerinstalllistener)
	{
		Preconditions.checkNotNull(((Object) (context)), "Context must not be null");
	//    0    0:aload_0         
	//    1    1:ldc1            #41  <String "Context must not be null">
	//    2    3:invokestatic    #47  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:pop             
		Preconditions.checkNotNull(((Object) (providerinstalllistener)), "Listener must not be null");
	//    4    7:aload_1         
	//    5    8:ldc1            #143 <String "Listener must not be null">
	//    6   10:invokestatic    #47  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    7   13:pop             
		Preconditions.checkMainThread("Must be called on the UI thread");
	//    8   14:ldc1            #145 <String "Must be called on the UI thread">
	//    9   16:invokestatic    #148 <Method void Preconditions.checkMainThread(String)>
		((AsyncTask) (new zza(context, providerinstalllistener))).execute(((Object []) (new Void[0])));
	//   10   19:new             #150 <Class zza>
	//   11   22:dup             
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:invokespecial   #152 <Method void zza(Context, ProviderInstaller$ProviderInstallListener)>
	//   15   28:iconst_0        
	//   16   29:anewarray       Void[]
	//   17   32:invokevirtual   #160 <Method AsyncTask AsyncTask.execute(Object[])>
	//   18   35:pop             
	//   19   36:return          
	}

	static GoogleApiAvailabilityLight zzak()
	{
		return zziu;
	//    0    0:getstatic       #27  <Field GoogleApiAvailabilityLight zziu>
	//    1    3:areturn         
	}

	public static final String PROVIDER_NAME = "GmsCore_OpenSSL";
	private static final Object lock = new Object();
	private static final GoogleApiAvailabilityLight zziu = GoogleApiAvailabilityLight.getInstance();
	private static Method zziv;

	static 
	{
	//    0    0:invokestatic    #25  <Method GoogleApiAvailabilityLight GoogleApiAvailabilityLight.getInstance()>
	//    1    3:putstatic       #27  <Field GoogleApiAvailabilityLight zziu>
	//    2    6:new             #4   <Class Object>
	//    3    9:dup             
	//    4   10:invokespecial   #30  <Method void Object()>
	//    5   13:putstatic       #32  <Field Object lock>
	//*   6   16:return          
	}
}
