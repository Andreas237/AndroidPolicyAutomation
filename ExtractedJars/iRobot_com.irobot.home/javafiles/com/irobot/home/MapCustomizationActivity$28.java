// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;

// Referenced classes of package com.irobot.home:
//			MapCustomizationActivity

static class MapCustomizationActivity$28
{

	static final int a[];
	static final int b[];
	static final int c[];
	static final int d[];
	static final int e[];

	static 
	{
		e = new int[TitleSpecifier.values().length];
	//    0    0:invokestatic    #22  <Method TitleSpecifier[] TitleSpecifier.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #24  <Field int[] e>
		try
		{
			e[TitleSpecifier.Loading.ordinal()] = 1;
	//    4    9:getstatic       #24  <Field int[] e>
	//    5   12:getstatic       #28  <Field TitleSpecifier TitleSpecifier.Loading>
	//    6   15:invokevirtual   #32  <Method int TitleSpecifier.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #24  <Field int[] e>
	//*  10   23:getstatic       #35  <Field TitleSpecifier TitleSpecifier.Naming>
	//*  11   26:invokevirtual   #32  <Method int TitleSpecifier.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #24  <Field int[] e>
	//*  15   34:getstatic       #38  <Field TitleSpecifier TitleSpecifier.PlaceholderMapName>
	//*  16   37:invokevirtual   #32  <Method int TitleSpecifier.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #24  <Field int[] e>
	//*  20   45:getstatic       #41  <Field TitleSpecifier TitleSpecifier.MapName>
	//*  21   48:invokevirtual   #32  <Method int TitleSpecifier.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:getstatic       #24  <Field int[] e>
	//*  25   56:getstatic       #44  <Field TitleSpecifier TitleSpecifier.DoorEdit>
	//*  26   59:invokevirtual   #32  <Method int TitleSpecifier.ordinal()>
	//*  27   62:iconst_5        
	//*  28   63:iastore         
	//*  29   64:getstatic       #24  <Field int[] e>
	//*  30   67:getstatic       #47  <Field TitleSpecifier TitleSpecifier.Labeling>
	//*  31   70:invokevirtual   #32  <Method int TitleSpecifier.ordinal()>
	//*  32   73:bipush          6
	//*  33   75:iastore         
	//*  34   76:getstatic       #24  <Field int[] e>
	//*  35   79:getstatic       #50  <Field TitleSpecifier TitleSpecifier.ReLabeling>
	//*  36   82:invokevirtual   #32  <Method int TitleSpecifier.ordinal()>
	//*  37   85:bipush          7
	//*  38   87:iastore         
	//*  39   88:getstatic       #24  <Field int[] e>
	//*  40   91:getstatic       #53  <Field TitleSpecifier TitleSpecifier.NoMap>
	//*  41   94:invokevirtual   #32  <Method int TitleSpecifier.ordinal()>
	//*  42   97:bipush          8
	//*  43   99:iastore         
	//*  44  100:invokestatic    #58  <Method MapCustomizationViewState[] MapCustomizationViewState.values()>
	//*  45  103:arraylength     
	//*  46  104:newarray        int[]
	//*  47  106:putstatic       #60  <Field int[] d>
	//*  48  109:getstatic       #60  <Field int[] d>
	//*  49  112:getstatic       #63  <Field MapCustomizationViewState MapCustomizationViewState.Loading>
	//*  50  115:invokevirtual   #64  <Method int MapCustomizationViewState.ordinal()>
	//*  51  118:iconst_1        
	//*  52  119:iastore         
	//*  53  120:getstatic       #60  <Field int[] d>
	//*  54  123:getstatic       #67  <Field MapCustomizationViewState MapCustomizationViewState.Saving>
	//*  55  126:invokevirtual   #64  <Method int MapCustomizationViewState.ordinal()>
	//*  56  129:iconst_2        
	//*  57  130:iastore         
	//*  58  131:getstatic       #60  <Field int[] d>
	//*  59  134:getstatic       #70  <Field MapCustomizationViewState MapCustomizationViewState.StillLearningMapPreview>
	//*  60  137:invokevirtual   #64  <Method int MapCustomizationViewState.ordinal()>
	//*  61  140:iconst_3        
	//*  62  141:iastore         
	//*  63  142:getstatic       #60  <Field int[] d>
	//*  64  145:getstatic       #73  <Field MapCustomizationViewState MapCustomizationViewState.SetupMapPreview>
	//*  65  148:invokevirtual   #64  <Method int MapCustomizationViewState.ordinal()>
	//*  66  151:iconst_4        
	//*  67  152:iastore         
	//*  68  153:getstatic       #60  <Field int[] d>
	//*  69  156:getstatic       #76  <Field MapCustomizationViewState MapCustomizationViewState.PendingNameMap>
	//*  70  159:invokevirtual   #64  <Method int MapCustomizationViewState.ordinal()>
	//*  71  162:iconst_5        
	//*  72  163:iastore         
	//*  73  164:getstatic       #60  <Field int[] d>
	//*  74  167:getstatic       #79  <Field MapCustomizationViewState MapCustomizationViewState.FullyLabeledMapPreview>
	//*  75  170:invokevirtual   #64  <Method int MapCustomizationViewState.ordinal()>
	//*  76  173:bipush          6
	//*  77  175:iastore         
	//*  78  176:getstatic       #60  <Field int[] d>
	//*  79  179:getstatic       #82  <Field MapCustomizationViewState MapCustomizationViewState.LabelingRoomSelection>
	//*  80  182:invokevirtual   #64  <Method int MapCustomizationViewState.ordinal()>
	//*  81  185:bipush          7
	//*  82  187:iastore         
	//*  83  188:getstatic       #60  <Field int[] d>
	//*  84  191:getstatic       #84  <Field MapCustomizationViewState MapCustomizationViewState.Labeling>
	//*  85  194:invokevirtual   #64  <Method int MapCustomizationViewState.ordinal()>
	//*  86  197:bipush          8
	//*  87  199:iastore         
	//*  88  200:getstatic       #60  <Field int[] d>
	//*  89  203:getstatic       #87  <Field MapCustomizationViewState MapCustomizationViewState.LabelingHasPendingSave>
	//*  90  206:invokevirtual   #64  <Method int MapCustomizationViewState.ordinal()>
	//*  91  209:bipush          9
	//*  92  211:iastore         
	//*  93  212:getstatic       #60  <Field int[] d>
	//*  94  215:getstatic       #89  <Field MapCustomizationViewState MapCustomizationViewState.DoorEdit>
	//*  95  218:invokevirtual   #64  <Method int MapCustomizationViewState.ordinal()>
	//*  96  221:bipush          10
	//*  97  223:iastore         
	//*  98  224:getstatic       #60  <Field int[] d>
	//*  99  227:getstatic       #92  <Field MapCustomizationViewState MapCustomizationViewState.KeepOutZoneAdd>
	//* 100  230:invokevirtual   #64  <Method int MapCustomizationViewState.ordinal()>
	//* 101  233:bipush          11
	//* 102  235:iastore         
	//* 103  236:getstatic       #60  <Field int[] d>
	//* 104  239:getstatic       #95  <Field MapCustomizationViewState MapCustomizationViewState.KeepOutZoneEdit>
	//* 105  242:invokevirtual   #64  <Method int MapCustomizationViewState.ordinal()>
	//* 106  245:bipush          12
	//* 107  247:iastore         
	//* 108  248:getstatic       #60  <Field int[] d>
	//* 109  251:getstatic       #98  <Field MapCustomizationViewState MapCustomizationViewState.KeepOutZoneSelected>
	//* 110  254:invokevirtual   #64  <Method int MapCustomizationViewState.ordinal()>
	//* 111  257:bipush          13
	//* 112  259:iastore         
	//* 113  260:getstatic       #60  <Field int[] d>
	//* 114  263:getstatic       #101 <Field MapCustomizationViewState MapCustomizationViewState.DoorEditHasPendingValidSave>
	//* 115  266:invokevirtual   #64  <Method int MapCustomizationViewState.ordinal()>
	//* 116  269:bipush          14
	//* 117  271:iastore         
	//* 118  272:getstatic       #60  <Field int[] d>
	//* 119  275:getstatic       #104 <Field MapCustomizationViewState MapCustomizationViewState.DoorEditHasPendingInvalidSave>
	//* 120  278:invokevirtual   #64  <Method int MapCustomizationViewState.ordinal()>
	//* 121  281:bipush          15
	//* 122  283:iastore         
	//* 123  284:getstatic       #60  <Field int[] d>
	//* 124  287:getstatic       #107 <Field MapCustomizationViewState MapCustomizationViewState.SetupComplete>
	//* 125  290:invokevirtual   #64  <Method int MapCustomizationViewState.ordinal()>
	//* 126  293:bipush          16
	//* 127  295:iastore         
	//* 128  296:invokestatic    #112 <Method MapCustomizationErrors[] MapCustomizationErrors.values()>
	//* 129  299:arraylength     
	//* 130  300:newarray        int[]
	//* 131  302:putstatic       #114 <Field int[] c>
	//* 132  305:getstatic       #114 <Field int[] c>
	//* 133  308:getstatic       #118 <Field MapCustomizationErrors MapCustomizationErrors.KozOverDock>
	//* 134  311:invokevirtual   #119 <Method int MapCustomizationErrors.ordinal()>
	//* 135  314:iconst_1        
	//* 136  315:iastore         
	//* 137  316:getstatic       #114 <Field int[] c>
	//* 138  319:getstatic       #122 <Field MapCustomizationErrors MapCustomizationErrors.RoomTooSmall>
	//* 139  322:invokevirtual   #119 <Method int MapCustomizationErrors.ordinal()>
	//* 140  325:iconst_2        
	//* 141  326:iastore         
	//* 142  327:getstatic       #114 <Field int[] c>
	//* 143  330:getstatic       #125 <Field MapCustomizationErrors MapCustomizationErrors.SaveTimedOut>
	//* 144  333:invokevirtual   #119 <Method int MapCustomizationErrors.ordinal()>
	//* 145  336:iconst_3        
	//* 146  337:iastore         
	//* 147  338:getstatic       #114 <Field int[] c>
	//* 148  341:getstatic       #128 <Field MapCustomizationErrors MapCustomizationErrors.SaveFloorNameTimedOut>
	//* 149  344:invokevirtual   #119 <Method int MapCustomizationErrors.ordinal()>
	//* 150  347:iconst_4        
	//* 151  348:iastore         
	//* 152  349:getstatic       #114 <Field int[] c>
	//* 153  352:getstatic       #131 <Field MapCustomizationErrors MapCustomizationErrors.EmptyMap>
	//* 154  355:invokevirtual   #119 <Method int MapCustomizationErrors.ordinal()>
	//* 155  358:iconst_5        
	//* 156  359:iastore         
	//* 157  360:getstatic       #114 <Field int[] c>
	//* 158  363:getstatic       #134 <Field MapCustomizationErrors MapCustomizationErrors.SegmentationTransferFailed>
	//* 159  366:invokevirtual   #119 <Method int MapCustomizationErrors.ordinal()>
	//* 160  369:bipush          6
	//* 161  371:iastore         
	//* 162  372:invokestatic    #139 <Method ScheduleDataState[] ScheduleDataState.values()>
	//* 163  375:arraylength     
	//* 164  376:newarray        int[]
	//* 165  378:putstatic       #141 <Field int[] b>
	//* 166  381:getstatic       #141 <Field int[] b>
	//* 167  384:getstatic       #145 <Field ScheduleDataState ScheduleDataState.CheckIfSchedulesContainsMapId>
	//* 168  387:invokevirtual   #146 <Method int ScheduleDataState.ordinal()>
	//* 169  390:iconst_1        
	//* 170  391:iastore         
	//* 171  392:invokestatic    #151 <Method MapsViewState[] MapsViewState.values()>
	//* 172  395:arraylength     
	//* 173  396:newarray        int[]
	//* 174  398:putstatic       #153 <Field int[] a>
	//* 175  401:getstatic       #153 <Field int[] a>
	//* 176  404:getstatic       #157 <Field MapsViewState MapsViewState.RegionSelectedToLabel>
	//* 177  407:invokevirtual   #158 <Method int MapsViewState.ordinal()>
	//* 178  410:iconst_1        
	//* 179  411:iastore         
	//* 180  412:getstatic       #153 <Field int[] a>
	//* 181  415:getstatic       #161 <Field MapsViewState MapsViewState.NoRegionSelectedToLabel>
	//* 182  418:invokevirtual   #158 <Method int MapsViewState.ordinal()>
	//* 183  421:iconst_2        
	//* 184  422:iastore         
	//* 185  423:getstatic       #153 <Field int[] a>
	//* 186  426:getstatic       #164 <Field MapsViewState MapsViewState.CustomizationViewState>
	//* 187  429:invokevirtual   #158 <Method int MapsViewState.ordinal()>
	//* 188  432:iconst_3        
	//* 189  433:iastore         
	//* 190  434:getstatic       #153 <Field int[] a>
	//* 191  437:getstatic       #167 <Field MapsViewState MapsViewState.ShowCustomizationOptionMenu>
	//* 192  440:invokevirtual   #158 <Method int MapsViewState.ordinal()>
	//* 193  443:iconst_4        
	//* 194  444:iastore         
	//* 195  445:getstatic       #153 <Field int[] a>
	//* 196  448:getstatic       #170 <Field MapsViewState MapsViewState.ShowCustomizationErrorMessage>
	//* 197  451:invokevirtual   #158 <Method int MapsViewState.ordinal()>
	//* 198  454:iconst_5        
	//* 199  455:iastore         
	//* 200  456:getstatic       #153 <Field int[] a>
	//* 201  459:getstatic       #173 <Field MapsViewState MapsViewState.ShowCustomizedMapName>
	//* 202  462:invokevirtual   #158 <Method int MapsViewState.ordinal()>
	//* 203  465:bipush          6
	//* 204  467:iastore         
	//* 205  468:getstatic       #153 <Field int[] a>
	//* 206  471:getstatic       #176 <Field MapsViewState MapsViewState.ShowEnterMapNameDialog>
	//* 207  474:invokevirtual   #158 <Method int MapsViewState.ordinal()>
	//* 208  477:bipush          7
	//* 209  479:iastore         
	//* 210  480:getstatic       #153 <Field int[] a>
	//* 211  483:getstatic       #179 <Field MapsViewState MapsViewState.ShowUnlabeledRegionCount>
	//* 212  486:invokevirtual   #158 <Method int MapsViewState.ordinal()>
	//* 213  489:bipush          8
	//* 214  491:iastore         
	//* 215  492:getstatic       #153 <Field int[] a>
	//* 216  495:getstatic       #182 <Field MapsViewState MapsViewState.MapDirty>
	//* 217  498:invokevirtual   #158 <Method int MapsViewState.ordinal()>
	//* 218  501:bipush          9
	//* 219  503:iastore         
	//* 220  504:getstatic       #153 <Field int[] a>
	//* 221  507:getstatic       #185 <Field MapsViewState MapsViewState.RegionNameAlreadyInUse>
	//* 222  510:invokevirtual   #158 <Method int MapsViewState.ordinal()>
	//* 223  513:bipush          10
	//* 224  515:iastore         
	//* 225  516:getstatic       #153 <Field int[] a>
	//* 226  519:getstatic       #188 <Field MapsViewState MapsViewState.DebugInfo>
	//* 227  522:invokevirtual   #158 <Method int MapsViewState.ordinal()>
	//* 228  525:bipush          11
	//* 229  527:iastore         
	//* 230  528:getstatic       #153 <Field int[] a>
	//* 231  531:getstatic       #191 <Field MapsViewState MapsViewState.UpdateViewTitle>
	//* 232  534:invokevirtual   #158 <Method int MapsViewState.ordinal()>
	//* 233  537:bipush          12
	//* 234  539:iastore         
	//* 235  540:getstatic       #153 <Field int[] a>
	//* 236  543:getstatic       #194 <Field MapsViewState MapsViewState.MapZoomReset>
	//* 237  546:invokevirtual   #158 <Method int MapsViewState.ordinal()>
	//* 238  549:bipush          13
	//* 239  551:iastore         
	//* 240  552:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//  241  553:astore_0        
		try
		{
			e[TitleSpecifier.Naming.ordinal()] = 2;
		}
	//* 242  554:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//  243  557:astore_0        
		try
		{
			e[TitleSpecifier.PlaceholderMapName.ordinal()] = 3;
		}
	//* 244  558:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//  245  561:astore_0        
		try
		{
			e[TitleSpecifier.MapName.ordinal()] = 4;
		}
	//* 246  562:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//  247  565:astore_0        
		try
		{
			e[TitleSpecifier.DoorEdit.ordinal()] = 5;
		}
	//* 248  566:goto            53
		catch(NoSuchFieldError nosuchfielderror4) { }
	//  249  569:astore_0        
		try
		{
			e[TitleSpecifier.Labeling.ordinal()] = 6;
		}
	//* 250  570:goto            64
		catch(NoSuchFieldError nosuchfielderror5) { }
	//  251  573:astore_0        
		try
		{
			e[TitleSpecifier.ReLabeling.ordinal()] = 7;
		}
	//* 252  574:goto            76
		catch(NoSuchFieldError nosuchfielderror6) { }
	//  253  577:astore_0        
		try
		{
			e[TitleSpecifier.NoMap.ordinal()] = 8;
		}
	//* 254  578:goto            88
		catch(NoSuchFieldError nosuchfielderror7) { }
	//  255  581:astore_0        
		d = new int[MapCustomizationViewState.values().length];
		try
		{
			d[MapCustomizationViewState.Loading.ordinal()] = 1;
		}
	//* 256  582:goto            100
		catch(NoSuchFieldError nosuchfielderror8) { }
	//  257  585:astore_0        
		try
		{
			d[MapCustomizationViewState.Saving.ordinal()] = 2;
		}
	//* 258  586:goto            120
		catch(NoSuchFieldError nosuchfielderror9) { }
	//  259  589:astore_0        
		try
		{
			d[MapCustomizationViewState.StillLearningMapPreview.ordinal()] = 3;
		}
	//* 260  590:goto            131
		catch(NoSuchFieldError nosuchfielderror10) { }
	//  261  593:astore_0        
		try
		{
			d[MapCustomizationViewState.SetupMapPreview.ordinal()] = 4;
		}
	//* 262  594:goto            142
		catch(NoSuchFieldError nosuchfielderror11) { }
	//  263  597:astore_0        
		try
		{
			d[MapCustomizationViewState.PendingNameMap.ordinal()] = 5;
		}
	//* 264  598:goto            153
		catch(NoSuchFieldError nosuchfielderror12) { }
	//  265  601:astore_0        
		try
		{
			d[MapCustomizationViewState.FullyLabeledMapPreview.ordinal()] = 6;
		}
	//* 266  602:goto            164
		catch(NoSuchFieldError nosuchfielderror13) { }
	//  267  605:astore_0        
		try
		{
			d[MapCustomizationViewState.LabelingRoomSelection.ordinal()] = 7;
		}
	//* 268  606:goto            176
		catch(NoSuchFieldError nosuchfielderror14) { }
	//  269  609:astore_0        
		try
		{
			d[MapCustomizationViewState.Labeling.ordinal()] = 8;
		}
	//* 270  610:goto            188
		catch(NoSuchFieldError nosuchfielderror15) { }
	//  271  613:astore_0        
		try
		{
			d[MapCustomizationViewState.LabelingHasPendingSave.ordinal()] = 9;
		}
	//* 272  614:goto            200
		catch(NoSuchFieldError nosuchfielderror16) { }
	//  273  617:astore_0        
		try
		{
			d[MapCustomizationViewState.DoorEdit.ordinal()] = 10;
		}
	//* 274  618:goto            212
		catch(NoSuchFieldError nosuchfielderror17) { }
	//  275  621:astore_0        
		try
		{
			d[MapCustomizationViewState.KeepOutZoneAdd.ordinal()] = 11;
		}
	//* 276  622:goto            224
		catch(NoSuchFieldError nosuchfielderror18) { }
	//  277  625:astore_0        
		try
		{
			d[MapCustomizationViewState.KeepOutZoneEdit.ordinal()] = 12;
		}
	//* 278  626:goto            236
		catch(NoSuchFieldError nosuchfielderror19) { }
	//  279  629:astore_0        
		try
		{
			d[MapCustomizationViewState.KeepOutZoneSelected.ordinal()] = 13;
		}
	//* 280  630:goto            248
		catch(NoSuchFieldError nosuchfielderror20) { }
	//  281  633:astore_0        
		try
		{
			d[MapCustomizationViewState.DoorEditHasPendingValidSave.ordinal()] = 14;
		}
	//* 282  634:goto            260
		catch(NoSuchFieldError nosuchfielderror21) { }
	//  283  637:astore_0        
		try
		{
			d[MapCustomizationViewState.DoorEditHasPendingInvalidSave.ordinal()] = 15;
		}
	//* 284  638:goto            272
		catch(NoSuchFieldError nosuchfielderror22) { }
	//  285  641:astore_0        
		try
		{
			d[MapCustomizationViewState.SetupComplete.ordinal()] = 16;
		}
	//* 286  642:goto            284
		catch(NoSuchFieldError nosuchfielderror23) { }
	//  287  645:astore_0        
		c = new int[MapCustomizationErrors.values().length];
		try
		{
			c[MapCustomizationErrors.KozOverDock.ordinal()] = 1;
		}
	//* 288  646:goto            296
		catch(NoSuchFieldError nosuchfielderror24) { }
	//  289  649:astore_0        
		try
		{
			c[MapCustomizationErrors.RoomTooSmall.ordinal()] = 2;
		}
	//* 290  650:goto            316
		catch(NoSuchFieldError nosuchfielderror25) { }
	//  291  653:astore_0        
		try
		{
			c[MapCustomizationErrors.SaveTimedOut.ordinal()] = 3;
		}
	//* 292  654:goto            327
		catch(NoSuchFieldError nosuchfielderror26) { }
	//  293  657:astore_0        
		try
		{
			c[MapCustomizationErrors.SaveFloorNameTimedOut.ordinal()] = 4;
		}
	//* 294  658:goto            338
		catch(NoSuchFieldError nosuchfielderror27) { }
	//  295  661:astore_0        
		try
		{
			c[MapCustomizationErrors.EmptyMap.ordinal()] = 5;
		}
	//* 296  662:goto            349
		catch(NoSuchFieldError nosuchfielderror28) { }
	//  297  665:astore_0        
		try
		{
			c[MapCustomizationErrors.SegmentationTransferFailed.ordinal()] = 6;
		}
	//* 298  666:goto            360
		catch(NoSuchFieldError nosuchfielderror29) { }
	//  299  669:astore_0        
		b = new int[ScheduleDataState.values().length];
		try
		{
			b[ScheduleDataState.CheckIfSchedulesContainsMapId.ordinal()] = 1;
		}
	//* 300  670:goto            372
		catch(NoSuchFieldError nosuchfielderror30) { }
	//  301  673:astore_0        
		a = new int[MapsViewState.values().length];
		try
		{
			a[MapsViewState.RegionSelectedToLabel.ordinal()] = 1;
		}
	//* 302  674:goto            392
		catch(NoSuchFieldError nosuchfielderror31) { }
	//  303  677:astore_0        
		try
		{
			a[MapsViewState.NoRegionSelectedToLabel.ordinal()] = 2;
		}
	//* 304  678:goto            412
		catch(NoSuchFieldError nosuchfielderror32) { }
	//  305  681:astore_0        
		try
		{
			a[MapsViewState.CustomizationViewState.ordinal()] = 3;
		}
	//* 306  682:goto            423
		catch(NoSuchFieldError nosuchfielderror33) { }
	//  307  685:astore_0        
		try
		{
			a[MapsViewState.ShowCustomizationOptionMenu.ordinal()] = 4;
		}
	//* 308  686:goto            434
		catch(NoSuchFieldError nosuchfielderror34) { }
	//  309  689:astore_0        
		try
		{
			a[MapsViewState.ShowCustomizationErrorMessage.ordinal()] = 5;
		}
	//* 310  690:goto            445
		catch(NoSuchFieldError nosuchfielderror35) { }
	//  311  693:astore_0        
		try
		{
			a[MapsViewState.ShowCustomizedMapName.ordinal()] = 6;
		}
	//* 312  694:goto            456
		catch(NoSuchFieldError nosuchfielderror36) { }
	//  313  697:astore_0        
		try
		{
			a[MapsViewState.ShowEnterMapNameDialog.ordinal()] = 7;
		}
	//* 314  698:goto            468
		catch(NoSuchFieldError nosuchfielderror37) { }
	//  315  701:astore_0        
		try
		{
			a[MapsViewState.ShowUnlabeledRegionCount.ordinal()] = 8;
		}
	//* 316  702:goto            480
		catch(NoSuchFieldError nosuchfielderror38) { }
	//  317  705:astore_0        
		try
		{
			a[MapsViewState.MapDirty.ordinal()] = 9;
		}
	//* 318  706:goto            492
		catch(NoSuchFieldError nosuchfielderror39) { }
	//  319  709:astore_0        
		try
		{
			a[MapsViewState.RegionNameAlreadyInUse.ordinal()] = 10;
		}
	//* 320  710:goto            504
		catch(NoSuchFieldError nosuchfielderror40) { }
	//  321  713:astore_0        
		try
		{
			a[MapsViewState.DebugInfo.ordinal()] = 11;
		}
	//* 322  714:goto            516
		catch(NoSuchFieldError nosuchfielderror41) { }
	//  323  717:astore_0        
		try
		{
			a[MapsViewState.UpdateViewTitle.ordinal()] = 12;
		}
	//* 324  718:goto            528
		catch(NoSuchFieldError nosuchfielderror42) { }
	//  325  721:astore_0        
		try
		{
			a[MapsViewState.MapZoomReset.ordinal()] = 13;
		}
	//* 326  722:goto            540
		catch(NoSuchFieldError nosuchfielderror43) { }
	//  327  725:astore_0        
	//* 328  726:return          
	}
}
