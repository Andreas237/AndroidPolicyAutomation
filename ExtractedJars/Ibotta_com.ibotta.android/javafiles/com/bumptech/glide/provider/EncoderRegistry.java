// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.provider;

import com.bumptech.glide.load.Encoder;
import java.util.*;

public class EncoderRegistry
{
	private static final class Entry
	{

		boolean handles(Class class1)
		{
			return dataClass.isAssignableFrom(class1);
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field Class dataClass>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #35  <Method boolean Class.isAssignableFrom(Class)>
		//    4    8:ireturn         
		}

		private final Class dataClass;
		final Encoder encoder;

		Entry(Class class1, Encoder encoder1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			dataClass = class1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #22  <Field Class dataClass>
			encoder = encoder1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #24  <Field Encoder encoder>
		//    8   14:return          
		}
	}


	public EncoderRegistry()
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

	public void append(Class class1, Encoder encoder)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		encoders.add(((Object) (new Entry(class1, encoder))));
	//    2    2:aload_0         
	//    3    3:getfield        #19  <Field List encoders>
	//    4    6:new             #6   <Class EncoderRegistry$Entry>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokespecial   #25  <Method void EncoderRegistry$Entry(Class, Encoder)>
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

	public Encoder getEncoder(Class class1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Iterator iterator = encoders.iterator();
	//    2    2:aload_0         
	//    3    3:getfield        #19  <Field List encoders>
	//    4    6:invokeinterface #41  <Method Iterator List.iterator()>
	//    5   11:astore_2        
		Entry entry;
		do
		{
			if(!iterator.hasNext())
				break MISSING_BLOCK_LABEL_48;
	//    6   12:aload_2         
	//    7   13:invokeinterface #47  <Method boolean Iterator.hasNext()>
	//    8   18:ifeq            48
			entry = (Entry)iterator.next();
	//    9   21:aload_2         
	//   10   22:invokeinterface #51  <Method Object Iterator.next()>
	//   11   27:checkcast       #6   <Class EncoderRegistry$Entry>
	//   12   30:astore_3        
		} while(!entry.handles(class1));
	//   13   31:aload_3         
	//   14   32:aload_1         
	//   15   33:invokevirtual   #55  <Method boolean EncoderRegistry$Entry.handles(Class)>
	//   16   36:ifeq            12
		class1 = ((Class) (entry.encoder));
	//   17   39:aload_3         
	//   18   40:getfield        #59  <Field Encoder EncoderRegistry$Entry.encoder>
	//   19   43:astore_1        
		this;
	//   20   44:aload_0         
		JVM INSTR monitorexit ;
	//   21   45:monitorexit     
		return ((Encoder) (class1));
	//   22   46:aload_1         
	//   23   47:areturn         
		this;
	//   24   48:aload_0         
		JVM INSTR monitorexit ;
	//   25   49:monitorexit     
		return null;
	//   26   50:aconst_null     
	//   27   51:areturn         
		class1;
	//   28   52:astore_1        
	//*  29   53:aload_0         
		throw class1;
	//   30   54:monitorexit     
	//   31   55:aload_1         
	//   32   56:athrow          
	}

	private final List encoders = new ArrayList();
}
