// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.provider;

import android.support.v4.util.ArrayMap;
import com.bumptech.glide.util.MultiClassKey;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class ModelToResourceClassCache
{

	public ModelToResourceClassCache()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #16  <Class AtomicReference>
	//    4    8:dup             
	//    5    9:invokespecial   #17  <Method void AtomicReference()>
	//    6   12:putfield        #19  <Field AtomicReference resourceClassKeyRef>
	//    7   15:aload_0         
	//    8   16:new             #21  <Class ArrayMap>
	//    9   19:dup             
	//   10   20:invokespecial   #22  <Method void ArrayMap()>
	//   11   23:putfield        #24  <Field ArrayMap registeredResourceClassCache>
	//   12   26:return          
	}

	public List get(Class class1, Class class2, Class class3)
	{
		MultiClassKey multiclasskey = (MultiClassKey)resourceClassKeyRef.getAndSet(((Object) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field AtomicReference resourceClassKeyRef>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #33  <Method Object AtomicReference.getAndSet(Object)>
	//    4    8:checkcast       #35  <Class MultiClassKey>
	//    5   11:astore          4
		if(multiclasskey == null)
	//*   6   13:aload           4
	//*   7   15:ifnonnull       32
		{
			class1 = ((Class) (new MultiClassKey(class1, class2, class3)));
	//    8   18:new             #35  <Class MultiClassKey>
	//    9   21:dup             
	//   10   22:aload_1         
	//   11   23:aload_2         
	//   12   24:aload_3         
	//   13   25:invokespecial   #38  <Method void MultiClassKey(Class, Class, Class)>
	//   14   28:astore_1        
		} else
	//*  15   29:goto            43
		{
			multiclasskey.set(class1, class2, class3);
	//   16   32:aload           4
	//   17   34:aload_1         
	//   18   35:aload_2         
	//   19   36:aload_3         
	//   20   37:invokevirtual   #41  <Method void MultiClassKey.set(Class, Class, Class)>
			class1 = ((Class) (multiclasskey));
	//   21   40:aload           4
	//   22   42:astore_1        
		}
		synchronized(registeredResourceClassCache)
	//*  23   43:aload_0         
	//*  24   44:getfield        #24  <Field ArrayMap registeredResourceClassCache>
	//*  25   47:astore_2        
	//*  26   48:aload_2         
	//*  27   49:monitorenter    
		{
			class3 = ((Class) ((List)registeredResourceClassCache.get(((Object) (class1)))));
	//   28   50:aload_0         
	//   29   51:getfield        #24  <Field ArrayMap registeredResourceClassCache>
	//   30   54:aload_1         
	//   31   55:invokevirtual   #43  <Method Object ArrayMap.get(Object)>
	//   32   58:checkcast       #45  <Class List>
	//   33   61:astore_3        
		}
	//   34   62:aload_2         
	//   35   63:monitorexit     
		resourceClassKeyRef.set(((Object) (class1)));
	//   36   64:aload_0         
	//   37   65:getfield        #19  <Field AtomicReference resourceClassKeyRef>
	//   38   68:aload_1         
	//   39   69:invokevirtual   #48  <Method void AtomicReference.set(Object)>
		return ((List) (class3));
	//   40   72:aload_3         
	//   41   73:areturn         
		class1;
	//   42   74:astore_1        
		class2;
	//   43   75:aload_2         
		JVM INSTR monitorexit ;
	//   44   76:monitorexit     
		throw class1;
	//   45   77:aload_1         
	//   46   78:athrow          
	}

	public void put(Class class1, Class class2, Class class3, List list)
	{
		synchronized(registeredResourceClassCache)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field ArrayMap registeredResourceClassCache>
	//*   2    4:astore          5
	//*   3    6:aload           5
	//*   4    8:monitorenter    
		{
			registeredResourceClassCache.put(((Object) (new MultiClassKey(class1, class2, class3))), ((Object) (list)));
	//    5    9:aload_0         
	//    6   10:getfield        #24  <Field ArrayMap registeredResourceClassCache>
	//    7   13:new             #35  <Class MultiClassKey>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:aload_3         
	//   12   20:invokespecial   #38  <Method void MultiClassKey(Class, Class, Class)>
	//   13   23:aload           4
	//   14   25:invokevirtual   #57  <Method Object ArrayMap.put(Object, Object)>
	//   15   28:pop             
		}
	//   16   29:aload           5
	//   17   31:monitorexit     
		return;
	//   18   32:return          
		class1;
	//   19   33:astore_1        
		arraymap;
	//   20   34:aload           5
		JVM INSTR monitorexit ;
	//   21   36:monitorexit     
		throw class1;
	//   22   37:aload_1         
	//   23   38:athrow          
	}

	private final ArrayMap registeredResourceClassCache = new ArrayMap();
	private final AtomicReference resourceClassKeyRef = new AtomicReference();
}
