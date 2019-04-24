// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.security;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.common.zze;
import com.google.android.gms.common.zzg;
import java.lang.reflect.Method;

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
	//    1    1:invokespecial   #32  <Method void Object()>
	//    2    4:return          
	}

	public static void installIfNeeded(Context context)
		throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException
	{
		zzac.zzb(((Object) (context)), "Context must not be null");
	//    0    0:aload_0         
	//    1    1:ldc1            #47  <String "Context must not be null">
	//    2    3:invokestatic    #53  <Method Object zzac.zzb(Object, Object)>
	//    3    6:pop             
		zzbEc.zzaE(context);
	//    4    7:getstatic       #29  <Field zze zzbEc>
	//    5   10:aload_0         
	//    6   11:invokevirtual   #56  <Method void zze.zzaE(Context)>
		context = zzg.getRemoteContext(context);
	//    7   14:aload_0         
	//    8   15:invokestatic    #62  <Method Context zzg.getRemoteContext(Context)>
	//    9   18:astore_0        
		if(context == null)
	//*  10   19:aload_0         
	//*  11   20:ifnonnull       41
		{
			Log.e("ProviderInstaller", "Failed to get remote context");
	//   12   23:ldc1            #64  <String "ProviderInstaller">
	//   13   25:ldc1            #66  <String "Failed to get remote context">
	//   14   27:invokestatic    #72  <Method int Log.e(String, String)>
	//   15   30:pop             
			throw new GooglePlayServicesNotAvailableException(8);
	//   16   31:new             #43  <Class GooglePlayServicesNotAvailableException>
	//   17   34:dup             
	//   18   35:bipush          8
	//   19   37:invokespecial   #75  <Method void GooglePlayServicesNotAvailableException(int)>
	//   20   40:athrow          
		}
		Object obj = zztX;
	//   21   41:getstatic       #34  <Field Object zztX>
	//   22   44:astore_1        
		obj;
	//   23   45:aload_1         
		JVM INSTR monitorenter ;
	//   24   46:monitorenter    
		try
		{
			if(zzbEd == null)
	//*  25   47:getstatic       #36  <Field Method zzbEd>
	//*  26   50:ifnonnull       57
				zzbR(context);
	//   27   53:aload_0         
	//   28   54:invokestatic    #78  <Method void zzbR(Context)>
			zzbEd.invoke(((Object) (null)), new Object[] {
				context
			});
	//   29   57:getstatic       #36  <Field Method zzbEd>
	//   30   60:aconst_null     
	//   31   61:iconst_1        
	//   32   62:anewarray       Object[]
	//   33   65:dup             
	//   34   66:iconst_0        
	//   35   67:aload_0         
	//   36   68:aastore         
	//   37   69:invokevirtual   #84  <Method Object Method.invoke(Object, Object[])>
	//   38   72:pop             
			break MISSING_BLOCK_LABEL_129;
	//   39   73:goto            129
		}
		// Misplaced declaration of an exception variable
		catch(Context context) { }
	//   40   76:astore_0        
		context = ((Context) (String.valueOf(((Object) (((Exception) (context)).getMessage())))));
	//   41   77:aload_0         
	//   42   78:invokevirtual   #88  <Method String Exception.getMessage()>
	//   43   81:invokestatic    #94  <Method String String.valueOf(Object)>
	//   44   84:astore_0        
		if(((String) (context)).length() != 0)
	//*  45   85:aload_0         
	//*  46   86:invokevirtual   #98  <Method int String.length()>
	//*  47   89:ifeq            102
		{
			context = ((Context) ("Failed to install provider: ".concat(((String) (context)))));
	//   48   92:ldc1            #100 <String "Failed to install provider: ">
	//   49   94:aload_0         
	//   50   95:invokevirtual   #104 <Method String String.concat(String)>
	//   51   98:astore_0        
			break MISSING_BLOCK_LABEL_112;
	//   52   99:goto            112
		}
		context = ((Context) (new String("Failed to install provider: ")));
	//   53  102:new             #90  <Class String>
	//   54  105:dup             
	//   55  106:ldc1            #100 <String "Failed to install provider: ">
	//   56  108:invokespecial   #107 <Method void String(String)>
	//   57  111:astore_0        
		Log.e("ProviderInstaller", ((String) (context)));
	//   58  112:ldc1            #64  <String "ProviderInstaller">
	//   59  114:aload_0         
	//   60  115:invokestatic    #72  <Method int Log.e(String, String)>
	//   61  118:pop             
		throw new GooglePlayServicesNotAvailableException(8);
	//   62  119:new             #43  <Class GooglePlayServicesNotAvailableException>
	//   63  122:dup             
	//   64  123:bipush          8
	//   65  125:invokespecial   #75  <Method void GooglePlayServicesNotAvailableException(int)>
	//   66  128:athrow          
		obj;
	//   67  129:aload_1         
		JVM INSTR monitorexit ;
	//   68  130:monitorexit     
		return;
	//   69  131:return          
		context;
	//   70  132:astore_0        
	//*  71  133:aload_1         
		throw context;
	//   72  134:monitorexit     
	//   73  135:aload_0         
	//   74  136:athrow          
	}

	public static void installIfNeededAsync(Context context, ProviderInstallListener providerinstalllistener)
	{
		zzac.zzb(((Object) (context)), "Context must not be null");
	//    0    0:aload_0         
	//    1    1:ldc1            #47  <String "Context must not be null">
	//    2    3:invokestatic    #53  <Method Object zzac.zzb(Object, Object)>
	//    3    6:pop             
		zzac.zzb(((Object) (providerinstalllistener)), "Listener must not be null");
	//    4    7:aload_1         
	//    5    8:ldc1            #112 <String "Listener must not be null">
	//    6   10:invokestatic    #53  <Method Object zzac.zzb(Object, Object)>
	//    7   13:pop             
		zzac.zzdj("Must be called on the UI thread");
	//    8   14:ldc1            #114 <String "Must be called on the UI thread">
	//    9   16:invokestatic    #117 <Method void zzac.zzdj(String)>
		((AsyncTask) (new AsyncTask(context, providerinstalllistener) {

			protected Object doInBackground(Object aobj[])
			{
				return ((Object) (zzb((Void[])aobj)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #27  <Class Void[]>
			//    3    5:invokevirtual   #31  <Method Integer zzb(Void[])>
			//    4    8:areturn         
			}

			protected void onPostExecute(Object obj)
			{
				zzg((Integer)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #35  <Class Integer>
			//    3    5:invokevirtual   #39  <Method void zzg(Integer)>
			//    4    8:return          
			}

			protected transient Integer zzb(Void avoid[])
			{
				try
				{
					ProviderInstaller.installIfNeeded(zztf);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field Context zztf>
			//    2    4:invokestatic    #47  <Method void ProviderInstaller.installIfNeeded(Context)>
				}
			//*   3    7:goto            28
				// Misplaced declaration of an exception variable
				catch(Void avoid[])
			//*   4   10:astore_1        
				{
					return Integer.valueOf(((GooglePlayServicesRepairableException) (avoid)).getConnectionStatusCode());
			//    5   11:aload_1         
			//    6   12:invokevirtual   #51  <Method int GooglePlayServicesRepairableException.getConnectionStatusCode()>
			//    7   15:invokestatic    #55  <Method Integer Integer.valueOf(int)>
			//    8   18:areturn         
				}
				// Misplaced declaration of an exception variable
				catch(Void avoid[])
			//*   9   19:astore_1        
				{
					return Integer.valueOf(((GooglePlayServicesNotAvailableException) (avoid)).errorCode);
			//   10   20:aload_1         
			//   11   21:getfield        #59  <Field int GooglePlayServicesNotAvailableException.errorCode>
			//   12   24:invokestatic    #55  <Method Integer Integer.valueOf(int)>
			//   13   27:areturn         
				}
				return Integer.valueOf(0);
			//   14   28:iconst_0        
			//   15   29:invokestatic    #55  <Method Integer Integer.valueOf(int)>
			//   16   32:areturn         
			}

			protected void zzg(Integer integer)
			{
				if(integer.intValue() == 0)
			//*   0    0:aload_1         
			//*   1    1:invokevirtual   #62  <Method int Integer.intValue()>
			//*   2    4:ifne            17
				{
					zzbEe.onProviderInstalled();
			//    3    7:aload_0         
			//    4    8:getfield        #19  <Field ProviderInstaller$ProviderInstallListener zzbEe>
			//    5   11:invokeinterface #67  <Method void ProviderInstaller$ProviderInstallListener.onProviderInstalled()>
					return;
			//    6   16:return          
				} else
				{
					Intent intent = ProviderInstaller.zzPH().zzb(zztf, integer.intValue(), "pi");
			//    7   17:invokestatic    #71  <Method zze ProviderInstaller.zzPH()>
			//    8   20:aload_0         
			//    9   21:getfield        #17  <Field Context zztf>
			//   10   24:aload_1         
			//   11   25:invokevirtual   #62  <Method int Integer.intValue()>
			//   12   28:ldc1            #73  <String "pi">
			//   13   30:invokevirtual   #78  <Method Intent zze.zzb(Context, int, String)>
			//   14   33:astore_2        
					zzbEe.onProviderInstallFailed(integer.intValue(), intent);
			//   15   34:aload_0         
			//   16   35:getfield        #19  <Field ProviderInstaller$ProviderInstallListener zzbEe>
			//   17   38:aload_1         
			//   18   39:invokevirtual   #62  <Method int Integer.intValue()>
			//   19   42:aload_2         
			//   20   43:invokeinterface #82  <Method void ProviderInstaller$ProviderInstallListener.onProviderInstallFailed(int, Intent)>
					return;
			//   21   48:return          
				}
			}

			final ProviderInstallListener zzbEe;
			final Context zztf;

			
			{
				zztf = context;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field Context zztf>
				zzbEe = providerinstalllistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #19  <Field ProviderInstaller$ProviderInstallListener zzbEe>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #22  <Method void AsyncTask()>
			//    8   14:return          
			}
		}
)).execute(((Object []) (new Void[0])));
	//   10   19:new             #6   <Class ProviderInstaller$1>
	//   11   22:dup             
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:invokespecial   #119 <Method void ProviderInstaller$1(Context, ProviderInstaller$ProviderInstallListener)>
	//   15   28:iconst_0        
	//   16   29:anewarray       Void[]
	//   17   32:invokevirtual   #127 <Method AsyncTask AsyncTask.execute(Object[])>
	//   18   35:pop             
	//   19   36:return          
	}

	static zze zzPH()
	{
		return zzbEc;
	//    0    0:getstatic       #29  <Field zze zzbEc>
	//    1    3:areturn         
	}

	private static void zzbR(Context context)
		throws ClassNotFoundException, NoSuchMethodException
	{
		zzbEd = context.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl").getMethod("insertProvider", new Class[] {
			android/content/Context
		});
	//    0    0:aload_0         
	//    1    1:invokevirtual   #138 <Method ClassLoader Context.getClassLoader()>
	//    2    4:ldc1            #140 <String "com.google.android.gms.common.security.ProviderInstallerImpl">
	//    3    6:invokevirtual   #146 <Method Class ClassLoader.loadClass(String)>
	//    4    9:ldc1            #148 <String "insertProvider">
	//    5   11:iconst_1        
	//    6   12:anewarray       Class[]
	//    7   15:dup             
	//    8   16:iconst_0        
	//    9   17:ldc1            #134 <Class Context>
	//   10   19:aastore         
	//   11   20:invokevirtual   #154 <Method Method Class.getMethod(String, Class[])>
	//   12   23:putstatic       #36  <Field Method zzbEd>
	//   13   26:return          
	}

	public static final String PROVIDER_NAME = "GmsCore_OpenSSL";
	private static final zze zzbEc = zze.zzuY();
	private static Method zzbEd = null;
	private static final Object zztX = new Object();

	static 
	{
	//    0    0:invokestatic    #27  <Method zze zze.zzuY()>
	//    1    3:putstatic       #29  <Field zze zzbEc>
	//    2    6:new             #4   <Class Object>
	//    3    9:dup             
	//    4   10:invokespecial   #32  <Method void Object()>
	//    5   13:putstatic       #34  <Field Object zztX>
	//    6   16:aconst_null     
	//    7   17:putstatic       #36  <Field Method zzbEd>
	//*   8   20:return          
	}
}
