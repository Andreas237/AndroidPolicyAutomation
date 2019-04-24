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
import java.util.HashSet;

// Referenced classes of package com.fasterxml.jackson.databind.deser.impl:
//			PropertyBasedCreator, PropertyValueBuffer, ObjectIdReader

public class BeanAsArrayBuilderDeserializer extends BeanDeserializerBase
{

	public BeanAsArrayBuilderDeserializer(BeanDeserializerBase beandeserializerbase, SettableBeanProperty asettablebeanproperty[], AnnotatedMethod annotatedmethod)
	{
		super(beandeserializerbase);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void BeanDeserializerBase(BeanDeserializerBase)>
		_delegate = beandeserializerbase;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #21  <Field BeanDeserializerBase _delegate>
		_orderedProperties = asettablebeanproperty;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #23  <Field SettableBeanProperty[] _orderedProperties>
		_buildMethod = annotatedmethod;
	//    9   15:aload_0         
	//   10   16:aload_3         
	//   11   17:putfield        #25  <Field AnnotatedMethod _buildMethod>
	//   12   20:return          
	}

	protected Object _deserializeFromNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		throw deserializationcontext.mappingException("Can not deserialize a POJO (of type %s) from non-Array representation (token: %s): type/property designed to be serialized as JSON Array", new Object[] {
			_beanType.getRawClass().getName(), jsonparser.getCurrentToken()
		});
	//    0    0:aload_2         
	//    1    1:ldc1            #32  <String "Can not deserialize a POJO (of type %s) from non-Array representation (token: %s): type/property designed to be serialized as JSON Array">
	//    2    3:iconst_2        
	//    3    4:anewarray       Object[]
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:aload_0         
	//    7   10:getfield        #38  <Field JavaType _beanType>
	//    8   13:invokevirtual   #44  <Method Class JavaType.getRawClass()>
	//    9   16:invokevirtual   #50  <Method String Class.getName()>
	//   10   19:aastore         
	//   11   20:dup             
	//   12   21:iconst_1        
	//   13   22:aload_1         
	//   14   23:invokevirtual   #56  <Method JsonToken JsonParser.getCurrentToken()>
	//   15   26:aastore         
	//   16   27:invokevirtual   #62  <Method JsonMappingException DeserializationContext.mappingException(String, Object[])>
	//   17   30:athrow          
	}

	protected Object _deserializeNonVanilla(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(!_nonStandardCreation) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field boolean _nonStandardCreation>
	//    2    4:ifeq            18
_L1:
		Object obj = _deserializeWithCreator(jsonparser, deserializationcontext);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #73  <Method Object _deserializeWithCreator(JsonParser, DeserializationContext)>
	//    7   13:astore          6
_L4:
		return obj;
	//    8   15:aload           6
	//    9   17:areturn         
_L2:
		Object obj1;
		obj1 = _valueInstantiator.createUsingDefault(deserializationcontext);
	//   10   18:aload_0         
	//   11   19:getfield        #77  <Field ValueInstantiator _valueInstantiator>
	//   12   22:aload_2         
	//   13   23:invokevirtual   #83  <Method Object ValueInstantiator.createUsingDefault(DeserializationContext)>
	//   14   26:astore          7
		if(_injectables != null)
	//*  15   28:aload_0         
	//*  16   29:getfield        #87  <Field ValueInjector[] _injectables>
	//*  17   32:ifnull          42
			injectValues(deserializationcontext, obj1);
	//   18   35:aload_0         
	//   19   36:aload_2         
	//   20   37:aload           7
	//   21   39:invokevirtual   #91  <Method void injectValues(DeserializationContext, Object)>
		int i;
		int j;
		Class class1;
		SettableBeanProperty asettablebeanproperty[];
		if(_needViewProcesing)
	//*  22   42:aload_0         
	//*  23   43:getfield        #94  <Field boolean _needViewProcesing>
	//*  24   46:ifeq            114
			class1 = deserializationcontext.getActiveView();
	//   25   49:aload_2         
	//   26   50:invokevirtual   #97  <Method Class DeserializationContext.getActiveView()>
	//   27   53:astore          5
		else
	//*  28   55:aload_0         
	//*  29   56:getfield        #23  <Field SettableBeanProperty[] _orderedProperties>
	//*  30   59:astore          8
	//*  31   61:iconst_0        
	//*  32   62:istore_3        
	//*  33   63:aload           8
	//*  34   65:arraylength     
	//*  35   66:istore          4
	//*  36   68:aload           7
	//*  37   70:astore          6
	//*  38   72:aload_1         
	//*  39   73:invokevirtual   #100 <Method JsonToken JsonParser.nextToken()>
	//*  40   76:getstatic       #106 <Field JsonToken JsonToken.END_ARRAY>
	//*  41   79:if_acmpeq       15
	//*  42   82:iload_3         
	//*  43   83:iload           4
	//*  44   85:icmpne          120
	//*  45   88:aload_0         
	//*  46   89:getfield        #109 <Field boolean _ignoreAllUnknown>
	//*  47   92:ifne            190
	//*  48   95:aload_2         
	//*  49   96:ldc1            #111 <String "Unexpected JSON values; expected at most %d properties (in JSON Array)">
	//*  50   98:iconst_1        
	//*  51   99:anewarray       Object[]
	//*  52  102:dup             
	//*  53  103:iconst_0        
	//*  54  104:iload           4
	//*  55  106:invokestatic    #117 <Method Integer Integer.valueOf(int)>
	//*  56  109:aastore         
	//*  57  110:invokevirtual   #62  <Method JsonMappingException DeserializationContext.mappingException(String, Object[])>
	//*  58  113:athrow          
			class1 = null;
	//   59  114:aconst_null     
	//   60  115:astore          5
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
	//*  61  117:goto            55
				obj = ((Object) (asettablebeanproperty[i]));
	//   62  120:aload           8
	//   63  122:iload_3         
	//   64  123:aaload          
	//   65  124:astore          6
				i++;
	//   66  126:iload_3         
	//   67  127:iconst_1        
	//   68  128:iadd            
	//   69  129:istore_3        
				if(obj != null && (class1 == null || ((SettableBeanProperty) (obj)).visibleInView(class1)))
	//*  70  130:aload           6
	//*  71  132:ifnull          182
	//*  72  135:aload           5
	//*  73  137:ifnull          150
	//*  74  140:aload           6
	//*  75  142:aload           5
	//*  76  144:invokevirtual   #123 <Method boolean SettableBeanProperty.visibleInView(Class)>
	//*  77  147:ifeq            182
					try
					{
						((SettableBeanProperty) (obj)).deserializeSetAndReturn(jsonparser, deserializationcontext, obj1);
	//   78  150:aload           6
	//   79  152:aload_1         
	//   80  153:aload_2         
	//   81  154:aload           7
	//   82  156:invokevirtual   #127 <Method Object SettableBeanProperty.deserializeSetAndReturn(JsonParser, DeserializationContext, Object)>
	//   83  159:pop             
					}
	//*  84  160:goto            68
					catch(Exception exception)
	//*  85  163:astore          9
					{
						wrapAndThrow(((Throwable) (exception)), obj1, ((SettableBeanProperty) (obj)).getName(), deserializationcontext);
	//   86  165:aload_0         
	//   87  166:aload           9
	//   88  168:aload           7
	//   89  170:aload           6
	//   90  172:invokevirtual   #128 <Method String SettableBeanProperty.getName()>
	//   91  175:aload_2         
	//   92  176:invokevirtual   #132 <Method void wrapAndThrow(Throwable, Object, String, DeserializationContext)>
					}
				else
	//*  93  179:goto            68
					jsonparser.skipChildren();
	//   94  182:aload_1         
	//   95  183:invokevirtual   #136 <Method JsonParser JsonParser.skipChildren()>
	//   96  186:pop             
			}
		} while(true);
	//   97  187:goto            68
		while(true) 
		{
			obj = obj1;
	//   98  190:aload           7
	//   99  192:astore          6
			if(jsonparser.nextToken() == JsonToken.END_ARRAY)
				continue;
	//  100  194:aload_1         
	//  101  195:invokevirtual   #100 <Method JsonToken JsonParser.nextToken()>
	//  102  198:getstatic       #106 <Field JsonToken JsonToken.END_ARRAY>
	//  103  201:if_acmpeq       15
			jsonparser.skipChildren();
	//  104  204:aload_1         
	//  105  205:invokevirtual   #136 <Method JsonParser JsonParser.skipChildren()>
	//  106  208:pop             
		}
	//  107  209:goto            190
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
	//   11   20:getfield        #23  <Field SettableBeanProperty[] _orderedProperties>
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
_L1:
		Object obj1;
		SettableBeanProperty settablebeanproperty;
		if(jsonparser.nextToken() == JsonToken.END_ARRAY)
			break MISSING_BLOCK_LABEL_300;
	//   20   35:aload_1         
	//   21   36:invokevirtual   #100 <Method JsonToken JsonParser.nextToken()>
	//   22   39:getstatic       #106 <Field JsonToken JsonToken.END_ARRAY>
	//   23   42:if_acmpeq       300
		if(i < j)
	//*  24   45:iload_3         
	//*  25   46:iload           4
	//*  26   48:icmpge          82
			settablebeanproperty = asettablebeanproperty[i];
	//   27   51:aload           10
	//   28   53:iload_3         
	//   29   54:aaload          
	//   30   55:astore          7
		else
	//*  31   57:aload           7
	//*  32   59:ifnonnull       88
	//*  33   62:aload_1         
	//*  34   63:invokevirtual   #136 <Method JsonParser JsonParser.skipChildren()>
	//*  35   66:pop             
	//*  36   67:aload           5
	//*  37   69:astore          6
	//*  38   71:iload_3         
	//*  39   72:iconst_1        
	//*  40   73:iadd            
	//*  41   74:istore_3        
	//*  42   75:aload           6
	//*  43   77:astore          5
	//*  44   79:goto            35
			settablebeanproperty = null;
	//   45   82:aconst_null     
	//   46   83:astore          7
		if(settablebeanproperty == null)
		{
			jsonparser.skipChildren();
			obj1 = obj;
		} else
	//*  47   85:goto            57
		{
label0:
			{
				if(obj == null)
					break label0;
	//   48   88:aload           5
	//   49   90:ifnull          130
				try
				{
					obj1 = settablebeanproperty.deserializeSetAndReturn(jsonparser, deserializationcontext, obj);
	//   50   93:aload           7
	//   51   95:aload_1         
	//   52   96:aload_2         
	//   53   97:aload           5
	//   54   99:invokevirtual   #127 <Method Object SettableBeanProperty.deserializeSetAndReturn(JsonParser, DeserializationContext, Object)>
	//   55  102:astore          6
				}
	//*  56  104:goto            71
				// Misplaced declaration of an exception variable
				catch(Object obj1)
	//*  57  107:astore          6
				{
					wrapAndThrow(((Throwable) (obj1)), obj, settablebeanproperty.getName(), deserializationcontext);
	//   58  109:aload_0         
	//   59  110:aload           6
	//   60  112:aload           5
	//   61  114:aload           7
	//   62  116:invokevirtual   #128 <Method String SettableBeanProperty.getName()>
	//   63  119:aload_2         
	//   64  120:invokevirtual   #132 <Method void wrapAndThrow(Throwable, Object, String, DeserializationContext)>
					obj1 = obj;
	//   65  123:aload           5
	//   66  125:astore          6
				}
			}
		}
