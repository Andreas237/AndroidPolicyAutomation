// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

// Referenced classes of package com.google.android.gms.internal.ads:
//			abq, abt, abr, abv

public class abu
	implements abq
{

	public abu()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void Object()>
	//    6   12:putfield        #20  <Field Object a>
		b = 0;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #22  <Field int b>
	//   10   20:aload_0         
	//   11   21:new             #24  <Class LinkedBlockingQueue>
	//   12   24:dup             
	//   13   25:invokespecial   #25  <Method void LinkedBlockingQueue()>
	//   14   28:putfield        #27  <Field BlockingQueue c>
	//   15   31:return          
	}

	public final void a(abt abt1, abr abr1)
	{
		Object obj = a;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Object a>
	//    2    4:astore_3        
		obj;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(b == 1)
	//*   5    7:aload_0         
	//*   6    8:getfield        #22  <Field int b>
	//*   7   11:iconst_1        
	//*   8   12:icmpne          28
		{
			abt1.a(d);
	//    9   15:aload_1         
	//   10   16:aload_0         
	//   11   17:getfield        #31  <Field Object d>
	//   12   20:invokeinterface #36  <Method void abt.a(Object)>
			break MISSING_BLOCK_LABEL_72;
	//   13   25:goto            72
		}
		if(b == -1)
	//*  14   28:aload_0         
	//*  15   29:getfield        #22  <Field int b>
	//*  16   32:iconst_m1       
	//*  17   33:icmpne          45
		{
			abr1.a();
	//   18   36:aload_2         
	//   19   37:invokeinterface #40  <Method void abr.a()>
			break MISSING_BLOCK_LABEL_72;
	//   20   42:goto            72
		}
		if(b == 0)
	//*  21   45:aload_0         
	//*  22   46:getfield        #22  <Field int b>
	//*  23   49:ifne            72
			c.add(((Object) (new abv(this, abt1, abr1))));
	//   24   52:aload_0         
	//   25   53:getfield        #27  <Field BlockingQueue c>
	//   26   56:new             #42  <Class abv>
	//   27   59:dup             
	//   28   60:aload_0         
	//   29   61:aload_1         
	//   30   62:aload_2         
	//   31   63:invokespecial   #45  <Method void abv(abu, abt, abr)>
	//   32   66:invokeinterface #51  <Method boolean BlockingQueue.add(Object)>
	//   33   71:pop             
		obj;
	//   34   72:aload_3         
		JVM INSTR monitorexit ;
	//   35   73:monitorexit     
		return;
	//   36   74:return          
		abt1;
	//   37   75:astore_1        
		obj;
	//   38   76:aload_3         
		JVM INSTR monitorexit ;
	//   39   77:monitorexit     
		throw abt1;
	//   40   78:aload_1         
	//   41   79:athrow          
	}

	public final void a(Object obj)
	{
		Object obj1 = a;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Object a>
	//    2    4:astore_2        
		obj1;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(b != 0)
			break MISSING_BLOCK_LABEL_76;
	//    5    7:aload_0         
	//    6    8:getfield        #22  <Field int b>
	//    7   11:ifne            76
		d = obj;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #31  <Field Object d>
		b = 1;
	//   11   19:aload_0         
	//   12   20:iconst_1        
	//   13   21:putfield        #22  <Field int b>
		for(Iterator iterator = c.iterator(); iterator.hasNext(); ((abv)iterator.next()).a.a(obj));
	//   14   24:aload_0         
	//   15   25:getfield        #27  <Field BlockingQueue c>
	//   16   28:invokeinterface #55  <Method Iterator BlockingQueue.iterator()>
	//   17   33:astore_3        
	//   18   34:aload_3         
	//   19   35:invokeinterface #61  <Method boolean Iterator.hasNext()>
	//   20   40:ifeq            64
	//   21   43:aload_3         
	//   22   44:invokeinterface #65  <Method Object Iterator.next()>
	//   23   49:checkcast       #42  <Class abv>
	//   24   52:getfield        #68  <Field abt abv.a>
	//   25   55:aload_1         
	//   26   56:invokeinterface #36  <Method void abt.a(Object)>
	//*  27   61:goto            34
		c.clear();
	//   28   64:aload_0         
	//   29   65:getfield        #27  <Field BlockingQueue c>
	//   30   68:invokeinterface #71  <Method void BlockingQueue.clear()>
		obj1;
	//   31   73:aload_2         
		JVM INSTR monitorexit ;
	//   32   74:monitorexit     
		return;
	//   33   75:return          
		throw new UnsupportedOperationException();
	//   34   76:new             #73  <Class UnsupportedOperationException>
	//   35   79:dup             
	//   36   80:invokespecial   #74  <Method void UnsupportedOperationException()>
	//   37   83:athrow          
		obj;
	//   38   84:astore_1        
		obj1;
	//   39   85:aload_2         
		JVM INSTR monitorexit ;
	//   40   86:monitorexit     
		throw obj;
	//   41   87:aload_1         
	//   42   88:athrow          
	}

	public final void d()
	{
		Object obj = a;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Object a>
	//    2    4:astore_1        
		obj;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(b != 0)
			break MISSING_BLOCK_LABEL_70;
	//    5    7:aload_0         
	//    6    8:getfield        #22  <Field int b>
	//    7   11:ifne            70
		b = -1;
	//    8   14:aload_0         
	//    9   15:iconst_m1       
	//   10   16:putfield        #22  <Field int b>
		for(Iterator iterator = c.iterator(); iterator.hasNext(); ((abv)iterator.next()).b.a());
	//   11   19:aload_0         
	//   12   20:getfield        #27  <Field BlockingQueue c>
	//   13   23:invokeinterface #55  <Method Iterator BlockingQueue.iterator()>
	//   14   28:astore_2        
	//   15   29:aload_2         
	//   16   30:invokeinterface #61  <Method boolean Iterator.hasNext()>
	//   17   35:ifeq            58
	//   18   38:aload_2         
	//   19   39:invokeinterface #65  <Method Object Iterator.next()>
	//   20   44:checkcast       #42  <Class abv>
	//   21   47:getfield        #77  <Field abr abv.b>
	//   22   50:invokeinterface #40  <Method void abr.a()>
	//*  23   55:goto            29
		c.clear();
	//   24   58:aload_0         
	//   25   59:getfield        #27  <Field BlockingQueue c>
	//   26   62:invokeinterface #71  <Method void BlockingQueue.clear()>
		obj;
	//   27   67:aload_1         
		JVM INSTR monitorexit ;
	//   28   68:monitorexit     
		return;
	//   29   69:return          
		throw new UnsupportedOperationException();
	//   30   70:new             #73  <Class UnsupportedOperationException>
	//   31   73:dup             
	//   32   74:invokespecial   #74  <Method void UnsupportedOperationException()>
	//   33   77:athrow          
		Exception exception;
		exception;
	//   34   78:astore_2        
		obj;
	//   35   79:aload_1         
		JVM INSTR monitorexit ;
	//   36   80:monitorexit     
		throw exception;
	//   37   81:aload_2         
	//   38   82:athrow          
	}

	public final int e()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field int b>
	//    2    4:ireturn         
	}

	private final Object a = new Object();
	private int b;
	private final BlockingQueue c = new LinkedBlockingQueue();
	private Object d;
}
