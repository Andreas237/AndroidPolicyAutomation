// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.*;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.Set;

// Referenced classes of package com.fasterxml.jackson.databind.deser.impl:
//			PropertyBasedCreator, PropertyValueBuffer, BeanPropertyMap, ObjectIdReader

public class BeanAsArrayDeserializer extends BeanDeserializerBase
{

	public BeanAsArrayDeserializer(BeanDeserializerBase beandeserializerbase, SettableBeanProperty asettablebeanproperty[])
	{
		super(beandeserializerbase);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #17  <Method void BeanDeserializerBase(BeanDeserializerBase)>
		_delegate = beandeserializerbase;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #19  <Field BeanDeserializerBase _delegate>
		_orderedProperties = asettablebeanproperty;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #21  <Field SettableBeanProperty[] _orderedProperties>
	//    9   15:return          
	}

	protected Object _deserializeFromNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return deserializationcontext.handleUnexpectedToken(handledType(), jsonparser.getCurrentToken(), jsonparser, "Cannot deserialize a POJO (of type %s) from non-Array representation (token: %s): type/property designed to be serialized as JSON Array", new Object[] {
			_beanType.getRawClass().getName(), jsonparser.getCurrentToken()
		});
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #30  <Method Class handledType()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #36  <Method JsonToken JsonParser.getCurrentToken()>
	//    5    9:aload_1         
	//    6   10:ldc1            #38  <String "Cannot deserialize a POJO (of type %s) from non-Array representation (token: %s): type/property designed to be serialized as JSON Array">
	//    7   12:iconst_2        
	//    8   13:anewarray       Object[]
	//    9   16:dup             
	//   10   17:iconst_0        
	//   11   18:aload_0         
	//   12   19:getfield        #44  <Field JavaType _beanType>
	//   13   22:invokevirtual   #49  <Method Class JavaType.getRawClass()>
	//   14   25:invokevirtual   #55  <Method String Class.getName()>
	//   15   28:aastore         
	//   16   29:dup             
	//   17   30:iconst_1        
	//   18   31:aload_1         
	//   19   32:invokevirtual   #36  <Method JsonToken JsonParser.getCurrentToken()>
	//   20   35:aastore         
	//   21   36:invokevirtual   #61  <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonToken, JsonParser, String, Object[])>
	//   22   39:areturn         
	}

	protected Object _deserializeNonVanilla(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(_nonStandardCreation)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field boolean _nonStandardCreation>
	//*   2    4:ifeq            14
			return deserializeFromObjectUsingNonDefault(jsonparser, deserializationcontext);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #72  <Method Object deserializeFromObjectUsingNonDefault(JsonParser, DeserializationContext)>
	//    7   13:areturn         
		Object obj = _valueInstantiator.createUsingDefault(deserializationcontext);
	//    8   14:aload_0         
	//    9   15:getfield        #76  <Field ValueInstantiator _valueInstantiator>
	//   10   18:aload_2         
	//   11   19:invokevirtual   #82  <Method Object ValueInstantiator.createUsingDefault(DeserializationContext)>
	//   12   22:astore          6
		jsonparser.setCurrentValue(obj);
	//   13   24:aload_1         
	//   14   25:aload           6
	//   15   27:invokevirtual   #86  <Method void JsonParser.setCurrentValue(Object)>
		if(_injectables != null)
	//*  16   30:aload_0         
	//*  17   31:getfield        #90  <Field ValueInjector[] _injectables>
	//*  18   34:ifnull          44
			injectValues(deserializationcontext, obj);
	//   19   37:aload_0         
	//   20   38:aload_2         
	//   21   39:aload           6
	//   22   41:invokevirtual   #94  <Method void injectValues(DeserializationContext, Object)>
		Class class1;
		if(_needViewProcesing)
	//*  23   44:aload_0         
	//*  24   45:getfield        #97  <Field boolean _needViewProcesing>
	//*  25   48:ifeq            60
			class1 = deserializationcontext.getActiveView();
	//   26   51:aload_2         
	//   27   52:invokevirtual   #100 <Method Class DeserializationContext.getActiveView()>
	//   28   55:astore          5
		else
	//*  29   57:goto            63
			class1 = null;
	//   30   60:aconst_null     
	//   31   61:astore          5
		SettableBeanProperty asettablebeanproperty[] = _orderedProperties;
	//   32   63:aload_0         
	//   33   64:getfield        #21  <Field SettableBeanProperty[] _orderedProperties>
	//   34   67:astore          7
		int j = asettablebeanproperty.length;
	//   35   69:aload           7
	//   36   71:arraylength     
	//   37   72:istore          4
		int i = 0;
	//   38   74:iconst_0        
	//   39   75:istore_3        
		do
		{
			if(jsonparser.nextToken() == JsonToken.END_ARRAY)
	//*  40   76:aload_1         
	//*  41   77:invokevirtual   #103 <Method JsonToken JsonParser.nextToken()>
	//*  42   80:getstatic       #109 <Field JsonToken JsonToken.END_ARRAY>
	//*  43   83:if_acmpne       89
				return obj;
	//   44   86:aload           6
	//   45   88:areturn         
			if(i == j)
	//*  46   89:iload_3         
	//*  47   90:iload           4
	//*  48   92:icmpne          142
			{
				if(!_ignoreAllUnknown)
	//*  49   95:aload_0         
	//*  50   96:getfield        #112 <Field boolean _ignoreAllUnknown>
	//*  51   99:ifne            124
					deserializationcontext.reportWrongTokenException(((JsonDeserializer) (this)), JsonToken.END_ARRAY, "Unexpected JSON values; expected at most %d properties (in JSON Array)", new Object[] {
						Integer.valueOf(j)
					});
	//   52  102:aload_2         
	//   53  103:aload_0         
	//   54  104:getstatic       #109 <Field JsonToken JsonToken.END_ARRAY>
	//   55  107:ldc1            #114 <String "Unexpected JSON values; expected at most %d properties (in JSON Array)">
	//   56  109:iconst_1        
	//   57  110:anewarray       Object[]
	//   58  113:dup             
	//   59  114:iconst_0        
	//   60  115:iload           4
	//   61  117:invokestatic    #120 <Method Integer Integer.valueOf(int)>
	//   62  120:aastore         
	//   63  121:invokevirtual   #124 <Method void DeserializationContext.reportWrongTokenException(JsonDeserializer, JsonToken, String, Object[])>
				do
					jsonparser.skipChildren();
	//   64  124:aload_1         
	//   65  125:invokevirtual   #128 <Method JsonParser JsonParser.skipChildren()>
	//   66  128:pop             
				while(jsonparser.nextToken() != JsonToken.END_ARRAY);
	//   67  129:aload_1         
	//   68  130:invokevirtual   #103 <Method JsonToken JsonParser.nextToken()>
	//   69  133:getstatic       #109 <Field JsonToken JsonToken.END_ARRAY>
	//   70  136:if_acmpne       124
				return obj;
	//   71  139:aload           6
	//   72  141:areturn         
			}
			SettableBeanProperty settablebeanproperty = asettablebeanproperty[i];
	//   73  142:aload           7
	//   74  144:iload_3         
	//   75  145:aaload          
	//   76  146:astore          8
			i++;
	//   77  148:iload_3         
	//   78  149:iconst_1        
	//   79  150:iadd            
	//   80  151:istore_3        
			if(settablebeanproperty != null && (class1 == null || settablebeanproperty.visibleInView(class1)))
	//*  81  152:aload           8
	//*  82  154:ifnull          203
	//*  83  157:aload           5
	//*  84  159:ifnull          172
	//*  85  162:aload           8
	//*  86  164:aload           5
	//*  87  166:invokevirtual   #134 <Method boolean SettableBeanProperty.visibleInView(Class)>
	//*  88  169:ifeq            203
				try
				{
					settablebeanproperty.deserializeAndSet(jsonparser, deserializationcontext, obj);
	//   89  172:aload           8
	//   90  174:aload_1         
	//   91  175:aload_2         
	//   92  176:aload           6
	//   93  178:invokevirtual   #138 <Method void SettableBeanProperty.deserializeAndSet(JsonParser, DeserializationContext, Object)>
				}
	//*  94  181:goto            76
				catch(Exception exception)
	//*  95  184:astore          9
				{
					wrapAndThrow(((Throwable) (exception)), obj, settablebeanproperty.getName(), deserializationcontext);
	//   96  186:aload_0         
	//   97  187:aload           9
	//   98  189:aload           6
	//   99  191:aload           8
	//  100  193:invokevirtual   #139 <Method String SettableBeanProperty.getName()>
	//  101  196:aload_2         
	//  102  197:invokevirtual   #143 <Method void wrapAndThrow(Throwable, Object, String, DeserializationContext)>
				}
			else
	//* 103  200:goto            76
				jsonparser.skipChildren();
	//  104  203:aload_1         
	//  105  204:invokevirtual   #128 <Method JsonParser JsonParser.skipChildren()>
	//  106  207:pop             
		} while(true);
	//  107  208:goto            76
	}

	protected final Object _deserializeUsingPropertyBased(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		PropertyBasedCreator propertybasedcreator = _propertyBasedCreator;
	//    0    0:aload_0         
	//    1    1:getfield        #148 <Field PropertyBasedCreator _propertyBasedCreator>
	//    2    4:astore          8
		PropertyValueBuffer propertyvaluebuffer = propertybasedcreator.startBuilding(jsonparser, deserializationcontext, _objectIdReader);
	//    3    6:aload           8
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_0         
	//    7   11:getfield        #152 <Field ObjectIdReader _objectIdReader>
	//    8   14:invokevirtual   #158 <Method PropertyValueBuffer PropertyBasedCreator.startBuilding(JsonParser, DeserializationContext, ObjectIdReader)>
	//    9   17:astore          9
		SettableBeanProperty asettablebeanproperty[] = _orderedProperties;
	//   10   19:aload_0         
	//   11   20:getfield        #21  <Field SettableBeanProperty[] _orderedProperties>
	//   12   23:astore          10
		int j = asettablebeanproperty.length;
	//   13   25:aload           10
	//   14   27:arraylength     
	//   15   28:istore          4
		Class class1;
		if(_needViewProcesing)
	//*  16   30:aload_0         
	//*  17   31:getfield        #97  <Field boolean _needViewProcesing>
	//*  18   34:ifeq            46
			class1 = deserializationcontext.getActiveView();
	//   19   37:aload_2         
	//   20   38:invokevirtual   #100 <Method Class DeserializationContext.getActiveView()>
	//   21   41:astore          5
		else
	//*  22   43:goto            49
			class1 = null;
	//   23   46:aconst_null     
	//   24   47:astore          5
		Object obj = null;
	//   25   49:aconst_null     
	//   26   50:astore          6
		int i = 0;
	//   27   52:iconst_0        
	//   28   53:istore_3        
		while(jsonparser.nextToken() != JsonToken.END_ARRAY) 
	//*  29   54:aload_1         
	//*  30   55:invokevirtual   #103 <Method JsonToken JsonParser.nextToken()>
	//*  31   58:getstatic       #109 <Field JsonToken JsonToken.END_ARRAY>
	//*  32   61:if_acmpeq       359
		{
			Object obj1;
label0:
			{
				if(i < j)
	//*  33   64:iload_3         
	//*  34   65:iload           4
	//*  35   67:icmpge          79
					obj1 = ((Object) (asettablebeanproperty[i]));
	//   36   70:aload           10
	//   37   72:iload_3         
	//   38   73:aaload          
	//   39   74:astore          7
				else
	//*  40   76:goto            82
					obj1 = null;
	//   41   79:aconst_null     
	//   42   80:astore          7
				if(obj1 == null)
	//*  43   82:aload           7
	//*  44   84:ifnonnull       99
				{
					jsonparser.skipChildren();
	//   45   87:aload_1         
	//   46   88:invokevirtual   #128 <Method JsonParser JsonParser.skipChildren()>
	//   47   91:pop             
					obj1 = obj;
	//   48   92:aload           6
	//   49   94:astore          7
					break label0;
	//   50   96:goto            348
				}
				if(class1 != null && !((SettableBeanProperty) (obj1)).visibleInView(class1))
	//*  51   99:aload           5
	//*  52  101:ifnull          126
	//*  53  104:aload           7
	//*  54  106:aload           5
	//*  55  108:invokevirtual   #134 <Method boolean SettableBeanProperty.visibleInView(Class)>
	//*  56  111:ifne            126
				{
					jsonparser.skipChildren();
	//   57  114:aload_1         
	//   58  115:invokevirtual   #128 <Method JsonParser JsonParser.skipChildren()>
	//   59  118:pop             
					obj1 = obj;
	//   60  119:aload           6
	//   61  121:astore          7
					break label0;
	//   62  123:goto            348
				}
				if(obj != null)
	//*  63  126:aload           6
	//*  64  128:ifnull          170
				{
					try
					{
						((SettableBeanProperty) (obj1)).deserializeAndSet(jsonparser, deserializationcontext, obj);
	//   65  131:aload           7
	//   66  133:aload_1         
	//   67  134:aload_2         
	//   68  135:aload           6
	//   69  137:invokevirtual   #138 <Method void SettableBeanProperty.deserializeAndSet(JsonParser, DeserializationContext, Object)>
					}
	//*  70  140:aload           6
	//*  71  142:astore          7
	//*  72  144:goto            348
					catch(Exception exception)
	//*  73  147:astore          11
					{
						wrapAndThrow(((Throwable) (exception)), obj, ((SettableBeanProperty) (obj1)).getName(), deserializationcontext);
	//   74  149:aload_0         
	//   75  150:aload           11
	//   76  152:aload           6
	//   77  154:aload           7
	//   78  156:invokevirtual   #139 <Method String SettableBeanProperty.getName()>
	//   79  159:aload_2         
	//   80  160:invokevirtual   #143 <Method void wrapAndThrow(Throwable, Object, String, DeserializationContext)>
						obj1 = obj;
	//   81  163:aload           6
	//   82  165:astore          7
						break label0;
	//   83  167:goto            348
					}
					obj1 = obj;
					break label0;
				}
				String s = ((SettableBeanProperty) (obj1)).getName();
	//   84  170:aload           7
	//   85  172:invokevirtual   #139 <Method String SettableBeanProperty.getName()>
	//   86  175:astore          11
				SettableBeanProperty settablebeanproperty = propertybasedcreator.findCreatorProperty(s);
	//   87  177:aload           8
	//   88  179:aload           11
	//   89  181:invokevirtual   #162 <Method SettableBeanProperty PropertyBasedCreator.findCreatorProperty(String)>
	//   90  184:astore          12
				if(settablebeanproperty != null)
	//*  91  186:aload           12
	//*  92  188:ifnull          313
				{
					obj1 = obj;
	//   93  191:aload           6
	//   94  193:astore          7
					if(!propertyvaluebuffer.assignParameter(settablebeanproperty, settablebeanproperty.deserialize(jsonparser, deserializationcontext)))
						break label0;
	//   95  195:aload           9
	//   96  197:aload           12
	//   97  199:aload           12
	//   98  201:aload_1         
	//   99  202:aload_2         
	//  100  203:invokevirtual   #165 <Method Object SettableBeanProperty.deserialize(JsonParser, DeserializationContext)>
	//  101  206:invokevirtual   #171 <Method boolean PropertyValueBuffer.assignParameter(SettableBeanProperty, Object)>
	//  102  209:ifeq            348
					try
					{
						obj1 = propertybasedcreator.build(deserializationcontext, propertyvaluebuffer);
	//  103  212:aload           8
	//  104  214:aload_2         
	//  105  215:aload           9
	//  106  217:invokevirtual   #175 <Method Object PropertyBasedCreator.build(DeserializationContext, PropertyValueBuffer)>
	//  107  220:astore          7
					}
	//* 108  222:aload_1         
	//* 109  223:aload           7
	//* 110  225:invokevirtual   #86  <Method void JsonParser.setCurrentValue(Object)>
	//* 111  228:aload           7
	//* 112  230:invokevirtual   #178 <Method Class Object.getClass()>
	//* 113  233:aload_0         
	//* 114  234:getfield        #44  <Field JavaType _beanType>
	//* 115  237:invokevirtual   #49  <Method Class JavaType.getRawClass()>
	//* 116  240:if_acmpeq       285
	//* 117  243:aload_2         
	//* 118  244:aload_0         
	//* 119  245:getfield        #44  <Field JavaType _beanType>
	//* 120  248:ldc1            #180 <String "Cannot support implicit polymorphic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s">
	//* 121  250:iconst_2        
	//* 122  251:anewarray       Object[]
	//* 123  254:dup             
	//* 124  255:iconst_0        
	//* 125  256:aload_0         
	//* 126  257:getfield        #44  <Field JavaType _beanType>
	//* 127  260:invokevirtual   #49  <Method Class JavaType.getRawClass()>
	//* 128  263:invokevirtual   #55  <Method String Class.getName()>
	//* 129  266:aastore         
	//* 130  267:dup             
	//* 131  268:iconst_1        
	//* 132  269:aload           7
	//* 133  271:invokevirtual   #178 <Method Class Object.getClass()>
	//* 134  274:invokevirtual   #55  <Method String Class.getName()>
	//* 135  277:aastore         
	//* 136  278:invokestatic    #186 <Method String String.format(String, Object[])>
	//* 137  281:invokevirtual   #190 <Method Object DeserializationContext.reportBadDefinition(JavaType, String)>
	//* 138  284:pop             
	//* 139  285:goto            348
					// Misplaced declaration of an exception variable
					catch(Object obj1)
	//* 140  288:astore          7
					{
						wrapAndThrow(((Throwable) (obj1)), ((Object) (_beanType.getRawClass())), s, deserializationcontext);
	//  141  290:aload_0         
	//  142  291:aload           7
	//  143  293:aload_0         
	//  144  294:getfield        #44  <Field JavaType _beanType>
	//  145  297:invokevirtual   #49  <Method Class JavaType.getRawClass()>
	//  146  300:aload           11
	//  147  302:aload_2         
	//  148  303:invokevirtual   #143 <Method void wrapAndThrow(Throwable, Object, String, DeserializationContext)>
						obj1 = obj;
	//  149  306:aload           6
	//  150  308:astore          7
						break label0;
	//  151  310:goto            348
					}
					jsonparser.setCurrentValue(obj1);
					if(obj1.getClass() != _beanType.getRawClass())
						deserializationcontext.reportBadDefinition(_beanType, String.format("Cannot support implicit polymorphic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s", new Object[] {
							_beanType.getRawClass().getName(), obj1.getClass().getName()
						}));
					break label0;
				}
				if(propertyvaluebuffer.readIdProperty(s))
	//* 152  313:aload           9
	//* 153  315:aload           11
	//* 154  317:invokevirtual   #194 <Method boolean PropertyValueBuffer.readIdProperty(String)>
	//* 155  320:ifeq            330
				{
					obj1 = obj;
	//  156  323:aload           6
	//  157  325:astore          7
				} else
	//* 158  327:goto            348
				{
					propertyvaluebuffer.bufferProperty(((SettableBeanProperty) (obj1)), ((SettableBeanProperty) (obj1)).deserialize(jsonparser, deserializationcontext));
	//  159  330:aload           9
	//  160  332:aload           7
	//  161  334:aload           7
	//  162  336:aload_1         
	//  163  337:aload_2         
	//  164  338:invokevirtual   #165 <Method Object SettableBeanProperty.deserialize(JsonParser, DeserializationContext)>
	//  165  341:invokevirtual   #198 <Method void PropertyValueBuffer.bufferProperty(SettableBeanProperty, Object)>
					obj1 = obj;
	//  166  344:aload           6
	//  167  346:astore          7
				}
			}
			i++;
	//  168  348:iload_3         
	//  169  349:iconst_1        
	//  170  350:iadd            
	//  171  351:istore_3        
			obj = obj1;
	//  172  352:aload           7
	//  173  354:astore          6
		}
	//* 174  356:goto            54
		if(obj == null)
	//* 175  359:aload           6
	//* 176  361:ifnonnull       383
		{
			try
			{
				jsonparser = ((JsonParser) (propertybasedcreator.build(deserializationcontext, propertyvaluebuffer)));
	//  177  364:aload           8
	//  178  366:aload_2         
	//  179  367:aload           9
	//  180  369:invokevirtual   #175 <Method Object PropertyBasedCreator.build(DeserializationContext, PropertyValueBuffer)>
	//  181  372:astore_1        
			}
	//* 182  373:aload_1         
	//* 183  374:areturn         
			// Misplaced declaration of an exception variable
			catch(JsonParser jsonparser)
	//* 184  375:astore_1        
			{
				return wrapInstantiationProblem(((Throwable) (jsonparser)), deserializationcontext);
	//  185  376:aload_0         
	//  186  377:aload_1         
	//  187  378:aload_2         
	//  188  379:invokevirtual   #202 <Method Object wrapInstantiationProblem(Throwable, DeserializationContext)>
	//  189  382:areturn         
			}
			return ((Object) (jsonparser));
		} else
		{
			return obj;
	//  190  383:aload           6
	//  191  385:areturn         
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
	//*   1    1:invokevirtual   #208 <Method boolean JsonParser.isExpectedStartArrayToken()>
	//*   2    4:ifne            14
			return _deserializeFromNonArray(jsonparser, deserializationcontext);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #210 <Method Object _deserializeFromNonArray(JsonParser, DeserializationContext)>
	//    7   13:areturn         
		if(!_vanillaProcessing)
	//*   8   14:aload_0         
	//*   9   15:getfield        #213 <Field boolean _vanillaProcessing>
	//*  10   18:ifne            28
			return _deserializeNonVanilla(jsonparser, deserializationcontext);
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:aload_2         
	//   14   24:invokevirtual   #215 <Method Object _deserializeNonVanilla(JsonParser, DeserializationContext)>
	//   15   27:areturn         
		Object obj = _valueInstantiator.createUsingDefault(deserializationcontext);
	//   16   28:aload_0         
	//   17   29:getfield        #76  <Field ValueInstantiator _valueInstantiator>
	//   18   32:aload_2         
	//   19   33:invokevirtual   #82  <Method Object ValueInstantiator.createUsingDefault(DeserializationContext)>
	//   20   36:astore          5
		jsonparser.setCurrentValue(obj);
	//   21   38:aload_1         
	//   22   39:aload           5
	//   23   41:invokevirtual   #86  <Method void JsonParser.setCurrentValue(Object)>
		SettableBeanProperty asettablebeanproperty[] = _orderedProperties;
	//   24   44:aload_0         
	//   25   45:getfield        #21  <Field SettableBeanProperty[] _orderedProperties>
	//   26   48:astore          6
		int j = asettablebeanproperty.length;
	//   27   50:aload           6
	//   28   52:arraylength     
	//   29   53:istore          4
		int i = 0;
	//   30   55:iconst_0        
	//   31   56:istore_3        
		do
		{
			if(jsonparser.nextToken() == JsonToken.END_ARRAY)
	//*  32   57:aload_1         
	//*  33   58:invokevirtual   #103 <Method JsonToken JsonParser.nextToken()>
	//*  34   61:getstatic       #109 <Field JsonToken JsonToken.END_ARRAY>
	//*  35   64:if_acmpne       70
				return obj;
	//   36   67:aload           5
	//   37   69:areturn         
			if(i == j)
	//*  38   70:iload_3         
	//*  39   71:iload           4
	//*  40   73:icmpne          133
			{
				if(!_ignoreAllUnknown && deserializationcontext.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES))
	//*  41   76:aload_0         
	//*  42   77:getfield        #112 <Field boolean _ignoreAllUnknown>
	//*  43   80:ifne            115
	//*  44   83:aload_2         
	//*  45   84:getstatic       #221 <Field DeserializationFeature DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES>
	//*  46   87:invokevirtual   #225 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  47   90:ifeq            115
					deserializationcontext.reportWrongTokenException(((JsonDeserializer) (this)), JsonToken.END_ARRAY, "Unexpected JSON values; expected at most %d properties (in JSON Array)", new Object[] {
						Integer.valueOf(j)
					});
	//   48   93:aload_2         
	//   49   94:aload_0         
	//   50   95:getstatic       #109 <Field JsonToken JsonToken.END_ARRAY>
	//   51   98:ldc1            #114 <String "Unexpected JSON values; expected at most %d properties (in JSON Array)">
	//   52  100:iconst_1        
	//   53  101:anewarray       Object[]
	//   54  104:dup             
	//   55  105:iconst_0        
	//   56  106:iload           4
	//   57  108:invokestatic    #120 <Method Integer Integer.valueOf(int)>
	//   58  111:aastore         
	//   59  112:invokevirtual   #124 <Method void DeserializationContext.reportWrongTokenException(JsonDeserializer, JsonToken, String, Object[])>
				do
					jsonparser.skipChildren();
	//   60  115:aload_1         
	//   61  116:invokevirtual   #128 <Method JsonParser JsonParser.skipChildren()>
	//   62  119:pop             
				while(jsonparser.nextToken() != JsonToken.END_ARRAY);
	//   63  120:aload_1         
	//   64  121:invokevirtual   #103 <Method JsonToken JsonParser.nextToken()>
	//   65  124:getstatic       #109 <Field JsonToken JsonToken.END_ARRAY>
	//   66  127:if_acmpne       115
				return obj;
	//   67  130:aload           5
	//   68  132:areturn         
			}
			SettableBeanProperty settablebeanproperty = asettablebeanproperty[i];
	//   69  133:aload           6
	//   70  135:iload_3         
	//   71  136:aaload          
	//   72  137:astore          7
			if(settablebeanproperty != null)
	//*  73  139:aload           7
	//*  74  141:ifnull          175
				try
				{
					settablebeanproperty.deserializeAndSet(jsonparser, deserializationcontext, obj);
	//   75  144:aload           7
	//   76  146:aload_1         
	//   77  147:aload_2         
	//   78  148:aload           5
	//   79  150:invokevirtual   #138 <Method void SettableBeanProperty.deserializeAndSet(JsonParser, DeserializationContext, Object)>
				}
	//*  80  153:goto            180
				catch(Exception exception)
	//*  81  156:astore          8
				{
					wrapAndThrow(((Throwable) (exception)), obj, settablebeanproperty.getName(), deserializationcontext);
	//   82  158:aload_0         
	//   83  159:aload           8
	//   84  161:aload           5
	//   85  163:aload           7
	//   86  165:invokevirtual   #139 <Method String SettableBeanProperty.getName()>
	//   87  168:aload_2         
	//   88  169:invokevirtual   #143 <Method void wrapAndThrow(Throwable, Object, String, DeserializationContext)>
				}
			else
	//*  89  172:goto            180
				jsonparser.skipChildren();
	//   90  175:aload_1         
	//   91  176:invokevirtual   #128 <Method JsonParser JsonParser.skipChildren()>
	//   92  179:pop             
			i++;
	//   93  180:iload_3         
	//   94  181:iconst_1        
	//   95  182:iadd            
	//   96  183:istore_3        
		} while(true);
	//   97  184:goto            57
	}

	public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		jsonparser.setCurrentValue(obj);
	//    0    0:aload_1         
	//    1    1:aload_3         
	//    2    2:invokevirtual   #86  <Method void JsonParser.setCurrentValue(Object)>
		if(!jsonparser.isExpectedStartArrayToken())
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #208 <Method boolean JsonParser.isExpectedStartArrayToken()>
	//*   5    9:ifne            19
			return _deserializeFromNonArray(jsonparser, deserializationcontext);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #210 <Method Object _deserializeFromNonArray(JsonParser, DeserializationContext)>
	//   10   18:areturn         
		if(_injectables != null)
	//*  11   19:aload_0         
	//*  12   20:getfield        #90  <Field ValueInjector[] _injectables>
	//*  13   23:ifnull          32
			injectValues(deserializationcontext, obj);
	//   14   26:aload_0         
	//   15   27:aload_2         
	//   16   28:aload_3         
	//   17   29:invokevirtual   #94  <Method void injectValues(DeserializationContext, Object)>
		SettableBeanProperty asettablebeanproperty[] = _orderedProperties;
	//   18   32:aload_0         
	//   19   33:getfield        #21  <Field SettableBeanProperty[] _orderedProperties>
	//   20   36:astore          6
		int j = asettablebeanproperty.length;
	//   21   38:aload           6
	//   22   40:arraylength     
	//   23   41:istore          5
		int i = 0;
	//   24   43:iconst_0        
	//   25   44:istore          4
		do
		{
			if(jsonparser.nextToken() == JsonToken.END_ARRAY)
	//*  26   46:aload_1         
	//*  27   47:invokevirtual   #103 <Method JsonToken JsonParser.nextToken()>
	//*  28   50:getstatic       #109 <Field JsonToken JsonToken.END_ARRAY>
	//*  29   53:if_acmpne       58
				return obj;
	//   30   56:aload_3         
	//   31   57:areturn         
			if(i == j)
	//*  32   58:iload           4
	//*  33   60:iload           5
	//*  34   62:icmpne          121
			{
				if(!_ignoreAllUnknown && deserializationcontext.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES))
	//*  35   65:aload_0         
	//*  36   66:getfield        #112 <Field boolean _ignoreAllUnknown>
	//*  37   69:ifne            104
	//*  38   72:aload_2         
	//*  39   73:getstatic       #221 <Field DeserializationFeature DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES>
	//*  40   76:invokevirtual   #225 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  41   79:ifeq            104
					deserializationcontext.reportWrongTokenException(((JsonDeserializer) (this)), JsonToken.END_ARRAY, "Unexpected JSON values; expected at most %d properties (in JSON Array)", new Object[] {
						Integer.valueOf(j)
					});
	//   42   82:aload_2         
	//   43   83:aload_0         
	//   44   84:getstatic       #109 <Field JsonToken JsonToken.END_ARRAY>
	//   45   87:ldc1            #114 <String "Unexpected JSON values; expected at most %d properties (in JSON Array)">
	//   46   89:iconst_1        
	//   47   90:anewarray       Object[]
	//   48   93:dup             
	//   49   94:iconst_0        
	//   50   95:iload           5
	//   51   97:invokestatic    #120 <Method Integer Integer.valueOf(int)>
	//   52  100:aastore         
	//   53  101:invokevirtual   #124 <Method void DeserializationContext.reportWrongTokenException(JsonDeserializer, JsonToken, String, Object[])>
				do
					jsonparser.skipChildren();
	//   54  104:aload_1         
	//   55  105:invokevirtual   #128 <Method JsonParser JsonParser.skipChildren()>
	//   56  108:pop             
				while(jsonparser.nextToken() != JsonToken.END_ARRAY);
	//   57  109:aload_1         
	//   58  110:invokevirtual   #103 <Method JsonToken JsonParser.nextToken()>
	//   59  113:getstatic       #109 <Field JsonToken JsonToken.END_ARRAY>
	//   60  116:if_acmpne       104
				return obj;
	//   61  119:aload_3         
	//   62  120:areturn         
			}
			SettableBeanProperty settablebeanproperty = asettablebeanproperty[i];
	//   63  121:aload           6
	//   64  123:iload           4
	//   65  125:aaload          
	//   66  126:astore          7
			if(settablebeanproperty != null)
	//*  67  128:aload           7
	//*  68  130:ifnull          162
				try
				{
					settablebeanproperty.deserializeAndSet(jsonparser, deserializationcontext, obj);
	//   69  133:aload           7
	//   70  135:aload_1         
	//   71  136:aload_2         
	//   72  137:aload_3         
	//   73  138:invokevirtual   #138 <Method void SettableBeanProperty.deserializeAndSet(JsonParser, DeserializationContext, Object)>
				}
	//*  74  141:goto            167
				catch(Exception exception)
	//*  75  144:astore          8
				{
					wrapAndThrow(((Throwable) (exception)), obj, settablebeanproperty.getName(), deserializationcontext);
	//   76  146:aload_0         
	//   77  147:aload           8
	//   78  149:aload_3         
	//   79  150:aload           7
	//   80  152:invokevirtual   #139 <Method String SettableBeanProperty.getName()>
	//   81  155:aload_2         
	//   82  156:invokevirtual   #143 <Method void wrapAndThrow(Throwable, Object, String, DeserializationContext)>
				}
			else
	//*  83  159:goto            167
				jsonparser.skipChildren();
	//   84  162:aload_1         
	//   85  163:invokevirtual   #128 <Method JsonParser JsonParser.skipChildren()>
	//   86  166:pop             
			i++;
	//   87  167:iload           4
	//   88  169:iconst_1        
	//   89  170:iadd            
	//   90  171:istore          4
		} while(true);
	//   91  173:goto            46
	}

	public Object deserializeFromObject(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return _deserializeFromNonArray(jsonparser, deserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #210 <Method Object _deserializeFromNonArray(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public JsonDeserializer unwrappingDeserializer(NameTransformer nametransformer)
	{
		return _delegate.unwrappingDeserializer(nametransformer);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field BeanDeserializerBase _delegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #231 <Method JsonDeserializer BeanDeserializerBase.unwrappingDeserializer(NameTransformer)>
	//    4    8:areturn         
	}

	public BeanDeserializerBase withBeanProperties(BeanPropertyMap beanpropertymap)
	{
		return ((BeanDeserializerBase) (new BeanAsArrayDeserializer(_delegate.withBeanProperties(beanpropertymap), _orderedProperties)));
	//    0    0:new             #2   <Class BeanAsArrayDeserializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field BeanDeserializerBase _delegate>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #237 <Method BeanDeserializerBase BeanDeserializerBase.withBeanProperties(BeanPropertyMap)>
	//    6   12:aload_0         
	//    7   13:getfield        #21  <Field SettableBeanProperty[] _orderedProperties>
	//    8   16:invokespecial   #239 <Method void BeanAsArrayDeserializer(BeanDeserializerBase, SettableBeanProperty[])>
	//    9   19:areturn         
	}

	public BeanDeserializerBase withIgnorableProperties(Set set)
	{
		return ((BeanDeserializerBase) (new BeanAsArrayDeserializer(_delegate.withIgnorableProperties(set), _orderedProperties)));
	//    0    0:new             #2   <Class BeanAsArrayDeserializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field BeanDeserializerBase _delegate>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #243 <Method BeanDeserializerBase BeanDeserializerBase.withIgnorableProperties(Set)>
	//    6   12:aload_0         
	//    7   13:getfield        #21  <Field SettableBeanProperty[] _orderedProperties>
	//    8   16:invokespecial   #239 <Method void BeanAsArrayDeserializer(BeanDeserializerBase, SettableBeanProperty[])>
	//    9   19:areturn         
	}

	public BeanDeserializerBase withObjectIdReader(ObjectIdReader objectidreader)
	{
		return ((BeanDeserializerBase) (new BeanAsArrayDeserializer(_delegate.withObjectIdReader(objectidreader), _orderedProperties)));
	//    0    0:new             #2   <Class BeanAsArrayDeserializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field BeanDeserializerBase _delegate>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #248 <Method BeanDeserializerBase BeanDeserializerBase.withObjectIdReader(ObjectIdReader)>
	//    6   12:aload_0         
	//    7   13:getfield        #21  <Field SettableBeanProperty[] _orderedProperties>
	//    8   16:invokespecial   #239 <Method void BeanAsArrayDeserializer(BeanDeserializerBase, SettableBeanProperty[])>
	//    9   19:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final BeanDeserializerBase _delegate;
	protected final SettableBeanProperty _orderedProperties[];
}
