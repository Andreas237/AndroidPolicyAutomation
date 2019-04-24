// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.internal:
//			zzaaa, zzaan

private class zzaaa$zza
	implements zzaau$zza
{

	public void zzc(int i, boolean flag)
	{
		zzaaa.zza(zzazp).lock();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zzaaa zzazp>
	//    2    4:invokestatic    #27  <Method Lock zzaaa.zza(zzaaa)>
	//    3    7:invokeinterface #32  <Method void Lock.lock()>
		if(!zzaaa.zzc(zzazp) && zzaaa.zzd(zzazp) != null && zzaaa.zzd(zzazp).isSuccess())
			break MISSING_BLOCK_LABEL_76;
	//    4   12:aload_0         
	//    5   13:getfield        #15  <Field zzaaa zzazp>
	//    6   16:invokestatic    #35  <Method boolean zzaaa.zzc(zzaaa)>
	//    7   19:ifne            45
	//    8   22:aload_0         
	//    9   23:getfield        #15  <Field zzaaa zzazp>
	//   10   26:invokestatic    #39  <Method ConnectionResult zzaaa.zzd(zzaaa)>
	//   11   29:ifnull          45
	//   12   32:aload_0         
	//   13   33:getfield        #15  <Field zzaaa zzazp>
	//   14   36:invokestatic    #39  <Method ConnectionResult zzaaa.zzd(zzaaa)>
	//   15   39:invokevirtual   #45  <Method boolean ConnectionResult.isSuccess()>
	//   16   42:ifne            76
		zzaaa.zza(zzazp, false);
	//   17   45:aload_0         
	//   18   46:getfield        #15  <Field zzaaa zzazp>
	//   19   49:iconst_0        
	//   20   50:invokestatic    #48  <Method boolean zzaaa.zza(zzaaa, boolean)>
	//   21   53:pop             
		zzaaa.zza(zzazp, i, flag);
	//   22   54:aload_0         
	//   23   55:getfield        #15  <Field zzaaa zzazp>
	//   24   58:iload_1         
	//   25   59:iload_2         
	//   26   60:invokestatic    #51  <Method void zzaaa.zza(zzaaa, int, boolean)>
		zzaaa.zza(zzazp).unlock();
	//   27   63:aload_0         
	//   28   64:getfield        #15  <Field zzaaa zzazp>
	//   29   67:invokestatic    #27  <Method Lock zzaaa.zza(zzaaa)>
	//   30   70:invokeinterface #54  <Method void Lock.unlock()>
		return;
	//   31   75:return          
		zzaaa.zza(zzazp, true);
	//   32   76:aload_0         
	//   33   77:getfield        #15  <Field zzaaa zzazp>
	//   34   80:iconst_1        
	//   35   81:invokestatic    #48  <Method boolean zzaaa.zza(zzaaa, boolean)>
	//   36   84:pop             
		zzaaa.zze(zzazp).onConnectionSuspended(i);
	//   37   85:aload_0         
	//   38   86:getfield        #15  <Field zzaaa zzazp>
	//   39   89:invokestatic    #58  <Method zzaan zzaaa.zze(zzaaa)>
	//   40   92:iload_1         
	//   41   93:invokevirtual   #64  <Method void zzaan.onConnectionSuspended(int)>
		zzaaa.zza(zzazp).unlock();
	//   42   96:aload_0         
	//   43   97:getfield        #15  <Field zzaaa zzazp>
	//   44  100:invokestatic    #27  <Method Lock zzaaa.zza(zzaaa)>
	//   45  103:invokeinterface #54  <Method void Lock.unlock()>
		return;
	//   46  108:return          
		Exception exception;
		exception;
	//   47  109:astore_3        
		zzaaa.zza(zzazp).unlock();
	//   48  110:aload_0         
	//   49  111:getfield        #15  <Field zzaaa zzazp>
	//   50  114:invokestatic    #27  <Method Lock zzaaa.zza(zzaaa)>
	//   51  117:invokeinterface #54  <Method void Lock.unlock()>
		throw exception;
	//   52  122:aload_3         
	//   53  123:athrow          
	}

	public void zzc(ConnectionResult connectionresult)
	{
		zzaaa.zza(zzazp).lock();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zzaaa zzazp>
	//    2    4:invokestatic    #27  <Method Lock zzaaa.zza(zzaaa)>
	//    3    7:invokeinterface #32  <Method void Lock.lock()>
		zzaaa.zza(zzazp, connectionresult);
	//    4   12:aload_0         
	//    5   13:getfield        #15  <Field zzaaa zzazp>
	//    6   16:aload_1         
	//    7   17:invokestatic    #69  <Method ConnectionResult zzaaa.zza(zzaaa, ConnectionResult)>
	//    8   20:pop             
		zzaaa.zzb(zzazp);
	//    9   21:aload_0         
	//   10   22:getfield        #15  <Field zzaaa zzazp>
	//   11   25:invokestatic    #72  <Method void zzaaa.zzb(zzaaa)>
		zzaaa.zza(zzazp).unlock();
	//   12   28:aload_0         
	//   13   29:getfield        #15  <Field zzaaa zzazp>
	//   14   32:invokestatic    #27  <Method Lock zzaaa.zza(zzaaa)>
	//   15   35:invokeinterface #54  <Method void Lock.unlock()>
		return;
	//   16   40:return          
		connectionresult;
	//   17   41:astore_1        
		zzaaa.zza(zzazp).unlock();
	//   18   42:aload_0         
	//   19   43:getfield        #15  <Field zzaaa zzazp>
	//   20   46:invokestatic    #27  <Method Lock zzaaa.zza(zzaaa)>
	//   21   49:invokeinterface #54  <Method void Lock.unlock()>
		throw connectionresult;
	//   22   54:aload_1         
	//   23   55:athrow          
	}

	public void zzo(Bundle bundle)
	{
		zzaaa.zza(zzazp).lock();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zzaaa zzazp>
	//    2    4:invokestatic    #27  <Method Lock zzaaa.zza(zzaaa)>
	//    3    7:invokeinterface #32  <Method void Lock.lock()>
		zzaaa.zza(zzazp, bundle);
	//    4   12:aload_0         
	//    5   13:getfield        #15  <Field zzaaa zzazp>
	//    6   16:aload_1         
	//    7   17:invokestatic    #79  <Method void zzaaa.zza(zzaaa, Bundle)>
		zzaaa.zza(zzazp, ConnectionResult.zzawX);
	//    8   20:aload_0         
	//    9   21:getfield        #15  <Field zzaaa zzazp>
	//   10   24:getstatic       #83  <Field ConnectionResult ConnectionResult.zzawX>
	//   11   27:invokestatic    #69  <Method ConnectionResult zzaaa.zza(zzaaa, ConnectionResult)>
	//   12   30:pop             
		zzaaa.zzb(zzazp);
	//   13   31:aload_0         
	//   14   32:getfield        #15  <Field zzaaa zzazp>
	//   15   35:invokestatic    #72  <Method void zzaaa.zzb(zzaaa)>
		zzaaa.zza(zzazp).unlock();
	//   16   38:aload_0         
	//   17   39:getfield        #15  <Field zzaaa zzazp>
	//   18   42:invokestatic    #27  <Method Lock zzaaa.zza(zzaaa)>
	//   19   45:invokeinterface #54  <Method void Lock.unlock()>
		return;
	//   20   50:return          
		bundle;
	//   21   51:astore_1        
		zzaaa.zza(zzazp).unlock();
	//   22   52:aload_0         
	//   23   53:getfield        #15  <Field zzaaa zzazp>
	//   24   56:invokestatic    #27  <Method Lock zzaaa.zza(zzaaa)>
	//   25   59:invokeinterface #54  <Method void Lock.unlock()>
		throw bundle;
	//   26   64:aload_1         
	//   27   65:athrow          
	}

	final zzaaa zzazp;

	private zzaaa$zza(zzaaa zzaaa1)
	{
		zzazp = zzaaa1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field zzaaa zzazp>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}

	zzaaa$zza(zzaaa zzaaa1, zzaaa._cls1 _pcls1)
	{
		this(zzaaa1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void zzaaa$zza(zzaaa)>
	//    3    5:return          
	}
}
