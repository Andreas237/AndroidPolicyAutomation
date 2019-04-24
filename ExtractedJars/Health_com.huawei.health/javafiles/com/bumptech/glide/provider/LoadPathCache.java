// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.provider;

import android.support.v4.util.ArrayMap;
import com.bumptech.glide.load.engine.LoadPath;
import com.bumptech.glide.util.MultiClassKey;
import java.util.concurrent.atomic.AtomicReference;

public class LoadPathCache
{

	public LoadPathCache()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #16  <Class ArrayMap>
	//    4    8:dup             
	//    5    9:invokespecial   #17  <Method void ArrayMap()>
	//    6   12:putfield        #19  <Field ArrayMap cache>
	//    7   15:aload_0         
	//    8   16:new             #21  <Class AtomicReference>
	//    9   19:dup             
	//   10   20:invokespecial   #22  <Method void AtomicReference()>
	//   11   23:putfield        #24  <Field AtomicReference keyRef>
	//   12   26:return          
	}

	private MultiClassKey getKey(Class class1, Class class2, Class class3)
	{
		MultiClassKey multiclasskey1 = (MultiClassKey)keyRef.getAndSet(((Object) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field AtomicReference keyRef>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #31  <Method Object AtomicReference.getAndSet(Object)>
	//    4    8:checkcast       #33  <Class MultiClassKey>
	//    5   11:astore          5
		MultiClassKey multiclasskey = multiclasskey1;
	//    6   13:aload           5
	//    7   15:astore          4
		if(multiclasskey1 == null)
	//*   8   17:aload           5
	//*   9   19:ifnonnull       31
			multiclasskey = new MultiClassKey();
	//   10   22:new             #33  <Class MultiClassKey>
	//   11   25:dup             
	//   12   26:invokespecial   #34  <Method void MultiClassKey()>
	//   13   29:astore          4
		multiclasskey.set(class1, class2, class3);
	//   14   31:aload           4
	//   15   33:aload_1         
	//   16   34:aload_2         
	//   17   35:aload_3         
	//   18   36:invokevirtual   #38  <Method void MultiClassKey.set(Class, Class, Class)>
		return multiclasskey;
	//   19   39:aload           4
	//   20   41:areturn         
	}

	public boolean contains(Class class1, Class class2, Class class3)
	{
		class2 = ((Class) (getKey(class1, class2, class3)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #44  <Method MultiClassKey getKey(Class, Class, Class)>
	//    5    7:astore_2        
		class1 = ((Class) (cache));
	//    6    8:aload_0         
	//    7    9:getfield        #19  <Field ArrayMap cache>
	//    8   12:astore_1        
		class1;
	//    9   13:aload_1         
		JVM INSTR monitorenter ;
	//   10   14:monitorenter    
		boolean flag = cache.containsKey(((Object) (class2)));
	//   11   15:aload_0         
	//   12   16:getfield        #19  <Field ArrayMap cache>
	//   13   19:aload_2         
	//   14   20:invokevirtual   #48  <Method boolean ArrayMap.containsKey(Object)>
	//   15   23:istore          4
		class1;
	//   16   25:aload_1         
		JVM INSTR monitorexit ;
	//   17   26:monitorexit     
		  goto _L1
	//*  18   27:goto            35
		class2;
	//   19   30:astore_2        
	//*  20   31:aload_1         
		throw class2;
	//   21   32:monitorexit     
	//   22   33:aload_2         
	//   23   34:athrow          
_L1:
		keyRef.set(((Object) (class2)));
	//   24   35:aload_0         
	//   25   36:getfield        #24  <Field AtomicReference keyRef>
	//   26   39:aload_2         
	//   27   40:invokevirtual   #51  <Method void AtomicReference.set(Object)>
		return flag;
	//   28   43:iload           4
	//   29   45:ireturn         
	}

	public LoadPath get(Class class1, Class class2, Class class3)
	{
		class2 = ((Class) (getKey(class1, class2, class3)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #44  <Method MultiClassKey getKey(Class, Class, Class)>
	//    5    7:astore_2        
		class1 = ((Class) (cache));
	//    6    8:aload_0         
	//    7    9:getfield        #19  <Field ArrayMap cache>
	//    8   12:astore_1        
		class1;
	//    9   13:aload_1         
		JVM INSTR monitorenter ;
	//   10   14:monitorenter    
		class3 = ((Class) ((LoadPath)cache.get(((Object) (class2)))));
	//   11   15:aload_0         
	//   12   16:getfield        #19  <Field ArrayMap cache>
	//   13   19:aload_2         
	//   14   20:invokevirtual   #57  <Method Object ArrayMap.get(Object)>
	//   15   23:checkcast       #59  <Class LoadPath>
	//   16   26:astore_3        
		class1;
	//   17   27:aload_1         
		JVM INSTR monitorexit ;
	//   18   28:monitorexit     
		  goto _L1
	//*  19   29:goto            37
		class2;
	//   20   32:astore_2        
	//*  21   33:aload_1         
		throw class2;
	//   22   34:monitorexit     
	//   23   35:aload_2         
	//   24   36:athrow          
_L1:
		keyRef.set(((Object) (class2)));
	//   25   37:aload_0         
	//   26   38:getfield        #24  <Field AtomicReference keyRef>
	//   27   41:aload_2         
	//   28   42:invokevirtual   #51  <Method void AtomicReference.set(Object)>
		return ((LoadPath) (class3));
	//   29   45:aload_3         
	//   30   46:areturn         
	}

	public void put(Class class1, Class class2, Class class3, LoadPath loadpath)
	{
		ArrayMap arraymap = cache;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ArrayMap cache>
	//    2    4:astore          5
		arraymap;
	//    3    6:aload           5
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		cache.put(((Object) (new MultiClassKey(class1, class2, class3))), ((Object) (loadpath)));
	//    5    9:aload_0         
	//    6   10:getfield        #19  <Field ArrayMap cache>
	//    7   13:new             #33  <Class MultiClassKey>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:aload_3         
	//   12   20:invokespecial   #65  <Method void MultiClassKey(Class, Class, Class)>
	//   13   23:aload           4
	//   14   25:invokevirtual   #68  <Method Object ArrayMap.put(Object, Object)>
	//   15   28:pop             
		arraymap;
	//   16   29:aload           5
		JVM INSTR monitorexit ;
	//   17   31:monitorexit     
		return;
	//   18   32:return          
		class1;
	//   19   33:astore_1        
	//*  20   34:aload           5
		throw class1;
	//   21   36:monitorexit     
	//   22   37:aload_1         
	//   23   38:athrow          
	}

	private final ArrayMap cache = new ArrayMap();
	private final AtomicReference keyRef = new AtomicReference();
}
