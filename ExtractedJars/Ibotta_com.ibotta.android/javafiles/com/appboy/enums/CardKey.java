// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.enums;

import bo.app.ek;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.appboy.enums:
//			CardType

public final class CardKey extends Enum
{
	public static class Provider
	{

		public CardType getCardTypeFromJson(JSONObject jsonobject)
		{
			String s1 = jsonobject.optString(getKey(CardKey.TYPE), ((String) (null)));
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getstatic       #23  <Field CardKey CardKey.TYPE>
		//    3    5:invokevirtual   #27  <Method String getKey(CardKey)>
		//    4    8:aconst_null     
		//    5    9:invokevirtual   #33  <Method String JSONObject.optString(String, String)>
		//    6   12:astore_3        
			String s = s1;
		//    7   13:aload_3         
		//    8   14:astore_2        
			if(!StringUtils.isNullOrEmpty(s1))
		//*   9   15:aload_3         
		//*  10   16:invokestatic    #39  <Method boolean StringUtils.isNullOrEmpty(String)>
		//*  11   19:ifne            73
			{
				s = s1;
		//   12   22:aload_3         
		//   13   23:astore_2        
				if(a)
		//*  14   24:aload_0         
		//*  15   25:getfield        #16  <Field boolean a>
		//*  16   28:ifeq            73
				{
					s = s1;
		//   17   31:aload_3         
		//   18   32:astore_2        
					if(s1.equals("short_news"))
		//*  19   33:aload_3         
		//*  20   34:ldc1            #41  <String "short_news">
		//*  21   36:invokevirtual   #47  <Method boolean String.equals(Object)>
		//*  22   39:ifeq            73
					{
						s = s1;
		//   23   42:aload_3         
		//   24   43:astore_2        
						if(StringUtils.isNullOrEmpty(ek.a(jsonobject, getKey(CardKey.SHORT_NEWS_IMAGE))))
		//*  25   44:aload_1         
		//*  26   45:aload_0         
		//*  27   46:getstatic       #50  <Field CardKey CardKey.SHORT_NEWS_IMAGE>
		//*  28   49:invokevirtual   #27  <Method String getKey(CardKey)>
		//*  29   52:invokestatic    #55  <Method String ek.a(JSONObject, String)>
		//*  30   55:invokestatic    #39  <Method boolean StringUtils.isNullOrEmpty(String)>
		//*  31   58:ifeq            73
						{
							AppboyLogger.v(CardKey.a(), "Short News card doesn't contain image url, parsing type as Text Announcement");
		//   32   61:invokestatic    #58  <Method String CardKey.a()>
		//   33   64:ldc1            #60  <String "Short News card doesn't contain image url, parsing type as Text Announcement">
		//   34   66:invokestatic    #66  <Method int AppboyLogger.v(String, String)>
		//   35   69:pop             
							s = "text_announcement";
		//   36   70:ldc1            #68  <String "text_announcement">
		//   37   72:astore_2        
						}
					}
				}
			}
			if(CardKey.b().containsKey(((Object) (s))))
		//*  38   73:invokestatic    #72  <Method Map CardKey.b()>
		//*  39   76:aload_2         
		//*  40   77:invokeinterface #77  <Method boolean Map.containsKey(Object)>
		//*  41   82:ifeq            98
				return (CardType)CardKey.b().get(((Object) (s)));
		//   42   85:invokestatic    #72  <Method Map CardKey.b()>
		//   43   88:aload_2         
		//   44   89:invokeinterface #81  <Method Object Map.get(Object)>
		//   45   94:checkcast       #83  <Class CardType>
		//   46   97:areturn         
			else
				return CardType.DEFAULT;
		//   47   98:getstatic       #87  <Field CardType CardType.DEFAULT>
		//   48  101:areturn         
		}

		public String getKey(CardKey cardkey)
		{
			if(a)
		//*   0    0:aload_0         
		//*   1    1:getfield        #16  <Field boolean a>
		//*   2    4:ifeq            12
				return cardkey.getContentCardsKey();
		//    3    7:aload_1         
		//    4    8:invokevirtual   #90  <Method String CardKey.getContentCardsKey()>
		//    5   11:areturn         
			else
				return cardkey.getFeedKey();
		//    6   12:aload_1         
		//    7   13:invokevirtual   #93  <Method String CardKey.getFeedKey()>
		//    8   16:areturn         
		}

		private final boolean a;

