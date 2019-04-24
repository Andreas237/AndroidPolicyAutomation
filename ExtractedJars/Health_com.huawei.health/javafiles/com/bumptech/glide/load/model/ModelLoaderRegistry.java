// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;

import java.util.*;

// Referenced classes of package com.bumptech.glide.load.model:
//			MultiModelLoaderFactory, ModelLoaderFactory, ModelLoader

public class ModelLoaderRegistry
{
	static class ModelLoaderCache
	{

		public void clear()
		{
			cachedModelLoaders.clear();
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field Map cachedModelLoaders>
		//    2    4:invokeinterface #28  <Method void Map.clear()>
		//    3    9:return          
		}

		public List get(Class class1)
		{
			class1 = ((Class) ((Entry)cachedModelLoaders.get(((Object) (class1)))));
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field Map cachedModelLoaders>
		//    2    4:aload_1         
		//    3    5:invokeinterface #33  <Method Object Map.get(Object)>
		//    4   10:checkcast       #9   <Class ModelLoaderRegistry$ModelLoaderCache$Entry>
		//    5   13:astore_1        
			if(class1 == null)
		//*   6   14:aload_1         
		//*   7   15:ifnonnull       20
				return null;
		//    8   18:aconst_null     
		//    9   19:areturn         
			else
				return ((Entry) (class1)).loaders;
		//   10   20:aload_1         
		//   11   21:getfield        #37  <Field List ModelLoaderRegistry$ModelLoaderCache$Entry.loaders>
		//   12   24:areturn         
		}

		public void put(Class class1, List list)
		{
			if((Entry)cachedModelLoaders.put(((Object) (class1)), ((Object) (new Entry(list)))) != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #22  <Field Map cachedModelLoaders>
		//*   2    4:aload_1         
		//*   3    5:new             #9   <Class ModelLoaderRegistry$ModelLoaderCache$Entry>
		//*   4    8:dup             
		//*   5    9:aload_2         
		//*   6   10:invokespecial   #44  <Method void ModelLoaderRegistry$ModelLoaderCache$Entry(List)>
		//*   7   13:invokeinterface #47  <Method Object Map.put(Object, Object)>
		//*   8   18:checkcast       #9   <Class ModelLoaderRegistry$ModelLoaderCache$Entry>
		//*   9   21:ifnull          51
				throw new IllegalStateException((new StringBuilder()).append("Already cached loaders for model: ").append(((Object) (class1))).toString());
		//   10   24:new             #49  <Class IllegalStateException>
		//   11   27:dup             
		//   12   28:new             #51  <Class StringBuilder>
		//   13   31:dup             
		//   14   32:invokespecial   #52  <Method void StringBuilder()>
		//   15   35:ldc1            #54  <String "Already cached loaders for model: ">
		//   16   37:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
		//   17   40:aload_1         
		//   18   41:invokevirtual   #61  <Method StringBuilder StringBuilder.append(Object)>
		//   19   44:invokevirtual   #65  <Method String StringBuilder.toString()>
		//   20   47:invokespecial   #68  <Method void IllegalStateException(String)>
		//   21   50:athrow          
			else
				return;
		//   22   51:return          
		}

		private final Map cachedModelLoaders = new HashMap();

		ModelLoaderCache()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #19  <Class HashMap>
		//    4    8:dup             
		//    5    9:invokespecial   #20  <Method void HashMap()>
		//    6   12:putfield        #22  <Field Map cachedModelLoaders>
		//    7   15:return          
		}
	}

	static class ModelLoaderCache.Entry
	{

		final List loaders;

