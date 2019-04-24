// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.internal:
//			zzaaa, zzaan

private class zzaaa$zzb
	implements zzaau$zza
{

	public void zzc(int i, boolean flag)
	{
		zzaaa.zza(zzazp).lock();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zzaaa zzazp>
	//    2    4:invokestatic    #28  <Method Lock zzaaa.zza(zzaaa)>
	//    3    7:invokeinterface #33  <Method void Lock.lock()>
		if(!zzaaa.zzc(zzazp))
			break MISSING_BLOCK_LABEL_53;
	//    4   12:aload_0         
	//    5   13:getfield        #15  <Field zzaaa zzazp>
	//    6   16:invokestatic    #36  <Method boolean zzaaa.zzc(zzaaa)>
	//    7   19:ifeq            53
		zzaaa.zza(zzazp, false);
	//    8   22:aload_0         
	//    9   23:getfield        #15  <Field zzaaa zzazp>
	//   10   26:iconst_0        
	//   11   27:invokestatic    #39  <Method boolean zzaaa.zza(zzaaa, boolean)>
	//   12   30:pop             
		zzaaa.zza(zzazp, i, flag);
	//   13   31:aload_0         
	//   14   32:getfield        #15  <Field zzaaa zzazp>
	//   15   35:iload_1         
	//   16   36:iload_2         
	//   17   37:invokestatic    #42  <Method void zzaaa.zza(zzaaa, int, boolean)>
		zzaaa.zza(zzazp).unlock();
	//   18   40:aload_0         
	//   19   41:getfield        #15  <Field zzaaa zzazp>
	//   20   44:invokestatic    #28  <Method Lock zzaaa.zza(zzaaa)>
	//   21   47:invokeinterface #45  <Method void Lock.unlock()>
		return;
	//   22   52:return          
		zzaaa.zza(zzazp, true);
	//   23   53:aload_0         
	//   24   54:getfield        #15  <Field zzaaa zzazp>
	//   25   57:iconst_1        
	//   26   58:invokestatic    #39  <Method boolean zzaaa.zza(zzaaa, boolean)>
	//   27   61:pop             
		zzaaa.zzf(zzazp).onConnectionSuspended(i);
	//   28   62:aload_0         
	//   29   63:getfield        #15  <Field zzaaa zzazp>
	//   30   66:invokestatic    #49  <Method zzaan zzaaa.zzf(zzaaa)>
	//   31   69:iload_1         
	//   32   70:invokevirtual   #55  <Method void zzaan.onConnectionSuspended(int)>
		zzaaa.zza(zzazp).unlock();
	//   33   73:aload_0         
	//   34   74:getfield        #15  <Field zzaaa zzazp>
	//   35   77:invokestatic    #28  <Method Lock zzaaa.zza(zzaaa)>
	//   36   80:invokeinterface #45  <Method void Lock.unlock()>
		return;
	//   37   85:return          
		Exception exception;
		exception;
	//   38   86:astore_3        
		zzaaa.zza(zzazp).unlock();
	//   39   87:aload_0         
	//   40   88:getfield        #15  <Field zzaaa zzazp>
	//   41   91:invokestatic    #28  <Method Lock zzaaa.zza(zzaaa)>
	//   42   94:invokeinterface #45  <Method void Lock.unlock()>
		throw exception;
	//   43   99:aload_3         
	//   44  100:athrow          
	}

	public void zzc(ConnectionResult connectionresult)
	{
		zzaaa.zza(zzazp).lock();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zzaaa zzazp>
	//    2    4:invokestatic    #28  <Method Lock zzaaa.zza(zzaaa)>
	//    3    7:invokeinterface #33  <Method void Lock.lock()>
		zzaaa.zzb(zzazp, connectionresult);
	//    4   12:aload_0         
	//    5   13:getfield        #15  <Field zzaaa zzazp>
	//    6   16:aload_1         
	//    7   17:invokestatic    #60  <Method ConnectionResult zzaaa.zzb(zzaaa, ConnectionResult)>
	//    8   20:pop             
		zzaaa.zzb(zzazp);
	//    9   21:aload_0         
	//   10   22:getfield        #15  <Field zzaaa zzazp>
	//   11   25:invokestatic    #62  <Method void zzaaa.zzb(zzaaa)>
		zzaaa.zza(zzazp).unlock();
	//   12   28:aload_0         
	//   13   29:getfield        #15  <Field zzaaa zzazp>
	//   14   32:invokestatic    #28  <Method Lock zzaaa.zza(zzaaa)>
	//   15   35:invokeinterface #45  <Method void Lock.unlock()>
		return;
	//   16   40:return          
		connectionresult;
	//   17   41:astore_1        
		zzaaa.zza(zzazp).unlock();
	//   18   42:aload_0         
	//   19   43:getfield        #15  <Field zzaaa zzazp>
	//   20   46:invokestatic    #28  <Method Lock zzaaa.zza(zzaaa)>
	//   21   49:invokeinterface #45  <Method void Lock.unlock()>
		throw connectionresult;
	//   22   54:aload_1         
	//   23   55:athrow          
	}

	public void zzo(Bundle bundle)
	{
		zzaaa.zza(zzazp).lock();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zzaaa zzazp>
	//    2    4:invokestatic    #28  <Method Lock zzaaa.zza(zzaaa)>
	//    3    7:invokeinterface #33  <Method void Lock.lock()>
		zzaaa.zzb(zzazp, ConnectionResult.zzawX);
	//    4   12:aload_0         
	//    5   13:getfield        #15  <Field zzaaa zzazp>
	//    6   16:getstatic       #72  <Field ConnectionResult ConnectionResult.zzawX>
	//    7   19:invokestatic    #60  <Method ConnectionResult zzaaa.zzb(zzaaa, ConnectionResult)>
	//    8   22:pop             
		zzaaa.zzb(zzazp);
	//    9   23:aload_0         
	//   10   24:getfield        #15  <Field zzaaa zzazp>
	//   11   27:invokestatic    #62  <Method void zzaaa.zzb(zzaaa)>
		zzaaa.zza(zzazp).unlock();
	//   12   30:aload_0         
	//   13   31:getfield        #15  <Field zzaaa zzazp>
	//   14   34:invokestatic    #28  <Method Lock zzaaa.zza(zzaaa)>
	//   15   37:invokeinterface #45  <Method void Lock.unlock()>
		return;
	//   16   42:return          
		bundle;
	//   17   43:astore_1        
		zzaaa.zza(zzazp).unlock();
	//   18   44:aload_0         
	//   19   45:getfield        #15  <Field zzaaa zzazp>
	//   20   48:invokestatic    #28  <Method Lock zzaaa.zza(zzaaa)>
	//   21   51:invokeinterface #45  <Method void Lock.unlock()>
		throw bundle;
	//   22   56:aload_1         
	//   23   57:athrow          
	}

	final zzaaa zzazp;

	private zzaaa$zzb(zzaaa zzaaa1)
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

	zzaaa$zzb(zzaaa zzaaa1, zzaaa._cls1 _pcls1)
	{
		this(zzaaa1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void zzaaa$zzb(zzaaa)>
	//    3    5:return          
	}
}
