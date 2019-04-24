// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.util;


// Referenced classes of package com.google.android.exoplayer2.util:
//			Assertions

public final class LibraryLoader
{

	public transient LibraryLoader(String as[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		nativeLibraries = as;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field String[] nativeLibraries>
	//    5    9:return          
	}

	public boolean isAvailable()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag;
		if(!loadAttempted)
			break MISSING_BLOCK_LABEL_18;
	//    2    2:aload_0         
	//    3    3:getfield        #22  <Field boolean loadAttempted>
	//    4    6:ifeq            18
		flag = isAvailable;
	//    5    9:aload_0         
	//    6   10:getfield        #24  <Field boolean isAvailable>
	//    7   13:istore_3        
		this;
	//    8   14:aload_0         
		JVM INSTR monitorexit ;
	//    9   15:monitorexit     
		return flag;
	//   10   16:iload_3         
	//   11   17:ireturn         
		loadAttempted = true;
	//   12   18:aload_0         
	//   13   19:iconst_1        
	//   14   20:putfield        #22  <Field boolean loadAttempted>
		int j;
		String as[];
		as = nativeLibraries;
	//   15   23:aload_0         
	//   16   24:getfield        #16  <Field String[] nativeLibraries>
	//   17   27:astore          4
		j = as.length;
	//   18   29:aload           4
	//   19   31:arraylength     
	//   20   32:istore_2        
		int i = 0;
	//   21   33:iconst_0        
	//   22   34:istore_1        
_L2:
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   23   35:iload_1         
	//   24   36:iload_2         
	//   25   37:icmpge          54
		System.loadLibrary(as[i]);
	//   26   40:aload           4
	//   27   42:iload_1         
	//   28   43:aaload          
	//   29   44:invokestatic    #30  <Method void System.loadLibrary(String)>
		i++;
	//   30   47:iload_1         
	//   31   48:iconst_1        
	//   32   49:iadd            
	//   33   50:istore_1        
		if(true) goto _L2; else goto _L1
	//   34   51:goto            35
_L1:
		Exception exception;
		try
		{
			isAvailable = true;
	//   35   54:aload_0         
	//   36   55:iconst_1        
	//   37   56:putfield        #24  <Field boolean isAvailable>
		}
	//*  38   59:aload_0         
	//*  39   60:getfield        #24  <Field boolean isAvailable>
	//*  40   63:istore_3        
	//*  41   64:aload_0         
	//*  42   65:monitorexit     
	//*  43   66:iload_3         
	//*  44   67:ireturn         
	//*  45   68:astore          4
	//*  46   70:aload_0         
	//*  47   71:monitorexit     
	//*  48   72:aload           4
	//*  49   74:athrow          
		catch(UnsatisfiedLinkError unsatisfiedlinkerror) { }
	//   50   75:astore          4
		flag = isAvailable;
		this;
		JVM INSTR monitorexit ;
		return flag;
		exception;
		throw exception;
	//*  51   77:goto            59
	}

	public transient void setLibraries(String as[])
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Assertions.checkState(loadAttempted ^ true, "Cannot set libraries after loading");
	//    2    2:aload_0         
	//    3    3:getfield        #22  <Field boolean loadAttempted>
	//    4    6:iconst_1        
	//    5    7:ixor            
	//    6    8:ldc1            #33  <String "Cannot set libraries after loading">
	//    7   10:invokestatic    #39  <Method void Assertions.checkState(boolean, Object)>
		nativeLibraries = as;
	//    8   13:aload_0         
	//    9   14:aload_1         
	//   10   15:putfield        #16  <Field String[] nativeLibraries>
		this;
	//   11   18:aload_0         
		JVM INSTR monitorexit ;
	//   12   19:monitorexit     
		return;
	//   13   20:return          
		as;
	//   14   21:astore_1        
	//*  15   22:aload_0         
		throw as;
	//   16   23:monitorexit     
	//   17   24:aload_1         
	//   18   25:athrow          
	}

	private boolean isAvailable;
	private boolean loadAttempted;
	private String nativeLibraries[];
}
