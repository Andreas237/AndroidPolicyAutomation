// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.*;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.common.internal.zzs;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.gms.internal:
//			zzabx

public abstract class zzaaf extends PendingResult
{
	public static class zza extends Handler
	{

		public void handleMessage(Message message)
		{
			switch(message.what)
		//*   0    0:aload_1         
		//*   1    1:getfield        #29  <Field int Message.what>
			{
		//*   2    4:lookupswitch    2: default 32
		//		               1: 35
		//		               2: 62
		//*   3   32:goto            76
			case 1: // '\001'
				message = ((Message) ((Pair)message.obj));
		//    4   35:aload_1         
		//    5   36:getfield        #33  <Field Object Message.obj>
		//    6   39:checkcast       #35  <Class Pair>
		//    7   42:astore_1        
				zzb((ResultCallback)((Pair) (message)).first, (Result)((Pair) (message)).second);
		//    8   43:aload_0         
		//    9   44:aload_1         
		//   10   45:getfield        #38  <Field Object Pair.first>
		//   11   48:checkcast       #40  <Class ResultCallback>
		//   12   51:aload_1         
		//   13   52:getfield        #43  <Field Object Pair.second>
		//   14   55:checkcast       #45  <Class Result>
		//   15   58:invokevirtual   #49  <Method void zzb(ResultCallback, Result)>
				return;
		//   16   61:return          

			case 2: // '\002'
				((zzaaf)message.obj).zzC(Status.zzazA);
		//   17   62:aload_1         
		//   18   63:getfield        #33  <Field Object Message.obj>
		//   19   66:checkcast       #7   <Class zzaaf>
		//   20   69:getstatic       #55  <Field Status Status.zzazA>
		//   21   72:invokevirtual   #59  <Method void zzaaf.zzC(Status)>
				return;
		//   22   75:return          
			}
			int i = message.what;
		//   23   76:aload_1         
		//   24   77:getfield        #29  <Field int Message.what>
		//   25   80:istore_2        
			Log.wtf("BasePendingResult", (new StringBuilder(45)).append("Don't know how to handle message: ").append(i).toString(), ((Throwable) (new Exception())));
		//   26   81:ldc1            #61  <String "BasePendingResult">
		//   27   83:new             #63  <Class StringBuilder>
		//   28   86:dup             
		//   29   87:bipush          45
		//   30   89:invokespecial   #66  <Method void StringBuilder(int)>
		//   31   92:ldc1            #68  <String "Don't know how to handle message: ">
		//   32   94:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
		//   33   97:iload_2         
		//   34   98:invokevirtual   #75  <Method StringBuilder StringBuilder.append(int)>
		//   35  101:invokevirtual   #79  <Method String StringBuilder.toString()>
		//   36  104:new             #81  <Class Exception>
		//   37  107:dup             
		//   38  108:invokespecial   #83  <Method void Exception()>
		//   39  111:invokestatic    #89  <Method int Log.wtf(String, String, Throwable)>
		//   40  114:pop             
		//   41  115:return          
		}

		public void zza(ResultCallback resultcallback, Result result)
		{
			sendMessage(obtainMessage(1, ((Object) (new Pair(((Object) (resultcallback)), ((Object) (result)))))));
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:iconst_1        
		//    3    3:new             #35  <Class Pair>
		//    4    6:dup             
		//    5    7:aload_1         
		//    6    8:aload_2         
		//    7    9:invokespecial   #92  <Method void Pair(Object, Object)>
		//    8   12:invokevirtual   #96  <Method Message obtainMessage(int, Object)>
		//    9   15:invokevirtual   #100 <Method boolean sendMessage(Message)>
		//   10   18:pop             
		//   11   19:return          
		}

		public void zza(zzaaf zzaaf1, long l)
		{
			sendMessageDelayed(obtainMessage(2, ((Object) (zzaaf1))), l);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:iconst_2        
		//    3    3:aload_1         
		//    4    4:invokevirtual   #96  <Method Message obtainMessage(int, Object)>
		//    5    7:lload_2         
		//    6    8:invokevirtual   #107 <Method boolean sendMessageDelayed(Message, long)>
		//    7   11:pop             
		//    8   12:return          
		}

		protected void zzb(ResultCallback resultcallback, Result result)
		{
			try
			{
				resultcallback.onResult(result);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokeinterface #114 <Method void ResultCallback.onResult(Result)>
				return;
		//    3    7:return          
			}
			// Misplaced declaration of an exception variable
			catch(ResultCallback resultcallback)
		//*   4    8:astore_1        
			{
				zzaaf.zzd(result);
		//    5    9:aload_2         
		//    6   10:invokestatic    #117 <Method void zzaaf.zzd(Result)>
			}
			throw resultcallback;
		//    7   13:aload_1         
		//    8   14:athrow          
		}

		public void zzvK()
		{
			removeMessages(2);
		//    0    0:aload_0         
		//    1    1:iconst_2        
		//    2    2:invokevirtual   #121 <Method void removeMessages(int)>
		//    3    5:return          
		}

		public zza()
		{
			this(Looper.getMainLooper());
		//    0    0:aload_0         
		//    1    1:invokestatic    #16  <Method Looper Looper.getMainLooper()>
		//    2    4:invokespecial   #19  <Method void zzaaf$zza(Looper)>
		//    3    7:return          
		}

		public zza(Looper looper)
		{
			super(looper);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #21  <Method void Handler(Looper)>
		//    3    5:return          
		}
	}

	final class zzb
	{

		protected void finalize()
			throws Throwable
		{
			zzaaf.zzd(zzaaf.zza(zzaAt));
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field zzaaf zzaAt>
		//    2    4:invokestatic    #27  <Method Result zzaaf.zza(zzaaf)>
		//    3    7:invokestatic    #31  <Method void zzaaf.zzd(Result)>
			super.finalize();
		//    4   10:aload_0         
		//    5   11:invokespecial   #33  <Method void Object.finalize()>
		//    6   14:return          
		}

		final zzaaf zzaAt;

		private zzb()
		{
			zzaAt = zzaaf.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field zzaaf zzaAt>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void Object()>
		//    5    9:return          
		}

	}


