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
label0:
		{
			synchronized(DiskLruCache.this)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field DiskLruCache this$0>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
			{
				if(DiskLruCache.access$100(DiskLruCache.this) != null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #15  <Field DiskLruCache this$0>
	//    7   11:invokestatic    #31  <Method java.io.Writer DiskLruCache.access$100(DiskLruCache)>
	//    8   14:ifnonnull       21
			}
	//    9   17:aload_1         
	//   10   18:monitorexit     
			return null;
	//   11   19:aconst_null     
	//   12   20:areturn         
		}
		DiskLruCache.access$200(DiskLruCache.this);
	//   13   21:aload_0         
	//   14   22:getfield        #15  <Field DiskLruCache this$0>
	//   15   25:invokestatic    #34  <Method void DiskLruCache.access$200(DiskLruCache)>
		if(DiskLruCache.access$300(DiskLruCache.this))
	//*  16   28:aload_0         
	//*  17   29:getfield        #15  <Field DiskLruCache this$0>
	//*  18   32:invokestatic    #38  <Method boolean DiskLruCache.access$300(DiskLruCache)>
	//*  19   35:ifeq            54
		{
			DiskLruCache.access$400(DiskLruCache.this);
	//   20   38:aload_0         
	//   21   39:getfield        #15  <Field DiskLruCache this$0>
	//   22   42:invokestatic    #41  <Method void DiskLruCache.access$400(DiskLruCache)>
			DiskLruCache.access$502(DiskLruCache.this, 0);
	//   23   45:aload_0         
	//   24   46:getfield        #15  <Field DiskLruCache this$0>
	//   25   49:iconst_0        
	//   26   50:invokestatic    #45  <Method int DiskLruCache.access$502(DiskLruCache, int)>
	//   27   53:pop             
		}
		disklrucache;
	//   28   54:aload_1         
		JVM INSTR monitorexit ;
	//   29   55:monitorexit     
		return null;
	//   30   56:aconst_null     
	//   31   57:areturn         
		exception;
	//   32   58:astore_2        
		disklrucache;
	//   33   59:aload_1         
		JVM INSTR monitorexit ;
	//   34   60:monitorexit     
		throw exception;
	//   35   61:aload_2         
	//   36   62:athrow          
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
