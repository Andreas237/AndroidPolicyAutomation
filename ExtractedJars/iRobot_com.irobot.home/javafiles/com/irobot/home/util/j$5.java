// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.util;

import com.irobot.core.RobotMissionHistoryCompletionStatus;
import com.irobot.core.SkuType;

// Referenced classes of package com.irobot.home.util:
//			j

static class j$5
{

	static final int a[];
	static final int b[];

	static 
	{
		b = new int[RobotMissionHistoryCompletionStatus.values().length];
	//    0    0:invokestatic    #19  <Method RobotMissionHistoryCompletionStatus[] RobotMissionHistoryCompletionStatus.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #21  <Field int[] b>
		try
		{
			b[RobotMissionHistoryCompletionStatus.None.ordinal()] = 1;
	//    4    9:getstatic       #21  <Field int[] b>
	//    5   12:getstatic       #25  <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.None>
	//    6   15:invokevirtual   #29  <Method int RobotMissionHistoryCompletionStatus.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #21  <Field int[] b>
	//*  10   23:getstatic       #32  <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.Busy>
	//*  11   26:invokevirtual   #29  <Method int RobotMissionHistoryCompletionStatus.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #21  <Field int[] b>
	//*  15   34:getstatic       #35  <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.Completed>
	//*  16   37:invokevirtual   #29  <Method int RobotMissionHistoryCompletionStatus.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #21  <Field int[] b>
	//*  20   45:getstatic       #38  <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.Full>
	//*  21   48:invokevirtual   #29  <Method int RobotMissionHistoryCompletionStatus.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:getstatic       #21  <Field int[] b>
	//*  25   56:getstatic       #41  <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.Stuck>
	//*  26   59:invokevirtual   #29  <Method int RobotMissionHistoryCompletionStatus.ordinal()>
	//*  27   62:iconst_5        
	//*  28   63:iastore         
	//*  29   64:getstatic       #21  <Field int[] b>
	//*  30   67:getstatic       #44  <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.LowBattery>
	//*  31   70:invokevirtual   #29  <Method int RobotMissionHistoryCompletionStatus.ordinal()>
	//*  32   73:bipush          6
	//*  33   75:iastore         
	//*  34   76:getstatic       #21  <Field int[] b>
	//*  35   79:getstatic       #47  <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.Canceled>
	//*  36   82:invokevirtual   #29  <Method int RobotMissionHistoryCompletionStatus.ordinal()>
	//*  37   85:bipush          7
	//*  38   87:iastore         
	//*  39   88:getstatic       #21  <Field int[] b>
	//*  40   91:getstatic       #50  <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.ClockError>
	//*  41   94:invokevirtual   #29  <Method int RobotMissionHistoryCompletionStatus.ordinal()>
	//*  42   97:bipush          8
	//*  43   99:iastore         
	//*  44  100:getstatic       #21  <Field int[] b>
	//*  45  103:getstatic       #53  <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.Incomplete>
	//*  46  106:invokevirtual   #29  <Method int RobotMissionHistoryCompletionStatus.ordinal()>
	//*  47  109:bipush          9
	//*  48  111:iastore         
	//*  49  112:getstatic       #21  <Field int[] b>
	//*  50  115:getstatic       #56  <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.Empty>
	//*  51  118:invokevirtual   #29  <Method int RobotMissionHistoryCompletionStatus.ordinal()>
	//*  52  121:bipush          10
	//*  53  123:iastore         
	//*  54  124:invokestatic    #61  <Method SkuType[] SkuType.values()>
	//*  55  127:arraylength     
	//*  56  128:newarray        int[]
	//*  57  130:putstatic       #63  <Field int[] a>
	//*  58  133:getstatic       #63  <Field int[] a>
	//*  59  136:getstatic       #67  <Field SkuType SkuType.SanMarino>
	//*  60  139:invokevirtual   #68  <Method int SkuType.ordinal()>
	//*  61  142:iconst_1        
	//*  62  143:iastore         
	//*  63  144:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   64  145:astore_0        
		try
		{
			b[RobotMissionHistoryCompletionStatus.Busy.ordinal()] = 2;
		}
	//*  65  146:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   66  149:astore_0        
		try
		{
			b[RobotMissionHistoryCompletionStatus.Completed.ordinal()] = 3;
		}
	//*  67  150:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   68  153:astore_0        
		try
		{
			b[RobotMissionHistoryCompletionStatus.Full.ordinal()] = 4;
		}
	//*  69  154:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   70  157:astore_0        
		try
		{
			b[RobotMissionHistoryCompletionStatus.Stuck.ordinal()] = 5;
		}
	//*  71  158:goto            53
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   72  161:astore_0        
		try
		{
			b[RobotMissionHistoryCompletionStatus.LowBattery.ordinal()] = 6;
		}
	//*  73  162:goto            64
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   74  165:astore_0        
		try
		{
			b[RobotMissionHistoryCompletionStatus.Canceled.ordinal()] = 7;
		}
	//*  75  166:goto            76
		catch(NoSuchFieldError nosuchfielderror6) { }
	//   76  169:astore_0        
		try
		{
			b[RobotMissionHistoryCompletionStatus.ClockError.ordinal()] = 8;
		}
	//*  77  170:goto            88
		catch(NoSuchFieldError nosuchfielderror7) { }
	//   78  173:astore_0        
		try
		{
			b[RobotMissionHistoryCompletionStatus.Incomplete.ordinal()] = 9;
		}
	//*  79  174:goto            100
		catch(NoSuchFieldError nosuchfielderror8) { }
	//   80  177:astore_0        
		try
		{
			b[RobotMissionHistoryCompletionStatus.Empty.ordinal()] = 10;
		}
	//*  81  178:goto            112
		catch(NoSuchFieldError nosuchfielderror9) { }
	//   82  181:astore_0        
		a = new int[SkuType.values().length];
		try
		{
			a[SkuType.SanMarino.ordinal()] = 1;
		}
	//*  83  182:goto            124
		catch(NoSuchFieldError nosuchfielderror10) { }
	//   84  185:astore_0        
	//*  85  186:return          
	}
}
