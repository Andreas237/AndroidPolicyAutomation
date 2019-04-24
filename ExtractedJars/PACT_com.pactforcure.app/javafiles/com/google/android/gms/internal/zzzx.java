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
//			zzabp

public abstract class zzzx extends PendingResult
{
	public static class zza extends Handler
	{

		public void handleMessage(Message message)
		{
			switch(message.what)
		//*   0    0:aload_1         
		//*   1    1:getfield        #29  <Field int Message.what>
			{
		//*   2    4:tableswitch     1 2: default 28
		//		               1 68
		//		               2 95
			default:
				int i = message.what;
		//    3   28:aload_1         
		//    4   29:getfield        #29  <Field int Message.what>
		//    5   32:istore_2        
				Log.wtf("BasePendingResult", (new StringBuilder(45)).append("Don't know how to handle message: ").append(i).toString(), ((Throwable) (new Exception())));
		//    6   33:ldc1            #31  <String "BasePendingResult">
		//    7   35:new             #33  <Class StringBuilder>
		//    8   38:dup             
		//    9   39:bipush          45
		//   10   41:invokespecial   #36  <Method void StringBuilder(int)>
		//   11   44:ldc1            #38  <String "Don't know how to handle message: ">
		//   12   46:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
		//   13   49:iload_2         
		//   14   50:invokevirtual   #45  <Method StringBuilder StringBuilder.append(int)>
		//   15   53:invokevirtual   #49  <Method String StringBuilder.toString()>
		//   16   56:new             #51  <Class Exception>
		//   17   59:dup             
		//   18   60:invokespecial   #53  <Method void Exception()>
		//   19   63:invokestatic    #59  <Method int Log.wtf(String, String, Throwable)>
		//   20   66:pop             
				return;
		//   21   67:return          

			case 1: // '\001'
				message = ((Message) ((Pair)message.obj));
		//   22   68:aload_1         
		//   23   69:getfield        #63  <Field Object Message.obj>
		//   24   72:checkcast       #65  <Class Pair>
		//   25   75:astore_1        
				zzb((ResultCallback)((Pair) (message)).first, (Result)((Pair) (message)).second);
		//   26   76:aload_0         
		//   27   77:aload_1         
		//   28   78:getfield        #68  <Field Object Pair.first>
		//   29   81:checkcast       #70  <Class ResultCallback>
		//   30   84:aload_1         
		//   31   85:getfield        #73  <Field Object Pair.second>
		//   32   88:checkcast       #75  <Class Result>
		//   33   91:invokevirtual   #79  <Method void zzb(ResultCallback, Result)>
				return;
		//   34   94:return          

			case 2: // '\002'
				((zzzx)message.obj).zzB(Status.zzayk);
		//   35   95:aload_1         
		//   36   96:getfield        #63  <Field Object Message.obj>
		//   37   99:checkcast       #7   <Class zzzx>
		//   38  102:getstatic       #85  <Field Status Status.zzayk>
		//   39  105:invokevirtual   #89  <Method void zzzx.zzB(Status)>
				break;
			}
		//   40  108:return          
		}

		public void zza(ResultCallback resultcallback, Result result)
		{
			sendMessage(obtainMessage(1, ((Object) (new Pair(((Object) (resultcallback)), ((Object) (result)))))));
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:iconst_1        
		//    3    3:new             #65  <Class Pair>
		//    4    6:dup             
		//    5    7:aload_1         
		//    6    8:aload_2         
		//    7    9:invokespecial   #92  <Method void Pair(Object, Object)>
		//    8   12:invokevirtual   #96  <Method Message obtainMessage(int, Object)>
		//    9   15:invokevirtual   #100 <Method boolean sendMessage(Message)>
		//   10   18:pop             
		//   11   19:return          
		}

		public void zza(zzzx zzzx1, long l)
		{
			sendMessageDelayed(obtainMessage(2, ((Object) (zzzx1))), l);
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
				zzzx.zzd(result);
		//    5    9:aload_2         
		//    6   10:invokestatic    #117 <Method void zzzx.zzd(Result)>
			}
			throw resultcallback;
		//    7   13:aload_1         
		//    8   14:athrow          
		}

		public void zzvh()
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
		//    2    4:invokespecial   #19  <Method void zzzx$zza(Looper)>
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

	private final class zzb
	{

		protected void finalize()
			throws Throwable
		{
			zzzx.zzd(zzzx.zza(zzaza));
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field zzzx zzaza>
		//    2    4:invokestatic    #27  <Method Result zzzx.zza(zzzx)>
		//    3    7:invokestatic    #31  <Method void zzzx.zzd(Result)>
			super.finalize();
		//    4   10:aload_0         
		//    5   11:invokespecial   #33  <Method void Object.finalize()>
		//    6   14:return          
		}

		final zzzx zzaza;

		private zzb()
		{
			zzaza = zzzx.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field zzzx zzaza>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void Object()>
		//    5    9:return          
		}

	}


