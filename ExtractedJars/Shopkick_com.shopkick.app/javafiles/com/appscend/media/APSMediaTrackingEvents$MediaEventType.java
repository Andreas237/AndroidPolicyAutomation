// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media;


// Referenced classes of package com.appscend.media:
//			APSMediaTrackingEvents

public static final class APSMediaTrackingEvents$MediaEventType extends Enum
{

	public static APSMediaTrackingEvents$MediaEventType valueOf(String s)
	{
		return (APSMediaTrackingEvents$MediaEventType)Enum.valueOf(com/appscend/media/APSMediaTrackingEvents$MediaEventType, s);
	//    0    0:ldc1            #2   <Class APSMediaTrackingEvents$MediaEventType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #159 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class APSMediaTrackingEvents$MediaEventType>
	//    4    9:areturn         
	}

	public static APSMediaTrackingEvents$MediaEventType[] values()
	{
		return (APSMediaTrackingEvents$MediaEventType[])((APSMediaTrackingEvents$MediaEventType []) ($VALUES)).clone();
	//    0    0:getstatic       #151 <Field APSMediaTrackingEvents$MediaEventType[] $VALUES>
	//    1    3:invokevirtual   #166 <Method Object _5B_Lcom.appscend.media.APSMediaTrackingEvents$MediaEventType_3B_.clone()>
	//    2    6:checkcast       #162 <Class APSMediaTrackingEvents$MediaEventType[]>
	//    3    9:areturn         
	}

	private static final APSMediaTrackingEvents$MediaEventType $VALUES[];
	public static final APSMediaTrackingEvents$MediaEventType BUFFER_END;
	public static final APSMediaTrackingEvents$MediaEventType BUFFER_START;
	public static final APSMediaTrackingEvents$MediaEventType CLICK;
	public static final APSMediaTrackingEvents$MediaEventType CLOCK_TICK;
	public static final APSMediaTrackingEvents$MediaEventType CLOSE;
	public static final APSMediaTrackingEvents$MediaEventType CLOSE_LINEAR;
	public static final APSMediaTrackingEvents$MediaEventType COMPLETE;
	public static final APSMediaTrackingEvents$MediaEventType CREATIVE_VIEW;
	public static final APSMediaTrackingEvents$MediaEventType ERROR;
	public static final APSMediaTrackingEvents$MediaEventType EXIT_FULLSCREEN;
	public static final APSMediaTrackingEvents$MediaEventType EXIT_FULLSCREEN_OVERLAY_ACTIVITY;
	public static final APSMediaTrackingEvents$MediaEventType FINISH;
	public static final APSMediaTrackingEvents$MediaEventType FORWARD;
	public static final APSMediaTrackingEvents$MediaEventType FULLSCREEN;
	public static final APSMediaTrackingEvents$MediaEventType IMPRESSION;
	public static final APSMediaTrackingEvents$MediaEventType LAUNCH;
	public static final APSMediaTrackingEvents$MediaEventType LICENSE_INVALID;
	public static final APSMediaTrackingEvents$MediaEventType MUTE;
	public static final APSMediaTrackingEvents$MediaEventType PAUSE;
	public static final APSMediaTrackingEvents$MediaEventType PLAYBACK_REQUESTED;
	public static final APSMediaTrackingEvents$MediaEventType PLAYBACK_STATE_CHANGED;
	public static final APSMediaTrackingEvents$MediaEventType PLAYLIST_FINISHED;
	public static final APSMediaTrackingEvents$MediaEventType POSITION;
	public static final APSMediaTrackingEvents$MediaEventType RESUME;
	public static final APSMediaTrackingEvents$MediaEventType REWIND;
	public static final APSMediaTrackingEvents$MediaEventType SKIP;
	public static final APSMediaTrackingEvents$MediaEventType START;
	public static final APSMediaTrackingEvents$MediaEventType START_PROCESSING_NEW_UNIT;
	public static final APSMediaTrackingEvents$MediaEventType UNIT_FINISHED;
	public static final APSMediaTrackingEvents$MediaEventType UNIT_FINISHED_URL;
	public static final APSMediaTrackingEvents$MediaEventType UNMUTE;
	public static final APSMediaTrackingEvents$MediaEventType USER_PAUSE;
	public static final APSMediaTrackingEvents$MediaEventType USER_UNPAUSE;

