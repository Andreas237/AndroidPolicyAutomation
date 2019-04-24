// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.*;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.common.internal.zzal;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzzz, zzaap, zzaad, zzzq, 
//			zzzu, zzabj, zzaae, zzzs

public class zzaap$zza
	implements com.google.android.gms.common.api.lient.ConnectionCallbacks, com.google.android.gms.common.api.lient.OnConnectionFailedListener, zzzz
{

	private void zzb(zzzq zzzq1)
	{
		zzzq1.zza(zzaBa, zzqD());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #109 <Field zzaad zzaBa>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #139 <Method boolean zzqD()>
	//    5    9:invokevirtual   #144 <Method void zzzq.zza(zzaad, boolean)>
		try
		{
			zzzq1.zza(this);
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #147 <Method void zzzq.zza(zzaap$zza)>
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

	static void zzc(zzaap$zza zzaap$zza1)
	{
		zzaap$zza1.zzvZ();
	//    0    0:aload_0         
	//    1    1:invokespecial   #158 <Method void zzvZ()>
	//    2    4:return          
	}

	static void zzd(zzaap$zza zzaap$zza1)
	{
		zzaap$zza1.zzwa();
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
	//   13   33:invokevirtual   #184 <Method void zzzu.zza(zzzs, ConnectionResult)>
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
		zzaap.zza(zzaBg).sendMessageDelayed(Message.obtain(zzaap.zza(zzaBg), 7, ((Object) (zzaxH))), com.google.android.gms.internal.zzaap.zzc(zzaBg));
	//    8   16:aload_0         
	//    9   17:getfield        #53  <Field zzaap zzaBg>
	//   10   20:invokestatic    #76  <Method Handler zzaap.zza(zzaap)>
	//   11   23:aload_0         
	//   12   24:getfield        #53  <Field zzaap zzaBg>
	//   13   27:invokestatic    #76  <Method Handler zzaap.zza(zzaap)>
	//   14   30:bipush          7
	//   15   32:aload_0         
	//   16   33:getfield        #104 <Field zzzs zzaxH>
	//   17   36:invokestatic    #231 <Method Message Message.obtain(Handler, int, Object)>
	//   18   39:aload_0         
	//   19   40:getfield        #53  <Field zzaap zzaBg>
	//   20   43:invokestatic    #234 <Method long com.google.android.gms.internal.zzaap.zzc(zzaap)>
	//   21   46:invokevirtual   #238 <Method boolean Handler.sendMessageDelayed(Message, long)>
	//   22   49:pop             
		zzaap.zza(zzaBg).sendMessageDelayed(Message.obtain(zzaap.zza(zzaBg), 9, ((Object) (zzaxH))), zzaap.zzd(zzaBg));
	//   23   50:aload_0         
	//   24   51:getfield        #53  <Field zzaap zzaBg>
	//   25   54:invokestatic    #76  <Method Handler zzaap.zza(zzaap)>
	//   26   57:aload_0         
	//   27   58:getfield        #53  <Field zzaap zzaBg>
	//   28   61:invokestatic    #76  <Method Handler zzaap.zza(zzaap)>
	//   29   64:bipush          9
	//   30   66:aload_0         
	//   31   67:getfield        #104 <Field zzzs zzaxH>
	//   32   70:invokestatic    #231 <Method Message Message.obtain(Handler, int, Object)>
	//   33   73:aload_0         
	//   34   74:getfield        #53  <Field zzaap zzaBg>
	//   35   77:invokestatic    #240 <Method long zzaap.zzd(zzaap)>
	//   36   80:invokevirtual   #238 <Method boolean Handler.sendMessageDelayed(Message, long)>
	//   37   83:pop             
		zzaap.zza(zzaBg, -1);
	//   38   84:aload_0         
	//   39   85:getfield        #53  <Field zzaap zzaBg>
	//   40   88:iconst_m1       
	//   41   89:invokestatic    #243 <Method int zzaap.zza(zzaap, int)>
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
			zzaap.zza(zzaBg).removeMessages(9, ((Object) (zzaxH)));
	//    3    7:aload_0         
	//    4    8:getfield        #53  <Field zzaap zzaBg>
	//    5   11:invokestatic    #76  <Method Handler zzaap.zza(zzaap)>
	//    6   14:bipush          9
	//    7   16:aload_0         
	//    8   17:getfield        #104 <Field zzzs zzaxH>
	//    9   20:invokevirtual   #260 <Method void Handler.removeMessages(int, Object)>
			zzaap.zza(zzaBg).removeMessages(7, ((Object) (zzaxH)));
	//   10   23:aload_0         
	//   11   24:getfield        #53  <Field zzaap zzaBg>
	//   12   27:invokestatic    #76  <Method Handler zzaap.zza(zzaap)>
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
		zzaap.zza(zzaBg).removeMessages(10, ((Object) (zzaxH)));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field zzaap zzaBg>
	//    2    4:invokestatic    #76  <Method Handler zzaap.zza(zzaap)>
	//    3    7:bipush          10
	//    4    9:aload_0         
	//    5   10:getfield        #104 <Field zzzs zzaxH>
	//    6   13:invokevirtual   #260 <Method void Handler.removeMessages(int, Object)>
		zzaap.zza(zzaBg).sendMessageDelayed(zzaap.zza(zzaBg).obtainMessage(10, ((Object) (zzaxH))), zzaap.zzh(zzaBg));
	//    7   16:aload_0         
	//    8   17:getfield        #53  <Field zzaap zzaBg>
	//    9   20:invokestatic    #76  <Method Handler zzaap.zza(zzaap)>
	//   10   23:aload_0         
	//   11   24:getfield        #53  <Field zzaap zzaBg>
	//   12   27:invokestatic    #76  <Method Handler zzaap.zza(zzaap)>
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
		zzac.zza(zzaap.zza(zzaBg));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field zzaap zzaBg>
	//    2    4:invokestatic    #76  <Method Handler zzaap.zza(zzaap)>
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
			zzaap.zza(zzaBg, zzaap.zzg(zzaBg).isGooglePlayServicesAvailable(zzaap.zzb(zzaBg)));
	//   21   57:aload_0         
	//   22   58:getfield        #53  <Field zzaap zzaBg>
	//   23   61:aload_0         
	//   24   62:getfield        #53  <Field zzaap zzaBg>
	//   25   65:invokestatic    #287 <Method GoogleApiAvailability zzaap.zzg(zzaap)>
	//   26   68:aload_0         
	//   27   69:getfield        #53  <Field zzaap zzaBg>
	//   28   72:invokestatic    #125 <Method android.content.Context zzaap.zzb(zzaap)>
	//   29   75:invokevirtual   #293 <Method int GoogleApiAvailability.isGooglePlayServicesAvailable(android.content.Context)>
	//   30   78:invokestatic    #243 <Method int zzaap.zza(zzaap, int)>
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
		zzaap$zzb zzaap$zzb1 = new zzaap$zzb(zzaBg, zzazq, zzaxH);
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
			zzaBe.zza(((zzabj$zza) (zzaap$zzb1)));
	//   60  144:aload_0         
	//   61  145:getfield        #131 <Field zzabj zzaBe>
	//   62  148:aload_1         
	//   63  149:invokevirtual   #309 <Method void zzabj.zza(zzabj$zza)>
		zzazq.zza(((com.google.android.gms.common.internal.zzf.zzf) (zzaap$zzb1)));
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
		if(Looper.myLooper() == zzaap.zza(zzaBg).getLooper())
	//*   0    0:invokestatic    #320 <Method Looper Looper.myLooper()>
	//*   1    3:aload_0         
	//*   2    4:getfield        #53  <Field zzaap zzaBg>
	//*   3    7:invokestatic    #76  <Method Handler zzaap.zza(zzaap)>
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
			zzaap.zza(zzaBg).post(new Runnable() {

				public void run()
				{
					com.google.android.gms.internal.zzaap.zza.zzc(zzaBh);
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field zzaap$zza zzaBh>
				//    2    4:invokestatic    #28  <Method void com.google.android.gms.internal.zzaap$zza.zzc(zzaap$zza)>
				//    3    7:return          
				}

				final zzaap.zza zzaBh;

			
			{
				zzaBh = zzaap.zza.this;
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
	//   11   25:invokestatic    #76  <Method Handler zzaap.zza(zzaap)>
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
		zzac.zza(zzaap.zza(zzaBg));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field zzaap zzaBg>
	//    2    4:invokestatic    #76  <Method Handler zzaap.zza(zzaap)>
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
		zzaap.zza(zzaBg, -1);
	//   12   28:aload_0         
	//   13   29:getfield        #53  <Field zzaap zzaBg>
	//   14   32:iconst_m1       
	//   15   33:invokestatic    #243 <Method int zzaap.zza(zzaap, int)>
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
				zzaap.zza(zzaBg).sendMessageDelayed(Message.obtain(zzaap.zza(zzaBg), 7, ((Object) (zzaxH))), com.google.android.gms.internal.zzaap.zzc(zzaBg));
	//   85  172:aload_0         
	//   86  173:getfield        #53  <Field zzaap zzaBg>
	//   87  176:invokestatic    #76  <Method Handler zzaap.zza(zzaap)>
	//   88  179:aload_0         
	//   89  180:getfield        #53  <Field zzaap zzaBg>
	//   90  183:invokestatic    #76  <Method Handler zzaap.zza(zzaap)>
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
		if(Looper.myLooper() == zzaap.zza(zzaBg).getLooper())
	//*   0    0:invokestatic    #320 <Method Looper Looper.myLooper()>
	//*   1    3:aload_0         
	//*   2    4:getfield        #53  <Field zzaap zzaBg>
	//*   3    7:invokestatic    #76  <Method Handler zzaap.zza(zzaap)>
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
			zzaap.zza(zzaBg).post(new Runnable() {

				public void run()
				{
					zzaap.zza.zzd(zzaBh);
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field zzaap$zza zzaBh>
				//    2    4:invokestatic    #28  <Method void zzaap$zza.zzd(zzaap$zza)>
				//    3    7:return          
				}

				final zzaap.zza zzaBh;

			
			{
				zzaBh = zzaap.zza.this;
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
	//   11   25:invokestatic    #76  <Method Handler zzaap.zza(zzaap)>
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
		zzac.zza(zzaap.zza(zzaBg));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field zzaap zzaBg>
	//    2    4:invokestatic    #76  <Method Handler zzaap.zza(zzaap)>
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
		zzac.zza(zzaap.zza(zzaBg));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field zzaap zzaBg>
	//    2    4:invokestatic    #76  <Method Handler zzaap.zza(zzaap)>
	//    3    7:invokestatic    #273 <Method void zzac.zza(Handler)>
		zzC(zzaap.zzaAO);
	//    4   10:aload_0         
	//    5   11:getstatic       #409 <Field Status zzaap.zzaAO>
	//    6   14:invokevirtual   #342 <Method void zzC(Status)>
		zzaBa.zzvv();
	//    7   17:aload_0         
	//    8   18:getfield        #109 <Field zzaad zzaBa>
	//    9   21:invokevirtual   #412 <Method void zzaad.zzvv()>
		for(Iterator iterator = zzaBc.keySet().iterator(); iterator.hasNext(); zza(((zzzq) (new zzzq.zze((zzaaz$zzb)iterator.next(), new TaskCompletionSource())))));
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
		zzac.zza(zzaap.zza(zzaBg));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field zzaap zzaBg>
	//    2    4:invokestatic    #76  <Method Handler zzaap.zza(zzaap)>
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
		if(Looper.myLooper() == zzaap.zza(zzaBg).getLooper())
	//*   0    0:invokestatic    #320 <Method Looper Looper.myLooper()>
	//*   1    3:aload_0         
	//*   2    4:getfield        #53  <Field zzaap zzaBg>
	//*   3    7:invokestatic    #76  <Method Handler zzaap.zza(zzaap)>
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
			zzaap.zza(zzaBg).post(new Runnable(connectionresult) {

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

				final zzaap.zza zzaBh;
				final ConnectionResult zzaBi;

			
			{
				zzaBh = zzaap.zza.this;
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
	//   12   26:invokestatic    #76  <Method Handler zzaap.zza(zzaap)>
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
		zzac.zza(zzaap.zza(zzaBg));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field zzaap zzaBg>
	//    2    4:invokestatic    #76  <Method Handler zzaap.zza(zzaap)>
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
		zzac.zza(zzaap.zza(zzaBg));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field zzaap zzaBg>
	//    2    4:invokestatic    #76  <Method Handler zzaap.zza(zzaap)>
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
		zzac.zza(zzaap.zza(zzaBg));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field zzaap zzaBg>
	//    2    4:invokestatic    #76  <Method Handler zzaap.zza(zzaap)>
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
		zzac.zza(zzaap.zza(zzaBg));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field zzaap zzaBg>
	//    2    4:invokestatic    #76  <Method Handler zzaap.zza(zzaap)>
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
	//*  14   32:invokestatic    #125 <Method android.content.Context zzaap.zzb(zzaap)>
	//*  15   35:invokevirtual   #293 <Method int GoogleApiAvailability.isGooglePlayServicesAvailable(android.content.Context)>
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
		zzac.zza(zzaap.zza(zzaBg));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field zzaap zzaBg>
	//    2    4:invokestatic    #76  <Method Handler zzaap.zza(zzaap)>
	//    3    7:invokestatic    #273 <Method void zzac.zza(Handler)>
		zzaBf = null;
	//    4   10:aload_0         
	//    5   11:aconst_null     
	//    6   12:putfield        #73  <Field ConnectionResult zzaBf>
	//    7   15:return          
	}

	public ConnectionResult zzwe()
	{
		zzac.zza(zzaap.zza(zzaBg));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field zzaap zzaBg>
	//    2    4:invokestatic    #76  <Method Handler zzaap.zza(zzaap)>
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
			zzac.zza(zzaap.zza(zzaBg));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field zzaap zzaBg>
	//    2    4:invokestatic    #76  <Method Handler zzaap.zza(zzaap)>
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

	public zzaap$zza(zzaap zzaap1, zzc zzc1)
	{
		zzaBg = zzaap1;
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
		zzazq = zzc1.buildApiClient(zzaap.zza(zzaap1).getLooper(), this);
	//   23   47:aload_0         
	//   24   48:aload_2         
	//   25   49:aload_1         
	//   26   50:invokestatic    #76  <Method Handler zzaap.zza(zzaap)>
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
	//*  61  129:invokestatic    #125 <Method android.content.Context zzaap.zzb(zzaap)>
	//*  62  132:aload_1         
	//*  63  133:invokestatic    #76  <Method Handler zzaap.zza(zzaap)>
	//*  64  136:invokevirtual   #129 <Method zzabj zzc.createSignInCoordinator(android.content.Context, Handler)>
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
			zzaBe = zzc1.createSignInCoordinator(zzaap.zzb(zzaap1), zzaap.zza(zzaap1));
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
