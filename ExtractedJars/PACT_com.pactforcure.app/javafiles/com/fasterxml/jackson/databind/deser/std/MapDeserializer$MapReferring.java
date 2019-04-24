// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			MapDeserializer

static final class MapDeserializer$MapReferring extends com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring
{

	public void handleResolvedForwardReference(Object obj, Object obj1)
		throws IOException
	{
		_parent.resolveForwardReference(obj, obj1);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field MapDeserializer$MapReferringAccumulator _parent>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #42  <Method void MapDeserializer$MapReferringAccumulator.resolveForwardReference(Object, Object)>
	//    5    9:return          
	}

	private final ccumulator _parent;
	public final Object key;
	public final Map next = new LinkedHashMap();

	MapDeserializer$MapReferring(ccumulator ccumulator, UnresolvedForwardReference unresolvedforwardreference, Class class1, Object obj)
	{
		super(unresolvedforwardreference, class1);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokespecial   #19  <Method void com.fasterxml.jackson.databind.deser.impl.ReadableObjectId$Referring(UnresolvedForwardReference, Class)>
	//    4    6:aload_0         
	//    5    7:new             #21  <Class LinkedHashMap>
	//    6   10:dup             
	//    7   11:invokespecial   #24  <Method void LinkedHashMap()>
	//    8   14:putfield        #26  <Field Map next>
		_parent = ccumulator;
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:putfield        #28  <Field MapDeserializer$MapReferringAccumulator _parent>
		key = obj;
	//   12   22:aload_0         
	//   13   23:aload           4
	//   14   25:putfield        #30  <Field Object key>
	//   15   28:return          
	}
}
