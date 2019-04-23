// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			byh, byj

public final class li extends byh
{

	public li()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void byh()>
	//    2    4:aload_0         
	//    3    5:new             #14  <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #15  <Method void Object()>
	//    6   12:putfield        #17  <Field Object a>
	//    7   15:return          
	}

	public final void a()
	{
		throw new RemoteException();
	//    0    0:new             #20  <Class RemoteException>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void RemoteException()>
	//    3    7:athrow          
	}

	public final void a(byj byj)
	{
		synchronized(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field Object a>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			b = byj;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #24  <Field byj b>
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		return;
	//   10   14:return          
		byj;
	//   11   15:astore_1        
		obj;
	//   12   16:aload_2         
		JVM INSTR monitorexit ;
	//   13   17:monitorexit     
		throw byj;
	//   14   18:aload_1         
	//   15   19:athrow          
	}

	public final void a(boolean flag)
	{
		throw new RemoteException();
	//    0    0:new             #20  <Class RemoteException>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void RemoteException()>
	//    3    7:athrow          
	}

	public final void b()
	{
		throw new RemoteException();
	//    0    0:new             #20  <Class RemoteException>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void RemoteException()>
	//    3    7:athrow          
	}

	public final boolean c()
	{
		throw new RemoteException();
	//    0    0:new             #20  <Class RemoteException>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void RemoteException()>
	//    3    7:athrow          
	}

	public final int d()
	{
		throw new RemoteException();
	//    0    0:new             #20  <Class RemoteException>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void RemoteException()>
	//    3    7:athrow          
	}

	public final float e()
	{
		throw new RemoteException();
	//    0    0:new             #20  <Class RemoteException>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void RemoteException()>
	//    3    7:athrow          
	}

	public final float f()
	{
		throw new RemoteException();
	//    0    0:new             #20  <Class RemoteException>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void RemoteException()>
	//    3    7:athrow          
	}

	public final byj g()
	{
		byj byj;
		synchronized(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field Object a>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			byj = b;
	//    5    7:aload_0         
	//    6    8:getfield        #24  <Field byj b>
	//    7   11:astore_2        
		}
	//    8   12:aload_1         
	//    9   13:monitorexit     
		return byj;
	//   10   14:aload_2         
	//   11   15:areturn         
		exception;
	//   12   16:astore_2        
		obj;
	//   13   17:aload_1         
		JVM INSTR monitorexit ;
	//   14   18:monitorexit     
		throw exception;
	//   15   19:aload_2         
	//   16   20:athrow          
	}

	public final float h()
	{
		throw new RemoteException();
	//    0    0:new             #20  <Class RemoteException>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void RemoteException()>
	//    3    7:athrow          
	}

	public final boolean i()
	{
		throw new RemoteException();
	//    0    0:new             #20  <Class RemoteException>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void RemoteException()>
	//    3    7:athrow          
	}

	public final boolean j()
	{
		throw new RemoteException();
	//    0    0:new             #20  <Class RemoteException>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void RemoteException()>
	//    3    7:athrow          
	}

	private final Object a = new Object();
	private volatile byj b;
}
