// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android;

import com.gigya.socialize.*;
import com.gigya.socialize.android.managers.SessionManager;
import java.util.List;

// Referenced classes of package com.gigya.socialize.android:
//			GSPermissionResultHandler, GSAPI, GSAsyncRequest, GSSession

class GSAPI$10$1
	implements GSPermissionResultHandler
{

	public void onResult(boolean flag, Exception exception, List list)
	{
		val$params2.put("sdk", "android_3.3.26");
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field GSObject val$params2>
	//    2    4:ldc1            #28  <String "sdk">
	//    3    6:ldc1            #30  <String "android_3.3.26">
	//    4    8:invokevirtual   #36  <Method void GSObject.put(String, String)>
		val$params2.put("targetEnv", "mobile");
	//    5   11:aload_0         
	//    6   12:getfield        #21  <Field GSObject val$params2>
	//    7   15:ldc1            #38  <String "targetEnv">
	//    8   17:ldc1            #40  <String "mobile">
	//    9   19:invokevirtual   #36  <Method void GSObject.put(String, String)>
		val$params2.put("ucid", getUCID());
	//   10   22:aload_0         
	//   11   23:getfield        #21  <Field GSObject val$params2>
	//   12   26:ldc1            #42  <String "ucid">
	//   13   28:aload_0         
	//   14   29:getfield        #19  <Field GSAPI$10 this$1>
	//   15   32:getfield        #46  <Field GSAPI GSAPI$10.this$0>
	//   16   35:invokevirtual   #52  <Method String GSAPI.getUCID()>
	//   17   38:invokevirtual   #36  <Method void GSObject.put(String, String)>
		if(val$params2.getBool("noAuth", false))
	//*  18   41:aload_0         
	//*  19   42:getfield        #21  <Field GSObject val$params2>
	//*  20   45:ldc1            #54  <String "noAuth">
	//*  21   47:iconst_0        
	//*  22   48:invokevirtual   #58  <Method boolean GSObject.getBool(String, boolean)>
	//*  23   51:ifeq            162
		{
			val$params2.remove("noAuth");
	//   24   54:aload_0         
	//   25   55:getfield        #21  <Field GSObject val$params2>
	//   26   58:ldc1            #54  <String "noAuth">
	//   27   60:invokevirtual   #62  <Method void GSObject.remove(String)>
			flag = val$params2.getString("include", "").contains(",ids");
	//   28   63:aload_0         
	//   29   64:getfield        #21  <Field GSObject val$params2>
	//   30   67:ldc1            #64  <String "include">
	//   31   69:ldc1            #66  <String "">
	//   32   71:invokevirtual   #70  <Method String GSObject.getString(String, String)>
	//   33   74:ldc1            #72  <String ",ids">
	//   34   76:invokevirtual   #78  <Method boolean String.contains(CharSequence)>
	//   35   79:istore_1        
			exception = ((Exception) (GSAPI.access$400(GSAPI.getInstance())));
	//   36   80:invokestatic    #82  <Method GSAPI GSAPI.getInstance()>
	//   37   83:invokestatic    #86  <Method String GSAPI.access$400(GSAPI)>
	//   38   86:astore_2        
			list = ((List) (val$method));
	//   39   87:aload_0         
	//   40   88:getfield        #19  <Field GSAPI$10 this$1>
	//   41   91:getfield        #90  <Field String GSAPI$10.val$method>
	//   42   94:astore_3        
			GSObject gsobject = val$params2;
	//   43   95:aload_0         
	//   44   96:getfield        #21  <Field GSObject val$params2>
	//   45   99:astore          5
			if(!val$useHTTPS && !Boolean.valueOf(flag).booleanValue())
	//*  46  101:aload_0         
	//*  47  102:getfield        #19  <Field GSAPI$10 this$1>
	//*  48  105:getfield        #94  <Field boolean GSAPI$10.val$useHTTPS>
	//*  49  108:ifne            129
	//*  50  111:iload_1         
	//*  51  112:invokestatic    #100 <Method Boolean Boolean.valueOf(boolean)>
	//*  52  115:invokevirtual   #104 <Method boolean Boolean.booleanValue()>
	//*  53  118:ifeq            124
	//*  54  121:goto            129
				flag = false;
	//   55  124:iconst_0        
	//   56  125:istore_1        
			else
	//*  57  126:goto            131
				flag = true;
	//   58  129:iconst_1        
	//   59  130:istore_1        
			exception = ((Exception) (new GSAsyncRequest(((String) (exception)), ((String) (null)), ((String) (list)), gsobject, flag, val$timeoutMS, val$trace)));
	//   60  131:new             #106 <Class GSAsyncRequest>
	//   61  134:dup             
	//   62  135:aload_2         
	//   63  136:aconst_null     
	//   64  137:aload_3         
	//   65  138:aload           5
	//   66  140:iload_1         
	//   67  141:aload_0         
	//   68  142:getfield        #19  <Field GSAPI$10 this$1>
	//   69  145:getfield        #110 <Field int GSAPI$10.val$timeoutMS>
	//   70  148:aload_0         
	//   71  149:getfield        #19  <Field GSAPI$10 this$1>
	//   72  152:getfield        #114 <Field GSLogger GSAPI$10.val$trace>
	//   73  155:invokespecial   #117 <Method void GSAsyncRequest(String, String, String, GSObject, boolean, int, GSLogger)>
	//   74  158:astore_2        
		} else
	//*  75  159:goto            560
		{
			boolean flag1;
			if(val$params2.getString("regToken", ((String) (null))) != null)
	//*  76  162:aload_0         
	//*  77  163:getfield        #21  <Field GSObject val$params2>
	//*  78  166:ldc1            #119 <String "regToken">
	//*  79  168:aconst_null     
	//*  80  169:invokevirtual   #70  <Method String GSObject.getString(String, String)>
	//*  81  172:ifnull          181
				flag1 = true;
	//   82  175:iconst_1        
	//   83  176:istore          4
			else
	//*  84  178:goto            184
				flag1 = false;
	//   85  181:iconst_0        
	//   86  182:istore          4
			if(val$useHTTPS || flag1)
	//*  87  184:aload_0         
	//*  88  185:getfield        #19  <Field GSAPI$10 this$1>
	//*  89  188:getfield        #94  <Field boolean GSAPI$10.val$useHTTPS>
	//*  90  191:ifne            199
	//*  91  194:iload           4
	//*  92  196:ifeq            218
				val$params2.put("gmid", getGMID());
	//   93  199:aload_0         
	//   94  200:getfield        #21  <Field GSObject val$params2>
	//   95  203:ldc1            #121 <String "gmid">
	//   96  205:aload_0         
	//   97  206:getfield        #19  <Field GSAPI$10 this$1>
	//   98  209:getfield        #46  <Field GSAPI GSAPI$10.this$0>
	//   99  212:invokevirtual   #124 <Method String GSAPI.getGMID()>
	//  100  215:invokevirtual   #36  <Method void GSObject.put(String, String)>
			if(GSAPI.access$500(this$0).isValidSession())
	//* 101  218:aload_0         
	//* 102  219:getfield        #19  <Field GSAPI$10 this$1>
	//* 103  222:getfield        #46  <Field GSAPI GSAPI$10.this$0>
	//* 104  225:invokestatic    #128 <Method SessionManager GSAPI.access$500(GSAPI)>
	//* 105  228:invokevirtual   #133 <Method boolean SessionManager.isValidSession()>
	//* 106  231:ifeq            486
			{
				exception = ((Exception) (val$params2.getString("loginMode", ((String) (null)))));
	//  107  234:aload_0         
	//  108  235:getfield        #21  <Field GSObject val$params2>
	//  109  238:ldc1            #135 <String "loginMode">
	//  110  240:aconst_null     
	//  111  241:invokevirtual   #70  <Method String GSObject.getString(String, String)>
	//  112  244:astore_2        
				val$params2.put("oauth_token", GSAPI.access$500(this$0).getSession().getToken());
	//  113  245:aload_0         
	//  114  246:getfield        #21  <Field GSObject val$params2>
	//  115  249:ldc1            #137 <String "oauth_token">
	//  116  251:aload_0         
	//  117  252:getfield        #19  <Field GSAPI$10 this$1>
	//  118  255:getfield        #46  <Field GSAPI GSAPI$10.this$0>
	//  119  258:invokestatic    #128 <Method SessionManager GSAPI.access$500(GSAPI)>
	//  120  261:invokevirtual   #141 <Method GSSession SessionManager.getSession()>
	//  121  264:invokevirtual   #146 <Method String GSSession.getToken()>
	//  122  267:invokevirtual   #36  <Method void GSObject.put(String, String)>
				if(exception != null && ((String) (exception)).equals("reAuth"))
	//* 123  270:aload_2         
	//* 124  271:ifnull          390
	//* 125  274:aload_2         
	//* 126  275:ldc1            #148 <String "reAuth">
	//* 127  277:invokevirtual   #152 <Method boolean String.equals(Object)>
	//* 128  280:ifeq            390
				{
					val$params2.put("secret_type", "oauth1");
	//  129  283:aload_0         
	//  130  284:getfield        #21  <Field GSObject val$params2>
	//  131  287:ldc1            #154 <String "secret_type">
	//  132  289:ldc1            #156 <String "oauth1">
	//  133  291:invokevirtual   #36  <Method void GSObject.put(String, String)>
					exception = ((Exception) (GSAPI.access$400(GSAPI.getInstance())));
	//  134  294:invokestatic    #82  <Method GSAPI GSAPI.getInstance()>
	//  135  297:invokestatic    #86  <Method String GSAPI.access$400(GSAPI)>
	//  136  300:astore_2        
					list = ((List) (GSAPI.access$500(this$0).getSession().getSecret()));
	//  137  301:aload_0         
	//  138  302:getfield        #19  <Field GSAPI$10 this$1>
	//  139  305:getfield        #46  <Field GSAPI GSAPI$10.this$0>
	//  140  308:invokestatic    #128 <Method SessionManager GSAPI.access$500(GSAPI)>
	//  141  311:invokevirtual   #141 <Method GSSession SessionManager.getSession()>
	//  142  314:invokevirtual   #159 <Method String GSSession.getSecret()>
	//  143  317:astore_3        
					String s = val$method;
	//  144  318:aload_0         
	//  145  319:getfield        #19  <Field GSAPI$10 this$1>
	//  146  322:getfield        #90  <Field String GSAPI$10.val$method>
	//  147  325:astore          5
					GSObject gsobject2 = val$params2;
	//  148  327:aload_0         
	//  149  328:getfield        #21  <Field GSObject val$params2>
	//  150  331:astore          6
					if(!val$useHTTPS && !flag1)
	//* 151  333:aload_0         
	//* 152  334:getfield        #19  <Field GSAPI$10 this$1>
	//* 153  337:getfield        #94  <Field boolean GSAPI$10.val$useHTTPS>
	//* 154  340:ifne            356
	//* 155  343:iload           4
	//* 156  345:ifeq            351
	//* 157  348:goto            356
						flag = false;
	//  158  351:iconst_0        
	//  159  352:istore_1        
					else
	//* 160  353:goto            358
						flag = true;
	//  161  356:iconst_1        
	//  162  357:istore_1        
					exception = ((Exception) (new GSAsyncRequest(((String) (exception)), ((String) (list)), s, gsobject2, flag, val$timeoutMS, val$trace)));
	//  163  358:new             #106 <Class GSAsyncRequest>
	//  164  361:dup             
	//  165  362:aload_2         
	//  166  363:aload_3         
	//  167  364:aload           5
	//  168  366:aload           6
	//  169  368:iload_1         
	//  170  369:aload_0         
	//  171  370:getfield        #19  <Field GSAPI$10 this$1>
	//  172  373:getfield        #110 <Field int GSAPI$10.val$timeoutMS>
	//  173  376:aload_0         
	//  174  377:getfield        #19  <Field GSAPI$10 this$1>
	//  175  380:getfield        #114 <Field GSLogger GSAPI$10.val$trace>
	//  176  383:invokespecial   #117 <Method void GSAsyncRequest(String, String, String, GSObject, boolean, int, GSLogger)>
	//  177  386:astore_2        
				} else
	//* 178  387:goto            483
				{
					exception = ((Exception) (GSAPI.access$400(GSAPI.getInstance())));
	//  179  390:invokestatic    #82  <Method GSAPI GSAPI.getInstance()>
	//  180  393:invokestatic    #86  <Method String GSAPI.access$400(GSAPI)>
	//  181  396:astore_2        
					list = ((List) (GSAPI.access$500(this$0).getSession().getSecret()));
	//  182  397:aload_0         
	//  183  398:getfield        #19  <Field GSAPI$10 this$1>
	//  184  401:getfield        #46  <Field GSAPI GSAPI$10.this$0>
	//  185  404:invokestatic    #128 <Method SessionManager GSAPI.access$500(GSAPI)>
	//  186  407:invokevirtual   #141 <Method GSSession SessionManager.getSession()>
	//  187  410:invokevirtual   #159 <Method String GSSession.getSecret()>
	//  188  413:astore_3        
					String s1 = val$method;
	//  189  414:aload_0         
	//  190  415:getfield        #19  <Field GSAPI$10 this$1>
	//  191  418:getfield        #90  <Field String GSAPI$10.val$method>
	//  192  421:astore          5
					GSObject gsobject3 = val$params2;
	//  193  423:aload_0         
	//  194  424:getfield        #21  <Field GSObject val$params2>
	//  195  427:astore          6
					if(!val$useHTTPS && !flag1)
	//* 196  429:aload_0         
	//* 197  430:getfield        #19  <Field GSAPI$10 this$1>
	//* 198  433:getfield        #94  <Field boolean GSAPI$10.val$useHTTPS>
	//* 199  436:ifne            452
	//* 200  439:iload           4
	//* 201  441:ifeq            447
	//* 202  444:goto            452
						flag = false;
	//  203  447:iconst_0        
	//  204  448:istore_1        
					else
	//* 205  449:goto            454
						flag = true;
	//  206  452:iconst_1        
	//  207  453:istore_1        
					exception = ((Exception) (new GSAsyncRequest(((String) (exception)), ((String) (list)), s1, gsobject3, flag, val$timeoutMS, val$trace)));
	//  208  454:new             #106 <Class GSAsyncRequest>
	//  209  457:dup             
	//  210  458:aload_2         
	//  211  459:aload_3         
	//  212  460:aload           5
	//  213  462:aload           6
	//  214  464:iload_1         
	//  215  465:aload_0         
	//  216  466:getfield        #19  <Field GSAPI$10 this$1>
	//  217  469:getfield        #110 <Field int GSAPI$10.val$timeoutMS>
	//  218  472:aload_0         
	//  219  473:getfield        #19  <Field GSAPI$10 this$1>
	//  220  476:getfield        #114 <Field GSLogger GSAPI$10.val$trace>
	//  221  479:invokespecial   #117 <Method void GSAsyncRequest(String, String, String, GSObject, boolean, int, GSLogger)>
	//  222  482:astore_2        
				}
			} else
	//* 223  483:goto            560
			{
				exception = ((Exception) (GSAPI.access$400(GSAPI.getInstance())));
	//  224  486:invokestatic    #82  <Method GSAPI GSAPI.getInstance()>
	//  225  489:invokestatic    #86  <Method String GSAPI.access$400(GSAPI)>
	//  226  492:astore_2        
				list = ((List) (val$method));
	//  227  493:aload_0         
	//  228  494:getfield        #19  <Field GSAPI$10 this$1>
	//  229  497:getfield        #90  <Field String GSAPI$10.val$method>
	//  230  500:astore_3        
				GSObject gsobject1 = val$params2;
	//  231  501:aload_0         
	//  232  502:getfield        #21  <Field GSObject val$params2>
	//  233  505:astore          5
				if(!val$useHTTPS && !flag1)
	//* 234  507:aload_0         
	//* 235  508:getfield        #19  <Field GSAPI$10 this$1>
	//* 236  511:getfield        #94  <Field boolean GSAPI$10.val$useHTTPS>
	//* 237  514:ifne            530
	//* 238  517:iload           4
	//* 239  519:ifeq            525
	//* 240  522:goto            530
					flag = false;
	//  241  525:iconst_0        
	//  242  526:istore_1        
				else
	//* 243  527:goto            532
					flag = true;
	//  244  530:iconst_1        
	//  245  531:istore_1        
				exception = ((Exception) (new GSAsyncRequest(((String) (exception)), ((String) (null)), ((String) (list)), gsobject1, flag, val$timeoutMS, val$trace)));
	//  246  532:new             #106 <Class GSAsyncRequest>
	//  247  535:dup             
	//  248  536:aload_2         
	//  249  537:aconst_null     
	//  250  538:aload_3         
	//  251  539:aload           5
	//  252  541:iload_1         
	//  253  542:aload_0         
	//  254  543:getfield        #19  <Field GSAPI$10 this$1>
	//  255  546:getfield        #110 <Field int GSAPI$10.val$timeoutMS>
	//  256  549:aload_0         
	//  257  550:getfield        #19  <Field GSAPI$10 this$1>
	//  258  553:getfield        #114 <Field GSLogger GSAPI$10.val$trace>
	//  259  556:invokespecial   #117 <Method void GSAsyncRequest(String, String, String, GSObject, boolean, int, GSLogger)>
	//  260  559:astore_2        
			}
		}
		if(val$forceHttpGet)
	//* 261  560:aload_0         
	//* 262  561:getfield        #19  <Field GSAPI$10 this$1>
	//* 263  564:getfield        #162 <Field boolean GSAPI$10.val$forceHttpGet>
	//* 264  567:ifeq            576
			((GSAsyncRequest) (exception)).setHttpMethod("GET");
	//  265  570:aload_2         
	//  266  571:ldc1            #164 <String "GET">
	//  267  573:invokevirtual   #167 <Method void GSAsyncRequest.setHttpMethod(String)>
		((GSAsyncRequest) (exception)).setAPIDomain(GSAPI.access$600(this$0));
	//  268  576:aload_2         
	//  269  577:aload_0         
	//  270  578:getfield        #19  <Field GSAPI$10 this$1>
	//  271  581:getfield        #46  <Field GSAPI GSAPI$10.this$0>
	//  272  584:invokestatic    #170 <Method String GSAPI.access$600(GSAPI)>
	//  273  587:invokevirtual   #173 <Method void GSAsyncRequest.setAPIDomain(String)>
		((GSAsyncRequest) (exception)).send(val$listener, val$context);
	//  274  590:aload_2         
	//  275  591:aload_0         
	//  276  592:getfield        #19  <Field GSAPI$10 this$1>
	//  277  595:getfield        #177 <Field GSResponseListener GSAPI$10.val$listener>
	//  278  598:aload_0         
	//  279  599:getfield        #19  <Field GSAPI$10 this$1>
	//  280  602:getfield        #181 <Field Object GSAPI$10.val$context>
	//  281  605:invokevirtual   #185 <Method void GSAsyncRequest.send(GSResponseListener, Object)>
	//  282  608:return          
	}

	final GSAPI._cls10 this$1;
	final GSObject val$params2;

	GSAPI$10$1()
	{
		this$1 = final__pcls10;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field GSAPI$10 this$1>
		val$params2 = GSObject.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field GSObject val$params2>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}

	// Unreferenced inner class com/gigya/socialize/android/GSAPI$10

/* anonymous class */
	class GSAPI._cls10
		implements Runnable
	{

		public void run()
		{
			GSObject gsobject;
			if(params == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #36  <Field GSObject val$params>
		//*   2    4:ifnonnull       18
				gsobject = new GSObject();
		//    3    7:new             #57  <Class GSObject>
		//    4   10:dup             
		//    5   11:invokespecial   #58  <Method void GSObject()>
		//    6   14:astore_1        
			else
		//*   7   15:goto            23
				gsobject = params;
		//    8   18:aload_0         
		//    9   19:getfield        #36  <Field GSObject val$params>
		//   10   22:astore_1        
			requestPermissionsIfNeeded(method, gsobject, ((GSPermissionResultHandler) (((GSAPI._cls10._cls1) (gsobject)). new GSAPI._cls10._cls1())));
		//   11   23:aload_0         
		//   12   24:getfield        #34  <Field GSAPI this$0>
		//   13   27:aload_0         
		//   14   28:getfield        #38  <Field String val$method>
		//   15   31:aload_1         
		//   16   32:new             #13  <Class GSAPI$10$1>
		//   17   35:dup             
		//   18   36:aload_0         
		//   19   37:aload_1         
		//   20   38:invokespecial   #61  <Method void GSAPI$10$1(GSAPI$10, GSObject)>
		//   21   41:invokevirtual   #65  <Method void GSAPI.requestPermissionsIfNeeded(String, GSObject, GSPermissionResultHandler)>
		//   22   44:return          
		}

		final GSAPI this$0;
		final Object val$context;
		final boolean val$forceHttpGet;
		final GSResponseListener val$listener;
		final String val$method;
		final GSObject val$params;
		final int val$timeoutMS;
		final GSLogger val$trace;
		final boolean val$useHTTPS;

			
			{
				this$0 = final_gsapi;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #34  <Field GSAPI this$0>
				params = gsobject;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #36  <Field GSObject val$params>
				method = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #38  <Field String val$method>
				useHTTPS = flag;
			//    9   15:aload_0         
			//   10   16:iload           4
			//   11   18:putfield        #40  <Field boolean val$useHTTPS>
				timeoutMS = i;
			//   12   21:aload_0         
			//   13   22:iload           5
			//   14   24:putfield        #42  <Field int val$timeoutMS>
				trace = gslogger;
			//   15   27:aload_0         
			//   16   28:aload           6
			//   17   30:putfield        #44  <Field GSLogger val$trace>
				forceHttpGet = flag1;
			//   18   33:aload_0         
			//   19   34:iload           7
			//   20   36:putfield        #46  <Field boolean val$forceHttpGet>
				listener = gsresponselistener;
			//   21   39:aload_0         
			//   22   40:aload           8
			//   23   42:putfield        #48  <Field GSResponseListener val$listener>
				context = Object.this;
			//   24   45:aload_0         
			//   25   46:aload           9
			//   26   48:putfield        #50  <Field Object val$context>
				super();
			//   27   51:aload_0         
			//   28   52:invokespecial   #53  <Method void Object()>
			//   29   55:return          
			}
	}

}
