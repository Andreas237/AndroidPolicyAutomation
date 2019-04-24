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
//			zzabg, zzabh, zzzx

public class zzabp extends TransformedResult
	implements ResultCallback
{
	private final class zza extends Handler
	{

		public void handleMessage(Message message)
		{
			message.what;
		//    0    0:aload_1         
		//    1    1:getfield        #25  <Field int Message.what>
			JVM INSTR tableswitch 0 1: default 28
		//		               0 61
		//		               1 153;
		//    2    4:tableswitch     0 1: default 28
		//		               0 61
		//		               1 153
			   goto _L1 _L2 _L3
_L1:
			int i = message.what;
		//    3   28:aload_1         
		//    4   29:getfield        #25  <Field int Message.what>
		//    5   32:istore_2        
			Log.e("TransformedResultImpl", (new StringBuilder(70)).append("TransformationResultHandler received unknown message type: ").append(i).toString());
		//    6   33:ldc1            #27  <String "TransformedResultImpl">
		//    7   35:new             #29  <Class StringBuilder>
		//    8   38:dup             
		//    9   39:bipush          70
		//   10   41:invokespecial   #32  <Method void StringBuilder(int)>
		//   11   44:ldc1            #34  <String "TransformationResultHandler received unknown message type: ">
		//   12   46:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
		//   13   49:iload_2         
		//   14   50:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
		//   15   53:invokevirtual   #45  <Method String StringBuilder.toString()>
		//   16   56:invokestatic    #51  <Method int Log.e(String, String)>
		//   17   59:pop             
			return;
		//   18   60:return          
_L2:
			Object obj = ((Object) ((PendingResult)message.obj));
		//   19   61:aload_1         
		//   20   62:getfield        #55  <Field Object Message.obj>
		//   21   65:checkcast       #57  <Class PendingResult>
		//   22   68:astore_3        
			message = ((Message) (zzabp.zzf(zzaBU)));
		//   23   69:aload_0         
		//   24   70:getfield        #13  <Field zzabp zzaBU>
		//   25   73:invokestatic    #61  <Method Object zzabp.zzf(zzabp)>
		//   26   76:astore_1        
			message;
		//   27   77:aload_1         
			JVM INSTR monitorenter ;
		//   28   78:monitorenter    
			if(obj != null) goto _L5; else goto _L4
		//   29   79:aload_3         
		//   30   80:ifnonnull       112
_L4:
			zzabp.zza(zzabp.zzg(zzaBU), new Status(13, "Transform returned null"));
		//   31   83:aload_0         
		//   32   84:getfield        #13  <Field zzabp zzaBU>
		//   33   87:invokestatic    #65  <Method zzabp zzabp.zzg(zzabp)>
		//   34   90:new             #67  <Class Status>
		//   35   93:dup             
		//   36   94:bipush          13
		//   37   96:ldc1            #69  <String "Transform returned null">
		//   38   98:invokespecial   #72  <Method void Status(int, String)>
		//   39  101:invokestatic    #75  <Method void zzabp.zza(zzabp, Status)>
_L8:
			message;
		//   40  104:aload_1         
			JVM INSTR monitorexit ;
		//   41  105:monitorexit     
			return;
		//   42  106:return          
			obj;
		//   43  107:astore_3        
			message;
		//   44  108:aload_1         
			JVM INSTR monitorexit ;
		//   45  109:monitorexit     
			throw obj;
		//   46  110:aload_3         
		//   47  111:athrow          
_L5:
			if(!(obj instanceof zzabh)) goto _L7; else goto _L6
		//   48  112:aload_3         
		//   49  113:instanceof      #77  <Class zzabh>
		//   50  116:ifeq            139
_L6:
			zzabp.zza(zzabp.zzg(zzaBU), ((zzabh)obj).getStatus());
		//   51  119:aload_0         
		//   52  120:getfield        #13  <Field zzabp zzaBU>
		//   53  123:invokestatic    #65  <Method zzabp zzabp.zzg(zzabp)>
		//   54  126:aload_3         
		//   55  127:checkcast       #77  <Class zzabh>
		//   56  130:invokevirtual   #81  <Method Status zzabh.getStatus()>
		//   57  133:invokestatic    #75  <Method void zzabp.zza(zzabp, Status)>
			  goto _L8
		//*  58  136:goto            104
_L7:
			zzabp.zzg(zzaBU).zza(((PendingResult) (obj)));
		//   59  139:aload_0         
		//   60  140:getfield        #13  <Field zzabp zzaBU>
		//   61  143:invokestatic    #65  <Method zzabp zzabp.zzg(zzabp)>
		//   62  146:aload_3         
		//   63  147:invokevirtual   #84  <Method void zzabp.zza(PendingResult)>
			  goto _L8
		//*  64  150:goto            104
_L3:
			RuntimeException runtimeexception = (RuntimeException)message.obj;
		//   65  153:aload_1         
		//   66  154:getfield        #55  <Field Object Message.obj>
		//   67  157:checkcast       #86  <Class RuntimeException>
		//   68  160:astore_3        
			message = ((Message) (String.valueOf(((Object) (runtimeexception.getMessage())))));
		//   69  161:aload_3         
		//   70  162:invokevirtual   #89  <Method String RuntimeException.getMessage()>
		//   71  165:invokestatic    #95  <Method String String.valueOf(Object)>
		//   72  168:astore_1        
			if(((String) (message)).length() != 0)
		//*  73  169:aload_1         
		//*  74  170:invokevirtual   #99  <Method int String.length()>
		//*  75  173:ifeq            192
				message = ((Message) ("Runtime exception on the transformation worker thread: ".concat(((String) (message)))));
		//   76  176:ldc1            #101 <String "Runtime exception on the transformation worker thread: ">
		//   77  178:aload_1         
		//   78  179:invokevirtual   #105 <Method String String.concat(String)>
		//   79  182:astore_1        
			else
		//*  80  183:ldc1            #27  <String "TransformedResultImpl">
		//*  81  185:aload_1         
		//*  82  186:invokestatic    #51  <Method int Log.e(String, String)>
		//*  83  189:pop             
		//*  84  190:aload_3         
		//*  85  191:athrow          
				message = ((Message) (new String("Runtime exception on the transformation worker thread: ")));
		//   86  192:new             #91  <Class String>
		//   87  195:dup             
		//   88  196:ldc1            #101 <String "Runtime exception on the transformation worker thread: ">
		//   89  198:invokespecial   #108 <Method void String(String)>
		//   90  201:astore_1        
			Log.e("TransformedResultImpl", ((String) (message)));
			throw runtimeexception;
		//*  91  202:goto            183
		}

		final zzabp zzaBU;

		public zza(Looper looper)
		{
			zzaBU = zzabp.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field zzabp zzaBU>
			super(looper);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #16  <Method void Handler(Looper)>
		//    6   10:return          
		}
	}


	public zzabp(WeakReference weakreference)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void TransformedResult()>
		zzaBM = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #42  <Field ResultTransform zzaBM>
		zzaBN = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #44  <Field zzabp zzaBN>
		zzaBO = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #46  <Field ResultCallbacks zzaBO>
		zzaBP = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #48  <Field PendingResult zzaBP>
	//   14   24:aload_0         
	//   15   25:new             #50  <Class Object>
	//   16   28:dup             
	//   17   29:invokespecial   #51  <Method void Object()>
	//   18   32:putfield        #53  <Field Object zzayO>
		zzaBQ = null;
	//   19   35:aload_0         
	//   20   36:aconst_null     
	//   21   37:putfield        #55  <Field Status zzaBQ>
		zzaBS = false;
	//   22   40:aload_0         
	//   23   41:iconst_0        
	//   24   42:putfield        #57  <Field boolean zzaBS>
		zzac.zzb(((Object) (weakreference)), "GoogleApiClient reference must not be null");
	//   25   45:aload_1         
	//   26   46:ldc1            #59  <String "GoogleApiClient reference must not be null">
	//   27   48:invokestatic    #65  <Method Object zzac.zzb(Object, Object)>
	//   28   51:pop             
		zzayQ = weakreference;
	//   29   52:aload_0         
	//   30   53:aload_1         
	//   31   54:putfield        #67  <Field WeakReference zzayQ>
		weakreference = ((WeakReference) ((GoogleApiClient)zzayQ.get()));
	//   32   57:aload_0         
	//   33   58:getfield        #67  <Field WeakReference zzayQ>
	//   34   61:invokevirtual   #73  <Method Object WeakReference.get()>
	//   35   64:checkcast       #75  <Class GoogleApiClient>
	//   36   67:astore_1        
		if(weakreference != null)
	//*  37   68:aload_1         
	//*  38   69:ifnull          91
			weakreference = ((WeakReference) (((GoogleApiClient) (weakreference)).getLooper()));
	//   39   72:aload_1         
	//   40   73:invokevirtual   #79  <Method Looper GoogleApiClient.getLooper()>
	//   41   76:astore_1        
		else
	//*  42   77:aload_0         
	//*  43   78:new             #11  <Class zzabp$zza>
	//*  44   81:dup             
	//*  45   82:aload_0         
	//*  46   83:aload_1         
	//*  47   84:invokespecial   #82  <Method void zzabp$zza(zzabp, Looper)>
	//*  48   87:putfield        #84  <Field zzabp$zza zzaBR>
	//*  49   90:return          
			weakreference = ((WeakReference) (Looper.getMainLooper()));
	//   50   91:invokestatic    #89  <Method Looper Looper.getMainLooper()>
	//   51   94:astore_1        
		zzaBR = new zza(((Looper) (weakreference)));
	//*  52   95:goto            77
	}

	private void zzD(Status status)
	{
		synchronized(zzayO)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field Object zzayO>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			zzaBQ = status;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #55  <Field Status zzaBQ>
			zzE(zzaBQ);
	//    8   12:aload_0         
	//    9   13:aload_0         
	//   10   14:getfield        #55  <Field Status zzaBQ>
	//   11   17:invokespecial   #97  <Method void zzE(Status)>
		}
	//   12   20:aload_2         
	//   13   21:monitorexit     
		return;
	//   14   22:return          
		status;
	//   15   23:astore_1        
		obj;
	//   16   24:aload_2         
		JVM INSTR monitorexit ;
	//   17   25:monitorexit     
		throw status;
	//   18   26:aload_1         
	//   19   27:athrow          
	}

	private void zzE(Status status)
	{
		Object obj = zzayO;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Object zzayO>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(zzaBM == null) goto _L2; else goto _L1
	//    5    7:aload_0         
	//    6    8:getfield        #42  <Field ResultTransform zzaBM>
	//    7   11:ifnull          41
_L1:
		status = zzaBM.onFailure(status);
	//    8   14:aload_0         
	//    9   15:getfield        #42  <Field ResultTransform zzaBM>
	//   10   18:aload_1         
	//   11   19:invokevirtual   #103 <Method Status ResultTransform.onFailure(Status)>
	//   12   22:astore_1        
		zzac.zzb(((Object) (status)), "onFailure must not return null");
	//   13   23:aload_1         
	//   14   24:ldc1            #105 <String "onFailure must not return null">
	//   15   26:invokestatic    #65  <Method Object zzac.zzb(Object, Object)>
	//   16   29:pop             
		zzaBN.zzD(status);
	//   17   30:aload_0         
	//   18   31:getfield        #44  <Field zzabp zzaBN>
	//   19   34:aload_1         
	//   20   35:invokespecial   #107 <Method void zzD(Status)>
	//*  21   38:aload_2         
_L4:
		return;
	//   22   39:monitorexit     
	//   23   40:return          
_L2:
		if(zzwv())
	//*  24   41:aload_0         
	//*  25   42:invokespecial   #111 <Method boolean zzwv()>
	//*  26   45:ifeq            38
			zzaBO.onFailure(status);
	//   27   48:aload_0         
	//   28   49:getfield        #46  <Field ResultCallbacks zzaBO>
	//   29   52:aload_1         
	//   30   53:invokevirtual   #115 <Method void ResultCallbacks.onFailure(Status)>
		if(true) goto _L4; else goto _L3
	//   31   56:goto            38
_L3:
		status;
	//   32   59:astore_1        
		obj;
	//   33   60:aload_2         
		JVM INSTR monitorexit ;
	//   34   61:monitorexit     
		throw status;
	//   35   62:aload_1         
	//   36   63:athrow          
	}

	static void zza(zzabp zzabp1, Result result)
	{
		zzabp1.zzd(result);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #120 <Method void zzd(Result)>
	//    3    5:return          
	}

	static void zza(zzabp zzabp1, Status status)
	{
		zzabp1.zzD(status);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #107 <Method void zzD(Status)>
	//    3    5:return          
	}

	static ResultTransform zzc(zzabp zzabp1)
	{
		return zzabp1.zzaBM;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field ResultTransform zzaBM>
	//    2    4:areturn         
	}

	static zza zzd(zzabp zzabp1)
	{
		return zzabp1.zzaBR;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field zzabp$zza zzaBR>
	//    2    4:areturn         
	}

	private void zzd(Result result)
	{
		if(!(result instanceof Releasable))
			break MISSING_BLOCK_LABEL_16;
	//    0    0:aload_1         
	//    1    1:instanceof      #128 <Class Releasable>
	//    2    4:ifeq            16
		((Releasable)result).release();
	//    3    7:aload_1         
	//    4    8:checkcast       #128 <Class Releasable>
	//    5   11:invokeinterface #131 <Method void Releasable.release()>
		return;
	//    6   16:return          
		RuntimeException runtimeexception;
		runtimeexception;
	//    7   17:astore_2        
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
		return;
	//   28   59:return          
	}

	static WeakReference zze(zzabp zzabp1)
	{
		return zzabp1.zzayQ;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field WeakReference zzayQ>
	//    2    4:areturn         
	}

	static Object zzf(zzabp zzabp1)
	{
		return zzabp1.zzayO;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Object zzayO>
	//    2    4:areturn         
	}

	static zzabp zzg(zzabp zzabp1)
	{
		return zzabp1.zzaBN;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field zzabp zzaBN>
	//    2    4:areturn         
	}

	private void zzwt()
	{
		if(zzaBM != null || zzaBO != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field ResultTransform zzaBM>
	//*   2    4:ifnonnull       15
	//*   3    7:aload_0         
	//*   4    8:getfield        #46  <Field ResultCallbacks zzaBO>
	//*   5   11:ifnonnull       15
	//*   6   14:return          
		{
			GoogleApiClient googleapiclient = (GoogleApiClient)zzayQ.get();
	//    7   15:aload_0         
	//    8   16:getfield        #67  <Field WeakReference zzayQ>
	//    9   19:invokevirtual   #73  <Method Object WeakReference.get()>
	//   10   22:checkcast       #75  <Class GoogleApiClient>
	//   11   25:astore_1        
			if(!zzaBS && zzaBM != null && googleapiclient != null)
	//*  12   26:aload_0         
	//*  13   27:getfield        #57  <Field boolean zzaBS>
	//*  14   30:ifne            54
	//*  15   33:aload_0         
	//*  16   34:getfield        #42  <Field ResultTransform zzaBM>
	//*  17   37:ifnull          54
	//*  18   40:aload_1         
	//*  19   41:ifnull          54
			{
				googleapiclient.zza(this);
	//   20   44:aload_1         
	//   21   45:aload_0         
	//   22   46:invokevirtual   #174 <Method void GoogleApiClient.zza(zzabp)>
				zzaBS = true;
	//   23   49:aload_0         
	//   24   50:iconst_1        
	//   25   51:putfield        #57  <Field boolean zzaBS>
			}
			if(zzaBQ != null)
	//*  26   54:aload_0         
	//*  27   55:getfield        #55  <Field Status zzaBQ>
	//*  28   58:ifnull          70
			{
				zzE(zzaBQ);
	//   29   61:aload_0         
	//   30   62:aload_0         
	//   31   63:getfield        #55  <Field Status zzaBQ>
	//   32   66:invokespecial   #97  <Method void zzE(Status)>
				return;
	//   33   69:return          
			}
			if(zzaBP != null)
	//*  34   70:aload_0         
	//*  35   71:getfield        #48  <Field PendingResult zzaBP>
	//*  36   74:ifnull          14
			{
				zzaBP.setResultCallback(((ResultCallback) (this)));
	//   37   77:aload_0         
	//   38   78:getfield        #48  <Field PendingResult zzaBP>
	//   39   81:aload_0         
	//   40   82:invokevirtual   #180 <Method void PendingResult.setResultCallback(ResultCallback)>
				return;
	//   41   85:return          
			}
		}
	}

	private boolean zzwv()
	{
		GoogleApiClient googleapiclient = (GoogleApiClient)zzayQ.get();
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field WeakReference zzayQ>
	//    2    4:invokevirtual   #73  <Method Object WeakReference.get()>
	//    3    7:checkcast       #75  <Class GoogleApiClient>
	//    4   10:astore_1        
		return zzaBO != null && googleapiclient != null;
	//    5   11:aload_0         
	//    6   12:getfield        #46  <Field ResultCallbacks zzaBO>
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
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		Object obj = zzayO;
	//    2    2:aload_0         
	//    3    3:getfield        #53  <Field Object zzayO>
	//    4    6:astore          4
		obj;
	//    5    8:aload           4
		JVM INSTR monitorenter ;
	//    6   10:monitorenter    
		boolean flag;
		if(zzaBO == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #46  <Field ResultCallbacks zzaBO>
	//*   9   15:ifnonnull       60
			flag = true;
	//   10   18:iconst_1        
	//   11   19:istore_2        
		else
	//*  12   20:iload_2         
	//*  13   21:ldc1            #185 <String "Cannot call andFinally() twice.">
	//*  14   23:invokestatic    #188 <Method void zzac.zza(boolean, Object)>
	//*  15   26:aload_0         
	//*  16   27:getfield        #42  <Field ResultTransform zzaBM>
	//*  17   30:ifnonnull       65
	//*  18   33:iload_3         
	//*  19   34:istore_2        
	//*  20   35:iload_2         
	//*  21   36:ldc1            #190 <String "Cannot call then() and andFinally() on the same TransformedResult.">
	//*  22   38:invokestatic    #188 <Method void zzac.zza(boolean, Object)>
	//*  23   41:aload_0         
	//*  24   42:aload_1         
	//*  25   43:putfield        #46  <Field ResultCallbacks zzaBO>
	//*  26   46:aload_0         
	//*  27   47:invokespecial   #192 <Method void zzwt()>
	//*  28   50:aload           4
	//*  29   52:monitorexit     
	//*  30   53:return          
	//*  31   54:astore_1        
	//*  32   55:aload           4
	//*  33   57:monitorexit     
	//*  34   58:aload_1         
	//*  35   59:athrow          
			flag = false;
	//   36   60:iconst_0        
	//   37   61:istore_2        
		zzac.zza(flag, "Cannot call andFinally() twice.");
		if(zzaBM == null)
			flag = flag1;
		else
	//*  38   62:goto            20
			flag = false;
	//   39   65:iconst_0        
	//   40   66:istore_2        
		zzac.zza(flag, "Cannot call then() and andFinally() on the same TransformedResult.");
		zzaBO = resultcallbacks;
		zzwt();
		obj;
		JVM INSTR monitorexit ;
		return;
		resultcallbacks;
		obj;
		JVM INSTR monitorexit ;
		throw resultcallbacks;
	//*  41   67:goto            35
	}

	public void onResult(Result result)
	{
		Object obj = zzayO;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Object zzayO>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(!result.getStatus().isSuccess())
			break MISSING_BLOCK_LABEL_70;
	//    5    7:aload_1         
	//    6    8:invokeinterface #201 <Method Status Result.getStatus()>
	//    7   13:invokevirtual   #206 <Method boolean Status.isSuccess()>
	//    8   16:ifeq            70
		if(zzaBM == null) goto _L2; else goto _L1
	//    9   19:aload_0         
	//   10   20:getfield        #42  <Field ResultTransform zzaBM>
	//   11   23:ifnull          47
_L1:
		zzabg.zzvR().submit(new Runnable(result) {

			public void run()
			{
				zzzx.zzayN.set(((Object) (Boolean.valueOf(true))));
			//    0    0:getstatic       #35  <Field ThreadLocal zzzx.zzayN>
			//    1    3:iconst_1        
			//    2    4:invokestatic    #41  <Method Boolean Boolean.valueOf(boolean)>
			//    3    7:invokevirtual   #47  <Method void ThreadLocal.set(Object)>
				PendingResult pendingresult = zzabp.zzc(zzaBU).onSuccess(zzaBT);
			//    4   10:aload_0         
			//    5   11:getfield        #19  <Field zzabp zzaBU>
			//    6   14:invokestatic    #51  <Method ResultTransform zzabp.zzc(zzabp)>
			//    7   17:aload_0         
			//    8   18:getfield        #21  <Field Result zzaBT>
			//    9   21:invokevirtual   #57  <Method PendingResult ResultTransform.onSuccess(Result)>
			//   10   24:astore_1        
				zzabp.zzd(zzaBU).sendMessage(zzabp.zzd(zzaBU).obtainMessage(0, ((Object) (pendingresult))));
			//   11   25:aload_0         
			//   12   26:getfield        #19  <Field zzabp zzaBU>
			//   13   29:invokestatic    #61  <Method zzabp$zza zzabp.zzd(zzabp)>
			//   14   32:aload_0         
			//   15   33:getfield        #19  <Field zzabp zzaBU>
			//   16   36:invokestatic    #61  <Method zzabp$zza zzabp.zzd(zzabp)>
			//   17   39:iconst_0        
			//   18   40:aload_1         
			//   19   41:invokevirtual   #67  <Method Message zzabp$zza.obtainMessage(int, Object)>
			//   20   44:invokevirtual   #71  <Method boolean zzabp$zza.sendMessage(Message)>
			//   21   47:pop             
				zzzx.zzayN.set(((Object) (Boolean.valueOf(false))));
			//   22   48:getstatic       #35  <Field ThreadLocal zzzx.zzayN>
			//   23   51:iconst_0        
			//   24   52:invokestatic    #41  <Method Boolean Boolean.valueOf(boolean)>
			//   25   55:invokevirtual   #47  <Method void ThreadLocal.set(Object)>
				zzabp.zza(zzaBU, zzaBT);
			//   26   58:aload_0         
			//   27   59:getfield        #19  <Field zzabp zzaBU>
			//   28   62:aload_0         
			//   29   63:getfield        #21  <Field Result zzaBT>
			//   30   66:invokestatic    #74  <Method void zzabp.zza(zzabp, Result)>
				GoogleApiClient googleapiclient = (GoogleApiClient)zzabp.zze(zzaBU).get();
			//   31   69:aload_0         
			//   32   70:getfield        #19  <Field zzabp zzaBU>
			//   33   73:invokestatic    #78  <Method WeakReference zzabp.zze(zzabp)>
			//   34   76:invokevirtual   #84  <Method Object WeakReference.get()>
			//   35   79:checkcast       #86  <Class GoogleApiClient>
			//   36   82:astore_1        
				if(googleapiclient != null)
			//*  37   83:aload_1         
			//*  38   84:ifnull          95
					googleapiclient.zzb(zzaBU);
			//   39   87:aload_1         
			//   40   88:aload_0         
			//   41   89:getfield        #19  <Field zzabp zzaBU>
			//   42   92:invokevirtual   #90  <Method void GoogleApiClient.zzb(zzabp)>
_L2:
				return;
			//   43   95:return          
				Object obj1;
				obj1;
			//   44   96:astore_1        
				zzabp.zzd(zzaBU).sendMessage(zzabp.zzd(zzaBU).obtainMessage(1, obj1));
			//   45   97:aload_0         
			//   46   98:getfield        #19  <Field zzabp zzaBU>
			//   47  101:invokestatic    #61  <Method zzabp$zza zzabp.zzd(zzabp)>
			//   48  104:aload_0         
			//   49  105:getfield        #19  <Field zzabp zzaBU>
			//   50  108:invokestatic    #61  <Method zzabp$zza zzabp.zzd(zzabp)>
			//   51  111:iconst_1        
			//   52  112:aload_1         
			//   53  113:invokevirtual   #67  <Method Message zzabp$zza.obtainMessage(int, Object)>
			//   54  116:invokevirtual   #71  <Method boolean zzabp$zza.sendMessage(Message)>
			//   55  119:pop             
				GoogleApiClient googleapiclient1;
				zzzx.zzayN.set(((Object) (Boolean.valueOf(false))));
			//   56  120:getstatic       #35  <Field ThreadLocal zzzx.zzayN>
			//   57  123:iconst_0        
			//   58  124:invokestatic    #41  <Method Boolean Boolean.valueOf(boolean)>
			//   59  127:invokevirtual   #47  <Method void ThreadLocal.set(Object)>
				zzabp.zza(zzaBU, zzaBT);
			//   60  130:aload_0         
			//   61  131:getfield        #19  <Field zzabp zzaBU>
			//   62  134:aload_0         
			//   63  135:getfield        #21  <Field Result zzaBT>
			//   64  138:invokestatic    #74  <Method void zzabp.zza(zzabp, Result)>
				googleapiclient1 = (GoogleApiClient)zzabp.zze(zzaBU).get();
			//   65  141:aload_0         
			//   66  142:getfield        #19  <Field zzabp zzaBU>
			//   67  145:invokestatic    #78  <Method WeakReference zzabp.zze(zzabp)>
			//   68  148:invokevirtual   #84  <Method Object WeakReference.get()>
			//   69  151:checkcast       #86  <Class GoogleApiClient>
			//   70  154:astore_1        
				if(googleapiclient1 == null) goto _L2; else goto _L1
			//   71  155:aload_1         
			//   72  156:ifnull          95
_L1:
				googleapiclient1.zzb(zzaBU);
			//   73  159:aload_1         
			//   74  160:aload_0         
			//   75  161:getfield        #19  <Field zzabp zzaBU>
			//   76  164:invokevirtual   #90  <Method void GoogleApiClient.zzb(zzabp)>
				return;
			//   77  167:return          
				googleapiclient1;
			//   78  168:astore_1        
				zzzx.zzayN.set(((Object) (Boolean.valueOf(false))));
			//   79  169:getstatic       #35  <Field ThreadLocal zzzx.zzayN>
			//   80  172:iconst_0        
			//   81  173:invokestatic    #41  <Method Boolean Boolean.valueOf(boolean)>
			//   82  176:invokevirtual   #47  <Method void ThreadLocal.set(Object)>
				zzabp.zza(zzaBU, zzaBT);
			//   83  179:aload_0         
			//   84  180:getfield        #19  <Field zzabp zzaBU>
			//   85  183:aload_0         
			//   86  184:getfield        #21  <Field Result zzaBT>
			//   87  187:invokestatic    #74  <Method void zzabp.zza(zzabp, Result)>
				GoogleApiClient googleapiclient2 = (GoogleApiClient)zzabp.zze(zzaBU).get();
			//   88  190:aload_0         
			//   89  191:getfield        #19  <Field zzabp zzaBU>
			//   90  194:invokestatic    #78  <Method WeakReference zzabp.zze(zzabp)>
			//   91  197:invokevirtual   #84  <Method Object WeakReference.get()>
			//   92  200:checkcast       #86  <Class GoogleApiClient>
			//   93  203:astore_2        
				if(googleapiclient2 != null)
			//*  94  204:aload_2         
			//*  95  205:ifnull          216
					googleapiclient2.zzb(zzaBU);
			//   96  208:aload_2         
			//   97  209:aload_0         
			//   98  210:getfield        #19  <Field zzabp zzaBU>
			//   99  213:invokevirtual   #90  <Method void GoogleApiClient.zzb(zzabp)>
				throw googleapiclient1;
			//  100  216:aload_1         
			//  101  217:athrow          
			}

			final Result zzaBT;
			final zzabp zzaBU;

			
			{
				zzaBU = zzabp.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field zzabp zzaBU>
				zzaBT = result;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Result zzaBT>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   12   26:invokestatic    #212 <Method ExecutorService zzabg.zzvR()>
	//   13   29:new             #9   <Class zzabp$1>
	//   14   32:dup             
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:invokespecial   #214 <Method void zzabp$1(zzabp, Result)>
	//   18   38:invokeinterface #220 <Method java.util.concurrent.Future ExecutorService.submit(Runnable)>
	//   19   43:pop             
	//*  20   44:aload_2         
_L4:
		return;
	//   21   45:monitorexit     
	//   22   46:return          
_L2:
		if(!zzwv()) goto _L4; else goto _L3
	//   23   47:aload_0         
	//   24   48:invokespecial   #111 <Method boolean zzwv()>
	//   25   51:ifeq            44
_L3:
		zzaBO.onSuccess(result);
	//   26   54:aload_0         
	//   27   55:getfield        #46  <Field ResultCallbacks zzaBO>
	//   28   58:aload_1         
	//   29   59:invokevirtual   #223 <Method void ResultCallbacks.onSuccess(Result)>
		  goto _L4
	//*  30   62:goto            44
		result;
	//   31   65:astore_1        
		obj;
	//   32   66:aload_2         
		JVM INSTR monitorexit ;
	//   33   67:monitorexit     
		throw result;
	//   34   68:aload_1         
	//   35   69:athrow          
		zzD(result.getStatus());
	//   36   70:aload_0         
	//   37   71:aload_1         
	//   38   72:invokeinterface #201 <Method Status Result.getStatus()>
	//   39   77:invokespecial   #107 <Method void zzD(Status)>
		zzd(result);
	//   40   80:aload_0         
	//   41   81:aload_1         
	//   42   82:invokespecial   #120 <Method void zzd(Result)>
		  goto _L4
	//*  43   85:goto            44
	}

	public TransformedResult then(ResultTransform resulttransform)
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		Object obj = zzayO;
	//    2    2:aload_0         
	//    3    3:getfield        #53  <Field Object zzayO>
	//    4    6:astore          4
		obj;
	//    5    8:aload           4
		JVM INSTR monitorenter ;
	//    6   10:monitorenter    
		boolean flag;
		if(zzaBM == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #42  <Field ResultTransform zzaBM>
	//*   9   15:ifnonnull       78
			flag = true;
	//   10   18:iconst_1        
	//   11   19:istore_2        
		else
	//*  12   20:iload_2         
	//*  13   21:ldc1            #228 <String "Cannot call then() twice.">
	//*  14   23:invokestatic    #188 <Method void zzac.zza(boolean, Object)>
	//*  15   26:aload_0         
	//*  16   27:getfield        #46  <Field ResultCallbacks zzaBO>
	//*  17   30:ifnonnull       83
	//*  18   33:iload_3         
	//*  19   34:istore_2        
	//*  20   35:iload_2         
	//*  21   36:ldc1            #190 <String "Cannot call then() and andFinally() on the same TransformedResult.">
	//*  22   38:invokestatic    #188 <Method void zzac.zza(boolean, Object)>
	//*  23   41:aload_0         
	//*  24   42:aload_1         
	//*  25   43:putfield        #42  <Field ResultTransform zzaBM>
	//*  26   46:new             #2   <Class zzabp>
	//*  27   49:dup             
	//*  28   50:aload_0         
	//*  29   51:getfield        #67  <Field WeakReference zzayQ>
	//*  30   54:invokespecial   #230 <Method void zzabp(WeakReference)>
	//*  31   57:astore_1        
	//*  32   58:aload_0         
	//*  33   59:aload_1         
	//*  34   60:putfield        #44  <Field zzabp zzaBN>
	//*  35   63:aload_0         
	//*  36   64:invokespecial   #192 <Method void zzwt()>
	//*  37   67:aload           4
	//*  38   69:monitorexit     
	//*  39   70:aload_1         
	//*  40   71:areturn         
	//*  41   72:astore_1        
	//*  42   73:aload           4
	//*  43   75:monitorexit     
	//*  44   76:aload_1         
	//*  45   77:athrow          
			flag = false;
	//   46   78:iconst_0        
	//   47   79:istore_2        
		zzac.zza(flag, "Cannot call then() twice.");
		if(zzaBO == null)
			flag = flag1;
		else
	//*  48   80:goto            20
			flag = false;
	//   49   83:iconst_0        
	//   50   84:istore_2        
		zzac.zza(flag, "Cannot call then() and andFinally() on the same TransformedResult.");
		zzaBM = resulttransform;
		resulttransform = ((ResultTransform) (new zzabp(zzayQ)));
		zzaBN = ((zzabp) (resulttransform));
		zzwt();
		obj;
		JVM INSTR monitorexit ;
		return ((TransformedResult) (resulttransform));
		resulttransform;
		obj;
		JVM INSTR monitorexit ;
		throw resulttransform;
	//*  51   85:goto            35
	}

	public void zza(PendingResult pendingresult)
	{
		synchronized(zzayO)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field Object zzayO>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			zzaBP = pendingresult;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #48  <Field PendingResult zzaBP>
			zzwt();
	//    8   12:aload_0         
	//    9   13:invokespecial   #192 <Method void zzwt()>
		}
	//   10   16:aload_2         
	//   11   17:monitorexit     
		return;
	//   12   18:return          
		pendingresult;
	//   13   19:astore_1        
		obj;
	//   14   20:aload_2         
		JVM INSTR monitorexit ;
	//   15   21:monitorexit     
		throw pendingresult;
	//   16   22:aload_1         
	//   17   23:athrow          
	}

	void zzwu()
	{
		zzaBO = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #46  <Field ResultCallbacks zzaBO>
	//    3    5:return          
	}

	private ResultTransform zzaBM;
	private zzabp zzaBN;
	private volatile ResultCallbacks zzaBO;
	private PendingResult zzaBP;
	private Status zzaBQ;
	private final zza zzaBR;
	private boolean zzaBS;
	private final Object zzayO = new Object();
	private final WeakReference zzayQ;
}
