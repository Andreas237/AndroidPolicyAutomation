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
		Object obj = ((Object) (next));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field POJOPropertyBuilder$Linked next>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          30
		{
			obj = ((Object) ((AnnotatedMember)((POJOPropertyBuilder.Linked) (obj)).value));
	//    5    9:aload_1         
	//    6   10:getfield        #32  <Field Object POJOPropertyBuilder$Linked.value>
	//    7   13:checkcast       #34  <Class AnnotatedMember>
	//    8   16:astore_1        
			next = next.next;
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #20  <Field POJOPropertyBuilder$Linked next>
	//   12   22:getfield        #35  <Field POJOPropertyBuilder$Linked POJOPropertyBuilder$Linked.next>
	//   13   25:putfield        #20  <Field POJOPropertyBuilder$Linked next>
			return ((AnnotatedMember) (obj));
	//   14   28:aload_1         
	//   15   29:areturn         
		} else
		{
			throw new NoSuchElementException();
	//   16   30:new             #37  <Class NoSuchElementException>
	//   17   33:dup             
	//   18   34:invokespecial   #38  <Method void NoSuchElementException()>
	//   19   37:athrow          
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
