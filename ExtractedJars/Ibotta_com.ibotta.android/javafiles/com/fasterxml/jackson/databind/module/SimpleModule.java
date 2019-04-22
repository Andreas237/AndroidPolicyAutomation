// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.module;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.BeanDeserializerModifier;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.ser.BeanSerializerModifier;
import java.io.Serializable;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.module:
//			SimpleDeserializers, SimpleSerializers, SimpleAbstractTypeResolver, SimpleKeyDeserializers, 
//			SimpleValueInstantiators

public class SimpleModule extends Module
	implements Serializable
{

	public SimpleModule()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Module()>
		_serializers = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #43  <Field SimpleSerializers _serializers>
		_deserializers = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #45  <Field SimpleDeserializers _deserializers>
		_keySerializers = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #47  <Field SimpleSerializers _keySerializers>
		_keyDeserializers = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #49  <Field SimpleKeyDeserializers _keyDeserializers>
		_abstractTypes = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #51  <Field SimpleAbstractTypeResolver _abstractTypes>
		_valueInstantiators = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #53  <Field SimpleValueInstantiators _valueInstantiators>
		_deserializerModifier = null;
	//   20   34:aload_0         
	//   21   35:aconst_null     
	//   22   36:putfield        #55  <Field BeanDeserializerModifier _deserializerModifier>
		_serializerModifier = null;
	//   23   39:aload_0         
	//   24   40:aconst_null     
	//   25   41:putfield        #57  <Field BeanSerializerModifier _serializerModifier>
		_mixins = null;
	//   26   44:aload_0         
	//   27   45:aconst_null     
	//   28   46:putfield        #59  <Field HashMap _mixins>
		_subtypes = null;
	//   29   49:aload_0         
	//   30   50:aconst_null     
	//   31   51:putfield        #61  <Field LinkedHashSet _subtypes>
		_namingStrategy = null;
	//   32   54:aload_0         
	//   33   55:aconst_null     
	//   34   56:putfield        #63  <Field PropertyNamingStrategy _namingStrategy>
		Object obj;
		if(((Object)this).getClass() == com/fasterxml/jackson/databind/module/SimpleModule)
	//*  35   59:aload_0         
	//*  36   60:invokevirtual   #69  <Method Class Object.getClass()>
	//*  37   63:ldc1            #2   <Class SimpleModule>
	//*  38   65:if_acmpne       100
		{
			obj = ((Object) (new StringBuilder()));
	//   39   68:new             #71  <Class StringBuilder>
	//   40   71:dup             
	//   41   72:invokespecial   #72  <Method void StringBuilder()>
	//   42   75:astore_1        
			((StringBuilder) (obj)).append("SimpleModule-");
	//   43   76:aload_1         
	//   44   77:ldc1            #74  <String "SimpleModule-">
	//   45   79:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   46   82:pop             
			((StringBuilder) (obj)).append(System.identityHashCode(((Object) (this))));
	//   47   83:aload_1         
	//   48   84:aload_0         
	//   49   85:invokestatic    #84  <Method int System.identityHashCode(Object)>
	//   50   88:invokevirtual   #87  <Method StringBuilder StringBuilder.append(int)>
	//   51   91:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   52   92:aload_1         
	//   53   93:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   54   96:astore_1        
		} else
	//*  55   97:goto            108
		{
			obj = ((Object) (((Object)this).getClass().getName()));
	//   56  100:aload_0         
	//   57  101:invokevirtual   #69  <Method Class Object.getClass()>
	//   58  104:invokevirtual   #96  <Method String Class.getName()>
	//   59  107:astore_1        
		}
		_name = ((String) (obj));
	//   60  108:aload_0         
	//   61  109:aload_1         
	//   62  110:putfield        #98  <Field String _name>
		_version = Version.unknownVersion();
	//   63  113:aload_0         
	//   64  114:invokestatic    #104 <Method Version Version.unknownVersion()>
	//   65  117:putfield        #106 <Field Version _version>
	//   66  120:return          
	}

	public SimpleModule(Version version1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Module()>
		_serializers = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #43  <Field SimpleSerializers _serializers>
		_deserializers = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #45  <Field SimpleDeserializers _deserializers>
		_keySerializers = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #47  <Field SimpleSerializers _keySerializers>
		_keyDeserializers = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #49  <Field SimpleKeyDeserializers _keyDeserializers>
		_abstractTypes = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #51  <Field SimpleAbstractTypeResolver _abstractTypes>
		_valueInstantiators = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #53  <Field SimpleValueInstantiators _valueInstantiators>
		_deserializerModifier = null;
	//   20   34:aload_0         
	//   21   35:aconst_null     
	//   22   36:putfield        #55  <Field BeanDeserializerModifier _deserializerModifier>
		_serializerModifier = null;
	//   23   39:aload_0         
	//   24   40:aconst_null     
	//   25   41:putfield        #57  <Field BeanSerializerModifier _serializerModifier>
		_mixins = null;
	//   26   44:aload_0         
	//   27   45:aconst_null     
	//   28   46:putfield        #59  <Field HashMap _mixins>
		_subtypes = null;
	//   29   49:aload_0         
	//   30   50:aconst_null     
	//   31   51:putfield        #61  <Field LinkedHashSet _subtypes>
		_namingStrategy = null;
	//   32   54:aload_0         
	//   33   55:aconst_null     
	//   34   56:putfield        #63  <Field PropertyNamingStrategy _namingStrategy>
		_name = version1.getArtifactId();
	//   35   59:aload_0         
	//   36   60:aload_1         
	//   37   61:invokevirtual   #111 <Method String Version.getArtifactId()>
	//   38   64:putfield        #98  <Field String _name>
		_version = version1;
	//   39   67:aload_0         
	//   40   68:aload_1         
	//   41   69:putfield        #106 <Field Version _version>
	//   42   72:return          
	}

	public SimpleModule(String s)
	{
		this(s, Version.unknownVersion());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #104 <Method Version Version.unknownVersion()>
	//    3    5:invokespecial   #115 <Method void SimpleModule(String, Version)>
	//    4    8:return          
	}

	public SimpleModule(String s, Version version1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Module()>
		_serializers = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #43  <Field SimpleSerializers _serializers>
		_deserializers = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #45  <Field SimpleDeserializers _deserializers>
		_keySerializers = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #47  <Field SimpleSerializers _keySerializers>
		_keyDeserializers = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #49  <Field SimpleKeyDeserializers _keyDeserializers>
		_abstractTypes = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #51  <Field SimpleAbstractTypeResolver _abstractTypes>
		_valueInstantiators = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #53  <Field SimpleValueInstantiators _valueInstantiators>
		_deserializerModifier = null;
	//   20   34:aload_0         
	//   21   35:aconst_null     
	//   22   36:putfield        #55  <Field BeanDeserializerModifier _deserializerModifier>
		_serializerModifier = null;
	//   23   39:aload_0         
	//   24   40:aconst_null     
	//   25   41:putfield        #57  <Field BeanSerializerModifier _serializerModifier>
		_mixins = null;
	//   26   44:aload_0         
	//   27   45:aconst_null     
	//   28   46:putfield        #59  <Field HashMap _mixins>
		_subtypes = null;
	//   29   49:aload_0         
	//   30   50:aconst_null     
	//   31   51:putfield        #61  <Field LinkedHashSet _subtypes>
		_namingStrategy = null;
	//   32   54:aload_0         
	//   33   55:aconst_null     
	//   34   56:putfield        #63  <Field PropertyNamingStrategy _namingStrategy>
		_name = s;
	//   35   59:aload_0         
	//   36   60:aload_1         
	//   37   61:putfield        #98  <Field String _name>
		_version = version1;
	//   38   64:aload_0         
	//   39   65:aload_2         
	//   40   66:putfield        #106 <Field Version _version>
	//   41   69:return          
	}

	public SimpleModule(String s, Version version1, List list)
	{
		this(s, version1, ((Map) (null)), list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aload_3         
	//    5    5:invokespecial   #119 <Method void SimpleModule(String, Version, Map, List)>
	//    6    8:return          
	}

	public SimpleModule(String s, Version version1, Map map)
	{
		this(s, version1, map, ((List) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aconst_null     
	//    5    5:invokespecial   #119 <Method void SimpleModule(String, Version, Map, List)>
	//    6    8:return          
	}

	public SimpleModule(String s, Version version1, Map map, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Module()>
		_serializers = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #43  <Field SimpleSerializers _serializers>
		_deserializers = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #45  <Field SimpleDeserializers _deserializers>
		_keySerializers = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #47  <Field SimpleSerializers _keySerializers>
		_keyDeserializers = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #49  <Field SimpleKeyDeserializers _keyDeserializers>
		_abstractTypes = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #51  <Field SimpleAbstractTypeResolver _abstractTypes>
		_valueInstantiators = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #53  <Field SimpleValueInstantiators _valueInstantiators>
		_deserializerModifier = null;
	//   20   34:aload_0         
	//   21   35:aconst_null     
	//   22   36:putfield        #55  <Field BeanDeserializerModifier _deserializerModifier>
		_serializerModifier = null;
	//   23   39:aload_0         
	//   24   40:aconst_null     
	//   25   41:putfield        #57  <Field BeanSerializerModifier _serializerModifier>
		_mixins = null;
	//   26   44:aload_0         
	//   27   45:aconst_null     
	//   28   46:putfield        #59  <Field HashMap _mixins>
		_subtypes = null;
	//   29   49:aload_0         
	//   30   50:aconst_null     
	//   31   51:putfield        #61  <Field LinkedHashSet _subtypes>
		_namingStrategy = null;
	//   32   54:aload_0         
	//   33   55:aconst_null     
	//   34   56:putfield        #63  <Field PropertyNamingStrategy _namingStrategy>
		_name = s;
	//   35   59:aload_0         
	//   36   60:aload_1         
	//   37   61:putfield        #98  <Field String _name>
		_version = version1;
	//   38   64:aload_0         
	//   39   65:aload_2         
	//   40   66:putfield        #106 <Field Version _version>
		if(map != null)
	//*  41   69:aload_3         
	//*  42   70:ifnull          85
			_deserializers = new SimpleDeserializers(map);
	//   43   73:aload_0         
	//   44   74:new             #125 <Class SimpleDeserializers>
	//   45   77:dup             
	//   46   78:aload_3         
	//   47   79:invokespecial   #128 <Method void SimpleDeserializers(Map)>
	//   48   82:putfield        #45  <Field SimpleDeserializers _deserializers>
		if(list != null)
	//*  49   85:aload           4
	//*  50   87:ifnull          103
			_serializers = new SimpleSerializers(list);
	//   51   90:aload_0         
	//   52   91:new             #130 <Class SimpleSerializers>
	//   53   94:dup             
	//   54   95:aload           4
	//   55   97:invokespecial   #133 <Method void SimpleSerializers(List)>
	//   56  100:putfield        #43  <Field SimpleSerializers _serializers>
	//   57  103:return          
	}

	protected void _checkNotNull(Object obj, String s)
	{
		if(obj != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          5
			return;
	//    2    4:return          
		else
			throw new IllegalArgumentException(String.format("Cannot pass `null` as %s", new Object[] {
				s
			}));
	//    3    5:new             #138 <Class IllegalArgumentException>
	//    4    8:dup             
	//    5    9:ldc1            #140 <String "Cannot pass `null` as %s">
	//    6   11:iconst_1        
	//    7   12:anewarray       Object[]
	//    8   15:dup             
	//    9   16:iconst_0        
	//   10   17:aload_2         
	//   11   18:aastore         
	//   12   19:invokestatic    #146 <Method String String.format(String, Object[])>
	//   13   22:invokespecial   #148 <Method void IllegalArgumentException(String)>
	//   14   25:athrow          
	}

	public SimpleModule addAbstractTypeMapping(Class class1, Class class2)
	{
		_checkNotNull(((Object) (class1)), "abstract type to map");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #152 <String "abstract type to map">
	//    3    4:invokevirtual   #154 <Method void _checkNotNull(Object, String)>
		_checkNotNull(((Object) (class2)), "concrete type to map to");
	//    4    7:aload_0         
	//    5    8:aload_2         
	//    6    9:ldc1            #156 <String "concrete type to map to">
	//    7   11:invokevirtual   #154 <Method void _checkNotNull(Object, String)>
		if(_abstractTypes == null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #51  <Field SimpleAbstractTypeResolver _abstractTypes>
	//*  10   18:ifnonnull       32
			_abstractTypes = new SimpleAbstractTypeResolver();
	//   11   21:aload_0         
	//   12   22:new             #158 <Class SimpleAbstractTypeResolver>
	//   13   25:dup             
	//   14   26:invokespecial   #159 <Method void SimpleAbstractTypeResolver()>
	//   15   29:putfield        #51  <Field SimpleAbstractTypeResolver _abstractTypes>
		_abstractTypes = _abstractTypes.addMapping(class1, class2);
	//   16   32:aload_0         
	//   17   33:aload_0         
	//   18   34:getfield        #51  <Field SimpleAbstractTypeResolver _abstractTypes>
	//   19   37:aload_1         
	//   20   38:aload_2         
	//   21   39:invokevirtual   #163 <Method SimpleAbstractTypeResolver SimpleAbstractTypeResolver.addMapping(Class, Class)>
	//   22   42:putfield        #51  <Field SimpleAbstractTypeResolver _abstractTypes>
		return this;
	//   23   45:aload_0         
	//   24   46:areturn         
	}

	public SimpleModule addDeserializer(Class class1, JsonDeserializer jsondeserializer)
	{
		_checkNotNull(((Object) (class1)), "type to register deserializer for");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #168 <String "type to register deserializer for">
	//    3    4:invokevirtual   #154 <Method void _checkNotNull(Object, String)>
		_checkNotNull(((Object) (jsondeserializer)), "deserializer");
	//    4    7:aload_0         
	//    5    8:aload_2         
	//    6    9:ldc1            #170 <String "deserializer">
	//    7   11:invokevirtual   #154 <Method void _checkNotNull(Object, String)>
		if(_deserializers == null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #45  <Field SimpleDeserializers _deserializers>
	//*  10   18:ifnonnull       32
			_deserializers = new SimpleDeserializers();
	//   11   21:aload_0         
	//   12   22:new             #125 <Class SimpleDeserializers>
	//   13   25:dup             
	//   14   26:invokespecial   #171 <Method void SimpleDeserializers()>
	//   15   29:putfield        #45  <Field SimpleDeserializers _deserializers>
		_deserializers.addDeserializer(class1, jsondeserializer);
	//   16   32:aload_0         
	//   17   33:getfield        #45  <Field SimpleDeserializers _deserializers>
	//   18   36:aload_1         
	//   19   37:aload_2         
	//   20   38:invokevirtual   #174 <Method void SimpleDeserializers.addDeserializer(Class, JsonDeserializer)>
		return this;
	//   21   41:aload_0         
	//   22   42:areturn         
	}

	public SimpleModule addKeyDeserializer(Class class1, KeyDeserializer keydeserializer)
	{
		_checkNotNull(((Object) (class1)), "type to register key deserializer for");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #179 <String "type to register key deserializer for">
	//    3    4:invokevirtual   #154 <Method void _checkNotNull(Object, String)>
		_checkNotNull(((Object) (keydeserializer)), "key deserializer");
	//    4    7:aload_0         
	//    5    8:aload_2         
	//    6    9:ldc1            #181 <String "key deserializer">
	//    7   11:invokevirtual   #154 <Method void _checkNotNull(Object, String)>
		if(_keyDeserializers == null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #49  <Field SimpleKeyDeserializers _keyDeserializers>
	//*  10   18:ifnonnull       32
			_keyDeserializers = new SimpleKeyDeserializers();
	//   11   21:aload_0         
	//   12   22:new             #183 <Class SimpleKeyDeserializers>
	//   13   25:dup             
	//   14   26:invokespecial   #184 <Method void SimpleKeyDeserializers()>
	//   15   29:putfield        #49  <Field SimpleKeyDeserializers _keyDeserializers>
		_keyDeserializers.addDeserializer(class1, keydeserializer);
	//   16   32:aload_0         
	//   17   33:getfield        #49  <Field SimpleKeyDeserializers _keyDeserializers>
	//   18   36:aload_1         
	//   19   37:aload_2         
	//   20   38:invokevirtual   #187 <Method SimpleKeyDeserializers SimpleKeyDeserializers.addDeserializer(Class, KeyDeserializer)>
	//   21   41:pop             
		return this;
	//   22   42:aload_0         
	//   23   43:areturn         
	}

	public SimpleModule addKeySerializer(Class class1, JsonSerializer jsonserializer)
	{
		_checkNotNull(((Object) (class1)), "type to register key serializer for");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #192 <String "type to register key serializer for">
	//    3    4:invokevirtual   #154 <Method void _checkNotNull(Object, String)>
		_checkNotNull(((Object) (jsonserializer)), "key serializer");
	//    4    7:aload_0         
	//    5    8:aload_2         
	//    6    9:ldc1            #194 <String "key serializer">
	//    7   11:invokevirtual   #154 <Method void _checkNotNull(Object, String)>
		if(_keySerializers == null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #47  <Field SimpleSerializers _keySerializers>
	//*  10   18:ifnonnull       32
			_keySerializers = new SimpleSerializers();
	//   11   21:aload_0         
	//   12   22:new             #130 <Class SimpleSerializers>
	//   13   25:dup             
	//   14   26:invokespecial   #195 <Method void SimpleSerializers()>
	//   15   29:putfield        #47  <Field SimpleSerializers _keySerializers>
		_keySerializers.addSerializer(class1, jsonserializer);
	//   16   32:aload_0         
	//   17   33:getfield        #47  <Field SimpleSerializers _keySerializers>
	//   18   36:aload_1         
	//   19   37:aload_2         
	//   20   38:invokevirtual   #199 <Method void SimpleSerializers.addSerializer(Class, JsonSerializer)>
		return this;
	//   21   41:aload_0         
	//   22   42:areturn         
	}

	public SimpleModule addSerializer(JsonSerializer jsonserializer)
	{
		_checkNotNull(((Object) (jsonserializer)), "serializer");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #203 <String "serializer">
	//    3    4:invokevirtual   #154 <Method void _checkNotNull(Object, String)>
		if(_serializers == null)
	//*   4    7:aload_0         
	//*   5    8:getfield        #43  <Field SimpleSerializers _serializers>
	//*   6   11:ifnonnull       25
			_serializers = new SimpleSerializers();
	//    7   14:aload_0         
	//    8   15:new             #130 <Class SimpleSerializers>
	//    9   18:dup             
	//   10   19:invokespecial   #195 <Method void SimpleSerializers()>
	//   11   22:putfield        #43  <Field SimpleSerializers _serializers>
		_serializers.addSerializer(jsonserializer);
	//   12   25:aload_0         
	//   13   26:getfield        #43  <Field SimpleSerializers _serializers>
	//   14   29:aload_1         
	//   15   30:invokevirtual   #206 <Method void SimpleSerializers.addSerializer(JsonSerializer)>
		return this;
	//   16   33:aload_0         
	//   17   34:areturn         
	}

	public SimpleModule addSerializer(Class class1, JsonSerializer jsonserializer)
	{
		_checkNotNull(((Object) (class1)), "type to register serializer for");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #209 <String "type to register serializer for">
	//    3    4:invokevirtual   #154 <Method void _checkNotNull(Object, String)>
		_checkNotNull(((Object) (jsonserializer)), "serializer");
	//    4    7:aload_0         
	//    5    8:aload_2         
	//    6    9:ldc1            #203 <String "serializer">
	//    7   11:invokevirtual   #154 <Method void _checkNotNull(Object, String)>
		if(_serializers == null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #43  <Field SimpleSerializers _serializers>
	//*  10   18:ifnonnull       32
			_serializers = new SimpleSerializers();
	//   11   21:aload_0         
	//   12   22:new             #130 <Class SimpleSerializers>
	//   13   25:dup             
	//   14   26:invokespecial   #195 <Method void SimpleSerializers()>
	//   15   29:putfield        #43  <Field SimpleSerializers _serializers>
		_serializers.addSerializer(class1, jsonserializer);
	//   16   32:aload_0         
	//   17   33:getfield        #43  <Field SimpleSerializers _serializers>
	//   18   36:aload_1         
	//   19   37:aload_2         
	//   20   38:invokevirtual   #199 <Method void SimpleSerializers.addSerializer(Class, JsonSerializer)>
		return this;
	//   21   41:aload_0         
	//   22   42:areturn         
	}

	public SimpleModule addValueInstantiator(Class class1, ValueInstantiator valueinstantiator)
	{
		_checkNotNull(((Object) (class1)), "class to register value instantiator for");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #213 <String "class to register value instantiator for">
	//    3    4:invokevirtual   #154 <Method void _checkNotNull(Object, String)>
		_checkNotNull(((Object) (valueinstantiator)), "value instantiator");
	//    4    7:aload_0         
	//    5    8:aload_2         
	//    6    9:ldc1            #215 <String "value instantiator">
	//    7   11:invokevirtual   #154 <Method void _checkNotNull(Object, String)>
		if(_valueInstantiators == null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #53  <Field SimpleValueInstantiators _valueInstantiators>
	//*  10   18:ifnonnull       32
			_valueInstantiators = new SimpleValueInstantiators();
	//   11   21:aload_0         
	//   12   22:new             #217 <Class SimpleValueInstantiators>
	//   13   25:dup             
	//   14   26:invokespecial   #218 <Method void SimpleValueInstantiators()>
	//   15   29:putfield        #53  <Field SimpleValueInstantiators _valueInstantiators>
		_valueInstantiators = _valueInstantiators.addValueInstantiator(class1, valueinstantiator);
	//   16   32:aload_0         
	//   17   33:aload_0         
	//   18   34:getfield        #53  <Field SimpleValueInstantiators _valueInstantiators>
	//   19   37:aload_1         
	//   20   38:aload_2         
	//   21   39:invokevirtual   #221 <Method SimpleValueInstantiators SimpleValueInstantiators.addValueInstantiator(Class, ValueInstantiator)>
	//   22   42:putfield        #53  <Field SimpleValueInstantiators _valueInstantiators>
		return this;
	//   23   45:aload_0         
	//   24   46:areturn         
	}

	public String getModuleName()
	{
		return _name;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field String _name>
	//    2    4:areturn         
	}

	public Object getTypeId()
	{
		if(((Object)this).getClass() == com/fasterxml/jackson/databind/module/SimpleModule)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #69  <Method Class Object.getClass()>
	//*   2    4:ldc1            #2   <Class SimpleModule>
	//*   3    6:if_acmpne       11
			return ((Object) (null));
	//    4    9:aconst_null     
	//    5   10:areturn         
		else
			return super.getTypeId();
	//    6   11:aload_0         
	//    7   12:invokespecial   #227 <Method Object Module.getTypeId()>
	//    8   15:areturn         
	}

	public SimpleModule registerSubtypes(Collection collection)
	{
		if(_subtypes == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field LinkedHashSet _subtypes>
	//*   2    4:ifnonnull       18
			_subtypes = new LinkedHashSet();
	//    3    7:aload_0         
	//    4    8:new             #231 <Class LinkedHashSet>
	//    5   11:dup             
	//    6   12:invokespecial   #232 <Method void LinkedHashSet()>
	//    7   15:putfield        #61  <Field LinkedHashSet _subtypes>
		Class class1;
		for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext(); _subtypes.add(((Object) (new NamedType(class1)))))
	//*   8   18:aload_1         
	//*   9   19:invokeinterface #238 <Method Iterator Collection.iterator()>
	//*  10   24:astore_1        
	//*  11   25:aload_1         
	//*  12   26:invokeinterface #244 <Method boolean Iterator.hasNext()>
	//*  13   31:ifeq            70
		{
			class1 = (Class)((Iterator) (collection)).next();
	//   14   34:aload_1         
	//   15   35:invokeinterface #247 <Method Object Iterator.next()>
	//   16   40:checkcast       #93  <Class Class>
	//   17   43:astore_2        
			_checkNotNull(((Object) (class1)), "subtype to register");
	//   18   44:aload_0         
	//   19   45:aload_2         
	//   20   46:ldc1            #249 <String "subtype to register">
	//   21   48:invokevirtual   #154 <Method void _checkNotNull(Object, String)>
		}

	//   22   51:aload_0         
	//   23   52:getfield        #61  <Field LinkedHashSet _subtypes>
	//   24   55:new             #251 <Class NamedType>
	//   25   58:dup             
	//   26   59:aload_2         
	//   27   60:invokespecial   #254 <Method void NamedType(Class)>
	//   28   63:invokevirtual   #258 <Method boolean LinkedHashSet.add(Object)>
	//   29   66:pop             
	//*  30   67:goto            25
		return this;
	//   31   70:aload_0         
	//   32   71:areturn         
	}

	public transient SimpleModule registerSubtypes(NamedType anamedtype[])
	{
		if(_subtypes == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field LinkedHashSet _subtypes>
	//*   2    4:ifnonnull       18
			_subtypes = new LinkedHashSet();
	//    3    7:aload_0         
	//    4    8:new             #231 <Class LinkedHashSet>
	//    5   11:dup             
	//    6   12:invokespecial   #232 <Method void LinkedHashSet()>
	//    7   15:putfield        #61  <Field LinkedHashSet _subtypes>
		int j = anamedtype.length;
	//    8   18:aload_1         
	//    9   19:arraylength     
	//   10   20:istore_3        
		for(int i = 0; i < j; i++)
	//*  11   21:iconst_0        
	//*  12   22:istore_2        
	//*  13   23:iload_2         
	//*  14   24:iload_3         
	//*  15   25:icmpge          58
		{
			NamedType namedtype = anamedtype[i];
	//   16   28:aload_1         
	//   17   29:iload_2         
	//   18   30:aaload          
	//   19   31:astore          4
			_checkNotNull(((Object) (namedtype)), "subtype to register");
	//   20   33:aload_0         
	//   21   34:aload           4
	//   22   36:ldc1            #249 <String "subtype to register">
	//   23   38:invokevirtual   #154 <Method void _checkNotNull(Object, String)>
			_subtypes.add(((Object) (namedtype)));
	//   24   41:aload_0         
	//   25   42:getfield        #61  <Field LinkedHashSet _subtypes>
	//   26   45:aload           4
	//   27   47:invokevirtual   #258 <Method boolean LinkedHashSet.add(Object)>
	//   28   50:pop             
		}

	//   29   51:iload_2         
	//   30   52:iconst_1        
	//   31   53:iadd            
	//   32   54:istore_2        
	//*  33   55:goto            23
		return this;
	//   34   58:aload_0         
	//   35   59:areturn         
	}

	public transient SimpleModule registerSubtypes(Class aclass[])
	{
		if(_subtypes == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field LinkedHashSet _subtypes>
	//*   2    4:ifnonnull       18
			_subtypes = new LinkedHashSet();
	//    3    7:aload_0         
	//    4    8:new             #231 <Class LinkedHashSet>
	//    5   11:dup             
	//    6   12:invokespecial   #232 <Method void LinkedHashSet()>
	//    7   15:putfield        #61  <Field LinkedHashSet _subtypes>
		int j = aclass.length;
	//    8   18:aload_1         
	//    9   19:arraylength     
	//   10   20:istore_3        
		for(int i = 0; i < j; i++)
	//*  11   21:iconst_0        
	//*  12   22:istore_2        
	//*  13   23:iload_2         
	//*  14   24:iload_3         
	//*  15   25:icmpge          65
		{
			Class class1 = aclass[i];
	//   16   28:aload_1         
	//   17   29:iload_2         
	//   18   30:aaload          
	//   19   31:astore          4
			_checkNotNull(((Object) (class1)), "subtype to register");
	//   20   33:aload_0         
	//   21   34:aload           4
	//   22   36:ldc1            #249 <String "subtype to register">
	//   23   38:invokevirtual   #154 <Method void _checkNotNull(Object, String)>
			_subtypes.add(((Object) (new NamedType(class1))));
	//   24   41:aload_0         
	//   25   42:getfield        #61  <Field LinkedHashSet _subtypes>
	//   26   45:new             #251 <Class NamedType>
	//   27   48:dup             
	//   28   49:aload           4
	//   29   51:invokespecial   #254 <Method void NamedType(Class)>
	//   30   54:invokevirtual   #258 <Method boolean LinkedHashSet.add(Object)>
	//   31   57:pop             
		}

	//   32   58:iload_2         
	//   33   59:iconst_1        
	//   34   60:iadd            
	//   35   61:istore_2        
	//*  36   62:goto            23
		return this;
	//   37   65:aload_0         
	//   38   66:areturn         
	}

	public void setAbstractTypes(SimpleAbstractTypeResolver simpleabstracttyperesolver)
	{
		_abstractTypes = simpleabstracttyperesolver;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #51  <Field SimpleAbstractTypeResolver _abstractTypes>
	//    3    5:return          
	}

	public SimpleModule setDeserializerModifier(BeanDeserializerModifier beandeserializermodifier)
	{
		_deserializerModifier = beandeserializermodifier;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #55  <Field BeanDeserializerModifier _deserializerModifier>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public void setDeserializers(SimpleDeserializers simpledeserializers)
	{
		_deserializers = simpledeserializers;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #45  <Field SimpleDeserializers _deserializers>
	//    3    5:return          
	}

	public void setKeyDeserializers(SimpleKeyDeserializers simplekeydeserializers)
	{
		_keyDeserializers = simplekeydeserializers;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #49  <Field SimpleKeyDeserializers _keyDeserializers>
	//    3    5:return          
	}

	public void setKeySerializers(SimpleSerializers simpleserializers)
	{
		_keySerializers = simpleserializers;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #47  <Field SimpleSerializers _keySerializers>
	//    3    5:return          
	}

	public SimpleModule setMixInAnnotation(Class class1, Class class2)
	{
		_checkNotNull(((Object) (class1)), "target type");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #275 <String "target type">
	//    3    5:invokevirtual   #154 <Method void _checkNotNull(Object, String)>
		_checkNotNull(((Object) (class2)), "mixin class");
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:ldc2            #277 <String "mixin class">
	//    7   13:invokevirtual   #154 <Method void _checkNotNull(Object, String)>
		if(_mixins == null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #59  <Field HashMap _mixins>
	//*  10   20:ifnonnull       34
			_mixins = new HashMap();
	//   11   23:aload_0         
	//   12   24:new             #279 <Class HashMap>
	//   13   27:dup             
	//   14   28:invokespecial   #280 <Method void HashMap()>
	//   15   31:putfield        #59  <Field HashMap _mixins>
		_mixins.put(((Object) (class1)), ((Object) (class2)));
	//   16   34:aload_0         
	//   17   35:getfield        #59  <Field HashMap _mixins>
	//   18   38:aload_1         
	//   19   39:aload_2         
	//   20   40:invokevirtual   #284 <Method Object HashMap.put(Object, Object)>
	//   21   43:pop             
		return this;
	//   22   44:aload_0         
	//   23   45:areturn         
	}

	protected SimpleModule setNamingStrategy(PropertyNamingStrategy propertynamingstrategy)
	{
		_namingStrategy = propertynamingstrategy;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #63  <Field PropertyNamingStrategy _namingStrategy>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public SimpleModule setSerializerModifier(BeanSerializerModifier beanserializermodifier)
	{
		_serializerModifier = beanserializermodifier;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #57  <Field BeanSerializerModifier _serializerModifier>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public void setSerializers(SimpleSerializers simpleserializers)
	{
		_serializers = simpleserializers;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #43  <Field SimpleSerializers _serializers>
	//    3    5:return          
	}

	public void setValueInstantiators(SimpleValueInstantiators simplevalueinstantiators)
	{
		_valueInstantiators = simplevalueinstantiators;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #53  <Field SimpleValueInstantiators _valueInstantiators>
	//    3    5:return          
	}

	public void setupModule(com.fasterxml.jackson.databind.Module.SetupContext setupcontext)
	{
		Object obj = ((Object) (_serializers));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field SimpleSerializers _serializers>
	//    2    4:astore_2        
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          16
			setupcontext.addSerializers(((com.fasterxml.jackson.databind.ser.Serializers) (obj)));
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokeinterface #300 <Method void com.fasterxml.jackson.databind.Module$SetupContext.addSerializers(com.fasterxml.jackson.databind.ser.Serializers)>
		obj = ((Object) (_deserializers));
	//    8   16:aload_0         
	//    9   17:getfield        #45  <Field SimpleDeserializers _deserializers>
	//   10   20:astore_2        
		if(obj != null)
	//*  11   21:aload_2         
	//*  12   22:ifnull          32
			setupcontext.addDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers) (obj)));
	//   13   25:aload_1         
	//   14   26:aload_2         
	//   15   27:invokeinterface #304 <Method void com.fasterxml.jackson.databind.Module$SetupContext.addDeserializers(com.fasterxml.jackson.databind.deser.Deserializers)>
		obj = ((Object) (_keySerializers));
	//   16   32:aload_0         
	//   17   33:getfield        #47  <Field SimpleSerializers _keySerializers>
	//   18   36:astore_2        
		if(obj != null)
	//*  19   37:aload_2         
	//*  20   38:ifnull          48
			setupcontext.addKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers) (obj)));
	//   21   41:aload_1         
	//   22   42:aload_2         
	//   23   43:invokeinterface #307 <Method void com.fasterxml.jackson.databind.Module$SetupContext.addKeySerializers(com.fasterxml.jackson.databind.ser.Serializers)>
		obj = ((Object) (_keyDeserializers));
	//   24   48:aload_0         
	//   25   49:getfield        #49  <Field SimpleKeyDeserializers _keyDeserializers>
	//   26   52:astore_2        
		if(obj != null)
	//*  27   53:aload_2         
	//*  28   54:ifnull          64
			setupcontext.addKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers) (obj)));
	//   29   57:aload_1         
	//   30   58:aload_2         
	//   31   59:invokeinterface #311 <Method void com.fasterxml.jackson.databind.Module$SetupContext.addKeyDeserializers(com.fasterxml.jackson.databind.deser.KeyDeserializers)>
		obj = ((Object) (_abstractTypes));
	//   32   64:aload_0         
	//   33   65:getfield        #51  <Field SimpleAbstractTypeResolver _abstractTypes>
	//   34   68:astore_2        
		if(obj != null)
	//*  35   69:aload_2         
	//*  36   70:ifnull          80
			setupcontext.addAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver) (obj)));
	//   37   73:aload_1         
	//   38   74:aload_2         
	//   39   75:invokeinterface #315 <Method void com.fasterxml.jackson.databind.Module$SetupContext.addAbstractTypeResolver(com.fasterxml.jackson.databind.AbstractTypeResolver)>
		obj = ((Object) (_valueInstantiators));
	//   40   80:aload_0         
	//   41   81:getfield        #53  <Field SimpleValueInstantiators _valueInstantiators>
	//   42   84:astore_2        
		if(obj != null)
	//*  43   85:aload_2         
	//*  44   86:ifnull          96
			setupcontext.addValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators) (obj)));
	//   45   89:aload_1         
	//   46   90:aload_2         
	//   47   91:invokeinterface #319 <Method void com.fasterxml.jackson.databind.Module$SetupContext.addValueInstantiators(com.fasterxml.jackson.databind.deser.ValueInstantiators)>
		obj = ((Object) (_deserializerModifier));
	//   48   96:aload_0         
	//   49   97:getfield        #55  <Field BeanDeserializerModifier _deserializerModifier>
	//   50  100:astore_2        
		if(obj != null)
	//*  51  101:aload_2         
	//*  52  102:ifnull          112
			setupcontext.addBeanDeserializerModifier(((BeanDeserializerModifier) (obj)));
	//   53  105:aload_1         
	//   54  106:aload_2         
	//   55  107:invokeinterface #323 <Method void com.fasterxml.jackson.databind.Module$SetupContext.addBeanDeserializerModifier(BeanDeserializerModifier)>
		obj = ((Object) (_serializerModifier));
	//   56  112:aload_0         
	//   57  113:getfield        #57  <Field BeanSerializerModifier _serializerModifier>
	//   58  116:astore_2        
		if(obj != null)
	//*  59  117:aload_2         
	//*  60  118:ifnull          128
			setupcontext.addBeanSerializerModifier(((BeanSerializerModifier) (obj)));
	//   61  121:aload_1         
	//   62  122:aload_2         
	//   63  123:invokeinterface #327 <Method void com.fasterxml.jackson.databind.Module$SetupContext.addBeanSerializerModifier(BeanSerializerModifier)>
		obj = ((Object) (_subtypes));
	//   64  128:aload_0         
	//   65  129:getfield        #61  <Field LinkedHashSet _subtypes>
	//   66  132:astore_2        
		if(obj != null && ((LinkedHashSet) (obj)).size() > 0)
	//*  67  133:aload_2         
	//*  68  134:ifnull          169
	//*  69  137:aload_2         
	//*  70  138:invokevirtual   #331 <Method int LinkedHashSet.size()>
	//*  71  141:ifle            169
		{
			obj = ((Object) (_subtypes));
	//   72  144:aload_0         
	//   73  145:getfield        #61  <Field LinkedHashSet _subtypes>
	//   74  148:astore_2        
			setupcontext.registerSubtypes((NamedType[])((LinkedHashSet) (obj)).toArray(((Object []) (new NamedType[((LinkedHashSet) (obj)).size()]))));
	//   75  149:aload_1         
	//   76  150:aload_2         
	//   77  151:aload_2         
	//   78  152:invokevirtual   #331 <Method int LinkedHashSet.size()>
	//   79  155:anewarray       NamedType[]
	//   80  158:invokevirtual   #335 <Method Object[] LinkedHashSet.toArray(Object[])>
	//   81  161:checkcast       #337 <Class NamedType[]>
	//   82  164:invokeinterface #340 <Method void com.fasterxml.jackson.databind.Module$SetupContext.registerSubtypes(NamedType[])>
		}
		obj = ((Object) (_namingStrategy));
	//   83  169:aload_0         
	//   84  170:getfield        #63  <Field PropertyNamingStrategy _namingStrategy>
	//   85  173:astore_2        
		if(obj != null)
	//*  86  174:aload_2         
	//*  87  175:ifnull          185
			setupcontext.setNamingStrategy(((PropertyNamingStrategy) (obj)));
	//   88  178:aload_1         
	//   89  179:aload_2         
	//   90  180:invokeinterface #343 <Method void com.fasterxml.jackson.databind.Module$SetupContext.setNamingStrategy(PropertyNamingStrategy)>
		obj = ((Object) (_mixins));
	//   91  185:aload_0         
	//   92  186:getfield        #59  <Field HashMap _mixins>
	//   93  189:astore_2        
		if(obj != null)
	//*  94  190:aload_2         
	//*  95  191:ifnull          250
		{
			java.util.Map.Entry entry;
			for(obj = ((Object) (((HashMap) (obj)).entrySet().iterator())); ((Iterator) (obj)).hasNext(); setupcontext.setMixInAnnotations((Class)entry.getKey(), (Class)entry.getValue()))
	//*  96  194:aload_2         
	//*  97  195:invokevirtual   #347 <Method Set HashMap.entrySet()>
	//*  98  198:invokeinterface #350 <Method Iterator Set.iterator()>
	//*  99  203:astore_2        
	//* 100  204:aload_2         
	//* 101  205:invokeinterface #244 <Method boolean Iterator.hasNext()>
	//* 102  210:ifeq            250
				entry = (java.util.Map.Entry)((Iterator) (obj)).next();
	//  103  213:aload_2         
	//  104  214:invokeinterface #247 <Method Object Iterator.next()>
	//  105  219:checkcast       #352 <Class java.util.Map$Entry>
	//  106  222:astore_3        

	//  107  223:aload_1         
	//  108  224:aload_3         
	//  109  225:invokeinterface #355 <Method Object java.util.Map$Entry.getKey()>
	//  110  230:checkcast       #93  <Class Class>
	//  111  233:aload_3         
	//  112  234:invokeinterface #358 <Method Object java.util.Map$Entry.getValue()>
	//  113  239:checkcast       #93  <Class Class>
	//  114  242:invokeinterface #362 <Method void com.fasterxml.jackson.databind.Module$SetupContext.setMixInAnnotations(Class, Class)>
		}
	//* 115  247:goto            204
	//  116  250:return          
	}

	public Version version()
	{
		return _version;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field Version _version>
	//    2    4:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected SimpleAbstractTypeResolver _abstractTypes;
	protected BeanDeserializerModifier _deserializerModifier;
	protected SimpleDeserializers _deserializers;
	protected SimpleKeyDeserializers _keyDeserializers;
	protected SimpleSerializers _keySerializers;
	protected HashMap _mixins;
	protected final String _name;
	protected PropertyNamingStrategy _namingStrategy;
	protected BeanSerializerModifier _serializerModifier;
	protected SimpleSerializers _serializers;
	protected LinkedHashSet _subtypes;
	protected SimpleValueInstantiators _valueInstantiators;
	protected final Version _version;
}
