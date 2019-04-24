// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable;

import android.content.ComponentName;
import android.os.Binder;
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
//			WearableListenerService, DataEventBuffer

final class WearableListenerService$zzc extends com.google.android.gms.wearable.internal.zzbv.zza
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
		zza(new Runnable(list) {

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

			final WearableListenerService.zzc zzbTo;
			final List zzbTr;

			
			{
				zzbTo = WearableListenerService.zzc.this;
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
		zza(new Runnable(zzbz) {

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

			final WearableListenerService.zzc zzbTo;
			final zzbz zzbTp;

			
			{
				zzbTo = WearableListenerService.zzc.this;
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
		zza(new Runnable(zzcc) {

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

			final WearableListenerService.zzc zzbTo;
			final zzcc zzbTq;

			
			{
				zzbTo = WearableListenerService.zzc.this;
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
		zza(new Runnable(zzh) {

			public void run()
			{
				zzbTo.zzbTl.onEntityUpdate(((zzb) (zzbTu)));
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field WearableListenerService$zzc zzbTo>
			//    2    4:getfield        #33  <Field WearableListenerService WearableListenerService$zzc.zzbTl>
			//    3    7:aload_0         
			//    4    8:getfield        #24  <Field zzh zzbTu>
			//    5   11:invokevirtual   #37  <Method void WearableListenerService.onEntityUpdate(zzb)>
			//    6   14:return          
			}

			final WearableListenerService.zzc zzbTo;
			final zzh zzbTu;

			
			{
				zzbTo = WearableListenerService.zzc.this;
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
		zza(new Runnable(zzk) {

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

			final WearableListenerService.zzc zzbTo;
			final zzk zzbTt;

			
			{
				zzbTo = WearableListenerService.zzc.this;
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
		zza(new Runnable(zzo) {

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

			final WearableListenerService.zzc zzbTo;
			final zzo zzbTs;

			
			{
				zzbTo = WearableListenerService.zzc.this;
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
		zza(new Runnable(zzs) {

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

			final WearableListenerService.zzc zzbTo;
			final zzs zzbTv;

			
			{
				zzbTo = WearableListenerService.zzc.this;
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
		Runnable runnable = new Runnable(dataholder) {

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
				Exception exception1;
				exception1;
			//   14   28:astore_2        
				dataeventbuffer.release();
			//   15   29:aload_1         
			//   16   30:invokevirtual   #44  <Method void DataEventBuffer.release()>
				throw exception1;
			//   17   33:aload_2         
			//   18   34:athrow          
			}

			final DataHolder zzbTn;
			final WearableListenerService.zzc zzbTo;

			
			{
				zzbTo = WearableListenerService.zzc.this;
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
		zza(new Runnable(zzcc) {

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

			final WearableListenerService.zzc zzbTo;
			final zzcc zzbTq;

			
			{
				zzbTo = WearableListenerService.zzc.this;
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

	private WearableListenerService$zzc(WearableListenerService wearablelistenerservice)
	{
		zzbTl = wearablelistenerservice;
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

	WearableListenerService$zzc(WearableListenerService wearablelistenerservice, WearableListenerService._cls1 _pcls1)
	{
		this(wearablelistenerservice);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #42  <Method void WearableListenerService$zzc(WearableListenerService)>
	//    3    5:return          
	}
}
