// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.*;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Set;

// Referenced classes of package com.fasterxml.jackson.databind.deser.impl:
//			PropertyBasedCreator, PropertyValueBuffer, BeanPropertyMap, ObjectIdReader

public class BeanAsArrayBuilderDeserializer extends BeanDeserializerBase
{

	public BeanAsArrayBuilderDeserializer(BeanDeserializerBase beandeserializerbase, JavaType javatype, SettableBeanProperty asettablebeanproperty[], AnnotatedMethod annotatedmethod)
	{
		super(beandeserializerbase);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #21  <Method void BeanDeserializerBase(BeanDeserializerBase)>
		_delegate = beandeserializerbase;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #23  <Field BeanDeserializerBase _delegate>
		_targetType = javatype;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #25  <Field JavaType _targetType>
		_orderedProperties = asettablebeanproperty;
	//    9   15:aload_0         
	//   10   16:aload_3         
	//   11   17:putfield        #27  <Field SettableBeanProperty[] _orderedProperties>
		_buildMethod = annotatedmethod;
	//   12   20:aload_0         
	//   13   21:aload           4
	//   14   23:putfield        #29  <Field AnnotatedMethod _buildMethod>
	//   15   26:return          
	}

	protected Object _deserializeFromNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return deserializationcontext.handleUnexpectedToken(handledType(), jsonparser.getCurrentToken(), jsonparser, "Cannot deserialize a POJO (of type %s) from non-Array representation (token: %s): type/property designed to be serialized as JSON Array", new Object[] {
			_beanType.getRawClass().getName(), jsonparser.getCurrentToken()
		});
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #38  <Method Class handledType()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #44  <Method JsonToken JsonParser.getCurrentToken()>
	//    5    9:aload_1         
	//    6   10:ldc1            #46  <String "Cannot deserialize a POJO (of type %s) from non-Array representation (token: %s): type/property designed to be serialized as JSON Array">
	//    7   12:iconst_2        
	//    8   13:anewarray       Object[]
	//    9   16:dup             
	//   10   17:iconst_0        
	//   11   18:aload_0         
	//   12   19:getfield        #51  <Field JavaType _beanType>
	//   13   22:invokevirtual   #56  <Method Class JavaType.getRawClass()>
	//   14   25:invokevirtual   #62  <Method String Class.getName()>
	//   15   28:aastore         
	//   16   29:dup             
	//   17   30:iconst_1        
	//   18   31:aload_1         
	//   19   32:invokevirtual   #44  <Method JsonToken JsonParser.getCurrentToken()>
	//   20   35:aastore         
	//   21   36:invokevirtual   #68  <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonToken, JsonParser, String, Object[])>
	//   22   39:areturn         
	}

	protected Object _deserializeNonVanilla(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(_nonStandardCreation)
	//*   0    0:aload_0         
	//*   1    1:getfield        #76  <Field boolean _nonStandardCreation>
	//*   2    4:ifeq            14
			return deserializeFromObjectUsingNonDefault(jsonparser, deserializationcontext);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #79  <Method Object deserializeFromObjectUsingNonDefault(JsonParser, DeserializationContext)>
	//    7   13:areturn         
		Object obj = _valueInstantiator.createUsingDefault(deserializationcontext);
	//    8   14:aload_0         
	//    9   15:getfield        #83  <Field ValueInstantiator _valueInstantiator>
	//   10   18:aload_2         
	//   11   19:invokevirtual   #89  <Method Object ValueInstantiator.createUsingDefault(DeserializationContext)>
	//   12   22:astore          6
		if(_injectables != null)
	//*  13   24:aload_0         
	//*  14   25:getfield        #93  <Field ValueInjector[] _injectables>
	//*  15   28:ifnull          38
			injectValues(deserializationcontext, obj);
	//   16   31:aload_0         
	//   17   32:aload_2         
	//   18   33:aload           6
	//   19   35:invokevirtual   #97  <Method void injectValues(DeserializationContext, Object)>
		Class class1;
		if(_needViewProcesing)
	//*  20   38:aload_0         
	//*  21   39:getfield        #100 <Field boolean _needViewProcesing>
	//*  22   42:ifeq            54
			class1 = deserializationcontext.getActiveView();
	//   23   45:aload_2         
	//   24   46:invokevirtual   #103 <Method Class DeserializationContext.getActiveView()>
	//   25   49:astore          5
		else
	//*  26   51:goto            57
			class1 = null;
	//   27   54:aconst_null     
	//   28   55:astore          5
		SettableBeanProperty asettablebeanproperty[] = _orderedProperties;
	//   29   57:aload_0         
	//   30   58:getfield        #27  <Field SettableBeanProperty[] _orderedProperties>
	//   31   61:astore          7
		int j = asettablebeanproperty.length;
	//   32   63:aload           7
	//   33   65:arraylength     
	//   34   66:istore          4
		int i = 0;
	//   35   68:iconst_0        
	//   36   69:istore_3        
		do
		{
			if(jsonparser.nextToken() == JsonToken.END_ARRAY)
	//*  37   70:aload_1         
	//*  38   71:invokevirtual   #106 <Method JsonToken JsonParser.nextToken()>
	//*  39   74:getstatic       #112 <Field JsonToken JsonToken.END_ARRAY>
	//*  40   77:if_acmpne       83
				return obj;
	//   41   80:aload           6
	//   42   82:areturn         
			if(i == j)
	//*  43   83:iload_3         
	//*  44   84:iload           4
	//*  45   86:icmpne          149
			{
				if(!_ignoreAllUnknown && deserializationcontext.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES))
	//*  46   89:aload_0         
	//*  47   90:getfield        #115 <Field boolean _ignoreAllUnknown>
	//*  48   93:ifne            128
	//*  49   96:aload_2         
	//*  50   97:getstatic       #121 <Field DeserializationFeature DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES>
	//*  51  100:invokevirtual   #125 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  52  103:ifeq            128
					deserializationcontext.reportWrongTokenException(((JsonDeserializer) (this)), JsonToken.END_ARRAY, "Unexpected JSON value(s); expected at most %d properties (in JSON Array)", new Object[] {
						Integer.valueOf(j)
					});
	//   53  106:aload_2         
	//   54  107:aload_0         
	//   55  108:getstatic       #112 <Field JsonToken JsonToken.END_ARRAY>
	//   56  111:ldc1            #127 <String "Unexpected JSON value(s); expected at most %d properties (in JSON Array)">
	//   57  113:iconst_1        
	//   58  114:anewarray       Object[]
	//   59  117:dup             
	//   60  118:iconst_0        
	//   61  119:iload           4
	//   62  121:invokestatic    #133 <Method Integer Integer.valueOf(int)>
	//   63  124:aastore         
	//   64  125:invokevirtual   #137 <Method void DeserializationContext.reportWrongTokenException(JsonDeserializer, JsonToken, String, Object[])>
				for(; jsonparser.nextToken() != JsonToken.END_ARRAY; jsonparser.skipChildren());
	//   65  128:aload_1         
	//   66  129:invokevirtual   #106 <Method JsonToken JsonParser.nextToken()>
	//   67  132:getstatic       #112 <Field JsonToken JsonToken.END_ARRAY>
	//   68  135:if_acmpeq       146
	//   69  138:aload_1         
	//   70  139:invokevirtual   #141 <Method JsonParser JsonParser.skipChildren()>
	//   71  142:pop             
	//*  72  143:goto            128
				return obj;
	//   73  146:aload           6
	//   74  148:areturn         
			}
			SettableBeanProperty settablebeanproperty = asettablebeanproperty[i];
	//   75  149:aload           7
	//   76  151:iload_3         
	//   77  152:aaload          
	//   78  153:astore          8
			i++;
	//   79  155:iload_3         
	//   80  156:iconst_1        
	//   81  157:iadd            
	//   82  158:istore_3        
			if(settablebeanproperty != null && (class1 == null || settablebeanproperty.visibleInView(class1)))
	//*  83  159:aload           8
	//*  84  161:ifnull          211
	//*  85  164:aload           5
	//*  86  166:ifnull          179
	//*  87  169:aload           8
	//*  88  171:aload           5
	//*  89  173:invokevirtual   #147 <Method boolean SettableBeanProperty.visibleInView(Class)>
	//*  90  176:ifeq            211
				try
				{
					settablebeanproperty.deserializeSetAndReturn(jsonparser, deserializationcontext, obj);
	//   91  179:aload           8
	//   92  181:aload_1         
	//   93  182:aload_2         
	//   94  183:aload           6
	//   95  185:invokevirtual   #151 <Method Object SettableBeanProperty.deserializeSetAndReturn(JsonParser, DeserializationContext, Object)>
	//   96  188:pop             
				}
	//*  97  189:goto            70
				catch(Exception exception)
	//*  98  192:astore          9
				{
					wrapAndThrow(((Throwable) (exception)), obj, settablebeanproperty.getName(), deserializationcontext);
	//   99  194:aload_0         
	//  100  195:aload           9
	//  101  197:aload           6
	//  102  199:aload           8
	//  103  201:invokevirtual   #152 <Method String SettableBeanProperty.getName()>
	//  104  204:aload_2         
	//  105  205:invokevirtual   #156 <Method void wrapAndThrow(Throwable, Object, String, DeserializationContext)>
				}
			else
	//* 106  208:goto            70
				jsonparser.skipChildren();
	//  107  211:aload_1         
	//  108  212:invokevirtual   #141 <Method JsonParser JsonParser.skipChildren()>
	//  109  215:pop             
		} while(true);
	//  110  216:goto            70
	}

	protected final Object _deserializeUsingPropertyBased(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		PropertyBasedCreator propertybasedcreator = _propertyBasedCreator;
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field PropertyBasedCreator _propertyBasedCreator>
	//    2    4:astore          9
		PropertyValueBuffer propertyvaluebuffer = propertybasedcreator.startBuilding(jsonparser, deserializationcontext, _objectIdReader);
	//    3    6:aload           9
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_0         
	//    7   11:getfield        #165 <Field ObjectIdReader _objectIdReader>
	//    8   14:invokevirtual   #171 <Method PropertyValueBuffer PropertyBasedCreator.startBuilding(JsonParser, DeserializationContext, ObjectIdReader)>
	//    9   17:astore          10
		SettableBeanProperty asettablebeanproperty[] = _orderedProperties;
	//   10   19:aload_0         
	//   11   20:getfield        #27  <Field SettableBeanProperty[] _orderedProperties>
	//   12   23:astore          11
		int j = asettablebeanproperty.length;
	//   13   25:aload           11
	//   14   27:arraylength     
	//   15   28:istore          4
		Class class1;
		if(_needViewProcesing)
	//*  16   30:aload_0         
	//*  17   31:getfield        #100 <Field boolean _needViewProcesing>
	//*  18   34:ifeq            46
			class1 = deserializationcontext.getActiveView();
	//   19   37:aload_2         
	//   20   38:invokevirtual   #103 <Method Class DeserializationContext.getActiveView()>
	//   21   41:astore          6
		else
	//*  22   43:goto            49
			class1 = null;
	//   23   46:aconst_null     
	//   24   47:astore          6
		Object obj1 = null;
	//   25   49:aconst_null     
	//   26   50:astore          7
		int i = 0;
	//   27   52:iconst_0        
	//   28   53:istore_3        
		while(jsonparser.nextToken() != JsonToken.END_ARRAY) 
	//*  29   54:aload_1         
	//*  30   55:invokevirtual   #106 <Method JsonToken JsonParser.nextToken()>
	//*  31   58:getstatic       #112 <Field JsonToken JsonToken.END_ARRAY>
	//*  32   61:if_acmpeq       356
		{
			Object obj;
label0:
			{
				if(i < j)
	//*  33   64:iload_3         
	//*  34   65:iload           4
	//*  35   67:icmpge          79
					obj = ((Object) (asettablebeanproperty[i]));
	//   36   70:aload           11
	//   37   72:iload_3         
	//   38   73:aaload          
	//   39   74:astore          5
				else
	//*  40   76:goto            82
					obj = null;
	//   41   79:aconst_null     
	//   42   80:astore          5
				if(obj == null)
	//*  43   82:aload           5
	//*  44   84:ifnonnull       99
				{
					jsonparser.skipChildren();
	//   45   87:aload_1         
	//   46   88:invokevirtual   #141 <Method JsonParser JsonParser.skipChildren()>
	//   47   91:pop             
					obj = obj1;
	//   48   92:aload           7
	//   49   94:astore          5
					break label0;
	//   50   96:goto            345
				}
				if(class1 != null && !((SettableBeanProperty) (obj)).visibleInView(class1))
	//*  51   99:aload           6
	//*  52  101:ifnull          126
	//*  53  104:aload           5
	//*  54  106:aload           6
	//*  55  108:invokevirtual   #147 <Method boolean SettableBeanProperty.visibleInView(Class)>
	//*  56  111:ifne            126
				{
					jsonparser.skipChildren();
	//   57  114:aload_1         
	//   58  115:invokevirtual   #141 <Method JsonParser JsonParser.skipChildren()>
	//   59  118:pop             
					obj = obj1;
	//   60  119:aload           7
	//   61  121:astore          5
					break label0;
	//   62  123:goto            345
				}
				if(obj1 != null)
	//*  63  126:aload           7
	//*  64  128:ifnull          172
				{
					Object obj2;
					try
					{
						obj2 = ((SettableBeanProperty) (obj)).deserializeSetAndReturn(jsonparser, deserializationcontext, obj1);
	//   65  131:aload           5
	//   66  133:aload_1         
	//   67  134:aload_2         
	//   68  135:aload           7
	//   69  137:invokevirtual   #151 <Method Object SettableBeanProperty.deserializeSetAndReturn(JsonParser, DeserializationContext, Object)>
	//   70  140:astore          8
					}
	//*  71  142:aload           8
	//*  72  144:astore          5
	//*  73  146:goto            345
					catch(Exception exception)
	//*  74  149:astore          8
					{
						wrapAndThrow(((Throwable) (exception)), obj1, ((SettableBeanProperty) (obj)).getName(), deserializationcontext);
	//   75  151:aload_0         
	//   76  152:aload           8
	//   77  154:aload           7
	//   78  156:aload           5
	//   79  158:invokevirtual   #152 <Method String SettableBeanProperty.getName()>
	//   80  161:aload_2         
	//   81  162:invokevirtual   #156 <Method void wrapAndThrow(Throwable, Object, String, DeserializationContext)>
						obj = obj1;
	//   82  165:aload           7
	//   83  167:astore          5
						break label0;
	//   84  169:goto            345
					}
					obj = obj2;
					break label0;
				}
				String s = ((SettableBeanProperty) (obj)).getName();
	//   85  172:aload           5
	//   86  174:invokevirtual   #152 <Method String SettableBeanProperty.getName()>
	//   87  177:astore          12
				Object obj3 = ((Object) (propertybasedcreator.findCreatorProperty(s)));
	//   88  179:aload           9
	//   89  181:aload           12
	//   90  183:invokevirtual   #175 <Method SettableBeanProperty PropertyBasedCreator.findCreatorProperty(String)>
	//   91  186:astore          8
				if(obj3 != null)
	//*  92  188:aload           8
	//*  93  190:ifnull          310
				{
					obj = obj1;
	//   94  193:aload           7
	//   95  195:astore          5
					if(!propertyvaluebuffer.assignParameter(((SettableBeanProperty) (obj3)), ((SettableBeanProperty) (obj3)).deserialize(jsonparser, deserializationcontext)))
						break label0;
	//   96  197:aload           10
	//   97  199:aload           8
	//   98  201:aload           8
	//   99  203:aload_1         
	//  100  204:aload_2         
	//  101  205:invokevirtual   #178 <Method Object SettableBeanProperty.deserialize(JsonParser, DeserializationContext)>
	//  102  208:invokevirtual   #184 <Method boolean PropertyValueBuffer.assignParameter(SettableBeanProperty, Object)>
	//  103  211:ifeq            345
					try
					{
						obj3 = propertybasedcreator.build(deserializationcontext, propertyvaluebuffer);
	//  104  214:aload           9
	//  105  216:aload_2         
	//  106  217:aload           10
	//  107  219:invokevirtual   #188 <Method Object PropertyBasedCreator.build(DeserializationContext, PropertyValueBuffer)>
	//  108  222:astore          8
					}
	//* 109  224:aload           8
	//* 110  226:astore          5
	//* 111  228:aload           8
	//* 112  230:invokevirtual   #191 <Method Class Object.getClass()>
	//* 113  233:aload_0         
	//* 114  234:getfield        #51  <Field JavaType _beanType>
	//* 115  237:invokevirtual   #56  <Method Class JavaType.getRawClass()>
	//* 116  240:if_acmpeq       345
	//* 117  243:aload_2         
	//* 118  244:aload_0         
	//* 119  245:getfield        #51  <Field JavaType _beanType>
	//* 120  248:ldc1            #193 <String "Cannot support implicit polymorphic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s">
	//* 121  250:iconst_2        
	//* 122  251:anewarray       Object[]
	//* 123  254:dup             
	//* 124  255:iconst_0        
	//* 125  256:aload_0         
	//* 126  257:getfield        #51  <Field JavaType _beanType>
	//* 127  260:invokevirtual   #56  <Method Class JavaType.getRawClass()>
	//* 128  263:invokevirtual   #62  <Method String Class.getName()>
	//* 129  266:aastore         
	//* 130  267:dup             
	//* 131  268:iconst_1        
	//* 132  269:aload           8
	//* 133  271:invokevirtual   #191 <Method Class Object.getClass()>
	//* 134  274:invokevirtual   #62  <Method String Class.getName()>
	//* 135  277:aastore         
	//* 136  278:invokestatic    #199 <Method String String.format(String, Object[])>
	//* 137  281:invokevirtual   #203 <Method Object DeserializationContext.reportBadDefinition(JavaType, String)>
	//* 138  284:areturn         
					// Misplaced declaration of an exception variable
					catch(Object obj)
	//* 139  285:astore          5
					{
						wrapAndThrow(((Throwable) (obj)), ((Object) (_beanType.getRawClass())), s, deserializationcontext);
	//  140  287:aload_0         
	//  141  288:aload           5
	//  142  290:aload_0         
	//  143  291:getfield        #51  <Field JavaType _beanType>
	//  144  294:invokevirtual   #56  <Method Class JavaType.getRawClass()>
	//  145  297:aload           12
	//  146  299:aload_2         
	//  147  300:invokevirtual   #156 <Method void wrapAndThrow(Throwable, Object, String, DeserializationContext)>
						obj = obj1;
	//  148  303:aload           7
	//  149  305:astore          5
						break label0;
	//  150  307:goto            345
					}
					obj = obj3;
					if(obj3.getClass() != _beanType.getRawClass())
						return deserializationcontext.reportBadDefinition(_beanType, String.format("Cannot support implicit polymorphic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s", new Object[] {
							_beanType.getRawClass().getName(), obj3.getClass().getName()
						}));
					break label0;
				}
				if(propertyvaluebuffer.readIdProperty(s))
	//* 151  310:aload           10
	//* 152  312:aload           12
	//* 153  314:invokevirtual   #207 <Method boolean PropertyValueBuffer.readIdProperty(String)>
	//* 154  317:ifeq            327
				{
					obj = obj1;
	//  155  320:aload           7
	//  156  322:astore          5
				} else
	//* 157  324:goto            345
				{
					propertyvaluebuffer.bufferProperty(((SettableBeanProperty) (obj)), ((SettableBeanProperty) (obj)).deserialize(jsonparser, deserializationcontext));
	//  158  327:aload           10
	//  159  329:aload           5
	//  160  331:aload           5
	//  161  333:aload_1         
	//  162  334:aload_2         
	//  163  335:invokevirtual   #178 <Method Object SettableBeanProperty.deserialize(JsonParser, DeserializationContext)>
	//  164  338:invokevirtual   #211 <Method void PropertyValueBuffer.bufferProperty(SettableBeanProperty, Object)>
					obj = obj1;
	//  165  341:aload           7
	//  166  343:astore          5
				}
			}
			i++;
	//  167  345:iload_3         
	//  168  346:iconst_1        
	//  169  347:iadd            
	//  170  348:istore_3        
			obj1 = obj;
	//  171  349:aload           5
	//  172  351:astore          7
		}
	//* 173  353:goto            54
		if(obj1 == null)
	//* 174  356:aload           7
	//* 175  358:ifnonnull       380
		{
			try
			{
				jsonparser = ((JsonParser) (propertybasedcreator.build(deserializationcontext, propertyvaluebuffer)));
	//  176  361:aload           9
	//  177  363:aload_2         
	//  178  364:aload           10
	//  179  366:invokevirtual   #188 <Method Object PropertyBasedCreator.build(DeserializationContext, PropertyValueBuffer)>
	//  180  369:astore_1        
			}
	//* 181  370:aload_1         
	//* 182  371:areturn         
			// Misplaced declaration of an exception variable
			catch(JsonParser jsonparser)
	//* 183  372:astore_1        
			{
				return wrapInstantiationProblem(((Throwable) (jsonparser)), deserializationcontext);
	//  184  373:aload_0         
	//  185  374:aload_1         
	//  186  375:aload_2         
	//  187  376:invokevirtual   #215 <Method Object wrapInstantiationProblem(Throwable, DeserializationContext)>
	//  188  379:areturn         
			}
			return ((Object) (jsonparser));
		} else
		{
			return obj1;
	//  189  380:aload           7
	//  190  382:areturn         
		}
	}

	protected BeanDeserializerBase asArrayDeserializer()
	{
		return ((BeanDeserializerBase) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(!jsonparser.isExpectedStartArrayToken())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #221 <Method boolean JsonParser.isExpectedStartArrayToken()>
	//*   2    4:ifne            19
			return finishBuild(deserializationcontext, _deserializeFromNonArray(jsonparser, deserializationcontext));
	//    3    7:aload_0         
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #223 <Method Object _deserializeFromNonArray(JsonParser, DeserializationContext)>
	//    9   15:invokevirtual   #227 <Method Object finishBuild(DeserializationContext, Object)>
	//   10   18:areturn         
		if(!_vanillaProcessing)
	//*  11   19:aload_0         
	//*  12   20:getfield        #230 <Field boolean _vanillaProcessing>
	//*  13   23:ifne            38
			return finishBuild(deserializationcontext, _deserializeNonVanilla(jsonparser, deserializationcontext));
	//   14   26:aload_0         
	//   15   27:aload_2         
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:aload_2         
	//   19   31:invokevirtual   #232 <Method Object _deserializeNonVanilla(JsonParser, DeserializationContext)>
	//   20   34:invokevirtual   #227 <Method Object finishBuild(DeserializationContext, Object)>
	//   21   37:areturn         
		Object obj = _valueInstantiator.createUsingDefault(deserializationcontext);
	//   22   38:aload_0         
	//   23   39:getfield        #83  <Field ValueInstantiator _valueInstantiator>
	//   24   42:aload_2         
	//   25   43:invokevirtual   #89  <Method Object ValueInstantiator.createUsingDefault(DeserializationContext)>
	//   26   46:astore          5
		SettableBeanProperty asettablebeanproperty[] = _orderedProperties;
	//   27   48:aload_0         
	//   28   49:getfield        #27  <Field SettableBeanProperty[] _orderedProperties>
	//   29   52:astore          7
		int j = asettablebeanproperty.length;
	//   30   54:aload           7
	//   31   56:arraylength     
	//   32   57:istore          4
		int i = 0;
	//   33   59:iconst_0        
	//   34   60:istore_3        
		do
		{
label0:
			{
				if(jsonparser.nextToken() == JsonToken.END_ARRAY)
	//*  35   61:aload_1         
	//*  36   62:invokevirtual   #106 <Method JsonToken JsonParser.nextToken()>
	//*  37   65:getstatic       #112 <Field JsonToken JsonToken.END_ARRAY>
	//*  38   68:if_acmpne       79
					return finishBuild(deserializationcontext, obj);
	//   39   71:aload_0         
	//   40   72:aload_2         
	//   41   73:aload           5
	//   42   75:invokevirtual   #227 <Method Object finishBuild(DeserializationContext, Object)>
	//   43   78:areturn         
				if(i == j)
	//*  44   79:iload_3         
	//*  45   80:iload           4
	//*  46   82:icmpne          151
				{
					if(!_ignoreAllUnknown && deserializationcontext.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES))
	//*  47   85:aload_0         
	//*  48   86:getfield        #115 <Field boolean _ignoreAllUnknown>
	//*  49   89:ifne            125
	//*  50   92:aload_2         
	//*  51   93:getstatic       #121 <Field DeserializationFeature DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES>
	//*  52   96:invokevirtual   #125 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  53   99:ifeq            125
						deserializationcontext.reportInputMismatch(handledType(), "Unexpected JSON values; expected at most %d properties (in JSON Array)", new Object[] {
							Integer.valueOf(j)
						});
	//   54  102:aload_2         
	//   55  103:aload_0         
	//   56  104:invokevirtual   #38  <Method Class handledType()>
	//   57  107:ldc1            #234 <String "Unexpected JSON values; expected at most %d properties (in JSON Array)">
	//   58  109:iconst_1        
	//   59  110:anewarray       Object[]
	//   60  113:dup             
	//   61  114:iconst_0        
	//   62  115:iload           4
	//   63  117:invokestatic    #133 <Method Integer Integer.valueOf(int)>
	//   64  120:aastore         
	//   65  121:invokevirtual   #238 <Method Object DeserializationContext.reportInputMismatch(Class, String, Object[])>
	//   66  124:pop             
					for(; jsonparser.nextToken() != JsonToken.END_ARRAY; jsonparser.skipChildren());
	//   67  125:aload_1         
	//   68  126:invokevirtual   #106 <Method JsonToken JsonParser.nextToken()>
	//   69  129:getstatic       #112 <Field JsonToken JsonToken.END_ARRAY>
	//   70  132:if_acmpeq       143
	//   71  135:aload_1         
	//   72  136:invokevirtual   #141 <Method JsonParser JsonParser.skipChildren()>
	//   73  139:pop             
	//*  74  140:goto            125
					return finishBuild(deserializationcontext, obj);
	//   75  143:aload_0         
	//   76  144:aload_2         
	//   77  145:aload           5
	//   78  147:invokevirtual   #227 <Method Object finishBuild(DeserializationContext, Object)>
	//   79  150:areturn         
				}
				SettableBeanProperty settablebeanproperty = asettablebeanproperty[i];
	//   80  151:aload           7
	//   81  153:iload_3         
	//   82  154:aaload          
	//   83  155:astore          8
				if(settablebeanproperty != null)
	//*  84  157:aload           8
	//*  85  159:ifnull          199
				{
					Object obj1;
					try
					{
						obj1 = settablebeanproperty.deserializeSetAndReturn(jsonparser, deserializationcontext, obj);
	//   86  162:aload           8
	//   87  164:aload_1         
	//   88  165:aload_2         
	//   89  166:aload           5
	//   90  168:invokevirtual   #151 <Method Object SettableBeanProperty.deserializeSetAndReturn(JsonParser, DeserializationContext, Object)>
	//   91  171:astore          6
					}
	//*  92  173:aload           6
	//*  93  175:astore          5
	//*  94  177:goto            204
					catch(Exception exception)
	//*  95  180:astore          6
					{
						wrapAndThrow(((Throwable) (exception)), obj, settablebeanproperty.getName(), deserializationcontext);
	//   96  182:aload_0         
	//   97  183:aload           6
	//   98  185:aload           5
	//   99  187:aload           8
	//  100  189:invokevirtual   #152 <Method String SettableBeanProperty.getName()>
	//  101  192:aload_2         
	//  102  193:invokevirtual   #156 <Method void wrapAndThrow(Throwable, Object, String, DeserializationContext)>
						break label0;
	//  103  196:goto            204
					}
					obj = obj1;
					break label0;
				}
				jsonparser.skipChildren();
	//  104  199:aload_1         
	//  105  200:invokevirtual   #141 <Method JsonParser JsonParser.skipChildren()>
	//  106  203:pop             
			}
			i++;
	//  107  204:iload_3         
	//  108  205:iconst_1        
	//  109  206:iadd            
	//  110  207:istore_3        
		} while(true);
	//  111  208:goto            61
	}

	public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		return _delegate.deserialize(jsonparser, deserializationcontext, obj);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field BeanDeserializerBase _delegate>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #240 <Method Object BeanDeserializerBase.deserialize(JsonParser, DeserializationContext, Object)>
	//    6   10:areturn         
	}

	public Object deserializeFromObject(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return _deserializeFromNonArray(jsonparser, deserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #223 <Method Object _deserializeFromNonArray(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	protected final Object finishBuild(DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		try
		{
			obj = _buildMethod.getMember().invoke(obj, (Object[])null);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field AnnotatedMethod _buildMethod>
	//    2    4:invokevirtual   #247 <Method Method AnnotatedMethod.getMember()>
	//    3    7:aload_2         
	//    4    8:aconst_null     
	//    5    9:checkcast       #249 <Class Object[]>
	//    6   12:invokevirtual   #255 <Method Object Method.invoke(Object, Object[])>
	//    7   15:astore_2        
		}
	//*   8   16:aload_2         
	//*   9   17:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  10   18:astore_2        
		{
			return wrapInstantiationProblem(((Throwable) (obj)), deserializationcontext);
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:aload_1         
	//   14   22:invokevirtual   #215 <Method Object wrapInstantiationProblem(Throwable, DeserializationContext)>
	//   15   25:areturn         
		}
		return obj;
	}

	public Boolean supportsUpdate(DeserializationConfig deserializationconfig)
	{
		return Boolean.FALSE;
	//    0    0:getstatic       #263 <Field Boolean Boolean.FALSE>
	//    1    3:areturn         
	}

	public JsonDeserializer unwrappingDeserializer(NameTransformer nametransformer)
	{
		return _delegate.unwrappingDeserializer(nametransformer);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field BeanDeserializerBase _delegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #267 <Method JsonDeserializer BeanDeserializerBase.unwrappingDeserializer(NameTransformer)>
	//    4    8:areturn         
	}

	public BeanDeserializerBase withBeanProperties(BeanPropertyMap beanpropertymap)
	{
		return ((BeanDeserializerBase) (new BeanAsArrayBuilderDeserializer(_delegate.withBeanProperties(beanpropertymap), _targetType, _orderedProperties, _buildMethod)));
	//    0    0:new             #2   <Class BeanAsArrayBuilderDeserializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field BeanDeserializerBase _delegate>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #273 <Method BeanDeserializerBase BeanDeserializerBase.withBeanProperties(BeanPropertyMap)>
	//    6   12:aload_0         
	//    7   13:getfield        #25  <Field JavaType _targetType>
	//    8   16:aload_0         
	//    9   17:getfield        #27  <Field SettableBeanProperty[] _orderedProperties>
	//   10   20:aload_0         
	//   11   21:getfield        #29  <Field AnnotatedMethod _buildMethod>
	//   12   24:invokespecial   #275 <Method void BeanAsArrayBuilderDeserializer(BeanDeserializerBase, JavaType, SettableBeanProperty[], AnnotatedMethod)>
	//   13   27:areturn         
	}

	public BeanDeserializerBase withIgnorableProperties(Set set)
	{
		return ((BeanDeserializerBase) (new BeanAsArrayBuilderDeserializer(_delegate.withIgnorableProperties(set), _targetType, _orderedProperties, _buildMethod)));
	//    0    0:new             #2   <Class BeanAsArrayBuilderDeserializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field BeanDeserializerBase _delegate>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #279 <Method BeanDeserializerBase BeanDeserializerBase.withIgnorableProperties(Set)>
	//    6   12:aload_0         
	//    7   13:getfield        #25  <Field JavaType _targetType>
	//    8   16:aload_0         
	//    9   17:getfield        #27  <Field SettableBeanProperty[] _orderedProperties>
	//   10   20:aload_0         
	//   11   21:getfield        #29  <Field AnnotatedMethod _buildMethod>
	//   12   24:invokespecial   #275 <Method void BeanAsArrayBuilderDeserializer(BeanDeserializerBase, JavaType, SettableBeanProperty[], AnnotatedMethod)>
	//   13   27:areturn         
	}

	public BeanDeserializerBase withObjectIdReader(ObjectIdReader objectidreader)
	{
		return ((BeanDeserializerBase) (new BeanAsArrayBuilderDeserializer(_delegate.withObjectIdReader(objectidreader), _targetType, _orderedProperties, _buildMethod)));
	//    0    0:new             #2   <Class BeanAsArrayBuilderDeserializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field BeanDeserializerBase _delegate>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #284 <Method BeanDeserializerBase BeanDeserializerBase.withObjectIdReader(ObjectIdReader)>
	//    6   12:aload_0         
	//    7   13:getfield        #25  <Field JavaType _targetType>
	//    8   16:aload_0         
	//    9   17:getfield        #27  <Field SettableBeanProperty[] _orderedProperties>
	//   10   20:aload_0         
	//   11   21:getfield        #29  <Field AnnotatedMethod _buildMethod>
	//   12   24:invokespecial   #275 <Method void BeanAsArrayBuilderDeserializer(BeanDeserializerBase, JavaType, SettableBeanProperty[], AnnotatedMethod)>
	//   13   27:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final AnnotatedMethod _buildMethod;
	protected final BeanDeserializerBase _delegate;
	protected final SettableBeanProperty _orderedProperties[];
	protected final JavaType _targetType;
}
