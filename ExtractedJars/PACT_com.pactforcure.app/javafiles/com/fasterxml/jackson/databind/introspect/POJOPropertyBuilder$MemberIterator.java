// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			POJOPropertyBuilder, AnnotatedMember

protected static class POJOPropertyBuilder$MemberIterator
	implements Iterator
{

	public boolean hasNext()
	{
		return next != null;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field POJOPropertyBuilder$Linked next>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public AnnotatedMember next()
	{
		if(next == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field POJOPropertyBuilder$Linked next>
	//*   2    4:ifnonnull       15
		{
			throw new NoSuchElementException();
	//    3    7:new             #28  <Class NoSuchElementException>
	//    4   10:dup             
	//    5   11:invokespecial   #29  <Method void NoSuchElementException()>
	//    6   14:athrow          
		} else
		{
			AnnotatedMember annotatedmember = (AnnotatedMember)next.value;
	//    7   15:aload_0         
	//    8   16:getfield        #20  <Field POJOPropertyBuilder$Linked next>
	//    9   19:getfield        #35  <Field Object POJOPropertyBuilder$Linked.value>
	//   10   22:checkcast       #37  <Class AnnotatedMember>
	//   11   25:astore_1        
			next = next.next;
	//   12   26:aload_0         
	//   13   27:aload_0         
	//   14   28:getfield        #20  <Field POJOPropertyBuilder$Linked next>
	//   15   31:getfield        #38  <Field POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.next>
	//   16   34:putfield        #20  <Field POJOPropertyBuilder$Linked next>
			return annotatedmember;
	//   17   37:aload_1         
	//   18   38:areturn         
		}
	}

	public volatile Object next()
	{
		return ((Object) (next()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #42  <Method AnnotatedMember next()>
	//    2    4:areturn         
	}

	public void remove()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #45  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #46  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	private POJOPropertyBuilder.Linked next;

	public POJOPropertyBuilder$MemberIterator(POJOPropertyBuilder.Linked linked)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		next = linked;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field POJOPropertyBuilder$Linked next>
	//    5    9:return          
	}
}
