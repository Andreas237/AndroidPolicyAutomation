// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

// Referenced classes of package com.fasterxml.jackson.core.filter:
//			TokenFilterContext, TokenFilter

public class FilteringParserDelegate extends JsonParserDelegate
{

	public FilteringParserDelegate(JsonParser jsonparser, TokenFilter tokenfilter, boolean flag, boolean flag1)
	{
		super(jsonparser);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #25  <Method void JsonParserDelegate(JsonParser)>
		rootFilter = tokenfilter;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #27  <Field TokenFilter rootFilter>
		_itemFilter = tokenfilter;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #29  <Field TokenFilter _itemFilter>
		_headContext = TokenFilterContext.createRootContext(tokenfilter);
	//    9   15:aload_0         
	//   10   16:aload_2         
	//   11   17:invokestatic    #35  <Method TokenFilterContext TokenFilterContext.createRootContext(TokenFilter)>
	//   12   20:putfield        #37  <Field TokenFilterContext _headContext>
		_includePath = flag;
	//   13   23:aload_0         
	//   14   24:iload_3         
	//   15   25:putfield        #39  <Field boolean _includePath>
		_allowMultipleMatches = flag1;
	//   16   28:aload_0         
	//   17   29:iload           4
	//   18   31:putfield        #41  <Field boolean _allowMultipleMatches>
	//   19   34:return          
	}