		public ModelLoaderCache.Entry(List list)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			loaders = list;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #21  <Field List loaders>
		//    5    9:return          
		}
	}


	public ModelLoaderRegistry(android.support.v4.util.Pools.Pool pool)
	{
		this(new MultiModelLoaderFactory(pool));
	//    0    0:aload_0         
	//    1    1:new             #18  <Class MultiModelLoaderFactory>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #20  <Method void MultiModelLoaderFactory(android.support.v4.util.Pools$Pool)>
	//    5    9:invokespecial   #23  <Method void ModelLoaderRegistry(MultiModelLoaderFactory)>
	//    6   12:return          
	}

	ModelLoaderRegistry(MultiModelLoaderFactory multimodelloaderfactory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		cache = new ModelLoaderCache();
	//    2    4:aload_0         
	//    3    5:new             #6   <Class ModelLoaderRegistry$ModelLoaderCache>
	//    4    8:dup             
	//    5    9:invokespecial   #30  <Method void ModelLoaderRegistry$ModelLoaderCache()>
	//    6   12:putfield        #32  <Field ModelLoaderRegistry$ModelLoaderCache cache>
		multiModelLoaderFactory = multimodelloaderfactory;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #34  <Field MultiModelLoaderFactory multiModelLoaderFactory>
	//   10   20:return          
	}

	private static Class getClass(Object obj)
	{
		return obj.getClass();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #39  <Method Class Object.getClass()>
	//    2    4:areturn         
	}

	private List getModelLoadersForClass(Class class1)
	{
		List list1 = cache.get(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field ModelLoaderRegistry$ModelLoaderCache cache>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #45  <Method List ModelLoaderRegistry$ModelLoaderCache.get(Class)>
	//    4    8:astore_3        
		List list = list1;
	//    5    9:aload_3         
	//    6   10:astore_2        
		if(list1 == null)
	//*   7   11:aload_3         
	//*   8   12:ifnonnull       36
		{
			list = Collections.unmodifiableList(multiModelLoaderFactory.build(class1));
	//    9   15:aload_0         
	//   10   16:getfield        #34  <Field MultiModelLoaderFactory multiModelLoaderFactory>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #48  <Method List MultiModelLoaderFactory.build(Class)>
	//   13   23:invokestatic    #54  <Method List Collections.unmodifiableList(List)>
	//   14   26:astore_2        
			cache.put(class1, list);
	//   15   27:aload_0         
	//   16   28:getfield        #32  <Field ModelLoaderRegistry$ModelLoaderCache cache>
	//   17   31:aload_1         
	//   18   32:aload_2         
	//   19   33:invokevirtual   #58  <Method void ModelLoaderRegistry$ModelLoaderCache.put(Class, List)>
		}
		return list;
	//   20   36:aload_2         
	//   21   37:areturn         
	}

	private void tearDown(List list)
	{
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); ((ModelLoaderFactory)((Iterator) (list)).next()).teardown());
	//    0    0:aload_1         
	//    1    1:invokeinterface #67  <Method Iterator List.iterator()>
	//    2    6:astore_1        
	//    3    7:aload_1         
	//    4    8:invokeinterface #73  <Method boolean Iterator.hasNext()>
	//    5   13:ifeq            33
	//    6   16:aload_1         
	//    7   17:invokeinterface #77  <Method Object Iterator.next()>
	//    8   22:checkcast       #79  <Class ModelLoaderFactory>
	//    9   25:invokeinterface #82  <Method void ModelLoaderFactory.teardown()>
	//*  10   30:goto            7
	//   11   33:return          
	}

	public void append(Class class1, Class class2, ModelLoaderFactory modelloaderfactory)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		multiModelLoaderFactory.append(class1, class2, modelloaderfactory);
	//    2    2:aload_0         
	//    3    3:getfield        #34  <Field MultiModelLoaderFactory multiModelLoaderFactory>
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:aload_3         
	//    7    9:invokevirtual   #87  <Method void MultiModelLoaderFactory.append(Class, Class, ModelLoaderFactory)>
		cache.clear();
	//    8   12:aload_0         
	//    9   13:getfield        #32  <Field ModelLoaderRegistry$ModelLoaderCache cache>
	//   10   16:invokevirtual   #90  <Method void ModelLoaderRegistry$ModelLoaderCache.clear()>
		this;
	//   11   19:aload_0         
		JVM INSTR monitorexit ;
	//   12   20:monitorexit     
		return;
	//   13   21:return          
		class1;
	//   14   22:astore_1        
	//*  15   23:aload_0         
		throw class1;
	//   16   24:monitorexit     
	//   17   25:aload_1         
	//   18   26:athrow          
	}

	public ModelLoader build(Class class1, Class class2)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		class1 = ((Class) (multiModelLoaderFactory.build(class1, class2)));
	//    2    2:aload_0         
	//    3    3:getfield        #34  <Field MultiModelLoaderFactory multiModelLoaderFactory>
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #94  <Method ModelLoader MultiModelLoaderFactory.build(Class, Class)>
	//    7   11:astore_1        
		this;
	//    8   12:aload_0         
		JVM INSTR monitorexit ;
	//    9   13:monitorexit     
		return ((ModelLoader) (class1));
	//   10   14:aload_1         
	//   11   15:areturn         
		class1;
	//   12   16:astore_1        
	//*  13   17:aload_0         
		throw class1;
	//   14   18:monitorexit     
	//   15   19:aload_1         
	//   16   20:athrow          
	}

	public List getDataClasses(Class class1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		class1 = ((Class) (multiModelLoaderFactory.getDataClasses(class1)));
	//    2    2:aload_0         
	//    3    3:getfield        #34  <Field MultiModelLoaderFactory multiModelLoaderFactory>
	//    4    6:aload_1         
	//    5    7:invokevirtual   #98  <Method List MultiModelLoaderFactory.getDataClasses(Class)>
	//    6   10:astore_1        
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return ((List) (class1));
	//    9   13:aload_1         
	//   10   14:areturn         
		class1;
	//   11   15:astore_1        
	//*  12   16:aload_0         
		throw class1;
	//   13   17:monitorexit     
	//   14   18:aload_1         
	//   15   19:athrow          
	}

	public List getModelLoaders(Object obj)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int j;
		List list;
		ArrayList arraylist;
		list = getModelLoadersForClass(getClass(obj));
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:invokestatic    #103 <Method Class getClass(Object)>
	//    5    7:invokespecial   #105 <Method List getModelLoadersForClass(Class)>
	//    6   10:astore          4
		j = list.size();
	//    7   12:aload           4
	//    8   14:invokeinterface #109 <Method int List.size()>
	//    9   19:istore_3        
		arraylist = new ArrayList(j);
	//   10   20:new             #111 <Class ArrayList>
	//   11   23:dup             
	//   12   24:iload_3         
	//   13   25:invokespecial   #114 <Method void ArrayList(int)>
	//   14   28:astore          5
		int i = 0;
	//   15   30:iconst_0        
	//   16   31:istore_2        
