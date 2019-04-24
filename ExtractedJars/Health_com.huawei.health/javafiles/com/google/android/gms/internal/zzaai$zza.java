// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.internal:
//			zzaai, zzaav

class zzaai$zza
	implements zzabc$zza
{

	public void zzc(int i, boolean flag)
	{
		zzaai.zza(zzaAI).lock();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zzaai zzaAI>
	//    2    4:invokestatic    #27  <Method Lock zzaai.zza(zzaai)>
	//    3    7:invokeinterface #32  <Method void Lock.lock()>
		if(!zzaai.zzc(zzaAI) && zzaai.zzd(zzaAI) != null && zzaai.zzd(zzaAI).isSuccess())
			break MISSING_BLOCK_LABEL_76;
	//    4   12:aload_0         
	//    5   13:getfield        #15  <Field zzaai zzaAI>
	//    6   16:invokestatic    #35  <Method boolean zzaai.zzc(zzaai)>
	//    7   19:ifne            45
	//    8   22:aload_0         
	//    9   23:getfield        #15  <Field zzaai zzaAI>
	//   10   26:invokestatic    #39  <Method ConnectionResult zzaai.zzd(zzaai)>
	//   11   29:ifnull          45
	//   12   32:aload_0         
	//   13   33:getfield        #15  <Field zzaai zzaAI>
	//   14   36:invokestatic    #39  <Method ConnectionResult zzaai.zzd(zzaai)>
	//   15   39:invokevirtual   #45  <Method boolean ConnectionResult.isSuccess()>
	//   16   42:ifne            76
		zzaai.zza(zzaAI, false);
	//   17   45:aload_0         
	//   18   46:getfield        #15  <Field zzaai zzaAI>
	//   19   49:iconst_0        
	//   20   50:invokestatic    #48  <Method boolean zzaai.zza(zzaai, boolean)>
	//   21   53:pop             
		zzaai.zza(zzaAI, i, flag);
	//   22   54:aload_0         
	//   23   55:getfield        #15  <Field zzaai zzaAI>
	//   24   58:iload_1         
	//   25   59:iload_2         
	//   26   60:invokestatic    #51  <Method void zzaai.zza(zzaai, int, boolean)>
		zzaai.zza(zzaAI).unlock();
	//   27   63:aload_0         
	//   28   64:getfield        #15  <Field zzaai zzaAI>
	//   29   67:invokestatic    #27  <Method Lock zzaai.zza(zzaai)>
	//   30   70:invokeinterface #54  <Method void Lock.unlock()>
		return;
	//   31   75:return          
		zzaai.zza(zzaAI, true);
	//   32   76:aload_0         
	//   33   77:getfield        #15  <Field zzaai zzaAI>
	//   34   80:iconst_1        
	//   35   81:invokestatic    #48  <Method boolean zzaai.zza(zzaai, boolean)>
	//   36   84:pop             
		zzaai.zze(zzaAI).onConnectionSuspended(i);
	//   37   85:aload_0         
	//   38   86:getfield        #15  <Field zzaai zzaAI>
	//   39   89:invokestatic    #58  <Method zzaav zzaai.zze(zzaai)>
	//   40   92:iload_1         
	//   41   93:invokevirtual   #64  <Method void zzaav.onConnectionSuspended(int)>
		zzaai.zza(zzaAI).unlock();
	//   42   96:aload_0         
	//   43   97:getfield        #15  <Field zzaai zzaAI>
	//   44  100:invokestatic    #27  <Method Lock zzaai.zza(zzaai)>
	//   45  103:invokeinterface #54  <Method void Lock.unlock()>
		return;
	//   46  108:return          
		Exception exception;
		exception;
	//   47  109:astore_3        
		zzaai.zza(zzaAI).unlock();
	//   48  110:aload_0         
	//   49  111:getfield        #15  <Field zzaai zzaAI>
	//   50  114:invokestatic    #27  <Method Lock zzaai.zza(zzaai)>
	//   51  117:invokeinterface #54  <Method void Lock.unlock()>
		throw exception;
	//   52  122:aload_3         
	//   53  123:athrow          
	}

	public void zzc(ConnectionResult connectionresult)
	{
		zzaai.zza(zzaAI).lock();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zzaai zzaAI>
	//    2    4:invokestatic    #27  <Method Lock zzaai.zza(zzaai)>
	//    3    7:invokeinterface #32  <Method void Lock.lock()>
		zzaai.zza(zzaAI, connectionresult);
	//    4   12:aload_0         
	//    5   13:getfield        #15  <Field zzaai zzaAI>
	//    6   16:aload_1         
	//    7   17:invokestatic    #69  <Method ConnectionResult zzaai.zza(zzaai, ConnectionResult)>
	//    8   20:pop             
		zzaai.zzb(zzaAI);
	//    9   21:aload_0         
	//   10   22:getfield        #15  <Field zzaai zzaAI>
	//   11   25:invokestatic    #72  <Method void zzaai.zzb(zzaai)>
		zzaai.zza(zzaAI).unlock();
	//   12   28:aload_0         
	//   13   29:getfield        #15  <Field zzaai zzaAI>
	//   14   32:invokestatic    #27  <Method Lock zzaai.zza(zzaai)>
	//   15   35:invokeinterface #54  <Method void Lock.unlock()>
		return;
	//   16   40:return          
		connectionresult;
	//   17   41:astore_1        
		zzaai.zza(zzaAI).unlock();
	//   18   42:aload_0         
	//   19   43:getfield        #15  <Field zzaai zzaAI>
	//   20   46:invokestatic    #27  <Method Lock zzaai.zza(zzaai)>
	//   21   49:invokeinterface #54  <Method void Lock.unlock()>
		throw connectionresult;
	//   22   54:aload_1         
	//   23   55:athrow          
	}

	public void zzo(Bundle bundle)
	{
		zzaai.zza(zzaAI).lock();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zzaai zzaAI>
	//    2    4:invokestatic    #27  <Method Lock zzaai.zza(zzaai)>
	//    3    7:invokeinterface #32  <Method void Lock.lock()>
		zzaai.zza(zzaAI, bundle);
	//    4   12:aload_0         
	//    5   13:getfield        #15  <Field zzaai zzaAI>
	//    6   16:aload_1         
	//    7   17:invokestatic    #79  <Method void zzaai.zza(zzaai, Bundle)>
		zzaai.zza(zzaAI, ConnectionResult.zzayj);
	//    8   20:aload_0         
	//    9   21:getfield        #15  <Field zzaai zzaAI>
	//   10   24:getstatic       #83  <Field ConnectionResult ConnectionResult.zzayj>
	//   11   27:invokestatic    #69  <Method ConnectionResult zzaai.zza(zzaai, ConnectionResult)>
	//   12   30:pop             
		zzaai.zzb(zzaAI);
	//   13   31:aload_0         
	//   14   32:getfield        #15  <Field zzaai zzaAI>
	//   15   35:invokestatic    #72  <Method void zzaai.zzb(zzaai)>
		zzaai.zza(zzaAI).unlock();
	//   16   38:aload_0         
	//   17   39:getfield        #15  <Field zzaai zzaAI>
	//   18   42:invokestatic    #27  <Method Lock zzaai.zza(zzaai)>
	//   19   45:invokeinterface #54  <Method void Lock.unlock()>
		return;
	//   20   50:return          
		bundle;
	//   21   51:astore_1        
		zzaai.zza(zzaAI).unlock();
	//   22   52:aload_0         
	//   23   53:getfield        #15  <Field zzaai zzaAI>
	//   24   56:invokestatic    #27  <Method Lock zzaai.zza(zzaai)>
	//   25   59:invokeinterface #54  <Method void Lock.unlock()>
		throw bundle;
	//   26   64:aload_1         
	//   27   65:athrow          
	}

	final zzaai zzaAI;

	private zzaai$zza(zzaai zzaai1)
	{
		zzaAI = zzaai1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field zzaai zzaAI>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}

	zzaai$zza(zzaai zzaai1, zzaai._cls1 _pcls1)
	{
		this(zzaai1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void zzaai$zza(zzaai)>
	//    3    5:return          
	}
}
