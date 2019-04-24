// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.login.providers;

import android.app.Activity;
import com.gigya.socialize.*;
import com.gigya.socialize.android.GSAPI;
import com.gigya.socialize.android.GSSession;

// Referenced classes of package com.gigya.socialize.android.login.providers:
//			LoginProvider, PostRequest

public abstract class GigyaProvider extends LoginProvider
{
	public static final class HttpMethod extends Enum
	{

		public static HttpMethod valueOf(String s)
		{
			return (HttpMethod)Enum.valueOf(com/gigya/socialize/android/login/providers/GigyaProvider$HttpMethod, s);
		//    0    0:ldc1            #2   <Class GigyaProvider$HttpMethod>
		//    1    2:aload_0         
		//    2    3:invokestatic    #42  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class GigyaProvider$HttpMethod>
		//    4    9:areturn         
		}

		public static HttpMethod[] values()
		{
			return (HttpMethod[])((HttpMethod []) ($VALUES)).clone();
		//    0    0:getstatic       #29  <Field GigyaProvider$HttpMethod[] $VALUES>
		//    1    3:invokevirtual   #49  <Method Object _5B_Lcom.gigya.socialize.android.login.providers.GigyaProvider$HttpMethod_3B_.clone()>
		//    2    6:checkcast       #45  <Class GigyaProvider$HttpMethod[]>
		//    3    9:areturn         
		}

		public String getValue()
		{
			return value;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field String value>
		//    2    4:areturn         
		}

		private static final HttpMethod $VALUES[];
		public static final HttpMethod GET;
		public static final HttpMethod POST;
		private String value;

		static 
		{
			GET = new HttpMethod("GET", 0, "GET");
		//    0    0:new             #2   <Class GigyaProvider$HttpMethod>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "GET">
		//    3    6:iconst_0        
		//    4    7:ldc1            #18  <String "GET">
		//    5    9:invokespecial   #22  <Method void GigyaProvider$HttpMethod(String, int, String)>
		//    6   12:putstatic       #24  <Field GigyaProvider$HttpMethod GET>
			POST = new HttpMethod("POST", 1, "POST");
		//    7   15:new             #2   <Class GigyaProvider$HttpMethod>
		//    8   18:dup             
		//    9   19:ldc1            #25  <String "POST">
		//   10   21:iconst_1        
		//   11   22:ldc1            #25  <String "POST">
		//   12   24:invokespecial   #22  <Method void GigyaProvider$HttpMethod(String, int, String)>
		//   13   27:putstatic       #27  <Field GigyaProvider$HttpMethod POST>
			$VALUES = (new HttpMethod[] {
				GET, POST
			});
		//   14   30:iconst_2        
		//   15   31:anewarray       HttpMethod[]
		//   16   34:dup             
		//   17   35:iconst_0        
		//   18   36:getstatic       #24  <Field GigyaProvider$HttpMethod GET>
		//   19   39:aastore         
		//   20   40:dup             
		//   21   41:iconst_1        
		//   22   42:getstatic       #27  <Field GigyaProvider$HttpMethod POST>
		//   23   45:aastore         
		//   24   46:putstatic       #29  <Field GigyaProvider$HttpMethod[] $VALUES>
		//*  25   49:return          
		}

