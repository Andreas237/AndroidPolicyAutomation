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
import java.util.HashSet;

// Referenced classes of package com.fasterxml.jackson.databind.deser.impl:
//			PropertyBasedCreator, PropertyValueBuffer, ObjectIdReader

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
		throw deserializationcontext.mappingException("Can not deserialize a POJO (of type %s) from non-Array representation (token: %s): type/property designed to be serialized as JSON Array", new Object[] {
			_beanType.getRawClass().getName(), jsonparser.getCurrentToken()
		});
	//    0    0:aload_2         
	//    1    1:ldc1            #28  <String "Can not deserialize a POJO (of type %s) from non-Array representation (token: %s): type/property designed to be serialized as JSON Array">
	//    2    3:iconst_2        
	//    3    4:anewarray       Object[]
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:aload_0         
	//    7   10:getfield        #34  <Field JavaType _beanType>
	//    8   13:invokevirtual   #40  <Method Class JavaType.getRawClass()>
	//    9   16:invokevirtual   #46  <Method String Class.getName()>
	//   10   19:aastore         
	//   11   20:dup             
	//   12   21:iconst_1        
	//   13   22:aload_1         
	//   14   23:invokevirtual   #52  <Method JsonToken JsonParser.getCurrentToken()>
	//   15   26:aastore         
	//   16   27:invokevirtual   #58  <Method JsonMappingException DeserializationContext.mappingException(String, Object[])>
	//   17   30:athrow          
	}

	protected Object _deserializeNonVanilla(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(!_nonStandardCreation) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field boolean _nonStandardCreation>
	//    2    4:ifeq            18
_L1:
		Object obj = _deserializeWithCreator(jsonparser, deserializationcontext);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #69  <Method Object _deserializeWithCreator(JsonParser, DeserializationContext)>
	//    7   13:astore          6
_L4:
		return obj;
	//    8   15:aload           6
	//    9   17:areturn         
_L2:
		Object obj1;
		obj1 = _valueInstantiator.createUsingDefault(deserializationcontext);
	//   10   18:aload_0         
	//   11   19:getfield        #73  <Field ValueInstantiator _valueInstantiator>
	//   12   22:aload_2         
	//   13   23:invokevirtual   #79  <Method Object ValueInstantiator.createUsingDefault(DeserializationContext)>
	//   14   26:astore          7
		jsonparser.setCurrentValue(obj1);
	//   15   28:aload_1         
	//   16   29:aload           7
	//   17   31:invokevirtual   #83  <Method void JsonParser.setCurrentValue(Object)>
		if(_injectables != null)
	//*  18   34:aload_0         
	//*  19   35:getfield        #87  <Field ValueInjector[] _injectables>
	//*  20   38:ifnull          48
			injectValues(deserializationcontext, obj1);
	//   21   41:aload_0         
	//   22   42:aload_2         
	//   23   43:aload           7
	//   24   45:invokevirtual   #91  <Method void injectValues(DeserializationContext, Object)>
		int i;
		int j;
		Class class1;
		SettableBeanProperty asettablebeanproperty[];
		if(_needViewProcesing)
	//*  25   48:aload_0         
	//*  26   49:getfield        #94  <Field boolean _needViewProcesing>
	//*  27   52:ifeq            120
			class1 = deserializationcontext.getActiveView();
	//   28   55:aload_2         
	//   29   56:invokevirtual   #97  <Method Class DeserializationContext.getActiveView()>
	//   30   59:astore          5
		else
	//*  31   61:aload_0         
	//*  32   62:getfield        #21  <Field SettableBeanProperty[] _orderedProperties>
	//*  33   65:astore          8
	//*  34   67:iconst_0        
	//*  35   68:istore_3        
	//*  36   69:aload           8
	//*  37   71:arraylength     
	//*  38   72:istore          4
	//*  39   74:aload           7
	//*  40   76:astore          6
	//*  41   78:aload_1         
	//*  42   79:invokevirtual   #100 <Method JsonToken JsonParser.nextToken()>
	//*  43   82:getstatic       #106 <Field JsonToken JsonToken.END_ARRAY>
	//*  44   85:if_acmpeq       15
	//*  45   88:iload_3         
	//*  46   89:iload           4
	//*  47   91:icmpne          126
	//*  48   94:aload_0         
	//*  49   95:getfield        #109 <Field boolean _ignoreAllUnknown>
	//*  50   98:ifne            195
	//*  51  101:aload_2         
	//*  52  102:ldc1            #111 <String "Unexpected JSON values; expected at most %d properties (in JSON Array)">
	//*  53  104:iconst_1        
	//*  54  105:anewarray       Object[]
	//*  55  108:dup             
	//*  56  109:iconst_0        
	//*  57  110:iload           4
	//*  58  112:invokestatic    #117 <Method Integer Integer.valueOf(int)>
	//*  59  115:aastore         
	//*  60  116:invokevirtual   #58  <Method JsonMappingException DeserializationContext.mappingException(String, Object[])>
	//*  61  119:athrow          
			class1 = null;
	//   62  120:aconst_null     
	//   63  121:astore          5
		asettablebeanproperty = _orderedProperties;
		i = 0;
		j = asettablebeanproperty.length;
		do
		{
			obj = obj1;
			if(jsonparser.nextToken() == JsonToken.END_ARRAY)
				continue;
label0:
			{
				if(i == j)
				{
					if(!_ignoreAllUnknown)
						throw deserializationcontext.mappingException("Unexpected JSON values; expected at most %d properties (in JSON Array)", new Object[] {
							Integer.valueOf(j)
						});
					break label0;
				}
	//*  64  123:goto            61
				obj = ((Object) (asettablebeanproperty[i]));
	//   65  126:aload           8
	//   66  128:iload_3         
	//   67  129:aaload          
	//   68  130:astore          6
				i++;
	//   69  132:iload_3         
	//   70  133:iconst_1        
	//   71  134:iadd            
	//   72  135:istore_3        
				if(obj != null && (class1 == null || ((SettableBeanProperty) (obj)).visibleInView(class1)))
	//*  73  136:aload           6
	//*  74  138:ifnull          187
	//*  75  141:aload           5
	//*  76  143:ifnull          156
	//*  77  146:aload           6
	//*  78  148:aload           5
	//*  79  150:invokevirtual   #123 <Method boolean SettableBeanProperty.visibleInView(Class)>
	//*  80  153:ifeq            187
					try
					{
						((SettableBeanProperty) (obj)).deserializeAndSet(jsonparser, deserializationcontext, obj1);
	//   81  156:aload           6
	//   82  158:aload_1         
	//   83  159:aload_2         
	//   84  160:aload           7
	//   85  162:invokevirtual   #127 <Method void SettableBeanProperty.deserializeAndSet(JsonParser, DeserializationContext, Object)>
					}
	//*  86  165:goto            74
					catch(Exception exception)
	//*  87  168:astore          9
					{
						wrapAndThrow(((Throwable) (exception)), obj1, ((SettableBeanProperty) (obj)).getName(), deserializationcontext);
	//   88  170:aload_0         
	//   89  171:aload           9
	//   90  173:aload           7
	//   91  175:aload           6
	//   92  177:invokevirtual   #128 <Method String SettableBeanProperty.getName()>
	//   93  180:aload_2         
	//   94  181:invokevirtual   #132 <Method void wrapAndThrow(Throwable, Object, String, DeserializationContext)>
					}
				else
	//*  95  184:goto            74
					jsonparser.skipChildren();
	//   96  187:aload_1         
	//   97  188:invokevirtual   #136 <Method JsonParser JsonParser.skipChildren()>
	//   98  191:pop             
			}
		} while(true);
	//   99  192:goto            74
		while(true) 
		{
			obj = obj1;
	//  100  195:aload           7
	//  101  197:astore          6
			if(jsonparser.nextToken() == JsonToken.END_ARRAY)
				continue;
	//  102  199:aload_1         
	//  103  200:invokevirtual   #100 <Method JsonToken JsonParser.nextToken()>
	//  104  203:getstatic       #106 <Field JsonToken JsonToken.END_ARRAY>
	//  105  206:if_acmpeq       15
			jsonparser.skipChildren();
	//  106  209:aload_1         
	//  107  210:invokevirtual   #136 <Method JsonParser JsonParser.skipChildren()>
	//  108  213:pop             
		}
	//  109  214:goto            195
		if(true) goto _L4; else goto _L3
_L3:
	}

	protected final Object _deserializeUsingPropertyBased(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		int i;
		int j;
		Object obj;
		PropertyBasedCreator propertybasedcreator;
		PropertyValueBuffer propertyvaluebuffer;
		SettableBeanProperty asettablebeanproperty[];
		propertybasedcreator = _propertyBasedCreator;
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field PropertyBasedCreator _propertyBasedCreator>
	//    2    4:astore          8
		propertyvaluebuffer = propertybasedcreator.startBuilding(jsonparser, deserializationcontext, _objectIdReader);
	//    3    6:aload           8
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_0         
	//    7   11:getfield        #145 <Field ObjectIdReader _objectIdReader>
	//    8   14:invokevirtual   #151 <Method PropertyValueBuffer PropertyBasedCreator.startBuilding(JsonParser, DeserializationContext, ObjectIdReader)>
	//    9   17:astore          9
		asettablebeanproperty = _orderedProperties;
	//   10   19:aload_0         
	//   11   20:getfield        #21  <Field SettableBeanProperty[] _orderedProperties>
	//   12   23:astore          10
		j = asettablebeanproperty.length;
	//   13   25:aload           10
	//   14   27:arraylength     
	//   15   28:istore          4
		i = 0;
	//   16   30:iconst_0        
	//   17   31:istore_3        
		obj = null;
	//   18   32:aconst_null     
	//   19   33:astore          5
_L3:
		Object obj1;
		Object obj2;
		if(jsonparser.nextToken() == JsonToken.END_ARRAY)
			break MISSING_BLOCK_LABEL_308;
	//   20   35:aload_1         
	//   21   36:invokevirtual   #100 <Method JsonToken JsonParser.nextToken()>
	//   22   39:getstatic       #106 <Field JsonToken JsonToken.END_ARRAY>
	//   23   42:if_acmpeq       308
		if(i < j)
	//*  24   45:iload_3         
	//*  25   46:iload           4
	//*  26   48:icmpge          82
			obj1 = ((Object) (asettablebeanproperty[i]));
	//   27   51:aload           10
	//   28   53:iload_3         
	//   29   54:aaload          
	//   30   55:astore          6
		else
	//*  31   57:aload           6
	//*  32   59:ifnonnull       88
	//*  33   62:aload_1         
	//*  34   63:invokevirtual   #136 <Method JsonParser JsonParser.skipChildren()>
	//*  35   66:pop             
	//*  36   67:aload           5
	//*  37   69:astore          7
	//*  38   71:iload_3         
	//*  39   72:iconst_1        
	//*  40   73:iadd            
	//*  41   74:istore_3        
	//*  42   75:aload           7
	//*  43   77:astore          5
	//*  44   79:goto            35
			obj1 = null;
	//   45   82:aconst_null     
	//   46   83:astore          6
		if(obj1 != null) goto _L2; else goto _L1
_L1:
		jsonparser.skipChildren();
		obj2 = obj;
_L4:
		i++;
		obj = obj2;
		  goto _L3
	//*  47   85:goto            57
_L2:
		if(obj == null)
			break MISSING_BLOCK_LABEL_132;
	//   48   88:aload           5
	//   49   90:ifnull          132
		((SettableBeanProperty) (obj1)).deserializeAndSet(jsonparser, deserializationcontext, obj);
	//   50   93:aload           6
	//   51   95:aload_1         
	//   52   96:aload_2         
	//   53   97:aload           5
	//   54   99:invokevirtual   #127 <Method void SettableBeanProperty.deserializeAndSet(JsonParser, DeserializationContext, Object)>
		obj2 = obj;
	//   55  102:aload           5
	//   56  104:astore          7
		  goto _L4
	//*  57  106:goto            71
		obj2;
	//   58  109:astore          7
		wrapAndThrow(((Throwable) (obj2)), obj, ((SettableBeanProperty) (obj1)).getName(), deserializationcontext);
	//   59  111:aload_0         
	//   60  112:aload           7
	//   61  114:aload           5
	//   62  116:aload           6
	//   63  118:invokevirtual   #128 <Method String SettableBeanProperty.getName()>
	//   64  121:aload_2         
	//   65  122:invokevirtual   #132 <Method void wrapAndThrow(Throwable, Object, String, DeserializationContext)>
		obj2 = obj;
	//   66  125:aload           5
	//   67  127:astore          7
		  goto _L4
	//*  68  129:goto            71
		String s;
		SettableBeanProperty settablebeanproperty;
		s = ((SettableBeanProperty) (obj1)).getName();
	//   69  132:aload           6
	//   70  134:invokevirtual   #128 <Method String SettableBeanProperty.getName()>
	//   71  137:astore          11
		settablebeanproperty = propertybasedcreator.findCreatorProperty(s);
	//   72  139:aload           8
	//   73  141:aload           11
	//   74  143:invokevirtual   #155 <Method SettableBeanProperty PropertyBasedCreator.findCreatorProperty(String)>
	//   75  146:astore          12
		if(settablebeanproperty == null)
			break MISSING_BLOCK_LABEL_273;
	//   76  148:aload           12
	//   77  150:ifnull          273
		obj2 = obj;
	//   78  153:aload           5
	//   79  155:astore          7
		if(!propertyvaluebuffer.assignParameter(settablebeanproperty, settablebeanproperty.deserialize(jsonparser, deserializationcontext))) goto _L4; else goto _L5
	//   80  157:aload           9
	//   81  159:aload           12
	//   82  161:aload           12
	//   83  163:aload_1         
	//   84  164:aload_2         
	//   85  165:invokevirtual   #158 <Method Object SettableBeanProperty.deserialize(JsonParser, DeserializationContext)>
	//   86  168:invokevirtual   #164 <Method boolean PropertyValueBuffer.assignParameter(SettableBeanProperty, Object)>
	//   87  171:ifeq            71
_L5:
		obj1 = propertybasedcreator.build(deserializationcontext, propertyvaluebuffer);
	//   88  174:aload           8
	//   89  176:aload_2         
	//   90  177:aload           9
	//   91  179:invokevirtual   #168 <Method Object PropertyBasedCreator.build(DeserializationContext, PropertyValueBuffer)>
	//   92  182:astore          6
		obj = obj1;
	//   93  184:aload           6
	//   94  186:astore          5
		jsonparser.setCurrentValue(obj);
	//   95  188:aload_1         
	//   96  189:aload           5
	//   97  191:invokevirtual   #83  <Method void JsonParser.setCurrentValue(Object)>
		obj2 = obj;
	//   98  194:aload           5
	//   99  196:astore          7
		if(obj.getClass() != _beanType.getRawClass())
	//* 100  198:aload           5
	//* 101  200:invokevirtual   #171 <Method Class Object.getClass()>
	//* 102  203:aload_0         
	//* 103  204:getfield        #34  <Field JavaType _beanType>
	//* 104  207:invokevirtual   #40  <Method Class JavaType.getRawClass()>
	//* 105  210:if_acmpeq       71
			throw deserializationcontext.mappingException("Can not support implicit polymorphic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s", new Object[] {
				_beanType.getRawClass().getName(), obj.getClass().getName()
			});
	//  106  213:aload_2         
	//  107  214:ldc1            #173 <String "Can not support implicit polymorphic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s">
	//  108  216:iconst_2        
	//  109  217:anewarray       Object[]
	//  110  220:dup             
	//  111  221:iconst_0        
	//  112  222:aload_0         
	//  113  223:getfield        #34  <Field JavaType _beanType>
	//  114  226:invokevirtual   #40  <Method Class JavaType.getRawClass()>
	//  115  229:invokevirtual   #46  <Method String Class.getName()>
	//  116  232:aastore         
	//  117  233:dup             
	//  118  234:iconst_1        
	//  119  235:aload           5
	//  120  237:invokevirtual   #171 <Method Class Object.getClass()>
	//  121  240:invokevirtual   #46  <Method String Class.getName()>
	//  122  243:aastore         
	//  123  244:invokevirtual   #58  <Method JsonMappingException DeserializationContext.mappingException(String, Object[])>
	//  124  247:athrow          
		  goto _L4
		obj1;
	//  125  248:astore          6
		wrapAndThrow(((Throwable) (obj1)), ((Object) (_beanType.getRawClass())), s, deserializationcontext);
	//  126  250:aload_0         
	//  127  251:aload           6
	//  128  253:aload_0         
	//  129  254:getfield        #34  <Field JavaType _beanType>
	//  130  257:invokevirtual   #40  <Method Class JavaType.getRawClass()>
	//  131  260:aload           11
	//  132  262:aload_2         
	//  133  263:invokevirtual   #132 <Method void wrapAndThrow(Throwable, Object, String, DeserializationContext)>
		obj2 = obj;
	//  134  266:aload           5
	//  135  268:astore          7
		  goto _L4
	//* 136  270:goto            71
		obj2 = obj;
	//  137  273:aload           5
	//  138  275:astore          7
		if(!propertyvaluebuffer.readIdProperty(s))
	//* 139  277:aload           9
	//* 140  279:aload           11
	//* 141  281:invokevirtual   #177 <Method boolean PropertyValueBuffer.readIdProperty(String)>
	//* 142  284:ifne            71
		{
			propertyvaluebuffer.bufferProperty(((SettableBeanProperty) (obj1)), ((SettableBeanProperty) (obj1)).deserialize(jsonparser, deserializationcontext));
	//  143  287:aload           9
	//  144  289:aload           6
	//  145  291:aload           6
	//  146  293:aload_1         
	//  147  294:aload_2         
	//  148  295:invokevirtual   #158 <Method Object SettableBeanProperty.deserialize(JsonParser, DeserializationContext)>
	//  149  298:invokevirtual   #181 <Method void PropertyValueBuffer.bufferProperty(SettableBeanProperty, Object)>
			obj2 = obj;
	//  150  301:aload           5
	//  151  303:astore          7
		}
		  goto _L4
	//* 152  305:goto            71
		jsonparser = ((JsonParser) (obj));
	//  153  308:aload           5
	//  154  310:astore_1        
		if(obj == null)
	//* 155  311:aload           5
	//* 156  313:ifnonnull       325
			try
			{
				jsonparser = ((JsonParser) (propertybasedcreator.build(deserializationcontext, propertyvaluebuffer)));
	//  157  316:aload           8
	//  158  318:aload_2         
	//  159  319:aload           9
	//  160  321:invokevirtual   #168 <Method Object PropertyBasedCreator.build(DeserializationContext, PropertyValueBuffer)>
	//  161  324:astore_1        
			}
	//* 162  325:aload_1         
	//* 163  326:areturn         
			// Misplaced declaration of an exception variable
			catch(JsonParser jsonparser)
	//* 164  327:astore_1        
			{
				wrapInstantiationProblem(((Throwable) (jsonparser)), deserializationcontext);
	//  165  328:aload_0         
	//  166  329:aload_1         
	//  167  330:aload_2         
	//  168  331:invokevirtual   #185 <Method void wrapInstantiationProblem(Throwable, DeserializationContext)>
				return ((Object) (null));
	//  169  334:aconst_null     
	//  170  335:areturn         
			}
		return ((Object) (jsonparser));
	}

	protected Object _deserializeWithCreator(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(_delegateDeserializer != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #189 <Field JsonDeserializer _delegateDeserializer>
	//*   2    4:ifnull          25
			return _valueInstantiator.createUsingDelegate(deserializationcontext, _delegateDeserializer.deserialize(jsonparser, deserializationcontext));
	//    3    7:aload_0         
	//    4    8:getfield        #73  <Field ValueInstantiator _valueInstantiator>
	//    5   11:aload_2         
	//    6   12:aload_0         
	//    7   13:getfield        #189 <Field JsonDeserializer _delegateDeserializer>
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokevirtual   #192 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   11   21:invokevirtual   #196 <Method Object ValueInstantiator.createUsingDelegate(DeserializationContext, Object)>
	//   12   24:areturn         
		if(_propertyBasedCreator != null)
	//*  13   25:aload_0         
	//*  14   26:getfield        #141 <Field PropertyBasedCreator _propertyBasedCreator>
	//*  15   29:ifnull          39
			return _deserializeUsingPropertyBased(jsonparser, deserializationcontext);
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:aload_2         
	//   19   35:invokevirtual   #198 <Method Object _deserializeUsingPropertyBased(JsonParser, DeserializationContext)>
	//   20   38:areturn         
		if(_beanType.isAbstract())
	//*  21   39:aload_0         
	//*  22   40:getfield        #34  <Field JavaType _beanType>
	//*  23   43:invokevirtual   #202 <Method boolean JavaType.isAbstract()>
	//*  24   46:ifeq            81
			throw JsonMappingException.from(jsonparser, (new StringBuilder()).append("Can not instantiate abstract type ").append(((Object) (_beanType))).append(" (need to add/enable type information?)").toString());
	//   25   49:aload_1         
	//   26   50:new             #204 <Class StringBuilder>
	//   27   53:dup             
	//   28   54:invokespecial   #207 <Method void StringBuilder()>
	//   29   57:ldc1            #209 <String "Can not instantiate abstract type ">
	//   30   59:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
	//   31   62:aload_0         
	//   32   63:getfield        #34  <Field JavaType _beanType>
	//   33   66:invokevirtual   #216 <Method StringBuilder StringBuilder.append(Object)>
	//   34   69:ldc1            #218 <String " (need to add/enable type information?)">
	//   35   71:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
	//   36   74:invokevirtual   #221 <Method String StringBuilder.toString()>
	//   37   77:invokestatic    #227 <Method JsonMappingException JsonMappingException.from(JsonParser, String)>
	//   38   80:athrow          
		else
			throw JsonMappingException.from(jsonparser, (new StringBuilder()).append("No suitable constructor found for type ").append(((Object) (_beanType))).append(": can not instantiate from JSON object (need to add/enable type information?)").toString());
	//   39   81:aload_1         
	//   40   82:new             #204 <Class StringBuilder>
	//   41   85:dup             
	//   42   86:invokespecial   #207 <Method void StringBuilder()>
	//   43   89:ldc1            #229 <String "No suitable constructor found for type ">
	//   44   91:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
	//   45   94:aload_0         
	//   46   95:getfield        #34  <Field JavaType _beanType>
	//   47   98:invokevirtual   #216 <Method StringBuilder StringBuilder.append(Object)>
	//   48  101:ldc1            #231 <String ": can not instantiate from JSON object (need to add/enable type information?)">
	//   49  103:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
	//   50  106:invokevirtual   #221 <Method String StringBuilder.toString()>
	//   51  109:invokestatic    #227 <Method JsonMappingException JsonMappingException.from(JsonParser, String)>
	//   52  112:athrow          
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
		if(jsonparser.isExpectedStartArrayToken()) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:invokevirtual   #236 <Method boolean JsonParser.isExpectedStartArrayToken()>
	//    2    4:ifne            18
_L1:
		Object obj = _deserializeFromNonArray(jsonparser, deserializationcontext);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #238 <Method Object _deserializeFromNonArray(JsonParser, DeserializationContext)>
	//    7   13:astore          5
_L4:
		return obj;
	//    8   15:aload           5
	//    9   17:areturn         
_L2:
		Object obj1;
		if(!_vanillaProcessing)
	//*  10   18:aload_0         
	//*  11   19:getfield        #241 <Field boolean _vanillaProcessing>
	//*  12   22:ifne            32
			return _deserializeNonVanilla(jsonparser, deserializationcontext);
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:aload_2         
	//   16   28:invokevirtual   #243 <Method Object _deserializeNonVanilla(JsonParser, DeserializationContext)>
	//   17   31:areturn         
		obj1 = _valueInstantiator.createUsingDefault(deserializationcontext);
	//   18   32:aload_0         
	//   19   33:getfield        #73  <Field ValueInstantiator _valueInstantiator>
	//   20   36:aload_2         
	//   21   37:invokevirtual   #79  <Method Object ValueInstantiator.createUsingDefault(DeserializationContext)>
	//   22   40:astore          6
		jsonparser.setCurrentValue(obj1);
	//   23   42:aload_1         
	//   24   43:aload           6
	//   25   45:invokevirtual   #83  <Method void JsonParser.setCurrentValue(Object)>
		SettableBeanProperty asettablebeanproperty[] = _orderedProperties;
	//   26   48:aload_0         
	//   27   49:getfield        #21  <Field SettableBeanProperty[] _orderedProperties>
	//   28   52:astore          7
		int i = 0;
	//   29   54:iconst_0        
	//   30   55:istore_3        
		int j = asettablebeanproperty.length;
	//   31   56:aload           7
	//   32   58:arraylength     
	//   33   59:istore          4
		do
		{
			obj = obj1;
	//   34   61:aload           6
	//   35   63:astore          5
			if(jsonparser.nextToken() == JsonToken.END_ARRAY)
				continue;
	//   36   65:aload_1         
	//   37   66:invokevirtual   #100 <Method JsonToken JsonParser.nextToken()>
	//   38   69:getstatic       #106 <Field JsonToken JsonToken.END_ARRAY>
	//   39   72:if_acmpeq       15
label0:
			{
				if(i == j)
	//*  40   75:iload_3         
	//*  41   76:iload           4
	//*  42   78:icmpne          107
				{
					if(!_ignoreAllUnknown)
	//*  43   81:aload_0         
	//*  44   82:getfield        #109 <Field boolean _ignoreAllUnknown>
	//*  45   85:ifne            161
						throw deserializationcontext.mappingException("Unexpected JSON values; expected at most %d properties (in JSON Array)", new Object[] {
							Integer.valueOf(j)
						});
	//   46   88:aload_2         
	//   47   89:ldc1            #111 <String "Unexpected JSON values; expected at most %d properties (in JSON Array)">
	//   48   91:iconst_1        
	//   49   92:anewarray       Object[]
	//   50   95:dup             
	//   51   96:iconst_0        
	//   52   97:iload           4
	//   53   99:invokestatic    #117 <Method Integer Integer.valueOf(int)>
	//   54  102:aastore         
	//   55  103:invokevirtual   #58  <Method JsonMappingException DeserializationContext.mappingException(String, Object[])>
	//   56  106:athrow          
					break label0;
				}
				obj = ((Object) (asettablebeanproperty[i]));
	//   57  107:aload           7
	//   58  109:iload_3         
	//   59  110:aaload          
	//   60  111:astore          5
				if(obj != null)
	//*  61  113:aload           5
	//*  62  115:ifnull          153
					try
					{
						((SettableBeanProperty) (obj)).deserializeAndSet(jsonparser, deserializationcontext, obj1);
	//   63  118:aload           5
	//   64  120:aload_1         
	//   65  121:aload_2         
	//   66  122:aload           6
	//   67  124:invokevirtual   #127 <Method void SettableBeanProperty.deserializeAndSet(JsonParser, DeserializationContext, Object)>
					}
	//*  68  127:iload_3         
	//*  69  128:iconst_1        
	//*  70  129:iadd            
	//*  71  130:istore_3        
	//*  72  131:goto            61
					catch(Exception exception)
	//*  73  134:astore          8
					{
						wrapAndThrow(((Throwable) (exception)), obj1, ((SettableBeanProperty) (obj)).getName(), deserializationcontext);
	//   74  136:aload_0         
	//   75  137:aload           8
	//   76  139:aload           6
	//   77  141:aload           5
	//   78  143:invokevirtual   #128 <Method String SettableBeanProperty.getName()>
	//   79  146:aload_2         
	//   80  147:invokevirtual   #132 <Method void wrapAndThrow(Throwable, Object, String, DeserializationContext)>
					}
				else
	//*  81  150:goto            127
					jsonparser.skipChildren();
	//   82  153:aload_1         
	//   83  154:invokevirtual   #136 <Method JsonParser JsonParser.skipChildren()>
	//   84  157:pop             
				i++;
			}
		} while(true);
	//   85  158:goto            127
		while(true) 
		{
			obj = obj1;
	//   86  161:aload           6
	//   87  163:astore          5
			if(jsonparser.nextToken() == JsonToken.END_ARRAY)
				continue;
	//   88  165:aload_1         
	//   89  166:invokevirtual   #100 <Method JsonToken JsonParser.nextToken()>
	//   90  169:getstatic       #106 <Field JsonToken JsonToken.END_ARRAY>
	//   91  172:if_acmpeq       15
			jsonparser.skipChildren();
	//   92  175:aload_1         
	//   93  176:invokevirtual   #136 <Method JsonParser JsonParser.skipChildren()>
	//   94  179:pop             
		}
	//   95  180:goto            161
		if(true) goto _L4; else goto _L3
_L3:
	}

	public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		int i;
		int j;
		SettableBeanProperty asettablebeanproperty[];
		jsonparser.setCurrentValue(obj);
	//    0    0:aload_1         
	//    1    1:aload_3         
	//    2    2:invokevirtual   #83  <Method void JsonParser.setCurrentValue(Object)>
		if(_injectables != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #87  <Field ValueInjector[] _injectables>
	//*   5    9:ifnull          18
			injectValues(deserializationcontext, obj);
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:aload_3         
	//    9   15:invokevirtual   #91  <Method void injectValues(DeserializationContext, Object)>
		asettablebeanproperty = _orderedProperties;
	//   10   18:aload_0         
	//   11   19:getfield        #21  <Field SettableBeanProperty[] _orderedProperties>
	//   12   22:astore          6
		i = 0;
	//   13   24:iconst_0        
	//   14   25:istore          4
		j = asettablebeanproperty.length;
	//   15   27:aload           6
	//   16   29:arraylength     
	//   17   30:istore          5
_L3:
		if(jsonparser.nextToken() != JsonToken.END_ARRAY) goto _L2; else goto _L1
	//   18   32:aload_1         
	//   19   33:invokevirtual   #100 <Method JsonToken JsonParser.nextToken()>
	//   20   36:getstatic       #106 <Field JsonToken JsonToken.END_ARRAY>
	//   21   39:if_acmpne       44
_L1:
		return obj;
	//   22   42:aload_3         
	//   23   43:areturn         
_L2:
label0:
		{
			if(i == j)
	//*  24   44:iload           4
	//*  25   46:iload           5
	//*  26   48:icmpne          77
			{
				if(!_ignoreAllUnknown)
	//*  27   51:aload_0         
	//*  28   52:getfield        #109 <Field boolean _ignoreAllUnknown>
	//*  29   55:ifne            132
					throw deserializationcontext.mappingException("Unexpected JSON values; expected at most %d properties (in JSON Array)", new Object[] {
						Integer.valueOf(j)
					});
	//   30   58:aload_2         
	//   31   59:ldc1            #111 <String "Unexpected JSON values; expected at most %d properties (in JSON Array)">
	//   32   61:iconst_1        
	//   33   62:anewarray       Object[]
	//   34   65:dup             
	//   35   66:iconst_0        
	//   36   67:iload           5
	//   37   69:invokestatic    #117 <Method Integer Integer.valueOf(int)>
	//   38   72:aastore         
	//   39   73:invokevirtual   #58  <Method JsonMappingException DeserializationContext.mappingException(String, Object[])>
	//   40   76:athrow          
				break label0;
			}
			SettableBeanProperty settablebeanproperty = asettablebeanproperty[i];
	//   41   77:aload           6
	//   42   79:iload           4
	//   43   81:aaload          
	//   44   82:astore          7
			if(settablebeanproperty != null)
	//*  45   84:aload           7
	//*  46   86:ifnull          124
				try
				{
					settablebeanproperty.deserializeAndSet(jsonparser, deserializationcontext, obj);
	//   47   89:aload           7
	//   48   91:aload_1         
	//   49   92:aload_2         
	//   50   93:aload_3         
	//   51   94:invokevirtual   #127 <Method void SettableBeanProperty.deserializeAndSet(JsonParser, DeserializationContext, Object)>
				}
	//*  52   97:iload           4
	//*  53   99:iconst_1        
	//*  54  100:iadd            
	//*  55  101:istore          4
	//*  56  103:goto            32
				catch(Exception exception)
	//*  57  106:astore          8
				{
					wrapAndThrow(((Throwable) (exception)), obj, settablebeanproperty.getName(), deserializationcontext);
	//   58  108:aload_0         
	//   59  109:aload           8
	//   60  111:aload_3         
	//   61  112:aload           7
	//   62  114:invokevirtual   #128 <Method String SettableBeanProperty.getName()>
	//   63  117:aload_2         
	//   64  118:invokevirtual   #132 <Method void wrapAndThrow(Throwable, Object, String, DeserializationContext)>
				}
			else
	//*  65  121:goto            97
				jsonparser.skipChildren();
	//   66  124:aload_1         
	//   67  125:invokevirtual   #136 <Method JsonParser JsonParser.skipChildren()>
	//   68  128:pop             
			i++;
		}
		  goto _L3
	//*  69  129:goto            97
		while(jsonparser.nextToken() != JsonToken.END_ARRAY) 
	//*  70  132:aload_1         
	//*  71  133:invokevirtual   #100 <Method JsonToken JsonParser.nextToken()>
	//*  72  136:getstatic       #106 <Field JsonToken JsonToken.END_ARRAY>
	//*  73  139:if_acmpeq       42
			jsonparser.skipChildren();
	//   74  142:aload_1         
	//   75  143:invokevirtual   #136 <Method JsonParser JsonParser.skipChildren()>
	//   76  146:pop             
		  goto _L1
	//*  77  147:goto            132
	}

	public Object deserializeFromObject(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return _deserializeFromNonArray(jsonparser, deserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #238 <Method Object _deserializeFromNonArray(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public JsonDeserializer unwrappingDeserializer(NameTransformer nametransformer)
	{
		return _delegate.unwrappingDeserializer(nametransformer);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field BeanDeserializerBase _delegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #249 <Method JsonDeserializer BeanDeserializerBase.unwrappingDeserializer(NameTransformer)>
	//    4    8:areturn         
	}

	public volatile BeanDeserializerBase withIgnorableProperties(HashSet hashset)
	{
		return ((BeanDeserializerBase) (withIgnorableProperties(hashset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #256 <Method BeanAsArrayDeserializer withIgnorableProperties(HashSet)>
	//    3    5:areturn         
	}

	public BeanAsArrayDeserializer withIgnorableProperties(HashSet hashset)
	{
		return new BeanAsArrayDeserializer(_delegate.withIgnorableProperties(hashset), _orderedProperties);
	//    0    0:new             #2   <Class BeanAsArrayDeserializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field BeanDeserializerBase _delegate>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #258 <Method BeanDeserializerBase BeanDeserializerBase.withIgnorableProperties(HashSet)>
	//    6   12:aload_0         
	//    7   13:getfield        #21  <Field SettableBeanProperty[] _orderedProperties>
	//    8   16:invokespecial   #260 <Method void BeanAsArrayDeserializer(BeanDeserializerBase, SettableBeanProperty[])>
	//    9   19:areturn         
	}

	public volatile BeanDeserializerBase withObjectIdReader(ObjectIdReader objectidreader)
	{
		return ((BeanDeserializerBase) (withObjectIdReader(objectidreader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #266 <Method BeanAsArrayDeserializer withObjectIdReader(ObjectIdReader)>
	//    3    5:areturn         
	}

	public BeanAsArrayDeserializer withObjectIdReader(ObjectIdReader objectidreader)
	{
		return new BeanAsArrayDeserializer(_delegate.withObjectIdReader(objectidreader), _orderedProperties);
	//    0    0:new             #2   <Class BeanAsArrayDeserializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field BeanDeserializerBase _delegate>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #268 <Method BeanDeserializerBase BeanDeserializerBase.withObjectIdReader(ObjectIdReader)>
	//    6   12:aload_0         
	//    7   13:getfield        #21  <Field SettableBeanProperty[] _orderedProperties>
	//    8   16:invokespecial   #260 <Method void BeanAsArrayDeserializer(BeanDeserializerBase, SettableBeanProperty[])>
	//    9   19:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final BeanDeserializerBase _delegate;
	protected final SettableBeanProperty _orderedProperties[];
}
