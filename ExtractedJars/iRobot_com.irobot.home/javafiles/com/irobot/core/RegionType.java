// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class RegionType extends Enum
{

	private RegionType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #142 <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static RegionType valueOf(String s)
	{
		return (RegionType)Enum.valueOf(com/irobot/core/RegionType, s);
	//    0    0:ldc1            #2   <Class RegionType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #148 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class RegionType>
	//    4    9:areturn         
	}

	public static RegionType[] values()
	{
		return (RegionType[])((RegionType []) ($VALUES)).clone();
	//    0    0:getstatic       #140 <Field RegionType[] $VALUES>
	//    1    3:invokevirtual   #155 <Method Object _5B_Lcom.irobot.core.RegionType_3B_.clone()>
	//    2    6:checkcast       #151 <Class RegionType[]>
	//    3    9:areturn         
	}

	private static final RegionType $VALUES[];
	public static final RegionType Basement;
	public static final RegionType Bathroom;
	public static final RegionType Bedroom;
	public static final RegionType BreakfastRoom;
	public static final RegionType Closet;
	public static final RegionType Custom;
	public static final RegionType Den;
	public static final RegionType DiningRoom;
	public static final RegionType Entryway;
	public static final RegionType FamilyRoom;
	public static final RegionType Foyer;
	public static final RegionType Garage;
	public static final RegionType GuestBathroom;
	public static final RegionType GuestBedroom;
	public static final RegionType Hallway;
	public static final RegionType Kitchen;
	public static final RegionType LaundryRoom;
	public static final RegionType LivingRoom;
	public static final RegionType Lounge;
	public static final RegionType MasterBathroom;
	public static final RegionType MasterBedroom;
	public static final RegionType MediaRoom;
	public static final RegionType MudRoom;
	public static final RegionType Office;
	public static final RegionType Pantry;
	public static final RegionType Playroom;
	public static final RegionType StorageRoom;
	public static final RegionType Study;
	public static final RegionType SunRoom;
	public static final RegionType Unknown;
	public static final RegionType Workshop;

	static 
	{
		Unknown = new RegionType("Unknown", 0);
	//    0    0:new             #2   <Class RegionType>
	//    1    3:dup             
	//    2    4:ldc1            #42  <String "Unknown">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #46  <Method void RegionType(String, int)>
	//    5   10:putstatic       #48  <Field RegionType Unknown>
		Basement = new RegionType("Basement", 1);
	//    6   13:new             #2   <Class RegionType>
	//    7   16:dup             
	//    8   17:ldc1            #49  <String "Basement">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #46  <Method void RegionType(String, int)>
	//   11   23:putstatic       #51  <Field RegionType Basement>
		Bathroom = new RegionType("Bathroom", 2);
	//   12   26:new             #2   <Class RegionType>
	//   13   29:dup             
	//   14   30:ldc1            #52  <String "Bathroom">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #46  <Method void RegionType(String, int)>
	//   17   36:putstatic       #54  <Field RegionType Bathroom>
		Bedroom = new RegionType("Bedroom", 3);
	//   18   39:new             #2   <Class RegionType>
	//   19   42:dup             
	//   20   43:ldc1            #55  <String "Bedroom">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #46  <Method void RegionType(String, int)>
	//   23   49:putstatic       #57  <Field RegionType Bedroom>
		BreakfastRoom = new RegionType("BreakfastRoom", 4);
	//   24   52:new             #2   <Class RegionType>
	//   25   55:dup             
	//   26   56:ldc1            #58  <String "BreakfastRoom">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #46  <Method void RegionType(String, int)>
	//   29   62:putstatic       #60  <Field RegionType BreakfastRoom>
		Closet = new RegionType("Closet", 5);
	//   30   65:new             #2   <Class RegionType>
	//   31   68:dup             
	//   32   69:ldc1            #61  <String "Closet">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #46  <Method void RegionType(String, int)>
	//   35   75:putstatic       #63  <Field RegionType Closet>
		Den = new RegionType("Den", 6);
	//   36   78:new             #2   <Class RegionType>
	//   37   81:dup             
	//   38   82:ldc1            #64  <String "Den">
	//   39   84:bipush          6
	//   40   86:invokespecial   #46  <Method void RegionType(String, int)>
	//   41   89:putstatic       #66  <Field RegionType Den>
		DiningRoom = new RegionType("DiningRoom", 7);
	//   42   92:new             #2   <Class RegionType>
	//   43   95:dup             
	//   44   96:ldc1            #67  <String "DiningRoom">
	//   45   98:bipush          7
	//   46  100:invokespecial   #46  <Method void RegionType(String, int)>
	//   47  103:putstatic       #69  <Field RegionType DiningRoom>
		Entryway = new RegionType("Entryway", 8);
	//   48  106:new             #2   <Class RegionType>
	//   49  109:dup             
	//   50  110:ldc1            #70  <String "Entryway">
	//   51  112:bipush          8
	//   52  114:invokespecial   #46  <Method void RegionType(String, int)>
	//   53  117:putstatic       #72  <Field RegionType Entryway>
		FamilyRoom = new RegionType("FamilyRoom", 9);
	//   54  120:new             #2   <Class RegionType>
	//   55  123:dup             
	//   56  124:ldc1            #73  <String "FamilyRoom">
	//   57  126:bipush          9
	//   58  128:invokespecial   #46  <Method void RegionType(String, int)>
	//   59  131:putstatic       #75  <Field RegionType FamilyRoom>
		Foyer = new RegionType("Foyer", 10);
	//   60  134:new             #2   <Class RegionType>
	//   61  137:dup             
	//   62  138:ldc1            #76  <String "Foyer">
	//   63  140:bipush          10
	//   64  142:invokespecial   #46  <Method void RegionType(String, int)>
	//   65  145:putstatic       #78  <Field RegionType Foyer>
		Garage = new RegionType("Garage", 11);
	//   66  148:new             #2   <Class RegionType>
	//   67  151:dup             
	//   68  152:ldc1            #79  <String "Garage">
	//   69  154:bipush          11
	//   70  156:invokespecial   #46  <Method void RegionType(String, int)>
	//   71  159:putstatic       #81  <Field RegionType Garage>
		GuestBathroom = new RegionType("GuestBathroom", 12);
	//   72  162:new             #2   <Class RegionType>
	//   73  165:dup             
	//   74  166:ldc1            #82  <String "GuestBathroom">
	//   75  168:bipush          12
	//   76  170:invokespecial   #46  <Method void RegionType(String, int)>
	//   77  173:putstatic       #84  <Field RegionType GuestBathroom>
		GuestBedroom = new RegionType("GuestBedroom", 13);
	//   78  176:new             #2   <Class RegionType>
	//   79  179:dup             
	//   80  180:ldc1            #85  <String "GuestBedroom">
	//   81  182:bipush          13
	//   82  184:invokespecial   #46  <Method void RegionType(String, int)>
	//   83  187:putstatic       #87  <Field RegionType GuestBedroom>
		Hallway = new RegionType("Hallway", 14);
	//   84  190:new             #2   <Class RegionType>
	//   85  193:dup             
	//   86  194:ldc1            #88  <String "Hallway">
	//   87  196:bipush          14
	//   88  198:invokespecial   #46  <Method void RegionType(String, int)>
	//   89  201:putstatic       #90  <Field RegionType Hallway>
		Kitchen = new RegionType("Kitchen", 15);
	//   90  204:new             #2   <Class RegionType>
	//   91  207:dup             
	//   92  208:ldc1            #91  <String "Kitchen">
	//   93  210:bipush          15
	//   94  212:invokespecial   #46  <Method void RegionType(String, int)>
	//   95  215:putstatic       #93  <Field RegionType Kitchen>
		LaundryRoom = new RegionType("LaundryRoom", 16);
	//   96  218:new             #2   <Class RegionType>
	//   97  221:dup             
	//   98  222:ldc1            #94  <String "LaundryRoom">
	//   99  224:bipush          16
	//  100  226:invokespecial   #46  <Method void RegionType(String, int)>
	//  101  229:putstatic       #96  <Field RegionType LaundryRoom>
		LivingRoom = new RegionType("LivingRoom", 17);
	//  102  232:new             #2   <Class RegionType>
	//  103  235:dup             
	//  104  236:ldc1            #97  <String "LivingRoom">
	//  105  238:bipush          17
	//  106  240:invokespecial   #46  <Method void RegionType(String, int)>
	//  107  243:putstatic       #99  <Field RegionType LivingRoom>
		Lounge = new RegionType("Lounge", 18);
	//  108  246:new             #2   <Class RegionType>
	//  109  249:dup             
	//  110  250:ldc1            #100 <String "Lounge">
	//  111  252:bipush          18
	//  112  254:invokespecial   #46  <Method void RegionType(String, int)>
	//  113  257:putstatic       #102 <Field RegionType Lounge>
		MasterBathroom = new RegionType("MasterBathroom", 19);
	//  114  260:new             #2   <Class RegionType>
	//  115  263:dup             
	//  116  264:ldc1            #103 <String "MasterBathroom">
	//  117  266:bipush          19
	//  118  268:invokespecial   #46  <Method void RegionType(String, int)>
	//  119  271:putstatic       #105 <Field RegionType MasterBathroom>
		MasterBedroom = new RegionType("MasterBedroom", 20);
	//  120  274:new             #2   <Class RegionType>
	//  121  277:dup             
	//  122  278:ldc1            #106 <String "MasterBedroom">
	//  123  280:bipush          20
	//  124  282:invokespecial   #46  <Method void RegionType(String, int)>
	//  125  285:putstatic       #108 <Field RegionType MasterBedroom>
		MediaRoom = new RegionType("MediaRoom", 21);
	//  126  288:new             #2   <Class RegionType>
	//  127  291:dup             
	//  128  292:ldc1            #109 <String "MediaRoom">
	//  129  294:bipush          21
	//  130  296:invokespecial   #46  <Method void RegionType(String, int)>
	//  131  299:putstatic       #111 <Field RegionType MediaRoom>
		MudRoom = new RegionType("MudRoom", 22);
	//  132  302:new             #2   <Class RegionType>
	//  133  305:dup             
	//  134  306:ldc1            #112 <String "MudRoom">
	//  135  308:bipush          22
	//  136  310:invokespecial   #46  <Method void RegionType(String, int)>
	//  137  313:putstatic       #114 <Field RegionType MudRoom>
		Office = new RegionType("Office", 23);
	//  138  316:new             #2   <Class RegionType>
	//  139  319:dup             
	//  140  320:ldc1            #115 <String "Office">
	//  141  322:bipush          23
	//  142  324:invokespecial   #46  <Method void RegionType(String, int)>
	//  143  327:putstatic       #117 <Field RegionType Office>
		Pantry = new RegionType("Pantry", 24);
	//  144  330:new             #2   <Class RegionType>
	//  145  333:dup             
	//  146  334:ldc1            #118 <String "Pantry">
	//  147  336:bipush          24
	//  148  338:invokespecial   #46  <Method void RegionType(String, int)>
	//  149  341:putstatic       #120 <Field RegionType Pantry>
		Playroom = new RegionType("Playroom", 25);
	//  150  344:new             #2   <Class RegionType>
	//  151  347:dup             
	//  152  348:ldc1            #121 <String "Playroom">
	//  153  350:bipush          25
	//  154  352:invokespecial   #46  <Method void RegionType(String, int)>
	//  155  355:putstatic       #123 <Field RegionType Playroom>
		StorageRoom = new RegionType("StorageRoom", 26);
	//  156  358:new             #2   <Class RegionType>
	//  157  361:dup             
	//  158  362:ldc1            #124 <String "StorageRoom">
	//  159  364:bipush          26
	//  160  366:invokespecial   #46  <Method void RegionType(String, int)>
	//  161  369:putstatic       #126 <Field RegionType StorageRoom>
		Study = new RegionType("Study", 27);
	//  162  372:new             #2   <Class RegionType>
	//  163  375:dup             
	//  164  376:ldc1            #127 <String "Study">
	//  165  378:bipush          27
	//  166  380:invokespecial   #46  <Method void RegionType(String, int)>
	//  167  383:putstatic       #129 <Field RegionType Study>
		SunRoom = new RegionType("SunRoom", 28);
	//  168  386:new             #2   <Class RegionType>
	//  169  389:dup             
	//  170  390:ldc1            #130 <String "SunRoom">
	//  171  392:bipush          28
	//  172  394:invokespecial   #46  <Method void RegionType(String, int)>
	//  173  397:putstatic       #132 <Field RegionType SunRoom>
		Workshop = new RegionType("Workshop", 29);
	//  174  400:new             #2   <Class RegionType>
	//  175  403:dup             
	//  176  404:ldc1            #133 <String "Workshop">
	//  177  406:bipush          29
	//  178  408:invokespecial   #46  <Method void RegionType(String, int)>
	//  179  411:putstatic       #135 <Field RegionType Workshop>
		Custom = new RegionType("Custom", 30);
	//  180  414:new             #2   <Class RegionType>
	//  181  417:dup             
	//  182  418:ldc1            #136 <String "Custom">
	//  183  420:bipush          30
	//  184  422:invokespecial   #46  <Method void RegionType(String, int)>
	//  185  425:putstatic       #138 <Field RegionType Custom>
		$VALUES = (new RegionType[] {
			Unknown, Basement, Bathroom, Bedroom, BreakfastRoom, Closet, Den, DiningRoom, Entryway, FamilyRoom, 
			Foyer, Garage, GuestBathroom, GuestBedroom, Hallway, Kitchen, LaundryRoom, LivingRoom, Lounge, MasterBathroom, 
			MasterBedroom, MediaRoom, MudRoom, Office, Pantry, Playroom, StorageRoom, Study, SunRoom, Workshop, 
			Custom
		});
	//  186  428:bipush          31
	//  187  430:anewarray       RegionType[]
	//  188  433:dup             
	//  189  434:iconst_0        
	//  190  435:getstatic       #48  <Field RegionType Unknown>
	//  191  438:aastore         
	//  192  439:dup             
	//  193  440:iconst_1        
	//  194  441:getstatic       #51  <Field RegionType Basement>
	//  195  444:aastore         
	//  196  445:dup             
	//  197  446:iconst_2        
	//  198  447:getstatic       #54  <Field RegionType Bathroom>
	//  199  450:aastore         
	//  200  451:dup             
	//  201  452:iconst_3        
	//  202  453:getstatic       #57  <Field RegionType Bedroom>
	//  203  456:aastore         
	//  204  457:dup             
	//  205  458:iconst_4        
	//  206  459:getstatic       #60  <Field RegionType BreakfastRoom>
	//  207  462:aastore         
	//  208  463:dup             
	//  209  464:iconst_5        
	//  210  465:getstatic       #63  <Field RegionType Closet>
	//  211  468:aastore         
	//  212  469:dup             
	//  213  470:bipush          6
	//  214  472:getstatic       #66  <Field RegionType Den>
	//  215  475:aastore         
	//  216  476:dup             
	//  217  477:bipush          7
	//  218  479:getstatic       #69  <Field RegionType DiningRoom>
	//  219  482:aastore         
	//  220  483:dup             
	//  221  484:bipush          8
	//  222  486:getstatic       #72  <Field RegionType Entryway>
	//  223  489:aastore         
	//  224  490:dup             
	//  225  491:bipush          9
	//  226  493:getstatic       #75  <Field RegionType FamilyRoom>
	//  227  496:aastore         
	//  228  497:dup             
	//  229  498:bipush          10
	//  230  500:getstatic       #78  <Field RegionType Foyer>
	//  231  503:aastore         
	//  232  504:dup             
	//  233  505:bipush          11
	//  234  507:getstatic       #81  <Field RegionType Garage>
	//  235  510:aastore         
	//  236  511:dup             
	//  237  512:bipush          12
	//  238  514:getstatic       #84  <Field RegionType GuestBathroom>
	//  239  517:aastore         
	//  240  518:dup             
	//  241  519:bipush          13
	//  242  521:getstatic       #87  <Field RegionType GuestBedroom>
	//  243  524:aastore         
	//  244  525:dup             
	//  245  526:bipush          14
	//  246  528:getstatic       #90  <Field RegionType Hallway>
	//  247  531:aastore         
	//  248  532:dup             
	//  249  533:bipush          15
	//  250  535:getstatic       #93  <Field RegionType Kitchen>
	//  251  538:aastore         
	//  252  539:dup             
	//  253  540:bipush          16
	//  254  542:getstatic       #96  <Field RegionType LaundryRoom>
	//  255  545:aastore         
	//  256  546:dup             
	//  257  547:bipush          17
	//  258  549:getstatic       #99  <Field RegionType LivingRoom>
	//  259  552:aastore         
	//  260  553:dup             
	//  261  554:bipush          18
	//  262  556:getstatic       #102 <Field RegionType Lounge>
	//  263  559:aastore         
	//  264  560:dup             
	//  265  561:bipush          19
	//  266  563:getstatic       #105 <Field RegionType MasterBathroom>
	//  267  566:aastore         
	//  268  567:dup             
	//  269  568:bipush          20
	//  270  570:getstatic       #108 <Field RegionType MasterBedroom>
	//  271  573:aastore         
	//  272  574:dup             
	//  273  575:bipush          21
	//  274  577:getstatic       #111 <Field RegionType MediaRoom>
	//  275  580:aastore         
	//  276  581:dup             
	//  277  582:bipush          22
	//  278  584:getstatic       #114 <Field RegionType MudRoom>
	//  279  587:aastore         
	//  280  588:dup             
	//  281  589:bipush          23
	//  282  591:getstatic       #117 <Field RegionType Office>
	//  283  594:aastore         
	//  284  595:dup             
	//  285  596:bipush          24
	//  286  598:getstatic       #120 <Field RegionType Pantry>
	//  287  601:aastore         
	//  288  602:dup             
	//  289  603:bipush          25
	//  290  605:getstatic       #123 <Field RegionType Playroom>
	//  291  608:aastore         
	//  292  609:dup             
	//  293  610:bipush          26
	//  294  612:getstatic       #126 <Field RegionType StorageRoom>
	//  295  615:aastore         
	//  296  616:dup             
	//  297  617:bipush          27
	//  298  619:getstatic       #129 <Field RegionType Study>
	//  299  622:aastore         
	//  300  623:dup             
	//  301  624:bipush          28
	//  302  626:getstatic       #132 <Field RegionType SunRoom>
	//  303  629:aastore         
	//  304  630:dup             
	//  305  631:bipush          29
	//  306  633:getstatic       #135 <Field RegionType Workshop>
	//  307  636:aastore         
	//  308  637:dup             
	//  309  638:bipush          30
	//  310  640:getstatic       #138 <Field RegionType Custom>
	//  311  643:aastore         
	//  312  644:putstatic       #140 <Field RegionType[] $VALUES>
	//* 313  647:return          
	}
}
