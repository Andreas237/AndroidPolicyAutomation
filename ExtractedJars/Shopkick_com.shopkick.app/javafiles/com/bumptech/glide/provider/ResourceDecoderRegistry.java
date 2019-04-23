// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.provider;

import com.bumptech.glide.load.ResourceDecoder;
import java.util.*;

public class ResourceDecoderRegistry
{
	private static class Entry
	{

		public boolean handles(Class class1, Class class2)
		{
			return dataClass.isAssignableFrom(class1) && class2.isAssignableFrom(resourceClass);
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field Class dataClass>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #40  <Method boolean Class.isAssignableFrom(Class)>
		//    4    8:ifeq            24
		//    5   11:aload_2         
		//    6   12:aload_0         
		//    7   13:getfield        #26  <Field Class resourceClass>
		//    8   16:invokevirtual   #40  <Method boolean Class.isAssignableFrom(Class)>
		//    9   19:ifeq            24
		//   10   22:iconst_1        
		//   11   23:ireturn         
		//   12   24:iconst_0        
		//   13   25:ireturn         
		}

		private final Class dataClass;
		final ResourceDecoder decoder;
		final Class resourceClass;

		public Entry(Class class1, Class class2, ResourceDecoder resourcedecoder)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			dataClass = class1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #24  <Field Class dataClass>
			resourceClass = class2;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #26  <Field Class resourceClass>
			decoder = resourcedecoder;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #28  <Field ResourceDecoder decoder>
		//   11   19:return          
		}
	}


	public ResourceDecoderRegistry()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #19  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #20  <Method void ArrayList()>
	//    6   12:putfield        #22  <Field List bucketPriorityList>
	//    7   15:aload_0         
	//    8   16:new             #24  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #25  <Method void HashMap()>
	//   11   23:putfield        #27  <Field Map decoders>
	//   12   26:return          
	}

	private List getOrAddEntryList(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		List list;
		if(!bucketPriorityList.contains(((Object) (s))))
	//*   2    2:aload_0         
	//*   3    3:getfield        #22  <Field List bucketPriorityList>
	//*   4    6:aload_1         
	//*   5    7:invokeinterface #37  <Method boolean List.contains(Object)>
	//*   6   12:ifne            26
			bucketPriorityList.add(((Object) (s)));
	//    7   15:aload_0         
	//    8   16:getfield        #22  <Field List bucketPriorityList>
	//    9   19:aload_1         
	//   10   20:invokeinterface #40  <Method boolean List.add(Object)>
	//   11   25:pop             
		list = (List)decoders.get(((Object) (s)));
	//   12   26:aload_0         
	//   13   27:getfield        #27  <Field Map decoders>
	//   14   30:aload_1         
	//   15   31:invokeinterface #46  <Method Object Map.get(Object)>
	//   16   36:checkcast       #33  <Class List>
	//   17   39:astore_3        
		Object obj;
		obj = ((Object) (list));
	//   18   40:aload_3         
	//   19   41:astore_2        
		if(list != null)
			break MISSING_BLOCK_LABEL_66;
	//   20   42:aload_3         
	//   21   43:ifnonnull       66
		obj = ((Object) (new ArrayList()));
	//   22   46:new             #19  <Class ArrayList>
	//   23   49:dup             
	//   24   50:invokespecial   #20  <Method void ArrayList()>
	//   25   53:astore_2        
		decoders.put(((Object) (s)), obj);
	//   26   54:aload_0         
	//   27   55:getfield        #27  <Field Map decoders>
	//   28   58:aload_1         
	//   29   59:aload_2         
	//   30   60:invokeinterface #50  <Method Object Map.put(Object, Object)>
	//   31   65:pop             
		this;
	//   32   66:aload_0         
		JVM INSTR monitorexit ;
	//   33   67:monitorexit     
		return ((List) (obj));
	//   34   68:aload_2         
	//   35   69:areturn         
		s;
	//   36   70:astore_1        
	//*  37   71:aload_0         
		throw s;
	//   38   72:monitorexit     
	//   39   73:aload_1         
	//   40   74:athrow          
	}

	public void append(String s, ResourceDecoder resourcedecoder, Class class1, Class class2)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		getOrAddEntryList(s).add(((Object) (new Entry(class1, class2, resourcedecoder))));
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:invokespecial   #58  <Method List getOrAddEntryList(String)>
	//    5    7:new             #6   <Class ResourceDecoderRegistry$Entry>
	//    6   10:dup             
	//    7   11:aload_3         
	//    8   12:aload           4
	//    9   14:aload_2         
	//   10   15:invokespecial   #61  <Method void ResourceDecoderRegistry$Entry(Class, Class, ResourceDecoder)>
	//   11   18:invokeinterface #40  <Method boolean List.add(Object)>
	//   12   23:pop             
		this;
	//   13   24:aload_0         
		JVM INSTR monitorexit ;
	//   14   25:monitorexit     
		return;
	//   15   26:return          
		s;
	//   16   27:astore_1        
	//*  17   28:aload_0         
		throw s;
	//   18   29:monitorexit     
	//   19   30:aload_1         
	//   20   31:athrow          
	}

	public List getDecoders(Class class1, Class class2)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		ArrayList arraylist;
		Iterator iterator;
		arraylist = new ArrayList();
	//    2    2:new             #19  <Class ArrayList>
	//    3    5:dup             
	//    4    6:invokespecial   #20  <Method void ArrayList()>
	//    5    9:astore_3        
		iterator = bucketPriorityList.iterator();
	//    6   10:aload_0         
	//    7   11:getfield        #22  <Field List bucketPriorityList>
	//    8   14:invokeinterface #68  <Method Iterator List.iterator()>
	//    9   19:astore          4
