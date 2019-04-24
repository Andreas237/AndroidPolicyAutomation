// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;

// Referenced classes of package com.irobot.home:
//			RobotCleanActivity

static class RobotCleanActivity$4
{

	static final int a[];
	static final int b[];
	static final int c[];
	static final int d[];
	static final int e[];

	static 
	{
		e = new int[AssetNetworkUIServiceViewState.values().length];
	//    0    0:invokestatic    #22  <Method AssetNetworkUIServiceViewState[] AssetNetworkUIServiceViewState.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #24  <Field int[] e>
		try
		{
			e[AssetNetworkUIServiceViewState.CurrentConnectionState.ordinal()] = 1;
	//    4    9:getstatic       #24  <Field int[] e>
	//    5   12:getstatic       #28  <Field AssetNetworkUIServiceViewState AssetNetworkUIServiceViewState.CurrentConnectionState>
	//    6   15:invokevirtual   #32  <Method int AssetNetworkUIServiceViewState.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:invokestatic    #37  <Method AssetNetworkUIServiceDataState[] AssetNetworkUIServiceDataState.values()>
	//*  10   23:arraylength     
	//*  11   24:newarray        int[]
	//*  12   26:putstatic       #39  <Field int[] d>
	//*  13   29:getstatic       #39  <Field int[] d>
	//*  14   32:getstatic       #43  <Field AssetNetworkUIServiceDataState AssetNetworkUIServiceDataState.LocalConnectionState>
	//*  15   35:invokevirtual   #44  <Method int AssetNetworkUIServiceDataState.ordinal()>
	//*  16   38:iconst_1        
	//*  17   39:iastore         
	//*  18   40:getstatic       #39  <Field int[] d>
	//*  19   43:getstatic       #47  <Field AssetNetworkUIServiceDataState AssetNetworkUIServiceDataState.RemoteConnectionState>
	//*  20   46:invokevirtual   #44  <Method int AssetNetworkUIServiceDataState.ordinal()>
	//*  21   49:iconst_2        
	//*  22   50:iastore         
	//*  23   51:invokestatic    #52  <Method OnDemandOTAStatus[] OnDemandOTAStatus.values()>
	//*  24   54:arraylength     
	//*  25   55:newarray        int[]
	//*  26   57:putstatic       #54  <Field int[] c>
	//*  27   60:getstatic       #54  <Field int[] c>
	//*  28   63:getstatic       #58  <Field OnDemandOTAStatus OnDemandOTAStatus.ProcessError>
	//*  29   66:invokevirtual   #59  <Method int OnDemandOTAStatus.ordinal()>
	//*  30   69:iconst_1        
	//*  31   70:iastore         
	//*  32   71:getstatic       #54  <Field int[] c>
	//*  33   74:getstatic       #62  <Field OnDemandOTAStatus OnDemandOTAStatus.InProgress>
	//*  34   77:invokevirtual   #59  <Method int OnDemandOTAStatus.ordinal()>
	//*  35   80:iconst_2        
	//*  36   81:iastore         
	//*  37   82:getstatic       #54  <Field int[] c>
	//*  38   85:getstatic       #65  <Field OnDemandOTAStatus OnDemandOTAStatus.Success>
	//*  39   88:invokevirtual   #59  <Method int OnDemandOTAStatus.ordinal()>
	//*  40   91:iconst_3        
	//*  41   92:iastore         
	//*  42   93:getstatic       #54  <Field int[] c>
	//*  43   96:getstatic       #68  <Field OnDemandOTAStatus OnDemandOTAStatus.NotUserInitiated>
	//*  44   99:invokevirtual   #59  <Method int OnDemandOTAStatus.ordinal()>
	//*  45  102:iconst_4        
	//*  46  103:iastore         
	//*  47  104:getstatic       #54  <Field int[] c>
	//*  48  107:getstatic       #71  <Field OnDemandOTAStatus OnDemandOTAStatus.VersionCheckFailure>
	//*  49  110:invokevirtual   #59  <Method int OnDemandOTAStatus.ordinal()>
	//*  50  113:iconst_5        
	//*  51  114:iastore         
	//*  52  115:getstatic       #54  <Field int[] c>
	//*  53  118:getstatic       #74  <Field OnDemandOTAStatus OnDemandOTAStatus.DeploymentStatusCheckTimedOut>
	//*  54  121:invokevirtual   #59  <Method int OnDemandOTAStatus.ordinal()>
	//*  55  124:bipush          6
	//*  56  126:iastore         
	//*  57  127:invokestatic    #79  <Method NetworkDiagnosticRoutines[] NetworkDiagnosticRoutines.values()>
	//*  58  130:arraylength     
	//*  59  131:newarray        int[]
	//*  60  133:putstatic       #81  <Field int[] b>
	//*  61  136:getstatic       #81  <Field int[] b>
	//*  62  139:getstatic       #85  <Field NetworkDiagnosticRoutines NetworkDiagnosticRoutines.InternetConnectivity>
	//*  63  142:invokevirtual   #86  <Method int NetworkDiagnosticRoutines.ordinal()>
	//*  64  145:iconst_1        
	//*  65  146:iastore         
	//*  66  147:getstatic       #81  <Field int[] b>
	//*  67  150:getstatic       #89  <Field NetworkDiagnosticRoutines NetworkDiagnosticRoutines.MQTTPort>
	//*  68  153:invokevirtual   #86  <Method int NetworkDiagnosticRoutines.ordinal()>
	//*  69  156:iconst_2        
	//*  70  157:iastore         
	//*  71  158:invokestatic    #94  <Method MissionDataState[] MissionDataState.values()>
	//*  72  161:arraylength     
	//*  73  162:newarray        int[]
	//*  74  164:putstatic       #96  <Field int[] a>
	//*  75  167:getstatic       #96  <Field int[] a>
	//*  76  170:getstatic       #100 <Field MissionDataState MissionDataState.MissionStatus>
	//*  77  173:invokevirtual   #101 <Method int MissionDataState.ordinal()>
	//*  78  176:iconst_1        
	//*  79  177:iastore         
	//*  80  178:getstatic       #96  <Field int[] a>
	//*  81  181:getstatic       #104 <Field MissionDataState MissionDataState.BatteryLevel>
	//*  82  184:invokevirtual   #101 <Method int MissionDataState.ordinal()>
	//*  83  187:iconst_2        
	//*  84  188:iastore         
	//*  85  189:getstatic       #96  <Field int[] a>
	//*  86  192:getstatic       #107 <Field MissionDataState MissionDataState.Charging>
	//*  87  195:invokevirtual   #101 <Method int MissionDataState.ordinal()>
	//*  88  198:iconst_3        
	//*  89  199:iastore         
	//*  90  200:getstatic       #96  <Field int[] a>
	//*  91  203:getstatic       #110 <Field MissionDataState MissionDataState.Binfull>
	//*  92  206:invokevirtual   #101 <Method int MissionDataState.ordinal()>
	//*  93  209:iconst_4        
	//*  94  210:iastore         
	//*  95  211:getstatic       #96  <Field int[] a>
	//*  96  214:getstatic       #113 <Field MissionDataState MissionDataState.TankLow>
	//*  97  217:invokevirtual   #101 <Method int MissionDataState.ordinal()>
	//*  98  220:iconst_5        
	//*  99  221:iastore         
	//* 100  222:getstatic       #96  <Field int[] a>
	//* 101  225:getstatic       #116 <Field MissionDataState MissionDataState.PauseExpireTime>
	//* 102  228:invokevirtual   #101 <Method int MissionDataState.ordinal()>
	//* 103  231:bipush          6
	//* 104  233:iastore         
	//* 105  234:getstatic       #96  <Field int[] a>
	//* 106  237:getstatic       #119 <Field MissionDataState MissionDataState.PauseResumeTime>
	//* 107  240:invokevirtual   #101 <Method int MissionDataState.ordinal()>
	//* 108  243:bipush          7
	//* 109  245:iastore         
	//* 110  246:getstatic       #96  <Field int[] a>
	//* 111  249:getstatic       #122 <Field MissionDataState MissionDataState.StatusMessage>
	//* 112  252:invokevirtual   #101 <Method int MissionDataState.ordinal()>
	//* 113  255:bipush          8
	//* 114  257:iastore         
	//* 115  258:getstatic       #96  <Field int[] a>
	//* 116  261:getstatic       #125 <Field MissionDataState MissionDataState.HelpContentId>
	//* 117  264:invokevirtual   #101 <Method int MissionDataState.ordinal()>
	//* 118  267:bipush          9
	//* 119  269:iastore         
	//* 120  270:getstatic       #96  <Field int[] a>
	//* 121  273:getstatic       #128 <Field MissionDataState MissionDataState.HelpContentUrl>
	//* 122  276:invokevirtual   #101 <Method int MissionDataState.ordinal()>
	//* 123  279:bipush          10
	//* 124  281:iastore         
	//* 125  282:getstatic       #96  <Field int[] a>
	//* 126  285:getstatic       #131 <Field MissionDataState MissionDataState.Training>
	//* 127  288:invokevirtual   #101 <Method int MissionDataState.ordinal()>
	//* 128  291:bipush          11
	//* 129  293:iastore         
	//* 130  294:getstatic       #96  <Field int[] a>
	//* 131  297:getstatic       #134 <Field MissionDataState MissionDataState.Invalid>
	//* 132  300:invokevirtual   #101 <Method int MissionDataState.ordinal()>
	//* 133  303:bipush          12
	//* 134  305:iastore         
	//* 135  306:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//  136  307:astore_0        
		d = new int[AssetNetworkUIServiceDataState.values().length];
		try
		{
			d[AssetNetworkUIServiceDataState.LocalConnectionState.ordinal()] = 1;
		}
	//* 137  308:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//  138  311:astore_0        
		try
		{
			d[AssetNetworkUIServiceDataState.RemoteConnectionState.ordinal()] = 2;
		}
	//* 139  312:goto            40
		catch(NoSuchFieldError nosuchfielderror2) { }
	//  140  315:astore_0        
		c = new int[OnDemandOTAStatus.values().length];
		try
		{
			c[OnDemandOTAStatus.ProcessError.ordinal()] = 1;
		}
	//* 141  316:goto            51
		catch(NoSuchFieldError nosuchfielderror3) { }
	//  142  319:astore_0        
		try
		{
			c[OnDemandOTAStatus.InProgress.ordinal()] = 2;
		}
	//* 143  320:goto            71
		catch(NoSuchFieldError nosuchfielderror4) { }
	//  144  323:astore_0        
		try
		{
			c[OnDemandOTAStatus.Success.ordinal()] = 3;
		}
	//* 145  324:goto            82
		catch(NoSuchFieldError nosuchfielderror5) { }
	//  146  327:astore_0        
		try
		{
			c[OnDemandOTAStatus.NotUserInitiated.ordinal()] = 4;
		}
	//* 147  328:goto            93
		catch(NoSuchFieldError nosuchfielderror6) { }
	//  148  331:astore_0        
		try
		{
			c[OnDemandOTAStatus.VersionCheckFailure.ordinal()] = 5;
		}
	//* 149  332:goto            104
		catch(NoSuchFieldError nosuchfielderror7) { }
	//  150  335:astore_0        
		try
		{
			c[OnDemandOTAStatus.DeploymentStatusCheckTimedOut.ordinal()] = 6;
		}
	//* 151  336:goto            115
		catch(NoSuchFieldError nosuchfielderror8) { }
	//  152  339:astore_0        
		b = new int[NetworkDiagnosticRoutines.values().length];
		try
		{
			b[NetworkDiagnosticRoutines.InternetConnectivity.ordinal()] = 1;
		}
	//* 153  340:goto            127
		catch(NoSuchFieldError nosuchfielderror9) { }
	//  154  343:astore_0        
		try
		{
			b[NetworkDiagnosticRoutines.MQTTPort.ordinal()] = 2;
		}
	//* 155  344:goto            147
		catch(NoSuchFieldError nosuchfielderror10) { }
	//  156  347:astore_0        
		a = new int[MissionDataState.values().length];
		try
		{
			a[MissionDataState.MissionStatus.ordinal()] = 1;
		}
	//* 157  348:goto            158
		catch(NoSuchFieldError nosuchfielderror11) { }
	//  158  351:astore_0        
		try
		{
			a[MissionDataState.BatteryLevel.ordinal()] = 2;
		}
	//* 159  352:goto            178
		catch(NoSuchFieldError nosuchfielderror12) { }
	//  160  355:astore_0        
		try
		{
			a[MissionDataState.Charging.ordinal()] = 3;
		}
	//* 161  356:goto            189
		catch(NoSuchFieldError nosuchfielderror13) { }
	//  162  359:astore_0        
		try
		{
			a[MissionDataState.Binfull.ordinal()] = 4;
		}
	//* 163  360:goto            200
		catch(NoSuchFieldError nosuchfielderror14) { }
	//  164  363:astore_0        
		try
		{
			a[MissionDataState.TankLow.ordinal()] = 5;
		}
	//* 165  364:goto            211
		catch(NoSuchFieldError nosuchfielderror15) { }
	//  166  367:astore_0        
		try
		{
			a[MissionDataState.PauseExpireTime.ordinal()] = 6;
		}
	//* 167  368:goto            222
		catch(NoSuchFieldError nosuchfielderror16) { }
	//  168  371:astore_0        
		try
		{
			a[MissionDataState.PauseResumeTime.ordinal()] = 7;
		}
	//* 169  372:goto            234
		catch(NoSuchFieldError nosuchfielderror17) { }
	//  170  375:astore_0        
		try
		{
			a[MissionDataState.StatusMessage.ordinal()] = 8;
		}
	//* 171  376:goto            246
		catch(NoSuchFieldError nosuchfielderror18) { }
	//  172  379:astore_0        
		try
		{
			a[MissionDataState.HelpContentId.ordinal()] = 9;
		}
	//* 173  380:goto            258
		catch(NoSuchFieldError nosuchfielderror19) { }
	//  174  383:astore_0        
		try
		{
			a[MissionDataState.HelpContentUrl.ordinal()] = 10;
		}
	//* 175  384:goto            270
		catch(NoSuchFieldError nosuchfielderror20) { }
	//  176  387:astore_0        
		try
		{
			a[MissionDataState.Training.ordinal()] = 11;
		}
	//* 177  388:goto            282
		catch(NoSuchFieldError nosuchfielderror21) { }
	//  178  391:astore_0        
		try
		{
			a[MissionDataState.Invalid.ordinal()] = 12;
		}
	//* 179  392:goto            294
		catch(NoSuchFieldError nosuchfielderror22) { }
	//  180  395:astore_0        
	//* 181  396:return          
	}
}
