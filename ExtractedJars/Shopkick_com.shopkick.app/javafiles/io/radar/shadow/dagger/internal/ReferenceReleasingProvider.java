// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.shadow.dagger.internal;

import io.radar.shadow.javax.inject.Provider;
import java.lang.ref.WeakReference;

// Referenced classes of package io.radar.shadow.dagger.internal:
//			Preconditions, ReferenceReleasingProviderManager

public final class ReferenceReleasingProvider
	implements Provider
{

	private ReferenceReleasingProvider(Provider provider1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		provider = provider1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #31  <Field Provider provider>
	//    5    9:return          
	}

	public static ReferenceReleasingProvider create(Provider provider1, ReferenceReleasingProviderManager referencereleasingprovidermanager)
	{
		provider1 = ((Provider) (new ReferenceReleasingProvider((Provider)Preconditions.checkNotNull(((Object) (provider1))))));
	//    0    0:new             #2   <Class ReferenceReleasingProvider>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokestatic    #41  <Method Object Preconditions.checkNotNull(Object)>
	//    4    8:checkcast       #7   <Class Provider>
	//    5   11:invokespecial   #43  <Method void ReferenceReleasingProvider(Provider)>
	//    6   14:astore_0        
		referencereleasingprovidermanager.addProvider(((ReferenceReleasingProvider) (provider1)));
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:invokevirtual   #49  <Method void ReferenceReleasingProviderManager.addProvider(ReferenceReleasingProvider)>
		return ((ReferenceReleasingProvider) (provider1));
	//   10   20:aload_0         
	//   11   21:areturn         
	}

	private Object currentValue()
	{
		Object obj = strongReference;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field Object strongReference>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
			return obj;
	//    5    9:aload_1         
	//    6   10:areturn         
		if(weakReference != null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #56  <Field WeakReference weakReference>
	//*   9   15:ifnull          26
			return weakReference.get();
	//   10   18:aload_0         
	//   11   19:getfield        #56  <Field WeakReference weakReference>
	//   12   22:invokevirtual   #61  <Method Object WeakReference.get()>
	//   13   25:areturn         
		else
			return ((Object) (null));
	//   14   26:aconst_null     
	//   15   27:areturn         
	}

	public Object get()
	{
		Object obj;
		Object obj1 = currentValue();
	//    0    0:aload_0         
	//    1    1:invokespecial   #63  <Method Object currentValue()>
	//    2    4:astore_2        
		obj = obj1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(obj1 != null)
			break MISSING_BLOCK_LABEL_59;
	//    5    7:aload_2         
	//    6    8:ifnonnull       59
		this;
	//    7   11:aload_0         
		JVM INSTR monitorenter ;
	//    8   12:monitorenter    
		Object obj2 = currentValue();
	//    9   13:aload_0         
	//   10   14:invokespecial   #63  <Method Object currentValue()>
	//   11   17:astore_2        
		obj = obj2;
	//   12   18:aload_2         
	//   13   19:astore_1        
		if(obj2 != null)
			break MISSING_BLOCK_LABEL_49;
	//   14   20:aload_2         
	//   15   21:ifnonnull       49
		obj2 = provider.get();
	//   16   24:aload_0         
	//   17   25:getfield        #31  <Field Provider provider>
	//   18   28:invokeinterface #64  <Method Object Provider.get()>
	//   19   33:astore_2        
		obj = obj2;
	//   20   34:aload_2         
	//   21   35:astore_1        
		if(obj2 != null)
			break MISSING_BLOCK_LABEL_44;
	//   22   36:aload_2         
	//   23   37:ifnonnull       44
		obj = NULL;
	//   24   40:getstatic       #27  <Field Object NULL>
	//   25   43:astore_1        
		strongReference = obj;
	//   26   44:aload_0         
	//   27   45:aload_1         
	//   28   46:putfield        #54  <Field Object strongReference>
		this;
	//   29   49:aload_0         
		JVM INSTR monitorexit ;
	//   30   50:monitorexit     
		break MISSING_BLOCK_LABEL_59;
	//   31   51:goto            59
		obj;
	//   32   54:astore_1        
		this;
	//   33   55:aload_0         
		JVM INSTR monitorexit ;
	//   34   56:monitorexit     
		throw obj;
	//   35   57:aload_1         
	//   36   58:athrow          
		Object obj3 = obj;
	//   37   59:aload_1         
	//   38   60:astore_2        
		if(obj == NULL)
	//*  39   61:aload_1         
	//*  40   62:getstatic       #27  <Field Object NULL>
	//*  41   65:if_acmpne       70
			obj3 = null;
	//   42   68:aconst_null     
	//   43   69:astore_2        
		return obj3;
	//   44   70:aload_2         
	//   45   71:areturn         
	}

	public void releaseStrongReference()
	{
		Object obj;
		obj = strongReference;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field Object strongReference>
	//    2    4:astore_1        
		if(obj == null || obj == NULL)
			break MISSING_BLOCK_LABEL_43;
	//    3    5:aload_1         
	//    4    6:ifnull          43
	//    5    9:aload_1         
	//    6   10:getstatic       #27  <Field Object NULL>
	//    7   13:if_acmpeq       43
		this;
	//    8   16:aload_0         
		JVM INSTR monitorenter ;
	//    9   17:monitorenter    
		weakReference = new WeakReference(obj);
	//   10   18:aload_0         
	//   11   19:new             #58  <Class WeakReference>
	//   12   22:dup             
	//   13   23:aload_1         
	//   14   24:invokespecial   #69  <Method void WeakReference(Object)>
	//   15   27:putfield        #56  <Field WeakReference weakReference>
		strongReference = null;
	//   16   30:aload_0         
	//   17   31:aconst_null     
	//   18   32:putfield        #54  <Field Object strongReference>
		this;
	//   19   35:aload_0         
		JVM INSTR monitorexit ;
	//   20   36:monitorexit     
		return;
	//   21   37:return          
		Exception exception;
		exception;
	//   22   38:astore_1        
		this;
	//   23   39:aload_0         
		JVM INSTR monitorexit ;
	//   24   40:monitorexit     
		throw exception;
	//   25   41:aload_1         
	//   26   42:athrow          
	//   27   43:return          
	}

	public void restoreStrongReference()
	{
		Object obj = strongReference;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field Object strongReference>
	//    2    4:astore_1        
		if(weakReference == null || obj != null)
			break MISSING_BLOCK_LABEL_64;
	//    3    5:aload_0         
	//    4    6:getfield        #56  <Field WeakReference weakReference>
	//    5    9:ifnull          64
	//    6   12:aload_1         
	//    7   13:ifnonnull       64
		this;
	//    8   16:aload_0         
		JVM INSTR monitorenter ;
	//    9   17:monitorenter    
		Object obj1 = strongReference;
	//   10   18:aload_0         
	//   11   19:getfield        #54  <Field Object strongReference>
	//   12   22:astore_1        
		if(weakReference == null || obj1 != null)
			break MISSING_BLOCK_LABEL_56;
	//   13   23:aload_0         
	//   14   24:getfield        #56  <Field WeakReference weakReference>
	//   15   27:ifnull          56
	//   16   30:aload_1         
	//   17   31:ifnonnull       56
		obj1 = weakReference.get();
	//   18   34:aload_0         
	//   19   35:getfield        #56  <Field WeakReference weakReference>
	//   20   38:invokevirtual   #61  <Method Object WeakReference.get()>
	//   21   41:astore_1        
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_56;
	//   22   42:aload_1         
	//   23   43:ifnull          56
		strongReference = obj1;
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:putfield        #54  <Field Object strongReference>
		weakReference = null;
	//   27   51:aload_0         
	//   28   52:aconst_null     
	//   29   53:putfield        #56  <Field WeakReference weakReference>
		this;
	//   30   56:aload_0         
		JVM INSTR monitorexit ;
	//   31   57:monitorexit     
		return;
	//   32   58:return          
		Exception exception;
		exception;
	//   33   59:astore_1        
		this;
	//   34   60:aload_0         
		JVM INSTR monitorexit ;
	//   35   61:monitorexit     
		throw exception;
	//   36   62:aload_1         
	//   37   63:athrow          
	//   38   64:return          
	}

	static final boolean $assertionsDisabled = false;
	private static final Object NULL = new Object();
	private final Provider provider;
	private volatile Object strongReference;
	private volatile WeakReference weakReference;

	static 
	{
	//    0    0:new             #5   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void Object()>
	//    3    7:putstatic       #27  <Field Object NULL>
	//*   4   10:return          
	}
}
