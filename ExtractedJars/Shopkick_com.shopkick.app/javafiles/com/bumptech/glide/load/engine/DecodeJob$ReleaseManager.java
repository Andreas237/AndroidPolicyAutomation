// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;


// Referenced classes of package com.bumptech.glide.load.engine:
//			DecodeJob

private static class DecodeJob$ReleaseManager
{

	private boolean isComplete(boolean flag)
	{
		return (isFailed || flag || isEncodeComplete) && isReleased;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field boolean isFailed>
	//    2    4:ifne            18
	//    3    7:iload_1         
	//    4    8:ifne            18
	//    5   11:aload_0         
	//    6   12:getfield        #22  <Field boolean isEncodeComplete>
	//    7   15:ifeq            27
	//    8   18:aload_0         
	//    9   19:getfield        #24  <Field boolean isReleased>
	//   10   22:ifeq            27
	//   11   25:iconst_1        
	//   12   26:ireturn         
	//   13   27:iconst_0        
	//   14   28:ireturn         
	}

	boolean onEncodeComplete()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag;
		isEncodeComplete = true;
	//    2    2:aload_0         
	//    3    3:iconst_1        
	//    4    4:putfield        #22  <Field boolean isEncodeComplete>
		flag = isComplete(false);
	//    5    7:aload_0         
	//    6    8:iconst_0        
	//    7    9:invokespecial   #28  <Method boolean isComplete(boolean)>
	//    8   12:istore_1        
		this;
	//    9   13:aload_0         
		JVM INSTR monitorexit ;
	//   10   14:monitorexit     
		return flag;
	//   11   15:iload_1         
	//   12   16:ireturn         
		Exception exception;
		exception;
	//   13   17:astore_2        
	//*  14   18:aload_0         
		throw exception;
	//   15   19:monitorexit     
	//   16   20:aload_2         
	//   17   21:athrow          
	}

	boolean onFailed()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag;
		isFailed = true;
	//    2    2:aload_0         
	//    3    3:iconst_1        
	//    4    4:putfield        #20  <Field boolean isFailed>
		flag = isComplete(false);
	//    5    7:aload_0         
	//    6    8:iconst_0        
	//    7    9:invokespecial   #28  <Method boolean isComplete(boolean)>
	//    8   12:istore_1        
		this;
	//    9   13:aload_0         
		JVM INSTR monitorexit ;
	//   10   14:monitorexit     
		return flag;
	//   11   15:iload_1         
	//   12   16:ireturn         
		Exception exception;
		exception;
	//   13   17:astore_2        
	//*  14   18:aload_0         
		throw exception;
	//   15   19:monitorexit     
	//   16   20:aload_2         
	//   17   21:athrow          
	}

	boolean release(boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		isReleased = true;
	//    2    2:aload_0         
	//    3    3:iconst_1        
	//    4    4:putfield        #24  <Field boolean isReleased>
		flag = isComplete(flag);
	//    5    7:aload_0         
	//    6    8:iload_1         
	//    7    9:invokespecial   #28  <Method boolean isComplete(boolean)>
	//    8   12:istore_1        
		this;
	//    9   13:aload_0         
		JVM INSTR monitorexit ;
	//   10   14:monitorexit     
		return flag;
	//   11   15:iload_1         
	//   12   16:ireturn         
		Exception exception;
		exception;
	//   13   17:astore_2        
	//*  14   18:aload_0         
		throw exception;
	//   15   19:monitorexit     
	//   16   20:aload_2         
	//   17   21:athrow          
	}

	void reset()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		isEncodeComplete = false;
	//    2    2:aload_0         
	//    3    3:iconst_0        
	//    4    4:putfield        #22  <Field boolean isEncodeComplete>
		isReleased = false;
	//    5    7:aload_0         
	//    6    8:iconst_0        
	//    7    9:putfield        #24  <Field boolean isReleased>
		isFailed = false;
	//    8   12:aload_0         
	//    9   13:iconst_0        
	//   10   14:putfield        #20  <Field boolean isFailed>
		this;
	//   11   17:aload_0         
		JVM INSTR monitorexit ;
	//   12   18:monitorexit     
		return;
	//   13   19:return          
		Exception exception;
		exception;
	//   14   20:astore_1        
	//*  15   21:aload_0         
		throw exception;
	//   16   22:monitorexit     
	//   17   23:aload_1         
	//   18   24:athrow          
	}

	private boolean isEncodeComplete;
	private boolean isFailed;
	private boolean isReleased;

	DecodeJob$ReleaseManager()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}
}
