// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.core.JsonGenerator;
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
import com.fasterxml.jackson.databind.util.*;
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
			boolean flag, Object obj, Class aclass[])
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
		_declaredType = javatype;
	//   20   38:aload_0         
	//   21   39:aload           4
	//   22   41:putfield        #79  <Field JavaType _declaredType>
		_serializer = jsonserializer;
	//   23   44:aload_0         
	//   24   45:aload           5
	//   25   47:putfield        #81  <Field JsonSerializer _serializer>
		if(jsonserializer == null)
	//*  26   50:aload           5
	//*  27   52:ifnonnull       62
			beanpropertydefinition = ((BeanPropertyDefinition) (PropertySerializerMap.emptyForProperties()));
	//   28   55:invokestatic    #122 <Method PropertySerializerMap PropertySerializerMap.emptyForProperties()>
	//   29   58:astore_1        
		else
	//*  30   59:goto            64
			beanpropertydefinition = null;
	//   31   62:aconst_null     
	//   32   63:astore_1        
		_dynamicSerializers = ((PropertySerializerMap) (beanpropertydefinition));
	//   33   64:aload_0         
	//   34   65:aload_1         
	//   35   66:putfield        #83  <Field PropertySerializerMap _dynamicSerializers>
		_typeSerializer = typeserializer;
	//   36   69:aload_0         
	//   37   70:aload           6
	//   38   72:putfield        #85  <Field TypeSerializer _typeSerializer>
		_cfgSerializationType = javatype1;
	//   39   75:aload_0         
	//   40   76:aload           7
	//   41   78:putfield        #87  <Field JavaType _cfgSerializationType>
		if(annotatedmember instanceof AnnotatedField)
	//*  42   81:aload_2         
	//*  43   82:instanceof      #124 <Class AnnotatedField>
	//*  44   85:ifeq            107
		{
			_accessorMethod = null;
	//   45   88:aload_0         
	//   46   89:aconst_null     
	//   47   90:putfield        #89  <Field Method _accessorMethod>
			_field = (Field)annotatedmember.getMember();
	//   48   93:aload_0         
	//   49   94:aload_2         
	//   50   95:invokevirtual   #130 <Method java.lang.reflect.Member AnnotatedMember.getMember()>
	//   51   98:checkcast       #132 <Class Field>
	//   52  101:putfield        #91  <Field Field _field>
		} else
	//*  53  104:goto            143
		if(annotatedmember instanceof AnnotatedMethod)
	//*  54  107:aload_2         
	//*  55  108:instanceof      #134 <Class AnnotatedMethod>
	//*  56  111:ifeq            133
		{
			_accessorMethod = (Method)annotatedmember.getMember();
	//   57  114:aload_0         
	//   58  115:aload_2         
	//   59  116:invokevirtual   #130 <Method java.lang.reflect.Member AnnotatedMember.getMember()>
	//   60  119:checkcast       #136 <Class Method>
	//   61  122:putfield        #89  <Field Method _accessorMethod>
			_field = null;
	//   62  125:aload_0         
	//   63  126:aconst_null     
	//   64  127:putfield        #91  <Field Field _field>
		} else
	//*  65  130:goto            143
		{
			_accessorMethod = null;
	//   66  133:aload_0         
	//   67  134:aconst_null     
	//   68  135:putfield        #89  <Field Method _accessorMethod>
			_field = null;
	//   69  138:aload_0         
	//   70  139:aconst_null     
	//   71  140:putfield        #91  <Field Field _field>
		}
		_suppressNulls = flag;
	//   72  143:aload_0         
	//   73  144:iload           8
	//   74  146:putfield        #93  <Field boolean _suppressNulls>
		_suppressableValue = obj;
	//   75  149:aload_0         
	//   76  150:aload           9
	//   77  152:putfield        #95  <Field Object _suppressableValue>
		_nullSerializer = null;
	//   78  155:aload_0         
	//   79  156:aconst_null     
	//   80  157:putfield        #97  <Field JsonSerializer _nullSerializer>
		_includeInViews = aclass;
	//   81  160:aload_0         
	//   82  161:aload           10
	//   83  163:putfield        #77  <Field Class[] _includeInViews>
	//   84  166:return          
	}

	protected BeanPropertyWriter(BeanPropertyWriter beanpropertywriter)
	{
		this(beanpropertywriter, beanpropertywriter._name);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:getfield        #73  <Field SerializedString _name>
	//    4    6:invokespecial   #142 <Method void BeanPropertyWriter(BeanPropertyWriter, SerializedString)>
	//    5    9:return          
	}

	protected BeanPropertyWriter(BeanPropertyWriter beanpropertywriter, SerializedString serializedstring)
	{
		super(((PropertyWriter) (beanpropertywriter)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #145 <Method void PropertyWriter(PropertyWriter)>
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
		serializedstring = ((SerializedString) (beanpropertywriter._internalSettings));
	//   38   74:aload_1         
	//   39   75:getfield        #147 <Field HashMap _internalSettings>
	//   40   78:astore_2        
		if(serializedstring != null)
	//*  41   79:aload_2         
	//*  42   80:ifnull          95
			_internalSettings = new HashMap(((java.util.Map) (serializedstring)));
	//   43   83:aload_0         
	//   44   84:new             #149 <Class HashMap>
	//   45   87:dup             
	//   46   88:aload_2         
	//   47   89:invokespecial   #152 <Method void HashMap(java.util.Map)>
	//   48   92:putfield        #147 <Field HashMap _internalSettings>
		_cfgSerializationType = beanpropertywriter._cfgSerializationType;
	//   49   95:aload_0         
	//   50   96:aload_1         
	//   51   97:getfield        #87  <Field JavaType _cfgSerializationType>
	//   52  100:putfield        #87  <Field JavaType _cfgSerializationType>
		_dynamicSerializers = beanpropertywriter._dynamicSerializers;
	//   53  103:aload_0         
	//   54  104:aload_1         
	//   55  105:getfield        #83  <Field PropertySerializerMap _dynamicSerializers>
	//   56  108:putfield        #83  <Field PropertySerializerMap _dynamicSerializers>
		_suppressNulls = beanpropertywriter._suppressNulls;
	//   57  111:aload_0         
	//   58  112:aload_1         
	//   59  113:getfield        #93  <Field boolean _suppressNulls>
	//   60  116:putfield        #93  <Field boolean _suppressNulls>
		_suppressableValue = beanpropertywriter._suppressableValue;
	//   61  119:aload_0         
	//   62  120:aload_1         
	//   63  121:getfield        #95  <Field Object _suppressableValue>
	//   64  124:putfield        #95  <Field Object _suppressableValue>
		_includeInViews = beanpropertywriter._includeInViews;
	//   65  127:aload_0         
	//   66  128:aload_1         
	//   67  129:getfield        #77  <Field Class[] _includeInViews>
	//   68  132:putfield        #77  <Field Class[] _includeInViews>
		_typeSerializer = beanpropertywriter._typeSerializer;
	//   69  135:aload_0         
	//   70  136:aload_1         
	//   71  137:getfield        #85  <Field TypeSerializer _typeSerializer>
	//   72  140:putfield        #85  <Field TypeSerializer _typeSerializer>
		_nonTrivialBaseType = beanpropertywriter._nonTrivialBaseType;
	//   73  143:aload_0         
	//   74  144:aload_1         
	//   75  145:getfield        #154 <Field JavaType _nonTrivialBaseType>
	//   76  148:putfield        #154 <Field JavaType _nonTrivialBaseType>
	//   77  151:return          
	}

	protected BeanPropertyWriter(BeanPropertyWriter beanpropertywriter, PropertyName propertyname)
	{
		super(((PropertyWriter) (beanpropertywriter)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #145 <Method void PropertyWriter(PropertyWriter)>
		_name = new SerializedString(propertyname.getSimpleName());
	//    3    5:aload_0         
	//    4    6:new             #103 <Class SerializedString>
	//    5    9:dup             
	//    6   10:aload_2         
	//    7   11:invokevirtual   #160 <Method String PropertyName.getSimpleName()>
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
		propertyname = ((PropertyName) (beanpropertywriter._internalSettings));
	//   42   84:aload_1         
	//   43   85:getfield        #147 <Field HashMap _internalSettings>
	//   44   88:astore_2        
		if(propertyname != null)
	//*  45   89:aload_2         
	//*  46   90:ifnull          105
			_internalSettings = new HashMap(((java.util.Map) (propertyname)));
	//   47   93:aload_0         
	//   48   94:new             #149 <Class HashMap>
	//   49   97:dup             
	//   50   98:aload_2         
	//   51   99:invokespecial   #152 <Method void HashMap(java.util.Map)>
	//   52  102:putfield        #147 <Field HashMap _internalSettings>
		_cfgSerializationType = beanpropertywriter._cfgSerializationType;
	//   53  105:aload_0         
	//   54  106:aload_1         
	//   55  107:getfield        #87  <Field JavaType _cfgSerializationType>
	//   56  110:putfield        #87  <Field JavaType _cfgSerializationType>
		_dynamicSerializers = beanpropertywriter._dynamicSerializers;
	//   57  113:aload_0         
	//   58  114:aload_1         
	//   59  115:getfield        #83  <Field PropertySerializerMap _dynamicSerializers>
	//   60  118:putfield        #83  <Field PropertySerializerMap _dynamicSerializers>
		_suppressNulls = beanpropertywriter._suppressNulls;
	//   61  121:aload_0         
	//   62  122:aload_1         
	//   63  123:getfield        #93  <Field boolean _suppressNulls>
	//   64  126:putfield        #93  <Field boolean _suppressNulls>
		_suppressableValue = beanpropertywriter._suppressableValue;
	//   65  129:aload_0         
	//   66  130:aload_1         
	//   67  131:getfield        #95  <Field Object _suppressableValue>
	//   68  134:putfield        #95  <Field Object _suppressableValue>
		_includeInViews = beanpropertywriter._includeInViews;
	//   69  137:aload_0         
	//   70  138:aload_1         
	//   71  139:getfield        #77  <Field Class[] _includeInViews>
	//   72  142:putfield        #77  <Field Class[] _includeInViews>
		_typeSerializer = beanpropertywriter._typeSerializer;
	//   73  145:aload_0         
	//   74  146:aload_1         
	//   75  147:getfield        #85  <Field TypeSerializer _typeSerializer>
	//   76  150:putfield        #85  <Field TypeSerializer _typeSerializer>
		_nonTrivialBaseType = beanpropertywriter._nonTrivialBaseType;
	//   77  153:aload_0         
	//   78  154:aload_1         
	//   79  155:getfield        #154 <Field JavaType _nonTrivialBaseType>
	//   80  158:putfield        #154 <Field JavaType _nonTrivialBaseType>
	//   81  161:return          
	}

	protected void _depositSchemaProperty(ObjectNode objectnode, JsonNode jsonnode)
	{
		objectnode.set(getName(), jsonnode);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #163 <Method String getName()>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #169 <Method JsonNode ObjectNode.set(String, JsonNode)>
	//    5    9:pop             
	//    6   10:return          
	}

	protected JsonSerializer _findAndAddDynamic(PropertySerializerMap propertyserializermap, Class class1, SerializerProvider serializerprovider)
		throws JsonMappingException
	{
		JavaType javatype = _nonTrivialBaseType;
	//    0    0:aload_0         
	//    1    1:getfield        #154 <Field JavaType _nonTrivialBaseType>
	//    2    4:astore          4
		if(javatype != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          28
			class1 = ((Class) (propertyserializermap.findAndAddPrimarySerializer(serializerprovider.constructSpecializedType(javatype, class1), serializerprovider, ((com.fasterxml.jackson.databind.BeanProperty) (this)))));
	//    5   11:aload_1         
	//    6   12:aload_3         
	//    7   13:aload           4
	//    8   15:aload_2         
	//    9   16:invokevirtual   #179 <Method JavaType SerializerProvider.constructSpecializedType(JavaType, Class)>
	//   10   19:aload_3         
	//   11   20:aload_0         
	//   12   21:invokevirtual   #183 <Method com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult PropertySerializerMap.findAndAddPrimarySerializer(JavaType, SerializerProvider, com.fasterxml.jackson.databind.BeanProperty)>
	//   13   24:astore_2        
		else
	//*  14   25:goto            36
			class1 = ((Class) (propertyserializermap.findAndAddPrimarySerializer(class1, serializerprovider, ((com.fasterxml.jackson.databind.BeanProperty) (this)))));
	//   15   28:aload_1         
	//   16   29:aload_2         
	//   17   30:aload_3         
	//   18   31:aload_0         
	//   19   32:invokevirtual   #186 <Method com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult PropertySerializerMap.findAndAddPrimarySerializer(Class, SerializerProvider, com.fasterxml.jackson.databind.BeanProperty)>
	//   20   35:astore_2        
		if(propertyserializermap != ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).map)
	//*  21   36:aload_1         
	//*  22   37:aload_2         
	//*  23   38:getfield        #191 <Field PropertySerializerMap com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.map>
	//*  24   41:if_acmpeq       52
			_dynamicSerializers = ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).map;
	//   25   44:aload_0         
	//   26   45:aload_2         
	//   27   46:getfield        #191 <Field PropertySerializerMap com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.map>
	//   28   49:putfield        #83  <Field PropertySerializerMap _dynamicSerializers>
		return ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).serializer;
	//   29   52:aload_2         
	//   30   53:getfield        #194 <Field JsonSerializer com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.serializer>
	//   31   56:areturn         
	}

	protected boolean _handleSelfReference(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, JsonSerializer jsonserializer)
		throws JsonMappingException
	{
		if(serializerprovider.isEnabled(SerializationFeature.FAIL_ON_SELF_REFERENCES) && !jsonserializer.usesObjectId() && (jsonserializer instanceof BeanSerializerBase))
	//*   0    0:aload_3         
	//*   1    1:getstatic       #204 <Field SerializationFeature SerializationFeature.FAIL_ON_SELF_REFERENCES>
	//*   2    4:invokevirtual   #208 <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*   3    7:ifeq            37
	//*   4   10:aload           4
	//*   5   12:invokevirtual   #214 <Method boolean JsonSerializer.usesObjectId()>
	//*   6   15:ifne            37
	//*   7   18:aload           4
	//*   8   20:instanceof      #216 <Class BeanSerializerBase>
	//*   9   23:ifeq            37
			serializerprovider.reportBadDefinition(getType(), "Direct self-reference leading to cycle");
	//   10   26:aload_3         
	//   11   27:aload_0         
	//   12   28:invokevirtual   #220 <Method JavaType getType()>
	//   13   31:ldc1            #222 <String "Direct self-reference leading to cycle">
	//   14   33:invokevirtual   #226 <Method Object SerializerProvider.reportBadDefinition(JavaType, String)>
	//   15   36:pop             
		return false;
	//   16   37:iconst_0        
	//   17   38:ireturn         
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
		JsonSerializer jsonserializer1 = _nullSerializer;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field JsonSerializer _nullSerializer>
	//    2    4:astore_2        
		if(jsonserializer1 != null && jsonserializer1 != jsonserializer)
	//*   3    5:aload_2         
	//*   4    6:ifnull          48
	//*   5    9:aload_2         
	//*   6   10:aload_1         
	//*   7   11:if_acmpne       17
	//*   8   14:goto            48
		{
			throw new IllegalStateException(String.format("Cannot override _nullSerializer: had a %s, trying to set to %s", new Object[] {
				ClassUtil.classNameOf(((Object) (jsonserializer1))), ClassUtil.classNameOf(((Object) (jsonserializer)))
			}));
	//    9   17:new             #235 <Class IllegalStateException>
	//   10   20:dup             
	//   11   21:ldc1            #237 <String "Cannot override _nullSerializer: had a %s, trying to set to %s">
	//   12   23:iconst_2        
	//   13   24:anewarray       Object[]
	//   14   27:dup             
	//   15   28:iconst_0        
	//   16   29:aload_2         
	//   17   30:invokestatic    #245 <Method String ClassUtil.classNameOf(Object)>
	//   18   33:aastore         
	//   19   34:dup             
	//   20   35:iconst_1        
	//   21   36:aload_1         
	//   22   37:invokestatic    #245 <Method String ClassUtil.classNameOf(Object)>
	//   23   40:aastore         
	//   24   41:invokestatic    #251 <Method String String.format(String, Object[])>
	//   25   44:invokespecial   #252 <Method void IllegalStateException(String)>
	//   26   47:athrow          
		} else
		{
			_nullSerializer = jsonserializer;
	//   27   48:aload_0         
	//   28   49:aload_1         
	//   29   50:putfield        #97  <Field JsonSerializer _nullSerializer>
			return;
	//   30   53:return          
		}
	}

	public void assignSerializer(JsonSerializer jsonserializer)
	{
		JsonSerializer jsonserializer1 = _serializer;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field JsonSerializer _serializer>
	//    2    4:astore_2        
		if(jsonserializer1 != null && jsonserializer1 != jsonserializer)
	//*   3    5:aload_2         
	//*   4    6:ifnull          49
	//*   5    9:aload_2         
	//*   6   10:aload_1         
	//*   7   11:if_acmpne       17
	//*   8   14:goto            49
		{
			throw new IllegalStateException(String.format("Cannot override _serializer: had a %s, trying to set to %s", new Object[] {
				ClassUtil.classNameOf(((Object) (jsonserializer1))), ClassUtil.classNameOf(((Object) (jsonserializer)))
			}));
	//    9   17:new             #235 <Class IllegalStateException>
	//   10   20:dup             
	//   11   21:ldc2            #256 <String "Cannot override _serializer: had a %s, trying to set to %s">
	//   12   24:iconst_2        
	//   13   25:anewarray       Object[]
	//   14   28:dup             
	//   15   29:iconst_0        
	//   16   30:aload_2         
	//   17   31:invokestatic    #245 <Method String ClassUtil.classNameOf(Object)>
	//   18   34:aastore         
	//   19   35:dup             
	//   20   36:iconst_1        
	//   21   37:aload_1         
	//   22   38:invokestatic    #245 <Method String ClassUtil.classNameOf(Object)>
	//   23   41:aastore         
	//   24   42:invokestatic    #251 <Method String String.format(String, Object[])>
	//   25   45:invokespecial   #252 <Method void IllegalStateException(String)>
	//   26   48:athrow          
		} else
		{
			_serializer = jsonserializer;
	//   27   49:aload_0         
	//   28   50:aload_1         
	//   29   51:putfield        #81  <Field JsonSerializer _serializer>
			return;
	//   30   54:return          
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
		if(jsonobjectformatvisitor != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          26
		{
			if(isRequired())
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #263 <Method boolean isRequired()>
	//*   4    8:ifeq            19
			{
				jsonobjectformatvisitor.property(((com.fasterxml.jackson.databind.BeanProperty) (this)));
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:invokeinterface #269 <Method void JsonObjectFormatVisitor.property(com.fasterxml.jackson.databind.BeanProperty)>
				return;
	//    8   18:return          
			}
			jsonobjectformatvisitor.optionalProperty(((com.fasterxml.jackson.databind.BeanProperty) (this)));
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:invokeinterface #272 <Method void JsonObjectFormatVisitor.optionalProperty(com.fasterxml.jackson.databind.BeanProperty)>
		}
	//   12   26:return          
	}

	public void depositSchemaProperty(ObjectNode objectnode, SerializerProvider serializerprovider)
		throws JsonMappingException
	{
		Object obj = ((Object) (getSerializationType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #277 <Method JavaType getSerializationType()>
	//    2    4:astore          4
		if(obj == null)
	//*   3    6:aload           4
	//*   4    8:ifnonnull       20
			obj = ((Object) (getType()));
	//    5   11:aload_0         
	//    6   12:invokevirtual   #220 <Method JavaType getType()>
	//    7   15:astore          4
		else
	//*   8   17:goto            27
			obj = ((Object) (((JavaType) (obj)).getRawClass()));
	//    9   20:aload           4
	//   10   22:invokevirtual   #283 <Method Class JavaType.getRawClass()>
	//   11   25:astore          4
		Type type = (Type)obj;
	//   12   27:aload           4
	//   13   29:checkcast       #285 <Class Type>
	//   14   32:astore          6
		JsonSerializer jsonserializer = getSerializer();
	//   15   34:aload_0         
	//   16   35:invokevirtual   #289 <Method JsonSerializer getSerializer()>
	//   17   38:astore          5
		obj = ((Object) (jsonserializer));
	//   18   40:aload           5
	//   19   42:astore          4
		if(jsonserializer == null)
	//*  20   44:aload           5
	//*  21   46:ifnonnull       60
			obj = ((Object) (serializerprovider.findValueSerializer(getType(), ((com.fasterxml.jackson.databind.BeanProperty) (this)))));
	//   22   49:aload_2         
	//   23   50:aload_0         
	//   24   51:invokevirtual   #220 <Method JavaType getType()>
	//   25   54:aload_0         
	//   26   55:invokevirtual   #293 <Method JsonSerializer SerializerProvider.findValueSerializer(JavaType, com.fasterxml.jackson.databind.BeanProperty)>
	//   27   58:astore          4
		boolean flag = isRequired();
	//   28   60:aload_0         
	//   29   61:invokevirtual   #263 <Method boolean isRequired()>
	//   30   64:istore_3        
		if(obj instanceof SchemaAware)
	//*  31   65:aload           4
	//*  32   67:instanceof      #295 <Class SchemaAware>
	//*  33   70:ifeq            93
			serializerprovider = ((SerializerProvider) (((SchemaAware)obj).getSchema(serializerprovider, type, flag ^ true)));
	//   34   73:aload           4
	//   35   75:checkcast       #295 <Class SchemaAware>
	//   36   78:aload_2         
	//   37   79:aload           6
	//   38   81:iload_3         
	//   39   82:iconst_1        
	//   40   83:ixor            
	//   41   84:invokeinterface #299 <Method JsonNode SchemaAware.getSchema(SerializerProvider, Type, boolean)>
	//   42   89:astore_2        
		else
	//*  43   90:goto            97
			serializerprovider = ((SerializerProvider) (JsonSchema.getDefaultSchemaNode()));
	//   44   93:invokestatic    #305 <Method JsonNode JsonSchema.getDefaultSchemaNode()>
	//   45   96:astore_2        
		_depositSchemaProperty(objectnode, ((JsonNode) (serializerprovider)));
	//   46   97:aload_0         
	//   47   98:aload_1         
	//   48   99:aload_2         
	//   49  100:invokevirtual   #307 <Method void _depositSchemaProperty(ObjectNode, JsonNode)>
	//   50  103:return          
	}

	public void fixAccess(SerializationConfig serializationconfig)
	{
		_member.fixAccess(serializationconfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field AnnotatedMember _member>
	//    2    4:aload_1         
	//    3    5:getstatic       #316 <Field MapperFeature MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS>
	//    4    8:invokevirtual   #321 <Method boolean SerializationConfig.isEnabled(MapperFeature)>
	//    5   11:invokevirtual   #324 <Method void AnnotatedMember.fixAccess(boolean)>
	//    6   14:return          
	}

	public final Object get(Object obj)
		throws Exception
	{
		Method method = _accessorMethod;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field Method _accessorMethod>
	//    2    4:astore_2        
		if(method == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       18
			return _field.get(obj);
	//    5    9:aload_0         
	//    6   10:getfield        #91  <Field Field _field>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #330 <Method Object Field.get(Object)>
	//    9   17:areturn         
		else
			return method.invoke(obj, (Object[])null);
	//   10   18:aload_2         
	//   11   19:aload_1         
	//   12   20:aconst_null     
	//   13   21:checkcast       #332 <Class Object[]>
	//   14   24:invokevirtual   #336 <Method Object Method.invoke(Object, Object[])>
	//   15   27:areturn         
	}

	public Annotation getAnnotation(Class class1)
	{
		AnnotatedMember annotatedmember = _member;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field AnnotatedMember _member>
	//    2    4:astore_2        
		if(annotatedmember == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return annotatedmember.getAnnotation(class1);
	//    7   11:aload_2         
	//    8   12:aload_1         
	//    9   13:invokevirtual   #340 <Method Annotation AnnotatedMember.getAnnotation(Class)>
	//   10   16:areturn         
	}

	public Annotation getContextAnnotation(Class class1)
	{
		Annotations annotations = _contextAnnotations;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field Annotations _contextAnnotations>
	//    2    4:astore_2        
		if(annotations == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return annotations.get(class1);
	//    7   11:aload_2         
	//    8   12:aload_1         
	//    9   13:invokeinterface #346 <Method Annotation Annotations.get(Class)>
	//   10   18:areturn         
	}

	public PropertyName getFullName()
	{
		return new PropertyName(_name.getValue());
	//    0    0:new             #157 <Class PropertyName>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #73  <Field SerializedString _name>
	//    4    8:invokevirtual   #350 <Method String SerializedString.getValue()>
	//    5   11:invokespecial   #351 <Method void PropertyName(String)>
	//    6   14:areturn         
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
	//    2    4:invokevirtual   #350 <Method String SerializedString.getValue()>
	//    3    7:areturn         
	}

	public JavaType getSerializationType()
	{
		return _cfgSerializationType;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field JavaType _cfgSerializationType>
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

	Object readResolve()
	{
		AnnotatedMember annotatedmember = _member;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field AnnotatedMember _member>
	//    2    4:astore_1        
		if(annotatedmember instanceof AnnotatedField)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #124 <Class AnnotatedField>
	//*   5    9:ifeq            31
		{
			_accessorMethod = null;
	//    6   12:aload_0         
	//    7   13:aconst_null     
	//    8   14:putfield        #89  <Field Method _accessorMethod>
			_field = (Field)annotatedmember.getMember();
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #130 <Method java.lang.reflect.Member AnnotatedMember.getMember()>
	//   12   22:checkcast       #132 <Class Field>
	//   13   25:putfield        #91  <Field Field _field>
		} else
	//*  14   28:goto            54
		if(annotatedmember instanceof AnnotatedMethod)
	//*  15   31:aload_1         
	//*  16   32:instanceof      #134 <Class AnnotatedMethod>
	//*  17   35:ifeq            54
		{
			_accessorMethod = (Method)annotatedmember.getMember();
	//   18   38:aload_0         
	//   19   39:aload_1         
	//   20   40:invokevirtual   #130 <Method java.lang.reflect.Member AnnotatedMember.getMember()>
	//   21   43:checkcast       #136 <Class Method>
	//   22   46:putfield        #89  <Field Method _accessorMethod>
			_field = null;
	//   23   49:aload_0         
	//   24   50:aconst_null     
	//   25   51:putfield        #91  <Field Field _field>
		}
		if(_serializer == null)
	//*  26   54:aload_0         
	//*  27   55:getfield        #81  <Field JsonSerializer _serializer>
	//*  28   58:ifnonnull       68
			_dynamicSerializers = PropertySerializerMap.emptyForProperties();
	//   29   61:aload_0         
	//   30   62:invokestatic    #122 <Method PropertySerializerMap PropertySerializerMap.emptyForProperties()>
	//   31   65:putfield        #83  <Field PropertySerializerMap _dynamicSerializers>
		return ((Object) (this));
	//   32   68:aload_0         
	//   33   69:areturn         
	}

	public BeanPropertyWriter rename(NameTransformer nametransformer)
	{
		nametransformer = ((NameTransformer) (nametransformer.transform(_name.getValue())));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #73  <Field SerializedString _name>
	//    3    5:invokevirtual   #350 <Method String SerializedString.getValue()>
	//    4    8:invokevirtual   #370 <Method String NameTransformer.transform(String)>
	//    5   11:astore_1        
		if(((String) (nametransformer)).equals(((Object) (_name.toString()))))
	//*   6   12:aload_1         
	//*   7   13:aload_0         
	//*   8   14:getfield        #73  <Field SerializedString _name>
	//*   9   17:invokevirtual   #373 <Method String SerializedString.toString()>
	//*  10   20:invokevirtual   #377 <Method boolean String.equals(Object)>
	//*  11   23:ifeq            28
			return this;
	//   12   26:aload_0         
	//   13   27:areturn         
		else
			return _new(PropertyName.construct(((String) (nametransformer))));
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokestatic    #381 <Method PropertyName PropertyName.construct(String)>
	//   17   33:invokevirtual   #383 <Method BeanPropertyWriter _new(PropertyName)>
	//   18   36:areturn         
	}

	public void serializeAsElement(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws Exception
	{
		Object obj1 = ((Object) (_accessorMethod));
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field Method _accessorMethod>
	//    2    4:astore          4
		Object obj2;
		if(obj1 == null)
	//*   3    6:aload           4
	//*   4    8:ifnonnull       24
			obj2 = _field.get(obj);
	//    5   11:aload_0         
	//    6   12:getfield        #91  <Field Field _field>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #330 <Method Object Field.get(Object)>
	//    9   19:astore          5
		else
	//*  10   21:goto            36
			obj2 = ((Method) (obj1)).invoke(obj, (Object[])null);
	//   11   24:aload           4
	//   12   26:aload_1         
	//   13   27:aconst_null     
	//   14   28:checkcast       #332 <Class Object[]>
	//   15   31:invokevirtual   #336 <Method Object Method.invoke(Object, Object[])>
	//   16   34:astore          5
		if(obj2 == null)
	//*  17   36:aload           5
	//*  18   38:ifnonnull       63
		{
			obj = ((Object) (_nullSerializer));
	//   19   41:aload_0         
	//   20   42:getfield        #97  <Field JsonSerializer _nullSerializer>
	//   21   45:astore_1        
			if(obj != null)
	//*  22   46:aload_1         
	//*  23   47:ifnull          58
			{
				((JsonSerializer) (obj)).serialize(((Object) (null)), jsongenerator, serializerprovider);
	//   24   50:aload_1         
	//   25   51:aconst_null     
	//   26   52:aload_2         
	//   27   53:aload_3         
	//   28   54:invokevirtual   #388 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
				return;
	//   29   57:return          
			} else
			{
				jsongenerator.writeNull();
	//   30   58:aload_2         
	//   31   59:invokevirtual   #393 <Method void JsonGenerator.writeNull()>
				return;
	//   32   62:return          
			}
		}
		Object obj3 = ((Object) (_serializer));
	//   33   63:aload_0         
	//   34   64:getfield        #81  <Field JsonSerializer _serializer>
	//   35   67:astore          6
		obj1 = obj3;
	//   36   69:aload           6
	//   37   71:astore          4
		if(obj3 == null)
	//*  38   73:aload           6
	//*  39   75:ifnonnull       119
		{
			obj3 = ((Object) (obj2.getClass()));
	//   40   78:aload           5
	//   41   80:invokevirtual   #396 <Method Class Object.getClass()>
	//   42   83:astore          6
			PropertySerializerMap propertyserializermap = _dynamicSerializers;
	//   43   85:aload_0         
	//   44   86:getfield        #83  <Field PropertySerializerMap _dynamicSerializers>
	//   45   89:astore          7
			obj1 = ((Object) (propertyserializermap.serializerFor(((Class) (obj3)))));
	//   46   91:aload           7
	//   47   93:aload           6
	//   48   95:invokevirtual   #400 <Method JsonSerializer PropertySerializerMap.serializerFor(Class)>
	//   49   98:astore          4
			if(obj1 == null)
	//*  50  100:aload           4
	//*  51  102:ifnonnull       119
				obj1 = ((Object) (_findAndAddDynamic(propertyserializermap, ((Class) (obj3)), serializerprovider)));
	//   52  105:aload_0         
	//   53  106:aload           7
	//   54  108:aload           6
	//   55  110:aload_3         
	//   56  111:invokevirtual   #402 <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, Class, SerializerProvider)>
	//   57  114:astore          4
		}
	//*  58  116:goto            119
		obj3 = _suppressableValue;
	//   59  119:aload_0         
	//   60  120:getfield        #95  <Field Object _suppressableValue>
	//   61  123:astore          6
		if(obj3 != null)
	//*  62  125:aload           6
	//*  63  127:ifnull          175
			if(MARKER_FOR_EMPTY == obj3)
	//*  64  130:getstatic       #56  <Field Object MARKER_FOR_EMPTY>
	//*  65  133:aload           6
	//*  66  135:if_acmpne       157
			{
				if(((JsonSerializer) (obj1)).isEmpty(serializerprovider, obj2))
	//*  67  138:aload           4
	//*  68  140:aload_3         
	//*  69  141:aload           5
	//*  70  143:invokevirtual   #406 <Method boolean JsonSerializer.isEmpty(SerializerProvider, Object)>
	//*  71  146:ifeq            175
				{
					serializeAsPlaceholder(obj, jsongenerator, serializerprovider);
	//   72  149:aload_0         
	//   73  150:aload_1         
	//   74  151:aload_2         
	//   75  152:aload_3         
	//   76  153:invokevirtual   #409 <Method void serializeAsPlaceholder(Object, JsonGenerator, SerializerProvider)>
					return;
	//   77  156:return          
				}
			} else
			if(obj3.equals(obj2))
	//*  78  157:aload           6
	//*  79  159:aload           5
	//*  80  161:invokevirtual   #410 <Method boolean Object.equals(Object)>
	//*  81  164:ifeq            175
			{
				serializeAsPlaceholder(obj, jsongenerator, serializerprovider);
	//   82  167:aload_0         
	//   83  168:aload_1         
	//   84  169:aload_2         
	//   85  170:aload_3         
	//   86  171:invokevirtual   #409 <Method void serializeAsPlaceholder(Object, JsonGenerator, SerializerProvider)>
				return;
	//   87  174:return          
			}
		if(obj2 == obj && _handleSelfReference(obj, jsongenerator, serializerprovider, ((JsonSerializer) (obj1))))
	//*  88  175:aload           5
	//*  89  177:aload_1         
	//*  90  178:if_acmpne       194
	//*  91  181:aload_0         
	//*  92  182:aload_1         
	//*  93  183:aload_2         
	//*  94  184:aload_3         
	//*  95  185:aload           4
	//*  96  187:invokevirtual   #412 <Method boolean _handleSelfReference(Object, JsonGenerator, SerializerProvider, JsonSerializer)>
	//*  97  190:ifeq            194
			return;
	//   98  193:return          
		obj = ((Object) (_typeSerializer));
	//   99  194:aload_0         
	//  100  195:getfield        #85  <Field TypeSerializer _typeSerializer>
	//  101  198:astore_1        
		if(obj == null)
	//* 102  199:aload_1         
	//* 103  200:ifnonnull       213
		{
			((JsonSerializer) (obj1)).serialize(obj2, jsongenerator, serializerprovider);
	//  104  203:aload           4
	//  105  205:aload           5
	//  106  207:aload_2         
	//  107  208:aload_3         
	//  108  209:invokevirtual   #388 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
			return;
	//  109  212:return          
		} else
		{
			((JsonSerializer) (obj1)).serializeWithType(obj2, jsongenerator, serializerprovider, ((TypeSerializer) (obj)));
	//  110  213:aload           4
	//  111  215:aload           5
	//  112  217:aload_2         
	//  113  218:aload_3         
	//  114  219:aload_1         
	//  115  220:invokevirtual   #416 <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
			return;
	//  116  223:return          
		}
	}

	public void serializeAsField(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws Exception
	{
		Object obj1 = ((Object) (_accessorMethod));
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field Method _accessorMethod>
	//    2    4:astore          4
		Object obj2;
		if(obj1 == null)
	//*   3    6:aload           4
	//*   4    8:ifnonnull       24
			obj2 = _field.get(obj);
	//    5   11:aload_0         
	//    6   12:getfield        #91  <Field Field _field>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #330 <Method Object Field.get(Object)>
	//    9   19:astore          5
		else
	//*  10   21:goto            36
			obj2 = ((Method) (obj1)).invoke(obj, (Object[])null);
	//   11   24:aload           4
	//   12   26:aload_1         
	//   13   27:aconst_null     
	//   14   28:checkcast       #332 <Class Object[]>
	//   15   31:invokevirtual   #336 <Method Object Method.invoke(Object, Object[])>
	//   16   34:astore          5
		if(obj2 == null)
	//*  17   36:aload           5
	//*  18   38:ifnonnull       67
		{
			if(_nullSerializer != null)
	//*  19   41:aload_0         
	//*  20   42:getfield        #97  <Field JsonSerializer _nullSerializer>
	//*  21   45:ifnull          66
			{
				jsongenerator.writeFieldName(((com.fasterxml.jackson.core.SerializableString) (_name)));
	//   22   48:aload_2         
	//   23   49:aload_0         
	//   24   50:getfield        #73  <Field SerializedString _name>
	//   25   53:invokevirtual   #421 <Method void JsonGenerator.writeFieldName(com.fasterxml.jackson.core.SerializableString)>
				_nullSerializer.serialize(((Object) (null)), jsongenerator, serializerprovider);
	//   26   56:aload_0         
	//   27   57:getfield        #97  <Field JsonSerializer _nullSerializer>
	//   28   60:aconst_null     
	//   29   61:aload_2         
	//   30   62:aload_3         
	//   31   63:invokevirtual   #388 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
			}
			return;
	//   32   66:return          
		}
		Object obj3 = ((Object) (_serializer));
	//   33   67:aload_0         
	//   34   68:getfield        #81  <Field JsonSerializer _serializer>
	//   35   71:astore          6
		obj1 = obj3;
	//   36   73:aload           6
	//   37   75:astore          4
		if(obj3 == null)
	//*  38   77:aload           6
	//*  39   79:ifnonnull       123
		{
			obj3 = ((Object) (obj2.getClass()));
	//   40   82:aload           5
	//   41   84:invokevirtual   #396 <Method Class Object.getClass()>
	//   42   87:astore          6
			PropertySerializerMap propertyserializermap = _dynamicSerializers;
	//   43   89:aload_0         
	//   44   90:getfield        #83  <Field PropertySerializerMap _dynamicSerializers>
	//   45   93:astore          7
			obj1 = ((Object) (propertyserializermap.serializerFor(((Class) (obj3)))));
	//   46   95:aload           7
	//   47   97:aload           6
	//   48   99:invokevirtual   #400 <Method JsonSerializer PropertySerializerMap.serializerFor(Class)>
	//   49  102:astore          4
			if(obj1 == null)
	//*  50  104:aload           4
	//*  51  106:ifnonnull       123
				obj1 = ((Object) (_findAndAddDynamic(propertyserializermap, ((Class) (obj3)), serializerprovider)));
	//   52  109:aload_0         
	//   53  110:aload           7
	//   54  112:aload           6
	//   55  114:aload_3         
	//   56  115:invokevirtual   #402 <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, Class, SerializerProvider)>
	//   57  118:astore          4
		}
	//*  58  120:goto            123
		obj3 = _suppressableValue;
	//   59  123:aload_0         
	//   60  124:getfield        #95  <Field Object _suppressableValue>
	//   61  127:astore          6
		if(obj3 != null)
	//*  62  129:aload           6
	//*  63  131:ifnull          165
			if(MARKER_FOR_EMPTY == obj3)
	//*  64  134:getstatic       #56  <Field Object MARKER_FOR_EMPTY>
	//*  65  137:aload           6
	//*  66  139:if_acmpne       154
			{
				if(((JsonSerializer) (obj1)).isEmpty(serializerprovider, obj2))
	//*  67  142:aload           4
	//*  68  144:aload_3         
	//*  69  145:aload           5
	//*  70  147:invokevirtual   #406 <Method boolean JsonSerializer.isEmpty(SerializerProvider, Object)>
	//*  71  150:ifeq            165
					return;
	//   72  153:return          
			} else
			if(obj3.equals(obj2))
	//*  73  154:aload           6
	//*  74  156:aload           5
	//*  75  158:invokevirtual   #410 <Method boolean Object.equals(Object)>
	//*  76  161:ifeq            165
				return;
	//   77  164:return          
		if(obj2 == obj && _handleSelfReference(obj, jsongenerator, serializerprovider, ((JsonSerializer) (obj1))))
	//*  78  165:aload           5
	//*  79  167:aload_1         
	//*  80  168:if_acmpne       184
	//*  81  171:aload_0         
	//*  82  172:aload_1         
	//*  83  173:aload_2         
	//*  84  174:aload_3         
	//*  85  175:aload           4
	//*  86  177:invokevirtual   #412 <Method boolean _handleSelfReference(Object, JsonGenerator, SerializerProvider, JsonSerializer)>
	//*  87  180:ifeq            184
			return;
	//   88  183:return          
		jsongenerator.writeFieldName(((com.fasterxml.jackson.core.SerializableString) (_name)));
	//   89  184:aload_2         
	//   90  185:aload_0         
	//   91  186:getfield        #73  <Field SerializedString _name>
	//   92  189:invokevirtual   #421 <Method void JsonGenerator.writeFieldName(com.fasterxml.jackson.core.SerializableString)>
		obj = ((Object) (_typeSerializer));
	//   93  192:aload_0         
	//   94  193:getfield        #85  <Field TypeSerializer _typeSerializer>
	//   95  196:astore_1        
		if(obj == null)
	//*  96  197:aload_1         
	//*  97  198:ifnonnull       211
		{
			((JsonSerializer) (obj1)).serialize(obj2, jsongenerator, serializerprovider);
	//   98  201:aload           4
	//   99  203:aload           5
	//  100  205:aload_2         
	//  101  206:aload_3         
	//  102  207:invokevirtual   #388 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
			return;
	//  103  210:return          
		} else
		{
			((JsonSerializer) (obj1)).serializeWithType(obj2, jsongenerator, serializerprovider, ((TypeSerializer) (obj)));
	//  104  211:aload           4
	//  105  213:aload           5
	//  106  215:aload_2         
	//  107  216:aload_3         
	//  108  217:aload_1         
	//  109  218:invokevirtual   #416 <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
			return;
	//  110  221:return          
		}
	}

	public void serializeAsOmittedField(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws Exception
	{
		if(!jsongenerator.canOmitFields())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #425 <Method boolean JsonGenerator.canOmitFields()>
	//*   2    4:ifne            18
			jsongenerator.writeOmittedField(_name.getValue());
	//    3    7:aload_2         
	//    4    8:aload_0         
	//    5    9:getfield        #73  <Field SerializedString _name>
	//    6   12:invokevirtual   #350 <Method String SerializedString.getValue()>
	//    7   15:invokevirtual   #428 <Method void JsonGenerator.writeOmittedField(String)>
	//    8   18:return          
	}

	public void serializeAsPlaceholder(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws Exception
	{
		obj = ((Object) (_nullSerializer));
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field JsonSerializer _nullSerializer>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          17
		{
			((JsonSerializer) (obj)).serialize(((Object) (null)), jsongenerator, serializerprovider);
	//    5    9:aload_1         
	//    6   10:aconst_null     
	//    7   11:aload_2         
	//    8   12:aload_3         
	//    9   13:invokevirtual   #388 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
			return;
	//   10   16:return          
		} else
		{
			jsongenerator.writeNull();
	//   11   17:aload_2         
	//   12   18:invokevirtual   #393 <Method void JsonGenerator.writeNull()>
			return;
	//   13   21:return          
		}
	}

	public void setNonTrivialBaseType(JavaType javatype)
	{
		_nonTrivialBaseType = javatype;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #154 <Field JavaType _nonTrivialBaseType>
	//    3    5:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder(40);
	//    0    0:new             #432 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:bipush          40
	//    3    6:invokespecial   #435 <Method void StringBuilder(int)>
	//    4    9:astore_1        
		stringbuilder.append("property '");
	//    5   10:aload_1         
	//    6   11:ldc2            #437 <String "property '">
	//    7   14:invokevirtual   #441 <Method StringBuilder StringBuilder.append(String)>
	//    8   17:pop             
		stringbuilder.append(getName());
	//    9   18:aload_1         
	//   10   19:aload_0         
	//   11   20:invokevirtual   #163 <Method String getName()>
	//   12   23:invokevirtual   #441 <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append("' (");
	//   14   27:aload_1         
	//   15   28:ldc2            #443 <String "' (">
	//   16   31:invokevirtual   #441 <Method StringBuilder StringBuilder.append(String)>
	//   17   34:pop             
		if(_accessorMethod != null)
	//*  18   35:aload_0         
	//*  19   36:getfield        #89  <Field Method _accessorMethod>
	//*  20   39:ifnull          88
		{
			stringbuilder.append("via method ");
	//   21   42:aload_1         
	//   22   43:ldc2            #445 <String "via method ">
	//   23   46:invokevirtual   #441 <Method StringBuilder StringBuilder.append(String)>
	//   24   49:pop             
			stringbuilder.append(_accessorMethod.getDeclaringClass().getName());
	//   25   50:aload_1         
	//   26   51:aload_0         
	//   27   52:getfield        #89  <Field Method _accessorMethod>
	//   28   55:invokevirtual   #448 <Method Class Method.getDeclaringClass()>
	//   29   58:invokevirtual   #451 <Method String Class.getName()>
	//   30   61:invokevirtual   #441 <Method StringBuilder StringBuilder.append(String)>
	//   31   64:pop             
			stringbuilder.append("#");
	//   32   65:aload_1         
	//   33   66:ldc2            #453 <String "#">
	//   34   69:invokevirtual   #441 <Method StringBuilder StringBuilder.append(String)>
	//   35   72:pop             
			stringbuilder.append(_accessorMethod.getName());
	//   36   73:aload_1         
	//   37   74:aload_0         
	//   38   75:getfield        #89  <Field Method _accessorMethod>
	//   39   78:invokevirtual   #454 <Method String Method.getName()>
	//   40   81:invokevirtual   #441 <Method StringBuilder StringBuilder.append(String)>
	//   41   84:pop             
		} else
	//*  42   85:goto            149
		if(_field != null)
	//*  43   88:aload_0         
	//*  44   89:getfield        #91  <Field Field _field>
	//*  45   92:ifnull          141
		{
			stringbuilder.append("field \"");
	//   46   95:aload_1         
	//   47   96:ldc2            #456 <String "field \"">
	//   48   99:invokevirtual   #441 <Method StringBuilder StringBuilder.append(String)>
	//   49  102:pop             
			stringbuilder.append(_field.getDeclaringClass().getName());
	//   50  103:aload_1         
	//   51  104:aload_0         
	//   52  105:getfield        #91  <Field Field _field>
	//   53  108:invokevirtual   #457 <Method Class Field.getDeclaringClass()>
	//   54  111:invokevirtual   #451 <Method String Class.getName()>
	//   55  114:invokevirtual   #441 <Method StringBuilder StringBuilder.append(String)>
	//   56  117:pop             
			stringbuilder.append("#");
	//   57  118:aload_1         
	//   58  119:ldc2            #453 <String "#">
	//   59  122:invokevirtual   #441 <Method StringBuilder StringBuilder.append(String)>
	//   60  125:pop             
			stringbuilder.append(_field.getName());
	//   61  126:aload_1         
	//   62  127:aload_0         
	//   63  128:getfield        #91  <Field Field _field>
	//   64  131:invokevirtual   #458 <Method String Field.getName()>
	//   65  134:invokevirtual   #441 <Method StringBuilder StringBuilder.append(String)>
	//   66  137:pop             
		} else
	//*  67  138:goto            149
		{
			stringbuilder.append("virtual");
	//   68  141:aload_1         
	//   69  142:ldc2            #460 <String "virtual">
	//   70  145:invokevirtual   #441 <Method StringBuilder StringBuilder.append(String)>
	//   71  148:pop             
		}
		if(_serializer == null)
	//*  72  149:aload_0         
	//*  73  150:getfield        #81  <Field JsonSerializer _serializer>
	//*  74  153:ifnonnull       167
		{
			stringbuilder.append(", no static serializer");
	//   75  156:aload_1         
	//   76  157:ldc2            #462 <String ", no static serializer">
	//   77  160:invokevirtual   #441 <Method StringBuilder StringBuilder.append(String)>
	//   78  163:pop             
		} else
	//*  79  164:goto            207
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   80  167:new             #432 <Class StringBuilder>
	//   81  170:dup             
	//   82  171:invokespecial   #464 <Method void StringBuilder()>
	//   83  174:astore_2        
			stringbuilder1.append(", static serializer of type ");
	//   84  175:aload_2         
	//   85  176:ldc2            #466 <String ", static serializer of type ">
	//   86  179:invokevirtual   #441 <Method StringBuilder StringBuilder.append(String)>
	//   87  182:pop             
			stringbuilder1.append(((Object) (_serializer)).getClass().getName());
	//   88  183:aload_2         
	//   89  184:aload_0         
	//   90  185:getfield        #81  <Field JsonSerializer _serializer>
	//   91  188:invokevirtual   #396 <Method Class Object.getClass()>
	//   92  191:invokevirtual   #451 <Method String Class.getName()>
	//   93  194:invokevirtual   #441 <Method StringBuilder StringBuilder.append(String)>
	//   94  197:pop             
			stringbuilder.append(stringbuilder1.toString());
	//   95  198:aload_1         
	//   96  199:aload_2         
	//   97  200:invokevirtual   #467 <Method String StringBuilder.toString()>
	//   98  203:invokevirtual   #441 <Method StringBuilder StringBuilder.append(String)>
	//   99  206:pop             
		}
		stringbuilder.append(')');
	//  100  207:aload_1         
	//  101  208:bipush          41
	//  102  210:invokevirtual   #470 <Method StringBuilder StringBuilder.append(char)>
	//  103  213:pop             
		return stringbuilder.toString();
	//  104  214:aload_1         
	//  105  215:invokevirtual   #467 <Method String StringBuilder.toString()>
	//  106  218:areturn         
	}

	public BeanPropertyWriter unwrappingWriter(NameTransformer nametransformer)
	{
		return ((BeanPropertyWriter) (new UnwrappingBeanPropertyWriter(this, nametransformer)));
	//    0    0:new             #473 <Class UnwrappingBeanPropertyWriter>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #476 <Method void UnwrappingBeanPropertyWriter(BeanPropertyWriter, NameTransformer)>
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
		PropertyName propertyname1 = _wrapperName;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field PropertyName _wrapperName>
	//    2    4:astore_2        
		if(propertyname1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
			return propertyname1.equals(((Object) (propertyname)));
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #480 <Method boolean PropertyName.equals(Object)>
	//    8   14:ireturn         
		return propertyname.hasSimpleName(_name.getValue()) && !propertyname.hasNamespace();
	//    9   15:aload_1         
	//   10   16:aload_0         
	//   11   17:getfield        #73  <Field SerializedString _name>
	//   12   20:invokevirtual   #350 <Method String SerializedString.getValue()>
	//   13   23:invokevirtual   #484 <Method boolean PropertyName.hasSimpleName(String)>
	//   14   26:ifeq            38
	//   15   29:aload_1         
	//   16   30:invokevirtual   #487 <Method boolean PropertyName.hasNamespace()>
	//   17   33:ifne            38
	//   18   36:iconst_1        
	//   19   37:ireturn         
	//   20   38:iconst_0        
	//   21   39:ireturn         
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