_L3:
		i++;
		obj = obj1;
		  goto _L1
	//*  67  127:goto            71
		String s;
		SettableBeanProperty settablebeanproperty1;
		s = settablebeanproperty.getName();
	//   68  130:aload           7
	//   69  132:invokevirtual   #128 <Method String SettableBeanProperty.getName()>
	//   70  135:astore          11
		settablebeanproperty1 = propertybasedcreator.findCreatorProperty(s);
	//   71  137:aload           8
	//   72  139:aload           11
	//   73  141:invokevirtual   #155 <Method SettableBeanProperty PropertyBasedCreator.findCreatorProperty(String)>
	//   74  144:astore          12
		if(settablebeanproperty1 == null)
			break MISSING_BLOCK_LABEL_265;
	//   75  146:aload           12
	//   76  148:ifnull          265
		obj1 = obj;
	//   77  151:aload           5
	//   78  153:astore          6
		if(!propertyvaluebuffer.assignParameter(settablebeanproperty1, settablebeanproperty1.deserialize(jsonparser, deserializationcontext))) goto _L3; else goto _L2
	//   79  155:aload           9
	//   80  157:aload           12
	//   81  159:aload           12
	//   82  161:aload_1         
	//   83  162:aload_2         
	//   84  163:invokevirtual   #158 <Method Object SettableBeanProperty.deserialize(JsonParser, DeserializationContext)>
	//   85  166:invokevirtual   #164 <Method boolean PropertyValueBuffer.assignParameter(SettableBeanProperty, Object)>
	//   86  169:ifeq            71
