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
//			zzcj, zzbw, zzci

public final class zzch extends TransformedResult
	implements ResultCallback
{

	public zzch(WeakReference weakreference)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void TransformedResult()>
		zzmd = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #37  <Field ResultTransform zzmd>
		zzme = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #39  <Field zzch zzme>
		zzmf = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #41  <Field ResultCallbacks zzmf>
		zzmg = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #43  <Field PendingResult zzmg>
	//   14   24:aload_0         
	//   15   25:new             #45  <Class Object>
	//   16   28:dup             
	//   17   29:invokespecial   #46  <Method void Object()>
	//   18   32:putfield        #48  <Field Object zzfa>
		zzmh = null;
	//   19   35:aload_0         
	//   20   36:aconst_null     
	//   21   37:putfield        #50  <Field Status zzmh>
		zzmj = false;
	//   22   40:aload_0         
	//   23   41:iconst_0        
	//   24   42:putfield        #52  <Field boolean zzmj>
		Preconditions.checkNotNull(((Object) (weakreference)), "GoogleApiClient reference must not be null");
	//   25   45:aload_1         
	//   26   46:ldc1            #54  <String "GoogleApiClient reference must not be null">
	//   27   48:invokestatic    #60  <Method Object Preconditions.checkNotNull(Object, Object)>
	//   28   51:pop             
		zzfc = weakreference;
	//   29   52:aload_0         
	//   30   53:aload_1         
	//   31   54:putfield        #62  <Field WeakReference zzfc>
		weakreference = ((WeakReference) ((GoogleApiClient)zzfc.get()));
	//   32   57:aload_0         
	//   33   58:getfield        #62  <Field WeakReference zzfc>
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
		zzmi = new zzcj(this, ((Looper) (weakreference)));
	//   45   84:aload_0         
	//   46   85:new             #81  <Class zzcj>
	//   47   88:dup             
	//   48   89:aload_0         
	//   49   90:aload_1         
	//   50   91:invokespecial   #84  <Method void zzcj(zzch, Looper)>
	//   51   94:putfield        #86  <Field zzcj zzmi>
	//   52   97:return          
	}

	static void zza(zzch zzch1, Result result)
	{
		zzb(result);
	//    0    0:aload_1         
	//    1    1:invokestatic    #95  <Method void zzb(Result)>
	//    2    4:return          
	}

	static void zza(zzch zzch1, Status status)
	{
		zzch1.zzd(status);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #100 <Method void zzd(Status)>
	//    3    5:return          
	}

	private static void zzb(Result result)
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

	static ResultTransform zzc(zzch zzch1)
	{
		return zzch1.zzmd;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field ResultTransform zzmd>
	//    2    4:areturn         
	}

	private final void zzcb()
	{
		if(zzmd == null && zzmf == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field ResultTransform zzmd>
	//*   2    4:ifnonnull       15
	//*   3    7:aload_0         
	//*   4    8:getfield        #41  <Field ResultCallbacks zzmf>
	//*   5   11:ifnonnull       15
			return;
	//    6   14:return          
		Object obj = ((Object) ((GoogleApiClient)zzfc.get()));
	//    7   15:aload_0         
	//    8   16:getfield        #62  <Field WeakReference zzfc>
	//    9   19:invokevirtual   #68  <Method Object WeakReference.get()>
	//   10   22:checkcast       #70  <Class GoogleApiClient>
	//   11   25:astore_1        
		if(!zzmj && zzmd != null && obj != null)
	//*  12   26:aload_0         
	//*  13   27:getfield        #52  <Field boolean zzmj>
	//*  14   30:ifne            54
	//*  15   33:aload_0         
	//*  16   34:getfield        #37  <Field ResultTransform zzmd>
	//*  17   37:ifnull          54
	//*  18   40:aload_1         
	//*  19   41:ifnull          54
		{
			((GoogleApiClient) (obj)).zza(this);
	//   20   44:aload_1         
	//   21   45:aload_0         
	//   22   46:invokevirtual   #149 <Method void GoogleApiClient.zza(zzch)>
			zzmj = true;
	//   23   49:aload_0         
	//   24   50:iconst_1        
	//   25   51:putfield        #52  <Field boolean zzmj>
		}
		obj = ((Object) (zzmh));
	//   26   54:aload_0         
	//   27   55:getfield        #50  <Field Status zzmh>
	//   28   58:astore_1        
		if(obj != null)
	//*  29   59:aload_1         
	//*  30   60:ifnull          69
		{
			zze(((Status) (obj)));
	//   31   63:aload_0         
	//   32   64:aload_1         
	//   33   65:invokespecial   #152 <Method void zze(Status)>
			return;
	//   34   68:return          
		}
		obj = ((Object) (zzmg));
	//   35   69:aload_0         
	//   36   70:getfield        #43  <Field PendingResult zzmg>
	//   37   73:astore_1        
		if(obj != null)
	//*  38   74:aload_1         
	//*  39   75:ifnull          83
			((PendingResult) (obj)).setResultCallback(((ResultCallback) (this)));
	//   40   78:aload_1         
	//   41   79:aload_0         
	//   42   80:invokevirtual   #158 <Method void PendingResult.setResultCallback(ResultCallback)>
	//   43   83:return          
	}

	private final boolean zzcd()
	{
		GoogleApiClient googleapiclient = (GoogleApiClient)zzfc.get();
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field WeakReference zzfc>
	//    2    4:invokevirtual   #68  <Method Object WeakReference.get()>
	//    3    7:checkcast       #70  <Class GoogleApiClient>
	//    4   10:astore_1        
		return zzmf != null && googleapiclient != null;
	//    5   11:aload_0         
	//    6   12:getfield        #41  <Field ResultCallbacks zzmf>
	//    7   15:ifnull          24
	//    8   18:aload_1         
	//    9   19:ifnull          24
	//   10   22:iconst_1        
	//   11   23:ireturn         
	//   12   24:iconst_0        
	//   13   25:ireturn         
	}

	static zzcj zzd(zzch zzch1)
	{
		return zzch1.zzmi;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field zzcj zzmi>
	//    2    4:areturn         
	}

	private final void zzd(Status status)
	{
		synchronized(zzfa)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field Object zzfa>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			zzmh = status;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #50  <Field Status zzmh>
			zze(zzmh);
	//    8   12:aload_0         
	//    9   13:aload_0         
	//   10   14:getfield        #50  <Field Status zzmh>
	//   11   17:invokespecial   #152 <Method void zze(Status)>
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

	static WeakReference zze(zzch zzch1)
	{
		return zzch1.zzfc;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field WeakReference zzfc>
	//    2    4:areturn         
	}

	private final void zze(Status status)
	{
		Object obj = zzfa;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Object zzfa>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(zzmd != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #37  <Field ResultTransform zzmd>
	//*   7   11:ifnull          41
		{
			status = zzmd.onFailure(status);
	//    8   14:aload_0         
	//    9   15:getfield        #37  <Field ResultTransform zzmd>
	//   10   18:aload_1         
	//   11   19:invokevirtual   #169 <Method Status ResultTransform.onFailure(Status)>
	//   12   22:astore_1        
			Preconditions.checkNotNull(((Object) (status)), "onFailure must not return null");
	//   13   23:aload_1         
	//   14   24:ldc1            #171 <String "onFailure must not return null">
	//   15   26:invokestatic    #60  <Method Object Preconditions.checkNotNull(Object, Object)>
	//   16   29:pop             
			zzme.zzd(status);
	//   17   30:aload_0         
	//   18   31:getfield        #39  <Field zzch zzme>
	//   19   34:aload_1         
	//   20   35:invokespecial   #100 <Method void zzd(Status)>
			break MISSING_BLOCK_LABEL_56;
	//   21   38:goto            56
		}
		if(zzcd())
	//*  22   41:aload_0         
	//*  23   42:invokespecial   #173 <Method boolean zzcd()>
	//*  24   45:ifeq            56
			zzmf.onFailure(status);
	//   25   48:aload_0         
	//   26   49:getfield        #41  <Field ResultCallbacks zzmf>
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

	static Object zzf(zzch zzch1)
	{
		return zzch1.zzfa;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Object zzfa>
	//    2    4:areturn         
	}

	static zzch zzg(zzch zzch1)
	{
		return zzch1.zzme;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field zzch zzme>
	//    2    4:areturn         
	}

	public final void andFinally(ResultCallbacks resultcallbacks)
	{
		Object obj = zzfa;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Object zzfa>
	//    2    4:astore          4
		obj;
	//    3    6:aload           4
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		ResultCallbacks resultcallbacks1 = zzmf;
	//    5    9:aload_0         
	//    6   10:getfield        #41  <Field ResultCallbacks zzmf>
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
	//*  19   34:getfield        #37  <Field ResultTransform zzmd>
	//*  20   37:ifnonnull       75
	//*  21   40:iload_3         
	//*  22   41:istore_2        
	//*  23   42:goto            45
	//*  24   45:iload_2         
	//*  25   46:ldc1            #192 <String "Cannot call then() and andFinally() on the same TransformedResult.">
	//*  26   48:invokestatic    #190 <Method void Preconditions.checkState(boolean, Object)>
	//*  27   51:aload_0         
	//*  28   52:aload_1         
	//*  29   53:putfield        #41  <Field ResultCallbacks zzmf>
	//*  30   56:aload_0         
	//*  31   57:invokespecial   #194 <Method void zzcb()>
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
		if(zzmd == null)
			flag = flag1;
		else
	//*  42   72:goto            27
			flag = false;
	//   43   75:iconst_0        
	//   44   76:istore_2        
		Preconditions.checkState(flag, "Cannot call then() and andFinally() on the same TransformedResult.");
		zzmf = resultcallbacks;
		zzcb();
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
		Object obj = zzfa;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Object zzfa>
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
		if(zzmd != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #37  <Field ResultTransform zzmd>
	//*  11   23:ifnull          47
		{
			zzbw.zzbe().submit(((Runnable) (new zzci(this, result))));
	//   12   26:invokestatic    #214 <Method ExecutorService zzbw.zzbe()>
	//   13   29:new             #216 <Class zzci>
	//   14   32:dup             
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:invokespecial   #218 <Method void zzci(zzch, Result)>
	//   18   38:invokeinterface #224 <Method java.util.concurrent.Future ExecutorService.submit(Runnable)>
	//   19   43:pop             
			break MISSING_BLOCK_LABEL_79;
	//   20   44:goto            79
		}
		if(zzcd())
	//*  21   47:aload_0         
	//*  22   48:invokespecial   #173 <Method boolean zzcd()>
	//*  23   51:ifeq            79
			zzmf.onSuccess(result);
	//   24   54:aload_0         
	//   25   55:getfield        #41  <Field ResultCallbacks zzmf>
	//   26   58:aload_1         
	//   27   59:invokevirtual   #227 <Method void ResultCallbacks.onSuccess(Result)>
		break MISSING_BLOCK_LABEL_79;
	//   28   62:goto            79
		zzd(result.getStatus());
	//   29   65:aload_0         
	//   30   66:aload_1         
	//   31   67:invokeinterface #203 <Method Status Result.getStatus()>
	//   32   72:invokespecial   #100 <Method void zzd(Status)>
		zzb(result);
	//   33   75:aload_1         
	//   34   76:invokestatic    #95  <Method void zzb(Result)>
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
		Object obj = zzfa;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Object zzfa>
	//    2    4:astore          4
		obj;
	//    3    6:aload           4
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		ResultTransform resulttransform1 = zzmd;
	//    5    9:aload_0         
	//    6   10:getfield        #37  <Field ResultTransform zzmd>
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
	//*  19   34:getfield        #41  <Field ResultCallbacks zzmf>
	//*  20   37:ifnonnull       93
	//*  21   40:iload_3         
	//*  22   41:istore_2        
	//*  23   42:goto            45
	//*  24   45:iload_2         
	//*  25   46:ldc1            #192 <String "Cannot call then() and andFinally() on the same TransformedResult.">
	//*  26   48:invokestatic    #190 <Method void Preconditions.checkState(boolean, Object)>
	//*  27   51:aload_0         
	//*  28   52:aload_1         
	//*  29   53:putfield        #37  <Field ResultTransform zzmd>
	//*  30   56:new             #2   <Class zzch>
	//*  31   59:dup             
	//*  32   60:aload_0         
	//*  33   61:getfield        #62  <Field WeakReference zzfc>
	//*  34   64:invokespecial   #234 <Method void zzch(WeakReference)>
	//*  35   67:astore_1        
	//*  36   68:aload_0         
	//*  37   69:aload_1         
	//*  38   70:putfield        #39  <Field zzch zzme>
	//*  39   73:aload_0         
	//*  40   74:invokespecial   #194 <Method void zzcb()>
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
		if(zzmf == null)
			flag = flag1;
		else
	//*  52   90:goto            27
			flag = false;
	//   53   93:iconst_0        
	//   54   94:istore_2        
		Preconditions.checkState(flag, "Cannot call then() and andFinally() on the same TransformedResult.");
		zzmd = resulttransform;
		resulttransform = ((ResultTransform) (new zzch(zzfc)));
		zzme = ((zzch) (resulttransform));
		zzcb();
		obj;
		JVM INSTR monitorexit ;
		return ((TransformedResult) (resulttransform));
		resulttransform;
		obj;
		JVM INSTR monitorexit ;
		throw resulttransform;
	//*  55   95:goto            45
	}

	public final void zza(PendingResult pendingresult)
	{
		synchronized(zzfa)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field Object zzfa>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			zzmg = pendingresult;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #43  <Field PendingResult zzmg>
			zzcb();
	//    8   12:aload_0         
	//    9   13:invokespecial   #194 <Method void zzcb()>
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

	final void zzcc()
	{
		zzmf = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #41  <Field ResultCallbacks zzmf>
	//    3    5:return          
	}

	private final Object zzfa = new Object();
	private final WeakReference zzfc;
	private ResultTransform zzmd;
	private zzch zzme;
	private volatile ResultCallbacks zzmf;
	private PendingResult zzmg;
	private Status zzmh;
	private final zzcj zzmi;
	private boolean zzmj;
}
