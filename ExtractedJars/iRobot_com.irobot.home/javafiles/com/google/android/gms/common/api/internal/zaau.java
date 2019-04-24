// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zaak, zabe, zaal

abstract class zaau
	implements Runnable
{

	private zaau(zaak zaak1)
	{
		zagi = zaak1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zaak zagi>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	zaau(zaak zaak1, zaal zaal)
	{
		this(zaak1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void zaau(zaak)>
	//    3    5:return          
	}

	public void run()
	{
		zaak.zac(zagi).lock();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zaak zagi>
	//    2    4:invokestatic    #28  <Method Lock zaak.zac(zaak)>
	//    3    7:invokeinterface #33  <Method void Lock.lock()>
		boolean flag = Thread.interrupted();
	//    4   12:invokestatic    #39  <Method boolean Thread.interrupted()>
	//    5   15:istore_1        
		if(!flag) goto _L2; else goto _L1
	//    6   16:iload_1         
	//    7   17:ifeq            33
_L1:
		zaak.zac(zagi).unlock();
	//    8   20:aload_0         
	//    9   21:getfield        #12  <Field zaak zagi>
	//   10   24:invokestatic    #28  <Method Lock zaak.zac(zaak)>
	//   11   27:invokeinterface #42  <Method void Lock.unlock()>
		return;
	//   12   32:return          
_L2:
		Object obj;
		try
		{
			zaan();
	//   13   33:aload_0         
	//   14   34:invokevirtual   #45  <Method void zaan()>
			continue; /* Loop/switch isn't completed */
	//   15   37:goto            20
		}
	//*  16   40:astore_2        
	//*  17   41:goto            59
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
	//   18   44:astore_2        
		break MISSING_BLOCK_LABEL_45;
		obj;
		break; /* Loop/switch isn't completed */
		zaak.zad(zagi).zab(((RuntimeException) (obj)));
	//   19   45:aload_0         
	//   20   46:getfield        #12  <Field zaak zagi>
	//   21   49:invokestatic    #49  <Method zabe zaak.zad(zaak)>
	//   22   52:aload_2         
	//   23   53:invokevirtual   #55  <Method void zabe.zab(RuntimeException)>
		if(true) goto _L1; else goto _L3
	//   24   56:goto            20
_L3:
		zaak.zac(zagi).unlock();
	//   25   59:aload_0         
	//   26   60:getfield        #12  <Field zaak zagi>
	//   27   63:invokestatic    #28  <Method Lock zaak.zac(zaak)>
	//   28   66:invokeinterface #42  <Method void Lock.unlock()>
		throw obj;
	//   29   71:aload_2         
	//   30   72:athrow          
	}

	protected abstract void zaan();

	private final zaak zagi;
}