	zzzx()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method void PendingResult()>
		zzayO = new Object();
	//    2    4:aload_0         
	//    3    5:new             #62  <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #63  <Method void Object()>
	//    6   12:putfield        #65  <Field Object zzayO>
		zzth = new CountDownLatch(1);
	//    7   15:aload_0         
	//    8   16:new             #67  <Class CountDownLatch>
	//    9   19:dup             
	//   10   20:iconst_1        
	//   11   21:invokespecial   #70  <Method void CountDownLatch(int)>
	//   12   24:putfield        #72  <Field CountDownLatch zzth>
		zzayR = new ArrayList();
	//   13   27:aload_0         
	//   14   28:new             #74  <Class ArrayList>
	//   15   31:dup             
	//   16   32:invokespecial   #75  <Method void ArrayList()>
	//   17   35:putfield        #77  <Field ArrayList zzayR>
		zzayT = new AtomicReference();
	//   18   38:aload_0         
	//   19   39:new             #79  <Class AtomicReference>
	//   20   42:dup             
	//   21   43:invokespecial   #80  <Method void AtomicReference()>
	//   22   46:putfield        #82  <Field AtomicReference zzayT>
		zzayZ = false;
	//   23   49:aload_0         
	//   24   50:iconst_0        
	//   25   51:putfield        #84  <Field boolean zzayZ>
		zzayP = new zza(Looper.getMainLooper());
	//   26   54:aload_0         
	//   27   55:new             #9   <Class zzzx$zza>
	//   28   58:dup             
	//   29   59:invokestatic    #90  <Method Looper Looper.getMainLooper()>
	//   30   62:invokespecial   #93  <Method void zzzx$zza(Looper)>
	//   31   65:putfield        #95  <Field zzzx$zza zzayP>
		zzayQ = new WeakReference(((Object) (null)));
	//   32   68:aload_0         
	//   33   69:new             #97  <Class WeakReference>
	//   34   72:dup             
	//   35   73:aconst_null     
	//   36   74:invokespecial   #100 <Method void WeakReference(Object)>
	//   37   77:putfield        #102 <Field WeakReference zzayQ>
	//   38   80:return          
	}

	protected zzzx(Looper looper)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method void PendingResult()>
		zzayO = new Object();
	//    2    4:aload_0         
	//    3    5:new             #62  <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #63  <Method void Object()>
	//    6   12:putfield        #65  <Field Object zzayO>
		zzth = new CountDownLatch(1);
	//    7   15:aload_0         
	//    8   16:new             #67  <Class CountDownLatch>
	//    9   19:dup             
	//   10   20:iconst_1        
	//   11   21:invokespecial   #70  <Method void CountDownLatch(int)>
	//   12   24:putfield        #72  <Field CountDownLatch zzth>
		zzayR = new ArrayList();
	//   13   27:aload_0         
	//   14   28:new             #74  <Class ArrayList>
	//   15   31:dup             
	//   16   32:invokespecial   #75  <Method void ArrayList()>
	//   17   35:putfield        #77  <Field ArrayList zzayR>
		zzayT = new AtomicReference();
	//   18   38:aload_0         
	//   19   39:new             #79  <Class AtomicReference>
	//   20   42:dup             
	//   21   43:invokespecial   #80  <Method void AtomicReference()>
	//   22   46:putfield        #82  <Field AtomicReference zzayT>
		zzayZ = false;
	//   23   49:aload_0         
	//   24   50:iconst_0        
	//   25   51:putfield        #84  <Field boolean zzayZ>
		zzayP = new zza(looper);
	//   26   54:aload_0         
	//   27   55:new             #9   <Class zzzx$zza>
	//   28   58:dup             
	//   29   59:aload_1         
	//   30   60:invokespecial   #93  <Method void zzzx$zza(Looper)>
	//   31   63:putfield        #95  <Field zzzx$zza zzayP>
		zzayQ = new WeakReference(((Object) (null)));
	//   32   66:aload_0         
	//   33   67:new             #97  <Class WeakReference>
	//   34   70:dup             
	//   35   71:aconst_null     
	//   36   72:invokespecial   #100 <Method void WeakReference(Object)>
	//   37   75:putfield        #102 <Field WeakReference zzayQ>
	//   38   78:return          
	}

	protected zzzx(GoogleApiClient googleapiclient)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method void PendingResult()>
		zzayO = new Object();
	//    2    4:aload_0         
	//    3    5:new             #62  <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #63  <Method void Object()>
	//    6   12:putfield        #65  <Field Object zzayO>
		zzth = new CountDownLatch(1);
	//    7   15:aload_0         
	//    8   16:new             #67  <Class CountDownLatch>
	//    9   19:dup             
	//   10   20:iconst_1        
	//   11   21:invokespecial   #70  <Method void CountDownLatch(int)>
	//   12   24:putfield        #72  <Field CountDownLatch zzth>
		zzayR = new ArrayList();
	//   13   27:aload_0         
	//   14   28:new             #74  <Class ArrayList>
	//   15   31:dup             
	//   16   32:invokespecial   #75  <Method void ArrayList()>
	//   17   35:putfield        #77  <Field ArrayList zzayR>
		zzayT = new AtomicReference();
	//   18   38:aload_0         
	//   19   39:new             #79  <Class AtomicReference>
	//   20   42:dup             
	//   21   43:invokespecial   #80  <Method void AtomicReference()>
	//   22   46:putfield        #82  <Field AtomicReference zzayT>
		zzayZ = false;
	//   23   49:aload_0         
	//   24   50:iconst_0        
	//   25   51:putfield        #84  <Field boolean zzayZ>
		Looper looper;
		if(googleapiclient != null)
	//*  26   54:aload_1         
	//*  27   55:ifnull          88
			looper = googleapiclient.getLooper();
	//   28   58:aload_1         
	//   29   59:invokevirtual   #109 <Method Looper GoogleApiClient.getLooper()>
	//   30   62:astore_2        
		else
	//*  31   63:aload_0         
	//*  32   64:new             #9   <Class zzzx$zza>
	//*  33   67:dup             
	//*  34   68:aload_2         
	//*  35   69:invokespecial   #93  <Method void zzzx$zza(Looper)>
	//*  36   72:putfield        #95  <Field zzzx$zza zzayP>
	//*  37   75:aload_0         
	//*  38   76:new             #97  <Class WeakReference>
	//*  39   79:dup             
	//*  40   80:aload_1         
	//*  41   81:invokespecial   #100 <Method void WeakReference(Object)>
	//*  42   84:putfield        #102 <Field WeakReference zzayQ>
	//*  43   87:return          
			looper = Looper.getMainLooper();
	//   44   88:invokestatic    #90  <Method Looper Looper.getMainLooper()>
	//   45   91:astore_2        
		zzayP = new zza(looper);
		zzayQ = new WeakReference(((Object) (googleapiclient)));
	//*  46   92:goto            63
	}

	private Result get()
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_1        
		Object obj = zzayO;
	//    2    2:aload_0         
	//    3    3:getfield        #65  <Field Object zzayO>
	//    4    6:astore_2        
		obj;
	//    5    7:aload_2         
		JVM INSTR monitorenter ;
	//    6    8:monitorenter    
		Result result;
		if(zzayV)
	//*   7    9:aload_0         
	//*   8   10:getfield        #113 <Field boolean zzayV>
	//*   9   13:ifne            59
	//*  10   16:iload_1         
	//*  11   17:ldc1            #115 <String "Result has already been consumed.">
	//*  12   19:invokestatic    #120 <Method void zzac.zza(boolean, Object)>
	//*  13   22:aload_0         
	//*  14   23:invokevirtual   #124 <Method boolean isReady()>
	//*  15   26:ldc1            #126 <String "Result is not ready.">
	//*  16   28:invokestatic    #120 <Method void zzac.zza(boolean, Object)>
	//*  17   31:aload_0         
	//*  18   32:getfield        #128 <Field Result zzayd>
	//*  19   35:astore_3        
	//*  20   36:aload_0         
	//*  21   37:aconst_null     
	//*  22   38:putfield        #128 <Field Result zzayd>
	//*  23   41:aload_0         
	//*  24   42:aconst_null     
	//*  25   43:putfield        #130 <Field ResultCallback zzayS>
	//*  26   46:aload_0         
	//*  27   47:iconst_1        
	//*  28   48:putfield        #113 <Field boolean zzayV>
	//*  29   51:aload_2         
	//*  30   52:monitorexit     
	//*  31   53:aload_0         
	//*  32   54:invokespecial   #133 <Method void zzvd()>
	//*  33   57:aload_3         
	//*  34   58:areturn         
			flag = false;
	//   35   59:iconst_0        
	//   36   60:istore_1        
		zzac.zza(flag, "Result has already been consumed.");
		zzac.zza(isReady(), "Result is not ready.");
		result = zzayd;
		zzayd = null;
		zzayS = null;
		zzayV = true;
		zzvd();
		return result;
	//*  37   61:goto            16
		Exception exception;
		exception;
	//   38   64:astore_3        
		obj;
	//   39   65:aload_2         
		JVM INSTR monitorexit ;
	//   40   66:monitorexit     
		throw exception;
	//   41   67:aload_3         
	//   42   68:athrow          
	}

	static Result zza(zzzx zzzx1)
	{
		return zzzx1.zzayd;
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field Result zzayd>
	//    2    4:areturn         
	}

	private void zzc(Result result)
	{
		zzayd = result;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #128 <Field Result zzayd>
		zzayX = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #140 <Field zzs zzayX>
		zzth.countDown();
	//    6   10:aload_0         
	//    7   11:getfield        #72  <Field CountDownLatch zzth>
	//    8   14:invokevirtual   #143 <Method void CountDownLatch.countDown()>
		result = ((Result) (zzayd.getStatus()));
	//    9   17:aload_0         
	//   10   18:getfield        #128 <Field Result zzayd>
	//   11   21:invokeinterface #149 <Method Status Result.getStatus()>
	//   12   26:astore_1        
		if(!zzJ) goto _L2; else goto _L1
	//   13   27:aload_0         
	//   14   28:getfield        #151 <Field boolean zzJ>
	//   15   31:ifeq            74
_L1:
		zzayS = null;
	//   16   34:aload_0         
	//   17   35:aconst_null     
	//   18   36:putfield        #130 <Field ResultCallback zzayS>
_L4:
		for(Iterator iterator = zzayR.iterator(); iterator.hasNext(); ((com.google.android.gms.common.api.PendingResult.zza)iterator.next()).zzx(((Status) (result))));
	//   19   39:aload_0         
	//   20   40:getfield        #77  <Field ArrayList zzayR>
	//   21   43:invokevirtual   #155 <Method Iterator ArrayList.iterator()>
	//   22   46:astore_2        
	//   23   47:aload_2         
	//   24   48:invokeinterface #160 <Method boolean Iterator.hasNext()>
	//   25   53:ifeq            132
	//   26   56:aload_2         
	//   27   57:invokeinterface #164 <Method Object Iterator.next()>
	//   28   62:checkcast       #166 <Class com.google.android.gms.common.api.PendingResult$zza>
	//   29   65:aload_1         
	//   30   66:invokeinterface #170 <Method void com.google.android.gms.common.api.PendingResult$zza.zzx(Status)>
		break; /* Loop/switch isn't completed */
	//   31   71:goto            47
_L2:
		if(zzayS == null)
	//*  32   74:aload_0         
	//*  33   75:getfield        #130 <Field ResultCallback zzayS>
	//*  34   78:ifnonnull       107
		{
			if(zzayd instanceof Releasable)
	//*  35   81:aload_0         
	//*  36   82:getfield        #128 <Field Result zzayd>
	//*  37   85:instanceof      #172 <Class Releasable>
	//*  38   88:ifeq            39
				zzayU = new zzb();
	//   39   91:aload_0         
	//   40   92:new             #12  <Class zzzx$zzb>
	//   41   95:dup             
	//   42   96:aload_0         
	//   43   97:aconst_null     
	//   44   98:invokespecial   #175 <Method void zzzx$zzb(zzzx, zzzx$1)>
	//   45  101:putfield        #177 <Field zzzx$zzb zzayU>
		} else
	//*  46  104:goto            39
		{
			zzayP.zzvh();
	//   47  107:aload_0         
	//   48  108:getfield        #95  <Field zzzx$zza zzayP>
	//   49  111:invokevirtual   #180 <Method void zzzx$zza.zzvh()>
			zzayP.zza(zzayS, get());
	//   50  114:aload_0         
	//   51  115:getfield        #95  <Field zzzx$zza zzayP>
	//   52  118:aload_0         
	//   53  119:getfield        #130 <Field ResultCallback zzayS>
	//   54  122:aload_0         
	//   55  123:invokespecial   #182 <Method Result get()>
	//   56  126:invokevirtual   #185 <Method void zzzx$zza.zza(ResultCallback, Result)>
		}
		if(true) goto _L4; else goto _L3
	//   57  129:goto            39
_L3:
		zzayR.clear();
	//   58  132:aload_0         
	//   59  133:getfield        #77  <Field ArrayList zzayR>
	//   60  136:invokevirtual   #188 <Method void ArrayList.clear()>
		return;
	//   61  139:return          
	}

	public static void zzd(Result result)
	{
		if(!(result instanceof Releasable))
			break MISSING_BLOCK_LABEL_16;
	//    0    0:aload_0         
	//    1    1:instanceof      #172 <Class Releasable>
	//    2    4:ifeq            16
		((Releasable)result).release();
	//    3    7:aload_0         
	//    4    8:checkcast       #172 <Class Releasable>
	//    5   11:invokeinterface #195 <Method void Releasable.release()>
		return;
	//    6   16:return          
		RuntimeException runtimeexception;
		runtimeexception;
	//    7   17:astore_1        
		result = ((Result) (String.valueOf(((Object) (result)))));
	//    8   18:aload_0         
	//    9   19:invokestatic    #201 <Method String String.valueOf(Object)>
	//   10   22:astore_0        
		Log.w("BasePendingResult", (new StringBuilder(String.valueOf(((Object) (result))).length() + 18)).append("Unable to release ").append(((String) (result))).toString(), ((Throwable) (runtimeexception)));
	//   11   23:ldc1            #203 <String "BasePendingResult">
	//   12   25:new             #205 <Class StringBuilder>
	//   13   28:dup             
	//   14   29:aload_0         
	//   15   30:invokestatic    #201 <Method String String.valueOf(Object)>
	//   16   33:invokevirtual   #209 <Method int String.length()>
	//   17   36:bipush          18
	//   18   38:iadd            
	//   19   39:invokespecial   #210 <Method void StringBuilder(int)>
	//   20   42:ldc1            #212 <String "Unable to release ">
	//   21   44:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   22   47:aload_0         
	//   23   48:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   24   51:invokevirtual   #220 <Method String StringBuilder.toString()>
	//   25   54:aload_1         
	//   26   55:invokestatic    #226 <Method int Log.w(String, String, Throwable)>
	//   27   58:pop             
		return;
	//   28   59:return          
	}

	private void zzvd()
	{
		zzabq.zzb zzb1 = (zzabq.zzb)zzayT.getAndSet(((Object) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field AtomicReference zzayT>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #230 <Method Object AtomicReference.getAndSet(Object)>
	//    4    8:checkcast       #232 <Class zzabq$zzb>
	//    5   11:astore_1        
		if(zzb1 != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          23
			zzb1.zzc(this);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:invokeinterface #235 <Method void zzabq$zzb.zzc(zzzx)>
	//   11   23:return          
	}

	public final Result await()
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		boolean flag;
		if(Looper.myLooper() != Looper.getMainLooper())
	//*   2    2:invokestatic    #241 <Method Looper Looper.myLooper()>
	//*   3    5:invokestatic    #90  <Method Looper Looper.getMainLooper()>
	//*   4    8:if_acmpeq       70
			flag = true;
	//    5   11:iconst_1        
	//    6   12:istore_1        
		else
	//*   7   13:iload_1         
	//*   8   14:ldc1            #243 <String "await must not be called on the UI thread">
	//*   9   16:invokestatic    #120 <Method void zzac.zza(boolean, Object)>
	//*  10   19:aload_0         
	//*  11   20:getfield        #113 <Field boolean zzayV>
	//*  12   23:ifne            75
	//*  13   26:iconst_1        
	//*  14   27:istore_1        
	//*  15   28:iload_1         
	//*  16   29:ldc1            #245 <String "Result has already been consumed">
	//*  17   31:invokestatic    #120 <Method void zzac.zza(boolean, Object)>
	//*  18   34:aload_0         
	//*  19   35:getfield        #247 <Field zzabp zzayY>
	//*  20   38:ifnonnull       80
	//*  21   41:iload_2         
	//*  22   42:istore_1        
	//*  23   43:iload_1         
	//*  24   44:ldc1            #249 <String "Cannot await if then() has been called.">
	//*  25   46:invokestatic    #120 <Method void zzac.zza(boolean, Object)>
	//*  26   49:aload_0         
	//*  27   50:getfield        #72  <Field CountDownLatch zzth>
	//*  28   53:invokevirtual   #251 <Method void CountDownLatch.await()>
	//*  29   56:aload_0         
	//*  30   57:invokevirtual   #124 <Method boolean isReady()>
	//*  31   60:ldc1            #126 <String "Result is not ready.">
	//*  32   62:invokestatic    #120 <Method void zzac.zza(boolean, Object)>
	//*  33   65:aload_0         
	//*  34   66:invokespecial   #182 <Method Result get()>
	//*  35   69:areturn         
			flag = false;
	//   36   70:iconst_0        
	//   37   71:istore_1        
		zzac.zza(flag, "await must not be called on the UI thread");
		if(!zzayV)
			flag = true;
		else
	//*  38   72:goto            13
			flag = false;
	//   39   75:iconst_0        
	//   40   76:istore_1        
		zzac.zza(flag, "Result has already been consumed");
		if(zzayY == null)
			flag = flag1;
		else
	//*  41   77:goto            28
			flag = false;
	//   42   80:iconst_0        
	//   43   81:istore_1        
		zzac.zza(flag, "Cannot await if then() has been called.");
		try
		{
			zzth.await();
		}
	//*  44   82:goto            43
		catch(InterruptedException interruptedexception)
	//*  45   85:astore_3        
		{
			zzB(Status.zzayi);
	//   46   86:aload_0         
	//   47   87:getstatic       #257 <Field Status Status.zzayi>
	//   48   90:invokevirtual   #260 <Method void zzB(Status)>
		}
		zzac.zza(isReady(), "Result is not ready.");
		return get();
	//*  49   93:goto            56
	}

	public final Result await(long l, TimeUnit timeunit)
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          5
		boolean flag;
		if(l <= 0L || Looper.myLooper() != Looper.getMainLooper())
	//*   2    3:lload_1         
	//*   3    4:lconst_0        
	//*   4    5:lcmp            
	//*   5    6:ifle            18
	//*   6    9:invokestatic    #241 <Method Looper Looper.myLooper()>
	//*   7   12:invokestatic    #90  <Method Looper Looper.getMainLooper()>
	//*   8   15:if_acmpeq       97
			flag = true;
	//    9   18:iconst_1        
	//   10   19:istore          4
		else
	//*  11   21:iload           4
	//*  12   23:ldc2            #263 <String "await must not be called on the UI thread when time is greater than zero.">
	//*  13   26:invokestatic    #120 <Method void zzac.zza(boolean, Object)>
	//*  14   29:aload_0         
	//*  15   30:getfield        #113 <Field boolean zzayV>
	//*  16   33:ifne            103
	//*  17   36:iconst_1        
	//*  18   37:istore          4
	//*  19   39:iload           4
	//*  20   41:ldc1            #115 <String "Result has already been consumed.">
	//*  21   43:invokestatic    #120 <Method void zzac.zza(boolean, Object)>
	//*  22   46:aload_0         
	//*  23   47:getfield        #247 <Field zzabp zzayY>
	//*  24   50:ifnonnull       109
	//*  25   53:iload           5
	//*  26   55:istore          4
	//*  27   57:iload           4
	//*  28   59:ldc1            #249 <String "Cannot await if then() has been called.">
	//*  29   61:invokestatic    #120 <Method void zzac.zza(boolean, Object)>
	//*  30   64:aload_0         
	//*  31   65:getfield        #72  <Field CountDownLatch zzth>
	//*  32   68:lload_1         
	//*  33   69:aload_3         
	//*  34   70:invokevirtual   #266 <Method boolean CountDownLatch.await(long, TimeUnit)>
	//*  35   73:ifne            83
	//*  36   76:aload_0         
	//*  37   77:getstatic       #269 <Field Status Status.zzayk>
	//*  38   80:invokevirtual   #260 <Method void zzB(Status)>
	//*  39   83:aload_0         
	//*  40   84:invokevirtual   #124 <Method boolean isReady()>
	//*  41   87:ldc1            #126 <String "Result is not ready.">
	//*  42   89:invokestatic    #120 <Method void zzac.zza(boolean, Object)>
	//*  43   92:aload_0         
	//*  44   93:invokespecial   #182 <Method Result get()>
	//*  45   96:areturn         
			flag = false;
	//   46   97:iconst_0        
	//   47   98:istore          4
		zzac.zza(flag, "await must not be called on the UI thread when time is greater than zero.");
		if(!zzayV)
			flag = true;
		else
	//*  48  100:goto            21
			flag = false;
	//   49  103:iconst_0        
	//   50  104:istore          4
		zzac.zza(flag, "Result has already been consumed.");
		if(zzayY == null)
			flag = flag1;
		else
	//*  51  106:goto            39
			flag = false;
	//   52  109:iconst_0        
	//   53  110:istore          4
		zzac.zza(flag, "Cannot await if then() has been called.");
		try
		{
			if(!zzth.await(l, timeunit))
				zzB(Status.zzayk);
		}
	//*  54  112:goto            57
		// Misplaced declaration of an exception variable
		catch(TimeUnit timeunit)
	//*  55  115:astore_3        
		{
			zzB(Status.zzayi);
	//   56  116:aload_0         
	//   57  117:getstatic       #257 <Field Status Status.zzayi>
	//   58  120:invokevirtual   #260 <Method void zzB(Status)>
		}
		zzac.zza(isReady(), "Result is not ready.");
		return get();
	//*  59  123:goto            83
	}

	public void cancel()
	{
label0:
		{
			synchronized(zzayO)
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field Object zzayO>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
			{
				if(!zzJ && !zzayV)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #151 <Field boolean zzJ>
	//    7   11:ifne            21
	//    8   14:aload_0         
	//    9   15:getfield        #113 <Field boolean zzayV>
	//   10   18:ifeq            24
			}
	//   11   21:aload_1         
	//   12   22:monitorexit     
			return;
	//   13   23:return          
		}
		zzs zzs1 = zzayX;
	//   14   24:aload_0         
	//   15   25:getfield        #140 <Field zzs zzayX>
	//   16   28:astore_2        
		if(zzs1 == null)
			break MISSING_BLOCK_LABEL_42;
	//   17   29:aload_2         
	//   18   30:ifnull          42
		try
		{
			zzayX.cancel();
	//   19   33:aload_0         
	//   20   34:getfield        #140 <Field zzs zzayX>
	//   21   37:invokeinterface #277 <Method void zzs.cancel()>
		}
	//*  22   42:aload_0         
	//*  23   43:getfield        #128 <Field Result zzayd>
	//*  24   46:invokestatic    #279 <Method void zzd(Result)>
	//*  25   49:aload_0         
	//*  26   50:iconst_1        
	//*  27   51:putfield        #151 <Field boolean zzJ>
	//*  28   54:aload_0         
	//*  29   55:aload_0         
	//*  30   56:getstatic       #282 <Field Status Status.zzayl>
	//*  31   59:invokevirtual   #285 <Method Result zzc(Status)>
	//*  32   62:invokespecial   #287 <Method void zzc(Result)>
	//*  33   65:aload_1         
	//*  34   66:monitorexit     
	//*  35   67:return          
	//*  36   68:astore_2        
	//*  37   69:aload_1         
	//*  38   70:monitorexit     
	//*  39   71:aload_2         
	//*  40   72:athrow          
		catch(RemoteException remoteexception) { }
	//   41   73:astore_2        
		zzd(zzayd);
		zzJ = true;
		zzc(zzc(Status.zzayl));
		obj;
		JVM INSTR monitorexit ;
		return;
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
	//*  42   74:goto            42
	}

	public boolean isCanceled()
	{
		boolean flag;
		synchronized(zzayO)
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field Object zzayO>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			flag = zzJ;
	//    5    7:aload_0         
	//    6    8:getfield        #151 <Field boolean zzJ>
	//    7   11:istore_1        
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		return flag;
	//   10   14:iload_1         
	//   11   15:ireturn         
		exception;
	//   12   16:astore_3        
		obj;
	//   13   17:aload_2         
		JVM INSTR monitorexit ;
	//   14   18:monitorexit     
		throw exception;
	//   15   19:aload_3         
	//   16   20:athrow          
	}

	public final boolean isReady()
	{
		return zzth.getCount() == 0L;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field CountDownLatch zzth>
	//    2    4:invokevirtual   #292 <Method long CountDownLatch.getCount()>
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
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		Object obj = zzayO;
	//    2    2:aload_0         
	//    3    3:getfield        #65  <Field Object zzayO>
	//    4    6:astore          4
		obj;
	//    5    8:aload           4
		JVM INSTR monitorenter ;
	//    6   10:monitorenter    
		if(resultcallback != null)
			break MISSING_BLOCK_LABEL_24;
	//    7   11:aload_1         
	//    8   12:ifnonnull       24
		zzayS = null;
	//    9   15:aload_0         
	//   10   16:aconst_null     
	//   11   17:putfield        #130 <Field ResultCallback zzayS>
		obj;
	//   12   20:aload           4
		JVM INSTR monitorexit ;
	//   13   22:monitorexit     
		return;
	//   14   23:return          
		boolean flag;
		if(!zzayV)
	//*  15   24:aload_0         
	//*  16   25:getfield        #113 <Field boolean zzayV>
	//*  17   28:ifne            72
			flag = true;
	//   18   31:iconst_1        
	//   19   32:istore_2        
		else
	//*  20   33:iload_2         
	//*  21   34:ldc1            #115 <String "Result has already been consumed.">
	//*  22   36:invokestatic    #120 <Method void zzac.zza(boolean, Object)>
	//*  23   39:aload_0         
	//*  24   40:getfield        #247 <Field zzabp zzayY>
	//*  25   43:ifnonnull       77
	//*  26   46:iload_3         
	//*  27   47:istore_2        
	//*  28   48:iload_2         
	//*  29   49:ldc2            #296 <String "Cannot set callbacks if then() has been called.">
	//*  30   52:invokestatic    #120 <Method void zzac.zza(boolean, Object)>
	//*  31   55:aload_0         
	//*  32   56:invokevirtual   #298 <Method boolean isCanceled()>
	//*  33   59:ifeq            82
	//*  34   62:aload           4
	//*  35   64:monitorexit     
	//*  36   65:return          
	//*  37   66:astore_1        
	//*  38   67:aload           4
	//*  39   69:monitorexit     
	//*  40   70:aload_1         
	//*  41   71:athrow          
			flag = false;
	//   42   72:iconst_0        
	//   43   73:istore_2        
		zzac.zza(flag, "Result has already been consumed.");
		if(zzayY == null)
			flag = flag1;
		else
	//*  44   74:goto            33
			flag = false;
	//   45   77:iconst_0        
	//   46   78:istore_2        
		zzac.zza(flag, "Cannot set callbacks if then() has been called.");
		if(!isCanceled())
			break MISSING_BLOCK_LABEL_82;
		obj;
		JVM INSTR monitorexit ;
		return;
		resultcallback;
		obj;
		JVM INSTR monitorexit ;
		throw resultcallback;
	//*  47   79:goto            48
		if(!isReady())
			break MISSING_BLOCK_LABEL_105;
	//   48   82:aload_0         
	//   49   83:invokevirtual   #124 <Method boolean isReady()>
	//   50   86:ifeq            105
		zzayP.zza(resultcallback, get());
	//   51   89:aload_0         
	//   52   90:getfield        #95  <Field zzzx$zza zzayP>
	//   53   93:aload_1         
	//   54   94:aload_0         
	//   55   95:invokespecial   #182 <Method Result get()>
	//   56   98:invokevirtual   #185 <Method void zzzx$zza.zza(ResultCallback, Result)>
_L2:
		obj;
	//   57  101:aload           4
		JVM INSTR monitorexit ;
	//   58  103:monitorexit     
		return;
	//   59  104:return          
		zzayS = resultcallback;
	//   60  105:aload_0         
	//   61  106:aload_1         
	//   62  107:putfield        #130 <Field ResultCallback zzayS>
		if(true) goto _L2; else goto _L1
	//   63  110:goto            101
_L1:
	}

	public final void setResultCallback(ResultCallback resultcallback, long l, TimeUnit timeunit)
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          6
		Object obj = zzayO;
	//    2    3:aload_0         
	//    3    4:getfield        #65  <Field Object zzayO>
	//    4    7:astore          7
		obj;
	//    5    9:aload           7
		JVM INSTR monitorenter ;
	//    6   11:monitorenter    
		if(resultcallback != null)
			break MISSING_BLOCK_LABEL_25;
	//    7   12:aload_1         
	//    8   13:ifnonnull       25
		zzayS = null;
	//    9   16:aload_0         
	//   10   17:aconst_null     
	//   11   18:putfield        #130 <Field ResultCallback zzayS>
		obj;
	//   12   21:aload           7
		JVM INSTR monitorexit ;
	//   13   23:monitorexit     
		return;
	//   14   24:return          
		boolean flag;
		if(!zzayV)
	//*  15   25:aload_0         
	//*  16   26:getfield        #113 <Field boolean zzayV>
	//*  17   29:ifne            78
			flag = true;
	//   18   32:iconst_1        
	//   19   33:istore          5
		else
	//*  20   35:iload           5
	//*  21   37:ldc1            #115 <String "Result has already been consumed.">
	//*  22   39:invokestatic    #120 <Method void zzac.zza(boolean, Object)>
	//*  23   42:aload_0         
	//*  24   43:getfield        #247 <Field zzabp zzayY>
	//*  25   46:ifnonnull       84
	//*  26   49:iload           6
	//*  27   51:istore          5
	//*  28   53:iload           5
	//*  29   55:ldc2            #296 <String "Cannot set callbacks if then() has been called.">
	//*  30   58:invokestatic    #120 <Method void zzac.zza(boolean, Object)>
	//*  31   61:aload_0         
	//*  32   62:invokevirtual   #298 <Method boolean isCanceled()>
	//*  33   65:ifeq            90
	//*  34   68:aload           7
	//*  35   70:monitorexit     
	//*  36   71:return          
	//*  37   72:astore_1        
	//*  38   73:aload           7
	//*  39   75:monitorexit     
	//*  40   76:aload_1         
	//*  41   77:athrow          
			flag = false;
	//   42   78:iconst_0        
	//   43   79:istore          5
		zzac.zza(flag, "Result has already been consumed.");
		if(zzayY == null)
			flag = flag1;
		else
	//*  44   81:goto            35
			flag = false;
	//   45   84:iconst_0        
	//   46   85:istore          5
		zzac.zza(flag, "Cannot set callbacks if then() has been called.");
		if(!isCanceled())
			break MISSING_BLOCK_LABEL_90;
		obj;
		JVM INSTR monitorexit ;
		return;
		resultcallback;
		obj;
		JVM INSTR monitorexit ;
		throw resultcallback;
	//*  47   87:goto            53
		if(!isReady())
			break MISSING_BLOCK_LABEL_113;
	//   48   90:aload_0         
	//   49   91:invokevirtual   #124 <Method boolean isReady()>
	//   50   94:ifeq            113
		zzayP.zza(resultcallback, get());
	//   51   97:aload_0         
	//   52   98:getfield        #95  <Field zzzx$zza zzayP>
	//   53  101:aload_1         
	//   54  102:aload_0         
	//   55  103:invokespecial   #182 <Method Result get()>
	//   56  106:invokevirtual   #185 <Method void zzzx$zza.zza(ResultCallback, Result)>
_L2:
		obj;
	//   57  109:aload           7
		JVM INSTR monitorexit ;
	//   58  111:monitorexit     
		return;
	//   59  112:return          
		zzayS = resultcallback;
	//   60  113:aload_0         
	//   61  114:aload_1         
	//   62  115:putfield        #130 <Field ResultCallback zzayS>
		zzayP.zza(this, timeunit.toMillis(l));
	//   63  118:aload_0         
	//   64  119:getfield        #95  <Field zzzx$zza zzayP>
	//   65  122:aload_0         
	//   66  123:aload           4
	//   67  125:lload_2         
	//   68  126:invokevirtual   #306 <Method long TimeUnit.toMillis(long)>
	//   69  129:invokevirtual   #309 <Method void zzzx$zza.zza(zzzx, long)>
		if(true) goto _L2; else goto _L1
	//   70  132:goto            109
_L1:
	}

	public TransformedResult then(ResultTransform resulttransform)
	{
		boolean flag;
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		Object obj;
		if(!zzayV)
	//*   2    2:aload_0         
	//*   3    3:getfield        #113 <Field boolean zzayV>
	//*   4    6:ifne            131
			flag = true;
	//    5    9:iconst_1        
	//    6   10:istore_2        
		else
	//*   7   11:iload_2         
	//*   8   12:ldc1            #115 <String "Result has already been consumed.">
	//*   9   14:invokestatic    #120 <Method void zzac.zza(boolean, Object)>
	//*  10   17:aload_0         
	//*  11   18:getfield        #65  <Field Object zzayO>
	//*  12   21:astore          4
	//*  13   23:aload           4
	//*  14   25:monitorenter    
	//*  15   26:aload_0         
	//*  16   27:getfield        #247 <Field zzabp zzayY>
	//*  17   30:ifnonnull       136
	//*  18   33:iconst_1        
	//*  19   34:istore_2        
	//*  20   35:iload_2         
	//*  21   36:ldc2            #314 <String "Cannot call then() twice.">
	//*  22   39:invokestatic    #120 <Method void zzac.zza(boolean, Object)>
	//*  23   42:aload_0         
	//*  24   43:getfield        #130 <Field ResultCallback zzayS>
	//*  25   46:ifnonnull       141
	//*  26   49:iload_3         
	//*  27   50:istore_2        
	//*  28   51:iload_2         
	//*  29   52:ldc2            #316 <String "Cannot call then() if callbacks are set.">
	//*  30   55:invokestatic    #120 <Method void zzac.zza(boolean, Object)>
	//*  31   58:aload_0         
	//*  32   59:iconst_1        
	//*  33   60:putfield        #84  <Field boolean zzayZ>
	//*  34   63:aload_0         
	//*  35   64:new             #318 <Class zzabp>
	//*  36   67:dup             
	//*  37   68:aload_0         
	//*  38   69:getfield        #102 <Field WeakReference zzayQ>
	//*  39   72:invokespecial   #321 <Method void zzabp(WeakReference)>
	//*  40   75:putfield        #247 <Field zzabp zzayY>
	//*  41   78:aload_0         
	//*  42   79:getfield        #247 <Field zzabp zzayY>
	//*  43   82:aload_1         
	//*  44   83:invokevirtual   #323 <Method TransformedResult zzabp.then(ResultTransform)>
	//*  45   86:astore_1        
	//*  46   87:aload_0         
	//*  47   88:invokevirtual   #124 <Method boolean isReady()>
	//*  48   91:ifeq            114
	//*  49   94:aload_0         
	//*  50   95:getfield        #95  <Field zzzx$zza zzayP>
	//*  51   98:aload_0         
	//*  52   99:getfield        #247 <Field zzabp zzayY>
	//*  53  102:aload_0         
	//*  54  103:invokespecial   #182 <Method Result get()>
	//*  55  106:invokevirtual   #185 <Method void zzzx$zza.zza(ResultCallback, Result)>
	//*  56  109:aload           4
	//*  57  111:monitorexit     
	//*  58  112:aload_1         
	//*  59  113:areturn         
	//*  60  114:aload_0         
	//*  61  115:aload_0         
	//*  62  116:getfield        #247 <Field zzabp zzayY>
	//*  63  119:putfield        #130 <Field ResultCallback zzayS>
	//*  64  122:goto            109
	//*  65  125:astore_1        
	//*  66  126:aload           4
	//*  67  128:monitorexit     
	//*  68  129:aload_1         
	//*  69  130:athrow          
			flag = false;
	//   70  131:iconst_0        
	//   71  132:istore_2        
		zzac.zza(flag, "Result has already been consumed.");
		obj = zzayO;
		obj;
		JVM INSTR monitorenter ;
		if(zzayY == null)
			flag = true;
		else
	//*  72  133:goto            11
			flag = false;
	//   73  136:iconst_0        
	//   74  137:istore_2        
		zzac.zza(flag, "Cannot call then() twice.");
		if(zzayS == null)
			flag = flag1;
		else
	//*  75  138:goto            35
			flag = false;
	//   76  141:iconst_0        
	//   77  142:istore_2        
		zzac.zza(flag, "Cannot call then() if callbacks are set.");
		zzayZ = true;
		zzayY = new zzabp(zzayQ);
		resulttransform = ((ResultTransform) (zzayY.then(resulttransform)));
		if(!isReady())
			break MISSING_BLOCK_LABEL_114;
		zzayP.zza(((ResultCallback) (zzayY)), get());
_L1:
		obj;
		JVM INSTR monitorexit ;
		return ((TransformedResult) (resulttransform));
		zzayS = ((ResultCallback) (zzayY));
		  goto _L1
		resulttransform;
		obj;
		JVM INSTR monitorexit ;
		throw resulttransform;
	//*  78  143:goto            51
	}

	public final void zzB(Status status)
	{
		synchronized(zzayO)
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field Object zzayO>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			if(!isReady())
	//*   5    7:aload_0         
	//*   6    8:invokevirtual   #124 <Method boolean isReady()>
	//*   7   11:ifne            28
			{
				zzb(zzc(status));
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:invokevirtual   #285 <Method Result zzc(Status)>
	//   12   20:invokevirtual   #326 <Method void zzb(Result)>
				zzayW = true;
	//   13   23:aload_0         
	//   14   24:iconst_1        
	//   15   25:putfield        #328 <Field boolean zzayW>
			}
		}
	//   16   28:aload_2         
	//   17   29:monitorexit     
		return;
	//   18   30:return          
		status;
	//   19   31:astore_1        
		obj;
	//   20   32:aload_2         
		JVM INSTR monitorexit ;
	//   21   33:monitorexit     
		throw status;
	//   22   34:aload_1         
	//   23   35:athrow          
	}

	public final void zza(com.google.android.gms.common.api.PendingResult.zza zza1)
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		boolean flag;
		Object obj;
		if(!zzayV)
	//*   2    2:aload_0         
	//*   3    3:getfield        #113 <Field boolean zzayV>
	//*   4    6:ifne            83
			flag = true;
	//    5    9:iconst_1        
	//    6   10:istore_2        
		else
	//*   7   11:iload_2         
	//*   8   12:ldc1            #115 <String "Result has already been consumed.">
	//*   9   14:invokestatic    #120 <Method void zzac.zza(boolean, Object)>
	//*  10   17:aload_1         
	//*  11   18:ifnull          88
	//*  12   21:iload_3         
	//*  13   22:istore_2        
	//*  14   23:iload_2         
	//*  15   24:ldc2            #331 <String "Callback cannot be null.">
	//*  16   27:invokestatic    #333 <Method void zzac.zzb(boolean, Object)>
	//*  17   30:aload_0         
	//*  18   31:getfield        #65  <Field Object zzayO>
	//*  19   34:astore          4
	//*  20   36:aload           4
	//*  21   38:monitorenter    
	//*  22   39:aload_0         
	//*  23   40:invokevirtual   #124 <Method boolean isReady()>
	//*  24   43:ifeq            65
	//*  25   46:aload_1         
	//*  26   47:aload_0         
	//*  27   48:getfield        #128 <Field Result zzayd>
	//*  28   51:invokeinterface #149 <Method Status Result.getStatus()>
	//*  29   56:invokeinterface #170 <Method void com.google.android.gms.common.api.PendingResult$zza.zzx(Status)>
	//*  30   61:aload           4
	//*  31   63:monitorexit     
	//*  32   64:return          
	//*  33   65:aload_0         
	//*  34   66:getfield        #77  <Field ArrayList zzayR>
	//*  35   69:aload_1         
	//*  36   70:invokevirtual   #337 <Method boolean ArrayList.add(Object)>
	//*  37   73:pop             
	//*  38   74:goto            61
	//*  39   77:astore_1        
	//*  40   78:aload           4
	//*  41   80:monitorexit     
	//*  42   81:aload_1         
	//*  43   82:athrow          
			flag = false;
	//   44   83:iconst_0        
	//   45   84:istore_2        
		zzac.zza(flag, "Result has already been consumed.");
		if(zza1 != null)
			flag = flag1;
		else
	//*  46   85:goto            11
			flag = false;
	//   47   88:iconst_0        
	//   48   89:istore_2        
		zzac.zzb(flag, "Callback cannot be null.");
		obj = zzayO;
		obj;
		JVM INSTR monitorenter ;
		if(!isReady())
			break MISSING_BLOCK_LABEL_65;
		zza1.zzx(zzayd.getStatus());
