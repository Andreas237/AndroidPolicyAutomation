// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			MapDeserializer

private static final class MapDeserializer$MapReferringAccumulator
{

	public com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring handleUnresolvedReference(UnresolvedForwardReference unresolvedforwardreference, Object obj)
	{
		unresolvedforwardreference = ((UnresolvedForwardReference) (new MapDeserializer.MapReferring(this, unresolvedforwardreference, _valueType, obj)));
	//    0    0:new             #37  <Class MapDeserializer$MapReferring>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #28  <Field Class _valueType>
	//    6   10:aload_2         
	//    7   11:invokespecial   #40  <Method void MapDeserializer$MapReferring(MapDeserializer$MapReferringAccumulator, UnresolvedForwardReference, Class, Object)>
	//    8   14:astore_1        
		_accumulator.add(((Object) (unresolvedforwardreference)));
	//    9   15:aload_0         
	//   10   16:getfield        #26  <Field List _accumulator>
	//   11   19:aload_1         
	//   12   20:invokeinterface #46  <Method boolean List.add(Object)>
	//   13   25:pop             
		return ((com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring) (unresolvedforwardreference));
	//   14   26:aload_1         
	//   15   27:areturn         
	}

	public void put(Object obj, Object obj1)
	{
		if(_accumulator.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field List _accumulator>
	//*   2    4:invokeinterface #52  <Method boolean List.isEmpty()>
	//*   3    9:ifeq            25
		{
			_result.put(obj, obj1);
	//    4   12:aload_0         
	//    5   13:getfield        #30  <Field Map _result>
	//    6   16:aload_1         
	//    7   17:aload_2         
	//    8   18:invokeinterface #57  <Method Object Map.put(Object, Object)>
	//    9   23:pop             
			return;
	//   10   24:return          
		} else
		{
			((MapDeserializer.MapReferring)_accumulator.get(_accumulator.size() - 1)).next.put(obj, obj1);
	//   11   25:aload_0         
	//   12   26:getfield        #26  <Field List _accumulator>
	//   13   29:aload_0         
	//   14   30:getfield        #26  <Field List _accumulator>
	//   15   33:invokeinterface #61  <Method int List.size()>
	//   16   38:iconst_1        
	//   17   39:isub            
	//   18   40:invokeinterface #65  <Method Object List.get(int)>
	//   19   45:checkcast       #37  <Class MapDeserializer$MapReferring>
	//   20   48:getfield        #68  <Field Map MapDeserializer$MapReferring.next>
	//   21   51:aload_1         
	//   22   52:aload_2         
	//   23   53:invokeinterface #57  <Method Object Map.put(Object, Object)>
	//   24   58:pop             
			return;
	//   25   59:return          
		}
	}

	public void resolveForwardReference(Object obj, Object obj1)
		throws IOException
	{
		Iterator iterator = _accumulator.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field List _accumulator>
	//    2    4:invokeinterface #75  <Method Iterator List.iterator()>
	//    3    9:astore          4
		MapDeserializer.MapReferring mapreferring;
		for(Map map = _result; iterator.hasNext(); map = mapreferring.next)
	//*   4   11:aload_0         
	//*   5   12:getfield        #30  <Field Map _result>
	//*   6   15:astore_3        
	//*   7   16:aload           4
	//*   8   18:invokeinterface #80  <Method boolean Iterator.hasNext()>
	//*   9   23:ifeq            88
		{
			mapreferring = (MapDeserializer.MapReferring)iterator.next();
	//   10   26:aload           4
	//   11   28:invokeinterface #83  <Method Object Iterator.next()>
	//   12   33:checkcast       #37  <Class MapDeserializer$MapReferring>
	//   13   36:astore          5
			if(mapreferring.hasId(obj))
	//*  14   38:aload           5
	//*  15   40:aload_1         
	//*  16   41:invokevirtual   #86  <Method boolean MapDeserializer$MapReferring.hasId(Object)>
	//*  17   44:ifeq            79
			{
				iterator.remove();
	//   18   47:aload           4
	//   19   49:invokeinterface #89  <Method void Iterator.remove()>
				map.put(mapreferring.key, obj1);
	//   20   54:aload_3         
	//   21   55:aload           5
	//   22   57:getfield        #93  <Field Object MapDeserializer$MapReferring.key>
	//   23   60:aload_2         
	//   24   61:invokeinterface #57  <Method Object Map.put(Object, Object)>
	//   25   66:pop             
				map.putAll(mapreferring.next);
	//   26   67:aload_3         
	//   27   68:aload           5
	//   28   70:getfield        #68  <Field Map MapDeserializer$MapReferring.next>
	//   29   73:invokeinterface #97  <Method void Map.putAll(Map)>
				return;
	//   30   78:return          
			}
		}

	//   31   79:aload           5
	//   32   81:getfield        #68  <Field Map MapDeserializer$MapReferring.next>
	//   33   84:astore_3        
	//*  34   85:goto            16
		throw new IllegalArgumentException((new StringBuilder()).append("Trying to resolve a forward reference with id [").append(obj).append("] that wasn't previously seen as unresolved.").toString());
	//   35   88:new             #99  <Class IllegalArgumentException>
	//   36   91:dup             
	//   37   92:new             #101 <Class StringBuilder>
	//   38   95:dup             
	//   39   96:invokespecial   #102 <Method void StringBuilder()>
	//   40   99:ldc1            #104 <String "Trying to resolve a forward reference with id [">
	//   41  101:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   42  104:aload_1         
	//   43  105:invokevirtual   #111 <Method StringBuilder StringBuilder.append(Object)>
	//   44  108:ldc1            #113 <String "] that wasn't previously seen as unresolved.">
	//   45  110:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   46  113:invokevirtual   #117 <Method String StringBuilder.toString()>
	//   47  116:invokespecial   #120 <Method void IllegalArgumentException(String)>
	//   48  119:athrow          
	}

	private List _accumulator;
	private Map _result;
	private final Class _valueType;

	public MapDeserializer$MapReferringAccumulator(Class class1, Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		_accumulator = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #23  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #24  <Method void ArrayList()>
	//    6   12:putfield        #26  <Field List _accumulator>
		_valueType = class1;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #28  <Field Class _valueType>
		_result = map;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #30  <Field Map _result>
	//   13   25:return          
	}
}
