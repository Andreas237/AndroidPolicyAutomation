// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zzbq, zzr, zzbd, zzs

final class zzu
	implements zzbq
{

	private zzu(zzr zzr1)
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

	zzu(zzr zzr1, zzs zzs)
	{
		this(zzr1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void zzu(zzr)>
	//    3    5:return          
	}

	public final void zzb(int i, boolean flag)
	{
		zzr.zza(zzgc).lock();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zzr zzgc>
	//    2    4:invokestatic    #27  <Method Lock zzr.zza(zzr)>
	//    3    7:invokeinterface #32  <Method void Lock.lock()>
		if(!zzr.zzc(zzgc)) goto _L2; else goto _L1
	//    4   12:aload_0         
	//    5   13:getfield        #12  <Field zzr zzgc>
	//    6   16:invokestatic    #36  <Method boolean zzr.zzc(zzr)>
	//    7   19:ifeq            53
_L1:
		zzr.zza(zzgc, false);
	//    8   22:aload_0         
	//    9   23:getfield        #12  <Field zzr zzgc>
	//   10   26:iconst_0        
	//   11   27:invokestatic    #39  <Method boolean zzr.zza(zzr, boolean)>
	//   12   30:pop             
		zzr.zza(zzgc, i, flag);
	//   13   31:aload_0         
	//   14   32:getfield        #12  <Field zzr zzgc>
	//   15   35:iload_1         
	//   16   36:iload_2         
	//   17   37:invokestatic    #42  <Method void zzr.zza(zzr, int, boolean)>
_L4:
		zzr.zza(zzgc).unlock();
	//   18   40:aload_0         
	//   19   41:getfield        #12  <Field zzr zzgc>
	//   20   44:invokestatic    #27  <Method Lock zzr.zza(zzr)>
	//   21   47:invokeinterface #45  <Method void Lock.unlock()>
		return;
	//   22   52:return          
_L2:
		zzr.zza(zzgc, true);
	//   23   53:aload_0         
	//   24   54:getfield        #12  <Field zzr zzgc>
	//   25   57:iconst_1        
	//   26   58:invokestatic    #39  <Method boolean zzr.zza(zzr, boolean)>
	//   27   61:pop             
		zzr.zzf(zzgc).onConnectionSuspended(i);
	//   28   62:aload_0         
	//   29   63:getfield        #12  <Field zzr zzgc>
	//   30   66:invokestatic    #49  <Method zzbd zzr.zzf(zzr)>
	//   31   69:iload_1         
	//   32   70:invokevirtual   #55  <Method void zzbd.onConnectionSuspended(int)>
		if(true) goto _L4; else goto _L3
	//   33   73:goto            40
_L3:
		Exception exception;
		exception;
	//   34   76:astore_3        
		zzr.zza(zzgc).unlock();
	//   35   77:aload_0         
	//   36   78:getfield        #12  <Field zzr zzgc>
	//   37   81:invokestatic    #27  <Method Lock zzr.zza(zzr)>
	//   38   84:invokeinterface #45  <Method void Lock.unlock()>
		throw exception;
	//   39   89:aload_3         
	//   40   90:athrow          
	}

	public final void zzb(Bundle bundle)
	{
		zzr.zza(zzgc).lock();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zzr zzgc>
	//    2    4:invokestatic    #27  <Method Lock zzr.zza(zzr)>
	//    3    7:invokeinterface #32  <Method void Lock.lock()>
		zzr.zzb(zzgc, ConnectionResult.RESULT_SUCCESS);
	//    4   12:aload_0         
	//    5   13:getfield        #12  <Field zzr zzgc>
	//    6   16:getstatic       #63  <Field ConnectionResult ConnectionResult.RESULT_SUCCESS>
	//    7   19:invokestatic    #66  <Method ConnectionResult zzr.zzb(zzr, ConnectionResult)>
	//    8   22:pop             
		zzr.zzb(zzgc);
	//    9   23:aload_0         
	//   10   24:getfield        #12  <Field zzr zzgc>
	//   11   27:invokestatic    #68  <Method void zzr.zzb(zzr)>
		zzr.zza(zzgc).unlock();
	//   12   30:aload_0         
	//   13   31:getfield        #12  <Field zzr zzgc>
	//   14   34:invokestatic    #27  <Method Lock zzr.zza(zzr)>
	//   15   37:invokeinterface #45  <Method void Lock.unlock()>
		return;
	//   16   42:return          
		bundle;
	//   17   43:astore_1        
		zzr.zza(zzgc).unlock();
	//   18   44:aload_0         
	//   19   45:getfield        #12  <Field zzr zzgc>
	//   20   48:invokestatic    #27  <Method Lock zzr.zza(zzr)>
	//   21   51:invokeinterface #45  <Method void Lock.unlock()>
		throw bundle;
	//   22   56:aload_1         
	//   23   57:athrow          
	}

	public final void zzc(ConnectionResult connectionresult)
	{
		zzr.zza(zzgc).lock();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zzr zzgc>
	//    2    4:invokestatic    #27  <Method Lock zzr.zza(zzr)>
	//    3    7:invokeinterface #32  <Method void Lock.lock()>
		zzr.zzb(zzgc, connectionresult);
	//    4   12:aload_0         
	//    5   13:getfield        #12  <Field zzr zzgc>
	//    6   16:aload_1         
	//    7   17:invokestatic    #66  <Method ConnectionResult zzr.zzb(zzr, ConnectionResult)>
	//    8   20:pop             
		zzr.zzb(zzgc);
	//    9   21:aload_0         
	//   10   22:getfield        #12  <Field zzr zzgc>
	//   11   25:invokestatic    #68  <Method void zzr.zzb(zzr)>
		zzr.zza(zzgc).unlock();
	//   12   28:aload_0         
	//   13   29:getfield        #12  <Field zzr zzgc>
	//   14   32:invokestatic    #27  <Method Lock zzr.zza(zzr)>
	//   15   35:invokeinterface #45  <Method void Lock.unlock()>
		return;
	//   16   40:return          
		connectionresult;
	//   17   41:astore_1        
		zzr.zza(zzgc).unlock();
	//   18   42:aload_0         
	//   19   43:getfield        #12  <Field zzr zzgc>
	//   20   46:invokestatic    #27  <Method Lock zzr.zza(zzr)>
	//   21   49:invokeinterface #45  <Method void Lock.unlock()>
		throw connectionresult;
	//   22   54:aload_1         
	//   23   55:athrow          
	}

	private final zzr zzgc;
}
