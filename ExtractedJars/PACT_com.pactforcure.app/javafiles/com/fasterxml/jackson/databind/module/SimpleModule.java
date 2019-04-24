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
		String s;
		if(((Object)this).getClass() == com/fasterxml/jackson/databind/module/SimpleModule)
	//*  35   59:aload_0         
	//*  36   60:invokevirtual   #69  <Method Class Object.getClass()>
	//*  37   63:ldc1            #2   <Class SimpleModule>
	//*  38   65:if_acmpne       104
			s = (new StringBuilder()).append("SimpleModule-").append(System.identityHashCode(((Object) (this)))).toString();
	//   39   68:new             #71  <Class StringBuilder>
	//   40   71:dup             
	//   41   72:invokespecial   #72  <Method void StringBuilder()>
	//   42   75:ldc1            #74  <String "SimpleModule-">
	//   43   77:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   44   80:aload_0         
	//   45   81:invokestatic    #84  <Method int System.identityHashCode(Object)>
	//   46   84:invokevirtual   #87  <Method StringBuilder StringBuilder.append(int)>
	//   47   87:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   48   90:astore_1        
		else
	//*  49   91:aload_0         
	//*  50   92:aload_1         
	//*  51   93:putfield        #93  <Field String _name>
	//*  52   96:aload_0         
	//*  53   97:invokestatic    #99  <Method Version Version.unknownVersion()>
	//*  54  100:putfield        #101 <Field Version _version>
	//*  55  103:return          
			s = ((Object)this).getClass().getName();
	//   56  104:aload_0         
	//   57  105:invokevirtual   #69  <Method Class Object.getClass()>
	//   58  108:invokevirtual   #106 <Method String Class.getName()>
	//   59  111:astore_1        
		_name = s;
		_version = Version.unknownVersion();
	//*  60  112:goto            91
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
	//   38   64:putfield        #93  <Field String _name>
		_version = version1;
	//   39   67:aload_0         
	//   40   68:aload_1         
	//   41   69:putfield        #101 <Field Version _version>
	//   42   72:return          
	}

	public SimpleModule(String s)
	{
		this(s, Version.unknownVersion());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #99  <Method Version Version.unknownVersion()>
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
	//   37   61:putfield        #93  <Field String _name>
		_version = version1;
	//   38   64:aload_0         
	//   39   65:aload_2         
	//   40   66:putfield        #101 <Field Version _version>
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
	//   37   61:putfield        #93  <Field String _name>
		_version = version1;
	//   38   64:aload_0         
	//   39   65:aload_2         
	//   40   66:putfield        #101 <Field Version _version>
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

	public SimpleModule addAbstractTypeMapping(Class class1, Class class2)
	{
		if(_abstractTypes == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field SimpleAbstractTypeResolver _abstractTypes>
	//*   2    4:ifnonnull       18
			_abstractTypes = new SimpleAbstractTypeResolver();
	//    3    7:aload_0         
	//    4    8:new             #138 <Class SimpleAbstractTypeResolver>
	//    5   11:dup             
	//    6   12:invokespecial   #139 <Method void SimpleAbstractTypeResolver()>
	//    7   15:putfield        #51  <Field SimpleAbstractTypeResolver _abstractTypes>
		_abstractTypes = _abstractTypes.addMapping(class1, class2);
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getfield        #51  <Field SimpleAbstractTypeResolver _abstractTypes>
	//   11   23:aload_1         
	//   12   24:aload_2         
	//   13   25:invokevirtual   #143 <Method SimpleAbstractTypeResolver SimpleAbstractTypeResolver.addMapping(Class, Class)>
	//   14   28:putfield        #51  <Field SimpleAbstractTypeResolver _abstractTypes>
		return this;
	//   15   31:aload_0         
	//   16   32:areturn         
	}

	public SimpleModule addDeserializer(Class class1, JsonDeserializer jsondeserializer)
	{
		if(_deserializers == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field SimpleDeserializers _deserializers>
	//*   2    4:ifnonnull       18
			_deserializers = new SimpleDeserializers();
	//    3    7:aload_0         
	//    4    8:new             #125 <Class SimpleDeserializers>
	//    5   11:dup             
	//    6   12:invokespecial   #147 <Method void SimpleDeserializers()>
	//    7   15:putfield        #45  <Field SimpleDeserializers _deserializers>
		_deserializers.addDeserializer(class1, jsondeserializer);
	//    8   18:aload_0         
	//    9   19:getfield        #45  <Field SimpleDeserializers _deserializers>
	//   10   22:aload_1         
	//   11   23:aload_2         
	//   12   24:invokevirtual   #150 <Method void SimpleDeserializers.addDeserializer(Class, JsonDeserializer)>
		return this;
	//   13   27:aload_0         
	//   14   28:areturn         
	}

	public SimpleModule addKeyDeserializer(Class class1, KeyDeserializer keydeserializer)
	{
		if(_keyDeserializers == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field SimpleKeyDeserializers _keyDeserializers>
	//*   2    4:ifnonnull       18
			_keyDeserializers = new SimpleKeyDeserializers();
	//    3    7:aload_0         
	//    4    8:new             #155 <Class SimpleKeyDeserializers>
	//    5   11:dup             
	//    6   12:invokespecial   #156 <Method void SimpleKeyDeserializers()>
	//    7   15:putfield        #49  <Field SimpleKeyDeserializers _keyDeserializers>
		_keyDeserializers.addDeserializer(class1, keydeserializer);
	//    8   18:aload_0         
	//    9   19:getfield        #49  <Field SimpleKeyDeserializers _keyDeserializers>
	//   10   22:aload_1         
	//   11   23:aload_2         
	//   12   24:invokevirtual   #159 <Method SimpleKeyDeserializers SimpleKeyDeserializers.addDeserializer(Class, KeyDeserializer)>
	//   13   27:pop             
		return this;
	//   14   28:aload_0         
	//   15   29:areturn         
	}

	public SimpleModule addKeySerializer(Class class1, JsonSerializer jsonserializer)
	{
		if(_keySerializers == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field SimpleSerializers _keySerializers>
	//*   2    4:ifnonnull       18
			_keySerializers = new SimpleSerializers();
	//    3    7:aload_0         
	//    4    8:new             #130 <Class SimpleSerializers>
	//    5   11:dup             
	//    6   12:invokespecial   #163 <Method void SimpleSerializers()>
	//    7   15:putfield        #47  <Field SimpleSerializers _keySerializers>
		_keySerializers.addSerializer(class1, jsonserializer);
	//    8   18:aload_0         
	//    9   19:getfield        #47  <Field SimpleSerializers _keySerializers>
	//   10   22:aload_1         
	//   11   23:aload_2         
	//   12   24:invokevirtual   #167 <Method void SimpleSerializers.addSerializer(Class, JsonSerializer)>
		return this;
	//   13   27:aload_0         
	//   14   28:areturn         
	}

	public SimpleModule addSerializer(JsonSerializer jsonserializer)
	{
		if(_serializers == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field SimpleSerializers _serializers>
	//*   2    4:ifnonnull       18
			_serializers = new SimpleSerializers();
	//    3    7:aload_0         
	//    4    8:new             #130 <Class SimpleSerializers>
	//    5   11:dup             
	//    6   12:invokespecial   #163 <Method void SimpleSerializers()>
	//    7   15:putfield        #43  <Field SimpleSerializers _serializers>
		_serializers.addSerializer(jsonserializer);
	//    8   18:aload_0         
	//    9   19:getfield        #43  <Field SimpleSerializers _serializers>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #172 <Method void SimpleSerializers.addSerializer(JsonSerializer)>
		return this;
	//   12   26:aload_0         
	//   13   27:areturn         
	}

	public SimpleModule addSerializer(Class class1, JsonSerializer jsonserializer)
	{
		if(_serializers == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field SimpleSerializers _serializers>
	//*   2    4:ifnonnull       18
			_serializers = new SimpleSerializers();
	//    3    7:aload_0         
	//    4    8:new             #130 <Class SimpleSerializers>
	//    5   11:dup             
	//    6   12:invokespecial   #163 <Method void SimpleSerializers()>
	//    7   15:putfield        #43  <Field SimpleSerializers _serializers>
		_serializers.addSerializer(class1, jsonserializer);
	//    8   18:aload_0         
	//    9   19:getfield        #43  <Field SimpleSerializers _serializers>
	//   10   22:aload_1         
	//   11   23:aload_2         
	//   12   24:invokevirtual   #167 <Method void SimpleSerializers.addSerializer(Class, JsonSerializer)>
		return this;
	//   13   27:aload_0         
	//   14   28:areturn         
	}

	public SimpleModule addValueInstantiator(Class class1, ValueInstantiator valueinstantiator)
	{
		if(_valueInstantiators == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field SimpleValueInstantiators _valueInstantiators>
	//*   2    4:ifnonnull       18
			_valueInstantiators = new SimpleValueInstantiators();
	//    3    7:aload_0         
	//    4    8:new             #177 <Class SimpleValueInstantiators>
	//    5   11:dup             
	//    6   12:invokespecial   #178 <Method void SimpleValueInstantiators()>
	//    7   15:putfield        #53  <Field SimpleValueInstantiators _valueInstantiators>
		_valueInstantiators = _valueInstantiators.addValueInstantiator(class1, valueinstantiator);
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getfield        #53  <Field SimpleValueInstantiators _valueInstantiators>
	//   11   23:aload_1         
	//   12   24:aload_2         
	//   13   25:invokevirtual   #181 <Method SimpleValueInstantiators SimpleValueInstantiators.addValueInstantiator(Class, ValueInstantiator)>
	//   14   28:putfield        #53  <Field SimpleValueInstantiators _valueInstantiators>
		return this;
	//   15   31:aload_0         
	//   16   32:areturn         
	}

	public String getModuleName()
	{
		return _name;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field String _name>
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
	//    7   12:invokespecial   #187 <Method Object Module.getTypeId()>
	//    8   15:areturn         
	}

	public transient SimpleModule registerSubtypes(NamedType anamedtype[])
	{
		if(_subtypes == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field LinkedHashSet _subtypes>
	//*   2    4:ifnonnull       25
			_subtypes = new LinkedHashSet(Math.max(16, anamedtype.length));
	//    3    7:aload_0         
	//    4    8:new             #191 <Class LinkedHashSet>
	//    5   11:dup             
	//    6   12:bipush          16
	//    7   14:aload_1         
	//    8   15:arraylength     
	//    9   16:invokestatic    #197 <Method int Math.max(int, int)>
	//   10   19:invokespecial   #200 <Method void LinkedHashSet(int)>
	//   11   22:putfield        #61  <Field LinkedHashSet _subtypes>
		int j = anamedtype.length;
	//   12   25:aload_1         
	//   13   26:arraylength     
	//   14   27:istore_3        
		for(int i = 0; i < j; i++)
	//*  15   28:iconst_0        
	//*  16   29:istore_2        
	//*  17   30:iload_2         
	//*  18   31:iload_3         
	//*  19   32:icmpge          57
		{
			NamedType namedtype = anamedtype[i];
	//   20   35:aload_1         
	//   21   36:iload_2         
	//   22   37:aaload          
	//   23   38:astore          4
			_subtypes.add(((Object) (namedtype)));
	//   24   40:aload_0         
	//   25   41:getfield        #61  <Field LinkedHashSet _subtypes>
	//   26   44:aload           4
	//   27   46:invokevirtual   #204 <Method boolean LinkedHashSet.add(Object)>
	//   28   49:pop             
		}

	//   29   50:iload_2         
	//   30   51:iconst_1        
	//   31   52:iadd            
	//   32   53:istore_2        
	//*  33   54:goto            30
		return this;
	//   34   57:aload_0         
	//   35   58:areturn         
	}

	public transient SimpleModule registerSubtypes(Class aclass[])
	{
		if(_subtypes == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field LinkedHashSet _subtypes>
	//*   2    4:ifnonnull       25
			_subtypes = new LinkedHashSet(Math.max(16, aclass.length));
	//    3    7:aload_0         
	//    4    8:new             #191 <Class LinkedHashSet>
	//    5   11:dup             
	//    6   12:bipush          16
	//    7   14:aload_1         
	//    8   15:arraylength     
	//    9   16:invokestatic    #197 <Method int Math.max(int, int)>
	//   10   19:invokespecial   #200 <Method void LinkedHashSet(int)>
	//   11   22:putfield        #61  <Field LinkedHashSet _subtypes>
		int j = aclass.length;
	//   12   25:aload_1         
	//   13   26:arraylength     
	//   14   27:istore_3        
		for(int i = 0; i < j; i++)
	//*  15   28:iconst_0        
	//*  16   29:istore_2        
	//*  17   30:iload_2         
	//*  18   31:iload_3         
	//*  19   32:icmpge          64
		{
			Class class1 = aclass[i];
	//   20   35:aload_1         
	//   21   36:iload_2         
	//   22   37:aaload          
	//   23   38:astore          4
			_subtypes.add(((Object) (new NamedType(class1))));
	//   24   40:aload_0         
	//   25   41:getfield        #61  <Field LinkedHashSet _subtypes>
	//   26   44:new             #207 <Class NamedType>
	//   27   47:dup             
	//   28   48:aload           4
	//   29   50:invokespecial   #210 <Method void NamedType(Class)>
	//   30   53:invokevirtual   #204 <Method boolean LinkedHashSet.add(Object)>
	//   31   56:pop             
		}

	//   32   57:iload_2         
	//   33   58:iconst_1        
	//   34   59:iadd            
	//   35   60:istore_2        
	//*  36   61:goto            30
		return this;
	//   37   64:aload_0         
	//   38   65:areturn         
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
		if(_mixins == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field HashMap _mixins>
	//*   2    4:ifnonnull       18
			_mixins = new HashMap();
	//    3    7:aload_0         
	//    4    8:new             #224 <Class HashMap>
	//    5   11:dup             
	//    6   12:invokespecial   #225 <Method void HashMap()>
	//    7   15:putfield        #59  <Field HashMap _mixins>
		_mixins.put(((Object) (class1)), ((Object) (class2)));
	//    8   18:aload_0         
	//    9   19:getfield        #59  <Field HashMap _mixins>
	//   10   22:aload_1         
	//   11   23:aload_2         
	//   12   24:invokevirtual   #229 <Method Object HashMap.put(Object, Object)>
	//   13   27:pop             
		return this;
	//   14   28:aload_0         
	//   15   29:areturn         
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
		if(_serializers != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field SimpleSerializers _serializers>
	//*   2    4:ifnull          17
			setupcontext.addSerializers(((com.fasterxml.jackson.databind.ser.Serializers) (_serializers)));
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #43  <Field SimpleSerializers _serializers>
	//    6   12:invokeinterface #245 <Method void com.fasterxml.jackson.databind.Module$SetupContext.addSerializers(com.fasterxml.jackson.databind.ser.Serializers)>
		if(_deserializers != null)
	//*   7   17:aload_0         
	//*   8   18:getfield        #45  <Field SimpleDeserializers _deserializers>
	//*   9   21:ifnull          34
			setupcontext.addDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers) (_deserializers)));
	//   10   24:aload_1         
	//   11   25:aload_0         
	//   12   26:getfield        #45  <Field SimpleDeserializers _deserializers>
	//   13   29:invokeinterface #249 <Method void com.fasterxml.jackson.databind.Module$SetupContext.addDeserializers(com.fasterxml.jackson.databind.deser.Deserializers)>
		if(_keySerializers != null)
	//*  14   34:aload_0         
	//*  15   35:getfield        #47  <Field SimpleSerializers _keySerializers>
	//*  16   38:ifnull          51
			setupcontext.addKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers) (_keySerializers)));
	//   17   41:aload_1         
	//   18   42:aload_0         
	//   19   43:getfield        #47  <Field SimpleSerializers _keySerializers>
	//   20   46:invokeinterface #252 <Method void com.fasterxml.jackson.databind.Module$SetupContext.addKeySerializers(com.fasterxml.jackson.databind.ser.Serializers)>
		if(_keyDeserializers != null)
	//*  21   51:aload_0         
	//*  22   52:getfield        #49  <Field SimpleKeyDeserializers _keyDeserializers>
	//*  23   55:ifnull          68
			setupcontext.addKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers) (_keyDeserializers)));
	//   24   58:aload_1         
	//   25   59:aload_0         
	//   26   60:getfield        #49  <Field SimpleKeyDeserializers _keyDeserializers>
	//   27   63:invokeinterface #256 <Method void com.fasterxml.jackson.databind.Module$SetupContext.addKeyDeserializers(com.fasterxml.jackson.databind.deser.KeyDeserializers)>
		if(_abstractTypes != null)
	//*  28   68:aload_0         
	//*  29   69:getfield        #51  <Field SimpleAbstractTypeResolver _abstractTypes>
	//*  30   72:ifnull          85
			setupcontext.addAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver) (_abstractTypes)));
	//   31   75:aload_1         
	//   32   76:aload_0         
	//   33   77:getfield        #51  <Field SimpleAbstractTypeResolver _abstractTypes>
	//   34   80:invokeinterface #260 <Method void com.fasterxml.jackson.databind.Module$SetupContext.addAbstractTypeResolver(com.fasterxml.jackson.databind.AbstractTypeResolver)>
		if(_valueInstantiators != null)
	//*  35   85:aload_0         
	//*  36   86:getfield        #53  <Field SimpleValueInstantiators _valueInstantiators>
	//*  37   89:ifnull          102
			setupcontext.addValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators) (_valueInstantiators)));
	//   38   92:aload_1         
	//   39   93:aload_0         
	//   40   94:getfield        #53  <Field SimpleValueInstantiators _valueInstantiators>
	//   41   97:invokeinterface #264 <Method void com.fasterxml.jackson.databind.Module$SetupContext.addValueInstantiators(com.fasterxml.jackson.databind.deser.ValueInstantiators)>
		if(_deserializerModifier != null)
	//*  42  102:aload_0         
	//*  43  103:getfield        #55  <Field BeanDeserializerModifier _deserializerModifier>
	//*  44  106:ifnull          119
			setupcontext.addBeanDeserializerModifier(_deserializerModifier);
	//   45  109:aload_1         
	//   46  110:aload_0         
	//   47  111:getfield        #55  <Field BeanDeserializerModifier _deserializerModifier>
	//   48  114:invokeinterface #268 <Method void com.fasterxml.jackson.databind.Module$SetupContext.addBeanDeserializerModifier(BeanDeserializerModifier)>
		if(_serializerModifier != null)
	//*  49  119:aload_0         
	//*  50  120:getfield        #57  <Field BeanSerializerModifier _serializerModifier>
	//*  51  123:ifnull          136
			setupcontext.addBeanSerializerModifier(_serializerModifier);
	//   52  126:aload_1         
	//   53  127:aload_0         
	//   54  128:getfield        #57  <Field BeanSerializerModifier _serializerModifier>
	//   55  131:invokeinterface #272 <Method void com.fasterxml.jackson.databind.Module$SetupContext.addBeanSerializerModifier(BeanSerializerModifier)>
		if(_subtypes != null && _subtypes.size() > 0)
	//*  56  136:aload_0         
	//*  57  137:getfield        #61  <Field LinkedHashSet _subtypes>
	//*  58  140:ifnull          179
	//*  59  143:aload_0         
	//*  60  144:getfield        #61  <Field LinkedHashSet _subtypes>
	//*  61  147:invokevirtual   #276 <Method int LinkedHashSet.size()>
	//*  62  150:ifle            179
			setupcontext.registerSubtypes((NamedType[])_subtypes.toArray(((Object []) (new NamedType[_subtypes.size()]))));
	//   63  153:aload_1         
	//   64  154:aload_0         
	//   65  155:getfield        #61  <Field LinkedHashSet _subtypes>
	//   66  158:aload_0         
	//   67  159:getfield        #61  <Field LinkedHashSet _subtypes>
	//   68  162:invokevirtual   #276 <Method int LinkedHashSet.size()>
	//   69  165:anewarray       NamedType[]
	//   70  168:invokevirtual   #280 <Method Object[] LinkedHashSet.toArray(Object[])>
	//   71  171:checkcast       #282 <Class NamedType[]>
	//   72  174:invokeinterface #285 <Method void com.fasterxml.jackson.databind.Module$SetupContext.registerSubtypes(NamedType[])>
		if(_namingStrategy != null)
	//*  73  179:aload_0         
	//*  74  180:getfield        #63  <Field PropertyNamingStrategy _namingStrategy>
	//*  75  183:ifnull          196
			setupcontext.setNamingStrategy(_namingStrategy);
	//   76  186:aload_1         
	//   77  187:aload_0         
	//   78  188:getfield        #63  <Field PropertyNamingStrategy _namingStrategy>
	//   79  191:invokeinterface #288 <Method void com.fasterxml.jackson.databind.Module$SetupContext.setNamingStrategy(PropertyNamingStrategy)>
		if(_mixins != null)
	//*  80  196:aload_0         
	//*  81  197:getfield        #59  <Field HashMap _mixins>
	//*  82  200:ifnull          262
		{
			java.util.Map.Entry entry;
			for(Iterator iterator = _mixins.entrySet().iterator(); iterator.hasNext(); setupcontext.setMixInAnnotations((Class)entry.getKey(), (Class)entry.getValue()))
	//*  83  203:aload_0         
	//*  84  204:getfield        #59  <Field HashMap _mixins>
	//*  85  207:invokevirtual   #292 <Method Set HashMap.entrySet()>
	//*  86  210:invokeinterface #298 <Method Iterator Set.iterator()>
	//*  87  215:astore_2        
	//*  88  216:aload_2         
	//*  89  217:invokeinterface #304 <Method boolean Iterator.hasNext()>
	//*  90  222:ifeq            262
				entry = (java.util.Map.Entry)iterator.next();
	//   91  225:aload_2         
	//   92  226:invokeinterface #307 <Method Object Iterator.next()>
	//   93  231:checkcast       #309 <Class java.util.Map$Entry>
	//   94  234:astore_3        

	//   95  235:aload_1         
	//   96  236:aload_3         
	//   97  237:invokeinterface #312 <Method Object java.util.Map$Entry.getKey()>
	//   98  242:checkcast       #103 <Class Class>
	//   99  245:aload_3         
	//  100  246:invokeinterface #315 <Method Object java.util.Map$Entry.getValue()>
	//  101  251:checkcast       #103 <Class Class>
	//  102  254:invokeinterface #319 <Method void com.fasterxml.jackson.databind.Module$SetupContext.setMixInAnnotations(Class, Class)>
		}
	//* 103  259:goto            216
	//  104  262:return          
	}

	public Version version()
	{
		return _version;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field Version _version>
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
