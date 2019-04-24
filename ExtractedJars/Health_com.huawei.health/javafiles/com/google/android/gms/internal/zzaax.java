// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.app.Application;
import android.app.PendingIntent;
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
import com.google.android.gms.common.util.zzt;
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
//			zzaab, zzzz, zzabl, zzzx, 
//			zzaac, zzbai, zzabn, zzaam, 
//			zzabm, zzabz, zzabv, zzabs, 
//			zzaah, zzaal, zzabr

public class zzaax
	implements android.os.Handler.Callback
{
	public class zza
		implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener, zzaah
	{

		private void zzb(zzzx zzzx1)
		{
			zzzx1.zza(zzaCA, zzrd());
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #109 <Field zzaal zzaCA>
		//    3    5:aload_0         
		//    4    6:invokevirtual   #139 <Method boolean zzrd()>
		//    5    9:invokevirtual   #144 <Method void com.google.android.gms.internal.zzzx.zza(zzaal, boolean)>
			try
			{
				zzzx1.zza(this);
		//    6   12:aload_1         
		//    7   13:aload_0         
		//    8   14:invokevirtual   #147 <Method void com.google.android.gms.internal.zzzx.zza(zzaax$zza)>
				return;
		//    9   17:return          
			}
		//*  10   18:aload_0         
		//*  11   19:iconst_1        
		//*  12   20:invokevirtual   #151 <Method void onConnectionSuspended(int)>
		//*  13   23:aload_0         
		//*  14   24:getfield        #90  <Field com.google.android.gms.common.api.Api$zze zzaAJ>
		//*  15   27:invokeinterface #154 <Method void com.google.android.gms.common.api.Api$zze.disconnect()>
		//*  16   32:return          
			// Misplaced declaration of an exception variable
			catch(zzzx zzzx1)
			{
				onConnectionSuspended(1);
			}
			zzaAJ.disconnect();
		//*  17   33:astore_1        
		//*  18   34:goto            18
		}

		static void zzc(zza zza1)
		{
			zza1.zzwF();
		//    0    0:aload_0         
		//    1    1:invokespecial   #158 <Method void zzwF()>
		//    2    4:return          
		}

		static void zzd(zza zza1)
		{
			zza1.zzwG();
		//    0    0:aload_0         
		//    1    1:invokespecial   #162 <Method void zzwG()>
		//    2    4:return          
		}

		private void zzj(ConnectionResult connectionresult)
		{
			for(Iterator iterator = zzaCB.iterator(); iterator.hasNext(); ((zzaab)iterator.next()).zza(zzayU, connectionresult));
		//    0    0:aload_0         
		//    1    1:getfield        #66  <Field Set zzaCB>
		//    2    4:invokeinterface #170 <Method Iterator Set.iterator()>
		//    3    9:astore_2        
		//    4   10:aload_2         
		//    5   11:invokeinterface #175 <Method boolean Iterator.hasNext()>
		//    6   16:ifeq            39
		//    7   19:aload_2         
		//    8   20:invokeinterface #179 <Method Object Iterator.next()>
		//    9   25:checkcast       #181 <Class zzaab>
		//   10   28:aload_0         
		//   11   29:getfield        #104 <Field zzzz zzayU>
		//   12   32:aload_1         
		//   13   33:invokevirtual   #184 <Method void com.google.android.gms.internal.zzaab.zza(zzzz, ConnectionResult)>
		//*  14   36:goto            10
			zzaCB.clear();
		//   15   39:aload_0         
		//   16   40:getfield        #66  <Field Set zzaCB>
		//   17   43:invokeinterface #187 <Method void Set.clear()>
		//   18   48:return          
		}

		private void zzwF()
		{
			Iterator iterator;
			zzwJ();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #192 <Method void zzwJ()>
			zzj(ConnectionResult.zzayj);
		//    2    4:aload_0         
		//    3    5:getstatic       #197 <Field ConnectionResult ConnectionResult.zzayj>
		//    4    8:invokespecial   #199 <Method void zzj(ConnectionResult)>
			zzwL();
		//    5   11:aload_0         
		//    6   12:invokespecial   #202 <Method void zzwL()>
			iterator = zzaCC.values().iterator();
		//    7   15:aload_0         
		//    8   16:getfield        #71  <Field Map zzaCC>
		//    9   19:invokeinterface #208 <Method Collection Map.values()>
		//   10   24:invokeinterface #211 <Method Iterator Collection.iterator()>
		//   11   29:astore_1        
_L6:
			if(!iterator.hasNext()) goto _L2; else goto _L1
		//   12   30:aload_1         
		//   13   31:invokeinterface #175 <Method boolean Iterator.hasNext()>
		//   14   36:ifeq            77
_L1:
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
		//   22   54:goto            74
_L4:
			onConnectionSuspended(1);
		//   23   57:aload_0         
		//   24   58:iconst_1        
		//   25   59:invokevirtual   #151 <Method void onConnectionSuspended(int)>
			zzaAJ.disconnect();
		//   26   62:aload_0         
		//   27   63:getfield        #90  <Field com.google.android.gms.common.api.Api$zze zzaAJ>
		//   28   66:invokeinterface #154 <Method void com.google.android.gms.common.api.Api$zze.disconnect()>
		//*  29   71:goto            77
		//*  30   74:goto            30
_L2:
			zzwH();
		//   31   77:aload_0         
		//   32   78:invokespecial   #217 <Method void zzwH()>
			zzwM();
		//   33   81:aload_0         
		//   34   82:invokespecial   #220 <Method void zzwM()>
			return;
		//   35   85:return          
			DeadObjectException deadobjectexception;
			deadobjectexception;
		//   36   86:astore_1        
			if(true) goto _L4; else goto _L3
		//   37   87:goto            57
_L3:
			RemoteException remoteexception;
			remoteexception;
		//   38   90:astore_2        
			if(true) goto _L6; else goto _L5
_L5:
		//*  39   91:goto            74
		}

		private void zzwG()
		{
			zzwJ();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #192 <Method void zzwJ()>
			zzaBL = true;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #222 <Field boolean zzaBL>
			zzaCA.zzwa();
		//    5    9:aload_0         
		//    6   10:getfield        #109 <Field zzaal zzaCA>
		//    7   13:invokevirtual   #225 <Method void zzaal.zzwa()>
			com.google.android.gms.internal.zzaax.zza(zzaCx).sendMessageDelayed(Message.obtain(com.google.android.gms.internal.zzaax.zza(zzaCx), 9, ((Object) (zzayU))), com.google.android.gms.internal.zzaax.zzc(zzaCx));
		//    8   16:aload_0         
		//    9   17:getfield        #53  <Field zzaax zzaCx>
		//   10   20:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaax.zza(zzaax)>
		//   11   23:aload_0         
		//   12   24:getfield        #53  <Field zzaax zzaCx>
		//   13   27:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaax.zza(zzaax)>
		//   14   30:bipush          9
		//   15   32:aload_0         
		//   16   33:getfield        #104 <Field zzzz zzayU>
		//   17   36:invokestatic    #231 <Method Message Message.obtain(Handler, int, Object)>
		//   18   39:aload_0         
		//   19   40:getfield        #53  <Field zzaax zzaCx>
		//   20   43:invokestatic    #234 <Method long com.google.android.gms.internal.zzaax.zzc(zzaax)>
		//   21   46:invokevirtual   #238 <Method boolean Handler.sendMessageDelayed(Message, long)>
		//   22   49:pop             
			com.google.android.gms.internal.zzaax.zza(zzaCx).sendMessageDelayed(Message.obtain(com.google.android.gms.internal.zzaax.zza(zzaCx), 11, ((Object) (zzayU))), zzaax.zzd(zzaCx));
		//   23   50:aload_0         
		//   24   51:getfield        #53  <Field zzaax zzaCx>
		//   25   54:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaax.zza(zzaax)>
		//   26   57:aload_0         
		//   27   58:getfield        #53  <Field zzaax zzaCx>
		//   28   61:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaax.zza(zzaax)>
		//   29   64:bipush          11
		//   30   66:aload_0         
		//   31   67:getfield        #104 <Field zzzz zzayU>
		//   32   70:invokestatic    #231 <Method Message Message.obtain(Handler, int, Object)>
		//   33   73:aload_0         
		//   34   74:getfield        #53  <Field zzaax zzaCx>
		//   35   77:invokestatic    #240 <Method long zzaax.zzd(zzaax)>
		//   36   80:invokevirtual   #238 <Method boolean Handler.sendMessageDelayed(Message, long)>
		//   37   83:pop             
			com.google.android.gms.internal.zzaax.zza(zzaCx, -1);
		//   38   84:aload_0         
		//   39   85:getfield        #53  <Field zzaax zzaCx>
		//   40   88:iconst_m1       
		//   41   89:invokestatic    #243 <Method int com.google.android.gms.internal.zzaax.zza(zzaax, int)>
		//   42   92:pop             
		//   43   93:return          
		}

		private void zzwH()
		{
			for(; zzaAJ.isConnected() && !zzaCy.isEmpty(); zzb((zzzx)zzaCy.remove()));
		//    0    0:aload_0         
		//    1    1:getfield        #90  <Field com.google.android.gms.common.api.Api$zze zzaAJ>
		//    2    4:invokeinterface #246 <Method boolean com.google.android.gms.common.api.Api$zze.isConnected()>
		//    3    9:ifeq            43
		//    4   12:aload_0         
		//    5   13:getfield        #61  <Field Queue zzaCy>
		//    6   16:invokeinterface #251 <Method boolean Queue.isEmpty()>
		//    7   21:ifne            43
		//    8   24:aload_0         
		//    9   25:aload_0         
		//   10   26:getfield        #61  <Field Queue zzaCy>
		//   11   29:invokeinterface #254 <Method Object Queue.remove()>
		//   12   34:checkcast       #141 <Class zzzx>
		//   13   37:invokespecial   #256 <Method void zzb(zzzx)>
		//*  14   40:goto            0
		//   15   43:return          
		}

		private void zzwL()
		{
			if(zzaBL)
		//*   0    0:aload_0         
		//*   1    1:getfield        #222 <Field boolean zzaBL>
		//*   2    4:ifeq            44
			{
				com.google.android.gms.internal.zzaax.zza(zzaCx).removeMessages(11, ((Object) (zzayU)));
		//    3    7:aload_0         
		//    4    8:getfield        #53  <Field zzaax zzaCx>
		//    5   11:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaax.zza(zzaax)>
		//    6   14:bipush          11
		//    7   16:aload_0         
		//    8   17:getfield        #104 <Field zzzz zzayU>
		//    9   20:invokevirtual   #260 <Method void Handler.removeMessages(int, Object)>
				com.google.android.gms.internal.zzaax.zza(zzaCx).removeMessages(9, ((Object) (zzayU)));
		//   10   23:aload_0         
		//   11   24:getfield        #53  <Field zzaax zzaCx>
		//   12   27:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaax.zza(zzaax)>
		//   13   30:bipush          9
		//   14   32:aload_0         
		//   15   33:getfield        #104 <Field zzzz zzayU>
		//   16   36:invokevirtual   #260 <Method void Handler.removeMessages(int, Object)>
				zzaBL = false;
		//   17   39:aload_0         
		//   18   40:iconst_0        
		//   19   41:putfield        #222 <Field boolean zzaBL>
			}
		//   20   44:return          
		}

		private void zzwM()
		{
			com.google.android.gms.internal.zzaax.zza(zzaCx).removeMessages(12, ((Object) (zzayU)));
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field zzaax zzaCx>
		//    2    4:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaax.zza(zzaax)>
		//    3    7:bipush          12
		//    4    9:aload_0         
		//    5   10:getfield        #104 <Field zzzz zzayU>
		//    6   13:invokevirtual   #260 <Method void Handler.removeMessages(int, Object)>
			com.google.android.gms.internal.zzaax.zza(zzaCx).sendMessageDelayed(com.google.android.gms.internal.zzaax.zza(zzaCx).obtainMessage(12, ((Object) (zzayU))), zzaax.zzh(zzaCx));
		//    7   16:aload_0         
		//    8   17:getfield        #53  <Field zzaax zzaCx>
		//    9   20:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaax.zza(zzaax)>
		//   10   23:aload_0         
		//   11   24:getfield        #53  <Field zzaax zzaCx>
		//   12   27:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaax.zza(zzaax)>
		//   13   30:bipush          12
		//   14   32:aload_0         
		//   15   33:getfield        #104 <Field zzzz zzayU>
		//   16   36:invokevirtual   #264 <Method Message Handler.obtainMessage(int, Object)>
		//   17   39:aload_0         
		//   18   40:getfield        #53  <Field zzaax zzaCx>
		//   19   43:invokestatic    #267 <Method long zzaax.zzh(zzaax)>
		//   20   46:invokevirtual   #238 <Method boolean Handler.sendMessageDelayed(Message, long)>
		//   21   49:pop             
		//   22   50:return          
		}

		public void connect()
		{
			zzac.zza(com.google.android.gms.internal.zzaax.zza(zzaCx));
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field zzaax zzaCx>
		//    2    4:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaax.zza(zzaax)>
		//    3    7:invokestatic    #273 <Method void zzac.zza(Handler)>
			if(zzaAJ.isConnected() || zzaAJ.isConnecting())
		//*   4   10:aload_0         
		//*   5   11:getfield        #90  <Field com.google.android.gms.common.api.Api$zze zzaAJ>
		//*   6   14:invokeinterface #246 <Method boolean com.google.android.gms.common.api.Api$zze.isConnected()>
		//*   7   19:ifne            34
		//*   8   22:aload_0         
		//*   9   23:getfield        #90  <Field com.google.android.gms.common.api.Api$zze zzaAJ>
		//*  10   26:invokeinterface #276 <Method boolean com.google.android.gms.common.api.Api$zze.isConnecting()>
		//*  11   31:ifeq            35
				return;
		//   12   34:return          
			if(zzaAJ.zzvh() && zzaax.zzi(zzaCx) != 0)
		//*  13   35:aload_0         
		//*  14   36:getfield        #90  <Field com.google.android.gms.common.api.Api$zze zzaAJ>
		//*  15   39:invokeinterface #279 <Method boolean com.google.android.gms.common.api.Api$zze.zzvh()>
		//*  16   44:ifeq            112
		//*  17   47:aload_0         
		//*  18   48:getfield        #53  <Field zzaax zzaCx>
		//*  19   51:invokestatic    #283 <Method int zzaax.zzi(zzaax)>
		//*  20   54:ifeq            112
			{
				com.google.android.gms.internal.zzaax.zza(zzaCx, zzaax.zzg(zzaCx).isGooglePlayServicesAvailable(zzaax.zzb(zzaCx)));
		//   21   57:aload_0         
		//   22   58:getfield        #53  <Field zzaax zzaCx>
		//   23   61:aload_0         
		//   24   62:getfield        #53  <Field zzaax zzaCx>
		//   25   65:invokestatic    #287 <Method GoogleApiAvailability zzaax.zzg(zzaax)>
		//   26   68:aload_0         
		//   27   69:getfield        #53  <Field zzaax zzaCx>
		//   28   72:invokestatic    #125 <Method Context zzaax.zzb(zzaax)>
		//   29   75:invokevirtual   #293 <Method int GoogleApiAvailability.isGooglePlayServicesAvailable(Context)>
		//   30   78:invokestatic    #243 <Method int com.google.android.gms.internal.zzaax.zza(zzaax, int)>
		//   31   81:pop             
				if(zzaax.zzi(zzaCx) != 0)
		//*  32   82:aload_0         
		//*  33   83:getfield        #53  <Field zzaax zzaCx>
		//*  34   86:invokestatic    #283 <Method int zzaax.zzi(zzaax)>
		//*  35   89:ifeq            112
				{
					onConnectionFailed(new ConnectionResult(zzaax.zzi(zzaCx), ((PendingIntent) (null))));
		//   36   92:aload_0         
		//   37   93:new             #194 <Class ConnectionResult>
		//   38   96:dup             
		//   39   97:aload_0         
		//   40   98:getfield        #53  <Field zzaax zzaCx>
		//   41  101:invokestatic    #283 <Method int zzaax.zzi(zzaax)>
		//   42  104:aconst_null     
		//   43  105:invokespecial   #296 <Method void ConnectionResult(int, PendingIntent)>
		//   44  108:invokevirtual   #299 <Method void onConnectionFailed(ConnectionResult)>
					return;
		//   45  111:return          
				}
			}
			zzb zzb1 = ((zzb) (zzaCx)). new zzb(zzaAJ, zzayU);
		//   46  112:new             #301 <Class zzaax$zzb>
		//   47  115:dup             
		//   48  116:aload_0         
		//   49  117:getfield        #53  <Field zzaax zzaCx>
		//   50  120:aload_0         
		//   51  121:getfield        #90  <Field com.google.android.gms.common.api.Api$zze zzaAJ>
		//   52  124:aload_0         
		//   53  125:getfield        #104 <Field zzzz zzayU>
		//   54  128:invokespecial   #304 <Method void zzaax$zzb(zzaax, com.google.android.gms.common.api.Api$zze, zzzz)>
		//   55  131:astore_1        
			if(zzaAJ.zzrd())
		//*  56  132:aload_0         
		//*  57  133:getfield        #90  <Field com.google.android.gms.common.api.Api$zze zzaAJ>
		//*  58  136:invokeinterface #121 <Method boolean com.google.android.gms.common.api.Api$zze.zzrd()>
		//*  59  141:ifeq            152
				zzaCE.zza(((zzabr.zza) (zzb1)));
		//   60  144:aload_0         
		//   61  145:getfield        #131 <Field zzabr zzaCE>
		//   62  148:aload_1         
		//   63  149:invokevirtual   #309 <Method void com.google.android.gms.internal.zzabr.zza(zzabr$zza)>
			zzaAJ.zza(((com.google.android.gms.common.internal.zzf.zzf) (zzb1)));
		//   64  152:aload_0         
		//   65  153:getfield        #90  <Field com.google.android.gms.common.api.Api$zze zzaAJ>
		//   66  156:aload_1         
		//   67  157:invokeinterface #312 <Method void com.google.android.gms.common.api.Api$zze.zza(com.google.android.gms.common.internal.zzf$zzf)>
		//   68  162:return          
		}

		public int getInstanceId()
		{
			return zzaCD;
		//    0    0:aload_0         
		//    1    1:getfield        #115 <Field int zzaCD>
		//    2    4:ireturn         
		}

		boolean isConnected()
		{
			return zzaAJ.isConnected();
		//    0    0:aload_0         
		//    1    1:getfield        #90  <Field com.google.android.gms.common.api.Api$zze zzaAJ>
		//    2    4:invokeinterface #246 <Method boolean com.google.android.gms.common.api.Api$zze.isConnected()>
		//    3    9:ireturn         
		}

		public void onConnected(Bundle bundle)
		{
			if(Looper.myLooper() == com.google.android.gms.internal.zzaax.zza(zzaCx).getLooper())
		//*   0    0:invokestatic    #320 <Method Looper Looper.myLooper()>
		//*   1    3:aload_0         
		//*   2    4:getfield        #53  <Field zzaax zzaCx>
		//*   3    7:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaax.zza(zzaax)>
		//*   4   10:invokevirtual   #82  <Method Looper Handler.getLooper()>
		//*   5   13:if_acmpne       21
			{
				zzwF();
		//    6   16:aload_0         
		//    7   17:invokespecial   #158 <Method void zzwF()>
				return;
		//    8   20:return          
			} else
			{
				com.google.android.gms.internal.zzaax.zza(zzaCx).post(new Runnable(this) {

					public void run()
					{
						com.google.android.gms.internal.zza.zzc(zzaCG);
					//    0    0:aload_0         
					//    1    1:getfield        #20  <Field zzaax$zza zzaCG>
					//    2    4:invokestatic    #28  <Method void com.google.android.gms.internal.zzaax$zza.zzc(zzaax$zza)>
					//    3    7:return          
					}

					final zza zzaCG;

			
			{
				zzaCG = zza1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field zzaax$zza zzaCG>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #23  <Method void Object()>
			//    5    9:return          
			}
				}
);
		//    9   21:aload_0         
		//   10   22:getfield        #53  <Field zzaax zzaCx>
		//   11   25:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaax.zza(zzaax)>
		//   12   28:new             #16  <Class zzaax$zza$1>
		//   13   31:dup             
		//   14   32:aload_0         
		//   15   33:invokespecial   #322 <Method void zzaax$zza$1(zzaax$zza)>
		//   16   36:invokevirtual   #326 <Method boolean Handler.post(Runnable)>
		//   17   39:pop             
				return;
		//   18   40:return          
			}
		}

		public void onConnectionFailed(ConnectionResult connectionresult)
		{
			zzac.zza(com.google.android.gms.internal.zzaax.zza(zzaCx));
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field zzaax zzaCx>
		//    2    4:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaax.zza(zzaax)>
		//    3    7:invokestatic    #273 <Method void zzac.zza(Handler)>
			if(zzaCE != null)
		//*   4   10:aload_0         
		//*   5   11:getfield        #131 <Field zzabr zzaCE>
		//*   6   14:ifnull          24
				zzaCE.zzwY();
		//    7   17:aload_0         
		//    8   18:getfield        #131 <Field zzabr zzaCE>
		//    9   21:invokevirtual   #331 <Method void zzabr.zzwY()>
			zzwJ();
		//   10   24:aload_0         
		//   11   25:invokevirtual   #192 <Method void zzwJ()>
			com.google.android.gms.internal.zzaax.zza(zzaCx, -1);
		//   12   28:aload_0         
		//   13   29:getfield        #53  <Field zzaax zzaCx>
		//   14   32:iconst_m1       
		//   15   33:invokestatic    #243 <Method int com.google.android.gms.internal.zzaax.zza(zzaax, int)>
		//   16   36:pop             
			zzj(connectionresult);
		//   17   37:aload_0         
		//   18   38:aload_1         
		//   19   39:invokespecial   #199 <Method void zzj(ConnectionResult)>
			if(connectionresult.getErrorCode() == 4)
		//*  20   42:aload_1         
		//*  21   43:invokevirtual   #334 <Method int ConnectionResult.getErrorCode()>
		//*  22   46:iconst_4        
		//*  23   47:icmpne          58
			{
				zzD(zzaax.zzwD());
		//   24   50:aload_0         
		//   25   51:invokestatic    #338 <Method Status zzaax.zzwD()>
		//   26   54:invokevirtual   #342 <Method void zzD(Status)>
				return;
		//   27   57:return          
			}
			if(zzaCy.isEmpty())
		//*  28   58:aload_0         
		//*  29   59:getfield        #61  <Field Queue zzaCy>
		//*  30   62:invokeinterface #251 <Method boolean Queue.isEmpty()>
		//*  31   67:ifeq            76
			{
				zzaCF = connectionresult;
		//   32   70:aload_0         
		//   33   71:aload_1         
		//   34   72:putfield        #73  <Field ConnectionResult zzaCF>
				return;
		//   35   75:return          
			}
			Object obj = zzaax.zzwE();
		//   36   76:invokestatic    #345 <Method Object zzaax.zzwE()>
		//   37   79:astore_2        
			obj;
		//   38   80:aload_2         
			JVM INSTR monitorenter ;
		//   39   81:monitorenter    
			if(zzaax.zze(zzaCx) == null || !zzaax.zzf(zzaCx).contains(((Object) (zzayU))))
				break MISSING_BLOCK_LABEL_129;
		//   40   82:aload_0         
		//   41   83:getfield        #53  <Field zzaax zzaCx>
		//   42   86:invokestatic    #349 <Method zzaam zzaax.zze(zzaax)>
		//   43   89:ifnull          129
		//   44   92:aload_0         
		//   45   93:getfield        #53  <Field zzaax zzaCx>
		//   46   96:invokestatic    #353 <Method Set zzaax.zzf(zzaax)>
		//   47   99:aload_0         
		//   48  100:getfield        #104 <Field zzzz zzayU>
		//   49  103:invokeinterface #357 <Method boolean Set.contains(Object)>
		//   50  108:ifeq            129
			zzaax.zze(zzaCx).zzb(connectionresult, zzaCD);
		//   51  111:aload_0         
		//   52  112:getfield        #53  <Field zzaax zzaCx>
		//   53  115:invokestatic    #349 <Method zzaam zzaax.zze(zzaax)>
		//   54  118:aload_1         
		//   55  119:aload_0         
		//   56  120:getfield        #115 <Field int zzaCD>
		//   57  123:invokevirtual   #362 <Method void zzaam.zzb(ConnectionResult, int)>
			obj;
		//   58  126:aload_2         
			JVM INSTR monitorexit ;
		//   59  127:monitorexit     
			return;
		//   60  128:return          
			obj;
		//   61  129:aload_2         
			JVM INSTR monitorexit ;
		//   62  130:monitorexit     
			  goto _L1
		//*  63  131:goto            139
			connectionresult;
		//   64  134:astore_1        
		//*  65  135:aload_2         
			throw connectionresult;
		//   66  136:monitorexit     
		//   67  137:aload_1         
		//   68  138:athrow          
_L1:
			if(!zzaCx.zzc(connectionresult, zzaCD))
		//*  69  139:aload_0         
		//*  70  140:getfield        #53  <Field zzaax zzaCx>
		//*  71  143:aload_1         
		//*  72  144:aload_0         
		//*  73  145:getfield        #115 <Field int zzaCD>
		//*  74  148:invokevirtual   #365 <Method boolean com.google.android.gms.internal.zzaax.zzc(ConnectionResult, int)>
		//*  75  151:ifne            270
			{
				if(connectionresult.getErrorCode() == 18)
		//*  76  154:aload_1         
		//*  77  155:invokevirtual   #334 <Method int ConnectionResult.getErrorCode()>
		//*  78  158:bipush          18
		//*  79  160:icmpne          168
					zzaBL = true;
		//   80  163:aload_0         
		//   81  164:iconst_1        
		//   82  165:putfield        #222 <Field boolean zzaBL>
				if(zzaBL)
		//*  83  168:aload_0         
		//*  84  169:getfield        #222 <Field boolean zzaBL>
		//*  85  172:ifeq            210
				{
					com.google.android.gms.internal.zzaax.zza(zzaCx).sendMessageDelayed(Message.obtain(com.google.android.gms.internal.zzaax.zza(zzaCx), 9, ((Object) (zzayU))), com.google.android.gms.internal.zzaax.zzc(zzaCx));
		//   86  175:aload_0         
		//   87  176:getfield        #53  <Field zzaax zzaCx>
		//   88  179:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaax.zza(zzaax)>
		//   89  182:aload_0         
		//   90  183:getfield        #53  <Field zzaax zzaCx>
		//   91  186:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaax.zza(zzaax)>
		//   92  189:bipush          9
		//   93  191:aload_0         
		//   94  192:getfield        #104 <Field zzzz zzayU>
		//   95  195:invokestatic    #231 <Method Message Message.obtain(Handler, int, Object)>
		//   96  198:aload_0         
		//   97  199:getfield        #53  <Field zzaax zzaCx>
		//   98  202:invokestatic    #234 <Method long com.google.android.gms.internal.zzaax.zzc(zzaax)>
		//   99  205:invokevirtual   #238 <Method boolean Handler.sendMessageDelayed(Message, long)>
		//  100  208:pop             
					return;
		//  101  209:return          
				}
				connectionresult = ((ConnectionResult) (String.valueOf(((Object) (zzayU.zzvw())))));
		//  102  210:aload_0         
		//  103  211:getfield        #104 <Field zzzz zzayU>
		//  104  214:invokevirtual   #371 <Method String zzzz.zzvw()>
		//  105  217:invokestatic    #377 <Method String String.valueOf(Object)>
		//  106  220:astore_1        
				zzD(new Status(17, (new StringBuilder(String.valueOf(((Object) (connectionresult))).length() + 38)).append("API: ").append(((String) (connectionresult))).append(" is not available on this device.").toString()));
		//  107  221:aload_0         
		//  108  222:new             #379 <Class Status>
		//  109  225:dup             
		//  110  226:bipush          17
		//  111  228:new             #381 <Class StringBuilder>
		//  112  231:dup             
		//  113  232:aload_1         
		//  114  233:invokestatic    #377 <Method String String.valueOf(Object)>
		//  115  236:invokevirtual   #384 <Method int String.length()>
		//  116  239:bipush          38
		//  117  241:iadd            
		//  118  242:invokespecial   #386 <Method void StringBuilder(int)>
		//  119  245:ldc2            #388 <String "API: ">
		//  120  248:invokevirtual   #392 <Method StringBuilder StringBuilder.append(String)>
		//  121  251:aload_1         
		//  122  252:invokevirtual   #392 <Method StringBuilder StringBuilder.append(String)>
		//  123  255:ldc2            #394 <String " is not available on this device.">
		//  124  258:invokevirtual   #392 <Method StringBuilder StringBuilder.append(String)>
		//  125  261:invokevirtual   #397 <Method String StringBuilder.toString()>
		//  126  264:invokespecial   #400 <Method void Status(int, String)>
		//  127  267:invokevirtual   #342 <Method void zzD(Status)>
			}
			return;
		//  128  270:return          
		}

		public void onConnectionSuspended(int i)
		{
			if(Looper.myLooper() == com.google.android.gms.internal.zzaax.zza(zzaCx).getLooper())
		//*   0    0:invokestatic    #320 <Method Looper Looper.myLooper()>
		//*   1    3:aload_0         
		//*   2    4:getfield        #53  <Field zzaax zzaCx>
		//*   3    7:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaax.zza(zzaax)>
		//*   4   10:invokevirtual   #82  <Method Looper Handler.getLooper()>
		//*   5   13:if_acmpne       21
			{
				zzwG();
		//    6   16:aload_0         
		//    7   17:invokespecial   #162 <Method void zzwG()>
				return;
		//    8   20:return          
			} else
			{
				com.google.android.gms.internal.zzaax.zza(zzaCx).post(new Runnable(this) {

					public void run()
					{
						zza.zzd(zzaCG);
					//    0    0:aload_0         
					//    1    1:getfield        #20  <Field zzaax$zza zzaCG>
					//    2    4:invokestatic    #28  <Method void zzaax$zza.zzd(zzaax$zza)>
					//    3    7:return          
					}

					final zza zzaCG;

			
			{
				zzaCG = zza1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field zzaax$zza zzaCG>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #23  <Method void Object()>
			//    5    9:return          
			}
				}
);
		//    9   21:aload_0         
		//   10   22:getfield        #53  <Field zzaax zzaCx>
		//   11   25:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaax.zza(zzaax)>
		//   12   28:new             #18  <Class zzaax$zza$2>
		//   13   31:dup             
		//   14   32:aload_0         
		//   15   33:invokespecial   #401 <Method void zzaax$zza$2(zzaax$zza)>
		//   16   36:invokevirtual   #326 <Method boolean Handler.post(Runnable)>
		//   17   39:pop             
				return;
		//   18   40:return          
			}
		}

		public void resume()
		{
			zzac.zza(com.google.android.gms.internal.zzaax.zza(zzaCx));
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field zzaax zzaCx>
		//    2    4:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaax.zza(zzaax)>
		//    3    7:invokestatic    #273 <Method void zzac.zza(Handler)>
			if(zzaBL)
		//*   4   10:aload_0         
		//*   5   11:getfield        #222 <Field boolean zzaBL>
		//*   6   14:ifeq            21
				connect();
		//    7   17:aload_0         
		//    8   18:invokevirtual   #404 <Method void connect()>
		//    9   21:return          
		}

		public void signOut()
		{
			zzac.zza(com.google.android.gms.internal.zzaax.zza(zzaCx));
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field zzaax zzaCx>
		//    2    4:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaax.zza(zzaax)>
		//    3    7:invokestatic    #273 <Method void zzac.zza(Handler)>
			zzD(zzaax.zzaCn);
		//    4   10:aload_0         
		//    5   11:getstatic       #409 <Field Status zzaax.zzaCn>
		//    6   14:invokevirtual   #342 <Method void zzD(Status)>
			zzaCA.zzvZ();
		//    7   17:aload_0         
		//    8   18:getfield        #109 <Field zzaal zzaCA>
		//    9   21:invokevirtual   #412 <Method void zzaal.zzvZ()>
			for(Iterator iterator = zzaCC.keySet().iterator(); iterator.hasNext(); zza(((zzzx) (new zzzx.zze((zzabh.zzb)iterator.next(), new TaskCompletionSource())))));
		//   10   24:aload_0         
		//   11   25:getfield        #71  <Field Map zzaCC>
		//   12   28:invokeinterface #416 <Method Set Map.keySet()>
		//   13   33:invokeinterface #170 <Method Iterator Set.iterator()>
		//   14   38:astore_1        
		//   15   39:aload_1         
		//   16   40:invokeinterface #175 <Method boolean Iterator.hasNext()>
		//   17   45:ifeq            78
		//   18   48:aload_0         
		//   19   49:new             #418 <Class zzzx$zze>
		//   20   52:dup             
		//   21   53:aload_1         
		//   22   54:invokeinterface #179 <Method Object Iterator.next()>
		//   23   59:checkcast       #420 <Class zzabh$zzb>
		//   24   62:new             #213 <Class TaskCompletionSource>
		//   25   65:dup             
		//   26   66:invokespecial   #214 <Method void TaskCompletionSource()>
		//   27   69:invokespecial   #423 <Method void zzzx$zze(zzabh$zzb, TaskCompletionSource)>
		//   28   72:invokevirtual   #425 <Method void zza(zzzx)>
		//*  29   75:goto            39
			zzj(new ConnectionResult(4));
		//   30   78:aload_0         
		//   31   79:new             #194 <Class ConnectionResult>
		//   32   82:dup             
		//   33   83:iconst_4        
		//   34   84:invokespecial   #426 <Method void ConnectionResult(int)>
		//   35   87:invokespecial   #199 <Method void zzj(ConnectionResult)>
			zzaAJ.disconnect();
		//   36   90:aload_0         
		//   37   91:getfield        #90  <Field com.google.android.gms.common.api.Api$zze zzaAJ>
		//   38   94:invokeinterface #154 <Method void com.google.android.gms.common.api.Api$zze.disconnect()>
		//   39   99:return          
		}

		public void zzD(Status status)
		{
			zzac.zza(com.google.android.gms.internal.zzaax.zza(zzaCx));
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field zzaax zzaCx>
		//    2    4:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaax.zza(zzaax)>
		//    3    7:invokestatic    #273 <Method void zzac.zza(Handler)>
			for(Iterator iterator = zzaCy.iterator(); iterator.hasNext(); ((zzzx)iterator.next()).zzz(status));
		//    4   10:aload_0         
		//    5   11:getfield        #61  <Field Queue zzaCy>
		//    6   14:invokeinterface #427 <Method Iterator Queue.iterator()>
		//    7   19:astore_2        
		//    8   20:aload_2         
		//    9   21:invokeinterface #175 <Method boolean Iterator.hasNext()>
		//   10   26:ifeq            45
		//   11   29:aload_2         
		//   12   30:invokeinterface #179 <Method Object Iterator.next()>
		//   13   35:checkcast       #141 <Class zzzx>
		//   14   38:aload_1         
		//   15   39:invokevirtual   #430 <Method void zzzx.zzz(Status)>
		//*  16   42:goto            20
			zzaCy.clear();
		//   17   45:aload_0         
		//   18   46:getfield        #61  <Field Queue zzaCy>
		//   19   49:invokeinterface #431 <Method void Queue.clear()>
		//   20   54:return          
		}

		public void zza(ConnectionResult connectionresult, Api api, boolean flag)
		{
			if(Looper.myLooper() == com.google.android.gms.internal.zzaax.zza(zzaCx).getLooper())
		//*   0    0:invokestatic    #320 <Method Looper Looper.myLooper()>
		//*   1    3:aload_0         
		//*   2    4:getfield        #53  <Field zzaax zzaCx>
		//*   3    7:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaax.zza(zzaax)>
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
				com.google.android.gms.internal.zzaax.zza(zzaCx).post(new Runnable(this, connectionresult) {

					public void run()
					{
						zzaCG.onConnectionFailed(zzaCH);
					//    0    0:aload_0         
					//    1    1:getfield        #21  <Field zzaax$zza zzaCG>
					//    2    4:aload_0         
					//    3    5:getfield        #23  <Field ConnectionResult zzaCH>
					//    4    8:invokevirtual   #32  <Method void zzaax$zza.onConnectionFailed(ConnectionResult)>
					//    5   11:return          
					}

					final zza zzaCG;
					final ConnectionResult zzaCH;

			
			{
				zzaCG = zza1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field zzaax$zza zzaCG>
				zzaCH = connectionresult;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field ConnectionResult zzaCH>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Object()>
			//    8   14:return          
			}
				}
);
		//   10   22:aload_0         
		//   11   23:getfield        #53  <Field zzaax zzaCx>
		//   12   26:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaax.zza(zzaax)>
		//   13   29:new             #20  <Class zzaax$zza$3>
		//   14   32:dup             
		//   15   33:aload_0         
		//   16   34:aload_1         
		//   17   35:invokespecial   #435 <Method void zzaax$zza$3(zzaax$zza, ConnectionResult)>
		//   18   38:invokevirtual   #326 <Method boolean Handler.post(Runnable)>
		//   19   41:pop             
				return;
		//   20   42:return          
			}
		}

		public void zza(zzzx zzzx1)
		{
			zzac.zza(com.google.android.gms.internal.zzaax.zza(zzaCx));
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field zzaax zzaCx>
		//    2    4:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaax.zza(zzaax)>
		//    3    7:invokestatic    #273 <Method void zzac.zza(Handler)>
			if(zzaAJ.isConnected())
		//*   4   10:aload_0         
		//*   5   11:getfield        #90  <Field com.google.android.gms.common.api.Api$zze zzaAJ>
		//*   6   14:invokeinterface #246 <Method boolean com.google.android.gms.common.api.Api$zze.isConnected()>
		//*   7   19:ifeq            32
			{
				zzb(zzzx1);
		//    8   22:aload_0         
		//    9   23:aload_1         
		//   10   24:invokespecial   #256 <Method void zzb(zzzx)>
				zzwM();
		//   11   27:aload_0         
		//   12   28:invokespecial   #220 <Method void zzwM()>
				return;
		//   13   31:return          
			}
			zzaCy.add(((Object) (zzzx1)));
		//   14   32:aload_0         
		//   15   33:getfield        #61  <Field Queue zzaCy>
		//   16   36:aload_1         
		//   17   37:invokeinterface #439 <Method boolean Queue.add(Object)>
		//   18   42:pop             
			if(zzaCF != null && zzaCF.hasResolution())
		//*  19   43:aload_0         
		//*  20   44:getfield        #73  <Field ConnectionResult zzaCF>
		//*  21   47:ifnull          69
		//*  22   50:aload_0         
		//*  23   51:getfield        #73  <Field ConnectionResult zzaCF>
		//*  24   54:invokevirtual   #442 <Method boolean ConnectionResult.hasResolution()>
		//*  25   57:ifeq            69
			{
				onConnectionFailed(zzaCF);
		//   26   60:aload_0         
		//   27   61:aload_0         
		//   28   62:getfield        #73  <Field ConnectionResult zzaCF>
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

		public void zzb(zzaab zzaab1)
		{
			zzac.zza(com.google.android.gms.internal.zzaax.zza(zzaCx));
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field zzaax zzaCx>
		//    2    4:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaax.zza(zzaax)>
		//    3    7:invokestatic    #273 <Method void zzac.zza(Handler)>
			zzaCB.add(((Object) (zzaab1)));
		//    4   10:aload_0         
		//    5   11:getfield        #66  <Field Set zzaCB>
		//    6   14:aload_1         
		//    7   15:invokeinterface #444 <Method boolean Set.add(Object)>
		//    8   20:pop             
		//    9   21:return          
		}

		public void zzi(ConnectionResult connectionresult)
		{
			zzac.zza(com.google.android.gms.internal.zzaax.zza(zzaCx));
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field zzaax zzaCx>
		//    2    4:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaax.zza(zzaax)>
		//    3    7:invokestatic    #273 <Method void zzac.zza(Handler)>
			zzaAJ.disconnect();
		//    4   10:aload_0         
		//    5   11:getfield        #90  <Field com.google.android.gms.common.api.Api$zze zzaAJ>
		//    6   14:invokeinterface #154 <Method void com.google.android.gms.common.api.Api$zze.disconnect()>
			onConnectionFailed(connectionresult);
		//    7   19:aload_0         
		//    8   20:aload_1         
		//    9   21:invokevirtual   #299 <Method void onConnectionFailed(ConnectionResult)>
		//   10   24:return          
		}

		public boolean zzrd()
		{
			return zzaAJ.zzrd();
		//    0    0:aload_0         
		//    1    1:getfield        #90  <Field com.google.android.gms.common.api.Api$zze zzaAJ>
		//    2    4:invokeinterface #121 <Method boolean com.google.android.gms.common.api.Api$zze.zzrd()>
		//    3    9:ireturn         
		}

		public com.google.android.gms.common.api.Api.zze zzvU()
		{
			return zzaAJ;
		//    0    0:aload_0         
		//    1    1:getfield        #90  <Field com.google.android.gms.common.api.Api$zze zzaAJ>
		//    2    4:areturn         
		}

		public Map zzwI()
		{
			return zzaCC;
		//    0    0:aload_0         
		//    1    1:getfield        #71  <Field Map zzaCC>
		//    2    4:areturn         
		}

		public void zzwJ()
		{
			zzac.zza(com.google.android.gms.internal.zzaax.zza(zzaCx));
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field zzaax zzaCx>
		//    2    4:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaax.zza(zzaax)>
		//    3    7:invokestatic    #273 <Method void zzac.zza(Handler)>
			zzaCF = null;
		//    4   10:aload_0         
		//    5   11:aconst_null     
		//    6   12:putfield        #73  <Field ConnectionResult zzaCF>
		//    7   15:return          
		}

		public ConnectionResult zzwK()
		{
			zzac.zza(com.google.android.gms.internal.zzaax.zza(zzaCx));
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field zzaax zzaCx>
		//    2    4:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaax.zza(zzaax)>
		//    3    7:invokestatic    #273 <Method void zzac.zza(Handler)>
			return zzaCF;
		//    4   10:aload_0         
		//    5   11:getfield        #73  <Field ConnectionResult zzaCF>
		//    6   14:areturn         
		}

		public void zzwN()
		{
			zzac.zza(com.google.android.gms.internal.zzaax.zza(zzaCx));
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field zzaax zzaCx>
		//    2    4:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaax.zza(zzaax)>
		//    3    7:invokestatic    #273 <Method void zzac.zza(Handler)>
			if(zzaAJ.isConnected() && zzaCC.size() == 0)
		//*   4   10:aload_0         
		//*   5   11:getfield        #90  <Field com.google.android.gms.common.api.Api$zze zzaAJ>
		//*   6   14:invokeinterface #246 <Method boolean com.google.android.gms.common.api.Api$zze.isConnected()>
		//*   7   19:ifeq            58
		//*   8   22:aload_0         
		//*   9   23:getfield        #71  <Field Map zzaCC>
		//*  10   26:invokeinterface #455 <Method int Map.size()>
		//*  11   31:ifne            58
			{
				if(zzaCA.zzvY())
		//*  12   34:aload_0         
		//*  13   35:getfield        #109 <Field zzaal zzaCA>
		//*  14   38:invokevirtual   #458 <Method boolean zzaal.zzvY()>
		//*  15   41:ifeq            49
				{
					zzwM();
		//   16   44:aload_0         
		//   17   45:invokespecial   #220 <Method void zzwM()>
					return;
		//   18   48:return          
				}
				zzaAJ.disconnect();
		//   19   49:aload_0         
		//   20   50:getfield        #90  <Field com.google.android.gms.common.api.Api$zze zzaAJ>
		//   21   53:invokeinterface #154 <Method void com.google.android.gms.common.api.Api$zze.disconnect()>
			}
		//   22   58:return          
		}

		zzbai zzwO()
		{
			if(zzaCE == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #131 <Field zzabr zzaCE>
		//*   2    4:ifnonnull       9
				return null;
		//    3    7:aconst_null     
		//    4    8:areturn         
			else
				return zzaCE.zzwO();
		//    5    9:aload_0         
		//    6   10:getfield        #131 <Field zzabr zzaCE>
		//    7   13:invokevirtual   #462 <Method zzbai zzabr.zzwO()>
		//    8   16:areturn         
		}

		public void zzwn()
		{
			zzac.zza(com.google.android.gms.internal.zzaax.zza(zzaCx));
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field zzaax zzaCx>
		//    2    4:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaax.zza(zzaax)>
		//    3    7:invokestatic    #273 <Method void zzac.zza(Handler)>
			if(zzaBL)
		//*   4   10:aload_0         
		//*   5   11:getfield        #222 <Field boolean zzaBL>
		//*   6   14:ifeq            86
			{
				zzwL();
		//    7   17:aload_0         
		//    8   18:invokespecial   #202 <Method void zzwL()>
				Status status;
				if(zzaax.zzg(zzaCx).isGooglePlayServicesAvailable(zzaax.zzb(zzaCx)) == 18)
		//*   9   21:aload_0         
		//*  10   22:getfield        #53  <Field zzaax zzaCx>
		//*  11   25:invokestatic    #287 <Method GoogleApiAvailability zzaax.zzg(zzaax)>
		//*  12   28:aload_0         
		//*  13   29:getfield        #53  <Field zzaax zzaCx>
		//*  14   32:invokestatic    #125 <Method Context zzaax.zzb(zzaax)>
		//*  15   35:invokevirtual   #293 <Method int GoogleApiAvailability.isGooglePlayServicesAvailable(Context)>
		//*  16   38:bipush          18
		//*  17   40:icmpne          59
					status = new Status(8, "Connection timed out while waiting for Google Play services update to complete.");
		//   18   43:new             #379 <Class Status>
		//   19   46:dup             
		//   20   47:bipush          8
		//   21   49:ldc2            #465 <String "Connection timed out while waiting for Google Play services update to complete.">
		//   22   52:invokespecial   #400 <Method void Status(int, String)>
		//   23   55:astore_1        
				else
		//*  24   56:goto            72
					status = new Status(8, "API failed to connect while resuming due to an unknown error.");
		//   25   59:new             #379 <Class Status>
		//   26   62:dup             
		//   27   63:bipush          8
		//   28   65:ldc2            #467 <String "API failed to connect while resuming due to an unknown error.">
		//   29   68:invokespecial   #400 <Method void Status(int, String)>
		//   30   71:astore_1        
				zzD(status);
		//   31   72:aload_0         
		//   32   73:aload_1         
		//   33   74:invokevirtual   #342 <Method void zzD(Status)>
				zzaAJ.disconnect();
		//   34   77:aload_0         
		//   35   78:getfield        #90  <Field com.google.android.gms.common.api.Api$zze zzaAJ>
		//   36   81:invokeinterface #154 <Method void com.google.android.gms.common.api.Api$zze.disconnect()>
			}
		//   37   86:return          
		}

		private final com.google.android.gms.common.api.Api.zze zzaAJ;
		private boolean zzaBL;
		private final zzaal zzaCA = new zzaal();
		private final Set zzaCB = new HashSet();
		private final Map zzaCC = new HashMap();
		private final int zzaCD;
		private final zzabr zzaCE;
		private ConnectionResult zzaCF;
		final zzaax zzaCx;
		private final Queue zzaCy = new LinkedList();
		private final com.google.android.gms.common.api.Api.zzb zzaCz;
		private final zzzz zzayU;

		public zza(zzc zzc1)
		{
			zzaCx = zzaax.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #53  <Field zzaax zzaCx>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #56  <Method void Object()>
		//    5    9:aload_0         
		//    6   10:new             #58  <Class LinkedList>
		//    7   13:dup             
		//    8   14:invokespecial   #59  <Method void LinkedList()>
		//    9   17:putfield        #61  <Field Queue zzaCy>
		//   10   20:aload_0         
		//   11   21:new             #63  <Class HashSet>
		//   12   24:dup             
		//   13   25:invokespecial   #64  <Method void HashSet()>
		//   14   28:putfield        #66  <Field Set zzaCB>
		//   15   31:aload_0         
		//   16   32:new             #68  <Class HashMap>
		//   17   35:dup             
		//   18   36:invokespecial   #69  <Method void HashMap()>
		//   19   39:putfield        #71  <Field Map zzaCC>
			zzaCF = null;
		//   20   42:aload_0         
		//   21   43:aconst_null     
		//   22   44:putfield        #73  <Field ConnectionResult zzaCF>
			zzaAJ = zzc1.buildApiClient(com.google.android.gms.internal.zzaax.zza(zzaax.this).getLooper(), this);
		//   23   47:aload_0         
		//   24   48:aload_2         
		//   25   49:aload_1         
		//   26   50:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaax.zza(zzaax)>
		//   27   53:invokevirtual   #82  <Method Looper Handler.getLooper()>
		//   28   56:aload_0         
		//   29   57:invokevirtual   #88  <Method com.google.android.gms.common.api.Api$zze zzc.buildApiClient(Looper, zzaax$zza)>
		//   30   60:putfield        #90  <Field com.google.android.gms.common.api.Api$zze zzaAJ>
			if(zzaAJ instanceof zzal)
		//*  31   63:aload_0         
		//*  32   64:getfield        #90  <Field com.google.android.gms.common.api.Api$zze zzaAJ>
		//*  33   67:instanceof      #92  <Class zzal>
		//*  34   70:ifeq            90
				zzaCz = ((com.google.android.gms.common.api.Api.zzb) (((zzal)zzaAJ).zzyn()));
		//   35   73:aload_0         
		//   36   74:aload_0         
		//   37   75:getfield        #90  <Field com.google.android.gms.common.api.Api$zze zzaAJ>
		//   38   78:checkcast       #92  <Class zzal>
		//   39   81:invokevirtual   #96  <Method com.google.android.gms.common.api.Api$zzg zzal.zzyn()>
		//   40   84:putfield        #98  <Field com.google.android.gms.common.api.Api$zzb zzaCz>
			else
		//*  41   87:goto            98
				zzaCz = ((com.google.android.gms.common.api.Api.zzb) (zzaAJ));
		//   42   90:aload_0         
		//   43   91:aload_0         
		//   44   92:getfield        #90  <Field com.google.android.gms.common.api.Api$zze zzaAJ>
		//   45   95:putfield        #98  <Field com.google.android.gms.common.api.Api$zzb zzaCz>
			zzayU = zzc1.getApiKey();
		//   46   98:aload_0         
		//   47   99:aload_2         
		//   48  100:invokevirtual   #102 <Method zzzz zzc.getApiKey()>
		//   49  103:putfield        #104 <Field zzzz zzayU>
		//   50  106:aload_0         
		//   51  107:new             #106 <Class zzaal>
		//   52  110:dup             
		//   53  111:invokespecial   #107 <Method void zzaal()>
		//   54  114:putfield        #109 <Field zzaal zzaCA>
			zzaCD = zzc1.getInstanceId();
		//   55  117:aload_0         
		//   56  118:aload_2         
		//   57  119:invokevirtual   #113 <Method int zzc.getInstanceId()>
		//   58  122:putfield        #115 <Field int zzaCD>
			if(zzaAJ.zzrd())
		//*  59  125:aload_0         
		//*  60  126:getfield        #90  <Field com.google.android.gms.common.api.Api$zze zzaAJ>
		//*  61  129:invokeinterface #121 <Method boolean com.google.android.gms.common.api.Api$zze.zzrd()>
		//*  62  134:ifeq            154
			{
				zzaCE = zzc1.createSignInCoordinator(zzaax.zzb(zzaax.this), com.google.android.gms.internal.zzaax.zza(zzaax.this));
		//   63  137:aload_0         
		//   64  138:aload_2         
		//   65  139:aload_1         
		//   66  140:invokestatic    #125 <Method Context zzaax.zzb(zzaax)>
		//   67  143:aload_1         
		//   68  144:invokestatic    #76  <Method Handler com.google.android.gms.internal.zzaax.zza(zzaax)>
		//   69  147:invokevirtual   #129 <Method zzabr zzc.createSignInCoordinator(Context, Handler)>
		//   70  150:putfield        #131 <Field zzabr zzaCE>
				return;
		//   71  153:return          
			} else
			{
				zzaCE = null;
		//   72  154:aload_0         
		//   73  155:aconst_null     
		//   74  156:putfield        #131 <Field zzabr zzaCE>
				return;
		//   75  159:return          
			}
		}
	}

	class zzb
		implements com.google.android.gms.common.internal.zzf.zzf, zzabr.zza
	{

		static com.google.android.gms.common.api.Api.zze zza(zzb zzb1)
		{
			return zzb1.zzaAJ;
		//    0    0:aload_0         
		//    1    1:getfield        #42  <Field com.google.android.gms.common.api.Api$zze zzaAJ>
		//    2    4:areturn         
		}

		static boolean zza(zzb zzb1, boolean flag)
		{
			zzb1.zzaCI = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #40  <Field boolean zzaCI>
			return flag;
		//    3    5:iload_1         
		//    4    6:ireturn         
		}

		static void zzb(zzb zzb1)
		{
			zzb1.zzwP();
		//    0    0:aload_0         
		//    1    1:invokespecial   #54  <Method void zzwP()>
		//    2    4:return          
		}

		static zzzz zzc(zzb zzb1)
		{
			return zzb1.zzayU;
		//    0    0:aload_0         
		//    1    1:getfield        #44  <Field zzzz zzayU>
		//    2    4:areturn         
		}

		private void zzwP()
		{
			if(zzaCI && zzaBw != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #40  <Field boolean zzaCI>
		//*   2    4:ifeq            31
		//*   3    7:aload_0         
		//*   4    8:getfield        #36  <Field zzr zzaBw>
		//*   5   11:ifnull          31
				zzaAJ.zza(zzaBw, zzakq);
		//    6   14:aload_0         
		//    7   15:getfield        #42  <Field com.google.android.gms.common.api.Api$zze zzaAJ>
		//    8   18:aload_0         
		//    9   19:getfield        #36  <Field zzr zzaBw>
		//   10   22:aload_0         
		//   11   23:getfield        #38  <Field Set zzakq>
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
				zzaBw = zzr;
		//   18   36:aload_0         
		//   19   37:aload_1         
		//   20   38:putfield        #36  <Field zzr zzaBw>
				zzakq = set;
		//   21   41:aload_0         
		//   22   42:aload_2         
		//   23   43:putfield        #38  <Field Set zzakq>
				zzwP();
		//   24   46:aload_0         
		//   25   47:invokespecial   #54  <Method void zzwP()>
				return;
		//   26   50:return          
			}
		}

		public void zzg(ConnectionResult connectionresult)
		{
			com.google.android.gms.internal.zzaax.zza(zzaCx).post(new Runnable(this, connectionresult) {

				public void run()
				{
					if(zzaCH.isSuccess())
				//*   0    0:aload_0         
				//*   1    1:getfield        #24  <Field ConnectionResult zzaCH>
				//*   2    4:invokevirtual   #35  <Method boolean ConnectionResult.isSuccess()>
				//*   3    7:ifeq            59
					{
						com.google.android.gms.internal.zzb.zza(zzaCJ, true);
				//    4   10:aload_0         
				//    5   11:getfield        #22  <Field zzaax$zzb zzaCJ>
				//    6   14:iconst_1        
				//    7   15:invokestatic    #39  <Method boolean com.google.android.gms.internal.zzaax$zzb.zza(zzaax$zzb, boolean)>
				//    8   18:pop             
						if(com.google.android.gms.internal.zzb.zza(zzaCJ).zzrd())
				//*   9   19:aload_0         
				//*  10   20:getfield        #22  <Field zzaax$zzb zzaCJ>
				//*  11   23:invokestatic    #42  <Method com.google.android.gms.common.api.Api$zze com.google.android.gms.internal.zzaax$zzb.zza(zzaax$zzb)>
				//*  12   26:invokeinterface #47  <Method boolean com.google.android.gms.common.api.Api$zze.zzrd()>
				//*  13   31:ifeq            42
						{
							zzb.zzb(zzaCJ);
				//   14   34:aload_0         
				//   15   35:getfield        #22  <Field zzaax$zzb zzaCJ>
				//   16   38:invokestatic    #50  <Method void zzaax$zzb.zzb(zzaax$zzb)>
							return;
				//   17   41:return          
						} else
						{
							com.google.android.gms.internal.zzb.zza(zzaCJ).zza(((zzr) (null)), Collections.emptySet());
				//   18   42:aload_0         
				//   19   43:getfield        #22  <Field zzaax$zzb zzaCJ>
				//   20   46:invokestatic    #42  <Method com.google.android.gms.common.api.Api$zze com.google.android.gms.internal.zzaax$zzb.zza(zzaax$zzb)>
				//   21   49:aconst_null     
				//   22   50:invokestatic    #56  <Method Set Collections.emptySet()>
				//   23   53:invokeinterface #59  <Method void com.google.android.gms.common.api.Api$zze.zza(zzr, Set)>
							return;
				//   24   58:return          
						}
					} else
					{
						((zza)zzaax.zzj(zzaCJ.zzaCx).get(((Object) (com.google.android.gms.internal.zzb.zzc(zzaCJ))))).onConnectionFailed(zzaCH);
				//   25   59:aload_0         
				//   26   60:getfield        #22  <Field zzaax$zzb zzaCJ>
				//   27   63:getfield        #63  <Field zzaax zzaax$zzb.zzaCx>
				//   28   66:invokestatic    #67  <Method Map zzaax.zzj(zzaax)>
				//   29   69:aload_0         
				//   30   70:getfield        #22  <Field zzaax$zzb zzaCJ>
				//   31   73:invokestatic    #71  <Method zzzz com.google.android.gms.internal.zzaax$zzb.zzc(zzaax$zzb)>
				//   32   76:invokeinterface #77  <Method Object Map.get(Object)>
				//   33   81:checkcast       #79  <Class zzaax$zza>
				//   34   84:aload_0         
				//   35   85:getfield        #24  <Field ConnectionResult zzaCH>
				//   36   88:invokevirtual   #82  <Method void zzaax$zza.onConnectionFailed(ConnectionResult)>
						return;
				//   37   91:return          
					}
				}

				final ConnectionResult zzaCH;
				final zzb zzaCJ;

			
			{
				zzaCJ = zzb1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field zzaax$zzb zzaCJ>
				zzaCH = connectionresult;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field ConnectionResult zzaCH>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
			}
);
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field zzaax zzaCx>
		//    2    4:invokestatic    #91  <Method Handler com.google.android.gms.internal.zzaax.zza(zzaax)>
		//    3    7:new             #13  <Class zzaax$zzb$1>
		//    4   10:dup             
		//    5   11:aload_0         
		//    6   12:aload_1         
		//    7   13:invokespecial   #94  <Method void zzaax$zzb$1(zzaax$zzb, ConnectionResult)>
		//    8   16:invokevirtual   #100 <Method boolean Handler.post(Runnable)>
		//    9   19:pop             
		//   10   20:return          
		}

		public void zzi(ConnectionResult connectionresult)
		{
			((zza)zzaax.zzj(zzaCx).get(((Object) (zzayU)))).zzi(connectionresult);
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field zzaax zzaCx>
		//    2    4:invokestatic    #105 <Method Map zzaax.zzj(zzaax)>
		//    3    7:aload_0         
		//    4    8:getfield        #44  <Field zzzz zzayU>
		//    5   11:invokeinterface #111 <Method Object Map.get(Object)>
		//    6   16:checkcast       #113 <Class zzaax$zza>
		//    7   19:aload_1         
		//    8   20:invokevirtual   #114 <Method void zzaax$zza.zzi(ConnectionResult)>
		//    9   23:return          
		}

		private final com.google.android.gms.common.api.Api.zze zzaAJ;
		private zzr zzaBw;
		private boolean zzaCI;
		final zzaax zzaCx;
		private Set zzakq;
		private final zzzz zzayU;

		public zzb(com.google.android.gms.common.api.Api.zze zze1, zzzz zzzz1)
		{
			zzaCx = zzaax.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #31  <Field zzaax zzaCx>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #34  <Method void Object()>
			zzaBw = null;
		//    5    9:aload_0         
		//    6   10:aconst_null     
		//    7   11:putfield        #36  <Field zzr zzaBw>
			zzakq = null;
		//    8   14:aload_0         
		//    9   15:aconst_null     
		//   10   16:putfield        #38  <Field Set zzakq>
			zzaCI = false;
		//   11   19:aload_0         
		//   12   20:iconst_0        
		//   13   21:putfield        #40  <Field boolean zzaCI>
			zzaAJ = zze1;
		//   14   24:aload_0         
		//   15   25:aload_2         
		//   16   26:putfield        #42  <Field com.google.android.gms.common.api.Api$zze zzaAJ>
			zzayU = zzzz1;
		//   17   29:aload_0         
		//   18   30:aload_3         
		//   19   31:putfield        #44  <Field zzzz zzayU>
		//   20   34:return          
		}
	}


	private zzaax(Context context, Looper looper, GoogleApiAvailability googleapiavailability)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #71  <Method void Object()>
		zzaBN = 5000L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #76  <Long 5000L>
	//    4    8:putfield        #79  <Field long zzaBN>
		zzaBM = 0x1d4c0L;
	//    5   11:aload_0         
	//    6   12:ldc2w           #80  <Long 0x1d4c0L>
	//    7   15:putfield        #83  <Field long zzaBM>
		zzaCp = 10000L;
	//    8   18:aload_0         
	//    9   19:ldc2w           #84  <Long 10000L>
	//   10   22:putfield        #87  <Field long zzaCp>
		zzaCr = -1;
	//   11   25:aload_0         
	//   12   26:iconst_m1       
	//   13   27:putfield        #89  <Field int zzaCr>
	//   14   30:aload_0         
	//   15   31:new             #91  <Class AtomicInteger>
	//   16   34:dup             
	//   17   35:iconst_1        
	//   18   36:invokespecial   #94  <Method void AtomicInteger(int)>
	//   19   39:putfield        #96  <Field AtomicInteger zzaCs>
	//   20   42:aload_0         
	//   21   43:new             #91  <Class AtomicInteger>
	//   22   46:dup             
	//   23   47:iconst_0        
	//   24   48:invokespecial   #94  <Method void AtomicInteger(int)>
	//   25   51:putfield        #98  <Field AtomicInteger zzaCt>
	//   26   54:aload_0         
	//   27   55:new             #100 <Class ConcurrentHashMap>
	//   28   58:dup             
	//   29   59:iconst_5        
	//   30   60:ldc1            #101 <Float 0.75F>
	//   31   62:iconst_1        
	//   32   63:invokespecial   #104 <Method void ConcurrentHashMap(int, float, int)>
	//   33   66:putfield        #106 <Field Map zzaAM>
		zzaCu = null;
	//   34   69:aload_0         
	//   35   70:aconst_null     
	//   36   71:putfield        #108 <Field zzaam zzaCu>
	//   37   74:aload_0         
	//   38   75:new             #110 <Class zza>
	//   39   78:dup             
	//   40   79:invokespecial   #111 <Method void zza()>
	//   41   82:putfield        #113 <Field Set zzaCv>
	//   42   85:aload_0         
	//   43   86:new             #110 <Class zza>
	//   44   89:dup             
	//   45   90:invokespecial   #111 <Method void zza()>
	//   46   93:putfield        #115 <Field Set zzaCw>
		mContext = context;
	//   47   96:aload_0         
	//   48   97:aload_1         
	//   49   98:putfield        #117 <Field Context mContext>
		mHandler = new Handler(looper, ((android.os.Handler.Callback) (this)));
	//   50  101:aload_0         
	//   51  102:new             #119 <Class Handler>
	//   52  105:dup             
	//   53  106:aload_2         
	//   54  107:aload_0         
	//   55  108:invokespecial   #122 <Method void Handler(Looper, android.os.Handler$Callback)>
	//   56  111:putfield        #124 <Field Handler mHandler>
		zzazn = googleapiavailability;
	//   57  114:aload_0         
	//   58  115:aload_3         
	//   59  116:putfield        #126 <Field GoogleApiAvailability zzazn>
		mHandler.sendMessage(mHandler.obtainMessage(6));
	//   60  119:aload_0         
	//   61  120:getfield        #124 <Field Handler mHandler>
	//   62  123:aload_0         
	//   63  124:getfield        #124 <Field Handler mHandler>
	//   64  127:bipush          6
	//   65  129:invokevirtual   #130 <Method Message Handler.obtainMessage(int)>
	//   66  132:invokevirtual   #134 <Method boolean Handler.sendMessage(Message)>
	//   67  135:pop             
	//   68  136:return          
	}

	static int zza(zzaax zzaax1, int i)
	{
		zzaax1.zzaCr = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #89  <Field int zzaCr>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static Handler zza(zzaax zzaax1)
	{
		return zzaax1.mHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field Handler mHandler>
	//    2    4:areturn         
	}

	private void zza(int i, ConnectionResult connectionresult)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		Iterator iterator = zzaAM.values().iterator();
	//    2    3:aload_0         
	//    3    4:getfield        #106 <Field Map zzaAM>
	//    4    7:invokeinterface #144 <Method Collection Map.values()>
	//    5   12:invokeinterface #150 <Method Iterator Collection.iterator()>
	//    6   17:astore          5
		zza zza1;
		do
		{
			zza1 = ((zza) (obj));
	//    7   19:aload           4
	//    8   21:astore_3        
			if(!iterator.hasNext())
				break;
	//    9   22:aload           5
	//   10   24:invokeinterface #156 <Method boolean Iterator.hasNext()>
	//   11   29:ifeq            57
			zza1 = (zza)iterator.next();
	//   12   32:aload           5
	//   13   34:invokeinterface #160 <Method Object Iterator.next()>
	//   14   39:checkcast       #10  <Class zzaax$zza>
	//   15   42:astore_3        
		} while(zza1.getInstanceId() != i);
	//   16   43:aload_3         
	//   17   44:invokevirtual   #164 <Method int zzaax$zza.getInstanceId()>
	//   18   47:iload_1         
	//   19   48:icmpne          54
	//*  20   51:goto            57
	//*  21   54:goto            19
		if(zza1 != null)
	//*  22   57:aload_3         
	//*  23   58:ifnull          149
		{
			String s = String.valueOf(((Object) (zzazn.getErrorString(connectionresult.getErrorCode()))));
	//   24   61:aload_0         
	//   25   62:getfield        #126 <Field GoogleApiAvailability zzazn>
	//   26   65:aload_2         
	//   27   66:invokevirtual   #169 <Method int ConnectionResult.getErrorCode()>
	//   28   69:invokevirtual   #175 <Method String GoogleApiAvailability.getErrorString(int)>
	//   29   72:invokestatic    #181 <Method String String.valueOf(Object)>
	//   30   75:astore          4
			connectionresult = ((ConnectionResult) (String.valueOf(((Object) (connectionresult.getErrorMessage())))));
	//   31   77:aload_2         
	//   32   78:invokevirtual   #185 <Method String ConnectionResult.getErrorMessage()>
	//   33   81:invokestatic    #181 <Method String String.valueOf(Object)>
	//   34   84:astore_2        
			i = String.valueOf(((Object) (s))).length();
	//   35   85:aload           4
	//   36   87:invokestatic    #181 <Method String String.valueOf(Object)>
	//   37   90:invokevirtual   #188 <Method int String.length()>
	//   38   93:istore_1        
			zza1.zzD(new Status(17, (new StringBuilder(String.valueOf(((Object) (connectionresult))).length() + (i + 69))).append("Error resolution was canceled by the user, original error message: ").append(s).append(": ").append(((String) (connectionresult))).toString()));
	//   39   94:aload_3         
	//   40   95:new             #57  <Class Status>
	//   41   98:dup             
	//   42   99:bipush          17
	//   43  101:new             #190 <Class StringBuilder>
	//   44  104:dup             
	//   45  105:aload_2         
	//   46  106:invokestatic    #181 <Method String String.valueOf(Object)>
	//   47  109:invokevirtual   #188 <Method int String.length()>
	//   48  112:iload_1         
	//   49  113:bipush          69
	//   50  115:iadd            
	//   51  116:iadd            
	//   52  117:invokespecial   #191 <Method void StringBuilder(int)>
	//   53  120:ldc1            #193 <String "Error resolution was canceled by the user, original error message: ">
	//   54  122:invokevirtual   #197 <Method StringBuilder StringBuilder.append(String)>
	//   55  125:aload           4
	//   56  127:invokevirtual   #197 <Method StringBuilder StringBuilder.append(String)>
	//   57  130:ldc1            #199 <String ": ">
	//   58  132:invokevirtual   #197 <Method StringBuilder StringBuilder.append(String)>
	//   59  135:aload_2         
	//   60  136:invokevirtual   #197 <Method StringBuilder StringBuilder.append(String)>
	//   61  139:invokevirtual   #202 <Method String StringBuilder.toString()>
	//   62  142:invokespecial   #63  <Method void Status(int, String)>
	//   63  145:invokevirtual   #206 <Method void zzaax$zza.zzD(Status)>
			return;
	//   64  148:return          
		} else
		{
			Log.wtf("GoogleApiManager", (new StringBuilder(76)).append("Could not find API instance ").append(i).append(" while trying to fail enqueued calls.").toString(), ((Throwable) (new Exception())));
	//   65  149:ldc1            #208 <String "GoogleApiManager">
	//   66  151:new             #190 <Class StringBuilder>
	//   67  154:dup             
	//   68  155:bipush          76
	//   69  157:invokespecial   #191 <Method void StringBuilder(int)>
	//   70  160:ldc1            #210 <String "Could not find API instance ">
	//   71  162:invokevirtual   #197 <Method StringBuilder StringBuilder.append(String)>
	//   72  165:iload_1         
	//   73  166:invokevirtual   #213 <Method StringBuilder StringBuilder.append(int)>
	//   74  169:ldc1            #215 <String " while trying to fail enqueued calls.">
	//   75  171:invokevirtual   #197 <Method StringBuilder StringBuilder.append(String)>
	//   76  174:invokevirtual   #202 <Method String StringBuilder.toString()>
	//   77  177:new             #217 <Class Exception>
	//   78  180:dup             
	//   79  181:invokespecial   #218 <Method void Exception()>
	//   80  184:invokestatic    #224 <Method int Log.wtf(String, String, Throwable)>
	//   81  187:pop             
			return;
	//   82  188:return          
		}
	}

	private void zza(zzaab zzaab1)
	{
		for(Iterator iterator = zzaab1.zzvz().iterator(); iterator.hasNext();)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #232 <Method Set zzaab.zzvz()>
	//*   2    4:invokeinterface #235 <Method Iterator Set.iterator()>
	//*   3    9:astore_2        
	//*   4   10:aload_2         
	//*   5   11:invokeinterface #156 <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            113
		{
			zzzz zzzz1 = (zzzz)iterator.next();
	//    7   19:aload_2         
	//    8   20:invokeinterface #160 <Method Object Iterator.next()>
	//    9   25:checkcast       #237 <Class zzzz>
	//   10   28:astore_3        
			zza zza1 = (zza)zzaAM.get(((Object) (zzzz1)));
	//   11   29:aload_0         
	//   12   30:getfield        #106 <Field Map zzaAM>
	//   13   33:aload_3         
	//   14   34:invokeinterface #241 <Method Object Map.get(Object)>
	//   15   39:checkcast       #10  <Class zzaax$zza>
	//   16   42:astore          4
			if(zza1 == null)
	//*  17   44:aload           4
	//*  18   46:ifnonnull       64
			{
				zzaab1.zza(zzzz1, new ConnectionResult(13));
	//   19   49:aload_1         
	//   20   50:aload_3         
	//   21   51:new             #166 <Class ConnectionResult>
	//   22   54:dup             
	//   23   55:bipush          13
	//   24   57:invokespecial   #242 <Method void ConnectionResult(int)>
	//   25   60:invokevirtual   #245 <Method void com.google.android.gms.internal.zzaab.zza(zzzz, ConnectionResult)>
				return;
	//   26   63:return          
			}
			if(zza1.isConnected())
	//*  27   64:aload           4
	//*  28   66:invokevirtual   #248 <Method boolean zzaax$zza.isConnected()>
	//*  29   69:ifeq            83
				zzaab1.zza(zzzz1, ConnectionResult.zzayj);
	//   30   72:aload_1         
	//   31   73:aload_3         
	//   32   74:getstatic       #252 <Field ConnectionResult ConnectionResult.zzayj>
	//   33   77:invokevirtual   #245 <Method void com.google.android.gms.internal.zzaab.zza(zzzz, ConnectionResult)>
			else
	//*  34   80:goto            110
			if(zza1.zzwK() != null)
	//*  35   83:aload           4
	//*  36   85:invokevirtual   #256 <Method ConnectionResult zzaax$zza.zzwK()>
	//*  37   88:ifnull          104
				zzaab1.zza(zzzz1, zza1.zzwK());
	//   38   91:aload_1         
	//   39   92:aload_3         
	//   40   93:aload           4
	//   41   95:invokevirtual   #256 <Method ConnectionResult zzaax$zza.zzwK()>
	//   42   98:invokevirtual   #245 <Method void com.google.android.gms.internal.zzaab.zza(zzzz, ConnectionResult)>
			else
	//*  43  101:goto            110
				zza1.zzb(zzaab1);
	//   44  104:aload           4
	//   45  106:aload_1         
	//   46  107:invokevirtual   #258 <Method void zzaax$zza.zzb(zzaab)>
		}

	//*  47  110:goto            10
	//   48  113:return          
	}

	private void zza(zzabl zzabl1)
	{
		zza zza2 = (zza)zzaAM.get(((Object) (zzabl1.zzaDe.getApiKey())));
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field Map zzaAM>
	//    2    4:aload_1         
	//    3    5:getfield        #265 <Field zzc zzabl.zzaDe>
	//    4    8:invokevirtual   #271 <Method zzzz zzc.getApiKey()>
	//    5   11:invokeinterface #241 <Method Object Map.get(Object)>
	//    6   16:checkcast       #10  <Class zzaax$zza>
	//    7   19:astore_3        
		zza zza1 = zza2;
	//    8   20:aload_3         
	//    9   21:astore_2        
		if(zza2 == null)
	//*  10   22:aload_3         
	//*  11   23:ifnonnull       54
		{
			zzc(zzabl1.zzaDe);
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:getfield        #265 <Field zzc zzabl.zzaDe>
	//   15   31:invokespecial   #275 <Method void zzc(zzc)>
			zza1 = (zza)zzaAM.get(((Object) (zzabl1.zzaDe.getApiKey())));
	//   16   34:aload_0         
	//   17   35:getfield        #106 <Field Map zzaAM>
	//   18   38:aload_1         
	//   19   39:getfield        #265 <Field zzc zzabl.zzaDe>
	//   20   42:invokevirtual   #271 <Method zzzz zzc.getApiKey()>
	//   21   45:invokeinterface #241 <Method Object Map.get(Object)>
	//   22   50:checkcast       #10  <Class zzaax$zza>
	//   23   53:astore_2        
		}
		if(zza1.zzrd() && zzaCt.get() != zzabl1.zzaDd)
	//*  24   54:aload_2         
	//*  25   55:invokevirtual   #278 <Method boolean zzaax$zza.zzrd()>
	//*  26   58:ifeq            90
	//*  27   61:aload_0         
	//*  28   62:getfield        #98  <Field AtomicInteger zzaCt>
	//*  29   65:invokevirtual   #280 <Method int AtomicInteger.get()>
	//*  30   68:aload_1         
	//*  31   69:getfield        #283 <Field int zzabl.zzaDd>
	//*  32   72:icmpeq          90
		{
			zzabl1.zzaDc.zzz(zzaCn);
	//   33   75:aload_1         
	//   34   76:getfield        #287 <Field zzzx zzabl.zzaDc>
	//   35   79:getstatic       #65  <Field Status zzaCn>
	//   36   82:invokevirtual   #292 <Method void zzzx.zzz(Status)>
			zza1.signOut();
	//   37   85:aload_2         
	//   38   86:invokevirtual   #295 <Method void zzaax$zza.signOut()>
			return;
	//   39   89:return          
		} else
		{
			zza1.zza(zzabl1.zzaDc);
	//   40   90:aload_2         
	//   41   91:aload_1         
	//   42   92:getfield        #287 <Field zzzx zzabl.zzaDc>
	//   43   95:invokevirtual   #298 <Method void com.google.android.gms.internal.zzaax$zza.zza(zzzx)>
			return;
	//   44   98:return          
		}
	}

	public static zzaax zzaP(Context context)
	{
		Object obj = zztX;
	//    0    0:getstatic       #73  <Field Object zztX>
	//    1    3:astore_1        
		obj;
	//    2    4:aload_1         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		if(zzaCq == null)
	//*   4    6:getstatic       #302 <Field zzaax zzaCq>
	//*   5    9:ifnonnull       34
		{
			Looper looper = zzwy();
	//    6   12:invokestatic    #306 <Method Looper zzwy()>
	//    7   15:astore_2        
			zzaCq = new zzaax(context.getApplicationContext(), looper, GoogleApiAvailability.getInstance());
	//    8   16:new             #2   <Class zzaax>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:invokevirtual   #312 <Method Context Context.getApplicationContext()>
	//   12   24:aload_2         
	//   13   25:invokestatic    #316 <Method GoogleApiAvailability GoogleApiAvailability.getInstance()>
	//   14   28:invokespecial   #318 <Method void zzaax(Context, Looper, GoogleApiAvailability)>
	//   15   31:putstatic       #302 <Field zzaax zzaCq>
		}
		context = ((Context) (zzaCq));
	//   16   34:getstatic       #302 <Field zzaax zzaCq>
	//   17   37:astore_0        
		obj;
	//   18   38:aload_1         
		JVM INSTR monitorexit ;
	//   19   39:monitorexit     
		return ((zzaax) (context));
	//   20   40:aload_0         
	//   21   41:areturn         
		context;
	//   22   42:astore_0        
	//*  23   43:aload_1         
		throw context;
	//   24   44:monitorexit     
	//   25   45:aload_0         
	//   26   46:athrow          
	}

	private void zzav(boolean flag)
	{
		long l;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            11
			l = 10000L;
	//    2    4:ldc2w           #84  <Long 10000L>
	//    3    7:lstore_2        
		else
	//*   4    8:goto            15
			l = 0x493e0L;
	//    5   11:ldc2w           #321 <Long 0x493e0L>
	//    6   14:lstore_2        
		zzaCp = l;
	//    7   15:aload_0         
	//    8   16:lload_2         
	//    9   17:putfield        #87  <Field long zzaCp>
		mHandler.removeMessages(12);
	//   10   20:aload_0         
	//   11   21:getfield        #124 <Field Handler mHandler>
	//   12   24:bipush          12
	//   13   26:invokevirtual   #325 <Method void Handler.removeMessages(int)>
		zzzz zzzz1;
		for(Iterator iterator = zzaAM.keySet().iterator(); iterator.hasNext(); mHandler.sendMessageDelayed(mHandler.obtainMessage(12, ((Object) (zzzz1))), zzaCp))
	//*  14   29:aload_0         
	//*  15   30:getfield        #106 <Field Map zzaAM>
	//*  16   33:invokeinterface #328 <Method Set Map.keySet()>
	//*  17   38:invokeinterface #235 <Method Iterator Set.iterator()>
	//*  18   43:astore          4
	//*  19   45:aload           4
	//*  20   47:invokeinterface #156 <Method boolean Iterator.hasNext()>
	//*  21   52:ifeq            93
			zzzz1 = (zzzz)iterator.next();
	//   22   55:aload           4
	//   23   57:invokeinterface #160 <Method Object Iterator.next()>
	//   24   62:checkcast       #237 <Class zzzz>
	//   25   65:astore          5

	//   26   67:aload_0         
	//   27   68:getfield        #124 <Field Handler mHandler>
	//   28   71:aload_0         
	//   29   72:getfield        #124 <Field Handler mHandler>
	//   30   75:bipush          12
	//   31   77:aload           5
	//   32   79:invokevirtual   #331 <Method Message Handler.obtainMessage(int, Object)>
	//   33   82:aload_0         
	//   34   83:getfield        #87  <Field long zzaCp>
	//   35   86:invokevirtual   #335 <Method boolean Handler.sendMessageDelayed(Message, long)>
	//   36   89:pop             
	//*  37   90:goto            45
	//   38   93:return          
	}

	static Context zzb(zzaax zzaax1)
	{
		return zzaax1.mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field Context mContext>
	//    2    4:areturn         
	}

	static long zzc(zzaax zzaax1)
	{
		return zzaax1.zzaBN;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field long zzaBN>
	//    2    4:lreturn         
	}

	private void zzc(zzc zzc1)
	{
		zzzz zzzz1 = zzc1.getApiKey();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #271 <Method zzzz zzc.getApiKey()>
	//    2    4:astore          4
		zza zza2 = (zza)zzaAM.get(((Object) (zzzz1)));
	//    3    6:aload_0         
	//    4    7:getfield        #106 <Field Map zzaAM>
	//    5   10:aload           4
	//    6   12:invokeinterface #241 <Method Object Map.get(Object)>
	//    7   17:checkcast       #10  <Class zzaax$zza>
	//    8   20:astore_3        
		zza zza1 = zza2;
	//    9   21:aload_3         
	//   10   22:astore_2        
		if(zza2 == null)
	//*  11   23:aload_3         
	//*  12   24:ifnonnull       50
		{
			zza1 = new zza(zzc1);
	//   13   27:new             #10  <Class zzaax$zza>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:invokespecial   #340 <Method void zzaax$zza(zzaax, zzc)>
	//   18   36:astore_2        
			zzaAM.put(((Object) (zzzz1)), ((Object) (zza1)));
	//   19   37:aload_0         
	//   20   38:getfield        #106 <Field Map zzaAM>
	//   21   41:aload           4
	//   22   43:aload_2         
	//   23   44:invokeinterface #344 <Method Object Map.put(Object, Object)>
	//   24   49:pop             
		}
		if(zza1.zzrd())
	//*  25   50:aload_2         
	//*  26   51:invokevirtual   #278 <Method boolean zzaax$zza.zzrd()>
	//*  27   54:ifeq            69
			zzaCw.add(((Object) (zzzz1)));
	//   28   57:aload_0         
	//   29   58:getfield        #115 <Field Set zzaCw>
	//   30   61:aload           4
	//   31   63:invokeinterface #348 <Method boolean Set.add(Object)>
	//   32   68:pop             
		zza1.connect();
	//   33   69:aload_2         
	//   34   70:invokevirtual   #351 <Method void zzaax$zza.connect()>
	//   35   73:return          
	}

	static long zzd(zzaax zzaax1)
	{
		return zzaax1.zzaBM;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field long zzaBM>
	//    2    4:lreturn         
	}

	static zzaam zze(zzaax zzaax1)
	{
		return zzaax1.zzaCu;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field zzaam zzaCu>
	//    2    4:areturn         
	}

	static Set zzf(zzaax zzaax1)
	{
		return zzaax1.zzaCv;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Set zzaCv>
	//    2    4:areturn         
	}

	static GoogleApiAvailability zzg(zzaax zzaax1)
	{
		return zzaax1.zzazn;
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field GoogleApiAvailability zzazn>
	//    2    4:areturn         
	}

	static long zzh(zzaax zzaax1)
	{
		return zzaax1.zzaCp;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field long zzaCp>
	//    2    4:lreturn         
	}

	static int zzi(zzaax zzaax1)
	{
		return zzaax1.zzaCr;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field int zzaCr>
	//    2    4:ireturn         
	}

	static Map zzj(zzaax zzaax1)
	{
		return zzaax1.zzaAM;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field Map zzaAM>
	//    2    4:areturn         
	}

	private void zzwA()
	{
		zzt.zzzg();
	//    0    0:invokestatic    #371 <Method boolean zzt.zzzg()>
	//    1    3:pop             
		if(mContext.getApplicationContext() instanceof Application)
	//*   2    4:aload_0         
	//*   3    5:getfield        #117 <Field Context mContext>
	//*   4    8:invokevirtual   #312 <Method Context Context.getApplicationContext()>
	//*   5   11:instanceof      #373 <Class Application>
	//*   6   14:ifeq            61
		{
			com.google.android.gms.internal.zzaac.zza((Application)mContext.getApplicationContext());
	//    7   17:aload_0         
	//    8   18:getfield        #117 <Field Context mContext>
	//    9   21:invokevirtual   #312 <Method Context Context.getApplicationContext()>
	//   10   24:checkcast       #373 <Class Application>
	//   11   27:invokestatic    #378 <Method void com.google.android.gms.internal.zzaac.zza(Application)>
			zzaac.zzvB().zza(new zzaac.zza() {

				public void zzat(boolean flag)
				{
					com.google.android.gms.internal.zzaax.zza(zzaCx).sendMessage(com.google.android.gms.internal.zzaax.zza(zzaCx).obtainMessage(1, ((Object) (Boolean.valueOf(flag)))));
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field zzaax zzaCx>
				//    2    4:invokestatic    #26  <Method Handler com.google.android.gms.internal.zzaax.zza(zzaax)>
				//    3    7:aload_0         
				//    4    8:getfield        #17  <Field zzaax zzaCx>
				//    5   11:invokestatic    #26  <Method Handler com.google.android.gms.internal.zzaax.zza(zzaax)>
				//    6   14:iconst_1        
				//    7   15:iload_1         
				//    8   16:invokestatic    #32  <Method Boolean Boolean.valueOf(boolean)>
				//    9   19:invokevirtual   #38  <Method Message Handler.obtainMessage(int, Object)>
				//   10   22:invokevirtual   #42  <Method boolean Handler.sendMessage(Message)>
				//   11   25:pop             
				//   12   26:return          
				}

				final zzaax zzaCx;

			
			{
				zzaCx = zzaax.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field zzaax zzaCx>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   12   30:invokestatic    #382 <Method zzaac zzaac.zzvB()>
	//   13   33:new             #8   <Class zzaax$1>
	//   14   36:dup             
	//   15   37:aload_0         
	//   16   38:invokespecial   #385 <Method void zzaax$1(zzaax)>
	//   17   41:invokevirtual   #388 <Method void com.google.android.gms.internal.zzaac.zza(zzaac$zza)>
			if(!zzaac.zzvB().zzas(true))
	//*  18   44:invokestatic    #382 <Method zzaac zzaac.zzvB()>
	//*  19   47:iconst_1        
	//*  20   48:invokevirtual   #392 <Method boolean zzaac.zzas(boolean)>
	//*  21   51:ifne            61
				zzaCp = 0x493e0L;
	//   22   54:aload_0         
	//   23   55:ldc2w           #321 <Long 0x493e0L>
	//   24   58:putfield        #87  <Field long zzaCp>
		}
	//   25   61:return          
	}

	private void zzwB()
	{
		zza zza1;
		for(Iterator iterator = zzaAM.values().iterator(); iterator.hasNext(); zza1.connect())
	//*   0    0:aload_0         
	//*   1    1:getfield        #106 <Field Map zzaAM>
	//*   2    4:invokeinterface #144 <Method Collection Map.values()>
	//*   3    9:invokeinterface #150 <Method Iterator Collection.iterator()>
	//*   4   14:astore_1        
	//*   5   15:aload_1         
	//*   6   16:invokeinterface #156 <Method boolean Iterator.hasNext()>
	//*   7   21:ifeq            45
		{
			zza1 = (zza)iterator.next();
	//    8   24:aload_1         
	//    9   25:invokeinterface #160 <Method Object Iterator.next()>
	//   10   30:checkcast       #10  <Class zzaax$zza>
	//   11   33:astore_2        
			zza1.zzwJ();
	//   12   34:aload_2         
	//   13   35:invokevirtual   #396 <Method void zzaax$zza.zzwJ()>
		}

	//   14   38:aload_2         
	//   15   39:invokevirtual   #351 <Method void zzaax$zza.connect()>
	//*  16   42:goto            15
	//   17   45:return          
	}

	private void zzwC()
	{
		zzzz zzzz1;
		for(Iterator iterator = zzaCw.iterator(); iterator.hasNext(); ((zza)zzaAM.remove(((Object) (zzzz1)))).signOut())
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field Set zzaCw>
	//*   2    4:invokeinterface #235 <Method Iterator Set.iterator()>
	//*   3    9:astore_1        
	//*   4   10:aload_1         
	//*   5   11:invokeinterface #156 <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            48
			zzzz1 = (zzzz)iterator.next();
	//    7   19:aload_1         
	//    8   20:invokeinterface #160 <Method Object Iterator.next()>
	//    9   25:checkcast       #237 <Class zzzz>
	//   10   28:astore_2        

	//   11   29:aload_0         
	//   12   30:getfield        #106 <Field Map zzaAM>
	//   13   33:aload_2         
	//   14   34:invokeinterface #400 <Method Object Map.remove(Object)>
	//   15   39:checkcast       #10  <Class zzaax$zza>
	//   16   42:invokevirtual   #295 <Method void zzaax$zza.signOut()>
	//*  17   45:goto            10
		zzaCw.clear();
	//   18   48:aload_0         
	//   19   49:getfield        #115 <Field Set zzaCw>
	//   20   52:invokeinterface #403 <Method void Set.clear()>
	//   21   57:return          
	}

	static Status zzwD()
	{
		return zzaCo;
	//    0    0:getstatic       #69  <Field Status zzaCo>
	//    1    3:areturn         
	}

	static Object zzwE()
	{
		return zztX;
	//    0    0:getstatic       #73  <Field Object zztX>
	//    1    3:areturn         
	}

	public static zzaax zzww()
	{
		Object obj = zztX;
	//    0    0:getstatic       #73  <Field Object zztX>
	//    1    3:astore_0        
		obj;
	//    2    4:aload_0         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		zzaax zzaax1;
		zzac.zzb(((Object) (zzaCq)), "Must guarantee manager is non-null before using getInstance");
	//    4    6:getstatic       #302 <Field zzaax zzaCq>
	//    5    9:ldc2            #410 <String "Must guarantee manager is non-null before using getInstance">
	//    6   12:invokestatic    #414 <Method Object zzac.zzb(Object, Object)>
	//    7   15:pop             
		zzaax1 = zzaCq;
	//    8   16:getstatic       #302 <Field zzaax zzaCq>
	//    9   19:astore_1        
		obj;
	//   10   20:aload_0         
		JVM INSTR monitorexit ;
	//   11   21:monitorexit     
		return zzaax1;
	//   12   22:aload_1         
	//   13   23:areturn         
		Exception exception;
		exception;
	//   14   24:astore_1        
	//*  15   25:aload_0         
		throw exception;
	//   16   26:monitorexit     
	//   17   27:aload_1         
	//   18   28:athrow          
	}

	public static void zzwx()
	{
		Object obj = zztX;
	//    0    0:getstatic       #73  <Field Object zztX>
	//    1    3:astore_0        
		obj;
	//    2    4:aload_0         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		if(zzaCq != null)
	//*   4    6:getstatic       #302 <Field zzaax zzaCq>
	//*   5    9:ifnull          18
			zzaCq.signOut();
	//    6   12:getstatic       #302 <Field zzaax zzaCq>
	//    7   15:invokevirtual   #416 <Method void signOut()>
		obj;
	//    8   18:aload_0         
		JVM INSTR monitorexit ;
	//    9   19:monitorexit     
		return;
	//   10   20:return          
		Exception exception;
		exception;
	//   11   21:astore_1        
	//*  12   22:aload_0         
		throw exception;
	//   13   23:monitorexit     
	//   14   24:aload_1         
	//   15   25:athrow          
	}

	private static Looper zzwy()
	{
		HandlerThread handlerthread = new HandlerThread("GoogleApiHandler", 9);
	//    0    0:new             #418 <Class HandlerThread>
	//    1    3:dup             
	//    2    4:ldc2            #420 <String "GoogleApiHandler">
	//    3    7:bipush          9
	//    4    9:invokespecial   #423 <Method void HandlerThread(String, int)>
	//    5   12:astore_0        
		handlerthread.start();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #426 <Method void HandlerThread.start()>
		return handlerthread.getLooper();
	//    8   17:aload_0         
	//    9   18:invokevirtual   #429 <Method Looper HandlerThread.getLooper()>
	//   10   21:areturn         
	}

	public boolean handleMessage(Message message)
	{
		switch(message.what)
	//*   0    0:aload_1         
	//*   1    1:getfield        #435 <Field int Message.what>
		{
	//*   2    4:tableswitch     1 13: default 72
	//	               1 75
	//	               2 92
	//	               3 106
	//	               4 113
	//	               5 127
	//	               6 145
	//	               7 152
	//	               8 113
	//	               9 166
	//	               10 204
	//	               11 211
	//	               12 249
	//	               13 113
	//*   3   72:goto            287
		case 1: // '\001'
			zzav(((Boolean)message.obj).booleanValue());
	//    4   75:aload_0         
	//    5   76:aload_1         
	//    6   77:getfield        #438 <Field Object Message.obj>
	//    7   80:checkcast       #440 <Class Boolean>
	//    8   83:invokevirtual   #443 <Method boolean Boolean.booleanValue()>
	//    9   86:invokespecial   #445 <Method void zzav(boolean)>
			break;
	//   10   89:goto            322

		case 2: // '\002'
			zza((zzaab)message.obj);
	//   11   92:aload_0         
	//   12   93:aload_1         
	//   13   94:getfield        #438 <Field Object Message.obj>
	//   14   97:checkcast       #228 <Class zzaab>
	//   15  100:invokespecial   #447 <Method void zza(zzaab)>
			break;
	//   16  103:goto            322

		case 3: // '\003'
			zzwB();
	//   17  106:aload_0         
	//   18  107:invokespecial   #449 <Method void zzwB()>
			break;
	//   19  110:goto            322

		case 4: // '\004'
		case 8: // '\b'
		case 13: // '\r'
			zza((zzabl)message.obj);
	//   20  113:aload_0         
	//   21  114:aload_1         
	//   22  115:getfield        #438 <Field Object Message.obj>
	//   23  118:checkcast       #261 <Class zzabl>
	//   24  121:invokespecial   #451 <Method void zza(zzabl)>
			break;
	//   25  124:goto            322

		case 5: // '\005'
			zza(message.arg1, (ConnectionResult)message.obj);
	//   26  127:aload_0         
	//   27  128:aload_1         
	//   28  129:getfield        #454 <Field int Message.arg1>
	//   29  132:aload_1         
	//   30  133:getfield        #438 <Field Object Message.obj>
	//   31  136:checkcast       #166 <Class ConnectionResult>
	//   32  139:invokespecial   #456 <Method void zza(int, ConnectionResult)>
			break;
	//   33  142:goto            322

		case 6: // '\006'
			zzwA();
	//   34  145:aload_0         
	//   35  146:invokespecial   #458 <Method void zzwA()>
			break;
	//   36  149:goto            322

		case 7: // '\007'
			zzc((zzc)message.obj);
	//   37  152:aload_0         
	//   38  153:aload_1         
	//   39  154:getfield        #438 <Field Object Message.obj>
	//   40  157:checkcast       #267 <Class zzc>
	//   41  160:invokespecial   #275 <Method void zzc(zzc)>
			break;
	//   42  163:goto            322

		case 9: // '\t'
			if(zzaAM.containsKey(message.obj))
	//*  43  166:aload_0         
	//*  44  167:getfield        #106 <Field Map zzaAM>
	//*  45  170:aload_1         
	//*  46  171:getfield        #438 <Field Object Message.obj>
	//*  47  174:invokeinterface #461 <Method boolean Map.containsKey(Object)>
	//*  48  179:ifeq            322
				((zza)zzaAM.get(message.obj)).resume();
	//   49  182:aload_0         
	//   50  183:getfield        #106 <Field Map zzaAM>
	//   51  186:aload_1         
	//   52  187:getfield        #438 <Field Object Message.obj>
	//   53  190:invokeinterface #241 <Method Object Map.get(Object)>
	//   54  195:checkcast       #10  <Class zzaax$zza>
	//   55  198:invokevirtual   #464 <Method void zzaax$zza.resume()>
			break;
	//   56  201:goto            322

		case 10: // '\n'
			zzwC();
	//   57  204:aload_0         
	//   58  205:invokespecial   #466 <Method void zzwC()>
			break;
	//   59  208:goto            322

		case 11: // '\013'
			if(zzaAM.containsKey(message.obj))
	//*  60  211:aload_0         
	//*  61  212:getfield        #106 <Field Map zzaAM>
	//*  62  215:aload_1         
	//*  63  216:getfield        #438 <Field Object Message.obj>
	//*  64  219:invokeinterface #461 <Method boolean Map.containsKey(Object)>
	//*  65  224:ifeq            322
				((zza)zzaAM.get(message.obj)).zzwn();
	//   66  227:aload_0         
	//   67  228:getfield        #106 <Field Map zzaAM>
	//   68  231:aload_1         
	//   69  232:getfield        #438 <Field Object Message.obj>
	//   70  235:invokeinterface #241 <Method Object Map.get(Object)>
	//   71  240:checkcast       #10  <Class zzaax$zza>
	//   72  243:invokevirtual   #469 <Method void zzaax$zza.zzwn()>
			break;
	//   73  246:goto            322

		case 12: // '\f'
			if(zzaAM.containsKey(message.obj))
	//*  74  249:aload_0         
	//*  75  250:getfield        #106 <Field Map zzaAM>
	//*  76  253:aload_1         
	//*  77  254:getfield        #438 <Field Object Message.obj>
	//*  78  257:invokeinterface #461 <Method boolean Map.containsKey(Object)>
	//*  79  262:ifeq            322
				((zza)zzaAM.get(message.obj)).zzwN();
	//   80  265:aload_0         
	//   81  266:getfield        #106 <Field Map zzaAM>
	//   82  269:aload_1         
	//   83  270:getfield        #438 <Field Object Message.obj>
	//   84  273:invokeinterface #241 <Method Object Map.get(Object)>
	//   85  278:checkcast       #10  <Class zzaax$zza>
	//   86  281:invokevirtual   #472 <Method void zzaax$zza.zzwN()>
			break;

	//*  87  284:goto            322
		default:
			int i = message.what;
	//   88  287:aload_1         
	//   89  288:getfield        #435 <Field int Message.what>
	//   90  291:istore_2        
			Log.w("GoogleApiManager", (new StringBuilder(31)).append("Unknown message id: ").append(i).toString());
	//   91  292:ldc1            #208 <String "GoogleApiManager">
	//   92  294:new             #190 <Class StringBuilder>
	//   93  297:dup             
	//   94  298:bipush          31
	//   95  300:invokespecial   #191 <Method void StringBuilder(int)>
	//   96  303:ldc2            #474 <String "Unknown message id: ">
	//   97  306:invokevirtual   #197 <Method StringBuilder StringBuilder.append(String)>
	//   98  309:iload_2         
	//   99  310:invokevirtual   #213 <Method StringBuilder StringBuilder.append(int)>
	//  100  313:invokevirtual   #202 <Method String StringBuilder.toString()>
	//  101  316:invokestatic    #478 <Method int Log.w(String, String)>
	//  102  319:pop             
			return false;
	//  103  320:iconst_0        
	//  104  321:ireturn         
		}
		return true;
	//  105  322:iconst_1        
	//  106  323:ireturn         
	}

	public void signOut()
	{
		zzaCt.incrementAndGet();
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field AtomicInteger zzaCt>
	//    2    4:invokevirtual   #481 <Method int AtomicInteger.incrementAndGet()>
	//    3    7:pop             
		mHandler.sendMessageAtFrontOfQueue(mHandler.obtainMessage(10));
	//    4    8:aload_0         
	//    5    9:getfield        #124 <Field Handler mHandler>
	//    6   12:aload_0         
	//    7   13:getfield        #124 <Field Handler mHandler>
	//    8   16:bipush          10
	//    9   18:invokevirtual   #130 <Method Message Handler.obtainMessage(int)>
	//   10   21:invokevirtual   #484 <Method boolean Handler.sendMessageAtFrontOfQueue(Message)>
	//   11   24:pop             
	//   12   25:return          
	}

	PendingIntent zza(zzzz zzzz1, int i)
	{
		if((zza)zzaAM.get(((Object) (zzzz1))) == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #106 <Field Map zzaAM>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #241 <Method Object Map.get(Object)>
	//*   4   10:checkcast       #10  <Class zzaax$zza>
	//*   5   13:ifnonnull       18
			return null;
	//    6   16:aconst_null     
	//    7   17:areturn         
		zzzz1 = ((zzzz) (((zza)zzaAM.get(((Object) (zzzz1)))).zzwO()));
	//    8   18:aload_0         
	//    9   19:getfield        #106 <Field Map zzaAM>
	//   10   22:aload_1         
	//   11   23:invokeinterface #241 <Method Object Map.get(Object)>
	//   12   28:checkcast       #10  <Class zzaax$zza>
	//   13   31:invokevirtual   #489 <Method zzbai zzaax$zza.zzwO()>
	//   14   34:astore_1        
		if(zzzz1 == null)
	//*  15   35:aload_1         
	//*  16   36:ifnonnull       41
			return null;
	//   17   39:aconst_null     
	//   18   40:areturn         
		else
			return PendingIntent.getActivity(mContext, i, ((zzbai) (zzzz1)).zzrs(), 0x8000000);
	//   19   41:aload_0         
	//   20   42:getfield        #117 <Field Context mContext>
	//   21   45:iload_2         
	//   22   46:aload_1         
	//   23   47:invokeinterface #495 <Method android.content.Intent zzbai.zzrs()>
	//   24   52:ldc2            #496 <Int 0x8000000>
	//   25   55:invokestatic    #502 <Method PendingIntent PendingIntent.getActivity(Context, int, android.content.Intent, int)>
	//   26   58:areturn         
	}

	public Task zza(zzc zzc1, zzabh.zzb zzb1)
	{
		TaskCompletionSource taskcompletionsource = new TaskCompletionSource();
	//    0    0:new             #507 <Class TaskCompletionSource>
	//    1    3:dup             
	//    2    4:invokespecial   #508 <Method void TaskCompletionSource()>
	//    3    7:astore_3        
		zzb1 = ((zzabh.zzb) (new zzzx.zze(zzb1, taskcompletionsource)));
	//    4    8:new             #510 <Class zzzx$zze>
	//    5   11:dup             
	//    6   12:aload_2         
	//    7   13:aload_3         
	//    8   14:invokespecial   #513 <Method void zzzx$zze(zzabh$zzb, TaskCompletionSource)>
	//    9   17:astore_2        
		mHandler.sendMessage(mHandler.obtainMessage(13, ((Object) (new zzabl(((zzzx) (zzb1)), zzaCt.get(), zzc1)))));
	//   10   18:aload_0         
	//   11   19:getfield        #124 <Field Handler mHandler>
	//   12   22:aload_0         
	//   13   23:getfield        #124 <Field Handler mHandler>
	//   14   26:bipush          13
	//   15   28:new             #261 <Class zzabl>
	//   16   31:dup             
	//   17   32:aload_2         
	//   18   33:aload_0         
	//   19   34:getfield        #98  <Field AtomicInteger zzaCt>
	//   20   37:invokevirtual   #280 <Method int AtomicInteger.get()>
	//   21   40:aload_1         
	//   22   41:invokespecial   #516 <Method void zzabl(zzzx, int, zzc)>
	//   23   44:invokevirtual   #331 <Method Message Handler.obtainMessage(int, Object)>
	//   24   47:invokevirtual   #134 <Method boolean Handler.sendMessage(Message)>
	//   25   50:pop             
		return taskcompletionsource.getTask();
	//   26   51:aload_3         
	//   27   52:invokevirtual   #520 <Method Task TaskCompletionSource.getTask()>
	//   28   55:areturn         
	}

	public Task zza(zzc zzc1, zzabm zzabm, zzabz zzabz)
	{
		TaskCompletionSource taskcompletionsource = new TaskCompletionSource();
	//    0    0:new             #507 <Class TaskCompletionSource>
	//    1    3:dup             
	//    2    4:invokespecial   #508 <Method void TaskCompletionSource()>
	//    3    7:astore          4
		zzabm = ((zzabm) (new zzzx.zzc(new zzabn(zzabm, zzabz), taskcompletionsource)));
	//    4    9:new             #525 <Class zzzx$zzc>
	//    5   12:dup             
	//    6   13:new             #527 <Class zzabn>
	//    7   16:dup             
	//    8   17:aload_2         
	//    9   18:aload_3         
	//   10   19:invokespecial   #530 <Method void zzabn(zzabm, zzabz)>
	//   11   22:aload           4
	//   12   24:invokespecial   #533 <Method void zzzx$zzc(zzabn, TaskCompletionSource)>
	//   13   27:astore_2        
		mHandler.sendMessage(mHandler.obtainMessage(8, ((Object) (new zzabl(((zzzx) (zzabm)), zzaCt.get(), zzc1)))));
	//   14   28:aload_0         
	//   15   29:getfield        #124 <Field Handler mHandler>
	//   16   32:aload_0         
	//   17   33:getfield        #124 <Field Handler mHandler>
	//   18   36:bipush          8
	//   19   38:new             #261 <Class zzabl>
	//   20   41:dup             
	//   21   42:aload_2         
	//   22   43:aload_0         
	//   23   44:getfield        #98  <Field AtomicInteger zzaCt>
	//   24   47:invokevirtual   #280 <Method int AtomicInteger.get()>
	//   25   50:aload_1         
	//   26   51:invokespecial   #516 <Method void zzabl(zzzx, int, zzc)>
	//   27   54:invokevirtual   #331 <Method Message Handler.obtainMessage(int, Object)>
	//   28   57:invokevirtual   #134 <Method boolean Handler.sendMessage(Message)>
	//   29   60:pop             
		return taskcompletionsource.getTask();
	//   30   61:aload           4
	//   31   63:invokevirtual   #520 <Method Task TaskCompletionSource.getTask()>
	//   32   66:areturn         
	}

	public Task zza(Iterable iterable)
	{
		zzaab zzaab1 = new zzaab(iterable);
	//    0    0:new             #228 <Class zzaab>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #538 <Method void zzaab(Iterable)>
	//    4    8:astore_2        
		for(iterable = ((Iterable) (iterable.iterator())); ((Iterator) (iterable)).hasNext();)
	//*   5    9:aload_1         
	//*   6   10:invokeinterface #541 <Method Iterator Iterable.iterator()>
	//*   7   15:astore_1        
	//*   8   16:aload_1         
	//*   9   17:invokeinterface #156 <Method boolean Iterator.hasNext()>
	//*  10   22:ifeq            88
		{
			Object obj = ((Object) ((zzc)((Iterator) (iterable)).next()));
	//   11   25:aload_1         
	//   12   26:invokeinterface #160 <Method Object Iterator.next()>
	//   13   31:checkcast       #267 <Class zzc>
	//   14   34:astore_3        
			obj = ((Object) ((zza)zzaAM.get(((Object) (((zzc) (obj)).getApiKey())))));
	//   15   35:aload_0         
	//   16   36:getfield        #106 <Field Map zzaAM>
	//   17   39:aload_3         
	//   18   40:invokevirtual   #271 <Method zzzz zzc.getApiKey()>
	//   19   43:invokeinterface #241 <Method Object Map.get(Object)>
	//   20   48:checkcast       #10  <Class zzaax$zza>
	//   21   51:astore_3        
			if(obj == null || !((zza) (obj)).isConnected())
	//*  22   52:aload_3         
	//*  23   53:ifnull          63
	//*  24   56:aload_3         
	//*  25   57:invokevirtual   #248 <Method boolean zzaax$zza.isConnected()>
	//*  26   60:ifne            85
			{
				mHandler.sendMessage(mHandler.obtainMessage(2, ((Object) (zzaab1))));
	//   27   63:aload_0         
	//   28   64:getfield        #124 <Field Handler mHandler>
	//   29   67:aload_0         
	//   30   68:getfield        #124 <Field Handler mHandler>
	//   31   71:iconst_2        
	//   32   72:aload_2         
	//   33   73:invokevirtual   #331 <Method Message Handler.obtainMessage(int, Object)>
	//   34   76:invokevirtual   #134 <Method boolean Handler.sendMessage(Message)>
	//   35   79:pop             
				return zzaab1.getTask();
	//   36   80:aload_2         
	//   37   81:invokevirtual   #542 <Method Task zzaab.getTask()>
	//   38   84:areturn         
			}
		}

	//*  39   85:goto            16
		zzaab1.zzvA();
	//   40   88:aload_2         
	//   41   89:invokevirtual   #545 <Method void zzaab.zzvA()>
		return zzaab1.getTask();
	//   42   92:aload_2         
	//   43   93:invokevirtual   #542 <Method Task zzaab.getTask()>
	//   44   96:areturn         
	}

	public void zza(ConnectionResult connectionresult, int i)
	{
		if(!zzc(connectionresult, i))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:iload_2         
	//*   3    3:invokevirtual   #550 <Method boolean zzc(ConnectionResult, int)>
	//*   4    6:ifne            28
			mHandler.sendMessage(mHandler.obtainMessage(5, i, 0, ((Object) (connectionresult))));
	//    5    9:aload_0         
	//    6   10:getfield        #124 <Field Handler mHandler>
	//    7   13:aload_0         
	//    8   14:getfield        #124 <Field Handler mHandler>
	//    9   17:iconst_5        
	//   10   18:iload_2         
	//   11   19:iconst_0        
	//   12   20:aload_1         
	//   13   21:invokevirtual   #553 <Method Message Handler.obtainMessage(int, int, int, Object)>
	//   14   24:invokevirtual   #134 <Method boolean Handler.sendMessage(Message)>
	//   15   27:pop             
	//   16   28:return          
	}

	public void zza(zzc zzc1, int i, zzaad.zza zza1)
	{
		zza1 = ((zzaad.zza) (new zzzx.zzb(i, zza1)));
	//    0    0:new             #556 <Class zzzx$zzb>
	//    1    3:dup             
	//    2    4:iload_2         
	//    3    5:aload_3         
	//    4    6:invokespecial   #559 <Method void zzzx$zzb(int, zzaad$zza)>
	//    5    9:astore_3        
		mHandler.sendMessage(mHandler.obtainMessage(4, ((Object) (new zzabl(((zzzx) (zza1)), zzaCt.get(), zzc1)))));
	//    6   10:aload_0         
	//    7   11:getfield        #124 <Field Handler mHandler>
	//    8   14:aload_0         
	//    9   15:getfield        #124 <Field Handler mHandler>
	//   10   18:iconst_4        
	//   11   19:new             #261 <Class zzabl>
	//   12   22:dup             
	//   13   23:aload_3         
	//   14   24:aload_0         
	//   15   25:getfield        #98  <Field AtomicInteger zzaCt>
	//   16   28:invokevirtual   #280 <Method int AtomicInteger.get()>
	//   17   31:aload_1         
	//   18   32:invokespecial   #516 <Method void zzabl(zzzx, int, zzc)>
	//   19   35:invokevirtual   #331 <Method Message Handler.obtainMessage(int, Object)>
	//   20   38:invokevirtual   #134 <Method boolean Handler.sendMessage(Message)>
	//   21   41:pop             
	//   22   42:return          
	}

	public void zza(zzc zzc1, int i, zzabv zzabv, TaskCompletionSource taskcompletionsource, zzabs zzabs)
	{
		zzabv = ((zzabv) (new zzzx.zzd(i, zzabv, taskcompletionsource, zzabs)));
	//    0    0:new             #563 <Class zzzx$zzd>
	//    1    3:dup             
	//    2    4:iload_2         
	//    3    5:aload_3         
	//    4    6:aload           4
	//    5    8:aload           5
	//    6   10:invokespecial   #566 <Method void zzzx$zzd(int, zzabv, TaskCompletionSource, zzabs)>
	//    7   13:astore_3        
		mHandler.sendMessage(mHandler.obtainMessage(4, ((Object) (new zzabl(((zzzx) (zzabv)), zzaCt.get(), zzc1)))));
	//    8   14:aload_0         
	//    9   15:getfield        #124 <Field Handler mHandler>
	//   10   18:aload_0         
	//   11   19:getfield        #124 <Field Handler mHandler>
	//   12   22:iconst_4        
	//   13   23:new             #261 <Class zzabl>
	//   14   26:dup             
	//   15   27:aload_3         
	//   16   28:aload_0         
	//   17   29:getfield        #98  <Field AtomicInteger zzaCt>
	//   18   32:invokevirtual   #280 <Method int AtomicInteger.get()>
	//   19   35:aload_1         
	//   20   36:invokespecial   #516 <Method void zzabl(zzzx, int, zzc)>
	//   21   39:invokevirtual   #331 <Method Message Handler.obtainMessage(int, Object)>
	//   22   42:invokevirtual   #134 <Method boolean Handler.sendMessage(Message)>
	//   23   45:pop             
	//   24   46:return          
	}

	public void zza(zzaam zzaam1)
	{
		Object obj = zztX;
	//    0    0:getstatic       #73  <Field Object zztX>
	//    1    3:astore_2        
		obj;
	//    2    4:aload_2         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		if(zzaCu != zzaam1)
	//*   4    6:aload_0         
	//*   5    7:getfield        #108 <Field zzaam zzaCu>
	//*   6   10:aload_1         
	//*   7   11:if_acmpeq       42
		{
			zzaCu = zzaam1;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #108 <Field zzaam zzaCu>
			zzaCv.clear();
	//   11   19:aload_0         
	//   12   20:getfield        #113 <Field Set zzaCv>
	//   13   23:invokeinterface #403 <Method void Set.clear()>
			zzaCv.addAll(((Collection) (zzaam1.zzwb())));
	//   14   28:aload_0         
	//   15   29:getfield        #113 <Field Set zzaCv>
	//   16   32:aload_1         
	//   17   33:invokevirtual   #574 <Method zza zzaam.zzwb()>
	//   18   36:invokeinterface #578 <Method boolean Set.addAll(Collection)>
	//   19   41:pop             
		}
		obj;
	//   20   42:aload_2         
		JVM INSTR monitorexit ;
	//   21   43:monitorexit     
		return;
	//   22   44:return          
		zzaam1;
	//   23   45:astore_1        
	//*  24   46:aload_2         
		throw zzaam1;
	//   25   47:monitorexit     
	//   26   48:aload_1         
	//   27   49:athrow          
	}

	public void zzb(zzc zzc1)
	{
		mHandler.sendMessage(mHandler.obtainMessage(7, ((Object) (zzc1))));
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field Handler mHandler>
	//    2    4:aload_0         
	//    3    5:getfield        #124 <Field Handler mHandler>
	//    4    8:bipush          7
	//    5   10:aload_1         
	//    6   11:invokevirtual   #331 <Method Message Handler.obtainMessage(int, Object)>
	//    7   14:invokevirtual   #134 <Method boolean Handler.sendMessage(Message)>
	//    8   17:pop             
	//    9   18:return          
	}

	void zzb(zzaam zzaam1)
	{
		Object obj = zztX;
	//    0    0:getstatic       #73  <Field Object zztX>
	//    1    3:astore_2        
		obj;
	//    2    4:aload_2         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		if(zzaCu == zzaam1)
	//*   4    6:aload_0         
	//*   5    7:getfield        #108 <Field zzaam zzaCu>
	//*   6   10:aload_1         
	//*   7   11:if_acmpne       28
		{
			zzaCu = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #108 <Field zzaam zzaCu>
			zzaCv.clear();
	//   11   19:aload_0         
	//   12   20:getfield        #113 <Field Set zzaCv>
	//   13   23:invokeinterface #403 <Method void Set.clear()>
		}
		obj;
	//   14   28:aload_2         
		JVM INSTR monitorexit ;
	//   15   29:monitorexit     
		return;
	//   16   30:return          
		zzaam1;
	//   17   31:astore_1        
	//*  18   32:aload_2         
		throw zzaam1;
	//   19   33:monitorexit     
	//   20   34:aload_1         
	//   21   35:athrow          
	}

	boolean zzc(ConnectionResult connectionresult, int i)
	{
		return zzazn.zza(mContext, connectionresult, i);
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field GoogleApiAvailability zzazn>
	//    2    4:aload_0         
	//    3    5:getfield        #117 <Field Context mContext>
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:invokevirtual   #581 <Method boolean GoogleApiAvailability.zza(Context, ConnectionResult, int)>
	//    7   13:ireturn         
	}

	void zzvn()
	{
		zzaCt.incrementAndGet();
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field AtomicInteger zzaCt>
	//    2    4:invokevirtual   #481 <Method int AtomicInteger.incrementAndGet()>
	//    3    7:pop             
		mHandler.sendMessage(mHandler.obtainMessage(10));
	//    4    8:aload_0         
	//    5    9:getfield        #124 <Field Handler mHandler>
	//    6   12:aload_0         
	//    7   13:getfield        #124 <Field Handler mHandler>
	//    8   16:bipush          10
	//    9   18:invokevirtual   #130 <Method Message Handler.obtainMessage(int)>
	//   10   21:invokevirtual   #134 <Method boolean Handler.sendMessage(Message)>
	//   11   24:pop             
	//   12   25:return          
	}

	public void zzvx()
	{
		mHandler.sendMessage(mHandler.obtainMessage(3));
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field Handler mHandler>
	//    2    4:aload_0         
	//    3    5:getfield        #124 <Field Handler mHandler>
	//    4    8:iconst_3        
	//    5    9:invokevirtual   #130 <Method Message Handler.obtainMessage(int)>
	//    6   12:invokevirtual   #134 <Method boolean Handler.sendMessage(Message)>
	//    7   15:pop             
	//    8   16:return          
	}

	public int zzwz()
	{
		return zzaCs.getAndIncrement();
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field AtomicInteger zzaCs>
	//    2    4:invokevirtual   #587 <Method int AtomicInteger.getAndIncrement()>
	//    3    7:ireturn         
	}

	public static final Status zzaCn = new Status(4, "Sign-out occurred while this API call was in progress.");
	private static final Status zzaCo = new Status(4, "The user must be signed in to make this API call.");
	private static zzaax zzaCq;
	private static final Object zztX = new Object();
	private final Context mContext;
	private final Handler mHandler;
	private final Map zzaAM = new ConcurrentHashMap(5, 0.75F, 1);
	private long zzaBM;
	private long zzaBN;
	private long zzaCp;
	private int zzaCr;
	private final AtomicInteger zzaCs = new AtomicInteger(1);
	private final AtomicInteger zzaCt = new AtomicInteger(0);
	private zzaam zzaCu;
	private final Set zzaCv = new com.google.android.gms.common.util.zza();
	private final Set zzaCw = new com.google.android.gms.common.util.zza();
	private final GoogleApiAvailability zzazn;

	static 
	{
	//    0    0:new             #57  <Class Status>
	//    1    3:dup             
	//    2    4:iconst_4        
	//    3    5:ldc1            #59  <String "Sign-out occurred while this API call was in progress.">
	//    4    7:invokespecial   #63  <Method void Status(int, String)>
	//    5   10:putstatic       #65  <Field Status zzaCn>
	//    6   13:new             #57  <Class Status>
	//    7   16:dup             
	//    8   17:iconst_4        
	//    9   18:ldc1            #67  <String "The user must be signed in to make this API call.">
	//   10   20:invokespecial   #63  <Method void Status(int, String)>
	//   11   23:putstatic       #69  <Field Status zzaCo>
	//   12   26:new             #4   <Class Object>
	//   13   29:dup             
	//   14   30:invokespecial   #71  <Method void Object()>
	//   15   33:putstatic       #73  <Field Object zztX>
	//*  16   36:return          
	}
}
