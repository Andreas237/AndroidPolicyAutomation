// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.api;


// Referenced classes of package com.google.ads.interactivemedia.v3.api:
//			AdError

public static final class AdError$AdErrorCode extends Enum
{

	static AdError$AdErrorCode a(int i)
	{
		AdError$AdErrorCode aaderror$aderrorcode[] = values();
	//    0    0:invokestatic    #110 <Method AdError$AdErrorCode[] values()>
	//    1    3:astore_3        
		int k = aaderror$aderrorcode.length;
	//    2    4:aload_3         
	//    3    5:arraylength     
	//    4    6:istore_2        
		for(int j = 0; j < k; j++)
	//*   5    7:iconst_0        
	//*   6    8:istore_1        
	//*   7    9:iload_1         
	//*   8   10:iload_2         
	//*   9   11:icmpge          38
		{
			AdError$AdErrorCode aderror$aderrorcode = aaderror$aderrorcode[j];
	//   10   14:aload_3         
	//   11   15:iload_1         
	//   12   16:aaload          
	//   13   17:astore          4
			if(aderror$aderrorcode.getErrorNumber() == i)
	//*  14   19:aload           4
	//*  15   21:invokevirtual   #114 <Method int getErrorNumber()>
	//*  16   24:iload_0         
	//*  17   25:icmpne          31
				return aderror$aderrorcode;
	//   18   28:aload           4
	//   19   30:areturn         
		}

	//   20   31:iload_1         
	//   21   32:iconst_1        
	//   22   33:iadd            
	//   23   34:istore_1        
	//*  24   35:goto            9
		if(1204 == i)
	//*  25   38:sipush          1204
	//*  26   41:iload_0         
	//*  27   42:icmpne          49
			return INTERNAL_ERROR;
	//   28   45:getstatic       #41  <Field AdError$AdErrorCode INTERNAL_ERROR>
	//   29   48:areturn         
		else
			return UNKNOWN_ERROR;
	//   30   49:getstatic       #77  <Field AdError$AdErrorCode UNKNOWN_ERROR>
	//   31   52:areturn         
	}

	public static AdError$AdErrorCode valueOf(String s)
	{
		return (AdError$AdErrorCode)Enum.valueOf(com/google/ads/interactivemedia/v3/api/AdError$AdErrorCode, s);
	//    0    0:ldc1            #2   <Class AdError$AdErrorCode>
	//    1    2:aload_0         
	//    2    3:invokestatic    #119 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class AdError$AdErrorCode>
	//    4    9:areturn         
	}

	public static AdError$AdErrorCode[] values()
	{
		return (AdError$AdErrorCode[])((AdError$AdErrorCode []) (b)).clone();
	//    0    0:getstatic       #97  <Field AdError$AdErrorCode[] b>
	//    1    3:invokevirtual   #124 <Method Object _5B_Lcom.google.ads.interactivemedia.v3.api.AdError$AdErrorCode_3B_.clone()>
	//    2    6:checkcast       #120 <Class AdError$AdErrorCode[]>
	//    3    9:areturn         
	}

	public boolean equals(int i)
	{
		return a == i;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field int a>
	//    2    4:iload_1         
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public int getErrorNumber()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field int a>
	//    2    4:ireturn         
	}

