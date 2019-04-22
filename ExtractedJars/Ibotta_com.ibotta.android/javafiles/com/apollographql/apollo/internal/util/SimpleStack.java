// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.util;

import java.util.ArrayList;
import java.util.List;

public class SimpleStack
{

	public SimpleStack()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		backing = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #14  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #15  <Method void ArrayList()>
	//    6   12:putfield        #17  <Field List backing>
	//    7   15:return          
	}

	public boolean isEmpty()
	{
		return backing.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field List backing>
	//    2    4:invokeinterface #24  <Method boolean List.isEmpty()>
	//    3    9:ireturn         
	}

	public Object pop()
	{
		if(!isEmpty())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #27  <Method boolean isEmpty()>
	//*   2    4:ifne            27
		{
			List list = backing;
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field List backing>
	//    5   11:astore_1        
			return list.remove(list.size() - 1);
	//    6   12:aload_1         
	//    7   13:aload_1         
	//    8   14:invokeinterface #31  <Method int List.size()>
	//    9   19:iconst_1        
	//   10   20:isub            
	//   11   21:invokeinterface #35  <Method Object List.remove(int)>
	//   12   26:areturn         
		} else
		{
			throw new IllegalStateException("Stack is empty.");
	//   13   27:new             #37  <Class IllegalStateException>
	//   14   30:dup             
	//   15   31:ldc1            #39  <String "Stack is empty.">
	//   16   33:invokespecial   #42  <Method void IllegalStateException(String)>
	//   17   36:athrow          
		}
	}

	public void push(Object obj)
	{
		backing.add(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field List backing>
	//    2    4:aload_1         
	//    3    5:invokeinterface #50  <Method boolean List.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	private List backing;
}