	static 
	{
		FULLSCREEN = new APSMediaTrackingEvents$MediaEventType("FULLSCREEN", 0);
	//    0    0:new             #2   <Class APSMediaTrackingEvents$MediaEventType>
	//    1    3:dup             
	//    2    4:ldc1            #47  <String "FULLSCREEN">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #51  <Method void APSMediaTrackingEvents$MediaEventType(String, int)>
	//    5   10:putstatic       #53  <Field APSMediaTrackingEvents$MediaEventType FULLSCREEN>
		EXIT_FULLSCREEN = new APSMediaTrackingEvents$MediaEventType("EXIT_FULLSCREEN", 1);
	//    6   13:new             #2   <Class APSMediaTrackingEvents$MediaEventType>
	//    7   16:dup             
	//    8   17:ldc1            #54  <String "EXIT_FULLSCREEN">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #51  <Method void APSMediaTrackingEvents$MediaEventType(String, int)>
	//   11   23:putstatic       #56  <Field APSMediaTrackingEvents$MediaEventType EXIT_FULLSCREEN>
		EXIT_FULLSCREEN_OVERLAY_ACTIVITY = new APSMediaTrackingEvents$MediaEventType("EXIT_FULLSCREEN_OVERLAY_ACTIVITY", 2);
	//   12   26:new             #2   <Class APSMediaTrackingEvents$MediaEventType>
	//   13   29:dup             
	//   14   30:ldc1            #57  <String "EXIT_FULLSCREEN_OVERLAY_ACTIVITY">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #51  <Method void APSMediaTrackingEvents$MediaEventType(String, int)>
	//   17   36:putstatic       #59  <Field APSMediaTrackingEvents$MediaEventType EXIT_FULLSCREEN_OVERLAY_ACTIVITY>
		LAUNCH = new APSMediaTrackingEvents$MediaEventType("LAUNCH", 3);
	//   18   39:new             #2   <Class APSMediaTrackingEvents$MediaEventType>
	//   19   42:dup             
	//   20   43:ldc1            #60  <String "LAUNCH">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #51  <Method void APSMediaTrackingEvents$MediaEventType(String, int)>
	//   23   49:putstatic       #62  <Field APSMediaTrackingEvents$MediaEventType LAUNCH>
		FINISH = new APSMediaTrackingEvents$MediaEventType("FINISH", 4);
	//   24   52:new             #2   <Class APSMediaTrackingEvents$MediaEventType>
	//   25   55:dup             
	//   26   56:ldc1            #63  <String "FINISH">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #51  <Method void APSMediaTrackingEvents$MediaEventType(String, int)>
	//   29   62:putstatic       #65  <Field APSMediaTrackingEvents$MediaEventType FINISH>
		RESUME = new APSMediaTrackingEvents$MediaEventType("RESUME", 5);
	//   30   65:new             #2   <Class APSMediaTrackingEvents$MediaEventType>
	//   31   68:dup             
	//   32   69:ldc1            #66  <String "RESUME">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #51  <Method void APSMediaTrackingEvents$MediaEventType(String, int)>
	//   35   75:putstatic       #68  <Field APSMediaTrackingEvents$MediaEventType RESUME>
		PAUSE = new APSMediaTrackingEvents$MediaEventType("PAUSE", 6);
	//   36   78:new             #2   <Class APSMediaTrackingEvents$MediaEventType>
	//   37   81:dup             
	//   38   82:ldc1            #69  <String "PAUSE">
	//   39   84:bipush          6
	//   40   86:invokespecial   #51  <Method void APSMediaTrackingEvents$MediaEventType(String, int)>
	//   41   89:putstatic       #71  <Field APSMediaTrackingEvents$MediaEventType PAUSE>
		REWIND = new APSMediaTrackingEvents$MediaEventType("REWIND", 7);
	//   42   92:new             #2   <Class APSMediaTrackingEvents$MediaEventType>
	//   43   95:dup             
	//   44   96:ldc1            #72  <String "REWIND">
	//   45   98:bipush          7
	//   46  100:invokespecial   #51  <Method void APSMediaTrackingEvents$MediaEventType(String, int)>
	//   47  103:putstatic       #74  <Field APSMediaTrackingEvents$MediaEventType REWIND>
		FORWARD = new APSMediaTrackingEvents$MediaEventType("FORWARD", 8);
	//   48  106:new             #2   <Class APSMediaTrackingEvents$MediaEventType>
	//   49  109:dup             
	//   50  110:ldc1            #75  <String "FORWARD">
	//   51  112:bipush          8
	//   52  114:invokespecial   #51  <Method void APSMediaTrackingEvents$MediaEventType(String, int)>
	//   53  117:putstatic       #77  <Field APSMediaTrackingEvents$MediaEventType FORWARD>
		SKIP = new APSMediaTrackingEvents$MediaEventType("SKIP", 9);
	//   54  120:new             #2   <Class APSMediaTrackingEvents$MediaEventType>
	//   55  123:dup             
	//   56  124:ldc1            #78  <String "SKIP">
	//   57  126:bipush          9
	//   58  128:invokespecial   #51  <Method void APSMediaTrackingEvents$MediaEventType(String, int)>
	//   59  131:putstatic       #80  <Field APSMediaTrackingEvents$MediaEventType SKIP>
		IMPRESSION = new APSMediaTrackingEvents$MediaEventType("IMPRESSION", 10);
	//   60  134:new             #2   <Class APSMediaTrackingEvents$MediaEventType>
	//   61  137:dup             
	//   62  138:ldc1            #81  <String "IMPRESSION">
	//   63  140:bipush          10
	//   64  142:invokespecial   #51  <Method void APSMediaTrackingEvents$MediaEventType(String, int)>
	//   65  145:putstatic       #83  <Field APSMediaTrackingEvents$MediaEventType IMPRESSION>
		CREATIVE_VIEW = new APSMediaTrackingEvents$MediaEventType("CREATIVE_VIEW", 11);
	//   66  148:new             #2   <Class APSMediaTrackingEvents$MediaEventType>
	//   67  151:dup             
	//   68  152:ldc1            #84  <String "CREATIVE_VIEW">
	//   69  154:bipush          11
	//   70  156:invokespecial   #51  <Method void APSMediaTrackingEvents$MediaEventType(String, int)>
	//   71  159:putstatic       #86  <Field APSMediaTrackingEvents$MediaEventType CREATIVE_VIEW>
		START = new APSMediaTrackingEvents$MediaEventType("START", 12);
	//   72  162:new             #2   <Class APSMediaTrackingEvents$MediaEventType>
	//   73  165:dup             
	//   74  166:ldc1            #87  <String "START">
	//   75  168:bipush          12
	//   76  170:invokespecial   #51  <Method void APSMediaTrackingEvents$MediaEventType(String, int)>
	//   77  173:putstatic       #89  <Field APSMediaTrackingEvents$MediaEventType START>
		COMPLETE = new APSMediaTrackingEvents$MediaEventType("COMPLETE", 13);
	//   78  176:new             #2   <Class APSMediaTrackingEvents$MediaEventType>
	//   79  179:dup             
	//   80  180:ldc1            #90  <String "COMPLETE">
	//   81  182:bipush          13
	//   82  184:invokespecial   #51  <Method void APSMediaTrackingEvents$MediaEventType(String, int)>
	//   83  187:putstatic       #92  <Field APSMediaTrackingEvents$MediaEventType COMPLETE>
		CLOSE = new APSMediaTrackingEvents$MediaEventType("CLOSE", 14);
	//   84  190:new             #2   <Class APSMediaTrackingEvents$MediaEventType>
	//   85  193:dup             
	//   86  194:ldc1            #93  <String "CLOSE">
	//   87  196:bipush          14
	//   88  198:invokespecial   #51  <Method void APSMediaTrackingEvents$MediaEventType(String, int)>
	//   89  201:putstatic       #95  <Field APSMediaTrackingEvents$MediaEventType CLOSE>
		CLOSE_LINEAR = new APSMediaTrackingEvents$MediaEventType("CLOSE_LINEAR", 15);
	//   90  204:new             #2   <Class APSMediaTrackingEvents$MediaEventType>
	//   91  207:dup             
	//   92  208:ldc1            #96  <String "CLOSE_LINEAR">
	//   93  210:bipush          15
	//   94  212:invokespecial   #51  <Method void APSMediaTrackingEvents$MediaEventType(String, int)>
	//   95  215:putstatic       #98  <Field APSMediaTrackingEvents$MediaEventType CLOSE_LINEAR>
		ERROR = new APSMediaTrackingEvents$MediaEventType("ERROR", 16);
	//   96  218:new             #2   <Class APSMediaTrackingEvents$MediaEventType>
	//   97  221:dup             
	//   98  222:ldc1            #99  <String "ERROR">
	//   99  224:bipush          16
	//  100  226:invokespecial   #51  <Method void APSMediaTrackingEvents$MediaEventType(String, int)>
	//  101  229:putstatic       #101 <Field APSMediaTrackingEvents$MediaEventType ERROR>
		MUTE = new APSMediaTrackingEvents$MediaEventType("MUTE", 17);
	//  102  232:new             #2   <Class APSMediaTrackingEvents$MediaEventType>
	//  103  235:dup             
	//  104  236:ldc1            #102 <String "MUTE">
	//  105  238:bipush          17
	//  106  240:invokespecial   #51  <Method void APSMediaTrackingEvents$MediaEventType(String, int)>
	//  107  243:putstatic       #104 <Field APSMediaTrackingEvents$MediaEventType MUTE>
		UNMUTE = new APSMediaTrackingEvents$MediaEventType("UNMUTE", 18);
	//  108  246:new             #2   <Class APSMediaTrackingEvents$MediaEventType>
	//  109  249:dup             
	//  110  250:ldc1            #105 <String "UNMUTE">
	//  111  252:bipush          18
	//  112  254:invokespecial   #51  <Method void APSMediaTrackingEvents$MediaEventType(String, int)>
	//  113  257:putstatic       #107 <Field APSMediaTrackingEvents$MediaEventType UNMUTE>
		CLICK = new APSMediaTrackingEvents$MediaEventType("CLICK", 19);
	//  114  260:new             #2   <Class APSMediaTrackingEvents$MediaEventType>
	//  115  263:dup             
	//  116  264:ldc1            #108 <String "CLICK">
	//  117  266:bipush          19
	//  118  268:invokespecial   #51  <Method void APSMediaTrackingEvents$MediaEventType(String, int)>
	//  119  271:putstatic       #110 <Field APSMediaTrackingEvents$MediaEventType CLICK>
		UNIT_FINISHED = new APSMediaTrackingEvents$MediaEventType("UNIT_FINISHED", 20);
	//  120  274:new             #2   <Class APSMediaTrackingEvents$MediaEventType>
	//  121  277:dup             
	//  122  278:ldc1            #111 <String "UNIT_FINISHED">
	//  123  280:bipush          20
	//  124  282:invokespecial   #51  <Method void APSMediaTrackingEvents$MediaEventType(String, int)>
	//  125  285:putstatic       #113 <Field APSMediaTrackingEvents$MediaEventType UNIT_FINISHED>
		UNIT_FINISHED_URL = new APSMediaTrackingEvents$MediaEventType("UNIT_FINISHED_URL", 21);
	//  126  288:new             #2   <Class APSMediaTrackingEvents$MediaEventType>
	//  127  291:dup             
	//  128  292:ldc1            #114 <String "UNIT_FINISHED_URL">
	//  129  294:bipush          21
	//  130  296:invokespecial   #51  <Method void APSMediaTrackingEvents$MediaEventType(String, int)>
	//  131  299:putstatic       #116 <Field APSMediaTrackingEvents$MediaEventType UNIT_FINISHED_URL>
		LICENSE_INVALID = new APSMediaTrackingEvents$MediaEventType("LICENSE_INVALID", 22);
	//  132  302:new             #2   <Class APSMediaTrackingEvents$MediaEventType>
	//  133  305:dup             
	//  134  306:ldc1            #117 <String "LICENSE_INVALID">
	//  135  308:bipush          22
	//  136  310:invokespecial   #51  <Method void APSMediaTrackingEvents$MediaEventType(String, int)>
	//  137  313:putstatic       #119 <Field APSMediaTrackingEvents$MediaEventType LICENSE_INVALID>
		PLAYLIST_FINISHED = new APSMediaTrackingEvents$MediaEventType("PLAYLIST_FINISHED", 23);
	//  138  316:new             #2   <Class APSMediaTrackingEvents$MediaEventType>
	//  139  319:dup             
	//  140  320:ldc1            #120 <String "PLAYLIST_FINISHED">
	//  141  322:bipush          23
	//  142  324:invokespecial   #51  <Method void APSMediaTrackingEvents$MediaEventType(String, int)>
	//  143  327:putstatic       #122 <Field APSMediaTrackingEvents$MediaEventType PLAYLIST_FINISHED>
		CLOCK_TICK = new APSMediaTrackingEvents$MediaEventType("CLOCK_TICK", 24);
	//  144  330:new             #2   <Class APSMediaTrackingEvents$MediaEventType>
	//  145  333:dup             
	//  146  334:ldc1            #123 <String "CLOCK_TICK">
	//  147  336:bipush          24
	//  148  338:invokespecial   #51  <Method void APSMediaTrackingEvents$MediaEventType(String, int)>
	//  149  341:putstatic       #125 <Field APSMediaTrackingEvents$MediaEventType CLOCK_TICK>
		USER_PAUSE = new APSMediaTrackingEvents$MediaEventType("USER_PAUSE", 25);
	//  150  344:new             #2   <Class APSMediaTrackingEvents$MediaEventType>
	//  151  347:dup             
	//  152  348:ldc1            #126 <String "USER_PAUSE">
	//  153  350:bipush          25
	//  154  352:invokespecial   #51  <Method void APSMediaTrackingEvents$MediaEventType(String, int)>
	//  155  355:putstatic       #128 <Field APSMediaTrackingEvents$MediaEventType USER_PAUSE>
		USER_UNPAUSE = new APSMediaTrackingEvents$MediaEventType("USER_UNPAUSE", 26);
	//  156  358:new             #2   <Class APSMediaTrackingEvents$MediaEventType>
	//  157  361:dup             
	//  158  362:ldc1            #129 <String "USER_UNPAUSE">
	//  159  364:bipush          26
	//  160  366:invokespecial   #51  <Method void APSMediaTrackingEvents$MediaEventType(String, int)>
	//  161  369:putstatic       #131 <Field APSMediaTrackingEvents$MediaEventType USER_UNPAUSE>
		POSITION = new APSMediaTrackingEvents$MediaEventType("POSITION", 27);
	//  162  372:new             #2   <Class APSMediaTrackingEvents$MediaEventType>
	//  163  375:dup             
	//  164  376:ldc1            #132 <String "POSITION">
	//  165  378:bipush          27
	//  166  380:invokespecial   #51  <Method void APSMediaTrackingEvents$MediaEventType(String, int)>
	//  167  383:putstatic       #134 <Field APSMediaTrackingEvents$MediaEventType POSITION>
		PLAYBACK_STATE_CHANGED = new APSMediaTrackingEvents$MediaEventType("PLAYBACK_STATE_CHANGED", 28);
	//  168  386:new             #2   <Class APSMediaTrackingEvents$MediaEventType>
	//  169  389:dup             
	//  170  390:ldc1            #135 <String "PLAYBACK_STATE_CHANGED">
	//  171  392:bipush          28
	//  172  394:invokespecial   #51  <Method void APSMediaTrackingEvents$MediaEventType(String, int)>
	//  173  397:putstatic       #137 <Field APSMediaTrackingEvents$MediaEventType PLAYBACK_STATE_CHANGED>
		BUFFER_START = new APSMediaTrackingEvents$MediaEventType("BUFFER_START", 29);
	//  174  400:new             #2   <Class APSMediaTrackingEvents$MediaEventType>
	//  175  403:dup             
	//  176  404:ldc1            #138 <String "BUFFER_START">
	//  177  406:bipush          29
	//  178  408:invokespecial   #51  <Method void APSMediaTrackingEvents$MediaEventType(String, int)>
	//  179  411:putstatic       #140 <Field APSMediaTrackingEvents$MediaEventType BUFFER_START>
		BUFFER_END = new APSMediaTrackingEvents$MediaEventType("BUFFER_END", 30);
	//  180  414:new             #2   <Class APSMediaTrackingEvents$MediaEventType>
	//  181  417:dup             
	//  182  418:ldc1            #141 <String "BUFFER_END">
	//  183  420:bipush          30
	//  184  422:invokespecial   #51  <Method void APSMediaTrackingEvents$MediaEventType(String, int)>
	//  185  425:putstatic       #143 <Field APSMediaTrackingEvents$MediaEventType BUFFER_END>
		START_PROCESSING_NEW_UNIT = new APSMediaTrackingEvents$MediaEventType("START_PROCESSING_NEW_UNIT", 31);
	//  186  428:new             #2   <Class APSMediaTrackingEvents$MediaEventType>
	//  187  431:dup             
	//  188  432:ldc1            #144 <String "START_PROCESSING_NEW_UNIT">
	//  189  434:bipush          31
	//  190  436:invokespecial   #51  <Method void APSMediaTrackingEvents$MediaEventType(String, int)>
	//  191  439:putstatic       #146 <Field APSMediaTrackingEvents$MediaEventType START_PROCESSING_NEW_UNIT>
		PLAYBACK_REQUESTED = new APSMediaTrackingEvents$MediaEventType("PLAYBACK_REQUESTED", 32);
	//  192  442:new             #2   <Class APSMediaTrackingEvents$MediaEventType>
	//  193  445:dup             
	//  194  446:ldc1            #147 <String "PLAYBACK_REQUESTED">
	//  195  448:bipush          32
	//  196  450:invokespecial   #51  <Method void APSMediaTrackingEvents$MediaEventType(String, int)>
	//  197  453:putstatic       #149 <Field APSMediaTrackingEvents$MediaEventType PLAYBACK_REQUESTED>
		$VALUES = (new APSMediaTrackingEvents$MediaEventType[] {
			FULLSCREEN, EXIT_FULLSCREEN, EXIT_FULLSCREEN_OVERLAY_ACTIVITY, LAUNCH, FINISH, RESUME, PAUSE, REWIND, FORWARD, SKIP, 
			IMPRESSION, CREATIVE_VIEW, START, COMPLETE, CLOSE, CLOSE_LINEAR, ERROR, MUTE, UNMUTE, CLICK, 
			UNIT_FINISHED, UNIT_FINISHED_URL, LICENSE_INVALID, PLAYLIST_FINISHED, CLOCK_TICK, USER_PAUSE, USER_UNPAUSE, POSITION, PLAYBACK_STATE_CHANGED, BUFFER_START, 
			BUFFER_END, START_PROCESSING_NEW_UNIT, PLAYBACK_REQUESTED
		});
	//  198  456:bipush          33
	//  199  458:anewarray       APSMediaTrackingEvents$MediaEventType[]
	//  200  461:dup             
	//  201  462:iconst_0        
	//  202  463:getstatic       #53  <Field APSMediaTrackingEvents$MediaEventType FULLSCREEN>
	//  203  466:aastore         
	//  204  467:dup             
	//  205  468:iconst_1        
	//  206  469:getstatic       #56  <Field APSMediaTrackingEvents$MediaEventType EXIT_FULLSCREEN>
	//  207  472:aastore         
	//  208  473:dup             
	//  209  474:iconst_2        
	//  210  475:getstatic       #59  <Field APSMediaTrackingEvents$MediaEventType EXIT_FULLSCREEN_OVERLAY_ACTIVITY>
	//  211  478:aastore         
	//  212  479:dup             
	//  213  480:iconst_3        
	//  214  481:getstatic       #62  <Field APSMediaTrackingEvents$MediaEventType LAUNCH>
	//  215  484:aastore         
	//  216  485:dup             
	//  217  486:iconst_4        
	//  218  487:getstatic       #65  <Field APSMediaTrackingEvents$MediaEventType FINISH>
	//  219  490:aastore         
	//  220  491:dup             
	//  221  492:iconst_5        
	//  222  493:getstatic       #68  <Field APSMediaTrackingEvents$MediaEventType RESUME>
	//  223  496:aastore         
	//  224  497:dup             
	//  225  498:bipush          6
	//  226  500:getstatic       #71  <Field APSMediaTrackingEvents$MediaEventType PAUSE>
	//  227  503:aastore         
	//  228  504:dup             
	//  229  505:bipush          7
	//  230  507:getstatic       #74  <Field APSMediaTrackingEvents$MediaEventType REWIND>
	//  231  510:aastore         
	//  232  511:dup             
	//  233  512:bipush          8
	//  234  514:getstatic       #77  <Field APSMediaTrackingEvents$MediaEventType FORWARD>
	//  235  517:aastore         
	//  236  518:dup             
	//  237  519:bipush          9
	//  238  521:getstatic       #80  <Field APSMediaTrackingEvents$MediaEventType SKIP>
	//  239  524:aastore         
	//  240  525:dup             
	//  241  526:bipush          10
	//  242  528:getstatic       #83  <Field APSMediaTrackingEvents$MediaEventType IMPRESSION>
	//  243  531:aastore         
	//  244  532:dup             
	//  245  533:bipush          11
	//  246  535:getstatic       #86  <Field APSMediaTrackingEvents$MediaEventType CREATIVE_VIEW>
	//  247  538:aastore         
	//  248  539:dup             
	//  249  540:bipush          12
	//  250  542:getstatic       #89  <Field APSMediaTrackingEvents$MediaEventType START>
	//  251  545:aastore         
	//  252  546:dup             
	//  253  547:bipush          13
	//  254  549:getstatic       #92  <Field APSMediaTrackingEvents$MediaEventType COMPLETE>
	//  255  552:aastore         
	//  256  553:dup             
	//  257  554:bipush          14
	//  258  556:getstatic       #95  <Field APSMediaTrackingEvents$MediaEventType CLOSE>
	//  259  559:aastore         
	//  260  560:dup             
	//  261  561:bipush          15
	//  262  563:getstatic       #98  <Field APSMediaTrackingEvents$MediaEventType CLOSE_LINEAR>
	//  263  566:aastore         
	//  264  567:dup             
	//  265  568:bipush          16
	//  266  570:getstatic       #101 <Field APSMediaTrackingEvents$MediaEventType ERROR>
	//  267  573:aastore         
	//  268  574:dup             
	//  269  575:bipush          17
	//  270  577:getstatic       #104 <Field APSMediaTrackingEvents$MediaEventType MUTE>
	//  271  580:aastore         
	//  272  581:dup             
	//  273  582:bipush          18
	//  274  584:getstatic       #107 <Field APSMediaTrackingEvents$MediaEventType UNMUTE>
	//  275  587:aastore         
	//  276  588:dup             
	//  277  589:bipush          19
	//  278  591:getstatic       #110 <Field APSMediaTrackingEvents$MediaEventType CLICK>
	//  279  594:aastore         
	//  280  595:dup             
	//  281  596:bipush          20
	//  282  598:getstatic       #113 <Field APSMediaTrackingEvents$MediaEventType UNIT_FINISHED>
	//  283  601:aastore         
	//  284  602:dup             
	//  285  603:bipush          21
	//  286  605:getstatic       #116 <Field APSMediaTrackingEvents$MediaEventType UNIT_FINISHED_URL>
	//  287  608:aastore         
	//  288  609:dup             
	//  289  610:bipush          22
	//  290  612:getstatic       #119 <Field APSMediaTrackingEvents$MediaEventType LICENSE_INVALID>
	//  291  615:aastore         
	//  292  616:dup             
	//  293  617:bipush          23
	//  294  619:getstatic       #122 <Field APSMediaTrackingEvents$MediaEventType PLAYLIST_FINISHED>
	//  295  622:aastore         
	//  296  623:dup             
	//  297  624:bipush          24
	//  298  626:getstatic       #125 <Field APSMediaTrackingEvents$MediaEventType CLOCK_TICK>
	//  299  629:aastore         
	//  300  630:dup             
	//  301  631:bipush          25
	//  302  633:getstatic       #128 <Field APSMediaTrackingEvents$MediaEventType USER_PAUSE>
	//  303  636:aastore         
	//  304  637:dup             
	//  305  638:bipush          26
	//  306  640:getstatic       #131 <Field APSMediaTrackingEvents$MediaEventType USER_UNPAUSE>
	//  307  643:aastore         
	//  308  644:dup             
	//  309  645:bipush          27
	//  310  647:getstatic       #134 <Field APSMediaTrackingEvents$MediaEventType POSITION>
	//  311  650:aastore         
	//  312  651:dup             
	//  313  652:bipush          28
	//  314  654:getstatic       #137 <Field APSMediaTrackingEvents$MediaEventType PLAYBACK_STATE_CHANGED>
	//  315  657:aastore         
	//  316  658:dup             
	//  317  659:bipush          29
	//  318  661:getstatic       #140 <Field APSMediaTrackingEvents$MediaEventType BUFFER_START>
	//  319  664:aastore         
	//  320  665:dup             
	//  321  666:bipush          30
	//  322  668:getstatic       #143 <Field APSMediaTrackingEvents$MediaEventType BUFFER_END>
	//  323  671:aastore         
	//  324  672:dup             
	//  325  673:bipush          31
	//  326  675:getstatic       #146 <Field APSMediaTrackingEvents$MediaEventType START_PROCESSING_NEW_UNIT>
	//  327  678:aastore         
	//  328  679:dup             
	//  329  680:bipush          32
	//  330  682:getstatic       #149 <Field APSMediaTrackingEvents$MediaEventType PLAYBACK_REQUESTED>
	//  331  685:aastore         
	//  332  686:putstatic       #151 <Field APSMediaTrackingEvents$MediaEventType[] $VALUES>
	//* 333  689:return          
	}

	private APSMediaTrackingEvents$MediaEventType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #153 <Method void Enum(String, int)>
	//    4    6:return          
	}
}
