// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.os.*;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zzo, zzcn, zzch

public abstract class BasePendingResult extends PendingResult
{
	public static class CallbackHandler extends Handler
	{

		public void handleMessage(Message message)
		{
			Object obj;
			switch(message.what)
		//*   0    0:aload_1         
		//*   1    1:getfield        #32  <Field int Message.what>
			{
		//*   2    4:tableswitch     1 2: default 28
		//		               1 88
		//		               2 74
			default:
				int i = message.what;
		//    3   28:aload_1         
		//    4   29:getfield        #32  <Field int Message.what>
		//    5   32:istore_2        
				message = ((Message) (new StringBuilder(45)));
		//    6   33:new             #34  <Class StringBuilder>
		//    7   36:dup             
		//    8   37:bipush          45
		//    9   39:invokespecial   #37  <Method void StringBuilder(int)>
		//   10   42:astore_1        
				((StringBuilder) (message)).append("Don't know how to handle message: ");
		//   11   43:aload_1         
		//   12   44:ldc1            #39  <String "Don't know how to handle message: ">
		//   13   46:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
		//   14   49:pop             
				((StringBuilder) (message)).append(i);
		//   15   50:aload_1         
		//   16   51:iload_2         
		//   17   52:invokevirtual   #46  <Method StringBuilder StringBuilder.append(int)>
		//   18   55:pop             
				Log.wtf("BasePendingResult", ((StringBuilder) (message)).toString(), ((Throwable) (new Exception())));
		//   19   56:ldc1            #48  <String "BasePendingResult">
		//   20   58:aload_1         
		//   21   59:invokevirtual   #52  <Method String StringBuilder.toString()>
		//   22   62:new             #54  <Class Exception>
		//   23   65:dup             
		//   24   66:invokespecial   #56  <Method void Exception()>
		//   25   69:invokestatic    #62  <Method int Log.wtf(String, String, Throwable)>
		//   26   72:pop             
				return;
		//   27   73:return          

			case 2: // '\002'
				((BasePendingResult)message.obj).zzb(Status.RESULT_TIMEOUT);
		//   28   74:aload_1         
		//   29   75:getfield        #66  <Field Object Message.obj>
		//   30   78:checkcast       #7   <Class BasePendingResult>
		//   31   81:getstatic       #72  <Field Status Status.RESULT_TIMEOUT>
		//   32   84:invokevirtual   #76  <Method void BasePendingResult.zzb(Status)>
				return;
		//   33   87:return          

			case 1: // '\001'
				obj = ((Object) ((Pair)message.obj));
		//   34   88:aload_1         
		//   35   89:getfield        #66  <Field Object Message.obj>
		//   36   92:checkcast       #78  <Class Pair>
		//   37   95:astore_3        
				message = ((Message) ((ResultCallback)((Pair) (obj)).first));
		//   38   96:aload_3         
		//   39   97:getfield        #81  <Field Object Pair.first>
		//   40  100:checkcast       #83  <Class ResultCallback>
		//   41  103:astore_1        
				obj = ((Object) ((Result)((Pair) (obj)).second));
		//   42  104:aload_3         
		//   43  105:getfield        #86  <Field Object Pair.second>
		//   44  108:checkcast       #88  <Class Result>
		//   45  111:astore_3        
				break;
			}
			try
			{
				((ResultCallback) (message)).onResult(((Result) (obj)));
		//   46  112:aload_1         
		//   47  113:aload_3         
		//   48  114:invokeinterface #92  <Method void ResultCallback.onResult(Result)>
				return;
		//   49  119:return          
			}
			// Misplaced declaration of an exception variable
			catch(Message message)
		//*  50  120:astore_1        
			{
				BasePendingResult.zzb(((Result) (obj)));
		//   51  121:aload_3         
		//   52  122:invokestatic    #94  <Method void BasePendingResult.zzb(Result)>
			}
			throw message;
		//   53  125:aload_1         
		//   54  126:athrow          
		}

		public final void zza(ResultCallback resultcallback, Result result)
		{
			sendMessage(obtainMessage(1, ((Object) (new Pair(((Object) (resultcallback)), ((Object) (result)))))));
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:iconst_1        
		//    3    3:new             #78  <Class Pair>
		//    4    6:dup             
		//    5    7:aload_1         
		//    6    8:aload_2         
		//    7    9:invokespecial   #99  <Method void Pair(Object, Object)>
		//    8   12:invokevirtual   #103 <Method Message obtainMessage(int, Object)>
		//    9   15:invokevirtual   #107 <Method boolean sendMessage(Message)>
		//   10   18:pop             
		//   11   19:return          
		}

		public CallbackHandler()
		{
			this(Looper.getMainLooper());
		//    0    0:aload_0         
		//    1    1:invokestatic    #17  <Method Looper Looper.getMainLooper()>
		//    2    4:invokespecial   #20  <Method void BasePendingResult$CallbackHandler(Looper)>
		//    3    7:return          
		}

		public CallbackHandler(Looper looper)
		{
			super(looper);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #22  <Method void Handler(Looper)>
		//    3    5:return          
		}
	}

	private final class zza
	{

		protected final void finalize()
			throws Throwable
		{
			BasePendingResult.zzb(BasePendingResult.zza(zzfn));
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field BasePendingResult zzfn>
		//    2    4:invokestatic    #26  <Method Result BasePendingResult.zza(BasePendingResult)>
		//    3    7:invokestatic    #30  <Method void BasePendingResult.zzb(Result)>
			super.finalize();
		//    4   10:aload_0         
		//    5   11:invokespecial   #32  <Method void Object.finalize()>
		//    6   14:return          
		}

		private final BasePendingResult zzfn;

		private zza()
		{
			zzfn = BasePendingResult.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field BasePendingResult zzfn>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void Object()>
		//    5    9:return          
		}

		zza(zzo zzo1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #20  <Method void BasePendingResult$zza(BasePendingResult)>
		//    3    5:return          
		}
	}


