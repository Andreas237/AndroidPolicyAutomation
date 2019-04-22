// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.api;

import java.util.Map;

// Referenced classes of package com.google.ads.interactivemedia.v3.api:
//			Ad

public interface AdEvent
{
	public static interface AdEventListener
	{

		public abstract void onAdEvent(AdEvent adevent);
	}

	public static final class AdEventType extends Enum
	{

		public static AdEventType valueOf(String s)
		{
			return (AdEventType)Enum.valueOf(com/google/ads/interactivemedia/v3/api/AdEvent$AdEventType, s);
		//    0    0:ldc1            #2   <Class AdEvent$AdEventType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #111 <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class AdEvent$AdEventType>
		//    4    9:areturn         
		}

		public static AdEventType[] values()
		{
			return (AdEventType[])((AdEventType []) (a)).clone();
		//    0    0:getstatic       #103 <Field AdEvent$AdEventType[] a>
		//    1    3:invokevirtual   #118 <Method Object _5B_Lcom.google.ads.interactivemedia.v3.api.AdEvent$AdEventType_3B_.clone()>
		//    2    6:checkcast       #114 <Class AdEvent$AdEventType[]>
		//    3    9:areturn         
		}

		public static final AdEventType AD_BREAK_ENDED;
		public static final AdEventType AD_BREAK_READY;
		public static final AdEventType AD_BREAK_STARTED;
		public static final AdEventType AD_PROGRESS;
		public static final AdEventType ALL_ADS_COMPLETED;
		public static final AdEventType CLICKED;
		public static final AdEventType COMPLETED;
		public static final AdEventType CONTENT_PAUSE_REQUESTED;
		public static final AdEventType CONTENT_RESUME_REQUESTED;
		public static final AdEventType CUEPOINTS_CHANGED;
		public static final AdEventType FIRST_QUARTILE;
		public static final AdEventType ICON_TAPPED;
		public static final AdEventType LOADED;
		public static final AdEventType LOG;
		public static final AdEventType MIDPOINT;
		public static final AdEventType PAUSED;
		public static final AdEventType RESUMED;
		public static final AdEventType SKIPPED;
		public static final AdEventType STARTED;
		public static final AdEventType TAPPED;
		public static final AdEventType THIRD_QUARTILE;
		private static final AdEventType a[];

