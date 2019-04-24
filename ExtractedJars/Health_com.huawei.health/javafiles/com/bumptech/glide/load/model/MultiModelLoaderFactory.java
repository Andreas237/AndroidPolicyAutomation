// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;

import com.bumptech.glide.load.Options;
import com.bumptech.glide.util.Preconditions;
import java.util.*;

// Referenced classes of package com.bumptech.glide.load.model:
//			ModelLoaderFactory, ModelLoader, MultiModelLoader

public class MultiModelLoaderFactory
{
	static class EmptyModelLoader
		implements ModelLoader
	{

		public ModelLoader.LoadData buildLoadData(Object obj, int i, int j, Options options)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public boolean handles(Object obj)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		EmptyModelLoader()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}
	}

	static class Entry
	{

		public boolean handles(Class class1)
		{
			return modelClass.isAssignableFrom(class1);
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field Class modelClass>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #37  <Method boolean Class.isAssignableFrom(Class)>
		//    4    8:ireturn         
		}

		public boolean handles(Class class1, Class class2)
		{
			return handles(class1) && dataClass.isAssignableFrom(class2);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #41  <Method boolean handles(Class)>
		//    3    5:ifeq            21
		//    4    8:aload_0         
		//    5    9:getfield        #25  <Field Class dataClass>
		//    6   12:aload_2         
		//    7   13:invokevirtual   #37  <Method boolean Class.isAssignableFrom(Class)>
		//    8   16:ifeq            21
		//    9   19:iconst_1        
		//   10   20:ireturn         
		//   11   21:iconst_0        
		//   12   22:ireturn         
		}

		final Class dataClass;
		final ModelLoaderFactory factory;
		private final Class modelClass;

		public Entry(Class class1, Class class2, ModelLoaderFactory modelloaderfactory)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			modelClass = class1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #23  <Field Class modelClass>
			dataClass = class2;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #25  <Field Class dataClass>
			factory = modelloaderfactory;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #27  <Field ModelLoaderFactory factory>
		//   11   19:return          
		}
	}

	static class Factory
	{

		public MultiModelLoader build(List list, android.support.v4.util.Pools.Pool pool)
		{
			return new MultiModelLoader(list, pool);
		//    0    0:new             #16  <Class MultiModelLoader>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokespecial   #19  <Method void MultiModelLoader(List, android.support.v4.util.Pools$Pool)>
		//    5    9:areturn         
		}

		Factory()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	public MultiModelLoaderFactory(android.support.v4.util.Pools.Pool pool)
	{
		this(pool, DEFAULT_FACTORY);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #35  <Field MultiModelLoaderFactory$Factory DEFAULT_FACTORY>
	//    3    5:invokespecial   #43  <Method void MultiModelLoaderFactory(android.support.v4.util.Pools$Pool, MultiModelLoaderFactory$Factory)>
	//    4    8:return          
	}

	MultiModelLoaderFactory(android.support.v4.util.Pools.Pool pool, Factory factory1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void Object()>
		entries = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #48  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #49  <Method void ArrayList()>
	//    6   12:putfield        #51  <Field List entries>
		alreadyUsedEntries = ((Set) (new HashSet()));
	//    7   15:aload_0         
	//    8   16:new             #53  <Class HashSet>
	//    9   19:dup             
	//   10   20:invokespecial   #54  <Method void HashSet()>
	//   11   23:putfield        #56  <Field Set alreadyUsedEntries>
		exceptionListPool = pool;
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:putfield        #58  <Field android.support.v4.util.Pools$Pool exceptionListPool>
		factory = factory1;
	//   15   31:aload_0         
	//   16   32:aload_2         
	//   17   33:putfield        #60  <Field MultiModelLoaderFactory$Factory factory>
	//   18   36:return          
	}

	private void add(Class class1, Class class2, ModelLoaderFactory modelloaderfactory, boolean flag)
	{
		class1 = ((Class) (new Entry(class1, class2, modelloaderfactory)));
	//    0    0:new             #9   <Class MultiModelLoaderFactory$Entry>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokespecial   #66  <Method void MultiModelLoaderFactory$Entry(Class, Class, ModelLoaderFactory)>
	//    6   10:astore_1        
		class2 = ((Class) (entries));
	//    7   11:aload_0         
	//    8   12:getfield        #51  <Field List entries>
	//    9   15:astore_2        
		int i;
		if(flag)
	//*  10   16:iload           4
	//*  11   18:ifeq            35
			i = entries.size();
	//   12   21:aload_0         
	//   13   22:getfield        #51  <Field List entries>
	//   14   25:invokeinterface #72  <Method int List.size()>
	//   15   30:istore          5
		else
	//*  16   32:goto            38
			i = 0;
	//   17   35:iconst_0        
	//   18   36:istore          5
		((List) (class2)).add(i, ((Object) (class1)));
	//   19   38:aload_2         
	//   20   39:iload           5
	//   21   41:aload_1         
	//   22   42:invokeinterface #75  <Method void List.add(int, Object)>
	//   23   47:return          
	}

	private ModelLoader build(Entry entry)
	{
		return (ModelLoader)Preconditions.checkNotNull(((Object) (entry.factory.build(this))));
	//    0    0:aload_1         
	//    1    1:getfield        #81  <Field ModelLoaderFactory MultiModelLoaderFactory$Entry.factory>
	//    2    4:aload_0         
	//    3    5:invokeinterface #86  <Method ModelLoader ModelLoaderFactory.build(MultiModelLoaderFactory)>
	//    4   10:invokestatic    #92  <Method Object Preconditions.checkNotNull(Object)>
	//    5   13:checkcast       #94  <Class ModelLoader>
	//    6   16:areturn         
	}

	private static ModelLoader emptyModelLoader()
	{
		return EMPTY_MODEL_LOADER;
	//    0    0:getstatic       #38  <Field ModelLoader EMPTY_MODEL_LOADER>
	//    1    3:areturn         
	}

	private ModelLoaderFactory getFactory(Entry entry)
	{
		return entry.factory;
	//    0    0:aload_1         
	//    1    1:getfield        #81  <Field ModelLoaderFactory MultiModelLoaderFactory$Entry.factory>
	//    2    4:areturn         
	}

	void append(Class class1, Class class2, ModelLoaderFactory modelloaderfactory)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		add(class1, class2, modelloaderfactory, true);
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:aload_2         
	//    5    5:aload_3         
	//    6    6:iconst_1        
	//    7    7:invokespecial   #104 <Method void add(Class, Class, ModelLoaderFactory, boolean)>
		this;
	//    8   10:aload_0         
		JVM INSTR monitorexit ;
	//    9   11:monitorexit     
		return;
	//   10   12:return          
		class1;
	//   11   13:astore_1        
	//*  12   14:aload_0         
		throw class1;
	//   13   15:monitorexit     
	//   14   16:aload_1         
	//   15   17:athrow          
	}

	public ModelLoader build(Class class1, Class class2)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		ArrayList arraylist = new ArrayList();
	//    2    2:new             #48  <Class ArrayList>
	//    3    5:dup             
	//    4    6:invokespecial   #49  <Method void ArrayList()>
	//    5    9:astore          4
		boolean flag = false;
	//    6   11:iconst_0        
	//    7   12:istore_3        
		Iterator iterator = entries.iterator();
	//    8   13:aload_0         
	//    9   14:getfield        #51  <Field List entries>
	//   10   17:invokeinterface #112 <Method Iterator List.iterator()>
	//   11   22:astore          5
