// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.transcode;

import java.util.*;

// Referenced classes of package com.bumptech.glide.load.resource.transcode:
//			UnitTranscoder, ResourceTranscoder

public class TranscoderRegistry
{
	private static final class Entry
	{

		public boolean handles(Class class1, Class class2)
		{
			return fromClass.isAssignableFrom(class1) && class2.isAssignableFrom(toClass);
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field Class fromClass>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #40  <Method boolean Class.isAssignableFrom(Class)>
		//    4    8:ifeq            24
		//    5   11:aload_2         
		//    6   12:aload_0         
		//    7   13:getfield        #26  <Field Class toClass>
		//    8   16:invokevirtual   #40  <Method boolean Class.isAssignableFrom(Class)>
		//    9   19:ifeq            24
		//   10   22:iconst_1        
		//   11   23:ireturn         
		//   12   24:iconst_0        
		//   13   25:ireturn         
		}

		private final Class fromClass;
		private final Class toClass;
		final ResourceTranscoder transcoder;

		Entry(Class class1, Class class2, ResourceTranscoder resourcetranscoder)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			fromClass = class1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #24  <Field Class fromClass>
			toClass = class2;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #26  <Field Class toClass>
			transcoder = resourcetranscoder;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #28  <Field ResourceTranscoder transcoder>
		//   11   19:return          
		}
	}


	public TranscoderRegistry()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #16  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #17  <Method void ArrayList()>
	//    6   12:putfield        #19  <Field List transcoders>
	//    7   15:return          
	}

	public ResourceTranscoder get(Class class1, Class class2)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!class2.isAssignableFrom(class1))
			break MISSING_BLOCK_LABEL_18;
	//    2    2:aload_2         
	//    3    3:aload_1         
	//    4    4:invokevirtual   #29  <Method boolean Class.isAssignableFrom(Class)>
	//    5    7:ifeq            18
		class1 = ((Class) (UnitTranscoder.get()));
	//    6   10:invokestatic    #34  <Method ResourceTranscoder UnitTranscoder.get()>
	//    7   13:astore_1        
		this;
	//    8   14:aload_0         
		JVM INSTR monitorexit ;
	//    9   15:monitorexit     
		return ((ResourceTranscoder) (class1));
	//   10   16:aload_1         
	//   11   17:areturn         
		Iterator iterator = transcoders.iterator();
	//   12   18:aload_0         
	//   13   19:getfield        #19  <Field List transcoders>
	//   14   22:invokeinterface #40  <Method Iterator List.iterator()>
	//   15   27:astore_3        
		Entry entry;
		do
		{
			if(!iterator.hasNext())
				break MISSING_BLOCK_LABEL_68;
	//   16   28:aload_3         
	//   17   29:invokeinterface #46  <Method boolean Iterator.hasNext()>
	//   18   34:ifeq            68
			entry = (Entry)iterator.next();
	//   19   37:aload_3         
	//   20   38:invokeinterface #50  <Method Object Iterator.next()>
	//   21   43:checkcast       #6   <Class TranscoderRegistry$Entry>
	//   22   46:astore          4
		} while(!entry.handles(class1, class2));
	//   23   48:aload           4
	//   24   50:aload_1         
	//   25   51:aload_2         
	//   26   52:invokevirtual   #54  <Method boolean TranscoderRegistry$Entry.handles(Class, Class)>
	//   27   55:ifeq            28
		class1 = ((Class) (entry.transcoder));
	//   28   58:aload           4
	//   29   60:getfield        #58  <Field ResourceTranscoder TranscoderRegistry$Entry.transcoder>
	//   30   63:astore_1        
		this;
	//   31   64:aload_0         
		JVM INSTR monitorexit ;
	//   32   65:monitorexit     
		return ((ResourceTranscoder) (class1));
	//   33   66:aload_1         
	//   34   67:areturn         
		StringBuilder stringbuilder = new StringBuilder();
	//   35   68:new             #60  <Class StringBuilder>
	//   36   71:dup             
	//   37   72:invokespecial   #61  <Method void StringBuilder()>
	//   38   75:astore_3        
		stringbuilder.append("No transcoder registered to transcode from ");
	//   39   76:aload_3         
	//   40   77:ldc1            #63  <String "No transcoder registered to transcode from ">
	//   41   79:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   42   82:pop             
		stringbuilder.append(((Object) (class1)));
	//   43   83:aload_3         
	//   44   84:aload_1         
	//   45   85:invokevirtual   #70  <Method StringBuilder StringBuilder.append(Object)>
	//   46   88:pop             
		stringbuilder.append(" to ");
	//   47   89:aload_3         
	//   48   90:ldc1            #72  <String " to ">
	//   49   92:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   50   95:pop             
		stringbuilder.append(((Object) (class2)));
	//   51   96:aload_3         
	//   52   97:aload_2         
	//   53   98:invokevirtual   #70  <Method StringBuilder StringBuilder.append(Object)>
	//   54  101:pop             
		throw new IllegalArgumentException(stringbuilder.toString());
	//   55  102:new             #74  <Class IllegalArgumentException>
	//   56  105:dup             
	//   57  106:aload_3         
	//   58  107:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   59  110:invokespecial   #81  <Method void IllegalArgumentException(String)>
	//   60  113:athrow          
		class1;
	//   61  114:astore_1        
		this;
	//   62  115:aload_0         
		JVM INSTR monitorexit ;
	//   63  116:monitorexit     
		throw class1;
	//   64  117:aload_1         
	//   65  118:athrow          
	}

	public List getTranscodeClasses(Class class1, Class class2)
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
		if(!class2.isAssignableFrom(class1))
			break MISSING_BLOCK_LABEL_30;
	//    6   10:aload_2         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #29  <Method boolean Class.isAssignableFrom(Class)>
	//    9   15:ifeq            30
		((List) (arraylist)).add(((Object) (class2)));
	//   10   18:aload_3         
	//   11   19:aload_2         
	//   12   20:invokeinterface #91  <Method boolean List.add(Object)>
	//   13   25:pop             
		this;
	//   14   26:aload_0         
		JVM INSTR monitorexit ;
	//   15   27:monitorexit     
		return ((List) (arraylist));
	//   16   28:aload_3         
	//   17   29:areturn         
		Iterator iterator = transcoders.iterator();
	//   18   30:aload_0         
	//   19   31:getfield        #19  <Field List transcoders>
	//   20   34:invokeinterface #40  <Method Iterator List.iterator()>
	//   21   39:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//   22   41:aload           4
	//   23   43:invokeinterface #46  <Method boolean Iterator.hasNext()>
	//   24   48:ifeq            80
			if(((Entry)iterator.next()).handles(class1, class2))
	//*  25   51:aload           4
	//*  26   53:invokeinterface #50  <Method Object Iterator.next()>
	//*  27   58:checkcast       #6   <Class TranscoderRegistry$Entry>
	//*  28   61:aload_1         
	//*  29   62:aload_2         
	//*  30   63:invokevirtual   #54  <Method boolean TranscoderRegistry$Entry.handles(Class, Class)>
	//*  31   66:ifeq            41
				((List) (arraylist)).add(((Object) (class2)));
	//   32   69:aload_3         
	//   33   70:aload_2         
	//   34   71:invokeinterface #91  <Method boolean List.add(Object)>
	//   35   76:pop             
		} while(true);
	//   36   77:goto            41
		this;
	//   37   80:aload_0         
		JVM INSTR monitorexit ;
	//   38   81:monitorexit     
		return ((List) (arraylist));
	//   39   82:aload_3         
	//   40   83:areturn         
		class1;
	//   41   84:astore_1        
	//*  42   85:aload_0         
		throw class1;
	//   43   86:monitorexit     
	//   44   87:aload_1         
	//   45   88:athrow          
	}

	public void register(Class class1, Class class2, ResourceTranscoder resourcetranscoder)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		transcoders.add(((Object) (new Entry(class1, class2, resourcetranscoder))));
	//    2    2:aload_0         
	//    3    3:getfield        #19  <Field List transcoders>
	//    4    6:new             #6   <Class TranscoderRegistry$Entry>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:aload_3         
	//    9   13:invokespecial   #96  <Method void TranscoderRegistry$Entry(Class, Class, ResourceTranscoder)>
	//   10   16:invokeinterface #91  <Method boolean List.add(Object)>
	//   11   21:pop             
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

	private final List transcoders = new ArrayList();
}