		static 
		{
			ALL_ADS_COMPLETED = new AdEventType("ALL_ADS_COMPLETED", 0);
		//    0    0:new             #2   <Class AdEvent$AdEventType>
		//    1    3:dup             
		//    2    4:ldc1            #35  <String "ALL_ADS_COMPLETED">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #39  <Method void AdEvent$AdEventType(String, int)>
		//    5   10:putstatic       #41  <Field AdEvent$AdEventType ALL_ADS_COMPLETED>
			CLICKED = new AdEventType("CLICKED", 1);
		//    6   13:new             #2   <Class AdEvent$AdEventType>
		//    7   16:dup             
		//    8   17:ldc1            #42  <String "CLICKED">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #39  <Method void AdEvent$AdEventType(String, int)>
		//   11   23:putstatic       #44  <Field AdEvent$AdEventType CLICKED>
			COMPLETED = new AdEventType("COMPLETED", 2);
		//   12   26:new             #2   <Class AdEvent$AdEventType>
		//   13   29:dup             
		//   14   30:ldc1            #45  <String "COMPLETED">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #39  <Method void AdEvent$AdEventType(String, int)>
		//   17   36:putstatic       #47  <Field AdEvent$AdEventType COMPLETED>
			CUEPOINTS_CHANGED = new AdEventType("CUEPOINTS_CHANGED", 3);
		//   18   39:new             #2   <Class AdEvent$AdEventType>
		//   19   42:dup             
		//   20   43:ldc1            #48  <String "CUEPOINTS_CHANGED">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #39  <Method void AdEvent$AdEventType(String, int)>
		//   23   49:putstatic       #50  <Field AdEvent$AdEventType CUEPOINTS_CHANGED>
			CONTENT_PAUSE_REQUESTED = new AdEventType("CONTENT_PAUSE_REQUESTED", 4);
		//   24   52:new             #2   <Class AdEvent$AdEventType>
		//   25   55:dup             
		//   26   56:ldc1            #51  <String "CONTENT_PAUSE_REQUESTED">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #39  <Method void AdEvent$AdEventType(String, int)>
		//   29   62:putstatic       #53  <Field AdEvent$AdEventType CONTENT_PAUSE_REQUESTED>
			CONTENT_RESUME_REQUESTED = new AdEventType("CONTENT_RESUME_REQUESTED", 5);
		//   30   65:new             #2   <Class AdEvent$AdEventType>
		//   31   68:dup             
		//   32   69:ldc1            #54  <String "CONTENT_RESUME_REQUESTED">
		//   33   71:iconst_5        
		//   34   72:invokespecial   #39  <Method void AdEvent$AdEventType(String, int)>
		//   35   75:putstatic       #56  <Field AdEvent$AdEventType CONTENT_RESUME_REQUESTED>
			FIRST_QUARTILE = new AdEventType("FIRST_QUARTILE", 6);
		//   36   78:new             #2   <Class AdEvent$AdEventType>
		//   37   81:dup             
		//   38   82:ldc1            #57  <String "FIRST_QUARTILE">
		//   39   84:bipush          6
		//   40   86:invokespecial   #39  <Method void AdEvent$AdEventType(String, int)>
		//   41   89:putstatic       #59  <Field AdEvent$AdEventType FIRST_QUARTILE>
			LOG = new AdEventType("LOG", 7);
		//   42   92:new             #2   <Class AdEvent$AdEventType>
		//   43   95:dup             
		//   44   96:ldc1            #60  <String "LOG">
		//   45   98:bipush          7
		//   46  100:invokespecial   #39  <Method void AdEvent$AdEventType(String, int)>
		//   47  103:putstatic       #62  <Field AdEvent$AdEventType LOG>
			AD_BREAK_READY = new AdEventType("AD_BREAK_READY", 8);
		//   48  106:new             #2   <Class AdEvent$AdEventType>
		//   49  109:dup             
		//   50  110:ldc1            #63  <String "AD_BREAK_READY">
		//   51  112:bipush          8
		//   52  114:invokespecial   #39  <Method void AdEvent$AdEventType(String, int)>
		//   53  117:putstatic       #65  <Field AdEvent$AdEventType AD_BREAK_READY>
			MIDPOINT = new AdEventType("MIDPOINT", 9);
		//   54  120:new             #2   <Class AdEvent$AdEventType>
		//   55  123:dup             
		//   56  124:ldc1            #66  <String "MIDPOINT">
		//   57  126:bipush          9
		//   58  128:invokespecial   #39  <Method void AdEvent$AdEventType(String, int)>
		//   59  131:putstatic       #68  <Field AdEvent$AdEventType MIDPOINT>
			PAUSED = new AdEventType("PAUSED", 10);
		//   60  134:new             #2   <Class AdEvent$AdEventType>
		//   61  137:dup             
		//   62  138:ldc1            #69  <String "PAUSED">
		//   63  140:bipush          10
		//   64  142:invokespecial   #39  <Method void AdEvent$AdEventType(String, int)>
		//   65  145:putstatic       #71  <Field AdEvent$AdEventType PAUSED>
			RESUMED = new AdEventType("RESUMED", 11);
		//   66  148:new             #2   <Class AdEvent$AdEventType>
		//   67  151:dup             
		//   68  152:ldc1            #72  <String "RESUMED">
		//   69  154:bipush          11
		//   70  156:invokespecial   #39  <Method void AdEvent$AdEventType(String, int)>
		//   71  159:putstatic       #74  <Field AdEvent$AdEventType RESUMED>
			SKIPPED = new AdEventType("SKIPPED", 12);
		//   72  162:new             #2   <Class AdEvent$AdEventType>
		//   73  165:dup             
		//   74  166:ldc1            #75  <String "SKIPPED">
		//   75  168:bipush          12
		//   76  170:invokespecial   #39  <Method void AdEvent$AdEventType(String, int)>
		//   77  173:putstatic       #77  <Field AdEvent$AdEventType SKIPPED>
			STARTED = new AdEventType("STARTED", 13);
		//   78  176:new             #2   <Class AdEvent$AdEventType>
		//   79  179:dup             
		//   80  180:ldc1            #78  <String "STARTED">
		//   81  182:bipush          13
		//   82  184:invokespecial   #39  <Method void AdEvent$AdEventType(String, int)>
		//   83  187:putstatic       #80  <Field AdEvent$AdEventType STARTED>
			TAPPED = new AdEventType("TAPPED", 14);
		//   84  190:new             #2   <Class AdEvent$AdEventType>
		//   85  193:dup             
		//   86  194:ldc1            #81  <String "TAPPED">
		//   87  196:bipush          14
		//   88  198:invokespecial   #39  <Method void AdEvent$AdEventType(String, int)>
		//   89  201:putstatic       #83  <Field AdEvent$AdEventType TAPPED>
			ICON_TAPPED = new AdEventType("ICON_TAPPED", 15);
		//   90  204:new             #2   <Class AdEvent$AdEventType>
		//   91  207:dup             
		//   92  208:ldc1            #84  <String "ICON_TAPPED">
		//   93  210:bipush          15
		//   94  212:invokespecial   #39  <Method void AdEvent$AdEventType(String, int)>
		//   95  215:putstatic       #86  <Field AdEvent$AdEventType ICON_TAPPED>
			THIRD_QUARTILE = new AdEventType("THIRD_QUARTILE", 16);
		//   96  218:new             #2   <Class AdEvent$AdEventType>
		//   97  221:dup             
		//   98  222:ldc1            #87  <String "THIRD_QUARTILE">
		//   99  224:bipush          16
		//  100  226:invokespecial   #39  <Method void AdEvent$AdEventType(String, int)>
		//  101  229:putstatic       #89  <Field AdEvent$AdEventType THIRD_QUARTILE>
			LOADED = new AdEventType("LOADED", 17);
		//  102  232:new             #2   <Class AdEvent$AdEventType>
		//  103  235:dup             
		//  104  236:ldc1            #90  <String "LOADED">
		//  105  238:bipush          17
		//  106  240:invokespecial   #39  <Method void AdEvent$AdEventType(String, int)>
		//  107  243:putstatic       #92  <Field AdEvent$AdEventType LOADED>
			AD_PROGRESS = new AdEventType("AD_PROGRESS", 18);
		//  108  246:new             #2   <Class AdEvent$AdEventType>
		//  109  249:dup             
		//  110  250:ldc1            #93  <String "AD_PROGRESS">
		//  111  252:bipush          18
		//  112  254:invokespecial   #39  <Method void AdEvent$AdEventType(String, int)>
		//  113  257:putstatic       #95  <Field AdEvent$AdEventType AD_PROGRESS>
			AD_BREAK_STARTED = new AdEventType("AD_BREAK_STARTED", 19);
		//  114  260:new             #2   <Class AdEvent$AdEventType>
		//  115  263:dup             
		//  116  264:ldc1            #96  <String "AD_BREAK_STARTED">
		//  117  266:bipush          19
		//  118  268:invokespecial   #39  <Method void AdEvent$AdEventType(String, int)>
		//  119  271:putstatic       #98  <Field AdEvent$AdEventType AD_BREAK_STARTED>
			AD_BREAK_ENDED = new AdEventType("AD_BREAK_ENDED", 20);
		//  120  274:new             #2   <Class AdEvent$AdEventType>
		//  121  277:dup             
		//  122  278:ldc1            #99  <String "AD_BREAK_ENDED">
		//  123  280:bipush          20
		//  124  282:invokespecial   #39  <Method void AdEvent$AdEventType(String, int)>
		//  125  285:putstatic       #101 <Field AdEvent$AdEventType AD_BREAK_ENDED>
			a = (new AdEventType[] {
				ALL_ADS_COMPLETED, CLICKED, COMPLETED, CUEPOINTS_CHANGED, CONTENT_PAUSE_REQUESTED, CONTENT_RESUME_REQUESTED, FIRST_QUARTILE, LOG, AD_BREAK_READY, MIDPOINT, 
				PAUSED, RESUMED, SKIPPED, STARTED, TAPPED, ICON_TAPPED, THIRD_QUARTILE, LOADED, AD_PROGRESS, AD_BREAK_STARTED, 
				AD_BREAK_ENDED
			});
		//  126  288:bipush          21
		//  127  290:anewarray       AdEventType[]
		//  128  293:dup             
		//  129  294:iconst_0        
		//  130  295:getstatic       #41  <Field AdEvent$AdEventType ALL_ADS_COMPLETED>
		//  131  298:aastore         
		//  132  299:dup             
		//  133  300:iconst_1        
		//  134  301:getstatic       #44  <Field AdEvent$AdEventType CLICKED>
		//  135  304:aastore         
		//  136  305:dup             
		//  137  306:iconst_2        
		//  138  307:getstatic       #47  <Field AdEvent$AdEventType COMPLETED>
		//  139  310:aastore         
		//  140  311:dup             
		//  141  312:iconst_3        
		//  142  313:getstatic       #50  <Field AdEvent$AdEventType CUEPOINTS_CHANGED>
		//  143  316:aastore         
		//  144  317:dup             
		//  145  318:iconst_4        
		//  146  319:getstatic       #53  <Field AdEvent$AdEventType CONTENT_PAUSE_REQUESTED>
		//  147  322:aastore         
		//  148  323:dup             
		//  149  324:iconst_5        
		//  150  325:getstatic       #56  <Field AdEvent$AdEventType CONTENT_RESUME_REQUESTED>
		//  151  328:aastore         
		//  152  329:dup             
		//  153  330:bipush          6
		//  154  332:getstatic       #59  <Field AdEvent$AdEventType FIRST_QUARTILE>
		//  155  335:aastore         
		//  156  336:dup             
		//  157  337:bipush          7
		//  158  339:getstatic       #62  <Field AdEvent$AdEventType LOG>
		//  159  342:aastore         
		//  160  343:dup             
		//  161  344:bipush          8
		//  162  346:getstatic       #65  <Field AdEvent$AdEventType AD_BREAK_READY>
		//  163  349:aastore         
		//  164  350:dup             
		//  165  351:bipush          9
		//  166  353:getstatic       #68  <Field AdEvent$AdEventType MIDPOINT>
		//  167  356:aastore         
		//  168  357:dup             
		//  169  358:bipush          10
		//  170  360:getstatic       #71  <Field AdEvent$AdEventType PAUSED>
		//  171  363:aastore         
		//  172  364:dup             
		//  173  365:bipush          11
		//  174  367:getstatic       #74  <Field AdEvent$AdEventType RESUMED>
		//  175  370:aastore         
		//  176  371:dup             
		//  177  372:bipush          12
		//  178  374:getstatic       #77  <Field AdEvent$AdEventType SKIPPED>
		//  179  377:aastore         
		//  180  378:dup             
		//  181  379:bipush          13
		//  182  381:getstatic       #80  <Field AdEvent$AdEventType STARTED>
		//  183  384:aastore         
		//  184  385:dup             
		//  185  386:bipush          14
		//  186  388:getstatic       #83  <Field AdEvent$AdEventType TAPPED>
		//  187  391:aastore         
		//  188  392:dup             
		//  189  393:bipush          15
		//  190  395:getstatic       #86  <Field AdEvent$AdEventType ICON_TAPPED>
		//  191  398:aastore         
		//  192  399:dup             
		//  193  400:bipush          16
		//  194  402:getstatic       #89  <Field AdEvent$AdEventType THIRD_QUARTILE>
		//  195  405:aastore         
		//  196  406:dup             
		//  197  407:bipush          17
		//  198  409:getstatic       #92  <Field AdEvent$AdEventType LOADED>
		//  199  412:aastore         
		//  200  413:dup             
		//  201  414:bipush          18
		//  202  416:getstatic       #95  <Field AdEvent$AdEventType AD_PROGRESS>
		//  203  419:aastore         
		//  204  420:dup             
		//  205  421:bipush          19
		//  206  423:getstatic       #98  <Field AdEvent$AdEventType AD_BREAK_STARTED>
		//  207  426:aastore         
		//  208  427:dup             
		//  209  428:bipush          20
		//  210  430:getstatic       #101 <Field AdEvent$AdEventType AD_BREAK_ENDED>
		//  211  433:aastore         
		//  212  434:putstatic       #103 <Field AdEvent$AdEventType[] a>
		//* 213  437:return          
		}

		private AdEventType(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #105 <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public abstract Ad getAd();

	public abstract Map getAdData();

	public abstract AdEventType getType();
}
