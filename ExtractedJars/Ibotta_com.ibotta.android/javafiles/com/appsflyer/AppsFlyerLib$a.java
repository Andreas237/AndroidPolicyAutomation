// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appsflyer;

import android.content.Context;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import com.newrelic.agent.android.instrumentation.URLConnectionInstrumentation;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.*;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

// Referenced classes of package com.appsflyer:
//			AppsFlyerLib, AFExecutor, m, AFLogger, 
//			q, v

abstract class AppsFlyerLib$a
	implements Runnable
{

	public void run()
	{
		Object obj;
		Map map;
		String s;
		obj = ((Object) (_fld02CA));
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field String _fld02CA>
	//    2    4:astore          4
		if(obj == null)
			break MISSING_BLOCK_LABEL_1047;
	//    3    6:aload           4
	//    4    8:ifnull          1047
		if(((String) (obj)).length() == 0)
	//*   5   11:aload           4
	//*   6   13:invokevirtual   #67  <Method int String.length()>
	//*   7   16:ifne            20
			return;
	//    8   19:return          
		if(_fld02CB.isTrackingStopped())
	//*   9   20:aload_0         
	//*  10   21:getfield        #25  <Field AppsFlyerLib _fld02CB>
	//*  11   24:invokevirtual   #71  <Method boolean AppsFlyerLib.isTrackingStopped()>
	//*  12   27:ifeq            31
			return;
	//   13   30:return          
		_fld0971.incrementAndGet();
	//   14   31:aload_0         
	//   15   32:getfield        #37  <Field AtomicInteger _fld0971>
	//   16   35:invokevirtual   #74  <Method int AtomicInteger.incrementAndGet()>
	//   17   38:pop             
		s = null;
	//   18   39:aconst_null     
	//   19   40:astore          7
		map = null;
	//   20   42:aconst_null     
	//   21   43:astore          6
		obj = ((Object) (map));
	//   22   45:aload           6
	//   23   47:astore          4
		Context context = (Context)((Reference) (_fld02CE)).get();
	//   24   49:aload_0         
	//   25   50:getfield        #30  <Field WeakReference _fld02CE>
	//   26   53:invokevirtual   #80  <Method Object Reference.get()>
	//   27   56:checkcast       #82  <Class Context>
	//   28   59:astore          9
		if(context == null)
	//*  29   61:aload           9
	//*  30   63:ifnonnull       75
		{
			_fld0971.decrementAndGet();
	//   31   66:aload_0         
	//   32   67:getfield        #37  <Field AtomicInteger _fld0971>
	//   33   70:invokevirtual   #85  <Method int AtomicInteger.decrementAndGet()>
	//   34   73:pop             
			return;
	//   35   74:return          
		}
		obj = ((Object) (map));
	//   36   75:aload           6
	//   37   77:astore          4
		long l = System.currentTimeMillis();
	//   38   79:invokestatic    #91  <Method long System.currentTimeMillis()>
	//   39   82:lstore_2        
		obj = ((Object) (map));
	//   40   83:aload           6
	//   41   85:astore          4
		String s1 = AppsFlyerLib._mth02CA(context, AppsFlyerLib._mth02CA(new WeakReference(((Object) (context)))));
	//   42   87:aload           9
	//   43   89:new             #39  <Class WeakReference>
	//   44   92:dup             
	//   45   93:aload           9
	//   46   95:invokespecial   #42  <Method void WeakReference(Object)>
	//   47   98:invokestatic    #94  <Method String AppsFlyerLib._mth02CA(WeakReference)>
	//   48  101:invokestatic    #97  <Method String AppsFlyerLib._mth02CA(Context, String)>
	//   49  104:astore          10
		Object obj1;
		Object obj3;
		obj3 = "";
	//   50  106:ldc1            #99  <String "">
	//   51  108:astore          8
		obj1 = obj3;
	//   52  110:aload           8
	//   53  112:astore          5
		if(s1 == null)
			break MISSING_BLOCK_LABEL_183;
	//   54  114:aload           10
	//   55  116:ifnull          183
		obj = ((Object) (map));
	//   56  119:aload           6
	//   57  121:astore          4
		if(AppsFlyerLib._mth0971().contains(((Object) (s1.toLowerCase())))) goto _L2; else goto _L1
	//   58  123:invokestatic    #102 <Method List AppsFlyerLib._mth0971()>
	//   59  126:aload           10
	//   60  128:invokevirtual   #106 <Method String String.toLowerCase()>
	//   61  131:invokeinterface #112 <Method boolean List.contains(Object)>
	//   62  136:ifne            158
_L1:
		obj = ((Object) (map));
	//   63  139:aload           6
	//   64  141:astore          4
		int i;
		Object obj2;
		try
		{
			obj1 = ((Object) ("-".concat(String.valueOf(((Object) (s1))))));
	//   65  143:ldc1            #114 <String "-">
	//   66  145:aload           10
	//   67  147:invokestatic    #118 <Method String String.valueOf(Object)>
	//   68  150:invokevirtual   #122 <Method String String.concat(String)>
	//   69  153:astore          5
			break MISSING_BLOCK_LABEL_183;
	//   70  155:goto            183
		}
	//*  71  158:aload           6
	//*  72  160:astore          4
	//*  73  162:ldc1            #124 <String "AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.">
	//*  74  164:iconst_1        
	//*  75  165:anewarray       Object[]
	//*  76  168:dup             
	//*  77  169:iconst_0        
	//*  78  170:aload           10
	//*  79  172:aastore         
	//*  80  173:invokestatic    #128 <Method String String.format(String, Object[])>
	//*  81  176:invokestatic    #134 <Method void AFLogger.afWarnLog(String)>
	//*  82  179:aload           8
	//*  83  181:astore          5
	//*  84  183:aload           6
	//*  85  185:astore          4
	//*  86  187:new             #136 <Class StringBuilder>
	//*  87  190:dup             
	//*  88  191:invokespecial   #137 <Method void StringBuilder()>
	//*  89  194:astore          8
	//*  90  196:aload           6
	//*  91  198:astore          4
	//*  92  200:aload           8
	//*  93  202:aload_0         
	//*  94  203:invokevirtual   #139 <Method String _mth02CB()>
	//*  95  206:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//*  96  209:pop             
	//*  97  210:aload           6
	//*  98  212:astore          4
	//*  99  214:aload           8
	//* 100  216:aload           9
	//* 101  218:invokevirtual   #146 <Method String Context.getPackageName()>
	//* 102  221:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//* 103  224:pop             
	//* 104  225:aload           6
	//* 105  227:astore          4
	//* 106  229:aload           8
	//* 107  231:aload           5
	//* 108  233:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//* 109  236:pop             
	//* 110  237:aload           6
	//* 111  239:astore          4
	//* 112  241:aload           8
	//* 113  243:ldc1            #148 <String "?devkey=">
	//* 114  245:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//* 115  248:pop             
	//* 116  249:aload           6
	//* 117  251:astore          4
	//* 118  253:aload           8
	//* 119  255:aload_0         
	//* 120  256:getfield        #44  <Field String _fld02CA>
	//* 121  259:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//* 122  262:pop             
	//* 123  263:aload           6
	//* 124  265:astore          4
	//* 125  267:aload           8
	//* 126  269:ldc1            #150 <String "&device_id=">
	//* 127  271:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//* 128  274:pop             
	//* 129  275:aload           6
	//* 130  277:astore          4
	//* 131  279:aload           8
	//* 132  281:new             #39  <Class WeakReference>
	//* 133  284:dup             
	//* 134  285:aload           9
	//* 135  287:invokespecial   #42  <Method void WeakReference(Object)>
	//* 136  290:invokestatic    #154 <Method String q._mth02CB(WeakReference)>
	//* 137  293:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//* 138  296:pop             
	//* 139  297:aload           6
	//* 140  299:astore          4
	//* 141  301:invokestatic    #159 <Method v v._mth02CB()>
	//* 142  304:aload           8
	//* 143  306:invokevirtual   #162 <Method String Object.toString()>
	//* 144  309:ldc1            #99  <String "">
	//* 145  311:invokevirtual   #165 <Method void v._mth02CA(String, String)>
	//* 146  314:aload           6
	//* 147  316:astore          4
	//* 148  318:new             #136 <Class StringBuilder>
	//* 149  321:dup             
	//* 150  322:ldc1            #167 <String "Calling server for attribution url: ">
	//* 151  324:invokespecial   #169 <Method void StringBuilder(String)>
	//* 152  327:astore          5
	//* 153  329:aload           6
	//* 154  331:astore          4
	//* 155  333:aload           5
	//* 156  335:aload           8
	//* 157  337:invokevirtual   #162 <Method String Object.toString()>
	//* 158  340:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//* 159  343:pop             
	//* 160  344:aload           6
	//* 161  346:astore          4
	//* 162  348:aload           5
	//* 163  350:invokevirtual   #162 <Method String Object.toString()>
	//* 164  353:invokestatic    #173 <Method void g$5._mth02CE(String)>
	//* 165  356:aload           6
	//* 166  358:astore          4
	//* 167  360:new             #175 <Class URL>
	//* 168  363:dup             
	//* 169  364:aload           8
	//* 170  366:invokevirtual   #162 <Method String Object.toString()>
	//* 171  369:invokespecial   #176 <Method void URL(String)>
	//* 172  372:invokevirtual   #180 <Method URLConnection URL.openConnection()>
	//* 173  375:invokestatic    #185 <Method URLConnection URLConnectionInstrumentation.openConnection(URLConnection)>
	//* 174  378:checkcast       #187 <Class HttpURLConnection>
	//* 175  381:astore          5
	//* 176  383:aload           5
	//* 177  385:ldc1            #189 <String "GET">
	//* 178  387:invokevirtual   #192 <Method void HttpURLConnection.setRequestMethod(String)>
	//* 179  390:aload           5
	//* 180  392:sipush          10000
	//* 181  395:invokevirtual   #197 <Method void URLConnection.setConnectTimeout(int)>
	//* 182  398:aload           5
	//* 183  400:ldc1            #199 <String "Connection">
	//* 184  402:ldc1            #201 <String "close">
	//* 185  404:invokevirtual   #204 <Method void URLConnection.setRequestProperty(String, String)>
	//* 186  407:aload           5
	//* 187  409:invokevirtual   #207 <Method void URLConnection.connect()>
	//* 188  412:aload           5
	//* 189  414:invokevirtual   #210 <Method int HttpURLConnection.getResponseCode()>
	//* 190  417:istore_1        
	//* 191  418:aload           5
	//* 192  420:invokestatic    #213 <Method String AppsFlyerLib._mth02CB(HttpURLConnection)>
	//* 193  423:astore          7
	//* 194  425:invokestatic    #159 <Method v v._mth02CB()>
	//* 195  428:aload           8
	//* 196  430:invokevirtual   #162 <Method String Object.toString()>
	//* 197  433:iload_1         
	//* 198  434:aload           7
	//* 199  436:invokevirtual   #216 <Method void v._mth0971(String, int, String)>
	//* 200  439:iload_1         
	//* 201  440:sipush          200
	//* 202  443:icmpne          845
	//* 203  446:aload           9
	//* 204  448:ldc1            #218 <String "appsflyerGetConversionDataTiming">
	//* 205  450:invokestatic    #91  <Method long System.currentTimeMillis()>
	//* 206  453:lload_2         
	//* 207  454:lsub            
	//* 208  455:ldc2w           #219 <Long 1000L>
	//* 209  458:ldiv            
	//* 210  459:invokestatic    #223 <Method void AppsFlyerLib._mth02CA(Context, String, long)>
	//* 211  462:ldc1            #225 <String "Attribution data: ">
	//* 212  464:aload           7
	//* 213  466:invokestatic    #118 <Method String String.valueOf(Object)>
	//* 214  469:invokevirtual   #122 <Method String String.concat(String)>
	//* 215  472:invokestatic    #173 <Method void g$5._mth02CE(String)>
	//* 216  475:aload           7
	//* 217  477:invokevirtual   #67  <Method int String.length()>
	//* 218  480:ifle            910
	//* 219  483:aload           9
	//* 220  485:ifnull          910
	//* 221  488:aload           7
	//* 222  490:invokestatic    #228 <Method Map AppsFlyerLib._mth02CA(String)>
	//* 223  493:astore          6
	//* 224  495:aload           6
	//* 225  497:ldc1            #230 <String "iscache">
	//* 226  499:invokeinterface #235 <Method Object Map.get(Object)>
	//* 227  504:checkcast       #63  <Class String>
	//* 228  507:astore          8
	//* 229  509:aload           8
	//* 230  511:ifnull          536
	//* 231  514:iconst_0        
	//* 232  515:invokestatic    #240 <Method String Boolean.toString(boolean)>
	//* 233  518:aload           8
	//* 234  520:invokevirtual   #243 <Method boolean Object.equals(Object)>
	//* 235  523:ifeq            536
	//* 236  526:aload           9
	//* 237  528:ldc1            #245 <String "appsflyerConversionDataCacheExpiration">
	//* 238  530:invokestatic    #91  <Method long System.currentTimeMillis()>
	//* 239  533:invokestatic    #223 <Method void AppsFlyerLib._mth02CA(Context, String, long)>
	//* 240  536:aload           6
	//* 241  538:ldc1            #247 <String "af_siteid">
	//* 242  540:invokeinterface #250 <Method boolean Map.containsKey(Object)>
	//* 243  545:ifeq            625
	//* 244  548:aload           6
	//* 245  550:ldc1            #252 <String "af_channel">
	//* 246  552:invokeinterface #250 <Method boolean Map.containsKey(Object)>
	//* 247  557:ifeq            600
	//* 248  560:new             #136 <Class StringBuilder>
	//* 249  563:dup             
	//* 250  564:ldc1            #254 <String "[Invite] Detected App-Invite via channel: ">
	//* 251  566:invokespecial   #169 <Method void StringBuilder(String)>
	//* 252  569:astore          4
	//* 253  571:aload           4
	//* 254  573:aload           6
	//* 255  575:ldc1            #252 <String "af_channel">
	//* 256  577:invokeinterface #235 <Method Object Map.get(Object)>
	//* 257  582:checkcast       #63  <Class String>
	//* 258  585:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//* 259  588:pop             
	//* 260  589:aload           4
	//* 261  591:invokevirtual   #162 <Method String Object.toString()>
	//* 262  594:invokestatic    #257 <Method void AFLogger.afDebugLog(String)>
	//* 263  597:goto            625
	//* 264  600:ldc2            #259 <String "[CrossPromotion] App was installed via %s's Cross Promotion">
	//* 265  603:iconst_1        
	//* 266  604:anewarray       Object[]
	//* 267  607:dup             
	//* 268  608:iconst_0        
	//* 269  609:aload           6
	//* 270  611:ldc1            #247 <String "af_siteid">
	//* 271  613:invokeinterface #235 <Method Object Map.get(Object)>
	//* 272  618:aastore         
	//* 273  619:invokestatic    #128 <Method String String.format(String, Object[])>
	//* 274  622:invokestatic    #257 <Method void AFLogger.afDebugLog(String)>
	//* 275  625:aload           6
	//* 276  627:ldc1            #247 <String "af_siteid">
	//* 277  629:invokeinterface #250 <Method boolean Map.containsKey(Object)>
	//* 278  634:ifeq            674
	//* 279  637:new             #136 <Class StringBuilder>
	//* 280  640:dup             
	//* 281  641:ldc1            #254 <String "[Invite] Detected App-Invite via channel: ">
	//* 282  643:invokespecial   #169 <Method void StringBuilder(String)>
	//* 283  646:astore          4
	//* 284  648:aload           4
	//* 285  650:aload           6
	//* 286  652:ldc1            #252 <String "af_channel">
	//* 287  654:invokeinterface #235 <Method Object Map.get(Object)>
	//* 288  659:checkcast       #63  <Class String>
	//* 289  662:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//* 290  665:pop             
	//* 291  666:aload           4
	//* 292  668:invokevirtual   #162 <Method String Object.toString()>
	//* 293  671:invokestatic    #257 <Method void AFLogger.afDebugLog(String)>
	//* 294  674:aload           6
	//* 295  676:ldc2            #261 <String "is_first_launch">
	//* 296  679:iconst_0        
	//* 297  680:invokestatic    #240 <Method String Boolean.toString(boolean)>
	//* 298  683:invokeinterface #265 <Method Object Map.put(Object, Object)>
	//* 299  688:pop             
	//* 300  689:new             #267 <Class JSONObject>
	//* 301  692:dup             
	//* 302  693:aload           6
	//* 303  695:invokespecial   #270 <Method void JSONObject(Map)>
	//* 304  698:astore          4
	//* 305  700:aload           4
	//* 306  702:instanceof      #267 <Class JSONObject>
	//* 307  705:ifne            718
	//* 308  708:aload           4
	//* 309  710:invokevirtual   #271 <Method String JSONObject.toString()>
	//* 310  713:astore          4
	//* 311  715:goto            728
	//* 312  718:aload           4
	//* 313  720:checkcast       #267 <Class JSONObject>
	//* 314  723:invokestatic    #276 <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//* 315  726:astore          4
	//* 316  728:aload           4
	//* 317  730:ifnull          746
	//* 318  733:aload           9
	//* 319  735:ldc2            #278 <String "attributionId">
	//* 320  738:aload           4
	//* 321  740:invokestatic    #281 <Method void AppsFlyerLib._mth02CA(Context, String, String)>
	//* 322  743:goto            756
	//* 323  746:aload           9
	//* 324  748:ldc2            #278 <String "attributionId">
	//* 325  751:aload           7
	//* 326  753:invokestatic    #281 <Method void AppsFlyerLib._mth02CA(Context, String, String)>
	//* 327  756:new             #136 <Class StringBuilder>
	//* 328  759:dup             
	//* 329  760:ldc2            #283 <String "iscache=">
	//* 330  763:invokespecial   #169 <Method void StringBuilder(String)>
	//* 331  766:astore          4
	//* 332  768:aload           4
	//* 333  770:aload           8
	//* 334  772:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//* 335  775:pop             
	//* 336  776:aload           4
	//* 337  778:ldc2            #285 <String " caching conversion data">
	//* 338  781:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//* 339  784:pop             
	//* 340  785:aload           4
	//* 341  787:invokevirtual   #162 <Method String Object.toString()>
	//* 342  790:invokestatic    #257 <Method void AFLogger.afDebugLog(String)>
	//* 343  793:invokestatic    #288 <Method AppsFlyerConversionListener AppsFlyerLib._mth02CB()>
	//* 344  796:ifnull          910
	//* 345  799:aload_0         
	//* 346  800:getfield        #37  <Field AtomicInteger _fld0971>
	//* 347  803:invokevirtual   #293 <Method int Number.intValue()>
	//* 348  806:istore_1        
	//* 349  807:iload_1         
	//* 350  808:iconst_1        
	//* 351  809:icmpgt          910
	//* 352  812:aload           9
	//* 353  814:invokestatic    #296 <Method Map AppsFlyerLib._mth02CA(Context)>
	//* 354  817:astore          4
	//* 355  819:goto            836
	//* 356  822:astore          4
	//* 357  824:ldc2            #298 <String "Exception while trying to fetch attribution data. ">
	//* 358  827:aload           4
	//* 359  829:invokestatic    #302 <Method void AFLogger.afErrorLog(String, Throwable)>
	//* 360  832:aload           6
	//* 361  834:astore          4
	//* 362  836:aload_0         
	//* 363  837:aload           4
	//* 364  839:invokevirtual   #304 <Method void _mth02CE(Map)>
	//* 365  842:goto            910
	//* 366  845:invokestatic    #288 <Method AppsFlyerConversionListener AppsFlyerLib._mth02CB()>
	//* 367  848:ifnull          866
	//* 368  851:aload_0         
	//* 369  852:ldc2            #306 <String "Error connection to server: ">
	//* 370  855:iload_1         
	//* 371  856:invokestatic    #309 <Method String String.valueOf(int)>
	//* 372  859:invokevirtual   #122 <Method String String.concat(String)>
	//* 373  862:iload_1         
	//* 374  863:invokevirtual   #312 <Method void _mth02CE(String, int)>
	//* 375  866:new             #136 <Class StringBuilder>
	//* 376  869:dup             
	//* 377  870:ldc2            #314 <String "AttributionIdFetcher response code: ">
	//* 378  873:invokespecial   #169 <Method void StringBuilder(String)>
	//* 379  876:astore          4
	//* 380  878:aload           4
	//* 381  880:iload_1         
	//* 382  881:invokevirtual   #317 <Method StringBuilder StringBuilder.append(int)>
	//* 383  884:pop             
	//* 384  885:aload           4
	//* 385  887:ldc2            #319 <String "  url: ">
	//* 386  890:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//* 387  893:pop             
	//* 388  894:aload           4
	//* 389  896:aload           8
	//* 390  898:invokevirtual   #322 <Method StringBuilder StringBuilder.append(Object)>
	//* 391  901:pop             
	//* 392  902:aload           4
	//* 393  904:invokevirtual   #162 <Method String Object.toString()>
	//* 394  907:invokestatic    #173 <Method void g$5._mth02CE(String)>
	//* 395  910:aload_0         
	//* 396  911:getfield        #37  <Field AtomicInteger _fld0971>
	//* 397  914:invokevirtual   #85  <Method int AtomicInteger.decrementAndGet()>
	//* 398  917:pop             
	//* 399  918:aload           5
	//* 400  920:ifnull          1016
	//* 401  923:aload           5
	//* 402  925:invokevirtual   #325 <Method void HttpURLConnection.disconnect()>
	//* 403  928:goto            1016
	//* 404  931:astore          4
	//* 405  933:goto            1026
	//* 406  936:astore          6
	//* 407  938:goto            960
	//* 408  941:astore          6
	//* 409  943:aload           4
	//* 410  945:astore          5
	//* 411  947:aload           6
	//* 412  949:astore          4
	//* 413  951:goto            1026
		// Misplaced declaration of an exception variable
		catch(Object obj2)
	//* 414  954:astore          6
		{
			obj1 = ((Object) (s));
	//  415  956:aload           7
	//  416  958:astore          5
		}
		  goto _L3
_L2:
		obj = ((Object) (map));
		AFLogger.afWarnLog(String.format("AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", new Object[] {
			s1
		}));
		obj1 = obj3;
		obj = ((Object) (map));
		obj3 = ((Object) (new StringBuilder()));
		obj = ((Object) (map));
		((StringBuilder) (obj3)).append(_mth02CB());
		obj = ((Object) (map));
		((StringBuilder) (obj3)).append(context.getPackageName());
		obj = ((Object) (map));
		((StringBuilder) (obj3)).append(((String) (obj1)));
		obj = ((Object) (map));
		((StringBuilder) (obj3)).append("?devkey=");
		obj = ((Object) (map));
		((StringBuilder) (obj3)).append(_fld02CA);
		obj = ((Object) (map));
		((StringBuilder) (obj3)).append("&device_id=");
		obj = ((Object) (map));
		((StringBuilder) (obj3)).append(q._mth02CB(new WeakReference(((Object) (context)))));
		obj = ((Object) (map));
		v._mth02CB()._mth02CA(obj3.toString(), "");
		obj = ((Object) (map));
		obj1 = ((Object) (new StringBuilder("Calling server for attribution url: ")));
		obj = ((Object) (map));
		((StringBuilder) (obj1)).append(obj3.toString());
		obj = ((Object) (map));
		g._cls5._mth02CE(obj1.toString());
		obj = ((Object) (map));
		obj1 = ((Object) ((HttpURLConnection)URLConnectionInstrumentation.openConnection((new URL(obj3.toString())).openConnection())));
		((HttpURLConnection) (obj1)).setRequestMethod("GET");
		((URLConnection) (obj1)).setConnectTimeout(10000);
		((URLConnection) (obj1)).setRequestProperty("Connection", "close");
		((URLConnection) (obj1)).connect();
		i = ((HttpURLConnection) (obj1)).getResponseCode();
		s = AppsFlyerLib._mth02CB(((HttpURLConnection) (obj1)));
		v._mth02CB()._mth0971(obj3.toString(), i, s);
		if(i != 200)
			break MISSING_BLOCK_LABEL_845;
		AppsFlyerLib._mth02CA(context, "appsflyerGetConversionDataTiming", (System.currentTimeMillis() - l) / 1000L);
		g._cls5._mth02CE("Attribution data: ".concat(String.valueOf(((Object) (s)))));
		if(s.length() <= 0 || context == null)
			break MISSING_BLOCK_LABEL_910;
		map = AppsFlyerLib._mth02CA(s);
		obj3 = ((Object) ((String)map.get("iscache")));
		if(obj3 == null)
			break MISSING_BLOCK_LABEL_536;
		if(((Object) (Boolean.toString(false))).equals(obj3))
			AppsFlyerLib._mth02CA(context, "appsflyerConversionDataCacheExpiration", System.currentTimeMillis());
		if(!map.containsKey("af_siteid"))
			break MISSING_BLOCK_LABEL_625;
		if(map.containsKey("af_channel"))
		{
			obj = ((Object) (new StringBuilder("[Invite] Detected App-Invite via channel: ")));
			((StringBuilder) (obj)).append((String)map.get("af_channel"));
			AFLogger.afDebugLog(obj.toString());
			break MISSING_BLOCK_LABEL_625;
		}
		AFLogger.afDebugLog(String.format("[CrossPromotion] App was installed via %s's Cross Promotion", new Object[] {
			map.get("af_siteid")
		}));
		if(map.containsKey("af_siteid"))
		{
			obj = ((Object) (new StringBuilder("[Invite] Detected App-Invite via channel: ")));
			((StringBuilder) (obj)).append((String)map.get("af_channel"));
			AFLogger.afDebugLog(obj.toString());
		}
		map.put("is_first_launch", ((Object) (Boolean.toString(false))));
		obj = ((Object) (new JSONObject(map)));
		if(!(obj instanceof JSONObject))
		{
			obj = ((Object) (((JSONObject) (obj)).toString()));
			break MISSING_BLOCK_LABEL_728;
		}
		obj = ((Object) (JSONObjectInstrumentation.toString((JSONObject)obj)));
		if(obj == null)
			break MISSING_BLOCK_LABEL_746;
		AppsFlyerLib._mth02CA(context, "attributionId", ((String) (obj)));
		break MISSING_BLOCK_LABEL_756;
		AppsFlyerLib._mth02CA(context, "attributionId", s);
		obj = ((Object) (new StringBuilder("iscache=")));
		((StringBuilder) (obj)).append(((String) (obj3)));
		((StringBuilder) (obj)).append(" caching conversion data");
		AFLogger.afDebugLog(obj.toString());
		if(AppsFlyerLib._mth02CB() == null)
			break MISSING_BLOCK_LABEL_910;
		i = ((Number) (_fld0971)).intValue();
		if(i > 1)
			break MISSING_BLOCK_LABEL_910;
		obj = ((Object) (AppsFlyerLib._mth02CA(context)));
		break MISSING_BLOCK_LABEL_836;
		obj;
		AFLogger.afErrorLog("Exception while trying to fetch attribution data. ", ((Throwable) (obj)));
		obj = ((Object) (map));
		_mth02CE(((Map) (obj)));
		break MISSING_BLOCK_LABEL_910;
		if(AppsFlyerLib._mth02CB() != null)
			_mth02CE("Error connection to server: ".concat(String.valueOf(i)), i);
		obj = ((Object) (new StringBuilder("AttributionIdFetcher response code: ")));
		((StringBuilder) (obj)).append(i);
		((StringBuilder) (obj)).append("  url: ");
		((StringBuilder) (obj)).append(obj3);
		g._cls5._mth02CE(obj.toString());
		_fld0971.decrementAndGet();
		if(obj1 != null)
			((HttpURLConnection) (obj1)).disconnect();
		break MISSING_BLOCK_LABEL_1016;
		obj;
		break MISSING_BLOCK_LABEL_1026;
		obj2;
		break MISSING_BLOCK_LABEL_960;
		obj2;
		obj1 = obj;
		obj = obj2;
		break MISSING_BLOCK_LABEL_1026;
_L3:
		obj = obj1;
	//  417  960:aload           5
	//  418  962:astore          4
		if(AppsFlyerLib._mth02CB() == null)
			break MISSING_BLOCK_LABEL_984;
	//  419  964:invokestatic    #288 <Method AppsFlyerConversionListener AppsFlyerLib._mth02CB()>
	//  420  967:ifnull          984
		obj = obj1;
	//  421  970:aload           5
	//  422  972:astore          4
		_mth02CE(((Throwable) (obj2)).getMessage(), 0);
	//  423  974:aload_0         
	//  424  975:aload           6
	//  425  977:invokevirtual   #328 <Method String Throwable.getMessage()>
	//  426  980:iconst_0        
	//  427  981:invokevirtual   #312 <Method void _mth02CE(String, int)>
		obj = obj1;
	//  428  984:aload           5
	//  429  986:astore          4
		AFLogger.afErrorLog(((Throwable) (obj2)).getMessage(), ((Throwable) (obj2)));
	//  430  988:aload           6
	//  431  990:invokevirtual   #328 <Method String Throwable.getMessage()>
	//  432  993:aload           6
	//  433  995:invokestatic    #302 <Method void AFLogger.afErrorLog(String, Throwable)>
		_fld0971.decrementAndGet();
	//  434  998:aload_0         
	//  435  999:getfield        #37  <Field AtomicInteger _fld0971>
	//  436 1002:invokevirtual   #85  <Method int AtomicInteger.decrementAndGet()>
	//  437 1005:pop             
		if(obj1 != null)
	//* 438 1006:aload           5
	//* 439 1008:ifnull          1016
			((HttpURLConnection) (obj1)).disconnect();
	//  440 1011:aload           5
	//  441 1013:invokevirtual   #325 <Method void HttpURLConnection.disconnect()>
		_fld02CF.shutdown();
	//  442 1016:aload_0         
	//  443 1017:getfield        #55  <Field ScheduledExecutorService _fld02CF>
	//  444 1020:invokeinterface #333 <Method void ScheduledExecutorService.shutdown()>
		return;
	//  445 1025:return          
		_fld0971.decrementAndGet();
	//  446 1026:aload_0         
	//  447 1027:getfield        #37  <Field AtomicInteger _fld0971>
	//  448 1030:invokevirtual   #85  <Method int AtomicInteger.decrementAndGet()>
	//  449 1033:pop             
		if(obj1 != null)
	//* 450 1034:aload           5
	//* 451 1036:ifnull          1044
			((HttpURLConnection) (obj1)).disconnect();
	//  452 1039:aload           5
	//  453 1041:invokevirtual   #325 <Method void HttpURLConnection.disconnect()>
		throw obj;
	//  454 1044:aload           4
	//  455 1046:athrow          
	//  456 1047:return          
	}

	public abstract String _mth02CB();

	protected abstract void _mth02CE(String s, int i);

	protected abstract void _mth02CE(Map map);

	private String _fld02CA;
	private AppsFlyerLib _fld02CB;
	WeakReference _fld02CE;
	private ScheduledExecutorService _fld02CF;
	private AtomicInteger _fld0971;

	AppsFlyerLib$a(AppsFlyerLib appsflyerlib, Context context, String s, ScheduledExecutorService scheduledexecutorservice)
	{
		_fld02CB = appsflyerlib;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field AppsFlyerLib _fld02CB>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #28  <Method void Object()>
		_fld02CE = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #30  <Field WeakReference _fld02CE>
		_fld0971 = new AtomicInteger(0);
	//    8   14:aload_0         
	//    9   15:new             #32  <Class AtomicInteger>
	//   10   18:dup             
	//   11   19:iconst_0        
	//   12   20:invokespecial   #35  <Method void AtomicInteger(int)>
	//   13   23:putfield        #37  <Field AtomicInteger _fld0971>
		_fld02CE = new WeakReference(((Object) (context)));
	//   14   26:aload_0         
	//   15   27:new             #39  <Class WeakReference>
	//   16   30:dup             
	//   17   31:aload_2         
	//   18   32:invokespecial   #42  <Method void WeakReference(Object)>
	//   19   35:putfield        #30  <Field WeakReference _fld02CE>
		_fld02CA = s;
	//   20   38:aload_0         
	//   21   39:aload_3         
	//   22   40:putfield        #44  <Field String _fld02CA>
		if(scheduledexecutorservice == null)
	//*  23   43:aload           4
	//*  24   45:ifnonnull       59
		{
			_fld02CF = ((ScheduledExecutorService) (AFExecutor.getInstance()._mth02CB()));
	//   25   48:aload_0         
	//   26   49:invokestatic    #50  <Method AFExecutor AFExecutor.getInstance()>
	//   27   52:invokevirtual   #53  <Method java.util.concurrent.ScheduledThreadPoolExecutor AFExecutor._mth02CB()>
	//   28   55:putfield        #55  <Field ScheduledExecutorService _fld02CF>
			return;
	//   29   58:return          
		} else
		{
			_fld02CF = scheduledexecutorservice;
	//   30   59:aload_0         
	//   31   60:aload           4
	//   32   62:putfield        #55  <Field ScheduledExecutorService _fld02CF>
			return;
	//   33   65:return          
		}
	}
}
