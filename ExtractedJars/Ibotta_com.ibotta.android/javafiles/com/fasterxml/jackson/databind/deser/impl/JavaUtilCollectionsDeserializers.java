// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import java.util.*;

public abstract class JavaUtilCollectionsDeserializers
{
	private static class JavaUtilCollectionsConverter
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
		//		               1 151
		//		               2 125
		//		               3 74
		//		               4 66
		//		               5 58
		//		               6 50
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

		private JavaUtilCollectionsConverter(int i, JavaType javatype)
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

	}


	static JavaUtilCollectionsConverter converter(int i, JavaType javatype, Class class1)
	{
		return new JavaUtilCollectionsConverter(i, javatype.findSuperType(class1));
	//    0    0:new             #8   <Class JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #89  <Method JavaType JavaType.findSuperType(Class)>
	//    6   10:aconst_null     
	//    7   11:invokespecial   #93  <Method void JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter(int, JavaType, JavaUtilCollectionsDeserializers$1)>
	//    8   14:areturn         
	}

	public static JsonDeserializer findForCollection(DeserializationContext deserializationcontext, JavaType javatype)
		throws JsonMappingException
	{
label0:
		{
			if(javatype.hasRawClass(CLASS_AS_ARRAYS_LIST))
	//*   0    0:aload_1         
	//*   1    1:getstatic       #32  <Field Class CLASS_AS_ARRAYS_LIST>
	//*   2    4:invokevirtual   #103 <Method boolean JavaType.hasRawClass(Class)>
	//*   3    7:ifeq            22
				deserializationcontext = ((DeserializationContext) (converter(7, javatype, java/util/List)));
	//    4   10:bipush          7
	//    5   12:aload_1         
	//    6   13:ldc1            #105 <Class List>
	//    7   15:invokestatic    #107 <Method JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter converter(int, JavaType, Class)>
	//    8   18:astore_0        
			else
	//*   9   19:goto            103
			if(javatype.hasRawClass(CLASS_SINGLETON_LIST))
	//*  10   22:aload_1         
	//*  11   23:getstatic       #58  <Field Class CLASS_SINGLETON_LIST>
	//*  12   26:invokevirtual   #103 <Method boolean JavaType.hasRawClass(Class)>
	//*  13   29:ifeq            43
				deserializationcontext = ((DeserializationContext) (converter(2, javatype, java/util/List)));
	//   14   32:iconst_2        
	//   15   33:aload_1         
	//   16   34:ldc1            #105 <Class List>
	//   17   36:invokestatic    #107 <Method JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter converter(int, JavaType, Class)>
	//   18   39:astore_0        
			else
	//*  19   40:goto            103
			if(javatype.hasRawClass(CLASS_SINGLETON_SET))
	//*  20   43:aload_1         
	//*  21   44:getstatic       #46  <Field Class CLASS_SINGLETON_SET>
	//*  22   47:invokevirtual   #103 <Method boolean JavaType.hasRawClass(Class)>
	//*  23   50:ifeq            64
				deserializationcontext = ((DeserializationContext) (converter(1, javatype, java/util/Set)));
	//   24   53:iconst_1        
	//   25   54:aload_1         
	//   26   55:ldc1            #109 <Class Set>
	//   27   57:invokestatic    #107 <Method JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter converter(int, JavaType, Class)>
	//   28   60:astore_0        
			else
	//*  29   61:goto            103
			if(javatype.hasRawClass(CLASS_UNMODIFIABLE_LIST))
	//*  30   64:aload_1         
	//*  31   65:getstatic       #64  <Field Class CLASS_UNMODIFIABLE_LIST>
	//*  32   68:invokevirtual   #103 <Method boolean JavaType.hasRawClass(Class)>
	//*  33   71:ifeq            85
			{
				deserializationcontext = ((DeserializationContext) (converter(5, javatype, java/util/List)));
	//   34   74:iconst_5        
	//   35   75:aload_1         
	//   36   76:ldc1            #105 <Class List>
	//   37   78:invokestatic    #107 <Method JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter converter(int, JavaType, Class)>
	//   38   81:astore_0        
			} else
	//*  39   82:goto            103
			{
				if(!javatype.hasRawClass(CLASS_UNMODIFIABLE_SET))
					break label0;
	//   40   85:aload_1         
	//   41   86:getstatic       #52  <Field Class CLASS_UNMODIFIABLE_SET>
	//   42   89:invokevirtual   #103 <Method boolean JavaType.hasRawClass(Class)>
	//   43   92:ifeq            112
				deserializationcontext = ((DeserializationContext) (converter(4, javatype, java/util/Set)));
	//   44   95:iconst_4        
	//   45   96:aload_1         
	//   46   97:ldc1            #109 <Class Set>
	//   47   99:invokestatic    #107 <Method JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter converter(int, JavaType, Class)>
	//   48  102:astore_0        
			}
			return ((JsonDeserializer) (new StdDelegatingDeserializer(((Converter) (deserializationcontext)))));
	//   49  103:new             #111 <Class StdDelegatingDeserializer>
	//   50  106:dup             
	//   51  107:aload_0         
	//   52  108:invokespecial   #114 <Method void StdDelegatingDeserializer(Converter)>
	//   53  111:areturn         
		}
		return null;
	//   54  112:aconst_null     
	//   55  113:areturn         
	}

	public static JsonDeserializer findForMap(DeserializationContext deserializationcontext, JavaType javatype)
		throws JsonMappingException
	{
label0:
		{
			if(javatype.hasRawClass(CLASS_SINGLETON_MAP))
	//*   0    0:aload_1         
	//*   1    1:getstatic       #74  <Field Class CLASS_SINGLETON_MAP>
	//*   2    4:invokevirtual   #103 <Method boolean JavaType.hasRawClass(Class)>
	//*   3    7:ifeq            21
			{
				deserializationcontext = ((DeserializationContext) (converter(3, javatype, java/util/Map)));
	//    4   10:iconst_3        
	//    5   11:aload_1         
	//    6   12:ldc1            #119 <Class Map>
	//    7   14:invokestatic    #107 <Method JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter converter(int, JavaType, Class)>
	//    8   17:astore_0        
			} else
	//*   9   18:goto            40
			{
				if(!javatype.hasRawClass(CLASS_UNMODIFIABLE_MAP))
					break label0;
	//   10   21:aload_1         
	//   11   22:getstatic       #80  <Field Class CLASS_UNMODIFIABLE_MAP>
	//   12   25:invokevirtual   #103 <Method boolean JavaType.hasRawClass(Class)>
	//   13   28:ifeq            49
				deserializationcontext = ((DeserializationContext) (converter(6, javatype, java/util/Map)));
	//   14   31:bipush          6
	//   15   33:aload_1         
	//   16   34:ldc1            #119 <Class Map>
	//   17   36:invokestatic    #107 <Method JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter converter(int, JavaType, Class)>
	//   18   39:astore_0        
			}
			return ((JsonDeserializer) (new StdDelegatingDeserializer(((Converter) (deserializationcontext)))));
	//   19   40:new             #111 <Class StdDelegatingDeserializer>
	//   20   43:dup             
	//   21   44:aload_0         
	//   22   45:invokespecial   #114 <Method void StdDelegatingDeserializer(Converter)>
	//   23   48:areturn         
		}
		return null;
	//   24   49:aconst_null     
	//   25   50:areturn         
	}

	private static final Class CLASS_AS_ARRAYS_LIST = ((Object) (Arrays.asList(new Object[] {
		null, null
	}))).getClass();
	private static final Class CLASS_SINGLETON_LIST;
	private static final Class CLASS_SINGLETON_MAP;
	private static final Class CLASS_SINGLETON_SET;
	private static final Class CLASS_UNMODIFIABLE_LIST;
	private static final Class CLASS_UNMODIFIABLE_MAP;
	private static final Class CLASS_UNMODIFIABLE_SET;

	static 
	{
	//    0    0:iconst_2        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aconst_null     
	//    5    7:aastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:aconst_null     
	//    9   11:aastore         
	//   10   12:invokestatic    #26  <Method List Arrays.asList(Object[])>
	//   11   15:invokevirtual   #30  <Method Class Object.getClass()>
	//   12   18:putstatic       #32  <Field Class CLASS_AS_ARRAYS_LIST>
		Object obj = ((Object) (Collections.singleton(((Object) (Boolean.TRUE)))));
	//   13   21:getstatic       #38  <Field Boolean Boolean.TRUE>
	//   14   24:invokestatic    #44  <Method Set Collections.singleton(Object)>
	//   15   27:astore_0        
		CLASS_SINGLETON_SET = obj.getClass();
	//   16   28:aload_0         
	//   17   29:invokevirtual   #30  <Method Class Object.getClass()>
	//   18   32:putstatic       #46  <Field Class CLASS_SINGLETON_SET>
		CLASS_UNMODIFIABLE_SET = ((Object) (Collections.unmodifiableSet(((Set) (obj))))).getClass();
	//   19   35:aload_0         
	//   20   36:invokestatic    #50  <Method Set Collections.unmodifiableSet(Set)>
	//   21   39:invokevirtual   #30  <Method Class Object.getClass()>
	//   22   42:putstatic       #52  <Field Class CLASS_UNMODIFIABLE_SET>
		obj = ((Object) (Collections.singletonList(((Object) (Boolean.TRUE)))));
	//   23   45:getstatic       #38  <Field Boolean Boolean.TRUE>
	//   24   48:invokestatic    #56  <Method List Collections.singletonList(Object)>
	//   25   51:astore_0        
		CLASS_SINGLETON_LIST = obj.getClass();
	//   26   52:aload_0         
	//   27   53:invokevirtual   #30  <Method Class Object.getClass()>
	//   28   56:putstatic       #58  <Field Class CLASS_SINGLETON_LIST>
		CLASS_UNMODIFIABLE_LIST = ((Object) (Collections.unmodifiableList(((List) (obj))))).getClass();
	//   29   59:aload_0         
	//   30   60:invokestatic    #62  <Method List Collections.unmodifiableList(List)>
	//   31   63:invokevirtual   #30  <Method Class Object.getClass()>
	//   32   66:putstatic       #64  <Field Class CLASS_UNMODIFIABLE_LIST>
		obj = ((Object) (Collections.singletonMap("a", "b")));
	//   33   69:ldc1            #66  <String "a">
	//   34   71:ldc1            #68  <String "b">
	//   35   73:invokestatic    #72  <Method Map Collections.singletonMap(Object, Object)>
	//   36   76:astore_0        
		CLASS_SINGLETON_MAP = obj.getClass();
	//   37   77:aload_0         
	//   38   78:invokevirtual   #30  <Method Class Object.getClass()>
	//   39   81:putstatic       #74  <Field Class CLASS_SINGLETON_MAP>
		CLASS_UNMODIFIABLE_MAP = ((Object) (Collections.unmodifiableMap(((Map) (obj))))).getClass();
	//   40   84:aload_0         
	//   41   85:invokestatic    #78  <Method Map Collections.unmodifiableMap(Map)>
	//   42   88:invokevirtual   #30  <Method Class Object.getClass()>
	//   43   91:putstatic       #80  <Field Class CLASS_UNMODIFIABLE_MAP>
	//*  44   94:return          
	}
}