_L2:
		obj1 = propertybasedcreator.build(deserializationcontext, propertyvaluebuffer);
	//   87  172:aload           8
	//   88  174:aload_2         
	//   89  175:aload           9
	//   90  177:invokevirtual   #168 <Method Object PropertyBasedCreator.build(DeserializationContext, PropertyValueBuffer)>
	//   91  180:astore          6
		obj = obj1;
	//   92  182:aload           6
	//   93  184:astore          5
		obj1 = obj;
	//   94  186:aload           5
	//   95  188:astore          6
		if(obj.getClass() != _beanType.getRawClass())
	//*  96  190:aload           5
	//*  97  192:invokevirtual   #171 <Method Class Object.getClass()>
	//*  98  195:aload_0         
	//*  99  196:getfield        #38  <Field JavaType _beanType>
	//* 100  199:invokevirtual   #44  <Method Class JavaType.getRawClass()>
	//* 101  202:if_acmpeq       71
			throw deserializationcontext.mappingException("Can not support implicit polymorphic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s", new Object[] {
				_beanType.getRawClass().getName(), obj.getClass().getName()
			});
	//  102  205:aload_2         
	//  103  206:ldc1            #173 <String "Can not support implicit polymorphic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s">
	//  104  208:iconst_2        
	//  105  209:anewarray       Object[]
	//  106  212:dup             
	//  107  213:iconst_0        
	//  108  214:aload_0         
	//  109  215:getfield        #38  <Field JavaType _beanType>
	//  110  218:invokevirtual   #44  <Method Class JavaType.getRawClass()>
	//  111  221:invokevirtual   #50  <Method String Class.getName()>
	//  112  224:aastore         
	//  113  225:dup             
	//  114  226:iconst_1        
	//  115  227:aload           5
	//  116  229:invokevirtual   #171 <Method Class Object.getClass()>
	//  117  232:invokevirtual   #50  <Method String Class.getName()>
	//  118  235:aastore         
	//  119  236:invokevirtual   #62  <Method JsonMappingException DeserializationContext.mappingException(String, Object[])>
	//  120  239:athrow          
		  goto _L3
		obj1;
	//  121  240:astore          6
		wrapAndThrow(((Throwable) (obj1)), ((Object) (_beanType.getRawClass())), s, deserializationcontext);
	//  122  242:aload_0         
	//  123  243:aload           6
	//  124  245:aload_0         
	//  125  246:getfield        #38  <Field JavaType _beanType>
	//  126  249:invokevirtual   #44  <Method Class JavaType.getRawClass()>
	//  127  252:aload           11
	//  128  254:aload_2         
	//  129  255:invokevirtual   #132 <Method void wrapAndThrow(Throwable, Object, String, DeserializationContext)>
		obj1 = obj;
	//  130  258:aload           5
	//  131  260:astore          6
		  goto _L3
	//* 132  262:goto            71
		obj1 = obj;
	//  133  265:aload           5
	//  134  267:astore          6
		if(!propertyvaluebuffer.readIdProperty(s))
	//* 135  269:aload           9
	//* 136  271:aload           11
	//* 137  273:invokevirtual   #177 <Method boolean PropertyValueBuffer.readIdProperty(String)>
	//* 138  276:ifne            71
		{
			propertyvaluebuffer.bufferProperty(settablebeanproperty, settablebeanproperty.deserialize(jsonparser, deserializationcontext));
	//  139  279:aload           9
	//  140  281:aload           7
	//  141  283:aload           7
	//  142  285:aload_1         
	//  143  286:aload_2         
	//  144  287:invokevirtual   #158 <Method Object SettableBeanProperty.deserialize(JsonParser, DeserializationContext)>
	//  145  290:invokevirtual   #181 <Method void PropertyValueBuffer.bufferProperty(SettableBeanProperty, Object)>
			obj1 = obj;
	//  146  293:aload           5
	//  147  295:astore          6
		}
		  goto _L3
	//* 148  297:goto            71
		jsonparser = ((JsonParser) (obj));
	//  149  300:aload           5
	//  150  302:astore_1        
		if(obj == null)
	//* 151  303:aload           5
	//* 152  305:ifnonnull       317
			try
			{
				jsonparser = ((JsonParser) (propertybasedcreator.build(deserializationcontext, propertyvaluebuffer)));
	//  153  308:aload           8
	//  154  310:aload_2         
	//  155  311:aload           9
	//  156  313:invokevirtual   #168 <Method Object PropertyBasedCreator.build(DeserializationContext, PropertyValueBuffer)>
	//  157  316:astore_1        
			}
	//* 158  317:aload_1         
	//* 159  318:areturn         
			// Misplaced declaration of an exception variable
			catch(JsonParser jsonparser)
	//* 160  319:astore_1        
			{
				wrapInstantiationProblem(((Throwable) (jsonparser)), deserializationcontext);
	//  161  320:aload_0         
	//  162  321:aload_1         
	//  163  322:aload_2         
	//  164  323:invokevirtual   #185 <Method void wrapInstantiationProblem(Throwable, DeserializationContext)>
				return ((Object) (null));
	//  165  326:aconst_null     
	//  166  327:areturn         
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
	//    4    8:getfield        #77  <Field ValueInstantiator _valueInstantiator>
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
	//*  22   40:getfield        #38  <Field JavaType _beanType>
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
	//   32   63:getfield        #38  <Field JavaType _beanType>
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
	//   46   95:getfield        #38  <Field JavaType _beanType>
	//   47   98:invokevirtual   #216 <Method StringBuilder StringBuilder.append(Object)>
	//   48  101:ldc1            #231 <String ": can not instantiate from JSON object (need to add/enable type information?)">
	//   49  103:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
	//   50  106:invokevirtual   #221 <Method String StringBuilder.toString()>
	//   51  109:invokestatic    #227 <Method JsonMappingException JsonMappingException.from(JsonParser, String)>
	//   52  112:athrow          
	}

	protected volatile BeanDeserializerBase asArrayDeserializer()
	{
		return ((BeanDeserializerBase) (asArrayDeserializer()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #236 <Method BeanAsArrayBuilderDeserializer asArrayDeserializer()>
	//    2    4:areturn         
	}

	protected BeanAsArrayBuilderDeserializer asArrayDeserializer()
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		int i;
		int j;
		Object obj;
		SettableBeanProperty asettablebeanproperty[];
		if(!jsonparser.isExpectedStartArrayToken())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #239 <Method boolean JsonParser.isExpectedStartArrayToken()>
	//*   2    4:ifne            19
			return finishBuild(deserializationcontext, _deserializeFromNonArray(jsonparser, deserializationcontext));
	//    3    7:aload_0         
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #241 <Method Object _deserializeFromNonArray(JsonParser, DeserializationContext)>
	//    9   15:invokevirtual   #244 <Method Object finishBuild(DeserializationContext, Object)>
	//   10   18:areturn         
		if(!_vanillaProcessing)
	//*  11   19:aload_0         
	//*  12   20:getfield        #247 <Field boolean _vanillaProcessing>
	//*  13   23:ifne            38
			return finishBuild(deserializationcontext, _deserializeNonVanilla(jsonparser, deserializationcontext));
	//   14   26:aload_0         
	//   15   27:aload_2         
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:aload_2         
	//   19   31:invokevirtual   #249 <Method Object _deserializeNonVanilla(JsonParser, DeserializationContext)>
	//   20   34:invokevirtual   #244 <Method Object finishBuild(DeserializationContext, Object)>
	//   21   37:areturn         
		obj = _valueInstantiator.createUsingDefault(deserializationcontext);
	//   22   38:aload_0         
	//   23   39:getfield        #77  <Field ValueInstantiator _valueInstantiator>
	//   24   42:aload_2         
	//   25   43:invokevirtual   #83  <Method Object ValueInstantiator.createUsingDefault(DeserializationContext)>
	//   26   46:astore          5
		asettablebeanproperty = _orderedProperties;
	//   27   48:aload_0         
	//   28   49:getfield        #23  <Field SettableBeanProperty[] _orderedProperties>
	//   29   52:astore          7
		i = 0;
	//   30   54:iconst_0        
	//   31   55:istore_3        
		j = asettablebeanproperty.length;
	//   32   56:aload           7
	//   33   58:arraylength     
	//   34   59:istore          4
_L2:
		SettableBeanProperty settablebeanproperty;
		if(jsonparser.nextToken() == JsonToken.END_ARRAY)
	//*  35   61:aload_1         
	//*  36   62:invokevirtual   #100 <Method JsonToken JsonParser.nextToken()>
	//*  37   65:getstatic       #106 <Field JsonToken JsonToken.END_ARRAY>
	//*  38   68:if_acmpne       79
			return finishBuild(deserializationcontext, obj);
	//   39   71:aload_0         
	//   40   72:aload_2         
	//   41   73:aload           5
	//   42   75:invokevirtual   #244 <Method Object finishBuild(DeserializationContext, Object)>
	//   43   78:areturn         
		if(i == j)
	//*  44   79:iload_3         
	//*  45   80:iload           4
	//*  46   82:icmpne          111
		{
			if(!_ignoreAllUnknown)
	//*  47   85:aload_0         
	//*  48   86:getfield        #109 <Field boolean _ignoreAllUnknown>
	//*  49   89:ifne            171
				throw deserializationcontext.mappingException("Unexpected JSON values; expected at most %d properties (in JSON Array)", new Object[] {
					Integer.valueOf(j)
				});
	//   50   92:aload_2         
	//   51   93:ldc1            #111 <String "Unexpected JSON values; expected at most %d properties (in JSON Array)">
	//   52   95:iconst_1        
	//   53   96:anewarray       Object[]
	//   54   99:dup             
	//   55  100:iconst_0        
	//   56  101:iload           4
	//   57  103:invokestatic    #117 <Method Integer Integer.valueOf(int)>
	//   58  106:aastore         
	//   59  107:invokevirtual   #62  <Method JsonMappingException DeserializationContext.mappingException(String, Object[])>
	//   60  110:athrow          
			break MISSING_BLOCK_LABEL_171;
		}
		settablebeanproperty = asettablebeanproperty[i];
	//   61  111:aload           7
	//   62  113:iload_3         
	//   63  114:aaload          
	//   64  115:astore          8
		if(settablebeanproperty == null)
			break; /* Loop/switch isn't completed */
	//   65  117:aload           8
	//   66  119:ifnull          163
		Object obj1 = settablebeanproperty.deserializeSetAndReturn(jsonparser, deserializationcontext, obj);
	//   67  122:aload           8
	//   68  124:aload_1         
	//   69  125:aload_2         
	//   70  126:aload           5
	//   71  128:invokevirtual   #127 <Method Object SettableBeanProperty.deserializeSetAndReturn(JsonParser, DeserializationContext, Object)>
	//   72  131:astore          6
		obj = obj1;
	//   73  133:aload           6
	//   74  135:astore          5
_L3:
		i++;
	//   75  137:iload_3         
	//   76  138:iconst_1        
	//   77  139:iadd            
	//   78  140:istore_3        
		if(true) goto _L2; else goto _L1
	//   79  141:goto            61
		Exception exception;
		exception;
	//   80  144:astore          6
		wrapAndThrow(((Throwable) (exception)), obj, settablebeanproperty.getName(), deserializationcontext);
	//   81  146:aload_0         
	//   82  147:aload           6
	//   83  149:aload           5
	//   84  151:aload           8
	//   85  153:invokevirtual   #128 <Method String SettableBeanProperty.getName()>
	//   86  156:aload_2         
	//   87  157:invokevirtual   #132 <Method void wrapAndThrow(Throwable, Object, String, DeserializationContext)>
		  goto _L3
	//*  88  160:goto            137
_L1:
		jsonparser.skipChildren();
	//   89  163:aload_1         
	//   90  164:invokevirtual   #136 <Method JsonParser JsonParser.skipChildren()>
	//   91  167:pop             
		  goto _L3
	//*  92  168:goto            137
		for(; jsonparser.nextToken() != JsonToken.END_ARRAY; jsonparser.skipChildren());
	//   93  171:aload_1         
	//   94  172:invokevirtual   #100 <Method JsonToken JsonParser.nextToken()>
	//   95  175:getstatic       #106 <Field JsonToken JsonToken.END_ARRAY>
	//   96  178:if_acmpeq       189
	//   97  181:aload_1         
	//   98  182:invokevirtual   #136 <Method JsonParser JsonParser.skipChildren()>
	//   99  185:pop             
	//* 100  186:goto            171
		return finishBuild(deserializationcontext, obj);
	//  101  189:aload_0         
	//  102  190:aload_2         
	//  103  191:aload           5
	//  104  193:invokevirtual   #244 <Method Object finishBuild(DeserializationContext, Object)>
	//  105  196:areturn         
	}

	public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		int i;
		int j;
		SettableBeanProperty asettablebeanproperty[];
		if(_injectables != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #87  <Field ValueInjector[] _injectables>
	//*   2    4:ifnull          13
			injectValues(deserializationcontext, obj);
	//    3    7:aload_0         
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:invokevirtual   #91  <Method void injectValues(DeserializationContext, Object)>
		asettablebeanproperty = _orderedProperties;
	//    7   13:aload_0         
	//    8   14:getfield        #23  <Field SettableBeanProperty[] _orderedProperties>
	//    9   17:astore          7
		i = 0;
	//   10   19:iconst_0        
	//   11   20:istore          4
		j = asettablebeanproperty.length;
	//   12   22:aload           7
	//   13   24:arraylength     
	//   14   25:istore          5
_L2:
		SettableBeanProperty settablebeanproperty;
		if(jsonparser.nextToken() == JsonToken.END_ARRAY)
	//*  15   27:aload_1         
	//*  16   28:invokevirtual   #100 <Method JsonToken JsonParser.nextToken()>
	//*  17   31:getstatic       #106 <Field JsonToken JsonToken.END_ARRAY>
	//*  18   34:if_acmpne       44
			return finishBuild(deserializationcontext, obj);
	//   19   37:aload_0         
	//   20   38:aload_2         
	//   21   39:aload_3         
	//   22   40:invokevirtual   #244 <Method Object finishBuild(DeserializationContext, Object)>
	//   23   43:areturn         
		if(i == j)
	//*  24   44:iload           4
	//*  25   46:iload           5
	//*  26   48:icmpne          77
		{
			if(!_ignoreAllUnknown)
	//*  27   51:aload_0         
	//*  28   52:getfield        #109 <Field boolean _ignoreAllUnknown>
	//*  29   55:ifne            137
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
	//   39   73:invokevirtual   #62  <Method JsonMappingException DeserializationContext.mappingException(String, Object[])>
	//   40   76:athrow          
			break MISSING_BLOCK_LABEL_137;
		}
		settablebeanproperty = asettablebeanproperty[i];
	//   41   77:aload           7
	//   42   79:iload           4
	//   43   81:aaload          
	//   44   82:astore          8
		if(settablebeanproperty == null)
			break; /* Loop/switch isn't completed */
	//   45   84:aload           8
	//   46   86:ifnull          129
		Object obj1 = settablebeanproperty.deserializeSetAndReturn(jsonparser, deserializationcontext, obj);
	//   47   89:aload           8
	//   48   91:aload_1         
	//   49   92:aload_2         
	//   50   93:aload_3         
	//   51   94:invokevirtual   #127 <Method Object SettableBeanProperty.deserializeSetAndReturn(JsonParser, DeserializationContext, Object)>
	//   52   97:astore          6
		obj = obj1;
	//   53   99:aload           6
	//   54  101:astore_3        
_L3:
		i++;
	//   55  102:iload           4
	//   56  104:iconst_1        
	//   57  105:iadd            
	//   58  106:istore          4
		if(true) goto _L2; else goto _L1
	//   59  108:goto            27
		Exception exception;
		exception;
	//   60  111:astore          6
		wrapAndThrow(((Throwable) (exception)), obj, settablebeanproperty.getName(), deserializationcontext);
	//   61  113:aload_0         
	//   62  114:aload           6
	//   63  116:aload_3         
	//   64  117:aload           8
	//   65  119:invokevirtual   #128 <Method String SettableBeanProperty.getName()>
	//   66  122:aload_2         
	//   67  123:invokevirtual   #132 <Method void wrapAndThrow(Throwable, Object, String, DeserializationContext)>
		  goto _L3
	//*  68  126:goto            102
_L1:
		jsonparser.skipChildren();
	//   69  129:aload_1         
	//   70  130:invokevirtual   #136 <Method JsonParser JsonParser.skipChildren()>
	//   71  133:pop             
		  goto _L3
	//*  72  134:goto            102
		for(; jsonparser.nextToken() != JsonToken.END_ARRAY; jsonparser.skipChildren());
	//   73  137:aload_1         
	//   74  138:invokevirtual   #100 <Method JsonToken JsonParser.nextToken()>
	//   75  141:getstatic       #106 <Field JsonToken JsonToken.END_ARRAY>
	//   76  144:if_acmpeq       155
	//   77  147:aload_1         
	//   78  148:invokevirtual   #136 <Method JsonParser JsonParser.skipChildren()>
	//   79  151:pop             
	//*  80  152:goto            137
		return finishBuild(deserializationcontext, obj);
	//   81  155:aload_0         
	//   82  156:aload_2         
	//   83  157:aload_3         
	//   84  158:invokevirtual   #244 <Method Object finishBuild(DeserializationContext, Object)>
	//   85  161:areturn         
	}

	public Object deserializeFromObject(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return _deserializeFromNonArray(jsonparser, deserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #241 <Method Object _deserializeFromNonArray(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	protected final Object finishBuild(DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		try
		{
			obj = _buildMethod.getMember().invoke(obj, new Object[0]);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field AnnotatedMethod _buildMethod>
	//    2    4:invokevirtual   #256 <Method Method AnnotatedMethod.getMember()>
	//    3    7:aload_2         
	//    4    8:iconst_0        
	//    5    9:anewarray       Object[]
	//    6   12:invokevirtual   #262 <Method Object Method.invoke(Object, Object[])>
	//    7   15:astore_2        
		}
	//*   8   16:aload_2         
	//*   9   17:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  10   18:astore_2        
		{
			wrapInstantiationProblem(((Throwable) (obj)), deserializationcontext);
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:aload_1         
	//   14   22:invokevirtual   #185 <Method void wrapInstantiationProblem(Throwable, DeserializationContext)>
			return ((Object) (null));
	//   15   25:aconst_null     
	//   16   26:areturn         
		}
		return obj;
	}

	public JsonDeserializer unwrappingDeserializer(NameTransformer nametransformer)
	{
		return _delegate.unwrappingDeserializer(nametransformer);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field BeanDeserializerBase _delegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #266 <Method JsonDeserializer BeanDeserializerBase.unwrappingDeserializer(NameTransformer)>
	//    4    8:areturn         
	}

	public volatile BeanDeserializerBase withIgnorableProperties(HashSet hashset)
	{
		return ((BeanDeserializerBase) (withIgnorableProperties(hashset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #273 <Method BeanAsArrayBuilderDeserializer withIgnorableProperties(HashSet)>
	//    3    5:areturn         
	}

	public BeanAsArrayBuilderDeserializer withIgnorableProperties(HashSet hashset)
	{
		return new BeanAsArrayBuilderDeserializer(_delegate.withIgnorableProperties(hashset), _orderedProperties, _buildMethod);
	//    0    0:new             #2   <Class BeanAsArrayBuilderDeserializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field BeanDeserializerBase _delegate>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #275 <Method BeanDeserializerBase BeanDeserializerBase.withIgnorableProperties(HashSet)>
	//    6   12:aload_0         
	//    7   13:getfield        #23  <Field SettableBeanProperty[] _orderedProperties>
	//    8   16:aload_0         
	//    9   17:getfield        #25  <Field AnnotatedMethod _buildMethod>
	//   10   20:invokespecial   #277 <Method void BeanAsArrayBuilderDeserializer(BeanDeserializerBase, SettableBeanProperty[], AnnotatedMethod)>
	//   11   23:areturn         
	}

	public volatile BeanDeserializerBase withObjectIdReader(ObjectIdReader objectidreader)
	{
		return ((BeanDeserializerBase) (withObjectIdReader(objectidreader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #283 <Method BeanAsArrayBuilderDeserializer withObjectIdReader(ObjectIdReader)>
	//    3    5:areturn         
	}

	public BeanAsArrayBuilderDeserializer withObjectIdReader(ObjectIdReader objectidreader)
	{
		return new BeanAsArrayBuilderDeserializer(_delegate.withObjectIdReader(objectidreader), _orderedProperties, _buildMethod);
	//    0    0:new             #2   <Class BeanAsArrayBuilderDeserializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field BeanDeserializerBase _delegate>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #285 <Method BeanDeserializerBase BeanDeserializerBase.withObjectIdReader(ObjectIdReader)>
	//    6   12:aload_0         
	//    7   13:getfield        #23  <Field SettableBeanProperty[] _orderedProperties>
	//    8   16:aload_0         
	//    9   17:getfield        #25  <Field AnnotatedMethod _buildMethod>
	//   10   20:invokespecial   #277 <Method void BeanAsArrayBuilderDeserializer(BeanDeserializerBase, SettableBeanProperty[], AnnotatedMethod)>
	//   11   23:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final AnnotatedMethod _buildMethod;
	protected final BeanDeserializerBase _delegate;
	protected final SettableBeanProperty _orderedProperties[];
}
