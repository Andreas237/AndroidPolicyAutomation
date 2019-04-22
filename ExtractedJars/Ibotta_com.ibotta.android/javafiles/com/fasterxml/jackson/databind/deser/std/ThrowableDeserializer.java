// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.*;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.Set;

public class ThrowableDeserializer extends BeanDeserializer
{

	public ThrowableDeserializer(BeanDeserializer beandeserializer)
	{
		super(((com.fasterxml.jackson.databind.deser.BeanDeserializerBase) (beandeserializer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void BeanDeserializer(com.fasterxml.jackson.databind.deser.BeanDeserializerBase)>
		_vanillaProcessing = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #17  <Field boolean _vanillaProcessing>
	//    6   10:return          
	}

	protected ThrowableDeserializer(BeanDeserializer beandeserializer, NameTransformer nametransformer)
	{
		super(((com.fasterxml.jackson.databind.deser.BeanDeserializerBase) (beandeserializer)), nametransformer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #22  <Method void BeanDeserializer(com.fasterxml.jackson.databind.deser.BeanDeserializerBase, NameTransformer)>
	//    4    6:return          
	}

	public Object deserializeFromObject(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(_propertyBasedCreator != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator _propertyBasedCreator>
	//*   2    4:ifnull          14
			return _deserializeUsingPropertyBased(jsonparser, deserializationcontext);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #33  <Method Object _deserializeUsingPropertyBased(JsonParser, DeserializationContext)>
	//    7   13:areturn         
		if(_delegateDeserializer != null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #37  <Field JsonDeserializer _delegateDeserializer>
	//*  10   18:ifnull          39
			return _valueInstantiator.createUsingDelegate(deserializationcontext, _delegateDeserializer.deserialize(jsonparser, deserializationcontext));
	//   11   21:aload_0         
	//   12   22:getfield        #41  <Field ValueInstantiator _valueInstantiator>
	//   13   25:aload_2         
	//   14   26:aload_0         
	//   15   27:getfield        #37  <Field JsonDeserializer _delegateDeserializer>
	//   16   30:aload_1         
	//   17   31:aload_2         
	//   18   32:invokevirtual   #46  <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   19   35:invokevirtual   #52  <Method Object ValueInstantiator.createUsingDelegate(DeserializationContext, Object)>
	//   20   38:areturn         
		boolean flag1 = _beanType.isAbstract();
	//   21   39:aload_0         
	//   22   40:getfield        #56  <Field JavaType _beanType>
	//   23   43:invokevirtual   #62  <Method boolean JavaType.isAbstract()>
	//   24   46:istore          7
		boolean flag = false;
	//   25   48:iconst_0        
	//   26   49:istore          5
		if(flag1)
	//*  27   51:iload           7
	//*  28   53:ifeq            76
			return deserializationcontext.handleMissingInstantiator(handledType(), getValueInstantiator(), jsonparser, "abstract type (need to add/enable type information?)", new Object[0]);
	//   29   56:aload_2         
	//   30   57:aload_0         
	//   31   58:invokevirtual   #66  <Method Class handledType()>
	//   32   61:aload_0         
	//   33   62:invokevirtual   #70  <Method ValueInstantiator getValueInstantiator()>
	//   34   65:aload_1         
	//   35   66:ldc1            #72  <String "abstract type (need to add/enable type information?)">
	//   36   68:iconst_0        
	//   37   69:anewarray       Object[]
	//   38   72:invokevirtual   #80  <Method Object DeserializationContext.handleMissingInstantiator(Class, ValueInstantiator, JsonParser, String, Object[])>
	//   39   75:areturn         
		flag1 = _valueInstantiator.canCreateFromString();
	//   40   76:aload_0         
	//   41   77:getfield        #41  <Field ValueInstantiator _valueInstantiator>
	//   42   80:invokevirtual   #83  <Method boolean ValueInstantiator.canCreateFromString()>
	//   43   83:istore          7
		boolean flag2 = _valueInstantiator.canCreateUsingDefault();
	//   44   85:aload_0         
	//   45   86:getfield        #41  <Field ValueInstantiator _valueInstantiator>
	//   46   89:invokevirtual   #86  <Method boolean ValueInstantiator.canCreateUsingDefault()>
	//   47   92:istore          8
		if(!flag1 && !flag2)
	//*  48   94:iload           7
	//*  49   96:ifne            124
	//*  50   99:iload           8
	//*  51  101:ifne            124
			return deserializationcontext.handleMissingInstantiator(handledType(), getValueInstantiator(), jsonparser, "Throwable needs a default contructor, a single-String-arg constructor; or explicit @JsonCreator", new Object[0]);
	//   52  104:aload_2         
	//   53  105:aload_0         
	//   54  106:invokevirtual   #66  <Method Class handledType()>
	//   55  109:aload_0         
	//   56  110:invokevirtual   #70  <Method ValueInstantiator getValueInstantiator()>
	//   57  113:aload_1         
	//   58  114:ldc1            #88  <String "Throwable needs a default contructor, a single-String-arg constructor; or explicit @JsonCreator">
	//   59  116:iconst_0        
	//   60  117:anewarray       Object[]
	//   61  120:invokevirtual   #80  <Method Object DeserializationContext.handleMissingInstantiator(Class, ValueInstantiator, JsonParser, String, Object[])>
	//   62  123:areturn         
		Object obj1 = null;
	//   63  124:aconst_null     
	//   64  125:astore          10
		Object obj = obj1;
	//   65  127:aload           10
	//   66  129:astore          9
		int i;
		int j;
		for(i = 0; jsonparser.getCurrentToken() != JsonToken.END_OBJECT; i = j)
	//*  67  131:iconst_0        
	//*  68  132:istore_3        
	//*  69  133:aload_1         
	//*  70  134:invokevirtual   #94  <Method JsonToken JsonParser.getCurrentToken()>
	//*  71  137:getstatic       #100 <Field JsonToken JsonToken.END_OBJECT>
	//*  72  140:if_acmpeq       448
		{
			Object obj2 = ((Object) (jsonparser.getCurrentName()));
	//   73  143:aload_1         
	//   74  144:invokevirtual   #104 <Method String JsonParser.getCurrentName()>
	//   75  147:astore          11
			SettableBeanProperty settablebeanproperty = _beanProperties.find(((String) (obj2)));
	//   76  149:aload_0         
	//   77  150:getfield        #108 <Field BeanPropertyMap _beanProperties>
	//   78  153:aload           11
	//   79  155:invokevirtual   #114 <Method SettableBeanProperty BeanPropertyMap.find(String)>
	//   80  158:astore          12
			jsonparser.nextToken();
	//   81  160:aload_1         
	//   82  161:invokevirtual   #117 <Method JsonToken JsonParser.nextToken()>
	//   83  164:pop             
			if(settablebeanproperty != null)
	//*  84  165:aload           12
	//*  85  167:ifnull          254
			{
				if(obj1 != null)
	//*  86  170:aload           10
	//*  87  172:ifnull          194
				{
					settablebeanproperty.deserializeAndSet(jsonparser, deserializationcontext, obj1);
	//   88  175:aload           12
	//   89  177:aload_1         
	//   90  178:aload_2         
	//   91  179:aload           10
	//   92  181:invokevirtual   #123 <Method void SettableBeanProperty.deserializeAndSet(JsonParser, DeserializationContext, Object)>
					obj2 = obj;
	//   93  184:aload           9
	//   94  186:astore          11
					j = i;
	//   95  188:iload_3         
	//   96  189:istore          4
				} else
	//*  97  191:goto            433
				{
					obj2 = obj;
	//   98  194:aload           9
	//   99  196:astore          11
					if(obj == null)
	//* 100  198:aload           9
	//* 101  200:ifnonnull       222
					{
						j = _beanProperties.size();
	//  102  203:aload_0         
	//  103  204:getfield        #108 <Field BeanPropertyMap _beanProperties>
	//  104  207:invokevirtual   #127 <Method int BeanPropertyMap.size()>
	//  105  210:istore          4
						obj2 = ((Object) (new Object[j + j]));
	//  106  212:iload           4
	//  107  214:iload           4
	//  108  216:iadd            
	//  109  217:anewarray       Object[]
	//  110  220:astore          11
					}
					int l = i + 1;
	//  111  222:iload_3         
	//  112  223:iconst_1        
	//  113  224:iadd            
	//  114  225:istore          6
					obj2[i] = ((/*<invalid signature>*/java.lang.Object) (settablebeanproperty));
	//  115  227:aload           11
	//  116  229:iload_3         
	//  117  230:aload           12
	//  118  232:aastore         
					j = l + 1;
	//  119  233:iload           6
	//  120  235:iconst_1        
	//  121  236:iadd            
	//  122  237:istore          4
					obj2[l] = ((/*<invalid signature>*/java.lang.Object) (settablebeanproperty.deserialize(jsonparser, deserializationcontext)));
	//  123  239:aload           11
	//  124  241:iload           6
	//  125  243:aload           12
	//  126  245:aload_1         
	//  127  246:aload_2         
	//  128  247:invokevirtual   #128 <Method Object SettableBeanProperty.deserialize(JsonParser, DeserializationContext)>
	//  129  250:aastore         
				}
			} else
	//* 130  251:goto            433
			if("message".equals(obj2) && flag1)
	//* 131  254:ldc1            #130 <String "message">
	//* 132  256:aload           11
	//* 133  258:invokevirtual   #136 <Method boolean String.equals(Object)>
	//* 134  261:ifeq            350
	//* 135  264:iload           7
	//* 136  266:ifeq            350
			{
				Object obj4 = _valueInstantiator.createFromString(deserializationcontext, jsonparser.getValueAsString());
	//  137  269:aload_0         
	//  138  270:getfield        #41  <Field ValueInstantiator _valueInstantiator>
	//  139  273:aload_2         
	//  140  274:aload_1         
	//  141  275:invokevirtual   #139 <Method String JsonParser.getValueAsString()>
	//  142  278:invokevirtual   #143 <Method Object ValueInstantiator.createFromString(DeserializationContext, String)>
	//  143  281:astore          12
				obj1 = obj4;
	//  144  283:aload           12
	//  145  285:astore          10
				obj2 = obj;
	//  146  287:aload           9
	//  147  289:astore          11
				j = i;
	//  148  291:iload_3         
	//  149  292:istore          4
				if(obj != null)
	//* 150  294:aload           9
	//* 151  296:ifnull          433
				{
					for(j = 0; j < i; j += 2)
	//* 152  299:iconst_0        
	//* 153  300:istore          4
	//* 154  302:iload           4
	//* 155  304:iload_3         
	//* 156  305:icmpge          337
						((SettableBeanProperty)obj[j]).set(obj4, ((Object) (obj[j + 1])));
	//  157  308:aload           9
	//  158  310:iload           4
	//  159  312:aaload          
	//  160  313:checkcast       #119 <Class SettableBeanProperty>
	//  161  316:aload           12
	//  162  318:aload           9
	//  163  320:iload           4
	//  164  322:iconst_1        
	//  165  323:iadd            
	//  166  324:aaload          
	//  167  325:invokevirtual   #147 <Method void SettableBeanProperty.set(Object, Object)>

	//  168  328:iload           4
	//  169  330:iconst_2        
	//  170  331:iadd            
	//  171  332:istore          4
	//* 172  334:goto            302
					obj2 = null;
	//  173  337:aconst_null     
	//  174  338:astore          11
					obj1 = obj4;
	//  175  340:aload           12
	//  176  342:astore          10
					j = i;
	//  177  344:iload_3         
	//  178  345:istore          4
				}
			} else
	//* 179  347:goto            433
			if(_ignorableProps != null && _ignorableProps.contains(obj2))
	//* 180  350:aload_0         
	//* 181  351:getfield        #151 <Field Set _ignorableProps>
	//* 182  354:ifnull          386
	//* 183  357:aload_0         
	//* 184  358:getfield        #151 <Field Set _ignorableProps>
	//* 185  361:aload           11
	//* 186  363:invokeinterface #156 <Method boolean Set.contains(Object)>
	//* 187  368:ifeq            386
			{
				jsonparser.skipChildren();
	//  188  371:aload_1         
	//  189  372:invokevirtual   #160 <Method JsonParser JsonParser.skipChildren()>
	//  190  375:pop             
				obj2 = obj;
	//  191  376:aload           9
	//  192  378:astore          11
				j = i;
	//  193  380:iload_3         
	//  194  381:istore          4
			} else
	//* 195  383:goto            433
			if(_anySetter != null)
	//* 196  386:aload_0         
	//* 197  387:getfield        #164 <Field SettableAnyProperty _anySetter>
	//* 198  390:ifnull          416
			{
				_anySetter.deserializeAndSet(jsonparser, deserializationcontext, obj1, ((String) (obj2)));
	//  199  393:aload_0         
	//  200  394:getfield        #164 <Field SettableAnyProperty _anySetter>
	//  201  397:aload_1         
	//  202  398:aload_2         
	//  203  399:aload           10
	//  204  401:aload           11
	//  205  403:invokevirtual   #169 <Method void SettableAnyProperty.deserializeAndSet(JsonParser, DeserializationContext, Object, String)>
				obj2 = obj;
	//  206  406:aload           9
	//  207  408:astore          11
				j = i;
	//  208  410:iload_3         
	//  209  411:istore          4
			} else
	//* 210  413:goto            433
			{
				handleUnknownProperty(jsonparser, deserializationcontext, obj1, ((String) (obj2)));
	//  211  416:aload_0         
	//  212  417:aload_1         
	//  213  418:aload_2         
	//  214  419:aload           10
	//  215  421:aload           11
	//  216  423:invokevirtual   #172 <Method void handleUnknownProperty(JsonParser, DeserializationContext, Object, String)>
				j = i;
	//  217  426:iload_3         
	//  218  427:istore          4
				obj2 = obj;
	//  219  429:aload           9
	//  220  431:astore          11
			}
			jsonparser.nextToken();
	//  221  433:aload_1         
	//  222  434:invokevirtual   #117 <Method JsonToken JsonParser.nextToken()>
	//  223  437:pop             
			obj = obj2;
	//  224  438:aload           11
	//  225  440:astore          9
		}

	//  226  442:iload           4
	//  227  444:istore_3        
	//* 228  445:goto            133
		Object obj3 = obj1;
	//  229  448:aload           10
	//  230  450:astore          11
		if(obj1 == null)
	//* 231  452:aload           10
	//* 232  454:ifnonnull       533
		{
			if(flag1)
	//* 233  457:iload           7
	//* 234  459:ifeq            475
				jsonparser = ((JsonParser) (_valueInstantiator.createFromString(deserializationcontext, ((String) (null)))));
	//  235  462:aload_0         
	//  236  463:getfield        #41  <Field ValueInstantiator _valueInstantiator>
	//  237  466:aload_2         
	//  238  467:aconst_null     
	//  239  468:invokevirtual   #143 <Method Object ValueInstantiator.createFromString(DeserializationContext, String)>
	//  240  471:astore_1        
			else
	//* 241  472:goto            484
				jsonparser = ((JsonParser) (_valueInstantiator.createUsingDefault(deserializationcontext)));
	//  242  475:aload_0         
	//  243  476:getfield        #41  <Field ValueInstantiator _valueInstantiator>
	//  244  479:aload_2         
	//  245  480:invokevirtual   #176 <Method Object ValueInstantiator.createUsingDefault(DeserializationContext)>
	//  246  483:astore_1        
			obj3 = ((Object) (jsonparser));
	//  247  484:aload_1         
	//  248  485:astore          11
			if(obj != null)
	//* 249  487:aload           9
	//* 250  489:ifnull          533
			{
				int k = ((int) (flag));
	//  251  492:iload           5
	//  252  494:istore          4
				do
				{
					obj3 = ((Object) (jsonparser));
	//  253  496:aload_1         
	//  254  497:astore          11
					if(k >= i)
						break;
	//  255  499:iload           4
	//  256  501:iload_3         
	//  257  502:icmpge          533
					((SettableBeanProperty)obj[k]).set(((Object) (jsonparser)), ((Object) (obj[k + 1])));
	//  258  505:aload           9
	//  259  507:iload           4
	//  260  509:aaload          
	//  261  510:checkcast       #119 <Class SettableBeanProperty>
	//  262  513:aload_1         
	//  263  514:aload           9
	//  264  516:iload           4
	//  265  518:iconst_1        
	//  266  519:iadd            
	//  267  520:aaload          
	//  268  521:invokevirtual   #147 <Method void SettableBeanProperty.set(Object, Object)>
					k += 2;
	//  269  524:iload           4
	//  270  526:iconst_2        
	//  271  527:iadd            
	//  272  528:istore          4
				} while(true);
	//  273  530:goto            496
			}
		}
		return obj3;
	//  274  533:aload           11
	//  275  535:areturn         
	}

	public JsonDeserializer unwrappingDeserializer(NameTransformer nametransformer)
	{
		if(((Object)this).getClass() != com/fasterxml/jackson/databind/deser/std/ThrowableDeserializer)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #182 <Method Class Object.getClass()>
	//*   2    4:ldc1            #2   <Class ThrowableDeserializer>
	//*   3    6:if_acmpeq       11
			return ((JsonDeserializer) (this));
	//    4    9:aload_0         
	//    5   10:areturn         
		else
			return ((JsonDeserializer) (new ThrowableDeserializer(((BeanDeserializer) (this)), nametransformer)));
	//    6   11:new             #2   <Class ThrowableDeserializer>
	//    7   14:dup             
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:invokespecial   #184 <Method void ThrowableDeserializer(BeanDeserializer, NameTransformer)>
	//   11   20:areturn         
	}

	private static final long serialVersionUID = 1L;
}
