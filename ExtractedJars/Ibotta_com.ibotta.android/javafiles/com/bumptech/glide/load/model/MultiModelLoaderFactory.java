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
	private static class EmptyModelLoader
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

	private static class Entry
	{

		public boolean handles(Class class1)
		{
			return modelClass.isAssignableFrom(class1);
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field Class modelClass>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #39  <Method boolean Class.isAssignableFrom(Class)>
		//    4    8:ireturn         
		}

		public boolean handles(Class class1, Class class2)
		{
			return handles(class1) && dataClass.isAssignableFrom(class2);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #43  <Method boolean handles(Class)>
		//    3    5:ifeq            21
		//    4    8:aload_0         
		//    5    9:getfield        #26  <Field Class dataClass>
		//    6   12:aload_2         
		//    7   13:invokevirtual   #39  <Method boolean Class.isAssignableFrom(Class)>
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
		//    1    1:invokespecial   #22  <Method void Object()>
			modelClass = class1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #24  <Field Class modelClass>
			dataClass = class2;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #26  <Field Class dataClass>
			factory = modelloaderfactory;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #28  <Field ModelLoaderFactory factory>
		//   11   19:return          
		}
	}

	static class Factory
	{

		public MultiModelLoader build(List list, android.support.v4.util.Pools.Pool pool)
		{
			return new MultiModelLoader(list, pool);
		//    0    0:new             #17  <Class MultiModelLoader>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokespecial   #20  <Method void MultiModelLoader(List, android.support.v4.util.Pools$Pool)>
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
	//    3    5:invokespecial   #44  <Method void MultiModelLoaderFactory(android.support.v4.util.Pools$Pool, MultiModelLoaderFactory$Factory)>
	//    4    8:return          
	}

	MultiModelLoaderFactory(android.support.v4.util.Pools.Pool pool, Factory factory1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void Object()>
		entries = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #51  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #52  <Method void ArrayList()>
	//    6   12:putfield        #54  <Field List entries>
		alreadyUsedEntries = ((Set) (new HashSet()));
	//    7   15:aload_0         
	//    8   16:new             #56  <Class HashSet>
	//    9   19:dup             
	//   10   20:invokespecial   #57  <Method void HashSet()>
	//   11   23:putfield        #59  <Field Set alreadyUsedEntries>
		throwableListPool = pool;
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:putfield        #61  <Field android.support.v4.util.Pools$Pool throwableListPool>
		factory = factory1;
	//   15   31:aload_0         
	//   16   32:aload_2         
	//   17   33:putfield        #63  <Field MultiModelLoaderFactory$Factory factory>
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
	//    5    7:invokespecial   #70  <Method void MultiModelLoaderFactory$Entry(Class, Class, ModelLoaderFactory)>
	//    6   10:astore_1        
		class2 = ((Class) (entries));
	//    7   11:aload_0         
	//    8   12:getfield        #54  <Field List entries>
	//    9   15:astore_2        
		int i;
		if(flag)
	//*  10   16:iload           4
	//*  11   18:ifeq            32
			i = ((List) (class2)).size();
	//   12   21:aload_2         
	//   13   22:invokeinterface #76  <Method int List.size()>
	//   14   27:istore          5
		else
	//*  15   29:goto            35
			i = 0;
	//   16   32:iconst_0        
	//   17   33:istore          5
		((List) (class2)).add(i, ((Object) (class1)));
	//   18   35:aload_2         
	//   19   36:iload           5
	//   20   38:aload_1         
	//   21   39:invokeinterface #79  <Method void List.add(int, Object)>
	//   22   44:return          
	}

	private ModelLoader build(Entry entry)
	{
		return (ModelLoader)Preconditions.checkNotNull(((Object) (entry.factory.build(this))));
	//    0    0:aload_1         
	//    1    1:getfield        #85  <Field ModelLoaderFactory MultiModelLoaderFactory$Entry.factory>
	//    2    4:aload_0         
	//    3    5:invokeinterface #90  <Method ModelLoader ModelLoaderFactory.build(MultiModelLoaderFactory)>
	//    4   10:invokestatic    #96  <Method Object Preconditions.checkNotNull(Object)>
	//    5   13:checkcast       #98  <Class ModelLoader>
	//    6   16:areturn         
	}

	private static ModelLoader emptyModelLoader()
	{
		return EMPTY_MODEL_LOADER;
	//    0    0:getstatic       #38  <Field ModelLoader EMPTY_MODEL_LOADER>
	//    1    3:areturn         
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
	//    7    7:invokespecial   #105 <Method void add(Class, Class, ModelLoaderFactory, boolean)>
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
		ArrayList arraylist;
		Iterator iterator;
		arraylist = new ArrayList();
	//    2    2:new             #51  <Class ArrayList>
	//    3    5:dup             
	//    4    6:invokespecial   #52  <Method void ArrayList()>
	//    5    9:astore          4
		iterator = entries.iterator();
	//    6   11:aload_0         
	//    7   12:getfield        #54  <Field List entries>
	//    8   15:invokeinterface #113 <Method Iterator List.iterator()>
	//    9   20:astore          5
		boolean flag = false;
	//   10   22:iconst_0        
	//   11   23:istore_3        
_L3:
		Entry entry;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_116;
	//   12   24:aload           5
	//   13   26:invokeinterface #119 <Method boolean Iterator.hasNext()>
	//   14   31:ifeq            116
		entry = (Entry)iterator.next();
	//   15   34:aload           5
	//   16   36:invokeinterface #123 <Method Object Iterator.next()>
	//   17   41:checkcast       #9   <Class MultiModelLoaderFactory$Entry>
	//   18   44:astore          6
		if(!alreadyUsedEntries.contains(((Object) (entry)))) goto _L2; else goto _L1
	//   19   46:aload_0         
	//   20   47:getfield        #59  <Field Set alreadyUsedEntries>
	//   21   50:aload           6
	//   22   52:invokeinterface #129 <Method boolean Set.contains(Object)>
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
	//   30   69:invokevirtual   #133 <Method boolean MultiModelLoaderFactory$Entry.handles(Class, Class)>
	//   31   72:ifeq            24
_L4:
		alreadyUsedEntries.add(((Object) (entry)));
	//   32   75:aload_0         
	//   33   76:getfield        #59  <Field Set alreadyUsedEntries>
	//   34   79:aload           6
	//   35   81:invokeinterface #135 <Method boolean Set.add(Object)>
	//   36   86:pop             
		((List) (arraylist)).add(((Object) (build(entry))));
	//   37   87:aload           4
	//   38   89:aload_0         
	//   39   90:aload           6
	//   40   92:invokespecial   #137 <Method ModelLoader build(MultiModelLoaderFactory$Entry)>
	//   41   95:invokeinterface #138 <Method boolean List.add(Object)>
	//   42  100:pop             
		alreadyUsedEntries.remove(((Object) (entry)));
	//   43  101:aload_0         
	//   44  102:getfield        #59  <Field Set alreadyUsedEntries>
	//   45  105:aload           6
	//   46  107:invokeinterface #141 <Method boolean Set.remove(Object)>
	//   47  112:pop             
		  goto _L3
	//*  48  113:goto            24
		if(((List) (arraylist)).size() <= 1)
			break MISSING_BLOCK_LABEL_145;
	//   49  116:aload           4
	//   50  118:invokeinterface #76  <Method int List.size()>
	//   51  123:iconst_1        
	//   52  124:icmple          145
		class1 = ((Class) (factory.build(((List) (arraylist)), throwableListPool)));
	//   53  127:aload_0         
	//   54  128:getfield        #63  <Field MultiModelLoaderFactory$Factory factory>
	//   55  131:aload           4
	//   56  133:aload_0         
	//   57  134:getfield        #61  <Field android.support.v4.util.Pools$Pool throwableListPool>
	//   58  137:invokevirtual   #144 <Method MultiModelLoader MultiModelLoaderFactory$Factory.build(List, android.support.v4.util.Pools$Pool)>
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
	//   65  147:invokeinterface #76  <Method int List.size()>
	//   66  152:iconst_1        
	//   67  153:icmpne          172
		class1 = ((Class) ((ModelLoader)((List) (arraylist)).get(0)));
	//   68  156:aload           4
	//   69  158:iconst_0        
	//   70  159:invokeinterface #148 <Method Object List.get(int)>
	//   71  164:checkcast       #98  <Class ModelLoader>
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
	//   79  176:invokestatic    #150 <Method ModelLoader emptyModelLoader()>
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
	//   85  184:new             #152 <Class com.bumptech.glide.Registry$NoModelLoaderAvailableException>
	//   86  187:dup             
	//   87  188:aload_1         
	//   88  189:aload_2         
	//   89  190:invokespecial   #155 <Method void com.bumptech.glide.Registry$NoModelLoaderAvailableException(Class, Class)>
	//   90  193:athrow          
		}
	//*  91  194:astore_1        
	//*  92  195:goto            210
		// Misplaced declaration of an exception variable
		catch(Class class1) { }
	//   93  198:astore_1        
		break MISSING_BLOCK_LABEL_199;
		class1;
		break MISSING_BLOCK_LABEL_210;
		alreadyUsedEntries.clear();
	//   94  199:aload_0         
	//   95  200:getfield        #59  <Field Set alreadyUsedEntries>
	//   96  203:invokeinterface #158 <Method void Set.clear()>
		throw class1;
	//   97  208:aload_1         
	//   98  209:athrow          
		this;
	//   99  210:aload_0         
		JVM INSTR monitorexit ;
	//  100  211:monitorexit     
		throw class1;
	//  101  212:aload_1         
	//  102  213:athrow          
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
	//    2    2:new             #51  <Class ArrayList>
	//    3    5:dup             
	//    4    6:invokespecial   #52  <Method void ArrayList()>
	//    5    9:astore_2        
		iterator = entries.iterator();
	//    6   10:aload_0         
	//    7   11:getfield        #54  <Field List entries>
	//    8   14:invokeinterface #113 <Method Iterator List.iterator()>
	//    9   19:astore_3        
_L2:
		Entry entry;
		do
		{
			if(!iterator.hasNext())
				break MISSING_BLOCK_LABEL_106;
	//   10   20:aload_3         
	//   11   21:invokeinterface #119 <Method boolean Iterator.hasNext()>
	//   12   26:ifeq            106
			entry = (Entry)iterator.next();
	//   13   29:aload_3         
	//   14   30:invokeinterface #123 <Method Object Iterator.next()>
	//   15   35:checkcast       #9   <Class MultiModelLoaderFactory$Entry>
	//   16   38:astore          4
		} while(alreadyUsedEntries.contains(((Object) (entry))));
	//   17   40:aload_0         
	//   18   41:getfield        #59  <Field Set alreadyUsedEntries>
	//   19   44:aload           4
	//   20   46:invokeinterface #129 <Method boolean Set.contains(Object)>
	//   21   51:ifeq            57
	//*  22   54:goto            20
		if(!entry.handles(class1)) goto _L2; else goto _L1
	//   23   57:aload           4
	//   24   59:aload_1         
	//   25   60:invokevirtual   #163 <Method boolean MultiModelLoaderFactory$Entry.handles(Class)>
	//   26   63:ifeq            20
_L1:
		alreadyUsedEntries.add(((Object) (entry)));
	//   27   66:aload_0         
	//   28   67:getfield        #59  <Field Set alreadyUsedEntries>
	//   29   70:aload           4
	//   30   72:invokeinterface #135 <Method boolean Set.add(Object)>
	//   31   77:pop             
		((List) (arraylist)).add(((Object) (build(entry))));
	//   32   78:aload_2         
	//   33   79:aload_0         
	//   34   80:aload           4
	//   35   82:invokespecial   #137 <Method ModelLoader build(MultiModelLoaderFactory$Entry)>
	//   36   85:invokeinterface #138 <Method boolean List.add(Object)>
	//   37   90:pop             
		alreadyUsedEntries.remove(((Object) (entry)));
	//   38   91:aload_0         
	//   39   92:getfield        #59  <Field Set alreadyUsedEntries>
	//   40   95:aload           4
	//   41   97:invokeinterface #141 <Method boolean Set.remove(Object)>
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
		break MISSING_BLOCK_LABEL_127;
	//   49  111:goto            126
		class1;
	//   50  114:astore_1        
		alreadyUsedEntries.clear();
	//   51  115:aload_0         
	//   52  116:getfield        #59  <Field Set alreadyUsedEntries>
	//   53  119:invokeinterface #158 <Method void Set.clear()>
		throw class1;
	//   54  124:aload_1         
	//   55  125:athrow          
	//*  56  126:aload_0         
		throw class1;
	//   57  127:monitorexit     
	//   58  128:aload_1         
	//   59  129:athrow          
	}

	List getDataClasses(Class class1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		ArrayList arraylist;
		arraylist = new ArrayList();
	//    2    2:new             #51  <Class ArrayList>
	//    3    5:dup             
	//    4    6:invokespecial   #52  <Method void ArrayList()>
	//    5    9:astore_2        
		Iterator iterator = entries.iterator();
	//    6   10:aload_0         
	//    7   11:getfield        #54  <Field List entries>
	//    8   14:invokeinterface #113 <Method Iterator List.iterator()>
	//    9   19:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   10   20:aload_3         
	//   11   21:invokeinterface #119 <Method boolean Iterator.hasNext()>
	//   12   26:ifeq            78
			Entry entry = (Entry)iterator.next();
	//   13   29:aload_3         
	//   14   30:invokeinterface #123 <Method Object Iterator.next()>
	//   15   35:checkcast       #9   <Class MultiModelLoaderFactory$Entry>
	//   16   38:astore          4
			if(!((List) (arraylist)).contains(((Object) (entry.dataClass))) && entry.handles(class1))
	//*  17   40:aload_2         
	//*  18   41:aload           4
	//*  19   43:getfield        #169 <Field Class MultiModelLoaderFactory$Entry.dataClass>
	//*  20   46:invokeinterface #170 <Method boolean List.contains(Object)>
	//*  21   51:ifne            20
	//*  22   54:aload           4
	//*  23   56:aload_1         
	//*  24   57:invokevirtual   #163 <Method boolean MultiModelLoaderFactory$Entry.handles(Class)>
	//*  25   60:ifeq            20
				((List) (arraylist)).add(((Object) (entry.dataClass)));
	//   26   63:aload_2         
	//   27   64:aload           4
	//   28   66:getfield        #169 <Field Class MultiModelLoaderFactory$Entry.dataClass>
	//   29   69:invokeinterface #138 <Method boolean List.add(Object)>
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

	private static final Factory DEFAULT_FACTORY = new Factory();
	private static final ModelLoader EMPTY_MODEL_LOADER = new EmptyModelLoader();
	private final Set alreadyUsedEntries;
	private final List entries;
	private final Factory factory;
	private final android.support.v4.util.Pools.Pool throwableListPool;

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
