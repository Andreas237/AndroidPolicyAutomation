// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.a;

public class bwm extends a
{

	public bwm()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void a()>
	//    2    4:aload_0         
	//    3    5:new             #15  <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void Object()>
	//    6   12:putfield        #18  <Field Object a>
	//    7   15:return          
	}

	public void a()
	{
		synchronized(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field Object a>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			if(b != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #21  <Field a b>
	//*   7   11:ifnull          21
				b.a();
	//    8   14:aload_0         
	//    9   15:getfield        #21  <Field a b>
	//   10   18:invokevirtual   #23  <Method void a.a()>
		}
	//   11   21:aload_1         
	//   12   22:monitorexit     
		return;
	//   13   23:return          
		exception;
	//   14   24:astore_2        
		obj;
	//   15   25:aload_1         
		JVM INSTR monitorexit ;
	//   16   26:monitorexit     
		throw exception;
	//   17   27:aload_2         
	//   18   28:athrow          
	}

	public void a(int i)
	{
		synchronized(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field Object a>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			if(b != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #21  <Field a b>
	//*   7   11:ifnull          22
				b.a(i);
	//    8   14:aload_0         
	//    9   15:getfield        #21  <Field a b>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #26  <Method void a.a(int)>
		}
	//   12   22:aload_2         
	//   13   23:monitorexit     
		return;
	//   14   24:return          
		exception;
	//   15   25:astore_3        
		obj;
	//   16   26:aload_2         
		JVM INSTR monitorexit ;
	//   17   27:monitorexit     
		throw exception;
	//   18   28:aload_3         
	//   19   29:athrow          
	}

	public final void a(a a1)
	{
		synchronized(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field Object a>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			b = a1;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #21  <Field a b>
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		return;
	//   10   14:return          
		a1;
	//   11   15:astore_1        
		obj;
	//   12   16:aload_2         
		JVM INSTR monitorexit ;
	//   13   17:monitorexit     
		throw a1;
	//   14   18:aload_1         
	//   15   19:athrow          
	}

	public void b()
	{
		synchronized(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field Object a>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			if(b != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #21  <Field a b>
	//*   7   11:ifnull          21
				b.b();
	//    8   14:aload_0         
	//    9   15:getfield        #21  <Field a b>
	//   10   18:invokevirtual   #29  <Method void a.b()>
		}
	//   11   21:aload_1         
	//   12   22:monitorexit     
		return;
	//   13   23:return          
		exception;
	//   14   24:astore_2        
		obj;
	//   15   25:aload_1         
		JVM INSTR monitorexit ;
	//   16   26:monitorexit     
		throw exception;
	//   17   27:aload_2         
	//   18   28:athrow          
	}

	public void c()
	{
		synchronized(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field Object a>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			if(b != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #21  <Field a b>
	//*   7   11:ifnull          21
				b.c();
	//    8   14:aload_0         
	//    9   15:getfield        #21  <Field a b>
	//   10   18:invokevirtual   #32  <Method void a.c()>
		}
	//   11   21:aload_1         
	//   12   22:monitorexit     
		return;
	//   13   23:return          
		exception;
	//   14   24:astore_2        
		obj;
	//   15   25:aload_1         
		JVM INSTR monitorexit ;
	//   16   26:monitorexit     
		throw exception;
	//   17   27:aload_2         
	//   18   28:athrow          
	}

	public void d()
	{
		synchronized(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field Object a>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			if(b != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #21  <Field a b>
	//*   7   11:ifnull          21
				b.d();
	//    8   14:aload_0         
	//    9   15:getfield        #21  <Field a b>
	//   10   18:invokevirtual   #35  <Method void a.d()>
		}
	//   11   21:aload_1         
	//   12   22:monitorexit     
		return;
	//   13   23:return          
		exception;
	//   14   24:astore_2        
		obj;
	//   15   25:aload_1         
		JVM INSTR monitorexit ;
	//   16   26:monitorexit     
		throw exception;
	//   17   27:aload_2         
	//   18   28:athrow          
	}

	private final Object a = new Object();
	private a b;
}
