// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;

public class MetadataValueReader
{

	public MetadataValueReader()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:return          
	}

	public static String getGoogleAppId(Context context)
	{
		zze(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #31  <Method void zze(Context)>
		return zzuj;
	//    2    4:getstatic       #33  <Field String zzuj>
	//    3    7:areturn         
	}

	public static int getGooglePlayServicesVersion(Context context)
	{
		zze(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #31  <Method void zze(Context)>
		return zzuk;
	//    2    4:getstatic       #37  <Field int zzuk>
	//    3    7:ireturn         
	}

	public static void resetForTesting()
	{
		synchronized(sLock)
	//*   0    0:getstatic       #24  <Field Object sLock>
	//*   1    3:astore_0        
	//*   2    4:aload_0         
	//*   3    5:monitorenter    
		{
			zzui = false;
	//    4    6:iconst_0        
	//    5    7:putstatic       #41  <Field boolean zzui>
		}
	//    6   10:aload_0         
	//    7   11:monitorexit     
		return;
	//    8   12:return          
		exception;
	//    9   13:astore_1        
		obj;
	//   10   14:aload_0         
		JVM INSTR monitorexit ;
	//   11   15:monitorexit     
		throw exception;
	//   12   16:aload_1         
	//   13   17:athrow          
	}

	public static void setValuesForTesting(String s, int i)
	{
		synchronized(sLock)
	//*   0    0:getstatic       #24  <Field Object sLock>
	//*   1    3:astore_2        
	//*   2    4:aload_2         
	//*   3    5:monitorenter    
		{
			zzuj = s;
	//    4    6:aload_0         
	//    5    7:putstatic       #33  <Field String zzuj>
			zzuk = i;
	//    6   10:iload_1         
	//    7   11:putstatic       #37  <Field int zzuk>
			zzui = true;
	//    8   14:iconst_1        
	//    9   15:putstatic       #41  <Field boolean zzui>
		}
	//   10   18:aload_2         
	//   11   19:monitorexit     
		return;
	//   12   20:return          
		s;
	//   13   21:astore_0        
		obj;
	//   14   22:aload_2         
		JVM INSTR monitorexit ;
	//   15   23:monitorexit     
		throw s;
	//   16   24:aload_0         
	//   17   25:athrow          
	}

	private static void zze(Context context)
	{
label0:
		{
			synchronized(sLock)
	//*   0    0:getstatic       #24  <Field Object sLock>
	//*   1    3:astore_1        
	//*   2    4:aload_1         
	//*   3    5:monitorenter    
			{
				if(!zzui)
					break label0;
	//    4    6:getstatic       #41  <Field boolean zzui>
	//    5    9:ifeq            15
			}
	//    6   12:aload_1         
	//    7   13:monitorexit     
			return;
	//    8   14:return          
		}
		String s;
		zzui = true;
	//    9   15:iconst_1        
	//   10   16:putstatic       #41  <Field boolean zzui>
		s = context.getPackageName();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #52  <Method String Context.getPackageName()>
	//   13   23:astore_2        
		context = ((Context) (Wrappers.packageManager(context)));
	//   14   24:aload_0         
	//   15   25:invokestatic    #58  <Method PackageManagerWrapper Wrappers.packageManager(Context)>
	//   16   28:astore_0        
		context = ((Context) (((PackageManagerWrapper) (context)).getApplicationInfo(s, 128).metaData));
	//   17   29:aload_0         
	//   18   30:aload_2         
	//   19   31:sipush          128
	//   20   34:invokevirtual   #64  <Method ApplicationInfo PackageManagerWrapper.getApplicationInfo(String, int)>
	//   21   37:getfield        #70  <Field Bundle ApplicationInfo.metaData>
	//   22   40:astore_0        
		if(context != null)
			break MISSING_BLOCK_LABEL_48;
	//   23   41:aload_0         
	//   24   42:ifnonnull       48
		obj;
	//   25   45:aload_1         
		JVM INSTR monitorexit ;
	//   26   46:monitorexit     
		return;
	//   27   47:return          
		try
		{
			zzuj = ((Bundle) (context)).getString("com.google.app.id");
	//   28   48:aload_0         
	//   29   49:ldc1            #8   <String "com.google.app.id">
	//   30   51:invokevirtual   #76  <Method String Bundle.getString(String)>
	//   31   54:putstatic       #33  <Field String zzuj>
			zzuk = ((Bundle) (context)).getInt("com.google.android.gms.version");
	//   32   57:aload_0         
	//   33   58:ldc1            #78  <String "com.google.android.gms.version">
	//   34   60:invokevirtual   #82  <Method int Bundle.getInt(String)>
	//   35   63:putstatic       #37  <Field int zzuk>
			break MISSING_BLOCK_LABEL_79;
	//   36   66:goto            79
		}
		// Misplaced declaration of an exception variable
		catch(Context context) { }
	//   37   69:astore_0        
		Log.wtf("MetadataValueReader", "This should never happen.", ((Throwable) (context)));
	//   38   70:ldc1            #84  <String "MetadataValueReader">
	//   39   72:ldc1            #86  <String "This should never happen.">
	//   40   74:aload_0         
	//   41   75:invokestatic    #92  <Method int Log.wtf(String, String, Throwable)>
	//   42   78:pop             
		obj;
	//   43   79:aload_1         
		JVM INSTR monitorexit ;
	//   44   80:monitorexit     
		return;
	//   45   81:return          
		context;
	//   46   82:astore_0        
		obj;
	//   47   83:aload_1         
		JVM INSTR monitorexit ;
	//   48   84:monitorexit     
		throw context;
	//   49   85:aload_0         
	//   50   86:athrow          
	}

	public static final String KEY_METADATA_APP_ID = "com.google.app.id";
	private static Object sLock = new Object();
	private static boolean zzui;
	private static String zzuj;
	private static int zzuk;

	static 
	{
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void Object()>
	//    3    7:putstatic       #24  <Field Object sLock>
	//*   4   10:return          
	}
}
