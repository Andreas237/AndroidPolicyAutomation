// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl;


// Referenced classes of package com.google.ads.interactivemedia.v3.impl:
//			aa

public static final class aa$c extends Enum
{

	public static aa$c valueOf(String s)
	{
		return (aa$c)Enum.valueOf(com/google/ads/interactivemedia/v3/impl/aa$c, s);
	//    0    0:ldc1            #2   <Class aa$c>
	//    1    2:aload_0         
	//    2    3:invokestatic    #279 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class aa$c>
	//    4    9:areturn         
	}

	public static aa$c[] values()
	{
		return (aa$c[])((aa$c []) (a)).clone();
	//    0    0:getstatic       #271 <Field aa$c[] a>
	//    1    3:invokevirtual   #286 <Method Object _5B_Lcom.google.ads.interactivemedia.v3.impl.aa$c_3B_.clone()>
	//    2    6:checkcast       #282 <Class aa$c[]>
	//    3    9:areturn         
	}

	private static final aa$c a[];
	public static final aa$c adBreakEnded;
	public static final aa$c adBreakReady;
	public static final aa$c adBreakStarted;
	public static final aa$c adMetadata;
	public static final aa$c adProgress;
	public static final aa$c adRemainingTime;
	public static final aa$c adsLoaded;
	public static final aa$c allAdsCompleted;
	public static final aa$c appStateChanged;
	public static final aa$c click;
	public static final aa$c companionView;
	public static final aa$c complete;
	public static final aa$c contentComplete;
	public static final aa$c contentPauseRequested;
	public static final aa$c contentResumeRequested;
	public static final aa$c contentTimeUpdate;
	public static final aa$c csi;
	public static final aa$c cuepointsChanged;
	public static final aa$c destroy;
	public static final aa$c discardAdBreak;
	public static final aa$c displayCompanions;
	public static final aa$c end;
	public static final aa$c error;
	public static final aa$c firstquartile;
	public static final aa$c fullscreen;
	public static final aa$c getViewability;
	public static final aa$c hide;
	public static final aa$c impression;
	public static final aa$c init;
	public static final aa$c initialized;
	public static final aa$c learnMore;
	public static final aa$c load;
	public static final aa$c loadStream;
	public static final aa$c loaded;
	public static final aa$c log;
	public static final aa$c midpoint;
	public static final aa$c mute;
	public static final aa$c pause;
	public static final aa$c play;
	public static final aa$c preSkipButton;
	public static final aa$c reportVastEvent;
	public static final aa$c requestAds;
	public static final aa$c requestNextAdBreak;
	public static final aa$c requestStream;
	public static final aa$c resume;
	public static final aa$c setPlaybackOptions;
	public static final aa$c showVideo;
	public static final aa$c skip;
	public static final aa$c skipButton;
	public static final aa$c skipShown;
	public static final aa$c skippableStateChanged;
	public static final aa$c start;
	public static final aa$c startTracking;
	public static final aa$c stop;
	public static final aa$c stopTracking;
	public static final aa$c streamInitialized;
	public static final aa$c thirdquartile;
	public static final aa$c timedMetadata;
	public static final aa$c timeupdate;
	public static final aa$c unmute;
	public static final aa$c videoClicked;
	public static final aa$c videoIconClicked;
	public static final aa$c viewability;

