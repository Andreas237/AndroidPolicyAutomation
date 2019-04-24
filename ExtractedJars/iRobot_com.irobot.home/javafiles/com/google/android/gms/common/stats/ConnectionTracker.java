// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.stats;

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
	//    1    1:invokespecial   #24  <Method void Object()>
		zzfc = Collections.EMPTY_LIST;
	//    2    4:aload_0         
	//    3    5:getstatic       #32  <Field List Collections.EMPTY_LIST>
	//    4    8:putfield        #34  <Field List zzfc>
		zzfd = Collections.EMPTY_LIST;
	//    5   11:aload_0         
	//    6   12:getstatic       #32  <Field List Collections.EMPTY_LIST>
	//    7   15:putfield        #36  <Field List zzfd>
		zzfe = Collections.EMPTY_LIST;
	//    8   18:aload_0         
	//    9   19:getstatic       #32  <Field List Collections.EMPTY_LIST>
	//   10   22:putfield        #38  <Field List zzfe>
		zzff = Collections.EMPTY_LIST;
	//   11   25:aload_0         
	//   12   26:getstatic       #32  <Field List Collections.EMPTY_LIST>
	//   13   29:putfield        #40  <Field List zzff>
	//   14   32:return          
	}

	public static ConnectionTracker getInstance()
	{
		if(zzfa == null)
	//*   0    0:getstatic       #44  <Field ConnectionTracker zzfa>
	//*   1    3:ifnonnull       38
			synchronized(zzdp)
	//*   2    6:getstatic       #26  <Field Object zzdp>
	//*   3    9:astore_0        
	//*   4   10:aload_0         
	//*   5   11:monitorenter    
			{
				if(zzfa == null)
	//*   6   12:getstatic       #44  <Field ConnectionTracker zzfa>
	//*   7   15:ifnonnull       28
					zzfa = new ConnectionTracker();
	//    8   18:new             #2   <Class ConnectionTracker>
	//    9   21:dup             
	//   10   22:invokespecial   #45  <Method void ConnectionTracker()>
	//   11   25:putstatic       #44  <Field ConnectionTracker zzfa>
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
		return zzfa;
	//   20   38:getstatic       #44  <Field ConnectionTracker zzfa>
	//   21   41:areturn         
	}

	public boolean bindService(Context context, Intent intent, ServiceConnection serviceconnection, int i)
	{
		return zza(context, ((Object) (context)).getClass().getName(), intent, serviceconnection, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #52  <Method Class Object.getClass()>
	//    4    6:invokevirtual   #58  <Method String Class.getName()>
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:iload           4
	//    8   13:invokevirtual   #62  <Method boolean zza(Context, String, Intent, ServiceConnection, int)>
	//    9   16:ireturn         
	}

	public void unbindService(Context context, ServiceConnection serviceconnection)
	{
		context.unbindService(serviceconnection);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #72  <Method void Context.unbindService(ServiceConnection)>
	//    3    5:return          
	}

	public final boolean zza(Context context, String s, Intent intent, ServiceConnection serviceconnection, int i)
	{
		s = ((String) (intent.getComponent()));
	//    0    0:aload_3         
	//    1    1:invokevirtual   #78  <Method ComponentName Intent.getComponent()>
	//    2    4:astore_2        
		boolean flag;
		if(s == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       15
			flag = false;
	//    5    9:iconst_0        
	//    6   10:istore          6
		else
	//*   7   12:goto            25
			flag = ClientLibraryUtils.zzc(context, ((ComponentName) (s)).getPackageName());
	//    8   15:aload_1         
	//    9   16:aload_2         
	//   10   17:invokevirtual   #83  <Method String ComponentName.getPackageName()>
	//   11   20:invokestatic    #89  <Method boolean ClientLibraryUtils.zzc(Context, String)>
	//   12   23:istore          6
		if(flag)
	//*  13   25:iload           6
	//*  14   27:ifeq            40
		{
			Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
	//   15   30:ldc1            #91  <String "ConnectionTracker">
	//   16   32:ldc1            #93  <String "Attempted to bind to a service in a STOPPED package.">
	//   17   34:invokestatic    #99  <Method int Log.w(String, String)>
	//   18   37:pop             
			return false;
	//   19   38:iconst_0        
	//   20   39:ireturn         
		} else
		{
			return context.bindService(intent, serviceconnection, i);
	//   21   40:aload_1         
	//   22   41:aload_3         
	//   23   42:aload           4
	//   24   44:iload           5
	//   25   46:invokevirtual   #102 <Method boolean Context.bindService(Intent, ServiceConnection, int)>
	//   26   49:ireturn         
		}
	}

	private static final Object zzdp = new Object();
	private static volatile ConnectionTracker zzfa;
	private static boolean zzfb = false;
	private final List zzfc;
	private final List zzfd;
	private final List zzfe;
	private final List zzff;

	static 
	{
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void Object()>
	//    3    7:putstatic       #26  <Field Object zzdp>
	//*   4   10:return          
	}
}