		private HttpMethod(String s, int i, String s1)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
			value = s1;
		//    4    6:aload_0         
		//    5    7:aload_3         
		//    6    8:putfield        #35  <Field String value>
		//    7   11:return          
		}
	}


	public GigyaProvider()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void LoginProvider()>
		logger = new GSLogger();
	//    2    4:aload_0         
	//    3    5:new             #18  <Class GSLogger>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void GSLogger()>
	//    6   12:putfield        #21  <Field GSLogger logger>
	//    7   15:return          
	}

	private Object getPostUrl(boolean flag, HttpMethod httpmethod, String s, String s1, String s2, GSObject gsobject)
	{
		Object obj = "http";
	//    0    0:ldc1            #28  <String "http">
	//    1    2:astore          9
		if(flag)
	//*   2    4:iload_1         
	//*   3    5:ifeq            12
			obj = "https";
	//    4    8:ldc1            #30  <String "https">
	//    5   10:astore          9
		int i = 0;
	//    6   12:iconst_0        
	//    7   13:istore          7
		s2 = String.format("%s://%s.%s/%s", new Object[] {
			obj, "socialize", s2, s1
		});
	//    8   15:ldc1            #32  <String "%s://%s.%s/%s">
	//    9   17:iconst_4        
	//   10   18:anewarray       Object[]
	//   11   21:dup             
	//   12   22:iconst_0        
	//   13   23:aload           9
	//   14   25:aastore         
	//   15   26:dup             
	//   16   27:iconst_1        
	//   17   28:ldc1            #36  <String "socialize">
	//   18   30:aastore         
	//   19   31:dup             
	//   20   32:iconst_2        
	//   21   33:aload           5
	//   22   35:aastore         
	//   23   36:dup             
	//   24   37:iconst_3        
	//   25   38:aload           4
	//   26   40:aastore         
	//   27   41:invokestatic    #42  <Method String String.format(String, Object[])>
	//   28   44:astore          5
		Object obj1 = ((Object) (gsobject.getString("provider", "").toLowerCase()));
	//   29   46:aload           6
	//   30   48:ldc1            #44  <String "provider">
	//   31   50:ldc1            #46  <String "">
	//   32   52:invokevirtual   #52  <Method String GSObject.getString(String, String)>
	//   33   55:invokevirtual   #56  <Method String String.toLowerCase()>
	//   34   58:astore          11
		obj = ((Object) (new GSObject()));
	//   35   60:new             #48  <Class GSObject>
	//   36   63:dup             
	//   37   64:invokespecial   #57  <Method void GSObject()>
	//   38   67:astore          9
		GSObject gsobject1 = gsobject.clone();
	//   39   69:aload           6
	//   40   71:invokevirtual   #61  <Method GSObject GSObject.clone()>
	//   41   74:astore          10
		Object obj2 = ((Object) (new StringBuilder()));
	//   42   76:new             #63  <Class StringBuilder>
	//   43   79:dup             
	//   44   80:invokespecial   #64  <Method void StringBuilder()>
	//   45   83:astore          12
		((StringBuilder) (obj2)).append(((String) (obj1)));
	//   46   85:aload           12
	//   47   87:aload           11
	//   48   89:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   49   92:pop             
		((StringBuilder) (obj2)).append("ExtraPermissions");
	//   50   93:aload           12
	//   51   95:ldc1            #70  <String "ExtraPermissions">
	//   52   97:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   53  100:pop             
		obj2 = ((Object) (gsobject1.getString(((StringBuilder) (obj2)).toString(), ((String) (null)))));
	//   54  101:aload           10
	//   55  103:aload           12
	//   56  105:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   57  108:aconst_null     
	//   58  109:invokevirtual   #52  <Method String GSObject.getString(String, String)>
	//   59  112:astore          12
		if(obj2 != null)
	//*  60  114:aload           12
	//*  61  116:ifnull          163
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   62  119:new             #63  <Class StringBuilder>
	//   63  122:dup             
	//   64  123:invokespecial   #64  <Method void StringBuilder()>
	//   65  126:astore          13
			stringbuilder1.append(((String) (obj1)));
	//   66  128:aload           13
	//   67  130:aload           11
	//   68  132:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   69  135:pop             
			stringbuilder1.append("ExtraPermissions");
	//   70  136:aload           13
	//   71  138:ldc1            #70  <String "ExtraPermissions">
	//   72  140:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   73  143:pop             
			gsobject1.remove(stringbuilder1.toString());
	//   74  144:aload           10
	//   75  146:aload           13
	//   76  148:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   77  151:invokevirtual   #77  <Method void GSObject.remove(String)>
			((GSObject) (obj)).put("x_extraPermissions", ((String) (obj2)));
	//   78  154:aload           9
	//   79  156:ldc1            #79  <String "x_extraPermissions">
	//   80  158:aload           12
	//   81  160:invokevirtual   #83  <Method void GSObject.put(String, String)>
		}
		((GSObject) (obj)).put("redirect_uri", s);
	//   82  163:aload           9
	//   83  165:ldc1            #85  <String "redirect_uri">
	//   84  167:aload_3         
	//   85  168:invokevirtual   #83  <Method void GSObject.put(String, String)>
		((GSObject) (obj)).put("response_type", "token");
	//   86  171:aload           9
	//   87  173:ldc1            #87  <String "response_type">
	//   88  175:ldc1            #89  <String "token">
	//   89  177:invokevirtual   #83  <Method void GSObject.put(String, String)>
		((GSObject) (obj)).put("client_id", GSAPI.getInstance().getAPIKey());
	//   90  180:aload           9
	//   91  182:ldc1            #91  <String "client_id">
	//   92  184:invokestatic    #97  <Method GSAPI GSAPI.getInstance()>
	//   93  187:invokevirtual   #100 <Method String GSAPI.getAPIKey()>
	//   94  190:invokevirtual   #83  <Method void GSObject.put(String, String)>
		s = gsobject1.getString("gmid", ((String) (null)));
	//   95  193:aload           10
	//   96  195:ldc1            #102 <String "gmid">
	//   97  197:aconst_null     
	//   98  198:invokevirtual   #52  <Method String GSObject.getString(String, String)>
	//   99  201:astore_3        
		if(s == null)
	//* 100  202:aload_3         
	//* 101  203:ifnonnull       224
			((GSObject) (obj)).put("gmidTicket", gsobject1.getString("gmidTicket", ((String) (null))));
	//  102  206:aload           9
	//  103  208:ldc1            #104 <String "gmidTicket">
	//  104  210:aload           10
	//  105  212:ldc1            #104 <String "gmidTicket">
	//  106  214:aconst_null     
	//  107  215:invokevirtual   #52  <Method String GSObject.getString(String, String)>
	//  108  218:invokevirtual   #83  <Method void GSObject.put(String, String)>
		else
	//* 109  221:goto            232
			((GSObject) (obj)).put("gmid", s);
	//  110  224:aload           9
	//  111  226:ldc1            #102 <String "gmid">
	//  112  228:aload_3         
	//  113  229:invokevirtual   #83  <Method void GSObject.put(String, String)>
		((GSObject) (obj)).put("ucid", gsobject1.getString("ucid", ((String) (null))));
	//  114  232:aload           9
	//  115  234:ldc1            #106 <String "ucid">
	//  116  236:aload           10
	//  117  238:ldc1            #106 <String "ucid">
	//  118  240:aconst_null     
	//  119  241:invokevirtual   #52  <Method String GSObject.getString(String, String)>
	//  120  244:invokevirtual   #83  <Method void GSObject.put(String, String)>
		gsobject1.remove("gmidTicket");
	//  121  247:aload           10
	//  122  249:ldc1            #104 <String "gmidTicket">
	//  123  251:invokevirtual   #77  <Method void GSObject.remove(String)>
		gsobject1.remove("gmid");
	//  124  254:aload           10
	//  125  256:ldc1            #102 <String "gmid">
	//  126  258:invokevirtual   #77  <Method void GSObject.remove(String)>
		gsobject1.remove("ucid");
	//  127  261:aload           10
	//  128  263:ldc1            #106 <String "ucid">
	//  129  265:invokevirtual   #77  <Method void GSObject.remove(String)>
		obj1 = ((Object) (GSAPI.getInstance().getSession()));
	//  130  268:invokestatic    #97  <Method GSAPI GSAPI.getInstance()>
	//  131  271:invokevirtual   #110 <Method GSSession GSAPI.getSession()>
	//  132  274:astore          11
		s = gsobject.getString("loginMode", ((String) (null)));
	//  133  276:aload           6
	//  134  278:ldc1            #112 <String "loginMode">
	//  135  280:aconst_null     
	//  136  281:invokevirtual   #52  <Method String GSObject.getString(String, String)>
	//  137  284:astore_3        
		if(s1.equals("socialize.addConnection"))
	//* 138  285:aload           4
	//* 139  287:ldc1            #114 <String "socialize.addConnection">
	//* 140  289:invokevirtual   #118 <Method boolean String.equals(Object)>
	//* 141  292:ifeq            332
		{
			((GSObject) (obj)).put("oauth_token", ((GSSession) (obj1)).getToken());
	//  142  295:aload           9
	//  143  297:ldc1            #120 <String "oauth_token">
	//  144  299:aload           11
	//  145  301:invokevirtual   #125 <Method String GSSession.getToken()>
	//  146  304:invokevirtual   #83  <Method void GSObject.put(String, String)>
			((GSObject) (obj)).put("getPerms", gsobject1.getInt("getPerms", 0));
	//  147  307:aload           9
	//  148  309:ldc1            #127 <String "getPerms">
	//  149  311:aload           10
	//  150  313:ldc1            #127 <String "getPerms">
	//  151  315:iconst_0        
	//  152  316:invokevirtual   #131 <Method int GSObject.getInt(String, int)>
	//  153  319:invokevirtual   #134 <Method void GSObject.put(String, int)>
			gsobject1.remove("getPerms");
	//  154  322:aload           10
	//  155  324:ldc1            #127 <String "getPerms">
	//  156  326:invokevirtual   #77  <Method void GSObject.remove(String)>
		} else
	//* 157  329:goto            366
		{
			if(s != null && s.equals("reAuth"))
	//* 158  332:aload_3         
	//* 159  333:ifnull          357
	//* 160  336:aload_3         
	//* 161  337:ldc1            #136 <String "reAuth">
	//* 162  339:invokevirtual   #118 <Method boolean String.equals(Object)>
	//* 163  342:ifeq            357
				((GSObject) (obj)).put("oauth_token", ((GSSession) (obj1)).getToken());
	//  164  345:aload           9
	//  165  347:ldc1            #120 <String "oauth_token">
	//  166  349:aload           11
	//  167  351:invokevirtual   #125 <Method String GSSession.getToken()>
	//  168  354:invokevirtual   #83  <Method void GSObject.put(String, String)>
			((GSObject) (obj)).put("x_secret_type", "oauth1");
	//  169  357:aload           9
	//  170  359:ldc1            #138 <String "x_secret_type">
	//  171  361:ldc1            #140 <String "oauth1">
	//  172  363:invokevirtual   #83  <Method void GSObject.put(String, String)>
		}
		s1 = ((String) (gsobject1.getKeys()));
	//  173  366:aload           10
	//  174  368:invokevirtual   #144 <Method String[] GSObject.getKeys()>
	//  175  371:astore          4
		StringBuilder stringbuilder;
		for(int j = s1.length; i < j; i++)
	//* 176  373:aload           4
	//* 177  375:arraylength     
	//* 178  376:istore          8
	//* 179  378:iload           7
	//* 180  380:iload           8
	//* 181  382:icmpge          462
		{
			s = ((String) (s1[i]));
	//  182  385:aload           4
	//  183  387:iload           7
	//  184  389:aaload          
	//  185  390:astore_3        
			gsobject = ((GSObject) (gsobject1.get(s, ((Object) (null)))));
	//  186  391:aload           10
	//  187  393:aload_3         
	//  188  394:aconst_null     
	//  189  395:invokevirtual   #148 <Method Object GSObject.get(String, Object)>
	//  190  398:astore          6
			if(!s.startsWith("x_"))
	//* 191  400:aload_3         
	//* 192  401:ldc1            #150 <String "x_">
	//* 193  403:invokevirtual   #154 <Method boolean String.startsWith(String)>
	//* 194  406:ifeq            420
	//* 195  409:aload           9
	//* 196  411:aload_3         
	//* 197  412:aload           6
	//* 198  414:invokevirtual   #157 <Method void GSObject.put(String, Object)>
	//* 199  417:goto            453
			{
				stringbuilder = new StringBuilder();
	//  200  420:new             #63  <Class StringBuilder>
	//  201  423:dup             
	//  202  424:invokespecial   #64  <Method void StringBuilder()>
	//  203  427:astore          12
				stringbuilder.append("x_");
	//  204  429:aload           12
	//  205  431:ldc1            #150 <String "x_">
	//  206  433:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//  207  436:pop             
				stringbuilder.append(s);
	//  208  437:aload           12
	//  209  439:aload_3         
	//  210  440:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//  211  443:pop             
				s = stringbuilder.toString();
	//  212  444:aload           12
	//  213  446:invokevirtual   #73  <Method String StringBuilder.toString()>
	//  214  449:astore_3        
			}
			((GSObject) (obj)).put(s, ((Object) (gsobject)));
		}

	//  215  450:goto            409
	//  216  453:iload           7
	//  217  455:iconst_1        
	//  218  456:iadd            
	//  219  457:istore          7
	//* 220  459:goto            378
		if(obj1 != null)
	//* 221  462:aload           11
	//* 222  464:ifnull          501
		{
			s = ((GSSession) (obj1)).getSecret();
	//  223  467:aload           11
	//  224  469:invokevirtual   #160 <Method String GSSession.getSecret()>
	//  225  472:astore_3        
			try
			{
				GSRequest.addSignatureParams(((GSObject) (obj)), httpmethod.getValue(), s2, s, 0L);
	//  226  473:aload           9
	//  227  475:aload_2         
	//  228  476:invokevirtual   #163 <Method String GigyaProvider$HttpMethod.getValue()>
	//  229  479:aload           5
	//  230  481:aload_3         
	//  231  482:lconst_0        
	//  232  483:invokestatic    #169 <Method void GSRequest.addSignatureParams(GSObject, String, String, String, long)>
			}
	//* 233  486:goto            501
			// Misplaced declaration of an exception variable
			catch(HttpMethod httpmethod)
	//* 234  489:astore_2        
			{
				logger.write(((Exception) (httpmethod)));
	//  235  490:aload_0         
	//  236  491:getfield        #21  <Field GSLogger logger>
	//  237  494:aload_2         
	//  238  495:invokevirtual   #173 <Method void GSLogger.write(Exception)>
			}
		}
	//* 239  498:goto            501
		return ((Object) (new PostRequest(s2, GSRequest.buildQS(((GSObject) (obj))))));
	//  240  501:new             #175 <Class PostRequest>
	//  241  504:dup             
	//  242  505:aload           5
	//  243  507:aload           9
	//  244  509:invokestatic    #179 <Method String GSRequest.buildQS(GSObject)>
	//  245  512:invokespecial   #181 <Method void PostRequest(String, String)>
	//  246  515:areturn         
	}

	protected void finish()
	{
	//    0    0:return          
	}

	public Object getUrl(boolean flag, HttpMethod httpmethod, String s, String s1, String s2, GSObject gsobject)
	{
		String s3 = "http";
	//    0    0:ldc1            #28  <String "http">
	//    1    2:astore          9
		if(flag)
	//*   2    4:iload_1         
	//*   3    5:ifeq            12
			s3 = "https";
	//    4    8:ldc1            #30  <String "https">
	//    5   10:astore          9
		String s4 = String.format("%s://%s.%s/%s", new Object[] {
			s3, "socialize", s2, s1
		});
	//    6   12:ldc1            #32  <String "%s://%s.%s/%s">
	//    7   14:iconst_4        
	//    8   15:anewarray       Object[]
	//    9   18:dup             
	//   10   19:iconst_0        
	//   11   20:aload           9
	//   12   22:aastore         
	//   13   23:dup             
	//   14   24:iconst_1        
	//   15   25:ldc1            #36  <String "socialize">
	//   16   27:aastore         
	//   17   28:dup             
	//   18   29:iconst_2        
	//   19   30:aload           5
	//   20   32:aastore         
	//   21   33:dup             
	//   22   34:iconst_3        
	//   23   35:aload           4
	//   24   37:aastore         
	//   25   38:invokestatic    #42  <Method String String.format(String, Object[])>
	//   26   41:astore          11
		String s5 = gsobject.getString("provider", "").toLowerCase();
	//   27   43:aload           6
	//   28   45:ldc1            #44  <String "provider">
	//   29   47:ldc1            #46  <String "">
	//   30   49:invokevirtual   #52  <Method String GSObject.getString(String, String)>
	//   31   52:invokevirtual   #56  <Method String String.toLowerCase()>
	//   32   55:astore          13
		GSObject gsobject1 = new GSObject();
	//   33   57:new             #48  <Class GSObject>
	//   34   60:dup             
	//   35   61:invokespecial   #57  <Method void GSObject()>
	//   36   64:astore          10
		GSObject gsobject2 = gsobject.clone();
	//   37   66:aload           6
	//   38   68:invokevirtual   #61  <Method GSObject GSObject.clone()>
	//   39   71:astore          12
		Object obj = ((Object) (new StringBuilder()));
	//   40   73:new             #63  <Class StringBuilder>
	//   41   76:dup             
	//   42   77:invokespecial   #64  <Method void StringBuilder()>
	//   43   80:astore          14
		((StringBuilder) (obj)).append(s5);
	//   44   82:aload           14
	//   45   84:aload           13
	//   46   86:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   47   89:pop             
		((StringBuilder) (obj)).append("ExtraPermissions");
	//   48   90:aload           14
	//   49   92:ldc1            #70  <String "ExtraPermissions">
	//   50   94:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   51   97:pop             
		obj = ((Object) (gsobject2.getString(((StringBuilder) (obj)).toString(), ((String) (null)))));
	//   52   98:aload           12
	//   53  100:aload           14
	//   54  102:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   55  105:aconst_null     
	//   56  106:invokevirtual   #52  <Method String GSObject.getString(String, String)>
	//   57  109:astore          14
		if(obj != null)
	//*  58  111:aload           14
	//*  59  113:ifnull          160
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   60  116:new             #63  <Class StringBuilder>
	//   61  119:dup             
	//   62  120:invokespecial   #64  <Method void StringBuilder()>
	//   63  123:astore          15
			stringbuilder.append(s5);
	//   64  125:aload           15
	//   65  127:aload           13
	//   66  129:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   67  132:pop             
			stringbuilder.append("ExtraPermissions");
	//   68  133:aload           15
	//   69  135:ldc1            #70  <String "ExtraPermissions">
	//   70  137:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   71  140:pop             
			gsobject2.remove(stringbuilder.toString());
	//   72  141:aload           12
	//   73  143:aload           15
	//   74  145:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   75  148:invokevirtual   #77  <Method void GSObject.remove(String)>
			gsobject1.put("x_extraPermissions", ((String) (obj)));
	//   76  151:aload           10
	//   77  153:ldc1            #79  <String "x_extraPermissions">
	//   78  155:aload           14
	//   79  157:invokevirtual   #83  <Method void GSObject.put(String, String)>
		}
		gsobject1.put("redirect_uri", s);
	//   80  160:aload           10
	//   81  162:ldc1            #85  <String "redirect_uri">
	//   82  164:aload_3         
	//   83  165:invokevirtual   #83  <Method void GSObject.put(String, String)>
		gsobject1.put("response_type", "token");
	//   84  168:aload           10
	//   85  170:ldc1            #87  <String "response_type">
	//   86  172:ldc1            #89  <String "token">
	//   87  174:invokevirtual   #83  <Method void GSObject.put(String, String)>
		gsobject1.put("client_id", GSAPI.getInstance().getAPIKey());
	//   88  177:aload           10
	//   89  179:ldc1            #91  <String "client_id">
	//   90  181:invokestatic    #97  <Method GSAPI GSAPI.getInstance()>
	//   91  184:invokevirtual   #100 <Method String GSAPI.getAPIKey()>
	//   92  187:invokevirtual   #83  <Method void GSObject.put(String, String)>
		s = gsobject2.getString("gmid", ((String) (null)));
	//   93  190:aload           12
	//   94  192:ldc1            #102 <String "gmid">
	//   95  194:aconst_null     
	//   96  195:invokevirtual   #52  <Method String GSObject.getString(String, String)>
	//   97  198:astore_3        
		if(s == null)
	//*  98  199:aload_3         
	//*  99  200:ifnonnull       221
			gsobject1.put("gmidTicket", gsobject2.getString("gmidTicket", ((String) (null))));
	//  100  203:aload           10
	//  101  205:ldc1            #104 <String "gmidTicket">
	//  102  207:aload           12
	//  103  209:ldc1            #104 <String "gmidTicket">
	//  104  211:aconst_null     
	//  105  212:invokevirtual   #52  <Method String GSObject.getString(String, String)>
	//  106  215:invokevirtual   #83  <Method void GSObject.put(String, String)>
		else
	//* 107  218:goto            229
			gsobject1.put("gmid", s);
	//  108  221:aload           10
	//  109  223:ldc1            #102 <String "gmid">
	//  110  225:aload_3         
	//  111  226:invokevirtual   #83  <Method void GSObject.put(String, String)>
		gsobject1.put("ucid", gsobject2.getString("ucid", ((String) (null))));
	//  112  229:aload           10
	//  113  231:ldc1            #106 <String "ucid">
	//  114  233:aload           12
	//  115  235:ldc1            #106 <String "ucid">
	//  116  237:aconst_null     
	//  117  238:invokevirtual   #52  <Method String GSObject.getString(String, String)>
	//  118  241:invokevirtual   #83  <Method void GSObject.put(String, String)>
		gsobject2.remove("gmidTicket");
	//  119  244:aload           12
	//  120  246:ldc1            #104 <String "gmidTicket">
	//  121  248:invokevirtual   #77  <Method void GSObject.remove(String)>
		gsobject2.remove("gmid");
	//  122  251:aload           12
	//  123  253:ldc1            #102 <String "gmid">
	//  124  255:invokevirtual   #77  <Method void GSObject.remove(String)>
		gsobject2.remove("ucid");
	//  125  258:aload           12
	//  126  260:ldc1            #106 <String "ucid">
	//  127  262:invokevirtual   #77  <Method void GSObject.remove(String)>
		s = ((String) (GSAPI.getInstance().getSession()));
	//  128  265:invokestatic    #97  <Method GSAPI GSAPI.getInstance()>
	//  129  268:invokevirtual   #110 <Method GSSession GSAPI.getSession()>
	//  130  271:astore_3        
		gsobject = ((GSObject) (gsobject.getString("loginMode", ((String) (null)))));
	//  131  272:aload           6
	//  132  274:ldc1            #112 <String "loginMode">
	//  133  276:aconst_null     
	//  134  277:invokevirtual   #52  <Method String GSObject.getString(String, String)>
	//  135  280:astore          6
		if(s1.equals("socialize.addConnection"))
	//* 136  282:aload           4
	//* 137  284:ldc1            #114 <String "socialize.addConnection">
	//* 138  286:invokevirtual   #118 <Method boolean String.equals(Object)>
	//* 139  289:ifeq            328
		{
			gsobject1.put("oauth_token", ((GSSession) (s)).getToken());
	//  140  292:aload           10
	//  141  294:ldc1            #120 <String "oauth_token">
	//  142  296:aload_3         
	//  143  297:invokevirtual   #125 <Method String GSSession.getToken()>
	//  144  300:invokevirtual   #83  <Method void GSObject.put(String, String)>
			gsobject1.put("getPerms", gsobject2.getInt("getPerms", 0));
	//  145  303:aload           10
	//  146  305:ldc1            #127 <String "getPerms">
	//  147  307:aload           12
	//  148  309:ldc1            #127 <String "getPerms">
	//  149  311:iconst_0        
	//  150  312:invokevirtual   #131 <Method int GSObject.getInt(String, int)>
	//  151  315:invokevirtual   #134 <Method void GSObject.put(String, int)>
			gsobject2.remove("getPerms");
	//  152  318:aload           12
	//  153  320:ldc1            #127 <String "getPerms">
	//  154  322:invokevirtual   #77  <Method void GSObject.remove(String)>
		} else
	//* 155  325:goto            363
		{
			if(gsobject != null && ((String) (gsobject)).equals("reAuth"))
	//* 156  328:aload           6
	//* 157  330:ifnull          354
	//* 158  333:aload           6
	//* 159  335:ldc1            #136 <String "reAuth">
	//* 160  337:invokevirtual   #118 <Method boolean String.equals(Object)>
	//* 161  340:ifeq            354
				gsobject1.put("oauth_token", ((GSSession) (s)).getToken());
	//  162  343:aload           10
	//  163  345:ldc1            #120 <String "oauth_token">
	//  164  347:aload_3         
	//  165  348:invokevirtual   #125 <Method String GSSession.getToken()>
	//  166  351:invokevirtual   #83  <Method void GSObject.put(String, String)>
			gsobject1.put("x_secret_type", "oauth1");
	//  167  354:aload           10
	//  168  356:ldc1            #138 <String "x_secret_type">
	//  169  358:ldc1            #140 <String "oauth1">
	//  170  360:invokevirtual   #83  <Method void GSObject.put(String, String)>
		}
		gsobject = ((GSObject) (gsobject2.getKeys()));
	//  171  363:aload           12
	//  172  365:invokevirtual   #144 <Method String[] GSObject.getKeys()>
	//  173  368:astore          6
		int j = gsobject.length;
	//  174  370:aload           6
	//  175  372:arraylength     
	//  176  373:istore          8
		for(int i = 0; i < j; i++)
	//* 177  375:iconst_0        
	//* 178  376:istore          7
	//* 179  378:iload           7
	//* 180  380:iload           8
	//* 181  382:icmpge          470
		{
			String s6 = ((String) (gsobject[i]));
	//  182  385:aload           6
	//  183  387:iload           7
	//  184  389:aaload          
	//  185  390:astore          13
			Object obj1 = gsobject2.get(s6, ((Object) (null)));
	//  186  392:aload           12
	//  187  394:aload           13
	//  188  396:aconst_null     
	//  189  397:invokevirtual   #148 <Method Object GSObject.get(String, Object)>
	//  190  400:astore          14
			if(s6.startsWith("x_"))
	//* 191  402:aload           13
	//* 192  404:ldc1            #150 <String "x_">
	//* 193  406:invokevirtual   #154 <Method boolean String.startsWith(String)>
	//* 194  409:ifeq            424
			{
				gsobject1.put(s6, obj1);
	//  195  412:aload           10
	//  196  414:aload           13
	//  197  416:aload           14
	//  198  418:invokevirtual   #157 <Method void GSObject.put(String, Object)>
			} else
	//* 199  421:goto            461
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//  200  424:new             #63  <Class StringBuilder>
	//  201  427:dup             
	//  202  428:invokespecial   #64  <Method void StringBuilder()>
	//  203  431:astore          15
				stringbuilder1.append("x_");
	//  204  433:aload           15
	//  205  435:ldc1            #150 <String "x_">
	//  206  437:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//  207  440:pop             
				stringbuilder1.append(s6);
	//  208  441:aload           15
	//  209  443:aload           13
	//  210  445:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//  211  448:pop             
				gsobject1.put(stringbuilder1.toString(), obj1);
	//  212  449:aload           10
	//  213  451:aload           15
	//  214  453:invokevirtual   #73  <Method String StringBuilder.toString()>
	//  215  456:aload           14
	//  216  458:invokevirtual   #157 <Method void GSObject.put(String, Object)>
			}
		}

	//  217  461:iload           7
	//  218  463:iconst_1        
	//  219  464:iadd            
	//  220  465:istore          7
	//* 221  467:goto            378
		if(s != null)
	//* 222  470:aload_3         
	//* 223  471:ifnull          507
		{
			s = ((GSSession) (s)).getSecret();
	//  224  474:aload_3         
	//  225  475:invokevirtual   #160 <Method String GSSession.getSecret()>
	//  226  478:astore_3        
			try
			{
				GSRequest.addSignatureParams(gsobject1, httpmethod.getValue(), s4, s, 0L);
	//  227  479:aload           10
	//  228  481:aload_2         
	//  229  482:invokevirtual   #163 <Method String GigyaProvider$HttpMethod.getValue()>
	//  230  485:aload           11
	//  231  487:aload_3         
	//  232  488:lconst_0        
	//  233  489:invokestatic    #169 <Method void GSRequest.addSignatureParams(GSObject, String, String, String, long)>
			}
	//* 234  492:goto            507
			// Misplaced declaration of an exception variable
			catch(HttpMethod httpmethod)
	//* 235  495:astore_2        
			{
				logger.write(((Exception) (httpmethod)));
	//  236  496:aload_0         
	//  237  497:getfield        #21  <Field GSLogger logger>
	//  238  500:aload_2         
	//  239  501:invokevirtual   #173 <Method void GSLogger.write(Exception)>
			}
		}
	//* 240  504:goto            507
		return ((Object) (String.format("%s://%s.%s/%s?%s", new Object[] {
			s3, "socialize", s2, s1, GSRequest.buildQS(gsobject1)
		})));
	//  241  507:ldc1            #187 <String "%s://%s.%s/%s?%s">
	//  242  509:iconst_5        
	//  243  510:anewarray       Object[]
	//  244  513:dup             
	//  245  514:iconst_0        
	//  246  515:aload           9
	//  247  517:aastore         
	//  248  518:dup             
	//  249  519:iconst_1        
	//  250  520:ldc1            #36  <String "socialize">
	//  251  522:aastore         
	//  252  523:dup             
	//  253  524:iconst_2        
	//  254  525:aload           5
	//  255  527:aastore         
	//  256  528:dup             
	//  257  529:iconst_3        
	//  258  530:aload           4
	//  259  532:aastore         
	//  260  533:dup             
	//  261  534:iconst_4        
	//  262  535:aload           10
	//  263  537:invokestatic    #179 <Method String GSRequest.buildQS(GSObject)>
	//  264  540:aastore         
	//  265  541:invokestatic    #42  <Method String String.format(String, Object[])>
	//  266  544:areturn         
	}

	public Object getUrl(boolean flag, String s, String s1, String s2, GSObject gsobject, HttpMethod httpmethod)
	{
		static class _cls1
		{

			static final int $SwitchMap$com$gigya$socialize$android$login$providers$GigyaProvider$HttpMethod[];

			static 
			{
				$SwitchMap$com$gigya$socialize$android$login$providers$GigyaProvider$HttpMethod = new int[HttpMethod.values().length];
			//    0    0:invokestatic    #18  <Method GigyaProvider$HttpMethod[] GigyaProvider$HttpMethod.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$gigya$socialize$android$login$providers$GigyaProvider$HttpMethod>
				try
				{
					$SwitchMap$com$gigya$socialize$android$login$providers$GigyaProvider$HttpMethod[HttpMethod.GET.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$gigya$socialize$android$login$providers$GigyaProvider$HttpMethod>
			//    5   12:getstatic       #24  <Field GigyaProvider$HttpMethod GigyaProvider$HttpMethod.GET>
			//    6   15:invokevirtual   #28  <Method int GigyaProvider$HttpMethod.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
			//    9   20:return          
				}
				catch(NoSuchFieldError nosuchfielderror) { }
			//   10   21:astore_0        
			//*  11   22:return          
			}
		}

		if(_cls1..SwitchMap.com.gigya.socialize.android.login.providers.GigyaProvider.HttpMethod[httpmethod.ordinal()] != 1)
	//*   0    0:getstatic       #192 <Field int[] GigyaProvider$1.$SwitchMap$com$gigya$socialize$android$login$providers$GigyaProvider$HttpMethod>
	//*   1    3:aload           6
	//*   2    5:invokevirtual   #196 <Method int GigyaProvider$HttpMethod.ordinal()>
	//*   3    8:iaload          
	//*   4    9:iconst_1        
	//*   5   10:icmpeq          27
			return getPostUrl(flag, httpmethod, s, s1, s2, gsobject);
	//    6   13:aload_0         
	//    7   14:iload_1         
	//    8   15:aload           6
	//    9   17:aload_2         
	//   10   18:aload_3         
	//   11   19:aload           4
	//   12   21:aload           5
	//   13   23:invokespecial   #198 <Method Object getPostUrl(boolean, GigyaProvider$HttpMethod, String, String, String, GSObject)>
	//   14   26:areturn         
		else
			return getUrl(flag, httpmethod, s, s1, s2, gsobject);
	//   15   27:aload_0         
	//   16   28:iload_1         
	//   17   29:aload           6
	//   18   31:aload_2         
	//   19   32:aload_3         
	//   20   33:aload           4
	//   21   35:aload           5
	//   22   37:invokevirtual   #200 <Method Object getUrl(boolean, GigyaProvider$HttpMethod, String, String, String, GSObject)>
	//   23   40:areturn         
	}

	public abstract void login(Activity activity, GSObject gsobject, LoginProvider.ProviderCallback providercallback);

	public void login(Activity activity, GSObject gsobject, Boolean boolean1, LoginProvider.ProviderCallback providercallback)
	{
		if(boolean1.booleanValue())
	//*   0    0:aload_3         
	//*   1    1:invokevirtual   #210 <Method boolean Boolean.booleanValue()>
	//*   2    4:ifeq            16
		{
			fail(providercallback, "Silent login is not supported for this provider.");
	//    3    7:aload_0         
	//    4    8:aload           4
	//    5   10:ldc1            #212 <String "Silent login is not supported for this provider.">
	//    6   12:invokevirtual   #216 <Method void fail(LoginProvider$ProviderCallback, String)>
			return;
	//    7   15:return          
		} else
		{
			login(activity, gsobject, providercallback);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:aload           4
	//   12   21:invokevirtual   #218 <Method void login(Activity, GSObject, LoginProvider$ProviderCallback)>
			return;
	//   13   24:return          
		}
	}

	protected GSLogger logger;
}
