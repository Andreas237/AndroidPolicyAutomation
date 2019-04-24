// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.util;

import android.os.SystemClock;

public final class ConditionVariable
{

	public ConditionVariable()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public void block()
		throws InterruptedException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		while(!isOpen) 
	//*   2    2:aload_0         
	//*   3    3:getfield        #16  <Field boolean isOpen>
	//*   4    6:ifne            16
			((Object)this).wait();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #19  <Method void Object.wait()>
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

	public boolean block(long l)
		throws InterruptedException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		long l1 = SystemClock.elapsedRealtime();
	//    2    2:invokestatic    #27  <Method long SystemClock.elapsedRealtime()>
	//    3    5:lstore_3        
		long l2;
		l2 = l1 + l;
	//    4    6:lload_3         
	//    5    7:lload_1         
	//    6    8:ladd            
	//    7    9:lstore          5
		l = l1;
	//    8   11:lload_3         
	//    9   12:lstore_1        
_L1:
		if(isOpen || l >= l2)
			break MISSING_BLOCK_LABEL_42;
	//   10   13:aload_0         
	//   11   14:getfield        #16  <Field boolean isOpen>
	//   12   17:ifne            42
	//   13   20:lload_1         
	//   14   21:lload           5
	//   15   23:lcmp            
	//   16   24:ifge            42
		((Object)this).wait(l2 - l);
	//   17   27:aload_0         
	//   18   28:lload           5
	//   19   30:lload_1         
	//   20   31:lsub            
	//   21   32:invokevirtual   #30  <Method void Object.wait(long)>
		l = SystemClock.elapsedRealtime();
	//   22   35:invokestatic    #27  <Method long SystemClock.elapsedRealtime()>
	//   23   38:lstore_1        
		  goto _L1
	//*  24   39:goto            13
		boolean flag = isOpen;
	//   25   42:aload_0         
	//   26   43:getfield        #16  <Field boolean isOpen>
	//   27   46:istore          7
		this;
	//   28   48:aload_0         
		JVM INSTR monitorexit ;
	//   29   49:monitorexit     
		return flag;
	//   30   50:iload           7
	//   31   52:ireturn         
		Exception exception;
		exception;
	//   32   53:astore          8
	//*  33   55:aload_0         
		throw exception;
	//   34   56:monitorexit     
	//   35   57:aload           8
	//   36   59:athrow          
	}

	public boolean close()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag;
		flag = isOpen;
	//    2    2:aload_0         
	//    3    3:getfield        #16  <Field boolean isOpen>
	//    4    6:istore_1        
		isOpen = false;
	//    5    7:aload_0         
	//    6    8:iconst_0        
	//    7    9:putfield        #16  <Field boolean isOpen>
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

	public boolean open()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = isOpen;
	//    2    2:aload_0         
	//    3    3:getfield        #16  <Field boolean isOpen>
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
		isOpen = true;
	//   11   15:aload_0         
	//   12   16:iconst_1        
	//   13   17:putfield        #16  <Field boolean isOpen>
		((Object)this).notifyAll();
	//   14   20:aload_0         
	//   15   21:invokevirtual   #36  <Method void Object.notifyAll()>
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

	private boolean isOpen;
}
