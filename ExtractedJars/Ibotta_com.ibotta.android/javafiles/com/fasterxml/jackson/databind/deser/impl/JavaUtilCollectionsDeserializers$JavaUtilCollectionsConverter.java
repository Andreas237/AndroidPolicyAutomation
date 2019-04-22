// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.deser.impl:
//			JavaUtilCollectionsDeserializers

private static class JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter
	implements Converter
{

	private void _checkSingleton(int i)
	{
		if(i == 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          6
		{
			return;
	//    3    5:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4    6:new             #31  <Class StringBuilder>
	//    5    9:dup             
	//    6   10:invokespecial   #32  <Method void StringBuilder()>
	//    7   13:astore_2        
			stringbuilder.append("Can not deserialize Singleton container from ");
	//    8   14:aload_2         
	//    9   15:ldc1            #34  <String "Can not deserialize Singleton container from ">
	//   10   17:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
			stringbuilder.append(i);
	//   12   21:aload_2         
	//   13   22:iload_1         
	//   14   23:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
	//   15   26:pop             
			stringbuilder.append(" entries");
	//   16   27:aload_2         
	//   17   28:ldc1            #43  <String " entries">
	//   18   30:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   19   33:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   20   34:new             #45  <Class IllegalArgumentException>
	//   21   37:dup             
	//   22   38:aload_2         
	//   23   39:invokevirtual   #49  <Method String StringBuilder.toString()>
	//   24   42:invokespecial   #52  <Method void IllegalArgumentException(String)>
	//   25   45:athrow          
		}
	}

	public Object convert(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return ((Object) (null));
	//    2    4:aconst_null     
	//    3    5:areturn         
		switch(_kind)
	//*   4    6:aload_0         
	//*   5    7:getfield        #23  <Field int _kind>
		{
	//*   6   10:tableswitch     1 6: default 48
	//	               1 151
	//	               2 125
	//	               3 74
	//	               4 66
	//	               5 58
	//	               6 50
		default:
			return obj;
	//    7   48:aload_1         
	//    8   49:areturn         

		case 6: // '\006'
			return ((Object) (Collections.unmodifiableMap((Map)obj)));
	//    9   50:aload_1         
	//   10   51:checkcast       #56  <Class Map>
	//   11   54:invokestatic    #62  <Method Map Collections.unmodifiableMap(Map)>
	//   12   57:areturn         

		case 5: // '\005'
			return ((Object) (Collections.unmodifiableList((List)obj)));
	//   13   58:aload_1         
	//   14   59:checkcast       #64  <Class List>
	//   15   62:invokestatic    #68  <Method List Collections.unmodifiableList(List)>
	//   16   65:areturn         

		case 4: // '\004'
			return ((Object) (Collections.unmodifiableSet((Set)obj)));
	//   17   66:aload_1         
	//   18   67:checkcast       #70  <Class Set>
	//   19   70:invokestatic    #74  <Method Set Collections.unmodifiableSet(Set)>
	//   20   73:areturn         

		case 3: // '\003'
			obj = ((Object) ((Map)obj));
	//   21   74:aload_1         
	//   22   75:checkcast       #56  <Class Map>
	//   23   78:astore_1        
			_checkSingleton(((Map) (obj)).size());
	//   24   79:aload_0         
	//   25   80:aload_1         
	//   26   81:invokeinterface #78  <Method int Map.size()>
	//   27   86:invokespecial   #80  <Method void _checkSingleton(int)>
			obj = ((Object) ((java.util.Map.Entry)((Map) (obj)).entrySet().iterator().next()));
	//   28   89:aload_1         
	//   29   90:invokeinterface #84  <Method Set Map.entrySet()>
	//   30   95:invokeinterface #88  <Method Iterator Set.iterator()>
	//   31  100:invokeinterface #94  <Method Object Iterator.next()>
	//   32  105:checkcast       #96  <Class java.util.Map$Entry>
	//   33  108:astore_1        
			return ((Object) (Collections.singletonMap(((java.util.Map.Entry) (obj)).getKey(), ((java.util.Map.Entry) (obj)).getValue())));
	//   34  109:aload_1         
	//   35  110:invokeinterface #99  <Method Object java.util.Map$Entry.getKey()>
	//   36  115:aload_1         
	//   37  116:invokeinterface #102 <Method Object java.util.Map$Entry.getValue()>
	//   38  121:invokestatic    #106 <Method Map Collections.singletonMap(Object, Object)>
	//   39  124:areturn         

		case 2: // '\002'
			obj = ((Object) ((List)obj));
	//   40  125:aload_1         
	//   41  126:checkcast       #64  <Class List>
	//   42  129:astore_1        
			_checkSingleton(((List) (obj)).size());
	//   43  130:aload_0         
	//   44  131:aload_1         
	//   45  132:invokeinterface #107 <Method int List.size()>
	//   46  137:invokespecial   #80  <Method void _checkSingleton(int)>
			return ((Object) (Collections.singletonList(((List) (obj)).get(0))));
	//   47  140:aload_1         
	//   48  141:iconst_0        
	//   49  142:invokeinterface #111 <Method Object List.get(int)>
	//   50  147:invokestatic    #115 <Method List Collections.singletonList(Object)>
	//   51  150:areturn         

		case 1: // '\001'
			obj = ((Object) ((Set)obj));
	//   52  151:aload_1         
	//   53  152:checkcast       #70  <Class Set>
	//   54  155:astore_1        
			_checkSingleton(((Set) (obj)).size());
	//   55  156:aload_0         
	//   56  157:aload_1         
	//   57  158:invokeinterface #116 <Method int Set.size()>
	//   58  163:invokespecial   #80  <Method void _checkSingleton(int)>
			return ((Object) (Collections.singleton(((Set) (obj)).iterator().next())));
	//   59  166:aload_1         
	//   60  167:invokeinterface #88  <Method Iterator Set.iterator()>
	//   61  172:invokeinterface #94  <Method Object Iterator.next()>
	//   62  177:invokestatic    #120 <Method Set Collections.singleton(Object)>
	//   63  180:areturn         
		}
	}

	public JavaType getInputType(TypeFactory typefactory)
	{
		return _inputType;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field JavaType _inputType>
	//    2    4:areturn         
	}

	public JavaType getOutputType(TypeFactory typefactory)
	{
		return _inputType;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field JavaType _inputType>
	//    2    4:areturn         
	}

	private final JavaType _inputType;
	private final int _kind;

	private JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter(int i, JavaType javatype)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		_inputType = javatype;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #21  <Field JavaType _inputType>
		_kind = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #23  <Field int _kind>
	//    8   14:return          
	}

	JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter(int i, JavaType javatype, JavaUtilCollectionsDeserializers._cls1 _pcls1)
	{
		this(i, javatype);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #27  <Method void JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter(int, JavaType)>
	//    4    6:return          
	}
}
