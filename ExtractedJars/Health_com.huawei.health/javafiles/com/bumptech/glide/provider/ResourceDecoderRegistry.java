// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.provider;

import com.bumptech.glide.load.ResourceDecoder;
import java.util.*;

public class ResourceDecoderRegistry
{
	static class Entry
	{

		public boolean handles(Class class1, Class class2)
		{
			return dataClass.isAssignableFrom(class1) && class2.isAssignableFrom(resourceClass);
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field Class dataClass>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #38  <Method boolean Class.isAssignableFrom(Class)>
		//    4    8:ifeq            24
		//    5   11:aload_2         
		//    6   12:aload_0         
		//    7   13:getfield        #25  <Field Class resourceClass>
		//    8   16:invokevirtual   #38  <Method boolean Class.isAssignableFrom(Class)>
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
		//    1    1:invokespecial   #21  <Method void Object()>
			dataClass = class1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #23  <Field Class dataClass>
			resourceClass = class2;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #25  <Field Class resourceClass>
			decoder = resourcedecoder;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #27  <Field ResourceDecoder decoder>
		//   11   19:return          
		}
	}


	public ResourceDecoderRegistry()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #16  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #17  <Method void ArrayList()>
	//    6   12:putfield        #19  <Field List decoders>
	//    7   15:return          
	}

	public void append(ResourceDecoder resourcedecoder, Class class1, Class class2)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		decoders.add(((Object) (new Entry(class1, class2, resourcedecoder))));
	//    2    2:aload_0         
	//    3    3:getfield        #19  <Field List decoders>
	//    4    6:new             #6   <Class ResourceDecoderRegistry$Entry>
	//    5    9:dup             
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:aload_1         
	//    9   13:invokespecial   #25  <Method void ResourceDecoderRegistry$Entry(Class, Class, ResourceDecoder)>
	//   10   16:invokeinterface #31  <Method boolean List.add(Object)>
	//   11   21:pop             
		this;
	//   12   22:aload_0         
		JVM INSTR monitorexit ;
	//   13   23:monitorexit     
		return;
	//   14   24:return          
		resourcedecoder;
	//   15   25:astore_1        
	//*  16   26:aload_0         
		throw resourcedecoder;
	//   17   27:monitorexit     
	//   18   28:aload_1         
	//   19   29:athrow          
	}

	public List getDecoders(Class class1, Class class2)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		ArrayList arraylist;
		arraylist = new ArrayList();
	//    2    2:new             #16  <Class ArrayList>
	//    3    5:dup             
	//    4    6:invokespecial   #17  <Method void ArrayList()>
	//    5    9:astore_3        
		Iterator iterator = decoders.iterator();
	//    6   10:aload_0         
	//    7   11:getfield        #19  <Field List decoders>
	//    8   14:invokeinterface #39  <Method Iterator List.iterator()>
	//    9   19:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//   10   21:aload           4
	//   11   23:invokeinterface #45  <Method boolean Iterator.hasNext()>
	//   12   28:ifeq            68
			Entry entry = (Entry)iterator.next();
	//   13   31:aload           4
	//   14   33:invokeinterface #49  <Method Object Iterator.next()>
	//   15   38:checkcast       #6   <Class ResourceDecoderRegistry$Entry>
	//   16   41:astore          5
			if(entry.handles(class1, class2))
	//*  17   43:aload           5
	//*  18   45:aload_1         
	//*  19   46:aload_2         
	//*  20   47:invokevirtual   #53  <Method boolean ResourceDecoderRegistry$Entry.handles(Class, Class)>
	//*  21   50:ifeq            65
				((List) (arraylist)).add(((Object) (entry.decoder)));
	//   22   53:aload_3         
	//   23   54:aload           5
	//   24   56:getfield        #57  <Field ResourceDecoder ResourceDecoderRegistry$Entry.decoder>
	//   25   59:invokeinterface #31  <Method boolean List.add(Object)>
	//   26   64:pop             
		} while(true);
	//   27   65:goto            21
		this;
	//   28   68:aload_0         
		JVM INSTR monitorexit ;
	//   29   69:monitorexit     
		return ((List) (arraylist));
	//   30   70:aload_3         
	//   31   71:areturn         
		class1;
	//   32   72:astore_1        
	//*  33   73:aload_0         
		throw class1;
	//   34   74:monitorexit     
	//   35   75:aload_1         
	//   36   76:athrow          
	}

	public List getResourceClasses(Class class1, Class class2)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		ArrayList arraylist;
		arraylist = new ArrayList();
	//    2    2:new             #16  <Class ArrayList>
	//    3    5:dup             
	//    4    6:invokespecial   #17  <Method void ArrayList()>
	//    5    9:astore_3        
		Iterator iterator = decoders.iterator();
	//    6   10:aload_0         
	//    7   11:getfield        #19  <Field List decoders>
	//    8   14:invokeinterface #39  <Method Iterator List.iterator()>
	//    9   19:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//   10   21:aload           4
	//   11   23:invokeinterface #45  <Method boolean Iterator.hasNext()>
	//   12   28:ifeq            68
			Entry entry = (Entry)iterator.next();
	//   13   31:aload           4
	//   14   33:invokeinterface #49  <Method Object Iterator.next()>
	//   15   38:checkcast       #6   <Class ResourceDecoderRegistry$Entry>
	//   16   41:astore          5
			if(entry.handles(class1, class2))
	//*  17   43:aload           5
	//*  18   45:aload_1         
	//*  19   46:aload_2         
	//*  20   47:invokevirtual   #53  <Method boolean ResourceDecoderRegistry$Entry.handles(Class, Class)>
	//*  21   50:ifeq            65
				((List) (arraylist)).add(((Object) (entry.resourceClass)));
	//   22   53:aload_3         
	//   23   54:aload           5
	//   24   56:getfield        #63  <Field Class ResourceDecoderRegistry$Entry.resourceClass>
	//   25   59:invokeinterface #31  <Method boolean List.add(Object)>
	//   26   64:pop             
		} while(true);
	//   27   65:goto            21
		this;
	//   28   68:aload_0         
		JVM INSTR monitorexit ;
	//   29   69:monitorexit     
		return ((List) (arraylist));
	//   30   70:aload_3         
	//   31   71:areturn         
		class1;
	//   32   72:astore_1        
	//*  33   73:aload_0         
		throw class1;
	//   34   74:monitorexit     
	//   35   75:aload_1         
	//   36   76:athrow          
	}

	public void prepend(ResourceDecoder resourcedecoder, Class class1, Class class2)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		decoders.add(0, ((Object) (new Entry(class1, class2, resourcedecoder))));
	//    2    2:aload_0         
	//    3    3:getfield        #19  <Field List decoders>
	//    4    6:iconst_0        
	//    5    7:new             #6   <Class ResourceDecoderRegistry$Entry>
	//    6   10:dup             
	//    7   11:aload_2         
	//    8   12:aload_3         
	//    9   13:aload_1         
	//   10   14:invokespecial   #25  <Method void ResourceDecoderRegistry$Entry(Class, Class, ResourceDecoder)>
	//   11   17:invokeinterface #68  <Method void List.add(int, Object)>
		this;
	//   12   22:aload_0         
		JVM INSTR monitorexit ;
	//   13   23:monitorexit     
		return;
	//   14   24:return          
		resourcedecoder;
	//   15   25:astore_1        
	//*  16   26:aload_0         
		throw resourcedecoder;
	//   17   27:monitorexit     
	//   18   28:aload_1         
	//   19   29:athrow          
	}

	private final List decoders = new ArrayList();
}
