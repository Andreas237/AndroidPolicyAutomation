// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import com.irobot.core.*;

// Referenced classes of package com.irobot.home.fragments:
//			be

static class be$5
{

	static final int a[];
	static final int b[];
	static final int c[];
	static final int d[];
	static final int e[];
	static final int f[];
	static final int g[];
	static final int h[];
	static final int i[];
	static final int j[];
	static final int k[];

	static 
	{
		k = new int[SettingType.values().length];
	//    0    0:invokestatic    #28  <Method SettingType[] SettingType.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #30  <Field int[] k>
		try
		{
			k[SettingType.Schedule.ordinal()] = 1;
	//    4    9:getstatic       #30  <Field int[] k>
	//    5   12:getstatic       #34  <Field SettingType SettingType.Schedule>
	//    6   15:invokevirtual   #38  <Method int SettingType.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #30  <Field int[] k>
	//*  10   23:getstatic       #41  <Field SettingType SettingType.MapUploadAllowed>
	//*  11   26:invokevirtual   #38  <Method int SettingType.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #30  <Field int[] k>
	//*  15   34:getstatic       #44  <Field SettingType SettingType.PMapLearningAllowed>
	//*  16   37:invokevirtual   #38  <Method int SettingType.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:invokestatic    #49  <Method MapsDataState[] MapsDataState.values()>
	//*  20   45:arraylength     
	//*  21   46:newarray        int[]
	//*  22   48:putstatic       #51  <Field int[] j>
	//*  23   51:getstatic       #51  <Field int[] j>
	//*  24   54:getstatic       #55  <Field MapsDataState MapsDataState.MapReadyForSetUp>
	//*  25   57:invokevirtual   #56  <Method int MapsDataState.ordinal()>
	//*  26   60:iconst_1        
	//*  27   61:iastore         
	//*  28   62:invokestatic    #61  <Method MapsViewState[] MapsViewState.values()>
	//*  29   65:arraylength     
	//*  30   66:newarray        int[]
	//*  31   68:putstatic       #63  <Field int[] i>
	//*  32   71:getstatic       #63  <Field int[] i>
	//*  33   74:getstatic       #67  <Field MapsViewState MapsViewState.FloorPlanListItem>
	//*  34   77:invokevirtual   #68  <Method int MapsViewState.ordinal()>
	//*  35   80:iconst_1        
	//*  36   81:iastore         
	//*  37   82:getstatic       #63  <Field int[] i>
	//*  38   85:getstatic       #71  <Field MapsViewState MapsViewState.FloorPlanBooleanValue>
	//*  39   88:invokevirtual   #68  <Method int MapsViewState.ordinal()>
	//*  40   91:iconst_2        
	//*  41   92:iastore         
	//*  42   93:getstatic       #63  <Field int[] i>
	//*  43   96:getstatic       #74  <Field MapsViewState MapsViewState.FloorPlanItemNotFound>
	//*  44   99:invokevirtual   #68  <Method int MapsViewState.ordinal()>
	//*  45  102:iconst_3        
	//*  46  103:iastore         
	//*  47  104:invokestatic    #79  <Method EvacuationDockMode[] EvacuationDockMode.values()>
	//*  48  107:arraylength     
	//*  49  108:newarray        int[]
	//*  50  110:putstatic       #81  <Field int[] h>
	//*  51  113:getstatic       #81  <Field int[] h>
	//*  52  116:getstatic       #85  <Field EvacuationDockMode EvacuationDockMode.Invalid>
	//*  53  119:invokevirtual   #86  <Method int EvacuationDockMode.ordinal()>
	//*  54  122:iconst_1        
	//*  55  123:iastore         
	//*  56  124:getstatic       #81  <Field int[] h>
	//*  57  127:getstatic       #89  <Field EvacuationDockMode EvacuationDockMode.Ready>
	//*  58  130:invokevirtual   #86  <Method int EvacuationDockMode.ordinal()>
	//*  59  133:iconst_2        
	//*  60  134:iastore         
	//*  61  135:getstatic       #81  <Field int[] h>
	//*  62  138:getstatic       #92  <Field EvacuationDockMode EvacuationDockMode.EvacuationStarting>
	//*  63  141:invokevirtual   #86  <Method int EvacuationDockMode.ordinal()>
	//*  64  144:iconst_3        
	//*  65  145:iastore         
	//*  66  146:getstatic       #81  <Field int[] h>
	//*  67  149:getstatic       #95  <Field EvacuationDockMode EvacuationDockMode.EvacuationInProgress>
	//*  68  152:invokevirtual   #86  <Method int EvacuationDockMode.ordinal()>
	//*  69  155:iconst_4        
	//*  70  156:iastore         
	//*  71  157:getstatic       #81  <Field int[] h>
	//*  72  160:getstatic       #98  <Field EvacuationDockMode EvacuationDockMode.Error>
	//*  73  163:invokevirtual   #86  <Method int EvacuationDockMode.ordinal()>
	//*  74  166:iconst_5        
	//*  75  167:iastore         
	//*  76  168:getstatic       #81  <Field int[] h>
	//*  77  171:getstatic       #101 <Field EvacuationDockMode EvacuationDockMode.BagFull>
	//*  78  174:invokevirtual   #86  <Method int EvacuationDockMode.ordinal()>
	//*  79  177:bipush          6
	//*  80  179:iastore         
	//*  81  180:getstatic       #81  <Field int[] h>
	//*  82  183:getstatic       #104 <Field EvacuationDockMode EvacuationDockMode.Clogged>
	//*  83  186:invokevirtual   #86  <Method int EvacuationDockMode.ordinal()>
	//*  84  189:bipush          7
	//*  85  191:iastore         
	//*  86  192:getstatic       #81  <Field int[] h>
	//*  87  195:getstatic       #107 <Field EvacuationDockMode EvacuationDockMode.BinMissing>
	//*  88  198:invokevirtual   #86  <Method int EvacuationDockMode.ordinal()>
	//*  89  201:bipush          8
	//*  90  203:iastore         
	//*  91  204:invokestatic    #112 <Method ResolvedMissionStatus[] ResolvedMissionStatus.values()>
	//*  92  207:arraylength     
	//*  93  208:newarray        int[]
	//*  94  210:putstatic       #114 <Field int[] g>
	//*  95  213:getstatic       #114 <Field int[] g>
	//*  96  216:getstatic       #118 <Field ResolvedMissionStatus ResolvedMissionStatus.ReadyChooseCleanType>
	//*  97  219:invokevirtual   #119 <Method int ResolvedMissionStatus.ordinal()>
	//*  98  222:iconst_1        
	//*  99  223:iastore         
	//* 100  224:invokestatic    #124 <Method CurrentConnectionState[] CurrentConnectionState.values()>
	//* 101  227:arraylength     
	//* 102  228:newarray        int[]
	//* 103  230:putstatic       #126 <Field int[] f>
	//* 104  233:getstatic       #126 <Field int[] f>
	//* 105  236:getstatic       #130 <Field CurrentConnectionState CurrentConnectionState.Disconnected>
	//* 106  239:invokevirtual   #131 <Method int CurrentConnectionState.ordinal()>
	//* 107  242:iconst_1        
	//* 108  243:iastore         
	//* 109  244:getstatic       #126 <Field int[] f>
	//* 110  247:getstatic       #133 <Field CurrentConnectionState CurrentConnectionState.Error>
	//* 111  250:invokevirtual   #131 <Method int CurrentConnectionState.ordinal()>
	//* 112  253:iconst_2        
	//* 113  254:iastore         
	//* 114  255:getstatic       #126 <Field int[] f>
	//* 115  258:getstatic       #136 <Field CurrentConnectionState CurrentConnectionState.ConnectedLocally>
	//* 116  261:invokevirtual   #131 <Method int CurrentConnectionState.ordinal()>
	//* 117  264:iconst_3        
	//* 118  265:iastore         
	//* 119  266:getstatic       #126 <Field int[] f>
	//* 120  269:getstatic       #139 <Field CurrentConnectionState CurrentConnectionState.RemoteMissing>
	//* 121  272:invokevirtual   #131 <Method int CurrentConnectionState.ordinal()>
	//* 122  275:iconst_4        
	//* 123  276:iastore         
	//* 124  277:invokestatic    #144 <Method NetworkState[] NetworkState.values()>
	//* 125  280:arraylength     
	//* 126  281:newarray        int[]
	//* 127  283:putstatic       #146 <Field int[] e>
	//* 128  286:getstatic       #146 <Field int[] e>
	//* 129  289:getstatic       #150 <Field NetworkState NetworkState.Connecting>
	//* 130  292:invokevirtual   #151 <Method int NetworkState.ordinal()>
	//* 131  295:iconst_1        
	//* 132  296:iastore         
	//* 133  297:getstatic       #146 <Field int[] e>
	//* 134  300:getstatic       #154 <Field NetworkState NetworkState.Connected>
	//* 135  303:invokevirtual   #151 <Method int NetworkState.ordinal()>
	//* 136  306:iconst_2        
	//* 137  307:iastore         
	//* 138  308:getstatic       #146 <Field int[] e>
	//* 139  311:getstatic       #156 <Field NetworkState NetworkState.Disconnected>
	//* 140  314:invokevirtual   #151 <Method int NetworkState.ordinal()>
	//* 141  317:iconst_3        
	//* 142  318:iastore         
	//* 143  319:getstatic       #146 <Field int[] e>
	//* 144  322:getstatic       #158 <Field NetworkState NetworkState.Invalid>
	//* 145  325:invokevirtual   #151 <Method int NetworkState.ordinal()>
	//* 146  328:iconst_4        
	//* 147  329:iastore         
	//* 148  330:getstatic       #146 <Field int[] e>
	//* 149  333:getstatic       #160 <Field NetworkState NetworkState.Error>
	//* 150  336:invokevirtual   #151 <Method int NetworkState.ordinal()>
	//* 151  339:iconst_5        
	//* 152  340:iastore         
	//* 153  341:invokestatic    #165 <Method NetworkSessionType[] NetworkSessionType.values()>
	//* 154  344:arraylength     
	//* 155  345:newarray        int[]
	//* 156  347:putstatic       #167 <Field int[] d>
	//* 157  350:getstatic       #167 <Field int[] d>
	//* 158  353:getstatic       #171 <Field NetworkSessionType NetworkSessionType.LocalSecureSocket>
	//* 159  356:invokevirtual   #172 <Method int NetworkSessionType.ordinal()>
	//* 160  359:iconst_1        
	//* 161  360:iastore         
	//* 162  361:getstatic       #167 <Field int[] d>
	//* 163  364:getstatic       #175 <Field NetworkSessionType NetworkSessionType.AwsIoTService>
	//* 164  367:invokevirtual   #172 <Method int NetworkSessionType.ordinal()>
	//* 165  370:iconst_2        
	//* 166  371:iastore         
	//* 167  372:getstatic       #167 <Field int[] d>
	//* 168  375:getstatic       #178 <Field NetworkSessionType NetworkSessionType.AwsApiGateway>
	//* 169  378:invokevirtual   #172 <Method int NetworkSessionType.ordinal()>
	//* 170  381:iconst_3        
	//* 171  382:iastore         
	//* 172  383:invokestatic    #183 <Method ScheduleTypeSupported[] ScheduleTypeSupported.values()>
	//* 173  386:arraylength     
	//* 174  387:newarray        int[]
	//* 175  389:putstatic       #185 <Field int[] c>
	//* 176  392:getstatic       #185 <Field int[] c>
	//* 177  395:getstatic       #189 <Field ScheduleTypeSupported ScheduleTypeSupported.OnceDaily>
	//* 178  398:invokevirtual   #190 <Method int ScheduleTypeSupported.ordinal()>
	//* 179  401:iconst_1        
	//* 180  402:iastore         
	//* 181  403:getstatic       #185 <Field int[] c>
	//* 182  406:getstatic       #193 <Field ScheduleTypeSupported ScheduleTypeSupported.Multiple>
	//* 183  409:invokevirtual   #190 <Method int ScheduleTypeSupported.ordinal()>
	//* 184  412:iconst_2        
	//* 185  413:iastore         
	//* 186  414:invokestatic    #198 <Method OTAUIServiceDataState[] OTAUIServiceDataState.values()>
	//* 187  417:arraylength     
	//* 188  418:newarray        int[]
	//* 189  420:putstatic       #200 <Field int[] b>
	//* 190  423:getstatic       #200 <Field int[] b>
	//* 191  426:getstatic       #204 <Field OTAUIServiceDataState OTAUIServiceDataState.ExpeditedOTAStatus>
	//* 192  429:invokevirtual   #205 <Method int OTAUIServiceDataState.ordinal()>
	//* 193  432:iconst_1        
	//* 194  433:iastore         
	//* 195  434:getstatic       #200 <Field int[] b>
	//* 196  437:getstatic       #208 <Field OTAUIServiceDataState OTAUIServiceDataState.SoftwareUpdateStatus>
	//* 197  440:invokevirtual   #205 <Method int OTAUIServiceDataState.ordinal()>
	//* 198  443:iconst_2        
	//* 199  444:iastore         
	//* 200  445:invokestatic    #213 <Method MissionDataState[] MissionDataState.values()>
	//* 201  448:arraylength     
	//* 202  449:newarray        int[]
	//* 203  451:putstatic       #215 <Field int[] a>
	//* 204  454:getstatic       #215 <Field int[] a>
	//* 205  457:getstatic       #219 <Field MissionDataState MissionDataState.EvacDockMode>
	//* 206  460:invokevirtual   #220 <Method int MissionDataState.ordinal()>
	//* 207  463:iconst_1        
	//* 208  464:iastore         
	//* 209  465:getstatic       #215 <Field int[] a>
	//* 210  468:getstatic       #223 <Field MissionDataState MissionDataState.EvacDockTour>
	//* 211  471:invokevirtual   #220 <Method int MissionDataState.ordinal()>
	//* 212  474:iconst_2        
	//* 213  475:iastore         
	//* 214  476:getstatic       #215 <Field int[] a>
	//* 215  479:getstatic       #226 <Field MissionDataState MissionDataState.EvacHelpContentId>
	//* 216  482:invokevirtual   #220 <Method int MissionDataState.ordinal()>
	//* 217  485:iconst_3        
	//* 218  486:iastore         
	//* 219  487:getstatic       #215 <Field int[] a>
	//* 220  490:getstatic       #229 <Field MissionDataState MissionDataState.EvacStatusMessage>
	//* 221  493:invokevirtual   #220 <Method int MissionDataState.ordinal()>
	//* 222  496:iconst_4        
	//* 223  497:iastore         
	//* 224  498:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//  225  499:astore_0        
		try
		{
			k[SettingType.MapUploadAllowed.ordinal()] = 2;
		}
	//* 226  500:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//  227  503:astore_0        
		try
		{
			k[SettingType.PMapLearningAllowed.ordinal()] = 3;
		}
	//* 228  504:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//  229  507:astore_0        
		j = new int[MapsDataState.values().length];
		try
		{
			j[MapsDataState.MapReadyForSetUp.ordinal()] = 1;
		}
	//* 230  508:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//  231  511:astore_0        
		i = new int[MapsViewState.values().length];
		try
		{
			i[MapsViewState.FloorPlanListItem.ordinal()] = 1;
		}
	//* 232  512:goto            62
		catch(NoSuchFieldError nosuchfielderror4) { }
	//  233  515:astore_0        
		try
		{
			i[MapsViewState.FloorPlanBooleanValue.ordinal()] = 2;
		}
	//* 234  516:goto            82
		catch(NoSuchFieldError nosuchfielderror5) { }
	//  235  519:astore_0        
		try
		{
			i[MapsViewState.FloorPlanItemNotFound.ordinal()] = 3;
		}
	//* 236  520:goto            93
		catch(NoSuchFieldError nosuchfielderror6) { }
	//  237  523:astore_0        
		h = new int[EvacuationDockMode.values().length];
		try
		{
			h[EvacuationDockMode.Invalid.ordinal()] = 1;
		}
	//* 238  524:goto            104
		catch(NoSuchFieldError nosuchfielderror7) { }
	//  239  527:astore_0        
		try
		{
			h[EvacuationDockMode.Ready.ordinal()] = 2;
		}
	//* 240  528:goto            124
		catch(NoSuchFieldError nosuchfielderror8) { }
	//  241  531:astore_0        
		try
		{
			h[EvacuationDockMode.EvacuationStarting.ordinal()] = 3;
		}
	//* 242  532:goto            135
		catch(NoSuchFieldError nosuchfielderror9) { }
	//  243  535:astore_0        
		try
		{
			h[EvacuationDockMode.EvacuationInProgress.ordinal()] = 4;
		}
	//* 244  536:goto            146
		catch(NoSuchFieldError nosuchfielderror10) { }
	//  245  539:astore_0        
		try
		{
			h[EvacuationDockMode.Error.ordinal()] = 5;
		}
	//* 246  540:goto            157
		catch(NoSuchFieldError nosuchfielderror11) { }
	//  247  543:astore_0        
		try
		{
			h[EvacuationDockMode.BagFull.ordinal()] = 6;
		}
	//* 248  544:goto            168
		catch(NoSuchFieldError nosuchfielderror12) { }
	//  249  547:astore_0        
		try
		{
			h[EvacuationDockMode.Clogged.ordinal()] = 7;
		}
	//* 250  548:goto            180
		catch(NoSuchFieldError nosuchfielderror13) { }
	//  251  551:astore_0        
		try
		{
			h[EvacuationDockMode.BinMissing.ordinal()] = 8;
		}
	//* 252  552:goto            192
		catch(NoSuchFieldError nosuchfielderror14) { }
	//  253  555:astore_0        
		g = new int[ResolvedMissionStatus.values().length];
		try
		{
			g[ResolvedMissionStatus.ReadyChooseCleanType.ordinal()] = 1;
		}
	//* 254  556:goto            204
		catch(NoSuchFieldError nosuchfielderror15) { }
	//  255  559:astore_0        
		f = new int[CurrentConnectionState.values().length];
		try
		{
			f[CurrentConnectionState.Disconnected.ordinal()] = 1;
		}
	//* 256  560:goto            224
		catch(NoSuchFieldError nosuchfielderror16) { }
	//  257  563:astore_0        
		try
		{
			f[CurrentConnectionState.Error.ordinal()] = 2;
		}
	//* 258  564:goto            244
		catch(NoSuchFieldError nosuchfielderror17) { }
	//  259  567:astore_0        
		try
		{
			f[CurrentConnectionState.ConnectedLocally.ordinal()] = 3;
		}
	//* 260  568:goto            255
		catch(NoSuchFieldError nosuchfielderror18) { }
	//  261  571:astore_0        
		try
		{
			f[CurrentConnectionState.RemoteMissing.ordinal()] = 4;
		}
	//* 262  572:goto            266
		catch(NoSuchFieldError nosuchfielderror19) { }
	//  263  575:astore_0        
		e = new int[NetworkState.values().length];
		try
		{
			e[NetworkState.Connecting.ordinal()] = 1;
		}
	//* 264  576:goto            277
		catch(NoSuchFieldError nosuchfielderror20) { }
	//  265  579:astore_0        
		try
		{
			e[NetworkState.Connected.ordinal()] = 2;
		}
	//* 266  580:goto            297
		catch(NoSuchFieldError nosuchfielderror21) { }
	//  267  583:astore_0        
		try
		{
			e[NetworkState.Disconnected.ordinal()] = 3;
		}
	//* 268  584:goto            308
		catch(NoSuchFieldError nosuchfielderror22) { }
	//  269  587:astore_0        
		try
		{
			e[NetworkState.Invalid.ordinal()] = 4;
		}
	//* 270  588:goto            319
		catch(NoSuchFieldError nosuchfielderror23) { }
	//  271  591:astore_0        
		try
		{
			e[NetworkState.Error.ordinal()] = 5;
		}
	//* 272  592:goto            330
		catch(NoSuchFieldError nosuchfielderror24) { }
	//  273  595:astore_0        
		d = new int[NetworkSessionType.values().length];
		try
		{
			d[NetworkSessionType.LocalSecureSocket.ordinal()] = 1;
		}
	//* 274  596:goto            341
		catch(NoSuchFieldError nosuchfielderror25) { }
	//  275  599:astore_0        
		try
		{
			d[NetworkSessionType.AwsIoTService.ordinal()] = 2;
		}
	//* 276  600:goto            361
		catch(NoSuchFieldError nosuchfielderror26) { }
	//  277  603:astore_0        
		try
		{
			d[NetworkSessionType.AwsApiGateway.ordinal()] = 3;
		}
	//* 278  604:goto            372
		catch(NoSuchFieldError nosuchfielderror27) { }
	//  279  607:astore_0        
		c = new int[ScheduleTypeSupported.values().length];
		try
		{
			c[ScheduleTypeSupported.OnceDaily.ordinal()] = 1;
		}
	//* 280  608:goto            383
		catch(NoSuchFieldError nosuchfielderror28) { }
	//  281  611:astore_0        
		try
		{
			c[ScheduleTypeSupported.Multiple.ordinal()] = 2;
		}
	//* 282  612:goto            403
		catch(NoSuchFieldError nosuchfielderror29) { }
	//  283  615:astore_0        
		b = new int[OTAUIServiceDataState.values().length];
		try
		{
			b[OTAUIServiceDataState.ExpeditedOTAStatus.ordinal()] = 1;
		}
	//* 284  616:goto            414
		catch(NoSuchFieldError nosuchfielderror30) { }
	//  285  619:astore_0        
		try
		{
			b[OTAUIServiceDataState.SoftwareUpdateStatus.ordinal()] = 2;
		}
	//* 286  620:goto            434
		catch(NoSuchFieldError nosuchfielderror31) { }
	//  287  623:astore_0        
		a = new int[MissionDataState.values().length];
		try
		{
			a[MissionDataState.EvacDockMode.ordinal()] = 1;
		}
	//* 288  624:goto            445
		catch(NoSuchFieldError nosuchfielderror32) { }
	//  289  627:astore_0        
		try
		{
			a[MissionDataState.EvacDockTour.ordinal()] = 2;
		}
	//* 290  628:goto            465
		catch(NoSuchFieldError nosuchfielderror33) { }
	//  291  631:astore_0        
		try
		{
			a[MissionDataState.EvacHelpContentId.ordinal()] = 3;
		}
	//* 292  632:goto            476
		catch(NoSuchFieldError nosuchfielderror34) { }
	//  293  635:astore_0        
		try
		{
			a[MissionDataState.EvacStatusMessage.ordinal()] = 4;
		}
	//* 294  636:goto            487
		catch(NoSuchFieldError nosuchfielderror35) { }
	//  295  639:astore_0        
	//* 296  640:return          
	}
}
