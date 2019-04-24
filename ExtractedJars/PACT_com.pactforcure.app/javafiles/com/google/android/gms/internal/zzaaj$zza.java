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
//			zzaaj, zzaan, zzaal

private static class zzaaj$zza
	implements com.google.android.gms.common.internal.zzf.zzf
{

	static int zza(zzaaj$zza zzaaj$zza1)
	{
		return zzaaj$zza1.zzazb;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int zzazb>
	//    2    4:ireturn         
	}

	public void zzg(ConnectionResult connectionresult)
	{
		zzaaj zzaaj1;
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		zzaaj1 = (zzaaj)zzaAb.get();
	//    2    2:aload_0         
	//    3    3:getfield        #29  <Field WeakReference zzaAb>
	//    4    6:invokevirtual   #44  <Method Object WeakReference.get()>
	//    5    9:checkcast       #8   <Class zzaaj>
	//    6   12:astore_3        
		if(zzaaj1 == null)
	//*   7   13:aload_3         
	//*   8   14:ifnonnull       18
			return;
	//    9   17:return          
		if(Looper.myLooper() == zzaaj.zzd(zzaaj1).zzazd.getLooper())
	//*  10   18:invokestatic    #50  <Method Looper Looper.myLooper()>
	//*  11   21:aload_3         
	//*  12   22:invokestatic    #54  <Method zzaan zzaaj.zzd(zzaaj)>
	//*  13   25:getfield        #60  <Field zzaal zzaan.zzazd>
	//*  14   28:invokevirtual   #65  <Method Looper zzaal.getLooper()>
	//*  15   31:if_acmpne       36
			flag = true;
	//   16   34:iconst_1        
	//   17   35:istore_2        
		zzac.zza(flag, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
	//   18   36:iload_2         
	//   19   37:ldc1            #67  <String "onReportServiceBinding must be called on the GoogleApiClient handler thread">
	//   20   39:invokestatic    #72  <Method void zzac.zza(boolean, Object)>
		zzaaj.zzc(zzaaj1).lock();
	//   21   42:aload_3         
	//   22   43:invokestatic    #76  <Method Lock zzaaj.zzc(zzaaj)>
	//   23   46:invokeinterface #81  <Method void Lock.lock()>
		boolean flag1 = zzaaj.zza(zzaaj1, 0);
	//   24   51:aload_3         
	//   25   52:iconst_0        
	//   26   53:invokestatic    #84  <Method boolean zzaaj.zza(zzaaj, int)>
	//   27   56:istore_2        
		if(!flag1)
	//*  28   57:iload_2         
	//*  29   58:ifne            71
		{
			zzaaj.zzc(zzaaj1).unlock();
	//   30   61:aload_3         
	//   31   62:invokestatic    #76  <Method Lock zzaaj.zzc(zzaaj)>
	//   32   65:invokeinterface #87  <Method void Lock.unlock()>
			return;
	//   33   70:return          
		}
		if(!connectionresult.isSuccess())
	//*  34   71:aload_1         
	//*  35   72:invokevirtual   #93  <Method boolean ConnectionResult.isSuccess()>
	//*  36   75:ifne            91
			zzaaj.zza(zzaaj1, connectionresult, zzawb, zzazb);
	//   37   78:aload_3         
	//   38   79:aload_1         
	//   39   80:aload_0         
	//   40   81:getfield        #31  <Field Api zzawb>
	//   41   84:aload_0         
	//   42   85:getfield        #33  <Field int zzazb>
	//   43   88:invokestatic    #96  <Method void zzaaj.zza(zzaaj, ConnectionResult, Api, int)>
		if(zzaaj.zzk(zzaaj1))
	//*  44   91:aload_3         
	//*  45   92:invokestatic    #100 <Method boolean zzaaj.zzk(zzaaj)>
	//*  46   95:ifeq            102
			zzaaj.zzj(zzaaj1);
	//   47   98:aload_3         
	//   48   99:invokestatic    #104 <Method void zzaaj.zzj(zzaaj)>
		zzaaj.zzc(zzaaj1).unlock();
	//   49  102:aload_3         
	//   50  103:invokestatic    #76  <Method Lock zzaaj.zzc(zzaaj)>
	//   51  106:invokeinterface #87  <Method void Lock.unlock()>
		return;
	//   52  111:return          
		connectionresult;
	//   53  112:astore_1        
		zzaaj.zzc(zzaaj1).unlock();
	//   54  113:aload_3         
	//   55  114:invokestatic    #76  <Method Lock zzaaj.zzc(zzaaj)>
	//   56  117:invokeinterface #87  <Method void Lock.unlock()>
		throw connectionresult;
	//   57  122:aload_1         
	//   58  123:athrow          
	}

	private final WeakReference zzaAb;
	private final Api zzawb;
	private final int zzazb;

	public zzaaj$zza(zzaaj zzaaj1, Api api, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		zzaAb = new WeakReference(((Object) (zzaaj1)));
	//    2    4:aload_0         
	//    3    5:new             #24  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #27  <Method void WeakReference(Object)>
	//    7   13:putfield        #29  <Field WeakReference zzaAb>
		zzawb = api;
	//    8   16:aload_0         
	//    9   17:aload_2         
	//   10   18:putfield        #31  <Field Api zzawb>
		zzazb = i;
	//   11   21:aload_0         
	//   12   22:iload_3         
	//   13   23:putfield        #33  <Field int zzazb>
	//   14   26:return          
	}
}
