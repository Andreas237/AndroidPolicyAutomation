// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.module;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.type.*;
import java.io.Serializable;
import java.util.*;

public class SimpleSerializers extends com.fasterxml.jackson.databind.ser.Serializers.Base
	implements Serializable
{

	public SimpleSerializers()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void com.fasterxml.jackson.databind.ser.Serializers$Base()>
		_classMappings = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #22  <Field HashMap _classMappings>
		_interfaceMappings = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #24  <Field HashMap _interfaceMappings>
		_hasEnumSerializer = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #26  <Field boolean _hasEnumSerializer>
	//   11   19:return          
	}

	public SimpleSerializers(List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void com.fasterxml.jackson.databind.ser.Serializers$Base()>
		_classMappings = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #22  <Field HashMap _classMappings>
		_interfaceMappings = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #24  <Field HashMap _interfaceMappings>
		_hasEnumSerializer = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #26  <Field boolean _hasEnumSerializer>
		addSerializers(list);
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokevirtual   #31  <Method void addSerializers(List)>
	//   14   24:return          
	}

	protected void _addSerializer(Class class1, JsonSerializer jsonserializer)
	{
		ClassKey classkey = new ClassKey(class1);
	//    0    0:new             #37  <Class ClassKey>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #40  <Method void ClassKey(Class)>
	//    4    8:astore_3        
		if(class1.isInterface())
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #46  <Method boolean Class.isInterface()>
	//*   7   13:ifeq            45
		{
			if(_interfaceMappings == null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #24  <Field HashMap _interfaceMappings>
	//*  10   20:ifnonnull       34
				_interfaceMappings = new HashMap();
	//   11   23:aload_0         
	//   12   24:new             #48  <Class HashMap>
	//   13   27:dup             
	//   14   28:invokespecial   #49  <Method void HashMap()>
	//   15   31:putfield        #24  <Field HashMap _interfaceMappings>
			_interfaceMappings.put(((Object) (classkey)), ((Object) (jsonserializer)));
	//   16   34:aload_0         
	//   17   35:getfield        #24  <Field HashMap _interfaceMappings>
	//   18   38:aload_3         
	//   19   39:aload_2         
	//   20   40:invokevirtual   #53  <Method Object HashMap.put(Object, Object)>
	//   21   43:pop             
			return;
	//   22   44:return          
		}
		if(_classMappings == null)
	//*  23   45:aload_0         
	//*  24   46:getfield        #22  <Field HashMap _classMappings>
	//*  25   49:ifnonnull       63
			_classMappings = new HashMap();
	//   26   52:aload_0         
	//   27   53:new             #48  <Class HashMap>
	//   28   56:dup             
	//   29   57:invokespecial   #49  <Method void HashMap()>
	//   30   60:putfield        #22  <Field HashMap _classMappings>
		_classMappings.put(((Object) (classkey)), ((Object) (jsonserializer)));
	//   31   63:aload_0         
	//   32   64:getfield        #22  <Field HashMap _classMappings>
	//   33   67:aload_3         
	//   34   68:aload_2         
	//   35   69:invokevirtual   #53  <Method Object HashMap.put(Object, Object)>
	//   36   72:pop             
		if(class1 == java/lang/Enum)
	//*  37   73:aload_1         
	//*  38   74:ldc1            #55  <Class Enum>
	//*  39   76:if_acmpne       84
			_hasEnumSerializer = true;
	//   40   79:aload_0         
	//   41   80:iconst_1        
	//   42   81:putfield        #26  <Field boolean _hasEnumSerializer>
	//   43   84:return          
	}

	protected JsonSerializer _findInterfaceMapping(Class class1, ClassKey classkey)
	{
		class1 = ((Class) (class1.getInterfaces()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #62  <Method Class[] Class.getInterfaces()>
	//    2    4:astore_1        
		int j = class1.length;
	//    3    5:aload_1         
	//    4    6:arraylength     
	//    5    7:istore          4
		for(int i = 0; i < j; i++)
	//*   6    9:iconst_0        
	//*   7   10:istore_3        
	//*   8   11:iload_3         
	//*   9   12:iload           4
	//*  10   14:icmpge          73
		{
			Object obj = ((Object) (class1[i]));
	//   11   17:aload_1         
	//   12   18:iload_3         
	//   13   19:aaload          
	//   14   20:astore          5
			classkey.reset(((Class) (obj)));
	//   15   22:aload_2         
	//   16   23:aload           5
	//   17   25:invokevirtual   #65  <Method void ClassKey.reset(Class)>
			JsonSerializer jsonserializer = (JsonSerializer)_interfaceMappings.get(((Object) (classkey)));
	//   18   28:aload_0         
	//   19   29:getfield        #24  <Field HashMap _interfaceMappings>
	//   20   32:aload_2         
	//   21   33:invokevirtual   #69  <Method Object HashMap.get(Object)>
	//   22   36:checkcast       #71  <Class JsonSerializer>
	//   23   39:astore          6
			if(jsonserializer != null)
	//*  24   41:aload           6
	//*  25   43:ifnull          49
				return jsonserializer;
	//   26   46:aload           6
	//   27   48:areturn         
			obj = ((Object) (_findInterfaceMapping(((Class) (obj)), classkey)));
	//   28   49:aload_0         
	//   29   50:aload           5
	//   30   52:aload_2         
	//   31   53:invokevirtual   #73  <Method JsonSerializer _findInterfaceMapping(Class, ClassKey)>
	//   32   56:astore          5
			if(obj != null)
	//*  33   58:aload           5
	//*  34   60:ifnull          66
				return ((JsonSerializer) (obj));
	//   35   63:aload           5
	//   36   65:areturn         
		}

	//   37   66:iload_3         
	//   38   67:iconst_1        
	//   39   68:iadd            
	//   40   69:istore_3        
	//*  41   70:goto            11
		return null;
	//   42   73:aconst_null     
	//   43   74:areturn         
	}

	public void addSerializer(JsonSerializer jsonserializer)
	{
		Class class1 = jsonserializer.handledType();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #80  <Method Class JsonSerializer.handledType()>
	//    2    4:astore_2        
		if(class1 != null && class1 != java/lang/Object)
	//*   3    5:aload_2         
	//*   4    6:ifnull          22
	//*   5    9:aload_2         
	//*   6   10:ldc1            #82  <Class Object>
	//*   7   12:if_acmpeq       22
		{
			_addSerializer(class1, jsonserializer);
	//    8   15:aload_0         
	//    9   16:aload_2         
	//   10   17:aload_1         
	//   11   18:invokevirtual   #84  <Method void _addSerializer(Class, JsonSerializer)>
			return;
	//   12   21:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   13   22:new             #86  <Class StringBuilder>
	//   14   25:dup             
	//   15   26:invokespecial   #87  <Method void StringBuilder()>
	//   16   29:astore_2        
			stringbuilder.append("JsonSerializer of type ");
	//   17   30:aload_2         
	//   18   31:ldc1            #89  <String "JsonSerializer of type ">
	//   19   33:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   20   36:pop             
			stringbuilder.append(((Object) (jsonserializer)).getClass().getName());
	//   21   37:aload_2         
	//   22   38:aload_1         
	//   23   39:invokevirtual   #96  <Method Class Object.getClass()>
	//   24   42:invokevirtual   #100 <Method String Class.getName()>
	//   25   45:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   26   48:pop             
			stringbuilder.append(" does not define valid handledType() -- must either register with method that takes type argument ");
	//   27   49:aload_2         
	//   28   50:ldc1            #102 <String " does not define valid handledType() -- must either register with method that takes type argument ">
	//   29   52:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   30   55:pop             
			stringbuilder.append(" or make serializer extend 'com.fasterxml.jackson.databind.ser.std.StdSerializer'");
	//   31   56:aload_2         
	//   32   57:ldc1            #104 <String " or make serializer extend 'com.fasterxml.jackson.databind.ser.std.StdSerializer'">
	//   33   59:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   35   63:new             #106 <Class IllegalArgumentException>
	//   36   66:dup             
	//   37   67:aload_2         
	//   38   68:invokevirtual   #109 <Method String StringBuilder.toString()>
	//   39   71:invokespecial   #112 <Method void IllegalArgumentException(String)>
	//   40   74:athrow          
		}
	}

	public void addSerializer(Class class1, JsonSerializer jsonserializer)
	{
		_addSerializer(class1, jsonserializer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #84  <Method void _addSerializer(Class, JsonSerializer)>
	//    4    6:return          
	}

	public void addSerializers(List list)
	{
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); addSerializer((JsonSerializer)((Iterator) (list)).next()));
	//    0    0:aload_1         
	//    1    1:invokeinterface #120 <Method Iterator List.iterator()>
	//    2    6:astore_1        
	//    3    7:aload_1         
	//    4    8:invokeinterface #125 <Method boolean Iterator.hasNext()>
	//    5   13:ifeq            32
	//    6   16:aload_0         
	//    7   17:aload_1         
	//    8   18:invokeinterface #129 <Method Object Iterator.next()>
	//    9   23:checkcast       #71  <Class JsonSerializer>
	//   10   26:invokevirtual   #131 <Method void addSerializer(JsonSerializer)>
	//*  11   29:goto            7
	//   12   32:return          
	}

	public JsonSerializer findArraySerializer(SerializationConfig serializationconfig, ArrayType arraytype, BeanDescription beandescription, TypeSerializer typeserializer, JsonSerializer jsonserializer)
	{
		return findSerializer(serializationconfig, ((JavaType) (arraytype)), beandescription);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #137 <Method JsonSerializer findSerializer(SerializationConfig, JavaType, BeanDescription)>
	//    5    7:areturn         
	}

	public JsonSerializer findCollectionLikeSerializer(SerializationConfig serializationconfig, CollectionLikeType collectionliketype, BeanDescription beandescription, TypeSerializer typeserializer, JsonSerializer jsonserializer)
	{
		return findSerializer(serializationconfig, ((JavaType) (collectionliketype)), beandescription);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #137 <Method JsonSerializer findSerializer(SerializationConfig, JavaType, BeanDescription)>
	//    5    7:areturn         
	}

	public JsonSerializer findCollectionSerializer(SerializationConfig serializationconfig, CollectionType collectiontype, BeanDescription beandescription, TypeSerializer typeserializer, JsonSerializer jsonserializer)
	{
		return findSerializer(serializationconfig, ((JavaType) (collectiontype)), beandescription);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #137 <Method JsonSerializer findSerializer(SerializationConfig, JavaType, BeanDescription)>
	//    5    7:areturn         
	}

	public JsonSerializer findMapLikeSerializer(SerializationConfig serializationconfig, MapLikeType mapliketype, BeanDescription beandescription, JsonSerializer jsonserializer, TypeSerializer typeserializer, JsonSerializer jsonserializer1)
	{
		return findSerializer(serializationconfig, ((JavaType) (mapliketype)), beandescription);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #137 <Method JsonSerializer findSerializer(SerializationConfig, JavaType, BeanDescription)>
	//    5    7:areturn         
	}

	public JsonSerializer findMapSerializer(SerializationConfig serializationconfig, MapType maptype, BeanDescription beandescription, JsonSerializer jsonserializer, TypeSerializer typeserializer, JsonSerializer jsonserializer1)
	{
		return findSerializer(serializationconfig, ((JavaType) (maptype)), beandescription);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #137 <Method JsonSerializer findSerializer(SerializationConfig, JavaType, BeanDescription)>
	//    5    7:areturn         
	}

	public JsonSerializer findSerializer(SerializationConfig serializationconfig, JavaType javatype, BeanDescription beandescription)
	{
label0:
		{
			serializationconfig = ((SerializationConfig) (javatype.getRawClass()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #155 <Method Class JavaType.getRawClass()>
	//    2    4:astore_1        
			beandescription = ((BeanDescription) (new ClassKey(((Class) (serializationconfig)))));
	//    3    5:new             #37  <Class ClassKey>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #40  <Method void ClassKey(Class)>
	//    7   13:astore_3        
			if(((Class) (serializationconfig)).isInterface())
	//*   8   14:aload_1         
	//*   9   15:invokevirtual   #46  <Method boolean Class.isInterface()>
	//*  10   18:ifeq            45
			{
				javatype = ((JavaType) (_interfaceMappings));
	//   11   21:aload_0         
	//   12   22:getfield        #24  <Field HashMap _interfaceMappings>
	//   13   25:astore_2        
				if(javatype != null)
	//*  14   26:aload_2         
	//*  15   27:ifnull          153
				{
					javatype = ((JavaType) ((JsonSerializer)((HashMap) (javatype)).get(((Object) (beandescription)))));
	//   16   30:aload_2         
	//   17   31:aload_3         
	//   18   32:invokevirtual   #69  <Method Object HashMap.get(Object)>
	//   19   35:checkcast       #71  <Class JsonSerializer>
	//   20   38:astore_2        
					if(javatype != null)
	//*  21   39:aload_2         
	//*  22   40:ifnull          153
						return ((JsonSerializer) (javatype));
	//   23   43:aload_2         
	//   24   44:areturn         
				}
			} else
			{
				Object obj = ((Object) (_classMappings));
	//   25   45:aload_0         
	//   26   46:getfield        #22  <Field HashMap _classMappings>
	//   27   49:astore          4
				if(obj != null)
	//*  28   51:aload           4
	//*  29   53:ifnull          153
				{
					obj = ((Object) ((JsonSerializer)((HashMap) (obj)).get(((Object) (beandescription)))));
	//   30   56:aload           4
	//   31   58:aload_3         
	//   32   59:invokevirtual   #69  <Method Object HashMap.get(Object)>
	//   33   62:checkcast       #71  <Class JsonSerializer>
	//   34   65:astore          4
					if(obj != null)
	//*  35   67:aload           4
	//*  36   69:ifnull          75
						return ((JsonSerializer) (obj));
	//   37   72:aload           4
	//   38   74:areturn         
					if(_hasEnumSerializer && javatype.isEnumType())
	//*  39   75:aload_0         
	//*  40   76:getfield        #26  <Field boolean _hasEnumSerializer>
	//*  41   79:ifeq            113
	//*  42   82:aload_2         
	//*  43   83:invokevirtual   #158 <Method boolean JavaType.isEnumType()>
	//*  44   86:ifeq            113
					{
						((ClassKey) (beandescription)).reset(java/lang/Enum);
	//   45   89:aload_3         
	//   46   90:ldc1            #55  <Class Enum>
	//   47   92:invokevirtual   #65  <Method void ClassKey.reset(Class)>
						javatype = ((JavaType) ((JsonSerializer)_classMappings.get(((Object) (beandescription)))));
	//   48   95:aload_0         
	//   49   96:getfield        #22  <Field HashMap _classMappings>
	//   50   99:aload_3         
	//   51  100:invokevirtual   #69  <Method Object HashMap.get(Object)>
	//   52  103:checkcast       #71  <Class JsonSerializer>
	//   53  106:astore_2        
						if(javatype != null)
	//*  54  107:aload_2         
	//*  55  108:ifnull          113
							return ((JsonSerializer) (javatype));
	//   56  111:aload_2         
	//   57  112:areturn         
					}
					for(javatype = ((JavaType) (serializationconfig)); javatype != null; javatype = ((JavaType) (((Class) (javatype)).getSuperclass())))
	//*  58  113:aload_1         
	//*  59  114:astore_2        
	//*  60  115:aload_2         
	//*  61  116:ifnull          153
					{
						((ClassKey) (beandescription)).reset(((Class) (javatype)));
	//   62  119:aload_3         
	//   63  120:aload_2         
	//   64  121:invokevirtual   #65  <Method void ClassKey.reset(Class)>
						JsonSerializer jsonserializer = (JsonSerializer)_classMappings.get(((Object) (beandescription)));
	//   65  124:aload_0         
	//   66  125:getfield        #22  <Field HashMap _classMappings>
	//   67  128:aload_3         
	//   68  129:invokevirtual   #69  <Method Object HashMap.get(Object)>
	//   69  132:checkcast       #71  <Class JsonSerializer>
	//   70  135:astore          4
						if(jsonserializer != null)
	//*  71  137:aload           4
	//*  72  139:ifnull          145
							return jsonserializer;
	//   73  142:aload           4
	//   74  144:areturn         
					}

	//   75  145:aload_2         
	//   76  146:invokevirtual   #161 <Method Class Class.getSuperclass()>
	//   77  149:astore_2        
				}
			}
	//*  78  150:goto            115
			if(_interfaceMappings == null)
				break label0;
	//   79  153:aload_0         
	//   80  154:getfield        #24  <Field HashMap _interfaceMappings>
	//   81  157:ifnull          202
			javatype = ((JavaType) (_findInterfaceMapping(((Class) (serializationconfig)), ((ClassKey) (beandescription)))));
	//   82  160:aload_0         
	//   83  161:aload_1         
	//   84  162:aload_3         
	//   85  163:invokevirtual   #73  <Method JsonSerializer _findInterfaceMapping(Class, ClassKey)>
	//   86  166:astore_2        
			if(javatype != null)
	//*  87  167:aload_2         
	//*  88  168:ifnull          173
				return ((JsonSerializer) (javatype));
	//   89  171:aload_2         
	//   90  172:areturn         
			if(((Class) (serializationconfig)).isInterface())
				break label0;
	//   91  173:aload_1         
	//   92  174:invokevirtual   #46  <Method boolean Class.isInterface()>
	//   93  177:ifne            202
			do
			{
				serializationconfig = ((SerializationConfig) (((Class) (serializationconfig)).getSuperclass()));
	//   94  180:aload_1         
	//   95  181:invokevirtual   #161 <Method Class Class.getSuperclass()>
	//   96  184:astore_1        
				if(serializationconfig == null)
					break label0;
	//   97  185:aload_1         
	//   98  186:ifnull          202
				javatype = ((JavaType) (_findInterfaceMapping(((Class) (serializationconfig)), ((ClassKey) (beandescription)))));
	//   99  189:aload_0         
	//  100  190:aload_1         
	//  101  191:aload_3         
	//  102  192:invokevirtual   #73  <Method JsonSerializer _findInterfaceMapping(Class, ClassKey)>
	//  103  195:astore_2        
			} while(javatype == null);
	//  104  196:aload_2         
	//  105  197:ifnull          180
			return ((JsonSerializer) (javatype));
	//  106  200:aload_2         
	//  107  201:areturn         
		}
		return null;
	//  108  202:aconst_null     
	//  109  203:areturn         
	}

	private static final long serialVersionUID = 0xd0de53cbL;
	protected HashMap _classMappings;
	protected boolean _hasEnumSerializer;
	protected HashMap _interfaceMappings;
}