_L3:
		Entry entry;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_116;
	//   12   24:aload           5
	//   13   26:invokeinterface #118 <Method boolean Iterator.hasNext()>
	//   14   31:ifeq            116
		entry = (Entry)iterator.next();
	//   15   34:aload           5
	//   16   36:invokeinterface #122 <Method Object Iterator.next()>
	//   17   41:checkcast       #9   <Class MultiModelLoaderFactory$Entry>
	//   18   44:astore          6
		if(!alreadyUsedEntries.contains(((Object) (entry)))) goto _L2; else goto _L1
	//   19   46:aload_0         
	//   20   47:getfield        #56  <Field Set alreadyUsedEntries>
	//   21   50:aload           6
	//   22   52:invokeinterface #128 <Method boolean Set.contains(Object)>
	//   23   57:ifeq            65
_L1:
		flag = true;
	//   24   60:iconst_1        
	//   25   61:istore_3        
		  goto _L3
	//*  26   62:goto            24
_L2:
		if(!entry.handles(class1, class2)) goto _L3; else goto _L4
	//   27   65:aload           6
	//   28   67:aload_1         
	//   29   68:aload_2         
	//   30   69:invokevirtual   #132 <Method boolean MultiModelLoaderFactory$Entry.handles(Class, Class)>
	//   31   72:ifeq            211
