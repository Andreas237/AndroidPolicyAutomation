// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zabe, zabd

abstract class zabf
{

	protected zabf(zabd zabd)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		zaht = zabd;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field zabd zaht>
	//    5    9:return          
	}

	protected abstract void zaan();

	public final void zac(zabe zabe1)
	{
		zabe.zaa(zabe1).lock();
	//    0    0:aload_1         
	//    1    1:invokestatic    #23  <Method Lock zabe.zaa(zabe)>
	//    2    4:invokeinterface #28  <Method void Lock.lock()>
		zabd zabd;
		zabd zabd1;
		zabd = zabe.zab(zabe1);
	//    3    9:aload_1         
	//    4   10:invokestatic    #32  <Method zabd zabe.zab(zabe)>
	//    5   13:astore_2        
		zabd1 = zaht;
	//    6   14:aload_0         
	//    7   15:getfield        #13  <Field zabd zaht>
	//    8   18:astore_3        
		if(zabd != zabd1)
	//*   9   19:aload_2         
	//*  10   20:aload_3         
	//*  11   21:if_acmpeq       34
		{
			zabe.zaa(zabe1).unlock();
	//   12   24:aload_1         
	//   13   25:invokestatic    #23  <Method Lock zabe.zaa(zabe)>
	//   14   28:invokeinterface #35  <Method void Lock.unlock()>
			return;
	//   15   33:return          
		}
		zaan();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #37  <Method void zaan()>
		zabe.zaa(zabe1).unlock();
	//   18   38:aload_1         
	//   19   39:invokestatic    #23  <Method Lock zabe.zaa(zabe)>
	//   20   42:invokeinterface #35  <Method void Lock.unlock()>
		return;
	//   21   47:return          
		Exception exception;
		exception;
	//   22   48:astore_2        
		zabe.zaa(zabe1).unlock();
	//   23   49:aload_1         
	//   24   50:invokestatic    #23  <Method Lock zabe.zaa(zabe)>
	//   25   53:invokeinterface #35  <Method void Lock.unlock()>
		throw exception;
	//   26   58:aload_2         
	//   27   59:athrow          
	}

	private final zabd zaht;
}
