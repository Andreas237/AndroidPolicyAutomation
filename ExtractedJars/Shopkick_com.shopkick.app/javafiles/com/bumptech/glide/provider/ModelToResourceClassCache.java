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

	public void clear()
	{
		synchronized(registeredResourceClassCache)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field ArrayMap registeredResourceClassCache>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			registeredResourceClassCache.clear();
	//    5    7:aload_0         
	//    6    8:getfield        #24  <Field ArrayMap registeredResourceClassCache>
	//    7   11:invokevirtual   #28  <Method void ArrayMap.clear()>
		}
	//    8   14:aload_1         
	//    9   15:monitorexit     
		return;
	//   10   16:return          
		exception;
	//   11   17:astore_2        
		arraymap;
	//   12   18:aload_1         
		JVM INSTR monitorexit ;
	//   13   19:monitorexit     
		throw exception;
	//   14   20:aload_2         
	//   15   21:athrow          
	}

	public List get(Class class1, Class class2)
	{
		Object obj = ((Object) ((MultiClassKey)resourceClassKeyRef.getAndSet(((Object) (null)))));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field AtomicReference resourceClassKeyRef>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #36  <Method Object AtomicReference.getAndSet(Object)>
	//    4    8:checkcast       #38  <Class MultiClassKey>
	//    5   11:astore_3        
		if(obj == null)
	//*   6   12:aload_3         
	//*   7   13:ifnonnull       29
		{
			class1 = ((Class) (new MultiClassKey(class1, class2)));
	//    8   16:new             #38  <Class MultiClassKey>
	//    9   19:dup             
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:invokespecial   #41  <Method void MultiClassKey(Class, Class)>
	//   13   25:astore_1        
		} else
	//*  14   26:goto            37
		{
			((MultiClassKey) (obj)).set(class1, class2);
	//   15   29:aload_3         
	//   16   30:aload_1         
	//   17   31:aload_2         
	//   18   32:invokevirtual   #44  <Method void MultiClassKey.set(Class, Class)>
			class1 = ((Class) (obj));
	//   19   35:aload_3         
	//   20   36:astore_1        
		}
		synchronized(registeredResourceClassCache)
	//*  21   37:aload_0         
	//*  22   38:getfield        #24  <Field ArrayMap registeredResourceClassCache>
	//*  23   41:astore_2        
	//*  24   42:aload_2         
	//*  25   43:monitorenter    
		{
			obj = ((Object) ((List)registeredResourceClassCache.get(((Object) (class1)))));
	//   26   44:aload_0         
	//   27   45:getfield        #24  <Field ArrayMap registeredResourceClassCache>
	//   28   48:aload_1         
	//   29   49:invokevirtual   #46  <Method Object ArrayMap.get(Object)>
	//   30   52:checkcast       #48  <Class List>
	//   31   55:astore_3        
		}
	//   32   56:aload_2         
	//   33   57:monitorexit     
		resourceClassKeyRef.set(((Object) (class1)));
	//   34   58:aload_0         
	//   35   59:getfield        #19  <Field AtomicReference resourceClassKeyRef>
	//   36   62:aload_1         
	//   37   63:invokevirtual   #51  <Method void AtomicReference.set(Object)>
		return ((List) (obj));
	//   38   66:aload_3         
	//   39   67:areturn         
		class1;
	//   40   68:astore_1        
		class2;
	//   41   69:aload_2         
		JVM INSTR monitorexit ;
	//   42   70:monitorexit     
		throw class1;
	//   43   71:aload_1         
	//   44   72:athrow          
	}

	public void put(Class class1, Class class2, List list)
	{
		synchronized(registeredResourceClassCache)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field ArrayMap registeredResourceClassCache>
	//*   2    4:astore          4
	//*   3    6:aload           4
	//*   4    8:monitorenter    
		{
			registeredResourceClassCache.put(((Object) (new MultiClassKey(class1, class2))), ((Object) (list)));
	//    5    9:aload_0         
	//    6   10:getfield        #24  <Field ArrayMap registeredResourceClassCache>
	//    7   13:new             #38  <Class MultiClassKey>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:invokespecial   #41  <Method void MultiClassKey(Class, Class)>
	//   12   22:aload_3         
	//   13   23:invokevirtual   #60  <Method Object ArrayMap.put(Object, Object)>
	//   14   26:pop             
		}
	//   15   27:aload           4
	//   16   29:monitorexit     
		return;
	//   17   30:return          
		class1;
	//   18   31:astore_1        
		arraymap;
	//   19   32:aload           4
		JVM INSTR monitorexit ;
	//   20   34:monitorexit     
		throw class1;
	//   21   35:aload_1         
	//   22   36:athrow          
	}

	private final ArrayMap registeredResourceClassCache = new ArrayMap();
	private final AtomicReference resourceClassKeyRef = new AtomicReference();
}
