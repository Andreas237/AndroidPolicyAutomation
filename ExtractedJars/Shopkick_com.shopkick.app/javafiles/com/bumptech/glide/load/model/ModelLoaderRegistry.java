// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;

import java.util.*;

// Referenced classes of package com.bumptech.glide.load.model:
//			MultiModelLoaderFactory, ModelLoaderFactory, ModelLoader

public class ModelLoaderRegistry
{
	private static class ModelLoaderCache
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
		//    3    5:invokeinterface #34  <Method Object Map.get(Object)>
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
		//   11   21:getfield        #38  <Field List ModelLoaderRegistry$ModelLoaderCache$Entry.loaders>
		//   12   24:areturn         
		}

		public void put(Class class1, List list)
		{
			if((Entry)cachedModelLoaders.put(((Object) (class1)), ((Object) (new Entry(list)))) == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #22  <Field Map cachedModelLoaders>
		//*   2    4:aload_1         
		//*   3    5:new             #9   <Class ModelLoaderRegistry$ModelLoaderCache$Entry>
		//*   4    8:dup             
		//*   5    9:aload_2         
		//*   6   10:invokespecial   #46  <Method void ModelLoaderRegistry$ModelLoaderCache$Entry(List)>
		//*   7   13:invokeinterface #49  <Method Object Map.put(Object, Object)>
		//*   8   18:checkcast       #9   <Class ModelLoaderRegistry$ModelLoaderCache$Entry>
		//*   9   21:ifnonnull       25
			{
				return;
		//   10   24:return          
			} else
			{
				list = ((List) (new StringBuilder()));
		//   11   25:new             #51  <Class StringBuilder>
		//   12   28:dup             
		//   13   29:invokespecial   #52  <Method void StringBuilder()>
		//   14   32:astore_2        
				((StringBuilder) (list)).append("Already cached loaders for model: ");
		//   15   33:aload_2         
		//   16   34:ldc1            #54  <String "Already cached loaders for model: ">
		//   17   36:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
		//   18   39:pop             
				((StringBuilder) (list)).append(((Object) (class1)));
		//   19   40:aload_2         
		//   20   41:aload_1         
		//   21   42:invokevirtual   #61  <Method StringBuilder StringBuilder.append(Object)>
		//   22   45:pop             
				throw new IllegalStateException(((StringBuilder) (list)).toString());
		//   23   46:new             #63  <Class IllegalStateException>
		//   24   49:dup             
		//   25   50:aload_2         
		//   26   51:invokevirtual   #67  <Method String StringBuilder.toString()>
		//   27   54:invokespecial   #70  <Method void IllegalStateException(String)>
		//   28   57:athrow          
			}
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

	private static class ModelLoaderCache.Entry
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
	//    1    1:new             #19  <Class MultiModelLoaderFactory>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #21  <Method void MultiModelLoaderFactory(android.support.v4.util.Pools$Pool)>
	//    5    9:invokespecial   #24  <Method void ModelLoaderRegistry(MultiModelLoaderFactory)>
	//    6   12:return          
	}

	private ModelLoaderRegistry(MultiModelLoaderFactory multimodelloaderfactory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		cache = new ModelLoaderCache();
	//    2    4:aload_0         
	//    3    5:new             #6   <Class ModelLoaderRegistry$ModelLoaderCache>
	//    4    8:dup             
	//    5    9:invokespecial   #32  <Method void ModelLoaderRegistry$ModelLoaderCache()>
	//    6   12:putfield        #34  <Field ModelLoaderRegistry$ModelLoaderCache cache>
		multiModelLoaderFactory = multimodelloaderfactory;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #36  <Field MultiModelLoaderFactory multiModelLoaderFactory>
	//   10   20:return          
	}

	private static Class getClass(Object obj)
	{
		return obj.getClass();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method Class Object.getClass()>
	//    2    4:areturn         
	}

	private List getModelLoadersForClass(Class class1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		List list1 = cache.get(class1);
	//    2    2:aload_0         
	//    3    3:getfield        #34  <Field ModelLoaderRegistry$ModelLoaderCache cache>
	//    4    6:aload_1         
	//    5    7:invokevirtual   #48  <Method List ModelLoaderRegistry$ModelLoaderCache.get(Class)>
	//    6   10:astore_3        
		List list;
		list = list1;
	//    7   11:aload_3         
	//    8   12:astore_2        
		if(list1 != null)
			break MISSING_BLOCK_LABEL_38;
	//    9   13:aload_3         
	//   10   14:ifnonnull       38
		list = Collections.unmodifiableList(multiModelLoaderFactory.build(class1));
	//   11   17:aload_0         
	//   12   18:getfield        #36  <Field MultiModelLoaderFactory multiModelLoaderFactory>
	//   13   21:aload_1         
	//   14   22:invokevirtual   #51  <Method List MultiModelLoaderFactory.build(Class)>
	//   15   25:invokestatic    #57  <Method List Collections.unmodifiableList(List)>
	//   16   28:astore_2        
		cache.put(class1, list);
	//   17   29:aload_0         
	//   18   30:getfield        #34  <Field ModelLoaderRegistry$ModelLoaderCache cache>
	//   19   33:aload_1         
	//   20   34:aload_2         
	//   21   35:invokevirtual   #61  <Method void ModelLoaderRegistry$ModelLoaderCache.put(Class, List)>
		this;
	//   22   38:aload_0         
		JVM INSTR monitorexit ;
	//   23   39:monitorexit     
		return list;
	//   24   40:aload_2         
	//   25   41:areturn         
		class1;
	//   26   42:astore_1        
	//*  27   43:aload_0         
		throw class1;
	//   28   44:monitorexit     
	//   29   45:aload_1         
	//   30   46:athrow          
	}

	private void tearDown(List list)
	{
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); ((ModelLoaderFactory)((Iterator) (list)).next()).teardown());
	//    0    0:aload_1         
	//    1    1:invokeinterface #70  <Method Iterator List.iterator()>
	//    2    6:astore_1        
	//    3    7:aload_1         
	//    4    8:invokeinterface #76  <Method boolean Iterator.hasNext()>
	//    5   13:ifeq            33
	//    6   16:aload_1         
	//    7   17:invokeinterface #80  <Method Object Iterator.next()>
	//    8   22:checkcast       #82  <Class ModelLoaderFactory>
	//    9   25:invokeinterface #85  <Method void ModelLoaderFactory.teardown()>
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
	//    3    3:getfield        #36  <Field MultiModelLoaderFactory multiModelLoaderFactory>
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:aload_3         
	//    7    9:invokevirtual   #90  <Method void MultiModelLoaderFactory.append(Class, Class, ModelLoaderFactory)>
		cache.clear();
	//    8   12:aload_0         
	//    9   13:getfield        #34  <Field ModelLoaderRegistry$ModelLoaderCache cache>
	//   10   16:invokevirtual   #93  <Method void ModelLoaderRegistry$ModelLoaderCache.clear()>
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
	//    3    3:getfield        #36  <Field MultiModelLoaderFactory multiModelLoaderFactory>
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #97  <Method ModelLoader MultiModelLoaderFactory.build(Class, Class)>
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
	//    3    3:getfield        #36  <Field MultiModelLoaderFactory multiModelLoaderFactory>
	//    4    6:aload_1         
	//    5    7:invokevirtual   #101 <Method List MultiModelLoaderFactory.getDataClasses(Class)>
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
		List list = getModelLoadersForClass(getClass(obj));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #106 <Method Class getClass(Object)>
	//    3    5:invokespecial   #108 <Method List getModelLoadersForClass(Class)>
	//    4    8:astore          8
		int j = list.size();
	//    5   10:aload           8
	//    6   12:invokeinterface #112 <Method int List.size()>
	//    7   17:istore          5
		Object obj1 = ((Object) (Collections.emptyList()));
	//    8   19:invokestatic    #116 <Method List Collections.emptyList()>
	//    9   22:astore          6
		boolean flag = true;
	//   10   24:iconst_1        
	//   11   25:istore_2        
		for(int i = 0; i < j;)
	//*  12   26:iconst_0        
	//*  13   27:istore          4
	//*  14   29:iload           4
	//*  15   31:iload           5
	//*  16   33:icmpge          118
		{
			ModelLoader modelloader = (ModelLoader)list.get(i);
	//   17   36:aload           8
	//   18   38:iload           4
	//   19   40:invokeinterface #119 <Method Object List.get(int)>
	//   20   45:checkcast       #121 <Class ModelLoader>
	//   21   48:astore          9
			Object obj2 = obj1;
	//   22   50:aload           6
	//   23   52:astore          7
			boolean flag1 = flag;
	//   24   54:iload_2         
	//   25   55:istore_3        
			if(modelloader.handles(obj))
	//*  26   56:aload           9
	//*  27   58:aload_1         
	//*  28   59:invokeinterface #125 <Method boolean ModelLoader.handles(Object)>
	//*  29   64:ifeq            103
			{
				flag1 = flag;
	//   30   67:iload_2         
	//   31   68:istore_3        
				if(flag)
	//*  32   69:iload_2         
	//*  33   70:ifeq            89
				{
					obj1 = ((Object) (new ArrayList(j - i)));
	//   34   73:new             #127 <Class ArrayList>
	//   35   76:dup             
	//   36   77:iload           5
	//   37   79:iload           4
	//   38   81:isub            
	//   39   82:invokespecial   #130 <Method void ArrayList(int)>
	//   40   85:astore          6
					flag1 = false;
	//   41   87:iconst_0        
	//   42   88:istore_3        
				}
				((List) (obj1)).add(((Object) (modelloader)));
	//   43   89:aload           6
	//   44   91:aload           9
	//   45   93:invokeinterface #133 <Method boolean List.add(Object)>
	//   46   98:pop             
				obj2 = obj1;
	//   47   99:aload           6
	//   48  101:astore          7
			}
			i++;
	//   49  103:iload           4
	//   50  105:iconst_1        
	//   51  106:iadd            
	//   52  107:istore          4
			obj1 = obj2;
	//   53  109:aload           7
	//   54  111:astore          6
			flag = flag1;
	//   55  113:iload_3         
	//   56  114:istore_2        
		}

	//*  57  115:goto            29
		return ((List) (obj1));
	//   58  118:aload           6
	//   59  120:areturn         
	}

	public void prepend(Class class1, Class class2, ModelLoaderFactory modelloaderfactory)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		multiModelLoaderFactory.prepend(class1, class2, modelloaderfactory);
	//    2    2:aload_0         
	//    3    3:getfield        #36  <Field MultiModelLoaderFactory multiModelLoaderFactory>
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:aload_3         
	//    7    9:invokevirtual   #137 <Method void MultiModelLoaderFactory.prepend(Class, Class, ModelLoaderFactory)>
		cache.clear();
	//    8   12:aload_0         
	//    9   13:getfield        #34  <Field ModelLoaderRegistry$ModelLoaderCache cache>
	//   10   16:invokevirtual   #93  <Method void ModelLoaderRegistry$ModelLoaderCache.clear()>
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
	//    4    4:getfield        #36  <Field MultiModelLoaderFactory multiModelLoaderFactory>
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:invokevirtual   #142 <Method List MultiModelLoaderFactory.remove(Class, Class)>
	//    8   12:invokespecial   #144 <Method void tearDown(List)>
		cache.clear();
	//    9   15:aload_0         
	//   10   16:getfield        #34  <Field ModelLoaderRegistry$ModelLoaderCache cache>
	//   11   19:invokevirtual   #93  <Method void ModelLoaderRegistry$ModelLoaderCache.clear()>
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
	//    4    4:getfield        #36  <Field MultiModelLoaderFactory multiModelLoaderFactory>
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:aload_3         
	//    8   10:invokevirtual   #149 <Method List MultiModelLoaderFactory.replace(Class, Class, ModelLoaderFactory)>
	//    9   13:invokespecial   #144 <Method void tearDown(List)>
		cache.clear();
	//   10   16:aload_0         
	//   11   17:getfield        #34  <Field ModelLoaderRegistry$ModelLoaderCache cache>
	//   12   20:invokevirtual   #93  <Method void ModelLoaderRegistry$ModelLoaderCache.clear()>
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
