// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.zzac;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.internal:
//			zzaar, zzaav, zzaat

static class zzaar$zza
	implements com.google.android.gms.common.internal.zzf.zzf
{

	static boolean zza(zzaar$zza zzaar$zza1)
	{
		return zzaar$zza1.zzaAu;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field boolean zzaAu>
	//    2    4:ireturn         
	}

	public void zzg(ConnectionResult connectionresult)
	{
		zzaar zzaar1;
		zzaar1 = (zzaar)zzaBB.get();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field WeakReference zzaBB>
	//    2    4:invokevirtual   #44  <Method Object WeakReference.get()>
	//    3    7:checkcast       #8   <Class zzaar>
	//    4   10:astore_3        
		if(zzaar1 == null)
	//*   5   11:aload_3         
	//*   6   12:ifnonnull       16
			return;
	//    7   15:return          
		boolean flag;
		if(Looper.myLooper() == zzaar.zzd(zzaar1).zzaAw.getLooper())
	//*   8   16:invokestatic    #50  <Method Looper Looper.myLooper()>
	//*   9   19:aload_3         
	//*  10   20:invokestatic    #54  <Method zzaav zzaar.zzd(zzaar)>
	//*  11   23:getfield        #60  <Field zzaat zzaav.zzaAw>
	//*  12   26:invokevirtual   #65  <Method Looper zzaat.getLooper()>
	//*  13   29:if_acmpne       37
			flag = true;
	//   14   32:iconst_1        
	//   15   33:istore_2        
		else
	//*  16   34:goto            39
			flag = false;
	//   17   37:iconst_0        
	//   18   38:istore_2        
		zzac.zza(flag, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
	//   19   39:iload_2         
	//   20   40:ldc1            #67  <String "onReportServiceBinding must be called on the GoogleApiClient handler thread">
	//   21   42:invokestatic    #72  <Method void zzac.zza(boolean, Object)>
		zzaar.zzc(zzaar1).lock();
	//   22   45:aload_3         
	//   23   46:invokestatic    #76  <Method Lock zzaar.zzc(zzaar)>
	//   24   49:invokeinterface #81  <Method void Lock.lock()>
		boolean flag1 = zzaar.zza(zzaar1, 0);
	//   25   54:aload_3         
	//   26   55:iconst_0        
	//   27   56:invokestatic    #84  <Method boolean zzaar.zza(zzaar, int)>
	//   28   59:istore_2        
		if(!flag1)
	//*  29   60:iload_2         
	//*  30   61:ifne            74
		{
			zzaar.zzc(zzaar1).unlock();
	//   31   64:aload_3         
	//   32   65:invokestatic    #76  <Method Lock zzaar.zzc(zzaar)>
	//   33   68:invokeinterface #87  <Method void Lock.unlock()>
			return;
	//   34   73:return          
		}
		if(!connectionresult.isSuccess())
	//*  35   74:aload_1         
	//*  36   75:invokevirtual   #93  <Method boolean ConnectionResult.isSuccess()>
	//*  37   78:ifne            94
			zzaar.zza(zzaar1, connectionresult, zzaxf, zzaAu);
	//   38   81:aload_3         
	//   39   82:aload_1         
	//   40   83:aload_0         
	//   41   84:getfield        #31  <Field Api zzaxf>
	//   42   87:aload_0         
	//   43   88:getfield        #33  <Field boolean zzaAu>
	//   44   91:invokestatic    #96  <Method void zzaar.zza(zzaar, ConnectionResult, Api, boolean)>
		if(zzaar.zzk(zzaar1))
	//*  45   94:aload_3         
	//*  46   95:invokestatic    #100 <Method boolean zzaar.zzk(zzaar)>
	//*  47   98:ifeq            105
			zzaar.zzj(zzaar1);
	//   48  101:aload_3         
	//   49  102:invokestatic    #104 <Method void zzaar.zzj(zzaar)>
		zzaar.zzc(zzaar1).unlock();
	//   50  105:aload_3         
	//   51  106:invokestatic    #76  <Method Lock zzaar.zzc(zzaar)>
	//   52  109:invokeinterface #87  <Method void Lock.unlock()>
		return;
	//   53  114:return          
		connectionresult;
	//   54  115:astore_1        
		zzaar.zzc(zzaar1).unlock();
	//   55  116:aload_3         
	//   56  117:invokestatic    #76  <Method Lock zzaar.zzc(zzaar)>
	//   57  120:invokeinterface #87  <Method void Lock.unlock()>
		throw connectionresult;
	//   58  125:aload_1         
	//   59  126:athrow          
	}

	private final boolean zzaAu;
	private final WeakReference zzaBB;
	private final Api zzaxf;

	public zzaar$zza(zzaar zzaar1, Api api, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		zzaBB = new WeakReference(((Object) (zzaar1)));
	//    2    4:aload_0         
	//    3    5:new             #24  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #27  <Method void WeakReference(Object)>
	//    7   13:putfield        #29  <Field WeakReference zzaBB>
		zzaxf = api;
	//    8   16:aload_0         
	//    9   17:aload_2         
	//   10   18:putfield        #31  <Field Api zzaxf>
		zzaAu = flag;
	//   11   21:aload_0         
	//   12   22:iload_3         
	//   13   23:putfield        #33  <Field boolean zzaAu>
	//   14   26:return          
	}
}
