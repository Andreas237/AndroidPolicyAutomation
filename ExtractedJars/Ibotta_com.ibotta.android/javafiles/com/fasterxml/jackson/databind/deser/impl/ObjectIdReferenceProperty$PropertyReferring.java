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
		if(hasId(obj))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #31  <Method boolean hasId(Object)>
	//*   3    5:ifeq            21
		{
			_parent.set(_pojo, obj1);
	//    4    8:aload_0         
	//    5    9:getfield        #18  <Field ObjectIdReferenceProperty _parent>
	//    6   12:aload_0         
	//    7   13:getfield        #20  <Field Object _pojo>
	//    8   16:aload_2         
	//    9   17:invokevirtual   #34  <Method void ObjectIdReferenceProperty.set(Object, Object)>
			return;
	//   10   20:return          
		} else
		{
			obj1 = ((Object) (new StringBuilder()));
	//   11   21:new             #36  <Class StringBuilder>
	//   12   24:dup             
	//   13   25:invokespecial   #39  <Method void StringBuilder()>
	//   14   28:astore_2        
			((StringBuilder) (obj1)).append("Trying to resolve a forward reference with id [");
	//   15   29:aload_2         
	//   16   30:ldc1            #41  <String "Trying to resolve a forward reference with id [">
	//   17   32:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   18   35:pop             
			((StringBuilder) (obj1)).append(obj);
	//   19   36:aload_2         
	//   20   37:aload_1         
	//   21   38:invokevirtual   #48  <Method StringBuilder StringBuilder.append(Object)>
	//   22   41:pop             
			((StringBuilder) (obj1)).append("] that wasn't previously seen as unresolved.");
	//   23   42:aload_2         
	//   24   43:ldc1            #50  <String "] that wasn't previously seen as unresolved.">
	//   25   45:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   26   48:pop             
			throw new IllegalArgumentException(((StringBuilder) (obj1)).toString());
	//   27   49:new             #52  <Class IllegalArgumentException>
	//   28   52:dup             
	//   29   53:aload_2         
	//   30   54:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   31   57:invokespecial   #59  <Method void IllegalArgumentException(String)>
	//   32   60:athrow          
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
