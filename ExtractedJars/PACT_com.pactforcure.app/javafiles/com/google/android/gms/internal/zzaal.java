// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.*;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.zzl;
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
//			zzaba, zzabq, zzabx, zzaby, 
//			zzzt, zzaac, zzaaa, zzaan, 
//			zzaau, zzabl, zzaav, zzaar, 
//			zzabp, zzabi, zzaaz

public final class zzaal extends GoogleApiClient
	implements zzaau.zza
{
	final class zza extends Handler
	{

		public void handleMessage(Message message)
		{
			switch(message.what)
		//*   0    0:aload_1         
		//*   1    1:getfield        #25  <Field int Message.what>
			{
		//*   2    4:tableswitch     1 2: default 28
		//		               1 61
		//		               2 69
			default:
				int i = message.what;
		//    3   28:aload_1         
		//    4   29:getfield        #25  <Field int Message.what>
		//    5   32:istore_2        
				Log.w("GoogleApiClientImpl", (new StringBuilder(31)).append("Unknown message id: ").append(i).toString());
		//    6   33:ldc1            #27  <String "GoogleApiClientImpl">
		//    7   35:new             #29  <Class StringBuilder>
		//    8   38:dup             
		//    9   39:bipush          31
		//   10   41:invokespecial   #32  <Method void StringBuilder(int)>
		//   11   44:ldc1            #34  <String "Unknown message id: ">
		//   12   46:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
		//   13   49:iload_2         
		//   14   50:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
		//   15   53:invokevirtual   #45  <Method String StringBuilder.toString()>
		//   16   56:invokestatic    #51  <Method int Log.w(String, String)>
		//   17   59:pop             
				return;
		//   18   60:return          

			case 1: // '\001'
				zzaal.zzb(zzaAz);
		//   19   61:aload_0         
		//   20   62:getfield        #13  <Field zzaal zzaAz>
		//   21   65:invokestatic    #55  <Method void zzaal.zzb(zzaal)>
				return;
		//   22   68:return          

			case 2: // '\002'
				zzaal.zza(zzaAz);
		//   23   69:aload_0         
		//   24   70:getfield        #13  <Field zzaal zzaAz>
		//   25   73:invokestatic    #57  <Method void zzaal.zza(zzaal)>
				break;
			}
		//   26   76:return          
		}

		final zzaal zzaAz;

		zza(Looper looper)
		{
			zzaAz = zzaal.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field zzaal zzaAz>
			super(looper);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #16  <Method void Handler(Looper)>
		//    6   10:return          
		}
	}

	static class zzb extends zzaar.zza
	{

		public void zzvb()
		{
			zzaal zzaal1 = (zzaal)zzaAD.get();
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field WeakReference zzaAD>
		//    2    4:invokevirtual   #28  <Method Object WeakReference.get()>
		//    3    7:checkcast       #6   <Class zzaal>
		//    4   10:astore_1        
			if(zzaal1 == null)
		//*   5   11:aload_1         
		//*   6   12:ifnonnull       16
			{
				return;
		//    7   15:return          
			} else
			{
				zzaal.zza(zzaal1);
		//    8   16:aload_1         
		//    9   17:invokestatic    #31  <Method void zzaal.zza(zzaal)>
				return;
		//   10   20:return          
			}
		}

		private WeakReference zzaAD;

		zzb(zzaal zzaal1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void zzaar$zza()>
			zzaAD = new WeakReference(((Object) (zzaal1)));
		//    2    4:aload_0         
		//    3    5:new             #17  <Class WeakReference>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:invokespecial   #20  <Method void WeakReference(Object)>
		//    7   13:putfield        #22  <Field WeakReference zzaAD>
		//    8   16:return          
		}
	}


	public zzaal(Context context, Lock lock, Looper looper, zzg zzg, GoogleApiAvailability googleapiavailability, com.google.android.gms.common.api.Api.zza zza1, Map map, 
			List list, List list1, Map map1, int i, int j, ArrayList arraylist, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #78  <Method void GoogleApiClient()>
		zzaAk = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #80  <Field zzaau zzaAk>
	//    5    9:aload_0         
	//    6   10:new             #82  <Class LinkedList>
	//    7   13:dup             
	//    8   14:invokespecial   #83  <Method void LinkedList()>
	//    9   17:putfield        #85  <Field Queue zzaAl>
		zzaAn = 0x1d4c0L;
	//   10   20:aload_0         
	//   11   21:ldc2w           #86  <Long 0x1d4c0L>
	//   12   24:putfield        #89  <Field long zzaAn>
		zzaAo = 5000L;
	//   13   27:aload_0         
	//   14   28:ldc2w           #90  <Long 5000L>
	//   15   31:putfield        #93  <Field long zzaAo>
		zzaAs = ((Set) (new HashSet()));
	//   16   34:aload_0         
	//   17   35:new             #95  <Class HashSet>
	//   18   38:dup             
	//   19   39:invokespecial   #96  <Method void HashSet()>
	//   20   42:putfield        #98  <Field Set zzaAs>
	//   21   45:aload_0         
	//   22   46:new             #100 <Class zzaba>
	//   23   49:dup             
	//   24   50:invokespecial   #101 <Method void zzaba()>
	//   25   53:putfield        #103 <Field zzaba zzaAt>
		zzaAv = null;
	//   26   56:aload_0         
	//   27   57:aconst_null     
	//   28   58:putfield        #105 <Field Integer zzaAv>
		zzaAw = null;
	//   29   61:aload_0         
	//   30   62:aconst_null     
	//   31   63:putfield        #107 <Field Set zzaAw>
	//   32   66:aload_0         
	//   33   67:new             #8   <Class zzaal$1>
	//   34   70:dup             
	//   35   71:aload_0         
	//   36   72:invokespecial   #110 <Method void zzaal$1(zzaal)>
	//   37   75:putfield        #112 <Field com.google.android.gms.common.internal.zzm$zza zzaAy>
		mContext = context;
	//   38   78:aload_0         
	//   39   79:aload_1         
	//   40   80:putfield        #114 <Field Context mContext>
		zzazn = lock;
	//   41   83:aload_0         
	//   42   84:aload_2         
	//   43   85:putfield        #116 <Field Lock zzazn>
		zzayb = flag;
	//   44   88:aload_0         
	//   45   89:iload           14
	//   46   91:putfield        #118 <Field boolean zzayb>
		zzaAj = new zzm(looper, zzaAy);
	//   47   94:aload_0         
	//   48   95:new             #120 <Class zzm>
	//   49   98:dup             
	//   50   99:aload_3         
	//   51  100:aload_0         
	//   52  101:getfield        #112 <Field com.google.android.gms.common.internal.zzm$zza zzaAy>
	//   53  104:invokespecial   #123 <Method void zzm(Looper, com.google.android.gms.common.internal.zzm$zza)>
	//   54  107:putfield        #125 <Field zzm zzaAj>
		zzrx = looper;
	//   55  110:aload_0         
	//   56  111:aload_3         
	//   57  112:putfield        #127 <Field Looper zzrx>
		zzaAp = new zza(looper);
	//   58  115:aload_0         
	//   59  116:new             #16  <Class zzaal$zza>
	//   60  119:dup             
	//   61  120:aload_0         
	//   62  121:aload_3         
	//   63  122:invokespecial   #130 <Method void zzaal$zza(zzaal, Looper)>
	//   64  125:putfield        #132 <Field zzaal$zza zzaAp>
		zzaxX = googleapiavailability;
	//   65  128:aload_0         
	//   66  129:aload           5
	//   67  131:putfield        #134 <Field GoogleApiAvailability zzaxX>
		zzaxV = i;
	//   68  134:aload_0         
	//   69  135:iload           11
	//   70  137:putfield        #136 <Field int zzaxV>
		if(zzaxV >= 0)
	//*  71  140:aload_0         
	//*  72  141:getfield        #136 <Field int zzaxV>
	//*  73  144:iflt            156
			zzaAv = Integer.valueOf(j);
	//   74  147:aload_0         
	//   75  148:iload           12
	//   76  150:invokestatic    #142 <Method Integer Integer.valueOf(int)>
	//   77  153:putfield        #105 <Field Integer zzaAv>
		zzazu = map;
	//   78  156:aload_0         
	//   79  157:aload           7
	//   80  159:putfield        #144 <Field Map zzazu>
		zzaAr = map1;
	//   81  162:aload_0         
	//   82  163:aload           10
	//   83  165:putfield        #146 <Field Map zzaAr>
		zzaAu = arraylist;
	//   84  168:aload_0         
	//   85  169:aload           13
	//   86  171:putfield        #148 <Field ArrayList zzaAu>
		zzaAx = new zzabq(zzaAr);
	//   87  174:aload_0         
	//   88  175:new             #150 <Class zzabq>
	//   89  178:dup             
	//   90  179:aload_0         
	//   91  180:getfield        #146 <Field Map zzaAr>
	//   92  183:invokespecial   #153 <Method void zzabq(Map)>
	//   93  186:putfield        #155 <Field zzabq zzaAx>
		for(context = ((Context) (list.iterator())); ((Iterator) (context)).hasNext(); zzaAj.registerConnectionCallbacks(((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) (lock))))
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
	//  105  217:getfield        #125 <Field zzm zzaAj>
	//  106  220:aload_2         
	//  107  221:invokevirtual   #177 <Method void zzm.registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks)>
	//* 108  224:goto            197
		for(context = ((Context) (list1.iterator())); ((Iterator) (context)).hasNext(); zzaAj.registerConnectionFailedListener(((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) (lock))))
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
	//  120  255:getfield        #125 <Field zzm zzaAj>
	//  121  258:aload_2         
	//  122  259:invokevirtual   #183 <Method void zzm.registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//* 123  262:goto            235
		zzazs = zzg;
	//  124  265:aload_0         
	//  125  266:aload           4
	//  126  268:putfield        #185 <Field zzg zzazs>
		zzaxY = zza1;
	//  127  271:aload_0         
	//  128  272:aload           6
	//  129  274:putfield        #187 <Field com.google.android.gms.common.api.Api$zza zzaxY>
	//  130  277:return          
	}

	private void resume()
	{
		zzazn.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field Lock zzazn>
	//    2    4:invokeinterface #196 <Method void Lock.lock()>
		if(isResuming())
	//*   3    9:aload_0         
	//*   4   10:invokevirtual   #199 <Method boolean isResuming()>
	//*   5   13:ifeq            20
			zzvI();
	//    6   16:aload_0         
	//    7   17:invokespecial   #202 <Method void zzvI()>
		zzazn.unlock();
	//    8   20:aload_0         
	//    9   21:getfield        #116 <Field Lock zzazn>
	//   10   24:invokeinterface #205 <Method void Lock.unlock()>
		return;
	//   11   29:return          
		Exception exception;
		exception;
	//   12   30:astore_1        
		zzazn.unlock();
	//   13   31:aload_0         
	//   14   32:getfield        #116 <Field Lock zzazn>
	//   15   35:invokeinterface #205 <Method void Lock.unlock()>
		throw exception;
	//   16   40:aload_1         
	//   17   41:athrow          
	}

	public static int zza(Iterable iterable, boolean flag)
	{
		boolean flag3 = true;
	//    0    0:iconst_1        
	//    1    1:istore          4
		iterable = ((Iterable) (iterable.iterator()));
	//    2    3:aload_0         
	//    3    4:invokeinterface #209 <Method Iterator Iterable.iterator()>
	//    4    9:astore_0        
		boolean flag1 = false;
	//    5   10:iconst_0        
	//    6   11:istore_2        
		boolean flag2 = false;
	//    7   12:iconst_0        
	//    8   13:istore_3        
		do
		{
			if(!((Iterator) (iterable)).hasNext())
				break;
	//    9   14:aload_0         
	//   10   15:invokeinterface #167 <Method boolean Iterator.hasNext()>
	//   11   20:ifeq            61
			com.google.android.gms.common.api.Api.zze zze = (com.google.android.gms.common.api.Api.zze)((Iterator) (iterable)).next();
	//   12   23:aload_0         
	//   13   24:invokeinterface #171 <Method Object Iterator.next()>
	//   14   29:checkcast       #211 <Class com.google.android.gms.common.api.Api$zze>
	//   15   32:astore          5
			if(zze.zzqD())
	//*  16   34:aload           5
	//*  17   36:invokeinterface #214 <Method boolean com.google.android.gms.common.api.Api$zze.zzqD()>
	//*  18   41:ifeq            46
				flag2 = true;
	//   19   44:iconst_1        
	//   20   45:istore_3        
			if(zze.zzqS())
	//*  21   46:aload           5
	//*  22   48:invokeinterface #217 <Method boolean com.google.android.gms.common.api.Api$zze.zzqS()>
	//*  23   53:ifeq            85
				flag1 = true;
	//   24   56:iconst_1        
	//   25   57:istore_2        
		} while(true);
	//   26   58:goto            14
		if(flag2)
	//*  27   61:iload_3         
	//*  28   62:ifeq            83
		{
			byte byte0 = ((byte) (flag3));
	//   29   65:iload           4
	//   30   67:istore_3        
			if(flag1)
	//*  31   68:iload_2         
	//*  32   69:ifeq            81
			{
				byte0 = ((byte) (flag3));
	//   33   72:iload           4
	//   34   74:istore_3        
				if(flag)
	//*  35   75:iload_1         
	//*  36   76:ifeq            81
					byte0 = 2;
	//   37   79:iconst_2        
	//   38   80:istore_3        
			}
			return ((int) (byte0));
	//   39   81:iload_3         
	//   40   82:ireturn         
		} else
		{
			return 3;
	//   41   83:iconst_3        
	//   42   84:ireturn         
		}
	//*  43   85:goto            58
	}

	private void zza(GoogleApiClient googleapiclient, zzabl zzabl1, boolean flag)
	{
		zzabx.zzaFp.zzg(googleapiclient).setResultCallback(new ResultCallback(zzabl1, flag, googleapiclient) {

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
				zzl.zzaa(zzaal.zzc(zzaAz)).zzre();
			//    0    0:aload_0         
			//    1    1:getfield        #24  <Field zzaal zzaAz>
			//    2    4:invokestatic    #48  <Method Context zzaal.zzc(zzaal)>
			//    3    7:invokestatic    #54  <Method zzl zzl.zzaa(Context)>
			//    4   10:invokevirtual   #57  <Method void zzl.zzre()>
				if(status.isSuccess() && zzaAz.isConnected())
			//*   5   13:aload_1         
			//*   6   14:invokevirtual   #61  <Method boolean Status.isSuccess()>
			//*   7   17:ifeq            37
			//*   8   20:aload_0         
			//*   9   21:getfield        #24  <Field zzaal zzaAz>
			//*  10   24:invokevirtual   #64  <Method boolean zzaal.isConnected()>
			//*  11   27:ifeq            37
					zzaAz.reconnect();
			//   12   30:aload_0         
			//   13   31:getfield        #24  <Field zzaal zzaAz>
			//   14   34:invokevirtual   #67  <Method void zzaal.reconnect()>
				zzaAB.zzb(((Result) (status)));
			//   15   37:aload_0         
			//   16   38:getfield        #26  <Field zzabl zzaAB>
			//   17   41:aload_1         
			//   18   42:invokevirtual   #72  <Method void zzabl.zzb(Result)>
				if(zzaAC)
			//*  19   45:aload_0         
			//*  20   46:getfield        #28  <Field boolean zzaAC>
			//*  21   49:ifeq            59
					zzaob.disconnect();
			//   22   52:aload_0         
			//   23   53:getfield        #30  <Field GoogleApiClient zzaob>
			//   24   56:invokevirtual   #77  <Method void GoogleApiClient.disconnect()>
			//   25   59:return          
			}

			final zzabl zzaAB;
			final boolean zzaAC;
			final zzaal zzaAz;
			final GoogleApiClient zzaob;

			
			{
				zzaAz = zzaal.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field zzaal zzaAz>
				zzaAB = zzabl1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field zzabl zzaAB>
				zzaAC = flag;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #28  <Field boolean zzaAC>
				zzaob = googleapiclient;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #30  <Field GoogleApiClient zzaob>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #33  <Method void Object()>
			//   14   25:return          
			}
		}
);
	//    0    0:getstatic       #225 <Field zzaby zzabx.zzaFp>
	//    1    3:aload_1         
	//    2    4:invokeinterface #231 <Method PendingResult com.google.android.gms.internal.zzaby.zzg(GoogleApiClient)>
	//    3    9:new             #14  <Class zzaal$4>
	//    4   12:dup             
	//    5   13:aload_0         
	//    6   14:aload_2         
	//    7   15:iload_3         
	//    8   16:aload_1         
	//    9   17:invokespecial   #234 <Method void zzaal$4(zzaal, zzabl, boolean, GoogleApiClient)>
	//   10   20:invokevirtual   #240 <Method void PendingResult.setResultCallback(ResultCallback)>
	//   11   23:return          
	}

	static void zza(zzaal zzaal1)
	{
		zzaal1.resume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #242 <Method void resume()>
	//    2    4:return          
	}

	static void zza(zzaal zzaal1, GoogleApiClient googleapiclient, zzabl zzabl1, boolean flag)
	{
		zzaal1.zza(googleapiclient, zzabl1, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #245 <Method void zza(GoogleApiClient, zzabl, boolean)>
	//    5    7:return          
	}

	static void zzb(zzaal zzaal1)
	{
		zzaal1.zzvJ();
	//    0    0:aload_0         
	//    1    1:invokespecial   #248 <Method void zzvJ()>
	//    2    4:return          
	}

	private void zzb(zzaav zzaav1)
	{
		if(zzaxV >= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #136 <Field int zzaxV>
	//*   2    4:iflt            19
		{
			zzzt.zza(zzaav1).zzcu(zzaxV);
	//    3    7:aload_1         
	//    4    8:invokestatic    #255 <Method zzzt zzzt.zza(zzaav)>
	//    5   11:aload_0         
	//    6   12:getfield        #136 <Field int zzaxV>
	//    7   15:invokevirtual   #259 <Method void zzzt.zzcu(int)>
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

	static Context zzc(zzaal zzaal1)
	{
		return zzaal1.mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field Context mContext>
	//    2    4:areturn         
	}

	private void zzcx(int i)
	{
		boolean flag;
		if(zzaAv == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #105 <Field Integer zzaAv>
	//*   2    4:ifnonnull       23
			zzaAv = Integer.valueOf(i);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:invokestatic    #142 <Method Integer Integer.valueOf(int)>
	//    6   12:putfield        #105 <Field Integer zzaAv>
		else
	//*   7   15:aload_0         
	//*   8   16:getfield        #80  <Field zzaau zzaAk>
	//*   9   19:ifnull          115
	//*  10   22:return          
		if(zzaAv.intValue() != i)
	//*  11   23:aload_0         
	//*  12   24:getfield        #105 <Field Integer zzaAv>
	//*  13   27:invokevirtual   #274 <Method int Integer.intValue()>
	//*  14   30:iload_1         
	//*  15   31:icmpeq          15
		{
			String s = String.valueOf(((Object) (zzcy(i))));
	//   16   34:iload_1         
	//   17   35:invokestatic    #278 <Method String zzcy(int)>
	//   18   38:invokestatic    #283 <Method String String.valueOf(Object)>
	//   19   41:astore_3        
			String s1 = String.valueOf(((Object) (zzcy(zzaAv.intValue()))));
	//   20   42:aload_0         
	//   21   43:getfield        #105 <Field Integer zzaAv>
	//   22   46:invokevirtual   #274 <Method int Integer.intValue()>
	//   23   49:invokestatic    #278 <Method String zzcy(int)>
	//   24   52:invokestatic    #283 <Method String String.valueOf(Object)>
	//   25   55:astore          4
			throw new IllegalStateException((new StringBuilder(String.valueOf(((Object) (s))).length() + 51 + String.valueOf(((Object) (s1))).length())).append("Cannot use sign-in mode: ").append(s).append(". Mode was already set to ").append(s1).toString());
	//   26   57:new             #261 <Class IllegalStateException>
	//   27   60:dup             
	//   28   61:new             #285 <Class StringBuilder>
	//   29   64:dup             
	//   30   65:aload_3         
	//   31   66:invokestatic    #283 <Method String String.valueOf(Object)>
	//   32   69:invokevirtual   #288 <Method int String.length()>
	//   33   72:bipush          51
	//   34   74:iadd            
	//   35   75:aload           4
	//   36   77:invokestatic    #283 <Method String String.valueOf(Object)>
	//   37   80:invokevirtual   #288 <Method int String.length()>
	//   38   83:iadd            
	//   39   84:invokespecial   #290 <Method void StringBuilder(int)>
	//   40   87:ldc2            #292 <String "Cannot use sign-in mode: ">
	//   41   90:invokevirtual   #296 <Method StringBuilder StringBuilder.append(String)>
	//   42   93:aload_3         
	//   43   94:invokevirtual   #296 <Method StringBuilder StringBuilder.append(String)>
	//   44   97:ldc2            #298 <String ". Mode was already set to ">
	//   45  100:invokevirtual   #296 <Method StringBuilder StringBuilder.append(String)>
	//   46  103:aload           4
	//   47  105:invokevirtual   #296 <Method StringBuilder StringBuilder.append(String)>
	//   48  108:invokevirtual   #302 <Method String StringBuilder.toString()>
	//   49  111:invokespecial   #266 <Method void IllegalStateException(String)>
	//   50  114:athrow          
		}
		if(zzaAk != null)
			return;
		Iterator iterator = zzaAr.values().iterator();
	//   51  115:aload_0         
	//   52  116:getfield        #146 <Field Map zzaAr>
	//   53  119:invokeinterface #308 <Method Collection Map.values()>
	//   54  124:invokeinterface #311 <Method Iterator Collection.iterator()>
	//   55  129:astore_3        
		i = 0;
	//   56  130:iconst_0        
	//   57  131:istore_1        
		flag = false;
	//   58  132:iconst_0        
	//   59  133:istore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//   60  134:aload_3         
	//   61  135:invokeinterface #167 <Method boolean Iterator.hasNext()>
	//   62  140:ifeq            181
			com.google.android.gms.common.api.Api.zze zze = (com.google.android.gms.common.api.Api.zze)iterator.next();
	//   63  143:aload_3         
	//   64  144:invokeinterface #171 <Method Object Iterator.next()>
	//   65  149:checkcast       #211 <Class com.google.android.gms.common.api.Api$zze>
	//   66  152:astore          4
			if(zze.zzqD())
	//*  67  154:aload           4
	//*  68  156:invokeinterface #214 <Method boolean com.google.android.gms.common.api.Api$zze.zzqD()>
	//*  69  161:ifeq            166
				flag = true;
	//   70  164:iconst_1        
	//   71  165:istore_2        
			if(zze.zzqS())
	//*  72  166:aload           4
	//*  73  168:invokeinterface #217 <Method boolean com.google.android.gms.common.api.Api$zze.zzqS()>
	//*  74  173:ifeq            405
				i = 1;
	//   75  176:iconst_1        
	//   76  177:istore_1        
		} while(true);
	//   77  178:goto            134
		zzaAv.intValue();
	//   78  181:aload_0         
	//   79  182:getfield        #105 <Field Integer zzaAv>
	//   80  185:invokevirtual   #274 <Method int Integer.intValue()>
		JVM INSTR tableswitch 1 3: default 216
	//	               1 276
	//	               2 306
	//	               3 216;
	//   81  188:tableswitch     1 3: default 216
	//	               1 276
	//	               2 306
	//	               3 216
		   goto _L1 _L2 _L3 _L1
_L1:
		break; /* Loop/switch isn't completed */
_L3:
		break MISSING_BLOCK_LABEL_306;
_L4:
		if(zzayb && i == 0)
	//*  82  216:aload_0         
	//*  83  217:getfield        #118 <Field boolean zzayb>
	//*  84  220:ifeq            355
	//*  85  223:iload_1         
	//*  86  224:ifne            355
		{
			zzaAk = ((zzaau) (new zzaac(mContext, zzazn, zzrx, ((com.google.android.gms.common.zzc) (zzaxX)), zzaAr, zzazs, zzazu, zzaxY, zzaAu, this)));
	//   87  227:aload_0         
	//   88  228:new             #313 <Class zzaac>
	//   89  231:dup             
	//   90  232:aload_0         
	//   91  233:getfield        #114 <Field Context mContext>
	//   92  236:aload_0         
	//   93  237:getfield        #116 <Field Lock zzazn>
	//   94  240:aload_0         
	//   95  241:getfield        #127 <Field Looper zzrx>
	//   96  244:aload_0         
	//   97  245:getfield        #134 <Field GoogleApiAvailability zzaxX>
	//   98  248:aload_0         
	//   99  249:getfield        #146 <Field Map zzaAr>
	//  100  252:aload_0         
	//  101  253:getfield        #185 <Field zzg zzazs>
	//  102  256:aload_0         
	//  103  257:getfield        #144 <Field Map zzazu>
	//  104  260:aload_0         
	//  105  261:getfield        #187 <Field com.google.android.gms.common.api.Api$zza zzaxY>
	//  106  264:aload_0         
	//  107  265:getfield        #148 <Field ArrayList zzaAu>
	//  108  268:aload_0         
	//  109  269:invokespecial   #316 <Method void zzaac(Context, Lock, Looper, com.google.android.gms.common.zzc, Map, zzg, Map, com.google.android.gms.common.api.Api$zza, ArrayList, zzaal)>
	//  110  272:putfield        #80  <Field zzaau zzaAk>
			return;
	//  111  275:return          
		} else
	//* 112  276:iload_2         
	//* 113  277:ifne            291
	//* 114  280:new             #261 <Class IllegalStateException>
	//* 115  283:dup             
	//* 116  284:ldc2            #318 <String "SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.">
	//* 117  287:invokespecial   #266 <Method void IllegalStateException(String)>
	//* 118  290:athrow          
	//* 119  291:iload_1         
	//* 120  292:ifeq            216
	//* 121  295:new             #261 <Class IllegalStateException>
	//* 122  298:dup             
	//* 123  299:ldc2            #320 <String "Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.">
	//* 124  302:invokespecial   #266 <Method void IllegalStateException(String)>
	//* 125  305:athrow          
	//* 126  306:iload_2         
	//* 127  307:ifeq            216
	//* 128  310:aload_0         
	//* 129  311:aload_0         
	//* 130  312:getfield        #114 <Field Context mContext>
	//* 131  315:aload_0         
	//* 132  316:aload_0         
	//* 133  317:getfield        #116 <Field Lock zzazn>
	//* 134  320:aload_0         
	//* 135  321:getfield        #127 <Field Looper zzrx>
	//* 136  324:aload_0         
	//* 137  325:getfield        #134 <Field GoogleApiAvailability zzaxX>
	//* 138  328:aload_0         
	//* 139  329:getfield        #146 <Field Map zzaAr>
	//* 140  332:aload_0         
	//* 141  333:getfield        #185 <Field zzg zzazs>
	//* 142  336:aload_0         
	//* 143  337:getfield        #144 <Field Map zzazu>
	//* 144  340:aload_0         
	//* 145  341:getfield        #187 <Field com.google.android.gms.common.api.Api$zza zzaxY>
	//* 146  344:aload_0         
	//* 147  345:getfield        #148 <Field ArrayList zzaAu>
	//* 148  348:invokestatic    #325 <Method zzaaa zzaaa.zza(Context, zzaal, Lock, Looper, com.google.android.gms.common.zzc, Map, zzg, Map, com.google.android.gms.common.api.Api$zza, ArrayList)>
	//* 149  351:putfield        #80  <Field zzaau zzaAk>
	//* 150  354:return          
		{
			zzaAk = ((zzaau) (new zzaan(mContext, this, zzazn, zzrx, ((com.google.android.gms.common.zzc) (zzaxX)), zzaAr, zzazs, zzazu, zzaxY, zzaAu, ((zzaau.zza) (this)))));
	//  151  355:aload_0         
	//  152  356:new             #327 <Class zzaan>
	//  153  359:dup             
	//  154  360:aload_0         
	//  155  361:getfield        #114 <Field Context mContext>
	//  156  364:aload_0         
	//  157  365:aload_0         
	//  158  366:getfield        #116 <Field Lock zzazn>
	//  159  369:aload_0         
	//  160  370:getfield        #127 <Field Looper zzrx>
	//  161  373:aload_0         
	//  162  374:getfield        #134 <Field GoogleApiAvailability zzaxX>
	//  163  377:aload_0         
	//  164  378:getfield        #146 <Field Map zzaAr>
	//  165  381:aload_0         
	//  166  382:getfield        #185 <Field zzg zzazs>
	//  167  385:aload_0         
	//  168  386:getfield        #144 <Field Map zzazu>
	//  169  389:aload_0         
	//  170  390:getfield        #187 <Field com.google.android.gms.common.api.Api$zza zzaxY>
	//  171  393:aload_0         
	//  172  394:getfield        #148 <Field ArrayList zzaAu>
	//  173  397:aload_0         
	//  174  398:invokespecial   #330 <Method void zzaan(Context, zzaal, Lock, Looper, com.google.android.gms.common.zzc, Map, zzg, Map, com.google.android.gms.common.api.Api$zza, ArrayList, zzaau$zza)>
	//  175  401:putfield        #80  <Field zzaau zzaAk>
			return;
	//  176  404:return          
		}
_L2:
		if(!flag)
			throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
		if(i != 0)
			throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
		  goto _L4
		if(flag)
		{
			zzaAk = ((zzaau) (zzaaa.zza(mContext, this, zzazn, zzrx, ((com.google.android.gms.common.zzc) (zzaxX)), zzaAr, zzazs, zzazu, zzaxY, zzaAu)));
			return;
		}
		  goto _L4
	//* 177  405:goto            178
	}

	static String zzcy(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     1 3: default 28
	//	               1 36
	//	               2 40
	//	               3 32
		default:
			return "UNKNOWN";
	//    2   28:ldc2            #332 <String "UNKNOWN">
	//    3   31:areturn         

		case 3: // '\003'
			return "SIGN_IN_MODE_NONE";
	//    4   32:ldc2            #334 <String "SIGN_IN_MODE_NONE">
	//    5   35:areturn         

		case 1: // '\001'
			return "SIGN_IN_MODE_REQUIRED";
	//    6   36:ldc2            #336 <String "SIGN_IN_MODE_REQUIRED">
	//    7   39:areturn         

		case 2: // '\002'
			return "SIGN_IN_MODE_OPTIONAL";
	//    8   40:ldc2            #338 <String "SIGN_IN_MODE_OPTIONAL">
	//    9   43:areturn         
		}
	}

	private void zzvI()
	{
		zzaAj.zzxr();
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field zzm zzaAj>
	//    2    4:invokevirtual   #341 <Method void zzm.zzxr()>
		zzaAk.connect();
	//    3    7:aload_0         
	//    4    8:getfield        #80  <Field zzaau zzaAk>
	//    5   11:invokeinterface #346 <Method void zzaau.connect()>
	//    6   16:return          
	}

	private void zzvJ()
	{
		zzazn.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field Lock zzazn>
	//    2    4:invokeinterface #196 <Method void Lock.lock()>
		if(zzvL())
	//*   3    9:aload_0         
	//*   4   10:invokevirtual   #349 <Method boolean zzvL()>
	//*   5   13:ifeq            20
			zzvI();
	//    6   16:aload_0         
	//    7   17:invokespecial   #202 <Method void zzvI()>
		zzazn.unlock();
	//    8   20:aload_0         
	//    9   21:getfield        #116 <Field Lock zzazn>
	//   10   24:invokeinterface #205 <Method void Lock.unlock()>
		return;
	//   11   29:return          
		Exception exception;
		exception;
	//   12   30:astore_1        
		zzazn.unlock();
	//   13   31:aload_0         
	//   14   32:getfield        #116 <Field Lock zzazn>
	//   15   35:invokeinterface #205 <Method void Lock.unlock()>
		throw exception;
	//   16   40:aload_1         
	//   17   41:athrow          
	}

	public ConnectionResult blockingConnect()
	{
		boolean flag;
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		ConnectionResult connectionresult;
		if(Looper.myLooper() != Looper.getMainLooper())
	//*   2    2:invokestatic    #357 <Method Looper Looper.myLooper()>
	//*   3    5:invokestatic    #360 <Method Looper Looper.getMainLooper()>
	//*   4    8:if_acmpeq       91
			flag = true;
	//    5   11:iconst_1        
	//    6   12:istore_1        
		else
	//*   7   13:iload_1         
	//*   8   14:ldc2            #362 <String "blockingConnect must not be called on the UI thread">
	//*   9   17:invokestatic    #367 <Method void zzac.zza(boolean, Object)>
	//*  10   20:aload_0         
	//*  11   21:getfield        #116 <Field Lock zzazn>
	//*  12   24:invokeinterface #196 <Method void Lock.lock()>
	//*  13   29:aload_0         
	//*  14   30:getfield        #136 <Field int zzaxV>
	//*  15   33:iflt            101
	//*  16   36:aload_0         
	//*  17   37:getfield        #105 <Field Integer zzaAv>
	//*  18   40:ifnull          96
	//*  19   43:iload_2         
	//*  20   44:istore_1        
	//*  21   45:iload_1         
	//*  22   46:ldc2            #369 <String "Sign-in mode should have been set explicitly by auto-manage.">
	//*  23   49:invokestatic    #367 <Method void zzac.zza(boolean, Object)>
	//*  24   52:aload_0         
	//*  25   53:aload_0         
	//*  26   54:getfield        #105 <Field Integer zzaAv>
	//*  27   57:invokevirtual   #274 <Method int Integer.intValue()>
	//*  28   60:invokespecial   #371 <Method void zzcx(int)>
	//*  29   63:aload_0         
	//*  30   64:getfield        #125 <Field zzm zzaAj>
	//*  31   67:invokevirtual   #341 <Method void zzm.zzxr()>
	//*  32   70:aload_0         
	//*  33   71:getfield        #80  <Field zzaau zzaAk>
	//*  34   74:invokeinterface #373 <Method ConnectionResult zzaau.blockingConnect()>
	//*  35   79:astore_3        
	//*  36   80:aload_0         
	//*  37   81:getfield        #116 <Field Lock zzazn>
	//*  38   84:invokeinterface #205 <Method void Lock.unlock()>
	//*  39   89:aload_3         
	//*  40   90:areturn         
			flag = false;
	//   41   91:iconst_0        
	//   42   92:istore_1        
		zzac.zza(flag, "blockingConnect must not be called on the UI thread");
		zzazn.lock();
		if(zzaxV < 0) goto _L2; else goto _L1
_L1:
		if(zzaAv != null)
			flag = flag1;
		else
	//*  43   93:goto            13
			flag = false;
	//   44   96:iconst_0        
	//   45   97:istore_1        
		zzac.zza(flag, "Sign-in mode should have been set explicitly by auto-manage.");
_L3:
		zzcx(zzaAv.intValue());
		zzaAj.zzxr();
		connectionresult = zzaAk.blockingConnect();
		zzazn.unlock();
		return connectionresult;
	//*  46   98:goto            45
_L2:
		if(zzaAv != null)
			continue; /* Loop/switch isn't completed */
	//   47  101:aload_0         
	//   48  102:getfield        #105 <Field Integer zzaAv>
	//   49  105:ifnonnull       143
		zzaAv = Integer.valueOf(zza(((Iterable) (zzaAr.values())), false));
	//   50  108:aload_0         
	//   51  109:aload_0         
	//   52  110:getfield        #146 <Field Map zzaAr>
	//   53  113:invokeinterface #308 <Method Collection Map.values()>
	//   54  118:iconst_0        
	//   55  119:invokestatic    #375 <Method int zza(Iterable, boolean)>
	//   56  122:invokestatic    #142 <Method Integer Integer.valueOf(int)>
	//   57  125:putfield        #105 <Field Integer zzaAv>
		  goto _L3
	//*  58  128:goto            52
		Exception exception;
		exception;
	//   59  131:astore_3        
		zzazn.unlock();
	//   60  132:aload_0         
	//   61  133:getfield        #116 <Field Lock zzazn>
	//   62  136:invokeinterface #205 <Method void Lock.unlock()>
		throw exception;
	//   63  141:aload_3         
	//   64  142:athrow          
		if(zzaAv.intValue() != 2) goto _L3; else goto _L4
	//   65  143:aload_0         
	//   66  144:getfield        #105 <Field Integer zzaAv>
	//   67  147:invokevirtual   #274 <Method int Integer.intValue()>
	//   68  150:iconst_2        
	//   69  151:icmpne          52
_L4:
		throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
	//   70  154:new             #261 <Class IllegalStateException>
	//   71  157:dup             
	//   72  158:ldc2            #377 <String "Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.">
	//   73  161:invokespecial   #266 <Method void IllegalStateException(String)>
	//   74  164:athrow          
	}

	public ConnectionResult blockingConnect(long l, TimeUnit timeunit)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		if(Looper.myLooper() != Looper.getMainLooper())
	//*   2    3:invokestatic    #357 <Method Looper Looper.myLooper()>
	//*   3    6:invokestatic    #360 <Method Looper Looper.getMainLooper()>
	//*   4    9:if_acmpeq       15
			flag = true;
	//    5   12:iconst_1        
	//    6   13:istore          4
		zzac.zza(flag, "blockingConnect must not be called on the UI thread");
	//    7   15:iload           4
	//    8   17:ldc2            #362 <String "blockingConnect must not be called on the UI thread">
	//    9   20:invokestatic    #367 <Method void zzac.zza(boolean, Object)>
		zzac.zzb(((Object) (timeunit)), "TimeUnit must not be null");
	//   10   23:aload_3         
	//   11   24:ldc2            #380 <String "TimeUnit must not be null">
	//   12   27:invokestatic    #383 <Method Object zzac.zzb(Object, Object)>
	//   13   30:pop             
		zzazn.lock();
	//   14   31:aload_0         
	//   15   32:getfield        #116 <Field Lock zzazn>
	//   16   35:invokeinterface #196 <Method void Lock.lock()>
		if(zzaAv != null) goto _L2; else goto _L1
	//   17   40:aload_0         
	//   18   41:getfield        #105 <Field Integer zzaAv>
	//   19   44:ifnonnull       108
_L1:
		zzaAv = Integer.valueOf(zza(((Iterable) (zzaAr.values())), false));
	//   20   47:aload_0         
	//   21   48:aload_0         
	//   22   49:getfield        #146 <Field Map zzaAr>
	//   23   52:invokeinterface #308 <Method Collection Map.values()>
	//   24   57:iconst_0        
	//   25   58:invokestatic    #375 <Method int zza(Iterable, boolean)>
	//   26   61:invokestatic    #142 <Method Integer Integer.valueOf(int)>
	//   27   64:putfield        #105 <Field Integer zzaAv>
_L4:
		zzcx(zzaAv.intValue());
	//   28   67:aload_0         
	//   29   68:aload_0         
	//   30   69:getfield        #105 <Field Integer zzaAv>
	//   31   72:invokevirtual   #274 <Method int Integer.intValue()>
	//   32   75:invokespecial   #371 <Method void zzcx(int)>
		zzaAj.zzxr();
	//   33   78:aload_0         
	//   34   79:getfield        #125 <Field zzm zzaAj>
	//   35   82:invokevirtual   #341 <Method void zzm.zzxr()>
		timeunit = ((TimeUnit) (zzaAk.blockingConnect(l, timeunit)));
	//   36   85:aload_0         
	//   37   86:getfield        #80  <Field zzaau zzaAk>
	//   38   89:lload_1         
	//   39   90:aload_3         
	//   40   91:invokeinterface #385 <Method ConnectionResult zzaau.blockingConnect(long, TimeUnit)>
	//   41   96:astore_3        
		zzazn.unlock();
	//   42   97:aload_0         
	//   43   98:getfield        #116 <Field Lock zzazn>
	//   44  101:invokeinterface #205 <Method void Lock.unlock()>
		return ((ConnectionResult) (timeunit));
	//   45  106:aload_3         
	//   46  107:areturn         
_L2:
		if(zzaAv.intValue() != 2) goto _L4; else goto _L3
	//   47  108:aload_0         
	//   48  109:getfield        #105 <Field Integer zzaAv>
	//   49  112:invokevirtual   #274 <Method int Integer.intValue()>
	//   50  115:iconst_2        
	//   51  116:icmpne          67
_L3:
		throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
	//   52  119:new             #261 <Class IllegalStateException>
	//   53  122:dup             
	//   54  123:ldc2            #377 <String "Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.">
	//   55  126:invokespecial   #266 <Method void IllegalStateException(String)>
	//   56  129:athrow          
		timeunit;
	//   57  130:astore_3        
		zzazn.unlock();
	//   58  131:aload_0         
	//   59  132:getfield        #116 <Field Lock zzazn>
	//   60  135:invokeinterface #205 <Method void Lock.unlock()>
		throw timeunit;
	//   61  140:aload_3         
	//   62  141:athrow          
	}

	public PendingResult clearDefaultAccountAndReconnect()
	{
		zzac.zza(isConnected(), "GoogleApiClient is not connected yet.");
	//    0    0:aload_0         
	//    1    1:invokevirtual   #390 <Method boolean isConnected()>
	//    2    4:ldc2            #392 <String "GoogleApiClient is not connected yet.">
	//    3    7:invokestatic    #367 <Method void zzac.zza(boolean, Object)>
		boolean flag;
		zzabl zzabl1;
		if(zzaAv.intValue() != 2)
	//*   4   10:aload_0         
	//*   5   11:getfield        #105 <Field Integer zzaAv>
	//*   6   14:invokevirtual   #274 <Method int Integer.intValue()>
	//*   7   17:iconst_2        
	//*   8   18:icmpeq          63
			flag = true;
	//    9   21:iconst_1        
	//   10   22:istore_1        
		else
	//*  11   23:iload_1         
	//*  12   24:ldc2            #394 <String "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API">
	//*  13   27:invokestatic    #367 <Method void zzac.zza(boolean, Object)>
	//*  14   30:new             #396 <Class zzabl>
	//*  15   33:dup             
	//*  16   34:aload_0         
	//*  17   35:invokespecial   #399 <Method void zzabl(GoogleApiClient)>
	//*  18   38:astore_2        
	//*  19   39:aload_0         
	//*  20   40:getfield        #146 <Field Map zzaAr>
	//*  21   43:getstatic       #403 <Field com.google.android.gms.common.api.Api$zzf zzabx.zzahc>
	//*  22   46:invokeinterface #407 <Method boolean Map.containsKey(Object)>
	//*  23   51:ifeq            68
	//*  24   54:aload_0         
	//*  25   55:aload_0         
	//*  26   56:aload_2         
	//*  27   57:iconst_0        
	//*  28   58:invokespecial   #245 <Method void zza(GoogleApiClient, zzabl, boolean)>
	//*  29   61:aload_2         
	//*  30   62:areturn         
			flag = false;
	//   31   63:iconst_0        
	//   32   64:istore_1        
		zzac.zza(flag, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
		zzabl1 = new zzabl(((GoogleApiClient) (this)));
		if(zzaAr.containsKey(((Object) (zzabx.zzahc))))
		{
			zza(((GoogleApiClient) (this)), zzabl1, false);
			return ((PendingResult) (zzabl1));
		} else
	//*  33   65:goto            23
		{
			AtomicReference atomicreference = new AtomicReference();
	//   34   68:new             #409 <Class AtomicReference>
	//   35   71:dup             
	//   36   72:invokespecial   #410 <Method void AtomicReference()>
	//   37   75:astore_3        
			Object obj = ((Object) (new com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks(atomicreference, zzabl1) {

				public void onConnected(Bundle bundle)
				{
					zzaal.zza(zzaAz, (GoogleApiClient)zzaAA.get(), zzaAB, true);
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field zzaal zzaAz>
				//    2    4:aload_0         
				//    3    5:getfield        #23  <Field AtomicReference zzaAA>
				//    4    8:invokevirtual   #37  <Method Object AtomicReference.get()>
				//    5   11:checkcast       #39  <Class GoogleApiClient>
				//    6   14:aload_0         
				//    7   15:getfield        #25  <Field zzabl zzaAB>
				//    8   18:iconst_1        
				//    9   19:invokestatic    #43  <Method void zzaal.zza(zzaal, GoogleApiClient, zzabl, boolean)>
				//   10   22:return          
				}

				public void onConnectionSuspended(int i)
				{
				//    0    0:return          
				}

				final AtomicReference zzaAA;
				final zzabl zzaAB;
				final zzaal zzaAz;

			
			{
				zzaAz = zzaal.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field zzaal zzaAz>
				zzaAA = atomicreference;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field AtomicReference zzaAA>
				zzaAB = zzabl1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field zzabl zzaAB>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
			}
));
	//   38   76:new             #10  <Class zzaal$2>
	//   39   79:dup             
	//   40   80:aload_0         
	//   41   81:aload_3         
	//   42   82:aload_2         
	//   43   83:invokespecial   #413 <Method void zzaal$2(zzaal, AtomicReference, zzabl)>
	//   44   86:astore          4
			com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener = new com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener(zzabl1) {

				public void onConnectionFailed(ConnectionResult connectionresult)
				{
					zzaAB.zzb(((Result) (new Status(8))));
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field zzabl zzaAB>
				//    2    4:new             #26  <Class Status>
				//    3    7:dup             
				//    4    8:bipush          8
				//    5   10:invokespecial   #29  <Method void Status(int)>
				//    6   13:invokevirtual   #35  <Method void zzabl.zzb(Result)>
				//    7   16:return          
				}

				final zzabl zzaAB;

			
			{
				zzaAB = zzabl1;
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:putfield        #17  <Field zzabl zzaAB>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
;
	//   45   88:new             #12  <Class zzaal$3>
	//   46   91:dup             
	//   47   92:aload_0         
	//   48   93:aload_2         
	//   49   94:invokespecial   #416 <Method void zzaal$3(zzaal, zzabl)>
	//   50   97:astore          5
			obj = ((Object) ((new com.google.android.gms.common.api.GoogleApiClient.Builder(mContext)).addApi(zzabx.API).addConnectionCallbacks(((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) (obj))).addOnConnectionFailedListener(onconnectionfailedlistener).setHandler(((Handler) (zzaAp))).build()));
	//   51   99:new             #418 <Class com.google.android.gms.common.api.GoogleApiClient$Builder>
	//   52  102:dup             
	//   53  103:aload_0         
	//   54  104:getfield        #114 <Field Context mContext>
	//   55  107:invokespecial   #421 <Method void com.google.android.gms.common.api.GoogleApiClient$Builder(Context)>
	//   56  110:getstatic       #425 <Field Api zzabx.API>
	//   57  113:invokevirtual   #429 <Method com.google.android.gms.common.api.GoogleApiClient$Builder com.google.android.gms.common.api.GoogleApiClient$Builder.addApi(Api)>
	//   58  116:aload           4
	//   59  118:invokevirtual   #433 <Method com.google.android.gms.common.api.GoogleApiClient$Builder com.google.android.gms.common.api.GoogleApiClient$Builder.addConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks)>
	//   60  121:aload           5
	//   61  123:invokevirtual   #437 <Method com.google.android.gms.common.api.GoogleApiClient$Builder com.google.android.gms.common.api.GoogleApiClient$Builder.addOnConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//   62  126:aload_0         
	//   63  127:getfield        #132 <Field zzaal$zza zzaAp>
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
			return ((PendingResult) (zzabl1));
	//   72  149:aload_2         
	//   73  150:areturn         
		}
	}

	public void connect()
	{
		boolean flag;
		flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		zzazn.lock();
	//    2    2:aload_0         
	//    3    3:getfield        #116 <Field Lock zzazn>
	//    4    6:invokeinterface #196 <Method void Lock.lock()>
		if(zzaxV < 0) goto _L2; else goto _L1
	//    5   11:aload_0         
	//    6   12:getfield        #136 <Field int zzaxV>
	//    7   15:iflt            55
_L1:
		if(zzaAv != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #105 <Field Integer zzaAv>
	//*  10   22:ifnull          27
			flag = true;
	//   11   25:iconst_1        
	//   12   26:istore_1        
		zzac.zza(flag, "Sign-in mode should have been set explicitly by auto-manage.");
	//   13   27:iload_1         
	//   14   28:ldc2            #369 <String "Sign-in mode should have been set explicitly by auto-manage.">
	//   15   31:invokestatic    #367 <Method void zzac.zza(boolean, Object)>
_L3:
		connect(zzaAv.intValue());
	//   16   34:aload_0         
	//   17   35:aload_0         
	//   18   36:getfield        #105 <Field Integer zzaAv>
	//   19   39:invokevirtual   #274 <Method int Integer.intValue()>
	//   20   42:invokevirtual   #453 <Method void connect(int)>
		zzazn.unlock();
	//   21   45:aload_0         
	//   22   46:getfield        #116 <Field Lock zzazn>
	//   23   49:invokeinterface #205 <Method void Lock.unlock()>
		return;
	//   24   54:return          
_L2:
		if(zzaAv != null)
			continue; /* Loop/switch isn't completed */
	//   25   55:aload_0         
	//   26   56:getfield        #105 <Field Integer zzaAv>
	//   27   59:ifnonnull       97
		zzaAv = Integer.valueOf(zza(((Iterable) (zzaAr.values())), false));
	//   28   62:aload_0         
	//   29   63:aload_0         
	//   30   64:getfield        #146 <Field Map zzaAr>
	//   31   67:invokeinterface #308 <Method Collection Map.values()>
	//   32   72:iconst_0        
	//   33   73:invokestatic    #375 <Method int zza(Iterable, boolean)>
	//   34   76:invokestatic    #142 <Method Integer Integer.valueOf(int)>
	//   35   79:putfield        #105 <Field Integer zzaAv>
		  goto _L3
	//*  36   82:goto            34
		Exception exception;
		exception;
	//   37   85:astore_2        
		zzazn.unlock();
	//   38   86:aload_0         
	//   39   87:getfield        #116 <Field Lock zzazn>
	//   40   90:invokeinterface #205 <Method void Lock.unlock()>
		throw exception;
	//   41   95:aload_2         
	//   42   96:athrow          
		if(zzaAv.intValue() != 2) goto _L3; else goto _L4
	//   43   97:aload_0         
	//   44   98:getfield        #105 <Field Integer zzaAv>
	//   45  101:invokevirtual   #274 <Method int Integer.intValue()>
	//   46  104:iconst_2        
	//   47  105:icmpne          34
_L4:
		throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
	//   48  108:new             #261 <Class IllegalStateException>
	//   49  111:dup             
	//   50  112:ldc2            #455 <String "Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.">
	//   51  115:invokespecial   #266 <Method void IllegalStateException(String)>
	//   52  118:athrow          
	}

	public void connect(int i)
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		zzazn.lock();
	//    2    2:aload_0         
	//    3    3:getfield        #116 <Field Lock zzazn>
	//    4    6:invokeinterface #196 <Method void Lock.lock()>
		boolean flag = flag1;
	//    5   11:iload_3         
	//    6   12:istore_2        
		if(i != 3)
	//*   7   13:iload_1         
	//*   8   14:iconst_3        
	//*   9   15:icmpeq          32
		{
			flag = flag1;
	//   10   18:iload_3         
	//   11   19:istore_2        
			if(i != 1)
	//*  12   20:iload_1         
	//*  13   21:iconst_1        
	//*  14   22:icmpeq          32
				if(i == 2)
	//*  15   25:iload_1         
	//*  16   26:iconst_2        
	//*  17   27:icmpne          77
					flag = flag1;
	//   18   30:iload_3         
	//   19   31:istore_2        
				else
	//*  20   32:iload_2         
	//*  21   33:new             #285 <Class StringBuilder>
	//*  22   36:dup             
	//*  23   37:bipush          33
	//*  24   39:invokespecial   #290 <Method void StringBuilder(int)>
	//*  25   42:ldc2            #457 <String "Illegal sign-in mode: ">
	//*  26   45:invokevirtual   #296 <Method StringBuilder StringBuilder.append(String)>
	//*  27   48:iload_1         
	//*  28   49:invokevirtual   #460 <Method StringBuilder StringBuilder.append(int)>
	//*  29   52:invokevirtual   #302 <Method String StringBuilder.toString()>
	//*  30   55:invokestatic    #462 <Method void zzac.zzb(boolean, Object)>
	//*  31   58:aload_0         
	//*  32   59:iload_1         
	//*  33   60:invokespecial   #371 <Method void zzcx(int)>
	//*  34   63:aload_0         
	//*  35   64:invokespecial   #202 <Method void zzvI()>
	//*  36   67:aload_0         
	//*  37   68:getfield        #116 <Field Lock zzazn>
	//*  38   71:invokeinterface #205 <Method void Lock.unlock()>
	//*  39   76:return          
					flag = false;
	//   40   77:iconst_0        
	//   41   78:istore_2        
		}
		zzac.zzb(flag, ((Object) ((new StringBuilder(33)).append("Illegal sign-in mode: ").append(i).toString())));
		zzcx(i);
		zzvI();
		zzazn.unlock();
		return;
	//*  42   79:goto            32
		Exception exception;
		exception;
	//   43   82:astore          4
		zzazn.unlock();
	//   44   84:aload_0         
	//   45   85:getfield        #116 <Field Lock zzazn>
	//   46   88:invokeinterface #205 <Method void Lock.unlock()>
		throw exception;
	//   47   93:aload           4
	//   48   95:athrow          
	}

	public void disconnect()
	{
		zzazn.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field Lock zzazn>
	//    2    4:invokeinterface #196 <Method void Lock.lock()>
		zzaAx.release();
	//    3    9:aload_0         
	//    4   10:getfield        #155 <Field zzabq zzaAx>
	//    5   13:invokevirtual   #466 <Method void zzabq.release()>
		if(zzaAk != null)
	//*   6   16:aload_0         
	//*   7   17:getfield        #80  <Field zzaau zzaAk>
	//*   8   20:ifnull          32
			zzaAk.disconnect();
	//    9   23:aload_0         
	//   10   24:getfield        #80  <Field zzaau zzaAk>
	//   11   27:invokeinterface #468 <Method void zzaau.disconnect()>
		zzaAt.release();
	//   12   32:aload_0         
	//   13   33:getfield        #103 <Field zzaba zzaAt>
	//   14   36:invokevirtual   #469 <Method void zzaba.release()>
		zzzv.zza zza1;
		for(Iterator iterator = zzaAl.iterator(); iterator.hasNext(); zza1.cancel())
	//*  15   39:aload_0         
	//*  16   40:getfield        #85  <Field Queue zzaAl>
	//*  17   43:invokeinterface #472 <Method Iterator Queue.iterator()>
	//*  18   48:astore_1        
	//*  19   49:aload_1         
	//*  20   50:invokeinterface #167 <Method boolean Iterator.hasNext()>
	//*  21   55:ifeq            92
		{
			zza1 = (zzzv.zza)iterator.next();
	//   22   58:aload_1         
	//   23   59:invokeinterface #171 <Method Object Iterator.next()>
	//   24   64:checkcast       #474 <Class zzzv$zza>
	//   25   67:astore_2        
			zza1.zza(((zzabq.zzb) (null)));
	//   26   68:aload_2         
	//   27   69:aconst_null     
	//   28   70:invokevirtual   #477 <Method void zzzv$zza.zza(zzabq$zzb)>
		}

	//   29   73:aload_2         
	//   30   74:invokevirtual   #480 <Method void zzzv$zza.cancel()>
		break MISSING_BLOCK_LABEL_92;
	//   31   77:goto            49
		Exception exception;
		exception;
	//   32   80:astore_1        
		zzazn.unlock();
	//   33   81:aload_0         
	//   34   82:getfield        #116 <Field Lock zzazn>
	//   35   85:invokeinterface #205 <Method void Lock.unlock()>
		throw exception;
	//   36   90:aload_1         
	//   37   91:athrow          
		zzaau zzaau1;
		zzaAl.clear();
	//   38   92:aload_0         
	//   39   93:getfield        #85  <Field Queue zzaAl>
	//   40   96:invokeinterface #483 <Method void Queue.clear()>
		zzaau1 = zzaAk;
	//   41  101:aload_0         
	//   42  102:getfield        #80  <Field zzaau zzaAk>
	//   43  105:astore_1        
		if(zzaau1 == null)
	//*  44  106:aload_1         
	//*  45  107:ifnonnull       120
		{
			zzazn.unlock();
	//   46  110:aload_0         
	//   47  111:getfield        #116 <Field Lock zzazn>
	//   48  114:invokeinterface #205 <Method void Lock.unlock()>
			return;
	//   49  119:return          
		}
		zzvL();
	//   50  120:aload_0         
	//   51  121:invokevirtual   #349 <Method boolean zzvL()>
	//   52  124:pop             
		zzaAj.zzxq();
	//   53  125:aload_0         
	//   54  126:getfield        #125 <Field zzm zzaAj>
	//   55  129:invokevirtual   #486 <Method void zzm.zzxq()>
		zzazn.unlock();
	//   56  132:aload_0         
	//   57  133:getfield        #116 <Field Lock zzazn>
	//   58  136:invokeinterface #205 <Method void Lock.unlock()>
		return;
	//   59  141:return          
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
		printwriter.append(((CharSequence) (s))).append("mResuming=").print(zzaAm);
	//    8   18:aload_3         
	//    9   19:aload_1         
	//   10   20:invokevirtual   #493 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   11   23:ldc2            #500 <String "mResuming=">
	//   12   26:invokevirtual   #493 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   13   29:aload_0         
	//   14   30:getfield        #502 <Field boolean zzaAm>
	//   15   33:invokevirtual   #506 <Method void PrintWriter.print(boolean)>
		printwriter.append(" mWorkQueue.size()=").print(zzaAl.size());
	//   16   36:aload_3         
	//   17   37:ldc2            #508 <String " mWorkQueue.size()=">
	//   18   40:invokevirtual   #493 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   19   43:aload_0         
	//   20   44:getfield        #85  <Field Queue zzaAl>
	//   21   47:invokeinterface #511 <Method int Queue.size()>
	//   22   52:invokevirtual   #513 <Method void PrintWriter.print(int)>
		zzaAx.dump(printwriter);
	//   23   55:aload_0         
	//   24   56:getfield        #155 <Field zzabq zzaAx>
	//   25   59:aload_3         
	//   26   60:invokevirtual   #516 <Method void zzabq.dump(PrintWriter)>
		if(zzaAk != null)
	//*  27   63:aload_0         
	//*  28   64:getfield        #80  <Field zzaau zzaAk>
	//*  29   67:ifnull          84
			zzaAk.dump(s, filedescriptor, printwriter, as);
	//   30   70:aload_0         
	//   31   71:getfield        #80  <Field zzaau zzaAk>
	//   32   74:aload_1         
	//   33   75:aload_2         
	//   34   76:aload_3         
	//   35   77:aload           4
	//   36   79:invokeinterface #518 <Method void zzaau.dump(String, FileDescriptor, PrintWriter, String[])>
	//   37   84:return          
	}

	public ConnectionResult getConnectionResult(Api api)
	{
		zzazn.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field Lock zzazn>
	//    2    4:invokeinterface #196 <Method void Lock.lock()>
		if(!isConnected() && !isResuming())
	//*   3    9:aload_0         
	//*   4   10:invokevirtual   #390 <Method boolean isConnected()>
	//*   5   13:ifne            46
	//*   6   16:aload_0         
	//*   7   17:invokevirtual   #199 <Method boolean isResuming()>
	//*   8   20:ifne            46
			throw new IllegalStateException("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
	//    9   23:new             #261 <Class IllegalStateException>
	//   10   26:dup             
	//   11   27:ldc2            #522 <String "Cannot invoke getConnectionResult unless GoogleApiClient is connected">
	//   12   30:invokespecial   #266 <Method void IllegalStateException(String)>
	//   13   33:athrow          
		break MISSING_BLOCK_LABEL_46;
		api;
	//   14   34:astore_1        
		zzazn.unlock();
	//   15   35:aload_0         
	//   16   36:getfield        #116 <Field Lock zzazn>
	//   17   39:invokeinterface #205 <Method void Lock.unlock()>
		throw api;
	//   18   44:aload_1         
	//   19   45:athrow          
		ConnectionResult connectionresult;
		if(!zzaAr.containsKey(((Object) (api.zzuH()))))
			break MISSING_BLOCK_LABEL_170;
	//   20   46:aload_0         
	//   21   47:getfield        #146 <Field Map zzaAr>
	//   22   50:aload_1         
	//   23   51:invokevirtual   #528 <Method com.google.android.gms.common.api.Api$zzc Api.zzuH()>
	//   24   54:invokeinterface #407 <Method boolean Map.containsKey(Object)>
	//   25   59:ifeq            170
		connectionresult = zzaAk.getConnectionResult(api);
	//   26   62:aload_0         
	//   27   63:getfield        #80  <Field zzaau zzaAk>
	//   28   66:aload_1         
	//   29   67:invokeinterface #530 <Method ConnectionResult zzaau.getConnectionResult(Api)>
	//   30   72:astore_2        
		if(connectionresult != null)
			break MISSING_BLOCK_LABEL_159;
	//   31   73:aload_2         
	//   32   74:ifnonnull       159
		if(!isResuming())
			break MISSING_BLOCK_LABEL_99;
	//   33   77:aload_0         
	//   34   78:invokevirtual   #199 <Method boolean isResuming()>
	//   35   81:ifeq            99
		api = ((Api) (ConnectionResult.zzawX));
	//   36   84:getstatic       #536 <Field ConnectionResult ConnectionResult.zzawX>
	//   37   87:astore_1        
		zzazn.unlock();
	//   38   88:aload_0         
	//   39   89:getfield        #116 <Field Lock zzazn>
	//   40   92:invokeinterface #205 <Method void Lock.unlock()>
		return ((ConnectionResult) (api));
	//   41   97:aload_1         
	//   42   98:areturn         
		Log.w("GoogleApiClientImpl", zzvN());
	//   43   99:ldc2            #538 <String "GoogleApiClientImpl">
	//   44  102:aload_0         
	//   45  103:invokevirtual   #541 <Method String zzvN()>
	//   46  106:invokestatic    #547 <Method int Log.w(String, String)>
	//   47  109:pop             
		Log.wtf("GoogleApiClientImpl", String.valueOf(((Object) (api.getName()))).concat(" requested in getConnectionResult is not connected but is not present in the failed  connections map"), ((Throwable) (new Exception())));
	//   48  110:ldc2            #538 <String "GoogleApiClientImpl">
	//   49  113:aload_1         
	//   50  114:invokevirtual   #550 <Method String Api.getName()>
	//   51  117:invokestatic    #283 <Method String String.valueOf(Object)>
	//   52  120:ldc2            #552 <String " requested in getConnectionResult is not connected but is not present in the failed  connections map">
	//   53  123:invokevirtual   #556 <Method String String.concat(String)>
	//   54  126:new             #558 <Class Exception>
	//   55  129:dup             
	//   56  130:invokespecial   #559 <Method void Exception()>
	//   57  133:invokestatic    #563 <Method int Log.wtf(String, String, Throwable)>
	//   58  136:pop             
		api = ((Api) (new ConnectionResult(8, ((android.app.PendingIntent) (null)))));
	//   59  137:new             #532 <Class ConnectionResult>
	//   60  140:dup             
	//   61  141:bipush          8
	//   62  143:aconst_null     
	//   63  144:invokespecial   #566 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//   64  147:astore_1        
		zzazn.unlock();
	//   65  148:aload_0         
	//   66  149:getfield        #116 <Field Lock zzazn>
	//   67  152:invokeinterface #205 <Method void Lock.unlock()>
		return ((ConnectionResult) (api));
	//   68  157:aload_1         
	//   69  158:areturn         
		zzazn.unlock();
	//   70  159:aload_0         
	//   71  160:getfield        #116 <Field Lock zzazn>
	//   72  163:invokeinterface #205 <Method void Lock.unlock()>
		return connectionresult;
	//   73  168:aload_2         
	//   74  169:areturn         
		throw new IllegalArgumentException(String.valueOf(((Object) (api.getName()))).concat(" was never registered with GoogleApiClient"));
	//   75  170:new             #568 <Class IllegalArgumentException>
	//   76  173:dup             
	//   77  174:aload_1         
	//   78  175:invokevirtual   #550 <Method String Api.getName()>
	//   79  178:invokestatic    #283 <Method String String.valueOf(Object)>
	//   80  181:ldc2            #570 <String " was never registered with GoogleApiClient">
	//   81  184:invokevirtual   #556 <Method String String.concat(String)>
	//   82  187:invokespecial   #571 <Method void IllegalArgumentException(String)>
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
		return zzrx;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field Looper zzrx>
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
		api = ((Api) ((com.google.android.gms.common.api.Api.zze)zzaAr.get(((Object) (api.zzuH())))));
	//    5    9:aload_0         
	//    6   10:getfield        #146 <Field Map zzaAr>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #528 <Method com.google.android.gms.common.api.Api$zzc Api.zzuH()>
	//    9   17:invokeinterface #589 <Method Object Map.get(Object)>
	//   10   22:checkcast       #211 <Class com.google.android.gms.common.api.Api$zze>
	//   11   25:astore_1        
		boolean flag;
		if(api != null && ((com.google.android.gms.common.api.Api.zze) (api)).isConnected())
	//*  12   26:aload_1         
	//*  13   27:ifnull          43
	//*  14   30:aload_1         
	//*  15   31:invokeinterface #590 <Method boolean com.google.android.gms.common.api.Api$zze.isConnected()>
	//*  16   36:ifeq            43
			flag = true;
	//   17   39:iconst_1        
	//   18   40:istore_2        
		else
	//*  19   41:iload_2         
	//*  20   42:ireturn         
			flag = false;
	//   21   43:iconst_0        
	//   22   44:istore_2        
		return flag;
	//*  23   45:goto            41
	}

	public boolean isConnected()
	{
		return zzaAk != null && zzaAk.isConnected();
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field zzaau zzaAk>
	//    2    4:ifnull          21
	//    3    7:aload_0         
	//    4    8:getfield        #80  <Field zzaau zzaAk>
	//    5   11:invokeinterface #592 <Method boolean zzaau.isConnected()>
	//    6   16:ifeq            21
	//    7   19:iconst_1        
	//    8   20:ireturn         
	//    9   21:iconst_0        
	//   10   22:ireturn         
	}

	public boolean isConnecting()
	{
		return zzaAk != null && zzaAk.isConnecting();
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field zzaau zzaAk>
	//    2    4:ifnull          21
	//    3    7:aload_0         
	//    4    8:getfield        #80  <Field zzaau zzaAk>
	//    5   11:invokeinterface #595 <Method boolean zzaau.isConnecting()>
	//    6   16:ifeq            21
	//    7   19:iconst_1        
	//    8   20:ireturn         
	//    9   21:iconst_0        
	//   10   22:ireturn         
	}

	public boolean isConnectionCallbacksRegistered(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
	{
		return zzaAj.isConnectionCallbacksRegistered(connectioncallbacks);
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field zzm zzaAj>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #599 <Method boolean zzm.isConnectionCallbacksRegistered(com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks)>
	//    4    8:ireturn         
	}

	public boolean isConnectionFailedListenerRegistered(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		return zzaAj.isConnectionFailedListenerRegistered(onconnectionfailedlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field zzm zzaAj>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #603 <Method boolean zzm.isConnectionFailedListenerRegistered(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//    4    8:ireturn         
	}

	boolean isResuming()
	{
		return zzaAm;
	//    0    0:aload_0         
	//    1    1:getfield        #502 <Field boolean zzaAm>
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
		zzaAj.registerConnectionCallbacks(connectioncallbacks);
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field zzm zzaAj>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #177 <Method void zzm.registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks)>
	//    4    8:return          
	}

	public void registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		zzaAj.registerConnectionFailedListener(onconnectionfailedlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field zzm zzaAj>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #183 <Method void zzm.registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//    4    8:return          
	}

	public void stopAutoManage(FragmentActivity fragmentactivity)
	{
		zzb(new zzaav(((android.app.Activity) (fragmentactivity))));
	//    0    0:aload_0         
	//    1    1:new             #610 <Class zzaav>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #613 <Method void zzaav(android.app.Activity)>
	//    5    9:invokespecial   #615 <Method void zzb(zzaav)>
	//    6   12:return          
	}

	public void unregisterConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
	{
		zzaAj.unregisterConnectionCallbacks(connectioncallbacks);
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field zzm zzaAj>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #618 <Method void zzm.unregisterConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks)>
	//    4    8:return          
	}

	public void unregisterConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		zzaAj.unregisterConnectionFailedListener(onconnectionfailedlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field zzm zzaAj>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #621 <Method void zzm.unregisterConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//    4    8:return          
	}

	public com.google.android.gms.common.api.Api.zze zza(com.google.android.gms.common.api.Api.zzc zzc1)
	{
		zzc1 = ((com.google.android.gms.common.api.Api.zzc) ((com.google.android.gms.common.api.Api.zze)zzaAr.get(((Object) (zzc1)))));
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field Map zzaAr>
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

	public zzzv.zza zza(zzzv.zza zza1)
	{
		boolean flag;
		String s;
		if(zza1.zzuH() != null)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #627 <Method com.google.android.gms.common.api.Api$zzc zzzv$zza.zzuH()>
	//*   2    4:ifnull          123
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:iload_2         
	//*   6   10:ldc2            #629 <String "This task can not be enqueued (it's probably a Batch or malformed)">
	//*   7   13:invokestatic    #462 <Method void zzac.zzb(boolean, Object)>
	//*   8   16:aload_0         
	//*   9   17:getfield        #146 <Field Map zzaAr>
	//*  10   20:aload_1         
	//*  11   21:invokevirtual   #627 <Method com.google.android.gms.common.api.Api$zzc zzzv$zza.zzuH()>
	//*  12   24:invokeinterface #407 <Method boolean Map.containsKey(Object)>
	//*  13   29:istore_2        
	//*  14   30:aload_1         
	//*  15   31:invokevirtual   #633 <Method Api zzzv$zza.getApi()>
	//*  16   34:ifnull          128
	//*  17   37:aload_1         
	//*  18   38:invokevirtual   #633 <Method Api zzzv$zza.getApi()>
	//*  19   41:invokevirtual   #550 <Method String Api.getName()>
	//*  20   44:astore_3        
	//*  21   45:iload_2         
	//*  22   46:new             #285 <Class StringBuilder>
	//*  23   49:dup             
	//*  24   50:aload_3         
	//*  25   51:invokestatic    #283 <Method String String.valueOf(Object)>
	//*  26   54:invokevirtual   #288 <Method int String.length()>
	//*  27   57:bipush          65
	//*  28   59:iadd            
	//*  29   60:invokespecial   #290 <Method void StringBuilder(int)>
	//*  30   63:ldc2            #635 <String "GoogleApiClient is not configured to use ">
	//*  31   66:invokevirtual   #296 <Method StringBuilder StringBuilder.append(String)>
	//*  32   69:aload_3         
	//*  33   70:invokevirtual   #296 <Method StringBuilder StringBuilder.append(String)>
	//*  34   73:ldc2            #637 <String " required for this call.">
	//*  35   76:invokevirtual   #296 <Method StringBuilder StringBuilder.append(String)>
	//*  36   79:invokevirtual   #302 <Method String StringBuilder.toString()>
	//*  37   82:invokestatic    #462 <Method void zzac.zzb(boolean, Object)>
	//*  38   85:aload_0         
	//*  39   86:getfield        #116 <Field Lock zzazn>
	//*  40   89:invokeinterface #196 <Method void Lock.lock()>
	//*  41   94:aload_0         
	//*  42   95:getfield        #80  <Field zzaau zzaAk>
	//*  43   98:ifnonnull       135
	//*  44  101:aload_0         
	//*  45  102:getfield        #85  <Field Queue zzaAl>
	//*  46  105:aload_1         
	//*  47  106:invokeinterface #640 <Method boolean Queue.add(Object)>
	//*  48  111:pop             
	//*  49  112:aload_0         
	//*  50  113:getfield        #116 <Field Lock zzazn>
	//*  51  116:invokeinterface #205 <Method void Lock.unlock()>
	//*  52  121:aload_1         
	//*  53  122:areturn         
			flag = false;
	//   54  123:iconst_0        
	//   55  124:istore_2        
		zzac.zzb(flag, "This task can not be enqueued (it's probably a Batch or malformed)");
		flag = zzaAr.containsKey(((Object) (zza1.zzuH())));
		if(zza1.getApi() != null)
			s = zza1.getApi().getName();
		else
	//*  56  125:goto            9
			s = "the API";
	//   57  128:ldc2            #642 <String "the API">
	//   58  131:astore_3        
		zzac.zzb(flag, ((Object) ((new StringBuilder(String.valueOf(((Object) (s))).length() + 65)).append("GoogleApiClient is not configured to use ").append(s).append(" required for this call.").toString())));
		zzazn.lock();
		if(zzaAk != null)
			break MISSING_BLOCK_LABEL_135;
		zzaAl.add(((Object) (zza1)));
		zzazn.unlock();
		return zza1;
	//*  59  132:goto            45
		zza1 = zzaAk.zza(zza1);
	//   60  135:aload_0         
	//   61  136:getfield        #80  <Field zzaau zzaAk>
	//   62  139:aload_1         
	//   63  140:invokeinterface #644 <Method zzzv$zza zzaau.zza(zzzv$zza)>
	//   64  145:astore_1        
		zzazn.unlock();
	//   65  146:aload_0         
	//   66  147:getfield        #116 <Field Lock zzazn>
	//   67  150:invokeinterface #205 <Method void Lock.unlock()>
		return zza1;
	//   68  155:aload_1         
	//   69  156:areturn         
		zza1;
	//   70  157:astore_1        
		zzazn.unlock();
	//   71  158:aload_0         
	//   72  159:getfield        #116 <Field Lock zzazn>
	//   73  162:invokeinterface #205 <Method void Lock.unlock()>
		throw zza1;
	//   74  167:aload_1         
	//   75  168:athrow          
	}

	public void zza(zzabp zzabp)
	{
		zzazn.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field Lock zzazn>
	//    2    4:invokeinterface #196 <Method void Lock.lock()>
		if(zzaAw == null)
	//*   3    9:aload_0         
	//*   4   10:getfield        #107 <Field Set zzaAw>
	//*   5   13:ifnonnull       27
			zzaAw = ((Set) (new HashSet()));
	//    6   16:aload_0         
	//    7   17:new             #95  <Class HashSet>
	//    8   20:dup             
	//    9   21:invokespecial   #96  <Method void HashSet()>
	//   10   24:putfield        #107 <Field Set zzaAw>
		zzaAw.add(((Object) (zzabp)));
	//   11   27:aload_0         
	//   12   28:getfield        #107 <Field Set zzaAw>
	//   13   31:aload_1         
	//   14   32:invokeinterface #649 <Method boolean Set.add(Object)>
	//   15   37:pop             
		zzazn.unlock();
	//   16   38:aload_0         
	//   17   39:getfield        #116 <Field Lock zzazn>
	//   18   42:invokeinterface #205 <Method void Lock.unlock()>
		return;
	//   19   47:return          
		zzabp;
	//   20   48:astore_1        
		zzazn.unlock();
	//   21   49:aload_0         
	//   22   50:getfield        #116 <Field Lock zzazn>
	//   23   53:invokeinterface #205 <Method void Lock.unlock()>
		throw zzabp;
	//   24   58:aload_1         
	//   25   59:athrow          
	}

	public boolean zza(Api api)
	{
		return zzaAr.containsKey(((Object) (api.zzuH())));
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field Map zzaAr>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #528 <Method com.google.android.gms.common.api.Api$zzc Api.zzuH()>
	//    4    8:invokeinterface #407 <Method boolean Map.containsKey(Object)>
	//    5   13:ireturn         
	}

	public boolean zza(zzabi zzabi)
	{
		return zzaAk != null && zzaAk.zza(zzabi);
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field zzaau zzaAk>
	//    2    4:ifnull          22
	//    3    7:aload_0         
	//    4    8:getfield        #80  <Field zzaau zzaAk>
	//    5   11:aload_1         
	//    6   12:invokeinterface #652 <Method boolean zzaau.zza(zzabi)>
	//    7   17:ifeq            22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	com.google.android.gms.common.api.Api.zze zzb(com.google.android.gms.common.api.Api.zzc zzc1)
	{
		zzc1 = ((com.google.android.gms.common.api.Api.zzc) ((com.google.android.gms.common.api.Api.zze)zzaAr.get(((Object) (zzc1)))));
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field Map zzaAr>
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

	public zzzv.zza zzb(zzzv.zza zza1)
	{
		boolean flag;
		String s;
		if(zza1.zzuH() != null)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #627 <Method com.google.android.gms.common.api.Api$zzc zzzv$zza.zzuH()>
	//*   2    4:ifnull          124
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:iload_2         
	//*   6   10:ldc2            #655 <String "This task can not be executed (it's probably a Batch or malformed)">
	//*   7   13:invokestatic    #462 <Method void zzac.zzb(boolean, Object)>
	//*   8   16:aload_0         
	//*   9   17:getfield        #146 <Field Map zzaAr>
	//*  10   20:aload_1         
	//*  11   21:invokevirtual   #627 <Method com.google.android.gms.common.api.Api$zzc zzzv$zza.zzuH()>
	//*  12   24:invokeinterface #407 <Method boolean Map.containsKey(Object)>
	//*  13   29:istore_2        
	//*  14   30:aload_1         
	//*  15   31:invokevirtual   #633 <Method Api zzzv$zza.getApi()>
	//*  16   34:ifnull          129
	//*  17   37:aload_1         
	//*  18   38:invokevirtual   #633 <Method Api zzzv$zza.getApi()>
	//*  19   41:invokevirtual   #550 <Method String Api.getName()>
	//*  20   44:astore_3        
	//*  21   45:iload_2         
	//*  22   46:new             #285 <Class StringBuilder>
	//*  23   49:dup             
	//*  24   50:aload_3         
	//*  25   51:invokestatic    #283 <Method String String.valueOf(Object)>
	//*  26   54:invokevirtual   #288 <Method int String.length()>
	//*  27   57:bipush          65
	//*  28   59:iadd            
	//*  29   60:invokespecial   #290 <Method void StringBuilder(int)>
	//*  30   63:ldc2            #635 <String "GoogleApiClient is not configured to use ">
	//*  31   66:invokevirtual   #296 <Method StringBuilder StringBuilder.append(String)>
	//*  32   69:aload_3         
	//*  33   70:invokevirtual   #296 <Method StringBuilder StringBuilder.append(String)>
	//*  34   73:ldc2            #637 <String " required for this call.">
	//*  35   76:invokevirtual   #296 <Method StringBuilder StringBuilder.append(String)>
	//*  36   79:invokevirtual   #302 <Method String StringBuilder.toString()>
	//*  37   82:invokestatic    #462 <Method void zzac.zzb(boolean, Object)>
	//*  38   85:aload_0         
	//*  39   86:getfield        #116 <Field Lock zzazn>
	//*  40   89:invokeinterface #196 <Method void Lock.lock()>
	//*  41   94:aload_0         
	//*  42   95:getfield        #80  <Field zzaau zzaAk>
	//*  43   98:ifnonnull       136
	//*  44  101:new             #261 <Class IllegalStateException>
	//*  45  104:dup             
	//*  46  105:ldc2            #392 <String "GoogleApiClient is not connected yet.">
	//*  47  108:invokespecial   #266 <Method void IllegalStateException(String)>
	//*  48  111:athrow          
	//*  49  112:astore_1        
	//*  50  113:aload_0         
	//*  51  114:getfield        #116 <Field Lock zzazn>
	//*  52  117:invokeinterface #205 <Method void Lock.unlock()>
	//*  53  122:aload_1         
	//*  54  123:athrow          
			flag = false;
	//   55  124:iconst_0        
	//   56  125:istore_2        
		zzac.zzb(flag, "This task can not be executed (it's probably a Batch or malformed)");
		flag = zzaAr.containsKey(((Object) (zza1.zzuH())));
		if(zza1.getApi() != null)
			s = zza1.getApi().getName();
		else
	//*  57  126:goto            9
			s = "the API";
	//   58  129:ldc2            #642 <String "the API">
	//   59  132:astore_3        
		zzac.zzb(flag, ((Object) ((new StringBuilder(String.valueOf(((Object) (s))).length() + 65)).append("GoogleApiClient is not configured to use ").append(s).append(" required for this call.").toString())));
		zzazn.lock();
		if(zzaAk == null)
			throw new IllegalStateException("GoogleApiClient is not connected yet.");
		break MISSING_BLOCK_LABEL_136;
		zza1;
		zzazn.unlock();
		throw zza1;
	//*  60  133:goto            45
		if(!isResuming())
			break MISSING_BLOCK_LABEL_208;
	//   61  136:aload_0         
	//   62  137:invokevirtual   #199 <Method boolean isResuming()>
	//   63  140:ifeq            208
		zzaAl.add(((Object) (zza1)));
	//   64  143:aload_0         
	//   65  144:getfield        #85  <Field Queue zzaAl>
	//   66  147:aload_1         
	//   67  148:invokeinterface #640 <Method boolean Queue.add(Object)>
	//   68  153:pop             
		zzzv.zza zza2;
		for(; !zzaAl.isEmpty(); zza2.zzA(Status.zzayj))
	//*  69  154:aload_0         
	//*  70  155:getfield        #85  <Field Queue zzaAl>
	//*  71  158:invokeinterface #658 <Method boolean Queue.isEmpty()>
	//*  72  163:ifne            197
		{
			zza2 = (zzzv.zza)zzaAl.remove();
	//   73  166:aload_0         
	//   74  167:getfield        #85  <Field Queue zzaAl>
	//   75  170:invokeinterface #661 <Method Object Queue.remove()>
	//   76  175:checkcast       #474 <Class zzzv$zza>
	//   77  178:astore_3        
			zzaAx.zzb(((zzzx) (zza2)));
	//   78  179:aload_0         
	//   79  180:getfield        #155 <Field zzabq zzaAx>
	//   80  183:aload_3         
	//   81  184:invokevirtual   #664 <Method void zzabq.zzb(zzzx)>
		}

	//   82  187:aload_3         
	//   83  188:getstatic       #670 <Field Status Status.zzayj>
	//   84  191:invokevirtual   #674 <Method void zzzv$zza.zzA(Status)>
	//*  85  194:goto            154
		zzazn.unlock();
	//   86  197:aload_0         
	//   87  198:getfield        #116 <Field Lock zzazn>
	//   88  201:invokeinterface #205 <Method void Lock.unlock()>
		return zza1;
	//   89  206:aload_1         
	//   90  207:areturn         
		zza1 = zzaAk.zzb(zza1);
	//   91  208:aload_0         
	//   92  209:getfield        #80  <Field zzaau zzaAk>
	//   93  212:aload_1         
	//   94  213:invokeinterface #676 <Method zzzv$zza zzaau.zzb(zzzv$zza)>
	//   95  218:astore_1        
		zzazn.unlock();
	//   96  219:aload_0         
	//   97  220:getfield        #116 <Field Lock zzazn>
	//   98  223:invokeinterface #205 <Method void Lock.unlock()>
		return zza1;
	//   99  228:aload_1         
	//  100  229:areturn         
	}

	public void zzb(zzabp zzabp)
	{
		zzazn.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field Lock zzazn>
	//    2    4:invokeinterface #196 <Method void Lock.lock()>
		if(zzaAw != null) goto _L2; else goto _L1
	//    3    9:aload_0         
	//    4   10:getfield        #107 <Field Set zzaAw>
	//    5   13:ifnonnull       43
_L1:
		Log.wtf("GoogleApiClientImpl", "Attempted to remove pending transform when no transforms are registered.", ((Throwable) (new Exception())));
	//    6   16:ldc2            #538 <String "GoogleApiClientImpl">
	//    7   19:ldc2            #679 <String "Attempted to remove pending transform when no transforms are registered.">
	//    8   22:new             #558 <Class Exception>
	//    9   25:dup             
	//   10   26:invokespecial   #559 <Method void Exception()>
	//   11   29:invokestatic    #563 <Method int Log.wtf(String, String, Throwable)>
	//   12   32:pop             
_L5:
		zzazn.unlock();
	//   13   33:aload_0         
	//   14   34:getfield        #116 <Field Lock zzazn>
	//   15   37:invokeinterface #205 <Method void Lock.unlock()>
		return;
	//   16   42:return          
_L2:
		if(zzaAw.remove(((Object) (zzabp)))) goto _L4; else goto _L3
	//   17   43:aload_0         
	//   18   44:getfield        #107 <Field Set zzaAw>
	//   19   47:aload_1         
	//   20   48:invokeinterface #681 <Method boolean Set.remove(Object)>
	//   21   53:ifne            88
_L3:
		Log.wtf("GoogleApiClientImpl", "Failed to remove pending transform - this may lead to memory leaks!", ((Throwable) (new Exception())));
	//   22   56:ldc2            #538 <String "GoogleApiClientImpl">
	//   23   59:ldc2            #683 <String "Failed to remove pending transform - this may lead to memory leaks!">
	//   24   62:new             #558 <Class Exception>
	//   25   65:dup             
	//   26   66:invokespecial   #559 <Method void Exception()>
	//   27   69:invokestatic    #563 <Method int Log.wtf(String, String, Throwable)>
	//   28   72:pop             
		  goto _L5
	//*  29   73:goto            33
		zzabp;
	//   30   76:astore_1        
		zzazn.unlock();
	//   31   77:aload_0         
	//   32   78:getfield        #116 <Field Lock zzazn>
	//   33   81:invokeinterface #205 <Method void Lock.unlock()>
		throw zzabp;
	//   34   86:aload_1         
	//   35   87:athrow          
_L4:
		if(zzvM()) goto _L5; else goto _L6
	//   36   88:aload_0         
	//   37   89:invokevirtual   #686 <Method boolean zzvM()>
	//   38   92:ifne            33
_L6:
		zzaAk.zzvj();
	//   39   95:aload_0         
	//   40   96:getfield        #80  <Field zzaau zzaAk>
	//   41   99:invokeinterface #689 <Method void zzaau.zzvj()>
		  goto _L5
	//*  42  104:goto            33
	}

	public void zzc(int i, boolean flag)
	{
		if(i == 1 && !flag)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          13
	//*   3    5:iload_2         
	//*   4    6:ifne            13
			zzvK();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #693 <Method void zzvK()>
		zzaAx.zzww();
	//    7   13:aload_0         
	//    8   14:getfield        #155 <Field zzabq zzaAx>
	//    9   17:invokevirtual   #696 <Method void zzabq.zzww()>
		zzaAj.zzcP(i);
	//   10   20:aload_0         
	//   11   21:getfield        #125 <Field zzm zzaAj>
	//   12   24:iload_1         
	//   13   25:invokevirtual   #699 <Method void zzm.zzcP(int)>
		zzaAj.zzxq();
	//   14   28:aload_0         
	//   15   29:getfield        #125 <Field zzm zzaAj>
	//   16   32:invokevirtual   #486 <Method void zzm.zzxq()>
		if(i == 2)
	//*  17   35:iload_1         
	//*  18   36:iconst_2        
	//*  19   37:icmpne          44
			zzvI();
	//   20   40:aload_0         
	//   21   41:invokespecial   #202 <Method void zzvI()>
	//   22   44:return          
	}

	public void zzc(ConnectionResult connectionresult)
	{
		if(!zzaxX.zzd(mContext, connectionresult.getErrorCode()))
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field GoogleApiAvailability zzaxX>
	//*   2    4:aload_0         
	//*   3    5:getfield        #114 <Field Context mContext>
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #703 <Method int ConnectionResult.getErrorCode()>
	//*   6   12:invokevirtual   #709 <Method boolean GoogleApiAvailability.zzd(Context, int)>
	//*   7   15:ifne            23
			zzvL();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #349 <Method boolean zzvL()>
	//   10   22:pop             
		if(!isResuming())
	//*  11   23:aload_0         
	//*  12   24:invokevirtual   #199 <Method boolean isResuming()>
	//*  13   27:ifne            45
		{
			zzaAj.zzo(connectionresult);
	//   14   30:aload_0         
	//   15   31:getfield        #125 <Field zzm zzaAj>
	//   16   34:aload_1         
	//   17   35:invokevirtual   #712 <Method void zzm.zzo(ConnectionResult)>
			zzaAj.zzxq();
	//   18   38:aload_0         
	//   19   39:getfield        #125 <Field zzm zzaAj>
	//   20   42:invokevirtual   #486 <Method void zzm.zzxq()>
		}
	//   21   45:return          
	}

	public void zzo(Bundle bundle)
	{
		for(; !zzaAl.isEmpty(); zzb((zzzv.zza)zzaAl.remove()));
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field Queue zzaAl>
	//    2    4:invokeinterface #658 <Method boolean Queue.isEmpty()>
	//    3    9:ifne            32
	//    4   12:aload_0         
	//    5   13:aload_0         
	//    6   14:getfield        #85  <Field Queue zzaAl>
	//    7   17:invokeinterface #661 <Method Object Queue.remove()>
	//    8   22:checkcast       #474 <Class zzzv$zza>
	//    9   25:invokevirtual   #714 <Method zzzv$zza zzb(zzzv$zza)>
	//   10   28:pop             
	//*  11   29:goto            0
		zzaAj.zzq(bundle);
	//   12   32:aload_0         
	//   13   33:getfield        #125 <Field zzm zzaAj>
	//   14   36:aload_1         
	//   15   37:invokevirtual   #717 <Method void zzm.zzq(Bundle)>
	//   16   40:return          
	}

	public zzaaz zzr(Object obj)
	{
		zzazn.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field Lock zzazn>
	//    2    4:invokeinterface #196 <Method void Lock.lock()>
		obj = ((Object) (zzaAt.zzb(obj, zzrx)));
	//    3    9:aload_0         
	//    4   10:getfield        #103 <Field zzaba zzaAt>
	//    5   13:aload_1         
	//    6   14:aload_0         
	//    7   15:getfield        #127 <Field Looper zzrx>
	//    8   18:invokevirtual   #722 <Method zzaaz zzaba.zzb(Object, Looper)>
	//    9   21:astore_1        
		zzazn.unlock();
	//   10   22:aload_0         
	//   11   23:getfield        #116 <Field Lock zzazn>
	//   12   26:invokeinterface #205 <Method void Lock.unlock()>
		return ((zzaaz) (obj));
	//   13   31:aload_1         
	//   14   32:areturn         
		obj;
	//   15   33:astore_1        
		zzazn.unlock();
	//   16   34:aload_0         
	//   17   35:getfield        #116 <Field Lock zzazn>
	//   18   38:invokeinterface #205 <Method void Lock.unlock()>
		throw obj;
	//   19   43:aload_1         
	//   20   44:athrow          
	}

	public void zzuN()
	{
		if(zzaAk != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #80  <Field zzaau zzaAk>
	//*   2    4:ifnull          16
			zzaAk.zzuN();
	//    3    7:aload_0         
	//    4    8:getfield        #80  <Field zzaau zzaAk>
	//    5   11:invokeinterface #726 <Method void zzaau.zzuN()>
	//    6   16:return          
	}

	void zzvK()
	{
		if(isResuming())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #199 <Method boolean isResuming()>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		zzaAm = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #502 <Field boolean zzaAm>
		if(zzaAq == null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #728 <Field zzaar zzaAq>
	//*   9   17:ifnonnull       46
			zzaAq = zzaxX.zza(mContext.getApplicationContext(), ((zzaar.zza) (new zzb(this))));
	//   10   20:aload_0         
	//   11   21:aload_0         
	//   12   22:getfield        #134 <Field GoogleApiAvailability zzaxX>
	//   13   25:aload_0         
	//   14   26:getfield        #114 <Field Context mContext>
	//   15   29:invokevirtual   #733 <Method Context Context.getApplicationContext()>
	//   16   32:new             #19  <Class zzaal$zzb>
	//   17   35:dup             
	//   18   36:aload_0         
	//   19   37:invokespecial   #734 <Method void zzaal$zzb(zzaal)>
	//   20   40:invokevirtual   #737 <Method zzaar GoogleApiAvailability.zza(Context, zzaar$zza)>
	//   21   43:putfield        #728 <Field zzaar zzaAq>
		zzaAp.sendMessageDelayed(zzaAp.obtainMessage(1), zzaAn);
	//   22   46:aload_0         
	//   23   47:getfield        #132 <Field zzaal$zza zzaAp>
	//   24   50:aload_0         
	//   25   51:getfield        #132 <Field zzaal$zza zzaAp>
	//   26   54:iconst_1        
	//   27   55:invokevirtual   #741 <Method Message zzaal$zza.obtainMessage(int)>
	//   28   58:aload_0         
	//   29   59:getfield        #89  <Field long zzaAn>
	//   30   62:invokevirtual   #745 <Method boolean zzaal$zza.sendMessageDelayed(Message, long)>
	//   31   65:pop             
		zzaAp.sendMessageDelayed(zzaAp.obtainMessage(2), zzaAo);
	//   32   66:aload_0         
	//   33   67:getfield        #132 <Field zzaal$zza zzaAp>
	//   34   70:aload_0         
	//   35   71:getfield        #132 <Field zzaal$zza zzaAp>
	//   36   74:iconst_2        
	//   37   75:invokevirtual   #741 <Method Message zzaal$zza.obtainMessage(int)>
	//   38   78:aload_0         
	//   39   79:getfield        #93  <Field long zzaAo>
	//   40   82:invokevirtual   #745 <Method boolean zzaal$zza.sendMessageDelayed(Message, long)>
	//   41   85:pop             
	//   42   86:return          
	}

	boolean zzvL()
	{
		if(!isResuming())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #199 <Method boolean isResuming()>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		zzaAm = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #502 <Field boolean zzaAm>
		zzaAp.removeMessages(2);
	//    8   14:aload_0         
	//    9   15:getfield        #132 <Field zzaal$zza zzaAp>
	//   10   18:iconst_2        
	//   11   19:invokevirtual   #748 <Method void zzaal$zza.removeMessages(int)>
		zzaAp.removeMessages(1);
	//   12   22:aload_0         
	//   13   23:getfield        #132 <Field zzaal$zza zzaAp>
	//   14   26:iconst_1        
	//   15   27:invokevirtual   #748 <Method void zzaal$zza.removeMessages(int)>
		if(zzaAq != null)
	//*  16   30:aload_0         
	//*  17   31:getfield        #728 <Field zzaar zzaAq>
	//*  18   34:ifnull          49
		{
			zzaAq.unregister();
	//   19   37:aload_0         
	//   20   38:getfield        #728 <Field zzaar zzaAq>
	//   21   41:invokevirtual   #753 <Method void zzaar.unregister()>
			zzaAq = null;
	//   22   44:aload_0         
	//   23   45:aconst_null     
	//   24   46:putfield        #728 <Field zzaar zzaAq>
		}
		return true;
	//   25   49:iconst_1        
	//   26   50:ireturn         
	}

	boolean zzvM()
	{
		boolean flag;
		flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		zzazn.lock();
	//    2    2:aload_0         
	//    3    3:getfield        #116 <Field Lock zzazn>
	//    4    6:invokeinterface #196 <Method void Lock.lock()>
		Set set = zzaAw;
	//    5   11:aload_0         
	//    6   12:getfield        #107 <Field Set zzaAw>
	//    7   15:astore_3        
		if(set == null)
	//*   8   16:aload_3         
	//*   9   17:ifnonnull       31
		{
			zzazn.unlock();
	//   10   20:aload_0         
	//   11   21:getfield        #116 <Field Lock zzazn>
	//   12   24:invokeinterface #205 <Method void Lock.unlock()>
			return false;
	//   13   29:iconst_0        
	//   14   30:ireturn         
		}
		boolean flag1 = zzaAw.isEmpty();
	//   15   31:aload_0         
	//   16   32:getfield        #107 <Field Set zzaAw>
	//   17   35:invokeinterface #754 <Method boolean Set.isEmpty()>
	//   18   40:istore_2        
		if(!flag1)
	//*  19   41:iload_2         
	//*  20   42:ifne            47
			flag = true;
	//   21   45:iconst_1        
	//   22   46:istore_1        
		zzazn.unlock();
	//   23   47:aload_0         
	//   24   48:getfield        #116 <Field Lock zzazn>
	//   25   51:invokeinterface #205 <Method void Lock.unlock()>
		return flag;
	//   26   56:iload_1         
	//   27   57:ireturn         
		Exception exception;
		exception;
	//   28   58:astore_3        
		zzazn.unlock();
	//   29   59:aload_0         
	//   30   60:getfield        #116 <Field Lock zzazn>
	//   31   63:invokeinterface #205 <Method void Lock.unlock()>
		throw exception;
	//   32   68:aload_3         
	//   33   69:athrow          
	}

	String zzvN()
	{
		StringWriter stringwriter = new StringWriter();
	//    0    0:new             #756 <Class StringWriter>
	//    1    3:dup             
	//    2    4:invokespecial   #757 <Method void StringWriter()>
	//    3    7:astore_1        
		dump("", ((FileDescriptor) (null)), new PrintWriter(((java.io.Writer) (stringwriter))), ((String []) (null)));
	//    4    8:aload_0         
	//    5    9:ldc2            #759 <String "">
	//    6   12:aconst_null     
	//    7   13:new             #490 <Class PrintWriter>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokespecial   #762 <Method void PrintWriter(java.io.Writer)>
	//   11   21:aconst_null     
	//   12   22:invokevirtual   #763 <Method void dump(String, FileDescriptor, PrintWriter, String[])>
		return stringwriter.toString();
	//   13   25:aload_1         
	//   14   26:invokevirtual   #764 <Method String StringWriter.toString()>
	//   15   29:areturn         
	}

	private final Context mContext;
	private final zzm zzaAj;
	private zzaau zzaAk;
	final Queue zzaAl = new LinkedList();
	private volatile boolean zzaAm;
	private long zzaAn;
	private long zzaAo;
	private final zza zzaAp;
	zzaar zzaAq;
	final Map zzaAr;
	Set zzaAs;
	private final zzaba zzaAt = new zzaba();
	private final ArrayList zzaAu;
	private Integer zzaAv;
	Set zzaAw;
	final zzabq zzaAx;
	private final com.google.android.gms.common.internal.zzm.zza zzaAy = new com.google.android.gms.common.internal.zzm.zza() {

		public boolean isConnected()
		{
			return zzaAz.isConnected();
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field zzaal zzaAz>
		//    2    4:invokevirtual   #22  <Method boolean zzaal.isConnected()>
		//    3    7:ireturn         
		}

		public Bundle zzud()
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		final zzaal zzaAz;

			
			{
				zzaAz = zzaal.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field zzaal zzaAz>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private final int zzaxV;
	private final GoogleApiAvailability zzaxX;
	final com.google.android.gms.common.api.Api.zza zzaxY;
	private boolean zzayb;
	private final Lock zzazn;
	final zzg zzazs;
	final Map zzazu;
	private final Looper zzrx;
}
