// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.*;
import android.util.Log;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.internal.zzac;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.gms.internal:
//			zzabo, zzabp, zzaaf

public class zzabx extends TransformedResult
	implements ResultCallback
{
	final class zza extends Handler
	{

		public void handleMessage(Message message)
		{
			message.what;
		//    0    0:aload_1         
		//    1    1:getfield        #25  <Field int Message.what>
			JVM INSTR lookupswitch 2: default 32
		//		               0: 35
		//		               1: 130;
		//    2    4:lookupswitch    2: default 32
		//		               0: 35
		//		               1: 130
			   goto _L1 _L2 _L3
		//*   3   32:goto            182
_L2:
			PendingResult pendingresult = (PendingResult)message.obj;
		//    4   35:aload_1         
		//    5   36:getfield        #29  <Field Object Message.obj>
		//    6   39:checkcast       #31  <Class PendingResult>
		//    7   42:astore_3        
			message = ((Message) (zzabx.zzf(zzaDt)));
		//    8   43:aload_0         
		//    9   44:getfield        #13  <Field zzabx zzaDt>
		//   10   47:invokestatic    #35  <Method Object zzabx.zzf(zzabx)>
		//   11   50:astore_1        
			message;
		//   12   51:aload_1         
			JVM INSTR monitorenter ;
		//   13   52:monitorenter    
			if(pendingresult != null) goto _L5; else goto _L4
		//   14   53:aload_3         
		//   15   54:ifnonnull       81
_L4:
			zzabx.zza(zzabx.zzg(zzaDt), new Status(13, "Transform returned null"));
		//   16   57:aload_0         
		//   17   58:getfield        #13  <Field zzabx zzaDt>
		//   18   61:invokestatic    #39  <Method zzabx zzabx.zzg(zzabx)>
		//   19   64:new             #41  <Class Status>
		//   20   67:dup             
		//   21   68:bipush          13
		//   22   70:ldc1            #43  <String "Transform returned null">
		//   23   72:invokespecial   #46  <Method void Status(int, String)>
		//   24   75:invokestatic    #49  <Method void zzabx.zza(zzabx, Status)>
			break MISSING_BLOCK_LABEL_119;
		//   25   78:goto            119
_L5:
			if(pendingresult instanceof zzabp)
		//*  26   81:aload_3         
		//*  27   82:instanceof      #51  <Class zzabp>
		//*  28   85:ifeq            108
			{
				zzabx.zza(zzabx.zzg(zzaDt), ((zzabp)pendingresult).getStatus());
		//   29   88:aload_0         
		//   30   89:getfield        #13  <Field zzabx zzaDt>
		//   31   92:invokestatic    #39  <Method zzabx zzabx.zzg(zzabx)>
		//   32   95:aload_3         
		//   33   96:checkcast       #51  <Class zzabp>
		//   34   99:invokevirtual   #55  <Method Status zzabp.getStatus()>
		//   35  102:invokestatic    #49  <Method void zzabx.zza(zzabx, Status)>
				break MISSING_BLOCK_LABEL_119;
		//   36  105:goto            119
			}
			zzabx.zzg(zzaDt).zza(pendingresult);
		//   37  108:aload_0         
		//   38  109:getfield        #13  <Field zzabx zzaDt>
		//   39  112:invokestatic    #39  <Method zzabx zzabx.zzg(zzabx)>
		//   40  115:aload_3         
		//   41  116:invokevirtual   #58  <Method void zzabx.zza(PendingResult)>
			message;
		//   42  119:aload_1         
			JVM INSTR monitorexit ;
		//   43  120:monitorexit     
			  goto _L6
		//*  44  121:goto            129
			Exception exception;
			exception;
		//   45  124:astore_3        
		//*  46  125:aload_1         
			throw exception;
		//   47  126:monitorexit     
		//   48  127:aload_3         
		//   49  128:athrow          
_L6:
			return;
		//   50  129:return          
_L3:
			RuntimeException runtimeexception = (RuntimeException)message.obj;
		//   51  130:aload_1         
		//   52  131:getfield        #29  <Field Object Message.obj>
		//   53  134:checkcast       #60  <Class RuntimeException>
		//   54  137:astore_3        
			message = ((Message) (String.valueOf(((Object) (runtimeexception.getMessage())))));
		//   55  138:aload_3         
		//   56  139:invokevirtual   #64  <Method String RuntimeException.getMessage()>
		//   57  142:invokestatic    #70  <Method String String.valueOf(Object)>
		//   58  145:astore_1        
			if(((String) (message)).length() != 0)
		//*  59  146:aload_1         
		//*  60  147:invokevirtual   #74  <Method int String.length()>
		//*  61  150:ifeq            163
				message = ((Message) ("Runtime exception on the transformation worker thread: ".concat(((String) (message)))));
		//   62  153:ldc1            #76  <String "Runtime exception on the transformation worker thread: ">
		//   63  155:aload_1         
		//   64  156:invokevirtual   #80  <Method String String.concat(String)>
		//   65  159:astore_1        
			else
		//*  66  160:goto            173
				message = ((Message) (new String("Runtime exception on the transformation worker thread: ")));
		//   67  163:new             #66  <Class String>
		//   68  166:dup             
		//   69  167:ldc1            #76  <String "Runtime exception on the transformation worker thread: ">
		//   70  169:invokespecial   #83  <Method void String(String)>
		//   71  172:astore_1        
			Log.e("TransformedResultImpl", ((String) (message)));
		//   72  173:ldc1            #85  <String "TransformedResultImpl">
		//   73  175:aload_1         
		//   74  176:invokestatic    #91  <Method int Log.e(String, String)>
		//   75  179:pop             
			throw runtimeexception;
		//   76  180:aload_3         
		//   77  181:athrow          
_L1:
			int i = message.what;
		//   78  182:aload_1         
		//   79  183:getfield        #25  <Field int Message.what>
		//   80  186:istore_2        
			Log.e("TransformedResultImpl", (new StringBuilder(70)).append("TransformationResultHandler received unknown message type: ").append(i).toString());
		//   81  187:ldc1            #85  <String "TransformedResultImpl">
		//   82  189:new             #93  <Class StringBuilder>
		//   83  192:dup             
		//   84  193:bipush          70
		//   85  195:invokespecial   #96  <Method void StringBuilder(int)>
		//   86  198:ldc1            #98  <String "TransformationResultHandler received unknown message type: ">
		//   87  200:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
		//   88  203:iload_2         
		//   89  204:invokevirtual   #105 <Method StringBuilder StringBuilder.append(int)>
		//   90  207:invokevirtual   #108 <Method String StringBuilder.toString()>
		//   91  210:invokestatic    #91  <Method int Log.e(String, String)>
		//   92  213:pop             
			return;
		//   93  214:return          
		}

		final zzabx zzaDt;

		public zza(Looper looper)
		{
			zzaDt = zzabx.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field zzabx zzaDt>
			super(looper);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #16  <Method void Handler(Looper)>
		//    6   10:return          
		}
	}


	public zzabx(WeakReference weakreference)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void TransformedResult()>
		zzaDl = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #42  <Field ResultTransform zzaDl>
		zzaDm = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #44  <Field zzabx zzaDm>
		zzaDn = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #46  <Field ResultCallbacks zzaDn>
		zzaDo = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #48  <Field PendingResult zzaDo>
	//   14   24:aload_0         
	//   15   25:new             #50  <Class Object>
	//   16   28:dup             
	//   17   29:invokespecial   #51  <Method void Object()>
	//   18   32:putfield        #53  <Field Object zzaAh>
		zzaDp = null;
	//   19   35:aload_0         
	//   20   36:aconst_null     
	//   21   37:putfield        #55  <Field Status zzaDp>
		zzaDr = false;
	//   22   40:aload_0         
	//   23   41:iconst_0        
	//   24   42:putfield        #57  <Field boolean zzaDr>
		zzac.zzb(((Object) (weakreference)), "GoogleApiClient reference must not be null");
	//   25   45:aload_1         
	//   26   46:ldc1            #59  <String "GoogleApiClient reference must not be null">
	//   27   48:invokestatic    #65  <Method Object zzac.zzb(Object, Object)>
	//   28   51:pop             
		zzaAj = weakreference;
	//   29   52:aload_0         
	//   30   53:aload_1         
	//   31   54:putfield        #67  <Field WeakReference zzaAj>
		weakreference = ((WeakReference) ((GoogleApiClient)zzaAj.get()));
	//   32   57:aload_0         
	//   33   58:getfield        #67  <Field WeakReference zzaAj>
	//   34   61:invokevirtual   #73  <Method Object WeakReference.get()>
	//   35   64:checkcast       #75  <Class GoogleApiClient>
	//   36   67:astore_1        
		if(weakreference != null)
	//*  37   68:aload_1         
	//*  38   69:ifnull          80
			weakreference = ((WeakReference) (((GoogleApiClient) (weakreference)).getLooper()));
	//   39   72:aload_1         
	//   40   73:invokevirtual   #79  <Method Looper GoogleApiClient.getLooper()>
	//   41   76:astore_1        
		else
	//*  42   77:goto            84
			weakreference = ((WeakReference) (Looper.getMainLooper()));
	//   43   80:invokestatic    #84  <Method Looper Looper.getMainLooper()>
	//   44   83:astore_1        
		zzaDq = new zza(((Looper) (weakreference)));
	//   45   84:aload_0         
	//   46   85:new             #11  <Class zzabx$zza>
	//   47   88:dup             
	//   48   89:aload_0         
	//   49   90:aload_1         
	//   50   91:invokespecial   #87  <Method void zzabx$zza(zzabx, Looper)>
	//   51   94:putfield        #89  <Field zzabx$zza zzaDq>
	//   52   97:return          
	}

	private void zzE(Status status)
	{
		Object obj = zzaAh;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Object zzaAh>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		zzaDp = status;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #55  <Field Status zzaDp>
		zzF(zzaDp);
	//    8   12:aload_0         
	//    9   13:aload_0         
	//   10   14:getfield        #55  <Field Status zzaDp>
	//   11   17:invokespecial   #97  <Method void zzF(Status)>
		obj;
	//   12   20:aload_2         
		JVM INSTR monitorexit ;
	//   13   21:monitorexit     
		return;
	//   14   22:return          
		status;
	//   15   23:astore_1        
	//*  16   24:aload_2         
		throw status;
	//   17   25:monitorexit     
	//   18   26:aload_1         
	//   19   27:athrow          
	}

	private void zzF(Status status)
	{
		Object obj = zzaAh;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Object zzaAh>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(zzaDl != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #42  <Field ResultTransform zzaDl>
	//*   7   11:ifnull          41
		{
			status = zzaDl.onFailure(status);
	//    8   14:aload_0         
	//    9   15:getfield        #42  <Field ResultTransform zzaDl>
	//   10   18:aload_1         
	//   11   19:invokevirtual   #103 <Method Status ResultTransform.onFailure(Status)>
	//   12   22:astore_1        
			zzac.zzb(((Object) (status)), "onFailure must not return null");
	//   13   23:aload_1         
	//   14   24:ldc1            #105 <String "onFailure must not return null">
	//   15   26:invokestatic    #65  <Method Object zzac.zzb(Object, Object)>
	//   16   29:pop             
			zzaDm.zzE(status);
	//   17   30:aload_0         
	//   18   31:getfield        #44  <Field zzabx zzaDm>
	//   19   34:aload_1         
	//   20   35:invokespecial   #107 <Method void zzE(Status)>
			break MISSING_BLOCK_LABEL_56;
	//   21   38:goto            56
		}
		if(zzxc())
	//*  22   41:aload_0         
	//*  23   42:invokespecial   #111 <Method boolean zzxc()>
	//*  24   45:ifeq            56
			zzaDn.onFailure(status);
	//   25   48:aload_0         
	//   26   49:getfield        #46  <Field ResultCallbacks zzaDn>
	//   27   52:aload_1         
	//   28   53:invokevirtual   #115 <Method void ResultCallbacks.onFailure(Status)>
		obj;
	//   29   56:aload_2         
		JVM INSTR monitorexit ;
	//   30   57:monitorexit     
		return;
	//   31   58:return          
		status;
	//   32   59:astore_1        
	//*  33   60:aload_2         
		throw status;
	//   34   61:monitorexit     
	//   35   62:aload_1         
	//   36   63:athrow          
	}

	static void zza(zzabx zzabx1, Result result)
	{
		zzabx1.zzd(result);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #120 <Method void zzd(Result)>
	//    3    5:return          
	}

	static void zza(zzabx zzabx1, Status status)
	{
		zzabx1.zzE(status);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #107 <Method void zzE(Status)>
	//    3    5:return          
	}

	static ResultTransform zzc(zzabx zzabx1)
	{
		return zzabx1.zzaDl;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field ResultTransform zzaDl>
	//    2    4:areturn         
	}

	static zza zzd(zzabx zzabx1)
	{
		return zzabx1.zzaDq;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field zzabx$zza zzaDq>
	//    2    4:areturn         
	}

	private void zzd(Result result)
	{
		if(result instanceof Releasable)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #128 <Class Releasable>
	//*   2    4:ifeq            59
			try
			{
				((Releasable)result).release();
	//    3    7:aload_1         
	//    4    8:checkcast       #128 <Class Releasable>
	//    5   11:invokeinterface #131 <Method void Releasable.release()>
				return;
	//    6   16:return          
			}
			catch(RuntimeException runtimeexception)
	//*   7   17:astore_2        
			{
				result = ((Result) (String.valueOf(((Object) (result)))));
	//    8   18:aload_1         
	//    9   19:invokestatic    #137 <Method String String.valueOf(Object)>
	//   10   22:astore_1        
				Log.w("TransformedResultImpl", (new StringBuilder(String.valueOf(((Object) (result))).length() + 18)).append("Unable to release ").append(((String) (result))).toString(), ((Throwable) (runtimeexception)));
	//   11   23:ldc1            #139 <String "TransformedResultImpl">
	//   12   25:new             #141 <Class StringBuilder>
	//   13   28:dup             
	//   14   29:aload_1         
	//   15   30:invokestatic    #137 <Method String String.valueOf(Object)>
	//   16   33:invokevirtual   #145 <Method int String.length()>
	//   17   36:bipush          18
	//   18   38:iadd            
	//   19   39:invokespecial   #148 <Method void StringBuilder(int)>
	//   20   42:ldc1            #150 <String "Unable to release ">
	//   21   44:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   22   47:aload_1         
	//   23   48:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   24   51:invokevirtual   #158 <Method String StringBuilder.toString()>
	//   25   54:aload_2         
	//   26   55:invokestatic    #164 <Method int Log.w(String, String, Throwable)>
	//   27   58:pop             
			}
	//   28   59:return          
	}

	static WeakReference zze(zzabx zzabx1)
	{
		return zzabx1.zzaAj;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field WeakReference zzaAj>
	//    2    4:areturn         
	}

	static Object zzf(zzabx zzabx1)
	{
		return zzabx1.zzaAh;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Object zzaAh>
	//    2    4:areturn         
	}

	static zzabx zzg(zzabx zzabx1)
	{
		return zzabx1.zzaDm;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field zzabx zzaDm>
	//    2    4:areturn         
	}

	private void zzxa()
	{
		if(zzaDl == null && zzaDn == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field ResultTransform zzaDl>
	//*   2    4:ifnonnull       15
	//*   3    7:aload_0         
	//*   4    8:getfield        #46  <Field ResultCallbacks zzaDn>
	//*   5   11:ifnonnull       15
			return;
	//    6   14:return          
		GoogleApiClient googleapiclient = (GoogleApiClient)zzaAj.get();
	//    7   15:aload_0         
	//    8   16:getfield        #67  <Field WeakReference zzaAj>
	//    9   19:invokevirtual   #73  <Method Object WeakReference.get()>
	//   10   22:checkcast       #75  <Class GoogleApiClient>
	//   11   25:astore_1        
		if(!zzaDr && zzaDl != null && googleapiclient != null)
	//*  12   26:aload_0         
	//*  13   27:getfield        #57  <Field boolean zzaDr>
	//*  14   30:ifne            54
	//*  15   33:aload_0         
	//*  16   34:getfield        #42  <Field ResultTransform zzaDl>
	//*  17   37:ifnull          54
	//*  18   40:aload_1         
	//*  19   41:ifnull          54
		{
			googleapiclient.zza(this);
	//   20   44:aload_1         
	//   21   45:aload_0         
	//   22   46:invokevirtual   #174 <Method void GoogleApiClient.zza(zzabx)>
			zzaDr = true;
	//   23   49:aload_0         
	//   24   50:iconst_1        
	//   25   51:putfield        #57  <Field boolean zzaDr>
		}
		if(zzaDp != null)
	//*  26   54:aload_0         
	//*  27   55:getfield        #55  <Field Status zzaDp>
	//*  28   58:ifnull          70
		{
			zzF(zzaDp);
	//   29   61:aload_0         
	//   30   62:aload_0         
	//   31   63:getfield        #55  <Field Status zzaDp>
	//   32   66:invokespecial   #97  <Method void zzF(Status)>
			return;
	//   33   69:return          
		}
		if(zzaDo != null)
	//*  34   70:aload_0         
	//*  35   71:getfield        #48  <Field PendingResult zzaDo>
	//*  36   74:ifnull          85
			zzaDo.setResultCallback(((ResultCallback) (this)));
	//   37   77:aload_0         
	//   38   78:getfield        #48  <Field PendingResult zzaDo>
	//   39   81:aload_0         
	//   40   82:invokevirtual   #180 <Method void PendingResult.setResultCallback(ResultCallback)>
	//   41   85:return          
	}

	private boolean zzxc()
	{
		GoogleApiClient googleapiclient = (GoogleApiClient)zzaAj.get();
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field WeakReference zzaAj>
	//    2    4:invokevirtual   #73  <Method Object WeakReference.get()>
	//    3    7:checkcast       #75  <Class GoogleApiClient>
	//    4   10:astore_1        
		return zzaDn != null && googleapiclient != null;
	//    5   11:aload_0         
	//    6   12:getfield        #46  <Field ResultCallbacks zzaDn>
	//    7   15:ifnull          24
	//    8   18:aload_1         
	//    9   19:ifnull          24
	//   10   22:iconst_1        
	//   11   23:ireturn         
	//   12   24:iconst_0        
	//   13   25:ireturn         
	}

	public void andFinally(ResultCallbacks resultcallbacks)
	{
		Object obj = zzaAh;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Object zzaAh>
	//    2    4:astore_3        
		obj;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		boolean flag;
		if(zzaDn == null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #46  <Field ResultCallbacks zzaDn>
	//*   7   11:ifnonnull       60
			flag = true;
	//    8   14:iconst_1        
	//    9   15:istore_2        
		else
	//*  10   16:goto            19
	//*  11   19:iload_2         
	//*  12   20:ldc1            #185 <String "Cannot call andFinally() twice.">
	//*  13   22:invokestatic    #188 <Method void zzac.zza(boolean, Object)>
	//*  14   25:aload_0         
	//*  15   26:getfield        #42  <Field ResultTransform zzaDl>
	//*  16   29:ifnonnull       65
	//*  17   32:iconst_1        
	//*  18   33:istore_2        
	//*  19   34:goto            37
	//*  20   37:iload_2         
	//*  21   38:ldc1            #190 <String "Cannot call then() and andFinally() on the same TransformedResult.">
	//*  22   40:invokestatic    #188 <Method void zzac.zza(boolean, Object)>
	//*  23   43:aload_0         
	//*  24   44:aload_1         
	//*  25   45:putfield        #46  <Field ResultCallbacks zzaDn>
	//*  26   48:aload_0         
	//*  27   49:invokespecial   #192 <Method void zzxa()>
	//*  28   52:aload_3         
	//*  29   53:monitorexit     
	//*  30   54:return          
	//*  31   55:astore_1        
	//*  32   56:aload_3         
	//*  33   57:monitorexit     
	//*  34   58:aload_1         
	//*  35   59:athrow          
			flag = false;
	//   36   60:iconst_0        
	//   37   61:istore_2        
		zzac.zza(flag, "Cannot call andFinally() twice.");
		if(zzaDl == null)
			flag = true;
		else
	//*  38   62:goto            19
			flag = false;
	//   39   65:iconst_0        
	//   40   66:istore_2        
		zzac.zza(flag, "Cannot call then() and andFinally() on the same TransformedResult.");
		zzaDn = resultcallbacks;
		zzxa();
		obj;
		JVM INSTR monitorexit ;
		return;
		resultcallbacks;
		throw resultcallbacks;
	//*  41   67:goto            37
	}

	public void onResult(Result result)
	{
		Object obj = zzaAh;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Object zzaAh>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(!result.getStatus().isSuccess())
			break MISSING_BLOCK_LABEL_65;
	//    5    7:aload_1         
	//    6    8:invokeinterface #201 <Method Status Result.getStatus()>
	//    7   13:invokevirtual   #206 <Method boolean Status.isSuccess()>
	//    8   16:ifeq            65
		if(zzaDl != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #42  <Field ResultTransform zzaDl>
	//*  11   23:ifnull          47
		{
			zzabo.zzwv().submit(new Runnable(result) {

				public void run()
				{
					zzaaf.zzaAg.set(((Object) (Boolean.valueOf(true))));
				//    0    0:getstatic       #35  <Field ThreadLocal zzaaf.zzaAg>
				//    1    3:iconst_1        
				//    2    4:invokestatic    #41  <Method Boolean Boolean.valueOf(boolean)>
				//    3    7:invokevirtual   #47  <Method void ThreadLocal.set(Object)>
					PendingResult pendingresult = zzabx.zzc(zzaDt).onSuccess(zzaDs);
				//    4   10:aload_0         
				//    5   11:getfield        #19  <Field zzabx zzaDt>
				//    6   14:invokestatic    #51  <Method ResultTransform zzabx.zzc(zzabx)>
				//    7   17:aload_0         
				//    8   18:getfield        #21  <Field Result zzaDs>
				//    9   21:invokevirtual   #57  <Method PendingResult ResultTransform.onSuccess(Result)>
				//   10   24:astore_1        
					zzabx.zzd(zzaDt).sendMessage(zzabx.zzd(zzaDt).obtainMessage(0, ((Object) (pendingresult))));
				//   11   25:aload_0         
				//   12   26:getfield        #19  <Field zzabx zzaDt>
				//   13   29:invokestatic    #61  <Method zzabx$zza zzabx.zzd(zzabx)>
				//   14   32:aload_0         
				//   15   33:getfield        #19  <Field zzabx zzaDt>
				//   16   36:invokestatic    #61  <Method zzabx$zza zzabx.zzd(zzabx)>
				//   17   39:iconst_0        
				//   18   40:aload_1         
				//   19   41:invokevirtual   #67  <Method Message zzabx$zza.obtainMessage(int, Object)>
				//   20   44:invokevirtual   #71  <Method boolean zzabx$zza.sendMessage(Message)>
				//   21   47:pop             
					zzaaf.zzaAg.set(((Object) (Boolean.valueOf(false))));
				//   22   48:getstatic       #35  <Field ThreadLocal zzaaf.zzaAg>
				//   23   51:iconst_0        
				//   24   52:invokestatic    #41  <Method Boolean Boolean.valueOf(boolean)>
				//   25   55:invokevirtual   #47  <Method void ThreadLocal.set(Object)>
					zzabx.zza(zzaDt, zzaDs);
				//   26   58:aload_0         
				//   27   59:getfield        #19  <Field zzabx zzaDt>
				//   28   62:aload_0         
				//   29   63:getfield        #21  <Field Result zzaDs>
				//   30   66:invokestatic    #74  <Method void zzabx.zza(zzabx, Result)>
					GoogleApiClient googleapiclient = (GoogleApiClient)zzabx.zze(zzaDt).get();
				//   31   69:aload_0         
				//   32   70:getfield        #19  <Field zzabx zzaDt>
				//   33   73:invokestatic    #78  <Method WeakReference zzabx.zze(zzabx)>
				//   34   76:invokevirtual   #84  <Method Object WeakReference.get()>
				//   35   79:checkcast       #86  <Class GoogleApiClient>
				//   36   82:astore_1        
					if(googleapiclient != null)
				//*  37   83:aload_1         
				//*  38   84:ifnull          95
						googleapiclient.zzb(zzaDt);
				//   39   87:aload_1         
				//   40   88:aload_0         
				//   41   89:getfield        #19  <Field zzabx zzaDt>
				//   42   92:invokevirtual   #90  <Method void GoogleApiClient.zzb(zzabx)>
					return;
				//   43   95:return          
					Object obj1;
					obj1;
				//   44   96:astore_1        
					zzabx.zzd(zzaDt).sendMessage(zzabx.zzd(zzaDt).obtainMessage(1, obj1));
				//   45   97:aload_0         
				//   46   98:getfield        #19  <Field zzabx zzaDt>
				//   47  101:invokestatic    #61  <Method zzabx$zza zzabx.zzd(zzabx)>
				//   48  104:aload_0         
				//   49  105:getfield        #19  <Field zzabx zzaDt>
				//   50  108:invokestatic    #61  <Method zzabx$zza zzabx.zzd(zzabx)>
				//   51  111:iconst_1        
				//   52  112:aload_1         
				//   53  113:invokevirtual   #67  <Method Message zzabx$zza.obtainMessage(int, Object)>
				//   54  116:invokevirtual   #71  <Method boolean zzabx$zza.sendMessage(Message)>
				//   55  119:pop             
					zzaaf.zzaAg.set(((Object) (Boolean.valueOf(false))));
				//   56  120:getstatic       #35  <Field ThreadLocal zzaaf.zzaAg>
				//   57  123:iconst_0        
				//   58  124:invokestatic    #41  <Method Boolean Boolean.valueOf(boolean)>
				//   59  127:invokevirtual   #47  <Method void ThreadLocal.set(Object)>
					zzabx.zza(zzaDt, zzaDs);
				//   60  130:aload_0         
				//   61  131:getfield        #19  <Field zzabx zzaDt>
				//   62  134:aload_0         
				//   63  135:getfield        #21  <Field Result zzaDs>
				//   64  138:invokestatic    #74  <Method void zzabx.zza(zzabx, Result)>
					GoogleApiClient googleapiclient1 = (GoogleApiClient)zzabx.zze(zzaDt).get();
				//   65  141:aload_0         
				//   66  142:getfield        #19  <Field zzabx zzaDt>
				//   67  145:invokestatic    #78  <Method WeakReference zzabx.zze(zzabx)>
				//   68  148:invokevirtual   #84  <Method Object WeakReference.get()>
				//   69  151:checkcast       #86  <Class GoogleApiClient>
				//   70  154:astore_1        
					if(googleapiclient1 != null)
				//*  71  155:aload_1         
				//*  72  156:ifnull          167
						googleapiclient1.zzb(zzaDt);
				//   73  159:aload_1         
				//   74  160:aload_0         
				//   75  161:getfield        #19  <Field zzabx zzaDt>
				//   76  164:invokevirtual   #90  <Method void GoogleApiClient.zzb(zzabx)>
					return;
				//   77  167:return          
					googleapiclient1;
				//   78  168:astore_1        
					zzaaf.zzaAg.set(((Object) (Boolean.valueOf(false))));
				//   79  169:getstatic       #35  <Field ThreadLocal zzaaf.zzaAg>
				//   80  172:iconst_0        
				//   81  173:invokestatic    #41  <Method Boolean Boolean.valueOf(boolean)>
				//   82  176:invokevirtual   #47  <Method void ThreadLocal.set(Object)>
					zzabx.zza(zzaDt, zzaDs);
				//   83  179:aload_0         
				//   84  180:getfield        #19  <Field zzabx zzaDt>
				//   85  183:aload_0         
				//   86  184:getfield        #21  <Field Result zzaDs>
				//   87  187:invokestatic    #74  <Method void zzabx.zza(zzabx, Result)>
					GoogleApiClient googleapiclient2 = (GoogleApiClient)zzabx.zze(zzaDt).get();
				//   88  190:aload_0         
				//   89  191:getfield        #19  <Field zzabx zzaDt>
				//   90  194:invokestatic    #78  <Method WeakReference zzabx.zze(zzabx)>
				//   91  197:invokevirtual   #84  <Method Object WeakReference.get()>
				//   92  200:checkcast       #86  <Class GoogleApiClient>
				//   93  203:astore_2        
					if(googleapiclient2 != null)
				//*  94  204:aload_2         
				//*  95  205:ifnull          216
						googleapiclient2.zzb(zzaDt);
				//   96  208:aload_2         
				//   97  209:aload_0         
				//   98  210:getfield        #19  <Field zzabx zzaDt>
				//   99  213:invokevirtual   #90  <Method void GoogleApiClient.zzb(zzabx)>
					throw googleapiclient1;
				//  100  216:aload_1         
				//  101  217:athrow          
				}

				final Result zzaDs;
				final zzabx zzaDt;

			
			{
				zzaDt = zzabx.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field zzabx zzaDt>
				zzaDs = result;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Result zzaDs>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   12   26:invokestatic    #212 <Method ExecutorService zzabo.zzwv()>
	//   13   29:new             #9   <Class zzabx$1>
	//   14   32:dup             
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:invokespecial   #214 <Method void zzabx$1(zzabx, Result)>
	//   18   38:invokeinterface #220 <Method java.util.concurrent.Future ExecutorService.submit(Runnable)>
	//   19   43:pop             
			break MISSING_BLOCK_LABEL_80;
	//   20   44:goto            80
		}
		if(zzxc())
	//*  21   47:aload_0         
	//*  22   48:invokespecial   #111 <Method boolean zzxc()>
	//*  23   51:ifeq            80
			zzaDn.onSuccess(result);
	//   24   54:aload_0         
	//   25   55:getfield        #46  <Field ResultCallbacks zzaDn>
	//   26   58:aload_1         
	//   27   59:invokevirtual   #223 <Method void ResultCallbacks.onSuccess(Result)>
		break MISSING_BLOCK_LABEL_80;
	//   28   62:goto            80
		zzE(result.getStatus());
	//   29   65:aload_0         
	//   30   66:aload_1         
	//   31   67:invokeinterface #201 <Method Status Result.getStatus()>
	//   32   72:invokespecial   #107 <Method void zzE(Status)>
		zzd(result);
	//   33   75:aload_0         
	//   34   76:aload_1         
	//   35   77:invokespecial   #120 <Method void zzd(Result)>
		obj;
	//   36   80:aload_2         
		JVM INSTR monitorexit ;
	//   37   81:monitorexit     
		return;
	//   38   82:return          
		result;
	//   39   83:astore_1        
	//*  40   84:aload_2         
		throw result;
	//   41   85:monitorexit     
	//   42   86:aload_1         
	//   43   87:athrow          
	}

	public TransformedResult then(ResultTransform resulttransform)
	{
		Object obj = zzaAh;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Object zzaAh>
	//    2    4:astore_3        
		obj;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		boolean flag;
		if(zzaDl == null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #42  <Field ResultTransform zzaDl>
	//*   7   11:ifnonnull       78
			flag = true;
	//    8   14:iconst_1        
	//    9   15:istore_2        
		else
	//*  10   16:goto            19
	//*  11   19:iload_2         
	//*  12   20:ldc1            #228 <String "Cannot call then() twice.">
	//*  13   22:invokestatic    #188 <Method void zzac.zza(boolean, Object)>
	//*  14   25:aload_0         
	//*  15   26:getfield        #46  <Field ResultCallbacks zzaDn>
	//*  16   29:ifnonnull       83
	//*  17   32:iconst_1        
	//*  18   33:istore_2        
	//*  19   34:goto            37
	//*  20   37:iload_2         
	//*  21   38:ldc1            #190 <String "Cannot call then() and andFinally() on the same TransformedResult.">
	//*  22   40:invokestatic    #188 <Method void zzac.zza(boolean, Object)>
	//*  23   43:aload_0         
	//*  24   44:aload_1         
	//*  25   45:putfield        #42  <Field ResultTransform zzaDl>
	//*  26   48:new             #2   <Class zzabx>
	//*  27   51:dup             
	//*  28   52:aload_0         
	//*  29   53:getfield        #67  <Field WeakReference zzaAj>
	//*  30   56:invokespecial   #230 <Method void zzabx(WeakReference)>
	//*  31   59:astore_1        
	//*  32   60:aload_0         
	//*  33   61:aload_1         
	//*  34   62:putfield        #44  <Field zzabx zzaDm>
	//*  35   65:aload_0         
	//*  36   66:invokespecial   #192 <Method void zzxa()>
	//*  37   69:aload_3         
	//*  38   70:monitorexit     
	//*  39   71:aload_1         
	//*  40   72:areturn         
	//*  41   73:astore_1        
	//*  42   74:aload_3         
	//*  43   75:monitorexit     
	//*  44   76:aload_1         
	//*  45   77:athrow          
			flag = false;
	//   46   78:iconst_0        
	//   47   79:istore_2        
		zzac.zza(flag, "Cannot call then() twice.");
		if(zzaDn == null)
			flag = true;
		else
	//*  48   80:goto            19
			flag = false;
	//   49   83:iconst_0        
	//   50   84:istore_2        
		zzac.zza(flag, "Cannot call then() and andFinally() on the same TransformedResult.");
		zzaDl = resulttransform;
		resulttransform = ((ResultTransform) (new zzabx(zzaAj)));
		zzaDm = ((zzabx) (resulttransform));
		zzxa();
		obj;
		JVM INSTR monitorexit ;
		return ((TransformedResult) (resulttransform));
		resulttransform;
		throw resulttransform;
	//*  51   85:goto            37
	}

	public void zza(PendingResult pendingresult)
	{
		Object obj = zzaAh;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Object zzaAh>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		zzaDo = pendingresult;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #48  <Field PendingResult zzaDo>
		zzxa();
	//    8   12:aload_0         
	//    9   13:invokespecial   #192 <Method void zzxa()>
		obj;
	//   10   16:aload_2         
		JVM INSTR monitorexit ;
	//   11   17:monitorexit     
		return;
	//   12   18:return          
		pendingresult;
	//   13   19:astore_1        
	//*  14   20:aload_2         
		throw pendingresult;
	//   15   21:monitorexit     
	//   16   22:aload_1         
	//   17   23:athrow          
	}

	void zzxb()
	{
		zzaDn = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #46  <Field ResultCallbacks zzaDn>
	//    3    5:return          
	}

	private final Object zzaAh = new Object();
	private final WeakReference zzaAj;
	private ResultTransform zzaDl;
	private zzabx zzaDm;
	private volatile ResultCallbacks zzaDn;
	private PendingResult zzaDo;
	private Status zzaDp;
	private final zza zzaDq;
	private boolean zzaDr;
}
