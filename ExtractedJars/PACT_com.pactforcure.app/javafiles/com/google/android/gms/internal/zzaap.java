// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zzc;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.common.internal.zzal;
import com.google.android.gms.common.internal.zzr;
import com.google.android.gms.common.util.zza;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.internal:
//			zzabd, zzzq, zzzu, zzzs, 
//			zzabf, zzaae, zzabe, zzabr, 
//			zzabn, zzabk, zzzz, zzaad, 
//			zzabj

public class zzaap
	implements android.os.Handler.Callback
{
	public class zza
		implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener, zzzz
	{

		private void zzb(zzzq zzzq1)
		{
			zzzq1.zza(zzaBa, zzqD());
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #109 <Field zzaad zzaBa>
		//    3    5:aload_0         
		//    4    6:invokevirtual   #139 <Method boolean zzqD()>
		//    5    9:invokevirtual   #144 <Method void com.google.android.gms.internal.zzzq.zza(zzaad, boolean)>
			try
			{
				zzzq1.zza(this);
		//    6   12:aload_1         
		//    7   13:aload_0         
		//    8   14:invokevirtual   #147 <Method void com.google.android.gms.internal.zzzq.zza(zzaap$zza)>
				return;
		//    9   17:return          
			}
			// Misplaced declaration of an exception variable
			catch(zzzq zzzq1)
		//*  10   18:astore_1        
			{
				onConnectionSuspended(1);
		//   11   19:aload_0         
		//   12   20:iconst_1        
		//   13   21:invokevirtual   #151 <Method void onConnectionSuspended(int)>
			}
			zzazq.disconnect();
		//   14   24:aload_0         
		//   15   25:getfield        #90  <Field com.google.android.gms.common.api.Api$zze zzazq>
		//   16   28:invokeinterface #154 <Method void com.google.android.gms.common.api.Api$zze.disconnect()>
		//   17   33:return          
		}

		static void zzc(zza zza1)
		{
			zza1.zzvZ();
		//    0    0:aload_0         
		//    1    1:invokespecial   #158 <Method void zzvZ()>
		//    2    4:return          
		}

		static void zzd(zza zza1)
		{
			zza1.zzwa();
		//    0    0:aload_0         
		//    1    1:invokespecial   #162 <Method void zzwa()>
		//    2    4:return          
		}

		private void zzj(ConnectionResult connectionresult)
		{
			for(Iterator iterator = zzaBb.iterator(); iterator.hasNext(); ((zzzu)iterator.next()).zza(zzaxH, connectionresult));
		//    0    0:aload_0         
		//    1    1:getfield        #66  <Field Set zzaBb>
		//    2    4:invokeinterface #170 <Method Iterator Set.iterator()>
		//    3    9:astore_2        
		//    4   10:aload_2         
		//    5   11:invokeinterface #175 <Method boolean Iterator.hasNext()>
		//    6   16:ifeq            39
		//    7   19:aload_2         
		//    8   20:invokeinterface #179 <Method Object Iterator.next()>
		//    9   25:checkcast       #181 <Class zzzu>
		//   10   28:aload_0         
		//   11   29:getfield        #104 <Field zzzs zzaxH>
		//   12   32:aload_1         
		//   13   33:invokevirtual   #184 <Method void com.google.android.gms.internal.zzzu.zza(zzzs, ConnectionResult)>
		//*  14   36:goto            10
			zzaBb.clear();
		//   15   39:aload_0         
		//   16   40:getfield        #66  <Field Set zzaBb>
		//   17   43:invokeinterface #187 <Method void Set.clear()>
		//   18   48:return          
		}

		private void zzvZ()
		{
			Iterator iterator;
			zzwd();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #192 <Method void zzwd()>
			zzj(ConnectionResult.zzawX);
		//    2    4:aload_0         
		//    3    5:getstatic       #197 <Field ConnectionResult ConnectionResult.zzawX>
		//    4    8:invokespecial   #199 <Method void zzj(ConnectionResult)>
			zzwf();
		//    5   11:aload_0         
		//    6   12:invokespecial   #202 <Method void zzwf()>
			iterator = zzaBc.values().iterator();
		//    7   15:aload_0         
		//    8   16:getfield        #71  <Field Map zzaBc>
		//    9   19:invokeinterface #208 <Method Collection Map.values()>
		//   10   24:invokeinterface #211 <Method Iterator Collection.iterator()>
		//   11   29:astore_1        
_L2:
			if(!iterator.hasNext())
				break MISSING_BLOCK_LABEL_72;
		//   12   30:aload_1         
		//   13   31:invokeinterface #175 <Method boolean Iterator.hasNext()>
		//   14   36:ifeq            72
			iterator.next();
		//   15   39:aload_1         
		//   16   40:invokeinterface #179 <Method Object Iterator.next()>
		//   17   45:pop             
			new TaskCompletionSource();
		//   18   46:new             #213 <Class TaskCompletionSource>
		//   19   49:dup             
		//   20   50:invokespecial   #214 <Method void TaskCompletionSource()>
		//   21   53:pop             
			continue; /* Loop/switch isn't completed */
		//   22   54:goto            30
			DeadObjectException deadobjectexception;
			deadobjectexception;
		//   23   57:astore_1        
			onConnectionSuspended(1);
		//   24   58:aload_0         
		//   25   59:iconst_1        
		//   26   60:invokevirtual   #151 <Method void onConnectionSuspended(int)>
			zzazq.disconnect();
		//   27   63:aload_0         
		//   28   64:getfield        #90  <Field com.google.android.gms.common.api.Api$zze zzazq>
		//   29   67:invokeinterface #154 <Method void com.google.android.gms.common.api.Api$zze.disconnect()>
			zzwb();
		//   30   72:aload_0         
		//   31   73:invokespecial   #217 <Method void zzwb()>
			zzwg();
		//   32   76:aload_0         
		//   33   77:invokespecial   #220 <Method void zzwg()>
			return;
		//   34   80:return          
			RemoteException remoteexception;
			remoteexception;
		//   35   81:astore_2        
			if(true) goto _L2; else goto _L1
_L1:
		//*  36   82:goto            30
		}

		private void zzwa()
		{
			zzwd();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #192 <Method void zzwd()>
			zzaAm = true;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #222 <Field boolean zzaAm>
			zzaBa.zzvw();
		//    5    9:aload_0         
		//    6   10:getfield        #109 <Field zzaad zzaBa>
		//    7   13:invokevirtual   #225 <Method void zzaad.zzvw()>
			com.google.android.gms.internal.zzaap.zza(zzaBg).sendMessageDelayed(Message.obtain(com.google.android.gms.internal.zzaap.zza(zzaBg), 7, ((Object) (zzaxH))), com.google.android.gms.internal.zzaap.zzc(zzaBg));
		//    8   16:aload_0         
		//    9   17:getfield        #53  <Field zzaap zzaBg>
		//   10   20:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaap.zza(zzaap)>
		//   11   23:aload_0         
		//   12   24:getfield        #53  <Field zzaap zzaBg>
		//   13   27:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaap.zza(zzaap)>
		//   14   30:bipush          7
		//   15   32:aload_0         
		//   16   33:getfield        #104 <Field zzzs zzaxH>
		//   17   36:invokestatic    #231 <Method Message Message.obtain(Handler, int, Object)>
		//   18   39:aload_0         
		//   19   40:getfield        #53  <Field zzaap zzaBg>
		//   20   43:invokestatic    #234 <Method long com.google.android.gms.internal.zzaap.zzc(zzaap)>
		//   21   46:invokevirtual   #238 <Method boolean Handler.sendMessageDelayed(Message, long)>
		//   22   49:pop             
			com.google.android.gms.internal.zzaap.zza(zzaBg).sendMessageDelayed(Message.obtain(com.google.android.gms.internal.zzaap.zza(zzaBg), 9, ((Object) (zzaxH))), zzaap.zzd(zzaBg));
		//   23   50:aload_0         
		//   24   51:getfield        #53  <Field zzaap zzaBg>
		//   25   54:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaap.zza(zzaap)>
		//   26   57:aload_0         
		//   27   58:getfield        #53  <Field zzaap zzaBg>
		//   28   61:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaap.zza(zzaap)>
		//   29   64:bipush          9
		//   30   66:aload_0         
		//   31   67:getfield        #104 <Field zzzs zzaxH>
		//   32   70:invokestatic    #231 <Method Message Message.obtain(Handler, int, Object)>
		//   33   73:aload_0         
		//   34   74:getfield        #53  <Field zzaap zzaBg>
		//   35   77:invokestatic    #240 <Method long zzaap.zzd(zzaap)>
		//   36   80:invokevirtual   #238 <Method boolean Handler.sendMessageDelayed(Message, long)>
		//   37   83:pop             
			com.google.android.gms.internal.zzaap.zza(zzaBg, -1);
		//   38   84:aload_0         
		//   39   85:getfield        #53  <Field zzaap zzaBg>
		//   40   88:iconst_m1       
		//   41   89:invokestatic    #243 <Method int com.google.android.gms.internal.zzaap.zza(zzaap, int)>
		//   42   92:pop             
		//   43   93:return          
		}

		private void zzwb()
		{
			for(; zzazq.isConnected() && !zzaAY.isEmpty(); zzb((zzzq)zzaAY.remove()));
		//    0    0:aload_0         
		//    1    1:getfield        #90  <Field com.google.android.gms.common.api.Api$zze zzazq>
		//    2    4:invokeinterface #246 <Method boolean com.google.android.gms.common.api.Api$zze.isConnected()>
		//    3    9:ifeq            43
		//    4   12:aload_0         
		//    5   13:getfield        #61  <Field Queue zzaAY>
		//    6   16:invokeinterface #251 <Method boolean Queue.isEmpty()>
		//    7   21:ifne            43
		//    8   24:aload_0         
		//    9   25:aload_0         
		//   10   26:getfield        #61  <Field Queue zzaAY>
		//   11   29:invokeinterface #254 <Method Object Queue.remove()>
		//   12   34:checkcast       #141 <Class zzzq>
		//   13   37:invokespecial   #256 <Method void zzb(zzzq)>
		//*  14   40:goto            0
		//   15   43:return          
		}

		private void zzwf()
		{
			if(zzaAm)
		//*   0    0:aload_0         
		//*   1    1:getfield        #222 <Field boolean zzaAm>
		//*   2    4:ifeq            44
			{
				com.google.android.gms.internal.zzaap.zza(zzaBg).removeMessages(9, ((Object) (zzaxH)));
		//    3    7:aload_0         
		//    4    8:getfield        #53  <Field zzaap zzaBg>
		//    5   11:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaap.zza(zzaap)>
		//    6   14:bipush          9
		//    7   16:aload_0         
		//    8   17:getfield        #104 <Field zzzs zzaxH>
		//    9   20:invokevirtual   #260 <Method void Handler.removeMessages(int, Object)>
				com.google.android.gms.internal.zzaap.zza(zzaBg).removeMessages(7, ((Object) (zzaxH)));
		//   10   23:aload_0         
		//   11   24:getfield        #53  <Field zzaap zzaBg>
		//   12   27:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaap.zza(zzaap)>
		//   13   30:bipush          7
		//   14   32:aload_0         
		//   15   33:getfield        #104 <Field zzzs zzaxH>
		//   16   36:invokevirtual   #260 <Method void Handler.removeMessages(int, Object)>
				zzaAm = false;
		//   17   39:aload_0         
		//   18   40:iconst_0        
		//   19   41:putfield        #222 <Field boolean zzaAm>
			}
		//   20   44:return          
		}

		private void zzwg()
		{
			com.google.android.gms.internal.zzaap.zza(zzaBg).removeMessages(10, ((Object) (zzaxH)));
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field zzaap zzaBg>
		//    2    4:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaap.zza(zzaap)>
		//    3    7:bipush          10
		//    4    9:aload_0         
		//    5   10:getfield        #104 <Field zzzs zzaxH>
		//    6   13:invokevirtual   #260 <Method void Handler.removeMessages(int, Object)>
			com.google.android.gms.internal.zzaap.zza(zzaBg).sendMessageDelayed(com.google.android.gms.internal.zzaap.zza(zzaBg).obtainMessage(10, ((Object) (zzaxH))), zzaap.zzh(zzaBg));
		//    7   16:aload_0         
		//    8   17:getfield        #53  <Field zzaap zzaBg>
		//    9   20:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaap.zza(zzaap)>
		//   10   23:aload_0         
		//   11   24:getfield        #53  <Field zzaap zzaBg>
		//   12   27:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaap.zza(zzaap)>
		//   13   30:bipush          10
		//   14   32:aload_0         
		//   15   33:getfield        #104 <Field zzzs zzaxH>
		//   16   36:invokevirtual   #264 <Method Message Handler.obtainMessage(int, Object)>
		//   17   39:aload_0         
		//   18   40:getfield        #53  <Field zzaap zzaBg>
		//   19   43:invokestatic    #267 <Method long zzaap.zzh(zzaap)>
		//   20   46:invokevirtual   #238 <Method boolean Handler.sendMessageDelayed(Message, long)>
		//   21   49:pop             
		//   22   50:return          
		}

		public void connect()
		{
			zzac.zza(com.google.android.gms.internal.zzaap.zza(zzaBg));
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field zzaap zzaBg>
		//    2    4:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaap.zza(zzaap)>
		//    3    7:invokestatic    #273 <Method void zzac.zza(Handler)>
			if(zzazq.isConnected() || zzazq.isConnecting())
		//*   4   10:aload_0         
		//*   5   11:getfield        #90  <Field com.google.android.gms.common.api.Api$zze zzazq>
		//*   6   14:invokeinterface #246 <Method boolean com.google.android.gms.common.api.Api$zze.isConnected()>
		//*   7   19:ifne            34
		//*   8   22:aload_0         
		//*   9   23:getfield        #90  <Field com.google.android.gms.common.api.Api$zze zzazq>
		//*  10   26:invokeinterface #276 <Method boolean com.google.android.gms.common.api.Api$zze.isConnecting()>
		//*  11   31:ifeq            35
				return;
		//   12   34:return          
			if(zzazq.zzuI() && zzaap.zzi(zzaBg) != 0)
		//*  13   35:aload_0         
		//*  14   36:getfield        #90  <Field com.google.android.gms.common.api.Api$zze zzazq>
		//*  15   39:invokeinterface #279 <Method boolean com.google.android.gms.common.api.Api$zze.zzuI()>
		//*  16   44:ifeq            112
		//*  17   47:aload_0         
		//*  18   48:getfield        #53  <Field zzaap zzaBg>
		//*  19   51:invokestatic    #283 <Method int zzaap.zzi(zzaap)>
		//*  20   54:ifeq            112
			{
				com.google.android.gms.internal.zzaap.zza(zzaBg, zzaap.zzg(zzaBg).isGooglePlayServicesAvailable(zzaap.zzb(zzaBg)));
		//   21   57:aload_0         
		//   22   58:getfield        #53  <Field zzaap zzaBg>
		//   23   61:aload_0         
		//   24   62:getfield        #53  <Field zzaap zzaBg>
		//   25   65:invokestatic    #287 <Method GoogleApiAvailability zzaap.zzg(zzaap)>
		//   26   68:aload_0         
		//   27   69:getfield        #53  <Field zzaap zzaBg>
		//   28   72:invokestatic    #125 <Method Context zzaap.zzb(zzaap)>
		//   29   75:invokevirtual   #293 <Method int GoogleApiAvailability.isGooglePlayServicesAvailable(Context)>
		//   30   78:invokestatic    #243 <Method int com.google.android.gms.internal.zzaap.zza(zzaap, int)>
		//   31   81:pop             
				if(zzaap.zzi(zzaBg) != 0)
		//*  32   82:aload_0         
		//*  33   83:getfield        #53  <Field zzaap zzaBg>
		//*  34   86:invokestatic    #283 <Method int zzaap.zzi(zzaap)>
		//*  35   89:ifeq            112
				{
					onConnectionFailed(new ConnectionResult(zzaap.zzi(zzaBg), ((android.app.PendingIntent) (null))));
		//   36   92:aload_0         
		//   37   93:new             #194 <Class ConnectionResult>
		//   38   96:dup             
		//   39   97:aload_0         
		//   40   98:getfield        #53  <Field zzaap zzaBg>
		//   41  101:invokestatic    #283 <Method int zzaap.zzi(zzaap)>
		//   42  104:aconst_null     
		//   43  105:invokespecial   #296 <Method void ConnectionResult(int, android.app.PendingIntent)>
		//   44  108:invokevirtual   #299 <Method void onConnectionFailed(ConnectionResult)>
					return;
		//   45  111:return          
				}
			}
			zzb zzb1 = ((zzb) (zzaBg)). new zzb(zzazq, zzaxH);
		//   46  112:new             #301 <Class zzaap$zzb>
		//   47  115:dup             
		//   48  116:aload_0         
		//   49  117:getfield        #53  <Field zzaap zzaBg>
		//   50  120:aload_0         
		//   51  121:getfield        #90  <Field com.google.android.gms.common.api.Api$zze zzazq>
		//   52  124:aload_0         
		//   53  125:getfield        #104 <Field zzzs zzaxH>
		//   54  128:invokespecial   #304 <Method void zzaap$zzb(zzaap, com.google.android.gms.common.api.Api$zze, zzzs)>
		//   55  131:astore_1        
			if(zzazq.zzqD())
		//*  56  132:aload_0         
		//*  57  133:getfield        #90  <Field com.google.android.gms.common.api.Api$zze zzazq>
		//*  58  136:invokeinterface #121 <Method boolean com.google.android.gms.common.api.Api$zze.zzqD()>
		//*  59  141:ifeq            152
				zzaBe.zza(((zzabj.zza) (zzb1)));
		//   60  144:aload_0         
		//   61  145:getfield        #131 <Field zzabj zzaBe>
		//   62  148:aload_1         
		//   63  149:invokevirtual   #309 <Method void com.google.android.gms.internal.zzabj.zza(zzabj$zza)>
			zzazq.zza(((com.google.android.gms.common.internal.zzf.zzf) (zzb1)));
		//   64  152:aload_0         
		//   65  153:getfield        #90  <Field com.google.android.gms.common.api.Api$zze zzazq>
		//   66  156:aload_1         
		//   67  157:invokeinterface #312 <Method void com.google.android.gms.common.api.Api$zze.zza(com.google.android.gms.common.internal.zzf$zzf)>
		//   68  162:return          
		}

		public int getInstanceId()
		{
			return zzaBd;
		//    0    0:aload_0         
		//    1    1:getfield        #115 <Field int zzaBd>
		//    2    4:ireturn         
		}

		boolean isConnected()
		{
			return zzazq.isConnected();
		//    0    0:aload_0         
		//    1    1:getfield        #90  <Field com.google.android.gms.common.api.Api$zze zzazq>
		//    2    4:invokeinterface #246 <Method boolean com.google.android.gms.common.api.Api$zze.isConnected()>
		//    3    9:ireturn         
		}

		public void onConnected(Bundle bundle)
		{
			if(Looper.myLooper() == com.google.android.gms.internal.zzaap.zza(zzaBg).getLooper())
		//*   0    0:invokestatic    #320 <Method Looper Looper.myLooper()>
		//*   1    3:aload_0         
		//*   2    4:getfield        #53  <Field zzaap zzaBg>
		//*   3    7:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaap.zza(zzaap)>
		//*   4   10:invokevirtual   #82  <Method Looper Handler.getLooper()>
		//*   5   13:if_acmpne       21
			{
				zzvZ();
		//    6   16:aload_0         
		//    7   17:invokespecial   #158 <Method void zzvZ()>
				return;
		//    8   20:return          
			} else
			{
				com.google.android.gms.internal.zzaap.zza(zzaBg).post(new Runnable(this) {

					public void run()
					{
						com.google.android.gms.internal.zza.zzc(zzaBh);
					//    0    0:aload_0         
					//    1    1:getfield        #20  <Field zzaap$zza zzaBh>
					//    2    4:invokestatic    #28  <Method void com.google.android.gms.internal.zzaap$zza.zzc(zzaap$zza)>
					//    3    7:return          
					}

					final zza zzaBh;

			
			{
				zzaBh = zza1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field zzaap$zza zzaBh>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #23  <Method void Object()>
			//    5    9:return          
			}
				}
);
		//    9   21:aload_0         
		//   10   22:getfield        #53  <Field zzaap zzaBg>
		//   11   25:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaap.zza(zzaap)>
		//   12   28:new             #16  <Class zzaap$zza$1>
		//   13   31:dup             
		//   14   32:aload_0         
		//   15   33:invokespecial   #322 <Method void zzaap$zza$1(zzaap$zza)>
		//   16   36:invokevirtual   #326 <Method boolean Handler.post(Runnable)>
		//   17   39:pop             
				return;
		//   18   40:return          
			}
		}

		public void onConnectionFailed(ConnectionResult connectionresult)
		{
			zzac.zza(com.google.android.gms.internal.zzaap.zza(zzaBg));
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field zzaap zzaBg>
		//    2    4:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaap.zza(zzaap)>
		//    3    7:invokestatic    #273 <Method void zzac.zza(Handler)>
			if(zzaBe != null)
		//*   4   10:aload_0         
		//*   5   11:getfield        #131 <Field zzabj zzaBe>
		//*   6   14:ifnull          24
				zzaBe.zzwr();
		//    7   17:aload_0         
		//    8   18:getfield        #131 <Field zzabj zzaBe>
		//    9   21:invokevirtual   #331 <Method void zzabj.zzwr()>
			zzwd();
		//   10   24:aload_0         
		//   11   25:invokevirtual   #192 <Method void zzwd()>
			com.google.android.gms.internal.zzaap.zza(zzaBg, -1);
		//   12   28:aload_0         
		//   13   29:getfield        #53  <Field zzaap zzaBg>
		//   14   32:iconst_m1       
		//   15   33:invokestatic    #243 <Method int com.google.android.gms.internal.zzaap.zza(zzaap, int)>
		//   16   36:pop             
			zzj(connectionresult);
		//   17   37:aload_0         
		//   18   38:aload_1         
		//   19   39:invokespecial   #199 <Method void zzj(ConnectionResult)>
			if(connectionresult.getErrorCode() != 4) goto _L2; else goto _L1
		//   20   42:aload_1         
		//   21   43:invokevirtual   #334 <Method int ConnectionResult.getErrorCode()>
		//   22   46:iconst_4        
		//   23   47:icmpne          58
_L1:
			zzC(zzaap.zzvX());
		//   24   50:aload_0         
		//   25   51:invokestatic    #338 <Method Status zzaap.zzvX()>
		//   26   54:invokevirtual   #342 <Method void zzC(Status)>
_L4:
			return;
		//   27   57:return          
_L2:
			if(zzaAY.isEmpty())
		//*  28   58:aload_0         
		//*  29   59:getfield        #61  <Field Queue zzaAY>
		//*  30   62:invokeinterface #251 <Method boolean Queue.isEmpty()>
		//*  31   67:ifeq            76
			{
				zzaBf = connectionresult;
		//   32   70:aload_0         
		//   33   71:aload_1         
		//   34   72:putfield        #73  <Field ConnectionResult zzaBf>
				return;
		//   35   75:return          
			}
			synchronized(zzaap.zzvY())
		//*  36   76:invokestatic    #345 <Method Object zzaap.zzvY()>
		//*  37   79:astore_2        
		//*  38   80:aload_2         
		//*  39   81:monitorenter    
			{
				if(zzaap.zze(zzaBg) == null || !zzaap.zzf(zzaBg).contains(((Object) (zzaxH))))
					break MISSING_BLOCK_LABEL_134;
		//   40   82:aload_0         
		//   41   83:getfield        #53  <Field zzaap zzaBg>
		//   42   86:invokestatic    #349 <Method zzaae zzaap.zze(zzaap)>
		//   43   89:ifnull          134
		//   44   92:aload_0         
		//   45   93:getfield        #53  <Field zzaap zzaBg>
		//   46   96:invokestatic    #353 <Method Set zzaap.zzf(zzaap)>
		//   47   99:aload_0         
		//   48  100:getfield        #104 <Field zzzs zzaxH>
		//   49  103:invokeinterface #357 <Method boolean Set.contains(Object)>
		//   50  108:ifeq            134
				zzaap.zze(zzaBg).zzb(connectionresult, zzaBd);
		//   51  111:aload_0         
		//   52  112:getfield        #53  <Field zzaap zzaBg>
		//   53  115:invokestatic    #349 <Method zzaae zzaap.zze(zzaap)>
		//   54  118:aload_1         
		//   55  119:aload_0         
		//   56  120:getfield        #115 <Field int zzaBd>
		//   57  123:invokevirtual   #362 <Method void zzaae.zzb(ConnectionResult, int)>
			}
		//   58  126:aload_2         
		//   59  127:monitorexit     
			return;
		//   60  128:return          
			connectionresult;
		//   61  129:astore_1        
			obj;
		//   62  130:aload_2         
			JVM INSTR monitorexit ;
		//   63  131:monitorexit     
			throw connectionresult;
		//   64  132:aload_1         
		//   65  133:athrow          
			obj;
		//   66  134:aload_2         
			JVM INSTR monitorexit ;
		//   67  135:monitorexit     
			if(!zzaBg.zzc(connectionresult, zzaBd))
		//*  68  136:aload_0         
		//*  69  137:getfield        #53  <Field zzaap zzaBg>
		//*  70  140:aload_1         
		//*  71  141:aload_0         
		//*  72  142:getfield        #115 <Field int zzaBd>
		//*  73  145:invokevirtual   #365 <Method boolean com.google.android.gms.internal.zzaap.zzc(ConnectionResult, int)>
		//*  74  148:ifne            57
			{
				if(connectionresult.getErrorCode() == 18)
		//*  75  151:aload_1         
		//*  76  152:invokevirtual   #334 <Method int ConnectionResult.getErrorCode()>
		//*  77  155:bipush          18
		//*  78  157:icmpne          165
					zzaAm = true;
		//   79  160:aload_0         
		//   80  161:iconst_1        
		//   81  162:putfield        #222 <Field boolean zzaAm>
				if(zzaAm)
		//*  82  165:aload_0         
		//*  83  166:getfield        #222 <Field boolean zzaAm>
		//*  84  169:ifeq            207
				{
					com.google.android.gms.internal.zzaap.zza(zzaBg).sendMessageDelayed(Message.obtain(com.google.android.gms.internal.zzaap.zza(zzaBg), 7, ((Object) (zzaxH))), com.google.android.gms.internal.zzaap.zzc(zzaBg));
		//   85  172:aload_0         
		//   86  173:getfield        #53  <Field zzaap zzaBg>
		//   87  176:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaap.zza(zzaap)>
		//   88  179:aload_0         
		//   89  180:getfield        #53  <Field zzaap zzaBg>
		//   90  183:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaap.zza(zzaap)>
		//   91  186:bipush          7
		//   92  188:aload_0         
		//   93  189:getfield        #104 <Field zzzs zzaxH>
		//   94  192:invokestatic    #231 <Method Message Message.obtain(Handler, int, Object)>
		//   95  195:aload_0         
		//   96  196:getfield        #53  <Field zzaap zzaBg>
		//   97  199:invokestatic    #234 <Method long com.google.android.gms.internal.zzaap.zzc(zzaap)>
		//   98  202:invokevirtual   #238 <Method boolean Handler.sendMessageDelayed(Message, long)>
		//   99  205:pop             
					return;
		//  100  206:return          
				} else
				{
					connectionresult = ((ConnectionResult) (String.valueOf(((Object) (zzaxH.zzuV())))));
		//  101  207:aload_0         
		//  102  208:getfield        #104 <Field zzzs zzaxH>
		//  103  211:invokevirtual   #371 <Method String zzzs.zzuV()>
		//  104  214:invokestatic    #377 <Method String String.valueOf(Object)>
		//  105  217:astore_1        
					zzC(new Status(17, (new StringBuilder(String.valueOf(((Object) (connectionresult))).length() + 38)).append("API: ").append(((String) (connectionresult))).append(" is not available on this device.").toString()));
		//  106  218:aload_0         
		//  107  219:new             #379 <Class Status>
		//  108  222:dup             
		//  109  223:bipush          17
		//  110  225:new             #381 <Class StringBuilder>
		//  111  228:dup             
		//  112  229:aload_1         
		//  113  230:invokestatic    #377 <Method String String.valueOf(Object)>
		//  114  233:invokevirtual   #384 <Method int String.length()>
		//  115  236:bipush          38
		//  116  238:iadd            
		//  117  239:invokespecial   #386 <Method void StringBuilder(int)>
		//  118  242:ldc2            #388 <String "API: ">
		//  119  245:invokevirtual   #392 <Method StringBuilder StringBuilder.append(String)>
		//  120  248:aload_1         
		//  121  249:invokevirtual   #392 <Method StringBuilder StringBuilder.append(String)>
		//  122  252:ldc2            #394 <String " is not available on this device.">
		//  123  255:invokevirtual   #392 <Method StringBuilder StringBuilder.append(String)>
		//  124  258:invokevirtual   #397 <Method String StringBuilder.toString()>
		//  125  261:invokespecial   #400 <Method void Status(int, String)>
		//  126  264:invokevirtual   #342 <Method void zzC(Status)>
					return;
		//  127  267:return          
				}
			}
			if(true) goto _L4; else goto _L3
_L3:
		}

		public void onConnectionSuspended(int i)
		{
			if(Looper.myLooper() == com.google.android.gms.internal.zzaap.zza(zzaBg).getLooper())
		//*   0    0:invokestatic    #320 <Method Looper Looper.myLooper()>
		//*   1    3:aload_0         
		//*   2    4:getfield        #53  <Field zzaap zzaBg>
		//*   3    7:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaap.zza(zzaap)>
		//*   4   10:invokevirtual   #82  <Method Looper Handler.getLooper()>
		//*   5   13:if_acmpne       21
			{
				zzwa();
		//    6   16:aload_0         
		//    7   17:invokespecial   #162 <Method void zzwa()>
				return;
		//    8   20:return          
			} else
			{
				com.google.android.gms.internal.zzaap.zza(zzaBg).post(new Runnable(this) {

					public void run()
					{
						zza.zzd(zzaBh);
					//    0    0:aload_0         
					//    1    1:getfield        #20  <Field zzaap$zza zzaBh>
					//    2    4:invokestatic    #28  <Method void zzaap$zza.zzd(zzaap$zza)>
					//    3    7:return          
					}

					final zza zzaBh;

			
			{
				zzaBh = zza1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field zzaap$zza zzaBh>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #23  <Method void Object()>
			//    5    9:return          
			}
				}
);
		//    9   21:aload_0         
		//   10   22:getfield        #53  <Field zzaap zzaBg>
		//   11   25:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaap.zza(zzaap)>
		//   12   28:new             #18  <Class zzaap$zza$2>
		//   13   31:dup             
		//   14   32:aload_0         
		//   15   33:invokespecial   #401 <Method void zzaap$zza$2(zzaap$zza)>
		//   16   36:invokevirtual   #326 <Method boolean Handler.post(Runnable)>
		//   17   39:pop             
				return;
		//   18   40:return          
			}
		}

		public void resume()
		{
			zzac.zza(com.google.android.gms.internal.zzaap.zza(zzaBg));
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field zzaap zzaBg>
		//    2    4:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaap.zza(zzaap)>
		//    3    7:invokestatic    #273 <Method void zzac.zza(Handler)>
			if(zzaAm)
		//*   4   10:aload_0         
		//*   5   11:getfield        #222 <Field boolean zzaAm>
		//*   6   14:ifeq            21
				connect();
		//    7   17:aload_0         
		//    8   18:invokevirtual   #404 <Method void connect()>
		//    9   21:return          
		}

		public void signOut()
		{
			zzac.zza(com.google.android.gms.internal.zzaap.zza(zzaBg));
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field zzaap zzaBg>
		//    2    4:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaap.zza(zzaap)>
		//    3    7:invokestatic    #273 <Method void zzac.zza(Handler)>
			zzC(zzaap.zzaAO);
		//    4   10:aload_0         
		//    5   11:getstatic       #409 <Field Status zzaap.zzaAO>
		//    6   14:invokevirtual   #342 <Method void zzC(Status)>
			zzaBa.zzvv();
		//    7   17:aload_0         
		//    8   18:getfield        #109 <Field zzaad zzaBa>
		//    9   21:invokevirtual   #412 <Method void zzaad.zzvv()>
			for(Iterator iterator = zzaBc.keySet().iterator(); iterator.hasNext(); zza(((zzzq) (new zzzq.zze((zzaaz.zzb)iterator.next(), new TaskCompletionSource())))));
		//   10   24:aload_0         
		//   11   25:getfield        #71  <Field Map zzaBc>
		//   12   28:invokeinterface #416 <Method Set Map.keySet()>
		//   13   33:invokeinterface #170 <Method Iterator Set.iterator()>
		//   14   38:astore_1        
		//   15   39:aload_1         
		//   16   40:invokeinterface #175 <Method boolean Iterator.hasNext()>
		//   17   45:ifeq            78
		//   18   48:aload_0         
		//   19   49:new             #418 <Class zzzq$zze>
		//   20   52:dup             
		//   21   53:aload_1         
		//   22   54:invokeinterface #179 <Method Object Iterator.next()>
		//   23   59:checkcast       #420 <Class zzaaz$zzb>
		//   24   62:new             #213 <Class TaskCompletionSource>
		//   25   65:dup             
		//   26   66:invokespecial   #214 <Method void TaskCompletionSource()>
		//   27   69:invokespecial   #423 <Method void zzzq$zze(zzaaz$zzb, TaskCompletionSource)>
		//   28   72:invokevirtual   #425 <Method void zza(zzzq)>
		//*  29   75:goto            39
			zzazq.disconnect();
		//   30   78:aload_0         
		//   31   79:getfield        #90  <Field com.google.android.gms.common.api.Api$zze zzazq>
		//   32   82:invokeinterface #154 <Method void com.google.android.gms.common.api.Api$zze.disconnect()>
		//   33   87:return          
		}

		public void zzC(Status status)
		{
			zzac.zza(com.google.android.gms.internal.zzaap.zza(zzaBg));
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field zzaap zzaBg>
		//    2    4:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaap.zza(zzaap)>
		//    3    7:invokestatic    #273 <Method void zzac.zza(Handler)>
			for(Iterator iterator = zzaAY.iterator(); iterator.hasNext(); ((zzzq)iterator.next()).zzy(status));
		//    4   10:aload_0         
		//    5   11:getfield        #61  <Field Queue zzaAY>
		//    6   14:invokeinterface #426 <Method Iterator Queue.iterator()>
		//    7   19:astore_2        
		//    8   20:aload_2         
		//    9   21:invokeinterface #175 <Method boolean Iterator.hasNext()>
		//   10   26:ifeq            45
		//   11   29:aload_2         
		//   12   30:invokeinterface #179 <Method Object Iterator.next()>
		//   13   35:checkcast       #141 <Class zzzq>
		//   14   38:aload_1         
		//   15   39:invokevirtual   #429 <Method void zzzq.zzy(Status)>
		//*  16   42:goto            20
			zzaAY.clear();
		//   17   45:aload_0         
		//   18   46:getfield        #61  <Field Queue zzaAY>
		//   19   49:invokeinterface #430 <Method void Queue.clear()>
		//   20   54:return          
		}

		public void zza(ConnectionResult connectionresult, Api api, int i)
		{
			if(Looper.myLooper() == com.google.android.gms.internal.zzaap.zza(zzaBg).getLooper())
		//*   0    0:invokestatic    #320 <Method Looper Looper.myLooper()>
		//*   1    3:aload_0         
		//*   2    4:getfield        #53  <Field zzaap zzaBg>
		//*   3    7:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaap.zza(zzaap)>
		//*   4   10:invokevirtual   #82  <Method Looper Handler.getLooper()>
		//*   5   13:if_acmpne       22
			{
				onConnectionFailed(connectionresult);
		//    6   16:aload_0         
		//    7   17:aload_1         
		//    8   18:invokevirtual   #299 <Method void onConnectionFailed(ConnectionResult)>
				return;
		//    9   21:return          
			} else
			{
				com.google.android.gms.internal.zzaap.zza(zzaBg).post(new Runnable(this, connectionresult) {

					public void run()
					{
						zzaBh.onConnectionFailed(zzaBi);
					//    0    0:aload_0         
					//    1    1:getfield        #21  <Field zzaap$zza zzaBh>
					//    2    4:aload_0         
					//    3    5:getfield        #23  <Field ConnectionResult zzaBi>
					//    4    8:invokevirtual   #32  <Method void zzaap$zza.onConnectionFailed(ConnectionResult)>
					//    5   11:return          
					}

					final zza zzaBh;
					final ConnectionResult zzaBi;

			
			{
				zzaBh = zza1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field zzaap$zza zzaBh>
				zzaBi = connectionresult;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field ConnectionResult zzaBi>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Object()>
			//    8   14:return          
			}
				}
);
		//   10   22:aload_0         
		//   11   23:getfield        #53  <Field zzaap zzaBg>
		//   12   26:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaap.zza(zzaap)>
		//   13   29:new             #20  <Class zzaap$zza$3>
		//   14   32:dup             
		//   15   33:aload_0         
		//   16   34:aload_1         
		//   17   35:invokespecial   #434 <Method void zzaap$zza$3(zzaap$zza, ConnectionResult)>
		//   18   38:invokevirtual   #326 <Method boolean Handler.post(Runnable)>
		//   19   41:pop             
				return;
		//   20   42:return          
			}
		}

		public void zza(zzzq zzzq1)
		{
			zzac.zza(com.google.android.gms.internal.zzaap.zza(zzaBg));
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field zzaap zzaBg>
		//    2    4:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaap.zza(zzaap)>
		//    3    7:invokestatic    #273 <Method void zzac.zza(Handler)>
			if(zzazq.isConnected())
		//*   4   10:aload_0         
		//*   5   11:getfield        #90  <Field com.google.android.gms.common.api.Api$zze zzazq>
		//*   6   14:invokeinterface #246 <Method boolean com.google.android.gms.common.api.Api$zze.isConnected()>
		//*   7   19:ifeq            32
			{
				zzb(zzzq1);
		//    8   22:aload_0         
		//    9   23:aload_1         
		//   10   24:invokespecial   #256 <Method void zzb(zzzq)>
				zzwg();
		//   11   27:aload_0         
		//   12   28:invokespecial   #220 <Method void zzwg()>
				return;
		//   13   31:return          
			}
			zzaAY.add(((Object) (zzzq1)));
		//   14   32:aload_0         
		//   15   33:getfield        #61  <Field Queue zzaAY>
		//   16   36:aload_1         
		//   17   37:invokeinterface #438 <Method boolean Queue.add(Object)>
		//   18   42:pop             
			if(zzaBf != null && zzaBf.hasResolution())
		//*  19   43:aload_0         
		//*  20   44:getfield        #73  <Field ConnectionResult zzaBf>
		//*  21   47:ifnull          69
		//*  22   50:aload_0         
		//*  23   51:getfield        #73  <Field ConnectionResult zzaBf>
		//*  24   54:invokevirtual   #441 <Method boolean ConnectionResult.hasResolution()>
		//*  25   57:ifeq            69
			{
				onConnectionFailed(zzaBf);
		//   26   60:aload_0         
		//   27   61:aload_0         
		//   28   62:getfield        #73  <Field ConnectionResult zzaBf>
		//   29   65:invokevirtual   #299 <Method void onConnectionFailed(ConnectionResult)>
				return;
		//   30   68:return          
			} else
			{
				connect();
		//   31   69:aload_0         
		//   32   70:invokevirtual   #404 <Method void connect()>
				return;
		//   33   73:return          
			}
		}

		public void zzb(zzzu zzzu1)
		{
			zzac.zza(com.google.android.gms.internal.zzaap.zza(zzaBg));
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field zzaap zzaBg>
		//    2    4:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaap.zza(zzaap)>
		//    3    7:invokestatic    #273 <Method void zzac.zza(Handler)>
			zzaBb.add(((Object) (zzzu1)));
		//    4   10:aload_0         
		//    5   11:getfield        #66  <Field Set zzaBb>
		//    6   14:aload_1         
		//    7   15:invokeinterface #443 <Method boolean Set.add(Object)>
		//    8   20:pop             
		//    9   21:return          
		}

		public void zzi(ConnectionResult connectionresult)
		{
			zzac.zza(com.google.android.gms.internal.zzaap.zza(zzaBg));
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field zzaap zzaBg>
		//    2    4:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaap.zza(zzaap)>
		//    3    7:invokestatic    #273 <Method void zzac.zza(Handler)>
			zzazq.disconnect();
		//    4   10:aload_0         
		//    5   11:getfield        #90  <Field com.google.android.gms.common.api.Api$zze zzazq>
		//    6   14:invokeinterface #154 <Method void com.google.android.gms.common.api.Api$zze.disconnect()>
			onConnectionFailed(connectionresult);
		//    7   19:aload_0         
		//    8   20:aload_1         
		//    9   21:invokevirtual   #299 <Method void onConnectionFailed(ConnectionResult)>
		//   10   24:return          
		}

		public boolean zzqD()
		{
			return zzazq.zzqD();
		//    0    0:aload_0         
		//    1    1:getfield        #90  <Field com.google.android.gms.common.api.Api$zze zzazq>
		//    2    4:invokeinterface #121 <Method boolean com.google.android.gms.common.api.Api$zze.zzqD()>
		//    3    9:ireturn         
		}

		public void zzvJ()
		{
			zzac.zza(com.google.android.gms.internal.zzaap.zza(zzaBg));
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field zzaap zzaBg>
		//    2    4:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaap.zza(zzaap)>
		//    3    7:invokestatic    #273 <Method void zzac.zza(Handler)>
			if(zzaAm)
		//*   4   10:aload_0         
		//*   5   11:getfield        #222 <Field boolean zzaAm>
		//*   6   14:ifeq            70
			{
				zzwf();
		//    7   17:aload_0         
		//    8   18:invokespecial   #202 <Method void zzwf()>
				Status status;
				if(zzaap.zzg(zzaBg).isGooglePlayServicesAvailable(zzaap.zzb(zzaBg)) == 18)
		//*   9   21:aload_0         
		//*  10   22:getfield        #53  <Field zzaap zzaBg>
		//*  11   25:invokestatic    #287 <Method GoogleApiAvailability zzaap.zzg(zzaap)>
		//*  12   28:aload_0         
		//*  13   29:getfield        #53  <Field zzaap zzaBg>
		//*  14   32:invokestatic    #125 <Method Context zzaap.zzb(zzaap)>
		//*  15   35:invokevirtual   #293 <Method int GoogleApiAvailability.isGooglePlayServicesAvailable(Context)>
		//*  16   38:bipush          18
		//*  17   40:icmpne          71
					status = new Status(8, "Connection timed out while waiting for Google Play services update to complete.");
		//   18   43:new             #379 <Class Status>
		//   19   46:dup             
		//   20   47:bipush          8
		//   21   49:ldc2            #446 <String "Connection timed out while waiting for Google Play services update to complete.">
		//   22   52:invokespecial   #400 <Method void Status(int, String)>
		//   23   55:astore_1        
				else
		//*  24   56:aload_0         
		//*  25   57:aload_1         
		//*  26   58:invokevirtual   #342 <Method void zzC(Status)>
		//*  27   61:aload_0         
		//*  28   62:getfield        #90  <Field com.google.android.gms.common.api.Api$zze zzazq>
		//*  29   65:invokeinterface #154 <Method void com.google.android.gms.common.api.Api$zze.disconnect()>
		//*  30   70:return          
					status = new Status(8, "API failed to connect while resuming due to an unknown error.");
		//   31   71:new             #379 <Class Status>
		//   32   74:dup             
		//   33   75:bipush          8
		//   34   77:ldc2            #448 <String "API failed to connect while resuming due to an unknown error.">
		//   35   80:invokespecial   #400 <Method void Status(int, String)>
		//   36   83:astore_1        
				zzC(status);
				zzazq.disconnect();
			}
		//*  37   84:goto            56
		}

		public com.google.android.gms.common.api.Api.zze zzvr()
		{
			return zzazq;
		//    0    0:aload_0         
		//    1    1:getfield        #90  <Field com.google.android.gms.common.api.Api$zze zzazq>
		//    2    4:areturn         
		}

		public Map zzwc()
		{
			return zzaBc;
		//    0    0:aload_0         
		//    1    1:getfield        #71  <Field Map zzaBc>
		//    2    4:areturn         
		}

		public void zzwd()
		{
			zzac.zza(com.google.android.gms.internal.zzaap.zza(zzaBg));
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field zzaap zzaBg>
		//    2    4:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaap.zza(zzaap)>
		//    3    7:invokestatic    #273 <Method void zzac.zza(Handler)>
			zzaBf = null;
		//    4   10:aload_0         
		//    5   11:aconst_null     
		//    6   12:putfield        #73  <Field ConnectionResult zzaBf>
		//    7   15:return          
		}

		public ConnectionResult zzwe()
		{
			zzac.zza(com.google.android.gms.internal.zzaap.zza(zzaBg));
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field zzaap zzaBg>
		//    2    4:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaap.zza(zzaap)>
		//    3    7:invokestatic    #273 <Method void zzac.zza(Handler)>
			return zzaBf;
		//    4   10:aload_0         
		//    5   11:getfield        #73  <Field ConnectionResult zzaBf>
		//    6   14:areturn         
		}

		public void zzwh()
		{
label0:
			{
				zzac.zza(com.google.android.gms.internal.zzaap.zza(zzaBg));
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field zzaap zzaBg>
		//    2    4:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaap.zza(zzaap)>
		//    3    7:invokestatic    #273 <Method void zzac.zza(Handler)>
				if(zzazq.isConnected() && zzaBc.size() == 0)
		//*   4   10:aload_0         
		//*   5   11:getfield        #90  <Field com.google.android.gms.common.api.Api$zze zzazq>
		//*   6   14:invokeinterface #246 <Method boolean com.google.android.gms.common.api.Api$zze.isConnected()>
		//*   7   19:ifeq            48
		//*   8   22:aload_0         
		//*   9   23:getfield        #71  <Field Map zzaBc>
		//*  10   26:invokeinterface #459 <Method int Map.size()>
		//*  11   31:ifne            48
				{
					if(!zzaBa.zzvu())
						break label0;
		//   12   34:aload_0         
		//   13   35:getfield        #109 <Field zzaad zzaBa>
		//   14   38:invokevirtual   #462 <Method boolean zzaad.zzvu()>
		//   15   41:ifeq            49
					zzwg();
		//   16   44:aload_0         
		//   17   45:invokespecial   #220 <Method void zzwg()>
				}
				return;
		//   18   48:return          
			}
			zzazq.disconnect();
		//   19   49:aload_0         
		//   20   50:getfield        #90  <Field com.google.android.gms.common.api.Api$zze zzazq>
		//   21   53:invokeinterface #154 <Method void com.google.android.gms.common.api.Api$zze.disconnect()>
		//   22   58:return          
		}

		private final Queue zzaAY = new LinkedList();
		private final com.google.android.gms.common.api.Api.zzb zzaAZ;
		private boolean zzaAm;
		private final zzaad zzaBa = new zzaad();
		private final Set zzaBb = new HashSet();
		private final Map zzaBc = new HashMap();
		private final int zzaBd;
		private final zzabj zzaBe;
		private ConnectionResult zzaBf;
		final zzaap zzaBg;
		private final zzzs zzaxH;
		private final com.google.android.gms.common.api.Api.zze zzazq;

		public zza(zzc zzc1)
		{
			zzaBg = zzaap.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #53  <Field zzaap zzaBg>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #56  <Method void Object()>
		//    5    9:aload_0         
		//    6   10:new             #58  <Class LinkedList>
		//    7   13:dup             
		//    8   14:invokespecial   #59  <Method void LinkedList()>
		//    9   17:putfield        #61  <Field Queue zzaAY>
		//   10   20:aload_0         
		//   11   21:new             #63  <Class HashSet>
		//   12   24:dup             
		//   13   25:invokespecial   #64  <Method void HashSet()>
		//   14   28:putfield        #66  <Field Set zzaBb>
		//   15   31:aload_0         
		//   16   32:new             #68  <Class HashMap>
		//   17   35:dup             
		//   18   36:invokespecial   #69  <Method void HashMap()>
		//   19   39:putfield        #71  <Field Map zzaBc>
			zzaBf = null;
		//   20   42:aload_0         
		//   21   43:aconst_null     
		//   22   44:putfield        #73  <Field ConnectionResult zzaBf>
			zzazq = zzc1.buildApiClient(com.google.android.gms.internal.zzaap.zza(zzaap.this).getLooper(), this);
		//   23   47:aload_0         
		//   24   48:aload_2         
		//   25   49:aload_1         
		//   26   50:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaap.zza(zzaap)>
		//   27   53:invokevirtual   #82  <Method Looper Handler.getLooper()>
		//   28   56:aload_0         
		//   29   57:invokevirtual   #88  <Method com.google.android.gms.common.api.Api$zze zzc.buildApiClient(Looper, zzaap$zza)>
		//   30   60:putfield        #90  <Field com.google.android.gms.common.api.Api$zze zzazq>
			if(zzazq instanceof zzal)
		//*  31   63:aload_0         
		//*  32   64:getfield        #90  <Field com.google.android.gms.common.api.Api$zze zzazq>
		//*  33   67:instanceof      #92  <Class zzal>
		//*  34   70:ifeq            143
				zzaAZ = ((com.google.android.gms.common.api.Api.zzb) (((zzal)zzazq).zzxG()));
		//   35   73:aload_0         
		//   36   74:aload_0         
		//   37   75:getfield        #90  <Field com.google.android.gms.common.api.Api$zze zzazq>
		//   38   78:checkcast       #92  <Class zzal>
		//   39   81:invokevirtual   #96  <Method com.google.android.gms.common.api.Api$zzg zzal.zzxG()>
		//   40   84:putfield        #98  <Field com.google.android.gms.common.api.Api$zzb zzaAZ>
			else
		//*  41   87:aload_0         
		//*  42   88:aload_2         
		//*  43   89:invokevirtual   #102 <Method zzzs zzc.getApiKey()>
		//*  44   92:putfield        #104 <Field zzzs zzaxH>
		//*  45   95:aload_0         
		//*  46   96:new             #106 <Class zzaad>
		//*  47   99:dup             
		//*  48  100:invokespecial   #107 <Method void zzaad()>
		//*  49  103:putfield        #109 <Field zzaad zzaBa>
		//*  50  106:aload_0         
		//*  51  107:aload_2         
		//*  52  108:invokevirtual   #113 <Method int zzc.getInstanceId()>
		//*  53  111:putfield        #115 <Field int zzaBd>
		//*  54  114:aload_0         
		//*  55  115:getfield        #90  <Field com.google.android.gms.common.api.Api$zze zzazq>
		//*  56  118:invokeinterface #121 <Method boolean com.google.android.gms.common.api.Api$zze.zzqD()>
		//*  57  123:ifeq            154
		//*  58  126:aload_0         
		//*  59  127:aload_2         
		//*  60  128:aload_1         
		//*  61  129:invokestatic    #125 <Method Context zzaap.zzb(zzaap)>
		//*  62  132:aload_1         
		//*  63  133:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaap.zza(zzaap)>
		//*  64  136:invokevirtual   #129 <Method zzabj zzc.createSignInCoordinator(Context, Handler)>
		//*  65  139:putfield        #131 <Field zzabj zzaBe>
		//*  66  142:return          
				zzaAZ = ((com.google.android.gms.common.api.Api.zzb) (zzazq));
		//   67  143:aload_0         
		//   68  144:aload_0         
		//   69  145:getfield        #90  <Field com.google.android.gms.common.api.Api$zze zzazq>
		//   70  148:putfield        #98  <Field com.google.android.gms.common.api.Api$zzb zzaAZ>
			zzaxH = zzc1.getApiKey();
			zzaBd = zzc1.getInstanceId();
			if(zzazq.zzqD())
			{
				zzaBe = zzc1.createSignInCoordinator(zzaap.zzb(zzaap.this), com.google.android.gms.internal.zzaap.zza(zzaap.this));
				return;
			} else
		//*  71  151:goto            87
			{
				zzaBe = null;
		//   72  154:aload_0         
		//   73  155:aconst_null     
		//   74  156:putfield        #131 <Field zzabj zzaBe>
				return;
		//   75  159:return          
			}
		}
	}

	private class zzb
		implements com.google.android.gms.common.internal.zzf.zzf, zzabj.zza
	{

		static com.google.android.gms.common.api.Api.zze zza(zzb zzb1)
		{
			return zzb1.zzazq;
		//    0    0:aload_0         
		//    1    1:getfield        #42  <Field com.google.android.gms.common.api.Api$zze zzazq>
		//    2    4:areturn         
		}

		static boolean zza(zzb zzb1, boolean flag)
		{
			zzb1.zzaBj = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #40  <Field boolean zzaBj>
			return flag;
		//    3    5:iload_1         
		//    4    6:ireturn         
		}

		static void zzb(zzb zzb1)
		{
			zzb1.zzwi();
		//    0    0:aload_0         
		//    1    1:invokespecial   #54  <Method void zzwi()>
		//    2    4:return          
		}

		static zzzs zzc(zzb zzb1)
		{
			return zzb1.zzaxH;
		//    0    0:aload_0         
		//    1    1:getfield        #44  <Field zzzs zzaxH>
		//    2    4:areturn         
		}

		private void zzwi()
		{
			if(zzaBj && zzazW != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #40  <Field boolean zzaBj>
		//*   2    4:ifeq            31
		//*   3    7:aload_0         
		//*   4    8:getfield        #36  <Field zzr zzazW>
		//*   5   11:ifnull          31
				zzazq.zza(zzazW, zzajm);
		//    6   14:aload_0         
		//    7   15:getfield        #42  <Field com.google.android.gms.common.api.Api$zze zzazq>
		//    8   18:aload_0         
		//    9   19:getfield        #36  <Field zzr zzazW>
		//   10   22:aload_0         
		//   11   23:getfield        #38  <Field Set zzajm>
		//   12   26:invokeinterface #62  <Method void com.google.android.gms.common.api.Api$zze.zza(zzr, Set)>
		//   13   31:return          
		}

		public void zzb(zzr zzr, Set set)
		{
			if(zzr == null || set == null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          8
		//*   2    4:aload_2         
		//*   3    5:ifnonnull       36
			{
				Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", ((Throwable) (new Exception())));
		//    4    8:ldc1            #65  <String "GoogleApiManager">
		//    5   10:ldc1            #67  <String "Received null response from onSignInSuccess">
		//    6   12:new             #69  <Class Exception>
		//    7   15:dup             
		//    8   16:invokespecial   #70  <Method void Exception()>
		//    9   19:invokestatic    #76  <Method int Log.wtf(String, String, Throwable)>
		//   10   22:pop             
				zzi(new ConnectionResult(4));
		//   11   23:aload_0         
		//   12   24:new             #78  <Class ConnectionResult>
		//   13   27:dup             
		//   14   28:iconst_4        
		//   15   29:invokespecial   #81  <Method void ConnectionResult(int)>
		//   16   32:invokevirtual   #85  <Method void zzi(ConnectionResult)>
				return;
		//   17   35:return          
			} else
			{
				zzazW = zzr;
		//   18   36:aload_0         
		//   19   37:aload_1         
		//   20   38:putfield        #36  <Field zzr zzazW>
				zzajm = set;
		//   21   41:aload_0         
		//   22   42:aload_2         
		//   23   43:putfield        #38  <Field Set zzajm>
				zzwi();
		//   24   46:aload_0         
		//   25   47:invokespecial   #54  <Method void zzwi()>
				return;
		//   26   50:return          
			}
		}

		public void zzg(ConnectionResult connectionresult)
		{
			com.google.android.gms.internal.zzaap.zza(zzaBg).post(new Runnable(this, connectionresult) {

				public void run()
				{
					if(zzaBi.isSuccess())
				//*   0    0:aload_0         
				//*   1    1:getfield        #24  <Field ConnectionResult zzaBi>
				//*   2    4:invokevirtual   #35  <Method boolean ConnectionResult.isSuccess()>
				//*   3    7:ifeq            59
					{
						com.google.android.gms.internal.zzb.zza(zzaBk, true);
				//    4   10:aload_0         
				//    5   11:getfield        #22  <Field zzaap$zzb zzaBk>
				//    6   14:iconst_1        
				//    7   15:invokestatic    #39  <Method boolean com.google.android.gms.internal.zzaap$zzb.zza(zzaap$zzb, boolean)>
				//    8   18:pop             
						if(com.google.android.gms.internal.zzb.zza(zzaBk).zzqD())
				//*   9   19:aload_0         
				//*  10   20:getfield        #22  <Field zzaap$zzb zzaBk>
				//*  11   23:invokestatic    #42  <Method com.google.android.gms.common.api.Api$zze com.google.android.gms.internal.zzaap$zzb.zza(zzaap$zzb)>
				//*  12   26:invokeinterface #47  <Method boolean com.google.android.gms.common.api.Api$zze.zzqD()>
				//*  13   31:ifeq            42
						{
							zzb.zzb(zzaBk);
				//   14   34:aload_0         
				//   15   35:getfield        #22  <Field zzaap$zzb zzaBk>
				//   16   38:invokestatic    #50  <Method void zzaap$zzb.zzb(zzaap$zzb)>
							return;
				//   17   41:return          
						} else
						{
							com.google.android.gms.internal.zzb.zza(zzaBk).zza(((zzr) (null)), Collections.emptySet());
				//   18   42:aload_0         
				//   19   43:getfield        #22  <Field zzaap$zzb zzaBk>
				//   20   46:invokestatic    #42  <Method com.google.android.gms.common.api.Api$zze com.google.android.gms.internal.zzaap$zzb.zza(zzaap$zzb)>
				//   21   49:aconst_null     
				//   22   50:invokestatic    #56  <Method Set Collections.emptySet()>
				//   23   53:invokeinterface #59  <Method void com.google.android.gms.common.api.Api$zze.zza(zzr, Set)>
							return;
				//   24   58:return          
						}
					} else
					{
						((zza)zzaap.zzj(zzaBk.zzaBg).get(((Object) (com.google.android.gms.internal.zzb.zzc(zzaBk))))).onConnectionFailed(zzaBi);
				//   25   59:aload_0         
				//   26   60:getfield        #22  <Field zzaap$zzb zzaBk>
				//   27   63:getfield        #63  <Field zzaap zzaap$zzb.zzaBg>
				//   28   66:invokestatic    #67  <Method Map zzaap.zzj(zzaap)>
				//   29   69:aload_0         
				//   30   70:getfield        #22  <Field zzaap$zzb zzaBk>
				//   31   73:invokestatic    #71  <Method zzzs com.google.android.gms.internal.zzaap$zzb.zzc(zzaap$zzb)>
				//   32   76:invokeinterface #77  <Method Object Map.get(Object)>
				//   33   81:checkcast       #79  <Class zzaap$zza>
				//   34   84:aload_0         
				//   35   85:getfield        #24  <Field ConnectionResult zzaBi>
				//   36   88:invokevirtual   #82  <Method void zzaap$zza.onConnectionFailed(ConnectionResult)>
						return;
				//   37   91:return          
					}
				}

				final ConnectionResult zzaBi;
				final zzb zzaBk;

			
			{
				zzaBk = zzb1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field zzaap$zzb zzaBk>
				zzaBi = connectionresult;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field ConnectionResult zzaBi>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
			}
);
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field zzaap zzaBg>
		//    2    4:invokestatic    #91  <Method Handler com.google.android.gms.internal.zzaap.zza(zzaap)>
		//    3    7:new             #13  <Class zzaap$zzb$1>
		//    4   10:dup             
		//    5   11:aload_0         
		//    6   12:aload_1         
		//    7   13:invokespecial   #94  <Method void zzaap$zzb$1(zzaap$zzb, ConnectionResult)>
		//    8   16:invokevirtual   #100 <Method boolean Handler.post(Runnable)>
		//    9   19:pop             
		//   10   20:return          
		}

		public void zzi(ConnectionResult connectionresult)
		{
			((zza)zzaap.zzj(zzaBg).get(((Object) (zzaxH)))).zzi(connectionresult);
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field zzaap zzaBg>
		//    2    4:invokestatic    #105 <Method Map zzaap.zzj(zzaap)>
		//    3    7:aload_0         
		//    4    8:getfield        #44  <Field zzzs zzaxH>
		//    5   11:invokeinterface #111 <Method Object Map.get(Object)>
		//    6   16:checkcast       #113 <Class zzaap$zza>
		//    7   19:aload_1         
		//    8   20:invokevirtual   #114 <Method void zzaap$zza.zzi(ConnectionResult)>
		//    9   23:return          
		}

		final zzaap zzaBg;
		private boolean zzaBj;
		private Set zzajm;
		private final zzzs zzaxH;
		private zzr zzazW;
		private final com.google.android.gms.common.api.Api.zze zzazq;

		public zzb(com.google.android.gms.common.api.Api.zze zze1, zzzs zzzs1)
		{
			zzaBg = zzaap.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #31  <Field zzaap zzaBg>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #34  <Method void Object()>
			zzazW = null;
		//    5    9:aload_0         
		//    6   10:aconst_null     
		//    7   11:putfield        #36  <Field zzr zzazW>
			zzajm = null;
		//    8   14:aload_0         
		//    9   15:aconst_null     
		//   10   16:putfield        #38  <Field Set zzajm>
			zzaBj = false;
		//   11   19:aload_0         
		//   12   20:iconst_0        
		//   13   21:putfield        #40  <Field boolean zzaBj>
			zzazq = zze1;
		//   14   24:aload_0         
		//   15   25:aload_2         
		//   16   26:putfield        #42  <Field com.google.android.gms.common.api.Api$zze zzazq>
			zzaxH = zzzs1;
		//   17   29:aload_0         
		//   18   30:aload_3         
		//   19   31:putfield        #44  <Field zzzs zzaxH>
		//   20   34:return          
		}
	}


	private zzaap(Context context, Looper looper, GoogleApiAvailability googleapiavailability)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #69  <Method void Object()>
		zzaAo = 5000L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #74  <Long 5000L>
	//    4    8:putfield        #77  <Field long zzaAo>
		zzaAn = 0x1d4c0L;
	//    5   11:aload_0         
	//    6   12:ldc2w           #78  <Long 0x1d4c0L>
	//    7   15:putfield        #81  <Field long zzaAn>
		zzaAQ = 10000L;
	//    8   18:aload_0         
	//    9   19:ldc2w           #82  <Long 10000L>
	//   10   22:putfield        #85  <Field long zzaAQ>
		zzaAS = -1;
	//   11   25:aload_0         
	//   12   26:iconst_m1       
	//   13   27:putfield        #87  <Field int zzaAS>
	//   14   30:aload_0         
	//   15   31:new             #89  <Class AtomicInteger>
	//   16   34:dup             
	//   17   35:iconst_1        
	//   18   36:invokespecial   #92  <Method void AtomicInteger(int)>
	//   19   39:putfield        #94  <Field AtomicInteger zzaAT>
	//   20   42:aload_0         
	//   21   43:new             #89  <Class AtomicInteger>
	//   22   46:dup             
	//   23   47:iconst_0        
	//   24   48:invokespecial   #92  <Method void AtomicInteger(int)>
	//   25   51:putfield        #96  <Field AtomicInteger zzaAU>
	//   26   54:aload_0         
	//   27   55:new             #98  <Class ConcurrentHashMap>
	//   28   58:dup             
	//   29   59:iconst_5        
	//   30   60:ldc1            #99  <Float 0.75F>
	//   31   62:iconst_1        
	//   32   63:invokespecial   #102 <Method void ConcurrentHashMap(int, float, int)>
	//   33   66:putfield        #104 <Field Map zzazt>
		zzaAV = null;
	//   34   69:aload_0         
	//   35   70:aconst_null     
	//   36   71:putfield        #106 <Field zzaae zzaAV>
	//   37   74:aload_0         
	//   38   75:new             #108 <Class zza>
	//   39   78:dup             
	//   40   79:invokespecial   #109 <Method void zza()>
	//   41   82:putfield        #111 <Field Set zzaAW>
	//   42   85:aload_0         
	//   43   86:new             #108 <Class zza>
	//   44   89:dup             
	//   45   90:invokespecial   #109 <Method void zza()>
	//   46   93:putfield        #113 <Field Set zzaAX>
		mContext = context;
	//   47   96:aload_0         
	//   48   97:aload_1         
	//   49   98:putfield        #115 <Field Context mContext>
		mHandler = new Handler(looper, ((android.os.Handler.Callback) (this)));
	//   50  101:aload_0         
	//   51  102:new             #117 <Class Handler>
	//   52  105:dup             
	//   53  106:aload_2         
	//   54  107:aload_0         
	//   55  108:invokespecial   #120 <Method void Handler(Looper, android.os.Handler$Callback)>
	//   56  111:putfield        #122 <Field Handler mHandler>
		zzaxX = googleapiavailability;
	//   57  114:aload_0         
	//   58  115:aload_3         
	//   59  116:putfield        #124 <Field GoogleApiAvailability zzaxX>
	//   60  119:return          
	}

	static int zza(zzaap zzaap1, int i)
	{
		zzaap1.zzaAS = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #87  <Field int zzaAS>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static Handler zza(zzaap zzaap1)
	{
		return zzaap1.mHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field Handler mHandler>
	//    2    4:areturn         
	}

	private void zza(int i, ConnectionResult connectionresult)
	{
		Iterator iterator = zzazt.values().iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field Map zzazt>
	//    2    4:invokeinterface #134 <Method Collection Map.values()>
	//    3    9:invokeinterface #140 <Method Iterator Collection.iterator()>
	//    4   14:astore          4
_L4:
		if(!iterator.hasNext()) goto _L2; else goto _L1
	//    5   16:aload           4
	//    6   18:invokeinterface #146 <Method boolean Iterator.hasNext()>
	//    7   23:ifeq            175
_L1:
		zza zza1 = (zza)iterator.next();
	//    8   26:aload           4
	//    9   28:invokeinterface #150 <Method Object Iterator.next()>
	//   10   33:checkcast       #8   <Class zzaap$zza>
	//   11   36:astore_3        
		if(zza1.getInstanceId() != i) goto _L4; else goto _L3
	//   12   37:aload_3         
	//   13   38:invokevirtual   #154 <Method int zzaap$zza.getInstanceId()>
	//   14   41:iload_1         
	//   15   42:icmpne          16
_L3:
		if(zza1 != null)
	//*  16   45:aload_3         
	//*  17   46:ifnull          135
		{
			String s = String.valueOf(((Object) (zzaxX.getErrorString(connectionresult.getErrorCode()))));
	//   18   49:aload_0         
	//   19   50:getfield        #124 <Field GoogleApiAvailability zzaxX>
	//   20   53:aload_2         
	//   21   54:invokevirtual   #159 <Method int ConnectionResult.getErrorCode()>
	//   22   57:invokevirtual   #165 <Method String GoogleApiAvailability.getErrorString(int)>
	//   23   60:invokestatic    #171 <Method String String.valueOf(Object)>
	//   24   63:astore          4
			connectionresult = ((ConnectionResult) (String.valueOf(((Object) (connectionresult.getErrorMessage())))));
	//   25   65:aload_2         
	//   26   66:invokevirtual   #175 <Method String ConnectionResult.getErrorMessage()>
	//   27   69:invokestatic    #171 <Method String String.valueOf(Object)>
	//   28   72:astore_2        
			zza1.zzC(new Status(17, (new StringBuilder(String.valueOf(((Object) (s))).length() + 69 + String.valueOf(((Object) (connectionresult))).length())).append("Error resolution was canceled by the user, original error message: ").append(s).append(": ").append(((String) (connectionresult))).toString()));
	//   29   73:aload_3         
	//   30   74:new             #55  <Class Status>
	//   31   77:dup             
	//   32   78:bipush          17
	//   33   80:new             #177 <Class StringBuilder>
	//   34   83:dup             
	//   35   84:aload           4
	//   36   86:invokestatic    #171 <Method String String.valueOf(Object)>
	//   37   89:invokevirtual   #180 <Method int String.length()>
	//   38   92:bipush          69
	//   39   94:iadd            
	//   40   95:aload_2         
	//   41   96:invokestatic    #171 <Method String String.valueOf(Object)>
	//   42   99:invokevirtual   #180 <Method int String.length()>
	//   43  102:iadd            
	//   44  103:invokespecial   #181 <Method void StringBuilder(int)>
	//   45  106:ldc1            #183 <String "Error resolution was canceled by the user, original error message: ">
	//   46  108:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//   47  111:aload           4
	//   48  113:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//   49  116:ldc1            #189 <String ": ">
	//   50  118:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//   51  121:aload_2         
	//   52  122:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//   53  125:invokevirtual   #192 <Method String StringBuilder.toString()>
	//   54  128:invokespecial   #61  <Method void Status(int, String)>
	//   55  131:invokevirtual   #196 <Method void zzaap$zza.zzC(Status)>
			return;
	//   56  134:return          
		} else
		{
			Log.wtf("GoogleApiManager", (new StringBuilder(76)).append("Could not find API instance ").append(i).append(" while trying to fail enqueued calls.").toString(), ((Throwable) (new Exception())));
	//   57  135:ldc1            #198 <String "GoogleApiManager">
	//   58  137:new             #177 <Class StringBuilder>
	//   59  140:dup             
	//   60  141:bipush          76
	//   61  143:invokespecial   #181 <Method void StringBuilder(int)>
	//   62  146:ldc1            #200 <String "Could not find API instance ">
	//   63  148:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//   64  151:iload_1         
	//   65  152:invokevirtual   #203 <Method StringBuilder StringBuilder.append(int)>
	//   66  155:ldc1            #205 <String " while trying to fail enqueued calls.">
	//   67  157:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//   68  160:invokevirtual   #192 <Method String StringBuilder.toString()>
	//   69  163:new             #207 <Class Exception>
	//   70  166:dup             
	//   71  167:invokespecial   #208 <Method void Exception()>
	//   72  170:invokestatic    #214 <Method int Log.wtf(String, String, Throwable)>
	//   73  173:pop             
			return;
	//   74  174:return          
		}
_L2:
		zza1 = null;
	//   75  175:aconst_null     
	//   76  176:astore_3        
		if(true) goto _L3; else goto _L5
	//   77  177:goto            45
_L5:
	}

	private void zza(zzabd zzabd1)
	{
		zza zza2 = (zza)zzazt.get(((Object) (zzabd1.zzaBF.getApiKey())));
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field Map zzazt>
	//    2    4:aload_1         
	//    3    5:getfield        #222 <Field zzc zzabd.zzaBF>
	//    4    8:invokevirtual   #228 <Method zzzs zzc.getApiKey()>
	//    5   11:invokeinterface #232 <Method Object Map.get(Object)>
	//    6   16:checkcast       #8   <Class zzaap$zza>
	//    7   19:astore_3        
		zza zza1 = zza2;
	//    8   20:aload_3         
	//    9   21:astore_2        
		if(zza2 == null)
	//*  10   22:aload_3         
	//*  11   23:ifnonnull       54
		{
			zzb(zzabd1.zzaBF);
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:getfield        #222 <Field zzc zzabd.zzaBF>
	//   15   31:invokespecial   #235 <Method void zzb(zzc)>
			zza1 = (zza)zzazt.get(((Object) (zzabd1.zzaBF.getApiKey())));
	//   16   34:aload_0         
	//   17   35:getfield        #104 <Field Map zzazt>
	//   18   38:aload_1         
	//   19   39:getfield        #222 <Field zzc zzabd.zzaBF>
	//   20   42:invokevirtual   #228 <Method zzzs zzc.getApiKey()>
	//   21   45:invokeinterface #232 <Method Object Map.get(Object)>
	//   22   50:checkcast       #8   <Class zzaap$zza>
	//   23   53:astore_2        
		}
		if(zza1.zzqD() && zzaAU.get() != zzabd1.zzaBE)
	//*  24   54:aload_2         
	//*  25   55:invokevirtual   #238 <Method boolean zzaap$zza.zzqD()>
	//*  26   58:ifeq            90
	//*  27   61:aload_0         
	//*  28   62:getfield        #96  <Field AtomicInteger zzaAU>
	//*  29   65:invokevirtual   #240 <Method int AtomicInteger.get()>
	//*  30   68:aload_1         
	//*  31   69:getfield        #243 <Field int zzabd.zzaBE>
	//*  32   72:icmpeq          90
		{
			zzabd1.zzaBD.zzy(zzaAO);
	//   33   75:aload_1         
	//   34   76:getfield        #247 <Field zzzq zzabd.zzaBD>
	//   35   79:getstatic       #63  <Field Status zzaAO>
	//   36   82:invokevirtual   #252 <Method void zzzq.zzy(Status)>
			zza1.signOut();
	//   37   85:aload_2         
	//   38   86:invokevirtual   #255 <Method void zzaap$zza.signOut()>
			return;
	//   39   89:return          
		} else
		{
			zza1.zza(zzabd1.zzaBD);
	//   40   90:aload_2         
	//   41   91:aload_1         
	//   42   92:getfield        #247 <Field zzzq zzabd.zzaBD>
	//   43   95:invokevirtual   #258 <Method void com.google.android.gms.internal.zzaap$zza.zza(zzzq)>
			return;
	//   44   98:return          
		}
	}

	private void zza(zzzu zzzu1)
	{
		Iterator iterator = zzzu1.zzuY().iterator();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #265 <Method Set zzzu.zzuY()>
	//    2    4:invokeinterface #268 <Method Iterator Set.iterator()>
	//    3    9:astore_2        
		do
		{
			zzzs zzzs1;
			zza zza1;
label0:
			{
				if(iterator.hasNext())
	//*   4   10:aload_2         
	//*   5   11:invokeinterface #146 <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            63
				{
					zzzs1 = (zzzs)iterator.next();
	//    7   19:aload_2         
	//    8   20:invokeinterface #150 <Method Object Iterator.next()>
	//    9   25:checkcast       #270 <Class zzzs>
	//   10   28:astore_3        
					zza1 = (zza)zzazt.get(((Object) (zzzs1)));
	//   11   29:aload_0         
	//   12   30:getfield        #104 <Field Map zzazt>
	//   13   33:aload_3         
	//   14   34:invokeinterface #232 <Method Object Map.get(Object)>
	//   15   39:checkcast       #8   <Class zzaap$zza>
	//   16   42:astore          4
					if(zza1 != null)
						break label0;
	//   17   44:aload           4
	//   18   46:ifnonnull       64
					zzzu1.zza(zzzs1, new ConnectionResult(13));
	//   19   49:aload_1         
	//   20   50:aload_3         
	//   21   51:new             #156 <Class ConnectionResult>
	//   22   54:dup             
	//   23   55:bipush          13
	//   24   57:invokespecial   #271 <Method void ConnectionResult(int)>
	//   25   60:invokevirtual   #274 <Method void com.google.android.gms.internal.zzzu.zza(zzzs, ConnectionResult)>
				}
				return;
	//   26   63:return          
			}
			if(zza1.isConnected())
	//*  27   64:aload           4
	//*  28   66:invokevirtual   #277 <Method boolean zzaap$zza.isConnected()>
	//*  29   69:ifeq            83
				zzzu1.zza(zzzs1, ConnectionResult.zzawX);
	//   30   72:aload_1         
	//   31   73:aload_3         
	//   32   74:getstatic       #281 <Field ConnectionResult ConnectionResult.zzawX>
	//   33   77:invokevirtual   #274 <Method void com.google.android.gms.internal.zzzu.zza(zzzs, ConnectionResult)>
			else
	//*  34   80:goto            10
			if(zza1.zzwe() != null)
	//*  35   83:aload           4
	//*  36   85:invokevirtual   #285 <Method ConnectionResult zzaap$zza.zzwe()>
	//*  37   88:ifnull          104
				zzzu1.zza(zzzs1, zza1.zzwe());
	//   38   91:aload_1         
	//   39   92:aload_3         
	//   40   93:aload           4
	//   41   95:invokevirtual   #285 <Method ConnectionResult zzaap$zza.zzwe()>
	//   42   98:invokevirtual   #274 <Method void com.google.android.gms.internal.zzzu.zza(zzzs, ConnectionResult)>
			else
	//*  43  101:goto            10
				zza1.zzb(zzzu1);
	//   44  104:aload           4
	//   45  106:aload_1         
	//   46  107:invokevirtual   #287 <Method void zzaap$zza.zzb(zzzu)>
		} while(true);
	//   47  110:goto            10
	}

	public static zzaap zzax(Context context)
	{
		synchronized(zztU)
	//*   0    0:getstatic       #71  <Field Object zztU>
	//*   1    3:astore_1        
	//*   2    4:aload_1         
	//*   3    5:monitorenter    
		{
			if(zzaAR == null)
	//*   4    6:getstatic       #291 <Field zzaap zzaAR>
	//*   5    9:ifnonnull       34
			{
				Looper looper = zzvT();
	//    6   12:invokestatic    #295 <Method Looper zzvT()>
	//    7   15:astore_2        
				zzaAR = new zzaap(context.getApplicationContext(), looper, GoogleApiAvailability.getInstance());
	//    8   16:new             #2   <Class zzaap>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:invokevirtual   #301 <Method Context Context.getApplicationContext()>
	//   12   24:aload_2         
	//   13   25:invokestatic    #305 <Method GoogleApiAvailability GoogleApiAvailability.getInstance()>
	//   14   28:invokespecial   #307 <Method void zzaap(Context, Looper, GoogleApiAvailability)>
	//   15   31:putstatic       #291 <Field zzaap zzaAR>
			}
			context = ((Context) (zzaAR));
	//   16   34:getstatic       #291 <Field zzaap zzaAR>
	//   17   37:astore_0        
		}
	//   18   38:aload_1         
	//   19   39:monitorexit     
		return ((zzaap) (context));
	//   20   40:aload_0         
	//   21   41:areturn         
		context;
	//   22   42:astore_0        
		obj;
	//   23   43:aload_1         
		JVM INSTR monitorexit ;
	//   24   44:monitorexit     
		throw context;
	//   25   45:aload_0         
	//   26   46:athrow          
	}

	static Context zzb(zzaap zzaap1)
	{
		return zzaap1.mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field Context mContext>
	//    2    4:areturn         
	}

	private void zzb(zzc zzc1)
	{
		zzzs zzzs1 = zzc1.getApiKey();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #228 <Method zzzs zzc.getApiKey()>
	//    2    4:astore_2        
		if(!zzazt.containsKey(((Object) (zzzs1))))
	//*   3    5:aload_0         
	//*   4    6:getfield        #104 <Field Map zzazt>
	//*   5    9:aload_2         
	//*   6   10:invokeinterface #312 <Method boolean Map.containsKey(Object)>
	//*   7   15:ifne            38
			zzazt.put(((Object) (zzzs1)), ((Object) (new zza(zzc1))));
	//    8   18:aload_0         
	//    9   19:getfield        #104 <Field Map zzazt>
	//   10   22:aload_2         
	//   11   23:new             #8   <Class zzaap$zza>
	//   12   26:dup             
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:invokespecial   #315 <Method void zzaap$zza(zzaap, zzc)>
	//   16   32:invokeinterface #319 <Method Object Map.put(Object, Object)>
	//   17   37:pop             
		zzc1 = ((zzc) ((zza)zzazt.get(((Object) (zzzs1)))));
	//   18   38:aload_0         
	//   19   39:getfield        #104 <Field Map zzazt>
	//   20   42:aload_2         
	//   21   43:invokeinterface #232 <Method Object Map.get(Object)>
	//   22   48:checkcast       #8   <Class zzaap$zza>
	//   23   51:astore_1        
		if(((zza) (zzc1)).zzqD())
	//*  24   52:aload_1         
	//*  25   53:invokevirtual   #238 <Method boolean zzaap$zza.zzqD()>
	//*  26   56:ifeq            70
			zzaAX.add(((Object) (zzzs1)));
	//   27   59:aload_0         
	//   28   60:getfield        #113 <Field Set zzaAX>
	//   29   63:aload_2         
	//   30   64:invokeinterface #322 <Method boolean Set.add(Object)>
	//   31   69:pop             
		((zza) (zzc1)).connect();
	//   32   70:aload_1         
	//   33   71:invokevirtual   #325 <Method void zzaap$zza.connect()>
	//   34   74:return          
	}

	static long zzc(zzaap zzaap1)
	{
		return zzaap1.zzaAo;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field long zzaAo>
	//    2    4:lreturn         
	}

	static long zzd(zzaap zzaap1)
	{
		return zzaap1.zzaAn;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field long zzaAn>
	//    2    4:lreturn         
	}

	static zzaae zze(zzaap zzaap1)
	{
		return zzaap1.zzaAV;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field zzaae zzaAV>
	//    2    4:areturn         
	}

	static Set zzf(zzaap zzaap1)
	{
		return zzaap1.zzaAW;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field Set zzaAW>
	//    2    4:areturn         
	}

	static GoogleApiAvailability zzg(zzaap zzaap1)
	{
		return zzaap1.zzaxX;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field GoogleApiAvailability zzaxX>
	//    2    4:areturn         
	}

	static long zzh(zzaap zzaap1)
	{
		return zzaap1.zzaAQ;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field long zzaAQ>
	//    2    4:lreturn         
	}

	static int zzi(zzaap zzaap1)
	{
		return zzaap1.zzaAS;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field int zzaAS>
	//    2    4:ireturn         
	}

	static Map zzj(zzaap zzaap1)
	{
		return zzaap1.zzazt;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field Map zzazt>
	//    2    4:areturn         
	}

	public static zzaap zzvS()
	{
		zzaap zzaap1;
		synchronized(zztU)
	//*   0    0:getstatic       #71  <Field Object zztU>
	//*   1    3:astore_0        
	//*   2    4:aload_0         
	//*   3    5:monitorenter    
		{
			zzac.zzb(((Object) (zzaAR)), "Must guarantee manager is non-null before using getInstance");
	//    4    6:getstatic       #291 <Field zzaap zzaAR>
	//    5    9:ldc2            #345 <String "Must guarantee manager is non-null before using getInstance">
	//    6   12:invokestatic    #349 <Method Object zzac.zzb(Object, Object)>
	//    7   15:pop             
			zzaap1 = zzaAR;
	//    8   16:getstatic       #291 <Field zzaap zzaAR>
	//    9   19:astore_1        
		}
	//   10   20:aload_0         
	//   11   21:monitorexit     
		return zzaap1;
	//   12   22:aload_1         
	//   13   23:areturn         
		exception;
	//   14   24:astore_1        
		obj;
	//   15   25:aload_0         
		JVM INSTR monitorexit ;
	//   16   26:monitorexit     
		throw exception;
	//   17   27:aload_1         
	//   18   28:athrow          
	}

	private static Looper zzvT()
	{
		HandlerThread handlerthread = new HandlerThread("GoogleApiHandler", 9);
	//    0    0:new             #351 <Class HandlerThread>
	//    1    3:dup             
	//    2    4:ldc2            #353 <String "GoogleApiHandler">
	//    3    7:bipush          9
	//    4    9:invokespecial   #356 <Method void HandlerThread(String, int)>
	//    5   12:astore_0        
		handlerthread.start();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #359 <Method void HandlerThread.start()>
		return handlerthread.getLooper();
	//    8   17:aload_0         
	//    9   18:invokevirtual   #362 <Method Looper HandlerThread.getLooper()>
	//   10   21:areturn         
	}

	private void zzvV()
	{
		zza zza1;
		for(Iterator iterator = zzazt.values().iterator(); iterator.hasNext(); zza1.connect())
	//*   0    0:aload_0         
	//*   1    1:getfield        #104 <Field Map zzazt>
	//*   2    4:invokeinterface #134 <Method Collection Map.values()>
	//*   3    9:invokeinterface #140 <Method Iterator Collection.iterator()>
	//*   4   14:astore_1        
	//*   5   15:aload_1         
	//*   6   16:invokeinterface #146 <Method boolean Iterator.hasNext()>
	//*   7   21:ifeq            45
		{
			zza1 = (zza)iterator.next();
	//    8   24:aload_1         
	//    9   25:invokeinterface #150 <Method Object Iterator.next()>
	//   10   30:checkcast       #8   <Class zzaap$zza>
	//   11   33:astore_2        
			zza1.zzwd();
	//   12   34:aload_2         
	//   13   35:invokevirtual   #366 <Method void zzaap$zza.zzwd()>
		}

	//   14   38:aload_2         
	//   15   39:invokevirtual   #325 <Method void zzaap$zza.connect()>
	//*  16   42:goto            15
	//   17   45:return          
	}

	private void zzvW()
	{
		zzzs zzzs1;
		for(Iterator iterator = zzaAX.iterator(); iterator.hasNext(); ((zza)zzazt.remove(((Object) (zzzs1)))).signOut())
	//*   0    0:aload_0         
	//*   1    1:getfield        #113 <Field Set zzaAX>
	//*   2    4:invokeinterface #268 <Method Iterator Set.iterator()>
	//*   3    9:astore_1        
	//*   4   10:aload_1         
	//*   5   11:invokeinterface #146 <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            48
			zzzs1 = (zzzs)iterator.next();
	//    7   19:aload_1         
	//    8   20:invokeinterface #150 <Method Object Iterator.next()>
	//    9   25:checkcast       #270 <Class zzzs>
	//   10   28:astore_2        

	//   11   29:aload_0         
	//   12   30:getfield        #104 <Field Map zzazt>
	//   13   33:aload_2         
	//   14   34:invokeinterface #370 <Method Object Map.remove(Object)>
	//   15   39:checkcast       #8   <Class zzaap$zza>
	//   16   42:invokevirtual   #255 <Method void zzaap$zza.signOut()>
	//*  17   45:goto            10
		zzaAX.clear();
	//   18   48:aload_0         
	//   19   49:getfield        #113 <Field Set zzaAX>
	//   20   52:invokeinterface #373 <Method void Set.clear()>
	//   21   57:return          
	}

	static Status zzvX()
	{
		return zzaAP;
	//    0    0:getstatic       #67  <Field Status zzaAP>
	//    1    3:areturn         
	}

	static Object zzvY()
	{
		return zztU;
	//    0    0:getstatic       #71  <Field Object zztU>
	//    1    3:areturn         
	}

	public boolean handleMessage(Message message)
	{
		message.what;
	//    0    0:aload_1         
	//    1    1:getfield        #383 <Field int Message.what>
		JVM INSTR tableswitch 1 11: default 64
	//	               1 99
	//	               2 126
	//	               3 133
	//	               4 147
	//	               5 112
	//	               6 133
	//	               7 165
	//	               8 203
	//	               9 210
	//	               10 248
	//	               11 133;
	//    2    4:tableswitch     1 11: default 64
	//	               1 99
	//	               2 126
	//	               3 133
	//	               4 147
	//	               5 112
	//	               6 133
	//	               7 165
	//	               8 203
	//	               9 210
	//	               10 248
	//	               11 133
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L4 _L7 _L8 _L9 _L10 _L4
_L1:
		int i = message.what;
	//    3   64:aload_1         
	//    4   65:getfield        #383 <Field int Message.what>
	//    5   68:istore_2        
		Log.w("GoogleApiManager", (new StringBuilder(31)).append("Unknown message id: ").append(i).toString());
	//    6   69:ldc1            #198 <String "GoogleApiManager">
	//    7   71:new             #177 <Class StringBuilder>
	//    8   74:dup             
	//    9   75:bipush          31
	//   10   77:invokespecial   #181 <Method void StringBuilder(int)>
	//   11   80:ldc2            #385 <String "Unknown message id: ">
	//   12   83:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//   13   86:iload_2         
	//   14   87:invokevirtual   #203 <Method StringBuilder StringBuilder.append(int)>
	//   15   90:invokevirtual   #192 <Method String StringBuilder.toString()>
	//   16   93:invokestatic    #389 <Method int Log.w(String, String)>
	//   17   96:pop             
		return false;
	//   18   97:iconst_0        
	//   19   98:ireturn         
_L2:
		zza((zzzu)message.obj);
	//   20   99:aload_0         
	//   21  100:aload_1         
	//   22  101:getfield        #392 <Field Object Message.obj>
	//   23  104:checkcast       #261 <Class zzzu>
	//   24  107:invokespecial   #394 <Method void zza(zzzu)>
_L12:
		return true;
	//   25  110:iconst_1        
	//   26  111:ireturn         
_L6:
		zzb((zzc)message.obj);
	//   27  112:aload_0         
	//   28  113:aload_1         
	//   29  114:getfield        #392 <Field Object Message.obj>
	//   30  117:checkcast       #224 <Class zzc>
	//   31  120:invokespecial   #235 <Method void zzb(zzc)>
		continue; /* Loop/switch isn't completed */
	//   32  123:goto            110
_L3:
		zzvV();
	//   33  126:aload_0         
	//   34  127:invokespecial   #396 <Method void zzvV()>
		continue; /* Loop/switch isn't completed */
	//   35  130:goto            110
_L4:
		zza((zzabd)message.obj);
	//   36  133:aload_0         
	//   37  134:aload_1         
	//   38  135:getfield        #392 <Field Object Message.obj>
	//   39  138:checkcast       #218 <Class zzabd>
	//   40  141:invokespecial   #398 <Method void zza(zzabd)>
		continue; /* Loop/switch isn't completed */
	//   41  144:goto            110
_L5:
		zza(message.arg1, (ConnectionResult)message.obj);
	//   42  147:aload_0         
	//   43  148:aload_1         
	//   44  149:getfield        #401 <Field int Message.arg1>
	//   45  152:aload_1         
	//   46  153:getfield        #392 <Field Object Message.obj>
	//   47  156:checkcast       #156 <Class ConnectionResult>
	//   48  159:invokespecial   #403 <Method void zza(int, ConnectionResult)>
		continue; /* Loop/switch isn't completed */
	//   49  162:goto            110
_L7:
		if(zzazt.containsKey(message.obj))
	//*  50  165:aload_0         
	//*  51  166:getfield        #104 <Field Map zzazt>
	//*  52  169:aload_1         
	//*  53  170:getfield        #392 <Field Object Message.obj>
	//*  54  173:invokeinterface #312 <Method boolean Map.containsKey(Object)>
	//*  55  178:ifeq            110
			((zza)zzazt.get(message.obj)).resume();
	//   56  181:aload_0         
	//   57  182:getfield        #104 <Field Map zzazt>
	//   58  185:aload_1         
	//   59  186:getfield        #392 <Field Object Message.obj>
	//   60  189:invokeinterface #232 <Method Object Map.get(Object)>
	//   61  194:checkcast       #8   <Class zzaap$zza>
	//   62  197:invokevirtual   #406 <Method void zzaap$zza.resume()>
		continue; /* Loop/switch isn't completed */
	//   63  200:goto            110
_L8:
		zzvW();
	//   64  203:aload_0         
	//   65  204:invokespecial   #408 <Method void zzvW()>
		continue; /* Loop/switch isn't completed */
	//   66  207:goto            110
_L9:
		if(zzazt.containsKey(message.obj))
	//*  67  210:aload_0         
	//*  68  211:getfield        #104 <Field Map zzazt>
	//*  69  214:aload_1         
	//*  70  215:getfield        #392 <Field Object Message.obj>
	//*  71  218:invokeinterface #312 <Method boolean Map.containsKey(Object)>
	//*  72  223:ifeq            110
			((zza)zzazt.get(message.obj)).zzvJ();
	//   73  226:aload_0         
	//   74  227:getfield        #104 <Field Map zzazt>
	//   75  230:aload_1         
	//   76  231:getfield        #392 <Field Object Message.obj>
	//   77  234:invokeinterface #232 <Method Object Map.get(Object)>
	//   78  239:checkcast       #8   <Class zzaap$zza>
	//   79  242:invokevirtual   #411 <Method void zzaap$zza.zzvJ()>
		continue; /* Loop/switch isn't completed */
	//   80  245:goto            110
_L10:
		if(zzazt.containsKey(message.obj))
	//*  81  248:aload_0         
	//*  82  249:getfield        #104 <Field Map zzazt>
	//*  83  252:aload_1         
	//*  84  253:getfield        #392 <Field Object Message.obj>
	//*  85  256:invokeinterface #312 <Method boolean Map.containsKey(Object)>
	//*  86  261:ifeq            110
			((zza)zzazt.get(message.obj)).zzwh();
	//   87  264:aload_0         
	//   88  265:getfield        #104 <Field Map zzazt>
	//   89  268:aload_1         
	//   90  269:getfield        #392 <Field Object Message.obj>
	//   91  272:invokeinterface #232 <Method Object Map.get(Object)>
	//   92  277:checkcast       #8   <Class zzaap$zza>
	//   93  280:invokevirtual   #414 <Method void zzaap$zza.zzwh()>
		if(true) goto _L12; else goto _L11
	//   94  283:goto            110
_L11:
	}

	public Task zza(zzc zzc1, zzaaz.zzb zzb1)
	{
		TaskCompletionSource taskcompletionsource = new TaskCompletionSource();
	//    0    0:new             #418 <Class TaskCompletionSource>
	//    1    3:dup             
	//    2    4:invokespecial   #419 <Method void TaskCompletionSource()>
	//    3    7:astore_3        
		zzb1 = ((zzaaz.zzb) (new zzzq.zze(zzb1, taskcompletionsource)));
	//    4    8:new             #421 <Class zzzq$zze>
	//    5   11:dup             
	//    6   12:aload_2         
	//    7   13:aload_3         
	//    8   14:invokespecial   #424 <Method void zzzq$zze(zzaaz$zzb, TaskCompletionSource)>
	//    9   17:astore_2        
		mHandler.sendMessage(mHandler.obtainMessage(11, ((Object) (new zzabd(((zzzq) (zzb1)), zzaAU.get(), zzc1)))));
	//   10   18:aload_0         
	//   11   19:getfield        #122 <Field Handler mHandler>
	//   12   22:aload_0         
	//   13   23:getfield        #122 <Field Handler mHandler>
	//   14   26:bipush          11
	//   15   28:new             #218 <Class zzabd>
	//   16   31:dup             
	//   17   32:aload_2         
	//   18   33:aload_0         
	//   19   34:getfield        #96  <Field AtomicInteger zzaAU>
	//   20   37:invokevirtual   #240 <Method int AtomicInteger.get()>
	//   21   40:aload_1         
	//   22   41:invokespecial   #427 <Method void zzabd(zzzq, int, zzc)>
	//   23   44:invokevirtual   #431 <Method Message Handler.obtainMessage(int, Object)>
	//   24   47:invokevirtual   #434 <Method boolean Handler.sendMessage(Message)>
	//   25   50:pop             
		return taskcompletionsource.getTask();
	//   26   51:aload_3         
	//   27   52:invokevirtual   #438 <Method Task TaskCompletionSource.getTask()>
	//   28   55:areturn         
	}

	public Task zza(zzc zzc1, zzabe zzabe, zzabr zzabr)
	{
		TaskCompletionSource taskcompletionsource = new TaskCompletionSource();
	//    0    0:new             #418 <Class TaskCompletionSource>
	//    1    3:dup             
	//    2    4:invokespecial   #419 <Method void TaskCompletionSource()>
	//    3    7:astore          4
		zzabe = ((zzabe) (new zzzq.zzc(new zzabf(zzabe, zzabr), taskcompletionsource)));
	//    4    9:new             #443 <Class zzzq$zzc>
	//    5   12:dup             
	//    6   13:new             #445 <Class zzabf>
	//    7   16:dup             
	//    8   17:aload_2         
	//    9   18:aload_3         
	//   10   19:invokespecial   #448 <Method void zzabf(zzabe, zzabr)>
	//   11   22:aload           4
	//   12   24:invokespecial   #451 <Method void zzzq$zzc(zzabf, TaskCompletionSource)>
	//   13   27:astore_2        
		mHandler.sendMessage(mHandler.obtainMessage(6, ((Object) (new zzabd(((zzzq) (zzabe)), zzaAU.get(), zzc1)))));
	//   14   28:aload_0         
	//   15   29:getfield        #122 <Field Handler mHandler>
	//   16   32:aload_0         
	//   17   33:getfield        #122 <Field Handler mHandler>
	//   18   36:bipush          6
	//   19   38:new             #218 <Class zzabd>
	//   20   41:dup             
	//   21   42:aload_2         
	//   22   43:aload_0         
	//   23   44:getfield        #96  <Field AtomicInteger zzaAU>
	//   24   47:invokevirtual   #240 <Method int AtomicInteger.get()>
	//   25   50:aload_1         
	//   26   51:invokespecial   #427 <Method void zzabd(zzzq, int, zzc)>
	//   27   54:invokevirtual   #431 <Method Message Handler.obtainMessage(int, Object)>
	//   28   57:invokevirtual   #434 <Method boolean Handler.sendMessage(Message)>
	//   29   60:pop             
		return taskcompletionsource.getTask();
	//   30   61:aload           4
	//   31   63:invokevirtual   #438 <Method Task TaskCompletionSource.getTask()>
	//   32   66:areturn         
	}

	public Task zza(Iterable iterable)
	{
		zzzu zzzu1 = new zzzu(iterable);
	//    0    0:new             #261 <Class zzzu>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #456 <Method void zzzu(Iterable)>
	//    4    8:astore_2        
		for(iterable = ((Iterable) (iterable.iterator())); ((Iterator) (iterable)).hasNext();)
	//*   5    9:aload_1         
	//*   6   10:invokeinterface #459 <Method Iterator Iterable.iterator()>
	//*   7   15:astore_1        
	//*   8   16:aload_1         
	//*   9   17:invokeinterface #146 <Method boolean Iterator.hasNext()>
	//*  10   22:ifeq            85
		{
			Object obj = ((Object) ((zzc)((Iterator) (iterable)).next()));
	//   11   25:aload_1         
	//   12   26:invokeinterface #150 <Method Object Iterator.next()>
	//   13   31:checkcast       #224 <Class zzc>
	//   14   34:astore_3        
			obj = ((Object) ((zza)zzazt.get(((Object) (((zzc) (obj)).getApiKey())))));
	//   15   35:aload_0         
	//   16   36:getfield        #104 <Field Map zzazt>
	//   17   39:aload_3         
	//   18   40:invokevirtual   #228 <Method zzzs zzc.getApiKey()>
	//   19   43:invokeinterface #232 <Method Object Map.get(Object)>
	//   20   48:checkcast       #8   <Class zzaap$zza>
	//   21   51:astore_3        
			if(obj == null || !((zza) (obj)).isConnected())
	//*  22   52:aload_3         
	//*  23   53:ifnull          63
	//*  24   56:aload_3         
	//*  25   57:invokevirtual   #277 <Method boolean zzaap$zza.isConnected()>
	//*  26   60:ifne            16
			{
				mHandler.sendMessage(mHandler.obtainMessage(1, ((Object) (zzzu1))));
	//   27   63:aload_0         
	//   28   64:getfield        #122 <Field Handler mHandler>
	//   29   67:aload_0         
	//   30   68:getfield        #122 <Field Handler mHandler>
	//   31   71:iconst_1        
	//   32   72:aload_2         
	//   33   73:invokevirtual   #431 <Method Message Handler.obtainMessage(int, Object)>
	//   34   76:invokevirtual   #434 <Method boolean Handler.sendMessage(Message)>
	//   35   79:pop             
				return zzzu1.getTask();
	//   36   80:aload_2         
	//   37   81:invokevirtual   #460 <Method Task zzzu.getTask()>
	//   38   84:areturn         
			}
		}

		zzzu1.zzuZ();
	//   39   85:aload_2         
	//   40   86:invokevirtual   #463 <Method void zzzu.zzuZ()>
		return zzzu1.getTask();
	//   41   89:aload_2         
	//   42   90:invokevirtual   #460 <Method Task zzzu.getTask()>
	//   43   93:areturn         
	}

	public void zza(ConnectionResult connectionresult, int i)
	{
		if(!zzc(connectionresult, i))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:iload_2         
	//*   3    3:invokevirtual   #468 <Method boolean zzc(ConnectionResult, int)>
	//*   4    6:ifne            28
			mHandler.sendMessage(mHandler.obtainMessage(4, i, 0, ((Object) (connectionresult))));
	//    5    9:aload_0         
	//    6   10:getfield        #122 <Field Handler mHandler>
	//    7   13:aload_0         
	//    8   14:getfield        #122 <Field Handler mHandler>
	//    9   17:iconst_4        
	//   10   18:iload_2         
	//   11   19:iconst_0        
	//   12   20:aload_1         
	//   13   21:invokevirtual   #471 <Method Message Handler.obtainMessage(int, int, int, Object)>
	//   14   24:invokevirtual   #434 <Method boolean Handler.sendMessage(Message)>
	//   15   27:pop             
	//   16   28:return          
	}

	public void zza(zzc zzc1)
	{
		mHandler.sendMessage(mHandler.obtainMessage(5, ((Object) (zzc1))));
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field Handler mHandler>
	//    2    4:aload_0         
	//    3    5:getfield        #122 <Field Handler mHandler>
	//    4    8:iconst_5        
	//    5    9:aload_1         
	//    6   10:invokevirtual   #431 <Method Message Handler.obtainMessage(int, Object)>
	//    7   13:invokevirtual   #434 <Method boolean Handler.sendMessage(Message)>
	//    8   16:pop             
	//    9   17:return          
	}

	public void zza(zzc zzc1, int i, zzabn zzabn, TaskCompletionSource taskcompletionsource, zzabk zzabk)
	{
		zzabn = ((zzabn) (new zzzq.zzd(i, zzabn, taskcompletionsource, zzabk)));
	//    0    0:new             #474 <Class zzzq$zzd>
	//    1    3:dup             
	//    2    4:iload_2         
	//    3    5:aload_3         
	//    4    6:aload           4
	//    5    8:aload           5
	//    6   10:invokespecial   #477 <Method void zzzq$zzd(int, zzabn, TaskCompletionSource, zzabk)>
	//    7   13:astore_3        
		mHandler.sendMessage(mHandler.obtainMessage(3, ((Object) (new zzabd(((zzzq) (zzabn)), zzaAU.get(), zzc1)))));
	//    8   14:aload_0         
	//    9   15:getfield        #122 <Field Handler mHandler>
	//   10   18:aload_0         
	//   11   19:getfield        #122 <Field Handler mHandler>
	//   12   22:iconst_3        
	//   13   23:new             #218 <Class zzabd>
	//   14   26:dup             
	//   15   27:aload_3         
	//   16   28:aload_0         
	//   17   29:getfield        #96  <Field AtomicInteger zzaAU>
	//   18   32:invokevirtual   #240 <Method int AtomicInteger.get()>
	//   19   35:aload_1         
	//   20   36:invokespecial   #427 <Method void zzabd(zzzq, int, zzc)>
	//   21   39:invokevirtual   #431 <Method Message Handler.obtainMessage(int, Object)>
	//   22   42:invokevirtual   #434 <Method boolean Handler.sendMessage(Message)>
	//   23   45:pop             
	//   24   46:return          
	}

	public void zza(zzc zzc1, int i, zzzv.zza zza1)
	{
		zza1 = ((zzzv.zza) (new zzzq.zzb(i, zza1)));
	//    0    0:new             #481 <Class zzzq$zzb>
	//    1    3:dup             
	//    2    4:iload_2         
	//    3    5:aload_3         
	//    4    6:invokespecial   #484 <Method void zzzq$zzb(int, zzzv$zza)>
	//    5    9:astore_3        
		mHandler.sendMessage(mHandler.obtainMessage(3, ((Object) (new zzabd(((zzzq) (zza1)), zzaAU.get(), zzc1)))));
	//    6   10:aload_0         
	//    7   11:getfield        #122 <Field Handler mHandler>
	//    8   14:aload_0         
	//    9   15:getfield        #122 <Field Handler mHandler>
	//   10   18:iconst_3        
	//   11   19:new             #218 <Class zzabd>
	//   12   22:dup             
	//   13   23:aload_3         
	//   14   24:aload_0         
	//   15   25:getfield        #96  <Field AtomicInteger zzaAU>
	//   16   28:invokevirtual   #240 <Method int AtomicInteger.get()>
	//   17   31:aload_1         
	//   18   32:invokespecial   #427 <Method void zzabd(zzzq, int, zzc)>
	//   19   35:invokevirtual   #431 <Method Message Handler.obtainMessage(int, Object)>
	//   20   38:invokevirtual   #434 <Method boolean Handler.sendMessage(Message)>
	//   21   41:pop             
	//   22   42:return          
	}

	public void zza(zzaae zzaae1)
	{
		synchronized(zztU)
	//*   0    0:getstatic       #71  <Field Object zztU>
	//*   1    3:astore_2        
	//*   2    4:aload_2         
	//*   3    5:monitorenter    
		{
			if(zzaAV != zzaae1)
	//*   4    6:aload_0         
	//*   5    7:getfield        #106 <Field zzaae zzaAV>
	//*   6   10:aload_1         
	//*   7   11:if_acmpeq       42
			{
				zzaAV = zzaae1;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #106 <Field zzaae zzaAV>
				zzaAW.clear();
	//   11   19:aload_0         
	//   12   20:getfield        #111 <Field Set zzaAW>
	//   13   23:invokeinterface #373 <Method void Set.clear()>
				zzaAW.addAll(((Collection) (zzaae1.zzvx())));
	//   14   28:aload_0         
	//   15   29:getfield        #111 <Field Set zzaAW>
	//   16   32:aload_1         
	//   17   33:invokevirtual   #492 <Method zza zzaae.zzvx()>
	//   18   36:invokeinterface #496 <Method boolean Set.addAll(Collection)>
	//   19   41:pop             
			}
		}
	//   20   42:aload_2         
	//   21   43:monitorexit     
		return;
	//   22   44:return          
		zzaae1;
	//   23   45:astore_1        
		obj;
	//   24   46:aload_2         
		JVM INSTR monitorexit ;
	//   25   47:monitorexit     
		throw zzaae1;
	//   26   48:aload_1         
	//   27   49:athrow          
	}

	void zzb(zzaae zzaae1)
	{
		synchronized(zztU)
	//*   0    0:getstatic       #71  <Field Object zztU>
	//*   1    3:astore_2        
	//*   2    4:aload_2         
	//*   3    5:monitorenter    
		{
			if(zzaAV == zzaae1)
	//*   4    6:aload_0         
	//*   5    7:getfield        #106 <Field zzaae zzaAV>
	//*   6   10:aload_1         
	//*   7   11:if_acmpne       28
			{
				zzaAV = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #106 <Field zzaae zzaAV>
				zzaAW.clear();
	//   11   19:aload_0         
	//   12   20:getfield        #111 <Field Set zzaAW>
	//   13   23:invokeinterface #373 <Method void Set.clear()>
			}
		}
	//   14   28:aload_2         
	//   15   29:monitorexit     
		return;
	//   16   30:return          
		zzaae1;
	//   17   31:astore_1        
		obj;
	//   18   32:aload_2         
		JVM INSTR monitorexit ;
	//   19   33:monitorexit     
		throw zzaae1;
	//   20   34:aload_1         
	//   21   35:athrow          
	}

	boolean zzc(ConnectionResult connectionresult, int i)
	{
		if(connectionresult.hasResolution() || zzaxX.isUserResolvableError(connectionresult.getErrorCode()))
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #499 <Method boolean ConnectionResult.hasResolution()>
	//*   2    4:ifne            21
	//*   3    7:aload_0         
	//*   4    8:getfield        #124 <Field GoogleApiAvailability zzaxX>
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #159 <Method int ConnectionResult.getErrorCode()>
	//*   7   15:invokevirtual   #503 <Method boolean GoogleApiAvailability.isUserResolvableError(int)>
	//*   8   18:ifeq            36
		{
			zzaxX.zza(mContext, connectionresult, i);
	//    9   21:aload_0         
	//   10   22:getfield        #124 <Field GoogleApiAvailability zzaxX>
	//   11   25:aload_0         
	//   12   26:getfield        #115 <Field Context mContext>
	//   13   29:aload_1         
	//   14   30:iload_2         
	//   15   31:invokevirtual   #506 <Method void GoogleApiAvailability.zza(Context, ConnectionResult, int)>
			return true;
	//   16   34:iconst_1        
	//   17   35:ireturn         
		} else
		{
			return false;
	//   18   36:iconst_0        
	//   19   37:ireturn         
		}
	}

	public void zzuW()
	{
		mHandler.sendMessage(mHandler.obtainMessage(2));
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field Handler mHandler>
	//    2    4:aload_0         
	//    3    5:getfield        #122 <Field Handler mHandler>
	//    4    8:iconst_2        
	//    5    9:invokevirtual   #510 <Method Message Handler.obtainMessage(int)>
	//    6   12:invokevirtual   #434 <Method boolean Handler.sendMessage(Message)>
	//    7   15:pop             
	//    8   16:return          
	}

	public int zzvU()
	{
		return zzaAT.getAndIncrement();
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field AtomicInteger zzaAT>
	//    2    4:invokevirtual   #514 <Method int AtomicInteger.getAndIncrement()>
	//    3    7:ireturn         
	}

	public static final Status zzaAO = new Status(4, "Sign-out occurred while this API call was in progress.");
	private static final Status zzaAP = new Status(4, "The user must be signed in to make this API call.");
	private static zzaap zzaAR;
	private static final Object zztU = new Object();
	private final Context mContext;
	private final Handler mHandler;
	private long zzaAQ;
	private int zzaAS;
	private final AtomicInteger zzaAT = new AtomicInteger(1);
	private final AtomicInteger zzaAU = new AtomicInteger(0);
	private zzaae zzaAV;
	private final Set zzaAW = new com.google.android.gms.common.util.zza();
	private final Set zzaAX = new com.google.android.gms.common.util.zza();
	private long zzaAn;
	private long zzaAo;
	private final GoogleApiAvailability zzaxX;
	private final Map zzazt = new ConcurrentHashMap(5, 0.75F, 1);

	static 
	{
	//    0    0:new             #55  <Class Status>
	//    1    3:dup             
	//    2    4:iconst_4        
	//    3    5:ldc1            #57  <String "Sign-out occurred while this API call was in progress.">
	//    4    7:invokespecial   #61  <Method void Status(int, String)>
	//    5   10:putstatic       #63  <Field Status zzaAO>
	//    6   13:new             #55  <Class Status>
	//    7   16:dup             
	//    8   17:iconst_4        
	//    9   18:ldc1            #65  <String "The user must be signed in to make this API call.">
	//   10   20:invokespecial   #61  <Method void Status(int, String)>
	//   11   23:putstatic       #67  <Field Status zzaAP>
	//   12   26:new             #4   <Class Object>
	//   13   29:dup             
	//   14   30:invokespecial   #69  <Method void Object()>
	//   15   33:putstatic       #71  <Field Object zztU>
	//*  16   36:return          
	}
}
