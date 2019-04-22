// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			CollectionDeserializer

private static final class CollectionDeserializer$CollectionReferring extends com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring
{

	public void handleResolvedForwardReference(Object obj, Object obj1)
		throws IOException
	{
		_parent.resolveForwardReference(obj, obj1);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field CollectionDeserializer$CollectionReferringAccumulator _parent>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #38  <Method void CollectionDeserializer$CollectionReferringAccumulator.resolveForwardReference(Object, Object)>
	//    5    9:return          
	}

	private final ccumulator _parent;
	public final List next = new ArrayList();

	CollectionDeserializer$CollectionReferring(ccumulator ccumulator, UnresolvedForwardReference unresolvedforwardreference, Class class1)
	{
		super(unresolvedforwardreference, class1);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokespecial   #17  <Method void com.fasterxml.jackson.databind.deser.impl.ReadableObjectId$Referring(UnresolvedForwardReference, Class)>
	//    4    6:aload_0         
	//    5    7:new             #19  <Class ArrayList>
	//    6   10:dup             
	//    7   11:invokespecial   #22  <Method void ArrayList()>
	//    8   14:putfield        #24  <Field List next>
		_parent = ccumulator;
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:putfield        #26  <Field CollectionDeserializer$CollectionReferringAccumulator _parent>
	//   12   22:return          
	}
}