	public String toString()
	{
		String s = String.valueOf(((Object) (name())));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #131 <Method String name()>
	//    2    4:invokestatic    #136 <Method String String.valueOf(Object)>
	//    3    7:astore_2        
		int i = a;
	//    4    8:aload_0         
	//    5    9:getfield        #103 <Field int a>
	//    6   12:istore_1        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 41);
	//    7   13:new             #138 <Class StringBuilder>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokestatic    #136 <Method String String.valueOf(Object)>
	//   11   21:invokevirtual   #141 <Method int String.length()>
	//   12   24:bipush          41
	//   13   26:iadd            
	//   14   27:invokespecial   #143 <Method void StringBuilder(int)>
	//   15   30:astore_3        
		stringbuilder.append("AdErrorCode [name: ");
	//   16   31:aload_3         
	//   17   32:ldc1            #145 <String "AdErrorCode [name: ">
	//   18   34:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
		stringbuilder.append(s);
	//   20   38:aload_3         
	//   21   39:aload_2         
	//   22   40:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   23   43:pop             
		stringbuilder.append(", number: ");
	//   24   44:aload_3         
	//   25   45:ldc1            #151 <String ", number: ">
	//   26   47:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   27   50:pop             
		stringbuilder.append(i);
	//   28   51:aload_3         
	//   29   52:iload_1         
	//   30   53:invokevirtual   #154 <Method StringBuilder StringBuilder.append(int)>
	//   31   56:pop             
		stringbuilder.append("]");
	//   32   57:aload_3         
	//   33   58:ldc1            #156 <String "]">
	//   34   60:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   35   63:pop             
		return stringbuilder.toString();
	//   36   64:aload_3         
	//   37   65:invokevirtual   #158 <Method String StringBuilder.toString()>
	//   38   68:areturn         
	}

	public static final AdError$AdErrorCode ADS_REQUEST_NETWORK_ERROR;
	public static final AdError$AdErrorCode COMPANION_AD_LOADING_FAILED;
	public static final AdError$AdErrorCode FAILED_TO_REQUEST_ADS;
	public static final AdError$AdErrorCode INTERNAL_ERROR;
	public static final AdError$AdErrorCode INVALID_ARGUMENTS;
	public static final AdError$AdErrorCode OVERLAY_AD_LOADING_FAILED;
	public static final AdError$AdErrorCode OVERLAY_AD_PLAYING_FAILED;
	public static final AdError$AdErrorCode PLAYLIST_NO_CONTENT_TRACKING;
	public static final AdError$AdErrorCode UNKNOWN_AD_RESPONSE;
	public static final AdError$AdErrorCode UNKNOWN_ERROR;
	public static final AdError$AdErrorCode VAST_ASSET_NOT_FOUND;
	public static final AdError$AdErrorCode VAST_EMPTY_RESPONSE;
	public static final AdError$AdErrorCode VAST_LINEAR_ASSET_MISMATCH;
	public static final AdError$AdErrorCode VAST_LOAD_TIMEOUT;
	public static final AdError$AdErrorCode VAST_MALFORMED_RESPONSE;
	public static final AdError$AdErrorCode VAST_MEDIA_LOAD_TIMEOUT;
	public static final AdError$AdErrorCode VAST_NONLINEAR_ASSET_MISMATCH;
	public static final AdError$AdErrorCode VAST_TOO_MANY_REDIRECTS;
	public static final AdError$AdErrorCode VIDEO_PLAY_ERROR;
	private static final AdError$AdErrorCode b[];
	private final int a;

