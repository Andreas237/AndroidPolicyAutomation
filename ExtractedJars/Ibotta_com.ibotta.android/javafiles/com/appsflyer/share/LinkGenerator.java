// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appsflyer.share;

import com.appsflyer.AFLogger;
import com.appsflyer.ServerConfigHandler;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.*;

public class LinkGenerator
{

	public LinkGenerator(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		_fld02CB0971 = ((Map) (new HashMap()));
	//    2    4:aload_0         
	//    3    5:new             #27  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #28  <Method void HashMap()>
	//    6   12:putfield        #30  <Field Map _fld02CB0971>
		_fld02CF0971 = ((Map) (new HashMap()));
	//    7   15:aload_0         
	//    8   16:new             #27  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #28  <Method void HashMap()>
	//   11   23:putfield        #32  <Field Map _fld02CF0971>
		_fld02CE = s;
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:putfield        #34  <Field String _fld02CE>
	//   15   31:return          
	}

	private static String _mth02CB(String s, String s1)
	{
		UnsupportedEncodingException unsupportedencodingexception;
		Object obj;
		try
		{
			obj = ((Object) (URLEncoder.encode(s, "utf8")));
	//    0    0:aload_0         
	//    1    1:ldc1            #42  <String "utf8">
	//    2    3:invokestatic    #47  <Method String URLEncoder.encode(String, String)>
	//    3    6:astore_2        
		}
	//*   4    7:aload_2         
	//*   5    8:areturn         
	//*   6    9:ldc1            #49  <String "">
	//*   7   11:areturn         
	//*   8   12:new             #51  <Class StringBuilder>
	//*   9   15:dup             
	//*  10   16:ldc1            #53  <String "Illegal ">
	//*  11   18:invokespecial   #55  <Method void StringBuilder(String)>
	//*  12   21:astore_2        
	//*  13   22:aload_2         
	//*  14   23:aload_1         
	//*  15   24:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//*  16   27:pop             
	//*  17   28:aload_2         
	//*  18   29:ldc1            #61  <String ": ">
	//*  19   31:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//*  20   34:pop             
	//*  21   35:aload_2         
	//*  22   36:aload_0         
	//*  23   37:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//*  24   40:pop             
	//*  25   41:aload_2         
	//*  26   42:invokevirtual   #65  <Method String Object.toString()>
	//*  27   45:invokestatic    #70  <Method void AFLogger.afInfoLog(String)>
	//*  28   48:ldc1            #49  <String "">
	//*  29   50:areturn         
		// Misplaced declaration of an exception variable
		catch(UnsupportedEncodingException unsupportedencodingexception)
		{
			obj = ((Object) (new StringBuilder("Illegal ")));
			((StringBuilder) (obj)).append(s1);
			((StringBuilder) (obj)).append(": ");
			((StringBuilder) (obj)).append(s);
			AFLogger.afInfoLog(obj.toString());
			return "";
		}
	//*  30   51:astore_2        
	//*  31   52:goto            12
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			return "";
		}
		return ((String) (obj));
	//*  32   55:astore_0        
	//*  33   56:goto            9
	}

	private StringBuilder _mth02CB()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #51  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #72  <Method void StringBuilder()>
	//    3    7:astore_2        
		Object obj = ((Object) (_fld141D));
	//    4    8:aload_0         
	//    5    9:getfield        #74  <Field String _fld141D>
	//    6   12:astore_1        
		if(obj != null && ((String) (obj)).startsWith("http"))
	//*   7   13:aload_1         
	//*   8   14:ifnull          38
	//*   9   17:aload_1         
	//*  10   18:ldc1            #76  <String "http">
	//*  11   20:invokevirtual   #82  <Method boolean String.startsWith(String)>
	//*  12   23:ifeq            38
			stringbuilder.append(_fld141D);
	//   13   26:aload_2         
	//   14   27:aload_0         
	//   15   28:getfield        #74  <Field String _fld141D>
	//   16   31:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   17   34:pop             
		else
	//*  18   35:goto            48
			stringbuilder.append(ServerConfigHandler.getUrl("https://app.%s"));
	//   19   38:aload_2         
	//   20   39:ldc1            #84  <String "https://app.%s">
	//   21   41:invokestatic    #90  <Method String ServerConfigHandler.getUrl(String)>
	//   22   44:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   23   47:pop             
		if(_fld02BB != null)
	//*  24   48:aload_0         
	//*  25   49:getfield        #92  <Field String _fld02BB>
	//*  26   52:ifnull          71
		{
			stringbuilder.append('/');
	//   27   55:aload_2         
	//   28   56:bipush          47
	//   29   58:invokevirtual   #95  <Method StringBuilder StringBuilder.append(char)>
	//   30   61:pop             
			stringbuilder.append(_fld02BB);
	//   31   62:aload_2         
	//   32   63:aload_0         
	//   33   64:getfield        #92  <Field String _fld02BB>
	//   34   67:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   35   70:pop             
		}
		_fld02CF0971.put("pid", ((Object) (_fld02CE)));
	//   36   71:aload_0         
	//   37   72:getfield        #32  <Field Map _fld02CF0971>
	//   38   75:ldc1            #97  <String "pid">
	//   39   77:aload_0         
	//   40   78:getfield        #34  <Field String _fld02CE>
	//   41   81:invokeinterface #103 <Method Object Map.put(Object, Object)>
	//   42   86:pop             
		stringbuilder.append('?');
	//   43   87:aload_2         
	//   44   88:bipush          63
	//   45   90:invokevirtual   #95  <Method StringBuilder StringBuilder.append(char)>
	//   46   93:pop             
		stringbuilder.append("pid=");
	//   47   94:aload_2         
	//   48   95:ldc1            #105 <String "pid=">
	//   49   97:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   50  100:pop             
		stringbuilder.append(_mth02CB(_fld02CE, "media source"));
	//   51  101:aload_2         
	//   52  102:aload_0         
	//   53  103:getfield        #34  <Field String _fld02CE>
	//   54  106:ldc1            #107 <String "media source">
	//   55  108:invokestatic    #109 <Method String _mth02CB(String, String)>
	//   56  111:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   57  114:pop             
		obj = ((Object) (_fld02CB));
	//   58  115:aload_0         
	//   59  116:getfield        #111 <Field String _fld02CB>
	//   60  119:astore_1        
		if(obj != null)
	//*  61  120:aload_1         
	//*  62  121:ifnull          165
		{
			_fld02CF0971.put("af_referrer_uid", obj);
	//   63  124:aload_0         
	//   64  125:getfield        #32  <Field Map _fld02CF0971>
	//   65  128:ldc1            #113 <String "af_referrer_uid">
	//   66  130:aload_1         
	//   67  131:invokeinterface #103 <Method Object Map.put(Object, Object)>
	//   68  136:pop             
			stringbuilder.append('&');
	//   69  137:aload_2         
	//   70  138:bipush          38
	//   71  140:invokevirtual   #95  <Method StringBuilder StringBuilder.append(char)>
	//   72  143:pop             
			stringbuilder.append("af_referrer_uid=");
	//   73  144:aload_2         
	//   74  145:ldc1            #115 <String "af_referrer_uid=">
	//   75  147:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   76  150:pop             
			stringbuilder.append(_mth02CB(_fld02CB, "referrerUID"));
	//   77  151:aload_2         
	//   78  152:aload_0         
	//   79  153:getfield        #111 <Field String _fld02CB>
	//   80  156:ldc1            #117 <String "referrerUID">
	//   81  158:invokestatic    #109 <Method String _mth02CB(String, String)>
	//   82  161:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   83  164:pop             
		}
		obj = ((Object) (_fld0971));
	//   84  165:aload_0         
	//   85  166:getfield        #119 <Field String _fld0971>
	//   86  169:astore_1        
		if(obj != null)
	//*  87  170:aload_1         
	//*  88  171:ifnull          215
		{
			_fld02CF0971.put("af_channel", obj);
	//   89  174:aload_0         
	//   90  175:getfield        #32  <Field Map _fld02CF0971>
	//   91  178:ldc1            #121 <String "af_channel">
	//   92  180:aload_1         
	//   93  181:invokeinterface #103 <Method Object Map.put(Object, Object)>
	//   94  186:pop             
			stringbuilder.append('&');
	//   95  187:aload_2         
	//   96  188:bipush          38
	//   97  190:invokevirtual   #95  <Method StringBuilder StringBuilder.append(char)>
	//   98  193:pop             
			stringbuilder.append("af_channel=");
	//   99  194:aload_2         
	//  100  195:ldc1            #123 <String "af_channel=">
	//  101  197:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//  102  200:pop             
			stringbuilder.append(_mth02CB(_fld0971, "channel"));
	//  103  201:aload_2         
	//  104  202:aload_0         
	//  105  203:getfield        #119 <Field String _fld0971>
	//  106  206:ldc1            #125 <String "channel">
	//  107  208:invokestatic    #109 <Method String _mth02CB(String, String)>
	//  108  211:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//  109  214:pop             
		}
		obj = ((Object) (_fld02CF));
	//  110  215:aload_0         
	//  111  216:getfield        #127 <Field String _fld02CF>
	//  112  219:astore_1        
		if(obj != null)
	//* 113  220:aload_1         
	//* 114  221:ifnull          265
		{
			_fld02CF0971.put("af_referrer_customer_id", obj);
	//  115  224:aload_0         
	//  116  225:getfield        #32  <Field Map _fld02CF0971>
	//  117  228:ldc1            #129 <String "af_referrer_customer_id">
	//  118  230:aload_1         
	//  119  231:invokeinterface #103 <Method Object Map.put(Object, Object)>
	//  120  236:pop             
			stringbuilder.append('&');
	//  121  237:aload_2         
	//  122  238:bipush          38
	//  123  240:invokevirtual   #95  <Method StringBuilder StringBuilder.append(char)>
	//  124  243:pop             
			stringbuilder.append("af_referrer_customer_id=");
	//  125  244:aload_2         
	//  126  245:ldc1            #131 <String "af_referrer_customer_id=">
	//  127  247:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//  128  250:pop             
			stringbuilder.append(_mth02CB(_fld02CF, "referrerCustomerId"));
	//  129  251:aload_2         
	//  130  252:aload_0         
	//  131  253:getfield        #127 <Field String _fld02CF>
	//  132  256:ldc1            #133 <String "referrerCustomerId">
	//  133  258:invokestatic    #109 <Method String _mth02CB(String, String)>
	//  134  261:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//  135  264:pop             
		}
		obj = ((Object) (_fld02CA));
	//  136  265:aload_0         
	//  137  266:getfield        #135 <Field String _fld02CA>
	//  138  269:astore_1        
		if(obj != null)
	//* 139  270:aload_1         
	//* 140  271:ifnull          315
		{
			_fld02CF0971.put("c", obj);
	//  141  274:aload_0         
	//  142  275:getfield        #32  <Field Map _fld02CF0971>
	//  143  278:ldc1            #137 <String "c">
	//  144  280:aload_1         
	//  145  281:invokeinterface #103 <Method Object Map.put(Object, Object)>
	//  146  286:pop             
			stringbuilder.append('&');
	//  147  287:aload_2         
	//  148  288:bipush          38
	//  149  290:invokevirtual   #95  <Method StringBuilder StringBuilder.append(char)>
	//  150  293:pop             
			stringbuilder.append("c=");
	//  151  294:aload_2         
	//  152  295:ldc1            #139 <String "c=">
	//  153  297:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//  154  300:pop             
			stringbuilder.append(_mth02CB(_fld02CA, "campaign"));
	//  155  301:aload_2         
	//  156  302:aload_0         
	//  157  303:getfield        #135 <Field String _fld02CA>
	//  158  306:ldc1            #141 <String "campaign">
	//  159  308:invokestatic    #109 <Method String _mth02CB(String, String)>
	//  160  311:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//  161  314:pop             
		}
		obj = ((Object) (_fld02BD));
	//  162  315:aload_0         
	//  163  316:getfield        #143 <Field String _fld02BD>
	//  164  319:astore_1        
		if(obj != null)
	//* 165  320:aload_1         
	//* 166  321:ifnull          365
		{
			_fld02CF0971.put("af_referrer_name", obj);
	//  167  324:aload_0         
	//  168  325:getfield        #32  <Field Map _fld02CF0971>
	//  169  328:ldc1            #145 <String "af_referrer_name">
	//  170  330:aload_1         
	//  171  331:invokeinterface #103 <Method Object Map.put(Object, Object)>
	//  172  336:pop             
			stringbuilder.append('&');
	//  173  337:aload_2         
	//  174  338:bipush          38
	//  175  340:invokevirtual   #95  <Method StringBuilder StringBuilder.append(char)>
	//  176  343:pop             
			stringbuilder.append("af_referrer_name=");
	//  177  344:aload_2         
	//  178  345:ldc1            #147 <String "af_referrer_name=">
	//  179  347:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//  180  350:pop             
			stringbuilder.append(_mth02CB(_fld02BD, "referrerName"));
	//  181  351:aload_2         
	//  182  352:aload_0         
	//  183  353:getfield        #143 <Field String _fld02BD>
	//  184  356:ldc1            #149 <String "referrerName">
	//  185  358:invokestatic    #109 <Method String _mth02CB(String, String)>
	//  186  361:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//  187  364:pop             
		}
		obj = ((Object) (_fld09710971));
	//  188  365:aload_0         
	//  189  366:getfield        #151 <Field String _fld09710971>
	//  190  369:astore_1        
		if(obj != null)
	//* 191  370:aload_1         
	//* 192  371:ifnull          415
		{
			_fld02CF0971.put("af_referrer_image_url", obj);
	//  193  374:aload_0         
	//  194  375:getfield        #32  <Field Map _fld02CF0971>
	//  195  378:ldc1            #153 <String "af_referrer_image_url">
	//  196  380:aload_1         
	//  197  381:invokeinterface #103 <Method Object Map.put(Object, Object)>
	//  198  386:pop             
			stringbuilder.append('&');
	//  199  387:aload_2         
	//  200  388:bipush          38
	//  201  390:invokevirtual   #95  <Method StringBuilder StringBuilder.append(char)>
	//  202  393:pop             
			stringbuilder.append("af_referrer_image_url=");
	//  203  394:aload_2         
	//  204  395:ldc1            #155 <String "af_referrer_image_url=">
	//  205  397:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//  206  400:pop             
			stringbuilder.append(_mth02CB(_fld09710971, "referrerImageURL"));
	//  207  401:aload_2         
	//  208  402:aload_0         
	//  209  403:getfield        #151 <Field String _fld09710971>
	//  210  406:ldc1            #157 <String "referrerImageURL">
	//  211  408:invokestatic    #109 <Method String _mth02CB(String, String)>
	//  212  411:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//  213  414:pop             
		}
		if(_fld02CA0971 != null)
	//* 214  415:aload_0         
	//* 215  416:getfield        #159 <Field String _fld02CA0971>
	//* 216  419:ifnull          573
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//  217  422:new             #51  <Class StringBuilder>
	//  218  425:dup             
	//  219  426:invokespecial   #72  <Method void StringBuilder()>
	//  220  429:astore_3        
			stringbuilder1.append(_fld02CA0971);
	//  221  430:aload_3         
	//  222  431:aload_0         
	//  223  432:getfield        #159 <Field String _fld02CA0971>
	//  224  435:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//  225  438:pop             
			if(_fld02CA0971.endsWith("/"))
	//* 226  439:aload_0         
	//* 227  440:getfield        #159 <Field String _fld02CA0971>
	//* 228  443:ldc1            #161 <String "/">
	//* 229  445:invokevirtual   #164 <Method boolean String.endsWith(String)>
	//* 230  448:ifeq            457
				obj = "";
	//  231  451:ldc1            #49  <String "">
	//  232  453:astore_1        
			else
	//* 233  454:goto            460
				obj = "/";
	//  234  457:ldc1            #161 <String "/">
	//  235  459:astore_1        
			stringbuilder1.append(((String) (obj)));
	//  236  460:aload_3         
	//  237  461:aload_1         
	//  238  462:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//  239  465:pop             
			obj = ((Object) (_fld02BC));
	//  240  466:aload_0         
	//  241  467:getfield        #166 <Field String _fld02BC>
	//  242  470:astore_1        
			if(obj != null)
	//* 243  471:aload_1         
	//* 244  472:ifnull          481
				stringbuilder1.append(((String) (obj)));
	//  245  475:aload_3         
	//  246  476:aload_1         
	//  247  477:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//  248  480:pop             
			_fld02CF0971.put("af_dp", ((Object) (((Object) (stringbuilder1)).toString())));
	//  249  481:aload_0         
	//  250  482:getfield        #32  <Field Map _fld02CF0971>
	//  251  485:ldc1            #168 <String "af_dp">
	//  252  487:aload_3         
	//  253  488:invokevirtual   #65  <Method String Object.toString()>
	//  254  491:invokeinterface #103 <Method Object Map.put(Object, Object)>
	//  255  496:pop             
			stringbuilder.append('&');
	//  256  497:aload_2         
	//  257  498:bipush          38
	//  258  500:invokevirtual   #95  <Method StringBuilder StringBuilder.append(char)>
	//  259  503:pop             
			stringbuilder.append("af_dp=");
	//  260  504:aload_2         
	//  261  505:ldc1            #170 <String "af_dp=">
	//  262  507:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//  263  510:pop             
			stringbuilder.append(_mth02CB(_fld02CA0971, "baseDeeplink"));
	//  264  511:aload_2         
	//  265  512:aload_0         
	//  266  513:getfield        #159 <Field String _fld02CA0971>
	//  267  516:ldc1            #172 <String "baseDeeplink">
	//  268  518:invokestatic    #109 <Method String _mth02CB(String, String)>
	//  269  521:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//  270  524:pop             
			if(_fld02BC != null)
	//* 271  525:aload_0         
	//* 272  526:getfield        #166 <Field String _fld02BC>
	//* 273  529:ifnull          573
			{
				if(_fld02CA0971.endsWith("/"))
	//* 274  532:aload_0         
	//* 275  533:getfield        #159 <Field String _fld02CA0971>
	//* 276  536:ldc1            #161 <String "/">
	//* 277  538:invokevirtual   #164 <Method boolean String.endsWith(String)>
	//* 278  541:ifeq            550
					obj = "";
	//  279  544:ldc1            #49  <String "">
	//  280  546:astore_1        
				else
	//* 281  547:goto            553
					obj = "%2F";
	//  282  550:ldc1            #174 <String "%2F">
	//  283  552:astore_1        
				stringbuilder.append(((String) (obj)));
	//  284  553:aload_2         
	//  285  554:aload_1         
	//  286  555:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//  287  558:pop             
				stringbuilder.append(_mth02CB(_fld02BC, "deeplinkPath"));
	//  288  559:aload_2         
	//  289  560:aload_0         
	//  290  561:getfield        #166 <Field String _fld02BC>
	//  291  564:ldc1            #176 <String "deeplinkPath">
	//  292  566:invokestatic    #109 <Method String _mth02CB(String, String)>
	//  293  569:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//  294  572:pop             
			}
		}
		obj = ((Object) (_fld02CB0971.keySet().iterator()));
	//  295  573:aload_0         
	//  296  574:getfield        #30  <Field Map _fld02CB0971>
	//  297  577:invokeinterface #180 <Method Set Map.keySet()>
	//  298  582:invokeinterface #186 <Method Iterator Set.iterator()>
	//  299  587:astore_1        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//  300  588:aload_1         
	//  301  589:invokeinterface #192 <Method boolean Iterator.hasNext()>
	//  302  594:ifeq            718
			String s = (String)((Iterator) (obj)).next();
	//  303  597:aload_1         
	//  304  598:invokeinterface #196 <Method Object Iterator.next()>
	//  305  603:checkcast       #78  <Class String>
	//  306  606:astore_3        
			String s1 = ((Object) (stringbuilder)).toString();
	//  307  607:aload_2         
	//  308  608:invokevirtual   #65  <Method String Object.toString()>
	//  309  611:astore          4
			StringBuilder stringbuilder2 = new StringBuilder();
	//  310  613:new             #51  <Class StringBuilder>
	//  311  616:dup             
	//  312  617:invokespecial   #72  <Method void StringBuilder()>
	//  313  620:astore          5
			stringbuilder2.append(s);
	//  314  622:aload           5
	//  315  624:aload_3         
	//  316  625:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//  317  628:pop             
			stringbuilder2.append("=");
	//  318  629:aload           5
	//  319  631:ldc1            #198 <String "=">
	//  320  633:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//  321  636:pop             
			stringbuilder2.append(_mth02CB((String)_fld02CB0971.get(((Object) (s))), s));
	//  322  637:aload           5
	//  323  639:aload_0         
	//  324  640:getfield        #30  <Field Map _fld02CB0971>
	//  325  643:aload_3         
	//  326  644:invokeinterface #202 <Method Object Map.get(Object)>
	//  327  649:checkcast       #78  <Class String>
	//  328  652:aload_3         
	//  329  653:invokestatic    #109 <Method String _mth02CB(String, String)>
	//  330  656:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//  331  659:pop             
			if(!s1.contains(((CharSequence) (((Object) (stringbuilder2)).toString()))))
	//* 332  660:aload           4
	//* 333  662:aload           5
	//* 334  664:invokevirtual   #65  <Method String Object.toString()>
	//* 335  667:invokevirtual   #206 <Method boolean String.contains(CharSequence)>
	//* 336  670:ifne            588
			{
				stringbuilder.append('&');
	//  337  673:aload_2         
	//  338  674:bipush          38
	//  339  676:invokevirtual   #95  <Method StringBuilder StringBuilder.append(char)>
	//  340  679:pop             
				stringbuilder.append(s);
	//  341  680:aload_2         
	//  342  681:aload_3         
	//  343  682:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//  344  685:pop             
				stringbuilder.append('=');
	//  345  686:aload_2         
	//  346  687:bipush          61
	//  347  689:invokevirtual   #95  <Method StringBuilder StringBuilder.append(char)>
	//  348  692:pop             
				stringbuilder.append(_mth02CB((String)_fld02CB0971.get(((Object) (s))), s));
	//  349  693:aload_2         
	//  350  694:aload_0         
	//  351  695:getfield        #30  <Field Map _fld02CB0971>
	//  352  698:aload_3         
	//  353  699:invokeinterface #202 <Method Object Map.get(Object)>
	//  354  704:checkcast       #78  <Class String>
	//  355  707:aload_3         
	//  356  708:invokestatic    #109 <Method String _mth02CB(String, String)>
	//  357  711:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//  358  714:pop             
			}
		} while(true);
	//  359  715:goto            588
		return stringbuilder;
	//  360  718:aload_2         
	//  361  719:areturn         
	}

	public LinkGenerator addParameter(String s, String s1)
	{
		_fld02CB0971.put(((Object) (s)), ((Object) (s1)));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Map _fld02CB0971>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #103 <Method Object Map.put(Object, Object)>
	//    5   11:pop             
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public LinkGenerator addParameters(Map map)
	{
		if(map != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          14
			_fld02CB0971.putAll(map);
	//    2    4:aload_0         
	//    3    5:getfield        #30  <Field Map _fld02CB0971>
	//    4    8:aload_1         
	//    5    9:invokeinterface #214 <Method void Map.putAll(Map)>
		return this;
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public String generateLink()
	{
		return ((Object) (_mth02CB())).toString();
	//    0    0:aload_0         
	//    1    1:invokespecial   #219 <Method StringBuilder _mth02CB()>
	//    2    4:invokevirtual   #65  <Method String Object.toString()>
	//    3    7:areturn         
	}

	public LinkGenerator setBaseURL(String s, String s1, String s2)
	{
label0:
		{
label1:
			{
				if(s == null || s.length() <= 0)
	//*   0    0:aload_1         
	//*   1    1:ifnull          54
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #225 <Method int String.length()>
	//*   4    8:ifgt            14
					break label0;
	//    5   11:goto            54
				if(s1 != null)
	//*   6   14:aload_2         
	//*   7   15:ifnull          28
				{
					s2 = s1;
	//    8   18:aload_2         
	//    9   19:astore_3        
					if(s1.length() >= 5)
						break label1;
	//   10   20:aload_2         
	//   11   21:invokevirtual   #225 <Method int String.length()>
	//   12   24:iconst_5        
	//   13   25:icmpge          31
				}
				s2 = "go.onelink.me";
	//   14   28:ldc1            #227 <String "go.onelink.me">
	//   15   30:astore_3        
			}
			_fld141D = String.format("https://%s/%s", new Object[] {
				s2, s
			});
	//   16   31:aload_0         
	//   17   32:ldc1            #229 <String "https://%s/%s">
	//   18   34:iconst_2        
	//   19   35:anewarray       Object[]
	//   20   38:dup             
	//   21   39:iconst_0        
	//   22   40:aload_3         
	//   23   41:aastore         
	//   24   42:dup             
	//   25   43:iconst_1        
	//   26   44:aload_1         
	//   27   45:aastore         
	//   28   46:invokestatic    #233 <Method String String.format(String, Object[])>
	//   29   49:putfield        #74  <Field String _fld141D>
			return this;
	//   30   52:aload_0         
	//   31   53:areturn         
		}
		_fld141D = String.format("https://%s/%s", new Object[] {
			ServerConfigHandler.getUrl("app.%s"), s2
		});
	//   32   54:aload_0         
	//   33   55:ldc1            #229 <String "https://%s/%s">
	//   34   57:iconst_2        
	//   35   58:anewarray       Object[]
	//   36   61:dup             
	//   37   62:iconst_0        
	//   38   63:ldc1            #235 <String "app.%s">
	//   39   65:invokestatic    #90  <Method String ServerConfigHandler.getUrl(String)>
	//   40   68:aastore         
	//   41   69:dup             
	//   42   70:iconst_1        
	//   43   71:aload_3         
	//   44   72:aastore         
	//   45   73:invokestatic    #233 <Method String String.format(String, Object[])>
	//   46   76:putfield        #74  <Field String _fld141D>
		return this;
	//   47   79:aload_0         
	//   48   80:areturn         
	}

	public LinkGenerator setReferrerCustomerId(String s)
	{
		_fld02CF = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #127 <Field String _fld02CF>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private String _fld02BB;
	private String _fld02BC;
	private String _fld02BD;
	private String _fld02CA;
	private String _fld02CA0971;
	private String _fld02CB;
	private Map _fld02CB0971;
	private String _fld02CE;
	private String _fld02CF;
	private Map _fld02CF0971;
	private String _fld0971;
	private String _fld09710971;
	private String _fld141D;
}
