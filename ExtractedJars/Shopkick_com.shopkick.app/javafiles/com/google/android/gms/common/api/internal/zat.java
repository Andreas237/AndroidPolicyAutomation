// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zas

final class zat
	implements Runnable
{

	zat(zas zas1)
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

	public final void run()
	{
		zas.zaa(zaep).lock();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zas zaep>
	//    2    4:invokestatic    #23  <Method Lock zas.zaa(zas)>
	//    3    7:invokeinterface #28  <Method void Lock.lock()>
		zas.zab(zaep);
	//    4   12:aload_0         
	//    5   13:getfield        #12  <Field zas zaep>
	//    6   16:invokestatic    #31  <Method void zas.zab(zas)>
		zas.zaa(zaep).unlock();
	//    7   19:aload_0         
	//    8   20:getfield        #12  <Field zas zaep>
	//    9   23:invokestatic    #23  <Method Lock zas.zaa(zas)>
	//   10   26:invokeinterface #34  <Method void Lock.unlock()>
		return;
	//   11   31:return          
		Exception exception;
		exception;
	//   12   32:astore_1        
		zas.zaa(zaep).unlock();
	//   13   33:aload_0         
	//   14   34:getfield        #12  <Field zas zaep>
	//   15   37:invokestatic    #23  <Method Lock zas.zaa(zas)>
	//   16   40:invokeinterface #34  <Method void Lock.unlock()>
		throw exception;
	//   17   45:aload_1         
	//   18   46:athrow          
	}

	private final zas zaep;
}
