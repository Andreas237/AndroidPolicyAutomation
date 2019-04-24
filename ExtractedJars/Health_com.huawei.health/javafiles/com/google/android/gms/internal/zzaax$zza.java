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
//			zzaah, zzaax, zzaal, zzzx, 
//			zzaab, zzabr, zzaam, zzzz, 
//			zzbai

public class zzaax$zza
	implements com.google.android.gms.common.api.lient.ConnectionCallbacks, com.google.android.gms.common.api.lient.OnConnectionFailedListener, zzaah
{

	private void zzb(zzzx zzzx1)
	{
		zzzx1.zza(zzaCA, zzrd());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #109 <Field zzaal zzaCA>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #139 <Method boolean zzrd()>
	//    5    9:invokevirtual   #144 <Method void zzzx.zza(zzaal, boolean)>
		try
		{
			zzzx1.zza(this);
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #147 <Method void zzzx.zza(zzaax$zza)>
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

	static void zzc(zzaax$zza zzaax$zza1)
	{
		zzaax$zza1.zzwF();
	//    0    0:aload_0         
	//    1    1:invokespecial   #158 <Method void zzwF()>
	//    2    4:return          
	}

	static void zzd(zzaax$zza zzaax$zza1)
	{
		zzaax$zza1.zzwG();
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
	//   13   33:invokevirtual   #184 <Method void zzaab.zza(zzzz, ConnectionResult)>
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
		zzaax.zza(zzaCx).sendMessageDelayed(Message.obtain(zzaax.zza(zzaCx), 9, ((Object) (zzayU))), com.google.android.gms.internal.zzaax.zzc(zzaCx));
	//    8   16:aload_0         
	//    9   17:getfield        #53  <Field zzaax zzaCx>
	//   10   20:invokestatic    #76  <Method Handler zzaax.zza(zzaax)>
	//   11   23:aload_0         
	//   12   24:getfield        #53  <Field zzaax zzaCx>
	//   13   27:invokestatic    #76  <Method Handler zzaax.zza(zzaax)>
	//   14   30:bipush          9
	//   15   32:aload_0         
	//   16   33:getfield        #104 <Field zzzz zzayU>
	//   17   36:invokestatic    #231 <Method Message Message.obtain(Handler, int, Object)>
	//   18   39:aload_0         
	//   19   40:getfield        #53  <Field zzaax zzaCx>
	//   20   43:invokestatic    #234 <Method long com.google.android.gms.internal.zzaax.zzc(zzaax)>
	//   21   46:invokevirtual   #238 <Method boolean Handler.sendMessageDelayed(Message, long)>
	//   22   49:pop             
		zzaax.zza(zzaCx).sendMessageDelayed(Message.obtain(zzaax.zza(zzaCx), 11, ((Object) (zzayU))), zzaax.zzd(zzaCx));
	//   23   50:aload_0         
	//   24   51:getfield        #53  <Field zzaax zzaCx>
	//   25   54:invokestatic    #76  <Method Handler zzaax.zza(zzaax)>
	//   26   57:aload_0         
	//   27   58:getfield        #53  <Field zzaax zzaCx>
	//   28   61:invokestatic    #76  <Method Handler zzaax.zza(zzaax)>
	//   29   64:bipush          11
	//   30   66:aload_0         
	//   31   67:getfield        #104 <Field zzzz zzayU>
	//   32   70:invokestatic    #231 <Method Message Message.obtain(Handler, int, Object)>
	//   33   73:aload_0         
	//   34   74:getfield        #53  <Field zzaax zzaCx>
	//   35   77:invokestatic    #240 <Method long zzaax.zzd(zzaax)>
	//   36   80:invokevirtual   #238 <Method boolean Handler.sendMessageDelayed(Message, long)>
	//   37   83:pop             
		zzaax.zza(zzaCx, -1);
	//   38   84:aload_0         
	//   39   85:getfield        #53  <Field zzaax zzaCx>
	//   40   88:iconst_m1       
	//   41   89:invokestatic    #243 <Method int zzaax.zza(zzaax, int)>
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
			zzaax.zza(zzaCx).removeMessages(11, ((Object) (zzayU)));
	//    3    7:aload_0         
	//    4    8:getfield        #53  <Field zzaax zzaCx>
	//    5   11:invokestatic    #76  <Method Handler zzaax.zza(zzaax)>
	//    6   14:bipush          11
	//    7   16:aload_0         
	//    8   17:getfield        #104 <Field zzzz zzayU>
	//    9   20:invokevirtual   #260 <Method void Handler.removeMessages(int, Object)>
			zzaax.zza(zzaCx).removeMessages(9, ((Object) (zzayU)));
	//   10   23:aload_0         
	//   11   24:getfield        #53  <Field zzaax zzaCx>
	//   12   27:invokestatic    #76  <Method Handler zzaax.zza(zzaax)>
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
		zzaax.zza(zzaCx).removeMessages(12, ((Object) (zzayU)));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field zzaax zzaCx>
	//    2    4:invokestatic    #76  <Method Handler zzaax.zza(zzaax)>
	//    3    7:bipush          12
	//    4    9:aload_0         
	//    5   10:getfield        #104 <Field zzzz zzayU>
	//    6   13:invokevirtual   #260 <Method void Handler.removeMessages(int, Object)>
		zzaax.zza(zzaCx).sendMessageDelayed(zzaax.zza(zzaCx).obtainMessage(12, ((Object) (zzayU))), zzaax.zzh(zzaCx));
	//    7   16:aload_0         
	//    8   17:getfield        #53  <Field zzaax zzaCx>
	//    9   20:invokestatic    #76  <Method Handler zzaax.zza(zzaax)>
	//   10   23:aload_0         
	//   11   24:getfield        #53  <Field zzaax zzaCx>
	//   12   27:invokestatic    #76  <Method Handler zzaax.zza(zzaax)>
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
		zzac.zza(zzaax.zza(zzaCx));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field zzaax zzaCx>
	//    2    4:invokestatic    #76  <Method Handler zzaax.zza(zzaax)>
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
			zzaax.zza(zzaCx, zzaax.zzg(zzaCx).isGooglePlayServicesAvailable(zzaax.zzb(zzaCx)));
	//   21   57:aload_0         
	//   22   58:getfield        #53  <Field zzaax zzaCx>
	//   23   61:aload_0         
	//   24   62:getfield        #53  <Field zzaax zzaCx>
	//   25   65:invokestatic    #287 <Method GoogleApiAvailability zzaax.zzg(zzaax)>
	//   26   68:aload_0         
	//   27   69:getfield        #53  <Field zzaax zzaCx>
	//   28   72:invokestatic    #125 <Method android.content.Context zzaax.zzb(zzaax)>
	//   29   75:invokevirtual   #293 <Method int GoogleApiAvailability.isGooglePlayServicesAvailable(android.content.Context)>
	//   30   78:invokestatic    #243 <Method int zzaax.zza(zzaax, int)>
	//   31   81:pop             
			if(zzaax.zzi(zzaCx) != 0)
	//*  32   82:aload_0         
	//*  33   83:getfield        #53  <Field zzaax zzaCx>
	//*  34   86:invokestatic    #283 <Method int zzaax.zzi(zzaax)>
	//*  35   89:ifeq            112
			{
				onConnectionFailed(new ConnectionResult(zzaax.zzi(zzaCx), ((android.app.PendingIntent) (null))));
	//   36   92:aload_0         
	//   37   93:new             #194 <Class ConnectionResult>
	//   38   96:dup             
	//   39   97:aload_0         
	//   40   98:getfield        #53  <Field zzaax zzaCx>
	//   41  101:invokestatic    #283 <Method int zzaax.zzi(zzaax)>
	//   42  104:aconst_null     
	//   43  105:invokespecial   #296 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//   44  108:invokevirtual   #299 <Method void onConnectionFailed(ConnectionResult)>
				return;
	//   45  111:return          
			}
		}
		zzaax$zzb zzaax$zzb1 = new zzaax$zzb(zzaCx, zzaAJ, zzayU);
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
			zzaCE.zza(((zzabr$zza) (zzaax$zzb1)));
	//   60  144:aload_0         
	//   61  145:getfield        #131 <Field zzabr zzaCE>
	//   62  148:aload_1         
	//   63  149:invokevirtual   #309 <Method void zzabr.zza(zzabr$zza)>
		zzaAJ.zza(((com.google.android.gms.common.internal.zzf.zzf) (zzaax$zzb1)));
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
		if(Looper.myLooper() == zzaax.zza(zzaCx).getLooper())
	//*   0    0:invokestatic    #320 <Method Looper Looper.myLooper()>
	//*   1    3:aload_0         
	//*   2    4:getfield        #53  <Field zzaax zzaCx>
	//*   3    7:invokestatic    #76  <Method Handler zzaax.zza(zzaax)>
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
			zzaax.zza(zzaCx).post(new Runnable() {

				public void run()
				{
					com.google.android.gms.internal.zzaax.zza.zzc(zzaCG);
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field zzaax$zza zzaCG>
				//    2    4:invokestatic    #28  <Method void com.google.android.gms.internal.zzaax$zza.zzc(zzaax$zza)>
				//    3    7:return          
				}

				final zzaax.zza zzaCG;

			
			{
				zzaCG = zzaax.zza.this;
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
	//   11   25:invokestatic    #76  <Method Handler zzaax.zza(zzaax)>
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
		zzac.zza(zzaax.zza(zzaCx));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field zzaax zzaCx>
	//    2    4:invokestatic    #76  <Method Handler zzaax.zza(zzaax)>
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
		zzaax.zza(zzaCx, -1);
	//   12   28:aload_0         
	//   13   29:getfield        #53  <Field zzaax zzaCx>
	//   14   32:iconst_m1       
	//   15   33:invokestatic    #243 <Method int zzaax.zza(zzaax, int)>
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
				zzaax.zza(zzaCx).sendMessageDelayed(Message.obtain(zzaax.zza(zzaCx), 9, ((Object) (zzayU))), com.google.android.gms.internal.zzaax.zzc(zzaCx));
	//   86  175:aload_0         
	//   87  176:getfield        #53  <Field zzaax zzaCx>
	//   88  179:invokestatic    #76  <Method Handler zzaax.zza(zzaax)>
	//   89  182:aload_0         
	//   90  183:getfield        #53  <Field zzaax zzaCx>
	//   91  186:invokestatic    #76  <Method Handler zzaax.zza(zzaax)>
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
		if(Looper.myLooper() == zzaax.zza(zzaCx).getLooper())
	//*   0    0:invokestatic    #320 <Method Looper Looper.myLooper()>
	//*   1    3:aload_0         
	//*   2    4:getfield        #53  <Field zzaax zzaCx>
	//*   3    7:invokestatic    #76  <Method Handler zzaax.zza(zzaax)>
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
			zzaax.zza(zzaCx).post(new Runnable() {

				public void run()
				{
					zzaax.zza.zzd(zzaCG);
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field zzaax$zza zzaCG>
				//    2    4:invokestatic    #28  <Method void zzaax$zza.zzd(zzaax$zza)>
				//    3    7:return          
				}

				final zzaax.zza zzaCG;

			
			{
				zzaCG = zzaax.zza.this;
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
	//   11   25:invokestatic    #76  <Method Handler zzaax.zza(zzaax)>
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
		zzac.zza(zzaax.zza(zzaCx));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field zzaax zzaCx>
	//    2    4:invokestatic    #76  <Method Handler zzaax.zza(zzaax)>
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
		zzac.zza(zzaax.zza(zzaCx));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field zzaax zzaCx>
	//    2    4:invokestatic    #76  <Method Handler zzaax.zza(zzaax)>
	//    3    7:invokestatic    #273 <Method void zzac.zza(Handler)>
		zzD(zzaax.zzaCn);
	//    4   10:aload_0         
	//    5   11:getstatic       #409 <Field Status zzaax.zzaCn>
	//    6   14:invokevirtual   #342 <Method void zzD(Status)>
		zzaCA.zzvZ();
	//    7   17:aload_0         
	//    8   18:getfield        #109 <Field zzaal zzaCA>
	//    9   21:invokevirtual   #412 <Method void zzaal.zzvZ()>
		for(Iterator iterator = zzaCC.keySet().iterator(); iterator.hasNext(); zza(((zzzx) (new zzzx.zze((zzabh$zzb)iterator.next(), new TaskCompletionSource())))));
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
		zzac.zza(zzaax.zza(zzaCx));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field zzaax zzaCx>
	//    2    4:invokestatic    #76  <Method Handler zzaax.zza(zzaax)>
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
		if(Looper.myLooper() == zzaax.zza(zzaCx).getLooper())
	//*   0    0:invokestatic    #320 <Method Looper Looper.myLooper()>
	//*   1    3:aload_0         
	//*   2    4:getfield        #53  <Field zzaax zzaCx>
	//*   3    7:invokestatic    #76  <Method Handler zzaax.zza(zzaax)>
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
			zzaax.zza(zzaCx).post(new Runnable(connectionresult) {

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

				final zzaax.zza zzaCG;
				final ConnectionResult zzaCH;

			
			{
				zzaCG = zzaax.zza.this;
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
	//   12   26:invokestatic    #76  <Method Handler zzaax.zza(zzaax)>
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
		zzac.zza(zzaax.zza(zzaCx));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field zzaax zzaCx>
	//    2    4:invokestatic    #76  <Method Handler zzaax.zza(zzaax)>
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
		zzac.zza(zzaax.zza(zzaCx));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field zzaax zzaCx>
	//    2    4:invokestatic    #76  <Method Handler zzaax.zza(zzaax)>
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
		zzac.zza(zzaax.zza(zzaCx));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field zzaax zzaCx>
	//    2    4:invokestatic    #76  <Method Handler zzaax.zza(zzaax)>
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
		zzac.zza(zzaax.zza(zzaCx));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field zzaax zzaCx>
	//    2    4:invokestatic    #76  <Method Handler zzaax.zza(zzaax)>
	//    3    7:invokestatic    #273 <Method void zzac.zza(Handler)>
		zzaCF = null;
	//    4   10:aload_0         
	//    5   11:aconst_null     
	//    6   12:putfield        #73  <Field ConnectionResult zzaCF>
	//    7   15:return          
	}

	public ConnectionResult zzwK()
	{
		zzac.zza(zzaax.zza(zzaCx));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field zzaax zzaCx>
	//    2    4:invokestatic    #76  <Method Handler zzaax.zza(zzaax)>
	//    3    7:invokestatic    #273 <Method void zzac.zza(Handler)>
		return zzaCF;
	//    4   10:aload_0         
	//    5   11:getfield        #73  <Field ConnectionResult zzaCF>
	//    6   14:areturn         
	}

	public void zzwN()
	{
		zzac.zza(zzaax.zza(zzaCx));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field zzaax zzaCx>
	//    2    4:invokestatic    #76  <Method Handler zzaax.zza(zzaax)>
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
		zzac.zza(zzaax.zza(zzaCx));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field zzaax zzaCx>
	//    2    4:invokestatic    #76  <Method Handler zzaax.zza(zzaax)>
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
	//*  14   32:invokestatic    #125 <Method android.content.Context zzaax.zzb(zzaax)>
	//*  15   35:invokevirtual   #293 <Method int GoogleApiAvailability.isGooglePlayServicesAvailable(android.content.Context)>
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

	public zzaax$zza(zzaax zzaax1, zzc zzc1)
	{
		zzaCx = zzaax1;
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
		zzaAJ = zzc1.buildApiClient(zzaax.zza(zzaax1).getLooper(), this);
	//   23   47:aload_0         
	//   24   48:aload_2         
	//   25   49:aload_1         
	//   26   50:invokestatic    #76  <Method Handler zzaax.zza(zzaax)>
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
			zzaCE = zzc1.createSignInCoordinator(zzaax.zzb(zzaax1), zzaax.zza(zzaax1));
	//   63  137:aload_0         
	//   64  138:aload_2         
	//   65  139:aload_1         
	//   66  140:invokestatic    #125 <Method android.content.Context zzaax.zzb(zzaax)>
	//   67  143:aload_1         
	//   68  144:invokestatic    #76  <Method Handler zzaax.zza(zzaax)>
	//   69  147:invokevirtual   #129 <Method zzabr zzc.createSignInCoordinator(android.content.Context, Handler)>
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