_L2:
		return;
		zzayR.add(((Object) (zza1)));
		if(true) goto _L2; else goto _L1
_L1:
		zza1;
		obj;
		JVM INSTR monitorexit ;
		throw zza1;
	//*  49   90:goto            23
	}

	protected final void zza(zzs zzs1)
	{
		synchronized(zzayO)
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field Object zzayO>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			zzayX = zzs1;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #140 <Field zzs zzayX>
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		return;
	//   10   14:return          
		zzs1;
	//   11   15:astore_1        
		obj;
	//   12   16:aload_2         
		JVM INSTR monitorexit ;
	//   13   17:monitorexit     
		throw zzs1;
	//   14   18:aload_1         
	//   15   19:athrow          
	}

	public void zza(zzabq.zzb zzb1)
	{
		zzayT.set(((Object) (zzb1)));
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field AtomicReference zzayT>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #342 <Method void AtomicReference.set(Object)>
	//    4    8:return          
	}

	public final void zzb(Result result)
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		Object obj = zzayO;
	//    2    2:aload_0         
	//    3    3:getfield        #65  <Field Object zzayO>
	//    4    6:astore          4
		obj;
	//    5    8:aload           4
		JVM INSTR monitorenter ;
	//    6   10:monitorenter    
		if(zzayW || zzJ)
			break MISSING_BLOCK_LABEL_72;
	//    7   11:aload_0         
	//    8   12:getfield        #328 <Field boolean zzayW>
	//    9   15:ifne            72
	//   10   18:aload_0         
	//   11   19:getfield        #151 <Field boolean zzJ>
	//   12   22:ifne            72
		if(!isReady());
	//   13   25:aload_0         
	//   14   26:invokevirtual   #124 <Method boolean isReady()>
	//   15   29:ifeq            32
		boolean flag;
		if(!isReady())
	//*  16   32:aload_0         
	//*  17   33:invokevirtual   #124 <Method boolean isReady()>
	//*  18   36:ifne            86
			flag = true;
	//   19   39:iconst_1        
	//   20   40:istore_2        
		else
	//*  21   41:iload_2         
	//*  22   42:ldc2            #344 <String "Results have already been set">
	//*  23   45:invokestatic    #120 <Method void zzac.zza(boolean, Object)>
	//*  24   48:aload_0         
	//*  25   49:getfield        #113 <Field boolean zzayV>
	//*  26   52:ifne            91
	//*  27   55:iload_3         
	//*  28   56:istore_2        
	//*  29   57:iload_2         
	//*  30   58:ldc1            #245 <String "Result has already been consumed">
	//*  31   60:invokestatic    #120 <Method void zzac.zza(boolean, Object)>
	//*  32   63:aload_0         
	//*  33   64:aload_1         
	//*  34   65:invokespecial   #287 <Method void zzc(Result)>
	//*  35   68:aload           4
	//*  36   70:monitorexit     
	//*  37   71:return          
	//*  38   72:aload_1         
	//*  39   73:invokestatic    #279 <Method void zzd(Result)>
	//*  40   76:aload           4
	//*  41   78:monitorexit     
	//*  42   79:return          
	//*  43   80:astore_1        
	//*  44   81:aload           4
	//*  45   83:monitorexit     
	//*  46   84:aload_1         
	//*  47   85:athrow          
			flag = false;
	//   48   86:iconst_0        
	//   49   87:istore_2        
		zzac.zza(flag, "Results have already been set");
		if(!zzayV)
			flag = flag1;
		else
	//*  50   88:goto            41
			flag = false;
	//   51   91:iconst_0        
	//   52   92:istore_2        
		zzac.zza(flag, "Result has already been consumed");
		zzc(result);
		obj;
		JVM INSTR monitorexit ;
		return;
		zzd(result);
		obj;
		JVM INSTR monitorexit ;
		return;
		result;
		obj;
		JVM INSTR monitorexit ;
		throw result;
	//*  53   93:goto            57
	}

	protected abstract Result zzc(Status status);

	public Integer zzuR()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public boolean zzvc()
	{
		boolean flag;
		synchronized(zzayO)
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field Object zzayO>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			if((GoogleApiClient)zzayQ.get() == null || !zzayZ)
	//*   5    7:aload_0         
	//*   6    8:getfield        #102 <Field WeakReference zzayQ>
	//*   7   11:invokevirtual   #350 <Method Object WeakReference.get()>
	//*   8   14:checkcast       #106 <Class GoogleApiClient>
	//*   9   17:ifnull          27
	//*  10   20:aload_0         
	//*  11   21:getfield        #84  <Field boolean zzayZ>
	//*  12   24:ifne            31
				cancel();
	//   13   27:aload_0         
	//   14   28:invokevirtual   #351 <Method void cancel()>
			flag = isCanceled();
	//   15   31:aload_0         
	//   16   32:invokevirtual   #298 <Method boolean isCanceled()>
	//   17   35:istore_1        
		}
	//   18   36:aload_2         
	//   19   37:monitorexit     
		return flag;
	//   20   38:iload_1         
	//   21   39:ireturn         
		exception;
	//   22   40:astore_3        
		obj;
	//   23   41:aload_2         
		JVM INSTR monitorexit ;
	//   24   42:monitorexit     
		throw exception;
	//   25   43:aload_3         
	//   26   44:athrow          
	}

	public void zzve()
	{
		setResultCallback(((ResultCallback) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #354 <Method void setResultCallback(ResultCallback)>
	//    3    5:return          
	}

	public void zzvf()
	{
		boolean flag;
		if(zzayZ || ((Boolean)zzayN.get()).booleanValue())
	//*   0    0:aload_0         
	//*   1    1:getfield        #84  <Field boolean zzayZ>
	//*   2    4:ifne            22
	//*   3    7:getstatic       #57  <Field ThreadLocal zzayN>
	//*   4   10:invokevirtual   #358 <Method Object ThreadLocal.get()>
	//*   5   13:checkcast       #360 <Class Boolean>
	//*   6   16:invokevirtual   #363 <Method boolean Boolean.booleanValue()>
	//*   7   19:ifeq            30
			flag = true;
	//    8   22:iconst_1        
	//    9   23:istore_1        
		else
	//*  10   24:aload_0         
	//*  11   25:iload_1         
	//*  12   26:putfield        #84  <Field boolean zzayZ>
	//*  13   29:return          
			flag = false;
	//   14   30:iconst_0        
	//   15   31:istore_1        
		zzayZ = flag;
	//*  16   32:goto            24
	}

	static final ThreadLocal zzayN = new ThreadLocal() {

		protected Object initialValue()
		{
			return ((Object) (zzvg()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #18  <Method Boolean zzvg()>
		//    2    4:areturn         
		}

		protected Boolean zzvg()
		{
			return Boolean.valueOf(false);
		//    0    0:iconst_0        
		//    1    1:invokestatic    #24  <Method Boolean Boolean.valueOf(boolean)>
		//    2    4:areturn         
		}

	}
;
	private boolean zzJ;
	private final Object zzayO;
	protected final zza zzayP;
	protected final WeakReference zzayQ;
	private final ArrayList zzayR;
	private ResultCallback zzayS;
	private final AtomicReference zzayT;
	private zzb zzayU;
	private volatile boolean zzayV;
	private boolean zzayW;
	private zzs zzayX;
	private volatile zzabp zzayY;
	private boolean zzayZ;
	private Result zzayd;
	private final CountDownLatch zzth;

	static 
	{
	//    0    0:new             #7   <Class zzzx$1>
	//    1    3:dup             
	//    2    4:invokespecial   #55  <Method void zzzx$1()>
	//    3    7:putstatic       #57  <Field ThreadLocal zzayN>
	//*   4   10:return          
	}
}
