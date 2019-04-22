// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.provider;

import com.bumptech.glide.load.ResourceEncoder;
import java.util.ArrayList;
import java.util.List;

public class ResourceEncoderRegistry
{
	private static final class Entry
	{

		boolean handles(Class class1)
		{
			return resourceClass.isAssignableFrom(class1);
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field Class resourceClass>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #35  <Method boolean Class.isAssignableFrom(Class)>
		//    4    8:ireturn         
		}

		final ResourceEncoder encoder;
		private final Class resourceClass;

		Entry(Class class1, ResourceEncoder resourceencoder)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			resourceClass = class1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #22  <Field Class resourceClass>
			encoder = resourceencoder;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #24  <Field ResourceEncoder encoder>
		//    8   14:return          
		}
	}


	public ResourceEncoderRegistry()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #16  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #17  <Method void ArrayList()>
	//    6   12:putfield        #19  <Field List encoders>
	//    7   15:return          
	}

	public void append(Class class1, ResourceEncoder resourceencoder)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		encoders.add(((Object) (new Entry(class1, resourceencoder))));
	//    2    2:aload_0         
	//    3    3:getfield        #19  <Field List encoders>
	//    4    6:new             #6   <Class ResourceEncoderRegistry$Entry>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokespecial   #25  <Method void ResourceEncoderRegistry$Entry(Class, ResourceEncoder)>
	//    9   15:invokeinterface #31  <Method boolean List.add(Object)>
	//   10   20:pop             
		this;
	//   11   21:aload_0         
		JVM INSTR monitorexit ;
	//   12   22:monitorexit     
		return;
	//   13   23:return          
		class1;
	//   14   24:astore_1        
	//*  15   25:aload_0         
		throw class1;
	//   16   26:monitorexit     
	//   17   27:aload_1         
	//   18   28:athrow          
	}

	public ResourceEncoder get(Class class1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i = 0;
	//    2    2:iconst_0        
	//    3    3:istore_2        
		int j = encoders.size();
	//    4    4:aload_0         
	//    5    5:getfield        #19  <Field List encoders>
	//    6    8:invokeinterface #41  <Method int List.size()>
	//    7   13:istore_3        
_L2:
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//    8   14:iload_2         
	//    9   15:iload_3         
	//   10   16:icmpge          60
		Entry entry = (Entry)encoders.get(i);
	//   11   19:aload_0         
	//   12   20:getfield        #19  <Field List encoders>
	//   13   23:iload_2         
	//   14   24:invokeinterface #44  <Method Object List.get(int)>
	//   15   29:checkcast       #6   <Class ResourceEncoderRegistry$Entry>
	//   16   32:astore          4
		if(!entry.handles(class1))
			break MISSING_BLOCK_LABEL_53;
	//   17   34:aload           4
	//   18   36:aload_1         
	//   19   37:invokevirtual   #48  <Method boolean ResourceEncoderRegistry$Entry.handles(Class)>
	//   20   40:ifeq            53
		class1 = ((Class) (entry.encoder));
	//   21   43:aload           4
	//   22   45:getfield        #52  <Field ResourceEncoder ResourceEncoderRegistry$Entry.encoder>
	//   23   48:astore_1        
		this;
	//   24   49:aload_0         
		JVM INSTR monitorexit ;
	//   25   50:monitorexit     
		return ((ResourceEncoder) (class1));
	//   26   51:aload_1         
	//   27   52:areturn         
		i++;
	//   28   53:iload_2         
	//   29   54:iconst_1        
	//   30   55:iadd            
	//   31   56:istore_2        
		if(true) goto _L2; else goto _L1
	//   32   57:goto            14
	//*  33   60:aload_0         
_L1:
		return null;
	//   34   61:monitorexit     
	//   35   62:aconst_null     
	//   36   63:areturn         
		class1;
	//   37   64:astore_1        
	//*  38   65:aload_0         
		throw class1;
	//   39   66:monitorexit     
	//   40   67:aload_1         
	//   41   68:athrow          
	}

	private final List encoders = new ArrayList();
}