_L3:
		if(i >= j) goto _L2; else goto _L1
	//   17   32:iload_2         
	//   18   33:iload_3         
	//   19   34:icmpge          78
_L1:
		ModelLoader modelloader = (ModelLoader)list.get(i);
	//   20   37:aload           4
	//   21   39:iload_2         
	//   22   40:invokeinterface #117 <Method Object List.get(int)>
	//   23   45:checkcast       #119 <Class ModelLoader>
	//   24   48:astore          6
		if(modelloader.handles(obj))
	//*  25   50:aload           6
	//*  26   52:aload_1         
	//*  27   53:invokeinterface #123 <Method boolean ModelLoader.handles(Object)>
	//*  28   58:ifeq            71
			((List) (arraylist)).add(((Object) (modelloader)));
	//   29   61:aload           5
	//   30   63:aload           6
	//   31   65:invokeinterface #126 <Method boolean List.add(Object)>
	//   32   70:pop             
		i++;
	//   33   71:iload_2         
	//   34   72:iconst_1        
	//   35   73:iadd            
	//   36   74:istore_2        
		  goto _L3
	//*  37   75:goto            32
	//*  38   78:aload_0         
_L2:
		return ((List) (arraylist));
	//   39   79:monitorexit     
	//   40   80:aload           5
	//   41   82:areturn         
		obj;
	//   42   83:astore_1        
	//*  43   84:aload_0         
		throw obj;
	//   44   85:monitorexit     
	//   45   86:aload_1         
	//   46   87:athrow          
	}

	public void prepend(Class class1, Class class2, ModelLoaderFactory modelloaderfactory)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		multiModelLoaderFactory.prepend(class1, class2, modelloaderfactory);
	//    2    2:aload_0         
	//    3    3:getfield        #34  <Field MultiModelLoaderFactory multiModelLoaderFactory>
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:aload_3         
	//    7    9:invokevirtual   #130 <Method void MultiModelLoaderFactory.prepend(Class, Class, ModelLoaderFactory)>
		cache.clear();
	//    8   12:aload_0         
	//    9   13:getfield        #32  <Field ModelLoaderRegistry$ModelLoaderCache cache>
	//   10   16:invokevirtual   #90  <Method void ModelLoaderRegistry$ModelLoaderCache.clear()>
		this;
	//   11   19:aload_0         
		JVM INSTR monitorexit ;
	//   12   20:monitorexit     
		return;
	//   13   21:return          
		class1;
	//   14   22:astore_1        
	//*  15   23:aload_0         
		throw class1;
	//   16   24:monitorexit     
	//   17   25:aload_1         
	//   18   26:athrow          
	}

	public void remove(Class class1, Class class2)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		tearDown(multiModelLoaderFactory.remove(class1, class2));
	//    2    2:aload_0         
	//    3    3:aload_0         
	//    4    4:getfield        #34  <Field MultiModelLoaderFactory multiModelLoaderFactory>
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:invokevirtual   #135 <Method List MultiModelLoaderFactory.remove(Class, Class)>
	//    8   12:invokespecial   #137 <Method void tearDown(List)>
		cache.clear();
	//    9   15:aload_0         
	//   10   16:getfield        #32  <Field ModelLoaderRegistry$ModelLoaderCache cache>
	//   11   19:invokevirtual   #90  <Method void ModelLoaderRegistry$ModelLoaderCache.clear()>
		this;
	//   12   22:aload_0         
		JVM INSTR monitorexit ;
	//   13   23:monitorexit     
		return;
	//   14   24:return          
		class1;
	//   15   25:astore_1        
	//*  16   26:aload_0         
		throw class1;
	//   17   27:monitorexit     
	//   18   28:aload_1         
	//   19   29:athrow          
	}

	public void replace(Class class1, Class class2, ModelLoaderFactory modelloaderfactory)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		tearDown(multiModelLoaderFactory.replace(class1, class2, modelloaderfactory));
	//    2    2:aload_0         
	//    3    3:aload_0         
	//    4    4:getfield        #34  <Field MultiModelLoaderFactory multiModelLoaderFactory>
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:aload_3         
	//    8   10:invokevirtual   #142 <Method List MultiModelLoaderFactory.replace(Class, Class, ModelLoaderFactory)>
	//    9   13:invokespecial   #137 <Method void tearDown(List)>
		cache.clear();
	//   10   16:aload_0         
	//   11   17:getfield        #32  <Field ModelLoaderRegistry$ModelLoaderCache cache>
	//   12   20:invokevirtual   #90  <Method void ModelLoaderRegistry$ModelLoaderCache.clear()>
		this;
	//   13   23:aload_0         
		JVM INSTR monitorexit ;
	//   14   24:monitorexit     
		return;
	//   15   25:return          
		class1;
	//   16   26:astore_1        
	//*  17   27:aload_0         
		throw class1;
	//   18   28:monitorexit     
	//   19   29:aload_1         
	//   20   30:athrow          
	}

	private final ModelLoaderCache cache;
	private final MultiModelLoaderFactory multiModelLoaderFactory;
}
