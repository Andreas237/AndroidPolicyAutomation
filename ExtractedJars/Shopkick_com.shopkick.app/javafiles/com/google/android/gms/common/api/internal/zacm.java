// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zaco, zacc, zacn

public final class zacm extends TransformedResult
	implements ResultCallback
{

	public zacm(WeakReference weakreference)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void TransformedResult()>
		zakn = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #37  <Field ResultTransform zakn>
		zako = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #39  <Field zacm zako>
		zakp = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #41  <Field ResultCallbacks zakp>
		zakq = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #43  <Field PendingResult zakq>
	//   14   24:aload_0         
	//   15   25:new             #45  <Class Object>
	//   16   28:dup             
	//   17   29:invokespecial   #46  <Method void Object()>
	//   18   32:putfield        #48  <Field Object zadn>
		zakr = null;
	//   19   35:aload_0         
	//   20   36:aconst_null     
	//   21   37:putfield        #50  <Field Status zakr>
		zakt = false;
	//   22   40:aload_0         
	//   23   41:iconst_0        
	//   24   42:putfield        #52  <Field boolean zakt>
		Preconditions.checkNotNull(((Object) (weakreference)), "GoogleApiClient reference must not be null");
	//   25   45:aload_1         
	//   26   46:ldc1            #54  <String "GoogleApiClient reference must not be null">
	//   27   48:invokestatic    #60  <Method Object Preconditions.checkNotNull(Object, Object)>
	//   28   51:pop             
		zadp = weakreference;
	//   29   52:aload_0         
	//   30   53:aload_1         
	//   31   54:putfield        #62  <Field WeakReference zadp>
		weakreference = ((WeakReference) ((GoogleApiClient)zadp.get()));
	//   32   57:aload_0         
	//   33   58:getfield        #62  <Field WeakReference zadp>
	//   34   61:invokevirtual   #68  <Method Object WeakReference.get()>
	//   35   64:checkcast       #70  <Class GoogleApiClient>
	//   36   67:astore_1        
		if(weakreference != null)
	//*  37   68:aload_1         
	//*  38   69:ifnull          80
			weakreference = ((WeakReference) (((GoogleApiClient) (weakreference)).getLooper()));
	//   39   72:aload_1         
	//   40   73:invokevirtual   #74  <Method Looper GoogleApiClient.getLooper()>
	//   41   76:astore_1        
		else
	//*  42   77:goto            84
			weakreference = ((WeakReference) (Looper.getMainLooper()));
	//   43   80:invokestatic    #79  <Method Looper Looper.getMainLooper()>
	//   44   83:astore_1        
		zaks = new zaco(this, ((Looper) (weakreference)));
	//   45   84:aload_0         
	//   46   85:new             #81  <Class zaco>
	//   47   88:dup             
	//   48   89:aload_0         
	//   49   90:aload_1         
	//   50   91:invokespecial   #84  <Method void zaco(zacm, Looper)>
	//   51   94:putfield        #86  <Field zaco zaks>
	//   52   97:return          
	}

	static void zaa(zacm zacm1, Result result)
	{
		zab(result);
	//    0    0:aload_1         
	//    1    1:invokestatic    #95  <Method void zab(Result)>
	//    2    4:return          
	}

	static void zaa(zacm zacm1, Status status)
	{
		zacm1.zad(status);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #100 <Method void zad(Status)>
	//    3    5:return          
	}

	private static void zab(Result result)
	{
		if(result instanceof Releasable)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #104 <Class Releasable>
	//*   2    4:ifeq            65
			try
			{
				((Releasable)result).release();
	//    3    7:aload_0         
	//    4    8:checkcast       #104 <Class Releasable>
	//    5   11:invokeinterface #107 <Method void Releasable.release()>
				return;
	//    6   16:return          
			}
			catch(RuntimeException runtimeexception)
	//*   7   17:astore_1        
			{
				result = ((Result) (String.valueOf(((Object) (result)))));
	//    8   18:aload_0         
	//    9   19:invokestatic    #113 <Method String String.valueOf(Object)>
	//   10   22:astore_0        
				StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (result))).length() + 18);
	//   11   23:new             #115 <Class StringBuilder>
	//   12   26:dup             
	//   13   27:aload_0         
	//   14   28:invokestatic    #113 <Method String String.valueOf(Object)>
	//   15   31:invokevirtual   #119 <Method int String.length()>
	//   16   34:bipush          18
	//   17   36:iadd            
	//   18   37:invokespecial   #122 <Method void StringBuilder(int)>
	//   19   40:astore_2        
				stringbuilder.append("Unable to release ");
	//   20   41:aload_2         
	//   21   42:ldc1            #124 <String "Unable to release ">
	//   22   44:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   23   47:pop             
				stringbuilder.append(((String) (result)));
	//   24   48:aload_2         
	//   25   49:aload_0         
	//   26   50:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   27   53:pop             
				Log.w("TransformedResultImpl", stringbuilder.toString(), ((Throwable) (runtimeexception)));
	//   28   54:ldc1            #130 <String "TransformedResultImpl">
	//   29   56:aload_2         
	//   30   57:invokevirtual   #134 <Method String StringBuilder.toString()>
	//   31   60:aload_1         
	//   32   61:invokestatic    #140 <Method int Log.w(String, String, Throwable)>
	//   33   64:pop             
			}
	//   34   65:return          
	}

	private final void zabu()
	{
		if(zakn == null && zakp == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field ResultTransform zakn>
	//*   2    4:ifnonnull       15
	//*   3    7:aload_0         
	//*   4    8:getfield        #41  <Field ResultCallbacks zakp>
	//*   5   11:ifnonnull       15
			return;
	//    6   14:return          
		Object obj = ((Object) ((GoogleApiClient)zadp.get()));
	//    7   15:aload_0         
	//    8   16:getfield        #62  <Field WeakReference zadp>
	//    9   19:invokevirtual   #68  <Method Object WeakReference.get()>
	//   10   22:checkcast       #70  <Class GoogleApiClient>
	//   11   25:astore_1        
		if(!zakt && zakn != null && obj != null)
	//*  12   26:aload_0         
	//*  13   27:getfield        #52  <Field boolean zakt>
	//*  14   30:ifne            54
	//*  15   33:aload_0         
	//*  16   34:getfield        #37  <Field ResultTransform zakn>
	//*  17   37:ifnull          54
	//*  18   40:aload_1         
	//*  19   41:ifnull          54
		{
			((GoogleApiClient) (obj)).zaa(this);
	//   20   44:aload_1         
	//   21   45:aload_0         
	//   22   46:invokevirtual   #147 <Method void GoogleApiClient.zaa(zacm)>
			zakt = true;
	//   23   49:aload_0         
	//   24   50:iconst_1        
	//   25   51:putfield        #52  <Field boolean zakt>
		}
		obj = ((Object) (zakr));
	//   26   54:aload_0         
	//   27   55:getfield        #50  <Field Status zakr>
	//   28   58:astore_1        
		if(obj != null)
	//*  29   59:aload_1         
	//*  30   60:ifnull          69
		{
			zae(((Status) (obj)));
	//   31   63:aload_0         
	//   32   64:aload_1         
	//   33   65:invokespecial   #150 <Method void zae(Status)>
			return;
	//   34   68:return          
		}
		obj = ((Object) (zakq));
	//   35   69:aload_0         
	//   36   70:getfield        #43  <Field PendingResult zakq>
	//   37   73:astore_1        
		if(obj != null)
	//*  38   74:aload_1         
	//*  39   75:ifnull          83
			((PendingResult) (obj)).setResultCallback(((ResultCallback) (this)));
	//   40   78:aload_1         
	//   41   79:aload_0         
	//   42   80:invokevirtual   #156 <Method void PendingResult.setResultCallback(ResultCallback)>
	//   43   83:return          
	}

	private final boolean zabw()
	{
		GoogleApiClient googleapiclient = (GoogleApiClient)zadp.get();
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field WeakReference zadp>
	//    2    4:invokevirtual   #68  <Method Object WeakReference.get()>
	//    3    7:checkcast       #70  <Class GoogleApiClient>
	//    4   10:astore_1        
		return zakp != null && googleapiclient != null;
	//    5   11:aload_0         
	//    6   12:getfield        #41  <Field ResultCallbacks zakp>
	//    7   15:ifnull          24
	//    8   18:aload_1         
	//    9   19:ifnull          24
	//   10   22:iconst_1        
	//   11   23:ireturn         
	//   12   24:iconst_0        
	//   13   25:ireturn         
	}

	static ResultTransform zac(zacm zacm1)
	{
		return zacm1.zakn;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field ResultTransform zakn>
	//    2    4:areturn         
	}

	static zaco zad(zacm zacm1)
	{
		return zacm1.zaks;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field zaco zaks>
	//    2    4:areturn         
	}

	private final void zad(Status status)
	{
		synchronized(zadn)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field Object zadn>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			zakr = status;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #50  <Field Status zakr>
			zae(zakr);
	//    8   12:aload_0         
	//    9   13:aload_0         
	//   10   14:getfield        #50  <Field Status zakr>
	//   11   17:invokespecial   #150 <Method void zae(Status)>
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

	static WeakReference zae(zacm zacm1)
	{
		return zacm1.zadp;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field WeakReference zadp>
	//    2    4:areturn         
	}

	private final void zae(Status status)
	{
		Object obj = zadn;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Object zadn>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(zakn != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #37  <Field ResultTransform zakn>
	//*   7   11:ifnull          41
		{
			status = zakn.onFailure(status);
	//    8   14:aload_0         
	//    9   15:getfield        #37  <Field ResultTransform zakn>
	//   10   18:aload_1         
	//   11   19:invokevirtual   #169 <Method Status ResultTransform.onFailure(Status)>
	//   12   22:astore_1        
			Preconditions.checkNotNull(((Object) (status)), "onFailure must not return null");
	//   13   23:aload_1         
	//   14   24:ldc1            #171 <String "onFailure must not return null">
	//   15   26:invokestatic    #60  <Method Object Preconditions.checkNotNull(Object, Object)>
	//   16   29:pop             
			zako.zad(status);
	//   17   30:aload_0         
	//   18   31:getfield        #39  <Field zacm zako>
	//   19   34:aload_1         
	//   20   35:invokespecial   #100 <Method void zad(Status)>
			break MISSING_BLOCK_LABEL_56;
	//   21   38:goto            56
		}
		if(zabw())
	//*  22   41:aload_0         
	//*  23   42:invokespecial   #173 <Method boolean zabw()>
	//*  24   45:ifeq            56
			zakp.onFailure(status);
	//   25   48:aload_0         
	//   26   49:getfield        #41  <Field ResultCallbacks zakp>
	//   27   52:aload_1         
	//   28   53:invokevirtual   #177 <Method void ResultCallbacks.onFailure(Status)>
		obj;
	//   29   56:aload_2         
		JVM INSTR monitorexit ;
	//   30   57:monitorexit     
		return;
	//   31   58:return          
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

	static Object zaf(zacm zacm1)
	{
		return zacm1.zadn;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Object zadn>
	//    2    4:areturn         
	}

	static zacm zag(zacm zacm1)
	{
		return zacm1.zako;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field zacm zako>
	//    2    4:areturn         
	}

	public final void andFinally(ResultCallbacks resultcallbacks)
	{
		Object obj = zadn;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Object zadn>
	//    2    4:astore          4
		obj;
	//    3    6:aload           4
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		ResultCallbacks resultcallbacks1 = zakp;
	//    5    9:aload_0         
	//    6   10:getfield        #41  <Field ResultCallbacks zakp>
	//    7   13:astore          5
		boolean flag;
		boolean flag1 = true;
	//    8   15:iconst_1        
	//    9   16:istore_3        
		if(resultcallbacks1 == null)
	//*  10   17:aload           5
	//*  11   19:ifnonnull       70
			flag = true;
	//   12   22:iconst_1        
	//   13   23:istore_2        
		else
	//*  14   24:goto            27
	//*  15   27:iload_2         
	//*  16   28:ldc1            #186 <String "Cannot call andFinally() twice.">
	//*  17   30:invokestatic    #190 <Method void Preconditions.checkState(boolean, Object)>
	//*  18   33:aload_0         
	//*  19   34:getfield        #37  <Field ResultTransform zakn>
	//*  20   37:ifnonnull       75
	//*  21   40:iload_3         
	//*  22   41:istore_2        
	//*  23   42:goto            45
	//*  24   45:iload_2         
	//*  25   46:ldc1            #192 <String "Cannot call then() and andFinally() on the same TransformedResult.">
	//*  26   48:invokestatic    #190 <Method void Preconditions.checkState(boolean, Object)>
	//*  27   51:aload_0         
	//*  28   52:aload_1         
	//*  29   53:putfield        #41  <Field ResultCallbacks zakp>
	//*  30   56:aload_0         
	//*  31   57:invokespecial   #194 <Method void zabu()>
	//*  32   60:aload           4
	//*  33   62:monitorexit     
	//*  34   63:return          
	//*  35   64:astore_1        
	//*  36   65:aload           4
	//*  37   67:monitorexit     
	//*  38   68:aload_1         
	//*  39   69:athrow          
			flag = false;
	//   40   70:iconst_0        
	//   41   71:istore_2        
		Preconditions.checkState(flag, "Cannot call andFinally() twice.");
		if(zakn == null)
			flag = flag1;
		else
	//*  42   72:goto            27
			flag = false;
	//   43   75:iconst_0        
	//   44   76:istore_2        
		Preconditions.checkState(flag, "Cannot call then() and andFinally() on the same TransformedResult.");
		zakp = resultcallbacks;
		zabu();
		obj;
		JVM INSTR monitorexit ;
		return;
		resultcallbacks;
		obj;
		JVM INSTR monitorexit ;
		throw resultcallbacks;
	//*  45   77:goto            45
	}

	public final void onResult(Result result)
	{
		Object obj = zadn;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Object zadn>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(!result.getStatus().isSuccess())
			break MISSING_BLOCK_LABEL_65;
	//    5    7:aload_1         
	//    6    8:invokeinterface #203 <Method Status Result.getStatus()>
	//    7   13:invokevirtual   #208 <Method boolean Status.isSuccess()>
	//    8   16:ifeq            65
		if(zakn != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #37  <Field ResultTransform zakn>
	//*  11   23:ifnull          47
		{
			zacc.zabb().submit(((Runnable) (new zacn(this, result))));
	//   12   26:invokestatic    #214 <Method ExecutorService zacc.zabb()>
	//   13   29:new             #216 <Class zacn>
	//   14   32:dup             
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:invokespecial   #218 <Method void zacn(zacm, Result)>
	//   18   38:invokeinterface #224 <Method java.util.concurrent.Future ExecutorService.submit(Runnable)>
	//   19   43:pop             
			break MISSING_BLOCK_LABEL_79;
	//   20   44:goto            79
		}
		if(zabw())
	//*  21   47:aload_0         
	//*  22   48:invokespecial   #173 <Method boolean zabw()>
	//*  23   51:ifeq            79
			zakp.onSuccess(result);
	//   24   54:aload_0         
	//   25   55:getfield        #41  <Field ResultCallbacks zakp>
	//   26   58:aload_1         
	//   27   59:invokevirtual   #227 <Method void ResultCallbacks.onSuccess(Result)>
		break MISSING_BLOCK_LABEL_79;
	//   28   62:goto            79
		zad(result.getStatus());
	//   29   65:aload_0         
	//   30   66:aload_1         
	//   31   67:invokeinterface #203 <Method Status Result.getStatus()>
	//   32   72:invokespecial   #100 <Method void zad(Status)>
		zab(result);
	//   33   75:aload_1         
	//   34   76:invokestatic    #95  <Method void zab(Result)>
		obj;
	//   35   79:aload_2         
		JVM INSTR monitorexit ;
	//   36   80:monitorexit     
		return;
	//   37   81:return          
		result;
	//   38   82:astore_1        
		obj;
	//   39   83:aload_2         
		JVM INSTR monitorexit ;
	//   40   84:monitorexit     
		throw result;
	//   41   85:aload_1         
	//   42   86:athrow          
	}

	public final TransformedResult then(ResultTransform resulttransform)
	{
		Object obj = zadn;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Object zadn>
	//    2    4:astore          4
		obj;
	//    3    6:aload           4
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		ResultTransform resulttransform1 = zakn;
	//    5    9:aload_0         
	//    6   10:getfield        #37  <Field ResultTransform zakn>
	//    7   13:astore          5
		boolean flag;
		boolean flag1 = true;
	//    8   15:iconst_1        
	//    9   16:istore_3        
		if(resulttransform1 == null)
	//*  10   17:aload           5
	//*  11   19:ifnonnull       88
			flag = true;
	//   12   22:iconst_1        
	//   13   23:istore_2        
		else
	//*  14   24:goto            27
	//*  15   27:iload_2         
	//*  16   28:ldc1            #232 <String "Cannot call then() twice.">
	//*  17   30:invokestatic    #190 <Method void Preconditions.checkState(boolean, Object)>
	//*  18   33:aload_0         
	//*  19   34:getfield        #41  <Field ResultCallbacks zakp>
	//*  20   37:ifnonnull       93
	//*  21   40:iload_3         
	//*  22   41:istore_2        
	//*  23   42:goto            45
	//*  24   45:iload_2         
	//*  25   46:ldc1            #192 <String "Cannot call then() and andFinally() on the same TransformedResult.">
	//*  26   48:invokestatic    #190 <Method void Preconditions.checkState(boolean, Object)>
	//*  27   51:aload_0         
	//*  28   52:aload_1         
	//*  29   53:putfield        #37  <Field ResultTransform zakn>
	//*  30   56:new             #2   <Class zacm>
	//*  31   59:dup             
	//*  32   60:aload_0         
	//*  33   61:getfield        #62  <Field WeakReference zadp>
	//*  34   64:invokespecial   #234 <Method void zacm(WeakReference)>
	//*  35   67:astore_1        
	//*  36   68:aload_0         
	//*  37   69:aload_1         
	//*  38   70:putfield        #39  <Field zacm zako>
	//*  39   73:aload_0         
	//*  40   74:invokespecial   #194 <Method void zabu()>
	//*  41   77:aload           4
	//*  42   79:monitorexit     
	//*  43   80:aload_1         
	//*  44   81:areturn         
	//*  45   82:astore_1        
	//*  46   83:aload           4
	//*  47   85:monitorexit     
	//*  48   86:aload_1         
	//*  49   87:athrow          
			flag = false;
	//   50   88:iconst_0        
	//   51   89:istore_2        
		Preconditions.checkState(flag, "Cannot call then() twice.");
		if(zakp == null)
			flag = flag1;
		else
	//*  52   90:goto            27
			flag = false;
	//   53   93:iconst_0        
	//   54   94:istore_2        
		Preconditions.checkState(flag, "Cannot call then() and andFinally() on the same TransformedResult.");
		zakn = resulttransform;
		resulttransform = ((ResultTransform) (new zacm(zadp)));
		zako = ((zacm) (resulttransform));
		zabu();
		obj;
		JVM INSTR monitorexit ;
		return ((TransformedResult) (resulttransform));
		resulttransform;
		obj;
		JVM INSTR monitorexit ;
		throw resulttransform;
	//*  55   95:goto            45
	}

	public final void zaa(PendingResult pendingresult)
	{
		synchronized(zadn)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field Object zadn>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			zakq = pendingresult;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #43  <Field PendingResult zakq>
			zabu();
	//    8   12:aload_0         
	//    9   13:invokespecial   #194 <Method void zabu()>
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

	final void zabv()
	{
		zakp = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #41  <Field ResultCallbacks zakp>
	//    3    5:return          
	}

	private final Object zadn = new Object();
	private final WeakReference zadp;
	private ResultTransform zakn;
	private zacm zako;
	private volatile ResultCallbacks zakp;
	private PendingResult zakq;
	private Status zakr;
	private final zaco zaks;
	private boolean zakt;
}