	static 
	{
		INTERNAL_ERROR = new AdError$AdErrorCode("INTERNAL_ERROR", 0, -1);
	//    0    0:new             #2   <Class AdError$AdErrorCode>
	//    1    3:dup             
	//    2    4:ldc1            #35  <String "INTERNAL_ERROR">
	//    3    6:iconst_0        
	//    4    7:iconst_m1       
	//    5    8:invokespecial   #39  <Method void AdError$AdErrorCode(String, int, int)>
	//    6   11:putstatic       #41  <Field AdError$AdErrorCode INTERNAL_ERROR>
		VAST_MALFORMED_RESPONSE = new AdError$AdErrorCode("VAST_MALFORMED_RESPONSE", 1, 100);
	//    7   14:new             #2   <Class AdError$AdErrorCode>
	//    8   17:dup             
	//    9   18:ldc1            #42  <String "VAST_MALFORMED_RESPONSE">
	//   10   20:iconst_1        
	//   11   21:bipush          100
	//   12   23:invokespecial   #39  <Method void AdError$AdErrorCode(String, int, int)>
	//   13   26:putstatic       #44  <Field AdError$AdErrorCode VAST_MALFORMED_RESPONSE>
		UNKNOWN_AD_RESPONSE = new AdError$AdErrorCode("UNKNOWN_AD_RESPONSE", 2, 1010);
	//   14   29:new             #2   <Class AdError$AdErrorCode>
	//   15   32:dup             
	//   16   33:ldc1            #45  <String "UNKNOWN_AD_RESPONSE">
	//   17   35:iconst_2        
	//   18   36:sipush          1010
	//   19   39:invokespecial   #39  <Method void AdError$AdErrorCode(String, int, int)>
	//   20   42:putstatic       #47  <Field AdError$AdErrorCode UNKNOWN_AD_RESPONSE>
		VAST_LOAD_TIMEOUT = new AdError$AdErrorCode("VAST_LOAD_TIMEOUT", 3, 301);
	//   21   45:new             #2   <Class AdError$AdErrorCode>
	//   22   48:dup             
	//   23   49:ldc1            #48  <String "VAST_LOAD_TIMEOUT">
	//   24   51:iconst_3        
	//   25   52:sipush          301
	//   26   55:invokespecial   #39  <Method void AdError$AdErrorCode(String, int, int)>
	//   27   58:putstatic       #50  <Field AdError$AdErrorCode VAST_LOAD_TIMEOUT>
		VAST_TOO_MANY_REDIRECTS = new AdError$AdErrorCode("VAST_TOO_MANY_REDIRECTS", 4, 302);
	//   28   61:new             #2   <Class AdError$AdErrorCode>
	//   29   64:dup             
	//   30   65:ldc1            #51  <String "VAST_TOO_MANY_REDIRECTS">
	//   31   67:iconst_4        
	//   32   68:sipush          302
	//   33   71:invokespecial   #39  <Method void AdError$AdErrorCode(String, int, int)>
	//   34   74:putstatic       #53  <Field AdError$AdErrorCode VAST_TOO_MANY_REDIRECTS>
		VIDEO_PLAY_ERROR = new AdError$AdErrorCode("VIDEO_PLAY_ERROR", 5, 400);
	//   35   77:new             #2   <Class AdError$AdErrorCode>
	//   36   80:dup             
	//   37   81:ldc1            #54  <String "VIDEO_PLAY_ERROR">
	//   38   83:iconst_5        
	//   39   84:sipush          400
	//   40   87:invokespecial   #39  <Method void AdError$AdErrorCode(String, int, int)>
	//   41   90:putstatic       #56  <Field AdError$AdErrorCode VIDEO_PLAY_ERROR>
		VAST_MEDIA_LOAD_TIMEOUT = new AdError$AdErrorCode("VAST_MEDIA_LOAD_TIMEOUT", 6, 402);
	//   42   93:new             #2   <Class AdError$AdErrorCode>
	//   43   96:dup             
	//   44   97:ldc1            #57  <String "VAST_MEDIA_LOAD_TIMEOUT">
	//   45   99:bipush          6
	//   46  101:sipush          402
	//   47  104:invokespecial   #39  <Method void AdError$AdErrorCode(String, int, int)>
	//   48  107:putstatic       #59  <Field AdError$AdErrorCode VAST_MEDIA_LOAD_TIMEOUT>
		VAST_LINEAR_ASSET_MISMATCH = new AdError$AdErrorCode("VAST_LINEAR_ASSET_MISMATCH", 7, 403);
	//   49  110:new             #2   <Class AdError$AdErrorCode>
	//   50  113:dup             
	//   51  114:ldc1            #60  <String "VAST_LINEAR_ASSET_MISMATCH">
	//   52  116:bipush          7
	//   53  118:sipush          403
	//   54  121:invokespecial   #39  <Method void AdError$AdErrorCode(String, int, int)>
	//   55  124:putstatic       #62  <Field AdError$AdErrorCode VAST_LINEAR_ASSET_MISMATCH>
		OVERLAY_AD_PLAYING_FAILED = new AdError$AdErrorCode("OVERLAY_AD_PLAYING_FAILED", 8, 500);
	//   56  127:new             #2   <Class AdError$AdErrorCode>
	//   57  130:dup             
	//   58  131:ldc1            #63  <String "OVERLAY_AD_PLAYING_FAILED">
	//   59  133:bipush          8
	//   60  135:sipush          500
	//   61  138:invokespecial   #39  <Method void AdError$AdErrorCode(String, int, int)>
	//   62  141:putstatic       #65  <Field AdError$AdErrorCode OVERLAY_AD_PLAYING_FAILED>
		OVERLAY_AD_LOADING_FAILED = new AdError$AdErrorCode("OVERLAY_AD_LOADING_FAILED", 9, 502);
	//   63  144:new             #2   <Class AdError$AdErrorCode>
	//   64  147:dup             
	//   65  148:ldc1            #66  <String "OVERLAY_AD_LOADING_FAILED">
	//   66  150:bipush          9
	//   67  152:sipush          502
	//   68  155:invokespecial   #39  <Method void AdError$AdErrorCode(String, int, int)>
	//   69  158:putstatic       #68  <Field AdError$AdErrorCode OVERLAY_AD_LOADING_FAILED>
		VAST_NONLINEAR_ASSET_MISMATCH = new AdError$AdErrorCode("VAST_NONLINEAR_ASSET_MISMATCH", 10, 503);
	//   70  161:new             #2   <Class AdError$AdErrorCode>
	//   71  164:dup             
	//   72  165:ldc1            #69  <String "VAST_NONLINEAR_ASSET_MISMATCH">
	//   73  167:bipush          10
	//   74  169:sipush          503
	//   75  172:invokespecial   #39  <Method void AdError$AdErrorCode(String, int, int)>
	//   76  175:putstatic       #71  <Field AdError$AdErrorCode VAST_NONLINEAR_ASSET_MISMATCH>
		COMPANION_AD_LOADING_FAILED = new AdError$AdErrorCode("COMPANION_AD_LOADING_FAILED", 11, 603);
	//   77  178:new             #2   <Class AdError$AdErrorCode>
	//   78  181:dup             
	//   79  182:ldc1            #72  <String "COMPANION_AD_LOADING_FAILED">
	//   80  184:bipush          11
	//   81  186:sipush          603
	//   82  189:invokespecial   #39  <Method void AdError$AdErrorCode(String, int, int)>
	//   83  192:putstatic       #74  <Field AdError$AdErrorCode COMPANION_AD_LOADING_FAILED>
		UNKNOWN_ERROR = new AdError$AdErrorCode("UNKNOWN_ERROR", 12, 900);
	//   84  195:new             #2   <Class AdError$AdErrorCode>
	//   85  198:dup             
	//   86  199:ldc1            #75  <String "UNKNOWN_ERROR">
	//   87  201:bipush          12
	//   88  203:sipush          900
	//   89  206:invokespecial   #39  <Method void AdError$AdErrorCode(String, int, int)>
	//   90  209:putstatic       #77  <Field AdError$AdErrorCode UNKNOWN_ERROR>
		VAST_EMPTY_RESPONSE = new AdError$AdErrorCode("VAST_EMPTY_RESPONSE", 13, 1009);
	//   91  212:new             #2   <Class AdError$AdErrorCode>
	//   92  215:dup             
	//   93  216:ldc1            #78  <String "VAST_EMPTY_RESPONSE">
	//   94  218:bipush          13
	//   95  220:sipush          1009
	//   96  223:invokespecial   #39  <Method void AdError$AdErrorCode(String, int, int)>
	//   97  226:putstatic       #80  <Field AdError$AdErrorCode VAST_EMPTY_RESPONSE>
		FAILED_TO_REQUEST_ADS = new AdError$AdErrorCode("FAILED_TO_REQUEST_ADS", 14, 1005);
	//   98  229:new             #2   <Class AdError$AdErrorCode>
	//   99  232:dup             
	//  100  233:ldc1            #81  <String "FAILED_TO_REQUEST_ADS">
	//  101  235:bipush          14
	//  102  237:sipush          1005
	//  103  240:invokespecial   #39  <Method void AdError$AdErrorCode(String, int, int)>
	//  104  243:putstatic       #83  <Field AdError$AdErrorCode FAILED_TO_REQUEST_ADS>
		VAST_ASSET_NOT_FOUND = new AdError$AdErrorCode("VAST_ASSET_NOT_FOUND", 15, 1007);
	//  105  246:new             #2   <Class AdError$AdErrorCode>
	//  106  249:dup             
	//  107  250:ldc1            #84  <String "VAST_ASSET_NOT_FOUND">
	//  108  252:bipush          15
	//  109  254:sipush          1007
	//  110  257:invokespecial   #39  <Method void AdError$AdErrorCode(String, int, int)>
	//  111  260:putstatic       #86  <Field AdError$AdErrorCode VAST_ASSET_NOT_FOUND>
		ADS_REQUEST_NETWORK_ERROR = new AdError$AdErrorCode("ADS_REQUEST_NETWORK_ERROR", 16, 1012);
	//  112  263:new             #2   <Class AdError$AdErrorCode>
	//  113  266:dup             
	//  114  267:ldc1            #87  <String "ADS_REQUEST_NETWORK_ERROR">
	//  115  269:bipush          16
	//  116  271:sipush          1012
	//  117  274:invokespecial   #39  <Method void AdError$AdErrorCode(String, int, int)>
	//  118  277:putstatic       #89  <Field AdError$AdErrorCode ADS_REQUEST_NETWORK_ERROR>
		INVALID_ARGUMENTS = new AdError$AdErrorCode("INVALID_ARGUMENTS", 17, 1101);
	//  119  280:new             #2   <Class AdError$AdErrorCode>
	//  120  283:dup             
	//  121  284:ldc1            #90  <String "INVALID_ARGUMENTS">
	//  122  286:bipush          17
	//  123  288:sipush          1101
	//  124  291:invokespecial   #39  <Method void AdError$AdErrorCode(String, int, int)>
	//  125  294:putstatic       #92  <Field AdError$AdErrorCode INVALID_ARGUMENTS>
		PLAYLIST_NO_CONTENT_TRACKING = new AdError$AdErrorCode("PLAYLIST_NO_CONTENT_TRACKING", 18, 1205);
	//  126  297:new             #2   <Class AdError$AdErrorCode>
	//  127  300:dup             
	//  128  301:ldc1            #93  <String "PLAYLIST_NO_CONTENT_TRACKING">
	//  129  303:bipush          18
	//  130  305:sipush          1205
	//  131  308:invokespecial   #39  <Method void AdError$AdErrorCode(String, int, int)>
	//  132  311:putstatic       #95  <Field AdError$AdErrorCode PLAYLIST_NO_CONTENT_TRACKING>
		b = (new AdError$AdErrorCode[] {
			INTERNAL_ERROR, VAST_MALFORMED_RESPONSE, UNKNOWN_AD_RESPONSE, VAST_LOAD_TIMEOUT, VAST_TOO_MANY_REDIRECTS, VIDEO_PLAY_ERROR, VAST_MEDIA_LOAD_TIMEOUT, VAST_LINEAR_ASSET_MISMATCH, OVERLAY_AD_PLAYING_FAILED, OVERLAY_AD_LOADING_FAILED, 
			VAST_NONLINEAR_ASSET_MISMATCH, COMPANION_AD_LOADING_FAILED, UNKNOWN_ERROR, VAST_EMPTY_RESPONSE, FAILED_TO_REQUEST_ADS, VAST_ASSET_NOT_FOUND, ADS_REQUEST_NETWORK_ERROR, INVALID_ARGUMENTS, PLAYLIST_NO_CONTENT_TRACKING
		});
	//  133  314:bipush          19
	//  134  316:anewarray       AdError$AdErrorCode[]
	//  135  319:dup             
	//  136  320:iconst_0        
	//  137  321:getstatic       #41  <Field AdError$AdErrorCode INTERNAL_ERROR>
	//  138  324:aastore         
	//  139  325:dup             
	//  140  326:iconst_1        
	//  141  327:getstatic       #44  <Field AdError$AdErrorCode VAST_MALFORMED_RESPONSE>
	//  142  330:aastore         
	//  143  331:dup             
	//  144  332:iconst_2        
	//  145  333:getstatic       #47  <Field AdError$AdErrorCode UNKNOWN_AD_RESPONSE>
	//  146  336:aastore         
	//  147  337:dup             
	//  148  338:iconst_3        
	//  149  339:getstatic       #50  <Field AdError$AdErrorCode VAST_LOAD_TIMEOUT>
	//  150  342:aastore         
	//  151  343:dup             
	//  152  344:iconst_4        
	//  153  345:getstatic       #53  <Field AdError$AdErrorCode VAST_TOO_MANY_REDIRECTS>
	//  154  348:aastore         
	//  155  349:dup             
	//  156  350:iconst_5        
	//  157  351:getstatic       #56  <Field AdError$AdErrorCode VIDEO_PLAY_ERROR>
	//  158  354:aastore         
	//  159  355:dup             
	//  160  356:bipush          6
	//  161  358:getstatic       #59  <Field AdError$AdErrorCode VAST_MEDIA_LOAD_TIMEOUT>
	//  162  361:aastore         
	//  163  362:dup             
	//  164  363:bipush          7
	//  165  365:getstatic       #62  <Field AdError$AdErrorCode VAST_LINEAR_ASSET_MISMATCH>
	//  166  368:aastore         
	//  167  369:dup             
	//  168  370:bipush          8
	//  169  372:getstatic       #65  <Field AdError$AdErrorCode OVERLAY_AD_PLAYING_FAILED>
	//  170  375:aastore         
	//  171  376:dup             
	//  172  377:bipush          9
	//  173  379:getstatic       #68  <Field AdError$AdErrorCode OVERLAY_AD_LOADING_FAILED>
	//  174  382:aastore         
	//  175  383:dup             
	//  176  384:bipush          10
	//  177  386:getstatic       #71  <Field AdError$AdErrorCode VAST_NONLINEAR_ASSET_MISMATCH>
	//  178  389:aastore         
	//  179  390:dup             
	//  180  391:bipush          11
	//  181  393:getstatic       #74  <Field AdError$AdErrorCode COMPANION_AD_LOADING_FAILED>
	//  182  396:aastore         
	//  183  397:dup             
	//  184  398:bipush          12
	//  185  400:getstatic       #77  <Field AdError$AdErrorCode UNKNOWN_ERROR>
	//  186  403:aastore         
	//  187  404:dup             
	//  188  405:bipush          13
	//  189  407:getstatic       #80  <Field AdError$AdErrorCode VAST_EMPTY_RESPONSE>
	//  190  410:aastore         
	//  191  411:dup             
	//  192  412:bipush          14
	//  193  414:getstatic       #83  <Field AdError$AdErrorCode FAILED_TO_REQUEST_ADS>
	//  194  417:aastore         
	//  195  418:dup             
	//  196  419:bipush          15
	//  197  421:getstatic       #86  <Field AdError$AdErrorCode VAST_ASSET_NOT_FOUND>
	//  198  424:aastore         
	//  199  425:dup             
	//  200  426:bipush          16
	//  201  428:getstatic       #89  <Field AdError$AdErrorCode ADS_REQUEST_NETWORK_ERROR>
	//  202  431:aastore         
	//  203  432:dup             
	//  204  433:bipush          17
	//  205  435:getstatic       #92  <Field AdError$AdErrorCode INVALID_ARGUMENTS>
	//  206  438:aastore         
	//  207  439:dup             
	//  208  440:bipush          18
	//  209  442:getstatic       #95  <Field AdError$AdErrorCode PLAYLIST_NO_CONTENT_TRACKING>
	//  210  445:aastore         
	//  211  446:putstatic       #97  <Field AdError$AdErrorCode[] b>
	//* 212  449:return          
	}

	private AdError$AdErrorCode(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #101 <Method void Enum(String, int)>
		a = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #103 <Field int a>
	//    7   11:return          
	}
}
