// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser;

import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser:
//			SettableAnyProperty, UnresolvedForwardReference

private static class SettableAnyProperty$AnySetterReferring extends com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring
{

	public void handleResolvedForwardReference(Object obj, Object obj1)
		throws IOException
	{
		if(hasId(obj))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #35  <Method boolean hasId(Object)>
	//*   3    5:ifeq            25
		{
			_parent.set(_pojo, ((Object) (_propName)), obj1);
	//    4    8:aload_0         
	//    5    9:getfield        #20  <Field SettableAnyProperty _parent>
	//    6   12:aload_0         
	//    7   13:getfield        #22  <Field Object _pojo>
	//    8   16:aload_0         
	//    9   17:getfield        #24  <Field String _propName>
	//   10   20:aload_2         
	//   11   21:invokevirtual   #39  <Method void SettableAnyProperty.set(Object, Object, Object)>
			return;
	//   12   24:return          
		} else
		{
			obj1 = ((Object) (new StringBuilder()));
	//   13   25:new             #41  <Class StringBuilder>
	//   14   28:dup             
	//   15   29:invokespecial   #44  <Method void StringBuilder()>
	//   16   32:astore_2        
			((StringBuilder) (obj1)).append("Trying to resolve a forward reference with id [");
	//   17   33:aload_2         
	//   18   34:ldc1            #46  <String "Trying to resolve a forward reference with id [">
	//   19   36:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   20   39:pop             
			((StringBuilder) (obj1)).append(obj.toString());
	//   21   40:aload_2         
	//   22   41:aload_1         
	//   23   42:invokevirtual   #56  <Method String Object.toString()>
	//   24   45:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   25   48:pop             
			((StringBuilder) (obj1)).append("] that wasn't previously registered.");
	//   26   49:aload_2         
	//   27   50:ldc1            #58  <String "] that wasn't previously registered.">
	//   28   52:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   29   55:pop             
			throw new IllegalArgumentException(((StringBuilder) (obj1)).toString());
	//   30   56:new             #60  <Class IllegalArgumentException>
	//   31   59:dup             
	//   32   60:aload_2         
	//   33   61:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   34   64:invokespecial   #64  <Method void IllegalArgumentException(String)>
	//   35   67:athrow          
		}
	}

	private final SettableAnyProperty _parent;
	private final Object _pojo;
	private final String _propName;

	public SettableAnyProperty$AnySetterReferring(SettableAnyProperty settableanyproperty, UnresolvedForwardReference unresolvedforwardreference, Class class1, Object obj, String s)
	{
		super(unresolvedforwardreference, class1);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokespecial   #18  <Method void com.fasterxml.jackson.databind.deser.impl.ReadableObjectId$Referring(UnresolvedForwardReference, Class)>
		_parent = settableanyproperty;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:putfield        #20  <Field SettableAnyProperty _parent>
		_pojo = obj;
	//    7   11:aload_0         
	//    8   12:aload           4
	//    9   14:putfield        #22  <Field Object _pojo>
		_propName = s;
	//   10   17:aload_0         
	//   11   18:aload           5
	//   12   20:putfield        #24  <Field String _propName>
	//   13   23:return          
	}
}
