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
		if(!hasId(obj))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #35  <Method boolean hasId(Object)>
	//*   3    5:ifne            43
		{
			throw new IllegalArgumentException((new StringBuilder()).append("Trying to resolve a forward reference with id [").append(obj.toString()).append("] that wasn't previously registered.").toString());
	//    4    8:new             #37  <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:new             #39  <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #42  <Method void StringBuilder()>
	//    9   19:ldc1            #44  <String "Trying to resolve a forward reference with id [">
	//   10   21:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   11   24:aload_1         
	//   12   25:invokevirtual   #54  <Method String Object.toString()>
	//   13   28:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   14   31:ldc1            #56  <String "] that wasn't previously registered.">
	//   15   33:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   16   36:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   17   39:invokespecial   #60  <Method void IllegalArgumentException(String)>
	//   18   42:athrow          
		} else
		{
			_parent.set(_pojo, _propName, obj1);
	//   19   43:aload_0         
	//   20   44:getfield        #20  <Field SettableAnyProperty _parent>
	//   21   47:aload_0         
	//   22   48:getfield        #22  <Field Object _pojo>
	//   23   51:aload_0         
	//   24   52:getfield        #24  <Field String _propName>
	//   25   55:aload_2         
	//   26   56:invokevirtual   #64  <Method void SettableAnyProperty.set(Object, String, Object)>
			return;
	//   27   59:return          
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
