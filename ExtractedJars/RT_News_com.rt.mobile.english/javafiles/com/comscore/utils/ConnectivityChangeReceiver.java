// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.utils;

import android.content.*;
import android.os.SystemClock;
import com.comscore.analytics.Core;
import com.comscore.applications.KeepAlive;
import com.comscore.utils.task.TaskExecutor;
import java.util.HashSet;

// Referenced classes of package com.comscore.utils:
//			CSLog, TransmissionMode, a, Connectivity, 
//			Utils

public class ConnectivityChangeReceiver extends BroadcastReceiver
{

	public ConnectivityChangeReceiver(Core core)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void BroadcastReceiver()>
		e = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #23  <Field Runnable e>
		a = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #25  <Field boolean a>
		b = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #27  <Field boolean b>
		c = -1L;
	//   11   19:aload_0         
	//   12   20:ldc2w           #28  <Long -1L>
	//   13   23:putfield        #31  <Field long c>
		d = null;
	//   14   26:aload_0         
	//   15   27:aconst_null     
	//   16   28:putfield        #33  <Field HashSet d>
		f = core;
	//   17   31:aload_0         
	//   18   32:aload_1         
	//   19   33:putfield        #35  <Field Core f>
		d = new HashSet();
	//   20   36:aload_0         
	//   21   37:new             #37  <Class HashSet>
	//   22   40:dup             
	//   23   41:invokespecial   #38  <Method void HashSet()>
	//   24   44:putfield        #33  <Field HashSet d>
	//   25   47:return          
	}

	protected void a()
	{
		if(!f.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Core f>
	//*   2    4:invokevirtual   #45  <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		CSLog.d(((Object) (this)), "onConnectedWifi()");
	//    5   11:aload_0         
	//    6   12:ldc1            #47  <String "onConnectedWifi()">
	//    7   14:invokestatic    #52  <Method void CSLog.d(Object, String)>
		a(b(f.getAppContext()));
	//    8   17:aload_0         
	//    9   18:aload_0         
	//   10   19:aload_0         
	//   11   20:getfield        #35  <Field Core f>
	//   12   23:invokevirtual   #56  <Method Context Core.getAppContext()>
	//   13   26:invokevirtual   #59  <Method String b(Context)>
	//   14   29:invokevirtual   #62  <Method void a(String)>
		if(f.getOfflineTransmissionMode() != TransmissionMode.NEVER && f.getOfflineTransmissionMode() != TransmissionMode.DISABLED && !a)
	//*  15   32:aload_0         
	//*  16   33:getfield        #35  <Field Core f>
	//*  17   36:invokevirtual   #66  <Method TransmissionMode Core.getOfflineTransmissionMode()>
	//*  18   39:getstatic       #72  <Field TransmissionMode TransmissionMode.NEVER>
	//*  19   42:if_acmpeq       75
	//*  20   45:aload_0         
	//*  21   46:getfield        #35  <Field Core f>
	//*  22   49:invokevirtual   #66  <Method TransmissionMode Core.getOfflineTransmissionMode()>
	//*  23   52:getstatic       #75  <Field TransmissionMode TransmissionMode.DISABLED>
	//*  24   55:if_acmpeq       75
	//*  25   58:aload_0         
	//*  26   59:getfield        #25  <Field boolean a>
	//*  27   62:ifne            75
		{
			a = true;
	//   28   65:aload_0         
	//   29   66:iconst_1        
	//   30   67:putfield        #25  <Field boolean a>
			a(false);
	//   31   70:aload_0         
	//   32   71:iconst_0        
	//   33   72:invokevirtual   #78  <Method void a(boolean)>
		}
	//   34   75:return          
	}

	protected void a(long l)
	{
		if(!f.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Core f>
	//*   2    4:invokevirtual   #45  <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
		{
			return;
	//    4   10:return          
		} else
		{
			e = ((Runnable) (new a(this)));
	//    5   11:aload_0         
	//    6   12:new             #81  <Class a>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:invokespecial   #84  <Method void a(ConnectivityChangeReceiver)>
	//   10   20:putfield        #23  <Field Runnable e>
			f.getTaskExecutor().execute(e, l);
	//   11   23:aload_0         
	//   12   24:getfield        #35  <Field Core f>
	//   13   27:invokevirtual   #88  <Method TaskExecutor Core.getTaskExecutor()>
	//   14   30:aload_0         
	//   15   31:getfield        #23  <Field Runnable e>
	//   16   34:lload_1         
	//   17   35:invokevirtual   #94  <Method boolean TaskExecutor.execute(Runnable, long)>
	//   18   38:pop             
			return;
	//   19   39:return          
		}
	}

	protected void a(Context context)
	{
		if(!f.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Core f>
	//*   2    4:invokevirtual   #45  <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		CSLog.d(((Object) (this)), "onConnectedMobile()");
	//    5   11:aload_0         
	//    6   12:ldc1            #97  <String "onConnectedMobile()">
	//    7   14:invokestatic    #52  <Method void CSLog.d(Object, String)>
		a("|||cs_3g|||");
	//    8   17:aload_0         
	//    9   18:ldc1            #99  <String "|||cs_3g|||">
	//   10   20:invokevirtual   #62  <Method void a(String)>
		if((f.getOfflineTransmissionMode() == TransmissionMode.DEFAULT || f.getOfflineTransmissionMode() == TransmissionMode.PIGGYBACK && Connectivity.isDataConnected(context)) && !a)
	//*  11   23:aload_0         
	//*  12   24:getfield        #35  <Field Core f>
	//*  13   27:invokevirtual   #66  <Method TransmissionMode Core.getOfflineTransmissionMode()>
	//*  14   30:getstatic       #102 <Field TransmissionMode TransmissionMode.DEFAULT>
	//*  15   33:if_acmpeq       56
	//*  16   36:aload_0         
	//*  17   37:getfield        #35  <Field Core f>
	//*  18   40:invokevirtual   #66  <Method TransmissionMode Core.getOfflineTransmissionMode()>
	//*  19   43:getstatic       #105 <Field TransmissionMode TransmissionMode.PIGGYBACK>
	//*  20   46:if_acmpne       73
	//*  21   49:aload_1         
	//*  22   50:invokestatic    #111 <Method boolean Connectivity.isDataConnected(Context)>
	//*  23   53:ifeq            73
	//*  24   56:aload_0         
	//*  25   57:getfield        #25  <Field boolean a>
	//*  26   60:ifne            73
		{
			a = true;
	//   27   63:aload_0         
	//   28   64:iconst_1        
	//   29   65:putfield        #25  <Field boolean a>
			a(false);
	//   30   68:aload_0         
	//   31   69:iconst_0        
	//   32   70:invokevirtual   #78  <Method void a(boolean)>
		}
	//   33   73:return          
	}

	protected void a(String s)
	{
		if(!f.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Core f>
	//*   2    4:invokevirtual   #45  <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		if(Utils.isNotEmpty(s) && d != null && !d.contains(((Object) (s))))
	//*   5   11:aload_1         
	//*   6   12:invokestatic    #117 <Method boolean Utils.isNotEmpty(String)>
	//*   7   15:ifeq            59
	//*   8   18:aload_0         
	//*   9   19:getfield        #33  <Field HashSet d>
	//*  10   22:ifnull          59
	//*  11   25:aload_0         
	//*  12   26:getfield        #33  <Field HashSet d>
	//*  13   29:aload_1         
	//*  14   30:invokevirtual   #121 <Method boolean HashSet.contains(Object)>
	//*  15   33:ifne            59
		{
			if(d.size() != 0)
	//*  16   36:aload_0         
	//*  17   37:getfield        #33  <Field HashSet d>
	//*  18   40:invokevirtual   #125 <Method int HashSet.size()>
	//*  19   43:ifeq            50
				d();
	//   20   46:aload_0         
	//   21   47:invokevirtual   #127 <Method void d()>
			d.add(((Object) (s)));
	//   22   50:aload_0         
	//   23   51:getfield        #33  <Field HashSet d>
	//   24   54:aload_1         
	//   25   55:invokevirtual   #130 <Method boolean HashSet.add(Object)>
	//   26   58:pop             
		}
	//   27   59:return          
	}

	protected void a(boolean flag)
	{
		if(!f.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Core f>
	//*   2    4:invokevirtual   #45  <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		if(b)
	//*   5   11:aload_0         
	//*   6   12:getfield        #27  <Field boolean b>
	//*   7   15:ifeq            106
		{
			c();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #132 <Method void c()>
			if(c < SystemClock.uptimeMillis() || c < 0L || !flag)
	//*  10   22:aload_0         
	//*  11   23:getfield        #31  <Field long c>
	//*  12   26:invokestatic    #138 <Method long SystemClock.uptimeMillis()>
	//*  13   29:lcmp            
	//*  14   30:iflt            46
	//*  15   33:aload_0         
	//*  16   34:getfield        #31  <Field long c>
	//*  17   37:lconst_0        
	//*  18   38:lcmp            
	//*  19   39:iflt            46
	//*  20   42:iload_1         
	//*  21   43:ifne            57
				c = SystemClock.uptimeMillis() + 30000L;
	//   22   46:aload_0         
	//   23   47:invokestatic    #138 <Method long SystemClock.uptimeMillis()>
	//   24   50:ldc2w           #139 <Long 30000L>
	//   25   53:ladd            
	//   26   54:putfield        #31  <Field long c>
			a(c - SystemClock.uptimeMillis());
	//   27   57:aload_0         
	//   28   58:aload_0         
	//   29   59:getfield        #31  <Field long c>
	//   30   62:invokestatic    #138 <Method long SystemClock.uptimeMillis()>
	//   31   65:lsub            
	//   32   66:invokevirtual   #142 <Method void a(long)>
			StringBuilder stringbuilder = new StringBuilder();
	//   33   69:new             #144 <Class StringBuilder>
	//   34   72:dup             
	//   35   73:invokespecial   #145 <Method void StringBuilder()>
	//   36   76:astore_2        
			stringbuilder.append("scheduleFlushTask(): Flushing in ");
	//   37   77:aload_2         
	//   38   78:ldc1            #147 <String "scheduleFlushTask(): Flushing in ">
	//   39   80:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   40   83:pop             
			stringbuilder.append(c - SystemClock.uptimeMillis());
	//   41   84:aload_2         
	//   42   85:aload_0         
	//   43   86:getfield        #31  <Field long c>
	//   44   89:invokestatic    #138 <Method long SystemClock.uptimeMillis()>
	//   45   92:lsub            
	//   46   93:invokevirtual   #154 <Method StringBuilder StringBuilder.append(long)>
	//   47   96:pop             
			CSLog.d(((Object) (this)), stringbuilder.toString());
	//   48   97:aload_0         
	//   49   98:aload_2         
	//   50   99:invokevirtual   #158 <Method String StringBuilder.toString()>
	//   51  102:invokestatic    #52  <Method void CSLog.d(Object, String)>
			return;
	//   52  105:return          
		}
		if(c < 0L)
	//*  53  106:aload_0         
	//*  54  107:getfield        #31  <Field long c>
	//*  55  110:lconst_0        
	//*  56  111:lcmp            
	//*  57  112:ifge            126
			c = SystemClock.uptimeMillis() + 30000L;
	//   58  115:aload_0         
	//   59  116:invokestatic    #138 <Method long SystemClock.uptimeMillis()>
	//   60  119:ldc2w           #139 <Long 30000L>
	//   61  122:ladd            
	//   62  123:putfield        #31  <Field long c>
	//   63  126:return          
	}

	protected String b(Context context)
	{
		return Connectivity.getCurrentSSID(context);
	//    0    0:aload_1         
	//    1    1:invokestatic    #161 <Method String Connectivity.getCurrentSSID(Context)>
	//    2    4:areturn         
	}

	protected void b()
	{
		if(!f.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Core f>
	//*   2    4:invokevirtual   #45  <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
		{
			return;
	//    4   10:return          
		} else
		{
			CSLog.d(((Object) (this)), "onDisconnected()");
	//    5   11:aload_0         
	//    6   12:ldc1            #163 <String "onDisconnected()">
	//    7   14:invokestatic    #52  <Method void CSLog.d(Object, String)>
			c();
	//    8   17:aload_0         
	//    9   18:invokevirtual   #132 <Method void c()>
			a = false;
	//   10   21:aload_0         
	//   11   22:iconst_0        
	//   12   23:putfield        #25  <Field boolean a>
			c = -1L;
	//   13   26:aload_0         
	//   14   27:ldc2w           #28  <Long -1L>
	//   15   30:putfield        #31  <Field long c>
			return;
	//   16   33:return          
		}
	}

	protected void b(boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		CSLog.d(((Object) (this)), "flushing");
	//    2    2:aload_0         
	//    3    3:ldc1            #165 <String "flushing">
	//    4    5:invokestatic    #52  <Method void CSLog.d(Object, String)>
		f.flush(flag);
	//    5    8:aload_0         
	//    6    9:getfield        #35  <Field Core f>
	//    7   12:iload_1         
	//    8   13:invokevirtual   #168 <Method void Core.flush(boolean)>
		c = -1L;
	//    9   16:aload_0         
	//   10   17:ldc2w           #28  <Long -1L>
	//   11   20:putfield        #31  <Field long c>
		this;
	//   12   23:aload_0         
		JVM INSTR monitorexit ;
	//   13   24:monitorexit     
		return;
	//   14   25:return          
		Exception exception;
		exception;
	//   15   26:astore_2        
	//*  16   27:aload_0         
		throw exception;
	//   17   28:monitorexit     
	//   18   29:aload_2         
	//   19   30:athrow          
	}

	protected void c()
	{
		if(e != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field Runnable e>
	//*   2    4:ifnull          32
		{
			CSLog.d(((Object) (this)), "cancelFlushTask()");
	//    3    7:aload_0         
	//    4    8:ldc1            #170 <String "cancelFlushTask()">
	//    5   10:invokestatic    #52  <Method void CSLog.d(Object, String)>
			f.getTaskExecutor().removeEnqueuedTask(e);
	//    6   13:aload_0         
	//    7   14:getfield        #35  <Field Core f>
	//    8   17:invokevirtual   #88  <Method TaskExecutor Core.getTaskExecutor()>
	//    9   20:aload_0         
	//   10   21:getfield        #23  <Field Runnable e>
	//   11   24:invokevirtual   #174 <Method void TaskExecutor.removeEnqueuedTask(Runnable)>
			e = null;
	//   12   27:aload_0         
	//   13   28:aconst_null     
	//   14   29:putfield        #23  <Field Runnable e>
		}
	//   15   32:return          
	}

	protected void d()
	{
		if(!f.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Core f>
	//*   2    4:invokevirtual   #45  <Method boolean Core.isEnabled()>
	//*   3    7:ifne            11
		{
			return;
	//    4   10:return          
		} else
		{
			f.getKeepAlive().reset(3000L);
	//    5   11:aload_0         
	//    6   12:getfield        #35  <Field Core f>
	//    7   15:invokevirtual   #178 <Method KeepAlive Core.getKeepAlive()>
	//    8   18:ldc2w           #179 <Long 3000L>
	//    9   21:invokevirtual   #185 <Method void KeepAlive.reset(long)>
			return;
	//   10   24:return          
		}
	}

	public void onReceive(Context context, Intent intent)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(intent.getExtras() == null)
			break MISSING_BLOCK_LABEL_42;
	//    2    2:aload_2         
	//    3    3:invokevirtual   #193 <Method android.os.Bundle Intent.getExtras()>
	//    4    6:ifnull          42
		if(Connectivity.isConnectedWiFi(context))
	//*   5    9:aload_1         
	//*   6   10:invokestatic    #196 <Method boolean Connectivity.isConnectedWiFi(Context)>
	//*   7   13:ifeq            23
		{
			a();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #198 <Method void a()>
			break MISSING_BLOCK_LABEL_42;
	//   10   20:goto            42
		}
		if(Connectivity.isConnectedMobile(context))
	//*  11   23:aload_1         
	//*  12   24:invokestatic    #201 <Method boolean Connectivity.isConnectedMobile(Context)>
	//*  13   27:ifeq            38
		{
			a(context);
	//   14   30:aload_0         
	//   15   31:aload_1         
	//   16   32:invokevirtual   #203 <Method void a(Context)>
			break MISSING_BLOCK_LABEL_42;
	//   17   35:goto            42
		}
		b();
	//   18   38:aload_0         
	//   19   39:invokevirtual   #205 <Method void b()>
		this;
	//   20   42:aload_0         
		JVM INSTR monitorexit ;
	//   21   43:monitorexit     
		return;
	//   22   44:return          
		context;
	//   23   45:astore_1        
	//*  24   46:aload_0         
		throw context;
	//   25   47:monitorexit     
	//   26   48:aload_1         
	//   27   49:athrow          
	}

	public void start()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = f.isEnabled();
	//    2    2:aload_0         
	//    3    3:getfield        #35  <Field Core f>
	//    4    6:invokevirtual   #45  <Method boolean Core.isEnabled()>
	//    5    9:istore_1        
		if(flag)
			break MISSING_BLOCK_LABEL_17;
	//    6   10:iload_1         
	//    7   11:ifne            17
		this;
	//    8   14:aload_0         
		JVM INSTR monitorexit ;
	//    9   15:monitorexit     
		return;
	//   10   16:return          
		b = true;
	//   11   17:aload_0         
	//   12   18:iconst_1        
	//   13   19:putfield        #27  <Field boolean b>
		if(a && c > 0L)
	//*  14   22:aload_0         
	//*  15   23:getfield        #25  <Field boolean a>
	//*  16   26:ifeq            43
	//*  17   29:aload_0         
	//*  18   30:getfield        #31  <Field long c>
	//*  19   33:lconst_0        
	//*  20   34:lcmp            
	//*  21   35:ifle            43
			a(true);
	//   22   38:aload_0         
	//   23   39:iconst_1        
	//   24   40:invokevirtual   #78  <Method void a(boolean)>
		this;
	//   25   43:aload_0         
		JVM INSTR monitorexit ;
	//   26   44:monitorexit     
		return;
	//   27   45:return          
		Exception exception;
		exception;
	//   28   46:astore_2        
	//*  29   47:aload_0         
		throw exception;
	//   30   48:monitorexit     
	//   31   49:aload_2         
	//   32   50:athrow          
	}

	public void stop()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		b = false;
	//    2    2:aload_0         
	//    3    3:iconst_0        
	//    4    4:putfield        #27  <Field boolean b>
		c();
	//    5    7:aload_0         
	//    6    8:invokevirtual   #132 <Method void c()>
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		Exception exception;
		exception;
	//   10   14:astore_1        
	//*  11   15:aload_0         
		throw exception;
	//   12   16:monitorexit     
	//   13   17:aload_1         
	//   14   18:athrow          
	}

	protected boolean a;
	protected boolean b;
	protected long c;
	protected HashSet d;
	private Runnable e;
	private final Core f;
}
