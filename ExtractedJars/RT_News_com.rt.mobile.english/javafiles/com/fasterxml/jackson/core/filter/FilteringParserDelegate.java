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
					do
					{
						TokenFilter tokenfilter2;
label1:
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
	//	               1 457
	//	               2 391
	//	               3 230
	//	               4 391
	//	               5 85
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

							case 5: // '\005'
								obj = ((Object) (_flddelegate.getCurrentName()));
	//   25   85:aload_0         
	//   26   86:getfield        #72  <Field JsonParser _flddelegate>
	//   27   89:invokevirtual   #94  <Method String JsonParser.getCurrentName()>
	//   28   92:astore_2        
								TokenFilter tokenfilter = _headContext.setFieldName(((String) (obj)));
	//   29   93:aload_0         
	//   30   94:getfield        #37  <Field TokenFilterContext _headContext>
	//   31   97:aload_2         
	//   32   98:invokevirtual   #98  <Method TokenFilter TokenFilterContext.setFieldName(String)>
	//   33  101:astore_3        
								if(tokenfilter == TokenFilter.INCLUDE_ALL)
	//*  34  102:aload_3         
	//*  35  103:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//*  36  106:if_acmpne       123
								{
									_itemFilter = tokenfilter;
	//   37  109:aload_0         
	//   38  110:aload_3         
	//   39  111:putfield        #29  <Field TokenFilter _itemFilter>
									_currToken = jsontoken;
	//   40  114:aload_0         
	//   41  115:aload           4
	//   42  117:putfield        #79  <Field JsonToken _currToken>
									return jsontoken;
	//   43  120:aload           4
	//   44  122:areturn         
								}
								if(tokenfilter == null)
	//*  45  123:aload_3         
	//*  46  124:ifnonnull       146
								{
									_flddelegate.nextToken();
	//   47  127:aload_0         
	//   48  128:getfield        #72  <Field JsonParser _flddelegate>
	//   49  131:invokevirtual   #77  <Method JsonToken JsonParser.nextToken()>
	//   50  134:pop             
									_flddelegate.skipChildren();
	//   51  135:aload_0         
	//   52  136:getfield        #72  <Field JsonParser _flddelegate>
	//   53  139:invokevirtual   #102 <Method JsonParser JsonParser.skipChildren()>
	//   54  142:pop             
								} else
	//*  55  143:goto            0
								{
									obj = ((Object) (tokenfilter.includeProperty(((String) (obj)))));
	//   56  146:aload_3         
	//   57  147:aload_2         
	//   58  148:invokevirtual   #105 <Method TokenFilter TokenFilter.includeProperty(String)>
	//   59  151:astore_2        
									if(obj == null)
	//*  60  152:aload_2         
	//*  61  153:ifnonnull       175
									{
										_flddelegate.nextToken();
	//   62  156:aload_0         
	//   63  157:getfield        #72  <Field JsonParser _flddelegate>
	//   64  160:invokevirtual   #77  <Method JsonToken JsonParser.nextToken()>
	//   65  163:pop             
										_flddelegate.skipChildren();
	//   66  164:aload_0         
	//   67  165:getfield        #72  <Field JsonParser _flddelegate>
	//   68  168:invokevirtual   #102 <Method JsonParser JsonParser.skipChildren()>
	//   69  171:pop             
									} else
	//*  70  172:goto            0
									{
										_itemFilter = ((TokenFilter) (obj));
	//   71  175:aload_0         
	//   72  176:aload_2         
	//   73  177:putfield        #29  <Field TokenFilter _itemFilter>
										if(obj == TokenFilter.INCLUDE_ALL)
	//*  74  180:aload_2         
	//*  75  181:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//*  76  184:if_acmpne       203
										{
											if(_includePath)
	//*  77  187:aload_0         
	//*  78  188:getfield        #39  <Field boolean _includePath>
	//*  79  191:ifeq            0
											{
												_currToken = jsontoken;
	//   80  194:aload_0         
	//   81  195:aload           4
	//   82  197:putfield        #79  <Field JsonToken _currToken>
												return jsontoken;
	//   83  200:aload           4
	//   84  202:areturn         
											}
										} else
										if(_includePath)
	//*  85  203:aload_0         
	//*  86  204:getfield        #39  <Field boolean _includePath>
	//*  87  207:ifeq            0
										{
											obj = ((Object) (_nextTokenWithBuffering(_headContext)));
	//   88  210:aload_0         
	//   89  211:aload_0         
	//   90  212:getfield        #37  <Field TokenFilterContext _headContext>
	//   91  215:invokevirtual   #108 <Method JsonToken _nextTokenWithBuffering(TokenFilterContext)>
	//   92  218:astore_2        
											if(obj != null)
	//*  93  219:aload_2         
	//*  94  220:ifnull          0
											{
												_currToken = ((JsonToken) (obj));
	//   95  223:aload_0         
	//   96  224:aload_2         
	//   97  225:putfield        #79  <Field JsonToken _currToken>
												return ((JsonToken) (obj));
	//   98  228:aload_2         
	//   99  229:areturn         
											}
										}
									}
								}
								continue;

							case 3: // '\003'
								obj = ((Object) (_itemFilter));
	//  100  230:aload_0         
	//  101  231:getfield        #29  <Field TokenFilter _itemFilter>
	//  102  234:astore_2        
								if(obj == TokenFilter.INCLUDE_ALL)
	//* 103  235:aload_2         
	//* 104  236:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 105  239:if_acmpne       264
								{
									_headContext = _headContext.createChildArrayContext(((TokenFilter) (obj)), true);
	//  106  242:aload_0         
	//  107  243:aload_0         
	//  108  244:getfield        #37  <Field TokenFilterContext _headContext>
	//  109  247:aload_2         
	//  110  248:iconst_1        
	//  111  249:invokevirtual   #112 <Method TokenFilterContext TokenFilterContext.createChildArrayContext(TokenFilter, boolean)>
	//  112  252:putfield        #37  <Field TokenFilterContext _headContext>
									_currToken = jsontoken;
	//  113  255:aload_0         
	//  114  256:aload           4
	//  115  258:putfield        #79  <Field JsonToken _currToken>
									return jsontoken;
	//  116  261:aload           4
	//  117  263:areturn         
								}
								if(obj == null)
	//* 118  264:aload_2         
	//* 119  265:ifnonnull       279
								{
									_flddelegate.skipChildren();
	//  120  268:aload_0         
	//  121  269:getfield        #72  <Field JsonParser _flddelegate>
	//  122  272:invokevirtual   #102 <Method JsonParser JsonParser.skipChildren()>
	//  123  275:pop             
								} else
	//* 124  276:goto            0
								{
									TokenFilter tokenfilter1 = _headContext.checkValue(((TokenFilter) (obj)));
	//  125  279:aload_0         
	//  126  280:getfield        #37  <Field TokenFilterContext _headContext>
	//  127  283:aload_2         
	//  128  284:invokevirtual   #116 <Method TokenFilter TokenFilterContext.checkValue(TokenFilter)>
	//  129  287:astore_3        
									if(tokenfilter1 == null)
	//* 130  288:aload_3         
	//* 131  289:ifnonnull       303
									{
										_flddelegate.skipChildren();
	//  132  292:aload_0         
	//  133  293:getfield        #72  <Field JsonParser _flddelegate>
	//  134  296:invokevirtual   #102 <Method JsonParser JsonParser.skipChildren()>
	//  135  299:pop             
									} else
	//* 136  300:goto            0
									{
										obj = ((Object) (tokenfilter1));
	//  137  303:aload_3         
	//  138  304:astore_2        
										if(tokenfilter1 != TokenFilter.INCLUDE_ALL)
	//* 139  305:aload_3         
	//* 140  306:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 141  309:if_acmpeq       317
											obj = ((Object) (tokenfilter1.filterStartArray()));
	//  142  312:aload_3         
	//  143  313:invokevirtual   #120 <Method TokenFilter TokenFilter.filterStartArray()>
	//  144  316:astore_2        
										_itemFilter = ((TokenFilter) (obj));
	//  145  317:aload_0         
	//  146  318:aload_2         
	//  147  319:putfield        #29  <Field TokenFilter _itemFilter>
										if(obj == TokenFilter.INCLUDE_ALL)
	//* 148  322:aload_2         
	//* 149  323:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 150  326:if_acmpne       351
										{
											_headContext = _headContext.createChildArrayContext(((TokenFilter) (obj)), true);
	//  151  329:aload_0         
	//  152  330:aload_0         
	//  153  331:getfield        #37  <Field TokenFilterContext _headContext>
	//  154  334:aload_2         
	//  155  335:iconst_1        
	//  156  336:invokevirtual   #112 <Method TokenFilterContext TokenFilterContext.createChildArrayContext(TokenFilter, boolean)>
	//  157  339:putfield        #37  <Field TokenFilterContext _headContext>
											_currToken = jsontoken;
	//  158  342:aload_0         
	//  159  343:aload           4
	//  160  345:putfield        #79  <Field JsonToken _currToken>
											return jsontoken;
	//  161  348:aload           4
	//  162  350:areturn         
										}
										_headContext = _headContext.createChildArrayContext(((TokenFilter) (obj)), false);
	//  163  351:aload_0         
	//  164  352:aload_0         
	//  165  353:getfield        #37  <Field TokenFilterContext _headContext>
	//  166  356:aload_2         
	//  167  357:iconst_0        
	//  168  358:invokevirtual   #112 <Method TokenFilterContext TokenFilterContext.createChildArrayContext(TokenFilter, boolean)>
	//  169  361:putfield        #37  <Field TokenFilterContext _headContext>
										if(_includePath)
	//* 170  364:aload_0         
	//* 171  365:getfield        #39  <Field boolean _includePath>
	//* 172  368:ifeq            0
										{
											obj = ((Object) (_nextTokenWithBuffering(_headContext)));
	//  173  371:aload_0         
	//  174  372:aload_0         
	//  175  373:getfield        #37  <Field TokenFilterContext _headContext>
	//  176  376:invokevirtual   #108 <Method JsonToken _nextTokenWithBuffering(TokenFilterContext)>
	//  177  379:astore_2        
											if(obj != null)
	//* 178  380:aload_2         
	//* 179  381:ifnull          0
											{
												_currToken = ((JsonToken) (obj));
	//  180  384:aload_0         
	//  181  385:aload_2         
	//  182  386:putfield        #79  <Field JsonToken _currToken>
												return ((JsonToken) (obj));
	//  183  389:aload_2         
	//  184  390:areturn         
											}
										}
									}
								}
								continue;

							case 2: // '\002'
							case 4: // '\004'
								boolean flag = _headContext.isStartHandled();
	//  185  391:aload_0         
	//  186  392:getfield        #37  <Field TokenFilterContext _headContext>
	//  187  395:invokevirtual   #124 <Method boolean TokenFilterContext.isStartHandled()>
	//  188  398:istore_1        
								obj = ((Object) (_headContext.getFilter()));
	//  189  399:aload_0         
	//  190  400:getfield        #37  <Field TokenFilterContext _headContext>
	//  191  403:invokevirtual   #127 <Method TokenFilter TokenFilterContext.getFilter()>
	//  192  406:astore_2        
								if(obj != null && obj != TokenFilter.INCLUDE_ALL)
	//* 193  407:aload_2         
	//* 194  408:ifnull          422
	//* 195  411:aload_2         
	//* 196  412:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 197  415:if_acmpeq       422
									((TokenFilter) (obj)).filterFinishArray();
	//  198  418:aload_2         
	//  199  419:invokevirtual   #131 <Method void TokenFilter.filterFinishArray()>
								_headContext = _headContext.getParent();
	//  200  422:aload_0         
	//  201  423:aload_0         
	//  202  424:getfield        #37  <Field TokenFilterContext _headContext>
	//  203  427:invokevirtual   #135 <Method TokenFilterContext TokenFilterContext.getParent()>
	//  204  430:putfield        #37  <Field TokenFilterContext _headContext>
								_itemFilter = _headContext.getFilter();
	//  205  433:aload_0         
	//  206  434:aload_0         
	//  207  435:getfield        #37  <Field TokenFilterContext _headContext>
	//  208  438:invokevirtual   #127 <Method TokenFilter TokenFilterContext.getFilter()>
	//  209  441:putfield        #29  <Field TokenFilter _itemFilter>
								if(flag)
	//* 210  444:iload_1         
	//* 211  445:ifeq            0
								{
									_currToken = jsontoken;
	//  212  448:aload_0         
	//  213  449:aload           4
	//  214  451:putfield        #79  <Field JsonToken _currToken>
									return jsontoken;
	//  215  454:aload           4
	//  216  456:areturn         
								}
								continue;

							case 1: // '\001'
								obj = ((Object) (_itemFilter));
	//  217  457:aload_0         
	//  218  458:getfield        #29  <Field TokenFilter _itemFilter>
	//  219  461:astore_2        
								if(obj == TokenFilter.INCLUDE_ALL)
	//* 220  462:aload_2         
	//* 221  463:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 222  466:if_acmpne       491
								{
									_headContext = _headContext.createChildObjectContext(((TokenFilter) (obj)), true);
	//  223  469:aload_0         
	//  224  470:aload_0         
	//  225  471:getfield        #37  <Field TokenFilterContext _headContext>
	//  226  474:aload_2         
	//  227  475:iconst_1        
	//  228  476:invokevirtual   #138 <Method TokenFilterContext TokenFilterContext.createChildObjectContext(TokenFilter, boolean)>
	//  229  479:putfield        #37  <Field TokenFilterContext _headContext>
									_currToken = jsontoken;
	//  230  482:aload_0         
	//  231  483:aload           4
	//  232  485:putfield        #79  <Field JsonToken _currToken>
									return jsontoken;
	//  233  488:aload           4
	//  234  490:areturn         
								}
								if(obj == null)
	//* 235  491:aload_2         
	//* 236  492:ifnonnull       506
								{
									_flddelegate.skipChildren();
	//  237  495:aload_0         
	//  238  496:getfield        #72  <Field JsonParser _flddelegate>
	//  239  499:invokevirtual   #102 <Method JsonParser JsonParser.skipChildren()>
	//  240  502:pop             
									continue;
	//  241  503:goto            0
								}
								tokenfilter2 = _headContext.checkValue(((TokenFilter) (obj)));
	//  242  506:aload_0         
	//  243  507:getfield        #37  <Field TokenFilterContext _headContext>
	//  244  510:aload_2         
	//  245  511:invokevirtual   #116 <Method TokenFilter TokenFilterContext.checkValue(TokenFilter)>
	//  246  514:astore_3        
								if(tokenfilter2 != null)
									break label1;
	//  247  515:aload_3         
	//  248  516:ifnonnull       530
								_flddelegate.skipChildren();
	//  249  519:aload_0         
	//  250  520:getfield        #72  <Field JsonParser _flddelegate>
	//  251  523:invokevirtual   #102 <Method JsonParser JsonParser.skipChildren()>
	//  252  526:pop             
								break;
							}
						} while(true);
	//  253  527:goto            0
						obj = ((Object) (tokenfilter2));
	//  254  530:aload_3         
	//  255  531:astore_2        
						if(tokenfilter2 != TokenFilter.INCLUDE_ALL)
	//* 256  532:aload_3         
	//* 257  533:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 258  536:if_acmpeq       544
							obj = ((Object) (tokenfilter2.filterStartObject()));
	//  259  539:aload_3         
	//  260  540:invokevirtual   #141 <Method TokenFilter TokenFilter.filterStartObject()>
	//  261  543:astore_2        
						_itemFilter = ((TokenFilter) (obj));
	//  262  544:aload_0         
	//  263  545:aload_2         
	//  264  546:putfield        #29  <Field TokenFilter _itemFilter>
						if(obj == TokenFilter.INCLUDE_ALL)
	//* 265  549:aload_2         
	//* 266  550:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 267  553:if_acmpne       578
						{
							_headContext = _headContext.createChildObjectContext(((TokenFilter) (obj)), true);
	//  268  556:aload_0         
	//  269  557:aload_0         
	//  270  558:getfield        #37  <Field TokenFilterContext _headContext>
	//  271  561:aload_2         
	//  272  562:iconst_1        
	//  273  563:invokevirtual   #138 <Method TokenFilterContext TokenFilterContext.createChildObjectContext(TokenFilter, boolean)>
	//  274  566:putfield        #37  <Field TokenFilterContext _headContext>
							_currToken = jsontoken;
	//  275  569:aload_0         
	//  276  570:aload           4
	//  277  572:putfield        #79  <Field JsonToken _currToken>
							return jsontoken;
	//  278  575:aload           4
	//  279  577:areturn         
						}
						_headContext = _headContext.createChildObjectContext(((TokenFilter) (obj)), false);
	//  280  578:aload_0         
	//  281  579:aload_0         
	//  282  580:getfield        #37  <Field TokenFilterContext _headContext>
	//  283  583:aload_2         
	//  284  584:iconst_0        
	//  285  585:invokevirtual   #138 <Method TokenFilterContext TokenFilterContext.createChildObjectContext(TokenFilter, boolean)>
	//  286  588:putfield        #37  <Field TokenFilterContext _headContext>
					} while(!_includePath);
	//  287  591:aload_0         
	//  288  592:getfield        #39  <Field boolean _includePath>
	//  289  595:ifeq            0
					obj = ((Object) (_nextTokenWithBuffering(_headContext)));
	//  290  598:aload_0         
	//  291  599:aload_0         
	//  292  600:getfield        #37  <Field TokenFilterContext _headContext>
	//  293  603:invokevirtual   #108 <Method JsonToken _nextTokenWithBuffering(TokenFilterContext)>
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
	//  307  627:invokevirtual   #116 <Method TokenFilter TokenFilterContext.checkValue(TokenFilter)>
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
		Object obj;
		do
		{
			do
label0:
				do
				{
					obj = ((Object) (_flddelegate.nextToken()));
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #77  <Method JsonToken JsonParser.nextToken()>
	//    3    7:astore          5
					if(obj == null)
	//*   4    9:aload           5
	//*   5   11:ifnonnull       17
						return ((JsonToken) (obj));
	//    6   14:aload           5
	//    7   16:areturn         
					int i = ((JsonToken) (obj)).id();
	//    8   17:aload           5
	//    9   19:invokevirtual   #85  <Method int JsonToken.id()>
	//   10   22:istore_2        
					boolean flag2 = false;
	//   11   23:iconst_0        
	//   12   24:istore          4
					switch(i)
	//*  13   26:iload_2         
					{
	//*  14   27:tableswitch     1 5: default 60
	//	               1 403
	//	               2 296
	//	               3 197
	//	               4 296
	//	               5 80
					default:
						obj = ((Object) (_itemFilter));
	//   15   60:aload_0         
	//   16   61:getfield        #29  <Field TokenFilter _itemFilter>
	//   17   64:astore          5
						if(obj == TokenFilter.INCLUDE_ALL)
	//*  18   66:aload           5
	//*  19   68:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//*  20   71:if_acmpne       547
							return _nextBuffered(tokenfiltercontext);
	//   21   74:aload_0         
	//   22   75:aload_1         
	//   23   76:invokespecial   #147 <Method JsonToken _nextBuffered(TokenFilterContext)>
	//   24   79:areturn         
						break label0;

					case 5: // '\005'
						obj = ((Object) (_flddelegate.getCurrentName()));
	//   25   80:aload_0         
	//   26   81:getfield        #72  <Field JsonParser _flddelegate>
	//   27   84:invokevirtual   #94  <Method String JsonParser.getCurrentName()>
	//   28   87:astore          5
						TokenFilter tokenfilter = _headContext.setFieldName(((String) (obj)));
	//   29   89:aload_0         
	//   30   90:getfield        #37  <Field TokenFilterContext _headContext>
	//   31   93:aload           5
	//   32   95:invokevirtual   #98  <Method TokenFilter TokenFilterContext.setFieldName(String)>
	//   33   98:astore          6
						if(tokenfilter == TokenFilter.INCLUDE_ALL)
	//*  34  100:aload           6
	//*  35  102:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//*  36  105:if_acmpne       120
						{
							_itemFilter = tokenfilter;
	//   37  108:aload_0         
	//   38  109:aload           6
	//   39  111:putfield        #29  <Field TokenFilter _itemFilter>
							return _nextBuffered(tokenfiltercontext);
	//   40  114:aload_0         
	//   41  115:aload_1         
	//   42  116:invokespecial   #147 <Method JsonToken _nextBuffered(TokenFilterContext)>
	//   43  119:areturn         
						}
						if(tokenfilter == null)
	//*  44  120:aload           6
	//*  45  122:ifnonnull       144
						{
							_flddelegate.nextToken();
	//   46  125:aload_0         
	//   47  126:getfield        #72  <Field JsonParser _flddelegate>
	//   48  129:invokevirtual   #77  <Method JsonToken JsonParser.nextToken()>
	//   49  132:pop             
							_flddelegate.skipChildren();
	//   50  133:aload_0         
	//   51  134:getfield        #72  <Field JsonParser _flddelegate>
	//   52  137:invokevirtual   #102 <Method JsonParser JsonParser.skipChildren()>
	//   53  140:pop             
						} else
	//*  54  141:goto            0
						{
							obj = ((Object) (tokenfilter.includeProperty(((String) (obj)))));
	//   55  144:aload           6
	//   56  146:aload           5
	//   57  148:invokevirtual   #105 <Method TokenFilter TokenFilter.includeProperty(String)>
	//   58  151:astore          5
							if(obj == null)
	//*  59  153:aload           5
	//*  60  155:ifnonnull       177
							{
								_flddelegate.nextToken();
	//   61  158:aload_0         
	//   62  159:getfield        #72  <Field JsonParser _flddelegate>
	//   63  162:invokevirtual   #77  <Method JsonToken JsonParser.nextToken()>
	//   64  165:pop             
								_flddelegate.skipChildren();
	//   65  166:aload_0         
	//   66  167:getfield        #72  <Field JsonParser _flddelegate>
	//   67  170:invokevirtual   #102 <Method JsonParser JsonParser.skipChildren()>
	//   68  173:pop             
							} else
	//*  69  174:goto            0
							{
								_itemFilter = ((TokenFilter) (obj));
	//   70  177:aload_0         
	//   71  178:aload           5
	//   72  180:putfield        #29  <Field TokenFilter _itemFilter>
								if(obj == TokenFilter.INCLUDE_ALL)
	//*  73  183:aload           5
	//*  74  185:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//*  75  188:if_acmpne       0
									return _nextBuffered(tokenfiltercontext);
	//   76  191:aload_0         
	//   77  192:aload_1         
	//   78  193:invokespecial   #147 <Method JsonToken _nextBuffered(TokenFilterContext)>
	//   79  196:areturn         
							}
						}
						break;

					case 3: // '\003'
						TokenFilter tokenfilter1 = _headContext.checkValue(_itemFilter);
	//   80  197:aload_0         
	//   81  198:getfield        #37  <Field TokenFilterContext _headContext>
	//   82  201:aload_0         
	//   83  202:getfield        #29  <Field TokenFilter _itemFilter>
	//   84  205:invokevirtual   #116 <Method TokenFilter TokenFilterContext.checkValue(TokenFilter)>
	//   85  208:astore          6
						if(tokenfilter1 == null)
	//*  86  210:aload           6
	//*  87  212:ifnonnull       226
						{
							_flddelegate.skipChildren();
	//   88  215:aload_0         
	//   89  216:getfield        #72  <Field JsonParser _flddelegate>
	//   90  219:invokevirtual   #102 <Method JsonParser JsonParser.skipChildren()>
	//   91  222:pop             
						} else
	//*  92  223:goto            0
						{
							obj = ((Object) (tokenfilter1));
	//   93  226:aload           6
	//   94  228:astore          5
							if(tokenfilter1 != TokenFilter.INCLUDE_ALL)
	//*  95  230:aload           6
	//*  96  232:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//*  97  235:if_acmpeq       245
								obj = ((Object) (tokenfilter1.filterStartArray()));
	//   98  238:aload           6
	//   99  240:invokevirtual   #120 <Method TokenFilter TokenFilter.filterStartArray()>
	//  100  243:astore          5
							_itemFilter = ((TokenFilter) (obj));
	//  101  245:aload_0         
	//  102  246:aload           5
	//  103  248:putfield        #29  <Field TokenFilter _itemFilter>
							if(obj == TokenFilter.INCLUDE_ALL)
	//* 104  251:aload           5
	//* 105  253:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 106  256:if_acmpne       279
							{
								_headContext = _headContext.createChildArrayContext(((TokenFilter) (obj)), true);
	//  107  259:aload_0         
	//  108  260:aload_0         
	//  109  261:getfield        #37  <Field TokenFilterContext _headContext>
	//  110  264:aload           5
	//  111  266:iconst_1        
	//  112  267:invokevirtual   #112 <Method TokenFilterContext TokenFilterContext.createChildArrayContext(TokenFilter, boolean)>
	//  113  270:putfield        #37  <Field TokenFilterContext _headContext>
								return _nextBuffered(tokenfiltercontext);
	//  114  273:aload_0         
	//  115  274:aload_1         
	//  116  275:invokespecial   #147 <Method JsonToken _nextBuffered(TokenFilterContext)>
	//  117  278:areturn         
							}
							_headContext = _headContext.createChildArrayContext(((TokenFilter) (obj)), false);
	//  118  279:aload_0         
	//  119  280:aload_0         
	//  120  281:getfield        #37  <Field TokenFilterContext _headContext>
	//  121  284:aload           5
	//  122  286:iconst_0        
	//  123  287:invokevirtual   #112 <Method TokenFilterContext TokenFilterContext.createChildArrayContext(TokenFilter, boolean)>
	//  124  290:putfield        #37  <Field TokenFilterContext _headContext>
						}
						break;

	//* 125  293:goto            0
					case 2: // '\002'
					case 4: // '\004'
						TokenFilter tokenfilter2 = _headContext.getFilter();
	//  126  296:aload_0         
	//  127  297:getfield        #37  <Field TokenFilterContext _headContext>
	//  128  300:invokevirtual   #127 <Method TokenFilter TokenFilterContext.getFilter()>
	//  129  303:astore          6
						if(tokenfilter2 != null && tokenfilter2 != TokenFilter.INCLUDE_ALL)
	//* 130  305:aload           6
	//* 131  307:ifnull          323
	//* 132  310:aload           6
	//* 133  312:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 134  315:if_acmpeq       323
							tokenfilter2.filterFinishArray();
	//  135  318:aload           6
	//  136  320:invokevirtual   #131 <Method void TokenFilter.filterFinishArray()>
						boolean flag;
						if(_headContext == tokenfiltercontext)
	//* 137  323:aload_0         
	//* 138  324:getfield        #37  <Field TokenFilterContext _headContext>
	//* 139  327:aload_1         
	//* 140  328:if_acmpne       336
							flag = true;
	//  141  331:iconst_1        
	//  142  332:istore_2        
						else
	//* 143  333:goto            338
							flag = false;
	//  144  336:iconst_0        
	//  145  337:istore_2        
						boolean flag1 = flag2;
	//  146  338:iload           4
	//  147  340:istore_3        
						if(flag)
	//* 148  341:iload_2         
	//* 149  342:ifeq            360
						{
							flag1 = flag2;
	//  150  345:iload           4
	//  151  347:istore_3        
							if(_headContext.isStartHandled())
	//* 152  348:aload_0         
	//* 153  349:getfield        #37  <Field TokenFilterContext _headContext>
	//* 154  352:invokevirtual   #124 <Method boolean TokenFilterContext.isStartHandled()>
	//* 155  355:ifeq            360
								flag1 = true;
	//  156  358:iconst_1        
	//  157  359:istore_3        
						}
						_headContext = _headContext.getParent();
	//  158  360:aload_0         
	//  159  361:aload_0         
	//  160  362:getfield        #37  <Field TokenFilterContext _headContext>
	//  161  365:invokevirtual   #135 <Method TokenFilterContext TokenFilterContext.getParent()>
	//  162  368:putfield        #37  <Field TokenFilterContext _headContext>
						_itemFilter = _headContext.getFilter();
	//  163  371:aload_0         
	//  164  372:aload_0         
	//  165  373:getfield        #37  <Field TokenFilterContext _headContext>
	//  166  376:invokevirtual   #127 <Method TokenFilter TokenFilterContext.getFilter()>
	//  167  379:putfield        #29  <Field TokenFilter _itemFilter>
						if(flag1)
	//* 168  382:iload_3         
	//* 169  383:ifeq            389
							return ((JsonToken) (obj));
	//  170  386:aload           5
	//  171  388:areturn         
						if(flag || _headContext == tokenfiltercontext)
	//* 172  389:iload_2         
	//* 173  390:ifne            401
	//* 174  393:aload_0         
	//* 175  394:getfield        #37  <Field TokenFilterContext _headContext>
	//* 176  397:aload_1         
	//* 177  398:if_acmpne       0
							return null;
	//  178  401:aconst_null     
	//  179  402:areturn         
						break;

					case 1: // '\001'
						TokenFilter tokenfilter3 = _itemFilter;
	//  180  403:aload_0         
	//  181  404:getfield        #29  <Field TokenFilter _itemFilter>
	//  182  407:astore          6
						if(tokenfilter3 == TokenFilter.INCLUDE_ALL)
	//* 183  409:aload           6
	//* 184  411:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 185  414:if_acmpne       434
						{
							_headContext = _headContext.createChildObjectContext(tokenfilter3, true);
	//  186  417:aload_0         
	//  187  418:aload_0         
	//  188  419:getfield        #37  <Field TokenFilterContext _headContext>
	//  189  422:aload           6
	//  190  424:iconst_1        
	//  191  425:invokevirtual   #138 <Method TokenFilterContext TokenFilterContext.createChildObjectContext(TokenFilter, boolean)>
	//  192  428:putfield        #37  <Field TokenFilterContext _headContext>
							return ((JsonToken) (obj));
	//  193  431:aload           5
	//  194  433:areturn         
						}
						if(tokenfilter3 == null)
	//* 195  434:aload           6
	//* 196  436:ifnonnull       450
						{
							_flddelegate.skipChildren();
	//  197  439:aload_0         
	//  198  440:getfield        #72  <Field JsonParser _flddelegate>
	//  199  443:invokevirtual   #102 <Method JsonParser JsonParser.skipChildren()>
	//  200  446:pop             
						} else
	//* 201  447:goto            0
						{
							tokenfilter3 = _headContext.checkValue(tokenfilter3);
	//  202  450:aload_0         
	//  203  451:getfield        #37  <Field TokenFilterContext _headContext>
	//  204  454:aload           6
	//  205  456:invokevirtual   #116 <Method TokenFilter TokenFilterContext.checkValue(TokenFilter)>
	//  206  459:astore          6
							if(tokenfilter3 == null)
	//* 207  461:aload           6
	//* 208  463:ifnonnull       477
							{
								_flddelegate.skipChildren();
	//  209  466:aload_0         
	//  210  467:getfield        #72  <Field JsonParser _flddelegate>
	//  211  470:invokevirtual   #102 <Method JsonParser JsonParser.skipChildren()>
	//  212  473:pop             
							} else
	//* 213  474:goto            0
							{
								obj = ((Object) (tokenfilter3));
	//  214  477:aload           6
	//  215  479:astore          5
								if(tokenfilter3 != TokenFilter.INCLUDE_ALL)
	//* 216  481:aload           6
	//* 217  483:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 218  486:if_acmpeq       496
									obj = ((Object) (tokenfilter3.filterStartObject()));
	//  219  489:aload           6
	//  220  491:invokevirtual   #141 <Method TokenFilter TokenFilter.filterStartObject()>
	//  221  494:astore          5
								_itemFilter = ((TokenFilter) (obj));
	//  222  496:aload_0         
	//  223  497:aload           5
	//  224  499:putfield        #29  <Field TokenFilter _itemFilter>
								if(obj == TokenFilter.INCLUDE_ALL)
	//* 225  502:aload           5
	//* 226  504:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 227  507:if_acmpne       530
								{
									_headContext = _headContext.createChildObjectContext(((TokenFilter) (obj)), true);
	//  228  510:aload_0         
	//  229  511:aload_0         
	//  230  512:getfield        #37  <Field TokenFilterContext _headContext>
	//  231  515:aload           5
	//  232  517:iconst_1        
	//  233  518:invokevirtual   #138 <Method TokenFilterContext TokenFilterContext.createChildObjectContext(TokenFilter, boolean)>
	//  234  521:putfield        #37  <Field TokenFilterContext _headContext>
									return _nextBuffered(tokenfiltercontext);
	//  235  524:aload_0         
	//  236  525:aload_1         
	//  237  526:invokespecial   #147 <Method JsonToken _nextBuffered(TokenFilterContext)>
	//  238  529:areturn         
								}
								_headContext = _headContext.createChildObjectContext(((TokenFilter) (obj)), false);
	//  239  530:aload_0         
	//  240  531:aload_0         
	//  241  532:getfield        #37  <Field TokenFilterContext _headContext>
	//  242  535:aload           5
	//  243  537:iconst_0        
	//  244  538:invokevirtual   #138 <Method TokenFilterContext TokenFilterContext.createChildObjectContext(TokenFilter, boolean)>
	//  245  541:putfield        #37  <Field TokenFilterContext _headContext>
							}
						}
						break;
					}
				} while(true);
	//  246  544:goto            0
			while(obj == null);
	//  247  547:aload           5
	//  248  549:ifnull          0
			obj = ((Object) (_headContext.checkValue(((TokenFilter) (obj)))));
	//  249  552:aload_0         
	//  250  553:getfield        #37  <Field TokenFilterContext _headContext>
	//  251  556:aload           5
	//  252  558:invokevirtual   #116 <Method TokenFilter TokenFilterContext.checkValue(TokenFilter)>
	//  253  561:astore          5
		} while(obj != TokenFilter.INCLUDE_ALL && (obj == null || !((TokenFilter) (obj)).includeValue(_flddelegate)));
	//  254  563:aload           5
	//  255  565:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//  256  568:if_acmpeq       588
	//  257  571:aload           5
	//  258  573:ifnull          0
	//  259  576:aload           5
	//  260  578:aload_0         
	//  261  579:getfield        #72  <Field JsonParser _flddelegate>
	//  262  582:invokevirtual   #145 <Method boolean TokenFilter.includeValue(JsonParser)>
	//  263  585:ifeq            0
		return _nextBuffered(tokenfiltercontext);
	//  264  588:aload_0         
	//  265  589:aload_1         
	//  266  590:invokespecial   #147 <Method JsonToken _nextBuffered(TokenFilterContext)>
	//  267  593:areturn         
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

	public JsonToken currentToken()
	{
		return _currToken;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field JsonToken _currToken>
	//    2    4:areturn         
	}

	public final int currentTokenId()
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

	public BigInteger getBigIntegerValue()
		throws IOException
	{
		return _flddelegate.getBigIntegerValue();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #156 <Method BigInteger JsonParser.getBigIntegerValue()>
	//    3    7:areturn         
	}

	public byte[] getBinaryValue(Base64Variant base64variant)
		throws IOException
	{
		return _flddelegate.getBinaryValue(base64variant);
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #160 <Method byte[] JsonParser.getBinaryValue(Base64Variant)>
	//    4    8:areturn         
	}

	public boolean getBooleanValue()
		throws IOException
	{
		return _flddelegate.getBooleanValue();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #163 <Method boolean JsonParser.getBooleanValue()>
	//    3    7:ireturn         
	}

	public byte getByteValue()
		throws IOException
	{
		return _flddelegate.getByteValue();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #167 <Method byte JsonParser.getByteValue()>
	//    3    7:ireturn         
	}

	public JsonLocation getCurrentLocation()
	{
		return _flddelegate.getCurrentLocation();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #171 <Method JsonLocation JsonParser.getCurrentLocation()>
	//    3    7:areturn         
	}

	public String getCurrentName()
		throws IOException
	{
		JsonStreamContext jsonstreamcontext = _filterContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #173 <Method JsonStreamContext _filterContext()>
	//    2    4:astore_1        
		if(_currToken != JsonToken.START_OBJECT && _currToken != JsonToken.START_ARRAY)
	//*   3    5:aload_0         
	//*   4    6:getfield        #79  <Field JsonToken _currToken>
	//*   5    9:getstatic       #176 <Field JsonToken JsonToken.START_OBJECT>
	//*   6   12:if_acmpeq       33
	//*   7   15:aload_0         
	//*   8   16:getfield        #79  <Field JsonToken _currToken>
	//*   9   19:getstatic       #179 <Field JsonToken JsonToken.START_ARRAY>
	//*  10   22:if_acmpne       28
	//*  11   25:goto            33
			return jsonstreamcontext.getCurrentName();
	//   12   28:aload_1         
	//   13   29:invokevirtual   #182 <Method String JsonStreamContext.getCurrentName()>
	//   14   32:areturn         
		jsonstreamcontext = jsonstreamcontext.getParent();
	//   15   33:aload_1         
	//   16   34:invokevirtual   #184 <Method JsonStreamContext JsonStreamContext.getParent()>
	//   17   37:astore_1        
		if(jsonstreamcontext == null)
	//*  18   38:aload_1         
	//*  19   39:ifnonnull       44
			return null;
	//   20   42:aconst_null     
	//   21   43:areturn         
		else
			return jsonstreamcontext.getCurrentName();
	//   22   44:aload_1         
	//   23   45:invokevirtual   #182 <Method String JsonStreamContext.getCurrentName()>
	//   24   48:areturn         
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
	//    2    4:invokevirtual   #190 <Method BigDecimal JsonParser.getDecimalValue()>
	//    3    7:areturn         
	}

	public double getDoubleValue()
		throws IOException
	{
		return _flddelegate.getDoubleValue();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #194 <Method double JsonParser.getDoubleValue()>
	//    3    7:dreturn         
	}

	public Object getEmbeddedObject()
		throws IOException
	{
		return _flddelegate.getEmbeddedObject();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #198 <Method Object JsonParser.getEmbeddedObject()>
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
	//    2    4:invokevirtual   #202 <Method float JsonParser.getFloatValue()>
	//    3    7:freturn         
	}

	public int getIntValue()
		throws IOException
	{
		return _flddelegate.getIntValue();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #205 <Method int JsonParser.getIntValue()>
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
	//    2    4:invokevirtual   #210 <Method long JsonParser.getLongValue()>
	//    3    7:lreturn         
	}

	public int getMatchCount()
	{
		return _matchCount;
	//    0    0:aload_0         
	//    1    1:getfield        #213 <Field int _matchCount>
	//    2    4:ireturn         
	}

	public com.fasterxml.jackson.core.JsonParser.NumberType getNumberType()
		throws IOException
	{
		return _flddelegate.getNumberType();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #217 <Method com.fasterxml.jackson.core.JsonParser$NumberType JsonParser.getNumberType()>
	//    3    7:areturn         
	}

	public Number getNumberValue()
		throws IOException
	{
		return _flddelegate.getNumberValue();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #221 <Method Number JsonParser.getNumberValue()>
	//    3    7:areturn         
	}

	public JsonStreamContext getParsingContext()
	{
		return _filterContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #173 <Method JsonStreamContext _filterContext()>
	//    2    4:areturn         
	}

	public short getShortValue()
		throws IOException
	{
		return _flddelegate.getShortValue();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #226 <Method short JsonParser.getShortValue()>
	//    3    7:ireturn         
	}

	public String getText()
		throws IOException
	{
		return _flddelegate.getText();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #229 <Method String JsonParser.getText()>
	//    3    7:areturn         
	}

	public char[] getTextCharacters()
		throws IOException
	{
		return _flddelegate.getTextCharacters();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #233 <Method char[] JsonParser.getTextCharacters()>
	//    3    7:areturn         
	}

	public int getTextLength()
		throws IOException
	{
		return _flddelegate.getTextLength();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #236 <Method int JsonParser.getTextLength()>
	//    3    7:ireturn         
	}

	public int getTextOffset()
		throws IOException
	{
		return _flddelegate.getTextOffset();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #239 <Method int JsonParser.getTextOffset()>
	//    3    7:ireturn         
	}

	public JsonLocation getTokenLocation()
	{
		return _flddelegate.getTokenLocation();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #242 <Method JsonLocation JsonParser.getTokenLocation()>
	//    3    7:areturn         
	}

	public boolean getValueAsBoolean()
		throws IOException
	{
		return _flddelegate.getValueAsBoolean();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #245 <Method boolean JsonParser.getValueAsBoolean()>
	//    3    7:ireturn         
	}

	public boolean getValueAsBoolean(boolean flag)
		throws IOException
	{
		return _flddelegate.getValueAsBoolean(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #248 <Method boolean JsonParser.getValueAsBoolean(boolean)>
	//    4    8:ireturn         
	}

	public double getValueAsDouble()
		throws IOException
	{
		return _flddelegate.getValueAsDouble();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #251 <Method double JsonParser.getValueAsDouble()>
	//    3    7:dreturn         
	}

	public double getValueAsDouble(double d)
		throws IOException
	{
		return _flddelegate.getValueAsDouble(d);
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:dload_1         
	//    3    5:invokevirtual   #254 <Method double JsonParser.getValueAsDouble(double)>
	//    4    8:dreturn         
	}

	public int getValueAsInt()
		throws IOException
	{
		return _flddelegate.getValueAsInt();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #257 <Method int JsonParser.getValueAsInt()>
	//    3    7:ireturn         
	}

	public int getValueAsInt(int i)
		throws IOException
	{
		return _flddelegate.getValueAsInt(i);
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #260 <Method int JsonParser.getValueAsInt(int)>
	//    4    8:ireturn         
	}

	public long getValueAsLong()
		throws IOException
	{
		return _flddelegate.getValueAsLong();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #263 <Method long JsonParser.getValueAsLong()>
	//    3    7:lreturn         
	}

	public long getValueAsLong(long l)
		throws IOException
	{
		return _flddelegate.getValueAsLong(l);
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #266 <Method long JsonParser.getValueAsLong(long)>
	//    4    8:lreturn         
	}

	public String getValueAsString()
		throws IOException
	{
		return _flddelegate.getValueAsString();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #269 <Method String JsonParser.getValueAsString()>
	//    3    7:areturn         
	}

	public String getValueAsString(String s)
		throws IOException
	{
		return _flddelegate.getValueAsString(s);
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field JsonParser _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #272 <Method String JsonParser.getValueAsString(String)>
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
	//    2    4:invokevirtual   #276 <Method boolean JsonParser.hasTextCharacters()>
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
	//    2    4:astore          4
		boolean flag1 = false;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		boolean flag = false;
	//    5    8:iconst_0        
	//    6    9:istore_2        
		if(jsontoken == null)
	//*   7   10:aload           4
	//*   8   12:ifnonnull       23
		{
			if(i == 0)
	//*   9   15:iload_1         
	//*  10   16:ifne            21
				flag = true;
	//   11   19:iconst_1        
	//   12   20:istore_2        
			return flag;
	//   13   21:iload_2         
	//   14   22:ireturn         
		}
		flag = flag1;
	//   15   23:iload_3         
	//   16   24:istore_2        
		if(jsontoken.id() == i)
	//*  17   25:aload           4
	//*  18   27:invokevirtual   #85  <Method int JsonToken.id()>
	//*  19   30:iload_1         
	//*  20   31:icmpne          36
			flag = true;
	//   21   34:iconst_1        
	//   22   35:istore_2        
		return flag;
	//   23   36:iload_2         
	//   24   37:ireturn         
	}

	public boolean isExpectedStartArrayToken()
	{
		return _currToken == JsonToken.START_ARRAY;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field JsonToken _currToken>
	//    2    4:getstatic       #179 <Field JsonToken JsonToken.START_ARRAY>
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
	//    2    4:getstatic       #176 <Field JsonToken JsonToken.START_OBJECT>
	//    3    7:if_acmpne       12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public JsonToken nextToken()
		throws IOException
	{
		if(!_allowMultipleMatches && _currToken != null && _exposedContext == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field boolean _allowMultipleMatches>
	//*   2    4:ifne            92
	//*   3    7:aload_0         
	//*   4    8:getfield        #79  <Field JsonToken _currToken>
	//*   5   11:ifnull          92
	//*   6   14:aload_0         
	//*   7   15:getfield        #48  <Field TokenFilterContext _exposedContext>
	//*   8   18:ifnonnull       92
		{
			if(_currToken.isStructEnd() && _headContext.isStartHandled())
	//*   9   21:aload_0         
	//*  10   22:getfield        #79  <Field JsonToken _currToken>
	//*  11   25:invokevirtual   #285 <Method boolean JsonToken.isStructEnd()>
	//*  12   28:ifeq            48
	//*  13   31:aload_0         
	//*  14   32:getfield        #37  <Field TokenFilterContext _headContext>
	//*  15   35:invokevirtual   #124 <Method boolean TokenFilterContext.isStartHandled()>
	//*  16   38:ifeq            48
			{
				_currToken = null;
	//   17   41:aload_0         
	//   18   42:aconst_null     
	//   19   43:putfield        #79  <Field JsonToken _currToken>
				return null;
	//   20   46:aconst_null     
	//   21   47:areturn         
			}
			if(_currToken.isScalarValue() && !_headContext.isStartHandled() && !_includePath && _itemFilter == TokenFilter.INCLUDE_ALL)
	//*  22   48:aload_0         
	//*  23   49:getfield        #79  <Field JsonToken _currToken>
	//*  24   52:invokevirtual   #288 <Method boolean JsonToken.isScalarValue()>
	//*  25   55:ifeq            92
	//*  26   58:aload_0         
	//*  27   59:getfield        #37  <Field TokenFilterContext _headContext>
	//*  28   62:invokevirtual   #124 <Method boolean TokenFilterContext.isStartHandled()>
	//*  29   65:ifne            92
	//*  30   68:aload_0         
	//*  31   69:getfield        #39  <Field boolean _includePath>
	//*  32   72:ifne            92
	//*  33   75:aload_0         
	//*  34   76:getfield        #29  <Field TokenFilter _itemFilter>
	//*  35   79:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//*  36   82:if_acmpne       92
			{
				_currToken = null;
	//   37   85:aload_0         
	//   38   86:aconst_null     
	//   39   87:putfield        #79  <Field JsonToken _currToken>
				return null;
	//   40   90:aconst_null     
	//   41   91:areturn         
			}
		}
		Object obj = ((Object) (_exposedContext));
	//   42   92:aload_0         
	//   43   93:getfield        #48  <Field TokenFilterContext _exposedContext>
	//   44   96:astore_2        
		Object obj2;
		if(obj != null)
			do
	//*  45   97:aload_2         
	//*  46   98:ifnull          179
			{
				obj2 = ((Object) (((TokenFilterContext) (obj)).nextTokenToRead()));
	//   47  101:aload_2         
	//   48  102:invokevirtual   #52  <Method JsonToken TokenFilterContext.nextTokenToRead()>
	//   49  105:astore_3        
				if(obj2 != null)
	//*  50  106:aload_3         
	//*  51  107:ifnull          117
				{
					_currToken = ((JsonToken) (obj2));
	//   52  110:aload_0         
	//   53  111:aload_3         
	//   54  112:putfield        #79  <Field JsonToken _currToken>
					return ((JsonToken) (obj2));
	//   55  115:aload_3         
	//   56  116:areturn         
				}
				if(obj == _headContext)
	//*  57  117:aload_2         
	//*  58  118:aload_0         
	//*  59  119:getfield        #37  <Field TokenFilterContext _headContext>
	//*  60  122:if_acmpne       152
				{
					_exposedContext = null;
	//   61  125:aload_0         
	//   62  126:aconst_null     
	//   63  127:putfield        #48  <Field TokenFilterContext _exposedContext>
					if(((TokenFilterContext) (obj)).inArray())
	//*  64  130:aload_2         
	//*  65  131:invokevirtual   #291 <Method boolean TokenFilterContext.inArray()>
	//*  66  134:ifeq            179
					{
						obj = ((Object) (_flddelegate.getCurrentToken()));
	//   67  137:aload_0         
	//   68  138:getfield        #72  <Field JsonParser _flddelegate>
	//   69  141:invokevirtual   #293 <Method JsonToken JsonParser.getCurrentToken()>
	//   70  144:astore_2        
						_currToken = ((JsonToken) (obj));
	//   71  145:aload_0         
	//   72  146:aload_2         
	//   73  147:putfield        #79  <Field JsonToken _currToken>
						return ((JsonToken) (obj));
	//   74  150:aload_2         
	//   75  151:areturn         
					}
					break;
				}
				obj2 = ((Object) (_headContext.findChildOf(((TokenFilterContext) (obj)))));
	//   76  152:aload_0         
	//   77  153:getfield        #37  <Field TokenFilterContext _headContext>
	//   78  156:aload_2         
	//   79  157:invokevirtual   #62  <Method TokenFilterContext TokenFilterContext.findChildOf(TokenFilterContext)>
	//   80  160:astore_3        
				_exposedContext = ((TokenFilterContext) (obj2));
	//   81  161:aload_0         
	//   82  162:aload_3         
	//   83  163:putfield        #48  <Field TokenFilterContext _exposedContext>
				obj = obj2;
	//   84  166:aload_3         
	//   85  167:astore_2        
				if(obj2 == null)
	//*  86  168:aload_3         
	//*  87  169:ifnonnull       101
					throw _constructError("Unexpected problem: chain of filtered context broken");
	//   88  172:aload_0         
	//   89  173:ldc1            #64  <String "Unexpected problem: chain of filtered context broken">
	//   90  175:invokevirtual   #58  <Method com.fasterxml.jackson.core.JsonParseException _constructError(String)>
	//   91  178:athrow          
			} while(true);
		obj2 = ((Object) (_flddelegate.nextToken()));
	//   92  179:aload_0         
	//   93  180:getfield        #72  <Field JsonParser _flddelegate>
	//   94  183:invokevirtual   #77  <Method JsonToken JsonParser.nextToken()>
	//   95  186:astore_3        
		if(obj2 == null)
	//*  96  187:aload_3         
	//*  97  188:ifnonnull       198
		{
			_currToken = ((JsonToken) (obj2));
	//   98  191:aload_0         
	//   99  192:aload_3         
	//  100  193:putfield        #79  <Field JsonToken _currToken>
			return ((JsonToken) (obj2));
	//  101  196:aload_3         
	//  102  197:areturn         
		}
		switch(((JsonToken) (obj2)).id())
	//* 103  198:aload_3         
	//* 104  199:invokevirtual   #85  <Method int JsonToken.id()>
		{
	//* 105  202:tableswitch     1 5: default 236
	//	               1 673
	//	               2 609
	//	               3 447
	//	               4 609
	//	               5 255
		default:
			Object obj1 = ((Object) (_itemFilter));
	//  106  236:aload_0         
	//  107  237:getfield        #29  <Field TokenFilter _itemFilter>
	//  108  240:astore_2        
			boolean flag;
			TokenFilter tokenfilter;
			if(obj1 == TokenFilter.INCLUDE_ALL)
	//* 109  241:aload_2         
	//* 110  242:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 111  245:if_acmpne       835
			{
				_currToken = ((JsonToken) (obj2));
	//  112  248:aload_0         
	//  113  249:aload_3         
	//  114  250:putfield        #79  <Field JsonToken _currToken>
				return ((JsonToken) (obj2));
	//  115  253:aload_3         
	//  116  254:areturn         
			}
	//* 117  255:aload_0         
	//* 118  256:getfield        #72  <Field JsonParser _flddelegate>
	//* 119  259:invokevirtual   #94  <Method String JsonParser.getCurrentName()>
	//* 120  262:astore_2        
	//* 121  263:aload_0         
	//* 122  264:getfield        #37  <Field TokenFilterContext _headContext>
	//* 123  267:aload_2         
	//* 124  268:invokevirtual   #98  <Method TokenFilter TokenFilterContext.setFieldName(String)>
	//* 125  271:astore          4
	//* 126  273:aload           4
	//* 127  275:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 128  278:if_acmpne       340
	//* 129  281:aload_0         
	//* 130  282:aload           4
	//* 131  284:putfield        #29  <Field TokenFilter _itemFilter>
	//* 132  287:aload_3         
	//* 133  288:astore_2        
	//* 134  289:aload_0         
	//* 135  290:getfield        #39  <Field boolean _includePath>
	//* 136  293:ifne            333
	//* 137  296:aload_3         
	//* 138  297:astore_2        
	//* 139  298:aload_0         
	//* 140  299:getfield        #295 <Field boolean _includeImmediateParent>
	//* 141  302:ifeq            333
	//* 142  305:aload_3         
	//* 143  306:astore_2        
	//* 144  307:aload_0         
	//* 145  308:getfield        #37  <Field TokenFilterContext _headContext>
	//* 146  311:invokevirtual   #124 <Method boolean TokenFilterContext.isStartHandled()>
	//* 147  314:ifne            333
	//* 148  317:aload_0         
	//* 149  318:getfield        #37  <Field TokenFilterContext _headContext>
	//* 150  321:invokevirtual   #52  <Method JsonToken TokenFilterContext.nextTokenToRead()>
	//* 151  324:astore_2        
	//* 152  325:aload_0         
	//* 153  326:aload_0         
	//* 154  327:getfield        #37  <Field TokenFilterContext _headContext>
	//* 155  330:putfield        #48  <Field TokenFilterContext _exposedContext>
	//* 156  333:aload_0         
	//* 157  334:aload_2         
	//* 158  335:putfield        #79  <Field JsonToken _currToken>
	//* 159  338:aload_2         
	//* 160  339:areturn         
	//* 161  340:aload           4
	//* 162  342:ifnonnull       364
	//* 163  345:aload_0         
	//* 164  346:getfield        #72  <Field JsonParser _flddelegate>
	//* 165  349:invokevirtual   #77  <Method JsonToken JsonParser.nextToken()>
	//* 166  352:pop             
	//* 167  353:aload_0         
	//* 168  354:getfield        #72  <Field JsonParser _flddelegate>
	//* 169  357:invokevirtual   #102 <Method JsonParser JsonParser.skipChildren()>
	//* 170  360:pop             
	//* 171  361:goto            877
	//* 172  364:aload           4
	//* 173  366:aload_2         
	//* 174  367:invokevirtual   #105 <Method TokenFilter TokenFilter.includeProperty(String)>
	//* 175  370:astore_2        
	//* 176  371:aload_2         
	//* 177  372:ifnonnull       394
	//* 178  375:aload_0         
	//* 179  376:getfield        #72  <Field JsonParser _flddelegate>
	//* 180  379:invokevirtual   #77  <Method JsonToken JsonParser.nextToken()>
	//* 181  382:pop             
	//* 182  383:aload_0         
	//* 183  384:getfield        #72  <Field JsonParser _flddelegate>
	//* 184  387:invokevirtual   #102 <Method JsonParser JsonParser.skipChildren()>
	//* 185  390:pop             
	//* 186  391:goto            877
	//* 187  394:aload_0         
	//* 188  395:aload_2         
	//* 189  396:putfield        #29  <Field TokenFilter _itemFilter>
	//* 190  399:aload_2         
	//* 191  400:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 192  403:if_acmpne       420
	//* 193  406:aload_0         
	//* 194  407:getfield        #39  <Field boolean _includePath>
	//* 195  410:ifeq            420
	//* 196  413:aload_0         
	//* 197  414:aload_3         
	//* 198  415:putfield        #79  <Field JsonToken _currToken>
	//* 199  418:aload_3         
	//* 200  419:areturn         
	//* 201  420:aload_0         
	//* 202  421:getfield        #39  <Field boolean _includePath>
	//* 203  424:ifeq            877
	//* 204  427:aload_0         
	//* 205  428:aload_0         
	//* 206  429:getfield        #37  <Field TokenFilterContext _headContext>
	//* 207  432:invokevirtual   #108 <Method JsonToken _nextTokenWithBuffering(TokenFilterContext)>
	//* 208  435:astore_2        
	//* 209  436:aload_2         
	//* 210  437:ifnull          877
	//* 211  440:aload_0         
	//* 212  441:aload_2         
	//* 213  442:putfield        #79  <Field JsonToken _currToken>
	//* 214  445:aload_2         
	//* 215  446:areturn         
	//* 216  447:aload_0         
	//* 217  448:getfield        #29  <Field TokenFilter _itemFilter>
	//* 218  451:astore_2        
	//* 219  452:aload_2         
	//* 220  453:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 221  456:if_acmpne       479
	//* 222  459:aload_0         
	//* 223  460:aload_0         
	//* 224  461:getfield        #37  <Field TokenFilterContext _headContext>
	//* 225  464:aload_2         
	//* 226  465:iconst_1        
	//* 227  466:invokevirtual   #112 <Method TokenFilterContext TokenFilterContext.createChildArrayContext(TokenFilter, boolean)>
	//* 228  469:putfield        #37  <Field TokenFilterContext _headContext>
	//* 229  472:aload_0         
	//* 230  473:aload_3         
	//* 231  474:putfield        #79  <Field JsonToken _currToken>
	//* 232  477:aload_3         
	//* 233  478:areturn         
	//* 234  479:aload_2         
	//* 235  480:ifnonnull       494
	//* 236  483:aload_0         
	//* 237  484:getfield        #72  <Field JsonParser _flddelegate>
	//* 238  487:invokevirtual   #102 <Method JsonParser JsonParser.skipChildren()>
	//* 239  490:pop             
	//* 240  491:goto            877
	//* 241  494:aload_0         
	//* 242  495:getfield        #37  <Field TokenFilterContext _headContext>
	//* 243  498:aload_2         
	//* 244  499:invokevirtual   #116 <Method TokenFilter TokenFilterContext.checkValue(TokenFilter)>
	//* 245  502:astore          4
	//* 246  504:aload           4
	//* 247  506:ifnonnull       520
	//* 248  509:aload_0         
	//* 249  510:getfield        #72  <Field JsonParser _flddelegate>
	//* 250  513:invokevirtual   #102 <Method JsonParser JsonParser.skipChildren()>
	//* 251  516:pop             
	//* 252  517:goto            877
	//* 253  520:aload           4
	//* 254  522:astore_2        
	//* 255  523:aload           4
	//* 256  525:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 257  528:if_acmpeq       537
	//* 258  531:aload           4
	//* 259  533:invokevirtual   #120 <Method TokenFilter TokenFilter.filterStartArray()>
	//* 260  536:astore_2        
	//* 261  537:aload_0         
	//* 262  538:aload_2         
	//* 263  539:putfield        #29  <Field TokenFilter _itemFilter>
	//* 264  542:aload_2         
	//* 265  543:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 266  546:if_acmpne       569
	//* 267  549:aload_0         
	//* 268  550:aload_0         
	//* 269  551:getfield        #37  <Field TokenFilterContext _headContext>
	//* 270  554:aload_2         
	//* 271  555:iconst_1        
	//* 272  556:invokevirtual   #112 <Method TokenFilterContext TokenFilterContext.createChildArrayContext(TokenFilter, boolean)>
	//* 273  559:putfield        #37  <Field TokenFilterContext _headContext>
	//* 274  562:aload_0         
	//* 275  563:aload_3         
	//* 276  564:putfield        #79  <Field JsonToken _currToken>
	//* 277  567:aload_3         
	//* 278  568:areturn         
	//* 279  569:aload_0         
	//* 280  570:aload_0         
	//* 281  571:getfield        #37  <Field TokenFilterContext _headContext>
	//* 282  574:aload_2         
	//* 283  575:iconst_0        
	//* 284  576:invokevirtual   #112 <Method TokenFilterContext TokenFilterContext.createChildArrayContext(TokenFilter, boolean)>
	//* 285  579:putfield        #37  <Field TokenFilterContext _headContext>
	//* 286  582:aload_0         
	//* 287  583:getfield        #39  <Field boolean _includePath>
	//* 288  586:ifeq            877
	//* 289  589:aload_0         
	//* 290  590:aload_0         
	//* 291  591:getfield        #37  <Field TokenFilterContext _headContext>
	//* 292  594:invokevirtual   #108 <Method JsonToken _nextTokenWithBuffering(TokenFilterContext)>
	//* 293  597:astore_2        
	//* 294  598:aload_2         
	//* 295  599:ifnull          877
	//* 296  602:aload_0         
	//* 297  603:aload_2         
	//* 298  604:putfield        #79  <Field JsonToken _currToken>
	//* 299  607:aload_2         
	//* 300  608:areturn         
	//* 301  609:aload_0         
	//* 302  610:getfield        #37  <Field TokenFilterContext _headContext>
	//* 303  613:invokevirtual   #124 <Method boolean TokenFilterContext.isStartHandled()>
	//* 304  616:istore_1        
	//* 305  617:aload_0         
	//* 306  618:getfield        #37  <Field TokenFilterContext _headContext>
	//* 307  621:invokevirtual   #127 <Method TokenFilter TokenFilterContext.getFilter()>
	//* 308  624:astore_2        
	//* 309  625:aload_2         
	//* 310  626:ifnull          640
	//* 311  629:aload_2         
	//* 312  630:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 313  633:if_acmpeq       640
	//* 314  636:aload_2         
	//* 315  637:invokevirtual   #131 <Method void TokenFilter.filterFinishArray()>
	//* 316  640:aload_0         
	//* 317  641:aload_0         
	//* 318  642:getfield        #37  <Field TokenFilterContext _headContext>
	//* 319  645:invokevirtual   #135 <Method TokenFilterContext TokenFilterContext.getParent()>
	//* 320  648:putfield        #37  <Field TokenFilterContext _headContext>
	//* 321  651:aload_0         
	//* 322  652:aload_0         
	//* 323  653:getfield        #37  <Field TokenFilterContext _headContext>
	//* 324  656:invokevirtual   #127 <Method TokenFilter TokenFilterContext.getFilter()>
	//* 325  659:putfield        #29  <Field TokenFilter _itemFilter>
	//* 326  662:iload_1         
	//* 327  663:ifeq            877
	//* 328  666:aload_0         
	//* 329  667:aload_3         
	//* 330  668:putfield        #79  <Field JsonToken _currToken>
	//* 331  671:aload_3         
	//* 332  672:areturn         
	//* 333  673:aload_0         
	//* 334  674:getfield        #29  <Field TokenFilter _itemFilter>
	//* 335  677:astore_2        
	//* 336  678:aload_2         
	//* 337  679:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 338  682:if_acmpne       705
	//* 339  685:aload_0         
	//* 340  686:aload_0         
	//* 341  687:getfield        #37  <Field TokenFilterContext _headContext>
	//* 342  690:aload_2         
	//* 343  691:iconst_1        
	//* 344  692:invokevirtual   #138 <Method TokenFilterContext TokenFilterContext.createChildObjectContext(TokenFilter, boolean)>
	//* 345  695:putfield        #37  <Field TokenFilterContext _headContext>
	//* 346  698:aload_0         
	//* 347  699:aload_3         
	//* 348  700:putfield        #79  <Field JsonToken _currToken>
	//* 349  703:aload_3         
	//* 350  704:areturn         
	//* 351  705:aload_2         
	//* 352  706:ifnonnull       720
	//* 353  709:aload_0         
	//* 354  710:getfield        #72  <Field JsonParser _flddelegate>
	//* 355  713:invokevirtual   #102 <Method JsonParser JsonParser.skipChildren()>
	//* 356  716:pop             
	//* 357  717:goto            877
	//* 358  720:aload_0         
	//* 359  721:getfield        #37  <Field TokenFilterContext _headContext>
	//* 360  724:aload_2         
	//* 361  725:invokevirtual   #116 <Method TokenFilter TokenFilterContext.checkValue(TokenFilter)>
	//* 362  728:astore          4
	//* 363  730:aload           4
	//* 364  732:ifnonnull       746
	//* 365  735:aload_0         
	//* 366  736:getfield        #72  <Field JsonParser _flddelegate>
	//* 367  739:invokevirtual   #102 <Method JsonParser JsonParser.skipChildren()>
	//* 368  742:pop             
	//* 369  743:goto            877
	//* 370  746:aload           4
	//* 371  748:astore_2        
	//* 372  749:aload           4
	//* 373  751:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 374  754:if_acmpeq       763
	//* 375  757:aload           4
	//* 376  759:invokevirtual   #141 <Method TokenFilter TokenFilter.filterStartObject()>
	//* 377  762:astore_2        
	//* 378  763:aload_0         
	//* 379  764:aload_2         
	//* 380  765:putfield        #29  <Field TokenFilter _itemFilter>
	//* 381  768:aload_2         
	//* 382  769:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 383  772:if_acmpne       795
	//* 384  775:aload_0         
	//* 385  776:aload_0         
	//* 386  777:getfield        #37  <Field TokenFilterContext _headContext>
	//* 387  780:aload_2         
	//* 388  781:iconst_1        
	//* 389  782:invokevirtual   #138 <Method TokenFilterContext TokenFilterContext.createChildObjectContext(TokenFilter, boolean)>
	//* 390  785:putfield        #37  <Field TokenFilterContext _headContext>
	//* 391  788:aload_0         
	//* 392  789:aload_3         
	//* 393  790:putfield        #79  <Field JsonToken _currToken>
	//* 394  793:aload_3         
	//* 395  794:areturn         
	//* 396  795:aload_0         
	//* 397  796:aload_0         
	//* 398  797:getfield        #37  <Field TokenFilterContext _headContext>
	//* 399  800:aload_2         
	//* 400  801:iconst_0        
	//* 401  802:invokevirtual   #138 <Method TokenFilterContext TokenFilterContext.createChildObjectContext(TokenFilter, boolean)>
	//* 402  805:putfield        #37  <Field TokenFilterContext _headContext>
	//* 403  808:aload_0         
	//* 404  809:getfield        #39  <Field boolean _includePath>
	//* 405  812:ifeq            877
	//* 406  815:aload_0         
	//* 407  816:aload_0         
	//* 408  817:getfield        #37  <Field TokenFilterContext _headContext>
	//* 409  820:invokevirtual   #108 <Method JsonToken _nextTokenWithBuffering(TokenFilterContext)>
	//* 410  823:astore_2        
	//* 411  824:aload_2         
	//* 412  825:ifnull          877
	//* 413  828:aload_0         
	//* 414  829:aload_2         
	//* 415  830:putfield        #79  <Field JsonToken _currToken>
	//* 416  833:aload_2         
	//* 417  834:areturn         
			if(obj1 == null)
				break;
	//  418  835:aload_2         
	//  419  836:ifnull          877
			obj1 = ((Object) (_headContext.checkValue(((TokenFilter) (obj1)))));
	//  420  839:aload_0         
	//  421  840:getfield        #37  <Field TokenFilterContext _headContext>
	//  422  843:aload_2         
	//  423  844:invokevirtual   #116 <Method TokenFilter TokenFilterContext.checkValue(TokenFilter)>
	//  424  847:astore_2        
			if(obj1 == TokenFilter.INCLUDE_ALL || obj1 != null && ((TokenFilter) (obj1)).includeValue(_flddelegate))
	//* 425  848:aload_2         
	//* 426  849:getstatic       #90  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 427  852:if_acmpeq       870
	//* 428  855:aload_2         
	//* 429  856:ifnull          877
	//* 430  859:aload_2         
	//* 431  860:aload_0         
	//* 432  861:getfield        #72  <Field JsonParser _flddelegate>
	//* 433  864:invokevirtual   #145 <Method boolean TokenFilter.includeValue(JsonParser)>
	//* 434  867:ifeq            877
			{
				_currToken = ((JsonToken) (obj2));
	//  435  870:aload_0         
	//  436  871:aload_3         
	//  437  872:putfield        #79  <Field JsonToken _currToken>
				return ((JsonToken) (obj2));
	//  438  875:aload_3         
	//  439  876:areturn         
			}
			break;

		case 5: // '\005'
			obj1 = ((Object) (_flddelegate.getCurrentName()));
			tokenfilter = _headContext.setFieldName(((String) (obj1)));
			if(tokenfilter == TokenFilter.INCLUDE_ALL)
			{
				_itemFilter = tokenfilter;
				obj1 = obj2;
				if(!_includePath)
				{
					obj1 = obj2;
					if(_includeImmediateParent)
					{
						obj1 = obj2;
						if(!_headContext.isStartHandled())
						{
							obj1 = ((Object) (_headContext.nextTokenToRead()));
							_exposedContext = _headContext;
						}
					}
				}
				_currToken = ((JsonToken) (obj1));
				return ((JsonToken) (obj1));
			}
			if(tokenfilter == null)
			{
				_flddelegate.nextToken();
				_flddelegate.skipChildren();
			} else
			{
				obj1 = ((Object) (tokenfilter.includeProperty(((String) (obj1)))));
				if(obj1 == null)
				{
					_flddelegate.nextToken();
					_flddelegate.skipChildren();
				} else
				{
					_itemFilter = ((TokenFilter) (obj1));
					if(obj1 == TokenFilter.INCLUDE_ALL && _includePath)
					{
						_currToken = ((JsonToken) (obj2));
						return ((JsonToken) (obj2));
					}
					if(_includePath)
					{
						obj1 = ((Object) (_nextTokenWithBuffering(_headContext)));
						if(obj1 != null)
						{
							_currToken = ((JsonToken) (obj1));
							return ((JsonToken) (obj1));
						}
					}
				}
			}
			break;

		case 3: // '\003'
			obj1 = ((Object) (_itemFilter));
			if(obj1 == TokenFilter.INCLUDE_ALL)
			{
				_headContext = _headContext.createChildArrayContext(((TokenFilter) (obj1)), true);
				_currToken = ((JsonToken) (obj2));
				return ((JsonToken) (obj2));
			}
			if(obj1 == null)
			{
				_flddelegate.skipChildren();
				break;
			}
			tokenfilter = _headContext.checkValue(((TokenFilter) (obj1)));
			if(tokenfilter == null)
			{
				_flddelegate.skipChildren();
				break;
			}
			obj1 = ((Object) (tokenfilter));
			if(tokenfilter != TokenFilter.INCLUDE_ALL)
				obj1 = ((Object) (tokenfilter.filterStartArray()));
			_itemFilter = ((TokenFilter) (obj1));
			if(obj1 == TokenFilter.INCLUDE_ALL)
			{
				_headContext = _headContext.createChildArrayContext(((TokenFilter) (obj1)), true);
				_currToken = ((JsonToken) (obj2));
				return ((JsonToken) (obj2));
			}
			_headContext = _headContext.createChildArrayContext(((TokenFilter) (obj1)), false);
			if(!_includePath)
				break;
			obj1 = ((Object) (_nextTokenWithBuffering(_headContext)));
			if(obj1 != null)
			{
				_currToken = ((JsonToken) (obj1));
				return ((JsonToken) (obj1));
			}
			break;

		case 2: // '\002'
		case 4: // '\004'
			flag = _headContext.isStartHandled();
			obj1 = ((Object) (_headContext.getFilter()));
			if(obj1 != null && obj1 != TokenFilter.INCLUDE_ALL)
				((TokenFilter) (obj1)).filterFinishArray();
			_headContext = _headContext.getParent();
			_itemFilter = _headContext.getFilter();
			if(flag)
			{
				_currToken = ((JsonToken) (obj2));
				return ((JsonToken) (obj2));
			}
			break;

		case 1: // '\001'
			obj1 = ((Object) (_itemFilter));
			if(obj1 == TokenFilter.INCLUDE_ALL)
			{
				_headContext = _headContext.createChildObjectContext(((TokenFilter) (obj1)), true);
				_currToken = ((JsonToken) (obj2));
				return ((JsonToken) (obj2));
			}
			if(obj1 == null)
			{
				_flddelegate.skipChildren();
				break;
			}
			tokenfilter = _headContext.checkValue(((TokenFilter) (obj1)));
			if(tokenfilter == null)
			{
				_flddelegate.skipChildren();
				break;
			}
			obj1 = ((Object) (tokenfilter));
			if(tokenfilter != TokenFilter.INCLUDE_ALL)
				obj1 = ((Object) (tokenfilter.filterStartObject()));
			_itemFilter = ((TokenFilter) (obj1));
			if(obj1 == TokenFilter.INCLUDE_ALL)
			{
				_headContext = _headContext.createChildObjectContext(((TokenFilter) (obj1)), true);
				_currToken = ((JsonToken) (obj2));
				return ((JsonToken) (obj2));
			}
			_headContext = _headContext.createChildObjectContext(((TokenFilter) (obj1)), false);
			if(!_includePath)
				break;
			obj1 = ((Object) (_nextTokenWithBuffering(_headContext)));
			if(obj1 != null)
			{
				_currToken = ((JsonToken) (obj1));
				return ((JsonToken) (obj1));
			}
			break;
		}
		return _nextToken2();
	//  440  877:aload_0         
	//  441  878:invokevirtual   #297 <Method JsonToken _nextToken2()>
	//  442  881:areturn         
	}

	public JsonToken nextValue()
		throws IOException
	{
		JsonToken jsontoken1 = nextToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #299 <Method JsonToken nextToken()>
	//    2    4:astore_2        
		JsonToken jsontoken = jsontoken1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(jsontoken1 == JsonToken.FIELD_NAME)
	//*   5    7:aload_2         
	//*   6    8:getstatic       #302 <Field JsonToken JsonToken.FIELD_NAME>
	//*   7   11:if_acmpne       19
			jsontoken = nextToken();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #299 <Method JsonToken nextToken()>
	//   10   18:astore_1        
		return jsontoken;
	//   11   19:aload_1         
	//   12   20:areturn         
	}

	public void overrideCurrentName(String s)
	{
		throw new UnsupportedOperationException("Can not currently override name during filtering read");
	//    0    0:new             #306 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #308 <String "Can not currently override name during filtering read">
	//    3    7:invokespecial   #310 <Method void UnsupportedOperationException(String)>
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
	//    4    6:invokevirtual   #314 <Method int JsonParser.readBinaryValue(Base64Variant, OutputStream)>
	//    5    9:ireturn         
	}

	public JsonParser skipChildren()
		throws IOException
	{
		if(_currToken != JsonToken.START_OBJECT && _currToken != JsonToken.START_ARRAY)
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field JsonToken _currToken>
	//*   2    4:getstatic       #176 <Field JsonToken JsonToken.START_OBJECT>
	//*   3    7:if_acmpeq       22
	//*   4   10:aload_0         
	//*   5   11:getfield        #79  <Field JsonToken _currToken>
	//*   6   14:getstatic       #179 <Field JsonToken JsonToken.START_ARRAY>
	//*   7   17:if_acmpeq       22
			return ((JsonParser) (this));
	//    8   20:aload_0         
	//    9   21:areturn         
		int i = 1;
	//   10   22:iconst_1        
	//   11   23:istore_1        
		int j;
		do
		{
			JsonToken jsontoken;
			do
				do
				{
					jsontoken = nextToken();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #299 <Method JsonToken nextToken()>
	//   14   28:astore_3        
					if(jsontoken == null)
	//*  15   29:aload_3         
	//*  16   30:ifnonnull       35
						return ((JsonParser) (this));
	//   17   33:aload_0         
	//   18   34:areturn         
					if(!jsontoken.isStructStart())
						break;
	//   19   35:aload_3         
	//   20   36:invokevirtual   #317 <Method boolean JsonToken.isStructStart()>
	//   21   39:ifeq            49
					i++;
	//   22   42:iload_1         
	//   23   43:iconst_1        
	//   24   44:iadd            
	//   25   45:istore_1        
				} while(true);
	//   26   46:goto            24
			while(!jsontoken.isStructEnd());
	//   27   49:aload_3         
	//   28   50:invokevirtual   #285 <Method boolean JsonToken.isStructEnd()>
	//   29   53:ifeq            24
			j = i - 1;
	//   30   56:iload_1         
	//   31   57:iconst_1        
	//   32   58:isub            
	//   33   59:istore_2        
			i = j;
	//   34   60:iload_2         
	//   35   61:istore_1        
		} while(j != 0);
	//   36   62:iload_2         
	//   37   63:ifne            24
		return ((JsonParser) (this));
	//   38   66:aload_0         
	//   39   67:areturn         
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
