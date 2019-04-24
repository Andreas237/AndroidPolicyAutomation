// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.impl:
//			ObjectIdReferenceProperty

public static final class ObjectIdReferenceProperty$PropertyReferring extends ReadableObjectId.Referring
{

	public void handleResolvedForwardReference(Object obj, Object obj1)
		throws IOException
	{
		if(!hasId(obj))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #31  <Method boolean hasId(Object)>
	//*   3    5:ifne            40
		{
			throw new IllegalArgumentException((new StringBuilder()).append("Trying to resolve a forward reference with id [").append(obj).append("] that wasn't previously seen as unresolved.").toString());
	//    4    8:new             #33  <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:new             #35  <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #38  <Method void StringBuilder()>
	//    9   19:ldc1            #40  <String "Trying to resolve a forward reference with id [">
	//   10   21:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   11   24:aload_1         
	//   12   25:invokevirtual   #47  <Method StringBuilder StringBuilder.append(Object)>
	//   13   28:ldc1            #49  <String "] that wasn't previously seen as unresolved.">
	//   14   30:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   15   33:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   16   36:invokespecial   #56  <Method void IllegalArgumentException(String)>
	//   17   39:athrow          
		} else
		{
			_parent.set(_pojo, obj1);
	//   18   40:aload_0         
	//   19   41:getfield        #18  <Field ObjectIdReferenceProperty _parent>
	//   20   44:aload_0         
	//   21   45:getfield        #20  <Field Object _pojo>
	//   22   48:aload_2         
	//   23   49:invokevirtual   #59  <Method void ObjectIdReferenceProperty.set(Object, Object)>
			return;
	//   24   52:return          
		}
	}

	private final ObjectIdReferenceProperty _parent;
	public final Object _pojo;

	public ObjectIdReferenceProperty$PropertyReferring(ObjectIdReferenceProperty objectidreferenceproperty, UnresolvedForwardReference unresolvedforwardreference, Class class1, Object obj)
	{
		super(unresolvedforwardreference, class1);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokespecial   #16  <Method void ReadableObjectId$Referring(UnresolvedForwardReference, Class)>
		_parent = objectidreferenceproperty;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:putfield        #18  <Field ObjectIdReferenceProperty _parent>
		_pojo = obj;
	//    7   11:aload_0         
	//    8   12:aload           4
	//    9   14:putfield        #20  <Field Object _pojo>
	//   10   17:return          
	}
}
