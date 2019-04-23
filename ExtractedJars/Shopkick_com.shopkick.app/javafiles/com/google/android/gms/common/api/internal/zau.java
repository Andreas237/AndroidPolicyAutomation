// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zabt, zas, zabe, zat

final class zau
	implements zabt
{

	private zau(zas zas1)
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

	zau(zas zas1, zat zat)
	{
		this(zas1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void zau(zas)>
	//    3    5:return          
	}

	public final void zab(int i, boolean flag)
	{
		zas.zaa(zaep).lock();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zas zaep>
	//    2    4:invokestatic    #27  <Method Lock zas.zaa(zas)>
	//    3    7:invokeinterface #32  <Method void Lock.lock()>
		if(zas.zac(zaep) || zas.zad(zaep) == null || !zas.zad(zaep).isSuccess())
	//*   4   12:aload_0         
	//*   5   13:getfield        #12  <Field zas zaep>
	//*   6   16:invokestatic    #36  <Method boolean zas.zac(zas)>
	//*   7   19:ifne            81
	//*   8   22:aload_0         
	//*   9   23:getfield        #12  <Field zas zaep>
	//*  10   26:invokestatic    #40  <Method ConnectionResult zas.zad(zas)>
	//*  11   29:ifnull          81
	//*  12   32:aload_0         
	//*  13   33:getfield        #12  <Field zas zaep>
	//*  14   36:invokestatic    #40  <Method ConnectionResult zas.zad(zas)>
	//*  15   39:invokevirtual   #46  <Method boolean ConnectionResult.isSuccess()>
	//*  16   42:ifne            48
			break MISSING_BLOCK_LABEL_81;
	//   17   45:goto            81
		zas.zaa(zaep, true);
	//   18   48:aload_0         
	//   19   49:getfield        #12  <Field zas zaep>
	//   20   52:iconst_1        
	//   21   53:invokestatic    #49  <Method boolean zas.zaa(zas, boolean)>
	//   22   56:pop             
		zas.zae(zaep).onConnectionSuspended(i);
	//   23   57:aload_0         
	//   24   58:getfield        #12  <Field zas zaep>
	//   25   61:invokestatic    #53  <Method zabe zas.zae(zas)>
	//   26   64:iload_1         
	//   27   65:invokevirtual   #59  <Method void zabe.onConnectionSuspended(int)>
		zas.zaa(zaep).unlock();
	//   28   68:aload_0         
	//   29   69:getfield        #12  <Field zas zaep>
	//   30   72:invokestatic    #27  <Method Lock zas.zaa(zas)>
	//   31   75:invokeinterface #62  <Method void Lock.unlock()>
		return;
	//   32   80:return          
		zas.zaa(zaep, false);
	//   33   81:aload_0         
	//   34   82:getfield        #12  <Field zas zaep>
	//   35   85:iconst_0        
	//   36   86:invokestatic    #49  <Method boolean zas.zaa(zas, boolean)>
	//   37   89:pop             
		zas.zaa(zaep, i, flag);
	//   38   90:aload_0         
	//   39   91:getfield        #12  <Field zas zaep>
	//   40   94:iload_1         
	//   41   95:iload_2         
	//   42   96:invokestatic    #65  <Method void zas.zaa(zas, int, boolean)>
		zas.zaa(zaep).unlock();
	//   43   99:aload_0         
	//   44  100:getfield        #12  <Field zas zaep>
	//   45  103:invokestatic    #27  <Method Lock zas.zaa(zas)>
	//   46  106:invokeinterface #62  <Method void Lock.unlock()>
		return;
	//   47  111:return          
		Exception exception;
		exception;
	//   48  112:astore_3        
		zas.zaa(zaep).unlock();
	//   49  113:aload_0         
	//   50  114:getfield        #12  <Field zas zaep>
	//   51  117:invokestatic    #27  <Method Lock zas.zaa(zas)>
	//   52  120:invokeinterface #62  <Method void Lock.unlock()>
		throw exception;
	//   53  125:aload_3         
	//   54  126:athrow          
	}

	public final void zab(Bundle bundle)
	{
		zas.zaa(zaep).lock();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zas zaep>
	//    2    4:invokestatic    #27  <Method Lock zas.zaa(zas)>
	//    3    7:invokeinterface #32  <Method void Lock.lock()>
		zas.zaa(zaep, bundle);
	//    4   12:aload_0         
	//    5   13:getfield        #12  <Field zas zaep>
	//    6   16:aload_1         
	//    7   17:invokestatic    #70  <Method void zas.zaa(zas, Bundle)>
		zas.zaa(zaep, ConnectionResult.RESULT_SUCCESS);
	//    8   20:aload_0         
	//    9   21:getfield        #12  <Field zas zaep>
	//   10   24:getstatic       #74  <Field ConnectionResult ConnectionResult.RESULT_SUCCESS>
	//   11   27:invokestatic    #77  <Method ConnectionResult zas.zaa(zas, ConnectionResult)>
	//   12   30:pop             
		zas.zab(zaep);
	//   13   31:aload_0         
	//   14   32:getfield        #12  <Field zas zaep>
	//   15   35:invokestatic    #79  <Method void zas.zab(zas)>
		zas.zaa(zaep).unlock();
	//   16   38:aload_0         
	//   17   39:getfield        #12  <Field zas zaep>
	//   18   42:invokestatic    #27  <Method Lock zas.zaa(zas)>
	//   19   45:invokeinterface #62  <Method void Lock.unlock()>
		return;
	//   20   50:return          
		bundle;
	//   21   51:astore_1        
		zas.zaa(zaep).unlock();
	//   22   52:aload_0         
	//   23   53:getfield        #12  <Field zas zaep>
	//   24   56:invokestatic    #27  <Method Lock zas.zaa(zas)>
	//   25   59:invokeinterface #62  <Method void Lock.unlock()>
		throw bundle;
	//   26   64:aload_1         
	//   27   65:athrow          
	}

	public final void zac(ConnectionResult connectionresult)
	{
		zas.zaa(zaep).lock();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zas zaep>
	//    2    4:invokestatic    #27  <Method Lock zas.zaa(zas)>
	//    3    7:invokeinterface #32  <Method void Lock.lock()>
		zas.zaa(zaep, connectionresult);
	//    4   12:aload_0         
	//    5   13:getfield        #12  <Field zas zaep>
	//    6   16:aload_1         
	//    7   17:invokestatic    #77  <Method ConnectionResult zas.zaa(zas, ConnectionResult)>
	//    8   20:pop             
		zas.zab(zaep);
	//    9   21:aload_0         
	//   10   22:getfield        #12  <Field zas zaep>
	//   11   25:invokestatic    #79  <Method void zas.zab(zas)>
		zas.zaa(zaep).unlock();
	//   12   28:aload_0         
	//   13   29:getfield        #12  <Field zas zaep>
	//   14   32:invokestatic    #27  <Method Lock zas.zaa(zas)>
	//   15   35:invokeinterface #62  <Method void Lock.unlock()>
		return;
	//   16   40:return          
		connectionresult;
	//   17   41:astore_1        
		zas.zaa(zaep).unlock();
	//   18   42:aload_0         
	//   19   43:getfield        #12  <Field zas zaep>
	//   20   46:invokestatic    #27  <Method Lock zas.zaa(zas)>
	//   21   49:invokeinterface #62  <Method void Lock.unlock()>
		throw connectionresult;
	//   22   54:aload_1         
	//   23   55:athrow          
	}

	private final zas zaep;
}
