// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.HistoryDataState;

// Referenced classes of package com.irobot.home:
//			HistoryActivity

static class HistoryActivity$3
{

	static final int a[];

	static 
	{
		a = new int[HistoryDataState.values().length];
	//    0    0:invokestatic    #18  <Method HistoryDataState[] HistoryDataState.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] a>
		try
		{
			a[HistoryDataState.MissionHistory.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] a>
	//    5   12:getstatic       #24  <Field HistoryDataState HistoryDataState.MissionHistory>
	//    6   15:invokevirtual   #28  <Method int HistoryDataState.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
	//    9   20:return          
		}
		catch(NoSuchFieldError nosuchfielderror) { }
	//   10   21:astore_0        
	//*  11   22:return          
	}
}
