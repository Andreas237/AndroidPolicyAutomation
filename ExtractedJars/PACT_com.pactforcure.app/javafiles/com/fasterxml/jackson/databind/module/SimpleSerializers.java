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
		} else
	//*  22   44:return          
		{
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
	//*  39   76:if_acmpne       44
			{
				_hasEnumSerializer = true;
	//   40   79:aload_0         
	//   41   80:iconst_1        
	//   42   81:putfield        #26  <Field boolean _hasEnumSerializer>
				return;
	//   43   84:return          
			}
		}
	}

	protected JsonSerializer _findInterfaceMapping(Class class1, ClassKey classkey)
	{
		int i;
		int j;
		Class aclass[];
		aclass = class1.getInterfaces();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #62  <Method Class[] Class.getInterfaces()>
	//    2    4:astore          6
		j = aclass.length;
	//    3    6:aload           6
	//    4    8:arraylength     
	//    5    9:istore          4
		i = 0;
	//    6   11:iconst_0        
	//    7   12:istore_3        
_L5:
		Object obj;
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//    8   13:iload_3         
	//    9   14:iload           4
	//   10   16:icmpge          73
		obj = ((Object) (aclass[i]));
	//   11   19:aload           6
	//   12   21:iload_3         
	//   13   22:aaload          
	//   14   23:astore          5
		classkey.reset(((Class) (obj)));
	//   15   25:aload_2         
	//   16   26:aload           5
	//   17   28:invokevirtual   #65  <Method void ClassKey.reset(Class)>
		class1 = ((Class) ((JsonSerializer)_interfaceMappings.get(((Object) (classkey)))));
	//   18   31:aload_0         
	//   19   32:getfield        #24  <Field HashMap _interfaceMappings>
	//   20   35:aload_2         
	//   21   36:invokevirtual   #69  <Method Object HashMap.get(Object)>
	//   22   39:checkcast       #71  <Class JsonSerializer>
	//   23   42:astore_1        
		if(class1 == null) goto _L2; else goto _L1
	//   24   43:aload_1         
	//   25   44:ifnull          49
_L1:
		return ((JsonSerializer) (class1));
	//   26   47:aload_1         
	//   27   48:areturn         
_L2:
		obj = ((Object) (_findInterfaceMapping(((Class) (obj)), classkey)));
	//   28   49:aload_0         
	//   29   50:aload           5
	//   30   52:aload_2         
	//   31   53:invokevirtual   #73  <Method JsonSerializer _findInterfaceMapping(Class, ClassKey)>
	//   32   56:astore          5
		class1 = ((Class) (obj));
	//   33   58:aload           5
	//   34   60:astore_1        
		if(obj != null) goto _L1; else goto _L3
	//   35   61:aload           5
	//   36   63:ifnonnull       47
_L3:
		i++;
	//   37   66:iload_3         
	//   38   67:iconst_1        
	//   39   68:iadd            
	//   40   69:istore_3        
		if(true) goto _L5; else goto _L4
	//   41   70:goto            13
_L4:
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
		if(class1 == null || class1 == java/lang/Object)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
	//*   5    9:aload_2         
	//*   6   10:ldc1            #82  <Class Object>
	//*   7   12:if_acmpne       58
		{
			throw new IllegalArgumentException((new StringBuilder()).append("JsonSerializer of type ").append(((Object) (jsonserializer)).getClass().getName()).append(" does not define valid handledType() -- must either register with method that takes type argument ").append(" or make serializer extend 'com.fasterxml.jackson.databind.ser.std.StdSerializer'").toString());
	//    8   15:new             #84  <Class IllegalArgumentException>
	//    9   18:dup             
	//   10   19:new             #86  <Class StringBuilder>
	//   11   22:dup             
	//   12   23:invokespecial   #87  <Method void StringBuilder()>
	//   13   26:ldc1            #89  <String "JsonSerializer of type ">
	//   14   28:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   15   31:aload_1         
	//   16   32:invokevirtual   #96  <Method Class Object.getClass()>
	//   17   35:invokevirtual   #100 <Method String Class.getName()>
	//   18   38:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   19   41:ldc1            #102 <String " does not define valid handledType() -- must either register with method that takes type argument ">
	//   20   43:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   21   46:ldc1            #104 <String " or make serializer extend 'com.fasterxml.jackson.databind.ser.std.StdSerializer'">
	//   22   48:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   23   51:invokevirtual   #107 <Method String StringBuilder.toString()>
	//   24   54:invokespecial   #110 <Method void IllegalArgumentException(String)>
	//   25   57:athrow          
		} else
		{
			_addSerializer(class1, jsonserializer);
	//   26   58:aload_0         
	//   27   59:aload_2         
	//   28   60:aload_1         
	//   29   61:invokevirtual   #112 <Method void _addSerializer(Class, JsonSerializer)>
			return;
	//   30   64:return          
		}
	}

	public void addSerializer(Class class1, JsonSerializer jsonserializer)
	{
		_addSerializer(class1, jsonserializer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #112 <Method void _addSerializer(Class, JsonSerializer)>
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
	//*  10   18:ifeq            46
			{
				if(_interfaceMappings != null)
	//*  11   21:aload_0         
	//*  12   22:getfield        #24  <Field HashMap _interfaceMappings>
	//*  13   25:ifnull          152
				{
					javatype = ((JavaType) ((JsonSerializer)_interfaceMappings.get(((Object) (beandescription)))));
	//   14   28:aload_0         
	//   15   29:getfield        #24  <Field HashMap _interfaceMappings>
	//   16   32:aload_3         
	//   17   33:invokevirtual   #69  <Method Object HashMap.get(Object)>
	//   18   36:checkcast       #71  <Class JsonSerializer>
	//   19   39:astore_2        
					if(javatype != null)
	//*  20   40:aload_2         
	//*  21   41:ifnull          152
						return ((JsonSerializer) (javatype));
	//   22   44:aload_2         
	//   23   45:areturn         
				}
			} else
			if(_classMappings != null)
	//*  24   46:aload_0         
	//*  25   47:getfield        #22  <Field HashMap _classMappings>
	//*  26   50:ifnull          152
			{
				JsonSerializer jsonserializer = (JsonSerializer)_classMappings.get(((Object) (beandescription)));
	//   27   53:aload_0         
	//   28   54:getfield        #22  <Field HashMap _classMappings>
	//   29   57:aload_3         
	//   30   58:invokevirtual   #69  <Method Object HashMap.get(Object)>
	//   31   61:checkcast       #71  <Class JsonSerializer>
	//   32   64:astore          4
				if(jsonserializer != null)
	//*  33   66:aload           4
	//*  34   68:ifnull          74
					return jsonserializer;
	//   35   71:aload           4
	//   36   73:areturn         
				if(_hasEnumSerializer && javatype.isEnumType())
	//*  37   74:aload_0         
	//*  38   75:getfield        #26  <Field boolean _hasEnumSerializer>
	//*  39   78:ifeq            112
	//*  40   81:aload_2         
	//*  41   82:invokevirtual   #158 <Method boolean JavaType.isEnumType()>
	//*  42   85:ifeq            112
				{
					((ClassKey) (beandescription)).reset(java/lang/Enum);
	//   43   88:aload_3         
	//   44   89:ldc1            #55  <Class Enum>
	//   45   91:invokevirtual   #65  <Method void ClassKey.reset(Class)>
					javatype = ((JavaType) ((JsonSerializer)_classMappings.get(((Object) (beandescription)))));
	//   46   94:aload_0         
	//   47   95:getfield        #22  <Field HashMap _classMappings>
	//   48   98:aload_3         
	//   49   99:invokevirtual   #69  <Method Object HashMap.get(Object)>
	//   50  102:checkcast       #71  <Class JsonSerializer>
	//   51  105:astore_2        
					if(javatype != null)
	//*  52  106:aload_2         
	//*  53  107:ifnull          112
						return ((JsonSerializer) (javatype));
	//   54  110:aload_2         
	//   55  111:areturn         
				}
				for(javatype = ((JavaType) (serializationconfig)); javatype != null; javatype = ((JavaType) (((Class) (javatype)).getSuperclass())))
	//*  56  112:aload_1         
	//*  57  113:astore_2        
	//*  58  114:aload_2         
	//*  59  115:ifnull          152
				{
					((ClassKey) (beandescription)).reset(((Class) (javatype)));
	//   60  118:aload_3         
	//   61  119:aload_2         
	//   62  120:invokevirtual   #65  <Method void ClassKey.reset(Class)>
					JsonSerializer jsonserializer1 = (JsonSerializer)_classMappings.get(((Object) (beandescription)));
	//   63  123:aload_0         
	//   64  124:getfield        #22  <Field HashMap _classMappings>
	//   65  127:aload_3         
	//   66  128:invokevirtual   #69  <Method Object HashMap.get(Object)>
	//   67  131:checkcast       #71  <Class JsonSerializer>
	//   68  134:astore          4
					if(jsonserializer1 != null)
	//*  69  136:aload           4
	//*  70  138:ifnull          144
						return jsonserializer1;
	//   71  141:aload           4
	//   72  143:areturn         
				}

	//   73  144:aload_2         
	//   74  145:invokevirtual   #161 <Method Class Class.getSuperclass()>
	//   75  148:astore_2        
			}
	//*  76  149:goto            114
			if(_interfaceMappings == null)
				break label0;
	//   77  152:aload_0         
	//   78  153:getfield        #24  <Field HashMap _interfaceMappings>
	//   79  156:ifnull          201
			javatype = ((JavaType) (_findInterfaceMapping(((Class) (serializationconfig)), ((ClassKey) (beandescription)))));
	//   80  159:aload_0         
	//   81  160:aload_1         
	//   82  161:aload_3         
	//   83  162:invokevirtual   #73  <Method JsonSerializer _findInterfaceMapping(Class, ClassKey)>
	//   84  165:astore_2        
			if(javatype != null)
	//*  85  166:aload_2         
	//*  86  167:ifnull          172
				return ((JsonSerializer) (javatype));
	//   87  170:aload_2         
	//   88  171:areturn         
			if(((Class) (serializationconfig)).isInterface())
				break label0;
	//   89  172:aload_1         
	//   90  173:invokevirtual   #46  <Method boolean Class.isInterface()>
	//   91  176:ifne            201
			do
			{
				serializationconfig = ((SerializationConfig) (((Class) (serializationconfig)).getSuperclass()));
	//   92  179:aload_1         
	//   93  180:invokevirtual   #161 <Method Class Class.getSuperclass()>
	//   94  183:astore_1        
				if(serializationconfig == null)
					break label0;
	//   95  184:aload_1         
	//   96  185:ifnull          201
				javatype = ((JavaType) (_findInterfaceMapping(((Class) (serializationconfig)), ((ClassKey) (beandescription)))));
	//   97  188:aload_0         
	//   98  189:aload_1         
	//   99  190:aload_3         
	//  100  191:invokevirtual   #73  <Method JsonSerializer _findInterfaceMapping(Class, ClassKey)>
	//  101  194:astore_2        
			} while(javatype == null);
	//  102  195:aload_2         
	//  103  196:ifnull          179
			return ((JsonSerializer) (javatype));
	//  104  199:aload_2         
	//  105  200:areturn         
		}
		return null;
	//  106  201:aconst_null     
	//  107  202:areturn         
	}

	private static final long serialVersionUID = 0xd0de53cbL;
	protected HashMap _classMappings;
	protected boolean _hasEnumSerializer;
	protected HashMap _interfaceMappings;
}
