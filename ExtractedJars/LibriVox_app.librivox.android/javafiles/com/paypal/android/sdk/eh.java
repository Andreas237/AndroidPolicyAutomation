// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.paypal.android.sdk;

import java.math.BigDecimal;
import java.util.*;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.paypal.android.sdk:
//			eu, cj, cd, er, 
//			es, dl, dh, p, 
//			ca, ab

public final class eh extends eu
{

	public eh(ca ca, ab ab, String s, String s1, String s2, er er1, Map map, 
			es aes[], String s3, boolean flag, String s4, String s5, String s6, boolean flag1)
	{
		super(cj.g, ca, ab, s);
	//    0    0:aload_0         
	//    1    1:getstatic       #34  <Field cj cj.g>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokespecial   #37  <Method void eu(cj, ca, ab, String)>
		f = er1;
	//    6   10:aload_0         
	//    7   11:aload           6
	//    8   13:putfield        #39  <Field er f>
		g = map;
	//    9   16:aload_0         
	//   10   17:aload           7
	//   11   19:putfield        #41  <Field Map g>
		h = aes;
	//   12   22:aload_0         
	//   13   23:aload           8
	//   14   25:putfield        #43  <Field es[] h>
		i = s3;
	//   15   28:aload_0         
	//   16   29:aload           9
	//   17   31:putfield        #45  <Field String i>
		l = flag1;
	//   18   34:aload_0         
	//   19   35:iload           14
	//   20   37:putfield        #47  <Field boolean l>
		k = s6;
	//   21   40:aload_0         
	//   22   41:aload           13
	//   23   43:putfield        #49  <Field String k>
		if(cd.a(((CharSequence) (k))))
	//*  24   46:aload_0         
	//*  25   47:getfield        #49  <Field String k>
	//*  26   50:invokestatic    #54  <Method boolean cd.a(CharSequence)>
	//*  27   53:ifeq            62
			k = "sale";
	//   28   56:aload_0         
	//   29   57:ldc1            #56  <String "sale">
	//   30   59:putfield        #49  <Field String k>
		k = k.toLowerCase(Locale.US);
	//   31   62:aload_0         
	//   32   63:aload_0         
	//   33   64:getfield        #49  <Field String k>
	//   34   67:getstatic       #62  <Field Locale Locale.US>
	//   35   70:invokevirtual   #68  <Method String String.toLowerCase(Locale)>
	//   36   73:putfield        #49  <Field String k>
		a("PayPal-Request-Id", s1);
	//   37   76:aload_0         
	//   38   77:ldc1            #70  <String "PayPal-Request-Id">
	//   39   79:aload           4
	//   40   81:invokevirtual   #73  <Method void a(String, String)>
		if(cd.b(((CharSequence) (s4))))
	//*  41   84:aload           11
	//*  42   86:invokestatic    #75  <Method boolean cd.b(CharSequence)>
	//*  43   89:ifeq            100
			a("PayPal-Partner-Attribution-Id", s4);
	//   44   92:aload_0         
	//   45   93:ldc1            #77  <String "PayPal-Partner-Attribution-Id">
	//   46   95:aload           11
	//   47   97:invokevirtual   #73  <Method void a(String, String)>
		if(cd.b(((CharSequence) (s5))))
	//*  48  100:aload           12
	//*  49  102:invokestatic    #75  <Method boolean cd.b(CharSequence)>
	//*  50  105:ifeq            116
			a("PayPal-Client-Metadata-Id", s5);
	//   51  108:aload_0         
	//   52  109:ldc1            #79  <String "PayPal-Client-Metadata-Id">
	//   53  111:aload           12
	//   54  113:invokevirtual   #73  <Method void a(String, String)>
	//   55  116:return          
	}

