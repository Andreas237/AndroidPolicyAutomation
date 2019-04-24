// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import com.irobot.core.*;
import com.irobot.home.model.c;
import com.irobot.home.model.g;

// Referenced classes of package com.irobot.home.fragments:
//			k

static class k$8
{

	static final int a[];
	static final int b[];
	static final int c[];
	static final int d[];
	static final int e[];

	static 
	{
		e = new int[MaintenanceDataState.values().length];
	//    0    0:invokestatic    #22  <Method MaintenanceDataState[] MaintenanceDataState.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #24  <Field int[] e>
		try
		{
			e[MaintenanceDataState.BuyPartsWebAddress.ordinal()] = 1;
	//    4    9:getstatic       #24  <Field int[] e>
	//    5   12:getstatic       #28  <Field MaintenanceDataState MaintenanceDataState.BuyPartsWebAddress>
	//    6   15:invokevirtual   #32  <Method int MaintenanceDataState.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:invokestatic    #37  <Method ResolvedMissionStatus[] ResolvedMissionStatus.values()>
	//*  10   23:arraylength     
	//*  11   24:newarray        int[]
	//*  12   26:putstatic       #39  <Field int[] d>
	//*  13   29:getstatic       #39  <Field int[] d>
	//*  14   32:getstatic       #43  <Field ResolvedMissionStatus ResolvedMissionStatus.Idle>
	//*  15   35:invokevirtual   #44  <Method int ResolvedMissionStatus.ordinal()>
	//*  16   38:iconst_1        
	//*  17   39:iastore         
	//*  18   40:getstatic       #39  <Field int[] d>
	//*  19   43:getstatic       #47  <Field ResolvedMissionStatus ResolvedMissionStatus.MissionStarting>
	//*  20   46:invokevirtual   #44  <Method int ResolvedMissionStatus.ordinal()>
	//*  21   49:iconst_2        
	//*  22   50:iastore         
	//*  23   51:getstatic       #39  <Field int[] d>
	//*  24   54:getstatic       #50  <Field ResolvedMissionStatus ResolvedMissionStatus.MissionStopping>
	//*  25   57:invokevirtual   #44  <Method int ResolvedMissionStatus.ordinal()>
	//*  26   60:iconst_3        
	//*  27   61:iastore         
	//*  28   62:getstatic       #39  <Field int[] d>
	//*  29   65:getstatic       #53  <Field ResolvedMissionStatus ResolvedMissionStatus.InMission>
	//*  30   68:invokevirtual   #44  <Method int ResolvedMissionStatus.ordinal()>
	//*  31   71:iconst_4        
	//*  32   72:iastore         
	//*  33   73:invokestatic    #58  <Method RobotPadCategory[] RobotPadCategory.values()>
	//*  34   76:arraylength     
	//*  35   77:newarray        int[]
	//*  36   79:putstatic       #60  <Field int[] c>
	//*  37   82:getstatic       #60  <Field int[] c>
	//*  38   85:getstatic       #64  <Field RobotPadCategory RobotPadCategory.Wet>
	//*  39   88:invokevirtual   #65  <Method int RobotPadCategory.ordinal()>
	//*  40   91:iconst_1        
	//*  41   92:iastore         
	//*  42   93:getstatic       #60  <Field int[] c>
	//*  43   96:getstatic       #68  <Field RobotPadCategory RobotPadCategory.Dry>
	//*  44   99:invokevirtual   #65  <Method int RobotPadCategory.ordinal()>
	//*  45  102:iconst_2        
	//*  46  103:iastore         
	//*  47  104:getstatic       #60  <Field int[] c>
	//*  48  107:getstatic       #71  <Field RobotPadCategory RobotPadCategory.Damp>
	//*  49  110:invokevirtual   #65  <Method int RobotPadCategory.ordinal()>
	//*  50  113:iconst_3        
	//*  51  114:iastore         
	//*  52  115:getstatic       #60  <Field int[] c>
	//*  53  118:getstatic       #74  <Field RobotPadCategory RobotPadCategory.ReusableWet>
	//*  54  121:invokevirtual   #65  <Method int RobotPadCategory.ordinal()>
	//*  55  124:iconst_4        
	//*  56  125:iastore         
	//*  57  126:getstatic       #60  <Field int[] c>
	//*  58  129:getstatic       #77  <Field RobotPadCategory RobotPadCategory.ReusableDamp>
	//*  59  132:invokevirtual   #65  <Method int RobotPadCategory.ordinal()>
	//*  60  135:iconst_5        
	//*  61  136:iastore         
	//*  62  137:getstatic       #60  <Field int[] c>
	//*  63  140:getstatic       #80  <Field RobotPadCategory RobotPadCategory.ReusableDry>
	//*  64  143:invokevirtual   #65  <Method int RobotPadCategory.ordinal()>
	//*  65  146:bipush          6
	//*  66  148:iastore         
	//*  67  149:getstatic       #60  <Field int[] c>
	//*  68  152:getstatic       #83  <Field RobotPadCategory RobotPadCategory.NoPad>
	//*  69  155:invokevirtual   #65  <Method int RobotPadCategory.ordinal()>
	//*  70  158:bipush          7
	//*  71  160:iastore         
	//*  72  161:invokestatic    #88  <Method g[] g.values()>
	//*  73  164:arraylength     
	//*  74  165:newarray        int[]
	//*  75  167:putstatic       #90  <Field int[] b>
	//*  76  170:getstatic       #90  <Field int[] b>
	//*  77  173:getstatic       #94  <Field g g.ENABLED>
	//*  78  176:invokevirtual   #95  <Method int g.ordinal()>
	//*  79  179:iconst_1        
	//*  80  180:iastore         
	//*  81  181:getstatic       #90  <Field int[] b>
	//*  82  184:getstatic       #98  <Field g g.DISABLED>
	//*  83  187:invokevirtual   #95  <Method int g.ordinal()>
	//*  84  190:iconst_2        
	//*  85  191:iastore         
	//*  86  192:getstatic       #90  <Field int[] b>
	//*  87  195:getstatic       #101 <Field g g.UNKNOWN>
	//*  88  198:invokevirtual   #95  <Method int g.ordinal()>
	//*  89  201:iconst_3        
	//*  90  202:iastore         
	//*  91  203:invokestatic    #106 <Method c[] c.values()>
	//*  92  206:arraylength     
	//*  93  207:newarray        int[]
	//*  94  209:putstatic       #108 <Field int[] a>
	//*  95  212:getstatic       #108 <Field int[] a>
	//*  96  215:getstatic       #112 <Field c c.READY>
	//*  97  218:invokevirtual   #113 <Method int c.ordinal()>
	//*  98  221:iconst_1        
	//*  99  222:iastore         
	//* 100  223:getstatic       #108 <Field int[] a>
	//* 101  226:getstatic       #116 <Field c c.CLEAN_STARTING>
	//* 102  229:invokevirtual   #113 <Method int c.ordinal()>
	//* 103  232:iconst_2        
	//* 104  233:iastore         
	//* 105  234:getstatic       #108 <Field int[] a>
	//* 106  237:getstatic       #119 <Field c c.CLEAN_STOPPING>
	//* 107  240:invokevirtual   #113 <Method int c.ordinal()>
	//* 108  243:iconst_3        
	//* 109  244:iastore         
	//* 110  245:getstatic       #108 <Field int[] a>
	//* 111  248:getstatic       #122 <Field c c.CLEANING>
	//* 112  251:invokevirtual   #113 <Method int c.ordinal()>
	//* 113  254:iconst_4        
	//* 114  255:iastore         
	//* 115  256:getstatic       #108 <Field int[] a>
	//* 116  259:getstatic       #124 <Field c c.UNKNOWN>
	//* 117  262:invokevirtual   #113 <Method int c.ordinal()>
	//* 118  265:iconst_5        
	//* 119  266:iastore         
	//* 120  267:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//  121  268:astore_0        
		d = new int[ResolvedMissionStatus.values().length];
		try
		{
			d[ResolvedMissionStatus.Idle.ordinal()] = 1;
		}
	//* 122  269:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//  123  272:astore_0        
		try
		{
			d[ResolvedMissionStatus.MissionStarting.ordinal()] = 2;
		}
	//* 124  273:goto            40
		catch(NoSuchFieldError nosuchfielderror2) { }
	//  125  276:astore_0        
		try
		{
			d[ResolvedMissionStatus.MissionStopping.ordinal()] = 3;
		}
	//* 126  277:goto            51
		catch(NoSuchFieldError nosuchfielderror3) { }
	//  127  280:astore_0        
		try
		{
			d[ResolvedMissionStatus.InMission.ordinal()] = 4;
		}
	//* 128  281:goto            62
		catch(NoSuchFieldError nosuchfielderror4) { }
	//  129  284:astore_0        
		c = new int[RobotPadCategory.values().length];
		try
		{
			c[RobotPadCategory.Wet.ordinal()] = 1;
		}
	//* 130  285:goto            73
		catch(NoSuchFieldError nosuchfielderror5) { }
	//  131  288:astore_0        
		try
		{
			c[RobotPadCategory.Dry.ordinal()] = 2;
		}
	//* 132  289:goto            93
		catch(NoSuchFieldError nosuchfielderror6) { }
	//  133  292:astore_0        
		try
		{
			c[RobotPadCategory.Damp.ordinal()] = 3;
		}
	//* 134  293:goto            104
		catch(NoSuchFieldError nosuchfielderror7) { }
	//  135  296:astore_0        
		try
		{
			c[RobotPadCategory.ReusableWet.ordinal()] = 4;
		}
	//* 136  297:goto            115
		catch(NoSuchFieldError nosuchfielderror8) { }
	//  137  300:astore_0        
		try
		{
			c[RobotPadCategory.ReusableDamp.ordinal()] = 5;
		}
	//* 138  301:goto            126
		catch(NoSuchFieldError nosuchfielderror9) { }
	//  139  304:astore_0        
		try
		{
			c[RobotPadCategory.ReusableDry.ordinal()] = 6;
		}
	//* 140  305:goto            137
		catch(NoSuchFieldError nosuchfielderror10) { }
	//  141  308:astore_0        
		try
		{
			c[RobotPadCategory.NoPad.ordinal()] = 7;
		}
	//* 142  309:goto            149
		catch(NoSuchFieldError nosuchfielderror11) { }
	//  143  312:astore_0        
		b = new int[g.values().length];
		try
		{
			b[g.ENABLED.ordinal()] = 1;
		}
	//* 144  313:goto            161
		catch(NoSuchFieldError nosuchfielderror12) { }
	//  145  316:astore_0        
		try
		{
			b[g.DISABLED.ordinal()] = 2;
		}
	//* 146  317:goto            181
		catch(NoSuchFieldError nosuchfielderror13) { }
	//  147  320:astore_0        
		try
		{
			b[g.UNKNOWN.ordinal()] = 3;
		}
	//* 148  321:goto            192
		catch(NoSuchFieldError nosuchfielderror14) { }
	//  149  324:astore_0        
		a = new int[com.irobot.home.model.c.values().length];
		try
		{
			a[c.READY.ordinal()] = 1;
		}
	//* 150  325:goto            203
		catch(NoSuchFieldError nosuchfielderror15) { }
	//  151  328:astore_0        
		try
		{
			a[c.CLEAN_STARTING.ordinal()] = 2;
		}
	//* 152  329:goto            223
		catch(NoSuchFieldError nosuchfielderror16) { }
	//  153  332:astore_0        
		try
		{
			a[c.CLEAN_STOPPING.ordinal()] = 3;
		}
	//* 154  333:goto            234
		catch(NoSuchFieldError nosuchfielderror17) { }
	//  155  336:astore_0        
		try
		{
			a[c.CLEANING.ordinal()] = 4;
		}
	//* 156  337:goto            245
		catch(NoSuchFieldError nosuchfielderror18) { }
	//  157  340:astore_0        
		try
		{
			a[c.UNKNOWN.ordinal()] = 5;
		}
	//* 158  341:goto            256
		catch(NoSuchFieldError nosuchfielderror19) { }
	//  159  344:astore_0        
	//* 160  345:return          
	}
}
