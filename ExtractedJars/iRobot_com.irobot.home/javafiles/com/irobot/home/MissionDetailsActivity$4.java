// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;

// Referenced classes of package com.irobot.home:
//			MissionDetailsActivity

static class MissionDetailsActivity$4
{

	static final int a[];
	static final int b[];
	static final int c[];
	static final int d[];
	static final int e[];
	static final int f[];

	static 
	{
		f = new int[RobotRankOverlap.values().length];
	//    0    0:invokestatic    #23  <Method RobotRankOverlap[] RobotRankOverlap.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #25  <Field int[] f>
		try
		{
			f[RobotRankOverlap.DeepClean.ordinal()] = 1;
	//    4    9:getstatic       #25  <Field int[] f>
	//    5   12:getstatic       #29  <Field RobotRankOverlap RobotRankOverlap.DeepClean>
	//    6   15:invokevirtual   #33  <Method int RobotRankOverlap.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #25  <Field int[] f>
	//*  10   23:getstatic       #36  <Field RobotRankOverlap RobotRankOverlap.ExtendedClean>
	//*  11   26:invokevirtual   #33  <Method int RobotRankOverlap.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #25  <Field int[] f>
	//*  15   34:getstatic       #39  <Field RobotRankOverlap RobotRankOverlap.DetailClean>
	//*  16   37:invokevirtual   #33  <Method int RobotRankOverlap.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:invokestatic    #44  <Method RobotMissionHistoryCompletionStatus[] RobotMissionHistoryCompletionStatus.values()>
	//*  20   45:arraylength     
	//*  21   46:newarray        int[]
	//*  22   48:putstatic       #46  <Field int[] e>
	//*  23   51:getstatic       #46  <Field int[] e>
	//*  24   54:getstatic       #50  <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.Completed>
	//*  25   57:invokevirtual   #51  <Method int RobotMissionHistoryCompletionStatus.ordinal()>
	//*  26   60:iconst_1        
	//*  27   61:iastore         
	//*  28   62:getstatic       #46  <Field int[] e>
	//*  29   65:getstatic       #54  <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.Canceled>
	//*  30   68:invokevirtual   #51  <Method int RobotMissionHistoryCompletionStatus.ordinal()>
	//*  31   71:iconst_2        
	//*  32   72:iastore         
	//*  33   73:getstatic       #46  <Field int[] e>
	//*  34   76:getstatic       #57  <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.None>
	//*  35   79:invokevirtual   #51  <Method int RobotMissionHistoryCompletionStatus.ordinal()>
	//*  36   82:iconst_3        
	//*  37   83:iastore         
	//*  38   84:getstatic       #46  <Field int[] e>
	//*  39   87:getstatic       #60  <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.Full>
	//*  40   90:invokevirtual   #51  <Method int RobotMissionHistoryCompletionStatus.ordinal()>
	//*  41   93:iconst_4        
	//*  42   94:iastore         
	//*  43   95:getstatic       #46  <Field int[] e>
	//*  44   98:getstatic       #63  <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.Empty>
	//*  45  101:invokevirtual   #51  <Method int RobotMissionHistoryCompletionStatus.ordinal()>
	//*  46  104:iconst_5        
	//*  47  105:iastore         
	//*  48  106:getstatic       #46  <Field int[] e>
	//*  49  109:getstatic       #66  <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.Stuck>
	//*  50  112:invokevirtual   #51  <Method int RobotMissionHistoryCompletionStatus.ordinal()>
	//*  51  115:bipush          6
	//*  52  117:iastore         
	//*  53  118:getstatic       #46  <Field int[] e>
	//*  54  121:getstatic       #69  <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.LowBattery>
	//*  55  124:invokevirtual   #51  <Method int RobotMissionHistoryCompletionStatus.ordinal()>
	//*  56  127:bipush          7
	//*  57  129:iastore         
	//*  58  130:getstatic       #46  <Field int[] e>
	//*  59  133:getstatic       #72  <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.ClockError>
	//*  60  136:invokevirtual   #51  <Method int RobotMissionHistoryCompletionStatus.ordinal()>
	//*  61  139:bipush          8
	//*  62  141:iastore         
	//*  63  142:getstatic       #46  <Field int[] e>
	//*  64  145:getstatic       #75  <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.Busy>
	//*  65  148:invokevirtual   #51  <Method int RobotMissionHistoryCompletionStatus.ordinal()>
	//*  66  151:bipush          9
	//*  67  153:iastore         
	//*  68  154:getstatic       #46  <Field int[] e>
	//*  69  157:getstatic       #78  <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.Incomplete>
	//*  70  160:invokevirtual   #51  <Method int RobotMissionHistoryCompletionStatus.ordinal()>
	//*  71  163:bipush          10
	//*  72  165:iastore         
	//*  73  166:invokestatic    #83  <Method MissionDetailsViewState[] MissionDetailsViewState.values()>
	//*  74  169:arraylength     
	//*  75  170:newarray        int[]
	//*  76  172:putstatic       #85  <Field int[] d>
	//*  77  175:getstatic       #85  <Field int[] d>
	//*  78  178:getstatic       #89  <Field MissionDetailsViewState MissionDetailsViewState.Loading>
	//*  79  181:invokevirtual   #90  <Method int MissionDetailsViewState.ordinal()>
	//*  80  184:iconst_1        
	//*  81  185:iastore         
	//*  82  186:getstatic       #85  <Field int[] d>
	//*  83  189:getstatic       #93  <Field MissionDetailsViewState MissionDetailsViewState.MapsNotSupported>
	//*  84  192:invokevirtual   #90  <Method int MissionDetailsViewState.ordinal()>
	//*  85  195:iconst_2        
	//*  86  196:iastore         
	//*  87  197:getstatic       #85  <Field int[] d>
	//*  88  200:getstatic       #96  <Field MissionDetailsViewState MissionDetailsViewState.NoMapAvailable>
	//*  89  203:invokevirtual   #90  <Method int MissionDetailsViewState.ordinal()>
	//*  90  206:iconst_3        
	//*  91  207:iastore         
	//*  92  208:getstatic       #85  <Field int[] d>
	//*  93  211:getstatic       #99  <Field MissionDetailsViewState MissionDetailsViewState.MapsWithFwUpdate>
	//*  94  214:invokevirtual   #90  <Method int MissionDetailsViewState.ordinal()>
	//*  95  217:iconst_4        
	//*  96  218:iastore         
	//*  97  219:getstatic       #85  <Field int[] d>
	//*  98  222:getstatic       #102 <Field MissionDetailsViewState MissionDetailsViewState.PmapsNotAllowed>
	//*  99  225:invokevirtual   #90  <Method int MissionDetailsViewState.ordinal()>
	//* 100  228:iconst_5        
	//* 101  229:iastore         
	//* 102  230:getstatic       #85  <Field int[] d>
	//* 103  233:getstatic       #105 <Field MissionDetailsViewState MissionDetailsViewState.ShowMissionMaps>
	//* 104  236:invokevirtual   #90  <Method int MissionDetailsViewState.ordinal()>
	//* 105  239:bipush          6
	//* 106  241:iastore         
	//* 107  242:getstatic       #85  <Field int[] d>
	//* 108  245:getstatic       #108 <Field MissionDetailsViewState MissionDetailsViewState.FailedToLoadMission>
	//* 109  248:invokevirtual   #90  <Method int MissionDetailsViewState.ordinal()>
	//* 110  251:bipush          7
	//* 111  253:iastore         
	//* 112  254:invokestatic    #113 <Method SettingType[] SettingType.values()>
	//* 113  257:arraylength     
	//* 114  258:newarray        int[]
	//* 115  260:putstatic       #115 <Field int[] c>
	//* 116  263:getstatic       #115 <Field int[] c>
	//* 117  266:getstatic       #119 <Field SettingType SettingType.Name>
	//* 118  269:invokevirtual   #120 <Method int SettingType.ordinal()>
	//* 119  272:iconst_1        
	//* 120  273:iastore         
	//* 121  274:invokestatic    #125 <Method MapsDataState[] MapsDataState.values()>
	//* 122  277:arraylength     
	//* 123  278:newarray        int[]
	//* 124  280:putstatic       #127 <Field int[] b>
	//* 125  283:getstatic       #127 <Field int[] b>
	//* 126  286:getstatic       #131 <Field MapsDataState MapsDataState.MissionDetailsViewState>
	//* 127  289:invokevirtual   #132 <Method int MapsDataState.ordinal()>
	//* 128  292:iconst_1        
	//* 129  293:iastore         
	//* 130  294:getstatic       #127 <Field int[] b>
	//* 131  297:getstatic       #135 <Field MapsDataState MapsDataState.MapCustomizationInfo>
	//* 132  300:invokevirtual   #132 <Method int MapsDataState.ordinal()>
	//* 133  303:iconst_2        
	//* 134  304:iastore         
	//* 135  305:getstatic       #127 <Field int[] b>
	//* 136  308:getstatic       #138 <Field MapsDataState MapsDataState.ErrorMessage>
	//* 137  311:invokevirtual   #132 <Method int MapsDataState.ordinal()>
	//* 138  314:iconst_3        
	//* 139  315:iastore         
	//* 140  316:getstatic       #127 <Field int[] b>
	//* 141  319:getstatic       #141 <Field MapsDataState MapsDataState.RuntimeChart>
	//* 142  322:invokevirtual   #132 <Method int MapsDataState.ordinal()>
	//* 143  325:iconst_4        
	//* 144  326:iastore         
	//* 145  327:getstatic       #127 <Field int[] b>
	//* 146  330:getstatic       #144 <Field MapsDataState MapsDataState.MissionHistoryDetails>
	//* 147  333:invokevirtual   #132 <Method int MapsDataState.ordinal()>
	//* 148  336:iconst_5        
	//* 149  337:iastore         
	//* 150  338:getstatic       #127 <Field int[] b>
	//* 151  341:getstatic       #147 <Field MapsDataState MapsDataState.WifiBadRegions>
	//* 152  344:invokevirtual   #132 <Method int MapsDataState.ordinal()>
	//* 153  347:bipush          6
	//* 154  349:iastore         
	//* 155  350:getstatic       #127 <Field int[] b>
	//* 156  353:getstatic       #150 <Field MapsDataState MapsDataState.WifiColorLegend>
	//* 157  356:invokevirtual   #132 <Method int MapsDataState.ordinal()>
	//* 158  359:bipush          7
	//* 159  361:iastore         
	//* 160  362:getstatic       #127 <Field int[] b>
	//* 161  365:getstatic       #153 <Field MapsDataState MapsDataState.PlaybackProgress>
	//* 162  368:invokevirtual   #132 <Method int MapsDataState.ordinal()>
	//* 163  371:bipush          8
	//* 164  373:iastore         
	//* 165  374:getstatic       #127 <Field int[] b>
	//* 166  377:getstatic       #156 <Field MapsDataState MapsDataState.MissionMapZoomState>
	//* 167  380:invokevirtual   #132 <Method int MapsDataState.ordinal()>
	//* 168  383:bipush          9
	//* 169  385:iastore         
	//* 170  386:invokestatic    #161 <Method MissionMapType[] MissionMapType.values()>
	//* 171  389:arraylength     
	//* 172  390:newarray        int[]
	//* 173  392:putstatic       #163 <Field int[] a>
	//* 174  395:getstatic       #163 <Field int[] a>
	//* 175  398:getstatic       #167 <Field MissionMapType MissionMapType.CleanMission>
	//* 176  401:invokevirtual   #168 <Method int MissionMapType.ordinal()>
	//* 177  404:iconst_1        
	//* 178  405:iastore         
	//* 179  406:getstatic       #163 <Field int[] a>
	//* 180  409:getstatic       #171 <Field MissionMapType MissionMapType.WifiHeat>
	//* 181  412:invokevirtual   #168 <Method int MissionMapType.ordinal()>
	//* 182  415:iconst_2        
	//* 183  416:iastore         
	//* 184  417:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//  185  418:astore_0        
		try
		{
			f[RobotRankOverlap.ExtendedClean.ordinal()] = 2;
		}
	//* 186  419:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//  187  422:astore_0        
		try
		{
			f[RobotRankOverlap.DetailClean.ordinal()] = 3;
		}
	//* 188  423:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//  189  426:astore_0        
		e = new int[RobotMissionHistoryCompletionStatus.values().length];
		try
		{
			e[RobotMissionHistoryCompletionStatus.Completed.ordinal()] = 1;
		}
	//* 190  427:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//  191  430:astore_0        
		try
		{
			e[RobotMissionHistoryCompletionStatus.Canceled.ordinal()] = 2;
		}
	//* 192  431:goto            62
		catch(NoSuchFieldError nosuchfielderror4) { }
	//  193  434:astore_0        
		try
		{
			e[RobotMissionHistoryCompletionStatus.None.ordinal()] = 3;
		}
	//* 194  435:goto            73
		catch(NoSuchFieldError nosuchfielderror5) { }
	//  195  438:astore_0        
		try
		{
			e[RobotMissionHistoryCompletionStatus.Full.ordinal()] = 4;
		}
	//* 196  439:goto            84
		catch(NoSuchFieldError nosuchfielderror6) { }
	//  197  442:astore_0        
		try
		{
			e[RobotMissionHistoryCompletionStatus.Empty.ordinal()] = 5;
		}
	//* 198  443:goto            95
		catch(NoSuchFieldError nosuchfielderror7) { }
	//  199  446:astore_0        
		try
		{
			e[RobotMissionHistoryCompletionStatus.Stuck.ordinal()] = 6;
		}
	//* 200  447:goto            106
		catch(NoSuchFieldError nosuchfielderror8) { }
	//  201  450:astore_0        
		try
		{
			e[RobotMissionHistoryCompletionStatus.LowBattery.ordinal()] = 7;
		}
	//* 202  451:goto            118
		catch(NoSuchFieldError nosuchfielderror9) { }
	//  203  454:astore_0        
		try
		{
			e[RobotMissionHistoryCompletionStatus.ClockError.ordinal()] = 8;
		}
	//* 204  455:goto            130
		catch(NoSuchFieldError nosuchfielderror10) { }
	//  205  458:astore_0        
		try
		{
			e[RobotMissionHistoryCompletionStatus.Busy.ordinal()] = 9;
		}
	//* 206  459:goto            142
		catch(NoSuchFieldError nosuchfielderror11) { }
	//  207  462:astore_0        
		try
		{
			e[RobotMissionHistoryCompletionStatus.Incomplete.ordinal()] = 10;
		}
	//* 208  463:goto            154
		catch(NoSuchFieldError nosuchfielderror12) { }
	//  209  466:astore_0        
		d = new int[MissionDetailsViewState.values().length];
		try
		{
			d[MissionDetailsViewState.Loading.ordinal()] = 1;
		}
	//* 210  467:goto            166
		catch(NoSuchFieldError nosuchfielderror13) { }
	//  211  470:astore_0        
		try
		{
			d[MissionDetailsViewState.MapsNotSupported.ordinal()] = 2;
		}
	//* 212  471:goto            186
		catch(NoSuchFieldError nosuchfielderror14) { }
	//  213  474:astore_0        
		try
		{
			d[MissionDetailsViewState.NoMapAvailable.ordinal()] = 3;
		}
	//* 214  475:goto            197
		catch(NoSuchFieldError nosuchfielderror15) { }
	//  215  478:astore_0        
		try
		{
			d[MissionDetailsViewState.MapsWithFwUpdate.ordinal()] = 4;
		}
	//* 216  479:goto            208
		catch(NoSuchFieldError nosuchfielderror16) { }
	//  217  482:astore_0        
		try
		{
			d[MissionDetailsViewState.PmapsNotAllowed.ordinal()] = 5;
		}
	//* 218  483:goto            219
		catch(NoSuchFieldError nosuchfielderror17) { }
	//  219  486:astore_0        
		try
		{
			d[MissionDetailsViewState.ShowMissionMaps.ordinal()] = 6;
		}
	//* 220  487:goto            230
		catch(NoSuchFieldError nosuchfielderror18) { }
	//  221  490:astore_0        
		try
		{
			d[MissionDetailsViewState.FailedToLoadMission.ordinal()] = 7;
		}
	//* 222  491:goto            242
		catch(NoSuchFieldError nosuchfielderror19) { }
	//  223  494:astore_0        
		c = new int[SettingType.values().length];
		try
		{
			c[SettingType.Name.ordinal()] = 1;
		}
	//* 224  495:goto            254
		catch(NoSuchFieldError nosuchfielderror20) { }
	//  225  498:astore_0        
		b = new int[MapsDataState.values().length];
		try
		{
			b[MapsDataState.MissionDetailsViewState.ordinal()] = 1;
		}
	//* 226  499:goto            274
		catch(NoSuchFieldError nosuchfielderror21) { }
	//  227  502:astore_0        
		try
		{
			b[MapsDataState.MapCustomizationInfo.ordinal()] = 2;
		}
	//* 228  503:goto            294
		catch(NoSuchFieldError nosuchfielderror22) { }
	//  229  506:astore_0        
		try
		{
			b[MapsDataState.ErrorMessage.ordinal()] = 3;
		}
	//* 230  507:goto            305
		catch(NoSuchFieldError nosuchfielderror23) { }
	//  231  510:astore_0        
		try
		{
			b[MapsDataState.RuntimeChart.ordinal()] = 4;
		}
	//* 232  511:goto            316
		catch(NoSuchFieldError nosuchfielderror24) { }
	//  233  514:astore_0        
		try
		{
			b[MapsDataState.MissionHistoryDetails.ordinal()] = 5;
		}
	//* 234  515:goto            327
		catch(NoSuchFieldError nosuchfielderror25) { }
	//  235  518:astore_0        
		try
		{
			b[MapsDataState.WifiBadRegions.ordinal()] = 6;
		}
	//* 236  519:goto            338
		catch(NoSuchFieldError nosuchfielderror26) { }
	//  237  522:astore_0        
		try
		{
			b[MapsDataState.WifiColorLegend.ordinal()] = 7;
		}
	//* 238  523:goto            350
		catch(NoSuchFieldError nosuchfielderror27) { }
	//  239  526:astore_0        
		try
		{
			b[MapsDataState.PlaybackProgress.ordinal()] = 8;
		}
	//* 240  527:goto            362
		catch(NoSuchFieldError nosuchfielderror28) { }
	//  241  530:astore_0        
		try
		{
			b[MapsDataState.MissionMapZoomState.ordinal()] = 9;
		}
	//* 242  531:goto            374
		catch(NoSuchFieldError nosuchfielderror29) { }
	//  243  534:astore_0        
		a = new int[MissionMapType.values().length];
		try
		{
			a[MissionMapType.CleanMission.ordinal()] = 1;
		}
	//* 244  535:goto            386
		catch(NoSuchFieldError nosuchfielderror30) { }
	//  245  538:astore_0        
		try
		{
			a[MissionMapType.WifiHeat.ordinal()] = 2;
		}
	//* 246  539:goto            406
		catch(NoSuchFieldError nosuchfielderror31) { }
	//  247  542:astore_0        
	//* 248  543:return          
	}
}