	static 
	{
		adBreakEnded = new aa$c("adBreakEnded", 0);
	//    0    0:new             #2   <Class aa$c>
	//    1    3:dup             
	//    2    4:ldc1            #77  <String "adBreakEnded">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #81  <Method void aa$c(String, int)>
	//    5   10:putstatic       #83  <Field aa$c adBreakEnded>
		adBreakReady = new aa$c("adBreakReady", 1);
	//    6   13:new             #2   <Class aa$c>
	//    7   16:dup             
	//    8   17:ldc1            #84  <String "adBreakReady">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #81  <Method void aa$c(String, int)>
	//   11   23:putstatic       #86  <Field aa$c adBreakReady>
		adBreakStarted = new aa$c("adBreakStarted", 2);
	//   12   26:new             #2   <Class aa$c>
	//   13   29:dup             
	//   14   30:ldc1            #87  <String "adBreakStarted">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #81  <Method void aa$c(String, int)>
	//   17   36:putstatic       #89  <Field aa$c adBreakStarted>
		adMetadata = new aa$c("adMetadata", 3);
	//   18   39:new             #2   <Class aa$c>
	//   19   42:dup             
	//   20   43:ldc1            #90  <String "adMetadata">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #81  <Method void aa$c(String, int)>
	//   23   49:putstatic       #92  <Field aa$c adMetadata>
		adProgress = new aa$c("adProgress", 4);
	//   24   52:new             #2   <Class aa$c>
	//   25   55:dup             
	//   26   56:ldc1            #93  <String "adProgress">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #81  <Method void aa$c(String, int)>
	//   29   62:putstatic       #95  <Field aa$c adProgress>
		adsLoaded = new aa$c("adsLoaded", 5);
	//   30   65:new             #2   <Class aa$c>
	//   31   68:dup             
	//   32   69:ldc1            #96  <String "adsLoaded">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #81  <Method void aa$c(String, int)>
	//   35   75:putstatic       #98  <Field aa$c adsLoaded>
		allAdsCompleted = new aa$c("allAdsCompleted", 6);
	//   36   78:new             #2   <Class aa$c>
	//   37   81:dup             
	//   38   82:ldc1            #99  <String "allAdsCompleted">
	//   39   84:bipush          6
	//   40   86:invokespecial   #81  <Method void aa$c(String, int)>
	//   41   89:putstatic       #101 <Field aa$c allAdsCompleted>
		appStateChanged = new aa$c("appStateChanged", 7);
	//   42   92:new             #2   <Class aa$c>
	//   43   95:dup             
	//   44   96:ldc1            #102 <String "appStateChanged">
	//   45   98:bipush          7
	//   46  100:invokespecial   #81  <Method void aa$c(String, int)>
	//   47  103:putstatic       #104 <Field aa$c appStateChanged>
		click = new aa$c("click", 8);
	//   48  106:new             #2   <Class aa$c>
	//   49  109:dup             
	//   50  110:ldc1            #105 <String "click">
	//   51  112:bipush          8
	//   52  114:invokespecial   #81  <Method void aa$c(String, int)>
	//   53  117:putstatic       #107 <Field aa$c click>
		complete = new aa$c("complete", 9);
	//   54  120:new             #2   <Class aa$c>
	//   55  123:dup             
	//   56  124:ldc1            #108 <String "complete">
	//   57  126:bipush          9
	//   58  128:invokespecial   #81  <Method void aa$c(String, int)>
	//   59  131:putstatic       #110 <Field aa$c complete>
		companionView = new aa$c("companionView", 10);
	//   60  134:new             #2   <Class aa$c>
	//   61  137:dup             
	//   62  138:ldc1            #111 <String "companionView">
	//   63  140:bipush          10
	//   64  142:invokespecial   #81  <Method void aa$c(String, int)>
	//   65  145:putstatic       #113 <Field aa$c companionView>
		contentComplete = new aa$c("contentComplete", 11);
	//   66  148:new             #2   <Class aa$c>
	//   67  151:dup             
	//   68  152:ldc1            #114 <String "contentComplete">
	//   69  154:bipush          11
	//   70  156:invokespecial   #81  <Method void aa$c(String, int)>
	//   71  159:putstatic       #116 <Field aa$c contentComplete>
		contentPauseRequested = new aa$c("contentPauseRequested", 12);
	//   72  162:new             #2   <Class aa$c>
	//   73  165:dup             
	//   74  166:ldc1            #117 <String "contentPauseRequested">
	//   75  168:bipush          12
	//   76  170:invokespecial   #81  <Method void aa$c(String, int)>
	//   77  173:putstatic       #119 <Field aa$c contentPauseRequested>
		contentResumeRequested = new aa$c("contentResumeRequested", 13);
	//   78  176:new             #2   <Class aa$c>
	//   79  179:dup             
	//   80  180:ldc1            #120 <String "contentResumeRequested">
	//   81  182:bipush          13
	//   82  184:invokespecial   #81  <Method void aa$c(String, int)>
	//   83  187:putstatic       #122 <Field aa$c contentResumeRequested>
		contentTimeUpdate = new aa$c("contentTimeUpdate", 14);
	//   84  190:new             #2   <Class aa$c>
	//   85  193:dup             
	//   86  194:ldc1            #123 <String "contentTimeUpdate">
	//   87  196:bipush          14
	//   88  198:invokespecial   #81  <Method void aa$c(String, int)>
	//   89  201:putstatic       #125 <Field aa$c contentTimeUpdate>
		csi = new aa$c("csi", 15);
	//   90  204:new             #2   <Class aa$c>
	//   91  207:dup             
	//   92  208:ldc1            #126 <String "csi">
	//   93  210:bipush          15
	//   94  212:invokespecial   #81  <Method void aa$c(String, int)>
	//   95  215:putstatic       #128 <Field aa$c csi>
		cuepointsChanged = new aa$c("cuepointsChanged", 16);
	//   96  218:new             #2   <Class aa$c>
	//   97  221:dup             
	//   98  222:ldc1            #129 <String "cuepointsChanged">
	//   99  224:bipush          16
	//  100  226:invokespecial   #81  <Method void aa$c(String, int)>
	//  101  229:putstatic       #131 <Field aa$c cuepointsChanged>
		discardAdBreak = new aa$c("discardAdBreak", 17);
	//  102  232:new             #2   <Class aa$c>
	//  103  235:dup             
	//  104  236:ldc1            #132 <String "discardAdBreak">
	//  105  238:bipush          17
	//  106  240:invokespecial   #81  <Method void aa$c(String, int)>
	//  107  243:putstatic       #134 <Field aa$c discardAdBreak>
		displayCompanions = new aa$c("displayCompanions", 18);
	//  108  246:new             #2   <Class aa$c>
	//  109  249:dup             
	//  110  250:ldc1            #135 <String "displayCompanions">
	//  111  252:bipush          18
	//  112  254:invokespecial   #81  <Method void aa$c(String, int)>
	//  113  257:putstatic       #137 <Field aa$c displayCompanions>
		destroy = new aa$c("destroy", 19);
	//  114  260:new             #2   <Class aa$c>
	//  115  263:dup             
	//  116  264:ldc1            #138 <String "destroy">
	//  117  266:bipush          19
	//  118  268:invokespecial   #81  <Method void aa$c(String, int)>
	//  119  271:putstatic       #140 <Field aa$c destroy>
		end = new aa$c("end", 20);
	//  120  274:new             #2   <Class aa$c>
	//  121  277:dup             
	//  122  278:ldc1            #141 <String "end">
	//  123  280:bipush          20
	//  124  282:invokespecial   #81  <Method void aa$c(String, int)>
	//  125  285:putstatic       #143 <Field aa$c end>
		error = new aa$c("error", 21);
	//  126  288:new             #2   <Class aa$c>
	//  127  291:dup             
	//  128  292:ldc1            #144 <String "error">
	//  129  294:bipush          21
	//  130  296:invokespecial   #81  <Method void aa$c(String, int)>
	//  131  299:putstatic       #146 <Field aa$c error>
		firstquartile = new aa$c("firstquartile", 22);
	//  132  302:new             #2   <Class aa$c>
	//  133  305:dup             
	//  134  306:ldc1            #147 <String "firstquartile">
	//  135  308:bipush          22
	//  136  310:invokespecial   #81  <Method void aa$c(String, int)>
	//  137  313:putstatic       #149 <Field aa$c firstquartile>
		fullscreen = new aa$c("fullscreen", 23);
	//  138  316:new             #2   <Class aa$c>
	//  139  319:dup             
	//  140  320:ldc1            #150 <String "fullscreen">
	//  141  322:bipush          23
	//  142  324:invokespecial   #81  <Method void aa$c(String, int)>
	//  143  327:putstatic       #152 <Field aa$c fullscreen>
		getViewability = new aa$c("getViewability", 24);
	//  144  330:new             #2   <Class aa$c>
	//  145  333:dup             
	//  146  334:ldc1            #153 <String "getViewability">
	//  147  336:bipush          24
	//  148  338:invokespecial   #81  <Method void aa$c(String, int)>
	//  149  341:putstatic       #155 <Field aa$c getViewability>
		hide = new aa$c("hide", 25);
	//  150  344:new             #2   <Class aa$c>
	//  151  347:dup             
	//  152  348:ldc1            #156 <String "hide">
	//  153  350:bipush          25
	//  154  352:invokespecial   #81  <Method void aa$c(String, int)>
	//  155  355:putstatic       #158 <Field aa$c hide>
		impression = new aa$c("impression", 26);
	//  156  358:new             #2   <Class aa$c>
	//  157  361:dup             
	//  158  362:ldc1            #159 <String "impression">
	//  159  364:bipush          26
	//  160  366:invokespecial   #81  <Method void aa$c(String, int)>
	//  161  369:putstatic       #161 <Field aa$c impression>
		init = new aa$c("init", 27);
	//  162  372:new             #2   <Class aa$c>
	//  163  375:dup             
	//  164  376:ldc1            #162 <String "init">
	//  165  378:bipush          27
	//  166  380:invokespecial   #81  <Method void aa$c(String, int)>
	//  167  383:putstatic       #164 <Field aa$c init>
		initialized = new aa$c("initialized", 28);
	//  168  386:new             #2   <Class aa$c>
	//  169  389:dup             
	//  170  390:ldc1            #165 <String "initialized">
	//  171  392:bipush          28
	//  172  394:invokespecial   #81  <Method void aa$c(String, int)>
	//  173  397:putstatic       #167 <Field aa$c initialized>
		load = new aa$c("load", 29);
	//  174  400:new             #2   <Class aa$c>
	//  175  403:dup             
	//  176  404:ldc1            #168 <String "load">
	//  177  406:bipush          29
	//  178  408:invokespecial   #81  <Method void aa$c(String, int)>
	//  179  411:putstatic       #170 <Field aa$c load>
		loaded = new aa$c("loaded", 30);
	//  180  414:new             #2   <Class aa$c>
	//  181  417:dup             
	//  182  418:ldc1            #171 <String "loaded">
	//  183  420:bipush          30
	//  184  422:invokespecial   #81  <Method void aa$c(String, int)>
	//  185  425:putstatic       #173 <Field aa$c loaded>
		loadStream = new aa$c("loadStream", 31);
	//  186  428:new             #2   <Class aa$c>
	//  187  431:dup             
	//  188  432:ldc1            #174 <String "loadStream">
	//  189  434:bipush          31
	//  190  436:invokespecial   #81  <Method void aa$c(String, int)>
	//  191  439:putstatic       #176 <Field aa$c loadStream>
		log = new aa$c("log", 32);
	//  192  442:new             #2   <Class aa$c>
	//  193  445:dup             
	//  194  446:ldc1            #177 <String "log">
	//  195  448:bipush          32
	//  196  450:invokespecial   #81  <Method void aa$c(String, int)>
	//  197  453:putstatic       #179 <Field aa$c log>
		midpoint = new aa$c("midpoint", 33);
	//  198  456:new             #2   <Class aa$c>
	//  199  459:dup             
	//  200  460:ldc1            #180 <String "midpoint">
	//  201  462:bipush          33
	//  202  464:invokespecial   #81  <Method void aa$c(String, int)>
	//  203  467:putstatic       #182 <Field aa$c midpoint>
		mute = new aa$c("mute", 34);
	//  204  470:new             #2   <Class aa$c>
	//  205  473:dup             
	//  206  474:ldc1            #183 <String "mute">
	//  207  476:bipush          34
	//  208  478:invokespecial   #81  <Method void aa$c(String, int)>
	//  209  481:putstatic       #185 <Field aa$c mute>
		pause = new aa$c("pause", 35);
	//  210  484:new             #2   <Class aa$c>
	//  211  487:dup             
	//  212  488:ldc1            #186 <String "pause">
	//  213  490:bipush          35
	//  214  492:invokespecial   #81  <Method void aa$c(String, int)>
	//  215  495:putstatic       #188 <Field aa$c pause>
		play = new aa$c("play", 36);
	//  216  498:new             #2   <Class aa$c>
	//  217  501:dup             
	//  218  502:ldc1            #189 <String "play">
	//  219  504:bipush          36
	//  220  506:invokespecial   #81  <Method void aa$c(String, int)>
	//  221  509:putstatic       #191 <Field aa$c play>
		reportVastEvent = new aa$c("reportVastEvent", 37);
	//  222  512:new             #2   <Class aa$c>
	//  223  515:dup             
	//  224  516:ldc1            #192 <String "reportVastEvent">
	//  225  518:bipush          37
	//  226  520:invokespecial   #81  <Method void aa$c(String, int)>
	//  227  523:putstatic       #194 <Field aa$c reportVastEvent>
		resume = new aa$c("resume", 38);
	//  228  526:new             #2   <Class aa$c>
	//  229  529:dup             
	//  230  530:ldc1            #195 <String "resume">
	//  231  532:bipush          38
	//  232  534:invokespecial   #81  <Method void aa$c(String, int)>
	//  233  537:putstatic       #197 <Field aa$c resume>
		requestAds = new aa$c("requestAds", 39);
	//  234  540:new             #2   <Class aa$c>
	//  235  543:dup             
	//  236  544:ldc1            #198 <String "requestAds">
	//  237  546:bipush          39
	//  238  548:invokespecial   #81  <Method void aa$c(String, int)>
	//  239  551:putstatic       #200 <Field aa$c requestAds>
		requestNextAdBreak = new aa$c("requestNextAdBreak", 40);
	//  240  554:new             #2   <Class aa$c>
	//  241  557:dup             
	//  242  558:ldc1            #201 <String "requestNextAdBreak">
	//  243  560:bipush          40
	//  244  562:invokespecial   #81  <Method void aa$c(String, int)>
	//  245  565:putstatic       #203 <Field aa$c requestNextAdBreak>
		requestStream = new aa$c("requestStream", 41);
	//  246  568:new             #2   <Class aa$c>
	//  247  571:dup             
	//  248  572:ldc1            #204 <String "requestStream">
	//  249  574:bipush          41
	//  250  576:invokespecial   #81  <Method void aa$c(String, int)>
	//  251  579:putstatic       #206 <Field aa$c requestStream>
		setPlaybackOptions = new aa$c("setPlaybackOptions", 42);
	//  252  582:new             #2   <Class aa$c>
	//  253  585:dup             
	//  254  586:ldc1            #207 <String "setPlaybackOptions">
	//  255  588:bipush          42
	//  256  590:invokespecial   #81  <Method void aa$c(String, int)>
	//  257  593:putstatic       #209 <Field aa$c setPlaybackOptions>
		showVideo = new aa$c("showVideo", 43);
	//  258  596:new             #2   <Class aa$c>
	//  259  599:dup             
	//  260  600:ldc1            #210 <String "showVideo">
	//  261  602:bipush          43
	//  262  604:invokespecial   #81  <Method void aa$c(String, int)>
	//  263  607:putstatic       #212 <Field aa$c showVideo>
		skip = new aa$c("skip", 44);
	//  264  610:new             #2   <Class aa$c>
	//  265  613:dup             
	//  266  614:ldc1            #213 <String "skip">
	//  267  616:bipush          44
	//  268  618:invokespecial   #81  <Method void aa$c(String, int)>
	//  269  621:putstatic       #215 <Field aa$c skip>
		skippableStateChanged = new aa$c("skippableStateChanged", 45);
	//  270  624:new             #2   <Class aa$c>
	//  271  627:dup             
	//  272  628:ldc1            #216 <String "skippableStateChanged">
	//  273  630:bipush          45
	//  274  632:invokespecial   #81  <Method void aa$c(String, int)>
	//  275  635:putstatic       #218 <Field aa$c skippableStateChanged>
		skipShown = new aa$c("skipShown", 46);
	//  276  638:new             #2   <Class aa$c>
	//  277  641:dup             
	//  278  642:ldc1            #219 <String "skipShown">
	//  279  644:bipush          46
	//  280  646:invokespecial   #81  <Method void aa$c(String, int)>
	//  281  649:putstatic       #221 <Field aa$c skipShown>
		start = new aa$c("start", 47);
	//  282  652:new             #2   <Class aa$c>
	//  283  655:dup             
	//  284  656:ldc1            #222 <String "start">
	//  285  658:bipush          47
	//  286  660:invokespecial   #81  <Method void aa$c(String, int)>
	//  287  663:putstatic       #224 <Field aa$c start>
		startTracking = new aa$c("startTracking", 48);
	//  288  666:new             #2   <Class aa$c>
	//  289  669:dup             
	//  290  670:ldc1            #225 <String "startTracking">
	//  291  672:bipush          48
	//  292  674:invokespecial   #81  <Method void aa$c(String, int)>
	//  293  677:putstatic       #227 <Field aa$c startTracking>
		stop = new aa$c("stop", 49);
	//  294  680:new             #2   <Class aa$c>
	//  295  683:dup             
	//  296  684:ldc1            #228 <String "stop">
	//  297  686:bipush          49
	//  298  688:invokespecial   #81  <Method void aa$c(String, int)>
	//  299  691:putstatic       #230 <Field aa$c stop>
		stopTracking = new aa$c("stopTracking", 50);
	//  300  694:new             #2   <Class aa$c>
	//  301  697:dup             
	//  302  698:ldc1            #231 <String "stopTracking">
	//  303  700:bipush          50
	//  304  702:invokespecial   #81  <Method void aa$c(String, int)>
	//  305  705:putstatic       #233 <Field aa$c stopTracking>
		streamInitialized = new aa$c("streamInitialized", 51);
	//  306  708:new             #2   <Class aa$c>
	//  307  711:dup             
	//  308  712:ldc1            #234 <String "streamInitialized">
	//  309  714:bipush          51
	//  310  716:invokespecial   #81  <Method void aa$c(String, int)>
	//  311  719:putstatic       #236 <Field aa$c streamInitialized>
		thirdquartile = new aa$c("thirdquartile", 52);
	//  312  722:new             #2   <Class aa$c>
	//  313  725:dup             
	//  314  726:ldc1            #237 <String "thirdquartile">
	//  315  728:bipush          52
	//  316  730:invokespecial   #81  <Method void aa$c(String, int)>
	//  317  733:putstatic       #239 <Field aa$c thirdquartile>
		timedMetadata = new aa$c("timedMetadata", 53);
	//  318  736:new             #2   <Class aa$c>
	//  319  739:dup             
	//  320  740:ldc1            #240 <String "timedMetadata">
	//  321  742:bipush          53
	//  322  744:invokespecial   #81  <Method void aa$c(String, int)>
	//  323  747:putstatic       #242 <Field aa$c timedMetadata>
		timeupdate = new aa$c("timeupdate", 54);
	//  324  750:new             #2   <Class aa$c>
	//  325  753:dup             
	//  326  754:ldc1            #243 <String "timeupdate">
	//  327  756:bipush          54
	//  328  758:invokespecial   #81  <Method void aa$c(String, int)>
	//  329  761:putstatic       #245 <Field aa$c timeupdate>
		unmute = new aa$c("unmute", 55);
	//  330  764:new             #2   <Class aa$c>
	//  331  767:dup             
	//  332  768:ldc1            #246 <String "unmute">
	//  333  770:bipush          55
	//  334  772:invokespecial   #81  <Method void aa$c(String, int)>
	//  335  775:putstatic       #248 <Field aa$c unmute>
		viewability = new aa$c("viewability", 56);
	//  336  778:new             #2   <Class aa$c>
	//  337  781:dup             
	//  338  782:ldc1            #249 <String "viewability">
	//  339  784:bipush          56
	//  340  786:invokespecial   #81  <Method void aa$c(String, int)>
	//  341  789:putstatic       #251 <Field aa$c viewability>
		videoClicked = new aa$c("videoClicked", 57);
	//  342  792:new             #2   <Class aa$c>
	//  343  795:dup             
	//  344  796:ldc1            #252 <String "videoClicked">
	//  345  798:bipush          57
	//  346  800:invokespecial   #81  <Method void aa$c(String, int)>
	//  347  803:putstatic       #254 <Field aa$c videoClicked>
		videoIconClicked = new aa$c("videoIconClicked", 58);
	//  348  806:new             #2   <Class aa$c>
	//  349  809:dup             
	//  350  810:ldc1            #255 <String "videoIconClicked">
	//  351  812:bipush          58
	//  352  814:invokespecial   #81  <Method void aa$c(String, int)>
	//  353  817:putstatic       #257 <Field aa$c videoIconClicked>
		adRemainingTime = new aa$c("adRemainingTime", 59);
	//  354  820:new             #2   <Class aa$c>
	//  355  823:dup             
	//  356  824:ldc2            #258 <String "adRemainingTime">
	//  357  827:bipush          59
	//  358  829:invokespecial   #81  <Method void aa$c(String, int)>
	//  359  832:putstatic       #260 <Field aa$c adRemainingTime>
		learnMore = new aa$c("learnMore", 60);
	//  360  835:new             #2   <Class aa$c>
	//  361  838:dup             
	//  362  839:ldc2            #261 <String "learnMore">
	//  363  842:bipush          60
	//  364  844:invokespecial   #81  <Method void aa$c(String, int)>
	//  365  847:putstatic       #263 <Field aa$c learnMore>
		preSkipButton = new aa$c("preSkipButton", 61);
	//  366  850:new             #2   <Class aa$c>
	//  367  853:dup             
	//  368  854:ldc2            #264 <String "preSkipButton">
	//  369  857:bipush          61
	//  370  859:invokespecial   #81  <Method void aa$c(String, int)>
	//  371  862:putstatic       #266 <Field aa$c preSkipButton>
		skipButton = new aa$c("skipButton", 62);
	//  372  865:new             #2   <Class aa$c>
	//  373  868:dup             
	//  374  869:ldc2            #267 <String "skipButton">
	//  375  872:bipush          62
	//  376  874:invokespecial   #81  <Method void aa$c(String, int)>
	//  377  877:putstatic       #269 <Field aa$c skipButton>
		a = (new aa$c[] {
			adBreakEnded, adBreakReady, adBreakStarted, adMetadata, adProgress, adsLoaded, allAdsCompleted, appStateChanged, click, complete, 
			companionView, contentComplete, contentPauseRequested, contentResumeRequested, contentTimeUpdate, csi, cuepointsChanged, discardAdBreak, displayCompanions, destroy, 
			end, error, firstquartile, fullscreen, getViewability, hide, impression, init, initialized, load, 
			loaded, loadStream, log, midpoint, mute, pause, play, reportVastEvent, resume, requestAds, 
			requestNextAdBreak, requestStream, setPlaybackOptions, showVideo, skip, skippableStateChanged, skipShown, start, startTracking, stop, 
			stopTracking, streamInitialized, thirdquartile, timedMetadata, timeupdate, unmute, viewability, videoClicked, videoIconClicked, adRemainingTime, 
			learnMore, preSkipButton, skipButton
		});
	//  378  880:bipush          63
	//  379  882:anewarray       aa$c[]
	//  380  885:dup             
	//  381  886:iconst_0        
	//  382  887:getstatic       #83  <Field aa$c adBreakEnded>
	//  383  890:aastore         
	//  384  891:dup             
	//  385  892:iconst_1        
	//  386  893:getstatic       #86  <Field aa$c adBreakReady>
	//  387  896:aastore         
	//  388  897:dup             
	//  389  898:iconst_2        
	//  390  899:getstatic       #89  <Field aa$c adBreakStarted>
	//  391  902:aastore         
	//  392  903:dup             
	//  393  904:iconst_3        
	//  394  905:getstatic       #92  <Field aa$c adMetadata>
	//  395  908:aastore         
	//  396  909:dup             
	//  397  910:iconst_4        
	//  398  911:getstatic       #95  <Field aa$c adProgress>
	//  399  914:aastore         
	//  400  915:dup             
	//  401  916:iconst_5        
	//  402  917:getstatic       #98  <Field aa$c adsLoaded>
	//  403  920:aastore         
	//  404  921:dup             
	//  405  922:bipush          6
	//  406  924:getstatic       #101 <Field aa$c allAdsCompleted>
	//  407  927:aastore         
	//  408  928:dup             
	//  409  929:bipush          7
	//  410  931:getstatic       #104 <Field aa$c appStateChanged>
	//  411  934:aastore         
	//  412  935:dup             
	//  413  936:bipush          8
	//  414  938:getstatic       #107 <Field aa$c click>
	//  415  941:aastore         
	//  416  942:dup             
	//  417  943:bipush          9
	//  418  945:getstatic       #110 <Field aa$c complete>
	//  419  948:aastore         
	//  420  949:dup             
	//  421  950:bipush          10
	//  422  952:getstatic       #113 <Field aa$c companionView>
	//  423  955:aastore         
	//  424  956:dup             
	//  425  957:bipush          11
	//  426  959:getstatic       #116 <Field aa$c contentComplete>
	//  427  962:aastore         
	//  428  963:dup             
	//  429  964:bipush          12
	//  430  966:getstatic       #119 <Field aa$c contentPauseRequested>
	//  431  969:aastore         
	//  432  970:dup             
	//  433  971:bipush          13
	//  434  973:getstatic       #122 <Field aa$c contentResumeRequested>
	//  435  976:aastore         
	//  436  977:dup             
	//  437  978:bipush          14
	//  438  980:getstatic       #125 <Field aa$c contentTimeUpdate>
	//  439  983:aastore         
	//  440  984:dup             
	//  441  985:bipush          15
	//  442  987:getstatic       #128 <Field aa$c csi>
	//  443  990:aastore         
	//  444  991:dup             
	//  445  992:bipush          16
	//  446  994:getstatic       #131 <Field aa$c cuepointsChanged>
	//  447  997:aastore         
	//  448  998:dup             
	//  449  999:bipush          17
	//  450 1001:getstatic       #134 <Field aa$c discardAdBreak>
	//  451 1004:aastore         
	//  452 1005:dup             
	//  453 1006:bipush          18
	//  454 1008:getstatic       #137 <Field aa$c displayCompanions>
	//  455 1011:aastore         
	//  456 1012:dup             
	//  457 1013:bipush          19
	//  458 1015:getstatic       #140 <Field aa$c destroy>
	//  459 1018:aastore         
	//  460 1019:dup             
	//  461 1020:bipush          20
	//  462 1022:getstatic       #143 <Field aa$c end>
	//  463 1025:aastore         
	//  464 1026:dup             
	//  465 1027:bipush          21
	//  466 1029:getstatic       #146 <Field aa$c error>
	//  467 1032:aastore         
	//  468 1033:dup             
	//  469 1034:bipush          22
	//  470 1036:getstatic       #149 <Field aa$c firstquartile>
	//  471 1039:aastore         
	//  472 1040:dup             
	//  473 1041:bipush          23
	//  474 1043:getstatic       #152 <Field aa$c fullscreen>
	//  475 1046:aastore         
	//  476 1047:dup             
	//  477 1048:bipush          24
	//  478 1050:getstatic       #155 <Field aa$c getViewability>
	//  479 1053:aastore         
	//  480 1054:dup             
	//  481 1055:bipush          25
	//  482 1057:getstatic       #158 <Field aa$c hide>
	//  483 1060:aastore         
	//  484 1061:dup             
	//  485 1062:bipush          26
	//  486 1064:getstatic       #161 <Field aa$c impression>
	//  487 1067:aastore         
	//  488 1068:dup             
	//  489 1069:bipush          27
	//  490 1071:getstatic       #164 <Field aa$c init>
	//  491 1074:aastore         
	//  492 1075:dup             
	//  493 1076:bipush          28
	//  494 1078:getstatic       #167 <Field aa$c initialized>
	//  495 1081:aastore         
	//  496 1082:dup             
	//  497 1083:bipush          29
	//  498 1085:getstatic       #170 <Field aa$c load>
	//  499 1088:aastore         
	//  500 1089:dup             
	//  501 1090:bipush          30
	//  502 1092:getstatic       #173 <Field aa$c loaded>
	//  503 1095:aastore         
	//  504 1096:dup             
	//  505 1097:bipush          31
	//  506 1099:getstatic       #176 <Field aa$c loadStream>
	//  507 1102:aastore         
	//  508 1103:dup             
	//  509 1104:bipush          32
	//  510 1106:getstatic       #179 <Field aa$c log>
	//  511 1109:aastore         
	//  512 1110:dup             
	//  513 1111:bipush          33
	//  514 1113:getstatic       #182 <Field aa$c midpoint>
	//  515 1116:aastore         
	//  516 1117:dup             
	//  517 1118:bipush          34
	//  518 1120:getstatic       #185 <Field aa$c mute>
	//  519 1123:aastore         
	//  520 1124:dup             
	//  521 1125:bipush          35
	//  522 1127:getstatic       #188 <Field aa$c pause>
	//  523 1130:aastore         
	//  524 1131:dup             
	//  525 1132:bipush          36
	//  526 1134:getstatic       #191 <Field aa$c play>
	//  527 1137:aastore         
	//  528 1138:dup             
	//  529 1139:bipush          37
	//  530 1141:getstatic       #194 <Field aa$c reportVastEvent>
	//  531 1144:aastore         
	//  532 1145:dup             
	//  533 1146:bipush          38
	//  534 1148:getstatic       #197 <Field aa$c resume>
	//  535 1151:aastore         
	//  536 1152:dup             
	//  537 1153:bipush          39
	//  538 1155:getstatic       #200 <Field aa$c requestAds>
	//  539 1158:aastore         
	//  540 1159:dup             
	//  541 1160:bipush          40
	//  542 1162:getstatic       #203 <Field aa$c requestNextAdBreak>
	//  543 1165:aastore         
	//  544 1166:dup             
	//  545 1167:bipush          41
	//  546 1169:getstatic       #206 <Field aa$c requestStream>
	//  547 1172:aastore         
	//  548 1173:dup             
	//  549 1174:bipush          42
	//  550 1176:getstatic       #209 <Field aa$c setPlaybackOptions>
	//  551 1179:aastore         
	//  552 1180:dup             
	//  553 1181:bipush          43
	//  554 1183:getstatic       #212 <Field aa$c showVideo>
	//  555 1186:aastore         
	//  556 1187:dup             
	//  557 1188:bipush          44
	//  558 1190:getstatic       #215 <Field aa$c skip>
	//  559 1193:aastore         
	//  560 1194:dup             
	//  561 1195:bipush          45
	//  562 1197:getstatic       #218 <Field aa$c skippableStateChanged>
	//  563 1200:aastore         
	//  564 1201:dup             
	//  565 1202:bipush          46
	//  566 1204:getstatic       #221 <Field aa$c skipShown>
	//  567 1207:aastore         
	//  568 1208:dup             
	//  569 1209:bipush          47
	//  570 1211:getstatic       #224 <Field aa$c start>
	//  571 1214:aastore         
	//  572 1215:dup             
	//  573 1216:bipush          48
	//  574 1218:getstatic       #227 <Field aa$c startTracking>
	//  575 1221:aastore         
	//  576 1222:dup             
	//  577 1223:bipush          49
	//  578 1225:getstatic       #230 <Field aa$c stop>
	//  579 1228:aastore         
	//  580 1229:dup             
	//  581 1230:bipush          50
	//  582 1232:getstatic       #233 <Field aa$c stopTracking>
	//  583 1235:aastore         
	//  584 1236:dup             
	//  585 1237:bipush          51
	//  586 1239:getstatic       #236 <Field aa$c streamInitialized>
	//  587 1242:aastore         
	//  588 1243:dup             
	//  589 1244:bipush          52
	//  590 1246:getstatic       #239 <Field aa$c thirdquartile>
	//  591 1249:aastore         
	//  592 1250:dup             
	//  593 1251:bipush          53
	//  594 1253:getstatic       #242 <Field aa$c timedMetadata>
	//  595 1256:aastore         
	//  596 1257:dup             
	//  597 1258:bipush          54
	//  598 1260:getstatic       #245 <Field aa$c timeupdate>
	//  599 1263:aastore         
	//  600 1264:dup             
	//  601 1265:bipush          55
	//  602 1267:getstatic       #248 <Field aa$c unmute>
	//  603 1270:aastore         
	//  604 1271:dup             
	//  605 1272:bipush          56
	//  606 1274:getstatic       #251 <Field aa$c viewability>
	//  607 1277:aastore         
	//  608 1278:dup             
	//  609 1279:bipush          57
	//  610 1281:getstatic       #254 <Field aa$c videoClicked>
	//  611 1284:aastore         
	//  612 1285:dup             
	//  613 1286:bipush          58
	//  614 1288:getstatic       #257 <Field aa$c videoIconClicked>
	//  615 1291:aastore         
	//  616 1292:dup             
	//  617 1293:bipush          59
	//  618 1295:getstatic       #260 <Field aa$c adRemainingTime>
	//  619 1298:aastore         
	//  620 1299:dup             
	//  621 1300:bipush          60
	//  622 1302:getstatic       #263 <Field aa$c learnMore>
	//  623 1305:aastore         
	//  624 1306:dup             
	//  625 1307:bipush          61
	//  626 1309:getstatic       #266 <Field aa$c preSkipButton>
	//  627 1312:aastore         
	//  628 1313:dup             
	//  629 1314:bipush          62
	//  630 1316:getstatic       #269 <Field aa$c skipButton>
	//  631 1319:aastore         
	//  632 1320:putstatic       #271 <Field aa$c[] a>
	//* 633 1323:return          
	}

	private aa$c(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #273 <Method void Enum(String, int)>
	//    4    6:return          
	}
}
