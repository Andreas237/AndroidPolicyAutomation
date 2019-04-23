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
	//    2    4:invokestatic    #29  <Method Lock zaak.zac(zaak)>
	//    3    7:invokeinterface #34  <Method void Lock.lock()>
		boolean flag = Thread.interrupted();
	//    4   12:invokestatic    #40  <Method boolean Thread.interrupted()>
	//    5   15:istore_1        
		if(flag)
	//*   6   16:iload_1         
	//*   7   17:ifeq            33
		{
			zaak.zac(zagi).unlock();
	//    8   20:aload_0         
	//    9   21:getfield        #12  <Field zaak zagi>
	//   10   24:invokestatic    #29  <Method Lock zaak.zac(zaak)>
	//   11   27:invokeinterface #43  <Method void Lock.unlock()>
			return;
	//   12   32:return          
		}
		zaan();
	//   13   33:aload_0         
	//   14   34:invokevirtual   #46  <Method void zaan()>
		zaak.zac(zagi).unlock();
	//   15   37:aload_0         
	//   16   38:getfield        #12  <Field zaak zagi>
	//   17   41:invokestatic    #29  <Method Lock zaak.zac(zaak)>
	//   18   44:invokeinterface #43  <Method void Lock.unlock()>
		return;
	//   19   49:return          
		Object obj;
		obj;
	//   20   50:astore_2        
		break MISSING_BLOCK_LABEL_79;
	//   21   51:goto            79
		obj;
	//   22   54:astore_2        
		zaak.zad(zagi).zab(((RuntimeException) (obj)));
	//   23   55:aload_0         
	//   24   56:getfield        #12  <Field zaak zagi>
	//   25   59:invokestatic    #50  <Method zabe zaak.zad(zaak)>
	//   26   62:aload_2         
	//   27   63:invokevirtual   #56  <Method void zabe.zab(RuntimeException)>
		zaak.zac(zagi).unlock();
	//   28   66:aload_0         
	//   29   67:getfield        #12  <Field zaak zagi>
	//   30   70:invokestatic    #29  <Method Lock zaak.zac(zaak)>
	//   31   73:invokeinterface #43  <Method void Lock.unlock()>
		return;
	//   32   78:return          
		zaak.zac(zagi).unlock();
	//   33   79:aload_0         
	//   34   80:getfield        #12  <Field zaak zagi>
	//   35   83:invokestatic    #29  <Method Lock zaak.zac(zaak)>
	//   36   86:invokeinterface #43  <Method void Lock.unlock()>
		throw obj;
	//   37   91:aload_2         
	//   38   92:athrow          
	}

	protected abstract void zaan();

	private final zaak zagi;
}
