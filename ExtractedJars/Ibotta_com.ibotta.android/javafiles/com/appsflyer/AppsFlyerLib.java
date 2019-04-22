// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appsflyer;

import android.app.Activity;
import android.app.Application;
import android.content.*;
import android.content.pm.*;
import android.database.Cursor;
import android.location.Location;
import android.net.Uri;
import android.os.*;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.appsflyer.cache.CacheManager;
import com.appsflyer.cache.RequestCacheData;
import com.google.android.gms.common.GoogleApiAvailability;
import com.newrelic.agent.android.instrumentation.*;
import java.io.*;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.*;

// Referenced classes of package com.appsflyer:
//			e, r, AFVersionDeclaration, AFLogger, 
//			AppsFlyerProperties, m, p, AFExecutor, 
//			t, OneLinkHttpTask, AppsFlyerConversionListener, ServerConfigHandler, 
//			v, d, y, i, 
//			q, o, h, AFKeystoreWrapper, 
//			s, k, c, b, 
//			g, AFScreenManager, l, AppsFlyerInAppPurchaseValidatorListener, 
//			a, AFHelper

public class AppsFlyerLib
	implements com.appsflyer.e
{
	abstract class a
		implements Runnable
	{

		public void run()
		{
			Object obj;
			Map map;
			String s1;
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
			s1 = null;
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
			long l1 = System.currentTimeMillis();
		//   38   79:invokestatic    #91  <Method long System.currentTimeMillis()>
		//   39   82:lstore_2        
			obj = ((Object) (map));
		//   40   83:aload           6
		//   41   85:astore          4
			String s2 = AppsFlyerLib._mth02CA(context, AppsFlyerLib._mth02CA(new WeakReference(((Object) (context)))));
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
			if(s2 == null)
				break MISSING_BLOCK_LABEL_183;
		//   54  114:aload           10
		//   55  116:ifnull          183
			obj = ((Object) (map));
		//   56  119:aload           6
		//   57  121:astore          4
			if(AppsFlyerLib._mth0971().contains(((Object) (s2.toLowerCase())))) goto _L2; else goto _L1
		//   58  123:invokestatic    #102 <Method List AppsFlyerLib._mth0971()>
		//   59  126:aload           10
		//   60  128:invokevirtual   #106 <Method String String.toLowerCase()>
		//   61  131:invokeinterface #112 <Method boolean List.contains(Object)>
		//   62  136:ifne            158
_L1:
			obj = ((Object) (map));
		//   63  139:aload           6
		//   64  141:astore          4
			int j;
			Object obj2;
			try
			{
				obj1 = ((Object) ("-".concat(String.valueOf(((Object) (s2))))));
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
				obj1 = ((Object) (s1));
		//  415  956:aload           7
		//  416  958:astore          5
			}
			  goto _L3
_L2:
			obj = ((Object) (map));
			AFLogger.afWarnLog(String.format("AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", new Object[] {
				s2
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
			j = ((HttpURLConnection) (obj1)).getResponseCode();
			s1 = AppsFlyerLib._mth02CB(((HttpURLConnection) (obj1)));
			v._mth02CB()._mth0971(obj3.toString(), j, s1);
			if(j != 200)
				break MISSING_BLOCK_LABEL_845;
			AppsFlyerLib._mth02CA(context, "appsflyerGetConversionDataTiming", (System.currentTimeMillis() - l1) / 1000L);
			g._cls5._mth02CE("Attribution data: ".concat(String.valueOf(((Object) (s1)))));
			if(s1.length() <= 0 || context == null)
				break MISSING_BLOCK_LABEL_910;
			map = AppsFlyerLib._mth02CA(s1);
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
			AppsFlyerLib._mth02CA(context, "attributionId", s1);
			obj = ((Object) (new StringBuilder("iscache=")));
			((StringBuilder) (obj)).append(((String) (obj3)));
			((StringBuilder) (obj)).append(" caching conversion data");
			AFLogger.afDebugLog(obj.toString());
			if(AppsFlyerLib._mth02CB() == null)
				break MISSING_BLOCK_LABEL_910;
			j = ((Number) (_fld0971)).intValue();
			if(j > 1)
				break MISSING_BLOCK_LABEL_910;
			obj = ((Object) (AppsFlyerLib._mth02CA(context)));
			break MISSING_BLOCK_LABEL_836;
			obj;
			AFLogger.afErrorLog("Exception while trying to fetch attribution data. ", ((Throwable) (obj)));
			obj = ((Object) (map));
			_mth02CE(((Map) (obj)));
			break MISSING_BLOCK_LABEL_910;
			if(AppsFlyerLib._mth02CB() != null)
				_mth02CE("Error connection to server: ".concat(String.valueOf(j)), j);
			obj = ((Object) (new StringBuilder("AttributionIdFetcher response code: ")));
			((StringBuilder) (obj)).append(j);
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

		protected abstract void _mth02CE(String s1, int j);

		protected abstract void _mth02CE(Map map);

		private String _fld02CA;
		private AppsFlyerLib _fld02CB;
		WeakReference _fld02CE;
		private ScheduledExecutorService _fld02CF;
		private AtomicInteger _fld0971;

		a(Context context, String s1, ScheduledExecutorService scheduledexecutorservice)
		{
			_fld02CB = AppsFlyerLib.this;
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
			_fld02CA = s1;
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

	final class b extends a
	{

		public final String _mth02CB()
		{
			return ServerConfigHandler.getUrl("https://api.%s/install_data/v3/");
		//    0    0:ldc1            #20  <String "https://api.%s/install_data/v3/">
		//    1    2:invokestatic    #26  <Method String ServerConfigHandler.getUrl(String)>
		//    2    5:areturn         
		}

		protected final void _mth02CE(String s1, int j)
		{
			AppsFlyerLib._mth02CB().onInstallConversionFailure(s1);
		//    0    0:invokestatic    #31  <Method AppsFlyerConversionListener AppsFlyerLib._mth02CB()>
		//    1    3:aload_1         
		//    2    4:invokeinterface #37  <Method void AppsFlyerConversionListener.onInstallConversionFailure(String)>
			if(j >= 400 && j < 500)
		//*   3    9:iload_2         
		//*   4   10:sipush          400
		//*   5   13:icmplt          63
		//*   6   16:iload_2         
		//*   7   17:sipush          500
		//*   8   20:icmpge          63
			{
				j = AppsFlyerLib._mth02CB((Context)((Reference) (super._fld02CE)).get()).getInt("appsflyerConversionDataRequestRetries", 0);
		//    9   23:aload_0         
		//   10   24:getfield        #40  <Field WeakReference AppsFlyerLib$a._fld02CE>
		//   11   27:invokevirtual   #46  <Method Object Reference.get()>
		//   12   30:checkcast       #48  <Class Context>
		//   13   33:invokestatic    #51  <Method SharedPreferences AppsFlyerLib._mth02CB(Context)>
		//   14   36:ldc1            #53  <String "appsflyerConversionDataRequestRetries">
		//   15   38:iconst_0        
		//   16   39:invokeinterface #59  <Method int SharedPreferences.getInt(String, int)>
		//   17   44:istore_2        
				AppsFlyerLib._mth0971((Context)((Reference) (super._fld02CE)).get(), "appsflyerConversionDataRequestRetries", j + 1);
		//   18   45:aload_0         
		//   19   46:getfield        #40  <Field WeakReference AppsFlyerLib$a._fld02CE>
		//   20   49:invokevirtual   #46  <Method Object Reference.get()>
		//   21   52:checkcast       #48  <Class Context>
		//   22   55:ldc1            #53  <String "appsflyerConversionDataRequestRetries">
		//   23   57:iload_2         
		//   24   58:iconst_1        
		//   25   59:iadd            
		//   26   60:invokestatic    #63  <Method void AppsFlyerLib._mth0971(Context, String, int)>
			}
		//   27   63:return          
		}

		protected final void _mth02CE(Map map)
		{
			map.put("is_first_launch", ((Object) (Boolean.toString(true))));
		//    0    0:aload_1         
		//    1    1:ldc1            #66  <String "is_first_launch">
		//    2    3:iconst_1        
		//    3    4:invokestatic    #72  <Method String Boolean.toString(boolean)>
		//    4    7:invokeinterface #78  <Method Object Map.put(Object, Object)>
		//    5   12:pop             
			AppsFlyerLib._mth02CB().onInstallConversionDataLoaded(map);
		//    6   13:invokestatic    #31  <Method AppsFlyerConversionListener AppsFlyerLib._mth02CB()>
		//    7   16:aload_1         
		//    8   17:invokeinterface #81  <Method void AppsFlyerConversionListener.onInstallConversionDataLoaded(Map)>
			AppsFlyerLib._mth0971((Context)((Reference) (super._fld02CE)).get(), "appsflyerConversionDataRequestRetries", 0);
		//    9   22:aload_0         
		//   10   23:getfield        #40  <Field WeakReference AppsFlyerLib$a._fld02CE>
		//   11   26:invokevirtual   #46  <Method Object Reference.get()>
		//   12   29:checkcast       #48  <Class Context>
		//   13   32:ldc1            #53  <String "appsflyerConversionDataRequestRetries">
		//   14   34:iconst_0        
		//   15   35:invokestatic    #63  <Method void AppsFlyerLib._mth0971(Context, String, int)>
		//   16   38:return          
		}

		private AppsFlyerLib _fld02CF;

		public b(Context context, String s1, ScheduledExecutorService scheduledexecutorservice)
		{
			_fld02CF = AppsFlyerLib.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field AppsFlyerLib _fld02CF>
			super(context, s1, scheduledexecutorservice);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:aload_2         
		//    6    8:aload_3         
		//    7    9:aload           4
		//    8   11:invokespecial   #15  <Method void AppsFlyerLib$a(AppsFlyerLib, Context, String, ScheduledExecutorService)>
		//    9   14:return          
		}
	}

	final class c
		implements Runnable
	{

		public final void run()
		{
			if(AppsFlyerLib._mth02CB(_fld0971))
		//*   0    0:aload_0         
		//*   1    1:getfield        #18  <Field AppsFlyerLib _fld0971>
		//*   2    4:invokestatic    #35  <Method boolean AppsFlyerLib._mth02CB(AppsFlyerLib)>
		//*   3    7:ifeq            11
				return;
		//    4   10:return          
			AppsFlyerLib._mth02CA(_fld0971, System.currentTimeMillis());
		//    5   11:aload_0         
		//    6   12:getfield        #18  <Field AppsFlyerLib _fld0971>
		//    7   15:invokestatic    #41  <Method long System.currentTimeMillis()>
		//    8   18:invokestatic    #45  <Method long AppsFlyerLib._mth02CA(AppsFlyerLib, long)>
		//    9   21:pop2            
			if(_fld02CB == null)
		//*  10   22:aload_0         
		//*  11   23:getfield        #23  <Field WeakReference _fld02CB>
		//*  12   26:ifnonnull       30
				return;
		//   13   29:return          
			AppsFlyerLib._mth02CA(_fld0971, true);
		//   14   30:aload_0         
		//   15   31:getfield        #18  <Field AppsFlyerLib _fld0971>
		//   16   34:iconst_1        
		//   17   35:invokestatic    #48  <Method boolean AppsFlyerLib._mth02CA(AppsFlyerLib, boolean)>
		//   18   38:pop             
			String s1 = AppsFlyerLib._mth0971("AppsFlyerKey");
		//   19   39:ldc1            #50  <String "AppsFlyerKey">
		//   20   41:invokestatic    #53  <Method String AppsFlyerLib._mth0971(String)>
		//   21   44:astore          6
			WeakReference weakreference = _fld02CB;
		//   22   46:aload_0         
		//   23   47:getfield        #23  <Field WeakReference _fld02CB>
		//   24   50:astore          5
			weakreference;
		//   25   52:aload           5
			JVM INSTR monitorenter ;
		//   26   54:monitorenter    
			Iterator iterator = CacheManager.getInstance().getCachedRequests((Context)((Reference) (_fld02CB)).get()).iterator();
		//   27   55:invokestatic    #59  <Method CacheManager CacheManager.getInstance()>
		//   28   58:aload_0         
		//   29   59:getfield        #23  <Field WeakReference _fld02CB>
		//   30   62:invokevirtual   #65  <Method Object Reference.get()>
		//   31   65:checkcast       #67  <Class Context>
		//   32   68:invokevirtual   #71  <Method List CacheManager.getCachedRequests(Context)>
		//   33   71:invokeinterface #77  <Method Iterator List.iterator()>
		//   34   76:astore          7
_L1:
			RequestCacheData requestcachedata;
			if(!iterator.hasNext())
				break MISSING_BLOCK_LABEL_237;
		//   35   78:aload           7
		//   36   80:invokeinterface #83  <Method boolean Iterator.hasNext()>
		//   37   85:ifeq            237
			requestcachedata = (RequestCacheData)iterator.next();
		//   38   88:aload           7
		//   39   90:invokeinterface #86  <Method Object Iterator.next()>
		//   40   95:checkcast       #88  <Class RequestCacheData>
		//   41   98:astore          8
			StringBuilder stringbuilder = new StringBuilder("resending request: ");
		//   42  100:new             #90  <Class StringBuilder>
		//   43  103:dup             
		//   44  104:ldc1            #92  <String "resending request: ">
		//   45  106:invokespecial   #95  <Method void StringBuilder(String)>
		//   46  109:astore          9
			stringbuilder.append(requestcachedata.getRequestURL());
		//   47  111:aload           9
		//   48  113:aload           8
		//   49  115:invokevirtual   #99  <Method String RequestCacheData.getRequestURL()>
		//   50  118:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
		//   51  121:pop             
			AFLogger.afInfoLog(((Object) (stringbuilder)).toString());
		//   52  122:aload           9
		//   53  124:invokevirtual   #106 <Method String Object.toString()>
		//   54  127:invokestatic    #111 <Method void AFLogger.afInfoLog(String)>
			long l1 = System.currentTimeMillis();
		//   55  130:invokestatic    #41  <Method long System.currentTimeMillis()>
		//   56  133:lstore_1        
			long l2 = Long.parseLong(requestcachedata.getCacheKey(), 10);
		//   57  134:aload           8
		//   58  136:invokevirtual   #114 <Method String RequestCacheData.getCacheKey()>
		//   59  139:bipush          10
		//   60  141:invokestatic    #120 <Method long Long.parseLong(String, int)>
		//   61  144:lstore_3        
			AppsFlyerLib appsflyerlib = _fld0971;
		//   62  145:aload_0         
		//   63  146:getfield        #18  <Field AppsFlyerLib _fld0971>
		//   64  149:astore          9
			StringBuilder stringbuilder1 = new StringBuilder();
		//   65  151:new             #90  <Class StringBuilder>
		//   66  154:dup             
		//   67  155:invokespecial   #121 <Method void StringBuilder()>
		//   68  158:astore          10
			stringbuilder1.append(requestcachedata.getRequestURL());
		//   69  160:aload           10
		//   70  162:aload           8
		//   71  164:invokevirtual   #99  <Method String RequestCacheData.getRequestURL()>
		//   72  167:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
		//   73  170:pop             
			stringbuilder1.append("&isCachedRequest=true&timeincache=");
		//   74  171:aload           10
		//   75  173:ldc1            #123 <String "&isCachedRequest=true&timeincache=">
		//   76  175:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
		//   77  178:pop             
			stringbuilder1.append(Long.toString((l1 - l2) / 1000L));
		//   78  179:aload           10
		//   79  181:lload_1         
		//   80  182:lload_3         
		//   81  183:lsub            
		//   82  184:ldc2w           #124 <Long 1000L>
		//   83  187:ldiv            
		//   84  188:invokestatic    #128 <Method String Long.toString(long)>
		//   85  191:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
		//   86  194:pop             
			AppsFlyerLib._mth02CB(appsflyerlib, ((Object) (stringbuilder1)).toString(), requestcachedata.getPostData(), s1, _fld02CB, requestcachedata.getCacheKey(), false);
		//   87  195:aload           9
		//   88  197:aload           10
		//   89  199:invokevirtual   #106 <Method String Object.toString()>
		//   90  202:aload           8
		//   91  204:invokevirtual   #131 <Method String RequestCacheData.getPostData()>
		//   92  207:aload           6
		//   93  209:aload_0         
		//   94  210:getfield        #23  <Field WeakReference _fld02CB>
		//   95  213:aload           8
		//   96  215:invokevirtual   #114 <Method String RequestCacheData.getCacheKey()>
		//   97  218:iconst_0        
		//   98  219:invokestatic    #134 <Method void AppsFlyerLib._mth02CB(AppsFlyerLib, String, String, String, WeakReference, String, boolean)>
			  goto _L1
		//*  99  222:goto            78
			Exception exception1;
			exception1;
		//  100  225:astore          8
			AFLogger.afErrorLog("Failed to resend cached request", ((Throwable) (exception1)));
		//  101  227:ldc1            #136 <String "Failed to resend cached request">
		//  102  229:aload           8
		//  103  231:invokestatic    #140 <Method void AFLogger.afErrorLog(String, Throwable)>
			  goto _L1
		//* 104  234:goto            78
			weakreference;
		//  105  237:aload           5
			JVM INSTR monitorexit ;
		//  106  239:monitorexit     
			break MISSING_BLOCK_LABEL_265;
		//  107  240:goto            265
			Exception exception;
			exception;
		//  108  243:astore          6
			weakreference;
		//  109  245:aload           5
			JVM INSTR monitorexit ;
		//  110  247:monitorexit     
			throw exception;
		//  111  248:aload           6
		//  112  250:athrow          
			Object obj;
			obj;
		//  113  251:astore          5
			break MISSING_BLOCK_LABEL_295;
		//  114  253:goto            295
			obj;
		//  115  256:astore          5
			AFLogger.afErrorLog("failed to check cache. ", ((Throwable) (obj)));
		//  116  258:ldc1            #142 <String "failed to check cache. ">
		//  117  260:aload           5
		//  118  262:invokestatic    #140 <Method void AFLogger.afErrorLog(String, Throwable)>
			AppsFlyerLib._mth02CA(_fld0971, false);
		//  119  265:aload_0         
		//  120  266:getfield        #18  <Field AppsFlyerLib _fld0971>
		//  121  269:iconst_0        
		//  122  270:invokestatic    #48  <Method boolean AppsFlyerLib._mth02CA(AppsFlyerLib, boolean)>
		//  123  273:pop             
			AppsFlyerLib._mth02CE(_fld0971).shutdown();
		//  124  274:aload_0         
		//  125  275:getfield        #18  <Field AppsFlyerLib _fld0971>
		//  126  278:invokestatic    #146 <Method ScheduledExecutorService AppsFlyerLib._mth02CE(AppsFlyerLib)>
		//  127  281:invokeinterface #151 <Method void ScheduledExecutorService.shutdown()>
			AppsFlyerLib._mth0971(_fld0971);
		//  128  286:aload_0         
		//  129  287:getfield        #18  <Field AppsFlyerLib _fld0971>
		//  130  290:invokestatic    #153 <Method ScheduledExecutorService AppsFlyerLib._mth0971(AppsFlyerLib)>
		//  131  293:pop             
			return;
		//  132  294:return          
			AppsFlyerLib._mth02CA(_fld0971, false);
		//  133  295:aload_0         
		//  134  296:getfield        #18  <Field AppsFlyerLib _fld0971>
		//  135  299:iconst_0        
		//  136  300:invokestatic    #48  <Method boolean AppsFlyerLib._mth02CA(AppsFlyerLib, boolean)>
		//  137  303:pop             
			throw obj;
		//  138  304:aload           5
		//  139  306:athrow          
		}

		private WeakReference _fld02CB;
		private AppsFlyerLib _fld0971;

		public c(Context context)
		{
			_fld0971 = AppsFlyerLib.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field AppsFlyerLib _fld0971>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #21  <Method void Object()>
			_fld02CB = null;
		//    5    9:aload_0         
		//    6   10:aconst_null     
		//    7   11:putfield        #23  <Field WeakReference _fld02CB>
			_fld02CB = new WeakReference(((Object) (context)));
		//    8   14:aload_0         
		//    9   15:new             #25  <Class WeakReference>
		//   10   18:dup             
		//   11   19:aload_2         
		//   12   20:invokespecial   #28  <Method void WeakReference(Object)>
		//   13   23:putfield        #23  <Field WeakReference _fld02CB>
		//   14   26:return          
		}
	}

	final class d
		implements Runnable
	{

		public final void run()
		{
			AppsFlyerLib._mth02CA(_fld02BC, (Context)((Reference) (_fld02CB)).get(), _fld02CE, _fld0971, _fld02CA, _fld09710971, _fld02BB, _fld141D, _fld02CF);
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field AppsFlyerLib _fld02BC>
		//    2    4:aload_0         
		//    3    5:getfield        #35  <Field WeakReference _fld02CB>
		//    4    8:invokevirtual   #64  <Method Object Reference.get()>
		//    5   11:checkcast       #66  <Class Context>
		//    6   14:aload_0         
		//    7   15:getfield        #37  <Field String _fld02CE>
		//    8   18:aload_0         
		//    9   19:getfield        #39  <Field String _fld0971>
		//   10   22:aload_0         
		//   11   23:getfield        #41  <Field String _fld02CA>
		//   12   26:aload_0         
		//   13   27:getfield        #43  <Field String _fld09710971>
		//   14   30:aload_0         
		//   15   31:getfield        #45  <Field boolean _fld02BB>
		//   16   34:aload_0         
		//   17   35:getfield        #49  <Field boolean _fld141D>
		//   18   38:aload_0         
		//   19   39:getfield        #51  <Field Intent _fld02CF>
		//   20   42:invokestatic    #69  <Method void AppsFlyerLib._mth02CA(AppsFlyerLib, Context, String, String, String, String, boolean, boolean, Intent)>
		//   21   45:return          
		}

		private boolean _fld02BB;
		private AppsFlyerLib _fld02BC;
		private ExecutorService _fld02BD;
		private String _fld02CA;
		private WeakReference _fld02CB;
		private String _fld02CE;
		private final Intent _fld02CF;
		private String _fld0971;
		private String _fld09710971;
		private boolean _fld141D;

		private d(WeakReference weakreference, String s1, String s2, String s3, String s4, ExecutorService executorservice, 
				boolean flag, Intent intent)
		{
			_fld02BC = AppsFlyerLib.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #30  <Field AppsFlyerLib _fld02BC>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #33  <Method void Object()>
			_fld02CB = weakreference;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #35  <Field WeakReference _fld02CB>
			_fld02CE = s1;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #37  <Field String _fld02CE>
			_fld0971 = s2;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #39  <Field String _fld0971>
			_fld02CA = s3;
		//   14   25:aload_0         
		//   15   26:aload           5
		//   16   28:putfield        #41  <Field String _fld02CA>
			_fld09710971 = s4;
		//   17   31:aload_0         
		//   18   32:aload           6
		//   19   34:putfield        #43  <Field String _fld09710971>
			_fld02BB = true;
		//   20   37:aload_0         
		//   21   38:iconst_1        
		//   22   39:putfield        #45  <Field boolean _fld02BB>
			_fld02BD = executorservice;
		//   23   42:aload_0         
		//   24   43:aload           7
		//   25   45:putfield        #47  <Field ExecutorService _fld02BD>
			_fld141D = flag;
		//   26   48:aload_0         
		//   27   49:iload           8
		//   28   51:putfield        #49  <Field boolean _fld141D>
			_fld02CF = intent;
		//   29   54:aload_0         
		//   30   55:aload           9
		//   31   57:putfield        #51  <Field Intent _fld02CF>
		//   32   60:return          
		}

		d(WeakReference weakreference, String s1, String s2, String s3, String s4, ExecutorService executorservice, 
				boolean flag, Intent intent, byte byte0)
		{
			this(weakreference, s1, s2, s3, s4, executorservice, flag, intent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:aload           4
		//    5    6:aload           5
		//    6    8:aload           6
		//    7   10:aload           7
		//    8   12:iload           8
		//    9   14:aload           9
		//   10   16:invokespecial   #57  <Method void AppsFlyerLib$d(AppsFlyerLib, WeakReference, String, String, String, String, ExecutorService, boolean, Intent)>
		//   11   19:return          
		}
	}

	final class e
		implements Runnable
	{

		public final void run()
		{
			if(_fld02BC.isTrackingStopped())
		//*   0    0:aload_0         
		//*   1    1:getfield        #28  <Field AppsFlyerLib _fld02BC>
		//*   2    4:invokevirtual   #61  <Method boolean AppsFlyerLib.isTrackingStopped()>
		//*   3    7:ifeq            11
				return;
		//    4   10:return          
			String s1 = null;
		//    5   11:aconst_null     
		//    6   12:astore_1        
			if(_fld02CB && _fld02CE <= 2 && AppsFlyerLib._mth02CA(_fld02BC))
		//*   7   13:aload_0         
		//*   8   14:getfield        #44  <Field boolean _fld02CB>
		//*   9   17:ifeq            57
		//*  10   20:aload_0         
		//*  11   21:getfield        #46  <Field int _fld02CE>
		//*  12   24:iconst_2        
		//*  13   25:icmpgt          57
		//*  14   28:aload_0         
		//*  15   29:getfield        #28  <Field AppsFlyerLib _fld02BC>
		//*  16   32:invokestatic    #64  <Method boolean AppsFlyerLib._mth02CA(AppsFlyerLib)>
		//*  17   35:ifeq            57
				_fld02CF.put("rfr", ((Object) (AppsFlyerLib._mth02CF(_fld02BC))));
		//   18   38:aload_0         
		//   19   39:getfield        #37  <Field Map _fld02CF>
		//   20   42:ldc1            #66  <String "rfr">
		//   21   44:aload_0         
		//   22   45:getfield        #28  <Field AppsFlyerLib _fld02BC>
		//   23   48:invokestatic    #69  <Method Map AppsFlyerLib._mth02CF(AppsFlyerLib)>
		//   24   51:invokeinterface #75  <Method Object Map.put(Object, Object)>
		//   25   56:pop             
			String s2 = s1;
		//   26   57:aload_1         
		//   27   58:astore_2        
			String s3;
			JSONObject jsonobject;
			try
			{
				s3 = (String)_fld02CF.get("appsflyerKey");
		//   28   59:aload_0         
		//   29   60:getfield        #37  <Field Map _fld02CF>
		//   30   63:ldc1            #77  <String "appsflyerKey">
		//   31   65:invokeinterface #81  <Method Object Map.get(Object)>
		//   32   70:checkcast       #83  <Class String>
		//   33   73:astore_3        
			}
		//*  34   74:aload_1         
		//*  35   75:astore_2        
		//*  36   76:aload_0         
		//*  37   77:getfield        #37  <Field Map _fld02CF>
		//*  38   80:invokestatic    #89  <Method JSONObject AFHelper.convertToJsonObject(Map)>
		//*  39   83:astore          4
		//*  40   85:aload_1         
		//*  41   86:astore_2        
		//*  42   87:aload           4
		//*  43   89:instanceof      #91  <Class JSONObject>
		//*  44   92:ifne            106
		//*  45   95:aload_1         
		//*  46   96:astore_2        
		//*  47   97:aload           4
		//*  48   99:invokevirtual   #95  <Method String JSONObject.toString()>
		//*  49  102:astore_1        
		//*  50  103:goto            117
		//*  51  106:aload_1         
		//*  52  107:astore_2        
		//*  53  108:aload           4
		//*  54  110:checkcast       #91  <Class JSONObject>
		//*  55  113:invokestatic    #100 <Method String JSONObjectInstrumentation.toString(JSONObject)>
		//*  56  116:astore_1        
		//*  57  117:aload_1         
		//*  58  118:astore_2        
		//*  59  119:aload_0         
		//*  60  120:getfield        #28  <Field AppsFlyerLib _fld02BC>
		//*  61  123:aload_0         
		//*  62  124:getfield        #35  <Field String _fld0971>
		//*  63  127:aload_1         
		//*  64  128:aload_3         
		//*  65  129:aload_0         
		//*  66  130:getfield        #33  <Field WeakReference _fld02CA>
		//*  67  133:aconst_null     
		//*  68  134:aload_0         
		//*  69  135:getfield        #44  <Field boolean _fld02CB>
		//*  70  138:invokestatic    #103 <Method void AppsFlyerLib._mth02CB(AppsFlyerLib, String, String, String, WeakReference, String, boolean)>
		//*  71  141:return          
		//*  72  142:astore_1        
		//*  73  143:aload_1         
		//*  74  144:invokevirtual   #106 <Method String Throwable.getMessage()>
		//*  75  147:aload_1         
		//*  76  148:invokestatic    #112 <Method void AFLogger.afErrorLog(String, Throwable)>
		//*  77  151:return          
			catch(IOException ioexception)
		//*  78  152:astore_1        
			{
				AFLogger.afErrorLog("Exception while sending request to server. ", ((Throwable) (ioexception)));
		//   79  153:ldc1            #114 <String "Exception while sending request to server. ">
		//   80  155:aload_1         
		//   81  156:invokestatic    #112 <Method void AFLogger.afErrorLog(String, Throwable)>
				if(s2 != null && _fld02CA != null && !_fld0971.contains("&isCachedRequest=true&timeincache="))
		//*  82  159:aload_2         
		//*  83  160:ifnull          220
		//*  84  163:aload_0         
		//*  85  164:getfield        #33  <Field WeakReference _fld02CA>
		//*  86  167:ifnull          220
		//*  87  170:aload_0         
		//*  88  171:getfield        #35  <Field String _fld0971>
		//*  89  174:ldc1            #116 <String "&isCachedRequest=true&timeincache=">
		//*  90  176:invokevirtual   #120 <Method boolean String.contains(CharSequence)>
		//*  91  179:ifne            220
				{
					CacheManager.getInstance().cacheRequest(new RequestCacheData(_fld0971, s2, "4.8.9"), (Context)((Reference) (_fld02CA)).get());
		//   92  182:invokestatic    #126 <Method CacheManager CacheManager.getInstance()>
		//   93  185:new             #128 <Class RequestCacheData>
		//   94  188:dup             
		//   95  189:aload_0         
		//   96  190:getfield        #35  <Field String _fld0971>
		//   97  193:aload_2         
		//   98  194:ldc1            #130 <String "4.8.9">
		//   99  196:invokespecial   #133 <Method void RequestCacheData(String, String, String)>
		//  100  199:aload_0         
		//  101  200:getfield        #33  <Field WeakReference _fld02CA>
		//  102  203:invokevirtual   #138 <Method Object Reference.get()>
		//  103  206:checkcast       #140 <Class Context>
		//  104  209:invokevirtual   #144 <Method void CacheManager.cacheRequest(RequestCacheData, Context)>
					AFLogger.afErrorLog(((Throwable) (ioexception)).getMessage(), ((Throwable) (ioexception)));
		//  105  212:aload_1         
		//  106  213:invokevirtual   #106 <Method String Throwable.getMessage()>
		//  107  216:aload_1         
		//  108  217:invokestatic    #112 <Method void AFLogger.afErrorLog(String, Throwable)>
				}
				return;
		//  109  220:return          
			}
			catch(Throwable throwable)
			{
				AFLogger.afErrorLog(throwable.getMessage(), throwable);
				return;
			}
			s2 = s1;
			jsonobject = AFHelper.convertToJsonObject(_fld02CF);
			s2 = s1;
			if(jsonobject instanceof JSONObject)
				break MISSING_BLOCK_LABEL_106;
			s2 = s1;
			s1 = jsonobject.toString();
			break MISSING_BLOCK_LABEL_117;
			s2 = s1;
			s1 = JSONObjectInstrumentation.toString((JSONObject)jsonobject);
			s2 = s1;
			AppsFlyerLib._mth02CB(_fld02BC, _fld0971, s1, s3, _fld02CA, ((String) (null)), _fld02CB);
			return;
		}

		private AppsFlyerLib _fld02BC;
		private WeakReference _fld02CA;
		private boolean _fld02CB;
		private int _fld02CE;
		private Map _fld02CF;
		private String _fld0971;

		private e(String s1, Map map, Context context, boolean flag, int j)
		{
			_fld02BC = AppsFlyerLib.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #28  <Field AppsFlyerLib _fld02BC>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #31  <Method void Object()>
			_fld02CA = null;
		//    5    9:aload_0         
		//    6   10:aconst_null     
		//    7   11:putfield        #33  <Field WeakReference _fld02CA>
			_fld0971 = s1;
		//    8   14:aload_0         
		//    9   15:aload_2         
		//   10   16:putfield        #35  <Field String _fld0971>
			_fld02CF = map;
		//   11   19:aload_0         
		//   12   20:aload_3         
		//   13   21:putfield        #37  <Field Map _fld02CF>
			_fld02CA = new WeakReference(((Object) (context)));
		//   14   24:aload_0         
		//   15   25:new             #39  <Class WeakReference>
		//   16   28:dup             
		//   17   29:aload           4
		//   18   31:invokespecial   #42  <Method void WeakReference(Object)>
		//   19   34:putfield        #33  <Field WeakReference _fld02CA>
			_fld02CB = flag;
		//   20   37:aload_0         
		//   21   38:iload           5
		//   22   40:putfield        #44  <Field boolean _fld02CB>
			_fld02CE = j;
		//   23   43:aload_0         
		//   24   44:iload           6
		//   25   46:putfield        #46  <Field int _fld02CE>
		//   26   49:return          
		}

		e(String s1, Map map, Context context, boolean flag, int j, byte byte0)
		{
			this(s1, map, context, flag, j);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:aload           4
		//    5    6:iload           5
		//    6    8:iload           6
		//    7   10:invokespecial   #52  <Method void AppsFlyerLib$e(AppsFlyerLib, String, Map, Context, boolean, int)>
		//    8   13:return          
		}
	}


	private AppsFlyerLib()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #156 <Method void Object()>
		_fld02BC = -1L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #157 <Long -1L>
	//    4    8:putfield        #160 <Field long _fld02BC>
		_fld02CF0971 = -1L;
	//    5   11:aload_0         
	//    6   12:ldc2w           #157 <Long -1L>
	//    7   15:putfield        #162 <Field long _fld02CF0971>
		_fld097102CA = TimeUnit.SECONDS.toMillis(5L);
	//    8   18:aload_0         
	//    9   19:getstatic       #168 <Field TimeUnit TimeUnit.SECONDS>
	//   10   22:ldc2w           #169 <Long 5L>
	//   11   25:invokevirtual   #174 <Method long TimeUnit.toMillis(long)>
	//   12   28:putfield        #176 <Field long _fld097102CA>
		_fld097102CB = null;
	//   13   31:aload_0         
	//   14   32:aconst_null     
	//   15   33:putfield        #178 <Field a _fld097102CB>
		_fld141D0971 = false;
	//   16   36:aload_0         
	//   17   37:iconst_0        
	//   18   38:putfield        #180 <Field boolean _fld141D0971>
		_fld097102CE = null;
	//   19   41:aload_0         
	//   20   42:aconst_null     
	//   21   43:putfield        #182 <Field ScheduledExecutorService _fld097102CE>
		_fld02BE = null;
	//   22   46:aload_0         
	//   23   47:aconst_null     
	//   24   48:putfield        #184 <Field Uri _fld02BE>
		_fld02CA02CA = false;
	//   25   51:aload_0         
	//   26   52:iconst_0        
	//   27   53:putfield        #186 <Field boolean _fld02CA02CA>
		_fld02CB02CA = false;
	//   28   56:aload_0         
	//   29   57:iconst_0        
	//   30   58:putfield        #188 <Field boolean _fld02CB02CA>
		_fld02CD = new r();
	//   31   61:aload_0         
	//   32   62:new             #190 <Class r>
	//   33   65:dup             
	//   34   66:invokespecial   #191 <Method void r()>
	//   35   69:putfield        #193 <Field r _fld02CD>
		_fld02CB02CB = false;
	//   36   72:aload_0         
	//   37   73:iconst_0        
	//   38   74:putfield        #195 <Field boolean _fld02CB02CB>
		_fld02CB141D = false;
	//   39   77:aload_0         
	//   40   78:iconst_0        
	//   41   79:putfield        #197 <Field boolean _fld02CB141D>
		AFVersionDeclaration.init();
	//   42   82:invokestatic    #202 <Method void AFVersionDeclaration.init()>
	//   43   85:return          
	}

	public static AppsFlyerLib getInstance()
	{
		return _fld02BC0971;
	//    0    0:getstatic       #154 <Field AppsFlyerLib _fld02BC0971>
	//    1    3:areturn         
	}

	static long _mth02CA(AppsFlyerLib appsflyerlib, long l1)
	{
		appsflyerlib._fld02BB0971 = l1;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #207 <Field long _fld02BB0971>
		return l1;
	//    3    5:lload_1         
	//    4    6:lreturn         
	}

	static String _mth02CA(Context context, String s1)
		throws android.content.pm.PackageManager.NameNotFoundException
	{
		return _mth02CF(context, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #212 <Method String _mth02CF(Context, String)>
	//    3    5:areturn         
	}

	private static String _mth02CA(String s1, PackageManager packagemanager, String s2)
	{
		packagemanager = ((PackageManager) (((PackageItemInfo) (packagemanager.getApplicationInfo(s2, 128))).metaData));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:sipush          128
	//    3    5:invokevirtual   #223 <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//    4    8:getfield        #229 <Field Bundle PackageItemInfo.metaData>
	//    5   11:astore_1        
		if(packagemanager == null)
			break MISSING_BLOCK_LABEL_65;
	//    6   12:aload_1         
	//    7   13:ifnull          65
		packagemanager = ((PackageManager) (((Bundle) (packagemanager)).get(s1)));
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #235 <Method Object Bundle.get(String)>
	//   11   21:astore_1        
		if(packagemanager == null)
			break MISSING_BLOCK_LABEL_65;
	//   12   22:aload_1         
	//   13   23:ifnull          65
		packagemanager = ((PackageManager) (((Object) (packagemanager)).toString()));
	//   14   26:aload_1         
	//   15   27:invokevirtual   #108 <Method String Object.toString()>
	//   16   30:astore_1        
		return ((String) (packagemanager));
	//   17   31:aload_1         
	//   18   32:areturn         
		packagemanager;
	//   19   33:astore_1        
		s2 = ((String) (new StringBuilder("Could not find ")));
	//   20   34:new             #95  <Class StringBuilder>
	//   21   37:dup             
	//   22   38:ldc1            #237 <String "Could not find ">
	//   23   40:invokespecial   #115 <Method void StringBuilder(String)>
	//   24   43:astore_2        
		((StringBuilder) (s2)).append(s1);
	//   25   44:aload_2         
	//   26   45:aload_0         
	//   27   46:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   28   49:pop             
		((StringBuilder) (s2)).append(" value in the manifest");
	//   29   50:aload_2         
	//   30   51:ldc1            #239 <String " value in the manifest">
	//   31   53:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   32   56:pop             
		AFLogger.afErrorLog(((Object) (s2)).toString(), ((Throwable) (packagemanager)));
	//   33   57:aload_2         
	//   34   58:invokevirtual   #108 <Method String Object.toString()>
	//   35   61:aload_1         
	//   36   62:invokestatic    #245 <Method void AFLogger.afErrorLog(String, Throwable)>
		return null;
	//   37   65:aconst_null     
	//   38   66:areturn         
	}

	static String _mth02CA(WeakReference weakreference)
	{
		String s2 = AppsFlyerProperties.getInstance().getString("channel");
	//    0    0:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//    1    3:ldc1            #254 <String "channel">
	//    2    5:invokevirtual   #258 <Method String AppsFlyerProperties.getString(String)>
	//    3    8:astore_2        
		String s1 = s2;
	//    4    9:aload_2         
	//    5   10:astore_1        
		if(s2 == null)
	//*   6   11:aload_2         
	//*   7   12:ifnonnull       23
			s1 = _mth02CE(weakreference, "CHANNEL");
	//    8   15:aload_0         
	//    9   16:ldc2            #260 <String "CHANNEL">
	//   10   19:invokestatic    #263 <Method String _mth02CE(WeakReference, String)>
	//   11   22:astore_1        
		return s1;
	//   12   23:aload_1         
	//   13   24:areturn         
	}

	static Map _mth02CA(Context context)
		throws m
	{
		return _mth02CF(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #268 <Method Map _mth02CF(Context)>
	//    2    4:areturn         
	}

	static Map _mth02CA(String s1)
	{
		return _mth02CB(s1);
	//    0    0:aload_0         
	//    1    1:invokestatic    #271 <Method Map _mth02CB(String)>
	//    2    4:areturn         
	}

	private void _mth02CA(Application application)
	{
		AppsFlyerProperties.getInstance().loadProperties(((Context) (application)).getApplicationContext());
	//    0    0:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #278 <Method Context Context.getApplicationContext()>
	//    3    7:invokevirtual   #282 <Method void AppsFlyerProperties.loadProperties(Context)>
		if(android.os.Build.VERSION.SDK_INT >= 14)
	//*   4   10:getstatic       #288 <Field int android.os.Build$VERSION.SDK_INT>
	//*   5   13:bipush          14
	//*   6   15:icmplt          61
		{
			if(android.os.Build.VERSION.SDK_INT >= 14 && _fld02C8 == null)
	//*   7   18:getstatic       #288 <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   21:bipush          14
	//*   9   23:icmplt          94
	//*  10   26:aload_0         
	//*  11   27:getfield        #290 <Field p$b _fld02C8>
	//*  12   30:ifnonnull       94
			{
				p._mth02CE();
	//   13   33:invokestatic    #295 <Method p p._mth02CE()>
	//   14   36:pop             
				_fld02C8 = new p.b() {

					public final void _mth02CA(WeakReference weakreference)
					{
						Context context = ((Context)((Reference) (weakreference)).get()).getApplicationContext();
					//    0    0:aload_1         
					//    1    1:invokevirtual   #27  <Method Object Reference.get()>
					//    2    4:checkcast       #29  <Class Context>
					//    3    7:invokevirtual   #33  <Method Context Context.getApplicationContext()>
					//    4   10:astore_2        
						AFLogger.afInfoLog("onBecameBackground");
					//    5   11:ldc1            #35  <String "onBecameBackground">
					//    6   13:invokestatic    #41  <Method void AFLogger.afInfoLog(String)>
						AppsFlyerLib.getInstance()._mth02CE();
					//    7   16:invokestatic    #45  <Method AppsFlyerLib AppsFlyerLib.getInstance()>
					//    8   19:invokevirtual   #48  <Method void AppsFlyerLib._mth02CE()>
						AFLogger.afInfoLog("callStatsBackground background call");
					//    9   22:ldc1            #50  <String "callStatsBackground background call">
					//   10   24:invokestatic    #41  <Method void AFLogger.afInfoLog(String)>
						Object obj = ((Object) (new WeakReference(((Object) (context)))));
					//   11   27:new             #52  <Class WeakReference>
					//   12   30:dup             
					//   13   31:aload_2         
					//   14   32:invokespecial   #55  <Method void WeakReference(Object)>
					//   15   35:astore_3        
						AppsFlyerLib.getInstance()._mth02CF(((WeakReference) (obj)));
					//   16   36:invokestatic    #45  <Method AppsFlyerLib AppsFlyerLib.getInstance()>
					//   17   39:aload_3         
					//   18   40:invokevirtual   #58  <Method void AppsFlyerLib._mth02CF(WeakReference)>
						obj = ((Object) (v._mth02CB()));
					//   19   43:invokestatic    #64  <Method v v._mth02CB()>
					//   20   46:astore_3        
						if(((v) (obj))._mth02BB())
					//*  21   47:aload_3         
					//*  22   48:invokevirtual   #68  <Method boolean v._mth02BB()>
					//*  23   51:ifeq            80
						{
							((v) (obj))._mth02CE();
					//   24   54:aload_3         
					//   25   55:invokevirtual   #69  <Method void v._mth02CE()>
							if(context != null)
					//*  26   58:aload_2         
					//*  27   59:ifnull          73
								v._mth0971(context.getPackageName(), context.getPackageManager());
					//   28   62:aload_2         
					//   29   63:invokevirtual   #73  <Method String Context.getPackageName()>
					//   30   66:aload_2         
					//   31   67:invokevirtual   #77  <Method PackageManager Context.getPackageManager()>
					//   32   70:invokestatic    #81  <Method void v._mth0971(String, PackageManager)>
							((v) (obj))._mth02CA();
					//   33   73:aload_3         
					//   34   74:invokevirtual   #83  <Method void v._mth02CA()>
						} else
					//*  35   77:goto            85
						{
							AFLogger.afDebugLog("RD status is OFF");
					//   36   80:ldc1            #85  <String "RD status is OFF">
					//   37   82:invokestatic    #88  <Method void AFLogger.afDebugLog(String)>
						}
						AFExecutor.getInstance()._mth02CF();
					//   38   85:invokestatic    #93  <Method AFExecutor AFExecutor.getInstance()>
					//   39   88:invokevirtual   #95  <Method void AFExecutor._mth02CF()>
						weakreference = ((WeakReference) (g._mth0971((Context)((Reference) (weakreference)).get())));
					//   40   91:aload_1         
					//   41   92:invokevirtual   #27  <Method Object Reference.get()>
					//   42   95:checkcast       #29  <Class Context>
					//   43   98:invokestatic    #100 <Method g g._mth0971(Context)>
					//   44  101:astore_1        
						((g) (weakreference))._fld02CF.post(((g) (weakreference))._fld02BB);
					//   45  102:aload_1         
					//   46  103:getfield        #103 <Field Handler g._fld02CF>
					//   47  106:aload_1         
					//   48  107:getfield        #106 <Field Runnable g._fld02BB>
					//   49  110:invokevirtual   #112 <Method boolean Handler.post(Runnable)>
					//   50  113:pop             
					//   51  114:return          
					}

					public final void _mth02CB(Activity activity)
					{
						if(2 > AppsFlyerLib._mth0971(AppsFlyerLib._mth02CB(((Context) (activity)))))
					//*   0    0:iconst_2        
					//*   1    1:aload_1         
					//*   2    2:invokestatic    #118 <Method SharedPreferences AppsFlyerLib._mth02CB(Context)>
					//*   3    5:invokestatic    #121 <Method int AppsFlyerLib._mth0971(SharedPreferences)>
					//*   4    8:icmple          40
						{
							g g1 = g._mth0971(((Context) (activity)));
					//    5   11:aload_1         
					//    6   12:invokestatic    #100 <Method g g._mth0971(Context)>
					//    7   15:astore_2        
							g1._fld02CF.post(g1._fld02BB);
					//    8   16:aload_2         
					//    9   17:getfield        #103 <Field Handler g._fld02CF>
					//   10   20:aload_2         
					//   11   21:getfield        #106 <Field Runnable g._fld02BB>
					//   12   24:invokevirtual   #112 <Method boolean Handler.post(Runnable)>
					//   13   27:pop             
							g1._fld02CF.post(g1._fld0971);
					//   14   28:aload_2         
					//   15   29:getfield        #103 <Field Handler g._fld02CF>
					//   16   32:aload_2         
					//   17   33:getfield        #123 <Field Runnable g._fld0971>
					//   18   36:invokevirtual   #112 <Method boolean Handler.post(Runnable)>
					//   19   39:pop             
						}
						AFLogger.afInfoLog("onBecameForeground");
					//   20   40:ldc1            #125 <String "onBecameForeground">
					//   21   42:invokestatic    #41  <Method void AFLogger.afInfoLog(String)>
						AppsFlyerLib.getInstance()._mth02CA();
					//   22   45:invokestatic    #45  <Method AppsFlyerLib AppsFlyerLib.getInstance()>
					//   23   48:invokevirtual   #126 <Method void AppsFlyerLib._mth02CA()>
						AppsFlyerLib.getInstance()._mth02CB(((Context) (activity)), ((String) (null)), ((Map) (null)));
					//   24   51:invokestatic    #45  <Method AppsFlyerLib AppsFlyerLib.getInstance()>
					//   25   54:aload_1         
					//   26   55:aconst_null     
					//   27   56:aconst_null     
					//   28   57:invokevirtual   #129 <Method void AppsFlyerLib._mth02CB(Context, String, Map)>
						AFLogger.resetDeltaTime();
					//   29   60:invokestatic    #132 <Method void AFLogger.resetDeltaTime()>
					//   30   63:return          
					}

					private AppsFlyerLib _fld02CA;

			
			{
				_fld02CA = AppsFlyerLib.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field AppsFlyerLib _fld02CA>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
				}
;
	//   15   37:aload_0         
	//   16   38:new             #8   <Class AppsFlyerLib$2>
	//   17   41:dup             
	//   18   42:aload_0         
	//   19   43:invokespecial   #298 <Method void AppsFlyerLib$2(AppsFlyerLib)>
	//   20   46:putfield        #290 <Field p$b _fld02C8>
				p._mth02CF()._mth0971(application, _fld02C8);
	//   21   49:invokestatic    #300 <Method p p._mth02CF()>
	//   22   52:aload_1         
	//   23   53:aload_0         
	//   24   54:getfield        #290 <Field p$b _fld02C8>
	//   25   57:invokevirtual   #303 <Method void p._mth0971(Application, p$b)>
				return;
	//   26   60:return          
			}
		} else
		{
			AFLogger.afInfoLog("SDK<14 call trackEvent manually");
	//   27   61:ldc2            #305 <String "SDK<14 call trackEvent manually">
	//   28   64:invokestatic    #308 <Method void AFLogger.afInfoLog(String)>
			AFLogger.afInfoLog("onBecameForeground");
	//   29   67:ldc2            #310 <String "onBecameForeground">
	//   30   70:invokestatic    #308 <Method void AFLogger.afInfoLog(String)>
			getInstance()._fld02BF = System.currentTimeMillis();
	//   31   73:invokestatic    #312 <Method AppsFlyerLib getInstance()>
	//   32   76:invokestatic    #318 <Method long System.currentTimeMillis()>
	//   33   79:putfield        #320 <Field long _fld02BF>
			getInstance()._mth02CB(((Context) (application)), ((String) (null)), ((Map) (null)));
	//   34   82:invokestatic    #312 <Method AppsFlyerLib getInstance()>
	//   35   85:aload_1         
	//   36   86:aconst_null     
	//   37   87:aconst_null     
	//   38   88:invokevirtual   #323 <Method void _mth02CB(Context, String, Map)>
			AFLogger.resetDeltaTime();
	//   39   91:invokestatic    #326 <Method void AFLogger.resetDeltaTime()>
		}
	//   40   94:return          
	}

	static void _mth02CA(Context context, String s1, long l1)
	{
		_mth0971(context, s1, l1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:invokestatic    #329 <Method void _mth0971(Context, String, long)>
	//    4    6:return          
	}

	static void _mth02CA(Context context, String s1, String s2)
	{
		_mth02CF(context, s1, s2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #332 <Method void _mth02CF(Context, String, String)>
	//    4    6:return          
	}

	private static void _mth02CA(Context context, String s1, String s2, String s3)
	{
		if(AppsFlyerProperties.getInstance().getBoolean("shouldMonitor", false))
	//*   0    0:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//*   1    3:ldc2            #335 <String "shouldMonitor">
	//*   2    6:iconst_0        
	//*   3    7:invokevirtual   #339 <Method boolean AppsFlyerProperties.getBoolean(String, boolean)>
	//*   4   10:ifeq            112
		{
			Intent intent = new Intent("com.appsflyer.MonitorBroadcast");
	//    5   13:new             #341 <Class Intent>
	//    6   16:dup             
	//    7   17:ldc2            #343 <String "com.appsflyer.MonitorBroadcast">
	//    8   20:invokespecial   #344 <Method void Intent(String)>
	//    9   23:astore          4
			intent.setPackage("com.appsflyer.nightvision");
	//   10   25:aload           4
	//   11   27:ldc2            #346 <String "com.appsflyer.nightvision">
	//   12   30:invokevirtual   #350 <Method Intent Intent.setPackage(String)>
	//   13   33:pop             
			intent.putExtra("message", s2);
	//   14   34:aload           4
	//   15   36:ldc2            #352 <String "message">
	//   16   39:aload_2         
	//   17   40:invokevirtual   #356 <Method Intent Intent.putExtra(String, String)>
	//   18   43:pop             
			intent.putExtra("value", s3);
	//   19   44:aload           4
	//   20   46:ldc2            #358 <String "value">
	//   21   49:aload_3         
	//   22   50:invokevirtual   #356 <Method Intent Intent.putExtra(String, String)>
	//   23   53:pop             
			intent.putExtra("packageName", "true");
	//   24   54:aload           4
	//   25   56:ldc2            #360 <String "packageName">
	//   26   59:ldc2            #362 <String "true">
	//   27   62:invokevirtual   #356 <Method Intent Intent.putExtra(String, String)>
	//   28   65:pop             
			intent.putExtra("pid", ((java.io.Serializable) (new Integer(Process.myPid()))));
	//   29   66:aload           4
	//   30   68:ldc2            #364 <String "pid">
	//   31   71:new             #366 <Class Integer>
	//   32   74:dup             
	//   33   75:invokestatic    #372 <Method int Process.myPid()>
	//   34   78:invokespecial   #375 <Method void Integer(int)>
	//   35   81:invokevirtual   #378 <Method Intent Intent.putExtra(String, java.io.Serializable)>
	//   36   84:pop             
			intent.putExtra("eventIdentifier", s1);
	//   37   85:aload           4
	//   38   87:ldc2            #380 <String "eventIdentifier">
	//   39   90:aload_1         
	//   40   91:invokevirtual   #356 <Method Intent Intent.putExtra(String, String)>
	//   41   94:pop             
			intent.putExtra("sdk", "4.8.9");
	//   42   95:aload           4
	//   43   97:ldc2            #382 <String "sdk">
	//   44  100:ldc1            #79  <String "4.8.9">
	//   45  102:invokevirtual   #356 <Method Intent Intent.putExtra(String, String)>
	//   46  105:pop             
			context.sendBroadcast(intent);
	//   47  106:aload_0         
	//   48  107:aload           4
	//   49  109:invokevirtual   #386 <Method void Context.sendBroadcast(Intent)>
		}
	//   50  112:return          
	}

	private void _mth02CA(Context context, String s1, String s2, String s3, String s4, Intent intent)
	{
		context = context.getApplicationContext();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #278 <Method Context Context.getApplicationContext()>
	//    2    4:astore_1        
		boolean flag2 = false;
	//    3    5:iconst_0        
	//    4    6:istore          9
		boolean flag;
		if(s2 == null)
	//*   5    8:aload_3         
	//*   6    9:ifnonnull       18
			flag = true;
	//    7   12:iconst_1        
	//    8   13:istore          7
		else
	//*   9   15:goto            21
			flag = false;
	//   10   18:iconst_0        
	//   11   19:istore          7
		boolean flag1 = flag2;
	//   12   21:iload           9
	//   13   23:istore          8
		if(AppsFlyerProperties.getInstance().getBoolean("waitForCustomerId", false))
	//*  14   25:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//*  15   28:ldc2            #389 <String "waitForCustomerId">
	//*  16   31:iconst_0        
	//*  17   32:invokevirtual   #339 <Method boolean AppsFlyerProperties.getBoolean(String, boolean)>
	//*  18   35:ifeq            57
		{
			flag1 = flag2;
	//   19   38:iload           9
	//   20   40:istore          8
			if(AppsFlyerProperties.getInstance().getString("AppUserId") == null)
	//*  21   42:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//*  22   45:ldc2            #391 <String "AppUserId">
	//*  23   48:invokevirtual   #258 <Method String AppsFlyerProperties.getString(String)>
	//*  24   51:ifnonnull       57
				flag1 = true;
	//   25   54:iconst_1        
	//   26   55:istore          8
		}
		if(flag1)
	//*  27   57:iload           8
	//*  28   59:ifeq            70
		{
			AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
	//   29   62:ldc2            #393 <String "CustomerUserId not set, Tracking is disabled">
	//   30   65:iconst_1        
	//   31   66:invokestatic    #396 <Method void AFLogger.afInfoLog(String, boolean)>
			return;
	//   32   69:return          
		}
		if(flag)
	//*  33   70:iload           7
	//*  34   72:ifeq            112
		{
			if(AppsFlyerProperties.getInstance().getBoolean("launchProtectEnabled", true))
	//*  35   75:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//*  36   78:ldc2            #398 <String "launchProtectEnabled">
	//*  37   81:iconst_1        
	//*  38   82:invokevirtual   #339 <Method boolean AppsFlyerProperties.getBoolean(String, boolean)>
	//*  39   85:ifeq            96
			{
				if(_mth02CF())
	//*  40   88:aload_0         
	//*  41   89:invokespecial   #401 <Method boolean _mth02CF()>
	//*  42   92:ifeq            102
					return;
	//   43   95:return          
			} else
			{
				AFLogger.afInfoLog("Allowing multiple launches within a 5 second time window.");
	//   44   96:ldc2            #403 <String "Allowing multiple launches within a 5 second time window.">
	//   45   99:invokestatic    #308 <Method void AFLogger.afInfoLog(String)>
			}
			_fld02BC = System.currentTimeMillis();
	//   46  102:aload_0         
	//   47  103:invokestatic    #318 <Method long System.currentTimeMillis()>
	//   48  106:putfield        #160 <Field long _fld02BC>
		}
	//*  49  109:goto            112
		java.util.concurrent.ScheduledThreadPoolExecutor scheduledthreadpoolexecutor = AFExecutor.getInstance()._mth02CB();
	//   50  112:invokestatic    #408 <Method AFExecutor AFExecutor.getInstance()>
	//   51  115:invokevirtual   #411 <Method java.util.concurrent.ScheduledThreadPoolExecutor AFExecutor._mth02CB()>
	//   52  118:astore          10
		_mth0971(((ScheduledExecutorService) (scheduledthreadpoolexecutor)), ((Runnable) (new d(new WeakReference(((Object) (context))), s1, s2, s3, s4, ((ExecutorService) (scheduledthreadpoolexecutor)), false, intent, (byte)0))), 150L, TimeUnit.MILLISECONDS);
	//   53  120:aload           10
	//   54  122:new             #21  <Class AppsFlyerLib$d>
	//   55  125:dup             
	//   56  126:aload_0         
	//   57  127:new             #413 <Class WeakReference>
	//   58  130:dup             
	//   59  131:aload_1         
	//   60  132:invokespecial   #416 <Method void WeakReference(Object)>
	//   61  135:aload_2         
	//   62  136:aload_3         
	//   63  137:aload           4
	//   64  139:aload           5
	//   65  141:aload           10
	//   66  143:iconst_0        
	//   67  144:aload           6
	//   68  146:iconst_0        
	//   69  147:invokespecial   #419 <Method void AppsFlyerLib$d(AppsFlyerLib, WeakReference, String, String, String, String, ExecutorService, boolean, Intent, byte)>
	//   70  150:ldc2w           #420 <Long 150L>
	//   71  153:getstatic       #424 <Field TimeUnit TimeUnit.MILLISECONDS>
	//   72  156:invokestatic    #427 <Method void _mth0971(ScheduledExecutorService, Runnable, long, TimeUnit)>
	//   73  159:return          
	}

	private void _mth02CA(Context context, Map map, Uri uri)
	{
		map.put("af_deeplink", ((Object) (((Object) (uri)).toString())));
	//    0    0:aload_2         
	//    1    1:ldc2            #430 <String "af_deeplink">
	//    2    4:aload_3         
	//    3    5:invokevirtual   #108 <Method String Object.toString()>
	//    4    8:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//    5   13:pop             
		if(uri.getQueryParameter("af_deeplink") != null)
	//*   6   14:aload_3         
	//*   7   15:ldc2            #430 <String "af_deeplink">
	//*   8   18:invokevirtual   #441 <Method String Uri.getQueryParameter(String)>
	//*   9   21:ifnull          159
		{
			map = ((Map) (uri.getQueryParameter("media_source")));
	//   10   24:aload_3         
	//   11   25:ldc2            #443 <String "media_source">
	//   12   28:invokevirtual   #441 <Method String Uri.getQueryParameter(String)>
	//   13   31:astore_2        
			Object obj = ((Object) (uri.getQueryParameter("is_retargeting")));
	//   14   32:aload_3         
	//   15   33:ldc2            #445 <String "is_retargeting">
	//   16   36:invokevirtual   #441 <Method String Uri.getQueryParameter(String)>
	//   17   39:astore          5
			boolean flag;
			if(((Object) ("AppsFlyer_Test")).equals(((Object) (map))) && Boolean.parseBoolean(((String) (obj))))
	//*  18   41:ldc2            #447 <String "AppsFlyer_Test">
	//*  19   44:aload_2         
	//*  20   45:invokevirtual   #451 <Method boolean Object.equals(Object)>
	//*  21   48:ifeq            65
	//*  22   51:aload           5
	//*  23   53:invokestatic    #457 <Method boolean Boolean.parseBoolean(String)>
	//*  24   56:ifeq            65
				flag = true;
	//   25   59:iconst_1        
	//   26   60:istore          4
			else
	//*  27   62:goto            68
				flag = false;
	//   28   65:iconst_0        
	//   29   66:istore          4
			_fld02CB02CA = flag;
	//   30   68:aload_0         
	//   31   69:iload           4
	//   32   71:putfield        #188 <Field boolean _fld02CB02CA>
			obj = ((Object) (_mth02CB(context, uri.getQuery())));
	//   33   74:aload_1         
	//   34   75:aload_3         
	//   35   76:invokevirtual   #460 <Method String Uri.getQuery()>
	//   36   79:invokestatic    #463 <Method Map _mth02CB(Context, String)>
	//   37   82:astore          5
			map = ((Map) (uri.getPath()));
	//   38   84:aload_3         
	//   39   85:invokevirtual   #466 <Method String Uri.getPath()>
	//   40   88:astore_2        
			if(map != null)
	//*  41   89:aload_2         
	//*  42   90:ifnull          105
				((Map) (obj)).put("path", ((Object) (map)));
	//   43   93:aload           5
	//   44   95:ldc2            #468 <String "path">
	//   45   98:aload_2         
	//   46   99:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//   47  104:pop             
			map = ((Map) (uri.getScheme()));
	//   48  105:aload_3         
	//   49  106:invokevirtual   #471 <Method String Uri.getScheme()>
	//   50  109:astore_2        
			if(map != null)
	//*  51  110:aload_2         
	//*  52  111:ifnull          126
				((Map) (obj)).put("scheme", ((Object) (map)));
	//   53  114:aload           5
	//   54  116:ldc2            #473 <String "scheme">
	//   55  119:aload_2         
	//   56  120:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//   57  125:pop             
			String s1 = uri.getHost();
	//   58  126:aload_3         
	//   59  127:invokevirtual   #476 <Method String Uri.getHost()>
	//   60  130:astore          6
			map = ((Map) (obj));
	//   61  132:aload           5
	//   62  134:astore_2        
			if(s1 != null)
	//*  63  135:aload           6
	//*  64  137:ifnull          181
			{
				((Map) (obj)).put("host", ((Object) (s1)));
	//   65  140:aload           5
	//   66  142:ldc2            #478 <String "host">
	//   67  145:aload           6
	//   68  147:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//   69  152:pop             
				map = ((Map) (obj));
	//   70  153:aload           5
	//   71  155:astore_2        
			}
		} else
	//*  72  156:goto            181
		{
			map = ((Map) (new HashMap()));
	//   73  159:new             #480 <Class HashMap>
	//   74  162:dup             
	//   75  163:invokespecial   #481 <Method void HashMap()>
	//   76  166:astore_2        
			map.put("link", ((Object) (((Object) (uri)).toString())));
	//   77  167:aload_2         
	//   78  168:ldc2            #483 <String "link">
	//   79  171:aload_3         
	//   80  172:invokevirtual   #108 <Method String Object.toString()>
	//   81  175:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//   82  180:pop             
		}
		context = ((Context) (new WeakReference(((Object) (context)))));
	//   83  181:new             #413 <Class WeakReference>
	//   84  184:dup             
	//   85  185:aload_1         
	//   86  186:invokespecial   #416 <Method void WeakReference(Object)>
	//   87  189:astore_1        
		uri = ((Uri) (new t(uri, this)));
	//   88  190:new             #485 <Class t>
	//   89  193:dup             
	//   90  194:aload_3         
	//   91  195:aload_0         
	//   92  196:invokespecial   #488 <Method void t(Uri, AppsFlyerLib)>
	//   93  199:astore_3        
		((OneLinkHttpTask) (uri)).setConnProvider(new OneLinkHttpTask.HttpsUrlConnectionProvider());
	//   94  200:aload_3         
	//   95  201:new             #490 <Class OneLinkHttpTask$HttpsUrlConnectionProvider>
	//   96  204:dup             
	//   97  205:invokespecial   #491 <Method void OneLinkHttpTask$HttpsUrlConnectionProvider()>
	//   98  208:invokevirtual   #497 <Method void OneLinkHttpTask.setConnProvider(OneLinkHttpTask$HttpsUrlConnectionProvider)>
		if(((t) (uri))._mth0971())
	//*  99  211:aload_3         
	//* 100  212:invokevirtual   #499 <Method boolean t._mth0971()>
	//* 101  215:ifeq            245
		{
			((t) (uri))._mth0971(new t.b(map, ((WeakReference) (context))) {

				private void _mth02CA(Map map1)
				{
					if(((Reference) (_fld02CA)).get() != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #23  <Field WeakReference _fld02CA>
				//*   2    4:invokevirtual   #34  <Method Object Reference.get()>
				//*   3    7:ifnull          58
					{
						map1 = ((Map) (new JSONObject(map1)));
				//    4   10:new             #36  <Class JSONObject>
				//    5   13:dup             
				//    6   14:aload_1         
				//    7   15:invokespecial   #38  <Method void JSONObject(Map)>
				//    8   18:astore_1        
						if(!(map1 instanceof JSONObject))
				//*   9   19:aload_1         
				//*  10   20:instanceof      #36  <Class JSONObject>
				//*  11   23:ifne            34
							map1 = ((Map) (((JSONObject) (map1)).toString()));
				//   12   26:aload_1         
				//   13   27:invokevirtual   #42  <Method String JSONObject.toString()>
				//   14   30:astore_1        
						else
				//*  15   31:goto            42
							map1 = ((Map) (JSONObjectInstrumentation.toString((JSONObject)map1)));
				//   16   34:aload_1         
				//   17   35:checkcast       #36  <Class JSONObject>
				//   18   38:invokestatic    #47  <Method String JSONObjectInstrumentation.toString(JSONObject)>
				//   19   41:astore_1        
						AppsFlyerLib._mth02CA((Context)((Reference) (_fld02CA)).get(), "deeplinkAttribution", ((String) (map1)));
				//   20   42:aload_0         
				//   21   43:getfield        #23  <Field WeakReference _fld02CA>
				//   22   46:invokevirtual   #34  <Method Object Reference.get()>
				//   23   49:checkcast       #49  <Class Context>
				//   24   52:ldc1            #51  <String "deeplinkAttribution">
				//   25   54:aload_1         
				//   26   55:invokestatic    #54  <Method void AppsFlyerLib._mth02CA(Context, String, String)>
					}
				//   27   58:return          
				}

				public final void _mth02CE(Map map1)
				{
					String s2;
					for(Iterator iterator = map1.keySet().iterator(); iterator.hasNext(); _fld02CF.put(((Object) (s2)), map1.get(((Object) (s2)))))
				//*   0    0:aload_1         
				//*   1    1:invokeinterface #63  <Method Set Map.keySet()>
				//*   2    6:invokeinterface #69  <Method Iterator Set.iterator()>
				//*   3   11:astore_2        
				//*   4   12:aload_2         
				//*   5   13:invokeinterface #75  <Method boolean Iterator.hasNext()>
				//*   6   18:ifeq            52
						s2 = (String)iterator.next();
				//    7   21:aload_2         
				//    8   22:invokeinterface #78  <Method Object Iterator.next()>
				//    9   27:checkcast       #80  <Class String>
				//   10   30:astore_3        

				//   11   31:aload_0         
				//   12   32:getfield        #21  <Field Map _fld02CF>
				//   13   35:aload_3         
				//   14   36:aload_1         
				//   15   37:aload_3         
				//   16   38:invokeinterface #83  <Method Object Map.get(Object)>
				//   17   43:invokeinterface #87  <Method Object Map.put(Object, Object)>
				//   18   48:pop             
				//*  19   49:goto            12
					_mth02CA(_fld02CF);
				//   20   52:aload_0         
				//   21   53:aload_0         
				//   22   54:getfield        #21  <Field Map _fld02CF>
				//   23   57:invokespecial   #89  <Method void _mth02CA(Map)>
					AppsFlyerLib._mth02CF(_fld02CF);
				//   24   60:aload_0         
				//   25   61:getfield        #21  <Field Map _fld02CF>
				//   26   64:invokestatic    #91  <Method void AppsFlyerLib._mth02CF(Map)>
				//   27   67:return          
				}

				public final void _mth0971(String s2)
				{
					if(AppsFlyerLib._mth02CB() != null)
				//*   0    0:invokestatic    #96  <Method AppsFlyerConversionListener AppsFlyerLib._mth02CB()>
				//*   1    3:ifnull          23
					{
						_mth02CA(_fld02CF);
				//    2    6:aload_0         
				//    3    7:aload_0         
				//    4    8:getfield        #21  <Field Map _fld02CF>
				//    5   11:invokespecial   #89  <Method void _mth02CA(Map)>
						AppsFlyerLib._mth02CB().onAttributionFailure(s2);
				//    6   14:invokestatic    #96  <Method AppsFlyerConversionListener AppsFlyerLib._mth02CB()>
				//    7   17:aload_1         
				//    8   18:invokeinterface #101 <Method void AppsFlyerConversionListener.onAttributionFailure(String)>
					}
				//    9   23:return          
				}

				private WeakReference _fld02CA;
				private Map _fld02CF;
				private AppsFlyerLib _fld0971;

			
			{
				_fld0971 = AppsFlyerLib.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AppsFlyerLib _fld0971>
				_fld02CF = map;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Map _fld02CF>
				_fld02CA = weakreference;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #23  <Field WeakReference _fld02CA>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #26  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//  102  218:aload_3         
	//  103  219:new             #10  <Class AppsFlyerLib$4>
	//  104  222:dup             
	//  105  223:aload_0         
	//  106  224:aload_2         
	//  107  225:aload_1         
	//  108  226:invokespecial   #502 <Method void AppsFlyerLib$4(AppsFlyerLib, Map, WeakReference)>
	//  109  229:invokevirtual   #505 <Method void t._mth0971(t$b)>
			AFExecutor.getInstance().getThreadPoolExecutor().execute(((Runnable) (uri)));
	//  110  232:invokestatic    #408 <Method AFExecutor AFExecutor.getInstance()>
	//  111  235:invokevirtual   #509 <Method Executor AFExecutor.getThreadPoolExecutor()>
	//  112  238:aload_3         
	//  113  239:invokeinterface #515 <Method void Executor.execute(Runnable)>
			return;
	//  114  244:return          
		}
		context = ((Context) (_fld02CB0971));
	//  115  245:getstatic       #149 <Field AppsFlyerConversionListener _fld02CB0971>
	//  116  248:astore_1        
		if(context != null)
	//* 117  249:aload_1         
	//* 118  250:ifnull          270
			try
			{
				((AppsFlyerConversionListener) (context)).onAppOpenAttribution(map);
	//  119  253:aload_1         
	//  120  254:aload_2         
	//  121  255:invokeinterface #521 <Method void AppsFlyerConversionListener.onAppOpenAttribution(Map)>
				return;
	//  122  260:return          
			}
			// Misplaced declaration of an exception variable
			catch(Context context)
	//* 123  261:astore_1        
			{
				AFLogger.afErrorLog(((Throwable) (context)).getLocalizedMessage(), ((Throwable) (context)));
	//  124  262:aload_1         
	//  125  263:invokevirtual   #524 <Method String Throwable.getLocalizedMessage()>
	//  126  266:aload_1         
	//  127  267:invokestatic    #245 <Method void AFLogger.afErrorLog(String, Throwable)>
			}
	//  128  270:return          
	}

	static void _mth02CA(AppsFlyerLib appsflyerlib, Context context, String s1, String s2, String s3, String s4, boolean flag, boolean flag1, 
			Intent intent)
	{
		if(context == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       11
		{
			AFLogger.afDebugLog("sendTrackingWithEvent - got null context. skipping event/launch.");
	//    2    4:ldc2            #529 <String "sendTrackingWithEvent - got null context. skipping event/launch.">
	//    3    7:invokestatic    #532 <Method void AFLogger.afDebugLog(String)>
			return;
	//    4   10:return          
		}
		boolean flag3 = false;
	//    5   11:iconst_0        
	//    6   12:istore          10
		SharedPreferences sharedpreferences = context.getSharedPreferences("appsflyer-data", 0);
	//    7   14:aload_1         
	//    8   15:ldc2            #534 <String "appsflyer-data">
	//    9   18:iconst_0        
	//   10   19:invokevirtual   #538 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   11   22:astore          12
		AppsFlyerProperties.getInstance().saveProperties(sharedpreferences);
	//   12   24:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//   13   27:aload           12
	//   14   29:invokevirtual   #542 <Method void AppsFlyerProperties.saveProperties(SharedPreferences)>
		if(!appsflyerlib.isTrackingStopped())
	//*  15   32:aload_0         
	//*  16   33:invokevirtual   #545 <Method boolean isTrackingStopped()>
	//*  17   36:ifne            72
		{
			StringBuilder stringbuilder = new StringBuilder("sendTrackingWithEvent from activity: ");
	//   18   39:new             #95  <Class StringBuilder>
	//   19   42:dup             
	//   20   43:ldc2            #547 <String "sendTrackingWithEvent from activity: ">
	//   21   46:invokespecial   #115 <Method void StringBuilder(String)>
	//   22   49:astore          13
			stringbuilder.append(((Object) (context)).getClass().getName());
	//   23   51:aload           13
	//   24   53:aload_1         
	//   25   54:invokevirtual   #551 <Method Class Object.getClass()>
	//   26   57:invokevirtual   #556 <Method String Class.getName()>
	//   27   60:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   28   63:pop             
			AFLogger.afInfoLog(((Object) (stringbuilder)).toString());
	//   29   64:aload           13
	//   30   66:invokevirtual   #108 <Method String Object.toString()>
	//   31   69:invokestatic    #308 <Method void AFLogger.afInfoLog(String)>
		}
		boolean flag4;
		if(s2 == null)
	//*  32   72:aload_3         
	//*  33   73:ifnonnull       82
			flag4 = true;
	//   34   76:iconst_1        
	//   35   77:istore          11
		else
	//*  36   79:goto            85
			flag4 = false;
	//   37   82:iconst_0        
	//   38   83:istore          11
		s2 = ((String) (appsflyerlib._mth02CF(context, s1, s2, s3, s4, flag, sharedpreferences, flag4, intent)));
	//   39   85:aload_0         
	//   40   86:aload_1         
	//   41   87:aload_2         
	//   42   88:aload_3         
	//   43   89:aload           4
	//   44   91:aload           5
	//   45   93:iload           6
	//   46   95:aload           12
	//   47   97:iload           11
	//   48   99:aload           8
	//   49  101:invokevirtual   #559 <Method Map _mth02CF(Context, String, String, String, String, boolean, SharedPreferences, boolean, Intent)>
	//   50  104:astore_3        
		s1 = (String)((Map) (s2)).get("appsflyerKey");
	//   51  105:aload_3         
	//   52  106:ldc2            #561 <String "appsflyerKey">
	//   53  109:invokeinterface #564 <Method Object Map.get(Object)>
	//   54  114:checkcast       #83  <Class String>
	//   55  117:astore_2        
		if(s1 != null && s1.length() != 0)
	//*  56  118:aload_2         
	//*  57  119:ifnull          317
	//*  58  122:aload_2         
	//*  59  123:invokevirtual   #567 <Method int String.length()>
	//*  60  126:ifne            132
	//*  61  129:goto            317
		{
			if(!appsflyerlib.isTrackingStopped())
	//*  62  132:aload_0         
	//*  63  133:invokevirtual   #545 <Method boolean isTrackingStopped()>
	//*  64  136:ifne            145
				AFLogger.afInfoLog("AppsFlyerLib.sendTrackingWithEvent");
	//   65  139:ldc2            #569 <String "AppsFlyerLib.sendTrackingWithEvent">
	//   66  142:invokestatic    #308 <Method void AFLogger.afInfoLog(String)>
			if(flag4)
	//*  67  145:iload           11
	//*  68  147:ifeq            169
			{
				if(flag1)
	//*  69  150:iload           7
	//*  70  152:ifeq            162
					s1 = _fld09710971;
	//   71  155:getstatic       #117 <Field String _fld09710971>
	//   72  158:astore_2        
				else
	//*  73  159:goto            173
					s1 = _fld02BD;
	//   74  162:getstatic       #121 <Field String _fld02BD>
	//   75  165:astore_2        
			} else
	//*  76  166:goto            173
			{
				s1 = _fld02BB;
	//   77  169:getstatic       #125 <Field String _fld02BB>
	//   78  172:astore_2        
			}
			s1 = ServerConfigHandler.getUrl(s1);
	//   79  173:aload_2         
	//   80  174:invokestatic    #574 <Method String ServerConfigHandler.getUrl(String)>
	//   81  177:astore_2        
			s3 = ((String) (new StringBuilder()));
	//   82  178:new             #95  <Class StringBuilder>
	//   83  181:dup             
	//   84  182:invokespecial   #98  <Method void StringBuilder()>
	//   85  185:astore          4
			((StringBuilder) (s3)).append(s1);
	//   86  187:aload           4
	//   87  189:aload_2         
	//   88  190:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   89  193:pop             
			((StringBuilder) (s3)).append(context.getPackageName());
	//   90  194:aload           4
	//   91  196:aload_1         
	//   92  197:invokevirtual   #577 <Method String Context.getPackageName()>
	//   93  200:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   94  203:pop             
			s1 = ((Object) (s3)).toString();
	//   95  204:aload           4
	//   96  206:invokevirtual   #108 <Method String Object.toString()>
	//   97  209:astore_2        
			int j = _mth02CE(sharedpreferences, "appsFlyerCount", false);
	//   98  210:aload           12
	//   99  212:ldc2            #579 <String "appsFlyerCount">
	//  100  215:iconst_0        
	//  101  216:invokestatic    #582 <Method int _mth02CE(SharedPreferences, String, boolean)>
	//  102  219:istore          9
			s1 = ((String) (((e) (appsflyerlib)). new e(s1, ((Map) (s2)), context.getApplicationContext(), flag4, j, (byte)0)));
	//  103  221:new             #24  <Class AppsFlyerLib$e>
	//  104  224:dup             
	//  105  225:aload_0         
	//  106  226:aload_2         
	//  107  227:aload_3         
	//  108  228:aload_1         
	//  109  229:invokevirtual   #278 <Method Context Context.getApplicationContext()>
	//  110  232:iload           11
	//  111  234:iload           9
	//  112  236:iconst_0        
	//  113  237:invokespecial   #585 <Method void AppsFlyerLib$e(AppsFlyerLib, String, Map, Context, boolean, int, byte)>
	//  114  240:astore_2        
			if(flag4 && _mth02CE(context))
	//* 115  241:iload           11
	//* 116  243:ifeq            310
	//* 117  246:aload_1         
	//* 118  247:invokestatic    #588 <Method boolean _mth02CE(Context)>
	//* 119  250:ifeq            310
			{
				appsflyerlib = ((AppsFlyerLib) (appsflyerlib._fld0971141D));
	//  120  253:aload_0         
	//  121  254:getfield        #590 <Field Map _fld0971141D>
	//  122  257:astore_0        
				boolean flag2 = flag3;
	//  123  258:iload           10
	//  124  260:istore          9
				if(appsflyerlib != null)
	//* 125  262:aload_0         
	//* 126  263:ifnull          282
				{
					flag2 = flag3;
	//  127  266:iload           10
	//  128  268:istore          9
					if(((Map) (appsflyerlib)).size() > 0)
	//* 129  270:aload_0         
	//* 130  271:invokeinterface #593 <Method int Map.size()>
	//* 131  276:ifle            282
						flag2 = true;
	//  132  279:iconst_1        
	//  133  280:istore          9
				}
				if(!flag2)
	//* 134  282:iload           9
	//* 135  284:ifne            310
				{
					AFLogger.afDebugLog("Failed to get new referrer, wait ...");
	//  136  287:ldc2            #595 <String "Failed to get new referrer, wait ...">
	//  137  290:invokestatic    #532 <Method void AFLogger.afDebugLog(String)>
					_mth0971(((ScheduledExecutorService) (AFExecutor.getInstance()._mth02CB())), ((Runnable) (s1)), 500L, TimeUnit.MILLISECONDS);
	//  138  293:invokestatic    #408 <Method AFExecutor AFExecutor.getInstance()>
	//  139  296:invokevirtual   #411 <Method java.util.concurrent.ScheduledThreadPoolExecutor AFExecutor._mth02CB()>
	//  140  299:aload_2         
	//  141  300:ldc2w           #596 <Long 500L>
	//  142  303:getstatic       #424 <Field TimeUnit TimeUnit.MILLISECONDS>
	//  143  306:invokestatic    #427 <Method void _mth0971(ScheduledExecutorService, Runnable, long, TimeUnit)>
					return;
	//  144  309:return          
				}
			}
			((Runnable) (s1)).run();
	//  145  310:aload_2         
	//  146  311:invokeinterface #602 <Method void Runnable.run()>
			return;
	//  147  316:return          
		} else
		{
			AFLogger.afDebugLog("Not sending data yet, waiting for dev key");
	//  148  317:ldc2            #604 <String "Not sending data yet, waiting for dev key">
	//  149  320:invokestatic    #532 <Method void AFLogger.afDebugLog(String)>
			return;
	//  150  323:return          
		}
	}

	private void _mth02CA(URL url, String s1, String s2, WeakReference weakreference, String s3, boolean flag)
		throws IOException
	{
		int j;
		Object obj;
		Context context;
		context = (Context)((Reference) (weakreference)).get();
	//    0    0:aload           4
	//    1    2:invokevirtual   #612 <Method Object Reference.get()>
	//    2    5:checkcast       #274 <Class Context>
	//    3    8:astore          14
		if(flag && _fld02CB0971 != null)
	//*   4   10:iload           6
	//*   5   12:ifeq            27
	//*   6   15:getstatic       #149 <Field AppsFlyerConversionListener _fld02CB0971>
	//*   7   18:ifnull          27
			j = 1;
	//    8   21:iconst_1        
	//    9   22:istore          7
		else
	//*  10   24:goto            30
			j = 0;
	//   11   27:iconst_0        
	//   12   28:istore          7
		obj = null;
	//   13   30:aconst_null     
	//   14   31:astore          12
		HttpURLConnection httpurlconnection;
		v._mth02CB()._mth02CA(((Object) (url)).toString(), s1);
	//   15   33:invokestatic    #617 <Method v v._mth02CB()>
	//   16   36:aload_1         
	//   17   37:invokevirtual   #108 <Method String Object.toString()>
	//   18   40:aload_2         
	//   19   41:invokevirtual   #620 <Method void v._mth02CA(String, String)>
		httpurlconnection = (HttpURLConnection)URLConnectionInstrumentation.openConnection(url.openConnection());
	//   20   44:aload_1         
	//   21   45:invokevirtual   #626 <Method URLConnection URL.openConnection()>
	//   22   48:invokestatic    #631 <Method URLConnection URLConnectionInstrumentation.openConnection(URLConnection)>
	//   23   51:checkcast       #633 <Class HttpURLConnection>
	//   24   54:astore          11
		httpurlconnection.setRequestMethod("POST");
	//   25   56:aload           11
	//   26   58:ldc2            #635 <String "POST">
	//   27   61:invokevirtual   #638 <Method void HttpURLConnection.setRequestMethod(String)>
		((URLConnection) (httpurlconnection)).setRequestProperty("Content-Length", String.valueOf(s1.getBytes().length));
	//   28   64:aload           11
	//   29   66:ldc2            #640 <String "Content-Length">
	//   30   69:aload_2         
	//   31   70:invokevirtual   #644 <Method byte[] String.getBytes()>
	//   32   73:arraylength     
	//   33   74:invokestatic    #648 <Method String String.valueOf(int)>
	//   34   77:invokevirtual   #653 <Method void URLConnection.setRequestProperty(String, String)>
		((URLConnection) (httpurlconnection)).setRequestProperty("Content-Type", "application/json");
	//   35   80:aload           11
	//   36   82:ldc2            #655 <String "Content-Type">
	//   37   85:ldc2            #657 <String "application/json">
	//   38   88:invokevirtual   #653 <Method void URLConnection.setRequestProperty(String, String)>
		((URLConnection) (httpurlconnection)).setConnectTimeout(10000);
	//   39   91:aload           11
	//   40   93:sipush          10000
	//   41   96:invokevirtual   #660 <Method void URLConnection.setConnectTimeout(int)>
		((URLConnection) (httpurlconnection)).setDoOutput(true);
	//   42   99:aload           11
	//   43  101:iconst_1        
	//   44  102:invokevirtual   #664 <Method void URLConnection.setDoOutput(boolean)>
		Object obj1 = ((Object) (new OutputStreamWriter(((URLConnection) (httpurlconnection)).getOutputStream(), "UTF-8")));
	//   45  105:new             #666 <Class OutputStreamWriter>
	//   46  108:dup             
	//   47  109:aload           11
	//   48  111:invokevirtual   #670 <Method java.io.OutputStream URLConnection.getOutputStream()>
	//   49  114:ldc2            #672 <String "UTF-8">
	//   50  117:invokespecial   #675 <Method void OutputStreamWriter(java.io.OutputStream, String)>
	//   51  120:astore          13
		((Writer) (obj1)).write(s1);
	//   52  122:aload           13
	//   53  124:aload_2         
	//   54  125:invokevirtual   #680 <Method void Writer.write(String)>
		int i1;
		((Writer) (obj1)).close();
	//   55  128:aload           13
	//   56  130:invokevirtual   #683 <Method void Writer.close()>
		i1 = httpurlconnection.getResponseCode();
	//   57  133:aload           11
	//   58  135:invokevirtual   #686 <Method int HttpURLConnection.getResponseCode()>
	//   59  138:istore          8
		s1 = _mth02CB(httpurlconnection);
	//   60  140:aload           11
	//   61  142:invokestatic    #689 <Method String _mth02CB(HttpURLConnection)>
	//   62  145:astore_2        
		v._mth02CB()._mth0971(((Object) (url)).toString(), i1, s1);
	//   63  146:invokestatic    #617 <Method v v._mth02CB()>
	//   64  149:aload_1         
	//   65  150:invokevirtual   #108 <Method String Object.toString()>
	//   66  153:iload           8
	//   67  155:aload_2         
	//   68  156:invokevirtual   #692 <Method void v._mth0971(String, int, String)>
		AFLogger.afInfoLog("response code: ".concat(String.valueOf(i1)));
	//   69  159:ldc2            #694 <String "response code: ">
	//   70  162:iload           8
	//   71  164:invokestatic    #648 <Method String String.valueOf(int)>
	//   72  167:invokevirtual   #697 <Method String String.concat(String)>
	//   73  170:invokestatic    #308 <Method void AFLogger.afInfoLog(String)>
		_mth02CA(context, "AppsFlyer_4.8.9", "SERVER_RESPONSE_CODE", Integer.toString(i1));
	//   74  173:aload           14
	//   75  175:ldc2            #699 <String "AppsFlyer_4.8.9">
	//   76  178:ldc2            #701 <String "SERVER_RESPONSE_CODE">
	//   77  181:iload           8
	//   78  183:invokestatic    #703 <Method String Integer.toString(int)>
	//   79  186:invokestatic    #705 <Method void _mth02CA(Context, String, String, String)>
		url = ((URL) (context.getSharedPreferences("appsflyer-data", 0)));
	//   80  189:aload           14
	//   81  191:ldc2            #534 <String "appsflyer-data">
	//   82  194:iconst_0        
	//   83  195:invokevirtual   #538 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   84  198:astore_1        
		if(i1 != 200)
			break MISSING_BLOCK_LABEL_506;
	//   85  199:iload           8
	//   86  201:sipush          200
	//   87  204:icmpne          506
		if(((Reference) (weakreference)).get() == null || !flag)
			break MISSING_BLOCK_LABEL_227;
	//   88  207:aload           4
	//   89  209:invokevirtual   #612 <Method Object Reference.get()>
	//   90  212:ifnull          227
	//   91  215:iload           6
	//   92  217:ifeq            227
		_fld02CF0971 = System.currentTimeMillis();
	//   93  220:aload_0         
	//   94  221:invokestatic    #318 <Method long System.currentTimeMillis()>
	//   95  224:putfield        #162 <Field long _fld02CF0971>
		obj = ((Object) (AppsFlyerProperties.getInstance().getString("afUninstallToken")));
	//   96  227:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//   97  230:ldc2            #707 <String "afUninstallToken">
	//   98  233:invokevirtual   #258 <Method String AppsFlyerProperties.getString(String)>
	//   99  236:astore          12
		if(obj == null)
			break MISSING_BLOCK_LABEL_301;
	//  100  238:aload           12
	//  101  240:ifnull          301
		AFLogger.afDebugLog("Uninstall Token exists: ".concat(String.valueOf(obj)));
	//  102  243:ldc2            #709 <String "Uninstall Token exists: ">
	//  103  246:aload           12
	//  104  248:invokestatic    #712 <Method String String.valueOf(Object)>
	//  105  251:invokevirtual   #697 <Method String String.concat(String)>
	//  106  254:invokestatic    #532 <Method void AFLogger.afDebugLog(String)>
		if(!((SharedPreferences) (url)).getBoolean("sentRegisterRequestToAF", false))
	//* 107  257:aload_1         
	//* 108  258:ldc2            #714 <String "sentRegisterRequestToAF">
	//* 109  261:iconst_0        
	//* 110  262:invokeinterface #717 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//* 111  267:ifne            373
		{
			AFLogger.afDebugLog("Resending Uninstall token to AF servers: ".concat(String.valueOf(obj)));
	//  112  270:ldc2            #719 <String "Resending Uninstall token to AF servers: ">
	//  113  273:aload           12
	//  114  275:invokestatic    #712 <Method String String.valueOf(Object)>
	//  115  278:invokevirtual   #697 <Method String String.concat(String)>
	//  116  281:invokestatic    #532 <Method void AFLogger.afDebugLog(String)>
			y._mth02CA(context, new com.appsflyer.d(((String) (obj))));
	//  117  284:aload           14
	//  118  286:new             #721 <Class d>
	//  119  289:dup             
	//  120  290:aload           12
	//  121  292:invokespecial   #722 <Method void d(String)>
	//  122  295:invokestatic    #727 <Method void y._mth02CA(Context, d)>
		}
		break MISSING_BLOCK_LABEL_373;
	//  123  298:goto            373
		if(AppsFlyerProperties.getInstance().getString("gcmProjectNumber") == null)
			break MISSING_BLOCK_LABEL_373;
	//  124  301:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//  125  304:ldc2            #729 <String "gcmProjectNumber">
	//  126  307:invokevirtual   #258 <Method String AppsFlyerProperties.getString(String)>
	//  127  310:ifnull          373
		AFLogger.afDebugLog("GCM Project number exists. Fetching token and sending to AF servers");
	//  128  313:ldc2            #731 <String "GCM Project number exists. Fetching token and sending to AF servers">
	//  129  316:invokestatic    #532 <Method void AFLogger.afDebugLog(String)>
		obj = ((Object) (new y.d(new WeakReference(((Object) (context))))));
	//  130  319:new             #733 <Class y$d>
	//  131  322:dup             
	//  132  323:new             #413 <Class WeakReference>
	//  133  326:dup             
	//  134  327:aload           14
	//  135  329:invokespecial   #416 <Method void WeakReference(Object)>
	//  136  332:invokespecial   #736 <Method void y$d(WeakReference)>
	//  137  335:astore          12
		obj1 = ((Object) (new Void[0]));
	//  138  337:iconst_0        
	//  139  338:anewarray       Void[]
	//  140  341:astore          13
		if(!(obj instanceof AsyncTask))
	//* 141  343:aload           12
	//* 142  345:instanceof      #740 <Class AsyncTask>
	//* 143  348:ifne            362
		{
			((AsyncTask) (obj)).execute(((Object []) (obj1)));
	//  144  351:aload           12
	//  145  353:aload           13
	//  146  355:invokevirtual   #743 <Method AsyncTask AsyncTask.execute(Object[])>
	//  147  358:pop             
			break MISSING_BLOCK_LABEL_373;
	//  148  359:goto            373
		}
		AsyncTaskInstrumentation.execute((AsyncTask)obj, ((Object []) (obj1)));
	//  149  362:aload           12
	//  150  364:checkcast       #740 <Class AsyncTask>
	//  151  367:aload           13
	//  152  369:invokestatic    #748 <Method AsyncTask AsyncTaskInstrumentation.execute(AsyncTask, Object[])>
	//  153  372:pop             
		if(_fld02BE != null)
	//* 154  373:aload_0         
	//* 155  374:getfield        #184 <Field Uri _fld02BE>
	//* 156  377:ifnull          385
			_fld02BE = null;
	//  157  380:aload_0         
	//  158  381:aconst_null     
	//  159  382:putfield        #184 <Field Uri _fld02BE>
		if(s3 == null)
			break MISSING_BLOCK_LABEL_400;
	//  160  385:aload           5
	//  161  387:ifnull          400
		CacheManager.getInstance().deleteRequest(s3, context);
	//  162  390:invokestatic    #753 <Method CacheManager CacheManager.getInstance()>
	//  163  393:aload           5
	//  164  395:aload           14
	//  165  397:invokevirtual   #757 <Method void CacheManager.deleteRequest(String, Context)>
		if(((Reference) (weakreference)).get() == null || s3 != null)
			break MISSING_BLOCK_LABEL_491;
	//  166  400:aload           4
	//  167  402:invokevirtual   #612 <Method Object Reference.get()>
	//  168  405:ifnull          491
	//  169  408:aload           5
	//  170  410:ifnonnull       491
		_mth02CF(context, "sentSuccessfully", "true");
	//  171  413:aload           14
	//  172  415:ldc2            #759 <String "sentSuccessfully">
	//  173  418:ldc2            #362 <String "true">
	//  174  421:invokestatic    #332 <Method void _mth02CF(Context, String, String)>
		if(_fld141D0971 || System.currentTimeMillis() - _fld02BB0971 < 15000L)
	//* 175  424:aload_0         
	//* 176  425:getfield        #180 <Field boolean _fld141D0971>
	//* 177  428:ifne            491
	//* 178  431:invokestatic    #318 <Method long System.currentTimeMillis()>
	//* 179  434:aload_0         
	//* 180  435:getfield        #207 <Field long _fld02BB0971>
	//* 181  438:lsub            
	//* 182  439:ldc2w           #760 <Long 15000L>
	//* 183  442:lcmp            
	//* 184  443:ifge            449
			break MISSING_BLOCK_LABEL_491;
	//  185  446:goto            491
		if(_fld097102CE == null)
	//* 186  449:aload_0         
	//* 187  450:getfield        #182 <Field ScheduledExecutorService _fld097102CE>
	//* 188  453:ifnonnull       491
		{
			_fld097102CE = ((ScheduledExecutorService) (AFExecutor.getInstance()._mth02CB()));
	//  189  456:aload_0         
	//  190  457:invokestatic    #408 <Method AFExecutor AFExecutor.getInstance()>
	//  191  460:invokevirtual   #411 <Method java.util.concurrent.ScheduledThreadPoolExecutor AFExecutor._mth02CB()>
	//  192  463:putfield        #182 <Field ScheduledExecutorService _fld097102CE>
			weakreference = ((WeakReference) (new c(context)));
	//  193  466:new             #18  <Class AppsFlyerLib$c>
	//  194  469:dup             
	//  195  470:aload_0         
	//  196  471:aload           14
	//  197  473:invokespecial   #764 <Method void AppsFlyerLib$c(AppsFlyerLib, Context)>
	//  198  476:astore          4
			_mth0971(_fld097102CE, ((Runnable) (weakreference)), 1L, TimeUnit.SECONDS);
	//  199  478:aload_0         
	//  200  479:getfield        #182 <Field ScheduledExecutorService _fld097102CE>
	//  201  482:aload           4
	//  202  484:lconst_1        
	//  203  485:getstatic       #168 <Field TimeUnit TimeUnit.SECONDS>
	//  204  488:invokestatic    #427 <Method void _mth0971(ScheduledExecutorService, Runnable, long, TimeUnit)>
		}
		_fld02CB02CB = ServerConfigHandler._mth02CF(s1).optBoolean("send_background", false);
	//  205  491:aload_0         
	//  206  492:aload_2         
	//  207  493:invokestatic    #767 <Method JSONObject ServerConfigHandler._mth02CF(String)>
	//  208  496:ldc2            #769 <String "send_background">
	//  209  499:iconst_0        
	//  210  500:invokevirtual   #774 <Method boolean JSONObject.optBoolean(String, boolean)>
	//  211  503:putfield        #195 <Field boolean _fld02CB02CB>
		long l1;
		i1 = ((SharedPreferences) (url)).getInt("appsflyerConversionDataRequestRetries", 0);
	//  212  506:aload_1         
	//  213  507:ldc2            #776 <String "appsflyerConversionDataRequestRetries">
	//  214  510:iconst_0        
	//  215  511:invokeinterface #780 <Method int SharedPreferences.getInt(String, int)>
	//  216  516:istore          8
		l1 = ((SharedPreferences) (url)).getLong("appsflyerConversionDataCacheExpiration", 0L);
	//  217  518:aload_1         
	//  218  519:ldc2            #782 <String "appsflyerConversionDataCacheExpiration">
	//  219  522:lconst_0        
	//  220  523:invokeinterface #786 <Method long SharedPreferences.getLong(String, long)>
	//  221  528:lstore          9
		if(l1 == 0L)
			break MISSING_BLOCK_LABEL_568;
	//  222  530:lload           9
	//  223  532:lconst_0        
	//  224  533:lcmp            
	//  225  534:ifeq            568
		if(System.currentTimeMillis() - l1 > 0x34fd9000L)
	//* 226  537:invokestatic    #318 <Method long System.currentTimeMillis()>
	//* 227  540:lload           9
	//* 228  542:lsub            
	//* 229  543:ldc2w           #787 <Long 0x34fd9000L>
	//* 230  546:lcmp            
	//* 231  547:ifle            568
		{
			_mth02CF(context, "attributionId", ((String) (null)));
	//  232  550:aload           14
	//  233  552:ldc2            #790 <String "attributionId">
	//  234  555:aconst_null     
	//  235  556:invokestatic    #332 <Method void _mth02CF(Context, String, String)>
			_mth0971(context, "appsflyerConversionDataCacheExpiration", 0L);
	//  236  559:aload           14
	//  237  561:ldc2            #782 <String "appsflyerConversionDataCacheExpiration">
	//  238  564:lconst_0        
	//  239  565:invokestatic    #329 <Method void _mth0971(Context, String, long)>
		}
		if(((SharedPreferences) (url)).getString("attributionId", ((String) (null))) != null || s2 == null || !j)
			break MISSING_BLOCK_LABEL_637;
	//  240  568:aload_1         
	//  241  569:ldc2            #790 <String "attributionId">
	//  242  572:aconst_null     
	//  243  573:invokeinterface #793 <Method String SharedPreferences.getString(String, String)>
	//  244  578:ifnonnull       637
	//  245  581:aload_3         
	//  246  582:ifnull          637
	//  247  585:iload           7
	//  248  587:ifeq            637
		if(_fld02CB0971 == null || i1 > 5)
			break MISSING_BLOCK_LABEL_637;
	//  249  590:getstatic       #149 <Field AppsFlyerConversionListener _fld02CB0971>
	//  250  593:ifnull          637
	//  251  596:iload           8
	//  252  598:iconst_5        
	//  253  599:icmpgt          637
		url = ((URL) (AFExecutor.getInstance()._mth02CB()));
	//  254  602:invokestatic    #408 <Method AFExecutor AFExecutor.getInstance()>
	//  255  605:invokevirtual   #411 <Method java.util.concurrent.ScheduledThreadPoolExecutor AFExecutor._mth02CB()>
	//  256  608:astore_1        
		_mth0971(((ScheduledExecutorService) (url)), ((Runnable) (new b(context.getApplicationContext(), s2, ((ScheduledExecutorService) (url))))), 10L, TimeUnit.MILLISECONDS);
	//  257  609:aload_1         
	//  258  610:new             #15  <Class AppsFlyerLib$b>
	//  259  613:dup             
	//  260  614:aload_0         
	//  261  615:aload           14
	//  262  617:invokevirtual   #278 <Method Context Context.getApplicationContext()>
	//  263  620:aload_3         
	//  264  621:aload_1         
	//  265  622:invokespecial   #796 <Method void AppsFlyerLib$b(AppsFlyerLib, Context, String, ScheduledExecutorService)>
	//  266  625:ldc2w           #797 <Long 10L>
	//  267  628:getstatic       #424 <Field TimeUnit TimeUnit.MILLISECONDS>
	//  268  631:invokestatic    #427 <Method void _mth0971(ScheduledExecutorService, Runnable, long, TimeUnit)>
		break MISSING_BLOCK_LABEL_759;
	//  269  634:goto            759
		if(s2 != null)
			break MISSING_BLOCK_LABEL_650;
	//  270  637:aload_3         
	//  271  638:ifnonnull       650
		AFLogger.afWarnLog("AppsFlyer dev key is missing.");
	//  272  641:ldc2            #800 <String "AppsFlyer dev key is missing.">
	//  273  644:invokestatic    #803 <Method void AFLogger.afWarnLog(String)>
		break MISSING_BLOCK_LABEL_759;
	//  274  647:goto            759
		if(!j)
			break MISSING_BLOCK_LABEL_759;
	//  275  650:iload           7
	//  276  652:ifeq            759
		if(_fld02CB0971 == null || ((SharedPreferences) (url)).getString("attributionId", ((String) (null))) == null)
			break MISSING_BLOCK_LABEL_759;
	//  277  655:getstatic       #149 <Field AppsFlyerConversionListener _fld02CB0971>
	//  278  658:ifnull          759
	//  279  661:aload_1         
	//  280  662:ldc2            #790 <String "attributionId">
	//  281  665:aconst_null     
	//  282  666:invokeinterface #793 <Method String SharedPreferences.getString(String, String)>
	//  283  671:ifnull          759
		j = _mth02CE(((SharedPreferences) (url)), "appsFlyerCount", false);
	//  284  674:aload_1         
	//  285  675:ldc2            #579 <String "appsFlyerCount">
	//  286  678:iconst_0        
	//  287  679:invokestatic    #582 <Method int _mth02CE(SharedPreferences, String, boolean)>
	//  288  682:istore          7
		if(j <= 1)
			break MISSING_BLOCK_LABEL_759;
	//  289  684:iload           7
	//  290  686:iconst_1        
	//  291  687:icmple          759
		url = ((URL) (_mth02CF(context)));
	//  292  690:aload           14
	//  293  692:invokestatic    #268 <Method Map _mth02CF(Context)>
	//  294  695:astore_1        
		if(url == null)
			break MISSING_BLOCK_LABEL_759;
	//  295  696:aload_1         
	//  296  697:ifnull          759
		if(!((Map) (url)).containsKey("is_first_launch"))
	//* 297  700:aload_1         
	//* 298  701:ldc2            #805 <String "is_first_launch">
	//* 299  704:invokeinterface #808 <Method boolean Map.containsKey(Object)>
	//* 300  709:ifne            726
			((Map) (url)).put("is_first_launch", ((Object) (Boolean.toString(false))));
	//  301  712:aload_1         
	//  302  713:ldc2            #805 <String "is_first_launch">
	//  303  716:iconst_0        
	//  304  717:invokestatic    #811 <Method String Boolean.toString(boolean)>
	//  305  720:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//  306  725:pop             
		_fld02CB0971.onInstallConversionDataLoaded(((Map) (url)));
	//  307  726:getstatic       #149 <Field AppsFlyerConversionListener _fld02CB0971>
	//  308  729:aload_1         
	//  309  730:invokeinterface #814 <Method void AppsFlyerConversionListener.onInstallConversionDataLoaded(Map)>
		break MISSING_BLOCK_LABEL_759;
	//  310  735:goto            759
		url;
	//  311  738:astore_1        
		try
		{
			AFLogger.afErrorLog(((Throwable) (url)).getLocalizedMessage(), ((Throwable) (url)));
	//  312  739:aload_1         
	//  313  740:invokevirtual   #524 <Method String Throwable.getLocalizedMessage()>
	//  314  743:aload_1         
	//  315  744:invokestatic    #245 <Method void AFLogger.afErrorLog(String, Throwable)>
			break MISSING_BLOCK_LABEL_759;
	//  316  747:goto            759
		}
		// Misplaced declaration of an exception variable
		catch(URL url) { }
	//  317  750:astore_1        
		AFLogger.afErrorLog(((Throwable) (url)).getMessage(), ((Throwable) (url)));
	//  318  751:aload_1         
	//  319  752:invokevirtual   #817 <Method String Throwable.getMessage()>
	//  320  755:aload_1         
	//  321  756:invokestatic    #245 <Method void AFLogger.afErrorLog(String, Throwable)>
		if(httpurlconnection != null)
	//* 322  759:aload           11
	//* 323  761:ifnull          770
		{
			httpurlconnection.disconnect();
	//  324  764:aload           11
	//  325  766:invokevirtual   #820 <Method void HttpURLConnection.disconnect()>
			return;
	//  326  769:return          
		} else
		{
			return;
	//  327  770:return          
		}
		s1;
	//  328  771:astore_2        
		url = ((URL) (obj1));
	//  329  772:aload           13
	//  330  774:astore_1        
		break MISSING_BLOCK_LABEL_782;
	//  331  775:goto            782
		s1;
	//  332  778:astore_2        
		url = ((URL) (obj));
	//  333  779:aload           12
	//  334  781:astore_1        
		if(url == null)
			break MISSING_BLOCK_LABEL_790;
	//  335  782:aload_1         
	//  336  783:ifnull          790
		((Writer) (url)).close();
	//  337  786:aload_1         
	//  338  787:invokevirtual   #683 <Method void Writer.close()>
		throw s1;
	//  339  790:aload_2         
	//  340  791:athrow          
		url;
	//  341  792:astore_1        
		s1 = ((String) (httpurlconnection));
	//  342  793:aload           11
	//  343  795:astore_2        
		break MISSING_BLOCK_LABEL_802;
	//  344  796:goto            802
		url;
	//  345  799:astore_1        
		s1 = null;
	//  346  800:aconst_null     
	//  347  801:astore_2        
		if(s1 != null)
	//* 348  802:aload_2         
	//* 349  803:ifnull          810
			((HttpURLConnection) (s1)).disconnect();
	//  350  806:aload_2         
	//  351  807:invokevirtual   #820 <Method void HttpURLConnection.disconnect()>
		throw url;
	//  352  810:aload_1         
	//  353  811:athrow          
	}

	static boolean _mth02CA(AppsFlyerLib appsflyerlib)
	{
		appsflyerlib = ((AppsFlyerLib) (appsflyerlib._fld0971141D));
	//    0    0:aload_0         
	//    1    1:getfield        #590 <Field Map _fld0971141D>
	//    2    4:astore_0        
		return appsflyerlib != null && ((Map) (appsflyerlib)).size() > 0;
	//    3    5:aload_0         
	//    4    6:ifnull          20
	//    5    9:aload_0         
	//    6   10:invokeinterface #593 <Method int Map.size()>
	//    7   15:ifle            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	static boolean _mth02CA(AppsFlyerLib appsflyerlib, boolean flag)
	{
		appsflyerlib._fld141D0971 = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #180 <Field boolean _fld141D0971>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static SharedPreferences _mth02CB(Context context)
	{
		return context.getSharedPreferences("appsflyer-data", 0);
	//    0    0:aload_0         
	//    1    1:ldc2            #534 <String "appsflyer-data">
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #538 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    4    8:areturn         
	}

	static AppsFlyerConversionListener _mth02CB()
	{
		return _fld02CB0971;
	//    0    0:getstatic       #149 <Field AppsFlyerConversionListener _fld02CB0971>
	//    1    3:areturn         
	}

	private static String _mth02CB(File file, String s1)
	{
		FileReader filereader1;
		Properties properties;
		properties = new Properties();
	//    0    0:new             #830 <Class Properties>
	//    1    3:dup             
	//    2    4:invokespecial   #831 <Method void Properties()>
	//    3    7:astore          4
		filereader1 = new FileReader(file);
	//    4    9:new             #833 <Class FileReader>
	//    5   12:dup             
	//    6   13:aload_0         
	//    7   14:invokespecial   #836 <Method void FileReader(File)>
	//    8   17:astore_3        
		FileReader filereader = filereader1;
	//    9   18:aload_3         
	//   10   19:astore_2        
		properties.load(((Reader) (filereader1)));
	//   11   20:aload           4
	//   12   22:aload_3         
	//   13   23:invokevirtual   #840 <Method void Properties.load(Reader)>
		filereader = filereader1;
	//   14   26:aload_3         
	//   15   27:astore_2        
		AFLogger.afInfoLog("Found PreInstall property!");
	//   16   28:ldc2            #842 <String "Found PreInstall property!">
	//   17   31:invokestatic    #308 <Method void AFLogger.afInfoLog(String)>
		filereader = filereader1;
	//   18   34:aload_3         
	//   19   35:astore_2        
		s1 = properties.getProperty(s1);
	//   20   36:aload           4
	//   21   38:aload_1         
	//   22   39:invokevirtual   #845 <Method String Properties.getProperty(String)>
	//   23   42:astore_1        
		try
		{
			((Reader) (filereader1)).close();
	//   24   43:aload_3         
	//   25   44:invokevirtual   #848 <Method void Reader.close()>
		}
	//*  26   47:aload_1         
	//*  27   48:areturn         
		// Misplaced declaration of an exception variable
		catch(File file)
	//*  28   49:astore_0        
		{
			AFLogger.afErrorLog(((Throwable) (file)).getMessage(), ((Throwable) (file)));
	//   29   50:aload_0         
	//   30   51:invokevirtual   #817 <Method String Throwable.getMessage()>
	//   31   54:aload_0         
	//   32   55:invokestatic    #245 <Method void AFLogger.afErrorLog(String, Throwable)>
			return s1;
	//   33   58:aload_1         
	//   34   59:areturn         
		}
		return s1;
		file;
	//   35   60:astore_0        
		  goto _L1
	//*  36   61:goto            73
		file;
	//   37   64:astore_0        
		filereader = null;
	//   38   65:aconst_null     
	//   39   66:astore_2        
		  goto _L2
	//*  40   67:goto            150
		file;
	//   41   70:astore_0        
		filereader1 = null;
	//   42   71:aconst_null     
	//   43   72:astore_3        
_L1:
		filereader = filereader1;
	//   44   73:aload_3         
	//   45   74:astore_2        
		AFLogger.afErrorLog(((Throwable) (file)).getMessage(), ((Throwable) (file)));
	//   46   75:aload_0         
	//   47   76:invokevirtual   #817 <Method String Throwable.getMessage()>
	//   48   79:aload_0         
	//   49   80:invokestatic    #245 <Method void AFLogger.afErrorLog(String, Throwable)>
		if(filereader1 != null)
	//*  50   83:aload_3         
	//*  51   84:ifnull          147
		{
			try
			{
				((Reader) (filereader1)).close();
	//   52   87:aload_3         
	//   53   88:invokevirtual   #848 <Method void Reader.close()>
			}
	//*  54   91:aconst_null     
	//*  55   92:areturn         
			// Misplaced declaration of an exception variable
			catch(File file)
	//*  56   93:astore_0        
			{
				AFLogger.afErrorLog(((Throwable) (file)).getMessage(), ((Throwable) (file)));
	//   57   94:aload_0         
	//   58   95:invokevirtual   #817 <Method String Throwable.getMessage()>
	//   59   98:aload_0         
	//   60   99:invokestatic    #245 <Method void AFLogger.afErrorLog(String, Throwable)>
				return null;
	//   61  102:aconst_null     
	//   62  103:areturn         
			}
			return null;
		}
		  goto _L3
_L5:
		filereader1 = null;
	//   63  104:aconst_null     
	//   64  105:astore_3        
_L6:
		filereader = filereader1;
	//   65  106:aload_3         
	//   66  107:astore_2        
		s1 = ((String) (new StringBuilder("PreInstall file wasn't found: ")));
	//   67  108:new             #95  <Class StringBuilder>
	//   68  111:dup             
	//   69  112:ldc2            #850 <String "PreInstall file wasn't found: ">
	//   70  115:invokespecial   #115 <Method void StringBuilder(String)>
	//   71  118:astore_1        
		filereader = filereader1;
	//   72  119:aload_3         
	//   73  120:astore_2        
		((StringBuilder) (s1)).append(file.getAbsolutePath());
	//   74  121:aload_1         
	//   75  122:aload_0         
	//   76  123:invokevirtual   #855 <Method String File.getAbsolutePath()>
	//   77  126:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   78  129:pop             
		filereader = filereader1;
	//   79  130:aload_3         
	//   80  131:astore_2        
		AFLogger.afDebugLog(((Object) (s1)).toString());
	//   81  132:aload_1         
	//   82  133:invokevirtual   #108 <Method String Object.toString()>
	//   83  136:invokestatic    #532 <Method void AFLogger.afDebugLog(String)>
		if(filereader1 == null) goto _L3; else goto _L4
	//   84  139:aload_3         
	//   85  140:ifnull          147
_L4:
		((Reader) (filereader1)).close();
	//   86  143:aload_3         
	//   87  144:invokevirtual   #848 <Method void Reader.close()>
_L3:
		return null;
	//   88  147:aconst_null     
	//   89  148:areturn         
		file;
	//   90  149:astore_0        
_L2:
		if(filereader != null)
	//*  91  150:aload_2         
	//*  92  151:ifnull          170
			try
			{
				((Reader) (filereader)).close();
	//   93  154:aload_2         
	//   94  155:invokevirtual   #848 <Method void Reader.close()>
			}
	//*  95  158:goto            170
			// Misplaced declaration of an exception variable
			catch(String s1)
	//*  96  161:astore_1        
			{
				AFLogger.afErrorLog(((Throwable) (s1)).getMessage(), ((Throwable) (s1)));
	//   97  162:aload_1         
	//   98  163:invokevirtual   #817 <Method String Throwable.getMessage()>
	//   99  166:aload_1         
	//  100  167:invokestatic    #245 <Method void AFLogger.afErrorLog(String, Throwable)>
			}
		throw file;
	//  101  170:aload_0         
	//  102  171:athrow          
		s1;
	//  103  172:astore_1        
		  goto _L5
	//* 104  173:goto            104
		s1;
	//  105  176:astore_1        
		  goto _L6
	//* 106  177:goto            106
	}

	static String _mth02CB(HttpURLConnection httpurlconnection)
	{
		Object obj1;
		Object obj2;
		StringBuilder stringbuilder;
		StringBuilder stringbuilder1;
		stringbuilder1 = new StringBuilder();
	//    0    0:new             #95  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #98  <Method void StringBuilder()>
	//    3    7:astore          7
		obj2 = null;
	//    4    9:aconst_null     
	//    5   10:astore_3        
		obj1 = null;
	//    6   11:aconst_null     
	//    7   12:astore_2        
		stringbuilder = null;
	//    8   13:aconst_null     
	//    9   14:astore          6
		Object obj3 = ((Object) (httpurlconnection.getErrorStream()));
	//   10   16:aload_0         
	//   11   17:invokevirtual   #862 <Method java.io.InputStream HttpURLConnection.getErrorStream()>
	//   12   20:astore          4
		Object obj;
		obj = obj3;
	//   13   22:aload           4
	//   14   24:astore_1        
		if(obj3 != null)
			break MISSING_BLOCK_LABEL_35;
	//   15   25:aload           4
	//   16   27:ifnonnull       35
		obj = ((Object) (((URLConnection) (httpurlconnection)).getInputStream()));
	//   17   30:aload_0         
	//   18   31:invokevirtual   #865 <Method java.io.InputStream URLConnection.getInputStream()>
	//   19   34:astore_1        
		obj = ((Object) (new InputStreamReader(((java.io.InputStream) (obj)))));
	//   20   35:new             #867 <Class InputStreamReader>
	//   21   38:dup             
	//   22   39:aload_1         
	//   23   40:invokespecial   #870 <Method void InputStreamReader(java.io.InputStream)>
	//   24   43:astore_1        
		obj1 = obj2;
	//   25   44:aload_3         
	//   26   45:astore_2        
		obj2 = obj;
	//   27   46:aload_1         
	//   28   47:astore_3        
		obj3 = ((Object) (new BufferedReader(((Reader) (obj)))));
	//   29   48:new             #872 <Class BufferedReader>
	//   30   51:dup             
	//   31   52:aload_1         
	//   32   53:invokespecial   #874 <Method void BufferedReader(Reader)>
	//   33   56:astore          4
_L1:
		obj1 = ((Object) (((BufferedReader) (obj3)).readLine()));
	//   34   58:aload           4
	//   35   60:invokevirtual   #877 <Method String BufferedReader.readLine()>
	//   36   63:astore_2        
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_86;
	//   37   64:aload_2         
	//   38   65:ifnull          86
		stringbuilder1.append(((String) (obj1)));
	//   39   68:aload           7
	//   40   70:aload_2         
	//   41   71:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   42   74:pop             
		stringbuilder1.append('\n');
	//   43   75:aload           7
	//   44   77:bipush          10
	//   45   79:invokevirtual   #880 <Method StringBuilder StringBuilder.append(char)>
	//   46   82:pop             
		  goto _L1
	//*  47   83:goto            58
		((Reader) (obj3)).close();
	//   48   86:aload           4
	//   49   88:invokevirtual   #848 <Method void Reader.close()>
_L4:
		((Reader) (obj)).close();
	//   50   91:aload_1         
	//   51   92:invokevirtual   #848 <Method void Reader.close()>
		break; /* Loop/switch isn't completed */
	//   52   95:goto            200
		httpurlconnection;
	//   53   98:astore_0        
		obj1 = obj3;
	//   54   99:aload           4
	//   55  101:astore_2        
		  goto _L2
	//*  56  102:goto            283
		Throwable throwable1;
		throwable1;
	//   57  105:astore          5
		  goto _L3
	//*  58  107:goto            133
		throwable1;
	//   59  110:astore          5
		obj3 = ((Object) (stringbuilder));
	//   60  112:aload           6
	//   61  114:astore          4
		  goto _L3
	//*  62  116:goto            133
		httpurlconnection;
	//   63  119:astore_0        
		obj = null;
	//   64  120:aconst_null     
	//   65  121:astore_1        
		  goto _L2
	//*  66  122:goto            283
		throwable1;
	//   67  125:astore          5
		obj = null;
	//   68  127:aconst_null     
	//   69  128:astore_1        
		obj3 = ((Object) (stringbuilder));
	//   70  129:aload           6
	//   71  131:astore          4
_L3:
		obj1 = obj3;
	//   72  133:aload           4
	//   73  135:astore_2        
		obj2 = obj;
	//   74  136:aload_1         
	//   75  137:astore_3        
		stringbuilder = new StringBuilder("Could not read connection response from: ");
	//   76  138:new             #95  <Class StringBuilder>
	//   77  141:dup             
	//   78  142:ldc2            #882 <String "Could not read connection response from: ">
	//   79  145:invokespecial   #115 <Method void StringBuilder(String)>
	//   80  148:astore          6
		obj1 = obj3;
	//   81  150:aload           4
	//   82  152:astore_2        
		obj2 = obj;
	//   83  153:aload_1         
	//   84  154:astore_3        
		stringbuilder.append(((Object) (((URLConnection) (httpurlconnection)).getURL())).toString());
	//   85  155:aload           6
	//   86  157:aload_0         
	//   87  158:invokevirtual   #886 <Method URL URLConnection.getURL()>
	//   88  161:invokevirtual   #108 <Method String Object.toString()>
	//   89  164:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   90  167:pop             
		obj1 = obj3;
	//   91  168:aload           4
	//   92  170:astore_2        
		obj2 = obj;
	//   93  171:aload_1         
	//   94  172:astore_3        
		AFLogger.afErrorLog(((Object) (stringbuilder)).toString(), throwable1);
	//   95  173:aload           6
	//   96  175:invokevirtual   #108 <Method String Object.toString()>
	//   97  178:aload           5
	//   98  180:invokestatic    #245 <Method void AFLogger.afErrorLog(String, Throwable)>
		if(obj3 == null)
			continue; /* Loop/switch isn't completed */
	//   99  183:aload           4
	//  100  185:ifnull          193
		((Reader) (obj3)).close();
	//  101  188:aload           4
	//  102  190:invokevirtual   #848 <Method void Reader.close()>
		if(obj == null) goto _L5; else goto _L4
	//  103  193:aload_1         
	//  104  194:ifnull          200
	//* 105  197:goto            91
_L5:
		httpurlconnection = ((HttpURLConnection) (((Object) (stringbuilder1)).toString()));
	//  106  200:aload           7
	//  107  202:invokevirtual   #108 <Method String Object.toString()>
	//  108  205:astore_0        
		try
		{
			JSONObjectInstrumentation.init(((String) (httpurlconnection)));
	//  109  206:aload_0         
	//  110  207:invokestatic    #890 <Method JSONObject JSONObjectInstrumentation.init(String)>
	//  111  210:pop             
		}
	//* 112  211:aload_0         
	//* 113  212:areturn         
	//* 114  213:new             #771 <Class JSONObject>
	//* 115  216:dup             
	//* 116  217:invokespecial   #891 <Method void JSONObject()>
	//* 117  220:astore_1        
	//* 118  221:aload_1         
	//* 119  222:ldc2            #893 <String "string_response">
	//* 120  225:aload_0         
	//* 121  226:invokevirtual   #896 <Method JSONObject JSONObject.put(String, Object)>
	//* 122  229:pop             
	//* 123  230:aload_1         
	//* 124  231:instanceof      #771 <Class JSONObject>
	//* 125  234:ifne            242
	//* 126  237:aload_1         
	//* 127  238:invokevirtual   #897 <Method String JSONObject.toString()>
	//* 128  241:areturn         
	//* 129  242:aload_1         
	//* 130  243:checkcast       #771 <Class JSONObject>
	//* 131  246:invokestatic    #900 <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//* 132  249:astore_0        
	//* 133  250:aload_0         
	//* 134  251:areturn         
	//* 135  252:new             #771 <Class JSONObject>
	//* 136  255:dup             
	//* 137  256:invokespecial   #891 <Method void JSONObject()>
	//* 138  259:astore_0        
	//* 139  260:aload_0         
	//* 140  261:instanceof      #771 <Class JSONObject>
	//* 141  264:ifne            272
	//* 142  267:aload_0         
	//* 143  268:invokevirtual   #897 <Method String JSONObject.toString()>
	//* 144  271:areturn         
	//* 145  272:aload_0         
	//* 146  273:checkcast       #771 <Class JSONObject>
	//* 147  276:invokestatic    #900 <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//* 148  279:areturn         
	//* 149  280:astore_0        
	//* 150  281:aload_3         
	//* 151  282:astore_1        
	//* 152  283:aload_2         
	//* 153  284:ifnull          291
	//* 154  287:aload_2         
	//* 155  288:invokevirtual   #848 <Method void Reader.close()>
	//* 156  291:aload_1         
	//* 157  292:ifnull          299
	//* 158  295:aload_1         
	//* 159  296:invokevirtual   #848 <Method void Reader.close()>
	//* 160  299:aload_0         
	//* 161  300:athrow          
	//* 162  301:astore_0        
	//* 163  302:goto            200
		// Misplaced declaration of an exception variable
		catch(JSONException jsonexception)
		{
			obj = ((Object) (new JSONObject()));
			try
			{
				((JSONObject) (obj)).put("string_response", ((Object) (httpurlconnection)));
				if(!(obj instanceof JSONObject))
					return ((JSONObject) (obj)).toString();
				httpurlconnection = ((HttpURLConnection) (JSONObjectInstrumentation.toString((JSONObject)obj)));
			}
	//* 164  305:astore_1        
	//* 165  306:goto            213
			// Misplaced declaration of an exception variable
			catch(HttpURLConnection httpurlconnection)
			{
				httpurlconnection = ((HttpURLConnection) (new JSONObject()));
				if(!(httpurlconnection instanceof JSONObject))
					return ((JSONObject) (httpurlconnection)).toString();
				else
					return JSONObjectInstrumentation.toString((JSONObject)httpurlconnection);
			}
			return ((String) (httpurlconnection));
		}
		return ((String) (httpurlconnection));
		httpurlconnection;
		obj = obj2;
_L2:
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_291;
		((Reader) (obj1)).close();
		JSONException jsonexception;
		if(obj != null)
			try
			{
				((Reader) (obj)).close();
			}
	//* 166  309:astore_0        
	//* 167  310:goto            252
			catch(Throwable throwable) { }
	//  168  313:astore_1        
		throw httpurlconnection;
		httpurlconnection;
		if(true) goto _L5; else goto _L6
_L6:
	//* 169  314:goto            299
	}

	private static Map _mth02CB(Context context, String s1)
	{
		LinkedHashMap linkedhashmap = new LinkedHashMap();
	//    0    0:new             #904 <Class LinkedHashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #905 <Method void LinkedHashMap()>
	//    3    7:astore          11
		String as[] = s1.split("&");
	//    4    9:aload_1         
	//    5   10:ldc2            #907 <String "&">
	//    6   13:invokevirtual   #911 <Method String[] String.split(String)>
	//    7   16:astore          12
		int k1 = as.length;
	//    8   18:aload           12
	//    9   20:arraylength     
	//   10   21:istore          5
		int i1 = 0;
	//   11   23:iconst_0        
	//   12   24:istore_3        
		int j;
		int j1;
		for(j = 0; i1 < k1; j = j1)
	//*  13   25:iconst_0        
	//*  14   26:istore_2        
	//*  15   27:iload_3         
	//*  16   28:iload           5
	//*  17   30:icmpge          219
		{
			String s2;
label0:
			{
				String s3 = as[i1];
	//   18   33:aload           12
	//   19   35:iload_3         
	//   20   36:aaload          
	//   21   37:astore          10
				int l1 = s3.indexOf("=");
	//   22   39:aload           10
	//   23   41:ldc2            #913 <String "=">
	//   24   44:invokevirtual   #87  <Method int String.indexOf(String)>
	//   25   47:istore          6
				if(l1 > 0)
	//*  26   49:iload           6
	//*  27   51:ifle            67
					s2 = s3.substring(0, l1);
	//   28   54:aload           10
	//   29   56:iconst_0        
	//   30   57:iload           6
	//   31   59:invokevirtual   #91  <Method String String.substring(int, int)>
	//   32   62:astore          9
				else
	//*  33   64:goto            71
					s2 = s3;
	//   34   67:aload           10
	//   35   69:astore          9
				j1 = j;
	//   36   71:iload_2         
	//   37   72:istore          4
				s1 = s2;
	//   38   74:aload           9
	//   39   76:astore_1        
				if(!((Map) (linkedhashmap)).containsKey(((Object) (s2))))
	//*  40   77:aload           11
	//*  41   79:aload           9
	//*  42   81:invokeinterface #808 <Method boolean Map.containsKey(Object)>
	//*  43   86:ifne            160
				{
					if(((Object) (s2)).equals("c"))
	//*  44   89:aload           9
	//*  45   91:ldc2            #914 <String "c">
	//*  46   94:invokevirtual   #451 <Method boolean Object.equals(Object)>
	//*  47   97:ifeq            107
						s1 = "campaign";
	//   48  100:ldc2            #916 <String "campaign">
	//   49  103:astore_1        
					else
	//*  50  104:goto            145
					if(((Object) (s2)).equals("pid"))
	//*  51  107:aload           9
	//*  52  109:ldc2            #364 <String "pid">
	//*  53  112:invokevirtual   #451 <Method boolean Object.equals(Object)>
	//*  54  115:ifeq            125
					{
						s1 = "media_source";
	//   55  118:ldc2            #443 <String "media_source">
	//   56  121:astore_1        
					} else
	//*  57  122:goto            145
					{
						s1 = s2;
	//   58  125:aload           9
	//   59  127:astore_1        
						if(((Object) (s2)).equals("af_prt"))
	//*  60  128:aload           9
	//*  61  130:ldc2            #918 <String "af_prt">
	//*  62  133:invokevirtual   #451 <Method boolean Object.equals(Object)>
	//*  63  136:ifeq            145
						{
							s1 = "agency";
	//   64  139:ldc2            #920 <String "agency">
	//   65  142:astore_1        
							j = 1;
	//   66  143:iconst_1        
	//   67  144:istore_2        
						}
					}
					((Map) (linkedhashmap)).put(((Object) (s1)), "");
	//   68  145:aload           11
	//   69  147:aload_1         
	//   70  148:ldc2            #922 <String "">
	//   71  151:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//   72  156:pop             
					j1 = j;
	//   73  157:iload_2         
	//   74  158:istore          4
				}
				if(l1 > 0)
	//*  75  160:iload           6
	//*  76  162:ifle            195
				{
					j = s3.length();
	//   77  165:aload           10
	//   78  167:invokevirtual   #567 <Method int String.length()>
	//   79  170:istore_2        
					l1++;
	//   80  171:iload           6
	//   81  173:iconst_1        
	//   82  174:iadd            
	//   83  175:istore          6
					if(j > l1)
	//*  84  177:iload_2         
	//*  85  178:iload           6
	//*  86  180:icmple          195
					{
						s2 = s3.substring(l1);
	//   87  183:aload           10
	//   88  185:iload           6
	//   89  187:invokevirtual   #924 <Method String String.substring(int)>
	//   90  190:astore          9
						break label0;
	//   91  192:goto            198
					}
				}
				s2 = null;
	//   92  195:aconst_null     
	//   93  196:astore          9
			}
			((Map) (linkedhashmap)).put(((Object) (s1)), ((Object) (s2)));
	//   94  198:aload           11
	//   95  200:aload_1         
	//   96  201:aload           9
	//   97  203:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//   98  208:pop             
			i1++;
	//   99  209:iload_3         
	//  100  210:iconst_1        
	//  101  211:iadd            
	//  102  212:istore_3        
		}

	//  103  213:iload           4
	//  104  215:istore_2        
	//* 105  216:goto            27
		try
		{
			if(!((Map) (linkedhashmap)).containsKey("install_time"))
	//* 106  219:aload           11
	//* 107  221:ldc2            #926 <String "install_time">
	//* 108  224:invokeinterface #808 <Method boolean Map.containsKey(Object)>
	//* 109  229:ifne            310
			{
				context = ((Context) (context.getPackageManager().getPackageInfo(context.getPackageName(), 0)));
	//  110  232:aload_0         
	//  111  233:invokevirtual   #930 <Method PackageManager Context.getPackageManager()>
	//  112  236:aload_0         
	//  113  237:invokevirtual   #577 <Method String Context.getPackageName()>
	//  114  240:iconst_0        
	//  115  241:invokevirtual   #934 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//  116  244:astore_0        
				s1 = ((String) (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US)));
	//  117  245:new             #936 <Class SimpleDateFormat>
	//  118  248:dup             
	//  119  249:ldc2            #938 <String "yyyy-MM-dd HH:mm:ss">
	//  120  252:getstatic       #944 <Field Locale Locale.US>
	//  121  255:invokespecial   #947 <Method void SimpleDateFormat(String, Locale)>
	//  122  258:astore_1        
				long l2 = ((PackageInfo) (context)).firstInstallTime;
	//  123  259:aload_0         
	//  124  260:getfield        #952 <Field long PackageInfo.firstInstallTime>
	//  125  263:lstore          7
				((DateFormat) (s1)).setTimeZone(TimeZone.getTimeZone("UTC"));
	//  126  265:aload_1         
	//  127  266:ldc2            #954 <String "UTC">
	//  128  269:invokestatic    #960 <Method TimeZone TimeZone.getTimeZone(String)>
	//  129  272:invokevirtual   #966 <Method void DateFormat.setTimeZone(TimeZone)>
				((Map) (linkedhashmap)).put("install_time", ((Object) (((DateFormat) (s1)).format(new Date(l2)))));
	//  130  275:aload           11
	//  131  277:ldc2            #926 <String "install_time">
	//  132  280:aload_1         
	//  133  281:new             #968 <Class Date>
	//  134  284:dup             
	//  135  285:lload           7
	//  136  287:invokespecial   #971 <Method void Date(long)>
	//  137  290:invokevirtual   #975 <Method String DateFormat.format(Date)>
	//  138  293:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//  139  298:pop             
			}
		}
	//* 140  299:goto            310
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 141  302:astore_0        
		{
			AFLogger.afErrorLog("Could not fetch install time. ", ((Throwable) (context)));
	//  142  303:ldc2            #977 <String "Could not fetch install time. ">
	//  143  306:aload_0         
	//  144  307:invokestatic    #245 <Method void AFLogger.afErrorLog(String, Throwable)>
		}
		if(!((Map) (linkedhashmap)).containsKey("af_status"))
	//* 145  310:aload           11
	//* 146  312:ldc2            #979 <String "af_status">
	//* 147  315:invokeinterface #808 <Method boolean Map.containsKey(Object)>
	//* 148  320:ifne            337
			((Map) (linkedhashmap)).put("af_status", "Non-organic");
	//  149  323:aload           11
	//  150  325:ldc2            #979 <String "af_status">
	//  151  328:ldc2            #981 <String "Non-organic">
	//  152  331:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//  153  336:pop             
		if(j != 0)
	//* 154  337:iload_2         
	//* 155  338:ifeq            352
			((Map) (linkedhashmap)).remove("media_source");
	//  156  341:aload           11
	//  157  343:ldc2            #443 <String "media_source">
	//  158  346:invokeinterface #984 <Method Object Map.remove(Object)>
	//  159  351:pop             
		return ((Map) (linkedhashmap));
	//  160  352:aload           11
	//  161  354:areturn         
	}

	private static Map _mth02CB(String s1)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #480 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #481 <Method void HashMap()>
	//    3    7:astore_1        
		s1 = ((String) (JSONObjectInstrumentation.init(s1)));
	//    4    8:aload_0         
	//    5    9:invokestatic    #890 <Method JSONObject JSONObjectInstrumentation.init(String)>
	//    6   12:astore_0        
		Iterator iterator = ((JSONObject) (s1)).keys();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #989 <Method Iterator JSONObject.keys()>
	//    9   17:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//   10   18:aload_2         
	//   11   19:invokeinterface #994 <Method boolean Iterator.hasNext()>
	//   12   24:ifeq            88
			String s2 = (String)iterator.next();
	//   13   27:aload_2         
	//   14   28:invokeinterface #997 <Method Object Iterator.next()>
	//   15   33:checkcast       #83  <Class String>
	//   16   36:astore_3        
			if(!_fld02CA0971.contains(((Object) (s2))))
	//*  17   37:getstatic       #139 <Field List _fld02CA0971>
	//*  18   40:aload_3         
	//*  19   41:invokeinterface #1002 <Method boolean List.contains(Object)>
	//*  20   46:ifne            18
			{
				String s3 = ((JSONObject) (s1)).getString(s2);
	//   21   49:aload_0         
	//   22   50:aload_3         
	//   23   51:invokevirtual   #1003 <Method String JSONObject.getString(String)>
	//   24   54:astore          4
				if(!TextUtils.isEmpty(((CharSequence) (s3))) && !((Object) ("null")).equals(((Object) (s3))))
	//*  25   56:aload           4
	//*  26   58:invokestatic    #1009 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  27   61:ifne            18
	//*  28   64:ldc2            #1011 <String "null">
	//*  29   67:aload           4
	//*  30   69:invokevirtual   #451 <Method boolean Object.equals(Object)>
	//*  31   72:ifne            18
					((Map) (hashmap)).put(((Object) (s2)), ((Object) (s3)));
	//   32   75:aload_1         
	//   33   76:aload_3         
	//   34   77:aload           4
	//   35   79:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//   36   84:pop             
			}
		} while(true);
	//   37   85:goto            18
		return ((Map) (hashmap));
	//   38   88:aload_1         
	//   39   89:areturn         
		s1;
	//   40   90:astore_0        
		AFLogger.afErrorLog(((Throwable) (s1)).getMessage(), ((Throwable) (s1)));
	//   41   91:aload_0         
	//   42   92:invokevirtual   #817 <Method String Throwable.getMessage()>
	//   43   95:aload_0         
	//   44   96:invokestatic    #245 <Method void AFLogger.afErrorLog(String, Throwable)>
		return null;
	//   45   99:aconst_null     
	//   46  100:areturn         
	}

	private static void _mth02CB(Context context, Map map)
	{
		i j = i.d._fld02CF;
	//    0    0:getstatic       #1018 <Field i i$d._fld02CF>
	//    1    3:astore_2        
		context = ((Context) (i._mth02CB(context)));
	//    2    4:aload_0         
	//    3    5:invokestatic    #1023 <Method i$a i._mth02CB(Context)>
	//    4    8:astore_0        
		map.put("network", ((Object) (((i.a) (context))._mth0971())));
	//    5    9:aload_1         
	//    6   10:ldc2            #1025 <String "network">
	//    7   13:aload_0         
	//    8   14:invokevirtual   #1029 <Method String i$a._mth0971()>
	//    9   17:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//   10   22:pop             
		if(((i.a) (context))._mth02CF() != null)
	//*  11   23:aload_0         
	//*  12   24:invokevirtual   #1031 <Method String i$a._mth02CF()>
	//*  13   27:ifnull          44
			map.put("operator", ((Object) (((i.a) (context))._mth02CF())));
	//   14   30:aload_1         
	//   15   31:ldc2            #1033 <String "operator">
	//   16   34:aload_0         
	//   17   35:invokevirtual   #1031 <Method String i$a._mth02CF()>
	//   18   38:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//   19   43:pop             
		if(((i.a) (context))._mth02CB() != null)
	//*  20   44:aload_0         
	//*  21   45:invokevirtual   #1035 <Method String i$a._mth02CB()>
	//*  22   48:ifnull          65
			map.put("carrier", ((Object) (((i.a) (context))._mth02CB())));
	//   23   51:aload_1         
	//   24   52:ldc2            #1037 <String "carrier">
	//   25   55:aload_0         
	//   26   56:invokevirtual   #1035 <Method String i$a._mth02CB()>
	//   27   59:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//   28   64:pop             
	//   29   65:return          
	}

	static void _mth02CB(AppsFlyerLib appsflyerlib, String s1, String s2, String s3, WeakReference weakreference, String s4, boolean flag)
		throws IOException
	{
		URL url = new URL(s1);
	//    0    0:new             #622 <Class URL>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #1040 <Method void URL(String)>
	//    4    8:astore          7
		StringBuilder stringbuilder = new StringBuilder("url: ");
	//    5   10:new             #95  <Class StringBuilder>
	//    6   13:dup             
	//    7   14:ldc2            #1042 <String "url: ">
	//    8   17:invokespecial   #115 <Method void StringBuilder(String)>
	//    9   20:astore          8
		stringbuilder.append(((Object) (url)).toString());
	//   10   22:aload           8
	//   11   24:aload           7
	//   12   26:invokevirtual   #108 <Method String Object.toString()>
	//   13   29:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   14   32:pop             
		AFLogger.afInfoLog(((Object) (stringbuilder)).toString());
	//   15   33:aload           8
	//   16   35:invokevirtual   #108 <Method String Object.toString()>
	//   17   38:invokestatic    #308 <Method void AFLogger.afInfoLog(String)>
		g._cls5._mth02CE("data: ".concat(String.valueOf(((Object) (s2)))));
	//   18   41:ldc2            #1044 <String "data: ">
	//   19   44:aload_2         
	//   20   45:invokestatic    #712 <Method String String.valueOf(Object)>
	//   21   48:invokevirtual   #697 <Method String String.concat(String)>
	//   22   51:invokestatic    #1048 <Method void g$5._mth02CE(String)>
		_mth02CA((Context)((Reference) (weakreference)).get(), "AppsFlyer_4.8.9", "EVENT_DATA", s2);
	//   23   54:aload           4
	//   24   56:invokevirtual   #612 <Method Object Reference.get()>
	//   25   59:checkcast       #274 <Class Context>
	//   26   62:ldc2            #699 <String "AppsFlyer_4.8.9">
	//   27   65:ldc2            #1050 <String "EVENT_DATA">
	//   28   68:aload_2         
	//   29   69:invokestatic    #705 <Method void _mth02CA(Context, String, String, String)>
		try
		{
			appsflyerlib._mth02CA(url, s2, s3, weakreference, s4, flag);
	//   30   72:aload_0         
	//   31   73:aload           7
	//   32   75:aload_2         
	//   33   76:aload_3         
	//   34   77:aload           4
	//   35   79:aload           5
	//   36   81:iload           6
	//   37   83:invokespecial   #1052 <Method void _mth02CA(URL, String, String, WeakReference, String, boolean)>
			return;
	//   38   86:return          
		}
		catch(IOException ioexception)
	//*  39   87:astore          7
		{
			AFLogger.afErrorLog("Exception in sendRequestToServer. ", ((Throwable) (ioexception)));
	//   40   89:ldc2            #1054 <String "Exception in sendRequestToServer. ">
	//   41   92:aload           7
	//   42   94:invokestatic    #245 <Method void AFLogger.afErrorLog(String, Throwable)>
			if(AppsFlyerProperties.getInstance().getBoolean("useHttpFallback", false))
	//*  43   97:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//*  44  100:ldc2            #1056 <String "useHttpFallback">
	//*  45  103:iconst_0        
	//*  46  104:invokevirtual   #339 <Method boolean AppsFlyerProperties.getBoolean(String, boolean)>
	//*  47  107:ifeq            140
			{
				appsflyerlib._mth02CA(new URL(s1.replace("https:", "http:")), s2, s3, weakreference, s4, flag);
	//   48  110:aload_0         
	//   49  111:new             #622 <Class URL>
	//   50  114:dup             
	//   51  115:aload_1         
	//   52  116:ldc2            #1058 <String "https:">
	//   53  119:ldc2            #1060 <String "http:">
	//   54  122:invokevirtual   #1064 <Method String String.replace(CharSequence, CharSequence)>
	//   55  125:invokespecial   #1040 <Method void URL(String)>
	//   56  128:aload_2         
	//   57  129:aload_3         
	//   58  130:aload           4
	//   59  132:aload           5
	//   60  134:iload           6
	//   61  136:invokespecial   #1052 <Method void _mth02CA(URL, String, String, WeakReference, String, boolean)>
				return;
	//   62  139:return          
			} else
			{
				appsflyerlib = ((AppsFlyerLib) (new StringBuilder("failed to send requeset to server. ")));
	//   63  140:new             #95  <Class StringBuilder>
	//   64  143:dup             
	//   65  144:ldc2            #1066 <String "failed to send requeset to server. ">
	//   66  147:invokespecial   #115 <Method void StringBuilder(String)>
	//   67  150:astore_0        
				((StringBuilder) (appsflyerlib)).append(((Throwable) (ioexception)).getLocalizedMessage());
	//   68  151:aload_0         
	//   69  152:aload           7
	//   70  154:invokevirtual   #524 <Method String Throwable.getLocalizedMessage()>
	//   71  157:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   72  160:pop             
				AFLogger.afInfoLog(((Object) (appsflyerlib)).toString());
	//   73  161:aload_0         
	//   74  162:invokevirtual   #108 <Method String Object.toString()>
	//   75  165:invokestatic    #308 <Method void AFLogger.afInfoLog(String)>
				_mth02CA((Context)((Reference) (weakreference)).get(), "AppsFlyer_4.8.9", "ERROR", ((Throwable) (ioexception)).getLocalizedMessage());
	//   76  168:aload           4
	//   77  170:invokevirtual   #612 <Method Object Reference.get()>
	//   78  173:checkcast       #274 <Class Context>
	//   79  176:ldc2            #699 <String "AppsFlyer_4.8.9">
	//   80  179:ldc2            #1068 <String "ERROR">
	//   81  182:aload           7
	//   82  184:invokevirtual   #524 <Method String Throwable.getLocalizedMessage()>
	//   83  187:invokestatic    #705 <Method void _mth02CA(Context, String, String, String)>
				throw ioexception;
	//   84  190:aload           7
	//   85  192:athrow          
			}
		}
	}

	static boolean _mth02CB(AppsFlyerLib appsflyerlib)
	{
		return appsflyerlib._fld141D0971;
	//    0    0:aload_0         
	//    1    1:getfield        #180 <Field boolean _fld141D0971>
	//    2    4:ireturn         
	}

	private static int _mth02CE(SharedPreferences sharedpreferences, String s1, boolean flag)
	{
		int i1 = sharedpreferences.getInt(s1, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokeinterface #780 <Method int SharedPreferences.getInt(String, int)>
	//    4    8:istore          4
		int j = i1;
	//    5   10:iload           4
	//    6   12:istore_3        
		if(flag)
	//*   7   13:iload_2         
	//*   8   14:ifeq            62
		{
			j = i1 + 1;
	//    9   17:iload           4
	//   10   19:iconst_1        
	//   11   20:iadd            
	//   12   21:istore_3        
			sharedpreferences = ((SharedPreferences) (sharedpreferences.edit()));
	//   13   22:aload_0         
	//   14   23:invokeinterface #1072 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   15   28:astore_0        
			((android.content.SharedPreferences.Editor) (sharedpreferences)).putInt(s1, j);
	//   16   29:aload_0         
	//   17   30:aload_1         
	//   18   31:iload_3         
	//   19   32:invokeinterface #1078 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
	//   20   37:pop             
			if(android.os.Build.VERSION.SDK_INT >= 9)
	//*  21   38:getstatic       #288 <Field int android.os.Build$VERSION.SDK_INT>
	//*  22   41:bipush          9
	//*  23   43:icmplt          55
				((android.content.SharedPreferences.Editor) (sharedpreferences)).apply();
	//   24   46:aload_0         
	//   25   47:invokeinterface #1081 <Method void android.content.SharedPreferences$Editor.apply()>
			else
	//*  26   52:goto            62
				((android.content.SharedPreferences.Editor) (sharedpreferences)).commit();
	//   27   55:aload_0         
	//   28   56:invokeinterface #1084 <Method boolean android.content.SharedPreferences$Editor.commit()>
	//   29   61:pop             
		}
		if(v._mth02CB()._mth02BB())
	//*  30   62:invokestatic    #617 <Method v v._mth02CB()>
	//*  31   65:invokevirtual   #1086 <Method boolean v._mth02BB()>
	//*  32   68:ifeq            81
			v._mth02CB()._mth02CF(String.valueOf(j));
	//   33   71:invokestatic    #617 <Method v v._mth02CB()>
	//   34   74:iload_3         
	//   35   75:invokestatic    #648 <Method String String.valueOf(int)>
	//   36   78:invokevirtual   #1088 <Method void v._mth02CF(String)>
		return j;
	//   37   81:iload_3         
	//   38   82:ireturn         
	}

	private static String _mth02CE(String s1)
	{
		try
		{
			s1 = (String)Class.forName("android.os.SystemProperties").getMethod("get", new Class[] {
				java/lang/String
			}).invoke(((Object) (null)), new Object[] {
				s1
			});
	//    0    0:ldc2            #1090 <String "android.os.SystemProperties">
	//    1    3:invokestatic    #1094 <Method Class Class.forName(String)>
	//    2    6:ldc2            #1095 <String "get">
	//    3    9:iconst_1        
	//    4   10:anewarray       Class[]
	//    5   13:dup             
	//    6   14:iconst_0        
	//    7   15:ldc1            #83  <Class String>
	//    8   17:aastore         
	//    9   18:invokevirtual   #1099 <Method Method Class.getMethod(String, Class[])>
	//   10   21:aconst_null     
	//   11   22:iconst_1        
	//   12   23:anewarray       Object[]
	//   13   26:dup             
	//   14   27:iconst_0        
	//   15   28:aload_0         
	//   16   29:aastore         
	//   17   30:invokevirtual   #1105 <Method Object Method.invoke(Object, Object[])>
	//   18   33:checkcast       #83  <Class String>
	//   19   36:astore_0        
		}
	//*  20   37:aload_0         
	//*  21   38:areturn         
		// Misplaced declaration of an exception variable
		catch(String s1)
	//*  22   39:astore_0        
		{
			AFLogger.afErrorLog(((Throwable) (s1)).getMessage(), ((Throwable) (s1)));
	//   23   40:aload_0         
	//   24   41:invokevirtual   #817 <Method String Throwable.getMessage()>
	//   25   44:aload_0         
	//   26   45:invokestatic    #245 <Method void AFLogger.afErrorLog(String, Throwable)>
			return null;
	//   27   48:aconst_null     
	//   28   49:areturn         
		}
		return s1;
	}

	private static String _mth02CE(WeakReference weakreference, String s1)
	{
		if(((Reference) (weakreference)).get() == null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #612 <Method Object Reference.get()>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return _mth02CA(s1, ((Context)((Reference) (weakreference)).get()).getPackageManager(), ((Context)((Reference) (weakreference)).get()).getPackageName());
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokevirtual   #612 <Method Object Reference.get()>
	//    8   14:checkcast       #274 <Class Context>
	//    9   17:invokevirtual   #930 <Method PackageManager Context.getPackageManager()>
	//   10   20:aload_0         
	//   11   21:invokevirtual   #612 <Method Object Reference.get()>
	//   12   24:checkcast       #274 <Class Context>
	//   13   27:invokevirtual   #577 <Method String Context.getPackageName()>
	//   14   30:invokestatic    #1107 <Method String _mth02CA(String, PackageManager, String)>
	//   15   33:areturn         
	}

	static ScheduledExecutorService _mth02CE(AppsFlyerLib appsflyerlib)
	{
		return appsflyerlib._fld097102CE;
	//    0    0:aload_0         
	//    1    1:getfield        #182 <Field ScheduledExecutorService _fld097102CE>
	//    2    4:areturn         
	}

	static void _mth02CE(Context context, String s1)
	{
		AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(((Object) (s1)))));
	//    0    0:ldc2            #1112 <String "received a new (extra) referrer: ">
	//    1    3:aload_1         
	//    2    4:invokestatic    #712 <Method String String.valueOf(Object)>
	//    3    7:invokevirtual   #697 <Method String String.concat(String)>
	//    4   10:invokestatic    #532 <Method void AFLogger.afDebugLog(String)>
		long l1;
		Object obj;
		l1 = System.currentTimeMillis();
	//    5   13:invokestatic    #318 <Method long System.currentTimeMillis()>
	//    6   16:lstore_2        
		obj = ((Object) (context.getSharedPreferences("appsflyer-data", 0).getString("extraReferrers", ((String) (null)))));
	//    7   17:aload_0         
	//    8   18:ldc2            #534 <String "appsflyer-data">
	//    9   21:iconst_0        
	//   10   22:invokevirtual   #538 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   11   25:ldc2            #1114 <String "extraReferrers">
	//   12   28:aconst_null     
	//   13   29:invokeinterface #793 <Method String SharedPreferences.getString(String, String)>
	//   14   34:astore          4
		if(obj != null)
			break MISSING_BLOCK_LABEL_62;
	//   15   36:aload           4
	//   16   38:ifnonnull       62
		JSONObject jsonobject;
		jsonobject = new JSONObject();
	//   17   41:new             #771 <Class JSONObject>
	//   18   44:dup             
	//   19   45:invokespecial   #891 <Method void JSONObject()>
	//   20   48:astore          5
		obj = ((Object) (new JSONArray()));
	//   21   50:new             #1116 <Class JSONArray>
	//   22   53:dup             
	//   23   54:invokespecial   #1117 <Method void JSONArray()>
	//   24   57:astore          4
		break MISSING_BLOCK_LABEL_104;
	//   25   59:goto            104
		jsonobject = JSONObjectInstrumentation.init(((String) (obj)));
	//   26   62:aload           4
	//   27   64:invokestatic    #890 <Method JSONObject JSONObjectInstrumentation.init(String)>
	//   28   67:astore          5
		if(jsonobject.has(s1))
	//*  29   69:aload           5
	//*  30   71:aload_1         
	//*  31   72:invokevirtual   #1120 <Method boolean JSONObject.has(String)>
	//*  32   75:ifeq            95
		{
			obj = ((Object) (JSONArrayInstrumentation.init((String)jsonobject.get(s1))));
	//   33   78:aload           5
	//   34   80:aload_1         
	//   35   81:invokevirtual   #1121 <Method Object JSONObject.get(String)>
	//   36   84:checkcast       #83  <Class String>
	//   37   87:invokestatic    #1126 <Method JSONArray JSONArrayInstrumentation.init(String)>
	//   38   90:astore          4
			break MISSING_BLOCK_LABEL_104;
	//   39   92:goto            104
		}
		obj = ((Object) (new JSONArray()));
	//   40   95:new             #1116 <Class JSONArray>
	//   41   98:dup             
	//   42   99:invokespecial   #1117 <Method void JSONArray()>
	//   43  102:astore          4
		if((long)((JSONArray) (obj)).length() < 5L)
	//*  44  104:aload           4
	//*  45  106:invokevirtual   #1127 <Method int JSONArray.length()>
	//*  46  109:i2l             
	//*  47  110:ldc2w           #169 <Long 5L>
	//*  48  113:lcmp            
	//*  49  114:ifge            124
			((JSONArray) (obj)).put(l1);
	//   50  117:aload           4
	//   51  119:lload_2         
	//   52  120:invokevirtual   #1130 <Method JSONArray JSONArray.put(long)>
	//   53  123:pop             
		if((long)jsonobject.length() >= 4L)
	//*  54  124:aload           5
	//*  55  126:invokevirtual   #1131 <Method int JSONObject.length()>
	//*  56  129:i2l             
	//*  57  130:ldc2w           #1132 <Long 4L>
	//*  58  133:lcmp            
	//*  59  134:iflt            142
			_mth0971(jsonobject);
	//   60  137:aload           5
	//   61  139:invokestatic    #1136 <Method void _mth0971(JSONObject)>
		if(!(obj instanceof JSONArray))
	//*  62  142:aload           4
	//*  63  144:instanceof      #1116 <Class JSONArray>
	//*  64  147:ifne            160
		{
			obj = ((Object) (((JSONArray) (obj)).toString()));
	//   65  150:aload           4
	//   66  152:invokevirtual   #1137 <Method String JSONArray.toString()>
	//   67  155:astore          4
			break MISSING_BLOCK_LABEL_170;
	//   68  157:goto            170
		}
		obj = ((Object) (JSONArrayInstrumentation.toString((JSONArray)obj)));
	//   69  160:aload           4
	//   70  162:checkcast       #1116 <Class JSONArray>
	//   71  165:invokestatic    #1140 <Method String JSONArrayInstrumentation.toString(JSONArray)>
	//   72  168:astore          4
		jsonobject.put(s1, obj);
	//   73  170:aload           5
	//   74  172:aload_1         
	//   75  173:aload           4
	//   76  175:invokevirtual   #896 <Method JSONObject JSONObject.put(String, Object)>
	//   77  178:pop             
		if(!(jsonobject instanceof JSONObject))
	//*  78  179:aload           5
	//*  79  181:instanceof      #771 <Class JSONObject>
	//*  80  184:ifne            197
		{
			obj = ((Object) (jsonobject.toString()));
	//   81  187:aload           5
	//   82  189:invokevirtual   #897 <Method String JSONObject.toString()>
	//   83  192:astore          4
			break MISSING_BLOCK_LABEL_207;
	//   84  194:goto            207
		}
		obj = ((Object) (JSONObjectInstrumentation.toString((JSONObject)jsonobject)));
	//   85  197:aload           5
	//   86  199:checkcast       #771 <Class JSONObject>
	//   87  202:invokestatic    #900 <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//   88  205:astore          4
		context = ((Context) (context.getSharedPreferences("appsflyer-data", 0).edit()));
	//   89  207:aload_0         
	//   90  208:ldc2            #534 <String "appsflyer-data">
	//   91  211:iconst_0        
	//   92  212:invokevirtual   #538 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   93  215:invokeinterface #1072 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   94  220:astore_0        
		((android.content.SharedPreferences.Editor) (context)).putString("extraReferrers", ((String) (obj)));
	//   95  221:aload_0         
	//   96  222:ldc2            #1114 <String "extraReferrers">
	//   97  225:aload           4
	//   98  227:invokeinterface #1144 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   99  232:pop             
		if(android.os.Build.VERSION.SDK_INT >= 9)
	//* 100  233:getstatic       #288 <Field int android.os.Build$VERSION.SDK_INT>
	//* 101  236:bipush          9
	//* 102  238:icmplt          248
		{
			((android.content.SharedPreferences.Editor) (context)).apply();
	//  103  241:aload_0         
	//  104  242:invokeinterface #1081 <Method void android.content.SharedPreferences$Editor.apply()>
			return;
	//  105  247:return          
		}
		StringBuilder stringbuilder;
		try
		{
			((android.content.SharedPreferences.Editor) (context)).commit();
	//  106  248:aload_0         
	//  107  249:invokeinterface #1084 <Method boolean android.content.SharedPreferences$Editor.commit()>
	//  108  254:pop             
			return;
	//  109  255:return          
		}
	//* 110  256:astore_0        
	//* 111  257:new             #95  <Class StringBuilder>
	//* 112  260:dup             
	//* 113  261:ldc2            #1146 <String "Couldn't save referrer - ">
	//* 114  264:invokespecial   #115 <Method void StringBuilder(String)>
	//* 115  267:astore          4
	//* 116  269:aload           4
	//* 117  271:aload_1         
	//* 118  272:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//* 119  275:pop             
	//* 120  276:aload           4
	//* 121  278:ldc2            #1148 <String ": ">
	//* 122  281:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//* 123  284:pop             
	//* 124  285:aload           4
	//* 125  287:invokevirtual   #108 <Method String Object.toString()>
	//* 126  290:aload_0         
	//* 127  291:invokestatic    #245 <Method void AFLogger.afErrorLog(String, Throwable)>
	//* 128  294:return          
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 129  295:astore_0        
		{
			return;
	//  130  296:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			stringbuilder = new StringBuilder("Couldn't save referrer - ");
		}
		stringbuilder.append(s1);
		stringbuilder.append(": ");
		AFLogger.afErrorLog(((Object) (stringbuilder)).toString(), ((Throwable) (context)));
		return;
	}

	private static void _mth02CE(Context context, String s1, int j)
	{
		context = ((Context) (context.getSharedPreferences("appsflyer-data", 0).edit()));
	//    0    0:aload_0         
	//    1    1:ldc2            #534 <String "appsflyer-data">
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #538 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    4    8:invokeinterface #1072 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    5   13:astore_0        
		((android.content.SharedPreferences.Editor) (context)).putInt(s1, j);
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:iload_2         
	//    9   17:invokeinterface #1078 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
	//   10   22:pop             
		if(android.os.Build.VERSION.SDK_INT >= 9)
	//*  11   23:getstatic       #288 <Field int android.os.Build$VERSION.SDK_INT>
	//*  12   26:bipush          9
	//*  13   28:icmplt          38
		{
			((android.content.SharedPreferences.Editor) (context)).apply();
	//   14   31:aload_0         
	//   15   32:invokeinterface #1081 <Method void android.content.SharedPreferences$Editor.apply()>
			return;
	//   16   37:return          
		} else
		{
			((android.content.SharedPreferences.Editor) (context)).commit();
	//   17   38:aload_0         
	//   18   39:invokeinterface #1084 <Method boolean android.content.SharedPreferences$Editor.commit()>
	//   19   44:pop             
			return;
	//   20   45:return          
		}
	}

	private static boolean _mth02CE(Context context)
	{
label0:
		{
			if(_mth02CE(context.getSharedPreferences("appsflyer-data", 0), "appsFlyerCount", false) > 2)
	//*   0    0:aload_0         
	//*   1    1:ldc2            #534 <String "appsflyer-data">
	//*   2    4:iconst_0        
	//*   3    5:invokevirtual   #538 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//*   4    8:ldc2            #579 <String "appsFlyerCount">
	//*   5   11:iconst_0        
	//*   6   12:invokestatic    #582 <Method int _mth02CE(SharedPreferences, String, boolean)>
	//*   7   15:iconst_2        
	//*   8   16:icmple          27
			{
				AFLogger.afRDLog("Install referrer will not load, the counter > 2, ");
	//    9   19:ldc2            #1153 <String "Install referrer will not load, the counter > 2, ">
	//   10   22:invokestatic    #1156 <Method void AFLogger.afRDLog(String)>
				return false;
	//   11   25:iconst_0        
	//   12   26:ireturn         
			}
			try
			{
				Class.forName("com.android.installreferrer.api.InstallReferrerClient");
	//   13   27:ldc2            #1158 <String "com.android.installreferrer.api.InstallReferrerClient">
	//   14   30:invokestatic    #1094 <Method Class Class.forName(String)>
	//   15   33:pop             
				if(!i.a._mth02CE(context, "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE"))
					break label0;
	//   16   34:aload_0         
	//   17   35:ldc2            #1160 <String "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE">
	//   18   38:invokestatic    #1163 <Method boolean i$a._mth02CE(Context, String)>
	//   19   41:ifeq            52
				AFLogger.afDebugLog("Install referrer is allowed");
	//   20   44:ldc2            #1165 <String "Install referrer is allowed">
	//   21   47:invokestatic    #532 <Method void AFLogger.afDebugLog(String)>
			}
	//*  22   50:iconst_1        
	//*  23   51:ireturn         
	//*  24   52:ldc2            #1167 <String "Install referrer is not allowed">
	//*  25   55:invokestatic    #532 <Method void AFLogger.afDebugLog(String)>
	//*  26   58:iconst_0        
	//*  27   59:ireturn         
	//*  28   60:astore_0        
	//*  29   61:ldc2            #1169 <String "An error occurred while trying to verify manifest : com.android.installreferrer.api.InstallReferrerClient">
	//*  30   64:aload_0         
	//*  31   65:invokestatic    #245 <Method void AFLogger.afErrorLog(String, Throwable)>
	//*  32   68:iconst_0        
	//*  33   69:ireturn         
	//*  34   70:ldc2            #1171 <String "Class com.android.installreferrer.api.InstallReferrerClient not found">
	//*  35   73:invokestatic    #1156 <Method void AFLogger.afRDLog(String)>
	//*  36   76:iconst_0        
	//*  37   77:ireturn         
			// Misplaced declaration of an exception variable
			catch(Context context)
			{
				AFLogger.afRDLog("Class com.android.installreferrer.api.InstallReferrerClient not found");
				return false;
			}
			// Misplaced declaration of an exception variable
			catch(Context context)
			{
				AFLogger.afErrorLog("An error occurred while trying to verify manifest : com.android.installreferrer.api.InstallReferrerClient", ((Throwable) (context)));
				return false;
			}
			return true;
		}
		AFLogger.afDebugLog("Install referrer is not allowed");
		return false;
	//*  38   78:astore_0        
	//*  39   79:goto            70
	}

	private static File _mth02CF(String s1)
	{
		if(s1 == null)
			break MISSING_BLOCK_LABEL_37;
	//    0    0:aload_0         
	//    1    1:ifnull          37
		if(s1.trim().length() <= 0)
			break MISSING_BLOCK_LABEL_37;
	//    2    4:aload_0         
	//    3    5:invokevirtual   #1176 <Method String String.trim()>
	//    4    8:invokevirtual   #567 <Method int String.length()>
	//    5   11:ifle            37
		s1 = ((String) (new File(s1.trim())));
	//    6   14:new             #852 <Class File>
	//    7   17:dup             
	//    8   18:aload_0         
	//    9   19:invokevirtual   #1176 <Method String String.trim()>
	//   10   22:invokespecial   #1177 <Method void File(String)>
	//   11   25:astore_0        
		return ((File) (s1));
	//   12   26:aload_0         
	//   13   27:areturn         
		s1;
	//   14   28:astore_0        
		AFLogger.afErrorLog(((Throwable) (s1)).getMessage(), ((Throwable) (s1)));
	//   15   29:aload_0         
	//   16   30:invokevirtual   #817 <Method String Throwable.getMessage()>
	//   17   33:aload_0         
	//   18   34:invokestatic    #245 <Method void AFLogger.afErrorLog(String, Throwable)>
		return null;
	//   19   37:aconst_null     
	//   20   38:areturn         
	}

	private static String _mth02CF(Context context, String s1)
		throws android.content.pm.PackageManager.NameNotFoundException
	{
		SharedPreferences sharedpreferences = context.getSharedPreferences("appsflyer-data", 0);
	//    0    0:aload_0         
	//    1    1:ldc2            #534 <String "appsflyer-data">
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #538 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    4    8:astore_2        
		if(sharedpreferences.contains("CACHED_CHANNEL"))
	//*   5    9:aload_2         
	//*   6   10:ldc2            #1179 <String "CACHED_CHANNEL">
	//*   7   13:invokeinterface #1181 <Method boolean SharedPreferences.contains(String)>
	//*   8   18:ifeq            32
		{
			return sharedpreferences.getString("CACHED_CHANNEL", ((String) (null)));
	//    9   21:aload_2         
	//   10   22:ldc2            #1179 <String "CACHED_CHANNEL">
	//   11   25:aconst_null     
	//   12   26:invokeinterface #793 <Method String SharedPreferences.getString(String, String)>
	//   13   31:areturn         
		} else
		{
			_mth02CF(context, "CACHED_CHANNEL", s1);
	//   14   32:aload_0         
	//   15   33:ldc2            #1179 <String "CACHED_CHANNEL">
	//   16   36:aload_1         
	//   17   37:invokestatic    #332 <Method void _mth02CF(Context, String, String)>
			return s1;
	//   18   40:aload_1         
	//   19   41:areturn         
		}
	}

	private static Map _mth02CF(Context context)
		throws m
	{
		context = ((Context) (context.getSharedPreferences("appsflyer-data", 0).getString("attributionId", ((String) (null)))));
	//    0    0:aload_0         
	//    1    1:ldc2            #534 <String "appsflyer-data">
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #538 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    4    8:ldc2            #790 <String "attributionId">
	//    5   11:aconst_null     
	//    6   12:invokeinterface #793 <Method String SharedPreferences.getString(String, String)>
	//    7   17:astore_0        
		if(context != null && ((String) (context)).length() > 0)
	//*   8   18:aload_0         
	//*   9   19:ifnull          34
	//*  10   22:aload_0         
	//*  11   23:invokevirtual   #567 <Method int String.length()>
	//*  12   26:ifle            34
			return _mth02CB(((String) (context)));
	//   13   29:aload_0         
	//   14   30:invokestatic    #271 <Method Map _mth02CB(String)>
	//   15   33:areturn         
		else
			throw new m();
	//   16   34:new             #266 <Class m>
	//   17   37:dup             
	//   18   38:invokespecial   #1182 <Method void m()>
	//   19   41:athrow          
	}

	static Map _mth02CF(AppsFlyerLib appsflyerlib)
	{
		return appsflyerlib._fld0971141D;
	//    0    0:aload_0         
	//    1    1:getfield        #590 <Field Map _fld0971141D>
	//    2    4:areturn         
	}

	private static void _mth02CF(Context context, String s1, String s2)
	{
		context = ((Context) (context.getSharedPreferences("appsflyer-data", 0).edit()));
	//    0    0:aload_0         
	//    1    1:ldc2            #534 <String "appsflyer-data">
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #538 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    4    8:invokeinterface #1072 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    5   13:astore_0        
		((android.content.SharedPreferences.Editor) (context)).putString(s1, s2);
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:aload_2         
	//    9   17:invokeinterface #1144 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   10   22:pop             
		if(android.os.Build.VERSION.SDK_INT >= 9)
	//*  11   23:getstatic       #288 <Field int android.os.Build$VERSION.SDK_INT>
	//*  12   26:bipush          9
	//*  13   28:icmplt          38
		{
			((android.content.SharedPreferences.Editor) (context)).apply();
	//   14   31:aload_0         
	//   15   32:invokeinterface #1081 <Method void android.content.SharedPreferences$Editor.apply()>
			return;
	//   16   37:return          
		} else
		{
			((android.content.SharedPreferences.Editor) (context)).commit();
	//   17   38:aload_0         
	//   18   39:invokeinterface #1084 <Method boolean android.content.SharedPreferences$Editor.commit()>
	//   19   44:pop             
			return;
	//   20   45:return          
		}
	}

	static void _mth02CF(Map map)
	{
		AppsFlyerConversionListener appsflyerconversionlistener = _fld02CB0971;
	//    0    0:getstatic       #149 <Field AppsFlyerConversionListener _fld02CB0971>
	//    1    3:astore_1        
		if(appsflyerconversionlistener != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          25
			try
			{
				appsflyerconversionlistener.onAppOpenAttribution(map);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokeinterface #521 <Method void AppsFlyerConversionListener.onAppOpenAttribution(Map)>
				return;
	//    7   15:return          
			}
			// Misplaced declaration of an exception variable
			catch(Map map)
	//*   8   16:astore_0        
			{
				AFLogger.afErrorLog(((Throwable) (map)).getLocalizedMessage(), ((Throwable) (map)));
	//    9   17:aload_0         
	//   10   18:invokevirtual   #524 <Method String Throwable.getLocalizedMessage()>
	//   11   21:aload_0         
	//   12   22:invokestatic    #245 <Method void AFLogger.afErrorLog(String, Throwable)>
			}
	//   13   25:return          
	}

	private boolean _mth02CF()
	{
		if(_fld02BC > 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #160 <Field long _fld02BC>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifle            198
		{
			long l1 = System.currentTimeMillis() - _fld02BC;
	//    5    9:invokestatic    #318 <Method long System.currentTimeMillis()>
	//    6   12:aload_0         
	//    7   13:getfield        #160 <Field long _fld02BC>
	//    8   16:lsub            
	//    9   17:lstore_1        
			Object obj = ((Object) (new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", Locale.US)));
	//   10   18:new             #936 <Class SimpleDateFormat>
	//   11   21:dup             
	//   12   22:ldc2            #1186 <String "yyyy/MM/dd HH:mm:ss.SSS Z">
	//   13   25:getstatic       #944 <Field Locale Locale.US>
	//   14   28:invokespecial   #947 <Method void SimpleDateFormat(String, Locale)>
	//   15   31:astore          6
			long l2 = _fld02BC;
	//   16   33:aload_0         
	//   17   34:getfield        #160 <Field long _fld02BC>
	//   18   37:lstore_3        
			((DateFormat) (obj)).setTimeZone(TimeZone.getTimeZone("UTC"));
	//   19   38:aload           6
	//   20   40:ldc2            #954 <String "UTC">
	//   21   43:invokestatic    #960 <Method TimeZone TimeZone.getTimeZone(String)>
	//   22   46:invokevirtual   #966 <Method void DateFormat.setTimeZone(TimeZone)>
			String s1 = ((DateFormat) (obj)).format(new Date(l2));
	//   23   49:aload           6
	//   24   51:new             #968 <Class Date>
	//   25   54:dup             
	//   26   55:lload_3         
	//   27   56:invokespecial   #971 <Method void Date(long)>
	//   28   59:invokevirtual   #975 <Method String DateFormat.format(Date)>
	//   29   62:astore          5
			l2 = _fld02CF0971;
	//   30   64:aload_0         
	//   31   65:getfield        #162 <Field long _fld02CF0971>
	//   32   68:lstore_3        
			((DateFormat) (obj)).setTimeZone(TimeZone.getTimeZone("UTC"));
	//   33   69:aload           6
	//   34   71:ldc2            #954 <String "UTC">
	//   35   74:invokestatic    #960 <Method TimeZone TimeZone.getTimeZone(String)>
	//   36   77:invokevirtual   #966 <Method void DateFormat.setTimeZone(TimeZone)>
			obj = ((Object) (((DateFormat) (obj)).format(new Date(l2))));
	//   37   80:aload           6
	//   38   82:new             #968 <Class Date>
	//   39   85:dup             
	//   40   86:lload_3         
	//   41   87:invokespecial   #971 <Method void Date(long)>
	//   42   90:invokevirtual   #975 <Method String DateFormat.format(Date)>
	//   43   93:astore          6
			if(l1 < _fld097102CA && !isTrackingStopped())
	//*  44   95:lload_1         
	//*  45   96:aload_0         
	//*  46   97:getfield        #176 <Field long _fld097102CA>
	//*  47  100:lcmp            
	//*  48  101:ifge            156
	//*  49  104:aload_0         
	//*  50  105:invokevirtual   #545 <Method boolean isTrackingStopped()>
	//*  51  108:ifne            156
			{
				AFLogger.afInfoLog(String.format(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", new Object[] {
					s1, obj, Long.valueOf(l1), Long.valueOf(_fld097102CA)
				}));
	//   52  111:getstatic       #944 <Field Locale Locale.US>
	//   53  114:ldc2            #1188 <String "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms">
	//   54  117:iconst_4        
	//   55  118:anewarray       Object[]
	//   56  121:dup             
	//   57  122:iconst_0        
	//   58  123:aload           5
	//   59  125:aastore         
	//   60  126:dup             
	//   61  127:iconst_1        
	//   62  128:aload           6
	//   63  130:aastore         
	//   64  131:dup             
	//   65  132:iconst_2        
	//   66  133:lload_1         
	//   67  134:invokestatic    #1193 <Method Long Long.valueOf(long)>
	//   68  137:aastore         
	//   69  138:dup             
	//   70  139:iconst_3        
	//   71  140:aload_0         
	//   72  141:getfield        #176 <Field long _fld097102CA>
	//   73  144:invokestatic    #1193 <Method Long Long.valueOf(long)>
	//   74  147:aastore         
	//   75  148:invokestatic    #1196 <Method String String.format(Locale, String, Object[])>
	//   76  151:invokestatic    #308 <Method void AFLogger.afInfoLog(String)>
				return true;
	//   77  154:iconst_1        
	//   78  155:ireturn         
			}
			if(!isTrackingStopped())
	//*  79  156:aload_0         
	//*  80  157:invokevirtual   #545 <Method boolean isTrackingStopped()>
	//*  81  160:ifne            211
			{
				AFLogger.afInfoLog(String.format(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", new Object[] {
					s1, obj, Long.valueOf(l1)
				}));
	//   82  163:getstatic       #944 <Field Locale Locale.US>
	//   83  166:ldc2            #1198 <String "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)">
	//   84  169:iconst_3        
	//   85  170:anewarray       Object[]
	//   86  173:dup             
	//   87  174:iconst_0        
	//   88  175:aload           5
	//   89  177:aastore         
	//   90  178:dup             
	//   91  179:iconst_1        
	//   92  180:aload           6
	//   93  182:aastore         
	//   94  183:dup             
	//   95  184:iconst_2        
	//   96  185:lload_1         
	//   97  186:invokestatic    #1193 <Method Long Long.valueOf(long)>
	//   98  189:aastore         
	//   99  190:invokestatic    #1196 <Method String String.format(Locale, String, Object[])>
	//  100  193:invokestatic    #308 <Method void AFLogger.afInfoLog(String)>
				return false;
	//  101  196:iconst_0        
	//  102  197:ireturn         
			}
		} else
		if(!isTrackingStopped())
	//* 103  198:aload_0         
	//* 104  199:invokevirtual   #545 <Method boolean isTrackingStopped()>
	//* 105  202:ifne            211
			AFLogger.afInfoLog("Sending first launch for this session!");
	//  106  205:ldc2            #1200 <String "Sending first launch for this session!">
	//  107  208:invokestatic    #308 <Method void AFLogger.afInfoLog(String)>
		return false;
	//  108  211:iconst_0        
	//  109  212:ireturn         
	}

	static int _mth0971(SharedPreferences sharedpreferences)
	{
		return _mth02CE(sharedpreferences, "appsFlyerCount", false);
	//    0    0:aload_0         
	//    1    1:ldc2            #579 <String "appsFlyerCount">
	//    2    4:iconst_0        
	//    3    5:invokestatic    #582 <Method int _mth02CE(SharedPreferences, String, boolean)>
	//    4    8:ireturn         
	}

	static String _mth0971(String s1)
	{
		return AppsFlyerProperties.getInstance().getString(s1);
	//    0    0:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #258 <Method String AppsFlyerProperties.getString(String)>
	//    3    7:areturn         
	}

	static List _mth0971()
	{
		return _fld037A;
	//    0    0:getstatic       #147 <Field List _fld037A>
	//    1    3:areturn         
	}

	static ScheduledExecutorService _mth0971(AppsFlyerLib appsflyerlib)
	{
		appsflyerlib._fld097102CE = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #182 <Field ScheduledExecutorService _fld097102CE>
		return null;
	//    3    5:aconst_null     
	//    4    6:areturn         
	}

	static void _mth0971(Context context, String s1, int j)
	{
		_mth02CE(context, s1, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #1204 <Method void _mth02CE(Context, String, int)>
	//    4    6:return          
	}

	private static void _mth0971(Context context, String s1, long l1)
	{
		context = ((Context) (context.getSharedPreferences("appsflyer-data", 0).edit()));
	//    0    0:aload_0         
	//    1    1:ldc2            #534 <String "appsflyer-data">
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #538 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    4    8:invokeinterface #1072 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    5   13:astore_0        
		((android.content.SharedPreferences.Editor) (context)).putLong(s1, l1);
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:lload_2         
	//    9   17:invokeinterface #1208 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//   10   22:pop             
		if(android.os.Build.VERSION.SDK_INT >= 9)
	//*  11   23:getstatic       #288 <Field int android.os.Build$VERSION.SDK_INT>
	//*  12   26:bipush          9
	//*  13   28:icmplt          38
		{
			((android.content.SharedPreferences.Editor) (context)).apply();
	//   14   31:aload_0         
	//   15   32:invokeinterface #1081 <Method void android.content.SharedPreferences$Editor.apply()>
			return;
	//   16   37:return          
		} else
		{
			((android.content.SharedPreferences.Editor) (context)).commit();
	//   17   38:aload_0         
	//   18   39:invokeinterface #1084 <Method boolean android.content.SharedPreferences$Editor.commit()>
	//   19   44:pop             
			return;
	//   20   45:return          
		}
	}

	private static void _mth0971(ScheduledExecutorService scheduledexecutorservice, Runnable runnable, long l1, TimeUnit timeunit)
	{
		if(scheduledexecutorservice == null)
			break MISSING_BLOCK_LABEL_34;
	//    0    0:aload_0         
	//    1    1:ifnull          34
		if(!scheduledexecutorservice.isShutdown() && !scheduledexecutorservice.isTerminated())
	//*   2    4:aload_0         
	//*   3    5:invokeinterface #1215 <Method boolean ScheduledExecutorService.isShutdown()>
	//*   4   10:ifne            34
	//*   5   13:aload_0         
	//*   6   14:invokeinterface #1218 <Method boolean ScheduledExecutorService.isTerminated()>
	//*   7   19:ifne            34
		{
			scheduledexecutorservice.schedule(runnable, l1, timeunit);
	//    8   22:aload_0         
	//    9   23:aload_1         
	//   10   24:lload_2         
	//   11   25:aload           4
	//   12   27:invokeinterface #1222 <Method java.util.concurrent.ScheduledFuture ScheduledExecutorService.schedule(Runnable, long, TimeUnit)>
	//   13   32:pop             
			return;
	//   14   33:return          
		}
		try
		{
			AFLogger.afWarnLog("scheduler is null, shut downed or terminated");
	//   15   34:ldc2            #1224 <String "scheduler is null, shut downed or terminated">
	//   16   37:invokestatic    #803 <Method void AFLogger.afWarnLog(String)>
			return;
	//   17   40:return          
		}
	//*  18   41:astore_0        
	//*  19   42:ldc2            #1226 <String "scheduleJob failed with Exception">
	//*  20   45:aload_0         
	//*  21   46:invokestatic    #245 <Method void AFLogger.afErrorLog(String, Throwable)>
	//*  22   49:return          
		// Misplaced declaration of an exception variable
		catch(ScheduledExecutorService scheduledexecutorservice)
	//*  23   50:astore_0        
		{
			AFLogger.afErrorLog("scheduleJob failed with RejectedExecutionException Exception", ((Throwable) (scheduledexecutorservice)));
	//   24   51:ldc2            #1228 <String "scheduleJob failed with RejectedExecutionException Exception">
	//   25   54:aload_0         
	//   26   55:invokestatic    #245 <Method void AFLogger.afErrorLog(String, Throwable)>
		}
		// Misplaced declaration of an exception variable
		catch(ScheduledExecutorService scheduledexecutorservice)
		{
			AFLogger.afErrorLog("scheduleJob failed with Exception", ((Throwable) (scheduledexecutorservice)));
			return;
		}
		return;
	//   27   58:return          
	}

	private static void _mth0971(JSONObject jsonobject)
	{
		Object obj;
		ArrayList arraylist;
		arraylist = new ArrayList();
	//    0    0:new             #1230 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #1231 <Method void ArrayList()>
	//    3    7:astore          9
		obj = ((Object) (jsonobject.keys()));
	//    4    9:aload_0         
	//    5   10:invokevirtual   #989 <Method Iterator JSONObject.keys()>
	//    6   13:astore          7
_L2:
		int j;
		Object obj1;
		boolean flag = ((Iterator) (obj)).hasNext();
	//    7   15:aload           7
	//    8   17:invokeinterface #994 <Method boolean Iterator.hasNext()>
	//    9   22:istore_2        
		j = 0;
	//   10   23:iconst_0        
	//   11   24:istore_1        
		if(!flag)
			break MISSING_BLOCK_LABEL_91;
	//   12   25:iload_2         
	//   13   26:ifeq            91
		obj1 = ((Object) ((String)((Iterator) (obj)).next()));
	//   14   29:aload           7
	//   15   31:invokeinterface #997 <Method Object Iterator.next()>
	//   16   36:checkcast       #83  <Class String>
	//   17   39:astore          8
		obj1 = ((Object) (JSONArrayInstrumentation.init((String)jsonobject.get(((String) (obj1))))));
	//   18   41:aload_0         
	//   19   42:aload           8
	//   20   44:invokevirtual   #1121 <Method Object JSONObject.get(String)>
	//   21   47:checkcast       #83  <Class String>
	//   22   50:invokestatic    #1126 <Method JSONArray JSONArrayInstrumentation.init(String)>
	//   23   53:astore          8
_L3:
		if(j >= ((JSONArray) (obj1)).length()) goto _L2; else goto _L1
	//   24   55:iload_1         
	//   25   56:aload           8
	//   26   58:invokevirtual   #1127 <Method int JSONArray.length()>
	//   27   61:icmpge          15
_L1:
		((List) (arraylist)).add(((Object) (Long.valueOf(((JSONArray) (obj1)).getLong(j)))));
	//   28   64:aload           9
	//   29   66:aload           8
	//   30   68:iload_1         
	//   31   69:invokevirtual   #1234 <Method long JSONArray.getLong(int)>
	//   32   72:invokestatic    #1193 <Method Long Long.valueOf(long)>
	//   33   75:invokeinterface #1237 <Method boolean List.add(Object)>
	//   34   80:pop             
		j++;
	//   35   81:iload_1         
	//   36   82:iconst_1        
	//   37   83:iadd            
	//   38   84:istore_1        
		  goto _L3
	//*  39   85:goto            55
	//*  40   88:goto            15
		Iterator iterator;
		Collections.sort(((List) (arraylist)));
	//   41   91:aload           9
	//   42   93:invokestatic    #1243 <Method void Collections.sort(List)>
		iterator = jsonobject.keys();
	//   43   96:aload_0         
	//   44   97:invokevirtual   #989 <Method Iterator JSONObject.keys()>
	//   45  100:astore          10
		obj = null;
	//   46  102:aconst_null     
	//   47  103:astore          7
_L5:
		if(!iterator.hasNext() || obj != null)
			break MISSING_BLOCK_LABEL_272;
	//   48  105:aload           10
	//   49  107:invokeinterface #994 <Method boolean Iterator.hasNext()>
	//   50  112:ifeq            272
	//   51  115:aload           7
	//   52  117:ifnonnull       272
		obj1 = ((Object) ((String)iterator.next()));
	//   53  120:aload           10
	//   54  122:invokeinterface #997 <Method Object Iterator.next()>
	//   55  127:checkcast       #83  <Class String>
	//   56  130:astore          8
		JSONArray jsonarray = JSONArrayInstrumentation.init((String)jsonobject.get(((String) (obj1))));
	//   57  132:aload_0         
	//   58  133:aload           8
	//   59  135:invokevirtual   #1121 <Method Object JSONObject.get(String)>
	//   60  138:checkcast       #83  <Class String>
	//   61  141:invokestatic    #1126 <Method JSONArray JSONArrayInstrumentation.init(String)>
	//   62  144:astore          11
		j = 0;
	//   63  146:iconst_0        
	//   64  147:istore_1        
_L6:
		if(j >= jsonarray.length()) goto _L5; else goto _L4
	//   65  148:iload_1         
	//   66  149:aload           11
	//   67  151:invokevirtual   #1127 <Method int JSONArray.length()>
	//   68  154:icmpge          263
_L4:
		long l1;
		long l2;
		if(jsonarray.getLong(j) == ((Number) ((Long)((List) (arraylist)).get(0))).longValue() || jsonarray.getLong(j) == ((Number) ((Long)((List) (arraylist)).get(1))).longValue())
			break MISSING_BLOCK_LABEL_257;
	//   69  157:aload           11
	//   70  159:iload_1         
	//   71  160:invokevirtual   #1234 <Method long JSONArray.getLong(int)>
	//   72  163:aload           9
	//   73  165:iconst_0        
	//   74  166:invokeinterface #1246 <Method Object List.get(int)>
	//   75  171:checkcast       #1190 <Class Long>
	//   76  174:invokevirtual   #1251 <Method long Number.longValue()>
	//   77  177:lcmp            
	//   78  178:ifeq            257
	//   79  181:aload           11
	//   80  183:iload_1         
	//   81  184:invokevirtual   #1234 <Method long JSONArray.getLong(int)>
	//   82  187:aload           9
	//   83  189:iconst_1        
	//   84  190:invokeinterface #1246 <Method Object List.get(int)>
	//   85  195:checkcast       #1190 <Class Long>
	//   86  198:invokevirtual   #1251 <Method long Number.longValue()>
	//   87  201:lcmp            
	//   88  202:ifeq            257
		l1 = jsonarray.getLong(j);
	//   89  205:aload           11
	//   90  207:iload_1         
	//   91  208:invokevirtual   #1234 <Method long JSONArray.getLong(int)>
	//   92  211:lstore_3        
		l2 = ((Number) ((Long)((List) (arraylist)).get(((List) (arraylist)).size() - 1))).longValue();
	//   93  212:aload           9
	//   94  214:aload           9
	//   95  216:invokeinterface #1252 <Method int List.size()>
	//   96  221:iconst_1        
	//   97  222:isub            
	//   98  223:invokeinterface #1246 <Method Object List.get(int)>
	//   99  228:checkcast       #1190 <Class Long>
	//  100  231:invokevirtual   #1251 <Method long Number.longValue()>
	//  101  234:lstore          5
		if(l1 == l2)
	//* 102  236:lload_3         
	//* 103  237:lload           5
	//* 104  239:lcmp            
	//* 105  240:ifne            246
			break MISSING_BLOCK_LABEL_257;
	//  106  243:goto            257
		j++;
	//  107  246:iload_1         
	//  108  247:iconst_1        
	//  109  248:iadd            
	//  110  249:istore_1        
		obj = obj1;
	//  111  250:aload           8
	//  112  252:astore          7
		  goto _L6
	//* 113  254:goto            148
		obj = null;
	//  114  257:aconst_null     
	//  115  258:astore          7
		  goto _L5
	//* 116  260:goto            105
	//* 117  263:goto            105
	//* 118  266:goto            105
	//* 119  269:goto            105
		if(obj != null)
	//* 120  272:aload           7
	//* 121  274:ifnull          284
			jsonobject.remove(((String) (obj)));
	//  122  277:aload_0         
	//  123  278:aload           7
	//  124  280:invokevirtual   #1254 <Method Object JSONObject.remove(String)>
	//  125  283:pop             
		return;
	//  126  284:return          
		JSONException jsonexception;
		jsonexception;
	//  127  285:astore          8
		  goto _L2
	//* 128  287:goto            88
		jsonexception;
	//  129  290:astore          8
		  goto _L5
	//* 130  292:goto            269
		jsonexception;
	//  131  295:astore          8
		  goto _L5
	//* 132  297:goto            266
	}

	private static boolean _mth0971(Context context)
	{
		int j = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
	//    0    0:invokestatic    #1259 <Method GoogleApiAvailability GoogleApiAvailability.getInstance()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #1263 <Method int GoogleApiAvailability.isGooglePlayServicesAvailable(Context)>
	//    3    7:istore_1        
		if(j == 0)
	//*   4    8:iload_1         
	//*   5    9:ifne            22
			return true;
	//    6   12:iconst_1        
	//    7   13:ireturn         
		break MISSING_BLOCK_LABEL_22;
		Throwable throwable;
		throwable;
	//    8   14:astore_2        
		AFLogger.afErrorLog("WARNING:  Google play services is unavailable. ", throwable);
	//    9   15:ldc2            #1265 <String "WARNING:  Google play services is unavailable. ">
	//   10   18:aload_2         
	//   11   19:invokestatic    #245 <Method void AFLogger.afErrorLog(String, Throwable)>
		try
		{
			context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
	//   12   22:aload_0         
	//   13   23:invokevirtual   #930 <Method PackageManager Context.getPackageManager()>
	//   14   26:ldc2            #1267 <String "com.google.android.gms">
	//   15   29:iconst_0        
	//   16   30:invokevirtual   #934 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   17   33:pop             
		}
	//*  18   34:iconst_1        
	//*  19   35:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  20   36:astore_0        
		{
			AFLogger.afErrorLog("WARNING:  Google Play Services is unavailable. ", ((Throwable) (context)));
	//   21   37:ldc2            #1269 <String "WARNING:  Google Play Services is unavailable. ">
	//   22   40:aload_0         
	//   23   41:invokestatic    #245 <Method void AFLogger.afErrorLog(String, Throwable)>
			return false;
	//   24   44:iconst_0        
	//   25   45:ireturn         
		}
		return true;
	}

	private static float _mth09710971(Context context)
	{
		int j;
		int i1;
		try
		{
			context = ((Context) (context.getApplicationContext().registerReceiver(((android.content.BroadcastReceiver) (null)), new IntentFilter("android.intent.action.BATTERY_CHANGED"))));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #278 <Method Context Context.getApplicationContext()>
	//    2    4:aconst_null     
	//    3    5:new             #1272 <Class IntentFilter>
	//    4    8:dup             
	//    5    9:ldc2            #1274 <String "android.intent.action.BATTERY_CHANGED">
	//    6   12:invokespecial   #1275 <Method void IntentFilter(String)>
	//    7   15:invokevirtual   #1279 <Method Intent Context.registerReceiver(android.content.BroadcastReceiver, IntentFilter)>
	//    8   18:astore_0        
			j = ((Intent) (context)).getIntExtra("level", -1);
	//    9   19:aload_0         
	//   10   20:ldc2            #1281 <String "level">
	//   11   23:iconst_m1       
	//   12   24:invokevirtual   #1284 <Method int Intent.getIntExtra(String, int)>
	//   13   27:istore_1        
			i1 = ((Intent) (context)).getIntExtra("scale", -1);
	//   14   28:aload_0         
	//   15   29:ldc2            #1286 <String "scale">
	//   16   32:iconst_m1       
	//   17   33:invokevirtual   #1284 <Method int Intent.getIntExtra(String, int)>
	//   18   36:istore_2        
		}
	//*  19   37:iload_1         
	//*  20   38:iconst_m1       
	//*  21   39:icmpeq          60
	//*  22   42:iload_2         
	//*  23   43:iconst_m1       
	//*  24   44:icmpne          50
	//*  25   47:goto            60
	//*  26   50:iload_1         
	//*  27   51:i2f             
	//*  28   52:iload_2         
	//*  29   53:i2f             
	//*  30   54:fdiv            
	//*  31   55:ldc2            #1287 <Float 100F>
	//*  32   58:fmul            
	//*  33   59:freturn         
	//*  34   60:ldc2            #1288 <Float 50F>
	//*  35   63:freturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  36   64:astore_0        
		{
			AFLogger.afErrorLog(((Throwable) (context)).getMessage(), ((Throwable) (context)));
	//   37   65:aload_0         
	//   38   66:invokevirtual   #817 <Method String Throwable.getMessage()>
	//   39   69:aload_0         
	//   40   70:invokestatic    #245 <Method void AFLogger.afErrorLog(String, Throwable)>
			return 1.0F;
	//   41   73:fconst_1        
	//   42   74:freturn         
		}
		if(j != -1 && i1 != -1)
			return ((float)j / (float)i1) * 100F;
		else
			return 50F;
	}

	public String getAppsFlyerUID(Context context)
	{
		v._mth02CB()._mth02CE("getAppsFlyerUID", new String[0]);
	//    0    0:invokestatic    #617 <Method v v._mth02CB()>
	//    1    3:ldc2            #1291 <String "getAppsFlyerUID">
	//    2    6:iconst_0        
	//    3    7:anewarray       String[]
	//    4   10:invokevirtual   #1294 <Method void v._mth02CE(String, String[])>
		return q._mth02CB(new WeakReference(((Object) (context))));
	//    5   13:new             #413 <Class WeakReference>
	//    6   16:dup             
	//    7   17:aload_1         
	//    8   18:invokespecial   #416 <Method void WeakReference(Object)>
	//    9   21:invokestatic    #1298 <Method String q._mth02CB(WeakReference)>
	//   10   24:areturn         
	}

	public String getAttributionId(ContentResolver contentresolver)
	{
		Object obj;
		Object obj1;
		Cursor cursor;
		cursor = contentresolver.query(Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider"), new String[] {
			"aid"
		}, ((String) (null)), ((String []) (null)), ((String) (null)));
	//    0    0:aload_1         
	//    1    1:ldc2            #1302 <String "content://com.facebook.katana.provider.AttributionIdProvider">
	//    2    4:invokestatic    #1306 <Method Uri Uri.parse(String)>
	//    3    7:iconst_1        
	//    4    8:anewarray       String[]
	//    5   11:dup             
	//    6   12:iconst_0        
	//    7   13:ldc2            #1308 <String "aid">
	//    8   16:aastore         
	//    9   17:aconst_null     
	//   10   18:aconst_null     
	//   11   19:aconst_null     
	//   12   20:invokevirtual   #1314 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//   13   23:astore          5
		obj = null;
	//   14   25:aconst_null     
	//   15   26:astore_3        
		obj1 = null;
	//   16   27:aconst_null     
	//   17   28:astore          4
		if(cursor == null)
			break MISSING_BLOCK_LABEL_154;
	//   18   30:aload           5
	//   19   32:ifnull          154
		if(!cursor.moveToFirst())
	//*  20   35:aload           5
	//*  21   37:invokeinterface #1319 <Method boolean Cursor.moveToFirst()>
	//*  22   42:ifne            48
			break MISSING_BLOCK_LABEL_154;
	//   23   45:goto            154
		contentresolver = ((ContentResolver) (cursor.getString(cursor.getColumnIndex("aid"))));
	//   24   48:aload           5
	//   25   50:aload           5
	//   26   52:ldc2            #1308 <String "aid">
	//   27   55:invokeinterface #1322 <Method int Cursor.getColumnIndex(String)>
	//   28   60:invokeinterface #1324 <Method String Cursor.getString(int)>
	//   29   65:astore_1        
		ContentResolver contentresolver1;
		contentresolver1 = contentresolver;
	//   30   66:aload_1         
	//   31   67:astore_2        
		if(cursor != null)
	//*  32   68:aload           5
	//*  33   70:ifnull          126
		{
			contentresolver1 = contentresolver;
	//   34   73:aload_1         
	//   35   74:astore_2        
			try
			{
				cursor.close();
	//   36   75:aload           5
	//   37   77:invokeinterface #1325 <Method void Cursor.close()>
			}
	//*  38   82:aload_1         
	//*  39   83:areturn         
			// Misplaced declaration of an exception variable
			catch(ContentResolver contentresolver)
	//*  40   84:astore_1        
			{
				AFLogger.afErrorLog(((Throwable) (contentresolver)).getMessage(), ((Throwable) (contentresolver)));
	//   41   85:aload_1         
	//   42   86:invokevirtual   #817 <Method String Throwable.getMessage()>
	//   43   89:aload_1         
	//   44   90:invokestatic    #245 <Method void AFLogger.afErrorLog(String, Throwable)>
				return ((String) (contentresolver1));
	//   45   93:aload_2         
	//   46   94:areturn         
			}
			return ((String) (contentresolver));
		}
		break MISSING_BLOCK_LABEL_126;
		contentresolver;
	//   47   95:astore_1        
		break MISSING_BLOCK_LABEL_128;
	//   48   96:goto            128
		contentresolver;
	//   49   99:astore_1        
		AFLogger.afErrorLog("Could not collect cursor attribution. ", ((Throwable) (contentresolver)));
	//   50  100:ldc2            #1327 <String "Could not collect cursor attribution. ">
	//   51  103:aload_1         
	//   52  104:invokestatic    #245 <Method void AFLogger.afErrorLog(String, Throwable)>
		contentresolver1 = ((ContentResolver) (obj));
	//   53  107:aload_3         
	//   54  108:astore_2        
		if(cursor == null)
			break MISSING_BLOCK_LABEL_126;
	//   55  109:aload           5
	//   56  111:ifnull          126
		contentresolver1 = ((ContentResolver) (obj1));
	//   57  114:aload           4
	//   58  116:astore_2        
		cursor.close();
	//   59  117:aload           5
	//   60  119:invokeinterface #1325 <Method void Cursor.close()>
		contentresolver1 = ((ContentResolver) (obj));
	//   61  124:aload_3         
	//   62  125:astore_2        
		return ((String) (contentresolver1));
	//   63  126:aload_2         
	//   64  127:areturn         
		if(cursor != null)
	//*  65  128:aload           5
	//*  66  130:ifnull          152
			try
			{
				cursor.close();
	//   67  133:aload           5
	//   68  135:invokeinterface #1325 <Method void Cursor.close()>
			}
	//*  69  140:goto            152
			catch(Exception exception)
	//*  70  143:astore_2        
			{
				AFLogger.afErrorLog(((Throwable) (exception)).getMessage(), ((Throwable) (exception)));
	//   71  144:aload_2         
	//   72  145:invokevirtual   #817 <Method String Throwable.getMessage()>
	//   73  148:aload_2         
	//   74  149:invokestatic    #245 <Method void AFLogger.afErrorLog(String, Throwable)>
			}
		throw contentresolver;
	//   75  152:aload_1         
	//   76  153:athrow          
		if(cursor == null)
			break MISSING_BLOCK_LABEL_177;
	//   77  154:aload           5
	//   78  156:ifnull          177
		cursor.close();
	//   79  159:aload           5
	//   80  161:invokeinterface #1325 <Method void Cursor.close()>
		return null;
	//   81  166:aconst_null     
	//   82  167:areturn         
		contentresolver;
	//   83  168:astore_1        
		AFLogger.afErrorLog(((Throwable) (contentresolver)).getMessage(), ((Throwable) (contentresolver)));
	//   84  169:aload_1         
	//   85  170:invokevirtual   #817 <Method String Throwable.getMessage()>
	//   86  173:aload_1         
	//   87  174:invokestatic    #245 <Method void AFLogger.afErrorLog(String, Throwable)>
		return null;
	//   88  177:aconst_null     
	//   89  178:areturn         
	}

	public String getHost()
	{
		String s1 = AppsFlyerProperties.getInstance().getString("custom_host");
	//    0    0:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//    1    3:ldc2            #1329 <String "custom_host">
	//    2    6:invokevirtual   #258 <Method String AppsFlyerProperties.getString(String)>
	//    3    9:astore_1        
		if(s1 != null)
	//*   4   10:aload_1         
	//*   5   11:ifnull          16
			return s1;
	//    6   14:aload_1         
	//    7   15:areturn         
		else
			return "appsflyer.com";
	//    8   16:ldc2            #1331 <String "appsflyer.com">
	//    9   19:areturn         
	}

	public AppsFlyerLib init(String s1, AppsFlyerConversionListener appsflyerconversionlistener)
	{
		v v1 = v._mth02CB();
	//    0    0:invokestatic    #617 <Method v v._mth02CB()>
	//    1    3:astore          4
		String s2;
		if(appsflyerconversionlistener == null)
	//*   2    5:aload_2         
	//*   3    6:ifnonnull       16
			s2 = "null";
	//    4    9:ldc2            #1011 <String "null">
	//    5   12:astore_3        
		else
	//*   6   13:goto            20
			s2 = "conversionDataListener";
	//    7   16:ldc2            #1334 <String "conversionDataListener">
	//    8   19:astore_3        
		v1._mth02CE("init", new String[] {
			s1, s2
		});
	//    9   20:aload           4
	//   10   22:ldc2            #1335 <String "init">
	//   11   25:iconst_2        
	//   12   26:anewarray       String[]
	//   13   29:dup             
	//   14   30:iconst_0        
	//   15   31:aload_1         
	//   16   32:aastore         
	//   17   33:dup             
	//   18   34:iconst_1        
	//   19   35:aload_3         
	//   20   36:aastore         
	//   21   37:invokevirtual   #1294 <Method void v._mth02CE(String, String[])>
		AFLogger._mth02CB(String.format("Initializing AppsFlyer SDK: (v%s.%s)", new Object[] {
			"4.8.9", "379"
		}));
	//   22   40:ldc2            #1337 <String "Initializing AppsFlyer SDK: (v%s.%s)">
	//   23   43:iconst_2        
	//   24   44:anewarray       Object[]
	//   25   47:dup             
	//   26   48:iconst_0        
	//   27   49:ldc1            #79  <String "4.8.9">
	//   28   51:aastore         
	//   29   52:dup             
	//   30   53:iconst_1        
	//   31   54:ldc2            #1339 <String "379">
	//   32   57:aastore         
	//   33   58:invokestatic    #1342 <Method String String.format(String, Object[])>
	//   34   61:invokestatic    #1344 <Method void AFLogger._mth02CB(String)>
		_fld02CC = true;
	//   35   64:aload_0         
	//   36   65:iconst_1        
	//   37   66:putfield        #1346 <Field boolean _fld02CC>
		AppsFlyerProperties.getInstance().set("AppsFlyerKey", s1);
	//   38   69:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//   39   72:ldc2            #1348 <String "AppsFlyerKey">
	//   40   75:aload_1         
	//   41   76:invokevirtual   #1351 <Method void AppsFlyerProperties.set(String, String)>
		g._cls5._mth02CB(s1);
	//   42   79:aload_1         
	//   43   80:invokestatic    #1352 <Method void g$5._mth02CB(String)>
		_fld02CB0971 = appsflyerconversionlistener;
	//   44   83:aload_2         
	//   45   84:putstatic       #149 <Field AppsFlyerConversionListener _fld02CB0971>
		return this;
	//   46   87:aload_0         
	//   47   88:areturn         
	}

	public boolean isPreInstalledApp(Context context)
	{
		int j = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #930 <Method PackageManager Context.getPackageManager()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #577 <Method String Context.getPackageName()>
	//    4    8:iconst_0        
	//    5    9:invokevirtual   #223 <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//    6   12:getfield        #1358 <Field int ApplicationInfo.flags>
	//    7   15:istore_2        
		if((j & 1) != 0)
	//*   8   16:iload_2         
	//*   9   17:iconst_1        
	//*  10   18:iand            
	//*  11   19:ifeq            32
			return true;
	//   12   22:iconst_1        
	//   13   23:ireturn         
		break MISSING_BLOCK_LABEL_32;
		context;
	//   14   24:astore_1        
		AFLogger.afErrorLog("Could not check if app is pre installed", ((Throwable) (context)));
	//   15   25:ldc2            #1360 <String "Could not check if app is pre installed">
	//   16   28:aload_1         
	//   17   29:invokestatic    #245 <Method void AFLogger.afErrorLog(String, Throwable)>
		return false;
	//   18   32:iconst_0        
	//   19   33:ireturn         
	}

	public boolean isTrackingStopped()
	{
		return _fld02CB141D;
	//    0    0:aload_0         
	//    1    1:getfield        #197 <Field boolean _fld02CB141D>
	//    2    4:ireturn         
	}

	public void onHandleReferrer(Map map)
	{
		_fld0971141D = map;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #590 <Field Map _fld0971141D>
	//    3    5:return          
	}

	public void sendDeepLinkData(Activity activity)
	{
		if(activity != null && activity.getIntent() != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          71
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #1370 <Method Intent Activity.getIntent()>
	//*   4    8:ifnull          71
		{
			v v1 = v._mth02CB();
	//    5   11:invokestatic    #617 <Method v v._mth02CB()>
	//    6   14:astore_2        
			String s1 = activity.getLocalClassName();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #1373 <Method String Activity.getLocalClassName()>
	//    9   19:astore_3        
			StringBuilder stringbuilder1 = new StringBuilder("activity_intent_");
	//   10   20:new             #95  <Class StringBuilder>
	//   11   23:dup             
	//   12   24:ldc2            #1375 <String "activity_intent_">
	//   13   27:invokespecial   #115 <Method void StringBuilder(String)>
	//   14   30:astore          4
			stringbuilder1.append(((Object) (activity.getIntent())).toString());
	//   15   32:aload           4
	//   16   34:aload_1         
	//   17   35:invokevirtual   #1370 <Method Intent Activity.getIntent()>
	//   18   38:invokevirtual   #108 <Method String Object.toString()>
	//   19   41:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   20   44:pop             
			v1._mth02CE("sendDeepLinkData", new String[] {
				s1, ((Object) (stringbuilder1)).toString()
			});
	//   21   45:aload_2         
	//   22   46:ldc2            #1376 <String "sendDeepLinkData">
	//   23   49:iconst_2        
	//   24   50:anewarray       String[]
	//   25   53:dup             
	//   26   54:iconst_0        
	//   27   55:aload_3         
	//   28   56:aastore         
	//   29   57:dup             
	//   30   58:iconst_1        
	//   31   59:aload           4
	//   32   61:invokevirtual   #108 <Method String Object.toString()>
	//   33   64:aastore         
	//   34   65:invokevirtual   #1294 <Method void v._mth02CE(String, String[])>
		} else
	//*  35   68:goto            123
		if(activity != null)
	//*  36   71:aload_1         
	//*  37   72:ifnull          104
			v._mth02CB()._mth02CE("sendDeepLinkData", new String[] {
				activity.getLocalClassName(), "activity_intent_null"
			});
	//   38   75:invokestatic    #617 <Method v v._mth02CB()>
	//   39   78:ldc2            #1376 <String "sendDeepLinkData">
	//   40   81:iconst_2        
	//   41   82:anewarray       String[]
	//   42   85:dup             
	//   43   86:iconst_0        
	//   44   87:aload_1         
	//   45   88:invokevirtual   #1373 <Method String Activity.getLocalClassName()>
	//   46   91:aastore         
	//   47   92:dup             
	//   48   93:iconst_1        
	//   49   94:ldc2            #1378 <String "activity_intent_null">
	//   50   97:aastore         
	//   51   98:invokevirtual   #1294 <Method void v._mth02CE(String, String[])>
		else
	//*  52  101:goto            123
			v._mth02CB()._mth02CE("sendDeepLinkData", new String[] {
				"activity_null"
			});
	//   53  104:invokestatic    #617 <Method v v._mth02CB()>
	//   54  107:ldc2            #1376 <String "sendDeepLinkData">
	//   55  110:iconst_1        
	//   56  111:anewarray       String[]
	//   57  114:dup             
	//   58  115:iconst_0        
	//   59  116:ldc2            #1380 <String "activity_null">
	//   60  119:aastore         
	//   61  120:invokevirtual   #1294 <Method void v._mth02CE(String, String[])>
		StringBuilder stringbuilder = new StringBuilder("getDeepLinkData with activity ");
	//   62  123:new             #95  <Class StringBuilder>
	//   63  126:dup             
	//   64  127:ldc2            #1382 <String "getDeepLinkData with activity ">
	//   65  130:invokespecial   #115 <Method void StringBuilder(String)>
	//   66  133:astore_2        
		stringbuilder.append(activity.getIntent().getDataString());
	//   67  134:aload_2         
	//   68  135:aload_1         
	//   69  136:invokevirtual   #1370 <Method Intent Activity.getIntent()>
	//   70  139:invokevirtual   #1385 <Method String Intent.getDataString()>
	//   71  142:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   72  145:pop             
		AFLogger.afInfoLog(((Object) (stringbuilder)).toString());
	//   73  146:aload_2         
	//   74  147:invokevirtual   #108 <Method String Object.toString()>
	//   75  150:invokestatic    #308 <Method void AFLogger.afInfoLog(String)>
		_mth02CA(activity.getApplication());
	//   76  153:aload_0         
	//   77  154:aload_1         
	//   78  155:invokevirtual   #1389 <Method Application Activity.getApplication()>
	//   79  158:invokespecial   #1391 <Method void _mth02CA(Application)>
	//   80  161:return          
	}

	public void setCustomerUserId(String s1)
	{
		v._mth02CB()._mth02CE("setCustomerUserId", new String[] {
			s1
		});
	//    0    0:invokestatic    #617 <Method v v._mth02CB()>
	//    1    3:ldc2            #1393 <String "setCustomerUserId">
	//    2    6:iconst_1        
	//    3    7:anewarray       String[]
	//    4   10:dup             
	//    5   11:iconst_0        
	//    6   12:aload_1         
	//    7   13:aastore         
	//    8   14:invokevirtual   #1294 <Method void v._mth02CE(String, String[])>
		AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(((Object) (s1)))));
	//    9   17:ldc2            #1395 <String "setCustomerUserId = ">
	//   10   20:aload_1         
	//   11   21:invokestatic    #712 <Method String String.valueOf(Object)>
	//   12   24:invokevirtual   #697 <Method String String.concat(String)>
	//   13   27:invokestatic    #308 <Method void AFLogger.afInfoLog(String)>
		AppsFlyerProperties.getInstance().set("AppUserId", s1);
	//   14   30:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//   15   33:ldc2            #391 <String "AppUserId">
	//   16   36:aload_1         
	//   17   37:invokevirtual   #1351 <Method void AppsFlyerProperties.set(String, String)>
	//   18   40:return          
	}

	public void setDebugLog(boolean flag)
	{
		v._mth02CB()._mth02CE("setDebugLog", new String[] {
			String.valueOf(flag)
		});
	//    0    0:invokestatic    #617 <Method v v._mth02CB()>
	//    1    3:ldc2            #1397 <String "setDebugLog">
	//    2    6:iconst_1        
	//    3    7:anewarray       String[]
	//    4   10:dup             
	//    5   11:iconst_0        
	//    6   12:iload_1         
	//    7   13:invokestatic    #1399 <Method String String.valueOf(boolean)>
	//    8   16:aastore         
	//    9   17:invokevirtual   #1294 <Method void v._mth02CE(String, String[])>
		AppsFlyerProperties.getInstance().set("shouldLog", flag);
	//   10   20:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//   11   23:ldc2            #1401 <String "shouldLog">
	//   12   26:iload_1         
	//   13   27:invokevirtual   #1403 <Method void AppsFlyerProperties.set(String, boolean)>
		AppsFlyerProperties appsflyerproperties = AppsFlyerProperties.getInstance();
	//   14   30:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//   15   33:astore_3        
		AFLogger.LogLevel loglevel;
		if(flag)
	//*  16   34:iload_1         
	//*  17   35:ifeq            45
			loglevel = AFLogger.LogLevel.DEBUG;
	//   18   38:getstatic       #1409 <Field AFLogger$LogLevel AFLogger$LogLevel.DEBUG>
	//   19   41:astore_2        
		else
	//*  20   42:goto            49
			loglevel = AFLogger.LogLevel.NONE;
	//   21   45:getstatic       #1412 <Field AFLogger$LogLevel AFLogger$LogLevel.NONE>
	//   22   48:astore_2        
		appsflyerproperties.set("logLevel", loglevel.getLevel());
	//   23   49:aload_3         
	//   24   50:ldc2            #1414 <String "logLevel">
	//   25   53:aload_2         
	//   26   54:invokevirtual   #1417 <Method int AFLogger$LogLevel.getLevel()>
	//   27   57:invokevirtual   #1420 <Method void AppsFlyerProperties.set(String, int)>
	//   28   60:return          
	}

	public void startTracking(Application application)
	{
		if(!_fld02CC)
	//*   0    0:aload_0         
	//*   1    1:getfield        #1346 <Field boolean _fld02CC>
	//*   2    4:ifne            14
		{
			AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! The API call 'startTracking(Application)' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
	//    3    7:ldc2            #1423 <String "ERROR: AppsFlyer SDK is not initialized! The API call 'startTracking(Application)' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.">
	//    4   10:invokestatic    #803 <Method void AFLogger.afWarnLog(String)>
			return;
	//    5   13:return          
		} else
		{
			startTracking(application, ((String) (null)));
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:aconst_null     
	//    9   17:invokevirtual   #1426 <Method void startTracking(Application, String)>
			return;
	//   10   20:return          
		}
	}

	public void startTracking(Application application, String s1)
	{
		v._mth02CB()._mth02CE("startTracking", new String[] {
			s1
		});
	//    0    0:invokestatic    #617 <Method v v._mth02CB()>
	//    1    3:ldc2            #1427 <String "startTracking">
	//    2    6:iconst_1        
	//    3    7:anewarray       String[]
	//    4   10:dup             
	//    5   11:iconst_0        
	//    6   12:aload_2         
	//    7   13:aastore         
	//    8   14:invokevirtual   #1294 <Method void v._mth02CE(String, String[])>
		AFLogger.afInfoLog(String.format("Starting AppsFlyer Tracking: (v%s.%s)", new Object[] {
			"4.8.9", "379"
		}));
	//    9   17:ldc2            #1429 <String "Starting AppsFlyer Tracking: (v%s.%s)">
	//   10   20:iconst_2        
	//   11   21:anewarray       Object[]
	//   12   24:dup             
	//   13   25:iconst_0        
	//   14   26:ldc1            #79  <String "4.8.9">
	//   15   28:aastore         
	//   16   29:dup             
	//   17   30:iconst_1        
	//   18   31:ldc2            #1339 <String "379">
	//   19   34:aastore         
	//   20   35:invokestatic    #1342 <Method String String.format(String, Object[])>
	//   21   38:invokestatic    #308 <Method void AFLogger.afInfoLog(String)>
		AFLogger.afInfoLog("Build Number: 379");
	//   22   41:ldc2            #1431 <String "Build Number: 379">
	//   23   44:invokestatic    #308 <Method void AFLogger.afInfoLog(String)>
		AppsFlyerProperties.getInstance().loadProperties(((Context) (application)).getApplicationContext());
	//   24   47:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//   25   50:aload_1         
	//   26   51:invokevirtual   #278 <Method Context Context.getApplicationContext()>
	//   27   54:invokevirtual   #282 <Method void AppsFlyerProperties.loadProperties(Context)>
		if(!TextUtils.isEmpty(((CharSequence) (s1))))
	//*  28   57:aload_2         
	//*  29   58:invokestatic    #1009 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  30   61:ifne            81
		{
			AppsFlyerProperties.getInstance().set("AppsFlyerKey", s1);
	//   31   64:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//   32   67:ldc2            #1348 <String "AppsFlyerKey">
	//   33   70:aload_2         
	//   34   71:invokevirtual   #1351 <Method void AppsFlyerProperties.set(String, String)>
			g._cls5._mth02CB(s1);
	//   35   74:aload_2         
	//   36   75:invokestatic    #1352 <Method void g$5._mth02CB(String)>
		} else
	//*  37   78:goto            103
		if(TextUtils.isEmpty(((CharSequence) (AppsFlyerProperties.getInstance().getString("AppsFlyerKey")))))
	//*  38   81:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//*  39   84:ldc2            #1348 <String "AppsFlyerKey">
	//*  40   87:invokevirtual   #258 <Method String AppsFlyerProperties.getString(String)>
	//*  41   90:invokestatic    #1009 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  42   93:ifeq            103
		{
			AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the startTracking API method (should be called on Activity's onCreate).");
	//   43   96:ldc2            #1433 <String "ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the startTracking API method (should be called on Activity's onCreate).">
	//   44   99:invokestatic    #803 <Method void AFLogger.afWarnLog(String)>
			return;
	//   45  102:return          
		}
		_mth02CA(application);
	//   46  103:aload_0         
	//   47  104:aload_1         
	//   48  105:invokespecial   #1391 <Method void _mth02CA(Application)>
	//   49  108:return          
	}

	final void _mth02CA()
	{
		_fld02BF = System.currentTimeMillis();
	//    0    0:aload_0         
	//    1    1:invokestatic    #318 <Method long System.currentTimeMillis()>
	//    2    4:putfield        #320 <Field long _fld02BF>
	//    3    7:return          
	}

	final void _mth02CB(Context context, String s1, Map map)
	{
		Intent intent;
		if(context instanceof Activity)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #1366 <Class Activity>
	//*   2    4:ifeq            19
			intent = ((Activity)context).getIntent();
	//    3    7:aload_1         
	//    4    8:checkcast       #1366 <Class Activity>
	//    5   11:invokevirtual   #1370 <Method Intent Activity.getIntent()>
	//    6   14:astore          4
		else
	//*   7   16:goto            22
			intent = null;
	//    8   19:aconst_null     
	//    9   20:astore          4
		if(AppsFlyerProperties.getInstance().getString("AppsFlyerKey") == null)
	//*  10   22:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//*  11   25:ldc2            #1348 <String "AppsFlyerKey">
	//*  12   28:invokevirtual   #258 <Method String AppsFlyerProperties.getString(String)>
	//*  13   31:ifnonnull       41
		{
			AFLogger.afWarnLog("[TrackEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
	//   14   34:ldc2            #1435 <String "[TrackEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.">
	//   15   37:invokestatic    #803 <Method void AFLogger.afWarnLog(String)>
			return;
	//   16   40:return          
		}
		Object obj = ((Object) (map));
	//   17   41:aload_3         
	//   18   42:astore          5
		if(map == null)
	//*  19   44:aload_3         
	//*  20   45:ifnonnull       57
			obj = ((Object) (new HashMap()));
	//   21   48:new             #480 <Class HashMap>
	//   22   51:dup             
	//   23   52:invokespecial   #481 <Method void HashMap()>
	//   24   55:astore          5
		map = ((Map) (new JSONObject(((Map) (obj)))));
	//   25   57:new             #771 <Class JSONObject>
	//   26   60:dup             
	//   27   61:aload           5
	//   28   63:invokespecial   #1437 <Method void JSONObject(Map)>
	//   29   66:astore_3        
		String s2 = AppsFlyerProperties.getInstance().getReferrer(context);
	//   30   67:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//   31   70:aload_1         
	//   32   71:invokevirtual   #1440 <Method String AppsFlyerProperties.getReferrer(Context)>
	//   33   74:astore          6
		if(!(map instanceof JSONObject))
	//*  34   76:aload_3         
	//*  35   77:instanceof      #771 <Class JSONObject>
	//*  36   80:ifne            91
			map = ((Map) (((JSONObject) (map)).toString()));
	//   37   83:aload_3         
	//   38   84:invokevirtual   #897 <Method String JSONObject.toString()>
	//   39   87:astore_3        
		else
	//*  40   88:goto            99
			map = ((Map) (JSONObjectInstrumentation.toString((JSONObject)map)));
	//   41   91:aload_3         
	//   42   92:checkcast       #771 <Class JSONObject>
	//   43   95:invokestatic    #900 <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//   44   98:astore_3        
		obj = ((Object) (s2));
	//   45   99:aload           6
	//   46  101:astore          5
		if(s2 == null)
	//*  47  103:aload           6
	//*  48  105:ifnonnull       113
			obj = "";
	//   49  108:ldc2            #922 <String "">
	//   50  111:astore          5
		_mth02CA(context, ((String) (null)), s1, ((String) (map)), ((String) (obj)), intent);
	//   51  113:aload_0         
	//   52  114:aload_1         
	//   53  115:aconst_null     
	//   54  116:aload_2         
	//   55  117:aload_3         
	//   56  118:aload           5
	//   57  120:aload           4
	//   58  122:invokespecial   #1442 <Method void _mth02CA(Context, String, String, String, String, Intent)>
	//   59  125:return          
	}

	final void _mth02CE()
	{
		_fld02BD0971 = System.currentTimeMillis();
	//    0    0:aload_0         
	//    1    1:invokestatic    #318 <Method long System.currentTimeMillis()>
	//    2    4:putfield        #1445 <Field long _fld02BD0971>
	//    3    7:return          
	}

	final void _mth02CE(Context context, Intent intent)
	{
		String s1 = intent.getStringExtra("shouldMonitor");
	//    0    0:aload_2         
	//    1    1:ldc2            #335 <String "shouldMonitor">
	//    2    4:invokevirtual   #1449 <Method String Intent.getStringExtra(String)>
	//    3    7:astore_3        
		if(s1 != null)
	//*   4    8:aload_3         
	//*   5    9:ifnull          47
		{
			AFLogger.afInfoLog("Turning on monitoring.");
	//    6   12:ldc2            #1451 <String "Turning on monitoring.">
	//    7   15:invokestatic    #308 <Method void AFLogger.afInfoLog(String)>
			AppsFlyerProperties.getInstance().set("shouldMonitor", ((Object) (s1)).equals("true"));
	//    8   18:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//    9   21:ldc2            #335 <String "shouldMonitor">
	//   10   24:aload_3         
	//   11   25:ldc2            #362 <String "true">
	//   12   28:invokevirtual   #451 <Method boolean Object.equals(Object)>
	//   13   31:invokevirtual   #1403 <Method void AppsFlyerProperties.set(String, boolean)>
			_mth02CA(context, ((String) (null)), "START_TRACKING", context.getPackageName());
	//   14   34:aload_1         
	//   15   35:aconst_null     
	//   16   36:ldc2            #1453 <String "START_TRACKING">
	//   17   39:aload_1         
	//   18   40:invokevirtual   #577 <Method String Context.getPackageName()>
	//   19   43:invokestatic    #705 <Method void _mth02CA(Context, String, String, String)>
			return;
	//   20   46:return          
		}
		AFLogger.afInfoLog("****** onReceive called *******");
	//   21   47:ldc2            #1455 <String "****** onReceive called *******">
	//   22   50:invokestatic    #308 <Method void AFLogger.afInfoLog(String)>
		AppsFlyerProperties.getInstance().setOnReceiveCalled();
	//   23   53:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//   24   56:invokevirtual   #1458 <Method void AppsFlyerProperties.setOnReceiveCalled()>
		s1 = intent.getStringExtra("referrer");
	//   25   59:aload_2         
	//   26   60:ldc2            #1460 <String "referrer">
	//   27   63:invokevirtual   #1449 <Method String Intent.getStringExtra(String)>
	//   28   66:astore_3        
		AFLogger.afInfoLog("Play store referrer: ".concat(String.valueOf(((Object) (s1)))));
	//   29   67:ldc2            #1462 <String "Play store referrer: ">
	//   30   70:aload_3         
	//   31   71:invokestatic    #712 <Method String String.valueOf(Object)>
	//   32   74:invokevirtual   #697 <Method String String.concat(String)>
	//   33   77:invokestatic    #308 <Method void AFLogger.afInfoLog(String)>
		if(s1 != null)
	//*  34   80:aload_3         
	//*  35   81:ifnull          303
		{
			if(((Object) ("AppsFlyer_Test")).equals(((Object) (intent.getStringExtra("TestIntegrationMode")))))
	//*  36   84:ldc2            #447 <String "AppsFlyer_Test">
	//*  37   87:aload_2         
	//*  38   88:ldc2            #1464 <String "TestIntegrationMode">
	//*  39   91:invokevirtual   #1449 <Method String Intent.getStringExtra(String)>
	//*  40   94:invokevirtual   #451 <Method boolean Object.equals(Object)>
	//*  41   97:ifeq            169
			{
				android.content.SharedPreferences.Editor editor = context.getSharedPreferences("appsflyer-data", 0).edit();
	//   42  100:aload_1         
	//   43  101:ldc2            #534 <String "appsflyer-data">
	//   44  104:iconst_0        
	//   45  105:invokevirtual   #538 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   46  108:invokeinterface #1072 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   47  113:astore          4
				editor.clear();
	//   48  115:aload           4
	//   49  117:invokeinterface #1467 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.clear()>
	//   50  122:pop             
				if(android.os.Build.VERSION.SDK_INT >= 9)
	//*  51  123:getstatic       #288 <Field int android.os.Build$VERSION.SDK_INT>
	//*  52  126:bipush          9
	//*  53  128:icmplt          141
					editor.apply();
	//   54  131:aload           4
	//   55  133:invokeinterface #1081 <Method void android.content.SharedPreferences$Editor.apply()>
				else
	//*  56  138:goto            149
					editor.commit();
	//   57  141:aload           4
	//   58  143:invokeinterface #1084 <Method boolean android.content.SharedPreferences$Editor.commit()>
	//   59  148:pop             
				AppsFlyerProperties.getInstance().setFirstLaunchCalled(false);
	//   60  149:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//   61  152:iconst_0        
	//   62  153:invokevirtual   #1470 <Method void AppsFlyerProperties.setFirstLaunchCalled(boolean)>
				AFLogger.afInfoLog("Test mode started..");
	//   63  156:ldc2            #1472 <String "Test mode started..">
	//   64  159:invokestatic    #308 <Method void AFLogger.afInfoLog(String)>
				_fld02C9 = System.currentTimeMillis();
	//   65  162:aload_0         
	//   66  163:invokestatic    #318 <Method long System.currentTimeMillis()>
	//   67  166:putfield        #1474 <Field long _fld02C9>
			}
			android.content.SharedPreferences.Editor editor1 = context.getSharedPreferences("appsflyer-data", 0).edit();
	//   68  169:aload_1         
	//   69  170:ldc2            #534 <String "appsflyer-data">
	//   70  173:iconst_0        
	//   71  174:invokevirtual   #538 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   72  177:invokeinterface #1072 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   73  182:astore          4
			editor1.putString("referrer", s1);
	//   74  184:aload           4
	//   75  186:ldc2            #1460 <String "referrer">
	//   76  189:aload_3         
	//   77  190:invokeinterface #1144 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   78  195:pop             
			if(android.os.Build.VERSION.SDK_INT >= 9)
	//*  79  196:getstatic       #288 <Field int android.os.Build$VERSION.SDK_INT>
	//*  80  199:bipush          9
	//*  81  201:icmplt          214
				editor1.apply();
	//   82  204:aload           4
	//   83  206:invokeinterface #1081 <Method void android.content.SharedPreferences$Editor.apply()>
			else
	//*  84  211:goto            222
				editor1.commit();
	//   85  214:aload           4
	//   86  216:invokeinterface #1084 <Method boolean android.content.SharedPreferences$Editor.commit()>
	//   87  221:pop             
			AppsFlyerProperties.getInstance().setReferrer(s1);
	//   88  222:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//   89  225:aload_3         
	//   90  226:invokevirtual   #1477 <Method void AppsFlyerProperties.setReferrer(String)>
			if(AppsFlyerProperties.getInstance().isFirstLaunchCalled())
	//*  91  229:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//*  92  232:invokevirtual   #1480 <Method boolean AppsFlyerProperties.isFirstLaunchCalled()>
	//*  93  235:ifeq            303
			{
				AFLogger.afInfoLog("onReceive: isLaunchCalled");
	//   94  238:ldc2            #1482 <String "onReceive: isLaunchCalled">
	//   95  241:invokestatic    #308 <Method void AFLogger.afInfoLog(String)>
				if(s1 != null && s1.length() > 5)
	//*  96  244:aload_3         
	//*  97  245:ifnull          303
	//*  98  248:aload_3         
	//*  99  249:invokevirtual   #567 <Method int String.length()>
	//* 100  252:iconst_5        
	//* 101  253:icmple          303
				{
					java.util.concurrent.ScheduledThreadPoolExecutor scheduledthreadpoolexecutor = AFExecutor.getInstance()._mth02CB();
	//  102  256:invokestatic    #408 <Method AFExecutor AFExecutor.getInstance()>
	//  103  259:invokevirtual   #411 <Method java.util.concurrent.ScheduledThreadPoolExecutor AFExecutor._mth02CB()>
	//  104  262:astore          4
					_mth0971(((ScheduledExecutorService) (scheduledthreadpoolexecutor)), ((Runnable) (new d(new WeakReference(((Object) (context.getApplicationContext()))), ((String) (null)), ((String) (null)), ((String) (null)), s1, ((ExecutorService) (scheduledthreadpoolexecutor)), true, intent, (byte)0))), 5L, TimeUnit.MILLISECONDS);
	//  105  264:aload           4
	//  106  266:new             #21  <Class AppsFlyerLib$d>
	//  107  269:dup             
	//  108  270:aload_0         
	//  109  271:new             #413 <Class WeakReference>
	//  110  274:dup             
	//  111  275:aload_1         
	//  112  276:invokevirtual   #278 <Method Context Context.getApplicationContext()>
	//  113  279:invokespecial   #416 <Method void WeakReference(Object)>
	//  114  282:aconst_null     
	//  115  283:aconst_null     
	//  116  284:aconst_null     
	//  117  285:aload_3         
	//  118  286:aload           4
	//  119  288:iconst_1        
	//  120  289:aload_2         
	//  121  290:iconst_0        
	//  122  291:invokespecial   #419 <Method void AppsFlyerLib$d(AppsFlyerLib, WeakReference, String, String, String, String, ExecutorService, boolean, Intent, byte)>
	//  123  294:ldc2w           #169 <Long 5L>
	//  124  297:getstatic       #424 <Field TimeUnit TimeUnit.MILLISECONDS>
	//  125  300:invokestatic    #427 <Method void _mth0971(ScheduledExecutorService, Runnable, long, TimeUnit)>
				}
			}
		}
	//  126  303:return          
	}

	final Map _mth02CF(Context context, String s1, String s2, String s3, String s4, boolean flag, SharedPreferences sharedpreferences, 
			boolean flag1, Intent intent)
	{
		HashMap hashmap;
		hashmap = new HashMap();
	//    0    0:new             #480 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #481 <Method void HashMap()>
	//    3    7:astore          18
		o._mth02CA(context, ((Map) (hashmap)));
	//    4    9:aload_1         
	//    5   10:aload           18
	//    6   12:invokestatic    #1488 <Method void o._mth02CA(Context, Map)>
		long l1 = (new Date()).getTime();
	//    7   15:new             #968 <Class Date>
	//    8   18:dup             
	//    9   19:invokespecial   #1489 <Method void Date()>
	//   10   22:invokevirtual   #1492 <Method long Date.getTime()>
	//   11   25:lstore          12
		((Map) (hashmap)).put("af_timestamp", ((Object) (Long.toString(l1))));
	//   12   27:aload           18
	//   13   29:ldc2            #1494 <String "af_timestamp">
	//   14   32:lload           12
	//   15   34:invokestatic    #1497 <Method String Long.toString(long)>
	//   16   37:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//   17   42:pop             
		String s5 = h._mth02CA(context, l1);
	//   18   43:aload_1         
	//   19   44:lload           12
	//   20   46:invokestatic    #1502 <Method String h._mth02CA(Context, long)>
	//   21   49:astore          16
		if(s5 != null)
	//*  22   51:aload           16
	//*  23   53:ifnull          69
			((Map) (hashmap)).put("cksm_v1", ((Object) (s5)));
	//   24   56:aload           18
	//   25   58:ldc2            #1504 <String "cksm_v1">
	//   26   61:aload           16
	//   27   63:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//   28   68:pop             
		if(isTrackingStopped()) goto _L2; else goto _L1
	//   29   69:aload_0         
	//   30   70:invokevirtual   #545 <Method boolean isTrackingStopped()>
	//   31   73:ifne            120
_L1:
		Object obj1 = ((Object) (new StringBuilder("******* sendTrackingWithEvent: ")));
	//   32   76:new             #95  <Class StringBuilder>
	//   33   79:dup             
	//   34   80:ldc2            #1506 <String "******* sendTrackingWithEvent: ">
	//   35   83:invokespecial   #115 <Method void StringBuilder(String)>
	//   36   86:astore          17
		int j;
		boolean flag2;
		long l2;
		long l3;
		Object obj;
		Object obj2;
		JSONObject jsonobject;
		if(flag1)
	//*  37   88:iload           8
	//*  38   90:ifeq            4975
			obj = "Launch";
	//   39   93:ldc2            #1508 <String "Launch">
	//   40   96:astore          16
		else
	//*  41   98:goto            101
	//*  42  101:aload           17
	//*  43  103:aload           16
	//*  44  105:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//*  45  108:pop             
	//*  46  109:aload           17
	//*  47  111:invokevirtual   #108 <Method String Object.toString()>
	//*  48  114:invokestatic    #308 <Method void AFLogger.afInfoLog(String)>
	//*  49  117:goto            4981
	//*  50  120:ldc2            #1510 <String "SDK tracking has been stopped">
	//*  51  123:invokestatic    #308 <Method void AFLogger.afInfoLog(String)>
	//*  52  126:goto            4981
	//*  53  129:aload_1         
	//*  54  130:ldc2            #699 <String "AppsFlyer_4.8.9">
	//*  55  133:ldc2            #1512 <String "EVENT_CREATED_WITH_NAME">
	//*  56  136:aload           16
	//*  57  138:invokestatic    #705 <Method void _mth02CA(Context, String, String, String)>
	//*  58  141:invokestatic    #753 <Method CacheManager CacheManager.getInstance()>
	//*  59  144:aload_1         
	//*  60  145:invokevirtual   #1514 <Method void CacheManager.init(Context)>
	//*  61  148:aload_1         
	//*  62  149:invokevirtual   #930 <Method PackageManager Context.getPackageManager()>
	//*  63  152:aload_1         
	//*  64  153:invokevirtual   #577 <Method String Context.getPackageName()>
	//*  65  156:sipush          4096
	//*  66  159:invokevirtual   #934 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//*  67  162:getfield        #1518 <Field String[] PackageInfo.requestedPermissions>
	//*  68  165:invokestatic    #137 <Method List Arrays.asList(Object[])>
	//*  69  168:astore          16
	//*  70  170:aload           16
	//*  71  172:ldc2            #1520 <String "android.permission.INTERNET">
	//*  72  175:invokeinterface #1002 <Method boolean List.contains(Object)>
	//*  73  180:ifne            198
	//*  74  183:ldc2            #1522 <String "Permission android.permission.INTERNET is missing in the AndroidManifest.xml">
	//*  75  186:invokestatic    #803 <Method void AFLogger.afWarnLog(String)>
	//*  76  189:aload_1         
	//*  77  190:aconst_null     
	//*  78  191:ldc2            #1524 <String "PERMISSION_INTERNET_MISSING">
	//*  79  194:aconst_null     
	//*  80  195:invokestatic    #705 <Method void _mth02CA(Context, String, String, String)>
	//*  81  198:aload           16
	//*  82  200:ldc2            #1526 <String "android.permission.ACCESS_NETWORK_STATE">
	//*  83  203:invokeinterface #1002 <Method boolean List.contains(Object)>
	//*  84  208:ifne            217
	//*  85  211:ldc2            #1528 <String "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml">
	//*  86  214:invokestatic    #803 <Method void AFLogger.afWarnLog(String)>
	//*  87  217:aload           16
	//*  88  219:ldc2            #1530 <String "android.permission.ACCESS_WIFI_STATE">
	//*  89  222:invokeinterface #1002 <Method boolean List.contains(Object)>
	//*  90  227:ifne            249
	//*  91  230:ldc2            #1532 <String "Permission android.permission.ACCESS_WIFI_STATE is missing in the AndroidManifest.xml">
	//*  92  233:invokestatic    #803 <Method void AFLogger.afWarnLog(String)>
	//*  93  236:goto            249
	//*  94  239:astore          16
	//*  95  241:ldc2            #1534 <String "Exception while validation permissions. ">
	//*  96  244:aload           16
	//*  97  246:invokestatic    #245 <Method void AFLogger.afErrorLog(String, Throwable)>
	//*  98  249:iload           6
	//*  99  251:ifeq            268
	//* 100  254:aload           18
	//* 101  256:ldc2            #1536 <String "af_events_api">
	//* 102  259:ldc2            #1538 <String "1">
	//* 103  262:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//* 104  267:pop             
	//* 105  268:aload           18
	//* 106  270:ldc2            #1540 <String "brand">
	//* 107  273:getstatic       #1545 <Field String Build.BRAND>
	//* 108  276:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//* 109  281:pop             
	//* 110  282:aload           18
	//* 111  284:ldc2            #1547 <String "device">
	//* 112  287:getstatic       #1550 <Field String Build.DEVICE>
	//* 113  290:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//* 114  295:pop             
	//* 115  296:aload           18
	//* 116  298:ldc2            #1552 <String "product">
	//* 117  301:getstatic       #1555 <Field String Build.PRODUCT>
	//* 118  304:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//* 119  309:pop             
	//* 120  310:aload           18
	//* 121  312:ldc2            #382 <String "sdk">
	//* 122  315:getstatic       #288 <Field int android.os.Build$VERSION.SDK_INT>
	//* 123  318:invokestatic    #703 <Method String Integer.toString(int)>
	//* 124  321:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//* 125  326:pop             
	//* 126  327:aload           18
	//* 127  329:ldc2            #1557 <String "model">
	//* 128  332:getstatic       #1560 <Field String Build.MODEL>
	//* 129  335:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//* 130  340:pop             
	//* 131  341:aload           18
	//* 132  343:ldc2            #1562 <String "deviceType">
	//* 133  346:getstatic       #1565 <Field String Build.TYPE>
	//* 134  349:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//* 135  354:pop             
	//* 136  355:iload           8
	//* 137  357:ifeq            1056
	//* 138  360:aload_1         
	//* 139  361:ldc2            #534 <String "appsflyer-data">
	//* 140  364:iconst_0        
	//* 141  365:invokevirtual   #538 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//* 142  368:ldc2            #579 <String "appsFlyerCount">
	//* 143  371:invokeinterface #1181 <Method boolean SharedPreferences.contains(String)>
	//* 144  376:iconst_1        
	//* 145  377:ixor            
	//* 146  378:ifeq            934
	//* 147  381:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//* 148  384:invokevirtual   #1568 <Method boolean AppsFlyerProperties.isOtherSdkStringDisabled()>
	//* 149  387:ifne            703
	//* 150  390:new             #95  <Class StringBuilder>
	//* 151  393:dup             
	//* 152  394:invokespecial   #98  <Method void StringBuilder()>
	//* 153  397:astore          16
	//* 154  399:aload_0         
	//* 155  400:getfield        #193 <Field r _fld02CD>
	//* 156  403:ldc2            #1570 <String "com.tune.Tune">
	//* 157  406:invokevirtual   #1572 <Method boolean r._mth0971(String)>
	//* 158  409:ifeq            5000
	//* 159  412:iconst_1        
	//* 160  413:istore          10
	//* 161  415:goto            418
	//* 162  418:aload           16
	//* 163  420:iload           10
	//* 164  422:invokevirtual   #1575 <Method StringBuilder StringBuilder.append(int)>
	//* 165  425:pop             
	//* 166  426:aload_0         
	//* 167  427:getfield        #193 <Field r _fld02CD>
	//* 168  430:ldc2            #1577 <String "com.adjust.sdk.Adjust">
	//* 169  433:invokevirtual   #1572 <Method boolean r._mth0971(String)>
	//* 170  436:ifeq            5006
	//* 171  439:iconst_1        
	//* 172  440:istore          10
	//* 173  442:goto            445
	//* 174  445:aload           16
	//* 175  447:iload           10
	//* 176  449:invokevirtual   #1575 <Method StringBuilder StringBuilder.append(int)>
	//* 177  452:pop             
	//* 178  453:aload_0         
	//* 179  454:getfield        #193 <Field r _fld02CD>
	//* 180  457:ldc2            #1579 <String "com.kochava.android.tracker.Feature">
	//* 181  460:invokevirtual   #1572 <Method boolean r._mth0971(String)>
	//* 182  463:ifeq            5012
	//* 183  466:iconst_1        
	//* 184  467:istore          10
	//* 185  469:goto            472
	//* 186  472:aload           16
	//* 187  474:iload           10
	//* 188  476:invokevirtual   #1575 <Method StringBuilder StringBuilder.append(int)>
	//* 189  479:pop             
	//* 190  480:aload_0         
	//* 191  481:getfield        #193 <Field r _fld02CD>
	//* 192  484:ldc2            #1581 <String "io.branch.referral.Branch">
	//* 193  487:invokevirtual   #1572 <Method boolean r._mth0971(String)>
	//* 194  490:ifeq            5018
	//* 195  493:iconst_1        
	//* 196  494:istore          10
	//* 197  496:goto            499
	//* 198  499:aload           16
	//* 199  501:iload           10
	//* 200  503:invokevirtual   #1575 <Method StringBuilder StringBuilder.append(int)>
	//* 201  506:pop             
	//* 202  507:aload_0         
	//* 203  508:getfield        #193 <Field r _fld02CD>
	//* 204  511:ldc2            #1583 <String "com.apsalar.sdk.Apsalar">
	//* 205  514:invokevirtual   #1572 <Method boolean r._mth0971(String)>
	//* 206  517:ifeq            5024
	//* 207  520:iconst_1        
	//* 208  521:istore          10
	//* 209  523:goto            526
	//* 210  526:aload           16
	//* 211  528:iload           10
	//* 212  530:invokevirtual   #1575 <Method StringBuilder StringBuilder.append(int)>
	//* 213  533:pop             
	//* 214  534:aload_0         
	//* 215  535:getfield        #193 <Field r _fld02CD>
	//* 216  538:ldc2            #1585 <String "com.localytics.android.Localytics">
	//* 217  541:invokevirtual   #1572 <Method boolean r._mth0971(String)>
	//* 218  544:ifeq            5030
	//* 219  547:iconst_1        
	//* 220  548:istore          10
	//* 221  550:goto            553
	//* 222  553:aload           16
	//* 223  555:iload           10
	//* 224  557:invokevirtual   #1575 <Method StringBuilder StringBuilder.append(int)>
	//* 225  560:pop             
	//* 226  561:aload_0         
	//* 227  562:getfield        #193 <Field r _fld02CD>
	//* 228  565:ldc2            #1587 <String "com.tenjin.android.TenjinSDK">
	//* 229  568:invokevirtual   #1572 <Method boolean r._mth0971(String)>
	//* 230  571:ifeq            5036
	//* 231  574:iconst_1        
	//* 232  575:istore          10
	//* 233  577:goto            580
	//* 234  580:aload           16
	//* 235  582:iload           10
	//* 236  584:invokevirtual   #1575 <Method StringBuilder StringBuilder.append(int)>
	//* 237  587:pop             
	//* 238  588:aload_0         
	//* 239  589:getfield        #193 <Field r _fld02CD>
	//* 240  592:ldc2            #1589 <String "place holder for TD">
	//* 241  595:invokevirtual   #1572 <Method boolean r._mth0971(String)>
	//* 242  598:ifeq            5042
	//* 243  601:iconst_1        
	//* 244  602:istore          10
	//* 245  604:goto            607
	//* 246  607:aload           16
	//* 247  609:iload           10
	//* 248  611:invokevirtual   #1575 <Method StringBuilder StringBuilder.append(int)>
	//* 249  614:pop             
	//* 250  615:aload_0         
	//* 251  616:getfield        #193 <Field r _fld02CD>
	//* 252  619:ldc2            #1591 <String "it.partytrack.sdk.Track">
	//* 253  622:invokevirtual   #1572 <Method boolean r._mth0971(String)>
	//* 254  625:ifeq            5048
	//* 255  628:iconst_1        
	//* 256  629:istore          10
	//* 257  631:goto            634
	//* 258  634:aload           16
	//* 259  636:iload           10
	//* 260  638:invokevirtual   #1575 <Method StringBuilder StringBuilder.append(int)>
	//* 261  641:pop             
	//* 262  642:aload_0         
	//* 263  643:getfield        #193 <Field r _fld02CD>
	//* 264  646:ldc2            #1593 <String "jp.appAdForce.android.LtvManager">
	//* 265  649:invokevirtual   #1572 <Method boolean r._mth0971(String)>
	//* 266  652:ifeq            5054
	//* 267  655:iconst_1        
	//* 268  656:istore          10
	//* 269  658:goto            661
	//* 270  661:aload           16
	//* 271  663:iload           10
	//* 272  665:invokevirtual   #1575 <Method StringBuilder StringBuilder.append(int)>
	//* 273  668:pop             
	//* 274  669:aload           18
	//* 275  671:ldc2            #1595 <String "af_sdks">
	//* 276  674:aload           16
	//* 277  676:invokevirtual   #108 <Method String Object.toString()>
	//* 278  679:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//* 279  684:pop             
	//* 280  685:aload           18
	//* 281  687:ldc2            #1597 <String "batteryLevel">
	//* 282  690:aload_1         
	//* 283  691:invokestatic    #1599 <Method float _mth09710971(Context)>
	//* 284  694:invokestatic    #1602 <Method String String.valueOf(float)>
	//* 285  697:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//* 286  702:pop             
	//* 287  703:bipush          18
	//* 288  705:istore          10
	//* 289  707:ldc2            #1604 <String "OPPO">
	//* 290  710:getstatic       #1545 <Field String Build.BRAND>
	//* 291  713:invokevirtual   #451 <Method boolean Object.equals(Object)>
	//* 292  716:ifeq            729
	//* 293  719:bipush          23
	//* 294  721:istore          10
	//* 295  723:ldc2            #1606 <String "OPPO device found">
	//* 296  726:invokestatic    #1156 <Method void AFLogger.afRDLog(String)>
	//* 297  729:getstatic       #288 <Field int android.os.Build$VERSION.SDK_INT>
	//* 298  732:iload           10
	//* 299  734:icmplt          896
	//* 300  737:new             #95  <Class StringBuilder>
	//* 301  740:dup             
	//* 302  741:ldc2            #1608 <String "OS SDK is=">
	//* 303  744:invokespecial   #115 <Method void StringBuilder(String)>
	//* 304  747:astore          16
	//* 305  749:aload           16
	//* 306  751:getstatic       #288 <Field int android.os.Build$VERSION.SDK_INT>
	//* 307  754:invokevirtual   #1575 <Method StringBuilder StringBuilder.append(int)>
	//* 308  757:pop             
	//* 309  758:aload           16
	//* 310  760:ldc2            #1610 <String "; use KeyStore">
	//* 311  763:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//* 312  766:pop             
	//* 313  767:aload           16
	//* 314  769:invokevirtual   #108 <Method String Object.toString()>
	//* 315  772:invokestatic    #1156 <Method void AFLogger.afRDLog(String)>
	//* 316  775:new             #1612 <Class AFKeystoreWrapper>
	//* 317  778:dup             
	//* 318  779:aload_1         
	//* 319  780:invokespecial   #1614 <Method void AFKeystoreWrapper(Context)>
	//* 320  783:astore          16
	//* 321  785:aload           16
	//* 322  787:invokevirtual   #1616 <Method boolean AFKeystoreWrapper._mth02CE()>
	//* 323  790:ifne            855
	//* 324  793:aload           16
	//* 325  795:new             #413 <Class WeakReference>
	//* 326  798:dup             
	//* 327  799:aload_1         
	//* 328  800:invokespecial   #416 <Method void WeakReference(Object)>
	//* 329  803:invokestatic    #1298 <Method String q._mth02CB(WeakReference)>
	//* 330  806:invokevirtual   #1617 <Method void AFKeystoreWrapper._mth02CF(String)>
	//* 331  809:aload           16
	//* 332  811:invokevirtual   #1618 <Method String AFKeystoreWrapper._mth0971()>
	//* 333  814:astore          17
	//* 334  816:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//* 335  819:ldc2            #1620 <String "KSAppsFlyerId">
	//* 336  822:aload           17
	//* 337  824:invokevirtual   #1351 <Method void AppsFlyerProperties.set(String, String)>
	//* 338  827:aload           16
	//* 339  829:invokevirtual   #1622 <Method int AFKeystoreWrapper._mth02CB()>
	//* 340  832:invokestatic    #648 <Method String String.valueOf(int)>
	//* 341  835:astore          16
	//* 342  837:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//* 343  840:astore          17
	//* 344  842:aload           17
	//* 345  844:ldc2            #1624 <String "KSAppsFlyerRICounter">
	//* 346  847:aload           16
	//* 347  849:invokevirtual   #1351 <Method void AppsFlyerProperties.set(String, String)>
	//* 348  852:goto            934
	//* 349  855:aload           16
	//* 350  857:invokevirtual   #1626 <Method void AFKeystoreWrapper._mth02CA()>
	//* 351  860:aload           16
	//* 352  862:invokevirtual   #1618 <Method String AFKeystoreWrapper._mth0971()>
	//* 353  865:astore          17
	//* 354  867:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//* 355  870:ldc2            #1620 <String "KSAppsFlyerId">
	//* 356  873:aload           17
	//* 357  875:invokevirtual   #1351 <Method void AppsFlyerProperties.set(String, String)>
	//* 358  878:aload           16
	//* 359  880:invokevirtual   #1622 <Method int AFKeystoreWrapper._mth02CB()>
	//* 360  883:invokestatic    #648 <Method String String.valueOf(int)>
	//* 361  886:astore          16
	//* 362  888:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//* 363  891:astore          17
	//* 364  893:goto            842
	//* 365  896:new             #95  <Class StringBuilder>
	//* 366  899:dup             
	//* 367  900:ldc2            #1608 <String "OS SDK is=">
	//* 368  903:invokespecial   #115 <Method void StringBuilder(String)>
	//* 369  906:astore          16
	//* 370  908:aload           16
	//* 371  910:getstatic       #288 <Field int android.os.Build$VERSION.SDK_INT>
	//* 372  913:invokevirtual   #1575 <Method StringBuilder StringBuilder.append(int)>
	//* 373  916:pop             
	//* 374  917:aload           16
	//* 375  919:ldc2            #1628 <String "; no KeyStore usage">
	//* 376  922:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//* 377  925:pop             
	//* 378  926:aload           16
	//* 379  928:invokevirtual   #108 <Method String Object.toString()>
	//* 380  931:invokestatic    #1156 <Method void AFLogger.afRDLog(String)>
	//* 381  934:aload_1         
	//* 382  935:ldc2            #534 <String "appsflyer-data">
	//* 383  938:iconst_0        
	//* 384  939:invokevirtual   #538 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//* 385  942:ldc2            #1630 <String "AppsFlyerTimePassedSincePrevLaunch">
	//* 386  945:lconst_0        
	//* 387  946:invokeinterface #786 <Method long SharedPreferences.getLong(String, long)>
	//* 388  951:lstore          12
	//* 389  953:invokestatic    #318 <Method long System.currentTimeMillis()>
	//* 390  956:lstore          14
	//* 391  958:aload_1         
	//* 392  959:ldc2            #1630 <String "AppsFlyerTimePassedSincePrevLaunch">
	//* 393  962:lload           14
	//* 394  964:invokestatic    #329 <Method void _mth0971(Context, String, long)>
	//* 395  967:lload           12
	//* 396  969:lconst_0        
	//* 397  970:lcmp            
	//* 398  971:ifle            5060
	//* 399  974:lload           14
	//* 400  976:lload           12
	//* 401  978:lsub            
	//* 402  979:ldc2w           #1631 <Long 1000L>
	//* 403  982:ldiv            
	//* 404  983:lstore          12
	//* 405  985:goto            988
	//* 406  988:aload           18
	//* 407  990:ldc2            #1634 <String "timepassedsincelastlaunch">
	//* 408  993:lload           12
	//* 409  995:invokestatic    #1497 <Method String Long.toString(long)>
	//* 410  998:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//* 411 1003:pop             
	//* 412 1004:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//* 413 1007:ldc2            #1636 <String "oneLinkSlug">
	//* 414 1010:invokevirtual   #258 <Method String AppsFlyerProperties.getString(String)>
	//* 415 1013:astore          16
	//* 416 1015:aload           16
	//* 417 1017:ifnull          1294
	//* 418 1020:aload           18
	//* 419 1022:ldc2            #1638 <String "onelink_id">
	//* 420 1025:aload           16
	//* 421 1027:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//* 422 1032:pop             
	//* 423 1033:aload           18
	//* 424 1035:ldc2            #1640 <String "ol_ver">
	//* 425 1038:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//* 426 1041:ldc2            #1642 <String "onelinkVersion">
	//* 427 1044:invokevirtual   #258 <Method String AppsFlyerProperties.getString(String)>
	//* 428 1047:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//* 429 1052:pop             
	//* 430 1053:goto            1294
	//* 431 1056:aload_1         
	//* 432 1057:ldc2            #534 <String "appsflyer-data">
	//* 433 1060:iconst_0        
	//* 434 1061:invokevirtual   #538 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//* 435 1064:astore          16
	//* 436 1066:aload           16
	//* 437 1068:invokeinterface #1072 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//* 438 1073:astore          17
	//* 439 1075:aload           16
	//* 440 1077:ldc2            #1644 <String "prev_event_name">
	//* 441 1080:aconst_null     
	//* 442 1081:invokeinterface #793 <Method String SharedPreferences.getString(String, String)>
	//* 443 1086:astore          19
	//* 444 1088:aload           19
	//* 445 1090:ifnull          1216
	//* 446 1093:new             #771 <Class JSONObject>
	//* 447 1096:dup             
	//* 448 1097:invokespecial   #891 <Method void JSONObject()>
	//* 449 1100:astore          20
	//* 450 1102:new             #95  <Class StringBuilder>
	//* 451 1105:dup             
	//* 452 1106:invokespecial   #98  <Method void StringBuilder()>
	//* 453 1109:astore          21
	//* 454 1111:aload           21
	//* 455 1113:aload           16
	//* 456 1115:ldc2            #1646 <String "prev_event_timestamp">
	//* 457 1118:ldc2w           #157 <Long -1L>
	//* 458 1121:invokeinterface #786 <Method long SharedPreferences.getLong(String, long)>
	//* 459 1126:invokevirtual   #1649 <Method StringBuilder StringBuilder.append(long)>
	//* 460 1129:pop             
	//* 461 1130:aload           20
	//* 462 1132:ldc2            #1646 <String "prev_event_timestamp">
	//* 463 1135:aload           21
	//* 464 1137:invokevirtual   #108 <Method String Object.toString()>
	//* 465 1140:invokevirtual   #896 <Method JSONObject JSONObject.put(String, Object)>
	//* 466 1143:pop             
	//* 467 1144:aload           20
	//* 468 1146:ldc2            #1651 <String "prev_event_value">
	//* 469 1149:aload           16
	//* 470 1151:ldc2            #1651 <String "prev_event_value">
	//* 471 1154:aconst_null     
	//* 472 1155:invokeinterface #793 <Method String SharedPreferences.getString(String, String)>
	//* 473 1160:invokevirtual   #896 <Method JSONObject JSONObject.put(String, Object)>
	//* 474 1163:pop             
	//* 475 1164:aload           20
	//* 476 1166:ldc2            #1644 <String "prev_event_name">
	//* 477 1169:aload           19
	//* 478 1171:invokevirtual   #896 <Method JSONObject JSONObject.put(String, Object)>
	//* 479 1174:pop             
	//* 480 1175:aload           20
	//* 481 1177:instanceof      #771 <Class JSONObject>
	//* 482 1180:ifne            1193
	//* 483 1183:aload           20
	//* 484 1185:invokevirtual   #897 <Method String JSONObject.toString()>
	//* 485 1188:astore          16
	//* 486 1190:goto            1203
	//* 487 1193:aload           20
	//* 488 1195:checkcast       #771 <Class JSONObject>
	//* 489 1198:invokestatic    #900 <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//* 490 1201:astore          16
	//* 491 1203:aload           18
	//* 492 1205:ldc2            #1653 <String "prev_event">
	//* 493 1208:aload           16
	//* 494 1210:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//* 495 1215:pop             
	//* 496 1216:aload           17
	//* 497 1218:ldc2            #1644 <String "prev_event_name">
	//* 498 1221:aload_3         
	//* 499 1222:invokeinterface #1144 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//* 500 1227:pop             
	//* 501 1228:aload           17
	//* 502 1230:ldc2            #1651 <String "prev_event_value">
	//* 503 1233:aload           4
	//* 504 1235:invokeinterface #1144 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//* 505 1240:pop             
	//* 506 1241:aload           17
	//* 507 1243:ldc2            #1646 <String "prev_event_timestamp">
	//* 508 1246:invokestatic    #318 <Method long System.currentTimeMillis()>
	//* 509 1249:invokeinterface #1208 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//* 510 1254:pop             
	//* 511 1255:getstatic       #288 <Field int android.os.Build$VERSION.SDK_INT>
	//* 512 1258:bipush          9
	//* 513 1260:icmplt          1273
	//* 514 1263:aload           17
	//* 515 1265:invokeinterface #1081 <Method void android.content.SharedPreferences$Editor.apply()>
	//* 516 1270:goto            1294
	//* 517 1273:aload           17
	//* 518 1275:invokeinterface #1084 <Method boolean android.content.SharedPreferences$Editor.commit()>
	//* 519 1280:pop             
	//* 520 1281:goto            1294
	//* 521 1284:astore          16
	//* 522 1286:ldc2            #1655 <String "Error while processing previous event.">
	//* 523 1289:aload           16
	//* 524 1291:invokestatic    #245 <Method void AFLogger.afErrorLog(String, Throwable)>
	//* 525 1294:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//* 526 1297:ldc2            #1620 <String "KSAppsFlyerId">
	//* 527 1300:invokevirtual   #258 <Method String AppsFlyerProperties.getString(String)>
	//* 528 1303:astore          16
	//* 529 1305:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//* 530 1308:ldc2            #1624 <String "KSAppsFlyerRICounter">
	//* 531 1311:invokevirtual   #258 <Method String AppsFlyerProperties.getString(String)>
	//* 532 1314:astore          17
	//* 533 1316:aload           16
	//* 534 1318:ifnull          1363
	//* 535 1321:aload           17
	//* 536 1323:ifnull          1363
	//* 537 1326:aload           17
	//* 538 1328:invokestatic    #1658 <Method Integer Integer.valueOf(String)>
	//* 539 1331:invokevirtual   #1661 <Method int Number.intValue()>
	//* 540 1334:ifle            1363
	//* 541 1337:aload           18
	//* 542 1339:ldc2            #1663 <String "reinstallCounter">
	//* 543 1342:aload           17
	//* 544 1344:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//* 545 1349:pop             
	//* 546 1350:aload           18
	//* 547 1352:ldc2            #1665 <String "originalAppsflyerId">
	//* 548 1355:aload           16
	//* 549 1357:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//* 550 1362:pop             
	//* 551 1363:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//* 552 1366:ldc2            #1667 <String "additionalCustomData">
	//* 553 1369:invokevirtual   #258 <Method String AppsFlyerProperties.getString(String)>
	//* 554 1372:astore          16
	//* 555 1374:aload           16
	//* 556 1376:ifnull          1392
	//* 557 1379:aload           18
	//* 558 1381:ldc2            #1669 <String "customData">
	//* 559 1384:aload           16
	//* 560 1386:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//* 561 1391:pop             
	//* 562 1392:aload_1         
	//* 563 1393:invokevirtual   #930 <Method PackageManager Context.getPackageManager()>
	//* 564 1396:aload_1         
	//* 565 1397:invokevirtual   #577 <Method String Context.getPackageName()>
	//* 566 1400:invokevirtual   #1672 <Method String PackageManager.getInstallerPackageName(String)>
	//* 567 1403:astore          16
	//* 568 1405:aload           16
	//* 569 1407:ifnull          1436
	//* 570 1410:aload           18
	//* 571 1412:ldc2            #1674 <String "installer_package">
	//* 572 1415:aload           16
	//* 573 1417:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//* 574 1422:pop             
	//* 575 1423:goto            1436
	//* 576 1426:astore          16
	//* 577 1428:ldc2            #1676 <String "Exception while getting the app's installer package. ">
	//* 578 1431:aload           16
	//* 579 1433:invokestatic    #245 <Method void AFLogger.afErrorLog(String, Throwable)>
	//* 580 1436:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//* 581 1439:ldc2            #1678 <String "sdkExtension">
	//* 582 1442:invokevirtual   #258 <Method String AppsFlyerProperties.getString(String)>
	//* 583 1445:astore          16
	//* 584 1447:aload           16
	//* 585 1449:ifnull          1473
	//* 586 1452:aload           16
	//* 587 1454:invokevirtual   #567 <Method int String.length()>
	//* 588 1457:ifle            1473
	//* 589 1460:aload           18
	//* 590 1462:ldc2            #1678 <String "sdkExtension">
	//* 591 1465:aload           16
	//* 592 1467:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//* 593 1472:pop             
	//* 594 1473:new             #413 <Class WeakReference>
	//* 595 1476:dup             
	//* 596 1477:aload_1         
	//* 597 1478:invokespecial   #416 <Method void WeakReference(Object)>
	//* 598 1481:astore          19
	//* 599 1483:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//* 600 1486:ldc1            #254 <String "channel">
	//* 601 1488:invokevirtual   #258 <Method String AppsFlyerProperties.getString(String)>
	//* 602 1491:astore          17
	//* 603 1493:aload           17
	//* 604 1495:astore          16
	//* 605 1497:aload           17
	//* 606 1499:ifnonnull       1512
	//* 607 1502:aload           19
	//* 608 1504:ldc2            #260 <String "CHANNEL">
	//* 609 1507:invokestatic    #263 <Method String _mth02CE(WeakReference, String)>
	//* 610 1510:astore          16
	//* 611 1512:aload_1         
	//* 612 1513:aload           16
	//* 613 1515:invokestatic    #212 <Method String _mth02CF(Context, String)>
	//* 614 1518:astore          17
	//* 615 1520:aload           17
	//* 616 1522:ifnull          1537
	//* 617 1525:aload           18
	//* 618 1527:ldc1            #254 <String "channel">
	//* 619 1529:aload           17
	//* 620 1531:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//* 621 1536:pop             
	//* 622 1537:aload           17
	//* 623 1539:ifnull          5068
	//* 624 1542:aload           17
	//* 625 1544:aload           16
	//* 626 1546:invokevirtual   #451 <Method boolean Object.equals(Object)>
	//* 627 1549:ifeq            1555
	//* 628 1552:goto            5068
	//* 629 1555:aload           18
	//* 630 1557:ldc2            #1680 <String "af_latestchannel">
	//* 631 1560:aload           16
	//* 632 1562:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//* 633 1567:pop             
	//* 634 1568:aload_1         
	//* 635 1569:ldc2            #534 <String "appsflyer-data">
	//* 636 1572:iconst_0        
	//* 637 1573:invokevirtual   #538 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//* 638 1576:astore          16
	//* 639 1578:aload           16
	//* 640 1580:ldc2            #1682 <String "INSTALL_STORE">
	//* 641 1583:invokeinterface #1181 <Method boolean SharedPreferences.contains(String)>
	//* 642 1588:ifeq            1607
	//* 643 1591:aload           16
	//* 644 1593:ldc2            #1682 <String "INSTALL_STORE">
	//* 645 1596:aconst_null     
	//* 646 1597:invokeinterface #793 <Method String SharedPreferences.getString(String, String)>
	//* 647 1602:astore          16
	//* 648 1604:goto            1656
	//* 649 1607:aload_1         
	//* 650 1608:ldc2            #534 <String "appsflyer-data">
	//* 651 1611:iconst_0        
	//* 652 1612:invokevirtual   #538 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//* 653 1615:ldc2            #579 <String "appsFlyerCount">
	//* 654 1618:invokeinterface #1181 <Method boolean SharedPreferences.contains(String)>
	//* 655 1623:iconst_1        
	//* 656 1624:ixor            
	//* 657 1625:ifeq            5081
	//* 658 1628:new             #413 <Class WeakReference>
	//* 659 1631:dup             
	//* 660 1632:aload_1         
	//* 661 1633:invokespecial   #416 <Method void WeakReference(Object)>
	//* 662 1636:ldc2            #1684 <String "AF_STORE">
	//* 663 1639:invokestatic    #263 <Method String _mth02CE(WeakReference, String)>
	//* 664 1642:astore          16
	//* 665 1644:goto            1647
	//* 666 1647:aload_1         
	//* 667 1648:ldc2            #1682 <String "INSTALL_STORE">
	//* 668 1651:aload           16
	//* 669 1653:invokestatic    #332 <Method void _mth02CF(Context, String, String)>
	//* 670 1656:aload           16
	//* 671 1658:ifnull          1677
	//* 672 1661:aload           18
	//* 673 1663:ldc2            #1686 <String "af_installstore">
	//* 674 1666:aload           16
	//* 675 1668:invokevirtual   #1689 <Method String String.toLowerCase()>
	//* 676 1671:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//* 677 1676:pop             
	//* 678 1677:aload_1         
	//* 679 1678:ldc2            #534 <String "appsflyer-data">
	//* 680 1681:iconst_0        
	//* 681 1682:invokevirtual   #538 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//* 682 1685:astore          19
	//* 683 1687:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//* 684 1690:ldc2            #1691 <String "preInstallName">
	//* 685 1693:invokevirtual   #258 <Method String AppsFlyerProperties.getString(String)>
	//* 686 1696:astore          17
	//* 687 1698:aload           17
	//* 688 1700:astore          16
	//* 689 1702:aload           17
	//* 690 1704:ifnonnull       1972
	//* 691 1707:aload           19
	//* 692 1709:ldc2            #1691 <String "preInstallName">
	//* 693 1712:invokeinterface #1181 <Method boolean SharedPreferences.contains(String)>
	//* 694 1717:ifeq            1736
	//* 695 1720:aload           19
	//* 696 1722:ldc2            #1691 <String "preInstallName">
	//* 697 1725:aconst_null     
	//* 698 1726:invokeinterface #793 <Method String SharedPreferences.getString(String, String)>
	//* 699 1731:astore          17
	//* 700 1733:goto            1948
	//* 701 1736:aload           17
	//* 702 1738:astore          16
	//* 703 1740:aload_1         
	//* 704 1741:ldc2            #534 <String "appsflyer-data">
	//* 705 1744:iconst_0        
	//* 706 1745:invokevirtual   #538 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//* 707 1748:ldc2            #579 <String "appsFlyerCount">
	//* 708 1751:invokeinterface #1181 <Method boolean SharedPreferences.contains(String)>
	//* 709 1756:iconst_1        
	//* 710 1757:ixor            
	//* 711 1758:ifeq            1926
	//* 712 1761:ldc2            #1693 <String "ro.appsflyer.preinstall.path">
	//* 713 1764:invokestatic    #1695 <Method String _mth02CE(String)>
	//* 714 1767:invokestatic    #1697 <Method File _mth02CF(String)>
	//* 715 1770:astore          16
	//* 716 1772:aload           16
	//* 717 1774:ifnull          5093
	//* 718 1777:aload           16
	//* 719 1779:invokevirtual   #1700 <Method boolean File.exists()>
	//* 720 1782:ifne            5087
	//* 721 1785:goto            5093
	//* 722 1788:iload           10
	//* 723 1790:ifeq            1812
	//* 724 1793:ldc2            #1702 <String "AF_PRE_INSTALL_PATH">
	//* 725 1796:aload_1         
	//* 726 1797:invokevirtual   #930 <Method PackageManager Context.getPackageManager()>
	//* 727 1800:aload_1         
	//* 728 1801:invokevirtual   #577 <Method String Context.getPackageName()>
	//* 729 1804:invokestatic    #1107 <Method String _mth02CA(String, PackageManager, String)>
	//* 730 1807:invokestatic    #1697 <Method File _mth02CF(String)>
	//* 731 1810:astore          16
	//* 732 1812:aload           16
	//* 733 1814:ifnull          5105
	//* 734 1817:aload           16
	//* 735 1819:invokevirtual   #1700 <Method boolean File.exists()>
	//* 736 1822:ifne            5099
	//* 737 1825:goto            5105
	//* 738 1828:iload           10
	//* 739 1830:ifeq            1841
	//* 740 1833:ldc2            #1704 <String "/data/local/tmp/pre_install.appsflyer">
	//* 741 1836:invokestatic    #1697 <Method File _mth02CF(String)>
	//* 742 1839:astore          16
	//* 743 1841:aload           16
	//* 744 1843:ifnull          5117
	//* 745 1846:aload           16
	//* 746 1848:invokevirtual   #1700 <Method boolean File.exists()>
	//* 747 1851:ifne            5111
	//* 748 1854:goto            5117
	//* 749 1857:iload           10
	//* 750 1859:ifeq            1870
	//* 751 1862:ldc2            #1706 <String "/etc/pre_install.appsflyer">
	//* 752 1865:invokestatic    #1697 <Method File _mth02CF(String)>
	//* 753 1868:astore          16
	//* 754 1870:aload           16
	//* 755 1872:ifnull          5129
	//* 756 1875:aload           16
	//* 757 1877:invokevirtual   #1700 <Method boolean File.exists()>
	//* 758 1880:ifne            5123
	//* 759 1883:goto            5129
	//* 760 1886:iload           10
	//* 761 1888:ifne            5135
	//* 762 1891:aload           16
	//* 763 1893:aload_1         
	//* 764 1894:invokevirtual   #577 <Method String Context.getPackageName()>
	//* 765 1897:invokestatic    #1708 <Method String _mth02CB(File, String)>
	//* 766 1900:astore          16
	//* 767 1902:aload           16
	//* 768 1904:ifnull          5135
	//* 769 1907:goto            5138
	//* 770 1910:new             #413 <Class WeakReference>
	//* 771 1913:dup             
	//* 772 1914:aload_1         
	//* 773 1915:invokespecial   #416 <Method void WeakReference(Object)>
	//* 774 1918:ldc2            #1710 <String "AF_PRE_INSTALL_NAME">
	//* 775 1921:invokestatic    #263 <Method String _mth02CE(WeakReference, String)>
	//* 776 1924:astore          16
	//* 777 1926:aload           16
	//* 778 1928:astore          17
	//* 779 1930:aload           16
	//* 780 1932:ifnull          1948
	//* 781 1935:aload_1         
	//* 782 1936:ldc2            #1691 <String "preInstallName">
	//* 783 1939:aload           16
	//* 784 1941:invokestatic    #332 <Method void _mth02CF(Context, String, String)>
	//* 785 1944:aload           16
	//* 786 1946:astore          17
	//* 787 1948:aload           17
	//* 788 1950:astore          16
	//* 789 1952:aload           17
	//* 790 1954:ifnull          1972
	//* 791 1957:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//* 792 1960:ldc2            #1691 <String "preInstallName">
	//* 793 1963:aload           17
	//* 794 1965:invokevirtual   #1351 <Method void AppsFlyerProperties.set(String, String)>
	//* 795 1968:aload           17
	//* 796 1970:astore          16
	//* 797 1972:aload           16
	//* 798 1974:ifnull          1993
	//* 799 1977:aload           18
	//* 800 1979:ldc2            #1712 <String "af_preinstall_name">
	//* 801 1982:aload           16
	//* 802 1984:invokevirtual   #1689 <Method String String.toLowerCase()>
	//* 803 1987:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//* 804 1992:pop             
	//* 805 1993:new             #413 <Class WeakReference>
	//* 806 1996:dup             
	//* 807 1997:aload_1         
	//* 808 1998:invokespecial   #416 <Method void WeakReference(Object)>
	//* 809 2001:ldc2            #1684 <String "AF_STORE">
	//* 810 2004:invokestatic    #263 <Method String _mth02CE(WeakReference, String)>
	//* 811 2007:astore          16
	//* 812 2009:aload           16
	//* 813 2011:ifnull          2030
	//* 814 2014:aload           18
	//* 815 2016:ldc2            #1714 <String "af_currentstore">
	//* 816 2019:aload           16
	//* 817 2021:invokevirtual   #1689 <Method String String.toLowerCase()>
	//* 818 2024:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//* 819 2029:pop             
	//* 820 2030:aload_2         
	//* 821 2031:ifnull          2056
	//* 822 2034:aload_2         
	//* 823 2035:invokevirtual   #567 <Method int String.length()>
	//* 824 2038:iflt            2056
	//* 825 2041:aload           18
	//* 826 2043:ldc2            #561 <String "appsflyerKey">
	//* 827 2046:aload_2         
	//* 828 2047:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//* 829 2052:pop             
	//* 830 2053:goto            2089
	//* 831 2056:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//* 832 2059:ldc2            #1348 <String "AppsFlyerKey">
	//* 833 2062:invokevirtual   #258 <Method String AppsFlyerProperties.getString(String)>
	//* 834 2065:astore_2        
	//* 835 2066:aload_2         
	//* 836 2067:ifnull          4930
	//* 837 2070:aload_2         
	//* 838 2071:invokevirtual   #567 <Method int String.length()>
	//* 839 2074:iflt            4930
	//* 840 2077:aload           18
	//* 841 2079:ldc2            #561 <String "appsflyerKey">
	//* 842 2082:aload_2         
	//* 843 2083:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//* 844 2088:pop             
	//* 845 2089:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//* 846 2092:ldc2            #391 <String "AppUserId">
	//* 847 2095:invokevirtual   #258 <Method String AppsFlyerProperties.getString(String)>
	//* 848 2098:astore_2        
	//* 849 2099:aload_2         
	//* 850 2100:ifnull          2115
	//* 851 2103:aload           18
	//* 852 2105:ldc2            #1716 <String "appUserId">
	//* 853 2108:aload_2         
	//* 854 2109:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//* 855 2114:pop             
	//* 856 2115:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//* 857 2118:ldc2            #1718 <String "userEmails">
	//* 858 2121:invokevirtual   #258 <Method String AppsFlyerProperties.getString(String)>
	//* 859 2124:astore_2        
	//* 860 2125:aload_2         
	//* 861 2126:ifnull          2144
	//* 862 2129:aload           18
	//* 863 2131:ldc2            #1720 <String "user_emails">
	//* 864 2134:aload_2         
	//* 865 2135:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//* 866 2140:pop             
	//* 867 2141:goto            2173
	//* 868 2144:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//* 869 2147:ldc2            #1722 <String "userEmail">
	//* 870 2150:invokevirtual   #258 <Method String AppsFlyerProperties.getString(String)>
	//* 871 2153:astore_2        
	//* 872 2154:aload_2         
	//* 873 2155:ifnull          2173
	//* 874 2158:aload           18
	//* 875 2160:ldc2            #1724 <String "sha1_el">
	//* 876 2163:aload_2         
	//* 877 2164:invokestatic    #1727 <Method String s._mth02CE(String)>
	//* 878 2167:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//* 879 2172:pop             
	//* 880 2173:aload_3         
	//* 881 2174:ifnull          2207
	//* 882 2177:aload           18
	//* 883 2179:ldc2            #1729 <String "eventName">
	//* 884 2182:aload_3         
	//* 885 2183:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//* 886 2188:pop             
	//* 887 2189:aload           4
	//* 888 2191:ifnull          2207
	//* 889 2194:aload           18
	//* 890 2196:ldc2            #1731 <String "eventValue">
	//* 891 2199:aload           4
	//* 892 2201:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//* 893 2206:pop             
	//* 894 2207:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//* 895 2210:ldc2            #1733 <String "appid">
	//* 896 2213:invokevirtual   #258 <Method String AppsFlyerProperties.getString(String)>
	//* 897 2216:ifnull          2239
	//* 898 2219:aload           18
	//* 899 2221:ldc2            #1733 <String "appid">
	//* 900 2224:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//* 901 2227:ldc2            #1733 <String "appid">
	//* 902 2230:invokevirtual   #258 <Method String AppsFlyerProperties.getString(String)>
	//* 903 2233:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//* 904 2238:pop             
	//* 905 2239:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//* 906 2242:ldc2            #1735 <String "currencyCode">
	//* 907 2245:invokevirtual   #258 <Method String AppsFlyerProperties.getString(String)>
	//* 908 2248:astore_2        
	//* 909 2249:aload_2         
	//* 910 2250:ifnull          2309
	//* 911 2253:aload_2         
	//* 912 2254:invokevirtual   #567 <Method int String.length()>
	//* 913 2257:iconst_3        
	//* 914 2258:icmpeq          2297
	//* 915 2261:new             #95  <Class StringBuilder>
	//* 916 2264:dup             
	//* 917 2265:ldc2            #1737 <String "WARNING: currency code should be 3 characters!!! '">
	//* 918 2268:invokespecial   #115 <Method void StringBuilder(String)>
	//* 919 2271:astore          4
	//* 920 2273:aload           4
	//* 921 2275:aload_2         
	//* 922 2276:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//* 923 2279:pop             
	//* 924 2280:aload           4
	//* 925 2282:ldc2            #1739 <String "' is not a legal value.">
	//* 926 2285:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//* 927 2288:pop             
	//* 928 2289:aload           4
	//* 929 2291:invokevirtual   #108 <Method String Object.toString()>
	//* 930 2294:invokestatic    #803 <Method void AFLogger.afWarnLog(String)>
	//* 931 2297:aload           18
	//* 932 2299:ldc2            #1741 <String "currency">
	//* 933 2302:aload_2         
	//* 934 2303:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//* 935 2308:pop             
	//* 936 2309:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//* 937 2312:ldc2            #1743 <String "IS_UPDATE">
	//* 938 2315:invokevirtual   #258 <Method String AppsFlyerProperties.getString(String)>
	//* 939 2318:astore_2        
	//* 940 2319:aload_2         
	//* 941 2320:ifnull          2335
	//* 942 2323:aload           18
	//* 943 2325:ldc2            #1745 <String "isUpdate">
	//* 944 2328:aload_2         
	//* 945 2329:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//* 946 2334:pop             
	//* 947 2335:aload           18
	//* 948 2337:ldc2            #1747 <String "af_preinstalled">
	//* 949 2340:aload_0         
	//* 950 2341:aload_1         
	//* 951 2342:invokevirtual   #1749 <Method boolean isPreInstalledApp(Context)>
	//* 952 2345:invokestatic    #811 <Method String Boolean.toString(boolean)>
	//* 953 2348:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//* 954 2353:pop             
	//* 955 2354:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//* 956 2357:ldc2            #1751 <String "collectFacebookAttrId">
	//* 957 2360:iconst_1        
	//* 958 2361:invokevirtual   #339 <Method boolean AppsFlyerProperties.getBoolean(String, boolean)>
	//* 959 2364:istore          6
	//* 960 2366:iload           6
	//* 961 2368:ifeq            2432
	//* 962 2371:aload_1         
	//* 963 2372:invokevirtual   #930 <Method PackageManager Context.getPackageManager()>
	//* 964 2375:ldc2            #1753 <String "com.facebook.katana">
	//* 965 2378:iconst_0        
	//* 966 2379:invokevirtual   #223 <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//* 967 2382:pop             
	//* 968 2383:aload_0         
	//* 969 2384:aload_1         
	//* 970 2385:invokevirtual   #1757 <Method ContentResolver Context.getContentResolver()>
	//* 971 2388:invokevirtual   #1759 <Method String getAttributionId(ContentResolver)>
	//* 972 2391:astore_2        
	//* 973 2392:goto            2416
	//* 974 2395:astore_2        
	//* 975 2396:ldc2            #1761 <String "Exception while collecting facebook's attribution ID. ">
	//* 976 2399:aload_2         
	//* 977 2400:invokestatic    #245 <Method void AFLogger.afErrorLog(String, Throwable)>
	//* 978 2403:aconst_null     
	//* 979 2404:astore_2        
	//* 980 2405:goto            2416
	//* 981 2408:ldc2            #1761 <String "Exception while collecting facebook's attribution ID. ">
	//* 982 2411:invokestatic    #803 <Method void AFLogger.afWarnLog(String)>
	//* 983 2414:aconst_null     
	//* 984 2415:astore_2        
	//* 985 2416:aload_2         
	//* 986 2417:ifnull          2432
	//* 987 2420:aload           18
	//* 988 2422:ldc2            #1763 <String "fb">
	//* 989 2425:aload_2         
	//* 990 2426:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//* 991 2431:pop             
	//* 992 2432:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//* 993 2435:ldc2            #1765 <String "deviceTrackingDisabled">
	//* 994 2438:iconst_0        
	//* 995 2439:invokevirtual   #339 <Method boolean AppsFlyerProperties.getBoolean(String, boolean)>
	//* 996 2442:ifeq            2462
	//* 997 2445:aload           18
	//* 998 2447:ldc2            #1765 <String "deviceTrackingDisabled">
	//* 999 2450:ldc2            #362 <String "true">
	//*1000 2453:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//*1001 2458:pop             
	//*1002 2459:goto            2874
	//*1003 2462:aload_1         
	//*1004 2463:ldc2            #534 <String "appsflyer-data">
	//*1005 2466:iconst_0        
	//*1006 2467:invokevirtual   #538 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//*1007 2470:astore          16
	//*1008 2472:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//*1009 2475:ldc2            #1767 <String "collectIMEI">
	//*1010 2478:iconst_1        
	//*1011 2479:invokevirtual   #339 <Method boolean AppsFlyerProperties.getBoolean(String, boolean)>
	//*1012 2482:istore          6
	//*1013 2484:aload           16
	//*1014 2486:ldc2            #1769 <String "imeiCached">
	//*1015 2489:aconst_null     
	//*1016 2490:invokeinterface #793 <Method String SharedPreferences.getString(String, String)>
	//*1017 2495:astore_2        
	//*1018 2496:iload           6
	//*1019 2498:ifeq            2651
	//*1020 2501:getstatic       #288 <Field int android.os.Build$VERSION.SDK_INT>
	//*1021 2504:bipush          19
	//*1022 2506:icmplt          2529
	//*1023 2509:aload_1         
	//*1024 2510:invokestatic    #1771 <Method boolean _mth0971(Context)>
	//*1025 2513:istore          6
	//*1026 2515:iload           6
	//*1027 2517:ifne            2523
	//*1028 2520:goto            2529
	//*1029 2523:iconst_0        
	//*1030 2524:istore          10
	//*1031 2526:goto            2532
	//*1032 2529:iconst_1        
	//*1033 2530:istore          10
	//*1034 2532:iload           10
	//*1035 2534:ifeq            2636
	//*1036 2537:aload_1         
	//*1037 2538:ldc2            #1773 <String "phone">
	//*1038 2541:invokevirtual   #1776 <Method Object Context.getSystemService(String)>
	//*1039 2544:checkcast       #1778 <Class TelephonyManager>
	//*1040 2547:astore          4
	//*1041 2549:aload           4
	//*1042 2551:invokevirtual   #551 <Method Class Object.getClass()>
	//*1043 2554:ldc2            #1780 <String "getDeviceId">
	//*1044 2557:iconst_0        
	//*1045 2558:anewarray       Class[]
	//*1046 2561:invokevirtual   #1099 <Method Method Class.getMethod(String, Class[])>
	//*1047 2564:aload           4
	//*1048 2566:iconst_0        
	//*1049 2567:anewarray       Object[]
	//*1050 2570:invokevirtual   #1105 <Method Object Method.invoke(Object, Object[])>
	//*1051 2573:checkcast       #83  <Class String>
	//*1052 2576:astore          4
	//*1053 2578:aload           4
	//*1054 2580:ifnull          2589
	//*1055 2583:aload           4
	//*1056 2585:astore_2        
	//*1057 2586:goto            2661
	//*1058 2589:aload_0         
	//*1059 2590:getfield        #1782 <Field String _fld02CF>
	//*1060 2593:ifnull          2604
	//*1061 2596:aload_0         
	//*1062 2597:getfield        #1782 <Field String _fld02CF>
	//*1063 2600:astore_2        
	//*1064 2601:goto            2661
	//*1065 2604:aload_2         
	//*1066 2605:ifnull          2611
	//*1067 2608:goto            2613
	//*1068 2611:aconst_null     
	//*1069 2612:astore_2        
	//*1070 2613:goto            2661
	//*1071 2616:astore_2        
	//*1072 2617:ldc2            #1784 <String "WARNING: READ_PHONE_STATE is missing. ">
	//*1073 2620:aload_2         
	//*1074 2621:invokestatic    #245 <Method void AFLogger.afErrorLog(String, Throwable)>
	//*1075 2624:goto            5146
	//*1076 2627:ldc2            #1786 <String "WARNING: READ_PHONE_STATE is missing.">
	//*1077 2630:invokestatic    #803 <Method void AFLogger.afWarnLog(String)>
	//*1078 2633:goto            5146
	//*1079 2636:aload_0         
	//*1080 2637:getfield        #1782 <Field String _fld02CF>
	//*1081 2640:ifnull          5146
	//*1082 2643:aload_0         
	//*1083 2644:getfield        #1782 <Field String _fld02CF>
	//*1084 2647:astore_2        
	//*1085 2648:goto            2661
	//*1086 2651:aload_0         
	//*1087 2652:getfield        #1782 <Field String _fld02CF>
	//*1088 2655:ifnull          5146
	//*1089 2658:goto            2643
	//*1090 2661:aload_2         
	//*1091 2662:ifnull          2688
	//*1092 2665:aload_1         
	//*1093 2666:ldc2            #1769 <String "imeiCached">
	//*1094 2669:aload_2         
	//*1095 2670:invokestatic    #332 <Method void _mth02CF(Context, String, String)>
	//*1096 2673:aload           18
	//*1097 2675:ldc2            #1788 <String "imei">
	//*1098 2678:aload_2         
	//*1099 2679:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//*1100 2684:pop             
	//*1101 2685:goto            2694
	//*1102 2688:ldc2            #1790 <String "IMEI was not collected.">
	//*1103 2691:invokestatic    #308 <Method void AFLogger.afInfoLog(String)>
	//*1104 2694:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//*1105 2697:ldc2            #1792 <String "collectAndroidId">
	//*1106 2700:iconst_1        
	//*1107 2701:invokevirtual   #339 <Method boolean AppsFlyerProperties.getBoolean(String, boolean)>
	//*1108 2704:istore          6
	//*1109 2706:aload           16
	//*1110 2708:ldc2            #1794 <String "androidIdCached">
	//*1111 2711:aconst_null     
	//*1112 2712:invokeinterface #793 <Method String SharedPreferences.getString(String, String)>
	//*1113 2717:astore_2        
	//*1114 2718:iload           6
	//*1115 2720:ifeq            2831
	//*1116 2723:getstatic       #288 <Field int android.os.Build$VERSION.SDK_INT>
	//*1117 2726:bipush          19
	//*1118 2728:icmplt          2751
	//*1119 2731:aload_1         
	//*1120 2732:invokestatic    #1771 <Method boolean _mth0971(Context)>
	//*1121 2735:istore          6
	//*1122 2737:iload           6
	//*1123 2739:ifne            2745
	//*1124 2742:goto            2751
	//*1125 2745:iconst_0        
	//*1126 2746:istore          10
	//*1127 2748:goto            2754
	//*1128 2751:iconst_1        
	//*1129 2752:istore          10
	//*1130 2754:iload           10
	//*1131 2756:ifeq            2816
	//*1132 2759:aload_1         
	//*1133 2760:invokevirtual   #1757 <Method ContentResolver Context.getContentResolver()>
	//*1134 2763:ldc2            #1796 <String "android_id">
	//*1135 2766:invokestatic    #1801 <Method String android.provider.Settings$Secure.getString(ContentResolver, String)>
	//*1136 2769:astore          4
	//*1137 2771:aload           4
	//*1138 2773:ifnull          2782
	//*1139 2776:aload           4
	//*1140 2778:astore_2        
	//*1141 2779:goto            2841
	//*1142 2782:aload_0         
	//*1143 2783:getfield        #1803 <Field String _fld02CB>
	//*1144 2786:ifnull          2797
	//*1145 2789:aload_0         
	//*1146 2790:getfield        #1803 <Field String _fld02CB>
	//*1147 2793:astore_2        
	//*1148 2794:goto            2841
	//*1149 2797:aload_2         
	//*1150 2798:ifnull          5151
	//*1151 2801:goto            2841
	//*1152 2804:astore_2        
	//*1153 2805:aload_2         
	//*1154 2806:invokevirtual   #817 <Method String Throwable.getMessage()>
	//*1155 2809:aload_2         
	//*1156 2810:invokestatic    #245 <Method void AFLogger.afErrorLog(String, Throwable)>
	//*1157 2813:goto            5151
	//*1158 2816:aload_0         
	//*1159 2817:getfield        #1803 <Field String _fld02CB>
	//*1160 2820:ifnull          5151
	//*1161 2823:aload_0         
	//*1162 2824:getfield        #1803 <Field String _fld02CB>
	//*1163 2827:astore_2        
	//*1164 2828:goto            2841
	//*1165 2831:aload_0         
	//*1166 2832:getfield        #1803 <Field String _fld02CB>
	//*1167 2835:ifnull          5151
	//*1168 2838:goto            2823
	//*1169 2841:aload_2         
	//*1170 2842:ifnull          2868
	//*1171 2845:aload_1         
	//*1172 2846:ldc2            #1794 <String "androidIdCached">
	//*1173 2849:aload_2         
	//*1174 2850:invokestatic    #332 <Method void _mth02CF(Context, String, String)>
	//*1175 2853:aload           18
	//*1176 2855:ldc2            #1796 <String "android_id">
	//*1177 2858:aload_2         
	//*1178 2859:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//*1179 2864:pop             
	//*1180 2865:goto            2874
	//*1181 2868:ldc2            #1805 <String "Android ID was not collected.">
	//*1182 2871:invokestatic    #308 <Method void AFLogger.afInfoLog(String)>
	//*1183 2874:new             #413 <Class WeakReference>
	//*1184 2877:dup             
	//*1185 2878:aload_1         
	//*1186 2879:invokespecial   #416 <Method void WeakReference(Object)>
	//*1187 2882:invokestatic    #1298 <Method String q._mth02CB(WeakReference)>
	//*1188 2885:astore_2        
	//*1189 2886:aload_2         
	//*1190 2887:ifnull          2937
	//*1191 2890:aload           18
	//*1192 2892:ldc2            #1807 <String "uid">
	//*1193 2895:aload_2         
	//*1194 2896:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//*1195 2901:pop             
	//*1196 2902:goto            2937
	//*1197 2905:astore_2        
	//*1198 2906:new             #95  <Class StringBuilder>
	//*1199 2909:dup             
	//*1200 2910:ldc2            #1809 <String "ERROR: could not get uid ">
	//*1201 2913:invokespecial   #115 <Method void StringBuilder(String)>
	//*1202 2916:astore          4
	//*1203 2918:aload           4
	//*1204 2920:aload_2         
	//*1205 2921:invokevirtual   #817 <Method String Throwable.getMessage()>
	//*1206 2924:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//*1207 2927:pop             
	//*1208 2928:aload           4
	//*1209 2930:invokevirtual   #108 <Method String Object.toString()>
	//*1210 2933:aload_2         
	//*1211 2934:invokestatic    #245 <Method void AFLogger.afErrorLog(String, Throwable)>
	//*1212 2937:aload           18
	//*1213 2939:ldc2            #1811 <String "lang">
	//*1214 2942:invokestatic    #1815 <Method Locale Locale.getDefault()>
	//*1215 2945:invokevirtual   #1818 <Method String Locale.getDisplayLanguage()>
	//*1216 2948:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//*1217 2953:pop             
	//*1218 2954:goto            2965
	//*1219 2957:astore_2        
	//*1220 2958:ldc2            #1820 <String "Exception while collecting display language name. ">
	//*1221 2961:aload_2         
	//*1222 2962:invokestatic    #245 <Method void AFLogger.afErrorLog(String, Throwable)>
	//*1223 2965:aload           18
	//*1224 2967:ldc2            #1822 <String "lang_code">
	//*1225 2970:invokestatic    #1815 <Method Locale Locale.getDefault()>
	//*1226 2973:invokevirtual   #1825 <Method String Locale.getLanguage()>
	//*1227 2976:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//*1228 2981:pop             
	//*1229 2982:goto            2993
	//*1230 2985:astore_2        
	//*1231 2986:ldc2            #1827 <String "Exception while collecting display language code. ">
	//*1232 2989:aload_2         
	//*1233 2990:invokestatic    #245 <Method void AFLogger.afErrorLog(String, Throwable)>
	//*1234 2993:aload           18
	//*1235 2995:ldc2            #1829 <String "country">
	//*1236 2998:invokestatic    #1815 <Method Locale Locale.getDefault()>
	//*1237 3001:invokevirtual   #1832 <Method String Locale.getCountry()>
	//*1238 3004:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//*1239 3009:pop             
	//*1240 3010:goto            3021
	//*1241 3013:astore_2        
	//*1242 3014:ldc2            #1834 <String "Exception while collecting country name. ">
	//*1243 3017:aload_2         
	//*1244 3018:invokestatic    #245 <Method void AFLogger.afErrorLog(String, Throwable)>
	//*1245 3021:aload           18
	//*1246 3023:ldc2            #1836 <String "platformextension">
	//*1247 3026:aload_0         
	//*1248 3027:getfield        #193 <Field r _fld02CD>
	//*1249 3030:invokevirtual   #1838 <Method String r._mth02CE()>
	//*1250 3033:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//*1251 3038:pop             
	//*1252 3039:aload_1         
	//*1253 3040:aload           18
	//*1254 3042:invokestatic    #1840 <Method void _mth02CB(Context, Map)>
	//*1255 3045:new             #936 <Class SimpleDateFormat>
	//*1256 3048:dup             
	//*1257 3049:ldc2            #1842 <String "yyyy-MM-dd_HHmmssZ">
	//*1258 3052:getstatic       #944 <Field Locale Locale.US>
	//*1259 3055:invokespecial   #947 <Method void SimpleDateFormat(String, Locale)>
	//*1260 3058:astore          16
	//*1261 3060:getstatic       #288 <Field int android.os.Build$VERSION.SDK_INT>
	//*1262 3063:istore          10
	//*1263 3065:iload           10
	//*1264 3067:bipush          9
	//*1265 3069:icmplt          3136
	//*1266 3072:aload_1         
	//*1267 3073:invokevirtual   #930 <Method PackageManager Context.getPackageManager()>
	//*1268 3076:aload_1         
	//*1269 3077:invokevirtual   #577 <Method String Context.getPackageName()>
	//*1270 3080:iconst_0        
	//*1271 3081:invokevirtual   #934 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//*1272 3084:getfield        #952 <Field long PackageInfo.firstInstallTime>
	//*1273 3087:lstore          12
	//*1274 3089:aload           16
	//*1275 3091:ldc2            #954 <String "UTC">
	//*1276 3094:invokestatic    #960 <Method TimeZone TimeZone.getTimeZone(String)>
	//*1277 3097:invokevirtual   #966 <Method void DateFormat.setTimeZone(TimeZone)>
	//*1278 3100:aload           18
	//*1279 3102:ldc2            #1844 <String "installDate">
	//*1280 3105:aload           16
	//*1281 3107:new             #968 <Class Date>
	//*1282 3110:dup             
	//*1283 3111:lload           12
	//*1284 3113:invokespecial   #971 <Method void Date(long)>
	//*1285 3116:invokevirtual   #975 <Method String DateFormat.format(Date)>
	//*1286 3119:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//*1287 3124:pop             
	//*1288 3125:goto            3136
	//*1289 3128:astore_2        
	//*1290 3129:ldc2            #1846 <String "Exception while collecting install date. ">
	//*1291 3132:aload_2         
	//*1292 3133:invokestatic    #245 <Method void AFLogger.afErrorLog(String, Throwable)>
	//*1293 3136:aload_1         
	//*1294 3137:invokevirtual   #930 <Method PackageManager Context.getPackageManager()>
	//*1295 3140:aload_1         
	//*1296 3141:invokevirtual   #577 <Method String Context.getPackageName()>
	//*1297 3144:iconst_0        
	//*1298 3145:invokevirtual   #934 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//*1299 3148:astore_2        
	//*1300 3149:aload           7
	//*1301 3151:ldc2            #1848 <String "versionCode">
	//*1302 3154:iconst_0        
	//*1303 3155:invokeinterface #780 <Method int SharedPreferences.getInt(String, int)>
	//*1304 3160:istore          10
	//*1305 3162:aload_2         
	//*1306 3163:getfield        #1850 <Field int PackageInfo.versionCode>
	//*1307 3166:iload           10
	//*1308 3168:icmple          3190
	//*1309 3171:aload_1         
	//*1310 3172:ldc2            #776 <String "appsflyerConversionDataRequestRetries">
	//*1311 3175:iconst_0        
	//*1312 3176:invokestatic    #1204 <Method void _mth02CE(Context, String, int)>
	//*1313 3179:aload_1         
	//*1314 3180:ldc2            #1848 <String "versionCode">
	//*1315 3183:aload_2         
	//*1316 3184:getfield        #1850 <Field int PackageInfo.versionCode>
	//*1317 3187:invokestatic    #1204 <Method void _mth02CE(Context, String, int)>
	//*1318 3190:aload           18
	//*1319 3192:ldc2            #1852 <String "app_version_code">
	//*1320 3195:aload_2         
	//*1321 3196:getfield        #1850 <Field int PackageInfo.versionCode>
	//*1322 3199:invokestatic    #703 <Method String Integer.toString(int)>
	//*1323 3202:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//*1324 3207:pop             
	//*1325 3208:aload           18
	//*1326 3210:ldc2            #1854 <String "app_version_name">
	//*1327 3213:aload_2         
	//*1328 3214:getfield        #1857 <Field String PackageInfo.versionName>
	//*1329 3217:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//*1330 3222:pop             
	//*1331 3223:getstatic       #288 <Field int android.os.Build$VERSION.SDK_INT>
	//*1332 3226:bipush          9
	//*1333 3228:icmplt          3433
	//*1334 3231:aload_2         
	//*1335 3232:getfield        #952 <Field long PackageInfo.firstInstallTime>
	//*1336 3235:lstore          12
	//*1337 3237:aload_2         
	//*1338 3238:getfield        #1860 <Field long PackageInfo.lastUpdateTime>
	//*1339 3241:lstore          14
	//*1340 3243:aload           16
	//*1341 3245:ldc2            #954 <String "UTC">
	//*1342 3248:invokestatic    #960 <Method TimeZone TimeZone.getTimeZone(String)>
	//*1343 3251:invokevirtual   #966 <Method void DateFormat.setTimeZone(TimeZone)>
	//*1344 3254:aload           18
	//*1345 3256:ldc2            #1862 <String "date1">
	//*1346 3259:aload           16
	//*1347 3261:new             #968 <Class Date>
	//*1348 3264:dup             
	//*1349 3265:lload           12
	//*1350 3267:invokespecial   #971 <Method void Date(long)>
	//*1351 3270:invokevirtual   #975 <Method String DateFormat.format(Date)>
	//*1352 3273:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//*1353 3278:pop             
	//*1354 3279:aload           16
	//*1355 3281:ldc2            #954 <String "UTC">
	//*1356 3284:invokestatic    #960 <Method TimeZone TimeZone.getTimeZone(String)>
	//*1357 3287:invokevirtual   #966 <Method void DateFormat.setTimeZone(TimeZone)>
	//*1358 3290:aload           18
	//*1359 3292:ldc2            #1864 <String "date2">
	//*1360 3295:aload           16
	//*1361 3297:new             #968 <Class Date>
	//*1362 3300:dup             
	//*1363 3301:lload           14
	//*1364 3303:invokespecial   #971 <Method void Date(long)>
	//*1365 3306:invokevirtual   #975 <Method String DateFormat.format(Date)>
	//*1366 3309:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//*1367 3314:pop             
	//*1368 3315:aload_1         
	//*1369 3316:ldc2            #534 <String "appsflyer-data">
	//*1370 3319:iconst_0        
	//*1371 3320:invokevirtual   #538 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//*1372 3323:ldc2            #1866 <String "appsFlyerFirstInstall">
	//*1373 3326:aconst_null     
	//*1374 3327:invokeinterface #793 <Method String SharedPreferences.getString(String, String)>
	//*1375 3332:astore          4
	//*1376 3334:aload           4
	//*1377 3336:astore_2        
	//*1378 3337:aload           4
	//*1379 3339:ifnonnull       3393
	//*1380 3342:aload_1         
	//*1381 3343:ldc2            #534 <String "appsflyer-data">
	//*1382 3346:iconst_0        
	//*1383 3347:invokevirtual   #538 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//*1384 3350:ldc2            #579 <String "appsFlyerCount">
	//*1385 3353:invokeinterface #1181 <Method boolean SharedPreferences.contains(String)>
	//*1386 3358:iconst_1        
	//*1387 3359:ixor            
	//*1388 3360:ifeq            5156
	//*1389 3363:ldc2            #1868 <String "AppsFlyer: first launch detected">
	//*1390 3366:invokestatic    #532 <Method void AFLogger.afDebugLog(String)>
	//*1391 3369:aload           16
	//*1392 3371:new             #968 <Class Date>
	//*1393 3374:dup             
	//*1394 3375:invokespecial   #1489 <Method void Date()>
	//*1395 3378:invokevirtual   #975 <Method String DateFormat.format(Date)>
	//*1396 3381:astore_2        
	//*1397 3382:goto            3385
	//*1398 3385:aload_1         
	//*1399 3386:ldc2            #1866 <String "appsFlyerFirstInstall">
	//*1400 3389:aload_2         
	//*1401 3390:invokestatic    #332 <Method void _mth02CF(Context, String, String)>
	//*1402 3393:ldc2            #1870 <String "AppsFlyer: first launch date: ">
	//*1403 3396:aload_2         
	//*1404 3397:invokestatic    #712 <Method String String.valueOf(Object)>
	//*1405 3400:invokevirtual   #697 <Method String String.concat(String)>
	//*1406 3403:invokestatic    #308 <Method void AFLogger.afInfoLog(String)>
	//*1407 3406:aload           18
	//*1408 3408:ldc2            #1872 <String "firstLaunchDate">
	//*1409 3411:aload_2         
	//*1410 3412:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//*1411 3417:pop             
	//*1412 3418:goto            3433
	//*1413 3421:astore_2        
	//*1414 3422:goto            3426
	//*1415 3425:astore_2        
	//*1416 3426:ldc2            #1874 <String "Exception while collecting app version data ">
	//*1417 3429:aload_2         
	//*1418 3430:invokestatic    #245 <Method void AFLogger.afErrorLog(String, Throwable)>
	//*1419 3433:aload           5
	//*1420 3435:invokevirtual   #567 <Method int String.length()>
	//*1421 3438:ifle            3454
	//*1422 3441:aload           18
	//*1423 3443:ldc2            #1460 <String "referrer">
	//*1424 3446:aload           5
	//*1425 3448:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//*1426 3453:pop             
	//*1427 3454:aload           7
	//*1428 3456:ldc2            #1114 <String "extraReferrers">
	//*1429 3459:aconst_null     
	//*1430 3460:invokeinterface #793 <Method String SharedPreferences.getString(String, String)>
	//*1431 3465:astore_2        
	//*1432 3466:aload_2         
	//*1433 3467:ifnull          3482
	//*1434 3470:aload           18
	//*1435 3472:ldc2            #1114 <String "extraReferrers">
	//*1436 3475:aload_2         
	//*1437 3476:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//*1438 3481:pop             
	//*1439 3482:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//*1440 3485:ldc2            #707 <String "afUninstallToken">
	//*1441 3488:invokevirtual   #258 <Method String AppsFlyerProperties.getString(String)>
	//*1442 3491:astore_2        
	//*1443 3492:aload_2         
	//*1444 3493:ifnull          3514
	//*1445 3496:aload           18
	//*1446 3498:ldc2            #1876 <String "af_gcm_token">
	//*1447 3501:aload_2         
	//*1448 3502:invokestatic    #1879 <Method d d._mth02CA(String)>
	//*1449 3505:invokevirtual   #1880 <Method String d._mth0971()>
	//*1450 3508:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//*1451 3513:pop             
	//*1452 3514:aload_0         
	//*1453 3515:aload_1         
	//*1454 3516:invokestatic    #1882 <Method boolean y._mth02CA(Context)>
	//*1455 3519:putfield        #1884 <Field boolean _fld02CE02CE>
	//*1456 3522:new             #95  <Class StringBuilder>
	//*1457 3525:dup             
	//*1458 3526:ldc2            #1886 <String "didConfigureTokenRefreshService=">
	//*1459 3529:invokespecial   #115 <Method void StringBuilder(String)>
	//*1460 3532:astore_2        
	//*1461 3533:aload_2         
	//*1462 3534:aload_0         
	//*1463 3535:getfield        #1884 <Field boolean _fld02CE02CE>
	//*1464 3538:invokevirtual   #1889 <Method StringBuilder StringBuilder.append(boolean)>
	//*1465 3541:pop             
	//*1466 3542:aload_2         
	//*1467 3543:invokevirtual   #108 <Method String Object.toString()>
	//*1468 3546:invokestatic    #532 <Method void AFLogger.afDebugLog(String)>
	//*1469 3549:aload_0         
	//*1470 3550:getfield        #1884 <Field boolean _fld02CE02CE>
	//*1471 3553:ifne            5163
	//*1472 3556:aload           18
	//*1473 3558:ldc2            #1891 <String "tokenRefreshConfigured">
	//*1474 3561:getstatic       #1895 <Field Boolean Boolean.FALSE>
	//*1475 3564:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//*1476 3569:pop             
	//*1477 3570:goto            3573
	//*1478 3573:iload           8
	//*1479 3575:ifeq            3647
	//*1480 3578:aload_0         
	//*1481 3579:getfield        #1897 <Field String _fld02CA141D>
	//*1482 3582:ifnull          5166
	//*1483 3585:aload_0         
	//*1484 3586:getfield        #1897 <Field String _fld02CA141D>
	//*1485 3589:invokestatic    #890 <Method JSONObject JSONObjectInstrumentation.init(String)>
	//*1486 3592:astore_2        
	//*1487 3593:aload_2         
	//*1488 3594:ldc2            #1899 <String "isPush">
	//*1489 3597:ldc2            #362 <String "true">
	//*1490 3600:invokevirtual   #896 <Method JSONObject JSONObject.put(String, Object)>
	//*1491 3603:pop             
	//*1492 3604:aload_2         
	//*1493 3605:instanceof      #771 <Class JSONObject>
	//*1494 3608:ifne            3619
	//*1495 3611:aload_2         
	//*1496 3612:invokevirtual   #897 <Method String JSONObject.toString()>
	//*1497 3615:astore_2        
	//*1498 3616:goto            3627
	//*1499 3619:aload_2         
	//*1500 3620:checkcast       #771 <Class JSONObject>
	//*1501 3623:invokestatic    #900 <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//*1502 3626:astore_2        
	//*1503 3627:aload           18
	//*1504 3629:ldc2            #430 <String "af_deeplink">
	//*1505 3632:aload_2         
	//*1506 3633:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//*1507 3638:pop             
	//*1508 3639:goto            3642
	//*1509 3642:aload_0         
	//*1510 3643:aconst_null     
	//*1511 3644:putfield        #1897 <Field String _fld02CA141D>
	//*1512 3647:iload           8
	//*1513 3649:ifeq            3713
	//*1514 3652:aload           9
	//*1515 3654:ifnull          5169
	//*1516 3657:ldc2            #1901 <String "android.intent.action.VIEW">
	//*1517 3660:aload           9
	//*1518 3662:invokevirtual   #1904 <Method String Intent.getAction()>
	//*1519 3665:invokevirtual   #451 <Method boolean Object.equals(Object)>
	//*1520 3668:ifeq            5169
	//*1521 3671:aload           9
	//*1522 3673:invokevirtual   #1908 <Method Uri Intent.getData()>
	//*1523 3676:astore_2        
	//*1524 3677:goto            3680
	//*1525 3680:aload_2         
	//*1526 3681:ifnull          3695
	//*1527 3684:aload_0         
	//*1528 3685:aload_1         
	//*1529 3686:aload           18
	//*1530 3688:aload_2         
	//*1531 3689:invokespecial   #1910 <Method void _mth02CA(Context, Map, Uri)>
	//*1532 3692:goto            3713
	//*1533 3695:aload_0         
	//*1534 3696:getfield        #184 <Field Uri _fld02BE>
	//*1535 3699:ifnull          3713
	//*1536 3702:aload_0         
	//*1537 3703:aload_1         
	//*1538 3704:aload           18
	//*1539 3706:aload_0         
	//*1540 3707:getfield        #184 <Field Uri _fld02BE>
	//*1541 3710:invokespecial   #1910 <Method void _mth02CA(Context, Map, Uri)>
	//*1542 3713:aload_0         
	//*1543 3714:getfield        #188 <Field boolean _fld02CB02CA>
	//*1544 3717:ifeq            3801
	//*1545 3720:aload           18
	//*1546 3722:ldc2            #1912 <String "testAppMode_retargeting">
	//*1547 3725:ldc2            #362 <String "true">
	//*1548 3728:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//*1549 3733:pop             
	//*1550 3734:new             #771 <Class JSONObject>
	//*1551 3737:dup             
	//*1552 3738:aload           18
	//*1553 3740:invokespecial   #1437 <Method void JSONObject(Map)>
	//*1554 3743:astore_2        
	//*1555 3744:aload_2         
	//*1556 3745:instanceof      #771 <Class JSONObject>
	//*1557 3748:ifne            3759
	//*1558 3751:aload_2         
	//*1559 3752:invokevirtual   #897 <Method String JSONObject.toString()>
	//*1560 3755:astore_2        
	//*1561 3756:goto            3767
	//*1562 3759:aload_2         
	//*1563 3760:checkcast       #771 <Class JSONObject>
	//*1564 3763:invokestatic    #900 <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//*1565 3766:astore_2        
	//*1566 3767:new             #341 <Class Intent>
	//*1567 3770:dup             
	//*1568 3771:ldc2            #1914 <String "com.appsflyer.testIntgrationBroadcast">
	//*1569 3774:invokespecial   #344 <Method void Intent(String)>
	//*1570 3777:astore          4
	//*1571 3779:aload           4
	//*1572 3781:ldc2            #1916 <String "params">
	//*1573 3784:aload_2         
	//*1574 3785:invokevirtual   #356 <Method Intent Intent.putExtra(String, String)>
	//*1575 3788:pop             
	//*1576 3789:aload_1         
	//*1577 3790:aload           4
	//*1578 3792:invokevirtual   #386 <Method void Context.sendBroadcast(Intent)>
	//*1579 3795:ldc2            #1918 <String "Sent retargeting params to test app">
	//*1580 3798:invokestatic    #308 <Method void AFLogger.afInfoLog(String)>
	//*1581 3801:invokestatic    #318 <Method long System.currentTimeMillis()>
	//*1582 3804:lstore          12
	//*1583 3806:aload_0         
	//*1584 3807:getfield        #1474 <Field long _fld02C9>
	//*1585 3810:lstore          14
	//*1586 3812:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//*1587 3815:aload_1         
	//*1588 3816:invokevirtual   #1440 <Method String AppsFlyerProperties.getReferrer(Context)>
	//*1589 3819:astore_2        
	//*1590 3820:lload           12
	//*1591 3822:lload           14
	//*1592 3824:lsub            
	//*1593 3825:ldc2w           #1919 <Long 30000L>
	//*1594 3828:lcmp            
	//*1595 3829:ifgt            5174
	//*1596 3832:aload_2         
	//*1597 3833:ifnull          5174
	//*1598 3836:aload_2         
	//*1599 3837:ldc2            #447 <String "AppsFlyer_Test">
	//*1600 3840:invokevirtual   #1922 <Method boolean String.contains(CharSequence)>
	//*1601 3843:ifeq            5174
	//*1602 3846:iconst_1        
	//*1603 3847:istore          10
	//*1604 3849:goto            3852
	//*1605 3852:iload           10
	//*1606 3854:ifeq            3949
	//*1607 3857:aload           18
	//*1608 3859:ldc2            #1924 <String "testAppMode">
	//*1609 3862:ldc2            #362 <String "true">
	//*1610 3865:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//*1611 3870:pop             
	//*1612 3871:new             #771 <Class JSONObject>
	//*1613 3874:dup             
	//*1614 3875:aload           18
	//*1615 3877:invokespecial   #1437 <Method void JSONObject(Map)>
	//*1616 3880:astore_2        
	//*1617 3881:aload_2         
	//*1618 3882:instanceof      #771 <Class JSONObject>
	//*1619 3885:ifne            3896
	//*1620 3888:aload_2         
	//*1621 3889:invokevirtual   #897 <Method String JSONObject.toString()>
	//*1622 3892:astore_2        
	//*1623 3893:goto            3904
	//*1624 3896:aload_2         
	//*1625 3897:checkcast       #771 <Class JSONObject>
	//*1626 3900:invokestatic    #900 <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//*1627 3903:astore_2        
	//*1628 3904:new             #341 <Class Intent>
	//*1629 3907:dup             
	//*1630 3908:ldc2            #1914 <String "com.appsflyer.testIntgrationBroadcast">
	//*1631 3911:invokespecial   #344 <Method void Intent(String)>
	//*1632 3914:astore          4
	//*1633 3916:aload           4
	//*1634 3918:ldc2            #1916 <String "params">
	//*1635 3921:aload_2         
	//*1636 3922:invokevirtual   #356 <Method Intent Intent.putExtra(String, String)>
	//*1637 3925:pop             
	//*1638 3926:aload_1         
	//*1639 3927:aload           4
	//*1640 3929:invokevirtual   #386 <Method void Context.sendBroadcast(Intent)>
	//*1641 3932:ldc2            #1926 <String "Sent params to test app">
	//*1642 3935:invokestatic    #308 <Method void AFLogger.afInfoLog(String)>
	//*1643 3938:ldc2            #1928 <String "Test mode ended!">
	//*1644 3941:invokestatic    #308 <Method void AFLogger.afInfoLog(String)>
	//*1645 3944:aload_0         
	//*1646 3945:lconst_0        
	//*1647 3946:putfield        #1474 <Field long _fld02C9>
	//*1648 3949:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//*1649 3952:ldc2            #1930 <String "advertiserId">
	//*1650 3955:invokevirtual   #258 <Method String AppsFlyerProperties.getString(String)>
	//*1651 3958:ifnonnull       4010
	//*1652 3961:aload_1         
	//*1653 3962:aload           18
	//*1654 3964:invokestatic    #1488 <Method void o._mth02CA(Context, Map)>
	//*1655 3967:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//*1656 3970:ldc2            #1930 <String "advertiserId">
	//*1657 3973:invokevirtual   #258 <Method String AppsFlyerProperties.getString(String)>
	//*1658 3976:ifnull          3996
	//*1659 3979:aload           18
	//*1660 3981:ldc2            #1932 <String "GAID_retry">
	//*1661 3984:ldc2            #362 <String "true">
	//*1662 3987:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//*1663 3992:pop             
	//*1664 3993:goto            4010
	//*1665 3996:aload           18
	//*1666 3998:ldc2            #1932 <String "GAID_retry">
	//*1667 4001:ldc2            #1934 <String "false">
	//*1668 4004:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//*1669 4009:pop             
	//*1670 4010:aload_1         
	//*1671 4011:invokevirtual   #1757 <Method ContentResolver Context.getContentResolver()>
	//*1672 4014:invokestatic    #1937 <Method k o._mth0971(ContentResolver)>
	//*1673 4017:astore_2        
	//*1674 4018:aload_2         
	//*1675 4019:ifnull          4055
	//*1676 4022:aload           18
	//*1677 4024:ldc2            #1939 <String "amazon_aid">
	//*1678 4027:aload_2         
	//*1679 4028:invokevirtual   #1943 <Method String k._mth02CA()>
	//*1680 4031:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//*1681 4036:pop             
	//*1682 4037:aload           18
	//*1683 4039:ldc2            #1945 <String "amazon_aid_limit">
	//*1684 4042:aload_2         
	//*1685 4043:invokevirtual   #1946 <Method boolean k._mth02CE()>
	//*1686 4046:invokestatic    #1399 <Method String String.valueOf(boolean)>
	//*1687 4049:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//*1688 4054:pop             
	//*1689 4055:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//*1690 4058:aload_1         
	//*1691 4059:invokevirtual   #1440 <Method String AppsFlyerProperties.getReferrer(Context)>
	//*1692 4062:astore_2        
	//*1693 4063:aload_2         
	//*1694 4064:ifnull          4099
	//*1695 4067:aload_2         
	//*1696 4068:invokevirtual   #567 <Method int String.length()>
	//*1697 4071:ifle            4099
	//*1698 4074:aload           18
	//*1699 4076:ldc2            #1460 <String "referrer">
	//*1700 4079:invokeinterface #564 <Method Object Map.get(Object)>
	//*1701 4084:ifnonnull       4099
	//*1702 4087:aload           18
	//*1703 4089:ldc2            #1460 <String "referrer">
	//*1704 4092:aload_2         
	//*1705 4093:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//*1706 4098:pop             
	//*1707 4099:ldc2            #362 <String "true">
	//*1708 4102:aload           7
	//*1709 4104:ldc2            #759 <String "sentSuccessfully">
	//*1710 4107:ldc2            #922 <String "">
	//*1711 4110:invokeinterface #793 <Method String SharedPreferences.getString(String, String)>
	//*1712 4115:invokevirtual   #451 <Method boolean Object.equals(Object)>
	//*1713 4118:istore          11
	//*1714 4120:aload           18
	//*1715 4122:ldc2            #1948 <String "registeredUninstall">
	//*1716 4125:aload           7
	//*1717 4127:ldc2            #714 <String "sentRegisterRequestToAF">
	//*1718 4130:iconst_0        
	//*1719 4131:invokeinterface #717 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//*1720 4136:invokestatic    #1951 <Method Boolean Boolean.valueOf(boolean)>
	//*1721 4139:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//*1722 4144:pop             
	//*1723 4145:aload           7
	//*1724 4147:ldc2            #579 <String "appsFlyerCount">
	//*1725 4150:iload           8
	//*1726 4152:invokestatic    #582 <Method int _mth02CE(SharedPreferences, String, boolean)>
	//*1727 4155:istore          10
	//*1728 4157:aload           18
	//*1729 4159:ldc2            #1953 <String "counter">
	//*1730 4162:iload           10
	//*1731 4164:invokestatic    #703 <Method String Integer.toString(int)>
	//*1732 4167:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//*1733 4172:pop             
	//*1734 4173:aload_3         
	//*1735 4174:ifnull          5180
	//*1736 4177:iconst_1        
	//*1737 4178:istore          6
	//*1738 4180:goto            4183
	//*1739 4183:aload           18
	//*1740 4185:ldc2            #1955 <String "iaecounter">
	//*1741 4188:aload           7
	//*1742 4190:ldc2            #1957 <String "appsFlyerInAppEventCount">
	//*1743 4193:iload           6
	//*1744 4195:invokestatic    #582 <Method int _mth02CE(SharedPreferences, String, boolean)>
	//*1745 4198:invokestatic    #703 <Method String Integer.toString(int)>
	//*1746 4201:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//*1747 4206:pop             
	//*1748 4207:iload           8
	//*1749 4209:ifeq            5189
	//*1750 4212:iload           10
	//*1751 4214:iconst_1        
	//*1752 4215:icmpne          5189
	//*1753 4218:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//*1754 4221:invokevirtual   #1959 <Method void AppsFlyerProperties.setFirstLaunchCalled()>
	//*1755 4224:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//*1756 4227:ldc2            #389 <String "waitForCustomerId">
	//*1757 4230:iconst_0        
	//*1758 4231:invokevirtual   #339 <Method boolean AppsFlyerProperties.getBoolean(String, boolean)>
	//*1759 4234:ifeq            5186
	//*1760 4237:aload           18
	//*1761 4239:ldc2            #1961 <String "wait_cid">
	//*1762 4242:iconst_1        
	//*1763 4243:invokestatic    #811 <Method String Boolean.toString(boolean)>
	//*1764 4246:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//*1765 4251:pop             
	//*1766 4252:goto            5189
	//*1767 4255:aload           18
	//*1768 4257:ldc2            #1963 <String "isFirstCall">
	//*1769 4260:iload           6
	//*1770 4262:invokestatic    #811 <Method String Boolean.toString(boolean)>
	//*1771 4265:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//*1772 4270:pop             
	//*1773 4271:new             #480 <Class HashMap>
	//*1774 4274:dup             
	//*1775 4275:invokespecial   #481 <Method void HashMap()>
	//*1776 4278:astore_2        
	//*1777 4279:aload_2         
	//*1778 4280:ldc2            #1965 <String "cpu_abi">
	//*1779 4283:ldc2            #1967 <String "ro.product.cpu.abi">
	//*1780 4286:invokestatic    #1695 <Method String _mth02CE(String)>
	//*1781 4289:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//*1782 4294:pop             
	//*1783 4295:aload_2         
	//*1784 4296:ldc2            #1969 <String "cpu_abi2">
	//*1785 4299:ldc2            #1971 <String "ro.product.cpu.abi2">
	//*1786 4302:invokestatic    #1695 <Method String _mth02CE(String)>
	//*1787 4305:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//*1788 4310:pop             
	//*1789 4311:aload_2         
	//*1790 4312:ldc2            #1973 <String "arch">
	//*1791 4315:ldc2            #1975 <String "os.arch">
	//*1792 4318:invokestatic    #1695 <Method String _mth02CE(String)>
	//*1793 4321:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//*1794 4326:pop             
	//*1795 4327:aload_2         
	//*1796 4328:ldc2            #1977 <String "build_display_id">
	//*1797 4331:ldc2            #1979 <String "ro.build.display.id">
	//*1798 4334:invokestatic    #1695 <Method String _mth02CE(String)>
	//*1799 4337:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//*1800 4342:pop             
	//*1801 4343:iload           8
	//*1802 4345:ifeq            4534
	//*1803 4348:aload_0         
	//*1804 4349:getfield        #186 <Field boolean _fld02CA02CA>
	//*1805 4352:ifeq            4454
	//*1806 4355:getstatic       #1984 <Field c c$c._fld02CA>
	//*1807 4358:astore_3        
	//*1808 4359:aload_1         
	//*1809 4360:invokestatic    #1989 <Method Location c._mth02CB(Context)>
	//*1810 4363:astore_3        
	//*1811 4364:new             #480 <Class HashMap>
	//*1812 4367:dup             
	//*1813 4368:iconst_3        
	//*1814 4369:invokespecial   #1990 <Method void HashMap(int)>
	//*1815 4372:astore          4
	//*1816 4374:aload_3         
	//*1817 4375:ifnull          4432
	//*1818 4378:aload           4
	//*1819 4380:ldc2            #1992 <String "lat">
	//*1820 4383:aload_3         
	//*1821 4384:invokevirtual   #1998 <Method double Location.getLatitude()>
	//*1822 4387:invokestatic    #2001 <Method String String.valueOf(double)>
	//*1823 4390:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//*1824 4395:pop             
	//*1825 4396:aload           4
	//*1826 4398:ldc2            #2003 <String "lon">
	//*1827 4401:aload_3         
	//*1828 4402:invokevirtual   #2006 <Method double Location.getLongitude()>
	//*1829 4405:invokestatic    #2001 <Method String String.valueOf(double)>
	//*1830 4408:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//*1831 4413:pop             
	//*1832 4414:aload           4
	//*1833 4416:ldc2            #2008 <String "ts">
	//*1834 4419:aload_3         
	//*1835 4420:invokevirtual   #2009 <Method long Location.getTime()>
	//*1836 4423:invokestatic    #2011 <Method String String.valueOf(long)>
	//*1837 4426:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//*1838 4431:pop             
	//*1839 4432:aload           4
	//*1840 4434:invokeinterface #2013 <Method boolean Map.isEmpty()>
	//*1841 4439:ifne            4454
	//*1842 4442:aload_2         
	//*1843 4443:ldc2            #2015 <String "loc">
	//*1844 4446:aload           4
	//*1845 4448:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//*1846 4453:pop             
	//*1847 4454:getstatic       #2020 <Field b b$e._fld0971>
	//*1848 4457:aload_1         
	//*1849 4458:invokevirtual   #2025 <Method b$a b._mth02CF(Context)>
	//*1850 4461:astore_3        
	//*1851 4462:aload_2         
	//*1852 4463:ldc2            #2027 <String "btl">
	//*1853 4466:aload_3         
	//*1854 4467:invokevirtual   #2032 <Method float b$a._mth02CF()>
	//*1855 4470:invokestatic    #2036 <Method String Float.toString(float)>
	//*1856 4473:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//*1857 4478:pop             
	//*1858 4479:aload_3         
	//*1859 4480:invokevirtual   #2037 <Method String b$a._mth0971()>
	//*1860 4483:ifnull          4500
	//*1861 4486:aload_2         
	//*1862 4487:ldc2            #2039 <String "btch">
	//*1863 4490:aload_3         
	//*1864 4491:invokevirtual   #2037 <Method String b$a._mth0971()>
	//*1865 4494:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//*1866 4499:pop             
	//*1867 4500:iconst_2        
	//*1868 4501:iload           10
	//*1869 4503:icmplt          4534
	//*1870 4506:aload_1         
	//*1871 4507:invokestatic    #2044 <Method g g._mth0971(Context)>
	//*1872 4510:invokevirtual   #2046 <Method List g._mth02CB()>
	//*1873 4513:astore_3        
	//*1874 4514:aload_3         
	//*1875 4515:invokeinterface #2047 <Method boolean List.isEmpty()>
	//*1876 4520:ifne            4534
	//*1877 4523:aload_2         
	//*1878 4524:ldc2            #2049 <String "sensors">
	//*1879 4527:aload_3         
	//*1880 4528:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//*1881 4533:pop             
	//*1882 4534:aload_2         
	//*1883 4535:ldc2            #2051 <String "dim">
	//*1884 4538:aload_1         
	//*1885 4539:invokestatic    #2056 <Method Map AFScreenManager.getScreenMetrics(Context)>
	//*1886 4542:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//*1887 4547:pop             
	//*1888 4548:aload           18
	//*1889 4550:ldc2            #2058 <String "deviceData">
	//*1890 4553:aload_2         
	//*1891 4554:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//*1892 4559:pop             
	//*1893 4560:new             #1726 <Class s>
	//*1894 4563:dup             
	//*1895 4564:invokespecial   #2059 <Method void s()>
	//*1896 4567:pop             
	//*1897 4568:aload           18
	//*1898 4570:ldc2            #561 <String "appsflyerKey">
	//*1899 4573:invokeinterface #564 <Method Object Map.get(Object)>
	//*1900 4578:checkcast       #83  <Class String>
	//*1901 4581:astore_1        
	//*1902 4582:aload           18
	//*1903 4584:ldc2            #1494 <String "af_timestamp">
	//*1904 4587:invokeinterface #564 <Method Object Map.get(Object)>
	//*1905 4592:checkcast       #83  <Class String>
	//*1906 4595:astore_2        
	//*1907 4596:aload           18
	//*1908 4598:ldc2            #1807 <String "uid">
	//*1909 4601:invokeinterface #564 <Method Object Map.get(Object)>
	//*1910 4606:checkcast       #83  <Class String>
	//*1911 4609:astore_3        
	//*1912 4610:new             #95  <Class StringBuilder>
	//*1913 4613:dup             
	//*1914 4614:invokespecial   #98  <Method void StringBuilder()>
	//*1915 4617:astore          4
	//*1916 4619:aload           4
	//*1917 4621:aload_1         
	//*1918 4622:iconst_0        
	//*1919 4623:bipush          7
	//*1920 4625:invokevirtual   #91  <Method String String.substring(int, int)>
	//*1921 4628:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//*1922 4631:pop             
	//*1923 4632:aload           4
	//*1924 4634:aload_3         
	//*1925 4635:iconst_0        
	//*1926 4636:bipush          7
	//*1927 4638:invokevirtual   #91  <Method String String.substring(int, int)>
	//*1928 4641:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//*1929 4644:pop             
	//*1930 4645:aload           4
	//*1931 4647:aload_2         
	//*1932 4648:aload_2         
	//*1933 4649:invokevirtual   #567 <Method int String.length()>
	//*1934 4652:bipush          7
	//*1935 4654:isub            
	//*1936 4655:invokevirtual   #924 <Method String String.substring(int)>
	//*1937 4658:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//*1938 4661:pop             
	//*1939 4662:aload           18
	//*1940 4664:ldc2            #2061 <String "af_v">
	//*1941 4667:aload           4
	//*1942 4669:invokevirtual   #108 <Method String Object.toString()>
	//*1943 4672:invokestatic    #1727 <Method String s._mth02CE(String)>
	//*1944 4675:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//*1945 4680:pop             
	//*1946 4681:new             #1726 <Class s>
	//*1947 4684:dup             
	//*1948 4685:invokespecial   #2059 <Method void s()>
	//*1949 4688:pop             
	//*1950 4689:aload           18
	//*1951 4691:ldc2            #561 <String "appsflyerKey">
	//*1952 4694:invokeinterface #564 <Method Object Map.get(Object)>
	//*1953 4699:checkcast       #83  <Class String>
	//*1954 4702:astore_1        
	//*1955 4703:new             #95  <Class StringBuilder>
	//*1956 4706:dup             
	//*1957 4707:invokespecial   #98  <Method void StringBuilder()>
	//*1958 4710:astore_2        
	//*1959 4711:aload_2         
	//*1960 4712:aload_1         
	//*1961 4713:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//*1962 4716:pop             
	//*1963 4717:aload_2         
	//*1964 4718:aload           18
	//*1965 4720:ldc2            #1494 <String "af_timestamp">
	//*1966 4723:invokeinterface #564 <Method Object Map.get(Object)>
	//*1967 4728:invokevirtual   #2064 <Method StringBuilder StringBuilder.append(Object)>
	//*1968 4731:pop             
	//*1969 4732:aload_2         
	//*1970 4733:invokevirtual   #108 <Method String Object.toString()>
	//*1971 4736:astore_1        
	//*1972 4737:new             #95  <Class StringBuilder>
	//*1973 4740:dup             
	//*1974 4741:invokespecial   #98  <Method void StringBuilder()>
	//*1975 4744:astore_2        
	//*1976 4745:aload_2         
	//*1977 4746:aload_1         
	//*1978 4747:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//*1979 4750:pop             
	//*1980 4751:aload_2         
	//*1981 4752:aload           18
	//*1982 4754:ldc2            #1807 <String "uid">
	//*1983 4757:invokeinterface #564 <Method Object Map.get(Object)>
	//*1984 4762:invokevirtual   #2064 <Method StringBuilder StringBuilder.append(Object)>
	//*1985 4765:pop             
	//*1986 4766:aload_2         
	//*1987 4767:invokevirtual   #108 <Method String Object.toString()>
	//*1988 4770:astore_1        
	//*1989 4771:new             #95  <Class StringBuilder>
	//*1990 4774:dup             
	//*1991 4775:invokespecial   #98  <Method void StringBuilder()>
	//*1992 4778:astore_2        
	//*1993 4779:aload_2         
	//*1994 4780:aload_1         
	//*1995 4781:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//*1996 4784:pop             
	//*1997 4785:aload_2         
	//*1998 4786:aload           18
	//*1999 4788:ldc2            #1844 <String "installDate">
	//*2000 4791:invokeinterface #564 <Method Object Map.get(Object)>
	//*2001 4796:invokevirtual   #2064 <Method StringBuilder StringBuilder.append(Object)>
	//*2002 4799:pop             
	//*2003 4800:aload_2         
	//*2004 4801:invokevirtual   #108 <Method String Object.toString()>
	//*2005 4804:astore_1        
	//*2006 4805:new             #95  <Class StringBuilder>
	//*2007 4808:dup             
	//*2008 4809:invokespecial   #98  <Method void StringBuilder()>
	//*2009 4812:astore_2        
	//*2010 4813:aload_2         
	//*2011 4814:aload_1         
	//*2012 4815:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//*2013 4818:pop             
	//*2014 4819:aload_2         
	//*2015 4820:aload           18
	//*2016 4822:ldc2            #1953 <String "counter">
	//*2017 4825:invokeinterface #564 <Method Object Map.get(Object)>
	//*2018 4830:invokevirtual   #2064 <Method StringBuilder StringBuilder.append(Object)>
	//*2019 4833:pop             
	//*2020 4834:aload_2         
	//*2021 4835:invokevirtual   #108 <Method String Object.toString()>
	//*2022 4838:astore_1        
	//*2023 4839:new             #95  <Class StringBuilder>
	//*2024 4842:dup             
	//*2025 4843:invokespecial   #98  <Method void StringBuilder()>
	//*2026 4846:astore_2        
	//*2027 4847:aload_2         
	//*2028 4848:aload_1         
	//*2029 4849:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//*2030 4852:pop             
	//*2031 4853:aload_2         
	//*2032 4854:aload           18
	//*2033 4856:ldc2            #1955 <String "iaecounter">
	//*2034 4859:invokeinterface #564 <Method Object Map.get(Object)>
	//*2035 4864:invokevirtual   #2064 <Method StringBuilder StringBuilder.append(Object)>
	//*2036 4867:pop             
	//*2037 4868:aload           18
	//*2038 4870:ldc2            #2066 <String "af_v2">
	//*2039 4873:aload_2         
	//*2040 4874:invokevirtual   #108 <Method String Object.toString()>
	//*2041 4877:invokestatic    #2068 <Method String s._mth02CB(String)>
	//*2042 4880:invokestatic    #1727 <Method String s._mth02CE(String)>
	//*2043 4883:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//*2044 4888:pop             
	//*2045 4889:aload           7
	//*2046 4891:ldc2            #2070 <String "is_stop_tracking_used">
	//*2047 4894:invokeinterface #1181 <Method boolean SharedPreferences.contains(String)>
	//*2048 4899:ifeq            4964
	//*2049 4902:aload           18
	//*2050 4904:ldc2            #2072 <String "istu">
	//*2051 4907:aload           7
	//*2052 4909:ldc2            #2070 <String "is_stop_tracking_used">
	//*2053 4912:iconst_0        
	//*2054 4913:invokeinterface #717 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//*2055 4918:invokestatic    #1399 <Method String String.valueOf(boolean)>
	//*2056 4921:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//*2057 4926:pop             
	//*2058 4927:aload           18
	//*2059 4929:areturn         
	//*2060 4930:ldc2            #2074 <String "AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.getInstance().setAppsFlyerKey(...) to set it. ">
	//*2061 4933:invokestatic    #308 <Method void AFLogger.afInfoLog(String)>
	//*2062 4936:aload_1         
	//*2063 4937:ldc2            #699 <String "AppsFlyer_4.8.9">
	//*2064 4940:ldc2            #2076 <String "DEV_KEY_MISSING">
	//*2065 4943:aconst_null     
	//*2066 4944:invokestatic    #705 <Method void _mth02CA(Context, String, String, String)>
	//*2067 4947:ldc2            #2078 <String "AppsFlyer will not track this event.">
	//*2068 4950:invokestatic    #308 <Method void AFLogger.afInfoLog(String)>
	//*2069 4953:aconst_null     
	//*2070 4954:areturn         
	//*2071 4955:astore_1        
	//*2072 4956:aload_1         
	//*2073 4957:invokevirtual   #524 <Method String Throwable.getLocalizedMessage()>
	//*2074 4960:aload_1         
	//*2075 4961:invokestatic    #245 <Method void AFLogger.afErrorLog(String, Throwable)>
	//*2076 4964:aload           18
	//*2077 4966:areturn         
	//*2078 4967:astore_2        
	//*2079 4968:goto            2408
	//*2080 4971:astore_2        
	//*2081 4972:goto            2627
			obj = ((Object) (s2));
	// 2082 4975:aload_3         
	// 2083 4976:astore          16
		((StringBuilder) (obj1)).append(((String) (obj)));
		AFLogger.afInfoLog(obj1.toString());
		  goto _L3
_L2:
		AFLogger.afInfoLog("SDK tracking has been stopped");
		  goto _L3
_L108:
		_mth02CA(context, "AppsFlyer_4.8.9", "EVENT_CREATED_WITH_NAME", ((String) (obj)));
		CacheManager.getInstance().init(context);
		try
		{
			obj = ((Object) (Arrays.asList(((Object []) (context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions)))));
			if(!((List) (obj)).contains("android.permission.INTERNET"))
			{
				AFLogger.afWarnLog("Permission android.permission.INTERNET is missing in the AndroidManifest.xml");
				_mth02CA(context, ((String) (null)), "PERMISSION_INTERNET_MISSING", ((String) (null)));
			}
			if(!((List) (obj)).contains("android.permission.ACCESS_NETWORK_STATE"))
				AFLogger.afWarnLog("Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml");
			if(!((List) (obj)).contains("android.permission.ACCESS_WIFI_STATE"))
				AFLogger.afWarnLog("Permission android.permission.ACCESS_WIFI_STATE is missing in the AndroidManifest.xml");
			break MISSING_BLOCK_LABEL_249;
		}
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
		AFLogger.afErrorLog("Exception while validation permissions. ", ((Throwable) (obj)));
		if(!flag)
			break MISSING_BLOCK_LABEL_268;
		((Map) (hashmap)).put("af_events_api", "1");
		((Map) (hashmap)).put("brand", ((Object) (Build.BRAND)));
		((Map) (hashmap)).put("device", ((Object) (Build.DEVICE)));
		((Map) (hashmap)).put("product", ((Object) (Build.PRODUCT)));
		((Map) (hashmap)).put("sdk", ((Object) (Integer.toString(android.os.Build.VERSION.SDK_INT))));
		((Map) (hashmap)).put("model", ((Object) (Build.MODEL)));
		((Map) (hashmap)).put("deviceType", ((Object) (Build.TYPE)));
		if(!flag1) goto _L5; else goto _L4
_L4:
		if(!(context.getSharedPreferences("appsflyer-data", 0).contains("appsFlyerCount") ^ true))
			break MISSING_BLOCK_LABEL_934;
		if(AppsFlyerProperties.getInstance().isOtherSdkStringDisabled())
			break MISSING_BLOCK_LABEL_703;
		obj = ((Object) (new StringBuilder()));
		if(_fld02CD._mth0971("com.tune.Tune"))
			j = 1;
		else
	//*2084 4978:goto            101
	//*2085 4981:iload           8
	//*2086 4983:ifeq            4994
	//*2087 4986:ldc2            #1508 <String "Launch">
	//*2088 4989:astore          16
	//*2089 4991:goto            129
	//*2090 4994:aload_3         
	//*2091 4995:astore          16
	//*2092 4997:goto            129
			j = 0;
	// 2093 5000:iconst_0        
	// 2094 5001:istore          10
		((StringBuilder) (obj)).append(j);
		if(_fld02CD._mth0971("com.adjust.sdk.Adjust"))
			j = 1;
		else
	//*2095 5003:goto            418
			j = 0;
	// 2096 5006:iconst_0        
	// 2097 5007:istore          10
		((StringBuilder) (obj)).append(j);
		if(_fld02CD._mth0971("com.kochava.android.tracker.Feature"))
			j = 1;
		else
	//*2098 5009:goto            445
			j = 0;
	// 2099 5012:iconst_0        
	// 2100 5013:istore          10
		((StringBuilder) (obj)).append(j);
		if(_fld02CD._mth0971("io.branch.referral.Branch"))
			j = 1;
		else
	//*2101 5015:goto            472
			j = 0;
	// 2102 5018:iconst_0        
	// 2103 5019:istore          10
		((StringBuilder) (obj)).append(j);
		if(_fld02CD._mth0971("com.apsalar.sdk.Apsalar"))
			j = 1;
		else
	//*2104 5021:goto            499
			j = 0;
	// 2105 5024:iconst_0        
	// 2106 5025:istore          10
		((StringBuilder) (obj)).append(j);
		if(_fld02CD._mth0971("com.localytics.android.Localytics"))
			j = 1;
		else
	//*2107 5027:goto            526
			j = 0;
	// 2108 5030:iconst_0        
	// 2109 5031:istore          10
		((StringBuilder) (obj)).append(j);
		if(_fld02CD._mth0971("com.tenjin.android.TenjinSDK"))
			j = 1;
		else
	//*2110 5033:goto            553
			j = 0;
	// 2111 5036:iconst_0        
	// 2112 5037:istore          10
		((StringBuilder) (obj)).append(j);
		if(_fld02CD._mth0971("place holder for TD"))
			j = 1;
		else
	//*2113 5039:goto            580
			j = 0;
	// 2114 5042:iconst_0        
	// 2115 5043:istore          10
		((StringBuilder) (obj)).append(j);
		if(_fld02CD._mth0971("it.partytrack.sdk.Track"))
			j = 1;
		else
	//*2116 5045:goto            607
			j = 0;
	// 2117 5048:iconst_0        
	// 2118 5049:istore          10
		((StringBuilder) (obj)).append(j);
		if(_fld02CD._mth0971("jp.appAdForce.android.LtvManager"))
			j = 1;
		else
	//*2119 5051:goto            634
			j = 0;
	// 2120 5054:iconst_0        
	// 2121 5055:istore          10
		((StringBuilder) (obj)).append(j);
		((Map) (hashmap)).put("af_sdks", ((Object) (obj.toString())));
		((Map) (hashmap)).put("batteryLevel", ((Object) (String.valueOf(_mth09710971(context)))));
		j = 18;
		if(!((Object) ("OPPO")).equals(((Object) (Build.BRAND))))
			break MISSING_BLOCK_LABEL_729;
		j = 23;
		AFLogger.afRDLog("OPPO device found");
		if(android.os.Build.VERSION.SDK_INT < j)
			break MISSING_BLOCK_LABEL_896;
		obj = ((Object) (new StringBuilder("OS SDK is=")));
		((StringBuilder) (obj)).append(android.os.Build.VERSION.SDK_INT);
		((StringBuilder) (obj)).append("; use KeyStore");
		AFLogger.afRDLog(obj.toString());
		obj = ((Object) (new AFKeystoreWrapper(context)));
		if(((AFKeystoreWrapper) (obj))._mth02CE())
			break MISSING_BLOCK_LABEL_855;
		((AFKeystoreWrapper) (obj))._mth02CF(q._mth02CB(new WeakReference(((Object) (context)))));
		obj1 = ((Object) (((AFKeystoreWrapper) (obj))._mth0971()));
		AppsFlyerProperties.getInstance().set("KSAppsFlyerId", ((String) (obj1)));
		obj = ((Object) (String.valueOf(((AFKeystoreWrapper) (obj))._mth02CB())));
		obj1 = ((Object) (AppsFlyerProperties.getInstance()));
_L6:
		((AppsFlyerProperties) (obj1)).set("KSAppsFlyerRICounter", ((String) (obj)));
		break MISSING_BLOCK_LABEL_934;
		((AFKeystoreWrapper) (obj))._mth02CA();
		obj1 = ((Object) (((AFKeystoreWrapper) (obj))._mth0971()));
		AppsFlyerProperties.getInstance().set("KSAppsFlyerId", ((String) (obj1)));
		obj = ((Object) (String.valueOf(((AFKeystoreWrapper) (obj))._mth02CB())));
		obj1 = ((Object) (AppsFlyerProperties.getInstance()));
		  goto _L6
		obj = ((Object) (new StringBuilder("OS SDK is=")));
		((StringBuilder) (obj)).append(android.os.Build.VERSION.SDK_INT);
		((StringBuilder) (obj)).append("; no KeyStore usage");
		AFLogger.afRDLog(obj.toString());
		l2 = context.getSharedPreferences("appsflyer-data", 0).getLong("AppsFlyerTimePassedSincePrevLaunch", 0L);
		l3 = System.currentTimeMillis();
		_mth0971(context, "AppsFlyerTimePassedSincePrevLaunch", l3);
		if(l2 <= 0L) goto _L8; else goto _L7
_L7:
		l2 = (l3 - l2) / 1000L;
_L109:
		((Map) (hashmap)).put("timepassedsincelastlaunch", ((Object) (Long.toString(l2))));
		obj = ((Object) (AppsFlyerProperties.getInstance().getString("oneLinkSlug")));
		if(obj == null) goto _L10; else goto _L9
_L9:
		((Map) (hashmap)).put("onelink_id", obj);
		((Map) (hashmap)).put("ol_ver", ((Object) (AppsFlyerProperties.getInstance().getString("onelinkVersion"))));
		  goto _L10
_L5:
		obj = ((Object) (context.getSharedPreferences("appsflyer-data", 0)));
		obj1 = ((Object) (((SharedPreferences) (obj)).edit()));
		obj2 = ((Object) (((SharedPreferences) (obj)).getString("prev_event_name", ((String) (null)))));
		if(obj2 == null)
			break MISSING_BLOCK_LABEL_1216;
		jsonobject = new JSONObject();
		StringBuilder stringbuilder = new StringBuilder();
		stringbuilder.append(((SharedPreferences) (obj)).getLong("prev_event_timestamp", -1L));
		jsonobject.put("prev_event_timestamp", ((Object) (((Object) (stringbuilder)).toString())));
		jsonobject.put("prev_event_value", ((Object) (((SharedPreferences) (obj)).getString("prev_event_value", ((String) (null))))));
		jsonobject.put("prev_event_name", obj2);
		if(!(jsonobject instanceof JSONObject))
		{
			obj = ((Object) (jsonobject.toString()));
			break MISSING_BLOCK_LABEL_1203;
		}
		obj = ((Object) (JSONObjectInstrumentation.toString((JSONObject)jsonobject)));
		((Map) (hashmap)).put("prev_event", obj);
		((android.content.SharedPreferences.Editor) (obj1)).putString("prev_event_name", s2);
		((android.content.SharedPreferences.Editor) (obj1)).putString("prev_event_value", s3);
		((android.content.SharedPreferences.Editor) (obj1)).putLong("prev_event_timestamp", System.currentTimeMillis());
		if(android.os.Build.VERSION.SDK_INT < 9) goto _L12; else goto _L11
_L11:
		((android.content.SharedPreferences.Editor) (obj1)).apply();
		  goto _L10
_L12:
		((android.content.SharedPreferences.Editor) (obj1)).commit();
		  goto _L10
		obj;
		AFLogger.afErrorLog("Error while processing previous event.", ((Throwable) (obj)));
_L10:
		obj = ((Object) (AppsFlyerProperties.getInstance().getString("KSAppsFlyerId")));
		obj1 = ((Object) (AppsFlyerProperties.getInstance().getString("KSAppsFlyerRICounter")));
		if(obj == null || obj1 == null)
			break MISSING_BLOCK_LABEL_1363;
		if(((Number) (Integer.valueOf(((String) (obj1))))).intValue() > 0)
		{
			((Map) (hashmap)).put("reinstallCounter", obj1);
			((Map) (hashmap)).put("originalAppsflyerId", obj);
		}
		obj = ((Object) (AppsFlyerProperties.getInstance().getString("additionalCustomData")));
		if(obj == null)
			break MISSING_BLOCK_LABEL_1392;
		((Map) (hashmap)).put("customData", obj);
		obj = ((Object) (context.getPackageManager().getInstallerPackageName(context.getPackageName())));
		if(obj == null)
			break MISSING_BLOCK_LABEL_1436;
		((Map) (hashmap)).put("installer_package", obj);
		break MISSING_BLOCK_LABEL_1436;
		obj;
		AFLogger.afErrorLog("Exception while getting the app's installer package. ", ((Throwable) (obj)));
		obj = ((Object) (AppsFlyerProperties.getInstance().getString("sdkExtension")));
		if(obj == null)
			break MISSING_BLOCK_LABEL_1473;
		if(((String) (obj)).length() > 0)
			((Map) (hashmap)).put("sdkExtension", obj);
		obj2 = ((Object) (new WeakReference(((Object) (context)))));
		obj1 = ((Object) (AppsFlyerProperties.getInstance().getString("channel")));
		obj = obj1;
		if(obj1 != null)
			break MISSING_BLOCK_LABEL_1512;
		obj = ((Object) (_mth02CE(((WeakReference) (obj2)), "CHANNEL")));
		obj1 = ((Object) (_mth02CF(context, ((String) (obj)))));
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_1537;
		((Map) (hashmap)).put("channel", obj1);
		if(obj1 == null) goto _L14; else goto _L13
_L13:
		if(!obj1.equals(obj)) goto _L15; else goto _L14
_L15:
		((Map) (hashmap)).put("af_latestchannel", obj);
_L110:
		obj = ((Object) (context.getSharedPreferences("appsflyer-data", 0)));
		if(!((SharedPreferences) (obj)).contains("INSTALL_STORE")) goto _L17; else goto _L16
_L16:
		obj = ((Object) (((SharedPreferences) (obj)).getString("INSTALL_STORE", ((String) (null)))));
		  goto _L18
_L17:
		if(!(context.getSharedPreferences("appsflyer-data", 0).contains("appsFlyerCount") ^ true)) goto _L20; else goto _L19
_L19:
		obj = ((Object) (_mth02CE(new WeakReference(((Object) (context))), "AF_STORE")));
_L111:
		_mth02CF(context, "INSTALL_STORE", ((String) (obj)));
_L18:
		if(obj == null)
			break MISSING_BLOCK_LABEL_1677;
		((Map) (hashmap)).put("af_installstore", ((Object) (((String) (obj)).toLowerCase())));
		obj2 = ((Object) (context.getSharedPreferences("appsflyer-data", 0)));
		obj1 = ((Object) (AppsFlyerProperties.getInstance().getString("preInstallName")));
		obj = obj1;
		if(obj1 != null) goto _L22; else goto _L21
_L21:
		if(!((SharedPreferences) (obj2)).contains("preInstallName")) goto _L24; else goto _L23
_L23:
		obj1 = ((Object) (((SharedPreferences) (obj2)).getString("preInstallName", ((String) (null)))));
		  goto _L25
_L24:
		obj = obj1;
		if(!(context.getSharedPreferences("appsflyer-data", 0).contains("appsFlyerCount") ^ true)) goto _L27; else goto _L26
_L26:
		obj = ((Object) (_mth02CF(_mth02CE("ro.appsflyer.preinstall.path"))));
		if(obj == null) goto _L29; else goto _L28
_L28:
		if(((File) (obj)).exists()) goto _L30; else goto _L29
_L112:
		if(j == 0)
			break MISSING_BLOCK_LABEL_1812;
		obj = ((Object) (_mth02CF(_mth02CA("AF_PRE_INSTALL_PATH", context.getPackageManager(), context.getPackageName()))));
		if(obj == null) goto _L32; else goto _L31
_L31:
		if(((File) (obj)).exists()) goto _L33; else goto _L32
_L113:
		if(j == 0)
			break MISSING_BLOCK_LABEL_1841;
		obj = ((Object) (_mth02CF("/data/local/tmp/pre_install.appsflyer")));
		if(obj == null) goto _L35; else goto _L34
_L34:
		if(((File) (obj)).exists()) goto _L36; else goto _L35
_L114:
		if(j == 0)
			break MISSING_BLOCK_LABEL_1870;
		obj = ((Object) (_mth02CF("/etc/pre_install.appsflyer")));
		if(obj == null) goto _L38; else goto _L37
_L37:
		if(((File) (obj)).exists()) goto _L39; else goto _L38
_L115:
		if(j != 0) goto _L41; else goto _L40
_L40:
		obj = ((Object) (_mth02CB(((File) (obj)), context.getPackageName())));
		if(obj == null) goto _L41; else goto _L42
_L116:
		obj = ((Object) (_mth02CE(new WeakReference(((Object) (context))), "AF_PRE_INSTALL_NAME")));
_L27:
		obj1 = obj;
		if(obj == null) goto _L25; else goto _L43
_L43:
		_mth02CF(context, "preInstallName", ((String) (obj)));
		obj1 = obj;
_L25:
		obj = obj1;
		if(obj1 == null) goto _L22; else goto _L44
_L44:
		AppsFlyerProperties.getInstance().set("preInstallName", ((String) (obj1)));
		obj = obj1;
_L22:
		if(obj == null)
			break MISSING_BLOCK_LABEL_1993;
		((Map) (hashmap)).put("af_preinstall_name", ((Object) (((String) (obj)).toLowerCase())));
		obj = ((Object) (_mth02CE(new WeakReference(((Object) (context))), "AF_STORE")));
		if(obj == null)
			break MISSING_BLOCK_LABEL_2030;
		((Map) (hashmap)).put("af_currentstore", ((Object) (((String) (obj)).toLowerCase())));
		if(s1 == null) goto _L46; else goto _L45
_L45:
		if(s1.length() < 0) goto _L46; else goto _L47
_L47:
		((Map) (hashmap)).put("appsflyerKey", ((Object) (s1)));
		  goto _L48
_L46:
		s1 = AppsFlyerProperties.getInstance().getString("AppsFlyerKey");
		if(s1 == null) goto _L50; else goto _L49
_L49:
		if(s1.length() < 0) goto _L50; else goto _L51
_L51:
		((Map) (hashmap)).put("appsflyerKey", ((Object) (s1)));
_L48:
		s1 = AppsFlyerProperties.getInstance().getString("AppUserId");
		if(s1 == null)
			break MISSING_BLOCK_LABEL_2115;
		((Map) (hashmap)).put("appUserId", ((Object) (s1)));
		s1 = AppsFlyerProperties.getInstance().getString("userEmails");
		if(s1 == null)
			break MISSING_BLOCK_LABEL_2144;
		((Map) (hashmap)).put("user_emails", ((Object) (s1)));
		break MISSING_BLOCK_LABEL_2173;
		s1 = AppsFlyerProperties.getInstance().getString("userEmail");
		if(s1 == null)
			break MISSING_BLOCK_LABEL_2173;
		((Map) (hashmap)).put("sha1_el", ((Object) (s._mth02CE(s1))));
		if(s2 == null)
			break MISSING_BLOCK_LABEL_2207;
		((Map) (hashmap)).put("eventName", ((Object) (s2)));
		if(s3 == null)
			break MISSING_BLOCK_LABEL_2207;
		((Map) (hashmap)).put("eventValue", ((Object) (s3)));
		if(AppsFlyerProperties.getInstance().getString("appid") != null)
			((Map) (hashmap)).put("appid", ((Object) (AppsFlyerProperties.getInstance().getString("appid"))));
		s1 = AppsFlyerProperties.getInstance().getString("currencyCode");
		if(s1 == null)
			break MISSING_BLOCK_LABEL_2309;
		if(s1.length() != 3)
		{
			s3 = ((String) (new StringBuilder("WARNING: currency code should be 3 characters!!! '")));
			((StringBuilder) (s3)).append(s1);
			((StringBuilder) (s3)).append("' is not a legal value.");
			AFLogger.afWarnLog(((Object) (s3)).toString());
		}
		((Map) (hashmap)).put("currency", ((Object) (s1)));
		s1 = AppsFlyerProperties.getInstance().getString("IS_UPDATE");
		if(s1 == null)
			break MISSING_BLOCK_LABEL_2335;
		((Map) (hashmap)).put("isUpdate", ((Object) (s1)));
		((Map) (hashmap)).put("af_preinstalled", ((Object) (Boolean.toString(isPreInstalledApp(context)))));
		flag = AppsFlyerProperties.getInstance().getBoolean("collectFacebookAttrId", true);
		if(!flag) goto _L53; else goto _L52
_L52:
		context.getPackageManager().getApplicationInfo("com.facebook.katana", 0);
		s1 = getAttributionId(context.getContentResolver());
		  goto _L54
		s1;
		AFLogger.afErrorLog("Exception while collecting facebook's attribution ID. ", ((Throwable) (s1)));
		s1 = null;
		  goto _L54
_L106:
		AFLogger.afWarnLog("Exception while collecting facebook's attribution ID. ");
		s1 = null;
_L54:
		if(s1 == null) goto _L53; else goto _L55
_L55:
		((Map) (hashmap)).put("fb", ((Object) (s1)));
_L53:
		if(!AppsFlyerProperties.getInstance().getBoolean("deviceTrackingDisabled", false)) goto _L57; else goto _L56
_L56:
		((Map) (hashmap)).put("deviceTrackingDisabled", "true");
		  goto _L58
_L57:
		obj = ((Object) (context.getSharedPreferences("appsflyer-data", 0)));
		flag = AppsFlyerProperties.getInstance().getBoolean("collectIMEI", true);
		s1 = ((SharedPreferences) (obj)).getString("imeiCached", ((String) (null)));
		if(!flag) goto _L60; else goto _L59
_L59:
		if(android.os.Build.VERSION.SDK_INT < 19)
			break MISSING_BLOCK_LABEL_2529;
		flag = _mth0971(context);
		if(flag)
		{
			j = 0;
			break MISSING_BLOCK_LABEL_2532;
		}
		j = 1;
		if(j == 0) goto _L62; else goto _L61
_L61:
		s3 = ((String) ((TelephonyManager)context.getSystemService("phone")));
		s3 = (String)((Object) (s3)).getClass().getMethod("getDeviceId", new Class[0]).invoke(((Object) (s3)), new Object[0]);
		if(s3 == null) goto _L64; else goto _L63
_L63:
		s1 = s3;
		  goto _L65
_L64:
		if(_fld02CF == null) goto _L67; else goto _L66
_L66:
		s1 = _fld02CF;
		  goto _L65
_L67:
		if(s1 == null)
			s1 = null;
		  goto _L65
		s1;
		AFLogger.afErrorLog("WARNING: READ_PHONE_STATE is missing. ", ((Throwable) (s1)));
		  goto _L68
_L107:
		AFLogger.afWarnLog("WARNING: READ_PHONE_STATE is missing.");
		  goto _L68
_L62:
		if(_fld02CF == null) goto _L68; else goto _L69
_L69:
		s1 = _fld02CF;
		  goto _L65
_L60:
		if(_fld02CF == null) goto _L68; else goto _L69
_L65:
		if(s1 == null)
			break MISSING_BLOCK_LABEL_2688;
		_mth02CF(context, "imeiCached", s1);
		((Map) (hashmap)).put("imei", ((Object) (s1)));
		break MISSING_BLOCK_LABEL_2694;
		AFLogger.afInfoLog("IMEI was not collected.");
		flag = AppsFlyerProperties.getInstance().getBoolean("collectAndroidId", true);
		s1 = ((SharedPreferences) (obj)).getString("androidIdCached", ((String) (null)));
		if(!flag) goto _L71; else goto _L70
_L70:
		if(android.os.Build.VERSION.SDK_INT < 19)
			break MISSING_BLOCK_LABEL_2751;
		flag = _mth0971(context);
		if(flag)
		{
			j = 0;
			break MISSING_BLOCK_LABEL_2754;
		}
		j = 1;
		if(j == 0) goto _L73; else goto _L72
_L72:
		s3 = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
		if(s3 == null) goto _L75; else goto _L74
_L74:
		s1 = s3;
		  goto _L76
_L75:
		if(_fld02CB == null) goto _L78; else goto _L77
_L77:
		s1 = _fld02CB;
		  goto _L76
_L78:
		if(s1 == null) goto _L79; else goto _L76
		s1;
		AFLogger.afErrorLog(((Throwable) (s1)).getMessage(), ((Throwable) (s1)));
		  goto _L79
_L73:
		if(_fld02CB == null) goto _L79; else goto _L80
_L80:
		s1 = _fld02CB;
		  goto _L76
_L71:
		if(_fld02CB == null) goto _L79; else goto _L80
_L76:
		if(s1 == null) goto _L82; else goto _L81
_L81:
		_mth02CF(context, "androidIdCached", s1);
		((Map) (hashmap)).put("android_id", ((Object) (s1)));
		  goto _L58
_L82:
		AFLogger.afInfoLog("Android ID was not collected.");
_L58:
		s1 = q._mth02CB(new WeakReference(((Object) (context))));
		if(s1 == null)
			break MISSING_BLOCK_LABEL_2937;
		((Map) (hashmap)).put("uid", ((Object) (s1)));
		break MISSING_BLOCK_LABEL_2937;
		s1;
		s3 = ((String) (new StringBuilder("ERROR: could not get uid ")));
		((StringBuilder) (s3)).append(((Throwable) (s1)).getMessage());
		AFLogger.afErrorLog(((Object) (s3)).toString(), ((Throwable) (s1)));
		try
		{
			((Map) (hashmap)).put("lang", ((Object) (Locale.getDefault().getDisplayLanguage())));
			break MISSING_BLOCK_LABEL_2965;
		}
		// Misplaced declaration of an exception variable
		catch(String s1) { }
		AFLogger.afErrorLog("Exception while collecting display language name. ", ((Throwable) (s1)));
		try
		{
			((Map) (hashmap)).put("lang_code", ((Object) (Locale.getDefault().getLanguage())));
			break MISSING_BLOCK_LABEL_2993;
		}
		// Misplaced declaration of an exception variable
		catch(String s1) { }
		AFLogger.afErrorLog("Exception while collecting display language code. ", ((Throwable) (s1)));
		try
		{
			((Map) (hashmap)).put("country", ((Object) (Locale.getDefault().getCountry())));
			break MISSING_BLOCK_LABEL_3021;
		}
		// Misplaced declaration of an exception variable
		catch(String s1) { }
		AFLogger.afErrorLog("Exception while collecting country name. ", ((Throwable) (s1)));
		((Map) (hashmap)).put("platformextension", ((Object) (_fld02CD._mth02CE())));
		_mth02CB(context, ((Map) (hashmap)));
		obj = ((Object) (new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US)));
		j = android.os.Build.VERSION.SDK_INT;
		if(j < 9)
			break MISSING_BLOCK_LABEL_3136;
		l2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
		((DateFormat) (obj)).setTimeZone(TimeZone.getTimeZone("UTC"));
		((Map) (hashmap)).put("installDate", ((Object) (((DateFormat) (obj)).format(new Date(l2)))));
		break MISSING_BLOCK_LABEL_3136;
		s1;
		AFLogger.afErrorLog("Exception while collecting install date. ", ((Throwable) (s1)));
		s1 = ((String) (context.getPackageManager().getPackageInfo(context.getPackageName(), 0)));
		j = sharedpreferences.getInt("versionCode", 0);
		if(((PackageInfo) (s1)).versionCode > j)
		{
			_mth02CE(context, "appsflyerConversionDataRequestRetries", 0);
			_mth02CE(context, "versionCode", ((PackageInfo) (s1)).versionCode);
		}
		((Map) (hashmap)).put("app_version_code", ((Object) (Integer.toString(((PackageInfo) (s1)).versionCode))));
		((Map) (hashmap)).put("app_version_name", ((Object) (((PackageInfo) (s1)).versionName)));
		if(android.os.Build.VERSION.SDK_INT < 9) goto _L84; else goto _L83
_L83:
		l2 = ((PackageInfo) (s1)).firstInstallTime;
		l3 = ((PackageInfo) (s1)).lastUpdateTime;
		((DateFormat) (obj)).setTimeZone(TimeZone.getTimeZone("UTC"));
		((Map) (hashmap)).put("date1", ((Object) (((DateFormat) (obj)).format(new Date(l2)))));
		((DateFormat) (obj)).setTimeZone(TimeZone.getTimeZone("UTC"));
		((Map) (hashmap)).put("date2", ((Object) (((DateFormat) (obj)).format(new Date(l3)))));
		s3 = context.getSharedPreferences("appsflyer-data", 0).getString("appsFlyerFirstInstall", ((String) (null)));
		s1 = s3;
		if(s3 != null) goto _L86; else goto _L85
_L85:
		if(!(context.getSharedPreferences("appsflyer-data", 0).contains("appsFlyerCount") ^ true)) goto _L88; else goto _L87
_L87:
		AFLogger.afDebugLog("AppsFlyer: first launch detected");
		s1 = ((DateFormat) (obj)).format(new Date());
_L117:
		_mth02CF(context, "appsFlyerFirstInstall", s1);
_L86:
		AFLogger.afInfoLog("AppsFlyer: first launch date: ".concat(String.valueOf(((Object) (s1)))));
		((Map) (hashmap)).put("firstLaunchDate", ((Object) (s1)));
		  goto _L84
		s1;
		break MISSING_BLOCK_LABEL_3426;
		s1;
		AFLogger.afErrorLog("Exception while collecting app version data ", ((Throwable) (s1)));
_L84:
		if(s4.length() > 0)
			((Map) (hashmap)).put("referrer", ((Object) (s4)));
		s1 = sharedpreferences.getString("extraReferrers", ((String) (null)));
		if(s1 == null)
			break MISSING_BLOCK_LABEL_3482;
		((Map) (hashmap)).put("extraReferrers", ((Object) (s1)));
		s1 = AppsFlyerProperties.getInstance().getString("afUninstallToken");
		if(s1 == null)
			break MISSING_BLOCK_LABEL_3514;
		((Map) (hashmap)).put("af_gcm_token", ((Object) (com.appsflyer.d._mth02CA(s1)._mth0971())));
		_fld02CE02CE = y._mth02CA(context);
		s1 = ((String) (new StringBuilder("didConfigureTokenRefreshService=")));
		((StringBuilder) (s1)).append(_fld02CE02CE);
		AFLogger.afDebugLog(((Object) (s1)).toString());
		if(!_fld02CE02CE)
			((Map) (hashmap)).put("tokenRefreshConfigured", ((Object) (Boolean.FALSE)));
		if(!flag1)
			break MISSING_BLOCK_LABEL_3647;
		if(_fld02CA141D == null)
			break MISSING_BLOCK_LABEL_3642;
		s1 = ((String) (JSONObjectInstrumentation.init(_fld02CA141D)));
		((JSONObject) (s1)).put("isPush", "true");
		if(!(s1 instanceof JSONObject))
		{
			s1 = ((JSONObject) (s1)).toString();
			break MISSING_BLOCK_LABEL_3627;
		}
		s1 = JSONObjectInstrumentation.toString((JSONObject)s1);
		((Map) (hashmap)).put("af_deeplink", ((Object) (s1)));
		_fld02CA141D = null;
		if(!flag1) goto _L90; else goto _L89
_L89:
		if(intent == null) goto _L92; else goto _L91
_L91:
		if(!((Object) ("android.intent.action.VIEW")).equals(((Object) (intent.getAction())))) goto _L92; else goto _L93
_L93:
		s1 = ((String) (intent.getData()));
_L118:
		if(s1 == null) goto _L95; else goto _L94
_L94:
		_mth02CA(context, ((Map) (hashmap)), ((Uri) (s1)));
		  goto _L90
_L95:
		if(_fld02BE != null)
			_mth02CA(context, ((Map) (hashmap)), _fld02BE);
_L90:
		if(!_fld02CB02CA) goto _L97; else goto _L96
_L96:
		((Map) (hashmap)).put("testAppMode_retargeting", "true");
		s1 = ((String) (new JSONObject(((Map) (hashmap)))));
		if(s1 instanceof JSONObject) goto _L99; else goto _L98
_L98:
		s1 = ((JSONObject) (s1)).toString();
		  goto _L100
_L99:
		s1 = JSONObjectInstrumentation.toString((JSONObject)s1);
_L100:
		s3 = ((String) (new Intent("com.appsflyer.testIntgrationBroadcast")));
		((Intent) (s3)).putExtra("params", s1);
		context.sendBroadcast(((Intent) (s3)));
		AFLogger.afInfoLog("Sent retargeting params to test app");
_L97:
		l2 = System.currentTimeMillis();
		l3 = _fld02C9;
		s1 = AppsFlyerProperties.getInstance().getReferrer(context);
		if(l2 - l3 > 30000L || s1 == null) goto _L102; else goto _L101
_L101:
		if(!s1.contains("AppsFlyer_Test")) goto _L102; else goto _L103
_L103:
		j = 1;
_L119:
		if(j == 0)
			break MISSING_BLOCK_LABEL_3949;
		((Map) (hashmap)).put("testAppMode", "true");
		s1 = ((String) (new JSONObject(((Map) (hashmap)))));
		if(!(s1 instanceof JSONObject))
		{
			s1 = ((JSONObject) (s1)).toString();
			break MISSING_BLOCK_LABEL_3904;
		}
		s1 = JSONObjectInstrumentation.toString((JSONObject)s1);
		s3 = ((String) (new Intent("com.appsflyer.testIntgrationBroadcast")));
		((Intent) (s3)).putExtra("params", s1);
		context.sendBroadcast(((Intent) (s3)));
		AFLogger.afInfoLog("Sent params to test app");
		AFLogger.afInfoLog("Test mode ended!");
		_fld02C9 = 0L;
		if(AppsFlyerProperties.getInstance().getString("advertiserId") != null)
			break MISSING_BLOCK_LABEL_4010;
		o._mth02CA(context, ((Map) (hashmap)));
		if(AppsFlyerProperties.getInstance().getString("advertiserId") != null)
		{
			((Map) (hashmap)).put("GAID_retry", "true");
			break MISSING_BLOCK_LABEL_4010;
		}
		((Map) (hashmap)).put("GAID_retry", "false");
		s1 = ((String) (o._mth0971(context.getContentResolver())));
		if(s1 == null)
			break MISSING_BLOCK_LABEL_4055;
		((Map) (hashmap)).put("amazon_aid", ((Object) (((k) (s1))._mth02CA())));
		((Map) (hashmap)).put("amazon_aid_limit", ((Object) (String.valueOf(((k) (s1))._mth02CE()))));
		s1 = AppsFlyerProperties.getInstance().getReferrer(context);
		if(s1 == null)
			break MISSING_BLOCK_LABEL_4099;
		if(s1.length() > 0 && ((Map) (hashmap)).get("referrer") == null)
			((Map) (hashmap)).put("referrer", ((Object) (s1)));
		flag2 = ((Object) ("true")).equals(((Object) (sharedpreferences.getString("sentSuccessfully", ""))));
		((Map) (hashmap)).put("registeredUninstall", ((Object) (Boolean.valueOf(sharedpreferences.getBoolean("sentRegisterRequestToAF", false)))));
		j = _mth02CE(sharedpreferences, "appsFlyerCount", flag1);
		((Map) (hashmap)).put("counter", ((Object) (Integer.toString(j))));
		if(s2 != null)
			flag = true;
		else
	//*2122 5057:goto            661
	//*2123 5060:ldc2w           #157 <Long -1L>
	//*2124 5063:lstore          12
	//*2125 5065:goto            988
	//*2126 5068:aload           17
	//*2127 5070:ifnonnull       1568
	//*2128 5073:aload           16
	//*2129 5075:ifnull          1568
	//*2130 5078:goto            1555
	//*2131 5081:aconst_null     
	//*2132 5082:astore          16
	//*2133 5084:goto            1647
	//*2134 5087:iconst_0        
	//*2135 5088:istore          10
	//*2136 5090:goto            1788
	//*2137 5093:iconst_1        
	//*2138 5094:istore          10
	//*2139 5096:goto            1788
	//*2140 5099:iconst_0        
	//*2141 5100:istore          10
	//*2142 5102:goto            1828
	//*2143 5105:iconst_1        
	//*2144 5106:istore          10
	//*2145 5108:goto            1828
	//*2146 5111:iconst_0        
	//*2147 5112:istore          10
	//*2148 5114:goto            1857
	//*2149 5117:iconst_1        
	//*2150 5118:istore          10
	//*2151 5120:goto            1857
	//*2152 5123:iconst_0        
	//*2153 5124:istore          10
	//*2154 5126:goto            1886
	//*2155 5129:iconst_1        
	//*2156 5130:istore          10
	//*2157 5132:goto            1886
	//*2158 5135:aconst_null     
	//*2159 5136:astore          16
	//*2160 5138:aload           16
	//*2161 5140:ifnull          1910
	//*2162 5143:goto            1926
	//*2163 5146:aconst_null     
	//*2164 5147:astore_2        
	//*2165 5148:goto            2661
	//*2166 5151:aconst_null     
	//*2167 5152:astore_2        
	//*2168 5153:goto            2841
	//*2169 5156:ldc2            #922 <String "">
	//*2170 5159:astore_2        
	//*2171 5160:goto            3385
	//*2172 5163:goto            3573
	//*2173 5166:goto            3642
	//*2174 5169:aconst_null     
	//*2175 5170:astore_2        
	//*2176 5171:goto            3680
	//*2177 5174:iconst_0        
	//*2178 5175:istore          10
	//*2179 5177:goto            3852
			flag = false;
	// 2180 5180:iconst_0        
	// 2181 5181:istore          6
		((Map) (hashmap)).put("iaecounter", ((Object) (Integer.toString(_mth02CE(sharedpreferences, "appsFlyerInAppEventCount", flag)))));
		if(!flag1 || j != 1)
			break MISSING_BLOCK_LABEL_5189;
		try
		{
			AppsFlyerProperties.getInstance().setFirstLaunchCalled();
			if(AppsFlyerProperties.getInstance().getBoolean("waitForCustomerId", false))
				((Map) (hashmap)).put("wait_cid", ((Object) (Boolean.toString(true))));
			break MISSING_BLOCK_LABEL_5189;
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			AFLogger.afErrorLog(((Throwable) (context)).getLocalizedMessage(), ((Throwable) (context)));
		}
		  goto _L104
_L120:
		((Map) (hashmap)).put("isFirstCall", ((Object) (Boolean.toString(flag))));
		s1 = ((String) (new HashMap()));
		((Map) (s1)).put("cpu_abi", ((Object) (_mth02CE("ro.product.cpu.abi"))));
		((Map) (s1)).put("cpu_abi2", ((Object) (_mth02CE("ro.product.cpu.abi2"))));
		((Map) (s1)).put("arch", ((Object) (_mth02CE("os.arch"))));
		((Map) (s1)).put("build_display_id", ((Object) (_mth02CE("ro.build.display.id"))));
		if(!flag1)
			break MISSING_BLOCK_LABEL_4534;
		if(!_fld02CA02CA)
			break MISSING_BLOCK_LABEL_4454;
		s2 = ((String) (c.c._fld02CA));
		s2 = ((String) (com.appsflyer.c._mth02CB(context)));
		s3 = ((String) (new HashMap(3)));
		if(s2 == null)
			break MISSING_BLOCK_LABEL_4432;
		((Map) (s3)).put("lat", ((Object) (String.valueOf(((Location) (s2)).getLatitude()))));
		((Map) (s3)).put("lon", ((Object) (String.valueOf(((Location) (s2)).getLongitude()))));
		((Map) (s3)).put("ts", ((Object) (String.valueOf(((Location) (s2)).getTime()))));
		if(!((Map) (s3)).isEmpty())
			((Map) (s1)).put("loc", ((Object) (s3)));
		s2 = ((String) (b.e._fld0971._mth02CF(context)));
		((Map) (s1)).put("btl", ((Object) (Float.toString(((b.a) (s2))._mth02CF()))));
		if(((b.a) (s2))._mth0971() != null)
			((Map) (s1)).put("btch", ((Object) (((b.a) (s2))._mth0971())));
		if(2 < j)
			break MISSING_BLOCK_LABEL_4534;
		s2 = ((String) (g._mth0971(context)._mth02CB()));
		if(!((List) (s2)).isEmpty())
			((Map) (s1)).put("sensors", ((Object) (s2)));
		((Map) (s1)).put("dim", ((Object) (AFScreenManager.getScreenMetrics(context))));
		((Map) (hashmap)).put("deviceData", ((Object) (s1)));
		new s();
		context = ((Context) ((String)((Map) (hashmap)).get("appsflyerKey")));
		s1 = (String)((Map) (hashmap)).get("af_timestamp");
		s2 = (String)((Map) (hashmap)).get("uid");
		s3 = ((String) (new StringBuilder()));
		((StringBuilder) (s3)).append(((String) (context)).substring(0, 7));
		((StringBuilder) (s3)).append(s2.substring(0, 7));
		((StringBuilder) (s3)).append(s1.substring(s1.length() - 7));
		((Map) (hashmap)).put("af_v", ((Object) (s._mth02CE(((Object) (s3)).toString()))));
		new s();
		context = ((Context) ((String)((Map) (hashmap)).get("appsflyerKey")));
		s1 = ((String) (new StringBuilder()));
		((StringBuilder) (s1)).append(((String) (context)));
		((StringBuilder) (s1)).append(((Map) (hashmap)).get("af_timestamp"));
		context = ((Context) (((Object) (s1)).toString()));
		s1 = ((String) (new StringBuilder()));
		((StringBuilder) (s1)).append(((String) (context)));
		((StringBuilder) (s1)).append(((Map) (hashmap)).get("uid"));
		context = ((Context) (((Object) (s1)).toString()));
		s1 = ((String) (new StringBuilder()));
		((StringBuilder) (s1)).append(((String) (context)));
		((StringBuilder) (s1)).append(((Map) (hashmap)).get("installDate"));
		context = ((Context) (((Object) (s1)).toString()));
		s1 = ((String) (new StringBuilder()));
		((StringBuilder) (s1)).append(((String) (context)));
		((StringBuilder) (s1)).append(((Map) (hashmap)).get("counter"));
		context = ((Context) (((Object) (s1)).toString()));
		s1 = ((String) (new StringBuilder()));
		((StringBuilder) (s1)).append(((String) (context)));
		((StringBuilder) (s1)).append(((Map) (hashmap)).get("iaecounter"));
		((Map) (hashmap)).put("af_v2", ((Object) (s._mth02CE(s._mth02CB(((Object) (s1)).toString())))));
		if(!sharedpreferences.contains("is_stop_tracking_used")) goto _L104; else goto _L105
_L105:
		((Map) (hashmap)).put("istu", ((Object) (String.valueOf(sharedpreferences.getBoolean("is_stop_tracking_used", false)))));
		return ((Map) (hashmap));
_L50:
		AFLogger.afInfoLog("AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.getInstance().setAppsFlyerKey(...) to set it. ");
		_mth02CA(context, "AppsFlyer_4.8.9", "DEV_KEY_MISSING", ((String) (null)));
		AFLogger.afInfoLog("AppsFlyer will not track this event.");
		return null;
_L104:
		return ((Map) (hashmap));
		s1;
		  goto _L106
		s1;
		  goto _L107
_L3:
		if(flag1)
			obj = "Launch";
		else
			obj = ((Object) (s2));
		  goto _L108
_L8:
		l2 = -1L;
		  goto _L109
_L14:
		if(obj1 != null || obj == null) goto _L110; else goto _L15
_L20:
		obj = null;
		  goto _L111
_L30:
		j = 0;
		  goto _L112
_L29:
		j = 1;
		  goto _L112
_L33:
		j = 0;
		  goto _L113
_L32:
		j = 1;
		  goto _L113
_L36:
		j = 0;
		  goto _L114
_L35:
		j = 1;
		  goto _L114
_L39:
		j = 0;
		  goto _L115
_L38:
		j = 1;
		  goto _L115
_L41:
		obj = null;
_L42:
		if(obj == null) goto _L116; else goto _L27
_L68:
		s1 = null;
		  goto _L65
_L79:
		s1 = null;
		  goto _L76
_L88:
		s1 = "";
		  goto _L117
_L92:
		s1 = null;
		  goto _L118
_L102:
		j = 0;
		  goto _L119
	//*2182 5183:goto            4183
	//*2183 5186:goto            5189
		flag = true;
	// 2184 5189:iconst_1        
	// 2185 5190:istore          6
		if(flag2)
	//*2186 5192:iload           11
	//*2187 5194:ifne            5200
	//*2188 5197:goto            4255
			flag = false;
	// 2189 5200:iconst_0        
	// 2190 5201:istore          6
		  goto _L120
	//*2191 5203:goto            4255
	}

	final void _mth02CF(WeakReference weakreference)
	{
		HashMap hashmap;
		if(((Reference) (weakreference)).get() == null)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #612 <Method Object Reference.get()>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		AFLogger.afInfoLog("app went to background");
	//    4    8:ldc2            #2081 <String "app went to background">
	//    5   11:invokestatic    #308 <Method void AFLogger.afInfoLog(String)>
		Object obj = ((Object) (((Context)((Reference) (weakreference)).get()).getSharedPreferences("appsflyer-data", 0)));
	//    6   14:aload_1         
	//    7   15:invokevirtual   #612 <Method Object Reference.get()>
	//    8   18:checkcast       #274 <Class Context>
	//    9   21:ldc2            #534 <String "appsflyer-data">
	//   10   24:iconst_0        
	//   11   25:invokevirtual   #538 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   12   28:astore          6
		AppsFlyerProperties.getInstance().saveProperties(((SharedPreferences) (obj)));
	//   13   30:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//   14   33:aload           6
	//   15   35:invokevirtual   #542 <Method void AppsFlyerProperties.saveProperties(SharedPreferences)>
		long l1 = _fld02BD0971;
	//   16   38:aload_0         
	//   17   39:getfield        #1445 <Field long _fld02BD0971>
	//   18   42:lstore_2        
		long l2 = _fld02BF;
	//   19   43:aload_0         
	//   20   44:getfield        #320 <Field long _fld02BF>
	//   21   47:lstore          4
		hashmap = new HashMap();
	//   22   49:new             #480 <Class HashMap>
	//   23   52:dup             
	//   24   53:invokespecial   #481 <Method void HashMap()>
	//   25   56:astore          9
		String s2 = AppsFlyerProperties.getInstance().getString("AppsFlyerKey");
	//   26   58:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//   27   61:ldc2            #1348 <String "AppsFlyerKey">
	//   28   64:invokevirtual   #258 <Method String AppsFlyerProperties.getString(String)>
	//   29   67:astore          8
		if(s2 == null)
	//*  30   69:aload           8
	//*  31   71:ifnonnull       81
		{
			AFLogger.afWarnLog("[callStats] AppsFlyer's SDK cannot send any event without providing DevKey.");
	//   32   74:ldc2            #2083 <String "[callStats] AppsFlyer's SDK cannot send any event without providing DevKey.">
	//   33   77:invokestatic    #803 <Method void AFLogger.afWarnLog(String)>
			return;
	//   34   80:return          
		}
		String s1 = AppsFlyerProperties.getInstance().getString("KSAppsFlyerId");
	//   35   81:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//   36   84:ldc2            #1620 <String "KSAppsFlyerId">
	//   37   87:invokevirtual   #258 <Method String AppsFlyerProperties.getString(String)>
	//   38   90:astore          7
		if(AppsFlyerProperties.getInstance().getBoolean("deviceTrackingDisabled", false))
	//*  39   92:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//*  40   95:ldc2            #1765 <String "deviceTrackingDisabled">
	//*  41   98:iconst_0        
	//*  42   99:invokevirtual   #339 <Method boolean AppsFlyerProperties.getBoolean(String, boolean)>
	//*  43  102:ifeq            119
			((Map) (hashmap)).put("deviceTrackingDisabled", "true");
	//   44  105:aload           9
	//   45  107:ldc2            #1765 <String "deviceTrackingDisabled">
	//   46  110:ldc2            #362 <String "true">
	//   47  113:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//   48  118:pop             
		Object obj1 = ((Object) (o._mth0971(((Context)((Reference) (weakreference)).get()).getContentResolver())));
	//   49  119:aload_1         
	//   50  120:invokevirtual   #612 <Method Object Reference.get()>
	//   51  123:checkcast       #274 <Class Context>
	//   52  126:invokevirtual   #1757 <Method ContentResolver Context.getContentResolver()>
	//   53  129:invokestatic    #1937 <Method k o._mth0971(ContentResolver)>
	//   54  132:astore          10
		if(obj1 != null)
	//*  55  134:aload           10
	//*  56  136:ifnull          174
		{
			((Map) (hashmap)).put("amazon_aid", ((Object) (((k) (obj1))._mth02CA())));
	//   57  139:aload           9
	//   58  141:ldc2            #1939 <String "amazon_aid">
	//   59  144:aload           10
	//   60  146:invokevirtual   #1943 <Method String k._mth02CA()>
	//   61  149:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//   62  154:pop             
			((Map) (hashmap)).put("amazon_aid_limit", ((Object) (String.valueOf(((k) (obj1))._mth02CE()))));
	//   63  155:aload           9
	//   64  157:ldc2            #1945 <String "amazon_aid_limit">
	//   65  160:aload           10
	//   66  162:invokevirtual   #1946 <Method boolean k._mth02CE()>
	//   67  165:invokestatic    #1399 <Method String String.valueOf(boolean)>
	//   68  168:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//   69  173:pop             
		}
		obj1 = ((Object) (AppsFlyerProperties.getInstance().getString("advertiserId")));
	//   70  174:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//   71  177:ldc2            #1930 <String "advertiserId">
	//   72  180:invokevirtual   #258 <Method String AppsFlyerProperties.getString(String)>
	//   73  183:astore          10
		if(obj1 != null)
	//*  74  185:aload           10
	//*  75  187:ifnull          203
			((Map) (hashmap)).put("advertiserId", obj1);
	//   76  190:aload           9
	//   77  192:ldc2            #1930 <String "advertiserId">
	//   78  195:aload           10
	//   79  197:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//   80  202:pop             
		((Map) (hashmap)).put("app_id", ((Object) (((Context)((Reference) (weakreference)).get()).getPackageName())));
	//   81  203:aload           9
	//   82  205:ldc2            #2085 <String "app_id">
	//   83  208:aload_1         
	//   84  209:invokevirtual   #612 <Method Object Reference.get()>
	//   85  212:checkcast       #274 <Class Context>
	//   86  215:invokevirtual   #577 <Method String Context.getPackageName()>
	//   87  218:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//   88  223:pop             
		((Map) (hashmap)).put("devkey", ((Object) (s2)));
	//   89  224:aload           9
	//   90  226:ldc2            #2087 <String "devkey">
	//   91  229:aload           8
	//   92  231:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//   93  236:pop             
		((Map) (hashmap)).put("uid", ((Object) (q._mth02CB(weakreference))));
	//   94  237:aload           9
	//   95  239:ldc2            #1807 <String "uid">
	//   96  242:aload_1         
	//   97  243:invokestatic    #1298 <Method String q._mth02CB(WeakReference)>
	//   98  246:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//   99  251:pop             
		((Map) (hashmap)).put("time_in_app", ((Object) (String.valueOf((l1 - l2) / 1000L))));
	//  100  252:aload           9
	//  101  254:ldc2            #2089 <String "time_in_app">
	//  102  257:lload_2         
	//  103  258:lload           4
	//  104  260:lsub            
	//  105  261:ldc2w           #1631 <Long 1000L>
	//  106  264:ldiv            
	//  107  265:invokestatic    #2011 <Method String String.valueOf(long)>
	//  108  268:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//  109  273:pop             
		((Map) (hashmap)).put("statType", "user_closed_app");
	//  110  274:aload           9
	//  111  276:ldc2            #2091 <String "statType">
	//  112  279:ldc2            #2093 <String "user_closed_app">
	//  113  282:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//  114  287:pop             
		((Map) (hashmap)).put("platform", "Android");
	//  115  288:aload           9
	//  116  290:ldc2            #2095 <String "platform">
	//  117  293:ldc2            #2097 <String "Android">
	//  118  296:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//  119  301:pop             
		((Map) (hashmap)).put("launch_counter", ((Object) (Integer.toString(_mth02CE(((SharedPreferences) (obj)), "appsFlyerCount", false)))));
	//  120  302:aload           9
	//  121  304:ldc2            #2099 <String "launch_counter">
	//  122  307:aload           6
	//  123  309:ldc2            #579 <String "appsFlyerCount">
	//  124  312:iconst_0        
	//  125  313:invokestatic    #582 <Method int _mth02CE(SharedPreferences, String, boolean)>
	//  126  316:invokestatic    #703 <Method String Integer.toString(int)>
	//  127  319:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//  128  324:pop             
		((Map) (hashmap)).put("gcd_conversion_data_timing", ((Object) (Long.toString(((SharedPreferences) (obj)).getLong("appsflyerGetConversionDataTiming", 0L)))));
	//  129  325:aload           9
	//  130  327:ldc2            #2101 <String "gcd_conversion_data_timing">
	//  131  330:aload           6
	//  132  332:ldc2            #2103 <String "appsflyerGetConversionDataTiming">
	//  133  335:lconst_0        
	//  134  336:invokeinterface #786 <Method long SharedPreferences.getLong(String, long)>
	//  135  341:invokestatic    #1497 <Method String Long.toString(long)>
	//  136  344:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//  137  349:pop             
		s2 = AppsFlyerProperties.getInstance().getString("channel");
	//  138  350:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//  139  353:ldc1            #254 <String "channel">
	//  140  355:invokevirtual   #258 <Method String AppsFlyerProperties.getString(String)>
	//  141  358:astore          8
		obj = ((Object) (s2));
	//  142  360:aload           8
	//  143  362:astore          6
		if(s2 == null)
	//* 144  364:aload           8
	//* 145  366:ifnonnull       378
			obj = ((Object) (_mth02CE(weakreference, "CHANNEL")));
	//  146  369:aload_1         
	//  147  370:ldc2            #260 <String "CHANNEL">
	//  148  373:invokestatic    #263 <Method String _mth02CE(WeakReference, String)>
	//  149  376:astore          6
		((Map) (hashmap)).put("channel", obj);
	//  150  378:aload           9
	//  151  380:ldc1            #254 <String "channel">
	//  152  382:aload           6
	//  153  384:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//  154  389:pop             
		if(s1 != null)
	//* 155  390:aload           7
	//* 156  392:ifnull          401
			weakreference = ((WeakReference) (s1));
	//  157  395:aload           7
	//  158  397:astore_1        
		else
	//* 159  398:goto            405
			weakreference = "";
	//  160  401:ldc2            #922 <String "">
	//  161  404:astore_1        
		((Map) (hashmap)).put("originalAppsflyerId", ((Object) (weakreference)));
	//  162  405:aload           9
	//  163  407:ldc2            #1665 <String "originalAppsflyerId">
	//  164  410:aload_1         
	//  165  411:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//  166  416:pop             
		if(!_fld02CB02CB)
			break MISSING_BLOCK_LABEL_579;
	//  167  417:aload_0         
	//  168  418:getfield        #195 <Field boolean _fld02CB02CB>
	//  169  421:ifeq            579
		String as[];
		weakreference = ((WeakReference) (new l(((Context) (null)), isTrackingStopped())));
	//  170  424:new             #2105 <Class l>
	//  171  427:dup             
	//  172  428:aconst_null     
	//  173  429:aload_0         
	//  174  430:invokevirtual   #545 <Method boolean isTrackingStopped()>
	//  175  433:invokespecial   #2108 <Method void l(Context, boolean)>
	//  176  436:astore_1        
		weakreference._fld02CB = ((Map) (hashmap));
	//  177  437:aload_1         
	//  178  438:aload           9
	//  179  440:putfield        #2110 <Field Map l._fld02CB>
		if(Thread.currentThread() != Looper.getMainLooper().getThread())
			break MISSING_BLOCK_LABEL_503;
	//  180  443:invokestatic    #2116 <Method Thread Thread.currentThread()>
	//  181  446:invokestatic    #2122 <Method Looper Looper.getMainLooper()>
	//  182  449:invokevirtual   #2125 <Method Thread Looper.getThread()>
	//  183  452:if_acmpne       503
		AFLogger.afDebugLog("Main thread detected. Running callStats task in a new thread.");
	//  184  455:ldc2            #2127 <String "Main thread detected. Running callStats task in a new thread.">
	//  185  458:invokestatic    #532 <Method void AFLogger.afDebugLog(String)>
		as = new String[1];
	//  186  461:iconst_1        
	//  187  462:anewarray       String[]
	//  188  465:astore          6
		as[0] = ServerConfigHandler.getUrl("https://stats.%s/stats");
	//  189  467:aload           6
	//  190  469:iconst_0        
	//  191  470:ldc2            #2129 <String "https://stats.%s/stats">
	//  192  473:invokestatic    #574 <Method String ServerConfigHandler.getUrl(String)>
	//  193  476:aastore         
		if(!(weakreference instanceof AsyncTask))
	//* 194  477:aload_1         
	//* 195  478:instanceof      #740 <Class AsyncTask>
	//* 196  481:ifne            492
		{
			((AsyncTask) (weakreference)).execute(((Object []) (as)));
	//  197  484:aload_1         
	//  198  485:aload           6
	//  199  487:invokevirtual   #743 <Method AsyncTask AsyncTask.execute(Object[])>
	//  200  490:pop             
			return;
	//  201  491:return          
		}
		StringBuilder stringbuilder;
		try
		{
			AsyncTaskInstrumentation.execute((AsyncTask)weakreference, ((Object []) (as)));
	//  202  492:aload_1         
	//  203  493:checkcast       #740 <Class AsyncTask>
	//  204  496:aload           6
	//  205  498:invokestatic    #748 <Method AsyncTask AsyncTaskInstrumentation.execute(AsyncTask, Object[])>
	//  206  501:pop             
			return;
	//  207  502:return          
		}
	//* 208  503:new             #95  <Class StringBuilder>
	//* 209  506:dup             
	//* 210  507:ldc2            #2131 <String "Running callStats task (on current thread: ">
	//* 211  510:invokespecial   #115 <Method void StringBuilder(String)>
	//* 212  513:astore          6
	//* 213  515:aload           6
	//* 214  517:invokestatic    #2116 <Method Thread Thread.currentThread()>
	//* 215  520:invokevirtual   #108 <Method String Object.toString()>
	//* 216  523:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//* 217  526:pop             
	//* 218  527:aload           6
	//* 219  529:ldc2            #2133 <String " )">
	//* 220  532:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//* 221  535:pop             
	//* 222  536:aload           6
	//* 223  538:invokevirtual   #108 <Method String Object.toString()>
	//* 224  541:invokestatic    #532 <Method void AFLogger.afDebugLog(String)>
	//* 225  544:aload_1         
	//* 226  545:invokevirtual   #2136 <Method void l.onPreExecute()>
	//* 227  548:aload_1         
	//* 228  549:aload_1         
	//* 229  550:iconst_1        
	//* 230  551:anewarray       String[]
	//* 231  554:dup             
	//* 232  555:iconst_0        
	//* 233  556:ldc2            #2129 <String "https://stats.%s/stats">
	//* 234  559:invokestatic    #574 <Method String ServerConfigHandler.getUrl(String)>
	//* 235  562:aastore         
	//* 236  563:invokevirtual   #2139 <Method String l._mth02CF(String[])>
	//* 237  566:invokevirtual   #2140 <Method void l._mth02CB(String)>
	//* 238  569:return          
		// Misplaced declaration of an exception variable
		catch(WeakReference weakreference)
	//* 239  570:astore_1        
		{
			AFLogger.afErrorLog("Could not send callStats request", ((Throwable) (weakreference)));
	//  240  571:ldc2            #2142 <String "Could not send callStats request">
	//  241  574:aload_1         
	//  242  575:invokestatic    #245 <Method void AFLogger.afErrorLog(String, Throwable)>
		}
		break MISSING_BLOCK_LABEL_578;
		stringbuilder = new StringBuilder("Running callStats task (on current thread: ");
		stringbuilder.append(((Object) (Thread.currentThread())).toString());
		stringbuilder.append(" )");
		AFLogger.afDebugLog(((Object) (stringbuilder)).toString());
		((l) (weakreference)).onPreExecute();
		((l) (weakreference))._mth02CB(((l) (weakreference))._mth02CF(new String[] {
			ServerConfigHandler.getUrl("https://stats.%s/stats")
		}));
		return;
		return;
	//  243  578:return          
		AFLogger.afDebugLog("Stats call is disabled, ignore ...");
	//  244  579:ldc2            #2144 <String "Stats call is disabled, ignore ...">
	//  245  582:invokestatic    #532 <Method void AFLogger.afDebugLog(String)>
		return;
	//  246  585:return          
	}

	final void _mth0971(Context context, String s1)
	{
		String s3;
		HashMap hashmap;
		boolean flag;
		if(AppsFlyerProperties.getInstance().getBoolean("waitForCustomerId", false) && AppsFlyerProperties.getInstance().getString("AppUserId") == null)
	//*   0    0:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//*   1    3:ldc2            #389 <String "waitForCustomerId">
	//*   2    6:iconst_0        
	//*   3    7:invokevirtual   #339 <Method boolean AppsFlyerProperties.getBoolean(String, boolean)>
	//*   4   10:ifeq            30
	//*   5   13:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//*   6   16:ldc2            #391 <String "AppUserId">
	//*   7   19:invokevirtual   #258 <Method String AppsFlyerProperties.getString(String)>
	//*   8   22:ifnonnull       30
			flag = true;
	//    9   25:iconst_1        
	//   10   26:istore_3        
		else
	//*  11   27:goto            32
			flag = false;
	//   12   30:iconst_0        
	//   13   31:istore_3        
		if(flag)
	//*  14   32:iload_3         
	//*  15   33:ifeq            44
		{
			AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
	//   16   36:ldc2            #393 <String "CustomerUserId not set, Tracking is disabled">
	//   17   39:iconst_1        
	//   18   40:invokestatic    #396 <Method void AFLogger.afInfoLog(String, boolean)>
			return;
	//   19   43:return          
		}
		hashmap = new HashMap();
	//   20   44:new             #480 <Class HashMap>
	//   21   47:dup             
	//   22   48:invokespecial   #481 <Method void HashMap()>
	//   23   51:astore          8
		String s2 = AppsFlyerProperties.getInstance().getString("AppsFlyerKey");
	//   24   53:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//   25   56:ldc2            #1348 <String "AppsFlyerKey">
	//   26   59:invokevirtual   #258 <Method String AppsFlyerProperties.getString(String)>
	//   27   62:astore          6
		if(s2 == null)
	//*  28   64:aload           6
	//*  29   66:ifnonnull       76
		{
			AFLogger.afWarnLog("[registerUninstall] AppsFlyer's SDK cannot send any event without providing DevKey.");
	//   30   69:ldc2            #2147 <String "[registerUninstall] AppsFlyer's SDK cannot send any event without providing DevKey.">
	//   31   72:invokestatic    #803 <Method void AFLogger.afWarnLog(String)>
			return;
	//   32   75:return          
		}
		Object obj = ((Object) (context.getPackageManager()));
	//   33   76:aload_1         
	//   34   77:invokevirtual   #930 <Method PackageManager Context.getPackageManager()>
	//   35   80:astore          9
		s3 = context.getPackageName();
	//   36   82:aload_1         
	//   37   83:invokevirtual   #577 <Method String Context.getPackageName()>
	//   38   86:astore          7
		try
		{
			PackageInfo packageinfo = ((PackageManager) (obj)).getPackageInfo(s3, 0);
	//   39   88:aload           9
	//   40   90:aload           7
	//   41   92:iconst_0        
	//   42   93:invokevirtual   #934 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   43   96:astore          10
			((Map) (hashmap)).put("app_version_code", ((Object) (Integer.toString(packageinfo.versionCode))));
	//   44   98:aload           8
	//   45  100:ldc2            #1852 <String "app_version_code">
	//   46  103:aload           10
	//   47  105:getfield        #1850 <Field int PackageInfo.versionCode>
	//   48  108:invokestatic    #703 <Method String Integer.toString(int)>
	//   49  111:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//   50  116:pop             
			((Map) (hashmap)).put("app_version_name", ((Object) (packageinfo.versionName)));
	//   51  117:aload           8
	//   52  119:ldc2            #1854 <String "app_version_name">
	//   53  122:aload           10
	//   54  124:getfield        #1857 <Field String PackageInfo.versionName>
	//   55  127:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//   56  132:pop             
			((Map) (hashmap)).put("app_name", ((Object) (((PackageManager) (obj)).getApplicationLabel(packageinfo.applicationInfo).toString())));
	//   57  133:aload           8
	//   58  135:ldc2            #2149 <String "app_name">
	//   59  138:aload           9
	//   60  140:aload           10
	//   61  142:getfield        #2153 <Field ApplicationInfo PackageInfo.applicationInfo>
	//   62  145:invokevirtual   #2157 <Method CharSequence PackageManager.getApplicationLabel(ApplicationInfo)>
	//   63  148:invokeinterface #2160 <Method String CharSequence.toString()>
	//   64  153:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//   65  158:pop             
			long l1 = packageinfo.firstInstallTime;
	//   66  159:aload           10
	//   67  161:getfield        #952 <Field long PackageInfo.firstInstallTime>
	//   68  164:lstore          4
			obj = ((Object) (new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US)));
	//   69  166:new             #936 <Class SimpleDateFormat>
	//   70  169:dup             
	//   71  170:ldc2            #1842 <String "yyyy-MM-dd_HHmmssZ">
	//   72  173:getstatic       #944 <Field Locale Locale.US>
	//   73  176:invokespecial   #947 <Method void SimpleDateFormat(String, Locale)>
	//   74  179:astore          9
			((DateFormat) (obj)).setTimeZone(TimeZone.getTimeZone("UTC"));
	//   75  181:aload           9
	//   76  183:ldc2            #954 <String "UTC">
	//   77  186:invokestatic    #960 <Method TimeZone TimeZone.getTimeZone(String)>
	//   78  189:invokevirtual   #966 <Method void DateFormat.setTimeZone(TimeZone)>
			((Map) (hashmap)).put("installDate", ((Object) (((DateFormat) (obj)).format(new Date(l1)))));
	//   79  192:aload           8
	//   80  194:ldc2            #1844 <String "installDate">
	//   81  197:aload           9
	//   82  199:new             #968 <Class Date>
	//   83  202:dup             
	//   84  203:lload           4
	//   85  205:invokespecial   #971 <Method void Date(long)>
	//   86  208:invokevirtual   #975 <Method String DateFormat.format(Date)>
	//   87  211:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//   88  216:pop             
		}
	//*  89  217:goto            230
		catch(Throwable throwable)
	//*  90  220:astore          9
		{
			AFLogger.afErrorLog("Exception while collecting application version info.", throwable);
	//   91  222:ldc2            #2162 <String "Exception while collecting application version info.">
	//   92  225:aload           9
	//   93  227:invokestatic    #245 <Method void AFLogger.afErrorLog(String, Throwable)>
		}
		_mth02CB(context, ((Map) (hashmap)));
	//   94  230:aload_1         
	//   95  231:aload           8
	//   96  233:invokestatic    #1840 <Method void _mth02CB(Context, Map)>
		throwable = ((Throwable) (AppsFlyerProperties.getInstance().getString("AppUserId")));
	//   97  236:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//   98  239:ldc2            #391 <String "AppUserId">
	//   99  242:invokevirtual   #258 <Method String AppsFlyerProperties.getString(String)>
	//  100  245:astore          9
		if(throwable != null)
	//* 101  247:aload           9
	//* 102  249:ifnull          265
			((Map) (hashmap)).put("appUserId", ((Object) (throwable)));
	//  103  252:aload           8
	//  104  254:ldc2            #1716 <String "appUserId">
	//  105  257:aload           9
	//  106  259:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//  107  264:pop             
		try
		{
			((Map) (hashmap)).put("model", ((Object) (Build.MODEL)));
	//  108  265:aload           8
	//  109  267:ldc2            #1557 <String "model">
	//  110  270:getstatic       #1560 <Field String Build.MODEL>
	//  111  273:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//  112  278:pop             
			((Map) (hashmap)).put("brand", ((Object) (Build.BRAND)));
	//  113  279:aload           8
	//  114  281:ldc2            #1540 <String "brand">
	//  115  284:getstatic       #1545 <Field String Build.BRAND>
	//  116  287:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//  117  292:pop             
		}
	//* 118  293:goto            306
		catch(Throwable throwable1)
	//* 119  296:astore          9
		{
			AFLogger.afErrorLog("Exception while collecting device brand and model.", throwable1);
	//  120  298:ldc2            #2164 <String "Exception while collecting device brand and model.">
	//  121  301:aload           9
	//  122  303:invokestatic    #245 <Method void AFLogger.afErrorLog(String, Throwable)>
		}
		if(AppsFlyerProperties.getInstance().getBoolean("deviceTrackingDisabled", false))
	//* 123  306:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//* 124  309:ldc2            #1765 <String "deviceTrackingDisabled">
	//* 125  312:iconst_0        
	//* 126  313:invokevirtual   #339 <Method boolean AppsFlyerProperties.getBoolean(String, boolean)>
	//* 127  316:ifeq            333
			((Map) (hashmap)).put("deviceTrackingDisabled", "true");
	//  128  319:aload           8
	//  129  321:ldc2            #1765 <String "deviceTrackingDisabled">
	//  130  324:ldc2            #362 <String "true">
	//  131  327:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//  132  332:pop             
		throwable1 = ((Throwable) (o._mth0971(context.getContentResolver())));
	//  133  333:aload_1         
	//  134  334:invokevirtual   #1757 <Method ContentResolver Context.getContentResolver()>
	//  135  337:invokestatic    #1937 <Method k o._mth0971(ContentResolver)>
	//  136  340:astore          9
		if(throwable1 != null)
	//* 137  342:aload           9
	//* 138  344:ifnull          382
		{
			((Map) (hashmap)).put("amazon_aid", ((Object) (((k) (throwable1))._mth02CA())));
	//  139  347:aload           8
	//  140  349:ldc2            #1939 <String "amazon_aid">
	//  141  352:aload           9
	//  142  354:invokevirtual   #1943 <Method String k._mth02CA()>
	//  143  357:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//  144  362:pop             
			((Map) (hashmap)).put("amazon_aid_limit", ((Object) (String.valueOf(((k) (throwable1))._mth02CE()))));
	//  145  363:aload           8
	//  146  365:ldc2            #1945 <String "amazon_aid_limit">
	//  147  368:aload           9
	//  148  370:invokevirtual   #1946 <Method boolean k._mth02CE()>
	//  149  373:invokestatic    #1399 <Method String String.valueOf(boolean)>
	//  150  376:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//  151  381:pop             
		}
		throwable1 = ((Throwable) (AppsFlyerProperties.getInstance().getString("advertiserId")));
	//  152  382:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//  153  385:ldc2            #1930 <String "advertiserId">
	//  154  388:invokevirtual   #258 <Method String AppsFlyerProperties.getString(String)>
	//  155  391:astore          9
		if(throwable1 != null)
	//* 156  393:aload           9
	//* 157  395:ifnull          411
			((Map) (hashmap)).put("advertiserId", ((Object) (throwable1)));
	//  158  398:aload           8
	//  159  400:ldc2            #1930 <String "advertiserId">
	//  160  403:aload           9
	//  161  405:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//  162  410:pop             
		((Map) (hashmap)).put("devkey", ((Object) (s2)));
	//  163  411:aload           8
	//  164  413:ldc2            #2087 <String "devkey">
	//  165  416:aload           6
	//  166  418:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//  167  423:pop             
		((Map) (hashmap)).put("uid", ((Object) (q._mth02CB(new WeakReference(((Object) (context)))))));
	//  168  424:aload           8
	//  169  426:ldc2            #1807 <String "uid">
	//  170  429:new             #413 <Class WeakReference>
	//  171  432:dup             
	//  172  433:aload_1         
	//  173  434:invokespecial   #416 <Method void WeakReference(Object)>
	//  174  437:invokestatic    #1298 <Method String q._mth02CB(WeakReference)>
	//  175  440:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//  176  445:pop             
		((Map) (hashmap)).put("af_gcm_token", ((Object) (s1)));
	//  177  446:aload           8
	//  178  448:ldc2            #1876 <String "af_gcm_token">
	//  179  451:aload_2         
	//  180  452:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//  181  457:pop             
		((Map) (hashmap)).put("launch_counter", ((Object) (Integer.toString(_mth02CE(context.getSharedPreferences("appsflyer-data", 0), "appsFlyerCount", false)))));
	//  182  458:aload           8
	//  183  460:ldc2            #2099 <String "launch_counter">
	//  184  463:aload_1         
	//  185  464:ldc2            #534 <String "appsflyer-data">
	//  186  467:iconst_0        
	//  187  468:invokevirtual   #538 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//  188  471:ldc2            #579 <String "appsFlyerCount">
	//  189  474:iconst_0        
	//  190  475:invokestatic    #582 <Method int _mth02CE(SharedPreferences, String, boolean)>
	//  191  478:invokestatic    #703 <Method String Integer.toString(int)>
	//  192  481:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//  193  486:pop             
		((Map) (hashmap)).put("sdk", ((Object) (Integer.toString(android.os.Build.VERSION.SDK_INT))));
	//  194  487:aload           8
	//  195  489:ldc2            #382 <String "sdk">
	//  196  492:getstatic       #288 <Field int android.os.Build$VERSION.SDK_INT>
	//  197  495:invokestatic    #703 <Method String Integer.toString(int)>
	//  198  498:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//  199  503:pop             
		throwable1 = ((Throwable) (new WeakReference(((Object) (context)))));
	//  200  504:new             #413 <Class WeakReference>
	//  201  507:dup             
	//  202  508:aload_1         
	//  203  509:invokespecial   #416 <Method void WeakReference(Object)>
	//  204  512:astore          9
		s2 = AppsFlyerProperties.getInstance().getString("channel");
	//  205  514:invokestatic    #252 <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//  206  517:ldc1            #254 <String "channel">
	//  207  519:invokevirtual   #258 <Method String AppsFlyerProperties.getString(String)>
	//  208  522:astore          6
		s1 = s2;
	//  209  524:aload           6
	//  210  526:astore_2        
		if(s2 == null)
	//* 211  527:aload           6
	//* 212  529:ifnonnull       541
			s1 = _mth02CE(((WeakReference) (throwable1)), "CHANNEL");
	//  213  532:aload           9
	//  214  534:ldc2            #260 <String "CHANNEL">
	//  215  537:invokestatic    #263 <Method String _mth02CE(WeakReference, String)>
	//  216  540:astore_2        
		if(s1 != null)
	//* 217  541:aload_2         
	//* 218  542:ifnull          556
			((Map) (hashmap)).put("channel", ((Object) (s1)));
	//  219  545:aload           8
	//  220  547:ldc1            #254 <String "channel">
	//  221  549:aload_2         
	//  222  550:invokeinterface #436 <Method Object Map.put(Object, Object)>
	//  223  555:pop             
		String as[];
		context = ((Context) (new l(context, isTrackingStopped())));
	//  224  556:new             #2105 <Class l>
	//  225  559:dup             
	//  226  560:aload_1         
	//  227  561:aload_0         
	//  228  562:invokevirtual   #545 <Method boolean isTrackingStopped()>
	//  229  565:invokespecial   #2108 <Method void l(Context, boolean)>
	//  230  568:astore_1        
		context._fld02CB = ((Map) (hashmap));
	//  231  569:aload_1         
	//  232  570:aload           8
	//  233  572:putfield        #2110 <Field Map l._fld02CB>
		s1 = ((String) (new StringBuilder()));
	//  234  575:new             #95  <Class StringBuilder>
	//  235  578:dup             
	//  236  579:invokespecial   #98  <Method void StringBuilder()>
	//  237  582:astore_2        
		((StringBuilder) (s1)).append(ServerConfigHandler.getUrl(_fld02CE));
	//  238  583:aload_2         
	//  239  584:getstatic       #129 <Field String _fld02CE>
	//  240  587:invokestatic    #574 <Method String ServerConfigHandler.getUrl(String)>
	//  241  590:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//  242  593:pop             
		((StringBuilder) (s1)).append(s3);
	//  243  594:aload_2         
	//  244  595:aload           7
	//  245  597:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//  246  600:pop             
		s1 = ((Object) (s1)).toString();
	//  247  601:aload_2         
	//  248  602:invokevirtual   #108 <Method String Object.toString()>
	//  249  605:astore_2        
		as = new String[1];
	//  250  606:iconst_1        
	//  251  607:anewarray       String[]
	//  252  610:astore          6
		as[0] = s1;
	//  253  612:aload           6
	//  254  614:iconst_0        
	//  255  615:aload_2         
	//  256  616:aastore         
		if(!(context instanceof AsyncTask))
	//* 257  617:aload_1         
	//* 258  618:instanceof      #740 <Class AsyncTask>
	//* 259  621:ifne            632
		{
			((AsyncTask) (context)).execute(((Object []) (as)));
	//  260  624:aload_1         
	//  261  625:aload           6
	//  262  627:invokevirtual   #743 <Method AsyncTask AsyncTask.execute(Object[])>
	//  263  630:pop             
			return;
	//  264  631:return          
		}
		try
		{
			AsyncTaskInstrumentation.execute((AsyncTask)context, ((Object []) (as)));
	//  265  632:aload_1         
	//  266  633:checkcast       #740 <Class AsyncTask>
	//  267  636:aload           6
	//  268  638:invokestatic    #748 <Method AsyncTask AsyncTaskInstrumentation.execute(AsyncTask, Object[])>
	//  269  641:pop             
			return;
	//  270  642:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 271  643:astore_1        
		{
			AFLogger.afErrorLog(((Throwable) (context)).getMessage(), ((Throwable) (context)));
	//  272  644:aload_1         
	//  273  645:invokevirtual   #817 <Method String Throwable.getMessage()>
	//  274  648:aload_1         
	//  275  649:invokestatic    #245 <Method void AFLogger.afErrorLog(String, Throwable)>
		}
		return;
	//  276  652:return          
	}

	private static String _fld02BB;
	private static AppsFlyerLib _fld02BC0971 = new AppsFlyerLib();
	private static String _fld02BD;
	static final String _fld02CA = "4.8.9".substring(0, "4.8.9".indexOf("."));
	private static final List _fld02CA0971 = Arrays.asList(((Object []) (new String[] {
		"is_cache"
	})));
	private static AppsFlyerConversionListener _fld02CB0971 = null;
	static final String _fld02CE;
	private static final List _fld037A = Arrays.asList(((Object []) (new String[] {
		"googleplay", "playstore", "googleplaystore"
	})));
	static AppsFlyerInAppPurchaseValidatorListener _fld0971 = null;
	private static String _fld09710971;
	private static final String _fld141D;
	private long _fld02BB0971;
	private long _fld02BC;
	private long _fld02BD0971;
	private Uri _fld02BE;
	private long _fld02BF;
	private p.b _fld02C8;
	private long _fld02C9;
	private boolean _fld02CA02CA;
	private String _fld02CA141D;
	String _fld02CB;
	private boolean _fld02CB02CA;
	private boolean _fld02CB02CB;
	private boolean _fld02CB141D;
	private boolean _fld02CC;
	private r _fld02CD;
	private boolean _fld02CE02CE;
	String _fld02CF;
	private long _fld02CF0971;
	private long _fld097102CA;
	private com.appsflyer.a _fld097102CB;
	private ScheduledExecutorService _fld097102CE;
	private Map _fld0971141D;
	private boolean _fld141D0971;

	static 
	{
	//    0    0:ldc1            #79  <String "4.8.9">
	//    1    2:iconst_0        
	//    2    3:ldc1            #79  <String "4.8.9">
	//    3    5:ldc1            #81  <String ".">
	//    4    7:invokevirtual   #87  <Method int String.indexOf(String)>
	//    5   10:invokevirtual   #91  <Method String String.substring(int, int)>
	//    6   13:putstatic       #93  <Field String _fld02CA>
		StringBuilder stringbuilder = new StringBuilder();
	//    7   16:new             #95  <Class StringBuilder>
	//    8   19:dup             
	//    9   20:invokespecial   #98  <Method void StringBuilder()>
	//   10   23:astore_0        
		stringbuilder.append(_fld02CA);
	//   11   24:aload_0         
	//   12   25:getstatic       #93  <Field String _fld02CA>
	//   13   28:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   14   31:pop             
		stringbuilder.append("/androidevent?buildnumber=4.8.9&app_id=");
	//   15   32:aload_0         
	//   16   33:ldc1            #104 <String "/androidevent?buildnumber=4.8.9&app_id=">
	//   17   35:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   18   38:pop             
		_fld141D = ((Object) (stringbuilder)).toString();
	//   19   39:aload_0         
	//   20   40:invokevirtual   #108 <Method String Object.toString()>
	//   21   43:putstatic       #110 <Field String _fld141D>
		stringbuilder = new StringBuilder("https://attr.%s/api/v");
	//   22   46:new             #95  <Class StringBuilder>
	//   23   49:dup             
	//   24   50:ldc1            #112 <String "https://attr.%s/api/v">
	//   25   52:invokespecial   #115 <Method void StringBuilder(String)>
	//   26   55:astore_0        
		stringbuilder.append(_fld141D);
	//   27   56:aload_0         
	//   28   57:getstatic       #110 <Field String _fld141D>
	//   29   60:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   30   63:pop             
		_fld09710971 = ((Object) (stringbuilder)).toString();
	//   31   64:aload_0         
	//   32   65:invokevirtual   #108 <Method String Object.toString()>
	//   33   68:putstatic       #117 <Field String _fld09710971>
		stringbuilder = new StringBuilder("https://t.%s/api/v");
	//   34   71:new             #95  <Class StringBuilder>
	//   35   74:dup             
	//   36   75:ldc1            #119 <String "https://t.%s/api/v">
	//   37   77:invokespecial   #115 <Method void StringBuilder(String)>
	//   38   80:astore_0        
		stringbuilder.append(_fld141D);
	//   39   81:aload_0         
	//   40   82:getstatic       #110 <Field String _fld141D>
	//   41   85:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   42   88:pop             
		_fld02BD = ((Object) (stringbuilder)).toString();
	//   43   89:aload_0         
	//   44   90:invokevirtual   #108 <Method String Object.toString()>
	//   45   93:putstatic       #121 <Field String _fld02BD>
		stringbuilder = new StringBuilder("https://events.%s/api/v");
	//   46   96:new             #95  <Class StringBuilder>
	//   47   99:dup             
	//   48  100:ldc1            #123 <String "https://events.%s/api/v">
	//   49  102:invokespecial   #115 <Method void StringBuilder(String)>
	//   50  105:astore_0        
		stringbuilder.append(_fld141D);
	//   51  106:aload_0         
	//   52  107:getstatic       #110 <Field String _fld141D>
	//   53  110:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   54  113:pop             
		_fld02BB = ((Object) (stringbuilder)).toString();
	//   55  114:aload_0         
	//   56  115:invokevirtual   #108 <Method String Object.toString()>
	//   57  118:putstatic       #125 <Field String _fld02BB>
		stringbuilder = new StringBuilder("https://register.%s/api/v");
	//   58  121:new             #95  <Class StringBuilder>
	//   59  124:dup             
	//   60  125:ldc1            #127 <String "https://register.%s/api/v">
	//   61  127:invokespecial   #115 <Method void StringBuilder(String)>
	//   62  130:astore_0        
		stringbuilder.append(_fld141D);
	//   63  131:aload_0         
	//   64  132:getstatic       #110 <Field String _fld141D>
	//   65  135:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   66  138:pop             
		_fld02CE = ((Object) (stringbuilder)).toString();
	//   67  139:aload_0         
	//   68  140:invokevirtual   #108 <Method String Object.toString()>
	//   69  143:putstatic       #129 <Field String _fld02CE>
	//   70  146:iconst_1        
	//   71  147:anewarray       String[]
	//   72  150:dup             
	//   73  151:iconst_0        
	//   74  152:ldc1            #131 <String "is_cache">
	//   75  154:aastore         
	//   76  155:invokestatic    #137 <Method List Arrays.asList(Object[])>
	//   77  158:putstatic       #139 <Field List _fld02CA0971>
	//   78  161:iconst_3        
	//   79  162:anewarray       String[]
	//   80  165:dup             
	//   81  166:iconst_0        
	//   82  167:ldc1            #141 <String "googleplay">
	//   83  169:aastore         
	//   84  170:dup             
	//   85  171:iconst_1        
	//   86  172:ldc1            #143 <String "playstore">
	//   87  174:aastore         
	//   88  175:dup             
	//   89  176:iconst_2        
	//   90  177:ldc1            #145 <String "googleplaystore">
	//   91  179:aastore         
	//   92  180:invokestatic    #137 <Method List Arrays.asList(Object[])>
	//   93  183:putstatic       #147 <Field List _fld037A>
	//   94  186:aconst_null     
	//   95  187:putstatic       #149 <Field AppsFlyerConversionListener _fld02CB0971>
	//   96  190:aconst_null     
	//   97  191:putstatic       #151 <Field AppsFlyerInAppPurchaseValidatorListener _fld0971>
	//   98  194:new             #2   <Class AppsFlyerLib>
	//   99  197:dup             
	//  100  198:invokespecial   #152 <Method void AppsFlyerLib()>
	//  101  201:putstatic       #154 <Field AppsFlyerLib _fld02BC0971>
	//* 102  204:return          
	}
}