_L4:
		alreadyUsedEntries.add(((Object) (entry)));
	//   32   75:aload_0         
	//   33   76:getfield        #56  <Field Set alreadyUsedEntries>
	//   34   79:aload           6
	//   35   81:invokeinterface #134 <Method boolean Set.add(Object)>
	//   36   86:pop             
		((List) (arraylist)).add(((Object) (build(entry))));
	//   37   87:aload           4
	//   38   89:aload_0         
	//   39   90:aload           6
	//   40   92:invokespecial   #136 <Method ModelLoader build(MultiModelLoaderFactory$Entry)>
	//   41   95:invokeinterface #137 <Method boolean List.add(Object)>
	//   42  100:pop             
		alreadyUsedEntries.remove(((Object) (entry)));
	//   43  101:aload_0         
	//   44  102:getfield        #56  <Field Set alreadyUsedEntries>
	//   45  105:aload           6
	//   46  107:invokeinterface #140 <Method boolean Set.remove(Object)>
	//   47  112:pop             
		  goto _L3
	//*  48  113:goto            211
		if(((List) (arraylist)).size() <= 1)
			break MISSING_BLOCK_LABEL_145;
	//   49  116:aload           4
	//   50  118:invokeinterface #72  <Method int List.size()>
	//   51  123:iconst_1        
	//   52  124:icmple          145
		class1 = ((Class) (factory.build(((List) (arraylist)), exceptionListPool)));
	//   53  127:aload_0         
	//   54  128:getfield        #60  <Field MultiModelLoaderFactory$Factory factory>
	//   55  131:aload           4
	//   56  133:aload_0         
	//   57  134:getfield        #58  <Field android.support.v4.util.Pools$Pool exceptionListPool>
	//   58  137:invokevirtual   #143 <Method MultiModelLoader MultiModelLoaderFactory$Factory.build(List, android.support.v4.util.Pools$Pool)>
	//   59  140:astore_1        
		this;
	//   60  141:aload_0         
		JVM INSTR monitorexit ;
	//   61  142:monitorexit     
		return ((ModelLoader) (class1));
	//   62  143:aload_1         
	//   63  144:areturn         
		if(((List) (arraylist)).size() != 1)
			break MISSING_BLOCK_LABEL_172;
	//   64  145:aload           4
	//   65  147:invokeinterface #72  <Method int List.size()>
	//   66  152:iconst_1        
	//   67  153:icmpne          172
		class1 = ((Class) ((ModelLoader)((List) (arraylist)).get(0)));
	//   68  156:aload           4
	//   69  158:iconst_0        
	//   70  159:invokeinterface #147 <Method Object List.get(int)>
	//   71  164:checkcast       #94  <Class ModelLoader>
	//   72  167:astore_1        
		this;
	//   73  168:aload_0         
		JVM INSTR monitorexit ;
	//   74  169:monitorexit     
		return ((ModelLoader) (class1));
	//   75  170:aload_1         
	//   76  171:areturn         
		if(!flag)
			break MISSING_BLOCK_LABEL_184;
	//   77  172:iload_3         
	//   78  173:ifeq            184
		class1 = ((Class) (emptyModelLoader()));
	//   79  176:invokestatic    #149 <Method ModelLoader emptyModelLoader()>
	//   80  179:astore_1        
		this;
	//   81  180:aload_0         
		JVM INSTR monitorexit ;
	//   82  181:monitorexit     
		return ((ModelLoader) (class1));
	//   83  182:aload_1         
	//   84  183:areturn         
		try
		{
			throw new com.bumptech.glide.Registry.NoModelLoaderAvailableException(class1, class2);
	//   85  184:new             #151 <Class com.bumptech.glide.Registry$NoModelLoaderAvailableException>
	//   86  187:dup             
	//   87  188:aload_1         
	//   88  189:aload_2         
	//   89  190:invokespecial   #154 <Method void com.bumptech.glide.Registry$NoModelLoaderAvailableException(Class, Class)>
	//   90  193:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Class class1) { }
	//   91  194:astore_1        
		alreadyUsedEntries.clear();
	//   92  195:aload_0         
	//   93  196:getfield        #56  <Field Set alreadyUsedEntries>
	//   94  199:invokeinterface #157 <Method void Set.clear()>
		throw class1;
	//   95  204:aload_1         
	//   96  205:athrow          
		class1;
	//   97  206:astore_1        
		this;
	//   98  207:aload_0         
		JVM INSTR monitorexit ;
	//   99  208:monitorexit     
		throw class1;
	//  100  209:aload_1         
	//  101  210:athrow          
	//* 102  211:goto            24
	}

	List build(Class class1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		ArrayList arraylist;
		Iterator iterator;
		arraylist = new ArrayList();
	//    2    2:new             #48  <Class ArrayList>
	//    3    5:dup             
	//    4    6:invokespecial   #49  <Method void ArrayList()>
	//    5    9:astore_2        
		iterator = entries.iterator();
	//    6   10:aload_0         
	//    7   11:getfield        #51  <Field List entries>
	//    8   14:invokeinterface #112 <Method Iterator List.iterator()>
	//    9   19:astore_3        
_L2:
		Entry entry;
		do
		{
			if(!iterator.hasNext())
				break MISSING_BLOCK_LABEL_106;
	//   10   20:aload_3         
	//   11   21:invokeinterface #118 <Method boolean Iterator.hasNext()>
	//   12   26:ifeq            106
			entry = (Entry)iterator.next();
	//   13   29:aload_3         
	//   14   30:invokeinterface #122 <Method Object Iterator.next()>
	//   15   35:checkcast       #9   <Class MultiModelLoaderFactory$Entry>
	//   16   38:astore          4
		} while(alreadyUsedEntries.contains(((Object) (entry))));
	//   17   40:aload_0         
	//   18   41:getfield        #56  <Field Set alreadyUsedEntries>
	//   19   44:aload           4
	//   20   46:invokeinterface #128 <Method boolean Set.contains(Object)>
	//   21   51:ifeq            57
	//*  22   54:goto            20
		if(!entry.handles(class1)) goto _L2; else goto _L1
	//   23   57:aload           4
	//   24   59:aload_1         
	//   25   60:invokevirtual   #162 <Method boolean MultiModelLoaderFactory$Entry.handles(Class)>
	//   26   63:ifeq            103
_L1:
		alreadyUsedEntries.add(((Object) (entry)));
	//   27   66:aload_0         
	//   28   67:getfield        #56  <Field Set alreadyUsedEntries>
	//   29   70:aload           4
	//   30   72:invokeinterface #134 <Method boolean Set.add(Object)>
	//   31   77:pop             
		((List) (arraylist)).add(((Object) (build(entry))));
	//   32   78:aload_2         
	//   33   79:aload_0         
	//   34   80:aload           4
	//   35   82:invokespecial   #136 <Method ModelLoader build(MultiModelLoaderFactory$Entry)>
	//   36   85:invokeinterface #137 <Method boolean List.add(Object)>
	//   37   90:pop             
		alreadyUsedEntries.remove(((Object) (entry)));
	//   38   91:aload_0         
	//   39   92:getfield        #56  <Field Set alreadyUsedEntries>
	//   40   95:aload           4
	//   41   97:invokeinterface #140 <Method boolean Set.remove(Object)>
	//   42  102:pop             
		  goto _L2
	//*  43  103:goto            20
		this;
	//   44  106:aload_0         
		JVM INSTR monitorexit ;
	//   45  107:monitorexit     
		return ((List) (arraylist));
	//   46  108:aload_2         
	//   47  109:areturn         
		class1;
	//   48  110:astore_1        
		alreadyUsedEntries.clear();
	//   49  111:aload_0         
	//   50  112:getfield        #56  <Field Set alreadyUsedEntries>
	//   51  115:invokeinterface #157 <Method void Set.clear()>
		throw class1;
	//   52  120:aload_1         
	//   53  121:athrow          
		class1;
	//   54  122:astore_1        
		this;
	//   55  123:aload_0         
		JVM INSTR monitorexit ;
	//   56  124:monitorexit     
		throw class1;
	//   57  125:aload_1         
	//   58  126:athrow          
	}

	List getDataClasses(Class class1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		ArrayList arraylist;
		arraylist = new ArrayList();
	//    2    2:new             #48  <Class ArrayList>
	//    3    5:dup             
	//    4    6:invokespecial   #49  <Method void ArrayList()>
	//    5    9:astore_2        
		Iterator iterator = entries.iterator();
	//    6   10:aload_0         
	//    7   11:getfield        #51  <Field List entries>
	//    8   14:invokeinterface #112 <Method Iterator List.iterator()>
	//    9   19:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   10   20:aload_3         
	//   11   21:invokeinterface #118 <Method boolean Iterator.hasNext()>
	//   12   26:ifeq            78
			Entry entry = (Entry)iterator.next();
	//   13   29:aload_3         
	//   14   30:invokeinterface #122 <Method Object Iterator.next()>
	//   15   35:checkcast       #9   <Class MultiModelLoaderFactory$Entry>
	//   16   38:astore          4
			if(!((List) (arraylist)).contains(((Object) (entry.dataClass))) && entry.handles(class1))
	//*  17   40:aload_2         
	//*  18   41:aload           4
	//*  19   43:getfield        #168 <Field Class MultiModelLoaderFactory$Entry.dataClass>
	//*  20   46:invokeinterface #169 <Method boolean List.contains(Object)>
	//*  21   51:ifne            75
	//*  22   54:aload           4
	//*  23   56:aload_1         
	//*  24   57:invokevirtual   #162 <Method boolean MultiModelLoaderFactory$Entry.handles(Class)>
	//*  25   60:ifeq            75
				((List) (arraylist)).add(((Object) (entry.dataClass)));
	//   26   63:aload_2         
	//   27   64:aload           4
	//   28   66:getfield        #168 <Field Class MultiModelLoaderFactory$Entry.dataClass>
	//   29   69:invokeinterface #137 <Method boolean List.add(Object)>
	//   30   74:pop             
		} while(true);
	//   31   75:goto            20
		this;
	//   32   78:aload_0         
		JVM INSTR monitorexit ;
	//   33   79:monitorexit     
		return ((List) (arraylist));
	//   34   80:aload_2         
	//   35   81:areturn         
		class1;
	//   36   82:astore_1        
	//*  37   83:aload_0         
		throw class1;
	//   38   84:monitorexit     
	//   39   85:aload_1         
	//   40   86:athrow          
	}

	void prepend(Class class1, Class class2, ModelLoaderFactory modelloaderfactory)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		add(class1, class2, modelloaderfactory, false);
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:aload_2         
	//    5    5:aload_3         
	//    6    6:iconst_0        
	//    7    7:invokespecial   #104 <Method void add(Class, Class, ModelLoaderFactory, boolean)>
		this;
	//    8   10:aload_0         
		JVM INSTR monitorexit ;
	//    9   11:monitorexit     
		return;
	//   10   12:return          
		class1;
	//   11   13:astore_1        
	//*  12   14:aload_0         
		throw class1;
	//   13   15:monitorexit     
	//   14   16:aload_1         
	//   15   17:athrow          
	}

	List remove(Class class1, Class class2)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		ArrayList arraylist;
		arraylist = new ArrayList();
	//    2    2:new             #48  <Class ArrayList>
	//    3    5:dup             
	//    4    6:invokespecial   #49  <Method void ArrayList()>
	//    5    9:astore_3        
		Iterator iterator = entries.iterator();
	//    6   10:aload_0         
	//    7   11:getfield        #51  <Field List entries>
	//    8   14:invokeinterface #112 <Method Iterator List.iterator()>
	//    9   19:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//   10   21:aload           4
	//   11   23:invokeinterface #118 <Method boolean Iterator.hasNext()>
	//   12   28:ifeq            76
			Entry entry = (Entry)iterator.next();
	//   13   31:aload           4
	//   14   33:invokeinterface #122 <Method Object Iterator.next()>
	//   15   38:checkcast       #9   <Class MultiModelLoaderFactory$Entry>
	//   16   41:astore          5
			if(entry.handles(class1, class2))
	//*  17   43:aload           5
	//*  18   45:aload_1         
	//*  19   46:aload_2         
	//*  20   47:invokevirtual   #132 <Method boolean MultiModelLoaderFactory$Entry.handles(Class, Class)>
	//*  21   50:ifeq            73
			{
				iterator.remove();
	//   22   53:aload           4
	//   23   55:invokeinterface #174 <Method void Iterator.remove()>
				((List) (arraylist)).add(((Object) (getFactory(entry))));
	//   24   60:aload_3         
	//   25   61:aload_0         
	//   26   62:aload           5
	//   27   64:invokespecial   #176 <Method ModelLoaderFactory getFactory(MultiModelLoaderFactory$Entry)>
	//   28   67:invokeinterface #137 <Method boolean List.add(Object)>
	//   29   72:pop             
			}
		} while(true);
	//   30   73:goto            21
		this;
	//   31   76:aload_0         
		JVM INSTR monitorexit ;
	//   32   77:monitorexit     
		return ((List) (arraylist));
	//   33   78:aload_3         
	//   34   79:areturn         
		class1;
	//   35   80:astore_1        
	//*  36   81:aload_0         
		throw class1;
	//   37   82:monitorexit     
	//   38   83:aload_1         
	//   39   84:athrow          
	}

	List replace(Class class1, Class class2, ModelLoaderFactory modelloaderfactory)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		List list;
		list = remove(class1, class2);
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:aload_2         
	//    5    5:invokevirtual   #181 <Method List remove(Class, Class)>
	//    6    8:astore          4
		append(class1, class2, modelloaderfactory);
	//    7   10:aload_0         
	//    8   11:aload_1         
	//    9   12:aload_2         
	//   10   13:aload_3         
	//   11   14:invokevirtual   #183 <Method void append(Class, Class, ModelLoaderFactory)>
		this;
	//   12   17:aload_0         
		JVM INSTR monitorexit ;
	//   13   18:monitorexit     
		return list;
	//   14   19:aload           4
	//   15   21:areturn         
		class1;
	//   16   22:astore_1        
	//*  17   23:aload_0         
		throw class1;
	//   18   24:monitorexit     
	//   19   25:aload_1         
	//   20   26:athrow          
	}

	private static final Factory DEFAULT_FACTORY = new Factory();
	private static final ModelLoader EMPTY_MODEL_LOADER = new EmptyModelLoader();
	private final Set alreadyUsedEntries;
	private final List entries;
	private final android.support.v4.util.Pools.Pool exceptionListPool;
	private final Factory factory;

	static 
	{
	//    0    0:new             #12  <Class MultiModelLoaderFactory$Factory>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void MultiModelLoaderFactory$Factory()>
	//    3    7:putstatic       #35  <Field MultiModelLoaderFactory$Factory DEFAULT_FACTORY>
	//    4   10:new             #6   <Class MultiModelLoaderFactory$EmptyModelLoader>
	//    5   13:dup             
	//    6   14:invokespecial   #36  <Method void MultiModelLoaderFactory$EmptyModelLoader()>
	//    7   17:putstatic       #38  <Field ModelLoader EMPTY_MODEL_LOADER>
	//*   8   20:return          
	}
}
