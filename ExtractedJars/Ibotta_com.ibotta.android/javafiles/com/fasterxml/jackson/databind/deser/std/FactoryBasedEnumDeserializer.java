// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.*;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			StdDeserializer

class FactoryBasedEnumDeserializer extends StdDeserializer
	implements ContextualDeserializer
{

	protected FactoryBasedEnumDeserializer(FactoryBasedEnumDeserializer factorybasedenumdeserializer, JsonDeserializer jsondeserializer)
	{
		super(factorybasedenumdeserializer._valueClass);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #32  <Field Class _valueClass>
	//    3    5:invokespecial   #35  <Method void StdDeserializer(Class)>
		_inputType = factorybasedenumdeserializer._inputType;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:getfield        #37  <Field JavaType _inputType>
	//    7   13:putfield        #37  <Field JavaType _inputType>
		_factory = factorybasedenumdeserializer._factory;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:getfield        #39  <Field AnnotatedMethod _factory>
	//   11   21:putfield        #39  <Field AnnotatedMethod _factory>
		_hasArgs = factorybasedenumdeserializer._hasArgs;
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:getfield        #41  <Field boolean _hasArgs>
	//   15   29:putfield        #41  <Field boolean _hasArgs>
		_valueInstantiator = factorybasedenumdeserializer._valueInstantiator;
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:getfield        #43  <Field ValueInstantiator _valueInstantiator>
	//   19   37:putfield        #43  <Field ValueInstantiator _valueInstantiator>
		_creatorProps = factorybasedenumdeserializer._creatorProps;
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:getfield        #45  <Field SettableBeanProperty[] _creatorProps>
	//   23   45:putfield        #45  <Field SettableBeanProperty[] _creatorProps>
		_deser = jsondeserializer;
	//   24   48:aload_0         
	//   25   49:aload_2         
	//   26   50:putfield        #47  <Field JsonDeserializer _deser>
	//   27   53:return          
	}

	public FactoryBasedEnumDeserializer(Class class1, AnnotatedMethod annotatedmethod)
	{
		super(class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #35  <Method void StdDeserializer(Class)>
		_factory = annotatedmethod;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #39  <Field AnnotatedMethod _factory>
		_hasArgs = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #41  <Field boolean _hasArgs>
		_inputType = null;
	//    9   15:aload_0         
	//   10   16:aconst_null     
	//   11   17:putfield        #37  <Field JavaType _inputType>
		_deser = null;
	//   12   20:aload_0         
	//   13   21:aconst_null     
	//   14   22:putfield        #47  <Field JsonDeserializer _deser>
		_valueInstantiator = null;
	//   15   25:aload_0         
	//   16   26:aconst_null     
	//   17   27:putfield        #43  <Field ValueInstantiator _valueInstantiator>
		_creatorProps = null;
	//   18   30:aload_0         
	//   19   31:aconst_null     
	//   20   32:putfield        #45  <Field SettableBeanProperty[] _creatorProps>
	//   21   35:return          
	}

	public FactoryBasedEnumDeserializer(Class class1, AnnotatedMethod annotatedmethod, JavaType javatype, ValueInstantiator valueinstantiator, SettableBeanProperty asettablebeanproperty[])
	{
		super(class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #35  <Method void StdDeserializer(Class)>
		_factory = annotatedmethod;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #39  <Field AnnotatedMethod _factory>
		_hasArgs = true;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #41  <Field boolean _hasArgs>
		class1 = ((Class) (javatype));
	//    9   15:aload_3         
	//   10   16:astore_1        
		if(javatype.hasRawClass(java/lang/String))
	//*  11   17:aload_3         
	//*  12   18:ldc1            #55  <Class String>
	//*  13   20:invokevirtual   #61  <Method boolean JavaType.hasRawClass(Class)>
	//*  14   23:ifeq            28
			class1 = null;
	//   15   26:aconst_null     
	//   16   27:astore_1        
		_inputType = ((JavaType) (class1));
	//   17   28:aload_0         
	//   18   29:aload_1         
	//   19   30:putfield        #37  <Field JavaType _inputType>
		_deser = null;
	//   20   33:aload_0         
	//   21   34:aconst_null     
	//   22   35:putfield        #47  <Field JsonDeserializer _deser>
		_valueInstantiator = valueinstantiator;
	//   23   38:aload_0         
	//   24   39:aload           4
	//   25   41:putfield        #43  <Field ValueInstantiator _valueInstantiator>
		_creatorProps = asettablebeanproperty;
	//   26   44:aload_0         
	//   27   45:aload           5
	//   28   47:putfield        #45  <Field SettableBeanProperty[] _creatorProps>
	//   29   50:return          
	}

	private Throwable throwOrReturnThrowable(Throwable throwable, DeserializationContext deserializationcontext)
		throws IOException
	{
		throwable = ClassUtil.getRootCause(throwable);
	//    0    0:aload_1         
	//    1    1:invokestatic    #72  <Method Throwable ClassUtil.getRootCause(Throwable)>
	//    2    4:astore_1        
		ClassUtil.throwIfError(throwable);
	//    3    5:aload_1         
	//    4    6:invokestatic    #75  <Method Throwable ClassUtil.throwIfError(Throwable)>
	//    5    9:pop             
		boolean flag;
		if(deserializationcontext != null && !deserializationcontext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS))
	//*   6   10:aload_2         
	//*   7   11:ifnull          32
	//*   8   14:aload_2         
	//*   9   15:getstatic       #81  <Field DeserializationFeature DeserializationFeature.WRAP_EXCEPTIONS>
	//*  10   18:invokevirtual   #87  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  11   21:ifeq            27
	//*  12   24:goto            32
			flag = false;
	//   13   27:iconst_0        
	//   14   28:istore_3        
		else
	//*  15   29:goto            34
			flag = true;
	//   16   32:iconst_1        
	//   17   33:istore_3        
		if(throwable instanceof IOException)
	//*  18   34:aload_1         
	//*  19   35:instanceof      #66  <Class IOException>
	//*  20   38:ifeq            59
			if(flag && (throwable instanceof JsonProcessingException))
	//*  21   41:iload_3         
	//*  22   42:ifeq            54
	//*  23   45:aload_1         
	//*  24   46:instanceof      #89  <Class JsonProcessingException>
	//*  25   49:ifeq            54
				return throwable;
	//   26   52:aload_1         
	//   27   53:areturn         
			else
				throw (IOException)throwable;
	//   28   54:aload_1         
	//   29   55:checkcast       #66  <Class IOException>
	//   30   58:athrow          
		if(!flag)
	//*  31   59:iload_3         
	//*  32   60:ifne            68
			ClassUtil.throwIfRTE(throwable);
	//   33   63:aload_1         
	//   34   64:invokestatic    #92  <Method Throwable ClassUtil.throwIfRTE(Throwable)>
	//   35   67:pop             
		return throwable;
	//   36   68:aload_1         
	//   37   69:areturn         
	}

	protected final Object _deserializeWithErrorWrapping(JsonParser jsonparser, DeserializationContext deserializationcontext, SettableBeanProperty settablebeanproperty)
		throws IOException
	{
		try
		{
			jsonparser = ((JsonParser) (settablebeanproperty.deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #103 <Method Object SettableBeanProperty.deserialize(JsonParser, DeserializationContext)>
	//    4    6:astore_1        
		}
	//*   5    7:aload_1         
	//*   6    8:areturn         
		// Misplaced declaration of an exception variable
		catch(JsonParser jsonparser)
	//*   7    9:astore_1        
		{
			return wrapAndThrow(((Throwable) (jsonparser)), ((Object) (handledType())), settablebeanproperty.getName(), deserializationcontext);
	//    8   10:aload_0         
	//    9   11:aload_1         
	//   10   12:aload_0         
	//   11   13:invokevirtual   #107 <Method Class handledType()>
	//   12   16:aload_3         
	//   13   17:invokevirtual   #111 <Method String SettableBeanProperty.getName()>
	//   14   20:aload_2         
	//   15   21:invokevirtual   #115 <Method Object wrapAndThrow(Throwable, Object, String, DeserializationContext)>
	//   16   24:areturn         
		}
		return ((Object) (jsonparser));
	}

	public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
		throws JsonMappingException
	{
		if(_deser == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field JsonDeserializer _deser>
	//*   2    4:ifnonnull       38
		{
			JavaType javatype = _inputType;
	//    3    7:aload_0         
	//    4    8:getfield        #37  <Field JavaType _inputType>
	//    5   11:astore_3        
			if(javatype != null && _creatorProps == null)
	//*   6   12:aload_3         
	//*   7   13:ifnull          38
	//*   8   16:aload_0         
	//*   9   17:getfield        #45  <Field SettableBeanProperty[] _creatorProps>
	//*  10   20:ifnonnull       38
				return ((JsonDeserializer) (new FactoryBasedEnumDeserializer(this, deserializationcontext.findContextualValueDeserializer(javatype, beanproperty))));
	//   11   23:new             #2   <Class FactoryBasedEnumDeserializer>
	//   12   26:dup             
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:aload_3         
	//   16   30:aload_2         
	//   17   31:invokevirtual   #123 <Method JsonDeserializer DeserializationContext.findContextualValueDeserializer(JavaType, BeanProperty)>
	//   18   34:invokespecial   #125 <Method void FactoryBasedEnumDeserializer(FactoryBasedEnumDeserializer, JsonDeserializer)>
	//   19   37:areturn         
		}
		return ((JsonDeserializer) (this));
	//   20   38:aload_0         
	//   21   39:areturn         
	}

	public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
label0:
		{
			Object obj = ((Object) (_deser));
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field JsonDeserializer _deser>
	//    2    4:astore_3        
			if(obj != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          19
			{
				jsonparser = ((JsonParser) (((JsonDeserializer) (obj)).deserialize(jsonparser, deserializationcontext)));
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #129 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//    9   15:astore_1        
			} else
	//*  10   16:goto            121
			{
				if(!_hasArgs)
					break label0;
	//   11   19:aload_0         
	//   12   20:getfield        #41  <Field boolean _hasArgs>
	//   13   23:ifeq            179
				obj = ((Object) (jsonparser.getCurrentToken()));
	//   14   26:aload_1         
	//   15   27:invokevirtual   #135 <Method JsonToken JsonParser.getCurrentToken()>
	//   16   30:astore_3        
				if(obj != JsonToken.VALUE_STRING && obj != JsonToken.FIELD_NAME)
	//*  17   31:aload_3         
	//*  18   32:getstatic       #141 <Field JsonToken JsonToken.VALUE_STRING>
	//*  19   35:if_acmpeq       116
	//*  20   38:aload_3         
	//*  21   39:getstatic       #144 <Field JsonToken JsonToken.FIELD_NAME>
	//*  22   42:if_acmpne       48
	//*  23   45:goto            116
				{
					if(_creatorProps != null && jsonparser.isExpectedStartObjectToken())
	//*  24   48:aload_0         
	//*  25   49:getfield        #45  <Field SettableBeanProperty[] _creatorProps>
	//*  26   52:ifnull          108
	//*  27   55:aload_1         
	//*  28   56:invokevirtual   #148 <Method boolean JsonParser.isExpectedStartObjectToken()>
	//*  29   59:ifeq            108
					{
						if(_propCreator == null)
	//*  30   62:aload_0         
	//*  31   63:getfield        #150 <Field PropertyBasedCreator _propCreator>
	//*  32   66:ifnonnull       92
							_propCreator = PropertyBasedCreator.construct(deserializationcontext, _valueInstantiator, _creatorProps, deserializationcontext.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
	//   33   69:aload_0         
	//   34   70:aload_2         
	//   35   71:aload_0         
	//   36   72:getfield        #43  <Field ValueInstantiator _valueInstantiator>
	//   37   75:aload_0         
	//   38   76:getfield        #45  <Field SettableBeanProperty[] _creatorProps>
	//   39   79:aload_2         
	//   40   80:getstatic       #156 <Field MapperFeature MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES>
	//   41   83:invokevirtual   #159 <Method boolean DeserializationContext.isEnabled(MapperFeature)>
	//   42   86:invokestatic    #165 <Method PropertyBasedCreator PropertyBasedCreator.construct(DeserializationContext, ValueInstantiator, SettableBeanProperty[], boolean)>
	//   43   89:putfield        #150 <Field PropertyBasedCreator _propCreator>
						jsonparser.nextToken();
	//   44   92:aload_1         
	//   45   93:invokevirtual   #168 <Method JsonToken JsonParser.nextToken()>
	//   46   96:pop             
						return deserializeEnumUsingPropertyBased(jsonparser, deserializationcontext, _propCreator);
	//   47   97:aload_0         
	//   48   98:aload_1         
	//   49   99:aload_2         
	//   50  100:aload_0         
	//   51  101:getfield        #150 <Field PropertyBasedCreator _propCreator>
	//   52  104:invokevirtual   #172 <Method Object deserializeEnumUsingPropertyBased(JsonParser, DeserializationContext, PropertyBasedCreator)>
	//   53  107:areturn         
					}
					jsonparser = ((JsonParser) (jsonparser.getValueAsString()));
	//   54  108:aload_1         
	//   55  109:invokevirtual   #175 <Method String JsonParser.getValueAsString()>
	//   56  112:astore_1        
				} else
	//*  57  113:goto            121
				{
					jsonparser = ((JsonParser) (jsonparser.getText()));
	//   58  116:aload_1         
	//   59  117:invokevirtual   #178 <Method String JsonParser.getText()>
	//   60  120:astore_1        
				}
			}
			try
			{
				obj = _factory.callOnWith(((Object) (_valueClass)), new Object[] {
					jsonparser
				});
	//   61  121:aload_0         
	//   62  122:getfield        #39  <Field AnnotatedMethod _factory>
	//   63  125:aload_0         
	//   64  126:getfield        #32  <Field Class _valueClass>
	//   65  129:iconst_1        
	//   66  130:anewarray       Object[]
	//   67  133:dup             
	//   68  134:iconst_0        
	//   69  135:aload_1         
	//   70  136:aastore         
	//   71  137:invokevirtual   #186 <Method Object AnnotatedMethod.callOnWith(Object, Object[])>
	//   72  140:astore_3        
			}
	//*  73  141:aload_3         
	//*  74  142:areturn         
			catch(Exception exception)
	//*  75  143:astore_3        
			{
				Throwable throwable = ClassUtil.throwRootCauseIfIOE(((Throwable) (exception)));
	//   76  144:aload_3         
	//   77  145:invokestatic    #189 <Method Throwable ClassUtil.throwRootCauseIfIOE(Throwable)>
	//   78  148:astore_3        
				if(deserializationcontext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL) && (throwable instanceof IllegalArgumentException))
	//*  79  149:aload_2         
	//*  80  150:getstatic       #192 <Field DeserializationFeature DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL>
	//*  81  153:invokevirtual   #87  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  82  156:ifeq            168
	//*  83  159:aload_3         
	//*  84  160:instanceof      #194 <Class IllegalArgumentException>
	//*  85  163:ifeq            168
					return ((Object) (null));
	//   86  166:aconst_null     
	//   87  167:areturn         
				else
					return deserializationcontext.handleInstantiationProblem(_valueClass, ((Object) (jsonparser)), throwable);
	//   88  168:aload_2         
	//   89  169:aload_0         
	//   90  170:getfield        #32  <Field Class _valueClass>
	//   91  173:aload_1         
	//   92  174:aload_3         
	//   93  175:invokevirtual   #198 <Method Object DeserializationContext.handleInstantiationProblem(Class, Object, Throwable)>
	//   94  178:areturn         
			}
			return obj;
		}
		jsonparser.skipChildren();
	//   95  179:aload_1         
	//   96  180:invokevirtual   #202 <Method JsonParser JsonParser.skipChildren()>
	//   97  183:pop             
		try
		{
			jsonparser = ((JsonParser) (_factory.call()));
	//   98  184:aload_0         
	//   99  185:getfield        #39  <Field AnnotatedMethod _factory>
	//  100  188:invokevirtual   #206 <Method Object AnnotatedMethod.call()>
	//  101  191:astore_1        
		}
	//* 102  192:aload_1         
	//* 103  193:areturn         
		// Misplaced declaration of an exception variable
		catch(JsonParser jsonparser)
	//* 104  194:astore_1        
		{
			jsonparser = ((JsonParser) (ClassUtil.throwRootCauseIfIOE(((Throwable) (jsonparser)))));
	//  105  195:aload_1         
	//  106  196:invokestatic    #189 <Method Throwable ClassUtil.throwRootCauseIfIOE(Throwable)>
	//  107  199:astore_1        
			return deserializationcontext.handleInstantiationProblem(_valueClass, ((Object) (null)), ((Throwable) (jsonparser)));
	//  108  200:aload_2         
	//  109  201:aload_0         
	//  110  202:getfield        #32  <Field Class _valueClass>
	//  111  205:aconst_null     
	//  112  206:aload_1         
	//  113  207:invokevirtual   #198 <Method Object DeserializationContext.handleInstantiationProblem(Class, Object, Throwable)>
	//  114  210:areturn         
		}
		return ((Object) (jsonparser));
	}

	protected Object deserializeEnumUsingPropertyBased(JsonParser jsonparser, DeserializationContext deserializationcontext, PropertyBasedCreator propertybasedcreator)
		throws IOException
	{
		PropertyValueBuffer propertyvaluebuffer = propertybasedcreator.startBuilding(jsonparser, deserializationcontext, ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader) (null)));
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #210 <Method PropertyValueBuffer PropertyBasedCreator.startBuilding(JsonParser, DeserializationContext, com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)>
	//    5    7:astore          5
		for(Object obj = ((Object) (jsonparser.getCurrentToken())); obj == JsonToken.FIELD_NAME; obj = ((Object) (jsonparser.nextToken())))
	//*   6    9:aload_1         
	//*   7   10:invokevirtual   #135 <Method JsonToken JsonParser.getCurrentToken()>
	//*   8   13:astore          4
	//*   9   15:aload           4
	//*  10   17:getstatic       #144 <Field JsonToken JsonToken.FIELD_NAME>
	//*  11   20:if_acmpne       83
		{
			obj = ((Object) (jsonparser.getCurrentName()));
	//   12   23:aload_1         
	//   13   24:invokevirtual   #213 <Method String JsonParser.getCurrentName()>
	//   14   27:astore          4
			jsonparser.nextToken();
	//   15   29:aload_1         
	//   16   30:invokevirtual   #168 <Method JsonToken JsonParser.nextToken()>
	//   17   33:pop             
			SettableBeanProperty settablebeanproperty = propertybasedcreator.findCreatorProperty(((String) (obj)));
	//   18   34:aload_3         
	//   19   35:aload           4
	//   20   37:invokevirtual   #217 <Method SettableBeanProperty PropertyBasedCreator.findCreatorProperty(String)>
	//   21   40:astore          6
			if(settablebeanproperty != null)
	//*  22   42:aload           6
	//*  23   44:ifnull          66
				propertyvaluebuffer.assignParameter(settablebeanproperty, _deserializeWithErrorWrapping(jsonparser, deserializationcontext, settablebeanproperty));
	//   24   47:aload           5
	//   25   49:aload           6
	//   26   51:aload_0         
	//   27   52:aload_1         
	//   28   53:aload_2         
	//   29   54:aload           6
	//   30   56:invokevirtual   #219 <Method Object _deserializeWithErrorWrapping(JsonParser, DeserializationContext, SettableBeanProperty)>
	//   31   59:invokevirtual   #225 <Method boolean PropertyValueBuffer.assignParameter(SettableBeanProperty, Object)>
	//   32   62:pop             
			else
	//*  33   63:goto            74
				propertyvaluebuffer.readIdProperty(((String) (obj)));
	//   34   66:aload           5
	//   35   68:aload           4
	//   36   70:invokevirtual   #229 <Method boolean PropertyValueBuffer.readIdProperty(String)>
	//   37   73:pop             
		}

	//   38   74:aload_1         
	//   39   75:invokevirtual   #168 <Method JsonToken JsonParser.nextToken()>
	//   40   78:astore          4
	//*  41   80:goto            15
		return propertybasedcreator.build(deserializationcontext, propertyvaluebuffer);
	//   42   83:aload_3         
	//   43   84:aload_2         
	//   44   85:aload           5
	//   45   87:invokevirtual   #233 <Method Object PropertyBasedCreator.build(DeserializationContext, PropertyValueBuffer)>
	//   46   90:areturn         
	}

	public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		if(_deser == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field JsonDeserializer _deser>
	//*   2    4:ifnonnull       14
			return deserialize(jsonparser, deserializationcontext);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #236 <Method Object deserialize(JsonParser, DeserializationContext)>
	//    7   13:areturn         
		else
			return typedeserializer.deserializeTypedFromAny(jsonparser, deserializationcontext);
	//    8   14:aload_3         
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokevirtual   #241 <Method Object TypeDeserializer.deserializeTypedFromAny(JsonParser, DeserializationContext)>
	//   12   20:areturn         
	}

	public Boolean supportsUpdate(DeserializationConfig deserializationconfig)
	{
		return Boolean.FALSE;
	//    0    0:getstatic       #249 <Field Boolean Boolean.FALSE>
	//    1    3:areturn         
	}

	protected Object wrapAndThrow(Throwable throwable, Object obj, String s, DeserializationContext deserializationcontext)
		throws IOException
	{
		throw JsonMappingException.wrapWithPath(throwOrReturnThrowable(throwable, deserializationcontext), obj, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload           4
	//    3    4:invokespecial   #251 <Method Throwable throwOrReturnThrowable(Throwable, DeserializationContext)>
	//    4    7:aload_2         
	//    5    8:aload_3         
	//    6    9:invokestatic    #255 <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, String)>
	//    7   12:athrow          
	}

	private static final long serialVersionUID = 1L;
	protected final SettableBeanProperty _creatorProps[];
	protected final JsonDeserializer _deser;
	protected final AnnotatedMethod _factory;
	protected final boolean _hasArgs;
	protected final JavaType _inputType;
	private transient PropertyBasedCreator _propCreator;
	protected final ValueInstantiator _valueInstantiator;
}
