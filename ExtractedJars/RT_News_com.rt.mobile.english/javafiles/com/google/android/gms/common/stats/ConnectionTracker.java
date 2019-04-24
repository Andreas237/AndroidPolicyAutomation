// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.stats;

import android.app.Service;
import android.content.*;
import android.util.Log;
import com.google.android.gms.common.util.ClientLibraryUtils;
import java.util.Collections;
import java.util.List;

public class ConnectionTracker
{

	private ConnectionTracker()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		zzyi = Collections.EMPTY_LIST;
	//    2    4:aload_0         
	//    3    5:getstatic       #31  <Field List Collections.EMPTY_LIST>
	//    4    8:putfield        #33  <Field List zzyi>
		zzyj = Collections.EMPTY_LIST;
	//    5   11:aload_0         
	//    6   12:getstatic       #31  <Field List Collections.EMPTY_LIST>
	//    7   15:putfield        #35  <Field List zzyj>
		zzyk = Collections.EMPTY_LIST;
	//    8   18:aload_0         
	//    9   19:getstatic       #31  <Field List Collections.EMPTY_LIST>
	//   10   22:putfield        #37  <Field List zzyk>
		zzyl = Collections.EMPTY_LIST;
	//   11   25:aload_0         
	//   12   26:getstatic       #31  <Field List Collections.EMPTY_LIST>
	//   13   29:putfield        #39  <Field List zzyl>
	//   14   32:return          
	}

	public static ConnectionTracker getInstance()
	{
		if(zzyg == null)
	//*   0    0:getstatic       #43  <Field ConnectionTracker zzyg>
	//*   1    3:ifnonnull       38
			synchronized(zztm)
	//*   2    6:getstatic       #25  <Field Object zztm>
	//*   3    9:astore_0        
	//*   4   10:aload_0         
	//*   5   11:monitorenter    
			{
				if(zzyg == null)
	//*   6   12:getstatic       #43  <Field ConnectionTracker zzyg>
	//*   7   15:ifnonnull       28
					zzyg = new ConnectionTracker();
	//    8   18:new             #2   <Class ConnectionTracker>
	//    9   21:dup             
	//   10   22:invokespecial   #44  <Method void ConnectionTracker()>
	//   11   25:putstatic       #43  <Field ConnectionTracker zzyg>
			}
	//   12   28:aload_0         
	//   13   29:monitorexit     
		break MISSING_BLOCK_LABEL_38;
	//   14   30:goto            38
		exception;
	//   15   33:astore_1        
		obj;
	//   16   34:aload_0         
		JVM INSTR monitorexit ;
	//   17   35:monitorexit     
		throw exception;
	//   18   36:aload_1         
	//   19   37:athrow          
		return zzyg;
	//   20   38:getstatic       #43  <Field ConnectionTracker zzyg>
	//   21   41:areturn         
	}

	private static boolean zza(Context context, String s, Intent intent, ServiceConnection serviceconnection, int i, boolean flag)
	{
		if(flag)
	//*   0    0:iload           5
	//*   1    2:ifeq            45
		{
			s = ((String) (intent.getComponent()));
	//    2    5:aload_2         
	//    3    6:invokevirtual   #55  <Method ComponentName Intent.getComponent()>
	//    4    9:astore_1        
			if(s == null)
	//*   5   10:aload_1         
	//*   6   11:ifnonnull       20
				flag = false;
	//    7   14:iconst_0        
	//    8   15:istore          5
			else
	//*   9   17:goto            30
				flag = ClientLibraryUtils.isPackageStopped(context, ((ComponentName) (s)).getPackageName());
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #61  <Method String ComponentName.getPackageName()>
	//   13   25:invokestatic    #67  <Method boolean ClientLibraryUtils.isPackageStopped(Context, String)>
	//   14   28:istore          5
			if(flag)
	//*  15   30:iload           5
	//*  16   32:ifeq            45
			{
				Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
	//   17   35:ldc1            #69  <String "ConnectionTracker">
	//   18   37:ldc1            #71  <String "Attempted to bind to a service in a STOPPED package.">
	//   19   39:invokestatic    #77  <Method int Log.w(String, String)>
	//   20   42:pop             
				return false;
	//   21   43:iconst_0        
	//   22   44:ireturn         
			}
		}
		return context.bindService(intent, serviceconnection, i);
	//   23   45:aload_0         
	//   24   46:aload_2         
	//   25   47:aload_3         
	//   26   48:iload           4
	//   27   50:invokevirtual   #83  <Method boolean Context.bindService(Intent, ServiceConnection, int)>
	//   28   53:ireturn         
	}

	public boolean bindService(Context context, Intent intent, ServiceConnection serviceconnection, int i)
	{
		return bindService(context, ((Object) (context)).getClass().getName(), intent, serviceconnection, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #89  <Method Class Object.getClass()>
	//    4    6:invokevirtual   #94  <Method String Class.getName()>
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:iload           4
	//    8   13:invokevirtual   #97  <Method boolean bindService(Context, String, Intent, ServiceConnection, int)>
	//    9   16:ireturn         
	}

	public boolean bindService(Context context, String s, Intent intent, ServiceConnection serviceconnection, int i)
	{
		return zza(context, s, intent, serviceconnection, i, true);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:iload           5
	//    5    7:iconst_1        
	//    6    8:invokestatic    #99  <Method boolean zza(Context, String, Intent, ServiceConnection, int, boolean)>
	//    7   11:ireturn         
	}

	public boolean bindServiceAllowStoppedPackages(Context context, String s, Intent intent, ServiceConnection serviceconnection, int i)
	{
		return zza(context, s, intent, serviceconnection, i, false);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:iload           5
	//    5    7:iconst_0        
	//    6    8:invokestatic    #99  <Method boolean zza(Context, String, Intent, ServiceConnection, int, boolean)>
	//    7   11:ireturn         
	}

	public void logConnectService(Context context, ServiceConnection serviceconnection, String s, Intent intent)
	{
	//    0    0:return          
	}

	public void logDisconnectService(Context context, ServiceConnection serviceconnection)
	{
	//    0    0:return          
	}

	public void logStartService(Service service, int i)
	{
	//    0    0:return          
	}

	public void logStopService(Service service, int i)
	{
	//    0    0:return          
	}

	public void unbindService(Context context, ServiceConnection serviceconnection)
	{
		context.unbindService(serviceconnection);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #111 <Method void Context.unbindService(ServiceConnection)>
	//    3    5:return          
	}

	private static final Object zztm = new Object();
	private static volatile ConnectionTracker zzyg;
	private static boolean zzyh = false;
	private final List zzyi;
	private final List zzyj;
	private final List zzyk;
	private final List zzyl;

	static 
	{
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void Object()>
	//    3    7:putstatic       #25  <Field Object zztm>
	//*   4   10:return          
	}
}