	zzaaf()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #62  <Method void PendingResult()>
		zzaAh = new Object();
	//    2    4:aload_0         
	//    3    5:new             #64  <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #65  <Method void Object()>
	//    6   12:putfield        #67  <Field Object zzaAh>
		zztj = new CountDownLatch(1);
	//    7   15:aload_0         
	//    8   16:new             #69  <Class CountDownLatch>
	//    9   19:dup             
	//   10   20:iconst_1        
	//   11   21:invokespecial   #72  <Method void CountDownLatch(int)>
	//   12   24:putfield        #74  <Field CountDownLatch zztj>
		zzaAk = new ArrayList();
	//   13   27:aload_0         
	//   14   28:new             #76  <Class ArrayList>
	//   15   31:dup             
	//   16   32:invokespecial   #77  <Method void ArrayList()>
	//   17   35:putfield        #79  <Field ArrayList zzaAk>
		zzaAm = new AtomicReference();
	//   18   38:aload_0         
	//   19   39:new             #81  <Class AtomicReference>
	//   20   42:dup             
	//   21   43:invokespecial   #82  <Method void AtomicReference()>
	//   22   46:putfield        #84  <Field AtomicReference zzaAm>
		zzaAs = false;
	//   23   49:aload_0         
	//   24   50:iconst_0        
	//   25   51:putfield        #86  <Field boolean zzaAs>
		zzaAi = new zza(Looper.getMainLooper());
	//   26   54:aload_0         
	//   27   55:new             #9   <Class zzaaf$zza>
	//   28   58:dup             
	//   29   59:invokestatic    #92  <Method Looper Looper.getMainLooper()>
	//   30   62:invokespecial   #95  <Method void zzaaf$zza(Looper)>
	//   31   65:putfield        #97  <Field zzaaf$zza zzaAi>
		zzaAj = new WeakReference(((Object) (null)));
	//   32   68:aload_0         
	//   33   69:new             #99  <Class WeakReference>
	//   34   72:dup             
	//   35   73:aconst_null     
	//   36   74:invokespecial   #102 <Method void WeakReference(Object)>
	//   37   77:putfield        #104 <Field WeakReference zzaAj>
	//   38   80:return          
	}

	protected zzaaf(Looper looper)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #62  <Method void PendingResult()>
		zzaAh = new Object();
	//    2    4:aload_0         
	//    3    5:new             #64  <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #65  <Method void Object()>
	//    6   12:putfield        #67  <Field Object zzaAh>
		zztj = new CountDownLatch(1);
	//    7   15:aload_0         
	//    8   16:new             #69  <Class CountDownLatch>
	//    9   19:dup             
	//   10   20:iconst_1        
	//   11   21:invokespecial   #72  <Method void CountDownLatch(int)>
	//   12   24:putfield        #74  <Field CountDownLatch zztj>
		zzaAk = new ArrayList();
	//   13   27:aload_0         
	//   14   28:new             #76  <Class ArrayList>
	//   15   31:dup             
	//   16   32:invokespecial   #77  <Method void ArrayList()>
	//   17   35:putfield        #79  <Field ArrayList zzaAk>
		zzaAm = new AtomicReference();
	//   18   38:aload_0         
	//   19   39:new             #81  <Class AtomicReference>
	//   20   42:dup             
	//   21   43:invokespecial   #82  <Method void AtomicReference()>
	//   22   46:putfield        #84  <Field AtomicReference zzaAm>
		zzaAs = false;
	//   23   49:aload_0         
	//   24   50:iconst_0        
	//   25   51:putfield        #86  <Field boolean zzaAs>
		zzaAi = new zza(looper);
	//   26   54:aload_0         
	//   27   55:new             #9   <Class zzaaf$zza>
	//   28   58:dup             
	//   29   59:aload_1         
	//   30   60:invokespecial   #95  <Method void zzaaf$zza(Looper)>
	//   31   63:putfield        #97  <Field zzaaf$zza zzaAi>
		zzaAj = new WeakReference(((Object) (null)));
	//   32   66:aload_0         
	//   33   67:new             #99  <Class WeakReference>
	//   34   70:dup             
	//   35   71:aconst_null     
	//   36   72:invokespecial   #102 <Method void WeakReference(Object)>
	//   37   75:putfield        #104 <Field WeakReference zzaAj>
	//   38   78:return          
	}

	protected zzaaf(GoogleApiClient googleapiclient)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #62  <Method void PendingResult()>
		zzaAh = new Object();
	//    2    4:aload_0         
	//    3    5:new             #64  <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #65  <Method void Object()>
	//    6   12:putfield        #67  <Field Object zzaAh>
		zztj = new CountDownLatch(1);
	//    7   15:aload_0         
	//    8   16:new             #69  <Class CountDownLatch>
	//    9   19:dup             
	//   10   20:iconst_1        
	//   11   21:invokespecial   #72  <Method void CountDownLatch(int)>
	//   12   24:putfield        #74  <Field CountDownLatch zztj>
		zzaAk = new ArrayList();
	//   13   27:aload_0         
	//   14   28:new             #76  <Class ArrayList>
	//   15   31:dup             
	//   16   32:invokespecial   #77  <Method void ArrayList()>
	//   17   35:putfield        #79  <Field ArrayList zzaAk>
		zzaAm = new AtomicReference();
	//   18   38:aload_0         
	//   19   39:new             #81  <Class AtomicReference>
	//   20   42:dup             
	//   21   43:invokespecial   #82  <Method void AtomicReference()>
	//   22   46:putfield        #84  <Field AtomicReference zzaAm>
		zzaAs = false;
	//   23   49:aload_0         
	//   24   50:iconst_0        
	//   25   51:putfield        #86  <Field boolean zzaAs>
		Looper looper;
		if(googleapiclient != null)
	//*  26   54:aload_1         
	//*  27   55:ifnull          66
			looper = googleapiclient.getLooper();
	//   28   58:aload_1         
	//   29   59:invokevirtual   #111 <Method Looper GoogleApiClient.getLooper()>
	//   30   62:astore_2        
		else
	//*  31   63:goto            70
			looper = Looper.getMainLooper();
	//   32   66:invokestatic    #92  <Method Looper Looper.getMainLooper()>
	//   33   69:astore_2        
		zzaAi = new zza(looper);
	//   34   70:aload_0         
	//   35   71:new             #9   <Class zzaaf$zza>
	//   36   74:dup             
	//   37   75:aload_2         
	//   38   76:invokespecial   #95  <Method void zzaaf$zza(Looper)>
	//   39   79:putfield        #97  <Field zzaaf$zza zzaAi>
		zzaAj = new WeakReference(((Object) (googleapiclient)));
	//   40   82:aload_0         
	//   41   83:new             #99  <Class WeakReference>
	//   42   86:dup             
	//   43   87:aload_1         
	//   44   88:invokespecial   #102 <Method void WeakReference(Object)>
	//   45   91:putfield        #104 <Field WeakReference zzaAj>
	//   46   94:return          
	}

	private Result get()
	{
		Object obj = zzaAh;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Object zzaAh>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		boolean flag;
		Object obj1;
		if(!zzaAo)
	//*   5    7:aload_0         
	//*   6    8:getfield        #115 <Field boolean zzaAo>
	//*   7   11:ifne            70
			flag = true;
	//    8   14:iconst_1        
	//    9   15:istore_1        
		else
	//*  10   16:goto            19
	//*  11   19:iload_1         
	//*  12   20:ldc1            #117 <String "Result has already been consumed.">
	//*  13   22:invokestatic    #122 <Method void zzac.zza(boolean, Object)>
	//*  14   25:aload_0         
	//*  15   26:invokevirtual   #126 <Method boolean isReady()>
	//*  16   29:ldc1            #128 <String "Result is not ready.">
	//*  17   31:invokestatic    #122 <Method void zzac.zza(boolean, Object)>
	//*  18   34:aload_0         
	//*  19   35:getfield        #130 <Field Result zzazt>
	//*  20   38:astore_3        
	//*  21   39:aload_0         
	//*  22   40:aconst_null     
	//*  23   41:putfield        #130 <Field Result zzazt>
	//*  24   44:aload_0         
	//*  25   45:aconst_null     
	//*  26   46:putfield        #132 <Field ResultCallback zzaAl>
	//*  27   49:aload_0         
	//*  28   50:iconst_1        
	//*  29   51:putfield        #115 <Field boolean zzaAo>
	//*  30   54:aload_2         
	//*  31   55:monitorexit     
	//*  32   56:goto            64
	//*  33   59:astore_3        
	//*  34   60:aload_2         
	//*  35   61:monitorexit     
	//*  36   62:aload_3         
	//*  37   63:athrow          
	//*  38   64:aload_0         
	//*  39   65:invokespecial   #135 <Method void zzvG()>
	//*  40   68:aload_3         
	//*  41   69:areturn         
			flag = false;
	//   42   70:iconst_0        
	//   43   71:istore_1        
		zzac.zza(flag, "Result has already been consumed.");
		zzac.zza(isReady(), "Result is not ready.");
		obj1 = ((Object) (zzazt));
		zzazt = null;
		zzaAl = null;
		zzaAo = true;
		obj;
		JVM INSTR monitorexit ;
		  goto _L1
		obj1;
		throw obj1;
_L1:
		zzvG();
		return ((Result) (obj1));
	//*  44   72:goto            19
	}

	static Result zza(zzaaf zzaaf1)
	{
		return zzaaf1.zzazt;
	//    0    0:aload_0         
	//    1    1:getfield        #130 <Field Result zzazt>
	//    2    4:areturn         
	}

	private void zzc(Result result)
	{
		zzazt = result;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #130 <Field Result zzazt>
		zzaAq = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #142 <Field zzs zzaAq>
		zztj.countDown();
	//    6   10:aload_0         
	//    7   11:getfield        #74  <Field CountDownLatch zztj>
	//    8   14:invokevirtual   #145 <Method void CountDownLatch.countDown()>
		zzair = zzazt.getStatus();
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #130 <Field Result zzazt>
	//   12   22:invokeinterface #151 <Method Status Result.getStatus()>
	//   13   27:putfield        #153 <Field Status zzair>
		if(zzK)
	//*  14   30:aload_0         
	//*  15   31:getfield        #155 <Field boolean zzK>
	//*  16   34:ifeq            45
			zzaAl = null;
	//   17   37:aload_0         
	//   18   38:aconst_null     
	//   19   39:putfield        #132 <Field ResultCallback zzaAl>
		else
	//*  20   42:goto            100
		if(zzaAl == null)
	//*  21   45:aload_0         
	//*  22   46:getfield        #132 <Field ResultCallback zzaAl>
	//*  23   49:ifnonnull       78
		{
			if(zzazt instanceof Releasable)
	//*  24   52:aload_0         
	//*  25   53:getfield        #130 <Field Result zzazt>
	//*  26   56:instanceof      #157 <Class Releasable>
	//*  27   59:ifeq            100
				zzaAn = new zzb();
	//   28   62:aload_0         
	//   29   63:new             #12  <Class zzaaf$zzb>
	//   30   66:dup             
	//   31   67:aload_0         
	//   32   68:aconst_null     
	//   33   69:invokespecial   #160 <Method void zzaaf$zzb(zzaaf, zzaaf$1)>
	//   34   72:putfield        #162 <Field zzaaf$zzb zzaAn>
		} else
	//*  35   75:goto            100
		{
			zzaAi.zzvK();
	//   36   78:aload_0         
	//   37   79:getfield        #97  <Field zzaaf$zza zzaAi>
	//   38   82:invokevirtual   #165 <Method void zzaaf$zza.zzvK()>
			zzaAi.zza(zzaAl, get());
	//   39   85:aload_0         
	//   40   86:getfield        #97  <Field zzaaf$zza zzaAi>
	//   41   89:aload_0         
	//   42   90:getfield        #132 <Field ResultCallback zzaAl>
	//   43   93:aload_0         
	//   44   94:invokespecial   #167 <Method Result get()>
	//   45   97:invokevirtual   #170 <Method void zzaaf$zza.zza(ResultCallback, Result)>
		}
		for(result = ((Result) (zzaAk.iterator())); ((Iterator) (result)).hasNext(); ((com.google.android.gms.common.api.PendingResult.zza)((Iterator) (result)).next()).zzy(zzair));
	//   46  100:aload_0         
	//   47  101:getfield        #79  <Field ArrayList zzaAk>
	//   48  104:invokevirtual   #174 <Method Iterator ArrayList.iterator()>
	//   49  107:astore_1        
	//   50  108:aload_1         
	//   51  109:invokeinterface #179 <Method boolean Iterator.hasNext()>
	//   52  114:ifeq            138
	//   53  117:aload_1         
	//   54  118:invokeinterface #183 <Method Object Iterator.next()>
	//   55  123:checkcast       #185 <Class com.google.android.gms.common.api.PendingResult$zza>
	//   56  126:aload_0         
	//   57  127:getfield        #153 <Field Status zzair>
	//   58  130:invokeinterface #189 <Method void com.google.android.gms.common.api.PendingResult$zza.zzy(Status)>
	//*  59  135:goto            108
		zzaAk.clear();
	//   60  138:aload_0         
	//   61  139:getfield        #79  <Field ArrayList zzaAk>
	//   62  142:invokevirtual   #192 <Method void ArrayList.clear()>
	//   63  145:return          
	}

	public static void zzd(Result result)
	{
		if(result instanceof Releasable)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #157 <Class Releasable>
	//*   2    4:ifeq            59
			try
			{
				((Releasable)result).release();
	//    3    7:aload_0         
	//    4    8:checkcast       #157 <Class Releasable>
	//    5   11:invokeinterface #199 <Method void Releasable.release()>
				return;
	//    6   16:return          
			}
			catch(RuntimeException runtimeexception)
	//*   7   17:astore_1        
			{
				result = ((Result) (String.valueOf(((Object) (result)))));
	//    8   18:aload_0         
	//    9   19:invokestatic    #205 <Method String String.valueOf(Object)>
	//   10   22:astore_0        
				Log.w("BasePendingResult", (new StringBuilder(String.valueOf(((Object) (result))).length() + 18)).append("Unable to release ").append(((String) (result))).toString(), ((Throwable) (runtimeexception)));
	//   11   23:ldc1            #207 <String "BasePendingResult">
	//   12   25:new             #209 <Class StringBuilder>
	//   13   28:dup             
	//   14   29:aload_0         
	//   15   30:invokestatic    #205 <Method String String.valueOf(Object)>
	//   16   33:invokevirtual   #213 <Method int String.length()>
	//   17   36:bipush          18
	//   18   38:iadd            
	//   19   39:invokespecial   #214 <Method void StringBuilder(int)>
	//   20   42:ldc1            #216 <String "Unable to release ">
	//   21   44:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   22   47:aload_0         
	//   23   48:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   24   51:invokevirtual   #224 <Method String StringBuilder.toString()>
	//   25   54:aload_1         
	//   26   55:invokestatic    #230 <Method int Log.w(String, String, Throwable)>
	//   27   58:pop             
			}
	//   28   59:return          
	}

	private void zzvG()
	{
		zzaby.zzb zzb1 = (zzaby.zzb)zzaAm.getAndSet(((Object) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field AtomicReference zzaAm>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #234 <Method Object AtomicReference.getAndSet(Object)>
	//    4    8:checkcast       #236 <Class zzaby$zzb>
	//    5   11:astore_1        
		if(zzb1 != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          23
			zzb1.zzc(this);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:invokeinterface #239 <Method void zzaby$zzb.zzc(zzaaf)>
	//   11   23:return          
	}

	public final Result await()
	{
		InterruptedException interruptedexception;
		boolean flag;
		if(Looper.myLooper() != Looper.getMainLooper())
	//*   0    0:invokestatic    #245 <Method Looper Looper.myLooper()>
	//*   1    3:invokestatic    #92  <Method Looper Looper.getMainLooper()>
	//*   2    6:if_acmpeq       14
			flag = true;
	//    3    9:iconst_1        
	//    4   10:istore_1        
		else
	//*   5   11:goto            16
			flag = false;
	//    6   14:iconst_0        
	//    7   15:istore_1        
		zzac.zza(flag, "await must not be called on the UI thread");
	//    8   16:iload_1         
	//    9   17:ldc1            #247 <String "await must not be called on the UI thread">
	//   10   19:invokestatic    #122 <Method void zzac.zza(boolean, Object)>
		if(!zzaAo)
	//*  11   22:aload_0         
	//*  12   23:getfield        #115 <Field boolean zzaAo>
	//*  13   26:ifne            34
			flag = true;
	//   14   29:iconst_1        
	//   15   30:istore_1        
		else
	//*  16   31:goto            36
			flag = false;
	//   17   34:iconst_0        
	//   18   35:istore_1        
		zzac.zza(flag, "Result has already been consumed");
	//   19   36:iload_1         
	//   20   37:ldc1            #249 <String "Result has already been consumed">
	//   21   39:invokestatic    #122 <Method void zzac.zza(boolean, Object)>
		if(zzaAr == null)
	//*  22   42:aload_0         
	//*  23   43:getfield        #251 <Field zzabx zzaAr>
	//*  24   46:ifnonnull       54
			flag = true;
	//   25   49:iconst_1        
	//   26   50:istore_1        
		else
	//*  27   51:goto            56
			flag = false;
	//   28   54:iconst_0        
	//   29   55:istore_1        
		zzac.zza(flag, "Cannot await if then() has been called.");
	//   30   56:iload_1         
	//   31   57:ldc1            #253 <String "Cannot await if then() has been called.">
	//   32   59:invokestatic    #122 <Method void zzac.zza(boolean, Object)>
		try
		{
			zztj.await();
	//   33   62:aload_0         
	//   34   63:getfield        #74  <Field CountDownLatch zztj>
	//   35   66:invokevirtual   #255 <Method void CountDownLatch.await()>
		}
	//*  36   69:goto            79
	//*  37   72:aload_0         
	//*  38   73:getstatic       #260 <Field Status Status.zzazy>
	//*  39   76:invokevirtual   #263 <Method void zzC(Status)>
	//*  40   79:aload_0         
	//*  41   80:invokevirtual   #126 <Method boolean isReady()>
	//*  42   83:ldc1            #128 <String "Result is not ready.">
	//*  43   85:invokestatic    #122 <Method void zzac.zza(boolean, Object)>
	//*  44   88:aload_0         
	//*  45   89:invokespecial   #167 <Method Result get()>
	//*  46   92:areturn         
		// Misplaced declaration of an exception variable
		catch(InterruptedException interruptedexception)
		{
			zzC(Status.zzazy);
		}
		zzac.zza(isReady(), "Result is not ready.");
		return get();
	//*  47   93:astore_2        
	//*  48   94:goto            72
	}

	public final Result await(long l, TimeUnit timeunit)
	{
		boolean flag;
		if(l <= 0L || Looper.myLooper() != Looper.getMainLooper())
	//*   0    0:lload_1         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifle            15
	//*   4    6:invokestatic    #245 <Method Looper Looper.myLooper()>
	//*   5    9:invokestatic    #92  <Method Looper Looper.getMainLooper()>
	//*   6   12:if_acmpeq       21
			flag = true;
	//    7   15:iconst_1        
	//    8   16:istore          4
		else
	//*   9   18:goto            24
			flag = false;
	//   10   21:iconst_0        
	//   11   22:istore          4
		zzac.zza(flag, "await must not be called on the UI thread when time is greater than zero.");
	//   12   24:iload           4
	//   13   26:ldc2            #266 <String "await must not be called on the UI thread when time is greater than zero.">
	//   14   29:invokestatic    #122 <Method void zzac.zza(boolean, Object)>
		if(!zzaAo)
	//*  15   32:aload_0         
	//*  16   33:getfield        #115 <Field boolean zzaAo>
	//*  17   36:ifne            45
			flag = true;
	//   18   39:iconst_1        
	//   19   40:istore          4
		else
	//*  20   42:goto            48
			flag = false;
	//   21   45:iconst_0        
	//   22   46:istore          4
		zzac.zza(flag, "Result has already been consumed.");
	//   23   48:iload           4
	//   24   50:ldc1            #117 <String "Result has already been consumed.">
	//   25   52:invokestatic    #122 <Method void zzac.zza(boolean, Object)>
		if(zzaAr == null)
	//*  26   55:aload_0         
	//*  27   56:getfield        #251 <Field zzabx zzaAr>
	//*  28   59:ifnonnull       68
			flag = true;
	//   29   62:iconst_1        
	//   30   63:istore          4
		else
	//*  31   65:goto            71
			flag = false;
	//   32   68:iconst_0        
	//   33   69:istore          4
		zzac.zza(flag, "Cannot await if then() has been called.");
	//   34   71:iload           4
	//   35   73:ldc1            #253 <String "Cannot await if then() has been called.">
	//   36   75:invokestatic    #122 <Method void zzac.zza(boolean, Object)>
		try
		{
			if(!zztj.await(l, timeunit))
	//*  37   78:aload_0         
	//*  38   79:getfield        #74  <Field CountDownLatch zztj>
	//*  39   82:lload_1         
	//*  40   83:aload_3         
	//*  41   84:invokevirtual   #269 <Method boolean CountDownLatch.await(long, TimeUnit)>
	//*  42   87:ifne            97
				zzC(Status.zzazA);
	//   43   90:aload_0         
	//   44   91:getstatic       #272 <Field Status Status.zzazA>
	//   45   94:invokevirtual   #263 <Method void zzC(Status)>
		}
	//*  46   97:goto            107
	//*  47  100:aload_0         
	//*  48  101:getstatic       #260 <Field Status Status.zzazy>
	//*  49  104:invokevirtual   #263 <Method void zzC(Status)>
	//*  50  107:aload_0         
	//*  51  108:invokevirtual   #126 <Method boolean isReady()>
	//*  52  111:ldc1            #128 <String "Result is not ready.">
	//*  53  113:invokestatic    #122 <Method void zzac.zza(boolean, Object)>
	//*  54  116:aload_0         
	//*  55  117:invokespecial   #167 <Method Result get()>
	//*  56  120:areturn         
		// Misplaced declaration of an exception variable
		catch(TimeUnit timeunit)
		{
			zzC(Status.zzazy);
		}
		zzac.zza(isReady(), "Result is not ready.");
		return get();
	//*  57  121:astore_3        
	//*  58  122:goto            100
	}

	public void cancel()
	{
		Object obj = zzaAh;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Object zzaAh>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		boolean flag;
		if(zzK)
			break MISSING_BLOCK_LABEL_23;
	//    5    7:aload_0         
	//    6    8:getfield        #155 <Field boolean zzK>
	//    7   11:ifne            23
		flag = zzaAo;
	//    8   14:aload_0         
	//    9   15:getfield        #115 <Field boolean zzaAo>
	//   10   18:istore_1        
		if(!flag)
			break MISSING_BLOCK_LABEL_26;
	//   11   19:iload_1         
	//   12   20:ifeq            26
		obj;
	//   13   23:aload_2         
		JVM INSTR monitorexit ;
	//   14   24:monitorexit     
		return;
	//   15   25:return          
		zzs zzs1 = zzaAq;
	//   16   26:aload_0         
	//   17   27:getfield        #142 <Field zzs zzaAq>
	//   18   30:astore_3        
		if(zzs1 == null)
			break MISSING_BLOCK_LABEL_44;
	//   19   31:aload_3         
	//   20   32:ifnull          44
		Exception exception;
		try
		{
			zzaAq.cancel();
	//   21   35:aload_0         
	//   22   36:getfield        #142 <Field zzs zzaAq>
	//   23   39:invokeinterface #280 <Method void zzs.cancel()>
		}
	//*  24   44:aload_0         
	//*  25   45:getfield        #130 <Field Result zzazt>
	//*  26   48:invokestatic    #282 <Method void zzd(Result)>
	//*  27   51:aload_0         
	//*  28   52:iconst_1        
	//*  29   53:putfield        #155 <Field boolean zzK>
	//*  30   56:aload_0         
	//*  31   57:aload_0         
	//*  32   58:getstatic       #285 <Field Status Status.zzazB>
	//*  33   61:invokevirtual   #288 <Method Result zzc(Status)>
	//*  34   64:invokespecial   #290 <Method void zzc(Result)>
	//*  35   67:aload_2         
	//*  36   68:monitorexit     
	//*  37   69:return          
	//*  38   70:astore_3        
	//*  39   71:aload_2         
	//*  40   72:monitorexit     
	//*  41   73:aload_3         
	//*  42   74:athrow          
		catch(RemoteException remoteexception) { }
	//   43   75:astore_3        
		zzd(zzazt);
		zzK = true;
		zzc(zzc(Status.zzazB));
		obj;
		JVM INSTR monitorexit ;
		return;
		exception;
		throw exception;
	//*  44   76:goto            44
	}

	public boolean isCanceled()
	{
		Object obj = zzaAh;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Object zzaAh>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		boolean flag = zzK;
	//    5    7:aload_0         
	//    6    8:getfield        #155 <Field boolean zzK>
	//    7   11:istore_1        
		obj;
	//    8   12:aload_2         
		JVM INSTR monitorexit ;
	//    9   13:monitorexit     
		return flag;
	//   10   14:iload_1         
	//   11   15:ireturn         
		Exception exception;
		exception;
	//   12   16:astore_3        
	//*  13   17:aload_2         
		throw exception;
	//   14   18:monitorexit     
	//   15   19:aload_3         
	//   16   20:athrow          
	}

	public final boolean isReady()
	{
		return zztj.getCount() == 0L;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field CountDownLatch zztj>
	//    2    4:invokevirtual   #295 <Method long CountDownLatch.getCount()>
	//    3    7:lconst_0        
	//    4    8:lcmp            
	//    5    9:ifne            14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public final void setResultCallback(ResultCallback resultcallback)
	{
		Object obj = zzaAh;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Object zzaAh>
	//    2    4:astore_3        
		obj;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(resultcallback != null)
			break MISSING_BLOCK_LABEL_19;
	//    5    7:aload_1         
	//    6    8:ifnonnull       19
		zzaAl = null;
	//    7   11:aload_0         
	//    8   12:aconst_null     
	//    9   13:putfield        #132 <Field ResultCallback zzaAl>
		obj;
	//   10   16:aload_3         
		JVM INSTR monitorexit ;
	//   11   17:monitorexit     
		return;
	//   12   18:return          
		boolean flag;
		if(!zzaAo)
	//*  13   19:aload_0         
	//*  14   20:getfield        #115 <Field boolean zzaAo>
	//*  15   23:ifne            103
			flag = true;
	//   16   26:iconst_1        
	//   17   27:istore_2        
		else
	//*  18   28:goto            31
	//*  19   31:iload_2         
	//*  20   32:ldc1            #117 <String "Result has already been consumed.">
	//*  21   34:invokestatic    #122 <Method void zzac.zza(boolean, Object)>
	//*  22   37:aload_0         
	//*  23   38:getfield        #251 <Field zzabx zzaAr>
	//*  24   41:ifnonnull       108
	//*  25   44:iconst_1        
	//*  26   45:istore_2        
	//*  27   46:goto            49
	//*  28   49:iload_2         
	//*  29   50:ldc2            #299 <String "Cannot set callbacks if then() has been called.">
	//*  30   53:invokestatic    #122 <Method void zzac.zza(boolean, Object)>
	//*  31   56:aload_0         
	//*  32   57:invokevirtual   #301 <Method boolean isCanceled()>
	//*  33   60:istore_2        
	//*  34   61:iload_2         
	//*  35   62:ifeq            68
	//*  36   65:aload_3         
	//*  37   66:monitorexit     
	//*  38   67:return          
	//*  39   68:aload_0         
	//*  40   69:invokevirtual   #126 <Method boolean isReady()>
	//*  41   72:ifeq            90
	//*  42   75:aload_0         
	//*  43   76:getfield        #97  <Field zzaaf$zza zzaAi>
	//*  44   79:aload_1         
	//*  45   80:aload_0         
	//*  46   81:invokespecial   #167 <Method Result get()>
	//*  47   84:invokevirtual   #170 <Method void zzaaf$zza.zza(ResultCallback, Result)>
	//*  48   87:goto            95
	//*  49   90:aload_0         
	//*  50   91:aload_1         
	//*  51   92:putfield        #132 <Field ResultCallback zzaAl>
	//*  52   95:aload_3         
	//*  53   96:monitorexit     
	//*  54   97:return          
	//*  55   98:astore_1        
	//*  56   99:aload_3         
	//*  57  100:monitorexit     
	//*  58  101:aload_1         
	//*  59  102:athrow          
			flag = false;
	//   60  103:iconst_0        
	//   61  104:istore_2        
		zzac.zza(flag, "Result has already been consumed.");
		if(zzaAr == null)
			flag = true;
		else
	//*  62  105:goto            31
			flag = false;
	//   63  108:iconst_0        
	//   64  109:istore_2        
		zzac.zza(flag, "Cannot set callbacks if then() has been called.");
		flag = isCanceled();
		if(!flag)
			break MISSING_BLOCK_LABEL_68;
		obj;
		JVM INSTR monitorexit ;
		return;
		if(isReady())
		{
			zzaAi.zza(resultcallback, get());
			break MISSING_BLOCK_LABEL_95;
		}
		zzaAl = resultcallback;
		obj;
		JVM INSTR monitorexit ;
		return;
		resultcallback;
		throw resultcallback;
	//*  65  110:goto            49
	}

	public final void setResultCallback(ResultCallback resultcallback, long l, TimeUnit timeunit)
	{
		Object obj = zzaAh;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Object zzaAh>
	//    2    4:astore          6
		obj;
	//    3    6:aload           6
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		if(resultcallback != null)
			break MISSING_BLOCK_LABEL_22;
	//    5    9:aload_1         
	//    6   10:ifnonnull       22
		zzaAl = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #132 <Field ResultCallback zzaAl>
		obj;
	//   10   18:aload           6
		JVM INSTR monitorexit ;
	//   11   20:monitorexit     
		return;
	//   12   21:return          
		boolean flag;
		if(!zzaAo)
	//*  13   22:aload_0         
	//*  14   23:getfield        #115 <Field boolean zzaAo>
	//*  15   26:ifne            129
			flag = true;
	//   16   29:iconst_1        
	//   17   30:istore          5
		else
	//*  18   32:goto            35
	//*  19   35:iload           5
	//*  20   37:ldc1            #117 <String "Result has already been consumed.">
	//*  21   39:invokestatic    #122 <Method void zzac.zza(boolean, Object)>
	//*  22   42:aload_0         
	//*  23   43:getfield        #251 <Field zzabx zzaAr>
	//*  24   46:ifnonnull       135
	//*  25   49:iconst_1        
	//*  26   50:istore          5
	//*  27   52:goto            55
	//*  28   55:iload           5
	//*  29   57:ldc2            #299 <String "Cannot set callbacks if then() has been called.">
	//*  30   60:invokestatic    #122 <Method void zzac.zza(boolean, Object)>
	//*  31   63:aload_0         
	//*  32   64:invokevirtual   #301 <Method boolean isCanceled()>
	//*  33   67:istore          5
	//*  34   69:iload           5
	//*  35   71:ifeq            78
	//*  36   74:aload           6
	//*  37   76:monitorexit     
	//*  38   77:return          
	//*  39   78:aload_0         
	//*  40   79:invokevirtual   #126 <Method boolean isReady()>
	//*  41   82:ifeq            100
	//*  42   85:aload_0         
	//*  43   86:getfield        #97  <Field zzaaf$zza zzaAi>
	//*  44   89:aload_1         
	//*  45   90:aload_0         
	//*  46   91:invokespecial   #167 <Method Result get()>
	//*  47   94:invokevirtual   #170 <Method void zzaaf$zza.zza(ResultCallback, Result)>
	//*  48   97:goto            119
	//*  49  100:aload_0         
	//*  50  101:aload_1         
	//*  51  102:putfield        #132 <Field ResultCallback zzaAl>
	//*  52  105:aload_0         
	//*  53  106:getfield        #97  <Field zzaaf$zza zzaAi>
	//*  54  109:aload_0         
	//*  55  110:aload           4
	//*  56  112:lload_2         
	//*  57  113:invokevirtual   #309 <Method long TimeUnit.toMillis(long)>
	//*  58  116:invokevirtual   #312 <Method void zzaaf$zza.zza(zzaaf, long)>
	//*  59  119:aload           6
	//*  60  121:monitorexit     
	//*  61  122:return          
	//*  62  123:astore_1        
	//*  63  124:aload           6
	//*  64  126:monitorexit     
	//*  65  127:aload_1         
	//*  66  128:athrow          
			flag = false;
	//   67  129:iconst_0        
	//   68  130:istore          5
		zzac.zza(flag, "Result has already been consumed.");
		if(zzaAr == null)
			flag = true;
		else
	//*  69  132:goto            35
			flag = false;
	//   70  135:iconst_0        
	//   71  136:istore          5
		zzac.zza(flag, "Cannot set callbacks if then() has been called.");
		flag = isCanceled();
		if(!flag)
			break MISSING_BLOCK_LABEL_78;
		obj;
		JVM INSTR monitorexit ;
		return;
		if(isReady())
		{
			zzaAi.zza(resultcallback, get());
			break MISSING_BLOCK_LABEL_119;
		}
		zzaAl = resultcallback;
		zzaAi.zza(this, timeunit.toMillis(l));
		obj;
		JVM INSTR monitorexit ;
		return;
		resultcallback;
		throw resultcallback;
	//*  72  138:goto            55
	}

	public TransformedResult then(ResultTransform resulttransform)
	{
		boolean flag;
		if(!zzaAo)
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field boolean zzaAo>
	//*   2    4:ifne            12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		zzac.zza(flag, "Result has already been consumed.");
	//    8   14:iload_2         
	//    9   15:ldc1            #117 <String "Result has already been consumed.">
	//   10   17:invokestatic    #122 <Method void zzac.zza(boolean, Object)>
		Object obj = zzaAh;
	//   11   20:aload_0         
	//   12   21:getfield        #67  <Field Object zzaAh>
	//   13   24:astore_3        
		obj;
	//   14   25:aload_3         
		JVM INSTR monitorenter ;
	//   15   26:monitorenter    
		boolean flag1;
		if(zzaAr == null)
	//*  16   27:aload_0         
	//*  17   28:getfield        #251 <Field zzabx zzaAr>
	//*  18   31:ifnonnull       155
			flag1 = true;
	//   19   34:iconst_1        
	//   20   35:istore_2        
		else
	//*  21   36:goto            39
	//*  22   39:iload_2         
	//*  23   40:ldc2            #317 <String "Cannot call then() twice.">
	//*  24   43:invokestatic    #122 <Method void zzac.zza(boolean, Object)>
	//*  25   46:aload_0         
	//*  26   47:getfield        #132 <Field ResultCallback zzaAl>
	//*  27   50:ifnonnull       160
	//*  28   53:iconst_1        
	//*  29   54:istore_2        
	//*  30   55:goto            58
	//*  31   58:iload_2         
	//*  32   59:ldc2            #319 <String "Cannot call then() if callbacks are set.">
	//*  33   62:invokestatic    #122 <Method void zzac.zza(boolean, Object)>
	//*  34   65:aload_0         
	//*  35   66:getfield        #155 <Field boolean zzK>
	//*  36   69:ifne            165
	//*  37   72:iconst_1        
	//*  38   73:istore_2        
	//*  39   74:goto            77
	//*  40   77:iload_2         
	//*  41   78:ldc2            #321 <String "Cannot call then() if result was canceled.">
	//*  42   81:invokestatic    #122 <Method void zzac.zza(boolean, Object)>
	//*  43   84:aload_0         
	//*  44   85:iconst_1        
	//*  45   86:putfield        #86  <Field boolean zzaAs>
	//*  46   89:aload_0         
	//*  47   90:new             #323 <Class zzabx>
	//*  48   93:dup             
	//*  49   94:aload_0         
	//*  50   95:getfield        #104 <Field WeakReference zzaAj>
	//*  51   98:invokespecial   #326 <Method void zzabx(WeakReference)>
	//*  52  101:putfield        #251 <Field zzabx zzaAr>
	//*  53  104:aload_0         
	//*  54  105:getfield        #251 <Field zzabx zzaAr>
	//*  55  108:aload_1         
	//*  56  109:invokevirtual   #328 <Method TransformedResult zzabx.then(ResultTransform)>
	//*  57  112:astore_1        
	//*  58  113:aload_0         
	//*  59  114:invokevirtual   #126 <Method boolean isReady()>
	//*  60  117:ifeq            138
	//*  61  120:aload_0         
	//*  62  121:getfield        #97  <Field zzaaf$zza zzaAi>
	//*  63  124:aload_0         
	//*  64  125:getfield        #251 <Field zzabx zzaAr>
	//*  65  128:aload_0         
	//*  66  129:invokespecial   #167 <Method Result get()>
	//*  67  132:invokevirtual   #170 <Method void zzaaf$zza.zza(ResultCallback, Result)>
	//*  68  135:goto            146
	//*  69  138:aload_0         
	//*  70  139:aload_0         
	//*  71  140:getfield        #251 <Field zzabx zzaAr>
	//*  72  143:putfield        #132 <Field ResultCallback zzaAl>
	//*  73  146:aload_3         
	//*  74  147:monitorexit     
	//*  75  148:aload_1         
	//*  76  149:areturn         
	//*  77  150:astore_1        
	//*  78  151:aload_3         
	//*  79  152:monitorexit     
	//*  80  153:aload_1         
	//*  81  154:athrow          
			flag1 = false;
	//   82  155:iconst_0        
	//   83  156:istore_2        
		zzac.zza(flag1, "Cannot call then() twice.");
		if(zzaAl == null)
			flag1 = true;
		else
	//*  84  157:goto            39
			flag1 = false;
	//   85  160:iconst_0        
	//   86  161:istore_2        
		zzac.zza(flag1, "Cannot call then() if callbacks are set.");
		if(!zzK)
			flag1 = true;
		else
	//*  87  162:goto            58
			flag1 = false;
	//   88  165:iconst_0        
	//   89  166:istore_2        
		zzac.zza(flag1, "Cannot call then() if result was canceled.");
		zzaAs = true;
		zzaAr = new zzabx(zzaAj);
		resulttransform = ((ResultTransform) (zzaAr.then(resulttransform)));
		if(isReady())
		{
			zzaAi.zza(((ResultCallback) (zzaAr)), get());
			break MISSING_BLOCK_LABEL_146;
		}
		zzaAl = ((ResultCallback) (zzaAr));
		obj;
		JVM INSTR monitorexit ;
		return ((TransformedResult) (resulttransform));
		resulttransform;
		throw resulttransform;
	//*  90  167:goto            77
	}

	public final void zzC(Status status)
	{
		Object obj = zzaAh;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Object zzaAh>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(!isReady())
	//*   5    7:aload_0         
	//*   6    8:invokevirtual   #126 <Method boolean isReady()>
	//*   7   11:ifne            28
		{
			zzb(zzc(status));
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:invokevirtual   #288 <Method Result zzc(Status)>
	//   12   20:invokevirtual   #331 <Method void zzb(Result)>
			zzaAp = true;
	//   13   23:aload_0         
	//   14   24:iconst_1        
	//   15   25:putfield        #333 <Field boolean zzaAp>
		}
		obj;
	//   16   28:aload_2         
		JVM INSTR monitorexit ;
	//   17   29:monitorexit     
		return;
	//   18   30:return          
		status;
	//   19   31:astore_1        
	//*  20   32:aload_2         
		throw status;
	//   21   33:monitorexit     
	//   22   34:aload_1         
	//   23   35:athrow          
	}

	public final void zza(com.google.android.gms.common.api.PendingResult.zza zza1)
	{
		boolean flag;
		if(zza1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          9
			flag = true;
	//    2    4:iconst_1        
	//    3    5:istore_2        
		else
	//*   4    6:goto            11
			flag = false;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		zzac.zzb(flag, "Callback cannot be null.");
	//    7   11:iload_2         
	//    8   12:ldc2            #336 <String "Callback cannot be null.">
	//    9   15:invokestatic    #338 <Method void zzac.zzb(boolean, Object)>
		Object obj = zzaAh;
	//   10   18:aload_0         
	//   11   19:getfield        #67  <Field Object zzaAh>
	//   12   22:astore_3        
		obj;
	//   13   23:aload_3         
		JVM INSTR monitorenter ;
	//   14   24:monitorenter    
		if(isReady())
	//*  15   25:aload_0         
	//*  16   26:invokevirtual   #126 <Method boolean isReady()>
	//*  17   29:ifeq            45
		{
			zza1.zzy(zzair);
	//   18   32:aload_1         
	//   19   33:aload_0         
	//   20   34:getfield        #153 <Field Status zzair>
	//   21   37:invokeinterface #189 <Method void com.google.android.gms.common.api.PendingResult$zza.zzy(Status)>
			break MISSING_BLOCK_LABEL_54;
	//   22   42:goto            54
		}
		zzaAk.add(((Object) (zza1)));
	//   23   45:aload_0         
	//   24   46:getfield        #79  <Field ArrayList zzaAk>
	//   25   49:aload_1         
	//   26   50:invokevirtual   #342 <Method boolean ArrayList.add(Object)>
	//   27   53:pop             
		obj;
	//   28   54:aload_3         
		JVM INSTR monitorexit ;
	//   29   55:monitorexit     
		return;
	//   30   56:return          
		zza1;
	//   31   57:astore_1        
	//*  32   58:aload_3         
		throw zza1;
	//   33   59:monitorexit     
	//   34   60:aload_1         
	//   35   61:athrow          
	}

	protected final void zza(zzs zzs1)
	{
		Object obj = zzaAh;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Object zzaAh>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		zzaAq = zzs1;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #142 <Field zzs zzaAq>
		obj;
	//    8   12:aload_2         
		JVM INSTR monitorexit ;
	//    9   13:monitorexit     
		return;
	//   10   14:return          
		zzs1;
	//   11   15:astore_1        
	//*  12   16:aload_2         
		throw zzs1;
	//   13   17:monitorexit     
	//   14   18:aload_1         
	//   15   19:athrow          
	}

	public void zza(zzaby.zzb zzb1)
	{
		zzaAm.set(((Object) (zzb1)));
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field AtomicReference zzaAm>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #347 <Method void AtomicReference.set(Object)>
	//    4    8:return          
	}

	public final void zzb(Result result)
	{
		Object obj = zzaAh;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Object zzaAh>
	//    2    4:astore_3        
		obj;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(!zzaAp && !zzK)
	//*   5    7:aload_0         
	//*   6    8:getfield        #333 <Field boolean zzaAp>
	//*   7   11:ifne            31
	//*   8   14:aload_0         
	//*   9   15:getfield        #155 <Field boolean zzK>
	//*  10   18:ifne            31
		{
			if(!isReady());
	//   11   21:aload_0         
	//   12   22:invokevirtual   #126 <Method boolean isReady()>
	//   13   25:ifeq            38
			break MISSING_BLOCK_LABEL_38;
	//   14   28:goto            38
		}
		zzd(result);
	//   15   31:aload_1         
	//   16   32:invokestatic    #282 <Method void zzd(Result)>
		obj;
	//   17   35:aload_3         
		JVM INSTR monitorexit ;
	//   18   36:monitorexit     
		return;
	//   19   37:return          
		boolean flag;
		if(!isReady())
	//*  20   38:aload_0         
	//*  21   39:invokevirtual   #126 <Method boolean isReady()>
	//*  22   42:ifne            88
			flag = true;
	//   23   45:iconst_1        
	//   24   46:istore_2        
		else
	//*  25   47:goto            50
	//*  26   50:iload_2         
	//*  27   51:ldc2            #349 <String "Results have already been set">
	//*  28   54:invokestatic    #122 <Method void zzac.zza(boolean, Object)>
	//*  29   57:aload_0         
	//*  30   58:getfield        #115 <Field boolean zzaAo>
	//*  31   61:ifne            93
	//*  32   64:iconst_1        
	//*  33   65:istore_2        
	//*  34   66:goto            69
	//*  35   69:iload_2         
	//*  36   70:ldc1            #249 <String "Result has already been consumed">
	//*  37   72:invokestatic    #122 <Method void zzac.zza(boolean, Object)>
	//*  38   75:aload_0         
	//*  39   76:aload_1         
	//*  40   77:invokespecial   #290 <Method void zzc(Result)>
	//*  41   80:aload_3         
	//*  42   81:monitorexit     
	//*  43   82:return          
	//*  44   83:astore_1        
	//*  45   84:aload_3         
	//*  46   85:monitorexit     
	//*  47   86:aload_1         
	//*  48   87:athrow          
			flag = false;
	//   49   88:iconst_0        
	//   50   89:istore_2        
		zzac.zza(flag, "Results have already been set");
		if(!zzaAo)
			flag = true;
		else
	//*  51   90:goto            50
			flag = false;
	//   52   93:iconst_0        
	//   53   94:istore_2        
		zzac.zza(flag, "Result has already been consumed");
		zzc(result);
		obj;
		JVM INSTR monitorexit ;
		return;
		result;
		throw result;
	//*  54   95:goto            69
	}

	protected abstract Result zzc(Status status);

	public boolean zzvF()
	{
		Object obj = zzaAh;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Object zzaAh>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		boolean flag;
		if((GoogleApiClient)zzaAj.get() == null || !zzaAs)
	//*   5    7:aload_0         
	//*   6    8:getfield        #104 <Field WeakReference zzaAj>
	//*   7   11:invokevirtual   #353 <Method Object WeakReference.get()>
	//*   8   14:checkcast       #108 <Class GoogleApiClient>
	//*   9   17:ifnull          27
	//*  10   20:aload_0         
	//*  11   21:getfield        #86  <Field boolean zzaAs>
	//*  12   24:ifne            31
			cancel();
	//   13   27:aload_0         
	//   14   28:invokevirtual   #354 <Method void cancel()>
		flag = isCanceled();
	//   15   31:aload_0         
	//   16   32:invokevirtual   #301 <Method boolean isCanceled()>
	//   17   35:istore_1        
		obj;
	//   18   36:aload_2         
		JVM INSTR monitorexit ;
	//   19   37:monitorexit     
		return flag;
	//   20   38:iload_1         
	//   21   39:ireturn         
		Exception exception;
		exception;
	//   22   40:astore_3        
	//*  23   41:aload_2         
		throw exception;
	//   24   42:monitorexit     
	//   25   43:aload_3         
	//   26   44:athrow          
	}

	public void zzvH()
	{
		setResultCallback(((ResultCallback) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #357 <Method void setResultCallback(ResultCallback)>
	//    3    5:return          
	}

	public void zzvI()
	{
		boolean flag;
		if(zzaAs || ((Boolean)zzaAg.get()).booleanValue())
	//*   0    0:aload_0         
	//*   1    1:getfield        #86  <Field boolean zzaAs>
	//*   2    4:ifne            22
	//*   3    7:getstatic       #59  <Field ThreadLocal zzaAg>
	//*   4   10:invokevirtual   #361 <Method Object ThreadLocal.get()>
	//*   5   13:checkcast       #363 <Class Boolean>
	//*   6   16:invokevirtual   #366 <Method boolean Boolean.booleanValue()>
	//*   7   19:ifeq            27
			flag = true;
	//    8   22:iconst_1        
	//    9   23:istore_1        
		else
	//*  10   24:goto            29
			flag = false;
	//   11   27:iconst_0        
	//   12   28:istore_1        
		zzaAs = flag;
	//   13   29:aload_0         
	//   14   30:iload_1         
	//   15   31:putfield        #86  <Field boolean zzaAs>
	//   16   34:return          
	}

	public Integer zzvr()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	static final ThreadLocal zzaAg = new ThreadLocal() {

		protected Object initialValue()
		{
			return ((Object) (zzvJ()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #18  <Method Boolean zzvJ()>
		//    2    4:areturn         
		}

		protected Boolean zzvJ()
		{
			return Boolean.valueOf(false);
		//    0    0:iconst_0        
		//    1    1:invokestatic    #24  <Method Boolean Boolean.valueOf(boolean)>
		//    2    4:areturn         
		}

	}
;
	private boolean zzK;
	private final Object zzaAh;
	protected final zza zzaAi;
	protected final WeakReference zzaAj;
	private final ArrayList zzaAk;
	private ResultCallback zzaAl;
	private final AtomicReference zzaAm;
	private zzb zzaAn;
	private volatile boolean zzaAo;
	private boolean zzaAp;
	private zzs zzaAq;
	private volatile zzabx zzaAr;
	private boolean zzaAs;
	private Status zzair;
	private Result zzazt;
	private final CountDownLatch zztj;

	static 
	{
	//    0    0:new             #7   <Class zzaaf$1>
	//    1    3:dup             
	//    2    4:invokespecial   #57  <Method void zzaaf$1()>
	//    3    7:putstatic       #59  <Field ThreadLocal zzaAg>
	//*   4   10:return          
	}
}