_L2:
		Object obj;
		do
		{
			if(!iterator.hasNext())
				break MISSING_BLOCK_LABEL_123;
	//   10   21:aload           4
	//   11   23:invokeinterface #74  <Method boolean Iterator.hasNext()>
	//   12   28:ifeq            123
			obj = ((Object) ((String)iterator.next()));
	//   13   31:aload           4
	//   14   33:invokeinterface #78  <Method Object Iterator.next()>
	//   15   38:checkcast       #80  <Class String>
	//   16   41:astore          5
			obj = ((Object) ((List)decoders.get(obj)));
	//   17   43:aload_0         
	//   18   44:getfield        #27  <Field Map decoders>
	//   19   47:aload           5
	//   20   49:invokeinterface #46  <Method Object Map.get(Object)>
	//   21   54:checkcast       #33  <Class List>
	//   22   57:astore          5
		} while(obj == null);
	//   23   59:aload           5
	//   24   61:ifnonnull       67
	//*  25   64:goto            21
		obj = ((Object) (((List) (obj)).iterator()));
	//   26   67:aload           5
	//   27   69:invokeinterface #68  <Method Iterator List.iterator()>
	//   28   74:astore          5
		while(((Iterator) (obj)).hasNext()) 
	//*  29   76:aload           5
	//*  30   78:invokeinterface #74  <Method boolean Iterator.hasNext()>
	//*  31   83:ifeq            21
		{
			Entry entry = (Entry)((Iterator) (obj)).next();
	//   32   86:aload           5
	//   33   88:invokeinterface #78  <Method Object Iterator.next()>
	//   34   93:checkcast       #6   <Class ResourceDecoderRegistry$Entry>
	//   35   96:astore          6
			if(entry.handles(class1, class2))
	//*  36   98:aload           6
	//*  37  100:aload_1         
	//*  38  101:aload_2         
	//*  39  102:invokevirtual   #84  <Method boolean ResourceDecoderRegistry$Entry.handles(Class, Class)>
	//*  40  105:ifeq            76
				((List) (arraylist)).add(((Object) (entry.decoder)));
	//   41  108:aload_3         
	//   42  109:aload           6
	//   43  111:getfield        #88  <Field ResourceDecoder ResourceDecoderRegistry$Entry.decoder>
	//   44  114:invokeinterface #40  <Method boolean List.add(Object)>
	//   45  119:pop             
		}
		if(true) goto _L2; else goto _L1
	//   46  120:goto            76
