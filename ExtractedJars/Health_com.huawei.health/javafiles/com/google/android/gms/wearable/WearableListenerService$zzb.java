// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable;

import android.os.*;
import android.util.Log;

// Referenced classes of package com.google.android.gms.wearable:
//			WearableListenerService

final class WearableListenerService$zzb extends Handler
{

	private void zzUi()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!started)
			break MISSING_BLOCK_LABEL_12;
	//    2    2:aload_0         
	//    3    3:getfield        #35  <Field boolean started>
	//    4    6:ifeq            12
		this;
	//    5    9:aload_0         
		JVM INSTR monitorexit ;
	//    6   10:monitorexit     
		return;
	//    7   11:return          
		if(Log.isLoggable("WearableLS", 2))
	//*   8   12:ldc1            #37  <String "WearableLS">
	//*   9   14:iconst_2        
	//*  10   15:invokestatic    #43  <Method boolean Log.isLoggable(String, int)>
	//*  11   18:ifeq            67
		{
			String s = String.valueOf(((Object) (WearableListenerService.zza(zzbTl))));
	//   12   21:aload_0         
	//   13   22:getfield        #17  <Field WearableListenerService zzbTl>
	//   14   25:invokestatic    #47  <Method android.content.ComponentName WearableListenerService.zza(WearableListenerService)>
	//   15   28:invokestatic    #53  <Method String String.valueOf(Object)>
	//   16   31:astore_1        
			Log.v("WearableLS", (new StringBuilder(String.valueOf(((Object) (s))).length() + 13)).append("bindService: ").append(s).toString());
	//   17   32:ldc1            #37  <String "WearableLS">
	//   18   34:new             #55  <Class StringBuilder>
	//   19   37:dup             
	//   20   38:aload_1         
	//   21   39:invokestatic    #53  <Method String String.valueOf(Object)>
	//   22   42:invokevirtual   #59  <Method int String.length()>
	//   23   45:bipush          13
	//   24   47:iadd            
	//   25   48:invokespecial   #62  <Method void StringBuilder(int)>
	//   26   51:ldc1            #64  <String "bindService: ">
	//   27   53:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   28   56:aload_1         
	//   29   57:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   30   60:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   31   63:invokestatic    #76  <Method int Log.v(String, String)>
	//   32   66:pop             
		}
		zzbTl.bindService(WearableListenerService.zzb(zzbTl), ((android.content.ServiceConnection) (zzbTk)), 1);
	//   33   67:aload_0         
	//   34   68:getfield        #17  <Field WearableListenerService zzbTl>
	//   35   71:aload_0         
	//   36   72:getfield        #17  <Field WearableListenerService zzbTl>
	//   37   75:invokestatic    #79  <Method android.content.Intent WearableListenerService.zzb(WearableListenerService)>
	//   38   78:aload_0         
	//   39   79:getfield        #27  <Field WearableListenerService$zza zzbTk>
	//   40   82:iconst_1        
	//   41   83:invokevirtual   #83  <Method boolean WearableListenerService.bindService(android.content.Intent, android.content.ServiceConnection, int)>
	//   42   86:pop             
		started = true;
	//   43   87:aload_0         
	//   44   88:iconst_1        
	//   45   89:putfield        #35  <Field boolean started>
		this;
	//   46   92:aload_0         
		JVM INSTR monitorexit ;
	//   47   93:monitorexit     
		return;
	//   48   94:return          
		Exception exception;
		exception;
	//   49   95:astore_1        
	//*  50   96:aload_0         
		throw exception;
	//   51   97:monitorexit     
	//   52   98:aload_1         
	//   53   99:athrow          
	}

	private void zzio(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(started)
			break MISSING_BLOCK_LABEL_12;
	//    2    2:aload_0         
	//    3    3:getfield        #35  <Field boolean started>
	//    4    6:ifne            12
		this;
	//    5    9:aload_0         
		JVM INSTR monitorexit ;
	//    6   10:monitorexit     
		return;
	//    7   11:return          
		if(Log.isLoggable("WearableLS", 2))
	//*   8   12:ldc1            #37  <String "WearableLS">
	//*   9   14:iconst_2        
	//*  10   15:invokestatic    #43  <Method boolean Log.isLoggable(String, int)>
	//*  11   18:ifeq            86
		{
			String s1 = String.valueOf(((Object) (WearableListenerService.zza(zzbTl))));
	//   12   21:aload_0         
	//   13   22:getfield        #17  <Field WearableListenerService zzbTl>
	//   14   25:invokestatic    #47  <Method android.content.ComponentName WearableListenerService.zza(WearableListenerService)>
	//   15   28:invokestatic    #53  <Method String String.valueOf(Object)>
	//   16   31:astore_3        
			int i = String.valueOf(((Object) (s))).length();
	//   17   32:aload_1         
	//   18   33:invokestatic    #53  <Method String String.valueOf(Object)>
	//   19   36:invokevirtual   #59  <Method int String.length()>
	//   20   39:istore_2        
			Log.v("WearableLS", (new StringBuilder(String.valueOf(((Object) (s1))).length() + (i + 17))).append("unbindService: ").append(s).append(", ").append(s1).toString());
	//   21   40:ldc1            #37  <String "WearableLS">
	//   22   42:new             #55  <Class StringBuilder>
	//   23   45:dup             
	//   24   46:aload_3         
	//   25   47:invokestatic    #53  <Method String String.valueOf(Object)>
	//   26   50:invokevirtual   #59  <Method int String.length()>
	//   27   53:iload_2         
	//   28   54:bipush          17
	//   29   56:iadd            
	//   30   57:iadd            
	//   31   58:invokespecial   #62  <Method void StringBuilder(int)>
	//   32   61:ldc1            #90  <String "unbindService: ">
	//   33   63:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   34   66:aload_1         
	//   35   67:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   36   70:ldc1            #92  <String ", ">
	//   37   72:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   38   75:aload_3         
	//   39   76:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   40   79:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   41   82:invokestatic    #76  <Method int Log.v(String, String)>
	//   42   85:pop             
		}
		try
		{
			zzbTl.unbindService(((android.content.ServiceConnection) (zzbTk)));
	//   43   86:aload_0         
	//   44   87:getfield        #17  <Field WearableListenerService zzbTl>
	//   45   90:aload_0         
	//   46   91:getfield        #27  <Field WearableListenerService$zza zzbTk>
	//   47   94:invokevirtual   #96  <Method void WearableListenerService.unbindService(android.content.ServiceConnection)>
			break MISSING_BLOCK_LABEL_110;
	//   48   97:goto            110
		}
		// Misplaced declaration of an exception variable
		catch(String s) { }
	//   49  100:astore_1        
		Log.e("WearableLS", "Exception when unbinding from local service", ((Throwable) (s)));
	//   50  101:ldc1            #37  <String "WearableLS">
	//   51  103:ldc1            #98  <String "Exception when unbinding from local service">
	//   52  105:aload_1         
	//   53  106:invokestatic    #102 <Method int Log.e(String, String, Throwable)>
	//   54  109:pop             
		started = false;
	//   55  110:aload_0         
	//   56  111:iconst_0        
	//   57  112:putfield        #35  <Field boolean started>
		this;
	//   58  115:aload_0         
		JVM INSTR monitorexit ;
	//   59  116:monitorexit     
		return;
	//   60  117:return          
		s;
	//   61  118:astore_1        
	//*  62  119:aload_0         
		throw s;
	//   63  120:monitorexit     
	//   64  121:aload_1         
	//   65  122:athrow          
	}

	public void dispatchMessage(Message message)
	{
		zzUi();
	//    0    0:aload_0         
	//    1    1:invokespecial   #106 <Method void zzUi()>
		super.dispatchMessage(message);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #108 <Method void Handler.dispatchMessage(Message)>
		if(!hasMessages(0))
	//*   5    9:aload_0         
	//*   6   10:iconst_0        
	//*   7   11:invokevirtual   #112 <Method boolean hasMessages(int)>
	//*   8   14:ifne            41
		{
			zzio("dispatch");
	//    9   17:aload_0         
	//   10   18:ldc1            #114 <String "dispatch">
	//   11   20:invokespecial   #116 <Method void zzio(String)>
			return;
	//   12   23:return          
		} else
	//*  13   24:astore_1        
	//*  14   25:aload_0         
	//*  15   26:iconst_0        
	//*  16   27:invokevirtual   #112 <Method boolean hasMessages(int)>
	//*  17   30:ifne            39
	//*  18   33:aload_0         
	//*  19   34:ldc1            #114 <String "dispatch">
	//*  20   36:invokespecial   #116 <Method void zzio(String)>
	//*  21   39:aload_1         
	//*  22   40:athrow          
		{
			return;
	//   23   41:return          
		}
		message;
		if(!hasMessages(0))
			zzio("dispatch");
		throw message;
	}

	void quit()
	{
		getLooper().quit();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #121 <Method Looper getLooper()>
	//    2    4:invokevirtual   #125 <Method void Looper.quit()>
		zzio("quit");
	//    3    7:aload_0         
	//    4    8:ldc1            #126 <String "quit">
	//    5   10:invokespecial   #116 <Method void zzio(String)>
	//    6   13:return          
	}

	private boolean started;
	private final WearableListenerService$zza zzbTk;
	final WearableListenerService zzbTl;

	WearableListenerService$zzb(WearableListenerService wearablelistenerservice, Looper looper)
	{
		zzbTl = wearablelistenerservice;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field WearableListenerService zzbTl>
		super(looper);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #20  <Method void Handler(Looper)>
		zzbTk = new WearableListenerService$zza(zzbTl, ((WearableListenerService._cls1) (null)));
	//    6   10:aload_0         
	//    7   11:new             #22  <Class WearableListenerService$zza>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:getfield        #17  <Field WearableListenerService zzbTl>
	//   11   19:aconst_null     
	//   12   20:invokespecial   #25  <Method void WearableListenerService$zza(WearableListenerService, WearableListenerService$1)>
	//   13   23:putfield        #27  <Field WearableListenerService$zza zzbTk>
	//   14   26:return          
	}
}