	private JsonToken _nextBuffered(TokenFilterContext tokenfiltercontext)
		throws IOException
	{
		_exposedContext = tokenfiltercontext;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #48  <Field TokenFilterContext _exposedContext>
		JsonToken jsontoken = tokenfiltercontext.nextTokenToRead();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #52  <Method JsonToken TokenFilterContext.nextTokenToRead()>
	//    5    9:astore_2        
		if(jsontoken != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          16
			return jsontoken;
	//    8   14:aload_2         
	//    9   15:areturn         
		do
		{
			if(tokenfiltercontext == _headContext)
	//*  10   16:aload_1         
	//*  11   17:aload_0         
	//*  12   18:getfield        #37  <Field TokenFilterContext _headContext>
	//*  13   21:if_acmpne       31
				throw _constructError("Internal error: failed to locate expected buffered tokens");
	//   14   24:aload_0         
	//   15   25:ldc1            #54  <String "Internal error: failed to locate expected buffered tokens">
	//   16   27:invokevirtual   #58  <Method com.fasterxml.jackson.core.JsonParseException _constructError(String)>
	//   17   30:athrow          
			tokenfiltercontext = _exposedContext.findChildOf(tokenfiltercontext);
	//   18   31:aload_0         
	//   19   32:getfield        #48  <Field TokenFilterContext _exposedContext>
	//   20   35:aload_1         
	//   21   36:invokevirtual   #62  <Method TokenFilterContext TokenFilterContext.findChildOf(TokenFilterContext)>
	//   22   39:astore_1        
			_exposedContext = tokenfiltercontext;
	//   23   40:aload_0         
	//   24   41:aload_1         
	//   25   42:putfield        #48  <Field TokenFilterContext _exposedContext>
			if(tokenfiltercontext == null)
	//*  26   45:aload_1         
	//*  27   46:ifnonnull       56
				throw _constructError("Unexpected problem: chain of filtered context broken");
	//   28   49:aload_0         
	//   29   50:ldc1            #64  <String "Unexpected problem: chain of filtered context broken">
	//   30   52:invokevirtual   #58  <Method com.fasterxml.jackson.core.JsonParseException _constructError(String)>
	//   31   55:athrow          
			jsontoken = _exposedContext.nextTokenToRead();
	//   32   56:aload_0         
	//   33   57:getfield        #48  <Field TokenFilterContext _exposedContext>
	//   34   60:invokevirtual   #52  <Method JsonToken TokenFilterContext.nextTokenToRead()>
	//   35   63:astore_2        
		} while(jsontoken == null);
	//   36   64:aload_2         
	//   37   65:ifnull          16
		return jsontoken;
	//   38   68:aload_2         
	//   39   69:areturn         
	}

	protected JsonStreamContext _filterContext()
	{
		if(_exposedContext != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field TokenFilterContext _exposedContext>
	//*   2    4:ifnull          12
			return ((JsonStreamContext) (_exposedContext));
	//    3    7:aload_0         
	//    4    8:getfield        #48  <Field TokenFilterContext _exposedContext>
	//    5   11:areturn         
		else
			return ((JsonStreamContext) (_headContext));
	//    6   12:aload_0         
	//    7   13:getfield        #37  <Field TokenFilterContext _headContext>
	//    8   16:areturn         
	}

	protected final JsonToken _nextToken2()
		throws IOException
	{
		Object obj;
		JsonToken jsontoken;
		do
		{
label0:
			do
			{
				do
				{
label1:
					do
					{
						do
						{
label2:
							do
							{
								jsontoken = _flddelegate.nextToken();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #77  <Method JsonToken JsonParser.nextToken()>
	//    3    7:astore          4
								if(jsontoken == null)
	//*   4    9:aload           4
	//*   5   11:ifnonnull       23
								{
									_currToken = jsontoken;
	//    6   14:aload_0         
	//    7   15:aload           4
	//    8   17:putfield        #79  <Field JsonToken _currToken>
									return jsontoken;
	//    9   20:aload           4
	//   10   22:areturn         
								}
								switch(jsontoken.id())
	//*  11   23:aload           4
	//*  12   25:invokevirtual   #85  <Method int JsonToken.id()>
								{
	//*  13   28:tableswitch     1 5: default 64
	//	               1 246
	//	               2 407
	//	               3 85
	//	               4 407
	//	               5 473
								default:
									obj = ((Object) (_itemFilter));
	//   14   64:aload_0         
	//   15   65:getfield        #29  <Field TokenFilter _itemFilter>
	//   16   68:astore_2        
									if(obj == TokenFilter.INCLUDE_ALL)
	//*  17   69:aload_2         
	//*  18   70:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//*  19   73:if_acmpne       618
									{
										_currToken = jsontoken;
	//   20   76:aload_0         
	//   21   77:aload           4
	//   22   79:putfield        #79  <Field JsonToken _currToken>
										return jsontoken;
	//   23   82:aload           4
	//   24   84:areturn         
									}
									continue label0;

								case 3: // '\003'
									obj = ((Object) (_itemFilter));
	//   25   85:aload_0         
	//   26   86:getfield        #29  <Field TokenFilter _itemFilter>
	//   27   89:astore_2        
									if(obj == TokenFilter.INCLUDE_ALL)
	//*  28   90:aload_2         
	//*  29   91:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//*  30   94:if_acmpne       119
									{
										_headContext = _headContext.createChildArrayContext(((TokenFilter) (obj)), true);
	//   31   97:aload_0         
	//   32   98:aload_0         
	//   33   99:getfield        #37  <Field TokenFilterContext _headContext>
	//   34  102:aload_2         
	//   35  103:iconst_1        
	//   36  104:invokevirtual   #94  <Method TokenFilterContext TokenFilterContext.createChildArrayContext(TokenFilter, boolean)>
	//   37  107:putfield        #37  <Field TokenFilterContext _headContext>
										_currToken = jsontoken;
	//   38  110:aload_0         
	//   39  111:aload           4
	//   40  113:putfield        #79  <Field JsonToken _currToken>
										return jsontoken;
	//   41  116:aload           4
	//   42  118:areturn         
									}
									if(obj == null)
	//*  43  119:aload_2         
	//*  44  120:ifnonnull       134
									{
										_flddelegate.skipChildren();
	//   45  123:aload_0         
	//   46  124:getfield        #72  <Field JsonParser _flddelegate>
	//   47  127:invokevirtual   #98  <Method JsonParser JsonParser.skipChildren()>
	//   48  130:pop             
									} else
	//*  49  131:goto            0
									{
										TokenFilter tokenfilter = _headContext.checkValue(((TokenFilter) (obj)));
	//   50  134:aload_0         
	//   51  135:getfield        #37  <Field TokenFilterContext _headContext>
	//   52  138:aload_2         
	//   53  139:invokevirtual   #102 <Method TokenFilter TokenFilterContext.checkValue(TokenFilter)>
	//   54  142:astore_3        
										if(tokenfilter == null)
	//*  55  143:aload_3         
	//*  56  144:ifnonnull       158
										{
											_flddelegate.skipChildren();
	//   57  147:aload_0         
	//   58  148:getfield        #72  <Field JsonParser _flddelegate>
	//   59  151:invokevirtual   #98  <Method JsonParser JsonParser.skipChildren()>
	//   60  154:pop             
										} else
	//*  61  155:goto            0
										{
											obj = ((Object) (tokenfilter));
	//   62  158:aload_3         
	//   63  159:astore_2        
											if(tokenfilter != TokenFilter.INCLUDE_ALL)
	//*  64  160:aload_3         
	//*  65  161:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//*  66  164:if_acmpeq       172
												obj = ((Object) (tokenfilter.filterStartArray()));
	//   67  167:aload_3         
	//   68  168:invokevirtual   #106 <Method TokenFilter TokenFilter.filterStartArray()>
	//   69  171:astore_2        
											_itemFilter = ((TokenFilter) (obj));
	//   70  172:aload_0         
	//   71  173:aload_2         
	//   72  174:putfield        #29  <Field TokenFilter _itemFilter>
											if(obj == TokenFilter.INCLUDE_ALL)
	//*  73  177:aload_2         
	//*  74  178:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//*  75  181:if_acmpne       206
											{
												_headContext = _headContext.createChildArrayContext(((TokenFilter) (obj)), true);
	//   76  184:aload_0         
	//   77  185:aload_0         
	//   78  186:getfield        #37  <Field TokenFilterContext _headContext>
	//   79  189:aload_2         
	//   80  190:iconst_1        
	//   81  191:invokevirtual   #94  <Method TokenFilterContext TokenFilterContext.createChildArrayContext(TokenFilter, boolean)>
	//   82  194:putfield        #37  <Field TokenFilterContext _headContext>
												_currToken = jsontoken;
	//   83  197:aload_0         
	//   84  198:aload           4
	//   85  200:putfield        #79  <Field JsonToken _currToken>
												return jsontoken;
	//   86  203:aload           4
	//   87  205:areturn         
											}
											_headContext = _headContext.createChildArrayContext(((TokenFilter) (obj)), false);
	//   88  206:aload_0         
	//   89  207:aload_0         
	//   90  208:getfield        #37  <Field TokenFilterContext _headContext>
	//   91  211:aload_2         
	//   92  212:iconst_0        
	//   93  213:invokevirtual   #94  <Method TokenFilterContext TokenFilterContext.createChildArrayContext(TokenFilter, boolean)>
	//   94  216:putfield        #37  <Field TokenFilterContext _headContext>
											if(_includePath)
	//*  95  219:aload_0         
	//*  96  220:getfield        #39  <Field boolean _includePath>
	//*  97  223:ifeq            0
											{
												obj = ((Object) (_nextTokenWithBuffering(_headContext)));
	//   98  226:aload_0         
	//   99  227:aload_0         
	//  100  228:getfield        #37  <Field TokenFilterContext _headContext>
	//  101  231:invokevirtual   #109 <Method JsonToken _nextTokenWithBuffering(TokenFilterContext)>
	//  102  234:astore_2        
												if(obj != null)
	//* 103  235:aload_2         
	//* 104  236:ifnull          0
												{
													_currToken = ((JsonToken) (obj));
	//  105  239:aload_0         
	//  106  240:aload_2         
	//  107  241:putfield        #79  <Field JsonToken _currToken>
													return ((JsonToken) (obj));
	//  108  244:aload_2         
	//  109  245:areturn         
												}
											}
										}
									}
									continue;

								case 1: // '\001'
									obj = ((Object) (_itemFilter));
	//  110  246:aload_0         
	//  111  247:getfield        #29  <Field TokenFilter _itemFilter>
	//  112  250:astore_2        
									if(obj == TokenFilter.INCLUDE_ALL)
	//* 113  251:aload_2         
	//* 114  252:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 115  255:if_acmpne       280
									{
										_headContext = _headContext.createChildObjectContext(((TokenFilter) (obj)), true);
	//  116  258:aload_0         
	//  117  259:aload_0         
	//  118  260:getfield        #37  <Field TokenFilterContext _headContext>
	//  119  263:aload_2         
	//  120  264:iconst_1        
	//  121  265:invokevirtual   #112 <Method TokenFilterContext TokenFilterContext.createChildObjectContext(TokenFilter, boolean)>
	//  122  268:putfield        #37  <Field TokenFilterContext _headContext>
										_currToken = jsontoken;
	//  123  271:aload_0         
	//  124  272:aload           4
	//  125  274:putfield        #79  <Field JsonToken _currToken>
										return jsontoken;
	//  126  277:aload           4
	//  127  279:areturn         
									}
									if(obj == null)
	//* 128  280:aload_2         
	//* 129  281:ifnonnull       295
									{
										_flddelegate.skipChildren();
	//  130  284:aload_0         
	//  131  285:getfield        #72  <Field JsonParser _flddelegate>
	//  132  288:invokevirtual   #98  <Method JsonParser JsonParser.skipChildren()>
	//  133  291:pop             
									} else
	//* 134  292:goto            0
									{
										TokenFilter tokenfilter1 = _headContext.checkValue(((TokenFilter) (obj)));
	//  135  295:aload_0         
	//  136  296:getfield        #37  <Field TokenFilterContext _headContext>
	//  137  299:aload_2         
	//  138  300:invokevirtual   #102 <Method TokenFilter TokenFilterContext.checkValue(TokenFilter)>
	//  139  303:astore_3        
										if(tokenfilter1 == null)
	//* 140  304:aload_3         
	//* 141  305:ifnonnull       319
										{
											_flddelegate.skipChildren();
	//  142  308:aload_0         
	//  143  309:getfield        #72  <Field JsonParser _flddelegate>
	//  144  312:invokevirtual   #98  <Method JsonParser JsonParser.skipChildren()>
	//  145  315:pop             
										} else
	//* 146  316:goto            0
										{
											obj = ((Object) (tokenfilter1));
	//  147  319:aload_3         
	//  148  320:astore_2        
											if(tokenfilter1 != TokenFilter.INCLUDE_ALL)
	//* 149  321:aload_3         
	//* 150  322:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 151  325:if_acmpeq       333
												obj = ((Object) (tokenfilter1.filterStartObject()));
	//  152  328:aload_3         
	//  153  329:invokevirtual   #115 <Method TokenFilter TokenFilter.filterStartObject()>
	//  154  332:astore_2        
											_itemFilter = ((TokenFilter) (obj));
	//  155  333:aload_0         
	//  156  334:aload_2         
	//  157  335:putfield        #29  <Field TokenFilter _itemFilter>
											if(obj == TokenFilter.INCLUDE_ALL)
	//* 158  338:aload_2         
	//* 159  339:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 160  342:if_acmpne       367
											{
												_headContext = _headContext.createChildObjectContext(((TokenFilter) (obj)), true);
	//  161  345:aload_0         
	//  162  346:aload_0         
	//  163  347:getfield        #37  <Field TokenFilterContext _headContext>
	//  164  350:aload_2         
	//  165  351:iconst_1        
	//  166  352:invokevirtual   #112 <Method TokenFilterContext TokenFilterContext.createChildObjectContext(TokenFilter, boolean)>
	//  167  355:putfield        #37  <Field TokenFilterContext _headContext>
												_currToken = jsontoken;
	//  168  358:aload_0         
	//  169  359:aload           4
	//  170  361:putfield        #79  <Field JsonToken _currToken>
												return jsontoken;
	//  171  364:aload           4
	//  172  366:areturn         
											}
											_headContext = _headContext.createChildObjectContext(((TokenFilter) (obj)), false);
	//  173  367:aload_0         
	//  174  368:aload_0         
	//  175  369:getfield        #37  <Field TokenFilterContext _headContext>
	//  176  372:aload_2         
	//  177  373:iconst_0        
	//  178  374:invokevirtual   #112 <Method TokenFilterContext TokenFilterContext.createChildObjectContext(TokenFilter, boolean)>
	//  179  377:putfield        #37  <Field TokenFilterContext _headContext>
											if(_includePath)
	//* 180  380:aload_0         
	//* 181  381:getfield        #39  <Field boolean _includePath>
	//* 182  384:ifeq            0
											{
												obj = ((Object) (_nextTokenWithBuffering(_headContext)));
	//  183  387:aload_0         
	//  184  388:aload_0         
	//  185  389:getfield        #37  <Field TokenFilterContext _headContext>
	//  186  392:invokevirtual   #109 <Method JsonToken _nextTokenWithBuffering(TokenFilterContext)>
	//  187  395:astore_2        
												if(obj != null)
	//* 188  396:aload_2         
	//* 189  397:ifnull          0
												{
													_currToken = ((JsonToken) (obj));
	//  190  400:aload_0         
	//  191  401:aload_2         
	//  192  402:putfield        #79  <Field JsonToken _currToken>
													return ((JsonToken) (obj));
	//  193  405:aload_2         
	//  194  406:areturn         
												}
											}
										}
									}
									continue;

								case 2: // '\002'
								case 4: // '\004'
									boolean flag = _headContext.isStartHandled();
	//  195  407:aload_0         
	//  196  408:getfield        #37  <Field TokenFilterContext _headContext>
	//  197  411:invokevirtual   #119 <Method boolean TokenFilterContext.isStartHandled()>
	//  198  414:istore_1        
									obj = ((Object) (_headContext.getFilter()));
	//  199  415:aload_0         
	//  200  416:getfield        #37  <Field TokenFilterContext _headContext>
	//  201  419:invokevirtual   #122 <Method TokenFilter TokenFilterContext.getFilter()>
	//  202  422:astore_2        
									if(obj != null && obj != TokenFilter.INCLUDE_ALL)
	//* 203  423:aload_2         
	//* 204  424:ifnull          438
	//* 205  427:aload_2         
	//* 206  428:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 207  431:if_acmpeq       438
										((TokenFilter) (obj)).filterFinishArray();
	//  208  434:aload_2         
	//  209  435:invokevirtual   #126 <Method void TokenFilter.filterFinishArray()>
									_headContext = _headContext.getParent();
	//  210  438:aload_0         
	//  211  439:aload_0         
	//  212  440:getfield        #37  <Field TokenFilterContext _headContext>
	//  213  443:invokevirtual   #130 <Method TokenFilterContext TokenFilterContext.getParent()>
	//  214  446:putfield        #37  <Field TokenFilterContext _headContext>
									_itemFilter = _headContext.getFilter();
	//  215  449:aload_0         
	//  216  450:aload_0         
	//  217  451:getfield        #37  <Field TokenFilterContext _headContext>
	//  218  454:invokevirtual   #122 <Method TokenFilter TokenFilterContext.getFilter()>
	//  219  457:putfield        #29  <Field TokenFilter _itemFilter>
									if(flag)
	//* 220  460:iload_1         
	//* 221  461:ifeq            0
									{
										_currToken = jsontoken;
	//  222  464:aload_0         
	//  223  465:aload           4
	//  224  467:putfield        #79  <Field JsonToken _currToken>
										return jsontoken;
	//  225  470:aload           4
	//  226  472:areturn         
									}
									continue;

								case 5: // '\005'
									obj = ((Object) (_flddelegate.getCurrentName()));
	//  227  473:aload_0         
	//  228  474:getfield        #72  <Field JsonParser _flddelegate>
	//  229  477:invokevirtual   #134 <Method String JsonParser.getCurrentName()>
	//  230  480:astore_2        
									TokenFilter tokenfilter2 = _headContext.setFieldName(((String) (obj)));
	//  231  481:aload_0         
	//  232  482:getfield        #37  <Field TokenFilterContext _headContext>
	//  233  485:aload_2         
	//  234  486:invokevirtual   #138 <Method TokenFilter TokenFilterContext.setFieldName(String)>
	//  235  489:astore_3        
									if(tokenfilter2 == TokenFilter.INCLUDE_ALL)
	//* 236  490:aload_3         
	//* 237  491:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 238  494:if_acmpne       511
									{
										_itemFilter = tokenfilter2;
	//  239  497:aload_0         
	//  240  498:aload_3         
	//  241  499:putfield        #29  <Field TokenFilter _itemFilter>
										_currToken = jsontoken;
	//  242  502:aload_0         
	//  243  503:aload           4
	//  244  505:putfield        #79  <Field JsonToken _currToken>
										return jsontoken;
	//  245  508:aload           4
	//  246  510:areturn         
									}
									if(tokenfilter2 == null)
	//* 247  511:aload_3         
	//* 248  512:ifnonnull       534
									{
										_flddelegate.nextToken();
	//  249  515:aload_0         
	//  250  516:getfield        #72  <Field JsonParser _flddelegate>
	//  251  519:invokevirtual   #77  <Method JsonToken JsonParser.nextToken()>
	//  252  522:pop             
										_flddelegate.skipChildren();
	//  253  523:aload_0         
	//  254  524:getfield        #72  <Field JsonParser _flddelegate>
	//  255  527:invokevirtual   #98  <Method JsonParser JsonParser.skipChildren()>
	//  256  530:pop             
										continue;
	//  257  531:goto            0
									}
									obj = ((Object) (tokenfilter2.includeProperty(((String) (obj)))));
	//  258  534:aload_3         
	//  259  535:aload_2         
	//  260  536:invokevirtual   #141 <Method TokenFilter TokenFilter.includeProperty(String)>
	//  261  539:astore_2        
									if(obj != null)
										break label2;
	//  262  540:aload_2         
	//  263  541:ifnonnull       563
									_flddelegate.nextToken();
	//  264  544:aload_0         
	//  265  545:getfield        #72  <Field JsonParser _flddelegate>
	//  266  548:invokevirtual   #77  <Method JsonToken JsonParser.nextToken()>
	//  267  551:pop             
									_flddelegate.skipChildren();
	//  268  552:aload_0         
	//  269  553:getfield        #72  <Field JsonParser _flddelegate>
	//  270  556:invokevirtual   #98  <Method JsonParser JsonParser.skipChildren()>
	//  271  559:pop             
									break;
								}
							} while(true);
	//  272  560:goto            0
							_itemFilter = ((TokenFilter) (obj));
	//  273  563:aload_0         
	//  274  564:aload_2         
	//  275  565:putfield        #29  <Field TokenFilter _itemFilter>
							if(obj != TokenFilter.INCLUDE_ALL)
								continue label1;
	//  276  568:aload_2         
	//  277  569:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//  278  572:if_acmpne       591
						} while(!_includePath);
	//  279  575:aload_0         
	//  280  576:getfield        #39  <Field boolean _includePath>
	//  281  579:ifeq            0
						_currToken = jsontoken;
	//  282  582:aload_0         
	//  283  583:aload           4
	//  284  585:putfield        #79  <Field JsonToken _currToken>
						return jsontoken;
	//  285  588:aload           4
	//  286  590:areturn         
					} while(!_includePath);
	//  287  591:aload_0         
	//  288  592:getfield        #39  <Field boolean _includePath>
	//  289  595:ifeq            0
					obj = ((Object) (_nextTokenWithBuffering(_headContext)));
	//  290  598:aload_0         
	//  291  599:aload_0         
	//  292  600:getfield        #37  <Field TokenFilterContext _headContext>
	//  293  603:invokevirtual   #109 <Method JsonToken _nextTokenWithBuffering(TokenFilterContext)>
	//  294  606:astore_2        
				} while(obj == null);
	//  295  607:aload_2         
	//  296  608:ifnull          0
				_currToken = ((JsonToken) (obj));
	//  297  611:aload_0         
	//  298  612:aload_2         
	//  299  613:putfield        #79  <Field JsonToken _currToken>
				return ((JsonToken) (obj));
	//  300  616:aload_2         
	//  301  617:areturn         
			} while(obj == null);
	//  302  618:aload_2         
	//  303  619:ifnull          0
			obj = ((Object) (_headContext.checkValue(((TokenFilter) (obj)))));
	//  304  622:aload_0         
	//  305  623:getfield        #37  <Field TokenFilterContext _headContext>
	//  306  626:aload_2         
	//  307  627:invokevirtual   #102 <Method TokenFilter TokenFilterContext.checkValue(TokenFilter)>
	//  308  630:astore_2        
		} while(obj != TokenFilter.INCLUDE_ALL && (obj == null || !((TokenFilter) (obj)).includeValue(_flddelegate)));
	//  309  631:aload_2         
	//  310  632:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//  311  635:if_acmpeq       653
	//  312  638:aload_2         
	//  313  639:ifnull          0
	//  314  642:aload_2         
	//  315  643:aload_0         
	//  316  644:getfield        #72  <Field JsonParser _flddelegate>
	//  317  647:invokevirtual   #145 <Method boolean TokenFilter.includeValue(JsonParser)>
	//  318  650:ifeq            0
		_currToken = jsontoken;
	//  319  653:aload_0         
	//  320  654:aload           4
	//  321  656:putfield        #79  <Field JsonToken _currToken>
		return jsontoken;
	//  322  659:aload           4
	//  323  661:areturn         
	}

	protected final JsonToken _nextTokenWithBuffering(TokenFilterContext tokenfiltercontext)
		throws IOException
	{
_L5:
		Object obj = ((Object) (_flddelegate.nextToken()));
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #77  <Method JsonToken JsonParser.nextToken()>
	//    3    7:astore          4
		if(obj != null) goto _L2; else goto _L1
	//    4    9:aload           4
	//    5   11:ifnonnull       17
_L1:
		return ((JsonToken) (obj));
	//    6   14:aload           4
	//    7   16:areturn         
_L2:
		switch(((JsonToken) (obj)).id())
	//*   8   17:aload           4
	//*   9   19:invokevirtual   #85  <Method int JsonToken.id()>
		{
	//*  10   22:tableswitch     1 5: default 56
	//	               1 175
	//	               2 319
	//	               3 76
	//	               4 319
	//	               5 422
		default:
			obj = ((Object) (_itemFilter));
	//   11   56:aload_0         
	//   12   57:getfield        #29  <Field TokenFilter _itemFilter>
	//   13   60:astore          4
			if(obj == TokenFilter.INCLUDE_ALL)
	//*  14   62:aload           4
	//*  15   64:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//*  16   67:if_acmpne       539
				return _nextBuffered(tokenfiltercontext);
	//   17   70:aload_0         
	//   18   71:aload_1         
	//   19   72:invokespecial   #147 <Method JsonToken _nextBuffered(TokenFilterContext)>
	//   20   75:areturn         
			continue; /* Loop/switch isn't completed */

		case 3: // '\003'
			TokenFilter tokenfilter = _headContext.checkValue(_itemFilter);
	//   21   76:aload_0         
	//   22   77:getfield        #37  <Field TokenFilterContext _headContext>
	//   23   80:aload_0         
	//   24   81:getfield        #29  <Field TokenFilter _itemFilter>
	//   25   84:invokevirtual   #102 <Method TokenFilter TokenFilterContext.checkValue(TokenFilter)>
	//   26   87:astore          5
			if(tokenfilter == null)
	//*  27   89:aload           5
	//*  28   91:ifnonnull       105
			{
				_flddelegate.skipChildren();
	//   29   94:aload_0         
	//   30   95:getfield        #72  <Field JsonParser _flddelegate>
	//   31   98:invokevirtual   #98  <Method JsonParser JsonParser.skipChildren()>
	//   32  101:pop             
			} else
	//*  33  102:goto            0
			{
				obj = ((Object) (tokenfilter));
	//   34  105:aload           5
	//   35  107:astore          4
				if(tokenfilter != TokenFilter.INCLUDE_ALL)
	//*  36  109:aload           5
	//*  37  111:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//*  38  114:if_acmpeq       124
					obj = ((Object) (tokenfilter.filterStartArray()));
	//   39  117:aload           5
	//   40  119:invokevirtual   #106 <Method TokenFilter TokenFilter.filterStartArray()>
	//   41  122:astore          4
				_itemFilter = ((TokenFilter) (obj));
	//   42  124:aload_0         
	//   43  125:aload           4
	//   44  127:putfield        #29  <Field TokenFilter _itemFilter>
				if(obj == TokenFilter.INCLUDE_ALL)
	//*  45  130:aload           4
	//*  46  132:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//*  47  135:if_acmpne       158
				{
					_headContext = _headContext.createChildArrayContext(((TokenFilter) (obj)), true);
	//   48  138:aload_0         
	//   49  139:aload_0         
	//   50  140:getfield        #37  <Field TokenFilterContext _headContext>
	//   51  143:aload           4
	//   52  145:iconst_1        
	//   53  146:invokevirtual   #94  <Method TokenFilterContext TokenFilterContext.createChildArrayContext(TokenFilter, boolean)>
	//   54  149:putfield        #37  <Field TokenFilterContext _headContext>
					return _nextBuffered(tokenfiltercontext);
	//   55  152:aload_0         
	//   56  153:aload_1         
	//   57  154:invokespecial   #147 <Method JsonToken _nextBuffered(TokenFilterContext)>
	//   58  157:areturn         
				}
				_headContext = _headContext.createChildArrayContext(((TokenFilter) (obj)), false);
	//   59  158:aload_0         
	//   60  159:aload_0         
	//   61  160:getfield        #37  <Field TokenFilterContext _headContext>
	//   62  163:aload           4
	//   63  165:iconst_0        
	//   64  166:invokevirtual   #94  <Method TokenFilterContext TokenFilterContext.createChildArrayContext(TokenFilter, boolean)>
	//   65  169:putfield        #37  <Field TokenFilterContext _headContext>
			}
			continue; /* Loop/switch isn't completed */
	//   66  172:goto            0

		case 1: // '\001'
			TokenFilter tokenfilter1 = _itemFilter;
	//   67  175:aload_0         
	//   68  176:getfield        #29  <Field TokenFilter _itemFilter>
	//   69  179:astore          5
			if(tokenfilter1 == TokenFilter.INCLUDE_ALL)
	//*  70  181:aload           5
	//*  71  183:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//*  72  186:if_acmpne       206
			{
				_headContext = _headContext.createChildObjectContext(tokenfilter1, true);
	//   73  189:aload_0         
	//   74  190:aload_0         
	//   75  191:getfield        #37  <Field TokenFilterContext _headContext>
	//   76  194:aload           5
	//   77  196:iconst_1        
	//   78  197:invokevirtual   #112 <Method TokenFilterContext TokenFilterContext.createChildObjectContext(TokenFilter, boolean)>
	//   79  200:putfield        #37  <Field TokenFilterContext _headContext>
				return ((JsonToken) (obj));
	//   80  203:aload           4
	//   81  205:areturn         
			}
			if(tokenfilter1 == null)
	//*  82  206:aload           5
	//*  83  208:ifnonnull       222
			{
				_flddelegate.skipChildren();
	//   84  211:aload_0         
	//   85  212:getfield        #72  <Field JsonParser _flddelegate>
	//   86  215:invokevirtual   #98  <Method JsonParser JsonParser.skipChildren()>
	//   87  218:pop             
			} else
	//*  88  219:goto            0
			{
				tokenfilter1 = _headContext.checkValue(tokenfilter1);
	//   89  222:aload_0         
	//   90  223:getfield        #37  <Field TokenFilterContext _headContext>
	//   91  226:aload           5
	//   92  228:invokevirtual   #102 <Method TokenFilter TokenFilterContext.checkValue(TokenFilter)>
	//   93  231:astore          5
				if(tokenfilter1 == null)
	//*  94  233:aload           5
	//*  95  235:ifnonnull       249
				{
					_flddelegate.skipChildren();
	//   96  238:aload_0         
	//   97  239:getfield        #72  <Field JsonParser _flddelegate>
	//   98  242:invokevirtual   #98  <Method JsonParser JsonParser.skipChildren()>
	//   99  245:pop             
				} else
	//* 100  246:goto            0
				{
					obj = ((Object) (tokenfilter1));
	//  101  249:aload           5
	//  102  251:astore          4
					if(tokenfilter1 != TokenFilter.INCLUDE_ALL)
	//* 103  253:aload           5
	//* 104  255:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 105  258:if_acmpeq       268
						obj = ((Object) (tokenfilter1.filterStartObject()));
	//  106  261:aload           5
	//  107  263:invokevirtual   #115 <Method TokenFilter TokenFilter.filterStartObject()>
	//  108  266:astore          4
					_itemFilter = ((TokenFilter) (obj));
	//  109  268:aload_0         
	//  110  269:aload           4
	//  111  271:putfield        #29  <Field TokenFilter _itemFilter>
					if(obj == TokenFilter.INCLUDE_ALL)
	//* 112  274:aload           4
	//* 113  276:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 114  279:if_acmpne       302
					{
						_headContext = _headContext.createChildObjectContext(((TokenFilter) (obj)), true);
	//  115  282:aload_0         
	//  116  283:aload_0         
	//  117  284:getfield        #37  <Field TokenFilterContext _headContext>
	//  118  287:aload           4
	//  119  289:iconst_1        
	//  120  290:invokevirtual   #112 <Method TokenFilterContext TokenFilterContext.createChildObjectContext(TokenFilter, boolean)>
	//  121  293:putfield        #37  <Field TokenFilterContext _headContext>
						return _nextBuffered(tokenfiltercontext);
	//  122  296:aload_0         
	//  123  297:aload_1         
	//  124  298:invokespecial   #147 <Method JsonToken _nextBuffered(TokenFilterContext)>
	//  125  301:areturn         
					}
					_headContext = _headContext.createChildObjectContext(((TokenFilter) (obj)), false);
	//  126  302:aload_0         
	//  127  303:aload_0         
	//  128  304:getfield        #37  <Field TokenFilterContext _headContext>
	//  129  307:aload           4
	//  130  309:iconst_0        
	//  131  310:invokevirtual   #112 <Method TokenFilterContext TokenFilterContext.createChildObjectContext(TokenFilter, boolean)>
	//  132  313:putfield        #37  <Field TokenFilterContext _headContext>
				}
			}
			continue; /* Loop/switch isn't completed */
	//  133  316:goto            0

		case 2: // '\002'
		case 4: // '\004'
			TokenFilter tokenfilter2 = _headContext.getFilter();
	//  134  319:aload_0         
	//  135  320:getfield        #37  <Field TokenFilterContext _headContext>
	//  136  323:invokevirtual   #122 <Method TokenFilter TokenFilterContext.getFilter()>
	//  137  326:astore          5
			if(tokenfilter2 != null && tokenfilter2 != TokenFilter.INCLUDE_ALL)
	//* 138  328:aload           5
	//* 139  330:ifnull          346
	//* 140  333:aload           5
	//* 141  335:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 142  338:if_acmpeq       346
				tokenfilter2.filterFinishArray();
	//  143  341:aload           5
	//  144  343:invokevirtual   #126 <Method void TokenFilter.filterFinishArray()>
			boolean flag;
			boolean flag1;
			if(_headContext == tokenfiltercontext)
	//* 145  346:aload_0         
	//* 146  347:getfield        #37  <Field TokenFilterContext _headContext>
	//* 147  350:aload_1         
	//* 148  351:if_acmpne       412
				flag = true;
	//  149  354:iconst_1        
	//  150  355:istore_2        
			else
	//* 151  356:iload_2         
	//* 152  357:ifeq            417
	//* 153  360:aload_0         
	//* 154  361:getfield        #37  <Field TokenFilterContext _headContext>
	//* 155  364:invokevirtual   #119 <Method boolean TokenFilterContext.isStartHandled()>
	//* 156  367:ifeq            417
	//* 157  370:iconst_1        
	//* 158  371:istore_3        
	//* 159  372:aload_0         
	//* 160  373:aload_0         
	//* 161  374:getfield        #37  <Field TokenFilterContext _headContext>
	//* 162  377:invokevirtual   #130 <Method TokenFilterContext TokenFilterContext.getParent()>
	//* 163  380:putfield        #37  <Field TokenFilterContext _headContext>
	//* 164  383:aload_0         
	//* 165  384:aload_0         
	//* 166  385:getfield        #37  <Field TokenFilterContext _headContext>
	//* 167  388:invokevirtual   #122 <Method TokenFilter TokenFilterContext.getFilter()>
	//* 168  391:putfield        #29  <Field TokenFilter _itemFilter>
	//* 169  394:iload_3         
	//* 170  395:ifne            14
	//* 171  398:iload_2         
	//* 172  399:ifne            410
	//* 173  402:aload_0         
	//* 174  403:getfield        #37  <Field TokenFilterContext _headContext>
	//* 175  406:aload_1         
	//* 176  407:if_acmpne       0
	//* 177  410:aconst_null     
	//* 178  411:areturn         
				flag = false;
	//  179  412:iconst_0        
	//  180  413:istore_2        
			if(flag && _headContext.isStartHandled())
				flag1 = true;
			else
	//* 181  414:goto            356
				flag1 = false;
	//  182  417:iconst_0        
	//  183  418:istore_3        
			_headContext = _headContext.getParent();
			_itemFilter = _headContext.getFilter();
			if(!flag1)
			{
				if(flag || _headContext == tokenfiltercontext)
					return null;
				continue; /* Loop/switch isn't completed */
			}
			break;
	//  184  419:goto            372

		case 5: // '\005'
			obj = ((Object) (_flddelegate.getCurrentName()));
	//  185  422:aload_0         
	//  186  423:getfield        #72  <Field JsonParser _flddelegate>
	//  187  426:invokevirtual   #134 <Method String JsonParser.getCurrentName()>
	//  188  429:astore          4
			TokenFilter tokenfilter3 = _headContext.setFieldName(((String) (obj)));
	//  189  431:aload_0         
	//  190  432:getfield        #37  <Field TokenFilterContext _headContext>
	//  191  435:aload           4
	//  192  437:invokevirtual   #138 <Method TokenFilter TokenFilterContext.setFieldName(String)>
	//  193  440:astore          5
			if(tokenfilter3 == TokenFilter.INCLUDE_ALL)
	//* 194  442:aload           5
	//* 195  444:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 196  447:if_acmpne       462
			{
				_itemFilter = tokenfilter3;
	//  197  450:aload_0         
	//  198  451:aload           5
	//  199  453:putfield        #29  <Field TokenFilter _itemFilter>
				return _nextBuffered(tokenfiltercontext);
	//  200  456:aload_0         
	//  201  457:aload_1         
	//  202  458:invokespecial   #147 <Method JsonToken _nextBuffered(TokenFilterContext)>
	//  203  461:areturn         
			}
			if(tokenfilter3 == null)
	//* 204  462:aload           5
	//* 205  464:ifnonnull       486
			{
				_flddelegate.nextToken();
	//  206  467:aload_0         
	//  207  468:getfield        #72  <Field JsonParser _flddelegate>
	//  208  471:invokevirtual   #77  <Method JsonToken JsonParser.nextToken()>
	//  209  474:pop             
				_flddelegate.skipChildren();
	//  210  475:aload_0         
	//  211  476:getfield        #72  <Field JsonParser _flddelegate>
	//  212  479:invokevirtual   #98  <Method JsonParser JsonParser.skipChildren()>
	//  213  482:pop             
				continue; /* Loop/switch isn't completed */
	//  214  483:goto            0
			}
			obj = ((Object) (tokenfilter3.includeProperty(((String) (obj)))));
	//  215  486:aload           5
	//  216  488:aload           4
	//  217  490:invokevirtual   #141 <Method TokenFilter TokenFilter.includeProperty(String)>
	//  218  493:astore          4
			if(obj != null)
				break; /* Loop/switch isn't completed */
	//  219  495:aload           4
	//  220  497:ifnonnull       519
			_flddelegate.nextToken();
	//  221  500:aload_0         
	//  222  501:getfield        #72  <Field JsonParser _flddelegate>
	//  223  504:invokevirtual   #77  <Method JsonToken JsonParser.nextToken()>
	//  224  507:pop             
			_flddelegate.skipChildren();
	//  225  508:aload_0         
	//  226  509:getfield        #72  <Field JsonParser _flddelegate>
	//  227  512:invokevirtual   #98  <Method JsonParser JsonParser.skipChildren()>
	//  228  515:pop             
			continue; /* Loop/switch isn't completed */
	//  229  516:goto            0
		}
		if(true) goto _L1; else goto _L3
_L3:
		if(true) goto _L5; else goto _L4
_L4:
		_itemFilter = ((TokenFilter) (obj));
	//  230  519:aload_0         
	//  231  520:aload           4
	//  232  522:putfield        #29  <Field TokenFilter _itemFilter>
		if(obj == TokenFilter.INCLUDE_ALL)
	//* 233  525:aload           4
	//* 234  527:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 235  530:if_acmpne       0
			return _nextBuffered(tokenfiltercontext);
	//  236  533:aload_0         
	//  237  534:aload_1         
	//  238  535:invokespecial   #147 <Method JsonToken _nextBuffered(TokenFilterContext)>
	//  239  538:areturn         
		continue; /* Loop/switch isn't completed */
		if(obj == null) goto _L5; else goto _L6
	//  240  539:aload           4
	//  241  541:ifnull          0
_L6:
		obj = ((Object) (_headContext.checkValue(((TokenFilter) (obj)))));
	//  242  544:aload_0         
	//  243  545:getfield        #37  <Field TokenFilterContext _headContext>
	//  244  548:aload           4
	//  245  550:invokevirtual   #102 <Method TokenFilter TokenFilterContext.checkValue(TokenFilter)>
	//  246  553:astore          4
		if(obj == TokenFilter.INCLUDE_ALL || obj != null && ((TokenFilter) (obj)).includeValue(_flddelegate))
	//* 247  555:aload           4
	//* 248  557:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 249  560:if_acmpeq       580
	//* 250  563:aload           4
	//* 251  565:ifnull          0
	//* 252  568:aload           4
	//* 253  570:aload_0         
	//* 254  571:getfield        #72  <Field JsonParser _flddelegate>
	//* 255  574:invokevirtual   #145 <Method boolean TokenFilter.includeValue(JsonParser)>
	//* 256  577:ifeq            0
			return _nextBuffered(tokenfiltercontext);
	//  257  580:aload_0         
	//  258  581:aload_1         
	//  259  582:invokespecial   #147 <Method JsonToken _nextBuffered(TokenFilterContext)>
	//  260  585:areturn         
		if(true) goto _L5; else goto _L7
_L7:
	}

	public void clearCurrentToken()
	{
		if(_currToken != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field JsonToken _currToken>
	//*   2    4:ifnull          20
		{
			_lastClearedToken = _currToken;
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #79  <Field JsonToken _currToken>
	//    6   12:putfield        #150 <Field JsonToken _lastClearedToken>
			_currToken = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #79  <Field JsonToken _currToken>
		}
	//   10   20:return          
	}

	public BigInteger getBigIntegerValue()
		throws IOException
	{
		return _flddelegate.getBigIntegerValue();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #154 <Method BigInteger JsonParser.getBigIntegerValue()>
	//    3    7:areturn         
	}

	public byte[] getBinaryValue(Base64Variant base64variant)
		throws IOException
	{
		return _flddelegate.getBinaryValue(base64variant);
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #158 <Method byte[] JsonParser.getBinaryValue(Base64Variant)>
	//    4    8:areturn         
	}

	public boolean getBooleanValue()
		throws IOException
	{
		return _flddelegate.getBooleanValue();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #161 <Method boolean JsonParser.getBooleanValue()>
	//    3    7:ireturn         
	}

	public byte getByteValue()
		throws IOException
	{
		return _flddelegate.getByteValue();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #165 <Method byte JsonParser.getByteValue()>
	//    3    7:ireturn         
	}

	public JsonLocation getCurrentLocation()
	{
		return _flddelegate.getCurrentLocation();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #169 <Method JsonLocation JsonParser.getCurrentLocation()>
	//    3    7:areturn         
	}

	public String getCurrentName()
		throws IOException
	{
		JsonStreamContext jsonstreamcontext = _filterContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #171 <Method JsonStreamContext _filterContext()>
	//    2    4:astore_1        
		if(_currToken == JsonToken.START_OBJECT || _currToken == JsonToken.START_ARRAY)
	//*   3    5:aload_0         
	//*   4    6:getfield        #79  <Field JsonToken _currToken>
	//*   5    9:getstatic       #174 <Field JsonToken JsonToken.START_OBJECT>
	//*   6   12:if_acmpeq       25
	//*   7   15:aload_0         
	//*   8   16:getfield        #79  <Field JsonToken _currToken>
	//*   9   19:getstatic       #177 <Field JsonToken JsonToken.START_ARRAY>
	//*  10   22:if_acmpne       41
		{
			jsonstreamcontext = jsonstreamcontext.getParent();
	//   11   25:aload_1         
	//   12   26:invokevirtual   #181 <Method JsonStreamContext JsonStreamContext.getParent()>
	//   13   29:astore_1        
			if(jsonstreamcontext == null)
	//*  14   30:aload_1         
	//*  15   31:ifnonnull       36
				return null;
	//   16   34:aconst_null     
	//   17   35:areturn         
			else
				return jsonstreamcontext.getCurrentName();
	//   18   36:aload_1         
	//   19   37:invokevirtual   #182 <Method String JsonStreamContext.getCurrentName()>
	//   20   40:areturn         
		} else
		{
			return jsonstreamcontext.getCurrentName();
	//   21   41:aload_1         
	//   22   42:invokevirtual   #182 <Method String JsonStreamContext.getCurrentName()>
	//   23   45:areturn         
		}
	}

	public JsonToken getCurrentToken()
	{
		return _currToken;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field JsonToken _currToken>
	//    2    4:areturn         
	}

	public final int getCurrentTokenId()
	{
		JsonToken jsontoken = _currToken;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field JsonToken _currToken>
	//    2    4:astore_1        
		if(jsontoken == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		else
			return jsontoken.id();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #85  <Method int JsonToken.id()>
	//    9   15:ireturn         
	}

	public BigDecimal getDecimalValue()
		throws IOException
	{
		return _flddelegate.getDecimalValue();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #188 <Method BigDecimal JsonParser.getDecimalValue()>
	//    3    7:areturn         
	}

	public double getDoubleValue()
		throws IOException
	{
		return _flddelegate.getDoubleValue();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #192 <Method double JsonParser.getDoubleValue()>
	//    3    7:dreturn         
	}

	public Object getEmbeddedObject()
		throws IOException
	{
		return _flddelegate.getEmbeddedObject();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #196 <Method Object JsonParser.getEmbeddedObject()>
	//    3    7:areturn         
	}

	public TokenFilter getFilter()
	{
		return rootFilter;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field TokenFilter rootFilter>
	//    2    4:areturn         
	}

	public float getFloatValue()
		throws IOException
	{
		return _flddelegate.getFloatValue();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #200 <Method float JsonParser.getFloatValue()>
	//    3    7:freturn         
	}

	public int getIntValue()
		throws IOException
	{
		return _flddelegate.getIntValue();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #203 <Method int JsonParser.getIntValue()>
	//    3    7:ireturn         
	}

	public JsonToken getLastClearedToken()
	{
		return _lastClearedToken;
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field JsonToken _lastClearedToken>
	//    2    4:areturn         
	}

	public long getLongValue()
		throws IOException
	{
		return _flddelegate.getLongValue();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #208 <Method long JsonParser.getLongValue()>
	//    3    7:lreturn         
	}

	public int getMatchCount()
	{
		return _matchCount;
	//    0    0:aload_0         
	//    1    1:getfield        #211 <Field int _matchCount>
	//    2    4:ireturn         
	}

	public com.fasterxml.jackson.core.JsonParser.NumberType getNumberType()
		throws IOException
	{
		return _flddelegate.getNumberType();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #215 <Method com.fasterxml.jackson.core.JsonParser$NumberType JsonParser.getNumberType()>
	//    3    7:areturn         
	}

	public Number getNumberValue()
		throws IOException
	{
		return _flddelegate.getNumberValue();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #219 <Method Number JsonParser.getNumberValue()>
	//    3    7:areturn         
	}

	public JsonStreamContext getParsingContext()
	{
		return _filterContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #171 <Method JsonStreamContext _filterContext()>
	//    2    4:areturn         
	}

	public short getShortValue()
		throws IOException
	{
		return _flddelegate.getShortValue();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #224 <Method short JsonParser.getShortValue()>
	//    3    7:ireturn         
	}

	public String getText()
		throws IOException
	{
		return _flddelegate.getText();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #227 <Method String JsonParser.getText()>
	//    3    7:areturn         
	}

	public char[] getTextCharacters()
		throws IOException
	{
		return _flddelegate.getTextCharacters();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #231 <Method char[] JsonParser.getTextCharacters()>
	//    3    7:areturn         
	}

	public int getTextLength()
		throws IOException
	{
		return _flddelegate.getTextLength();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #234 <Method int JsonParser.getTextLength()>
	//    3    7:ireturn         
	}

	public int getTextOffset()
		throws IOException
	{
		return _flddelegate.getTextOffset();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #237 <Method int JsonParser.getTextOffset()>
	//    3    7:ireturn         
	}

	public JsonLocation getTokenLocation()
	{
		return _flddelegate.getTokenLocation();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #240 <Method JsonLocation JsonParser.getTokenLocation()>
	//    3    7:areturn         
	}

	public boolean getValueAsBoolean()
		throws IOException
	{
		return _flddelegate.getValueAsBoolean();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #243 <Method boolean JsonParser.getValueAsBoolean()>
	//    3    7:ireturn         
	}

	public boolean getValueAsBoolean(boolean flag)
		throws IOException
	{
		return _flddelegate.getValueAsBoolean(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #246 <Method boolean JsonParser.getValueAsBoolean(boolean)>
	//    4    8:ireturn         
	}

	public double getValueAsDouble()
		throws IOException
	{
		return _flddelegate.getValueAsDouble();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #249 <Method double JsonParser.getValueAsDouble()>
	//    3    7:dreturn         
	}

	public double getValueAsDouble(double d)
		throws IOException
	{
		return _flddelegate.getValueAsDouble(d);
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:dload_1         
	//    3    5:invokevirtual   #252 <Method double JsonParser.getValueAsDouble(double)>
	//    4    8:dreturn         
	}

	public int getValueAsInt()
		throws IOException
	{
		return _flddelegate.getValueAsInt();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #255 <Method int JsonParser.getValueAsInt()>
	//    3    7:ireturn         
	}

	public int getValueAsInt(int i)
		throws IOException
	{
		return _flddelegate.getValueAsInt(i);
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #258 <Method int JsonParser.getValueAsInt(int)>
	//    4    8:ireturn         
	}

	public long getValueAsLong()
		throws IOException
	{
		return _flddelegate.getValueAsLong();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #261 <Method long JsonParser.getValueAsLong()>
	//    3    7:lreturn         
	}

	public long getValueAsLong(long l)
		throws IOException
	{
		return _flddelegate.getValueAsLong(l);
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #264 <Method long JsonParser.getValueAsLong(long)>
	//    4    8:lreturn         
	}

	public String getValueAsString()
		throws IOException
	{
		return _flddelegate.getValueAsString();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #267 <Method String JsonParser.getValueAsString()>
	//    3    7:areturn         
	}

	public String getValueAsString(String s)
		throws IOException
	{
		return _flddelegate.getValueAsString(s);
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #270 <Method String JsonParser.getValueAsString(String)>
	//    4    8:areturn         
	}

	public boolean hasCurrentToken()
	{
		return _currToken != null;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field JsonToken _currToken>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean hasTextCharacters()
	{
		return _flddelegate.hasTextCharacters();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #274 <Method boolean JsonParser.hasTextCharacters()>
	//    3    7:ireturn         
	}

	public final boolean hasToken(JsonToken jsontoken)
	{
		return _currToken == jsontoken;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field JsonToken _currToken>
	//    2    4:aload_1         
	//    3    5:if_acmpne       10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public boolean hasTokenId(int i)
	{
		JsonToken jsontoken = _currToken;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field JsonToken _currToken>
	//    2    4:astore_2        
		if(jsontoken != null) goto _L2; else goto _L1
	//    3    5:aload_2         
	//    4    6:ifnonnull       17
_L1:
		if(i != 0) goto _L4; else goto _L3
	//    5    9:iload_1         
	//    6   10:ifne            15
_L3:
		return true;
	//    7   13:iconst_1        
	//    8   14:ireturn         
_L4:
		return false;
	//    9   15:iconst_0        
	//   10   16:ireturn         
_L2:
		if(jsontoken.id() != i)
	//*  11   17:aload_2         
	//*  12   18:invokevirtual   #85  <Method int JsonToken.id()>
	//*  13   21:iload_1         
	//*  14   22:icmpeq          13
			return false;
	//   15   25:iconst_0        
	//   16   26:ireturn         
		if(true) goto _L3; else goto _L5
_L5:
	}

	public boolean isExpectedStartArrayToken()
	{
		return _currToken == JsonToken.START_ARRAY;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field JsonToken _currToken>
	//    2    4:getstatic       #177 <Field JsonToken JsonToken.START_ARRAY>
	//    3    7:if_acmpne       12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public boolean isExpectedStartObjectToken()
	{
		return _currToken == JsonToken.START_OBJECT;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field JsonToken _currToken>
	//    2    4:getstatic       #174 <Field JsonToken JsonToken.START_OBJECT>
	//    3    7:if_acmpne       12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public JsonToken nextToken()
		throws IOException
	{
		Object obj2;
		Object obj = ((Object) (_exposedContext));
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field TokenFilterContext _exposedContext>
	//    2    4:astore_2        
		if(obj != null)
			do
	//*   3    5:aload_2         
	//*   4    6:ifnull          87
			{
				obj2 = ((Object) (((TokenFilterContext) (obj)).nextTokenToRead()));
	//    5    9:aload_2         
	//    6   10:invokevirtual   #52  <Method JsonToken TokenFilterContext.nextTokenToRead()>
	//    7   13:astore_3        
				if(obj2 != null)
	//*   8   14:aload_3         
	//*   9   15:ifnull          25
				{
					_currToken = ((JsonToken) (obj2));
	//   10   18:aload_0         
	//   11   19:aload_3         
	//   12   20:putfield        #79  <Field JsonToken _currToken>
					return ((JsonToken) (obj2));
	//   13   23:aload_3         
	//   14   24:areturn         
				}
				if(obj == _headContext)
	//*  15   25:aload_2         
	//*  16   26:aload_0         
	//*  17   27:getfield        #37  <Field TokenFilterContext _headContext>
	//*  18   30:if_acmpne       60
				{
					_exposedContext = null;
	//   19   33:aload_0         
	//   20   34:aconst_null     
	//   21   35:putfield        #48  <Field TokenFilterContext _exposedContext>
					if(((TokenFilterContext) (obj)).inArray())
	//*  22   38:aload_2         
	//*  23   39:invokevirtual   #283 <Method boolean TokenFilterContext.inArray()>
	//*  24   42:ifeq            87
					{
						obj = ((Object) (_flddelegate.getCurrentToken()));
	//   25   45:aload_0         
	//   26   46:getfield        #72  <Field JsonParser _flddelegate>
	//   27   49:invokevirtual   #285 <Method JsonToken JsonParser.getCurrentToken()>
	//   28   52:astore_2        
						_currToken = ((JsonToken) (obj));
	//   29   53:aload_0         
	//   30   54:aload_2         
	//   31   55:putfield        #79  <Field JsonToken _currToken>
						return ((JsonToken) (obj));
	//   32   58:aload_2         
	//   33   59:areturn         
					}
					break;
				}
				obj2 = ((Object) (_headContext.findChildOf(((TokenFilterContext) (obj)))));
	//   34   60:aload_0         
	//   35   61:getfield        #37  <Field TokenFilterContext _headContext>
	//   36   64:aload_2         
	//   37   65:invokevirtual   #62  <Method TokenFilterContext TokenFilterContext.findChildOf(TokenFilterContext)>
	//   38   68:astore_3        
				_exposedContext = ((TokenFilterContext) (obj2));
	//   39   69:aload_0         
	//   40   70:aload_3         
	//   41   71:putfield        #48  <Field TokenFilterContext _exposedContext>
				obj = obj2;
	//   42   74:aload_3         
	//   43   75:astore_2        
				if(obj2 == null)
	//*  44   76:aload_3         
	//*  45   77:ifnonnull       9
					throw _constructError("Unexpected problem: chain of filtered context broken");
	//   46   80:aload_0         
	//   47   81:ldc1            #64  <String "Unexpected problem: chain of filtered context broken">
	//   48   83:invokevirtual   #58  <Method com.fasterxml.jackson.core.JsonParseException _constructError(String)>
	//   49   86:athrow          
			} while(true);
		obj2 = ((Object) (_flddelegate.nextToken()));
	//   50   87:aload_0         
	//   51   88:getfield        #72  <Field JsonParser _flddelegate>
	//   52   91:invokevirtual   #77  <Method JsonToken JsonParser.nextToken()>
	//   53   94:astore_3        
		if(obj2 == null)
	//*  54   95:aload_3         
	//*  55   96:ifnonnull       106
		{
			_currToken = ((JsonToken) (obj2));
	//   56   99:aload_0         
	//   57  100:aload_3         
	//   58  101:putfield        #79  <Field JsonToken _currToken>
			return ((JsonToken) (obj2));
	//   59  104:aload_3         
	//   60  105:areturn         
		}
		((JsonToken) (obj2)).id();
	//   61  106:aload_3         
	//   62  107:invokevirtual   #85  <Method int JsonToken.id()>
		JVM INSTR tableswitch 1 5: default 144
	//	               1 327
	//	               2 489
	//	               3 163
	//	               4 489
	//	               5 553;
	//   63  110:tableswitch     1 5: default 144
	//	               1 327
	//	               2 489
	//	               3 163
	//	               4 489
	//	               5 553
		   goto _L1 _L2 _L3 _L4 _L3 _L5
	//*  64  144:aload_0         
	//*  65  145:getfield        #29  <Field TokenFilter _itemFilter>
	//*  66  148:astore_2        
	//*  67  149:aload_2         
	//*  68  150:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//*  69  153:if_acmpne       745
	//*  70  156:aload_0         
	//*  71  157:aload_3         
	//*  72  158:putfield        #79  <Field JsonToken _currToken>
	//*  73  161:aload_3         
	//*  74  162:areturn         
_L4:
		obj1 = ((Object) (_itemFilter));
	//   75  163:aload_0         
	//   76  164:getfield        #29  <Field TokenFilter _itemFilter>
	//   77  167:astore_2        
		if(obj1 == TokenFilter.INCLUDE_ALL)
	//*  78  168:aload_2         
	//*  79  169:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//*  80  172:if_acmpne       195
		{
			_headContext = _headContext.createChildArrayContext(((TokenFilter) (obj1)), true);
	//   81  175:aload_0         
	//   82  176:aload_0         
	//   83  177:getfield        #37  <Field TokenFilterContext _headContext>
	//   84  180:aload_2         
	//   85  181:iconst_1        
	//   86  182:invokevirtual   #94  <Method TokenFilterContext TokenFilterContext.createChildArrayContext(TokenFilter, boolean)>
	//   87  185:putfield        #37  <Field TokenFilterContext _headContext>
			_currToken = ((JsonToken) (obj2));
	//   88  188:aload_0         
	//   89  189:aload_3         
	//   90  190:putfield        #79  <Field JsonToken _currToken>
			return ((JsonToken) (obj2));
	//   91  193:aload_3         
	//   92  194:areturn         
		}
		if(obj1 != null) goto _L7; else goto _L6
	//   93  195:aload_2         
	//   94  196:ifnonnull       212
_L6:
		_flddelegate.skipChildren();
	//   95  199:aload_0         
	//   96  200:getfield        #72  <Field JsonParser _flddelegate>
	//   97  203:invokevirtual   #98  <Method JsonParser JsonParser.skipChildren()>
	//   98  206:pop             
_L9:
		return _nextToken2();
	//   99  207:aload_0         
	//  100  208:invokevirtual   #287 <Method JsonToken _nextToken2()>
	//  101  211:areturn         
_L7:
		TokenFilter tokenfilter = _headContext.checkValue(((TokenFilter) (obj1)));
	//  102  212:aload_0         
	//  103  213:getfield        #37  <Field TokenFilterContext _headContext>
	//  104  216:aload_2         
	//  105  217:invokevirtual   #102 <Method TokenFilter TokenFilterContext.checkValue(TokenFilter)>
	//  106  220:astore          4
		if(tokenfilter == null)
	//* 107  222:aload           4
	//* 108  224:ifnonnull       238
		{
			_flddelegate.skipChildren();
	//  109  227:aload_0         
	//  110  228:getfield        #72  <Field JsonParser _flddelegate>
	//  111  231:invokevirtual   #98  <Method JsonParser JsonParser.skipChildren()>
	//  112  234:pop             
		} else
	//* 113  235:goto            207
		{
			obj1 = ((Object) (tokenfilter));
	//  114  238:aload           4
	//  115  240:astore_2        
			if(tokenfilter != TokenFilter.INCLUDE_ALL)
	//* 116  241:aload           4
	//* 117  243:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 118  246:if_acmpeq       255
				obj1 = ((Object) (tokenfilter.filterStartArray()));
	//  119  249:aload           4
	//  120  251:invokevirtual   #106 <Method TokenFilter TokenFilter.filterStartArray()>
	//  121  254:astore_2        
			_itemFilter = ((TokenFilter) (obj1));
	//  122  255:aload_0         
	//  123  256:aload_2         
	//  124  257:putfield        #29  <Field TokenFilter _itemFilter>
			if(obj1 == TokenFilter.INCLUDE_ALL)
	//* 125  260:aload_2         
	//* 126  261:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 127  264:if_acmpne       287
			{
				_headContext = _headContext.createChildArrayContext(((TokenFilter) (obj1)), true);
	//  128  267:aload_0         
	//  129  268:aload_0         
	//  130  269:getfield        #37  <Field TokenFilterContext _headContext>
	//  131  272:aload_2         
	//  132  273:iconst_1        
	//  133  274:invokevirtual   #94  <Method TokenFilterContext TokenFilterContext.createChildArrayContext(TokenFilter, boolean)>
	//  134  277:putfield        #37  <Field TokenFilterContext _headContext>
				_currToken = ((JsonToken) (obj2));
	//  135  280:aload_0         
	//  136  281:aload_3         
	//  137  282:putfield        #79  <Field JsonToken _currToken>
				return ((JsonToken) (obj2));
	//  138  285:aload_3         
	//  139  286:areturn         
			}
			_headContext = _headContext.createChildArrayContext(((TokenFilter) (obj1)), false);
	//  140  287:aload_0         
	//  141  288:aload_0         
	//  142  289:getfield        #37  <Field TokenFilterContext _headContext>
	//  143  292:aload_2         
	//  144  293:iconst_0        
	//  145  294:invokevirtual   #94  <Method TokenFilterContext TokenFilterContext.createChildArrayContext(TokenFilter, boolean)>
	//  146  297:putfield        #37  <Field TokenFilterContext _headContext>
			if(_includePath)
	//* 147  300:aload_0         
	//* 148  301:getfield        #39  <Field boolean _includePath>
	//* 149  304:ifeq            207
			{
				obj1 = ((Object) (_nextTokenWithBuffering(_headContext)));
	//  150  307:aload_0         
	//  151  308:aload_0         
	//  152  309:getfield        #37  <Field TokenFilterContext _headContext>
	//  153  312:invokevirtual   #109 <Method JsonToken _nextTokenWithBuffering(TokenFilterContext)>
	//  154  315:astore_2        
				if(obj1 != null)
	//* 155  316:aload_2         
	//* 156  317:ifnull          207
				{
					_currToken = ((JsonToken) (obj1));
	//  157  320:aload_0         
	//  158  321:aload_2         
	//  159  322:putfield        #79  <Field JsonToken _currToken>
					return ((JsonToken) (obj1));
	//  160  325:aload_2         
	//  161  326:areturn         
				}
			}
		}
		continue; /* Loop/switch isn't completed */
_L2:
		obj1 = ((Object) (_itemFilter));
	//  162  327:aload_0         
	//  163  328:getfield        #29  <Field TokenFilter _itemFilter>
	//  164  331:astore_2        
		if(obj1 == TokenFilter.INCLUDE_ALL)
	//* 165  332:aload_2         
	//* 166  333:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 167  336:if_acmpne       359
		{
			_headContext = _headContext.createChildObjectContext(((TokenFilter) (obj1)), true);
	//  168  339:aload_0         
	//  169  340:aload_0         
	//  170  341:getfield        #37  <Field TokenFilterContext _headContext>
	//  171  344:aload_2         
	//  172  345:iconst_1        
	//  173  346:invokevirtual   #112 <Method TokenFilterContext TokenFilterContext.createChildObjectContext(TokenFilter, boolean)>
	//  174  349:putfield        #37  <Field TokenFilterContext _headContext>
			_currToken = ((JsonToken) (obj2));
	//  175  352:aload_0         
	//  176  353:aload_3         
	//  177  354:putfield        #79  <Field JsonToken _currToken>
			return ((JsonToken) (obj2));
	//  178  357:aload_3         
	//  179  358:areturn         
		}
		if(obj1 == null)
	//* 180  359:aload_2         
	//* 181  360:ifnonnull       374
		{
			_flddelegate.skipChildren();
	//  182  363:aload_0         
	//  183  364:getfield        #72  <Field JsonParser _flddelegate>
	//  184  367:invokevirtual   #98  <Method JsonParser JsonParser.skipChildren()>
	//  185  370:pop             
		} else
	//* 186  371:goto            207
		{
			TokenFilter tokenfilter1 = _headContext.checkValue(((TokenFilter) (obj1)));
	//  187  374:aload_0         
	//  188  375:getfield        #37  <Field TokenFilterContext _headContext>
	//  189  378:aload_2         
	//  190  379:invokevirtual   #102 <Method TokenFilter TokenFilterContext.checkValue(TokenFilter)>
	//  191  382:astore          4
			if(tokenfilter1 == null)
	//* 192  384:aload           4
	//* 193  386:ifnonnull       400
			{
				_flddelegate.skipChildren();
	//  194  389:aload_0         
	//  195  390:getfield        #72  <Field JsonParser _flddelegate>
	//  196  393:invokevirtual   #98  <Method JsonParser JsonParser.skipChildren()>
	//  197  396:pop             
			} else
	//* 198  397:goto            207
			{
				obj1 = ((Object) (tokenfilter1));
	//  199  400:aload           4
	//  200  402:astore_2        
				if(tokenfilter1 != TokenFilter.INCLUDE_ALL)
	//* 201  403:aload           4
	//* 202  405:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 203  408:if_acmpeq       417
					obj1 = ((Object) (tokenfilter1.filterStartObject()));
	//  204  411:aload           4
	//  205  413:invokevirtual   #115 <Method TokenFilter TokenFilter.filterStartObject()>
	//  206  416:astore_2        
				_itemFilter = ((TokenFilter) (obj1));
	//  207  417:aload_0         
	//  208  418:aload_2         
	//  209  419:putfield        #29  <Field TokenFilter _itemFilter>
				if(obj1 == TokenFilter.INCLUDE_ALL)
	//* 210  422:aload_2         
	//* 211  423:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 212  426:if_acmpne       449
				{
					_headContext = _headContext.createChildObjectContext(((TokenFilter) (obj1)), true);
	//  213  429:aload_0         
	//  214  430:aload_0         
	//  215  431:getfield        #37  <Field TokenFilterContext _headContext>
	//  216  434:aload_2         
	//  217  435:iconst_1        
	//  218  436:invokevirtual   #112 <Method TokenFilterContext TokenFilterContext.createChildObjectContext(TokenFilter, boolean)>
	//  219  439:putfield        #37  <Field TokenFilterContext _headContext>
					_currToken = ((JsonToken) (obj2));
	//  220  442:aload_0         
	//  221  443:aload_3         
	//  222  444:putfield        #79  <Field JsonToken _currToken>
					return ((JsonToken) (obj2));
	//  223  447:aload_3         
	//  224  448:areturn         
				}
				_headContext = _headContext.createChildObjectContext(((TokenFilter) (obj1)), false);
	//  225  449:aload_0         
	//  226  450:aload_0         
	//  227  451:getfield        #37  <Field TokenFilterContext _headContext>
	//  228  454:aload_2         
	//  229  455:iconst_0        
	//  230  456:invokevirtual   #112 <Method TokenFilterContext TokenFilterContext.createChildObjectContext(TokenFilter, boolean)>
	//  231  459:putfield        #37  <Field TokenFilterContext _headContext>
				if(_includePath)
	//* 232  462:aload_0         
	//* 233  463:getfield        #39  <Field boolean _includePath>
	//* 234  466:ifeq            207
				{
					obj1 = ((Object) (_nextTokenWithBuffering(_headContext)));
	//  235  469:aload_0         
	//  236  470:aload_0         
	//  237  471:getfield        #37  <Field TokenFilterContext _headContext>
	//  238  474:invokevirtual   #109 <Method JsonToken _nextTokenWithBuffering(TokenFilterContext)>
	//  239  477:astore_2        
					if(obj1 != null)
	//* 240  478:aload_2         
	//* 241  479:ifnull          207
					{
						_currToken = ((JsonToken) (obj1));
	//  242  482:aload_0         
	//  243  483:aload_2         
	//  244  484:putfield        #79  <Field JsonToken _currToken>
						return ((JsonToken) (obj1));
	//  245  487:aload_2         
	//  246  488:areturn         
					}
				}
			}
		}
		continue; /* Loop/switch isn't completed */
_L3:
		boolean flag = _headContext.isStartHandled();
	//  247  489:aload_0         
	//  248  490:getfield        #37  <Field TokenFilterContext _headContext>
	//  249  493:invokevirtual   #119 <Method boolean TokenFilterContext.isStartHandled()>
	//  250  496:istore_1        
		obj1 = ((Object) (_headContext.getFilter()));
	//  251  497:aload_0         
	//  252  498:getfield        #37  <Field TokenFilterContext _headContext>
	//  253  501:invokevirtual   #122 <Method TokenFilter TokenFilterContext.getFilter()>
	//  254  504:astore_2        
		if(obj1 != null && obj1 != TokenFilter.INCLUDE_ALL)
	//* 255  505:aload_2         
	//* 256  506:ifnull          520
	//* 257  509:aload_2         
	//* 258  510:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 259  513:if_acmpeq       520
			((TokenFilter) (obj1)).filterFinishArray();
	//  260  516:aload_2         
	//  261  517:invokevirtual   #126 <Method void TokenFilter.filterFinishArray()>
		_headContext = _headContext.getParent();
	//  262  520:aload_0         
	//  263  521:aload_0         
	//  264  522:getfield        #37  <Field TokenFilterContext _headContext>
	//  265  525:invokevirtual   #130 <Method TokenFilterContext TokenFilterContext.getParent()>
	//  266  528:putfield        #37  <Field TokenFilterContext _headContext>
		_itemFilter = _headContext.getFilter();
	//  267  531:aload_0         
	//  268  532:aload_0         
	//  269  533:getfield        #37  <Field TokenFilterContext _headContext>
	//  270  536:invokevirtual   #122 <Method TokenFilter TokenFilterContext.getFilter()>
	//  271  539:putfield        #29  <Field TokenFilter _itemFilter>
		if(flag)
	//* 272  542:iload_1         
	//* 273  543:ifeq            207
		{
			_currToken = ((JsonToken) (obj2));
	//  274  546:aload_0         
	//  275  547:aload_3         
	//  276  548:putfield        #79  <Field JsonToken _currToken>
			return ((JsonToken) (obj2));
	//  277  551:aload_3         
	//  278  552:areturn         
		}
		continue; /* Loop/switch isn't completed */
_L5:
		obj1 = ((Object) (_flddelegate.getCurrentName()));
	//  279  553:aload_0         
	//  280  554:getfield        #72  <Field JsonParser _flddelegate>
	//  281  557:invokevirtual   #134 <Method String JsonParser.getCurrentName()>
	//  282  560:astore_2        
		TokenFilter tokenfilter2 = _headContext.setFieldName(((String) (obj1)));
	//  283  561:aload_0         
	//  284  562:getfield        #37  <Field TokenFilterContext _headContext>
	//  285  565:aload_2         
	//  286  566:invokevirtual   #138 <Method TokenFilter TokenFilterContext.setFieldName(String)>
	//  287  569:astore          4
		if(tokenfilter2 == TokenFilter.INCLUDE_ALL)
	//* 288  571:aload           4
	//* 289  573:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 290  576:if_acmpne       638
		{
			_itemFilter = tokenfilter2;
	//  291  579:aload_0         
	//  292  580:aload           4
	//  293  582:putfield        #29  <Field TokenFilter _itemFilter>
			obj1 = obj2;
	//  294  585:aload_3         
	//  295  586:astore_2        
			if(!_includePath)
	//* 296  587:aload_0         
	//* 297  588:getfield        #39  <Field boolean _includePath>
	//* 298  591:ifne            631
			{
				obj1 = obj2;
	//  299  594:aload_3         
	//  300  595:astore_2        
				if(_includeImmediateParent)
	//* 301  596:aload_0         
	//* 302  597:getfield        #289 <Field boolean _includeImmediateParent>
	//* 303  600:ifeq            631
				{
					obj1 = obj2;
	//  304  603:aload_3         
	//  305  604:astore_2        
					if(!_headContext.isStartHandled())
	//* 306  605:aload_0         
	//* 307  606:getfield        #37  <Field TokenFilterContext _headContext>
	//* 308  609:invokevirtual   #119 <Method boolean TokenFilterContext.isStartHandled()>
	//* 309  612:ifne            631
					{
						obj1 = ((Object) (_headContext.nextTokenToRead()));
	//  310  615:aload_0         
	//  311  616:getfield        #37  <Field TokenFilterContext _headContext>
	//  312  619:invokevirtual   #52  <Method JsonToken TokenFilterContext.nextTokenToRead()>
	//  313  622:astore_2        
						_exposedContext = _headContext;
	//  314  623:aload_0         
	//  315  624:aload_0         
	//  316  625:getfield        #37  <Field TokenFilterContext _headContext>
	//  317  628:putfield        #48  <Field TokenFilterContext _exposedContext>
					}
				}
			}
			_currToken = ((JsonToken) (obj1));
	//  318  631:aload_0         
	//  319  632:aload_2         
	//  320  633:putfield        #79  <Field JsonToken _currToken>
			return ((JsonToken) (obj1));
	//  321  636:aload_2         
	//  322  637:areturn         
		}
		if(tokenfilter2 == null)
	//* 323  638:aload           4
	//* 324  640:ifnonnull       662
		{
			_flddelegate.nextToken();
	//  325  643:aload_0         
	//  326  644:getfield        #72  <Field JsonParser _flddelegate>
	//  327  647:invokevirtual   #77  <Method JsonToken JsonParser.nextToken()>
	//  328  650:pop             
			_flddelegate.skipChildren();
	//  329  651:aload_0         
	//  330  652:getfield        #72  <Field JsonParser _flddelegate>
	//  331  655:invokevirtual   #98  <Method JsonParser JsonParser.skipChildren()>
	//  332  658:pop             
			continue; /* Loop/switch isn't completed */
	//  333  659:goto            207
		}
		obj1 = ((Object) (tokenfilter2.includeProperty(((String) (obj1)))));
	//  334  662:aload           4
	//  335  664:aload_2         
	//  336  665:invokevirtual   #141 <Method TokenFilter TokenFilter.includeProperty(String)>
	//  337  668:astore_2        
		if(obj1 != null)
			break; /* Loop/switch isn't completed */
	//  338  669:aload_2         
	//  339  670:ifnonnull       692
		_flddelegate.nextToken();
	//  340  673:aload_0         
	//  341  674:getfield        #72  <Field JsonParser _flddelegate>
	//  342  677:invokevirtual   #77  <Method JsonToken JsonParser.nextToken()>
	//  343  680:pop             
		_flddelegate.skipChildren();
	//  344  681:aload_0         
	//  345  682:getfield        #72  <Field JsonParser _flddelegate>
	//  346  685:invokevirtual   #98  <Method JsonParser JsonParser.skipChildren()>
	//  347  688:pop             
		if(true) goto _L9; else goto _L8
	//  348  689:goto            207
_L8:
		_itemFilter = ((TokenFilter) (obj1));
	//  349  692:aload_0         
	//  350  693:aload_2         
	//  351  694:putfield        #29  <Field TokenFilter _itemFilter>
		if(obj1 == TokenFilter.INCLUDE_ALL && _includePath)
	//* 352  697:aload_2         
	//* 353  698:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 354  701:if_acmpne       718
	//* 355  704:aload_0         
	//* 356  705:getfield        #39  <Field boolean _includePath>
	//* 357  708:ifeq            718
		{
			_currToken = ((JsonToken) (obj2));
	//  358  711:aload_0         
	//  359  712:aload_3         
	//  360  713:putfield        #79  <Field JsonToken _currToken>
			return ((JsonToken) (obj2));
	//  361  716:aload_3         
	//  362  717:areturn         
		}
		if(_includePath)
	//* 363  718:aload_0         
	//* 364  719:getfield        #39  <Field boolean _includePath>
	//* 365  722:ifeq            207
		{
			obj1 = ((Object) (_nextTokenWithBuffering(_headContext)));
	//  366  725:aload_0         
	//  367  726:aload_0         
	//  368  727:getfield        #37  <Field TokenFilterContext _headContext>
	//  369  730:invokevirtual   #109 <Method JsonToken _nextTokenWithBuffering(TokenFilterContext)>
	//  370  733:astore_2        
			if(obj1 != null)
	//* 371  734:aload_2         
	//* 372  735:ifnull          207
			{
				_currToken = ((JsonToken) (obj1));
	//  373  738:aload_0         
	//  374  739:aload_2         
	//  375  740:putfield        #79  <Field JsonToken _currToken>
				return ((JsonToken) (obj1));
	//  376  743:aload_2         
	//  377  744:areturn         
			}
		}
		continue; /* Loop/switch isn't completed */
_L1:
		Object obj1 = ((Object) (_itemFilter));
		if(obj1 == TokenFilter.INCLUDE_ALL)
		{
			_currToken = ((JsonToken) (obj2));
			return ((JsonToken) (obj2));
		}
		if(obj1 != null)
	//* 378  745:aload_2         
	//* 379  746:ifnull          207
		{
			obj1 = ((Object) (_headContext.checkValue(((TokenFilter) (obj1)))));
	//  380  749:aload_0         
	//  381  750:getfield        #37  <Field TokenFilterContext _headContext>
	//  382  753:aload_2         
	//  383  754:invokevirtual   #102 <Method TokenFilter TokenFilterContext.checkValue(TokenFilter)>
	//  384  757:astore_2        
			if(obj1 == TokenFilter.INCLUDE_ALL || obj1 != null && ((TokenFilter) (obj1)).includeValue(_flddelegate))
	//* 385  758:aload_2         
	//* 386  759:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 387  762:if_acmpeq       780
	//* 388  765:aload_2         
	//* 389  766:ifnull          207
	//* 390  769:aload_2         
	//* 391  770:aload_0         
	//* 392  771:getfield        #72  <Field JsonParser _flddelegate>
	//* 393  774:invokevirtual   #145 <Method boolean TokenFilter.includeValue(JsonParser)>
	//* 394  777:ifeq            207
			{
				_currToken = ((JsonToken) (obj2));
	//  395  780:aload_0         
	//  396  781:aload_3         
	//  397  782:putfield        #79  <Field JsonToken _currToken>
				return ((JsonToken) (obj2));
	//  398  785:aload_3         
	//  399  786:areturn         
			}
		}
		if(true) goto _L9; else goto _L10
_L10:
	}

	public JsonToken nextValue()
		throws IOException
	{
		JsonToken jsontoken1 = nextToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #291 <Method JsonToken nextToken()>
	//    2    4:astore_2        
		JsonToken jsontoken = jsontoken1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(jsontoken1 == JsonToken.FIELD_NAME)
	//*   5    7:aload_2         
	//*   6    8:getstatic       #294 <Field JsonToken JsonToken.FIELD_NAME>
	//*   7   11:if_acmpne       19
			jsontoken = nextToken();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #291 <Method JsonToken nextToken()>
	//   10   18:astore_1        
		return jsontoken;
	//   11   19:aload_1         
	//   12   20:areturn         
	}

	public void overrideCurrentName(String s)
	{
		throw new UnsupportedOperationException("Can not currently override name during filtering read");
	//    0    0:new             #298 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #300 <String "Can not currently override name during filtering read">
	//    3    7:invokespecial   #302 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	public int readBinaryValue(Base64Variant base64variant, OutputStream outputstream)
		throws IOException
	{
		return _flddelegate.readBinaryValue(base64variant, outputstream);
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #306 <Method int JsonParser.readBinaryValue(Base64Variant, OutputStream)>
	//    5    9:ireturn         
	}

	public JsonParser skipChildren()
		throws IOException
	{
		if(_currToken == JsonToken.START_OBJECT || _currToken == JsonToken.START_ARRAY) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field JsonToken _currToken>
	//    2    4:getstatic       #174 <Field JsonToken JsonToken.START_OBJECT>
	//    3    7:if_acmpeq       22
	//    4   10:aload_0         
	//    5   11:getfield        #79  <Field JsonToken _currToken>
	//    6   14:getstatic       #177 <Field JsonToken JsonToken.START_ARRAY>
	//    7   17:if_acmpeq       22
_L1:
		return ((JsonParser) (this));
	//    8   20:aload_0         
	//    9   21:areturn         
_L2:
		int i = 1;
	//   10   22:iconst_1        
	//   11   23:istore_1        
_L4:
		JsonToken jsontoken = nextToken();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #291 <Method JsonToken nextToken()>
	//   14   28:astore_3        
		if(jsontoken == null) goto _L1; else goto _L3
	//   15   29:aload_3         
	//   16   30:ifnull          20
_L3:
		if(!jsontoken.isStructStart())
			continue; /* Loop/switch isn't completed */
	//   17   33:aload_3         
	//   18   34:invokevirtual   #309 <Method boolean JsonToken.isStructStart()>
	//   19   37:ifeq            47
		i++;
	//   20   40:iload_1         
	//   21   41:iconst_1        
	//   22   42:iadd            
	//   23   43:istore_1        
		  goto _L4
		  goto _L1
	//*  24   44:goto            24
		if(!jsontoken.isStructEnd()) goto _L4; else goto _L5
	//   25   47:aload_3         
	//   26   48:invokevirtual   #312 <Method boolean JsonToken.isStructEnd()>
	//   27   51:ifeq            24
_L5:
		int j = i - 1;
	//   28   54:iload_1         
	//   29   55:iconst_1        
	//   30   56:isub            
	//   31   57:istore_2        
		i = j;
	//   32   58:iload_2         
	//   33   59:istore_1        
		if(j == 0)
	//*  34   60:iload_2         
	//*  35   61:ifne            24
			return ((JsonParser) (this));
	//   36   64:aload_0         
	//   37   65:areturn         
		  goto _L4
	}

	protected boolean _allowMultipleMatches;
	protected JsonToken _currToken;
	protected TokenFilterContext _exposedContext;
	protected TokenFilterContext _headContext;
	protected boolean _includeImmediateParent;
	protected boolean _includePath;
	protected TokenFilter _itemFilter;
	protected JsonToken _lastClearedToken;
	protected int _matchCount;
	protected TokenFilter rootFilter;
}
