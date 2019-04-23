// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


public final class bnh
{

	public bnh()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public final boolean a()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = a;
	//    2    2:aload_0         
	//    3    3:getfield        #14  <Field boolean a>
	//    4    6:istore_1        
		if(!flag)
			break MISSING_BLOCK_LABEL_15;
	//    5    7:iload_1         
	//    6    8:ifeq            15
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return false;
	//    9   13:iconst_0        
	//   10   14:ireturn         
		a = true;
	//   11   15:aload_0         
	//   12   16:iconst_1        
	//   13   17:putfield        #14  <Field boolean a>
		((Object)this).notifyAll();
	//   14   20:aload_0         
	//   15   21:invokevirtual   #17  <Method void Object.notifyAll()>
		this;
	//   16   24:aload_0         
		JVM INSTR monitorexit ;
	//   17   25:monitorexit     
		return true;
	//   18   26:iconst_1        
	//   19   27:ireturn         
		Exception exception;
		exception;
	//   20   28:astore_2        
	//*  21   29:aload_0         
		throw exception;
	//   22   30:monitorexit     
	//   23   31:aload_2         
	//   24   32:athrow          
	}

	public final boolean b()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag;
		flag = a;
	//    2    2:aload_0         
	//    3    3:getfield        #14  <Field boolean a>
	//    4    6:istore_1        
		a = false;
	//    5    7:aload_0         
	//    6    8:iconst_0        
	//    7    9:putfield        #14  <Field boolean a>
		this;
	//    8   12:aload_0         
		JVM INSTR monitorexit ;
	//    9   13:monitorexit     
		return flag;
	//   10   14:iload_1         
	//   11   15:ireturn         
		Exception exception;
		exception;
	//   12   16:astore_2        
	//*  13   17:aload_0         
		throw exception;
	//   14   18:monitorexit     
	//   15   19:aload_2         
	//   16   20:athrow          
	}

	public final void c()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		while(!a) 
	//*   2    2:aload_0         
	//*   3    3:getfield        #14  <Field boolean a>
	//*   4    6:ifne            16
			((Object)this).wait();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #22  <Method void Object.wait()>
	//*   7   13:goto            2
		this;
	//    8   16:aload_0         
		JVM INSTR monitorexit ;
	//    9   17:monitorexit     
		return;
	//   10   18:return          
		Exception exception;
		exception;
	//   11   19:astore_1        
	//*  12   20:aload_0         
		throw exception;
	//   13   21:monitorexit     
	//   14   22:aload_1         
	//   15   23:athrow          
	}

	private boolean a;
}
