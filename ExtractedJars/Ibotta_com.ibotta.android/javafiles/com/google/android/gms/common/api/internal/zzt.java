// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zzbq, zzr, zzbd, zzs

final class zzt
	implements zzbq
{

	private zzt(zzr zzr1)
	{
		zzgc = zzr1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzr zzgc>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	zzt(zzr zzr1, zzs zzs)
	{
		this(zzr1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void zzt(zzr)>
	//    3    5:return          
	}

	public final void zzb(int i, boolean flag)
	{
		zzr.zza(zzgc).lock();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zzr zzgc>
	//    2    4:invokestatic    #27  <Method Lock zzr.zza(zzr)>
	//    3    7:invokeinterface #32  <Method void Lock.lock()>
		if(!zzr.zzc(zzgc) && zzr.zzd(zzgc) != null && zzr.zzd(zzgc).isSuccess()) goto _L2; else goto _L1
	//    4   12:aload_0         
	//    5   13:getfield        #12  <Field zzr zzgc>
	//    6   16:invokestatic    #36  <Method boolean zzr.zzc(zzr)>
	//    7   19:ifne            81
	//    8   22:aload_0         
	//    9   23:getfield        #12  <Field zzr zzgc>
	//   10   26:invokestatic    #40  <Method ConnectionResult zzr.zzd(zzr)>
	//   11   29:ifnull          81
	//   12   32:aload_0         
	//   13   33:getfield        #12  <Field zzr zzgc>
	//   14   36:invokestatic    #40  <Method ConnectionResult zzr.zzd(zzr)>
	//   15   39:invokevirtual   #46  <Method boolean ConnectionResult.isSuccess()>
	//   16   42:ifne            48
	//*  17   45:goto            81
_L2:
		zzr.zza(zzgc, true);
	//   18   48:aload_0         
	//   19   49:getfield        #12  <Field zzr zzgc>
	//   20   52:iconst_1        
	//   21   53:invokestatic    #49  <Method boolean zzr.zza(zzr, boolean)>
	//   22   56:pop             
		zzr.zze(zzgc).onConnectionSuspended(i);
	//   23   57:aload_0         
	//   24   58:getfield        #12  <Field zzr zzgc>
	//   25   61:invokestatic    #53  <Method zzbd zzr.zze(zzr)>
	//   26   64:iload_1         
	//   27   65:invokevirtual   #59  <Method void zzbd.onConnectionSuspended(int)>
_L4:
		zzr.zza(zzgc).unlock();
	//   28   68:aload_0         
	//   29   69:getfield        #12  <Field zzr zzgc>
	//   30   72:invokestatic    #27  <Method Lock zzr.zza(zzr)>
	//   31   75:invokeinterface #62  <Method void Lock.unlock()>
		return;
	//   32   80:return          
_L1:
		zzr.zza(zzgc, false);
	//   33   81:aload_0         
	//   34   82:getfield        #12  <Field zzr zzgc>
	//   35   85:iconst_0        
	//   36   86:invokestatic    #49  <Method boolean zzr.zza(zzr, boolean)>
	//   37   89:pop             
		zzr.zza(zzgc, i, flag);
	//   38   90:aload_0         
	//   39   91:getfield        #12  <Field zzr zzgc>
	//   40   94:iload_1         
	//   41   95:iload_2         
	//   42   96:invokestatic    #65  <Method void zzr.zza(zzr, int, boolean)>
		if(true) goto _L4; else goto _L3
	//   43   99:goto            68
_L3:
		Exception exception;
		exception;
	//   44  102:astore_3        
		zzr.zza(zzgc).unlock();
	//   45  103:aload_0         
	//   46  104:getfield        #12  <Field zzr zzgc>
	//   47  107:invokestatic    #27  <Method Lock zzr.zza(zzr)>
	//   48  110:invokeinterface #62  <Method void Lock.unlock()>
		throw exception;
	//   49  115:aload_3         
	//   50  116:athrow          
	}

	public final void zzb(Bundle bundle)
	{
		zzr.zza(zzgc).lock();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zzr zzgc>
	//    2    4:invokestatic    #27  <Method Lock zzr.zza(zzr)>
	//    3    7:invokeinterface #32  <Method void Lock.lock()>
		zzr.zza(zzgc, bundle);
	//    4   12:aload_0         
	//    5   13:getfield        #12  <Field zzr zzgc>
	//    6   16:aload_1         
	//    7   17:invokestatic    #70  <Method void zzr.zza(zzr, Bundle)>
		zzr.zza(zzgc, ConnectionResult.RESULT_SUCCESS);
	//    8   20:aload_0         
	//    9   21:getfield        #12  <Field zzr zzgc>
	//   10   24:getstatic       #74  <Field ConnectionResult ConnectionResult.RESULT_SUCCESS>
	//   11   27:invokestatic    #77  <Method ConnectionResult zzr.zza(zzr, ConnectionResult)>
	//   12   30:pop             
		zzr.zzb(zzgc);
	//   13   31:aload_0         
	//   14   32:getfield        #12  <Field zzr zzgc>
	//   15   35:invokestatic    #79  <Method void zzr.zzb(zzr)>
		zzr.zza(zzgc).unlock();
	//   16   38:aload_0         
	//   17   39:getfield        #12  <Field zzr zzgc>
	//   18   42:invokestatic    #27  <Method Lock zzr.zza(zzr)>
	//   19   45:invokeinterface #62  <Method void Lock.unlock()>
		return;
	//   20   50:return          
		bundle;
	//   21   51:astore_1        
		zzr.zza(zzgc).unlock();
	//   22   52:aload_0         
	//   23   53:getfield        #12  <Field zzr zzgc>
	//   24   56:invokestatic    #27  <Method Lock zzr.zza(zzr)>
	//   25   59:invokeinterface #62  <Method void Lock.unlock()>
		throw bundle;
	//   26   64:aload_1         
	//   27   65:athrow          
	}

	public final void zzc(ConnectionResult connectionresult)
	{
		zzr.zza(zzgc).lock();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zzr zzgc>
	//    2    4:invokestatic    #27  <Method Lock zzr.zza(zzr)>
	//    3    7:invokeinterface #32  <Method void Lock.lock()>
		zzr.zza(zzgc, connectionresult);
	//    4   12:aload_0         
	//    5   13:getfield        #12  <Field zzr zzgc>
	//    6   16:aload_1         
	//    7   17:invokestatic    #77  <Method ConnectionResult zzr.zza(zzr, ConnectionResult)>
	//    8   20:pop             
		zzr.zzb(zzgc);
	//    9   21:aload_0         
	//   10   22:getfield        #12  <Field zzr zzgc>
	//   11   25:invokestatic    #79  <Method void zzr.zzb(zzr)>
		zzr.zza(zzgc).unlock();
	//   12   28:aload_0         
	//   13   29:getfield        #12  <Field zzr zzgc>
	//   14   32:invokestatic    #27  <Method Lock zzr.zza(zzr)>
	//   15   35:invokeinterface #62  <Method void Lock.unlock()>
		return;
	//   16   40:return          
		connectionresult;
	//   17   41:astore_1        
		zzr.zza(zzgc).unlock();
	//   18   42:aload_0         
	//   19   43:getfield        #12  <Field zzr zzgc>
	//   20   46:invokestatic    #27  <Method Lock zzr.zza(zzr)>
	//   21   49:invokeinterface #62  <Method void Lock.unlock()>
		throw connectionresult;
	//   22   54:aload_1         
	//   23   55:athrow          
	}

	private final zzr zzgc;
}
