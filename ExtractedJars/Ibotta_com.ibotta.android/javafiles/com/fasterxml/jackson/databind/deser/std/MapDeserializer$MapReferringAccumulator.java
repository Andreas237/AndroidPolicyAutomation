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
			List list = _accumulator;
	//   11   25:aload_0         
	//   12   26:getfield        #26  <Field List _accumulator>
	//   13   29:astore_3        
			((MapDeserializer.MapReferring)list.get(list.size() - 1)).next.put(obj, obj1);
	//   14   30:aload_3         
	//   15   31:aload_3         
	//   16   32:invokeinterface #61  <Method int List.size()>
	//   17   37:iconst_1        
	//   18   38:isub            
	//   19   39:invokeinterface #65  <Method Object List.get(int)>
	//   20   44:checkcast       #37  <Class MapDeserializer$MapReferring>
	//   21   47:getfield        #68  <Field Map MapDeserializer$MapReferring.next>
	//   22   50:aload_1         
	//   23   51:aload_2         
	//   24   52:invokeinterface #57  <Method Object Map.put(Object, Object)>
	//   25   57:pop             
			return;
	//   26   58:return          
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
		obj1 = ((Object) (new StringBuilder()));
	//   35   88:new             #99  <Class StringBuilder>
	//   36   91:dup             
	//   37   92:invokespecial   #100 <Method void StringBuilder()>
	//   38   95:astore_2        
		((StringBuilder) (obj1)).append("Trying to resolve a forward reference with id [");
	//   39   96:aload_2         
	//   40   97:ldc1            #102 <String "Trying to resolve a forward reference with id [">
	//   41   99:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   42  102:pop             
		((StringBuilder) (obj1)).append(obj);
	//   43  103:aload_2         
	//   44  104:aload_1         
	//   45  105:invokevirtual   #109 <Method StringBuilder StringBuilder.append(Object)>
	//   46  108:pop             
		((StringBuilder) (obj1)).append("] that wasn't previously seen as unresolved.");
	//   47  109:aload_2         
	//   48  110:ldc1            #111 <String "] that wasn't previously seen as unresolved.">
	//   49  112:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   50  115:pop             
		throw new IllegalArgumentException(((StringBuilder) (obj1)).toString());
	//   51  116:new             #113 <Class IllegalArgumentException>
	//   52  119:dup             
	//   53  120:aload_2         
	//   54  121:invokevirtual   #117 <Method String StringBuilder.toString()>
	//   55  124:invokespecial   #120 <Method void IllegalArgumentException(String)>
	//   56  127:athrow          
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
