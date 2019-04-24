// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import com.irobot.core.*;

// Referenced classes of package com.irobot.home.fragments:
//			MissionAndMapDetailsFragment

static class MissionAndMapDetailsFragment$7
{

	static final int a[];
	static final int b[];
	static final int c[];
	static final int d[];

	static 
	{
		d = new int[AssetNetworkUIServiceDataState.values().length];
	//    0    0:invokestatic    #21  <Method AssetNetworkUIServiceDataState[] AssetNetworkUIServiceDataState.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #23  <Field int[] d>
		try
		{
			d[AssetNetworkUIServiceDataState.RemoteConnectionState.ordinal()] = 1;
	//    4    9:getstatic       #23  <Field int[] d>
	//    5   12:getstatic       #27  <Field AssetNetworkUIServiceDataState AssetNetworkUIServiceDataState.RemoteConnectionState>
	//    6   15:invokevirtual   #31  <Method int AssetNetworkUIServiceDataState.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:invokestatic    #36  <Method SettingType[] SettingType.values()>
	//*  10   23:arraylength     
	//*  11   24:newarray        int[]
	//*  12   26:putstatic       #38  <Field int[] c>
	//*  13   29:getstatic       #38  <Field int[] c>
	//*  14   32:getstatic       #42  <Field SettingType SettingType.Name>
	//*  15   35:invokevirtual   #43  <Method int SettingType.ordinal()>
	//*  16   38:iconst_1        
	//*  17   39:iastore         
	//*  18   40:invokestatic    #48  <Method RobotMissionHistoryCompletionStatus[] RobotMissionHistoryCompletionStatus.values()>
	//*  19   43:arraylength     
	//*  20   44:newarray        int[]
	//*  21   46:putstatic       #50  <Field int[] b>
	//*  22   49:getstatic       #50  <Field int[] b>
	//*  23   52:getstatic       #54  <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.Completed>
	//*  24   55:invokevirtual   #55  <Method int RobotMissionHistoryCompletionStatus.ordinal()>
	//*  25   58:iconst_1        
	//*  26   59:iastore         
	//*  27   60:getstatic       #50  <Field int[] b>
	//*  28   63:getstatic       #58  <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.Canceled>
	//*  29   66:invokevirtual   #55  <Method int RobotMissionHistoryCompletionStatus.ordinal()>
	//*  30   69:iconst_2        
	//*  31   70:iastore         
	//*  32   71:invokestatic    #63  <Method HistoryDataState[] HistoryDataState.values()>
	//*  33   74:arraylength     
	//*  34   75:newarray        int[]
	//*  35   77:putstatic       #65  <Field int[] a>
	//*  36   80:getstatic       #65  <Field int[] a>
	//*  37   83:getstatic       #69  <Field HistoryDataState HistoryDataState.MissionDetailedHistory>
	//*  38   86:invokevirtual   #70  <Method int HistoryDataState.ordinal()>
	//*  39   89:iconst_1        
	//*  40   90:iastore         
	//*  41   91:getstatic       #65  <Field int[] a>
	//*  42   94:getstatic       #73  <Field HistoryDataState HistoryDataState.MissionHistory>
	//*  43   97:invokevirtual   #70  <Method int HistoryDataState.ordinal()>
	//*  44  100:iconst_2        
	//*  45  101:iastore         
	//*  46  102:getstatic       #65  <Field int[] a>
	//*  47  105:getstatic       #76  <Field HistoryDataState HistoryDataState.MissionRuntimeChart>
	//*  48  108:invokevirtual   #70  <Method int HistoryDataState.ordinal()>
	//*  49  111:iconst_3        
	//*  50  112:iastore         
	//*  51  113:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   52  114:astore_0        
		c = new int[SettingType.values().length];
		try
		{
			c[SettingType.Name.ordinal()] = 1;
		}
	//*  53  115:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   54  118:astore_0        
		b = new int[RobotMissionHistoryCompletionStatus.values().length];
		try
		{
			b[RobotMissionHistoryCompletionStatus.Completed.ordinal()] = 1;
		}
	//*  55  119:goto            40
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   56  122:astore_0        
		try
		{
			b[RobotMissionHistoryCompletionStatus.Canceled.ordinal()] = 2;
		}
	//*  57  123:goto            60
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   58  126:astore_0        
		a = new int[HistoryDataState.values().length];
		try
		{
			a[HistoryDataState.MissionDetailedHistory.ordinal()] = 1;
		}
	//*  59  127:goto            71
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   60  130:astore_0        
		try
		{
			a[HistoryDataState.MissionHistory.ordinal()] = 2;
		}
	//*  61  131:goto            91
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   62  134:astore_0        
		try
		{
			a[HistoryDataState.MissionRuntimeChart.ordinal()] = 3;
		}
	//*  63  135:goto            102
		catch(NoSuchFieldError nosuchfielderror6) { }
	//   64  138:astore_0        
	//*  65  139:return          
	}
}
