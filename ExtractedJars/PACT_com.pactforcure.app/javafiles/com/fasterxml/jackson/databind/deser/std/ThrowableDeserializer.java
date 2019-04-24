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
import java.util.HashSet;

public class ThrowableDeserializer extends BeanDeserializer
{

	public ThrowableDeserializer(BeanDeserializer beandeserializer)
	{
		super(((com.fasterxml.jackson.databind.deser.BeanDeserializerBase) (beandeserializer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #17  <Method void BeanDeserializer(com.fasterxml.jackson.databind.deser.BeanDeserializerBase)>
		_vanillaProcessing = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #21  <Field boolean _vanillaProcessing>
	//    6   10:return          
	}

	protected ThrowableDeserializer(BeanDeserializer beandeserializer, NameTransformer nametransformer)
	{
		super(((com.fasterxml.jackson.databind.deser.BeanDeserializerBase) (beandeserializer)), nametransformer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #26  <Method void BeanDeserializer(com.fasterxml.jackson.databind.deser.BeanDeserializerBase, NameTransformer)>
	//    4    6:return          
	}

	public Object deserializeFromObject(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(_propertyBasedCreator == null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator _propertyBasedCreator>
	//    2    4:ifnull          16
_L1:
		jsonparser = ((JsonParser) (_deserializeUsingPropertyBased(jsonparser, deserializationcontext)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #37  <Method Object _deserializeUsingPropertyBased(JsonParser, DeserializationContext)>
	//    7   13:astore_1        
_L4:
		return ((Object) (jsonparser));
	//    8   14:aload_1         
	//    9   15:areturn         
_L2:
		if(_delegateDeserializer != null)
	//*  10   16:aload_0         
	//*  11   17:getfield        #41  <Field JsonDeserializer _delegateDeserializer>
	//*  12   20:ifnull          41
			return _valueInstantiator.createUsingDelegate(deserializationcontext, _delegateDeserializer.deserialize(jsonparser, deserializationcontext));
	//   13   23:aload_0         
	//   14   24:getfield        #45  <Field ValueInstantiator _valueInstantiator>
	//   15   27:aload_2         
	//   16   28:aload_0         
	//   17   29:getfield        #41  <Field JsonDeserializer _delegateDeserializer>
	//   18   32:aload_1         
	//   19   33:aload_2         
	//   20   34:invokevirtual   #50  <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   21   37:invokevirtual   #56  <Method Object ValueInstantiator.createUsingDelegate(DeserializationContext, Object)>
	//   22   40:areturn         
		if(_beanType.isAbstract())
	//*  23   41:aload_0         
	//*  24   42:getfield        #60  <Field JavaType _beanType>
	//*  25   45:invokevirtual   #66  <Method boolean JavaType.isAbstract()>
	//*  26   48:ifeq            83
			throw JsonMappingException.from(jsonparser, (new StringBuilder()).append("Can not instantiate abstract type ").append(((Object) (_beanType))).append(" (need to add/enable type information?)").toString());
	//   27   51:aload_1         
	//   28   52:new             #68  <Class StringBuilder>
	//   29   55:dup             
	//   30   56:invokespecial   #71  <Method void StringBuilder()>
	//   31   59:ldc1            #73  <String "Can not instantiate abstract type ">
	//   32   61:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   33   64:aload_0         
	//   34   65:getfield        #60  <Field JavaType _beanType>
	//   35   68:invokevirtual   #80  <Method StringBuilder StringBuilder.append(Object)>
	//   36   71:ldc1            #82  <String " (need to add/enable type information?)">
	//   37   73:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   38   76:invokevirtual   #86  <Method String StringBuilder.toString()>
	//   39   79:invokestatic    #92  <Method JsonMappingException JsonMappingException.from(JsonParser, String)>
	//   40   82:athrow          
		boolean flag = _valueInstantiator.canCreateFromString();
	//   41   83:aload_0         
	//   42   84:getfield        #45  <Field ValueInstantiator _valueInstantiator>
	//   43   87:invokevirtual   #95  <Method boolean ValueInstantiator.canCreateFromString()>
	//   44   90:istore          6
		boolean flag1 = _valueInstantiator.canCreateUsingDefault();
	//   45   92:aload_0         
	//   46   93:getfield        #45  <Field ValueInstantiator _valueInstantiator>
	//   47   96:invokevirtual   #98  <Method boolean ValueInstantiator.canCreateUsingDefault()>
	//   48   99:istore          7
		if(!flag && !flag1)
	//*  49  101:iload           6
	//*  50  103:ifne            143
	//*  51  106:iload           7
	//*  52  108:ifne            143
			throw JsonMappingException.from(jsonparser, (new StringBuilder()).append("Can not deserialize Throwable of type ").append(((Object) (_beanType))).append(" without having a default contructor, a single-String-arg constructor; or explicit @JsonCreator").toString());
	//   53  111:aload_1         
	//   54  112:new             #68  <Class StringBuilder>
	//   55  115:dup             
	//   56  116:invokespecial   #71  <Method void StringBuilder()>
	//   57  119:ldc1            #100 <String "Can not deserialize Throwable of type ">
	//   58  121:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   59  124:aload_0         
	//   60  125:getfield        #60  <Field JavaType _beanType>
	//   61  128:invokevirtual   #80  <Method StringBuilder StringBuilder.append(Object)>
	//   62  131:ldc1            #102 <String " without having a default contructor, a single-String-arg constructor; or explicit @JsonCreator">
	//   63  133:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   64  136:invokevirtual   #86  <Method String StringBuilder.toString()>
	//   65  139:invokestatic    #92  <Method JsonMappingException JsonMappingException.from(JsonParser, String)>
	//   66  142:athrow          
		Object obj1 = null;
	//   67  143:aconst_null     
	//   68  144:astore          9
		Object obj = null;
	//   69  146:aconst_null     
	//   70  147:astore          8
		int i = 0;
	//   71  149:iconst_0        
	//   72  150:istore_3        
		while(jsonparser.getCurrentToken() != JsonToken.END_OBJECT) 
	//*  73  151:aload_1         
	//*  74  152:invokevirtual   #108 <Method JsonToken JsonParser.getCurrentToken()>
	//*  75  155:getstatic       #114 <Field JsonToken JsonToken.END_OBJECT>
	//*  76  158:if_acmpeq       464
		{
			Object obj2 = ((Object) (jsonparser.getCurrentName()));
	//   77  161:aload_1         
	//   78  162:invokevirtual   #117 <Method String JsonParser.getCurrentName()>
	//   79  165:astore          10
			SettableBeanProperty settablebeanproperty = _beanProperties.find(((String) (obj2)));
	//   80  167:aload_0         
	//   81  168:getfield        #121 <Field BeanPropertyMap _beanProperties>
	//   82  171:aload           10
	//   83  173:invokevirtual   #127 <Method SettableBeanProperty BeanPropertyMap.find(String)>
	//   84  176:astore          11
			jsonparser.nextToken();
	//   85  178:aload_1         
	//   86  179:invokevirtual   #130 <Method JsonToken JsonParser.nextToken()>
	//   87  182:pop             
			int j;
			if(settablebeanproperty != null)
	//*  88  183:aload           11
	//*  89  185:ifnull          284
			{
				if(obj1 != null)
	//*  90  188:aload           9
	//*  91  190:ifnull          224
				{
					settablebeanproperty.deserializeAndSet(jsonparser, deserializationcontext, obj1);
	//   92  193:aload           11
	//   93  195:aload_1         
	//   94  196:aload_2         
	//   95  197:aload           9
	//   96  199:invokevirtual   #136 <Method void SettableBeanProperty.deserializeAndSet(JsonParser, DeserializationContext, Object)>
					j = i;
	//   97  202:iload_3         
	//   98  203:istore          4
					obj2 = obj;
	//   99  205:aload           8
	//  100  207:astore          10
				} else
	//* 101  209:aload_1         
	//* 102  210:invokevirtual   #130 <Method JsonToken JsonParser.nextToken()>
	//* 103  213:pop             
	//* 104  214:aload           10
	//* 105  216:astore          8
	//* 106  218:iload           4
	//* 107  220:istore_3        
	//* 108  221:goto            151
				{
					obj2 = obj;
	//  109  224:aload           8
	//  110  226:astore          10
					if(obj == null)
	//* 111  228:aload           8
	//* 112  230:ifnonnull       252
					{
						j = _beanProperties.size();
	//  113  233:aload_0         
	//  114  234:getfield        #121 <Field BeanPropertyMap _beanProperties>
	//  115  237:invokevirtual   #140 <Method int BeanPropertyMap.size()>
	//  116  240:istore          4
						obj2 = ((Object) (new Object[j + j]));
	//  117  242:iload           4
	//  118  244:iload           4
	//  119  246:iadd            
	//  120  247:anewarray       Object[]
	//  121  250:astore          10
					}
					int l = i + 1;
	//  122  252:iload_3         
	//  123  253:iconst_1        
	//  124  254:iadd            
	//  125  255:istore          5
					obj2[i] = ((/*<invalid signature>*/java.lang.Object) (settablebeanproperty));
	//  126  257:aload           10
	//  127  259:iload_3         
	//  128  260:aload           11
	//  129  262:aastore         
					j = l + 1;
	//  130  263:iload           5
	//  131  265:iconst_1        
	//  132  266:iadd            
	//  133  267:istore          4
					obj2[l] = ((/*<invalid signature>*/java.lang.Object) (settablebeanproperty.deserialize(jsonparser, deserializationcontext)));
	//  134  269:aload           10
	//  135  271:iload           5
	//  136  273:aload           11
	//  137  275:aload_1         
	//  138  276:aload_2         
	//  139  277:invokevirtual   #143 <Method Object SettableBeanProperty.deserialize(JsonParser, DeserializationContext)>
	//  140  280:aastore         
				}
			} else
	//* 141  281:goto            209
			if("message".equals(obj2) && flag)
	//* 142  284:ldc1            #8   <String "message">
	//* 143  286:aload           10
	//* 144  288:invokevirtual   #149 <Method boolean String.equals(Object)>
	//* 145  291:ifeq            380
	//* 146  294:iload           6
	//* 147  296:ifeq            380
			{
				Object obj3 = _valueInstantiator.createFromString(deserializationcontext, jsonparser.getText());
	//  148  299:aload_0         
	//  149  300:getfield        #45  <Field ValueInstantiator _valueInstantiator>
	//  150  303:aload_2         
	//  151  304:aload_1         
	//  152  305:invokevirtual   #152 <Method String JsonParser.getText()>
	//  153  308:invokevirtual   #156 <Method Object ValueInstantiator.createFromString(DeserializationContext, String)>
	//  154  311:astore          11
				obj2 = obj;
	//  155  313:aload           8
	//  156  315:astore          10
				j = i;
	//  157  317:iload_3         
	//  158  318:istore          4
				obj1 = obj3;
	//  159  320:aload           11
	//  160  322:astore          9
				if(obj != null)
	//* 161  324:aload           8
	//* 162  326:ifnull          209
				{
					for(j = 0; j < i; j += 2)
	//* 163  329:iconst_0        
	//* 164  330:istore          4
	//* 165  332:iload           4
	//* 166  334:iload_3         
	//* 167  335:icmpge          367
						((SettableBeanProperty)obj[j]).set(obj3, ((Object) (obj[j + 1])));
	//  168  338:aload           8
	//  169  340:iload           4
	//  170  342:aaload          
	//  171  343:checkcast       #132 <Class SettableBeanProperty>
	//  172  346:aload           11
	//  173  348:aload           8
	//  174  350:iload           4
	//  175  352:iconst_1        
	//  176  353:iadd            
	//  177  354:aaload          
	//  178  355:invokevirtual   #160 <Method void SettableBeanProperty.set(Object, Object)>

	//  179  358:iload           4
	//  180  360:iconst_2        
	//  181  361:iadd            
	//  182  362:istore          4
	//* 183  364:goto            332
					obj2 = null;
	//  184  367:aconst_null     
	//  185  368:astore          10
					j = i;
	//  186  370:iload_3         
	//  187  371:istore          4
					obj1 = obj3;
	//  188  373:aload           11
	//  189  375:astore          9
				}
			} else
	//* 190  377:goto            209
			if(_ignorableProps != null && _ignorableProps.contains(obj2))
	//* 191  380:aload_0         
	//* 192  381:getfield        #164 <Field HashSet _ignorableProps>
	//* 193  384:ifnull          414
	//* 194  387:aload_0         
	//* 195  388:getfield        #164 <Field HashSet _ignorableProps>
	//* 196  391:aload           10
	//* 197  393:invokevirtual   #169 <Method boolean HashSet.contains(Object)>
	//* 198  396:ifeq            414
			{
				jsonparser.skipChildren();
	//  199  399:aload_1         
	//  200  400:invokevirtual   #173 <Method JsonParser JsonParser.skipChildren()>
	//  201  403:pop             
				obj2 = obj;
	//  202  404:aload           8
	//  203  406:astore          10
				j = i;
	//  204  408:iload_3         
	//  205  409:istore          4
			} else
	//* 206  411:goto            209
			if(_anySetter != null)
	//* 207  414:aload_0         
	//* 208  415:getfield        #177 <Field SettableAnyProperty _anySetter>
	//* 209  418:ifnull          444
			{
				_anySetter.deserializeAndSet(jsonparser, deserializationcontext, obj1, ((String) (obj2)));
	//  210  421:aload_0         
	//  211  422:getfield        #177 <Field SettableAnyProperty _anySetter>
	//  212  425:aload_1         
	//  213  426:aload_2         
	//  214  427:aload           9
	//  215  429:aload           10
	//  216  431:invokevirtual   #182 <Method void SettableAnyProperty.deserializeAndSet(JsonParser, DeserializationContext, Object, String)>
				obj2 = obj;
	//  217  434:aload           8
	//  218  436:astore          10
				j = i;
	//  219  438:iload_3         
	//  220  439:istore          4
			} else
	//* 221  441:goto            209
			{
				handleUnknownProperty(jsonparser, deserializationcontext, obj1, ((String) (obj2)));
	//  222  444:aload_0         
	//  223  445:aload_1         
	//  224  446:aload_2         
	//  225  447:aload           9
	//  226  449:aload           10
	//  227  451:invokevirtual   #185 <Method void handleUnknownProperty(JsonParser, DeserializationContext, Object, String)>
				obj2 = obj;
	//  228  454:aload           8
	//  229  456:astore          10
				j = i;
	//  230  458:iload_3         
	//  231  459:istore          4
			}
			jsonparser.nextToken();
			obj = obj2;
			i = j;
		}
	//* 232  461:goto            209
		jsonparser = ((JsonParser) (obj1));
	//  233  464:aload           9
	//  234  466:astore_1        
		if(obj1 != null)
			continue;
	//  235  467:aload           9
	//  236  469:ifnonnull       14
		int k;
		if(flag)
	//* 237  472:iload           6
	//* 238  474:ifeq            533
			deserializationcontext = ((DeserializationContext) (_valueInstantiator.createFromString(deserializationcontext, ((String) (null)))));
	//  239  477:aload_0         
	//  240  478:getfield        #45  <Field ValueInstantiator _valueInstantiator>
	//  241  481:aload_2         
	//  242  482:aconst_null     
	//  243  483:invokevirtual   #156 <Method Object ValueInstantiator.createFromString(DeserializationContext, String)>
	//  244  486:astore_2        
		else
	//* 245  487:aload_2         
	//* 246  488:astore_1        
	//* 247  489:aload           8
	//* 248  491:ifnull          14
	//* 249  494:iconst_0        
	//* 250  495:istore          4
	//* 251  497:aload_2         
	//* 252  498:astore_1        
	//* 253  499:iload           4
	//* 254  501:iload_3         
	//* 255  502:icmpge          14
	//* 256  505:aload           8
	//* 257  507:iload           4
	//* 258  509:aaload          
	//* 259  510:checkcast       #132 <Class SettableBeanProperty>
	//* 260  513:aload_2         
	//* 261  514:aload           8
	//* 262  516:iload           4
	//* 263  518:iconst_1        
	//* 264  519:iadd            
	//* 265  520:aaload          
	//* 266  521:invokevirtual   #160 <Method void SettableBeanProperty.set(Object, Object)>
	//* 267  524:iload           4
	//* 268  526:iconst_2        
	//* 269  527:iadd            
	//* 270  528:istore          4
	//* 271  530:goto            497
			deserializationcontext = ((DeserializationContext) (_valueInstantiator.createUsingDefault(deserializationcontext)));
	//  272  533:aload_0         
	//  273  534:getfield        #45  <Field ValueInstantiator _valueInstantiator>
	//  274  537:aload_2         
	//  275  538:invokevirtual   #189 <Method Object ValueInstantiator.createUsingDefault(DeserializationContext)>
	//  276  541:astore_2        
		jsonparser = ((JsonParser) (deserializationcontext));
		if(obj == null)
			continue;
		k = 0;
		do
		{
			jsonparser = ((JsonParser) (deserializationcontext));
			if(k >= i)
				continue;
			((SettableBeanProperty)obj[k]).set(((Object) (deserializationcontext)), ((Object) (obj[k + 1])));
			k += 2;
		} while(true);
		if(true) goto _L4; else goto _L3
_L3:
	//* 277  542:goto            487
	}

	public JsonDeserializer unwrappingDeserializer(NameTransformer nametransformer)
	{
		if(((Object)this).getClass() != com/fasterxml/jackson/databind/deser/std/ThrowableDeserializer)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #196 <Method Class Object.getClass()>
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
	//   10   17:invokespecial   #198 <Method void ThrowableDeserializer(BeanDeserializer, NameTransformer)>
	//   11   20:areturn         
	}

	protected static final String PROP_NAME_MESSAGE = "message";
	private static final long serialVersionUID = 1L;
}
