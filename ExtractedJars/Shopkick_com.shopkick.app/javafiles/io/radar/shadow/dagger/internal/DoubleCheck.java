// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.shadow.dagger.internal;

import io.radar.shadow.dagger.Lazy;
import io.radar.shadow.javax.inject.Provider;

// Referenced classes of package io.radar.shadow.dagger.internal:
//			Preconditions, MemoizedSentinel

public final class DoubleCheck
	implements Provider, Lazy
{

	private DoubleCheck(Provider provider1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		instance = UNINITIALIZED;
	//    2    4:aload_0         
	//    3    5:getstatic       #25  <Field Object UNINITIALIZED>
	//    4    8:putfield        #29  <Field Object instance>
		provider = provider1;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #31  <Field Provider provider>
	//    8   16:return          
	}

	public static Lazy lazy(Provider provider1)
	{
		if(provider1 instanceof Lazy)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #9   <Class Lazy>
	//*   2    4:ifeq            12
			return (Lazy)provider1;
	//    3    7:aload_0         
	//    4    8:checkcast       #9   <Class Lazy>
	//    5   11:areturn         
		else
			return ((Lazy) (new DoubleCheck((Provider)Preconditions.checkNotNull(((Object) (provider1))))));
	//    6   12:new             #2   <Class DoubleCheck>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:invokestatic    #41  <Method Object Preconditions.checkNotNull(Object)>
	//   10   20:checkcast       #7   <Class Provider>
	//   11   23:invokespecial   #43  <Method void DoubleCheck(Provider)>
	//   12   26:areturn         
	}

	public static Provider provider(Provider provider1)
	{
		Preconditions.checkNotNull(((Object) (provider1)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #41  <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
		if(provider1 instanceof DoubleCheck)
	//*   3    5:aload_0         
	//*   4    6:instanceof      #2   <Class DoubleCheck>
	//*   5    9:ifeq            14
			return provider1;
	//    6   12:aload_0         
	//    7   13:areturn         
		else
			return ((Provider) (new DoubleCheck(provider1)));
	//    8   14:new             #2   <Class DoubleCheck>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:invokespecial   #43  <Method void DoubleCheck(Provider)>
	//   12   22:areturn         
	}

	public static Object reentrantCheck(Object obj, Object obj1)
	{
		boolean flag;
		if(obj != UNINITIALIZED && !(obj instanceof MemoizedSentinel))
	//*   0    0:aload_0         
	//*   1    1:getstatic       #25  <Field Object UNINITIALIZED>
	//*   2    4:if_acmpeq       19
	//*   3    7:aload_0         
	//*   4    8:instanceof      #50  <Class MemoizedSentinel>
	//*   5   11:ifne            19
			flag = true;
	//    6   14:iconst_1        
	//    7   15:istore_2        
		else
	//*   8   16:goto            21
			flag = false;
	//    9   19:iconst_0        
	//   10   20:istore_2        
		if(flag)
	//*  11   21:iload_2         
	//*  12   22:ifeq            85
		{
			if(obj == obj1)
	//*  13   25:aload_0         
	//*  14   26:aload_1         
	//*  15   27:if_acmpne       32
			{
				return obj1;
	//   16   30:aload_1         
	//   17   31:areturn         
			} else
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   18   32:new             #52  <Class StringBuilder>
	//   19   35:dup             
	//   20   36:invokespecial   #53  <Method void StringBuilder()>
	//   21   39:astore_3        
				stringbuilder.append("Scoped provider was invoked recursively returning different results: ");
	//   22   40:aload_3         
	//   23   41:ldc1            #55  <String "Scoped provider was invoked recursively returning different results: ">
	//   24   43:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
				stringbuilder.append(obj);
	//   26   47:aload_3         
	//   27   48:aload_0         
	//   28   49:invokevirtual   #62  <Method StringBuilder StringBuilder.append(Object)>
	//   29   52:pop             
				stringbuilder.append(" & ");
	//   30   53:aload_3         
	//   31   54:ldc1            #64  <String " & ">
	//   32   56:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   33   59:pop             
				stringbuilder.append(obj1);
	//   34   60:aload_3         
	//   35   61:aload_1         
	//   36   62:invokevirtual   #62  <Method StringBuilder StringBuilder.append(Object)>
	//   37   65:pop             
				stringbuilder.append(". This is likely due to a circular dependency.");
	//   38   66:aload_3         
	//   39   67:ldc1            #66  <String ". This is likely due to a circular dependency.">
	//   40   69:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   41   72:pop             
				throw new IllegalStateException(stringbuilder.toString());
	//   42   73:new             #68  <Class IllegalStateException>
	//   43   76:dup             
	//   44   77:aload_3         
	//   45   78:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   46   81:invokespecial   #75  <Method void IllegalStateException(String)>
	//   47   84:athrow          
			}
		} else
		{
			return obj1;
	//   48   85:aload_1         
	//   49   86:areturn         
		}
	}

	public Object get()
	{
		Object obj;
		obj = instance;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Object instance>
	//    2    4:astore_1        
		if(obj != UNINITIALIZED)
			break MISSING_BLOCK_LABEL_64;
	//    3    5:aload_1         
	//    4    6:getstatic       #25  <Field Object UNINITIALIZED>
	//    5    9:if_acmpne       64
		this;
	//    6   12:aload_0         
		JVM INSTR monitorenter ;
	//    7   13:monitorenter    
		Object obj1 = instance;
	//    8   14:aload_0         
	//    9   15:getfield        #29  <Field Object instance>
	//   10   18:astore_2        
		obj = obj1;
	//   11   19:aload_2         
	//   12   20:astore_1        
		if(obj1 == UNINITIALIZED)
	//*  13   21:aload_2         
	//*  14   22:getstatic       #25  <Field Object UNINITIALIZED>
	//*  15   25:if_acmpne       55
		{
			obj = provider.get();
	//   16   28:aload_0         
	//   17   29:getfield        #31  <Field Provider provider>
	//   18   32:invokeinterface #79  <Method Object Provider.get()>
	//   19   37:astore_1        
			instance = reentrantCheck(instance, obj);
	//   20   38:aload_0         
	//   21   39:aload_0         
	//   22   40:getfield        #29  <Field Object instance>
	//   23   43:aload_1         
	//   24   44:invokestatic    #81  <Method Object reentrantCheck(Object, Object)>
	//   25   47:putfield        #29  <Field Object instance>
			provider = null;
	//   26   50:aload_0         
	//   27   51:aconst_null     
	//   28   52:putfield        #31  <Field Provider provider>
		}
		this;
	//   29   55:aload_0         
		JVM INSTR monitorexit ;
	//   30   56:monitorexit     
		return obj;
	//   31   57:aload_1         
	//   32   58:areturn         
		obj;
	//   33   59:astore_1        
		this;
	//   34   60:aload_0         
		JVM INSTR monitorexit ;
	//   35   61:monitorexit     
		throw obj;
	//   36   62:aload_1         
	//   37   63:athrow          
		return obj;
	//   38   64:aload_1         
	//   39   65:areturn         
	}

	static final boolean $assertionsDisabled = false;
	private static final Object UNINITIALIZED = new Object();
	private volatile Object instance;
	private volatile Provider provider;

	static 
	{
	//    0    0:new             #5   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void Object()>
	//    3    7:putstatic       #25  <Field Object UNINITIALIZED>
	//*   4   10:return          
	}
}
