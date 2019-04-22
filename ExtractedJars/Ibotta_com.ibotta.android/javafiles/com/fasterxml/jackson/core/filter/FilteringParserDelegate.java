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
		while(tokenfiltercontext != _headContext) 
	//*  10   16:aload_1         
	//*  11   17:aload_0         
	//*  12   18:getfield        #37  <Field TokenFilterContext _headContext>
	//*  13   21:if_acmpeq       63
		{
			tokenfiltercontext = _exposedContext.findChildOf(tokenfiltercontext);
	//   14   24:aload_0         
	//   15   25:getfield        #48  <Field TokenFilterContext _exposedContext>
	//   16   28:aload_1         
	//   17   29:invokevirtual   #56  <Method TokenFilterContext TokenFilterContext.findChildOf(TokenFilterContext)>
	//   18   32:astore_1        
			_exposedContext = tokenfiltercontext;
	//   19   33:aload_0         
	//   20   34:aload_1         
	//   21   35:putfield        #48  <Field TokenFilterContext _exposedContext>
			if(tokenfiltercontext != null)
	//*  22   38:aload_1         
	//*  23   39:ifnull          56
			{
				JsonToken jsontoken1 = _exposedContext.nextTokenToRead();
	//   24   42:aload_0         
	//   25   43:getfield        #48  <Field TokenFilterContext _exposedContext>
	//   26   46:invokevirtual   #52  <Method JsonToken TokenFilterContext.nextTokenToRead()>
	//   27   49:astore_2        
				if(jsontoken1 != null)
	//*  28   50:aload_2         
	//*  29   51:ifnull          16
					return jsontoken1;
	//   30   54:aload_2         
	//   31   55:areturn         
			} else
			{
				throw _constructError("Unexpected problem: chain of filtered context broken");
	//   32   56:aload_0         
	//   33   57:ldc1            #58  <String "Unexpected problem: chain of filtered context broken">
	//   34   59:invokevirtual   #62  <Method com.fasterxml.jackson.core.JsonParseException _constructError(String)>
	//   35   62:athrow          
			}
		}
		throw _constructError("Internal error: failed to locate expected buffered tokens");
	//   36   63:aload_0         
	//   37   64:ldc1            #64  <String "Internal error: failed to locate expected buffered tokens">
	//   38   66:invokevirtual   #62  <Method com.fasterxml.jackson.core.JsonParseException _constructError(String)>
	//   39   69:athrow          
	}

	private final boolean _verifyAllowedMatches()
		throws IOException
	{
		if(_matchCount != 0 && !_allowMultipleMatches)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field int _matchCount>
	//*   2    4:ifeq            19
	//*   3    7:aload_0         
	//*   4    8:getfield        #41  <Field boolean _allowMultipleMatches>
	//*   5   11:ifeq            17
	//*   6   14:goto            19
		{
			return false;
	//    7   17:iconst_0        
	//    8   18:ireturn         
		} else
		{
			_matchCount = _matchCount + 1;
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:getfield        #69  <Field int _matchCount>
	//   12   24:iconst_1        
	//   13   25:iadd            
	//   14   26:putfield        #69  <Field int _matchCount>
			return true;
	//   15   29:iconst_1        
	//   16   30:ireturn         
		}
	}

	protected JsonStreamContext _filterContext()
	{
		TokenFilterContext tokenfiltercontext = _exposedContext;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field TokenFilterContext _exposedContext>
	//    2    4:astore_1        
		if(tokenfiltercontext != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
			return ((JsonStreamContext) (tokenfiltercontext));
	//    5    9:aload_1         
	//    6   10:areturn         
		else
			return ((JsonStreamContext) (_headContext));
	//    7   11:aload_0         
	//    8   12:getfield        #37  <Field TokenFilterContext _headContext>
	//    9   15:areturn         
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
	//    1    1:getfield        #76  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #81  <Method JsonToken JsonParser.nextToken()>
	//    3    7:astore          4
							if(jsontoken == null)
	//*   4    9:aload           4
	//*   5   11:ifnonnull       23
							{
								_currToken = jsontoken;
	//    6   14:aload_0         
	//    7   15:aload           4
	//    8   17:putfield        #83  <Field JsonToken _currToken>
								return jsontoken;
	//    9   20:aload           4
	//   10   22:areturn         
							}
							switch(jsontoken.id())
	//*  11   23:aload           4
	//*  12   25:invokevirtual   #89  <Method int JsonToken.id()>
							{
	//*  13   28:tableswitch     1 5: default 64
	//	               1 464
	//	               2 398
	//	               3 237
	//	               4 398
	//	               5 85
							default:
								obj = ((Object) (_itemFilter));
	//   14   64:aload_0         
	//   15   65:getfield        #29  <Field TokenFilter _itemFilter>
	//   16   68:astore_2        
								if(obj == TokenFilter.INCLUDE_ALL)
	//*  17   69:aload_2         
	//*  18   70:getstatic       #94  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//*  19   73:if_acmpne       625
								{
									_currToken = jsontoken;
	//   20   76:aload_0         
	//   21   77:aload           4
	//   22   79:putfield        #83  <Field JsonToken _currToken>
									return jsontoken;
	//   23   82:aload           4
	//   24   84:areturn         
								}
								continue label0;

							case 5: // '\005'
								obj = ((Object) (_flddelegate.getCurrentName()));
	//   25   85:aload_0         
	//   26   86:getfield        #76  <Field JsonParser _flddelegate>
	//   27   89:invokevirtual   #98  <Method String JsonParser.getCurrentName()>
	//   28   92:astore_2        
								TokenFilter tokenfilter = _headContext.setFieldName(((String) (obj)));
	//   29   93:aload_0         
	//   30   94:getfield        #37  <Field TokenFilterContext _headContext>
	//   31   97:aload_2         
	//   32   98:invokevirtual   #102 <Method TokenFilter TokenFilterContext.setFieldName(String)>
	//   33  101:astore_3        
								if(tokenfilter == TokenFilter.INCLUDE_ALL)
	//*  34  102:aload_3         
	//*  35  103:getstatic       #94  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//*  36  106:if_acmpne       123
								{
									_itemFilter = tokenfilter;
	//   37  109:aload_0         
	//   38  110:aload_3         
	//   39  111:putfield        #29  <Field TokenFilter _itemFilter>
									_currToken = jsontoken;
	//   40  114:aload_0         
	//   41  115:aload           4
	//   42  117:putfield        #83  <Field JsonToken _currToken>
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
	//   48  128:getfield        #76  <Field JsonParser _flddelegate>
	//   49  131:invokevirtual   #81  <Method JsonToken JsonParser.nextToken()>
	//   50  134:pop             
									_flddelegate.skipChildren();
	//   51  135:aload_0         
	//   52  136:getfield        #76  <Field JsonParser _flddelegate>
	//   53  139:invokevirtual   #106 <Method JsonParser JsonParser.skipChildren()>
	//   54  142:pop             
								} else
	//*  55  143:goto            0
								{
									obj = ((Object) (tokenfilter.includeProperty(((String) (obj)))));
	//   56  146:aload_3         
	//   57  147:aload_2         
	//   58  148:invokevirtual   #109 <Method TokenFilter TokenFilter.includeProperty(String)>
	//   59  151:astore_2        
									if(obj == null)
	//*  60  152:aload_2         
	//*  61  153:ifnonnull       175
									{
										_flddelegate.nextToken();
	//   62  156:aload_0         
	//   63  157:getfield        #76  <Field JsonParser _flddelegate>
	//   64  160:invokevirtual   #81  <Method JsonToken JsonParser.nextToken()>
	//   65  163:pop             
										_flddelegate.skipChildren();
	//   66  164:aload_0         
	//   67  165:getfield        #76  <Field JsonParser _flddelegate>
	//   68  168:invokevirtual   #106 <Method JsonParser JsonParser.skipChildren()>
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
	//*  75  181:getstatic       #94  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//*  76  184:if_acmpne       210
										{
											if(_verifyAllowedMatches() && _includePath)
	//*  77  187:aload_0         
	//*  78  188:invokespecial   #111 <Method boolean _verifyAllowedMatches()>
	//*  79  191:ifeq            0
	//*  80  194:aload_0         
	//*  81  195:getfield        #39  <Field boolean _includePath>
	//*  82  198:ifeq            0
											{
												_currToken = jsontoken;
	//   83  201:aload_0         
	//   84  202:aload           4
	//   85  204:putfield        #83  <Field JsonToken _currToken>
												return jsontoken;
	//   86  207:aload           4
	//   87  209:areturn         
											}
										} else
										if(_includePath)
	//*  88  210:aload_0         
	//*  89  211:getfield        #39  <Field boolean _includePath>
	//*  90  214:ifeq            0
										{
											obj = ((Object) (_nextTokenWithBuffering(_headContext)));
	//   91  217:aload_0         
	//   92  218:aload_0         
	//   93  219:getfield        #37  <Field TokenFilterContext _headContext>
	//   94  222:invokevirtual   #114 <Method JsonToken _nextTokenWithBuffering(TokenFilterContext)>
	//   95  225:astore_2        
											if(obj != null)
	//*  96  226:aload_2         
	//*  97  227:ifnull          0
											{
												_currToken = ((JsonToken) (obj));
	//   98  230:aload_0         
	//   99  231:aload_2         
	//  100  232:putfield        #83  <Field JsonToken _currToken>
												return ((JsonToken) (obj));
	//  101  235:aload_2         
	//  102  236:areturn         
											}
										}
									}
								}
								continue;

							case 3: // '\003'
								obj = ((Object) (_itemFilter));
	//  103  237:aload_0         
	//  104  238:getfield        #29  <Field TokenFilter _itemFilter>
	//  105  241:astore_2        
								if(obj == TokenFilter.INCLUDE_ALL)
	//* 106  242:aload_2         
	//* 107  243:getstatic       #94  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 108  246:if_acmpne       271
								{
									_headContext = _headContext.createChildArrayContext(((TokenFilter) (obj)), true);
	//  109  249:aload_0         
	//  110  250:aload_0         
	//  111  251:getfield        #37  <Field TokenFilterContext _headContext>
	//  112  254:aload_2         
	//  113  255:iconst_1        
	//  114  256:invokevirtual   #118 <Method TokenFilterContext TokenFilterContext.createChildArrayContext(TokenFilter, boolean)>
	//  115  259:putfield        #37  <Field TokenFilterContext _headContext>
									_currToken = jsontoken;
	//  116  262:aload_0         
	//  117  263:aload           4
	//  118  265:putfield        #83  <Field JsonToken _currToken>
									return jsontoken;
	//  119  268:aload           4
	//  120  270:areturn         
								}
								if(obj == null)
	//* 121  271:aload_2         
	//* 122  272:ifnonnull       286
								{
									_flddelegate.skipChildren();
	//  123  275:aload_0         
	//  124  276:getfield        #76  <Field JsonParser _flddelegate>
	//  125  279:invokevirtual   #106 <Method JsonParser JsonParser.skipChildren()>
	//  126  282:pop             
								} else
	//* 127  283:goto            0
								{
									TokenFilter tokenfilter1 = _headContext.checkValue(((TokenFilter) (obj)));
	//  128  286:aload_0         
	//  129  287:getfield        #37  <Field TokenFilterContext _headContext>
	//  130  290:aload_2         
	//  131  291:invokevirtual   #122 <Method TokenFilter TokenFilterContext.checkValue(TokenFilter)>
	//  132  294:astore_3        
									if(tokenfilter1 == null)
	//* 133  295:aload_3         
	//* 134  296:ifnonnull       310
									{
										_flddelegate.skipChildren();
	//  135  299:aload_0         
	//  136  300:getfield        #76  <Field JsonParser _flddelegate>
	//  137  303:invokevirtual   #106 <Method JsonParser JsonParser.skipChildren()>
	//  138  306:pop             
									} else
	//* 139  307:goto            0
									{
										obj = ((Object) (tokenfilter1));
	//  140  310:aload_3         
	//  141  311:astore_2        
										if(tokenfilter1 != TokenFilter.INCLUDE_ALL)
	//* 142  312:aload_3         
	//* 143  313:getstatic       #94  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 144  316:if_acmpeq       324
											obj = ((Object) (tokenfilter1.filterStartArray()));
	//  145  319:aload_3         
	//  146  320:invokevirtual   #126 <Method TokenFilter TokenFilter.filterStartArray()>
	//  147  323:astore_2        
										_itemFilter = ((TokenFilter) (obj));
	//  148  324:aload_0         
	//  149  325:aload_2         
	//  150  326:putfield        #29  <Field TokenFilter _itemFilter>
										if(obj == TokenFilter.INCLUDE_ALL)
	//* 151  329:aload_2         
	//* 152  330:getstatic       #94  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 153  333:if_acmpne       358
										{
											_headContext = _headContext.createChildArrayContext(((TokenFilter) (obj)), true);
	//  154  336:aload_0         
	//  155  337:aload_0         
	//  156  338:getfield        #37  <Field TokenFilterContext _headContext>
	//  157  341:aload_2         
	//  158  342:iconst_1        
	//  159  343:invokevirtual   #118 <Method TokenFilterContext TokenFilterContext.createChildArrayContext(TokenFilter, boolean)>
	//  160  346:putfield        #37  <Field TokenFilterContext _headContext>
											_currToken = jsontoken;
	//  161  349:aload_0         
	//  162  350:aload           4
	//  163  352:putfield        #83  <Field JsonToken _currToken>
											return jsontoken;
	//  164  355:aload           4
	//  165  357:areturn         
										}
										_headContext = _headContext.createChildArrayContext(((TokenFilter) (obj)), false);
	//  166  358:aload_0         
	//  167  359:aload_0         
	//  168  360:getfield        #37  <Field TokenFilterContext _headContext>
	//  169  363:aload_2         
	//  170  364:iconst_0        
	//  171  365:invokevirtual   #118 <Method TokenFilterContext TokenFilterContext.createChildArrayContext(TokenFilter, boolean)>
	//  172  368:putfield        #37  <Field TokenFilterContext _headContext>
										if(_includePath)
	//* 173  371:aload_0         
	//* 174  372:getfield        #39  <Field boolean _includePath>
	//* 175  375:ifeq            0
										{
											obj = ((Object) (_nextTokenWithBuffering(_headContext)));
	//  176  378:aload_0         
	//  177  379:aload_0         
	//  178  380:getfield        #37  <Field TokenFilterContext _headContext>
	//  179  383:invokevirtual   #114 <Method JsonToken _nextTokenWithBuffering(TokenFilterContext)>
	//  180  386:astore_2        
											if(obj != null)
	//* 181  387:aload_2         
	//* 182  388:ifnull          0
											{
												_currToken = ((JsonToken) (obj));
	//  183  391:aload_0         
	//  184  392:aload_2         
	//  185  393:putfield        #83  <Field JsonToken _currToken>
												return ((JsonToken) (obj));
	//  186  396:aload_2         
	//  187  397:areturn         
											}
										}
									}
								}
								continue;

							case 2: // '\002'
							case 4: // '\004'
								boolean flag = _headContext.isStartHandled();
	//  188  398:aload_0         
	//  189  399:getfield        #37  <Field TokenFilterContext _headContext>
	//  190  402:invokevirtual   #129 <Method boolean TokenFilterContext.isStartHandled()>
	//  191  405:istore_1        
								obj = ((Object) (_headContext.getFilter()));
	//  192  406:aload_0         
	//  193  407:getfield        #37  <Field TokenFilterContext _headContext>
	//  194  410:invokevirtual   #132 <Method TokenFilter TokenFilterContext.getFilter()>
	//  195  413:astore_2        
								if(obj != null && obj != TokenFilter.INCLUDE_ALL)
	//* 196  414:aload_2         
	//* 197  415:ifnull          429
	//* 198  418:aload_2         
	//* 199  419:getstatic       #94  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 200  422:if_acmpeq       429
									((TokenFilter) (obj)).filterFinishArray();
	//  201  425:aload_2         
	//  202  426:invokevirtual   #136 <Method void TokenFilter.filterFinishArray()>
								_headContext = _headContext.getParent();
	//  203  429:aload_0         
	//  204  430:aload_0         
	//  205  431:getfield        #37  <Field TokenFilterContext _headContext>
	//  206  434:invokevirtual   #140 <Method TokenFilterContext TokenFilterContext.getParent()>
	//  207  437:putfield        #37  <Field TokenFilterContext _headContext>
								_itemFilter = _headContext.getFilter();
	//  208  440:aload_0         
	//  209  441:aload_0         
	//  210  442:getfield        #37  <Field TokenFilterContext _headContext>
	//  211  445:invokevirtual   #132 <Method TokenFilter TokenFilterContext.getFilter()>
	//  212  448:putfield        #29  <Field TokenFilter _itemFilter>
								if(flag)
	//* 213  451:iload_1         
	//* 214  452:ifeq            0
								{
									_currToken = jsontoken;
	//  215  455:aload_0         
	//  216  456:aload           4
	//  217  458:putfield        #83  <Field JsonToken _currToken>
									return jsontoken;
	//  218  461:aload           4
	//  219  463:areturn         
								}
								continue;

							case 1: // '\001'
								obj = ((Object) (_itemFilter));
	//  220  464:aload_0         
	//  221  465:getfield        #29  <Field TokenFilter _itemFilter>
	//  222  468:astore_2        
								if(obj == TokenFilter.INCLUDE_ALL)
	//* 223  469:aload_2         
	//* 224  470:getstatic       #94  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 225  473:if_acmpne       498
								{
									_headContext = _headContext.createChildObjectContext(((TokenFilter) (obj)), true);
	//  226  476:aload_0         
	//  227  477:aload_0         
	//  228  478:getfield        #37  <Field TokenFilterContext _headContext>
	//  229  481:aload_2         
	//  230  482:iconst_1        
	//  231  483:invokevirtual   #143 <Method TokenFilterContext TokenFilterContext.createChildObjectContext(TokenFilter, boolean)>
	//  232  486:putfield        #37  <Field TokenFilterContext _headContext>
									_currToken = jsontoken;
	//  233  489:aload_0         
	//  234  490:aload           4
	//  235  492:putfield        #83  <Field JsonToken _currToken>
									return jsontoken;
	//  236  495:aload           4
	//  237  497:areturn         
								}
								if(obj == null)
	//* 238  498:aload_2         
	//* 239  499:ifnonnull       513
								{
									_flddelegate.skipChildren();
	//  240  502:aload_0         
	//  241  503:getfield        #76  <Field JsonParser _flddelegate>
	//  242  506:invokevirtual   #106 <Method JsonParser JsonParser.skipChildren()>
	//  243  509:pop             
									continue;
	//  244  510:goto            0
								}
								tokenfilter2 = _headContext.checkValue(((TokenFilter) (obj)));
	//  245  513:aload_0         
	//  246  514:getfield        #37  <Field TokenFilterContext _headContext>
	//  247  517:aload_2         
	//  248  518:invokevirtual   #122 <Method TokenFilter TokenFilterContext.checkValue(TokenFilter)>
	//  249  521:astore_3        
								if(tokenfilter2 != null)
									break label1;
	//  250  522:aload_3         
	//  251  523:ifnonnull       537
								_flddelegate.skipChildren();
	//  252  526:aload_0         
	//  253  527:getfield        #76  <Field JsonParser _flddelegate>
	//  254  530:invokevirtual   #106 <Method JsonParser JsonParser.skipChildren()>
	//  255  533:pop             
								break;
							}
						} while(true);
	//  256  534:goto            0
						obj = ((Object) (tokenfilter2));
	//  257  537:aload_3         
	//  258  538:astore_2        
						if(tokenfilter2 != TokenFilter.INCLUDE_ALL)
	//* 259  539:aload_3         
	//* 260  540:getstatic       #94  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 261  543:if_acmpeq       551
							obj = ((Object) (tokenfilter2.filterStartObject()));
	//  262  546:aload_3         
	//  263  547:invokevirtual   #146 <Method TokenFilter TokenFilter.filterStartObject()>
	//  264  550:astore_2        
						_itemFilter = ((TokenFilter) (obj));
	//  265  551:aload_0         
	//  266  552:aload_2         
	//  267  553:putfield        #29  <Field TokenFilter _itemFilter>
						if(obj == TokenFilter.INCLUDE_ALL)
	//* 268  556:aload_2         
	//* 269  557:getstatic       #94  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 270  560:if_acmpne       585
						{
							_headContext = _headContext.createChildObjectContext(((TokenFilter) (obj)), true);
	//  271  563:aload_0         
	//  272  564:aload_0         
	//  273  565:getfield        #37  <Field TokenFilterContext _headContext>
	//  274  568:aload_2         
	//  275  569:iconst_1        
	//  276  570:invokevirtual   #143 <Method TokenFilterContext TokenFilterContext.createChildObjectContext(TokenFilter, boolean)>
	//  277  573:putfield        #37  <Field TokenFilterContext _headContext>
							_currToken = jsontoken;
	//  278  576:aload_0         
	//  279  577:aload           4
	//  280  579:putfield        #83  <Field JsonToken _currToken>
							return jsontoken;
	//  281  582:aload           4
	//  282  584:areturn         
						}
						_headContext = _headContext.createChildObjectContext(((TokenFilter) (obj)), false);
	//  283  585:aload_0         
	//  284  586:aload_0         
	//  285  587:getfield        #37  <Field TokenFilterContext _headContext>
	//  286  590:aload_2         
	//  287  591:iconst_0        
	//  288  592:invokevirtual   #143 <Method TokenFilterContext TokenFilterContext.createChildObjectContext(TokenFilter, boolean)>
	//  289  595:putfield        #37  <Field TokenFilterContext _headContext>
					} while(!_includePath);
	//  290  598:aload_0         
	//  291  599:getfield        #39  <Field boolean _includePath>
	//  292  602:ifeq            0
					obj = ((Object) (_nextTokenWithBuffering(_headContext)));
	//  293  605:aload_0         
	//  294  606:aload_0         
	//  295  607:getfield        #37  <Field TokenFilterContext _headContext>
	//  296  610:invokevirtual   #114 <Method JsonToken _nextTokenWithBuffering(TokenFilterContext)>
	//  297  613:astore_2        
				} while(obj == null);
	//  298  614:aload_2         
	//  299  615:ifnull          0
				_currToken = ((JsonToken) (obj));
	//  300  618:aload_0         
	//  301  619:aload_2         
	//  302  620:putfield        #83  <Field JsonToken _currToken>
				return ((JsonToken) (obj));
	//  303  623:aload_2         
	//  304  624:areturn         
			} while(obj == null);
	//  305  625:aload_2         
	//  306  626:ifnull          0
			obj = ((Object) (_headContext.checkValue(((TokenFilter) (obj)))));
	//  307  629:aload_0         
	//  308  630:getfield        #37  <Field TokenFilterContext _headContext>
	//  309  633:aload_2         
	//  310  634:invokevirtual   #122 <Method TokenFilter TokenFilterContext.checkValue(TokenFilter)>
	//  311  637:astore_2        
		} while(obj != TokenFilter.INCLUDE_ALL && (obj == null || !((TokenFilter) (obj)).includeValue(_flddelegate)) || !_verifyAllowedMatches());
	//  312  638:aload_2         
	//  313  639:getstatic       #94  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//  314  642:if_acmpeq       660
	//  315  645:aload_2         
	//  316  646:ifnull          0
	//  317  649:aload_2         
	//  318  650:aload_0         
	//  319  651:getfield        #76  <Field JsonParser _flddelegate>
	//  320  654:invokevirtual   #150 <Method boolean TokenFilter.includeValue(JsonParser)>
	//  321  657:ifeq            0
	//  322  660:aload_0         
	//  323  661:invokespecial   #111 <Method boolean _verifyAllowedMatches()>
	//  324  664:ifeq            0
		_currToken = jsontoken;
	//  325  667:aload_0         
	//  326  668:aload           4
	//  327  670:putfield        #83  <Field JsonToken _currToken>
		return jsontoken;
	//  328  673:aload           4
	//  329  675:areturn         
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
	//    1    1:getfield        #76  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #81  <Method JsonToken JsonParser.nextToken()>
	//    3    7:astore          5
					if(obj == null)
	//*   4    9:aload           5
	//*   5   11:ifnonnull       17
						return ((JsonToken) (obj));
	//    6   14:aload           5
	//    7   16:areturn         
					int i = ((JsonToken) (obj)).id();
	//    8   17:aload           5
	//    9   19:invokevirtual   #89  <Method int JsonToken.id()>
	//   10   22:istore_2        
					boolean flag2 = false;
	//   11   23:iconst_0        
	//   12   24:istore          4
					switch(i)
	//*  13   26:iload_2         
					{
	//*  14   27:tableswitch     1 5: default 60
	//	               1 412
	//	               2 319
	//	               3 220
	//	               4 319
	//	               5 80
					default:
						obj = ((Object) (_itemFilter));
	//   15   60:aload_0         
	//   16   61:getfield        #29  <Field TokenFilter _itemFilter>
	//   17   64:astore          5
						if(obj == TokenFilter.INCLUDE_ALL)
	//*  18   66:aload           5
	//*  19   68:getstatic       #94  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//*  20   71:if_acmpne       556
							return _nextBuffered(tokenfiltercontext);
	//   21   74:aload_0         
	//   22   75:aload_1         
	//   23   76:invokespecial   #152 <Method JsonToken _nextBuffered(TokenFilterContext)>
	//   24   79:areturn         
						break label0;

					case 5: // '\005'
						obj = ((Object) (_flddelegate.getCurrentName()));
	//   25   80:aload_0         
	//   26   81:getfield        #76  <Field JsonParser _flddelegate>
	//   27   84:invokevirtual   #98  <Method String JsonParser.getCurrentName()>
	//   28   87:astore          5
						TokenFilter tokenfilter = _headContext.setFieldName(((String) (obj)));
	//   29   89:aload_0         
	//   30   90:getfield        #37  <Field TokenFilterContext _headContext>
	//   31   93:aload           5
	//   32   95:invokevirtual   #102 <Method TokenFilter TokenFilterContext.setFieldName(String)>
	//   33   98:astore          6
						if(tokenfilter == TokenFilter.INCLUDE_ALL)
	//*  34  100:aload           6
	//*  35  102:getstatic       #94  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//*  36  105:if_acmpne       120
						{
							_itemFilter = tokenfilter;
	//   37  108:aload_0         
	//   38  109:aload           6
	//   39  111:putfield        #29  <Field TokenFilter _itemFilter>
							return _nextBuffered(tokenfiltercontext);
	//   40  114:aload_0         
	//   41  115:aload_1         
	//   42  116:invokespecial   #152 <Method JsonToken _nextBuffered(TokenFilterContext)>
	//   43  119:areturn         
						}
						if(tokenfilter == null)
	//*  44  120:aload           6
	//*  45  122:ifnonnull       144
						{
							_flddelegate.nextToken();
	//   46  125:aload_0         
	//   47  126:getfield        #76  <Field JsonParser _flddelegate>
	//   48  129:invokevirtual   #81  <Method JsonToken JsonParser.nextToken()>
	//   49  132:pop             
							_flddelegate.skipChildren();
	//   50  133:aload_0         
	//   51  134:getfield        #76  <Field JsonParser _flddelegate>
	//   52  137:invokevirtual   #106 <Method JsonParser JsonParser.skipChildren()>
	//   53  140:pop             
						} else
	//*  54  141:goto            0
						{
							tokenfilter = tokenfilter.includeProperty(((String) (obj)));
	//   55  144:aload           6
	//   56  146:aload           5
	//   57  148:invokevirtual   #109 <Method TokenFilter TokenFilter.includeProperty(String)>
	//   58  151:astore          6
							if(tokenfilter == null)
	//*  59  153:aload           6
	//*  60  155:ifnonnull       177
							{
								_flddelegate.nextToken();
	//   61  158:aload_0         
	//   62  159:getfield        #76  <Field JsonParser _flddelegate>
	//   63  162:invokevirtual   #81  <Method JsonToken JsonParser.nextToken()>
	//   64  165:pop             
								_flddelegate.skipChildren();
	//   65  166:aload_0         
	//   66  167:getfield        #76  <Field JsonParser _flddelegate>
	//   67  170:invokevirtual   #106 <Method JsonParser JsonParser.skipChildren()>
	//   68  173:pop             
							} else
	//*  69  174:goto            0
							{
								_itemFilter = tokenfilter;
	//   70  177:aload_0         
	//   71  178:aload           6
	//   72  180:putfield        #29  <Field TokenFilter _itemFilter>
								if(tokenfilter == TokenFilter.INCLUDE_ALL)
	//*  73  183:aload           6
	//*  74  185:getstatic       #94  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//*  75  188:if_acmpne       0
								{
									if(_verifyAllowedMatches())
	//*  76  191:aload_0         
	//*  77  192:invokespecial   #111 <Method boolean _verifyAllowedMatches()>
	//*  78  195:ifeq            204
										return _nextBuffered(tokenfiltercontext);
	//   79  198:aload_0         
	//   80  199:aload_1         
	//   81  200:invokespecial   #152 <Method JsonToken _nextBuffered(TokenFilterContext)>
	//   82  203:areturn         
									_itemFilter = _headContext.setFieldName(((String) (obj)));
	//   83  204:aload_0         
	//   84  205:aload_0         
	//   85  206:getfield        #37  <Field TokenFilterContext _headContext>
	//   86  209:aload           5
	//   87  211:invokevirtual   #102 <Method TokenFilter TokenFilterContext.setFieldName(String)>
	//   88  214:putfield        #29  <Field TokenFilter _itemFilter>
								}
							}
						}
						break;

	//*  89  217:goto            0
					case 3: // '\003'
						TokenFilter tokenfilter1 = _headContext.checkValue(_itemFilter);
	//   90  220:aload_0         
	//   91  221:getfield        #37  <Field TokenFilterContext _headContext>
	//   92  224:aload_0         
	//   93  225:getfield        #29  <Field TokenFilter _itemFilter>
	//   94  228:invokevirtual   #122 <Method TokenFilter TokenFilterContext.checkValue(TokenFilter)>
	//   95  231:astore          6
						if(tokenfilter1 == null)
	//*  96  233:aload           6
	//*  97  235:ifnonnull       249
						{
							_flddelegate.skipChildren();
	//   98  238:aload_0         
	//   99  239:getfield        #76  <Field JsonParser _flddelegate>
	//  100  242:invokevirtual   #106 <Method JsonParser JsonParser.skipChildren()>
	//  101  245:pop             
						} else
	//* 102  246:goto            0
						{
							obj = ((Object) (tokenfilter1));
	//  103  249:aload           6
	//  104  251:astore          5
							if(tokenfilter1 != TokenFilter.INCLUDE_ALL)
	//* 105  253:aload           6
	//* 106  255:getstatic       #94  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 107  258:if_acmpeq       268
								obj = ((Object) (tokenfilter1.filterStartArray()));
	//  108  261:aload           6
	//  109  263:invokevirtual   #126 <Method TokenFilter TokenFilter.filterStartArray()>
	//  110  266:astore          5
							_itemFilter = ((TokenFilter) (obj));
	//  111  268:aload_0         
	//  112  269:aload           5
	//  113  271:putfield        #29  <Field TokenFilter _itemFilter>
							if(obj == TokenFilter.INCLUDE_ALL)
	//* 114  274:aload           5
	//* 115  276:getstatic       #94  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 116  279:if_acmpne       302
							{
								_headContext = _headContext.createChildArrayContext(((TokenFilter) (obj)), true);
	//  117  282:aload_0         
	//  118  283:aload_0         
	//  119  284:getfield        #37  <Field TokenFilterContext _headContext>
	//  120  287:aload           5
	//  121  289:iconst_1        
	//  122  290:invokevirtual   #118 <Method TokenFilterContext TokenFilterContext.createChildArrayContext(TokenFilter, boolean)>
	//  123  293:putfield        #37  <Field TokenFilterContext _headContext>
								return _nextBuffered(tokenfiltercontext);
	//  124  296:aload_0         
	//  125  297:aload_1         
	//  126  298:invokespecial   #152 <Method JsonToken _nextBuffered(TokenFilterContext)>
	//  127  301:areturn         
							}
							_headContext = _headContext.createChildArrayContext(((TokenFilter) (obj)), false);
	//  128  302:aload_0         
	//  129  303:aload_0         
	//  130  304:getfield        #37  <Field TokenFilterContext _headContext>
	//  131  307:aload           5
	//  132  309:iconst_0        
	//  133  310:invokevirtual   #118 <Method TokenFilterContext TokenFilterContext.createChildArrayContext(TokenFilter, boolean)>
	//  134  313:putfield        #37  <Field TokenFilterContext _headContext>
						}
						break;

	//* 135  316:goto            0
					case 2: // '\002'
					case 4: // '\004'
						TokenFilter tokenfilter2 = _headContext.getFilter();
	//  136  319:aload_0         
	//  137  320:getfield        #37  <Field TokenFilterContext _headContext>
	//  138  323:invokevirtual   #132 <Method TokenFilter TokenFilterContext.getFilter()>
	//  139  326:astore          6
						if(tokenfilter2 != null && tokenfilter2 != TokenFilter.INCLUDE_ALL)
	//* 140  328:aload           6
	//* 141  330:ifnull          346
	//* 142  333:aload           6
	//* 143  335:getstatic       #94  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 144  338:if_acmpeq       346
							tokenfilter2.filterFinishArray();
	//  145  341:aload           6
	//  146  343:invokevirtual   #136 <Method void TokenFilter.filterFinishArray()>
						boolean flag;
						if(_headContext == tokenfiltercontext)
	//* 147  346:aload_0         
	//* 148  347:getfield        #37  <Field TokenFilterContext _headContext>
	//* 149  350:aload_1         
	//* 150  351:if_acmpne       359
							flag = true;
	//  151  354:iconst_1        
	//  152  355:istore_2        
						else
	//* 153  356:goto            361
							flag = false;
	//  154  359:iconst_0        
	//  155  360:istore_2        
						boolean flag1 = flag2;
	//  156  361:iload           4
	//  157  363:istore_3        
						if(flag)
	//* 158  364:iload_2         
	//* 159  365:ifeq            383
						{
							flag1 = flag2;
	//  160  368:iload           4
	//  161  370:istore_3        
							if(_headContext.isStartHandled())
	//* 162  371:aload_0         
	//* 163  372:getfield        #37  <Field TokenFilterContext _headContext>
	//* 164  375:invokevirtual   #129 <Method boolean TokenFilterContext.isStartHandled()>
	//* 165  378:ifeq            383
								flag1 = true;
	//  166  381:iconst_1        
	//  167  382:istore_3        
						}
						_headContext = _headContext.getParent();
	//  168  383:aload_0         
	//  169  384:aload_0         
	//  170  385:getfield        #37  <Field TokenFilterContext _headContext>
	//  171  388:invokevirtual   #140 <Method TokenFilterContext TokenFilterContext.getParent()>
	//  172  391:putfield        #37  <Field TokenFilterContext _headContext>
						_itemFilter = _headContext.getFilter();
	//  173  394:aload_0         
	//  174  395:aload_0         
	//  175  396:getfield        #37  <Field TokenFilterContext _headContext>
	//  176  399:invokevirtual   #132 <Method TokenFilter TokenFilterContext.getFilter()>
	//  177  402:putfield        #29  <Field TokenFilter _itemFilter>
						if(flag1)
	//* 178  405:iload_3         
	//* 179  406:ifeq            0
							return ((JsonToken) (obj));
	//  180  409:aload           5
	//  181  411:areturn         
						break;

					case 1: // '\001'
						TokenFilter tokenfilter3 = _itemFilter;
	//  182  412:aload_0         
	//  183  413:getfield        #29  <Field TokenFilter _itemFilter>
	//  184  416:astore          6
						if(tokenfilter3 == TokenFilter.INCLUDE_ALL)
	//* 185  418:aload           6
	//* 186  420:getstatic       #94  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 187  423:if_acmpne       443
						{
							_headContext = _headContext.createChildObjectContext(tokenfilter3, true);
	//  188  426:aload_0         
	//  189  427:aload_0         
	//  190  428:getfield        #37  <Field TokenFilterContext _headContext>
	//  191  431:aload           6
	//  192  433:iconst_1        
	//  193  434:invokevirtual   #143 <Method TokenFilterContext TokenFilterContext.createChildObjectContext(TokenFilter, boolean)>
	//  194  437:putfield        #37  <Field TokenFilterContext _headContext>
							return ((JsonToken) (obj));
	//  195  440:aload           5
	//  196  442:areturn         
						}
						if(tokenfilter3 == null)
	//* 197  443:aload           6
	//* 198  445:ifnonnull       459
						{
							_flddelegate.skipChildren();
	//  199  448:aload_0         
	//  200  449:getfield        #76  <Field JsonParser _flddelegate>
	//  201  452:invokevirtual   #106 <Method JsonParser JsonParser.skipChildren()>
	//  202  455:pop             
						} else
	//* 203  456:goto            0
						{
							tokenfilter3 = _headContext.checkValue(tokenfilter3);
	//  204  459:aload_0         
	//  205  460:getfield        #37  <Field TokenFilterContext _headContext>
	//  206  463:aload           6
	//  207  465:invokevirtual   #122 <Method TokenFilter TokenFilterContext.checkValue(TokenFilter)>
	//  208  468:astore          6
							if(tokenfilter3 == null)
	//* 209  470:aload           6
	//* 210  472:ifnonnull       486
							{
								_flddelegate.skipChildren();
	//  211  475:aload_0         
	//  212  476:getfield        #76  <Field JsonParser _flddelegate>
	//  213  479:invokevirtual   #106 <Method JsonParser JsonParser.skipChildren()>
	//  214  482:pop             
							} else
	//* 215  483:goto            0
							{
								obj = ((Object) (tokenfilter3));
	//  216  486:aload           6
	//  217  488:astore          5
								if(tokenfilter3 != TokenFilter.INCLUDE_ALL)
	//* 218  490:aload           6
	//* 219  492:getstatic       #94  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 220  495:if_acmpeq       505
									obj = ((Object) (tokenfilter3.filterStartObject()));
	//  221  498:aload           6
	//  222  500:invokevirtual   #146 <Method TokenFilter TokenFilter.filterStartObject()>
	//  223  503:astore          5
								_itemFilter = ((TokenFilter) (obj));
	//  224  505:aload_0         
	//  225  506:aload           5
	//  226  508:putfield        #29  <Field TokenFilter _itemFilter>
								if(obj == TokenFilter.INCLUDE_ALL)
	//* 227  511:aload           5
	//* 228  513:getstatic       #94  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 229  516:if_acmpne       539
								{
									_headContext = _headContext.createChildObjectContext(((TokenFilter) (obj)), true);
	//  230  519:aload_0         
	//  231  520:aload_0         
	//  232  521:getfield        #37  <Field TokenFilterContext _headContext>
	//  233  524:aload           5
	//  234  526:iconst_1        
	//  235  527:invokevirtual   #143 <Method TokenFilterContext TokenFilterContext.createChildObjectContext(TokenFilter, boolean)>
	//  236  530:putfield        #37  <Field TokenFilterContext _headContext>
									return _nextBuffered(tokenfiltercontext);
	//  237  533:aload_0         
	//  238  534:aload_1         
	//  239  535:invokespecial   #152 <Method JsonToken _nextBuffered(TokenFilterContext)>
	//  240  538:areturn         
								}
								_headContext = _headContext.createChildObjectContext(((TokenFilter) (obj)), false);
	//  241  539:aload_0         
	//  242  540:aload_0         
	//  243  541:getfield        #37  <Field TokenFilterContext _headContext>
	//  244  544:aload           5
	//  245  546:iconst_0        
	//  246  547:invokevirtual   #143 <Method TokenFilterContext TokenFilterContext.createChildObjectContext(TokenFilter, boolean)>
	//  247  550:putfield        #37  <Field TokenFilterContext _headContext>
							}
						}
						break;
					}
				} while(true);
	//  248  553:goto            0
			while(obj == null);
	//  249  556:aload           5
	//  250  558:ifnull          0
			obj = ((Object) (_headContext.checkValue(((TokenFilter) (obj)))));
	//  251  561:aload_0         
	//  252  562:getfield        #37  <Field TokenFilterContext _headContext>
	//  253  565:aload           5
	//  254  567:invokevirtual   #122 <Method TokenFilter TokenFilterContext.checkValue(TokenFilter)>
	//  255  570:astore          5
		} while(obj != TokenFilter.INCLUDE_ALL && (obj == null || !((TokenFilter) (obj)).includeValue(_flddelegate)) || !_verifyAllowedMatches());
	//  256  572:aload           5
	//  257  574:getstatic       #94  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//  258  577:if_acmpeq       597
	//  259  580:aload           5
	//  260  582:ifnull          0
	//  261  585:aload           5
	//  262  587:aload_0         
	//  263  588:getfield        #76  <Field JsonParser _flddelegate>
	//  264  591:invokevirtual   #150 <Method boolean TokenFilter.includeValue(JsonParser)>
	//  265  594:ifeq            0
	//  266  597:aload_0         
	//  267  598:invokespecial   #111 <Method boolean _verifyAllowedMatches()>
	//  268  601:ifeq            0
		return _nextBuffered(tokenfiltercontext);
	//  269  604:aload_0         
	//  270  605:aload_1         
	//  271  606:invokespecial   #152 <Method JsonToken _nextBuffered(TokenFilterContext)>
	//  272  609:areturn         
	}

	public void clearCurrentToken()
	{
		JsonToken jsontoken = _currToken;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field JsonToken _currToken>
	//    2    4:astore_1        
		if(jsontoken != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          19
		{
			_lastClearedToken = jsontoken;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #155 <Field JsonToken _lastClearedToken>
			_currToken = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #83  <Field JsonToken _currToken>
		}
	//   11   19:return          
	}

	public JsonToken currentToken()
	{
		return _currToken;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field JsonToken _currToken>
	//    2    4:areturn         
	}

	public BigInteger getBigIntegerValue()
		throws IOException
	{
		return _flddelegate.getBigIntegerValue();
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #160 <Method BigInteger JsonParser.getBigIntegerValue()>
	//    3    7:areturn         
	}

	public byte[] getBinaryValue(Base64Variant base64variant)
		throws IOException
	{
		return _flddelegate.getBinaryValue(base64variant);
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field JsonParser _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #164 <Method byte[] JsonParser.getBinaryValue(Base64Variant)>
	//    4    8:areturn         
	}

	public byte getByteValue()
		throws IOException
	{
		return _flddelegate.getByteValue();
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #168 <Method byte JsonParser.getByteValue()>
	//    3    7:ireturn         
	}

	public JsonLocation getCurrentLocation()
	{
		return _flddelegate.getCurrentLocation();
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #172 <Method JsonLocation JsonParser.getCurrentLocation()>
	//    3    7:areturn         
	}

	public String getCurrentName()
		throws IOException
	{
		JsonStreamContext jsonstreamcontext = _filterContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #174 <Method JsonStreamContext _filterContext()>
	//    2    4:astore_1        
		if(_currToken != JsonToken.START_OBJECT && _currToken != JsonToken.START_ARRAY)
	//*   3    5:aload_0         
	//*   4    6:getfield        #83  <Field JsonToken _currToken>
	//*   5    9:getstatic       #177 <Field JsonToken JsonToken.START_OBJECT>
	//*   6   12:if_acmpeq       33
	//*   7   15:aload_0         
	//*   8   16:getfield        #83  <Field JsonToken _currToken>
	//*   9   19:getstatic       #180 <Field JsonToken JsonToken.START_ARRAY>
	//*  10   22:if_acmpne       28
	//*  11   25:goto            33
			return jsonstreamcontext.getCurrentName();
	//   12   28:aload_1         
	//   13   29:invokevirtual   #183 <Method String JsonStreamContext.getCurrentName()>
	//   14   32:areturn         
		jsonstreamcontext = jsonstreamcontext.getParent();
	//   15   33:aload_1         
	//   16   34:invokevirtual   #185 <Method JsonStreamContext JsonStreamContext.getParent()>
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
	//   23   45:invokevirtual   #183 <Method String JsonStreamContext.getCurrentName()>
	//   24   48:areturn         
	}

	public JsonToken getCurrentToken()
	{
		return _currToken;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field JsonToken _currToken>
	//    2    4:areturn         
	}

	public final int getCurrentTokenId()
	{
		JsonToken jsontoken = _currToken;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field JsonToken _currToken>
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
	//    8   12:invokevirtual   #89  <Method int JsonToken.id()>
	//    9   15:ireturn         
	}

	public BigDecimal getDecimalValue()
		throws IOException
	{
		return _flddelegate.getDecimalValue();
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #191 <Method BigDecimal JsonParser.getDecimalValue()>
	//    3    7:areturn         
	}

	public double getDoubleValue()
		throws IOException
	{
		return _flddelegate.getDoubleValue();
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #195 <Method double JsonParser.getDoubleValue()>
	//    3    7:dreturn         
	}

	public Object getEmbeddedObject()
		throws IOException
	{
		return _flddelegate.getEmbeddedObject();
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #199 <Method Object JsonParser.getEmbeddedObject()>
	//    3    7:areturn         
	}

	public float getFloatValue()
		throws IOException
	{
		return _flddelegate.getFloatValue();
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #203 <Method float JsonParser.getFloatValue()>
	//    3    7:freturn         
	}

	public int getIntValue()
		throws IOException
	{
		return _flddelegate.getIntValue();
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #206 <Method int JsonParser.getIntValue()>
	//    3    7:ireturn         
	}

	public long getLongValue()
		throws IOException
	{
		return _flddelegate.getLongValue();
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #210 <Method long JsonParser.getLongValue()>
	//    3    7:lreturn         
	}

	public com.fasterxml.jackson.core.JsonParser.NumberType getNumberType()
		throws IOException
	{
		return _flddelegate.getNumberType();
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #214 <Method com.fasterxml.jackson.core.JsonParser$NumberType JsonParser.getNumberType()>
	//    3    7:areturn         
	}

	public Number getNumberValue()
		throws IOException
	{
		return _flddelegate.getNumberValue();
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #218 <Method Number JsonParser.getNumberValue()>
	//    3    7:areturn         
	}

	public JsonStreamContext getParsingContext()
	{
		return _filterContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #174 <Method JsonStreamContext _filterContext()>
	//    2    4:areturn         
	}

	public short getShortValue()
		throws IOException
	{
		return _flddelegate.getShortValue();
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #223 <Method short JsonParser.getShortValue()>
	//    3    7:ireturn         
	}

	public String getText()
		throws IOException
	{
		return _flddelegate.getText();
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #226 <Method String JsonParser.getText()>
	//    3    7:areturn         
	}

	public char[] getTextCharacters()
		throws IOException
	{
		return _flddelegate.getTextCharacters();
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #230 <Method char[] JsonParser.getTextCharacters()>
	//    3    7:areturn         
	}

	public int getTextLength()
		throws IOException
	{
		return _flddelegate.getTextLength();
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #233 <Method int JsonParser.getTextLength()>
	//    3    7:ireturn         
	}

	public int getTextOffset()
		throws IOException
	{
		return _flddelegate.getTextOffset();
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #236 <Method int JsonParser.getTextOffset()>
	//    3    7:ireturn         
	}

	public JsonLocation getTokenLocation()
	{
		return _flddelegate.getTokenLocation();
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #239 <Method JsonLocation JsonParser.getTokenLocation()>
	//    3    7:areturn         
	}

	public int getValueAsInt()
		throws IOException
	{
		return _flddelegate.getValueAsInt();
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #242 <Method int JsonParser.getValueAsInt()>
	//    3    7:ireturn         
	}

	public int getValueAsInt(int i)
		throws IOException
	{
		return _flddelegate.getValueAsInt(i);
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field JsonParser _flddelegate>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #245 <Method int JsonParser.getValueAsInt(int)>
	//    4    8:ireturn         
	}

	public long getValueAsLong()
		throws IOException
	{
		return _flddelegate.getValueAsLong();
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #248 <Method long JsonParser.getValueAsLong()>
	//    3    7:lreturn         
	}

	public long getValueAsLong(long l)
		throws IOException
	{
		return _flddelegate.getValueAsLong(l);
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field JsonParser _flddelegate>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #251 <Method long JsonParser.getValueAsLong(long)>
	//    4    8:lreturn         
	}

	public String getValueAsString()
		throws IOException
	{
		return _flddelegate.getValueAsString();
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #254 <Method String JsonParser.getValueAsString()>
	//    3    7:areturn         
	}

	public String getValueAsString(String s)
		throws IOException
	{
		return _flddelegate.getValueAsString(s);
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field JsonParser _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #257 <Method String JsonParser.getValueAsString(String)>
	//    4    8:areturn         
	}

	public boolean hasCurrentToken()
	{
		return _currToken != null;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field JsonToken _currToken>
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
	//    1    1:getfield        #76  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #261 <Method boolean JsonParser.hasTextCharacters()>
	//    3    7:ireturn         
	}

	public final boolean hasToken(JsonToken jsontoken)
	{
		return _currToken == jsontoken;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field JsonToken _currToken>
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
	//    1    1:getfield        #83  <Field JsonToken _currToken>
	//    2    4:astore_2        
		if(jsontoken == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       17
			return i == 0;
	//    5    9:iload_1         
	//    6   10:ifne            15
	//    7   13:iconst_1        
	//    8   14:ireturn         
	//    9   15:iconst_0        
	//   10   16:ireturn         
		return jsontoken.id() == i;
	//   11   17:aload_2         
	//   12   18:invokevirtual   #89  <Method int JsonToken.id()>
	//   13   21:iload_1         
	//   14   22:icmpne          27
	//   15   25:iconst_1        
	//   16   26:ireturn         
	//   17   27:iconst_0        
	//   18   28:ireturn         
	}

	public boolean isExpectedStartArrayToken()
	{
		return _currToken == JsonToken.START_ARRAY;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field JsonToken _currToken>
	//    2    4:getstatic       #180 <Field JsonToken JsonToken.START_ARRAY>
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
	//    1    1:getfield        #83  <Field JsonToken _currToken>
	//    2    4:getstatic       #177 <Field JsonToken JsonToken.START_OBJECT>
	//    3    7:if_acmpne       12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public JsonToken nextToken()
		throws IOException
	{
		if(!_allowMultipleMatches)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field boolean _allowMultipleMatches>
	//*   2    4:ifne            64
		{
			JsonToken jsontoken = _currToken;
	//    3    7:aload_0         
	//    4    8:getfield        #83  <Field JsonToken _currToken>
	//    5   11:astore_2        
			if(jsontoken != null && _exposedContext == null && jsontoken.isScalarValue() && !_headContext.isStartHandled() && !_includePath && _itemFilter == TokenFilter.INCLUDE_ALL)
	//*   6   12:aload_2         
	//*   7   13:ifnull          64
	//*   8   16:aload_0         
	//*   9   17:getfield        #48  <Field TokenFilterContext _exposedContext>
	//*  10   20:ifnonnull       64
	//*  11   23:aload_2         
	//*  12   24:invokevirtual   #270 <Method boolean JsonToken.isScalarValue()>
	//*  13   27:ifeq            64
	//*  14   30:aload_0         
	//*  15   31:getfield        #37  <Field TokenFilterContext _headContext>
	//*  16   34:invokevirtual   #129 <Method boolean TokenFilterContext.isStartHandled()>
	//*  17   37:ifne            64
	//*  18   40:aload_0         
	//*  19   41:getfield        #39  <Field boolean _includePath>
	//*  20   44:ifne            64
	//*  21   47:aload_0         
	//*  22   48:getfield        #29  <Field TokenFilter _itemFilter>
	//*  23   51:getstatic       #94  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//*  24   54:if_acmpne       64
			{
				_currToken = null;
	//   25   57:aload_0         
	//   26   58:aconst_null     
	//   27   59:putfield        #83  <Field JsonToken _currToken>
				return null;
	//   28   62:aconst_null     
	//   29   63:areturn         
			}
		}
		Object obj = ((Object) (_exposedContext));
	//   30   64:aload_0         
	//   31   65:getfield        #48  <Field TokenFilterContext _exposedContext>
	//   32   68:astore_2        
		Object obj2;
		if(obj != null)
			do
	//*  33   69:aload_2         
	//*  34   70:ifnull          151
			{
				obj2 = ((Object) (((TokenFilterContext) (obj)).nextTokenToRead()));
	//   35   73:aload_2         
	//   36   74:invokevirtual   #52  <Method JsonToken TokenFilterContext.nextTokenToRead()>
	//   37   77:astore_3        
				if(obj2 != null)
	//*  38   78:aload_3         
	//*  39   79:ifnull          89
				{
					_currToken = ((JsonToken) (obj2));
	//   40   82:aload_0         
	//   41   83:aload_3         
	//   42   84:putfield        #83  <Field JsonToken _currToken>
					return ((JsonToken) (obj2));
	//   43   87:aload_3         
	//   44   88:areturn         
				}
				obj2 = ((Object) (_headContext));
	//   45   89:aload_0         
	//   46   90:getfield        #37  <Field TokenFilterContext _headContext>
	//   47   93:astore_3        
				if(obj == obj2)
	//*  48   94:aload_2         
	//*  49   95:aload_3         
	//*  50   96:if_acmpne       126
				{
					_exposedContext = null;
	//   51   99:aload_0         
	//   52  100:aconst_null     
	//   53  101:putfield        #48  <Field TokenFilterContext _exposedContext>
					if(((TokenFilterContext) (obj)).inArray())
	//*  54  104:aload_2         
	//*  55  105:invokevirtual   #273 <Method boolean TokenFilterContext.inArray()>
	//*  56  108:ifeq            151
					{
						obj = ((Object) (_flddelegate.getCurrentToken()));
	//   57  111:aload_0         
	//   58  112:getfield        #76  <Field JsonParser _flddelegate>
	//   59  115:invokevirtual   #275 <Method JsonToken JsonParser.getCurrentToken()>
	//   60  118:astore_2        
						_currToken = ((JsonToken) (obj));
	//   61  119:aload_0         
	//   62  120:aload_2         
	//   63  121:putfield        #83  <Field JsonToken _currToken>
						return ((JsonToken) (obj));
	//   64  124:aload_2         
	//   65  125:areturn         
					}
					break;
				}
				obj = ((Object) (((TokenFilterContext) (obj2)).findChildOf(((TokenFilterContext) (obj)))));
	//   66  126:aload_3         
	//   67  127:aload_2         
	//   68  128:invokevirtual   #56  <Method TokenFilterContext TokenFilterContext.findChildOf(TokenFilterContext)>
	//   69  131:astore_2        
				_exposedContext = ((TokenFilterContext) (obj));
	//   70  132:aload_0         
	//   71  133:aload_2         
	//   72  134:putfield        #48  <Field TokenFilterContext _exposedContext>
				if(obj == null)
	//*  73  137:aload_2         
	//*  74  138:ifnull          144
	//*  75  141:goto            73
					throw _constructError("Unexpected problem: chain of filtered context broken");
	//   76  144:aload_0         
	//   77  145:ldc1            #58  <String "Unexpected problem: chain of filtered context broken">
	//   78  147:invokevirtual   #62  <Method com.fasterxml.jackson.core.JsonParseException _constructError(String)>
	//   79  150:athrow          
			} while(true);
		obj2 = ((Object) (_flddelegate.nextToken()));
	//   80  151:aload_0         
	//   81  152:getfield        #76  <Field JsonParser _flddelegate>
	//   82  155:invokevirtual   #81  <Method JsonToken JsonParser.nextToken()>
	//   83  158:astore_3        
		if(obj2 == null)
	//*  84  159:aload_3         
	//*  85  160:ifnonnull       170
		{
			_currToken = ((JsonToken) (obj2));
	//   86  163:aload_0         
	//   87  164:aload_3         
	//   88  165:putfield        #83  <Field JsonToken _currToken>
			return ((JsonToken) (obj2));
	//   89  168:aload_3         
	//   90  169:areturn         
		}
		switch(((JsonToken) (obj2)).id())
	//*  91  170:aload_3         
	//*  92  171:invokevirtual   #89  <Method int JsonToken.id()>
		{
	//*  93  174:tableswitch     1 5: default 208
	//	               1 668
	//	               2 604
	//	               3 442
	//	               4 604
	//	               5 227
		default:
			Object obj1 = ((Object) (_itemFilter));
	//   94  208:aload_0         
	//   95  209:getfield        #29  <Field TokenFilter _itemFilter>
	//   96  212:astore_2        
			boolean flag;
			TokenFilter tokenfilter;
			if(obj1 == TokenFilter.INCLUDE_ALL)
	//*  97  213:aload_2         
	//*  98  214:getstatic       #94  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//*  99  217:if_acmpne       830
			{
				_currToken = ((JsonToken) (obj2));
	//  100  220:aload_0         
	//  101  221:aload_3         
	//  102  222:putfield        #83  <Field JsonToken _currToken>
				return ((JsonToken) (obj2));
	//  103  225:aload_3         
	//  104  226:areturn         
			}
	//* 105  227:aload_0         
	//* 106  228:getfield        #76  <Field JsonParser _flddelegate>
	//* 107  231:invokevirtual   #98  <Method String JsonParser.getCurrentName()>
	//* 108  234:astore_2        
	//* 109  235:aload_0         
	//* 110  236:getfield        #37  <Field TokenFilterContext _headContext>
	//* 111  239:aload_2         
	//* 112  240:invokevirtual   #102 <Method TokenFilter TokenFilterContext.setFieldName(String)>
	//* 113  243:astore          4
	//* 114  245:aload           4
	//* 115  247:getstatic       #94  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 116  250:if_acmpne       312
	//* 117  253:aload_0         
	//* 118  254:aload           4
	//* 119  256:putfield        #29  <Field TokenFilter _itemFilter>
	//* 120  259:aload_3         
	//* 121  260:astore_2        
	//* 122  261:aload_0         
	//* 123  262:getfield        #39  <Field boolean _includePath>
	//* 124  265:ifne            305
	//* 125  268:aload_3         
	//* 126  269:astore_2        
	//* 127  270:aload_0         
	//* 128  271:getfield        #277 <Field boolean _includeImmediateParent>
	//* 129  274:ifeq            305
	//* 130  277:aload_3         
	//* 131  278:astore_2        
	//* 132  279:aload_0         
	//* 133  280:getfield        #37  <Field TokenFilterContext _headContext>
	//* 134  283:invokevirtual   #129 <Method boolean TokenFilterContext.isStartHandled()>
	//* 135  286:ifne            305
	//* 136  289:aload_0         
	//* 137  290:getfield        #37  <Field TokenFilterContext _headContext>
	//* 138  293:invokevirtual   #52  <Method JsonToken TokenFilterContext.nextTokenToRead()>
	//* 139  296:astore_2        
	//* 140  297:aload_0         
	//* 141  298:aload_0         
	//* 142  299:getfield        #37  <Field TokenFilterContext _headContext>
	//* 143  302:putfield        #48  <Field TokenFilterContext _exposedContext>
	//* 144  305:aload_0         
	//* 145  306:aload_2         
	//* 146  307:putfield        #83  <Field JsonToken _currToken>
	//* 147  310:aload_2         
	//* 148  311:areturn         
	//* 149  312:aload           4
	//* 150  314:ifnonnull       336
	//* 151  317:aload_0         
	//* 152  318:getfield        #76  <Field JsonParser _flddelegate>
	//* 153  321:invokevirtual   #81  <Method JsonToken JsonParser.nextToken()>
	//* 154  324:pop             
	//* 155  325:aload_0         
	//* 156  326:getfield        #76  <Field JsonParser _flddelegate>
	//* 157  329:invokevirtual   #106 <Method JsonParser JsonParser.skipChildren()>
	//* 158  332:pop             
	//* 159  333:goto            879
	//* 160  336:aload           4
	//* 161  338:aload_2         
	//* 162  339:invokevirtual   #109 <Method TokenFilter TokenFilter.includeProperty(String)>
	//* 163  342:astore_2        
	//* 164  343:aload_2         
	//* 165  344:ifnonnull       366
	//* 166  347:aload_0         
	//* 167  348:getfield        #76  <Field JsonParser _flddelegate>
	//* 168  351:invokevirtual   #81  <Method JsonToken JsonParser.nextToken()>
	//* 169  354:pop             
	//* 170  355:aload_0         
	//* 171  356:getfield        #76  <Field JsonParser _flddelegate>
	//* 172  359:invokevirtual   #106 <Method JsonParser JsonParser.skipChildren()>
	//* 173  362:pop             
	//* 174  363:goto            879
	//* 175  366:aload_0         
	//* 176  367:aload_2         
	//* 177  368:putfield        #29  <Field TokenFilter _itemFilter>
	//* 178  371:aload_2         
	//* 179  372:getstatic       #94  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 180  375:if_acmpne       415
	//* 181  378:aload_0         
	//* 182  379:invokespecial   #111 <Method boolean _verifyAllowedMatches()>
	//* 183  382:ifeq            399
	//* 184  385:aload_0         
	//* 185  386:getfield        #39  <Field boolean _includePath>
	//* 186  389:ifeq            415
	//* 187  392:aload_0         
	//* 188  393:aload_3         
	//* 189  394:putfield        #83  <Field JsonToken _currToken>
	//* 190  397:aload_3         
	//* 191  398:areturn         
	//* 192  399:aload_0         
	//* 193  400:getfield        #76  <Field JsonParser _flddelegate>
	//* 194  403:invokevirtual   #81  <Method JsonToken JsonParser.nextToken()>
	//* 195  406:pop             
	//* 196  407:aload_0         
	//* 197  408:getfield        #76  <Field JsonParser _flddelegate>
	//* 198  411:invokevirtual   #106 <Method JsonParser JsonParser.skipChildren()>
	//* 199  414:pop             
	//* 200  415:aload_0         
	//* 201  416:getfield        #39  <Field boolean _includePath>
	//* 202  419:ifeq            879
	//* 203  422:aload_0         
	//* 204  423:aload_0         
	//* 205  424:getfield        #37  <Field TokenFilterContext _headContext>
	//* 206  427:invokevirtual   #114 <Method JsonToken _nextTokenWithBuffering(TokenFilterContext)>
	//* 207  430:astore_2        
	//* 208  431:aload_2         
	//* 209  432:ifnull          879
	//* 210  435:aload_0         
	//* 211  436:aload_2         
	//* 212  437:putfield        #83  <Field JsonToken _currToken>
	//* 213  440:aload_2         
	//* 214  441:areturn         
	//* 215  442:aload_0         
	//* 216  443:getfield        #29  <Field TokenFilter _itemFilter>
	//* 217  446:astore_2        
	//* 218  447:aload_2         
	//* 219  448:getstatic       #94  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 220  451:if_acmpne       474
	//* 221  454:aload_0         
	//* 222  455:aload_0         
	//* 223  456:getfield        #37  <Field TokenFilterContext _headContext>
	//* 224  459:aload_2         
	//* 225  460:iconst_1        
	//* 226  461:invokevirtual   #118 <Method TokenFilterContext TokenFilterContext.createChildArrayContext(TokenFilter, boolean)>
	//* 227  464:putfield        #37  <Field TokenFilterContext _headContext>
	//* 228  467:aload_0         
	//* 229  468:aload_3         
	//* 230  469:putfield        #83  <Field JsonToken _currToken>
	//* 231  472:aload_3         
	//* 232  473:areturn         
	//* 233  474:aload_2         
	//* 234  475:ifnonnull       489
	//* 235  478:aload_0         
	//* 236  479:getfield        #76  <Field JsonParser _flddelegate>
	//* 237  482:invokevirtual   #106 <Method JsonParser JsonParser.skipChildren()>
	//* 238  485:pop             
	//* 239  486:goto            879
	//* 240  489:aload_0         
	//* 241  490:getfield        #37  <Field TokenFilterContext _headContext>
	//* 242  493:aload_2         
	//* 243  494:invokevirtual   #122 <Method TokenFilter TokenFilterContext.checkValue(TokenFilter)>
	//* 244  497:astore          4
	//* 245  499:aload           4
	//* 246  501:ifnonnull       515
	//* 247  504:aload_0         
	//* 248  505:getfield        #76  <Field JsonParser _flddelegate>
	//* 249  508:invokevirtual   #106 <Method JsonParser JsonParser.skipChildren()>
	//* 250  511:pop             
	//* 251  512:goto            879
	//* 252  515:aload           4
	//* 253  517:astore_2        
	//* 254  518:aload           4
	//* 255  520:getstatic       #94  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 256  523:if_acmpeq       532
	//* 257  526:aload           4
	//* 258  528:invokevirtual   #126 <Method TokenFilter TokenFilter.filterStartArray()>
	//* 259  531:astore_2        
	//* 260  532:aload_0         
	//* 261  533:aload_2         
	//* 262  534:putfield        #29  <Field TokenFilter _itemFilter>
	//* 263  537:aload_2         
	//* 264  538:getstatic       #94  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 265  541:if_acmpne       564
	//* 266  544:aload_0         
	//* 267  545:aload_0         
	//* 268  546:getfield        #37  <Field TokenFilterContext _headContext>
	//* 269  549:aload_2         
	//* 270  550:iconst_1        
	//* 271  551:invokevirtual   #118 <Method TokenFilterContext TokenFilterContext.createChildArrayContext(TokenFilter, boolean)>
	//* 272  554:putfield        #37  <Field TokenFilterContext _headContext>
	//* 273  557:aload_0         
	//* 274  558:aload_3         
	//* 275  559:putfield        #83  <Field JsonToken _currToken>
	//* 276  562:aload_3         
	//* 277  563:areturn         
	//* 278  564:aload_0         
	//* 279  565:aload_0         
	//* 280  566:getfield        #37  <Field TokenFilterContext _headContext>
	//* 281  569:aload_2         
	//* 282  570:iconst_0        
	//* 283  571:invokevirtual   #118 <Method TokenFilterContext TokenFilterContext.createChildArrayContext(TokenFilter, boolean)>
	//* 284  574:putfield        #37  <Field TokenFilterContext _headContext>
	//* 285  577:aload_0         
	//* 286  578:getfield        #39  <Field boolean _includePath>
	//* 287  581:ifeq            879
	//* 288  584:aload_0         
	//* 289  585:aload_0         
	//* 290  586:getfield        #37  <Field TokenFilterContext _headContext>
	//* 291  589:invokevirtual   #114 <Method JsonToken _nextTokenWithBuffering(TokenFilterContext)>
	//* 292  592:astore_2        
	//* 293  593:aload_2         
	//* 294  594:ifnull          879
	//* 295  597:aload_0         
	//* 296  598:aload_2         
	//* 297  599:putfield        #83  <Field JsonToken _currToken>
	//* 298  602:aload_2         
	//* 299  603:areturn         
	//* 300  604:aload_0         
	//* 301  605:getfield        #37  <Field TokenFilterContext _headContext>
	//* 302  608:invokevirtual   #129 <Method boolean TokenFilterContext.isStartHandled()>
	//* 303  611:istore_1        
	//* 304  612:aload_0         
	//* 305  613:getfield        #37  <Field TokenFilterContext _headContext>
	//* 306  616:invokevirtual   #132 <Method TokenFilter TokenFilterContext.getFilter()>
	//* 307  619:astore_2        
	//* 308  620:aload_2         
	//* 309  621:ifnull          635
	//* 310  624:aload_2         
	//* 311  625:getstatic       #94  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 312  628:if_acmpeq       635
	//* 313  631:aload_2         
	//* 314  632:invokevirtual   #136 <Method void TokenFilter.filterFinishArray()>
	//* 315  635:aload_0         
	//* 316  636:aload_0         
	//* 317  637:getfield        #37  <Field TokenFilterContext _headContext>
	//* 318  640:invokevirtual   #140 <Method TokenFilterContext TokenFilterContext.getParent()>
	//* 319  643:putfield        #37  <Field TokenFilterContext _headContext>
	//* 320  646:aload_0         
	//* 321  647:aload_0         
	//* 322  648:getfield        #37  <Field TokenFilterContext _headContext>
	//* 323  651:invokevirtual   #132 <Method TokenFilter TokenFilterContext.getFilter()>
	//* 324  654:putfield        #29  <Field TokenFilter _itemFilter>
	//* 325  657:iload_1         
	//* 326  658:ifeq            879
	//* 327  661:aload_0         
	//* 328  662:aload_3         
	//* 329  663:putfield        #83  <Field JsonToken _currToken>
	//* 330  666:aload_3         
	//* 331  667:areturn         
	//* 332  668:aload_0         
	//* 333  669:getfield        #29  <Field TokenFilter _itemFilter>
	//* 334  672:astore_2        
	//* 335  673:aload_2         
	//* 336  674:getstatic       #94  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 337  677:if_acmpne       700
	//* 338  680:aload_0         
	//* 339  681:aload_0         
	//* 340  682:getfield        #37  <Field TokenFilterContext _headContext>
	//* 341  685:aload_2         
	//* 342  686:iconst_1        
	//* 343  687:invokevirtual   #143 <Method TokenFilterContext TokenFilterContext.createChildObjectContext(TokenFilter, boolean)>
	//* 344  690:putfield        #37  <Field TokenFilterContext _headContext>
	//* 345  693:aload_0         
	//* 346  694:aload_3         
	//* 347  695:putfield        #83  <Field JsonToken _currToken>
	//* 348  698:aload_3         
	//* 349  699:areturn         
	//* 350  700:aload_2         
	//* 351  701:ifnonnull       715
	//* 352  704:aload_0         
	//* 353  705:getfield        #76  <Field JsonParser _flddelegate>
	//* 354  708:invokevirtual   #106 <Method JsonParser JsonParser.skipChildren()>
	//* 355  711:pop             
	//* 356  712:goto            879
	//* 357  715:aload_0         
	//* 358  716:getfield        #37  <Field TokenFilterContext _headContext>
	//* 359  719:aload_2         
	//* 360  720:invokevirtual   #122 <Method TokenFilter TokenFilterContext.checkValue(TokenFilter)>
	//* 361  723:astore          4
	//* 362  725:aload           4
	//* 363  727:ifnonnull       741
	//* 364  730:aload_0         
	//* 365  731:getfield        #76  <Field JsonParser _flddelegate>
	//* 366  734:invokevirtual   #106 <Method JsonParser JsonParser.skipChildren()>
	//* 367  737:pop             
	//* 368  738:goto            879
	//* 369  741:aload           4
	//* 370  743:astore_2        
	//* 371  744:aload           4
	//* 372  746:getstatic       #94  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 373  749:if_acmpeq       758
	//* 374  752:aload           4
	//* 375  754:invokevirtual   #146 <Method TokenFilter TokenFilter.filterStartObject()>
	//* 376  757:astore_2        
	//* 377  758:aload_0         
	//* 378  759:aload_2         
	//* 379  760:putfield        #29  <Field TokenFilter _itemFilter>
	//* 380  763:aload_2         
	//* 381  764:getstatic       #94  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 382  767:if_acmpne       790
	//* 383  770:aload_0         
	//* 384  771:aload_0         
	//* 385  772:getfield        #37  <Field TokenFilterContext _headContext>
	//* 386  775:aload_2         
	//* 387  776:iconst_1        
	//* 388  777:invokevirtual   #143 <Method TokenFilterContext TokenFilterContext.createChildObjectContext(TokenFilter, boolean)>
	//* 389  780:putfield        #37  <Field TokenFilterContext _headContext>
	//* 390  783:aload_0         
	//* 391  784:aload_3         
	//* 392  785:putfield        #83  <Field JsonToken _currToken>
	//* 393  788:aload_3         
	//* 394  789:areturn         
	//* 395  790:aload_0         
	//* 396  791:aload_0         
	//* 397  792:getfield        #37  <Field TokenFilterContext _headContext>
	//* 398  795:aload_2         
	//* 399  796:iconst_0        
	//* 400  797:invokevirtual   #143 <Method TokenFilterContext TokenFilterContext.createChildObjectContext(TokenFilter, boolean)>
	//* 401  800:putfield        #37  <Field TokenFilterContext _headContext>
	//* 402  803:aload_0         
	//* 403  804:getfield        #39  <Field boolean _includePath>
	//* 404  807:ifeq            879
	//* 405  810:aload_0         
	//* 406  811:aload_0         
	//* 407  812:getfield        #37  <Field TokenFilterContext _headContext>
	//* 408  815:invokevirtual   #114 <Method JsonToken _nextTokenWithBuffering(TokenFilterContext)>
	//* 409  818:astore_2        
	//* 410  819:aload_2         
	//* 411  820:ifnull          879
	//* 412  823:aload_0         
	//* 413  824:aload_2         
	//* 414  825:putfield        #83  <Field JsonToken _currToken>
	//* 415  828:aload_2         
	//* 416  829:areturn         
			if(obj1 == null)
				break;
	//  417  830:aload_2         
	//  418  831:ifnull          879
			obj1 = ((Object) (_headContext.checkValue(((TokenFilter) (obj1)))));
	//  419  834:aload_0         
	//  420  835:getfield        #37  <Field TokenFilterContext _headContext>
	//  421  838:aload_2         
	//  422  839:invokevirtual   #122 <Method TokenFilter TokenFilterContext.checkValue(TokenFilter)>
	//  423  842:astore_2        
			if((obj1 == TokenFilter.INCLUDE_ALL || obj1 != null && ((TokenFilter) (obj1)).includeValue(_flddelegate)) && _verifyAllowedMatches())
	//* 424  843:aload_2         
	//* 425  844:getstatic       #94  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//* 426  847:if_acmpeq       865
	//* 427  850:aload_2         
	//* 428  851:ifnull          879
	//* 429  854:aload_2         
	//* 430  855:aload_0         
	//* 431  856:getfield        #76  <Field JsonParser _flddelegate>
	//* 432  859:invokevirtual   #150 <Method boolean TokenFilter.includeValue(JsonParser)>
	//* 433  862:ifeq            879
	//* 434  865:aload_0         
	//* 435  866:invokespecial   #111 <Method boolean _verifyAllowedMatches()>
	//* 436  869:ifeq            879
			{
				_currToken = ((JsonToken) (obj2));
	//  437  872:aload_0         
	//  438  873:aload_3         
	//  439  874:putfield        #83  <Field JsonToken _currToken>
				return ((JsonToken) (obj2));
	//  440  877:aload_3         
	//  441  878:areturn         
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
					if(obj1 == TokenFilter.INCLUDE_ALL)
						if(_verifyAllowedMatches())
						{
							if(_includePath)
							{
								_currToken = ((JsonToken) (obj2));
								return ((JsonToken) (obj2));
							}
						} else
						{
							_flddelegate.nextToken();
							_flddelegate.skipChildren();
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
	//  442  879:aload_0         
	//  443  880:invokevirtual   #279 <Method JsonToken _nextToken2()>
	//  444  883:areturn         
	}

	public JsonToken nextValue()
		throws IOException
	{
		JsonToken jsontoken1 = nextToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #281 <Method JsonToken nextToken()>
	//    2    4:astore_2        
		JsonToken jsontoken = jsontoken1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(jsontoken1 == JsonToken.FIELD_NAME)
	//*   5    7:aload_2         
	//*   6    8:getstatic       #284 <Field JsonToken JsonToken.FIELD_NAME>
	//*   7   11:if_acmpne       19
			jsontoken = nextToken();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #281 <Method JsonToken nextToken()>
	//   10   18:astore_1        
		return jsontoken;
	//   11   19:aload_1         
	//   12   20:areturn         
	}

	public int readBinaryValue(Base64Variant base64variant, OutputStream outputstream)
		throws IOException
	{
		return _flddelegate.readBinaryValue(base64variant, outputstream);
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field JsonParser _flddelegate>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #288 <Method int JsonParser.readBinaryValue(Base64Variant, OutputStream)>
	//    5    9:ireturn         
	}

	public JsonParser skipChildren()
		throws IOException
	{
		if(_currToken != JsonToken.START_OBJECT && _currToken != JsonToken.START_ARRAY)
	//*   0    0:aload_0         
	//*   1    1:getfield        #83  <Field JsonToken _currToken>
	//*   2    4:getstatic       #177 <Field JsonToken JsonToken.START_OBJECT>
	//*   3    7:if_acmpeq       22
	//*   4   10:aload_0         
	//*   5   11:getfield        #83  <Field JsonToken _currToken>
	//*   6   14:getstatic       #180 <Field JsonToken JsonToken.START_ARRAY>
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
	//   13   25:invokevirtual   #281 <Method JsonToken nextToken()>
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
	//   20   36:invokevirtual   #291 <Method boolean JsonToken.isStructStart()>
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
	//   28   50:invokevirtual   #294 <Method boolean JsonToken.isStructEnd()>
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