_L1:
		this;
	//   47  123:aload_0         
		JVM INSTR monitorexit ;
	//   48  124:monitorexit     
		return ((List) (arraylist));
	//   49  125:aload_3         
	//   50  126:areturn         
		class1;
	//   51  127:astore_1        
	//*  52  128:aload_0         
		throw class1;
	//   53  129:monitorexit     
	//   54  130:aload_1         
	//   55  131:athrow          
	}

	public List getResourceClasses(Class class1, Class class2)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		ArrayList arraylist;
		Iterator iterator;
		arraylist = new ArrayList();
	//    2    2:new             #19  <Class ArrayList>
	//    3    5:dup             
	//    4    6:invokespecial   #20  <Method void ArrayList()>
	//    5    9:astore_3        
		iterator = bucketPriorityList.iterator();
	//    6   10:aload_0         
	//    7   11:getfield        #22  <Field List bucketPriorityList>
	//    8   14:invokeinterface #68  <Method Iterator List.iterator()>
	//    9   19:astore          4
_L2:
		Object obj;
		do
		{
			if(!iterator.hasNext())
				break MISSING_BLOCK_LABEL_137;
	//   10   21:aload           4
	//   11   23:invokeinterface #74  <Method boolean Iterator.hasNext()>
	//   12   28:ifeq            137
			obj = ((Object) ((String)iterator.next()));
	//   13   31:aload           4
	//   14   33:invokeinterface #78  <Method Object Iterator.next()>
	//   15   38:checkcast       #80  <Class String>
	//   16   41:astore          5
			obj = ((Object) ((List)decoders.get(obj)));
	//   17   43:aload_0         
	//   18   44:getfield        #27  <Field Map decoders>
	//   19   47:aload           5
	//   20   49:invokeinterface #46  <Method Object Map.get(Object)>
	//   21   54:checkcast       #33  <Class List>
	//   22   57:astore          5
		} while(obj == null);
	//   23   59:aload           5
	//   24   61:ifnonnull       67
	//*  25   64:goto            21
		obj = ((Object) (((List) (obj)).iterator()));
	//   26   67:aload           5
	//   27   69:invokeinterface #68  <Method Iterator List.iterator()>
	//   28   74:astore          5
		while(((Iterator) (obj)).hasNext()) 
	//*  29   76:aload           5
	//*  30   78:invokeinterface #74  <Method boolean Iterator.hasNext()>
	//*  31   83:ifeq            21
		{
			Entry entry = (Entry)((Iterator) (obj)).next();
	//   32   86:aload           5
	//   33   88:invokeinterface #78  <Method Object Iterator.next()>
	//   34   93:checkcast       #6   <Class ResourceDecoderRegistry$Entry>
	//   35   96:astore          6
			if(entry.handles(class1, class2) && !((List) (arraylist)).contains(((Object) (entry.resourceClass))))
	//*  36   98:aload           6
	//*  37  100:aload_1         
	//*  38  101:aload_2         
	//*  39  102:invokevirtual   #84  <Method boolean ResourceDecoderRegistry$Entry.handles(Class, Class)>
	//*  40  105:ifeq            76
	//*  41  108:aload_3         
	//*  42  109:aload           6
	//*  43  111:getfield        #94  <Field Class ResourceDecoderRegistry$Entry.resourceClass>
	//*  44  114:invokeinterface #37  <Method boolean List.contains(Object)>
	//*  45  119:ifne            76
				((List) (arraylist)).add(((Object) (entry.resourceClass)));
	//   46  122:aload_3         
	//   47  123:aload           6
	//   48  125:getfield        #94  <Field Class ResourceDecoderRegistry$Entry.resourceClass>
	//   49  128:invokeinterface #40  <Method boolean List.add(Object)>
	//   50  133:pop             
		}
		if(true) goto _L2; else goto _L1
	//   51  134:goto            76
