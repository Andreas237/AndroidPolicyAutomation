// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.provider;

import android.support.v4.util.ArrayMap;
import com.bumptech.glide.load.engine.DecodePath;
import com.bumptech.glide.load.engine.LoadPath;
import com.bumptech.glide.load.resource.transcode.UnitTranscoder;
import com.bumptech.glide.util.MultiClassKey;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

public class LoadPathCache
{

	public LoadPathCache()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #46  <Class ArrayMap>
	//    4    8:dup             
	//    5    9:invokespecial   #47  <Method void ArrayMap()>
	//    6   12:putfield        #49  <Field ArrayMap cache>
	//    7   15:aload_0         
	//    8   16:new             #51  <Class AtomicReference>
	//    9   19:dup             
	//   10   20:invokespecial   #52  <Method void AtomicReference()>
	//   11   23:putfield        #54  <Field AtomicReference keyRef>
	//   12   26:return          
	}

	private MultiClassKey getKey(Class class1, Class class2, Class class3)
	{
		MultiClassKey multiclasskey1 = (MultiClassKey)keyRef.getAndSet(((Object) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field AtomicReference keyRef>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #60  <Method Object AtomicReference.getAndSet(Object)>
	//    4    8:checkcast       #62  <Class MultiClassKey>
	//    5   11:astore          5
		MultiClassKey multiclasskey = multiclasskey1;
	//    6   13:aload           5
	//    7   15:astore          4
		if(multiclasskey1 == null)
	//*   8   17:aload           5
	//*   9   19:ifnonnull       31
			multiclasskey = new MultiClassKey();
	//   10   22:new             #62  <Class MultiClassKey>
	//   11   25:dup             
	//   12   26:invokespecial   #63  <Method void MultiClassKey()>
	//   13   29:astore          4
		multiclasskey.set(class1, class2, class3);
	//   14   31:aload           4
	//   15   33:aload_1         
	//   16   34:aload_2         
	//   17   35:aload_3         
	//   18   36:invokevirtual   #67  <Method void MultiClassKey.set(Class, Class, Class)>
		return multiclasskey;
	//   19   39:aload           4
	//   20   41:areturn         
	}

	public LoadPath get(Class class1, Class class2, Class class3)
	{
		class2 = ((Class) (getKey(class1, class2, class3)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #74  <Method MultiClassKey getKey(Class, Class, Class)>
	//    5    7:astore_2        
		synchronized(cache)
	//*   6    8:aload_0         
	//*   7    9:getfield        #49  <Field ArrayMap cache>
	//*   8   12:astore_1        
	//*   9   13:aload_1         
	//*  10   14:monitorenter    
		{
			class3 = ((Class) ((LoadPath)cache.get(((Object) (class2)))));
	//   11   15:aload_0         
	//   12   16:getfield        #49  <Field ArrayMap cache>
	//   13   19:aload_2         
	//   14   20:invokevirtual   #76  <Method Object ArrayMap.get(Object)>
	//   15   23:checkcast       #17  <Class LoadPath>
	//   16   26:astore_3        
		}
	//   17   27:aload_1         
	//   18   28:monitorexit     
		keyRef.set(((Object) (class2)));
	//   19   29:aload_0         
	//   20   30:getfield        #54  <Field AtomicReference keyRef>
	//   21   33:aload_2         
	//   22   34:invokevirtual   #79  <Method void AtomicReference.set(Object)>
		return ((LoadPath) (class3));
	//   23   37:aload_3         
	//   24   38:areturn         
		class2;
	//   25   39:astore_2        
		class1;
	//   26   40:aload_1         
		JVM INSTR monitorexit ;
	//   27   41:monitorexit     
		throw class2;
	//   28   42:aload_2         
	//   29   43:athrow          
	}

	public boolean isEmptyLoadPath(LoadPath loadpath)
	{
		return ((Object) (NO_PATHS_SIGNAL)).equals(((Object) (loadpath)));
	//    0    0:getstatic       #42  <Field LoadPath NO_PATHS_SIGNAL>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #87  <Method boolean Object.equals(Object)>
	//    3    7:ireturn         
	}

	public void put(Class class1, Class class2, Class class3, LoadPath loadpath)
	{
		ArrayMap arraymap = cache;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field ArrayMap cache>
	//    2    4:astore          5
		arraymap;
	//    3    6:aload           5
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		ArrayMap arraymap1;
		arraymap1 = cache;
	//    5    9:aload_0         
	//    6   10:getfield        #49  <Field ArrayMap cache>
	//    7   13:astore          6
		class1 = ((Class) (new MultiClassKey(class1, class2, class3)));
	//    8   15:new             #62  <Class MultiClassKey>
	//    9   18:dup             
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:aload_3         
	//   13   22:invokespecial   #93  <Method void MultiClassKey(Class, Class, Class)>
	//   14   25:astore_1        
		if(loadpath != null)
	//*  15   26:aload           4
	//*  16   28:ifnull          34
			break MISSING_BLOCK_LABEL_39;
	//   17   31:goto            39
		loadpath = NO_PATHS_SIGNAL;
	//   18   34:getstatic       #42  <Field LoadPath NO_PATHS_SIGNAL>
	//   19   37:astore          4
		arraymap1.put(((Object) (class1)), ((Object) (loadpath)));
	//   20   39:aload           6
	//   21   41:aload_1         
	//   22   42:aload           4
	//   23   44:invokevirtual   #96  <Method Object ArrayMap.put(Object, Object)>
	//   24   47:pop             
		arraymap;
	//   25   48:aload           5
		JVM INSTR monitorexit ;
	//   26   50:monitorexit     
		return;
	//   27   51:return          
		class1;
	//   28   52:astore_1        
		arraymap;
	//   29   53:aload           5
		JVM INSTR monitorexit ;
	//   30   55:monitorexit     
		throw class1;
	//   31   56:aload_1         
	//   32   57:athrow          
	}

	private static final LoadPath NO_PATHS_SIGNAL = new LoadPath(java/lang/Object, java/lang/Object, java/lang/Object, Collections.singletonList(((Object) (new DecodePath(java/lang/Object, java/lang/Object, java/lang/Object, Collections.emptyList(), ((com.bumptech.glide.load.resource.transcode.ResourceTranscoder) (new UnitTranscoder())), ((android.support.v4.util.Pools.Pool) (null)))))), ((android.support.v4.util.Pools.Pool) (null)));
	private final ArrayMap cache = new ArrayMap();
	private final AtomicReference keyRef = new AtomicReference();

	static 
	{
	//    0    0:new             #17  <Class LoadPath>
	//    1    3:dup             
	//    2    4:ldc1            #4   <Class Object>
	//    3    6:ldc1            #4   <Class Object>
	//    4    8:ldc1            #4   <Class Object>
	//    5   10:new             #19  <Class DecodePath>
	//    6   13:dup             
	//    7   14:ldc1            #4   <Class Object>
	//    8   16:ldc1            #4   <Class Object>
	//    9   18:ldc1            #4   <Class Object>
	//   10   20:invokestatic    #25  <Method java.util.List Collections.emptyList()>
	//   11   23:new             #27  <Class UnitTranscoder>
	//   12   26:dup             
	//   13   27:invokespecial   #30  <Method void UnitTranscoder()>
	//   14   30:aconst_null     
	//   15   31:invokespecial   #33  <Method void DecodePath(Class, Class, Class, java.util.List, com.bumptech.glide.load.resource.transcode.ResourceTranscoder, android.support.v4.util.Pools$Pool)>
	//   16   34:invokestatic    #37  <Method java.util.List Collections.singletonList(Object)>
	//   17   37:aconst_null     
	//   18   38:invokespecial   #40  <Method void LoadPath(Class, Class, Class, java.util.List, android.support.v4.util.Pools$Pool)>
	//   19   41:putstatic       #42  <Field LoadPath NO_PATHS_SIGNAL>
	//*  20   44:return          
	}
}
