// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable;

import android.app.Service;
import android.content.*;
import android.os.*;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.util.zzy;
import com.google.android.gms.wearable.internal.zzbz;
import com.google.android.gms.wearable.internal.zzcc;
import com.google.android.gms.wearable.internal.zzcz;
import com.google.android.gms.wearable.internal.zzh;
import com.google.android.gms.wearable.internal.zzk;
import com.google.android.gms.wearable.internal.zzo;
import com.google.android.gms.wearable.internal.zzs;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable:
//			CapabilityInfo, Channel, DataEventBuffer, zzb, 
//			MessageEvent, zzd, Node

public abstract class WearableListenerService extends Service
	implements CapabilityApi.CapabilityListener, ChannelApi.ChannelListener, DataApi.DataListener, MessageApi.MessageListener, NodeApi.NodeListener
{
	class zza
		implements ServiceConnection
	{

		public void onServiceConnected(ComponentName componentname, IBinder ibinder)
		{
		//    0    0:return          
		}

		public void onServiceDisconnected(ComponentName componentname)
		{
		//    0    0:return          
		}

		private zza()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}

	}

	final class zzb extends Handler
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
		//   14   25:invokestatic    #47  <Method ComponentName WearableListenerService.zza(WearableListenerService)>
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
			zzbTl.bindService(WearableListenerService.zzb(zzbTl), ((ServiceConnection) (zzbTk)), 1);
		//   33   67:aload_0         
		//   34   68:getfield        #17  <Field WearableListenerService zzbTl>
		//   35   71:aload_0         
		//   36   72:getfield        #17  <Field WearableListenerService zzbTl>
		//   37   75:invokestatic    #79  <Method Intent WearableListenerService.zzb(WearableListenerService)>
		//   38   78:aload_0         
		//   39   79:getfield        #27  <Field WearableListenerService$zza zzbTk>
		//   40   82:iconst_1        
		//   41   83:invokevirtual   #83  <Method boolean WearableListenerService.bindService(Intent, ServiceConnection, int)>
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
		//   14   25:invokestatic    #47  <Method ComponentName WearableListenerService.zza(WearableListenerService)>
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
				zzbTl.unbindService(((ServiceConnection) (zzbTk)));
		//   43   86:aload_0         
		//   44   87:getfield        #17  <Field WearableListenerService zzbTl>
		//   45   90:aload_0         
		//   46   91:getfield        #27  <Field WearableListenerService$zza zzbTk>
		//   47   94:invokevirtual   #96  <Method void WearableListenerService.unbindService(ServiceConnection)>
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
		private final zza zzbTk;
		final WearableListenerService zzbTl;

		zzb(Looper looper)
		{
			zzbTl = WearableListenerService.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field WearableListenerService zzbTl>
			super(looper);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #20  <Method void Handler(Looper)>
			zzbTk = ((zza) (zzbTl)). new zza();
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

	final class zzc extends com.google.android.gms.wearable.internal.zzbv.zza
	{

		private boolean zzUj()
		{
			int i = Binder.getCallingUid();
		//    0    0:invokestatic    #50  <Method int Binder.getCallingUid()>
		//    1    3:istore_1        
			if(i == zzbTm)
		//*   2    4:iload_1         
		//*   3    5:aload_0         
		//*   4    6:getfield        #38  <Field int zzbTm>
		//*   5    9:icmpne          14
				return true;
		//    6   12:iconst_1        
		//    7   13:ireturn         
			if(zzcz.zzck(((android.content.Context) (zzbTl))).zziq("com.google.android.wearable.app.cn") && zzy.zzc(((android.content.Context) (zzbTl)), i, "com.google.android.wearable.app.cn"))
		//*   8   14:aload_0         
		//*   9   15:getfield        #33  <Field WearableListenerService zzbTl>
		//*  10   18:invokestatic    #56  <Method zzcz zzcz.zzck(android.content.Context)>
		//*  11   21:ldc1            #58  <String "com.google.android.wearable.app.cn">
		//*  12   23:invokevirtual   #62  <Method boolean zzcz.zziq(String)>
		//*  13   26:ifeq            49
		//*  14   29:aload_0         
		//*  15   30:getfield        #33  <Field WearableListenerService zzbTl>
		//*  16   33:iload_1         
		//*  17   34:ldc1            #58  <String "com.google.android.wearable.app.cn">
		//*  18   36:invokestatic    #67  <Method boolean zzy.zzc(android.content.Context, int, String)>
		//*  19   39:ifeq            49
			{
				zzbTm = i;
		//   20   42:aload_0         
		//   21   43:iload_1         
		//   22   44:putfield        #38  <Field int zzbTm>
				return true;
		//   23   47:iconst_1        
		//   24   48:ireturn         
			}
			if(zzy.zzf(((android.content.Context) (zzbTl)), i))
		//*  25   49:aload_0         
		//*  26   50:getfield        #33  <Field WearableListenerService zzbTl>
		//*  27   53:iload_1         
		//*  28   54:invokestatic    #71  <Method boolean zzy.zzf(android.content.Context, int)>
		//*  29   57:ifeq            67
			{
				zzbTm = i;
		//   30   60:aload_0         
		//   31   61:iload_1         
		//   32   62:putfield        #38  <Field int zzbTm>
				return true;
		//   33   65:iconst_1        
		//   34   66:ireturn         
			} else
			{
				Log.e("WearableLS", (new StringBuilder(57)).append("Caller is not GooglePlayServices; caller UID: ").append(i).toString());
		//   35   67:ldc1            #73  <String "WearableLS">
		//   36   69:new             #75  <Class StringBuilder>
		//   37   72:dup             
		//   38   73:bipush          57
		//   39   75:invokespecial   #78  <Method void StringBuilder(int)>
		//   40   78:ldc1            #80  <String "Caller is not GooglePlayServices; caller UID: ">
		//   41   80:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
		//   42   83:iload_1         
		//   43   84:invokevirtual   #87  <Method StringBuilder StringBuilder.append(int)>
		//   44   87:invokevirtual   #91  <Method String StringBuilder.toString()>
		//   45   90:invokestatic    #97  <Method int Log.e(String, String)>
		//   46   93:pop             
				return false;
		//   47   94:iconst_0        
		//   48   95:ireturn         
			}
		}

		private boolean zza(Runnable runnable, String s, Object obj)
		{
			if(Log.isLoggable("WearableLS", 3))
		//*   0    0:ldc1            #73  <String "WearableLS">
		//*   1    2:iconst_3        
		//*   2    3:invokestatic    #103 <Method boolean Log.isLoggable(String, int)>
		//*   3    6:ifeq            45
				Log.d("WearableLS", String.format("%s: %s %s", new Object[] {
					s, WearableListenerService.zza(zzbTl).toString(), obj
				}));
		//    4    9:ldc1            #73  <String "WearableLS">
		//    5   11:ldc1            #105 <String "%s: %s %s">
		//    6   13:iconst_3        
		//    7   14:anewarray       Object[]
		//    8   17:dup             
		//    9   18:iconst_0        
		//   10   19:aload_2         
		//   11   20:aastore         
		//   12   21:dup             
		//   13   22:iconst_1        
		//   14   23:aload_0         
		//   15   24:getfield        #33  <Field WearableListenerService zzbTl>
		//   16   27:invokestatic    #110 <Method ComponentName WearableListenerService.zza(WearableListenerService)>
		//   17   30:invokevirtual   #113 <Method String ComponentName.toString()>
		//   18   33:aastore         
		//   19   34:dup             
		//   20   35:iconst_2        
		//   21   36:aload_3         
		//   22   37:aastore         
		//   23   38:invokestatic    #119 <Method String String.format(String, Object[])>
		//   24   41:invokestatic    #122 <Method int Log.d(String, String)>
		//   25   44:pop             
			if(!zzUj())
		//*  26   45:aload_0         
		//*  27   46:invokespecial   #124 <Method boolean zzUj()>
		//*  28   49:ifne            54
				return false;
		//   29   52:iconst_0        
		//   30   53:ireturn         
			s = ((String) (WearableListenerService.zzc(zzbTl)));
		//   31   54:aload_0         
		//   32   55:getfield        #33  <Field WearableListenerService zzbTl>
		//   33   58:invokestatic    #127 <Method Object WearableListenerService.zzc(WearableListenerService)>
		//   34   61:astore_2        
			s;
		//   35   62:aload_2         
			JVM INSTR monitorenter ;
		//   36   63:monitorenter    
			boolean flag = WearableListenerService.zzd(zzbTl);
		//   37   64:aload_0         
		//   38   65:getfield        #33  <Field WearableListenerService zzbTl>
		//   39   68:invokestatic    #131 <Method boolean WearableListenerService.zzd(WearableListenerService)>
		//   40   71:istore          4
			if(!flag)
				break MISSING_BLOCK_LABEL_82;
		//   41   73:iload           4
		//   42   75:ifeq            82
			s;
		//   43   78:aload_2         
			JVM INSTR monitorexit ;
		//   44   79:monitorexit     
			return false;
		//   45   80:iconst_0        
		//   46   81:ireturn         
			WearableListenerService.zze(zzbTl).post(runnable);
		//   47   82:aload_0         
		//   48   83:getfield        #33  <Field WearableListenerService zzbTl>
		//   49   86:invokestatic    #135 <Method WearableListenerService$zzb WearableListenerService.zze(WearableListenerService)>
		//   50   89:aload_1         
		//   51   90:invokevirtual   #141 <Method boolean WearableListenerService$zzb.post(Runnable)>
		//   52   93:pop             
			s;
		//   53   94:aload_2         
			JVM INSTR monitorexit ;
		//   54   95:monitorexit     
			  goto _L1
		//*  55   96:goto            104
			runnable;
		//   56   99:astore_1        
		//*  57  100:aload_2         
			throw runnable;
		//   58  101:monitorexit     
		//   59  102:aload_1         
		//   60  103:athrow          
_L1:
			return true;
		//   61  104:iconst_1        
		//   62  105:ireturn         
		}

		public void onConnectedNodes(List list)
		{
			zza(new Runnable(this, list) {

				public void run()
				{
					zzbTo.zzbTl.onConnectedNodes(zzbTr);
				//    0    0:aload_0         
				//    1    1:getfield        #22  <Field WearableListenerService$zzc zzbTo>
				//    2    4:getfield        #33  <Field WearableListenerService WearableListenerService$zzc.zzbTl>
				//    3    7:aload_0         
				//    4    8:getfield        #24  <Field List zzbTr>
				//    5   11:invokevirtual   #34  <Method void WearableListenerService.onConnectedNodes(List)>
				//    6   14:return          
				}

				final zzc zzbTo;
				final List zzbTr;

			
			{
				zzbTo = zzc1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field WearableListenerService$zzc zzbTo>
				zzbTr = list;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field List zzbTr>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
			}
, "onConnectedNodes", ((Object) (list)));
		//    0    0:aload_0         
		//    1    1:new             #17  <Class WearableListenerService$zzc$5>
		//    2    4:dup             
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #146 <Method void WearableListenerService$zzc$5(WearableListenerService$zzc, List)>
		//    6   10:ldc1            #147 <String "onConnectedNodes">
		//    7   12:aload_1         
		//    8   13:invokespecial   #149 <Method boolean zza(Runnable, String, Object)>
		//    9   16:pop             
		//   10   17:return          
		}

		public void zza(zzbz zzbz)
		{
			zza(new Runnable(this, zzbz) {

				public void run()
				{
					zzbTo.zzbTl.onMessageReceived(((MessageEvent) (zzbTp)));
				//    0    0:aload_0         
				//    1    1:getfield        #22  <Field WearableListenerService$zzc zzbTo>
				//    2    4:getfield        #33  <Field WearableListenerService WearableListenerService$zzc.zzbTl>
				//    3    7:aload_0         
				//    4    8:getfield        #24  <Field zzbz zzbTp>
				//    5   11:invokevirtual   #37  <Method void WearableListenerService.onMessageReceived(MessageEvent)>
				//    6   14:return          
				}

				final zzc zzbTo;
				final zzbz zzbTp;

			
			{
				zzbTo = zzc1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field WearableListenerService$zzc zzbTo>
				zzbTp = zzbz;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field zzbz zzbTp>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
			}
, "onMessageReceived", ((Object) (zzbz)));
		//    0    0:aload_0         
		//    1    1:new             #11  <Class WearableListenerService$zzc$2>
		//    2    4:dup             
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #155 <Method void WearableListenerService$zzc$2(WearableListenerService$zzc, zzbz)>
		//    6   10:ldc1            #157 <String "onMessageReceived">
		//    7   12:aload_1         
		//    8   13:invokespecial   #149 <Method boolean zza(Runnable, String, Object)>
		//    9   16:pop             
		//   10   17:return          
		}

		public void zza(zzcc zzcc)
		{
			zza(new Runnable(this, zzcc) {

				public void run()
				{
					zzbTo.zzbTl.onPeerConnected(((Node) (zzbTq)));
				//    0    0:aload_0         
				//    1    1:getfield        #22  <Field WearableListenerService$zzc zzbTo>
				//    2    4:getfield        #33  <Field WearableListenerService WearableListenerService$zzc.zzbTl>
				//    3    7:aload_0         
				//    4    8:getfield        #24  <Field zzcc zzbTq>
				//    5   11:invokevirtual   #37  <Method void WearableListenerService.onPeerConnected(Node)>
				//    6   14:return          
				}

				final zzc zzbTo;
				final zzcc zzbTq;

			
			{
				zzbTo = zzc1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field WearableListenerService$zzc zzbTo>
				zzbTq = zzcc;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field zzcc zzbTq>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
			}
, "onPeerConnected", ((Object) (zzcc)));
		//    0    0:aload_0         
		//    1    1:new             #13  <Class WearableListenerService$zzc$3>
		//    2    4:dup             
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #161 <Method void WearableListenerService$zzc$3(WearableListenerService$zzc, zzcc)>
		//    6   10:ldc1            #163 <String "onPeerConnected">
		//    7   12:aload_1         
		//    8   13:invokespecial   #149 <Method boolean zza(Runnable, String, Object)>
		//    9   16:pop             
		//   10   17:return          
		}

		public void zza(zzh zzh)
		{
			zza(new Runnable(this, zzh) {

				public void run()
				{
					zzbTo.zzbTl.onEntityUpdate(((com.google.android.gms.wearable.zzb) (zzbTu)));
				//    0    0:aload_0         
				//    1    1:getfield        #22  <Field WearableListenerService$zzc zzbTo>
				//    2    4:getfield        #33  <Field WearableListenerService WearableListenerService$zzc.zzbTl>
				//    3    7:aload_0         
				//    4    8:getfield        #24  <Field zzh zzbTu>
				//    5   11:invokevirtual   #37  <Method void WearableListenerService.onEntityUpdate(zzb)>
				//    6   14:return          
				}

				final zzc zzbTo;
				final zzh zzbTu;

			
			{
				zzbTo = zzc1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field WearableListenerService$zzc zzbTo>
				zzbTu = zzh;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field zzh zzbTu>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
			}
, "onEntityUpdate", ((Object) (zzh)));
		//    0    0:aload_0         
		//    1    1:new             #23  <Class WearableListenerService$zzc$8>
		//    2    4:dup             
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #167 <Method void WearableListenerService$zzc$8(WearableListenerService$zzc, zzh)>
		//    6   10:ldc1            #169 <String "onEntityUpdate">
		//    7   12:aload_1         
		//    8   13:invokespecial   #149 <Method boolean zza(Runnable, String, Object)>
		//    9   16:pop             
		//   10   17:return          
		}

		public void zza(zzk zzk)
		{
			zza(new Runnable(this, zzk) {

				public void run()
				{
					zzbTo.zzbTl.onNotificationReceived(((zzd) (zzbTt)));
				//    0    0:aload_0         
				//    1    1:getfield        #22  <Field WearableListenerService$zzc zzbTo>
				//    2    4:getfield        #33  <Field WearableListenerService WearableListenerService$zzc.zzbTl>
				//    3    7:aload_0         
				//    4    8:getfield        #24  <Field zzk zzbTt>
				//    5   11:invokevirtual   #37  <Method void WearableListenerService.onNotificationReceived(zzd)>
				//    6   14:return          
				}

				final zzc zzbTo;
				final zzk zzbTt;

			
			{
				zzbTo = zzc1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field WearableListenerService$zzc zzbTo>
				zzbTt = zzk;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field zzk zzbTt>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
			}
, "onNotificationReceived", ((Object) (zzk)));
		//    0    0:aload_0         
		//    1    1:new             #21  <Class WearableListenerService$zzc$7>
		//    2    4:dup             
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #173 <Method void WearableListenerService$zzc$7(WearableListenerService$zzc, zzk)>
		//    6   10:ldc1            #175 <String "onNotificationReceived">
		//    7   12:aload_1         
		//    8   13:invokespecial   #149 <Method boolean zza(Runnable, String, Object)>
		//    9   16:pop             
		//   10   17:return          
		}

		public void zza(zzo zzo)
		{
			zza(new Runnable(this, zzo) {

				public void run()
				{
					zzbTo.zzbTl.onCapabilityChanged(((CapabilityInfo) (zzbTs)));
				//    0    0:aload_0         
				//    1    1:getfield        #22  <Field WearableListenerService$zzc zzbTo>
				//    2    4:getfield        #33  <Field WearableListenerService WearableListenerService$zzc.zzbTl>
				//    3    7:aload_0         
				//    4    8:getfield        #24  <Field zzo zzbTs>
				//    5   11:invokevirtual   #37  <Method void WearableListenerService.onCapabilityChanged(CapabilityInfo)>
				//    6   14:return          
				}

				final zzc zzbTo;
				final zzo zzbTs;

			
			{
				zzbTo = zzc1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field WearableListenerService$zzc zzbTo>
				zzbTs = zzo;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field zzo zzbTs>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
			}
, "onConnectedCapabilityChanged", ((Object) (zzo)));
		//    0    0:aload_0         
		//    1    1:new             #19  <Class WearableListenerService$zzc$6>
		//    2    4:dup             
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #179 <Method void WearableListenerService$zzc$6(WearableListenerService$zzc, zzo)>
		//    6   10:ldc1            #181 <String "onConnectedCapabilityChanged">
		//    7   12:aload_1         
		//    8   13:invokespecial   #149 <Method boolean zza(Runnable, String, Object)>
		//    9   16:pop             
		//   10   17:return          
		}

		public void zza(zzs zzs)
		{
			zza(new Runnable(this, zzs) {

				public void run()
				{
					zzbTv.zza(((ChannelApi.ChannelListener) (zzbTo.zzbTl)));
				//    0    0:aload_0         
				//    1    1:getfield        #24  <Field zzs zzbTv>
				//    2    4:aload_0         
				//    3    5:getfield        #22  <Field WearableListenerService$zzc zzbTo>
				//    4    8:getfield        #33  <Field WearableListenerService WearableListenerService$zzc.zzbTl>
				//    5   11:invokevirtual   #38  <Method void zzs.zza(ChannelApi$ChannelListener)>
				//    6   14:return          
				}

				final zzc zzbTo;
				final zzs zzbTv;

			
			{
				zzbTo = zzc1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field WearableListenerService$zzc zzbTo>
				zzbTv = zzs1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field zzs zzbTv>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
			}
, "onChannelEvent", ((Object) (zzs)));
		//    0    0:aload_0         
		//    1    1:new             #25  <Class WearableListenerService$zzc$9>
		//    2    4:dup             
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #185 <Method void WearableListenerService$zzc$9(WearableListenerService$zzc, zzs)>
		//    6   10:ldc1            #187 <String "onChannelEvent">
		//    7   12:aload_1         
		//    8   13:invokespecial   #149 <Method boolean zza(Runnable, String, Object)>
		//    9   16:pop             
		//   10   17:return          
		}

		public void zzaq(DataHolder dataholder)
		{
			Runnable runnable = new Runnable(this, dataholder) {

				public void run()
				{
					DataEventBuffer dataeventbuffer = new DataEventBuffer(zzbTn);
				//    0    0:new             #31  <Class DataEventBuffer>
				//    1    3:dup             
				//    2    4:aload_0         
				//    3    5:getfield        #24  <Field DataHolder zzbTn>
				//    4    8:invokespecial   #33  <Method void DataEventBuffer(DataHolder)>
				//    5   11:astore_1        
					zzbTo.zzbTl.onDataChanged(dataeventbuffer);
				//    6   12:aload_0         
				//    7   13:getfield        #22  <Field WearableListenerService$zzc zzbTo>
				//    8   16:getfield        #37  <Field WearableListenerService WearableListenerService$zzc.zzbTl>
				//    9   19:aload_1         
				//   10   20:invokevirtual   #41  <Method void WearableListenerService.onDataChanged(DataEventBuffer)>
					dataeventbuffer.release();
				//   11   23:aload_1         
				//   12   24:invokevirtual   #44  <Method void DataEventBuffer.release()>
					return;
				//   13   27:return          
					Exception exception;
					exception;
				//   14   28:astore_2        
					dataeventbuffer.release();
				//   15   29:aload_1         
				//   16   30:invokevirtual   #44  <Method void DataEventBuffer.release()>
					throw exception;
				//   17   33:aload_2         
				//   18   34:athrow          
				}

				final DataHolder zzbTn;
				final zzc zzbTo;

			
			{
				zzbTo = zzc1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field WearableListenerService$zzc zzbTo>
				zzbTn = dataholder;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field DataHolder zzbTn>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
			}
;
		//    0    0:new             #9   <Class WearableListenerService$zzc$1>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokespecial   #192 <Method void WearableListenerService$zzc$1(WearableListenerService$zzc, DataHolder)>
		//    5    9:astore          4
			boolean flag;
			String s = String.valueOf(((Object) (dataholder)));
		//    6   11:aload_1         
		//    7   12:invokestatic    #196 <Method String String.valueOf(Object)>
		//    8   15:astore          5
			int i = dataholder.getCount();
		//    9   17:aload_1         
		//   10   18:invokevirtual   #201 <Method int DataHolder.getCount()>
		//   11   21:istore_2        
			flag = zza(runnable, "onDataItemChanged", ((Object) ((new StringBuilder(String.valueOf(((Object) (s))).length() + 18)).append(s).append(", rows=").append(i).toString())));
		//   12   22:aload_0         
		//   13   23:aload           4
		//   14   25:ldc1            #203 <String "onDataItemChanged">
		//   15   27:new             #75  <Class StringBuilder>
		//   16   30:dup             
		//   17   31:aload           5
		//   18   33:invokestatic    #196 <Method String String.valueOf(Object)>
		//   19   36:invokevirtual   #206 <Method int String.length()>
		//   20   39:bipush          18
		//   21   41:iadd            
		//   22   42:invokespecial   #78  <Method void StringBuilder(int)>
		//   23   45:aload           5
		//   24   47:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
		//   25   50:ldc1            #208 <String ", rows=">
		//   26   52:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
		//   27   55:iload_2         
		//   28   56:invokevirtual   #87  <Method StringBuilder StringBuilder.append(int)>
		//   29   59:invokevirtual   #91  <Method String StringBuilder.toString()>
		//   30   62:invokespecial   #149 <Method boolean zza(Runnable, String, Object)>
		//   31   65:istore_3        
			Exception exception;
			if(!flag)
		//*  32   66:iload_3         
		//*  33   67:ifne            84
			{
				dataholder.close();
		//   34   70:aload_1         
		//   35   71:invokevirtual   #211 <Method void DataHolder.close()>
				return;
		//   36   74:return          
			} else
		//*  37   75:astore          4
		//*  38   77:aload_1         
		//*  39   78:invokevirtual   #211 <Method void DataHolder.close()>
		//*  40   81:aload           4
		//*  41   83:athrow          
			{
				return;
		//   42   84:return          
			}
			exception;
			dataholder.close();
			throw exception;
		}

		public void zzb(zzcc zzcc)
		{
			zza(new Runnable(this, zzcc) {

				public void run()
				{
					zzbTo.zzbTl.onPeerDisconnected(((Node) (zzbTq)));
				//    0    0:aload_0         
				//    1    1:getfield        #22  <Field WearableListenerService$zzc zzbTo>
				//    2    4:getfield        #33  <Field WearableListenerService WearableListenerService$zzc.zzbTl>
				//    3    7:aload_0         
				//    4    8:getfield        #24  <Field zzcc zzbTq>
				//    5   11:invokevirtual   #37  <Method void WearableListenerService.onPeerDisconnected(Node)>
				//    6   14:return          
				}

				final zzc zzbTo;
				final zzcc zzbTq;

			
			{
				zzbTo = zzc1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field WearableListenerService$zzc zzbTo>
				zzbTq = zzcc;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field zzcc zzbTq>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
			}
, "onPeerDisconnected", ((Object) (zzcc)));
		//    0    0:aload_0         
		//    1    1:new             #15  <Class WearableListenerService$zzc$4>
		//    2    4:dup             
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #213 <Method void WearableListenerService$zzc$4(WearableListenerService$zzc, zzcc)>
		//    6   10:ldc1            #215 <String "onPeerDisconnected">
		//    7   12:aload_1         
		//    8   13:invokespecial   #149 <Method boolean zza(Runnable, String, Object)>
		//    9   16:pop             
		//   10   17:return          
		}

		final WearableListenerService zzbTl;
		private volatile int zzbTm;

		private zzc()
		{
			zzbTl = WearableListenerService.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #33  <Field WearableListenerService zzbTl>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #36  <Method void com.google.android.gms.wearable.internal.zzbv$zza()>
			zzbTm = -1;
		//    5    9:aload_0         
		//    6   10:iconst_m1       
		//    7   11:putfield        #38  <Field int zzbTm>
		//    8   14:return          
		}

	}


	public WearableListenerService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #65  <Method void Service()>
	//    2    4:aload_0         
	//    3    5:new             #67  <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #68  <Method void Object()>
	//    6   12:putfield        #70  <Field Object zzbTi>
	//    7   15:return          
	}

	static ComponentName zza(WearableListenerService wearablelistenerservice)
	{
		return wearablelistenerservice.zzbTe;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field ComponentName zzbTe>
	//    2    4:areturn         
	}

	static Intent zzb(WearableListenerService wearablelistenerservice)
	{
		return wearablelistenerservice.zzbTg;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field Intent zzbTg>
	//    2    4:areturn         
	}

	static Object zzc(WearableListenerService wearablelistenerservice)
	{
		return wearablelistenerservice.zzbTi;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field Object zzbTi>
	//    2    4:areturn         
	}

	static boolean zzd(WearableListenerService wearablelistenerservice)
	{
		return wearablelistenerservice.zzbTj;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field boolean zzbTj>
	//    2    4:ireturn         
	}

	static zzb zze(WearableListenerService wearablelistenerservice)
	{
		return wearablelistenerservice.zzbTf;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field WearableListenerService$zzb zzbTf>
	//    2    4:areturn         
	}

	public Looper getLooper()
	{
		if(zzbTh == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #90  <Field Looper zzbTh>
	//*   2    4:ifnonnull       29
		{
			HandlerThread handlerthread = new HandlerThread("WearableListenerService");
	//    3    7:new             #92  <Class HandlerThread>
	//    4   10:dup             
	//    5   11:ldc1            #94  <String "WearableListenerService">
	//    6   13:invokespecial   #97  <Method void HandlerThread(String)>
	//    7   16:astore_1        
			handlerthread.start();
	//    8   17:aload_1         
	//    9   18:invokevirtual   #100 <Method void HandlerThread.start()>
			zzbTh = handlerthread.getLooper();
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:invokevirtual   #102 <Method Looper HandlerThread.getLooper()>
	//   13   26:putfield        #90  <Field Looper zzbTh>
		}
		return zzbTh;
	//   14   29:aload_0         
	//   15   30:getfield        #90  <Field Looper zzbTh>
	//   16   33:areturn         
	}

	public final IBinder onBind(Intent intent)
	{
		if("com.google.android.gms.wearable.BIND_LISTENER".equals(((Object) (intent.getAction()))))
	//*   0    0:ldc1            #47  <String "com.google.android.gms.wearable.BIND_LISTENER">
	//*   1    2:aload_1         
	//*   2    3:invokevirtual   #110 <Method String Intent.getAction()>
	//*   3    6:invokevirtual   #116 <Method boolean String.equals(Object)>
	//*   4    9:ifeq            17
			return zzaFz;
	//    5   12:aload_0         
	//    6   13:getfield        #118 <Field IBinder zzaFz>
	//    7   16:areturn         
		else
			return null;
	//    8   17:aconst_null     
	//    9   18:areturn         
	}

	public void onCapabilityChanged(CapabilityInfo capabilityinfo)
	{
	//    0    0:return          
	}

	public void onChannelClosed(Channel channel, int i, int j)
	{
	//    0    0:return          
	}

	public void onChannelOpened(Channel channel)
	{
	//    0    0:return          
	}

	public void onConnectedNodes(List list)
	{
	//    0    0:return          
	}

	public void onCreate()
	{
		super.onCreate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #131 <Method void Service.onCreate()>
		zzbTe = new ComponentName(((android.content.Context) (this)), ((Object)this).getClass().getName());
	//    2    4:aload_0         
	//    3    5:new             #133 <Class ComponentName>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:invokevirtual   #137 <Method Class Object.getClass()>
	//    8   14:invokevirtual   #142 <Method String Class.getName()>
	//    9   17:invokespecial   #145 <Method void ComponentName(android.content.Context, String)>
	//   10   20:putfield        #74  <Field ComponentName zzbTe>
		if(Log.isLoggable("WearableLS", 3))
	//*  11   23:ldc1            #147 <String "WearableLS">
	//*  12   25:iconst_3        
	//*  13   26:invokestatic    #153 <Method boolean Log.isLoggable(String, int)>
	//*  14   29:ifeq            75
		{
			String s = String.valueOf(((Object) (zzbTe)));
	//   15   32:aload_0         
	//   16   33:getfield        #74  <Field ComponentName zzbTe>
	//   17   36:invokestatic    #157 <Method String String.valueOf(Object)>
	//   18   39:astore_1        
			Log.d("WearableLS", (new StringBuilder(String.valueOf(((Object) (s))).length() + 10)).append("onCreate: ").append(s).toString());
	//   19   40:ldc1            #147 <String "WearableLS">
	//   20   42:new             #159 <Class StringBuilder>
	//   21   45:dup             
	//   22   46:aload_1         
	//   23   47:invokestatic    #157 <Method String String.valueOf(Object)>
	//   24   50:invokevirtual   #163 <Method int String.length()>
	//   25   53:bipush          10
	//   26   55:iadd            
	//   27   56:invokespecial   #166 <Method void StringBuilder(int)>
	//   28   59:ldc1            #168 <String "onCreate: ">
	//   29   61:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   30   64:aload_1         
	//   31   65:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   32   68:invokevirtual   #175 <Method String StringBuilder.toString()>
	//   33   71:invokestatic    #179 <Method int Log.d(String, String)>
	//   34   74:pop             
		}
		zzbTf = new zzb(getLooper());
	//   35   75:aload_0         
	//   36   76:new             #21  <Class WearableListenerService$zzb>
	//   37   79:dup             
	//   38   80:aload_0         
	//   39   81:aload_0         
	//   40   82:invokevirtual   #180 <Method Looper getLooper()>
	//   41   85:invokespecial   #183 <Method void WearableListenerService$zzb(WearableListenerService, Looper)>
	//   42   88:putfield        #86  <Field WearableListenerService$zzb zzbTf>
		zzbTg = new Intent("com.google.android.gms.wearable.BIND_LISTENER");
	//   43   91:aload_0         
	//   44   92:new             #106 <Class Intent>
	//   45   95:dup             
	//   46   96:ldc1            #47  <String "com.google.android.gms.wearable.BIND_LISTENER">
	//   47   98:invokespecial   #184 <Method void Intent(String)>
	//   48  101:putfield        #77  <Field Intent zzbTg>
		zzbTg.setComponent(zzbTe);
	//   49  104:aload_0         
	//   50  105:getfield        #77  <Field Intent zzbTg>
	//   51  108:aload_0         
	//   52  109:getfield        #74  <Field ComponentName zzbTe>
	//   53  112:invokevirtual   #188 <Method Intent Intent.setComponent(ComponentName)>
	//   54  115:pop             
		zzaFz = ((IBinder) (new zzc()));
	//   55  116:aload_0         
	//   56  117:new             #24  <Class WearableListenerService$zzc>
	//   57  120:dup             
	//   58  121:aload_0         
	//   59  122:aconst_null     
	//   60  123:invokespecial   #191 <Method void WearableListenerService$zzc(WearableListenerService, WearableListenerService$1)>
	//   61  126:putfield        #118 <Field IBinder zzaFz>
	//   62  129:return          
	}

	public void onDataChanged(DataEventBuffer dataeventbuffer)
	{
	//    0    0:return          
	}

	public void onDestroy()
	{
		if(Log.isLoggable("WearableLS", 3))
	//*   0    0:ldc1            #147 <String "WearableLS">
	//*   1    2:iconst_3        
	//*   2    3:invokestatic    #153 <Method boolean Log.isLoggable(String, int)>
	//*   3    6:ifeq            52
		{
			String s = String.valueOf(((Object) (zzbTe)));
	//    4    9:aload_0         
	//    5   10:getfield        #74  <Field ComponentName zzbTe>
	//    6   13:invokestatic    #157 <Method String String.valueOf(Object)>
	//    7   16:astore_1        
			Log.d("WearableLS", (new StringBuilder(String.valueOf(((Object) (s))).length() + 11)).append("onDestroy: ").append(s).toString());
	//    8   17:ldc1            #147 <String "WearableLS">
	//    9   19:new             #159 <Class StringBuilder>
	//   10   22:dup             
	//   11   23:aload_1         
	//   12   24:invokestatic    #157 <Method String String.valueOf(Object)>
	//   13   27:invokevirtual   #163 <Method int String.length()>
	//   14   30:bipush          11
	//   15   32:iadd            
	//   16   33:invokespecial   #166 <Method void StringBuilder(int)>
	//   17   36:ldc1            #196 <String "onDestroy: ">
	//   18   38:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   19   41:aload_1         
	//   20   42:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   21   45:invokevirtual   #175 <Method String StringBuilder.toString()>
	//   22   48:invokestatic    #179 <Method int Log.d(String, String)>
	//   23   51:pop             
		}
		Object obj = zzbTi;
	//   24   52:aload_0         
	//   25   53:getfield        #70  <Field Object zzbTi>
	//   26   56:astore_1        
		obj;
	//   27   57:aload_1         
		JVM INSTR monitorenter ;
	//   28   58:monitorenter    
		zzbTj = true;
	//   29   59:aload_0         
	//   30   60:iconst_1        
	//   31   61:putfield        #82  <Field boolean zzbTj>
		if(zzbTf == null)
	//*  32   64:aload_0         
	//*  33   65:getfield        #86  <Field WearableListenerService$zzb zzbTf>
	//*  34   68:ifnonnull       116
		{
			String s1 = String.valueOf(((Object) (zzbTe)));
	//   35   71:aload_0         
	//   36   72:getfield        #74  <Field ComponentName zzbTe>
	//   37   75:invokestatic    #157 <Method String String.valueOf(Object)>
	//   38   78:astore_2        
			throw new IllegalStateException((new StringBuilder(String.valueOf(((Object) (s1))).length() + 111)).append("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()? component=").append(s1).toString());
	//   39   79:new             #198 <Class IllegalStateException>
	//   40   82:dup             
	//   41   83:new             #159 <Class StringBuilder>
	//   42   86:dup             
	//   43   87:aload_2         
	//   44   88:invokestatic    #157 <Method String String.valueOf(Object)>
	//   45   91:invokevirtual   #163 <Method int String.length()>
	//   46   94:bipush          111
	//   47   96:iadd            
	//   48   97:invokespecial   #166 <Method void StringBuilder(int)>
	//   49  100:ldc1            #200 <String "onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()? component=">
	//   50  102:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   51  105:aload_2         
	//   52  106:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   53  109:invokevirtual   #175 <Method String StringBuilder.toString()>
	//   54  112:invokespecial   #201 <Method void IllegalStateException(String)>
	//   55  115:athrow          
		}
		zzbTf.quit();
	//   56  116:aload_0         
	//   57  117:getfield        #86  <Field WearableListenerService$zzb zzbTf>
	//   58  120:invokevirtual   #204 <Method void WearableListenerService$zzb.quit()>
		obj;
	//   59  123:aload_1         
		JVM INSTR monitorexit ;
	//   60  124:monitorexit     
		  goto _L1
	//*  61  125:goto            133
		Exception exception;
		exception;
	//   62  128:astore_2        
	//*  63  129:aload_1         
		throw exception;
	//   64  130:monitorexit     
	//   65  131:aload_2         
	//   66  132:athrow          
_L1:
		super.onDestroy();
	//   67  133:aload_0         
	//   68  134:invokespecial   #206 <Method void Service.onDestroy()>
		return;
	//   69  137:return          
	}

	public void onEntityUpdate(com.google.android.gms.wearable.zzb zzb1)
	{
	//    0    0:return          
	}

	public void onInputClosed(Channel channel, int i, int j)
	{
	//    0    0:return          
	}

	public void onMessageReceived(MessageEvent messageevent)
	{
	//    0    0:return          
	}

	public void onNotificationReceived(zzd zzd1)
	{
	//    0    0:return          
	}

	public void onOutputClosed(Channel channel, int i, int j)
	{
	//    0    0:return          
	}

	public void onPeerConnected(Node node)
	{
	//    0    0:return          
	}

	public void onPeerDisconnected(Node node)
	{
	//    0    0:return          
	}

	public static final String BIND_LISTENER_INTENT_ACTION = "com.google.android.gms.wearable.BIND_LISTENER";
	private IBinder zzaFz;
	private ComponentName zzbTe;
	private zzb zzbTf;
	private Intent zzbTg;
	private Looper zzbTh;
	private final Object zzbTi = new Object();
	private boolean zzbTj;
}