_L1:
		this;
	//   52  137:aload_0         
		JVM INSTR monitorexit ;
	//   53  138:monitorexit     
		return ((List) (arraylist));
	//   54  139:aload_3         
	//   55  140:areturn         
		class1;
	//   56  141:astore_1        
	//*  57  142:aload_0         
		throw class1;
	//   58  143:monitorexit     
	//   59  144:aload_1         
	//   60  145:athrow          
	}

	public void prepend(String s, ResourceDecoder resourcedecoder, Class class1, Class class2)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		getOrAddEntryList(s).add(0, ((Object) (new Entry(class1, class2, resourcedecoder))));
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:invokespecial   #58  <Method List getOrAddEntryList(String)>
	//    5    7:iconst_0        
	//    6    8:new             #6   <Class ResourceDecoderRegistry$Entry>
	//    7   11:dup             
	//    8   12:aload_3         
	//    9   13:aload           4
	//   10   15:aload_2         
	//   11   16:invokespecial   #61  <Method void ResourceDecoderRegistry$Entry(Class, Class, ResourceDecoder)>
	//   12   19:invokeinterface #99  <Method void List.add(int, Object)>
		this;
	//   13   24:aload_0         
		JVM INSTR monitorexit ;
	//   14   25:monitorexit     
		return;
	//   15   26:return          
		s;
	//   16   27:astore_1        
	//*  17   28:aload_0         
		throw s;
	//   18   29:monitorexit     
	//   19   30:aload_1         
	//   20   31:athrow          
	}

	public void setBucketPriorityList(List list)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Object obj = ((Object) (new ArrayList(((java.util.Collection) (bucketPriorityList)))));
	//    2    2:new             #19  <Class ArrayList>
	//    3    5:dup             
	//    4    6:aload_0         
	//    5    7:getfield        #22  <Field List bucketPriorityList>
	//    6   10:invokespecial   #104 <Method void ArrayList(java.util.Collection)>
	//    7   13:astore_2        
		bucketPriorityList.clear();
	//    8   14:aload_0         
	//    9   15:getfield        #22  <Field List bucketPriorityList>
	//   10   18:invokeinterface #107 <Method void List.clear()>
		bucketPriorityList.addAll(((java.util.Collection) (list)));
	//   11   23:aload_0         
	//   12   24:getfield        #22  <Field List bucketPriorityList>
	//   13   27:aload_1         
	//   14   28:invokeinterface #111 <Method boolean List.addAll(java.util.Collection)>
	//   15   33:pop             
		obj = ((Object) (((List) (obj)).iterator()));
	//   16   34:aload_2         
	//   17   35:invokeinterface #68  <Method Iterator List.iterator()>
	//   18   40:astore_2        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   19   41:aload_2         
	//   20   42:invokeinterface #74  <Method boolean Iterator.hasNext()>
	//   21   47:ifeq            84
			String s = (String)((Iterator) (obj)).next();
	//   22   50:aload_2         
	//   23   51:invokeinterface #78  <Method Object Iterator.next()>
	//   24   56:checkcast       #80  <Class String>
	//   25   59:astore_3        
			if(!list.contains(((Object) (s))))
	//*  26   60:aload_1         
	//*  27   61:aload_3         
	//*  28   62:invokeinterface #37  <Method boolean List.contains(Object)>
	//*  29   67:ifne            41
				bucketPriorityList.add(((Object) (s)));
	//   30   70:aload_0         
	//   31   71:getfield        #22  <Field List bucketPriorityList>
	//   32   74:aload_3         
	//   33   75:invokeinterface #40  <Method boolean List.add(Object)>
	//   34   80:pop             
		} while(true);
	//   35   81:goto            41
		this;
	//   36   84:aload_0         
		JVM INSTR monitorexit ;
	//   37   85:monitorexit     
		return;
	//   38   86:return          
		list;
	//   39   87:astore_1        
	//*  40   88:aload_0         
		throw list;
	//   41   89:monitorexit     
	//   42   90:aload_1         
	//   43   91:athrow          
	}

	private final List bucketPriorityList = new ArrayList();
	private final Map decoders = new HashMap();
}
