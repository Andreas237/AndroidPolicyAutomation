// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;

// Referenced classes of package com.fasterxml.jackson.databind.deser:
//			BeanDeserializerBuilder, UnresolvedForwardReference, SettableBeanProperty

public class AbstractDeserializer extends JsonDeserializer
	implements Serializable
{

	protected AbstractDeserializer(BeanDescription beandescription)
	{
label0:
		{
			boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
			super();
	//    2    2:aload_0         
	//    3    3:invokespecial   #28  <Method void JsonDeserializer()>
			_baseType = beandescription.getType();
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #34  <Method JavaType BeanDescription.getType()>
	//    7   11:putfield        #36  <Field JavaType _baseType>
			_objectIdReader = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #38  <Field ObjectIdReader _objectIdReader>
			_backRefProperties = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #40  <Field Map _backRefProperties>
			beandescription = ((BeanDescription) (_baseType.getRawClass()));
	//   14   24:aload_0         
	//   15   25:getfield        #36  <Field JavaType _baseType>
	//   16   28:invokevirtual   #46  <Method Class JavaType.getRawClass()>
	//   17   31:astore_1        
			_acceptString = ((Class) (beandescription)).isAssignableFrom(java/lang/String);
	//   18   32:aload_0         
	//   19   33:aload_1         
	//   20   34:ldc1            #48  <Class String>
	//   21   36:invokevirtual   #54  <Method boolean Class.isAssignableFrom(Class)>
	//   22   39:putfield        #56  <Field boolean _acceptString>
			boolean flag;
			if(beandescription == Boolean.TYPE || ((Class) (beandescription)).isAssignableFrom(java/lang/Boolean))
	//*  23   42:aload_1         
	//*  24   43:getstatic       #62  <Field Class Boolean.TYPE>
	//*  25   46:if_acmpeq       58
	//*  26   49:aload_1         
	//*  27   50:ldc1            #58  <Class Boolean>
	//*  28   52:invokevirtual   #54  <Method boolean Class.isAssignableFrom(Class)>
	//*  29   55:ifeq            114
				flag = true;
	//   30   58:iconst_1        
	//   31   59:istore_2        
			else
	//*  32   60:aload_0         
	//*  33   61:iload_2         
	//*  34   62:putfield        #64  <Field boolean _acceptBoolean>
	//*  35   65:aload_1         
	//*  36   66:getstatic       #67  <Field Class Integer.TYPE>
	//*  37   69:if_acmpeq       81
	//*  38   72:aload_1         
	//*  39   73:ldc1            #66  <Class Integer>
	//*  40   75:invokevirtual   #54  <Method boolean Class.isAssignableFrom(Class)>
	//*  41   78:ifeq            119
	//*  42   81:iconst_1        
	//*  43   82:istore_2        
	//*  44   83:aload_0         
	//*  45   84:iload_2         
	//*  46   85:putfield        #69  <Field boolean _acceptInt>
	//*  47   88:aload_1         
	//*  48   89:getstatic       #72  <Field Class Double.TYPE>
	//*  49   92:if_acmpeq       106
	//*  50   95:iload_3         
	//*  51   96:istore_2        
	//*  52   97:aload_1         
	//*  53   98:ldc1            #71  <Class Double>
	//*  54  100:invokevirtual   #54  <Method boolean Class.isAssignableFrom(Class)>
	//*  55  103:ifeq            108
	//*  56  106:iconst_1        
	//*  57  107:istore_2        
	//*  58  108:aload_0         
	//*  59  109:iload_2         
	//*  60  110:putfield        #74  <Field boolean _acceptDouble>
	//*  61  113:return          
				flag = false;
	//   62  114:iconst_0        
	//   63  115:istore_2        
			_acceptBoolean = flag;
			if(beandescription == Integer.TYPE || ((Class) (beandescription)).isAssignableFrom(java/lang/Integer))
				flag = true;
			else
	//*  64  116:goto            60
				flag = false;
	//   65  119:iconst_0        
	//   66  120:istore_2        
			_acceptInt = flag;
			if(beandescription != Double.TYPE)
			{
				flag = flag1;
				if(!((Class) (beandescription)).isAssignableFrom(java/lang/Double))
					break label0;
			}
			flag = true;
		}
		_acceptDouble = flag;
	//*  67  121:goto            83
	}

	public AbstractDeserializer(BeanDeserializerBuilder beandeserializerbuilder, BeanDescription beandescription, Map map)
	{
label0:
		{
			boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
			super();
	//    2    3:aload_0         
	//    3    4:invokespecial   #28  <Method void JsonDeserializer()>
			_baseType = beandescription.getType();
	//    4    7:aload_0         
	//    5    8:aload_2         
	//    6    9:invokevirtual   #34  <Method JavaType BeanDescription.getType()>
	//    7   12:putfield        #36  <Field JavaType _baseType>
			_objectIdReader = beandeserializerbuilder.getObjectIdReader();
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #82  <Method ObjectIdReader BeanDeserializerBuilder.getObjectIdReader()>
	//   11   20:putfield        #38  <Field ObjectIdReader _objectIdReader>
			_backRefProperties = map;
	//   12   23:aload_0         
	//   13   24:aload_3         
	//   14   25:putfield        #40  <Field Map _backRefProperties>
			beandeserializerbuilder = ((BeanDeserializerBuilder) (_baseType.getRawClass()));
	//   15   28:aload_0         
	//   16   29:getfield        #36  <Field JavaType _baseType>
	//   17   32:invokevirtual   #46  <Method Class JavaType.getRawClass()>
	//   18   35:astore_1        
			_acceptString = ((Class) (beandeserializerbuilder)).isAssignableFrom(java/lang/String);
	//   19   36:aload_0         
	//   20   37:aload_1         
	//   21   38:ldc1            #48  <Class String>
	//   22   40:invokevirtual   #54  <Method boolean Class.isAssignableFrom(Class)>
	//   23   43:putfield        #56  <Field boolean _acceptString>
			boolean flag;
			if(beandeserializerbuilder == Boolean.TYPE || ((Class) (beandeserializerbuilder)).isAssignableFrom(java/lang/Boolean))
	//*  24   46:aload_1         
	//*  25   47:getstatic       #62  <Field Class Boolean.TYPE>
	//*  26   50:if_acmpeq       62
	//*  27   53:aload_1         
	//*  28   54:ldc1            #58  <Class Boolean>
	//*  29   56:invokevirtual   #54  <Method boolean Class.isAssignableFrom(Class)>
	//*  30   59:ifeq            126
				flag = true;
	//   31   62:iconst_1        
	//   32   63:istore          4
			else
	//*  33   65:aload_0         
	//*  34   66:iload           4
	//*  35   68:putfield        #64  <Field boolean _acceptBoolean>
	//*  36   71:aload_1         
	//*  37   72:getstatic       #67  <Field Class Integer.TYPE>
	//*  38   75:if_acmpeq       87
	//*  39   78:aload_1         
	//*  40   79:ldc1            #66  <Class Integer>
	//*  41   81:invokevirtual   #54  <Method boolean Class.isAssignableFrom(Class)>
	//*  42   84:ifeq            132
	//*  43   87:iconst_1        
	//*  44   88:istore          4
	//*  45   90:aload_0         
	//*  46   91:iload           4
	//*  47   93:putfield        #69  <Field boolean _acceptInt>
	//*  48   96:aload_1         
	//*  49   97:getstatic       #72  <Field Class Double.TYPE>
	//*  50  100:if_acmpeq       116
	//*  51  103:iload           5
	//*  52  105:istore          4
	//*  53  107:aload_1         
	//*  54  108:ldc1            #71  <Class Double>
	//*  55  110:invokevirtual   #54  <Method boolean Class.isAssignableFrom(Class)>
	//*  56  113:ifeq            119
	//*  57  116:iconst_1        
	//*  58  117:istore          4
	//*  59  119:aload_0         
	//*  60  120:iload           4
	//*  61  122:putfield        #74  <Field boolean _acceptDouble>
	//*  62  125:return          
				flag = false;
	//   63  126:iconst_0        
	//   64  127:istore          4
			_acceptBoolean = flag;
			if(beandeserializerbuilder == Integer.TYPE || ((Class) (beandeserializerbuilder)).isAssignableFrom(java/lang/Integer))
				flag = true;
			else
	//*  65  129:goto            65
				flag = false;
	//   66  132:iconst_0        
	//   67  133:istore          4
			_acceptInt = flag;
			if(beandeserializerbuilder != Double.TYPE)
			{
				flag = flag1;
				if(!((Class) (beandeserializerbuilder)).isAssignableFrom(java/lang/Double))
					break label0;
			}
			flag = true;
		}
		_acceptDouble = flag;
	//*  68  135:goto            90
	}

	public static AbstractDeserializer constructForNonPOJO(BeanDescription beandescription)
	{
		return new AbstractDeserializer(beandescription);
	//    0    0:new             #2   <Class AbstractDeserializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #88  <Method void AbstractDeserializer(BeanDescription)>
	//    4    8:areturn         
	}

	protected Object _deserializeFromObjectId(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		Object obj = _objectIdReader.readObjectReference(jsonparser, deserializationcontext);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ObjectIdReader _objectIdReader>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #97  <Method Object ObjectIdReader.readObjectReference(JsonParser, DeserializationContext)>
	//    5    9:astore_3        
		deserializationcontext = ((DeserializationContext) (deserializationcontext.findObjectId(obj, _objectIdReader.generator, _objectIdReader.resolver)));
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:aload_0         
	//    9   13:getfield        #38  <Field ObjectIdReader _objectIdReader>
	//   10   16:getfield        #101 <Field com.fasterxml.jackson.annotation.ObjectIdGenerator ObjectIdReader.generator>
	//   11   19:aload_0         
	//   12   20:getfield        #38  <Field ObjectIdReader _objectIdReader>
	//   13   23:getfield        #105 <Field com.fasterxml.jackson.annotation.ObjectIdResolver ObjectIdReader.resolver>
	//   14   26:invokevirtual   #111 <Method ReadableObjectId DeserializationContext.findObjectId(Object, com.fasterxml.jackson.annotation.ObjectIdGenerator, com.fasterxml.jackson.annotation.ObjectIdResolver)>
	//   15   29:astore_2        
		Object obj1 = ((ReadableObjectId) (deserializationcontext)).resolve();
	//   16   30:aload_2         
	//   17   31:invokevirtual   #117 <Method Object ReadableObjectId.resolve()>
	//   18   34:astore          4
		if(obj1 == null)
	//*  19   36:aload           4
	//*  20   38:ifnonnull       79
			throw new UnresolvedForwardReference(jsonparser, (new StringBuilder()).append("Could not resolve Object Id [").append(obj).append("] -- unresolved forward-reference?").toString(), jsonparser.getCurrentLocation(), ((ReadableObjectId) (deserializationcontext)));
	//   21   41:new             #119 <Class UnresolvedForwardReference>
	//   22   44:dup             
	//   23   45:aload_1         
	//   24   46:new             #121 <Class StringBuilder>
	//   25   49:dup             
	//   26   50:invokespecial   #122 <Method void StringBuilder()>
	//   27   53:ldc1            #124 <String "Could not resolve Object Id [">
	//   28   55:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   29   58:aload_3         
	//   30   59:invokevirtual   #131 <Method StringBuilder StringBuilder.append(Object)>
	//   31   62:ldc1            #133 <String "] -- unresolved forward-reference?">
	//   32   64:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   33   67:invokevirtual   #137 <Method String StringBuilder.toString()>
	//   34   70:aload_1         
	//   35   71:invokevirtual   #143 <Method com.fasterxml.jackson.core.JsonLocation JsonParser.getCurrentLocation()>
	//   36   74:aload_2         
	//   37   75:invokespecial   #146 <Method void UnresolvedForwardReference(JsonParser, String, com.fasterxml.jackson.core.JsonLocation, ReadableObjectId)>
	//   38   78:athrow          
		else
			return obj1;
	//   39   79:aload           4
	//   40   81:areturn         
	}

	protected Object _deserializeIfNatural(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		jsonparser.getCurrentTokenId();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #152 <Method int JsonParser.getCurrentTokenId()>
		JVM INSTR tableswitch 6 10: default 40
	//	               6 42
	//	               7 54
	//	               8 69
	//	               9 84
	//	               10 95;
	//    2    4:tableswitch     6 10: default 40
	//	               6 42
	//	               7 54
	//	               8 69
	//	               9 84
	//	               10 95
		   goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
		return ((Object) (null));
	//    3   40:aconst_null     
	//    4   41:areturn         
_L2:
		if(_acceptString)
	//*   5   42:aload_0         
	//*   6   43:getfield        #56  <Field boolean _acceptString>
	//*   7   46:ifeq            40
			return ((Object) (jsonparser.getText()));
	//    8   49:aload_1         
	//    9   50:invokevirtual   #155 <Method String JsonParser.getText()>
	//   10   53:areturn         
		continue; /* Loop/switch isn't completed */
_L3:
		if(_acceptInt)
	//*  11   54:aload_0         
	//*  12   55:getfield        #69  <Field boolean _acceptInt>
	//*  13   58:ifeq            40
			return ((Object) (Integer.valueOf(jsonparser.getIntValue())));
	//   14   61:aload_1         
	//   15   62:invokevirtual   #158 <Method int JsonParser.getIntValue()>
	//   16   65:invokestatic    #162 <Method Integer Integer.valueOf(int)>
	//   17   68:areturn         
		continue; /* Loop/switch isn't completed */
_L4:
		if(_acceptDouble)
	//*  18   69:aload_0         
	//*  19   70:getfield        #74  <Field boolean _acceptDouble>
	//*  20   73:ifeq            40
			return ((Object) (Double.valueOf(jsonparser.getDoubleValue())));
	//   21   76:aload_1         
	//   22   77:invokevirtual   #166 <Method double JsonParser.getDoubleValue()>
	//   23   80:invokestatic    #169 <Method Double Double.valueOf(double)>
	//   24   83:areturn         
		continue; /* Loop/switch isn't completed */
_L5:
		if(_acceptBoolean)
	//*  25   84:aload_0         
	//*  26   85:getfield        #64  <Field boolean _acceptBoolean>
	//*  27   88:ifeq            40
			return ((Object) (Boolean.TRUE));
	//   28   91:getstatic       #173 <Field Boolean Boolean.TRUE>
	//   29   94:areturn         
		continue; /* Loop/switch isn't completed */
_L6:
		if(_acceptBoolean)
	//*  30   95:aload_0         
	//*  31   96:getfield        #64  <Field boolean _acceptBoolean>
	//*  32   99:ifeq            40
			return ((Object) (Boolean.FALSE));
	//   33  102:getstatic       #176 <Field Boolean Boolean.FALSE>
	//   34  105:areturn         
		if(true) goto _L1; else goto _L7
_L7:
	}

	public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		throw deserializationcontext.instantiationException(_baseType.getRawClass(), "abstract types either need to be mapped to concrete types, have custom deserializer, or be instantiated with additional type information");
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:getfield        #36  <Field JavaType _baseType>
	//    3    5:invokevirtual   #46  <Method Class JavaType.getRawClass()>
	//    4    8:ldc1            #179 <String "abstract types either need to be mapped to concrete types, have custom deserializer, or be instantiated with additional type information">
	//    5   10:invokevirtual   #183 <Method com.fasterxml.jackson.databind.JsonMappingException DeserializationContext.instantiationException(Class, String)>
	//    6   13:athrow          
	}

	public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		if(_objectIdReader == null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ObjectIdReader _objectIdReader>
	//    2    4:ifnull          95
_L1:
		JsonToken jsontoken = jsonparser.getCurrentToken();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #189 <Method JsonToken JsonParser.getCurrentToken()>
	//    5   11:astore          5
		if(jsontoken == null) goto _L2; else goto _L3
	//    6   13:aload           5
	//    7   15:ifnull          95
_L3:
		if(!jsontoken.isScalarValue()) goto _L5; else goto _L4
	//    8   18:aload           5
	//    9   20:invokevirtual   #195 <Method boolean JsonToken.isScalarValue()>
	//   10   23:ifeq            37
_L4:
		Object obj = _deserializeFromObjectId(jsonparser, deserializationcontext);
	//   11   26:aload_0         
	//   12   27:aload_1         
	//   13   28:aload_2         
	//   14   29:invokevirtual   #197 <Method Object _deserializeFromObjectId(JsonParser, DeserializationContext)>
	//   15   32:astore          4
_L7:
		return obj;
	//   16   34:aload           4
	//   17   36:areturn         
_L5:
		obj = ((Object) (jsontoken));
	//   18   37:aload           5
	//   19   39:astore          4
		if(jsontoken == JsonToken.START_OBJECT)
	//*  20   41:aload           5
	//*  21   43:getstatic       #201 <Field JsonToken JsonToken.START_OBJECT>
	//*  22   46:if_acmpne       55
			obj = ((Object) (jsonparser.nextToken()));
	//   23   49:aload_1         
	//   24   50:invokevirtual   #204 <Method JsonToken JsonParser.nextToken()>
	//   25   53:astore          4
		if(obj == JsonToken.FIELD_NAME && _objectIdReader.maySerializeAsObject() && _objectIdReader.isValidReferencePropertyName(jsonparser.getCurrentName(), jsonparser))
	//*  26   55:aload           4
	//*  27   57:getstatic       #207 <Field JsonToken JsonToken.FIELD_NAME>
	//*  28   60:if_acmpne       95
	//*  29   63:aload_0         
	//*  30   64:getfield        #38  <Field ObjectIdReader _objectIdReader>
	//*  31   67:invokevirtual   #210 <Method boolean ObjectIdReader.maySerializeAsObject()>
	//*  32   70:ifeq            95
	//*  33   73:aload_0         
	//*  34   74:getfield        #38  <Field ObjectIdReader _objectIdReader>
	//*  35   77:aload_1         
	//*  36   78:invokevirtual   #213 <Method String JsonParser.getCurrentName()>
	//*  37   81:aload_1         
	//*  38   82:invokevirtual   #217 <Method boolean ObjectIdReader.isValidReferencePropertyName(String, JsonParser)>
	//*  39   85:ifeq            95
			return _deserializeFromObjectId(jsonparser, deserializationcontext);
	//   40   88:aload_0         
	//   41   89:aload_1         
	//   42   90:aload_2         
	//   43   91:invokevirtual   #197 <Method Object _deserializeFromObjectId(JsonParser, DeserializationContext)>
	//   44   94:areturn         
_L2:
		Object obj1 = _deserializeIfNatural(jsonparser, deserializationcontext);
	//   45   95:aload_0         
	//   46   96:aload_1         
	//   47   97:aload_2         
	//   48   98:invokevirtual   #219 <Method Object _deserializeIfNatural(JsonParser, DeserializationContext)>
	//   49  101:astore          5
		obj = obj1;
	//   50  103:aload           5
	//   51  105:astore          4
		if(obj1 == null)
	//*  52  107:aload           5
	//*  53  109:ifnonnull       34
			return typedeserializer.deserializeTypedFromObject(jsonparser, deserializationcontext);
	//   54  112:aload_3         
	//   55  113:aload_1         
	//   56  114:aload_2         
	//   57  115:invokevirtual   #224 <Method Object TypeDeserializer.deserializeTypedFromObject(JsonParser, DeserializationContext)>
	//   58  118:areturn         
		if(true) goto _L7; else goto _L6
_L6:
	}

	public SettableBeanProperty findBackReference(String s)
	{
		if(_backRefProperties == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field Map _backRefProperties>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return (SettableBeanProperty)_backRefProperties.get(((Object) (s)));
	//    5    9:aload_0         
	//    6   10:getfield        #40  <Field Map _backRefProperties>
	//    7   13:aload_1         
	//    8   14:invokeinterface #232 <Method Object Map.get(Object)>
	//    9   19:checkcast       #234 <Class SettableBeanProperty>
	//   10   22:areturn         
	}

	public ObjectIdReader getObjectIdReader()
	{
		return _objectIdReader;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ObjectIdReader _objectIdReader>
	//    2    4:areturn         
	}

	public Class handledType()
	{
		return _baseType.getRawClass();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field JavaType _baseType>
	//    2    4:invokevirtual   #46  <Method Class JavaType.getRawClass()>
	//    3    7:areturn         
	}

	public boolean isCachable()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	private static final long serialVersionUID = 1L;
	protected final boolean _acceptBoolean;
	protected final boolean _acceptDouble;
	protected final boolean _acceptInt;
	protected final boolean _acceptString;
	protected final Map _backRefProperties;
	protected final JavaType _baseType;
	protected final ObjectIdReader _objectIdReader;
}