	public final eh a(boolean flag)
	{
		j = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #83  <Field boolean j>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final String b()
	{
		JSONObject jsonobject2 = new JSONObject();
	//    0    0:new             #86  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #89  <Method void JSONObject()>
	//    3    7:astore_3        
		jsonobject2.accumulate("intent", ((Object) (k)));
	//    4    8:aload_3         
	//    5    9:ldc1            #91  <String "intent">
	//    6   11:aload_0         
	//    7   12:getfield        #49  <Field String k>
	//    8   15:invokevirtual   #95  <Method JSONObject JSONObject.accumulate(String, Object)>
	//    9   18:pop             
		Object obj = ((Object) (new JSONObject()));
	//   10   19:new             #86  <Class JSONObject>
	//   11   22:dup             
	//   12   23:invokespecial   #89  <Method void JSONObject()>
	//   13   26:astore_1        
		((JSONObject) (obj)).accumulate("payment_method", "paypal");
	//   14   27:aload_1         
	//   15   28:ldc1            #97  <String "payment_method">
	//   16   30:ldc1            #99  <String "paypal">
	//   17   32:invokevirtual   #95  <Method JSONObject JSONObject.accumulate(String, Object)>
	//   18   35:pop             
		jsonobject2.accumulate("payer", obj);
	//   19   36:aload_3         
	//   20   37:ldc1            #101 <String "payer">
	//   21   39:aload_1         
	//   22   40:invokevirtual   #95  <Method JSONObject JSONObject.accumulate(String, Object)>
	//   23   43:pop             
		obj = ((Object) (new JSONObject()));
	//   24   44:new             #86  <Class JSONObject>
	//   25   47:dup             
	//   26   48:invokespecial   #89  <Method void JSONObject()>
	//   27   51:astore_1        
		((JSONObject) (obj)).accumulate("cancel_url", "http://cancelurl");
	//   28   52:aload_1         
	//   29   53:ldc1            #103 <String "cancel_url">
	//   30   55:ldc1            #105 <String "http://cancelurl">
	//   31   57:invokevirtual   #95  <Method JSONObject JSONObject.accumulate(String, Object)>
	//   32   60:pop             
		((JSONObject) (obj)).accumulate("return_url", "http://returnurl");
	//   33   61:aload_1         
	//   34   62:ldc1            #107 <String "return_url">
	//   35   64:ldc1            #109 <String "http://returnurl">
	//   36   66:invokevirtual   #95  <Method JSONObject JSONObject.accumulate(String, Object)>
	//   37   69:pop             
		jsonobject2.accumulate("redirect_urls", obj);
	//   38   70:aload_3         
	//   39   71:ldc1            #111 <String "redirect_urls">
	//   40   73:aload_1         
	//   41   74:invokevirtual   #95  <Method JSONObject JSONObject.accumulate(String, Object)>
	//   42   77:pop             
		obj = ((Object) (f));
	//   43   78:aload_0         
	//   44   79:getfield        #39  <Field er f>
	//   45   82:astore_1        
		JSONObject jsonobject3 = new JSONObject();
	//   46   83:new             #86  <Class JSONObject>
	//   47   86:dup             
	//   48   87:invokespecial   #89  <Method void JSONObject()>
	//   49   90:astore          4
		jsonobject3.accumulate("currency", ((Object) (((er) (obj)).b().getCurrencyCode())));
	//   50   92:aload           4
	//   51   94:ldc1            #113 <String "currency">
	//   52   96:aload_1         
	//   53   97:invokevirtual   #118 <Method Currency er.b()>
	//   54  100:invokevirtual   #123 <Method String Currency.getCurrencyCode()>
	//   55  103:invokevirtual   #95  <Method JSONObject JSONObject.accumulate(String, Object)>
	//   56  106:pop             
		jsonobject3.accumulate("total", ((Object) (((er) (obj)).a().toPlainString())));
	//   57  107:aload           4
	//   58  109:ldc1            #125 <String "total">
	//   59  111:aload_1         
	//   60  112:invokevirtual   #128 <Method BigDecimal er.a()>
	//   61  115:invokevirtual   #133 <Method String BigDecimal.toPlainString()>
	//   62  118:invokevirtual   #95  <Method JSONObject JSONObject.accumulate(String, Object)>
	//   63  121:pop             
		obj = ((Object) (g));
	//   64  122:aload_0         
	//   65  123:getfield        #41  <Field Map g>
	//   66  126:astore_1        
		if(obj != null && !((Map) (obj)).isEmpty())
	//*  67  127:aload_1         
	//*  68  128:ifnull          283
	//*  69  131:aload_1         
	//*  70  132:invokeinterface #139 <Method boolean Map.isEmpty()>
	//*  71  137:ifne            283
		{
			obj = ((Object) (g));
	//   72  140:aload_0         
	//   73  141:getfield        #41  <Field Map g>
	//   74  144:astore_1        
			if(obj != null && !((Map) (obj)).isEmpty())
	//*  75  145:aload_1         
	//*  76  146:ifnull          272
	//*  77  149:aload_1         
	//*  78  150:invokeinterface #139 <Method boolean Map.isEmpty()>
	//*  79  155:ifeq            161
	//*  80  158:goto            272
			{
				JSONObject jsonobject = new JSONObject();
	//   81  161:new             #86  <Class JSONObject>
	//   82  164:dup             
	//   83  165:invokespecial   #89  <Method void JSONObject()>
	//   84  168:astore_2        
				if(g.containsKey("shipping"))
	//*  85  169:aload_0         
	//*  86  170:getfield        #41  <Field Map g>
	//*  87  173:ldc1            #141 <String "shipping">
	//*  88  175:invokeinterface #145 <Method boolean Map.containsKey(Object)>
	//*  89  180:ifeq            201
					jsonobject.accumulate("shipping", g.get("shipping"));
	//   90  183:aload_2         
	//   91  184:ldc1            #141 <String "shipping">
	//   92  186:aload_0         
	//   93  187:getfield        #41  <Field Map g>
	//   94  190:ldc1            #141 <String "shipping">
	//   95  192:invokeinterface #149 <Method Object Map.get(Object)>
	//   96  197:invokevirtual   #95  <Method JSONObject JSONObject.accumulate(String, Object)>
	//   97  200:pop             
				if(g.containsKey("subtotal"))
	//*  98  201:aload_0         
	//*  99  202:getfield        #41  <Field Map g>
	//* 100  205:ldc1            #151 <String "subtotal">
	//* 101  207:invokeinterface #145 <Method boolean Map.containsKey(Object)>
	//* 102  212:ifeq            233
					jsonobject.accumulate("subtotal", g.get("subtotal"));
	//  103  215:aload_2         
	//  104  216:ldc1            #151 <String "subtotal">
	//  105  218:aload_0         
	//  106  219:getfield        #41  <Field Map g>
	//  107  222:ldc1            #151 <String "subtotal">
	//  108  224:invokeinterface #149 <Method Object Map.get(Object)>
	//  109  229:invokevirtual   #95  <Method JSONObject JSONObject.accumulate(String, Object)>
	//  110  232:pop             
				obj = ((Object) (jsonobject));
	//  111  233:aload_2         
	//  112  234:astore_1        
				if(g.containsKey("tax"))
	//* 113  235:aload_0         
	//* 114  236:getfield        #41  <Field Map g>
	//* 115  239:ldc1            #153 <String "tax">
	//* 116  241:invokeinterface #145 <Method boolean Map.containsKey(Object)>
	//* 117  246:ifeq            274
				{
					jsonobject.accumulate("tax", g.get("tax"));
	//  118  249:aload_2         
	//  119  250:ldc1            #153 <String "tax">
	//  120  252:aload_0         
	//  121  253:getfield        #41  <Field Map g>
	//  122  256:ldc1            #153 <String "tax">
	//  123  258:invokeinterface #149 <Method Object Map.get(Object)>
	//  124  263:invokevirtual   #95  <Method JSONObject JSONObject.accumulate(String, Object)>
	//  125  266:pop             
					obj = ((Object) (jsonobject));
	//  126  267:aload_2         
	//  127  268:astore_1        
				}
			} else
	//* 128  269:goto            274
			{
				obj = null;
	//  129  272:aconst_null     
	//  130  273:astore_1        
			}
			jsonobject3.accumulate("details", obj);
	//  131  274:aload           4
	//  132  276:ldc1            #155 <String "details">
	//  133  278:aload_1         
	//  134  279:invokevirtual   #95  <Method JSONObject JSONObject.accumulate(String, Object)>
	//  135  282:pop             
		}
		obj = ((Object) (new JSONObject()));
	//  136  283:new             #86  <Class JSONObject>
	//  137  286:dup             
	//  138  287:invokespecial   #89  <Method void JSONObject()>
	//  139  290:astore_1        
		((JSONObject) (obj)).accumulate("amount", ((Object) (jsonobject3)));
	//  140  291:aload_1         
	//  141  292:ldc1            #157 <String "amount">
	//  142  294:aload           4
	//  143  296:invokevirtual   #95  <Method JSONObject JSONObject.accumulate(String, Object)>
	//  144  299:pop             
		((JSONObject) (obj)).accumulate("description", ((Object) (i)));
	//  145  300:aload_1         
	//  146  301:ldc1            #159 <String "description">
	//  147  303:aload_0         
	//  148  304:getfield        #45  <Field String i>
	//  149  307:invokevirtual   #95  <Method JSONObject JSONObject.accumulate(String, Object)>
	//  150  310:pop             
		es aes[] = h;
	//  151  311:aload_0         
	//  152  312:getfield        #43  <Field es[] h>
	//  153  315:astore_2        
		if(aes != null && aes.length > 0)
	//* 154  316:aload_2         
	//* 155  317:ifnull          355
	//* 156  320:aload_2         
	//* 157  321:arraylength     
	//* 158  322:ifle            355
		{
			JSONObject jsonobject1 = new JSONObject();
	//  159  325:new             #86  <Class JSONObject>
	//  160  328:dup             
	//  161  329:invokespecial   #89  <Method void JSONObject()>
	//  162  332:astore_2        
			jsonobject1.accumulate("items", ((Object) (es.a(h))));
	//  163  333:aload_2         
	//  164  334:ldc1            #161 <String "items">
	//  165  336:aload_0         
	//  166  337:getfield        #43  <Field es[] h>
	//  167  340:invokestatic    #166 <Method JSONArray es.a(es[])>
	//  168  343:invokevirtual   #95  <Method JSONObject JSONObject.accumulate(String, Object)>
	//  169  346:pop             
			((JSONObject) (obj)).accumulate("item_list", ((Object) (jsonobject1)));
	//  170  347:aload_1         
	//  171  348:ldc1            #168 <String "item_list">
	//  172  350:aload_2         
	//  173  351:invokevirtual   #95  <Method JSONObject JSONObject.accumulate(String, Object)>
	//  174  354:pop             
		}
		Object obj1 = ((Object) (new JSONArray()));
	//  175  355:new             #170 <Class JSONArray>
	//  176  358:dup             
	//  177  359:invokespecial   #171 <Method void JSONArray()>
	//  178  362:astore_2        
		((JSONArray) (obj1)).put(obj);
	//  179  363:aload_2         
	//  180  364:aload_1         
	//  181  365:invokevirtual   #175 <Method JSONArray JSONArray.put(Object)>
	//  182  368:pop             
		jsonobject2.accumulate("transactions", obj1);
	//  183  369:aload_3         
	//  184  370:ldc1            #177 <String "transactions">
	//  185  372:aload_2         
	//  186  373:invokevirtual   #95  <Method JSONObject JSONObject.accumulate(String, Object)>
	//  187  376:pop             
		if(cd.b(((CharSequence) (m))))
	//* 188  377:aload_0         
	//* 189  378:getfield        #179 <Field String m>
	//* 190  381:invokestatic    #75  <Method boolean cd.b(CharSequence)>
	//* 191  384:ifeq            398
			((JSONObject) (obj)).accumulate("invoice_number", ((Object) (m)));
	//  192  387:aload_1         
	//  193  388:ldc1            #181 <String "invoice_number">
	//  194  390:aload_0         
	//  195  391:getfield        #179 <Field String m>
	//  196  394:invokevirtual   #95  <Method JSONObject JSONObject.accumulate(String, Object)>
	//  197  397:pop             
		if(cd.b(((CharSequence) (n))))
	//* 198  398:aload_0         
	//* 199  399:getfield        #183 <Field String n>
	//* 200  402:invokestatic    #75  <Method boolean cd.b(CharSequence)>
	//* 201  405:ifeq            419
			((JSONObject) (obj)).accumulate("custom", ((Object) (n)));
	//  202  408:aload_1         
	//  203  409:ldc1            #185 <String "custom">
	//  204  411:aload_0         
	//  205  412:getfield        #183 <Field String n>
	//  206  415:invokevirtual   #95  <Method JSONObject JSONObject.accumulate(String, Object)>
	//  207  418:pop             
		if(cd.b(((CharSequence) (o))))
	//* 208  419:aload_0         
	//* 209  420:getfield        #187 <Field String o>
	//* 210  423:invokestatic    #75  <Method boolean cd.b(CharSequence)>
	//* 211  426:ifeq            440
			((JSONObject) (obj)).accumulate("soft_descriptor", ((Object) (o)));
	//  212  429:aload_1         
	//  213  430:ldc1            #189 <String "soft_descriptor">
	//  214  432:aload_0         
	//  215  433:getfield        #187 <Field String o>
	//  216  436:invokevirtual   #95  <Method JSONObject JSONObject.accumulate(String, Object)>
	//  217  439:pop             
		if(cd.b(((CharSequence) (p))))
	//* 218  440:aload_0         
	//* 219  441:getfield        #191 <Field String p>
	//* 220  444:invokestatic    #75  <Method boolean cd.b(CharSequence)>
	//* 221  447:ifeq            477
		{
			obj1 = ((Object) (new JSONObject()));
	//  222  450:new             #86  <Class JSONObject>
	//  223  453:dup             
	//  224  454:invokespecial   #89  <Method void JSONObject()>
	//  225  457:astore_2        
			((JSONObject) (obj1)).accumulate("email", ((Object) (p)));
	//  226  458:aload_2         
	//  227  459:ldc1            #193 <String "email">
	//  228  461:aload_0         
	//  229  462:getfield        #191 <Field String p>
	//  230  465:invokevirtual   #95  <Method JSONObject JSONObject.accumulate(String, Object)>
	//  231  468:pop             
			((JSONObject) (obj)).accumulate("payee", obj1);
	//  232  469:aload_1         
	//  233  470:ldc1            #195 <String "payee">
	//  234  472:aload_2         
	//  235  473:invokevirtual   #95  <Method JSONObject JSONObject.accumulate(String, Object)>
	//  236  476:pop             
		}
		obj = ((Object) (new JSONObject()));
	//  237  477:new             #86  <Class JSONObject>
	//  238  480:dup             
	//  239  481:invokespecial   #89  <Method void JSONObject()>
	//  240  484:astore_1        
		((JSONObject) (obj)).accumulate("device_info", ((Object) (cd.a(dl.a().toString()))));
	//  241  485:aload_1         
	//  242  486:ldc1            #197 <String "device_info">
	//  243  488:invokestatic    #202 <Method JSONObject dl.a()>
	//  244  491:invokevirtual   #205 <Method String JSONObject.toString()>
	//  245  494:invokestatic    #208 <Method String cd.a(String)>
	//  246  497:invokevirtual   #95  <Method JSONObject JSONObject.accumulate(String, Object)>
	//  247  500:pop             
		((JSONObject) (obj)).accumulate("app_info", ((Object) (cd.a(dh.a().toString()))));
	//  248  501:aload_1         
	//  249  502:ldc1            #210 <String "app_info">
	//  250  504:invokestatic    #213 <Method JSONObject dh.a()>
	//  251  507:invokevirtual   #205 <Method String JSONObject.toString()>
	//  252  510:invokestatic    #208 <Method String cd.a(String)>
	//  253  513:invokevirtual   #95  <Method JSONObject JSONObject.accumulate(String, Object)>
	//  254  516:pop             
		((JSONObject) (obj)).accumulate("risk_data", ((Object) (cd.a(com.paypal.android.sdk.p.a().c().toString()))));
	//  255  517:aload_1         
	//  256  518:ldc1            #215 <String "risk_data">
	//  257  520:invokestatic    #220 <Method p p.a()>
	//  258  523:invokevirtual   #222 <Method JSONObject p.c()>
	//  259  526:invokevirtual   #205 <Method String JSONObject.toString()>
	//  260  529:invokestatic    #208 <Method String cd.a(String)>
	//  261  532:invokevirtual   #95  <Method JSONObject JSONObject.accumulate(String, Object)>
	//  262  535:pop             
		obj1 = ((Object) (new JSONObject()));
	//  263  536:new             #86  <Class JSONObject>
	//  264  539:dup             
	//  265  540:invokespecial   #89  <Method void JSONObject()>
	//  266  543:astore_2        
		((JSONObject) (obj1)).accumulate("payment", ((Object) (jsonobject2)));
	//  267  544:aload_2         
	//  268  545:ldc1            #224 <String "payment">
	//  269  547:aload_3         
	//  270  548:invokevirtual   #95  <Method JSONObject JSONObject.accumulate(String, Object)>
	//  271  551:pop             
		((JSONObject) (obj1)).accumulate("client_info", obj);
	//  272  552:aload_2         
	//  273  553:ldc1            #226 <String "client_info">
	//  274  555:aload_1         
	//  275  556:invokevirtual   #95  <Method JSONObject JSONObject.accumulate(String, Object)>
	//  276  559:pop             
		if(l)
	//* 277  560:aload_0         
	//* 278  561:getfield        #47  <Field boolean l>
	//* 279  564:ifeq            578
			((JSONObject) (obj1)).accumulate("retrieve_shipping_addresses", ((Object) (Boolean.valueOf(true))));
	//  280  567:aload_2         
	//  281  568:ldc1            #228 <String "retrieve_shipping_addresses">
	//  282  570:iconst_1        
	//  283  571:invokestatic    #234 <Method Boolean Boolean.valueOf(boolean)>
	//  284  574:invokevirtual   #95  <Method JSONObject JSONObject.accumulate(String, Object)>
	//  285  577:pop             
		((JSONObject) (obj1)).accumulate("no_shipping", ((Object) (Boolean.valueOf(j))));
	//  286  578:aload_2         
	//  287  579:ldc1            #236 <String "no_shipping">
	//  288  581:aload_0         
	//  289  582:getfield        #83  <Field boolean j>
	//  290  585:invokestatic    #234 <Method Boolean Boolean.valueOf(boolean)>
	//  291  588:invokevirtual   #95  <Method JSONObject JSONObject.accumulate(String, Object)>
	//  292  591:pop             
		return ((JSONObject) (obj1)).toString();
	//  293  592:aload_2         
	//  294  593:invokevirtual   #205 <Method String JSONObject.toString()>
	//  295  596:areturn         
	}

	public final void c()
	{
		JSONObject jsonobject = m();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #238 <Method JSONObject m()>
	//    2    4:astore_1        
		a = jsonobject.optString("payment_id");
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:ldc1            #240 <String "payment_id">
	//    6    9:invokevirtual   #243 <Method String JSONObject.optString(String)>
	//    7   12:putfield        #245 <Field String a>
		b = jsonobject.getString("session_id");
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:ldc1            #247 <String "session_id">
	//   11   19:invokevirtual   #250 <Method String JSONObject.getString(String)>
	//   12   22:putfield        #252 <Field String b>
		c = jsonobject.optJSONArray("addresses");
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:ldc1            #254 <String "addresses">
	//   16   29:invokevirtual   #258 <Method JSONArray JSONObject.optJSONArray(String)>
	//   17   32:putfield        #260 <Field JSONArray c>
		jsonobject = jsonobject.optJSONObject("funding_options");
	//   18   35:aload_1         
	//   19   36:ldc2            #262 <String "funding_options">
	//   20   39:invokevirtual   #266 <Method JSONObject JSONObject.optJSONObject(String)>
	//   21   42:astore_1        
		if(jsonobject != null)
	//*  22   43:aload_1         
	//*  23   44:ifnull          69
		{
			d = jsonobject.optJSONObject("default_option");
	//   24   47:aload_0         
	//   25   48:aload_1         
	//   26   49:ldc2            #268 <String "default_option">
	//   27   52:invokevirtual   #266 <Method JSONObject JSONObject.optJSONObject(String)>
	//   28   55:putfield        #270 <Field JSONObject d>
			e = jsonobject.optJSONArray("alternate_options");
	//   29   58:aload_0         
	//   30   59:aload_1         
	//   31   60:ldc2            #272 <String "alternate_options">
	//   32   63:invokevirtual   #258 <Method JSONArray JSONObject.optJSONArray(String)>
	//   33   66:putfield        #274 <Field JSONArray e>
		}
	//   34   69:return          
	}

	public final eh d(String s)
	{
		m = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #179 <Field String m>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final void d()
	{
		b(m());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #238 <Method JSONObject m()>
	//    3    5:invokevirtual   #278 <Method void b(JSONObject)>
	//    4    8:return          
	}

	public final eh e(String s)
	{
		n = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #183 <Field String n>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final String e()
	{
		return "{    \"session_id\":\"7N0112287V303050T\",    \"payment_id\":\"PAY-18X32451H0459092JKO7KFUI\",    \"addresses\": [          {             \"city\": \"Columbia\",              \"line2\": \"6073 2nd Street\",              \"line1\": \"Suite 222\",              \"recipient_name\": \"Beverly Jello\",             \"state\": \"MD\",              \"postal_code\": \"21045\",             \"default_address\": false,              \"country_code\": \"US\",              \"type\": \"HOME_OR_WORK\",              \"id\": \"366853\"          },          {             \"city\": \"Austin\",              \"line2\": \"Apt. 222\",              \"line1\": \"52 North Main St. \",              \"recipient_name\": \"Michael Chassen\",             \"state\": \"TX\",              \"postal_code\": \"78729\",             \"default_address\": true,              \"country_code\": \"US\",              \"type\": \"HOME_OR_WORK\",              \"id\": \"366852\"          },          {             \"city\": \"Austin\",              \"line1\": \"202 South State St. \",              \"recipient_name\": \"Sam Stone\",             \"state\": \"TX\",              \"postal_code\": \"78729\",             \"default_address\": true,              \"country_code\": \"US\",              \"type\": \"HOME_OR_WORK\",              \"id\": \"366852\"          }     ],     \"funding_options\":{       \"default_option\":{          \"id\":\"1\",          \"backup_funding_instrument\":{             \"payment_card\":{                \"number\":\"8029\",                \"type\":\"VISA\"             }          },          \"funding_sources\":[             {                \"amount\":{                   \"value\":\"216.85\",                   \"currency\":\"USD\"                },                \"funding_instrument_type\":\"BANK_ACCOUNT\",                \"funding_mode\":\"INSTANT_TRANSFER\",                \"bank_account\":{                   \"bank_name\":\"SunTrust\",                   \"account_number\":\"7416\",                   \"account_number_type\":\"BBAN\",                   \"country_code\":\"US\",                   \"account_type\":\"CHECKING\"                }             },             {                \"amount\":{                   \"value\":\"6.00\",                   \"currency\":\"USD\"                },                \"funding_instrument_type\":\"CREDIT\",                \"funding_mode\":\"INSTANT_TRANSFER\",                \"credit\":{                   \"type\":\"BILL_ME_LATER\",                   \"id\":\"mock-id\"                }             }          ]       },       \"alternate_options\":[          {             \"id\":\"2\",             \"funding_sources\":[                {                   \"amount\":{                      \"value\":\"216.85\",                      \"currency\":\"USD\"                   },                   \"funding_instrument_type\":\"PAYMENT_CARD\",                   \"payment_card\":{                      \"number\":\"8029\",                      \"type\":\"VISA\"                   },                   \"funding_mode\":\"INSTANT_TRANSFER\"                },                {                   \"amount\":{                      \"value\":\"6.00\",                      \"currency\":\"USD\"                   },                   \"funding_instrument_type\":\"BALANCE\",                   \"funding_mode\":\"INSTANT_TRANSFER\"                }             ]          },          {             \"id\":\"3\",             \"funding_sources\":[                {                   \"amount\":{                      \"value\":\"216.85\",                      \"currency\":\"USD\"                   },                   \"funding_instrument_type\":\"PAYMENT_CARD\",                   \"payment_card\":{                      \"number\":\"8011\",                      \"type\":\"VISA\"                   },                   \"funding_mode\":\"INSTANT_TRANSFER\"                },                {                   \"amount\":{                      \"value\":\"6.00\",                      \"currency\":\"USD\"                   },                   \"funding_instrument_type\":\"BALANCE\",                   \"funding_mode\":\"INSTANT_TRANSFER\"                }             ]          }       ]    } }";
	//    0    0:ldc2            #280 <String "{    \"session_id\":\"7N0112287V303050T\",    \"payment_id\":\"PAY-18X32451H0459092JKO7KFUI\",    \"addresses\": [          {             \"city\": \"Columbia\",              \"line2\": \"6073 2nd Street\",              \"line1\": \"Suite 222\",              \"recipient_name\": \"Beverly Jello\",             \"state\": \"MD\",              \"postal_code\": \"21045\",             \"default_address\": false,              \"country_code\": \"US\",              \"type\": \"HOME_OR_WORK\",              \"id\": \"366853\"          },          {             \"city\": \"Austin\",              \"line2\": \"Apt. 222\",              \"line1\": \"52 North Main St. \",              \"recipient_name\": \"Michael Chassen\",             \"state\": \"TX\",              \"postal_code\": \"78729\",             \"default_address\": true,              \"country_code\": \"US\",              \"type\": \"HOME_OR_WORK\",              \"id\": \"366852\"          },          {             \"city\": \"Austin\",              \"line1\": \"202 South State St. \",              \"recipient_name\": \"Sam Stone\",             \"state\": \"TX\",              \"postal_code\": \"78729\",             \"default_address\": true,              \"country_code\": \"US\",              \"type\": \"HOME_OR_WORK\",              \"id\": \"366852\"          }     ],     \"funding_options\":{       \"default_option\":{          \"id\":\"1\",          \"backup_funding_instrument\":{             \"payment_card\":{                \"number\":\"8029\",                \"type\":\"VISA\"             }          },          \"funding_sources\":[             {                \"amount\":{                   \"value\":\"216.85\",                   \"currency\":\"USD\"                },                \"funding_instrument_type\":\"BANK_ACCOUNT\",                \"funding_mode\":\"INSTANT_TRANSFER\",                \"bank_account\":{                   \"bank_name\":\"SunTrust\",                   \"account_number\":\"7416\",                   \"account_number_type\":\"BBAN\",                   \"country_code\":\"US\",                   \"account_type\":\"CHECKING\"                }             },             {                \"amount\":{                   \"value\":\"6.00\",                   \"currency\":\"USD\"                },                \"funding_instrument_type\":\"CREDIT\",                \"funding_mode\":\"INSTANT_TRANSFER\",                \"credit\":{                   \"type\":\"BILL_ME_LATER\",                   \"id\":\"mock-id\"                }             }          ]       },       \"alternate_options\":[          {             \"id\":\"2\",             \"funding_sources\":[                {                   \"amount\":{                      \"value\":\"216.85\",                      \"currency\":\"USD\"                   },                   \"funding_instrument_type\":\"PAYMENT_CARD\",                   \"payment_card\":{                      \"number\":\"8029\",                      \"type\":\"VISA\"                   },                   \"funding_mode\":\"INSTANT_TRANSFER\"                },                {                   \"amount\":{                      \"value\":\"6.00\",                      \"currency\":\"USD\"                   },                   \"funding_instrument_type\":\"BALANCE\",                   \"funding_mode\":\"INSTANT_TRANSFER\"                }             ]          },          {             \"id\":\"3\",             \"funding_sources\":[                {                   \"amount\":{                      \"value\":\"216.85\",                      \"currency\":\"USD\"                   },                   \"funding_instrument_type\":\"PAYMENT_CARD\",                   \"payment_card\":{                      \"number\":\"8011\",                      \"type\":\"VISA\"                   },                   \"funding_mode\":\"INSTANT_TRANSFER\"                },                {                   \"amount\":{                      \"value\":\"6.00\",                      \"currency\":\"USD\"                   },                   \"funding_instrument_type\":\"BALANCE\",                   \"funding_mode\":\"INSTANT_TRANSFER\"                }             ]          }       ]    } }">
	//    1    3:areturn         
	}

	public final eh f(String s)
	{
		o = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #187 <Field String o>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final eh g(String s)
	{
		p = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #191 <Field String p>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final String t()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #245 <Field String a>
	//    2    4:areturn         
	}

	public final String u()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #252 <Field String b>
	//    2    4:areturn         
	}

	public final JSONArray v()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #260 <Field JSONArray c>
	//    2    4:areturn         
	}

	public final JSONObject w()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #270 <Field JSONObject d>
	//    2    4:areturn         
	}

	public final JSONArray x()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #274 <Field JSONArray e>
	//    2    4:areturn         
	}

	private String a;
	private String b;
	private JSONArray c;
	private JSONObject d;
	private JSONArray e;
	private er f;
	private Map g;
	private es h[];
	private String i;
	private boolean j;
	private String k;
	private boolean l;
	private String m;
	private String n;
	private String o;
	private String p;
}
