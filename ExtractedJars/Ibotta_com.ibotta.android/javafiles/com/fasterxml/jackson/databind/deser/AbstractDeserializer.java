// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;

// Referenced classes of package com.fasterxml.jackson.databind.deser:
//			ContextualDeserializer, BeanDeserializerBuilder, UnresolvedForwardReference, SettableBeanProperty

public class AbstractDeserializer extends JsonDeserializer
	implements ContextualDeserializer, Serializable
{

	protected AbstractDeserializer(BeanDescription beandescription)
	{
		boolean flag;
label0:
		{
			super();
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void JsonDeserializer()>
			_baseType = beandescription.getType();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #37  <Method JavaType BeanDescription.getType()>
	//    5    9:putfield        #39  <Field JavaType _baseType>
			_objectIdReader = null;
	//    6   12:aload_0         
	//    7   13:aconst_null     
	//    8   14:putfield        #41  <Field ObjectIdReader _objectIdReader>
			_backRefProperties = null;
	//    9   17:aload_0         
	//   10   18:aconst_null     
	//   11   19:putfield        #43  <Field Map _backRefProperties>
			beandescription = ((BeanDescription) (_baseType.getRawClass()));
	//   12   22:aload_0         
	//   13   23:getfield        #39  <Field JavaType _baseType>
	//   14   26:invokevirtual   #49  <Method Class JavaType.getRawClass()>
	//   15   29:astore_1        
			_acceptString = ((Class) (beandescription)).isAssignableFrom(java/lang/String);
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:ldc1            #51  <Class String>
	//   19   34:invokevirtual   #57  <Method boolean Class.isAssignableFrom(Class)>
	//   20   37:putfield        #59  <Field boolean _acceptString>
			Class class1 = Boolean.TYPE;
	//   21   40:getstatic       #65  <Field Class Boolean.TYPE>
	//   22   43:astore          4
			boolean flag1 = false;
	//   23   45:iconst_0        
	//   24   46:istore_3        
			if(beandescription != class1 && !((Class) (beandescription)).isAssignableFrom(java/lang/Boolean))
	//*  25   47:aload_1         
	//*  26   48:aload           4
	//*  27   50:if_acmpeq       70
	//*  28   53:aload_1         
	//*  29   54:ldc1            #61  <Class Boolean>
	//*  30   56:invokevirtual   #57  <Method boolean Class.isAssignableFrom(Class)>
	//*  31   59:ifeq            65
	//*  32   62:goto            70
				flag = false;
	//   33   65:iconst_0        
	//   34   66:istore_2        
			else
	//*  35   67:goto            72
				flag = true;
	//   36   70:iconst_1        
	//   37   71:istore_2        
			_acceptBoolean = flag;
	//   38   72:aload_0         
	//   39   73:iload_2         
	//   40   74:putfield        #67  <Field boolean _acceptBoolean>
			if(beandescription != Integer.TYPE && !((Class) (beandescription)).isAssignableFrom(java/lang/Integer))
	//*  41   77:aload_1         
	//*  42   78:getstatic       #70  <Field Class Integer.TYPE>
	//*  43   81:if_acmpeq       101
	//*  44   84:aload_1         
	//*  45   85:ldc1            #69  <Class Integer>
	//*  46   87:invokevirtual   #57  <Method boolean Class.isAssignableFrom(Class)>
	//*  47   90:ifeq            96
	//*  48   93:goto            101
				flag = false;
	//   49   96:iconst_0        
	//   50   97:istore_2        
			else
	//*  51   98:goto            103
				flag = true;
	//   52  101:iconst_1        
	//   53  102:istore_2        
			_acceptInt = flag;
	//   54  103:aload_0         
	//   55  104:iload_2         
	//   56  105:putfield        #72  <Field boolean _acceptInt>
			if(beandescription != Double.TYPE)
	//*  57  108:aload_1         
	//*  58  109:getstatic       #75  <Field Class Double.TYPE>
	//*  59  112:if_acmpeq       126
			{
				flag = flag1;
	//   60  115:iload_3         
	//   61  116:istore_2        
				if(!((Class) (beandescription)).isAssignableFrom(java/lang/Double))
					break label0;
	//   62  117:aload_1         
	//   63  118:ldc1            #74  <Class Double>
	//   64  120:invokevirtual   #57  <Method boolean Class.isAssignableFrom(Class)>
	//   65  123:ifeq            128
			}
			flag = true;
	//   66  126:iconst_1        
	//   67  127:istore_2        
		}
		_acceptDouble = flag;
	//   68  128:aload_0         
	//   69  129:iload_2         
	//   70  130:putfield        #77  <Field boolean _acceptDouble>
	//   71  133:return          
	}

	protected AbstractDeserializer(AbstractDeserializer abstractdeserializer, ObjectIdReader objectidreader, Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void JsonDeserializer()>
		_baseType = abstractdeserializer._baseType;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #39  <Field JavaType _baseType>
	//    5    9:putfield        #39  <Field JavaType _baseType>
		_backRefProperties = abstractdeserializer._backRefProperties;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #43  <Field Map _backRefProperties>
	//    9   17:putfield        #43  <Field Map _backRefProperties>
		_acceptString = abstractdeserializer._acceptString;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:getfield        #59  <Field boolean _acceptString>
	//   13   25:putfield        #59  <Field boolean _acceptString>
		_acceptBoolean = abstractdeserializer._acceptBoolean;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:getfield        #67  <Field boolean _acceptBoolean>
	//   17   33:putfield        #67  <Field boolean _acceptBoolean>
		_acceptInt = abstractdeserializer._acceptInt;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:getfield        #72  <Field boolean _acceptInt>
	//   21   41:putfield        #72  <Field boolean _acceptInt>
		_acceptDouble = abstractdeserializer._acceptDouble;
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:getfield        #77  <Field boolean _acceptDouble>
	//   25   49:putfield        #77  <Field boolean _acceptDouble>
		_objectIdReader = objectidreader;
	//   26   52:aload_0         
	//   27   53:aload_2         
	//   28   54:putfield        #41  <Field ObjectIdReader _objectIdReader>
		_properties = map;
	//   29   57:aload_0         
	//   30   58:aload_3         
	//   31   59:putfield        #81  <Field Map _properties>
	//   32   62:return          
	}

	public AbstractDeserializer(BeanDeserializerBuilder beandeserializerbuilder, BeanDescription beandescription, Map map, Map map1)
	{
		boolean flag;
label0:
		{
			super();
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void JsonDeserializer()>
			_baseType = beandescription.getType();
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #37  <Method JavaType BeanDescription.getType()>
	//    5    9:putfield        #39  <Field JavaType _baseType>
			_objectIdReader = beandeserializerbuilder.getObjectIdReader();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #90  <Method ObjectIdReader BeanDeserializerBuilder.getObjectIdReader()>
	//    9   17:putfield        #41  <Field ObjectIdReader _objectIdReader>
			_backRefProperties = map;
	//   10   20:aload_0         
	//   11   21:aload_3         
	//   12   22:putfield        #43  <Field Map _backRefProperties>
			_properties = map1;
	//   13   25:aload_0         
	//   14   26:aload           4
	//   15   28:putfield        #81  <Field Map _properties>
			beandeserializerbuilder = ((BeanDeserializerBuilder) (_baseType.getRawClass()));
	//   16   31:aload_0         
	//   17   32:getfield        #39  <Field JavaType _baseType>
	//   18   35:invokevirtual   #49  <Method Class JavaType.getRawClass()>
	//   19   38:astore_1        
			_acceptString = ((Class) (beandeserializerbuilder)).isAssignableFrom(java/lang/String);
	//   20   39:aload_0         
	//   21   40:aload_1         
	//   22   41:ldc1            #51  <Class String>
	//   23   43:invokevirtual   #57  <Method boolean Class.isAssignableFrom(Class)>
	//   24   46:putfield        #59  <Field boolean _acceptString>
			beandescription = ((BeanDescription) (Boolean.TYPE));
	//   25   49:getstatic       #65  <Field Class Boolean.TYPE>
	//   26   52:astore_2        
			boolean flag1 = false;
	//   27   53:iconst_0        
	//   28   54:istore          6
			if(beandeserializerbuilder != beandescription && !((Class) (beandeserializerbuilder)).isAssignableFrom(java/lang/Boolean))
	//*  29   56:aload_1         
	//*  30   57:aload_2         
	//*  31   58:if_acmpeq       79
	//*  32   61:aload_1         
	//*  33   62:ldc1            #61  <Class Boolean>
	//*  34   64:invokevirtual   #57  <Method boolean Class.isAssignableFrom(Class)>
	//*  35   67:ifeq            73
	//*  36   70:goto            79
				flag = false;
	//   37   73:iconst_0        
	//   38   74:istore          5
			else
	//*  39   76:goto            82
				flag = true;
	//   40   79:iconst_1        
	//   41   80:istore          5
			_acceptBoolean = flag;
	//   42   82:aload_0         
	//   43   83:iload           5
	//   44   85:putfield        #67  <Field boolean _acceptBoolean>
			if(beandeserializerbuilder != Integer.TYPE && !((Class) (beandeserializerbuilder)).isAssignableFrom(java/lang/Integer))
	//*  45   88:aload_1         
	//*  46   89:getstatic       #70  <Field Class Integer.TYPE>
	//*  47   92:if_acmpeq       113
	//*  48   95:aload_1         
	//*  49   96:ldc1            #69  <Class Integer>
	//*  50   98:invokevirtual   #57  <Method boolean Class.isAssignableFrom(Class)>
	//*  51  101:ifeq            107
	//*  52  104:goto            113
				flag = false;
	//   53  107:iconst_0        
	//   54  108:istore          5
			else
	//*  55  110:goto            116
				flag = true;
	//   56  113:iconst_1        
	//   57  114:istore          5
			_acceptInt = flag;
	//   58  116:aload_0         
	//   59  117:iload           5
	//   60  119:putfield        #72  <Field boolean _acceptInt>
			if(beandeserializerbuilder != Double.TYPE)
	//*  61  122:aload_1         
	//*  62  123:getstatic       #75  <Field Class Double.TYPE>
	//*  63  126:if_acmpeq       142
			{
				flag = flag1;
	//   64  129:iload           6
	//   65  131:istore          5
				if(!((Class) (beandeserializerbuilder)).isAssignableFrom(java/lang/Double))
					break label0;
	//   66  133:aload_1         
	//   67  134:ldc1            #74  <Class Double>
	//   68  136:invokevirtual   #57  <Method boolean Class.isAssignableFrom(Class)>
	//   69  139:ifeq            145
			}
			flag = true;
	//   70  142:iconst_1        
	//   71  143:istore          5
		}
		_acceptDouble = flag;
	//   72  145:aload_0         
	//   73  146:iload           5
	//   74  148:putfield        #77  <Field boolean _acceptDouble>
	//   75  151:return          
	}

	public static AbstractDeserializer constructForNonPOJO(BeanDescription beandescription)
	{
		return new AbstractDeserializer(beandescription);
	//    0    0:new             #2   <Class AbstractDeserializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #95  <Method void AbstractDeserializer(BeanDescription)>
	//    4    8:areturn         
	}

	protected Object _deserializeFromObjectId(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		Object obj = _objectIdReader.readObjectReference(jsonparser, deserializationcontext);
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field ObjectIdReader _objectIdReader>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #104 <Method Object ObjectIdReader.readObjectReference(JsonParser, DeserializationContext)>
	//    5    9:astore_3        
		deserializationcontext = ((DeserializationContext) (deserializationcontext.findObjectId(obj, _objectIdReader.generator, _objectIdReader.resolver)));
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:aload_0         
	//    9   13:getfield        #41  <Field ObjectIdReader _objectIdReader>
	//   10   16:getfield        #108 <Field ObjectIdGenerator ObjectIdReader.generator>
	//   11   19:aload_0         
	//   12   20:getfield        #41  <Field ObjectIdReader _objectIdReader>
	//   13   23:getfield        #112 <Field com.fasterxml.jackson.annotation.ObjectIdResolver ObjectIdReader.resolver>
	//   14   26:invokevirtual   #118 <Method ReadableObjectId DeserializationContext.findObjectId(Object, ObjectIdGenerator, com.fasterxml.jackson.annotation.ObjectIdResolver)>
	//   15   29:astore_2        
		Object obj1 = ((ReadableObjectId) (deserializationcontext)).resolve();
	//   16   30:aload_2         
	//   17   31:invokevirtual   #124 <Method Object ReadableObjectId.resolve()>
	//   18   34:astore          4
		if(obj1 != null)
	//*  19   36:aload           4
	//*  20   38:ifnull          44
		{
			return obj1;
	//   21   41:aload           4
	//   22   43:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   23   44:new             #126 <Class StringBuilder>
	//   24   47:dup             
	//   25   48:invokespecial   #127 <Method void StringBuilder()>
	//   26   51:astore          4
			stringbuilder.append("Could not resolve Object Id [");
	//   27   53:aload           4
	//   28   55:ldc1            #129 <String "Could not resolve Object Id [">
	//   29   57:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   30   60:pop             
			stringbuilder.append(obj);
	//   31   61:aload           4
	//   32   63:aload_3         
	//   33   64:invokevirtual   #136 <Method StringBuilder StringBuilder.append(Object)>
	//   34   67:pop             
			stringbuilder.append("] -- unresolved forward-reference?");
	//   35   68:aload           4
	//   36   70:ldc1            #138 <String "] -- unresolved forward-reference?">
	//   37   72:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   38   75:pop             
			throw new UnresolvedForwardReference(jsonparser, stringbuilder.toString(), jsonparser.getCurrentLocation(), ((ReadableObjectId) (deserializationcontext)));
	//   39   76:new             #140 <Class UnresolvedForwardReference>
	//   40   79:dup             
	//   41   80:aload_1         
	//   42   81:aload           4
	//   43   83:invokevirtual   #144 <Method String StringBuilder.toString()>
	//   44   86:aload_1         
	//   45   87:invokevirtual   #150 <Method com.fasterxml.jackson.core.JsonLocation JsonParser.getCurrentLocation()>
	//   46   90:aload_2         
	//   47   91:invokespecial   #153 <Method void UnresolvedForwardReference(JsonParser, String, com.fasterxml.jackson.core.JsonLocation, ReadableObjectId)>
	//   48   94:athrow          
		}
	}

	protected Object _deserializeIfNatural(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		switch(jsonparser.getCurrentTokenId())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #159 <Method int JsonParser.getCurrentTokenId()>
		{
		default:
			break;

	//*   2    4:tableswitch     6 10: default 40
	//	               6 95
	//	               7 80
	//	               8 65
	//	               9 54
	//	               10 43
	//*   3   40:goto            107
		case 10: // '\n'
			if(_acceptBoolean)
	//*   4   43:aload_0         
	//*   5   44:getfield        #67  <Field boolean _acceptBoolean>
	//*   6   47:ifeq            107
				return ((Object) (Boolean.FALSE));
	//    7   50:getstatic       #163 <Field Boolean Boolean.FALSE>
	//    8   53:areturn         
			break;

		case 9: // '\t'
			if(_acceptBoolean)
	//*   9   54:aload_0         
	//*  10   55:getfield        #67  <Field boolean _acceptBoolean>
	//*  11   58:ifeq            107
				return ((Object) (Boolean.TRUE));
	//   12   61:getstatic       #166 <Field Boolean Boolean.TRUE>
	//   13   64:areturn         
			break;

		case 8: // '\b'
			if(_acceptDouble)
	//*  14   65:aload_0         
	//*  15   66:getfield        #77  <Field boolean _acceptDouble>
	//*  16   69:ifeq            107
				return ((Object) (Double.valueOf(jsonparser.getDoubleValue())));
	//   17   72:aload_1         
	//   18   73:invokevirtual   #170 <Method double JsonParser.getDoubleValue()>
	//   19   76:invokestatic    #174 <Method Double Double.valueOf(double)>
	//   20   79:areturn         
			break;

		case 7: // '\007'
			if(_acceptInt)
	//*  21   80:aload_0         
	//*  22   81:getfield        #72  <Field boolean _acceptInt>
	//*  23   84:ifeq            107
				return ((Object) (Integer.valueOf(jsonparser.getIntValue())));
	//   24   87:aload_1         
	//   25   88:invokevirtual   #177 <Method int JsonParser.getIntValue()>
	//   26   91:invokestatic    #180 <Method Integer Integer.valueOf(int)>
	//   27   94:areturn         
			break;

		case 6: // '\006'
			if(_acceptString)
	//*  28   95:aload_0         
	//*  29   96:getfield        #59  <Field boolean _acceptString>
	//*  30   99:ifeq            107
				return ((Object) (jsonparser.getText()));
	//   31  102:aload_1         
	//   32  103:invokevirtual   #183 <Method String JsonParser.getText()>
	//   33  106:areturn         
			break;
		}
		return ((Object) (null));
	//   34  107:aconst_null     
	//   35  108:areturn         
	}

	public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
		throws JsonMappingException
	{
		Object obj1 = ((Object) (deserializationcontext.getAnnotationIntrospector()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #191 <Method AnnotationIntrospector DeserializationContext.getAnnotationIntrospector()>
	//    2    4:astore          5
		if(beanproperty != null && obj1 != null)
	//*   3    6:aload_2         
	//*   4    7:ifnull          247
	//*   5   10:aload           5
	//*   6   12:ifnull          247
		{
			Object obj = ((Object) (beanproperty.getMember()));
	//    7   15:aload_2         
	//    8   16:invokeinterface #197 <Method com.fasterxml.jackson.databind.introspect.AnnotatedMember BeanProperty.getMember()>
	//    9   21:astore          4
			if(obj != null)
	//*  10   23:aload           4
	//*  11   25:ifnull          247
			{
				beanproperty = ((BeanProperty) (((AnnotationIntrospector) (obj1)).findObjectIdInfo(((com.fasterxml.jackson.databind.introspect.Annotated) (obj)))));
	//   12   28:aload           5
	//   13   30:aload           4
	//   14   32:invokevirtual   #203 <Method ObjectIdInfo AnnotationIntrospector.findObjectIdInfo(com.fasterxml.jackson.databind.introspect.Annotated)>
	//   15   35:astore_2        
				if(beanproperty != null)
	//*  16   36:aload_2         
	//*  17   37:ifnull          247
				{
					com.fasterxml.jackson.annotation.ObjectIdResolver objectidresolver = deserializationcontext.objectIdResolverInstance(((com.fasterxml.jackson.databind.introspect.Annotated) (obj)), ((ObjectIdInfo) (beanproperty)));
	//   18   40:aload_1         
	//   19   41:aload           4
	//   20   43:aload_2         
	//   21   44:invokevirtual   #207 <Method com.fasterxml.jackson.annotation.ObjectIdResolver DeserializationContext.objectIdResolverInstance(com.fasterxml.jackson.databind.introspect.Annotated, ObjectIdInfo)>
	//   22   47:astore_3        
					ObjectIdInfo objectidinfo = ((AnnotationIntrospector) (obj1)).findObjectReferenceInfo(((com.fasterxml.jackson.databind.introspect.Annotated) (obj)), ((ObjectIdInfo) (beanproperty)));
	//   23   48:aload           5
	//   24   50:aload           4
	//   25   52:aload_2         
	//   26   53:invokevirtual   #211 <Method ObjectIdInfo AnnotationIntrospector.findObjectReferenceInfo(com.fasterxml.jackson.databind.introspect.Annotated, ObjectIdInfo)>
	//   27   56:astore          7
					beanproperty = ((BeanProperty) (objectidinfo.getGeneratorType()));
	//   28   58:aload           7
	//   29   60:invokevirtual   #216 <Method Class ObjectIdInfo.getGeneratorType()>
	//   30   63:astore_2        
					BeanProperty beanproperty1;
					if(beanproperty == com/fasterxml/jackson/annotation/ObjectIdGenerators$PropertyGenerator)
	//*  31   64:aload_2         
	//*  32   65:ldc1            #218 <Class com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator>
	//*  33   67:if_acmpne       169
					{
						obj = ((Object) (objectidinfo.getPropertyName()));
	//   34   70:aload           7
	//   35   72:invokevirtual   #222 <Method PropertyName ObjectIdInfo.getPropertyName()>
	//   36   75:astore          4
						beanproperty = ((BeanProperty) (_properties));
	//   37   77:aload_0         
	//   38   78:getfield        #81  <Field Map _properties>
	//   39   81:astore_2        
						if(beanproperty == null)
	//*  40   82:aload_2         
	//*  41   83:ifnonnull       91
							beanproperty = null;
	//   42   86:aconst_null     
	//   43   87:astore_2        
						else
	//*  44   88:goto            106
							beanproperty = ((BeanProperty) ((SettableBeanProperty)((Map) (beanproperty)).get(((Object) (((PropertyName) (obj)).getSimpleName())))));
	//   45   91:aload_2         
	//   46   92:aload           4
	//   47   94:invokevirtual   #227 <Method String PropertyName.getSimpleName()>
	//   48   97:invokeinterface #233 <Method Object Map.get(Object)>
	//   49  102:checkcast       #235 <Class SettableBeanProperty>
	//   50  105:astore_2        
						if(beanproperty == null)
	//*  51  106:aload_2         
	//*  52  107:ifnonnull       143
							deserializationcontext.reportBadDefinition(_baseType, String.format("Invalid Object Id definition for %s: cannot find property with name '%s'", new Object[] {
								handledType().getName(), obj
							}));
	//   53  110:aload_1         
	//   54  111:aload_0         
	//   55  112:getfield        #39  <Field JavaType _baseType>
	//   56  115:ldc1            #237 <String "Invalid Object Id definition for %s: cannot find property with name '%s'">
	//   57  117:iconst_2        
	//   58  118:anewarray       Object[]
	//   59  121:dup             
	//   60  122:iconst_0        
	//   61  123:aload_0         
	//   62  124:invokevirtual   #242 <Method Class handledType()>
	//   63  127:invokevirtual   #245 <Method String Class.getName()>
	//   64  130:aastore         
	//   65  131:dup             
	//   66  132:iconst_1        
	//   67  133:aload           4
	//   68  135:aastore         
	//   69  136:invokestatic    #249 <Method String String.format(String, Object[])>
	//   70  139:invokevirtual   #253 <Method Object DeserializationContext.reportBadDefinition(JavaType, String)>
	//   71  142:pop             
						obj = ((Object) (((SettableBeanProperty) (beanproperty)).getType()));
	//   72  143:aload_2         
	//   73  144:invokevirtual   #254 <Method JavaType SettableBeanProperty.getType()>
	//   74  147:astore          4
						obj1 = ((Object) (new PropertyBasedObjectIdGenerator(objectidinfo.getScope())));
	//   75  149:new             #256 <Class PropertyBasedObjectIdGenerator>
	//   76  152:dup             
	//   77  153:aload           7
	//   78  155:invokevirtual   #259 <Method Class ObjectIdInfo.getScope()>
	//   79  158:invokespecial   #262 <Method void PropertyBasedObjectIdGenerator(Class)>
	//   80  161:astore          5
						beanproperty1 = beanproperty;
	//   81  163:aload_2         
	//   82  164:astore          6
					} else
	//*  83  166:goto            214
					{
						objectidresolver = deserializationcontext.objectIdResolverInstance(((com.fasterxml.jackson.databind.introspect.Annotated) (obj)), objectidinfo);
	//   84  169:aload_1         
	//   85  170:aload           4
	//   86  172:aload           7
	//   87  174:invokevirtual   #207 <Method com.fasterxml.jackson.annotation.ObjectIdResolver DeserializationContext.objectIdResolverInstance(com.fasterxml.jackson.databind.introspect.Annotated, ObjectIdInfo)>
	//   88  177:astore_3        
						beanproperty = ((BeanProperty) (deserializationcontext.constructType(((Class) (beanproperty)))));
	//   89  178:aload_1         
	//   90  179:aload_2         
	//   91  180:invokevirtual   #266 <Method JavaType DeserializationContext.constructType(Class)>
	//   92  183:astore_2        
						beanproperty = ((BeanProperty) (deserializationcontext.getTypeFactory().findTypeParameters(((JavaType) (beanproperty)), com/fasterxml/jackson/annotation/ObjectIdGenerator)[0]));
	//   93  184:aload_1         
	//   94  185:invokevirtual   #270 <Method TypeFactory DeserializationContext.getTypeFactory()>
	//   95  188:aload_2         
	//   96  189:ldc2            #272 <Class ObjectIdGenerator>
	//   97  192:invokevirtual   #278 <Method JavaType[] TypeFactory.findTypeParameters(JavaType, Class)>
	//   98  195:iconst_0        
	//   99  196:aaload          
	//  100  197:astore_2        
						obj1 = ((Object) (deserializationcontext.objectIdGeneratorInstance(((com.fasterxml.jackson.databind.introspect.Annotated) (obj)), objectidinfo)));
	//  101  198:aload_1         
	//  102  199:aload           4
	//  103  201:aload           7
	//  104  203:invokevirtual   #282 <Method ObjectIdGenerator DeserializationContext.objectIdGeneratorInstance(com.fasterxml.jackson.databind.introspect.Annotated, ObjectIdInfo)>
	//  105  206:astore          5
						beanproperty1 = null;
	//  106  208:aconst_null     
	//  107  209:astore          6
						obj = ((Object) (beanproperty));
	//  108  211:aload_2         
	//  109  212:astore          4
					}
					deserializationcontext = ((DeserializationContext) (deserializationcontext.findRootValueDeserializer(((JavaType) (obj)))));
	//  110  214:aload_1         
	//  111  215:aload           4
	//  112  217:invokevirtual   #286 <Method JsonDeserializer DeserializationContext.findRootValueDeserializer(JavaType)>
	//  113  220:astore_1        
					return ((JsonDeserializer) (new AbstractDeserializer(this, ObjectIdReader.construct(((JavaType) (obj)), objectidinfo.getPropertyName(), ((ObjectIdGenerator) (obj1)), ((JsonDeserializer) (deserializationcontext)), ((SettableBeanProperty) (beanproperty1)), objectidresolver), ((Map) (null)))));
	//  114  221:new             #2   <Class AbstractDeserializer>
	//  115  224:dup             
	//  116  225:aload_0         
	//  117  226:aload           4
	//  118  228:aload           7
	//  119  230:invokevirtual   #222 <Method PropertyName ObjectIdInfo.getPropertyName()>
	//  120  233:aload           5
	//  121  235:aload_1         
	//  122  236:aload           6
	//  123  238:aload_3         
	//  124  239:invokestatic    #290 <Method ObjectIdReader ObjectIdReader.construct(JavaType, PropertyName, ObjectIdGenerator, JsonDeserializer, SettableBeanProperty, com.fasterxml.jackson.annotation.ObjectIdResolver)>
	//  125  242:aconst_null     
	//  126  243:invokespecial   #292 <Method void AbstractDeserializer(AbstractDeserializer, ObjectIdReader, Map)>
	//  127  246:areturn         
				}
			}
		}
		if(_properties == null)
	//* 128  247:aload_0         
	//* 129  248:getfield        #81  <Field Map _properties>
	//* 130  251:ifnonnull       256
			return ((JsonDeserializer) (this));
	//  131  254:aload_0         
	//  132  255:areturn         
		else
			return ((JsonDeserializer) (new AbstractDeserializer(this, _objectIdReader, ((Map) (null)))));
	//  133  256:new             #2   <Class AbstractDeserializer>
	//  134  259:dup             
	//  135  260:aload_0         
	//  136  261:aload_0         
	//  137  262:getfield        #41  <Field ObjectIdReader _objectIdReader>
	//  138  265:aconst_null     
	//  139  266:invokespecial   #292 <Method void AbstractDeserializer(AbstractDeserializer, ObjectIdReader, Map)>
	//  140  269:areturn         
	}

	public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		ValueInstantiator.Base base = new ValueInstantiator.Base(_baseType);
	//    0    0:new             #296 <Class ValueInstantiator$Base>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #39  <Field JavaType _baseType>
	//    4    8:invokespecial   #299 <Method void ValueInstantiator$Base(JavaType)>
	//    5   11:astore_3        
		return deserializationcontext.handleMissingInstantiator(_baseType.getRawClass(), ((ValueInstantiator) (base)), jsonparser, "abstract types either need to be mapped to concrete types, have custom deserializer, or contain additional type information", new Object[0]);
	//    6   12:aload_2         
	//    7   13:aload_0         
	//    8   14:getfield        #39  <Field JavaType _baseType>
	//    9   17:invokevirtual   #49  <Method Class JavaType.getRawClass()>
	//   10   20:aload_3         
	//   11   21:aload_1         
	//   12   22:ldc2            #301 <String "abstract types either need to be mapped to concrete types, have custom deserializer, or contain additional type information">
	//   13   25:iconst_0        
	//   14   26:anewarray       Object[]
	//   15   29:invokevirtual   #305 <Method Object DeserializationContext.handleMissingInstantiator(Class, ValueInstantiator, JsonParser, String, Object[])>
	//   16   32:areturn         
	}

	public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		if(_objectIdReader != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field ObjectIdReader _objectIdReader>
	//*   2    4:ifnull          91
		{
			JsonToken jsontoken1 = jsonparser.getCurrentToken();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #311 <Method JsonToken JsonParser.getCurrentToken()>
	//    5   11:astore          5
			if(jsontoken1 != null)
	//*   6   13:aload           5
	//*   7   15:ifnull          91
			{
				if(jsontoken1.isScalarValue())
	//*   8   18:aload           5
	//*   9   20:invokevirtual   #317 <Method boolean JsonToken.isScalarValue()>
	//*  10   23:ifeq            33
					return _deserializeFromObjectId(jsonparser, deserializationcontext);
	//   11   26:aload_0         
	//   12   27:aload_1         
	//   13   28:aload_2         
	//   14   29:invokevirtual   #319 <Method Object _deserializeFromObjectId(JsonParser, DeserializationContext)>
	//   15   32:areturn         
				JsonToken jsontoken = jsontoken1;
	//   16   33:aload           5
	//   17   35:astore          4
				if(jsontoken1 == JsonToken.START_OBJECT)
	//*  18   37:aload           5
	//*  19   39:getstatic       #323 <Field JsonToken JsonToken.START_OBJECT>
	//*  20   42:if_acmpne       51
					jsontoken = jsonparser.nextToken();
	//   21   45:aload_1         
	//   22   46:invokevirtual   #326 <Method JsonToken JsonParser.nextToken()>
	//   23   49:astore          4
				if(jsontoken == JsonToken.FIELD_NAME && _objectIdReader.maySerializeAsObject() && _objectIdReader.isValidReferencePropertyName(jsonparser.getCurrentName(), jsonparser))
	//*  24   51:aload           4
	//*  25   53:getstatic       #329 <Field JsonToken JsonToken.FIELD_NAME>
	//*  26   56:if_acmpne       91
	//*  27   59:aload_0         
	//*  28   60:getfield        #41  <Field ObjectIdReader _objectIdReader>
	//*  29   63:invokevirtual   #332 <Method boolean ObjectIdReader.maySerializeAsObject()>
	//*  30   66:ifeq            91
	//*  31   69:aload_0         
	//*  32   70:getfield        #41  <Field ObjectIdReader _objectIdReader>
	//*  33   73:aload_1         
	//*  34   74:invokevirtual   #335 <Method String JsonParser.getCurrentName()>
	//*  35   77:aload_1         
	//*  36   78:invokevirtual   #339 <Method boolean ObjectIdReader.isValidReferencePropertyName(String, JsonParser)>
	//*  37   81:ifeq            91
					return _deserializeFromObjectId(jsonparser, deserializationcontext);
	//   38   84:aload_0         
	//   39   85:aload_1         
	//   40   86:aload_2         
	//   41   87:invokevirtual   #319 <Method Object _deserializeFromObjectId(JsonParser, DeserializationContext)>
	//   42   90:areturn         
			}
		}
		Object obj = _deserializeIfNatural(jsonparser, deserializationcontext);
	//   43   91:aload_0         
	//   44   92:aload_1         
	//   45   93:aload_2         
	//   46   94:invokevirtual   #341 <Method Object _deserializeIfNatural(JsonParser, DeserializationContext)>
	//   47   97:astore          4
		if(obj != null)
	//*  48   99:aload           4
	//*  49  101:ifnull          107
			return obj;
	//   50  104:aload           4
	//   51  106:areturn         
		else
			return typedeserializer.deserializeTypedFromObject(jsonparser, deserializationcontext);
	//   52  107:aload_3         
	//   53  108:aload_1         
	//   54  109:aload_2         
	//   55  110:invokevirtual   #346 <Method Object TypeDeserializer.deserializeTypedFromObject(JsonParser, DeserializationContext)>
	//   56  113:areturn         
	}

	public SettableBeanProperty findBackReference(String s)
	{
		Map map = _backRefProperties;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Map _backRefProperties>
	//    2    4:astore_2        
		if(map == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return (SettableBeanProperty)map.get(((Object) (s)));
	//    7   11:aload_2         
	//    8   12:aload_1         
	//    9   13:invokeinterface #233 <Method Object Map.get(Object)>
	//   10   18:checkcast       #235 <Class SettableBeanProperty>
	//   11   21:areturn         
	}

	public ObjectIdReader getObjectIdReader()
	{
		return _objectIdReader;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field ObjectIdReader _objectIdReader>
	//    2    4:areturn         
	}

	public Class handledType()
	{
		return _baseType.getRawClass();
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field JavaType _baseType>
	//    2    4:invokevirtual   #49  <Method Class JavaType.getRawClass()>
	//    3    7:areturn         
	}

	public boolean isCachable()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public Boolean supportsUpdate(DeserializationConfig deserializationconfig)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final boolean _acceptBoolean;
	protected final boolean _acceptDouble;
	protected final boolean _acceptInt;
	protected final boolean _acceptString;
	protected final Map _backRefProperties;
	protected final JavaType _baseType;
	protected final ObjectIdReader _objectIdReader;
	protected transient Map _properties;
}
