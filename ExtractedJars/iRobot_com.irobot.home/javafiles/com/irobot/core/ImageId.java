// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class ImageId extends Enum
{

	private ImageId(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #170 <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static ImageId valueOf(String s)
	{
		return (ImageId)Enum.valueOf(com/irobot/core/ImageId, s);
	//    0    0:ldc1            #2   <Class ImageId>
	//    1    2:aload_0         
	//    2    3:invokestatic    #176 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ImageId>
	//    4    9:areturn         
	}

	public static ImageId[] values()
	{
		return (ImageId[])((ImageId []) ($VALUES)).clone();
	//    0    0:getstatic       #168 <Field ImageId[] $VALUES>
	//    1    3:invokevirtual   #183 <Method Object _5B_Lcom.irobot.core.ImageId_3B_.clone()>
	//    2    6:checkcast       #179 <Class ImageId[]>
	//    3    9:areturn         
	}

	private static final ImageId $VALUES[];
	public static final ImageId LastImageId;
	public static final ImageId MissionMapCanceled;
	public static final ImageId MissionMapDeviceLight;
	public static final ImageId MissionMapDeviceSmartSpeaker;
	public static final ImageId MissionMapDeviceUnknown;
	public static final ImageId MissionMapDirt;
	public static final ImageId MissionMapDock;
	public static final ImageId MissionMapElPasoRobot;
	public static final ImageId MissionMapError;
	public static final ImageId MissionMapOnDock;
	public static final ImageId MissionMapSanMarinoRobot;
	public static final ImageId MissionMapSohoRobot;
	public static final ImageId MissionMapSuccess;
	public static final ImageId PmapIconBackground;
	public static final ImageId PmapIconBath;
	public static final ImageId PmapIconBathLight;
	public static final ImageId PmapIconBed;
	public static final ImageId PmapIconBedLight;
	public static final ImageId PmapIconCustom;
	public static final ImageId PmapIconCustomLight;
	public static final ImageId PmapIconDining;
	public static final ImageId PmapIconDiningLight;
	public static final ImageId PmapIconEntry;
	public static final ImageId PmapIconEntryLight;
	public static final ImageId PmapIconHall;
	public static final ImageId PmapIconHallLight;
	public static final ImageId PmapIconKids;
	public static final ImageId PmapIconKidsLight;
	public static final ImageId PmapIconKitchen;
	public static final ImageId PmapIconKitchenLight;
	public static final ImageId PmapIconLaundry;
	public static final ImageId PmapIconLaundryLight;
	public static final ImageId PmapIconLiving;
	public static final ImageId PmapIconLivingLight;
	public static final ImageId PmapIconOffice;
	public static final ImageId PmapIconOfficeLight;
	public static final ImageId PmapIconStorage;
	public static final ImageId PmapIconStorageLight;

	static 
	{
		PmapIconBackground = new ImageId("PmapIconBackground", 0);
	//    0    0:new             #2   <Class ImageId>
	//    1    3:dup             
	//    2    4:ldc1            #49  <String "PmapIconBackground">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #53  <Method void ImageId(String, int)>
	//    5   10:putstatic       #55  <Field ImageId PmapIconBackground>
		PmapIconBath = new ImageId("PmapIconBath", 1);
	//    6   13:new             #2   <Class ImageId>
	//    7   16:dup             
	//    8   17:ldc1            #56  <String "PmapIconBath">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #53  <Method void ImageId(String, int)>
	//   11   23:putstatic       #58  <Field ImageId PmapIconBath>
		PmapIconBathLight = new ImageId("PmapIconBathLight", 2);
	//   12   26:new             #2   <Class ImageId>
	//   13   29:dup             
	//   14   30:ldc1            #59  <String "PmapIconBathLight">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #53  <Method void ImageId(String, int)>
	//   17   36:putstatic       #61  <Field ImageId PmapIconBathLight>
		PmapIconBed = new ImageId("PmapIconBed", 3);
	//   18   39:new             #2   <Class ImageId>
	//   19   42:dup             
	//   20   43:ldc1            #62  <String "PmapIconBed">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #53  <Method void ImageId(String, int)>
	//   23   49:putstatic       #64  <Field ImageId PmapIconBed>
		PmapIconBedLight = new ImageId("PmapIconBedLight", 4);
	//   24   52:new             #2   <Class ImageId>
	//   25   55:dup             
	//   26   56:ldc1            #65  <String "PmapIconBedLight">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #53  <Method void ImageId(String, int)>
	//   29   62:putstatic       #67  <Field ImageId PmapIconBedLight>
		PmapIconCustom = new ImageId("PmapIconCustom", 5);
	//   30   65:new             #2   <Class ImageId>
	//   31   68:dup             
	//   32   69:ldc1            #68  <String "PmapIconCustom">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #53  <Method void ImageId(String, int)>
	//   35   75:putstatic       #70  <Field ImageId PmapIconCustom>
		PmapIconCustomLight = new ImageId("PmapIconCustomLight", 6);
	//   36   78:new             #2   <Class ImageId>
	//   37   81:dup             
	//   38   82:ldc1            #71  <String "PmapIconCustomLight">
	//   39   84:bipush          6
	//   40   86:invokespecial   #53  <Method void ImageId(String, int)>
	//   41   89:putstatic       #73  <Field ImageId PmapIconCustomLight>
		PmapIconDining = new ImageId("PmapIconDining", 7);
	//   42   92:new             #2   <Class ImageId>
	//   43   95:dup             
	//   44   96:ldc1            #74  <String "PmapIconDining">
	//   45   98:bipush          7
	//   46  100:invokespecial   #53  <Method void ImageId(String, int)>
	//   47  103:putstatic       #76  <Field ImageId PmapIconDining>
		PmapIconDiningLight = new ImageId("PmapIconDiningLight", 8);
	//   48  106:new             #2   <Class ImageId>
	//   49  109:dup             
	//   50  110:ldc1            #77  <String "PmapIconDiningLight">
	//   51  112:bipush          8
	//   52  114:invokespecial   #53  <Method void ImageId(String, int)>
	//   53  117:putstatic       #79  <Field ImageId PmapIconDiningLight>
		PmapIconEntry = new ImageId("PmapIconEntry", 9);
	//   54  120:new             #2   <Class ImageId>
	//   55  123:dup             
	//   56  124:ldc1            #80  <String "PmapIconEntry">
	//   57  126:bipush          9
	//   58  128:invokespecial   #53  <Method void ImageId(String, int)>
	//   59  131:putstatic       #82  <Field ImageId PmapIconEntry>
		PmapIconEntryLight = new ImageId("PmapIconEntryLight", 10);
	//   60  134:new             #2   <Class ImageId>
	//   61  137:dup             
	//   62  138:ldc1            #83  <String "PmapIconEntryLight">
	//   63  140:bipush          10
	//   64  142:invokespecial   #53  <Method void ImageId(String, int)>
	//   65  145:putstatic       #85  <Field ImageId PmapIconEntryLight>
		PmapIconHall = new ImageId("PmapIconHall", 11);
	//   66  148:new             #2   <Class ImageId>
	//   67  151:dup             
	//   68  152:ldc1            #86  <String "PmapIconHall">
	//   69  154:bipush          11
	//   70  156:invokespecial   #53  <Method void ImageId(String, int)>
	//   71  159:putstatic       #88  <Field ImageId PmapIconHall>
		PmapIconHallLight = new ImageId("PmapIconHallLight", 12);
	//   72  162:new             #2   <Class ImageId>
	//   73  165:dup             
	//   74  166:ldc1            #89  <String "PmapIconHallLight">
	//   75  168:bipush          12
	//   76  170:invokespecial   #53  <Method void ImageId(String, int)>
	//   77  173:putstatic       #91  <Field ImageId PmapIconHallLight>
		PmapIconKids = new ImageId("PmapIconKids", 13);
	//   78  176:new             #2   <Class ImageId>
	//   79  179:dup             
	//   80  180:ldc1            #92  <String "PmapIconKids">
	//   81  182:bipush          13
	//   82  184:invokespecial   #53  <Method void ImageId(String, int)>
	//   83  187:putstatic       #94  <Field ImageId PmapIconKids>
		PmapIconKidsLight = new ImageId("PmapIconKidsLight", 14);
	//   84  190:new             #2   <Class ImageId>
	//   85  193:dup             
	//   86  194:ldc1            #95  <String "PmapIconKidsLight">
	//   87  196:bipush          14
	//   88  198:invokespecial   #53  <Method void ImageId(String, int)>
	//   89  201:putstatic       #97  <Field ImageId PmapIconKidsLight>
		PmapIconKitchen = new ImageId("PmapIconKitchen", 15);
	//   90  204:new             #2   <Class ImageId>
	//   91  207:dup             
	//   92  208:ldc1            #98  <String "PmapIconKitchen">
	//   93  210:bipush          15
	//   94  212:invokespecial   #53  <Method void ImageId(String, int)>
	//   95  215:putstatic       #100 <Field ImageId PmapIconKitchen>
		PmapIconKitchenLight = new ImageId("PmapIconKitchenLight", 16);
	//   96  218:new             #2   <Class ImageId>
	//   97  221:dup             
	//   98  222:ldc1            #101 <String "PmapIconKitchenLight">
	//   99  224:bipush          16
	//  100  226:invokespecial   #53  <Method void ImageId(String, int)>
	//  101  229:putstatic       #103 <Field ImageId PmapIconKitchenLight>
		PmapIconLaundry = new ImageId("PmapIconLaundry", 17);
	//  102  232:new             #2   <Class ImageId>
	//  103  235:dup             
	//  104  236:ldc1            #104 <String "PmapIconLaundry">
	//  105  238:bipush          17
	//  106  240:invokespecial   #53  <Method void ImageId(String, int)>
	//  107  243:putstatic       #106 <Field ImageId PmapIconLaundry>
		PmapIconLaundryLight = new ImageId("PmapIconLaundryLight", 18);
	//  108  246:new             #2   <Class ImageId>
	//  109  249:dup             
	//  110  250:ldc1            #107 <String "PmapIconLaundryLight">
	//  111  252:bipush          18
	//  112  254:invokespecial   #53  <Method void ImageId(String, int)>
	//  113  257:putstatic       #109 <Field ImageId PmapIconLaundryLight>
		PmapIconLiving = new ImageId("PmapIconLiving", 19);
	//  114  260:new             #2   <Class ImageId>
	//  115  263:dup             
	//  116  264:ldc1            #110 <String "PmapIconLiving">
	//  117  266:bipush          19
	//  118  268:invokespecial   #53  <Method void ImageId(String, int)>
	//  119  271:putstatic       #112 <Field ImageId PmapIconLiving>
		PmapIconLivingLight = new ImageId("PmapIconLivingLight", 20);
	//  120  274:new             #2   <Class ImageId>
	//  121  277:dup             
	//  122  278:ldc1            #113 <String "PmapIconLivingLight">
	//  123  280:bipush          20
	//  124  282:invokespecial   #53  <Method void ImageId(String, int)>
	//  125  285:putstatic       #115 <Field ImageId PmapIconLivingLight>
		PmapIconOffice = new ImageId("PmapIconOffice", 21);
	//  126  288:new             #2   <Class ImageId>
	//  127  291:dup             
	//  128  292:ldc1            #116 <String "PmapIconOffice">
	//  129  294:bipush          21
	//  130  296:invokespecial   #53  <Method void ImageId(String, int)>
	//  131  299:putstatic       #118 <Field ImageId PmapIconOffice>
		PmapIconOfficeLight = new ImageId("PmapIconOfficeLight", 22);
	//  132  302:new             #2   <Class ImageId>
	//  133  305:dup             
	//  134  306:ldc1            #119 <String "PmapIconOfficeLight">
	//  135  308:bipush          22
	//  136  310:invokespecial   #53  <Method void ImageId(String, int)>
	//  137  313:putstatic       #121 <Field ImageId PmapIconOfficeLight>
		PmapIconStorage = new ImageId("PmapIconStorage", 23);
	//  138  316:new             #2   <Class ImageId>
	//  139  319:dup             
	//  140  320:ldc1            #122 <String "PmapIconStorage">
	//  141  322:bipush          23
	//  142  324:invokespecial   #53  <Method void ImageId(String, int)>
	//  143  327:putstatic       #124 <Field ImageId PmapIconStorage>
		PmapIconStorageLight = new ImageId("PmapIconStorageLight", 24);
	//  144  330:new             #2   <Class ImageId>
	//  145  333:dup             
	//  146  334:ldc1            #125 <String "PmapIconStorageLight">
	//  147  336:bipush          24
	//  148  338:invokespecial   #53  <Method void ImageId(String, int)>
	//  149  341:putstatic       #127 <Field ImageId PmapIconStorageLight>
		MissionMapElPasoRobot = new ImageId("MissionMapElPasoRobot", 25);
	//  150  344:new             #2   <Class ImageId>
	//  151  347:dup             
	//  152  348:ldc1            #128 <String "MissionMapElPasoRobot">
	//  153  350:bipush          25
	//  154  352:invokespecial   #53  <Method void ImageId(String, int)>
	//  155  355:putstatic       #130 <Field ImageId MissionMapElPasoRobot>
		MissionMapSanMarinoRobot = new ImageId("MissionMapSanMarinoRobot", 26);
	//  156  358:new             #2   <Class ImageId>
	//  157  361:dup             
	//  158  362:ldc1            #131 <String "MissionMapSanMarinoRobot">
	//  159  364:bipush          26
	//  160  366:invokespecial   #53  <Method void ImageId(String, int)>
	//  161  369:putstatic       #133 <Field ImageId MissionMapSanMarinoRobot>
		MissionMapSohoRobot = new ImageId("MissionMapSohoRobot", 27);
	//  162  372:new             #2   <Class ImageId>
	//  163  375:dup             
	//  164  376:ldc1            #134 <String "MissionMapSohoRobot">
	//  165  378:bipush          27
	//  166  380:invokespecial   #53  <Method void ImageId(String, int)>
	//  167  383:putstatic       #136 <Field ImageId MissionMapSohoRobot>
		MissionMapDirt = new ImageId("MissionMapDirt", 28);
	//  168  386:new             #2   <Class ImageId>
	//  169  389:dup             
	//  170  390:ldc1            #137 <String "MissionMapDirt">
	//  171  392:bipush          28
	//  172  394:invokespecial   #53  <Method void ImageId(String, int)>
	//  173  397:putstatic       #139 <Field ImageId MissionMapDirt>
		MissionMapDock = new ImageId("MissionMapDock", 29);
	//  174  400:new             #2   <Class ImageId>
	//  175  403:dup             
	//  176  404:ldc1            #140 <String "MissionMapDock">
	//  177  406:bipush          29
	//  178  408:invokespecial   #53  <Method void ImageId(String, int)>
	//  179  411:putstatic       #142 <Field ImageId MissionMapDock>
		MissionMapError = new ImageId("MissionMapError", 30);
	//  180  414:new             #2   <Class ImageId>
	//  181  417:dup             
	//  182  418:ldc1            #143 <String "MissionMapError">
	//  183  420:bipush          30
	//  184  422:invokespecial   #53  <Method void ImageId(String, int)>
	//  185  425:putstatic       #145 <Field ImageId MissionMapError>
		MissionMapOnDock = new ImageId("MissionMapOnDock", 31);
	//  186  428:new             #2   <Class ImageId>
	//  187  431:dup             
	//  188  432:ldc1            #146 <String "MissionMapOnDock">
	//  189  434:bipush          31
	//  190  436:invokespecial   #53  <Method void ImageId(String, int)>
	//  191  439:putstatic       #148 <Field ImageId MissionMapOnDock>
		MissionMapSuccess = new ImageId("MissionMapSuccess", 32);
	//  192  442:new             #2   <Class ImageId>
	//  193  445:dup             
	//  194  446:ldc1            #149 <String "MissionMapSuccess">
	//  195  448:bipush          32
	//  196  450:invokespecial   #53  <Method void ImageId(String, int)>
	//  197  453:putstatic       #151 <Field ImageId MissionMapSuccess>
		MissionMapCanceled = new ImageId("MissionMapCanceled", 33);
	//  198  456:new             #2   <Class ImageId>
	//  199  459:dup             
	//  200  460:ldc1            #152 <String "MissionMapCanceled">
	//  201  462:bipush          33
	//  202  464:invokespecial   #53  <Method void ImageId(String, int)>
	//  203  467:putstatic       #154 <Field ImageId MissionMapCanceled>
		MissionMapDeviceUnknown = new ImageId("MissionMapDeviceUnknown", 34);
	//  204  470:new             #2   <Class ImageId>
	//  205  473:dup             
	//  206  474:ldc1            #155 <String "MissionMapDeviceUnknown">
	//  207  476:bipush          34
	//  208  478:invokespecial   #53  <Method void ImageId(String, int)>
	//  209  481:putstatic       #157 <Field ImageId MissionMapDeviceUnknown>
		MissionMapDeviceLight = new ImageId("MissionMapDeviceLight", 35);
	//  210  484:new             #2   <Class ImageId>
	//  211  487:dup             
	//  212  488:ldc1            #158 <String "MissionMapDeviceLight">
	//  213  490:bipush          35
	//  214  492:invokespecial   #53  <Method void ImageId(String, int)>
	//  215  495:putstatic       #160 <Field ImageId MissionMapDeviceLight>
		MissionMapDeviceSmartSpeaker = new ImageId("MissionMapDeviceSmartSpeaker", 36);
	//  216  498:new             #2   <Class ImageId>
	//  217  501:dup             
	//  218  502:ldc1            #161 <String "MissionMapDeviceSmartSpeaker">
	//  219  504:bipush          36
	//  220  506:invokespecial   #53  <Method void ImageId(String, int)>
	//  221  509:putstatic       #163 <Field ImageId MissionMapDeviceSmartSpeaker>
		LastImageId = new ImageId("LastImageId", 37);
	//  222  512:new             #2   <Class ImageId>
	//  223  515:dup             
	//  224  516:ldc1            #164 <String "LastImageId">
	//  225  518:bipush          37
	//  226  520:invokespecial   #53  <Method void ImageId(String, int)>
	//  227  523:putstatic       #166 <Field ImageId LastImageId>
		$VALUES = (new ImageId[] {
			PmapIconBackground, PmapIconBath, PmapIconBathLight, PmapIconBed, PmapIconBedLight, PmapIconCustom, PmapIconCustomLight, PmapIconDining, PmapIconDiningLight, PmapIconEntry, 
			PmapIconEntryLight, PmapIconHall, PmapIconHallLight, PmapIconKids, PmapIconKidsLight, PmapIconKitchen, PmapIconKitchenLight, PmapIconLaundry, PmapIconLaundryLight, PmapIconLiving, 
			PmapIconLivingLight, PmapIconOffice, PmapIconOfficeLight, PmapIconStorage, PmapIconStorageLight, MissionMapElPasoRobot, MissionMapSanMarinoRobot, MissionMapSohoRobot, MissionMapDirt, MissionMapDock, 
			MissionMapError, MissionMapOnDock, MissionMapSuccess, MissionMapCanceled, MissionMapDeviceUnknown, MissionMapDeviceLight, MissionMapDeviceSmartSpeaker, LastImageId
		});
	//  228  526:bipush          38
	//  229  528:anewarray       ImageId[]
	//  230  531:dup             
	//  231  532:iconst_0        
	//  232  533:getstatic       #55  <Field ImageId PmapIconBackground>
	//  233  536:aastore         
	//  234  537:dup             
	//  235  538:iconst_1        
	//  236  539:getstatic       #58  <Field ImageId PmapIconBath>
	//  237  542:aastore         
	//  238  543:dup             
	//  239  544:iconst_2        
	//  240  545:getstatic       #61  <Field ImageId PmapIconBathLight>
	//  241  548:aastore         
	//  242  549:dup             
	//  243  550:iconst_3        
	//  244  551:getstatic       #64  <Field ImageId PmapIconBed>
	//  245  554:aastore         
	//  246  555:dup             
	//  247  556:iconst_4        
	//  248  557:getstatic       #67  <Field ImageId PmapIconBedLight>
	//  249  560:aastore         
	//  250  561:dup             
	//  251  562:iconst_5        
	//  252  563:getstatic       #70  <Field ImageId PmapIconCustom>
	//  253  566:aastore         
	//  254  567:dup             
	//  255  568:bipush          6
	//  256  570:getstatic       #73  <Field ImageId PmapIconCustomLight>
	//  257  573:aastore         
	//  258  574:dup             
	//  259  575:bipush          7
	//  260  577:getstatic       #76  <Field ImageId PmapIconDining>
	//  261  580:aastore         
	//  262  581:dup             
	//  263  582:bipush          8
	//  264  584:getstatic       #79  <Field ImageId PmapIconDiningLight>
	//  265  587:aastore         
	//  266  588:dup             
	//  267  589:bipush          9
	//  268  591:getstatic       #82  <Field ImageId PmapIconEntry>
	//  269  594:aastore         
	//  270  595:dup             
	//  271  596:bipush          10
	//  272  598:getstatic       #85  <Field ImageId PmapIconEntryLight>
	//  273  601:aastore         
	//  274  602:dup             
	//  275  603:bipush          11
	//  276  605:getstatic       #88  <Field ImageId PmapIconHall>
	//  277  608:aastore         
	//  278  609:dup             
	//  279  610:bipush          12
	//  280  612:getstatic       #91  <Field ImageId PmapIconHallLight>
	//  281  615:aastore         
	//  282  616:dup             
	//  283  617:bipush          13
	//  284  619:getstatic       #94  <Field ImageId PmapIconKids>
	//  285  622:aastore         
	//  286  623:dup             
	//  287  624:bipush          14
	//  288  626:getstatic       #97  <Field ImageId PmapIconKidsLight>
	//  289  629:aastore         
	//  290  630:dup             
	//  291  631:bipush          15
	//  292  633:getstatic       #100 <Field ImageId PmapIconKitchen>
	//  293  636:aastore         
	//  294  637:dup             
	//  295  638:bipush          16
	//  296  640:getstatic       #103 <Field ImageId PmapIconKitchenLight>
	//  297  643:aastore         
	//  298  644:dup             
	//  299  645:bipush          17
	//  300  647:getstatic       #106 <Field ImageId PmapIconLaundry>
	//  301  650:aastore         
	//  302  651:dup             
	//  303  652:bipush          18
	//  304  654:getstatic       #109 <Field ImageId PmapIconLaundryLight>
	//  305  657:aastore         
	//  306  658:dup             
	//  307  659:bipush          19
	//  308  661:getstatic       #112 <Field ImageId PmapIconLiving>
	//  309  664:aastore         
	//  310  665:dup             
	//  311  666:bipush          20
	//  312  668:getstatic       #115 <Field ImageId PmapIconLivingLight>
	//  313  671:aastore         
	//  314  672:dup             
	//  315  673:bipush          21
	//  316  675:getstatic       #118 <Field ImageId PmapIconOffice>
	//  317  678:aastore         
	//  318  679:dup             
	//  319  680:bipush          22
	//  320  682:getstatic       #121 <Field ImageId PmapIconOfficeLight>
	//  321  685:aastore         
	//  322  686:dup             
	//  323  687:bipush          23
	//  324  689:getstatic       #124 <Field ImageId PmapIconStorage>
	//  325  692:aastore         
	//  326  693:dup             
	//  327  694:bipush          24
	//  328  696:getstatic       #127 <Field ImageId PmapIconStorageLight>
	//  329  699:aastore         
	//  330  700:dup             
	//  331  701:bipush          25
	//  332  703:getstatic       #130 <Field ImageId MissionMapElPasoRobot>
	//  333  706:aastore         
	//  334  707:dup             
	//  335  708:bipush          26
	//  336  710:getstatic       #133 <Field ImageId MissionMapSanMarinoRobot>
	//  337  713:aastore         
	//  338  714:dup             
	//  339  715:bipush          27
	//  340  717:getstatic       #136 <Field ImageId MissionMapSohoRobot>
	//  341  720:aastore         
	//  342  721:dup             
	//  343  722:bipush          28
	//  344  724:getstatic       #139 <Field ImageId MissionMapDirt>
	//  345  727:aastore         
	//  346  728:dup             
	//  347  729:bipush          29
	//  348  731:getstatic       #142 <Field ImageId MissionMapDock>
	//  349  734:aastore         
	//  350  735:dup             
	//  351  736:bipush          30
	//  352  738:getstatic       #145 <Field ImageId MissionMapError>
	//  353  741:aastore         
	//  354  742:dup             
	//  355  743:bipush          31
	//  356  745:getstatic       #148 <Field ImageId MissionMapOnDock>
	//  357  748:aastore         
	//  358  749:dup             
	//  359  750:bipush          32
	//  360  752:getstatic       #151 <Field ImageId MissionMapSuccess>
	//  361  755:aastore         
	//  362  756:dup             
	//  363  757:bipush          33
	//  364  759:getstatic       #154 <Field ImageId MissionMapCanceled>
	//  365  762:aastore         
	//  366  763:dup             
	//  367  764:bipush          34
	//  368  766:getstatic       #157 <Field ImageId MissionMapDeviceUnknown>
	//  369  769:aastore         
	//  370  770:dup             
	//  371  771:bipush          35
	//  372  773:getstatic       #160 <Field ImageId MissionMapDeviceLight>
	//  373  776:aastore         
	//  374  777:dup             
	//  375  778:bipush          36
	//  376  780:getstatic       #163 <Field ImageId MissionMapDeviceSmartSpeaker>
	//  377  783:aastore         
	//  378  784:dup             
	//  379  785:bipush          37
	//  380  787:getstatic       #166 <Field ImageId LastImageId>
	//  381  790:aastore         
	//  382  791:putstatic       #168 <Field ImageId[] $VALUES>
	//* 383  794:return          
	}
}
