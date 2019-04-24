// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.disklrucache;

import java.util.concurrent.Callable;

// Referenced classes of package com.bumptech.glide.disklrucache:
//			DiskLruCache

class DiskLruCache$1
	implements Callable
{

	public volatile Object call()
		throws Exception
	{
		return ((Object) (call()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method Void call()>
	//    2    4:areturn         
	}

	public Void call()
		throws Exception
	{
		DiskLruCache disklrucache = DiskLruCache.this;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field DiskLruCache this$0>
	//    2    4:astore_1        
		disklrucache;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		java.io.Writer writer = DiskLruCache.access$100(DiskLruCache.this);
	//    5    7:aload_0         
	//    6    8:getfield        #15  <Field DiskLruCache this$0>
	//    7   11:invokestatic    #31  <Method java.io.Writer DiskLruCache.access$100(DiskLruCache)>
	//    8   14:astore_2        
		if(writer != null)
			break MISSING_BLOCK_LABEL_23;
	//    9   15:aload_2         
	//   10   16:ifnonnull       23
		disklrucache;
	//   11   19:aload_1         
		JVM INSTR monitorexit ;
	//   12   20:monitorexit     
		return null;
	//   13   21:aconst_null     
	//   14   22:areturn         
		DiskLruCache.access$200(DiskLruCache.this);
	//   15   23:aload_0         
	//   16   24:getfield        #15  <Field DiskLruCache this$0>
	//   17   27:invokestatic    #34  <Method void DiskLruCache.access$200(DiskLruCache)>
		if(DiskLruCache.access$300(DiskLruCache.this))
	//*  18   30:aload_0         
	//*  19   31:getfield        #15  <Field DiskLruCache this$0>
	//*  20   34:invokestatic    #38  <Method boolean DiskLruCache.access$300(DiskLruCache)>
	//*  21   37:ifeq            56
		{
			DiskLruCache.access$400(DiskLruCache.this);
	//   22   40:aload_0         
	//   23   41:getfield        #15  <Field DiskLruCache this$0>
	//   24   44:invokestatic    #41  <Method void DiskLruCache.access$400(DiskLruCache)>
			DiskLruCache.access$502(DiskLruCache.this, 0);
	//   25   47:aload_0         
	//   26   48:getfield        #15  <Field DiskLruCache this$0>
	//   27   51:iconst_0        
	//   28   52:invokestatic    #45  <Method int DiskLruCache.access$502(DiskLruCache, int)>
	//   29   55:pop             
		}
		disklrucache;
	//   30   56:aload_1         
		JVM INSTR monitorexit ;
	//   31   57:monitorexit     
		  goto _L1
	//*  32   58:goto            66
		Exception exception;
		exception;
	//   33   61:astore_2        
	//*  34   62:aload_1         
		throw exception;
	//   35   63:monitorexit     
	//   36   64:aload_2         
	//   37   65:athrow          
_L1:
		return null;
	//   38   66:aconst_null     
	//   39   67:areturn         
	}

	final DiskLruCache this$0;

	DiskLruCache$1()
	{
		this$0 = DiskLruCache.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field DiskLruCache this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
