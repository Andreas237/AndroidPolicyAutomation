// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.*;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.zzn;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.internal.*;
import java.io.*;
import java.lang.ref.WeakReference;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.internal:
//			zzabi, zzaby, zzacf, zzacg, 
//			zzaaa, zzaak, zzaai, zzaav, 
//			zzabc, zzabt, zzabd, zzaaz, 
//			zzabx, zzabq, zzabh

public final class zzaat extends GoogleApiClient
	implements zzabc.zza
{
	final class zza extends Handler
	{

		public void handleMessage(Message message)
		{
			switch(message.what)
		//*   0    0:aload_1         
		//*   1    1:getfield        #25  <Field int Message.what>
			{
		//*   2    4:lookupswitch    2: default 32
		//		               1: 35
		//		               2: 43
		//*   3   32:goto            51
			case 1: // '\001'
				zzaat.zzb(zzaBY);
		//    4   35:aload_0         
		//    5   36:getfield        #13  <Field zzaat zzaBY>
		//    6   39:invokestatic    #29  <Method void zzaat.zzb(zzaat)>
				return;
		//    7   42:return          

			case 2: // '\002'
				zzaat.zza(zzaBY);
		//    8   43:aload_0         
		//    9   44:getfield        #13  <Field zzaat zzaBY>
		//   10   47:invokestatic    #31  <Method void zzaat.zza(zzaat)>
				return;
		//   11   50:return          
			}
			int i = message.what;
		//   12   51:aload_1         
		//   13   52:getfield        #25  <Field int Message.what>
		//   14   55:istore_2        
			Log.w("GoogleApiClientImpl", (new StringBuilder(31)).append("Unknown message id: ").append(i).toString());
		//   15   56:ldc1            #33  <String "GoogleApiClientImpl">
		//   16   58:new             #35  <Class StringBuilder>
		//   17   61:dup             
		//   18   62:bipush          31
		//   19   64:invokespecial   #38  <Method void StringBuilder(int)>
		//   20   67:ldc1            #40  <String "Unknown message id: ">
		//   21   69:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
		//   22   72:iload_2         
		//   23   73:invokevirtual   #47  <Method StringBuilder StringBuilder.append(int)>
		//   24   76:invokevirtual   #51  <Method String StringBuilder.toString()>
		//   25   79:invokestatic    #57  <Method int Log.w(String, String)>
		//   26   82:pop             
		//   27   83:return          
		}

		final zzaat zzaBY;

		zza(Looper looper)
		{
			zzaBY = zzaat.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field zzaat zzaBY>
			super(looper);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #16  <Method void Handler(Looper)>
		//    6   10:return          
		}
	}

	static class zzb extends zzaaz.zza
	{

		public void zzvE()
		{
			zzaat zzaat1 = (zzaat)zzaCc.get();
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field WeakReference zzaCc>
		//    2    4:invokevirtual   #28  <Method Object WeakReference.get()>
		//    3    7:checkcast       #6   <Class zzaat>
		//    4   10:astore_1        
			if(zzaat1 == null)
		//*   5   11:aload_1         
		//*   6   12:ifnonnull       16
			{
				return;
		//    7   15:return          
			} else
			{
				zzaat.zza(zzaat1);
		//    8   16:aload_1         
		//    9   17:invokestatic    #31  <Method void zzaat.zza(zzaat)>
				return;
		//   10   20:return          
			}
		}

		private WeakReference zzaCc;

		zzb(zzaat zzaat1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void zzaaz$zza()>
			zzaCc = new WeakReference(((Object) (zzaat1)));
		//    2    4:aload_0         
		//    3    5:new             #17  <Class WeakReference>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:invokespecial   #20  <Method void WeakReference(Object)>
		//    7   13:putfield        #22  <Field WeakReference zzaCc>
		//    8   16:return          
		}
	}


	public zzaat(Context context, Lock lock, Looper looper, zzg zzg, GoogleApiAvailability googleapiavailability, com.google.android.gms.common.api.Api.zza zza1, Map map, 
			List list, List list1, Map map1, int i, int j, ArrayList arraylist, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #78  <Method void GoogleApiClient()>
		zzaBK = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #80  <Field zzabc zzaBK>
	//    5    9:aload_0         
	//    6   10:new             #82  <Class LinkedList>
	//    7   13:dup             
	//    8   14:invokespecial   #83  <Method void LinkedList()>
	//    9   17:putfield        #85  <Field Queue zzaAU>
		zzaBM = 0x1d4c0L;
	//   10   20:aload_0         
	//   11   21:ldc2w           #86  <Long 0x1d4c0L>
	//   12   24:putfield        #89  <Field long zzaBM>
		zzaBN = 5000L;
	//   13   27:aload_0         
	//   14   28:ldc2w           #90  <Long 5000L>
	//   15   31:putfield        #93  <Field long zzaBN>
		zzaBR = ((Set) (new HashSet()));
	//   16   34:aload_0         
	//   17   35:new             #95  <Class HashSet>
	//   18   38:dup             
	//   19   39:invokespecial   #96  <Method void HashSet()>
	//   20   42:putfield        #98  <Field Set zzaBR>
	//   21   45:aload_0         
	//   22   46:new             #100 <Class zzabi>
	//   23   49:dup             
	//   24   50:invokespecial   #101 <Method void zzabi()>
	//   25   53:putfield        #103 <Field zzabi zzaBS>
		zzaBU = null;
	//   26   56:aload_0         
	//   27   57:aconst_null     
	//   28   58:putfield        #105 <Field Integer zzaBU>
		zzaBV = null;
	//   29   61:aload_0         
	//   30   62:aconst_null     
	//   31   63:putfield        #107 <Field Set zzaBV>
	//   32   66:aload_0         
	//   33   67:new             #8   <Class zzaat$1>
	//   34   70:dup             
	//   35   71:aload_0         
	//   36   72:invokespecial   #110 <Method void zzaat$1(zzaat)>
	//   37   75:putfield        #112 <Field com.google.android.gms.common.internal.zzm$zza zzaBX>
		mContext = context;
	//   38   78:aload_0         
	//   39   79:aload_1         
	//   40   80:putfield        #114 <Field Context mContext>
		zzaAG = lock;
	//   41   83:aload_0         
	//   42   84:aload_2         
	//   43   85:putfield        #116 <Field Lock zzaAG>
		zzazr = flag;
	//   44   88:aload_0         
	//   45   89:iload           14
	//   46   91:putfield        #118 <Field boolean zzazr>
		zzaBJ = new zzm(looper, zzaBX);
	//   47   94:aload_0         
	//   48   95:new             #120 <Class zzm>
	//   49   98:dup             
	//   50   99:aload_3         
	//   51  100:aload_0         
	//   52  101:getfield        #112 <Field com.google.android.gms.common.internal.zzm$zza zzaBX>
	//   53  104:invokespecial   #123 <Method void zzm(Looper, com.google.android.gms.common.internal.zzm$zza)>
	//   54  107:putfield        #125 <Field zzm zzaBJ>
		zzrs = looper;
	//   55  110:aload_0         
	//   56  111:aload_3         
	//   57  112:putfield        #127 <Field Looper zzrs>
		zzaBO = new zza(looper);
	//   58  115:aload_0         
	//   59  116:new             #16  <Class zzaat$zza>
	//   60  119:dup             
	//   61  120:aload_0         
	//   62  121:aload_3         
	//   63  122:invokespecial   #130 <Method void zzaat$zza(zzaat, Looper)>
	//   64  125:putfield        #132 <Field zzaat$zza zzaBO>
		zzazn = googleapiavailability;
	//   65  128:aload_0         
	//   66  129:aload           5
	//   67  131:putfield        #134 <Field GoogleApiAvailability zzazn>
		zzazl = i;
	//   68  134:aload_0         
	//   69  135:iload           11
	//   70  137:putfield        #136 <Field int zzazl>
		if(zzazl >= 0)
	//*  71  140:aload_0         
	//*  72  141:getfield        #136 <Field int zzazl>
	//*  73  144:iflt            156
			zzaBU = Integer.valueOf(j);
	//   74  147:aload_0         
	//   75  148:iload           12
	//   76  150:invokestatic    #142 <Method Integer Integer.valueOf(int)>
	//   77  153:putfield        #105 <Field Integer zzaBU>
		zzaAO = map;
	//   78  156:aload_0         
	//   79  157:aload           7
	//   80  159:putfield        #144 <Field Map zzaAO>
		zzaBQ = map1;
	//   81  162:aload_0         
	//   82  163:aload           10
	//   83  165:putfield        #146 <Field Map zzaBQ>
		zzaBT = arraylist;
	//   84  168:aload_0         
	//   85  169:aload           13
	//   86  171:putfield        #148 <Field ArrayList zzaBT>
		zzaBW = new zzaby(zzaBQ);
	//   87  174:aload_0         
	//   88  175:new             #150 <Class zzaby>
	//   89  178:dup             
	//   90  179:aload_0         
	//   91  180:getfield        #146 <Field Map zzaBQ>
	//   92  183:invokespecial   #153 <Method void zzaby(Map)>
	//   93  186:putfield        #155 <Field zzaby zzaBW>
		for(context = ((Context) (list.iterator())); ((Iterator) (context)).hasNext(); zzaBJ.registerConnectionCallbacks(((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) (lock))))
	//*  94  189:aload           8
	//*  95  191:invokeinterface #161 <Method Iterator List.iterator()>
	//*  96  196:astore_1        
	//*  97  197:aload_1         
	//*  98  198:invokeinterface #167 <Method boolean Iterator.hasNext()>
	//*  99  203:ifeq            227
			lock = ((Lock) ((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)((Iterator) (context)).next()));
	//  100  206:aload_1         
	//  101  207:invokeinterface #171 <Method Object Iterator.next()>
	//  102  212:checkcast       #173 <Class com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks>
	//  103  215:astore_2        

	//  104  216:aload_0         
	//  105  217:getfield        #125 <Field zzm zzaBJ>
	//  106  220:aload_2         
	//  107  221:invokevirtual   #177 <Method void zzm.registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks)>
	//* 108  224:goto            197
		for(context = ((Context) (list1.iterator())); ((Iterator) (context)).hasNext(); zzaBJ.registerConnectionFailedListener(((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) (lock))))
	//* 109  227:aload           9
	//* 110  229:invokeinterface #161 <Method Iterator List.iterator()>
	//* 111  234:astore_1        
	//* 112  235:aload_1         
	//* 113  236:invokeinterface #167 <Method boolean Iterator.hasNext()>
	//* 114  241:ifeq            265
			lock = ((Lock) ((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener)((Iterator) (context)).next()));
	//  115  244:aload_1         
	//  116  245:invokeinterface #171 <Method Object Iterator.next()>
	//  117  250:checkcast       #179 <Class com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener>
	//  118  253:astore_2        

	//  119  254:aload_0         
	//  120  255:getfield        #125 <Field zzm zzaBJ>
	//  121  258:aload_2         
	//  122  259:invokevirtual   #183 <Method void zzm.registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//* 123  262:goto            235
		zzaAL = zzg;
	//  124  265:aload_0         
	//  125  266:aload           4
	//  126  268:putfield        #185 <Field zzg zzaAL>
		zzazo = zza1;
	//  127  271:aload_0         
	//  128  272:aload           6
	//  129  274:putfield        #187 <Field com.google.android.gms.common.api.Api$zza zzazo>
	//  130  277:return          
	}

	private void resume()
	{
		zzaAG.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field Lock zzaAG>
	//    2    4:invokeinterface #196 <Method void Lock.lock()>
		if(isResuming())
	//*   3    9:aload_0         
	//*   4   10:invokevirtual   #199 <Method boolean isResuming()>
	//*   5   13:ifeq            20
			zzwm();
	//    6   16:aload_0         
	//    7   17:invokespecial   #202 <Method void zzwm()>
		zzaAG.unlock();
	//    8   20:aload_0         
	//    9   21:getfield        #116 <Field Lock zzaAG>
	//   10   24:invokeinterface #205 <Method void Lock.unlock()>
		return;
	//   11   29:return          
		Exception exception;
		exception;
	//   12   30:astore_1        
		zzaAG.unlock();
	//   13   31:aload_0         
	//   14   32:getfield        #116 <Field Lock zzaAG>
	//   15   35:invokeinterface #205 <Method void Lock.unlock()>
		throw exception;
	//   16   40:aload_1         
	//   17   41:athrow          
	}

	public static int zza(Iterable iterable, boolean flag)
	{
		boolean flag2 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		boolean flag1 = false;
	//    2    2:iconst_0        
	//    3    3:istore_2        
		iterable = ((Iterable) (iterable.iterator()));
	//    4    4:aload_0         
	//    5    5:invokeinterface #209 <Method Iterator Iterable.iterator()>
	//    6   10:astore_0        
		do
		{
			if(!((Iterator) (iterable)).hasNext())
				break;
	//    7   11:aload_0         
	//    8   12:invokeinterface #167 <Method boolean Iterator.hasNext()>
	//    9   17:ifeq            58
			com.google.android.gms.common.api.Api.zze zze = (com.google.android.gms.common.api.Api.zze)((Iterator) (iterable)).next();
	//   10   20:aload_0         
	//   11   21:invokeinterface #171 <Method Object Iterator.next()>
	//   12   26:checkcast       #211 <Class com.google.android.gms.common.api.Api$zze>
	//   13   29:astore          4
			if(zze.zzrd())
	//*  14   31:aload           4
	//*  15   33:invokeinterface #214 <Method boolean com.google.android.gms.common.api.Api$zze.zzrd()>
	//*  16   38:ifeq            43
				flag2 = true;
	//   17   41:iconst_1        
	//   18   42:istore_3        
			if(zze.zzrr())
	//*  19   43:aload           4
	//*  20   45:invokeinterface #217 <Method boolean com.google.android.gms.common.api.Api$zze.zzrr()>
	//*  21   50:ifeq            55
				flag1 = true;
	//   22   53:iconst_1        
	//   23   54:istore_2        
		} while(true);
	//   24   55:goto            11
		if(flag2)
	//*  25   58:iload_3         
	//*  26   59:ifeq            74
			return !flag1 || !flag ? 1 : 2;
	//   27   62:iload_2         
	//   28   63:ifeq            72
	//   29   66:iload_1         
	//   30   67:ifeq            72
	//   31   70:iconst_2        
	//   32   71:ireturn         
	//   33   72:iconst_1        
	//   34   73:ireturn         
		else
			return 3;
	//   35   74:iconst_3        
	//   36   75:ireturn         
	}

	private void zza(GoogleApiClient googleapiclient, zzabt zzabt1, boolean flag)
	{
		zzacf.zzaGM.zzg(googleapiclient).setResultCallback(new ResultCallback(zzabt1, flag, googleapiclient) {

			public void onResult(Result result)
			{
				zzp((Status)result);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #39  <Class Status>
			//    3    5:invokevirtual   #43  <Method void zzp(Status)>
			//    4    8:return          
			}

			public void zzp(Status status)
			{
				zzn.zzas(zzaat.zzc(zzaBY)).zzrD();
			//    0    0:aload_0         
			//    1    1:getfield        #24  <Field zzaat zzaBY>
			//    2    4:invokestatic    #48  <Method Context zzaat.zzc(zzaat)>
			//    3    7:invokestatic    #54  <Method zzn zzn.zzas(Context)>
			//    4   10:invokevirtual   #57  <Method void zzn.zzrD()>
				if(status.isSuccess() && zzaBY.isConnected())
			//*   5   13:aload_1         
			//*   6   14:invokevirtual   #61  <Method boolean Status.isSuccess()>
			//*   7   17:ifeq            37
			//*   8   20:aload_0         
			//*   9   21:getfield        #24  <Field zzaat zzaBY>
			//*  10   24:invokevirtual   #64  <Method boolean zzaat.isConnected()>
			//*  11   27:ifeq            37
					zzaBY.reconnect();
			//   12   30:aload_0         
			//   13   31:getfield        #24  <Field zzaat zzaBY>
			//   14   34:invokevirtual   #67  <Method void zzaat.reconnect()>
				zzaCa.zzb(((Result) (status)));
			//   15   37:aload_0         
			//   16   38:getfield        #26  <Field zzabt zzaCa>
			//   17   41:aload_1         
			//   18   42:invokevirtual   #72  <Method void zzabt.zzb(Result)>
				if(zzaCb)
			//*  19   45:aload_0         
			//*  20   46:getfield        #28  <Field boolean zzaCb>
			//*  21   49:ifeq            59
					zzapg.disconnect();
			//   22   52:aload_0         
			//   23   53:getfield        #30  <Field GoogleApiClient zzapg>
			//   24   56:invokevirtual   #77  <Method void GoogleApiClient.disconnect()>
			//   25   59:return          
			}

			final zzaat zzaBY;
			final zzabt zzaCa;
			final boolean zzaCb;
			final GoogleApiClient zzapg;

			
			{
				zzaBY = zzaat.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field zzaat zzaBY>
				zzaCa = zzabt1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field zzabt zzaCa>
				zzaCb = flag;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #28  <Field boolean zzaCb>
				zzapg = googleapiclient;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #30  <Field GoogleApiClient zzapg>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #33  <Method void Object()>
			//   14   25:return          
			}
		}
);
	//    0    0:getstatic       #225 <Field zzacg zzacf.zzaGM>
	//    1    3:aload_1         
	//    2    4:invokeinterface #231 <Method PendingResult com.google.android.gms.internal.zzacg.zzg(GoogleApiClient)>
	//    3    9:new             #14  <Class zzaat$4>
	//    4   12:dup             
	//    5   13:aload_0         
	//    6   14:aload_2         
	//    7   15:iload_3         
	//    8   16:aload_1         
	//    9   17:invokespecial   #234 <Method void zzaat$4(zzaat, zzabt, boolean, GoogleApiClient)>
	//   10   20:invokevirtual   #240 <Method void PendingResult.setResultCallback(ResultCallback)>
	//   11   23:return          
	}

	static void zza(zzaat zzaat1)
	{
		zzaat1.resume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #242 <Method void resume()>
	//    2    4:return          
	}

	static void zza(zzaat zzaat1, GoogleApiClient googleapiclient, zzabt zzabt1, boolean flag)
	{
		zzaat1.zza(googleapiclient, zzabt1, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #245 <Method void zza(GoogleApiClient, zzabt, boolean)>
	//    5    7:return          
	}

	static void zzb(zzaat zzaat1)
	{
		zzaat1.zzwn();
	//    0    0:aload_0         
	//    1    1:invokespecial   #248 <Method void zzwn()>
	//    2    4:return          
	}

	private void zzb(zzabd zzabd1)
	{
		if(zzazl >= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #136 <Field int zzazl>
	//*   2    4:iflt            19
		{
			zzaaa.zza(zzabd1).zzcA(zzazl);
	//    3    7:aload_1         
	//    4    8:invokestatic    #255 <Method zzaaa zzaaa.zza(zzabd)>
	//    5   11:aload_0         
	//    6   12:getfield        #136 <Field int zzazl>
	//    7   15:invokevirtual   #259 <Method void zzaaa.zzcA(int)>
			return;
	//    8   18:return          
		} else
		{
			throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
	//    9   19:new             #261 <Class IllegalStateException>
	//   10   22:dup             
	//   11   23:ldc2            #263 <String "Called stopAutoManage but automatic lifecycle management is not enabled.">
	//   12   26:invokespecial   #266 <Method void IllegalStateException(String)>
	//   13   29:athrow          
		}
	}

	static Context zzc(zzaat zzaat1)
	{
		return zzaat1.mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field Context mContext>
	//    2    4:areturn         
	}

	private void zzcD(int i)
	{
		if(zzaBU == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #105 <Field Integer zzaBU>
	//*   2    4:ifnonnull       18
			zzaBU = Integer.valueOf(i);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:invokestatic    #142 <Method Integer Integer.valueOf(int)>
	//    6   12:putfield        #105 <Field Integer zzaBU>
		else
	//*   7   15:goto            112
		if(zzaBU.intValue() != i)
	//*   8   18:aload_0         
	//*   9   19:getfield        #105 <Field Integer zzaBU>
	//*  10   22:invokevirtual   #274 <Method int Integer.intValue()>
	//*  11   25:iload_1         
	//*  12   26:icmpeq          112
		{
			String s = String.valueOf(((Object) (zzcE(i))));
	//   13   29:iload_1         
	//   14   30:invokestatic    #278 <Method String zzcE(int)>
	//   15   33:invokestatic    #283 <Method String String.valueOf(Object)>
	//   16   36:astore_3        
			String s1 = String.valueOf(((Object) (zzcE(zzaBU.intValue()))));
	//   17   37:aload_0         
	//   18   38:getfield        #105 <Field Integer zzaBU>
	//   19   41:invokevirtual   #274 <Method int Integer.intValue()>
	//   20   44:invokestatic    #278 <Method String zzcE(int)>
	//   21   47:invokestatic    #283 <Method String String.valueOf(Object)>
	//   22   50:astore          4
			i = String.valueOf(((Object) (s))).length();
	//   23   52:aload_3         
	//   24   53:invokestatic    #283 <Method String String.valueOf(Object)>
	//   25   56:invokevirtual   #286 <Method int String.length()>
	//   26   59:istore_1        
			throw new IllegalStateException((new StringBuilder(String.valueOf(((Object) (s1))).length() + (i + 51))).append("Cannot use sign-in mode: ").append(s).append(". Mode was already set to ").append(s1).toString());
	//   27   60:new             #261 <Class IllegalStateException>
	//   28   63:dup             
	//   29   64:new             #288 <Class StringBuilder>
	//   30   67:dup             
	//   31   68:aload           4
	//   32   70:invokestatic    #283 <Method String String.valueOf(Object)>
	//   33   73:invokevirtual   #286 <Method int String.length()>
	//   34   76:iload_1         
	//   35   77:bipush          51
	//   36   79:iadd            
	//   37   80:iadd            
	//   38   81:invokespecial   #290 <Method void StringBuilder(int)>
	//   39   84:ldc2            #292 <String "Cannot use sign-in mode: ">
	//   40   87:invokevirtual   #296 <Method StringBuilder StringBuilder.append(String)>
	//   41   90:aload_3         
	//   42   91:invokevirtual   #296 <Method StringBuilder StringBuilder.append(String)>
	//   43   94:ldc2            #298 <String ". Mode was already set to ">
	//   44   97:invokevirtual   #296 <Method StringBuilder StringBuilder.append(String)>
	//   45  100:aload           4
	//   46  102:invokevirtual   #296 <Method StringBuilder StringBuilder.append(String)>
	//   47  105:invokevirtual   #302 <Method String StringBuilder.toString()>
	//   48  108:invokespecial   #266 <Method void IllegalStateException(String)>
	//   49  111:athrow          
		}
		if(zzaBK != null)
	//*  50  112:aload_0         
	//*  51  113:getfield        #80  <Field zzabc zzaBK>
	//*  52  116:ifnull          120
			return;
	//   53  119:return          
		boolean flag = false;
	//   54  120:iconst_0        
	//   55  121:istore_2        
		i = 0;
	//   56  122:iconst_0        
	//   57  123:istore_1        
		Iterator iterator = zzaBQ.values().iterator();
	//   58  124:aload_0         
	//   59  125:getfield        #146 <Field Map zzaBQ>
	//   60  128:invokeinterface #308 <Method Collection Map.values()>
	//   61  133:invokeinterface #311 <Method Iterator Collection.iterator()>
	//   62  138:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   63  139:aload_3         
	//   64  140:invokeinterface #167 <Method boolean Iterator.hasNext()>
	//   65  145:ifeq            186
			com.google.android.gms.common.api.Api.zze zze = (com.google.android.gms.common.api.Api.zze)iterator.next();
	//   66  148:aload_3         
	//   67  149:invokeinterface #171 <Method Object Iterator.next()>
	//   68  154:checkcast       #211 <Class com.google.android.gms.common.api.Api$zze>
	//   69  157:astore          4
			if(zze.zzrd())
	//*  70  159:aload           4
	//*  71  161:invokeinterface #214 <Method boolean com.google.android.gms.common.api.Api$zze.zzrd()>
	//*  72  166:ifeq            171
				flag = true;
	//   73  169:iconst_1        
	//   74  170:istore_2        
			if(zze.zzrr())
	//*  75  171:aload           4
	//*  76  173:invokeinterface #217 <Method boolean com.google.android.gms.common.api.Api$zze.zzrr()>
	//*  77  178:ifeq            183
				i = 1;
	//   78  181:iconst_1        
	//   79  182:istore_1        
		} while(true);
	//   80  183:goto            139
		switch(zzaBU.intValue())
	//*  81  186:aload_0         
	//*  82  187:getfield        #105 <Field Integer zzaBU>
	//*  83  190:invokevirtual   #274 <Method int Integer.intValue()>
		{
	//*  84  193:tableswitch     1 3: default 220
	//	               1 226
	//	               2 256
	//	               3 223
	//*  85  220:goto            362
	//*  86  223:goto            362
		case 1: // '\001'
			if(!flag)
	//*  87  226:iload_2         
	//*  88  227:ifne            241
				throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
	//   89  230:new             #261 <Class IllegalStateException>
	//   90  233:dup             
	//   91  234:ldc2            #313 <String "SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.">
	//   92  237:invokespecial   #266 <Method void IllegalStateException(String)>
	//   93  240:athrow          
			if(i != 0)
	//*  94  241:iload_1         
	//*  95  242:ifeq            362
				throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
	//   96  245:new             #261 <Class IllegalStateException>
	//   97  248:dup             
	//   98  249:ldc2            #315 <String "Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.">
	//   99  252:invokespecial   #266 <Method void IllegalStateException(String)>
	//  100  255:athrow          
			break;

		case 2: // '\002'
			if(flag)
	//* 101  256:iload_2         
	//* 102  257:ifeq            362
				if(zzazr)
	//* 103  260:aload_0         
	//* 104  261:getfield        #118 <Field boolean zzazr>
	//* 105  264:ifeq            317
				{
					zzaBK = ((zzabc) (new zzaak(mContext, zzaAG, zzrs, ((com.google.android.gms.common.zze) (zzazn)), zzaBQ, zzaAL, zzaAO, zzazo, zzaBT, this, true)));
	//  106  267:aload_0         
	//  107  268:new             #317 <Class zzaak>
	//  108  271:dup             
	//  109  272:aload_0         
	//  110  273:getfield        #114 <Field Context mContext>
	//  111  276:aload_0         
	//  112  277:getfield        #116 <Field Lock zzaAG>
	//  113  280:aload_0         
	//  114  281:getfield        #127 <Field Looper zzrs>
	//  115  284:aload_0         
	//  116  285:getfield        #134 <Field GoogleApiAvailability zzazn>
	//  117  288:aload_0         
	//  118  289:getfield        #146 <Field Map zzaBQ>
	//  119  292:aload_0         
	//  120  293:getfield        #185 <Field zzg zzaAL>
	//  121  296:aload_0         
	//  122  297:getfield        #144 <Field Map zzaAO>
	//  123  300:aload_0         
	//  124  301:getfield        #187 <Field com.google.android.gms.common.api.Api$zza zzazo>
	//  125  304:aload_0         
	//  126  305:getfield        #148 <Field ArrayList zzaBT>
	//  127  308:aload_0         
	//  128  309:iconst_1        
	//  129  310:invokespecial   #320 <Method void zzaak(Context, Lock, Looper, com.google.android.gms.common.zze, Map, zzg, Map, com.google.android.gms.common.api.Api$zza, ArrayList, zzaat, boolean)>
	//  130  313:putfield        #80  <Field zzabc zzaBK>
					return;
	//  131  316:return          
				} else
				{
					zzaBK = ((zzabc) (zzaai.zza(mContext, this, zzaAG, zzrs, ((com.google.android.gms.common.zze) (zzazn)), zzaBQ, zzaAL, zzaAO, zzazo, zzaBT)));
	//  132  317:aload_0         
	//  133  318:aload_0         
	//  134  319:getfield        #114 <Field Context mContext>
	//  135  322:aload_0         
	//  136  323:aload_0         
	//  137  324:getfield        #116 <Field Lock zzaAG>
	//  138  327:aload_0         
	//  139  328:getfield        #127 <Field Looper zzrs>
	//  140  331:aload_0         
	//  141  332:getfield        #134 <Field GoogleApiAvailability zzazn>
	//  142  335:aload_0         
	//  143  336:getfield        #146 <Field Map zzaBQ>
	//  144  339:aload_0         
	//  145  340:getfield        #185 <Field zzg zzaAL>
	//  146  343:aload_0         
	//  147  344:getfield        #144 <Field Map zzaAO>
	//  148  347:aload_0         
	//  149  348:getfield        #187 <Field com.google.android.gms.common.api.Api$zza zzazo>
	//  150  351:aload_0         
	//  151  352:getfield        #148 <Field ArrayList zzaBT>
	//  152  355:invokestatic    #325 <Method zzaai zzaai.zza(Context, zzaat, Lock, Looper, com.google.android.gms.common.zze, Map, zzg, Map, com.google.android.gms.common.api.Api$zza, ArrayList)>
	//  153  358:putfield        #80  <Field zzabc zzaBK>
					return;
	//  154  361:return          
				}
			break;
		}
		if(zzazr && i == 0)
	//* 155  362:aload_0         
	//* 156  363:getfield        #118 <Field boolean zzazr>
	//* 157  366:ifeq            423
	//* 158  369:iload_1         
	//* 159  370:ifne            423
		{
			zzaBK = ((zzabc) (new zzaak(mContext, zzaAG, zzrs, ((com.google.android.gms.common.zze) (zzazn)), zzaBQ, zzaAL, zzaAO, zzazo, zzaBT, this, false)));
	//  160  373:aload_0         
	//  161  374:new             #317 <Class zzaak>
	//  162  377:dup             
	//  163  378:aload_0         
	//  164  379:getfield        #114 <Field Context mContext>
	//  165  382:aload_0         
	//  166  383:getfield        #116 <Field Lock zzaAG>
	//  167  386:aload_0         
	//  168  387:getfield        #127 <Field Looper zzrs>
	//  169  390:aload_0         
	//  170  391:getfield        #134 <Field GoogleApiAvailability zzazn>
	//  171  394:aload_0         
	//  172  395:getfield        #146 <Field Map zzaBQ>
	//  173  398:aload_0         
	//  174  399:getfield        #185 <Field zzg zzaAL>
	//  175  402:aload_0         
	//  176  403:getfield        #144 <Field Map zzaAO>
	//  177  406:aload_0         
	//  178  407:getfield        #187 <Field com.google.android.gms.common.api.Api$zza zzazo>
	//  179  410:aload_0         
	//  180  411:getfield        #148 <Field ArrayList zzaBT>
	//  181  414:aload_0         
	//  182  415:iconst_0        
	//  183  416:invokespecial   #320 <Method void zzaak(Context, Lock, Looper, com.google.android.gms.common.zze, Map, zzg, Map, com.google.android.gms.common.api.Api$zza, ArrayList, zzaat, boolean)>
	//  184  419:putfield        #80  <Field zzabc zzaBK>
			return;
	//  185  422:return          
		} else
		{
			zzaBK = ((zzabc) (new zzaav(mContext, this, zzaAG, zzrs, ((com.google.android.gms.common.zze) (zzazn)), zzaBQ, zzaAL, zzaAO, zzazo, zzaBT, ((zzabc.zza) (this)))));
	//  186  423:aload_0         
	//  187  424:new             #327 <Class zzaav>
	//  188  427:dup             
	//  189  428:aload_0         
	//  190  429:getfield        #114 <Field Context mContext>
	//  191  432:aload_0         
	//  192  433:aload_0         
	//  193  434:getfield        #116 <Field Lock zzaAG>
	//  194  437:aload_0         
	//  195  438:getfield        #127 <Field Looper zzrs>
	//  196  441:aload_0         
	//  197  442:getfield        #134 <Field GoogleApiAvailability zzazn>
	//  198  445:aload_0         
	//  199  446:getfield        #146 <Field Map zzaBQ>
	//  200  449:aload_0         
	//  201  450:getfield        #185 <Field zzg zzaAL>
	//  202  453:aload_0         
	//  203  454:getfield        #144 <Field Map zzaAO>
	//  204  457:aload_0         
	//  205  458:getfield        #187 <Field com.google.android.gms.common.api.Api$zza zzazo>
	//  206  461:aload_0         
	//  207  462:getfield        #148 <Field ArrayList zzaBT>
	//  208  465:aload_0         
	//  209  466:invokespecial   #330 <Method void zzaav(Context, zzaat, Lock, Looper, com.google.android.gms.common.zze, Map, zzg, Map, com.google.android.gms.common.api.Api$zza, ArrayList, zzabc$zza)>
	//  210  469:putfield        #80  <Field zzabc zzaBK>
			return;
	//  211  472:return          
		}
	}

	static String zzcE(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     1 3: default 28
	//	               1 35
	//	               2 39
	//	               3 31
	//*   2   28:goto            43
		case 3: // '\003'
			return "SIGN_IN_MODE_NONE";
	//    3   31:ldc2            #332 <String "SIGN_IN_MODE_NONE">
	//    4   34:areturn         

		case 1: // '\001'
			return "SIGN_IN_MODE_REQUIRED";
	//    5   35:ldc2            #334 <String "SIGN_IN_MODE_REQUIRED">
	//    6   38:areturn         

		case 2: // '\002'
			return "SIGN_IN_MODE_OPTIONAL";
	//    7   39:ldc2            #336 <String "SIGN_IN_MODE_OPTIONAL">
	//    8   42:areturn         
		}
		return "UNKNOWN";
	//    9   43:ldc2            #338 <String "UNKNOWN">
	//   10   46:areturn         
	}

	private void zzwm()
	{
		zzaBJ.zzxY();
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field zzm zzaBJ>
	//    2    4:invokevirtual   #341 <Method void zzm.zzxY()>
		zzaBK.connect();
	//    3    7:aload_0         
	//    4    8:getfield        #80  <Field zzabc zzaBK>
	//    5   11:invokeinterface #346 <Method void zzabc.connect()>
	//    6   16:return          
	}

	private void zzwn()
	{
		zzaAG.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field Lock zzaAG>
	//    2    4:invokeinterface #196 <Method void Lock.lock()>
		if(zzwp())
	//*   3    9:aload_0         
	//*   4   10:invokevirtual   #349 <Method boolean zzwp()>
	//*   5   13:ifeq            20
			zzwm();
	//    6   16:aload_0         
	//    7   17:invokespecial   #202 <Method void zzwm()>
		zzaAG.unlock();
	//    8   20:aload_0         
	//    9   21:getfield        #116 <Field Lock zzaAG>
	//   10   24:invokeinterface #205 <Method void Lock.unlock()>
		return;
	//   11   29:return          
		Exception exception;
		exception;
	//   12   30:astore_1        
		zzaAG.unlock();
	//   13   31:aload_0         
	//   14   32:getfield        #116 <Field Lock zzaAG>
	//   15   35:invokeinterface #205 <Method void Lock.unlock()>
		throw exception;
	//   16   40:aload_1         
	//   17   41:athrow          
	}

	public ConnectionResult blockingConnect()
	{
		boolean flag;
		if(Looper.myLooper() != Looper.getMainLooper())
	//*   0    0:invokestatic    #357 <Method Looper Looper.myLooper()>
	//*   1    3:invokestatic    #360 <Method Looper Looper.getMainLooper()>
	//*   2    6:if_acmpeq       14
			flag = true;
	//    3    9:iconst_1        
	//    4   10:istore_1        
		else
	//*   5   11:goto            16
			flag = false;
	//    6   14:iconst_0        
	//    7   15:istore_1        
		zzac.zza(flag, "blockingConnect must not be called on the UI thread");
	//    8   16:iload_1         
	//    9   17:ldc2            #362 <String "blockingConnect must not be called on the UI thread">
	//   10   20:invokestatic    #367 <Method void zzac.zza(boolean, Object)>
		zzaAG.lock();
	//   11   23:aload_0         
	//   12   24:getfield        #116 <Field Lock zzaAG>
	//   13   27:invokeinterface #196 <Method void Lock.lock()>
		if(zzazl < 0)
			break MISSING_BLOCK_LABEL_61;
	//   14   32:aload_0         
	//   15   33:getfield        #136 <Field int zzazl>
	//   16   36:iflt            61
		boolean flag1;
		ConnectionResult connectionresult;
		Exception exception;
		if(zzaBU != null)
	//*  17   39:aload_0         
	//*  18   40:getfield        #105 <Field Integer zzaBU>
	//*  19   43:ifnull          164
			flag1 = true;
	//   20   46:iconst_1        
	//   21   47:istore_1        
		else
	//*  22   48:goto            51
	//*  23   51:iload_1         
	//*  24   52:ldc2            #369 <String "Sign-in mode should have been set explicitly by auto-manage.">
	//*  25   55:invokestatic    #367 <Method void zzac.zza(boolean, Object)>
	//*  26   58:goto            113
	//*  27   61:aload_0         
	//*  28   62:getfield        #105 <Field Integer zzaBU>
	//*  29   65:ifnonnull       91
	//*  30   68:aload_0         
	//*  31   69:aload_0         
	//*  32   70:getfield        #146 <Field Map zzaBQ>
	//*  33   73:invokeinterface #308 <Method Collection Map.values()>
	//*  34   78:iconst_0        
	//*  35   79:invokestatic    #371 <Method int zza(Iterable, boolean)>
	//*  36   82:invokestatic    #142 <Method Integer Integer.valueOf(int)>
	//*  37   85:putfield        #105 <Field Integer zzaBU>
	//*  38   88:goto            113
	//*  39   91:aload_0         
	//*  40   92:getfield        #105 <Field Integer zzaBU>
	//*  41   95:invokevirtual   #274 <Method int Integer.intValue()>
	//*  42   98:iconst_2        
	//*  43   99:icmpne          113
	//*  44  102:new             #261 <Class IllegalStateException>
	//*  45  105:dup             
	//*  46  106:ldc2            #373 <String "Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.">
	//*  47  109:invokespecial   #266 <Method void IllegalStateException(String)>
	//*  48  112:athrow          
	//*  49  113:aload_0         
	//*  50  114:aload_0         
	//*  51  115:getfield        #105 <Field Integer zzaBU>
	//*  52  118:invokevirtual   #274 <Method int Integer.intValue()>
	//*  53  121:invokespecial   #375 <Method void zzcD(int)>
	//*  54  124:aload_0         
	//*  55  125:getfield        #125 <Field zzm zzaBJ>
	//*  56  128:invokevirtual   #341 <Method void zzm.zzxY()>
	//*  57  131:aload_0         
	//*  58  132:getfield        #80  <Field zzabc zzaBK>
	//*  59  135:invokeinterface #377 <Method ConnectionResult zzabc.blockingConnect()>
	//*  60  140:astore_2        
	//*  61  141:aload_0         
	//*  62  142:getfield        #116 <Field Lock zzaAG>
	//*  63  145:invokeinterface #205 <Method void Lock.unlock()>
	//*  64  150:aload_2         
	//*  65  151:areturn         
	//*  66  152:astore_2        
	//*  67  153:aload_0         
	//*  68  154:getfield        #116 <Field Lock zzaAG>
	//*  69  157:invokeinterface #205 <Method void Lock.unlock()>
	//*  70  162:aload_2         
	//*  71  163:athrow          
			flag1 = false;
	//   72  164:iconst_0        
	//   73  165:istore_1        
		zzac.zza(flag1, "Sign-in mode should have been set explicitly by auto-manage.");
		break MISSING_BLOCK_LABEL_113;
		if(zzaBU == null)
		{
			zzaBU = Integer.valueOf(zza(((Iterable) (zzaBQ.values())), false));
			break MISSING_BLOCK_LABEL_113;
		}
		if(zzaBU.intValue() == 2)
			throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
		zzcD(zzaBU.intValue());
		zzaBJ.zzxY();
		connectionresult = zzaBK.blockingConnect();
		zzaAG.unlock();
		return connectionresult;
		exception;
		zzaAG.unlock();
		throw exception;
	//*  74  166:goto            51
	}

	public ConnectionResult blockingConnect(long l, TimeUnit timeunit)
	{
		boolean flag;
		if(Looper.myLooper() != Looper.getMainLooper())
	//*   0    0:invokestatic    #357 <Method Looper Looper.myLooper()>
	//*   1    3:invokestatic    #360 <Method Looper Looper.getMainLooper()>
	//*   2    6:if_acmpeq       15
			flag = true;
	//    3    9:iconst_1        
	//    4   10:istore          4
		else
	//*   5   12:goto            18
			flag = false;
	//    6   15:iconst_0        
	//    7   16:istore          4
		zzac.zza(flag, "blockingConnect must not be called on the UI thread");
	//    8   18:iload           4
	//    9   20:ldc2            #362 <String "blockingConnect must not be called on the UI thread">
	//   10   23:invokestatic    #367 <Method void zzac.zza(boolean, Object)>
		zzac.zzb(((Object) (timeunit)), "TimeUnit must not be null");
	//   11   26:aload_3         
	//   12   27:ldc2            #380 <String "TimeUnit must not be null">
	//   13   30:invokestatic    #383 <Method Object zzac.zzb(Object, Object)>
	//   14   33:pop             
		zzaAG.lock();
	//   15   34:aload_0         
	//   16   35:getfield        #116 <Field Lock zzaAG>
	//   17   38:invokeinterface #196 <Method void Lock.lock()>
		if(zzaBU == null)
	//*  18   43:aload_0         
	//*  19   44:getfield        #105 <Field Integer zzaBU>
	//*  20   47:ifnonnull       73
		{
			zzaBU = Integer.valueOf(zza(((Iterable) (zzaBQ.values())), false));
	//   21   50:aload_0         
	//   22   51:aload_0         
	//   23   52:getfield        #146 <Field Map zzaBQ>
	//   24   55:invokeinterface #308 <Method Collection Map.values()>
	//   25   60:iconst_0        
	//   26   61:invokestatic    #371 <Method int zza(Iterable, boolean)>
	//   27   64:invokestatic    #142 <Method Integer Integer.valueOf(int)>
	//   28   67:putfield        #105 <Field Integer zzaBU>
			break MISSING_BLOCK_LABEL_95;
	//   29   70:goto            95
		}
		if(zzaBU.intValue() == 2)
	//*  30   73:aload_0         
	//*  31   74:getfield        #105 <Field Integer zzaBU>
	//*  32   77:invokevirtual   #274 <Method int Integer.intValue()>
	//*  33   80:iconst_2        
	//*  34   81:icmpne          95
			throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
	//   35   84:new             #261 <Class IllegalStateException>
	//   36   87:dup             
	//   37   88:ldc2            #373 <String "Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.">
	//   38   91:invokespecial   #266 <Method void IllegalStateException(String)>
	//   39   94:athrow          
		zzcD(zzaBU.intValue());
	//   40   95:aload_0         
	//   41   96:aload_0         
	//   42   97:getfield        #105 <Field Integer zzaBU>
	//   43  100:invokevirtual   #274 <Method int Integer.intValue()>
	//   44  103:invokespecial   #375 <Method void zzcD(int)>
		zzaBJ.zzxY();
	//   45  106:aload_0         
	//   46  107:getfield        #125 <Field zzm zzaBJ>
	//   47  110:invokevirtual   #341 <Method void zzm.zzxY()>
		timeunit = ((TimeUnit) (zzaBK.blockingConnect(l, timeunit)));
	//   48  113:aload_0         
	//   49  114:getfield        #80  <Field zzabc zzaBK>
	//   50  117:lload_1         
	//   51  118:aload_3         
	//   52  119:invokeinterface #385 <Method ConnectionResult zzabc.blockingConnect(long, TimeUnit)>
	//   53  124:astore_3        
		zzaAG.unlock();
	//   54  125:aload_0         
	//   55  126:getfield        #116 <Field Lock zzaAG>
	//   56  129:invokeinterface #205 <Method void Lock.unlock()>
		return ((ConnectionResult) (timeunit));
	//   57  134:aload_3         
	//   58  135:areturn         
		timeunit;
	//   59  136:astore_3        
		zzaAG.unlock();
	//   60  137:aload_0         
	//   61  138:getfield        #116 <Field Lock zzaAG>
	//   62  141:invokeinterface #205 <Method void Lock.unlock()>
		throw timeunit;
	//   63  146:aload_3         
	//   64  147:athrow          
	}

	public PendingResult clearDefaultAccountAndReconnect()
	{
		zzac.zza(isConnected(), "GoogleApiClient is not connected yet.");
	//    0    0:aload_0         
	//    1    1:invokevirtual   #390 <Method boolean isConnected()>
	//    2    4:ldc2            #392 <String "GoogleApiClient is not connected yet.">
	//    3    7:invokestatic    #367 <Method void zzac.zza(boolean, Object)>
		boolean flag;
		if(zzaBU.intValue() != 2)
	//*   4   10:aload_0         
	//*   5   11:getfield        #105 <Field Integer zzaBU>
	//*   6   14:invokevirtual   #274 <Method int Integer.intValue()>
	//*   7   17:iconst_2        
	//*   8   18:icmpeq          26
			flag = true;
	//    9   21:iconst_1        
	//   10   22:istore_1        
		else
	//*  11   23:goto            28
			flag = false;
	//   12   26:iconst_0        
	//   13   27:istore_1        
		zzac.zza(flag, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
	//   14   28:iload_1         
	//   15   29:ldc2            #394 <String "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API">
	//   16   32:invokestatic    #367 <Method void zzac.zza(boolean, Object)>
		zzabt zzabt1 = new zzabt(((GoogleApiClient) (this)));
	//   17   35:new             #396 <Class zzabt>
	//   18   38:dup             
	//   19   39:aload_0         
	//   20   40:invokespecial   #399 <Method void zzabt(GoogleApiClient)>
	//   21   43:astore_2        
		if(zzaBQ.containsKey(((Object) (zzacf.zzaid))))
	//*  22   44:aload_0         
	//*  23   45:getfield        #146 <Field Map zzaBQ>
	//*  24   48:getstatic       #403 <Field com.google.android.gms.common.api.Api$zzf zzacf.zzaid>
	//*  25   51:invokeinterface #407 <Method boolean Map.containsKey(Object)>
	//*  26   56:ifeq            68
		{
			zza(((GoogleApiClient) (this)), zzabt1, false);
	//   27   59:aload_0         
	//   28   60:aload_0         
	//   29   61:aload_2         
	//   30   62:iconst_0        
	//   31   63:invokespecial   #245 <Method void zza(GoogleApiClient, zzabt, boolean)>
			return ((PendingResult) (zzabt1));
	//   32   66:aload_2         
	//   33   67:areturn         
		} else
		{
			AtomicReference atomicreference = new AtomicReference();
	//   34   68:new             #409 <Class AtomicReference>
	//   35   71:dup             
	//   36   72:invokespecial   #410 <Method void AtomicReference()>
	//   37   75:astore_3        
			Object obj = ((Object) (new com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks(atomicreference, zzabt1) {

				public void onConnected(Bundle bundle)
				{
					zzaat.zza(zzaBY, (GoogleApiClient)zzaBZ.get(), zzaCa, true);
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field zzaat zzaBY>
				//    2    4:aload_0         
				//    3    5:getfield        #23  <Field AtomicReference zzaBZ>
				//    4    8:invokevirtual   #37  <Method Object AtomicReference.get()>
				//    5   11:checkcast       #39  <Class GoogleApiClient>
				//    6   14:aload_0         
				//    7   15:getfield        #25  <Field zzabt zzaCa>
				//    8   18:iconst_1        
				//    9   19:invokestatic    #43  <Method void zzaat.zza(zzaat, GoogleApiClient, zzabt, boolean)>
				//   10   22:return          
				}

				public void onConnectionSuspended(int i)
				{
				//    0    0:return          
				}

				final zzaat zzaBY;
				final AtomicReference zzaBZ;
				final zzabt zzaCa;

			
			{
				zzaBY = zzaat.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field zzaat zzaBY>
				zzaBZ = atomicreference;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field AtomicReference zzaBZ>
				zzaCa = zzabt1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field zzabt zzaCa>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
			}
));
	//   38   76:new             #10  <Class zzaat$2>
	//   39   79:dup             
	//   40   80:aload_0         
	//   41   81:aload_3         
	//   42   82:aload_2         
	//   43   83:invokespecial   #413 <Method void zzaat$2(zzaat, AtomicReference, zzabt)>
	//   44   86:astore          4
			com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener = new com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener(zzabt1) {

				public void onConnectionFailed(ConnectionResult connectionresult)
				{
					zzaCa.zzb(((Result) (new Status(8))));
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field zzabt zzaCa>
				//    2    4:new             #26  <Class Status>
				//    3    7:dup             
				//    4    8:bipush          8
				//    5   10:invokespecial   #29  <Method void Status(int)>
				//    6   13:invokevirtual   #35  <Method void zzabt.zzb(Result)>
				//    7   16:return          
				}

				final zzabt zzaCa;

			
			{
				zzaCa = zzabt1;
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:putfield        #17  <Field zzabt zzaCa>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
;
	//   45   88:new             #12  <Class zzaat$3>
	//   46   91:dup             
	//   47   92:aload_0         
	//   48   93:aload_2         
	//   49   94:invokespecial   #416 <Method void zzaat$3(zzaat, zzabt)>
	//   50   97:astore          5
			obj = ((Object) ((new com.google.android.gms.common.api.GoogleApiClient.Builder(mContext)).addApi(zzacf.API).addConnectionCallbacks(((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) (obj))).addOnConnectionFailedListener(onconnectionfailedlistener).setHandler(((Handler) (zzaBO))).build()));
	//   51   99:new             #418 <Class com.google.android.gms.common.api.GoogleApiClient$Builder>
	//   52  102:dup             
	//   53  103:aload_0         
	//   54  104:getfield        #114 <Field Context mContext>
	//   55  107:invokespecial   #421 <Method void com.google.android.gms.common.api.GoogleApiClient$Builder(Context)>
	//   56  110:getstatic       #425 <Field Api zzacf.API>
	//   57  113:invokevirtual   #429 <Method com.google.android.gms.common.api.GoogleApiClient$Builder com.google.android.gms.common.api.GoogleApiClient$Builder.addApi(Api)>
	//   58  116:aload           4
	//   59  118:invokevirtual   #433 <Method com.google.android.gms.common.api.GoogleApiClient$Builder com.google.android.gms.common.api.GoogleApiClient$Builder.addConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks)>
	//   60  121:aload           5
	//   61  123:invokevirtual   #437 <Method com.google.android.gms.common.api.GoogleApiClient$Builder com.google.android.gms.common.api.GoogleApiClient$Builder.addOnConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//   62  126:aload_0         
	//   63  127:getfield        #132 <Field zzaat$zza zzaBO>
	//   64  130:invokevirtual   #441 <Method com.google.android.gms.common.api.GoogleApiClient$Builder com.google.android.gms.common.api.GoogleApiClient$Builder.setHandler(Handler)>
	//   65  133:invokevirtual   #445 <Method GoogleApiClient com.google.android.gms.common.api.GoogleApiClient$Builder.build()>
	//   66  136:astore          4
			atomicreference.set(obj);
	//   67  138:aload_3         
	//   68  139:aload           4
	//   69  141:invokevirtual   #449 <Method void AtomicReference.set(Object)>
			((GoogleApiClient) (obj)).connect();
	//   70  144:aload           4
	//   71  146:invokevirtual   #450 <Method void GoogleApiClient.connect()>
			return ((PendingResult) (zzabt1));
	//   72  149:aload_2         
	//   73  150:areturn         
		}
	}

	public void connect()
	{
		zzaAG.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field Lock zzaAG>
	//    2    4:invokeinterface #196 <Method void Lock.lock()>
		if(zzazl < 0)
			break MISSING_BLOCK_LABEL_38;
	//    3    9:aload_0         
	//    4   10:getfield        #136 <Field int zzazl>
	//    5   13:iflt            38
		boolean flag;
		Exception exception;
		if(zzaBU != null)
	//*   6   16:aload_0         
	//*   7   17:getfield        #105 <Field Integer zzaBU>
	//*   8   20:ifnull          123
			flag = true;
	//    9   23:iconst_1        
	//   10   24:istore_1        
		else
	//*  11   25:goto            28
	//*  12   28:iload_1         
	//*  13   29:ldc2            #369 <String "Sign-in mode should have been set explicitly by auto-manage.">
	//*  14   32:invokestatic    #367 <Method void zzac.zza(boolean, Object)>
	//*  15   35:goto            90
	//*  16   38:aload_0         
	//*  17   39:getfield        #105 <Field Integer zzaBU>
	//*  18   42:ifnonnull       68
	//*  19   45:aload_0         
	//*  20   46:aload_0         
	//*  21   47:getfield        #146 <Field Map zzaBQ>
	//*  22   50:invokeinterface #308 <Method Collection Map.values()>
	//*  23   55:iconst_0        
	//*  24   56:invokestatic    #371 <Method int zza(Iterable, boolean)>
	//*  25   59:invokestatic    #142 <Method Integer Integer.valueOf(int)>
	//*  26   62:putfield        #105 <Field Integer zzaBU>
	//*  27   65:goto            90
	//*  28   68:aload_0         
	//*  29   69:getfield        #105 <Field Integer zzaBU>
	//*  30   72:invokevirtual   #274 <Method int Integer.intValue()>
	//*  31   75:iconst_2        
	//*  32   76:icmpne          90
	//*  33   79:new             #261 <Class IllegalStateException>
	//*  34   82:dup             
	//*  35   83:ldc2            #453 <String "Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.">
	//*  36   86:invokespecial   #266 <Method void IllegalStateException(String)>
	//*  37   89:athrow          
	//*  38   90:aload_0         
	//*  39   91:aload_0         
	//*  40   92:getfield        #105 <Field Integer zzaBU>
	//*  41   95:invokevirtual   #274 <Method int Integer.intValue()>
	//*  42   98:invokevirtual   #455 <Method void connect(int)>
	//*  43  101:aload_0         
	//*  44  102:getfield        #116 <Field Lock zzaAG>
	//*  45  105:invokeinterface #205 <Method void Lock.unlock()>
	//*  46  110:return          
	//*  47  111:astore_2        
	//*  48  112:aload_0         
	//*  49  113:getfield        #116 <Field Lock zzaAG>
	//*  50  116:invokeinterface #205 <Method void Lock.unlock()>
	//*  51  121:aload_2         
	//*  52  122:athrow          
			flag = false;
	//   53  123:iconst_0        
	//   54  124:istore_1        
		zzac.zza(flag, "Sign-in mode should have been set explicitly by auto-manage.");
		break MISSING_BLOCK_LABEL_90;
		if(zzaBU == null)
		{
			zzaBU = Integer.valueOf(zza(((Iterable) (zzaBQ.values())), false));
			break MISSING_BLOCK_LABEL_90;
		}
		if(zzaBU.intValue() == 2)
			throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
		connect(zzaBU.intValue());
		zzaAG.unlock();
		return;
		exception;
		zzaAG.unlock();
		throw exception;
	//*  55  125:goto            28
	}

	public void connect(int i)
	{
		boolean flag;
		zzaAG.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field Lock zzaAG>
	//    2    4:invokeinterface #196 <Method void Lock.lock()>
		if(i == 3 || i == 1 || i == 2)
	//*   3    9:iload_1         
	//*   4   10:iconst_3        
	//*   5   11:icmpeq          24
	//*   6   14:iload_1         
	//*   7   15:iconst_1        
	//*   8   16:icmpeq          24
	//*   9   19:iload_1         
	//*  10   20:iconst_2        
	//*  11   21:icmpne          29
			flag = true;
	//   12   24:iconst_1        
	//   13   25:istore_2        
		else
	//*  14   26:goto            31
			flag = false;
	//   15   29:iconst_0        
	//   16   30:istore_2        
		zzac.zzb(flag, ((Object) ((new StringBuilder(33)).append("Illegal sign-in mode: ").append(i).toString())));
	//   17   31:iload_2         
	//   18   32:new             #288 <Class StringBuilder>
	//   19   35:dup             
	//   20   36:bipush          33
	//   21   38:invokespecial   #290 <Method void StringBuilder(int)>
	//   22   41:ldc2            #457 <String "Illegal sign-in mode: ">
	//   23   44:invokevirtual   #296 <Method StringBuilder StringBuilder.append(String)>
	//   24   47:iload_1         
	//   25   48:invokevirtual   #460 <Method StringBuilder StringBuilder.append(int)>
	//   26   51:invokevirtual   #302 <Method String StringBuilder.toString()>
	//   27   54:invokestatic    #462 <Method void zzac.zzb(boolean, Object)>
		zzcD(i);
	//   28   57:aload_0         
	//   29   58:iload_1         
	//   30   59:invokespecial   #375 <Method void zzcD(int)>
		zzwm();
	//   31   62:aload_0         
	//   32   63:invokespecial   #202 <Method void zzwm()>
		zzaAG.unlock();
	//   33   66:aload_0         
	//   34   67:getfield        #116 <Field Lock zzaAG>
	//   35   70:invokeinterface #205 <Method void Lock.unlock()>
		return;
	//   36   75:return          
		Exception exception;
		exception;
	//   37   76:astore_3        
		zzaAG.unlock();
	//   38   77:aload_0         
	//   39   78:getfield        #116 <Field Lock zzaAG>
	//   40   81:invokeinterface #205 <Method void Lock.unlock()>
		throw exception;
	//   41   86:aload_3         
	//   42   87:athrow          
	}

	public void disconnect()
	{
		zzaAG.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field Lock zzaAG>
	//    2    4:invokeinterface #196 <Method void Lock.lock()>
		zzaBW.release();
	//    3    9:aload_0         
	//    4   10:getfield        #155 <Field zzaby zzaBW>
	//    5   13:invokevirtual   #466 <Method void zzaby.release()>
		if(zzaBK != null)
	//*   6   16:aload_0         
	//*   7   17:getfield        #80  <Field zzabc zzaBK>
	//*   8   20:ifnull          32
			zzaBK.disconnect();
	//    9   23:aload_0         
	//   10   24:getfield        #80  <Field zzabc zzaBK>
	//   11   27:invokeinterface #468 <Method void zzabc.disconnect()>
		zzaBS.release();
	//   12   32:aload_0         
	//   13   33:getfield        #103 <Field zzabi zzaBS>
	//   14   36:invokevirtual   #469 <Method void zzabi.release()>
		zzaad.zza zza1;
		for(Iterator iterator = zzaAU.iterator(); iterator.hasNext(); zza1.cancel())
	//*  15   39:aload_0         
	//*  16   40:getfield        #85  <Field Queue zzaAU>
	//*  17   43:invokeinterface #472 <Method Iterator Queue.iterator()>
	//*  18   48:astore_1        
	//*  19   49:aload_1         
	//*  20   50:invokeinterface #167 <Method boolean Iterator.hasNext()>
	//*  21   55:ifeq            80
		{
			zza1 = (zzaad.zza)iterator.next();
	//   22   58:aload_1         
	//   23   59:invokeinterface #171 <Method Object Iterator.next()>
	//   24   64:checkcast       #474 <Class zzaad$zza>
	//   25   67:astore_2        
			zza1.zza(((zzaby.zzb) (null)));
	//   26   68:aload_2         
	//   27   69:aconst_null     
	//   28   70:invokevirtual   #477 <Method void zzaad$zza.zza(zzaby$zzb)>
		}

	//   29   73:aload_2         
	//   30   74:invokevirtual   #480 <Method void zzaad$zza.cancel()>
	//*  31   77:goto            49
		zzabc zzabc1;
		zzaAU.clear();
	//   32   80:aload_0         
	//   33   81:getfield        #85  <Field Queue zzaAU>
	//   34   84:invokeinterface #483 <Method void Queue.clear()>
		zzabc1 = zzaBK;
	//   35   89:aload_0         
	//   36   90:getfield        #80  <Field zzabc zzaBK>
	//   37   93:astore_1        
		if(zzabc1 == null)
	//*  38   94:aload_1         
	//*  39   95:ifnonnull       108
		{
			zzaAG.unlock();
	//   40   98:aload_0         
	//   41   99:getfield        #116 <Field Lock zzaAG>
	//   42  102:invokeinterface #205 <Method void Lock.unlock()>
			return;
	//   43  107:return          
		}
		zzwp();
	//   44  108:aload_0         
	//   45  109:invokevirtual   #349 <Method boolean zzwp()>
	//   46  112:pop             
		zzaBJ.zzxX();
	//   47  113:aload_0         
	//   48  114:getfield        #125 <Field zzm zzaBJ>
	//   49  117:invokevirtual   #486 <Method void zzm.zzxX()>
		zzaAG.unlock();
	//   50  120:aload_0         
	//   51  121:getfield        #116 <Field Lock zzaAG>
	//   52  124:invokeinterface #205 <Method void Lock.unlock()>
		return;
	//   53  129:return          
		Exception exception;
		exception;
	//   54  130:astore_1        
		zzaAG.unlock();
	//   55  131:aload_0         
	//   56  132:getfield        #116 <Field Lock zzaAG>
	//   57  135:invokeinterface #205 <Method void Lock.unlock()>
		throw exception;
	//   58  140:aload_1         
	//   59  141:athrow          
	}

	public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		printwriter.append(((CharSequence) (s))).append("mContext=").println(((Object) (mContext)));
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #493 <Method PrintWriter PrintWriter.append(CharSequence)>
	//    3    5:ldc2            #495 <String "mContext=">
	//    4    8:invokevirtual   #493 <Method PrintWriter PrintWriter.append(CharSequence)>
	//    5   11:aload_0         
	//    6   12:getfield        #114 <Field Context mContext>
	//    7   15:invokevirtual   #498 <Method void PrintWriter.println(Object)>
		printwriter.append(((CharSequence) (s))).append("mResuming=").print(zzaBL);
	//    8   18:aload_3         
	//    9   19:aload_1         
	//   10   20:invokevirtual   #493 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   11   23:ldc2            #500 <String "mResuming=">
	//   12   26:invokevirtual   #493 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   13   29:aload_0         
	//   14   30:getfield        #502 <Field boolean zzaBL>
	//   15   33:invokevirtual   #506 <Method void PrintWriter.print(boolean)>
		printwriter.append(" mWorkQueue.size()=").print(zzaAU.size());
	//   16   36:aload_3         
	//   17   37:ldc2            #508 <String " mWorkQueue.size()=">
	//   18   40:invokevirtual   #493 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   19   43:aload_0         
	//   20   44:getfield        #85  <Field Queue zzaAU>
	//   21   47:invokeinterface #511 <Method int Queue.size()>
	//   22   52:invokevirtual   #513 <Method void PrintWriter.print(int)>
		zzaBW.dump(printwriter);
	//   23   55:aload_0         
	//   24   56:getfield        #155 <Field zzaby zzaBW>
	//   25   59:aload_3         
	//   26   60:invokevirtual   #516 <Method void zzaby.dump(PrintWriter)>
		if(zzaBK != null)
	//*  27   63:aload_0         
	//*  28   64:getfield        #80  <Field zzabc zzaBK>
	//*  29   67:ifnull          84
			zzaBK.dump(s, filedescriptor, printwriter, as);
	//   30   70:aload_0         
	//   31   71:getfield        #80  <Field zzabc zzaBK>
	//   32   74:aload_1         
	//   33   75:aload_2         
	//   34   76:aload_3         
	//   35   77:aload           4
	//   36   79:invokeinterface #518 <Method void zzabc.dump(String, FileDescriptor, PrintWriter, String[])>
	//   37   84:return          
	}

	public ConnectionResult getConnectionResult(Api api)
	{
		zzaAG.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field Lock zzaAG>
	//    2    4:invokeinterface #196 <Method void Lock.lock()>
		ConnectionResult connectionresult;
		if(!isConnected() && !isResuming())
	//*   3    9:aload_0         
	//*   4   10:invokevirtual   #390 <Method boolean isConnected()>
	//*   5   13:ifne            34
	//*   6   16:aload_0         
	//*   7   17:invokevirtual   #199 <Method boolean isResuming()>
	//*   8   20:ifne            34
			throw new IllegalStateException("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
	//    9   23:new             #261 <Class IllegalStateException>
	//   10   26:dup             
	//   11   27:ldc2            #522 <String "Cannot invoke getConnectionResult unless GoogleApiClient is connected">
	//   12   30:invokespecial   #266 <Method void IllegalStateException(String)>
	//   13   33:athrow          
		if(!zzaBQ.containsKey(((Object) (api.zzvg()))))
			break MISSING_BLOCK_LABEL_158;
	//   14   34:aload_0         
	//   15   35:getfield        #146 <Field Map zzaBQ>
	//   16   38:aload_1         
	//   17   39:invokevirtual   #528 <Method com.google.android.gms.common.api.Api$zzc Api.zzvg()>
	//   18   42:invokeinterface #407 <Method boolean Map.containsKey(Object)>
	//   19   47:ifeq            158
		connectionresult = zzaBK.getConnectionResult(api);
	//   20   50:aload_0         
	//   21   51:getfield        #80  <Field zzabc zzaBK>
	//   22   54:aload_1         
	//   23   55:invokeinterface #530 <Method ConnectionResult zzabc.getConnectionResult(Api)>
	//   24   60:astore_2        
		if(connectionresult != null)
			break MISSING_BLOCK_LABEL_147;
	//   25   61:aload_2         
	//   26   62:ifnonnull       147
		if(!isResuming())
			break MISSING_BLOCK_LABEL_87;
	//   27   65:aload_0         
	//   28   66:invokevirtual   #199 <Method boolean isResuming()>
	//   29   69:ifeq            87
		api = ((Api) (ConnectionResult.zzayj));
	//   30   72:getstatic       #536 <Field ConnectionResult ConnectionResult.zzayj>
	//   31   75:astore_1        
		zzaAG.unlock();
	//   32   76:aload_0         
	//   33   77:getfield        #116 <Field Lock zzaAG>
	//   34   80:invokeinterface #205 <Method void Lock.unlock()>
		return ((ConnectionResult) (api));
	//   35   85:aload_1         
	//   36   86:areturn         
		Log.w("GoogleApiClientImpl", zzwr());
	//   37   87:ldc2            #538 <String "GoogleApiClientImpl">
	//   38   90:aload_0         
	//   39   91:invokevirtual   #541 <Method String zzwr()>
	//   40   94:invokestatic    #547 <Method int Log.w(String, String)>
	//   41   97:pop             
		Log.wtf("GoogleApiClientImpl", String.valueOf(((Object) (api.getName()))).concat(" requested in getConnectionResult is not connected but is not present in the failed  connections map"), ((Throwable) (new Exception())));
	//   42   98:ldc2            #538 <String "GoogleApiClientImpl">
	//   43  101:aload_1         
	//   44  102:invokevirtual   #550 <Method String Api.getName()>
	//   45  105:invokestatic    #283 <Method String String.valueOf(Object)>
	//   46  108:ldc2            #552 <String " requested in getConnectionResult is not connected but is not present in the failed  connections map">
	//   47  111:invokevirtual   #556 <Method String String.concat(String)>
	//   48  114:new             #558 <Class Exception>
	//   49  117:dup             
	//   50  118:invokespecial   #559 <Method void Exception()>
	//   51  121:invokestatic    #563 <Method int Log.wtf(String, String, Throwable)>
	//   52  124:pop             
		api = ((Api) (new ConnectionResult(8, ((android.app.PendingIntent) (null)))));
	//   53  125:new             #532 <Class ConnectionResult>
	//   54  128:dup             
	//   55  129:bipush          8
	//   56  131:aconst_null     
	//   57  132:invokespecial   #566 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//   58  135:astore_1        
		zzaAG.unlock();
	//   59  136:aload_0         
	//   60  137:getfield        #116 <Field Lock zzaAG>
	//   61  140:invokeinterface #205 <Method void Lock.unlock()>
		return ((ConnectionResult) (api));
	//   62  145:aload_1         
	//   63  146:areturn         
		zzaAG.unlock();
	//   64  147:aload_0         
	//   65  148:getfield        #116 <Field Lock zzaAG>
	//   66  151:invokeinterface #205 <Method void Lock.unlock()>
		return connectionresult;
	//   67  156:aload_2         
	//   68  157:areturn         
		throw new IllegalArgumentException(String.valueOf(((Object) (api.getName()))).concat(" was never registered with GoogleApiClient"));
	//   69  158:new             #568 <Class IllegalArgumentException>
	//   70  161:dup             
	//   71  162:aload_1         
	//   72  163:invokevirtual   #550 <Method String Api.getName()>
	//   73  166:invokestatic    #283 <Method String String.valueOf(Object)>
	//   74  169:ldc2            #570 <String " was never registered with GoogleApiClient">
	//   75  172:invokevirtual   #556 <Method String String.concat(String)>
	//   76  175:invokespecial   #571 <Method void IllegalArgumentException(String)>
	//   77  178:athrow          
		api;
	//   78  179:astore_1        
		zzaAG.unlock();
	//   79  180:aload_0         
	//   80  181:getfield        #116 <Field Lock zzaAG>
	//   81  184:invokeinterface #205 <Method void Lock.unlock()>
		throw api;
	//   82  189:aload_1         
	//   83  190:athrow          
	}

	public Context getContext()
	{
		return mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field Context mContext>
	//    2    4:areturn         
	}

	public Looper getLooper()
	{
		return zzrs;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field Looper zzrs>
	//    2    4:areturn         
	}

	public int getSessionId()
	{
		return System.identityHashCode(((Object) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #583 <Method int System.identityHashCode(Object)>
	//    2    4:ireturn         
	}

	public boolean hasConnectedApi(Api api)
	{
		if(!isConnected())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #390 <Method boolean isConnected()>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		api = ((Api) ((com.google.android.gms.common.api.Api.zze)zzaBQ.get(((Object) (api.zzvg())))));
	//    5    9:aload_0         
	//    6   10:getfield        #146 <Field Map zzaBQ>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #528 <Method com.google.android.gms.common.api.Api$zzc Api.zzvg()>
	//    9   17:invokeinterface #589 <Method Object Map.get(Object)>
	//   10   22:checkcast       #211 <Class com.google.android.gms.common.api.Api$zze>
	//   11   25:astore_1        
		return api != null && ((com.google.android.gms.common.api.Api.zze) (api)).isConnected();
	//   12   26:aload_1         
	//   13   27:ifnull          41
	//   14   30:aload_1         
	//   15   31:invokeinterface #590 <Method boolean com.google.android.gms.common.api.Api$zze.isConnected()>
	//   16   36:ifeq            41
	//   17   39:iconst_1        
	//   18   40:ireturn         
	//   19   41:iconst_0        
	//   20   42:ireturn         
	}

	public boolean isConnected()
	{
		return zzaBK != null && zzaBK.isConnected();
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field zzabc zzaBK>
	//    2    4:ifnull          21
	//    3    7:aload_0         
	//    4    8:getfield        #80  <Field zzabc zzaBK>
	//    5   11:invokeinterface #592 <Method boolean zzabc.isConnected()>
	//    6   16:ifeq            21
	//    7   19:iconst_1        
	//    8   20:ireturn         
	//    9   21:iconst_0        
	//   10   22:ireturn         
	}

	public boolean isConnecting()
	{
		return zzaBK != null && zzaBK.isConnecting();
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field zzabc zzaBK>
	//    2    4:ifnull          21
	//    3    7:aload_0         
	//    4    8:getfield        #80  <Field zzabc zzaBK>
	//    5   11:invokeinterface #595 <Method boolean zzabc.isConnecting()>
	//    6   16:ifeq            21
	//    7   19:iconst_1        
	//    8   20:ireturn         
	//    9   21:iconst_0        
	//   10   22:ireturn         
	}

	public boolean isConnectionCallbacksRegistered(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
	{
		return zzaBJ.isConnectionCallbacksRegistered(connectioncallbacks);
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field zzm zzaBJ>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #599 <Method boolean zzm.isConnectionCallbacksRegistered(com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks)>
	//    4    8:ireturn         
	}

	public boolean isConnectionFailedListenerRegistered(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		return zzaBJ.isConnectionFailedListenerRegistered(onconnectionfailedlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field zzm zzaBJ>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #603 <Method boolean zzm.isConnectionFailedListenerRegistered(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//    4    8:ireturn         
	}

	boolean isResuming()
	{
		return zzaBL;
	//    0    0:aload_0         
	//    1    1:getfield        #502 <Field boolean zzaBL>
	//    2    4:ireturn         
	}

	public void reconnect()
	{
		disconnect();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #605 <Method void disconnect()>
		connect();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #606 <Method void connect()>
	//    4    8:return          
	}

	public void registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
	{
		zzaBJ.registerConnectionCallbacks(connectioncallbacks);
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field zzm zzaBJ>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #177 <Method void zzm.registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks)>
	//    4    8:return          
	}

	public void registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		zzaBJ.registerConnectionFailedListener(onconnectionfailedlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field zzm zzaBJ>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #183 <Method void zzm.registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//    4    8:return          
	}

	public void stopAutoManage(FragmentActivity fragmentactivity)
	{
		zzb(new zzabd(((android.app.Activity) (fragmentactivity))));
	//    0    0:aload_0         
	//    1    1:new             #610 <Class zzabd>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #613 <Method void zzabd(android.app.Activity)>
	//    5    9:invokespecial   #615 <Method void zzb(zzabd)>
	//    6   12:return          
	}

	public void unregisterConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
	{
		zzaBJ.unregisterConnectionCallbacks(connectioncallbacks);
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field zzm zzaBJ>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #618 <Method void zzm.unregisterConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks)>
	//    4    8:return          
	}

	public void unregisterConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		zzaBJ.unregisterConnectionFailedListener(onconnectionfailedlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field zzm zzaBJ>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #621 <Method void zzm.unregisterConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//    4    8:return          
	}

	public com.google.android.gms.common.api.Api.zze zza(com.google.android.gms.common.api.Api.zzc zzc1)
	{
		zzc1 = ((com.google.android.gms.common.api.Api.zzc) ((com.google.android.gms.common.api.Api.zze)zzaBQ.get(((Object) (zzc1)))));
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field Map zzaBQ>
	//    2    4:aload_1         
	//    3    5:invokeinterface #589 <Method Object Map.get(Object)>
	//    4   10:checkcast       #211 <Class com.google.android.gms.common.api.Api$zze>
	//    5   13:astore_1        
		zzac.zzb(((Object) (zzc1)), "Appropriate Api was not requested.");
	//    6   14:aload_1         
	//    7   15:ldc2            #624 <String "Appropriate Api was not requested.">
	//    8   18:invokestatic    #383 <Method Object zzac.zzb(Object, Object)>
	//    9   21:pop             
		return ((com.google.android.gms.common.api.Api.zze) (zzc1));
	//   10   22:aload_1         
	//   11   23:areturn         
	}

	public zzaad.zza zza(zzaad.zza zza1)
	{
		boolean flag;
		if(zza1.zzvg() != null)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #627 <Method com.google.android.gms.common.api.Api$zzc zzaad$zza.zzvg()>
	//*   2    4:ifnull          12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		zzac.zzb(flag, "This task can not be enqueued (it's probably a Batch or malformed)");
	//    8   14:iload_2         
	//    9   15:ldc2            #629 <String "This task can not be enqueued (it's probably a Batch or malformed)">
	//   10   18:invokestatic    #462 <Method void zzac.zzb(boolean, Object)>
		flag = zzaBQ.containsKey(((Object) (zza1.zzvg())));
	//   11   21:aload_0         
	//   12   22:getfield        #146 <Field Map zzaBQ>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #627 <Method com.google.android.gms.common.api.Api$zzc zzaad$zza.zzvg()>
	//   15   29:invokeinterface #407 <Method boolean Map.containsKey(Object)>
	//   16   34:istore_2        
		String s;
		if(zza1.getApi() != null)
	//*  17   35:aload_1         
	//*  18   36:invokevirtual   #633 <Method Api zzaad$zza.getApi()>
	//*  19   39:ifnull          53
			s = zza1.getApi().getName();
	//   20   42:aload_1         
	//   21   43:invokevirtual   #633 <Method Api zzaad$zza.getApi()>
	//   22   46:invokevirtual   #550 <Method String Api.getName()>
	//   23   49:astore_3        
		else
	//*  24   50:goto            57
			s = "the API";
	//   25   53:ldc2            #635 <String "the API">
	//   26   56:astore_3        
		zzac.zzb(flag, ((Object) ((new StringBuilder(String.valueOf(((Object) (s))).length() + 65)).append("GoogleApiClient is not configured to use ").append(s).append(" required for this call.").toString())));
	//   27   57:iload_2         
	//   28   58:new             #288 <Class StringBuilder>
	//   29   61:dup             
	//   30   62:aload_3         
	//   31   63:invokestatic    #283 <Method String String.valueOf(Object)>
	//   32   66:invokevirtual   #286 <Method int String.length()>
	//   33   69:bipush          65
	//   34   71:iadd            
	//   35   72:invokespecial   #290 <Method void StringBuilder(int)>
	//   36   75:ldc2            #637 <String "GoogleApiClient is not configured to use ">
	//   37   78:invokevirtual   #296 <Method StringBuilder StringBuilder.append(String)>
	//   38   81:aload_3         
	//   39   82:invokevirtual   #296 <Method StringBuilder StringBuilder.append(String)>
	//   40   85:ldc2            #639 <String " required for this call.">
	//   41   88:invokevirtual   #296 <Method StringBuilder StringBuilder.append(String)>
	//   42   91:invokevirtual   #302 <Method String StringBuilder.toString()>
	//   43   94:invokestatic    #462 <Method void zzac.zzb(boolean, Object)>
		zzaAG.lock();
	//   44   97:aload_0         
	//   45   98:getfield        #116 <Field Lock zzaAG>
	//   46  101:invokeinterface #196 <Method void Lock.lock()>
		if(zzaBK != null)
			break MISSING_BLOCK_LABEL_135;
	//   47  106:aload_0         
	//   48  107:getfield        #80  <Field zzabc zzaBK>
	//   49  110:ifnonnull       135
		zzaAU.add(((Object) (zza1)));
	//   50  113:aload_0         
	//   51  114:getfield        #85  <Field Queue zzaAU>
	//   52  117:aload_1         
	//   53  118:invokeinterface #642 <Method boolean Queue.add(Object)>
	//   54  123:pop             
		zzaAG.unlock();
	//   55  124:aload_0         
	//   56  125:getfield        #116 <Field Lock zzaAG>
	//   57  128:invokeinterface #205 <Method void Lock.unlock()>
		return zza1;
	//   58  133:aload_1         
	//   59  134:areturn         
		zza1 = zzaBK.zza(zza1);
	//   60  135:aload_0         
	//   61  136:getfield        #80  <Field zzabc zzaBK>
	//   62  139:aload_1         
	//   63  140:invokeinterface #644 <Method zzaad$zza zzabc.zza(zzaad$zza)>
	//   64  145:astore_1        
		zzaAG.unlock();
	//   65  146:aload_0         
	//   66  147:getfield        #116 <Field Lock zzaAG>
	//   67  150:invokeinterface #205 <Method void Lock.unlock()>
		return zza1;
	//   68  155:aload_1         
	//   69  156:areturn         
		zza1;
	//   70  157:astore_1        
		zzaAG.unlock();
	//   71  158:aload_0         
	//   72  159:getfield        #116 <Field Lock zzaAG>
	//   73  162:invokeinterface #205 <Method void Lock.unlock()>
		throw zza1;
	//   74  167:aload_1         
	//   75  168:athrow          
	}

	public void zza(zzabx zzabx)
	{
		zzaAG.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field Lock zzaAG>
	//    2    4:invokeinterface #196 <Method void Lock.lock()>
		if(zzaBV == null)
	//*   3    9:aload_0         
	//*   4   10:getfield        #107 <Field Set zzaBV>
	//*   5   13:ifnonnull       27
			zzaBV = ((Set) (new HashSet()));
	//    6   16:aload_0         
	//    7   17:new             #95  <Class HashSet>
	//    8   20:dup             
	//    9   21:invokespecial   #96  <Method void HashSet()>
	//   10   24:putfield        #107 <Field Set zzaBV>
		zzaBV.add(((Object) (zzabx)));
	//   11   27:aload_0         
	//   12   28:getfield        #107 <Field Set zzaBV>
	//   13   31:aload_1         
	//   14   32:invokeinterface #649 <Method boolean Set.add(Object)>
	//   15   37:pop             
		zzaAG.unlock();
	//   16   38:aload_0         
	//   17   39:getfield        #116 <Field Lock zzaAG>
	//   18   42:invokeinterface #205 <Method void Lock.unlock()>
		return;
	//   19   47:return          
		zzabx;
	//   20   48:astore_1        
		zzaAG.unlock();
	//   21   49:aload_0         
	//   22   50:getfield        #116 <Field Lock zzaAG>
	//   23   53:invokeinterface #205 <Method void Lock.unlock()>
		throw zzabx;
	//   24   58:aload_1         
	//   25   59:athrow          
	}

	public boolean zza(Api api)
	{
		return zzaBQ.containsKey(((Object) (api.zzvg())));
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field Map zzaBQ>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #528 <Method com.google.android.gms.common.api.Api$zzc Api.zzvg()>
	//    4    8:invokeinterface #407 <Method boolean Map.containsKey(Object)>
	//    5   13:ireturn         
	}

	public boolean zza(zzabq zzabq)
	{
		return zzaBK != null && zzaBK.zza(zzabq);
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field zzabc zzaBK>
	//    2    4:ifnull          22
	//    3    7:aload_0         
	//    4    8:getfield        #80  <Field zzabc zzaBK>
	//    5   11:aload_1         
	//    6   12:invokeinterface #652 <Method boolean zzabc.zza(zzabq)>
	//    7   17:ifeq            22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	public zzaad.zza zzb(zzaad.zza zza1)
	{
		boolean flag;
		if(zza1.zzvg() != null)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #627 <Method com.google.android.gms.common.api.Api$zzc zzaad$zza.zzvg()>
	//*   2    4:ifnull          12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		zzac.zzb(flag, "This task can not be executed (it's probably a Batch or malformed)");
	//    8   14:iload_2         
	//    9   15:ldc2            #654 <String "This task can not be executed (it's probably a Batch or malformed)">
	//   10   18:invokestatic    #462 <Method void zzac.zzb(boolean, Object)>
		flag = zzaBQ.containsKey(((Object) (zza1.zzvg())));
	//   11   21:aload_0         
	//   12   22:getfield        #146 <Field Map zzaBQ>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #627 <Method com.google.android.gms.common.api.Api$zzc zzaad$zza.zzvg()>
	//   15   29:invokeinterface #407 <Method boolean Map.containsKey(Object)>
	//   16   34:istore_2        
		String s;
		if(zza1.getApi() != null)
	//*  17   35:aload_1         
	//*  18   36:invokevirtual   #633 <Method Api zzaad$zza.getApi()>
	//*  19   39:ifnull          53
			s = zza1.getApi().getName();
	//   20   42:aload_1         
	//   21   43:invokevirtual   #633 <Method Api zzaad$zza.getApi()>
	//   22   46:invokevirtual   #550 <Method String Api.getName()>
	//   23   49:astore_3        
		else
	//*  24   50:goto            57
			s = "the API";
	//   25   53:ldc2            #635 <String "the API">
	//   26   56:astore_3        
		zzac.zzb(flag, ((Object) ((new StringBuilder(String.valueOf(((Object) (s))).length() + 65)).append("GoogleApiClient is not configured to use ").append(s).append(" required for this call.").toString())));
	//   27   57:iload_2         
	//   28   58:new             #288 <Class StringBuilder>
	//   29   61:dup             
	//   30   62:aload_3         
	//   31   63:invokestatic    #283 <Method String String.valueOf(Object)>
	//   32   66:invokevirtual   #286 <Method int String.length()>
	//   33   69:bipush          65
	//   34   71:iadd            
	//   35   72:invokespecial   #290 <Method void StringBuilder(int)>
	//   36   75:ldc2            #637 <String "GoogleApiClient is not configured to use ">
	//   37   78:invokevirtual   #296 <Method StringBuilder StringBuilder.append(String)>
	//   38   81:aload_3         
	//   39   82:invokevirtual   #296 <Method StringBuilder StringBuilder.append(String)>
	//   40   85:ldc2            #639 <String " required for this call.">
	//   41   88:invokevirtual   #296 <Method StringBuilder StringBuilder.append(String)>
	//   42   91:invokevirtual   #302 <Method String StringBuilder.toString()>
	//   43   94:invokestatic    #462 <Method void zzac.zzb(boolean, Object)>
		zzaAG.lock();
	//   44   97:aload_0         
	//   45   98:getfield        #116 <Field Lock zzaAG>
	//   46  101:invokeinterface #196 <Method void Lock.lock()>
		if(zzaBK == null)
	//*  47  106:aload_0         
	//*  48  107:getfield        #80  <Field zzabc zzaBK>
	//*  49  110:ifnonnull       124
			throw new IllegalStateException("GoogleApiClient is not connected yet.");
	//   50  113:new             #261 <Class IllegalStateException>
	//   51  116:dup             
	//   52  117:ldc2            #392 <String "GoogleApiClient is not connected yet.">
	//   53  120:invokespecial   #266 <Method void IllegalStateException(String)>
	//   54  123:athrow          
		if(!isResuming())
			break MISSING_BLOCK_LABEL_196;
	//   55  124:aload_0         
	//   56  125:invokevirtual   #199 <Method boolean isResuming()>
	//   57  128:ifeq            196
		zzaAU.add(((Object) (zza1)));
	//   58  131:aload_0         
	//   59  132:getfield        #85  <Field Queue zzaAU>
	//   60  135:aload_1         
	//   61  136:invokeinterface #642 <Method boolean Queue.add(Object)>
	//   62  141:pop             
		zzaad.zza zza2;
		for(; !zzaAU.isEmpty(); zza2.zzB(Status.zzazz))
	//*  63  142:aload_0         
	//*  64  143:getfield        #85  <Field Queue zzaAU>
	//*  65  146:invokeinterface #657 <Method boolean Queue.isEmpty()>
	//*  66  151:ifne            185
		{
			zza2 = (zzaad.zza)zzaAU.remove();
	//   67  154:aload_0         
	//   68  155:getfield        #85  <Field Queue zzaAU>
	//   69  158:invokeinterface #660 <Method Object Queue.remove()>
	//   70  163:checkcast       #474 <Class zzaad$zza>
	//   71  166:astore_3        
			zzaBW.zzb(((zzaaf) (zza2)));
	//   72  167:aload_0         
	//   73  168:getfield        #155 <Field zzaby zzaBW>
	//   74  171:aload_3         
	//   75  172:invokevirtual   #663 <Method void zzaby.zzb(zzaaf)>
		}

	//   76  175:aload_3         
	//   77  176:getstatic       #669 <Field Status Status.zzazz>
	//   78  179:invokevirtual   #673 <Method void zzaad$zza.zzB(Status)>
	//*  79  182:goto            142
		zzaAG.unlock();
	//   80  185:aload_0         
	//   81  186:getfield        #116 <Field Lock zzaAG>
	//   82  189:invokeinterface #205 <Method void Lock.unlock()>
		return zza1;
	//   83  194:aload_1         
	//   84  195:areturn         
		zza1 = zzaBK.zzb(zza1);
	//   85  196:aload_0         
	//   86  197:getfield        #80  <Field zzabc zzaBK>
	//   87  200:aload_1         
	//   88  201:invokeinterface #675 <Method zzaad$zza zzabc.zzb(zzaad$zza)>
	//   89  206:astore_1        
		zzaAG.unlock();
	//   90  207:aload_0         
	//   91  208:getfield        #116 <Field Lock zzaAG>
	//   92  211:invokeinterface #205 <Method void Lock.unlock()>
		return zza1;
	//   93  216:aload_1         
	//   94  217:areturn         
		zza1;
	//   95  218:astore_1        
		zzaAG.unlock();
	//   96  219:aload_0         
	//   97  220:getfield        #116 <Field Lock zzaAG>
	//   98  223:invokeinterface #205 <Method void Lock.unlock()>
		throw zza1;
	//   99  228:aload_1         
	//  100  229:athrow          
	}

	public void zzb(zzabx zzabx)
	{
		zzaAG.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field Lock zzaAG>
	//    2    4:invokeinterface #196 <Method void Lock.lock()>
		if(zzaBV == null)
	//*   3    9:aload_0         
	//*   4   10:getfield        #107 <Field Set zzaBV>
	//*   5   13:ifnonnull       36
		{
			Log.wtf("GoogleApiClientImpl", "Attempted to remove pending transform when no transforms are registered.", ((Throwable) (new Exception())));
	//    6   16:ldc2            #538 <String "GoogleApiClientImpl">
	//    7   19:ldc2            #678 <String "Attempted to remove pending transform when no transforms are registered.">
	//    8   22:new             #558 <Class Exception>
	//    9   25:dup             
	//   10   26:invokespecial   #559 <Method void Exception()>
	//   11   29:invokestatic    #563 <Method int Log.wtf(String, String, Throwable)>
	//   12   32:pop             
			break MISSING_BLOCK_LABEL_85;
	//   13   33:goto            85
		}
		if(!zzaBV.remove(((Object) (zzabx))))
	//*  14   36:aload_0         
	//*  15   37:getfield        #107 <Field Set zzaBV>
	//*  16   40:aload_1         
	//*  17   41:invokeinterface #680 <Method boolean Set.remove(Object)>
	//*  18   46:ifne            69
		{
			Log.wtf("GoogleApiClientImpl", "Failed to remove pending transform - this may lead to memory leaks!", ((Throwable) (new Exception())));
	//   19   49:ldc2            #538 <String "GoogleApiClientImpl">
	//   20   52:ldc2            #682 <String "Failed to remove pending transform - this may lead to memory leaks!">
	//   21   55:new             #558 <Class Exception>
	//   22   58:dup             
	//   23   59:invokespecial   #559 <Method void Exception()>
	//   24   62:invokestatic    #563 <Method int Log.wtf(String, String, Throwable)>
	//   25   65:pop             
			break MISSING_BLOCK_LABEL_85;
	//   26   66:goto            85
		}
		if(!zzwq())
	//*  27   69:aload_0         
	//*  28   70:invokevirtual   #685 <Method boolean zzwq()>
	//*  29   73:ifne            85
			zzaBK.zzvM();
	//   30   76:aload_0         
	//   31   77:getfield        #80  <Field zzabc zzaBK>
	//   32   80:invokeinterface #688 <Method void zzabc.zzvM()>
		zzaAG.unlock();
	//   33   85:aload_0         
	//   34   86:getfield        #116 <Field Lock zzaAG>
	//   35   89:invokeinterface #205 <Method void Lock.unlock()>
		return;
	//   36   94:return          
		zzabx;
	//   37   95:astore_1        
		zzaAG.unlock();
	//   38   96:aload_0         
	//   39   97:getfield        #116 <Field Lock zzaAG>
	//   40  100:invokeinterface #205 <Method void Lock.unlock()>
		throw zzabx;
	//   41  105:aload_1         
	//   42  106:athrow          
	}

	com.google.android.gms.common.api.Api.zze zzc(com.google.android.gms.common.api.Api.zzc zzc1)
	{
		zzc1 = ((com.google.android.gms.common.api.Api.zzc) ((com.google.android.gms.common.api.Api.zze)zzaBQ.get(((Object) (zzc1)))));
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field Map zzaBQ>
	//    2    4:aload_1         
	//    3    5:invokeinterface #589 <Method Object Map.get(Object)>
	//    4   10:checkcast       #211 <Class com.google.android.gms.common.api.Api$zze>
	//    5   13:astore_1        
		zzac.zzb(((Object) (zzc1)), "Appropriate Api was not requested.");
	//    6   14:aload_1         
	//    7   15:ldc2            #624 <String "Appropriate Api was not requested.">
	//    8   18:invokestatic    #383 <Method Object zzac.zzb(Object, Object)>
	//    9   21:pop             
		return ((com.google.android.gms.common.api.Api.zze) (zzc1));
	//   10   22:aload_1         
	//   11   23:areturn         
	}

	public void zzc(int i, boolean flag)
	{
		if(i == 1 && !flag)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          13
	//*   3    5:iload_2         
	//*   4    6:ifne            13
			zzwo();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #693 <Method void zzwo()>
		zzaBW.zzxd();
	//    7   13:aload_0         
	//    8   14:getfield        #155 <Field zzaby zzaBW>
	//    9   17:invokevirtual   #696 <Method void zzaby.zzxd()>
		zzaBJ.zzcV(i);
	//   10   20:aload_0         
	//   11   21:getfield        #125 <Field zzm zzaBJ>
	//   12   24:iload_1         
	//   13   25:invokevirtual   #699 <Method void zzm.zzcV(int)>
		zzaBJ.zzxX();
	//   14   28:aload_0         
	//   15   29:getfield        #125 <Field zzm zzaBJ>
	//   16   32:invokevirtual   #486 <Method void zzm.zzxX()>
		if(i == 2)
	//*  17   35:iload_1         
	//*  18   36:iconst_2        
	//*  19   37:icmpne          44
			zzwm();
	//   20   40:aload_0         
	//   21   41:invokespecial   #202 <Method void zzwm()>
	//   22   44:return          
	}

	public void zzc(ConnectionResult connectionresult)
	{
		if(!zzazn.zzd(mContext, connectionresult.getErrorCode()))
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field GoogleApiAvailability zzazn>
	//*   2    4:aload_0         
	//*   3    5:getfield        #114 <Field Context mContext>
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #703 <Method int ConnectionResult.getErrorCode()>
	//*   6   12:invokevirtual   #709 <Method boolean GoogleApiAvailability.zzd(Context, int)>
	//*   7   15:ifne            23
			zzwp();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #349 <Method boolean zzwp()>
	//   10   22:pop             
		if(!isResuming())
	//*  11   23:aload_0         
	//*  12   24:invokevirtual   #199 <Method boolean isResuming()>
	//*  13   27:ifne            45
		{
			zzaBJ.zzn(connectionresult);
	//   14   30:aload_0         
	//   15   31:getfield        #125 <Field zzm zzaBJ>
	//   16   34:aload_1         
	//   17   35:invokevirtual   #712 <Method void zzm.zzn(ConnectionResult)>
			zzaBJ.zzxX();
	//   18   38:aload_0         
	//   19   39:getfield        #125 <Field zzm zzaBJ>
	//   20   42:invokevirtual   #486 <Method void zzm.zzxX()>
		}
	//   21   45:return          
	}

	public void zzo(Bundle bundle)
	{
		for(; !zzaAU.isEmpty(); zzb((zzaad.zza)zzaAU.remove()));
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field Queue zzaAU>
	//    2    4:invokeinterface #657 <Method boolean Queue.isEmpty()>
	//    3    9:ifne            32
	//    4   12:aload_0         
	//    5   13:aload_0         
	//    6   14:getfield        #85  <Field Queue zzaAU>
	//    7   17:invokeinterface #660 <Method Object Queue.remove()>
	//    8   22:checkcast       #474 <Class zzaad$zza>
	//    9   25:invokevirtual   #715 <Method zzaad$zza zzb(zzaad$zza)>
	//   10   28:pop             
	//*  11   29:goto            0
		zzaBJ.zzq(bundle);
	//   12   32:aload_0         
	//   13   33:getfield        #125 <Field zzm zzaBJ>
	//   14   36:aload_1         
	//   15   37:invokevirtual   #718 <Method void zzm.zzq(Bundle)>
	//   16   40:return          
	}

	public zzabh zzr(Object obj)
	{
		zzaAG.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field Lock zzaAG>
	//    2    4:invokeinterface #196 <Method void Lock.lock()>
		obj = ((Object) (zzaBS.zzb(obj, zzrs)));
	//    3    9:aload_0         
	//    4   10:getfield        #103 <Field zzabi zzaBS>
	//    5   13:aload_1         
	//    6   14:aload_0         
	//    7   15:getfield        #127 <Field Looper zzrs>
	//    8   18:invokevirtual   #723 <Method zzabh zzabi.zzb(Object, Looper)>
	//    9   21:astore_1        
		zzaAG.unlock();
	//   10   22:aload_0         
	//   11   23:getfield        #116 <Field Lock zzaAG>
	//   12   26:invokeinterface #205 <Method void Lock.unlock()>
		return ((zzabh) (obj));
	//   13   31:aload_1         
	//   14   32:areturn         
		obj;
	//   15   33:astore_1        
		zzaAG.unlock();
	//   16   34:aload_0         
	//   17   35:getfield        #116 <Field Lock zzaAG>
	//   18   38:invokeinterface #205 <Method void Lock.unlock()>
		throw obj;
	//   19   43:aload_1         
	//   20   44:athrow          
	}

	public void zzvn()
	{
		if(zzaBK != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #80  <Field zzabc zzaBK>
	//*   2    4:ifnull          16
			zzaBK.zzvn();
	//    3    7:aload_0         
	//    4    8:getfield        #80  <Field zzabc zzaBK>
	//    5   11:invokeinterface #727 <Method void zzabc.zzvn()>
	//    6   16:return          
	}

	void zzwo()
	{
		if(isResuming())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #199 <Method boolean isResuming()>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		zzaBL = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #502 <Field boolean zzaBL>
		if(zzaBP == null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #729 <Field zzaaz zzaBP>
	//*   9   17:ifnonnull       46
			zzaBP = zzazn.zza(mContext.getApplicationContext(), ((zzaaz.zza) (new zzb(this))));
	//   10   20:aload_0         
	//   11   21:aload_0         
	//   12   22:getfield        #134 <Field GoogleApiAvailability zzazn>
	//   13   25:aload_0         
	//   14   26:getfield        #114 <Field Context mContext>
	//   15   29:invokevirtual   #734 <Method Context Context.getApplicationContext()>
	//   16   32:new             #19  <Class zzaat$zzb>
	//   17   35:dup             
	//   18   36:aload_0         
	//   19   37:invokespecial   #735 <Method void zzaat$zzb(zzaat)>
	//   20   40:invokevirtual   #738 <Method zzaaz GoogleApiAvailability.zza(Context, zzaaz$zza)>
	//   21   43:putfield        #729 <Field zzaaz zzaBP>
		zzaBO.sendMessageDelayed(zzaBO.obtainMessage(1), zzaBM);
	//   22   46:aload_0         
	//   23   47:getfield        #132 <Field zzaat$zza zzaBO>
	//   24   50:aload_0         
	//   25   51:getfield        #132 <Field zzaat$zza zzaBO>
	//   26   54:iconst_1        
	//   27   55:invokevirtual   #742 <Method Message zzaat$zza.obtainMessage(int)>
	//   28   58:aload_0         
	//   29   59:getfield        #89  <Field long zzaBM>
	//   30   62:invokevirtual   #746 <Method boolean zzaat$zza.sendMessageDelayed(Message, long)>
	//   31   65:pop             
		zzaBO.sendMessageDelayed(zzaBO.obtainMessage(2), zzaBN);
	//   32   66:aload_0         
	//   33   67:getfield        #132 <Field zzaat$zza zzaBO>
	//   34   70:aload_0         
	//   35   71:getfield        #132 <Field zzaat$zza zzaBO>
	//   36   74:iconst_2        
	//   37   75:invokevirtual   #742 <Method Message zzaat$zza.obtainMessage(int)>
	//   38   78:aload_0         
	//   39   79:getfield        #93  <Field long zzaBN>
	//   40   82:invokevirtual   #746 <Method boolean zzaat$zza.sendMessageDelayed(Message, long)>
	//   41   85:pop             
	//   42   86:return          
	}

	boolean zzwp()
	{
		if(!isResuming())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #199 <Method boolean isResuming()>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		zzaBL = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #502 <Field boolean zzaBL>
		zzaBO.removeMessages(2);
	//    8   14:aload_0         
	//    9   15:getfield        #132 <Field zzaat$zza zzaBO>
	//   10   18:iconst_2        
	//   11   19:invokevirtual   #749 <Method void zzaat$zza.removeMessages(int)>
		zzaBO.removeMessages(1);
	//   12   22:aload_0         
	//   13   23:getfield        #132 <Field zzaat$zza zzaBO>
	//   14   26:iconst_1        
	//   15   27:invokevirtual   #749 <Method void zzaat$zza.removeMessages(int)>
		if(zzaBP != null)
	//*  16   30:aload_0         
	//*  17   31:getfield        #729 <Field zzaaz zzaBP>
	//*  18   34:ifnull          49
		{
			zzaBP.unregister();
	//   19   37:aload_0         
	//   20   38:getfield        #729 <Field zzaaz zzaBP>
	//   21   41:invokevirtual   #754 <Method void zzaaz.unregister()>
			zzaBP = null;
	//   22   44:aload_0         
	//   23   45:aconst_null     
	//   24   46:putfield        #729 <Field zzaaz zzaBP>
		}
		return true;
	//   25   49:iconst_1        
	//   26   50:ireturn         
	}

	boolean zzwq()
	{
		zzaAG.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field Lock zzaAG>
	//    2    4:invokeinterface #196 <Method void Lock.lock()>
		Set set = zzaBV;
	//    3    9:aload_0         
	//    4   10:getfield        #107 <Field Set zzaBV>
	//    5   13:astore_2        
		if(set == null)
	//*   6   14:aload_2         
	//*   7   15:ifnonnull       29
		{
			zzaAG.unlock();
	//    8   18:aload_0         
	//    9   19:getfield        #116 <Field Lock zzaAG>
	//   10   22:invokeinterface #205 <Method void Lock.unlock()>
			return false;
	//   11   27:iconst_0        
	//   12   28:ireturn         
		}
		boolean flag = zzaBV.isEmpty();
	//   13   29:aload_0         
	//   14   30:getfield        #107 <Field Set zzaBV>
	//   15   33:invokeinterface #755 <Method boolean Set.isEmpty()>
	//   16   38:istore_1        
		if(!flag)
	//*  17   39:iload_1         
	//*  18   40:ifne            48
			flag = true;
	//   19   43:iconst_1        
	//   20   44:istore_1        
		else
	//*  21   45:goto            50
			flag = false;
	//   22   48:iconst_0        
	//   23   49:istore_1        
		zzaAG.unlock();
	//   24   50:aload_0         
	//   25   51:getfield        #116 <Field Lock zzaAG>
	//   26   54:invokeinterface #205 <Method void Lock.unlock()>
		return flag;
	//   27   59:iload_1         
	//   28   60:ireturn         
		Exception exception;
		exception;
	//   29   61:astore_2        
		zzaAG.unlock();
	//   30   62:aload_0         
	//   31   63:getfield        #116 <Field Lock zzaAG>
	//   32   66:invokeinterface #205 <Method void Lock.unlock()>
		throw exception;
	//   33   71:aload_2         
	//   34   72:athrow          
	}

	String zzwr()
	{
		StringWriter stringwriter = new StringWriter();
	//    0    0:new             #757 <Class StringWriter>
	//    1    3:dup             
	//    2    4:invokespecial   #758 <Method void StringWriter()>
	//    3    7:astore_1        
		dump("", ((FileDescriptor) (null)), new PrintWriter(((java.io.Writer) (stringwriter))), ((String []) (null)));
	//    4    8:aload_0         
	//    5    9:ldc2            #760 <String "">
	//    6   12:aconst_null     
	//    7   13:new             #490 <Class PrintWriter>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokespecial   #763 <Method void PrintWriter(java.io.Writer)>
	//   11   21:aconst_null     
	//   12   22:invokevirtual   #764 <Method void dump(String, FileDescriptor, PrintWriter, String[])>
		return stringwriter.toString();
	//   13   25:aload_1         
	//   14   26:invokevirtual   #765 <Method String StringWriter.toString()>
	//   15   29:areturn         
	}

	private final Context mContext;
	private final Lock zzaAG;
	final zzg zzaAL;
	final Map zzaAO;
	final Queue zzaAU = new LinkedList();
	private final zzm zzaBJ;
	private zzabc zzaBK;
	private volatile boolean zzaBL;
	private long zzaBM;
	private long zzaBN;
	private final zza zzaBO;
	zzaaz zzaBP;
	final Map zzaBQ;
	Set zzaBR;
	private final zzabi zzaBS = new zzabi();
	private final ArrayList zzaBT;
	private Integer zzaBU;
	Set zzaBV;
	final zzaby zzaBW;
	private final com.google.android.gms.common.internal.zzm.zza zzaBX = new com.google.android.gms.common.internal.zzm.zza() {

		public boolean isConnected()
		{
			return zzaBY.isConnected();
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field zzaat zzaBY>
		//    2    4:invokevirtual   #22  <Method boolean zzaat.isConnected()>
		//    3    7:ireturn         
		}

		public Bundle zzuC()
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		final zzaat zzaBY;

			
			{
				zzaBY = zzaat.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field zzaat zzaBY>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private final int zzazl;
	private final GoogleApiAvailability zzazn;
	final com.google.android.gms.common.api.Api.zza zzazo;
	private boolean zzazr;
	private final Looper zzrs;
}
