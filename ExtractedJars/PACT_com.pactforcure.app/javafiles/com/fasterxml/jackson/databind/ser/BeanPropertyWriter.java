// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.jsonschema.JsonSchema;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.HashMap;

// Referenced classes of package com.fasterxml.jackson.databind.ser:
//			PropertyWriter

public class BeanPropertyWriter extends PropertyWriter
	implements Serializable
{

	protected BeanPropertyWriter()
	{
		super(PropertyMetadata.STD_REQUIRED_OR_OPTIONAL);
	//    0    0:aload_0         
	//    1    1:getstatic       #64  <Field PropertyMetadata PropertyMetadata.STD_REQUIRED_OR_OPTIONAL>
	//    2    4:invokespecial   #67  <Method void PropertyWriter(PropertyMetadata)>
		_member = null;
	//    3    7:aload_0         
	//    4    8:aconst_null     
	//    5    9:putfield        #69  <Field AnnotatedMember _member>
		_contextAnnotations = null;
	//    6   12:aload_0         
	//    7   13:aconst_null     
	//    8   14:putfield        #71  <Field Annotations _contextAnnotations>
		_name = null;
	//    9   17:aload_0         
	//   10   18:aconst_null     
	//   11   19:putfield        #73  <Field SerializedString _name>
		_wrapperName = null;
	//   12   22:aload_0         
	//   13   23:aconst_null     
	//   14   24:putfield        #75  <Field PropertyName _wrapperName>
		_includeInViews = null;
	//   15   27:aload_0         
	//   16   28:aconst_null     
	//   17   29:putfield        #77  <Field Class[] _includeInViews>
		_declaredType = null;
	//   18   32:aload_0         
	//   19   33:aconst_null     
	//   20   34:putfield        #79  <Field JavaType _declaredType>
		_serializer = null;
	//   21   37:aload_0         
	//   22   38:aconst_null     
	//   23   39:putfield        #81  <Field JsonSerializer _serializer>
		_dynamicSerializers = null;
	//   24   42:aload_0         
	//   25   43:aconst_null     
	//   26   44:putfield        #83  <Field PropertySerializerMap _dynamicSerializers>
		_typeSerializer = null;
	//   27   47:aload_0         
	//   28   48:aconst_null     
	//   29   49:putfield        #85  <Field TypeSerializer _typeSerializer>
		_cfgSerializationType = null;
	//   30   52:aload_0         
	//   31   53:aconst_null     
	//   32   54:putfield        #87  <Field JavaType _cfgSerializationType>
		_accessorMethod = null;
	//   33   57:aload_0         
	//   34   58:aconst_null     
	//   35   59:putfield        #89  <Field Method _accessorMethod>
		_field = null;
	//   36   62:aload_0         
	//   37   63:aconst_null     
	//   38   64:putfield        #91  <Field Field _field>
		_suppressNulls = false;
	//   39   67:aload_0         
	//   40   68:iconst_0        
	//   41   69:putfield        #93  <Field boolean _suppressNulls>
		_suppressableValue = null;
	//   42   72:aload_0         
	//   43   73:aconst_null     
	//   44   74:putfield        #95  <Field Object _suppressableValue>
		_nullSerializer = null;
	//   45   77:aload_0         
	//   46   78:aconst_null     
	//   47   79:putfield        #97  <Field JsonSerializer _nullSerializer>
	//   48   82:return          
	}

	public BeanPropertyWriter(BeanPropertyDefinition beanpropertydefinition, AnnotatedMember annotatedmember, Annotations annotations, JavaType javatype, JsonSerializer jsonserializer, TypeSerializer typeserializer, JavaType javatype1, 
			boolean flag, Object obj)
	{
		super(beanpropertydefinition);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #101 <Method void PropertyWriter(BeanPropertyDefinition)>
		_member = annotatedmember;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #69  <Field AnnotatedMember _member>
		_contextAnnotations = annotations;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #71  <Field Annotations _contextAnnotations>
		_name = new SerializedString(beanpropertydefinition.getName());
	//    9   15:aload_0         
	//   10   16:new             #103 <Class SerializedString>
	//   11   19:dup             
	//   12   20:aload_1         
	//   13   21:invokevirtual   #109 <Method String BeanPropertyDefinition.getName()>
	//   14   24:invokespecial   #112 <Method void SerializedString(String)>
	//   15   27:putfield        #73  <Field SerializedString _name>
		_wrapperName = beanpropertydefinition.getWrapperName();
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:invokevirtual   #116 <Method PropertyName BeanPropertyDefinition.getWrapperName()>
	//   19   35:putfield        #75  <Field PropertyName _wrapperName>
		_includeInViews = beanpropertydefinition.findViews();
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:invokevirtual   #120 <Method Class[] BeanPropertyDefinition.findViews()>
	//   23   43:putfield        #77  <Field Class[] _includeInViews>
		_declaredType = javatype;
	//   24   46:aload_0         
	//   25   47:aload           4
	//   26   49:putfield        #79  <Field JavaType _declaredType>
		_serializer = jsonserializer;
	//   27   52:aload_0         
	//   28   53:aload           5
	//   29   55:putfield        #81  <Field JsonSerializer _serializer>
		if(jsonserializer == null)
	//*  30   58:aload           5
	//*  31   60:ifnonnull       125
			beanpropertydefinition = ((BeanPropertyDefinition) (PropertySerializerMap.emptyForProperties()));
	//   32   63:invokestatic    #126 <Method PropertySerializerMap PropertySerializerMap.emptyForProperties()>
	//   33   66:astore_1        
		else
	//*  34   67:aload_0         
	//*  35   68:aload_1         
	//*  36   69:putfield        #83  <Field PropertySerializerMap _dynamicSerializers>
	//*  37   72:aload_0         
	//*  38   73:aload           6
	//*  39   75:putfield        #85  <Field TypeSerializer _typeSerializer>
	//*  40   78:aload_0         
	//*  41   79:aload           7
	//*  42   81:putfield        #87  <Field JavaType _cfgSerializationType>
	//*  43   84:aload_2         
	//*  44   85:instanceof      #128 <Class AnnotatedField>
	//*  45   88:ifeq            130
	//*  46   91:aload_0         
	//*  47   92:aconst_null     
	//*  48   93:putfield        #89  <Field Method _accessorMethod>
	//*  49   96:aload_0         
	//*  50   97:aload_2         
	//*  51   98:invokevirtual   #134 <Method java.lang.reflect.Member AnnotatedMember.getMember()>
	//*  52  101:checkcast       #136 <Class Field>
	//*  53  104:putfield        #91  <Field Field _field>
	//*  54  107:aload_0         
	//*  55  108:iload           8
	//*  56  110:putfield        #93  <Field boolean _suppressNulls>
	//*  57  113:aload_0         
	//*  58  114:aload           9
	//*  59  116:putfield        #95  <Field Object _suppressableValue>
	//*  60  119:aload_0         
	//*  61  120:aconst_null     
	//*  62  121:putfield        #97  <Field JsonSerializer _nullSerializer>
	//*  63  124:return          
			beanpropertydefinition = null;
	//   64  125:aconst_null     
	//   65  126:astore_1        
		_dynamicSerializers = ((PropertySerializerMap) (beanpropertydefinition));
		_typeSerializer = typeserializer;
		_cfgSerializationType = javatype1;
		if(annotatedmember instanceof AnnotatedField)
		{
			_accessorMethod = null;
			_field = (Field)annotatedmember.getMember();
		} else
	//*  66  127:goto            67
		if(annotatedmember instanceof AnnotatedMethod)
	//*  67  130:aload_2         
	//*  68  131:instanceof      #138 <Class AnnotatedMethod>
	//*  69  134:ifeq            156
		{
			_accessorMethod = (Method)annotatedmember.getMember();
	//   70  137:aload_0         
	//   71  138:aload_2         
	//   72  139:invokevirtual   #134 <Method java.lang.reflect.Member AnnotatedMember.getMember()>
	//   73  142:checkcast       #140 <Class Method>
	//   74  145:putfield        #89  <Field Method _accessorMethod>
			_field = null;
	//   75  148:aload_0         
	//   76  149:aconst_null     
	//   77  150:putfield        #91  <Field Field _field>
		} else
	//*  78  153:goto            107
		{
			_accessorMethod = null;
	//   79  156:aload_0         
	//   80  157:aconst_null     
	//   81  158:putfield        #89  <Field Method _accessorMethod>
			_field = null;
	//   82  161:aload_0         
	//   83  162:aconst_null     
	//   84  163:putfield        #91  <Field Field _field>
		}
		_suppressNulls = flag;
		_suppressableValue = obj;
		_nullSerializer = null;
	//*  85  166:goto            107
	}

	protected BeanPropertyWriter(BeanPropertyWriter beanpropertywriter)
	{
		this(beanpropertywriter, beanpropertywriter._name);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:getfield        #73  <Field SerializedString _name>
	//    4    6:invokespecial   #146 <Method void BeanPropertyWriter(BeanPropertyWriter, SerializedString)>
	//    5    9:return          
	}

	protected BeanPropertyWriter(BeanPropertyWriter beanpropertywriter, SerializedString serializedstring)
	{
		super(((PropertyWriter) (beanpropertywriter)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #149 <Method void PropertyWriter(PropertyWriter)>
		_name = serializedstring;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #73  <Field SerializedString _name>
		_wrapperName = beanpropertywriter._wrapperName;
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:getfield        #75  <Field PropertyName _wrapperName>
	//    9   15:putfield        #75  <Field PropertyName _wrapperName>
		_member = beanpropertywriter._member;
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:getfield        #69  <Field AnnotatedMember _member>
	//   13   23:putfield        #69  <Field AnnotatedMember _member>
		_contextAnnotations = beanpropertywriter._contextAnnotations;
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:getfield        #71  <Field Annotations _contextAnnotations>
	//   17   31:putfield        #71  <Field Annotations _contextAnnotations>
		_declaredType = beanpropertywriter._declaredType;
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:getfield        #79  <Field JavaType _declaredType>
	//   21   39:putfield        #79  <Field JavaType _declaredType>
		_accessorMethod = beanpropertywriter._accessorMethod;
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:getfield        #89  <Field Method _accessorMethod>
	//   25   47:putfield        #89  <Field Method _accessorMethod>
		_field = beanpropertywriter._field;
	//   26   50:aload_0         
	//   27   51:aload_1         
	//   28   52:getfield        #91  <Field Field _field>
	//   29   55:putfield        #91  <Field Field _field>
		_serializer = beanpropertywriter._serializer;
	//   30   58:aload_0         
	//   31   59:aload_1         
	//   32   60:getfield        #81  <Field JsonSerializer _serializer>
	//   33   63:putfield        #81  <Field JsonSerializer _serializer>
		_nullSerializer = beanpropertywriter._nullSerializer;
	//   34   66:aload_0         
	//   35   67:aload_1         
	//   36   68:getfield        #97  <Field JsonSerializer _nullSerializer>
	//   37   71:putfield        #97  <Field JsonSerializer _nullSerializer>
		if(beanpropertywriter._internalSettings != null)
	//*  38   74:aload_1         
	//*  39   75:getfield        #151 <Field HashMap _internalSettings>
	//*  40   78:ifnull          96
			_internalSettings = new HashMap(((java.util.Map) (beanpropertywriter._internalSettings)));
	//   41   81:aload_0         
	//   42   82:new             #153 <Class HashMap>
	//   43   85:dup             
	//   44   86:aload_1         
	//   45   87:getfield        #151 <Field HashMap _internalSettings>
	//   46   90:invokespecial   #156 <Method void HashMap(java.util.Map)>
	//   47   93:putfield        #151 <Field HashMap _internalSettings>
		_cfgSerializationType = beanpropertywriter._cfgSerializationType;
	//   48   96:aload_0         
	//   49   97:aload_1         
	//   50   98:getfield        #87  <Field JavaType _cfgSerializationType>
	//   51  101:putfield        #87  <Field JavaType _cfgSerializationType>
		_dynamicSerializers = beanpropertywriter._dynamicSerializers;
	//   52  104:aload_0         
	//   53  105:aload_1         
	//   54  106:getfield        #83  <Field PropertySerializerMap _dynamicSerializers>
	//   55  109:putfield        #83  <Field PropertySerializerMap _dynamicSerializers>
		_suppressNulls = beanpropertywriter._suppressNulls;
	//   56  112:aload_0         
	//   57  113:aload_1         
	//   58  114:getfield        #93  <Field boolean _suppressNulls>
	//   59  117:putfield        #93  <Field boolean _suppressNulls>
		_suppressableValue = beanpropertywriter._suppressableValue;
	//   60  120:aload_0         
	//   61  121:aload_1         
	//   62  122:getfield        #95  <Field Object _suppressableValue>
	//   63  125:putfield        #95  <Field Object _suppressableValue>
		_includeInViews = beanpropertywriter._includeInViews;
	//   64  128:aload_0         
	//   65  129:aload_1         
	//   66  130:getfield        #77  <Field Class[] _includeInViews>
	//   67  133:putfield        #77  <Field Class[] _includeInViews>
		_typeSerializer = beanpropertywriter._typeSerializer;
	//   68  136:aload_0         
	//   69  137:aload_1         
	//   70  138:getfield        #85  <Field TypeSerializer _typeSerializer>
	//   71  141:putfield        #85  <Field TypeSerializer _typeSerializer>
		_nonTrivialBaseType = beanpropertywriter._nonTrivialBaseType;
	//   72  144:aload_0         
	//   73  145:aload_1         
	//   74  146:getfield        #158 <Field JavaType _nonTrivialBaseType>
	//   75  149:putfield        #158 <Field JavaType _nonTrivialBaseType>
	//   76  152:return          
	}

	protected BeanPropertyWriter(BeanPropertyWriter beanpropertywriter, PropertyName propertyname)
	{
		super(((PropertyWriter) (beanpropertywriter)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #149 <Method void PropertyWriter(PropertyWriter)>
		_name = new SerializedString(propertyname.getSimpleName());
	//    3    5:aload_0         
	//    4    6:new             #103 <Class SerializedString>
	//    5    9:dup             
	//    6   10:aload_2         
	//    7   11:invokevirtual   #164 <Method String PropertyName.getSimpleName()>
	//    8   14:invokespecial   #112 <Method void SerializedString(String)>
	//    9   17:putfield        #73  <Field SerializedString _name>
		_wrapperName = beanpropertywriter._wrapperName;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:getfield        #75  <Field PropertyName _wrapperName>
	//   13   25:putfield        #75  <Field PropertyName _wrapperName>
		_contextAnnotations = beanpropertywriter._contextAnnotations;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:getfield        #71  <Field Annotations _contextAnnotations>
	//   17   33:putfield        #71  <Field Annotations _contextAnnotations>
		_declaredType = beanpropertywriter._declaredType;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:getfield        #79  <Field JavaType _declaredType>
	//   21   41:putfield        #79  <Field JavaType _declaredType>
		_member = beanpropertywriter._member;
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:getfield        #69  <Field AnnotatedMember _member>
	//   25   49:putfield        #69  <Field AnnotatedMember _member>
		_accessorMethod = beanpropertywriter._accessorMethod;
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:getfield        #89  <Field Method _accessorMethod>
	//   29   57:putfield        #89  <Field Method _accessorMethod>
		_field = beanpropertywriter._field;
	//   30   60:aload_0         
	//   31   61:aload_1         
	//   32   62:getfield        #91  <Field Field _field>
	//   33   65:putfield        #91  <Field Field _field>
		_serializer = beanpropertywriter._serializer;
	//   34   68:aload_0         
	//   35   69:aload_1         
	//   36   70:getfield        #81  <Field JsonSerializer _serializer>
	//   37   73:putfield        #81  <Field JsonSerializer _serializer>
		_nullSerializer = beanpropertywriter._nullSerializer;
	//   38   76:aload_0         
	//   39   77:aload_1         
	//   40   78:getfield        #97  <Field JsonSerializer _nullSerializer>
	//   41   81:putfield        #97  <Field JsonSerializer _nullSerializer>
		if(beanpropertywriter._internalSettings != null)
	//*  42   84:aload_1         
	//*  43   85:getfield        #151 <Field HashMap _internalSettings>
	//*  44   88:ifnull          106
			_internalSettings = new HashMap(((java.util.Map) (beanpropertywriter._internalSettings)));
	//   45   91:aload_0         
	//   46   92:new             #153 <Class HashMap>
	//   47   95:dup             
	//   48   96:aload_1         
	//   49   97:getfield        #151 <Field HashMap _internalSettings>
	//   50  100:invokespecial   #156 <Method void HashMap(java.util.Map)>
	//   51  103:putfield        #151 <Field HashMap _internalSettings>
		_cfgSerializationType = beanpropertywriter._cfgSerializationType;
	//   52  106:aload_0         
	//   53  107:aload_1         
	//   54  108:getfield        #87  <Field JavaType _cfgSerializationType>
	//   55  111:putfield        #87  <Field JavaType _cfgSerializationType>
		_dynamicSerializers = beanpropertywriter._dynamicSerializers;
	//   56  114:aload_0         
	//   57  115:aload_1         
	//   58  116:getfield        #83  <Field PropertySerializerMap _dynamicSerializers>
	//   59  119:putfield        #83  <Field PropertySerializerMap _dynamicSerializers>
		_suppressNulls = beanpropertywriter._suppressNulls;
	//   60  122:aload_0         
	//   61  123:aload_1         
	//   62  124:getfield        #93  <Field boolean _suppressNulls>
	//   63  127:putfield        #93  <Field boolean _suppressNulls>
		_suppressableValue = beanpropertywriter._suppressableValue;
	//   64  130:aload_0         
	//   65  131:aload_1         
	//   66  132:getfield        #95  <Field Object _suppressableValue>
	//   67  135:putfield        #95  <Field Object _suppressableValue>
		_includeInViews = beanpropertywriter._includeInViews;
	//   68  138:aload_0         
	//   69  139:aload_1         
	//   70  140:getfield        #77  <Field Class[] _includeInViews>
	//   71  143:putfield        #77  <Field Class[] _includeInViews>
		_typeSerializer = beanpropertywriter._typeSerializer;
	//   72  146:aload_0         
	//   73  147:aload_1         
	//   74  148:getfield        #85  <Field TypeSerializer _typeSerializer>
	//   75  151:putfield        #85  <Field TypeSerializer _typeSerializer>
		_nonTrivialBaseType = beanpropertywriter._nonTrivialBaseType;
	//   76  154:aload_0         
	//   77  155:aload_1         
	//   78  156:getfield        #158 <Field JavaType _nonTrivialBaseType>
	//   79  159:putfield        #158 <Field JavaType _nonTrivialBaseType>
	//   80  162:return          
	}

	protected void _depositSchemaProperty(ObjectNode objectnode, JsonNode jsonnode)
	{
		objectnode.set(getName(), jsonnode);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #167 <Method String getName()>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #173 <Method JsonNode ObjectNode.set(String, JsonNode)>
	//    5    9:pop             
	//    6   10:return          
	}

	protected JsonSerializer _findAndAddDynamic(PropertySerializerMap propertyserializermap, Class class1, SerializerProvider serializerprovider)
		throws JsonMappingException
	{
		if(_nonTrivialBaseType != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #158 <Field JavaType _nonTrivialBaseType>
	//*   2    4:ifnull          44
			class1 = ((Class) (propertyserializermap.findAndAddPrimarySerializer(serializerprovider.constructSpecializedType(_nonTrivialBaseType, class1), serializerprovider, ((com.fasterxml.jackson.databind.BeanProperty) (this)))));
	//    3    7:aload_1         
	//    4    8:aload_3         
	//    5    9:aload_0         
	//    6   10:getfield        #158 <Field JavaType _nonTrivialBaseType>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #183 <Method JavaType SerializerProvider.constructSpecializedType(JavaType, Class)>
	//    9   17:aload_3         
	//   10   18:aload_0         
	//   11   19:invokevirtual   #187 <Method com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult PropertySerializerMap.findAndAddPrimarySerializer(JavaType, SerializerProvider, com.fasterxml.jackson.databind.BeanProperty)>
	//   12   22:astore_2        
		else
	//*  13   23:aload_1         
	//*  14   24:aload_2         
	//*  15   25:getfield        #192 <Field PropertySerializerMap com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.map>
	//*  16   28:if_acmpeq       39
	//*  17   31:aload_0         
	//*  18   32:aload_2         
	//*  19   33:getfield        #192 <Field PropertySerializerMap com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.map>
	//*  20   36:putfield        #83  <Field PropertySerializerMap _dynamicSerializers>
	//*  21   39:aload_2         
	//*  22   40:getfield        #195 <Field JsonSerializer com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.serializer>
	//*  23   43:areturn         
			class1 = ((Class) (propertyserializermap.findAndAddPrimarySerializer(class1, serializerprovider, ((com.fasterxml.jackson.databind.BeanProperty) (this)))));
	//   24   44:aload_1         
	//   25   45:aload_2         
	//   26   46:aload_3         
	//   27   47:aload_0         
	//   28   48:invokevirtual   #198 <Method com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult PropertySerializerMap.findAndAddPrimarySerializer(Class, SerializerProvider, com.fasterxml.jackson.databind.BeanProperty)>
	//   29   51:astore_2        
		if(propertyserializermap != ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).map)
			_dynamicSerializers = ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).map;
		return ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).serializer;
	//*  30   52:goto            23
	}

	protected boolean _handleSelfReference(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, JsonSerializer jsonserializer)
		throws JsonMappingException
	{
		if(serializerprovider.isEnabled(SerializationFeature.FAIL_ON_SELF_REFERENCES) && !jsonserializer.usesObjectId() && (jsonserializer instanceof BeanSerializerBase))
	//*   0    0:aload_3         
	//*   1    1:getstatic       #208 <Field SerializationFeature SerializationFeature.FAIL_ON_SELF_REFERENCES>
	//*   2    4:invokevirtual   #212 <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*   3    7:ifeq            33
	//*   4   10:aload           4
	//*   5   12:invokevirtual   #218 <Method boolean JsonSerializer.usesObjectId()>
	//*   6   15:ifne            33
	//*   7   18:aload           4
	//*   8   20:instanceof      #220 <Class BeanSerializerBase>
	//*   9   23:ifeq            33
			throw JsonMappingException.from(jsongenerator, "Direct self-reference leading to cycle");
	//   10   26:aload_2         
	//   11   27:ldc1            #222 <String "Direct self-reference leading to cycle">
	//   12   29:invokestatic    #226 <Method JsonMappingException JsonMappingException.from(JsonGenerator, String)>
	//   13   32:athrow          
		else
			return false;
	//   14   33:iconst_0        
	//   15   34:ireturn         
	}

	protected BeanPropertyWriter _new(PropertyName propertyname)
	{
		return new BeanPropertyWriter(this, propertyname);
	//    0    0:new             #2   <Class BeanPropertyWriter>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #231 <Method void BeanPropertyWriter(BeanPropertyWriter, PropertyName)>
	//    5    9:areturn         
	}

	public void assignNullSerializer(JsonSerializer jsonserializer)
	{
		if(_nullSerializer != null && _nullSerializer != jsonserializer)
	//*   0    0:aload_0         
	//*   1    1:getfield        #97  <Field JsonSerializer _nullSerializer>
	//*   2    4:ifnull          25
	//*   3    7:aload_0         
	//*   4    8:getfield        #97  <Field JsonSerializer _nullSerializer>
	//*   5   11:aload_1         
	//*   6   12:if_acmpeq       25
		{
			throw new IllegalStateException("Can not override null serializer");
	//    7   15:new             #235 <Class IllegalStateException>
	//    8   18:dup             
	//    9   19:ldc1            #237 <String "Can not override null serializer">
	//   10   21:invokespecial   #238 <Method void IllegalStateException(String)>
	//   11   24:athrow          
		} else
		{
			_nullSerializer = jsonserializer;
	//   12   25:aload_0         
	//   13   26:aload_1         
	//   14   27:putfield        #97  <Field JsonSerializer _nullSerializer>
			return;
	//   15   30:return          
		}
	}

	public void assignSerializer(JsonSerializer jsonserializer)
	{
		if(_serializer != null && _serializer != jsonserializer)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field JsonSerializer _serializer>
	//*   2    4:ifnull          25
	//*   3    7:aload_0         
	//*   4    8:getfield        #81  <Field JsonSerializer _serializer>
	//*   5   11:aload_1         
	//*   6   12:if_acmpeq       25
		{
			throw new IllegalStateException("Can not override serializer");
	//    7   15:new             #235 <Class IllegalStateException>
	//    8   18:dup             
	//    9   19:ldc1            #242 <String "Can not override serializer">
	//   10   21:invokespecial   #238 <Method void IllegalStateException(String)>
	//   11   24:athrow          
		} else
		{
			_serializer = jsonserializer;
	//   12   25:aload_0         
	//   13   26:aload_1         
	//   14   27:putfield        #81  <Field JsonSerializer _serializer>
			return;
	//   15   30:return          
		}
	}

	public void assignTypeSerializer(TypeSerializer typeserializer)
	{
		_typeSerializer = typeserializer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #85  <Field TypeSerializer _typeSerializer>
	//    3    5:return          
	}

	public void depositSchemaProperty(JsonObjectFormatVisitor jsonobjectformatvisitor, SerializerProvider serializerprovider)
		throws JsonMappingException
	{
label0:
		{
			if(jsonobjectformatvisitor != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          18
			{
				if(!isRequired())
					break label0;
	//    2    4:aload_0         
	//    3    5:invokevirtual   #249 <Method boolean isRequired()>
	//    4    8:ifeq            19
				jsonobjectformatvisitor.property(((com.fasterxml.jackson.databind.BeanProperty) (this)));
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:invokeinterface #255 <Method void JsonObjectFormatVisitor.property(com.fasterxml.jackson.databind.BeanProperty)>
			}
			return;
	//    8   18:return          
		}
		jsonobjectformatvisitor.optionalProperty(((com.fasterxml.jackson.databind.BeanProperty) (this)));
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:invokeinterface #258 <Method void JsonObjectFormatVisitor.optionalProperty(com.fasterxml.jackson.databind.BeanProperty)>
	//   12   26:return          
	}

	public void depositSchemaProperty(ObjectNode objectnode, SerializerProvider serializerprovider)
		throws JsonMappingException
	{
		Object obj = ((Object) (getSerializationType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #264 <Method JavaType getSerializationType()>
	//    2    4:astore          4
		boolean flag;
		JsonSerializer jsonserializer;
		Type type;
		if(obj == null)
	//*   3    6:aload           4
	//*   4    8:ifnonnull       89
			obj = ((Object) (getType()));
	//    5   11:aload_0         
	//    6   12:invokevirtual   #267 <Method JavaType getType()>
	//    7   15:astore          4
		else
	//*   8   17:aload           4
	//*   9   19:checkcast       #269 <Class Type>
	//*  10   22:astore          6
	//*  11   24:aload_0         
	//*  12   25:invokevirtual   #273 <Method JsonSerializer getSerializer()>
	//*  13   28:astore          5
	//*  14   30:aload           5
	//*  15   32:astore          4
	//*  16   34:aload           5
	//*  17   36:ifnonnull       50
	//*  18   39:aload_2         
	//*  19   40:aload_0         
	//*  20   41:invokevirtual   #267 <Method JavaType getType()>
	//*  21   44:aload_0         
	//*  22   45:invokevirtual   #277 <Method JsonSerializer SerializerProvider.findValueSerializer(JavaType, com.fasterxml.jackson.databind.BeanProperty)>
	//*  23   48:astore          4
	//*  24   50:aload_0         
	//*  25   51:invokevirtual   #249 <Method boolean isRequired()>
	//*  26   54:ifne            99
	//*  27   57:iconst_1        
	//*  28   58:istore_3        
	//*  29   59:aload           4
	//*  30   61:instanceof      #279 <Class SchemaAware>
	//*  31   64:ifeq            104
	//*  32   67:aload           4
	//*  33   69:checkcast       #279 <Class SchemaAware>
	//*  34   72:aload_2         
	//*  35   73:aload           6
	//*  36   75:iload_3         
	//*  37   76:invokeinterface #283 <Method JsonNode SchemaAware.getSchema(SerializerProvider, Type, boolean)>
	//*  38   81:astore_2        
	//*  39   82:aload_0         
	//*  40   83:aload_1         
	//*  41   84:aload_2         
	//*  42   85:invokevirtual   #285 <Method void _depositSchemaProperty(ObjectNode, JsonNode)>
	//*  43   88:return          
			obj = ((Object) (((JavaType) (obj)).getRawClass()));
	//   44   89:aload           4
	//   45   91:invokevirtual   #291 <Method Class JavaType.getRawClass()>
	//   46   94:astore          4
		type = (Type)obj;
		jsonserializer = getSerializer();
		obj = ((Object) (jsonserializer));
		if(jsonserializer == null)
			obj = ((Object) (serializerprovider.findValueSerializer(getType(), ((com.fasterxml.jackson.databind.BeanProperty) (this)))));
		if(!isRequired())
			flag = true;
		else
	//*  47   96:goto            17
			flag = false;
	//   48   99:iconst_0        
	//   49  100:istore_3        
		if(obj instanceof SchemaAware)
			serializerprovider = ((SerializerProvider) (((SchemaAware)obj).getSchema(serializerprovider, type, flag)));
		else
	//*  50  101:goto            59
			serializerprovider = ((SerializerProvider) (JsonSchema.getDefaultSchemaNode()));
	//   51  104:invokestatic    #297 <Method JsonNode JsonSchema.getDefaultSchemaNode()>
	//   52  107:astore_2        
		_depositSchemaProperty(objectnode, ((JsonNode) (serializerprovider)));
	//*  53  108:goto            82
	}

	public final Object get(Object obj)
		throws Exception
	{
		if(_accessorMethod == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #89  <Field Method _accessorMethod>
	//*   2    4:ifnonnull       16
			return _field.get(obj);
	//    3    7:aload_0         
	//    4    8:getfield        #91  <Field Field _field>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #304 <Method Object Field.get(Object)>
	//    7   15:areturn         
		else
			return _accessorMethod.invoke(obj, new Object[0]);
	//    8   16:aload_0         
	//    9   17:getfield        #89  <Field Method _accessorMethod>
	//   10   20:aload_1         
	//   11   21:iconst_0        
	//   12   22:anewarray       Object[]
	//   13   25:invokevirtual   #310 <Method Object Method.invoke(Object, Object[])>
	//   14   28:areturn         
	}

	public Annotation getAnnotation(Class class1)
	{
		if(_member == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field AnnotatedMember _member>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return _member.getAnnotation(class1);
	//    5    9:aload_0         
	//    6   10:getfield        #69  <Field AnnotatedMember _member>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #314 <Method Annotation AnnotatedMember.getAnnotation(Class)>
	//    9   17:areturn         
	}

	public Annotation getContextAnnotation(Class class1)
	{
		if(_contextAnnotations == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field Annotations _contextAnnotations>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return _contextAnnotations.get(class1);
	//    5    9:aload_0         
	//    6   10:getfield        #71  <Field Annotations _contextAnnotations>
	//    7   13:aload_1         
	//    8   14:invokeinterface #320 <Method Annotation Annotations.get(Class)>
	//    9   19:areturn         
	}

	public PropertyName getFullName()
	{
		return new PropertyName(_name.getValue());
	//    0    0:new             #161 <Class PropertyName>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #73  <Field SerializedString _name>
	//    4    8:invokevirtual   #324 <Method String SerializedString.getValue()>
	//    5   11:invokespecial   #325 <Method void PropertyName(String)>
	//    6   14:areturn         
	}

	public Type getGenericPropertyType()
	{
		if(_accessorMethod != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #89  <Field Method _accessorMethod>
	//*   2    4:ifnull          15
			return _accessorMethod.getGenericReturnType();
	//    3    7:aload_0         
	//    4    8:getfield        #89  <Field Method _accessorMethod>
	//    5   11:invokevirtual   #330 <Method Type Method.getGenericReturnType()>
	//    6   14:areturn         
		if(_field != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #91  <Field Field _field>
	//*   9   19:ifnull          30
			return _field.getGenericType();
	//   10   22:aload_0         
	//   11   23:getfield        #91  <Field Field _field>
	//   12   26:invokevirtual   #333 <Method Type Field.getGenericType()>
	//   13   29:areturn         
		else
			return null;
	//   14   30:aconst_null     
	//   15   31:areturn         
	}

	public Object getInternalSetting(Object obj)
	{
		if(_internalSettings == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #151 <Field HashMap _internalSettings>
	//*   2    4:ifnonnull       9
			return ((Object) (null));
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return _internalSettings.get(obj);
	//    5    9:aload_0         
	//    6   10:getfield        #151 <Field HashMap _internalSettings>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #335 <Method Object HashMap.get(Object)>
	//    9   17:areturn         
	}

	public AnnotatedMember getMember()
	{
		return _member;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field AnnotatedMember _member>
	//    2    4:areturn         
	}

	public String getName()
	{
		return _name.getValue();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field SerializedString _name>
	//    2    4:invokevirtual   #324 <Method String SerializedString.getValue()>
	//    3    7:areturn         
	}

	public Class getPropertyType()
	{
		if(_accessorMethod != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #89  <Field Method _accessorMethod>
	//*   2    4:ifnull          15
			return _accessorMethod.getReturnType();
	//    3    7:aload_0         
	//    4    8:getfield        #89  <Field Method _accessorMethod>
	//    5   11:invokevirtual   #340 <Method Class Method.getReturnType()>
	//    6   14:areturn         
		if(_field != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #91  <Field Field _field>
	//*   9   19:ifnull          30
			return _field.getType();
	//   10   22:aload_0         
	//   11   23:getfield        #91  <Field Field _field>
	//   12   26:invokevirtual   #342 <Method Class Field.getType()>
	//   13   29:areturn         
		else
			return null;
	//   14   30:aconst_null     
	//   15   31:areturn         
	}

	public Class getRawSerializationType()
	{
		if(_cfgSerializationType == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #87  <Field JavaType _cfgSerializationType>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return _cfgSerializationType.getRawClass();
	//    5    9:aload_0         
	//    6   10:getfield        #87  <Field JavaType _cfgSerializationType>
	//    7   13:invokevirtual   #291 <Method Class JavaType.getRawClass()>
	//    8   16:areturn         
	}

	public JavaType getSerializationType()
	{
		return _cfgSerializationType;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field JavaType _cfgSerializationType>
	//    2    4:areturn         
	}

	public SerializableString getSerializedName()
	{
		return ((SerializableString) (_name));
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field SerializedString _name>
	//    2    4:areturn         
	}

	public JsonSerializer getSerializer()
	{
		return _serializer;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field JsonSerializer _serializer>
	//    2    4:areturn         
	}

	public JavaType getType()
	{
		return _declaredType;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field JavaType _declaredType>
	//    2    4:areturn         
	}

	public TypeSerializer getTypeSerializer()
	{
		return _typeSerializer;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field TypeSerializer _typeSerializer>
	//    2    4:areturn         
	}

	public Class[] getViews()
	{
		return _includeInViews;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field Class[] _includeInViews>
	//    2    4:areturn         
	}

	public PropertyName getWrapperName()
	{
		return _wrapperName;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field PropertyName _wrapperName>
	//    2    4:areturn         
	}

	public boolean hasNullSerializer()
	{
		return _nullSerializer != null;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field JsonSerializer _nullSerializer>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean hasSerializer()
	{
		return _serializer != null;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field JsonSerializer _serializer>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean isUnwrapping()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	Object readResolve()
	{
		if(!(_member instanceof AnnotatedField)) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field AnnotatedMember _member>
	//    2    4:instanceof      #128 <Class AnnotatedField>
	//    3    7:ifeq            45
_L1:
		_accessorMethod = null;
	//    4   10:aload_0         
	//    5   11:aconst_null     
	//    6   12:putfield        #89  <Field Method _accessorMethod>
		_field = (Field)_member.getMember();
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #69  <Field AnnotatedMember _member>
	//   10   20:invokevirtual   #134 <Method java.lang.reflect.Member AnnotatedMember.getMember()>
	//   11   23:checkcast       #136 <Class Field>
	//   12   26:putfield        #91  <Field Field _field>
_L4:
		if(_serializer == null)
	//*  13   29:aload_0         
	//*  14   30:getfield        #81  <Field JsonSerializer _serializer>
	//*  15   33:ifnonnull       43
			_dynamicSerializers = PropertySerializerMap.emptyForProperties();
	//   16   36:aload_0         
	//   17   37:invokestatic    #126 <Method PropertySerializerMap PropertySerializerMap.emptyForProperties()>
	//   18   40:putfield        #83  <Field PropertySerializerMap _dynamicSerializers>
		return ((Object) (this));
	//   19   43:aload_0         
	//   20   44:areturn         
_L2:
		if(_member instanceof AnnotatedMethod)
	//*  21   45:aload_0         
	//*  22   46:getfield        #69  <Field AnnotatedMember _member>
	//*  23   49:instanceof      #138 <Class AnnotatedMethod>
	//*  24   52:ifeq            29
		{
			_accessorMethod = (Method)_member.getMember();
	//   25   55:aload_0         
	//   26   56:aload_0         
	//   27   57:getfield        #69  <Field AnnotatedMember _member>
	//   28   60:invokevirtual   #134 <Method java.lang.reflect.Member AnnotatedMember.getMember()>
	//   29   63:checkcast       #140 <Class Method>
	//   30   66:putfield        #89  <Field Method _accessorMethod>
			_field = null;
	//   31   69:aload_0         
	//   32   70:aconst_null     
	//   33   71:putfield        #91  <Field Field _field>
		}
		if(true) goto _L4; else goto _L3
	//   34   74:goto            29
_L3:
	}

	public Object removeInternalSetting(Object obj)
	{
		Object obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		if(_internalSettings != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #151 <Field HashMap _internalSettings>
	//*   4    6:ifnull          37
		{
			obj = _internalSettings.remove(obj);
	//    5    9:aload_0         
	//    6   10:getfield        #151 <Field HashMap _internalSettings>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #360 <Method Object HashMap.remove(Object)>
	//    9   17:astore_1        
			obj1 = obj;
	//   10   18:aload_1         
	//   11   19:astore_2        
			if(_internalSettings.size() == 0)
	//*  12   20:aload_0         
	//*  13   21:getfield        #151 <Field HashMap _internalSettings>
	//*  14   24:invokevirtual   #364 <Method int HashMap.size()>
	//*  15   27:ifne            37
			{
				_internalSettings = null;
	//   16   30:aload_0         
	//   17   31:aconst_null     
	//   18   32:putfield        #151 <Field HashMap _internalSettings>
				obj1 = obj;
	//   19   35:aload_1         
	//   20   36:astore_2        
			}
		}
		return obj1;
	//   21   37:aload_2         
	//   22   38:areturn         
	}

	public BeanPropertyWriter rename(NameTransformer nametransformer)
	{
		nametransformer = ((NameTransformer) (nametransformer.transform(_name.getValue())));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #73  <Field SerializedString _name>
	//    3    5:invokevirtual   #324 <Method String SerializedString.getValue()>
	//    4    8:invokevirtual   #372 <Method String NameTransformer.transform(String)>
	//    5   11:astore_1        
		if(((String) (nametransformer)).equals(((Object) (_name.toString()))))
	//*   6   12:aload_1         
	//*   7   13:aload_0         
	//*   8   14:getfield        #73  <Field SerializedString _name>
	//*   9   17:invokevirtual   #375 <Method String SerializedString.toString()>
	//*  10   20:invokevirtual   #381 <Method boolean String.equals(Object)>
	//*  11   23:ifeq            28
			return this;
	//   12   26:aload_0         
	//   13   27:areturn         
		else
			return _new(PropertyName.construct(((String) (nametransformer))));
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokestatic    #385 <Method PropertyName PropertyName.construct(String)>
	//   17   33:invokevirtual   #387 <Method BeanPropertyWriter _new(PropertyName)>
	//   18   36:areturn         
	}

	public void serializeAsElement(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws Exception
	{
		Object obj1;
		if(_accessorMethod == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #89  <Field Method _accessorMethod>
	//*   2    4:ifnonnull       40
			obj1 = _field.get(obj);
	//    3    7:aload_0         
	//    4    8:getfield        #91  <Field Field _field>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #304 <Method Object Field.get(Object)>
	//    7   15:astore          5
		else
	//*   8   17:aload           5
	//*   9   19:ifnonnull       62
	//*  10   22:aload_0         
	//*  11   23:getfield        #97  <Field JsonSerializer _nullSerializer>
	//*  12   26:ifnull          57
	//*  13   29:aload_0         
	//*  14   30:getfield        #97  <Field JsonSerializer _nullSerializer>
	//*  15   33:aconst_null     
	//*  16   34:aload_2         
	//*  17   35:aload_3         
	//*  18   36:invokevirtual   #392 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
	//*  19   39:return          
			obj1 = _accessorMethod.invoke(obj, new Object[0]);
	//   20   40:aload_0         
	//   21   41:getfield        #89  <Field Method _accessorMethod>
	//   22   44:aload_1         
	//   23   45:iconst_0        
	//   24   46:anewarray       Object[]
	//   25   49:invokevirtual   #310 <Method Object Method.invoke(Object, Object[])>
	//   26   52:astore          5
		if(obj1 != null) goto _L2; else goto _L1
_L1:
		if(_nullSerializer == null) goto _L4; else goto _L3
_L3:
		_nullSerializer.serialize(((Object) (null)), jsongenerator, serializerprovider);
_L6:
		return;
	//*  27   54:goto            17
_L4:
		jsongenerator.writeNull();
	//   28   57:aload_2         
	//   29   58:invokevirtual   #397 <Method void JsonGenerator.writeNull()>
		return;
	//   30   61:return          
_L2:
		JsonSerializer jsonserializer1 = _serializer;
	//   31   62:aload_0         
	//   32   63:getfield        #81  <Field JsonSerializer _serializer>
	//   33   66:astore          6
		JsonSerializer jsonserializer = jsonserializer1;
	//   34   68:aload           6
	//   35   70:astore          4
		if(jsonserializer1 == null)
	//*  36   72:aload           6
	//*  37   74:ifnonnull       119
		{
			Class class1 = obj1.getClass();
	//   38   77:aload           5
	//   39   79:invokevirtual   #400 <Method Class Object.getClass()>
	//   40   82:astore          7
			PropertySerializerMap propertyserializermap = _dynamicSerializers;
	//   41   84:aload_0         
	//   42   85:getfield        #83  <Field PropertySerializerMap _dynamicSerializers>
	//   43   88:astore          8
			JsonSerializer jsonserializer2 = propertyserializermap.serializerFor(class1);
	//   44   90:aload           8
	//   45   92:aload           7
	//   46   94:invokevirtual   #404 <Method JsonSerializer PropertySerializerMap.serializerFor(Class)>
	//   47   97:astore          6
			jsonserializer = jsonserializer2;
	//   48   99:aload           6
	//   49  101:astore          4
			if(jsonserializer2 == null)
	//*  50  103:aload           6
	//*  51  105:ifnonnull       119
				jsonserializer = _findAndAddDynamic(propertyserializermap, class1, serializerprovider);
	//   52  108:aload_0         
	//   53  109:aload           8
	//   54  111:aload           7
	//   55  113:aload_3         
	//   56  114:invokevirtual   #406 <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, Class, SerializerProvider)>
	//   57  117:astore          4
		}
		if(_suppressableValue != null)
	//*  58  119:aload_0         
	//*  59  120:getfield        #95  <Field Object _suppressableValue>
	//*  60  123:ifnull          175
			if(MARKER_FOR_EMPTY == _suppressableValue)
	//*  61  126:getstatic       #56  <Field Object MARKER_FOR_EMPTY>
	//*  62  129:aload_0         
	//*  63  130:getfield        #95  <Field Object _suppressableValue>
	//*  64  133:if_acmpne       155
			{
				if(jsonserializer.isEmpty(serializerprovider, obj1))
	//*  65  136:aload           4
	//*  66  138:aload_3         
	//*  67  139:aload           5
	//*  68  141:invokevirtual   #410 <Method boolean JsonSerializer.isEmpty(SerializerProvider, Object)>
	//*  69  144:ifeq            175
				{
					serializeAsPlaceholder(obj, jsongenerator, serializerprovider);
	//   70  147:aload_0         
	//   71  148:aload_1         
	//   72  149:aload_2         
	//   73  150:aload_3         
	//   74  151:invokevirtual   #413 <Method void serializeAsPlaceholder(Object, JsonGenerator, SerializerProvider)>
					return;
	//   75  154:return          
				}
			} else
			if(_suppressableValue.equals(obj1))
	//*  76  155:aload_0         
	//*  77  156:getfield        #95  <Field Object _suppressableValue>
	//*  78  159:aload           5
	//*  79  161:invokevirtual   #414 <Method boolean Object.equals(Object)>
	//*  80  164:ifeq            175
			{
				serializeAsPlaceholder(obj, jsongenerator, serializerprovider);
	//   81  167:aload_0         
	//   82  168:aload_1         
	//   83  169:aload_2         
	//   84  170:aload_3         
	//   85  171:invokevirtual   #413 <Method void serializeAsPlaceholder(Object, JsonGenerator, SerializerProvider)>
				return;
	//   86  174:return          
			}
		if(obj1 != obj || !_handleSelfReference(obj, jsongenerator, serializerprovider, jsonserializer))
	//*  87  175:aload           5
	//*  88  177:aload_1         
	//*  89  178:if_acmpne       193
	//*  90  181:aload_0         
	//*  91  182:aload_1         
	//*  92  183:aload_2         
	//*  93  184:aload_3         
	//*  94  185:aload           4
	//*  95  187:invokevirtual   #416 <Method boolean _handleSelfReference(Object, JsonGenerator, SerializerProvider, JsonSerializer)>
	//*  96  190:ifne            39
			if(_typeSerializer == null)
	//*  97  193:aload_0         
	//*  98  194:getfield        #85  <Field TypeSerializer _typeSerializer>
	//*  99  197:ifnonnull       210
			{
				jsonserializer.serialize(obj1, jsongenerator, serializerprovider);
	//  100  200:aload           4
	//  101  202:aload           5
	//  102  204:aload_2         
	//  103  205:aload_3         
	//  104  206:invokevirtual   #392 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
				return;
	//  105  209:return          
			} else
			{
				jsonserializer.serializeWithType(obj1, jsongenerator, serializerprovider, _typeSerializer);
	//  106  210:aload           4
	//  107  212:aload           5
	//  108  214:aload_2         
	//  109  215:aload_3         
	//  110  216:aload_0         
	//  111  217:getfield        #85  <Field TypeSerializer _typeSerializer>
	//  112  220:invokevirtual   #420 <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
				return;
	//  113  223:return          
			}
		if(true) goto _L6; else goto _L5
_L5:
	}

	public void serializeAsField(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws Exception
	{
		Object obj1;
		if(_accessorMethod == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #89  <Field Method _accessorMethod>
	//*   2    4:ifnonnull       48
			obj1 = _field.get(obj);
	//    3    7:aload_0         
	//    4    8:getfield        #91  <Field Field _field>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #304 <Method Object Field.get(Object)>
	//    7   15:astore          5
		else
	//*   8   17:aload           5
	//*   9   19:ifnonnull       65
	//*  10   22:aload_0         
	//*  11   23:getfield        #97  <Field JsonSerializer _nullSerializer>
	//*  12   26:ifnull          47
	//*  13   29:aload_2         
	//*  14   30:aload_0         
	//*  15   31:getfield        #73  <Field SerializedString _name>
	//*  16   34:invokevirtual   #425 <Method void JsonGenerator.writeFieldName(SerializableString)>
	//*  17   37:aload_0         
	//*  18   38:getfield        #97  <Field JsonSerializer _nullSerializer>
	//*  19   41:aconst_null     
	//*  20   42:aload_2         
	//*  21   43:aload_3         
	//*  22   44:invokevirtual   #392 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
	//*  23   47:return          
			obj1 = _accessorMethod.invoke(obj, new Object[0]);
	//   24   48:aload_0         
	//   25   49:getfield        #89  <Field Method _accessorMethod>
	//   26   52:aload_1         
	//   27   53:iconst_0        
	//   28   54:anewarray       Object[]
	//   29   57:invokevirtual   #310 <Method Object Method.invoke(Object, Object[])>
	//   30   60:astore          5
		if(obj1 != null) goto _L2; else goto _L1
_L1:
		if(_nullSerializer != null)
		{
			jsongenerator.writeFieldName(((SerializableString) (_name)));
			_nullSerializer.serialize(((Object) (null)), jsongenerator, serializerprovider);
		}
_L4:
		return;
	//*  31   62:goto            17
_L2:
		JsonSerializer jsonserializer;
		JsonSerializer jsonserializer1 = _serializer;
	//   32   65:aload_0         
	//   33   66:getfield        #81  <Field JsonSerializer _serializer>
	//   34   69:astore          6
		jsonserializer = jsonserializer1;
	//   35   71:aload           6
	//   36   73:astore          4
		if(jsonserializer1 == null)
	//*  37   75:aload           6
	//*  38   77:ifnonnull       122
		{
			Class class1 = obj1.getClass();
	//   39   80:aload           5
	//   40   82:invokevirtual   #400 <Method Class Object.getClass()>
	//   41   85:astore          7
			PropertySerializerMap propertyserializermap = _dynamicSerializers;
	//   42   87:aload_0         
	//   43   88:getfield        #83  <Field PropertySerializerMap _dynamicSerializers>
	//   44   91:astore          8
			JsonSerializer jsonserializer2 = propertyserializermap.serializerFor(class1);
	//   45   93:aload           8
	//   46   95:aload           7
	//   47   97:invokevirtual   #404 <Method JsonSerializer PropertySerializerMap.serializerFor(Class)>
	//   48  100:astore          6
			jsonserializer = jsonserializer2;
	//   49  102:aload           6
	//   50  104:astore          4
			if(jsonserializer2 == null)
	//*  51  106:aload           6
	//*  52  108:ifnonnull       122
				jsonserializer = _findAndAddDynamic(propertyserializermap, class1, serializerprovider);
	//   53  111:aload_0         
	//   54  112:aload           8
	//   55  114:aload           7
	//   56  116:aload_3         
	//   57  117:invokevirtual   #406 <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, Class, SerializerProvider)>
	//   58  120:astore          4
		}
		if(_suppressableValue == null)
			break; /* Loop/switch isn't completed */
	//   59  122:aload_0         
	//   60  123:getfield        #95  <Field Object _suppressableValue>
	//   61  126:ifnull          150
		if(MARKER_FOR_EMPTY != _suppressableValue)
			break MISSING_BLOCK_LABEL_193;
	//   62  129:getstatic       #56  <Field Object MARKER_FOR_EMPTY>
	//   63  132:aload_0         
	//   64  133:getfield        #95  <Field Object _suppressableValue>
	//   65  136:if_acmpne       193
		if(jsonserializer.isEmpty(serializerprovider, obj1)) goto _L4; else goto _L3
	//   66  139:aload           4
	//   67  141:aload_3         
	//   68  142:aload           5
	//   69  144:invokevirtual   #410 <Method boolean JsonSerializer.isEmpty(SerializerProvider, Object)>
	//   70  147:ifne            47
_L3:
		if(obj1 != obj || !_handleSelfReference(obj, jsongenerator, serializerprovider, jsonserializer))
	//*  71  150:aload           5
	//*  72  152:aload_1         
	//*  73  153:if_acmpne       168
	//*  74  156:aload_0         
	//*  75  157:aload_1         
	//*  76  158:aload_2         
	//*  77  159:aload_3         
	//*  78  160:aload           4
	//*  79  162:invokevirtual   #416 <Method boolean _handleSelfReference(Object, JsonGenerator, SerializerProvider, JsonSerializer)>
	//*  80  165:ifne            47
		{
			jsongenerator.writeFieldName(((SerializableString) (_name)));
	//   81  168:aload_2         
	//   82  169:aload_0         
	//   83  170:getfield        #73  <Field SerializedString _name>
	//   84  173:invokevirtual   #425 <Method void JsonGenerator.writeFieldName(SerializableString)>
			if(_typeSerializer == null)
	//*  85  176:aload_0         
	//*  86  177:getfield        #85  <Field TypeSerializer _typeSerializer>
	//*  87  180:ifnonnull       206
			{
				jsonserializer.serialize(obj1, jsongenerator, serializerprovider);
	//   88  183:aload           4
	//   89  185:aload           5
	//   90  187:aload_2         
	//   91  188:aload_3         
	//   92  189:invokevirtual   #392 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
				return;
	//   93  192:return          
			} else
	//*  94  193:aload_0         
	//*  95  194:getfield        #95  <Field Object _suppressableValue>
	//*  96  197:aload           5
	//*  97  199:invokevirtual   #414 <Method boolean Object.equals(Object)>
	//*  98  202:ifeq            150
	//*  99  205:return          
			{
				jsonserializer.serializeWithType(obj1, jsongenerator, serializerprovider, _typeSerializer);
	//  100  206:aload           4
	//  101  208:aload           5
	//  102  210:aload_2         
	//  103  211:aload_3         
	//  104  212:aload_0         
	//  105  213:getfield        #85  <Field TypeSerializer _typeSerializer>
	//  106  216:invokevirtual   #420 <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
				return;
	//  107  219:return          
			}
		}
		continue; /* Loop/switch isn't completed */
		if(_suppressableValue.equals(obj1))
			return;
		  goto _L3
		if(true) goto _L4; else goto _L5
_L5:
	}

	public void serializeAsOmittedField(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws Exception
	{
		if(!jsongenerator.canOmitFields())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #429 <Method boolean JsonGenerator.canOmitFields()>
	//*   2    4:ifne            18
			jsongenerator.writeOmittedField(_name.getValue());
	//    3    7:aload_2         
	//    4    8:aload_0         
	//    5    9:getfield        #73  <Field SerializedString _name>
	//    6   12:invokevirtual   #324 <Method String SerializedString.getValue()>
	//    7   15:invokevirtual   #432 <Method void JsonGenerator.writeOmittedField(String)>
	//    8   18:return          
	}

	public void serializeAsPlaceholder(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws Exception
	{
		if(_nullSerializer != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #97  <Field JsonSerializer _nullSerializer>
	//*   2    4:ifnull          18
		{
			_nullSerializer.serialize(((Object) (null)), jsongenerator, serializerprovider);
	//    3    7:aload_0         
	//    4    8:getfield        #97  <Field JsonSerializer _nullSerializer>
	//    5   11:aconst_null     
	//    6   12:aload_2         
	//    7   13:aload_3         
	//    8   14:invokevirtual   #392 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
			return;
	//    9   17:return          
		} else
		{
			jsongenerator.writeNull();
	//   10   18:aload_2         
	//   11   19:invokevirtual   #397 <Method void JsonGenerator.writeNull()>
			return;
	//   12   22:return          
		}
	}

	public Object setInternalSetting(Object obj, Object obj1)
	{
		if(_internalSettings == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #151 <Field HashMap _internalSettings>
	//*   2    4:ifnonnull       18
			_internalSettings = new HashMap();
	//    3    7:aload_0         
	//    4    8:new             #153 <Class HashMap>
	//    5   11:dup             
	//    6   12:invokespecial   #436 <Method void HashMap()>
	//    7   15:putfield        #151 <Field HashMap _internalSettings>
		return _internalSettings.put(obj, obj1);
	//    8   18:aload_0         
	//    9   19:getfield        #151 <Field HashMap _internalSettings>
	//   10   22:aload_1         
	//   11   23:aload_2         
	//   12   24:invokevirtual   #439 <Method Object HashMap.put(Object, Object)>
	//   13   27:areturn         
	}

	public void setNonTrivialBaseType(JavaType javatype)
	{
		_nonTrivialBaseType = javatype;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #158 <Field JavaType _nonTrivialBaseType>
	//    3    5:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder(40);
	//    0    0:new             #443 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:bipush          40
	//    3    6:invokespecial   #446 <Method void StringBuilder(int)>
	//    4    9:astore_1        
		stringbuilder.append("property '").append(getName()).append("' (");
	//    5   10:aload_1         
	//    6   11:ldc2            #448 <String "property '">
	//    7   14:invokevirtual   #452 <Method StringBuilder StringBuilder.append(String)>
	//    8   17:aload_0         
	//    9   18:invokevirtual   #167 <Method String getName()>
	//   10   21:invokevirtual   #452 <Method StringBuilder StringBuilder.append(String)>
	//   11   24:ldc2            #454 <String "' (">
	//   12   27:invokevirtual   #452 <Method StringBuilder StringBuilder.append(String)>
	//   13   30:pop             
		if(_accessorMethod != null)
	//*  14   31:aload_0         
	//*  15   32:getfield        #89  <Field Method _accessorMethod>
	//*  16   35:ifnull          102
			stringbuilder.append("via method ").append(_accessorMethod.getDeclaringClass().getName()).append("#").append(_accessorMethod.getName());
	//   17   38:aload_1         
	//   18   39:ldc2            #456 <String "via method ">
	//   19   42:invokevirtual   #452 <Method StringBuilder StringBuilder.append(String)>
	//   20   45:aload_0         
	//   21   46:getfield        #89  <Field Method _accessorMethod>
	//   22   49:invokevirtual   #459 <Method Class Method.getDeclaringClass()>
	//   23   52:invokevirtual   #462 <Method String Class.getName()>
	//   24   55:invokevirtual   #452 <Method StringBuilder StringBuilder.append(String)>
	//   25   58:ldc2            #464 <String "#">
	//   26   61:invokevirtual   #452 <Method StringBuilder StringBuilder.append(String)>
	//   27   64:aload_0         
	//   28   65:getfield        #89  <Field Method _accessorMethod>
	//   29   68:invokevirtual   #465 <Method String Method.getName()>
	//   30   71:invokevirtual   #452 <Method StringBuilder StringBuilder.append(String)>
	//   31   74:pop             
		else
	//*  32   75:aload_0         
	//*  33   76:getfield        #81  <Field JsonSerializer _serializer>
	//*  34   79:ifnonnull       160
	//*  35   82:aload_1         
	//*  36   83:ldc2            #467 <String ", no static serializer">
	//*  37   86:invokevirtual   #452 <Method StringBuilder StringBuilder.append(String)>
	//*  38   89:pop             
	//*  39   90:aload_1         
	//*  40   91:bipush          41
	//*  41   93:invokevirtual   #470 <Method StringBuilder StringBuilder.append(char)>
	//*  42   96:pop             
	//*  43   97:aload_1         
	//*  44   98:invokevirtual   #471 <Method String StringBuilder.toString()>
	//*  45  101:areturn         
		if(_field != null)
	//*  46  102:aload_0         
	//*  47  103:getfield        #91  <Field Field _field>
	//*  48  106:ifnull          149
			stringbuilder.append("field \"").append(_field.getDeclaringClass().getName()).append("#").append(_field.getName());
	//   49  109:aload_1         
	//   50  110:ldc2            #473 <String "field \"">
	//   51  113:invokevirtual   #452 <Method StringBuilder StringBuilder.append(String)>
	//   52  116:aload_0         
	//   53  117:getfield        #91  <Field Field _field>
	//   54  120:invokevirtual   #474 <Method Class Field.getDeclaringClass()>
	//   55  123:invokevirtual   #462 <Method String Class.getName()>
	//   56  126:invokevirtual   #452 <Method StringBuilder StringBuilder.append(String)>
	//   57  129:ldc2            #464 <String "#">
	//   58  132:invokevirtual   #452 <Method StringBuilder StringBuilder.append(String)>
	//   59  135:aload_0         
	//   60  136:getfield        #91  <Field Field _field>
	//   61  139:invokevirtual   #475 <Method String Field.getName()>
	//   62  142:invokevirtual   #452 <Method StringBuilder StringBuilder.append(String)>
	//   63  145:pop             
		else
	//*  64  146:goto            75
			stringbuilder.append("virtual");
	//   65  149:aload_1         
	//   66  150:ldc2            #477 <String "virtual">
	//   67  153:invokevirtual   #452 <Method StringBuilder StringBuilder.append(String)>
	//   68  156:pop             
		if(_serializer == null)
			stringbuilder.append(", no static serializer");
		else
	//*  69  157:goto            75
			stringbuilder.append((new StringBuilder()).append(", static serializer of type ").append(((Object) (_serializer)).getClass().getName()).toString());
	//   70  160:aload_1         
	//   71  161:new             #443 <Class StringBuilder>
	//   72  164:dup             
	//   73  165:invokespecial   #478 <Method void StringBuilder()>
	//   74  168:ldc2            #480 <String ", static serializer of type ">
	//   75  171:invokevirtual   #452 <Method StringBuilder StringBuilder.append(String)>
	//   76  174:aload_0         
	//   77  175:getfield        #81  <Field JsonSerializer _serializer>
	//   78  178:invokevirtual   #400 <Method Class Object.getClass()>
	//   79  181:invokevirtual   #462 <Method String Class.getName()>
	//   80  184:invokevirtual   #452 <Method StringBuilder StringBuilder.append(String)>
	//   81  187:invokevirtual   #471 <Method String StringBuilder.toString()>
	//   82  190:invokevirtual   #452 <Method StringBuilder StringBuilder.append(String)>
	//   83  193:pop             
		stringbuilder.append(')');
		return stringbuilder.toString();
	//*  84  194:goto            90
	}

	public BeanPropertyWriter unwrappingWriter(NameTransformer nametransformer)
	{
		return ((BeanPropertyWriter) (new UnwrappingBeanPropertyWriter(this, nametransformer)));
	//    0    0:new             #483 <Class UnwrappingBeanPropertyWriter>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #486 <Method void UnwrappingBeanPropertyWriter(BeanPropertyWriter, NameTransformer)>
	//    5    9:areturn         
	}

	public boolean willSuppressNulls()
	{
		return _suppressNulls;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field boolean _suppressNulls>
	//    2    4:ireturn         
	}

	public boolean wouldConflictWithName(PropertyName propertyname)
	{
		if(_wrapperName != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #75  <Field PropertyName _wrapperName>
	//*   2    4:ifnull          16
			return _wrapperName.equals(((Object) (propertyname)));
	//    3    7:aload_0         
	//    4    8:getfield        #75  <Field PropertyName _wrapperName>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #490 <Method boolean PropertyName.equals(Object)>
	//    7   15:ireturn         
		return propertyname.hasSimpleName(_name.getValue()) && !propertyname.hasNamespace();
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #73  <Field SerializedString _name>
	//   11   21:invokevirtual   #324 <Method String SerializedString.getValue()>
	//   12   24:invokevirtual   #494 <Method boolean PropertyName.hasSimpleName(String)>
	//   13   27:ifeq            39
	//   14   30:aload_1         
	//   15   31:invokevirtual   #497 <Method boolean PropertyName.hasNamespace()>
	//   16   34:ifne            39
	//   17   37:iconst_1        
	//   18   38:ireturn         
	//   19   39:iconst_0        
	//   20   40:ireturn         
	}

	public static final Object MARKER_FOR_EMPTY;
	private static final long serialVersionUID = 1L;
	protected transient Method _accessorMethod;
	protected final JavaType _cfgSerializationType;
	protected final transient Annotations _contextAnnotations;
	protected final JavaType _declaredType;
	protected transient PropertySerializerMap _dynamicSerializers;
	protected transient Field _field;
	protected final Class _includeInViews[];
	protected transient HashMap _internalSettings;
	protected final AnnotatedMember _member;
	protected final SerializedString _name;
	protected JavaType _nonTrivialBaseType;
	protected JsonSerializer _nullSerializer;
	protected JsonSerializer _serializer;
	protected final boolean _suppressNulls;
	protected final Object _suppressableValue;
	protected TypeSerializer _typeSerializer;
	protected final PropertyName _wrapperName;

	static 
	{
		MARKER_FOR_EMPTY = ((Object) (com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY));
	//    0    0:getstatic       #54  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_EMPTY>
	//    1    3:putstatic       #56  <Field Object MARKER_FOR_EMPTY>
	//*   2    6:return          
	}
}