	BasePendingResult()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #64  <Method void PendingResult()>
		zzfa = new Object();
	//    2    4:aload_0         
	//    3    5:new             #66  <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #67  <Method void Object()>
	//    6   12:putfield        #69  <Field Object zzfa>
		zzfd = new CountDownLatch(1);
	//    7   15:aload_0         
	//    8   16:new             #71  <Class CountDownLatch>
	//    9   19:dup             
	//   10   20:iconst_1        
	//   11   21:invokespecial   #74  <Method void CountDownLatch(int)>
	//   12   24:putfield        #76  <Field CountDownLatch zzfd>
		zzfe = new ArrayList();
	//   13   27:aload_0         
	//   14   28:new             #78  <Class ArrayList>
	//   15   31:dup             
	//   16   32:invokespecial   #79  <Method void ArrayList()>
	//   17   35:putfield        #81  <Field ArrayList zzfe>
		zzfg = new AtomicReference();
	//   18   38:aload_0         
	//   19   39:new             #83  <Class AtomicReference>
	//   20   42:dup             
	//   21   43:invokespecial   #84  <Method void AtomicReference()>
	//   22   46:putfield        #86  <Field AtomicReference zzfg>
		zzfm = false;
	//   23   49:aload_0         
	//   24   50:iconst_0        
	//   25   51:putfield        #88  <Field boolean zzfm>
		zzfb = new CallbackHandler(Looper.getMainLooper());
	//   26   54:aload_0         
	//   27   55:new             #7   <Class BasePendingResult$CallbackHandler>
	//   28   58:dup             
	//   29   59:invokestatic    #94  <Method Looper Looper.getMainLooper()>
	//   30   62:invokespecial   #97  <Method void BasePendingResult$CallbackHandler(Looper)>
	//   31   65:putfield        #99  <Field BasePendingResult$CallbackHandler zzfb>
		zzfc = new WeakReference(((Object) (null)));
	//   32   68:aload_0         
	//   33   69:new             #101 <Class WeakReference>
	//   34   72:dup             
	//   35   73:aconst_null     
	//   36   74:invokespecial   #104 <Method void WeakReference(Object)>
	//   37   77:putfield        #106 <Field WeakReference zzfc>
	//   38   80:return          
	}

	protected BasePendingResult(Looper looper)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #64  <Method void PendingResult()>
		zzfa = new Object();
	//    2    4:aload_0         
	//    3    5:new             #66  <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #67  <Method void Object()>
	//    6   12:putfield        #69  <Field Object zzfa>
		zzfd = new CountDownLatch(1);
	//    7   15:aload_0         
	//    8   16:new             #71  <Class CountDownLatch>
	//    9   19:dup             
	//   10   20:iconst_1        
	//   11   21:invokespecial   #74  <Method void CountDownLatch(int)>
	//   12   24:putfield        #76  <Field CountDownLatch zzfd>
		zzfe = new ArrayList();
	//   13   27:aload_0         
	//   14   28:new             #78  <Class ArrayList>
	//   15   31:dup             
	//   16   32:invokespecial   #79  <Method void ArrayList()>
	//   17   35:putfield        #81  <Field ArrayList zzfe>
		zzfg = new AtomicReference();
	//   18   38:aload_0         
	//   19   39:new             #83  <Class AtomicReference>
	//   20   42:dup             
	//   21   43:invokespecial   #84  <Method void AtomicReference()>
	//   22   46:putfield        #86  <Field AtomicReference zzfg>
		zzfm = false;
	//   23   49:aload_0         
	//   24   50:iconst_0        
	//   25   51:putfield        #88  <Field boolean zzfm>
		zzfb = new CallbackHandler(looper);
	//   26   54:aload_0         
	//   27   55:new             #7   <Class BasePendingResult$CallbackHandler>
	//   28   58:dup             
	//   29   59:aload_1         
	//   30   60:invokespecial   #97  <Method void BasePendingResult$CallbackHandler(Looper)>
	//   31   63:putfield        #99  <Field BasePendingResult$CallbackHandler zzfb>
		zzfc = new WeakReference(((Object) (null)));
	//   32   66:aload_0         
	//   33   67:new             #101 <Class WeakReference>
	//   34   70:dup             
	//   35   71:aconst_null     
	//   36   72:invokespecial   #104 <Method void WeakReference(Object)>
	//   37   75:putfield        #106 <Field WeakReference zzfc>
	//   38   78:return          
	}

	protected BasePendingResult(GoogleApiClient googleapiclient)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #64  <Method void PendingResult()>
		zzfa = new Object();
	//    2    4:aload_0         
	//    3    5:new             #66  <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #67  <Method void Object()>
	//    6   12:putfield        #69  <Field Object zzfa>
		zzfd = new CountDownLatch(1);
	//    7   15:aload_0         
	//    8   16:new             #71  <Class CountDownLatch>
	//    9   19:dup             
	//   10   20:iconst_1        
	//   11   21:invokespecial   #74  <Method void CountDownLatch(int)>
	//   12   24:putfield        #76  <Field CountDownLatch zzfd>
		zzfe = new ArrayList();
	//   13   27:aload_0         
	//   14   28:new             #78  <Class ArrayList>
	//   15   31:dup             
	//   16   32:invokespecial   #79  <Method void ArrayList()>
	//   17   35:putfield        #81  <Field ArrayList zzfe>
		zzfg = new AtomicReference();
	//   18   38:aload_0         
	//   19   39:new             #83  <Class AtomicReference>
	//   20   42:dup             
	//   21   43:invokespecial   #84  <Method void AtomicReference()>
	//   22   46:putfield        #86  <Field AtomicReference zzfg>
		zzfm = false;
	//   23   49:aload_0         
	//   24   50:iconst_0        
	//   25   51:putfield        #88  <Field boolean zzfm>
		Looper looper;
		if(googleapiclient != null)
	//*  26   54:aload_1         
	//*  27   55:ifnull          66
			looper = googleapiclient.getLooper();
	//   28   58:aload_1         
	//   29   59:invokevirtual   #114 <Method Looper GoogleApiClient.getLooper()>
	//   30   62:astore_2        
		else
	//*  31   63:goto            70
			looper = Looper.getMainLooper();
	//   32   66:invokestatic    #94  <Method Looper Looper.getMainLooper()>
	//   33   69:astore_2        
		zzfb = new CallbackHandler(looper);
	//   34   70:aload_0         
	//   35   71:new             #7   <Class BasePendingResult$CallbackHandler>
	//   36   74:dup             
	//   37   75:aload_2         
	//   38   76:invokespecial   #97  <Method void BasePendingResult$CallbackHandler(Looper)>
	//   39   79:putfield        #99  <Field BasePendingResult$CallbackHandler zzfb>
		zzfc = new WeakReference(((Object) (googleapiclient)));
	//   40   82:aload_0         
	//   41   83:new             #101 <Class WeakReference>
	//   42   86:dup             
	//   43   87:aload_1         
	//   44   88:invokespecial   #104 <Method void WeakReference(Object)>
	//   45   91:putfield        #106 <Field WeakReference zzfc>
	//   46   94:return          
	}

	protected BasePendingResult(CallbackHandler callbackhandler)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #64  <Method void PendingResult()>
		zzfa = new Object();
	//    2    4:aload_0         
	//    3    5:new             #66  <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #67  <Method void Object()>
	//    6   12:putfield        #69  <Field Object zzfa>
		zzfd = new CountDownLatch(1);
	//    7   15:aload_0         
	//    8   16:new             #71  <Class CountDownLatch>
	//    9   19:dup             
	//   10   20:iconst_1        
	//   11   21:invokespecial   #74  <Method void CountDownLatch(int)>
	//   12   24:putfield        #76  <Field CountDownLatch zzfd>
		zzfe = new ArrayList();
	//   13   27:aload_0         
	//   14   28:new             #78  <Class ArrayList>
	//   15   31:dup             
	//   16   32:invokespecial   #79  <Method void ArrayList()>
	//   17   35:putfield        #81  <Field ArrayList zzfe>
		zzfg = new AtomicReference();
	//   18   38:aload_0         
	//   19   39:new             #83  <Class AtomicReference>
	//   20   42:dup             
	//   21   43:invokespecial   #84  <Method void AtomicReference()>
	//   22   46:putfield        #86  <Field AtomicReference zzfg>
		zzfm = false;
	//   23   49:aload_0         
	//   24   50:iconst_0        
	//   25   51:putfield        #88  <Field boolean zzfm>
		zzfb = (CallbackHandler)Preconditions.checkNotNull(((Object) (callbackhandler)), "CallbackHandler must not be null");
	//   26   54:aload_0         
	//   27   55:aload_1         
	//   28   56:ldc1            #119 <String "CallbackHandler must not be null">
	//   29   58:invokestatic    #125 <Method Object Preconditions.checkNotNull(Object, Object)>
	//   30   61:checkcast       #7   <Class BasePendingResult$CallbackHandler>
	//   31   64:putfield        #99  <Field BasePendingResult$CallbackHandler zzfb>
		zzfc = new WeakReference(((Object) (null)));
	//   32   67:aload_0         
	//   33   68:new             #101 <Class WeakReference>
	//   34   71:dup             
	//   35   72:aconst_null     
	//   36   73:invokespecial   #104 <Method void WeakReference(Object)>
	//   37   76:putfield        #106 <Field WeakReference zzfc>
	//   38   79:return          
	}

	private final Result get()
	{
		Result result;
		synchronized(zzfa)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field Object zzfa>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			Preconditions.checkState(zzfh ^ true, "Result has already been consumed.");
	//    5    7:aload_0         
	//    6    8:getfield        #132 <Field boolean zzfh>
	//    7   11:iconst_1        
	//    8   12:ixor            
	//    9   13:ldc1            #134 <String "Result has already been consumed.">
	//   10   15:invokestatic    #138 <Method void Preconditions.checkState(boolean, Object)>
			Preconditions.checkState(isReady(), "Result is not ready.");
	//   11   18:aload_0         
	//   12   19:invokevirtual   #142 <Method boolean isReady()>
	//   13   22:ldc1            #144 <String "Result is not ready.">
	//   14   24:invokestatic    #138 <Method void Preconditions.checkState(boolean, Object)>
			result = zzdm;
	//   15   27:aload_0         
	//   16   28:getfield        #146 <Field Result zzdm>
	//   17   31:astore_2        
			zzdm = null;
	//   18   32:aload_0         
	//   19   33:aconst_null     
	//   20   34:putfield        #146 <Field Result zzdm>
			zzff = null;
	//   21   37:aload_0         
	//   22   38:aconst_null     
	//   23   39:putfield        #148 <Field ResultCallback zzff>
			zzfh = true;
	//   24   42:aload_0         
	//   25   43:iconst_1        
	//   26   44:putfield        #132 <Field boolean zzfh>
		}
	//   27   47:aload_1         
	//   28   48:monitorexit     
		obj = ((Object) ((zzcn)zzfg.getAndSet(((Object) (null)))));
	//   29   49:aload_0         
	//   30   50:getfield        #86  <Field AtomicReference zzfg>
	//   31   53:aconst_null     
	//   32   54:invokevirtual   #152 <Method Object AtomicReference.getAndSet(Object)>
	//   33   57:checkcast       #154 <Class zzcn>
	//   34   60:astore_1        
		if(obj != null)
	//*  35   61:aload_1         
	//*  36   62:ifnull          72
			((zzcn) (obj)).zzc(this);
	//   37   65:aload_1         
	//   38   66:aload_0         
	//   39   67:invokeinterface #158 <Method void zzcn.zzc(BasePendingResult)>
		return result;
	//   40   72:aload_2         
	//   41   73:areturn         
		exception;
	//   42   74:astore_2        
		obj;
	//   43   75:aload_1         
		JVM INSTR monitorexit ;
	//   44   76:monitorexit     
		throw exception;
	//   45   77:aload_2         
	//   46   78:athrow          
	}

	static Result zza(BasePendingResult basependingresult)
	{
		return basependingresult.zzdm;
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field Result zzdm>
	//    2    4:areturn         
	}

	private final void zza(Result result)
	{
		zzdm = result;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #146 <Field Result zzdm>
		zzfk = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #163 <Field ICancelToken zzfk>
		zzfd.countDown();
	//    6   10:aload_0         
	//    7   11:getfield        #76  <Field CountDownLatch zzfd>
	//    8   14:invokevirtual   #166 <Method void CountDownLatch.countDown()>
		mStatus = zzdm.getStatus();
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #146 <Field Result zzdm>
	//   12   22:invokeinterface #172 <Method Status Result.getStatus()>
	//   13   27:putfield        #174 <Field Status mStatus>
		if(zzfi)
	//*  14   30:aload_0         
	//*  15   31:getfield        #176 <Field boolean zzfi>
	//*  16   34:ifeq            45
			zzff = null;
	//   17   37:aload_0         
	//   18   38:aconst_null     
	//   19   39:putfield        #148 <Field ResultCallback zzff>
		else
	//*  20   42:goto            101
		if(zzff == null)
	//*  21   45:aload_0         
	//*  22   46:getfield        #148 <Field ResultCallback zzff>
	//*  23   49:ifnonnull       78
		{
			if(zzdm instanceof Releasable)
	//*  24   52:aload_0         
	//*  25   53:getfield        #146 <Field Result zzdm>
	//*  26   56:instanceof      #178 <Class Releasable>
	//*  27   59:ifeq            101
				mResultGuardian = new zza(((zzo) (null)));
	//   28   62:aload_0         
	//   29   63:new             #10  <Class BasePendingResult$zza>
	//   30   66:dup             
	//   31   67:aload_0         
	//   32   68:aconst_null     
	//   33   69:invokespecial   #181 <Method void BasePendingResult$zza(BasePendingResult, zzo)>
	//   34   72:putfield        #183 <Field BasePendingResult$zza mResultGuardian>
		} else
	//*  35   75:goto            101
		{
			zzfb.removeMessages(2);
	//   36   78:aload_0         
	//   37   79:getfield        #99  <Field BasePendingResult$CallbackHandler zzfb>
	//   38   82:iconst_2        
	//   39   83:invokevirtual   #186 <Method void BasePendingResult$CallbackHandler.removeMessages(int)>
			zzfb.zza(zzff, get());
	//   40   86:aload_0         
	//   41   87:getfield        #99  <Field BasePendingResult$CallbackHandler zzfb>
	//   42   90:aload_0         
	//   43   91:getfield        #148 <Field ResultCallback zzff>
	//   44   94:aload_0         
	//   45   95:invokespecial   #188 <Method Result get()>
	//   46   98:invokevirtual   #191 <Method void BasePendingResult$CallbackHandler.zza(ResultCallback, Result)>
		}
		result = ((Result) ((ArrayList)zzfe));
	//   47  101:aload_0         
	//   48  102:getfield        #81  <Field ArrayList zzfe>
	//   49  105:checkcast       #78  <Class ArrayList>
	//   50  108:astore_1        
		int j = ((ArrayList) (result)).size();
	//   51  109:aload_1         
	//   52  110:invokevirtual   #195 <Method int ArrayList.size()>
	//   53  113:istore_3        
		for(int i = 0; i < j;)
	//*  54  114:iconst_0        
	//*  55  115:istore_2        
	//*  56  116:iload_2         
	//*  57  117:iload_3         
	//*  58  118:icmpge          149
		{
			Object obj = ((ArrayList) (result)).get(i);
	//   59  121:aload_1         
	//   60  122:iload_2         
	//   61  123:invokevirtual   #198 <Method Object ArrayList.get(int)>
	//   62  126:astore          4
			i++;
	//   63  128:iload_2         
	//   64  129:iconst_1        
	//   65  130:iadd            
	//   66  131:istore_2        
			((com.google.android.gms.common.api.PendingResult.StatusListener)obj).onComplete(mStatus);
	//   67  132:aload           4
	//   68  134:checkcast       #200 <Class com.google.android.gms.common.api.PendingResult$StatusListener>
	//   69  137:aload_0         
	//   70  138:getfield        #174 <Field Status mStatus>
	//   71  141:invokeinterface #204 <Method void com.google.android.gms.common.api.PendingResult$StatusListener.onComplete(Status)>
		}

	//*  72  146:goto            116
		zzfe.clear();
	//   73  149:aload_0         
	//   74  150:getfield        #81  <Field ArrayList zzfe>
	//   75  153:invokevirtual   #207 <Method void ArrayList.clear()>
	//   76  156:return          
	}

	public static void zzb(Result result)
	{
		if(result instanceof Releasable)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #178 <Class Releasable>
	//*   2    4:ifeq            65
			try
			{
				((Releasable)result).release();
	//    3    7:aload_0         
	//    4    8:checkcast       #178 <Class Releasable>
	//    5   11:invokeinterface #214 <Method void Releasable.release()>
				return;
	//    6   16:return          
			}
			catch(RuntimeException runtimeexception)
	//*   7   17:astore_1        
			{
				result = ((Result) (String.valueOf(((Object) (result)))));
	//    8   18:aload_0         
	//    9   19:invokestatic    #220 <Method String String.valueOf(Object)>
	//   10   22:astore_0        
				StringBuilder stringbuilder = new StringBuilder(18 + String.valueOf(((Object) (result))).length());
	//   11   23:new             #222 <Class StringBuilder>
	//   12   26:dup             
	//   13   27:bipush          18
	//   14   29:aload_0         
	//   15   30:invokestatic    #220 <Method String String.valueOf(Object)>
	//   16   33:invokevirtual   #225 <Method int String.length()>
	//   17   36:iadd            
	//   18   37:invokespecial   #226 <Method void StringBuilder(int)>
	//   19   40:astore_2        
				stringbuilder.append("Unable to release ");
	//   20   41:aload_2         
	//   21   42:ldc1            #228 <String "Unable to release ">
	//   22   44:invokevirtual   #232 <Method StringBuilder StringBuilder.append(String)>
	//   23   47:pop             
				stringbuilder.append(((String) (result)));
	//   24   48:aload_2         
	//   25   49:aload_0         
	//   26   50:invokevirtual   #232 <Method StringBuilder StringBuilder.append(String)>
	//   27   53:pop             
				Log.w("BasePendingResult", stringbuilder.toString(), ((Throwable) (runtimeexception)));
	//   28   54:ldc1            #234 <String "BasePendingResult">
	//   29   56:aload_2         
	//   30   57:invokevirtual   #238 <Method String StringBuilder.toString()>
	//   31   60:aload_1         
	//   32   61:invokestatic    #244 <Method int Log.w(String, String, Throwable)>
	//   33   64:pop             
			}
	//   34   65:return          
	}

	public final void addStatusListener(com.google.android.gms.common.api.PendingResult.StatusListener statuslistener)
	{
		boolean flag;
		if(statuslistener != null)
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
		Preconditions.checkArgument(flag, "Callback cannot be null.");
	//    7   11:iload_2         
	//    8   12:ldc1            #248 <String "Callback cannot be null.">
	//    9   14:invokestatic    #251 <Method void Preconditions.checkArgument(boolean, Object)>
		Object obj = zzfa;
	//   10   17:aload_0         
	//   11   18:getfield        #69  <Field Object zzfa>
	//   12   21:astore_3        
		obj;
	//   13   22:aload_3         
		JVM INSTR monitorenter ;
	//   14   23:monitorenter    
		if(isReady())
	//*  15   24:aload_0         
	//*  16   25:invokevirtual   #142 <Method boolean isReady()>
	//*  17   28:ifeq            44
		{
			statuslistener.onComplete(mStatus);
	//   18   31:aload_1         
	//   19   32:aload_0         
	//   20   33:getfield        #174 <Field Status mStatus>
	//   21   36:invokeinterface #204 <Method void com.google.android.gms.common.api.PendingResult$StatusListener.onComplete(Status)>
			break MISSING_BLOCK_LABEL_53;
	//   22   41:goto            53
		}
		zzfe.add(((Object) (statuslistener)));
	//   23   44:aload_0         
	//   24   45:getfield        #81  <Field ArrayList zzfe>
	//   25   48:aload_1         
	//   26   49:invokevirtual   #255 <Method boolean ArrayList.add(Object)>
	//   27   52:pop             
		obj;
	//   28   53:aload_3         
		JVM INSTR monitorexit ;
	//   29   54:monitorexit     
		return;
	//   30   55:return          
		statuslistener;
	//   31   56:astore_1        
		obj;
	//   32   57:aload_3         
		JVM INSTR monitorexit ;
	//   33   58:monitorexit     
		throw statuslistener;
	//   34   59:aload_1         
	//   35   60:athrow          
	}

	public final Result await()
	{
		InterruptedException interruptedexception;
		Preconditions.checkNotMainThread("await must not be called on the UI thread");
	//    0    0:ldc2            #260 <String "await must not be called on the UI thread">
	//    1    3:invokestatic    #264 <Method void Preconditions.checkNotMainThread(String)>
		boolean flag1 = zzfh;
	//    2    6:aload_0         
	//    3    7:getfield        #132 <Field boolean zzfh>
	//    4   10:istore_2        
		boolean flag = true;
	//    5   11:iconst_1        
	//    6   12:istore_1        
		Preconditions.checkState(flag1 ^ true, "Result has already been consumed");
	//    7   13:iload_2         
	//    8   14:iconst_1        
	//    9   15:ixor            
	//   10   16:ldc2            #266 <String "Result has already been consumed">
	//   11   19:invokestatic    #138 <Method void Preconditions.checkState(boolean, Object)>
		if(zzfl != null)
	//*  12   22:aload_0         
	//*  13   23:getfield        #268 <Field zzch zzfl>
	//*  14   26:ifnonnull       32
	//*  15   29:goto            34
			flag = false;
	//   16   32:iconst_0        
	//   17   33:istore_1        
		Preconditions.checkState(flag, "Cannot await if then() has been called.");
	//   18   34:iload_1         
	//   19   35:ldc2            #270 <String "Cannot await if then() has been called.">
	//   20   38:invokestatic    #138 <Method void Preconditions.checkState(boolean, Object)>
		try
		{
			zzfd.await();
	//   21   41:aload_0         
	//   22   42:getfield        #76  <Field CountDownLatch zzfd>
	//   23   45:invokevirtual   #272 <Method void CountDownLatch.await()>
		}
	//*  24   48:goto            58
	//*  25   51:aload_0         
	//*  26   52:getstatic       #277 <Field Status Status.RESULT_INTERRUPTED>
	//*  27   55:invokevirtual   #279 <Method void zzb(Status)>
	//*  28   58:aload_0         
	//*  29   59:invokevirtual   #142 <Method boolean isReady()>
	//*  30   62:ldc1            #144 <String "Result is not ready.">
	//*  31   64:invokestatic    #138 <Method void Preconditions.checkState(boolean, Object)>
	//*  32   67:aload_0         
	//*  33   68:invokespecial   #188 <Method Result get()>
	//*  34   71:areturn         
		// Misplaced declaration of an exception variable
		catch(InterruptedException interruptedexception)
		{
			zzb(Status.RESULT_INTERRUPTED);
		}
		Preconditions.checkState(isReady(), "Result is not ready.");
		return get();
	//*  35   72:astore_3        
	//*  36   73:goto            51
	}

	public final Result await(long l, TimeUnit timeunit)
	{
		if(l > 0L)
	//*   0    0:lload_1         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifle            12
			Preconditions.checkNotMainThread("await must not be called on the UI thread when time is greater than zero.");
	//    4    6:ldc2            #282 <String "await must not be called on the UI thread when time is greater than zero.">
	//    5    9:invokestatic    #264 <Method void Preconditions.checkNotMainThread(String)>
		boolean flag1 = zzfh;
	//    6   12:aload_0         
	//    7   13:getfield        #132 <Field boolean zzfh>
	//    8   16:istore          5
		boolean flag = true;
	//    9   18:iconst_1        
	//   10   19:istore          4
		Preconditions.checkState(flag1 ^ true, "Result has already been consumed.");
	//   11   21:iload           5
	//   12   23:iconst_1        
	//   13   24:ixor            
	//   14   25:ldc1            #134 <String "Result has already been consumed.">
	//   15   27:invokestatic    #138 <Method void Preconditions.checkState(boolean, Object)>
		if(zzfl != null)
	//*  16   30:aload_0         
	//*  17   31:getfield        #268 <Field zzch zzfl>
	//*  18   34:ifnonnull       40
	//*  19   37:goto            43
			flag = false;
	//   20   40:iconst_0        
	//   21   41:istore          4
		Preconditions.checkState(flag, "Cannot await if then() has been called.");
	//   22   43:iload           4
	//   23   45:ldc2            #270 <String "Cannot await if then() has been called.">
	//   24   48:invokestatic    #138 <Method void Preconditions.checkState(boolean, Object)>
		try
		{
			if(!zzfd.await(l, timeunit))
	//*  25   51:aload_0         
	//*  26   52:getfield        #76  <Field CountDownLatch zzfd>
	//*  27   55:lload_1         
	//*  28   56:aload_3         
	//*  29   57:invokevirtual   #285 <Method boolean CountDownLatch.await(long, TimeUnit)>
	//*  30   60:ifne            80
				zzb(Status.RESULT_TIMEOUT);
	//   31   63:aload_0         
	//   32   64:getstatic       #288 <Field Status Status.RESULT_TIMEOUT>
	//   33   67:invokevirtual   #279 <Method void zzb(Status)>
		}
	//*  34   70:goto            80
	//*  35   73:aload_0         
	//*  36   74:getstatic       #277 <Field Status Status.RESULT_INTERRUPTED>
	//*  37   77:invokevirtual   #279 <Method void zzb(Status)>
	//*  38   80:aload_0         
	//*  39   81:invokevirtual   #142 <Method boolean isReady()>
	//*  40   84:ldc1            #144 <String "Result is not ready.">
	//*  41   86:invokestatic    #138 <Method void Preconditions.checkState(boolean, Object)>
	//*  42   89:aload_0         
	//*  43   90:invokespecial   #188 <Method Result get()>
	//*  44   93:areturn         
		// Misplaced declaration of an exception variable
		catch(TimeUnit timeunit)
		{
			zzb(Status.RESULT_INTERRUPTED);
		}
		Preconditions.checkState(isReady(), "Result is not ready.");
		return get();
	//*  45   94:astore_3        
	//*  46   95:goto            73
	}

	public void cancel()
	{
		Object obj = zzfa;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field Object zzfa>
	//    2    4:astore_1        
		obj;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(zzfi || zzfh)
	//*   5    7:aload_0         
	//*   6    8:getfield        #176 <Field boolean zzfi>
	//*   7   11:ifne            68
	//*   8   14:aload_0         
	//*   9   15:getfield        #132 <Field boolean zzfh>
	//*  10   18:ifeq            24
			break MISSING_BLOCK_LABEL_68;
	//   11   21:goto            68
		ICancelToken icanceltoken = zzfk;
	//   12   24:aload_0         
	//   13   25:getfield        #163 <Field ICancelToken zzfk>
	//   14   28:astore_2        
		if(icanceltoken == null)
			break MISSING_BLOCK_LABEL_42;
	//   15   29:aload_2         
	//   16   30:ifnull          42
		Exception exception;
		try
		{
			zzfk.cancel();
	//   17   33:aload_0         
	//   18   34:getfield        #163 <Field ICancelToken zzfk>
	//   19   37:invokeinterface #296 <Method void ICancelToken.cancel()>
		}
	//*  20   42:aload_0         
	//*  21   43:getfield        #146 <Field Result zzdm>
	//*  22   46:invokestatic    #298 <Method void zzb(Result)>
	//*  23   49:aload_0         
	//*  24   50:iconst_1        
	//*  25   51:putfield        #176 <Field boolean zzfi>
	//*  26   54:aload_0         
	//*  27   55:aload_0         
	//*  28   56:getstatic       #301 <Field Status Status.RESULT_CANCELED>
	//*  29   59:invokevirtual   #305 <Method Result createFailedResult(Status)>
	//*  30   62:invokespecial   #307 <Method void zza(Result)>
	//*  31   65:aload_1         
	//*  32   66:monitorexit     
	//*  33   67:return          
	//*  34   68:aload_1         
	//*  35   69:monitorexit     
	//*  36   70:return          
	//*  37   71:astore_2        
	//*  38   72:aload_1         
	//*  39   73:monitorexit     
	//*  40   74:aload_2         
	//*  41   75:athrow          
		catch(RemoteException remoteexception) { }
	//   42   76:astore_2        
		zzb(zzdm);
		zzfi = true;
		zza(createFailedResult(Status.RESULT_CANCELED));
		obj;
		JVM INSTR monitorexit ;
		return;
		obj;
		JVM INSTR monitorexit ;
		return;
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
	//*  43   77:goto            42
	}

	protected abstract Result createFailedResult(Status status);

	public boolean isCanceled()
	{
		boolean flag;
		synchronized(zzfa)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field Object zzfa>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			flag = zzfi;
	//    5    7:aload_0         
	//    6    8:getfield        #176 <Field boolean zzfi>
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
		return zzfd.getCount() == 0L;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field CountDownLatch zzfd>
	//    2    4:invokevirtual   #312 <Method long CountDownLatch.getCount()>
	//    3    7:lconst_0        
	//    4    8:lcmp            
	//    5    9:ifne            14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	protected final void setCancelToken(ICancelToken icanceltoken)
	{
		synchronized(zzfa)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field Object zzfa>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			zzfk = icanceltoken;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #163 <Field ICancelToken zzfk>
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		return;
	//   10   14:return          
		icanceltoken;
	//   11   15:astore_1        
		obj;
	//   12   16:aload_2         
		JVM INSTR monitorexit ;
	//   13   17:monitorexit     
		throw icanceltoken;
	//   14   18:aload_1         
	//   15   19:athrow          
	}

	public final void setResult(Result result)
	{
label0:
		{
			synchronized(zzfa)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field Object zzfa>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(zzfj || zzfi)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #317 <Field boolean zzfj>
	//    7   11:ifne            58
	//    8   14:aload_0         
	//    9   15:getfield        #176 <Field boolean zzfi>
	//   10   18:ifne            58
				isReady();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #142 <Method boolean isReady()>
	//   13   25:pop             
				Preconditions.checkState(isReady() ^ true, "Results have already been set");
	//   14   26:aload_0         
	//   15   27:invokevirtual   #142 <Method boolean isReady()>
	//   16   30:iconst_1        
	//   17   31:ixor            
	//   18   32:ldc2            #319 <String "Results have already been set">
	//   19   35:invokestatic    #138 <Method void Preconditions.checkState(boolean, Object)>
				Preconditions.checkState(zzfh ^ true, "Result has already been consumed");
	//   20   38:aload_0         
	//   21   39:getfield        #132 <Field boolean zzfh>
	//   22   42:iconst_1        
	//   23   43:ixor            
	//   24   44:ldc2            #266 <String "Result has already been consumed">
	//   25   47:invokestatic    #138 <Method void Preconditions.checkState(boolean, Object)>
				zza(result);
	//   26   50:aload_0         
	//   27   51:aload_1         
	//   28   52:invokespecial   #307 <Method void zza(Result)>
			}
	//   29   55:aload_2         
	//   30   56:monitorexit     
			return;
	//   31   57:return          
		}
		zzb(result);
	//   32   58:aload_1         
	//   33   59:invokestatic    #298 <Method void zzb(Result)>
		obj;
	//   34   62:aload_2         
		JVM INSTR monitorexit ;
	//   35   63:monitorexit     
		return;
	//   36   64:return          
		result;
	//   37   65:astore_1        
		obj;
	//   38   66:aload_2         
		JVM INSTR monitorexit ;
	//   39   67:monitorexit     
		throw result;
	//   40   68:aload_1         
	//   41   69:athrow          
	}

	public final void setResultCallback(ResultCallback resultcallback)
	{
		Object obj = zzfa;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field Object zzfa>
	//    2    4:astore          4
		obj;
	//    3    6:aload           4
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		if(resultcallback != null)
			break MISSING_BLOCK_LABEL_22;
	//    5    9:aload_1         
	//    6   10:ifnonnull       22
		zzff = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #148 <Field ResultCallback zzff>
		obj;
	//   10   18:aload           4
		JVM INSTR monitorexit ;
	//   11   20:monitorexit     
		return;
	//   12   21:return          
		boolean flag1 = zzfh;
	//   13   22:aload_0         
	//   14   23:getfield        #132 <Field boolean zzfh>
	//   15   26:istore_3        
		boolean flag = true;
	//   16   27:iconst_1        
	//   17   28:istore_2        
		Preconditions.checkState(flag1 ^ true, "Result has already been consumed.");
	//   18   29:iload_3         
	//   19   30:iconst_1        
	//   20   31:ixor            
	//   21   32:ldc1            #134 <String "Result has already been consumed.">
	//   22   34:invokestatic    #138 <Method void Preconditions.checkState(boolean, Object)>
		if(zzfl != null)
	//*  23   37:aload_0         
	//*  24   38:getfield        #268 <Field zzch zzfl>
	//*  25   41:ifnonnull       105
	//*  26   44:goto            47
	//*  27   47:iload_2         
	//*  28   48:ldc2            #323 <String "Cannot set callbacks if then() has been called.">
	//*  29   51:invokestatic    #138 <Method void Preconditions.checkState(boolean, Object)>
	//*  30   54:aload_0         
	//*  31   55:invokevirtual   #325 <Method boolean PendingResult.isCanceled()>
	//*  32   58:ifeq            65
	//*  33   61:aload           4
	//*  34   63:monitorexit     
	//*  35   64:return          
	//*  36   65:aload_0         
	//*  37   66:invokevirtual   #142 <Method boolean isReady()>
	//*  38   69:ifeq            87
	//*  39   72:aload_0         
	//*  40   73:getfield        #99  <Field BasePendingResult$CallbackHandler zzfb>
	//*  41   76:aload_1         
	//*  42   77:aload_0         
	//*  43   78:invokespecial   #188 <Method Result get()>
	//*  44   81:invokevirtual   #191 <Method void BasePendingResult$CallbackHandler.zza(ResultCallback, Result)>
	//*  45   84:goto            92
	//*  46   87:aload_0         
	//*  47   88:aload_1         
	//*  48   89:putfield        #148 <Field ResultCallback zzff>
	//*  49   92:aload           4
	//*  50   94:monitorexit     
	//*  51   95:return          
	//*  52   96:aload           4
	//*  53   98:monitorexit     
	//*  54   99:aload_1         
	//*  55  100:athrow          
	//*  56  101:astore_1        
	//*  57  102:goto            96
			flag = false;
	//   58  105:iconst_0        
	//   59  106:istore_2        
		Preconditions.checkState(flag, "Cannot set callbacks if then() has been called.");
		if(!((PendingResult)this).isCanceled())
			break MISSING_BLOCK_LABEL_65;
		obj;
		JVM INSTR monitorexit ;
		return;
		if(isReady())
		{
			zzfb.zza(resultcallback, get());
			break MISSING_BLOCK_LABEL_92;
		}
		zzff = resultcallback;
		obj;
		JVM INSTR monitorexit ;
		return;
_L2:
		obj;
		JVM INSTR monitorexit ;
		throw resultcallback;
		resultcallback;
		if(true) goto _L2; else goto _L1
_L1:
	//*  60  107:goto            47
	}

	public final void setResultCallback(ResultCallback resultcallback, long l, TimeUnit timeunit)
	{
		Object obj = zzfa;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field Object zzfa>
	//    2    4:astore          7
		obj;
	//    3    6:aload           7
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		if(resultcallback != null)
			break MISSING_BLOCK_LABEL_22;
	//    5    9:aload_1         
	//    6   10:ifnonnull       22
		zzff = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #148 <Field ResultCallback zzff>
		obj;
	//   10   18:aload           7
		JVM INSTR monitorexit ;
	//   11   20:monitorexit     
		return;
	//   12   21:return          
		boolean flag1 = zzfh;
	//   13   22:aload_0         
	//   14   23:getfield        #132 <Field boolean zzfh>
	//   15   26:istore          6
		boolean flag = true;
	//   16   28:iconst_1        
	//   17   29:istore          5
		Preconditions.checkState(flag1 ^ true, "Result has already been consumed.");
	//   18   31:iload           6
	//   19   33:iconst_1        
	//   20   34:ixor            
	//   21   35:ldc1            #134 <String "Result has already been consumed.">
	//   22   37:invokestatic    #138 <Method void Preconditions.checkState(boolean, Object)>
		if(zzfl != null)
	//*  23   40:aload_0         
	//*  24   41:getfield        #268 <Field zzch zzfl>
	//*  25   44:ifnonnull       133
	//*  26   47:goto            50
	//*  27   50:iload           5
	//*  28   52:ldc2            #323 <String "Cannot set callbacks if then() has been called.">
	//*  29   55:invokestatic    #138 <Method void Preconditions.checkState(boolean, Object)>
	//*  30   58:aload_0         
	//*  31   59:invokevirtual   #325 <Method boolean PendingResult.isCanceled()>
	//*  32   62:ifeq            69
	//*  33   65:aload           7
	//*  34   67:monitorexit     
	//*  35   68:return          
	//*  36   69:aload_0         
	//*  37   70:invokevirtual   #142 <Method boolean isReady()>
	//*  38   73:ifeq            91
	//*  39   76:aload_0         
	//*  40   77:getfield        #99  <Field BasePendingResult$CallbackHandler zzfb>
	//*  41   80:aload_1         
	//*  42   81:aload_0         
	//*  43   82:invokespecial   #188 <Method Result get()>
	//*  44   85:invokevirtual   #191 <Method void BasePendingResult$CallbackHandler.zza(ResultCallback, Result)>
	//*  45   88:goto            120
	//*  46   91:aload_0         
	//*  47   92:aload_1         
	//*  48   93:putfield        #148 <Field ResultCallback zzff>
	//*  49   96:aload_0         
	//*  50   97:getfield        #99  <Field BasePendingResult$CallbackHandler zzfb>
	//*  51  100:astore_1        
	//*  52  101:aload           4
	//*  53  103:lload_2         
	//*  54  104:invokevirtual   #333 <Method long TimeUnit.toMillis(long)>
	//*  55  107:lstore_2        
	//*  56  108:aload_1         
	//*  57  109:aload_1         
	//*  58  110:iconst_2        
	//*  59  111:aload_0         
	//*  60  112:invokevirtual   #337 <Method Message BasePendingResult$CallbackHandler.obtainMessage(int, Object)>
	//*  61  115:lload_2         
	//*  62  116:invokevirtual   #341 <Method boolean BasePendingResult$CallbackHandler.sendMessageDelayed(Message, long)>
	//*  63  119:pop             
	//*  64  120:aload           7
	//*  65  122:monitorexit     
	//*  66  123:return          
	//*  67  124:aload           7
	//*  68  126:monitorexit     
	//*  69  127:aload_1         
	//*  70  128:athrow          
	//*  71  129:astore_1        
	//*  72  130:goto            124
			flag = false;
	//   73  133:iconst_0        
	//   74  134:istore          5
		Preconditions.checkState(flag, "Cannot set callbacks if then() has been called.");
		if(!((PendingResult)this).isCanceled())
			break MISSING_BLOCK_LABEL_69;
		obj;
		JVM INSTR monitorexit ;
		return;
		if(isReady())
		{
			zzfb.zza(resultcallback, get());
			break MISSING_BLOCK_LABEL_120;
		}
		zzff = resultcallback;
		resultcallback = ((ResultCallback) (zzfb));
		l = timeunit.toMillis(l);
		((CallbackHandler) (resultcallback)).sendMessageDelayed(((CallbackHandler) (resultcallback)).obtainMessage(2, ((Object) (this))), l);
		obj;
		JVM INSTR monitorexit ;
		return;
_L2:
		obj;
		JVM INSTR monitorexit ;
		throw resultcallback;
		resultcallback;
		if(true) goto _L2; else goto _L1
_L1:
	//*  75  136:goto            50
	}

	public TransformedResult then(ResultTransform resulttransform)
	{
		Preconditions.checkState(zzfh ^ true, "Result has already been consumed.");
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field boolean zzfh>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:ldc1            #134 <String "Result has already been consumed.">
	//    5    8:invokestatic    #138 <Method void Preconditions.checkState(boolean, Object)>
		Object obj = zzfa;
	//    6   11:aload_0         
	//    7   12:getfield        #69  <Field Object zzfa>
	//    8   15:astore          4
		obj;
	//    9   17:aload           4
		JVM INSTR monitorenter ;
	//   10   19:monitorenter    
		zzch zzch1 = zzfl;
	//   11   20:aload_0         
	//   12   21:getfield        #268 <Field zzch zzfl>
	//   13   24:astore          5
		boolean flag1 = false;
	//   14   26:iconst_0        
	//   15   27:istore_3        
		boolean flag;
		if(zzch1 == null)
	//*  16   28:aload           5
	//*  17   30:ifnonnull       148
			flag = true;
	//   18   33:iconst_1        
	//   19   34:istore_2        
		else
	//*  20   35:goto            38
	//*  21   38:iload_2         
	//*  22   39:ldc2            #346 <String "Cannot call then() twice.">
	//*  23   42:invokestatic    #138 <Method void Preconditions.checkState(boolean, Object)>
	//*  24   45:iload_3         
	//*  25   46:istore_2        
	//*  26   47:aload_0         
	//*  27   48:getfield        #148 <Field ResultCallback zzff>
	//*  28   51:ifnonnull       56
	//*  29   54:iconst_1        
	//*  30   55:istore_2        
	//*  31   56:iload_2         
	//*  32   57:ldc2            #348 <String "Cannot call then() if callbacks are set.">
	//*  33   60:invokestatic    #138 <Method void Preconditions.checkState(boolean, Object)>
	//*  34   63:aload_0         
	//*  35   64:getfield        #176 <Field boolean zzfi>
	//*  36   67:iconst_1        
	//*  37   68:ixor            
	//*  38   69:ldc2            #350 <String "Cannot call then() if result was canceled.">
	//*  39   72:invokestatic    #138 <Method void Preconditions.checkState(boolean, Object)>
	//*  40   75:aload_0         
	//*  41   76:iconst_1        
	//*  42   77:putfield        #88  <Field boolean zzfm>
	//*  43   80:aload_0         
	//*  44   81:new             #352 <Class zzch>
	//*  45   84:dup             
	//*  46   85:aload_0         
	//*  47   86:getfield        #106 <Field WeakReference zzfc>
	//*  48   89:invokespecial   #355 <Method void zzch(WeakReference)>
	//*  49   92:putfield        #268 <Field zzch zzfl>
	//*  50   95:aload_0         
	//*  51   96:getfield        #268 <Field zzch zzfl>
	//*  52   99:aload_1         
	//*  53  100:invokevirtual   #359 <Method TransformedResult TransformedResult.then(ResultTransform)>
	//*  54  103:astore_1        
	//*  55  104:aload_0         
	//*  56  105:invokevirtual   #142 <Method boolean isReady()>
	//*  57  108:ifeq            129
	//*  58  111:aload_0         
	//*  59  112:getfield        #99  <Field BasePendingResult$CallbackHandler zzfb>
	//*  60  115:aload_0         
	//*  61  116:getfield        #268 <Field zzch zzfl>
	//*  62  119:aload_0         
	//*  63  120:invokespecial   #188 <Method Result get()>
	//*  64  123:invokevirtual   #191 <Method void BasePendingResult$CallbackHandler.zza(ResultCallback, Result)>
	//*  65  126:goto            137
	//*  66  129:aload_0         
	//*  67  130:aload_0         
	//*  68  131:getfield        #268 <Field zzch zzfl>
	//*  69  134:putfield        #148 <Field ResultCallback zzff>
	//*  70  137:aload           4
	//*  71  139:monitorexit     
	//*  72  140:aload_1         
	//*  73  141:areturn         
	//*  74  142:astore_1        
	//*  75  143:aload           4
	//*  76  145:monitorexit     
	//*  77  146:aload_1         
	//*  78  147:athrow          
			flag = false;
	//   79  148:iconst_0        
	//   80  149:istore_2        
		Preconditions.checkState(flag, "Cannot call then() twice.");
		flag = flag1;
		if(zzff == null)
			flag = true;
		Preconditions.checkState(flag, "Cannot call then() if callbacks are set.");
		Preconditions.checkState(zzfi ^ true, "Cannot call then() if result was canceled.");
		zzfm = true;
		zzfl = new zzch(zzfc);
		resulttransform = ((ResultTransform) (((TransformedResult) (zzfl)).then(resulttransform)));
		if(isReady())
		{
			zzfb.zza(((ResultCallback) (zzfl)), get());
			break MISSING_BLOCK_LABEL_137;
		}
		zzff = ((ResultCallback) (zzfl));
		obj;
		JVM INSTR monitorexit ;
		return ((TransformedResult) (resulttransform));
		resulttransform;
		obj;
		JVM INSTR monitorexit ;
		throw resulttransform;
	//*  81  150:goto            38
	}

	public final void zza(zzcn zzcn1)
	{
		zzfg.set(((Object) (zzcn1)));
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field AtomicReference zzfg>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #364 <Method void AtomicReference.set(Object)>
	//    4    8:return          
	}

	public final void zzb(Status status)
	{
		synchronized(zzfa)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field Object zzfa>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			if(!isReady())
	//*   5    7:aload_0         
	//*   6    8:invokevirtual   #142 <Method boolean isReady()>
	//*   7   11:ifne            28
			{
				setResult(createFailedResult(status));
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:invokevirtual   #305 <Method Result createFailedResult(Status)>
	//   12   20:invokevirtual   #366 <Method void setResult(Result)>
				zzfj = true;
	//   13   23:aload_0         
	//   14   24:iconst_1        
	//   15   25:putfield        #317 <Field boolean zzfj>
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

	public final Integer zzo()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final boolean zzw()
	{
		boolean flag;
		synchronized(zzfa)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field Object zzfa>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			if((GoogleApiClient)zzfc.get() == null || !zzfm)
	//*   5    7:aload_0         
	//*   6    8:getfield        #106 <Field WeakReference zzfc>
	//*   7   11:invokevirtual   #372 <Method Object WeakReference.get()>
	//*   8   14:checkcast       #111 <Class GoogleApiClient>
	//*   9   17:ifnull          27
	//*  10   20:aload_0         
	//*  11   21:getfield        #88  <Field boolean zzfm>
	//*  12   24:ifne            31
				((PendingResult)this).cancel();
	//   13   27:aload_0         
	//   14   28:invokevirtual   #373 <Method void PendingResult.cancel()>
			flag = ((PendingResult)this).isCanceled();
	//   15   31:aload_0         
	//   16   32:invokevirtual   #325 <Method boolean PendingResult.isCanceled()>
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

	public final void zzx()
	{
		boolean flag;
		if(!zzfm && !((Boolean)zzez.get()).booleanValue())
	//*   0    0:aload_0         
	//*   1    1:getfield        #88  <Field boolean zzfm>
	//*   2    4:ifne            30
	//*   3    7:getstatic       #61  <Field ThreadLocal zzez>
	//*   4   10:invokevirtual   #377 <Method Object ThreadLocal.get()>
	//*   5   13:checkcast       #379 <Class Boolean>
	//*   6   16:invokevirtual   #382 <Method boolean Boolean.booleanValue()>
	//*   7   19:ifeq            25
	//*   8   22:goto            30
			flag = false;
	//    9   25:iconst_0        
	//   10   26:istore_1        
		else
	//*  11   27:goto            32
			flag = true;
	//   12   30:iconst_1        
	//   13   31:istore_1        
		zzfm = flag;
	//   14   32:aload_0         
	//   15   33:iload_1         
	//   16   34:putfield        #88  <Field boolean zzfm>
	//   17   37:return          
	}

	static final ThreadLocal zzez = new zzo();
	private zza mResultGuardian;
	private Status mStatus;
	private Result zzdm;
	private final Object zzfa;
	private final CallbackHandler zzfb;
	private final WeakReference zzfc;
	private final CountDownLatch zzfd;
	private final ArrayList zzfe;
	private ResultCallback zzff;
	private final AtomicReference zzfg;
	private volatile boolean zzfh;
	private boolean zzfi;
	private boolean zzfj;
	private ICancelToken zzfk;
	private volatile zzch zzfl;
	private boolean zzfm;

	static 
	{
	//    0    0:new             #56  <Class zzo>
	//    1    3:dup             
	//    2    4:invokespecial   #59  <Method void zzo()>
	//    3    7:putstatic       #61  <Field ThreadLocal zzez>
	//*   4   10:return          
	}
}
