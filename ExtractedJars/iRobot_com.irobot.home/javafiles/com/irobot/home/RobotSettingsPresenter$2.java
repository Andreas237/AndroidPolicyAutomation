// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.HistoryDataState;
import com.irobot.core.SettingType;

// Referenced classes of package com.irobot.home:
//			RobotSettingsPresenter

static class RobotSettingsPresenter$2
{

	static final int a[];
	static final int b[];

	static 
	{
		b = new int[SettingType.values().length];
	//    0    0:invokestatic    #19  <Method SettingType[] SettingType.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #21  <Field int[] b>
		try
		{
			b[SettingType.PauseOnBinFull.ordinal()] = 1;
	//    4    9:getstatic       #21  <Field int[] b>
	//    5   12:getstatic       #25  <Field SettingType SettingType.PauseOnBinFull>
	//    6   15:invokevirtual   #29  <Method int SettingType.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #21  <Field int[] b>
	//*  10   23:getstatic       #32  <Field SettingType SettingType.MapUploadAllowed>
	//*  11   26:invokevirtual   #29  <Method int SettingType.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:invokestatic    #37  <Method HistoryDataState[] HistoryDataState.values()>
	//*  15   34:arraylength     
	//*  16   35:newarray        int[]
	//*  17   37:putstatic       #39  <Field int[] a>
	//*  18   40:getstatic       #39  <Field int[] a>
	//*  19   43:getstatic       #43  <Field HistoryDataState HistoryDataState.DockEvacuation>
	//*  20   46:invokevirtual   #44  <Method int HistoryDataState.ordinal()>
	//*  21   49:iconst_1        
	//*  22   50:iastore         
	//*  23   51:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   24   52:astore_0        
		try
		{
			b[SettingType.MapUploadAllowed.ordinal()] = 2;
		}
	//*  25   53:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   26   56:astore_0        
		a = new int[HistoryDataState.values().length];
		try
		{
			a[HistoryDataState.DockEvacuation.ordinal()] = 1;
		}
	//*  27   57:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   28   60:astore_0        
	//*  29   61:return          
	}
}
