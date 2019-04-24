// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.transcode;

import java.util.*;

// Referenced classes of package com.bumptech.glide.load.resource.transcode:
//			UnitTranscoder, ResourceTranscoder

public class TranscoderRegistry
{
	static final class Entry
	{

		public boolean handles(Class class1, Class class2)
		{
			return fromClass.isAssignableFrom(class1) && class2.isAssignableFrom(toClass);
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field Class fromClass>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #38  <Method boolean Class.isAssignableFrom(Class)>
		//    4    8:ifeq            24
		//    5   11:aload_2         
		//    6   12:aload_0         
		//    7   13:getfield        #25  <Field Class toClass>
		//    8   16:invokevirtual   #38  <Method boolean Class.isAssignableFrom(Class)>
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
		//    1    1:invokespecial   #21  <Method void Object()>
			fromClass = class1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #23  <Field Class fromClass>
			toClass = class2;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #25  <Field Class toClass>
			transcoder = resourcetranscoder;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #27  <Field ResourceTranscoder transcoder>
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
	//    4    4:invokevirtual   #28  <Method boolean Class.isAssignableFrom(Class)>
	//    5    7:ifeq            18
		class1 = ((Class) (UnitTranscoder.get()));
	//    6   10:invokestatic    #33  <Method ResourceTranscoder UnitTranscoder.get()>
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
	//   14   22:invokeinterface #39  <Method Iterator List.iterator()>
	//   15   27:astore_3        
		Entry entry;
		do
		{
			if(!iterator.hasNext())
				break MISSING_BLOCK_LABEL_68;
	//   16   28:aload_3         
	//   17   29:invokeinterface #45  <Method boolean Iterator.hasNext()>
	//   18   34:ifeq            68
			entry = (Entry)iterator.next();
	//   19   37:aload_3         
	//   20   38:invokeinterface #49  <Method Object Iterator.next()>
	//   21   43:checkcast       #6   <Class TranscoderRegistry$Entry>
	//   22   46:astore          4
		} while(!entry.handles(class1, class2));
	//   23   48:aload           4
	//   24   50:aload_1         
	//   25   51:aload_2         
	//   26   52:invokevirtual   #53  <Method boolean TranscoderRegistry$Entry.handles(Class, Class)>
	//   27   55:ifeq            109
		class1 = ((Class) (entry.transcoder));
	//   28   58:aload           4
	//   29   60:getfield        #57  <Field ResourceTranscoder TranscoderRegistry$Entry.transcoder>
	//   30   63:astore_1        
		this;
	//   31   64:aload_0         
		JVM INSTR monitorexit ;
	//   32   65:monitorexit     
		return ((ResourceTranscoder) (class1));
	//   33   66:aload_1         
	//   34   67:areturn         
		throw new IllegalArgumentException((new StringBuilder()).append("No transcoder registered to transcode from ").append(((Object) (class1))).append(" to ").append(((Object) (class2))).toString());
	//   35   68:new             #59  <Class IllegalArgumentException>
	//   36   71:dup             
	//   37   72:new             #61  <Class StringBuilder>
	//   38   75:dup             
	//   39   76:invokespecial   #62  <Method void StringBuilder()>
	//   40   79:ldc1            #64  <String "No transcoder registered to transcode from ">
	//   41   81:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   42   84:aload_1         
	//   43   85:invokevirtual   #71  <Method StringBuilder StringBuilder.append(Object)>
	//   44   88:ldc1            #73  <String " to ">
	//   45   90:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   46   93:aload_2         
	//   47   94:invokevirtual   #71  <Method StringBuilder StringBuilder.append(Object)>
	//   48   97:invokevirtual   #77  <Method String StringBuilder.toString()>
	//   49  100:invokespecial   #80  <Method void IllegalArgumentException(String)>
	//   50  103:athrow          
		class1;
	//   51  104:astore_1        
		this;
	//   52  105:aload_0         
		JVM INSTR monitorexit ;
	//   53  106:monitorexit     
		throw class1;
	//   54  107:aload_1         
	//   55  108:athrow          
	//*  56  109:goto            28
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
	//    8   12:invokevirtual   #28  <Method boolean Class.isAssignableFrom(Class)>
	//    9   15:ifeq            30
		((List) (arraylist)).add(((Object) (class2)));
	//   10   18:aload_3         
	//   11   19:aload_2         
	//   12   20:invokeinterface #88  <Method boolean List.add(Object)>
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
	//   20   34:invokeinterface #39  <Method Iterator List.iterator()>
	//   21   39:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//   22   41:aload           4
	//   23   43:invokeinterface #45  <Method boolean Iterator.hasNext()>
	//   24   48:ifeq            80
			if(((Entry)iterator.next()).handles(class1, class2))
	//*  25   51:aload           4
	//*  26   53:invokeinterface #49  <Method Object Iterator.next()>
	//*  27   58:checkcast       #6   <Class TranscoderRegistry$Entry>
	//*  28   61:aload_1         
	//*  29   62:aload_2         
	//*  30   63:invokevirtual   #53  <Method boolean TranscoderRegistry$Entry.handles(Class, Class)>
	//*  31   66:ifeq            77
				((List) (arraylist)).add(((Object) (class2)));
	//   32   69:aload_3         
	//   33   70:aload_2         
	//   34   71:invokeinterface #88  <Method boolean List.add(Object)>
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
	//    9   13:invokespecial   #93  <Method void TranscoderRegistry$Entry(Class, Class, ResourceTranscoder)>
	//   10   16:invokeinterface #88  <Method boolean List.add(Object)>
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
