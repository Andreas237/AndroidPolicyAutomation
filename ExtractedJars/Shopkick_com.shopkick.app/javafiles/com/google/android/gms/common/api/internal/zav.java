// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zabt, zas, zabe, zat

final class zav
	implements zabt
{

	private zav(zas zas1)
	{
		zaep = zas1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zas zaep>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	zav(zas zas1, zat zat)
	{
		this(zas1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void zav(zas)>
	//    3    5:return          
	}

	public final void zab(int i, boolean flag)
	{
		zas.zaa(zaep).lock();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zas zaep>
	//    2    4:invokestatic    #27  <Method Lock zas.zaa(zas)>
	//    3    7:invokeinterface #32  <Method void Lock.lock()>
		if(!zas.zac(zaep))
			break MISSING_BLOCK_LABEL_53;
	//    4   12:aload_0         
	//    5   13:getfield        #12  <Field zas zaep>
	//    6   16:invokestatic    #36  <Method boolean zas.zac(zas)>
	//    7   19:ifeq            53
		zas.zaa(zaep, false);
	//    8   22:aload_0         
	//    9   23:getfield        #12  <Field zas zaep>
	//   10   26:iconst_0        
	//   11   27:invokestatic    #39  <Method boolean zas.zaa(zas, boolean)>
	//   12   30:pop             
		zas.zaa(zaep, i, flag);
	//   13   31:aload_0         
	//   14   32:getfield        #12  <Field zas zaep>
	//   15   35:iload_1         
	//   16   36:iload_2         
	//   17   37:invokestatic    #42  <Method void zas.zaa(zas, int, boolean)>
		zas.zaa(zaep).unlock();
	//   18   40:aload_0         
	//   19   41:getfield        #12  <Field zas zaep>
	//   20   44:invokestatic    #27  <Method Lock zas.zaa(zas)>
	//   21   47:invokeinterface #45  <Method void Lock.unlock()>
		return;
	//   22   52:return          
		zas.zaa(zaep, true);
	//   23   53:aload_0         
	//   24   54:getfield        #12  <Field zas zaep>
	//   25   57:iconst_1        
	//   26   58:invokestatic    #39  <Method boolean zas.zaa(zas, boolean)>
	//   27   61:pop             
		zas.zaf(zaep).onConnectionSuspended(i);
	//   28   62:aload_0         
	//   29   63:getfield        #12  <Field zas zaep>
	//   30   66:invokestatic    #49  <Method zabe zas.zaf(zas)>
	//   31   69:iload_1         
	//   32   70:invokevirtual   #55  <Method void zabe.onConnectionSuspended(int)>
		zas.zaa(zaep).unlock();
	//   33   73:aload_0         
	//   34   74:getfield        #12  <Field zas zaep>
	//   35   77:invokestatic    #27  <Method Lock zas.zaa(zas)>
	//   36   80:invokeinterface #45  <Method void Lock.unlock()>
		return;
	//   37   85:return          
		Exception exception;
		exception;
	//   38   86:astore_3        
		zas.zaa(zaep).unlock();
	//   39   87:aload_0         
	//   40   88:getfield        #12  <Field zas zaep>
	//   41   91:invokestatic    #27  <Method Lock zas.zaa(zas)>
	//   42   94:invokeinterface #45  <Method void Lock.unlock()>
		throw exception;
	//   43   99:aload_3         
	//   44  100:athrow          
	}

	public final void zab(Bundle bundle)
	{
		zas.zaa(zaep).lock();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zas zaep>
	//    2    4:invokestatic    #27  <Method Lock zas.zaa(zas)>
	//    3    7:invokeinterface #32  <Method void Lock.lock()>
		zas.zab(zaep, ConnectionResult.RESULT_SUCCESS);
	//    4   12:aload_0         
	//    5   13:getfield        #12  <Field zas zaep>
	//    6   16:getstatic       #63  <Field ConnectionResult ConnectionResult.RESULT_SUCCESS>
	//    7   19:invokestatic    #66  <Method ConnectionResult zas.zab(zas, ConnectionResult)>
	//    8   22:pop             
		zas.zab(zaep);
	//    9   23:aload_0         
	//   10   24:getfield        #12  <Field zas zaep>
	//   11   27:invokestatic    #68  <Method void zas.zab(zas)>
		zas.zaa(zaep).unlock();
	//   12   30:aload_0         
	//   13   31:getfield        #12  <Field zas zaep>
	//   14   34:invokestatic    #27  <Method Lock zas.zaa(zas)>
	//   15   37:invokeinterface #45  <Method void Lock.unlock()>
		return;
	//   16   42:return          
		bundle;
	//   17   43:astore_1        
		zas.zaa(zaep).unlock();
	//   18   44:aload_0         
	//   19   45:getfield        #12  <Field zas zaep>
	//   20   48:invokestatic    #27  <Method Lock zas.zaa(zas)>
	//   21   51:invokeinterface #45  <Method void Lock.unlock()>
		throw bundle;
	//   22   56:aload_1         
	//   23   57:athrow          
	}

	public final void zac(ConnectionResult connectionresult)
	{
		zas.zaa(zaep).lock();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zas zaep>
	//    2    4:invokestatic    #27  <Method Lock zas.zaa(zas)>
	//    3    7:invokeinterface #32  <Method void Lock.lock()>
		zas.zab(zaep, connectionresult);
	//    4   12:aload_0         
	//    5   13:getfield        #12  <Field zas zaep>
	//    6   16:aload_1         
	//    7   17:invokestatic    #66  <Method ConnectionResult zas.zab(zas, ConnectionResult)>
	//    8   20:pop             
		zas.zab(zaep);
	//    9   21:aload_0         
	//   10   22:getfield        #12  <Field zas zaep>
	//   11   25:invokestatic    #68  <Method void zas.zab(zas)>
		zas.zaa(zaep).unlock();
	//   12   28:aload_0         
	//   13   29:getfield        #12  <Field zas zaep>
	//   14   32:invokestatic    #27  <Method Lock zas.zaa(zas)>
	//   15   35:invokeinterface #45  <Method void Lock.unlock()>
		return;
	//   16   40:return          
		connectionresult;
	//   17   41:astore_1        
		zas.zaa(zaep).unlock();
	//   18   42:aload_0         
	//   19   43:getfield        #12  <Field zas zaep>
	//   20   46:invokestatic    #27  <Method Lock zas.zaa(zas)>
	//   21   49:invokeinterface #45  <Method void Lock.unlock()>
		throw connectionresult;
	//   22   54:aload_1         
	//   23   55:athrow          
	}

	private final zas zaep;
}