		public Provider(boolean flag)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
			a = flag;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #16  <Field boolean a>
		//    5    9:return          
		}
	}


	private CardKey(String s, int i, String s1, String s2)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #278 <Method void Enum(String, int)>
		c = s1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #280 <Field String c>
		d = s2;
	//    7   11:aload_0         
	//    8   12:aload           4
	//    9   14:putfield        #282 <Field String d>
	//   10   17:return          
	}

	static String a()
	{
		return a;
	//    0    0:getstatic       #234 <Field String a>
	//    1    3:areturn         
	}

	static Map b()
	{
		return b;
	//    0    0:getstatic       #240 <Field Map b>
	//    1    3:areturn         
	}

	public static CardKey valueOf(String s)
	{
		return (CardKey)Enum.valueOf(com/appboy/enums/CardKey, s);
	//    0    0:ldc1            #2   <Class CardKey>
	//    1    2:aload_0         
	//    2    3:invokestatic    #291 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class CardKey>
	//    4    9:areturn         
	}

	public static CardKey[] values()
	{
		return (CardKey[])((CardKey []) (e)).clone();
	//    0    0:getstatic       #226 <Field CardKey[] e>
	//    1    3:invokevirtual   #298 <Method Object _5B_Lcom.appboy.enums.CardKey_3B_.clone()>
	//    2    6:checkcast       #294 <Class CardKey[]>
	//    3    9:areturn         
	}

	public String getContentCardsKey()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #282 <Field String d>
	//    2    4:areturn         
	}

	public String getFeedKey()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #280 <Field String c>
	//    2    4:areturn         
	}

	public static final CardKey BANNER_IMAGE_ASPECT_RATIO;
	public static final CardKey BANNER_IMAGE_DOMAIN;
	public static final CardKey BANNER_IMAGE_IMAGE;
	public static final CardKey BANNER_IMAGE_URL;
	public static final CardKey CAPTIONED_IMAGE_ASPECT_RATIO;
	public static final CardKey CAPTIONED_IMAGE_DESCRIPTION;
	public static final CardKey CAPTIONED_IMAGE_DOMAIN;
	public static final CardKey CAPTIONED_IMAGE_IMAGE;
	public static final CardKey CAPTIONED_IMAGE_TITLE;
	public static final CardKey CAPTIONED_IMAGE_URL;
	public static final CardKey CATEGORIES;
	public static final CardKey CLICKED;
	public static final CardKey CREATED;
	public static final CardKey DISMISSED;
	public static final CardKey DISMISSIBLE;
	public static final CardKey EXPIRES_AT;
	public static final CardKey EXTRAS;
	public static final CardKey ID;
	public static final CardKey OPEN_URI_IN_WEBVIEW;
	public static final CardKey PINNED;
	public static final CardKey READ;
	public static final CardKey REMOVED;
	public static final CardKey SHORT_NEWS_DESCRIPTION;
	public static final CardKey SHORT_NEWS_DOMAIN;
	public static final CardKey SHORT_NEWS_IMAGE;
	public static final CardKey SHORT_NEWS_TITLE;
	public static final CardKey SHORT_NEWS_URL;
	public static final CardKey TEXT_ANNOUNCEMENT_DESCRIPTION;
	public static final CardKey TEXT_ANNOUNCEMENT_DOMAIN;
	public static final CardKey TEXT_ANNOUNCEMENT_TITLE;
	public static final CardKey TEXT_ANNOUNCEMENT_URL;
	public static final CardKey TYPE;
	public static final CardKey UPDATED;
	public static final CardKey VIEWED;
	private static final String a = AppboyLogger.getAppboyLogTag(com/appboy/enums/CardKey);
	private static final Map b;
	private static final CardKey e[];
	private String c;
	private String d;

	static 
	{
		ID = new CardKey("ID", 0, "id", "id");
	//    0    0:new             #2   <Class CardKey>
	//    1    3:dup             
	//    2    4:ldc1            #55  <String "ID">
	//    3    6:iconst_0        
	//    4    7:ldc1            #57  <String "id">
	//    5    9:ldc1            #57  <String "id">
	//    6   11:invokespecial   #61  <Method void CardKey(String, int, String, String)>
	//    7   14:putstatic       #63  <Field CardKey ID>
		VIEWED = new CardKey("VIEWED", 1, "viewed", "v");
	//    8   17:new             #2   <Class CardKey>
	//    9   20:dup             
	//   10   21:ldc1            #64  <String "VIEWED">
	//   11   23:iconst_1        
	//   12   24:ldc1            #66  <String "viewed">
	//   13   26:ldc1            #68  <String "v">
	//   14   28:invokespecial   #61  <Method void CardKey(String, int, String, String)>
	//   15   31:putstatic       #70  <Field CardKey VIEWED>
		CREATED = new CardKey("CREATED", 2, "created", "ca");
	//   16   34:new             #2   <Class CardKey>
	//   17   37:dup             
	//   18   38:ldc1            #71  <String "CREATED">
	//   19   40:iconst_2        
	//   20   41:ldc1            #73  <String "created">
	//   21   43:ldc1            #75  <String "ca">
	//   22   45:invokespecial   #61  <Method void CardKey(String, int, String, String)>
	//   23   48:putstatic       #77  <Field CardKey CREATED>
		EXPIRES_AT = new CardKey("EXPIRES_AT", 3, "expires_at", "ea");
	//   24   51:new             #2   <Class CardKey>
	//   25   54:dup             
	//   26   55:ldc1            #78  <String "EXPIRES_AT">
	//   27   57:iconst_3        
	//   28   58:ldc1            #80  <String "expires_at">
	//   29   60:ldc1            #82  <String "ea">
	//   30   62:invokespecial   #61  <Method void CardKey(String, int, String, String)>
	//   31   65:putstatic       #84  <Field CardKey EXPIRES_AT>
		EXTRAS = new CardKey("EXTRAS", 4, "extras", "e");
	//   32   68:new             #2   <Class CardKey>
	//   33   71:dup             
	//   34   72:ldc1            #85  <String "EXTRAS">
	//   35   74:iconst_4        
	//   36   75:ldc1            #87  <String "extras">
	//   37   77:ldc1            #88  <String "e">
	//   38   79:invokespecial   #61  <Method void CardKey(String, int, String, String)>
	//   39   82:putstatic       #90  <Field CardKey EXTRAS>
		OPEN_URI_IN_WEBVIEW = new CardKey("OPEN_URI_IN_WEBVIEW", 5, "use_webview", "uw");
	//   40   85:new             #2   <Class CardKey>
	//   41   88:dup             
	//   42   89:ldc1            #91  <String "OPEN_URI_IN_WEBVIEW">
	//   43   91:iconst_5        
	//   44   92:ldc1            #93  <String "use_webview">
	//   45   94:ldc1            #95  <String "uw">
	//   46   96:invokespecial   #61  <Method void CardKey(String, int, String, String)>
	//   47   99:putstatic       #97  <Field CardKey OPEN_URI_IN_WEBVIEW>
		TYPE = new CardKey("TYPE", 6, "type", "tp");
	//   48  102:new             #2   <Class CardKey>
	//   49  105:dup             
	//   50  106:ldc1            #98  <String "TYPE">
	//   51  108:bipush          6
	//   52  110:ldc1            #100 <String "type">
	//   53  112:ldc1            #102 <String "tp">
	//   54  114:invokespecial   #61  <Method void CardKey(String, int, String, String)>
	//   55  117:putstatic       #104 <Field CardKey TYPE>
		CATEGORIES = new CardKey("CATEGORIES", 7, "categories", ((String) (null)));
	//   56  120:new             #2   <Class CardKey>
	//   57  123:dup             
	//   58  124:ldc1            #105 <String "CATEGORIES">
	//   59  126:bipush          7
	//   60  128:ldc1            #107 <String "categories">
	//   61  130:aconst_null     
	//   62  131:invokespecial   #61  <Method void CardKey(String, int, String, String)>
	//   63  134:putstatic       #109 <Field CardKey CATEGORIES>
		UPDATED = new CardKey("UPDATED", 8, "updated", ((String) (null)));
	//   64  137:new             #2   <Class CardKey>
	//   65  140:dup             
	//   66  141:ldc1            #110 <String "UPDATED">
	//   67  143:bipush          8
	//   68  145:ldc1            #112 <String "updated">
	//   69  147:aconst_null     
	//   70  148:invokespecial   #61  <Method void CardKey(String, int, String, String)>
	//   71  151:putstatic       #114 <Field CardKey UPDATED>
		DISMISSED = new CardKey("DISMISSED", 9, ((String) (null)), "d");
	//   72  154:new             #2   <Class CardKey>
	//   73  157:dup             
	//   74  158:ldc1            #115 <String "DISMISSED">
	//   75  160:bipush          9
	//   76  162:aconst_null     
	//   77  163:ldc1            #116 <String "d">
	//   78  165:invokespecial   #61  <Method void CardKey(String, int, String, String)>
	//   79  168:putstatic       #118 <Field CardKey DISMISSED>
		REMOVED = new CardKey("REMOVED", 10, ((String) (null)), "r");
	//   80  171:new             #2   <Class CardKey>
	//   81  174:dup             
	//   82  175:ldc1            #119 <String "REMOVED">
	//   83  177:bipush          10
	//   84  179:aconst_null     
	//   85  180:ldc1            #121 <String "r">
	//   86  182:invokespecial   #61  <Method void CardKey(String, int, String, String)>
	//   87  185:putstatic       #123 <Field CardKey REMOVED>
		PINNED = new CardKey("PINNED", 11, ((String) (null)), "p");
	//   88  188:new             #2   <Class CardKey>
	//   89  191:dup             
	//   90  192:ldc1            #124 <String "PINNED">
	//   91  194:bipush          11
	//   92  196:aconst_null     
	//   93  197:ldc1            #126 <String "p">
	//   94  199:invokespecial   #61  <Method void CardKey(String, int, String, String)>
	//   95  202:putstatic       #128 <Field CardKey PINNED>
		DISMISSIBLE = new CardKey("DISMISSIBLE", 12, ((String) (null)), "db");
	//   96  205:new             #2   <Class CardKey>
	//   97  208:dup             
	//   98  209:ldc1            #129 <String "DISMISSIBLE">
	//   99  211:bipush          12
	//  100  213:aconst_null     
	//  101  214:ldc1            #131 <String "db">
	//  102  216:invokespecial   #61  <Method void CardKey(String, int, String, String)>
	//  103  219:putstatic       #133 <Field CardKey DISMISSIBLE>
		READ = new CardKey("READ", 13, ((String) (null)), "read");
	//  104  222:new             #2   <Class CardKey>
	//  105  225:dup             
	//  106  226:ldc1            #134 <String "READ">
	//  107  228:bipush          13
	//  108  230:aconst_null     
	//  109  231:ldc1            #136 <String "read">
	//  110  233:invokespecial   #61  <Method void CardKey(String, int, String, String)>
	//  111  236:putstatic       #138 <Field CardKey READ>
		CLICKED = new CardKey("CLICKED", 14, ((String) (null)), "cl");
	//  112  239:new             #2   <Class CardKey>
	//  113  242:dup             
	//  114  243:ldc1            #139 <String "CLICKED">
	//  115  245:bipush          14
	//  116  247:aconst_null     
	//  117  248:ldc1            #141 <String "cl">
	//  118  250:invokespecial   #61  <Method void CardKey(String, int, String, String)>
	//  119  253:putstatic       #143 <Field CardKey CLICKED>
		BANNER_IMAGE_IMAGE = new CardKey("BANNER_IMAGE_IMAGE", 15, "image", "i");
	//  120  256:new             #2   <Class CardKey>
	//  121  259:dup             
	//  122  260:ldc1            #144 <String "BANNER_IMAGE_IMAGE">
	//  123  262:bipush          15
	//  124  264:ldc1            #146 <String "image">
	//  125  266:ldc1            #148 <String "i">
	//  126  268:invokespecial   #61  <Method void CardKey(String, int, String, String)>
	//  127  271:putstatic       #150 <Field CardKey BANNER_IMAGE_IMAGE>
		BANNER_IMAGE_URL = new CardKey("BANNER_IMAGE_URL", 16, "url", "u");
	//  128  274:new             #2   <Class CardKey>
	//  129  277:dup             
	//  130  278:ldc1            #151 <String "BANNER_IMAGE_URL">
	//  131  280:bipush          16
	//  132  282:ldc1            #153 <String "url">
	//  133  284:ldc1            #155 <String "u">
	//  134  286:invokespecial   #61  <Method void CardKey(String, int, String, String)>
	//  135  289:putstatic       #157 <Field CardKey BANNER_IMAGE_URL>
		BANNER_IMAGE_DOMAIN = new CardKey("BANNER_IMAGE_DOMAIN", 17, "domain", ((String) (null)));
	//  136  292:new             #2   <Class CardKey>
	//  137  295:dup             
	//  138  296:ldc1            #158 <String "BANNER_IMAGE_DOMAIN">
	//  139  298:bipush          17
	//  140  300:ldc1            #160 <String "domain">
	//  141  302:aconst_null     
	//  142  303:invokespecial   #61  <Method void CardKey(String, int, String, String)>
	//  143  306:putstatic       #162 <Field CardKey BANNER_IMAGE_DOMAIN>
		BANNER_IMAGE_ASPECT_RATIO = new CardKey("BANNER_IMAGE_ASPECT_RATIO", 18, "aspect_ratio", "ar");
	//  144  309:new             #2   <Class CardKey>
	//  145  312:dup             
	//  146  313:ldc1            #163 <String "BANNER_IMAGE_ASPECT_RATIO">
	//  147  315:bipush          18
	//  148  317:ldc1            #165 <String "aspect_ratio">
	//  149  319:ldc1            #167 <String "ar">
	//  150  321:invokespecial   #61  <Method void CardKey(String, int, String, String)>
	//  151  324:putstatic       #169 <Field CardKey BANNER_IMAGE_ASPECT_RATIO>
		CAPTIONED_IMAGE_IMAGE = new CardKey("CAPTIONED_IMAGE_IMAGE", 19, "image", "i");
	//  152  327:new             #2   <Class CardKey>
	//  153  330:dup             
	//  154  331:ldc1            #170 <String "CAPTIONED_IMAGE_IMAGE">
	//  155  333:bipush          19
	//  156  335:ldc1            #146 <String "image">
	//  157  337:ldc1            #148 <String "i">
	//  158  339:invokespecial   #61  <Method void CardKey(String, int, String, String)>
	//  159  342:putstatic       #172 <Field CardKey CAPTIONED_IMAGE_IMAGE>
		CAPTIONED_IMAGE_TITLE = new CardKey("CAPTIONED_IMAGE_TITLE", 20, "title", "tt");
	//  160  345:new             #2   <Class CardKey>
	//  161  348:dup             
	//  162  349:ldc1            #173 <String "CAPTIONED_IMAGE_TITLE">
	//  163  351:bipush          20
	//  164  353:ldc1            #175 <String "title">
	//  165  355:ldc1            #177 <String "tt">
	//  166  357:invokespecial   #61  <Method void CardKey(String, int, String, String)>
	//  167  360:putstatic       #179 <Field CardKey CAPTIONED_IMAGE_TITLE>
		CAPTIONED_IMAGE_DESCRIPTION = new CardKey("CAPTIONED_IMAGE_DESCRIPTION", 21, "description", "ds");
	//  168  363:new             #2   <Class CardKey>
	//  169  366:dup             
	//  170  367:ldc1            #180 <String "CAPTIONED_IMAGE_DESCRIPTION">
	//  171  369:bipush          21
	//  172  371:ldc1            #182 <String "description">
	//  173  373:ldc1            #184 <String "ds">
	//  174  375:invokespecial   #61  <Method void CardKey(String, int, String, String)>
	//  175  378:putstatic       #186 <Field CardKey CAPTIONED_IMAGE_DESCRIPTION>
		CAPTIONED_IMAGE_URL = new CardKey("CAPTIONED_IMAGE_URL", 22, "url", "u");
	//  176  381:new             #2   <Class CardKey>
	//  177  384:dup             
	//  178  385:ldc1            #187 <String "CAPTIONED_IMAGE_URL">
	//  179  387:bipush          22
	//  180  389:ldc1            #153 <String "url">
	//  181  391:ldc1            #155 <String "u">
	//  182  393:invokespecial   #61  <Method void CardKey(String, int, String, String)>
	//  183  396:putstatic       #189 <Field CardKey CAPTIONED_IMAGE_URL>
		CAPTIONED_IMAGE_DOMAIN = new CardKey("CAPTIONED_IMAGE_DOMAIN", 23, "domain", "dm");
	//  184  399:new             #2   <Class CardKey>
	//  185  402:dup             
	//  186  403:ldc1            #190 <String "CAPTIONED_IMAGE_DOMAIN">
	//  187  405:bipush          23
	//  188  407:ldc1            #160 <String "domain">
	//  189  409:ldc1            #192 <String "dm">
	//  190  411:invokespecial   #61  <Method void CardKey(String, int, String, String)>
	//  191  414:putstatic       #194 <Field CardKey CAPTIONED_IMAGE_DOMAIN>
		CAPTIONED_IMAGE_ASPECT_RATIO = new CardKey("CAPTIONED_IMAGE_ASPECT_RATIO", 24, "aspect_ratio", "ar");
	//  192  417:new             #2   <Class CardKey>
	//  193  420:dup             
	//  194  421:ldc1            #195 <String "CAPTIONED_IMAGE_ASPECT_RATIO">
	//  195  423:bipush          24
	//  196  425:ldc1            #165 <String "aspect_ratio">
	//  197  427:ldc1            #167 <String "ar">
	//  198  429:invokespecial   #61  <Method void CardKey(String, int, String, String)>
	//  199  432:putstatic       #197 <Field CardKey CAPTIONED_IMAGE_ASPECT_RATIO>
		TEXT_ANNOUNCEMENT_TITLE = new CardKey("TEXT_ANNOUNCEMENT_TITLE", 25, "title", "tt");
	//  200  435:new             #2   <Class CardKey>
	//  201  438:dup             
	//  202  439:ldc1            #198 <String "TEXT_ANNOUNCEMENT_TITLE">
	//  203  441:bipush          25
	//  204  443:ldc1            #175 <String "title">
	//  205  445:ldc1            #177 <String "tt">
	//  206  447:invokespecial   #61  <Method void CardKey(String, int, String, String)>
	//  207  450:putstatic       #200 <Field CardKey TEXT_ANNOUNCEMENT_TITLE>
		TEXT_ANNOUNCEMENT_DESCRIPTION = new CardKey("TEXT_ANNOUNCEMENT_DESCRIPTION", 26, "description", "ds");
	//  208  453:new             #2   <Class CardKey>
	//  209  456:dup             
	//  210  457:ldc1            #201 <String "TEXT_ANNOUNCEMENT_DESCRIPTION">
	//  211  459:bipush          26
	//  212  461:ldc1            #182 <String "description">
	//  213  463:ldc1            #184 <String "ds">
	//  214  465:invokespecial   #61  <Method void CardKey(String, int, String, String)>
	//  215  468:putstatic       #203 <Field CardKey TEXT_ANNOUNCEMENT_DESCRIPTION>
		TEXT_ANNOUNCEMENT_URL = new CardKey("TEXT_ANNOUNCEMENT_URL", 27, "url", "u");
	//  216  471:new             #2   <Class CardKey>
	//  217  474:dup             
	//  218  475:ldc1            #204 <String "TEXT_ANNOUNCEMENT_URL">
	//  219  477:bipush          27
	//  220  479:ldc1            #153 <String "url">
	//  221  481:ldc1            #155 <String "u">
	//  222  483:invokespecial   #61  <Method void CardKey(String, int, String, String)>
	//  223  486:putstatic       #206 <Field CardKey TEXT_ANNOUNCEMENT_URL>
		TEXT_ANNOUNCEMENT_DOMAIN = new CardKey("TEXT_ANNOUNCEMENT_DOMAIN", 28, "domain", "dm");
	//  224  489:new             #2   <Class CardKey>
	//  225  492:dup             
	//  226  493:ldc1            #207 <String "TEXT_ANNOUNCEMENT_DOMAIN">
	//  227  495:bipush          28
	//  228  497:ldc1            #160 <String "domain">
	//  229  499:ldc1            #192 <String "dm">
	//  230  501:invokespecial   #61  <Method void CardKey(String, int, String, String)>
	//  231  504:putstatic       #209 <Field CardKey TEXT_ANNOUNCEMENT_DOMAIN>
		SHORT_NEWS_IMAGE = new CardKey("SHORT_NEWS_IMAGE", 29, "image", "i");
	//  232  507:new             #2   <Class CardKey>
	//  233  510:dup             
	//  234  511:ldc1            #210 <String "SHORT_NEWS_IMAGE">
	//  235  513:bipush          29
	//  236  515:ldc1            #146 <String "image">
	//  237  517:ldc1            #148 <String "i">
	//  238  519:invokespecial   #61  <Method void CardKey(String, int, String, String)>
	//  239  522:putstatic       #212 <Field CardKey SHORT_NEWS_IMAGE>
		SHORT_NEWS_TITLE = new CardKey("SHORT_NEWS_TITLE", 30, "title", "tt");
	//  240  525:new             #2   <Class CardKey>
	//  241  528:dup             
	//  242  529:ldc1            #213 <String "SHORT_NEWS_TITLE">
	//  243  531:bipush          30
	//  244  533:ldc1            #175 <String "title">
	//  245  535:ldc1            #177 <String "tt">
	//  246  537:invokespecial   #61  <Method void CardKey(String, int, String, String)>
	//  247  540:putstatic       #215 <Field CardKey SHORT_NEWS_TITLE>
		SHORT_NEWS_DESCRIPTION = new CardKey("SHORT_NEWS_DESCRIPTION", 31, "description", "ds");
	//  248  543:new             #2   <Class CardKey>
	//  249  546:dup             
	//  250  547:ldc1            #216 <String "SHORT_NEWS_DESCRIPTION">
	//  251  549:bipush          31
	//  252  551:ldc1            #182 <String "description">
	//  253  553:ldc1            #184 <String "ds">
	//  254  555:invokespecial   #61  <Method void CardKey(String, int, String, String)>
	//  255  558:putstatic       #218 <Field CardKey SHORT_NEWS_DESCRIPTION>
		SHORT_NEWS_URL = new CardKey("SHORT_NEWS_URL", 32, "url", "u");
	//  256  561:new             #2   <Class CardKey>
	//  257  564:dup             
	//  258  565:ldc1            #219 <String "SHORT_NEWS_URL">
	//  259  567:bipush          32
	//  260  569:ldc1            #153 <String "url">
	//  261  571:ldc1            #155 <String "u">
	//  262  573:invokespecial   #61  <Method void CardKey(String, int, String, String)>
	//  263  576:putstatic       #221 <Field CardKey SHORT_NEWS_URL>
		SHORT_NEWS_DOMAIN = new CardKey("SHORT_NEWS_DOMAIN", 33, "domain", "dm");
	//  264  579:new             #2   <Class CardKey>
	//  265  582:dup             
	//  266  583:ldc1            #222 <String "SHORT_NEWS_DOMAIN">
	//  267  585:bipush          33
	//  268  587:ldc1            #160 <String "domain">
	//  269  589:ldc1            #192 <String "dm">
	//  270  591:invokespecial   #61  <Method void CardKey(String, int, String, String)>
	//  271  594:putstatic       #224 <Field CardKey SHORT_NEWS_DOMAIN>
		e = (new CardKey[] {
			ID, VIEWED, CREATED, EXPIRES_AT, EXTRAS, OPEN_URI_IN_WEBVIEW, TYPE, CATEGORIES, UPDATED, DISMISSED, 
			REMOVED, PINNED, DISMISSIBLE, READ, CLICKED, BANNER_IMAGE_IMAGE, BANNER_IMAGE_URL, BANNER_IMAGE_DOMAIN, BANNER_IMAGE_ASPECT_RATIO, CAPTIONED_IMAGE_IMAGE, 
			CAPTIONED_IMAGE_TITLE, CAPTIONED_IMAGE_DESCRIPTION, CAPTIONED_IMAGE_URL, CAPTIONED_IMAGE_DOMAIN, CAPTIONED_IMAGE_ASPECT_RATIO, TEXT_ANNOUNCEMENT_TITLE, TEXT_ANNOUNCEMENT_DESCRIPTION, TEXT_ANNOUNCEMENT_URL, TEXT_ANNOUNCEMENT_DOMAIN, SHORT_NEWS_IMAGE, 
			SHORT_NEWS_TITLE, SHORT_NEWS_DESCRIPTION, SHORT_NEWS_URL, SHORT_NEWS_DOMAIN
		});
	//  272  597:bipush          34
	//  273  599:anewarray       CardKey[]
	//  274  602:dup             
	//  275  603:iconst_0        
	//  276  604:getstatic       #63  <Field CardKey ID>
	//  277  607:aastore         
	//  278  608:dup             
	//  279  609:iconst_1        
	//  280  610:getstatic       #70  <Field CardKey VIEWED>
	//  281  613:aastore         
	//  282  614:dup             
	//  283  615:iconst_2        
	//  284  616:getstatic       #77  <Field CardKey CREATED>
	//  285  619:aastore         
	//  286  620:dup             
	//  287  621:iconst_3        
	//  288  622:getstatic       #84  <Field CardKey EXPIRES_AT>
	//  289  625:aastore         
	//  290  626:dup             
	//  291  627:iconst_4        
	//  292  628:getstatic       #90  <Field CardKey EXTRAS>
	//  293  631:aastore         
	//  294  632:dup             
	//  295  633:iconst_5        
	//  296  634:getstatic       #97  <Field CardKey OPEN_URI_IN_WEBVIEW>
	//  297  637:aastore         
	//  298  638:dup             
	//  299  639:bipush          6
	//  300  641:getstatic       #104 <Field CardKey TYPE>
	//  301  644:aastore         
	//  302  645:dup             
	//  303  646:bipush          7
	//  304  648:getstatic       #109 <Field CardKey CATEGORIES>
	//  305  651:aastore         
	//  306  652:dup             
	//  307  653:bipush          8
	//  308  655:getstatic       #114 <Field CardKey UPDATED>
	//  309  658:aastore         
	//  310  659:dup             
	//  311  660:bipush          9
	//  312  662:getstatic       #118 <Field CardKey DISMISSED>
	//  313  665:aastore         
	//  314  666:dup             
	//  315  667:bipush          10
	//  316  669:getstatic       #123 <Field CardKey REMOVED>
	//  317  672:aastore         
	//  318  673:dup             
	//  319  674:bipush          11
	//  320  676:getstatic       #128 <Field CardKey PINNED>
	//  321  679:aastore         
	//  322  680:dup             
	//  323  681:bipush          12
	//  324  683:getstatic       #133 <Field CardKey DISMISSIBLE>
	//  325  686:aastore         
	//  326  687:dup             
	//  327  688:bipush          13
	//  328  690:getstatic       #138 <Field CardKey READ>
	//  329  693:aastore         
	//  330  694:dup             
	//  331  695:bipush          14
	//  332  697:getstatic       #143 <Field CardKey CLICKED>
	//  333  700:aastore         
	//  334  701:dup             
	//  335  702:bipush          15
	//  336  704:getstatic       #150 <Field CardKey BANNER_IMAGE_IMAGE>
	//  337  707:aastore         
	//  338  708:dup             
	//  339  709:bipush          16
	//  340  711:getstatic       #157 <Field CardKey BANNER_IMAGE_URL>
	//  341  714:aastore         
	//  342  715:dup             
	//  343  716:bipush          17
	//  344  718:getstatic       #162 <Field CardKey BANNER_IMAGE_DOMAIN>
	//  345  721:aastore         
	//  346  722:dup             
	//  347  723:bipush          18
	//  348  725:getstatic       #169 <Field CardKey BANNER_IMAGE_ASPECT_RATIO>
	//  349  728:aastore         
	//  350  729:dup             
	//  351  730:bipush          19
	//  352  732:getstatic       #172 <Field CardKey CAPTIONED_IMAGE_IMAGE>
	//  353  735:aastore         
	//  354  736:dup             
	//  355  737:bipush          20
	//  356  739:getstatic       #179 <Field CardKey CAPTIONED_IMAGE_TITLE>
	//  357  742:aastore         
	//  358  743:dup             
	//  359  744:bipush          21
	//  360  746:getstatic       #186 <Field CardKey CAPTIONED_IMAGE_DESCRIPTION>
	//  361  749:aastore         
	//  362  750:dup             
	//  363  751:bipush          22
	//  364  753:getstatic       #189 <Field CardKey CAPTIONED_IMAGE_URL>
	//  365  756:aastore         
	//  366  757:dup             
	//  367  758:bipush          23
	//  368  760:getstatic       #194 <Field CardKey CAPTIONED_IMAGE_DOMAIN>
	//  369  763:aastore         
	//  370  764:dup             
	//  371  765:bipush          24
	//  372  767:getstatic       #197 <Field CardKey CAPTIONED_IMAGE_ASPECT_RATIO>
	//  373  770:aastore         
	//  374  771:dup             
	//  375  772:bipush          25
	//  376  774:getstatic       #200 <Field CardKey TEXT_ANNOUNCEMENT_TITLE>
	//  377  777:aastore         
	//  378  778:dup             
	//  379  779:bipush          26
	//  380  781:getstatic       #203 <Field CardKey TEXT_ANNOUNCEMENT_DESCRIPTION>
	//  381  784:aastore         
	//  382  785:dup             
	//  383  786:bipush          27
	//  384  788:getstatic       #206 <Field CardKey TEXT_ANNOUNCEMENT_URL>
	//  385  791:aastore         
	//  386  792:dup             
	//  387  793:bipush          28
	//  388  795:getstatic       #209 <Field CardKey TEXT_ANNOUNCEMENT_DOMAIN>
	//  389  798:aastore         
	//  390  799:dup             
	//  391  800:bipush          29
	//  392  802:getstatic       #212 <Field CardKey SHORT_NEWS_IMAGE>
	//  393  805:aastore         
	//  394  806:dup             
	//  395  807:bipush          30
	//  396  809:getstatic       #215 <Field CardKey SHORT_NEWS_TITLE>
	//  397  812:aastore         
	//  398  813:dup             
	//  399  814:bipush          31
	//  400  816:getstatic       #218 <Field CardKey SHORT_NEWS_DESCRIPTION>
	//  401  819:aastore         
	//  402  820:dup             
	//  403  821:bipush          32
	//  404  823:getstatic       #221 <Field CardKey SHORT_NEWS_URL>
	//  405  826:aastore         
	//  406  827:dup             
	//  407  828:bipush          33
	//  408  830:getstatic       #224 <Field CardKey SHORT_NEWS_DOMAIN>
	//  409  833:aastore         
	//  410  834:putstatic       #226 <Field CardKey[] e>
	//  411  837:ldc1            #2   <Class CardKey>
	//  412  839:invokestatic    #232 <Method String AppboyLogger.getAppboyLogTag(Class)>
	//  413  842:putstatic       #234 <Field String a>
		b = ((Map) (new HashMap()));
	//  414  845:new             #236 <Class HashMap>
	//  415  848:dup             
	//  416  849:invokespecial   #238 <Method void HashMap()>
	//  417  852:putstatic       #240 <Field Map b>
		b.put("banner_image", ((Object) (CardType.BANNER)));
	//  418  855:getstatic       #240 <Field Map b>
	//  419  858:ldc1            #242 <String "banner_image">
	//  420  860:getstatic       #248 <Field CardType CardType.BANNER>
	//  421  863:invokeinterface #254 <Method Object Map.put(Object, Object)>
	//  422  868:pop             
		b.put("captioned_image", ((Object) (CardType.CAPTIONED_IMAGE)));
	//  423  869:getstatic       #240 <Field Map b>
	//  424  872:ldc2            #256 <String "captioned_image">
	//  425  875:getstatic       #259 <Field CardType CardType.CAPTIONED_IMAGE>
	//  426  878:invokeinterface #254 <Method Object Map.put(Object, Object)>
	//  427  883:pop             
		b.put("text_announcement", ((Object) (CardType.TEXT_ANNOUNCEMENT)));
	//  428  884:getstatic       #240 <Field Map b>
	//  429  887:ldc2            #261 <String "text_announcement">
	//  430  890:getstatic       #264 <Field CardType CardType.TEXT_ANNOUNCEMENT>
	//  431  893:invokeinterface #254 <Method Object Map.put(Object, Object)>
	//  432  898:pop             
		b.put("short_news", ((Object) (CardType.SHORT_NEWS)));
	//  433  899:getstatic       #240 <Field Map b>
	//  434  902:ldc2            #266 <String "short_news">
	//  435  905:getstatic       #269 <Field CardType CardType.SHORT_NEWS>
	//  436  908:invokeinterface #254 <Method Object Map.put(Object, Object)>
	//  437  913:pop             
		b.put("control", ((Object) (CardType.CONTROL)));
	//  438  914:getstatic       #240 <Field Map b>
	//  439  917:ldc2            #271 <String "control">
	//  440  920:getstatic       #274 <Field CardType CardType.CONTROL>
	//  441  923:invokeinterface #254 <Method Object Map.put(Object, Object)>
	//  442  928:pop             
	//* 443  929:return          
	}
}
